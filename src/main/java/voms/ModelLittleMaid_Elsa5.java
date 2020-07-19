package voms;

import java.util.Random;

import firis.lmmm.api.caps.IModelCaps;
import firis.lmmm.api.caps.ModelCapsHelper;
import firis.lmmm.api.model.ModelLittleMaidBase;
import firis.lmmm.api.renderer.ModelRenderer;
import voms.lib.VomsHelper;

/**
 * ベーシックモデル
 * 身長1.75ブロック級
 */
public class ModelLittleMaid_Elsa5 extends ModelLittleMaidBase {
	
	//added fields
	public ModelRenderer eyeR;
	public ModelRenderer eyeL;
	public ModelRenderer Ponytail;
	public ModelRenderer BunchR;
	public ModelRenderer BunchL;
	public ModelRenderer hemSkirt;
	protected byte offsetY;
	protected byte headPosY;
	protected byte bodyPosY;
	protected byte legPosY;
	protected Random rand = new Random();

	/**
	 * コンストラクタは全て継承させること
	 */
	public ModelLittleMaid_Elsa5() {
		this(0F);
	}
	
	/**
	 * コンストラクタは全て継承させること
	 */
	public ModelLittleMaid_Elsa5(float psize) {
		this(psize, 0F, 64, 64);
	}
	
	/**
	 * コンストラクタは全て継承させること
	 */
	public ModelLittleMaid_Elsa5(float psize, float pyoffset, int pTextureWidth, int pTextureHeight) {
		super(psize, pyoffset, pTextureWidth, pTextureHeight);
	}
	
