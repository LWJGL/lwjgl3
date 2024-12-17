/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_8bit_storage = "KHR8bitStorage".nativeClassVK("KHR_8bit_storage", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_8BIT_STORAGE_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_8BIT_STORAGE_EXTENSION_NAME".."VK_KHR_8bit_storage"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES_KHR".."1000177000"
    )
}