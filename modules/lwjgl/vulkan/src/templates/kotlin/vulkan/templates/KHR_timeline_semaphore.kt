/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_timeline_semaphore = "KHRTimelineSemaphore".nativeClassVK("KHR_timeline_semaphore", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_TIMELINE_SEMAPHORE_SPEC_VERSION".."2"
    )

    StringConstant(
        "KHR_TIMELINE_SEMAPHORE_EXTENSION_NAME".."VK_KHR_timeline_semaphore"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES_KHR".."1000207000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_PROPERTIES_KHR".."1000207001",
        "STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO_KHR".."1000207002",
        "STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO_KHR".."1000207003",
        "STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO_KHR".."1000207004",
        "STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO_KHR".."1000207005"
    )

    EnumConstant(
        "SEMAPHORE_TYPE_BINARY_KHR".."0",
        "SEMAPHORE_TYPE_TIMELINE_KHR".."1"
    )

    EnumConstant(
        "SEMAPHORE_WAIT_ANY_BIT_KHR".enum(0x00000001)
    )

    VkResult(
        "GetSemaphoreCounterValueKHR",

        VkDevice("device"),
        VkSemaphore("semaphore"),
        Check(1)..uint64_t.p("pValue")
    )

    VkResult(
        "WaitSemaphoresKHR",

        VkDevice("device"),
        VkSemaphoreWaitInfo.const.p("pWaitInfo"),
        uint64_t("timeout")
    )

    VkResult(
        "SignalSemaphoreKHR",

        VkDevice("device"),
        VkSemaphoreSignalInfo.const.p("pSignalInfo")
    )
}