package com.gildedgames.aether.client.models.entities.living;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelDetonationSentry - Either Mojang or a mod author
 * Created using Tabula 6.0.0
 */
public class ModelDetonationSentry extends ModelBase {
    public ModelRenderer body_crest_left_top;
    public ModelRenderer body_main_jaw_left;
    public ModelRenderer body_bomb_main;
    public ModelRenderer body_bomb_right_corner_bottom;
    public ModelRenderer body_bomb_left_corner_front;
    public ModelRenderer body_crest_top;
    public ModelRenderer body_main_back;
    public ModelRenderer body_main_top;
    public ModelRenderer body_main_bottom;
    public ModelRenderer body_bomb_left_corner_top;
    public ModelRenderer body_bomb_right_corner_back;
    public ModelRenderer body_crest_right_top;
    public ModelRenderer body_eye;
    public ModelRenderer body_bomb_right_cap;
    public ModelRenderer body_crest_left_bottom;
    public ModelRenderer body_crest_right_bottom;
    public ModelRenderer body_main_jaw_right;
    public ModelRenderer body_main;
    public ModelRenderer body_jaw_mid;
    public ModelRenderer body_bomb_right_corner_front;
    public ModelRenderer body_bomb_left_cap;
    public ModelRenderer body_bomb_right_corner_top;
    public ModelRenderer body_bomb_left_corner_bottom;
    public ModelRenderer body_bomb_left_corner_back;

