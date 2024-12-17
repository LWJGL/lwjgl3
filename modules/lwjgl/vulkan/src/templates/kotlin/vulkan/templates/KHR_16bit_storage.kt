/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_16bit_storage = "KHR16bitStorage".nativeClassVK("KHR_16bit_storage", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_16BIT_STORAGE_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_16BIT_STORAGE_EXTENSION_NAME".."VK_KHR_16bit_storage"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES_KHR".."1000083000"
    )
}