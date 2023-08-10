/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/KHR/EGL_KHR_stream_consumer_gltexture.txt">KHR_stream_consumer_gltexture</a> extension.
 * 
 * <p>This extension allows an OpenGL(ES) texture to be connected to an EGLStream as its consumer. Image frames from the EGLStream can be 'latched' into the
 * texture as the contents of the texture. This is equivalent to copying the image into the texture, but on most implementations a copy is not needed so
 * this is faster.</p>
 * 
 * <p>Requires {@link EGL12 EGL 1.2}.</p>
 */
public class KHRStreamConsumerGLTexture {

    public static final int EGL_CONSUMER_ACQUIRE_TIMEOUT_USEC_KHR = 0x321E;

    protected KHRStreamConsumerGLTexture() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglStreamConsumerGLTextureExternalKHR ] ---

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