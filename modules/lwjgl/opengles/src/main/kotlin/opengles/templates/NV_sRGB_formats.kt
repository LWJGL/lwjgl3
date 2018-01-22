/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val NV_sRGB_formats = "NVSRGBFormats".nativeClassGLES("NV_sRGB_formats", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds new uncompressed and compressed color texture formats with nonlinear sRGB color components.

        Luminance and luminance alpha provide support for textures containing sRGB values with identical red, green, and blue components.

        Compressed texture formats using S3TC and ETC1 compression algorithms are also added to provide compressed sRGB texture options.

        Finally, sized variant of sRGB, sLuminace, and sLuminance_alpha are provided for immutable textures defined using the EXT_texture_storage extension.

        Requires ${GLES20.core} and ${EXT_sRGB.link}.
        """

    IntConstant(
        """
        Accepted by the {@code format} and {@code internalformat} parameter of TexImage2D, and TexImage3DNV. These are also accepted by {@code format} parameter
        of TexSubImage2D and TexSubImage3DNV.
        """,

        "SLUMINANCE_NV"..0x8C46,
        "SLUMINANCE_ALPHA_NV"..0x8C44
    )

    IntConstant(
        "Accepted by the {@code internalformat} parameter of RenderbufferStorage, TexStorage2DEXT, and TexStorage3DEXT.",

        "SRGB8_NV"..0x8C41
    )

    IntConstant(
        "Accepted by the {@code internalformat} parameter of TexStorage2DEXT and TexStorage3DEXT.",

        "SLUMINANCE8_NV"..0x8C47,
        "SLUMINANCE8_ALPHA8_NV"..0x8C45
    )

    IntConstant(
        """
        Accepted by the {@code internalformat} parameters of TexImage2D, TexImage3DNV, CompressedTexImage2D, and CompressedTexImage3DNV as well as the
        {@code format} parameter of TexSubImage2D, TexSubImage3DNV, CompressedTexSubImage2D, and CompressedTexSubImage3DNV.
        """,

        "COMPRESSED_SRGB_S3TC_DXT1_NV"..0x8C4C,
        "COMPRESSED_SRGB_ALPHA_S3TC_DXT1_NV"..0x8C4D,
        "COMPRESSED_SRGB_ALPHA_S3TC_DXT3_NV"..0x8C4E,
        "COMPRESSED_SRGB_ALPHA_S3TC_DXT5_NV"..0x8C4F
    )
}