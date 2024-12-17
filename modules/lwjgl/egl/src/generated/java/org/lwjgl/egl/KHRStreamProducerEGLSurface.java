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

public class KHRStreamProducerEGLSurface {

    public static final int EGL_STREAM_BIT_KHR = 0x800;

    protected KHRStreamProducerEGLSurface() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglCreateStreamProducerSurfaceKHR ] ---

    /** {@code EGLSurface eglCreateStreamProducerSurfaceKHR(EGLDisplay dpy, EGLConfig config, EGLStreamKHR stream, EGLint const * attrib_list)} */
    public static long neglCreateStreamProducerSurfaceKHR(long dpy, long config, long stream, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateStreamProducerSurfaceKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(config);
            check(stream);
        }
        return callPPPPP(dpy, config, stream, attrib_list, __functionAddress);
    }

    /** {@code EGLSurface eglCreateStreamProducerSurfaceKHR(EGLDisplay dpy, EGLConfig config, EGLStreamKHR stream, EGLint const * attrib_list)} */
    @NativeType("EGLSurface")
    public static long eglCreateStreamProducerSurfaceKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLConfig") long config, @NativeType("EGLStreamKHR") long stream, @NativeType("EGLint const *") @Nullable IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglCreateStreamProducerSurfaceKHR(dpy, config, stream, memAddressSafe(attrib_list));
    }

    /** {@code EGLSurface eglCreateStreamProducerSurfaceKHR(EGLDisplay dpy, EGLConfig config, EGLStreamKHR stream, EGLint const * attrib_list)} */
    @NativeType("EGLSurface")
    public static long eglCreateStreamProducerSurfaceKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLConfig") long config, @NativeType("EGLStreamKHR") long stream, @NativeType("EGLint const *") int @Nullable [] attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateStreamProducerSurfaceKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(config);
            check(stream);
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return callPPPPP(dpy, config, stream, attrib_list, __functionAddress);
    }

}