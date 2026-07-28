/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class BDFacialSimulation {

    public static final int XR_BD_facial_simulation_SPEC_VERSION = 1;

    public static final String XR_BD_FACIAL_SIMULATION_EXTENSION_NAME = "XR_BD_facial_simulation";

    public static final int XR_OBJECT_TYPE_FACE_TRACKER_BD = 1000386000;

    public static final int
        XR_TYPE_SYSTEM_FACIAL_SIMULATION_PROPERTIES_BD = 1000386001,
        XR_TYPE_FACE_TRACKER_CREATE_INFO_BD            = 1000386002,
        XR_TYPE_FACIAL_SIMULATION_DATA_GET_INFO_BD     = 1000386003,
        XR_TYPE_FACIAL_SIMULATION_DATA_BD              = 1000386004,
        XR_TYPE_LIP_EXPRESSION_DATA_BD                 = 1000386005;

    public static final int
        XR_FACIAL_SIMULATION_MODE_DEFAULT_BD                 = 0,
        XR_FACIAL_SIMULATION_MODE_COMBINED_AUDIO_BD          = 1,
        XR_FACIAL_SIMULATION_MODE_COMBINED_AUDIO_WITH_LIP_BD = 2,
        XR_FACIAL_SIMULATION_MODE_ONLY_AUDIO_WITH_LIP_BD     = 3;

    public static final int
        XR_FACE_EXPRESSION_BROW_DROP_L_BD           = 0,
        XR_FACE_EXPRESSION_BROW_DROP_R_BD           = 1,
        XR_FACE_EXPRESSION_BROW_INNER_UPWARDS_BD    = 2,
        XR_FACE_EXPRESSION_BROW_OUTER_UPWARDS_L_BD  = 3,
        XR_FACE_EXPRESSION_BROW_OUTER_UPWARDS_R_BD  = 4,
        XR_FACE_EXPRESSION_EYE_BLINK_L_BD           = 5,
        XR_FACE_EXPRESSION_EYE_LOOK_DROP_L_BD       = 6,
        XR_FACE_EXPRESSION_EYE_LOOK_IN_L_BD         = 7,
        XR_FACE_EXPRESSION_EYE_LOOK_OUT_L_BD        = 8,
        XR_FACE_EXPRESSION_EYE_LOOK_UPWARDS_L_BD    = 9,
        XR_FACE_EXPRESSION_EYE_LOOK_SQUINT_L_BD     = 10,
        XR_FACE_EXPRESSION_EYE_LOOK_WIDE_L_BD       = 11,
        XR_FACE_EXPRESSION_EYE_BLINK_R_BD           = 12,
        XR_FACE_EXPRESSION_EYE_LOOK_DROP_R_BD       = 13,
        XR_FACE_EXPRESSION_EYE_LOOK_IN_R_BD         = 14,
        XR_FACE_EXPRESSION_EYE_LOOK_OUT_R_BD        = 15,
        XR_FACE_EXPRESSION_EYE_LOOK_UPWARDS_R_BD    = 16,
        XR_FACE_EXPRESSION_EYE_LOOK_SQUINT_R_BD     = 17,
        XR_FACE_EXPRESSION_EYE_LOOK_WIDE_R_BD       = 18,
        XR_FACE_EXPRESSION_NOSE_SNEER_L_BD          = 19,
        XR_FACE_EXPRESSION_NOSE_SNEER_R_BD          = 20,
        XR_FACE_EXPRESSION_CHEEK_PUFF_BD            = 21,
        XR_FACE_EXPRESSION_CHEEK_SQUINT_L_BD        = 22,
        XR_FACE_EXPRESSION_CHEEK_SQUINT_R_BD        = 23,
        XR_FACE_EXPRESSION_MOUTH_CLOSE_BD           = 24,
        XR_FACE_EXPRESSION_MOUTH_FUNNEL_BD          = 25,
        XR_FACE_EXPRESSION_MOUTH_PUCKER_BD          = 26,
        XR_FACE_EXPRESSION_MOUTH_L_BD               = 27,
        XR_FACE_EXPRESSION_MOUTH_R_BD               = 28,
        XR_FACE_EXPRESSION_MOUTH_SMILE_L_BD         = 29,
        XR_FACE_EXPRESSION_MOUTH_SMILE_R_BD         = 30,
        XR_FACE_EXPRESSION_MOUTH_FROWN_L_BD         = 31,
        XR_FACE_EXPRESSION_MOUTH_FROWN_R_BD         = 32,
        XR_FACE_EXPRESSION_MOUTH_DIMPLE_L_BD        = 33,
        XR_FACE_EXPRESSION_MOUTH_DIMPLE_R_BD        = 34,
        XR_FACE_EXPRESSION_MOUTH_STRETCH_L_BD       = 35,
        XR_FACE_EXPRESSION_MOUTH_STRETCH_R_BD       = 36,
        XR_FACE_EXPRESSION_MOUTH_ROLL_LOWER_BD      = 37,
        XR_FACE_EXPRESSION_MOUTH_ROLL_UPPER_BD      = 38,
        XR_FACE_EXPRESSION_MOUTH_SHRUG_LOWER_BD     = 39,
        XR_FACE_EXPRESSION_MOUTH_SHRUG_UPPER_BD     = 40,
        XR_FACE_EXPRESSION_MOUTH_PRESS_L_BD         = 41,
        XR_FACE_EXPRESSION_MOUTH_PRESS_R_BD         = 42,
        XR_FACE_EXPRESSION_MOUTH_LOWER_DROP_L_BD    = 43,
        XR_FACE_EXPRESSION_MOUTH_LOWER_DROP_R_BD    = 44,
        XR_FACE_EXPRESSION_MOUTH_UPPER_UPWARDS_L_BD = 45,
        XR_FACE_EXPRESSION_MOUTH_UPPER_UPWARDS_R_BD = 46,
        XR_FACE_EXPRESSION_JAW_FORWARD_BD           = 47,
        XR_FACE_EXPRESSION_JAW_L_BD                 = 48,
        XR_FACE_EXPRESSION_JAW_R_BD                 = 49,
        XR_FACE_EXPRESSION_JAW_OPEN_BD              = 50,
        XR_FACE_EXPRESSION_TONGUE_OUT_BD            = 51;

    public static final int
        XR_LIP_EXPRESSION_PP_BD  = 0,
        XR_LIP_EXPRESSION_CH_BD  = 1,
        XR_LIP_EXPRESSION_LO_BD  = 2,
        XR_LIP_EXPRESSION_O_BD   = 3,
        XR_LIP_EXPRESSION_I_BD   = 4,
        XR_LIP_EXPRESSION_LU_BD  = 5,
        XR_LIP_EXPRESSION_RR_BD  = 6,
        XR_LIP_EXPRESSION_XX_BD  = 7,
        XR_LIP_EXPRESSION_LAA_BD = 8,
        XR_LIP_EXPRESSION_LI_BD  = 9,
        XR_LIP_EXPRESSION_FF_BD  = 10,
        XR_LIP_EXPRESSION_U_BD   = 11,
        XR_LIP_EXPRESSION_TH_BD  = 12,
        XR_LIP_EXPRESSION_LKK_BD = 13,
        XR_LIP_EXPRESSION_SS_BD  = 14,
        XR_LIP_EXPRESSION_LE_BD  = 15,
        XR_LIP_EXPRESSION_DD_BD  = 16,
        XR_LIP_EXPRESSION_E_BD   = 17,
        XR_LIP_EXPRESSION_LNN_BD = 18,
        XR_LIP_EXPRESSION_SIL_BD = 19;

    protected BDFacialSimulation() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrEnumerateFacialSimulationModesBD ] ---

    /** {@code XrResult xrEnumerateFacialSimulationModesBD(XrSession session, uint32_t modeCapacityInput, uint32_t * modeCountOutput, XrFacialSimulationModeBD * modes)} */
    public static int nxrEnumerateFacialSimulationModesBD(XrSession session, int modeCapacityInput, long modeCountOutput, long modes) {
        long __functionAddress = session.getCapabilities().xrEnumerateFacialSimulationModesBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), modeCapacityInput, modeCountOutput, modes, __functionAddress);
    }

    /** {@code XrResult xrEnumerateFacialSimulationModesBD(XrSession session, uint32_t modeCapacityInput, uint32_t * modeCountOutput, XrFacialSimulationModeBD * modes)} */
    @NativeType("XrResult")
    public static int xrEnumerateFacialSimulationModesBD(XrSession session, @NativeType("uint32_t *") IntBuffer modeCountOutput, @NativeType("XrFacialSimulationModeBD *") @Nullable IntBuffer modes) {
        if (CHECKS) {
            check(modeCountOutput, 1);
        }
        return nxrEnumerateFacialSimulationModesBD(session, remainingSafe(modes), memAddress(modeCountOutput), memAddressSafe(modes));
    }

    // --- [ xrCreateFaceTrackerBD ] ---

    /** {@code XrResult xrCreateFaceTrackerBD(XrSession session, XrFaceTrackerCreateInfoBD const * createInfo, XrFaceTrackerBD * tracker)} */
    public static int nxrCreateFaceTrackerBD(XrSession session, long createInfo, long tracker) {
        long __functionAddress = session.getCapabilities().xrCreateFaceTrackerBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, tracker, __functionAddress);
    }

    /** {@code XrResult xrCreateFaceTrackerBD(XrSession session, XrFaceTrackerCreateInfoBD const * createInfo, XrFaceTrackerBD * tracker)} */
    @NativeType("XrResult")
    public static int xrCreateFaceTrackerBD(XrSession session, @NativeType("XrFaceTrackerCreateInfoBD const *") XrFaceTrackerCreateInfoBD createInfo, @NativeType("XrFaceTrackerBD *") PointerBuffer tracker) {
        if (CHECKS) {
            check(tracker, 1);
        }
        return nxrCreateFaceTrackerBD(session, createInfo.address(), memAddress(tracker));
    }

    // --- [ xrDestroyFaceTrackerBD ] ---

    /** {@code XrResult xrDestroyFaceTrackerBD(XrFaceTrackerBD tracker)} */
    @NativeType("XrResult")
    public static int xrDestroyFaceTrackerBD(XrFaceTrackerBD tracker) {
        long __functionAddress = tracker.getCapabilities().xrDestroyFaceTrackerBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(tracker.address(), __functionAddress);
    }

    // --- [ xrGetFacialSimulationDataBD ] ---

    /** {@code XrResult xrGetFacialSimulationDataBD(XrFaceTrackerBD tracker, XrFacialSimulationDataGetInfoBD const * info, XrFacialSimulationDataBD * facialData)} */
    public static int nxrGetFacialSimulationDataBD(XrFaceTrackerBD tracker, long info, long facialData) {
        long __functionAddress = tracker.getCapabilities().xrGetFacialSimulationDataBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(tracker.address(), info, facialData, __functionAddress);
    }

    /** {@code XrResult xrGetFacialSimulationDataBD(XrFaceTrackerBD tracker, XrFacialSimulationDataGetInfoBD const * info, XrFacialSimulationDataBD * facialData)} */
    @NativeType("XrResult")
    public static int xrGetFacialSimulationDataBD(XrFaceTrackerBD tracker, @NativeType("XrFacialSimulationDataGetInfoBD const *") XrFacialSimulationDataGetInfoBD info, @NativeType("XrFacialSimulationDataBD *") XrFacialSimulationDataBD facialData) {
        return nxrGetFacialSimulationDataBD(tracker, info.address(), facialData.address());
    }

    // --- [ xrSetFacialSimulationModeBD ] ---

    /** {@code XrResult xrSetFacialSimulationModeBD(XrFaceTrackerBD tracker, XrFacialSimulationModeBD mode)} */
    @NativeType("XrResult")
    public static int xrSetFacialSimulationModeBD(XrFaceTrackerBD tracker, @NativeType("XrFacialSimulationModeBD") int mode) {
        long __functionAddress = tracker.getCapabilities().xrSetFacialSimulationModeBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(tracker.address(), mode, __functionAddress);
    }

    // --- [ xrGetFacialSimulationModeBD ] ---

    /** {@code XrResult xrGetFacialSimulationModeBD(XrFaceTrackerBD tracker, XrFacialSimulationModeBD * mode)} */
    public static int nxrGetFacialSimulationModeBD(XrFaceTrackerBD tracker, long mode) {
        long __functionAddress = tracker.getCapabilities().xrGetFacialSimulationModeBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(tracker.address(), mode, __functionAddress);
    }

    /** {@code XrResult xrGetFacialSimulationModeBD(XrFaceTrackerBD tracker, XrFacialSimulationModeBD * mode)} */
    @NativeType("XrResult")
    public static int xrGetFacialSimulationModeBD(XrFaceTrackerBD tracker, @NativeType("XrFacialSimulationModeBD *") IntBuffer mode) {
        if (CHECKS) {
            check(mode, 1);
        }
        return nxrGetFacialSimulationModeBD(tracker, memAddress(mode));
    }

}