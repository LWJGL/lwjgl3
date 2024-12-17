/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_global_priority = "EXTGlobalPriority".nativeClassVK("EXT_global_priority", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_GLOBAL_PRIORITY_SPEC_VERSION".."2"
    )

    StringConstant(
        "EXT_GLOBAL_PRIORITY_EXTENSION_NAME".."VK_EXT_global_priority"
    )

    EnumConstant(
        "STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO_EXT".."1000174000"
    )

    EnumConstant(
        "ERROR_NOT_PERMITTED_EXT".."-1000174001"
    )

    EnumConstant(
        "QUEUE_GLOBAL_PRIORITY_LOW_EXT".."128",
        "QUEUE_GLOBAL_PRIORITY_MEDIUM_EXT".."256",
        "QUEUE_GLOBAL_PRIORITY_HIGH_EXT".."512",
        "QUEUE_GLOBAL_PRIORITY_REALTIME_EXT".."1024"
    )
}