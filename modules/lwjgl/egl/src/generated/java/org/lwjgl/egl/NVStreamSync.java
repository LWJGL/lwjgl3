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

public class NVStreamSync {

    public static final int
        EGL_SYNC_TYPE_KHR     = 0x30F7,
        EGL_SYNC_NEW_FRAME_NV = 0x321F;

    protected NVStreamSync() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglCreateStreamSyncNV ] ---

    /** {@code EGLSyncKHR eglCreateStreamSyncNV(EGLDisplay dpy, EGLStreamKHR stream, EGLenum type, EGLint const * attrib_list)} */
    public static long neglCreateStreamSyncNV(long dpy, long stream, int type, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateStreamSyncNV;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(stream);
        }
        return callPPPP(dpy, stream, type, attrib_list, __functionAddress);
    }

    /** {@code EGLSyncKHR eglCreateStreamSyncNV(EGLDisplay dpy, EGLStreamKHR stream, EGLenum type, EGLint const * attrib_list)} */
    @NativeType("EGLSyncKHR")
    public static long eglCreateStreamSyncNV(@NativeType("EGLDisplay") long dpy, @NativeType("EGLStreamKHR") long stream, @NativeType("EGLenum") int type, @NativeType("EGLint const *") IntBuffer attrib_list) {
        if (CHECKS) {
            checkNT(attrib_list, EGL10.EGL_NONE);
        }
        return neglCreateStreamSyncNV(dpy, stream, type, memAddress(attrib_list));
    }

    /** {@code EGLSyncKHR eglCreateStreamSyncNV(EGLDisplay dpy, EGLStreamKHR stream, EGLenum type, EGLint const * attrib_list)} */
    @NativeType("EGLSyncKHR")
    public static long eglCreateStreamSyncNV(@NativeType("EGLDisplay") long dpy, @NativeType("EGLStreamKHR") long stream, @NativeType("EGLenum") int type, @NativeType("EGLint const *") int[] attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateStreamSyncNV;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(stream);
            checkNT(attrib_list, EGL10.EGL_NONE);
        }
        return callPPPP(dpy, stream, type, attrib_list, __functionAddress);
    }

}