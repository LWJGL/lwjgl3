/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class ANDROIDNativeFenceSync {

    public static final int
        EGL_SYNC_NATIVE_FENCE_ANDROID          = 0x3144,
        EGL_SYNC_NATIVE_FENCE_FD_ANDROID       = 0x3145,
        EGL_SYNC_NATIVE_FENCE_SIGNALED_ANDROID = 0x3146,
        EGL_NO_NATIVE_FENCE_FD_ANDROID         = -1;

    protected ANDROIDNativeFenceSync() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglDupNativeFenceFDANDROID ] ---

    /** {@code EGLint eglDupNativeFenceFDANDROID(EGLDisplay dpy, EGLSyncKHR sync)} */
    @NativeType("EGLint")
    public static int eglDupNativeFenceFDANDROID(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSyncKHR") long sync) {
        long __functionAddress = EGL.getCapabilities().eglDupNativeFenceFDANDROID;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(sync);
        }
        return callPPI(dpy, sync, __functionAddress);
    }

}