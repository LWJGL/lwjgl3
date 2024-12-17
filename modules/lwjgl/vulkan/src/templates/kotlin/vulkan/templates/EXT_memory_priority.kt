/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_memory_priority = "EXTMemoryPriority".nativeClassVK("EXT_memory_priority", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_MEMORY_PRIORITY_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_MEMORY_PRIORITY_EXTENSION_NAME".."VK_EXT_memory_priority"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PRIORITY_FEATURES_EXT".."1000238000",
        "STRUCTURE_TYPE_MEMORY_PRIORITY_ALLOCATE_INFO_EXT".."1000238001"
    )
}