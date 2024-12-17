/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class ANDROIDCreateNativeClientBuffer {

    public static final int EGL_NATIVE_BUFFER_USAGE_ANDROID = 0x3143;

    public static final int
        EGL_NATIVE_BUFFER_USAGE_PROTECTED_BIT_ANDROID    = 0x1,
        EGL_NATIVE_BUFFER_USAGE_RENDERBUFFER_BIT_ANDROID = 0x2,
        EGL_NATIVE_BUFFER_USAGE_TEXTURE_BIT_ANDROID      = 0x4;

    protected ANDROIDCreateNativeClientBuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglCreateNativeClientBufferANDROID ] ---

    /** {@code EGLClientBuffer eglCreateNativeClientBufferANDROID(EGLint const * attrib_list)} */
    public static long neglCreateNativeClientBufferANDROID(long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateNativeClientBufferANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPP(attrib_list, __functionAddress);
    }

    /** {@code EGLClientBuffer eglCreateNativeClientBufferANDROID(EGLint const * attrib_list)} */
    @NativeType("EGLClientBuffer")
    public static long eglCreateNativeClientBufferANDROID(@NativeType("EGLint const *") @Nullable IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglCreateNativeClientBufferANDROID(memAddressSafe(attrib_list));
    }

    /** {@code EGLClientBuffer eglCreateNativeClientBufferANDROID(EGLint const * attrib_list)} */
    @NativeType("EGLClientBuffer")
    public static long eglCreateNativeClientBufferANDROID(@NativeType("EGLint const *") int @Nullable [] attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateNativeClientBufferANDROID;
        if (CHECKS) {
            check(__functionAddress);
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return callPP(attrib_list, __functionAddress);
    }

}