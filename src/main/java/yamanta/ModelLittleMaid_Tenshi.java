package net.minecraft.src;

import org.lwjgl.opengl.GL11;

public class ModelLittleMaid_Tenshi extends MMM_ModelLittleMaid_Archetype {

	public MMM_ModelRenderer eyeR;
	public MMM_ModelRenderer eyeL;
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
	public MMM_ModelRenderer_EX Skirt13;
	public MMM_ModelRenderer_EX Skirt14;
	public MMM_ModelRenderer_EX Skirt15;
	public MMM_ModelRenderer_EX Skirt16;
	public MMM_ModelRenderer_EX Skirt21;
	public MMM_ModelRenderer_EX Skirt22;
	public MMM_ModelRenderer_EX Skirt23;
	public MMM_ModelRenderer_EX Skirt24;
	public MMM_ModelRenderer_EX Skirt25;
	public MMM_ModelRenderer_EX Skirt26;
	public MMM_ModelRenderer_EX Skirt27;
	public MMM_ModelRenderer_EX Skirt28;
	public MMM_ModelRenderer_EX Skirt29;
	public MMM_ModelRenderer_EX Skirt210;
	public MMM_ModelRenderer_EX Skirt211;
	public MMM_ModelRenderer_EX Skirt212;
	public MMM_ModelRenderer_EX Skirt213;
	public MMM_ModelRenderer_EX Skirt214;
	public MMM_ModelRenderer_EX Skirt215;
	public MMM_ModelRenderer_EX Skirt216;
	public MMM_ModelRenderer Neck;
	public MMM_ModelRenderer_EX Ribon4;
	public MMM_ModelRenderer_EX Ribon5;
	public MMM_ModelRenderer_EX Ribon6;
	public MMM_ModelRenderer ColorPlate1;
	public MMM_ModelRenderer ColorPlate2;
	public MMM_ModelRenderer ColorPlate3;
	public MMM_ModelRenderer ColorPlate4;
	public MMM_ModelRenderer ColorPlate5;
	public MMM_ModelRenderer ColorPlate6;
	public MMM_ModelRenderer ColorPlate7;
	public MMM_ModelRenderer ColorPlate8;
	public MMM_ModelRenderer ColorPlate9;
	public MMM_ModelRenderer ColorPlate10;
	public MMM_ModelRenderer ColorPlate11;
	public MMM_ModelRenderer ColorPlate12;
	public MMM_ModelRenderer ColorPlate13;
	public MMM_ModelRenderer ColorPlate14;
	public MMM_ModelRenderer ColorPlate15;
	public MMM_ModelRenderer ColorPlate16;
	public MMM_ModelRenderer_EX Hat1;
	public MMM_ModelRenderer Hat2;
	public MMM_ModelRenderer Hat3;
	public MMM_ModelRenderer Hat4;
	public MMM_ModelRenderer Hat5;
	public MMM_ModelRenderer Hat6;
	public MMM_ModelRenderer Hat7;
	public MMM_ModelRenderer Hat8;
	public MMM_ModelRenderer Hat9;
	public MMM_ModelRenderer Hat10;
	public MMM_ModelRenderer Hat11;
	public MMM_ModelRenderer Hat12;
	public MMM_ModelRenderer Hat13;
	public MMM_ModelRenderer Hat14;
	public MMM_ModelRenderer Peach1;
	public MMM_ModelRenderer Leaf1;
	public MMM_ModelRenderer Leaf2;
	public MMM_ModelRenderer_EX Patch1;
	public MMM_ModelRenderer_EX Patch2;
	public MMM_ModelRenderer Patch3;
	public MMM_ModelRenderer Calar1;
	public MMM_ModelRenderer Calar2;
	public MMM_ModelRenderer_EX Line1;
	public MMM_ModelRenderer_EX Line2;
	public MMM_ModelRenderer_EX Line3;
	public MMM_ModelRenderer_EX Line4;

	// armor only
	public MMM_ModelRenderer PlateR1;
	public MMM_ModelRenderer PlateR2;
	public MMM_ModelRenderer PlateR3;
	public MMM_ModelRenderer PlateR4;
	public MMM_ModelRenderer PlateR5;
	public MMM_ModelRenderer PlateR6;
	public MMM_ModelRenderer PlateL1;
	public MMM_ModelRenderer PlateL2;
	public MMM_ModelRenderer PlateL3;
	public MMM_ModelRenderer PlateL4;
	public MMM_ModelRenderer PlateL5;
	public MMM_ModelRenderer PlateL6;

	private float x1;
	private float y1;
	private float z1;

	private float[] pastX=new float[10];
	private float[] pastY=new float[10];
	private float[] pastZ=new float[10];

	public ModelLittleMaid_Tenshi()
	{
		this(0.0F);
	}

	public ModelLittleMaid_Tenshi(float f)
	{
		this(f, 0.0F);
	}

	public ModelLittleMaid_Tenshi(float f, float f1)
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


        Patch3 = new MMM_ModelRenderer(this, 31, 16);
        Patch3.addPlate(-0.0F, 0F, 0F, 1, 5, 0,psize);
        Patch3.setRotationPoint(-0.5F,0.5F,-2.002F);
        bipedBody.addChild(Patch3);

        Calar1 = new MMM_ModelRenderer(this, 32, 8);
        Calar1.addPlate(-0.0F, -1.2F, 0F, 1, 2, 0,psize);
        Calar1.setRotationPoint(0F,0.5F,-2.001F);
        setRotationDeg(Calar1,0F,0F,64F);
        bipedBody.addChild(Calar1);

        Calar2 = new MMM_ModelRenderer(this, 32, 8);
        Calar2.addPlate(-0.0F, -0.8F, 0F, 1, 2, 0,psize);
        Calar2.setRotationPoint(0F,0.5F,-2.001F);
        setRotationDeg(Calar2,0F,0F,116F);
        bipedBody.addChild(Calar2);

