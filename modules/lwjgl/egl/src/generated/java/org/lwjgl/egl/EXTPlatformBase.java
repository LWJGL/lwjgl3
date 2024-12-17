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

public class EXTPlatformBase {

    protected EXTPlatformBase() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglGetPlatformDisplayEXT ] ---

    /** {@code EGLDisplay eglGetPlatformDisplayEXT(EGLenum platform, void * native_display, EGLint const * attrib_list)} */
    public static long neglGetPlatformDisplayEXT(int platform, long native_display, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglGetPlatformDisplayEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(native_display);
        }
        return callPPP(platform, native_display, attrib_list, __functionAddress);
    }

    /** {@code EGLDisplay eglGetPlatformDisplayEXT(EGLenum platform, void * native_display, EGLint const * attrib_list)} */
    @NativeType("EGLDisplay")
    public static long eglGetPlatformDisplayEXT(@NativeType("EGLenum") int platform, @NativeType("void *") long native_display, @NativeType("EGLint const *") @Nullable IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglGetPlatformDisplayEXT(platform, native_display, memAddressSafe(attrib_list));
    }

    // --- [ eglCreatePlatformWindowSurfaceEXT ] ---

    /** {@code EGLSurface eglCreatePlatformWindowSurfaceEXT(EGLDisplay dpy, EGLConfig config, void * native_window, EGLint const * attrib_list)} */
    public static long neglCreatePlatformWindowSurfaceEXT(long dpy, long config, long native_window, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreatePlatformWindowSurfaceEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(config);
            check(native_window);
        }
        return callPPPPP(dpy, config, native_window, attrib_list, __functionAddress);
    }

    /** {@code EGLSurface eglCreatePlatformWindowSurfaceEXT(EGLDisplay dpy, EGLConfig config, void * native_window, EGLint const * attrib_list)} */
    @NativeType("EGLSurface")
    public static long eglCreatePlatformWindowSurfaceEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLConfig") long config, @NativeType("void *") long native_window, @NativeType("EGLint const *") @Nullable IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglCreatePlatformWindowSurfaceEXT(dpy, config, native_window, memAddressSafe(attrib_list));
    }

    // --- [ eglCreatePlatformPixmapSurfaceEXT ] ---

    /** {@code EGLSurface eglCreatePlatformPixmapSurfaceEXT(EGLDisplay dpy, EGLConfig config, void * native_pixmap, EGLint const * attrib_list)} */
    public static long neglCreatePlatformPixmapSurfaceEXT(long dpy, long config, long native_pixmap, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreatePlatformPixmapSurfaceEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(config);
            check(native_pixmap);
        }
        return callPPPPP(dpy, config, native_pixmap, attrib_list, __functionAddress);
    }

    /** {@code EGLSurface eglCreatePlatformPixmapSurfaceEXT(EGLDisplay dpy, EGLConfig config, void * native_pixmap, EGLint const * attrib_list)} */
    @NativeType("EGLSurface")
    public static long eglCreatePlatformPixmapSurfaceEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLConfig") long config, @NativeType("void *") long native_pixmap, @NativeType("EGLint const *") @Nullable IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglCreatePlatformPixmapSurfaceEXT(dpy, config, native_pixmap, memAddressSafe(attrib_list));
    }

    /** {@code EGLDisplay eglGetPlatformDisplayEXT(EGLenum platform, void * native_display, EGLint const * attrib_list)} */
    @NativeType("EGLDisplay")
    public static long eglGetPlatformDisplayEXT(@NativeType("EGLenum") int platform, @NativeType("void *") long native_display, @NativeType("EGLint const *") int @Nullable [] attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglGetPlatformDisplayEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(native_display);
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return callPPP(platform, native_display, attrib_list, __functionAddress);
    }

    /** {@code EGLSurface eglCreatePlatformWindowSurfaceEXT(EGLDisplay dpy, EGLConfig config, void * native_window, EGLint const * attrib_list)} */
    @NativeType("EGLSurface")
    public static long eglCreatePlatformWindowSurfaceEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLConfig") long config, @NativeType("void *") long native_window, @NativeType("EGLint const *") int @Nullable [] attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreatePlatformWindowSurfaceEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(config);
            check(native_window);
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return callPPPPP(dpy, config, native_window, attrib_list, __functionAddress);
    }

    /** {@code EGLSurface eglCreatePlatformPixmapSurfaceEXT(EGLDisplay dpy, EGLConfig config, void * native_pixmap, EGLint const * attrib_list)} */
    @NativeType("EGLSurface")
    public static long eglCreatePlatformPixmapSurfaceEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLConfig") long config, @NativeType("void *") long native_pixmap, @NativeType("EGLint const *") int @Nullable [] attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreatePlatformPixmapSurfaceEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(config);
            check(native_pixmap);
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return callPPPPP(dpy, config, native_pixmap, attrib_list, __functionAddress);
    }

}