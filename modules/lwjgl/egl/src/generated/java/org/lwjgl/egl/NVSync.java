/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class NVSync {

    public static final int
        EGL_SYNC_PRIOR_COMMANDS_COMPLETE_NV = 0x30E6,
        EGL_SYNC_STATUS_NV                  = 0x30E7,
        EGL_SIGNALED_NV                     = 0x30E8,
        EGL_UNSIGNALED_NV                   = 0x30E9,
        EGL_SYNC_FLUSH_COMMANDS_BIT_NV      = 0x1,
        EGL_ALREADY_SIGNALED_NV             = 0x30EA,
        EGL_TIMEOUT_EXPIRED_NV              = 0x30EB,
        EGL_CONDITION_SATISFIED_NV          = 0x30EC,
        EGL_SYNC_TYPE_NV                    = 0x30ED,
        EGL_SYNC_CONDITION_NV               = 0x30EE,
        EGL_SYNC_FENCE_NV                   = 0x30EF;

    public static final long
        EGL_FOREVER_NV = 0xFFFFFFFFFFFFFFFFL,
        EGL_NO_SYNC_NV = 0x0L;

    protected NVSync() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglCreateFenceSyncNV ] ---

    /** {@code EGLSyncNV eglCreateFenceSyncNV(EGLDisplay dpy, EGLenum condition, EGLint const * attrib_list)} */
    public static long neglCreateFenceSyncNV(long dpy, int condition, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateFenceSyncNV;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPP(dpy, condition, attrib_list, __functionAddress);
    }

    /** {@code EGLSyncNV eglCreateFenceSyncNV(EGLDisplay dpy, EGLenum condition, EGLint const * attrib_list)} */
    @NativeType("EGLSyncNV")
    public static long eglCreateFenceSyncNV(@NativeType("EGLDisplay") long dpy, @NativeType("EGLenum") int condition, @NativeType("EGLint const *") IntBuffer attrib_list) {
        if (CHECKS) {
            checkNT(attrib_list, EGL10.EGL_NONE);
        }
        return neglCreateFenceSyncNV(dpy, condition, memAddress(attrib_list));
    }

    // --- [ eglDestroySyncNV ] ---

    /** {@code EGLBoolean eglDestroySyncNV(EGLSyncNV sync)} */
    @NativeType("EGLBoolean")
    public static boolean eglDestroySyncNV(@NativeType("EGLSyncNV") long sync) {
        long __functionAddress = EGL.getCapabilities().eglDestroySyncNV;
        if (CHECKS) {
            check(__functionAddress);
            check(sync);
        }
        return callPI(sync, __functionAddress) != 0;
    }

    // --- [ eglFenceNV ] ---

    /** {@code EGLBoolean eglFenceNV(EGLSyncNV sync)} */
    @NativeType("EGLBoolean")
    public static boolean eglFenceNV(@NativeType("EGLSyncNV") long sync) {
        long __functionAddress = EGL.getCapabilities().eglFenceNV;
        if (CHECKS) {
            check(__functionAddress);
            check(sync);
        }
        return callPI(sync, __functionAddress) != 0;
    }

    // --- [ eglClientWaitSyncNV ] ---

    /** {@code EGLint eglClientWaitSyncNV(EGLSyncNV sync, EGLint flags, EGLTimeNV timeout)} */
    @NativeType("EGLint")
    public static int eglClientWaitSyncNV(@NativeType("EGLSyncNV") long sync, @NativeType("EGLint") int flags, @NativeType("EGLTimeNV") long timeout) {
        long __functionAddress = EGL.getCapabilities().eglClientWaitSyncNV;
        if (CHECKS) {
            check(__functionAddress);
            check(sync);
        }
        return callPJI(sync, flags, timeout, __functionAddress);
    }

    // --- [ eglSignalSyncNV ] ---

    /** {@code EGLBoolean eglSignalSyncNV(EGLSyncNV sync, EGLenum mode)} */
    @NativeType("EGLBoolean")
    public static boolean eglSignalSyncNV(@NativeType("EGLSyncNV") long sync, @NativeType("EGLenum") int mode) {
        long __functionAddress = EGL.getCapabilities().eglSignalSyncNV;
        if (CHECKS) {
            check(__functionAddress);
            check(sync);
        }
        return callPI(sync, mode, __functionAddress) != 0;
    }

    // --- [ eglGetSyncAttribNV ] ---

    /** {@code EGLBoolean eglGetSyncAttribNV(EGLSyncNV sync, EGLint attribute, EGLint * value)} */
    public static int neglGetSyncAttribNV(long sync, int attribute, long value) {
        long __functionAddress = EGL.getCapabilities().eglGetSyncAttribNV;
        if (CHECKS) {
            check(__functionAddress);
            check(sync);
        }
        return callPPI(sync, attribute, value, __functionAddress);
    }

    /** {@code EGLBoolean eglGetSyncAttribNV(EGLSyncNV sync, EGLint attribute, EGLint * value)} */
    @NativeType("EGLBoolean")
    public static boolean eglGetSyncAttribNV(@NativeType("EGLSyncNV") long sync, @NativeType("EGLint") int attribute, @NativeType("EGLint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return neglGetSyncAttribNV(sync, attribute, memAddress(value)) != 0;
    }

    /** {@code EGLSyncNV eglCreateFenceSyncNV(EGLDisplay dpy, EGLenum condition, EGLint const * attrib_list)} */
    @NativeType("EGLSyncNV")
    public static long eglCreateFenceSyncNV(@NativeType("EGLDisplay") long dpy, @NativeType("EGLenum") int condition, @NativeType("EGLint const *") int[] attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateFenceSyncNV;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            checkNT(attrib_list, EGL10.EGL_NONE);
        }
        return callPPP(dpy, condition, attrib_list, __functionAddress);
    }

    /** {@code EGLBoolean eglGetSyncAttribNV(EGLSyncNV sync, EGLint attribute, EGLint * value)} */
    @NativeType("EGLBoolean")
    public static boolean eglGetSyncAttribNV(@NativeType("EGLSyncNV") long sync, @NativeType("EGLint") int attribute, @NativeType("EGLint *") int[] value) {
        long __functionAddress = EGL.getCapabilities().eglGetSyncAttribNV;
        if (CHECKS) {
            check(__functionAddress);
            check(sync);
            check(value, 1);
        }
        return callPPI(sync, attribute, value, __functionAddress) != 0;
    }

}