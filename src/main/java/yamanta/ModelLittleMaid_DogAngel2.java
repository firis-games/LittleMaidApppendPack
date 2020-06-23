package net.minecraft.src;

import org.lwjgl.opengl.GL11;

public class ModelLittleMaid_DogAngel2 extends MMM_ModelLittleMaid_Archetype {

	public MMM_ModelRenderer eyeR;
	public MMM_ModelRenderer eyeL;
	public MMM_ModelRenderer EarL1;
	public MMM_ModelRenderer EarL2;
	public MMM_ModelRenderer EarR1;
	public MMM_ModelRenderer EarR2;
    public MMM_ModelRenderer Prim;
	public MMM_ModelRenderer WingLOrigin;
	public MMM_ModelRenderer WingLroot;
	public MMM_ModelRenderer WingL2;
	public MMM_ModelRenderer WingL3;
	public MMM_ModelRenderer WingL4;
	public MMM_ModelRenderer WingL5;
	public MMM_ModelRenderer WingL6;
	public MMM_ModelRenderer WingROrigin;
	public MMM_ModelRenderer WingRroot;
	public MMM_ModelRenderer WingR2;
	public MMM_ModelRenderer WingR3;
	public MMM_ModelRenderer WingR4;
	public MMM_ModelRenderer WingR5;
	public MMM_ModelRenderer WingR6;
	public MMM_ModelRenderer SideTailL2;
	public MMM_ModelRenderer SideTailR2;
	public MMM_ModelRenderer Tail2;
	public MMM_ModelRenderer Bust1;
	public MMM_ModelRenderer Bust2;
	public MMM_ModelRenderer Ahoge;
	public MMM_ModelRenderer_EX Skirt1;
	public MMM_ModelRenderer_EX Skirt2;
	public MMM_ModelRenderer_EX Skirt3;
	public MMM_ModelRenderer_EX Skirt4;
	public MMM_ModelRenderer_EX Skirt5;
	public MMM_ModelRenderer_EX Skirt6;
	public MMM_ModelRenderer_EX Skirt7;
	public MMM_ModelRenderer_EX Skirt8;
	public MMM_ModelRenderer_EX Skirt9;
	public MMM_ModelRenderer_EX Skirt10;
	public MMM_ModelRenderer_EX Skirt11;
	public MMM_ModelRenderer_EX Skirt12;

	private int IdOffset;

	public ModelLittleMaid_DogAngel2()
	{
		this(0.0F);
	}

	public ModelLittleMaid_DogAngel2(float f)
	{
		this(f, 0.0F);
	}

	public ModelLittleMaid_DogAngel2(float f, float f1)
	{
		super(f, f1,64,64);
	}

