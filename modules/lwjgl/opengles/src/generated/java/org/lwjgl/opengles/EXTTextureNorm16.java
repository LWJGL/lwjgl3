/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_texture_norm16.txt">EXT_texture_norm16</a> extension.
 * 
 * <p>OpenGL ES 3.1 supports 8-bit (signed) normalized textures.</p>
 * 
 * <p>This extension provides a set of new 16 bit signed normalized and unsigned normalized fixed point texture, renderbuffer and texture buffer formats.</p>
 * 
 * <p>Requires {@link GLES31 GLES 3.1}.</p>
 */
public final class EXTTextureNorm16 {

    /**
     * Accepted by the {@code internalFormat} parameter of TexImage2D,TexImage3D, TexStorage2D, TexStorage3D and TexStorage2DMultisample,
     * TexStorage3DMultisampleOES, TexBufferEXT, TexBufferRangeEXT, TextureViewEXT, RenderbufferStorage and RenderbufferStorageMultisample.
     */
    public static final int
        GL_R16_EXT    = 0x822A,
        GL_RG16_EXT   = 0x822C,
        GL_RGBA16_EXT = 0x805B;

    /**
     * Accepted by the {@code internalFormat} parameter of TexImage2D,TexImage3D, TexStorage2D, TexStorage3D, TexStorage2DMultisample,
     * TexStorage3DMultisampleOES and TextureViewEXT.
     */
    public static final int
        GL_RGB16_EXT        = 0x8054,
        GL_R16_SNORM_EXT    = 0x8F98,
        GL_RG16_SNORM_EXT   = 0x8F99,
        GL_RGB16_SNORM_EXT  = 0x8F9A,
        GL_RGBA16_SNORM_EXT = 0x8F9B;

    private EXTTextureNorm16() {}

}