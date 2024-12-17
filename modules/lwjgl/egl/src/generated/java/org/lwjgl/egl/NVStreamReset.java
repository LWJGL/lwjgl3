/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class NVStreamReset {

    public static final int
        EGL_SUPPORT_RESET_NV = 0x3334,
        EGL_SUPPORT_REUSE_NV = 0x3335;

    protected NVStreamReset() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglResetStreamNV ] ---

    /** {@code EGLBoolean eglResetStreamNV(EGLDisplay dpy, EGLStreamKHR stream)} */
    @NativeType("EGLBoolean")
    public static boolean eglResetStreamNV(@NativeType("EGLDisplay") long dpy, @NativeType("EGLStreamKHR") long stream) {
        long __functionAddress = EGL.getCapabilities().eglResetStreamNV;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(stream);
        }
        return callPPI(dpy, stream, __functionAddress) != 0;
    }

}