	@Override
	public void initModel(float psize, float pyoffset) {
		super.initModel(psize, pyoffset);

		textureHeight=64;
		textureWidth=64;

		heldItemLeft = 0;
        heldItemRight = 0;
        isSneak = false;
        isWait = false;
        aimedBow = false;

		pyoffset += 8F;

		this.initBasicParts(psize,pyoffset);

		EarL1 = new MMM_ModelRenderer(this, 0, 20);
		EarL1.addBox(-0.9F, 0.5F, -4.5F, 5, 4, 4,psize);
		EarL1.setRotationPoint(0F, 0F, 0F);
		bipedHead.addChild(EarL1);

		EarL2 = new MMM_ModelRenderer(this, 0, 28);
		EarL2.addBox(2.7F, -3.2F, 2.2F, 1, 3, 1,psize);
		EarL2.setRotationPoint(0F, 0F, 0F);
		bipedHead.addChild(EarL2);

		EarR1 = new MMM_ModelRenderer(this, 0, 20);
		EarR1.addBox(-0.8F, 0.5F, -4.5F, 5, 4, 4,psize);
		EarR1.setRotationPoint(0F, 0F, 0F);
		EarR1.mirror=true;
		bipedHead.addChild(EarR1);

		EarR2 = new MMM_ModelRenderer(this, 0, 28);
		EarR2.addBox(-3.5F, -3.2F, -3.5F, 1, 3, 1,psize);
		EarR2.setRotationPoint(0F, 0F, 0F);
		bipedHead.addChild(EarR2);

		WingLOrigin = new MMM_ModelRenderer(this, 0, 0);
		WingLOrigin.mirror=true;
		WingLOrigin.addBox(0F, 0F, -0F, 0, 0, 0,psize);
		WingLOrigin.setRotationPoint(0.4F, 1.5F, 1.2F);
		bipedBody.addChild(WingLOrigin);

		WingLroot = new MMM_ModelRenderer(this, 0, 0);
		WingLroot.mirror=true;
		WingLroot.addBox(-0.5F, 0F, -0.5F, 1, 3, 1,psize);
		WingLroot.setRotationPoint(0F, 0F, 0F);
		WingLOrigin.addChild(WingLroot);

		WingL2 = new MMM_ModelRenderer(this, 0, 0);
		WingL2.mirror=true;
		WingL2.addBox(-2.4F, 2F, -0.4F, 1, 4, 1,psize);
		WingL2.setRotationPoint(0F, 0F, 0F);
		WingLOrigin.addChild(WingL2);

		WingL3 = new MMM_ModelRenderer(this, 4, 1);
		WingL3.mirror=true;
		WingL3.addBox(4.5F, 2.5F, 1.3F, 1, 3, 1,psize);
		WingL3.setRotationPoint(0F, 0F, 0F);
		WingLOrigin.addChild(WingL3);
		setRotatePriorityYZX(WingL3);

		WingL4 = new MMM_ModelRenderer(this, 4, 1);
		WingL4.mirror=true;
		WingL4.addBox(3.5F, 2F, 1.3F, 1, 3, 1,psize);
		WingL4.setRotationPoint(0F, 0F, 0F);
		WingLOrigin.addChild(WingL4);
		setRotatePriorityYZX(WingL4);

		WingL5 = new MMM_ModelRenderer(this, 4, 1);
		WingL5.mirror=true;
		WingL5.addBox(2.5F, 2F, 1.3F, 1, 2, 1,psize);
		WingL5.setRotationPoint(0F, 0F, 0F);
		WingLOrigin.addChild(WingL5);
		setRotatePriorityYZX(WingL5);

		WingL6 = new MMM_ModelRenderer(this, 4, 1);
		WingL6.mirror=true;
		WingL6.addBox(1.8F, 1.5F, 1.3F, 1, 1, 1,psize);
		WingL6.setRotationPoint(0F, 0F, 0F);
		WingLOrigin.addChild(WingL6);
		setRotatePriorityYZX(WingL6);

		WingROrigin = new MMM_ModelRenderer(this, 0, 0);
		WingROrigin.addBox(0F, 0F, 0F, 0, 0, 0,psize);
		WingROrigin.setRotationPoint(-0.5F, 1.5F, 1.2F);
		bipedBody.addChild(WingROrigin);

		WingRroot = new MMM_ModelRenderer(this, 0, 0);
		WingRroot.addBox(-0.5F, 0F, -0.5F, 1, 3, 1,psize);
		WingRroot.setRotationPoint(0F, 0F, 0F);
		WingROrigin.addChild(WingRroot);

		WingR2 = new MMM_ModelRenderer(this, 0, 0);
		WingR2.addBox(1.4F, 2F, -0.4F, 1, 4, 1,psize);
		WingR2.setRotationPoint(0F, 0F, 0F);
		WingROrigin.addChild(WingR2);

		WingR3 = new MMM_ModelRenderer(this, 4, 1);
		WingR3.addBox(-5.5F, 2.5F, 1.3F, 1, 3, 1,psize);
		WingR3.setRotationPoint(0F, 0F, 0F);
		WingROrigin.addChild(WingR3);
		setRotatePriorityYZX(WingR3);

		WingR4 = new MMM_ModelRenderer(this, 4, 1);
		WingR4.addBox(-4.5F, 2F, 1.3F, 1, 3, 1,psize);
		WingR4.setRotationPoint(0F, 0F, 0F);
		WingROrigin.addChild(WingR4);
		setRotatePriorityYZX(WingR4);

		WingR5 = new MMM_ModelRenderer(this, 4, 1);
		WingR5.addBox(-3.5F, 2F, 1.3F, 1, 2, 1,psize);
		WingR5.setRotationPoint(0F, 0F, 0F);
		WingROrigin.addChild(WingR5);
		setRotatePriorityYZX(WingR5);

		WingR6 = new MMM_ModelRenderer(this, 4, 1);
		WingR6.addBox(-2.8F, 1.5F, 1.3F, 1, 1, 1,psize);
		WingR6.setRotationPoint(0F, 0F, 0F);
		WingROrigin.addChild(WingR6);
		setRotatePriorityYZX(WingR6);
	/*	WingLroot = new MMM_ModelRenderer(this, 0, 0);
		WingLroot.addBoxLM(-0.5F, 0F, -0.5F, 1, 3, 1,f);
		WingLroot.setRotationPointLM(0.4F, 2.5F+pyoffset, 1.2F);
		WingLroot.setTextureSize(64,48);

		WingL2 = new MMM_ModelRenderer(this, 0, 0);
		WingL2.addBoxLM(-2.4F, 2F, -0.4F, 1, 4, 1,f);
		WingL2.setPreRotationPointLM(0F, 0F, 0F);
		WingL2.parentModel=WingLroot;

		WingL3 = new MMM_ModelRenderer(this, 0, 0);
		WingL3.addBoxLM(4.5F, 2.5F, 1.3F, 1, 3, 1,f);
		WingL3.setPreRotationPointLM(0F, 0F, 0F);
		WingL3.parentModel=WingLroot;

		WingL4 = new MMM_ModelRenderer(this, 0, 0);
		WingL4.addBoxLM(3.5F, 2F, 1.3F, 1, 3, 1,f);
		WingL4.setPreRotationPointLM(0F, 0F, 0F);
		WingL4.parentModel=WingLroot;

		WingL5 = new MMM_ModelRenderer(this, 0, 0);
		WingL5.addBoxLM(2.5F, 2F, 1.3F, 1, 2, 1,f);
		WingL5.setPreRotationPointLM(0F, 0F, 0F);
		WingL5.parentModel=WingLroot;

		WingL6 = new MMM_ModelRenderer(this, 0, 0);
		WingL6.addBoxLM(1.8F, 1.5F, 1.3F, 1, 1, 1,f);
		WingL6.setPreRotationPointLM(0F, 0F, 0F);
		WingL6.parentModel=WingLroot;

		WingRroot = new MMM_ModelRenderer(this, 0, 0);
		WingRroot.addBoxLM(-0.5F, 0F, -0.5F, 1, 3, 1,f);
		WingRroot.setRotationPointLM(-0.5F, 2.5F+pyoffset, 1.2F);


		WingR2 = new MMM_ModelRenderer(this, 0, 0);
		WingR2.addBoxLM(1.4F, 2F, -0.4F, 1, 4, 1,f);
  	    		WingR2.setPreRotationPointLM(0F, 0F, 0F);
		WingR2.parentModel=WingRroot;

		WingR3 = new MMM_ModelRenderer(this, 0, 0);
		WingR3.addBoxLM(-5.5F, 2.5F, 1.3F, 1, 3, 1,f);
		WingR3.setPreRotationPointLM(0F, 0F, 0F);
		WingR3.parentModel=WingRroot;

		WingR4 = new MMM_ModelRenderer(this, 0, 0);
		WingR4.addBoxLM(-4.5F, 2F, 1.3F, 1, 3, 1,f);
		WingR4.setPreRotationPointLM(0F, 0F, 0F);
		WingR4.parentModel=WingRroot;

		WingR5 = new MMM_ModelRenderer(this, 0, 0);
		WingR5.addBoxLM(-3.5F, 2F, 1.3F, 1, 2, 1,f);
		WingR5.setPreRotationPointLM(0F, 0F, 0F);
		WingR5.parentModel=WingRroot;

		WingR6 = new MMM_ModelRenderer(this, 0, 0);
		WingR6.addBoxLM(-2.8F, 1.5F, 1.3F, 1, 1, 1,f);
		WingR6.setPreRotationPointLM(0F, 0F, 0F);
		WingR6.parentModel=WingRroot;*/

		SideTailL = new MMM_ModelRenderer(this, 46, 26);
		SideTailL.addBox(4.7F, -6F, 1F, 1, 1, 1,psize+0.2F);
		SideTailL.setRotationPoint(0F, 0F, 0F);
		bipedHead.addChild(SideTailL);

		SideTailL2 = new MMM_ModelRenderer(this, 46, 26);
		SideTailL2.addBox(5.1F, -6F, 1F, 1, 5, 1,psize);
		SideTailL2.setRotationPoint(0F, 0F, 0F);
		bipedHead.addChild(SideTailL2);

		SideTailR = new MMM_ModelRenderer(this, 50, 26);
		SideTailR.addBox(-5.7F, -6F, 1F, 1, 1, 1,psize+0.2F);
		SideTailR.setRotationPoint(0F, 0F, 0F);
		bipedHead.addChild(SideTailR);

		SideTailR2 = new MMM_ModelRenderer(this, 50, 26);
		SideTailR2.addBox(-6.1F, -6F, 1F, 1, 5, 1,psize);
		SideTailR2.setRotationPoint(0F, 0F, 0F);
		bipedHead.addChild(SideTailR2);

		Tail = new MMM_ModelRenderer(this, 46, 19);
		Tail.addBox(-1F, -6F, 5.7F, 2, 2, 2,psize+0.1F);
		Tail.setRotationPoint(0F, 0F, 0F);
		bipedHead.addChild(Tail);

		Tail2 = new MMM_ModelRenderer(this, 46, 19);
		Tail2.addBox(-1F, -4F, 5.8F, 2, 5, 2,psize);
		Tail2.setRotationPoint(0F, 0F, 0F);
		bipedHead.addChild(Tail2);

		Bust1 = new MMM_ModelRenderer(this, 54, 28);
		Bust1.addBox(0F, 0F, 0F, 4, 2, 2,psize);
		Bust1.setRotationPoint(-2F, 0F, -1.5F);
		setRotation(Bust1, -0.4363323F, 0F, 0F);
		bipedBody.addChild(Bust1);

		Bust2 = new MMM_ModelRenderer(this, 54, 28);
		Bust2.addBox(0F, 0F, 0F, 4, 2, 2,psize);
		Bust2.setRotationPoint(-2F, 0.9F, -0.5F);
		setRotation(Bust2, -1.134464F, 0F, 0F);
		bipedBody.addChild(Bust2);

		Ahoge = new MMM_ModelRenderer(this, 0, 1);
		Ahoge.addBox(0F, 0F, 0F, 0, 3, 4,psize);
	//	Ahoge.setRotationPointLM(0F, -8F, -4F);
		Ahoge.setRotationPoint(0F, 0F, 0F);
		bipedHead.addChild(Ahoge);

		Skirt1 = new MMM_ModelRenderer_EX(this, -2, 32,0.5F,0.5F,0.5F);
		Skirt1.addBox(0F, 0F, 0F, 12, 4, 4,psize);
	//	Skirt1.setRotationPointLM(0F, 0F+pyoffset, 0F);
		Skirt1.setRotationPoint(2.4F,-4F,-0.6F);
		Skirt.addChild(Skirt1);
		setRotatePriorityYZX(Skirt1);

		Skirt2 = new MMM_ModelRenderer_EX(this, -2, 32,0.5F,0.5F,0.5F);
		Skirt2.addBox(0F, 0F, 0F, 12, 4, 4,psize);
		Skirt2.setRotationPoint(2F,-4F,-1.2F);
		Skirt.addChild(Skirt2);
		setRotatePriorityYZX(Skirt2);

		Skirt3 = new MMM_ModelRenderer_EX(this, -6, 32,0.5F,0.5F,0.5F);
		Skirt3.addBox(0F, 0F, 0F, 16, 4, 4,psize);
		Skirt3.setRotationPoint(0F,-5F,0F);
		Skirt.addChild(Skirt3);
		setRotatePriorityYZX(Skirt3);

		Skirt4 = new MMM_ModelRenderer_EX(this, -6, 32,0.5F,0.5F,0.5F);
		Skirt4.addBox(0F, 0F, 0F, 16, 4, 4,psize);
		Skirt4.setRotationPoint(0F,-5F,0F);
		Skirt.addChild(Skirt4);
		setRotatePriorityYZX(Skirt4);

		Skirt5 = new MMM_ModelRenderer_EX(this, -2, 32,0.5F,0.5F,0.5F);
		Skirt5.addBox(0F, 0F, 0F, 12, 4, 4,psize);
		Skirt5.setRotationPoint(-2F,-4F,-1.2F);
		Skirt.addChild(Skirt5);
		setRotatePriorityYZX(Skirt5);

		Skirt6 = new MMM_ModelRenderer_EX(this, -2, 32,0.5F,0.5F,0.5F);
		Skirt6.addBox(0F, 0F, 0F, 12, 4, 4,psize);
		Skirt6.setRotationPoint(-2.4F, -4F, -0.6F);
		Skirt.addChild(Skirt6);
		setRotatePriorityYZX(Skirt6);

		Skirt7 = new MMM_ModelRenderer_EX(this, -2, 32,0.5F,0.5F,0.5F);
		Skirt7.addBox(0F, 0F, 0F, 12, 4, 4,psize);
		Skirt7.setRotationPoint(-2.4F,-4F,0.6F);
		Skirt.addChild(Skirt7);
		setRotatePriorityYZX(Skirt7);

		Skirt8 = new MMM_ModelRenderer_EX(this, -2, 32,0.5F,0.5F,0.5F);
		Skirt8.addBox(0F, 0F, 0F, 12, 4, 4,psize);
		Skirt8.setRotationPoint(-2F,-4F,1.2F);
		Skirt.addChild(Skirt8);
		setRotatePriorityYZX(Skirt8);

		Skirt9 = new MMM_ModelRenderer_EX(this,-6, 32,0.5F,0.5F,0.5F);
		Skirt9.addBox(0F, 0F, 0F, 16, 4, 4,psize);
		Skirt9.setRotationPoint(0F,-5F,0F);
		Skirt.addChild(Skirt9);
		setRotatePriorityYZX(Skirt9);

		Skirt10 = new MMM_ModelRenderer_EX(this, -6, 32,0.5F,0.5F,0.5F);
		Skirt10.addBox(0F, 0F, 0F, 16, 4, 4,psize);
		Skirt10.setRotationPoint(0F,-5F,0F);
		Skirt.addChild(Skirt10);
		setRotatePriorityYZX(Skirt10);

		Skirt11 = new MMM_ModelRenderer_EX(this, -2, 32,0.5F,0.5F,0.5F);
		Skirt11.addBox(0F, 0F, 0F, 12, 4, 4,psize);
		Skirt11.setRotationPoint(2F,-4F,1.2F);
		Skirt.addChild(Skirt11);
		setRotatePriorityYZX(Skirt11);

		Skirt12 = new MMM_ModelRenderer_EX(this, -2, 32,0.5F,0.5F,0.5F);
		Skirt12.addBox(0F, 0F, 0F, 12, 4, 4,psize);
		Skirt12.setRotationPoint(2.4F,-4F,0.6F);
		Skirt.addChild(Skirt12);
		setRotatePriorityYZX(Skirt12);

		setRotation(EarL1, 0.7853982F, 0F, -2.1293016F);
		setRotation(EarL2, 0.1570796F, 0.7853982F, -0.1570796F);
		setRotation(EarR1, 0.7853982F, 3.174172F, 2.1293016F);
		setRotation(EarR2, -0.1570796F, 0.7853982F, 0.1570796F);
		setRotation(WingLroot, 1.5707963F, 0.6108652F, 0F);
		setRotation(WingL2, 1.5358897F, 1.3089969F, 0F);
		setRotation(WingL3, 0F, -0.2792527F, -0.4886922F);
		setRotation(WingL4, 0F, -0.2792527F, -0.4886922F);
		setRotation(WingL5, 0F, -0.2792527F, -0.4886922F);
		setRotation(WingL6, 0F, -0.2792527F, -0.4886922F);
		setRotation(WingRroot, 1.5707963F, -0.6108652F, 0F);
		setRotation(WingR2, 1.5358897F, -1.3089969F, 0F);
		setRotation(WingR3, 0F, 0.2792527F, 0.4886922F);
		setRotation(WingR4, 0F, 0.2792527F, 0.4886922F);
		setRotation(WingR5, 0F, 0.2792527F, 0.4886922F);
		setRotation(WingR6, 0F, 0.2792527F, 0.4886922F);

		setRotation(Skirt1, -0.7853982F, 0.2268928F, 0.8203047F);
		setRotation(Skirt2, -0.7853982F, 0.9075712F, 0.8203047F);
      	setRotation(Skirt3, -0.7853982F, 1.308997F, 0.715585F);
      	setRotation(Skirt4, -0.7853982F, 1.832596F, 0.715585F);
      	setRotation(Skirt5, -0.7853982F, 2.181662F, 0.8203047F);
      	setRotation(Skirt6, -0.7853982F, 2.844887F, 0.8203047F);
     	setRotation(Skirt7, -0.7853982F, -2.941752F, 0.8203047F);
      	setRotation(Skirt8, -0.7853982F, -2.275037F, 0.8203047F);
      	setRotation(Skirt9, -0.7853982F, -1.885828F, 0.715585F);
      	setRotation(Skirt10, -0.7853982F, -1.33954F, 0.715585F);
      	setRotation(Skirt11, -0.7853982F, -0.9677851F, 0.8203047F);
      	setRotation(Skirt12, -0.7853982F, -0.299324F, 0.8203047F);

	}

