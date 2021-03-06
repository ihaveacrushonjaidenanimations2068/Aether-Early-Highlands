package com.gildedgames.aether.client.models.entities.living;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelBattleSentry - Either Mojang or a mod author
 * Created using Tabula 6.0.0
 */
public class ModelBattleSentry extends ModelBase {
    public ModelRenderer leg_right_crest_top;
    public ModelRenderer body_left_shoulder_main;
    public ModelRenderer leg_left_main_bottom;
    public ModelRenderer body_left_shoulder_right_back;
    public ModelRenderer body_left_shoulder_ridge_front;
    public ModelRenderer foot_left_3;
    public ModelRenderer foot_left_1;
    public ModelRenderer foot_left_2;
    public ModelRenderer foot_right_3;
    public ModelRenderer body_eye;
    public ModelRenderer leg_right_crest_mid;
    public ModelRenderer foot_right_2;
    public ModelRenderer body_left_shoulder_ridge_top;
    public ModelRenderer foot_right_1;
    public ModelRenderer body_main_jaw_right;
    public ModelRenderer body_right_shoulder_ridge_front;
    public ModelRenderer body_main;
    public ModelRenderer body_jaw_mid;
    public ModelRenderer body_main_back_bottom;
    public ModelRenderer leg_left_crest_top;
    public ModelRenderer leg_right_joint;
    public ModelRenderer body_crest_left_top;
    public ModelRenderer body_main_jaw_left;
    public ModelRenderer leg_left_crest_mid;
    public ModelRenderer body_crest_top;
    public ModelRenderer body_right_shoulder_main;
    public ModelRenderer leg_left_joint;
    public ModelRenderer leg_right_main_bottom;
    public ModelRenderer body_main_top;
    public ModelRenderer Blade;
    public ModelRenderer leg_right_main;
    public ModelRenderer body_main_back_top;
    public ModelRenderer body_main_bottom;
    public ModelRenderer leg_left_main;
    public ModelRenderer body_crest_right_top;
    public ModelRenderer body_crest_left_bottom;
    public ModelRenderer body_crest_right_bottom;
    public ModelRenderer body_right_shoulder_ridge_top;
    public ModelRenderer body_right_shoulder_ridge_back;

