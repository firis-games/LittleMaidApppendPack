package voms;

import java.util.Random;

import firis.lmmm.api.caps.IModelCaps;
import firis.lmmm.api.caps.ModelCapsHelper;
import firis.lmmm.api.model.ModelLittleMaidBase;
import firis.lmmm.api.model.motion.LMMotionSitdown;
import firis.lmmm.api.renderer.ModelRenderer;
import voms.lib.VomsHelper;

/**
* 多関節モデル
* 身長2.0ブロック級
*/
public class ModelLittleMaid_Chloe2 extends ModelLittleMaidBase {

	//added fields
	public ModelRenderer eyeR;
	public ModelRenderer eyeL;
	public ModelRenderer Ponytail;
	public ModelRenderer BunchR;
	public ModelRenderer BunchL;
	public ModelRenderer upperRightArm;
	public ModelRenderer upperLeftArm;
	public ModelRenderer upperRightLeg;
	public ModelRenderer upperLeftLeg;
	public ModelRenderer hemSkirtR1;
	public ModelRenderer hemSkirtL1;
	public ModelRenderer hemSkirtR2;
	public ModelRenderer hemSkirtL2;
	public ModelRenderer breastR;
	public ModelRenderer breastL;
	public ModelRenderer hipBody;
	protected byte offsetY;
	protected byte headPosY;
	protected byte bodyPosY;
	protected byte legPosY;
	protected Random rand = new Random();

	/**
	* コンストラクタは全て継承させること
	*/
	public ModelLittleMaid_Chloe2() {
		this(0F);
	}
	/**
	* コンストラクタは全て継承させること
	*/
	public ModelLittleMaid_Chloe2(float psize) {
		this(psize, 0F, 128, 64);
	}
	/**
	* コンストラクタは全て継承させること
	*/
	public ModelLittleMaid_Chloe2(float psize, float pyoffset, int pTextureWidth, int pTextureHeight) {
		super(psize, pyoffset, pTextureWidth, pTextureHeight);
	}

