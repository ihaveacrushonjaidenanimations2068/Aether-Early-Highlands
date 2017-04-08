package com.gildedgames.aether.client.models.entities.living;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelBurrukai extends ModelBase
{
	public ModelRenderer Tail;

	public ModelRenderer HeadMain;

	public ModelRenderer HeadAntlerTopLeft1;

	public ModelRenderer HeadAntlerTopLeft2;

	public ModelRenderer HeadAntlerBottomLeft1;

	public ModelRenderer HeadAntlerBottomRight1;

	public ModelRenderer HeadAntlerTopRight2;

	public ModelRenderer HeadAntlerBottomLeft2;

	public ModelRenderer HeadAntlerBottomRight2;

	public ModelRenderer HeadPlateTop;

	public ModelRenderer HeadPlateLow;

	public ModelRenderer HeadAntlersMiddle;

	public ModelRenderer HeadBrowLeft;

	public ModelRenderer HeadBrowRight;

	public ModelRenderer HeadEyeLeft;

	public ModelRenderer HeadEyeRight;

	public ModelRenderer HeadEarLeft;

	public ModelRenderer HeadEarRight;

	public ModelRenderer HeadRidge;

	public ModelRenderer HeadBase;

	public ModelRenderer HeadCheekRight;

	public ModelRenderer HeadCheekLeft;

	public ModelRenderer HeadChin;

	public ModelRenderer HeadSnout;

	public ModelRenderer HeadAntlerTopRight1;

	public ModelRenderer TorsoNeckJoint;

	public ModelRenderer TorsoFrontFurLeft;

	public ModelRenderer TorsoFrontFurRight;

	public ModelRenderer TorsoShoulderLeft;

	public ModelRenderer TorsoShoulderRight;

	public ModelRenderer TorsoChest;

	public ModelRenderer TorsoPlate1;

	public ModelRenderer TorsoPlate2;

	public ModelRenderer TorsoPlate3;

	public ModelRenderer TorsoShoulderPlateLeftMid;

	public ModelRenderer TorsoShoulderPlateLeftFront;

	public ModelRenderer TorsoShoulderPlateLeftBack;

	public ModelRenderer TorsoShoulderPlateRightMid;

	public ModelRenderer TorsoShoulderPlateRightFront;

	public ModelRenderer TorsoShoulderPlateLeftBack_1;

	public ModelRenderer TorsoBackFur;

	public ModelRenderer TorsoRear;

	public ModelRenderer TorsoCrotch;

	public ModelRenderer FrontLegRightTop;

	public ModelRenderer FrontLegRightBottom;

	public ModelRenderer FrontLegRightHoofIn;

	public ModelRenderer FrontLegRightHoofOut;

	public ModelRenderer FrontLegLeftTop;

	public ModelRenderer FrontLegLeftBottom;

	public ModelRenderer FrontLegLeftHoofIn;

	public ModelRenderer FrontLegLeftHoofOut;

	public ModelRenderer HindLegRightCalf;

	public ModelRenderer HindLegRightShin;

	public ModelRenderer HindLegRightKnee;

	public ModelRenderer HindLegRightHoofIn;

	public ModelRenderer HindLegRightHoofOut;

	public ModelRenderer HindLegRightHoofMiddle;

	public ModelRenderer HindLegLeftCalfMiddle;

	public ModelRenderer HindLegLeftKnee;

	public ModelRenderer HindLegLeftShin;

	public ModelRenderer HindLegLeftHoofIn;

	public ModelRenderer HindLegLeftHoofOut;

	public ModelRenderer HindLegLeftHoofMiddle;

	public ModelBurrukai()
	{
		this.textureWidth = 128;
		this.textureHeight = 512;
		this.HeadEarRight = new ModelRenderer(this, 26, 43);
		this.HeadEarRight.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadEarRight.addBox(-5.0F, 0.0F, -2.0F, 1, 5, 3, 0.0F);
		this.setRotateAngle(this.HeadEarRight, 0.0F, -0.0F, 0.5235987755982988F);
		this.HeadAntlerTopRight1 = new ModelRenderer(this, 1, 16);
		this.HeadAntlerTopRight1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadAntlerTopRight1.addBox(-14.0F, 12.0F, -1.0F, 9, 2, 2, 0.0F);
		this.setRotateAngle(this.HeadAntlerTopRight1, 0.0F, -0.0F, 1.7453292519943295F);
		this.HeadAntlerBottomRight2 = new ModelRenderer(this, 27, 20);
		this.HeadAntlerBottomRight2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadAntlerBottomRight2.addBox(-12.0F, -1.5F, -2.5F, 7, 3, 3, 0.0F);
		this.setRotateAngle(this.HeadAntlerBottomRight2, 0.0F, -0.0F, 0.7853981633974483F);
		this.HeadRidge = new ModelRenderer(this, 47, 36);
		this.HeadRidge.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadRidge.addBox(-2.0F, -7.0F, -8.0F, 4, 6, 11, 0.0F);
		this.setRotateAngle(this.HeadRidge, 0.7853981633974483F, -0.0F, 0.0F);
		this.HeadBase = new ModelRenderer(this, 43, 53);
		this.HeadBase.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadBase.addBox(-2.5F, 0.7F, -10.6F, 5, 7, 13, 0.0F);
		this.TorsoNeckJoint = new ModelRenderer(this, 44, 95);
		this.TorsoNeckJoint.setRotationPoint(0.0F, -6.0F, 0.0F);
		this.TorsoNeckJoint.addBox(-3.5F, 2.0F, -2.0F, 7, 10, 10, 0.0F);
		this.setRotateAngle(this.TorsoNeckJoint, -0.5235987901687622F, -0.0F, 0.0F);
		this.HeadPlateTop = new ModelRenderer(this, 46, 0);
		this.HeadPlateTop.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadPlateTop.addBox(-4.0F, -8.8F, -1.5F, 8, 2, 8, 0.0F);
		this.setRotateAngle(this.HeadPlateTop, 0.8726646259971648F, -0.0F, 0.0F);
		this.TorsoShoulderPlateLeftBack_1 = new ModelRenderer(this, 17, 134);
		this.TorsoShoulderPlateLeftBack_1.setRotationPoint(0.0F, -6.0F, 0.0F);
		this.TorsoShoulderPlateLeftBack_1.addBox(-13.5F, -9.0F, 3.5F, 4, 12, 4, 0.0F);
		this.setRotateAngle(this.TorsoShoulderPlateLeftBack_1, -0.30740453246205135F, 0.16852786693084162F, -0.2656520475633568F);
		this.TorsoPlate1 = new ModelRenderer(this, 44, 139);
		this.TorsoPlate1.setRotationPoint(0.0F, -6.0F, 0.0F);
		this.TorsoPlate1.addBox(-4.5F, -3.0F, -3.0F, 9, 3, 9, 0.0F);
		this.setRotateAngle(this.TorsoPlate1, 1.2217304706573486F, -0.0F, 0.0F);
		this.HeadMain = new ModelRenderer(this, 48, 27);
		this.HeadMain.setRotationPoint(0.0F, 3.0F, -5.0F);
		this.HeadMain.addBox(-4.0F, -2.0F, -4.0F, 8, 3, 6, 0.0F);
		this.HeadCheekLeft = new ModelRenderer(this, 79, 51);
		this.HeadCheekLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadCheekLeft.addBox(0.9F, 0.8F, -9.0F, 4, 7, 12, 0.0F);
		this.setRotateAngle(this.HeadCheekLeft, 0.0F, 0.2617993877991494F, 0.0F);
		this.HeadBrowLeft = new ModelRenderer(this, 77, 33);
		this.HeadBrowLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadBrowLeft.addBox(2.0F, -5.5F, -3.6F, 4, 3, 6, 0.0F);
		this.setRotateAngle(this.HeadBrowLeft, 0.3490658503988659F, 0.6981317007977318F, 0.17453292519943295F);
		this.FrontLegRightHoofOut = new ModelRenderer(this, 12, 302);
		this.FrontLegRightHoofOut.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.FrontLegRightHoofOut.addBox(-3.5F, 20.0F, -7.3F, 2, 3, 4, 0.0F);
		this.setRotateAngle(this.FrontLegRightHoofOut, 0.0F, 0.17453292519943295F, 0.0F);
		this.HeadCheekRight = new ModelRenderer(this, 11, 51);
		this.HeadCheekRight.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadCheekRight.addBox(-5.0F, 0.8F, -9.0F, 4, 7, 12, 0.0F);
		this.setRotateAngle(this.HeadCheekRight, 0.0F, -0.2617993877991494F, 0.0F);
		this.FrontLegLeftTop = new ModelRenderer(this, 92, 265);
		this.FrontLegLeftTop.setRotationPoint(4.0F, 1.0F, 4.5F);
		this.FrontLegLeftTop.addBox(0.0F, -2.0F, -3.0F, 5, 14, 7, 0.0F);
		this.setRotateAngle(this.FrontLegLeftTop, 0.0F, -0.03490658476948738F, 0.0F);
		this.Tail = new ModelRenderer(this, 56, 246);
		this.Tail.setRotationPoint(0.0F, -3.0F, 29.0F);
		this.Tail.addBox(-2.0F, 0.0F, -2.0F, 3, 10, 3, 0.0F);
		this.setRotateAngle(this.Tail, 0.515060975741379F, -0.7518794329071241F, -0.3622181621097308F);
		this.FrontLegLeftBottom = new ModelRenderer(this, 96, 286);
		this.FrontLegLeftBottom.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.FrontLegLeftBottom.addBox(0.5F, 8.5F, 4.0F, 4, 12, 4, 0.0F);
		this.setRotateAngle(this.FrontLegLeftBottom, -0.5235987755982988F, -0.0F, 0.0F);
		this.HindLegRightShin = new ModelRenderer(this, 18, 355);
		this.HindLegRightShin.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HindLegRightShin.addBox(-1.0F, 10.0F, 3.5F, 3, 10, 4, 0.0F);
		this.setRotateAngle(this.HindLegRightShin, 0.08726646259971647F, -0.0F, 0.0F);
		this.HindLegLeftCalfMiddle = new ModelRenderer(this, 92, 320);
		this.HindLegLeftCalfMiddle.setRotationPoint(5.0F, 2.0F, 23.0F);
		this.HindLegLeftCalfMiddle.addBox(-3.0F, -2.0F, -1.5F, 5, 13, 7, 0.0F);
		this.setRotateAngle(this.HindLegLeftCalfMiddle, -0.2617993877991494F, 0.0F, 0.0F);
		this.FrontLegRightHoofIn = new ModelRenderer(this, 24, 302);
		this.FrontLegRightHoofIn.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.FrontLegRightHoofIn.addBox(-3.5F, 20.0F, -6.5F, 2, 3, 4, 0.0F);
		this.setRotateAngle(this.FrontLegRightHoofIn, 0.0F, -0.17453292519943295F, 0.0F);
		this.TorsoChest = new ModelRenderer(this, 38, 115);
		this.TorsoChest.setRotationPoint(0.0F, -6.0F, 0.0F);
		this.TorsoChest.addBox(-6.0F, 7.0F, -1.0F, 12, 12, 12, 0.0F);
		this.setRotateAngle(this.TorsoChest, 0.11153583228588103F, -0.0F, 0.0F);
		this.HindLegLeftShin = new ModelRenderer(this, 97, 354);
		this.HindLegLeftShin.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HindLegLeftShin.addBox(-2.0F, 10.0F, 3.5F, 3, 10, 4, 0.0F);
		this.setRotateAngle(this.HindLegLeftShin, 0.08726646259971647F, -0.0F, 0.0F);
		this.HeadAntlerBottomRight1 = new ModelRenderer(this, 11, 22);
		this.HeadAntlerBottomRight1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadAntlerBottomRight1.addBox(-8.5F, 10.0F, -2.0F, 6, 2, 2, 0.0F);
		this.setRotateAngle(this.HeadAntlerBottomRight1, 0.0F, -0.0F, 2.0943951023931953F);
		this.TorsoShoulderPlateRightFront = new ModelRenderer(this, 17, 172);
		this.TorsoShoulderPlateRightFront.setRotationPoint(0.0F, -6.0F, 0.0F);
		this.TorsoShoulderPlateRightFront.addBox(-11.5F, -6.0F, 2.0F, 4, 12, 4, 0.0F);
		this.setRotateAngle(this.TorsoShoulderPlateRightFront, 0.30740453246205135F, -0.16852786693084162F, -0.2656520475633568F);
		this.HindLegLeftHoofOut = new ModelRenderer(this, 107, 368);
		this.HindLegLeftHoofOut.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HindLegLeftHoofOut.addBox(1.0F, 20.0F, -0.35F, 1, 2, 4, 0.0F);
		this.setRotateAngle(this.HindLegLeftHoofOut, 0.2617993877991494F, -0.17453292519943295F, 0.0F);
		this.FrontLegLeftHoofOut = new ModelRenderer(this, 104, 302);
		this.FrontLegLeftHoofOut.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.FrontLegLeftHoofOut.addBox(1.5F, 20.0F, -7.3F, 2, 3, 4, 0.0F);
		this.setRotateAngle(this.FrontLegLeftHoofOut, 0.0F, -0.17453292519943295F, 0.0F);
		this.HindLegRightHoofOut = new ModelRenderer(this, 11, 369);
		this.HindLegRightHoofOut.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HindLegRightHoofOut.addBox(2.0F, 20.0F, -0.5F, 1, 2, 4, 0.0F);
		this.setRotateAngle(this.HindLegRightHoofOut, 0.2617993877991494F, -0.17453292519943295F, 0.0F);
		this.HeadAntlerBottomLeft1 = new ModelRenderer(this, 97, 22);
		this.HeadAntlerBottomLeft1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadAntlerBottomLeft1.addBox(2.5F, 10.0F, -2.0F, 6, 2, 2, 0.0F);
		this.setRotateAngle(this.HeadAntlerBottomLeft1, 0.0F, -0.0F, -2.0943951023931953F);
		this.HeadBrowRight = new ModelRenderer(this, 27, 33);
		this.HeadBrowRight.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadBrowRight.addBox(-6.0F, -5.5F, -3.6F, 4, 3, 6, 0.0F);
		this.setRotateAngle(this.HeadBrowRight, 0.3490658503988659F, -0.6981317007977318F, -0.17453292519943295F);
		this.TorsoShoulderPlateRightMid = new ModelRenderer(this, 15, 150);
		this.TorsoShoulderPlateRightMid.setRotationPoint(0.0F, -6.0F, 0.0F);
		this.TorsoShoulderPlateRightMid.addBox(-13.0F, -8.0F, 3.0F, 5, 18, 4, 0.0F);
		this.setRotateAngle(this.TorsoShoulderPlateRightMid, 0.0F, -0.0F, -0.17453292012214658F);
		this.HeadPlateLow = new ModelRenderer(this, 52, 10);
		this.HeadPlateLow.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadPlateLow.addBox(-0.5F, -8.5F, -4.3F, 5, 2, 5, 0.0F);
		this.setRotateAngle(this.HeadPlateLow, 0.9431759277777356F, 0.5654866776461628F, 0.6227334771115768F);
		this.TorsoPlate2 = new ModelRenderer(this, 40, 151);
		this.TorsoPlate2.setRotationPoint(0.0F, -6.0F, 0.0F);
		this.TorsoPlate2.addBox(-5.0F, -2.0F, 1.0F, 10, 4, 12, 0.0F);
		this.setRotateAngle(this.TorsoPlate2, 0.5235987901687622F, -0.0F, 0.0F);
		this.FrontLegLeftHoofIn = new ModelRenderer(this, 92, 302);
		this.FrontLegLeftHoofIn.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.FrontLegLeftHoofIn.addBox(1.5F, 20.0F, -6.5F, 2, 3, 4, 0.0F);
		this.setRotateAngle(this.FrontLegLeftHoofIn, 0.0F, 0.17453292519943295F, 0.0F);
		this.HeadChin = new ModelRenderer(this, 50, 73);
		this.HeadChin.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadChin.addBox(-2.0F, -2.0F, -12.9F, 4, 7, 8, 0.0F);
		this.setRotateAngle(this.HeadChin, 0.7853981633974483F, -0.0F, 0.0F);
		this.HeadAntlerTopRight2 = new ModelRenderer(this, 23, 14);
		this.HeadAntlerTopRight2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadAntlerTopRight2.addBox(-14.0F, -3.0F, -1.5F, 9, 3, 3, 0.0F);
		this.setRotateAngle(this.HeadAntlerTopRight2, 0.0F, -0.0F, 0.5235987755982988F);
		this.TorsoShoulderLeft = new ModelRenderer(this, 91, 113);
		this.TorsoShoulderLeft.setRotationPoint(0.0F, -6.0F, 0.0F);
		this.TorsoShoulderLeft.addBox(8.0F, -4.0F, 0.5F, 3, 12, 9, 0.0F);
		this.setRotateAngle(this.TorsoShoulderLeft, 0.0F, -0.0F, 0.5235987901687622F);
		this.HeadAntlerTopLeft2 = new ModelRenderer(this, 77, 14);
		this.HeadAntlerTopLeft2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadAntlerTopLeft2.addBox(5.0F, -3.0F, -1.5F, 9, 3, 3, 0.0F);
		this.setRotateAngle(this.HeadAntlerTopLeft2, 0.0F, -0.0F, -0.5235987755982988F);
		this.HeadEyeLeft = new ModelRenderer(this, 80, 42);
		this.HeadEyeLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadEyeLeft.addBox(4.5F, -3.0F, -5.0F, 1, 5, 4, 0.0F);
		this.setRotateAngle(this.HeadEyeLeft, 0.0F, 0.6108652381980153F, 0.0F);
		this.TorsoPlate3 = new ModelRenderer(this, 44, 167);
		this.TorsoPlate3.setRotationPoint(0.0F, -6.0F, 0.0F);
		this.TorsoPlate3.addBox(-4.0F, -1.5F, 9.0F, 8, 3, 10, 0.0F);
		this.setRotateAngle(this.TorsoPlate3, 0.17453292519943295F, -0.0F, 0.0F);
		this.TorsoShoulderPlateLeftFront = new ModelRenderer(this, 91, 172);
		this.TorsoShoulderPlateLeftFront.setRotationPoint(0.0F, -6.0F, 0.0F);
		this.TorsoShoulderPlateLeftFront.addBox(7.5F, -6.0F, 2.0F, 4, 12, 4, 0.0F);
		this.setRotateAngle(this.TorsoShoulderPlateLeftFront, 0.3073524812762014F, 0.16859880574265224F, 0.26563911215353697F);
		this.TorsoShoulderRight = new ModelRenderer(this, 9, 113);
		this.TorsoShoulderRight.setRotationPoint(0.0F, -6.0F, 0.0F);
		this.TorsoShoulderRight.addBox(-11.0F, -4.0F, 0.5F, 3, 12, 9, 0.0F);
		this.setRotateAngle(this.TorsoShoulderRight, 0.0F, -0.0F, -0.5235987901687622F);
		this.HeadAntlersMiddle = new ModelRenderer(this, 47, 17);
		this.HeadAntlersMiddle.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadAntlersMiddle.addBox(-5.0F, -7.0F, -3.0F, 10, 5, 5, 0.0F);
		this.TorsoShoulderPlateLeftMid = new ModelRenderer(this, 91, 150);
		this.TorsoShoulderPlateLeftMid.setRotationPoint(0.0F, -6.0F, 0.0F);
		this.TorsoShoulderPlateLeftMid.addBox(8.0F, -8.0F, 3.0F, 5, 18, 4, 0.0F);
		this.setRotateAngle(this.TorsoShoulderPlateLeftMid, 0.0F, -0.0F, 0.17453292012214658F);
		this.HindLegLeftHoofIn = new ModelRenderer(this, 91, 368);
		this.HindLegLeftHoofIn.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HindLegLeftHoofIn.addBox(-3.0F, 20.0F, -0.5F, 1, 2, 4, 0.0F);
		this.setRotateAngle(this.HindLegLeftHoofIn, 0.2617993877991494F, 0.17453292519943295F, 0.0F);
		this.TorsoCrotch = new ModelRenderer(this, 54, 232);
		this.TorsoCrotch.setRotationPoint(0.0F, -6.0F, 0.0F);
		this.TorsoCrotch.addBox(-2.0F, 1.0F, 25.0F, 4, 10, 4, 0.0F);
		this.setRotateAngle(this.TorsoCrotch, -0.17453292012214658F, -0.0F, 0.0F);
		this.TorsoFrontFurRight = new ModelRenderer(this, 0, 91);
		this.TorsoFrontFurRight.setRotationPoint(0.0F, -6.0F, 0.0F);
		this.TorsoFrontFurRight.addBox(-9.0F, -3.0F, -0.5F, 9, 9, 13, 0.0F);
		this.setRotateAngle(this.TorsoFrontFurRight, 0.0F, -0.0F, -0.2617993877991494F);
		this.TorsoShoulderPlateLeftBack = new ModelRenderer(this, 91, 134);
		this.TorsoShoulderPlateLeftBack.setRotationPoint(0.0F, -6.0F, 0.0F);
		this.TorsoShoulderPlateLeftBack.addBox(9.5F, -9.0F, 3.5F, 4, 12, 4, 0.0F);
		this.setRotateAngle(this.TorsoShoulderPlateLeftBack, -0.30740453246205135F, -0.16852786693084162F, 0.2656520475633568F);
		this.HindLegRightHoofMiddle = new ModelRenderer(this, 22, 372);
		this.HindLegRightHoofMiddle.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HindLegRightHoofMiddle.addBox(-0.5F, 20.0F, 1.0F, 2, 2, 1, 0.0F);
		this.setRotateAngle(this.HindLegRightHoofMiddle, 0.2617993877991494F, -0.0F, 0.0F);
		this.TorsoFrontFurLeft = new ModelRenderer(this, 78, 91);
		this.TorsoFrontFurLeft.setRotationPoint(0.0F, -6.0F, 0.0F);
		this.TorsoFrontFurLeft.addBox(0.0F, -3.0F, -0.5F, 9, 9, 13, 0.0F);
		this.setRotateAngle(this.TorsoFrontFurLeft, 0.0F, -0.0F, 0.2617993877991494F);
		this.FrontLegRightBottom = new ModelRenderer(this, 16, 286);
		this.FrontLegRightBottom.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.FrontLegRightBottom.addBox(-4.5F, 8.5F, 4.0F, 4, 12, 4, 0.0F);
		this.setRotateAngle(this.FrontLegRightBottom, -0.5235987755982988F, -0.0F, 0.0F);
		this.HindLegRightCalf = new ModelRenderer(this, 13, 321);
		this.HindLegRightCalf.setRotationPoint(-5.0F, 2.0F, 23.0F);
		this.HindLegRightCalf.addBox(-2.0F, -2.0F, -1.5F, 5, 13, 7, 0.0F);
		this.setRotateAngle(this.HindLegRightCalf, -0.2617993877991494F, -0.0F, 0.0F);
		this.HeadSnout = new ModelRenderer(this, 46, 73);
		this.HeadSnout.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadSnout.addBox(-2.0F, -2.5F, -11.5F, 4, 3, 2, 0.0F);
		this.setRotateAngle(this.HeadSnout, 0.3490658503988659F, -0.0F, 0.0F);
		this.HeadEarLeft = new ModelRenderer(this, 90, 43);
		this.HeadEarLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadEarLeft.addBox(4.0F, 0.0F, -2.0F, 1, 5, 3, 0.0F);
		this.setRotateAngle(this.HeadEarLeft, 0.0F, -0.0F, -0.5235987755982988F);
		this.TorsoBackFur = new ModelRenderer(this, 33, 180);
		this.TorsoBackFur.setRotationPoint(0.0F, -6.0F, 0.0F);
		this.TorsoBackFur.addBox(-5.0F, -3.0F, 11.0F, 10, 4, 19, 0.0F);
		this.setRotateAngle(this.TorsoBackFur, -0.17453292012214658F, -0.0F, 0.0F);
		this.FrontLegRightTop = new ModelRenderer(this, 12, 265);
		this.FrontLegRightTop.setRotationPoint(-4.0F, 1.0F, 4.5F);
		this.FrontLegRightTop.addBox(-5.0F, -2.0F, -3.0F, 5, 14, 7, 0.0F);
		this.HindLegLeftKnee = new ModelRenderer(this, 91, 340);
		this.HindLegLeftKnee.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HindLegLeftKnee.addBox(-2.5F, 6.0F, 1.0F, 4, 5, 9, 0.0F);
		this.setRotateAngle(this.HindLegLeftKnee, -0.17453292519943295F, -0.0F, 0.0F);
		this.TorsoRear = new ModelRenderer(this, 40, 203);
		this.TorsoRear.setRotationPoint(0.0F, -6.0F, 0.0F);
		this.TorsoRear.addBox(-3.5F, 3.0F, 11.0F, 7, 14, 15, 0.0F);
		this.HindLegRightHoofIn = new ModelRenderer(this, 29, 369);
		this.HindLegRightHoofIn.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HindLegRightHoofIn.addBox(-2.0F, 20.0F, -0.35F, 1, 2, 4, 0.0F);
		this.setRotateAngle(this.HindLegRightHoofIn, 0.2617993877991494F, 0.17453292519943295F, 0.0F);
		this.HeadAntlerTopLeft1 = new ModelRenderer(this, 101, 16);
		this.HeadAntlerTopLeft1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadAntlerTopLeft1.addBox(5.0F, 12.0F, -1.0F, 9, 2, 2, 0.0F);
		this.setRotateAngle(this.HeadAntlerTopLeft1, 0.0F, -0.0F, -1.7453292519943295F);
		this.HindLegLeftHoofMiddle = new ModelRenderer(this, 101, 371);
		this.HindLegLeftHoofMiddle.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HindLegLeftHoofMiddle.addBox(-1.5F, 20.0F, 1.0F, 2, 2, 1, 0.0F);
		this.setRotateAngle(this.HindLegLeftHoofMiddle, 0.2617993877991494F, -0.0F, 0.0F);
		this.HeadAntlerBottomLeft2 = new ModelRenderer(this, 77, 20);
		this.HeadAntlerBottomLeft2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadAntlerBottomLeft2.addBox(5.0F, -1.5F, -2.5F, 7, 3, 3, 0.0F);
		this.setRotateAngle(this.HeadAntlerBottomLeft2, 0.0F, -0.0F, -0.7853981633974483F);
		this.HeadEyeRight = new ModelRenderer(this, 34, 42);
		this.HeadEyeRight.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HeadEyeRight.addBox(-5.5F, -3.0F, -5.0F, 1, 5, 4, 0.0F);
		this.setRotateAngle(this.HeadEyeRight, 0.0F, -0.6108652381980153F, 0.0F);
		this.HindLegRightKnee = new ModelRenderer(this, 12, 341);
		this.HindLegRightKnee.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HindLegRightKnee.addBox(-1.5F, 6.0F, 1.0F, 4, 5, 9, 0.0F);
		this.setRotateAngle(this.HindLegRightKnee, -0.17453292519943295F, -0.0F, 0.0F);
		this.HeadMain.addChild(this.HeadEarRight);
		this.HeadMain.addChild(this.HeadAntlerTopRight1);
		this.HeadMain.addChild(this.HeadAntlerBottomRight2);
		this.HeadMain.addChild(this.HeadRidge);
		this.HeadMain.addChild(this.HeadBase);
		this.HeadMain.addChild(this.HeadPlateTop);
		this.HeadMain.addChild(this.HeadCheekLeft);
		this.HeadMain.addChild(this.HeadBrowLeft);
		this.FrontLegRightTop.addChild(this.FrontLegRightHoofOut);
		this.HeadMain.addChild(this.HeadCheekRight);
		this.FrontLegLeftTop.addChild(this.FrontLegLeftBottom);
		this.HindLegRightCalf.addChild(this.HindLegRightShin);
		this.FrontLegRightTop.addChild(this.FrontLegRightHoofIn);
		this.HindLegLeftCalfMiddle.addChild(this.HindLegLeftShin);
		this.HeadMain.addChild(this.HeadAntlerBottomRight1);
		this.HindLegLeftCalfMiddle.addChild(this.HindLegLeftHoofOut);
		this.FrontLegLeftTop.addChild(this.FrontLegLeftHoofOut);
		this.HindLegRightCalf.addChild(this.HindLegRightHoofOut);
		this.HeadMain.addChild(this.HeadAntlerBottomLeft1);
		this.HeadMain.addChild(this.HeadBrowRight);
		this.HeadMain.addChild(this.HeadPlateLow);
		this.FrontLegLeftTop.addChild(this.FrontLegLeftHoofIn);
		this.HeadMain.addChild(this.HeadChin);
		this.HeadMain.addChild(this.HeadAntlerTopRight2);
		this.HeadMain.addChild(this.HeadAntlerTopLeft2);
		this.HeadMain.addChild(this.HeadEyeLeft);
		this.HeadMain.addChild(this.HeadAntlersMiddle);
		this.HindLegLeftCalfMiddle.addChild(this.HindLegLeftHoofIn);
		this.HindLegRightCalf.addChild(this.HindLegRightHoofMiddle);
		this.FrontLegRightTop.addChild(this.FrontLegRightBottom);
		this.HeadMain.addChild(this.HeadSnout);
		this.HeadMain.addChild(this.HeadEarLeft);
		this.HindLegLeftCalfMiddle.addChild(this.HindLegLeftKnee);
		this.HindLegRightCalf.addChild(this.HindLegRightHoofIn);
		this.HeadMain.addChild(this.HeadAntlerTopLeft1);
		this.HindLegLeftCalfMiddle.addChild(this.HindLegLeftHoofMiddle);
		this.HeadMain.addChild(this.HeadAntlerBottomLeft2);
		this.HeadMain.addChild(this.HeadEyeRight);
		this.HindLegRightCalf.addChild(this.HindLegRightKnee);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		this.TorsoNeckJoint.render(f5);
		this.TorsoShoulderPlateLeftBack_1.render(f5);
		this.TorsoPlate1.render(f5);
		this.HeadMain.render(f5);
		this.FrontLegLeftTop.render(f5);
		this.Tail.render(f5);
		this.HindLegLeftCalfMiddle.render(f5);
		this.TorsoChest.render(f5);
		this.TorsoShoulderPlateRightFront.render(f5);
		this.TorsoShoulderPlateRightMid.render(f5);
		this.TorsoPlate2.render(f5);
		this.TorsoShoulderLeft.render(f5);
		this.TorsoPlate3.render(f5);
		this.TorsoShoulderPlateLeftFront.render(f5);
		this.TorsoShoulderRight.render(f5);
		this.TorsoShoulderPlateLeftMid.render(f5);
		this.TorsoCrotch.render(f5);
		this.TorsoFrontFurRight.render(f5);
		this.TorsoShoulderPlateLeftBack.render(f5);
		this.TorsoFrontFurLeft.render(f5);
		this.HindLegRightCalf.render(f5);
		this.TorsoBackFur.render(f5);
		this.FrontLegRightTop.render(f5);
		this.TorsoRear.render(f5);
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
	{
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch,
			float scaleFactor, Entity entity)
	{
		super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entity);

		this.Tail.rotateAngleZ = -0.5096392150483358F + (MathHelper.cos(ageInTicks * 0.1662F) * 0.2F);

		float pitch = headPitch * 0.017453292F;
		float yaw = netHeadYaw * 0.017453292F;

		this.HeadMain.rotateAngleX = pitch;
		this.HeadMain.rotateAngleY = yaw;

		float leftSwingX = (MathHelper.cos(limbSwing * 0.6662F) * 0.75F * limbSwingAmount);
		float rightSwingX = (MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.75F * limbSwingAmount);

		this.FrontLegRightTop.rotateAngleX = leftSwingX;
		this.FrontLegLeftTop.rotateAngleX = rightSwingX;

		this.HindLegLeftCalfMiddle.rotateAngleX = -0.2617993877991494F + leftSwingX;
		this.HindLegRightCalf.rotateAngleX = -0.2617993877991494F + rightSwingX;
	}

}
