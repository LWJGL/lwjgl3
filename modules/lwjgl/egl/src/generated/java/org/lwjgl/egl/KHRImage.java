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

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/KHR/EGL_KHR_image.txt">KHR_image</a> extension.
 * 
 * <p>This extension defines a new EGL resource type that is suitable for sharing 2D arrays of image data between client APIs, the EGLImage, and allows
 * creating EGLImages from EGL native pixmaps.</p>
 * 
 * <p>Requires {@link EGL12 EGL 1.2}.</p>
 */
public class KHRImage {

    public static final int EGL_NATIVE_PIXMAP_KHR = 0x30B0;

    public static final long EGL_NO_IMAGE_KHR = 0x0L;

    protected KHRImage() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglCreateImageKHR ] ---

    public static long neglCreateImageKHR(long dpy, long ctx, int target, long buffer, long attrib_list) {
        return KHRImageBase.neglCreateImageKHR(dpy, ctx, target, buffer, attrib_list);
    }

    @NativeType("EGLImageKHR")
    public static long eglCreateImageKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLContext") long ctx, @NativeType("EGLenum") int target, @NativeType("EGLClientBuffer") long buffer, @Nullable @NativeType("EGLint const *") IntBuffer attrib_list) {
        return KHRImageBase.eglCreateImageKHR(dpy, ctx, target, buffer, attrib_list);
    }

    // --- [ eglDestroyImageKHR ] ---

    @NativeType("EGLBoolean")
    public static boolean eglDestroyImageKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLImageKHR") long image) {
        return KHRImageBase.eglDestroyImageKHR(dpy, image);
    }

    /** Array version of: {@link #eglCreateImageKHR CreateImageKHR} */
    @NativeType("EGLImageKHR")
    public static long eglCreateImageKHR(@NativeType("EGLDisplay") long dpy, @NativeType("EGLContext") long ctx, @NativeType("EGLenum") int target, @NativeType("EGLClientBuffer") long buffer, @Nullable @NativeType("EGLint const *") int[] attrib_list) {
        return KHRImageBase.eglCreateImageKHR(dpy, ctx, target, buffer, attrib_list);
    }

}