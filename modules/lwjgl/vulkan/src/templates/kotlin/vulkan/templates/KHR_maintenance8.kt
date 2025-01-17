/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_maintenance8 = "KHRMaintenance8".nativeClassVK("KHR_maintenance8", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_MAINTENANCE_8_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_MAINTENANCE_8_EXTENSION_NAME".."VK_KHR_maintenance8"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_8_FEATURES_KHR".."1000574000",
        "STRUCTURE_TYPE_MEMORY_BARRIER_ACCESS_FLAGS_3_KHR".."1000574002"
    )

    EnumConstant(
        "PIPELINE_CACHE_CREATE_INTERNALLY_SYNCHRONIZED_MERGE_BIT_KHR".enum(0x00000008)
    )

    EnumConstant(
        "DEPENDENCY_QUEUE_FAMILY_OWNERSHIP_TRANSFER_USE_ALL_STAGES_BIT_KHR".enum(0x00000020)
    )

    EnumConstantLong(
        "ACCESS_3_NONE_KHR".."0L"
    )
}