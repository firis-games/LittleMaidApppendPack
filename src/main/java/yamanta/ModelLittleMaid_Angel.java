package net.minecraft.src;

import org.lwjgl.opengl.GL11;

public class ModelLittleMaid_Angel extends MMM_ModelLittleMaid_Archetype {

	public MMM_ModelRenderer eyeR;
	public MMM_ModelRenderer eyeL;
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
	public MMM_ModelRenderer Tail2;
	public MMM_ModelRenderer Tail3;
	public MMM_ModelRenderer Tail4;
	public MMM_ModelRenderer Tail5;
	public MMM_ModelRenderer Tail6;
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
	public MMM_ModelRenderer Ribon0;
	public MMM_ModelRenderer RibonLU1;
	public MMM_ModelRenderer RibonLU2;
	public MMM_ModelRenderer RibonLU3;
	public MMM_ModelRenderer RibonLU4;
	public MMM_ModelRenderer RibonRU1;
	public MMM_ModelRenderer RibonRU2;
	public MMM_ModelRenderer RibonRU3;
	public MMM_ModelRenderer RibonRU4;
	public MMM_ModelRenderer RibonLD1;
	public MMM_ModelRenderer RibonLD2;
	public MMM_ModelRenderer RibonLD3;
	public MMM_ModelRenderer RibonRD1;
	public MMM_ModelRenderer RibonRD2;
	public MMM_ModelRenderer RibonRD3;
	public MMM_ModelRenderer_EX Circle;
	public MMM_ModelRenderer_EX Glass;

	private int IdOffset=0;

	public ModelLittleMaid_Angel()
	{
		this(0.0F);
	}

	public ModelLittleMaid_Angel(float f)
	{
		this(f, 0.0F);
	}

	public ModelLittleMaid_Angel(float f, float f1)
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

		Glass = new MMM_ModelRenderer_EX(this, 24, 0,0.5F,0.5F,1.0F);
		Glass.addPlate(-8.0F, -4.0F, 0F, 16, 8, 0, psize);
		Glass.setRotationPoint(0.0F, -4.0F, -4.0F);
		bipedHead.addChild(Glass);

		Prim = new MMM_ModelRenderer(this, 4, 0);
		Prim.addPlate(-2F, -7.7F, -3.5F, 4, 1, 0, psize);
		Prim.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.addChild(Prim);

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

		SideTailL = new MMM_ModelRenderer(this, 46, 26);
		SideTailL.addBox(4.7F, -6F, 1F, 1, 1, 1,psize+0.2F);
		SideTailL.setRotationPoint(0F, 0F, 0F);
		bipedHead.addChild(SideTailL);
		SideTailL.isHidden=true;

		SideTailR = new MMM_ModelRenderer(this, 50, 26);
		SideTailR.addBox(-5.7F, -6F, 1F, 1, 1, 1,psize+0.2F);
		SideTailR.setRotationPoint(0F, 0F, 0F);
		bipedHead.addChild(SideTailR);
		SideTailR.isHidden=true;

		Tail = new MMM_ModelRenderer(this, 46, 19);
		Tail.addBox(-1F, -7F, 4.8F, 2, 2, 2,psize+0.1F);
		Tail.setRotationPoint(0F, 0F, 0F);
		bipedHead.addChild(Tail);

		Tail2 = new MMM_ModelRenderer(this, 46, 19);
		Tail2.addBox(0F, 1F, 0F, 2, 7, 2,psize);
		Tail2.setRotationPoint(-1F, -6.5F, 4.7F);
		bipedHead.addChild(Tail2);
		Tail2.isHidden=true;

		Tail3 = new MMM_ModelRenderer(this, 54, 19);
		Tail3.addBox(0F, 1F, 0F, 0, 8, 2,psize);
		Tail3.setRotationPoint(-0.5F, -6.5F, 4.7F);
		bipedHead.addChild(Tail3);
		setRotationDeg(Tail3,0F,0F,0F);

		Tail4 = new MMM_ModelRenderer(this, 54, 21);
		Tail4.addBox(0F, 1F, 0F, 2, 8, 0,psize);
		Tail4.setRotationPoint(-1.0F, -6.5F, 5.2F);
		bipedHead.addChild(Tail4);
		setRotationDeg(Tail4,0F,0F,0F);

