/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class NVStreamFlush {

    protected NVStreamFlush() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglStreamFlushNV ] ---

    /** {@code EGLBoolean eglStreamFlushNV(EGLDisplay dpy, EGLStreamKHR stream)} */
    @NativeType("EGLBoolean")
    public static boolean eglStreamFlushNV(@NativeType("EGLDisplay") long dpy, @NativeType("EGLStreamKHR") long stream) {
        long __functionAddress = EGL.getCapabilities().eglStreamFlushNV;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(stream);
        }
        return callPPI(dpy, stream, __functionAddress) != 0;
    }

}