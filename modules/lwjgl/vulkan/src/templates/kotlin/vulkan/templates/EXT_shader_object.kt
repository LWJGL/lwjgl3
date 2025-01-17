/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_shader_object = "EXTShaderObject".nativeClassVK("EXT_shader_object", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_SHADER_OBJECT_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_SHADER_OBJECT_EXTENSION_NAME".."VK_EXT_shader_object"
    )

    EnumConstant(
        "STRUCTURE_TYPE_SHADER_REQUIRED_SUBGROUP_SIZE_CREATE_INFO_EXT".."1000225001",
        "STRUCTURE_TYPE_VERTEX_INPUT_BINDING_DESCRIPTION_2_EXT".."1000352001",
        "STRUCTURE_TYPE_VERTEX_INPUT_ATTRIBUTE_DESCRIPTION_2_EXT".."1000352002",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_FEATURES_EXT".."1000482000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_PROPERTIES_EXT".."1000482001",
        "STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT".."1000482002"
    )

    EnumConstant(
        "OBJECT_TYPE_SHADER_EXT".."1000482000"
    )

    EnumConstant(
        "INCOMPATIBLE_SHADER_BINARY_EXT".."1000482000",
        "ERROR_INCOMPATIBLE_SHADER_BINARY_EXT".."1000482000"
    )

    EnumConstant(
        "SHADER_CREATE_LINK_STAGE_BIT_EXT".enum(0x00000001),
        "SHADER_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT_EXT".enum(0x00000002),
        "SHADER_CREATE_REQUIRE_FULL_SUBGROUPS_BIT_EXT".enum(0x00000004),
        "SHADER_CREATE_NO_TASK_SHADER_BIT_EXT".enum(0x00000008),
        "SHADER_CREATE_DISPATCH_BASE_BIT_EXT".enum(0x00000010),
        "SHADER_CREATE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_EXT".enum(0x00000020),
        "SHADER_CREATE_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT".enum(0x00000040)
    )

    EnumConstant(
        "SHADER_CODE_TYPE_BINARY_EXT".."0",
        "SHADER_CODE_TYPE_SPIRV_EXT".."1"
    )

    EnumConstant(
        "DEPTH_CLAMP_MODE_VIEWPORT_RANGE_EXT".."0",
        "DEPTH_CLAMP_MODE_USER_DEFINED_RANGE_EXT".."1"
    )

    VkResult(
        "CreateShadersEXT",

        VkDevice("device"),
        AutoSize("pCreateInfos", "pShaders")..uint32_t("createInfoCount"),
        VkShaderCreateInfoEXT.const.p("pCreateInfos"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        VkShaderEXT.p("pShaders")
    )

    void(
        "DestroyShaderEXT",

        VkDevice("device"),
        VkShaderEXT("shader"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    VkResult(
        "GetShaderBinaryDataEXT",

        VkDevice("device"),
        VkShaderEXT("shader"),
        AutoSize("pData")..Check(1)..size_t.p("pDataSize"),
        nullable..void.p("pData")
    )

    void(
        "CmdBindShadersEXT",

        VkCommandBuffer("commandBuffer"),
        AutoSize("pStages", "pShaders")..uint32_t("stageCount"),
        VkShaderStageFlagBits.const.p("pStages"),
        VkShaderEXT.const.p("pShaders")
    )

    void(
        "CmdSetCullModeEXT",

        VkCommandBuffer("commandBuffer"),
        VkCullModeFlags("cullMode")
    )

    void(
        "CmdSetFrontFaceEXT",

        VkCommandBuffer("commandBuffer"),
        VkFrontFace("frontFace")
    )

    void(
        "CmdSetPrimitiveTopologyEXT",

        VkCommandBuffer("commandBuffer"),
        VkPrimitiveTopology("primitiveTopology")
    )

    void(
        "CmdSetViewportWithCountEXT",

        VkCommandBuffer("commandBuffer"),
        AutoSize("pViewports")..uint32_t("viewportCount"),
        VkViewport.const.p("pViewports")
    )

    void(
        "CmdSetScissorWithCountEXT",

        VkCommandBuffer("commandBuffer"),
        AutoSize("pScissors")..uint32_t("scissorCount"),
        VkRect2D.const.p("pScissors")
    )

    void(
        "CmdBindVertexBuffers2EXT",

        VkCommandBuffer("commandBuffer"),
        uint32_t("firstBinding"),
        AutoSize("pBuffers", "pOffsets", "pSizes", "pStrides")..uint32_t("bindingCount"),
        VkBuffer.const.p("pBuffers"),
        VkDeviceSize.const.p("pOffsets"),
        nullable..VkDeviceSize.const.p("pSizes"),
        nullable..VkDeviceSize.const.p("pStrides")
    )

    void(
        "CmdSetDepthTestEnableEXT",

        VkCommandBuffer("commandBuffer"),
        VkBool32("depthTestEnable")
    )

    void(
        "CmdSetDepthWriteEnableEXT",

        VkCommandBuffer("commandBuffer"),
        VkBool32("depthWriteEnable")
    )

    void(
        "CmdSetDepthCompareOpEXT",

        VkCommandBuffer("commandBuffer"),
        VkCompareOp("depthCompareOp")
    )

    void(
        "CmdSetDepthBoundsTestEnableEXT",

        VkCommandBuffer("commandBuffer"),
        VkBool32("depthBoundsTestEnable")
    )

    void(
        "CmdSetStencilTestEnableEXT",

        VkCommandBuffer("commandBuffer"),
        VkBool32("stencilTestEnable")
    )

    void(
        "CmdSetStencilOpEXT",

        VkCommandBuffer("commandBuffer"),
        VkStencilFaceFlags("faceMask"),
        VkStencilOp("failOp"),
        VkStencilOp("passOp"),
        VkStencilOp("depthFailOp"),
        VkCompareOp("compareOp")
    )

    void(
        "CmdSetVertexInputEXT",

        VkCommandBuffer("commandBuffer"),
        AutoSize("pVertexBindingDescriptions")..uint32_t("vertexBindingDescriptionCount"),
        nullable..VkVertexInputBindingDescription2EXT.const.p("pVertexBindingDescriptions"),
        AutoSize("pVertexAttributeDescriptions")..uint32_t("vertexAttributeDescriptionCount"),
        nullable..VkVertexInputAttributeDescription2EXT.const.p("pVertexAttributeDescriptions")
    )

    void(
        "CmdSetPatchControlPointsEXT",

        VkCommandBuffer("commandBuffer"),
        uint32_t("patchControlPoints")
    )

    void(
        "CmdSetRasterizerDiscardEnableEXT",

        VkCommandBuffer("commandBuffer"),
        VkBool32("rasterizerDiscardEnable")
    )

    void(
        "CmdSetDepthBiasEnableEXT",

        VkCommandBuffer("commandBuffer"),
        VkBool32("depthBiasEnable")
    )

    void(
        "CmdSetLogicOpEXT",

        VkCommandBuffer("commandBuffer"),
        VkLogicOp("logicOp")
    )

    void(
        "CmdSetPrimitiveRestartEnableEXT",

        VkCommandBuffer("commandBuffer"),
        VkBool32("primitiveRestartEnable")
    )

    void(
        "CmdSetTessellationDomainOriginEXT",

        VkCommandBuffer("commandBuffer"),
        VkTessellationDomainOrigin("domainOrigin")
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

    DependsOn("VK_EXT_depth_clamp_control")..void(
        "CmdSetDepthClampRangeEXT",

        VkCommandBuffer("commandBuffer"),
        VkDepthClampModeEXT("depthClampMode"),
        nullable..VkDepthClampRangeEXT.const.p("pDepthClampRange")
    )
}