	@Override
	public void initModel(float psize, float pyoffset) {
		offsetY = (byte)(pyoffset + 8); //Global to Local
		
		bodyPosY = 0; //Local waist height = always 0 (ORIGIN)
		headPosY = -8; //Local neck height = 0 - upper bodyLength
		legPosY = 3; //Lcal hip joint height = 0 + lower bodyLength
		
		/* HEAD */
		eyeR = new ModelRenderer(this, 0, 0);
		eyeR.addPlate(-4F, -8F, -4.01F, 4, 8, 0, psize);
		
		eyeL = new ModelRenderer(this, 4, 0);
		eyeL.addPlate(0F, -8F, -4.01F, 4, 8, 0, psize);
		
		Ponytail = new ModelRenderer(this, 76, 6);
		Ponytail.addBox(-1.5F, -1.5F, -1F, 3, 9, 3, psize);
		
		BunchR = new ModelRenderer(this, 64, 6);
		BunchR.addBox(-1F, -1.3F, -0.8F, 1, 9, 2, psize);
		
		BunchL = new ModelRenderer(this, 70, 6);
		BunchL.mirror = true;
		BunchL.addBox(0F, -1.3F, -0.8F, 1, 9, 2, psize);
		
		bipedHead = new ModelRenderer(this, 0, 0);
		bipedHead.setTextureOffset(0, 0).addBox(-4F, -8F, -4F, 8, 8, 8, psize);			// Head
		bipedHead.setTextureOffset(32, 0).addBox(-4F, -8F, -4F, 8, 12, 8, psize+0.3F);		// Hire
		bipedHead.setTextureOffset(72, 0).addBox(-2F, -7.2F, 4F, 4, 4, 2, psize);		// ChignonB
		bipedHead.setTextureOffset(56, 0).addBox(-5F, -7F, 0.2F, 1, 3, 3, psize);		// ChignonR
		bipedHead.setMirror(true);
		bipedHead.setTextureOffset(64, 0).addBox(4F, -7F, 0.2F, 1, 3, 3, psize);		// ChignonL
		bipedHead.addChild(HeadMount);
		bipedHead.addChild(eyeR);
		bipedHead.addChild(eyeL);
		bipedHead.addChild(Ponytail);
		bipedHead.addChild(BunchR);
		bipedHead.addChild(BunchL);
		
		/* ARMS */
		Arms = new ModelRenderer[18]; //Hand
		// 手持ち
		Arms[0] = new ModelRenderer(this, 0, 0);
		Arms[0].setRotationPoint(-0.5F, 7F, 0F);
		Arms[1] = new ModelRenderer(this, 0, 0);
		Arms[1].setRotationPoint(0.5F, 7F, 0F);
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
		
		bipedRightArm = new ModelRenderer(this, 0, 25); //ForeArm
		bipedRightArm.addBox(-1F, -0F, -1.5F, 2, 7, 3, psize);
		bipedRightArm.addChild(Arms[0]);
		bipedRightArm.addChild(Arms[2]);
		
		bipedLeftArm = new ModelRenderer(this, 10, 25);
		bipedLeftArm.mirror = true;
		bipedLeftArm.addBox(-1F, -0F, -1.5F, 2, 7, 3, psize);
		bipedLeftArm.addChild(Arms[1]);
		bipedLeftArm.addChild(Arms[3]);
		
		upperRightArm = new ModelRenderer(this, 0, 16); //UpperArm
		upperRightArm.addBox(-1F, -1F, -1F, 2, 5, 3, psize);
		upperRightArm.addChild(bipedRightArm);
		
		upperLeftArm = new ModelRenderer(this, 10, 16);
		upperLeftArm.mirror = true;
		upperLeftArm.addBox(-1F, -1F, -1F, 2, 5, 3, psize);
		upperLeftArm.addChild(bipedLeftArm);
		
		/* LEGS */
		bipedRightLeg = new ModelRenderer(this, 0, 47); //Below Knee
		bipedRightLeg.addBox(-1.6F, -1F, -2F, 3, 9, 4, psize);
		
		bipedLeftLeg = new ModelRenderer(this, 0, 47);
		bipedLeftLeg.mirror = true;
		bipedLeftLeg.addBox(-1.4F, -1F, -2F, 3, 9, 4, psize);
		
		upperRightLeg = new ModelRenderer(this, 0, 36); //Above Knee
		upperRightLeg.addBox(-1.5F, -1F, -2F, 3, 6, 4, psize+0.2F);
		upperRightLeg.addChild(bipedRightLeg);
		
		upperLeftLeg = new ModelRenderer(this, 0, 36);
		upperLeftLeg.mirror = true;
		upperLeftLeg.addBox(-1.5F, -1F, -2F, 3, 6, 4, psize+0.2F);
		upperLeftLeg.addChild(bipedLeftLeg);
		
		/* SKIRT */
		hemSkirtR2 = new ModelRenderer(this, 68, 48);
		hemSkirtR2.addBox(-3.5F, -2F, -4.5F, 7, 8, 8, psize+0.2F);
		
		hemSkirtL2 = new ModelRenderer(this, 98, 48);
		hemSkirtL2.mirror = true;
		hemSkirtL2.addBox(-3.5F, -2F, -4.5F, 7, 8, 8, psize+0.2F);
		
		hemSkirtR1 = new ModelRenderer(this, 69, 34);
		hemSkirtR1.addBox(-3F, -1F, -5F, 6, 7, 7, psize);
		hemSkirtR1.addChild(hemSkirtR2);
		
		hemSkirtL1 = new ModelRenderer(this, 99, 34);
		hemSkirtL1.mirror = true;
		hemSkirtL1.addBox(-3F, -1F, -5F, 6, 7, 7, psize);
		hemSkirtL1.addChild(hemSkirtL2);
		
		Skirt = new ModelRenderer(this, 18, 48);
		Skirt.addBox(-4F, 0F, -2F, 8, 3, 5, psize+0.3F);
		Skirt.addChild(hemSkirtR1);
		Skirt.addChild(hemSkirtL1);
		
		/* BODY */
		breastR = new ModelRenderer(this, 20, 20);
		breastR.addBox(-3F, 0F, -2F, 3, 2, 3, psize+0.1F);
		
		breastL = new ModelRenderer(this, 32, 20);
		breastL.mirror = true;
		breastL.addBox(0F, 0F, -2F, 3, 2, 3, psize+0.1F);
		
		hipBody = new ModelRenderer(this, 18, 39);
		hipBody.addBox(-4F, 0F, -2.4F, 8, 3, 5, psize-0.2F);
		
		bipedBody = new ModelRenderer(this, 0, 0);
		bipedBody.setTextureOffset(20, 26).addBox(-3F, -7.5F, -2.1F, 6, 8, 4, psize); //body
		bipedBody.setTextureOffset(24, 16).addBox(-1F, -8.8F, -1F, 2, 2, 2, psize+0.5F); //neck
		bipedBody.addChild(upperRightArm);
		bipedBody.addChild(upperLeftArm);
		bipedBody.addChild(Arms[4]);
		bipedBody.addChild(Arms[5]);
		bipedBody.addChild(breastR);
		bipedBody.addChild(breastL);
		bipedBody.addChild(hipBody);
		
		/* LOCAL SPACE */
		mainFrame = new ModelRenderer(this, 0, 0);
		mainFrame.setRotationPoint(0F, offsetY, 0F);
		mainFrame.addChild(bipedHead);
		mainFrame.addChild(bipedBody);
		mainFrame.addChild(upperRightLeg);
		mainFrame.addChild(upperLeftLeg);
		mainFrame.addChild(Skirt);
	}

