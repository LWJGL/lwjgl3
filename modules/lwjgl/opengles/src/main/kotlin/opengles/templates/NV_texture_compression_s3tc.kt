/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val NV_texture_compression_s3tc = "NVTextureCompressionS3TC".nativeClassGLES("NV_texture_compression_s3tc", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds support for S3's S3TC texture compression formats, including DXT1, DXT3, and DXT5. For the DXT1 format, this specification supports
        an RGB-only mode and a special RGBA mode with single-bit alpha.
        """

    IntConstant(
        "Accepted by the {@code internalformat} parameter of CompressedTexImage2D and CompressedTexSubImage2D.",

        "COMPRESSED_RGB_S3TC_DXT1_NV"..0x83F0,
        "COMPRESSED_RGBA_S3TC_DXT1_NV"..0x83F1,
        "COMPRESSED_RGBA_S3TC_DXT3_NV"..0x83F2,
        "COMPRESSED_RGBA_S3TC_DXT5_NV"..0x83F3
    )
}