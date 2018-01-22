/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_pvrtc_sRGB = "EXTPVRTCSRGB".nativeClassGLES("EXT_pvrtc_sRGB", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The response from electronic display systems given RGB tristimulus values for each pixel is non-linear. Gamma correction is the process of encoding or
        decoding images in a manner that will correct for non-linear response profiles of output devices. The displayed results of gamma-corrected pixel data
        are more consistent and predictable for the author of such pixel data than it would otherwise be with linearly encoded pixel data.

        This EXT_pvrtc_sRGB extension specifies additional tokens for gamma corrected PVRTC compressed sRGB data.

        Texture assets are developed and evaluated for use in OpenGL applications using electronic displays with non-linear responses. This extension provides
        a better measure of consistency between textures developed within an asset toolchain and their final rendered result with an OpenGL application that
        uses those textures.

        Conventional OpenGL texture tristimulus values as well as their alpha component are encoded linearly. The textures introduced by this extension are
        encoded with gamma correction in the tristimulus components but linearly in the alpha component.

        When gamma corrected texture samples are fetched and operated on by ALU operations in an OpenGL shading program those samples will be converted from
        gamma corrected space to linear space for logical simplicity and performance of the shader.

        Texture filtering operations as well as mipmap generation are carried out in linear space.

        Requires ${GLES20.core} and ${IMG_texture_compression_pvrtc.link}.
        """

    IntConstant(
        """
        Accepted by the {@code internalformat} parameter of CompressedTexImage2D and TexStorage2DEXT and the {@code format} parameter of
        CompressedTexSubImage2D.
        """,

        "COMPRESSED_SRGB_PVRTC_2BPPV1_EXT"..0x8A54,
        "COMPRESSED_SRGB_PVRTC_4BPPV1_EXT"..0x8A55,
        "COMPRESSED_SRGB_ALPHA_PVRTC_2BPPV1_EXT"..0x8A56,
        "COMPRESSED_SRGB_ALPHA_PVRTC_4BPPV1_EXT"..0x8A57
    )
}