	@Override
	public void initModel(float psize, float pyoffset) {
		offsetY = (byte)(pyoffset + 10); //Global to Local
		
		bodyPosY = 0; //Local waist height = always 0 (ORIGIN)
		headPosY = -6; //Local neck height = 0 - upperBodyLength
		legPosY = 3; //Lcal hip joint height = 0 + lowerBodyLength
		
		/* HEAD */
		eyeR = new ModelRenderer(this, 0, 0);
		eyeR.addPlate(-4F, -8F, -4.01F, 4, 8, 0, psize);
		
		eyeL = new ModelRenderer(this, 4, 0);
		eyeL.addPlate(0F, -8F, -4.01F, 4, 8, 0, psize);
		
		Ponytail = new ModelRenderer(this, 52, 26);
		Ponytail.addBox(-1.5F, -1.5F, -1F, 3, 9, 3, psize);
		
		BunchR = new ModelRenderer(this, 40, 26);
		BunchR.addBox(-1F, -1.3F, -0.8F, 1, 9, 2, psize);
		
		BunchL = new ModelRenderer(this, 46, 26);
		BunchL.mirror = true;
		BunchL.addBox(0F, -1.3F, -0.8F, 1, 9, 2, psize);
		
		bipedHead = new ModelRenderer(this, 0, 0);
		bipedHead.setTextureOffset(0, 0).addBox(-4F, -8F, -4F, 8, 8, 8, psize);			// Head
		bipedHead.setTextureOffset(32, 0).addBox(-4F, -8F, -4F, 8, 12, 8, psize+0.3F);		// Hire
		bipedHead.setTextureOffset(52, 20).addBox(-2F, -7.2F, 4F, 4, 4, 2, psize);		// ChignonB
		bipedHead.setTextureOffset(36, 20).addBox(-5F, -7F, 0.2F, 1, 3, 3, psize);		// ChignonR
		bipedHead.setMirror(true);
		bipedHead.setTextureOffset(44, 20).addBox(4F, -7F, 0.2F, 1, 3, 3, psize);		// ChignonL
		bipedHead.addChild(HeadMount);
		bipedHead.addChild(eyeR);
		bipedHead.addChild(eyeL);
		bipedHead.addChild(Ponytail);
		bipedHead.addChild(BunchR);
		bipedHead.addChild(BunchL);
		
		/* ARMS */
		Arms = new ModelRenderer[18];
		// 手持ち
		Arms[0] = new ModelRenderer(this, 0, 0);
		Arms[1] = new ModelRenderer(this, 0, 0);
		Arms[1].isInvertX = true;
		// バイプロダクトエフェクター
		Arms[2] = new ModelRenderer(this, 0, 0);
		Arms[2].setRotationPoint(-3.5F, 11F, 6F);
		Arms[2].setRotateAngle(0.78539816339744830961566084581988F, 0F, 0F);
		Arms[3] = new ModelRenderer(this, 0, 0);
		Arms[3].setRotationPoint(3.5F, 11F, 6F);
		Arms[3].setRotateAngle(0.78539816339744830961566084581988F, 0F, 0F);
		Arms[3].isInvertX = true;
		// テールソード
		Arms[4] = new ModelRenderer(this, 0, 0);
		Arms[4].setRotationPoint(-2F, 0F, 0F);
		Arms[4].setRotateAngle(3.1415926535897932384626433832795F, 0F, 0F);
		Arms[5] = new ModelRenderer(this, 0, 0);
		Arms[5].setRotationPoint(2F, 0F, 0F);
		Arms[5].setRotateAngle(3.1415926535897932384626433832795F, 0F, 0F);
		
		bipedRightArm = new ModelRenderer(this, 20, 24);
		bipedRightArm.addBox(-1.5F, -0.5F, -0.5F, 2, 10, 2, psize);
		bipedRightArm.addChild(Arms[0]);
		bipedRightArm.addChild(Arms[2]);
		
		bipedLeftArm = new ModelRenderer(this, 28, 24);
		bipedLeftArm.mirror = true;
		bipedLeftArm.addBox(-0.5F, -0.5F, -0.5F, 2, 10, 2, psize);
		bipedLeftArm.addChild(Arms[1]);
		bipedLeftArm.addChild(Arms[3]);
		
		/* LEGS */
		bipedRightLeg = new ModelRenderer(this, 0, 29);
		bipedRightLeg.addBox(-1.8F, 0F, -2F, 3, 11, 4, psize);
		
		bipedLeftLeg = new ModelRenderer(this, 0, 29);
		bipedLeftLeg.mirror = true;
		bipedLeftLeg.addBox(-1.2F, 0F, -2F, 3, 11, 4, psize);
		
		/* SKIRT */
		hemSkirt = new ModelRenderer(this, 34, 50);
		hemSkirt.addBox(-4F, -1F, -3.5F, 8, 7, 7, psize+0.3F);
		
		Skirt = new ModelRenderer(this, 36, 40);
		Skirt.addBox(-4F, -2F, -3F, 8, 4, 6, psize);
		Skirt.addChild(hemSkirt);
		
		/* BODY */
		bipedBody = new ModelRenderer(this, 0, 0);
		bipedBody.setTextureOffset(0, 16).addBox(-3F, -6F, -2F, 6, 9, 4, psize); //body
		bipedBody.setTextureOffset(20, 20).addBox(-3F, -4.5F, -2.21F, 6, 2, 2, psize+0.2F); //breast
		bipedBody.addChild(bipedRightArm);
		bipedBody.addChild(bipedLeftArm);
		bipedBody.addChild(Arms[4]);
		bipedBody.addChild(Arms[5]);
		
		/* LOCAL SPACE */
		mainFrame = new ModelRenderer(this, 0, 0);
		mainFrame.setRotationPoint(0F, offsetY, 0F);
		mainFrame.addChild(bipedHead);
		mainFrame.addChild(bipedBody);
		mainFrame.addChild(bipedRightLeg);
		mainFrame.addChild(bipedLeftLeg);
		mainFrame.addChild(Skirt);
	}

	@Override
	public float getHeight() {
		return 1.75F;
	}

	@Override
	public float getWidth() {
		return 0.5F;
	}
	
