


public class madara extends ModelBase {
	private final ModelRenderer madara;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;

	public madara() {
		textureWidth = 128;
		textureHeight = 128;

		madara = new ModelRenderer(this);
		madara.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.075F, -15.45F, -0.25F);
		madara.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 37, -3.425F, 7.05F, -2.25F, 4, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 38, -3.425F, 4.95F, -2.35F, 4, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 33, 38, -3.425F, 2.85F, -2.45F, 4, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 97, 2.075F, 6.35F, 1.35F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 99, 2.075F, 4.25F, -1.95F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 110, -2.925F, 6.35F, 1.35F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 105, -2.925F, 4.35F, 1.35F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 112, 2.075F, 4.35F, 1.35F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 115, 2.075F, 2.35F, 1.35F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 116, -2.925F, 2.35F, 1.35F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 7, 32, -3.425F, 7.05F, 1.45F, 7, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 23, 33, -3.425F, 4.95F, 1.45F, 7, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 23, -3.425F, 2.85F, 1.55F, 7, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 27, 93, -2.925F, 6.45F, -1.95F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 39, -0.425F, 7.05F, -2.25F, 4, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 117, 2.075F, 6.35F, -1.95F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 118, -2.925F, 4.25F, -1.95F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 40, -0.425F, 4.95F, -2.35F, 4, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 29, 113, -2.925F, 2.35F, -1.95F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 120, 2.075F, 2.35F, -1.95F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 41, -0.425F, 2.85F, -2.45F, 4, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 7, 112, -4.125F, -7.95F, -1.95F, 2, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 108, 2.275F, -7.95F, -1.95F, 2, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 3, -2.925F, -6.05F, 1.45F, 6, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 36, -2.425F, -6.55F, 1.45F, 5, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 29, 12, -3.425F, -5.25F, 1.55F, 7, 3, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 31, -4.025F, -3.75F, -2.45F, 1, 2, 5, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 35, 1, 3.175F, -3.75F, -2.45F, 1, 2, 5, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 14, -3.925F, -2.25F, 1.55F, 8, 5, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 0, -3.925F, -3.75F, -2.45F, 8, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 15, -4.325F, -2.35F, -2.55F, 1, 5, 5, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 20, 3.475F, -2.35F, -2.55F, 1, 5, 5, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 6, -3.925F, -2.25F, -2.55F, 8, 5, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 122, 1.375F, -4.85F, -2.05F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 119, -2.325F, -4.85F, -2.05F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 26, -3.425F, -4.25F, -2.45F, 7, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 35, 8, -2.925F, -7.45F, -2.35F, 6, 3, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-5.881F, -21.15F, 0.55F);
		madara.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -2.5307F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 125, -3.5535F, 1.6732F, -0.45F, 4, 1, 2, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(3.495F, -22.13F, 1.1F);
		madara.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.6109F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 36, 106, -2.0F, -0.5F, -1.0F, 4, 1, 2, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(7.05F, -21.15F, 0.0F);
		madara.addChild(cube_r4);
		setRotationAngle(cube_r4, -3.1416F, 0.0F, -3.1416F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -0.8F, -3.35F, -2.5F, 4, 2, 5, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 90, -1.1F, -1.45F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 92, -1.1F, 0.75F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(7.05F, -21.15F, 0.0F);
		madara.addChild(cube_r5);
		setRotationAngle(cube_r5, -3.1416F, 0.0F, 1.5708F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 12, -2.95F, 0.7F, -2.5F, 2, 1, 5, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 20, -0.75F, 0.5F, -2.5F, 2, 1, 5, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 7, 25, 1.35F, 0.3F, -2.5F, 2, 1, 5, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(7.05F, -21.15F, 0.0F);
		madara.addChild(cube_r6);
		setRotationAngle(cube_r6, -3.1416F, 0.0F, -2.7053F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 29, 16, -0.2539F, -3.3709F, -2.5F, 1, 2, 5, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-7.2F, -21.15F, 0.0F);
		madara.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 97, -1.1F, 0.75F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 99, -1.1F, -1.45F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 7, -0.8F, -3.35F, -2.5F, 4, 2, 5, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-7.2F, -21.15F, 0.0F);
		madara.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 1.5708F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 26, 0, 1.35F, 0.3F, -2.5F, 2, 1, 5, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 16, 26, -0.75F, 0.5F, -2.5F, 2, 1, 5, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 25, 27, -2.95F, 0.7F, -2.5F, 2, 1, 5, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-7.2F, -21.15F, 0.0F);
		madara.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.4363F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 30, -0.2539F, -3.3709F, -2.5F, 1, 2, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		madara.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}