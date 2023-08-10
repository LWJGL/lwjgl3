/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_texture_compression_s3tc.txt">NV_texture_compression_s3tc</a> extension.
 * 
 * <p>This extension adds support for S3's S3TC texture compression formats, including DXT1, DXT3, and DXT5. For the DXT1 format, this specification supports
 * an RGB-only mode and a special RGBA mode with single-bit alpha.</p>
 */
public final class NVTextureCompressionS3TC {

    /** Accepted by the {@code internalformat} parameter of CompressedTexImage2D and CompressedTexSubImage2D. */
    public static final int
        GL_COMPRESSED_RGB_S3TC_DXT1_NV  = 0x83F0,
        GL_COMPRESSED_RGBA_S3TC_DXT1_NV = 0x83F1,
        GL_COMPRESSED_RGBA_S3TC_DXT3_NV = 0x83F2,
        GL_COMPRESSED_RGBA_S3TC_DXT5_NV = 0x83F3;

    private NVTextureCompressionS3TC() {}

}