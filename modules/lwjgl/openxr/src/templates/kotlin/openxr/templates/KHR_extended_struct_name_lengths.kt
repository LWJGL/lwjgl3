/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val KHR_extended_struct_name_lengths = "KHRExtendedStructNameLengths".nativeClassXR("KHR_extended_struct_name_lengths", type = "instance", postfix = "KHR") {
    IntConstant(
        "KHR_extended_struct_name_lengths_SPEC_VERSION".."2"
    )

    StringConstant(
        "KHR_EXTENDED_STRUCT_NAME_LENGTHS_EXTENSION_NAME".."XR_KHR_extended_struct_name_lengths"
    )

    EnumConstant(
        "MAX_STRUCTURE_NAME_SIZE_EXTENDED_KHR".."256"
    )

    XrResult(
        "StructureTypeToString2KHR",

        XrInstance("instance"),
        XrStructureType("value"),
        Check("XR_MAX_STRUCTURE_NAME_SIZE_EXTENDED_KHR")..charUTF8.p("buffer")
    )
}