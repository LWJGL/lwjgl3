/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_buffer_device_address = "EXTBufferDeviceAddress".nativeClassVK("EXT_buffer_device_address", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_BUFFER_DEVICE_ADDRESS_SPEC_VERSION".."2"
    )

    StringConstant(
        "EXT_BUFFER_DEVICE_ADDRESS_EXTENSION_NAME".."VK_EXT_buffer_device_address"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT".."1000244000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_ADDRESS_FEATURES_EXT".."1000244000",
        "STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO_EXT".."1000244001",
        "STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_CREATE_INFO_EXT".."1000244002"
    )

    EnumConstant(
        "BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT_EXT".enum(0x00020000)
    )

    EnumConstant(
        "BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_EXT".enum(0x00000010)
    )

    EnumConstant(
        "ERROR_INVALID_DEVICE_ADDRESS_EXT".."-1000257000"
    )

    VkDeviceAddress(
        "GetBufferDeviceAddressEXT",

        VkDevice("device"),
        VkBufferDeviceAddressInfo.const.p("pInfo")
    )
}