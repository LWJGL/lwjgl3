/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class ANGLEQuerySurfacePointer {

    protected ANGLEQuerySurfacePointer() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglQuerySurfacePointerANGLE ] ---

    /** {@code EGLBoolean eglQuerySurfacePointerANGLE(EGLDisplay dpy, EGLSurface surface, EGLint attribute, void ** value)} */
    public static int neglQuerySurfacePointerANGLE(long dpy, long surface, int attribute, long value) {
        long __functionAddress = EGL.getCapabilities().eglQuerySurfacePointerANGLE;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
        }
        return callPPPI(dpy, surface, attribute, value, __functionAddress);
    }

    /** {@code EGLBoolean eglQuerySurfacePointerANGLE(EGLDisplay dpy, EGLSurface surface, EGLint attribute, void ** value)} */
    @NativeType("EGLBoolean")
    public static boolean eglQuerySurfacePointerANGLE(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surface, @NativeType("EGLint") int attribute, @NativeType("void **") PointerBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return neglQuerySurfacePointerANGLE(dpy, surface, attribute, memAddress(value)) != 0;
    }

}