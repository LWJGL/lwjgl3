/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class KHRStreamCrossProcessFD {

    public static final int EGL_NO_FILE_DESCRIPTOR_KHR = -1;

    protected KHRStreamCrossProcessFD() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglGetStreamFileDescriptorKHR ] ---

    /** {@code EGLNativeFileDescriptorKHR eglGetStreamFileDescriptorKHR(EGLDisplay dpy, EGLStreamKHR stream)} */
    @NativeType("EGLNativeFileDescriptorKHR")
    public static int eglGetStreamFileDescriptorKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLStreamKHR") long stream) {
        long __functionAddress = EGL.getCapabilities().eglGetStreamFileDescriptorKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(stream);
        }
        return callPPI(dpy, stream, __functionAddress);
    }

    // --- [ eglCreateStreamFromFileDescriptorKHR ] ---

    /** {@code EGLStreamKHR eglCreateStreamFromFileDescriptorKHR(EGLDisplay dpy, EGLNativeFileDescriptorKHR file_descriptor)} */
    @NativeType("EGLStreamKHR")
    public static long eglCreateStreamFromFileDescriptorKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLNativeFileDescriptorKHR") int file_descriptor) {
        long __functionAddress = EGL.getCapabilities().eglCreateStreamFromFileDescriptorKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPP(dpy, file_descriptor, __functionAddress);
    }

}