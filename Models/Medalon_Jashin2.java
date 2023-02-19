


public class Medalon_Jashin2 extends ModelBase {
	private final ModelRenderer hexadecagon;
	private final ModelRenderer hexadecagon_r1;
	private final ModelRenderer hexadecagon_r2;
	private final ModelRenderer hexadecagon_r3;
	private final ModelRenderer hexadecagon_r4;
	private final ModelRenderer hexadecagon_r5;
	private final ModelRenderer hexadecagon_r6;
	private final ModelRenderer hexadecagon_r7;
	private final ModelRenderer bone;

	public Medalon_Jashin2() {
		textureWidth = 16;
		textureHeight = 16;

		hexadecagon = new ModelRenderer(this);
		hexadecagon.setRotationPoint(0.1F, -0.2F, 0.0F);
		

		hexadecagon_r1 = new ModelRenderer(this);
		hexadecagon_r1.setRotationPoint(-0.1F, 21.2F, -2.1F);
		hexadecagon.addChild(hexadecagon_r1);
		setRotationAngle(hexadecagon_r1, 1.1781F, 1.5708F, -1.5708F);
		hexadecagon_r1.cubeList.add(new ModelBox(hexadecagon_r1, 0, 0, -0.1F, 0.85F, -0.2089F, 0, 0, 0, 0.0F, false));
		hexadecagon_r1.cubeList.add(new ModelBox(hexadecagon_r1, 0, 0, -0.1F, -1.05F, -0.2089F, 0, 0, 0, 0.0F, false));
		hexadecagon_r1.cubeList.add(new ModelBox(hexadecagon_r1, 0, 0, -0.1F, -0.2089F, 0.85F, 0, 0, 0, 0.0F, false));
		hexadecagon_r1.cubeList.add(new ModelBox(hexadecagon_r1, 0, 0, -0.1F, -0.2089F, -1.05F, 0, 0, 0, 0.0F, false));

		hexadecagon_r2 = new ModelRenderer(this);
		hexadecagon_r2.setRotationPoint(-0.1F, 21.2F, -2.1F);
		hexadecagon.addChild(hexadecagon_r2);
		setRotationAngle(hexadecagon_r2, 1.5708F, 1.5708F, -1.5708F);
		hexadecagon_r2.cubeList.add(new ModelBox(hexadecagon_r2, 0, 0, -0.1F, 0.85F, -0.2089F, 0, 0, 0, 0.0F, false));
		hexadecagon_r2.cubeList.add(new ModelBox(hexadecagon_r2, 0, 0, -0.1F, -0.55F, -0.8089F, 0, 0, 1, 0.0F, false));
		hexadecagon_r2.cubeList.add(new ModelBox(hexadecagon_r2, 0, 0, -0.1F, -1.05F, -0.2089F, 0, 0, 0, 0.0F, false));
		hexadecagon_r2.cubeList.add(new ModelBox(hexadecagon_r2, 0, 0, -0.1F, -0.2089F, 0.85F, 0, 0, 0, 0.0F, false));
		hexadecagon_r2.cubeList.add(new ModelBox(hexadecagon_r2, 0, 0, -0.1F, -0.2089F, -1.05F, 0, 0, 0, 0.0F, false));

		hexadecagon_r3 = new ModelRenderer(this);
		hexadecagon_r3.setRotationPoint(-0.1F, 21.2F, -2.1F);
		hexadecagon.addChild(hexadecagon_r3);
		setRotationAngle(hexadecagon_r3, 1.9635F, 1.5708F, -1.5708F);
		hexadecagon_r3.cubeList.add(new ModelBox(hexadecagon_r3, 0, 0, -0.1F, 0.85F, -0.2089F, 0, 0, 0, 0.0F, false));
		hexadecagon_r3.cubeList.add(new ModelBox(hexadecagon_r3, 0, 0, -0.1F, -1.05F, -0.2089F, 0, 0, 0, 0.0F, false));
		hexadecagon_r3.cubeList.add(new ModelBox(hexadecagon_r3, 0, 0, -0.1F, -0.2089F, 0.85F, 0, 0, 0, 0.0F, false));
		hexadecagon_r3.cubeList.add(new ModelBox(hexadecagon_r3, 0, 0, -0.1F, -0.2089F, -1.05F, 0, 0, 0, 0.0F, false));

		hexadecagon_r4 = new ModelRenderer(this);
		hexadecagon_r4.setRotationPoint(-0.1F, 21.2F, -2.1F);
		hexadecagon.addChild(hexadecagon_r4);
		setRotationAngle(hexadecagon_r4, 0.7854F, 1.5708F, -1.5708F);
		hexadecagon_r4.cubeList.add(new ModelBox(hexadecagon_r4, 0, 0, -0.1F, -0.2089F, 0.85F, 0, 0, 0, 0.0F, false));
		hexadecagon_r4.cubeList.add(new ModelBox(hexadecagon_r4, 0, 0, -0.1F, -0.2089F, -1.05F, 0, 0, 0, 0.0F, false));

		hexadecagon_r5 = new ModelRenderer(this);
		hexadecagon_r5.setRotationPoint(-0.1F, 21.2F, -2.1F);
		hexadecagon.addChild(hexadecagon_r5);
		setRotationAngle(hexadecagon_r5, 2.138F, 1.5708F, -1.5708F);
		hexadecagon_r5.cubeList.add(new ModelBox(hexadecagon_r5, 0, 0, -0.1F, -0.8089F, 0.35F, 0, 1, 0, 0.0F, false));

		hexadecagon_r6 = new ModelRenderer(this);
		hexadecagon_r6.setRotationPoint(-0.1F, 21.2F, -2.1F);
		hexadecagon.addChild(hexadecagon_r6);
		setRotationAngle(hexadecagon_r6, 2.3562F, 1.5708F, -1.5708F);
		hexadecagon_r6.cubeList.add(new ModelBox(hexadecagon_r6, 0, 0, -0.1F, -0.2089F, 0.85F, 0, 0, 0, 0.0F, false));
		hexadecagon_r6.cubeList.add(new ModelBox(hexadecagon_r6, 0, 0, -0.1F, -0.2089F, -1.05F, 0, 0, 0, 0.0F, false));

		hexadecagon_r7 = new ModelRenderer(this);
		hexadecagon_r7.setRotationPoint(-0.1F, 21.2F, -2.1F);
		hexadecagon.addChild(hexadecagon_r7);
		setRotationAngle(hexadecagon_r7, 1.0385F, 1.5708F, -1.5708F);
		hexadecagon_r7.cubeList.add(new ModelBox(hexadecagon_r7, 0, 0, -0.1F, -0.8089F, -0.55F, 0, 1, 0, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -0.1F, 22.0F, -2.1F, 0, 0, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.0F, 22.2F, -2.1F, 0, 0, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.2F, 22.3F, -2.1F, 0, 0, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.4F, 22.4F, -2.1F, 0, 0, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.5F, 22.6F, -2.1F, 0, 0, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.5F, 22.8F, -2.1F, 0, 0, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.6F, 23.1F, -2.1F, 0, 0, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.7F, 23.4F, -2.1F, 0, 0, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.8F, 23.6F, -2.1F, 0, 0, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.9F, 23.8F, -2.1F, 0, 0, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -0.3F, 22.1F, -2.1F, 0, 0, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -0.5F, 22.2F, -2.1F, 0, 0, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -0.6F, 22.4F, -2.1F, 0, 0, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -0.7F, 22.6F, -2.1F, 0, 0, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -0.8F, 22.8F, -2.1F, 0, 0, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, 23.3F, -2.1F, 0, 0, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.1F, 23.6F, -2.1F, 0, 0, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.2F, 23.8F, -2.1F, 0, 0, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -0.9F, 23.1F, -2.1F, 0, 0, 0, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		hexadecagon.render(f5);
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}