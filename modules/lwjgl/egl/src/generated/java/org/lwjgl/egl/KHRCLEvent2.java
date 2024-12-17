/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class KHRCLEvent2 {

    public static final int
        EGL_CL_EVENT_HANDLE_KHR        = 0x309C,
        EGL_SYNC_CL_EVENT_KHR          = 0x30FE,
        EGL_SYNC_CL_EVENT_COMPLETE_KHR = 0x30FF;

    protected KHRCLEvent2() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglCreateSync64KHR ] ---

    /** {@code EGLSyncKHR eglCreateSync64KHR(EGLDisplay dpy, EGLenum type, EGLAttribKHR const * attrib_list)} */
    public static long neglCreateSync64KHR(long dpy, int type, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateSync64KHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPP(dpy, type, attrib_list, __functionAddress);
    }

    /** {@code EGLSyncKHR eglCreateSync64KHR(EGLDisplay dpy, EGLenum type, EGLAttribKHR const * attrib_list)} */
    @NativeType("EGLSyncKHR")
    public static long eglCreateSync64KHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLenum") int type, @NativeType("EGLAttribKHR const *") PointerBuffer attrib_list) {
        if (CHECKS) {
            checkNT(attrib_list, EGL10.EGL_NONE);
        }
        return neglCreateSync64KHR(dpy, type, memAddress(attrib_list));
    }

}