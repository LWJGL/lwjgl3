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

    /** {@code EGLImageKHR eglCreateDRMImageMESA(EGLDisplay dpy, EGLint const * attrib_list)} */
    public static long neglCreateDRMImageMESA(long dpy, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateDRMImageMESA;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPP(dpy, attrib_list, __functionAddress);
    }

    /** {@code EGLImageKHR eglCreateDRMImageMESA(EGLDisplay dpy, EGLint const * attrib_list)} */
    @NativeType("EGLImageKHR")
    public static long eglCreateDRMImageMESA(@NativeType("EGLDisplay") long dpy, @NativeType("EGLint const *") @Nullable IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglCreateDRMImageMESA(dpy, memAddressSafe(attrib_list));
    }

    // --- [ eglExportDRMImageMESA ] ---

    /** {@code EGLBoolean eglExportDRMImageMESA(EGLDisplay dpy, EGLImageKHR image, EGLint * name, EGLint * handle, EGLint * stride)} */
    public static int neglExportDRMImageMESA(long dpy, long image, long name, long handle, long stride) {
        long __functionAddress = EGL.getCapabilities().eglExportDRMImageMESA;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(image);
        }
        return callPPPPPI(dpy, image, name, handle, stride, __functionAddress);
    }

    /** {@code EGLBoolean eglExportDRMImageMESA(EGLDisplay dpy, EGLImageKHR image, EGLint * name, EGLint * handle, EGLint * stride)} */
    @NativeType("EGLBoolean")
    public static boolean eglExportDRMImageMESA(@NativeType("EGLDisplay") long dpy, @NativeType("EGLImageKHR") long image, @NativeType("EGLint *") @Nullable IntBuffer name, @NativeType("EGLint *") @Nullable IntBuffer handle, @NativeType("EGLint *") @Nullable IntBuffer stride) {
        if (CHECKS) {
            checkSafe(name, 1);
            checkSafe(handle, 1);
            checkSafe(stride, 1);
        }
        return neglExportDRMImageMESA(dpy, image, memAddressSafe(name), memAddressSafe(handle), memAddressSafe(stride)) != 0;
    }

    /** {@code EGLImageKHR eglCreateDRMImageMESA(EGLDisplay dpy, EGLint const * attrib_list)} */
    @NativeType("EGLImageKHR")
    public static long eglCreateDRMImageMESA(@NativeType("EGLDisplay") long dpy, @NativeType("EGLint const *") int @Nullable [] attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglCreateDRMImageMESA;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return callPPP(dpy, attrib_list, __functionAddress);
    }

    /** {@code EGLBoolean eglExportDRMImageMESA(EGLDisplay dpy, EGLImageKHR image, EGLint * name, EGLint * handle, EGLint * stride)} */
    @NativeType("EGLBoolean")
    public static boolean eglExportDRMImageMESA(@NativeType("EGLDisplay") long dpy, @NativeType("EGLImageKHR") long image, @NativeType("EGLint *") int @Nullable [] name, @NativeType("EGLint *") int @Nullable [] handle, @NativeType("EGLint *") int @Nullable [] stride) {
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