    public ModelDetonationSentry() {
        this.textureWidth = 256;
        this.textureHeight = 256;
        this.body_bomb_right_corner_bottom = new ModelRenderer(this, 0, 74);
        this.body_bomb_right_corner_bottom.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_bomb_right_corner_bottom.addBox(0.0F, 20.0F, 0.5F, 6, 4, 3, 0.0F);
        this.setRotateAngle(body_bomb_right_corner_bottom, 0.0F, 0.0F, 0.5235987755982988F);
        this.body_main_jaw_right = new ModelRenderer(this, 65, 90);
        this.body_main_jaw_right.setRotationPoint(-6.0F, 18.0F, -8.0F);
        this.body_main_jaw_right.addBox(-1.0F, -2.0F, -1.0F, 3, 6, 3, 0.0F);
        this.setRotateAngle(body_main_jaw_right, 0.08726646259971647F, 0.3490658503988659F, -0.5235987755982988F);
        this.body_bomb_right_cap = new ModelRenderer(this, 30, 70);
        this.body_bomb_right_cap.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_bomb_right_cap.addBox(-11.0F, 9.4F, -12.5F, 1, 6, 6, 0.0F);
        this.setRotateAngle(body_bomb_right_cap, 0.7853981633974483F, 0.0F, 0.0F);
        this.body_crest_left_bottom = new ModelRenderer(this, 53, 3);
        this.body_crest_left_bottom.setRotationPoint(6.0F, 18.0F, -8.0F);
        this.body_crest_left_bottom.addBox(-0.5F, -2.5F, -0.5F, 6, 8, 2, 0.0F);
        this.setRotateAngle(body_crest_left_bottom, 0.0F, -0.3490658503988659F, 0.0F);
        this.body_bomb_right_corner_back = new ModelRenderer(this, 37, 113);
        this.body_bomb_right_corner_back.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_bomb_right_corner_back.addBox(-6.5F, 14.0F, 8.5F, 6, 3, 4, 0.0F);
        this.setRotateAngle(body_bomb_right_corner_back, 0.0F, -0.5235987755982988F, 0.0F);
        this.body_main = new ModelRenderer(this, 62, 105);
        this.body_main.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_main.addBox(-6.0F, 13.0F, -6.0F, 12, 8, 15, 0.0F);
        this.body_crest_right_bottom = new ModelRenderer(this, 38, 87);
        this.body_crest_right_bottom.setRotationPoint(-6.0F, 18.0F, -8.0F);
        this.body_crest_right_bottom.addBox(-0.5F, -2.5F, -1.5F, 6, 8, 2, 0.0F);
        this.setRotateAngle(body_crest_right_bottom, 0.0F, -2.792526803190927F, 0.0F);
        this.body_bomb_right_corner_front = new ModelRenderer(this, 29, 8);
        this.body_bomb_right_corner_front.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_bomb_right_corner_front.addBox(-8.5F, 14.0F, -9.0F, 6, 3, 4, 0.0F);
        this.setRotateAngle(body_bomb_right_corner_front, 0.0F, 0.5235987755982988F, 0.0F);
        this.body_crest_top = new ModelRenderer(this, 0, 95);
        this.body_crest_top.setRotationPoint(0.0F, 12.0F, -8.0F);
        this.body_crest_top.addBox(-4.5F, -2.0F, -1.0F, 9, 3, 8, 0.0F);
        this.setRotateAngle(body_crest_top, 0.9599310885968813F, 0.0F, 0.0F);
        this.body_crest_left_top = new ModelRenderer(this, 0, 33);
        this.body_crest_left_top.setRotationPoint(5.0F, 14.0F, -8.0F);
        this.body_crest_left_top.addBox(-1.0F, -4.0F, -1.0F, 10, 7, 2, 0.0F);
        this.setRotateAngle(body_crest_left_top, -0.20943951023931953F, -0.5235987755982988F, -0.6108652381980153F);
        this.body_main_jaw_left = new ModelRenderer(this, 66, 15);
        this.body_main_jaw_left.setRotationPoint(6.0F, 18.0F, -8.0F);
        this.body_main_jaw_left.addBox(-2.0F, -2.0F, -1.0F, 3, 6, 3, 0.0F);
        this.setRotateAngle(body_main_jaw_left, 0.08726646259971647F, -0.3490658503988659F, 0.5235987755982988F);
        this.body_crest_right_top = new ModelRenderer(this, 38, 31);
        this.body_crest_right_top.setRotationPoint(-5.0F, 14.0F, -8.0F);
        this.body_crest_right_top.addBox(-9.0F, -4.0F, -1.0F, 10, 7, 2, 0.0F);
        this.setRotateAngle(body_crest_right_top, -0.20943951023931953F, 0.5235987755982988F, 0.6108652381980153F);
        this.body_main_back = new ModelRenderer(this, 82, 8);
        this.body_main_back.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_main_back.addBox(-4.0F, 7.0F, -0.5F, 8, 4, 12, 0.0F);
        this.setRotateAngle(body_main_back, -0.2617993877991494F, 0.0F, 0.0F);
        this.body_bomb_main = new ModelRenderer(this, 0, 47);
        this.body_bomb_main.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_bomb_main.addBox(-10.0F, 8.0F, -14.0F, 20, 9, 9, 0.0F);
        this.setRotateAngle(body_bomb_main, 0.7853981633974483F, 0.0F, 0.0F);
        this.body_bomb_left_cap = new ModelRenderer(this, 56, 40);
        this.body_bomb_left_cap.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_bomb_left_cap.addBox(10.0F, 9.5F, -12.5F, 1, 6, 6, 0.0F);
        this.setRotateAngle(body_bomb_left_cap, 0.7853981633974483F, 0.0F, 0.0F);
        this.body_bomb_left_corner_bottom = new ModelRenderer(this, 119, 11);
        this.body_bomb_left_corner_bottom.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_bomb_left_corner_bottom.addBox(-6.0F, 20.0F, 0.5F, 6, 4, 3, 0.0F);
        this.setRotateAngle(body_bomb_left_corner_bottom, 0.0F, 0.0F, -0.5235987755982988F);
        this.body_main_top = new ModelRenderer(this, 55, 68);
        this.body_main_top.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_main_top.addBox(-6.5F, 10.0F, -7.0F, 13, 3, 17, 0.0F);
        this.body_bomb_left_corner_front = new ModelRenderer(this, 72, 15);
        this.body_bomb_left_corner_front.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_bomb_left_corner_front.addBox(2.5F, 14.0F, -9.0F, 6, 3, 4, 0.0F);
        this.setRotateAngle(body_bomb_left_corner_front, 0.0F, -0.5235987755982988F, 0.0F);
        this.body_bomb_right_corner_top = new ModelRenderer(this, 0, 128);
        this.body_bomb_right_corner_top.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_bomb_right_corner_top.addBox(-15.5F, 3.0F, 0.5F, 6, 4, 3, 0.0F);
        this.setRotateAngle(body_bomb_right_corner_top, 0.0F, 0.0F, -0.5235987755982988F);
        this.body_bomb_left_corner_back = new ModelRenderer(this, 147, 20);
        this.body_bomb_left_corner_back.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_bomb_left_corner_back.addBox(0.5F, 14.0F, 8.5F, 6, 3, 4, 0.0F);
        this.setRotateAngle(body_bomb_left_corner_back, 0.0F, 0.5235987755982988F, 0.0F);
        this.body_eye = new ModelRenderer(this, 1, 111);
        this.body_eye.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_eye.addBox(-5.5F, 12.0F, -8.0F, 11, 11, 2, 0.0F);
        this.body_main_bottom = new ModelRenderer(this, 61, 41);
        this.body_main_bottom.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_main_bottom.addBox(-6.5F, 21.0F, -8.0F, 13, 3, 18, 0.0F);
        this.body_bomb_left_corner_top = new ModelRenderer(this, 0, 0);
        this.body_bomb_left_corner_top.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_bomb_left_corner_top.addBox(9.5F, 3.0F, 0.5F, 6, 4, 3, 0.0F);
        this.setRotateAngle(body_bomb_left_corner_top, 0.0F, 0.0F, 0.5235987901687622F);
        this.body_jaw_mid = new ModelRenderer(this, 0, 17);
        this.body_jaw_mid.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_jaw_mid.addBox(-6.0F, 21.0F, -7.0F, 12, 4, 3, 0.0F);
        this.setRotateAngle(body_jaw_mid, -0.14870205226991687F, 0.0F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.body_bomb_right_corner_bottom.render(f5);
        this.body_main_jaw_right.render(f5);
        this.body_bomb_right_cap.render(f5);
        this.body_crest_left_bottom.render(f5);
        this.body_bomb_right_corner_back.render(f5);
        this.body_main.render(f5);
        this.body_crest_right_bottom.render(f5);
        this.body_bomb_right_corner_front.render(f5);
        this.body_crest_top.render(f5);
        this.body_crest_left_top.render(f5);
        this.body_main_jaw_left.render(f5);
        this.body_crest_right_top.render(f5);
        this.body_main_back.render(f5);
        this.body_bomb_main.render(f5);
        this.body_bomb_left_cap.render(f5);
        this.body_bomb_left_corner_bottom.render(f5);
        this.body_main_top.render(f5);
        this.body_bomb_left_corner_front.render(f5);
        this.body_bomb_right_corner_top.render(f5);
        this.body_bomb_left_corner_back.render(f5);
        this.body_eye.render(f5);
        this.body_main_bottom.render(f5);
        this.body_bomb_left_corner_top.render(f5);
        this.body_jaw_mid.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
