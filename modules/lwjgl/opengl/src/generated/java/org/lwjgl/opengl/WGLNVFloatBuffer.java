/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_float_buffer.txt">WGL_NV_float_buffer</a> extension.
 * 
 * <p>WGL functionality for {@link NVFloatBuffer NV_float_buffer}.</p>
 */
public final class WGLNVFloatBuffer {

    /**
     * Accepted in the {@code piAttributes} array of wglGetPixelFormatAttribivARB and wglGetPixelFormatAttribfvARB and in the {@code piAttribIList} and
     * {@code pfAttribFList} arrays of wglChoosePixelFormatARB.
     */
    public static final int
        WGL_FLOAT_COMPONENTS_NV                     = 0x20B0,
        WGL_BIND_TO_TEXTURE_RECTANGLE_FLOAT_R_NV    = 0x20B1,
        WGL_BIND_TO_TEXTURE_RECTANGLE_FLOAT_RG_NV   = 0x20B2,
        WGL_BIND_TO_TEXTURE_RECTANGLE_FLOAT_RGB_NV  = 0x20B3,
        WGL_BIND_TO_TEXTURE_RECTANGLE_FLOAT_RGBA_NV = 0x20B4;

    /**
     * Accepted in the {@code piAttribIList} array of wglCreatePbufferARB and returned in the {@code value} parameter of wglQueryPbufferARB when
     * {@code iAttribute} is TEXTURE_FORMAT_ARB.
     */
    public static final int
        WGL_TEXTURE_FLOAT_R_NV    = 0x20B5,
        WGL_TEXTURE_FLOAT_RG_NV   = 0x20B6,
        WGL_TEXTURE_FLOAT_RGB_NV  = 0x20B7,
        WGL_TEXTURE_FLOAT_RGBA_NV = 0x20B8;

    private WGLNVFloatBuffer() {}

}