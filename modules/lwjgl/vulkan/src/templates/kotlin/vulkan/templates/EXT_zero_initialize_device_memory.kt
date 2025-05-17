/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_zero_initialize_device_memory = "EXTZeroInitializeDeviceMemory".nativeClassVK("EXT_zero_initialize_device_memory", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_ZERO_INITIALIZE_DEVICE_MEMORY_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_ZERO_INITIALIZE_DEVICE_MEMORY_EXTENSION_NAME".."VK_EXT_zero_initialize_device_memory"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_DEVICE_MEMORY_FEATURES_EXT".."1000620000"
    )

    EnumConstant(
        "MEMORY_ALLOCATE_ZERO_INITIALIZE_BIT_EXT".enum(0x00000008)
    )

    EnumConstant(
        "IMAGE_LAYOUT_ZERO_INITIALIZED_EXT".."1000620000"
    )
}