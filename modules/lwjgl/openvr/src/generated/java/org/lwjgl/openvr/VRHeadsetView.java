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

    /**
     * Sets the resolution in pixels to render the headset view.
     * 
     * <p>These values are clamped to {@link VR#k_unHeadsetViewMaxWidth} and {@link VR#k_unHeadsetViewMaxHeight} respectively. For cropped views, the rendered output will be fit to
     * aspect ratio defined by the the specified dimensions. For uncropped views, the caller should use {@link #VRHeadsetView_GetHeadsetViewAspectRatio GetHeadsetViewAspectRatio} to adjust the requested
     * render size to avoid squashing or stretching, and then apply letterboxing to compensate when displaying the results.</p>
     */
    public static void VRHeadsetView_SetHeadsetViewSize(@NativeType("uint32_t") int nWidth, @NativeType("uint32_t") int nHeight) {
        long __functionAddress = OpenVR.VRHeadsetView.SetHeadsetViewSize;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(nWidth, nHeight, __functionAddress);
    }

    // --- [ VRHeadsetView_GetHeadsetViewSize ] ---

    /** Unsafe version of: {@link #VRHeadsetView_GetHeadsetViewSize GetHeadsetViewSize} */
    public static void nVRHeadsetView_GetHeadsetViewSize(long pnWidth, long pnHeight) {
        long __functionAddress = OpenVR.VRHeadsetView.GetHeadsetViewSize;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(pnWidth, pnHeight, __functionAddress);
    }

    /** Gets the current resolution used to render the headset view. */
    public static void VRHeadsetView_GetHeadsetViewSize(@NativeType("uint32_t *") IntBuffer pnWidth, @NativeType("uint32_t *") IntBuffer pnHeight) {
        if (CHECKS) {
            check(pnWidth, 1);
            check(pnHeight, 1);
        }
        nVRHeadsetView_GetHeadsetViewSize(memAddress(pnWidth), memAddress(pnHeight));
    }

    // --- [ VRHeadsetView_SetHeadsetViewMode ] ---

    /**
     * Sets the mode used to render the headset view.
     *
     * @param eHeadsetViewMode one of:<br><table><tr><td>{@link VR#HeadsetViewMode_t_HeadsetViewMode_Left}</td><td>{@link VR#HeadsetViewMode_t_HeadsetViewMode_Right}</td></tr><tr><td>{@link VR#HeadsetViewMode_t_HeadsetViewMode_Both}</td></tr></table>
     */
    public static void VRHeadsetView_SetHeadsetViewMode(@NativeType("HeadsetViewMode_t") int eHeadsetViewMode) {
        long __functionAddress = OpenVR.VRHeadsetView.SetHeadsetViewMode;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(eHeadsetViewMode, __functionAddress);
    }

    // --- [ VRHeadsetView_GetHeadsetViewMode ] ---

    /** Gets the current mode used to render the headset view. */
    @NativeType("HeadsetViewMode_t")
    public static int VRHeadsetView_GetHeadsetViewMode() {
        long __functionAddress = OpenVR.VRHeadsetView.GetHeadsetViewMode;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

    // --- [ VRHeadsetView_SetHeadsetViewCropped ] ---

    /** Sets whether or not the headset view should be rendered cropped to hide the hidden area mesh or not. */
    public static void VRHeadsetView_SetHeadsetViewCropped(@NativeType("bool") boolean bCropped) {
        long __functionAddress = OpenVR.VRHeadsetView.SetHeadsetViewCropped;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(bCropped, __functionAddress);
    }

    // --- [ VRHeadsetView_GetHeadsetViewCropped ] ---

    /** Gets the current cropping status of the headset view. */
    @NativeType("bool")
    public static boolean VRHeadsetView_GetHeadsetViewCropped() {
        long __functionAddress = OpenVR.VRHeadsetView.GetHeadsetViewCropped;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(__functionAddress);
    }

    // --- [ VRHeadsetView_GetHeadsetViewAspectRatio ] ---

    /** Gets the aspect ratio (width:height) of the uncropped headset view (accounting for the current set mode). */
    public static float VRHeadsetView_GetHeadsetViewAspectRatio() {
        long __functionAddress = OpenVR.VRHeadsetView.GetHeadsetViewAspectRatio;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callF(__functionAddress);
    }

    // --- [ VRHeadsetView_SetHeadsetViewBlendRange ] ---

    /** Sets the range {@code [0..1]} that the headset view blends across the stereo overlapped area in cropped both mode. */
    public static void VRHeadsetView_SetHeadsetViewBlendRange(float flStartPct, float flEndPct) {
        long __functionAddress = OpenVR.VRHeadsetView.SetHeadsetViewBlendRange;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(flStartPct, flEndPct, __functionAddress);
    }

    // --- [ VRHeadsetView_GetHeadsetViewBlendRange ] ---

    /** Unsafe version of: {@link #VRHeadsetView_GetHeadsetViewBlendRange GetHeadsetViewBlendRange} */
    public static void nVRHeadsetView_GetHeadsetViewBlendRange(long pStartPct, long pEndPct) {
        long __functionAddress = OpenVR.VRHeadsetView.GetHeadsetViewBlendRange;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(pStartPct, pEndPct, __functionAddress);
    }

    /** Gets the current range {@code [0..1]} that the headset view blends across the stereo overlapped area in cropped both mode. */
    public static void VRHeadsetView_GetHeadsetViewBlendRange(@NativeType("float *") FloatBuffer pStartPct, @NativeType("float *") FloatBuffer pEndPct) {
        if (CHECKS) {
            check(pStartPct, 1);
            check(pEndPct, 1);
        }
        nVRHeadsetView_GetHeadsetViewBlendRange(memAddress(pStartPct), memAddress(pEndPct));
    }

}