		Patch1 = new MMM_ModelRenderer_EX(this,22 ,18,1.01F,0.333F,1.01F);
		Patch1.addBox(-1.999F, 2.0F, -0.999F, 2, 3, 2, psize);
		Patch1.setRotationPoint(0F,0F,0.0F);
		bipedRightArm.addChild(Patch1);

		Patch2 = new MMM_ModelRenderer_EX(this,22 ,18,1.01F,0.333F,1.01F);
		Patch2.addBox(-0.001F, 2.0F, -0.999F, 2, 3, 2, psize);
		Patch2.setRotationPoint(0F,0F,0.0F);
		bipedLeftArm.addChild(Patch2);

		Skirt1 = new MMM_ModelRenderer_EX(this, 0, 34,0.5F,0.5F,1F);
		Skirt1.addPlate(-0.8F, -6F, 0F, 22, 6, 0,psize);
	//	Skirt1.setRotationPointLM(0F, 0F+pyoffset, 0F);
		Skirt1.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(Skirt1);

		Skirt2 = new MMM_ModelRenderer_EX(this, 0, 28,0.5F,0.5F,1F);
		Skirt2.addPlate(-0.8F, 0F, 0F, 22, 6, 0,psize);
		Skirt2.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(Skirt2);

		Skirt3 = new MMM_ModelRenderer_EX(this, 0, 34,0.5F,0.5F,1F);
		Skirt3.addPlate(0F, -6F, 0F, 22, 6, 0,psize);
		Skirt3.setRotationPoint(0F,2F-pyoffset,0F);
		Skirt.addChild(Skirt3);

		Skirt4 = new MMM_ModelRenderer_EX(this, 0, 28,0.5F,0.5F,1F);
		Skirt4.addPlate(0F, 0F, 0F, 22, 6, 0,psize);
		Skirt4.setRotationPoint(0F,2F-pyoffset,0F);
		Skirt.addChild(Skirt4);

		Skirt5 = new MMM_ModelRenderer_EX(this, 0, 34,0.5F,0.5F,1F);
		Skirt5.addPlate(0F, -6F, 0F, 22, 6, 0,psize);
		Skirt5.setRotationPoint(0F,2F-pyoffset,0F);
		Skirt.addChild(Skirt5);

		Skirt6 = new MMM_ModelRenderer_EX(this, 0, 28,0.5F,0.5F,1F);
		Skirt6.addPlate(0F, 0F, 0F, 22, 6, 0,psize);
		Skirt6.setRotationPoint(0F,2F-pyoffset,0F);
		Skirt.addChild(Skirt6);

		Skirt7 = new MMM_ModelRenderer_EX(this, 0, 34,0.5F,0.5F,1F);
		Skirt7.addPlate(-0.8F, -6F, 0F, 22, 6, 0,psize);
		Skirt7.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(Skirt7);

		Skirt8 = new MMM_ModelRenderer_EX(this, 0, 28,0.5F,0.5F,1F);
		Skirt8.addPlate(-0.8F, 0F, 0F, 22, 6, 0,psize);
		Skirt8.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(Skirt8);

		Skirt9 = new MMM_ModelRenderer_EX(this, 0, 34,0.5F,0.5F,1F);
		Skirt9.addPlate(-0.8F, -6F, 0F, 22, 6, 0,psize);
		Skirt9.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(Skirt9);

		Skirt10 = new MMM_ModelRenderer_EX(this, 0, 28,0.5F,0.5F,1F);
		Skirt10.addPlate(-0.8F, 0F, 0F, 22, 6, 0,psize);
		Skirt10.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(Skirt10);

		Skirt11 = new MMM_ModelRenderer_EX(this, 0, 34,0.5F,0.5F,1F);
		Skirt11.addPlate(0F, -6F, 0F, 22, 6, 0,psize);
		Skirt11.setRotationPoint(0F,2F-pyoffset,0F);
		Skirt.addChild(Skirt11);

		Skirt12 = new MMM_ModelRenderer_EX(this, 0, 28,0.5F,0.5F,1F);
		Skirt12.addPlate(0F, 0F, 0F, 22, 6, 0,psize);
		Skirt12.setRotationPoint(0F,2F-pyoffset,0F);
		Skirt.addChild(Skirt12);

		Skirt13 = new MMM_ModelRenderer_EX(this, 0, 34,0.5F,0.5F,1F);
		Skirt13.addPlate(0F, -6F, 0F, 22, 6, 0,psize);
		Skirt13.setRotationPoint(0F,2F-pyoffset,0F);
		Skirt.addChild(Skirt13);

		Skirt14 = new MMM_ModelRenderer_EX(this, 0, 28,0.5F,0.5F,1F);
		Skirt14.addPlate(0F, 0F, 0F, 22, 6, 0,psize);
		Skirt14.setRotationPoint(0F,2F-pyoffset,0F);
		Skirt.addChild(Skirt14);

		Skirt15 = new MMM_ModelRenderer_EX(this, 0, 34,0.5F,0.5F,1F);
		Skirt15.addPlate(-0.8F, -6F, 0F, 22, 6, 0,psize);
		Skirt15.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(Skirt15);

		Skirt16 = new MMM_ModelRenderer_EX(this, 0, 28,0.5F,0.5F,1F);
		Skirt16.addPlate(-0.8F, 0F, 0F, 22, 6, 0,psize);
		Skirt16.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(Skirt16);

		Skirt21 = new MMM_ModelRenderer_EX(this, 0, 48,0.25F,0.25F,1F);
		Skirt21.addPlate(-1.6F, -8F, 0F, 28, 8, 0,psize);
		Skirt21.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(Skirt21);

		Skirt22 = new MMM_ModelRenderer_EX(this, 0, 40,0.25F,0.25F,1F);
		Skirt22.addPlate(-1.6F, 0F, 0F,28, 8, 0,psize);
		Skirt22.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(Skirt22);

