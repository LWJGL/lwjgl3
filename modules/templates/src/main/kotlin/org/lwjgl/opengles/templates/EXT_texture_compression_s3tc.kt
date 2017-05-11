/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_texture_compression_s3tc = "EXTTextureCompressionS3TC".nativeClassGLES("EXT_texture_compression_s3tc", postfix = EXT) {
    documentation =
        """
        Native bindings to the ${registryLink("EXT", "texture_compression_s3tc")} extension.

        This extension provides additional texture compression functionality specific to S3's S3TC format (called DXTC in Microsoft's DirectX API), subject to
        all the requirements and limitations described by the extension GL_ARB_texture_compression.

        This extension supports DXT1, DXT3, and DXT5 texture compression formats. For the DXT1 image format, this specification supports an RGB-only mode and a
        special RGBA mode with single-bit "transparent" alpha.
        """

    IntConstant(
        """
        In extended OpenGL ES 2.0.25 these new tokens are accepted by the {@code internalformat} parameter of TexImage2D, CompressedTexImage2D and the
        {@code format} parameter of CompressedTexSubImage2D. In extended OpenGL ES 3.0.2 these new tokens are also accepted by the {@code internalformat}
        parameter of TexImage3D, CompressedTexImage3D, TexStorage2D, TexStorage3D and the {@code format} parameter of CompressedTexSubImage3D.
        """,

        "COMPRESSED_RGB_S3TC_DXT1_EXT"..0x83F0,
        "COMPRESSED_RGBA_S3TC_DXT1_EXT"..0x83F1,
        "COMPRESSED_RGBA_S3TC_DXT3_EXT"..0x83F2,
        "COMPRESSED_RGBA_S3TC_DXT5_EXT"..0x83F3
    )
}