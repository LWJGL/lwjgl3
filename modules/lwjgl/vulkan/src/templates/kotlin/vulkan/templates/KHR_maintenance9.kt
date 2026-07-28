/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_maintenance9 = "KHRMaintenance9".nativeClassVK("KHR_maintenance9", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_MAINTENANCE_9_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_MAINTENANCE_9_EXTENSION_NAME".."VK_KHR_maintenance9"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_9_FEATURES_KHR".."1000584000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_9_PROPERTIES_KHR".."1000584001",
        "STRUCTURE_TYPE_QUEUE_FAMILY_OWNERSHIP_TRANSFER_PROPERTIES_KHR".."1000584002"
    )

    EnumConstant(
        "DEPENDENCY_ASYMMETRIC_EVENT_BIT_KHR".enum(0x00000040)
    )

    EnumConstant(
        "QUERY_POOL_CREATE_RESET_BIT_KHR".enum(0x00000001)
    )

    EnumConstant(
        "DEFAULT_VERTEX_ATTRIBUTE_VALUE_ZERO_ZERO_ZERO_ZERO_KHR".."0",
        "DEFAULT_VERTEX_ATTRIBUTE_VALUE_ZERO_ZERO_ZERO_ONE_KHR".."1"
    )
}