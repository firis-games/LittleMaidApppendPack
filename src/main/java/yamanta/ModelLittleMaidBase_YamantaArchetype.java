package yamanta;

import firis.lmmm.api.model.ModelLittleMaidBase;
import firis.lmmm.api.renderer.ModelRenderer;

/**
 * Yamanta式用Archetypeモデル
 * 
 * Yamanta式マルチモデルで利用しているModelLittleMaid_Archetypeの差し替え用に作成した
 * ModelLittleMaidBaseベースの基底クラス
 * @author firis-games
 *
 */
public abstract class ModelLittleMaidBase_YamantaArchetype extends ModelLittleMaidBase {
	
	// fields
	public ModelRenderer bipedHeadwear;
	public ModelRenderer ChignonR;
	public ModelRenderer ChignonL;
	public ModelRenderer ChignonB;
	public ModelRenderer Tail;
	public ModelRenderer SideTailR;
	public ModelRenderer SideTailL;
	
	/**
	 * コンストラクタは全て継承させること
	 */
	public ModelLittleMaidBase_YamantaArchetype() {
		super();
	}

	/**
	 * コンストラクタは全て継承させること
	 */
	public ModelLittleMaidBase_YamantaArchetype(float size) {
		super(size);
	}

	/**
	 * コンストラクタは全て継承させること
	 */
	public ModelLittleMaidBase_YamantaArchetype(float size, float yOffset, int textureWidth, int textureHeight) {
		super(size, yOffset, textureWidth, textureHeight);
	}
	
	/**
	 * Archetype用のモデルの初期化処理のみ実行
	 */
	@Override
	public void initModel(float size, float yOffset) {
		super.initModel(size, yOffset);
		
		//Archetype用モデルの初期化
		bipedHeadwear = new ModelRenderer(this);
		ChignonR = new ModelRenderer(this);
		ChignonL = new ModelRenderer(this);
		ChignonB = new ModelRenderer(this);
		Tail = new ModelRenderer(this);
		SideTailR = new ModelRenderer(this);
		SideTailL = new ModelRenderer(this);
	}
	
	/**
	 * 標準系パーツの初期処理
	 * @param psize
	 * @param pyoffset
	 */
	protected abstract void initBasicParts(float size, float yOffset);
	
	/**
	 * 各パーツごとのグループ処理をModelLittleMaidBase仕様で実装する
	 * モデル側でグループの再登録をやっているためinitBasicPartsの後に再設定を行う
	 * @param size
	 * @param yOffset
	 */
	protected void postInitBasicParts(float psize, float pyoffset) {
		
		bipedTorso = new ModelRenderer(this);
		bipedNeck = new ModelRenderer(this);
		bipedPelvic = new ModelRenderer(this);
		bipedPelvic.setRotationPoint(0F, 7F, 0F);
		mainFrame = new ModelRenderer(this, 0, 0);
		mainFrame.setRotationPoint(0F, 0F + pyoffset + 8F, 0F);
		mainFrame.addChild(bipedTorso);
		bipedTorso.addChild(bipedNeck);
		bipedTorso.addChild(bipedBody);
		bipedTorso.addChild(bipedPelvic);
		bipedNeck.addChild(bipedHead);
		bipedNeck.addChild(bipedRightArm);
		bipedNeck.addChild(bipedLeftArm);
		bipedHead.addChild(HeadMount);
		bipedHead.addChild(HeadTop);
		bipedRightArm.addChild(Arms[0]);
		bipedLeftArm.addChild(Arms[1]);
		bipedPelvic.addChild(bipedRightLeg);
		bipedPelvic.addChild(bipedLeftLeg);
		bipedPelvic.addChild(Skirt);
		
	}
	
	/**
	 * Yamanta共通メソッド
	 */
	protected void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
	
	/**
	 * Yamanta共通メソッド
	 */
	protected void setRotationDeg(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x * (float) Math.PI / 180F;
		model.rotateAngleY = y * (float) Math.PI / 180F;
		model.rotateAngleZ = z * (float) Math.PI / 180F;
	}

	/**
	 * Yamanta共通メソッド
	 */
	protected void setRotatePriorityYZX(ModelRenderer model) {
		model.rotatePriority = ModelRenderer.RotXZY;
	}

	/**
	 * Yamanta共通メソッド
	 */
	protected float convertDegtoRad(float deg) {
		return deg / 180F * (float) Math.PI;
	}

}
