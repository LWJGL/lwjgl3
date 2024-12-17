/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val AMD_device_coherent_memory = "AMDDeviceCoherentMemory".nativeClassVK("AMD_device_coherent_memory", type = "device", postfix = "AMD") {
    IntConstant(
        "AMD_DEVICE_COHERENT_MEMORY_SPEC_VERSION".."1"
    )

    StringConstant(
        "AMD_DEVICE_COHERENT_MEMORY_EXTENSION_NAME".."VK_AMD_device_coherent_memory"
    )

    EnumConstant(
        "MEMORY_PROPERTY_DEVICE_COHERENT_BIT_AMD".enum(0x00000040),
        "MEMORY_PROPERTY_DEVICE_UNCACHED_BIT_AMD".enum(0x00000080)
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_COHERENT_MEMORY_FEATURES_AMD".."1000229000"
    )
}