	/**
	 * 初期ポーズ設定
	 */
	@Override
	public void setDefaultPause() {
		//INIT POSITION
		bipedHead.setRotationPoint(0F, headPosY, 0F);
		HeadMount.setRotationPoint(0F, -4F, 0F);
		eyeR.setRotationPoint(0F, 0F, 0F);
		eyeL.setRotationPoint(0F, 0F, 0F);
		Ponytail.setRotationPoint(0F, -5.2F, 5F);
		BunchR.setRotationPoint(-4.5F, -5.5F, 1.7F);
		BunchL.setRotationPoint( 4.5F, -5.5F, 1.7F);
		
		bipedRightArm.setRotationPoint(-3.5F, bodyPosY - 5F, 0F);
		Arms[0].setRotationPoint(-0.5F, 7F, 0F);
		bipedLeftArm.setRotationPoint ( 3.5F, bodyPosY - 5F, 0F);
		Arms[1].setRotationPoint(0.5F, 7F, 0F);
		
		bipedRightLeg.setRotationPoint(-1.5F, legPosY, 0F);
		bipedLeftLeg.setRotationPoint ( 1.5F, legPosY, 0F);
		
		Skirt.setRotationPoint (0F, legPosY - 1F, 0F);
		hemSkirt.setRotationPoint (0F, 2F, 0F);
		
		bipedBody.setRotationPoint (0F, bodyPosY, 0F);
		
		mainFrame.setRotationPoint(0F, offsetY, 0F);
		
		//INIT ROTATION
		bipedHead.rotateAngleX = 0F;
		bipedHead.rotateAngleY = 0F;
		bipedHead.rotateAngleZ = 0F;
		Ponytail.rotateAngleX = 0.05F;
		Ponytail.rotateAngleY = 0F;
		Ponytail.rotateAngleZ = 0F;
		BunchR.rotateAngleX = 0F;
		BunchR.rotateAngleY = 0F;
		BunchR.rotateAngleZ = 0.05F;
		BunchL.rotateAngleX = 0F;
		BunchL.rotateAngleY = 0F;
		BunchL.rotateAngleZ = -0.05F;
		
		bipedRightArm.rotateAngleX = 0F;
		bipedRightArm.rotateAngleY = 0F;
		bipedRightArm.rotateAngleZ = 0F;
		Arms[0].rotateAngleX = 0F;
		Arms[0].rotateAngleY = 0F;
		Arms[0].rotateAngleZ = 0F;
		bipedLeftArm.rotateAngleX  = 0F;
		bipedLeftArm.rotateAngleY  = 0F;
		bipedLeftArm.rotateAngleZ  = 0F;
		Arms[1].rotateAngleX = 0F;
		Arms[1].rotateAngleY = 0F;
		Arms[1].rotateAngleZ = 0F;
		
		bipedRightLeg.rotateAngleX = 0.05F;
		bipedRightLeg.rotateAngleY = 0.1F;
		bipedRightLeg.rotateAngleZ =-0.05F;
		bipedLeftLeg.rotateAngleX  = 0.05F;
		bipedLeftLeg.rotateAngleY  =-0.1F;
		bipedLeftLeg.rotateAngleZ  = 0.05F;
		
		Skirt.rotateAngleX = 0F;
		Skirt.rotateAngleY = 0F;
		Skirt.rotateAngleZ = 0F;
		hemSkirt.rotateAngleX = 0.03F;
		hemSkirt.rotateAngleY = 0F;
		hemSkirt.rotateAngleZ = 0F;
		
		bipedBody.rotateAngleX =-0.05F;
		bipedBody.rotateAngleY = 0F;
		bipedBody.rotateAngleZ = 0F;
		
		mainFrame.rotateAngleX = 0F;
		mainFrame.rotateAngleY = 0F;
		mainFrame.rotateAngleZ = 0F;
		
	}

	/**
	 * 姿勢制御・初期化
	 */
	@Override
	public void setLivingAnimations(IModelCaps entityCaps, float limbSwing, float limbSwingAmount, float partialTickTime) {
		
		//初期ポーズ
		this.setDefaultPause();
		
		//おねだり
		bipedHead.rotateAngleZ = ModelCapsHelper.getCapsValueFloat(entityCaps, caps_interestedAngle, (Float)partialTickTime);
		if(ModelCapsHelper.getCapsValueBoolean(entityCaps, caps_isLookSuger)) {
			//うるうる
			float fe1 = rand.nextFloat() - 0.5F;
			float fe2 = rand.nextFloat() - 0.5F;
			float fe3 = rand.nextFloat() - 0.5F;
			eyeR.rotationPointX += fe1 * 0.07F;
			eyeR.rotationPointY += fe2 * 0.04F + fe3 * 0.02F;
			eyeL.rotationPointX += fe1 * 0.06F + fe3 * 0.02F;
			eyeL.rotationPointY += fe2 * 0.05F;
		}
		
		// まばたき from SR2
		float blinkFreq = 0.16F; //まばたき頻度, min: 0
		blinkFreq += 1F - (float)ModelCapsHelper.getCapsValueInt(entityCaps, caps_health) / 20F; //体力少ないとまばたき多くなる
		float f3 = (float)(entityTicksExisted + partialTickTime + entityIdFactor) * 0.01F; //位相
		float f4 = (float)(Math.sin(f3 * 3F) + Math.sin(f3 * 17F) + Math.sin(f3 * 37F) + blinkFreq-2.23309F); //パルス列
		if (f4 < 0) {
			//開
			eyeR.setVisible(true);
			eyeL.setVisible(true);
		} else {
			//閉
			eyeR.setVisible(false);
			eyeL.setVisible(false);
		}
	}
	
