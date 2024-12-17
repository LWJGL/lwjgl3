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

public class KHRDisplayReference {

    public static final int EGL_TRACK_REFERENCES_KHR = 0x3352;

    protected KHRDisplayReference() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglQueryDisplayAttribKHR ] ---

    /** {@code EGLBoolean eglQueryDisplayAttribKHR(EGLDisplay dpy, EGLint name, EGLAttrib * value)} */
    public static int neglQueryDisplayAttribKHR(long dpy, int name, long value) {
        long __functionAddress = EGL.getCapabilities().eglQueryDisplayAttribKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPI(dpy, name, value, __functionAddress);
    }

    /** {@code EGLBoolean eglQueryDisplayAttribKHR(EGLDisplay dpy, EGLint name, EGLAttrib * value)} */
    @NativeType("EGLBoolean")
    public static boolean eglQueryDisplayAttribKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLint") int name, @NativeType("EGLAttrib *") PointerBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return neglQueryDisplayAttribKHR(dpy, name, memAddress(value)) != 0;
    }

}