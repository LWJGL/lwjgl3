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
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class KHRReusableSync {

    public static final int
        EGL_SYNC_STATUS_KHR             = 0x30F1,
        EGL_SIGNALED_KHR                = 0x30F2,
        EGL_UNSIGNALED_KHR              = 0x30F3,
        EGL_TIMEOUT_EXPIRED_KHR         = 0x30F5,
        EGL_CONDITION_SATISFIED_KHR     = 0x30F6,
        EGL_SYNC_TYPE_KHR               = 0x30F7,
        EGL_SYNC_REUSABLE_KHR           = 0x30FA,
        EGL_SYNC_FLUSH_COMMANDS_BIT_KHR = 0x1;

    public static final long
        EGL_FOREVER_KHR = 0xFFFFFFFFFFFFFFFFL,
        EGL_NO_SYNC_KHR = 0x0L;

    protected KHRReusableSync() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglCreateSyncKHR ] ---

    /** {@code EGLSyncKHR eglCreateSyncKHR(EGLDisplay dpy, EGLenum type, EGLint const * attrib_list)} */
    public static long neglCreateSyncKHR(long dpy, int type, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateSyncKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPP(dpy, type, attrib_list, __functionAddress);
    }

    /** {@code EGLSyncKHR eglCreateSyncKHR(EGLDisplay dpy, EGLenum type, EGLint const * attrib_list)} */
    @NativeType("EGLSyncKHR")
    public static long eglCreateSyncKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLenum") int type, @NativeType("EGLint const *") @Nullable IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglCreateSyncKHR(dpy, type, memAddressSafe(attrib_list));
    }

    // --- [ eglDestroySyncKHR ] ---

    /** {@code EGLBoolean eglDestroySyncKHR(EGLDisplay dpy, EGLSyncKHR sync)} */
    @NativeType("EGLBoolean")
    public static boolean eglDestroySyncKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSyncKHR") long sync) {
        long __functionAddress = EGL.getCapabilities().eglDestroySyncKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(sync);
        }
        return callPPI(dpy, sync, __functionAddress) != 0;
    }

    // --- [ eglClientWaitSyncKHR ] ---

    /** {@code EGLint eglClientWaitSyncKHR(EGLDisplay dpy, EGLSyncKHR sync, EGLint flags, EGLTimeKHR timeout)} */
    @NativeType("EGLint")
    public static int eglClientWaitSyncKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSyncKHR") long sync, @NativeType("EGLint") int flags, @NativeType("EGLTimeKHR") long timeout) {
        long __functionAddress = EGL.getCapabilities().eglClientWaitSyncKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(sync);
        }
        return callPPJI(dpy, sync, flags, timeout, __functionAddress);
    }

    // --- [ eglSignalSyncKHR ] ---

    /** {@code EGLBoolean eglSignalSyncKHR(EGLDisplay dpy, EGLSyncKHR sync, EGLenum mode)} */
    @NativeType("EGLBoolean")
    public static boolean eglSignalSyncKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSyncKHR") long sync, @NativeType("EGLenum") int mode) {
        long __functionAddress = EGL.getCapabilities().eglSignalSyncKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(sync);
        }
        return callPPI(dpy, sync, mode, __functionAddress) != 0;
    }

    // --- [ eglGetSyncAttribKHR ] ---

    /** {@code EGLBoolean eglGetSyncAttribKHR(EGLDisplay dpy, EGLSyncKHR sync, EGLint attribute, EGLint * value)} */
    public static int neglGetSyncAttribKHR(long dpy, long sync, int attribute, long value) {
        long __functionAddress = EGL.getCapabilities().eglGetSyncAttribKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(sync);
        }
        return callPPPI(dpy, sync, attribute, value, __functionAddress);
    }

    /** {@code EGLBoolean eglGetSyncAttribKHR(EGLDisplay dpy, EGLSyncKHR sync, EGLint attribute, EGLint * value)} */
    @NativeType("EGLBoolean")
    public static boolean eglGetSyncAttribKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSyncKHR") long sync, @NativeType("EGLint") int attribute, @NativeType("EGLint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return neglGetSyncAttribKHR(dpy, sync, attribute, memAddress(value)) != 0;
    }

    /** {@code EGLSyncKHR eglCreateSyncKHR(EGLDisplay dpy, EGLenum type, EGLint const * attrib_list)} */
    @NativeType("EGLSyncKHR")
    public static long eglCreateSyncKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLenum") int type, @NativeType("EGLint const *") int @Nullable [] attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateSyncKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return callPPP(dpy, type, attrib_list, __functionAddress);
    }

    /** {@code EGLBoolean eglGetSyncAttribKHR(EGLDisplay dpy, EGLSyncKHR sync, EGLint attribute, EGLint * value)} */
    @NativeType("EGLBoolean")
    public static boolean eglGetSyncAttribKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSyncKHR") long sync, @NativeType("EGLint") int attribute, @NativeType("EGLint *") int[] value) {
        long __functionAddress = EGL.getCapabilities().eglGetSyncAttribKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(sync);
            check(value, 1);
        }
        return callPPPI(dpy, sync, attribute, value, __functionAddress) != 0;
    }

}