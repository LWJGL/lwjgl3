/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/KHR/EGL_KHR_reusable_sync.txt">KHR_reusable_sync</a> extension.
 * 
 * <p>This extension introduces the concept of "sync objects" into EGL. Sync objects are a synchronization primitive, representing events whose completion
 * can be tested or waited upon. This extension borrows from the GL_ARB_sync extension but introduces a type of sync object known as "reusable sync
 * object" comparable to an OS semaphore. The specification is designed to allow additional types of sync objects to be easily introduced in later
 * extensions.</p>
 * 
 * <p>Reusable sync objects may be used to synchronize activity between threads or between client APIs. Synchronization is accomplished by explicitly
 * changing the status of a reusable object using EGL API commands.</p>
 * 
 * <p>Requires {@link EGL11 EGL 1.1}.</p>
 */
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

    public static long neglCreateSyncKHR(long dpy, int type, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateSyncKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPP(dpy, type, attrib_list, __functionAddress);
    }

    @NativeType("EGLSyncKHR")
    public static long eglCreateSyncKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLenum") int type, @Nullable @NativeType("EGLint const *") IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglCreateSyncKHR(dpy, type, memAddressSafe(attrib_list));
    }

    // --- [ eglDestroySyncKHR ] ---

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

    public static int neglGetSyncAttribKHR(long dpy, long sync, int attribute, long value) {
        long __functionAddress = EGL.getCapabilities().eglGetSyncAttribKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(sync);
        }
        return callPPPI(dpy, sync, attribute, value, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglGetSyncAttribKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSyncKHR") long sync, @NativeType("EGLint") int attribute, @NativeType("EGLint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return neglGetSyncAttribKHR(dpy, sync, attribute, memAddress(value)) != 0;
    }

    /** Array version of: {@link #eglCreateSyncKHR CreateSyncKHR} */
    @NativeType("EGLSyncKHR")
    public static long eglCreateSyncKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLenum") int type, @Nullable @NativeType("EGLint const *") int[] attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateSyncKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return callPPP(dpy, type, attrib_list, __functionAddress);
    }

    /** Array version of: {@link #eglGetSyncAttribKHR GetSyncAttribKHR} */
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