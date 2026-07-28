/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_body_tracking_calibration = "METABodyTrackingCalibration".nativeClassXR("META_body_tracking_calibration", type = "instance", postfix = "META") {
    IntConstant(
        "META_body_tracking_calibration_SPEC_VERSION".."1"
    )

    StringConstant(
        "META_BODY_TRACKING_CALIBRATION_EXTENSION_NAME".."XR_META_body_tracking_calibration"
    )

    EnumConstant(
        "TYPE_BODY_TRACKING_CALIBRATION_INFO_META".."1000283002",
        "TYPE_BODY_TRACKING_CALIBRATION_STATUS_META".."1000283003",
        "TYPE_SYSTEM_PROPERTIES_BODY_TRACKING_CALIBRATION_META".."1000283004"
    )

    EnumConstant(
        "BODY_TRACKING_CALIBRATION_STATE_VALID_META".."1",
        "BODY_TRACKING_CALIBRATION_STATE_CALIBRATING_META".."2",
        "BODY_TRACKING_CALIBRATION_STATE_INVALID_META".."3"
    )

    XrResult(
        "SuggestBodyTrackingCalibrationOverrideMETA",

        XrBodyTrackerFB("bodyTracker"),
        XrBodyTrackingCalibrationInfoMETA.const.p("calibrationInfo")
    )

    XrResult(
        "ResetBodyTrackingCalibrationMETA",

        XrBodyTrackerFB("bodyTracker")
    )
}