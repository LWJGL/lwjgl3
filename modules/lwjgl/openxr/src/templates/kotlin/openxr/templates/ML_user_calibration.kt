/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ML_user_calibration = "MLUserCalibration".nativeClassXR("ML_user_calibration", type = "instance", postfix = "ML") {
    IntConstant(
        "ML_user_calibration_SPEC_VERSION".."1"
    )

    StringConstant(
        "ML_USER_CALIBRATION_EXTENSION_NAME".."XR_ML_user_calibration"
    )

    EnumConstant(
        "TYPE_EVENT_DATA_HEADSET_FIT_CHANGED_ML".."1000472000",
        "TYPE_EVENT_DATA_EYE_CALIBRATION_CHANGED_ML".."1000472001",
        "TYPE_USER_CALIBRATION_ENABLE_EVENTS_INFO_ML".."1000472002"
    )

    EnumConstant(
        "HEADSET_FIT_STATUS_UNKNOWN_ML".."0",
        "HEADSET_FIT_STATUS_NOT_WORN_ML".."1",
        "HEADSET_FIT_STATUS_GOOD_FIT_ML".."2",
        "HEADSET_FIT_STATUS_BAD_FIT_ML".."3"
    )

    EnumConstant(
        "EYE_CALIBRATION_STATUS_UNKNOWN_ML".."0",
        "EYE_CALIBRATION_STATUS_NONE_ML".."1",
        "EYE_CALIBRATION_STATUS_COARSE_ML".."2",
        "EYE_CALIBRATION_STATUS_FINE_ML".."3"
    )

    XrResult(
        "EnableUserCalibrationEventsML",

        XrInstance("instance"),
        XrUserCalibrationEnableEventsInfoML.const.p("enableInfo")
    )
}