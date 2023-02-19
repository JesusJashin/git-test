


public class bs extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer RightArm;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer LeftArm;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer hexadecagon;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer hexadecagon_r1;
	private final ModelRenderer hexadecagon_r2;
	private final ModelRenderer hexadecagon_r3;
	private final ModelRenderer hexadecagon_r4;
	private final ModelRenderer hexadecagon2;
	private final ModelRenderer hexadecagon_r5;
	private final ModelRenderer hexadecagon_r6;
	private final ModelRenderer hexadecagon_r7;
	private final ModelRenderer hexadecagon_r8;

	public bs() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 24, 71, -3.5F, 1.3F, -2.3F, 7, 2, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 17, 65, -4.0F, 3.5F, -2.4F, 8, 5, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 11, 79, -4.0F, 8.7F, -2.3F, 8, 3, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 24, 74, -3.0F, 11.9F, -2.2F, 6, 3, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 28, 87, -3.0F, 15.1F, -2.2F, 6, 2, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 72, -4.0F, 3.5F, 1.3F, 8, 5, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 13, 60, -4.0F, 8.7F, 1.2F, 8, 3, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 14, 87, -3.0F, 1.6F, 1.3F, 6, 2, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 15, 83, -3.5F, 12.0F, 1.2F, 7, 3, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 86, -3.0F, 2.8F, -2.1F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 7, 84, 2.0F, 2.8F, -2.1F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 84, -3.0F, 7.9F, -2.1F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 80, 2.0F, 7.9F, -2.1F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 78, -2.5F, 11.5F, -2.1F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 17, 71, 1.5F, 11.5F, -2.1F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 13, 68, 1.5F, 14.5F, -2.0F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 13, 66, -2.5F, 14.5F, -2.1F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 68, -2.5F, 11.5F, 1.1F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 66, 1.5F, 11.5F, 1.1F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 62, -3.5F, 8.2F, 1.1F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 60, 2.5F, 8.2F, 1.1F, 1, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 8.0F, -0.05F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.5061F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 78, 3.6745F, -4.9158F, 1.25F, 5, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 63, 4.8745F, -4.9158F, -2.05F, 4, 1, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 8.0F, -0.05F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.5061F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 29, 80, -8.7657F, -4.8675F, -2.05F, 5, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 29, 80, -8.7657F, -4.8675F, 1.25F, 5, 1, 1, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(10.5F, -0.1F, 0.0F);
		bone.addChild(RightArm);
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 66, -6.5F, -0.5F, -2.5F, 4, 1, 5, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-10.5F, 8.1F, -0.05F);
		RightArm.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 78, -7.9F, -8.7F, -2.45F, 3, 1, 5, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-10.5F, 8.1F, -0.05F);
		RightArm.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 7, 85, -0.4172F, -11.738F, -2.45F, 1, 1, 5, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(10.5F, -0.1F, 0.0F);
		bone.addChild(LeftArm);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 60, -18.5F, -0.5F, -2.5F, 4, 1, 5, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-10.5F, 8.1F, -0.05F);
		LeftArm.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 1.5708F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 13, 73, -7.9F, 7.7F, -2.45F, 3, 1, 5, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-10.5F, 8.1F, -0.05F);
		LeftArm.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 84, -11.7309F, -0.4243F, -2.45F, 1, 1, 5, 0.0F, false));

		hexadecagon = new ModelRenderer(this);
		hexadecagon.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(hexadecagon);
		hexadecagon.cubeList.add(new ModelBox(hexadecagon, 1, 15, -8.0F, 10.1137F, 2.4896F, 16, 1, 5, 0.0F, false));
		hexadecagon.cubeList.add(new ModelBox(hexadecagon, 34, 40, -8.0F, 8.1F, 4.5033F, 16, 5, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-4.3163F, 0.1313F, 0.0F);
		hexadecagon.addChild(cube_r7);
		setRotationAngle(cube_r7, 1.5708F, 0.0F, -1.5708F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 14, -12.0F, -2.5F, -1.3F, 1, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -12.0F, -2.5F, -0.5F, 2, 5, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.6837F, 4.4313F, 2.0F);
		hexadecagon.addChild(cube_r8);
		setRotationAngle(cube_r8, 1.5708F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 7, 1.0F, -4.5F, 3.8F, 2, 5, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.6837F, 4.4313F, 2.0F);
		hexadecagon.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.5236F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 46, -1.5F, -4.7F, -4.6F, 2, 13, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 6, 46, -1.5F, -4.7F, -0.5F, 2, 13, 1, 0.0F, false));

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
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}