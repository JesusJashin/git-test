


public class Sharingan3 extends ModelBase {
	private final ModelRenderer Head;

	public Sharingan3() {
		textureWidth = 16;
		textureHeight = 16;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, 1.0F, -4.0F, -4.1F, 2, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 0, -3.0F, -4.0F, -4.1F, 2, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Head.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}