		Skirt23 = new MMM_ModelRenderer_EX(this, 0, 48,0.25F,0.25F,1F);
		Skirt23.addPlate(0F, -8F, 0F,28, 8, 0,psize);
		Skirt23.setRotationPoint(0F,2F-pyoffset,0F);
		Skirt.addChild(Skirt23);

		Skirt24 = new MMM_ModelRenderer_EX(this, 0, 40,0.25F,0.25F,1F);
		Skirt24.addPlate(0F, 0F, 0F, 28, 8, 0,psize);
		Skirt24.setRotationPoint(0F,2F-pyoffset,0F);
		Skirt.addChild(Skirt24);

		Skirt25 = new MMM_ModelRenderer_EX(this, 0, 48,0.25F,0.25F,1F);
		Skirt25.addPlate(0F, -8F, 0F, 28, 8, 0,psize);
		Skirt25.setRotationPoint(0F,2F-pyoffset,0F);
		Skirt.addChild(Skirt25);

		Skirt26 = new MMM_ModelRenderer_EX(this, 0, 40,0.25F,0.25F,1F);
		Skirt26.addPlate(0F, 0F, 0F, 28, 8, 0,psize);
		Skirt26.setRotationPoint(0F,2F-pyoffset,0F);
		Skirt.addChild(Skirt26);

		Skirt27 = new MMM_ModelRenderer_EX(this, 0, 48,0.25F,0.25F,1F);
		Skirt27.addPlate(-1.6F, -8F, 0F, 28, 8, 0,psize);
		Skirt27.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(Skirt27);

		Skirt28 = new MMM_ModelRenderer_EX(this, 0, 40,0.25F,0.25F,1F);
		Skirt28.addPlate(-1.6F, 0F, 0F,28, 8, 0,psize);
		Skirt28.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(Skirt28);

		Skirt29 = new MMM_ModelRenderer_EX(this, 0, 48,0.25F,0.25F,1F);
		Skirt29.addPlate(-1.6F, -8F, 0F, 28, 8, 0,psize);
		Skirt29.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(Skirt29);

		Skirt210 = new MMM_ModelRenderer_EX(this, 0, 40,0.25F,0.25F,1F);
		Skirt210.addPlate(-1.6F, 0F, 0F, 28, 8, 0,psize);
		Skirt210.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(Skirt210);

		Skirt211 = new MMM_ModelRenderer_EX(this, 0, 48,0.25F,0.25F,1F);
		Skirt211.addPlate(0F, -8F, 0F, 28, 8, 0,psize);
		Skirt211.setRotationPoint(0F,2F-pyoffset,0F);
		Skirt.addChild(Skirt211);

		Skirt212 = new MMM_ModelRenderer_EX(this, 0, 40,0.25F,0.25F,1F);
		Skirt212.addPlate(0F, 0F, 0F, 28, 8, 0,psize);
		Skirt212.setRotationPoint(0F,2F-pyoffset,0F);
		Skirt.addChild(Skirt212);

		Skirt213 = new MMM_ModelRenderer_EX(this, 0, 48,0.25F,0.25F,1F);
		Skirt213.addPlate(0F, -8F, 0F, 28, 8, 0,psize);
		Skirt213.setRotationPoint(0F,2F-pyoffset,0F);
		Skirt.addChild(Skirt213);

		Skirt214 = new MMM_ModelRenderer_EX(this, 0, 40,0.25F,0.25F,1F);
		Skirt214.addPlate(0F, 0F, 0F, 28, 8, 0,psize);
		Skirt214.setRotationPoint(0F,2F-pyoffset,0F);
		Skirt.addChild(Skirt214);

		Skirt215 = new MMM_ModelRenderer_EX(this, 0, 48,0.25F,0.25F,1F);
		Skirt215.addPlate(-1.6F, -8F, 0F, 28, 8, 0,psize);
		Skirt215.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(Skirt215);

		Skirt216 = new MMM_ModelRenderer_EX(this, 0, 40,0.25F,0.25F,1F);
		Skirt216.addPlate(-1.6F, 0F, 0F, 28, 8, 0,psize);
		Skirt216.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(Skirt216);

		ColorPlate1 = new MMM_ModelRenderer(this, 0, 4);
		ColorPlate1.addPlate(6.3F, 2F, 0F, 1, 2, 0,psize);
		ColorPlate1.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(ColorPlate1);

		ColorPlate2 = new MMM_ModelRenderer(this, 2, 4);
		ColorPlate2.addPlate(6.3F, 2F, 0F, 1, 2, 0,psize);
		ColorPlate2.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(ColorPlate2);

		ColorPlate3 = new MMM_ModelRenderer(this, 4, 4);
		ColorPlate3.addPlate(6.3F, 2F, 0F, 1, 2, 0,psize);
		ColorPlate3.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(ColorPlate3);

		ColorPlate4 = new MMM_ModelRenderer(this, 0, 6);
		ColorPlate4.addPlate(6.3F, 2F, 0F, 1, 2, 0,psize);
		ColorPlate4.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(ColorPlate4);

		ColorPlate5 = new MMM_ModelRenderer(this, 2, 6);
		ColorPlate5.addPlate(6.3F, 2F, 0F, 1, 2, 0,psize);
		ColorPlate5.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(ColorPlate5);

		ColorPlate6 = new MMM_ModelRenderer(this, 4, 6);
		ColorPlate6.addPlate(6.3F, 2F, 0F, 1, 2, 0,psize);
		ColorPlate6.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(ColorPlate6);

		ColorPlate7 = new MMM_ModelRenderer(this, 6, 6);
		ColorPlate7.addPlate(6.3F, 2F, 0F, 1, 2, 0,psize);
		ColorPlate7.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(ColorPlate7);

