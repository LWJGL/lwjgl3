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
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_surface_compression.txt">EXT_surface_compression</a> extension.
 * 
 * <p>Applications may wish to take advantage of framebuffer compression. Some platforms may support framebuffer compression at fixed bitrates. Such
 * compression algorithms generally produce results that are visually lossless, but the results are typically not bit exact when compared to a
 * non-compressed result.</p>
 * 
 * <p>This extension enables applications to opt-in to fixed-rate compression for EGL window surfaces.</p>
 * 
 * <p>Compression may not be supported for all framebuffer formats. It can still be requested for all formats and applications can query what level of
 * compression was actually enabled.</p>
 */
public class EXTSurfaceCompression {

    /** New attributes accepted by the {@code attrib_list} argument of {@link EGL15#eglCreatePlatformWindowSurface CreatePlatformWindowSurface} and {@link EGL10#eglCreateWindowSurface CreateWindowSurface}. */
    public static final int
        EGL_SURFACE_COMPRESSION_EXT        = 0x34B0,
        EGL_SURFACE_COMPRESSION_PLANE1_EXT = 0x328E,
        EGL_SURFACE_COMPRESSION_PLANE2_EXT = 0x328F;

    /** Accepted as attribute values for {@link #EGL_SURFACE_COMPRESSION_EXT SURFACE_COMPRESSION_EXT} by {@link EGL15#eglCreatePlatformWindowSurface CreatePlatformWindowSurface} and {@link EGL10#eglCreateWindowSurface CreateWindowSurface}. */
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

    /** Unsafe version of: {@link #eglQuerySupportedCompressionRatesEXT QuerySupportedCompressionRatesEXT} */
    public static int neglQuerySupportedCompressionRatesEXT(long dpy, long config, long attrib_list, long rates, int rate_size, long num_rates) {
        long __functionAddress = EGL.getCapabilities().eglQuerySupportedCompressionRatesEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(config);
        }
        return callPPPPPI(dpy, config, attrib_list, rates, rate_size, num_rates, __functionAddress);
    }

    /**
     * Gets the list of all fixed-rate compression rates that are available on a specified display and {@code EGLConfig}.
     * 
     * <p>The number of rates is returned in {@code num_rates}, and elements 0 through {@code num_rates-1} of {@code rates} are filled in with the available
     * compression rates.</p>
     * 
     * <p>No more than {@code rate_size} compression rates will be returned even if more are available on the specified display and config. However, if
     * {@code eglQuerySupportedCompressionRatesEXT} is called with {@code rates = NULL}, then no rates are returned, but the total number of rates
     * available will be returned in {@code num_rates}.</p>
     * 
     * <p>The possible values returned in {@code rates} are the attribute values accepted for {@link #EGL_SURFACE_COMPRESSION_EXT SURFACE_COMPRESSION_EXT} by {@link EGL15#eglCreatePlatformWindowSurface CreatePlatformWindowSurface} and
     * {@link EGL10#eglCreateWindowSurface CreateWindowSurface}, except {@link #EGL_SURFACE_COMPRESSION_FIXED_RATE_NONE_EXT SURFACE_COMPRESSION_FIXED_RATE_NONE_EXT} and {@link #EGL_SURFACE_COMPRESSION_FIXED_RATE_DEFAULT_EXT SURFACE_COMPRESSION_FIXED_RATE_DEFAULT_EXT}.</p>
     *
     * @param attrib_list a list of attributes that will be provided when a surface is created with this combination of display and {@code EGLConfig}. The accepted
     *                    attributes are the same as for {@link EGL15#eglCreatePlatformWindowSurface CreatePlatformWindowSurface}.
     * @param rates       a pointer to a buffer containing {@code rate_size} elements.
     *
     * @return {@link EGL10#EGL_TRUE TRUE} on success.
     */
    @NativeType("EGLBoolean")
    public static boolean eglQuerySupportedCompressionRatesEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLConfig") long config, @Nullable @NativeType("EGLAttrib const *") PointerBuffer attrib_list, @Nullable @NativeType("EGLint *") IntBuffer rates, @NativeType("EGLint *") IntBuffer num_rates) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
            check(num_rates, 1);
        }
        return neglQuerySupportedCompressionRatesEXT(dpy, config, memAddressSafe(attrib_list), memAddressSafe(rates), remainingSafe(rates), memAddress(num_rates)) != 0;
    }

    /** Array version of: {@link #eglQuerySupportedCompressionRatesEXT QuerySupportedCompressionRatesEXT} */
    @NativeType("EGLBoolean")
    public static boolean eglQuerySupportedCompressionRatesEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLConfig") long config, @Nullable @NativeType("EGLAttrib const *") PointerBuffer attrib_list, @Nullable @NativeType("EGLint *") int[] rates, @NativeType("EGLint *") int[] num_rates) {
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