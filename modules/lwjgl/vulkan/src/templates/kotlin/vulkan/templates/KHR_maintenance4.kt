/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_maintenance4 = "KHRMaintenance4".nativeClassVK("KHR_maintenance4", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_MAINTENANCE_4_SPEC_VERSION".."2"
    )

    StringConstant(
        "KHR_MAINTENANCE_4_EXTENSION_NAME".."VK_KHR_maintenance4"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_FEATURES_KHR".."1000413000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_PROPERTIES_KHR".."1000413001",
        "STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS_KHR".."1000413002",
        "STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS_KHR".."1000413003"
    )

    EnumConstant(
        "IMAGE_ASPECT_NONE_KHR".."0"
    )

    void(
        "GetDeviceBufferMemoryRequirementsKHR",

        VkDevice("device"),
        VkDeviceBufferMemoryRequirements.const.p("pInfo"),
        VkMemoryRequirements2.p("pMemoryRequirements")
    )

    void(
        "GetDeviceImageMemoryRequirementsKHR",

        VkDevice("device"),
        VkDeviceImageMemoryRequirements.const.p("pInfo"),
        VkMemoryRequirements2.p("pMemoryRequirements")
    )

    void(
        "GetDeviceImageSparseMemoryRequirementsKHR",

        VkDevice("device"),
        VkDeviceImageMemoryRequirements.const.p("pInfo"),
        AutoSize("pSparseMemoryRequirements")..Check(1)..uint32_t.p("pSparseMemoryRequirementCount"),
        nullable..VkSparseImageMemoryRequirements2.p("pSparseMemoryRequirements")
    )
}