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

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/NV/EGL_NV_sync.txt">NV_sync</a> extension.
 * 
 * <p>This extension introduces the concept of "sync objects" into EGL. Sync objects are a synchronization primitive, representing events whose completion
 * can be tested or waited upon. This extension borrows heavily from the GL_ARB_sync extension, and like that extension, introduces only a single type of
 * sync object, the "fence sync object." Additional types of sync objects may be introduced in later extensions.</p>
 * 
 * <p>Fence sync objects have corresponding fences, which are inserted into client API command streams. A sync object can be queried for a given condition,
 * such as completion of the corresponding fence. Fence completion allows applications to request a partial Finish of an API command stream, wherein all
 * commands issued in a particular client API context will be forced to complete before control is returned to the calling thread.</p>
 * 
 * <p>Requires {@link EGL11 EGL 1.1}.</p>
 */
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

    public static long neglCreateFenceSyncNV(long dpy, int condition, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateFenceSyncNV;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPP(dpy, condition, attrib_list, __functionAddress);
    }

    @NativeType("EGLSyncNV")
    public static long eglCreateFenceSyncNV(@NativeType("EGLDisplay") long dpy, @NativeType("EGLenum") int condition, @NativeType("EGLint const *") IntBuffer attrib_list) {
        if (CHECKS) {
            checkNT(attrib_list, EGL10.EGL_NONE);
        }
        return neglCreateFenceSyncNV(dpy, condition, memAddress(attrib_list));
    }

    // --- [ eglDestroySyncNV ] ---

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

    public static int neglGetSyncAttribNV(long sync, int attribute, long value) {
        long __functionAddress = EGL.getCapabilities().eglGetSyncAttribNV;
        if (CHECKS) {
            check(__functionAddress);
            check(sync);
        }
        return callPPI(sync, attribute, value, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglGetSyncAttribNV(@NativeType("EGLSyncNV") long sync, @NativeType("EGLint") int attribute, @NativeType("EGLint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return neglGetSyncAttribNV(sync, attribute, memAddress(value)) != 0;
    }

    /** Array version of: {@link #eglCreateFenceSyncNV CreateFenceSyncNV} */
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

    /** Array version of: {@link #eglGetSyncAttribNV GetSyncAttribNV} */
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