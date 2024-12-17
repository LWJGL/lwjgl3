/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class KHRStreamConsumerGLTexture {

    public static final int EGL_CONSUMER_ACQUIRE_TIMEOUT_USEC_KHR = 0x321E;

    protected KHRStreamConsumerGLTexture() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglStreamConsumerGLTextureExternalKHR ] ---

    /** {@code EGLBoolean eglStreamConsumerGLTextureExternalKHR(EGLDisplay dpy, EGLStreamKHR stream)} */
    @NativeType("EGLBoolean")
    public static boolean eglStreamConsumerGLTextureExternalKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLStreamKHR") long stream) {
        long __functionAddress = EGL.getCapabilities().eglStreamConsumerGLTextureExternalKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(stream);
        }
        return callPPI(dpy, stream, __functionAddress) != 0;
    }

    // --- [ eglStreamConsumerAcquireKHR ] ---

    /** {@code EGLBoolean eglStreamConsumerAcquireKHR(EGLDisplay dpy, EGLStreamKHR stream)} */
    @NativeType("EGLBoolean")
    public static boolean eglStreamConsumerAcquireKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLStreamKHR") long stream) {
        long __functionAddress = EGL.getCapabilities().eglStreamConsumerAcquireKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(stream);
        }
        return callPPI(dpy, stream, __functionAddress) != 0;
    }

    // --- [ eglStreamConsumerReleaseKHR ] ---

    /** {@code EGLBoolean eglStreamConsumerReleaseKHR(EGLDisplay dpy, EGLStreamKHR stream)} */
    @NativeType("EGLBoolean")
    public static boolean eglStreamConsumerReleaseKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLStreamKHR") long stream) {
        long __functionAddress = EGL.getCapabilities().eglStreamConsumerReleaseKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(stream);
        }
        return callPPI(dpy, stream, __functionAddress) != 0;
    }

}