		Tail5 = new MMM_ModelRenderer(this, 54, 19);
		Tail5.addBox(0F, 1F, 0F, 0, 8, 2,psize);
		Tail5.setRotationPoint(0.5F, -6.5F, 4.7F);
		bipedHead.addChild(Tail5);
		setRotationDeg(Tail5,0F,0F,0F);

		Tail6 = new MMM_ModelRenderer(this, 54, 21);
		Tail6.addBox(0F, 1F, 0F, 2, 8, 0,psize);
		Tail6.setRotationPoint(-1.0F, -6.5F, 6.2F);
		bipedHead.addChild(Tail6);
		setRotationDeg(Tail6,0F,0F,0F);

		Ahoge = new MMM_ModelRenderer(this, 0, 1);
		Ahoge.addBox(0F, 0F, 0F, 0, 3, 4,psize);
		Ahoge.setRotationPoint(0F, -7F, -4F);
		bipedHead.addChild(Ahoge);

		Skirt1 = new MMM_ModelRenderer_EX(this, 0, 37,0.25F, 0.33F, 1.0F);
		Skirt1.addPlate(-1.6F, -9F, 0F, 22, 9, 0,psize);
		Skirt1.setRotationPoint(0F,2.5F-pyoffset-0.5F,0F);
		Skirt.addChild(Skirt1);
		setRotatePriorityYZX(Skirt1);

		Skirt2 = new MMM_ModelRenderer_EX(this, 0, 16,0.25F, 0.33F, 1.0F);
		Skirt2.addPlate(-1.6F, 0F, 0F, 22, 9, 0,psize);
		Skirt2.setRotationPoint(0F,2.5F-pyoffset-0.5F,0F);
		Skirt.addChild(Skirt2);
		setRotatePriorityYZX(Skirt2);

		Skirt3 = new MMM_ModelRenderer_EX(this, 0, 37,0.25F, 0.33F, 1.0F);
		Skirt3.addPlate(0F, -9F, 0F, 22, 9, 0,psize);
		Skirt3.setRotationPoint(0F,2F-pyoffset-0.5F,0F);
		Skirt.addChild(Skirt3);
		setRotatePriorityYZX(Skirt3);

		Skirt4 = new MMM_ModelRenderer_EX(this, 0, 16,0.25F, 0.33F, 1.0F);
		Skirt4.addPlate(0F, 0F, 0F, 22, 9, 0,psize);
		Skirt4.setRotationPoint(0F,2F-pyoffset-0.5F,0F);
		Skirt.addChild(Skirt4);
		setRotatePriorityYZX(Skirt4);

		Skirt5 = new MMM_ModelRenderer_EX(this, 0, 37,0.25F, 0.33F, 1.0F);
		Skirt5.addPlate(0F, -9F, 0F, 22, 9, 0,psize);
		Skirt5.setRotationPoint(0F,2F-pyoffset-0.5F,0F);
		Skirt.addChild(Skirt5);
		setRotatePriorityYZX(Skirt5);

		Skirt6 = new MMM_ModelRenderer_EX(this, 0, 16,0.25F, 0.33F, 1.0F);
		Skirt6.addPlate(0F, 0F, 0F, 22, 9, 0,psize);
		Skirt6.setRotationPoint(0F,2F-pyoffset-0.5F,0F);
		Skirt.addChild(Skirt6);
		setRotatePriorityYZX(Skirt6);

		Skirt7 = new MMM_ModelRenderer_EX(this, 0, 37,0.25F, 0.33F, 1.0F);
		Skirt7.addPlate(-1.6F, -9F, 0F, 22, 9, 0,psize);
		Skirt7.setRotationPoint(0F,2.5F-pyoffset-0.5F,0F);
		Skirt.addChild(Skirt7);
		setRotatePriorityYZX(Skirt7);

		Skirt8 = new MMM_ModelRenderer_EX(this, 0, 16,0.25F, 0.33F, 1.0F);
		Skirt8.addPlate(-1.6F, 0F, 0F, 22, 9, 0,psize);
		Skirt8.setRotationPoint(0F,2.5F-pyoffset-0.5F,0F);
		Skirt.addChild(Skirt8);
		setRotatePriorityYZX(Skirt8);

