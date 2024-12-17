/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class KHRWaitSync {

    protected KHRWaitSync() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglWaitSyncKHR ] ---

    /** {@code EGLint eglWaitSyncKHR(EGLDisplay dpy, EGLSyncKHR sync, EGLint flags)} */
    @NativeType("EGLint")
    public static int eglWaitSyncKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSyncKHR") long sync, @NativeType("EGLint") int flags) {
        long __functionAddress = EGL.getCapabilities().eglWaitSyncKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(sync);
        }
        return callPPI(dpy, sync, flags, __functionAddress);
    }

}