// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer hexadecagon_r1;
	private final ModelRenderer hexadecagon_r2;
	private final ModelRenderer hexadecagon_r3;
	private final ModelRenderer hexadecagon_r4;
	private final ModelRenderer hexadecagon_r5;
	private final ModelRenderer hexadecagon_r6;
	private final ModelRenderer hexadecagon_r7;
	private final ModelRenderer hexadecagon_r8;
	private final ModelRenderer hexadecagon_r9;
	private final ModelRenderer hexadecagon_r10;
	private final ModelRenderer hexadecagon_r11;
	private final ModelRenderer hexadecagon_r12;
	private final ModelRenderer hexadecagon_r13;
	private final ModelRenderer hexadecagon_r14;
	private final ModelRenderer hexadecagon_r15;
	private final ModelRenderer hexadecagon_r16;

	public custom_model() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		hexadecagon_r1 = new ModelRenderer(this);
		hexadecagon_r1.setRotationPoint(0.0F, -9.0F, 0.0F);
		Head.addChild(hexadecagon_r1);
		setRotationAngle(hexadecagon_r1, 0.0718F, -0.3864F, -0.1886F);
		hexadecagon_r1.cubeList.add(new ModelBox(hexadecagon_r1, 40, 27, -12.0F, -0.5F, -2.3869F, 12, 1, 4, 0.0F, false));

		hexadecagon_r2 = new ModelRenderer(this);
		hexadecagon_r2.setRotationPoint(0.0F, -9.0F, 0.0F);
		Head.addChild(hexadecagon_r2);
		setRotationAngle(hexadecagon_r2, 0.0F, 0.0F, -0.1745F);
		hexadecagon_r2.cubeList.add(new ModelBox(hexadecagon_r2, 40, 32, -12.0F, -0.5F, -2.3869F, 12, 1, 4, 0.0F, false));

		hexadecagon_r3 = new ModelRenderer(this);
		hexadecagon_r3.setRotationPoint(0.0F, -9.0F, 0.0F);
		Head.addChild(hexadecagon_r3);
		setRotationAngle(hexadecagon_r3, -0.0718F, 0.3864F, -0.1886F);
		hexadecagon_r3.cubeList.add(new ModelBox(hexadecagon_r3, 40, 40, -12.0F, -0.5F, -2.3869F, 12, 1, 4, 0.0F, false));

		hexadecagon_r4 = new ModelRenderer(this);
		hexadecagon_r4.setRotationPoint(0.0F, -9.0F, 0.0F);
		Head.addChild(hexadecagon_r4);
		setRotationAngle(hexadecagon_r4, -0.1745F, -0.7854F, 0.0F);
		hexadecagon_r4.cubeList.add(new ModelBox(hexadecagon_r4, 0, 0, -2.3869F, -0.5F, 0.0F, 4, 1, 12, 0.0F, false));

		hexadecagon_r5 = new ModelRenderer(this);
		hexadecagon_r5.setRotationPoint(0.0F, -9.0F, 0.0F);
		Head.addChild(hexadecagon_r5);
		setRotationAngle(hexadecagon_r5, -0.1745F, -0.3927F, 0.0F);
		hexadecagon_r5.cubeList.add(new ModelBox(hexadecagon_r5, 0, 13, -2.3869F, -0.5F, 0.0F, 4, 1, 12, 0.0F, false));

		hexadecagon_r6 = new ModelRenderer(this);
		hexadecagon_r6.setRotationPoint(0.0F, -9.0F, 0.0F);
		Head.addChild(hexadecagon_r6);
		setRotationAngle(hexadecagon_r6, -0.1745F, 0.0F, 0.0F);
		hexadecagon_r6.cubeList.add(new ModelBox(hexadecagon_r6, 20, 1, -2.3869F, -0.5F, 0.0F, 4, 1, 12, 0.0F, false));

		hexadecagon_r7 = new ModelRenderer(this);
		hexadecagon_r7.setRotationPoint(0.0F, -9.0F, 0.0F);
		Head.addChild(hexadecagon_r7);
		setRotationAngle(hexadecagon_r7, -0.1745F, 0.3927F, 0.0F);
		hexadecagon_r7.cubeList.add(new ModelBox(hexadecagon_r7, 20, 14, -2.3869F, -0.5F, 0.0F, 4, 1, 12, 0.0F, false));

		hexadecagon_r8 = new ModelRenderer(this);
		hexadecagon_r8.setRotationPoint(0.0F, -9.0F, 0.0F);
		Head.addChild(hexadecagon_r8);
		setRotationAngle(hexadecagon_r8, 0.1745F, 0.7854F, 0.0F);
		hexadecagon_r8.cubeList.add(new ModelBox(hexadecagon_r8, 0, 26, -2.3869F, -0.5F, -12.0F, 4, 1, 12, 0.0F, false));

		hexadecagon_r9 = new ModelRenderer(this);
		hexadecagon_r9.setRotationPoint(0.0F, -9.0F, 0.0F);
		Head.addChild(hexadecagon_r9);
		setRotationAngle(hexadecagon_r9, -0.0718F, -0.3864F, 0.1886F);
		hexadecagon_r9.cubeList.add(new ModelBox(hexadecagon_r9, 40, 45, 0.0F, -0.5F, -2.3869F, 12, 1, 4, 0.0F, false));

		hexadecagon_r10 = new ModelRenderer(this);
		hexadecagon_r10.setRotationPoint(0.0F, -9.0F, 0.0F);
		Head.addChild(hexadecagon_r10);
		setRotationAngle(hexadecagon_r10, 0.0F, 0.0F, 0.1745F);
		hexadecagon_r10.cubeList.add(new ModelBox(hexadecagon_r10, 48, 50, 0.0F, -0.5F, -2.3869F, 12, 1, 4, 0.0F, false));

		hexadecagon_r11 = new ModelRenderer(this);
		hexadecagon_r11.setRotationPoint(0.0F, -9.0F, 0.0F);
		Head.addChild(hexadecagon_r11);
		setRotationAngle(hexadecagon_r11, 0.0718F, 0.3864F, 0.1886F);
		hexadecagon_r11.cubeList.add(new ModelBox(hexadecagon_r11, 0, 53, 0.0F, -0.5F, -2.3869F, 12, 1, 4, 0.0F, false));

		hexadecagon_r12 = new ModelRenderer(this);
		hexadecagon_r12.setRotationPoint(0.0F, -9.0F, 0.0F);
		Head.addChild(hexadecagon_r12);
		setRotationAngle(hexadecagon_r12, 0.1745F, -0.7854F, 0.0F);
		hexadecagon_r12.cubeList.add(new ModelBox(hexadecagon_r12, 20, 27, -2.3869F, -0.5F, -12.0F, 4, 1, 12, 0.0F, false));

		hexadecagon_r13 = new ModelRenderer(this);
		hexadecagon_r13.setRotationPoint(0.0F, -9.0F, 0.0F);
		Head.addChild(hexadecagon_r13);
		setRotationAngle(hexadecagon_r13, 0.1745F, -0.3927F, 0.0F);
		hexadecagon_r13.cubeList.add(new ModelBox(hexadecagon_r13, 0, 39, -2.3869F, -0.5F, -12.0F, 4, 1, 12, 0.0F, false));

		hexadecagon_r14 = new ModelRenderer(this);
		hexadecagon_r14.setRotationPoint(0.0F, -9.0F, 0.0F);
		Head.addChild(hexadecagon_r14);
		setRotationAngle(hexadecagon_r14, 0.1745F, 0.0F, 0.0F);
		hexadecagon_r14.cubeList.add(new ModelBox(hexadecagon_r14, 40, 0, -2.3869F, -0.5F, -12.0F, 4, 1, 12, 0.0F, false));

		hexadecagon_r15 = new ModelRenderer(this);
		hexadecagon_r15.setRotationPoint(0.0F, -9.0F, 0.0F);
		Head.addChild(hexadecagon_r15);
		setRotationAngle(hexadecagon_r15, 0.1745F, 0.3927F, 0.0F);
		hexadecagon_r15.cubeList.add(new ModelBox(hexadecagon_r15, 40, 13, -2.3869F, -0.5F, -12.0F, 4, 1, 12, 0.0F, false));

		hexadecagon_r16 = new ModelRenderer(this);
		hexadecagon_r16.setRotationPoint(0.0F, -9.0F, 0.0F);
		Head.addChild(hexadecagon_r16);
		setRotationAngle(hexadecagon_r16, -0.1745F, 0.7854F, 0.0F);
		hexadecagon_r16.cubeList.add(new ModelBox(hexadecagon_r16, 20, 40, -2.3869F, -0.5F, 0.0F, 4, 1, 12, 0.0F, false));
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