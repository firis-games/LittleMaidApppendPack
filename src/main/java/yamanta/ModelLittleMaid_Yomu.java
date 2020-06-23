package net.minecraft.src;

import org.lwjgl.opengl.GL11;
import java.util.*;


public class ModelLittleMaid_Yomu extends MMM_ModelLittleMaid_Archetype {

	public MMM_ModelRenderer eyeR;
	public MMM_ModelRenderer eyeL;
    public MMM_ModelRenderer Prim;
	public MMM_ModelRenderer Tail2;
	public MMM_ModelRenderer Skirt1;
	public MMM_ModelRenderer Skirt2;
	public MMM_ModelRenderer Skirt3;
	public MMM_ModelRenderer Skirt4;
	public MMM_ModelRenderer Skirt5;
	public MMM_ModelRenderer Skirt6;
	public MMM_ModelRenderer Skirt7;
	public MMM_ModelRenderer Skirt8;
	public MMM_ModelRenderer Skirt9;
	public MMM_ModelRenderer Skirt10;
	public MMM_ModelRenderer Skirt11;
	public MMM_ModelRenderer Skirt12;
	public MMM_ModelRenderer Skirt13;
	public MMM_ModelRenderer Skirt14;
	public MMM_ModelRenderer Skirt15;
	public MMM_ModelRenderer Skirt16;
	public MMM_ModelRenderer HipR;
	public MMM_ModelRenderer HipL;
	public MMM_ModelRenderer_EX Headband1;
	public MMM_ModelRenderer_EX Headband2;
	public MMM_ModelRenderer_EX Headband3;
	public MMM_ModelRenderer_EX Headband4;
	public MMM_ModelRenderer Ribon1;
	public MMM_ModelRenderer Ribon2;
	public MMM_ModelRenderer Ribon3;
	public MMM_ModelRenderer Neck;
	public MMM_ModelRenderer_EX Ribon4;
	public MMM_ModelRenderer_EX Ribon5;
	public MMM_ModelRenderer_EX Ribon6;
	public MMM_ModelRenderer_EX Collar1;
	public MMM_ModelRenderer_EX Collar2;
	public MMM_ModelRenderer_EX Collar3;
	public MMM_ModelRenderer_EX Collar4;
	public MMM_ModelRenderer_EX Collar5;
	public MMM_ModelRenderer_EX Collar6;
	public MMM_ModelRenderer_EX Collar7;
	public MMM_ModelRenderer Best1;
	public MMM_ModelRenderer Best2;
	public MMM_ModelRenderer_EX Patch;
	public MMM_ModelRenderer_EX Hear;
	public MMM_ModelRenderer BradeC;
	public MMM_ModelRenderer Brade1;
	public MMM_ModelRenderer Brade2;
	public MMM_ModelRenderer Brade3;
	public MMM_ModelRenderer Brade4;
	public MMM_ModelRenderer Tuka1;
	public MMM_ModelRenderer Tuka2;
	public MMM_ModelRenderer Tuka3;
	public MMM_ModelRenderer Tuka4;
	public MMM_ModelRenderer Tuka5;
	public MMM_ModelRenderer Tuka6;
	public MMM_ModelRenderer_EX HanreiC;
//	public MMM_ModelRenderer_EX Hanrei1;
//	public MMM_ModelRenderer_EX Hanrei2;
//	public MMM_ModelRenderer_EX Hanrei3;
	public MMM_ModelRenderer_EX Hanrei4;
	public MMM_ModelRenderer_EX Hanrei5;
//	public MMM_ModelRenderer_EX Hanrei6;

	// armor only
	public MMM_ModelRenderer_EX PlateR1;
	public MMM_ModelRenderer_EX PlateR2;
	public MMM_ModelRenderer_EX PlateR3;
	public MMM_ModelRenderer_EX PlateR4;
	public MMM_ModelRenderer_EX PlateR5;
	public MMM_ModelRenderer_EX PlateR6;
	public MMM_ModelRenderer_EX PlateL1;
	public MMM_ModelRenderer_EX PlateL2;
	public MMM_ModelRenderer_EX PlateL3;
	public MMM_ModelRenderer_EX PlateL4;
	public MMM_ModelRenderer_EX PlateL5;
	public MMM_ModelRenderer_EX PlateL6;
	public MMM_ModelRenderer_EX Glass;



	private float x1;
	private float y1;
	private float z1;
	private float IdOffset;
	private List IdList;
	private List AngleYList;
	private List YawOffsetList;
	private List positionList;
	private List childPositionList;
	private float AY;
	private float prevAY;

	private float[] pastX=new float[10];
	private float[] pastY=new float[10];
	private float[] pastZ=new float[10];

	public ModelLittleMaid_Yomu()
	{
		this(0.0F);
	}

	public ModelLittleMaid_Yomu(float f)
	{
		this(f, 0.0F);
	}

	public ModelLittleMaid_Yomu(float f, float f1)
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

		IdList=new ArrayList();
		AngleYList= new ArrayList();
		YawOffsetList= new ArrayList();
		positionList=new ArrayList();
		childPositionList=new ArrayList();

		Neck = new MMM_ModelRenderer(this,16 ,5);
		Neck.addBox(-1.0F, -1.0F, 1.0F, 2, 1, 2, psize);
		Neck.setRotationPoint(0.0F,0.0F,-2.0F);
		bipedBody.addChild(Neck);

		Skirt1 = new MMM_ModelRenderer_EX(this, 0, 33,0.5F,0.5F,1F);
		Skirt1.addPlate(-0.8F, -6F, 0F, 20, 6, 0,psize);
	//	Skirt1.setRotationPointLM(0F, 0F+pyoffset, 0F);
		Skirt1.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(Skirt1);

		Skirt2 = new MMM_ModelRenderer_EX(this, 0, 27,0.5F,0.5F,1F);
		Skirt2.addPlate(-0.8F, 0F, 0F, 20, 6, 0,psize);
		Skirt2.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(Skirt2);

