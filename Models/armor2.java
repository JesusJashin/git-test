// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class armor2 extends ModelBase {
	private final ModelRenderer Body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer nogi;
	private final ModelRenderer RightArm;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer LeftArm;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;

	public armor2() {
		textureWidth = 128;
		textureHeight = 128;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 35, 8, -3.0F, 19.9F, -2.6F, 6, 3, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 34, 26, -3.5F, 17.7F, -2.7F, 7, 2, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 29, 12, -3.5F, 17.7F, 1.3F, 7, 3, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 22, 36, -2.5F, 20.0F, 1.2F, 5, 2, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 13, 3, -3.0F, 20.5F, 1.2F, 6, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 13, 0, -4.0F, 17.2F, -2.7F, 8, 2, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 35, 1, 3.1F, 17.2F, -2.7F, 1, 2, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 34, 31, -4.1F, 17.2F, -2.7F, 1, 2, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 17, 6, -4.0F, 12.7F, -2.8F, 8, 5, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 14, -4.0F, 12.7F, 1.3F, 8, 5, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 20, 3.4F, 12.8F, -2.8F, 1, 5, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 13, 15, -4.4F, 12.8F, -2.8F, 1, 5, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 25, 28, -2.4F, 19.3F, -2.3F, 1, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 28, 18, 1.3F, 19.3F, -2.3F, 1, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 7, 110, 2.2F, 22.4F, -2.2F, 2, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 17, 103, -4.2F, 22.4F, -2.2F, 2, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.5263F, 22.1865F, 1.1F);
		Body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -2.5307F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 125, -1.4F, 0.1F, -1.0F, 4, 1, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(3.2F, 22.9F, 1.6F);
		Body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.6109F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 36, 106, -2.2F, -1.3F, -1.5F, 4, 1, 2, 0.0F, false));

		nogi = new ModelRenderer(this);
		nogi.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(nogi);
		nogi.cubeList.add(new ModelBox(nogi, 10, 41, -0.5F, 10.6F, -2.7F, 4, 2, 1, 0.0F, false));
		nogi.cubeList.add(new ModelBox(nogi, 33, 38, -3.5F, 10.6F, -2.7F, 4, 2, 1, 0.0F, false));
		nogi.cubeList.add(new ModelBox(nogi, 34, 23, -3.5F, 10.6F, 1.3F, 7, 2, 1, 0.0F, false));
		nogi.cubeList.add(new ModelBox(nogi, 0, 40, -0.5F, 8.5F, -2.6F, 4, 2, 1, 0.0F, false));
		nogi.cubeList.add(new ModelBox(nogi, 10, 38, -3.5F, 8.5F, -2.6F, 4, 2, 1, 0.0F, false));
		nogi.cubeList.add(new ModelBox(nogi, 23, 33, -3.5F, 8.5F, 1.2F, 7, 2, 1, 0.0F, false));
		nogi.cubeList.add(new ModelBox(nogi, 20, 39, -0.5F, 6.4F, -2.5F, 4, 2, 1, 0.0F, false));
		nogi.cubeList.add(new ModelBox(nogi, 0, 37, -3.5F, 6.4F, -2.5F, 4, 2, 1, 0.0F, false));
		nogi.cubeList.add(new ModelBox(nogi, 7, 32, -3.5F, 6.4F, 1.2F, 7, 2, 1, 0.0F, false));
		nogi.cubeList.add(new ModelBox(nogi, 16, 117, 2.0F, 12.1F, -2.2F, 1, 1, 1, 0.0F, false));
		nogi.cubeList.add(new ModelBox(nogi, 27, 93, -3.0F, 12.1F, -2.2F, 1, 1, 1, 0.0F, false));
		nogi.cubeList.add(new ModelBox(nogi, 7, 112, -3.0F, 12.1F, 1.1F, 1, 1, 1, 0.0F, false));
		nogi.cubeList.add(new ModelBox(nogi, 0, 112, 2.0F, 12.1F, 1.1F, 1, 1, 1, 0.0F, false));
		nogi.cubeList.add(new ModelBox(nogi, 20, 108, 2.0F, 10.1F, 1.1F, 1, 1, 1, 0.0F, false));
		nogi.cubeList.add(new ModelBox(nogi, 20, 105, -3.0F, 10.1F, 1.1F, 1, 1, 1, 0.0F, false));
		nogi.cubeList.add(new ModelBox(nogi, 0, 110, -3.0F, 8.1F, 1.1F, 1, 1, 1, 0.0F, false));
		nogi.cubeList.add(new ModelBox(nogi, 13, 97, 2.0F, 8.1F, 1.1F, 1, 1, 1, 0.0F, false));
		nogi.cubeList.add(new ModelBox(nogi, 25, 116, -3.0F, 10.2F, -2.2F, 1, 1, 1, 0.0F, false));
		nogi.cubeList.add(new ModelBox(nogi, 13, 99, 2.0F, 10.2F, -2.2F, 1, 1, 1, 0.0F, false));
		nogi.cubeList.add(new ModelBox(nogi, 24, 108, -3.0F, 8.0F, -2.2F, 1, 1, 1, 0.0F, false));
		nogi.cubeList.add(new ModelBox(nogi, 16, 115, 2.0F, 8.1F, -2.2F, 1, 1, 1, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(0.0F, 0.0F, 0.0F);
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 7, -8.0F, 22.5F, -2.5F, 4, 2, 5, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 99, -8.3F, 21.6F, -0.5F, 1, 1, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 97, -8.3F, 19.4F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0793F, 21.15F, 0.0F);
		RightArm.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.4363F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 30, -6.8512F, 4.4473F, -2.5F, 1, 2, 5, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-6.0F, 23.5F, 0.0F);
		RightArm.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 1.5708F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 0, 3.7F, -2.5F, -2.5F, 2, 1, 5, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 26, 1.6F, -2.7F, -2.5F, 2, 1, 5, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 25, 27, -0.6F, -2.9F, -2.5F, 2, 1, 5, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(7.05F, 21.15F, 0.0F);
		LeftArm.addChild(cube_r5);
		setRotationAngle(cube_r5, 3.1416F, 0.0F, 3.1416F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 92, -1.1F, -1.75F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 90, -1.1F, 0.45F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -0.8F, 1.35F, -2.5F, 4, 2, 5, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(7.05F, 21.15F, 0.0F);
		LeftArm.addChild(cube_r6);
		setRotationAngle(cube_r6, 3.1416F, 0.0F, -2.7053F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 29, 16, -0.2539F, 1.3709F, -2.5F, 1, 2, 5, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(7.05F, 21.15F, 0.0F);
		LeftArm.addChild(cube_r7);
		setRotationAngle(cube_r7, 3.1416F, 0.0F, 1.5708F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 7, 25, 1.35F, -1.3F, -2.5F, 2, 1, 5, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 20, -0.75F, -1.5F, -2.5F, 2, 1, 5, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 12, -2.95F, -1.7F, -2.5F, 2, 1, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Body.render(f5);
		RightArm.render(f5);
		LeftArm.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}