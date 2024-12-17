/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class MLUserCalibration {

    public static final int XR_ML_user_calibration_SPEC_VERSION = 1;

    public static final String XR_ML_USER_CALIBRATION_EXTENSION_NAME = "XR_ML_user_calibration";

    public static final int
        XR_TYPE_EVENT_DATA_HEADSET_FIT_CHANGED_ML      = 1000472000,
        XR_TYPE_EVENT_DATA_EYE_CALIBRATION_CHANGED_ML  = 1000472001,
        XR_TYPE_USER_CALIBRATION_ENABLE_EVENTS_INFO_ML = 1000472002;

    public static final int
        XR_HEADSET_FIT_STATUS_UNKNOWN_ML  = 0,
        XR_HEADSET_FIT_STATUS_NOT_WORN_ML = 1,
        XR_HEADSET_FIT_STATUS_GOOD_FIT_ML = 2,
        XR_HEADSET_FIT_STATUS_BAD_FIT_ML  = 3;

    public static final int
        XR_EYE_CALIBRATION_STATUS_UNKNOWN_ML = 0,
        XR_EYE_CALIBRATION_STATUS_NONE_ML    = 1,
        XR_EYE_CALIBRATION_STATUS_COARSE_ML  = 2,
        XR_EYE_CALIBRATION_STATUS_FINE_ML    = 3;

    protected MLUserCalibration() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrEnableUserCalibrationEventsML ] ---

    /** {@code XrResult xrEnableUserCalibrationEventsML(XrInstance instance, XrUserCalibrationEnableEventsInfoML const * enableInfo)} */
    public static int nxrEnableUserCalibrationEventsML(XrInstance instance, long enableInfo) {
        long __functionAddress = instance.getCapabilities().xrEnableUserCalibrationEventsML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(instance.address(), enableInfo, __functionAddress);
    }

    /** {@code XrResult xrEnableUserCalibrationEventsML(XrInstance instance, XrUserCalibrationEnableEventsInfoML const * enableInfo)} */
    @NativeType("XrResult")
    public static int xrEnableUserCalibrationEventsML(XrInstance instance, @NativeType("XrUserCalibrationEnableEventsInfoML const *") XrUserCalibrationEnableEventsInfoML enableInfo) {
        return nxrEnableUserCalibrationEventsML(instance, enableInfo.address());
    }

}