/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_external_memory_host = "EXTExternalMemoryHost".nativeClassVK("EXT_external_memory_host", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_EXTERNAL_MEMORY_HOST_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_EXTERNAL_MEMORY_HOST_EXTENSION_NAME".."VK_EXT_external_memory_host"
    )

    EnumConstant(
        "STRUCTURE_TYPE_IMPORT_MEMORY_HOST_POINTER_INFO_EXT".."1000178000",
        "STRUCTURE_TYPE_MEMORY_HOST_POINTER_PROPERTIES_EXT".."1000178001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_HOST_PROPERTIES_EXT".."1000178002"
    )

    EnumConstant(
        "EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT".enum(0x00000080),
        "EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT".enum(0x00000100)
    )

    VkResult(
        "GetMemoryHostPointerPropertiesEXT",

        VkDevice("device"),
        VkExternalMemoryHandleTypeFlagBits("handleType"),
        opaque_const_p("pHostPointer"),
        VkMemoryHostPointerPropertiesEXT.p("pMemoryHostPointerProperties")
    )
}