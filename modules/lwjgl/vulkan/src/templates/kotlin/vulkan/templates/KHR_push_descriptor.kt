/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_push_descriptor = "KHRPushDescriptor".nativeClassVK("KHR_push_descriptor", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_PUSH_DESCRIPTOR_SPEC_VERSION".."2"
    )

    StringConstant(
        "KHR_PUSH_DESCRIPTOR_EXTENSION_NAME".."VK_KHR_push_descriptor"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES_KHR".."1000080000"
    )

    EnumConstant(
        "DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR".enum(0x00000001)
    )

    EnumConstant(
        "DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR".."1"
    )

    void(
        "CmdPushDescriptorSetKHR",

        VkCommandBuffer("commandBuffer"),
        VkPipelineBindPoint("pipelineBindPoint"),
        VkPipelineLayout("layout"),
        uint32_t("set"),
        AutoSize("pDescriptorWrites")..uint32_t("descriptorWriteCount"),
        VkWriteDescriptorSet.const.p("pDescriptorWrites")
    )

    DependsOn("""ext.contains("Vulkan11") || ext.contains("VK_KHR_descriptor_update_template")""")..void(
        "CmdPushDescriptorSetWithTemplateKHR",

        VkCommandBuffer("commandBuffer"),
        VkDescriptorUpdateTemplate("descriptorUpdateTemplate"),
        VkPipelineLayout("layout"),
        uint32_t("set"),
        nullable..opaque_const_p("pData")
    )
}