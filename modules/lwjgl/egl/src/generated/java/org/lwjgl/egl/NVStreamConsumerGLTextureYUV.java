/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.jspecify.annotations.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class NVStreamConsumerGLTextureYUV {

    public static final int
        EGL_YUV_PLANE0_TEXTURE_UNIT_NV = 0x332C,
        EGL_YUV_PLANE1_TEXTURE_UNIT_NV = 0x332D,
        EGL_YUV_PLANE2_TEXTURE_UNIT_NV = 0x332E;

    public static final int EGL_YUV_NUMBER_OF_PLANES_EXT = 0x3311;

    public static final int EGL_YUV_BUFFER_EXT = 0x3300;

    protected NVStreamConsumerGLTextureYUV() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglStreamConsumerGLTextureExternalAttribsNV ] ---

    /** {@code EGLBoolean eglStreamConsumerGLTextureExternalAttribsNV(EGLDisplay dpy, EGLStreamKHR stream, EGLAttrib const * attrib_list)} */
    public static int neglStreamConsumerGLTextureExternalAttribsNV(long dpy, long stream, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglStreamConsumerGLTextureExternalAttribsNV;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(stream);
        }
        return callPPPI(dpy, stream, attrib_list, __functionAddress);
    }

    /** {@code EGLBoolean eglStreamConsumerGLTextureExternalAttribsNV(EGLDisplay dpy, EGLStreamKHR stream, EGLAttrib const * attrib_list)} */
    @NativeType("EGLBoolean")
    public static boolean eglStreamConsumerGLTextureExternalAttribsNV(@NativeType("EGLDisplay") long dpy, @NativeType("EGLStreamKHR") long stream, @NativeType("EGLAttrib const *") @Nullable PointerBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglStreamConsumerGLTextureExternalAttribsNV(dpy, stream, memAddressSafe(attrib_list)) != 0;
    }

}