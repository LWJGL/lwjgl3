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

public class VRHeadsetView {

    protected VRHeadsetView() {
        throw new UnsupportedOperationException();
    }

    // --- [ VRHeadsetView_SetHeadsetViewSize ] ---

    /** {@code void VRHeadsetView_SetHeadsetViewSize(uint32_t nWidth, uint32_t nHeight)} */
    public static void VRHeadsetView_SetHeadsetViewSize(@NativeType("uint32_t") int nWidth, @NativeType("uint32_t") int nHeight) {
        long __functionAddress = OpenVR.VRHeadsetView.SetHeadsetViewSize;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(nWidth, nHeight, __functionAddress);
    }

    // --- [ VRHeadsetView_GetHeadsetViewSize ] ---

    /** {@code void VRHeadsetView_GetHeadsetViewSize(uint32_t * pnWidth, uint32_t * pnHeight)} */
    public static void nVRHeadsetView_GetHeadsetViewSize(long pnWidth, long pnHeight) {
        long __functionAddress = OpenVR.VRHeadsetView.GetHeadsetViewSize;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(pnWidth, pnHeight, __functionAddress);
    }

    /** {@code void VRHeadsetView_GetHeadsetViewSize(uint32_t * pnWidth, uint32_t * pnHeight)} */
    public static void VRHeadsetView_GetHeadsetViewSize(@NativeType("uint32_t *") IntBuffer pnWidth, @NativeType("uint32_t *") IntBuffer pnHeight) {
        if (CHECKS) {
            check(pnWidth, 1);
            check(pnHeight, 1);
        }
        nVRHeadsetView_GetHeadsetViewSize(memAddress(pnWidth), memAddress(pnHeight));
    }

    // --- [ VRHeadsetView_SetHeadsetViewMode ] ---

    /** {@code void VRHeadsetView_SetHeadsetViewMode(HeadsetViewMode_t eHeadsetViewMode)} */
    public static void VRHeadsetView_SetHeadsetViewMode(@NativeType("HeadsetViewMode_t") int eHeadsetViewMode) {
        long __functionAddress = OpenVR.VRHeadsetView.SetHeadsetViewMode;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(eHeadsetViewMode, __functionAddress);
    }

    // --- [ VRHeadsetView_GetHeadsetViewMode ] ---

    /** {@code HeadsetViewMode_t VRHeadsetView_GetHeadsetViewMode(void)} */
    @NativeType("HeadsetViewMode_t")
    public static int VRHeadsetView_GetHeadsetViewMode() {
        long __functionAddress = OpenVR.VRHeadsetView.GetHeadsetViewMode;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

    // --- [ VRHeadsetView_SetHeadsetViewCropped ] ---

    /** {@code void VRHeadsetView_SetHeadsetViewCropped(bool bCropped)} */
    public static void VRHeadsetView_SetHeadsetViewCropped(@NativeType("bool") boolean bCropped) {
        long __functionAddress = OpenVR.VRHeadsetView.SetHeadsetViewCropped;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(bCropped, __functionAddress);
    }

    // --- [ VRHeadsetView_GetHeadsetViewCropped ] ---

    /** {@code bool VRHeadsetView_GetHeadsetViewCropped(void)} */
    @NativeType("bool")
    public static boolean VRHeadsetView_GetHeadsetViewCropped() {
        long __functionAddress = OpenVR.VRHeadsetView.GetHeadsetViewCropped;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(__functionAddress);
    }

    // --- [ VRHeadsetView_GetHeadsetViewAspectRatio ] ---

    /** {@code float VRHeadsetView_GetHeadsetViewAspectRatio(void)} */
    public static float VRHeadsetView_GetHeadsetViewAspectRatio() {
        long __functionAddress = OpenVR.VRHeadsetView.GetHeadsetViewAspectRatio;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callF(__functionAddress);
    }

    // --- [ VRHeadsetView_SetHeadsetViewBlendRange ] ---

    /** {@code void VRHeadsetView_SetHeadsetViewBlendRange(float flStartPct, float flEndPct)} */
    public static void VRHeadsetView_SetHeadsetViewBlendRange(float flStartPct, float flEndPct) {
        long __functionAddress = OpenVR.VRHeadsetView.SetHeadsetViewBlendRange;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(flStartPct, flEndPct, __functionAddress);
    }

    // --- [ VRHeadsetView_GetHeadsetViewBlendRange ] ---

    /** {@code void VRHeadsetView_GetHeadsetViewBlendRange(float * pStartPct, float * pEndPct)} */
    public static void nVRHeadsetView_GetHeadsetViewBlendRange(long pStartPct, long pEndPct) {
        long __functionAddress = OpenVR.VRHeadsetView.GetHeadsetViewBlendRange;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(pStartPct, pEndPct, __functionAddress);
    }

    /** {@code void VRHeadsetView_GetHeadsetViewBlendRange(float * pStartPct, float * pEndPct)} */
    public static void VRHeadsetView_GetHeadsetViewBlendRange(@NativeType("float *") FloatBuffer pStartPct, @NativeType("float *") FloatBuffer pEndPct) {
        if (CHECKS) {
            check(pStartPct, 1);
            check(pEndPct, 1);
        }
        nVRHeadsetView_GetHeadsetViewBlendRange(memAddress(pStartPct), memAddress(pEndPct));
    }

}