	@Override
	public float getHeight() {
		return 1.8F;
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
		
		upperRightArm.setRotationPoint(-4F, bodyPosY - 6.5F, 0F);
		bipedRightArm.setRotationPoint(0F, 4F, 0.5F);
		Arms[0].setRotationPoint(-0.5F, 6F, 0F);
		upperLeftArm.setRotationPoint(4F, bodyPosY - 6.5F, 0F);
		bipedLeftArm.setRotationPoint(0F, 4F, 0.5F);
		Arms[1].setRotationPoint(0.5F, 6F, 0F);
		
		upperRightLeg.setRotationPoint(-2F, legPosY, 0F);
		bipedRightLeg.setRotationPoint(0F, 5F, 0F);
		upperLeftLeg.setRotationPoint(2F, legPosY, 0F);
		bipedLeftLeg.setRotationPoint(0F, 5F, 0F);
		
		Skirt.setRotationPoint(0F, legPosY - 2F, 0F);
		hemSkirtR1.setRotationPoint(-2F, 2F, 2F);
		hemSkirtL1.setRotationPoint(2F, 2F, 2F);
		hemSkirtR2.setRotationPoint(0F, 5F, -1F);
		hemSkirtL2.setRotationPoint(0F, 5F, -1F);
		
		bipedBody.setRotationPoint(0F, bodyPosY, 0F);
		breastR.setRotationPoint(-0.5F, -6.2F, -2.1F);
		breastL.setRotationPoint(0.5F, -6.2F, -2.1F);
		hipBody.setRotationPoint(0F, 0F, 0F);
		
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
		
		upperRightArm.rotateAngleX = 0F;
		upperRightArm.rotateAngleY = 0F;
		upperRightArm.rotateAngleZ = 0F;
		bipedRightArm.rotateAngleX = 0F;
		bipedRightArm.rotateAngleY = 0F;
		bipedRightArm.rotateAngleZ = 0F;
		Arms[0].rotateAngleX = 0F;
		Arms[0].rotateAngleY = 0F;
		Arms[0].rotateAngleZ = 0F;
		upperLeftArm.rotateAngleX  = 0F;
		upperLeftArm.rotateAngleY  = 0F;
		upperLeftArm.rotateAngleZ  = 0F;
		bipedLeftArm.rotateAngleX  = 0F;
		bipedLeftArm.rotateAngleY  = 0F;
		bipedLeftArm.rotateAngleZ  = 0F;
		Arms[1].rotateAngleX = 0F;
		Arms[1].rotateAngleY = 0F;
		Arms[1].rotateAngleZ = 0F;
		
		upperRightLeg.rotateAngleX =-0.05F;
		upperRightLeg.rotateAngleY = 0.05F;
		upperRightLeg.rotateAngleZ =-0.05F;
		bipedRightLeg.rotateAngleX = 0.05F;
		bipedRightLeg.rotateAngleY =-0.1F;
		bipedRightLeg.rotateAngleZ = 0.02F;
		upperLeftLeg.rotateAngleX  =-0.05F;
		upperLeftLeg.rotateAngleY  =-0.05F;
		upperLeftLeg.rotateAngleZ  = 0.05F;
		bipedLeftLeg.rotateAngleX  = 0.05F;
		bipedLeftLeg.rotateAngleY  = 0.1F;
		bipedLeftLeg.rotateAngleZ  =-0.02F;
		
		Skirt.rotateAngleX = 0F;
		Skirt.rotateAngleY = 0F;
		Skirt.rotateAngleZ = 0F;
		hemSkirtR1.rotateAngleX = 0F;
		hemSkirtR1.rotateAngleY = 0F;
		hemSkirtR1.rotateAngleZ = 0.05F;
		hemSkirtL1.rotateAngleX = 0F;
		hemSkirtL1.rotateAngleY = 0F;
		hemSkirtL1.rotateAngleZ = -0.05F;
		hemSkirtR2.rotateAngleX = 0F;
		hemSkirtR2.rotateAngleY = 0F;
		hemSkirtR2.rotateAngleZ = -0.03F;
		hemSkirtL2.rotateAngleX = 0F;
		hemSkirtL2.rotateAngleY = 0F;
		hemSkirtL2.rotateAngleZ = 0.03F;
		
		bipedBody.rotateAngleX = -0.1F;
		bipedBody.rotateAngleY = 0F;
		bipedBody.rotateAngleZ = 0F;
		breastR.rotateAngleX = 0.785F;
		breastR.rotateAngleY = 0F;
		breastR.rotateAngleZ = -0.15F;
		breastL.rotateAngleX = 0.785F;
		breastL.rotateAngleY = 0F;
		breastL.rotateAngleZ = 0.15F;
		hipBody.rotateAngleX = 0.2F;
		hipBody.rotateAngleY = 0F;
		hipBody.rotateAngleZ = 0F;
		
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
		float blinkFreq = 0.18F; //まばたき頻度, min: 0
		blinkFreq += 1F - (float)ModelCapsHelper.getCapsValueInt(entityCaps, caps_health) / 20F; //体力少ないとまばたき多くなる
		float idTicks = entityTicksExisted + partialTickTime + entityIdFactor;
		float f3 = idTicks * 0.01F; //位相
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
	 * Chloe独自モーション
	 */
	protected void setRotationAnglesChloe(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, IModelCaps entityCaps) {
		
		//脚 姿勢変化
		float idTicks = entityTicksExisted + ageInTicks + entityIdFactor;
		float legSlideDelay = idTicks % 2011 - 2000;
		legSlideDelay = legSlideDelay<0 ? 0F : legSlideDelay / 10;
		if(idTicks % 4022 < 2011) {
			legSlideDelay = 1 - legSlideDelay;
		}
		
		upperRightLeg.rotateAngleX -= 0.18F * legSlideDelay;
		bipedRightLeg.rotateAngleX += 0.36F * legSlideDelay;
		upperLeftLeg.rotateAngleX -= 0.18F * (1 - legSlideDelay);
		bipedLeftLeg.rotateAngleX += 0.36F * (1 - legSlideDelay);
		
		//ジャンプふわり
		String ent = ModelCapsHelper.getCapsValueString(entityCaps, caps_entityName);
		float velY = (float)ModelCapsHelper.getCapsValueDouble(entityCaps, caps_motionY) + 0.1F;
		velY = ent.equals("Dinnerbone") ? -velY : velY;
		
		//スカート
		float fwBuf0 = velY * 1.1F;
		fwBuf0 = fwBuf0>0.5F ? 0.5F : fwBuf0;
		fwBuf0 = fwBuf0<-0.5F ? -0.5F : fwBuf0;
		Skirt.rotationPointY  += fwBuf0;
		float fwBuf1 = velY * 3.2F;
		fwBuf1 = fwBuf1>1F ? 1F : fwBuf1;
		fwBuf1 = fwBuf1<-2F ? -2F : fwBuf1;
		hemSkirtR1.rotationPointY  += fwBuf1;
		hemSkirtL1.rotationPointY  += fwBuf1;
		float fwBuf2 = velY * 6.3F;
		fwBuf2 = fwBuf2>1F ? 1F : fwBuf2;
		fwBuf2 = fwBuf2<-3F ? -3F : fwBuf2;
		hemSkirtR2.rotationPointY  += fwBuf2;
		hemSkirtL2.rotationPointY  += fwBuf2;
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
		
		//Chloe独自モーション設定
		this.setRotationAnglesChloe(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityCaps);
		
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
		
		if (isRiding) {
			// 背負われている
			String ridingType = ModelCapsHelper.getCapsValueString(entityCaps, caps_getRidingType);
			if(ridingType.equals("player") || ridingType.equals("littlemaid")) {
				bipedRightArm.rotateAngleX -= 1.3F;
				bipedLeftArm.rotateAngleX -= 1.3F;
				upperRightLeg.rotateAngleX -= 1.1F;
				upperLeftLeg.rotateAngleX -= 1.1F;
				bipedRightLeg.rotateAngleX += 0.9F;
				bipedLeftLeg.rotateAngleX += 0.9F;
				upperRightLeg.rotateAngleY += 0.3F;
				upperLeftLeg.rotateAngleY -= 0.3F;
				mainFrame.rotationPointY += 8F;
				mainFrame.rotationPointZ += 1F;
			} else if(ridingType.equals("animal")) {
				bipedRightArm.rotateAngleX -= 1.3F;
				bipedLeftArm.rotateAngleX -= 1.3F;
				upperRightLeg.rotateAngleX -= 1.0F;
				upperLeftLeg.rotateAngleX -= 1.0F;
				bipedRightLeg.rotateAngleX += 1.0F;
				bipedLeftLeg.rotateAngleX += 1.0F;
				upperRightLeg.rotateAngleY += 0.3F;
				upperLeftLeg.rotateAngleY -= 0.3F;
				mainFrame.rotationPointY += 4F;
				mainFrame.rotationPointZ += 1F;
			} else {
				// 乗り物に乗っている
				upperRightArm.rotateAngleX -= 0.1F;
				upperLeftArm.rotateAngleX -= 0.1F;
				upperRightLeg.rotateAngleX -= 1.3F;
				upperLeftLeg.rotateAngleX -= 1.3F;
				bipedRightLeg.rotateAngleX += 2.5F;
				bipedLeftLeg.rotateAngleX += 2.5F;
				mainFrame.rotationPointY += 4F;
				mainFrame.rotationPointZ += 1F;
				if(!isWait) {
					mainFrame.rotateAngleY += 0.7F;
					bipedHead.rotateAngleY -= 0.7F;
					if (bipedHead.rotateAngleY < -1.5F) {
						bipedHead.rotateAngleY = -1.5F;
					}
					bipedRightLeg.rotateAngleX -= 0.5F;
					bipedLeftLeg.rotateAngleX -= 0.5F;
					upperRightLeg.rotateAngleY += 0.3F;
					upperLeftLeg.rotateAngleY += 0.3F;
					bipedRightLeg.rotateAngleY += 0.2F;
					bipedLeftLeg.rotateAngleY += 0.2F;
					bipedBody.rotateAngleY += 0.3F;
					hipBody.rotateAngleY += 0.3F;
					hemSkirtR1.rotationPointX += 2F;
					hemSkirtL1.rotationPointX += 2F;
					hemSkirtR2.rotationPointZ -= 1F;
					hemSkirtL2.rotationPointZ -= 1F;
				}
			}
		} else if (isSneak) {
			//しゃがみ
			if (isWait)
			{
				//膝立ち
				upperRightLeg.rotateAngleX -= 0.1F;
				upperLeftLeg.rotateAngleX -= 0.2F;
				bipedRightLeg.rotateAngleX += 1.7F;
				bipedLeftLeg.rotateAngleX += 1.8F;
				mainFrame.rotationPointY += 6F;
			} else {
				//中腰
				bipedBody.rotateAngleX += 0.7F;
				hipBody.rotateAngleX -= 0.1F + VomsHelper.mh_sin(ageInTicks * 0.060F) * 0.03F;
				upperRightArm.rotateAngleX += 0.1F;
				upperLeftArm.rotateAngleX += 0.1F;
				upperRightLeg.rotateAngleY -= 0.07F;
				upperLeftLeg.rotateAngleY += 0.07F;
				upperRightLeg.rotateAngleX -= 0.37F;
				upperLeftLeg.rotateAngleX -= 0.32F;
				bipedRightLeg.rotateAngleX += 0.32F;
				bipedLeftLeg.rotateAngleX += 0.22F;
				mainFrame.rotationPointY += 0.4F;
			}
			//しゃがみ歩行
			float f15 = VomsHelper.mh_sin(limbSwing * 0.6767F); //wave1
			float f16 = VomsHelper.mh_cos(limbSwing * 0.6767F); //wave2
			float f22 = f15 > f16 ? f15 : f16; //upper wave
			float f35 = f15 < f16 ? f15 : f16; //lower wave
			
			upperRightArm.rotateAngleX -= f15 * 0.2F * limbSwingAmount;
			upperLeftArm.rotateAngleX += f15 * 0.2F * limbSwingAmount;
			bipedRightArm.rotateAngleX -= f22 * 0.7F * limbSwingAmount;
			bipedLeftArm.rotateAngleX += f35 * 0.7F * limbSwingAmount;
			
			upperRightLeg.rotateAngleX += f15 * 0.2F * limbSwingAmount;
			upperLeftLeg.rotateAngleX -= f15 * 0.2F * limbSwingAmount;
			bipedRightLeg.rotateAngleX += f22 * 0.7F * limbSwingAmount;
			bipedLeftLeg.rotateAngleX -= f35 * 0.7F * limbSwingAmount;
			
			bipedBody.rotateAngleY -= f15 * 0.1F * limbSwingAmount;
			hipBody.rotateAngleY += f15 * 0.1F * limbSwingAmount - bipedBody.rotateAngleY;
			breastR.rotateAngleX -= f16 * f16 * 0.18F * limbSwingAmount - VomsHelper.mh_sin(ageInTicks * 0.060F) * 0.05F;
			breastL.rotateAngleX -= f16 * f16 * 0.18F * limbSwingAmount - VomsHelper.mh_sin(ageInTicks * 0.060F) * 0.05F;
			mainFrame.rotationPointY += f16 * f16 * 0.5F;
		} else {
			//通常歩行
			float f15 = VomsHelper.mh_sin(limbSwing * 0.5050F); //wave1
			float f16 = VomsHelper.mh_cos(limbSwing * 0.5050F); //wave2
			float f22 = f15 > f16 ? f15 : f16; //upper wave
			float f35 = f15 < f16 ? f15 : f16; //lower wave
			
			upperRightArm.rotateAngleX -= f15 * 0.7F * limbSwingAmount;
			upperLeftArm.rotateAngleX += f15 * 0.7F * limbSwingAmount;
			bipedRightArm.rotateAngleX -= f22 * 0.7F * limbSwingAmount;
			bipedLeftArm.rotateAngleX += f35 * 0.7F * limbSwingAmount;
			
			upperRightLeg.rotateAngleX += f15 * 0.9F * limbSwingAmount;
			upperLeftLeg.rotateAngleX -= f15 * 0.9F * limbSwingAmount;
			bipedRightLeg.rotateAngleX += f22 * 0.9F * limbSwingAmount;
			bipedLeftLeg.rotateAngleX -= f35 * 0.9F * limbSwingAmount;
			
			bipedBody.rotateAngleY -= f15 * 0.2F * limbSwingAmount;
			hipBody.rotateAngleY += f15 * 0.3F * limbSwingAmount - bipedBody.rotateAngleY;
			breastR.rotateAngleX -= f16 * f16 * 0.18F * limbSwingAmount - VomsHelper.mh_sin(ageInTicks * 0.060F) * 0.05F;
			breastL.rotateAngleX -= f16 * f16 * 0.18F * limbSwingAmount - VomsHelper.mh_sin(ageInTicks * 0.060F) * 0.05F;
			mainFrame.rotationPointY += f16 * f16 * 0.1F;
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
			bipedBody.rotateAngleY += (f6 - f7) * 0.2F;
			upperRightArm.rotateAngleY += bipedBody.rotateAngleY;
			upperLeftArm.rotateAngleY += bipedBody.rotateAngleY;
			// R
			if (onGroundR > 0F) {
				f6 = 1.0F - onGroundR;
				f7 = VomsHelper.mh_sin((1.0F - f6 * f6 * f6 * f6) * (float)Math.PI);
				f8 = VomsHelper.mh_sin(onGroundR * (float)Math.PI) * -(bipedHead.rotateAngleX - 0.7F) * 0.75F;
				upperRightArm.rotateAngleX -= (double)f7 * 1.2D + (double)f8;
				upperRightArm.rotateAngleY += bipedBody.rotateAngleY * 2.0F;
				upperRightArm.rotateAngleZ += VomsHelper.mh_sin(onGroundR * 3.141593F) * -0.4F;
			} else {
				upperRightArm.rotateAngleX += bipedBody.rotateAngleY;
			}
			// L
			if (onGroundL > 0F) {
				f6 = 1.0F - onGroundR;
				f7 = VomsHelper.mh_sin((1.0F - f6 * f6 * f6 * f6) * (float)Math.PI);
				f8 = VomsHelper.mh_sin(onGroundL * (float)Math.PI) * -(bipedHead.rotateAngleX - 0.7F) * 0.75F;
				upperLeftArm.rotateAngleX -= (double)f7 * 1.2D + (double)f8;
				upperLeftArm.rotateAngleY += bipedBody.rotateAngleY * 2.0F;
				upperLeftArm.rotateAngleZ += VomsHelper.mh_sin(onGroundL * 3.141593F) * 0.4F;
			} else {
				upperLeftArm.rotateAngleX += bipedBody.rotateAngleY;
			}
		}
		
		if (isWait) {
			// 待機状態 腕
			upperRightArm.rotateAngleX += VomsHelper.mh_sin(ageInTicks * 0.060F) * 0.05F - 0.5F;
			upperRightArm.rotateAngleZ -= 0.3F;
			Arms[0].rotateAngleZ -= 1.5F;
			Arms[0].rotateAngleX -= 0.5F;
			Arms[0].rotateAngleY += 1.5F;
			upperLeftArm.rotateAngleX += VomsHelper.mh_sin(ageInTicks * 0.060F) * 0.05F - 0.5F;
			upperLeftArm.rotateAngleZ += 0.3F;
			Arms[1].rotateAngleZ += 1.5F;
			Arms[1].rotateAngleX -= 0.5F;
			Arms[1].rotateAngleY -= 1.5F;
			breastR.rotationPointX += 0.1F;
			breastL.rotationPointX -= 0.1F;
		} else if (aimedBow) {
			// 弓構え 腕
			float onGround = 0.0F; //lmmm未使用変数
			float f6 = VomsHelper.mh_sin(onGround * 3.141593F);
			float f7 = VomsHelper.mh_sin((1.0F - (1.0F - onGround) * (1.0F - onGround)) * 3.141593F);
			upperRightArm.rotateAngleZ = 0.0F;
			upperLeftArm.rotateAngleZ = 0.0F;
			upperRightArm.rotateAngleY = -(0.1F - f6 * 0.6F);
			upperLeftArm.rotateAngleY = 0.1F - f6 * 0.6F;
			upperRightArm.rotateAngleX = -1.470796F;
			upperLeftArm.rotateAngleX = -1.470796F;
			upperRightArm.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
			upperLeftArm.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
			upperRightArm.rotateAngleZ += VomsHelper.mh_cos(ageInTicks * 0.08F) * 0.03F + 0.05F;
			upperLeftArm.rotateAngleZ -= VomsHelper.mh_cos(ageInTicks * 0.08F) * 0.03F + 0.05F;
			upperRightArm.rotateAngleX += VomsHelper.mh_sin(ageInTicks * 0.060F) * 0.05F;
			upperLeftArm.rotateAngleX -= VomsHelper.mh_sin(ageInTicks * 0.060F) * 0.05F;
			upperRightArm.rotateAngleX += bipedHead.rotateAngleX;
			upperLeftArm.rotateAngleX += bipedHead.rotateAngleX;
			upperRightArm.rotateAngleY += bipedHead.rotateAngleY;
			upperLeftArm.rotateAngleY += bipedHead.rotateAngleY;
		} else {
			// 通常
			upperRightArm.rotateAngleZ += 0.2F;
			upperLeftArm.rotateAngleZ -= 0.2F;
			bipedRightArm.rotateAngleZ += 0.05F;
			bipedLeftArm.rotateAngleZ -= 0.05F;
			upperRightArm.rotateAngleZ += VomsHelper.mh_cos(ageInTicks * 0.08F) * 0.03F + 0.05F;
			upperLeftArm.rotateAngleZ -= VomsHelper.mh_cos(ageInTicks * 0.08F) * 0.03F + 0.05F;
			upperRightArm.rotateAngleX += VomsHelper.mh_sin(ageInTicks * 0.060F) * 0.05F;
			upperLeftArm.rotateAngleX -= VomsHelper.mh_sin(ageInTicks * 0.060F) * 0.05F;
		}
		
		//
		Arms[2].setRotateAngle(-0.78539816339744830961566084581988F - upperRightArm.getRotateAngleX(), 0F, 0F);
		Arms[3].setRotateAngle(-0.78539816339744830961566084581988F - upperLeftArm.getRotateAngleX(), 0F, 0F);
		
		//脚部追従
		float sinBody1X = VomsHelper.mh_sin(bipedBody.rotateAngleX);
		float cosBody1X = 1F - VomsHelper.mh_cos(bipedBody.rotateAngleX);
		float sinBody2X = VomsHelper.mh_sin(bipedBody.rotateAngleX + hipBody.rotateAngleX);
		float cosBody2X = 1F - VomsHelper.mh_cos(bipedBody.rotateAngleX + hipBody.rotateAngleX);
		float sinBody2Y = VomsHelper.mh_sin(bipedBody.rotateAngleY + hipBody.rotateAngleY);
		float cosBody2Y = 1F - VomsHelper.mh_cos(bipedBody.rotateAngleY + hipBody.rotateAngleY);
		
		bipedHead.rotationPointZ -= -headPosY * sinBody1X;
		bipedHead.rotationPointY += -headPosY * cosBody1X;
		
		upperRightLeg.rotationPointZ += legPosY * sinBody2X + 2F * sinBody2Y;
		upperLeftLeg.rotationPointZ += legPosY * sinBody2X - 2F * sinBody2Y;
		upperRightLeg.rotationPointY -= legPosY * cosBody2X;
		upperLeftLeg.rotationPointY -= legPosY * cosBody2X;
		upperRightLeg.rotationPointX += 2F * cosBody2Y;
		upperLeftLeg.rotationPointX -= 2F * cosBody2Y;
		upperRightLeg.rotateAngleY += bipedBody.rotateAngleY + hipBody.rotateAngleY;
		upperLeftLeg.rotateAngleY += bipedBody.rotateAngleY + hipBody.rotateAngleY;
		
		mainFrame.rotationPointY += legPosY * cosBody2X;
		
		//スカート追従
		Skirt.rotationPointZ += legPosY * sinBody2X;
		Skirt.rotationPointY -= legPosY * cosBody2X;
		
		float jsUp = (upperRightLeg.rotateAngleX + upperLeftLeg.rotateAngleX) / 2F - bipedBody.rotateAngleX - 0.05F;
		Skirt.rotateAngleX += jsUp * 0.2F;
		Skirt.rotateAngleY += bipedBody.rotateAngleY + hipBody.rotateAngleY;
		
		float jsR1 = upperRightLeg.rotateAngleX - Skirt.rotateAngleX + 0.05F;
		float jsL1 = upperLeftLeg.rotateAngleX - Skirt.rotateAngleX + 0.05F;
		hemSkirtR1.rotateAngleX += jsR1 * (jsR1 * -0.1F + 1F);
		hemSkirtL1.rotateAngleX += jsL1 * (jsL1 * -0.1F + 1F);
		hemSkirtR1.rotateAngleY += upperRightLeg.rotateAngleY * 0.8F;
		hemSkirtL1.rotateAngleY += upperLeftLeg.rotateAngleY * 0.8F;
		
		float jsR2 = bipedRightLeg.rotateAngleX - upperRightLeg.rotateAngleX;
		float jsL2 = bipedLeftLeg.rotateAngleX - upperLeftLeg.rotateAngleX;
		hemSkirtR2.rotateAngleX += jsR2 * 0.75F + hemSkirtR1.rotateAngleX * 0.15F;
		hemSkirtL2.rotateAngleX += jsL2 * 0.75F + hemSkirtL1.rotateAngleX * 0.15F;
		
		//追加モーション（お座り）
		if (this.isRiding && LMMotionSitdown.SITDOWN.equals((String) entityCaps.getCapsValue(IModelCaps.caps_multimodel_motion))) {
			this.mainFrame.rotationPointY += 6.00F;
		}
	}
	
}
