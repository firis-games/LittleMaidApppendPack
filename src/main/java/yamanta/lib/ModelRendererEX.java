package yamanta.lib;

import firis.lmmm.api.model.ModelBase;
import firis.lmmm.api.renderer.ModelRenderer;

public class ModelRendererEX extends ModelRenderer {
	private int texOffsetX = 0;
	private int texOffsetY = 0;

	public ModelRendererEX(ModelBase var1, String var2) {
		super(var1, var2);
	}

	public ModelRendererEX(ModelBase var1, int var2, int var3) {
		super(var1, var2, var3);
		this.texOffsetX = var2;
		this.texOffsetY = var3;
	}

	public ModelRendererEX(ModelBase var1) {
		super(var1);
	}

	public ModelRendererEX(ModelBase var1, int var2, int var3, float var4, float var5, float var6) {
		super(var1, var2, var3, var4, var5, var6);
		this.texOffsetX = var2;
		this.texOffsetY = var3;
	}

	public ModelRendererEX(ModelBase var1, float var2, float var3, float var4) {
		super(var1, var2, var3, var4);
	}

	public ModelRendererEX addPlateFreeShape(float[][] var1, float[][] var2, float[][] var3, float[] var4) {
		this.cubeList.add(new ModelPlateFreeShape(this, var1, var2, var3, var4, 0.0F));
		return this;
	}

	public ModelRendererEX addBall(float var1, float var2, float var3, float var4, float var5, float var6) {
		return this.makeBall(var1, var2, var3, var4, var5, var6);
	}

