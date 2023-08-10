/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ANGLE/ANGLE_depth_texture.txt">ANGLE_depth_texture</a> extension.
 * 
 * <p>This extension defines support for 2D depth and depth-stencil textures in an OpenGL ES implementation.</p>
 * 
 * <p>This extension incorporates the depth texturing functionality of OES_depth_texture and OES_packed_depth_stencil, but does not provide the ability to
 * load existing data via TexImage2D or TexSubImage2D. This extension also allows implementation variability in which components from a sampled depth
 * texture contain the depth data. Depth textures created with this extension only support 1 level.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public final class ANGLEDepthTexture {

    /** Accepted by the {@code format} parameter of TexImage2D and TexSubImage2D and {@code internalformat} parameter of TexImage2D. */
    public static final int GL_DEPTH_STENCIL_OES = 0x84F9;

    /** Accepted by the {@code type} parameter of TexImage2D, TexSubImage2D. */
    public static final int GL_UNSIGNED_INT_24_8_OES = 0x84FA;

    /** Accepted by the {@code internalformat} parameter of TexStorage2DEXT. */
    public static final int
        GL_DEPTH_COMPONENT32_OES = 0x81A7,
        GL_DEPTH24_STENCIL8_OES  = 0x88F0;

    private ANGLEDepthTexture() {}

}