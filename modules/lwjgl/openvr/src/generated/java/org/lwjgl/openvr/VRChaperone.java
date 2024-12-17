/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class VRChaperone {

    static { OpenVR.initialize(); }

    protected VRChaperone() {
        throw new UnsupportedOperationException();
    }

    // --- [ VRChaperone_GetCalibrationState ] ---

    /** {@code ChaperoneCalibrationState VRChaperone_GetCalibrationState(void)} */
    @NativeType("ChaperoneCalibrationState")
    public static int VRChaperone_GetCalibrationState() {
        long __functionAddress = OpenVR.VRChaperone.GetCalibrationState;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

    // --- [ VRChaperone_GetPlayAreaSize ] ---

    /** {@code bool VRChaperone_GetPlayAreaSize(float * pSizeX, float * pSizeZ)} */
    public static boolean nVRChaperone_GetPlayAreaSize(long pSizeX, long pSizeZ) {
        long __functionAddress = OpenVR.VRChaperone.GetPlayAreaSize;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPZ(pSizeX, pSizeZ, __functionAddress);
    }

    /** {@code bool VRChaperone_GetPlayAreaSize(float * pSizeX, float * pSizeZ)} */
    @NativeType("bool")
    public static boolean VRChaperone_GetPlayAreaSize(@NativeType("float *") FloatBuffer pSizeX, @NativeType("float *") FloatBuffer pSizeZ) {
        if (CHECKS) {
            check(pSizeX, 1);
            check(pSizeZ, 1);
        }
        return nVRChaperone_GetPlayAreaSize(memAddress(pSizeX), memAddress(pSizeZ));
    }

    // --- [ VRChaperone_GetPlayAreaRect ] ---

    /** {@code bool VRChaperone_GetPlayAreaRect(HmdQuad_t * rect)} */
    public static boolean nVRChaperone_GetPlayAreaRect(long rect) {
        long __functionAddress = OpenVR.VRChaperone.GetPlayAreaRect;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPZ(rect, __functionAddress);
    }

    /** {@code bool VRChaperone_GetPlayAreaRect(HmdQuad_t * rect)} */
    @NativeType("bool")
    public static boolean VRChaperone_GetPlayAreaRect(@NativeType("HmdQuad_t *") HmdQuad rect) {
        return nVRChaperone_GetPlayAreaRect(rect.address());
    }

    // --- [ VRChaperone_ReloadInfo ] ---

    /** {@code void VRChaperone_ReloadInfo(void)} */
    public static void VRChaperone_ReloadInfo() {
        long __functionAddress = OpenVR.VRChaperone.ReloadInfo;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ VRChaperone_SetSceneColor ] ---

    /** {@code void VRChaperone_SetSceneColor(HmdColor_t color)} */
    public static native void nVRChaperone_SetSceneColor(long color, long __functionAddress);

    /** {@code void VRChaperone_SetSceneColor(HmdColor_t color)} */
    public static void nVRChaperone_SetSceneColor(long color) {
        long __functionAddress = OpenVR.VRChaperone.SetSceneColor;
        if (CHECKS) {
            check(__functionAddress);
        }
        nVRChaperone_SetSceneColor(color, __functionAddress);
    }

    /** {@code void VRChaperone_SetSceneColor(HmdColor_t color)} */
    public static void VRChaperone_SetSceneColor(@NativeType("HmdColor_t") HmdColor color) {
        nVRChaperone_SetSceneColor(color.address());
    }

    // --- [ VRChaperone_GetBoundsColor ] ---

    /** {@code void VRChaperone_GetBoundsColor(HmdColor_t * pOutputColorArray, int nNumOutputColors, float flCollisionBoundsFadeDistance, HmdColor_t * pOutputCameraColor)} */
    public static void nVRChaperone_GetBoundsColor(long pOutputColorArray, int nNumOutputColors, float flCollisionBoundsFadeDistance, long pOutputCameraColor) {
        long __functionAddress = OpenVR.VRChaperone.GetBoundsColor;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(pOutputColorArray, nNumOutputColors, flCollisionBoundsFadeDistance, pOutputCameraColor, __functionAddress);
    }

    /** {@code void VRChaperone_GetBoundsColor(HmdColor_t * pOutputColorArray, int nNumOutputColors, float flCollisionBoundsFadeDistance, HmdColor_t * pOutputCameraColor)} */
    public static void VRChaperone_GetBoundsColor(@NativeType("HmdColor_t *") HmdColor.Buffer pOutputColorArray, float flCollisionBoundsFadeDistance, @NativeType("HmdColor_t *") HmdColor pOutputCameraColor) {
        nVRChaperone_GetBoundsColor(pOutputColorArray.address(), pOutputColorArray.remaining(), flCollisionBoundsFadeDistance, pOutputCameraColor.address());
    }

    // --- [ VRChaperone_AreBoundsVisible ] ---

    /** {@code bool VRChaperone_AreBoundsVisible(void)} */
    @NativeType("bool")
    public static boolean VRChaperone_AreBoundsVisible() {
        long __functionAddress = OpenVR.VRChaperone.AreBoundsVisible;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(__functionAddress);
    }

    // --- [ VRChaperone_ForceBoundsVisible ] ---

    /** {@code void VRChaperone_ForceBoundsVisible(bool bForce)} */
    public static void VRChaperone_ForceBoundsVisible(@NativeType("bool") boolean bForce) {
        long __functionAddress = OpenVR.VRChaperone.ForceBoundsVisible;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(bForce, __functionAddress);
    }

    // --- [ VRChaperone_ResetZeroPose ] ---

    /** {@code void VRChaperone_ResetZeroPose(ETrackingUniverseOrigin eTrackingUniverseOrigin)} */
    public static void VRChaperone_ResetZeroPose(@NativeType("ETrackingUniverseOrigin") int eTrackingUniverseOrigin) {
        long __functionAddress = OpenVR.VRChaperone.ResetZeroPose;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(eTrackingUniverseOrigin, __functionAddress);
    }

}