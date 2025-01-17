/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val VK13 = "VK13".nativeClass(Module.VULKAN, "VK13", prefix = "VK", binding = VK_BINDING_INSTANCE) {
    extends = VK12
    
    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_FEATURES".."53",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_PROPERTIES".."54",
        "STRUCTURE_TYPE_RENDERING_INFO".."1000044000",
        "STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO".."1000044001",
        "STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO".."1000044002",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES".."1000044003",
        "STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO".."1000044004",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES".."1000066000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES".."1000138000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES".."1000138001",
        "STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK".."1000138002",
        "STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO".."1000138003",
        "STRUCTURE_TYPE_PIPELINE_CREATION_FEEDBACK_CREATE_INFO".."1000192000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TERMINATE_INVOCATION_FEATURES".."1000215000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES".."1000225000",
        "STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO".."1000225001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES".."1000225002",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_TOOL_PROPERTIES".."1000245000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES".."1000276000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_FEATURES".."1000280000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES".."1000280001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_PROPERTIES".."1000281001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES".."1000295000",
        "STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO".."1000295001",
        "STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO".."1000295002",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES".."1000297000",
        "STRUCTURE_TYPE_MEMORY_BARRIER_2".."1000314000",
        "STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2".."1000314001",
        "STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2".."1000314002",
        "STRUCTURE_TYPE_DEPENDENCY_INFO".."1000314003",
        "STRUCTURE_TYPE_SUBMIT_INFO_2".."1000314004",
        "STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO".."1000314005",
        "STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO".."1000314006",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES".."1000314007",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES".."1000325000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ROBUSTNESS_FEATURES".."1000335000",
        "STRUCTURE_TYPE_COPY_BUFFER_INFO_2".."1000337000",
        "STRUCTURE_TYPE_COPY_IMAGE_INFO_2".."1000337001",
        "STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2".."1000337002",
        "STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2".."1000337003",
        "STRUCTURE_TYPE_BLIT_IMAGE_INFO_2".."1000337004",
        "STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2".."1000337005",
        "STRUCTURE_TYPE_BUFFER_COPY_2".."1000337006",
        "STRUCTURE_TYPE_IMAGE_COPY_2".."1000337007",
        "STRUCTURE_TYPE_IMAGE_BLIT_2".."1000337008",
        "STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2".."1000337009",
        "STRUCTURE_TYPE_IMAGE_RESOLVE_2".."1000337010",
        "STRUCTURE_TYPE_FORMAT_PROPERTIES_3".."1000360000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_FEATURES".."1000413000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_PROPERTIES".."1000413001",
        "STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS".."1000413002",
        "STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS".."1000413003"
    )

    EnumConstant(
        "OBJECT_TYPE_PRIVATE_DATA_SLOT".."1000295000"
    )

    EnumConstant(
        "PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT".enum(0x00000100),
        "PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT".enum(0x00000200)
    )

    EnumConstant(
        "PIPELINE_COMPILE_REQUIRED".."1000297000"
    )

    EnumConstant(
        "PIPELINE_CACHE_CREATE_EXTERNALLY_SYNCHRONIZED_BIT".enum(0x00000001)
    )

    EnumConstant(
        "EVENT_CREATE_DEVICE_ONLY_BIT".enum(0x00000001)
    )

    EnumConstant(
        "IMAGE_LAYOUT_READ_ONLY_OPTIMAL".."1000314000",
        "IMAGE_LAYOUT_ATTACHMENT_OPTIMAL".."1000314001"
    )

    EnumConstant(
        "PIPELINE_STAGE_NONE".."0"
    )

    EnumConstant(
        "ACCESS_NONE".."0"
    )

    EnumConstant(
        "PIPELINE_SHADER_STAGE_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT".enum(0x00000001),
        "PIPELINE_SHADER_STAGE_CREATE_REQUIRE_FULL_SUBGROUPS_BIT".enum(0x00000002)
    )

    EnumConstant(
        "DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK".."1000138000"
    )

    EnumConstant(
        "FORMAT_ASTC_4x4_SFLOAT_BLOCK".."1000066000",
        "FORMAT_ASTC_5x4_SFLOAT_BLOCK".."1000066001",
        "FORMAT_ASTC_5x5_SFLOAT_BLOCK".."1000066002",
        "FORMAT_ASTC_6x5_SFLOAT_BLOCK".."1000066003",
        "FORMAT_ASTC_6x6_SFLOAT_BLOCK".."1000066004",
        "FORMAT_ASTC_8x5_SFLOAT_BLOCK".."1000066005",
        "FORMAT_ASTC_8x6_SFLOAT_BLOCK".."1000066006",
        "FORMAT_ASTC_8x8_SFLOAT_BLOCK".."1000066007",
        "FORMAT_ASTC_10x5_SFLOAT_BLOCK".."1000066008",
        "FORMAT_ASTC_10x6_SFLOAT_BLOCK".."1000066009",
        "FORMAT_ASTC_10x8_SFLOAT_BLOCK".."1000066010",
        "FORMAT_ASTC_10x10_SFLOAT_BLOCK".."1000066011",
        "FORMAT_ASTC_12x10_SFLOAT_BLOCK".."1000066012",
        "FORMAT_ASTC_12x12_SFLOAT_BLOCK".."1000066013",
        "FORMAT_G8_B8R8_2PLANE_444_UNORM".."1000330000",
        "FORMAT_G10X6_B10X6R10X6_2PLANE_444_UNORM_3PACK16".."1000330001",
        "FORMAT_G12X4_B12X4R12X4_2PLANE_444_UNORM_3PACK16".."1000330002",
        "FORMAT_G16_B16R16_2PLANE_444_UNORM".."1000330003",
        "FORMAT_A4R4G4B4_UNORM_PACK16".."1000340000",
        "FORMAT_A4B4G4R4_UNORM_PACK16".."1000340001"
    )

    EnumConstant(
        "ATTACHMENT_STORE_OP_NONE".."1000301000"
    )

    EnumConstant(
        "DYNAMIC_STATE_CULL_MODE".."1000267000",
        "DYNAMIC_STATE_FRONT_FACE".."1000267001",
        "DYNAMIC_STATE_PRIMITIVE_TOPOLOGY".."1000267002",
        "DYNAMIC_STATE_VIEWPORT_WITH_COUNT".."1000267003",
        "DYNAMIC_STATE_SCISSOR_WITH_COUNT".."1000267004",
        "DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE".."1000267005",
        "DYNAMIC_STATE_DEPTH_TEST_ENABLE".."1000267006",
        "DYNAMIC_STATE_DEPTH_WRITE_ENABLE".."1000267007",
        "DYNAMIC_STATE_DEPTH_COMPARE_OP".."1000267008",
        "DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE".."1000267009",
        "DYNAMIC_STATE_STENCIL_TEST_ENABLE".."1000267010",
        "DYNAMIC_STATE_STENCIL_OP".."1000267011",
        "DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE".."1000377001",
        "DYNAMIC_STATE_DEPTH_BIAS_ENABLE".."1000377002",
        "DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE".."1000377004"
    )

    EnumConstantLong(
        "FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT".enum(0x00000001L),
        "FORMAT_FEATURE_2_STORAGE_IMAGE_BIT".enum(0x00000002L),
        "FORMAT_FEATURE_2_STORAGE_IMAGE_ATOMIC_BIT".enum(0x00000004L),
        "FORMAT_FEATURE_2_UNIFORM_TEXEL_BUFFER_BIT".enum(0x00000008L),
        "FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_BIT".enum(0x00000010L),
        "FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_ATOMIC_BIT".enum(0x00000020L),
        "FORMAT_FEATURE_2_VERTEX_BUFFER_BIT".enum(0x00000040L),
        "FORMAT_FEATURE_2_COLOR_ATTACHMENT_BIT".enum(0x00000080L),
        "FORMAT_FEATURE_2_COLOR_ATTACHMENT_BLEND_BIT".enum(0x00000100L),
        "FORMAT_FEATURE_2_DEPTH_STENCIL_ATTACHMENT_BIT".enum(0x00000200L),
        "FORMAT_FEATURE_2_BLIT_SRC_BIT".enum(0x00000400L),
        "FORMAT_FEATURE_2_BLIT_DST_BIT".enum(0x00000800L),
        "FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_LINEAR_BIT".enum(0x00001000L),
        "FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_CUBIC_BIT".enum(0x00002000L),
        "FORMAT_FEATURE_2_TRANSFER_SRC_BIT".enum(0x00004000L),
        "FORMAT_FEATURE_2_TRANSFER_DST_BIT".enum(0x00008000L),
        "FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_MINMAX_BIT".enum(0x00010000L),
        "FORMAT_FEATURE_2_MIDPOINT_CHROMA_SAMPLES_BIT".enum(0x00020000L),
        "FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT".enum(0x00040000L),
        "FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT".enum(0x00080000L),
        "FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT".enum(0x00100000L),
        "FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT".enum(0x00200000L),
        "FORMAT_FEATURE_2_DISJOINT_BIT".enum(0x00400000L),
        "FORMAT_FEATURE_2_COSITED_CHROMA_SAMPLES_BIT".enum(0x00800000L),
        "FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT".enum(0x80000000L),
        "FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT".enum(0x100000000L),
        "FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT".enum(0x200000000L)
    )

    EnumConstant(
        "IMAGE_ASPECT_NONE".."0"
    )

    EnumConstant(
        "PIPELINE_CREATION_FEEDBACK_VALID_BIT".enum(0x00000001),
        "PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT".enum(0x00000002),
        "PIPELINE_CREATION_FEEDBACK_BASE_PIPELINE_ACCELERATION_BIT".enum(0x00000004)
    )

    EnumConstant(
        "TOOL_PURPOSE_VALIDATION_BIT".enum(0x00000001),
        "TOOL_PURPOSE_PROFILING_BIT".enum(0x00000002),
        "TOOL_PURPOSE_TRACING_BIT".enum(0x00000004),
        "TOOL_PURPOSE_ADDITIONAL_FEATURES_BIT".enum(0x00000008),
        "TOOL_PURPOSE_MODIFYING_FEATURES_BIT".enum(0x00000010)
    )

    EnumConstantLong(
        "PIPELINE_STAGE_2_NONE".."0L",
        "PIPELINE_STAGE_2_TOP_OF_PIPE_BIT".enum(0x00000001L),
        "PIPELINE_STAGE_2_DRAW_INDIRECT_BIT".enum(0x00000002L),
        "PIPELINE_STAGE_2_VERTEX_INPUT_BIT".enum(0x00000004L),
        "PIPELINE_STAGE_2_VERTEX_SHADER_BIT".enum(0x00000008L),
        "PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT".enum(0x00000010L),
        "PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT".enum(0x00000020L),
        "PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT".enum(0x00000040L),
        "PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT".enum(0x00000080L),
        "PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT".enum(0x00000100L),
        "PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT".enum(0x00000200L),
        "PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT".enum(0x00000400L),
        "PIPELINE_STAGE_2_COMPUTE_SHADER_BIT".enum(0x00000800L),
        "PIPELINE_STAGE_2_ALL_TRANSFER_BIT".enum(0x00001000L),
        "PIPELINE_STAGE_2_TRANSFER_BIT".enum(0x00001000L),
        "PIPELINE_STAGE_2_BOTTOM_OF_PIPE_BIT".enum(0x00002000L),
        "PIPELINE_STAGE_2_HOST_BIT".enum(0x00004000L),
        "PIPELINE_STAGE_2_ALL_GRAPHICS_BIT".enum(0x00008000L),
        "PIPELINE_STAGE_2_ALL_COMMANDS_BIT".enum(0x00010000L),
        "PIPELINE_STAGE_2_COPY_BIT".enum(0x100000000L),
        "PIPELINE_STAGE_2_RESOLVE_BIT".enum(0x200000000L),
        "PIPELINE_STAGE_2_BLIT_BIT".enum(0x400000000L),
        "PIPELINE_STAGE_2_CLEAR_BIT".enum(0x800000000L),
        "PIPELINE_STAGE_2_INDEX_INPUT_BIT".enum(0x1000000000L),
        "PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT".enum(0x2000000000L),
        "PIPELINE_STAGE_2_PRE_RASTERIZATION_SHADERS_BIT".enum(0x4000000000L)
    )

    EnumConstantLong(
        "ACCESS_2_NONE".."0L",
        "ACCESS_2_INDIRECT_COMMAND_READ_BIT".enum(0x00000001L),
        "ACCESS_2_INDEX_READ_BIT".enum(0x00000002L),
        "ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT".enum(0x00000004L),
        "ACCESS_2_UNIFORM_READ_BIT".enum(0x00000008L),
        "ACCESS_2_INPUT_ATTACHMENT_READ_BIT".enum(0x00000010L),
        "ACCESS_2_SHADER_READ_BIT".enum(0x00000020L),
        "ACCESS_2_SHADER_WRITE_BIT".enum(0x00000040L),
        "ACCESS_2_COLOR_ATTACHMENT_READ_BIT".enum(0x00000080L),
        "ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT".enum(0x00000100L),
        "ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT".enum(0x00000200L),
        "ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT".enum(0x00000400L),
        "ACCESS_2_TRANSFER_READ_BIT".enum(0x00000800L),
        "ACCESS_2_TRANSFER_WRITE_BIT".enum(0x00001000L),
        "ACCESS_2_HOST_READ_BIT".enum(0x00002000L),
        "ACCESS_2_HOST_WRITE_BIT".enum(0x00004000L),
        "ACCESS_2_MEMORY_READ_BIT".enum(0x00008000L),
        "ACCESS_2_MEMORY_WRITE_BIT".enum(0x00010000L),
        "ACCESS_2_SHADER_SAMPLED_READ_BIT".enum(0x100000000L),
        "ACCESS_2_SHADER_STORAGE_READ_BIT".enum(0x200000000L),
        "ACCESS_2_SHADER_STORAGE_WRITE_BIT".enum(0x400000000L)
    )

    EnumConstant(
        "SUBMIT_PROTECTED_BIT".enum(0x00000001)
    )

    EnumConstant(
        "RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT".enum(0x00000001),
        "RENDERING_SUSPENDING_BIT".enum(0x00000002),
        "RENDERING_RESUMING_BIT".enum(0x00000004)
    )

    // Promoted from VK_EXT_tooling_info (extension 246)

    VkResult(
        "GetPhysicalDeviceToolProperties",

        VkPhysicalDevice("physicalDevice"),
        AutoSize("pToolProperties")..Check(1)..uint32_t.p("pToolCount"),
        nullable..VkPhysicalDeviceToolProperties.p("pToolProperties")
    )

    // Promoted from VK_EXT_private_data (extension 296)

    VkResult(
        "CreatePrivateDataSlot",

        VkDevice("device"),
        VkPrivateDataSlotCreateInfo.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkPrivateDataSlot.p("pPrivateDataSlot")
    )

    void(
        "DestroyPrivateDataSlot",

        VkDevice("device"),
        VkPrivateDataSlot("privateDataSlot"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    VkResult(
        "SetPrivateData",

        VkDevice("device"),
        VkObjectType("objectType"),
        uint64_t("objectHandle"),
        VkPrivateDataSlot("privateDataSlot"),
        uint64_t("data")
    )

    void(
        "GetPrivateData",

        VkDevice("device"),
        VkObjectType("objectType"),
        uint64_t("objectHandle"),
        VkPrivateDataSlot("privateDataSlot"),
        Check(1)..uint64_t.p("pData")
    )

    // Promoted from VK_KHR_synchronization2 (extension 315)

    void(
        "CmdSetEvent2",

        VkCommandBuffer("commandBuffer"),
        VkEvent("event"),
        VkDependencyInfo.const.p("pDependencyInfo")
    )

    void(
        "CmdResetEvent2",

        VkCommandBuffer("commandBuffer"),
        VkEvent("event"),
        VkPipelineStageFlags2("stageMask")
    )

    void(
        "CmdWaitEvents2",

        VkCommandBuffer("commandBuffer"),
        AutoSize("pEvents", "pDependencyInfos")..uint32_t("eventCount"),
        VkEvent.const.p("pEvents"),
        VkDependencyInfo.const.p("pDependencyInfos")
    )

    void(
        "CmdPipelineBarrier2",

        VkCommandBuffer("commandBuffer"),
        VkDependencyInfo.const.p("pDependencyInfo")
    )

    void(
        "CmdWriteTimestamp2",

        VkCommandBuffer("commandBuffer"),
        VkPipelineStageFlags2("stage"),
        VkQueryPool("queryPool"),
        uint32_t("query")
    )

    VkResult(
        "QueueSubmit2",

        VkQueue("queue"),
        AutoSize("pSubmits")..uint32_t("submitCount"),
        nullable..VkSubmitInfo2.const.p("pSubmits"),
        VkFence("fence")
    )

    // Promoted from VK_KHR_copy_commands2 (extension 338)

    void(
        "CmdCopyBuffer2",

        VkCommandBuffer("commandBuffer"),
        VkCopyBufferInfo2.const.p("pCopyBufferInfo")
    )

    void(
        "CmdCopyImage2",

        VkCommandBuffer("commandBuffer"),
        VkCopyImageInfo2.const.p("pCopyImageInfo")
    )

    void(
        "CmdCopyBufferToImage2",

        VkCommandBuffer("commandBuffer"),
        VkCopyBufferToImageInfo2.const.p("pCopyBufferToImageInfo")
    )

    void(
        "CmdCopyImageToBuffer2",

        VkCommandBuffer("commandBuffer"),
        VkCopyImageToBufferInfo2.const.p("pCopyImageToBufferInfo")
    )

    void(
        "CmdBlitImage2",

        VkCommandBuffer("commandBuffer"),
        VkBlitImageInfo2.const.p("pBlitImageInfo")
    )

    void(
        "CmdResolveImage2",

        VkCommandBuffer("commandBuffer"),
        VkResolveImageInfo2.const.p("pResolveImageInfo")
    )

    // Promoted from VK_KHR_dynamic_rendering (extension 45)

    void(
        "CmdBeginRendering",

        VkCommandBuffer("commandBuffer"),
        VkRenderingInfo.const.p("pRenderingInfo")
    )

    void(
        "CmdEndRendering",

        VkCommandBuffer("commandBuffer")
    )

    // Promoted from VK_EXT_extended_dynamic_state (Feature struct is not promoted) (extension 268)

    void(
        "CmdSetCullMode",

        VkCommandBuffer("commandBuffer"),
        VkCullModeFlags("cullMode")
    )

    void(
        "CmdSetFrontFace",

        VkCommandBuffer("commandBuffer"),
        VkFrontFace("frontFace")
    )

    void(
        "CmdSetPrimitiveTopology",

        VkCommandBuffer("commandBuffer"),
        VkPrimitiveTopology("primitiveTopology")
    )

    void(
        "CmdSetViewportWithCount",

        VkCommandBuffer("commandBuffer"),
        AutoSize("pViewports")..uint32_t("viewportCount"),
        VkViewport.const.p("pViewports")
    )

    void(
        "CmdSetScissorWithCount",

        VkCommandBuffer("commandBuffer"),
        AutoSize("pScissors")..uint32_t("scissorCount"),
        VkRect2D.const.p("pScissors")
    )

    void(
        "CmdBindVertexBuffers2",

        VkCommandBuffer("commandBuffer"),
        uint32_t("firstBinding"),
        AutoSize("pBuffers", "pOffsets", "pSizes", "pStrides")..uint32_t("bindingCount"),
        VkBuffer.const.p("pBuffers"),
        VkDeviceSize.const.p("pOffsets"),
        nullable..VkDeviceSize.const.p("pSizes"),
        nullable..VkDeviceSize.const.p("pStrides")
    )

    void(
        "CmdSetDepthTestEnable",

        VkCommandBuffer("commandBuffer"),
        VkBool32("depthTestEnable")
    )

    void(
        "CmdSetDepthWriteEnable",

        VkCommandBuffer("commandBuffer"),
        VkBool32("depthWriteEnable")
    )

    void(
        "CmdSetDepthCompareOp",

        VkCommandBuffer("commandBuffer"),
        VkCompareOp("depthCompareOp")
    )

    void(
        "CmdSetDepthBoundsTestEnable",

        VkCommandBuffer("commandBuffer"),
        VkBool32("depthBoundsTestEnable")
    )

    void(
        "CmdSetStencilTestEnable",

        VkCommandBuffer("commandBuffer"),
        VkBool32("stencilTestEnable")
    )

    void(
        "CmdSetStencilOp",

        VkCommandBuffer("commandBuffer"),
        VkStencilFaceFlags("faceMask"),
        VkStencilOp("failOp"),
        VkStencilOp("passOp"),
        VkStencilOp("depthFailOp"),
        VkCompareOp("compareOp")
    )

    // Promoted from VK_EXT_extended_dynamic_state2 (Feature struct and optional state are not promoted) (extension 378)

    void(
        "CmdSetRasterizerDiscardEnable",

        VkCommandBuffer("commandBuffer"),
        VkBool32("rasterizerDiscardEnable")
    )

    void(
        "CmdSetDepthBiasEnable",

        VkCommandBuffer("commandBuffer"),
        VkBool32("depthBiasEnable")
    )

    void(
        "CmdSetPrimitiveRestartEnable",

        VkCommandBuffer("commandBuffer"),
        VkBool32("primitiveRestartEnable")
    )

    // Promoted from VK_KHR_maintenance4 (extension 414)

    void(
        "GetDeviceBufferMemoryRequirements",

        VkDevice("device"),
        VkDeviceBufferMemoryRequirements.const.p("pInfo"),
        VkMemoryRequirements2.p("pMemoryRequirements")
    )

    void(
        "GetDeviceImageMemoryRequirements",

        VkDevice("device"),
        VkDeviceImageMemoryRequirements.const.p("pInfo"),
        VkMemoryRequirements2.p("pMemoryRequirements")
    )

    void(
        "GetDeviceImageSparseMemoryRequirements",

        VkDevice("device"),
        VkDeviceImageMemoryRequirements.const.p("pInfo"),
        AutoSize("pSparseMemoryRequirements")..Check(1)..uint32_t.p("pSparseMemoryRequirementCount"),
        nullable..VkSparseImageMemoryRequirements2.p("pSparseMemoryRequirements")
    )

}