		Skirt3 = new MMM_ModelRenderer_EX(this, 0, 33,0.5F,0.5F,1F);
		Skirt3.addPlate(0F, -6F, 0F, 20, 6, 0,psize);
		Skirt3.setRotationPoint(0F,2F-pyoffset,0F);
		Skirt.addChild(Skirt3);

		Skirt4 = new MMM_ModelRenderer_EX(this, 0, 27,0.5F,0.5F,1F);
		Skirt4.addPlate(0F, 0F, 0F, 20, 6, 0,psize);
		Skirt4.setRotationPoint(0F,2F-pyoffset,0F);
		Skirt.addChild(Skirt4);

		Skirt5 = new MMM_ModelRenderer_EX(this, 0, 33,0.5F,0.5F,1F);
		Skirt5.addPlate(0F, -6F, 0F, 20, 6, 0,psize);
		Skirt5.setRotationPoint(0F,2F-pyoffset,0F);
		Skirt.addChild(Skirt5);

		Skirt6 = new MMM_ModelRenderer_EX(this, 0, 27,0.5F,0.5F,1F);
		Skirt6.addPlate(0F, 0F, 0F, 20, 6, 0,psize);
		Skirt6.setRotationPoint(0F,2F-pyoffset,0F);
		Skirt.addChild(Skirt6);

		Skirt7 = new MMM_ModelRenderer_EX(this, 0, 33,0.5F,0.5F,1F);
		Skirt7.addPlate(-0.8F, -6F, 0F, 20, 6, 0,psize);
		Skirt7.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(Skirt7);

		Skirt8 = new MMM_ModelRenderer_EX(this, 0, 27,0.5F,0.5F,1F);
		Skirt8.addPlate(-0.8F, 0F, 0F, 20, 6, 0,psize);
		Skirt8.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(Skirt8);

		Skirt9 = new MMM_ModelRenderer_EX(this, 0, 33,0.5F,0.5F,1F);
		Skirt9.addPlate(-0.8F, -6F, 0F, 20, 6, 0,psize);
		Skirt9.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(Skirt9);

		Skirt10 = new MMM_ModelRenderer_EX(this, 0, 27,0.5F,0.5F,1F);
		Skirt10.addPlate(-0.8F, 0F, 0F, 20, 6, 0,psize);
		Skirt10.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(Skirt10);

		Skirt11 = new MMM_ModelRenderer_EX(this, 0, 33,0.5F,0.5F,1F);
		Skirt11.addPlate(0F, -6F, 0F, 20, 6, 0,psize);
		Skirt11.setRotationPoint(0F,2F-pyoffset,0F);
		Skirt.addChild(Skirt11);

		Skirt12 = new MMM_ModelRenderer_EX(this, 0, 27,0.5F,0.5F,1F);
		Skirt12.addPlate(0F, 0F, 0F, 20, 6, 0,psize);
		Skirt12.setRotationPoint(0F,2F-pyoffset,0F);
		Skirt.addChild(Skirt12);

		Skirt13 = new MMM_ModelRenderer_EX(this, 0, 33,0.5F,0.5F,1F);
		Skirt13.addPlate(0F, -6F, 0F, 20, 6, 0,psize);
		Skirt13.setRotationPoint(0F,2F-pyoffset,0F);
		Skirt.addChild(Skirt13);

		Skirt14 = new MMM_ModelRenderer_EX(this, 0, 27,0.5F,0.5F,1F);
		Skirt14.addPlate(0F, 0F, 0F, 20, 6, 0,psize);
		Skirt14.setRotationPoint(0F,2F-pyoffset,0F);
		Skirt.addChild(Skirt14);

		Skirt15 = new MMM_ModelRenderer_EX(this, 0, 33,0.5F,0.5F,1F);
		Skirt15.addPlate(-0.8F, -6F, 0F, 20, 6, 0,psize);
		Skirt15.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(Skirt15);

		Skirt16 = new MMM_ModelRenderer_EX(this, 0, 27,0.5F,0.5F,1F);
		Skirt16.addPlate(-0.8F, 0F, 0F, 20, 6, 0,psize);
		Skirt16.setRotationPoint(0F,2.5F-pyoffset,0F);
		Skirt.addChild(Skirt16);

		setRotationDeg(Skirt1, -118F, 113F, 42F);
      	setRotationDeg(Skirt2, -65F, 113F, 42F);
      	setRotationDeg(Skirt3, -122F, 158F, 42F);
      	setRotationDeg(Skirt4, -67F, 158F, 42F);
      	setRotationDeg(Skirt5, -113F, -159F, 42F);
      	setRotationDeg(Skirt6, -58F, -159F, 42F);
      	setRotationDeg(Skirt7, -114F, -114F, 42F);
      	setRotationDeg(Skirt8, -65F, -114F, 42F);
      	setRotationDeg(Skirt9, -115F, -68F, 42F);
      	setRotationDeg(Skirt10, -65F, -68F, 42F);
      	setRotationDeg(Skirt11, -122F, -23F, 42F);
      	setRotationDeg(Skirt12, -66F, -23F, 42F);
      	setRotationDeg(Skirt13, -114F, 22F, 42F);
      	setRotationDeg(Skirt14, -58F, 22F, 42F);
      	setRotationDeg(Skirt15, -115F, 67F, 42F);
      	setRotationDeg(Skirt16, -62F, 67F, 42F);

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


		Collar1 = new MMM_ModelRenderer_EX(this,0 ,16,0.7F,0.7F,0.7F);
		Collar1.addPlate(0.0F, 0F, 0F, 3, 1, 0, psize);
		Collar1.setRotationPoint(0.0F,1.0F,-2.2F);
		bipedBody.addChild(Collar1);
		setRotationDeg(Collar1,10F,-172F,-45F);
		setRotatePriorityYZX(Collar1);

