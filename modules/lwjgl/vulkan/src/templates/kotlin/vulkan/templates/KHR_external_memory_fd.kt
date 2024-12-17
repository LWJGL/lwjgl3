/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_external_memory_fd = "KHRExternalMemoryFd".nativeClassVK("KHR_external_memory_fd", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_EXTERNAL_MEMORY_FD_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_EXTERNAL_MEMORY_FD_EXTENSION_NAME".."VK_KHR_external_memory_fd"
    )

    EnumConstant(
        "STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHR".."1000074000",
        "STRUCTURE_TYPE_MEMORY_FD_PROPERTIES_KHR".."1000074001",
        "STRUCTURE_TYPE_MEMORY_GET_FD_INFO_KHR".."1000074002"
    )

    VkResult(
        "GetMemoryFdKHR",

        VkDevice("device"),
        VkMemoryGetFdInfoKHR.const.p("pGetFdInfo"),
        Check(1)..int.p("pFd")
    )

    VkResult(
        "GetMemoryFdPropertiesKHR",

        VkDevice("device"),
        VkExternalMemoryHandleTypeFlagBits("handleType"),
        int("fd"),
        VkMemoryFdPropertiesKHR.p("pMemoryFdProperties")
    )
}