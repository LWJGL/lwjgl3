/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/KHR/EGL_KHR_lock_surface3.txt">KHR_lock_surface3</a> extension.
 * 
 * <p>This extension allows mapping color buffers of EGL surfaces into the client address space. This is useful primarily for software rendering on low-end
 * devices which do not support EGL client rendering APIs, although it may be implemented efficiently on more capable devices as well.</p>
 * 
 * <p>Requires {@link EGL14 EGL 1.4}.</p>
 */
public class KHRLockSurface3 {

    public static final int
        EGL_READ_SURFACE_BIT_KHR              = 0x1,
        EGL_WRITE_SURFACE_BIT_KHR             = 0x2,
        EGL_LOCK_SURFACE_BIT_KHR              = 0x80,
        EGL_OPTIMAL_FORMAT_BIT_KHR            = 0x100,
        EGL_MATCH_FORMAT_KHR                  = 0x3043,
        EGL_FORMAT_RGB_565_EXACT_KHR          = 0x30C0,
        EGL_FORMAT_RGB_565_KHR                = 0x30C1,
        EGL_FORMAT_RGBA_8888_EXACT_KHR        = 0x30C2,
        EGL_FORMAT_RGBA_8888_KHR              = 0x30C3,
        EGL_MAP_PRESERVE_PIXELS_KHR           = 0x30C4,
        EGL_LOCK_USAGE_HINT_KHR               = 0x30C5,
        EGL_BITMAP_PITCH_KHR                  = 0x30C7,
        EGL_BITMAP_ORIGIN_KHR                 = 0x30C8,
        EGL_BITMAP_PIXEL_RED_OFFSET_KHR       = 0x30C9,
        EGL_BITMAP_PIXEL_GREEN_OFFSET_KHR     = 0x30CA,
        EGL_BITMAP_PIXEL_BLUE_OFFSET_KHR      = 0x30CB,
        EGL_BITMAP_PIXEL_ALPHA_OFFSET_KHR     = 0x30CC,
        EGL_BITMAP_PIXEL_LUMINANCE_OFFSET_KHR = 0x30CD,
        EGL_BITMAP_PIXEL_SIZE_KHR             = 0x3110,
        EGL_BITMAP_POINTER_KHR                = 0x30C6,
        EGL_LOWER_LEFT_KHR                    = 0x30CE,
        EGL_UPPER_LEFT_KHR                    = 0x30CF;

    protected KHRLockSurface3() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglLockSurfaceKHR ] ---

    public static int neglLockSurfaceKHR(long dpy, long surface, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglLockSurfaceKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
        }
        return callPPPI(dpy, surface, attrib_list, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglLockSurfaceKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surface, @Nullable @NativeType("EGLint const *") IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglLockSurfaceKHR(dpy, surface, memAddressSafe(attrib_list)) != 0;
    }

    // --- [ eglUnlockSurfaceKHR ] ---

    @NativeType("EGLBoolean")
    public static boolean eglUnlockSurfaceKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surface) {
        long __functionAddress = EGL.getCapabilities().eglUnlockSurfaceKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
        }
        return callPPI(dpy, surface, __functionAddress) != 0;
    }

    // --- [ eglQuerySurface64KHR ] ---

    public static int neglQuerySurface64KHR(long dpy, long surface, int attribute, long value) {
        long __functionAddress = EGL.getCapabilities().eglQuerySurface64KHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
        }
        return callPPPI(dpy, surface, attribute, value, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglQuerySurface64KHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surface, @NativeType("EGLint") int attribute, @NativeType("EGLAttribKHR *") PointerBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return neglQuerySurface64KHR(dpy, surface, attribute, memAddress(value)) != 0;
    }

    /** Array version of: {@link #eglLockSurfaceKHR LockSurfaceKHR} */
    @NativeType("EGLBoolean")
    public static boolean eglLockSurfaceKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSurface") long surface, @Nullable @NativeType("EGLint const *") int[] attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglLockSurfaceKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(surface);
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return callPPPI(dpy, surface, attrib_list, __functionAddress) != 0;
    }

}