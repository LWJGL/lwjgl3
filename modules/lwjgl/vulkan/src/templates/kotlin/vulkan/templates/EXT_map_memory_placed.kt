/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_map_memory_placed = "EXTMapMemoryPlaced".nativeClassVK("EXT_map_memory_placed", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_MAP_MEMORY_PLACED_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_MAP_MEMORY_PLACED_EXTENSION_NAME".."VK_EXT_map_memory_placed"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MAP_MEMORY_PLACED_FEATURES_EXT".."1000272000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MAP_MEMORY_PLACED_PROPERTIES_EXT".."1000272001",
        "STRUCTURE_TYPE_MEMORY_MAP_PLACED_INFO_EXT".."1000272002"
    )

    EnumConstant(
        "MEMORY_MAP_PLACED_BIT_EXT".enum(0x00000001)
    )

    EnumConstant(
        "MEMORY_UNMAP_RESERVE_BIT_EXT".enum(0x00000001)
    )
}