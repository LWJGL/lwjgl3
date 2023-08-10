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
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_platform_base.txt">EXT_platform_base</a> extension.
 * 
 * <p>This extension defines functionality and behavior for EGL implementations that support multiple platforms at runtime. For example, on Linux an EGL
 * implementation could support X11, Wayland, GBM (Generic Buffer Manager), Surface Flinger, and perhaps other platforms.</p>
 * 
 * <p>In particular, this extension defines the following:</p>
 * 
 * <ol>
 * <li>A mechanism by which an EGL client can detect which platforms the EGL implementation supports.</li>
 * <li>New functions that enable an EGL client to specify to which platform a native resource belongs when creating an EGL resource from that native
 * resource. For example, this extension enables an EGL client to specify, when creating an EGLSurface from a native window, that the window belongs
 * to X11.</li>
 * <li>That an EGL client is not restricted to interacting with a single platform per process. A client process can create and manage EGL resources from
 * multiple platforms.</li>
 * </ol>
 * 
 * <p>The generic term 'platform' is used throughout this extension specification rather than 'window system' because not all EGL platforms are window
 * systems. In particular, those platforms that allow headless rendering without a display server, such as GBM, are not window systems.</p>
 * 
 * <p>This extension does not specify behavior specific to any platform, nor does it specify the set of platforms that an EGL implementation may support.
 * Platform-specific details lie outside this extension's scope and are instead described by extensions layered atop this one.</p>
 * 
 * <p>Requires {@link EGL14 EGL 1.4} and <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_client_extensions.txt">EXT_platform_base</a> to query its existence without a display.</p>
 */
public class EXTPlatformBase {

    protected EXTPlatformBase() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglGetPlatformDisplayEXT ] ---

    public static long neglGetPlatformDisplayEXT(int platform, long native_display, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglGetPlatformDisplayEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(native_display);
        }
        return callPPP(platform, native_display, attrib_list, __functionAddress);
    }

    @NativeType("EGLDisplay")
    public static long eglGetPlatformDisplayEXT(@NativeType("EGLenum") int platform, @NativeType("void *") long native_display, @Nullable @NativeType("EGLint const *") IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglGetPlatformDisplayEXT(platform, native_display, memAddressSafe(attrib_list));
    }

    // --- [ eglCreatePlatformWindowSurfaceEXT ] ---

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

    @NativeType("EGLSurface")
    public static long eglCreatePlatformWindowSurfaceEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLConfig") long config, @NativeType("void *") long native_window, @Nullable @NativeType("EGLint const *") IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglCreatePlatformWindowSurfaceEXT(dpy, config, native_window, memAddressSafe(attrib_list));
    }

    // --- [ eglCreatePlatformPixmapSurfaceEXT ] ---

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

    @NativeType("EGLSurface")
    public static long eglCreatePlatformPixmapSurfaceEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLConfig") long config, @NativeType("void *") long native_pixmap, @Nullable @NativeType("EGLint const *") IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglCreatePlatformPixmapSurfaceEXT(dpy, config, native_pixmap, memAddressSafe(attrib_list));
    }

    /** Array version of: {@link #eglGetPlatformDisplayEXT GetPlatformDisplayEXT} */
    @NativeType("EGLDisplay")
    public static long eglGetPlatformDisplayEXT(@NativeType("EGLenum") int platform, @NativeType("void *") long native_display, @Nullable @NativeType("EGLint const *") int[] attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglGetPlatformDisplayEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(native_display);
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return callPPP(platform, native_display, attrib_list, __functionAddress);
    }

    /** Array version of: {@link #eglCreatePlatformWindowSurfaceEXT CreatePlatformWindowSurfaceEXT} */
    @NativeType("EGLSurface")
    public static long eglCreatePlatformWindowSurfaceEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLConfig") long config, @NativeType("void *") long native_window, @Nullable @NativeType("EGLint const *") int[] attrib_list) {
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

    /** Array version of: {@link #eglCreatePlatformPixmapSurfaceEXT CreatePlatformPixmapSurfaceEXT} */
    @NativeType("EGLSurface")
    public static long eglCreatePlatformPixmapSurfaceEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLConfig") long config, @NativeType("void *") long native_pixmap, @Nullable @NativeType("EGLint const *") int[] attrib_list) {
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