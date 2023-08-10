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

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/KHR/EGL_KHR_cl_event2.txt">KHR_cl_event2</a> extension.
 * 
 * <p>This extension allows creating an EGL sync object linked to an OpenCL event object, potentially improving efficiency of sharing images between the two
 * APIs. The companion cl_khr_egl_event extension provides the complementary functionality of creating an OpenCL event object from an EGL sync object.</p>
 * 
 * <p>This extension is functionally identical to EGL_KHR_cl_event, but is intended to replace that extension. It exists only to address an implementation
 * issue on 64-bit platforms where passing OpenCL event handles in an EGLint attribute list value is impossible, because the implementations use a 32-bit
 * type for EGLint.</p>
 * 
 * <p>This extension also incorporates some required functionality from the EGL_KHR_fence_sync extension, similarly modified for 64-bit platforms.</p>
 * 
 * <p>Requires {@link EGL14 EGL 1.4} and {@link KHRFenceSync KHR_fence_sync}.</p>
 */
public class KHRCLEvent2 {

    public static final int
        EGL_CL_EVENT_HANDLE_KHR        = 0x309C,
        EGL_SYNC_CL_EVENT_KHR          = 0x30FE,
        EGL_SYNC_CL_EVENT_COMPLETE_KHR = 0x30FF;

    protected KHRCLEvent2() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglCreateSync64KHR ] ---

    public static long neglCreateSync64KHR(long dpy, int type, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateSync64KHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPP(dpy, type, attrib_list, __functionAddress);
    }

    @NativeType("EGLSyncKHR")
    public static long eglCreateSync64KHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLenum") int type, @NativeType("EGLAttribKHR const *") PointerBuffer attrib_list) {
        if (CHECKS) {
            checkNT(attrib_list, EGL10.EGL_NONE);
        }
        return neglCreateSync64KHR(dpy, type, memAddress(attrib_list));
    }

}