		Skirt9 = new MMM_ModelRenderer_EX(this, 0, 37,0.25F, 0.33F, 1.0F);
		Skirt9.addPlate(-1.6F, -9F, 0F, 22, 9, 0,psize);
		Skirt9.setRotationPoint(0F,2.5F-pyoffset-0.5F,0F);
		Skirt.addChild(Skirt9);
		setRotatePriorityYZX(Skirt9);

		Skirt10 = new MMM_ModelRenderer_EX(this, 0, 16,0.25F, 0.33F, 1.0F);
		Skirt10.addPlate(-1.6F, 0F, 0F, 22, 9, 0,psize);
		Skirt10.setRotationPoint(0F,2.5F-pyoffset-0.5F,0F);
		Skirt.addChild(Skirt10);
		setRotatePriorityYZX(Skirt10);

		Skirt11 = new MMM_ModelRenderer_EX(this, 0, 34,0.25F, 0.33F, 1.0F);
		Skirt11.addPlate(0F, -9F, 0F, 22, 9, 0,psize);
		Skirt11.setRotationPoint(0F,2F-pyoffset-0.5F,0F);
		Skirt.addChild(Skirt11);
		setRotatePriorityYZX(Skirt11);

		Skirt12 = new MMM_ModelRenderer_EX(this, 0, 16,0.25F, 0.33F, 1.0F);
		Skirt12.addPlate(0F, 0F, 0F, 22, 9, 0,psize);
		Skirt12.setRotationPoint(0F,2F-pyoffset-0.5F,0F);
		Skirt.addChild(Skirt12);
		setRotatePriorityYZX(Skirt12);

		Skirt13 = new MMM_ModelRenderer_EX(this, 0, 34,0.25F, 0.33F, 1.0F);
		Skirt13.addPlate(0F, -9F, 0F, 22, 9, 0,psize);
		Skirt13.setRotationPoint(0F,2F-pyoffset-0.5F,0F);
		Skirt.addChild(Skirt13);
		setRotatePriorityYZX(Skirt13);

		Skirt14 = new MMM_ModelRenderer_EX(this, 0, 16,0.25F, 0.33F, 1.0F);
		Skirt14.addPlate(0F, 0F, 0F, 22, 9, 0,psize);
		Skirt14.setRotationPoint(0F,2F-pyoffset-0.5F,0F);
		Skirt.addChild(Skirt14);
		setRotatePriorityYZX(Skirt14);

		Skirt15 = new MMM_ModelRenderer_EX(this, 0, 37,0.25F, 0.33F, 1.0F);
		Skirt15.addPlate(-1.6F, -9F, 0F, 22, 9, 0,psize);
		Skirt15.setRotationPoint(0F,2.5F-pyoffset-0.5F,0F);
		Skirt.addChild(Skirt15);
		setRotatePriorityYZX(Skirt15);

		Skirt16 = new MMM_ModelRenderer_EX(this, 0, 16,0.25F, 0.33F, 1.0F);
		Skirt16.addPlate(-1.6F, 0F, 0F, 22, 9, 0,psize);
		Skirt16.setRotationPoint(0F,2.5F-pyoffset-0.5F,0F);
		Skirt.addChild(Skirt16);
		setRotatePriorityYZX(Skirt16);

		Skirt21 = new MMM_ModelRenderer_EX(this, 0, 46,0.25F, 0.25F, 1.0F);
		Skirt21.addPlate(-1.6F+22F, -12F, 0F, 22, 12, 0,psize);
		Skirt21.setRotationPoint(0F,2.5F-pyoffset-0.5F,0F);
		Skirt.addChild(Skirt21);
		setRotatePriorityYZX(Skirt21);

		Skirt22 = new MMM_ModelRenderer_EX(this, 0, 25,0.25F, 0.25F, 1.0F);
		Skirt22.addPlate(-1.6F+22F, 0F, 0F, 22, 12, 0,psize);
		Skirt22.setRotationPoint(0F,2.5F-pyoffset-0.5F,0F);
		Skirt.addChild(Skirt22);
		setRotatePriorityYZX(Skirt22);

