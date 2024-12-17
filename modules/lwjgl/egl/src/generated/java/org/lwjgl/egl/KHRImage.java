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

public class KHRImage {

    public static final int EGL_NATIVE_PIXMAP_KHR = 0x30B0;

    public static final long EGL_NO_IMAGE_KHR = 0x0L;

    protected KHRImage() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglCreateImageKHR ] ---

    /** {@code EGLImageKHR eglCreateImageKHR(EGLDisplay dpy, EGLContext ctx, EGLenum target, EGLClientBuffer buffer, EGLint const * attrib_list)} */
    public static long neglCreateImageKHR(long dpy, long ctx, int target, long buffer, long attrib_list) {
        return KHRImageBase.neglCreateImageKHR(dpy, ctx, target, buffer, attrib_list);
    }

    /** {@code EGLImageKHR eglCreateImageKHR(EGLDisplay dpy, EGLContext ctx, EGLenum target, EGLClientBuffer buffer, EGLint const * attrib_list)} */
    @NativeType("EGLImageKHR")
    public static long eglCreateImageKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLContext") long ctx, @NativeType("EGLenum") int target, @NativeType("EGLClientBuffer") long buffer, @NativeType("EGLint const *") @Nullable IntBuffer attrib_list) {
        return KHRImageBase.eglCreateImageKHR(dpy, ctx, target, buffer, attrib_list);
    }

    // --- [ eglDestroyImageKHR ] ---

    /** {@code EGLBoolean eglDestroyImageKHR(EGLDisplay dpy, EGLImageKHR image)} */
    @NativeType("EGLBoolean")
    public static boolean eglDestroyImageKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLImageKHR") long image) {
        return KHRImageBase.eglDestroyImageKHR(dpy, image);
    }

    /** {@code EGLImageKHR eglCreateImageKHR(EGLDisplay dpy, EGLContext ctx, EGLenum target, EGLClientBuffer buffer, EGLint const * attrib_list)} */
    @NativeType("EGLImageKHR")
    public static long eglCreateImageKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLContext") long ctx, @NativeType("EGLenum") int target, @NativeType("EGLClientBuffer") long buffer, @NativeType("EGLint const *") int @Nullable [] attrib_list) {
        return KHRImageBase.eglCreateImageKHR(dpy, ctx, target, buffer, attrib_list);
    }

}