

public class scrollleg<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "scrollleg"), "main");
	private final ModelPart hexadecagon;

	public scrollleg(ModelPart root) {
		this.hexadecagon = root.getChild("hexadecagon");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hexadecagon = partdefinition.addOrReplaceChild("hexadecagon", CubeListBuilder.create().texOffs(1, 15).addBox(-8.0F, -13.8863F, 2.4896F, 16.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(34, 40).addBox(-8.0F, -15.9F, 4.5033F, 16.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -14.0F, 4.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = hexadecagon.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 14).addBox(-12.0F, -2.5F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-12.0F, -2.5F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.3163F, -23.8687F, 0.0F, 1.5708F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = hexadecagon.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 7).addBox(1.0F, -4.5F, 3.8F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6837F, -19.5687F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hexadecagon.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 46).addBox(-1.5F, -4.7F, -4.5F, 2.0F, 13.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(6, 46).addBox(-1.5F, -4.7F, -0.5F, 2.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6837F, -19.5687F, 2.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition hexadecagon_r1 = hexadecagon.addOrReplaceChild("hexadecagon_r1", CubeListBuilder.create().texOffs(0, 39).addBox(-4.0F, -1.948F, -0.2621F, 16.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 8).addBox(-4.0F, 0.0657F, -2.2758F, 16.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -14.0F, 5.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r2 = hexadecagon.addOrReplaceChild("hexadecagon_r2", CubeListBuilder.create().texOffs(43, 6).addBox(-4.0F, -1.9454F, -0.7318F, 16.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 22).addBox(-4.0F, 0.0682F, -2.7455F, 16.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -14.0F, 5.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r3 = hexadecagon.addOrReplaceChild("hexadecagon_r3", CubeListBuilder.create().texOffs(1, 15).addBox(-4.0F, -0.0684F, -2.0774F, 16.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -14.0F, 5.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r4 = hexadecagon.addOrReplaceChild("hexadecagon_r4", CubeListBuilder.create().texOffs(1, 22).addBox(-4.0F, -0.0637F, -2.9453F, 16.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -14.0F, 5.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition hexadecagon2 = hexadecagon.addOrReplaceChild("hexadecagon2", CubeListBuilder.create().texOffs(0, 35).addBox(-9.5F, 3.3467F, 5.0361F, 17.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -17.2F, -1.5F));

		PartDefinition hexadecagon_r5 = hexadecagon2.addOrReplaceChild("hexadecagon_r5", CubeListBuilder.create().texOffs(38, 0).addBox(-8.5F, -0.7362F, -0.0779F, 17.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.9954F, 6.3476F, -0.3229F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r6 = hexadecagon2.addOrReplaceChild("hexadecagon_r6", CubeListBuilder.create().texOffs(38, 14).addBox(-8.5F, -0.8343F, -0.7163F, 17.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 3.186F, 6.5445F, 0.3142F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r7 = hexadecagon2.addOrReplaceChild("hexadecagon_r7", CubeListBuilder.create().texOffs(38, 21).addBox(-8.5F, -0.7837F, -1.3627F, 17.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.7466F, 6.4439F, 0.9338F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r8 = hexadecagon2.addOrReplaceChild("hexadecagon_r8", CubeListBuilder.create().texOffs(37, 36).addBox(-8.5F, 0.1769F, -1.8965F, 17.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 3.0441F, 6.4737F, 0.6021F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		hexadecagon.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}