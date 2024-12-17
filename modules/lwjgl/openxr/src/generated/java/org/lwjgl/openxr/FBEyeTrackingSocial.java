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

public class FBEyeTrackingSocial {

    public static final int XR_FB_eye_tracking_social_SPEC_VERSION = 1;

    public static final String XR_FB_EYE_TRACKING_SOCIAL_EXTENSION_NAME = "XR_FB_eye_tracking_social";

    public static final int XR_OBJECT_TYPE_EYE_TRACKER_FB = 1000202000;

    public static final int
        XR_TYPE_EYE_TRACKER_CREATE_INFO_FB        = 1000202001,
        XR_TYPE_EYE_GAZES_INFO_FB                 = 1000202002,
        XR_TYPE_EYE_GAZES_FB                      = 1000202003,
        XR_TYPE_SYSTEM_EYE_TRACKING_PROPERTIES_FB = 1000202004;

    public static final int
        XR_EYE_POSITION_LEFT_FB  = 0,
        XR_EYE_POSITION_RIGHT_FB = 1,
        XR_EYE_POSITION_COUNT_FB = 2;

    protected FBEyeTrackingSocial() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateEyeTrackerFB ] ---

    /** {@code XrResult xrCreateEyeTrackerFB(XrSession session, XrEyeTrackerCreateInfoFB const * createInfo, XrEyeTrackerFB * eyeTracker)} */
    public static int nxrCreateEyeTrackerFB(XrSession session, long createInfo, long eyeTracker) {
        long __functionAddress = session.getCapabilities().xrCreateEyeTrackerFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, eyeTracker, __functionAddress);
    }

    /** {@code XrResult xrCreateEyeTrackerFB(XrSession session, XrEyeTrackerCreateInfoFB const * createInfo, XrEyeTrackerFB * eyeTracker)} */
    @NativeType("XrResult")
    public static int xrCreateEyeTrackerFB(XrSession session, @NativeType("XrEyeTrackerCreateInfoFB const *") XrEyeTrackerCreateInfoFB createInfo, @NativeType("XrEyeTrackerFB *") PointerBuffer eyeTracker) {
        if (CHECKS) {
            check(eyeTracker, 1);
        }
        return nxrCreateEyeTrackerFB(session, createInfo.address(), memAddress(eyeTracker));
    }

    // --- [ xrDestroyEyeTrackerFB ] ---

    /** {@code XrResult xrDestroyEyeTrackerFB(XrEyeTrackerFB eyeTracker)} */
    @NativeType("XrResult")
    public static int xrDestroyEyeTrackerFB(XrEyeTrackerFB eyeTracker) {
        long __functionAddress = eyeTracker.getCapabilities().xrDestroyEyeTrackerFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(eyeTracker.address(), __functionAddress);
    }

    // --- [ xrGetEyeGazesFB ] ---

    /** {@code XrResult xrGetEyeGazesFB(XrEyeTrackerFB eyeTracker, XrEyeGazesInfoFB const * gazeInfo, XrEyeGazesFB * eyeGazes)} */
    public static int nxrGetEyeGazesFB(XrEyeTrackerFB eyeTracker, long gazeInfo, long eyeGazes) {
        long __functionAddress = eyeTracker.getCapabilities().xrGetEyeGazesFB;
        if (CHECKS) {
            check(__functionAddress);
            XrEyeGazesInfoFB.validate(gazeInfo);
        }
        return callPPPI(eyeTracker.address(), gazeInfo, eyeGazes, __functionAddress);
    }

    /** {@code XrResult xrGetEyeGazesFB(XrEyeTrackerFB eyeTracker, XrEyeGazesInfoFB const * gazeInfo, XrEyeGazesFB * eyeGazes)} */
    @NativeType("XrResult")
    public static int xrGetEyeGazesFB(XrEyeTrackerFB eyeTracker, @NativeType("XrEyeGazesInfoFB const *") XrEyeGazesInfoFB gazeInfo, @NativeType("XrEyeGazesFB *") XrEyeGazesFB eyeGazes) {
        return nxrGetEyeGazesFB(eyeTracker, gazeInfo.address(), eyeGazes.address());
    }

}