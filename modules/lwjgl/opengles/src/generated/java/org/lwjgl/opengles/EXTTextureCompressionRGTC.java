/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_texture_compression_rgtc.txt">EXT_texture_compression_rgtc</a> extension.
 * 
 * <p>This extension introduces four new block-based texture compression formats suited for unsigned and signed red and red-green textures (hence the name
 * "rgtc" for Red-Green Texture Compression).</p>
 * 
 * <p>These formats are designed to reduce the storage requirements and memory bandwidth required for red and red-green textures by a factor of 2-to-1 over
 * conventional uncompressed luminance and luminance-alpha textures with 8-bit components ({@link EXTTextureStorage#GL_LUMINANCE8_EXT LUMINANCE8_EXT} and {@link EXTTextureStorage#GL_LUMINANCE8_ALPHA8_EXT LUMINANCE8_ALPHA8_EXT}).</p>
 * 
 * <p>The compressed signed red-green format is reasonably suited for storing compressed normal maps.</p>
 * 
 * <p>This extension uses the same compression format as the EXT_texture_compression_latc extension except the color data is stored in the red and green
 * components rather than luminance and alpha. Representing compressed red and green components is consistent with the BC4 and BC5 compressed formats
 * supported by DirectX 10.</p>
 * 
 * <p>Requires {@link GLES30 GLES 3.0}.</p>
 */
public final class EXTTextureCompressionRGTC {

    /**
     * Accepted by the {@code internalFormat} parameter of {@link GLES20#glTexImage2D TexImage2D}, {@link GLES30#glTexStorage2D TexStorage2D}, and {@link GLES20#glCompressedTexImage2D CompressedTexImage2D} and the {@code format} parameter of
     * {@link GLES20#glCompressedTexSubImage2D CompressedTexSubImage2D}.
     */
    public static final int
        GL_COMPRESSED_RED_RGTC1_EXT              = 0x8DBB,
        GL_COMPRESSED_SIGNED_RED_RGTC1_EXT       = 0x8DBC,
        GL_COMPRESSED_RED_GREEN_RGTC2_EXT        = 0x8DBD,
        GL_COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT = 0x8DBE;

    private EXTTextureCompressionRGTC() {}

}