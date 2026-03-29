/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_device_fault = "KHRDeviceFault".nativeClassVK("KHR_device_fault", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_DEVICE_FAULT_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_DEVICE_FAULT_EXTENSION_NAME".."VK_KHR_device_fault"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FAULT_FEATURES_KHR".."1000573000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FAULT_PROPERTIES_KHR".."1000573001",
        "STRUCTURE_TYPE_DEVICE_FAULT_INFO_KHR".."1000573002",
        "STRUCTURE_TYPE_DEVICE_FAULT_DEBUG_INFO_KHR".."1000573003"
    )

    EnumConstant(
        "DEVICE_FAULT_FLAG_DEVICE_LOST_KHR".enum(0x00000001),
        "DEVICE_FAULT_FLAG_MEMORY_ADDRESS_KHR".enum(0x00000002),
        "DEVICE_FAULT_FLAG_INSTRUCTION_ADDRESS_KHR".enum(0x00000004),
        "DEVICE_FAULT_FLAG_VENDOR_KHR".enum(0x00000008),
        "DEVICE_FAULT_FLAG_WATCHDOG_TIMEOUT_KHR".enum(0x00000010),
        "DEVICE_FAULT_FLAG_OVERFLOW_KHR".enum(0x00000020)
    )

    VkResult(
        "GetDeviceFaultReportsKHR",

        VkDevice("device"),
        uint64_t("timeout"),
        AutoSize("pFaultInfo")..Check(1)..uint32_t.p("pFaultCounts"),
        nullable..VkDeviceFaultInfoKHR.p("pFaultInfo")
    )

    VkResult(
        "GetDeviceFaultDebugInfoKHR",

        VkDevice("device"),
        VkDeviceFaultDebugInfoKHR.p("pDebugInfo")
    )
}