		Skirt23 = new MMM_ModelRenderer_EX(this, 0, 46,0.25F, 0.25F, 1.0F);
		Skirt23.addPlate(0F+22F, -12F, 0F, 22, 12, 0,psize);
		Skirt23.setRotationPoint(0F,2F-pyoffset-0.5F,0F);
		Skirt.addChild(Skirt23);
		setRotatePriorityYZX(Skirt23);

		Skirt24 = new MMM_ModelRenderer_EX(this, 0, 25,0.25F, 0.25F, 1.0F);
		Skirt24.addPlate(0F+22F, 0F, 0F, 22, 12, 0,psize);
		Skirt24.setRotationPoint(0F,2F-pyoffset-0.5F,0F);
		Skirt.addChild(Skirt24);
		setRotatePriorityYZX(Skirt24);

		Skirt25 = new MMM_ModelRenderer_EX(this, 0, 46,0.25F, 0.25F, 1.0F);
		Skirt25.addPlate(0F+22F, -12F, 0F, 22, 12, 0,psize);
		Skirt25.setRotationPoint(0F,2F-pyoffset-0.5F,0F);
		Skirt.addChild(Skirt25);
		setRotatePriorityYZX(Skirt25);

		Skirt26 = new MMM_ModelRenderer_EX(this, 0, 25,0.25F, 0.25F, 1.0F);
		Skirt26.addPlate(0F+22F, 0F, 0F, 22, 12, 0,psize);
		Skirt26.setRotationPoint(0F,2F-pyoffset-0.5F,0F);
		Skirt.addChild(Skirt26);
		setRotatePriorityYZX(Skirt26);

		Skirt27 = new MMM_ModelRenderer_EX(this, 0, 46,0.25F, 0.25F, 1.0F);
		Skirt27.addPlate(-1.6F+22F, -12F, 0F, 22, 12, 0,psize);
		Skirt27.setRotationPoint(0F,2.5F-pyoffset-0.5F,0F);
		Skirt.addChild(Skirt27);
		setRotatePriorityYZX(Skirt27);

		Skirt28 = new MMM_ModelRenderer_EX(this, 0, 25,0.25F, 0.25F, 1.0F);
		Skirt28.addPlate(-1.6F+22F, 0F, 0F, 22, 12, 0,psize);
		Skirt28.setRotationPoint(0F,2.5F-pyoffset-0.5F,0F);
		Skirt.addChild(Skirt28);
		setRotatePriorityYZX(Skirt28);

		Skirt29 = new MMM_ModelRenderer_EX(this, 0, 46,0.25F, 0.25F, 1.0F);
		Skirt29.addPlate(-1.6F+22F, -12F, 0F, 22, 12, 0,psize);
		Skirt29.setRotationPoint(0F,2.5F-pyoffset-0.5F,0F);
		Skirt.addChild(Skirt29);
		setRotatePriorityYZX(Skirt29);

		Skirt210 = new MMM_ModelRenderer_EX(this, 0, 25,0.25F, 0.25F, 1.0F);
		Skirt210.addPlate(-1.6F+22F, 0F, 0F, 22, 12, 0,psize);
		Skirt210.setRotationPoint(0F,2.5F-pyoffset-0.5F,0F);
		Skirt.addChild(Skirt210);
		setRotatePriorityYZX(Skirt210);

		Skirt211 = new MMM_ModelRenderer_EX(this, 0, 46,0.25F, 0.25F, 1.0F);
		Skirt211.addPlate(0F+22F, -12F, 0F, 22, 12, 0,psize);
		Skirt211.setRotationPoint(0F,2F-pyoffset-0.5F,0F);
		Skirt.addChild(Skirt211);
		setRotatePriorityYZX(Skirt211);

		Skirt212 = new MMM_ModelRenderer_EX(this, 0, 25,0.25F, 0.25F, 1.0F);
		Skirt212.addPlate(0F+22F, 0F, 0F, 22, 12, 0,psize);
		Skirt212.setRotationPoint(0F,2F-pyoffset-0.5F,0F);
		Skirt.addChild(Skirt212);
		setRotatePriorityYZX(Skirt212);

