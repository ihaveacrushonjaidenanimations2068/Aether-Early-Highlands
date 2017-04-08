package com.gildedgames.aether.client.gui.container.simple_crafting;

import com.gildedgames.aether.api.AetherAPI;
import com.gildedgames.aether.api.registry.simple_crafting.ISimpleRecipe;
import com.gildedgames.aether.api.registry.simple_crafting.ISimpleRecipeGroup;
import com.gildedgames.aether.client.gui.IExtendedGui;
import com.gildedgames.aether.common.AetherCore;
import com.gildedgames.aether.common.containers.ContainerMasonryBench;
import com.gildedgames.aether.common.network.NetworkingAether;
import com.gildedgames.aether.common.network.packets.MasonryRecipeChangedPacket;
import com.gildedgames.aether.common.recipes.simple.OreDictionaryRequirement;
import com.gildedgames.aether.common.util.helpers.RecipeUtil;
import com.google.common.collect.Lists;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.client.config.GuiUtils;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.input.Mouse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SideOnly(Side.CLIENT)
public class GuiMasonryBench extends GuiContainer implements IExtendedGui
{

	private static final ResourceLocation MASONRY_BENCH = AetherCore.getResource("textures/gui/inventory/masonry_bench.png");

	private static final ResourceLocation BOOK_SCROLL_BAR = AetherCore.getResource("textures/gui/inventory/book_scroll_bar.png");

	private static final ResourceLocation BOOK_RECIPES = AetherCore.getResource("textures/gui/inventory/book_recipes.png");

	private static final ResourceLocation DARK_CRAFTING_OVERLAY = AetherCore.getResource("textures/gui/inventory/dark_crafting_overlay.png");

	/** Amount scrolled in crafting options inventory (0 = top, 1 = bottom) */
	private float currentScroll;

	/** True if the scrollbar is being dragged */
	private boolean isScrolling;

	/** True if the left mouse button was held down last time drawScreen was called. */
	private boolean wasClicking;

	/** The player inventory bound to this GUI. */
	private final InventoryPlayer playerInventory;

	public List<ISimpleRecipe> recipes = Lists.newArrayList();

	private final List<GuiCraftingOption> options = new ArrayList<>(24);

	private final List<GuiRequiredMaterial> materials = new ArrayList<>(9);

	private GuiRequiredMaterial result;

	private ISimpleRecipe currentRecipe;

	public List<String> hoverDescription;

	private GuiXButton xButton;

	private ItemStack lastStack;

	public GuiMasonryBench(EntityPlayer player, BlockPos blockPosition)
	{
		super(new ContainerMasonryBench(player, blockPosition));

		this.playerInventory = player.inventory;
		this.allowUserInput = true;
	}

	@Override
	protected void mouseReleased(int mouseX, int mouseY, int state)
	{
		super.mouseReleased(mouseX, mouseY, state);

		if ((this.lastStack == ItemStack.EMPTY && this.playerInventory.getItemStack() != ItemStack.EMPTY) || (this.lastStack != ItemStack.EMPTY
				&& this.playerInventory.getItemStack() == ItemStack.EMPTY))
		{
			this.updateCraftingOptions();
		}

		this.lastStack = this.playerInventory.getItemStack();
	}

	@Override
	protected void handleMouseClick(Slot slotIn, int slotId, int mouseButton, ClickType type)
	{
		super.handleMouseClick(slotIn, slotId, mouseButton, type);

		if (slotIn != null && (slotIn.getHasStack() || this.playerInventory.getItemStack() != ItemStack.EMPTY))
		{
			this.updateCraftingOptions();
		}
	}

	@Override
	protected void actionPerformed(GuiButton button) throws IOException
	{
		if (button.id == 31)
		{
			this.currentRecipe = null;

			ContainerMasonryBench container = (ContainerMasonryBench) this.inventorySlots;
			container.onNewRecipe(null);
			NetworkingAether.sendPacketToServer(new MasonryRecipeChangedPacket(null));

			for (int i = 0; i < 9; i++)
			{
				this.materials.get(i).setRequiredObject(null);
			}
		}

		if (button instanceof GuiCraftingOption)
		{
			GuiCraftingOption option = (GuiCraftingOption) button;

			if (option.getRecipe() != null)
			{
				for (int k = 0; k < 3; ++k)
				{
					for (int l = 0; l < 3; ++l)
					{
						int index = l + k * 3;

						if (index >= 0 && index < option.getRecipe().getRequired().length)
						{
							Object req = option.getRecipe().getRequired()[index];

							if (req instanceof ItemStack)
							{
								this.materials.get(index).setRequiredObject(req);
							}
							else if (req instanceof OreDictionaryRequirement)
							{
								OreDictionaryRequirement oreReq = (OreDictionaryRequirement) req;

								this.materials.get(index).setRequiredObject(oreReq);
							}
						}
						else
						{
							this.materials.get(index).setRequiredObject(null);
						}
					}
				}

				this.currentRecipe = option.getRecipe();

				ContainerMasonryBench container = (ContainerMasonryBench) this.inventorySlots;

				container.onNewRecipe(this.currentRecipe);

				NetworkingAether.sendPacketToServer(new MasonryRecipeChangedPacket(this.currentRecipe));

				if (!RecipeUtil.canCraft(Minecraft.getMinecraft().player, option.getRecipe()) && option.getRecipe() != null)
				{
					this.result.setRequiredObject(option.getRecipe().getResult());
				}
				else
				{
					this.result.setRequiredObject(null);
				}
			}
		}
	}