		ColorPlate8 = new MMM_ModelRenderer(this, 6, 4);
		ColorPlate8.addPlate(6.3F, 2F, 0F, 1, 2, 0,psize);
		ColorPlate8.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(ColorPlate8);

		ColorPlate9 = new MMM_ModelRenderer(this, 0, 4);
		ColorPlate9.addPlate(6.3F, 2F, 0F, 1, 2, 0,psize);
		ColorPlate9.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(ColorPlate9);

		ColorPlate10 = new MMM_ModelRenderer(this, 2, 4);
		ColorPlate10.addPlate(6.3F, 2F, 0F, 1, 2, 0,psize);
		ColorPlate10.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(ColorPlate10);

		ColorPlate11 = new MMM_ModelRenderer(this, 4, 4);
		ColorPlate11.addPlate(6.3F, 2F, 0F, 1, 2, 0,psize);
		ColorPlate11.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(ColorPlate11);

		ColorPlate12 = new MMM_ModelRenderer(this, 0, 6);
		ColorPlate12.addPlate(6.3F, 2F, 0F, 1, 2, 0,psize);
		ColorPlate12.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(ColorPlate12);

		ColorPlate13 = new MMM_ModelRenderer(this, 2, 6);
		ColorPlate13.addPlate(6.3F, 2F, 0F, 1, 2, 0,psize);
		ColorPlate13.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(ColorPlate13);

		ColorPlate14 = new MMM_ModelRenderer(this, 4, 6);
		ColorPlate14.addPlate(6.3F, 2F, 0F, 1, 2, 0,psize);
		ColorPlate14.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(ColorPlate14);

		ColorPlate15 = new MMM_ModelRenderer(this, 6, 6);
		ColorPlate15.addPlate(6.3F, 2F, 0F, 1, 2, 0,psize);
		ColorPlate15.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(ColorPlate15);

		ColorPlate16 = new MMM_ModelRenderer(this, 6, 4);
		ColorPlate16.addPlate(6.3F, 2F, 0F, 1, 2, 0,psize);
		ColorPlate16.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(ColorPlate16);

		Hat1 = new MMM_ModelRenderer_EX(this, 0, 16,1.1F,1.1F,1.1F);
		Hat1.addBox(-4.0F, -4.0F, 0F, 8, 8, 2,psize);
		Hat1.setRotationPoint(0F,-6F,0F);
		setRotationDeg(Hat1,90F,180F,0F);
		bipedHead.addChild(Hat1);

		Hat2 = new MMM_ModelRenderer(this, 0, 16);
		Hat2.addBox(-4.0F, -4.0F, 1F, 8, 8, 2,psize);
		Hat2.setRotationPoint(0F,-6F,0F);
		setRotationDeg(Hat2,90F,180F,0F);
		bipedHead.addChild(Hat2);

		Hat3 = new MMM_ModelRenderer(this, 0, 18);
		Hat3.addPlate(-4.0F, 4.0F, 0F, 8, 3, 0,psize);
		Hat3.setRotationPoint(0F,-6F,0F);
		setRotationDeg(Hat3,90F,180F,0F);
		bipedHead.addChild(Hat3);

		Hat4 = new MMM_ModelRenderer(this, 0, 18);
		Hat4.addPlate(-4.0F, 4.0F, 0F, 8, 3, 0,psize);
		Hat4.setRotationPoint(0F,-6F,0F);
		setRotationDeg(Hat4,90F,90F,0F);
		bipedHead.addChild(Hat4);

		Hat5 = new MMM_ModelRenderer(this, 0, 18);
		Hat5.addPlate(-4.0F, 4.0F, 0F, 8, 3, 0,psize);
		Hat5.setRotationPoint(0F,-6F,0F);
		setRotationDeg(Hat5,90F,0F,0F);
		bipedHead.addChild(Hat5);

		Hat6 = new MMM_ModelRenderer(this, 0, 18);
		Hat6.addPlate(-4.0F, 4.0F, 0F, 8, 3, 0,psize);
		Hat6.setRotationPoint(0F,-6F,0F);
		setRotationDeg(Hat6,90F,-90F,0F);
		bipedHead.addChild(Hat6);

		Hat7 = new MMM_ModelRenderer(this, 0, 18);
		Hat7.addPlate(-2.1F, 4.8F, 0F, 3, 3, 0,psize);
		Hat7.setRotationPoint(0F,-6F,0F);
		setRotationDeg(Hat7,90F,135F,0F);
		bipedHead.addChild(Hat7);

		Hat8 = new MMM_ModelRenderer(this, 0, 18);
		Hat8.addPlate(-2.1F, 4.8F, 0F, 3, 3, 0,psize);
		Hat8.setRotationPoint(0F,-6F,0F);
		setRotationDeg(Hat8,90F,45F,0F);
		bipedHead.addChild(Hat8);

		Hat9 = new MMM_ModelRenderer(this, 0, 18);
		Hat9.addPlate(-2.1F, 4.8F, 0F, 3, 3, 0,psize);
		Hat9.setRotationPoint(0F,-6F,0F);
		setRotationDeg(Hat9,90F,-135F,0F);
		bipedHead.addChild(Hat9);

		Hat10 = new MMM_ModelRenderer(this, 0, 18);
		Hat10.addPlate(-2.1F, 4.8F, 0F, 3, 3, 0,psize);
		Hat10.setRotationPoint(0F,-6F,0F);
		setRotationDeg(Hat10,90F,-45F,0F);
		bipedHead.addChild(Hat10);

		Hat11 = new MMM_ModelRenderer(this, 0, 18);
		Hat11.addPlate(0.1F, 4.8F, 0F, 2, 3, 0,psize);
		Hat11.setRotationPoint(0F,-6F,0F);
		setRotationDeg(Hat11,90F,135F,0F);
		bipedHead.addChild(Hat11);

