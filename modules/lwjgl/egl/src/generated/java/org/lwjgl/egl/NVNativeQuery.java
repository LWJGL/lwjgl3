/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/NV/EGL_NV_native_query.txt">NV_native_query</a> extension.
 * 
 * <p>This extension allows an application to query which native display, pixmap and surface corresponds to a EGL object.</p>
 */
public class NVNativeQuery {

    protected NVNativeQuery() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglQueryNativeDisplayNV ] ---

    public static int neglQueryNativeDisplayNV(long dpy, long display_id) {
        long __functionAddress = EGL.getCapabilities().eglQueryNativeDisplayNV;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPI(dpy, display_id, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglQueryNativeDisplayNV(@NativeType("EGLDisplay") long dpy, @NativeType("EGLNativeDisplayType *") PointerBuffer display_id) {
        if (CHECKS) {
            check(display_id, 1);
        }
        return neglQueryNativeDisplayNV(dpy, memAddress(display_id)) != 0;
    }

    // --- [ eglQueryNativeWindowNV ] ---

    public static int neglQueryNativeWindowNV(long dpy, long surf, long window) {
        long __functionAddress = EGL.getCapabilities().eglQueryNativeWindowNV;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surf);
        }
        return callPPPI(dpy, surf, window, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglQueryNativeWindowNV(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surf, @NativeType("EGLNativeWindowType *") PointerBuffer window) {
        if (CHECKS) {
            check(window, 1);
        }
        return neglQueryNativeWindowNV(dpy, surf, memAddress(window)) != 0;
    }

    // --- [ eglQueryNativePixmapNV ] ---

    public static int neglQueryNativePixmapNV(long dpy, long surf, long pixmap) {
        long __functionAddress = EGL.getCapabilities().eglQueryNativePixmapNV;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surf);
        }
        return callPPPI(dpy, surf, pixmap, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglQueryNativePixmapNV(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surf, @NativeType("EGLNativePixmapType *") PointerBuffer pixmap) {
        if (CHECKS) {
            check(pixmap, 1);
        }
        return neglQueryNativePixmapNV(dpy, surf, memAddress(pixmap)) != 0;
    }

}