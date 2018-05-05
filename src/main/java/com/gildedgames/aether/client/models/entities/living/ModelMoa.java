package com.gildedgames.aether.client.models.entities.living;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Moa_Wild - Undefined
 * Created using Tabula 5.1.0
 */
public class ModelMoa extends ModelBase {
	public ModelRenderer BodyMain;
	public ModelRenderer BodyFront;
	public ModelRenderer BodyBack;
	public ModelRenderer TailBase;
	public ModelRenderer LegL1;
	public ModelRenderer LegR1;
	public ModelRenderer ShoulderL;
	public ModelRenderer ShoulderR;
	public ModelRenderer Neck;
	public ModelRenderer WingL1;
	public ModelRenderer WingL2;
	public ModelRenderer WingLFeatherInt2;
	public ModelRenderer WingL3;
	public ModelRenderer WingLFeatherInt1;
	public ModelRenderer WingLFeatherExt1;
	public ModelRenderer WingLFeatherExt2;
	public ModelRenderer WingLFeatherExt3;
	public ModelRenderer WingR1;
	public ModelRenderer WingR2;
	public ModelRenderer WingRFeatherInt2;
	public ModelRenderer WingR3;
	public ModelRenderer WingRFeatherInt1;
	public ModelRenderer WingRFeatherExt1;
	public ModelRenderer WingRFeatherExt2;
	public ModelRenderer WingRFeatherExt3;
	public ModelRenderer HeadMain;
	public ModelRenderer HeadBack;
	public ModelRenderer HeadBeakMain;
	public ModelRenderer JawMain;
	public ModelRenderer HeadFront;
	public ModelRenderer HeadBrow;
	public ModelRenderer HeadFeatherL1;
	public ModelRenderer HeadFeatherR1;
	public ModelRenderer HeadFeatherL2;
	public ModelRenderer HeadFeatherR2;
	public ModelRenderer HeadBeakIntL;
	public ModelRenderer HeadBeakIntR;
	public ModelRenderer HeadBeakFrontL;
	public ModelRenderer HeadBeakFrontR;
	public ModelRenderer JawBack;
	public ModelRenderer JawFrontL;
	public ModelRenderer JawToothL2;
	public ModelRenderer JawToothR2;
	public ModelRenderer JawFrontR;
	public ModelRenderer JawToothL3;
	public ModelRenderer JawToothR3;
	public ModelRenderer JawToothL1;
	public ModelRenderer JawToothL1_1;
	public ModelRenderer TailFeatherR;
	public ModelRenderer TailFeatherM;
	public ModelRenderer TailFeatherL;
	public ModelRenderer LegL2;
	public ModelRenderer LegL3;
	public ModelRenderer LegLAnkle;
	public ModelRenderer LegLFoot;
	public ModelRenderer LegLToeM;
	public ModelRenderer LegLToeR;
	public ModelRenderer LegLToeL;
	public ModelRenderer LegLTalonM;
	public ModelRenderer LegLTalonR;
	public ModelRenderer LegLTalonL;
	public ModelRenderer LegR2;
	public ModelRenderer LegR3;
	public ModelRenderer LegRAnkle;
	public ModelRenderer LegRFoot;
	public ModelRenderer LegRToeM;
	public ModelRenderer LegRToeR;
	public ModelRenderer LegRToeL;
	public ModelRenderer LegRTalonM;
	public ModelRenderer LegRTalonR;
	public ModelRenderer LegRTalonL;