		Collar2 = new MMM_ModelRenderer_EX(this,0 ,16,0.6F,0.6F,0.6F);
		Collar2.addPlate(0.0F, 0F, 0F, 3, 1, 0, psize);
		Collar2.setRotationPoint(0.0F,1.0F,-2.2F);
		bipedBody.addChild(Collar2);
		setRotationDeg(Collar2,-76F,-170F,-44F);
		setRotatePriorityYZX(Collar2);

		Collar3 = new MMM_ModelRenderer_EX(this,0 ,16,0.7F,0.7F,0.7F);
		Collar3.addPlate(0.0F, 0F, 0F, 3, 1, 0, psize);
		Collar3.setRotationPoint(0.0F,1.0F,-2.2F);
		bipedBody.addChild(Collar3);
		setRotationDeg(Collar3,-10F,-8F,-45F);
		setRotatePriorityYZX(Collar3);

		Collar4 = new MMM_ModelRenderer_EX(this,0 ,16,0.6F,0.6F,0.6F);
		Collar4.addPlate(0.0F, 0F, 0F, 3, 1, 0, psize);
		Collar4.setRotationPoint(0.0F,1.0F,-2.2F);
		bipedBody.addChild(Collar4);
		setRotationDeg(Collar4,76F,-10F,-44F);
		setRotatePriorityYZX(Collar4);

		Collar5 = new MMM_ModelRenderer_EX(this,0 ,16,0.9F,0.9F,0.9F);
		Collar5.addBox(0.0F, -0.5F, -0.5F, 4, 1, 1, psize);
		Collar5.setRotationPoint(1.5F,0.1F,-1.99F);
		bipedBody.addChild(Collar5);
		setRotationDeg(Collar5,45F,-90F,0F);
		setRotatePriorityYZX(Collar5);

		Collar6 = new MMM_ModelRenderer_EX(this,0 ,16,0.9F,0.9F,0.9F);
		Collar6.addBox(0.0F, -0.5F, -0.5F, 4, 1, 1, psize);
		Collar6.setRotationPoint(-1.5F,0.1F,-1.99F);
		bipedBody.addChild(Collar6);
		setRotationDeg(Collar6,45F,-90F,0F);
		setRotatePriorityYZX(Collar6);

		Collar7 = new MMM_ModelRenderer_EX(this,48 ,2,0.8F,0.8F,0.8F);
		Collar7.addBox(-2.0F, -0.5F, -0.5F, 4, 1, 1, psize);
		Collar7.setRotationPoint(0.0F,0.08F,1.4F);
		bipedBody.addChild(Collar7);
		setRotationDeg(Collar7,45F,0F,0F);
		setRotatePriorityYZX(Collar7);

		Best1 = new MMM_ModelRenderer(this,0 ,5);
		Best1.addPlate(0.0F, 0.0F, 0.0F, 3, 1, 0, psize);
		Best1.setRotationPoint(0.0F,3.0F,-2.001F);
		bipedBody.addChild(Best1);
		setRotationDeg(Best1,0F,0F,-61F);
		setRotatePriorityYZX(Best1);

		Best2 = new MMM_ModelRenderer(this,0 ,5);
		Best2.addPlate(0.0F, 0.0F, 0.0F, 3, 1, 0, psize);
		Best2.setRotationPoint(0.0F,3.0F,-2.001F);
		bipedBody.addChild(Best2);
		setRotationDeg(Best2,0F,-180F,-61F);
		setRotatePriorityYZX(Best2);

		Patch = new MMM_ModelRenderer_EX(this,0 ,39,0.1F,0.1F,0.1F);
		Patch.addPlate(0.0F, 0.0F, 0.0F, 20, 20, 0, psize);
		Patch.setRotationPoint(0.8F,1.6F,-2.002F);
		bipedBody.addChild(Patch);
		setRotationDeg(Patch,0F,0F,0F);

		Headband1 = new MMM_ModelRenderer_EX(this,0 ,20,1.0F,0.3F,1.0F);
		Headband1.addBox(0.0F, 0.0F, 0.0F, 5, 1, 2, psize);
		Headband1.setRotationPoint(-0.3F,-7.7F,-2.5F);
		bipedHead.addChild(Headband1);
		setRotationDeg(Headband1,0F,0F,0F);

		Headband2 = new MMM_ModelRenderer_EX(this,0 ,20,1.0F,0.3F,1.0F);
		Headband2.addBox(-5.0F, 0.0F, 0.0F, 5, 1, 2, psize);
		Headband2.setRotationPoint(0.3F,-7.701F,-2.5F);
		bipedHead.addChild(Headband2);
		setRotationDeg(Headband2,0F,0F,0F);

		Headband3 = new MMM_ModelRenderer_EX(this,0 ,20,1.0F,0.3F,1.0F);
		Headband3.addBox(0.0F, -1.0F, 0.0F, 5, 1, 2, psize);
		Headband3.setRotationPoint(-4.699F,-7.701F,-2.5F);
		bipedHead.addChild(Headband3);
		setRotationDeg(Headband3,0F,0F,90F);

		Headband4 = new MMM_ModelRenderer_EX(this,0 ,20,1.0F,0.3F,1.0F);
		Headband4.addBox(0.0F, 0.0F, 0.0F, 5, 1, 2, psize);
		Headband4.setRotationPoint(4.701F,-7.7F,-2.5F);
		bipedHead.addChild(Headband4);
		setRotationDeg(Headband4,0F,0F,90F);

		Ribon1 = new MMM_ModelRenderer(this,16 ,16);
		Ribon1.addBox(0.0F, -0.5F, -0.5F, 3, 1, 1, psize);
		Ribon1.setRotationPoint(-3.0F,-7.0F,-1.2F);
		bipedHead.addChild(Ribon1);
		setRotationDeg(Ribon1,-135F,180F,-118F);
		setRotatePriorityYZX(Ribon1);

