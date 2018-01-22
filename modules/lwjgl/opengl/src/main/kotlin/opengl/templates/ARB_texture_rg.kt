/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_texture_rg = "ARBTextureRG".nativeClassGL("ARB_texture_rg") {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Historically one- and two- component textures have been specified in OpenGL using the intensity, luminance or luminance-alpha (I/L/LA) formats. With the
        advent of programmable shaders and render-to-texture capabilites these legacy formats carry some historical artifacts which are no longer useful.

        For example, when sampling from such textures, the luminance values are replicated across the color components, and the intensity values are replicated
        across both the color and alpha components. This is no longer necessary with programmable shaders.

        It is also desirable to be able to render to one- and two- component format textures using capabilities such as framebuffer objects (FBO), but rendering
        to I/L/LA formats is under-specified (specifically how to map R/G/B/A values to I/L/A texture channels).

        This extension adds new base internal formats for the one-component #RED and two-component #RG (red green) texture formats as well as sized
        internal formats for fixed-point, floating-point and pure integer texture formats. The new texure formats can be used for texturing as well as for
        rendering into with framebuffer objects.

        ${GL30.promoted}
        """

    IntConstant(
        "Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D.",

        "R8"..0x8229,
        "R16"..0x822A,
        "RG8"..0x822B,
        "RG16"..0x822C,
        "R16F"..0x822D,
        "R32F"..0x822E,
        "RG16F"..0x822F,
        "RG32F"..0x8230,
        "R8I"..0x8231,
        "R8UI"..0x8232,
        "R16I"..0x8233,
        "R16UI"..0x8234,
        "R32I"..0x8235,
        "R32UI"..0x8236,
        "RG8I"..0x8237,
        "RG8UI"..0x8238,
        "RG16I"..0x8239,
        "RG16UI"..0x823A,
        "RG32I"..0x823B,
        "RG32UI"..0x823C,
        "RG"..0x8227,
        "COMPRESSED_RED"..0x8225,
        "COMPRESSED_RG"..0x8226
    )

    IntConstant(
        "Accepted by the {@code format} parameter of TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and ReadPixels.",

        "RG_INTEGER"..0x8228
    )
}