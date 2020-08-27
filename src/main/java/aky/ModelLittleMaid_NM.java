package aky;

import firis.lmmm.api.caps.IModelCaps;
import firis.lmmm.api.caps.ModelCapsHelper;
import firis.lmmm.api.model.ModelLittleMaidBase;
import firis.lmmm.api.renderer.ModelRenderer;

/**
 * ニューメイドスキン
 * 
 * @author firis-games
 *
 */
public class ModelLittleMaid_NM extends ModelLittleMaidBase {

	// ModelLittleMaid_Archetype fields
	public ModelRenderer bipedHeadwear;
	public ModelRenderer ChignonR;
	public ModelRenderer ChignonL;
	public ModelRenderer ChignonB;
	public ModelRenderer Tail;
	public ModelRenderer SideTailR;
	public ModelRenderer SideTailL;

	public ModelRenderer hairR;
	public ModelRenderer hairL;
	public ModelRenderer Cachusya;
	public ModelRenderer Zukin;
	public ModelRenderer Ribon1R;
	public ModelRenderer Ribon1L;
	public ModelRenderer Ribon2R;
	public ModelRenderer Ribon2L;
	public ModelRenderer Bribonc;
	public ModelRenderer Bribon1R;
	public ModelRenderer Bribon1L;
	public ModelRenderer Bribon2R;
	public ModelRenderer Bribon2L;
	public ModelRenderer Breast1;
	public ModelRenderer EyeR;
	public ModelRenderer EyeL;
	public ModelRenderer Cheek_R;
	public ModelRenderer Cheek_L;
	public ModelRenderer SideTail1R;
	public ModelRenderer SideTail1L;
	public ModelRenderer sensor;
	public ModelRenderer RightArm1;
	public ModelRenderer RightArm2;
	public ModelRenderer RightArm3;
	public ModelRenderer LeftArm1;
	public ModelRenderer LeftArm2;
	public ModelRenderer LeftArm3;
	public ModelRenderer tie;
	public ModelRenderer bow;
	public ModelRenderer BodyA;
	public ModelRenderer BreastA;
	public ModelRenderer RightLeg;
	public ModelRenderer LeftLeg;

	/**
	 * コンストラクタは全て継承させること
	 */
	public ModelLittleMaid_NM() {
		this(0.0F);
	}

	/**
	 * コンストラクタは全て継承させること
	 */
	public ModelLittleMaid_NM(float size) {
		this(size, 0.0F, 64, 64);
	}

	/**
	 * コンストラクタは全て継承させること
	 */
	public ModelLittleMaid_NM(float size, float yOffset, int textureWidth, int textureHeight) {
		super(size, yOffset, textureWidth, textureHeight);
	}

	@Override
	public void initModel(float size, float yOffset) {

		super.initModel(size, yOffset);

		yOffset += 8.0F;

		this.bipedHead = new ModelRenderer(this, 0, 0);
		this.bipedHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, size);
		this.bipedHeadwear = new ModelRenderer(this, 24, 0);
		this.bipedHeadwear.addBox(-4.0F, 0.0F, 1.0F, 8, 5, 3, size);
		this.bipedHeadwear.setRotationPoint(0.0F, 0.0F, 0.0F);

		this.bipedHead.addChild(this.bipedHeadwear);

