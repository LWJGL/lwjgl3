/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ATI/WGL_ATI_render_texture_rectangle.txt">WGL_ATI_render_texture_rectangle</a> extension.
 * 
 * <p>This extension builds upon {@link WGLARBRenderTexture WGL_ARB_render_texture} and allows a pbuffer to be bound to a texture rectangle target.</p>
 * 
 * <p>Requires {@link WGLARBRenderTexture WGL_ARB_render_texture} and {@link ARBTextureRectangle ARB_texture_rectangle}.</p>
 */
public final class WGLATIRenderTextureRectangle {

    /**
     * Accepted as a value in the {@code piAttribList} parameter of wglCreatePbufferARB and returned in the value parameter of wglQueryPbufferARB when
     * {@code iAttribute} is WGL_TEXTURE_TARGET_ARB.
     */
    public static final int WGL_TEXTURE_RECTANGLE_ATI = 0x21A5;

    private WGLATIRenderTextureRectangle() {}

}