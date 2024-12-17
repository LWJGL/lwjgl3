/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class EXTDisplayAlloc {

    public static final int EGL_ALLOC_NEW_DISPLAY_EXT = 0x3379;

    protected EXTDisplayAlloc() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglDestroyDisplayEXT ] ---

    /** {@code EGLBoolean eglDestroyDisplayEXT(EGLDisplay dpy)} */
    @NativeType("EGLBoolean")
    public static boolean eglDestroyDisplayEXT(@NativeType("EGLDisplay") long dpy) {
        long __functionAddress = EGL.getCapabilities().eglDestroyDisplayEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPI(dpy, __functionAddress) != 0;
    }

}