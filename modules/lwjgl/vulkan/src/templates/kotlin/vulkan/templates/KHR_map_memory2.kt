/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_map_memory2 = "KHRMapMemory2".nativeClassVK("KHR_map_memory2", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_MAP_MEMORY_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_MAP_MEMORY_2_EXTENSION_NAME".."VK_KHR_map_memory2"
    )

    EnumConstant(
        "STRUCTURE_TYPE_MEMORY_MAP_INFO_KHR".."1000271000",
        "STRUCTURE_TYPE_MEMORY_UNMAP_INFO_KHR".."1000271001"
    )

    VkResult(
        "MapMemory2KHR",

        VkDevice("device"),
        VkMemoryMapInfo.const.p("pMemoryMapInfo"),
        Check(1)..void.p.p("ppData")
    )

    VkResult(
        "UnmapMemory2KHR",

        VkDevice("device"),
        VkMemoryUnmapInfo.const.p("pMemoryUnmapInfo")
    )
}