/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import core.windows.*
import vulkan.*

val KHR_external_memory_win32 = "KHRExternalMemoryWin32".nativeClassVK("KHR_external_memory_win32", type = "device", postfix = "KHR") {
    javaImport("org.lwjgl.system.windows.*")
    IntConstant(
        "KHR_EXTERNAL_MEMORY_WIN32_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_EXTERNAL_MEMORY_WIN32_EXTENSION_NAME".."VK_KHR_external_memory_win32"
    )

    EnumConstant(
        "STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_KHR".."1000073000",
        "STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_KHR".."1000073001",
        "STRUCTURE_TYPE_MEMORY_WIN32_HANDLE_PROPERTIES_KHR".."1000073002",
        "STRUCTURE_TYPE_MEMORY_GET_WIN32_HANDLE_INFO_KHR".."1000073003"
    )

    VkResult(
        "GetMemoryWin32HandleKHR",

        VkDevice("device"),
        VkMemoryGetWin32HandleInfoKHR.const.p("pGetWin32HandleInfo"),
        Check(1)..HANDLE.p("pHandle")
    )

    VkResult(
        "GetMemoryWin32HandlePropertiesKHR",

        VkDevice("device"),
        VkExternalMemoryHandleTypeFlagBits("handleType"),
        HANDLE("handle"),
        VkMemoryWin32HandlePropertiesKHR.p("pMemoryWin32HandleProperties")
    )
}