	/**
	 * Elsa独自モーション
	 */
	protected void setRotationAnglesElsa(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, IModelCaps entityCaps) {
		
		//ジャンプふわり
		String ent = ModelCapsHelper.getCapsValueString(entityCaps, caps_entityName);
		float velY = (float)ModelCapsHelper.getCapsValueDouble(entityCaps, caps_motionY) + 0.1F;
		velY = ent.equals("Dinnerbone") ? -velY : velY;
		
		//スカート
		float fwBuf0 = velY * 1.1F;
		fwBuf0 = fwBuf0 > 0.5F ? 0.5F : fwBuf0;
		fwBuf0 = fwBuf0 < -0.5F ? -0.5F : fwBuf0;
		Skirt.rotationPointY  += fwBuf0;
		float fwBuf1 = velY * 3.2F;
		fwBuf1 = fwBuf1>1F ? 1F : fwBuf1;
		fwBuf1 = fwBuf1<-2F ? -2F : fwBuf1;
		hemSkirt.rotationPointY  += fwBuf1;
		hemSkirt.rotationPointY  += fwBuf1;
		//髪
		if(!ModelCapsHelper.getCapsValueBoolean(entityCaps, caps_isWet)) {
			float fwBuf5 = velY * 2.1F;
			fwBuf5 = fwBuf5>0.1F ? 0.1F : fwBuf5;
			fwBuf5 = fwBuf5<-0.7F ? -0.7F : fwBuf5;
			Ponytail.rotateAngleX -= fwBuf5;
			BunchR.rotateAngleZ -= fwBuf5;
			BunchL.rotateAngleZ += fwBuf5;
		}
	}

