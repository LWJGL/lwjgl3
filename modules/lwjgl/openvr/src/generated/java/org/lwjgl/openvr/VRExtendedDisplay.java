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

    /** {@code void VRExtendedDisplay_GetWindowBounds(int32_t * pnX, int32_t * pnY, uint32_t * pnWidth, uint32_t * pnHeight)} */
    public static void nVRExtendedDisplay_GetWindowBounds(long pnX, long pnY, long pnWidth, long pnHeight) {
        long __functionAddress = OpenVR.VRExtendedDisplay.GetWindowBounds;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPV(pnX, pnY, pnWidth, pnHeight, __functionAddress);
    }

    /** {@code void VRExtendedDisplay_GetWindowBounds(int32_t * pnX, int32_t * pnY, uint32_t * pnWidth, uint32_t * pnHeight)} */
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

    /** {@code void VRExtendedDisplay_GetEyeOutputViewport(EVREye eEye, uint32_t * pnX, uint32_t * pnY, uint32_t * pnWidth, uint32_t * pnHeight)} */
    public static void nVRExtendedDisplay_GetEyeOutputViewport(int eEye, long pnX, long pnY, long pnWidth, long pnHeight) {
        long __functionAddress = OpenVR.VRExtendedDisplay.GetEyeOutputViewport;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPV(eEye, pnX, pnY, pnWidth, pnHeight, __functionAddress);
    }

    /** {@code void VRExtendedDisplay_GetEyeOutputViewport(EVREye eEye, uint32_t * pnX, uint32_t * pnY, uint32_t * pnWidth, uint32_t * pnHeight)} */
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

    /** {@code void VRExtendedDisplay_GetDXGIOutputInfo(int32_t * pnAdapterIndex, int32_t * pnAdapterOutputIndex)} */
    public static void nVRExtendedDisplay_GetDXGIOutputInfo(long pnAdapterIndex, long pnAdapterOutputIndex) {
        long __functionAddress = OpenVR.VRExtendedDisplay.GetDXGIOutputInfo;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(pnAdapterIndex, pnAdapterOutputIndex, __functionAddress);
    }

    /** {@code void VRExtendedDisplay_GetDXGIOutputInfo(int32_t * pnAdapterIndex, int32_t * pnAdapterOutputIndex)} */
    public static void VRExtendedDisplay_GetDXGIOutputInfo(@NativeType("int32_t *") IntBuffer pnAdapterIndex, @NativeType("int32_t *") IntBuffer pnAdapterOutputIndex) {
        if (CHECKS) {
            check(pnAdapterIndex, 1);
            check(pnAdapterOutputIndex, 1);
        }
        nVRExtendedDisplay_GetDXGIOutputInfo(memAddress(pnAdapterIndex), memAddress(pnAdapterOutputIndex));
    }

}