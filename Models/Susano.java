


public class custom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart Susano;
	private final ModelPart Susano2;
	private final ModelPart Susano3;
	private final ModelPart Susano4;
	private final ModelPart Susano5;

	public custom_model(ModelPart root) {
		this.Susano = root.getChild("Susano");
		this.Susano2 = root.getChild("Susano2");
		this.Susano3 = root.getChild("Susano3");
		this.Susano4 = root.getChild("Susano4");
		this.Susano5 = root.getChild("Susano5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Susano = partdefinition.addOrReplaceChild("Susano", CubeListBuilder.create().texOffs(0, 18).addBox(-1.5F, -35.9F, 7.8F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 22.9F, 0.0F));

		PartDefinition cube_r1 = Susano.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(57, 60).addBox(3.8552F, -2.35F, 4.5303F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.7552F, -33.55F, 3.3697F, 0.0F, -0.0698F, 0.0F));

		PartDefinition cube_r2 = Susano.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 59).addBox(0.8747F, -2.35F, 2.9428F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.7552F, -33.55F, 3.3697F, 0.0F, -0.4014F, 0.0F));

		PartDefinition cube_r3 = Susano.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(58, 55).addBox(-2.2149F, -2.35F, 2.2503F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.7552F, -33.55F, 3.3697F, 0.0F, -0.7941F, 0.0F));

		PartDefinition cube_r4 = Susano.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(58, 50).addBox(-5.5153F, -2.35F, 2.8015F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.7552F, -33.55F, 3.3697F, 0.0F, -1.1606F, 0.0F));

		PartDefinition cube_r5 = Susano.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(10, 57).addBox(-2.2F, -2.35F, -1.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.1325F, -33.55F, -7.1524F, -3.1416F, -1.2828F, 3.1416F));

		PartDefinition cube_r6 = Susano.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(57, 14).addBox(-8.0747F, -2.35F, 4.6689F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.7552F, -33.55F, 3.3697F, -3.1416F, -1.5621F, 3.1416F));

		PartDefinition cube_r7 = Susano.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(48, 56).addBox(-2.3F, -2.35F, -1.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.2221F, -33.55F, -7.1524F, -3.1416F, -1.2828F, 0.0F));

		PartDefinition cube_r8 = Susano.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(59, 38).addBox(-8.0747F, -2.35F, 4.6689F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8448F, -33.55F, 3.3697F, -3.1416F, -1.5621F, 0.0F));

		PartDefinition cube_r9 = Susano.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(29, 59).addBox(-5.5153F, -2.35F, 2.8015F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8448F, -33.55F, 3.3697F, 0.0F, -1.1606F, -3.1416F));

		PartDefinition cube_r10 = Susano.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(59, 28).addBox(-2.2149F, -2.35F, 2.2503F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8448F, -33.55F, 3.3697F, 0.0F, -0.7941F, -3.1416F));

		PartDefinition cube_r11 = Susano.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(59, 9).addBox(0.8747F, -2.35F, 2.9428F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8448F, -33.55F, 3.3697F, 0.0F, -0.4014F, 3.1416F));

		PartDefinition cube_r12 = Susano.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(47, 61).addBox(3.8552F, -2.35F, 4.5303F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8448F, -33.55F, 3.3697F, 0.0F, -0.0698F, -3.1416F));

		PartDefinition Susano2 = partdefinition.addOrReplaceChild("Susano2", CubeListBuilder.create().texOffs(8, 14).addBox(-1.5F, -35.9F, 7.8F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(8, 62).addBox(-1.1F, -31.2F, 8.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(60, 24).addBox(-1.1F, -24.3F, 8.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(52, 0).addBox(-1.1F, -17.3F, 8.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(61, 5).addBox(-1.1F, -38.5F, 8.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 30.2F, 0.0F));

		PartDefinition cube_r13 = Susano2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(60, 33).addBox(3.8552F, -2.35F, 4.5303F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.5552F, -33.55F, 3.3697F, 0.0F, -0.0698F, 0.0F));

		PartDefinition cube_r14 = Susano2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(50, 19).addBox(0.8747F, -2.35F, 2.9428F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.5552F, -33.55F, 3.3697F, 0.0F, -0.4014F, 0.0F));

		PartDefinition cube_r15 = Susano2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(50, 24).addBox(-2.2149F, -2.35F, 2.2503F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.5552F, -33.55F, 3.3697F, 0.0F, -0.7941F, 0.0F));

		PartDefinition cube_r16 = Susano2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(50, 34).addBox(-5.5153F, -2.35F, 2.8015F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.5552F, -33.55F, 3.3697F, 0.0F, -1.1606F, 0.0F));

		PartDefinition cube_r17 = Susano2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 24).addBox(-2.3F, 18.65F, -1.8F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.4548F, -33.55F, -11.3641F, -3.1416F, -0.8814F, 3.1416F));

		PartDefinition cube_r18 = Susano2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(10, 24).addBox(-2.3F, 11.65F, -1.8F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.9548F, -33.55F, -11.3641F, -3.1416F, -0.8814F, 3.1416F));

		PartDefinition cube_r19 = Susano2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 5).addBox(-2.9F, 11.65F, -1.9F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.63F, -26.55F, -14.4318F, -3.1416F, -0.4451F, 3.1416F));

		PartDefinition cube_r20 = Susano2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(17, 19).addBox(-1.8F, 4.65F, -1.9F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.13F, -26.55F, -14.4318F, -3.1416F, -0.4451F, 3.1416F));

		PartDefinition cube_r21 = Susano2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(20, 6).addBox(-1.4F, -2.35F, -1.9F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.63F, -26.55F, -14.4318F, -3.1416F, -0.4451F, 3.1416F));

		PartDefinition cube_r22 = Susano2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(20, 24).addBox(-2.3F, 4.65F, -1.8F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.4548F, -33.55F, -11.3641F, -3.1416F, -0.8814F, 3.1416F));

		PartDefinition cube_r23 = Susano2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(10, 29).addBox(-2.3F, -2.35F, -1.8F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.9548F, -33.55F, -11.3641F, -3.1416F, -0.8814F, 3.1416F));

		PartDefinition cube_r24 = Susano2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(51, 4).addBox(-2.2F, -2.35F, -1.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.9325F, -33.55F, -7.1524F, -3.1416F, -1.2828F, 3.1416F));

		PartDefinition cube_r25 = Susano2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(29, 51).addBox(-8.0747F, -2.35F, 4.6689F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.5552F, -33.55F, 3.3697F, -3.1416F, -1.5621F, 3.1416F));

		PartDefinition cube_r26 = Susano2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(27, 18).addBox(-2.4F, -23.35F, -1.8F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.5445F, -33.55F, -11.3641F, -3.1416F, -0.8814F, 0.0F));

		PartDefinition cube_r27 = Susano2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(28, 11).addBox(-2.4F, -16.35F, -1.8F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.8445F, -33.55F, -11.3641F, -3.1416F, -0.8814F, 0.0F));

		PartDefinition cube_r28 = Susano2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 0).addBox(-3.4F, -16.35F, -1.6F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.2286F, -26.55F, -13.8145F, -3.1416F, -0.4451F, 0.0F));

		PartDefinition cube_r29 = Susano2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(18, 14).addBox(-2.5F, -9.35F, -1.6F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5286F, -26.55F, -13.8145F, -3.1416F, -0.4451F, 0.0F));

		PartDefinition cube_r30 = Susano2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(22, 0).addBox(-2.1F, -2.35F, -1.6F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.9286F, -26.55F, -13.8145F, -3.1416F, -0.4451F, 0.0F));

		PartDefinition cube_r31 = Susano2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 29).addBox(-2.4F, -9.35F, -1.8F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.2445F, -33.55F, -11.3641F, -3.1416F, -0.8814F, 0.0F));

		PartDefinition cube_r32 = Susano2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(20, 29).addBox(-2.4F, -2.35F, -1.8F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.8445F, -33.55F, -11.3641F, -3.1416F, -0.8814F, 0.0F));

		PartDefinition cube_r33 = Susano2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(48, 51).addBox(-2.3F, -2.35F, -1.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.8221F, -33.55F, -7.1524F, -3.1416F, -1.2828F, 0.0F));

		PartDefinition cube_r34 = Susano2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(10, 52).addBox(-8.0747F, -2.35F, 4.6689F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4448F, -33.55F, 3.3697F, -3.1416F, -1.5621F, 0.0F));

		PartDefinition cube_r35 = Susano2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 54).addBox(-5.5153F, -2.35F, 2.8015F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4448F, -33.55F, 3.3697F, 0.0F, -1.1606F, -3.1416F));

		PartDefinition cube_r36 = Susano2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(20, 55).addBox(-2.2149F, -2.35F, 2.2503F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4448F, -33.55F, 3.3697F, 0.0F, -0.7941F, -3.1416F));

		PartDefinition cube_r37 = Susano2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(38, 55).addBox(0.8747F, -2.35F, 2.9428F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4448F, -33.55F, 3.3697F, 0.0F, -0.4014F, 3.1416F));

		PartDefinition cube_r38 = Susano2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(39, 60).addBox(3.8552F, -2.35F, 4.5303F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4448F, -33.55F, 3.3697F, 0.0F, -0.0698F, -3.1416F));

		PartDefinition Susano3 = partdefinition.addOrReplaceChild("Susano3", CubeListBuilder.create().texOffs(12, 0).addBox(-1.5F, -35.9F, 7.8F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 37.2F, 0.0F));

		PartDefinition cube_r39 = Susano3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(60, 19).addBox(3.8552F, -2.35F, 4.5303F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0552F, -33.55F, 3.3697F, 0.0F, -0.0698F, 0.0F));

		PartDefinition cube_r40 = Susano3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(10, 44).addBox(0.8747F, -2.35F, 2.9428F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0552F, -33.55F, 3.3697F, 0.0F, -0.4014F, 0.0F));

		PartDefinition cube_r41 = Susano3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(29, 46).addBox(-2.2149F, -2.35F, 2.2503F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0552F, -33.55F, 3.3697F, 0.0F, -0.7941F, 0.0F));

		PartDefinition cube_r42 = Susano3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(47, 14).addBox(-5.5153F, -2.35F, 2.8015F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0552F, -33.55F, 3.3697F, 0.0F, -1.1606F, 0.0F));

		PartDefinition cube_r43 = Susano3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(39, 47).addBox(-2.2F, -2.35F, -1.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.4325F, -33.55F, -7.1524F, -3.1416F, -1.2828F, 3.1416F));

		PartDefinition cube_r44 = Susano3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(19, 48).addBox(-8.0747F, -2.35F, 4.6689F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0552F, -33.55F, 3.3697F, -3.1416F, -1.5621F, 3.1416F));

		PartDefinition cube_r45 = Susano3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 49).addBox(-2.3F, -2.35F, -1.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.2221F, -33.55F, -7.1524F, -3.1416F, -1.2828F, 0.0F));

		PartDefinition cube_r46 = Susano3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(49, 9).addBox(-8.0747F, -2.35F, 4.6689F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.8448F, -33.55F, 3.3697F, -3.1416F, -1.5621F, 0.0F));

		PartDefinition cube_r47 = Susano3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(49, 29).addBox(-5.5153F, -2.35F, 2.8015F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.8448F, -33.55F, 3.3697F, 0.0F, -1.1606F, -3.1416F));

		PartDefinition cube_r48 = Susano3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(49, 41).addBox(-2.2149F, -2.35F, 2.2503F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.8448F, -33.55F, 3.3697F, 0.0F, -0.7941F, -3.1416F));

		PartDefinition cube_r49 = Susano3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(49, 46).addBox(0.8747F, -2.35F, 2.9428F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.8448F, -33.55F, 3.3697F, 0.0F, -0.4014F, 3.1416F));

		PartDefinition cube_r50 = Susano3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(20, 60).addBox(3.8552F, -2.35F, 4.5303F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.8448F, -33.55F, 3.3697F, 0.0F, -0.0698F, -3.1416F));

		PartDefinition Susano4 = partdefinition.addOrReplaceChild("Susano4", CubeListBuilder.create().texOffs(10, 8).addBox(-1.5F, -35.9F, 7.8F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 44.2F, 0.0F));

		PartDefinition cube_r51 = Susano4.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(59, 43).addBox(3.8552F, -2.35F, 4.5303F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.5552F, -33.55F, 3.3697F, 0.0F, -0.0698F, 0.0F));

		PartDefinition cube_r52 = Susano4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(10, 39).addBox(0.8747F, -2.35F, 2.9428F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.5552F, -33.55F, 3.3697F, 0.0F, -0.4014F, 0.0F));

		PartDefinition cube_r53 = Susano4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(39, 32).addBox(-2.2149F, -2.35F, 2.2503F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.5552F, -33.55F, 3.3697F, 0.0F, -0.7941F, 0.0F));

		PartDefinition cube_r54 = Susano4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(40, 5).addBox(-5.5153F, -2.35F, 2.8015F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.5552F, -33.55F, 3.3697F, 0.0F, -1.1606F, 0.0F));

		PartDefinition cube_r55 = Susano4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(40, 20).addBox(-2.2F, -2.35F, -1.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.9325F, -33.55F, -7.1524F, -3.1416F, -1.2828F, 3.1416F));

		PartDefinition cube_r56 = Susano4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(40, 25).addBox(-8.0747F, -2.35F, 4.6689F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.5552F, -33.55F, 3.3697F, -3.1416F, -1.5621F, 3.1416F));

		PartDefinition cube_r57 = Susano4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(40, 37).addBox(-2.3F, -2.35F, -1.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.8221F, -33.55F, -7.1524F, -3.1416F, -1.2828F, 0.0F));

		PartDefinition cube_r58 = Susano4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(42, 0).addBox(-8.0747F, -2.35F, 4.6689F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.4448F, -33.55F, 3.3697F, -3.1416F, -1.5621F, 0.0F));

		PartDefinition cube_r59 = Susano4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(20, 42).addBox(-5.5153F, -2.35F, 2.8015F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.4448F, -33.55F, 3.3697F, 0.0F, -1.1606F, -3.1416F));

		PartDefinition cube_r60 = Susano4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(39, 42).addBox(-2.2149F, -2.35F, 2.2503F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.4448F, -33.55F, 3.3697F, 0.0F, -0.7941F, -3.1416F));

		PartDefinition cube_r61 = Susano4.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(0, 44).addBox(0.8747F, -2.35F, 2.9428F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.4448F, -33.55F, 3.3697F, 0.0F, -0.4014F, 3.1416F));

		PartDefinition cube_r62 = Susano4.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(60, 0).addBox(3.8552F, -2.35F, 4.5303F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.4448F, -33.55F, 3.3697F, 0.0F, -0.0698F, -3.1416F));

		PartDefinition Susano5 = partdefinition.addOrReplaceChild("Susano5", CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, -35.9F, 7.8F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 51.2F, 0.0F));

		PartDefinition cube_r63 = Susano5.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(30, 5).addBox(3.8552F, -2.35F, 4.5303F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0552F, -33.55F, 3.3697F, 0.0F, -0.0698F, 0.0F));

		PartDefinition cube_r64 = Susano5.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(30, 23).addBox(0.8747F, -2.35F, 2.9428F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0552F, -33.55F, 3.3697F, 0.0F, -0.4014F, 0.0F));

		PartDefinition cube_r65 = Susano5.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(30, 28).addBox(-2.2149F, -2.35F, 2.2503F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0552F, -33.55F, 3.3697F, 0.0F, -0.7941F, 0.0F));

		PartDefinition cube_r66 = Susano5.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(32, 0).addBox(-5.5153F, -2.35F, 2.8015F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0552F, -33.55F, 3.3697F, 0.0F, -1.1606F, 0.0F));

		PartDefinition cube_r67 = Susano5.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(29, 33).addBox(-2.2F, -2.35F, -1.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.4325F, -33.55F, -7.1524F, -3.1416F, -1.2828F, 3.1416F));

		PartDefinition cube_r68 = Susano5.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 34).addBox(-8.0747F, -2.35F, 4.6689F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0552F, -33.55F, 3.3697F, -3.1416F, -1.5621F, 3.1416F));

		PartDefinition cube_r69 = Susano5.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(10, 34).addBox(-2.3F, -2.35F, -1.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.5221F, -33.55F, -7.1524F, -3.1416F, -1.2828F, 0.0F));

		PartDefinition cube_r70 = Susano5.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(37, 15).addBox(-8.0747F, -2.35F, 4.6689F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.1448F, -33.55F, 3.3697F, -3.1416F, -1.5621F, 0.0F));

		PartDefinition cube_r71 = Susano5.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(20, 37).addBox(-5.5153F, -2.35F, 2.8015F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.1448F, -33.55F, 3.3697F, 0.0F, -1.1606F, -3.1416F));

		PartDefinition cube_r72 = Susano5.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(38, 10).addBox(-2.2149F, -2.35F, 2.2503F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.1448F, -33.55F, 3.3697F, 0.0F, -0.7941F, -3.1416F));

		PartDefinition cube_r73 = Susano5.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(30, 38).addBox(0.8747F, -2.35F, 2.9428F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.1448F, -33.55F, 3.3697F, 0.0F, -0.4014F, 3.1416F));

		PartDefinition cube_r74 = Susano5.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(0, 39).addBox(-2.15F, -2.35F, -0.8F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5251F, -33.55F, 9.078F, 0.0F, -0.0349F, -3.1416F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Susano.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Susano2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Susano3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Susano4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Susano5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}