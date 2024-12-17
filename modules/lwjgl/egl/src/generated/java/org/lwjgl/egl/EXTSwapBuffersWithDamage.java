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

public class EXTSwapBuffersWithDamage {

    protected EXTSwapBuffersWithDamage() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglSwapBuffersWithDamageEXT ] ---

    /** {@code EGLBoolean eglSwapBuffersWithDamageEXT(EGLDisplay dpy, EGLSurface surface, EGLint * rects, EGLint n_rects)} */
    public static int neglSwapBuffersWithDamageEXT(long dpy, long surface, long rects, int n_rects) {
        long __functionAddress = EGL.getCapabilities().eglSwapBuffersWithDamageEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
        }
        return callPPPI(dpy, surface, rects, n_rects, __functionAddress);
    }

    /** {@code EGLBoolean eglSwapBuffersWithDamageEXT(EGLDisplay dpy, EGLSurface surface, EGLint * rects, EGLint n_rects)} */
    @NativeType("EGLBoolean")
    public static boolean eglSwapBuffersWithDamageEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surface, @NativeType("EGLint *") @Nullable IntBuffer rects) {
        return neglSwapBuffersWithDamageEXT(dpy, surface, memAddressSafe(rects), remainingSafe(rects)) != 0;
    }

    /** {@code EGLBoolean eglSwapBuffersWithDamageEXT(EGLDisplay dpy, EGLSurface surface, EGLint * rects, EGLint n_rects)} */
    @NativeType("EGLBoolean")
    public static boolean eglSwapBuffersWithDamageEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surface, @NativeType("EGLint *") int @Nullable [] rects) {
        long __functionAddress = EGL.getCapabilities().eglSwapBuffersWithDamageEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
        }
        return callPPPI(dpy, surface, rects, lengthSafe(rects), __functionAddress) != 0;
    }

}