/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_extended_dynamic_state3 = "EXTExtendedDynamicState3".nativeClassVK("EXT_extended_dynamic_state3", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_EXTENDED_DYNAMIC_STATE_3_SPEC_VERSION".."2"
    )

    StringConstant(
        "EXT_EXTENDED_DYNAMIC_STATE_3_EXTENSION_NAME".."VK_EXT_extended_dynamic_state3"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_FEATURES_EXT".."1000455000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_PROPERTIES_EXT".."1000455001"
    )

    EnumConstant(
        "DYNAMIC_STATE_TESSELLATION_DOMAIN_ORIGIN_EXT".."1000455002",
        "DYNAMIC_STATE_DEPTH_CLAMP_ENABLE_EXT".."1000455003",
        "DYNAMIC_STATE_POLYGON_MODE_EXT".."1000455004",
        "DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT".."1000455005",
        "DYNAMIC_STATE_SAMPLE_MASK_EXT".."1000455006",
        "DYNAMIC_STATE_ALPHA_TO_COVERAGE_ENABLE_EXT".."1000455007",
        "DYNAMIC_STATE_ALPHA_TO_ONE_ENABLE_EXT".."1000455008",
        "DYNAMIC_STATE_LOGIC_OP_ENABLE_EXT".."1000455009",
        "DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT".."1000455010",
        "DYNAMIC_STATE_COLOR_BLEND_EQUATION_EXT".."1000455011",
        "DYNAMIC_STATE_COLOR_WRITE_MASK_EXT".."1000455012",
        "DYNAMIC_STATE_RASTERIZATION_STREAM_EXT".."1000455013",
        "DYNAMIC_STATE_CONSERVATIVE_RASTERIZATION_MODE_EXT".."1000455014",
        "DYNAMIC_STATE_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_EXT".."1000455015",
        "DYNAMIC_STATE_DEPTH_CLIP_ENABLE_EXT".."1000455016",
        "DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT".."1000455017",
        "DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT".."1000455018",
        "DYNAMIC_STATE_PROVOKING_VERTEX_MODE_EXT".."1000455019",
        "DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT".."1000455020",
        "DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT".."1000455021",
        "DYNAMIC_STATE_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_EXT".."1000455022",
        "DYNAMIC_STATE_VIEWPORT_W_SCALING_ENABLE_NV".."1000455023",
        "DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV".."1000455024",
        "DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV".."1000455025",
        "DYNAMIC_STATE_COVERAGE_TO_COLOR_LOCATION_NV".."1000455026",
        "DYNAMIC_STATE_COVERAGE_MODULATION_MODE_NV".."1000455027",
        "DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_ENABLE_NV".."1000455028",
        "DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_NV".."1000455029",
        "DYNAMIC_STATE_SHADING_RATE_IMAGE_ENABLE_NV".."1000455030",
        "DYNAMIC_STATE_REPRESENTATIVE_FRAGMENT_TEST_ENABLE_NV".."1000455031",
        "DYNAMIC_STATE_COVERAGE_REDUCTION_MODE_NV".."1000455032"
    )

    void(
        "CmdSetDepthClampEnableEXT",

        VkCommandBuffer("commandBuffer"),
        VkBool32("depthClampEnable")
    )

    void(
        "CmdSetPolygonModeEXT",

        VkCommandBuffer("commandBuffer"),
        VkPolygonMode("polygonMode")
    )

    void(
        "CmdSetRasterizationSamplesEXT",

        VkCommandBuffer("commandBuffer"),
        VkSampleCountFlagBits("rasterizationSamples")
    )

    void(
        "CmdSetSampleMaskEXT",

        VkCommandBuffer("commandBuffer"),
        VkSampleCountFlagBits("samples"),
        Unsafe..VkSampleMask.const.p("pSampleMask")
    )

    void(
        "CmdSetAlphaToCoverageEnableEXT",

        VkCommandBuffer("commandBuffer"),
        VkBool32("alphaToCoverageEnable")
    )

    void(
        "CmdSetAlphaToOneEnableEXT",

        VkCommandBuffer("commandBuffer"),
        VkBool32("alphaToOneEnable")
    )

    void(
        "CmdSetLogicOpEnableEXT",

        VkCommandBuffer("commandBuffer"),
        VkBool32("logicOpEnable")
    )

    void(
        "CmdSetColorBlendEnableEXT",

        VkCommandBuffer("commandBuffer"),
        uint32_t("firstAttachment"),
        AutoSize("pColorBlendEnables")..uint32_t("attachmentCount"),
        VkBool32.const.p("pColorBlendEnables")
    )

    void(
        "CmdSetColorBlendEquationEXT",

        VkCommandBuffer("commandBuffer"),
        uint32_t("firstAttachment"),
        AutoSize("pColorBlendEquations")..uint32_t("attachmentCount"),
        VkColorBlendEquationEXT.const.p("pColorBlendEquations")
    )

    void(
        "CmdSetColorWriteMaskEXT",

        VkCommandBuffer("commandBuffer"),
        uint32_t("firstAttachment"),
        AutoSize("pColorWriteMasks")..uint32_t("attachmentCount"),
        VkColorComponentFlags.const.p("pColorWriteMasks")
    )

    DependsOn("""ext.contains("VK_KHR_maintenance2") || ext.contains("Vulkan11")""")..void(
        "CmdSetTessellationDomainOriginEXT",

        VkCommandBuffer("commandBuffer"),
        VkTessellationDomainOrigin("domainOrigin")
    )

    DependsOn("VK_EXT_transform_feedback")..void(
        "CmdSetRasterizationStreamEXT",

        VkCommandBuffer("commandBuffer"),
        uint32_t("rasterizationStream")
    )

    DependsOn("VK_EXT_conservative_rasterization")..void(
        "CmdSetConservativeRasterizationModeEXT",

        VkCommandBuffer("commandBuffer"),
        VkConservativeRasterizationModeEXT("conservativeRasterizationMode")
    )

    DependsOn("VK_EXT_conservative_rasterization")..void(
        "CmdSetExtraPrimitiveOverestimationSizeEXT",

        VkCommandBuffer("commandBuffer"),
        float("extraPrimitiveOverestimationSize")
    )

    DependsOn("VK_EXT_depth_clip_enable")..void(
        "CmdSetDepthClipEnableEXT",

        VkCommandBuffer("commandBuffer"),
        VkBool32("depthClipEnable")
    )

    DependsOn("VK_EXT_sample_locations")..void(
        "CmdSetSampleLocationsEnableEXT",

        VkCommandBuffer("commandBuffer"),
        VkBool32("sampleLocationsEnable")
    )

    DependsOn("VK_EXT_blend_operation_advanced")..void(
        "CmdSetColorBlendAdvancedEXT",

        VkCommandBuffer("commandBuffer"),
        uint32_t("firstAttachment"),
        AutoSize("pColorBlendAdvanced")..uint32_t("attachmentCount"),
        VkColorBlendAdvancedEXT.const.p("pColorBlendAdvanced")
    )

    DependsOn("VK_EXT_provoking_vertex")..void(
        "CmdSetProvokingVertexModeEXT",

        VkCommandBuffer("commandBuffer"),
        VkProvokingVertexModeEXT("provokingVertexMode")
    )

    DependsOn("VK_EXT_line_rasterization")..void(
        "CmdSetLineRasterizationModeEXT",

        VkCommandBuffer("commandBuffer"),
        VkLineRasterizationModeEXT("lineRasterizationMode")
    )

    DependsOn("VK_EXT_line_rasterization")..void(
        "CmdSetLineStippleEnableEXT",

        VkCommandBuffer("commandBuffer"),
        VkBool32("stippledLineEnable")
    )

    DependsOn("VK_EXT_depth_clip_control")..void(
        "CmdSetDepthClipNegativeOneToOneEXT",

        VkCommandBuffer("commandBuffer"),
        VkBool32("negativeOneToOne")
    )

    DependsOn("VK_NV_clip_space_w_scaling")..void(
        "CmdSetViewportWScalingEnableNV",

        VkCommandBuffer("commandBuffer"),
        VkBool32("viewportWScalingEnable")
    )

    DependsOn("VK_NV_viewport_swizzle")..void(
        "CmdSetViewportSwizzleNV",

        VkCommandBuffer("commandBuffer"),
        uint32_t("firstViewport"),
        AutoSize("pViewportSwizzles")..uint32_t("viewportCount"),
        VkViewportSwizzleNV.const.p("pViewportSwizzles")
    )

    DependsOn("VK_NV_fragment_coverage_to_color")..void(
        "CmdSetCoverageToColorEnableNV",

        VkCommandBuffer("commandBuffer"),
        VkBool32("coverageToColorEnable")
    )

    DependsOn("VK_NV_fragment_coverage_to_color")..void(
        "CmdSetCoverageToColorLocationNV",

        VkCommandBuffer("commandBuffer"),
        uint32_t("coverageToColorLocation")
    )

    DependsOn("VK_NV_framebuffer_mixed_samples")..void(
        "CmdSetCoverageModulationModeNV",

        VkCommandBuffer("commandBuffer"),
        VkCoverageModulationModeNV("coverageModulationMode")
    )

    DependsOn("VK_NV_framebuffer_mixed_samples")..void(
        "CmdSetCoverageModulationTableEnableNV",

        VkCommandBuffer("commandBuffer"),
        VkBool32("coverageModulationTableEnable")
    )

    DependsOn("VK_NV_framebuffer_mixed_samples")..void(
        "CmdSetCoverageModulationTableNV",

        VkCommandBuffer("commandBuffer"),
        AutoSize("pCoverageModulationTable")..uint32_t("coverageModulationTableCount"),
        float.const.p("pCoverageModulationTable")
    )

    DependsOn("VK_NV_shading_rate_image")..void(
        "CmdSetShadingRateImageEnableNV",

        VkCommandBuffer("commandBuffer"),
        VkBool32("shadingRateImageEnable")
    )

    DependsOn("VK_NV_representative_fragment_test")..void(
        "CmdSetRepresentativeFragmentTestEnableNV",

        VkCommandBuffer("commandBuffer"),
        VkBool32("representativeFragmentTestEnable")
    )

    DependsOn("VK_NV_coverage_reduction_mode")..void(
        "CmdSetCoverageReductionModeNV",

        VkCommandBuffer("commandBuffer"),
        VkCoverageReductionModeNV("coverageReductionMode")
    )
}