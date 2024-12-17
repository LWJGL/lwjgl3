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

public class KHRPartialUpdate {

    public static final int EGL_BUFFER_AGE_KHR = 0x313D;

    protected KHRPartialUpdate() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglSetDamageRegionKHR ] ---

    /** {@code EGLBoolean eglSetDamageRegionKHR(EGLDisplay dpy, EGLSurface surface, EGLint * rects, EGLint n_rects)} */
    public static int neglSetDamageRegionKHR(long dpy, long surface, long rects, int n_rects) {
        long __functionAddress = EGL.getCapabilities().eglSetDamageRegionKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
        }
        return callPPPI(dpy, surface, rects, n_rects, __functionAddress);
    }

    /** {@code EGLBoolean eglSetDamageRegionKHR(EGLDisplay dpy, EGLSurface surface, EGLint * rects, EGLint n_rects)} */
    @NativeType("EGLBoolean")
    public static boolean eglSetDamageRegionKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surface, @NativeType("EGLint *") @Nullable IntBuffer rects) {
        return neglSetDamageRegionKHR(dpy, surface, memAddressSafe(rects), remainingSafe(rects)) != 0;
    }

    /** {@code EGLBoolean eglSetDamageRegionKHR(EGLDisplay dpy, EGLSurface surface, EGLint * rects, EGLint n_rects)} */
    @NativeType("EGLBoolean")
    public static boolean eglSetDamageRegionKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surface, @NativeType("EGLint *") int @Nullable [] rects) {
        long __functionAddress = EGL.getCapabilities().eglSetDamageRegionKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
        }
        return callPPPI(dpy, surface, rects, lengthSafe(rects), __functionAddress) != 0;
    }

}