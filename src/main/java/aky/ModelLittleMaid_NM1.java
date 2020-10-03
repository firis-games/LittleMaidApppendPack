package aky;

import firis.lmmm.api.caps.IModelCaps;
import firis.lmmm.api.caps.ModelCapsHelper;
import firis.lmmm.api.model.ModelLittleMaidBase;
import firis.lmmm.api.renderer.ModelRenderer;

/**
 * ニューメイドスキン1（長身モデル）
 * 
 * バージョンを1.2系から強制的に上げているためモーション系の制御が不十分
 * 通常サイズのモデルのモーションを割り当てている
 * モードチェンジの条件を改変
 * @author firis-games
 *
 */
public class ModelLittleMaid_NM1 extends ModelLittleMaidBase {

	// ModelLittleMaid_Archetype fields
	public ModelRenderer bipedHeadwear;
	public ModelRenderer ChignonR;
	public ModelRenderer ChignonL;
	public ModelRenderer ChignonB;
	public ModelRenderer Tail;
	public ModelRenderer SideTailR;
	public ModelRenderer SideTailL;

	public ModelRenderer Headwear;
	public ModelRenderer HornR1;
	public ModelRenderer HornR2;
	public ModelRenderer HornR3;
	public ModelRenderer HornR4;
	public ModelRenderer HeadwearR;
	public ModelRenderer HornL1;
	public ModelRenderer HornL2;
	public ModelRenderer HornL3;
	public ModelRenderer HornL4;
	public ModelRenderer HeadwearL;
	public ModelRenderer ArmR1;
	public ModelRenderer ArmL1;
	public ModelRenderer HandR1;
	public ModelRenderer HandR2;
	public ModelRenderer HandL1;
	public ModelRenderer HandL2;
	public ModelRenderer LegR1;
	public ModelRenderer LegR2;
	public ModelRenderer LegR3;
	public ModelRenderer LegR4;
	public ModelRenderer LegR5;
	public ModelRenderer LegR6;
	public ModelRenderer LegL1;
	public ModelRenderer LegL2;
	public ModelRenderer LegL3;
	public ModelRenderer LegL4;
	public ModelRenderer LegL5;
	public ModelRenderer LegL6;
	public ModelRenderer bootR1;
	public ModelRenderer bootR2;
	public ModelRenderer bootL1;
	public ModelRenderer bootL2;
	public ModelRenderer eyeR;
	public ModelRenderer eyeL;
	public ModelRenderer eyeR1;
	public ModelRenderer eyeL1;
	public ModelRenderer Breast;
	public ModelRenderer Cachusya;
	public ModelRenderer tie;

	/**
	 * コンストラクタは全て継承させること
	 */
	public ModelLittleMaid_NM1() {
		this(0.0F);
	}

	/**
	 * コンストラクタは全て継承させること
	 */
	public ModelLittleMaid_NM1(float size) {
		this(size, 0.0F, 64, 64);
	}

	/**
	 * コンストラクタは全て継承させること
	 */
	public ModelLittleMaid_NM1(float size, float yOffset, int textureWidth, int textureHeight) {
		super(size, yOffset, textureWidth, textureHeight);
	}

	@Override
	public void initModel(float f, float f1) {
		float size = f;
		float yOffset = f1;
		super.initModel(size, yOffset);

		yOffset += 8.0F;
		f1 += 8.0F;
		this.bipedHead = new ModelRenderer(this, 0, 0);
		this.bipedHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, size);
		this.bipedHead.setRotationPoint(0.0F, 4.0F + f1, 0.0F);

		this.Headwear = new ModelRenderer(this, 0, 28);
		this.Headwear.addBox(-4.0F, 0.0F, 1.0F, 8, 12, 3, f);
		this.Headwear.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Headwear.setRotateAngleX(0.2094395F);

		this.bipedBody = new ModelRenderer(this, 32, 0);
		this.bipedBody.addBox(-3.0F, 0.0F, -2.0F, 6, 9, 4, f);
		this.bipedBody.setRotationPoint(0.0F, 4.0F, 0.0F);

		this.bipedHeadwear = new ModelRenderer(this, 0, 16);
		this.bipedHeadwear.addBox(-2.0F, -1.0F, -1.0F, 2, 10, 2, f);
		this.bipedHeadwear.setRotationPoint(-3.0F, 5.5F, 0.0F);

		this.bipedRightArm = new ModelRenderer(this, 0, 16);
		this.bipedRightArm.addBox(-2.0F, -1.0F, -1.0F, 2, 10, 2, f);
		this.bipedRightArm.setRotationPoint(-3.0F, 5.5F, 0.0F);

