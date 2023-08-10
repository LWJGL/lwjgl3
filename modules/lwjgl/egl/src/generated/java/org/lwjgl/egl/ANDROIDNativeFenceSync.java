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
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/ANDROID/EGL_ANDROID_native_fence_sync.txt">ANDROID_native_fence_sync</a> extension.
 * 
 * <p>This extension enables the creation of EGL fence sync objects that are associated with a native synchronization fence object that is referenced using a
 * file descriptor. These EGL fence sync objects have nearly identical semantics to those defined by the KHR_fence_sync extension, except that they have
 * an additional attribute storing the file descriptor referring to the native fence object.</p>
 * 
 * <p>This extension assumes the existence of a native fence synchronization object that behaves similarly to an EGL fence sync object. These native objects
 * must have a signal status like that of an EGLSyncKHR object that indicates whether the fence has ever been signaled. Once signaled the native object's
 * signal status may not change again.</p>
 * 
 * <p>Requires {@link EGL11 EGL 1.1} and {@link KHRFenceSync KHR_fence_sync}.</p>
 */
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