	private void initBasicParts(float psize, float pyoffset){

		Arms = new MMM_ModelRenderer[2];
		Arms[0] = new MMM_ModelRenderer(this, 0, 0);
		Arms[0].setRotationPoint(-1F, 5F, -1F);
		Arms[1] = new MMM_ModelRenderer(this, 0, 0);
		Arms[1].setRotationPoint(1F, 5F, -1F);
		Arms[1].isInvertX = true;
		HeadMount.setRotationPoint(0F, -4F, 0F);

		bipedHead = new MMM_ModelRenderer(this, 0, 0);
		bipedHead.addBox(-4F, -8F, -4F, 8, 8, 8, psize);
		bipedHead.setRotationPoint(0F, 0F, 0F);
		bipedHead.addChild(HeadMount);

		eyeR = new MMM_ModelRenderer(this, 32, 19);
		eyeR.addPlate(-4.0F, -5.0F, -4.001F, 4, 4, 0, psize);
		eyeR.setRotationPoint(0.0F, 0.0F, 0.0F);
		eyeL = new MMM_ModelRenderer(this, 42, 19);
		eyeL.addPlate(0.0F, -5.0F, -4.001F, 4, 4, 0, psize);
		eyeL.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.addChild(eyeR);
		bipedHead.addChild(eyeL);

		bipedHeadwear = new MMM_ModelRenderer(this, 24, 0);
		bipedHeadwear.addBox(-4F, 0F, 1F, 8, 4, 3, psize);
		bipedHeadwear.setRotationPoint(0F, 0F, 0F);
		bipedHead.addChild(bipedHeadwear);
		bipedHeadwear.isHidden=true;

		bipedBody = new MMM_ModelRenderer(this, 32, 8);
		bipedBody.addBox(-3F, 0F, -2F, 6, 7, 4, psize);
		bipedBody.setRotationPoint(0F, 0F, 0F);

		bipedRightArm = new MMM_ModelRenderer(this, 48, 0);
		bipedRightArm.addBox(-2.0F, -1F, -1F, 2, 8, 2, psize);
		bipedRightArm.setRotationPoint(-3.0F, 1.5F, 0F);
		bipedRightArm.addChild(Arms[0]);

		bipedLeftArm = new MMM_ModelRenderer(this, 56, 0);
		bipedLeftArm.addBox(0.0F, -1F, -1F, 2, 8, 2, psize);
		bipedLeftArm.setRotationPoint(3.0F, 1.5F, 0F);
		bipedLeftArm.addChild(Arms[1]);

		bipedRightLeg = new MMM_ModelRenderer(this, 32, 19);
		bipedRightLeg.addBox(-2F, 0F, -2F, 3, 9, 4, psize);
		bipedRightLeg.setRotationPoint(-1F, 7F, 0F);

		bipedLeftLeg = new MMM_ModelRenderer(this, 32, 19);
		bipedLeftLeg.mirror = true;
		bipedLeftLeg.addBox(-1F, 0F, -2F, 3, 9, 4, psize);
		bipedLeftLeg.setRotationPoint(1F, 7F, 0F);

		Skirt = new MMM_ModelRenderer(this, 0, 16);
		Skirt.addBox(-4F, -2F, -4F, 0, 0, 0, psize);
		Skirt.setRotationPoint(0F, 7F, 0F);

		ChignonR = new MMM_ModelRenderer(this, 24, 18);
		ChignonR.addBox(-5F, -7F, 0.2F, 1, 3, 3, psize);
		ChignonR.setRotationPoint(0F, 0F, 0F);
		bipedHead.addChild(ChignonR);

		ChignonL = new MMM_ModelRenderer(this, 24, 18);
		ChignonL.addBox(4F, -7F, 0.2F, 1, 3, 3, psize);
		ChignonL.setRotationPoint(0F, 0F, 0F);
		bipedHead.addChild(ChignonL);

		ChignonB = new MMM_ModelRenderer(this, 52, 10);
		ChignonB.addBox(-2F, -7.2F, 4F, 4, 4, 2, psize);
		ChignonB.setRotationPoint(0F, 0F, 0F);
		bipedHead.addChild(ChignonB);

		Tail = new MMM_ModelRenderer(this, 46, 20);
		Tail.addBox(-1.5F, -6.8F, 4F, 3, 9, 3, psize);
		Tail.setRotationPoint(0F, 0F, 0F);
		bipedHead.addChild(Tail);
		Tail.isHidden=true;

        SideTailR = new MMM_ModelRenderer(this, 58, 21);
        SideTailR.addBox(-5.5F, -6.8F, 0.9F, 1, 8, 2, psize);
        SideTailR.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.addChild(SideTailR);
		SideTailR.isHidden=true;

        SideTailL = new MMM_ModelRenderer(this, 58, 21);
        SideTailL.mirror = true;
        SideTailL.addBox(4.5F, -6.8F, 0.9F, 1, 8, 2, psize);
        SideTailL.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.addChild(SideTailL);
		SideTailL.isHidden=true;

		mainFrame = new MMM_ModelRenderer(this, 0, 0);
		mainFrame.setRotationPoint(0F, 0F + pyoffset, 0F);
		mainFrame.addChild(bipedHead);
		mainFrame.addChild(bipedBody);
		mainFrame.addChild(bipedRightArm);
		mainFrame.addChild(bipedLeftArm);
		mainFrame.addChild(bipedRightLeg);
		mainFrame.addChild(bipedLeftLeg);
		mainFrame.addChild(Skirt);
	}