		this.bipedLeftArm = new ModelRenderer(this, 8, 16);
		this.bipedLeftArm.mirror = true;
		this.bipedLeftArm.addBox(0.0F, -1.0F, -1.0F, 2, 10, 2, f);
		this.bipedLeftArm.setRotationPoint(3.0F, 5.5F, 0.0F);

		this.bipedRightLeg = new ModelRenderer(this, 32, 13);
		this.bipedRightLeg.addBox(-2.0F, 0.0F, -2.0F, 3, 11, 4, f);
		this.bipedRightLeg.setRotationPoint(-1.0F, 13.0F, 0.0F);

		this.bipedLeftLeg = new ModelRenderer(this, 32, 13);
		this.bipedLeftLeg.mirror = true;
		this.bipedLeftLeg.addBox(-1.0F, 0.0F, -2.0F, 3, 11, 4, f);
		this.bipedLeftLeg.setRotationPoint(1.0F, 13.0F, 0.0F);

		this.Skirt = new ModelRenderer(this, 36, 44);
		this.Skirt.addBox(-4.0F, -3.0F, -3.5F, 8, 14, 6, f);
		this.Skirt.setRotationPoint(0.0F, 13.0F, 0.0F);

		this.ChignonR = new ModelRenderer(this, 0, 2);
		this.ChignonR.addBox(-5.0F, -7.0F, 0.2F, 1, 3, 3, f);
		this.ChignonR.setRotationPoint(0.0F, 4.0F, 0.0F);
		this.bipedHead.addChild(this.ChignonR);

		this.ChignonL = new ModelRenderer(this, 0, 2);
		this.ChignonL.mirror = true;
		this.ChignonL.addBox(4.0F, -7.0F, 0.2F, 1, 3, 3, f);
		this.ChignonL.setRotationPoint(0.0F, 4.0F, 0.0F);
		this.bipedHead.addChild(this.ChignonL);

		this.ChignonB = new ModelRenderer(this, 24, 58);
		this.ChignonB.addBox(-2.0F, -7.2F, 4.0F, 4, 4, 2, f);
		this.ChignonB.setRotationPoint(0.0F, 4.0F, 0.0F);
		this.bipedHead.addChild(this.ChignonB);

		this.Tail = new ModelRenderer(this, 52, 5);
		this.Tail.addBox(-1.5F, -1.5F, -1.0F, 3, 9, 3, f);
		this.Tail.setRotationPoint(0.0F, -5.2F, 5.0F);
		this.bipedHead.addChild(this.Tail);

		this.SideTailR = new ModelRenderer(this, 58, 18);
		this.SideTailR.addBox(-1.0F, -1.3F, -0.8F, 1, 9, 2, f);
		this.SideTailR.setRotationPoint(-4.5F, -5.5F, 1.7F);
		this.bipedHead.addChild(this.SideTailR);

		this.SideTailL = new ModelRenderer(this, 58, 18);
		this.SideTailL.mirror = true;
		this.SideTailL.addBox(0.0F, -1.3F, -0.8F, 1, 9, 2, f);
		this.SideTailL.setRotationPoint(4.5F, -5.5F, 1.7F);
		this.bipedHead.addChild(this.SideTailL);

