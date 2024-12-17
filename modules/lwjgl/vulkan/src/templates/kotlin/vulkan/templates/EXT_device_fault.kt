/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_device_fault = "EXTDeviceFault".nativeClassVK("EXT_device_fault", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_DEVICE_FAULT_SPEC_VERSION".."2"
    )

    StringConstant(
        "EXT_DEVICE_FAULT_EXTENSION_NAME".."VK_EXT_device_fault"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FAULT_FEATURES_EXT".."1000341000",
        "STRUCTURE_TYPE_DEVICE_FAULT_COUNTS_EXT".."1000341001",
        "STRUCTURE_TYPE_DEVICE_FAULT_INFO_EXT".."1000341002"
    )

    EnumConstant(
        "DEVICE_FAULT_ADDRESS_TYPE_NONE_EXT".."0",
        "DEVICE_FAULT_ADDRESS_TYPE_READ_INVALID_EXT".."1",
        "DEVICE_FAULT_ADDRESS_TYPE_WRITE_INVALID_EXT".."2",
        "DEVICE_FAULT_ADDRESS_TYPE_EXECUTE_INVALID_EXT".."3",
        "DEVICE_FAULT_ADDRESS_TYPE_INSTRUCTION_POINTER_UNKNOWN_EXT".."4",
        "DEVICE_FAULT_ADDRESS_TYPE_INSTRUCTION_POINTER_INVALID_EXT".."5",
        "DEVICE_FAULT_ADDRESS_TYPE_INSTRUCTION_POINTER_FAULT_EXT".."6"
    )

    EnumConstant(
        "DEVICE_FAULT_VENDOR_BINARY_HEADER_VERSION_ONE_EXT".."1"
    )

    VkResult(
        "GetDeviceFaultInfoEXT",

        VkDevice("device"),
        VkDeviceFaultCountsEXT.p("pFaultCounts"),
        nullable..VkDeviceFaultInfoEXT.p("pFaultInfo")
    )
}