	public ModelMoa() {
		this.textureWidth = 128;
		this.textureHeight = 256;
		this.HeadMain = new ModelRenderer(this, 22, 14);
		this.HeadMain.setRotationPoint(0.0F, -12.0F, 0.0F);
		this.HeadMain.addBox(-4.5F, -6.0F, -4.5F, 9, 10, 8, 0.0F);
		this.setRotateAngle(HeadMain, 0.17453292519943295F, 0.0F, 0.0F);
		this.LegLToeL = new ModelRenderer(this, 82, 203);
		this.LegLToeL.setRotationPoint(1.0F, 1.0F, -2.5F);
		this.LegLToeL.addBox(-1.0F, -1.0F, -5.0F, 2, 2, 5, 0.0F);
		this.setRotateAngle(LegLToeL, -0.17453292519943295F, -0.5235987755982988F, 0.0F);
		this.WingLFeatherExt3 = new ModelRenderer(this, 44, 125);
		this.WingLFeatherExt3.setRotationPoint(-2.0F, 1.0F, 3.0F);
		this.WingLFeatherExt3.addBox(-0.5F, -1.0F, -2.5F, 14, 1, 5, 0.0F);
		this.setRotateAngle(WingLFeatherExt3, 0.0F, -0.6981317007977318F, 0.0F);
		this.LegR3 = new ModelRenderer(this, 18, 178);
		this.LegR3.setRotationPoint(0.0F, 6.5F, 0.0F);
		this.LegR3.addBox(-1.5F, -1.0F, -1.5F, 3, 8, 3, 0.0F);
		this.setRotateAngle(LegR3, -1.0471975511965976F, 0.0F, -0.12217304763960307F);
		this.TailBase = new ModelRenderer(this, 91, 126);
		this.TailBase.setRotationPoint(0.0F, 1.7F, 8.5F);
		this.TailBase.addBox(-4.5F, -1.5F, -4.5F, 8, 5, 8, 0.0F);
		this.setRotateAngle(TailBase, 0.0F, -0.7853981633974483F, 0.0F);
		this.WingL2 = new ModelRenderer(this, 40, 102);
		this.WingL2.setRotationPoint(8.0F, -1.3F, -1.0F);
		this.WingL2.addBox(-3.0F, -1.5F, -3.5F, 13, 3, 7, 0.0F);
		this.setRotateAngle(WingL2, 0.0F, -1.8325957145940461F, 0.5235987755982988F);
		this.HeadBack = new ModelRenderer(this, 25, 0);
		this.HeadBack.setRotationPoint(0.0F, -6.0F, 3.5F);
		this.HeadBack.addBox(-4.0F, 0.0F, 0.0F, 8, 8, 6, 0.0F);
		this.setRotateAngle(HeadBack, -0.6283185307179586F, 0.0F, 0.0F);
		this.HeadBeakIntL = new ModelRenderer(this, 120, 11);
		this.HeadBeakIntL.setRotationPoint(3.5F, 0.0F, -4.5F);
		this.HeadBeakIntL.addBox(0.0F, 0.0F, -3.0F, 0, 4, 3, 0.0F);
		this.setRotateAngle(HeadBeakIntL, 0.0F, 0.5235987755982988F, 0.0F);
		this.WingLFeatherInt1 = new ModelRenderer(this, 44, 119);
		this.WingLFeatherInt1.setRotationPoint(2.0F, 0.0F, 3.0F);
		this.WingLFeatherInt1.addBox(-0.5F, 0.0F, -2.5F, 12, 1, 5, 0.0F);
		this.setRotateAngle(WingLFeatherInt1, 0.0F, -1.2217304763960306F, 0.0F);
		this.LegLToeM = new ModelRenderer(this, 62, 203);
		this.LegLToeM.setRotationPoint(0.0F, 1.0F, -2.5F);
		this.LegLToeM.addBox(-1.5F, -1.0F, -7.0F, 3, 2, 7, 0.0F);
		this.setRotateAngle(LegLToeM, -0.5235987755982988F, 0.0F, 0.0F);
		this.ShoulderR = new ModelRenderer(this, 10, 81);
		this.ShoulderR.setRotationPoint(-3.0F, 1.5F, -4.0F);
		this.ShoulderR.addBox(-4.5F, -2.5F, -4.5F, 6, 4, 9, 0.0F);
		this.setRotateAngle(ShoulderR, 0.0F, 0.0F, -0.9599310885968813F);
		this.LegR1 = new ModelRenderer(this, 12, 146);
		this.LegR1.setRotationPoint(-2.5F, 6.0F, 6.5F);
		this.LegR1.addBox(-4.0F, -2.5F, -3.5F, 5, 12, 7, 0.0F);
		this.setRotateAngle(LegR1, -0.6981317007977318F, 0.0F, 0.3490658503988659F);
		this.WingRFeatherInt1 = new ModelRenderer(this, 10, 119);
		this.WingRFeatherInt1.setRotationPoint(-2.0F, 0.0F, 3.0F);
		this.WingRFeatherInt1.addBox(-11.5F, 0.0F, -2.5F, 12, 1, 5, 0.0F);
		this.setRotateAngle(WingRFeatherInt1, 0.0F, 1.3962634015954636F, 0.0F);
		this.TailFeatherM = new ModelRenderer(this, 36, 230);
		this.TailFeatherM.setRotationPoint(1.0F, 0.0F, 1.0F);
		this.TailFeatherM.addBox(-2.5F, -1.0F, 0.0F, 5, 2, 24, 0.0F);
		this.setRotateAngle(TailFeatherM, -0.5235987755982988F, 0.7853981633974483F, 0.0F);
		this.JawToothL2 = new ModelRenderer(this, 120, 4);
		this.JawToothL2.setRotationPoint(2.3F, -1.5F, -9.6F);
		this.JawToothL2.addBox(-0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F);
		this.setRotateAngle(JawToothL2, 0.7853981633974483F, 0.0F, -0.17453292519943295F);
		this.LegL2 = new ModelRenderer(this, 64, 165);
		this.LegL2.setRotationPoint(1.5F, 7.0F, 1.5F);
		this.LegL2.addBox(-2.0F, -1.0F, -2.0F, 4, 9, 4, 0.0F);
		this.setRotateAngle(LegL2, 1.9198621771937625F, 0.0F, 0.08726646259971647F);
		this.LegRTalonM = new ModelRenderer(this, 21, 212);
		this.LegRTalonM.setRotationPoint(0.5F, 0.5F, -6.5F);
		this.LegRTalonM.addBox(-1.0F, -0.7F, -0.7F, 1, 5, 2, 0.0F);
		this.setRotateAngle(LegRTalonM, 0.17453292519943295F, 0.0F, 0.0F);
		this.JawFrontL = new ModelRenderer(this, 106, 25);
		this.JawFrontL.setRotationPoint(1.3F, 0.0F, -9.8F);
		this.JawFrontL.addBox(-3.0F, -1.6F, -3.0F, 3, 4, 3, 0.0F);
		this.setRotateAngle(JawFrontL, -0.05235987755982988F, -0.7853981633974483F, 0.0F);
		this.JawToothL1 = new ModelRenderer(this, 119, 0);
		this.JawToothL1.setRotationPoint(-1.5F, -1.6F, -2.3F);
		this.JawToothL1.addBox(-1.0F, -1.0F, -0.5F, 2, 2, 2, 0.0F);
		this.setRotateAngle(JawToothL1, 0.0F, 0.0F, 0.7853981633974483F);
		this.JawToothR2 = new ModelRenderer(this, 86, 4);
		this.JawToothR2.setRotationPoint(-2.3F, -1.5F, -9.6F);
		this.JawToothR2.addBox(-0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F);
		this.setRotateAngle(JawToothR2, 0.7853981633974483F, 0.0F, 0.17453292519943295F);
		this.LegRToeR = new ModelRenderer(this, 0, 203);
		this.LegRToeR.setRotationPoint(-1.0F, 1.0F, -2.5F);
		this.LegRToeR.addBox(-1.0F, -1.0F, -5.0F, 2, 2, 5, 0.0F);
		this.setRotateAngle(LegRToeR, -0.17453292519943295F, 0.5235987755982988F, 0.0F);
		this.BodyMain = new ModelRenderer(this, 86, 92);
		this.BodyMain.setRotationPoint(0.0F, 1.1F, 0.0F);
		this.BodyMain.addBox(-4.5F, 0.0F, -5.0F, 9, 10, 12, 0.0F);
		this.WingR2 = new ModelRenderer(this, 0, 102);
		this.WingR2.setRotationPoint(-8.0F, -1.3F, -1.0F);
		this.WingR2.addBox(-10.0F, -1.5F, -3.5F, 13, 3, 7, 0.0F);
		this.setRotateAngle(WingR2, 0.0F, 1.8325957145940461F, -0.5235987755982988F);
		this.WingR3 = new ModelRenderer(this, 0, 0);
		this.WingR3.setRotationPoint(-9.0F, 0.0F, 0.0F);
		this.WingR3.addBox(1.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F);
		this.setRotateAngle(WingR3, 0.0F, 0.2617993877991494F, -0.17453292519943295F);
		this.HeadFront = new ModelRenderer(this, 27, 42);
		this.HeadFront.setRotationPoint(0.0F, 0.5F, -4.5F);
		this.HeadFront.addBox(-3.0F, -6.0F, -3.0F, 6, 6, 6, 0.0F);
		this.setRotateAngle(HeadFront, 0.0F, 0.7853981633974483F, 0.0F);
		this.JawToothL3 = new ModelRenderer(this, 120, 8);
		this.JawToothL3.setRotationPoint(2.3F, -1.5F, -6.5F);
		this.JawToothL3.addBox(-0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F);
		this.setRotateAngle(JawToothL3, 0.7853981633974483F, 0.0F, -0.17453292519943295F);
		this.JawToothR3 = new ModelRenderer(this, 86, 8);
		this.JawToothR3.setRotationPoint(-2.3F, -1.5F, -6.5F);
		this.JawToothR3.addBox(-0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F);
		this.setRotateAngle(JawToothR3, 0.7853981633974483F, 0.0F, 0.17453292519943295F);
		this.LegL1 = new ModelRenderer(this, 60, 146);
		this.LegL1.setRotationPoint(2.5F, 6.0F, 6.5F);
		this.LegL1.addBox(-1.0F, -2.5F, -3.5F, 5, 12, 7, 0.0F);
		this.setRotateAngle(LegL1, -0.6981317007977318F, 0.0F, -0.3490658503988659F);
		this.LegLFoot = new ModelRenderer(this, 63, 196);
		this.LegLFoot.setRotationPoint(0.0F, 0.0F, -1.5F);
		this.LegLFoot.addBox(-2.0F, 0.0F, -3.5F, 4, 2, 5, 0.0F);
		this.setRotateAngle(LegLFoot, -0.593411945678072F, 0.0F, 0.0F);
		this.LegLTalonM = new ModelRenderer(this, 69, 212);
		this.LegLTalonM.setRotationPoint(0.5F, 0.5F, -6.5F);
		this.LegLTalonM.addBox(-1.0F, -0.7F, -0.7F, 1, 5, 2, 0.0F);
		this.setRotateAngle(LegLTalonM, 0.17453292519943295F, 0.0F, 0.0F);
		this.LegLTalonR = new ModelRenderer(this, 53, 210);
		this.LegLTalonR.setRotationPoint(0.0F, 0.5F, -4.5F);
		this.LegLTalonR.addBox(-0.5F, -0.6F, -0.7F, 1, 2, 1, 0.0F);
		this.setRotateAngle(LegLTalonR, 0.17453292519943295F, 0.0F, 0.0F);
		this.WingLFeatherExt1 = new ModelRenderer(this, 44, 137);
		this.WingLFeatherExt1.setRotationPoint(0.0F, 0.0F, -1.0F);
		this.WingLFeatherExt1.addBox(0.0F, -1.0F, -2.5F, 17, 1, 5, 0.0F);
		this.setRotateAngle(WingLFeatherExt1, 0.0F, 0.17453292519943295F, 0.0F);
		this.WingR1 = new ModelRenderer(this, 8, 94);
		this.WingR1.setRotationPoint(-2.5F, 0.0F, 0.0F);
		this.WingR1.addBox(-7.5F, -2.0F, -4.0F, 10, 2, 6, 0.0F);
		this.setRotateAngle(WingR1, 0.0F, -0.17453292519943295F, 0.0F);
		this.HeadBrow = new ModelRenderer(this, 25, 32);
		this.HeadBrow.setRotationPoint(0.0F, -5.9F, -5.0F);
		this.HeadBrow.addBox(-3.5F, 0.0F, -3.5F, 7, 3, 7, 0.0F);
		this.setRotateAngle(HeadBrow, 0.0F, 0.7853981633974483F, 0.0F);
		this.HeadFeatherL1 = new ModelRenderer(this, 56, 4);
		this.HeadFeatherL1.setRotationPoint(3.5F, -4.0F, 2.0F);
		this.HeadFeatherL1.addBox(-0.5F, -2.0F, -1.0F, 1, 4, 10, 0.0F);
		this.setRotateAngle(HeadFeatherL1, 0.17453292519943295F, 0.3490658503988659F, 0.0F);
		this.LegRTalonR = new ModelRenderer(this, 5, 210);
		this.LegRTalonR.setRotationPoint(0.0F, 0.5F, -4.5F);
		this.LegRTalonR.addBox(-0.5F, -0.6F, -0.7F, 1, 2, 1, 0.0F);
		this.setRotateAngle(LegRTalonR, 0.17453292519943295F, 0.0F, 0.0F);
		this.LegLTalonL = new ModelRenderer(this, 87, 210);
		this.LegLTalonL.setRotationPoint(0.0F, 0.5F, -4.5F);
		this.LegLTalonL.addBox(-0.5F, -0.6F, -0.7F, 1, 2, 1, 0.0F);
		this.setRotateAngle(LegLTalonL, 0.17453292519943295F, 0.0F, 0.0F);
		this.LegRTalonL = new ModelRenderer(this, 39, 210);
		this.LegRTalonL.setRotationPoint(0.0F, 0.5F, -4.5F);
		this.LegRTalonL.addBox(-0.5F, -0.6F, -0.7F, 1, 2, 1, 0.0F);
		this.setRotateAngle(LegRTalonL, 0.17453292519943295F, 0.0F, 0.0F);
		this.WingRFeatherExt2 = new ModelRenderer(this, 2, 131);
		this.WingRFeatherExt2.setRotationPoint(0.0F, 0.5F, 2.0F);
		this.WingRFeatherExt2.addBox(-14.0F, -1.0F, -2.5F, 16, 1, 5, 0.0F);
		this.setRotateAngle(WingRFeatherExt2, 0.0F, 0.17453292519943295F, 0.0F);
		this.HeadFeatherR2 = new ModelRenderer(this, 0, 18);
		this.HeadFeatherR2.setRotationPoint(-3.5F, 1.0F, 1.9F);
		this.HeadFeatherR2.addBox(-0.5F, -2.0F, -1.0F, 1, 4, 10, 0.0F);
		this.setRotateAngle(HeadFeatherR2, -0.17453292519943295F, -0.3490658503988659F, 0.0F);
		this.TailFeatherR = new ModelRenderer(this, 10, 230);
		this.TailFeatherR.setRotationPoint(-1.0F, 1.0F, 3.0F);
		this.TailFeatherR.addBox(-2.5F, -1.0F, 0.0F, 5, 2, 20, 0.0F);
		this.setRotateAngle(TailFeatherR, -0.5235987755982988F, 0.0F, 0.0F);
		this.LegR2 = new ModelRenderer(this, 16, 165);
		this.LegR2.setRotationPoint(-1.5F, 7.0F, 1.5F);
		this.LegR2.addBox(-2.0F, -1.0F, -2.0F, 4, 9, 4, 0.0F);
		this.setRotateAngle(LegR2, 1.9198621771937625F, 0.0F, -0.08726646259971647F);
		this.JawToothL1_1 = new ModelRenderer(this, 85, 0);
		this.JawToothL1_1.setRotationPoint(1.5F, -1.6F, -2.3F);
		this.JawToothL1_1.addBox(-1.0F, -1.0F, -0.5F, 2, 2, 2, 0.0F);
		this.setRotateAngle(JawToothL1_1, 0.0F, 0.0F, 0.7853981633974483F);
		this.Neck = new ModelRenderer(this, 96, 47);
		this.Neck.setRotationPoint(0.0F, 4.0F, -7.0F);
		this.Neck.addBox(-2.5F, -13.0F, -3.0F, 5, 17, 6, 0.0F);
		this.HeadFeatherR1 = new ModelRenderer(this, 0, 4);
		this.HeadFeatherR1.setRotationPoint(-3.5F, -4.0F, 2.0F);
		this.HeadFeatherR1.addBox(-0.5F, -2.0F, -1.0F, 1, 4, 10, 0.0F);
		this.setRotateAngle(HeadFeatherR1, 0.17453292519943295F, -0.3490658503988659F, 0.0F);
		this.ShoulderL = new ModelRenderer(this, 40, 81);
		this.ShoulderL.setRotationPoint(3.0F, 1.5F, -4.0F);
		this.ShoulderL.addBox(-1.5F, -2.5F, -4.5F, 6, 4, 9, 0.0F);
		this.setRotateAngle(ShoulderL, 0.0F, 0.0F, 0.9599310885968813F);
		this.WingL1 = new ModelRenderer(this, 40, 94);
		this.WingL1.setRotationPoint(2.5F, 0.0F, 0.0F);
		this.WingL1.addBox(-2.5F, -2.0F, -4.0F, 10, 2, 6, 0.0F);
		this.setRotateAngle(WingL1, 0.0F, 0.17453292519943295F, 0.0F);
		this.HeadFeatherL2 = new ModelRenderer(this, 56, 18);
		this.HeadFeatherL2.setRotationPoint(3.5F, 1.0F, 2.0F);
		this.HeadFeatherL2.addBox(-0.5F, -2.0F, -1.0F, 1, 4, 10, 0.0F);
		this.setRotateAngle(HeadFeatherL2, -0.17453292519943295F, 0.3490658503988659F, 0.0F);
		this.LegRFoot = new ModelRenderer(this, 15, 196);
		this.LegRFoot.setRotationPoint(0.0F, 0.0F, -1.5F);
		this.LegRFoot.addBox(-2.0F, 0.0F, -3.5F, 4, 2, 5, 0.0F);
		this.setRotateAngle(LegRFoot, -0.593411945678072F, 0.0F, 0.0F);
		this.LegLToeR = new ModelRenderer(this, 48, 203);
		this.LegLToeR.setRotationPoint(-1.0F, 1.0F, -2.5F);
		this.LegLToeR.addBox(-1.0F, -1.0F, -5.0F, 2, 2, 5, 0.0F);
		this.setRotateAngle(LegLToeR, -0.17453292519943295F, 0.5235987755982988F, 0.0F);
		this.TailFeatherL = new ModelRenderer(this, 70, 230);
		this.TailFeatherL.setRotationPoint(3.0F, 1.0F, -1.0F);
		this.TailFeatherL.addBox(-2.5F, -1.0F, 0.0F, 5, 2, 20, 0.0F);
		this.setRotateAngle(TailFeatherL, -0.5235987755982988F, 1.5707963267948966F, 0.0F);
		this.BodyBack = new ModelRenderer(this, 95, 114);
		this.BodyBack.setRotationPoint(0.0F, 1.0F, 7.0F);
		this.BodyBack.addBox(-3.0F, 1.2F, -0.6F, 6, 6, 6, 0.0F);
		this.setRotateAngle(BodyBack, -0.6457718232379019F, 0.0F, 0.0F);
		this.HeadBeakFrontR = new ModelRenderer(this, 31, 69);
		this.HeadBeakFrontR.setRotationPoint(-1.2F, 2.0F, -10.7F);
		this.HeadBeakFrontR.addBox(-2.0F, -5.7F, 0.0F, 2, 6, 2, 0.0F);
		this.setRotateAngle(HeadBeakFrontR, 0.05235987755982988F, 0.7853981633974483F, 0.0F);
		this.HeadBeakIntR = new ModelRenderer(this, 86, 11);
		this.HeadBeakIntR.setRotationPoint(-3.5F, 0.0F, -4.5F);
		this.HeadBeakIntR.addBox(0.0F, 0.0F, -3.0F, 0, 4, 3, 0.0F);
		this.setRotateAngle(HeadBeakIntR, 0.0F, -0.5235987755982988F, 0.0F);
		this.BodyFront = new ModelRenderer(this, 87, 70);
		this.BodyFront.setRotationPoint(0.0F, -0.5F, -4.0F);
		this.BodyFront.addBox(-4.0F, 0.0F, -9.0F, 8, 10, 12, 0.0F);
		this.setRotateAngle(BodyFront, -0.17453292519943295F, 0.0F, 0.0F);
		this.WingLFeatherInt2 = new ModelRenderer(this, 44, 113);
		this.WingLFeatherInt2.setRotationPoint(6.0F, -1.5F, 0.5F);
		this.WingLFeatherInt2.addBox(-0.5F, 0.0F, -2.5F, 11, 1, 5, 0.0F);
		this.setRotateAngle(WingLFeatherInt2, 0.0F, -1.9198621771937625F, 0.0F);
		this.WingRFeatherInt2 = new ModelRenderer(this, 12, 113);
		this.WingRFeatherInt2.setRotationPoint(-6.0F, -1.5F, 0.5F);
		this.WingRFeatherInt2.addBox(-11.5F, 0.0F, -2.5F, 11, 1, 5, 0.0F);
		this.setRotateAngle(WingRFeatherInt2, 0.0F, 1.7453292519943295F, 0.0F);
		this.JawBack = new ModelRenderer(this, 92, 0);
		this.JawBack.setRotationPoint(0.0F, 0.0F, -3.0F);
		this.JawBack.addBox(-3.5F, -1.6F, -3.5F, 7, 4, 7, 0.0F);
		this.setRotateAngle(JawBack, 0.0F, -0.7853981633974483F, 0.0F);
		this.HeadBeakMain = new ModelRenderer(this, 25, 54);
		this.HeadBeakMain.setRotationPoint(0.0F, -2.0F, -4.7F);
		this.HeadBeakMain.addBox(-2.5F, -3.8F, -9.4F, 5, 6, 9, 0.0F);
		this.setRotateAngle(HeadBeakMain, 0.13962634015954636F, 0.0F, 0.0F);
		this.WingLFeatherExt2 = new ModelRenderer(this, 44, 131);
		this.WingLFeatherExt2.setRotationPoint(0.0F, 0.5F, 2.0F);
		this.WingLFeatherExt2.addBox(-2.0F, -1.0F, -2.5F, 16, 1, 5, 0.0F);
		this.setRotateAngle(WingLFeatherExt2, 0.0F, -0.17453292519943295F, 0.0F);
		this.WingL3 = new ModelRenderer(this, 0, 0);
		this.WingL3.setRotationPoint(9.0F, 0.0F, 0.0F);
		this.WingL3.addBox(-3.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F);
		this.setRotateAngle(WingL3, 0.0F, -0.2617993877991494F, 0.17453292519943295F);
		this.WingRFeatherExt1 = new ModelRenderer(this, 0, 137);
		this.WingRFeatherExt1.setRotationPoint(0.0F, 0.0F, -1.0F);
		this.WingRFeatherExt1.addBox(-17.0F, -1.0F, -2.5F, 17, 1, 5, 0.0F);
		this.setRotateAngle(WingRFeatherExt1, 0.0F, -0.17453292519943295F, 0.0F);
		this.JawFrontR = new ModelRenderer(this, 94, 25);
		this.JawFrontR.setRotationPoint(-1.3F, 0.0F, -9.8F);
		this.JawFrontR.addBox(0.0F, -1.6F, -3.0F, 3, 4, 3, 0.0F);
		this.setRotateAngle(JawFrontR, -0.05235987755982988F, 0.7853981633974483F, 0.0F);
		this.LegL3 = new ModelRenderer(this, 66, 178);
		this.LegL3.setRotationPoint(0.0F, 6.5F, 0.0F);
		this.LegL3.addBox(-1.5F, -1.0F, -1.5F, 3, 8, 3, 0.0F);
		this.setRotateAngle(LegL3, -1.0471975511965976F, 0.0F, 0.12217304763960307F);
		this.LegLAnkle = new ModelRenderer(this, 65, 189);
		this.LegLAnkle.setRotationPoint(0.0F, 7.0F, 0.0F);
		this.LegLAnkle.addBox(-1.0F, -1.0F, -3.0F, 2, 2, 5, 0.0F);
		this.setRotateAngle(LegLAnkle, 0.4363323129985824F, 0.0F, 0.24434609527920614F);
		this.LegRToeL = new ModelRenderer(this, 34, 203);
		this.LegRToeL.setRotationPoint(1.0F, 1.0F, -2.5F);
		this.LegRToeL.addBox(-1.0F, -1.0F, -5.0F, 2, 2, 5, 0.0F);
		this.setRotateAngle(LegRToeL, -0.17453292519943295F, -0.5235987755982988F, 0.0F);
		this.WingRFeatherExt3 = new ModelRenderer(this, 6, 125);
		this.WingRFeatherExt3.setRotationPoint(2.0F, 1.0F, 3.0F);
		this.WingRFeatherExt3.addBox(-12.5F, -1.0F, -2.5F, 14, 1, 5, 0.0F);
		this.setRotateAngle(WingRFeatherExt3, 0.0F, 0.6981317007977318F, 0.0F);
		this.LegRAnkle = new ModelRenderer(this, 17, 189);
		this.LegRAnkle.setRotationPoint(0.0F, 7.0F, 0.0F);
		this.LegRAnkle.addBox(-1.0F, -1.0F, -3.0F, 2, 2, 5, 0.0F);
		this.setRotateAngle(LegRAnkle, 0.4363323129985824F, 0.0F, -0.24434609527920614F);
		this.LegRToeM = new ModelRenderer(this, 14, 203);
		this.LegRToeM.setRotationPoint(0.0F, 1.0F, -2.5F);
		this.LegRToeM.addBox(-1.5F, -1.0F, -7.0F, 3, 2, 7, 0.0F);
		this.setRotateAngle(LegRToeM, -0.5235987755982988F, 0.0F, 0.0F);
		this.JawMain = new ModelRenderer(this, 90, 11);
		this.JawMain.setRotationPoint(0.0F, 2.0F, -2.0F);
		this.JawMain.addBox(-3.0F, -1.7F, -11.5F, 6, 4, 10, 0.0F);
		this.HeadBeakFrontL = new ModelRenderer(this, 39, 69);
		this.HeadBeakFrontL.setRotationPoint(1.2F, 2.0F, -10.7F);
		this.HeadBeakFrontL.addBox(0.0F, -5.7F, 0.0F, 2, 6, 2, 0.0F);
		this.setRotateAngle(HeadBeakFrontL, 0.05235987755982988F, -0.7853981633974483F, 0.0F);
		this.Neck.addChild(this.HeadMain);
		this.LegLFoot.addChild(this.LegLToeL);
		this.WingL3.addChild(this.WingLFeatherExt3);
		this.LegR2.addChild(this.LegR3);
		this.BodyMain.addChild(this.TailBase);
		this.WingL1.addChild(this.WingL2);
		this.HeadMain.addChild(this.HeadBack);
		this.HeadMain.addChild(this.HeadBeakIntL);
		this.WingL2.addChild(this.WingLFeatherInt1);
		this.LegLFoot.addChild(this.LegLToeM);
		this.BodyFront.addChild(this.ShoulderR);
		this.BodyMain.addChild(this.LegR1);
		this.WingR2.addChild(this.WingRFeatherInt1);
		this.TailBase.addChild(this.TailFeatherM);
		this.JawMain.addChild(this.JawToothL2);
		this.LegL1.addChild(this.LegL2);
		this.LegRToeM.addChild(this.LegRTalonM);
		this.JawMain.addChild(this.JawFrontL);
		this.JawFrontL.addChild(this.JawToothL1);
		this.JawMain.addChild(this.JawToothR2);
		this.LegRFoot.addChild(this.LegRToeR);
		this.WingR1.addChild(this.WingR2);
		this.WingR2.addChild(this.WingR3);
		this.HeadMain.addChild(this.HeadFront);
		this.JawMain.addChild(this.JawToothL3);
		this.JawMain.addChild(this.JawToothR3);
		this.BodyMain.addChild(this.LegL1);
		this.LegLAnkle.addChild(this.LegLFoot);
		this.LegLToeM.addChild(this.LegLTalonM);
		this.LegLToeR.addChild(this.LegLTalonR);
		this.WingL3.addChild(this.WingLFeatherExt1);
		this.ShoulderR.addChild(this.WingR1);
		this.HeadMain.addChild(this.HeadBrow);
		this.HeadMain.addChild(this.HeadFeatherL1);
		this.LegRToeR.addChild(this.LegRTalonR);
		this.LegLToeL.addChild(this.LegLTalonL);
		this.LegRToeL.addChild(this.LegRTalonL);
		this.WingR3.addChild(this.WingRFeatherExt2);
		this.HeadMain.addChild(this.HeadFeatherR2);
		this.TailBase.addChild(this.TailFeatherR);
		this.LegR1.addChild(this.LegR2);
		this.JawFrontR.addChild(this.JawToothL1_1);
		this.BodyFront.addChild(this.Neck);
		this.HeadMain.addChild(this.HeadFeatherR1);
		this.BodyFront.addChild(this.ShoulderL);
		this.ShoulderL.addChild(this.WingL1);
		this.HeadMain.addChild(this.HeadFeatherL2);
		this.LegRAnkle.addChild(this.LegRFoot);
		this.LegLFoot.addChild(this.LegLToeR);
		this.TailBase.addChild(this.TailFeatherL);
		this.BodyMain.addChild(this.BodyBack);
		this.HeadBeakMain.addChild(this.HeadBeakFrontR);
		this.HeadMain.addChild(this.HeadBeakIntR);
		this.BodyMain.addChild(this.BodyFront);
		this.WingL1.addChild(this.WingLFeatherInt2);
		this.WingR1.addChild(this.WingRFeatherInt2);
		this.JawMain.addChild(this.JawBack);
		this.HeadMain.addChild(this.HeadBeakMain);
		this.WingL3.addChild(this.WingLFeatherExt2);
		this.WingL2.addChild(this.WingL3);
		this.WingR3.addChild(this.WingRFeatherExt1);
		this.JawMain.addChild(this.JawFrontR);
		this.LegL2.addChild(this.LegL3);
		this.LegL3.addChild(this.LegLAnkle);
		this.LegRFoot.addChild(this.LegRToeL);
		this.WingR3.addChild(this.WingRFeatherExt3);
		this.LegR3.addChild(this.LegRAnkle);
		this.LegRFoot.addChild(this.LegRToeM);
		this.HeadMain.addChild(this.JawMain);
		this.HeadBeakMain.addChild(this.HeadBeakFrontL);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.BodyMain.render(f5);
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
