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

public class KHRStreamFIFO {

    public static final int
        EGL_STREAM_FIFO_LENGTH_KHR   = 0x31FC,
        EGL_STREAM_TIME_NOW_KHR      = 0x31FD,
        EGL_STREAM_TIME_CONSUMER_KHR = 0x31FE,
        EGL_STREAM_TIME_PRODUCER_KHR = 0x31FF;

    protected KHRStreamFIFO() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglQueryStreamTimeKHR ] ---

    /** {@code EGLBoolean eglQueryStreamTimeKHR(EGLDisplay dpy, EGLStreamKHR stream, EGLenum attribute, EGLTimeKHR * value)} */
    public static int neglQueryStreamTimeKHR(long dpy, long stream, int attribute, long value) {
        long __functionAddress = EGL.getCapabilities().eglQueryStreamTimeKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(stream);
        }
        return callPPPI(dpy, stream, attribute, value, __functionAddress);
    }

    /** {@code EGLBoolean eglQueryStreamTimeKHR(EGLDisplay dpy, EGLStreamKHR stream, EGLenum attribute, EGLTimeKHR * value)} */
    @NativeType("EGLBoolean")
    public static boolean eglQueryStreamTimeKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLStreamKHR") long stream, @NativeType("EGLenum") int attribute, @NativeType("EGLTimeKHR *") LongBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return neglQueryStreamTimeKHR(dpy, stream, attribute, memAddress(value)) != 0;
    }

    /** {@code EGLBoolean eglQueryStreamTimeKHR(EGLDisplay dpy, EGLStreamKHR stream, EGLenum attribute, EGLTimeKHR * value)} */
    @NativeType("EGLBoolean")
    public static boolean eglQueryStreamTimeKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLStreamKHR") long stream, @NativeType("EGLenum") int attribute, @NativeType("EGLTimeKHR *") long[] value) {
        long __functionAddress = EGL.getCapabilities().eglQueryStreamTimeKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(stream);
            check(value, 1);
        }
        return callPPPI(dpy, stream, attribute, value, __functionAddress) != 0;
    }

}