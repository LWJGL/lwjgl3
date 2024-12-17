/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class WGLARBPbuffer {

    public static final int WGL_DRAW_TO_PBUFFER_ARB = 0x202D;

    public static final int
        WGL_MAX_PBUFFER_PIXELS_ARB = 0x202E,
        WGL_MAX_PBUFFER_WIDTH_ARB  = 0x202F,
        WGL_MAX_PBUFFER_HEIGHT_ARB = 0x2030;

    public static final int WGL_PBUFFER_LARGEST_ARB = 0x2033;

    public static final int
        WGL_PBUFFER_WIDTH_ARB  = 0x2034,
        WGL_PBUFFER_HEIGHT_ARB = 0x2035,
        WGL_PBUFFER_LOST_ARB   = 0x2036;

    protected WGLARBPbuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ wglCreatePbufferARB ] ---

    /** {@code HPBUFFERARB wglCreatePbufferARB(HDC hdc, int pixelFormat, int width, int height, int const * attribList)} */
    public static long nwglCreatePbufferARB(long hdc, int pixelFormat, int width, int height, long attribList) {
        long __functionAddress = GL.getCapabilitiesWGL().wglCreatePbufferARB;
        if (CHECKS) {
            check(__functionAddress);
            check(hdc);
        }
        return callPPP(hdc, pixelFormat, width, height, attribList, __functionAddress);
    }

    /** {@code HPBUFFERARB wglCreatePbufferARB(HDC hdc, int pixelFormat, int width, int height, int const * attribList)} */
    @NativeType("HPBUFFERARB")
    public static long wglCreatePbufferARB(@NativeType("HDC") long hdc, int pixelFormat, int width, int height, @NativeType("int const *") @Nullable IntBuffer attribList) {
        if (CHECKS) {
            checkNTSafe(attribList);
        }
        return nwglCreatePbufferARB(hdc, pixelFormat, width, height, memAddressSafe(attribList));
    }

    // --- [ wglGetPbufferDCARB ] ---

    /** {@code HDC wglGetPbufferDCARB(HPBUFFERARB pbuffer)} */
    @NativeType("HDC")
    public static long wglGetPbufferDCARB(@NativeType("HPBUFFERARB") long pbuffer) {
        long __functionAddress = GL.getCapabilitiesWGL().wglGetPbufferDCARB;
        if (CHECKS) {
            check(__functionAddress);
            check(pbuffer);
        }
        return callPP(pbuffer, __functionAddress);
    }

    // --- [ wglReleasePbufferDCARB ] ---

    /** {@code int wglReleasePbufferDCARB(HPBUFFERARB pbuffer, HDC hdc)} */
    public static int wglReleasePbufferDCARB(@NativeType("HPBUFFERARB") long pbuffer, @NativeType("HDC") long hdc) {
        long __functionAddress = GL.getCapabilitiesWGL().wglReleasePbufferDCARB;
        if (CHECKS) {
            check(__functionAddress);
            check(pbuffer);
            check(hdc);
        }
        return callPPI(pbuffer, hdc, __functionAddress);
    }

    // --- [ wglDestroyPbufferARB ] ---

    /** {@code BOOL wglDestroyPbufferARB(HPBUFFERARB pbuffer)} */
    @NativeType("BOOL")
    public static boolean wglDestroyPbufferARB(@NativeType("HPBUFFERARB") long pbuffer) {
        long __functionAddress = GL.getCapabilitiesWGL().wglDestroyPbufferARB;
        if (CHECKS) {
            check(__functionAddress);
            check(pbuffer);
        }
        return callPI(pbuffer, __functionAddress) != 0;
    }

    // --- [ wglQueryPbufferARB ] ---

    /** {@code BOOL wglQueryPbufferARB(HPBUFFERARB pbuffer, int attribute, int * value)} */
    public static int nwglQueryPbufferARB(long pbuffer, int attribute, long value) {
        long __functionAddress = GL.getCapabilitiesWGL().wglQueryPbufferARB;
        if (CHECKS) {
            check(__functionAddress);
            check(pbuffer);
        }
        return callPPI(pbuffer, attribute, value, __functionAddress);
    }

    /** {@code BOOL wglQueryPbufferARB(HPBUFFERARB pbuffer, int attribute, int * value)} */
    @NativeType("BOOL")
    public static boolean wglQueryPbufferARB(@NativeType("HPBUFFERARB") long pbuffer, int attribute, @NativeType("int *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nwglQueryPbufferARB(pbuffer, attribute, memAddress(value)) != 0;
    }

    /** {@code HPBUFFERARB wglCreatePbufferARB(HDC hdc, int pixelFormat, int width, int height, int const * attribList)} */
    @NativeType("HPBUFFERARB")
    public static long wglCreatePbufferARB(@NativeType("HDC") long hdc, int pixelFormat, int width, int height, @NativeType("int const *") int @Nullable [] attribList) {
        long __functionAddress = GL.getCapabilitiesWGL().wglCreatePbufferARB;
        if (CHECKS) {
            check(__functionAddress);
            check(hdc);
            checkNTSafe(attribList);
        }
        return callPPP(hdc, pixelFormat, width, height, attribList, __functionAddress);
    }

    /** {@code BOOL wglQueryPbufferARB(HPBUFFERARB pbuffer, int attribute, int * value)} */
    @NativeType("BOOL")
    public static boolean wglQueryPbufferARB(@NativeType("HPBUFFERARB") long pbuffer, int attribute, @NativeType("int *") int[] value) {
        long __functionAddress = GL.getCapabilitiesWGL().wglQueryPbufferARB;
        if (CHECKS) {
            check(__functionAddress);
            check(pbuffer);
            check(value, 1);
        }
        return callPPI(pbuffer, attribute, value, __functionAddress) != 0;
    }

}