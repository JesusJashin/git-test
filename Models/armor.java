// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class custom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;
	private final ModelPart tulov;
	private final ModelPart nogi;
	private final ModelPart Right;
	private final ModelPart Left;

	public custom_model(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.tulov = root.getChild("tulov");
		this.nogi = root.getChild("nogi");
		this.Right = root.getChild("Right");
		this.Left = root.getChild("Left");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(32, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition tulov = partdefinition.addOrReplaceChild("tulov", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -22.9F, -2.6F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-3.5F, -19.7F, -2.7F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-3.5F, -20.7F, 1.3F, 7.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-2.5F, -22.0F, 1.2F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-3.0F, -21.5F, 1.2F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-4.0F, -19.2F, -2.7F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(3.1F, -19.2F, -2.7F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-4.1F, -19.2F, -2.7F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-4.0F, -17.7F, -2.8F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-4.0F, -17.7F, 1.3F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(3.4F, -17.8F, -2.8F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-4.4F, -17.8F, -2.8F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-2.4F, -20.3F, -2.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(1.3F, -20.3F, -2.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(2.2F, -23.4F, -2.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(2.2F, -23.4F, -0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-4.2F, -23.4F, -0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-4.2F, -23.4F, -2.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(2.2F, -23.4F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-4.2F, -23.4F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = tulov.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.4F, -1.1F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5263F, -22.1865F, 1.1F, 0.0F, 0.0F, -2.5307F));

		PartDefinition cube_r2 = tulov.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-2.2F, 0.3F, -1.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, -22.9F, 1.6F, 0.0F, 0.0F, -0.6109F));

		PartDefinition nogi = partdefinition.addOrReplaceChild("nogi", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -12.6F, -2.7F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-3.5F, -12.6F, 1.3F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-3.5F, -10.5F, -2.6F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-3.5F, -10.5F, 1.2F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-3.5F, -8.4F, -2.5F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-3.5F, -8.4F, 1.2F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(2.0F, -13.1F, -2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-3.0F, -13.1F, -2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-3.0F, -13.1F, 1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(2.0F, -13.1F, 1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(2.0F, -11.1F, 1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-3.0F, -11.1F, 1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-3.0F, -9.1F, 1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(2.0F, -9.1F, 1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-3.0F, -11.2F, -2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(2.0F, -11.2F, -2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-3.0F, -9.0F, -2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(2.0F, -9.1F, -2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Right = partdefinition.addOrReplaceChild("Right", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -24.5F, -2.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-8.3F, -22.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-8.3F, -20.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r3 = Right.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-6.8512F, -6.4473F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0793F, -21.15F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cube_r4 = Right.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(3.7F, 1.5F, -2.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(1.6F, 1.7F, -2.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.6F, 1.9F, -2.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, -23.5F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Left = partdefinition.addOrReplaceChild("Left", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r5 = Left.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-1.1F, 0.75F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.1F, -1.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.8F, -3.35F, -2.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.05F, -21.15F, 0.0F, 3.1416F, 0.0F, 3.1416F));

		PartDefinition cube_r6 = Left.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-0.2539F, -3.3709F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.05F, -21.15F, 0.0F, 3.1416F, 0.0F, -2.7053F));

		PartDefinition cube_r7 = Left.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 0).addBox(1.35F, 0.3F, -2.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.75F, 0.5F, -2.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-2.95F, 0.7F, -2.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.05F, -21.15F, 0.0F, 3.1416F, 0.0F, 1.5708F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tulov.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		nogi.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Left.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}