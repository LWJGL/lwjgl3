/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_texture_compression_s3tc_srgb.txt">EXT_texture_compression_s3tc_srgb</a> extension.
 * 
 * <p>This extension adds new compressed color texture formats using S3TC with nonlinear sRGB color components.</p>
 */
public final class EXTTextureCompressionS3TCSRGB {

    /**
     * In extended OpenGL ES 2 these new tokens are accepted by the {@code internalformat} parameter of TexImage2D, CompressedTexImage2D, TexStorage2DEXT,
     * TextureStorage2DEXT and the {@code format} parameter of CompressedTexSubImage2D.
     * 
     * <p>In extended OpenGL ES 3 these new tokens are also accepted by the {@code internalformat} parameter of TexImage2D, TexImage3D, CompressedTexImage3D,
     * TexStorage2D, TexStorage3D, TexStorage3DEXT, TextureStorage3DEXT and the {@code format} parameter of CompressedTexSubImage3D..</p>
     */
    public static final int
        GL_COMPRESSED_SRGB_S3TC_DXT1_EXT       = 0x8C4C,
        GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT = 0x8C4D,
        GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT = 0x8C4E,
        GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT = 0x8C4F;

    private EXTTextureCompressionS3TCSRGB() {}

}