	public void render(MMM_IModelCaps var1, float var2, float var3, float var4, float var5, float var6, float var7, boolean var8)
	{
		super.render( var1,  var2,  var3,  var4,  var5,  var6,  var7,  var8);
	}

	public void setLivingAnimations(MMM_IModelCaps var1, float var2, float var3, float var4)
	{
		super.setLivingAnimations( var1,  var2,  var3,  var4);

		float f3 = (float)this.entityTicksExisted + this.entityIdFactor;

		if( 0.0F > mh_sin(f3 * 0.05F) + mh_sin(f3 * 0.13F) + mh_sin(f3 * 0.7F) + 2.55F) {
			eyeR.showModel = eyeL.showModel = true;
		} else {
			eyeR.showModel = eyeL.showModel = false;
		}
		IdOffset=(int)this.entityIdFactor;

	}

	public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6, MMM_IModelCaps var7)
	{
		super.setRotationAngles(var1,  var2,  var3,  var4,  var5,  var6, var7);

		float t=var3;

		WingLOrigin.rotateAngleX=0F;
		WingROrigin.rotateAngleX=0F;
		WingLOrigin.rotateAngleY=MathHelper.cos(t * 0.5F+IdOffset) * 0.2F - 0.3F;// MathHelper.cos(f2 * 0.6662F) * 10.0F * f1 * 0.5F;
		WingROrigin.rotateAngleY=MathHelper.cos(t * 0.5F + (float)Math.PI+IdOffset) * 0.2F + 0.3F;// MathHelper.cos(f2 * 0.6662F + (float)Math.PI) * 4.0F * f1 * 0.5F;
		Ahoge.rotateAngleY=MathHelper.cos(t * 0.2F + MathHelper.cos(t*0.05F+IdOffset) * 1.0F) * 0.2F;
		Ahoge.rotateAngleX=2.9F;

		Skirt.rotateAngleX=0f;

		if (aimedBow) {
			eyeL.showModel = true;
			WingLOrigin.rotateAngleY= -0.65F;
			WingROrigin.rotateAngleY= 0.65F;
		}

		if(isSneak){
			WingLroot.rotateAngleX+=bipedBody.rotateAngleX;
			WingRroot.rotateAngleX+=bipedBody.rotateAngleX;
		}

		if(isRiding){
			Skirt.rotateAngleX = convertDegtoRad(-25F);
		}

	}
	private void setRotation(MMM_ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX=x;
		model.rotateAngleY=y;
		model.rotateAngleZ=z;
	}

	private void setRotatePriorityYZX(MMM_ModelRenderer model){
		model.rotatePriority=model.RotXZY;
	}

	private float convertDegtoRad(float deg)
	{
		return deg/180F*(float)Math.PI;
	}

}
