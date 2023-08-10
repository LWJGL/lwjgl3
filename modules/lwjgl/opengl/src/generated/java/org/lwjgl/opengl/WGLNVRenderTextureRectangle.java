/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/WGL_NV_render_texture_rectangle.txt">WGL_NV_render_texture_rectangle</a> extension.
 * 
 * <p>This extension allows a color buffer with non-power-of-two dimensions to be used for both rendering and texturing. It is built upon the
 * ARB_render_texture extension; the only addition in this extension is the ability to bind a texture to a texture rectangle target, as provided through
 * the NV_texture_rectangle extension.</p>
 */
public final class WGLNVRenderTextureRectangle {

    /**
     * Accepted by the {@code piAttributes} parameter of wglGetPixelFormatAttribivARB, wglGetPixelFormatAttribfvARB, and the {@code piAttribIList} and
     * {@code pfAttribIList} parameters of wglChoosePixelFormatARB.
     */
    public static final int
        WGL_BIND_TO_TEXTURE_RECTANGLE_RGB_NV  = 0x20A0,
        WGL_BIND_TO_TEXTURE_RECTANGLE_RGBA_NV = 0x20A1;

    /**
     * Accepted as a value in the {@code piAttribList} parameter of wglCreatePbufferARB and returned in the value parameter of wglQueryPbufferARB when
     * {@code iAttribute} is WGL_TEXTURE_TARGET_ARB.
     */
    public static final int WGL_TEXTURE_RECTANGLE_NV = 0x20A2;

    private WGLNVRenderTextureRectangle() {}

}