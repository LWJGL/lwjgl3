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

public class NOKSwapRegion2 {

    protected NOKSwapRegion2() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglSwapBuffersRegion2NOK ] ---

    /** {@code EGLBoolean eglSwapBuffersRegion2NOK(EGLDisplay dpy, EGLSurface surface, EGLint numRects, EGLint const * rects)} */
    public static int neglSwapBuffersRegion2NOK(long dpy, long surface, int numRects, long rects) {
        long __functionAddress = EGL.getCapabilities().eglSwapBuffersRegion2NOK;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
        }
        return callPPPI(dpy, surface, numRects, rects, __functionAddress);
    }

    /** {@code EGLBoolean eglSwapBuffersRegion2NOK(EGLDisplay dpy, EGLSurface surface, EGLint numRects, EGLint const * rects)} */
    @NativeType("EGLBoolean")
    public static boolean eglSwapBuffersRegion2NOK(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surface, @NativeType("EGLint const *") @Nullable IntBuffer rects) {
        return neglSwapBuffersRegion2NOK(dpy, surface, remainingSafe(rects), memAddressSafe(rects)) != 0;
    }

    /** {@code EGLBoolean eglSwapBuffersRegion2NOK(EGLDisplay dpy, EGLSurface surface, EGLint numRects, EGLint const * rects)} */
    @NativeType("EGLBoolean")
    public static boolean eglSwapBuffersRegion2NOK(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surface, @NativeType("EGLint const *") int @Nullable [] rects) {
        long __functionAddress = EGL.getCapabilities().eglSwapBuffersRegion2NOK;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
        }
        return callPPPI(dpy, surface, lengthSafe(rects), rects, __functionAddress) != 0;
    }

}