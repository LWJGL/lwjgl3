/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_external_semaphore_fd = "KHRExternalSemaphoreFd".nativeClassVK("KHR_external_semaphore_fd", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_EXTERNAL_SEMAPHORE_FD_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_EXTERNAL_SEMAPHORE_FD_EXTENSION_NAME".."VK_KHR_external_semaphore_fd"
    )

    EnumConstant(
        "STRUCTURE_TYPE_IMPORT_SEMAPHORE_FD_INFO_KHR".."1000079000",
        "STRUCTURE_TYPE_SEMAPHORE_GET_FD_INFO_KHR".."1000079001"
    )

    VkResult(
        "ImportSemaphoreFdKHR",

        VkDevice("device"),
        VkImportSemaphoreFdInfoKHR.const.p("pImportSemaphoreFdInfo")
    )

    VkResult(
        "GetSemaphoreFdKHR",

        VkDevice("device"),
        VkSemaphoreGetFdInfoKHR.const.p("pGetFdInfo"),
        Check(1)..int.p("pFd")
    )
}