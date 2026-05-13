/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class ANDROIDEyeTracking {

    public static final int XR_ANDROID_eye_tracking_SPEC_VERSION = 1;

    public static final String XR_ANDROID_EYE_TRACKING_EXTENSION_NAME = "XR_ANDROID_eye_tracking";

    public static final int
        XR_TYPE_EYES_ANDROID                           = 1000456000,
        XR_TYPE_EYE_TRACKER_CREATE_INFO_ANDROID        = 1000456001,
        XR_TYPE_EYES_GET_INFO_ANDROID                  = 1000456002,
        XR_TYPE_SYSTEM_EYE_TRACKING_PROPERTIES_ANDROID = 1000456004;

    public static final int XR_OBJECT_TYPE_EYE_TRACKER_ANDROID = 1000456000;

    public static final int XR_EYE_MAX_ANDROID = 2;

    public static final int
        XR_EYE_INDEX_LEFT_ANDROID  = 0,
        XR_EYE_INDEX_RIGHT_ANDROID = 1;

    public static final int
        XR_EYE_STATE_INVALID_ANDROID = 0,
        XR_EYE_STATE_GAZING_ANDROID  = 1,
        XR_EYE_STATE_SHUT_ANDROID    = 2;

    public static final int
        XR_EYE_TRACKING_MODE_NOT_TRACKING_ANDROID = 0,
        XR_EYE_TRACKING_MODE_RIGHT_ANDROID        = 1,
        XR_EYE_TRACKING_MODE_LEFT_ANDROID         = 2,
        XR_EYE_TRACKING_MODE_BOTH_ANDROID         = 3;

    protected ANDROIDEyeTracking() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateEyeTrackerANDROID ] ---

    /** {@code XrResult xrCreateEyeTrackerANDROID(XrSession session, XrEyeTrackerCreateInfoANDROID const * createInfo, XrEyeTrackerANDROID * eyeTracker)} */
    public static int nxrCreateEyeTrackerANDROID(XrSession session, long createInfo, long eyeTracker) {
        long __functionAddress = session.getCapabilities().xrCreateEyeTrackerANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, eyeTracker, __functionAddress);
    }

    /** {@code XrResult xrCreateEyeTrackerANDROID(XrSession session, XrEyeTrackerCreateInfoANDROID const * createInfo, XrEyeTrackerANDROID * eyeTracker)} */
    @NativeType("XrResult")
    public static int xrCreateEyeTrackerANDROID(XrSession session, @NativeType("XrEyeTrackerCreateInfoANDROID const *") XrEyeTrackerCreateInfoANDROID createInfo, @NativeType("XrEyeTrackerANDROID *") PointerBuffer eyeTracker) {
        if (CHECKS) {
            check(eyeTracker, 1);
        }
        return nxrCreateEyeTrackerANDROID(session, createInfo.address(), memAddress(eyeTracker));
    }

    // --- [ xrDestroyEyeTrackerANDROID ] ---

    /** {@code XrResult xrDestroyEyeTrackerANDROID(XrEyeTrackerANDROID eyeTracker)} */
    @NativeType("XrResult")
    public static int xrDestroyEyeTrackerANDROID(XrEyeTrackerANDROID eyeTracker) {
        long __functionAddress = eyeTracker.getCapabilities().xrDestroyEyeTrackerANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(eyeTracker.address(), __functionAddress);
    }

    // --- [ xrGetFineTrackingEyesInfoANDROID ] ---

    /** {@code XrResult xrGetFineTrackingEyesInfoANDROID(XrEyeTrackerANDROID eyeTracker, XrEyesGetInfoANDROID const * getInfo, XrEyesANDROID * eyesOutput)} */
    public static int nxrGetFineTrackingEyesInfoANDROID(XrEyeTrackerANDROID eyeTracker, long getInfo, long eyesOutput) {
        long __functionAddress = eyeTracker.getCapabilities().xrGetFineTrackingEyesInfoANDROID;
        if (CHECKS) {
            check(__functionAddress);
            XrEyesGetInfoANDROID.validate(getInfo);
        }
        return callPPPI(eyeTracker.address(), getInfo, eyesOutput, __functionAddress);
    }

    /** {@code XrResult xrGetFineTrackingEyesInfoANDROID(XrEyeTrackerANDROID eyeTracker, XrEyesGetInfoANDROID const * getInfo, XrEyesANDROID * eyesOutput)} */
    @NativeType("XrResult")
    public static int xrGetFineTrackingEyesInfoANDROID(XrEyeTrackerANDROID eyeTracker, @NativeType("XrEyesGetInfoANDROID const *") XrEyesGetInfoANDROID getInfo, @NativeType("XrEyesANDROID *") XrEyesANDROID eyesOutput) {
        return nxrGetFineTrackingEyesInfoANDROID(eyeTracker, getInfo.address(), eyesOutput.address());
    }

    // --- [ xrGetCoarseTrackingEyesInfoANDROID ] ---

    /** {@code XrResult xrGetCoarseTrackingEyesInfoANDROID(XrEyeTrackerANDROID eyeTracker, XrEyesGetInfoANDROID const * getInfo, XrEyesANDROID * eyesOutput)} */
    public static int nxrGetCoarseTrackingEyesInfoANDROID(XrEyeTrackerANDROID eyeTracker, long getInfo, long eyesOutput) {
        long __functionAddress = eyeTracker.getCapabilities().xrGetCoarseTrackingEyesInfoANDROID;
        if (CHECKS) {
            check(__functionAddress);
            XrEyesGetInfoANDROID.validate(getInfo);
        }
        return callPPPI(eyeTracker.address(), getInfo, eyesOutput, __functionAddress);
    }

    /** {@code XrResult xrGetCoarseTrackingEyesInfoANDROID(XrEyeTrackerANDROID eyeTracker, XrEyesGetInfoANDROID const * getInfo, XrEyesANDROID * eyesOutput)} */
    @NativeType("XrResult")
    public static int xrGetCoarseTrackingEyesInfoANDROID(XrEyeTrackerANDROID eyeTracker, @NativeType("XrEyesGetInfoANDROID const *") XrEyesGetInfoANDROID getInfo, @NativeType("XrEyesANDROID *") XrEyesANDROID eyesOutput) {
        return nxrGetCoarseTrackingEyesInfoANDROID(eyeTracker, getInfo.address(), eyesOutput.address());
    }

}