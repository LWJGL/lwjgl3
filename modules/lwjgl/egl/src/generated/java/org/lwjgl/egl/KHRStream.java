/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class KHRStream {

    public static final long EGL_NO_STREAM_KHR = 0x0L;

    public static final int
        EGL_CONSUMER_LATENCY_USEC_KHR            = 0x3210,
        EGL_PRODUCER_FRAME_KHR                   = 0x3212,
        EGL_CONSUMER_FRAME_KHR                   = 0x3213,
        EGL_STREAM_STATE_KHR                     = 0x3214,
        EGL_STREAM_STATE_CREATED_KHR             = 0x3215,
        EGL_STREAM_STATE_CONNECTING_KHR          = 0x3216,
        EGL_STREAM_STATE_EMPTY_KHR               = 0x3217,
        EGL_STREAM_STATE_NEW_FRAME_AVAILABLE_KHR = 0x3218,
        EGL_STREAM_STATE_OLD_FRAME_AVAILABLE_KHR = 0x3219,
        EGL_STREAM_STATE_DISCONNECTED_KHR        = 0x321A,
        EGL_BAD_STREAM_KHR                       = 0x321B,
        EGL_BAD_STATE_KHR                        = 0x321C;

    protected KHRStream() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglCreateStreamKHR ] ---

    /** {@code EGLStreamKHR eglCreateStreamKHR(EGLDisplay dpy, EGLint const * attrib_list)} */
    public static long neglCreateStreamKHR(long dpy, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateStreamKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPP(dpy, attrib_list, __functionAddress);
    }

    /** {@code EGLStreamKHR eglCreateStreamKHR(EGLDisplay dpy, EGLint const * attrib_list)} */
    @NativeType("EGLStreamKHR")
    public static long eglCreateStreamKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLint const *") @Nullable IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglCreateStreamKHR(dpy, memAddressSafe(attrib_list));
    }

    // --- [ eglDestroyStreamKHR ] ---

    /** {@code EGLBoolean eglDestroyStreamKHR(EGLDisplay dpy, EGLStreamKHR stream)} */
    @NativeType("EGLBoolean")
    public static boolean eglDestroyStreamKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLStreamKHR") long stream) {
        long __functionAddress = EGL.getCapabilities().eglDestroyStreamKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(stream);
        }
        return callPPI(dpy, stream, __functionAddress) != 0;
    }

    // --- [ eglStreamAttribKHR ] ---

    /** {@code EGLBoolean eglStreamAttribKHR(EGLDisplay dpy, EGLStreamKHR stream, EGLenum attribute, EGLint value)} */
    @NativeType("EGLBoolean")
    public static boolean eglStreamAttribKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLStreamKHR") long stream, @NativeType("EGLenum") int attribute, @NativeType("EGLint") int value) {
        long __functionAddress = EGL.getCapabilities().eglStreamAttribKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(stream);
        }
        return callPPI(dpy, stream, attribute, value, __functionAddress) != 0;
    }

    // --- [ eglQueryStreamKHR ] ---

    /** {@code EGLBoolean eglQueryStreamKHR(EGLDisplay dpy, EGLStreamKHR stream, EGLenum attribute, EGLint * value)} */
    public static int neglQueryStreamKHR(long dpy, long stream, int attribute, long value) {
        long __functionAddress = EGL.getCapabilities().eglQueryStreamKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(stream);
        }
        return callPPPI(dpy, stream, attribute, value, __functionAddress);
    }

    /** {@code EGLBoolean eglQueryStreamKHR(EGLDisplay dpy, EGLStreamKHR stream, EGLenum attribute, EGLint * value)} */
    @NativeType("EGLBoolean")
    public static boolean eglQueryStreamKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLStreamKHR") long stream, @NativeType("EGLenum") int attribute, @NativeType("EGLint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return neglQueryStreamKHR(dpy, stream, attribute, memAddress(value)) != 0;
    }

    // --- [ eglQueryStreamu64KHR ] ---

    /** {@code EGLBoolean eglQueryStreamu64KHR(EGLDisplay dpy, EGLStreamKHR stream, EGLenum attribute, EGLuint64KHR * value)} */
    public static int neglQueryStreamu64KHR(long dpy, long stream, int attribute, long value) {
        long __functionAddress = EGL.getCapabilities().eglQueryStreamu64KHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(stream);
        }
        return callPPPI(dpy, stream, attribute, value, __functionAddress);
    }

    /** {@code EGLBoolean eglQueryStreamu64KHR(EGLDisplay dpy, EGLStreamKHR stream, EGLenum attribute, EGLuint64KHR * value)} */
    @NativeType("EGLBoolean")
    public static boolean eglQueryStreamu64KHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLStreamKHR") long stream, @NativeType("EGLenum") int attribute, @NativeType("EGLuint64KHR *") LongBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return neglQueryStreamu64KHR(dpy, stream, attribute, memAddress(value)) != 0;
    }

    /** {@code EGLStreamKHR eglCreateStreamKHR(EGLDisplay dpy, EGLint const * attrib_list)} */
    @NativeType("EGLStreamKHR")
    public static long eglCreateStreamKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLint const *") int @Nullable [] attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateStreamKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return callPPP(dpy, attrib_list, __functionAddress);
    }

    /** {@code EGLBoolean eglQueryStreamKHR(EGLDisplay dpy, EGLStreamKHR stream, EGLenum attribute, EGLint * value)} */
    @NativeType("EGLBoolean")
    public static boolean eglQueryStreamKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLStreamKHR") long stream, @NativeType("EGLenum") int attribute, @NativeType("EGLint *") int[] value) {
        long __functionAddress = EGL.getCapabilities().eglQueryStreamKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(stream);
            check(value, 1);
        }
        return callPPPI(dpy, stream, attribute, value, __functionAddress) != 0;
    }

    /** {@code EGLBoolean eglQueryStreamu64KHR(EGLDisplay dpy, EGLStreamKHR stream, EGLenum attribute, EGLuint64KHR * value)} */
    @NativeType("EGLBoolean")
    public static boolean eglQueryStreamu64KHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLStreamKHR") long stream, @NativeType("EGLenum") int attribute, @NativeType("EGLuint64KHR *") long[] value) {
        long __functionAddress = EGL.getCapabilities().eglQueryStreamu64KHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(stream);
            check(value, 1);
        }
        return callPPPI(dpy, stream, attribute, value, __functionAddress) != 0;
    }

}