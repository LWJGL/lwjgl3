/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_texture_compression_astc = "OESTextureCompressionASTC".nativeClassGLES("OES_texture_compression_astc", postfix = OES) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Adaptive Scalable Texture Compression (ASTC) is a new texture compression technology that offers unprecendented flexibility, while producing better or
        comparable results than existing texture compressions at all bit rates. It includes support for 2D and 3D textures, with low and high dynamic range, at
        bitrates from below 1 bit/pixel up to 8 bits/pixel in fine steps.

        The goal of this extension is to support the full profile of the ASTC texture compression specification.

        ASTC-compressed textures are handled in OpenGL ES and OpenGL by adding new supported formats to the existing mechanisms for handling compressed
        textures.

        <h3>What is ASTC</h3>

        ASTC stands for Adaptive Scalable Texture Compression. The ASTC formats form a family of related compressed texture image formats. They are all derived
        from a common set of definitions.

        ASTC textures may be either 2D or 3D.

        ASTC textures may be encoded using either high or low dynamic range. Low dynamic range images may optionally be specified using the sRGB color space.

        Two sub-profiles ("LDR Profile" and "HDR Profile") may be implemented, which support only 2D images at low or high dynamic range respectively. The LDR
        profile is indicated by the presence of only the extension string "GL_KHR_texture_compression_astc_ldr". If the HDR profile is implemented, both
        "GL_KHR_texture_compression_astc_ldr" and "GL_KHR_texture_compression_astc_hdr" must be published. If the full profile (including 3D textures) is
        implemented, then all three extension strings "GL_KHR_texture_compression_astc_ldr", "GL_KHR_texture_compression_astc_hdr" and
        "GL_OES_texture_compression_astc" must be published.

        ASTC textures may be encoded as 1, 2, 3 or 4 components, but they are all decoded into RGBA.

        ASTC has a variable block size, and this is specified as part of the name of the token passed to CompressedImage2D and its related functions.
        """

    IntConstant(
        """
        Accepted by the {@code internalformat} parameter of CompressedTexImage2D, CompressedTexSubImage2D, TexStorage2D, TextureStorage2D, TexStorage3D, and
        TextureStorage3D.
        """,

        "COMPRESSED_RGBA_ASTC_4x4_KHR"..0x93B0,
        "COMPRESSED_RGBA_ASTC_5x4_KHR"..0x93B1,
        "COMPRESSED_RGBA_ASTC_5x5_KHR"..0x93B2,
        "COMPRESSED_RGBA_ASTC_6x5_KHR"..0x93B3,
        "COMPRESSED_RGBA_ASTC_6x6_KHR"..0x93B4,
        "COMPRESSED_RGBA_ASTC_8x5_KHR"..0x93B5,
        "COMPRESSED_RGBA_ASTC_8x6_KHR"..0x93B6,
        "COMPRESSED_RGBA_ASTC_8x8_KHR"..0x93B7,
        "COMPRESSED_RGBA_ASTC_10x5_KHR"..0x93B8,
        "COMPRESSED_RGBA_ASTC_10x6_KHR"..0x93B9,
        "COMPRESSED_RGBA_ASTC_10x8_KHR"..0x93BA,
        "COMPRESSED_RGBA_ASTC_10x10_KHR"..0x93BB,
        "COMPRESSED_RGBA_ASTC_12x10_KHR"..0x93BC,
        "COMPRESSED_RGBA_ASTC_12x12_KHR"..0x93BD,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR"..0x93D0,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR"..0x93D1,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR"..0x93D2,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR"..0x93D3,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR"..0x93D4,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR"..0x93D5,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR"..0x93D6,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR"..0x93D7,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR"..0x93D8,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR"..0x93D9,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_10x8_KHR"..0x93DA,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR"..0x93DB,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR"..0x93DC,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR"..0x93DD
    )

    IntConstant(
        "Accepted by the {@code internalformat} parameter of CompressedTexImage3D, CompressedTexSubImage3D, TexStorage3D, and TextureStorage3D.",

        "COMPRESSED_RGBA_ASTC_3x3x3_OES"..0x93C0,
        "COMPRESSED_RGBA_ASTC_4x3x3_OES"..0x93C1,
        "COMPRESSED_RGBA_ASTC_4x4x3_OES"..0x93C2,
        "COMPRESSED_RGBA_ASTC_4x4x4_OES"..0x93C3,
        "COMPRESSED_RGBA_ASTC_5x4x4_OES"..0x93C4,
        "COMPRESSED_RGBA_ASTC_5x5x4_OES"..0x93C5,
        "COMPRESSED_RGBA_ASTC_5x5x5_OES"..0x93C6,
        "COMPRESSED_RGBA_ASTC_6x5x5_OES"..0x93C7,
        "COMPRESSED_RGBA_ASTC_6x6x5_OES"..0x93C8,
        "COMPRESSED_RGBA_ASTC_6x6x6_OES"..0x93C9,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_3x3x3_OES"..0x93E0,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_4x3x3_OES"..0x93E1,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_4x4x3_OES"..0x93E2,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_4x4x4_OES"..0x93E3,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_5x4x4_OES"..0x93E4,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_5x5x4_OES"..0x93E5,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_5x5x5_OES"..0x93E6,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_6x5x5_OES"..0x93E7,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_6x6x5_OES"..0x93E8,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_6x6x6_OES"..0x93E9
    )
}