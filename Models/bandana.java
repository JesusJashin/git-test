// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class bandana extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;

	public bandana() {
		textureWidth = 32;
		textureHeight = 32;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 10, 12, -4.2F, -7.7F, -4.0F, 1, 2, 8, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 10, 2, 3.2F, -7.7F, -4.0F, 1, 2, 8, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(2.3256F, -3.037F, 3.7F);
		Head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -1.5708F, -1.9024F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 0, -0.5F, -0.8F, -1.3F, 1, 1, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -5.7F, 4.3F);
		Head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -1.5708F, -2.1468F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -1.1F, 0.0F, -0.6F, 1, 1, 3, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.2533F, -3.005F, 3.7F);
		Head.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -1.5708F, -0.6807F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 10, -0.5F, -0.8F, -1.2F, 1, 1, 2, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -5.7F, 4.3F);
		Head.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -1.5708F, -0.9599F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 4, -1.1F, -0.8F, -0.6F, 1, 1, 3, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.6F, -6.7F, 0.0F);
		Head.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, -1.5708F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 3.2F, -1.0F, -4.6F, 1, 2, 8, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 10, -4.2F, -1.0F, -4.6F, 1, 2, 8, 0.0F, false));
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