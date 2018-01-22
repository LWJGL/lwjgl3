/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_texture_compression_s3tc = "EXTTextureCompressionS3TC".nativeClassGL("EXT_texture_compression_s3tc", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides additional texture compression functionality specific to S3's S3TC format (called DXTC in Microsoft's DirectX API), subject to
        all the requirements and limitations described by the extension ${ARB_texture_compression.link}.

        This extension supports DXT1, DXT3, and DXT5 texture compression formats. For the DXT1 image format, this specification supports an RGB-only mode and a
        special RGBA mode with single-bit "transparent" alpha.

        Requires ${ARB_texture_compression.link}.
        """

    IntConstant(
        """
        Accepted by the {@code internalformat} parameter of TexImage2D, CopyTexImage2D, and CompressedTexImage2D and the {@code format} parameter of
        CompressedTexSubImage2D.
        """,

        "COMPRESSED_RGB_S3TC_DXT1_EXT"..0x83F0,
        "COMPRESSED_RGBA_S3TC_DXT1_EXT"..0x83F1,
        "COMPRESSED_RGBA_S3TC_DXT3_EXT"..0x83F2,
        "COMPRESSED_RGBA_S3TC_DXT5_EXT"..0x83F3
    )
}