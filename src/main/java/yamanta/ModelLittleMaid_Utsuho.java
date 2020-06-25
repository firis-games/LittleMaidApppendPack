package yamanta;

import firis.lmmm.api.caps.IModelCaps;
import firis.lmmm.api.renderer.ModelRenderer;
import firis.lmmm.builtin.model.ModelLittleMaid_Archetype;
import yamanta.lib.ModelRendererEX;

public class ModelLittleMaid_Utsuho extends ModelLittleMaid_Archetype {

	public ModelRenderer eyeR;
	public ModelRenderer eyeL;
	public ModelRenderer Prim;
	public ModelRenderer WingLOrigin;
	public ModelRenderer WingLroot;
	public ModelRenderer WingL2;
	public ModelRenderer WingL3;
	public ModelRenderer WingL4;
	public ModelRenderer WingL5;
	public ModelRenderer WingL6;
	public ModelRenderer WingROrigin;
	public ModelRenderer WingRroot;
	public ModelRenderer WingR2;
	public ModelRenderer WingR3;
	public ModelRenderer WingR4;
	public ModelRenderer WingR5;
	public ModelRenderer WingR6;
	public ModelRenderer SideTailL2;
	public ModelRenderer SideTailR2;
	public ModelRenderer Tail2;
	public ModelRenderer Bust1;
	public ModelRenderer Bust2;
	public ModelRenderer Bust3;
	public ModelRenderer Bust4;
	public ModelRenderer Ahoge;
	public ModelRendererEX Skirt1;
	public ModelRendererEX Skirt2;
	public ModelRendererEX Skirt3;
	public ModelRendererEX Skirt4;
	public ModelRendererEX Skirt5;
	public ModelRendererEX Skirt6;
	public ModelRendererEX Skirt7;
	public ModelRendererEX Skirt8;
	public ModelRendererEX Skirt9;
	public ModelRendererEX Skirt10;
	public ModelRendererEX Skirt11;
	public ModelRendererEX Skirt12;
	public ModelRendererEX Circle1;
	public ModelRendererEX Circle2;
	public ModelRenderer Ribon0;
	public ModelRenderer RibonLU1;
	public ModelRenderer RibonLU2;
	public ModelRenderer RibonLU3;
	public ModelRenderer RibonLU4;
	public ModelRenderer RibonRU1;
	public ModelRenderer RibonRU2;
	public ModelRenderer RibonRU3;
	public ModelRenderer RibonRU4;
	public ModelRenderer RibonLD1;
	public ModelRenderer RibonLD2;
	public ModelRenderer RibonLD3;
	public ModelRenderer RibonRD1;
	public ModelRenderer RibonRD2;
	public ModelRenderer RibonRD3;
	public ModelRenderer CS1;
	public ModelRenderer CS2;
	public ModelRenderer CS3;
	public ModelRenderer CS4;
	public ModelRenderer CS5;
	public ModelRenderer CS6;
	public ModelRendererEX CS7;
	public ModelRendererEX CS8;
	public ModelRendererEX CS9;
	public ModelRenderer RightShoo;
	public ModelRenderer HipR;
	public ModelRenderer HipL;

	private float x1;
	private float y1;
	private float z1;
	private float IdOffset;

	public ModelLittleMaid_Utsuho() {
		this(0.0F);
	}

	public ModelLittleMaid_Utsuho(float f) {
		this(f, 0.0F);
	}

	public ModelLittleMaid_Utsuho(float f, float f1) {
		super(f, f1, 64, 64);
	}

