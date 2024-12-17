/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_device_address_binding_report = "EXTDeviceAddressBindingReport".nativeClassVK("EXT_device_address_binding_report", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_DEVICE_ADDRESS_BINDING_REPORT_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_DEVICE_ADDRESS_BINDING_REPORT_EXTENSION_NAME".."VK_EXT_device_address_binding_report"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_ADDRESS_BINDING_REPORT_FEATURES_EXT".."1000354000",
        "STRUCTURE_TYPE_DEVICE_ADDRESS_BINDING_CALLBACK_DATA_EXT".."1000354001"
    )

    EnumConstant(
        "DEBUG_UTILS_MESSAGE_TYPE_DEVICE_ADDRESS_BINDING_BIT_EXT".enum(0x00000008)
    )

    EnumConstant(
        "DEVICE_ADDRESS_BINDING_INTERNAL_OBJECT_BIT_EXT".enum(0x00000001)
    )

    EnumConstant(
        "DEVICE_ADDRESS_BINDING_TYPE_BIND_EXT".."0",
        "DEVICE_ADDRESS_BINDING_TYPE_UNBIND_EXT".."1"
    )
}