		this.bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);

		this.bipedHead.addChild(this.HeadMount);
		this.bipedHead.addChild(this.HeadTop);

		this.Zukin = new ModelRenderer(this, 0, 32);
		this.Zukin.addBox(-4.0F, -8.1F, -4.0F, 8, 8, 9, size + 0.1F);
		this.Zukin.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedBody = new ModelRenderer(this, 32, 8);
		this.bipedBody.addBox(-3.0F, 0.0F, -2.0F, 6, 7, 4, size);
		this.bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.tie = new ModelRenderer(this, 0, 6);
		this.tie.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, size + 0.1F);
		this.tie.setRotationPoint(-0.5F, 0.0F, -2.1F);
		this.bow = new ModelRenderer(this, 40, 42);
		this.bow.addBox(2.0F, -2.0F, 2.1F, 2, 6, 2, size);
		this.bow.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bow.setRotateAngleZ(0.837758F);

		this.bipedRightArm = new ModelRenderer(this, 48, 0);
		this.bipedRightArm.addBox(-2.0F, -1.0F, -1.0F, 2, 8, 2, size);
		this.bipedRightArm.setRotationPoint(-3.0F, 1.5F, 0.0F);

		this.bipedRightArm.addChild(this.Arms[0]);

		this.RightArm1 = new ModelRenderer(this, 48, 42);
		this.RightArm1.addBox(1.0F, 3.0F, -1.0F, 2, 1, 2, size + 0.4F);
		this.RightArm1.setRotationPoint(-3.0F, 0.5F, 0.0F);
		this.RightArm2 = new ModelRenderer(this, 48, 45);
		this.RightArm2.addBox(1.0F, 4.0F, -1.0F, 2, 3, 2, size + 0.2F);
		this.RightArm2.setRotationPoint(-3.0F, 0.5F, 0.0F);
		this.RightArm3 = new ModelRenderer(this, 48, 50);
		this.RightArm3.addBox(1.0F, 3.0F, -1.0F, 2, 4, 2, size + 0.2F);
		this.RightArm3.setRotationPoint(-3.0F, 0.5F, 0.0F);

		this.bipedLeftArm = new ModelRenderer(this, 56, 0);
		this.bipedLeftArm.addBox(0.0F, -1.0F, -1.0F, 2, 8, 2, size);
		this.bipedLeftArm.setRotationPoint(3.0F, 1.5F, 0.0F);

		this.bipedLeftArm.addChild(this.Arms[1]);

		this.LeftArm1 = new ModelRenderer(this, 56, 42);
		this.LeftArm1.addBox(-3.0F, 4.0F, -1.0F, 2, 1, 2, size + 0.4F);
		this.LeftArm1.setRotationPoint(3.0F, 0.5F, 0.0F);
		this.LeftArm2 = new ModelRenderer(this, 56, 45);
		this.LeftArm2.addBox(-3.0F, 4.0F, -1.0F, 2, 3, 2, size + 0.2F);
		this.LeftArm2.setRotationPoint(3.0F, 0.5F, 0.0F);
		this.LeftArm3 = new ModelRenderer(this, 56, 50);
		this.LeftArm3.addBox(-3.0F, 3.0F, -1.0F, 2, 4, 2, size + 0.2F);
		this.LeftArm3.setRotationPoint(3.0F, 0.5F, 0.0F);

		this.bipedRightLeg = new ModelRenderer(this, 32, 19);
		this.bipedRightLeg.addBox(-2.0F, 0.0F, -2.0F, 3, 9, 4, size);
		this.bipedRightLeg.setRotationPoint(-1.0F, 7.0F, 0.0F);
		this.bipedLeftLeg = new ModelRenderer(this, 32, 19);
		this.bipedLeftLeg.mirror = true;
		this.bipedLeftLeg.addBox(-1.0F, 0.0F, -2.0F, 3, 9, 4, size);
		this.bipedLeftLeg.setRotationPoint(1.0F, 7.0F, 0.0F);

		this.Skirt = new ModelRenderer(this, 0, 16);
		this.Skirt.addBox(-4.0F, -2.0F, -4.0F, 8, 8, 8, size);
		this.Skirt.setRotationPoint(0.0F, 7.0F, 0.0F);
		this.ChignonR = new ModelRenderer(this, 25, 32);
		this.ChignonR.addBox(-5.0F, -7.0F, -0.5F, 1, 3, 3, size);
		this.ChignonR.setRotationPoint(0.0F, 0.0F, 0.0F);

		this.bipedHead.addChild(this.ChignonR);
		this.ChignonL = new ModelRenderer(this, 25, 32);
		this.ChignonL.addBox(4.0F, -7.0F, -0.5F, 1, 3, 3, size);
		this.ChignonL.setRotationPoint(0.0F, 0.0F, 0.0F);

		this.bipedHead.addChild(this.ChignonL);

		this.SideTailR = new ModelRenderer(this, 52, 10);
		this.SideTailR.addBox(-5.6F, -6.8F, 0.0F, 1, 7, 2, size);
		this.SideTailR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.SideTailR.setRotateAngleZ(0.0872665F);

		this.bipedHead.addChild(this.SideTailR);
		this.SideTailL = new ModelRenderer(this, 58, 10);
		this.SideTailL.mirror = true;
		this.SideTailL.addBox(4.6F, -6.8F, 0.0F, 1, 7, 2, size);
		this.SideTailL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.SideTailL.setRotateAngleZ(-0.0872665F);

		this.bipedHead.addChild(this.SideTailL);
		this.SideTail1R = new ModelRenderer(this, 34, 32);
		this.SideTail1R.addBox(-8.0F, -7.0F, 0.0F, 3, 7, 2, size);
		this.SideTail1R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.SideTail1R.setRotateAngleZ(0.122173F);
		this.SideTail1L = new ModelRenderer(this, 44, 32);
		this.SideTail1L.addBox(5.0F, -7.0F, 0.0F, 3, 7, 2, size);
		this.SideTail1L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.SideTail1L.setRotateAngleZ(-0.122173F);
		this.hairR = new ModelRenderer(this, 52, 19);
		this.hairR.addBox(-4.0F, 0.0F, -4.0F, 1, 3, 2, size);
		this.hairR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hairL = new ModelRenderer(this, 58, 19);
		this.hairL.addBox(3.0F, 0.0F, -4.0F, 1, 3, 2, size);
		this.hairL.setRotationPoint(0.0F, 0.0F, 0.0F);

		this.Cachusya = new ModelRenderer(this, 24, 23);
		this.Cachusya.addPlate(-2.0F, -9.0F, -4.0F, 4, 1, 0, size);
		this.Cachusya.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Ribon1R = new ModelRenderer(this, 52, 24);
		this.Ribon1R.addPlate(0.0F, -6.0F, -4.7F, 3, 6, 0, size);
		this.Ribon1R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Ribon1R.setRotateAngleX(-0.0872665F);
		this.Ribon1R.setRotateAngleY(1.5707964F);
		this.Ribon1L = new ModelRenderer(this, 58, 24);
		this.Ribon1L.addPlate(-3.0F, -6.0F, -4.7F, 3, 6, 0, size);
		this.Ribon1L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Ribon1L.setRotateAngleX(-0.0872665F);
		this.Ribon1L.setRotateAngleY(-1.5707964F);

		this.Bribonc = new ModelRenderer(this, 0, 20);
		this.Bribonc.addBox(-1.0F, 4.6F, 3.0F, 2, 2, 2, size);
		this.Bribonc.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Bribon1R = new ModelRenderer(this, 24, 19);
		this.Bribon1R.addPlate(-4.0F, 4.6F, 4.7F, 3, 3, 0, size);
		this.Bribon1R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Bribon1L = new ModelRenderer(this, 24, 16);
		this.Bribon1L.addPlate(1.0F, 4.6F, 4.7F, 3, 3, 0, size);
		this.Bribon1L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Bribon2R = new ModelRenderer(this, 46, 24);
		this.Bribon2R.addPlate(-4.0F, 5.6F, 4.3F, 3, 5, 0, size);
		this.Bribon2R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Bribon2L = new ModelRenderer(this, 46, 19);
		this.Bribon2L.addPlate(1.0F, 5.6F, 4.3F, 3, 5, 0, size);
		this.Bribon2L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Breast1 = new ModelRenderer(this, 0, 32);
		this.Breast1.addBox(0.0F, -2.5F, 0.0F, 2, 5, 1, size);
		this.Breast1.setRotationPoint(0.0F, 1.0F, -2.0F);
		this.Breast1.setRotateAngleZ(1.5707964F);
		this.Breast1.setRotateAngleY(0.4363323F);
		this.EyeR = new ModelRenderer(this, 0, 16);
		this.EyeR.addPlate(-4.0F, -4.9F, -4.001F, 4, 4, 0, size);
		this.EyeR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.EyeL = new ModelRenderer(this, 4, 16);
		this.EyeL.addPlate(0.0F, -4.9F, -4.001F, 4, 4, 0, size);
		this.EyeL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Cheek_R = new ModelRenderer(this, 32, 8);
		this.Cheek_R.addPlate(-4.5F, -4.5F, -4.002F, 4, 4, 0, size);
		this.Cheek_R.setRotationPoint(0.0F, 1.0F, 0.0F);
		this.Cheek_L = new ModelRenderer(this, 32, 19);
		this.Cheek_L.addPlate(0.5F, -4.5F, -4.002F, 4, 4, 0, size);
		this.Cheek_L.setRotationPoint(0.0F, 1.0F, 0.0F);
		this.sensor = new ModelRenderer(this, 0, 49);
		this.sensor.addPlate(0.0F, -4.0F, -10.0F, 10, 4, 1);
		this.sensor.setRotationPoint(0.0F, -8.0F, 0.0F);
		this.BodyA = new ModelRenderer(this, 0, 53);
		this.BodyA.addBox(-3.0F, 0.0F, -2.0F, 6, 7, 4, size + 0.1F);
		this.BodyA.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.BreastA = new ModelRenderer(this, 34, 42);
		this.BreastA.addBox(0.0F, -2.5F, 0.0F, 2, 5, 1, size + 0.1F);
		this.BreastA.setRotationPoint(0.0F, 1.0F, -2.0F);
		this.BreastA.setRotateAngleZ(1.5707964F);
		this.BreastA.setRotateAngleY(0.4363323F);
		this.RightLeg = new ModelRenderer(this, 20, 49);
		this.RightLeg.addBox(-1.0F, 1.0F, -2.0F, 3, 8, 4, size + 0.1F);
		this.RightLeg.setRotationPoint(-1.0F, 0.0F, 0.0F);
		this.LeftLeg = new ModelRenderer(this, 20, 49);
		this.LeftLeg.mirror = true;
		this.LeftLeg.addBox(-2.0F, 1.0F, -2.0F, 3, 8, 4, size + 0.1F);
		this.LeftLeg.setRotationPoint(1.0F, 0.0F, 0.0F);

		this.bipedHead.addChild(this.Ribon1R);
		this.bipedHead.addChild(this.Ribon1L);
		this.bipedHead.addChild(this.Cachusya);
		this.bipedHead.addChild(this.SideTail1R);
		this.bipedHead.addChild(this.SideTail1L);
		this.bipedHead.addChild(this.Zukin);
		this.bipedBody.addChild(this.Bribonc);
		this.bipedBody.addChild(this.Bribon1R);
		this.bipedBody.addChild(this.Bribon1L);
		this.bipedBody.addChild(this.Bribon2R);
		this.bipedBody.addChild(this.Bribon2L);
		this.bipedBody.addChild(this.tie);
		this.bipedBody.addChild(this.bow);
		this.bipedBody.addChild(this.BodyA);
		this.bipedBody.addChild(this.BreastA);
		this.bipedRightArm.addChild(this.RightArm1);
		this.bipedRightArm.addChild(this.RightArm2);
		this.bipedRightArm.addChild(this.RightArm3);
		this.bipedLeftArm.addChild(this.LeftArm1);
		this.bipedLeftArm.addChild(this.LeftArm2);
		this.bipedLeftArm.addChild(this.LeftArm3);
		this.bipedHead.addChild(this.hairR);
		this.bipedHead.addChild(this.hairL);
		this.bipedBody.addChild(this.Breast1);
		this.bipedHead.addChild(this.EyeR);
		this.bipedHead.addChild(this.EyeL);
		this.bipedHead.addChild(this.Cheek_R);
		this.bipedHead.addChild(this.Cheek_L);
		this.bipedHead.addChild(this.sensor);
		this.bipedLeftLeg.addChild(this.LeftLeg);
		this.bipedRightLeg.addChild(this.RightLeg);

		// 通常グループ設定
		this.bipedTorso = new ModelRenderer(this);
		this.bipedNeck = new ModelRenderer(this);
		this.bipedPelvic = new ModelRenderer(this);
		this.bipedPelvic.setRotationPoint(0.0F, 7.0F, 0.0F);
		this.mainFrame = new ModelRenderer(this, 0, 0);
		this.mainFrame.setRotationPoint(0.0F, 0.0F + yOffset + 8.0F, 0.0F);
		this.mainFrame.addChild(this.bipedTorso);
		this.bipedTorso.addChild(this.bipedNeck);
		this.bipedTorso.addChild(this.bipedBody);
		this.bipedTorso.addChild(this.bipedPelvic);
		this.bipedNeck.addChild(this.bipedHead);
		this.bipedNeck.addChild(this.bipedRightArm);
		this.bipedNeck.addChild(this.bipedLeftArm);
		this.bipedHead.addChild(this.HeadMount);
		this.bipedHead.addChild(this.HeadTop);
		this.bipedRightArm.addChild(this.Arms[0]);
		this.bipedLeftArm.addChild(this.Arms[1]);
		this.bipedPelvic.addChild(this.bipedRightLeg);
		this.bipedPelvic.addChild(this.bipedLeftLeg);
		this.bipedPelvic.addChild(this.Skirt);
	}

	@Override
	public void setLivingAnimations(IModelCaps entityCaps, float limbSwing, float limbSwingAmount,
			float partialTickTime) {

		super.setLivingAnimations(entityCaps, limbSwing, limbSwingAmount, partialTickTime);

		float f3 = entityTicksExisted + partialTickTime + entityIdFactor;
		// 目パチ
		if (0 > mh_sin(f3 * 0.05F) + mh_sin(f3 * 0.13F) + mh_sin(f3 * 0.7F) + 2.55F) {
			this.EyeR.setVisible(true);
			this.EyeL.setVisible(true);
		} else {
			this.EyeR.setVisible(false);
			this.EyeL.setVisible(false);
		}

		// NM拡張分
		this.RightArm1.setVisible(false);
		this.LeftArm1.setVisible(false);
		this.RightArm2.setVisible(false);
		this.LeftArm2.setVisible(false);
		this.RightArm3.setVisible(false);
		this.LeftArm3.setVisible(false);
		this.Zukin.setVisible(false);
		this.RightLeg.setVisible(false);
		this.LeftLeg.setVisible(false);
		this.BodyA.setVisible(false);
		this.BreastA.setVisible(false);
		this.bow.setVisible(false);

		this.sensor.setVisible(true);
		this.Cachusya.setVisible(true);

		// 職業判定
		String maidJob = ModelCapsHelper.getCapsValueString(entityCaps, caps_job, new Object[0]);

		// 小文字で判定
		// 剣士メイドさん
		if ("fencer".equals(maidJob)) {
			this.RightArm1.setVisible(true);
			this.LeftArm1.setVisible(true);

			this.RightArm2.setVisible(false);
			this.LeftArm2.setVisible(false);

			this.RightArm3.setVisible(true);
			this.LeftArm3.setVisible(true);

			this.BodyA.setVisible(true);

			this.RightLeg.setVisible(true);
			this.LeftLeg.setVisible(true);

			// コックメイドさん
		} else if ("cooking".equals(maidJob)) {

			this.RightArm2.setVisible(true);
			this.LeftArm2.setVisible(true);

			this.RightArm3.setVisible(false);
			this.LeftArm3.setVisible(false);

			this.Zukin.setVisible(true);

			this.sensor.setVisible(false);
			this.Cachusya.setVisible(false);

			// 弓兵メイドさん
		} else if ("archer".equals(maidJob) || "blazingstar".equals(maidJob)) {
			this.RightArm2.setVisible(false);
			this.LeftArm2.setVisible(false);

			this.RightArm3.setVisible(true);
			this.LeftArm3.setVisible(true);

			this.BodyA.setVisible(true);
			this.bow.setVisible(true);
			this.RightLeg.setVisible(true);
			this.LeftLeg.setVisible(true);

			this.BreastA.setVisible(true);
		}

		// ほほ染制御
		float f4;
		if (ModelCapsHelper.getCapsValueBoolean(entityCaps, caps_isLookSuger, new Object[0])) {
			this.Cheek_R.setVisible(true);
			this.Cheek_L.setVisible(true);

			f3 *= 8.0F;
			f4 = -0.2F;
		} else {
			this.Cheek_R.setVisible(false);
			this.Cheek_L.setVisible(false);

			f4 = (1.0F - ModelCapsHelper.getCapsValueInt(entityCaps, caps_health, new Object[0]) / 20.0F) * 0.5F;
		}

		// アホ毛の制御
		this.sensor.setRotateAngle(mh_sin(f3 * 0.067F) * 0.05F + f4, mh_cos(f3 * 0.09F) * 0.5F,
				mh_sin(f3 * 0.09F) * 0.2F);
	}

	/**
	 * 姿勢制御用
	 */
	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float scaleFactor, IModelCaps entityCaps) {
		super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityCaps);
		if (aimedBow) {
			if (ModelCapsHelper.getCapsValueInt(entityCaps, caps_dominantArm) == 0) {
				this.EyeL.setVisible(true);
			} else {
				this.EyeR.setVisible(true);
			}
		}
	}
}
