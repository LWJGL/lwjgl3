/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_external_fence_fd = "KHRExternalFenceFd".nativeClassVK("KHR_external_fence_fd", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_EXTERNAL_FENCE_FD_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_EXTERNAL_FENCE_FD_EXTENSION_NAME".."VK_KHR_external_fence_fd"
    )

    EnumConstant(
        "STRUCTURE_TYPE_IMPORT_FENCE_FD_INFO_KHR".."1000115000",
        "STRUCTURE_TYPE_FENCE_GET_FD_INFO_KHR".."1000115001"
    )

    VkResult(
        "ImportFenceFdKHR",

        VkDevice("device"),
        VkImportFenceFdInfoKHR.const.p("pImportFenceFdInfo")
    )

    VkResult(
        "GetFenceFdKHR",

        VkDevice("device"),
        VkFenceGetFdInfoKHR.const.p("pGetFdInfo"),
        Check(1)..int.p("pFd")
    )
}