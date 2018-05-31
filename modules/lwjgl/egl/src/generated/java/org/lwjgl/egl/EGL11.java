/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/** The core EGL 1.1 functionality. */
public class EGL11 extends EGL10 {

    public static final int
        EGL_BACK_BUFFER          = 0x3084,
        EGL_BIND_TO_TEXTURE_RGB  = 0x3039,
        EGL_BIND_TO_TEXTURE_RGBA = 0x303A,
        EGL_CONTEXT_LOST         = 0x300E,
        EGL_MIN_SWAP_INTERVAL    = 0x303B,
        EGL_MAX_SWAP_INTERVAL    = 0x303C,
        EGL_MIPMAP_TEXTURE       = 0x3082,
        EGL_MIPMAP_LEVEL         = 0x3083,
        EGL_NO_TEXTURE           = 0x305C,
        EGL_TEXTURE_2D           = 0x305F,
        EGL_TEXTURE_FORMAT       = 0x3080,
        EGL_TEXTURE_RGB          = 0x305D,
        EGL_TEXTURE_RGBA         = 0x305E,
        EGL_TEXTURE_TARGET       = 0x3081;

    protected EGL11() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(EGLCapabilities caps) {
        return checkFunctions(
            caps.eglBindTexImage, caps.eglReleaseTexImage, caps.eglSurfaceAttrib, caps.eglSwapInterval
        );
    }

    // --- [ eglBindTexImage ] ---

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglBindTexImage.xhtml">Reference Page</a> */
    @NativeType("EGLBoolean")
    public static boolean eglBindTexImage(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surface, @NativeType("EGLint") int buffer) {
        long __functionAddress = EGL.getCapabilities().eglBindTexImage;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
        }
        return callPPI(__functionAddress, dpy, surface, buffer) != 0;
    }

    // --- [ eglReleaseTexImage ] ---

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglReleaseTexImage.xhtml">Reference Page</a> */
    @NativeType("EGLBoolean")
    public static boolean eglReleaseTexImage(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surface, @NativeType("EGLint") int buffer) {
        long __functionAddress = EGL.getCapabilities().eglReleaseTexImage;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
        }
        return callPPI(__functionAddress, dpy, surface, buffer) != 0;
    }

    // --- [ eglSurfaceAttrib ] ---

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglSurfaceAttrib.xhtml">Reference Page</a> */
    @NativeType("EGLBoolean")
    public static boolean eglSurfaceAttrib(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surface, @NativeType("EGLint") int attribute, @NativeType("EGLint") int value) {
        long __functionAddress = EGL.getCapabilities().eglSurfaceAttrib;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
        }
        return callPPI(__functionAddress, dpy, surface, attribute, value) != 0;
    }

    // --- [ eglSwapInterval ] ---

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglSwapInterval.xhtml">Reference Page</a> */
    @NativeType("EGLBoolean")
    public static boolean eglSwapInterval(@NativeType("EGLDisplay") long dpy, @NativeType("EGLint") int interval) {
        long __functionAddress = EGL.getCapabilities().eglSwapInterval;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPI(__functionAddress, dpy, interval) != 0;
    }

}