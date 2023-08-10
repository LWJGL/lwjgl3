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
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/HI/EGL_HI_clientpixmap.txt">HI_clientpixmap</a> extension.
 * 
 * <p>This extension provides a mechanism for using memory allocated by the application as a color-buffer.</p>
 */
public class HIClientpixmap {

    public static final int EGL_CLIENT_PIXMAP_POINTER_HI = 0x8F74;

    protected HIClientpixmap() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglCreatePixmapSurfaceHI ] ---

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

    @NativeType("EGLSurface")
    public static long eglCreatePixmapSurfaceHI(@NativeType("EGLDisplay") long dpy, @NativeType("EGLConfig") long config, @NativeType("struct EGLClientPixmapHI *") EGLClientPixmapHI pixmap) {
        return neglCreatePixmapSurfaceHI(dpy, config, pixmap.address());
    }

}