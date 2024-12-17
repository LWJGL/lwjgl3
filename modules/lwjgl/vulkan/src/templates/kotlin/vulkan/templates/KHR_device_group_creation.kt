/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_device_group_creation = "KHRDeviceGroupCreation".nativeClassVK("KHR_device_group_creation", type = "instance", postfix = "KHR") {
    IntConstant(
        "KHR_DEVICE_GROUP_CREATION_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_DEVICE_GROUP_CREATION_EXTENSION_NAME".."VK_KHR_device_group_creation"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES_KHR".."1000070000",
        "STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO_KHR".."1000070001"
    )

    EnumConstant(
        "MAX_DEVICE_GROUP_SIZE_KHR".."32"
    )

    EnumConstant(
        "MEMORY_HEAP_MULTI_INSTANCE_BIT_KHR".enum(0x00000002)
    )

    VkResult(
        "EnumeratePhysicalDeviceGroupsKHR",

        VkInstance("instance"),
        AutoSize("pPhysicalDeviceGroupProperties")..Check(1)..uint32_t.p("pPhysicalDeviceGroupCount"),
        nullable..VkPhysicalDeviceGroupProperties.p("pPhysicalDeviceGroupProperties")
    )
}