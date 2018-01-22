/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_texture_compression_latc = "EXTTextureCompressionLATC".nativeClassGL("EXT_texture_compression_latc", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension introduces four new block-based texture compression formats suited for unsigned and signed luminance and luminance-alpha textures (hence
        the name "latc" for Luminance-Alpha Texture Compression).

        These formats are designed to reduce the storage requirements and memory bandwidth required for luminance and luminance-alpha textures by a factor of
        2-to-1 over conventional uncompressed luminance and luminance-alpha textures with 8-bit components (#LUMINANCE8 and #LUMINANCE8_ALPHA8).

        The compressed signed luminance-alpha format is reasonably suited for storing compressed normal maps.

        Requires ${GL13.core} or ${ARB_texture_compression.link}.
        """

    IntConstant(
        """
        Accepted by the {@code internalformat} parameter of TexImage2D, CopyTexImage2D, and CompressedTexImage2D and the {@code format} parameter of
        CompressedTexSubImage2D.
        """,

        "COMPRESSED_LUMINANCE_LATC1_EXT"..0x8C70,
        "COMPRESSED_SIGNED_LUMINANCE_LATC1_EXT"..0x8C71,
        "COMPRESSED_LUMINANCE_ALPHA_LATC2_EXT"..0x8C72,
        "COMPRESSED_SIGNED_LUMINANCE_ALPHA_LATC2_EXT"..0x8C73
    )
}