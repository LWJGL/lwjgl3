/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_texture_compression_s3tc.txt">EXT_texture_compression_s3tc</a> extension.
 * 
 * <p>This extension provides additional texture compression functionality specific to S3's S3TC format (called DXTC in Microsoft's DirectX API), subject to
 * all the requirements and limitations described by the extension GL_ARB_texture_compression.</p>
 * 
 * <p>This extension supports DXT1, DXT3, and DXT5 texture compression formats. For the DXT1 image format, this specification supports an RGB-only mode and a
 * special RGBA mode with single-bit "transparent" alpha.</p>
 */
public final class EXTTextureCompressionS3TC {

    /**
     * In extended OpenGL ES 2.0.25 these new tokens are accepted by the {@code internalformat} parameter of TexImage2D, CompressedTexImage2D and the
     * {@code format} parameter of CompressedTexSubImage2D. In extended OpenGL ES 3.0.2 these new tokens are also accepted by the {@code internalformat}
     * parameter of TexImage3D, CompressedTexImage3D, TexStorage2D, TexStorage3D and the {@code format} parameter of CompressedTexSubImage3D.
     */
    public static final int
        GL_COMPRESSED_RGB_S3TC_DXT1_EXT  = 0x83F0,
        GL_COMPRESSED_RGBA_S3TC_DXT1_EXT = 0x83F1,
        GL_COMPRESSED_RGBA_S3TC_DXT3_EXT = 0x83F2,
        GL_COMPRESSED_RGBA_S3TC_DXT5_EXT = 0x83F3;

    private EXTTextureCompressionS3TC() {}

}