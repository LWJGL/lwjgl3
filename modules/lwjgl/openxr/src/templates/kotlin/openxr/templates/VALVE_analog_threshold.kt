/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val VALVE_analog_threshold = "VALVEAnalogThreshold".nativeClassXR("VALVE_analog_threshold", type = "instance", postfix = "VALVE") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "VALVE_analog_threshold_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "VALVE_ANALOG_THRESHOLD_EXTENSION_NAME".."XR_VALVE_analog_threshold"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_INTERACTION_PROFILE_ANALOG_THRESHOLD_VALVE".."1000079000"
    )
}