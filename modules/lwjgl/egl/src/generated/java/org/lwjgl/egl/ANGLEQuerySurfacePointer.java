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

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/ANGLE/EGL_ANGLE_query_surface_pointer.txt">ANGLE_query_surface_pointer</a> extension.
 * 
 * <p>This extension allows querying pointer-sized surface attributes, thus avoiding problems with coercing 64-bit pointers into a 32-bit integer.</p>
 */
public class ANGLEQuerySurfacePointer {

    protected ANGLEQuerySurfacePointer() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglQuerySurfacePointerANGLE ] ---

    public static int neglQuerySurfacePointerANGLE(long dpy, long surface, int attribute, long value) {
        long __functionAddress = EGL.getCapabilities().eglQuerySurfacePointerANGLE;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
        }
        return callPPPI(dpy, surface, attribute, value, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglQuerySurfacePointerANGLE(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surface, @NativeType("EGLint") int attribute, @NativeType("void **") PointerBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return neglQuerySurfacePointerANGLE(dpy, surface, attribute, memAddress(value)) != 0;
    }

}