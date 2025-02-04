/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_external_memory_metal = "EXTExternalMemoryMetal".nativeClassVK("EXT_external_memory_metal", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_EXTERNAL_MEMORY_METAL_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_EXTERNAL_MEMORY_METAL_EXTENSION_NAME".."VK_EXT_external_memory_metal"
    )

    EnumConstant(
        "STRUCTURE_TYPE_IMPORT_MEMORY_METAL_HANDLE_INFO_EXT".."1000602000",
        "STRUCTURE_TYPE_MEMORY_METAL_HANDLE_PROPERTIES_EXT".."1000602001",
        "STRUCTURE_TYPE_MEMORY_GET_METAL_HANDLE_INFO_EXT".."1000602002"
    )

    EnumConstant(
        "EXTERNAL_MEMORY_HANDLE_TYPE_MTLBUFFER_BIT_EXT".enum(0x00010000),
        "EXTERNAL_MEMORY_HANDLE_TYPE_MTLTEXTURE_BIT_EXT".enum(0x00020000),
        "EXTERNAL_MEMORY_HANDLE_TYPE_MTLHEAP_BIT_EXT".enum(0x00040000)
    )

    VkResult(
        "GetMemoryMetalHandleEXT",

        VkDevice("device"),
        VkMemoryGetMetalHandleInfoEXT.const.p("pGetMetalHandleInfo"),
        Check(1)..void.p.p("pHandle")
    )

    VkResult(
        "GetMemoryMetalHandlePropertiesEXT",

        VkDevice("device"),
        VkExternalMemoryHandleTypeFlagBits("handleType"),
        opaque_const_p("pHandle"),
        VkMemoryMetalHandlePropertiesEXT.p("pMemoryMetalHandleProperties")
    )
}