	@Override
	public void initModel(float psize, float pyoffset) {
		super.initModel(psize, pyoffset);

		textureHeight = 64;
		textureWidth = 64;

//		heldItemLeft = 0;
//		heldItemRight = 0;
		isSneak = false;
		isWait = false;
		aimedBow = false;

		pyoffset += 8F;

		this.initBasicParts(psize, pyoffset);

		CS1 = new ModelRenderer(this, 0, 20);
		CS1.addBox(-1.0F, 0F, -0.3F, 2, 7, 2, psize);
		CS1.setRotationPoint(1F, 2F, 0.0F);
		setRotationDeg(CS1, 0F, 30F, 0F);
		bipedLeftArm.addChild(CS1);

		CS2 = new ModelRenderer(this, 0, 20);
		CS2.addBox(-1.0F, 0F, -0.3F, 2, 7, 2, psize);
		CS2.setRotationPoint(1F, 2F, 0.0F);
		setRotationDeg(CS2, 0F, 90F, 0F);
		bipedLeftArm.addChild(CS2);

		CS3 = new ModelRenderer(this, 0, 20);
		CS3.addBox(-1.0F, 0F, -0.3F, 2, 7, 2, psize);
		CS3.setRotationPoint(1F, 2F, 0.0F);
		setRotationDeg(CS3, 0F, 150F, 0F);
		bipedLeftArm.addChild(CS3);

		CS4 = new ModelRenderer(this, 0, 20);
		CS4.addBox(-1.0F, 0F, -0.3F, 2, 7, 2, psize);
		CS4.setRotationPoint(1F, 2F, 0.0F);
		setRotationDeg(CS4, 0F, -30F, 0F);
		bipedLeftArm.addChild(CS4);

		CS5 = new ModelRenderer(this, 0, 20);
		CS5.addBox(-1.0F, 0F, -0.3F, 2, 7, 2, psize);
		CS5.setRotationPoint(1F, 2F, 0.0F);
		setRotationDeg(CS5, 0F, -90F, 0F);
		bipedLeftArm.addChild(CS5);

		CS6 = new ModelRenderer(this, 0, 20);
		CS6.addBox(-1.0F, 0F, -0.3F, 2, 7, 2, psize);
		CS6.setRotationPoint(1F, 2F, 0.0F);
		setRotationDeg(CS6, 0F, -150F, 0F);
		bipedLeftArm.addChild(CS6);

		CS7 = new ModelRendererEX(this, 8, 20, 0.5F, 0.5F, 0.5F);
		CS7.addBox(-0.5F, -4F, -0.5F, 1, 8, 1, psize);
		CS7.setRotationPoint(1F, 8F, 0.0F);
		setRotationDeg(CS7, 0F, -60F, 90F);
		bipedLeftArm.addChild(CS7);
		setRotatePriorityYZX(CS7);

		CS8 = new ModelRendererEX(this, 8, 20, 0.5F, 0.5F, 0.5F);
		CS8.addBox(-0.5F, -4F, -0.5F, 1, 8, 1, psize);
		CS8.setRotationPoint(1F, 8F, 0.0F);
		setRotationDeg(CS8, 0F, 0F, 90F);
		bipedLeftArm.addChild(CS8);
		setRotatePriorityYZX(CS8);

		CS9 = new ModelRendererEX(this, 8, 20, 0.5F, 0.5F, 0.5F);
		CS9.addBox(-0.5F, -4F, -0.5F, 1, 8, 1, psize);
		CS9.setRotationPoint(1F, 8F, 0F);
		setRotationDeg(CS9, 0F, 60F, 90F);
		bipedLeftArm.addChild(CS9);
		setRotatePriorityYZX(CS9);

		RightShoo = new ModelRenderer(this, 0, 42);
		RightShoo.mirror = true;
		RightShoo.addBox(-2.5F, 3.5F, -2.5F, 4, 6, 5, psize);
		RightShoo.setRotationPoint(0F, -0F, 0F);
		setRotationDeg(RightShoo, 0F, 0F, 0F);
		bipedRightLeg.addChild(RightShoo);

		Circle1 = new ModelRendererEX(this, 25, 0);
		Circle1.addBall(0, 0, 0, 1f, 1f, 1f);
		Circle1.setRotationPoint(0F, 0F, 0F);
		bipedLeftLeg.addChild(Circle1);
		setRotationDeg(Circle1, 45F, 45F, 0F);
		x1 = 1F;
		y1 = 6F;
		z1 = 0F;

		Circle2 = new ModelRendererEX(this, 25, 0);
		Circle2.addBall(0, 0, 0, 1f, 1f, 1f);
		Circle2.setRotationPoint(0F, 0F, 0F);
		bipedLeftLeg.addChild(Circle2);
		setRotationDeg(Circle2, 45F, 45F, 0F);

		Tail = new ModelRenderer(this, 46, 19);
		Tail.addBox(-1F, 0F, -1F, 2, 2, 2, psize + 0.1F);
		Tail.setRotationPoint(0F, -7.8F, 6F);
		bipedHead.addChild(Tail);

		Tail2 = new ModelRenderer(this, 46, 19);
		Tail2.addBox(-1F, 0F, -1F, 2, 5, 2, psize);
		Tail2.setRotationPoint(0F, -6.0F, 6F);
		bipedHead.addChild(Tail2);

		Bust1 = new ModelRenderer(this, 54, 17);
		Bust1.addBox(-1.5F, -1.5F, 0F, 3, 3, 1, psize);
		Bust1.setRotationPoint(0F, 2F, -2.5F);
		setRotation(Bust1, 0F, 0F, 0F);
		bipedBody.addChild(Bust1);

		Bust2 = new ModelRenderer(this, 0, 0);
		Bust2.addBox(-1F, 0F, 0F, 1, 1, 1, psize);
		Bust2.setRotationPoint(0F, 1.5F, -2.7F);
		setRotationDeg(Bust2, -45F, 90F, 79F);
		bipedBody.addChild(Bust2);
		setRotatePriorityYZX(Bust2);

		Bust3 = new ModelRenderer(this, 0, 0);
		Bust3.addBox(0F, 0F, 0F, 1, 1, 1, psize);
		Bust3.setRotationPoint(0F, 1.5F, -2.7F);
		setRotationDeg(Bust3, -45F, 90F, 90F);
		bipedBody.addChild(Bust3);
		setRotatePriorityYZX(Bust3);

		Bust4 = new ModelRenderer(this, 0, 0);
		Bust4.addBox(0F, 0F, 0F, 1, 1, 1, psize);
		Bust4.setRotationPoint(0F, 2.5F, -2.7F);
		setRotationDeg(Bust4, -45F, 90F, 101F);
		bipedBody.addChild(Bust4);
		setRotatePriorityYZX(Bust4);

		Ahoge = new ModelRenderer(this, 0, 1);
		Ahoge.addBox(0F, 0F, 0F, 0, 3, 4, psize);
		Ahoge.setRotationPoint(0F, -7F, -4F);
		bipedHead.addChild(Ahoge);

		Skirt1 = new ModelRendererEX(this, -2, 32, 0.5F, 0.5F, 0.5F);
		Skirt1.addBox(0F, 0F, 0F, 12, 4, 4, psize);
		Skirt1.setRotationPoint(2.4F, -3F, -0.6F);
		Skirt.addChild(Skirt1);
		setRotatePriorityYZX(Skirt1);

		Skirt2 = new ModelRendererEX(this, -2, 32, 0.5F, 0.5F, 0.5F);
		Skirt2.addBox(0F, 0F, 0F, 12, 4, 4, psize);
		Skirt2.setRotationPoint(2F, -3F, -1.2F);
		Skirt.addChild(Skirt2);
		setRotatePriorityYZX(Skirt2);

		Skirt3 = new ModelRendererEX(this, -6, 32, 0.5F, 0.5F, 0.5F);
		Skirt3.addBox(0F, 0F, 0F, 16, 4, 4, psize);
		Skirt3.setRotationPoint(0F, -4F, 0F);
		Skirt.addChild(Skirt3);
		setRotatePriorityYZX(Skirt3);

		Skirt4 = new ModelRendererEX(this, -6, 32, 0.5F, 0.5F, 0.5F);
		Skirt4.addBox(0F, 0F, 0F, 16, 4, 4, psize);
		Skirt4.setRotationPoint(0F, -4F, 0F);
		Skirt.addChild(Skirt4);
		setRotatePriorityYZX(Skirt4);

		Skirt5 = new ModelRendererEX(this, -2, 32, 0.5F, 0.5F, 0.5F);
		Skirt5.addBox(0F, 0F, 0F, 12, 4, 4, psize);
		Skirt5.setRotationPoint(-2F, -3F, -1.2F);
		Skirt.addChild(Skirt5);
		setRotatePriorityYZX(Skirt5);

		Skirt6 = new ModelRendererEX(this, -2, 32, 0.5F, 0.5F, 0.5F);
		Skirt6.addBox(0F, 0F, 0F, 12, 4, 4, psize);
		Skirt6.setRotationPoint(-2.4F, -3F, -0.6F);
		Skirt.addChild(Skirt6);
		setRotatePriorityYZX(Skirt6);

		Skirt7 = new ModelRendererEX(this, -2, 32, 0.5F, 0.5F, 0.5F);
		Skirt7.addBox(0F, 0F, 0F, 12, 4, 4, psize);
		Skirt7.setRotationPoint(-2.4F, -3F, 0.6F);
		Skirt.addChild(Skirt7);
		setRotatePriorityYZX(Skirt7);

		Skirt8 = new ModelRendererEX(this, -2, 32, 0.5F, 0.5F, 0.5F);
		Skirt8.addBox(0F, 0F, 0F, 12, 4, 4, psize);
		Skirt8.setRotationPoint(-2F, -3F, 1.2F);
		Skirt.addChild(Skirt8);
		setRotatePriorityYZX(Skirt8);

		Skirt9 = new ModelRendererEX(this, -6, 32, 0.5F, 0.5F, 0.5F);
		Skirt9.addBox(0F, 0F, 0F, 16, 4, 4, psize);
		Skirt9.setRotationPoint(0F, -4F, 0F);
		Skirt.addChild(Skirt9);
		setRotatePriorityYZX(Skirt9);

		Skirt10 = new ModelRendererEX(this, -6, 32, 0.5F, 0.5F, 0.5F);
		Skirt10.addBox(0F, 0F, 0F, 16, 4, 4, psize);
		Skirt10.setRotationPoint(0F, -4F, 0F);
		Skirt.addChild(Skirt10);
		setRotatePriorityYZX(Skirt10);

		Skirt11 = new ModelRendererEX(this, -2, 32, 0.5F, 0.5F, 0.5F);
		Skirt11.addBox(0F, 0F, 0F, 12, 4, 4, psize);
		Skirt11.setRotationPoint(2F, -3F, 1.2F);
		Skirt.addChild(Skirt11);
		setRotatePriorityYZX(Skirt11);

		Skirt12 = new ModelRendererEX(this, -2, 32, 0.5F, 0.5F, 0.5F);
		Skirt12.addBox(0F, 0F, 0F, 12, 4, 4, psize);
		Skirt12.setRotationPoint(2.4F, -3F, 0.6F);
		Skirt.addChild(Skirt12);
		setRotatePriorityYZX(Skirt12);

		Ribon0 = new ModelRenderer(this, 0, 16);
		Ribon0.addBox(-1F, -1F, 0F, 2, 2, 2);
		Ribon0.setRotationPoint(0F, -6.4F, 3.8F);
		setRotationDeg(Ribon0, 10F, 0F, 0F);
		setRotationDeg(Ribon0, 10F, 0F, 0F);
		bipedHead.addChild(Ribon0);

		RibonLU1 = new ModelRenderer(this, 1, 40);
		RibonLU1.addBox(0F, -0.5F, -0.5F, 5, 1, 1);
		RibonLU1.setRotationPoint(0.5F, 0.2F, 1F);// 0.5F, -7F, 5F);
		setRotation(RibonLU1, 0.7853982F, 0F, -0.4886922F);
		Ribon0.addChild(RibonLU1);

		RibonLU2 = new ModelRenderer(this, 1, 40);
		RibonLU2.addBox(-0.5F, -0.5F, -0.5F, 5, 1, 1);
		RibonLU2.setRotationPoint(0.5F, 0.2F, 1F);
		setRotation(RibonLU2, 0.7853982F, 0F, -0.1745329F);
		Ribon0.addChild(RibonLU2);

		RibonLU3 = new ModelRenderer(this, 2, 40);
		RibonLU3.addBox(0F, -0.5F, -0.5F, 4, 1, 1);
		RibonLU3.setRotationPoint(0.5F, 0.2F, 1F);
		setRotation(RibonLU3, 0.7853982F, 0F, 0.1745329F);
		Ribon0.addChild(RibonLU3);

		RibonLU4 = new ModelRenderer(this, 2, 40);
		RibonLU4.addBox(-0.5F, -0.5F, -0.5F, 4, 1, 1);
		RibonLU4.setRotationPoint(0.0F, 0.3F, 1F);
		setRotation(RibonLU4, 0.7853982F, 0F, 0.5759587F);
		Ribon0.addChild(RibonLU4);

		RibonRU1 = new ModelRenderer(this, 1, 40);
		RibonRU1.addBox(0F, -0.5F, -0.5F, 5, 1, 1);
		RibonRU1.setRotationPoint(-0.5F, 0.2F, 1F);
		setRotation(RibonRU1, -2.356194F, 3.141593F, -0.4886922F);
		Ribon0.addChild(RibonRU1);
		setRotatePriorityYZX(RibonRU1);

		RibonRU2 = new ModelRenderer(this, 1, 40);
		RibonRU2.addBox(-0.5F, -0.5F, -0.5F, 5, 1, 1);
		RibonRU2.setRotationPoint(-0.5F, 0.2F, 1F);
		setRotation(RibonRU2, -2.356194F, 3.141593F, -0.1745329F);
		Ribon0.addChild(RibonRU2);
		setRotatePriorityYZX(RibonRU2);

		RibonRU3 = new ModelRenderer(this, 2, 40);
		RibonRU3.addBox(0F, -0.5F, -0.5F, 4, 1, 1);
		RibonRU3.setRotationPoint(-0.5F, 0.2F, 1F);
		setRotation(RibonRU3, -2.356194F, 3.141593F, 0.1745329F);
		Ribon0.addChild(RibonRU3);
		setRotatePriorityYZX(RibonRU3);

		RibonRU4 = new ModelRenderer(this, 2, 40);
		RibonRU4.addBox(-0.5F, -0.5F, -0.5F, 4, 1, 1);
		RibonRU4.setRotationPoint(-0.5F, 0.2F, 1F);
		setRotation(RibonRU4, -2.356194F, 3.141593F, 0.5759587F);
		Ribon0.addChild(RibonRU4);
		setRotatePriorityYZX(RibonRU4);

		RibonLD1 = new ModelRenderer(this, 1, 40);
		RibonLD1.addBox(0F, -0.5F, -0.5F, 5, 1, 1);
		RibonLD1.setRotationPoint(-0.5F, -0.3F, 1F);
		setRotationDeg(RibonLD1, -110F, -5F, 27F);
		Ribon0.addChild(RibonLD1);
		setRotatePriorityYZX(RibonLD1);

		RibonLD2 = new ModelRenderer(this, 0, 40);
		RibonLD2.addBox(0F, -0.5F, -0.5F, 6, 1, 1);
		RibonLD2.setRotationPoint(-0.5F, -0.3F, 1F);
		setRotationDeg(RibonLD2, -110F, -13F, 42F);
		Ribon0.addChild(RibonLD2);
		setRotatePriorityYZX(RibonLD2);

		RibonLD3 = new ModelRenderer(this, -1, 40);
		RibonLD3.addBox(0F, -0.5F, -0.5F, 7, 1, 1);
		RibonLD3.setRotationPoint(-0.5F, -0.3F, 1F);
		setRotationDeg(RibonLD3, -110F, -21F, 54F);
		Ribon0.addChild(RibonLD3);
		setRotatePriorityYZX(RibonLD3);

		RibonRD1 = new ModelRenderer(this, 3, 40);
		RibonRD1.addBox(0F, -0.5F, -0.5F, 5, 1, 1);
		RibonRD1.setRotationPoint(0.5F, -0.3F, 1F);
		setRotationDeg(RibonRD1, 20F, -175F, 27F);
		Ribon0.addChild(RibonRD1);
		setRotatePriorityYZX(RibonRD1);

		RibonRD2 = new ModelRenderer(this, 0, 40);
		RibonRD2.addBox(0F, -0.5F, -0.5F, 6, 1, 1);
		RibonRD2.setRotationPoint(0.5F, -0.3F, 1F);
		setRotationDeg(RibonRD2, 20F, -167F, 42F);
		Ribon0.addChild(RibonRD2);
		setRotatePriorityYZX(RibonRD2);

		RibonRD3 = new ModelRenderer(this, -1, 40);
		RibonRD3.addBox(0F, -0.5F, -0.5F, 7, 1, 1);
		RibonRD3.setRotationPoint(0.5F, -0.3F, 1F);
		setRotationDeg(RibonRD3, 20F, -159F, 54F);
		Ribon0.addChild(RibonRD3);
		setRotatePriorityYZX(RibonRD3);

		WingLOrigin = new ModelRenderer(this, 0, 0);
		WingLOrigin.mirror = true;
		WingLOrigin.addBox(0F, 0F, -0F, 0, 0, 0, psize);
		WingLOrigin.setRotationPoint(0.4F, 1.5F, 1.2F);
		bipedBody.addChild(WingLOrigin);

		WingLroot = new ModelRenderer(this, 0, 0);
		WingLroot.mirror = true;
		WingLroot.addBox(-0.5F, 0F, -0.5F, 1, 3, 1, psize);
		WingLroot.setRotationPoint(0F, 0F, 0F);
		WingLOrigin.addChild(WingLroot);

		WingL2 = new ModelRenderer(this, 0, 0);
		WingL2.mirror = true;
		WingL2.addBox(-2.4F, 2F, -0.4F, 1, 4, 1, psize);
		WingL2.setRotationPoint(0F, 0F, 0F);
		WingLOrigin.addChild(WingL2);

		WingL3 = new ModelRenderer(this, 4, 1);
		WingL3.mirror = true;
		WingL3.addBox(4.5F, 2.5F, 1.3F, 1, 3, 1, psize);
		WingL3.setRotationPoint(0F, 0F, 0F);
		WingLOrigin.addChild(WingL3);
		setRotatePriorityYZX(WingL3);

		WingL4 = new ModelRenderer(this, 4, 1);
		WingL4.mirror = true;
		WingL4.addBox(3.5F, 2F, 1.3F, 1, 3, 1, psize);
		WingL4.setRotationPoint(0F, 0F, 0F);
		WingLOrigin.addChild(WingL4);
		setRotatePriorityYZX(WingL4);

		WingL5 = new ModelRenderer(this, 4, 1);
		WingL5.mirror = true;
		WingL5.addBox(2.5F, 2F, 1.3F, 1, 2, 1, psize);
		WingL5.setRotationPoint(0F, 0F, 0F);
		WingLOrigin.addChild(WingL5);
		setRotatePriorityYZX(WingL5);

		WingL6 = new ModelRenderer(this, 4, 1);
		WingL6.mirror = true;
		WingL6.addBox(1.8F, 1.5F, 1.3F, 1, 1, 1, psize);
		WingL6.setRotationPoint(0F, 0F, 0F);
		WingLOrigin.addChild(WingL6);
		setRotatePriorityYZX(WingL6);

		WingROrigin = new ModelRenderer(this, 0, 0);
		WingROrigin.addBox(0F, 0F, 0F, 0, 0, 0, psize);
		WingROrigin.setRotationPoint(-0.5F, 1.5F, 1.2F);
		bipedBody.addChild(WingROrigin);

		WingRroot = new ModelRenderer(this, 0, 0);
		WingRroot.addBox(-0.5F, 0F, -0.5F, 1, 3, 1, psize);
		WingRroot.setRotationPoint(0F, 0F, 0F);
		WingROrigin.addChild(WingRroot);

		WingR2 = new ModelRenderer(this, 0, 0);
		WingR2.addBox(1.4F, 2F, -0.4F, 1, 4, 1, psize);
		WingR2.setRotationPoint(0F, 0F, 0F);
		WingROrigin.addChild(WingR2);

		WingR3 = new ModelRenderer(this, 4, 1);
		WingR3.addBox(-5.5F, 2.5F, 1.3F, 1, 3, 1, psize);
		WingR3.setRotationPoint(0F, 0F, 0F);
		WingROrigin.addChild(WingR3);
		setRotatePriorityYZX(WingR3);

		WingR4 = new ModelRenderer(this, 4, 1);
		WingR4.addBox(-4.5F, 2F, 1.3F, 1, 3, 1, psize);
		WingR4.setRotationPoint(0F, 0F, 0F);
		WingROrigin.addChild(WingR4);
		setRotatePriorityYZX(WingR4);

		WingR5 = new ModelRenderer(this, 4, 1);
		WingR5.addBox(-3.5F, 2F, 1.3F, 1, 2, 1, psize);
		WingR5.setRotationPoint(0F, 0F, 0F);
		WingROrigin.addChild(WingR5);
		setRotatePriorityYZX(WingR5);

		WingR6 = new ModelRenderer(this, 4, 1);
		WingR6.addBox(-2.8F, 1.5F, 1.3F, 1, 1, 1, psize);
		WingR6.setRotationPoint(0F, 0F, 0F);
		WingROrigin.addChild(WingR6);
		setRotatePriorityYZX(WingR6);

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

	private void initBasicParts(float psize, float pyoffset) {

		Arms = new ModelRenderer[2];
		Arms[0] = new ModelRenderer(this, 0, 0);
		Arms[0].setRotationPoint(-1F, 5F, -1F);
		Arms[1] = new ModelRenderer(this, 0, 0);
		Arms[1].setRotationPoint(1F, 5F, -1F);
		Arms[1].isInvertX = true;
		HeadMount.setRotationPoint(0F, -3F, 0F);

		bipedHead = new ModelRenderer(this, 0, 0);
		bipedHead.addBox(-4F, -8F, -4F, 8, 8, 8, psize);
		bipedHead.setRotationPoint(0F, 0F, 0F);
		bipedHead.addChild(HeadMount);

		eyeR = new ModelRenderer(this, 32, 19);
		eyeR.addPlate(-4.0F, -5.0F, -4.001F, 4, 4, 0, psize);
		eyeR.setRotationPoint(0.0F, 0.0F, 0.0F);
		eyeL = new ModelRenderer(this, 42, 19);
		eyeL.addPlate(0.0F, -5.0F, -4.001F, 4, 4, 0, psize);
		eyeL.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.addChild(eyeR);
		bipedHead.addChild(eyeL);

		bipedHeadwear = new ModelRenderer(this, 24, 0);
		bipedHeadwear.addBox(-4F, -1F, 1F, 8, 4, 3, psize);
		bipedHeadwear.setRotationPoint(0F, 0F, 0F);
		bipedHead.addChild(bipedHeadwear);

		bipedBody = new ModelRenderer(this, 32, 8);
		bipedBody.addBox(-3F, 0F, -2F, 6, 7, 4, psize);
		bipedBody.setRotationPoint(0F, 0F, 0F);

		bipedRightArm = new ModelRenderer(this, 48, 0);
		bipedRightArm.addBox(-2.0F, -1F, -1F, 2, 8, 2, psize);
		bipedRightArm.setRotationPoint(-3.0F, 1.5F, 0F);
		bipedRightArm.addChild(Arms[0]);

		bipedLeftArm = new ModelRenderer(this, 56, 0);
		bipedLeftArm.addBox(0.0F, -1F, -1F, 2, 8, 2, psize);
		bipedLeftArm.setRotationPoint(3.0F, 1.5F, 0F);
		bipedLeftArm.addChild(Arms[1]);

		bipedRightLeg = new ModelRenderer(this, 32, 19);
		bipedRightLeg.addBox(-2F, 0F, -2F, 3, 9, 4, psize);
		bipedRightLeg.setRotationPoint(-1F, 7F, 0F);

		bipedLeftLeg = new ModelRenderer(this, 32, 19);
		bipedLeftLeg.mirror = true;
		bipedLeftLeg.addBox(-1F, 0F, -2F, 3, 9, 4, psize);
		bipedLeftLeg.setRotationPoint(1F, 7F, 0F);

		Skirt = new ModelRenderer(this, 0, 16);
		Skirt.addBox(-4F, -2F, -4F, 0, 0, 0, psize);
		Skirt.setRotationPoint(0F, 7F, 0F);

		ChignonR = new ModelRenderer(this, 24, 18);
		ChignonR.addBox(-5F, -7F, 0.2F, 1, 3, 3, psize);
		ChignonR.setRotationPoint(0F, 0F, 0F);
		bipedHead.addChild(ChignonR);
		ChignonR.isHidden = true;

		ChignonL = new ModelRenderer(this, 24, 18);
		ChignonL.addBox(4F, -7F, 0.2F, 1, 3, 3, psize);
		ChignonL.setRotationPoint(0F, 0F, 0F);
		bipedHead.addChild(ChignonL);
		ChignonL.isHidden = true;

		ChignonB = new ModelRenderer(this, 52, 10);
		ChignonB.addBox(-2F, -7.2F, 4F, 4, 4, 2, psize);
		ChignonB.setRotationPoint(0F, 0F, 0F);
		bipedHead.addChild(ChignonB);
		ChignonB.isHidden = true;

		Tail = new ModelRenderer(this, 46, 20);
		Tail.addBox(-1.5F, -6.8F, 4F, 3, 9, 3, psize);
		Tail.setRotationPoint(0F, 0F, 0F);
		bipedHead.addChild(Tail);
		Tail.isHidden = true;

		SideTailR = new ModelRenderer(this, 58, 21);
		SideTailR.addBox(-5.5F, -6.8F, 0.9F, 1, 8, 2, psize);
		SideTailR.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.addChild(SideTailR);
		SideTailR.isHidden = true;

		SideTailL = new ModelRenderer(this, 58, 21);
		SideTailL.mirror = true;
		SideTailL.addBox(4.5F, -6.8F, 0.9F, 1, 8, 2, psize);
		SideTailL.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.addChild(SideTailL);
		SideTailL.isHidden = true;

		mainFrame = new ModelRenderer(this, 0, 0);
		mainFrame.setRotationPoint(0F, 0F + pyoffset, 0F);
		mainFrame.addChild(bipedHead);
		mainFrame.addChild(bipedBody);
		mainFrame.addChild(bipedRightArm);
		mainFrame.addChild(bipedLeftArm);
		mainFrame.addChild(bipedRightLeg);
		mainFrame.addChild(bipedLeftLeg);
		mainFrame.addChild(Skirt);
	}

//	public void render(IModelCaps var1, float var2, float var3, float var4, float var5, float var6, float var7,
//			boolean var8) {
//		super.render(var1, var2, var3, var4, var5, var6, var7, var8);
//	}

	@Override
	public void setLivingAnimations(IModelCaps var1, float var2, float var3, float var4) {
		super.setLivingAnimations(var1, var2, var3, var4);

		float f3 = (float) this.entityTicksExisted + this.entityIdFactor;

		if (0.0F > mh_sin(f3 * 0.05F) + mh_sin(f3 * 0.13F) + mh_sin(f3 * 0.7F) + 2.55F) {
			eyeR.showModel = eyeL.showModel = true;
		} else {
			eyeR.showModel = eyeL.showModel = false;
		}
		IdOffset = this.entityIdFactor;
	}

	@Override
	public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6,
			IModelCaps var7) {
		super.setRotationAngles(var1, var2, var3, var4, var5, var6, var7);

		bipedHeadwear.rotateAngleX = bipedHeadwear.rotateAngleY = bipedHeadwear.rotateAngleZ = 0f;

		float t = var3;

		WingLOrigin.rotateAngleX = 0.2F;
		WingROrigin.rotateAngleX = 0.2F;
		WingLOrigin.rotateAngleY = mh_cos(t * 0.5F + IdOffset) * 0.2F - 0.3F;// mh_cos(f2 * 0.6662F) *
																						// 10.0F * f1 * 0.5F;
		WingROrigin.rotateAngleY = mh_cos(t * 0.5F + (float) Math.PI + IdOffset) * 0.2F + 0.3F;// mh_cos(f2
																										// * 0.6662F +
																										// (float)Math.PI)
																										// * 4.0F * f1 *
																										// 0.5F;
		Ahoge.rotateAngleY = mh_cos(t * 0.2F + mh_cos(t * 0.05F + IdOffset) * 1.0F) * 0.2F;
		Ahoge.rotateAngleX = 2.9F;

		Circle1.rotationPointX = x1 + mh_cos(t * 0.3F + IdOffset) * 3F;
		Circle1.rotationPointZ = z1 + mh_cos(t * 0.3F + 0.5F * (float) Math.PI + IdOffset) * 3F;
		Circle1.rotationPointY = y1 + mh_cos(t * 0.37F + IdOffset) * 1.5F;

		Circle2.rotationPointX = x1 + mh_cos(t * 0.3F + 2.5F + IdOffset) * 3F;
		Circle2.rotationPointZ = z1 + mh_cos(t * 0.3F + 2.5F + 0.5F * (float) Math.PI + IdOffset) * 3F;
		Circle2.rotationPointY = y1 - mh_cos(t * 0.37F + 2.5F + IdOffset) * 1.5F;

		Circle1.rotationPointX = 1f + mh_cos(t * 0.3F + IdOffset) * 3F;
		Circle1.rotationPointZ = mh_cos(t * 0.3F + 0.5F * (float) Math.PI + IdOffset) * 3F;
		Circle1.rotationPointY = 6f + mh_cos(t * 0.37F + IdOffset) * 1.5F;

		Circle2.rotationPointX = 1f + mh_cos(t * 0.3F + 2.5F + IdOffset) * 3F;
		Circle2.rotationPointZ = mh_cos(t * 0.3F + 2.5F + 0.5F * (float) Math.PI + IdOffset) * 3F;
		Circle2.rotationPointY = 6f - mh_cos(t * 0.37F + 2.5F + IdOffset) * 1.5F;

		Skirt.rotateAngleX = 0f;

		if (aimedBow) {
			eyeL.showModel = true;
			WingLOrigin.rotateAngleX = 0.5F;
			WingROrigin.rotateAngleX = 0.5F;
			WingLOrigin.rotateAngleY = -0.65F;
			WingROrigin.rotateAngleY = 0.65F;
		}
		if (isSneak) {
			WingLOrigin.rotateAngleX += bipedBody.rotateAngleX;
			WingROrigin.rotateAngleX += bipedBody.rotateAngleX;
		}

		if (isRiding) {
			Skirt.rotateAngleX = convertDegtoRad(-25F);
		}

	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	private void setRotationDeg(ModelRenderer cS12, float x, float y, float z) {
		cS12.rotateAngleX = x * (float) Math.PI / 180F;
		cS12.rotateAngleY = y * (float) Math.PI / 180F;
		cS12.rotateAngleZ = z * (float) Math.PI / 180F;
	}

//	private void copyRotate(ModelRenderer from, ModelRenderer dist) {
//		dist.rotateAngleX = from.rotateAngleX;
//		dist.rotateAngleY = from.rotateAngleY;
//		dist.rotateAngleZ = from.rotateAngleZ;
//	}

	private void setRotatePriorityYZX(ModelRenderer model) {
		model.rotatePriority = ModelRenderer.RotXZY;
	}

	private float convertDegtoRad(float deg) {
		return deg / 180F * (float) Math.PI;
	}

}