/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_gl_colorspace_display_p3_passthrough.txt">EXT_gl_colorspace_display_p3_passthrough</a> extension.
 * 
 * <p>Applications that want to use the Display-P3 color space (DCI-P3 primaries with sRGB-like transfer function) can use this extension to communicate to
 * the platform that framebuffer contents represent colors in the non-linear Display-P3 color space.</p>
 * 
 * <p>The application is responsible for producing appropriate framebuffer contents. An application would want to use this extension rather than
 * {@link EXTGLColorspaceDisplayP3 EXT_gl_colorspace_display_p3} if they apply the sRGB transfer function themselves and do not need the HW to do it.</p>
 * 
 * <p>Requires {@link KHRGLColorspace KHR_gl_colorspace}.</p>
 */
public final class EXTGLColorspaceDisplayP3Passthrough {

    /** Accepted as attribute values for {@link EGL15#EGL_GL_COLORSPACE GL_COLORSPACE} by {@link EGL10#eglCreateWindowSurface CreateWindowSurface}, {@link EGL10#eglCreatePbufferSurface CreatePbufferSurface} and {@link EGL10#eglCreatePixmapSurface CreatePixmapSurface}. */
    public static final int EGL_GL_COLORSPACE_DISPLAY_P3_PASSTHROUGH_EXT = 0x3490;

    private EXTGLColorspaceDisplayP3Passthrough() {}

}