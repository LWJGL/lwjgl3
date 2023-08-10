/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_sRGB_formats.txt">NV_sRGB_formats</a> extension.
 * 
 * <p>This extension adds new uncompressed and compressed color texture formats with nonlinear sRGB color components.</p>
 * 
 * <p>Luminance and luminance alpha provide support for textures containing sRGB values with identical red, green, and blue components.</p>
 * 
 * <p>Compressed texture formats using S3TC and ETC1 compression algorithms are also added to provide compressed sRGB texture options.</p>
 * 
 * <p>Finally, sized variant of sRGB, sLuminace, and sLuminance_alpha are provided for immutable textures defined using the EXT_texture_storage extension.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0} and {@link EXTSRGB EXT_sRGB}.</p>
 */
public final class NVSRGBFormats {

    /**
     * Accepted by the {@code format} and {@code internalformat} parameter of TexImage2D, and TexImage3DNV. These are also accepted by {@code format} parameter
     * of TexSubImage2D and TexSubImage3DNV.
     */
    public static final int
        GL_SLUMINANCE_NV       = 0x8C46,
        GL_SLUMINANCE_ALPHA_NV = 0x8C44;

    /** Accepted by the {@code internalformat} parameter of RenderbufferStorage, TexStorage2DEXT, and TexStorage3DEXT. */
    public static final int GL_SRGB8_NV = 0x8C41;

    /** Accepted by the {@code internalformat} parameter of TexStorage2DEXT and TexStorage3DEXT. */
    public static final int
        GL_SLUMINANCE8_NV        = 0x8C47,
        GL_SLUMINANCE8_ALPHA8_NV = 0x8C45;

    /**
     * Accepted by the {@code internalformat} parameters of TexImage2D, TexImage3DNV, CompressedTexImage2D, and CompressedTexImage3DNV as well as the
     * {@code format} parameter of TexSubImage2D, TexSubImage3DNV, CompressedTexSubImage2D, and CompressedTexSubImage3DNV.
     */
    public static final int
        GL_COMPRESSED_SRGB_S3TC_DXT1_NV       = 0x8C4C,
        GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT1_NV = 0x8C4D,
        GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT3_NV = 0x8C4E,
        GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT5_NV = 0x8C4F;

    private NVSRGBFormats() {}

}