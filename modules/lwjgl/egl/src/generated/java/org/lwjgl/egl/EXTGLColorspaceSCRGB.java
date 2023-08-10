/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_gl_colorspace_scrgb.txt">EXT_gl_colorspace_scrgb</a> extension.
 * 
 * <p>This extension provides an extended sRGB (also called scRGB) color space option for applications to choose from when creating an {@code EGLSurface}.
 * This extension defines the non-linear display referred scRGB color space. It has the same white point and color primaries as sRGB, and thus is
 * backward-compatible with sRGB. Refer to the IEC 61966-2-2:2003 standard for details on scRGB color space.</p>
 * 
 * <p>This extension chooses to use floating-point formats for scRGB color space. For each color channel, the floating-point values of 0.0 and 1.0 still
 * correspond to sRGB chromaticities and luminance levels. However, scRGB space allows for color values beyond the range of {@code [0.0, 1.0]}, and can
 * thus achieve a larger color volume than that of sRGB. As it is display referred, scRGB space makes assumptions of how the floating-point color values
 * should map to luminance levels by the underlying display pipeline. The expected mapping is such that a color value of {@code (1.0, 1.0, 1.0)}
 * corresponds to a luminance level of 80 nits on a standardized studio monitor. As the color value per channel goes beyond 1.0 and up to ~7.83, the
 * corresponding luminance levels also increase to a maximum of 10000 nits.</p>
 * 
 * <p>The application is responsible for applying the sRGB transfer function to color values written to or read from a surface with a colorspace of
 * {@code EGL_EXT_gl_colorspace_scrgb}.</p>
 * 
 * <p>Requires {@link KHRGLColorspace KHR_gl_colorspace} and {@link EXTPixelFormatFloat EXT_pixel_format_float}.</p>
 */
public final class EXTGLColorspaceSCRGB {

    /** Accepted as attribute values for {@link EGL15#EGL_GL_COLORSPACE GL_COLORSPACE} by {@link EGL10#eglCreateWindowSurface CreateWindowSurface}, {@link EGL10#eglCreatePbufferSurface CreatePbufferSurface} and {@link EGL10#eglCreatePixmapSurface CreatePixmapSurface}. */
    public static final int EGL_GL_COLORSPACE_SCRGB_EXT = 0x3351;

    private EXTGLColorspaceSCRGB() {}

}