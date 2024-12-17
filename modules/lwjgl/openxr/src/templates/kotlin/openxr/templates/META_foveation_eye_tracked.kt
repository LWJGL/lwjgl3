/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_foveation_eye_tracked = "METAFoveationEyeTracked".nativeClassXR("META_foveation_eye_tracked", type = "instance", postfix = "META") {
    IntConstant(
        "META_foveation_eye_tracked_SPEC_VERSION".."1"
    )

    StringConstant(
        "META_FOVEATION_EYE_TRACKED_EXTENSION_NAME".."XR_META_foveation_eye_tracked"
    )

    EnumConstant(
        "FOVEATION_CENTER_SIZE_META".."2"
    )

    EnumConstant(
        "TYPE_FOVEATION_EYE_TRACKED_PROFILE_CREATE_INFO_META".."1000200000",
        "TYPE_FOVEATION_EYE_TRACKED_STATE_META".."1000200001",
        "TYPE_SYSTEM_FOVEATION_EYE_TRACKED_PROPERTIES_META".."1000200002"
    )

    EnumConstant(
        "FOVEATION_EYE_TRACKED_STATE_VALID_BIT_META".enum(0x00000001)
    )

    XrResult(
        "GetFoveationEyeTrackedStateMETA",

        XrSession("session"),
        XrFoveationEyeTrackedStateMETA.p("foveationState")
    )
}