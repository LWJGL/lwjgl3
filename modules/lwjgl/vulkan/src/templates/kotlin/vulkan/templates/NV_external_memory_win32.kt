/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import core.windows.*
import vulkan.*

val NV_external_memory_win32 = "NVExternalMemoryWin32".nativeClassVK("NV_external_memory_win32", type = "device", postfix = "NV") {
    javaImport("org.lwjgl.system.windows.*")
    IntConstant(
        "NV_EXTERNAL_MEMORY_WIN32_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_EXTERNAL_MEMORY_WIN32_EXTENSION_NAME".."VK_NV_external_memory_win32"
    )

    EnumConstant(
        "STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_NV".."1000057000",
        "STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_NV".."1000057001"
    )

    VkResult(
        "GetMemoryWin32HandleNV",

        VkDevice("device"),
        VkDeviceMemory("memory"),
        VkExternalMemoryHandleTypeFlagsNV("handleType"),
        Check(1)..HANDLE.p("pHandle")
    )
}