

public class Brona extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer RightArm;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer LeftArm;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;

	public Brona() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 24, 11, -3.5F, 1.3F, -2.3F, 7, 2, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 17, 5, -4.0F, 3.5F, -2.4F, 8, 5, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 11, 19, -4.0F, 8.7F, -2.3F, 8, 3, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 24, 14, -3.0F, 11.9F, -2.2F, 6, 3, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 28, 27, -3.0F, 15.1F, -2.2F, 6, 2, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 12, -4.0F, 3.5F, 1.3F, 8, 5, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 13, 0, -4.0F, 8.7F, 1.2F, 8, 3, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 14, 27, -3.0F, 1.6F, 1.3F, 6, 2, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 15, 23, -3.5F, 12.0F, 1.2F, 7, 3, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 26, -3.0F, 2.8F, -2.1F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 7, 24, 2.0F, 2.8F, -2.1F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 24, -3.0F, 7.9F, -2.1F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 20, 2.0F, 7.9F, -2.1F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 18, -2.5F, 11.5F, -2.1F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 17, 11, 1.5F, 11.5F, -2.1F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 13, 8, 1.5F, 14.5F, -2.0F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 13, 6, -2.5F, 14.5F, -2.1F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 8, -2.5F, 11.5F, 1.1F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 6, 1.5F, 11.5F, 1.1F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 2, -3.5F, 8.2F, 1.1F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 2.5F, 8.2F, 1.1F, 1, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 8.0F, -0.05F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.5061F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 18, 3.6745F, -4.9158F, 1.25F, 5, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 3, 4.8745F, -4.9158F, -2.05F, 4, 1, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 8.0F, -0.05F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.5061F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 29, 20, -8.7657F, -4.8675F, -2.05F, 5, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 29, 20, -8.7657F, -4.8675F, 1.25F, 5, 1, 1, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(10.5F, -0.1F, 0.0F);
		bone.addChild(RightArm);
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 6, -6.5F, -0.5F, -2.5F, 4, 1, 5, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-10.5F, 8.1F, -0.05F);
		RightArm.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 18, -7.9F, -8.7F, -2.45F, 3, 1, 5, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-10.5F, 8.1F, -0.05F);
		RightArm.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 7, 25, -0.4172F, -11.738F, -2.45F, 1, 1, 5, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(10.5F, -0.1F, 0.0F);
		bone.addChild(LeftArm);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, -18.5F, -0.5F, -2.5F, 4, 1, 5, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-10.5F, 8.1F, -0.05F);
		LeftArm.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 1.5708F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 13, 13, -7.9F, 7.7F, -2.45F, 3, 1, 5, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-10.5F, 8.1F, -0.05F);
		LeftArm.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 24, -11.7309F, -0.4243F, -2.45F, 1, 1, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}