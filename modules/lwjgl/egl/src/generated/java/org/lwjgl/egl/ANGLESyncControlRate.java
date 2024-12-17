/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class ANGLESyncControlRate {

    protected ANGLESyncControlRate() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglGetMscRateANGLE ] ---

    /** {@code EGLBoolean eglGetMscRateANGLE(EGLDisplay dpy, EGLSurface surface, int32_t * numerator, int32_t * denominator)} */
    public static int neglGetMscRateANGLE(long dpy, long surface, long numerator, long denominator) {
        long __functionAddress = EGL.getCapabilities().eglGetMscRateANGLE;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
        }
        return callPPPPI(dpy, surface, numerator, denominator, __functionAddress);
    }

    /** {@code EGLBoolean eglGetMscRateANGLE(EGLDisplay dpy, EGLSurface surface, int32_t * numerator, int32_t * denominator)} */
    @NativeType("EGLBoolean")
    public static boolean eglGetMscRateANGLE(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surface, @NativeType("int32_t *") IntBuffer numerator, @NativeType("int32_t *") IntBuffer denominator) {
        if (CHECKS) {
            check(numerator, 1);
            check(denominator, 1);
        }
        return neglGetMscRateANGLE(dpy, surface, memAddress(numerator), memAddress(denominator)) != 0;
    }

    /** {@code EGLBoolean eglGetMscRateANGLE(EGLDisplay dpy, EGLSurface surface, int32_t * numerator, int32_t * denominator)} */
    @NativeType("EGLBoolean")
    public static boolean eglGetMscRateANGLE(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surface, @NativeType("int32_t *") int[] numerator, @NativeType("int32_t *") int[] denominator) {
        long __functionAddress = EGL.getCapabilities().eglGetMscRateANGLE;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
            check(numerator, 1);
            check(denominator, 1);
        }
        return callPPPPI(dpy, surface, numerator, denominator, __functionAddress) != 0;
    }

}