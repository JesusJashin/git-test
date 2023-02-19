


public class MJ extends ModelBase {
	private final ModelRenderer Medalon;
	private final ModelRenderer hexadecagon_r1;
	private final ModelRenderer hexadecagon_r2;
	private final ModelRenderer hexadecagon_r3;
	private final ModelRenderer hexadecagon_r4;
	private final ModelRenderer hexadecagon_r5;
	private final ModelRenderer hexadecagon_r6;
	private final ModelRenderer hexadecagon_r7;

	public MJ() {
		textureWidth = 16;
		textureHeight = 16;

		Medalon = new ModelRenderer(this);
		Medalon.setRotationPoint(0.0F, 24.0F, 0.0F);
		Medalon.cubeList.add(new ModelBox(Medalon, 0, 0, -0.1F, -22.2F, -2.1F, 0, 0, 1, 0.0F, false));
		Medalon.cubeList.add(new ModelBox(Medalon, 0, 0, 0.0F, -22.4F, -2.1F, 0, 0, 1, 0.0F, false));
		Medalon.cubeList.add(new ModelBox(Medalon, 0, 0, -0.3F, -22.3F, -2.1F, 0, 0, 1, 0.0F, false));
		Medalon.cubeList.add(new ModelBox(Medalon, 0, 0, 0.2F, -22.5F, -2.1F, 0, 0, 1, 0.0F, false));
		Medalon.cubeList.add(new ModelBox(Medalon, 0, 0, -0.5F, -22.4F, -2.1F, 0, 0, 1, 0.0F, false));
		Medalon.cubeList.add(new ModelBox(Medalon, 0, 0, 0.4F, -22.6F, -2.1F, 0, 0, 1, 0.0F, false));
		Medalon.cubeList.add(new ModelBox(Medalon, 0, 0, -0.6F, -22.6F, -2.1F, 0, 0, 1, 0.0F, false));
		Medalon.cubeList.add(new ModelBox(Medalon, 0, 0, 0.5F, -22.8F, -2.1F, 0, 0, 1, 0.0F, false));
		Medalon.cubeList.add(new ModelBox(Medalon, 0, 0, -0.7F, -22.8F, -2.1F, 0, 0, 1, 0.0F, false));
		Medalon.cubeList.add(new ModelBox(Medalon, 0, 0, -0.8F, -23.1F, -2.1F, 0, 0, 1, 0.0F, false));
		Medalon.cubeList.add(new ModelBox(Medalon, 0, 0, 0.5F, -23.1F, -2.1F, 0, 0, 1, 0.0F, false));
		Medalon.cubeList.add(new ModelBox(Medalon, 0, 0, -0.9F, -23.3F, -2.1F, 0, 0, 1, 0.0F, false));
		Medalon.cubeList.add(new ModelBox(Medalon, 0, 0, 0.6F, -23.4F, -2.1F, 0, 0, 1, 0.0F, false));
		Medalon.cubeList.add(new ModelBox(Medalon, 0, 0, -1.0F, -23.6F, -2.1F, 0, 0, 1, 0.0F, false));
		Medalon.cubeList.add(new ModelBox(Medalon, 0, 0, 0.7F, -23.6F, -2.1F, 0, 0, 1, 0.0F, false));
		Medalon.cubeList.add(new ModelBox(Medalon, 0, 0, -1.1F, -23.8F, -2.1F, 0, 0, 1, 0.0F, false));
		Medalon.cubeList.add(new ModelBox(Medalon, 0, 0, 0.8F, -23.8F, -2.1F, 0, 0, 1, 0.0F, false));
		Medalon.cubeList.add(new ModelBox(Medalon, 0, 0, 0.9F, -24.0F, -2.1F, 0, 0, 1, 0.0F, false));
		Medalon.cubeList.add(new ModelBox(Medalon, 0, 0, -1.2F, -24.0F, -2.1F, 0, 0, 1, 0.0F, false));

		hexadecagon_r1 = new ModelRenderer(this);
		hexadecagon_r1.setRotationPoint(0.0F, -21.0F, -2.1F);
		Medalon.addChild(hexadecagon_r1);
		setRotationAngle(hexadecagon_r1, 1.5708F, 1.5708F, -1.5708F);
		hexadecagon_r1.cubeList.add(new ModelBox(hexadecagon_r1, 0, 0, -0.9F, 0.35F, -0.8089F, 1, 0, 1, 0.0F, false));
		hexadecagon_r1.cubeList.add(new ModelBox(hexadecagon_r1, 0, 0, -0.9F, -1.05F, -0.2089F, 1, 0, 0, 0.0F, false));
		hexadecagon_r1.cubeList.add(new ModelBox(hexadecagon_r1, 0, 0, -0.9F, 0.85F, -0.2089F, 1, 0, 0, 0.0F, false));
		hexadecagon_r1.cubeList.add(new ModelBox(hexadecagon_r1, 0, 0, -0.9F, -0.2089F, 0.85F, 1, 0, 0, 0.0F, false));
		hexadecagon_r1.cubeList.add(new ModelBox(hexadecagon_r1, 0, 0, -0.9F, -0.2089F, -1.05F, 1, 0, 0, 0.0F, false));

		hexadecagon_r2 = new ModelRenderer(this);
		hexadecagon_r2.setRotationPoint(0.0F, -21.0F, -2.1F);
		Medalon.addChild(hexadecagon_r2);
		setRotationAngle(hexadecagon_r2, 1.0385F, 1.5708F, -1.5708F);
		hexadecagon_r2.cubeList.add(new ModelBox(hexadecagon_r2, 0, 0, -0.9F, -0.8089F, -0.55F, 1, 1, 0, 0.0F, false));

		hexadecagon_r3 = new ModelRenderer(this);
		hexadecagon_r3.setRotationPoint(0.0F, -21.0F, -2.1F);
		Medalon.addChild(hexadecagon_r3);
		setRotationAngle(hexadecagon_r3, 2.138F, 1.5708F, -1.5708F);
		hexadecagon_r3.cubeList.add(new ModelBox(hexadecagon_r3, 0, 0, -0.9F, -0.8089F, 0.35F, 1, 1, 0, 0.0F, false));

		hexadecagon_r4 = new ModelRenderer(this);
		hexadecagon_r4.setRotationPoint(0.0F, -21.0F, -2.1F);
		Medalon.addChild(hexadecagon_r4);
		setRotationAngle(hexadecagon_r4, 1.1781F, 1.5708F, -1.5708F);
		hexadecagon_r4.cubeList.add(new ModelBox(hexadecagon_r4, 0, 0, -0.9F, -1.05F, -0.2089F, 1, 0, 0, 0.0F, false));
		hexadecagon_r4.cubeList.add(new ModelBox(hexadecagon_r4, 0, 0, -0.9F, 0.85F, -0.2089F, 1, 0, 0, 0.0F, false));
		hexadecagon_r4.cubeList.add(new ModelBox(hexadecagon_r4, 0, 0, -0.9F, -0.2089F, 0.85F, 1, 0, 0, 0.0F, false));
		hexadecagon_r4.cubeList.add(new ModelBox(hexadecagon_r4, 0, 0, -0.9F, -0.2089F, -1.05F, 1, 0, 0, 0.0F, false));

		hexadecagon_r5 = new ModelRenderer(this);
		hexadecagon_r5.setRotationPoint(0.0F, -21.0F, -2.1F);
		Medalon.addChild(hexadecagon_r5);
		setRotationAngle(hexadecagon_r5, 1.9635F, 1.5708F, -1.5708F);
		hexadecagon_r5.cubeList.add(new ModelBox(hexadecagon_r5, 0, 0, -0.9F, -1.05F, -0.2089F, 1, 0, 0, 0.0F, false));
		hexadecagon_r5.cubeList.add(new ModelBox(hexadecagon_r5, 0, 0, -0.9F, 0.85F, -0.2089F, 1, 0, 0, 0.0F, false));
		hexadecagon_r5.cubeList.add(new ModelBox(hexadecagon_r5, 0, 0, -0.9F, -0.2089F, 0.85F, 1, 0, 0, 0.0F, false));
		hexadecagon_r5.cubeList.add(new ModelBox(hexadecagon_r5, 0, 0, -0.9F, -0.2089F, -1.05F, 1, 0, 0, 0.0F, false));

		hexadecagon_r6 = new ModelRenderer(this);
		hexadecagon_r6.setRotationPoint(0.0F, -21.0F, -2.1F);
		Medalon.addChild(hexadecagon_r6);
		setRotationAngle(hexadecagon_r6, 0.7854F, 1.5708F, -1.5708F);
		hexadecagon_r6.cubeList.add(new ModelBox(hexadecagon_r6, 0, 0, -0.9F, -0.2089F, 0.85F, 1, 0, 0, 0.0F, false));
		hexadecagon_r6.cubeList.add(new ModelBox(hexadecagon_r6, 0, 0, -0.9F, -0.2089F, -1.05F, 1, 0, 0, 0.0F, false));

		hexadecagon_r7 = new ModelRenderer(this);
		hexadecagon_r7.setRotationPoint(0.0F, -21.0F, -2.1F);
		Medalon.addChild(hexadecagon_r7);
		setRotationAngle(hexadecagon_r7, 2.3562F, 1.5708F, -1.5708F);
		hexadecagon_r7.cubeList.add(new ModelBox(hexadecagon_r7, 0, 0, -0.9F, -0.2089F, 0.85F, 1, 0, 0, 0.0F, false));
		hexadecagon_r7.cubeList.add(new ModelBox(hexadecagon_r7, 0, 0, -0.9F, -0.2089F, -1.05F, 1, 0, 0, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Medalon.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}