/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTSurfaceCompression {

    public static final int
        EGL_SURFACE_COMPRESSION_EXT        = 0x34B0,
        EGL_SURFACE_COMPRESSION_PLANE1_EXT = 0x328E,
        EGL_SURFACE_COMPRESSION_PLANE2_EXT = 0x328F;

    public static final int
        EGL_SURFACE_COMPRESSION_FIXED_RATE_NONE_EXT    = 0x34B1,
        EGL_SURFACE_COMPRESSION_FIXED_RATE_DEFAULT_EXT = 0x34B2,
        EGL_SURFACE_COMPRESSION_FIXED_RATE_1BPC_EXT    = 0x34B4,
        EGL_SURFACE_COMPRESSION_FIXED_RATE_2BPC_EXT    = 0x34B5,
        EGL_SURFACE_COMPRESSION_FIXED_RATE_3BPC_EXT    = 0x34B6,
        EGL_SURFACE_COMPRESSION_FIXED_RATE_4BPC_EXT    = 0x34B7,
        EGL_SURFACE_COMPRESSION_FIXED_RATE_5BPC_EXT    = 0x34B8,
        EGL_SURFACE_COMPRESSION_FIXED_RATE_6BPC_EXT    = 0x34B9,
        EGL_SURFACE_COMPRESSION_FIXED_RATE_7BPC_EXT    = 0x34BA,
        EGL_SURFACE_COMPRESSION_FIXED_RATE_8BPC_EXT    = 0x34BB,
        EGL_SURFACE_COMPRESSION_FIXED_RATE_9BPC_EXT    = 0x34BC,
        EGL_SURFACE_COMPRESSION_FIXED_RATE_10BPC_EXT   = 0x34BD,
        EGL_SURFACE_COMPRESSION_FIXED_RATE_11BPC_EXT   = 0x34BE,
        EGL_SURFACE_COMPRESSION_FIXED_RATE_12BPC_EXT   = 0x34BF;

    protected EXTSurfaceCompression() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglQuerySupportedCompressionRatesEXT ] ---

    /** {@code EGLBoolean eglQuerySupportedCompressionRatesEXT(EGLDisplay dpy, EGLConfig config, EGLAttrib const * attrib_list, EGLint * rates, EGLint rate_size, EGLint * num_rates)} */
    public static int neglQuerySupportedCompressionRatesEXT(long dpy, long config, long attrib_list, long rates, int rate_size, long num_rates) {
        long __functionAddress = EGL.getCapabilities().eglQuerySupportedCompressionRatesEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(config);
        }
        return callPPPPPI(dpy, config, attrib_list, rates, rate_size, num_rates, __functionAddress);
    }

    /** {@code EGLBoolean eglQuerySupportedCompressionRatesEXT(EGLDisplay dpy, EGLConfig config, EGLAttrib const * attrib_list, EGLint * rates, EGLint rate_size, EGLint * num_rates)} */
    @NativeType("EGLBoolean")
    public static boolean eglQuerySupportedCompressionRatesEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLConfig") long config, @NativeType("EGLAttrib const *") @Nullable PointerBuffer attrib_list, @NativeType("EGLint *") @Nullable IntBuffer rates, @NativeType("EGLint *") IntBuffer num_rates) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
            check(num_rates, 1);
        }
        return neglQuerySupportedCompressionRatesEXT(dpy, config, memAddressSafe(attrib_list), memAddressSafe(rates), remainingSafe(rates), memAddress(num_rates)) != 0;
    }

    /** {@code EGLBoolean eglQuerySupportedCompressionRatesEXT(EGLDisplay dpy, EGLConfig config, EGLAttrib const * attrib_list, EGLint * rates, EGLint rate_size, EGLint * num_rates)} */
    @NativeType("EGLBoolean")
    public static boolean eglQuerySupportedCompressionRatesEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLConfig") long config, @NativeType("EGLAttrib const *") @Nullable PointerBuffer attrib_list, @NativeType("EGLint *") int @Nullable [] rates, @NativeType("EGLint *") int[] num_rates) {
        long __functionAddress = EGL.getCapabilities().eglQuerySupportedCompressionRatesEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(config);
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
            check(num_rates, 1);
        }
        return callPPPPPI(dpy, config, memAddressSafe(attrib_list), rates, lengthSafe(rates), num_rates, __functionAddress) != 0;
    }

}