		Skirt213 = new MMM_ModelRenderer_EX(this, 0, 46,0.25F, 0.25F, 1.0F);
		Skirt213.addPlate(0F+22F, -12F, 0F, 22, 12, 0,psize);
		Skirt213.setRotationPoint(0F,2F-pyoffset-0.5F,0F);
		Skirt.addChild(Skirt213);
		setRotatePriorityYZX(Skirt213);

		Skirt214 = new MMM_ModelRenderer_EX(this, 0, 25,0.25F, 0.25F, 1.0F);
		Skirt214.addPlate(0F+22F, 0F, 0F, 22, 12, 0,psize);
		Skirt214.setRotationPoint(0F,2F-pyoffset-0.5F,0F);
		Skirt.addChild(Skirt214);
		setRotatePriorityYZX(Skirt214);

		Skirt215 = new MMM_ModelRenderer_EX(this, 0, 46,0.25F, 0.25F, 1.0F);
		Skirt215.addPlate(-1.6F+22F, -12F, 0F, 22, 12, 0,psize);
		Skirt215.setRotationPoint(0F,2.5F-pyoffset-0.5F,0F);
		Skirt.addChild(Skirt215);
		setRotatePriorityYZX(Skirt215);

		Skirt216 = new MMM_ModelRenderer_EX(this, 0, 25,0.25F, 0.25F, 1.0F);
		Skirt216.addPlate(-1.6F+22F, 0F, 0F, 22, 12, 0,psize);
		Skirt216.setRotationPoint(0F,2.5F-pyoffset-0.5F,0F);
		Skirt.addChild(Skirt216);
		setRotatePriorityYZX(Skirt216);

		Ribon0 = new MMM_ModelRenderer(this, 24, 16);
		Ribon0.addBox(-1F, -1F, 0F, 2, 2, 2,psize-0.3F);
		Ribon0.setRotationPoint(0F, 3.8F, 1.5F);
		setRotationDeg(Ribon0, 25F, 0F, 0F);
		bipedBody.addChild(Ribon0);
		setRotatePriorityYZX(Ribon0);

		RibonLU1 = new MMM_ModelRenderer(this, 1, 58);
		RibonLU1.addBox(0F, -0.5F, -0.5F, 5, 1, 1);
		RibonLU1.setRotationPoint(0.5F,0.2F,1F);
		setRotation(RibonLU1, 0.7853982F, 0F, -0.4886922F);
		RibonLU1.isHidden=true;
		setRotatePriorityYZX(RibonLU1);

		RibonLU2 = new MMM_ModelRenderer(this, 1, 58);
		RibonLU2.addBox(-0.5F, -0.5F, -0.5F, 5, 1, 1);
		RibonLU2.setRotationPoint(0.5F, 4F, 2.5F);
		setRotation(RibonLU2, 0.7853982F, 0F, -0.1745329F);
		bipedBody.addChild(RibonLU2);
		setRotatePriorityYZX(RibonLU2);

		RibonLU3 = new MMM_ModelRenderer(this, 2, 58);
		RibonLU3.addBox(0F, -0.5F, -0.5F, 4, 1, 1);
		RibonLU3.setRotationPoint(0.5F, 4F, 2.5F);
		setRotation(RibonLU3, 0.7853982F, 0F, 0.1745329F);
		bipedBody.addChild(RibonLU3);
		setRotatePriorityYZX(RibonLU3);

		RibonLU4 = new MMM_ModelRenderer(this, 2, 58);
		RibonLU4.addBox(-0.5F, -0.5F, -0.5F, 4, 1, 1);
		RibonLU4.setRotationPoint(0.0F, 3.5F, 2.0F);
		setRotation(RibonLU4, 0.7853982F, 0F, 0.5759587F);
		bipedBody.addChild(RibonLU4);
		setRotatePriorityYZX(RibonLU4);

		RibonRU1 = new MMM_ModelRenderer(this, 1, 58);
		RibonRU1.addBox(0F, -0.5F, -0.5F, 5, 1, 1);
		RibonRU1.setRotationPoint(-0.5F, 0.2F, 1F);
		setRotation(RibonRU1, -2.356194F, 3.141593F, -0.4886922F);
		Ribon0.addChild(RibonRU1);
		setRotatePriorityYZX(RibonRU1);
		RibonRU1.isHidden=true;

