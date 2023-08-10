/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/WGL_EXT_colorspace.txt">WGL_EXT_colorspace</a> extension.
 * 
 * <p>Applications may wish to use sRGB format default framebuffers to more easily achieve sRGB rendering to display devices. This extension allows creating
 * pixel formats which will be rendered to in sRGB by OpenGL/ES contexts supporting that capability.</p>
 * 
 * <p>Requires {@link GL30 OpenGL 3.0}.</p>
 */
public final class WGLEXTColorspace {

    /** Accepted as an attribute name by {@link WGLARBPixelFormat#wglGetPixelFormatAttribivARB GetPixelFormatAttribivARB}, {@link WGLARBPixelFormat#wglGetPixelFormatAttribivARB GetPixelFormatAttribivARB} and {@link WGLARBPixelFormat#wglChoosePixelFormatARB ChoosePixelFormatARB}. */
    public static final int WGL_COLORSPACE_EXT = 0x309D;

    /** Accepted as attribute values for {@link #WGL_COLORSPACE_EXT COLORSPACE_EXT} by {@link WGLARBPixelFormat#wglGetPixelFormatAttribivARB GetPixelFormatAttribivARB}, {@link WGLARBPixelFormat#wglGetPixelFormatAttribivARB GetPixelFormatAttribivARB} and {@link WGLARBPixelFormat#wglChoosePixelFormatARB ChoosePixelFormatARB}. */
    public static final int
        WGL_COLORSPACE_SRGB_EXT   = 0x3089,
        WGL_COLORSPACE_LINEAR_EXT = 0x308A;

    private WGLEXTColorspace() {}

}