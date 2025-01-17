/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_buffer_device_address = "KHRBufferDeviceAddress".nativeClassVK("KHR_buffer_device_address", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_BUFFER_DEVICE_ADDRESS_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_BUFFER_DEVICE_ADDRESS_EXTENSION_NAME".."VK_KHR_buffer_device_address"
    )

    EnumConstant(
        "STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO_KHR".."1000244001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_KHR".."1000257000",
        "STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO_KHR".."1000257002",
        "STRUCTURE_TYPE_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO_KHR".."1000257003",
        "STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO_KHR".."1000257004"
    )

    EnumConstant(
        "BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT_KHR".enum(0x00020000)
    )

    EnumConstant(
        "BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR".enum(0x00000010)
    )

    EnumConstant(
        "MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT_KHR".enum(0x00000002),
        "MEMORY_ALLOCATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR".enum(0x00000004)
    )

    EnumConstant(
        "ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR".."-1000257000"
    )

    VkDeviceAddress(
        "GetBufferDeviceAddressKHR",

        VkDevice("device"),
        VkBufferDeviceAddressInfo.const.p("pInfo")
    )

    uint64_t(
        "GetBufferOpaqueCaptureAddressKHR",

        VkDevice("device"),
        VkBufferDeviceAddressInfo.const.p("pInfo")
    )

    uint64_t(
        "GetDeviceMemoryOpaqueCaptureAddressKHR",

        VkDevice("device"),
        VkDeviceMemoryOpaqueCaptureAddressInfo.const.p("pInfo")
    )
}