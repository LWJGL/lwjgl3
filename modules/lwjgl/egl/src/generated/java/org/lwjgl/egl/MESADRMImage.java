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
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/MESA/EGL_MESA_drm_image.txt">MESA_drm_image</a> extension.
 * 
 * <p>This extension provides entry points for integrating EGLImage with the Linux DRM mode setting and memory management drivers. The extension lets
 * applications create EGLImages without a client API resource and lets the application get the DRM buffer handles.</p>
 * 
 * <p>Requires {@link EGL14 EGL 1.4} and {@link KHRImageBase KHR_image_base}.</p>
 */
public class MESADRMImage {

    public static final int
        EGL_DRM_BUFFER_FORMAT_MESA        = 0x31D0,
        EGL_DRM_BUFFER_USE_MESA           = 0x31D1,
        EGL_DRM_BUFFER_FORMAT_ARGB32_MESA = 0x31D2,
        EGL_DRM_BUFFER_MESA               = 0x31D3,
        EGL_DRM_BUFFER_STRIDE_MESA        = 0x31D4,
        EGL_DRM_BUFFER_USE_SCANOUT_MESA   = 0x1,
        EGL_DRM_BUFFER_USE_SHARE_MESA     = 0x2;

    protected MESADRMImage() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglCreateDRMImageMESA ] ---

    public static long neglCreateDRMImageMESA(long dpy, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateDRMImageMESA;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPP(dpy, attrib_list, __functionAddress);
    }

    @NativeType("EGLImageKHR")
    public static long eglCreateDRMImageMESA(@NativeType("EGLDisplay") long dpy, @Nullable @NativeType("EGLint const *") IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglCreateDRMImageMESA(dpy, memAddressSafe(attrib_list));
    }

    // --- [ eglExportDRMImageMESA ] ---

    public static int neglExportDRMImageMESA(long dpy, long image, long name, long handle, long stride) {
        long __functionAddress = EGL.getCapabilities().eglExportDRMImageMESA;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(image);
        }
        return callPPPPPI(dpy, image, name, handle, stride, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglExportDRMImageMESA(@NativeType("EGLDisplay") long dpy, @NativeType("EGLImageKHR") long image, @Nullable @NativeType("EGLint *") IntBuffer name, @Nullable @NativeType("EGLint *") IntBuffer handle, @Nullable @NativeType("EGLint *") IntBuffer stride) {
        if (CHECKS) {
            checkSafe(name, 1);
            checkSafe(handle, 1);
            checkSafe(stride, 1);
        }
        return neglExportDRMImageMESA(dpy, image, memAddressSafe(name), memAddressSafe(handle), memAddressSafe(stride)) != 0;
    }

    /** Array version of: {@link #eglCreateDRMImageMESA CreateDRMImageMESA} */
    @NativeType("EGLImageKHR")
    public static long eglCreateDRMImageMESA(@NativeType("EGLDisplay") long dpy, @Nullable @NativeType("EGLint const *") int[] attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateDRMImageMESA;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return callPPP(dpy, attrib_list, __functionAddress);
    }

    /** Array version of: {@link #eglExportDRMImageMESA ExportDRMImageMESA} */
    @NativeType("EGLBoolean")
    public static boolean eglExportDRMImageMESA(@NativeType("EGLDisplay") long dpy, @NativeType("EGLImageKHR") long image, @Nullable @NativeType("EGLint *") int[] name, @Nullable @NativeType("EGLint *") int[] handle, @Nullable @NativeType("EGLint *") int[] stride) {
        long __functionAddress = EGL.getCapabilities().eglExportDRMImageMESA;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(image);
            checkSafe(name, 1);
            checkSafe(handle, 1);
            checkSafe(stride, 1);
        }
        return callPPPPPI(dpy, image, name, handle, stride, __functionAddress) != 0;
    }

}