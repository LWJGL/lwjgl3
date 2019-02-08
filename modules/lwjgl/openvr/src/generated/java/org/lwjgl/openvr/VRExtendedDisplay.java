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

public class VRExtendedDisplay {

    protected VRExtendedDisplay() {
        throw new UnsupportedOperationException();
    }

    // --- [ VRExtendedDisplay_GetWindowBounds ] ---

    /** Unsafe version of: {@link #VRExtendedDisplay_GetWindowBounds GetWindowBounds} */
    public static void nVRExtendedDisplay_GetWindowBounds(long pnX, long pnY, long pnWidth, long pnHeight) {
        long __functionAddress = OpenVR.VRExtendedDisplay.GetWindowBounds;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPV(pnX, pnY, pnWidth, pnHeight, __functionAddress);
    }

    /** Size and position that the window needs to be on the VR display. */
    public static void VRExtendedDisplay_GetWindowBounds(@NativeType("int32_t *") IntBuffer pnX, @NativeType("int32_t *") IntBuffer pnY, @NativeType("uint32_t *") IntBuffer pnWidth, @NativeType("uint32_t *") IntBuffer pnHeight) {
        if (CHECKS) {
            check(pnX, 1);
            check(pnY, 1);
            check(pnWidth, 1);
            check(pnHeight, 1);
        }
        nVRExtendedDisplay_GetWindowBounds(memAddress(pnX), memAddress(pnY), memAddress(pnWidth), memAddress(pnHeight));
    }

    // --- [ VRExtendedDisplay_GetEyeOutputViewport ] ---

    /** Unsafe version of: {@link #VRExtendedDisplay_GetEyeOutputViewport GetEyeOutputViewport} */
    public static void nVRExtendedDisplay_GetEyeOutputViewport(int eEye, long pnX, long pnY, long pnWidth, long pnHeight) {
        long __functionAddress = OpenVR.VRExtendedDisplay.GetEyeOutputViewport;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPV(eEye, pnX, pnY, pnWidth, pnHeight, __functionAddress);
    }

    /** Gets the viewport in the frame buffer to draw the output of the distortion into. */
    public static void VRExtendedDisplay_GetEyeOutputViewport(@NativeType("EVREye") int eEye, @NativeType("uint32_t *") IntBuffer pnX, @NativeType("uint32_t *") IntBuffer pnY, @NativeType("uint32_t *") IntBuffer pnWidth, @NativeType("uint32_t *") IntBuffer pnHeight) {
        if (CHECKS) {
            check(pnX, 1);
            check(pnY, 1);
            check(pnWidth, 1);
            check(pnHeight, 1);
        }
        nVRExtendedDisplay_GetEyeOutputViewport(eEye, memAddress(pnX), memAddress(pnY), memAddress(pnWidth), memAddress(pnHeight));
    }

    // --- [ VRExtendedDisplay_GetDXGIOutputInfo ] ---

    /** Unsafe version of: {@link #VRExtendedDisplay_GetDXGIOutputInfo GetDXGIOutputInfo} */
    public static void nVRExtendedDisplay_GetDXGIOutputInfo(long pnAdapterIndex, long pnAdapterOutputIndex) {
        long __functionAddress = OpenVR.VRExtendedDisplay.GetDXGIOutputInfo;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(pnAdapterIndex, pnAdapterOutputIndex, __functionAddress);
    }

    /**
     * <h3>D3D10/11 Only</h3>
     * 
     * <p>Returns the adapter index and output index that the user should pass into {@code EnumAdapters} and {@code EnumOutputs} to create the device and swap
     * chain in DX10 and DX11. If an error occurs both indices will be set to -1.</p>
     */
    public static void VRExtendedDisplay_GetDXGIOutputInfo(@NativeType("int32_t *") IntBuffer pnAdapterIndex, @NativeType("int32_t *") IntBuffer pnAdapterOutputIndex) {
        if (CHECKS) {
            check(pnAdapterIndex, 1);
            check(pnAdapterOutputIndex, 1);
        }
        nVRExtendedDisplay_GetDXGIOutputInfo(memAddress(pnAdapterIndex), memAddress(pnAdapterOutputIndex));
    }

}