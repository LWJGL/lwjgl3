/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_mutable_descriptor_type = "EXTMutableDescriptorType".nativeClassVK("EXT_mutable_descriptor_type", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_MUTABLE_DESCRIPTOR_TYPE_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_MUTABLE_DESCRIPTOR_TYPE_EXTENSION_NAME".."VK_EXT_mutable_descriptor_type"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MUTABLE_DESCRIPTOR_TYPE_FEATURES_EXT".."1000351000",
        "STRUCTURE_TYPE_MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO_EXT".."1000351002"
    )

    EnumConstant(
        "DESCRIPTOR_TYPE_MUTABLE_EXT".."1000351000"
    )

    EnumConstant(
        "DESCRIPTOR_POOL_CREATE_HOST_ONLY_BIT_EXT".enum(0x00000004)
    )

    EnumConstant(
        "DESCRIPTOR_SET_LAYOUT_CREATE_HOST_ONLY_POOL_BIT_EXT".enum(0x00000004)
    )
}