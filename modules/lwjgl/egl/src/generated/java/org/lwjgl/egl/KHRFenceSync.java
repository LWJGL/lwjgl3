/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

public class KHRFenceSync {

    public static final int
        EGL_SYNC_PRIOR_COMMANDS_COMPLETE_KHR = 0x30F0,
        EGL_SYNC_CONDITION_KHR               = 0x30F8,
        EGL_SYNC_FENCE_KHR                   = 0x30F9;

    protected KHRFenceSync() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglCreateSyncKHR ] ---

    /** {@code EGLSyncKHR eglCreateSyncKHR(EGLDisplay dpy, EGLenum type, EGLint const * attrib_list)} */
    public static long neglCreateSyncKHR(long dpy, int type, long attrib_list) {
        return KHRReusableSync.neglCreateSyncKHR(dpy, type, attrib_list);
    }

    /** {@code EGLSyncKHR eglCreateSyncKHR(EGLDisplay dpy, EGLenum type, EGLint const * attrib_list)} */
    @NativeType("EGLSyncKHR")
    public static long eglCreateSyncKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLenum") int type, @NativeType("EGLint const *") @Nullable IntBuffer attrib_list) {
        return KHRReusableSync.eglCreateSyncKHR(dpy, type, attrib_list);
    }

    // --- [ eglDestroySyncKHR ] ---

    /** {@code EGLBoolean eglDestroySyncKHR(EGLDisplay dpy, EGLSyncKHR sync)} */
    @NativeType("EGLBoolean")
    public static boolean eglDestroySyncKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSyncKHR") long sync) {
        return KHRReusableSync.eglDestroySyncKHR(dpy, sync);
    }

    // --- [ eglClientWaitSyncKHR ] ---

    /** {@code EGLint eglClientWaitSyncKHR(EGLDisplay dpy, EGLSyncKHR sync, EGLint flags, EGLTimeKHR timeout)} */
    @NativeType("EGLint")
    public static int eglClientWaitSyncKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSyncKHR") long sync, @NativeType("EGLint") int flags, @NativeType("EGLTimeKHR") long timeout) {
        return KHRReusableSync.eglClientWaitSyncKHR(dpy, sync, flags, timeout);
    }

    // --- [ eglGetSyncAttribKHR ] ---

    /** {@code EGLBoolean eglGetSyncAttribKHR(EGLDisplay dpy, EGLSyncKHR sync, EGLint attribute, EGLint * value)} */
    public static int neglGetSyncAttribKHR(long dpy, long sync, int attribute, long value) {
        return KHRReusableSync.neglGetSyncAttribKHR(dpy, sync, attribute, value);
    }

    /** {@code EGLBoolean eglGetSyncAttribKHR(EGLDisplay dpy, EGLSyncKHR sync, EGLint attribute, EGLint * value)} */
    @NativeType("EGLBoolean")
    public static boolean eglGetSyncAttribKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSyncKHR") long sync, @NativeType("EGLint") int attribute, @NativeType("EGLint *") IntBuffer value) {
        return KHRReusableSync.eglGetSyncAttribKHR(dpy, sync, attribute, value);
    }

    /** {@code EGLSyncKHR eglCreateSyncKHR(EGLDisplay dpy, EGLenum type, EGLint const * attrib_list)} */
    @NativeType("EGLSyncKHR")
    public static long eglCreateSyncKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLenum") int type, @NativeType("EGLint const *") int @Nullable [] attrib_list) {
        return KHRReusableSync.eglCreateSyncKHR(dpy, type, attrib_list);
    }

    /** {@code EGLBoolean eglGetSyncAttribKHR(EGLDisplay dpy, EGLSyncKHR sync, EGLint attribute, EGLint * value)} */
    @NativeType("EGLBoolean")
    public static boolean eglGetSyncAttribKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSyncKHR") long sync, @NativeType("EGLint") int attribute, @NativeType("EGLint *") int[] value) {
        return KHRReusableSync.eglGetSyncAttribKHR(dpy, sync, attribute, value);
    }

}