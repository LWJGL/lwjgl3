/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/KHR/EGL_KHR_gl_colorspace.txt">KHR_gl_colorspace</a> extension.
 * 
 * <p>Applications may wish to use sRGB format default framebuffers to more easily achieve sRGB rendering to display devices. This extension allows creating
 * EGLSurfaces which will be rendered to in sRGB by OpenGL contexts supporting that capability.</p>
 * 
 * <p>Requires {@link EGL14 EGL 1.4}.</p>
 */
public final class KHRGLColorspace {

    public static final int
        EGL_GL_COLORSPACE_KHR        = 0x309D,
        EGL_GL_COLORSPACE_SRGB_KHR   = 0x3089,
        EGL_GL_COLORSPACE_LINEAR_KHR = 0x308A;

    private KHRGLColorspace() {}

}