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

public class WGLARBCreateContext {

    public static final int
        WGL_CONTEXT_MAJOR_VERSION_ARB = 0x2091,
        WGL_CONTEXT_MINOR_VERSION_ARB = 0x2092,
        WGL_CONTEXT_LAYER_PLANE_ARB   = 0x2093,
        WGL_CONTEXT_FLAGS_ARB         = 0x2094;

    public static final int
        WGL_CONTEXT_DEBUG_BIT_ARB              = 0x1,
        WGL_CONTEXT_FORWARD_COMPATIBLE_BIT_ARB = 0x2;

    public static final int ERROR_INVALID_VERSION_ARB = 0x2095;

    protected WGLARBCreateContext() {
        throw new UnsupportedOperationException();
    }

    // --- [ wglCreateContextAttribsARB ] ---

    /** {@code HGLRC wglCreateContextAttribsARB(HDC hdc, HGLRC shareContext, int const * attribList)} */
    public static long nwglCreateContextAttribsARB(long hdc, long shareContext, long attribList) {
        long __functionAddress = GL.getCapabilitiesWGL().wglCreateContextAttribsARB;
        if (CHECKS) {
            check(__functionAddress);
            check(hdc);
        }
        return callPPPP(hdc, shareContext, attribList, __functionAddress);
    }

    /** {@code HGLRC wglCreateContextAttribsARB(HDC hdc, HGLRC shareContext, int const * attribList)} */
    @NativeType("HGLRC")
    public static long wglCreateContextAttribsARB(@NativeType("HDC") long hdc, @NativeType("HGLRC") long shareContext, @NativeType("int const *") @Nullable IntBuffer attribList) {
        if (CHECKS) {
            checkNTSafe(attribList);
        }
        return nwglCreateContextAttribsARB(hdc, shareContext, memAddressSafe(attribList));
    }

    /** {@code HGLRC wglCreateContextAttribsARB(HDC hdc, HGLRC shareContext, int const * attribList)} */
    @NativeType("HGLRC")
    public static long wglCreateContextAttribsARB(@NativeType("HDC") long hdc, @NativeType("HGLRC") long shareContext, @NativeType("int const *") int @Nullable [] attribList) {
        long __functionAddress = GL.getCapabilitiesWGL().wglCreateContextAttribsARB;
        if (CHECKS) {
            check(__functionAddress);
            check(hdc);
            checkNTSafe(attribList);
        }
        return callPPPP(hdc, shareContext, attribList, __functionAddress);
    }

}