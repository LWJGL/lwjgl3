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

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_swap_buffers_with_damage.txt">EXT_swap_buffers_with_damage</a> extension.
 * 
 * <p>This extension provides a means to issue a swap buffers request to display the contents of the current back buffer and also specify a list of damage
 * rectangles that can be passed to a system compositor so it can minimize how much it has to recompose.</p>
 * 
 * <p>This should be used in situations where an application is only animating a small portion of a surface since it enables the compositor to avoid wasting
 * time recomposing parts of the surface that haven't changed.</p>
 * 
 * <p>Requires {@link EGL14 EGL 1.4}.</p>
 */
public class EXTSwapBuffersWithDamage {

    protected EXTSwapBuffersWithDamage() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglSwapBuffersWithDamageEXT ] ---

    public static int neglSwapBuffersWithDamageEXT(long dpy, long surface, long rects, int n_rects) {
        long __functionAddress = EGL.getCapabilities().eglSwapBuffersWithDamageEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
        }
        return callPPPI(dpy, surface, rects, n_rects, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglSwapBuffersWithDamageEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surface, @NativeType("EGLint *") @Nullable IntBuffer rects) {
        return neglSwapBuffersWithDamageEXT(dpy, surface, memAddressSafe(rects), remainingSafe(rects)) != 0;
    }

    /** Array version of: {@link #eglSwapBuffersWithDamageEXT SwapBuffersWithDamageEXT} */
    @NativeType("EGLBoolean")
    public static boolean eglSwapBuffersWithDamageEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surface, @NativeType("EGLint *") int @Nullable [] rects) {
        long __functionAddress = EGL.getCapabilities().eglSwapBuffersWithDamageEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
        }
        return callPPPI(dpy, surface, rects, lengthSafe(rects), __functionAddress) != 0;
    }

}