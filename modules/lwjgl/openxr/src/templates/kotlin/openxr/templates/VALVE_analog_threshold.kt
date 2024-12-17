/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val VALVE_analog_threshold = "VALVEAnalogThreshold".nativeClassXR("VALVE_analog_threshold", type = "instance", postfix = "VALVE") {
    IntConstant(
        "VALVE_analog_threshold_SPEC_VERSION".."2"
    )

    StringConstant(
        "VALVE_ANALOG_THRESHOLD_EXTENSION_NAME".."XR_VALVE_analog_threshold"
    )

    EnumConstant(
        "TYPE_INTERACTION_PROFILE_ANALOG_THRESHOLD_VALVE".."1000079000"
    )
}