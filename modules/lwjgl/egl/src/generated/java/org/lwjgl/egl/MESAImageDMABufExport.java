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
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/MESA/EGL_MESA_image_dma_buf_export.txt">MESA_image_dma_buf_export</a> extension.
 * 
 * <p>This extension provides entry points for integrating EGLImage with the dma-buf infrastructure. The extension allows creating a Linux dma_buf file
 * descriptor or multiple file descriptors, in the case of multi-plane YUV image, from an EGLImage.</p>
 * 
 * <p>It is designed to provide the complementary functionality to EGL_EXT_image_dma_buf_import.</p>
 * 
 * <p>Requires {@link EGL14 EGL 1.4} and {@link KHRImageBase KHR_image_base}. The EGL implementation must be running on a Linux kernel supporting the dma_buf buffer sharing
 * mechanism.</p>
 */
public class MESAImageDMABufExport {

    protected MESAImageDMABufExport() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglExportDMABUFImageQueryMESA ] ---

    public static int neglExportDMABUFImageQueryMESA(long dpy, long image, long fourcc, long num_planes, long modifiers) {
        long __functionAddress = EGL.getCapabilities().eglExportDMABUFImageQueryMESA;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(image);
        }
        return callPPPPPI(dpy, image, fourcc, num_planes, modifiers, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglExportDMABUFImageQueryMESA(@NativeType("EGLDisplay") long dpy, @NativeType("EGLImageKHR") long image, @Nullable @NativeType("int *") IntBuffer fourcc, @Nullable @NativeType("int *") IntBuffer num_planes, @Nullable @NativeType("EGLuint64KHR *") LongBuffer modifiers) {
        if (CHECKS) {
            checkSafe(fourcc, 1);
            checkSafe(num_planes, 1);
            checkSafe(modifiers, 1);
        }
        return neglExportDMABUFImageQueryMESA(dpy, image, memAddressSafe(fourcc), memAddressSafe(num_planes), memAddressSafe(modifiers)) != 0;
    }

    // --- [ eglExportDMABUFImageMESA ] ---

    public static int neglExportDMABUFImageMESA(long dpy, long image, long fds, long strides, long offsets) {
        long __functionAddress = EGL.getCapabilities().eglExportDMABUFImageMESA;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(image);
        }
        return callPPPPPI(dpy, image, fds, strides, offsets, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglExportDMABUFImageMESA(@NativeType("EGLDisplay") long dpy, @NativeType("EGLImageKHR") long image, @Nullable @NativeType("int *") IntBuffer fds, @Nullable @NativeType("EGLint *") IntBuffer strides, @Nullable @NativeType("EGLint *") IntBuffer offsets) {
        if (CHECKS) {
            checkSafe(fds, 1);
            checkSafe(strides, 1);
            checkSafe(offsets, 1);
        }
        return neglExportDMABUFImageMESA(dpy, image, memAddressSafe(fds), memAddressSafe(strides), memAddressSafe(offsets)) != 0;
    }

    /** Array version of: {@link #eglExportDMABUFImageQueryMESA ExportDMABUFImageQueryMESA} */
    @NativeType("EGLBoolean")
    public static boolean eglExportDMABUFImageQueryMESA(@NativeType("EGLDisplay") long dpy, @NativeType("EGLImageKHR") long image, @Nullable @NativeType("int *") int[] fourcc, @Nullable @NativeType("int *") int[] num_planes, @Nullable @NativeType("EGLuint64KHR *") long[] modifiers) {
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

    /** Array version of: {@link #eglExportDMABUFImageMESA ExportDMABUFImageMESA} */
    @NativeType("EGLBoolean")
    public static boolean eglExportDMABUFImageMESA(@NativeType("EGLDisplay") long dpy, @NativeType("EGLImageKHR") long image, @Nullable @NativeType("int *") int[] fds, @Nullable @NativeType("EGLint *") int[] strides, @Nullable @NativeType("EGLint *") int[] offsets) {
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