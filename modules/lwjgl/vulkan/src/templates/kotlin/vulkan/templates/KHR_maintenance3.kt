/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_maintenance3 = "KHRMaintenance3".nativeClassVK("KHR_maintenance3", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_MAINTENANCE_3_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_MAINTENANCE_3_EXTENSION_NAME".."VK_KHR_maintenance3"
    )

    IntConstant(
        "KHR_MAINTENANCE3_SPEC_VERSION".."VK_KHR_MAINTENANCE_3_SPEC_VERSION"
    )

    StringConstant(
        "KHR_MAINTENANCE3_EXTENSION_NAME".expr("VK_KHR_MAINTENANCE_3_EXTENSION_NAME")
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES_KHR".."1000168000",
        "STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT_KHR".."1000168001"
    )

    void(
        "GetDescriptorSetLayoutSupportKHR",

        VkDevice("device"),
        VkDescriptorSetLayoutCreateInfo.const.p("pCreateInfo"),
        VkDescriptorSetLayoutSupport.p("pSupport")
    )
}