		RibonRU2 = new MMM_ModelRenderer(this, 1, 58);
		RibonRU2.addBox(-0.5F, -0.5F, -0.5F, 5, 1, 1);
		RibonRU2.setRotationPoint(-0.5F, 0.2F, 1F);
		setRotation(RibonRU2, -2.356194F, 3.141593F, -0.1745329F);
		Ribon0.addChild(RibonRU2);
		setRotatePriorityYZX(RibonRU2);


		RibonRU3 = new MMM_ModelRenderer(this, 2, 58);
		RibonRU3.addBox(0F, -0.5F, -0.5F, 4, 1, 1);
		RibonRU3.setRotationPoint(-0.5F, 0.2F, 1F);
		setRotation(RibonRU3, -2.356194F, 3.141593F, 0.1745329F);
		Ribon0.addChild(RibonRU3);
		setRotatePriorityYZX(RibonRU3);


		RibonRU4 = new MMM_ModelRenderer(this, 2, 58);
		RibonRU4.addBox(-0.5F, -0.5F, -0.5F, 4, 1, 1);
		RibonRU4.setRotationPoint(-0.5F, 0.2F, 1F);
		setRotation(RibonRU4, -2.356194F, 3.141593F, 0.5759587F);
		Ribon0.addChild(RibonRU4);
		setRotatePriorityYZX(RibonRU4);


		RibonLD1 = new MMM_ModelRenderer(this, 1, 58);
		RibonLD1.addBox(0F, -0.5F, -0.5F, 5, 1, 1);
		RibonLD1.setRotationPoint(-0.5F, -0.3F, 1F);
		setRotationDeg(RibonLD1, -110F, -5F, 27F);
		Ribon0.addChild(RibonLD1);
		setRotatePriorityYZX(RibonLD1);


		RibonLD2 = new MMM_ModelRenderer(this, 0, 58);
		RibonLD2.addBox(0F, -0.5F, -0.5F, 6, 1, 1);
		RibonLD2.setRotationPoint(-0.5F, -0.3F, 1F);
		setRotationDeg(RibonLD2, -110F, -13F, 42F);
		Ribon0.addChild(RibonLD2);
		setRotatePriorityYZX(RibonLD2);


		RibonLD3 = new MMM_ModelRenderer(this, -1, 58);
		RibonLD3.addBox(0F, -0.5F, -0.5F, 7, 1, 1);
		RibonLD3.setRotationPoint(-0.5F,-0.3F, 1F);
		setRotationDeg(RibonLD3, -110F, -21F, 54F);
		Ribon0.addChild(RibonLD3);
		setRotatePriorityYZX(RibonLD3);


		RibonRD1 = new MMM_ModelRenderer(this, 3, 58);
		RibonRD1.addBox(0F, -0.5F, -0.5F, 5, 1, 1);
		RibonRD1.setRotationPoint(0.5F, -0.3F, 1F);
		setRotationDeg(RibonRD1, 20F, -175F, 27F);
		Ribon0.addChild(RibonRD1);
		setRotatePriorityYZX(RibonRD1);


		RibonRD2 = new MMM_ModelRenderer(this, 0, 58);
		RibonRD2.addBox(0F, -0.5F, -0.5F, 6, 1, 1);
		RibonRD2.setRotationPoint(0.5F, -0.3F, 1F);
		setRotationDeg(RibonRD2, 20F, -167F, 42F);
		Ribon0.addChild(RibonRD2);
		setRotatePriorityYZX(RibonRD2);


		RibonRD3 = new MMM_ModelRenderer(this, -1, 58);
		RibonRD3.addBox(0F, -0.5F, -0.5F, 7, 1, 1);
		RibonRD3.setRotationPoint(0.5F, -0.3F, 1F);
		setRotationDeg(RibonRD3, 20F, -159F, 54F);
		Ribon0.addChild(RibonRD3);
		setRotatePriorityYZX(RibonRD3);

