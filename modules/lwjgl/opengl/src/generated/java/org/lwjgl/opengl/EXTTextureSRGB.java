/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_texture_sRGB.txt">EXT_texture_sRGB</a> extension.
 * 
 * <p>Conventional texture formats assume a linear color space.  So for a conventional internal texture format such as GL_RGB8, the 256 discrete values for
 * each 8-bit color component map linearly and uniformly to the [0,1] range.</p>
 * 
 * <p>The sRGB color space is based on typical (non-linear) monitor characteristics expected in a dimly lit office.  It has been standardized by the
 * International Electrotechnical Commission (IEC) as IEC 61966-2-1. The sRGB color space roughly corresponds to 2.2 gamma correction.</p>
 * 
 * <p>This extension adds a few new uncompressed and compressed color texture formats with sRGB color components.</p>
 * 
 * <p>Promoted to core in {@link GL21 OpenGL 2.1}.</p>
 */
public final class EXTTextureSRGB {

    /** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D. */
    public static final int
        GL_SRGB_EXT                        = 0x8C40,
        GL_SRGB8_EXT                       = 0x8C41,
        GL_SRGB_ALPHA_EXT                  = 0x8C42,
        GL_SRGB8_ALPHA8_EXT                = 0x8C43,
        GL_SLUMINANCE_ALPHA_EXT            = 0x8C44,
        GL_SLUMINANCE8_ALPHA8_EXT          = 0x8C45,
        GL_SLUMINANCE_EXT                  = 0x8C46,
        GL_SLUMINANCE8_EXT                 = 0x8C47,
        GL_COMPRESSED_SRGB_EXT             = 0x8C48,
        GL_COMPRESSED_SRGB_ALPHA_EXT       = 0x8C49,
        GL_COMPRESSED_SLUMINANCE_EXT       = 0x8C4A,
        GL_COMPRESSED_SLUMINANCE_ALPHA_EXT = 0x8C4B;

    /**
     * Accepted by the {@code internalformat} parameter of TexImage2D, CopyTexImage2D, and CompressedTexImage2DARB and the {@code format} parameter of
     * CompressedTexSubImage2DARB.
     */
    public static final int
        GL_COMPRESSED_SRGB_S3TC_DXT1_EXT       = 0x8C4C,
        GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT = 0x8C4D,
        GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT = 0x8C4E,
        GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT = 0x8C4F;

    private EXTTextureSRGB() {}

}