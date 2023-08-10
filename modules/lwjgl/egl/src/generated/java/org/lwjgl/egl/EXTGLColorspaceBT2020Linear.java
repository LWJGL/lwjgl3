/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_gl_colorspace_bt2020_linear.txt">EXT_gl_colorspace_bt2020_linear</a> extension.
 * 
 * <p>Applications may wish to take advantage of a larger color gamut in the BT.2020 (ITU-R Recommendation BT.2020) color space. These extensions allow
 * applications to do so by communicating to the platform the color space the framebuffer data is in, i.e. BT.2020 color space, as well as the encoding of
 * the framebuffer data, which can be either linear or PQ (Dolby Perceptual Quantizer - SMPTE ST 2084) encoding. Applications are expected to prepare the
 * framebuffer data properly.</p>
 * 
 * <p>Requires {@link KHRGLColorspace KHR_gl_colorspace}.</p>
 */
public final class EXTGLColorspaceBT2020Linear {

    /** Accepted as attribute values for {@link EGL15#EGL_GL_COLORSPACE GL_COLORSPACE} by {@link EGL10#eglCreateWindowSurface CreateWindowSurface}, {@link EGL10#eglCreatePbufferSurface CreatePbufferSurface} and {@link EGL10#eglCreatePixmapSurface CreatePixmapSurface}. */
    public static final int EGL_GL_COLORSPACE_BT2020_LINEAR_EXT = 0x333F;

    private EXTGLColorspaceBT2020Linear() {}

}