		Ribon2 = new MMM_ModelRenderer(this,16 ,16);
		Ribon2.addBox(-0.2F, -0.5F, -0.5F, 3, 1, 1, psize);
		Ribon2.setRotationPoint(-3.0F,-7.0F,-1.2F);
		bipedHead.addChild(Ribon2);
		setRotationDeg(Ribon2,-135F,180F,-90F);
		setRotatePriorityYZX(Ribon2);

		Ribon3 = new MMM_ModelRenderer(this,16 ,16);
		Ribon3.addBox(-0.5F, -0.5F, -0.5F, 3, 1, 1, psize);
		Ribon3.setRotationPoint(-3.0F,-7.0F,-1.2F);
		bipedHead.addChild(Ribon3);
		setRotationDeg(Ribon3,-135F,180F,-59F);
		setRotatePriorityYZX(Ribon3);

		Ribon4 = new MMM_ModelRenderer_EX(this,0 ,22,0.5F,0.5F,0.5F);
		Ribon4.addBox(-1.0F, -0.5F, -0.2F, 2, 1, 1, psize);
		Ribon4.setRotationPoint(0.0F,1.7F,-2.2F);
		bipedBody.addChild(Ribon4);
		setRotationDeg(Ribon4,0F,0F,0F);
		setRotatePriorityYZX(Ribon4);

		Ribon5 = new MMM_ModelRenderer_EX(this,0 ,22,0.8F,0.8F,0.8F);
		Ribon5.addBox(0.0F, -0.5F, 0.0F, 1, 1, 1, psize);
		Ribon5.setRotationPoint(0.3F,1.9F,-2.2F);
		bipedBody.addChild(Ribon5);
		setRotationDeg(Ribon5,0F,0F,15F);
		setRotatePriorityYZX(Ribon5);

		Ribon6 = new MMM_ModelRenderer_EX(this,0 ,22,0.8F,0.8F,0.8F);
		Ribon6.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 1, psize);
		Ribon6.setRotationPoint(-0.3F,1.9F,-2.2F);
		bipedBody.addChild(Ribon6);
		setRotationDeg(Ribon6,0F,0F,-15F);
		setRotatePriorityYZX(Ribon6);

		Hear = new MMM_ModelRenderer_EX(this, 20, 32,1.1F,1.1F,1.1F);
		Hear.addBox(-4F, -3.5F, -4F, 8, 7, 8, psize);
		Hear.setRotationPoint(0.0F, -3.5F, -0.001F);
		bipedHead.addChild(Hear);

		BradeC = new MMM_ModelRenderer(this,0 ,0);
		BradeC.addBox(0F, 0F, 0.0F, 0, 0, 0, psize);
	//	BradeC.setPreRotationPointLM(3F,3.5F,-2F);
		BradeC.setRotationPoint(0.2F,-0.3F,-0.9F);
		bipedBody.addChild(BradeC);
	//	setRotationDeg(BradeC,-30F,0F,0F);
		setRotationDeg(BradeC,-20F,0F,5F);
		setRotatePriorityYZX(BradeC);

		Brade1 = new MMM_ModelRenderer(this,0 ,0);
		Brade1.addBox(-1.0F, -2.0F, 0.0F, 2, 4, 1, psize);
		Brade1.setRotationPoint(3F,3.5F,0F);
		BradeC.addChild(Brade1);
		setRotationDeg(Brade1,0F,0F,0F);
		setRotatePriorityYZX(Brade1);

		Brade2 = new MMM_ModelRenderer(this,0 ,21);
		Brade2.addBox(0.0F, -1.0F, -0.5F, 3, 2, 1, psize);
		Brade2.setRotationPoint(3F,3.5F,0F);
		BradeC.addChild(Brade2);
		setRotationDeg(Brade2,0F,90F,0F);
		setRotatePriorityYZX(Brade2);

		Brade3 = new MMM_ModelRenderer(this,0 ,20);
		Brade3.addBox(0.0F, -1.0F, -0.5F, 8, 2, 1, psize);
		Brade3.setRotationPoint(3F,3.5F,0.001F);
		BradeC.addChild(Brade3);
		setRotationDeg(Brade3,0F,-90F,0F);
		setRotatePriorityYZX(Brade3);

		Brade4 = new MMM_ModelRenderer(this,0 ,21);
		Brade4.addBox(0.0F, -1.0F, -0.5F, 4, 2, 1, psize);
		Brade4.setRotationPoint(3F,3.5F,7.89F);
		BradeC.addChild(Brade4);
		setRotationDeg(Brade4,0F,-90F,5F);
		setRotatePriorityYZX(Brade4);

		Tuka1 = new MMM_ModelRenderer(this,0 ,9);
		Tuka1.addPlate(-0.5F, -0.5F,-0.5F, 1, 1, 0, psize);
		Tuka1.setRotationPoint(3.001F,3.5F,-2.5F);
		BradeC.addChild(Tuka1);
		setRotationDeg(Tuka1,0F,-90F,-45F);
		setRotatePriorityYZX(Tuka1);

		Tuka2 = new MMM_ModelRenderer(this,0 ,9);
		Tuka2.addPlate(-0.5F, -0.5F,-0.5F, 1, 1, 0, psize);
		Tuka2.setRotationPoint(3.001F,3.5F,-1.5F);
		BradeC.addChild(Tuka2);
		setRotationDeg(Tuka2,0F,-90F,-45F);
		setRotatePriorityYZX(Tuka2);

		Tuka3 = new MMM_ModelRenderer(this,0 ,9);
		Tuka3.addPlate(-0.5F, -0.5F,-0.5F, 1, 1, 0, psize);
		Tuka3.setRotationPoint(3.001F,3.5F,-0.5F);
		BradeC.addChild(Tuka3);
		setRotationDeg(Tuka3,0F,-90F,-45F);
		setRotatePriorityYZX(Tuka3);

		Tuka4 = new MMM_ModelRenderer(this,0 ,9);
		Tuka4.addPlate(-0.5F, -0.5F,0.5F, 1, 1, 0, psize);
		Tuka4.setRotationPoint(2.999F,3.5F,-2.5F);
		BradeC.addChild(Tuka4);
		setRotationDeg(Tuka4,0F,-90F,-45F);
		setRotatePriorityYZX(Tuka4);

		Tuka5 = new MMM_ModelRenderer(this,0 ,9);
		Tuka5.addPlate(-0.5F, -0.5F,0.5F, 1, 1, 0, psize);
		Tuka5.setRotationPoint(2.999F,3.5F,-1.5F);
		BradeC.addChild(Tuka5);
		setRotationDeg(Tuka5,0F,-90F,-45F);
		setRotatePriorityYZX(Tuka5);

		Tuka6 = new MMM_ModelRenderer(this,0 ,9);
		Tuka6.addPlate(-0.5F, -0.5F,0.5F, 1, 1, 0, psize);
		Tuka6.setRotationPoint(2.999F,3.5F,-0.5F);
		BradeC.addChild(Tuka6);
		setRotationDeg(Tuka6,0F,-90F,-45F);
		setRotatePriorityYZX(Tuka6);

		HanreiC = new MMM_ModelRenderer_EX(this,0 ,0);
	//	HanreiC.addBox(6F, -2F,2F, 4, 4, 4, psize);
		HanreiC.addBall(8f, 0, 6f,4f,4f,4f);
	//	HanreiC.setScale(4f,4f,4f);
		HanreiC.setRotationPoint(0F,0F,0F);
		setRotationDeg(HanreiC,0F,0F,0F);
		mainFrame.addChild(HanreiC);
		x1=0F;
		y1=0F;
		z1=0F;
		IdOffset=0F;
		AY=0F;


