/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_zero_initialize_workgroup_memory = "KHRZeroInitializeWorkgroupMemory".nativeClassVK("KHR_zero_initialize_workgroup_memory", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_ZERO_INITIALIZE_WORKGROUP_MEMORY_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_ZERO_INITIALIZE_WORKGROUP_MEMORY_EXTENSION_NAME".."VK_KHR_zero_initialize_workgroup_memory"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES_KHR".."1000325000"
    )
}