/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_compression_bptc.txt">ARB_texture_compression_bptc</a> extension.
 * 
 * <p>This extension provides additional texture compression functionality specific to the BPTC and BPTC_FLOAT compressed texture formats (called BC7 and BC6H
 * respectively in Microsoft's DirectX API), subject to all the requirements and limitations described by the extension {@link ARBTextureCompression ARB_texture_compression}.</p>
 * 
 * <p>Traditional block compression methods as typified by s3tc and latc compress a block of pixels into indicies along a gradient. This works well for smooth
 * images, but can have quality issues along sharp edges and strong chrominance transitions. To improve quality in these problematic cases, the BPTC
 * formats can divide each block into multiple partitions, each of which are compressed using an independent gradient.</p>
 * 
 * <p>In addition, it is desirable to directly support high dynamic range imagery in compressed formats, which is accomplished by the BPTC_FLOAT formats.</p>
 * 
 * <p>Requires {@link GL31 OpenGL 3.1} and {@link ARBTextureCompression ARB_texture_compression}.</p>
 */
public final class ARBTextureCompressionBPTC {

    /**
     * Accepted by the {@code internalformat} parameter of TexImage2D, TexImage3D, CopyTexImage2D, CopyTexImage3D, CompressedTexImage2DARB, and
     * CompressedTexImage3DARB and the {@code format} parameter of CompressedTexSubImage2DARB and CompressedTexSubImage3DARB.
     */
    public static final int
        GL_COMPRESSED_RGBA_BPTC_UNORM_ARB         = 0x8E8C,
        GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM_ARB   = 0x8E8D,
        GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT_ARB   = 0x8E8E,
        GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_ARB = 0x8E8F;

    private ARBTextureCompressionBPTC() {}

}