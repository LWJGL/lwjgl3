/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_texture_compression_s3tc_srgb = "EXTTextureCompressionS3TCSRGB".nativeClassGLES("EXT_texture_compression_s3tc_srgb", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds new compressed color texture formats using S3TC with nonlinear sRGB color components.
        """

    IntConstant(
        """
        In extended OpenGL ES 2 these new tokens are accepted by the {@code internalformat} parameter of TexImage2D, CompressedTexImage2D, TexStorage2DEXT,
        TextureStorage2DEXT and the {@code format} parameter of CompressedTexSubImage2D.

        In extended OpenGL ES 3 these new tokens are also accepted by the {@code internalformat} parameter of TexImage2D, TexImage3D, CompressedTexImage3D,
        TexStorage2D, TexStorage3D, TexStorage3DEXT, TextureStorage3DEXT and the {@code format} parameter of CompressedTexSubImage3D..
        """,

        "COMPRESSED_SRGB_S3TC_DXT1_EXT"..0x8C4C,
        "COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT"..0x8C4D,
        "COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT"..0x8C4E,
        "COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT"..0x8C4F
    )
}