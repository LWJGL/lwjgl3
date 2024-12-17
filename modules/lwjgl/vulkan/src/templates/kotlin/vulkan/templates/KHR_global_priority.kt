/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_global_priority = "KHRGlobalPriority".nativeClassVK("KHR_global_priority", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_GLOBAL_PRIORITY_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_GLOBAL_PRIORITY_EXTENSION_NAME".."VK_KHR_global_priority"
    )

    EnumConstant(
        "STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO_KHR".."1000174000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES_KHR".."1000388000",
        "STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES_KHR".."1000388001"
    )

    EnumConstant(
        "ERROR_NOT_PERMITTED_KHR".."-1000174001"
    )

    EnumConstant(
        "MAX_GLOBAL_PRIORITY_SIZE_KHR".."16"
    )

    EnumConstant(
        "QUEUE_GLOBAL_PRIORITY_LOW_KHR".."128",
        "QUEUE_GLOBAL_PRIORITY_MEDIUM_KHR".."256",
        "QUEUE_GLOBAL_PRIORITY_HIGH_KHR".."512",
        "QUEUE_GLOBAL_PRIORITY_REALTIME_KHR".."1024"
    )
}