		this.HornR1 = new ModelRenderer(this, 52, 28);
		this.HornR1.addBox(-1.0F, -10.0F, 0.0F, 2, 2, 1, f);
		this.HornR1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HornR1.setRotateAngleZ(-0.3839724F);
		this.HornR2 = new ModelRenderer(this, 58, 18);
		this.HornR2.addBox(-6.9F, -11.3F, 0.0F, 1, 4, 1, f);
		this.HornR2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HornR2.setRotateAngleZ(0.2792527F);
		this.HornR3 = new ModelRenderer(this, 52, 22);
		this.HornR3.addBox(-4.2F, -13.0F, 0.0F, 1, 4, 1, f);
		this.HornR3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HornR3.setRotateAngleZ(0.0523599F);
		this.HornR4 = new ModelRenderer(this, 53, 18);
		this.HornR4.addBox(-2.4F, -15.2F, 0.0F, 1, 2, 1, f);
		this.HornR4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HornR4.setRotateAngleZ(-0.0872665F);
		this.HeadwearR = new ModelRenderer(this, 0, 0);
		this.HeadwearR.addBox(-4.0F, 0.0F, -4.0F, 1, 4, 2, f);
		this.HeadwearR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmR1 = new ModelRenderer(this, 28, 29);
		this.ArmR1.addBox(-2.0F, 4.5F, -1.0F, 2, 1, 2, f + 0.5F);
		this.ArmR1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HandR1 = new ModelRenderer(this, 16, 24);
		this.HandR1.addBox(-2.0F, 7.5F, -1.0F, 2, 2, 2, f + 0.4F);
		this.HandR1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HandR2 = new ModelRenderer(this, 16, 16);
		this.HandR2.addBox(-2.0F, 6.0F, -1.0F, 2, 3, 2, f + 0.2F);
		this.HandR2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LegR1 = new ModelRenderer(this, 0, 47);
		this.LegR1.addBox(-2.5F, 2.0F, -2.0F, 1, 2, 4, f);
		this.LegR1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LegR2 = new ModelRenderer(this, 0, 43);
		this.LegR2.addBox(-2.0F, 2.4F, -3.0F, 3, 2, 1, f);
		this.LegR2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LegR3 = new ModelRenderer(this, 11, 44);
		this.LegR3.addBox(-2.0F, 5.0F, 0.0F, 3, 1, 3, f);
		this.LegR3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LegR4 = new ModelRenderer(this, 5, 53);
		this.LegR4.addBox(-1.0F, 2.7F, -5.0F, 1, 1, 2, f);
		this.LegR4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LegR5 = new ModelRenderer(this, 0, 53);
		this.LegR5.addBox(-1.0F, 2.7F, -3.5F, 1, 2, 1, f);
		this.LegR5.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LegR6 = new ModelRenderer(this, 28, 35);
		this.LegR6.addBox(-3.0F, 13.0F, -2.0F, 3, 11, 4, f + 0.1F);
		this.LegR6.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bootR1 = new ModelRenderer(this, 0, 57);
		this.bootR1.addBox(-1.5F, 10.0F, -3.0F, 2, 1, 1, f);
		this.bootR1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bootR2 = new ModelRenderer(this, 0, 53);
		this.bootR2.addBox(-1.0F, 8.0F, -6.0F, 1, 2, 1, f);
		this.bootR2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bootR2.setRotateAngleX(0.2792527F);
		this.HornL1 = new ModelRenderer(this, 52, 28);
		this.HornL1.addBox(-1.0F, -10.0F, 0.0F, 2, 2, 1, f);
		this.HornL1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HornL1.setRotateAngleZ(0.3839724F);
		this.HornL2 = new ModelRenderer(this, 58, 18);
		this.HornL2.addBox(5.9F, -11.3F, 0.0F, 1, 4, 1, f);
		this.HornL2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HornL2.setRotateAngleZ(-0.2792527F);
		this.HornL3 = new ModelRenderer(this, 52, 22);
		this.HornL3.addBox(3.2F, -13.0F, 0.0F, 1, 4, 1, f);
		this.HornL3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HornL3.setRotateAngleZ(-0.0523599F);
		this.HornL4 = new ModelRenderer(this, 53, 18);
		this.HornL4.addBox(1.4F, -15.2F, 0.0F, 1, 2, 1, f);
		this.HornL4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HornL4.setRotateAngleZ(0.0872665F);
		this.HeadwearL = new ModelRenderer(this, 24, 0);
		this.HeadwearL.addBox(3.0F, 0.0F, -4.0F, 1, 4, 2, f);
		this.HeadwearL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ArmL1 = new ModelRenderer(this, 41, 29);
		this.ArmL1.addBox(0.0F, 4.5F, -1.0F, 2, 1, 2, f + 0.5F);
		this.ArmL1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HandL1 = new ModelRenderer(this, 24, 24);
		this.HandL1.addBox(0.0F, 7.5F, -1.0F, 2, 2, 2, f + 0.4F);
		this.HandL1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HandL2 = new ModelRenderer(this, 24, 16);
		this.HandL2.addBox(0.0F, 6.0F, -1.0F, 2, 3, 2, f + 0.2F);
		this.HandL2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LegL1 = new ModelRenderer(this, 0, 47);
		this.LegL1.addBox(1.5F, 2.0F, -2.0F, 1, 2, 4, f);
		this.LegL1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LegL2 = new ModelRenderer(this, 0, 43);
		this.LegL2.addBox(-1.0F, 2.4F, -3.0F, 3, 2, 1, f);
		this.LegL2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LegL3 = new ModelRenderer(this, 11, 44);
		this.LegL3.addBox(-1.0F, 5.0F, 0.0F, 3, 1, 3, f);
		this.LegL3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LegL4 = new ModelRenderer(this, 5, 53);
		this.LegL4.addBox(0.0F, 2.7F, -5.0F, 1, 1, 2, f);
		this.LegL4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LegL5 = new ModelRenderer(this, 0, 53);
		this.LegL5.addBox(0.0F, 2.7F, -3.5F, 1, 2, 1, f);
		this.LegL5.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.LegL6 = new ModelRenderer(this, 28, 35);
		this.LegL6.addBox(0.0F, 13.0F, -2.0F, 3, 11, 4, f + 0.1F);
		this.LegL6.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bootL1 = new ModelRenderer(this, 0, 57);
		this.bootL1.addBox(-0.5F, 10.0F, -3.0F, 2, 1, 1, f);
		this.bootL1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bootL2 = new ModelRenderer(this, 0, 53);
		this.bootL2.addBox(0.0F, 8.0F, -6.0F, 1, 2, 1, f);
		this.bootL2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bootL2.setRotateAngleX(0.2792527F);
		this.Breast = new ModelRenderer(this, 53, 0);
		this.Breast.addBox(0.0F, -2.5F, 0.0F, 3, 5, 2, f);
		this.Breast.setRotationPoint(0.0F, -7.0F + f1, -2.0F);
		this.Breast.setRotateAngleZ(1.5707964F);
		this.Breast.setRotateAngleY(0.69813174F);
		this.eyeR = new ModelRenderer(this, 32, 0);
		this.eyeR.addPlate(-4.0F, -4.0F, -4.001F, 4, 4, 0, f);
		this.eyeR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.eyeL = new ModelRenderer(this, 47, 0);
		this.eyeL.addPlate(0.0F, -4.0F, -4.001F, 4, 4, 0, f);
		this.eyeL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.eyeR1 = new ModelRenderer(this, 52, 13);
		this.eyeR1.addPlate(-4.0F, -4.0F, -4.002F, 4, 4, 0, f);
		this.eyeR1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.eyeL1 = new ModelRenderer(this, 56, 13);
		this.eyeL1.addPlate(0.0F, -4.0F, -4.002F, 4, 4, 0, f);
		this.eyeL1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Cachusya = new ModelRenderer(this, 0, 7);
		this.Cachusya.addPlate(-2.0F, -9.0F, -4.0F, 4, 1, 0, f);
		this.Cachusya.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.tie = new ModelRenderer(this, 24, 6);
		this.tie.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, f + 0.1F);
		this.tie.setRotationPoint(-0.5F, -8.0F + f1, -2.1F);

		this.bipedHead.addChild(this.Headwear);
		this.bipedHead.addChild(this.Cachusya);
		this.bipedHead.addChild(this.eyeR);
		this.bipedHead.addChild(this.eyeL);
		this.bipedHead.addChild(this.eyeR1);
		this.bipedHead.addChild(this.eyeL1);
		this.bipedHead.addChild(this.HornR1);
		this.bipedHead.addChild(this.HornR2);
		this.bipedHead.addChild(this.HornR3);
		this.bipedHead.addChild(this.HornR4);
		this.bipedHead.addChild(this.HeadwearR);
		this.bipedHead.addChild(this.HornL1);
		this.bipedHead.addChild(this.HornL2);
		this.bipedHead.addChild(this.HornL3);
		this.bipedHead.addChild(this.HornL4);
		this.bipedHead.addChild(this.HornL4);
		this.bipedHead.addChild(this.HeadwearL);
		this.bipedBody.addChild(this.Breast);
		this.bipedBody.addChild(this.tie);
		this.bipedRightArm.addChild(this.ArmR1);
		this.bipedRightArm.addChild(this.HandR1);
		this.bipedRightArm.addChild(this.HandR2);
		this.bipedLeftArm.addChild(this.ArmL1);
		this.bipedLeftArm.addChild(this.HandL1);
		this.bipedLeftArm.addChild(this.HandL2);
		this.bipedRightLeg.addChild(this.LegR1);
		this.bipedRightLeg.addChild(this.LegR2);
		this.bipedRightLeg.addChild(this.LegR3);
		this.bipedRightLeg.addChild(this.LegR4);
		this.bipedRightLeg.addChild(this.LegR5);

		this.bipedRightLeg.addChild(this.bootR1);
		this.bipedRightLeg.addChild(this.bootR2);
		this.bipedLeftLeg.addChild(this.LegL1);
		this.bipedLeftLeg.addChild(this.LegL2);
		this.bipedLeftLeg.addChild(this.LegL3);
		this.bipedLeftLeg.addChild(this.LegL4);
		this.bipedLeftLeg.addChild(this.LegL5);

		this.bipedLeftLeg.addChild(this.bootL1);
		this.bipedLeftLeg.addChild(this.bootL2);
		this.bipedHeadwear.setVisible(false);
		this.Tail.setVisible(false);
		this.SideTailR.setVisible(false);
		this.SideTailL.setVisible(false);
		this.ChignonR.setVisible(false);
		this.ChignonL.setVisible(false);

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
			this.eyeR.setVisible(true);
			this.eyeL.setVisible(true);
		} else {
			this.eyeR.setVisible(false);
			this.eyeL.setVisible(false);
		}

		// NM1拡張分
		this.Skirt.setVisible(true);
		this.HornR1.setVisible(false);
		this.HornR2.setVisible(false);
		this.HornR3.setVisible(false);
		this.HornR4.setVisible(false);
		this.HornL1.setVisible(false);
		this.HornL2.setVisible(false);
		this.HornL3.setVisible(false);
		this.HornL4.setVisible(false);
		this.ArmR1.setVisible(false);
		this.HandR1.setVisible(false);
		this.HandR2.setVisible(false);
		this.ArmL1.setVisible(false);
		this.HandL1.setVisible(false);
		this.HandL2.setVisible(false);
		this.LegR1.setVisible(false);
		this.LegR2.setVisible(false);
		this.LegR3.setVisible(false);
		this.LegR4.setVisible(false);
		this.LegR5.setVisible(false);
		this.LegL1.setVisible(false);
		this.LegL2.setVisible(false);
		this.LegL3.setVisible(false);
		this.LegL4.setVisible(false);
		this.LegL5.setVisible(false);

		this.LegR6.setVisible(true);
		this.LegL6.setVisible(true);

		this.bipedLeftLeg.setVisible(false);
		this.bipedRightLeg.setVisible(false);

		this.bootR1.setVisible(false);
		this.bootR2.setVisible(false);
		this.bootL1.setVisible(false);
		this.bootL2.setVisible(false);

		// 職業判定
		String maidJob = ModelCapsHelper.getCapsValueString(entityCaps, caps_job, new Object[0]);

		// 小文字で判定
		// 戦闘系メイドさん
		// MaidMode 4と7は定義が同じなので統合
		if ("fencer".equals(maidJob)
				|| "archer".equals(maidJob)
				|| "blazingstar".equals(maidJob)) {

			f3 *= 8.0F;

			this.eyeR.setVisible(true);
			this.eyeL.setVisible(true);

			this.Skirt.setVisible(false);

			this.HornR1.setVisible(true);
			this.HornR2.setVisible(true);
			this.HornR3.setVisible(true);
			this.HornR4.setVisible(true);
			this.HornL1.setVisible(true);
			this.HornL2.setVisible(true);
			this.HornL3.setVisible(true);
			this.HornL4.setVisible(true);
			this.ArmR1.setVisible(true);
			this.HandR1.setVisible(true);
			this.HandR2.setVisible(true);
			this.ArmL1.setVisible(true);
			this.HandL1.setVisible(true);
			this.HandL2.setVisible(true);
			this.LegR1.setVisible(true);
			this.LegR2.setVisible(true);
			this.LegR3.setVisible(true);
			this.LegR4.setVisible(true);
			this.LegR5.setVisible(true);
			this.LegL1.setVisible(true);
			this.LegL2.setVisible(true);
			this.LegL3.setVisible(true);
			this.LegL4.setVisible(true);
			this.LegL5.setVisible(true);

			this.LegR6.setVisible(false);
			this.LegR6.setVisible(false);

			this.bipedLeftLeg.setVisible(true);
			this.bipedRightLeg.setVisible(true);

			this.bootR1.setVisible(true);
			this.bootR2.setVisible(true);
			this.bootL1.setVisible(true);
			this.bootL2.setVisible(true);

		}
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
				this.eyeL.setVisible(true);
			} else {
				this.eyeR.setVisible(true);
			}
		}
	}

	/**
	 * 長身モデル用高さ調整
	 */
	@Override
	public void setDefaultPause(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float scaleFactor, IModelCaps entityCaps) {
		super.setDefaultPause(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityCaps);

		// 個別調整
		this.bipedNeck.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.bipedBody.setRotationPoint(0.0F, -2.0F, 0.0F);

	}
	
	@Override
	public void renderFirstPersonHand(IModelCaps entityCaps) {
		this.setLivingAnimations(entityCaps, 0.0F, 0.0F, 0.0F);
		super.renderFirstPersonHand(entityCaps);
	}
}
