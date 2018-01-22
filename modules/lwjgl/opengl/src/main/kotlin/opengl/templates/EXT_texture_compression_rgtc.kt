/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_texture_compression_rgtc = "EXTTextureCompressionRGTC".nativeClassGL("EXT_texture_compression_rgtc", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension introduces four new block-based texture compression formats suited for unsigned and signed red and red-green textures (hence the name
        "rgtc" for Red-Green Texture Compression).

        These formats are designed to reduce the storage requirements and memory bandwidth required for red and red-green textures by a factor of 2-to-1 over
        conventional uncompressed luminance and luminance-alpha textures with 8-bit components (#LUMINANCE8 and #LUMINANCE8_ALPHA8).

        The compressed signed red-green format is reasonably suited for storing compressed normal maps.

        This extension uses the same compression format as the EXT_texture_compression_latc extension except the color data is stored in the red and green
        components rather than luminance and alpha. Representing compressed red and green components is consistent with the BC4 and BC5 compressed formats
        supported by DirectX 10.

        Requires ${GL13.core} or ${ARB_texture_compression.link}.
        """

    IntConstant(
        """
        Accepted by the {@code internalformat} parameter of TexImage2D, CopyTexImage2D, and CompressedTexImage2D and the {@code format} parameter of
        CompressedTexSubImage2D.
        """,

        "COMPRESSED_RED_RGTC1_EXT"..0x8DBB,
        "COMPRESSED_SIGNED_RED_RGTC1_EXT"..0x8DBC,
        "COMPRESSED_RED_GREEN_RGTC2_EXT"..0x8DBD,
        "COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT"..0x8DBE
    )
}