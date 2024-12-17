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

public class KHRImageBase {

    public static final int EGL_IMAGE_PRESERVED_KHR = 0x30D2;

    public static final long EGL_NO_IMAGE_KHR = 0x0L;

    protected KHRImageBase() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglCreateImageKHR ] ---

    /** {@code EGLImageKHR eglCreateImageKHR(EGLDisplay dpy, EGLContext ctx, EGLenum target, EGLClientBuffer buffer, EGLint const * attrib_list)} */
    public static long neglCreateImageKHR(long dpy, long ctx, int target, long buffer, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateImageKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(ctx);
            check(buffer);
        }
        return callPPPPP(dpy, ctx, target, buffer, attrib_list, __functionAddress);
    }

    /** {@code EGLImageKHR eglCreateImageKHR(EGLDisplay dpy, EGLContext ctx, EGLenum target, EGLClientBuffer buffer, EGLint const * attrib_list)} */
    @NativeType("EGLImageKHR")
    public static long eglCreateImageKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLContext") long ctx, @NativeType("EGLenum") int target, @NativeType("EGLClientBuffer") long buffer, @NativeType("EGLint const *") @Nullable IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglCreateImageKHR(dpy, ctx, target, buffer, memAddressSafe(attrib_list));
    }

    // --- [ eglDestroyImageKHR ] ---

    /** {@code EGLBoolean eglDestroyImageKHR(EGLDisplay dpy, EGLImageKHR image)} */
    @NativeType("EGLBoolean")
    public static boolean eglDestroyImageKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLImageKHR") long image) {
        long __functionAddress = EGL.getCapabilities().eglDestroyImageKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(image);
        }
        return callPPI(dpy, image, __functionAddress) != 0;
    }

    /** {@code EGLImageKHR eglCreateImageKHR(EGLDisplay dpy, EGLContext ctx, EGLenum target, EGLClientBuffer buffer, EGLint const * attrib_list)} */
    @NativeType("EGLImageKHR")
    public static long eglCreateImageKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLContext") long ctx, @NativeType("EGLenum") int target, @NativeType("EGLClientBuffer") long buffer, @NativeType("EGLint const *") int @Nullable [] attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateImageKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(ctx);
            check(buffer);
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return callPPPPP(dpy, ctx, target, buffer, attrib_list, __functionAddress);
    }

}