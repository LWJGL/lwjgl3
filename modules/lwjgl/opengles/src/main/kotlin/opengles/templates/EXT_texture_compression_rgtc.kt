/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_texture_compression_rgtc = "EXTTextureCompressionRGTC".nativeClassGLES("EXT_texture_compression_rgtc", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension introduces four new block-based texture compression formats suited for unsigned and signed red and red-green textures (hence the name
        "rgtc" for Red-Green Texture Compression).

        These formats are designed to reduce the storage requirements and memory bandwidth required for red and red-green textures by a factor of 2-to-1 over
        conventional uncompressed luminance and luminance-alpha textures with 8-bit components (#LUMINANCE8_EXT and #LUMINANCE8_ALPHA8_EXT).

        The compressed signed red-green format is reasonably suited for storing compressed normal maps.

        This extension uses the same compression format as the EXT_texture_compression_latc extension except the color data is stored in the red and green
        components rather than luminance and alpha. Representing compressed red and green components is consistent with the BC4 and BC5 compressed formats
        supported by DirectX 10.

        Requires ${GLES30.core}.
        """

    IntConstant(
        """
        Accepted by the {@code internalFormat} parameter of #TexImage2D(), #TexStorage2D(), and #CompressedTexImage2D() and the {@code format} parameter of
        #CompressedTexSubImage2D().
        """,

        "COMPRESSED_RED_RGTC1_EXT"..0x8DBB,
        "COMPRESSED_SIGNED_RED_RGTC1_EXT"..0x8DBC,
        "COMPRESSED_RED_GREEN_RGTC2_EXT"..0x8DBD,
        "COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT"..0x8DBE
    )
}