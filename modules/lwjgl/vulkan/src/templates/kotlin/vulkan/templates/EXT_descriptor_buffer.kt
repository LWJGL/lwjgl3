/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_descriptor_buffer = "EXTDescriptorBuffer".nativeClassVK("EXT_descriptor_buffer", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_DESCRIPTOR_BUFFER_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_DESCRIPTOR_BUFFER_EXTENSION_NAME".."VK_EXT_descriptor_buffer"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_PROPERTIES_EXT".."1000316000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_DENSITY_MAP_PROPERTIES_EXT".."1000316001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_FEATURES_EXT".."1000316002",
        "STRUCTURE_TYPE_DESCRIPTOR_ADDRESS_INFO_EXT".."1000316003",
        "STRUCTURE_TYPE_DESCRIPTOR_GET_INFO_EXT".."1000316004",
        "STRUCTURE_TYPE_BUFFER_CAPTURE_DESCRIPTOR_DATA_INFO_EXT".."1000316005",
        "STRUCTURE_TYPE_IMAGE_CAPTURE_DESCRIPTOR_DATA_INFO_EXT".."1000316006",
        "STRUCTURE_TYPE_IMAGE_VIEW_CAPTURE_DESCRIPTOR_DATA_INFO_EXT".."1000316007",
        "STRUCTURE_TYPE_SAMPLER_CAPTURE_DESCRIPTOR_DATA_INFO_EXT".."1000316008",
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CAPTURE_DESCRIPTOR_DATA_INFO_EXT".."1000316009",
        "STRUCTURE_TYPE_OPAQUE_CAPTURE_DESCRIPTOR_DATA_CREATE_INFO_EXT".."1000316010",
        "STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_INFO_EXT".."1000316011",
        "STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_PUSH_DESCRIPTOR_BUFFER_HANDLE_EXT".."1000316012"
    )

    EnumConstant(
        "DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT".enum(0x00000010),
        "DESCRIPTOR_SET_LAYOUT_CREATE_EMBEDDED_IMMUTABLE_SAMPLERS_BIT_EXT".enum(0x00000020)
    )

    EnumConstant(
        "BUFFER_USAGE_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT".enum(0x00200000),
        "BUFFER_USAGE_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT".enum(0x00400000),
        "BUFFER_USAGE_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT".enum(0x04000000)
    )

    EnumConstant(
        "BUFFER_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT".enum(0x00000020)
    )

    EnumConstant(
        "IMAGE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT".enum(0x00010000)
    )

    EnumConstant(
        "IMAGE_VIEW_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT".enum(0x00000004)
    )

    EnumConstant(
        "SAMPLER_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT".enum(0x00000008)
    )

    EnumConstant(
        "ACCELERATION_STRUCTURE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT".enum(0x00000008)
    )

    EnumConstantLong(
        "ACCESS_2_DESCRIPTOR_BUFFER_READ_BIT_EXT".enum(0x20000000000L)
    )

    EnumConstant(
        "PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT".enum(0x20000000)
    )

    void(
        "GetDescriptorSetLayoutSizeEXT",

        VkDevice("device"),
        VkDescriptorSetLayout("layout"),
        Check(1)..VkDeviceSize.p("pLayoutSizeInBytes")
    )

    void(
        "GetDescriptorSetLayoutBindingOffsetEXT",

        VkDevice("device"),
        VkDescriptorSetLayout("layout"),
        uint32_t("binding"),
        Check(1)..VkDeviceSize.p("pOffset")
    )

    void(
        "GetDescriptorEXT",

        VkDevice("device"),
        VkDescriptorGetInfoEXT.const.p("pDescriptorInfo"),
        AutoSize("pDescriptor")..size_t("dataSize"),
        void.p("pDescriptor")
    )

    void(
        "CmdBindDescriptorBuffersEXT",

        VkCommandBuffer("commandBuffer"),
        AutoSize("pBindingInfos")..uint32_t("bufferCount"),
        VkDescriptorBufferBindingInfoEXT.const.p("pBindingInfos")
    )

    void(
        "CmdSetDescriptorBufferOffsetsEXT",

        VkCommandBuffer("commandBuffer"),
        VkPipelineBindPoint("pipelineBindPoint"),
        VkPipelineLayout("layout"),
        uint32_t("firstSet"),
        AutoSize("pBufferIndices", "pOffsets")..uint32_t("setCount"),
        uint32_t.const.p("pBufferIndices"),
        VkDeviceSize.const.p("pOffsets")
    )

    void(
        "CmdBindDescriptorBufferEmbeddedSamplersEXT",

        VkCommandBuffer("commandBuffer"),
        VkPipelineBindPoint("pipelineBindPoint"),
        VkPipelineLayout("layout"),
        uint32_t("set")
    )

    VkResult(
        "GetBufferOpaqueCaptureDescriptorDataEXT",

        VkDevice("device"),
        VkBufferCaptureDescriptorDataInfoEXT.const.p("pInfo"),
        Check(1)..void.p("pData")
    )

    VkResult(
        "GetImageOpaqueCaptureDescriptorDataEXT",

        VkDevice("device"),
        VkImageCaptureDescriptorDataInfoEXT.const.p("pInfo"),
        Check(1)..void.p("pData")
    )

    VkResult(
        "GetImageViewOpaqueCaptureDescriptorDataEXT",

        VkDevice("device"),
        VkImageViewCaptureDescriptorDataInfoEXT.const.p("pInfo"),
        Check(1)..void.p("pData")
    )

    VkResult(
        "GetSamplerOpaqueCaptureDescriptorDataEXT",

        VkDevice("device"),
        VkSamplerCaptureDescriptorDataInfoEXT.const.p("pInfo"),
        Check(1)..void.p("pData")
    )

    DependsOn("""ext.contains("VK_KHR_acceleration_structure") || ext.contains("VK_NV_ray_tracing")""")..VkResult(
        "GetAccelerationStructureOpaqueCaptureDescriptorDataEXT",

        VkDevice("device"),
        VkAccelerationStructureCaptureDescriptorDataInfoEXT.const.p("pInfo"),
        Check(1)..void.p("pData")
    )
}