    public ModelBattleSentry() {
        this.textureWidth = 256;
        this.textureHeight = 256;
        this.body_main_jaw_right = new ModelRenderer(this, 0, 131);
        this.body_main_jaw_right.setRotationPoint(-6.0F, 18.0F, -8.0F);
        this.body_main_jaw_right.addBox(-1.0F, -2.0F, -1.0F, 3, 6, 3, 0.0F);
        this.setRotateAngle(body_main_jaw_right, 0.08726646006107329F, 0.34906584024429316F, -0.5235987901687622F);
        this.leg_right_crest_top = new ModelRenderer(this, 66, 0);
        this.leg_right_crest_top.setRotationPoint(-8.0F, 17.0F, 1.5F);
        this.leg_right_crest_top.addBox(-4.0F, -8.0F, 1.0F, 3, 5, 10, 0.0F);
        this.setRotateAngle(leg_right_crest_top, 0.34906584024429316F, 0.0F, 0.0F);
        this.leg_right_main_bottom = new ModelRenderer(this, 92, 142);
        this.leg_right_main_bottom.setRotationPoint(-8.0F, 17.0F, 1.5F);
        this.leg_right_main_bottom.addBox(-4.0F, 2.0F, 0.0F, 3, 2, 4, 0.0F);
        this.foot_right_3 = new ModelRenderer(this, 0, 103);
        this.foot_right_3.setRotationPoint(-8.0F, 17.0F, 1.5F);
        this.foot_right_3.addBox(-4.800000190734863F, 3.799999952316284F, -16.0F, 4, 3, 4, 1.1920928955078125E-7F);
        this.setRotateAngle(foot_right_3, 0.08726646006107329F, 0.17453292012214658F, 0.0F);
        this.leg_right_joint = new ModelRenderer(this, 29, 83);
        this.leg_right_joint.setRotationPoint(-8.0F, 17.0F, 1.5F);
        this.leg_right_joint.addBox(-0.5F, -1.5F, -1.5F, 1, 3, 3, 0.0F);
        this.body_main_back_bottom = new ModelRenderer(this, 88, 8);
        this.body_main_back_bottom.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_main_back_bottom.addBox(-5.5F, 17.5F, -11.0F, 11, 4, 2, 0.0F);
        this.setRotateAngle(body_main_back_bottom, 0.7853981852531433F, 0.0F, 0.0F);
        this.body_main = new ModelRenderer(this, 0, 182);
        this.body_main.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_main.addBox(-6.0F, 13.0F, -6.0F, 12, 8, 12, 0.0F);
        this.body_main_jaw_left = new ModelRenderer(this, 128, 117);
        this.body_main_jaw_left.setRotationPoint(6.0F, 18.0F, -8.0F);
        this.body_main_jaw_left.addBox(-2.0F, -2.0F, -1.0F, 3, 6, 3, 0.0F);
        this.setRotateAngle(body_main_jaw_left, 0.08726646006107329F, -0.34906584024429316F, 0.5235987901687622F);
        this.foot_right_1 = new ModelRenderer(this, 70, 105);
        this.foot_right_1.setRotationPoint(-8.0F, 17.0F, 1.5F);
        this.foot_right_1.addBox(-5.5F, 4.0F, -2.0F, 6, 3, 6, 0.0F);
        this.setRotateAngle(foot_right_1, 0.0F, 0.17453292012214658F, 0.0F);
        this.foot_left_3 = new ModelRenderer(this, 0, 74);
        this.foot_left_3.setRotationPoint(7.0F, 17.0F, 1.5F);
        this.foot_left_3.addBox(1.7999999523162842F, 3.799999952316284F, -16.0F, 4, 3, 4, 1.1920928955078125E-7F);
        this.setRotateAngle(foot_left_3, 0.08726646006107329F, -0.17453292012214658F, 0.0F);
        this.foot_left_2 = new ModelRenderer(this, 0, 86);
        this.foot_left_2.setRotationPoint(7.0F, 17.0F, 1.5F);
        this.foot_left_2.addBox(2.0F, 4.0F, -12.0F, 3, 2, 10, 0.0F);
        this.setRotateAngle(foot_left_2, 0.08726646006107329F, -0.17453292012214658F, 0.0F);
        this.body_left_shoulder_right_back = new ModelRenderer(this, 6, 26);
        this.body_left_shoulder_right_back.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_left_shoulder_right_back.addBox(1.5F, 10.0F, -8.0F, 7, 7, 2, 0.0F);
        this.setRotateAngle(body_left_shoulder_right_back, 0.7853981852531433F, 0.0F, 0.0F);
        this.body_main_bottom = new ModelRenderer(this, 185, 212);
        this.body_main_bottom.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_main_bottom.addBox(-6.5F, 21.0F, -8.0F, 13, 3, 17, 0.0F);
        this.Blade = new ModelRenderer(this, 115, 183);
        this.Blade.setRotationPoint(0.0F, 23.0F, -1.0F);
        this.Blade.addBox(0.0F, 0.0F, -11.0F, 11, 1, 11, 0.0F);
        this.setRotateAngle(Blade, 0.0F, 0.7853981852531433F, 0.0F);
        this.body_right_shoulder_ridge_front = new ModelRenderer(this, 21, 128);
        this.body_right_shoulder_ridge_front.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_right_shoulder_ridge_front.addBox(-8.5F, 8.0F, 8.0F, 3, 7, 2, 0.0F);
        this.setRotateAngle(body_right_shoulder_ridge_front, -0.7853981852531433F, 0.0F, 0.0F);
        this.leg_left_crest_mid = new ModelRenderer(this, 45, 121);
        this.leg_left_crest_mid.setRotationPoint(7.0F, 17.0F, 1.5F);
        this.leg_left_crest_mid.addBox(2.5F, -10.0F, -2.0F, 2, 13, 6, 0.0F);
        this.setRotateAngle(leg_left_crest_mid, -0.5235987901687622F, 0.0F, 0.0F);
        this.foot_right_2 = new ModelRenderer(this, 21, 63);
        this.foot_right_2.setRotationPoint(-8.0F, 17.0F, 1.5F);
        this.foot_right_2.addBox(-4.0F, 4.0F, -12.0F, 3, 2, 10, 0.0F);
        this.setRotateAngle(foot_right_2, 0.08726646006107329F, 0.17453292012214658F, 0.0F);
        this.body_left_shoulder_main = new ModelRenderer(this, 35, 29);
        this.body_left_shoulder_main.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_left_shoulder_main.addBox(5.5F, 8.0F, 10.0F, 2, 6, 6, 0.0F);
        this.setRotateAngle(body_left_shoulder_main, -0.7853981852531433F, 0.0F, 0.0F);
        this.body_eye = new ModelRenderer(this, 56, 67);
        this.body_eye.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_eye.addBox(-5.5F, 12.0F, -8.0F, 11, 11, 2, 0.0F);
        this.leg_right_crest_mid = new ModelRenderer(this, 84, 38);
        this.leg_right_crest_mid.setRotationPoint(-8.0F, 17.0F, 1.5F);
        this.leg_right_crest_mid.addBox(-3.5F, -10.0F, -2.0F, 2, 13, 6, 0.0F);
        this.setRotateAngle(leg_right_crest_mid, -0.5235987901687622F, 0.0F, 0.0F);
        this.body_crest_top = new ModelRenderer(this, 145, 121);
        this.body_crest_top.setRotationPoint(0.0F, 12.0F, -8.0F);
        this.body_crest_top.addBox(-4.0F, -2.0F, -1.0F, 8, 3, 13, 0.0F);
        this.setRotateAngle(body_crest_top, 0.9599310755729675F, 0.0F, 0.0F);
        this.leg_right_main = new ModelRenderer(this, 138, 0);
        this.leg_right_main.setRotationPoint(-8.0F, 17.0F, 1.5F);
        this.leg_right_main.addBox(-4.5F, -8.0F, -4.0F, 4, 10, 8, 0.0F);
        this.body_main_back_top = new ModelRenderer(this, 192, 31);
        this.body_main_back_top.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_main_back_top.addBox(-5.5F, 2.5F, 13.0F, 11, 4, 2, 0.0F);
        this.setRotateAngle(body_main_back_top, -0.7853981852531433F, 0.0F, 0.0F);
        this.leg_left_crest_top = new ModelRenderer(this, 148, 84);
        this.leg_left_crest_top.setRotationPoint(7.0F, 17.0F, 1.5F);
        this.leg_left_crest_top.addBox(2.0F, -8.0F, 1.0F, 3, 5, 10, 0.0F);
        this.setRotateAngle(leg_left_crest_top, 0.34906584024429316F, 0.0F, 0.0F);
        this.leg_left_joint = new ModelRenderer(this, 141, 30);
        this.leg_left_joint.setRotationPoint(7.0F, 17.0F, 1.5F);
        this.leg_left_joint.addBox(0.5F, -1.5F, -1.5F, 1, 3, 3, 0.0F);
        this.body_crest_right_bottom = new ModelRenderer(this, 161, 39);
        this.body_crest_right_bottom.setRotationPoint(-6.0F, 18.0F, -8.0F);
        this.body_crest_right_bottom.addBox(-0.5F, -2.5F, -1.5F, 5, 4, 2, 0.0F);
        this.setRotateAngle(body_crest_right_bottom, 0.0F, -2.7925267219543453F, 0.0F);
        this.leg_left_main_bottom = new ModelRenderer(this, 31, 51);
        this.leg_left_main_bottom.setRotationPoint(7.0F, 17.0F, 1.5F);
        this.leg_left_main_bottom.addBox(2.0F, 2.0F, 0.0F, 3, 2, 4, 0.0F);
        this.body_left_shoulder_ridge_front = new ModelRenderer(this, 12, 48);
        this.body_left_shoulder_ridge_front.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_left_shoulder_ridge_front.addBox(5.5F, 8.0F, 8.0F, 3, 7, 2, 0.0F);
        this.setRotateAngle(body_left_shoulder_ridge_front, -0.7853981852531433F, 0.0F, 0.0F);
        this.body_jaw_mid = new ModelRenderer(this, 109, 41);
        this.body_jaw_mid.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_jaw_mid.addBox(2.0F, 20.0F, -10.0F, 8, 3, 8, 0.0F);
        this.setRotateAngle(body_jaw_mid, 0.0F, 0.7853981852531433F, 0.0F);
        this.leg_left_main = new ModelRenderer(this, 213, 118);
        this.leg_left_main.setRotationPoint(7.0F, 17.0F, 1.5F);
        this.leg_left_main.addBox(1.5F, -8.0F, -4.0F, 4, 10, 8, 0.0F);
        this.body_right_shoulder_main = new ModelRenderer(this, 0, 154);
        this.body_right_shoulder_main.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_right_shoulder_main.addBox(-7.5F, 8.0F, 10.0F, 2, 6, 6, 0.0F);
        this.setRotateAngle(body_right_shoulder_main, -0.7853981852531433F, 0.0F, 0.0F);
        this.foot_left_1 = new ModelRenderer(this, 48, 49);
        this.foot_left_1.setRotationPoint(7.0F, 17.0F, 1.5F);
        this.foot_left_1.addBox(0.5F, 4.0F, -2.0F, 6, 3, 6, 0.0F);
        this.setRotateAngle(foot_left_1, 0.0F, -0.17453292012214658F, 0.0F);
        this.body_right_shoulder_ridge_top = new ModelRenderer(this, 67, 149);
        this.body_right_shoulder_ridge_top.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_right_shoulder_ridge_top.addBox(-14.5F, 5.0F, 0.0F, 7, 3, 3, 0.0F);
        this.setRotateAngle(body_right_shoulder_ridge_top, 0.0F, 0.0F, -0.5298819541931152F);
        this.body_right_shoulder_ridge_back = new ModelRenderer(this, 0, 0);
        this.body_right_shoulder_ridge_back.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_right_shoulder_ridge_back.addBox(-8.5F, 10.0F, -8.0F, 7, 7, 2, 0.0F);
        this.setRotateAngle(body_right_shoulder_ridge_back, 0.7853981852531433F, 0.0F, 0.0F);
        this.body_left_shoulder_ridge_top = new ModelRenderer(this, 49, 92);
        this.body_left_shoulder_ridge_top.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_left_shoulder_ridge_top.addBox(7.5F, 5.0F, 0.0F, 7, 3, 3, 0.0F);
        this.setRotateAngle(body_left_shoulder_ridge_top, 0.0F, 0.0F, 0.5235987901687622F);
        this.body_crest_left_bottom = new ModelRenderer(this, 91, 210);
        this.body_crest_left_bottom.setRotationPoint(6.0F, 18.0F, -8.0F);
        this.body_crest_left_bottom.addBox(-0.5F, -2.5F, -0.5F, 5, 5, 2, 0.0F);
        this.setRotateAngle(body_crest_left_bottom, 0.0F, -0.34906584024429316F, 0.0F);
        this.body_main_top = new ModelRenderer(this, 0, 216);
        this.body_main_top.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_main_top.addBox(-6.5F, 10.0F, -7.0F, 13, 3, 16, 0.0F);
        this.body_crest_left_top = new ModelRenderer(this, 22, 91);
        this.body_crest_left_top.setRotationPoint(5.0F, 14.0F, -8.0F);
        this.body_crest_left_top.addBox(-1.0F, -3.0F, -1.0F, 8, 5, 2, 0.0F);
        this.setRotateAngle(body_crest_left_top, -0.2094395160675049F, -0.5235987901687622F, -0.6108652353286743F);
        this.body_crest_right_top = new ModelRenderer(this, 85, 188);
        this.body_crest_right_top.setRotationPoint(-5.0F, 14.0F, -8.0F);
        this.body_crest_right_top.addBox(-7.0F, -3.0F, -1.0F, 8, 5, 2, 0.0F);
        this.setRotateAngle(body_crest_right_top, -0.2094395160675049F, 0.5235987901687622F, 0.6108652353286743F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.body_main_jaw_right.render(f5);
        this.leg_right_crest_top.render(f5);
        this.leg_right_main_bottom.render(f5);
        this.foot_right_3.render(f5);
        this.leg_right_joint.render(f5);
        this.body_main_back_bottom.render(f5);
        this.body_main.render(f5);
        this.body_main_jaw_left.render(f5);
        this.foot_right_1.render(f5);
        this.foot_left_3.render(f5);
        this.foot_left_2.render(f5);
        this.body_left_shoulder_right_back.render(f5);
        this.body_main_bottom.render(f5);
        this.Blade.render(f5);
        this.body_right_shoulder_ridge_front.render(f5);
        this.leg_left_crest_mid.render(f5);
        this.foot_right_2.render(f5);
        this.body_left_shoulder_main.render(f5);
        this.body_eye.render(f5);
        this.leg_right_crest_mid.render(f5);
        this.body_crest_top.render(f5);
        this.leg_right_main.render(f5);
        this.body_main_back_top.render(f5);
        this.leg_left_crest_top.render(f5);
        this.leg_left_joint.render(f5);
        this.body_crest_right_bottom.render(f5);
        this.leg_left_main_bottom.render(f5);
        this.body_left_shoulder_ridge_front.render(f5);
        this.body_jaw_mid.render(f5);
        this.leg_left_main.render(f5);
        this.body_right_shoulder_main.render(f5);
        this.foot_left_1.render(f5);
        this.body_right_shoulder_ridge_top.render(f5);
        this.body_right_shoulder_ridge_back.render(f5);
        this.body_left_shoulder_ridge_top.render(f5);
        this.body_crest_left_bottom.render(f5);
        this.body_main_top.render(f5);
        this.body_crest_left_top.render(f5);
        this.body_crest_right_top.render(f5);
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
