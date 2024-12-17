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

public class MESAImageDMABufExport {

    protected MESAImageDMABufExport() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglExportDMABUFImageQueryMESA ] ---

    /** {@code EGLBoolean eglExportDMABUFImageQueryMESA(EGLDisplay dpy, EGLImageKHR image, int * fourcc, int * num_planes, EGLuint64KHR * modifiers)} */
    public static int neglExportDMABUFImageQueryMESA(long dpy, long image, long fourcc, long num_planes, long modifiers) {
        long __functionAddress = EGL.getCapabilities().eglExportDMABUFImageQueryMESA;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(image);
        }
        return callPPPPPI(dpy, image, fourcc, num_planes, modifiers, __functionAddress);
    }

    /** {@code EGLBoolean eglExportDMABUFImageQueryMESA(EGLDisplay dpy, EGLImageKHR image, int * fourcc, int * num_planes, EGLuint64KHR * modifiers)} */
    @NativeType("EGLBoolean")
    public static boolean eglExportDMABUFImageQueryMESA(@NativeType("EGLDisplay") long dpy, @NativeType("EGLImageKHR") long image, @NativeType("int *") @Nullable IntBuffer fourcc, @NativeType("int *") @Nullable IntBuffer num_planes, @NativeType("EGLuint64KHR *") @Nullable LongBuffer modifiers) {
        if (CHECKS) {
            checkSafe(fourcc, 1);
            checkSafe(num_planes, 1);
            checkSafe(modifiers, 1);
        }
        return neglExportDMABUFImageQueryMESA(dpy, image, memAddressSafe(fourcc), memAddressSafe(num_planes), memAddressSafe(modifiers)) != 0;
    }

    // --- [ eglExportDMABUFImageMESA ] ---

    /** {@code EGLBoolean eglExportDMABUFImageMESA(EGLDisplay dpy, EGLImageKHR image, int * fds, EGLint * strides, EGLint * offsets)} */
    public static int neglExportDMABUFImageMESA(long dpy, long image, long fds, long strides, long offsets) {
        long __functionAddress = EGL.getCapabilities().eglExportDMABUFImageMESA;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(image);
        }
        return callPPPPPI(dpy, image, fds, strides, offsets, __functionAddress);
    }

    /** {@code EGLBoolean eglExportDMABUFImageMESA(EGLDisplay dpy, EGLImageKHR image, int * fds, EGLint * strides, EGLint * offsets)} */
    @NativeType("EGLBoolean")
    public static boolean eglExportDMABUFImageMESA(@NativeType("EGLDisplay") long dpy, @NativeType("EGLImageKHR") long image, @NativeType("int *") @Nullable IntBuffer fds, @NativeType("EGLint *") @Nullable IntBuffer strides, @NativeType("EGLint *") @Nullable IntBuffer offsets) {
        if (CHECKS) {
            checkSafe(fds, 1);
            checkSafe(strides, 1);
            checkSafe(offsets, 1);
        }
        return neglExportDMABUFImageMESA(dpy, image, memAddressSafe(fds), memAddressSafe(strides), memAddressSafe(offsets)) != 0;
    }

    /** {@code EGLBoolean eglExportDMABUFImageQueryMESA(EGLDisplay dpy, EGLImageKHR image, int * fourcc, int * num_planes, EGLuint64KHR * modifiers)} */
    @NativeType("EGLBoolean")
    public static boolean eglExportDMABUFImageQueryMESA(@NativeType("EGLDisplay") long dpy, @NativeType("EGLImageKHR") long image, @NativeType("int *") int @Nullable [] fourcc, @NativeType("int *") int @Nullable [] num_planes, @NativeType("EGLuint64KHR *") long @Nullable [] modifiers) {
        long __functionAddress = EGL.getCapabilities().eglExportDMABUFImageQueryMESA;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(image);
            checkSafe(fourcc, 1);
            checkSafe(num_planes, 1);
            checkSafe(modifiers, 1);
        }
        return callPPPPPI(dpy, image, fourcc, num_planes, modifiers, __functionAddress) != 0;
    }

    /** {@code EGLBoolean eglExportDMABUFImageMESA(EGLDisplay dpy, EGLImageKHR image, int * fds, EGLint * strides, EGLint * offsets)} */
    @NativeType("EGLBoolean")
    public static boolean eglExportDMABUFImageMESA(@NativeType("EGLDisplay") long dpy, @NativeType("EGLImageKHR") long image, @NativeType("int *") int @Nullable [] fds, @NativeType("EGLint *") int @Nullable [] strides, @NativeType("EGLint *") int @Nullable [] offsets) {
        long __functionAddress = EGL.getCapabilities().eglExportDMABUFImageMESA;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(image);
            checkSafe(fds, 1);
            checkSafe(strides, 1);
            checkSafe(offsets, 1);
        }
        return callPPPPPI(dpy, image, fds, strides, offsets, __functionAddress) != 0;
    }

}