/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class WLCreateWaylandBufferFromImage {

    protected WLCreateWaylandBufferFromImage() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglCreateWaylandBufferFromImageWL ] ---

    /** {@code struct wl_buffer * eglCreateWaylandBufferFromImageWL(EGLDisplay dpy, EGLImageKHR image)} */
    @NativeType("struct wl_buffer *")
    public static long eglCreateWaylandBufferFromImageWL(@NativeType("EGLDisplay") long dpy, @NativeType("EGLImageKHR") long image) {
        long __functionAddress = EGL.getCapabilities().eglCreateWaylandBufferFromImageWL;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(image);
        }
        return callPPP(dpy, image, __functionAddress);
    }

}