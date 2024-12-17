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

public class EXTImageDMABufImportModifiers {

    public static final int
        EGL_DMA_BUF_PLANE0_MODIFIER_LO_EXT = 0x3443,
        EGL_DMA_BUF_PLANE0_MODIFIER_HI_EXT = 0x3444,
        EGL_DMA_BUF_PLANE1_MODIFIER_LO_EXT = 0x3445,
        EGL_DMA_BUF_PLANE1_MODIFIER_HI_EXT = 0x3446,
        EGL_DMA_BUF_PLANE2_MODIFIER_LO_EXT = 0x3447,
        EGL_DMA_BUF_PLANE2_MODIFIER_HI_EXT = 0x3448,
        EGL_DMA_BUF_PLANE3_FD_EXT          = 0x3440,
        EGL_DMA_BUF_PLANE3_OFFSET_EXT      = 0x3441,
        EGL_DMA_BUF_PLANE3_PITCH_EXT       = 0x3442,
        EGL_DMA_BUF_PLANE3_MODIFIER_LO_EXT = 0x3449,
        EGL_DMA_BUF_PLANE3_MODIFIER_HI_EXT = 0x344A;

    protected EXTImageDMABufImportModifiers() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglQueryDmaBufFormatsEXT ] ---

    /** {@code EGLBoolean eglQueryDmaBufFormatsEXT(EGLDisplay dpy, EGLint max_formats, EGLint * formats, EGLint * num_formats)} */
    public static int neglQueryDmaBufFormatsEXT(long dpy, int max_formats, long formats, long num_formats) {
        long __functionAddress = EGL.getCapabilities().eglQueryDmaBufFormatsEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPPI(dpy, max_formats, formats, num_formats, __functionAddress);
    }

    /** {@code EGLBoolean eglQueryDmaBufFormatsEXT(EGLDisplay dpy, EGLint max_formats, EGLint * formats, EGLint * num_formats)} */
    @NativeType("EGLBoolean")
    public static boolean eglQueryDmaBufFormatsEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLint *") @Nullable IntBuffer formats, @NativeType("EGLint *") IntBuffer num_formats) {
        if (CHECKS) {
            check(num_formats, 1);
        }
        return neglQueryDmaBufFormatsEXT(dpy, remainingSafe(formats), memAddressSafe(formats), memAddress(num_formats)) != 0;
    }

    // --- [ eglQueryDmaBufModifiersEXT ] ---

    /** {@code EGLBoolean eglQueryDmaBufModifiersEXT(EGLDisplay dpy, EGLint format, EGLint max_modifiers, EGLuint64KHR * modifiers, EGLBoolean * external_only, EGLint * num_modifiers)} */
    public static int neglQueryDmaBufModifiersEXT(long dpy, int format, int max_modifiers, long modifiers, long external_only, long num_modifiers) {
        long __functionAddress = EGL.getCapabilities().eglQueryDmaBufModifiersEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPPPI(dpy, format, max_modifiers, modifiers, external_only, num_modifiers, __functionAddress);
    }

    /** {@code EGLBoolean eglQueryDmaBufModifiersEXT(EGLDisplay dpy, EGLint format, EGLint max_modifiers, EGLuint64KHR * modifiers, EGLBoolean * external_only, EGLint * num_modifiers)} */
    @NativeType("EGLBoolean")
    public static boolean eglQueryDmaBufModifiersEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLint") int format, @NativeType("EGLuint64KHR *") @Nullable LongBuffer modifiers, @NativeType("EGLBoolean *") @Nullable IntBuffer external_only, @NativeType("EGLint *") IntBuffer num_modifiers) {
        if (CHECKS) {
            checkSafe(external_only, remainingSafe(modifiers));
            check(num_modifiers, 1);
        }
        return neglQueryDmaBufModifiersEXT(dpy, format, remainingSafe(modifiers), memAddressSafe(modifiers), memAddressSafe(external_only), memAddress(num_modifiers)) != 0;
    }

    /** {@code EGLBoolean eglQueryDmaBufFormatsEXT(EGLDisplay dpy, EGLint max_formats, EGLint * formats, EGLint * num_formats)} */
    @NativeType("EGLBoolean")
    public static boolean eglQueryDmaBufFormatsEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLint *") int @Nullable [] formats, @NativeType("EGLint *") int[] num_formats) {
        long __functionAddress = EGL.getCapabilities().eglQueryDmaBufFormatsEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(num_formats, 1);
        }
        return callPPPI(dpy, lengthSafe(formats), formats, num_formats, __functionAddress) != 0;
    }

    /** {@code EGLBoolean eglQueryDmaBufModifiersEXT(EGLDisplay dpy, EGLint format, EGLint max_modifiers, EGLuint64KHR * modifiers, EGLBoolean * external_only, EGLint * num_modifiers)} */
    @NativeType("EGLBoolean")
    public static boolean eglQueryDmaBufModifiersEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLint") int format, @NativeType("EGLuint64KHR *") long @Nullable [] modifiers, @NativeType("EGLBoolean *") int @Nullable [] external_only, @NativeType("EGLint *") int[] num_modifiers) {
        long __functionAddress = EGL.getCapabilities().eglQueryDmaBufModifiersEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            checkSafe(external_only, lengthSafe(modifiers));
            check(num_modifiers, 1);
        }
        return callPPPPI(dpy, format, lengthSafe(modifiers), modifiers, external_only, num_modifiers, __functionAddress) != 0;
    }

}