


public class custom_model extends ModelBase {
	private final ModelRenderer Body;
	private final ModelRenderer cube_r1;

	public custom_model() {
		textureWidth = 32;
		textureHeight = 32;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 0, -4.0F, 5.0F, -6.6F, 8, 2, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 3.4F, -5.6F);
		Body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 4, -3.4F, -4.0F, -1.0F, 5, 2, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 8, -3.4F, -1.0F, -1.0F, 5, 2, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 12, -3.4F, 2.0F, -1.0F, 5, 2, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Body.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}