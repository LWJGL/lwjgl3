/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ANDROID_eye_tracking = "ANDROIDEyeTracking".nativeClassXR("ANDROID_eye_tracking", type = "instance", postfix = "ANDROID") {
    IntConstant(
        "ANDROID_eye_tracking_SPEC_VERSION".."1"
    )

    StringConstant(
        "ANDROID_EYE_TRACKING_EXTENSION_NAME".."XR_ANDROID_eye_tracking"
    )

    EnumConstant(
        "TYPE_EYES_ANDROID".."1000456000",
        "TYPE_EYE_TRACKER_CREATE_INFO_ANDROID".."1000456001",
        "TYPE_EYES_GET_INFO_ANDROID".."1000456002",
        "TYPE_SYSTEM_EYE_TRACKING_PROPERTIES_ANDROID".."1000456004"
    )

    EnumConstant(
        "OBJECT_TYPE_EYE_TRACKER_ANDROID".."1000456000"
    )

    EnumConstant(
        "EYE_MAX_ANDROID".."2"
    )

    EnumConstant(
        "EYE_INDEX_LEFT_ANDROID".."0",
        "EYE_INDEX_RIGHT_ANDROID".."1"
    )

    EnumConstant(
        "EYE_STATE_INVALID_ANDROID".."0",
        "EYE_STATE_GAZING_ANDROID".."1",
        "EYE_STATE_SHUT_ANDROID".."2"
    )

    EnumConstant(
        "EYE_TRACKING_MODE_NOT_TRACKING_ANDROID".."0",
        "EYE_TRACKING_MODE_RIGHT_ANDROID".."1",
        "EYE_TRACKING_MODE_LEFT_ANDROID".."2",
        "EYE_TRACKING_MODE_BOTH_ANDROID".."3"
    )

    XrResult(
        "CreateEyeTrackerANDROID",

        XrSession("session"),
        XrEyeTrackerCreateInfoANDROID.const.p("createInfo"),
        Check(1)..XrEyeTrackerANDROID.p("eyeTracker")
    )

    XrResult(
        "DestroyEyeTrackerANDROID",

        XrEyeTrackerANDROID("eyeTracker")
    )

    XrResult(
        "GetFineTrackingEyesInfoANDROID",

        XrEyeTrackerANDROID("eyeTracker"),
        XrEyesGetInfoANDROID.const.p("getInfo"),
        XrEyesANDROID.p("eyesOutput")
    )

    XrResult(
        "GetCoarseTrackingEyesInfoANDROID",

        XrEyeTrackerANDROID("eyeTracker"),
        XrEyesGetInfoANDROID.const.p("getInfo"),
        XrEyesANDROID.p("eyesOutput")
    )
}