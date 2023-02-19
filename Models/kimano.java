


public class kimano extends ModelBase {
	private final ModelRenderer kimano;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer cube_r5;
	private final ModelRenderer LeftArm;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer RightArm;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer RightLeg;
	private final ModelRenderer cube_r10;

	public kimano() {
		textureWidth = 64;
		textureHeight = 64;

		kimano = new ModelRenderer(this);
		kimano.setRotationPoint(0.0F, 0.0F, 0.0F);
		kimano.cubeList.add(new ModelBox(kimano, 0, 14, 2.0F, -0.1F, -2.3F, 2, 12, 1, 0.0F, false));
		kimano.cubeList.add(new ModelBox(kimano, 0, 0, -4.0F, -0.1F, 1.3F, 8, 12, 1, 0.0F, false));
		kimano.cubeList.add(new ModelBox(kimano, 28, 37, -4.0F, 8.9F, 0.5F, 8, 3, 2, 0.0F, false));
		kimano.cubeList.add(new ModelBox(kimano, 40, 0, -4.0F, 8.9F, -2.4F, 8, 3, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 10.4F, 1.5F);
		kimano.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -1.5708F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 40, 18, -3.9F, -1.5F, 2.1F, 3, 3, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 42, -2.0F, -1.5F, 2.1F, 3, 3, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 47, -2.0F, -1.5F, -4.1F, 3, 3, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 48, 5, -3.9F, -1.5F, -4.1F, 3, 3, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.1F, 5.4F, -1.7F);
		kimano.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.5934F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 28, -2.3F, 0.1F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 28, -1.8F, -0.9F, -0.5F, 1, 2, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 28, -0.8F, -2.3F, -0.5F, 1, 3, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 28, 0.2F, -4.2F, -0.5F, 1, 5, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.5229F, 4.6981F, -1.7F);
		kimano.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.6109F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 28, -1.4F, -5.5F, -0.5F, 2, 11, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.1F, 5.9F, -1.7F);
		kimano.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.6109F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 14, 1.4F, -1.0F, -0.6F, 2, 4, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 14, 0.0F, -4.0F, -0.6F, 2, 8, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 14, -2.0F, -6.0F, -0.6F, 2, 11, 1, 0.0F, false));

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 20, 12, -1.9F, -0.1F, -2.2F, 4, 10, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 20, 0, -1.9F, -0.1F, 1.3F, 4, 10, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-7.6F, -6.1F, 0.2F);
		LeftLeg.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 1.5708F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 41, -1.5F, 5.0F, 8.7F, 3, 11, 1, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 20, 24, -1.8F, -2.1F, -2.2F, 5, 11, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 34, 24, -1.8F, -2.1F, 1.3F, 5, 11, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-10.7F, 3.9F, 0.2F);
		LeftArm.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 1.5708F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 40, 5, -1.5F, -6.0F, 12.9F, 3, 11, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-12.7F, -4.2F, 0.2F);
		LeftArm.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 1.5708F, 1.5708F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 42, -1.8F, -15.9F, 2.1F, 4, 5, 1, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 28, -3.2F, -2.1F, -2.2F, 5, 11, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 14, 37, -3.2F, -2.1F, 1.3F, 5, 11, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.7F, 3.9F, 0.2F);
		RightArm.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 1.5708F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 36, 42, -1.5F, -6.0F, -2.5F, 3, 11, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-2.7F, -4.2F, 0.2F);
		RightArm.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 1.5708F, 1.5708F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 36, 42, -1.8F, -4.5F, 2.1F, 4, 5, 1, 0.0F, false));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 20, 0, -2.1F, -0.1F, 1.3F, 4, 10, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 20, 12, -2.1F, -0.1F, -2.2F, 4, 10, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-3.8F, -6.1F, 0.2F);
		RightLeg.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 1.5708F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 42, -1.5F, 5.0F, 1.7F, 3, 11, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		kimano.render(f5);
		LeftLeg.render(f5);
		LeftArm.render(f5);
		RightArm.render(f5);
		RightLeg.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}