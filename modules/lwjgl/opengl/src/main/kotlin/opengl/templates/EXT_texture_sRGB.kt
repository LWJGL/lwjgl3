/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_texture_sRGB = "EXTTextureSRGB".nativeClassGL("EXT_texture_sRGB", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Conventional texture formats assume a linear color space.  So for a conventional internal texture format such as GL_RGB8, the 256 discrete values for
        each 8-bit color component map linearly and uniformly to the [0,1] range.

        The sRGB color space is based on typical (non-linear) monitor characteristics expected in a dimly lit office.  It has been standardized by the
        International Electrotechnical Commission (IEC) as IEC 61966-2-1. The sRGB color space roughly corresponds to 2.2 gamma correction.

        This extension adds a few new uncompressed and compressed color texture formats with sRGB color components.

        ${GL21.promoted}
        """

    IntConstant(
        "Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D.",

        "SRGB_EXT"..0x8C40,
        "SRGB8_EXT"..0x8C41,
        "SRGB_ALPHA_EXT"..0x8C42,
        "SRGB8_ALPHA8_EXT"..0x8C43,
        "SLUMINANCE_ALPHA_EXT"..0x8C44,
        "SLUMINANCE8_ALPHA8_EXT"..0x8C45,
        "SLUMINANCE_EXT"..0x8C46,
        "SLUMINANCE8_EXT"..0x8C47,
        "COMPRESSED_SRGB_EXT"..0x8C48,
        "COMPRESSED_SRGB_ALPHA_EXT"..0x8C49,
        "COMPRESSED_SLUMINANCE_EXT"..0x8C4A,
        "COMPRESSED_SLUMINANCE_ALPHA_EXT"..0x8C4B
    )

    IntConstant(
        """
        Accepted by the {@code internalformat} parameter of TexImage2D, CopyTexImage2D, and CompressedTexImage2DARB and the {@code format} parameter of
        CompressedTexSubImage2DARB.
        """,

        "COMPRESSED_SRGB_S3TC_DXT1_EXT"..0x8C4C,
        "COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT"..0x8C4D,
        "COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT"..0x8C4E,
        "COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT"..0x8C4F
    )
}