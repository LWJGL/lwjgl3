/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class ANDROIDFaceTracking {

    public static final int XR_ANDROID_face_tracking_SPEC_VERSION = 1;

    public static final String XR_ANDROID_FACE_TRACKING_EXTENSION_NAME = "XR_ANDROID_face_tracking";

    public static final int
        XR_TYPE_FACE_TRACKER_CREATE_INFO_ANDROID        = 1000458000,
        XR_TYPE_FACE_STATE_GET_INFO_ANDROID             = 1000458001,
        XR_TYPE_FACE_STATE_ANDROID                      = 1000458002,
        XR_TYPE_SYSTEM_FACE_TRACKING_PROPERTIES_ANDROID = 1000458003;

    public static final int XR_ERROR_SERVICE_NOT_READY_ANDROID = -1000458000;

    public static final int XR_OBJECT_TYPE_FACE_TRACKER_ANDROID = 1000458000;

    public static final int XR_FACE_PARAMETER_COUNT_ANDROID = 68;

    public static final int XR_FACE_REGION_CONFIDENCE_COUNT_ANDROID = 3;

    public static final int
        XR_FACE_PARAMETER_INDICES_BROW_LOWERER_L_ANDROID         = 0,
        XR_FACE_PARAMETER_INDICES_BROW_LOWERER_R_ANDROID         = 1,
        XR_FACE_PARAMETER_INDICES_CHEEK_PUFF_L_ANDROID           = 2,
        XR_FACE_PARAMETER_INDICES_CHEEK_PUFF_R_ANDROID           = 3,
        XR_FACE_PARAMETER_INDICES_CHEEK_RAISER_L_ANDROID         = 4,
        XR_FACE_PARAMETER_INDICES_CHEEK_RAISER_R_ANDROID         = 5,
        XR_FACE_PARAMETER_INDICES_CHEEK_SUCK_L_ANDROID           = 6,
        XR_FACE_PARAMETER_INDICES_CHEEK_SUCK_R_ANDROID           = 7,
        XR_FACE_PARAMETER_INDICES_CHIN_RAISER_B_ANDROID          = 8,
        XR_FACE_PARAMETER_INDICES_CHIN_RAISER_T_ANDROID          = 9,
        XR_FACE_PARAMETER_INDICES_DIMPLER_L_ANDROID              = 10,
        XR_FACE_PARAMETER_INDICES_DIMPLER_R_ANDROID              = 11,
        XR_FACE_PARAMETER_INDICES_EYES_CLOSED_L_ANDROID          = 12,
        XR_FACE_PARAMETER_INDICES_EYES_CLOSED_R_ANDROID          = 13,
        XR_FACE_PARAMETER_INDICES_EYES_LOOK_DOWN_L_ANDROID       = 14,
        XR_FACE_PARAMETER_INDICES_EYES_LOOK_DOWN_R_ANDROID       = 15,
        XR_FACE_PARAMETER_INDICES_EYES_LOOK_LEFT_L_ANDROID       = 16,
        XR_FACE_PARAMETER_INDICES_EYES_LOOK_LEFT_R_ANDROID       = 17,
        XR_FACE_PARAMETER_INDICES_EYES_LOOK_RIGHT_L_ANDROID      = 18,
        XR_FACE_PARAMETER_INDICES_EYES_LOOK_RIGHT_R_ANDROID      = 19,
        XR_FACE_PARAMETER_INDICES_EYES_LOOK_UP_L_ANDROID         = 20,
        XR_FACE_PARAMETER_INDICES_EYES_LOOK_UP_R_ANDROID         = 21,
        XR_FACE_PARAMETER_INDICES_INNER_BROW_RAISER_L_ANDROID    = 22,
        XR_FACE_PARAMETER_INDICES_INNER_BROW_RAISER_R_ANDROID    = 23,
        XR_FACE_PARAMETER_INDICES_JAW_DROP_ANDROID               = 24,
        XR_FACE_PARAMETER_INDICES_JAW_SIDEWAYS_LEFT_ANDROID      = 25,
        XR_FACE_PARAMETER_INDICES_JAW_SIDEWAYS_RIGHT_ANDROID     = 26,
        XR_FACE_PARAMETER_INDICES_JAW_THRUST_ANDROID             = 27,
        XR_FACE_PARAMETER_INDICES_LID_TIGHTENER_L_ANDROID        = 28,
        XR_FACE_PARAMETER_INDICES_LID_TIGHTENER_R_ANDROID        = 29,
        XR_FACE_PARAMETER_INDICES_LIP_CORNER_DEPRESSOR_L_ANDROID = 30,
        XR_FACE_PARAMETER_INDICES_LIP_CORNER_DEPRESSOR_R_ANDROID = 31,
        XR_FACE_PARAMETER_INDICES_LIP_CORNER_PULLER_L_ANDROID    = 32,
        XR_FACE_PARAMETER_INDICES_LIP_CORNER_PULLER_R_ANDROID    = 33,
        XR_FACE_PARAMETER_INDICES_LIP_FUNNELER_LB_ANDROID        = 34,
        XR_FACE_PARAMETER_INDICES_LIP_FUNNELER_LT_ANDROID        = 35,
        XR_FACE_PARAMETER_INDICES_LIP_FUNNELER_RB_ANDROID        = 36,
        XR_FACE_PARAMETER_INDICES_LIP_FUNNELER_RT_ANDROID        = 37,
        XR_FACE_PARAMETER_INDICES_LIP_PRESSOR_L_ANDROID          = 38,
        XR_FACE_PARAMETER_INDICES_LIP_PRESSOR_R_ANDROID          = 39,
        XR_FACE_PARAMETER_INDICES_LIP_PUCKER_L_ANDROID           = 40,
        XR_FACE_PARAMETER_INDICES_LIP_PUCKER_R_ANDROID           = 41,
        XR_FACE_PARAMETER_INDICES_LIP_STRETCHER_L_ANDROID        = 42,
        XR_FACE_PARAMETER_INDICES_LIP_STRETCHER_R_ANDROID        = 43,
        XR_FACE_PARAMETER_INDICES_LIP_SUCK_LB_ANDROID            = 44,
        XR_FACE_PARAMETER_INDICES_LIP_SUCK_LT_ANDROID            = 45,
        XR_FACE_PARAMETER_INDICES_LIP_SUCK_RB_ANDROID            = 46,
        XR_FACE_PARAMETER_INDICES_LIP_SUCK_RT_ANDROID            = 47,
        XR_FACE_PARAMETER_INDICES_LIP_TIGHTENER_L_ANDROID        = 48,
        XR_FACE_PARAMETER_INDICES_LIP_TIGHTENER_R_ANDROID        = 49,
        XR_FACE_PARAMETER_INDICES_LIPS_TOWARD_ANDROID            = 50,
        XR_FACE_PARAMETER_INDICES_LOWER_LIP_DEPRESSOR_L_ANDROID  = 51,
        XR_FACE_PARAMETER_INDICES_LOWER_LIP_DEPRESSOR_R_ANDROID  = 52,
        XR_FACE_PARAMETER_INDICES_MOUTH_LEFT_ANDROID             = 53,
        XR_FACE_PARAMETER_INDICES_MOUTH_RIGHT_ANDROID            = 54,
        XR_FACE_PARAMETER_INDICES_NOSE_WRINKLER_L_ANDROID        = 55,
        XR_FACE_PARAMETER_INDICES_NOSE_WRINKLER_R_ANDROID        = 56,
        XR_FACE_PARAMETER_INDICES_OUTER_BROW_RAISER_L_ANDROID    = 57,
        XR_FACE_PARAMETER_INDICES_OUTER_BROW_RAISER_R_ANDROID    = 58,
        XR_FACE_PARAMETER_INDICES_UPPER_LID_RAISER_L_ANDROID     = 59,
        XR_FACE_PARAMETER_INDICES_UPPER_LID_RAISER_R_ANDROID     = 60,
        XR_FACE_PARAMETER_INDICES_UPPER_LIP_RAISER_L_ANDROID     = 61,
        XR_FACE_PARAMETER_INDICES_UPPER_LIP_RAISER_R_ANDROID     = 62,
        XR_FACE_PARAMETER_INDICES_TONGUE_OUT_ANDROID             = 63,
        XR_FACE_PARAMETER_INDICES_TONGUE_LEFT_ANDROID            = 64,
        XR_FACE_PARAMETER_INDICES_TONGUE_RIGHT_ANDROID           = 65,
        XR_FACE_PARAMETER_INDICES_TONGUE_UP_ANDROID              = 66,
        XR_FACE_PARAMETER_INDICES_TONGUE_DOWN_ANDROID            = 67;

    public static final int
        XR_FACE_TRACKING_STATE_PAUSED_ANDROID   = 0,
        XR_FACE_TRACKING_STATE_STOPPED_ANDROID  = 1,
        XR_FACE_TRACKING_STATE_TRACKING_ANDROID = 2;

    public static final int
        XR_FACE_CONFIDENCE_REGIONS_LOWER_ANDROID       = 0,
        XR_FACE_CONFIDENCE_REGIONS_LEFT_UPPER_ANDROID  = 1,
        XR_FACE_CONFIDENCE_REGIONS_RIGHT_UPPER_ANDROID = 2;

    protected ANDROIDFaceTracking() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateFaceTrackerANDROID ] ---

    /** {@code XrResult xrCreateFaceTrackerANDROID(XrSession session, XrFaceTrackerCreateInfoANDROID const * createInfo, XrFaceTrackerANDROID * faceTracker)} */
    public static int nxrCreateFaceTrackerANDROID(XrSession session, long createInfo, long faceTracker) {
        long __functionAddress = session.getCapabilities().xrCreateFaceTrackerANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, faceTracker, __functionAddress);
    }

    /** {@code XrResult xrCreateFaceTrackerANDROID(XrSession session, XrFaceTrackerCreateInfoANDROID const * createInfo, XrFaceTrackerANDROID * faceTracker)} */
    @NativeType("XrResult")
    public static int xrCreateFaceTrackerANDROID(XrSession session, @NativeType("XrFaceTrackerCreateInfoANDROID const *") XrFaceTrackerCreateInfoANDROID createInfo, @NativeType("XrFaceTrackerANDROID *") PointerBuffer faceTracker) {
        if (CHECKS) {
            check(faceTracker, 1);
        }
        return nxrCreateFaceTrackerANDROID(session, createInfo.address(), memAddress(faceTracker));
    }

    // --- [ xrDestroyFaceTrackerANDROID ] ---

    /** {@code XrResult xrDestroyFaceTrackerANDROID(XrFaceTrackerANDROID faceTracker)} */
    @NativeType("XrResult")
    public static int xrDestroyFaceTrackerANDROID(XrFaceTrackerANDROID faceTracker) {
        long __functionAddress = faceTracker.getCapabilities().xrDestroyFaceTrackerANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(faceTracker.address(), __functionAddress);
    }

    // --- [ xrGetFaceStateANDROID ] ---

    /** {@code XrResult xrGetFaceStateANDROID(XrFaceTrackerANDROID faceTracker, XrFaceStateGetInfoANDROID const * getInfo, XrFaceStateANDROID * faceStateOutput)} */
    public static int nxrGetFaceStateANDROID(XrFaceTrackerANDROID faceTracker, long getInfo, long faceStateOutput) {
        long __functionAddress = faceTracker.getCapabilities().xrGetFaceStateANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(faceTracker.address(), getInfo, faceStateOutput, __functionAddress);
    }

    /** {@code XrResult xrGetFaceStateANDROID(XrFaceTrackerANDROID faceTracker, XrFaceStateGetInfoANDROID const * getInfo, XrFaceStateANDROID * faceStateOutput)} */
    @NativeType("XrResult")
    public static int xrGetFaceStateANDROID(XrFaceTrackerANDROID faceTracker, @NativeType("XrFaceStateGetInfoANDROID const *") XrFaceStateGetInfoANDROID getInfo, @NativeType("XrFaceStateANDROID *") XrFaceStateANDROID faceStateOutput) {
        return nxrGetFaceStateANDROID(faceTracker, getInfo.address(), faceStateOutput.address());
    }

    // --- [ xrGetFaceCalibrationStateANDROID ] ---

    /** {@code XrResult xrGetFaceCalibrationStateANDROID(XrFaceTrackerANDROID faceTracker, XrBool32 * faceIsCalibratedOutput)} */
    public static int nxrGetFaceCalibrationStateANDROID(XrFaceTrackerANDROID faceTracker, long faceIsCalibratedOutput) {
        long __functionAddress = faceTracker.getCapabilities().xrGetFaceCalibrationStateANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(faceTracker.address(), faceIsCalibratedOutput, __functionAddress);
    }

    /** {@code XrResult xrGetFaceCalibrationStateANDROID(XrFaceTrackerANDROID faceTracker, XrBool32 * faceIsCalibratedOutput)} */
    @NativeType("XrResult")
    public static int xrGetFaceCalibrationStateANDROID(XrFaceTrackerANDROID faceTracker, @NativeType("XrBool32 *") IntBuffer faceIsCalibratedOutput) {
        if (CHECKS) {
            check(faceIsCalibratedOutput, 1);
        }
        return nxrGetFaceCalibrationStateANDROID(faceTracker, memAddress(faceIsCalibratedOutput));
    }

}