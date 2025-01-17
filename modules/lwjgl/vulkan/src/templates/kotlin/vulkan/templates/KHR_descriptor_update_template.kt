/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_descriptor_update_template = "KHRDescriptorUpdateTemplate".nativeClassVK("KHR_descriptor_update_template", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_DESCRIPTOR_UPDATE_TEMPLATE_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_DESCRIPTOR_UPDATE_TEMPLATE_EXTENSION_NAME".."VK_KHR_descriptor_update_template"
    )

    EnumConstant(
        "STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO_KHR".."1000085000"
    )

    EnumConstant(
        "OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR".."1000085000"
    )

    EnumConstant(
        "DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET_KHR".."0",
        "DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR".."1"
    )

    EnumConstant(
        "DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR_EXT".."1000085000"
    )

    VkResult(
        "CreateDescriptorUpdateTemplateKHR",

        VkDevice("device"),
        VkDescriptorUpdateTemplateCreateInfo.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkDescriptorUpdateTemplate.p("pDescriptorUpdateTemplate")
    )

    void(
        "DestroyDescriptorUpdateTemplateKHR",

        VkDevice("device"),
        VkDescriptorUpdateTemplate("descriptorUpdateTemplate"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    void(
        "UpdateDescriptorSetWithTemplateKHR",

        VkDevice("device"),
        VkDescriptorSet("descriptorSet"),
        VkDescriptorUpdateTemplate("descriptorUpdateTemplate"),
        nullable..opaque_const_p("pData")
    )

    DependsOn("VK_KHR_push_descriptor")..void(
        "CmdPushDescriptorSetWithTemplateKHR",

        VkCommandBuffer("commandBuffer"),
        VkDescriptorUpdateTemplate("descriptorUpdateTemplate"),
        VkPipelineLayout("layout"),
        uint32_t("set"),
        nullable..opaque_const_p("pData")
    )
}