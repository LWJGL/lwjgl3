/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/KHR/EGL_KHR_stream_producer_eglsurface.txt">KHR_stream_producer_eglsurface</a> extension.
 * 
 * <p>This extension allows an EGLSurface to be created as a producer of images to an EGLStream. Each call to eglSwapBuffers posts a new image frame into the
 * EGLStream.</p>
 * 
 * <p>Requires {@link EGL12 EGL 1.2}.</p>
 */
public class KHRStreamProducerEGLSurface {

    public static final int EGL_STREAM_BIT_KHR = 0x800;

    protected KHRStreamProducerEGLSurface() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglCreateStreamProducerSurfaceKHR ] ---

    public static long neglCreateStreamProducerSurfaceKHR(long dpy, long config, long stream, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateStreamProducerSurfaceKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(config);
            check(stream);
        }
        return callPPPPP(dpy, config, stream, attrib_list, __functionAddress);
    }

    @NativeType("EGLSurface")
    public static long eglCreateStreamProducerSurfaceKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLConfig") long config, @NativeType("EGLStreamKHR") long stream, @Nullable @NativeType("EGLint const *") IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglCreateStreamProducerSurfaceKHR(dpy, config, stream, memAddressSafe(attrib_list));
    }

    /** Array version of: {@link #eglCreateStreamProducerSurfaceKHR CreateStreamProducerSurfaceKHR} */
    @NativeType("EGLSurface")
    public static long eglCreateStreamProducerSurfaceKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLConfig") long config, @NativeType("EGLStreamKHR") long stream, @Nullable @NativeType("EGLint const *") int[] attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateStreamProducerSurfaceKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(config);
            check(stream);
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return callPPPPP(dpy, config, stream, attrib_list, __functionAddress);
    }

}