/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import core.windows.*
import vulkan.*

val KHR_external_fence_win32 = "KHRExternalFenceWin32".nativeClassVK("KHR_external_fence_win32", type = "device", postfix = "KHR") {
    javaImport("org.lwjgl.system.windows.*")
    IntConstant(
        "KHR_EXTERNAL_FENCE_WIN32_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_EXTERNAL_FENCE_WIN32_EXTENSION_NAME".."VK_KHR_external_fence_win32"
    )

    EnumConstant(
        "STRUCTURE_TYPE_IMPORT_FENCE_WIN32_HANDLE_INFO_KHR".."1000114000",
        "STRUCTURE_TYPE_EXPORT_FENCE_WIN32_HANDLE_INFO_KHR".."1000114001",
        "STRUCTURE_TYPE_FENCE_GET_WIN32_HANDLE_INFO_KHR".."1000114002"
    )

    VkResult(
        "ImportFenceWin32HandleKHR",

        VkDevice("device"),
        VkImportFenceWin32HandleInfoKHR.const.p("pImportFenceWin32HandleInfo")
    )

    VkResult(
        "GetFenceWin32HandleKHR",

        VkDevice("device"),
        VkFenceGetWin32HandleInfoKHR.const.p("pGetWin32HandleInfo"),
        Check(1)..HANDLE.p("pHandle")
    )
}