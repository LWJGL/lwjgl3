/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class METABodyTrackingCalibration {

    public static final int XR_META_body_tracking_calibration_SPEC_VERSION = 1;

    public static final String XR_META_BODY_TRACKING_CALIBRATION_EXTENSION_NAME = "XR_META_body_tracking_calibration";

    public static final int
        XR_TYPE_BODY_TRACKING_CALIBRATION_INFO_META              = 1000283002,
        XR_TYPE_BODY_TRACKING_CALIBRATION_STATUS_META            = 1000283003,
        XR_TYPE_SYSTEM_PROPERTIES_BODY_TRACKING_CALIBRATION_META = 1000283004;

    public static final int
        XR_BODY_TRACKING_CALIBRATION_STATE_VALID_META       = 1,
        XR_BODY_TRACKING_CALIBRATION_STATE_CALIBRATING_META = 2,
        XR_BODY_TRACKING_CALIBRATION_STATE_INVALID_META     = 3;

    protected METABodyTrackingCalibration() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrSuggestBodyTrackingCalibrationOverrideMETA ] ---

    /** {@code XrResult xrSuggestBodyTrackingCalibrationOverrideMETA(XrBodyTrackerFB bodyTracker, XrBodyTrackingCalibrationInfoMETA const * calibrationInfo)} */
    public static int nxrSuggestBodyTrackingCalibrationOverrideMETA(XrBodyTrackerFB bodyTracker, long calibrationInfo) {
        long __functionAddress = bodyTracker.getCapabilities().xrSuggestBodyTrackingCalibrationOverrideMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(bodyTracker.address(), calibrationInfo, __functionAddress);
    }

    /** {@code XrResult xrSuggestBodyTrackingCalibrationOverrideMETA(XrBodyTrackerFB bodyTracker, XrBodyTrackingCalibrationInfoMETA const * calibrationInfo)} */
    @NativeType("XrResult")
    public static int xrSuggestBodyTrackingCalibrationOverrideMETA(XrBodyTrackerFB bodyTracker, @NativeType("XrBodyTrackingCalibrationInfoMETA const *") XrBodyTrackingCalibrationInfoMETA calibrationInfo) {
        return nxrSuggestBodyTrackingCalibrationOverrideMETA(bodyTracker, calibrationInfo.address());
    }

    // --- [ xrResetBodyTrackingCalibrationMETA ] ---

    /** {@code XrResult xrResetBodyTrackingCalibrationMETA(XrBodyTrackerFB bodyTracker)} */
    @NativeType("XrResult")
    public static int xrResetBodyTrackingCalibrationMETA(XrBodyTrackerFB bodyTracker) {
        long __functionAddress = bodyTracker.getCapabilities().xrResetBodyTrackingCalibrationMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(bodyTracker.address(), __functionAddress);
    }

}