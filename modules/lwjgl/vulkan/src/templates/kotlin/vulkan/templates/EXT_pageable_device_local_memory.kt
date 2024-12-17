/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_pageable_device_local_memory = "EXTPageableDeviceLocalMemory".nativeClassVK("EXT_pageable_device_local_memory", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_PAGEABLE_DEVICE_LOCAL_MEMORY_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_PAGEABLE_DEVICE_LOCAL_MEMORY_EXTENSION_NAME".."VK_EXT_pageable_device_local_memory"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PAGEABLE_DEVICE_LOCAL_MEMORY_FEATURES_EXT".."1000412000"
    )

    void(
        "SetDeviceMemoryPriorityEXT",

        VkDevice("device"),
        VkDeviceMemory("memory"),
        float("priority")
    )
}