/*		Hanrei1 = new MMM_ModelRenderer_EX(this,0 ,0);
	//	Hanrei1.addBox(-1F, -1F,-2F, 2, 2, 4, psize);
		Hanrei1.addBall(0f,0f,0f,6f,6f,6f);
		Hanrei1.setRotationPointLM(0F,0.0F,0F);
		setRotationDeg(Hanrei1,0F,0F,0F);
	//	bipedBody.addChild(Hanrei1);

		Hanrei2 = new MMM_ModelRenderer_EX(this,2 ,24);
		Hanrei2.addBox(-1F, -1F,-2F, 2, 2, 4, psize);
		Hanrei2.setRotationPointLM(8F,0.0F,4F);
		setRotationDeg(Hanrei2,90F,0F,0F);

		Hanrei3 = new MMM_ModelRenderer_EX(this,2 ,24);
		Hanrei3.addBox(-1F, -1F,-2F, 2, 2, 4, psize);
		Hanrei3.setRotationPointLM(8F,0.0F,4F);
		setRotationDeg(Hanrei3,0F,90F,0F);
*/
		Hanrei4 = new MMM_ModelRenderer_EX(this,0 ,0);
	//	Hanrei4.addBox(7F, -1F,3F, 2, 2, 2, psize);
		Hanrei4.addBall(8f, 0.3f, 5.0f,2f,2f,2f);
	//	Hanrei4.setScale(2f,2f,2f);
		Hanrei4.setRotationPoint(0F,0.0F,0F);//(8F,0.5F,6.5F);
		setRotationDeg(Hanrei4,0F,0F,0F);
		mainFrame.addChild(Hanrei4);
	//	HanreiC.addChild(Hanrei4);

		Hanrei5 = new MMM_ModelRenderer_EX(this,0 ,0);
	//	Hanrei5.addBox(7.5F, -0.5F,3.5F, 1, 1, 1, psize);
		Hanrei5.addBall(8f, 0.2f, 4.7f,1f,1f,1f);
	//	Hanrei5.setScale(1f,1f,1f);
		Hanrei5.setRotationPoint(0F,0F,0F);//(8F,1F,7F)
		setRotationDeg(Hanrei5,0F,0F,0F);
		mainFrame.addChild(Hanrei5);
	//	Hanrei4.addChild(Hanrei5);

		PlateR1 = new MMM_ModelRenderer_EX(this,45 ,52,0.25F,0.25F,0.25F);
		PlateR1.addPlate(-8.0F, 0.0F, 0.0F, 16, 8, 0, psize);
		PlateR1.setRotationPoint(-3.0F,4.6F-pyoffset+1.0F,0.0F);
		Skirt.addChild(PlateR1);
		setRotationDeg(PlateR1,-50F,90F,0F);
		setRotatePriorityYZX(PlateR1);

		PlateR2 = new MMM_ModelRenderer_EX(this,44 ,60,0.25F,0.25F,0.25F);
		PlateR2.addPlate(-8.0F, 0.0F, 0.0F, 8, 4, 0, psize);
		PlateR2.setRotationPoint(-3.0F,4.6F-pyoffset+1.0F,2.0F);
		Skirt.addChild(PlateR2);
		setRotationDeg(PlateR2,60F,0F,-40F);
		setRotatePriorityYZX(PlateR2);

		PlateR3 = new MMM_ModelRenderer_EX(this,44 ,60,0.25F,0.25F,0.25F);
		PlateR3.addPlate(-8.0F, 0.0F, 0.0F, 8, 4, 0, psize);
		PlateR3.setRotationPoint(-3.0F,4.6F-pyoffset+1.0F,-2.0F);
		Skirt.addChild(PlateR3);
		setRotationDeg(PlateR3,-60F,0F,-40F);
		setRotatePriorityYZX(PlateR3);

		PlateR4 = new MMM_ModelRenderer_EX(this,44 ,52,0.25F,0.25F,0.25F);
		PlateR4.addPlate(-10F, 0.0F, 0.0F, 20, 8, 0, psize);
		PlateR4.setRotationPoint(-4.5F,6.3F-pyoffset+1.0F,0.0F);
		Skirt.addChild(PlateR4);
		setRotationDeg(PlateR4,-50F,90F,0F);
		setRotatePriorityYZX(PlateR4);

		PlateR5 = new MMM_ModelRenderer_EX(this,44 ,60,0.25F,0.25F,0.25F);
		PlateR5.addPlate(-8.0F, 0.0F, 0.0F, 8, 4, 0, psize);
		PlateR5.setRotationPoint(-4.5F,6.3F-pyoffset+1.0F,2.5F);
		Skirt.addChild(PlateR5);
		setRotationDeg(PlateR5,60F,0F,-40F);
		setRotatePriorityYZX(PlateR5);

		PlateR6 = new MMM_ModelRenderer_EX(this,44 ,60,0.25F,0.25F,0.25F);
		PlateR6.addPlate(-8.0F, 0.0F, 0.0F, 8, 4, 0, psize);
		PlateR6.setRotationPoint(-4.5F,6.3F-pyoffset+1.0F,-2.5F);
		Skirt.addChild(PlateR6);
		setRotationDeg(PlateR6,-60F,0F,-40F);
		setRotatePriorityYZX(PlateR6);

		PlateL1 = new MMM_ModelRenderer_EX(this,45 ,52,0.25F,0.25F,0.25F);
		PlateL1.addPlate(-8.0F, 0.0F, 0.0F, 16, 8, 0, psize);
		PlateL1.setRotationPoint(3.0F,4.6F-pyoffset+1.0F,0.0F);
		Skirt.addChild(PlateL1);
		setRotationDeg(PlateL1,50F,90F,0F);
		setRotatePriorityYZX(PlateL1);

		PlateL2 = new MMM_ModelRenderer_EX(this,44 ,60,0.25F,0.25F,0.25F);
		PlateL2.addPlate(0.0F, 0.0F, 0.0F, 8, 4, 0, psize);
		PlateL2.setRotationPoint(3.0F,4.6F-pyoffset+1.0F,2.0F);
		Skirt.addChild(PlateL2);
		setRotationDeg(PlateL2,60F,0F,40F);
		setRotatePriorityYZX(PlateL2);

		PlateL3 = new MMM_ModelRenderer_EX(this,44 ,60,0.25F,0.25F,0.25F);
		PlateL3.addPlate(0.0F, 0.0F, 0.0F, 8, 4, 0, psize);
		PlateL3.setRotationPoint(3.0F,4.6F-pyoffset+1.0F,-2.0F);
		Skirt.addChild(PlateL3);
		setRotationDeg(PlateL3,-60F,0F,40F);
		setRotatePriorityYZX(PlateL3);

		PlateL4 = new MMM_ModelRenderer_EX(this,44 ,52,0.25F,0.25F,0.25F);
		PlateL4.addPlate(-10F, 0.0F, 0.0F, 20, 8, 0, psize);
		PlateL4.setRotationPoint(4.5F,6.3F-pyoffset+1.0F,0.0F);
		Skirt.addChild(PlateL4);
		setRotationDeg(PlateL4,50F,90F,0F);
		setRotatePriorityYZX(PlateL4);

		PlateL5 = new MMM_ModelRenderer_EX(this,44 ,60,0.25F,0.25F,0.25F);
		PlateL5.addPlate(0.0F, 0.0F, 0.0F, 8, 4, 0, psize);
		PlateL5.setRotationPoint(4.5F,6.3F-pyoffset+1.0F,2.5F);
		Skirt.addChild(PlateL5);
		setRotationDeg(PlateL5,60F,0F,40F);
		setRotatePriorityYZX(PlateL5);

		PlateL6 = new MMM_ModelRenderer_EX(this,44 ,60,0.25F,0.25F,0.25F);
		PlateL6.addPlate(0.0F, 0.0F, 0.0F, 8, 4, 0, psize);
		PlateL6.setRotationPoint(4.5F,6.3F-pyoffset+1.0F,-2.5F);
		Skirt.addChild(PlateL6);
		setRotationDeg(PlateL6,-60F,0F,40F);
		setRotatePriorityYZX(PlateL6);

		Glass = new MMM_ModelRenderer_EX(this, 24, 0,0.5F,0.5F,1.0F);
		Glass.addPlate(-8.0F, -4.0F, 0F, 16, 8, 0, psize);
		Glass.setRotationPoint(0.0F, -4.0F, -4.0F);
		bipedHead.addChild(Glass);
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
		bipedHeadwear.addBox(-4F, -1F, 1F, 8, 4, 3, psize);
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

		EntityLiving entityliving = (EntityLiving)var1.getCapsValue(this.caps_Entity,(Object[])null);
		if(entityliving == null)
			return;
		if(entityliving instanceof LMM_EntityLittleMaid){
			LMM_EntityLittleMaid entitylittlemaid = (LMM_EntityLittleMaid)entityliving;

			if(entitylittlemaid.isOpenInventory())
			{
				int IdIndex;
				try
				{
					IdIndex=IdList.indexOf((int)this.entityIdFactor);
					HanreiC.rotateAngleY=(Float)AngleYList.get(IdIndex);
					AY=(Float)YawOffsetList.get(IdIndex);
				}
				catch(Exception exception)
				{
					IdList.add((int)this.entityIdFactor);
					AngleYList.add(HanreiC.rotateAngleY);
					YawOffsetList.add(entitylittlemaid.renderYawOffset);//renderYawOffset);
					IdIndex=IdList.indexOf((int)this.entityIdFactor);
					AY=entitylittlemaid.renderYawOffset;//renderYawOffset;
				}
				finally
				{
					Hanrei4.rotateAngleY=Hanrei5.rotateAngleY=HanreiC.rotateAngleY;
				}
		//		HanreiC.rotateAngleY=0F;
		//		Hanrei4.rotateAngleY=Hanrei5.rotateAngleY=HanreiC.rotateAngleY;

/*				mod_littleMaidMob.Debug(String.format("ID:%d, %s", new Object[]
		                {
		                    Integer.valueOf(entitylittlemaid.entityId), entitylittlemaid.textureName
		                }));
				mod_littleMaidMob.Debug(String.format("YawOffset:%f, prevYawOffset:%f, rotationYaw:%.0f, rotationYawHead:%.0f, AngleY:%f", new Object[]
		                {
						entitylittlemaid.renderYawOffset, entitylittlemaid.prevRenderYawOffset,entitylittlemaid.rotationYaw,entitylittlemaid.rotationYawHead,HanreiC.preRotateAngleY
		                }));*/
			}
			else if(!entitylittlemaid.isOpenInventory())
			{
				int IdIndex;
				try
				{
					IdIndex=IdList.indexOf((int)this.entityIdFactor);
					HanreiC.rotateAngleY=(Float)AngleYList.get(IdIndex);
					AY=(Float)YawOffsetList.get(IdIndex);
				}
				catch(Exception exception)
				{
					IdList.add((int)this.entityIdFactor);
					AngleYList.add(HanreiC.rotateAngleY);
				//	YawOffsetList.add(entitylittlemaid.renderYawOffset);
					YawOffsetList.add(entitylittlemaid.renderYawOffset);
					IdIndex=IdList.indexOf((int)this.entityIdFactor);
					AY=entitylittlemaid.renderYawOffset;//renderYawOffset;
				}

				float r1=(entitylittlemaid.renderYawOffset)/180F*(float)Math.PI;

				float move=r1-AY/180F*(float)Math.PI;
/*				if(entitylittlemaid.entityId==180){
				mod_littleMaidMob.Debug(String.format("setLivingAnimation... YawOffset:%.2f, prevYawOffset:%.2f, move:%.2f AngleY:%.2f, AY:%.2f, prevAY:%.2f", new Object[]
		                {
						entitylittlemaid.renderYawOffset, entitylittlemaid.prevRenderYawOffset,move,HanreiC.preRotateAngleY,AY,prevAY
		                }));
				}*/
				HanreiC.rotateAngleY-=move*0.45F;
				while(HanreiC.rotateAngleY>(float)Math.PI)
					HanreiC.rotateAngleY-=2f*(float)Math.PI;
				while(HanreiC.rotateAngleY<-(float)Math.PI)
					HanreiC.rotateAngleY+=2f*(float)Math.PI;
				if(HanreiC.rotateAngleY!=0F)
				{
			//		if(Math.abs(HanreiC.rotateAngleY/200F)>0.01F)
			//			HanreiC.rotateAngleY-=Math.copySign(0.01F,HanreiC.rotateAngleY);
			//		else
			//			HanreiC.rotateAngleY-=HanreiC.rotateAngleY/200F;
						HanreiC.rotateAngleY*=0.99f;
				}
				Hanrei4.rotateAngleY=Hanrei5.rotateAngleY=HanreiC.rotateAngleY;
				AngleYList.set(IdIndex, HanreiC.rotateAngleY);
				YawOffsetList.set(IdIndex, entitylittlemaid.renderYawOffset);
			}
		}
	}

	public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6, MMM_IModelCaps var7)
	{
		super.setRotationAngles(var1,  var2,  var3,  var4,  var5,  var6, var7);

		bipedHeadwear.rotateAngleX=bipedHeadwear.rotateAngleY=bipedHeadwear.rotateAngleZ=0f;

		shiftArray(HanreiC.rotationPointX,HanreiC.rotationPointY,HanreiC.rotationPointZ);

		Hanrei4.rotationPointX=pastX[4];
		Hanrei4.rotationPointY=pastY[4]+1.0F;
		Hanrei4.rotationPointZ=pastZ[4]+2.5F;

		Hanrei5.rotationPointX=pastX[9];
		Hanrei5.rotationPointY=pastY[9]+1.5F;
		Hanrei5.rotationPointZ=pastZ[9]+3.5F;


		HanreiC.rotationPointX=x1+MathHelper.cos((var3+this.entityIdFactor/10f+0.01F*var5)*0.11F) * 0.5F;
		HanreiC.rotationPointZ=z1+MathHelper.cos((var3+this.entityIdFactor/10f+0.01F*var5)*0.07F) * 0.5F;
		HanreiC.rotationPointY=y1+MathHelper.cos((var3+this.entityIdFactor/10f+0.01F*var5)*0.13F) * 0.5F;

		Skirt.rotateAngleX=0f;
		Skirt.rotationPointZ=0f;

		if (aimedBow) {
			eyeL.showModel = true;
		}
		if(isSneak){
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

	private void copyRotate(MMM_ModelRenderer from,MMM_ModelRenderer dist){
		dist.rotateAngleX=from.rotateAngleX;
		dist.rotateAngleY=from.rotateAngleY;
		dist.rotateAngleZ=from.rotateAngleZ;
	}

	private void setRotatePriorityYZX(MMM_ModelRenderer model){
		model.rotatePriority=model.RotXZY;
	}

/*
	private void moving(EntityLiving entityliving, ModelRenderer model, float distX, float distY, float distZ){
		float position[];
		float childPosition[];
		int idIndex;
		try{
			idIndex=IdList.indexOf(entityliving.entityId);
			position=(float[])positionList.get(idIndex);
			childPosition=(float[])childPositionList.get(idIndex);
		}catch(Exception e){
			position=new float[3];
	//		position[0]=(float)Math.cos(-entityliving.renderYawOffset*(float)Math.PI/180f)*(float)entityliving.posX
	//				+(float)(-Math.sin(-entityliving.renderYawOffset*(float)Math.PI/180f))*(float)entityliving.posZ;
	///		position[2]=(float)Math.sin(-entityliving.renderYawOffset*(float)Math.PI/180f)*(float)entityliving.posX
	//				+(float)(Math.cos(-entityliving.renderYawOffset*(float)Math.PI/180f))*(float)entityliving.posZ;
			position[0]=(float)entityliving.posX;
			position[1]=(float)entityliving.posY;
			position[2]=(float)entityliving.posZ;
			IdList.add(entityliving.entityId);
			idIndex=IdList.indexOf(entityliving.entityId);
			positionList.add(position);
			childPosition=new float[3];
	//		childPosition[0]=(float)model.rotationPointX;
	//		childPosition[1]=(float)model.rotationPointY;
	//		childPosition[2]=(float)model.rotationPointZ;
	//		childPosition[0]=(float)entityliving.posX;
	//		childPosition[1]=(float)entityliving.posY;
	//		childPosition[2]=(float)entityliving.posZ;
			childPosition[0]=0f;
			childPosition[1]=0f;
			childPosition[2]=0f;
			childPositionList.add(childPosition);
		}
		float trans[]=new float[2];
		trans[0]=(float)Math.cos(-entityliving.renderYawOffset*(float)Math.PI/180f)*(float)entityliving.posX
				+(float)(-Math.sin(-entityliving.renderYawOffset*(float)Math.PI/180f))*(float)entityliving.posZ;
		trans[1]=(float)Math.sin(-entityliving.renderYawOffset*(float)Math.PI/180f)*(float)entityliving.posX
				+(float)(Math.cos(-entityliving.renderYawOffset*(float)Math.PI/180f))*(float)entityliving.posZ;

	//	float move[]={trans[0]-position[0],
	//			(float)entityliving.posY-position[1],
	//			trans[1]-position[2]};
		float move[]={(float)entityliving.posX-position[0],
					(float)entityliving.posY-position[1],
					(float)entityliving.posZ-position[2]};
		move[0]=childPosition[0]-move[0];
		move[1]=childPosition[1]-move[1];
		move[2]=childPosition[2]-move[2];
	//	float trans[]=new float[2];
		trans[0]=move[0]*(float)Math.cos(entityliving.renderYawOffset*(float)Math.PI/180f)+move[2]*(float)(-Math.sin(entityliving.renderYawOffset*(float)Math.PI/180f));
		trans[1]=move[0]*(float)Math.sin(entityliving.renderYawOffset*(float)Math.PI/180f)+move[2]*(float)Math.cos(entityliving.renderYawOffset*(float)Math.PI/180f);
	//	model.rotationPointX=childPosition[0]-(trans[0]+distX);
	//	model.rotationPointY=childPosition[1]-(move[1]+distY);
	//	model.rotationPointZ=childPosition[2]-(trans[1]+distZ);
	//	model.rotationPointX=(trans[0]+distX);
	//	model.rotationPointY=(move[1]+distY);
	//	model.rotationPointZ=(trans[1]+distZ);
		model.rotationPointX=trans[0];
		model.rotationPointY=move[1];
		model.rotationPointZ=trans[1];
		model.rotationPointX*=0.99f;
		model.rotationPointY*=0.99f;
		model.rotationPointZ*=0.99f;
		model.rotationPointX+=distX;
		model.rotationPointY+=distY;
		model.rotationPointZ+=distZ;
	//	model.rotationPointX=distX*(float)Math.cos(entityliving.renderYawOffset*(float)Math.PI/180f)+distZ*(float)(-Math.sin(entityliving.renderYawOffset*(float)Math.PI/180f));
	//	model.rotationPointY=0f;
	//	model.rotationPointZ=distX*(float)Math.sin(entityliving.renderYawOffset*(float)Math.PI/180f)+distZ*(float)(Math.cos(entityliving.renderYawOffset*(float)Math.PI/180f));
	//	model.rotateAngleY=entityliving.renderYawOffset;
		//	model.rotateAngleY=-entityliving.renderYawOffset;
	//	position[0]=(float)Math.cos(-entityliving.renderYawOffset*(float)Math.PI/180f)*(float)entityliving.posX
	//			+(float)(-Math.sin(-entityliving.renderYawOffset*(float)Math.PI/180f))*(float)entityliving.posZ;
	//	position[2]=(float)Math.sin(-entityliving.renderYawOffset*(float)Math.PI/180f)*(float)entityliving.posX
	//			+(float)(Math.cos(-entityliving.renderYawOffset*(float)Math.PI/180f))*(float)entityliving.posZ;
		position[0]=(float)entityliving.posX;
		position[1]=(float)entityliving.posY;
		position[2]=(float)entityliving.posZ;
		childPosition[0]=model.rotationPointX;
		childPosition[1]=model.rotationPointY;
		childPosition[2]=model.rotationPointZ;
		childPosition[0]=(model.rotationPointX-distX)*(float)Math.cos(-entityliving.renderYawOffset*(float)Math.PI/180f)+(model.rotationPointZ-distZ)*(float)(-Math.sin(-entityliving.renderYawOffset*(float)Math.PI/180f));
		childPosition[2]=(model.rotationPointX-distX)*(float)Math.sin(-entityliving.renderYawOffset*(float)Math.PI/180f)+(model.rotationPointZ-distZ)*(float)(Math.cos(-entityliving.renderYawOffset*(float)Math.PI/180f));
System.out.println(String.format("mx : %.2f, my : %.2f, mz : %.2f",move[0],move[1],move[2]));
System.out.println(String.format("x : %.2f, y : %.2f, z : %.2f",model.rotationPointX,model.rotationPointY,model.rotationPointZ));
		positionList.set(idIndex, position);
		childPositionList.set(idIndex,childPosition);

	}
*/
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

	private float convertDegtoRad(float deg)
	{
		return deg/180F*(float)Math.PI;
	}

	@Override
	public void equippedHeadItemPosition()
    {
        GL11.glTranslatef(0.0F, 0.95F, 0.0F);
    }
}