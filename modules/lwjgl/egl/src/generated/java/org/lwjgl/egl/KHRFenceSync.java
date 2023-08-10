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

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/KHR/EGL_KHR_fence_sync.txt">KHR_fence_sync</a> extension.
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

    // --- [ eglCreateSyncKHR ] ---

    public static long neglCreateSyncKHR(long dpy, int type, long attrib_list) {
        return KHRReusableSync.neglCreateSyncKHR(dpy, type, attrib_list);
    }

    @NativeType("EGLSyncKHR")
    public static long eglCreateSyncKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLenum") int type, @Nullable @NativeType("EGLint const *") IntBuffer attrib_list) {
        return KHRReusableSync.eglCreateSyncKHR(dpy, type, attrib_list);
    }

    // --- [ eglDestroySyncKHR ] ---

    @NativeType("EGLBoolean")
    public static boolean eglDestroySyncKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSyncKHR") long sync) {
        return KHRReusableSync.eglDestroySyncKHR(dpy, sync);
    }

    // --- [ eglClientWaitSyncKHR ] ---

    @NativeType("EGLint")
    public static int eglClientWaitSyncKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSyncKHR") long sync, @NativeType("EGLint") int flags, @NativeType("EGLTimeKHR") long timeout) {
        return KHRReusableSync.eglClientWaitSyncKHR(dpy, sync, flags, timeout);
    }

    // --- [ eglGetSyncAttribKHR ] ---

    public static int neglGetSyncAttribKHR(long dpy, long sync, int attribute, long value) {
        return KHRReusableSync.neglGetSyncAttribKHR(dpy, sync, attribute, value);
    }

    @NativeType("EGLBoolean")
    public static boolean eglGetSyncAttribKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSyncKHR") long sync, @NativeType("EGLint") int attribute, @NativeType("EGLint *") IntBuffer value) {
        return KHRReusableSync.eglGetSyncAttribKHR(dpy, sync, attribute, value);
    }

    /** Array version of: {@link #eglCreateSyncKHR CreateSyncKHR} */
    @NativeType("EGLSyncKHR")
    public static long eglCreateSyncKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLenum") int type, @Nullable @NativeType("EGLint const *") int[] attrib_list) {
        return KHRReusableSync.eglCreateSyncKHR(dpy, type, attrib_list);
    }

    /** Array version of: {@link #eglGetSyncAttribKHR GetSyncAttribKHR} */
    @NativeType("EGLBoolean")
    public static boolean eglGetSyncAttribKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSyncKHR") long sync, @NativeType("EGLint") int attribute, @NativeType("EGLint *") int[] value) {
        return KHRReusableSync.eglGetSyncAttribKHR(dpy, sync, attribute, value);
    }

}