		Hat12 = new MMM_ModelRenderer(this, 0, 18);
		Hat12.addPlate(0.1F, 4.8F, 0F, 2, 3, 0,psize);
		Hat12.setRotationPoint(0F,-6F,0F);
		setRotationDeg(Hat12,90F,45F,0F);
		bipedHead.addChild(Hat12);

		Hat13 = new MMM_ModelRenderer(this, 0, 18);
		Hat13.addPlate(0.1F, 4.8F, 0F, 2, 3, 0,psize);
		Hat13.setRotationPoint(0F,-6F,0F);
		setRotationDeg(Hat13,90F,-135F,0F);
		bipedHead.addChild(Hat13);

		Hat14 = new MMM_ModelRenderer(this, 0, 18);
		Hat14.addPlate(0.1F, 4.8F, 0F, 2, 3, 0,psize);
		Hat14.setRotationPoint(0F,-6F,0F);
		setRotationDeg(Hat14,90F,-45F,0F);
		bipedHead.addChild(Hat14);

		Line1 = new MMM_ModelRenderer_EX(this, 52, 10,0.6F,1.101F,1.101F);
		Line1.addBox(-1F, -4F, -4F, 1, 8, 1,psize);
		Line1.setRotationPoint(0F,-6.001F,0F);
		setRotationDeg(Line1,0F,0F,90F);
		bipedHead.addChild(Line1);

		Line2 = new MMM_ModelRenderer_EX(this, 52, 10,0.6F,1.101F,1.101F);
		Line2.addBox(-1F, -4F, -4F, 1, 8, 1,psize);
		Line2.setRotationPoint(0F,-6.001F,0F);
		setRotationDeg(Line2,0F,90F,90F);
		bipedHead.addChild(Line2);

		Line3 = new MMM_ModelRenderer_EX(this, 52, 10,0.6F,1.101F,1.101F);
		Line3.addBox(-1F, -4F, -4F, 1, 8, 1,psize);
		Line3.setRotationPoint(0F,-6.001F,0F);
		setRotationDeg(Line3,0F,180F,90F);
		bipedHead.addChild(Line3);

		Line4 = new MMM_ModelRenderer_EX(this, 52, 10,0.6F,1.101F,1.101F);
		Line4.addBox(-1F, -4F, -4F, 1, 8, 1,psize);
		Line4.setRotationPoint(0F,-6.001F,0F);
		setRotationDeg(Line4,0F,-90F,90F);
		bipedHead.addChild(Line4);

		Peach1 = new MMM_ModelRenderer(this, 0, 0);
		Peach1.addBox(4.0F, 1.0F, 0F, 2, 2, 2,psize);
		Peach1.setRotationPoint(0F,-6.001F,0F);
		setRotationDeg(Peach1,90F,180F,0F);
		bipedHead.addChild(Peach1);

		Leaf1 = new MMM_ModelRenderer(this, 1, 6);
		Leaf1.addPlate(0.0F, 0.0F, 0F, 1, 3, 0,psize);
		Leaf1.setRotationPoint(-5F,-6.5F,-1F);
		setRotationDeg(Leaf1,-15F,-123F,-170F);
		bipedHead.addChild(Leaf1);

		Leaf2 = new MMM_ModelRenderer(this, 1, 6);
		Leaf2.addPlate(0.0F, 0.0F, 0F, 1, 3, 0,psize);
		Leaf2.setRotationPoint(-5F,-6.0F,-1F);
		setRotationDeg(Leaf2,-25F,-146F,-130F);
		bipedHead.addChild(Leaf2);

		Neck = new MMM_ModelRenderer(this,16 ,5);
		Neck.addBox(-1.0F, -1.0F, 1.0F, 2, 1, 2, psize);
		Neck.setRotationPoint(0.0F,0.0F,-2.0F);
		bipedBody.addChild(Neck);

		Ribon4 = new MMM_ModelRenderer_EX(this,22 ,16,0.5F,0.5F,0.7F);
		Ribon4.addBox(-1.0F, -0.5F, -0.2F, 2, 1, 1, psize);
		Ribon4.setRotationPoint(0.0F,0.7F,-2.2F);
		bipedBody.addChild(Ribon4);
		setRotationDeg(Ribon4,0F,0F,0F);

		Ribon5 = new MMM_ModelRenderer_EX(this,22 ,16,0.9F,0.9F,0.9F);
		Ribon5.addBox(0.0F, -0.5F, 0.0F, 1, 1, 1, psize);
		Ribon5.setRotationPoint(0.3F,0.7F,-2.2F);
		bipedBody.addChild(Ribon5);
		setRotationDeg(Ribon5,0F,0F,15F);

