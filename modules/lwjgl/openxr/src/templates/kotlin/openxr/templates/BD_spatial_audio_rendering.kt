/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val BD_spatial_audio_rendering = "BDSpatialAudioRendering".nativeClassXR("BD_spatial_audio_rendering", type = "instance", postfix = "BD") {
    IntConstant(
        "BD_spatial_audio_rendering_SPEC_VERSION".."1"
    )

    StringConstant(
        "BD_SPATIAL_AUDIO_RENDERING_EXTENSION_NAME".."XR_BD_spatial_audio_rendering"
    )

    EnumConstant(
        "TYPE_SPATIAL_AUDIO_RENDERER_CREATE_INFO_BD".."1000409000",
        "TYPE_AUDIO_BUFFER_BD".."1000409001",
        "TYPE_SOUND_OBJECT_DIRECTIVITY_CARDIOID_BD".."1000409003",
        "TYPE_SOUND_OBJECT_SHAPE_SPHERE_BD".."1000409004",
        "TYPE_SOUND_OBJECT_DISTANCE_ATTENUATION_BD".."1000409005",
        "TYPE_SOUND_OBJECT_DISTANCE_ATTENUATION_CURVE_BD".."1000409006",
        "TYPE_SOUND_OBJECT_CONFIG_BD".."1000409007",
        "TYPE_SOUND_FIELD_CONFIG_BD".."1000409008",
        "TYPE_SOUND_FIELD_CHANNEL_DEFINITION_SURROUND_BD".."1000409009",
        "TYPE_SOUND_FIELD_CHANNEL_DEFINITION_AMBIX_BD".."1000409010",
        "TYPE_SOUND_FIELD_CHANNEL_DEFINITION_FUMA_BD".."1000409011",
        "TYPE_SOUND_TRIANGLE_MESH_BD".."1000409012",
        "TYPE_SOUND_OBSTACLE_CONFIG_BD".."1000409013",
        "TYPE_SOUND_OBSTACLE_MATERIAL_CONFIG_BD".."1000409014"
    )

    EnumConstant(
        "OBJECT_TYPE_SPATIAL_AUDIO_RENDERER_BD".."1000409000",
        "OBJECT_TYPE_SOUND_FIELD_BD".."1000409001",
        "OBJECT_TYPE_SOUND_OBJECT_BD".."1000409002",
        "OBJECT_TYPE_SOUND_OBSTACLE_BD".."1000409003",
        "OBJECT_TYPE_SOUND_OBSTACLE_MATERIAL_BD".."1000409004"
    )

    EnumConstant(
        "AUDIO_SAMPLE_RATE_192000_HZ_BD".."1",
        "AUDIO_SAMPLE_RATE_96000_HZ_BD".."2",
        "AUDIO_SAMPLE_RATE_48000_HZ_BD".."3",
        "AUDIO_SAMPLE_RATE_44100_HZ_BD".."4",
        "AUDIO_SAMPLE_RATE_32000_HZ_BD".."5",
        "AUDIO_SAMPLE_RATE_24000_HZ_BD".."6",
        "AUDIO_SAMPLE_RATE_22050_HZ_BD".."7",
        "AUDIO_SAMPLE_RATE_16000_HZ_BD".."8",
        "AUDIO_SAMPLE_RATE_12000_HZ_BD".."9",
        "AUDIO_SAMPLE_RATE_11025_HZ_BD".."10",
        "AUDIO_SAMPLE_RATE_8000_HZ_BD".."11"
    )

    EnumConstant(
        "AUDIO_BUFFER_CHANNEL_LAYOUT_INTERLEAVED_BD".."0",
        "AUDIO_BUFFER_CHANNEL_LAYOUT_PLANAR_BD".."1"
    )

    EnumConstant(
        "SOUND_OBJECT_DISTANCE_ATTENUATION_TYPE_NONE_BD".."0",
        "SOUND_OBJECT_DISTANCE_ATTENUATION_TYPE_INVERSE_SQUARE_BD".."1",
        "SOUND_OBJECT_DISTANCE_ATTENUATION_TYPE_ROLLOFF_BD".."2",
        "SOUND_OBJECT_DISTANCE_ATTENUATION_TYPE_CUSTOMIZED_BD".."100"
    )

    EnumConstant(
        "SOUND_FIELD_CHANNEL_MASK_SURROUND_FRONT_LEFT_BD".."1",
        "SOUND_FIELD_CHANNEL_MASK_SURROUND_FRONT_RIGHT_BD".."2",
        "SOUND_FIELD_CHANNEL_MASK_SURROUND_SETUP_STEREO_BD".."3",
        "SOUND_FIELD_CHANNEL_MASK_SURROUND_FRONT_CENTER_BD".."4",
        "SOUND_FIELD_CHANNEL_MASK_SURROUND_SETUP_3_0_BD".."7",
        "SOUND_FIELD_CHANNEL_MASK_SURROUND_LOW_FREQUENCY_BD".."8",
        "SOUND_FIELD_CHANNEL_MASK_SURROUND_SETUP_2_1_BD".."11",
        "SOUND_FIELD_CHANNEL_MASK_SURROUND_SETUP_3_1_BD".."15",
        "SOUND_FIELD_CHANNEL_MASK_SURROUND_BACK_LEFT_BD".."16",
        "SOUND_FIELD_CHANNEL_MASK_SURROUND_BACK_RIGHT_BD".."32",
        "SOUND_FIELD_CHANNEL_MASK_SURROUND_SETUP_BACK_SURROUND_BD".."48",
        "SOUND_FIELD_CHANNEL_MASK_SURROUND_SETUP_QUAD_BD".."51",
        "SOUND_FIELD_CHANNEL_MASK_SURROUND_SETUP_5_0_BD".."55",
        "SOUND_FIELD_CHANNEL_MASK_SURROUND_SETUP_5_1_BD".."63",
        "SOUND_FIELD_CHANNEL_MASK_SURROUND_SIDE_LEFT_BD".."64",
        "SOUND_FIELD_CHANNEL_MASK_SURROUND_SIDE_RIGHT_BD".."128",
        "SOUND_FIELD_CHANNEL_MASK_SURROUND_SETUP_SIDE_SURROUND_BD".."192",
        "SOUND_FIELD_CHANNEL_MASK_SURROUND_SETUP_5_0_SIDE_BD".."199",
        "SOUND_FIELD_CHANNEL_MASK_SURROUND_SETUP_5_1_SIDE_BD".."207",
        "SOUND_FIELD_CHANNEL_MASK_SURROUND_SETUP_7_0_BD".."247",
        "SOUND_FIELD_CHANNEL_MASK_SURROUND_SETUP_7_1_BD".."255",
        "SOUND_FIELD_CHANNEL_MASK_SURROUND_TOP_FRONT_LEFT_BD".."256",
        "SOUND_FIELD_CHANNEL_MASK_SURROUND_TOP_FRONT_RIGHT_BD".."512",
        "SOUND_FIELD_CHANNEL_MASK_SURROUND_SETUP_5_1_2_BD".."831",
        "SOUND_FIELD_CHANNEL_MASK_SURROUND_TOP_BACK_LEFT_BD".."1024",
        "SOUND_FIELD_CHANNEL_MASK_SURROUND_TOP_BACK_RIGHT_BD".."2048",
        "SOUND_FIELD_CHANNEL_MASK_SURROUND_SETUP_5_1_4_BD".."3903",
        "SOUND_FIELD_CHANNEL_MASK_SURROUND_SETUP_7_1_4_BD".."4095",
        "SOUND_FIELD_CHANNEL_MASK_SURROUND_BACK_CENTER_BD".."4096",
        "SOUND_FIELD_CHANNEL_MASK_SURROUND_SETUP_4_0_BD".."4099",
        "SOUND_FIELD_CHANNEL_MASK_SURROUND_TOP_SIDE_LEFT_BD".."8192",
        "SOUND_FIELD_CHANNEL_MASK_SURROUND_TOP_SIDE_RIGHT_BD".."16384",
        "SOUND_FIELD_CHANNEL_MASK_SURROUND_SETUP_7_1_2_BD".."24831"
    )

    EnumConstant(
        "SOUND_FIELD_CHANNEL_MASK_AMBIX_1ST_ORDER_BD".."1",
        "SOUND_FIELD_CHANNEL_MASK_AMBIX_2ND_ORDER_BD".."2",
        "SOUND_FIELD_CHANNEL_MASK_AMBIX_3RD_ORDER_BD".."3",
        "SOUND_FIELD_CHANNEL_MASK_AMBIX_4TH_ORDER_BD".."4",
        "SOUND_FIELD_CHANNEL_MASK_AMBIX_5TH_ORDER_BD".."5",
        "SOUND_FIELD_CHANNEL_MASK_AMBIX_6TH_ORDER_BD".."6",
        "SOUND_FIELD_CHANNEL_MASK_AMBIX_7TH_ORDER_BD".."7"
    )

    EnumConstant(
        "SOUND_FIELD_CHANNEL_MASK_FUMA_1ST_ORDER_BD".."1"
    )

    EnumConstant(
        "SOUND_OBSTACLE_MATERIAL_TYPE_ACOUSTIC_TILE_BD".."0",
        "SOUND_OBSTACLE_MATERIAL_TYPE_BRICK_BD".."1",
        "SOUND_OBSTACLE_MATERIAL_TYPE_BRICK_PAINTED_BD".."2",
        "SOUND_OBSTACLE_MATERIAL_TYPE_CARPET_BD".."3",
        "SOUND_OBSTACLE_MATERIAL_TYPE_CARPET_HEAVY_BD".."4",
        "SOUND_OBSTACLE_MATERIAL_TYPE_CARPET_HEAVY_PADDED_BD".."5",
        "SOUND_OBSTACLE_MATERIAL_TYPE_CERAMIC_TILE_BD".."6",
        "SOUND_OBSTACLE_MATERIAL_TYPE_CONCRETE_BD".."7",
        "SOUND_OBSTACLE_MATERIAL_TYPE_CONCRETE_ROUGH_BD".."8",
        "SOUND_OBSTACLE_MATERIAL_TYPE_CONCRETE_BLOCK_BD".."9",
        "SOUND_OBSTACLE_MATERIAL_TYPE_CONCRETE_BLOCK_PAINTED_BD".."10",
        "SOUND_OBSTACLE_MATERIAL_TYPE_CURTAIN_BD".."11",
        "SOUND_OBSTACLE_MATERIAL_TYPE_FOLIAGE_BD".."12",
        "SOUND_OBSTACLE_MATERIAL_TYPE_GLASS_BD".."13",
        "SOUND_OBSTACLE_MATERIAL_TYPE_GLASS_HEAVY_BD".."14",
        "SOUND_OBSTACLE_MATERIAL_TYPE_GRASS_BD".."15",
        "SOUND_OBSTACLE_MATERIAL_TYPE_GRAVEL_BD".."16",
        "SOUND_OBSTACLE_MATERIAL_TYPE_GYPSUM_BOARD_BD".."17",
        "SOUND_OBSTACLE_MATERIAL_TYPE_PLASTER_ON_BRICK_BD".."18",
        "SOUND_OBSTACLE_MATERIAL_TYPE_PLASTER_ON_CONCRETE_BLOCK_BD".."19",
        "SOUND_OBSTACLE_MATERIAL_TYPE_SOIL_BD".."20",
        "SOUND_OBSTACLE_MATERIAL_TYPE_SOUND_PROOF_BD".."21",
        "SOUND_OBSTACLE_MATERIAL_TYPE_SNOW_BD".."22",
        "SOUND_OBSTACLE_MATERIAL_TYPE_STEEL_BD".."23",
        "SOUND_OBSTACLE_MATERIAL_TYPE_WATER_BD".."24",
        "SOUND_OBSTACLE_MATERIAL_TYPE_WOOD_THIN_BD".."25",
        "SOUND_OBSTACLE_MATERIAL_TYPE_WOOD_THICK_BD".."26",
        "SOUND_OBSTACLE_MATERIAL_TYPE_WOOD_FLOOR_BD".."27",
        "SOUND_OBSTACLE_MATERIAL_TYPE_WOOD_ON_CONCRETE_BD".."28",
        "SOUND_OBSTACLE_MATERIAL_TYPE_CUSTOM_BD".."29"
    )

    EnumConstant(
        "SOUND_OBSTACLE_ENABLED_BIT_BD".enum(0x00000001),
        "SOUND_OBSTACLE_POSE_BIT_BD".enum(0x00000002),
        "SOUND_OBSTACLE_MESH_BIT_BD".enum(0x00000004),
        "SOUND_OBSTACLE_MATERIALS_BIT_BD".enum(0x00000008)
    )

    EnumConstant(
        "SOUND_OBJECT_ENABLED_BIT_BD".enum(0x00000001),
        "SOUND_OBJECT_POSE_BIT_BD".enum(0x00000002),
        "SOUND_OBJECT_DIRECTIVITY_BIT_BD".enum(0x00000004),
        "SOUND_OBJECT_SHAPE_BIT_BD".enum(0x00000008),
        "SOUND_OBJECT_MAIN_VOLUME_BIT_BD".enum(0x00000010),
        "SOUND_OBJECT_REFLECTION_GAIN_BIT_BD".enum(0x00000020),
        "SOUND_OBJECT_ENABLE_DOPPLER_BIT_BD".enum(0x00000040),
        "SOUND_OBJECT_DIRECT_SOUND_ATTENUATION_BIT_BD".enum(0x00000080),
        "SOUND_OBJECT_INDIRECT_SOUND_ATTENUATION_BIT_BD".enum(0x00000100)
    )

    EnumConstant(
        "SOUND_FIELD_ENABLED_BIT_BD".enum(0x00000001),
        "SOUND_FIELD_ORIENTATION_BIT_BD".enum(0x00000002),
        "SOUND_FIELD_MAIN_VOLUME_BIT_BD".enum(0x00000004),
        "SOUND_FIELD_LFE_GAIN_BIT_BD".enum(0x00000008)
    )

    XrResult(
        "EnumerateSupportedAudioSampleRateBD",

        XrSession("session"),
        AutoSize("sampleRates")..uint32_t("sampleRateCapacityInput"),
        Check(1)..uint32_t.p("sampleRateCountOutput"),
        nullable..XrAudioSampleRateBD.p("sampleRates")
    )

    XrResult(
        "QueryFramesPerBufferRangeBD",

        XrSession("session"),
        XrAudioSampleRateBD("sampleRate"),
        Check(1)..uint32_t.p("min"),
        Check(1)..uint32_t.p("max")
    )

    XrResult(
        "CreateSpatialAudioRendererBD",

        XrSession("session"),
        XrSpatialAudioRendererCreateInfoBD.const.p("createInfo"),
        Check(1)..XrSpatialAudioRendererBD.p("renderer")
    )

    XrResult(
        "DestroySpatialAudioRendererBD",

        XrSpatialAudioRendererBD("renderer")
    )

    XrResult(
        "CreateSoundObstacleMaterialBD",

        XrSpatialAudioRendererBD("renderer"),
        XrSoundObstacleMaterialConfigBD.const.p("config"),
        Check(1)..XrSoundObstacleMaterialBD.p("material")
    )

    XrResult(
        "UpdateSoundObstacleMaterialConfigBD",

        XrSoundObstacleMaterialBD("material"),
        XrSoundObstacleMaterialConfigBD.const.p("config")
    )

    XrResult(
        "DestroySoundObstacleMaterialBD",

        XrSoundObstacleMaterialBD("material")
    )

    XrResult(
        "CreateSoundObstacleBD",

        XrSpatialAudioRendererBD("renderer"),
        XrSoundObstacleConfigBD.const.p("config"),
        XrSoundTriangleMeshBD.const.p("mesh"),
        Check(1)..XrSoundObstacleBD.p("soundObstacle")
    )

    XrResult(
        "UpdateSoundObstacleConfigBD",

        XrSoundObstacleBD("soundObstacle"),
        nullable..XrSoundObstacleConfigBD.const.p("config"),
        nullable..XrSoundTriangleMeshBD.const.p("mesh"),
        XrSoundObstacleFlagsBD("flags")
    )

    XrResult(
        "DestroySoundObstacleBD",

        XrSoundObstacleBD("soundObstacle")
    )

    XrResult(
        "CreateSoundObjectBD",

        XrSpatialAudioRendererBD("renderer"),
        XrSoundObjectConfigBD.const.p("config"),
        Check(1)..XrSoundObjectBD.p("soundObject")
    )

    XrResult(
        "UpdateSoundObjectConfigBD",

        XrSoundObjectBD("soundObject"),
        XrSoundObjectConfigBD.const.p("config"),
        XrSoundObjectFlagsBD("flags")
    )

    XrResult(
        "SubmitSoundObjectBufferBD",

        XrSoundObjectBD("soundObject"),
        XrAudioBufferBD.const.p("buffer")
    )

    XrResult(
        "DestroySoundObjectBD",

        XrSoundObjectBD("soundObject")
    )

    XrResult(
        "CreateSoundFieldBD",

        XrSpatialAudioRendererBD("renderer"),
        XrSoundFieldConfigBD.const.p("config"),
        Check(1)..XrSoundFieldBD.p("soundField")
    )

    XrResult(
        "UpdateSoundFieldConfigBD",

        XrSoundFieldBD("soundField"),
        nullable..XrSoundFieldConfigBD.const.p("config"),
        XrSoundFieldFlagsBD("flags")
    )

    XrResult(
        "SubmitSoundFieldBufferBD",

        XrSoundFieldBD("soundField"),
        XrAudioBufferBD.const.p("buffer")
    )

    XrResult(
        "DestroySoundFieldBD",

        XrSoundFieldBD("soundField")
    )

    XrResult(
        "WaitAudioPeriodBD",

        XrSpatialAudioRendererBD("renderer"),
        XrDuration("timeout")
    )

    XrResult(
        "EndAudioPeriodBD",

        XrSpatialAudioRendererBD("renderer")
    )
}