	public void scrollTo(float p_148329_1_)
	{
		int i = (this.recipes.size() + 4 - 1) / 4 - 6;
		int j = (int) ((double) (p_148329_1_ * (float) i) + 0.5D);

		if (j < 0)
		{
			j = 0;
		}

		for (int k = 0; k < 6; ++k)
		{
			for (int l = 0; l < 4; ++l)
			{
				int i1 = l + (k + j) * 4;

				if (i1 >= 0 && i1 < this.recipes.size())
				{
					this.options.get(l + k * 4).setRecipe(this.recipes.get(i1));
				}
				else
				{
					this.options.get(l + k * 4).setRecipe(null);
				}
			}
		}
	}

	public boolean canScroll()
	{
		return this.recipes.size() > this.options.size();
	}

	private void updateCraftingOptions()
	{
		this.recipes.clear();

		List<ItemStack> uniqueStacks = Lists.newArrayList();

		outerloop:
		for (ItemStack stack : this.playerInventory.mainInventory)
		{
			for (ItemStack uniqueStack : uniqueStacks)
			{
				if (RecipeUtil.areEqual(stack, uniqueStack))
				{
					continue outerloop;
				}
			}

			if (stack != ItemStack.EMPTY)
			{
				uniqueStacks.add(stack);
			}
		}

		for (ItemStack stack : uniqueStacks)
		{
			ISimpleRecipeGroup[] groups = AetherAPI.masonry().getRecipesFromRequirement(stack);

			for (ISimpleRecipeGroup group : groups)
			{
				if (group != null)
				{
					outer:
					for (ISimpleRecipe recipe : group.getRecipes())
					{
						for (ISimpleRecipe r : this.recipes) //TODO: Shouldn't be returning duplicate recipes..
						{
							if (r.equals(recipe))
							{
								continue outer;
							}
						}

						this.recipes.add(recipe);
					}
				}
			}
		}

		EntityPlayer p = Minecraft.getMinecraft().player;

		this.recipes.sort((o1, o2) ->
		{
			int countO1 = RecipeUtil.getTotalTimesCanCraft(p, o1);
			int countO2 = RecipeUtil.getTotalTimesCanCraft(p, o2);

			int id1 = Item.getIdFromItem(o1.getResult().getItem());
			int id2 = Item.getIdFromItem(o2.getResult().getItem());

			if (countO1 > 0 && countO2 <= 0)
			{
				return 1;
			}

			if (countO2 > 0 && countO1 <= 0)
			{
				return -1;
			}

			if (id1 > id2)
			{
				return 1;
			}

			if (id1 < id2)
			{
				return -1;
			}

			return 0;
		});

		Collections.reverse(this.recipes);

		this.currentScroll = 0.0F;
		this.scrollTo(0.0F);
	}

