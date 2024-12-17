/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class WGLARBMakeCurrentRead {

    public static final int
        ERROR_INVALID_PIXEL_TYPE_ARB           = 0x2043,
        ERROR_INCOMPATIBLE_DEVICE_CONTEXTS_ARB = 0x2054;

    protected WGLARBMakeCurrentRead() {
        throw new UnsupportedOperationException();
    }

    // --- [ wglMakeContextCurrentARB ] ---

    /** {@code BOOL wglMakeContextCurrentARB(HDC drawDC, HDC readDC, HGLRC hglrc)} */
    @NativeType("BOOL")
    public static boolean wglMakeContextCurrentARB(@NativeType("HDC") long drawDC, @NativeType("HDC") long readDC, @NativeType("HGLRC") long hglrc) {
        long __functionAddress = GL.getCapabilitiesWGL().wglMakeContextCurrentARB;
        if (CHECKS) {
            check(__functionAddress);
            check(drawDC);
            check(readDC);
            check(hglrc);
        }
        return callPPPI(drawDC, readDC, hglrc, __functionAddress) != 0;
    }

    // --- [ wglGetCurrentReadDCARB ] ---

    /** {@code HDC wglGetCurrentReadDCARB(void)} */
    @NativeType("HDC")
    public static long wglGetCurrentReadDCARB() {
        long __functionAddress = GL.getCapabilitiesWGL().wglGetCurrentReadDCARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(__functionAddress);
    }

}