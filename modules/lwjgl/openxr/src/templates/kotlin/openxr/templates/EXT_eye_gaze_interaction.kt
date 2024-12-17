/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_eye_gaze_interaction = "EXTEyeGazeInteraction".nativeClassXR("EXT_eye_gaze_interaction", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_eye_gaze_interaction_SPEC_VERSION".."2"
    )

    StringConstant(
        "EXT_EYE_GAZE_INTERACTION_EXTENSION_NAME".."XR_EXT_eye_gaze_interaction"
    )

    EnumConstant(
        "TYPE_SYSTEM_EYE_GAZE_INTERACTION_PROPERTIES_EXT".."1000030000",
        "TYPE_EYE_GAZE_SAMPLE_TIME_EXT".."1000030001"
    )
}