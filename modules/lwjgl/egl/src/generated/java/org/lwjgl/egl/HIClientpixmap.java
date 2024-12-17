/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class HIClientpixmap {

    public static final int EGL_CLIENT_PIXMAP_POINTER_HI = 0x8F74;

    protected HIClientpixmap() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglCreatePixmapSurfaceHI ] ---

    /** {@code EGLSurface eglCreatePixmapSurfaceHI(EGLDisplay dpy, EGLConfig config, struct EGLClientPixmapHI * pixmap)} */
    public static long neglCreatePixmapSurfaceHI(long dpy, long config, long pixmap) {
        long __functionAddress = EGL.getCapabilities().eglCreatePixmapSurfaceHI;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(config);
            EGLClientPixmapHI.validate(pixmap);
        }
        return callPPPP(dpy, config, pixmap, __functionAddress);
    }

    /** {@code EGLSurface eglCreatePixmapSurfaceHI(EGLDisplay dpy, EGLConfig config, struct EGLClientPixmapHI * pixmap)} */
    @NativeType("EGLSurface")
    public static long eglCreatePixmapSurfaceHI(@NativeType("EGLDisplay") long dpy, @NativeType("EGLConfig") long config, @NativeType("struct EGLClientPixmapHI *") EGLClientPixmapHI pixmap) {
        return neglCreatePixmapSurfaceHI(dpy, config, pixmap.address());
    }

}