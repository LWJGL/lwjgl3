/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_texture_compression_s3tc.txt">EXT_texture_compression_s3tc</a> extension.
 * 
 * <p>This extension provides additional texture compression functionality specific to S3's S3TC format (called DXTC in Microsoft's DirectX API), subject to
 * all the requirements and limitations described by the extension {@link ARBTextureCompression ARB_texture_compression}.</p>
 * 
 * <p>This extension supports DXT1, DXT3, and DXT5 texture compression formats. For the DXT1 image format, this specification supports an RGB-only mode and a
 * special RGBA mode with single-bit "transparent" alpha.</p>
 * 
 * <p>Requires {@link ARBTextureCompression ARB_texture_compression}.</p>
 */
public final class EXTTextureCompressionS3TC {

    /**
     * Accepted by the {@code internalformat} parameter of TexImage2D, CopyTexImage2D, and CompressedTexImage2D and the {@code format} parameter of
     * CompressedTexSubImage2D.
     */
    public static final int
        GL_COMPRESSED_RGB_S3TC_DXT1_EXT  = 0x83F0,
        GL_COMPRESSED_RGBA_S3TC_DXT1_EXT = 0x83F1,
        GL_COMPRESSED_RGBA_S3TC_DXT3_EXT = 0x83F2,
        GL_COMPRESSED_RGBA_S3TC_DXT5_EXT = 0x83F3;

    private EXTTextureCompressionS3TC() {}

}