	@Override
	public void initGui()
	{
		super.initGui();

		this.ySize = 170;

		this.guiLeft = 30 + ((this.width - this.xSize) / 2);
		this.guiTop = ((this.height - this.ySize) / 2);

		for (int i = 0; i < 6; ++i)
		{
			for (int j = 0; j < 4; ++j)
			{
				GuiCraftingOption option = new GuiCraftingOption(
						j + i * 4, this.guiLeft - 126 + (j * 18), this.guiTop + (21 + i * 18), null);

				this.buttonList.add(option);
				this.options.add(j + i * 4, option);
			}
		}

		for (int i = 0; i < 3; ++i)
		{
			for (int j = 0; j < 3; ++j)
			{
				GuiRequiredMaterial material = new GuiRequiredMaterial(
						20 + (j + i * 3), this.guiLeft + 79 + (j * 18), this.guiTop + (17 + i * 18), null);

				material.resultStack = true;

				if (this.currentRecipe != null && j + i * 3 < this.currentRecipe.getRequired().length)
				{
					Object req = this.currentRecipe.getRequired()[j + i * 3];

					if (req instanceof ItemStack)
					{
						material.setRequiredObject(req);
					}
					else if (req instanceof OreDictionaryRequirement)
					{
						OreDictionaryRequirement oreReq = (OreDictionaryRequirement) req;

						material.setRequiredObject(oreReq);
					}
				}

				this.buttonList.add(material);
				this.materials.add(j + i * 3, material);
			}
		}

		this.result = new GuiRequiredMaterial(30, this.guiLeft + 79, this.guiTop + 51, null);
		this.result.resultStack = true;

		this.buttonList.add(this.result);

		this.xButton = new GuiXButton(31, this.guiLeft + 66, this.guiTop + 17);
		this.xButton.visible = false;

		this.buttonList.add(this.xButton);

		this.updateCraftingOptions();
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks)
	{
		if (this.currentRecipe != null)
		{
			if (!RecipeUtil.areEqual(this.result.getRequiredObject(), this.currentRecipe.getResult())
					&& !RecipeUtil.canCraft(Minecraft.getMinecraft().player, this.currentRecipe))
			{
				this.result.setRequiredObject(this.currentRecipe.getResult());
			}
		}
		else
		{
			this.result.setRequiredObject(null);
		}

		boolean flag = Mouse.isButtonDown(0);
		int i = this.guiLeft;
		int j = this.guiTop;
		int k = i - 48;
		int l = j + 22;
		int i1 = k + 14;
		int j1 = l + 108;

		if (!this.wasClicking && flag && mouseX >= k && mouseY >= l && mouseX < i1 && mouseY < j1)
		{
			this.isScrolling = this.needsScrollBars();
		}

		if (!flag)
		{
			this.isScrolling = false;
		}

		this.wasClicking = flag;

		if (this.isScrolling)
		{
			this.currentScroll = ((float) (mouseY - l) - 7.5F) / ((float) (j1 - l) - 15.0F);
			this.currentScroll = MathHelper.clamp(this.currentScroll, 0.0F, 1.0F);

			this.scrollTo(this.currentScroll);
		}

		super.drawScreen(mouseX, mouseY, partialTicks);

		if (this.hoverDescription != null && this.hoverDescription.size() > 0)
		{
			GuiUtils.drawHoveringText(this.hoverDescription, mouseX, mouseY, this.width, this.height, -1, this.fontRenderer);
		}

		this.hoverDescription = null;
	}

	/**
	 * Draw the foreground layer for the GuiContainer (everything in front of the items)
	 */
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
	{
		String name = I18n.format("container.masonry_bench");

		this.fontRenderer.drawString(name, 88 - (this.fontRenderer.getStringWidth(name) / 2), 6, 4210752);
		this.fontRenderer.drawString(I18n.format("container.inventory"), 8, this.ySize - 96 + 2, 4210752);

		this.fontRenderer.drawString("Recipes", -126, 7, 4210752);
	}

	/**
	 * Draws the background layer of this container (behind the items).
	 */
	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
	{
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);

		this.mc.getTextureManager().bindTexture(BOOK_RECIPES);
		int x = this.guiLeft - 150;
		int z = this.guiTop - 5;
		this.drawTexturedModalRect(x, z, 0, 0, 246, 178);

		this.mc.getTextureManager().bindTexture(MASONRY_BENCH);
		x = ((this.width - this.xSize) / 2) + 30;
		z = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(x, z, 0, 0, this.xSize, this.ySize);

		int i = this.guiLeft - 48;
		int j = this.guiTop + 22;
		int k = j + 108;
		this.mc.getTextureManager().bindTexture(BOOK_SCROLL_BAR);

		this.drawTexturedModalRect(i,
				j + (int) ((float) (k - j - 17) * this.currentScroll), 232 + (this.needsScrollBars() ? 0 : 12), 0, 12, 15);

		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		GlStateManager.disableLighting();

		this.xButton.visible = this.currentRecipe != null;

		if (this.recipes.size() <= 0)
		{
			this.mc.getTextureManager().bindTexture(DARK_CRAFTING_OVERLAY);

			GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);

			GlStateManager.enableBlend();
			GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
			GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);

			Gui.drawModalRectWithCustomSizedTexture(this.guiLeft - 126, this.guiTop + 21, 0, 0, 72, 108, 72, 126);

			this.drawCenteredString(Minecraft.getMinecraft().fontRenderer, "Nothing left",
					this.guiLeft - 90, this.guiTop + 47, 0xFFFFFF);
			this.drawCenteredString(Minecraft.getMinecraft().fontRenderer, "to craft!", this.guiLeft - 90, this.guiTop + 57, 0xFFFFFF);
		}
	}

	private boolean needsScrollBars()
	{
		return this.canScroll();
	}

	@Override
	public void handleMouseInput() throws IOException
	{
		super.handleMouseInput();
		int i = Mouse.getEventDWheel();

		if (i != 0 && this.needsScrollBars())
		{
			int j = (this.recipes.size() + 4 - 1) / 4 - 6;

			if (i > 0)
			{
				i = 1;
			}

			if (i < 0)
			{
				i = -1;
			}

			this.currentScroll = (float) ((double) this.currentScroll - (double) i / (double) j);
			this.currentScroll = MathHelper.clamp(this.currentScroll, 0.0F, 1.0F);

			this.scrollTo(this.currentScroll);
		}
	}

	@Override
	public void setHoveredDescription(List<String> desc)
	{
		this.hoverDescription = desc;
	}

	@Override
	public List<String> getHoveredDescription()
	{
		return this.hoverDescription;
	}

}
