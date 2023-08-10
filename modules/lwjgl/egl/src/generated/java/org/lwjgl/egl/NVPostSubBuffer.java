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
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/NV/EGL_NV_post_sub_buffer.txt">NV_post_sub_buffer</a> extension.
 * 
 * <p>Many EGL client APIs do not support rendering to window surfaces directly, so there is no way to efficiently make small updates to window surfaces.
 * Applications that need to perform many small updates must either use the back-buffer preservation flag which forces eglSwapBuffers to copy the entire
 * back surface, or redraw the entire back buffer on every update and hope eglSwapBuffers is implemented using buffer-flipping. This extension provides a
 * 3rd alternative: a function which posts a sub-rectangle of a window surface and preserves the back-buffer contents.</p>
 * 
 * <p>Requires {@link EGL11 EGL 1.1}.</p>
 */
public class NVPostSubBuffer {

    public static final int EGL_POST_SUB_BUFFER_SUPPORTED_NV = 0x30BE;

    protected NVPostSubBuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglPostSubBufferNV ] ---

    @NativeType("EGLBoolean")
    public static boolean eglPostSubBufferNV(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surface, @NativeType("EGLint") int x, @NativeType("EGLint") int y, @NativeType("EGLint") int width, @NativeType("EGLint") int height) {
        long __functionAddress = EGL.getCapabilities().eglPostSubBufferNV;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
        }
        return callPPI(dpy, surface, x, y, width, height, __functionAddress) != 0;
    }

}