package com.gildedgames.aether.client.models.entities.living;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelTrackingSentry - Either Mojang or a mod author
 * Created using Tabula 6.0.0
 */
public class ModelTrackingSentry extends ModelBase {
    public ModelRenderer body_crest_left_top;
    public ModelRenderer body_crest_right_top3;
    public ModelRenderer body_crest_right_top2;
    public ModelRenderer body_crest_top;
    public ModelRenderer body_crest_bottom;
    public ModelRenderer Shape10;
    public ModelRenderer Shape11;
    public ModelRenderer Shape12;
    public ModelRenderer Shape9;
    public ModelRenderer body_crest_right_top;
    public ModelRenderer body_eye;
    public ModelRenderer body_crest_left_bottom;
    public ModelRenderer body_crest_right_bottom;
    public ModelRenderer Shape2;
    public ModelRenderer Shape1;
    public ModelRenderer Shape4;
    public ModelRenderer Shape3;
    public ModelRenderer Shape6;
    public ModelRenderer Shape5;
    public ModelRenderer Shape8;
    public ModelRenderer Shape7;

    public ModelTrackingSentry() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.body_crest_right_top2 = new ModelRenderer(this, 0, 71);
        this.body_crest_right_top2.setRotationPoint(-5.0F, 4.0F, -8.0F);
        this.body_crest_right_top2.addBox(-7.0F, -3.0F, -1.0F, 8, 5, 2, 0.0F);
        this.setRotateAngle(body_crest_right_top2, -0.20943951023931953F, 0.5235987755982988F, 0.6108652381980153F);
        this.Shape12 = new ModelRenderer(this, 27, 102);
        this.Shape12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shape12.addBox(-5.0F, 2.0F, -6.0F, 10, 10, 5, 0.0F);
        this.Shape10 = new ModelRenderer(this, 47, 51);
        this.Shape10.setRotationPoint(0.0F, 7.0F, -2.0F);
        this.Shape10.addBox(17.5F, -8.0F, -1.0F, 2, 14, 2, 0.0F);
        this.setRotateAngle(Shape10, 0.0F, 0.0F, 0.5235987755982988F);
        this.Shape9 = new ModelRenderer(this, 64, 40);
        this.Shape9.setRotationPoint(0.0F, 7.0F, -2.0F);
        this.Shape9.addBox(18.0F, -3.0F, -1.5F, 3, 6, 3, 0.0F);
        this.Shape8 = new ModelRenderer(this, 63, 112);
        this.Shape8.setRotationPoint(0.0F, 7.0F, -2.0F);
        this.Shape8.addBox(-19.5F, -8.0F, -1.0F, 2, 14, 2, 0.0F);
        this.setRotateAngle(Shape8, 0.0F, 0.0F, -0.5235987755982988F);
        this.Shape5 = new ModelRenderer(this, 67, 54);
        this.Shape5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shape5.addBox(-3.0F, 4.0F, 3.0F, 6, 6, 1, 0.0F);
        this.Shape1 = new ModelRenderer(this, 32, 84);
        this.Shape1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shape1.addBox(-4.0F, 1.0F, -4.0F, 8, 3, 9, 0.0F);
        this.setRotateAngle(Shape1, -0.17453292519943295F, 0.0F, 0.0F);
        this.Shape7 = new ModelRenderer(this, 86, 113);
        this.Shape7.setRotationPoint(0.0F, 7.0F, -2.0F);
        this.Shape7.addBox(-19.5F, -6.0F, -1.0F, 2, 14, 2, 0.0F);
        this.setRotateAngle(Shape7, 0.0F, 0.0F, 0.5235987755982988F);
        this.body_crest_bottom = new ModelRenderer(this, 0, 81);
        this.body_crest_bottom.setRotationPoint(0.0F, 12.0F, -8.0F);
        this.body_crest_bottom.addBox(-4.0F, -1.0F, -1.0F, 8, 3, 12, 0.0F);
        this.setRotateAngle(body_crest_bottom, -0.9599310885968813F, 0.0F, 0.0F);
        this.Shape11 = new ModelRenderer(this, 69, 0);
        this.Shape11.setRotationPoint(0.0F, 7.0F, -2.0F);
        this.Shape11.addBox(17.5F, -6.0F, -1.0F, 2, 14, 2, 0.0F);
        this.setRotateAngle(Shape11, 0.0F, 0.0F, -0.5235987755982988F);
        this.Shape4 = new ModelRenderer(this, 37, 7);
        this.Shape4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shape4.addBox(2.5F, 3.0F, -5.0F, 3, 8, 9, 0.0F);
        this.setRotateAngle(Shape4, 0.0F, -0.17453292519943295F, 0.0F);
        this.Shape2 = new ModelRenderer(this, 74, 65);
        this.Shape2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shape2.addBox(-4.0F, 9.5F, -6.5F, 8, 3, 9, 0.0F);
        this.setRotateAngle(Shape2, 0.17453292519943295F, 0.0F, 0.0F);
        this.body_crest_right_top = new ModelRenderer(this, 86, 16);
        this.body_crest_right_top.setRotationPoint(5.0F, 10.0F, -8.0F);
        this.body_crest_right_top.addBox(-1.0F, -2.0F, -1.0F, 8, 5, 2, 0.0F);
        this.setRotateAngle(body_crest_right_top, 0.20943951023931953F, -0.5235987755982988F, 0.6108652381980153F);
        this.Shape6 = new ModelRenderer(this, 70, 97);
        this.Shape6.setRotationPoint(0.0F, 7.0F, -2.0F);
        this.Shape6.addBox(-21.0F, -3.0F, -1.5F, 3, 6, 3, 0.0F);
        this.body_crest_left_bottom = new ModelRenderer(this, 33, 70);
        this.body_crest_left_bottom.setRotationPoint(6.0F, 8.0F, -8.0F);
        this.body_crest_left_bottom.addBox(-1.5F, -2.5F, -1.5F, 9, 3, 3, 0.0F);
        this.setRotateAngle(body_crest_left_bottom, 0.0F, -0.4363323129985824F, 0.0F);
        this.body_crest_top = new ModelRenderer(this, 0, 42);
        this.body_crest_top.setRotationPoint(0.0F, 2.0F, -8.0F);
        this.body_crest_top.addBox(-4.0F, -2.0F, -1.0F, 8, 3, 12, 0.1F);
        this.setRotateAngle(body_crest_top, 0.9599310885968813F, 0.0F, 0.0F);
        this.body_crest_right_bottom = new ModelRenderer(this, 85, 40);
        this.body_crest_right_bottom.setRotationPoint(-6.0F, 8.0F, -8.0F);
        this.body_crest_right_bottom.addBox(-7.5F, -2.5F, -1.5F, 9, 3, 3, 0.0F);
        this.setRotateAngle(body_crest_right_bottom, 0.0F, 0.4363323129985824F, 0.0F);
        this.body_crest_right_top3 = new ModelRenderer(this, 41, 27);
        this.body_crest_right_top3.setRotationPoint(-5.0F, 10.0F, -8.0F);
        this.body_crest_right_top3.addBox(-7.0F, -2.0F, -1.0F, 8, 5, 2, 0.0F);
        this.setRotateAngle(body_crest_right_top3, 0.22689280275926282F, 0.5235987755982988F, -0.6108652381980153F);
        this.body_eye = new ModelRenderer(this, 3, 26);
        this.body_eye.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_eye.addBox(-5.0F, 3.0F, -8.0F, 10, 8, 2, 0.0F);
        this.body_crest_left_top = new ModelRenderer(this, 45, 0);
        this.body_crest_left_top.setRotationPoint(5.0F, 4.0F, -8.0F);
        this.body_crest_left_top.addBox(-1.0F, -3.0F, -1.0F, 8, 5, 2, 0.0F);
        this.setRotateAngle(body_crest_left_top, -0.20943951023931953F, -0.5235987755982988F, -0.6108652381980153F);
        this.Shape3 = new ModelRenderer(this, 0, 111);
        this.Shape3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shape3.addBox(-5.5F, 3.0F, -5.0F, 3, 8, 9, 0.0F);
        this.setRotateAngle(Shape3, 0.0F, 0.17453292519943295F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.body_crest_right_top2.render(f5);
        this.Shape12.render(f5);
        this.Shape10.render(f5);
        this.Shape9.render(f5);
        this.Shape8.render(f5);
        this.Shape5.render(f5);
        this.Shape1.render(f5);
        this.Shape7.render(f5);
        this.body_crest_bottom.render(f5);
        this.Shape11.render(f5);
        this.Shape4.render(f5);
        this.Shape2.render(f5);
        this.body_crest_right_top.render(f5);
        this.Shape6.render(f5);
        this.body_crest_left_bottom.render(f5);
        this.body_crest_top.render(f5);
        this.body_crest_right_bottom.render(f5);
        this.body_crest_right_top3.render(f5);
        this.body_eye.render(f5);
        this.body_crest_left_top.render(f5);
        this.Shape3.render(f5);
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