	/**
	 * 姿勢制御・更新差分
	 */
	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, IModelCaps entityCaps) {
		
		//Elsa独自モーション設定
		this.setRotationAnglesElsa(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityCaps);
		
		//顔向き
		bipedHead.rotateAngleY += netHeadYaw / 57.29578F;
		bipedHead.rotateAngleX += headPitch / 57.29578F;
		
		//ポニテツインテ
		Ponytail.rotateAngleX += BunchR.rotateAngleX = BunchL.rotateAngleX = -bipedHead.rotateAngleX;
		Ponytail.rotateAngleZ -= bipedHead.rotateAngleZ;
		if (bipedHead.rotateAngleZ > 0) {
			BunchR.rotateAngleZ -= bipedHead.rotateAngleZ * 0.2F;
		} else {
			BunchL.rotateAngleZ -= bipedHead.rotateAngleZ * 0.2F;
		}
		
		//歩行
		bipedRightArm.rotateAngleX -= VomsHelper.mh_cos(limbSwing * 0.5656F) * 0.8F * limbSwingAmount;
		bipedLeftArm.rotateAngleX += VomsHelper.mh_cos(limbSwing * 0.5656F) * 0.8F * limbSwingAmount;
		bipedRightLeg.rotateAngleX += VomsHelper.mh_cos(limbSwing * 0.5656F) * 1.2F * limbSwingAmount;
		bipedLeftLeg.rotateAngleX -= VomsHelper.mh_cos(limbSwing * 0.5656F) * 1.2F * limbSwingAmount;
		Skirt.rotateAngleY += VomsHelper.mh_cos(limbSwing * 0.5656F) * 0.15F * limbSwingAmount;
		hemSkirt.rotateAngleY += VomsHelper.mh_cos(limbSwing * 0.5656F) * 0.25F * limbSwingAmount;
		
		if (isRiding) {
			// 乗り物に乗っている
			bipedRightArm.rotateAngleX -= 0.3F;
			bipedLeftArm.rotateAngleX -= 0.3F;
			bipedRightLeg.rotateAngleX -= 1.2F;
			bipedLeftLeg.rotateAngleX -= 1.2F;
			bipedRightLeg.rotateAngleY += 0.2F;
			bipedLeftLeg.rotateAngleY -= 0.2F;
			Skirt.rotateAngleX -= 0.3F;
			hemSkirt.rotateAngleX -= 0.9F;
			mainFrame.rotationPointZ += 1.5F;
		}
		
//		// アイテム持ってるときの腕振りを抑える+表示角オフセット
//		if (heldItemLeft != 0)
//		{
//			bipedLeftArm.rotateAngleX = bipedLeftArm.rotateAngleX * 0.5F - (float)Math.PI * 0.1F * heldItemLeft;
//		}
//		if (heldItemRight != 0)
//		{
//			bipedRightArm.rotateAngleX = bipedRightArm.rotateAngleX * 0.5F - (float)Math.PI * 0.1F * heldItemRight;
//		}
		
		float onGroundR = 0;
		float onGroundL = 0;
		onGroundR = onGrounds[0];
		onGroundL = onGrounds[1];
		if ((onGroundR > -9990F || onGroundL > -9990F) && !aimedBow) {
			// 腕振り
			float f6, f7, f8;
			f6 = VomsHelper.mh_sin(mh_sqrt_float(onGroundR) * (float)Math.PI * 2.0F);
			f7 = VomsHelper.mh_sin(mh_sqrt_float(onGroundL) * (float)Math.PI * 2.0F);
			bipedBody.rotateAngleY = (f6 - f7) * 0.2F;
			Skirt.rotateAngleY = bipedBody.rotateAngleY;
			bipedRightArm.rotateAngleY += bipedBody.rotateAngleY;
			bipedLeftArm.rotateAngleY += bipedBody.rotateAngleY;
			// R
			if (onGroundR > 0F) {
				f6 = 1.0F - onGroundR;
				f6 *= f6;
				f6 *= f6;
				f6 = 1.0F - f6;
				f7 = VomsHelper.mh_sin(f6 * (float)Math.PI);
				f8 = VomsHelper.mh_sin(onGroundR * (float)Math.PI) * -(bipedHead.rotateAngleX - 0.7F) * 0.75F;
				bipedRightArm.rotateAngleX -= (double)f7 * 1.2D + (double)f8;
				bipedRightArm.rotateAngleY += bipedBody.rotateAngleY * 2.0F;
				bipedRightArm.rotateAngleZ = VomsHelper.mh_sin(onGroundR * 3.141593F) * -0.4F;
			} else {
				bipedRightArm.rotateAngleX += bipedBody.rotateAngleY;
			}
			// L
			if (onGroundL > 0F) {
				f6 = 1.0F - onGroundL;
				f6 *= f6;
				f6 *= f6;
				f6 = 1.0F - f6;
				f7 = VomsHelper.mh_sin(f6 * (float)Math.PI);
				f8 = VomsHelper.mh_sin(onGroundL * (float)Math.PI) * -(bipedHead.rotateAngleX - 0.7F) * 0.75F;
				bipedLeftArm.rotateAngleX -= (double)f7 * 1.2D + (double)f8;
				bipedLeftArm.rotateAngleY += bipedBody.rotateAngleY * 2.0F;
				bipedLeftArm.rotateAngleZ = VomsHelper.mh_sin(onGroundL * 3.141593F) * 0.4F;
			} else {
				bipedLeftArm.rotateAngleX += bipedBody.rotateAngleY;
			}
		}
		
		if (isSneak) {
			// しゃがみ
			bipedBody.rotateAngleX += 0.55F;
			bipedRightArm.rotateAngleX += 0.2F;
			bipedLeftArm.rotateAngleX += 0.2F;
			Skirt.rotateAngleX += 0.1F;
			hemSkirt.rotateAngleX += 0.3F;
			float upperBodyLength = bodyPosY - headPosY;
			float lowerBodyLength = legPosY - bodyPosY;
			bipedHead.rotationPointZ -= upperBodyLength * VomsHelper.mh_sin(bipedBody.rotateAngleX);
			bipedHead.rotationPointY += upperBodyLength * (1 - VomsHelper.mh_cos(bipedBody.rotateAngleX));
			bipedRightLeg.rotationPointZ += lowerBodyLength * VomsHelper.mh_sin(bipedBody.rotateAngleX);
			bipedLeftLeg.rotationPointZ += lowerBodyLength * VomsHelper.mh_sin(bipedBody.rotateAngleX);
			bipedRightLeg.rotationPointY -= lowerBodyLength * (1 - VomsHelper.mh_cos(bipedBody.rotateAngleX));
			bipedLeftLeg.rotationPointY -= lowerBodyLength * (1 - VomsHelper.mh_cos(bipedBody.rotateAngleX));
			Skirt.rotationPointZ += lowerBodyLength * VomsHelper.mh_sin(bipedBody.rotateAngleX);
			Skirt.rotationPointY -= lowerBodyLength * (1 - VomsHelper.mh_cos(bipedBody.rotateAngleX));
			mainFrame.rotationPointY += lowerBodyLength * (1 - VomsHelper.mh_cos(bipedBody.rotateAngleX));
		} else {
			// 通常立ち
		}
		
		if (isWait) {
			//待機状態の特別表示
			bipedRightArm.rotateAngleX += VomsHelper.mh_sin(ageInTicks * 0.062F) * 0.05F -0.6F;
			bipedRightArm.rotateAngleZ -= 0.4F;
			Arms[0].rotateAngleZ -= 1.5F;
			Arms[0].rotateAngleX -= 0.5F;
			Arms[0].rotateAngleY += 1.5F;
			bipedLeftArm.rotateAngleX += VomsHelper.mh_sin(ageInTicks * 0.062F) * 0.05F -0.6F;
			bipedLeftArm.rotateAngleZ += 0.4F;
			Arms[1].rotateAngleZ += 1.5F;
			Arms[1].rotateAngleX -= 0.5F;
			Arms[1].rotateAngleY -= 1.5F;
		} else if (aimedBow) {
			// 弓構え
			float onGround = 0.0F; //lmmm未使用変数
			float f6 = VomsHelper.mh_sin(onGround * 3.141593F);
			float f7 = VomsHelper.mh_sin((1.0F - (1.0F - onGround) * (1.0F - onGround)) * 3.141593F);
			bipedRightArm.rotateAngleZ = 0.0F;
			bipedLeftArm.rotateAngleZ = 0.0F;
			bipedRightArm.rotateAngleY = -(0.1F - f6 * 0.6F);
			bipedLeftArm.rotateAngleY = 0.1F - f6 * 0.6F;
			bipedRightArm.rotateAngleX = -1.470796F;
			bipedLeftArm.rotateAngleX = -1.470796F;
			bipedRightArm.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
			bipedLeftArm.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
			bipedRightArm.rotateAngleZ += VomsHelper.mh_cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
			bipedLeftArm.rotateAngleZ -= VomsHelper.mh_cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
			bipedRightArm.rotateAngleX += VomsHelper.mh_sin(ageInTicks * 0.062F) * 0.05F;
			bipedLeftArm.rotateAngleX -= VomsHelper.mh_sin(ageInTicks * 0.062F) * 0.05F;
			bipedRightArm.rotateAngleX += bipedHead.rotateAngleX;
			bipedLeftArm.rotateAngleX += bipedHead.rotateAngleX;
			bipedRightArm.rotateAngleY += bipedHead.rotateAngleY;
			bipedLeftArm.rotateAngleY += bipedHead.rotateAngleY;
		} else {
			// 通常
			bipedRightArm.rotateAngleZ += 0.3F;
			bipedLeftArm.rotateAngleZ -= 0.3F;
			bipedRightArm.rotateAngleZ += VomsHelper.mh_cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
			bipedLeftArm.rotateAngleZ -= VomsHelper.mh_cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
			bipedRightArm.rotateAngleX += VomsHelper.mh_sin(ageInTicks * 0.062F) * 0.05F;
			bipedLeftArm.rotateAngleX -= VomsHelper.mh_sin(ageInTicks * 0.062F) * 0.05F;
		}
		
		//
		Arms[2].setRotateAngle(-0.78539816339744830961566084581988F - bipedRightArm.getRotateAngleX(), 0F, 0F);
		Arms[3].setRotateAngle(-0.78539816339744830961566084581988F - bipedLeftArm.getRotateAngleX(), 0F, 0F);
		
		//追加モーション
		postMotionRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityCaps);
	}

}
