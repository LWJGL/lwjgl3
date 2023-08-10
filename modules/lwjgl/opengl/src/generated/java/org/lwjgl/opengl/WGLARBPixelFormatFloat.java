/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_color_buffer_float.txt">WGL_ARB_pixel_format_float</a> extension.
 * 
 * <p>This extension adds pixel formats with floating-point RGBA color components.</p>
 * 
 * <p>Requires {@link WGLARBPixelFormat WGL_ARB_pixel_format} and {@link GL15 OpenGL 1.5}.</p>
 */
public final class WGLARBPixelFormatFloat {

    /**
     * Accepted as a value in the {@code attribIList} parameter array of {@link WGLARBPixelFormat#wglChoosePixelFormatARB ChoosePixelFormatARB}, and returned in the {@code values}
     * parameter array of {@link WGLARBPixelFormat#wglGetPixelFormatAttribivARB GetPixelFormatAttribivARB}.
     */
    public static final int WGL_TYPE_RGBA_FLOAT_ARB = 0x21A0;

    private WGLARBPixelFormatFloat() {}

}