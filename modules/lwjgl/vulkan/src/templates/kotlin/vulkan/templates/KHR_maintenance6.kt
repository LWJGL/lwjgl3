/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_maintenance6 = "KHRMaintenance6".nativeClassVK("KHR_maintenance6", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_MAINTENANCE_6_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_MAINTENANCE_6_EXTENSION_NAME".."VK_KHR_maintenance6"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_FEATURES_KHR".."1000545000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES_KHR".."1000545001",
        "STRUCTURE_TYPE_BIND_MEMORY_STATUS_KHR".."1000545002",
        "STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO_KHR".."1000545003",
        "STRUCTURE_TYPE_PUSH_CONSTANTS_INFO_KHR".."1000545004",
        "STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO_KHR".."1000545005",
        "STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO_KHR".."1000545006",
        "STRUCTURE_TYPE_SET_DESCRIPTOR_BUFFER_OFFSETS_INFO_EXT".."1000545007",
        "STRUCTURE_TYPE_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS_INFO_EXT".."1000545008"
    )

    void(
        "CmdBindDescriptorSets2KHR",

        VkCommandBuffer("commandBuffer"),
        VkBindDescriptorSetsInfo.const.p("pBindDescriptorSetsInfo")
    )

    void(
        "CmdPushConstants2KHR",

        VkCommandBuffer("commandBuffer"),
        VkPushConstantsInfo.const.p("pPushConstantsInfo")
    )

    DependsOn("VK_KHR_push_descriptor")..void(
        "CmdPushDescriptorSet2KHR",

        VkCommandBuffer("commandBuffer"),
        VkPushDescriptorSetInfo.const.p("pPushDescriptorSetInfo")
    )

    DependsOn("VK_KHR_push_descriptor")..void(
        "CmdPushDescriptorSetWithTemplate2KHR",

        VkCommandBuffer("commandBuffer"),
        VkPushDescriptorSetWithTemplateInfo.const.p("pPushDescriptorSetWithTemplateInfo")
    )

    DependsOn("VK_EXT_descriptor_buffer")..void(
        "CmdSetDescriptorBufferOffsets2EXT",

        VkCommandBuffer("commandBuffer"),
        VkSetDescriptorBufferOffsetsInfoEXT.const.p("pSetDescriptorBufferOffsetsInfo")
    )

    DependsOn("VK_EXT_descriptor_buffer")..void(
        "CmdBindDescriptorBufferEmbeddedSamplers2EXT",

        VkCommandBuffer("commandBuffer"),
        VkBindDescriptorBufferEmbeddedSamplersInfoEXT.const.p("pBindDescriptorBufferEmbeddedSamplersInfo")
    )
}