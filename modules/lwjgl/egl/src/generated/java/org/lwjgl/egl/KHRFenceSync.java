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
 * Native bindings to the <a target="_blank" href="https://www.khronos.org/registry/EGL/extensions/KHR/EGL_KHR_fence_sync.txt">KHR_fence_sync</a> extension.
 * 
 * <p>This extension introduces the concept of "sync objects" into EGL. Sync objects are a synchronization primitive, representing events whose completion
 * can be tested or waited upon. This extension borrows heavily from the GL_ARB_sync extension and introduces a type of sync object known as a "fence sync
 * object" comparable to the OpenGL fence sync object. The specification is designed to allow additional types of sync objects to be easily introduced in
 * later extensions.</p>
 * 
 * <p>Fence sync objects have corresponding fence commands, which are inserted into a client API command stream at the time the fence sync is created. A
 * fence sync object is used to wait for completion of the corresponding fence command. This allows applications to request a partial Finish of an API
 * command stream, wherein all commands issued in a particular client API context will be forced to complete before control is returned to the calling
 * thread.</p>
 * 
 * <p>This document describes three different extension strings collectively. The "EGL_KHR_fence_sync" string indicates that fence syncs and the
 * corresponding interfaces (to create and place a fence, destroy, query, and wait on) are supported.</p>
 * 
 * <p>The remaining extensions list valid client APIs for fence syncs. The "GL_OES_EGL_sync" string indicates that a fence sync object can be created in
 * association with a fence command placed in the command stream of a bound OpenGL ES context. The "VG_KHR_EGL_sync" string indicates the same thing for a
 * bound OpenVG context.</p>
 * 
 * <p>Requires {@link EGL11 EGL 1.1}.</p>
 */
public class KHRFenceSync {

    public static final int
        EGL_SYNC_PRIOR_COMMANDS_COMPLETE_KHR = 0x30F0,
        EGL_SYNC_CONDITION_KHR               = 0x30F8,
        EGL_SYNC_FENCE_KHR                   = 0x30F9;

    protected KHRFenceSync() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(EGLCapabilities caps) {
        return checkFunctions(
            caps.eglCreateSyncKHR, caps.eglDestroySyncKHR, caps.eglClientWaitSyncKHR, caps.eglGetSyncAttribKHR
        );
    }

    // --- [ eglCreateSyncKHR ] ---

    public static long neglCreateSyncKHR(long dpy, int type, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateSyncKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPP(__functionAddress, dpy, type, attrib_list);
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
        return callPPI(__functionAddress, dpy, sync) != 0;
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
        return callPPJI(__functionAddress, dpy, sync, flags, timeout);
    }

    // --- [ eglGetSyncAttribKHR ] ---

    public static int neglGetSyncAttribKHR(long dpy, long sync, int attribute, long value) {
        long __functionAddress = EGL.getCapabilities().eglGetSyncAttribKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(sync);
        }
        return callPPPI(__functionAddress, dpy, sync, attribute, value);
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
        return callPPP(__functionAddress, dpy, type, attrib_list);
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
        return callPPPI(__functionAddress, dpy, sync, attribute, value) != 0;
    }

}