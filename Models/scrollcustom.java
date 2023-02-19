// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class scrollcustom extends ModelBase {
	private final ModelRenderer hexadecagon;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer hexadecagon_r1;
	private final ModelRenderer hexadecagon_r2;
	private final ModelRenderer hexadecagon_r3;
	private final ModelRenderer hexadecagon_r4;
	private final ModelRenderer hexadecagon2;
	private final ModelRenderer hexadecagon_r5;
	private final ModelRenderer hexadecagon_r6;
	private final ModelRenderer hexadecagon_r7;
	private final ModelRenderer hexadecagon_r8;

	public scrollcustom() {
		textureWidth = 128;
		textureHeight = 128;

		hexadecagon = new ModelRenderer(this);
		hexadecagon.setRotationPoint(0.0F, 0.0F, 0.0F);
		hexadecagon.cubeList.add(new ModelBox(hexadecagon, 1, 15, -8.0F, 10.1137F, 2.4896F, 16, 1, 5, 0.0F, false));
		hexadecagon.cubeList.add(new ModelBox(hexadecagon, 34, 40, -8.0F, 8.1F, 4.5033F, 16, 5, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-4.3163F, 0.1313F, 0.0F);
		hexadecagon.addChild(cube_r1);
		setRotationAngle(cube_r1, 1.5708F, 0.0F, -1.5708F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 14, -12.0F, -2.5F, -1.3F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -12.0F, -2.5F, -0.5F, 2, 5, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.6837F, 4.4313F, 2.0F);
		hexadecagon.addChild(cube_r2);
		setRotationAngle(cube_r2, 1.5708F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 7, 1.0F, -4.5F, 3.8F, 2, 5, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.6837F, 4.4313F, 2.0F);
		hexadecagon.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.5236F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 46, -1.5F, -4.7F, -4.5F, 2, 13, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 6, 46, -1.5F, -4.7F, -0.5F, 2, 13, 1, 0.0F, false));

		hexadecagon_r1 = new ModelRenderer(this);
		hexadecagon_r1.setRotationPoint(-4.0F, 10.0F, 5.0F);
		hexadecagon.addChild(hexadecagon_r1);
		setRotationAngle(hexadecagon_r1, -0.3927F, 0.0F, 0.0F);
		hexadecagon_r1.cubeList.add(new ModelBox(hexadecagon_r1, 0, 39, -4.0F, -1.948F, -0.2621F, 16, 5, 1, 0.0F, false));
		hexadecagon_r1.cubeList.add(new ModelBox(hexadecagon_r1, 1, 8, -4.0F, 0.0657F, -2.2758F, 16, 1, 5, 0.0F, false));

		hexadecagon_r2 = new ModelRenderer(this);
		hexadecagon_r2.setRotationPoint(-4.0F, 10.0F, 5.0F);
		hexadecagon.addChild(hexadecagon_r2);
		setRotationAngle(hexadecagon_r2, 0.3927F, 0.0F, 0.0F);
		hexadecagon_r2.cubeList.add(new ModelBox(hexadecagon_r2, 43, 6, -4.0F, -1.9454F, -0.7318F, 16, 5, 1, 0.0F, false));
		hexadecagon_r2.cubeList.add(new ModelBox(hexadecagon_r2, 1, 22, -4.0F, 0.0682F, -2.7455F, 16, 1, 5, 0.0F, false));

		hexadecagon_r3 = new ModelRenderer(this);
		hexadecagon_r3.setRotationPoint(-4.0F, 10.0F, 5.0F);
		hexadecagon.addChild(hexadecagon_r3);
		setRotationAngle(hexadecagon_r3, -0.7854F, 0.0F, 0.0F);
		hexadecagon_r3.cubeList.add(new ModelBox(hexadecagon_r3, 1, 15, -4.0F, -0.0684F, -2.0774F, 16, 1, 5, 0.0F, false));

		hexadecagon_r4 = new ModelRenderer(this);
		hexadecagon_r4.setRotationPoint(-4.0F, 10.0F, 5.0F);
		hexadecagon.addChild(hexadecagon_r4);
		setRotationAngle(hexadecagon_r4, 0.7854F, 0.0F, 0.0F);
		hexadecagon_r4.cubeList.add(new ModelBox(hexadecagon_r4, 1, 22, -4.0F, -0.0637F, -2.9453F, 16, 1, 5, 0.0F, false));

		hexadecagon2 = new ModelRenderer(this);
		hexadecagon2.setRotationPoint(1.0F, 6.8F, -1.5F);
		hexadecagon.addChild(hexadecagon2);
		hexadecagon2.cubeList.add(new ModelBox(hexadecagon2, 0, 35, -9.5F, 3.3467F, 5.0361F, 17, 1, 3, 0.0F, false));

		hexadecagon_r5 = new ModelRenderer(this);
		hexadecagon_r5.setRotationPoint(-1.0F, 2.9954F, 6.3476F);
		hexadecagon2.addChild(hexadecagon_r5);
		setRotationAngle(hexadecagon_r5, -0.3229F, 0.0F, 0.0F);
		hexadecagon_r5.cubeList.add(new ModelBox(hexadecagon_r5, 38, 0, -8.5F, -0.7362F, -0.0779F, 17, 3, 1, 0.0F, false));

		hexadecagon_r6 = new ModelRenderer(this);
		hexadecagon_r6.setRotationPoint(-1.0F, 3.186F, 6.5445F);
		hexadecagon2.addChild(hexadecagon_r6);
		setRotationAngle(hexadecagon_r6, 0.3142F, 0.0F, 0.0F);
		hexadecagon_r6.cubeList.add(new ModelBox(hexadecagon_r6, 38, 14, -8.5F, -0.8343F, -0.7163F, 17, 3, 1, 0.0F, false));

		hexadecagon_r7 = new ModelRenderer(this);
		hexadecagon_r7.setRotationPoint(-1.0F, 2.7466F, 6.4439F);
		hexadecagon2.addChild(hexadecagon_r7);
		setRotationAngle(hexadecagon_r7, 0.9338F, 0.0F, 0.0F);
		hexadecagon_r7.cubeList.add(new ModelBox(hexadecagon_r7, 38, 21, -8.5F, -0.7837F, -1.3627F, 17, 3, 1, 0.0F, false));

		hexadecagon_r8 = new ModelRenderer(this);
		hexadecagon_r8.setRotationPoint(-1.0F, 3.0441F, 6.4737F);
		hexadecagon2.addChild(hexadecagon_r8);
		setRotationAngle(hexadecagon_r8, 0.6021F, 0.0F, 0.0F);
		hexadecagon_r8.cubeList.add(new ModelBox(hexadecagon_r8, 37, 36, -8.5F, 0.1769F, -1.8965F, 17, 1, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		hexadecagon.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}