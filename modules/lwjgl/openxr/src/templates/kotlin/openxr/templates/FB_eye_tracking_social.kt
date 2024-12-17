/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_eye_tracking_social = "FBEyeTrackingSocial".nativeClassXR("FB_eye_tracking_social", type = "instance", postfix = "FB") {
    IntConstant(
        "FB_eye_tracking_social_SPEC_VERSION".."1"
    )

    StringConstant(
        "FB_EYE_TRACKING_SOCIAL_EXTENSION_NAME".."XR_FB_eye_tracking_social"
    )

    EnumConstant(
        "OBJECT_TYPE_EYE_TRACKER_FB".."1000202000"
    )

    EnumConstant(
        "TYPE_EYE_TRACKER_CREATE_INFO_FB".."1000202001",
        "TYPE_EYE_GAZES_INFO_FB".."1000202002",
        "TYPE_EYE_GAZES_FB".."1000202003",
        "TYPE_SYSTEM_EYE_TRACKING_PROPERTIES_FB".."1000202004"
    )

    EnumConstant(
        "EYE_POSITION_LEFT_FB".."0",
        "EYE_POSITION_RIGHT_FB".."1",
        "EYE_POSITION_COUNT_FB".."2"
    )

    XrResult(
        "CreateEyeTrackerFB",

        XrSession("session"),
        XrEyeTrackerCreateInfoFB.const.p("createInfo"),
        Check(1)..XrEyeTrackerFB.p("eyeTracker")
    )

    XrResult(
        "DestroyEyeTrackerFB",

        XrEyeTrackerFB("eyeTracker")
    )

    XrResult(
        "GetEyeGazesFB",

        XrEyeTrackerFB("eyeTracker"),
        XrEyeGazesInfoFB.const.p("gazeInfo"),
        XrEyeGazesFB.p("eyeGazes")
    )
}