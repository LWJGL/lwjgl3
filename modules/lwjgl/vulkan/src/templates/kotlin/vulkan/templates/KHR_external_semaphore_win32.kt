/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import core.windows.*
import vulkan.*

val KHR_external_semaphore_win32 = "KHRExternalSemaphoreWin32".nativeClassVK("KHR_external_semaphore_win32", type = "device", postfix = "KHR") {
    javaImport("org.lwjgl.system.windows.*")
    IntConstant(
        "KHR_EXTERNAL_SEMAPHORE_WIN32_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_EXTERNAL_SEMAPHORE_WIN32_EXTENSION_NAME".."VK_KHR_external_semaphore_win32"
    )

    EnumConstant(
        "STRUCTURE_TYPE_IMPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHR".."1000078000",
        "STRUCTURE_TYPE_EXPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHR".."1000078001",
        "STRUCTURE_TYPE_D3D12_FENCE_SUBMIT_INFO_KHR".."1000078002",
        "STRUCTURE_TYPE_SEMAPHORE_GET_WIN32_HANDLE_INFO_KHR".."1000078003"
    )

    VkResult(
        "ImportSemaphoreWin32HandleKHR",

        VkDevice("device"),
        VkImportSemaphoreWin32HandleInfoKHR.const.p("pImportSemaphoreWin32HandleInfo")
    )

    VkResult(
        "GetSemaphoreWin32HandleKHR",

        VkDevice("device"),
        VkSemaphoreGetWin32HandleInfoKHR.const.p("pGetWin32HandleInfo"),
        Check(1)..HANDLE.p("pHandle")
    )
}