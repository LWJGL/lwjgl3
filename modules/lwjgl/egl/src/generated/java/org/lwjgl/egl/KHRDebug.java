/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.jspecify.annotations.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class KHRDebug {

    public static final int
        EGL_OBJECT_THREAD_KHR  = 0x33B0,
        EGL_OBJECT_DISPLAY_KHR = 0x33B1,
        EGL_OBJECT_CONTEXT_KHR = 0x33B2,
        EGL_OBJECT_SURFACE_KHR = 0x33B3,
        EGL_OBJECT_IMAGE_KHR   = 0x33B4,
        EGL_OBJECT_SYNC_KHR    = 0x33B5,
        EGL_OBJECT_STREAM_KHR  = 0x33B6;

    public static final int
        EGL_DEBUG_MSG_CRITICAL_KHR = 0x33B9,
        EGL_DEBUG_MSG_ERROR_KHR    = 0x33BA,
        EGL_DEBUG_MSG_WARN_KHR     = 0x33BB,
        EGL_DEBUG_MSG_INFO_KHR     = 0x33BC;

    public static final int EGL_DEBUG_CALLBACK_KHR = 0x33B8;

    protected KHRDebug() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglDebugMessageControlKHR ] ---

    /** {@code EGLint eglDebugMessageControlKHR(EGLDEBUGPROCKHR callback, EGLAttrib const * attrib_list)} */
    public static int neglDebugMessageControlKHR(long callback, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglDebugMessageControlKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(callback, attrib_list, __functionAddress);
    }

    /** {@code EGLint eglDebugMessageControlKHR(EGLDEBUGPROCKHR callback, EGLAttrib const * attrib_list)} */
    @NativeType("EGLint")
    public static int eglDebugMessageControlKHR(@NativeType("EGLDEBUGPROCKHR") EGLDebugMessageKHRCallbackI callback, @NativeType("EGLAttrib const *") @Nullable PointerBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglDebugMessageControlKHR(callback.address(), memAddressSafe(attrib_list));
    }

    // --- [ eglQueryDebugKHR ] ---

    /** {@code EGLBoolean eglQueryDebugKHR(EGLint attribute, EGLAttrib * value)} */
    public static int neglQueryDebugKHR(int attribute, long value) {
        long __functionAddress = EGL.getCapabilities().eglQueryDebugKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(attribute, value, __functionAddress);
    }

    /** {@code EGLBoolean eglQueryDebugKHR(EGLint attribute, EGLAttrib * value)} */
    @NativeType("EGLBoolean")
    public static boolean eglQueryDebugKHR(@NativeType("EGLint") int attribute, @NativeType("EGLAttrib *") PointerBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return neglQueryDebugKHR(attribute, memAddress(value)) != 0;
    }

    // --- [ eglLabelObjectKHR ] ---

    /** {@code EGLint eglLabelObjectKHR(EGLDisplay display, EGLenum objectType, EGLObjectKHR object, EGLLabelKHR label)} */
    @NativeType("EGLint")
    public static int eglLabelObjectKHR(@NativeType("EGLDisplay") long display, @NativeType("EGLenum") int objectType, @NativeType("EGLObjectKHR") long object, @NativeType("EGLLabelKHR") long label) {
        long __functionAddress = EGL.getCapabilities().eglLabelObjectKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(object);
            check(label);
        }
        return callPPPI(display, objectType, object, label, __functionAddress);
    }

}