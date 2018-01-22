/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_texture_sRGB_decode = "EXTTextureSRGBDecode".nativeClassGL("EXT_texture_sRGB_decode", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The EXT_texture_sRGB extension (promoted to core in OpenGL 2.1) provides a texture format stored in the sRGB color space. Sampling one of these
        textures will always return the color value decoded into a linear color space. However, an application may wish to sample and retrieve the undecoded
        sRGB data from the texture and manipulate that directly.

        This extension adds a Texture Parameter and Sampler Object parameter to allow sRGB textures to be read directly, without decoding.

        The new parameter, #TEXTURE_SRGB_DECODE_EXT controls whether the decoding happens at sample time. It only applies to textures with an internal format
        that is sRGB and is ignored for all other textures. This value defaults to #DECODE_EXT, which indicates the texture should be decoded to linear color
        space.

        Requires ${GL21.core} or ${EXT_texture_sRGB.link}.
        """

    IntConstant(
        """
        Accepted by the {@code pname} parameter of TexParameterf, TexParameteri, TexParameterfv, TexParameteriv, TexParameterIiv, TexParameterIuiv,
        TexParameterIivEXT, TexParameterIuivEXT, TextureParameterfEXT, TextureParameterfvEXT, TextureParameteriEXT, TextureParameterivEXT,
        TextureParameterIivEXT, TextureParameterIuivEXT, MultiTexParameterfEXT, MultiTexParameterfvEXT, MultiTexParameteriEXT, MultiTexParameterivEXT,
        MultiTexParameterIivEXT, MultiTexParameterIuivEXT, GetTexParameterfv, GetTexParameteriv, GetTexParameterIiv, GetTexParameterIuiv, GetTexParameterIivEXT,
        GetTexParameterIuivEXT, GetTextureParameterfEXT, GetTextureParameterfvEXT, GetTextureParameteriEXT, GetTextureParameterivEXT, GetTextureParameterIivEXT,
        GetTextureParameterIuivEXT, GetMultiTexParameterfEXT, GetMultiTexParameterfvEXT, GetMultiTexParameteriEXT, GetMultiTexParameterivEXT,
        GetMultiTexParameterIivEXT, GetMultiTexParameterIuivEXT, SamplerParameteri, SamplerParameterf, SamplerParameteriv, SamplerParameterfv,
        SamplerParameterIiv, SamplerParameterIuiv, GetSamplerParameteriv, GetSamplerParameterfv, GetSamplerParameterIiv, and GetSamplerParameterIuiv.
        """,

        "TEXTURE_SRGB_DECODE_EXT"..0x8A48
    )

    IntConstant(
        """
        Accepted by the {@code param} parameter of TexParameterf, TexParameteri, TexParameterfv, TexParameteriv, TexParameterIiv, TexParameterIuiv,
        TexParameterIivEXT, TexParameterIuivEXT, TextureParameterfEXT, TextureParameterfvEXT, TextureParameteriEXT, TextureParameterivEXT,
        TextureParameterIivEXT, TextureParameterIuivEXT, MultiTexParameterfEXT, MultiTexParameterfvEXT, MultiTexParameteriEXT, MultiTexParameterivEXT,
        MultiTexParameterIivEXT, MultiTexParameterIuivEXT, SamplerParameteri, SamplerParameterf, SamplerParameteriv, SamplerParameterfv, SamplerParameterIiv,
        and SamplerParameterIuiv.
        """,

        "DECODE_EXT"..0x8A49,
        "SKIP_DECODE_EXT"..0x8A4A
    )
}