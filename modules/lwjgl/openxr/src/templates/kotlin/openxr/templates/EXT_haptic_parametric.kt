/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_haptic_parametric = "EXTHapticParametric".nativeClassXR("EXT_haptic_parametric", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_haptic_parametric_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_HAPTIC_PARAMETRIC_EXTENSION_NAME".."XR_EXT_haptic_parametric"
    )

    EnumConstant(
        "TYPE_HAPTIC_PARAMETRIC_VIBRATION_EXT".."1000775000",
        "TYPE_HAPTIC_PARAMETRIC_PROPERTIES_EXT".."1000775001",
        "TYPE_SYSTEM_HAPTIC_PARAMETRIC_PROPERTIES_EXT".."1000775002"
    )

    EnumConstant(
        "HAPTIC_PARAMETRIC_STREAM_FRAME_TYPE_NONE_EXT".."0",
        "HAPTIC_PARAMETRIC_STREAM_FRAME_TYPE_FIRST_FRAME_EXT".."1",
        "HAPTIC_PARAMETRIC_STREAM_FRAME_TYPE_INTERMEDIATE_FRAME_EXT".."2",
        "HAPTIC_PARAMETRIC_STREAM_FRAME_TYPE_LAST_FRAME_EXT".."3"
    )

    XrResult(
        "HapticParametricGetPropertiesEXT",

        XrSession("session"),
        XrHapticActionInfo.const.p("hapticActionInfo"),
        XrHapticParametricPropertiesEXT.p("parametricProperties")
    )
}