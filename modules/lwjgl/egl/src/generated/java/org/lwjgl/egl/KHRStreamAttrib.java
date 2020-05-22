/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import javax.annotation.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** See {@link KHRStream KHR_stream}. */
public class KHRStreamAttrib {

    protected KHRStreamAttrib() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglCreateStreamAttribKHR ] ---

    public static long neglCreateStreamAttribKHR(long dpy, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateStreamAttribKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPP(dpy, attrib_list, __functionAddress);
    }

    @NativeType("EGLStreamKHR")
    public static long eglCreateStreamAttribKHR(@NativeType("EGLDisplay") long dpy, @Nullable @NativeType("EGLAttrib const *") PointerBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglCreateStreamAttribKHR(dpy, memAddressSafe(attrib_list));
    }

    // --- [ eglSetStreamAttribKHR ] ---

    @NativeType("EGLBoolean")
    public static boolean eglSetStreamAttribKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLStreamKHR") long stream, @NativeType("EGLenum") int attribute, @NativeType("EGLAttrib") long value) {
        long __functionAddress = EGL.getCapabilities().eglSetStreamAttribKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(stream);
        }
        return callPPPI(dpy, stream, attribute, value, __functionAddress) != 0;
    }

    // --- [ eglQueryStreamAttribKHR ] ---

    public static int neglQueryStreamAttribKHR(long dpy, long stream, int attribute, long value) {
        long __functionAddress = EGL.getCapabilities().eglQueryStreamAttribKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(stream);
        }
        return callPPPI(dpy, stream, attribute, value, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglQueryStreamAttribKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLStreamKHR") long stream, @NativeType("EGLenum") int attribute, @NativeType("EGLAttrib *") PointerBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return neglQueryStreamAttribKHR(dpy, stream, attribute, memAddress(value)) != 0;
    }

    // --- [ eglStreamConsumerAcquireAttribKHR ] ---

    public static int neglStreamConsumerAcquireAttribKHR(long dpy, long stream, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglStreamConsumerAcquireAttribKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(stream);
        }
        return callPPPI(dpy, stream, attrib_list, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglStreamConsumerAcquireAttribKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLStreamKHR") long stream, @Nullable @NativeType("EGLAttrib const *") PointerBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglStreamConsumerAcquireAttribKHR(dpy, stream, memAddressSafe(attrib_list)) != 0;
    }

    // --- [ eglStreamConsumerReleaseAttribKHR ] ---

    public static int neglStreamConsumerReleaseAttribKHR(long dpy, long stream, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglStreamConsumerReleaseAttribKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(stream);
        }
        return callPPPI(dpy, stream, attrib_list, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglStreamConsumerReleaseAttribKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLStreamKHR") long stream, @Nullable @NativeType("EGLAttrib const *") PointerBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglStreamConsumerReleaseAttribKHR(dpy, stream, memAddressSafe(attrib_list)) != 0;
    }

}