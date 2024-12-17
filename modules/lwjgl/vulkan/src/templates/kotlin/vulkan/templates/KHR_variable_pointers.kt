/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_variable_pointers = "KHRVariablePointers".nativeClassVK("KHR_variable_pointers", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_VARIABLE_POINTERS_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_VARIABLE_POINTERS_EXTENSION_NAME".."VK_KHR_variable_pointers"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES_KHR".."1000120000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTER_FEATURES_KHR".."1000120000"
    )
}