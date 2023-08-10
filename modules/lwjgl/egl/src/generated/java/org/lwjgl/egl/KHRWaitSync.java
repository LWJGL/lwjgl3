/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/KHR/EGL_KHR_wait_sync.txt">KHR_wait_sync</a> extension.
 * 
 * <p>This extension adds the ability to wait for signaling of sync objects in the server for a client API context, rather than in the application thread
 * bound to that context. This form of wait does not necessarily block the application thread which issued the wait (unlike eglClientWaitSyncKHR), so the
 * application may continue to issue commands to the client API context or perform other work in parallel, leading to increased performance. The best
 * performance is likely to be achieved by implementations which can perform this new wait operation in GPU hardware, although this is not required.</p>
 * 
 * <p>Requires {@link EGL11 EGL 1.1} and {@link KHRFenceSync KHR_fence_sync}.</p>
 */
public class KHRWaitSync {

    protected KHRWaitSync() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglWaitSyncKHR ] ---

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