		Circle = new MMM_ModelRenderer_EX(this, 22, 32, 0.35F, 0.35F, 0.35F);
		Circle.addPlate(-8F, -8F, 0F, 16, 16, 0);
		Circle.setRotationPoint(0F, -12F, 0F);
		setRotationDeg(Circle, -90F, 1F, 1F);
		bipedHead.addChild(Circle);
		setRotatePriorityYZX(Circle);



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
		setRotationDeg(Skirt21, -118F, 113F, 47F);
		setRotationDeg(Skirt22, -65F, 113F, 47F);
		setRotationDeg(Skirt23, -122F, 158F, 47F);
		setRotationDeg(Skirt24, -67F, 158F, 47F);
		setRotationDeg(Skirt25, -113F, -159F, 47F);
		setRotationDeg(Skirt26, -58F, -159F, 47F);
		setRotationDeg(Skirt27, -114F, -114F, 47F);
		setRotationDeg(Skirt28, -65F, -114F, 47F);
		setRotationDeg(Skirt29, -115F, -68F, 47F);
		setRotationDeg(Skirt210, -65F, -68F, 47F);
		setRotationDeg(Skirt211, -122F, -23F, 47F);
		setRotationDeg(Skirt212, -66F, -23F, 47F);
		setRotationDeg(Skirt213, -114F, 22F, 47F);
		setRotationDeg(Skirt214, -58F, 22F, 47F);
		setRotationDeg(Skirt215, -115F, 67F, 47F);
		setRotationDeg(Skirt216, -62F, 67F, 47F);
	}

	private void initBasicParts(float psize, float pyoffset){

 //       bipedCloak = new ModelRenderer(this, 0, 0);
  //      bipedCloak.showModel = false;
  //      bipedEars = new ModelRenderer(this, 0, 16);
  //      bipedEars.showModel = false;

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

	//	float t;
	//	if(isRiding && this.ridingEntity!=null)
	//		t=entityliving.ridingEntity.ticksExisted;
	//	else
	//		t=f2;
	//	float f3 = (float)this.entityTicksExisted + t + this.entityIdFactor;
		float f3 = (float)this.entityTicksExisted  + this.entityIdFactor;

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

		float t;
		if(isRiding)
			t=this.entityTicksExisted;
		else
			t=var3;

		WingLOrigin.rotateAngleX=0F;
		WingROrigin.rotateAngleX=0F;
		WingLOrigin.rotateAngleY=MathHelper.cos(t * 0.5F+IdOffset) * 0.2F - 0.3F;
		WingROrigin.rotateAngleY=MathHelper.cos(t * 0.5F + (float)Math.PI+IdOffset) * 0.2F + 0.3F;
		Ahoge.rotateAngleY=MathHelper.cos(t * 0.2F + MathHelper.cos(t*0.05F+IdOffset) * 1.0F) * 0.2F;
		Ahoge.rotateAngleX=2.9F;

		Tail2.rotateAngleX=-bipedHead.rotateAngleX;
		Tail3.rotateAngleX=-bipedHead.rotateAngleX;
		Tail4.rotateAngleX=-bipedHead.rotateAngleX;
		Tail5.rotateAngleX=-bipedHead.rotateAngleX;
		Tail6.rotateAngleX=-bipedHead.rotateAngleX;

		Skirt.rotateAngleX = 0f;
		Skirt.rotationPointZ=0f;

		if (aimedBow) {
			eyeL.showModel = true;
			WingLOrigin.rotateAngleY= -0.65F;
			WingROrigin.rotateAngleY= 0.65F;
		}

		if(isSneak){
			WingLOrigin.rotateAngleX+=bipedBody.rotateAngleX;
			WingROrigin.rotateAngleX+=bipedBody.rotateAngleX;
		}

		if(isRiding){
			Skirt.rotationPointZ-=0.8f;
			Skirt.rotateAngleX = convertDegtoRad(-25F);
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

	private void setRotatePriorityYZX(MMM_ModelRenderer model){
		model.rotatePriority=model.RotXZY;
	}

	private float convertDegtoRad(float deg)
	{
		return deg/180F*(float)Math.PI;
	}

	@Override
	 public float getHeight()
	 {
		 return 1.35F;
	 }
	@Override
	 public float getWidth()
	 {
		 return 0.5F;
	 }
	@Override
	public void equippedHeadItemPosition()
    {
        GL11.glTranslatef(0.0F, 0.95F, 0.0F);
    }
}