		Ribon6 = new MMM_ModelRenderer_EX(this,22 ,16,0.9F,0.9F,0.9F);
		Ribon6.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 1, psize);
		Ribon6.setRotationPoint(-0.3F,0.7F,-2.2F);
		bipedBody.addChild(Ribon6);
		setRotationDeg(Ribon6,0F,0F,-15F);

		PlateR1 = new MMM_ModelRenderer_EX(this,45 ,52,0.25F,0.25F,0.25F);
		PlateR1.addPlate(-8.0F, 0.0F, 0.0F, 16, 8, 0, psize);
		PlateR1.setRotationPoint(-3.0F,4.6F-pyoffset+1.0F,0.0F);
		Skirt.addChild(PlateR1);
		setRotationDeg(PlateR1,-50F,90F,0F);

		PlateR2 = new MMM_ModelRenderer_EX(this,44 ,60,0.25F,0.25F,0.25F);
		PlateR2.addPlate(-8.0F, 0.0F, 0.0F, 8, 4, 0, psize);
		PlateR2.setRotationPoint(-3.0F,4.6F-pyoffset+1.0F,2.0F);
		Skirt.addChild(PlateR2);
		setRotationDeg(PlateR2,60F,0F,-40F);

		PlateR3 = new MMM_ModelRenderer_EX(this,44 ,60,0.25F,0.25F,0.25F);
		PlateR3.addPlate(-8.0F, 0.0F, 0.0F, 8, 4, 0, psize);
		PlateR3.setRotationPoint(-3.0F,4.6F-pyoffset+1.0F,-2.0F);
		Skirt.addChild(PlateR3);
		setRotationDeg(PlateR3,-60F,0F,-40F);

		PlateR4 = new MMM_ModelRenderer_EX(this,44 ,52,0.25F,0.25F,0.25F);
		PlateR4.addPlate(-10F, 0.0F, 0.0F, 20, 8, 0, psize);
		PlateR4.setRotationPoint(-4.5F,6.3F-pyoffset+1.0F,0.0F);
		Skirt.addChild(PlateR4);
		setRotationDeg(PlateR4,-50F,90F,0F);

		PlateR5 = new MMM_ModelRenderer_EX(this,44 ,60,0.25F,0.25F,0.25F);
		PlateR5.addPlate(-8.0F, 0.0F, 0.0F, 8, 4, 0, psize);
		PlateR5.setRotationPoint(-4.5F,6.3F-pyoffset+1.0F,2.5F);
		Skirt.addChild(PlateR5);
		setRotationDeg(PlateR5,60F,0F,-40F);

		PlateR6 = new MMM_ModelRenderer_EX(this,44 ,60,0.25F,0.25F,0.25F);
		PlateR6.addPlate(-8.0F, 0.0F, 0.0F, 8, 4, 0, psize);
		PlateR6.setRotationPoint(-4.5F,6.3F-pyoffset+1.0F,-2.5F);
		Skirt.addChild(PlateR6);
		setRotationDeg(PlateR6,-60F,0F,-40F);

		PlateL1 = new MMM_ModelRenderer_EX(this,45 ,52,0.25F,0.25F,0.25F);
		PlateL1.addPlate(-8.0F, 0.0F, 0.0F, 16, 8, 0, psize);
		PlateL1.setRotationPoint(3.0F,4.6F-pyoffset+1.0F,0.0F);
		Skirt.addChild(PlateL1);
		setRotationDeg(PlateL1,50F,90F,0F);

		PlateL2 = new MMM_ModelRenderer_EX(this,44 ,60,0.25F,0.25F,0.25F);
		PlateL2.addPlate(0.0F, 0.0F, 0.0F, 8, 4, 0, psize);
		PlateL2.setRotationPoint(3.0F,4.6F-pyoffset+1.0F,2.0F);
		Skirt.addChild(PlateL2);
		setRotationDeg(PlateL2,60F,0F,40F);

		PlateL3 = new MMM_ModelRenderer_EX(this,44 ,60,0.25F,0.25F,0.25F);
		PlateL3.addPlate(0.0F, 0.0F, 0.0F, 8, 4, 0, psize);
		PlateL3.setRotationPoint(3.0F,4.6F-pyoffset+1.0F,-2.0F);
		Skirt.addChild(PlateL3);
		setRotationDeg(PlateL3,-60F,0F,40F);

		PlateL4 = new MMM_ModelRenderer_EX(this,44 ,52,0.25F,0.25F,0.25F);
		PlateL4.addPlate(-10F, 0.0F, 0.0F, 20, 8, 0, psize);
		PlateL4.setRotationPoint(4.5F,6.3F-pyoffset+1.0F,0.0F);
		Skirt.addChild(PlateL4);
		setRotationDeg(PlateL4,50F,90F,0F);

		PlateL5 = new MMM_ModelRenderer_EX(this,44 ,60,0.25F,0.25F,0.25F);
		PlateL5.addPlate(0.0F, 0.0F, 0.0F, 8, 4, 0, psize);
		PlateL5.setRotationPoint(4.5F,6.3F-pyoffset+1.0F,2.5F);
		Skirt.addChild(PlateL5);
		setRotationDeg(PlateL5,60F,0F,40F);

		PlateL6 = new MMM_ModelRenderer_EX(this,44 ,60,0.25F,0.25F,0.25F);
		PlateL6.addPlate(0.0F, 0.0F, 0.0F, 8, 4, 0, psize);
		PlateL6.setRotationPoint(4.5F,6.3F-pyoffset+1.0F,-2.5F);
		Skirt.addChild(PlateL6);
		setRotationDeg(PlateL6,-60F,0F,40F);

		setRotationDeg(Skirt1, -118F, 113F, 47F);
		setRotationDeg(Skirt2, -65F, 113F, 47F);
		setRotationDeg(Skirt3, -122F, 158F, 47F);
		setRotationDeg(Skirt4, -67F, 158F, 47F);
		setRotationDeg(Skirt5, -113F, -159F, 47F);
		setRotationDeg(Skirt6, -58F, -159F, 47F);
		setRotationDeg(Skirt7, -114F, -114F, 47F);
		setRotationDeg(Skirt8, -65F, -114F, 47F);
		setRotationDeg(Skirt9, -115F, -68F, 47F);
		setRotationDeg(Skirt10, -65F, -68F, 47F);
      	setRotationDeg(Skirt11, -122F, -23F, 47F);
      	setRotationDeg(Skirt12, -66F, -23F, 47F);
      	setRotationDeg(Skirt13, -114F, 22F, 47F);
      	setRotationDeg(Skirt14, -58F, 22F, 47F);
      	setRotationDeg(Skirt15, -115F, 67F, 47F);
      	setRotationDeg(Skirt16, -62F, 67F, 47F);
      	setRotationDeg(Skirt21, -118F, 113F, 43F);
      	setRotationDeg(Skirt22, -65F, 113F, 43F);
      	setRotationDeg(Skirt23, -122F, 158F, 44F);
      	setRotationDeg(Skirt24, -67F, 158F, 44F);
      	setRotationDeg(Skirt25, -113F, -159F, 44F);
      	setRotationDeg(Skirt26, -58F, -159F, 44F);
      	setRotationDeg(Skirt27, -114F, -114F, 43F);
      	setRotationDeg(Skirt28, -65F, -114F, 43F);
      	setRotationDeg(Skirt29, -115F, -68F, 43F);
      	setRotationDeg(Skirt210, -65F, -68F, 43F);
      	setRotationDeg(Skirt211, -122F, -23F, 44F);
      	setRotationDeg(Skirt212, -66F, -23F, 44F);
      	setRotationDeg(Skirt213, -114F, 22F, 44F);
      	setRotationDeg(Skirt214, -58F, 22F, 44F);
      	setRotationDeg(Skirt215, -115F, 67F, 43F);
      	setRotationDeg(Skirt216, -62F, 67F, 43F);
      	setRotationDeg(ColorPlate1, -70F, 67F, 40F);
      	setRotationDeg(ColorPlate2, -72F,91F, 40F);
      	setRotationDeg(ColorPlate3, -74F, 114F, 40F);
      	setRotationDeg(ColorPlate4, -73F, 137F, 38F);
      	setRotationDeg(ColorPlate5, -72F, 159F, 37F);
      	setRotationDeg(ColorPlate6, -65F, -180F, 35F);
      	setRotationDeg(ColorPlate7, -68F, -159F, 38F);
      	setRotationDeg(ColorPlate8, -67F, -136F, 38F);
      	setRotationDeg(ColorPlate9, -72F, -114F, 40F);
      	setRotationDeg(ColorPlate10, -67F, -90F, 38F);
      	setRotationDeg(ColorPlate11, -77F, -69F, 42F);
      	setRotationDeg(ColorPlate12, -67F, -44F, 36F);
      	setRotationDeg(ColorPlate13, -74F, -23F, 39F);
      	setRotationDeg(ColorPlate14, -67F, 1F, 36F);
      	setRotationDeg(ColorPlate15, -68F, 22F, 38F);
      	setRotationDeg(ColorPlate16, -67F, 45F, 38F);
      	setRotatePriorityYZX(Skirt1);
      	setRotatePriorityYZX(Skirt2);
      	setRotatePriorityYZX(Skirt3);
      	setRotatePriorityYZX(Skirt4);
      	setRotatePriorityYZX(Skirt5);
      	setRotatePriorityYZX(Skirt6);
      	setRotatePriorityYZX(Skirt7);
      	setRotatePriorityYZX(Skirt8);
      	setRotatePriorityYZX(Skirt9);
      	setRotatePriorityYZX(Skirt10);
      	setRotatePriorityYZX(Skirt11);
      	setRotatePriorityYZX(Skirt12);
      	setRotatePriorityYZX(Skirt13);
      	setRotatePriorityYZX(Skirt14);
      	setRotatePriorityYZX(Skirt15);
      	setRotatePriorityYZX(Skirt16);
      	setRotatePriorityYZX(Skirt21);
      	setRotatePriorityYZX(Skirt22);
      	setRotatePriorityYZX(Skirt23);
      	setRotatePriorityYZX(Skirt24);
      	setRotatePriorityYZX(Skirt25);
      	setRotatePriorityYZX(Skirt26);
      	setRotatePriorityYZX(Skirt27);
      	setRotatePriorityYZX(Skirt28);
      	setRotatePriorityYZX(Skirt29);
      	setRotatePriorityYZX(Skirt210);
      	setRotatePriorityYZX(Skirt211);
      	setRotatePriorityYZX(Skirt212);
      	setRotatePriorityYZX(Skirt213);
      	setRotatePriorityYZX(Skirt214);
      	setRotatePriorityYZX(Skirt215);
      	setRotatePriorityYZX(Skirt216);
      	setRotatePriorityYZX(Patch1);
      	setRotatePriorityYZX(Patch2);
      	setRotatePriorityYZX(Patch3);
      	setRotatePriorityYZX(ColorPlate1);
      	setRotatePriorityYZX(ColorPlate2);
      	setRotatePriorityYZX(ColorPlate3);
      	setRotatePriorityYZX(ColorPlate4);
      	setRotatePriorityYZX(ColorPlate5);
      	setRotatePriorityYZX(ColorPlate6);
      	setRotatePriorityYZX(ColorPlate7);
      	setRotatePriorityYZX(ColorPlate8);
      	setRotatePriorityYZX(ColorPlate9);
      	setRotatePriorityYZX(ColorPlate10);
      	setRotatePriorityYZX(ColorPlate16);
      	setRotatePriorityYZX(ColorPlate15);
      	setRotatePriorityYZX(ColorPlate14);
      	setRotatePriorityYZX(ColorPlate13);
      	setRotatePriorityYZX(ColorPlate12);
      	setRotatePriorityYZX(ColorPlate11);
      	setRotatePriorityYZX(Neck);
      	setRotatePriorityYZX(Hat1);
      	setRotatePriorityYZX(Hat2);
      	setRotatePriorityYZX(Hat3);
      	setRotatePriorityYZX(Hat4);
      	setRotatePriorityYZX(Hat5);
      	setRotatePriorityYZX(Hat6);
      	setRotatePriorityYZX(Hat7);
      	setRotatePriorityYZX(Hat8);
      	setRotatePriorityYZX(Hat9);
      	setRotatePriorityYZX(Hat10);
      	setRotatePriorityYZX(Hat11);
      	setRotatePriorityYZX(Hat12);
      	setRotatePriorityYZX(Hat13);
      	setRotatePriorityYZX(Hat14);
      	setRotatePriorityYZX(Line1);
      	setRotatePriorityYZX(Line2);
      	setRotatePriorityYZX(Line3);
      	setRotatePriorityYZX(Line4);
      	setRotatePriorityYZX(Peach1);
      	setRotatePriorityYZX(Leaf1);
      	setRotatePriorityYZX(Leaf2);
      	setRotatePriorityYZX(Calar1);
      	setRotatePriorityYZX(Calar2);
      	setRotatePriorityYZX(Ribon4);
      	setRotatePriorityYZX(Ribon5);
      	setRotatePriorityYZX(Ribon6);
      	setRotatePriorityYZX(PlateR1);
      	setRotatePriorityYZX(PlateR2);
      	setRotatePriorityYZX(PlateR3);
      	setRotatePriorityYZX(PlateR4);
      	setRotatePriorityYZX(PlateR5);
      	setRotatePriorityYZX(PlateR6);
      	setRotatePriorityYZX(PlateL1);
      	setRotatePriorityYZX(PlateL2);
      	setRotatePriorityYZX(PlateL3);
      	setRotatePriorityYZX(PlateL4);
      	setRotatePriorityYZX(PlateL5);
      	setRotatePriorityYZX(PlateL6);

	}

	private void initBasicParts(float psize, float pyoffset){


		Arms = new MMM_ModelRenderer[2];
		Arms[0] = new MMM_ModelRenderer(this, 0, 0);
		Arms[0].setRotationPoint(-1F, 5F, -1F);
		Arms[1] = new MMM_ModelRenderer(this, 0, 0);
		Arms[1].setRotationPoint(1F, 5F, -1F);
		Arms[1].isInvertX = true;
		HeadMount.setRotationPoint(0F, -3F, 0F);

		bipedHead = new MMM_ModelRenderer(this, 0, 1);
		bipedHead.addBox(-4F, -7F, -4F, 8, 7, 8, psize);
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
		ChignonR.isHidden=true;

		ChignonL = new MMM_ModelRenderer(this, 24, 18);
		ChignonL.addBox(4F, -7F, 0.2F, 1, 3, 3, psize);
		ChignonL.setRotationPoint(0F, 0F, 0F);
		bipedHead.addChild(ChignonL);
		ChignonL.isHidden=true;

		ChignonB = new MMM_ModelRenderer(this, 52, 10);
		ChignonB.addBox(-2F, -7.2F, 4F, 4, 4, 2, psize);
		ChignonB.setRotationPoint(0F, 0F, 0F);
		bipedHead.addChild(ChignonB);
		ChignonB.isHidden=true;

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
		//	ItemStack itemstack = (ItemStack)var1.getCapsValue(this.caps_currentArmor, 3);
		//	if(itemstack != null)
		//		System.out.println(String.format("%s", itemstack.getItemName()));
			if((ItemStack)var1.getCapsValue(this.caps_currentArmor, 3)!=null){
				Hat1.isHidden=Hat2.isHidden=Hat3.isHidden=Hat4.isHidden=Hat5.isHidden=Hat6.isHidden=Hat7.isHidden=Hat8.isHidden=Hat9.isHidden=Hat10.isHidden=Hat11.isHidden=Hat12.isHidden=Hat13.isHidden=Hat14.isHidden=false;
				Peach1.isHidden=false;
				Line1.isHidden=Line2.isHidden=Line3.isHidden=Line4.isHidden=false;
				Leaf1.isHidden=Leaf2.isHidden=false;
			}
			else{
				Hat1.isHidden=Hat2.isHidden=Hat3.isHidden=Hat4.isHidden=Hat5.isHidden=Hat6.isHidden=Hat7.isHidden=Hat8.isHidden=Hat9.isHidden=Hat10.isHidden=Hat11.isHidden=Hat12.isHidden=Hat13.isHidden=Hat14.isHidden=true;
				Peach1.isHidden=true;
				Line1.isHidden=Line2.isHidden=Line3.isHidden=Line4.isHidden=true;
				Leaf1.isHidden=Leaf2.isHidden=true;
			}
	}

	public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6, MMM_IModelCaps var7)
	{
	super.setRotationAngles(var1,  var2,  var3,  var4,  var5,  var6, var7);

		bipedHeadwear.rotateAngleX=bipedHeadwear.rotateAngleY=bipedHeadwear.rotateAngleZ=0f;

		Skirt.rotateAngleX=0f;
		Skirt.rotationPointZ=0f;

		if (aimedBow) {
			eyeL.showModel = true;
		}
		if(isSneak){
		}

		if(isRiding){
			Skirt.rotationPointZ-=1.65f;
			Skirt.rotateAngleX = convertDegtoRad(-20F);
		}

	}
	private void setRotation(MMM_ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX=x;
		model.rotateAngleY=y;
		model.rotateAngleZ=z;
	}
	private void setRotationDeg(MMM_ModelRenderer model, float x, float y, float z)
  	{
		model.rotateAngleX=x*(float)Math.PI/180F;
		model.rotateAngleY=y*(float)Math.PI/180F;
		model.rotateAngleZ=z*(float)Math.PI/180F;
  	}

	private void copyRotate(MMM_ModelRenderer from,MMM_ModelRenderer dist){
		dist.rotateAngleX=from.rotateAngleX;
		dist.rotateAngleY=from.rotateAngleY;
		dist.rotateAngleZ=from.rotateAngleZ;
	}

	private void setRotatePriorityYZX(MMM_ModelRenderer model){
		model.rotatePriority=model.RotXZY;
	}

	private float convertDegtoRad(float deg)
	{
		return deg/180F*(float)Math.PI;
	}

	private void shiftArray(float x,float y,float z)
	{
		int i;
		for(i=0;i<9;i++)
		{
			pastX[9-i]=pastX[8-i];
			pastY[9-i]=pastY[8-i];
			pastZ[9-i]=pastZ[8-i];
		}
		pastX[0]=x;
		pastY[0]=y;
		pastZ[0]=z;
	}
	@Override
	public void equippedHeadItemPosition()
    {
        GL11.glTranslatef(0.0F, 0.95F, 0.0F);
    }
}