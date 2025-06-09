/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val VK14 = "VK14".nativeClass(Module.VULKAN, "VK14", prefix = "VK", binding = VK_BINDING_INSTANCE) {
    extends = VK13
    
    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_FEATURES".."55",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_PROPERTIES".."56",
        "STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO".."1000068000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES".."1000068001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_PROPERTIES".."1000068002",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES".."1000080000",
        "STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO".."1000174000",
        "STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO".."1000190001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES".."1000190002",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES".."1000232000",
        "STRUCTURE_TYPE_RENDERING_ATTACHMENT_LOCATION_INFO".."1000232001",
        "STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO".."1000232002",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES".."1000259000",
        "STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO".."1000259001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES".."1000259002",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES".."1000265000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_FEATURES".."1000270000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES".."1000270001",
        "STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY".."1000270002",
        "STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY".."1000270003",
        "STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO".."1000270004",
        "STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO".."1000270005",
        "STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO".."1000270006",
        "STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO".."1000270007",
        "STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE".."1000270008",
        "STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY".."1000270009",
        "STRUCTURE_TYPE_MEMORY_MAP_INFO".."1000271000",
        "STRUCTURE_TYPE_MEMORY_UNMAP_INFO".."1000271001",
        "STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2".."1000338002",
        "STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2".."1000338003",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES".."1000388000",
        "STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES".."1000388001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES".."1000416000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROTECTED_ACCESS_FEATURES".."1000466000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_FEATURES".."1000470000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES".."1000470001",
        "STRUCTURE_TYPE_RENDERING_AREA_INFO".."1000470003",
        "STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO".."1000470004",
        "STRUCTURE_TYPE_PIPELINE_CREATE_FLAGS_2_CREATE_INFO".."1000470005",
        "STRUCTURE_TYPE_BUFFER_USAGE_FLAGS_2_CREATE_INFO".."1000470006",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES".."1000525000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT_CONTROLS_2_FEATURES".."1000528000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EXPECT_ASSUME_FEATURES".."1000544000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_FEATURES".."1000545000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES".."1000545001",
        "STRUCTURE_TYPE_BIND_MEMORY_STATUS".."1000545002",
        "STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO".."1000545003",
        "STRUCTURE_TYPE_PUSH_CONSTANTS_INFO".."1000545004",
        "STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO".."1000545005",
        "STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO".."1000545006"
    )

    EnumConstant(
        "ERROR_NOT_PERMITTED".."-1000174001"
    )

    EnumConstant(
        "ATTACHMENT_LOAD_OP_NONE".."1000400000"
    )

    EnumConstant(
        "SUBGROUP_FEATURE_ROTATE_BIT".enum(0x00000200),
        "SUBGROUP_FEATURE_ROTATE_CLUSTERED_BIT".enum(0x00000400)
    )

    EnumConstant(
        "DYNAMIC_STATE_LINE_STIPPLE".."1000259000"
    )

    EnumConstant(
        "INDEX_TYPE_UINT8".."1000265000"
    )

    EnumConstant(
        "FORMAT_A1B5G5R5_UNORM_PACK16".."1000470000",
        "FORMAT_A8_UNORM".."1000470001"
    )

    EnumConstantLong(
        "BUFFER_USAGE_2_TRANSFER_SRC_BIT".enum(0x00000001L),
        "BUFFER_USAGE_2_TRANSFER_DST_BIT".enum(0x00000002L),
        "BUFFER_USAGE_2_UNIFORM_TEXEL_BUFFER_BIT".enum(0x00000004L),
        "BUFFER_USAGE_2_STORAGE_TEXEL_BUFFER_BIT".enum(0x00000008L),
        "BUFFER_USAGE_2_UNIFORM_BUFFER_BIT".enum(0x00000010L),
        "BUFFER_USAGE_2_STORAGE_BUFFER_BIT".enum(0x00000020L),
        "BUFFER_USAGE_2_INDEX_BUFFER_BIT".enum(0x00000040L),
        "BUFFER_USAGE_2_VERTEX_BUFFER_BIT".enum(0x00000080L),
        "BUFFER_USAGE_2_INDIRECT_BUFFER_BIT".enum(0x00000100L),
        "BUFFER_USAGE_2_SHADER_DEVICE_ADDRESS_BIT".enum(0x00020000L)
    )

    EnumConstant(
        "DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT".enum(0x00000001)
    )

    EnumConstant(
        "DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS".."1"
    )

    EnumConstant(
        "IMAGE_LAYOUT_RENDERING_LOCAL_READ".."1000232000"
    )

    EnumConstant(
        "PIPELINE_CREATE_NO_PROTECTED_ACCESS_BIT".enum(0x08000000),
        "PIPELINE_CREATE_PROTECTED_ACCESS_ONLY_BIT".enum(0x40000000)
    )

    EnumConstant(
        "IMAGE_USAGE_HOST_TRANSFER_BIT".enum(0x00400000)
    )

    EnumConstantLong(
        "FORMAT_FEATURE_2_HOST_IMAGE_TRANSFER_BIT".enum(0x400000000000L)
    )

    EnumConstant(
        "PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DEVICE_DEFAULT".."0",
        "PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DISABLED".."1",
        "PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS".."2",
        "PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2".."3"
    )

    EnumConstant(
        "PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DEVICE_DEFAULT".."0",
        "PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DISABLED".."1",
        "PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS".."2",
        "PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS_2".."3"
    )

    EnumConstant(
        "QUEUE_GLOBAL_PRIORITY_LOW".."128",
        "QUEUE_GLOBAL_PRIORITY_MEDIUM".."256",
        "QUEUE_GLOBAL_PRIORITY_HIGH".."512",
        "QUEUE_GLOBAL_PRIORITY_REALTIME".."1024"
    )

    EnumConstant(
        "LINE_RASTERIZATION_MODE_DEFAULT".."0",
        "LINE_RASTERIZATION_MODE_RECTANGULAR".."1",
        "LINE_RASTERIZATION_MODE_BRESENHAM".."2",
        "LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH".."3"
    )

    EnumConstantLong(
        "PIPELINE_CREATE_2_DISABLE_OPTIMIZATION_BIT".enum(0x00000001L),
        "PIPELINE_CREATE_2_ALLOW_DERIVATIVES_BIT".enum(0x00000002L),
        "PIPELINE_CREATE_2_DERIVATIVE_BIT".enum(0x00000004L),
        "PIPELINE_CREATE_2_VIEW_INDEX_FROM_DEVICE_INDEX_BIT".enum(0x00000008L),
        "PIPELINE_CREATE_2_DISPATCH_BASE_BIT".enum(0x00000010L),
        "PIPELINE_CREATE_2_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT".enum(0x00000100L),
        "PIPELINE_CREATE_2_EARLY_RETURN_ON_FAILURE_BIT".enum(0x00000200L),
        "PIPELINE_CREATE_2_NO_PROTECTED_ACCESS_BIT".enum(0x08000000L),
        "PIPELINE_CREATE_2_PROTECTED_ACCESS_ONLY_BIT".enum(0x40000000L)
    )

    EnumConstant(
        "HOST_IMAGE_COPY_MEMCPY_BIT".enum(0x00000001),
        "HOST_IMAGE_COPY_MEMCPY".enum(0x00000001)
    )

    // Promoted from VK_KHR_line_rasterization (extension 535) 'Roadmap 2024'

    void(
        "CmdSetLineStipple",

        VkCommandBuffer("commandBuffer"),
        uint32_t("lineStippleFactor"),
        uint16_t("lineStipplePattern")
    )

    // Promoted from VK_KHR_map_memory2 (extension 272) 'Roadmap 2024'

    VkResult(
        "MapMemory2",

        VkDevice("device"),
        VkMemoryMapInfo.const.p("pMemoryMapInfo"),
        Check(1)..void.p.p("ppData")
    )

    VkResult(
        "UnmapMemory2",

        VkDevice("device"),
        VkMemoryUnmapInfo.const.p("pMemoryUnmapInfo")
    )

    // Promoted from VK_KHR_maintenance5 (extension 471) 'Roadmap 2024'

    void(
        "CmdBindIndexBuffer2",

        VkCommandBuffer("commandBuffer"),
        VkBuffer("buffer"),
        VkDeviceSize("offset"),
        VkDeviceSize("size"),
        VkIndexType("indexType")
    )

    void(
        "GetRenderingAreaGranularity",

        VkDevice("device"),
        VkRenderingAreaInfo.const.p("pRenderingAreaInfo"),
        VkExtent2D.p("pGranularity")
    )

    void(
        "GetDeviceImageSubresourceLayout",

        VkDevice("device"),
        VkDeviceImageSubresourceInfo.const.p("pInfo"),
        VkSubresourceLayout2.p("pLayout")
    )

    void(
        "GetImageSubresourceLayout2",

        VkDevice("device"),
        VkImage("image"),
        VkImageSubresource2.const.p("pSubresource"),
        VkSubresourceLayout2.p("pLayout")
    )

    // Promoted from VK_KHR_push_descriptor (extension 81) 'Roadmap 2024'

    void(
        "CmdPushDescriptorSet",

        VkCommandBuffer("commandBuffer"),
        VkPipelineBindPoint("pipelineBindPoint"),
        VkPipelineLayout("layout"),
        uint32_t("set"),
        AutoSize("pDescriptorWrites")..uint32_t("descriptorWriteCount"),
        VkWriteDescriptorSet.const.p("pDescriptorWrites")
    )

    void(
        "CmdPushDescriptorSetWithTemplate",

        VkCommandBuffer("commandBuffer"),
        VkDescriptorUpdateTemplate("descriptorUpdateTemplate"),
        VkPipelineLayout("layout"),
        uint32_t("set"),
        nullable..opaque_const_p("pData")
    )

    // Promoted from VK_KHR_dynamic_rendering_local_read (extension 233) 'Roadmap 2024'

    void(
        "CmdSetRenderingAttachmentLocations",

        VkCommandBuffer("commandBuffer"),
        VkRenderingAttachmentLocationInfo.const.p("pLocationInfo")
    )

    void(
        "CmdSetRenderingInputAttachmentIndices",

        VkCommandBuffer("commandBuffer"),
        VkRenderingInputAttachmentIndexInfo.const.p("pInputAttachmentIndexInfo")
    )

    // Promoted from VK_KHR_maintenance6 (extension 546) 'additional functionality'

    void(
        "CmdBindDescriptorSets2",

        VkCommandBuffer("commandBuffer"),
        VkBindDescriptorSetsInfo.const.p("pBindDescriptorSetsInfo")
    )

    void(
        "CmdPushConstants2",

        VkCommandBuffer("commandBuffer"),
        VkPushConstantsInfo.const.p("pPushConstantsInfo")
    )

    void(
        "CmdPushDescriptorSet2",

        VkCommandBuffer("commandBuffer"),
        VkPushDescriptorSetInfo.const.p("pPushDescriptorSetInfo")
    )

    void(
        "CmdPushDescriptorSetWithTemplate2",

        VkCommandBuffer("commandBuffer"),
        VkPushDescriptorSetWithTemplateInfo.const.p("pPushDescriptorSetWithTemplateInfo")
    )

    // Promoted (as optional feature) from VK_EXT_host_image_copy (extension 271) 'streaming transfers'

    VkResult(
        "CopyMemoryToImage",

        VkDevice("device"),
        VkCopyMemoryToImageInfo.const.p("pCopyMemoryToImageInfo")
    )

    VkResult(
        "CopyImageToMemory",

        VkDevice("device"),
        VkCopyImageToMemoryInfo.const.p("pCopyImageToMemoryInfo")
    )

    VkResult(
        "CopyImageToImage",

        VkDevice("device"),
        VkCopyImageToImageInfo.const.p("pCopyImageToImageInfo")
    )

    VkResult(
        "TransitionImageLayout",

        VkDevice("device"),
        AutoSize("pTransitions")..uint32_t("transitionCount"),
        VkHostImageLayoutTransitionInfo.const.p("pTransitions")
    )

}