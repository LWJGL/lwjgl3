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

public class NVNativeQuery {

    protected NVNativeQuery() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglQueryNativeDisplayNV ] ---

    /** {@code EGLBoolean eglQueryNativeDisplayNV(EGLDisplay dpy, EGLNativeDisplayType * display_id)} */
    public static int neglQueryNativeDisplayNV(long dpy, long display_id) {
        long __functionAddress = EGL.getCapabilities().eglQueryNativeDisplayNV;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPI(dpy, display_id, __functionAddress);
    }

    /** {@code EGLBoolean eglQueryNativeDisplayNV(EGLDisplay dpy, EGLNativeDisplayType * display_id)} */
    @NativeType("EGLBoolean")
    public static boolean eglQueryNativeDisplayNV(@NativeType("EGLDisplay") long dpy, @NativeType("EGLNativeDisplayType *") PointerBuffer display_id) {
        if (CHECKS) {
            check(display_id, 1);
        }
        return neglQueryNativeDisplayNV(dpy, memAddress(display_id)) != 0;
    }

    // --- [ eglQueryNativeWindowNV ] ---

    /** {@code EGLBoolean eglQueryNativeWindowNV(EGLDisplay dpy, EGLSurface surf, EGLNativeWindowType * window)} */
    public static int neglQueryNativeWindowNV(long dpy, long surf, long window) {
        long __functionAddress = EGL.getCapabilities().eglQueryNativeWindowNV;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surf);
        }
        return callPPPI(dpy, surf, window, __functionAddress);
    }

    /** {@code EGLBoolean eglQueryNativeWindowNV(EGLDisplay dpy, EGLSurface surf, EGLNativeWindowType * window)} */
    @NativeType("EGLBoolean")
    public static boolean eglQueryNativeWindowNV(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surf, @NativeType("EGLNativeWindowType *") PointerBuffer window) {
        if (CHECKS) {
            check(window, 1);
        }
        return neglQueryNativeWindowNV(dpy, surf, memAddress(window)) != 0;
    }

    // --- [ eglQueryNativePixmapNV ] ---

    /** {@code EGLBoolean eglQueryNativePixmapNV(EGLDisplay dpy, EGLSurface surf, EGLNativePixmapType * pixmap)} */
    public static int neglQueryNativePixmapNV(long dpy, long surf, long pixmap) {
        long __functionAddress = EGL.getCapabilities().eglQueryNativePixmapNV;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surf);
        }
        return callPPPI(dpy, surf, pixmap, __functionAddress);
    }

    /** {@code EGLBoolean eglQueryNativePixmapNV(EGLDisplay dpy, EGLSurface surf, EGLNativePixmapType * pixmap)} */
    @NativeType("EGLBoolean")
    public static boolean eglQueryNativePixmapNV(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surf, @NativeType("EGLNativePixmapType *") PointerBuffer pixmap) {
        if (CHECKS) {
            check(pixmap, 1);
        }
        return neglQueryNativePixmapNV(dpy, surf, memAddress(pixmap)) != 0;
    }

}