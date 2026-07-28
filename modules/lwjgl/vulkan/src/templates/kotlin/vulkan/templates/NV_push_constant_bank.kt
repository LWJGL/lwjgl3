/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_push_constant_bank = "NVPushConstantBank".nativeClassVK("NV_push_constant_bank", type = "device", postfix = "NV") {
    IntConstant(
        "NV_PUSH_CONSTANT_BANK_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_PUSH_CONSTANT_BANK_EXTENSION_NAME".."VK_NV_push_constant_bank"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PUSH_CONSTANT_BANK_INFO_NV".."1000580000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_CONSTANT_BANK_FEATURES_NV".."1000580001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_CONSTANT_BANK_PROPERTIES_NV".."1000580002"
    )
}