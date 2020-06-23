package modelAppend;

import net.minecraft.src.*;

public class ModelPlateFreeShape extends MMM_ModelBox
{
    private PositionTextureVertex vertexPositions[];
    private TexturedTriangle triList[];

    /** X vertex coordinate of lower box corner */
    public final float posX1;

    /** Y vertex coordinate of lower box corner */
    public final float posY1;

    /** Z vertex coordinate of lower box corner */
    public final float posZ1;

    /** X vertex coordinate of upper box corner */
    public final float posX2;

    /** Y vertex coordinate of upper box corner */
    public final float posY2;

    /** Z vertex coordinate of upper box corner */
    public final float posZ2;

    /** X vertex coordinate of upper box corner */
    public final float posX3;

    /** Y vertex coordinate of upper box corner */
    public final float posY3;

    /** Z vertex coordinate of upper box corner */
    public final float posZ3;

    public final float vn[][];

    /**
     *
     * @param modelrenderer
     * @param i : textureOffsetX
     * @param j : textureOffsetY
     * @param f : PositionOffsetX
     * @param f1 : PositionOffsetY
     * @param f2 : PositionOffsetZ
     * @param k : length or depthX(depthZ, depthX)
     * @param l : angle, in Degree, or depthY(depthY, depthZ)
     * @param i1 : Select Plane and Triangle Shape; Sum Plane No. and Shape No.
     *  <ul>
     * Plane No.<br>
     * <ul>
     * 0 : XY Plane<br>
     * 1 : YZ Plane<br>
     * 2 : XZ Plane<br>
     * </ul>
     * Shape No.<br>
     * <ul>
     * 0 : Isosceles triangle<br>
     * 4 : Right-angled triangle
     * </ul>
     * </ul>
     * @param scale : scale
     */
    public ModelPlateFreeShape(MMM_ModelRenderer modelrenderer, float vertex[][], float texUV[][], float vertexN[][], float RGBA[],float scale)
    {
        super(modelrenderer, 0, 0, 0f, 0f, 0f, 0, 0, 0, scale);

        int n=vertex.length;

        posX1=vertex[0][0];
        posY1=vertex[0][1];
        posZ1=vertex[0][2];
        posX2=vertex[1][0];
        posY2=vertex[1][1];
        posZ2=vertex[1][2];
        posX3=vertex[2][0];
        posY3=vertex[2][1];
        posZ3=vertex[2][2];
        vn=vertexN;

        vertexPositions = new PositionTextureVertex[n];
        triList = new TexturedTriangle[1];

        for(int l=0;l<n;l++){
        	vertexPositions[l]=new PositionTextureVertex(vertex[l][0], vertex[l][1], vertex[l][2], 0.0F, 0.0F);
        }

        	triList[0] = new TexturedTriangle(vertexPositions, texUV, vn, RGBA, 0, 0);

        if(modelrenderer.mirror==true){
        	for(int i=0;i<triList.length;i++){
        		triList[i].flipFace();
        	}
        }
    }

    public void render(Tessellator par1Tessellator, float par2)
    {
        for (int i = 0; i < triList.length; i++)
        {
            triList[i].draw(par1Tessellator, par2);
        }
    }
}