	private ModelRendererEX makeBall(float var1, float var2, float var3, float var4, float var5, float var6) {
		float[][] var7 = new float[][] { { 0.0F, 4.9745197F, -0.0F }, { 0.0F, 3.5175202F, 3.5175202F },
				{ 2.4997F, 3.5175202F, 2.4872599F }, { 3.5351F, 3.5175202F, -0.0F },
				{ 2.4997F, 3.5175202F, -2.4872599F }, { 0.0F, 3.5175202F, -3.5175202F },
				{ -2.4997F, 3.5175202F, -2.4872599F }, { -3.5351F, 3.5175202F, -0.0F },
				{ -2.4997F, 3.5175202F, 2.4872599F }, { 0.0F, 0.0F, 4.9745197F }, { 3.5351F, 0.0F, 3.5175202F },
				{ 4.99939F, 0.0F, 0.0F }, { 3.5351F, -0.0F, -3.5175202F }, { 0.0F, -0.0F, -4.9745197F },
				{ -3.5351F, -0.0F, -3.5175202F }, { -4.99939F, 0.0F, 0.0F }, { -3.5351F, 0.0F, 3.5175202F },
				{ 0.0F, -3.5175202F, 3.5175202F }, { 2.4997F, -3.5175202F, 2.4872599F }, { 3.5351F, -3.5175202F, 0.0F },
				{ 2.4997F, -3.5175202F, -2.4872599F }, { 0.0F, -3.5175202F, -3.5175202F },
				{ -2.4997F, -3.5175202F, -2.4872599F }, { -3.5351F, -3.5175202F, 0.0F },
				{ -2.4997F, -3.5175202F, 2.4872599F }, { 0.0F, -4.9745197F, 0.0F } };
		float[][] var8 = new float[][] {
				{ (float) this.texOffsetX / this.textureWidth, (float) (this.texOffsetY + 1) / this.textureHeight },
				{ (float) (this.texOffsetX + 1) / this.textureWidth,
						(float) (this.texOffsetY + 1) / this.textureHeight },
				{ (float) (this.texOffsetX + 1) / this.textureWidth, (float) this.texOffsetY / this.textureHeight },
				{ (float) this.texOffsetX / this.textureWidth, (float) this.texOffsetY / this.textureHeight } };
		float[][] var9 = new float[][] { { 0.0F, 1.0F, 0.0F }, { 0.0F, 0.663167F, 0.748436F },
				{ 0.527909F, 0.663594F, 0.529984F }, { 0.747673F, 0.664052F, 0.0F },
				{ 0.527909F, 0.663594F, -0.529984F }, { 0.0F, 0.663167F, -0.748436F },
				{ -0.527909F, 0.663594F, -0.529984F }, { -0.747673F, 0.664052F, 0.0F },
				{ -0.527909F, 0.663594F, 0.529984F }, { 0.0F, 0.0F, 0.999969F }, { 0.706076F, 0.0F, 0.70809F },
				{ 1.0F, 0.0F, 0.0F }, { 0.706107F, 0.0F, -0.70809F }, { 0.0F, 0.0F, -0.999969F },
				{ -0.706076F, 0.0F, -0.70809F }, { -1.0F, 0.0F, 0.0F }, { -0.706107F, 0.0F, 0.70809F },
				{ 0.0F, -0.663167F, 0.748436F }, { 0.527909F, -0.663594F, 0.529984F }, { 0.747673F, -0.664052F, 0.0F },
				{ 0.527909F, -0.663594F, -0.529984F }, { 0.0F, -0.663167F, -0.748436F },
				{ -0.527909F, -0.663594F, -0.529984F }, { -0.747673F, -0.664052F, 0.0F },
				{ -0.527909F, -0.663594F, 0.529984F }, { 0.0F, -1.0F, 0.0F } };
		int[][][] var10 = new int[][][] { { { 1 }, { 0, 1, 2 }, { 0, 1, 2 }, { 0, 1, 2 } },
				{ { 1 }, { 0, 2, 3 }, { 0, 1, 2 }, { 0, 2, 3 } }, { { 1 }, { 0, 3, 4 }, { 0, 1, 2 }, { 0, 3, 4 } },
				{ { 1 }, { 0, 4, 5 }, { 0, 1, 2 }, { 0, 4, 5 } }, { { 1 }, { 0, 5, 6 }, { 0, 1, 2 }, { 0, 5, 6 } },
				{ { 1 }, { 0, 6, 7 }, { 0, 1, 2 }, { 0, 6, 7 } }, { { 1 }, { 0, 7, 8 }, { 0, 1, 2 }, { 0, 7, 8 } },
				{ { 1 }, { 0, 8, 1 }, { 0, 1, 2 }, { 0, 8, 1 } },
				{ { 1 }, { 1, 9, 10, 2 }, { 0, 1, 2, 3 }, { 1, 9, 10, 2 } },
				{ { 1 }, { 2, 10, 11, 3 }, { 0, 1, 2, 3 }, { 2, 10, 11, 3 } },
				{ { 1 }, { 3, 11, 12, 4 }, { 0, 1, 2, 3 }, { 3, 11, 12, 4 } },
				{ { 1 }, { 4, 12, 13, 5 }, { 0, 1, 2, 3 }, { 4, 12, 13, 5 } },
				{ { 1 }, { 5, 13, 14, 6 }, { 0, 1, 2, 3 }, { 5, 13, 14, 6 } },
				{ { 1 }, { 6, 14, 15, 7 }, { 0, 1, 2, 3 }, { 6, 14, 15, 7 } },
				{ { 1 }, { 7, 15, 16, 8 }, { 0, 1, 2, 3 }, { 7, 15, 16, 8 } },
				{ { 1 }, { 8, 16, 9, 1 }, { 0, 1, 2, 3 }, { 8, 16, 9, 1 } },
				{ { 1 }, { 9, 17, 18, 10 }, { 0, 1, 2, 3 }, { 9, 17, 18, 10 } },
				{ { 1 }, { 10, 18, 19, 11 }, { 0, 1, 2, 3 }, { 10, 18, 19, 11 } },
				{ { 1 }, { 11, 19, 20, 12 }, { 0, 1, 2, 3 }, { 11, 19, 20, 12 } },
				{ { 1 }, { 12, 20, 21, 13 }, { 0, 1, 2, 3 }, { 12, 20, 21, 13 } },
				{ { 1 }, { 13, 21, 22, 14 }, { 0, 1, 2, 3 }, { 13, 21, 22, 14 } },
				{ { 1 }, { 14, 22, 23, 15 }, { 0, 1, 2, 3 }, { 14, 22, 23, 15 } },
				{ { 1 }, { 15, 23, 24, 16 }, { 0, 1, 2, 3 }, { 15, 23, 24, 16 } },
				{ { 1 }, { 16, 24, 17, 9 }, { 0, 1, 2, 3 }, { 16, 24, 17, 9 } },
				{ { 1 }, { 17, 25, 18 }, { 0, 1, 2 }, { 17, 25, 18 } },
				{ { 1 }, { 18, 25, 19 }, { 0, 1, 2 }, { 18, 25, 19 } },
				{ { 1 }, { 19, 25, 20 }, { 0, 1, 2 }, { 19, 25, 20 } },
				{ { 1 }, { 20, 25, 21 }, { 0, 1, 2 }, { 20, 25, 21 } },
				{ { 1 }, { 21, 25, 22 }, { 0, 1, 2 }, { 21, 25, 22 } },
				{ { 1 }, { 22, 25, 23 }, { 0, 1, 2 }, { 22, 25, 23 } },
				{ { 1 }, { 23, 25, 24 }, { 0, 1, 2 }, { 23, 25, 24 } },
				{ { 1 }, { 24, 25, 17 }, { 0, 1, 2 }, { 24, 25, 17 } } };
		int var11;

		for (var11 = 0; var11 < var7.length; ++var11) {
			var7[var11][0] *= var4 / 8.0F;
			var7[var11][1] *= var5 / 8.0F;
			var7[var11][2] *= var6 / 8.0F;
			var7[var11][0] += var1;
			var7[var11][1] += var2;
			var7[var11][2] += var3;
		}

		for (var11 = 0; var11 < var10.length; ++var11) {
			int var12 = var10[var11][1].length;
			float[][] var13 = new float[var12][3];
			float[][] var14 = new float[var12][2];
			float[][] var15 = new float[var12][3];

			if (var10[var11][0][0] == 1) {
				for (int var16 = 0; var16 < var12; ++var16) {
					var13[var16] = var7[var10[var11][1][var16]];
					var14[var16] = var8[var10[var11][2][var16]];
					var15[var16] = var9[var10[var11][3][var16]];
				}

				this.addPlateFreeShape(var13, var14, var15, (float[]) null);
			}
		}

		return this;
	}
}
