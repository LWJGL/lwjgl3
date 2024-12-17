/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class NVPostSubBuffer {

    public static final int EGL_POST_SUB_BUFFER_SUPPORTED_NV = 0x30BE;

    protected NVPostSubBuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglPostSubBufferNV ] ---

    /** {@code EGLBoolean eglPostSubBufferNV(EGLDisplay dpy, EGLSurface surface, EGLint x, EGLint y, EGLint width, EGLint height)} */
    @NativeType("EGLBoolean")
    public static boolean eglPostSubBufferNV(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surface, @NativeType("EGLint") int x, @NativeType("EGLint") int y, @NativeType("EGLint") int width, @NativeType("EGLint") int height) {
        long __functionAddress = EGL.getCapabilities().eglPostSubBufferNV;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
        }
        return callPPI(dpy, surface, x, y, width, height, __functionAddress) != 0;
    }

}