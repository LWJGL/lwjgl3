/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_descriptor_heap = "EXTDescriptorHeap".nativeClassVK("EXT_descriptor_heap", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_DESCRIPTOR_HEAP_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_DESCRIPTOR_HEAP_EXTENSION_NAME".."VK_EXT_descriptor_heap"
    )

    EnumConstant(
        "BUFFER_USAGE_DESCRIPTOR_HEAP_BIT_EXT".enum(0x10000000)
    )

    EnumConstantLong(
        "BUFFER_USAGE_2_DESCRIPTOR_HEAP_BIT_EXT".enum(0x10000000L)
    )

    EnumConstantLong(
        "PIPELINE_CREATE_2_DESCRIPTOR_HEAP_BIT_EXT".enum(0x1000000000L)
    )

    EnumConstant(
        "IMAGE_CREATE_DESCRIPTOR_HEAP_CAPTURE_REPLAY_BIT_EXT".enum(0x00010000)
    )

    EnumConstant(
        "STRUCTURE_TYPE_TEXEL_BUFFER_DESCRIPTOR_INFO_EXT".."1000135000",
        "STRUCTURE_TYPE_IMAGE_DESCRIPTOR_INFO_EXT".."1000135001",
        "STRUCTURE_TYPE_RESOURCE_DESCRIPTOR_INFO_EXT".."1000135002",
        "STRUCTURE_TYPE_BIND_HEAP_INFO_EXT".."1000135003",
        "STRUCTURE_TYPE_PUSH_DATA_INFO_EXT".."1000135004",
        "STRUCTURE_TYPE_DESCRIPTOR_SET_AND_BINDING_MAPPING_EXT".."1000135005",
        "STRUCTURE_TYPE_SHADER_DESCRIPTOR_SET_AND_BINDING_MAPPING_INFO_EXT".."1000135006",
        "STRUCTURE_TYPE_OPAQUE_CAPTURE_DATA_CREATE_INFO_EXT".."1000135007",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_PROPERTIES_EXT".."1000135008",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_FEATURES_EXT".."1000135009",
        "STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_DESCRIPTOR_HEAP_INFO_EXT".."1000135010",
        "STRUCTURE_TYPE_SAMPLER_CUSTOM_BORDER_COLOR_INDEX_CREATE_INFO_EXT".."1000135011",
        "STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_PUSH_DATA_TOKEN_NV".."1000135012",
        "STRUCTURE_TYPE_SUBSAMPLED_IMAGE_FORMAT_PROPERTIES_EXT".."1000135013",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_TENSOR_PROPERTIES_ARM".."1000135014"
    )

    EnumConstantLong(
        "ACCESS_2_SAMPLER_HEAP_READ_BIT_EXT".enum(0x200000000000000L),
        "ACCESS_2_RESOURCE_HEAP_READ_BIT_EXT".enum(0x400000000000000L)
    )

    EnumConstant(
        "INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_DATA_EXT".."1000135000",
        "INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_DATA_SEQUENCE_INDEX_EXT".."1000135001"
    )

    EnumConstant(
        "INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_DATA_NV".."1000135000"
    )

    EnumConstant(
        "SHADER_CREATE_DESCRIPTOR_HEAP_BIT_EXT".enum(0x00000400)
    )

    EnumConstant(
        "DESCRIPTOR_MAPPING_SOURCE_HEAP_WITH_CONSTANT_OFFSET_EXT".."0",
        "DESCRIPTOR_MAPPING_SOURCE_HEAP_WITH_PUSH_INDEX_EXT".."1",
        "DESCRIPTOR_MAPPING_SOURCE_HEAP_WITH_INDIRECT_INDEX_EXT".."2",
        "DESCRIPTOR_MAPPING_SOURCE_HEAP_WITH_INDIRECT_INDEX_ARRAY_EXT".."3",
        "DESCRIPTOR_MAPPING_SOURCE_RESOURCE_HEAP_DATA_EXT".."4",
        "DESCRIPTOR_MAPPING_SOURCE_PUSH_DATA_EXT".."5",
        "DESCRIPTOR_MAPPING_SOURCE_PUSH_ADDRESS_EXT".."6",
        "DESCRIPTOR_MAPPING_SOURCE_INDIRECT_ADDRESS_EXT".."7",
        "DESCRIPTOR_MAPPING_SOURCE_HEAP_WITH_SHADER_RECORD_INDEX_EXT".."8",
        "DESCRIPTOR_MAPPING_SOURCE_SHADER_RECORD_DATA_EXT".."9",
        "DESCRIPTOR_MAPPING_SOURCE_SHADER_RECORD_ADDRESS_EXT".."10"
    )

    EnumConstant(
        "SPIRV_RESOURCE_TYPE_SAMPLER_BIT_EXT".enum(0x00000001),
        "SPIRV_RESOURCE_TYPE_SAMPLED_IMAGE_BIT_EXT".enum(0x00000002),
        "SPIRV_RESOURCE_TYPE_READ_ONLY_IMAGE_BIT_EXT".enum(0x00000004),
        "SPIRV_RESOURCE_TYPE_READ_WRITE_IMAGE_BIT_EXT".enum(0x00000008),
        "SPIRV_RESOURCE_TYPE_COMBINED_SAMPLED_IMAGE_BIT_EXT".enum(0x00000010),
        "SPIRV_RESOURCE_TYPE_UNIFORM_BUFFER_BIT_EXT".enum(0x00000020),
        "SPIRV_RESOURCE_TYPE_READ_ONLY_STORAGE_BUFFER_BIT_EXT".enum(0x00000040),
        "SPIRV_RESOURCE_TYPE_READ_WRITE_STORAGE_BUFFER_BIT_EXT".enum(0x00000080),
        "SPIRV_RESOURCE_TYPE_ACCELERATION_STRUCTURE_BIT_EXT".enum(0x00000100),
        "SPIRV_RESOURCE_TYPE_TENSOR_BIT_ARM".enum(0x00000200),
        "SPIRV_RESOURCE_TYPE_ALL_EXT".."0x7FFFFFFF"
    )

    EnumConstantLong(
        "TENSOR_CREATE_DESCRIPTOR_HEAP_CAPTURE_REPLAY_BIT_ARM".enum(0x00000008L)
    )

    VkResult(
        "WriteSamplerDescriptorsEXT",

        VkDevice("device"),
        AutoSize("pSamplers", "pDescriptors")..uint32_t("samplerCount"),
        VkSamplerCreateInfo.const.p("pSamplers"),
        VkHostAddressRangeEXT.const.p("pDescriptors")
    )

    VkResult(
        "WriteResourceDescriptorsEXT",

        VkDevice("device"),
        AutoSize("pResources", "pDescriptors")..uint32_t("resourceCount"),
        VkResourceDescriptorInfoEXT.const.p("pResources"),
        VkHostAddressRangeEXT.const.p("pDescriptors")
    )

    void(
        "CmdBindSamplerHeapEXT",

        VkCommandBuffer("commandBuffer"),
        VkBindHeapInfoEXT.const.p("pBindInfo")
    )

    void(
        "CmdBindResourceHeapEXT",

        VkCommandBuffer("commandBuffer"),
        VkBindHeapInfoEXT.const.p("pBindInfo")
    )

    void(
        "CmdPushDataEXT",

        VkCommandBuffer("commandBuffer"),
        VkPushDataInfoEXT.const.p("pPushDataInfo")
    )

    VkResult(
        "GetImageOpaqueCaptureDataEXT",

        VkDevice("device"),
        AutoSize("pImages", "pDatas")..uint32_t("imageCount"),
        VkImage.const.p("pImages"),
        VkHostAddressRangeEXT.p("pDatas")
    )

    VkDeviceSize(
        "GetPhysicalDeviceDescriptorSizeEXT",

        VkPhysicalDevice("physicalDevice"),
        VkDescriptorType("descriptorType")
    )

    DependsOn("VK_EXT_custom_border_color")..VkResult(
        "RegisterCustomBorderColorEXT",

        VkDevice("device"),
        VkSamplerCustomBorderColorCreateInfoEXT.const.p("pBorderColor"),
        VkBool32("requestIndex"),
        Check(1)..uint32_t.p("pIndex")
    )

    DependsOn("VK_EXT_custom_border_color")..void(
        "UnregisterCustomBorderColorEXT",

        VkDevice("device"),
        uint32_t("index")
    )

    DependsOn("VK_ARM_tensors")..VkResult(
        "GetTensorOpaqueCaptureDataARM",

        VkDevice("device"),
        AutoSize("pTensors", "pDatas")..uint32_t("tensorCount"),
        VkTensorARM.const.p("pTensors"),
        VkHostAddressRangeEXT.p("pDatas")
    )
}