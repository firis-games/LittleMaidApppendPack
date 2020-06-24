package yamanta.lib;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.PositionTextureVertex;
import net.minecraft.client.model.TexturedQuad;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TexturedTriangle extends TexturedQuad {
	public PositionTextureVertex vertexPositions[];
	public int nVertices;
	public float vn[][];
	private boolean invertNormal;
	public int red;
	public int green;
	public int blue;
	public int alpha;
	private boolean setColor;

	public TexturedTriangle(PositionTextureVertex par1ArrayOfPositionTextureVertex[]) {
		super(par1ArrayOfPositionTextureVertex);
		nVertices = 0;
		invertNormal = false;
		vertexPositions = par1ArrayOfPositionTextureVertex;
		nVertices = par1ArrayOfPositionTextureVertex.length;
	}

	public TexturedTriangle(PositionTextureVertex par1ArrayOfPositionTextureVertex[], float verUV[][],
			float vertexN[][], float RGBA[], float par6, float par7) {
		this(par1ArrayOfPositionTextureVertex);

		if (RGBA != null) {
			red = (int) (255 * RGBA[0]);
			green = (int) (255 * RGBA[1]);
			blue = (int) (255 * RGBA[2]);
			alpha = (int) (255 * RGBA[3] * 0.5f);
			setColor = true;
		} else {
			red = 255;
			green = 255;
			blue = 255;
			alpha = 255;
			setColor = false;
		}
		// System.out.println(String.format("RGBA (%.4f, %.4f, %.4f,
		// %.4f)",RGBA[0],RGBA[1],RGBA[2],RGBA[3]));
		if (par6 == 0 && par7 == 0)
			par6 = par7 = 1;
		nVertices = par1ArrayOfPositionTextureVertex.length;
		for (int i = 0; i < nVertices; i++)
			par1ArrayOfPositionTextureVertex[i] = par1ArrayOfPositionTextureVertex[i]
					.setTexturePosition(verUV[i][0] / par6, verUV[i][1] / par7);

		vn = vertexN;
		/*
		 * if(vn!=null){
		 * System.out.println(String.format("TextureTriangle : vn1(%.6f,%.6f, %.6f)",vn[
		 * 0][0],vn[0][1],vn[0][2]));
		 * System.out.println(String.format("TextureTriangle : vn2(%.6f,%.6f, %.6f)",vn[
		 * 1][0],vn[1][1],vn[1][2]));
		 * System.out.println(String.format("TextureTriangle : vn3(%.6f,%.6f, %.6f)",vn[
		 * 2][0],vn[2][1],vn[2][2])); }
		 */

	}

	public void flipFace() {
		PositionTextureVertex apositiontexturevertex[] = new PositionTextureVertex[vertexPositions.length];

		for (int i = 0; i < vertexPositions.length; i++) {
			apositiontexturevertex[i] = vertexPositions[vertexPositions.length - i - 1];
		}
		vertexPositions = apositiontexturevertex;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void draw(BufferBuilder renderer, float scale) {

		Vec3d vec3d;
		Vec3d vec3d1;
		Vec3d vec3d2[] = new Vec3d[nVertices];
		if (vn == null) {
			vec3d = vertexPositions[1].vector3D.subtract(vertexPositions[0].vector3D);
			vec3d1 = vertexPositions[1].vector3D.subtract(vertexPositions[2].vector3D);
			for (int i = 0; i < nVertices; i++)
				vec3d2[i] = vec3d1.crossProduct(vec3d).normalize();
		} else {
			for (int i = 0; i < nVertices; i++)
				vec3d2[i] = new Vec3d(vn[i][0], vn[i][1], vn[i][2]);
			/*
			 * vec3d2[1]=vec3d2[0].normalize(); vec3d2[0]=vec3d2[1].normalize();
			 * vec3d2[2]=vec3d2[2].normalize();
			 */
		}
		// par1Tessellator.startDrawingQuads();
		int color = GL11.glGetInteger(GL11.GL_CURRENT_COLOR);
		boolean matEnable;
		if ((color & 0x000000ff) == (int) (255 * 0.4f))
			matEnable = false;
		else
			matEnable = true;
		// System.out.println(String.format("glColor : %x ",color));
		GL11.glShadeModel(GL11.GL_SMOOTH);
		int mode = 6;
		if (nVertices % 4 == 0)
			mode = 7;
		/*
		 * GL_TRIANGLES = 4 GL_TRIANGLE_STRIP = 5 GL_TRIANGLEFAN = 6 GL_QUADS = 7
		 * GL_QUAD_STRIP = 8 GL_POLYGON = 9
		 */
		// par1Tessellator.startDrawing(mode);
		renderer.begin(mode, DefaultVertexFormats.OLDMODEL_POSITION_TEX_NORMAL);
		for (int i = 0; i < nVertices; i++) {
			float f, f1, f2 = 0.0F;
			if (invertNormal) {
				// par1Tessellator.setNormal(-(float)vec3d2[i].x, -(float)vec3d2[i].y,
				// -(float)vec3d2[i].z);
				f = -(float) vec3d2[i].x;
				f1 = -(float) vec3d2[i].y;
				f2 = -(float) vec3d2[i].z;
			} else {
				// par1Tessellator.setNormal((float)vec3d2[i].x, (float)vec3d2[i].y,
				// (float)vec3d2[i].z);
				f = (float) vec3d2[i].x;
				f1 = (float) vec3d2[i].y;
				f2 = (float) vec3d2[i].z;
			}
			// if(matEnable)
			// par1Tessellator.setColorRGBA_I(red<<16| green<<8| blue, alpha);
			PositionTextureVertex positiontexturevertex = vertexPositions[i];
			// par1Tessellator.addVertexWithUV((float)positiontexturevertex.vector3D.xCoord
			// * par2, (float)positiontexturevertex.vector3D.yCoord * par2,
			// (float)positiontexturevertex.vector3D.zCoord * par2,
			// positiontexturevertex.texturePositionX,
			// positiontexturevertex.texturePositionY);
			renderer.pos((float) positiontexturevertex.vector3D.x * scale,
					(float) positiontexturevertex.vector3D.y * scale, (float) positiontexturevertex.vector3D.z * scale)
					.tex((double) positiontexturevertex.texturePositionX,
							(double) positiontexturevertex.texturePositionY)
					.normal(f, f1, f2).endVertex();
		}

		// par1Tessellator.draw();
		Tessellator.getInstance().draw();
	}

}
