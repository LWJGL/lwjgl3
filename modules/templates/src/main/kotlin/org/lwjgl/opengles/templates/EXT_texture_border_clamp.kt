/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_texture_border_clamp = "EXTTextureBorderClamp".nativeClassGLES("EXT_texture_border_clamp", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        OpenGL ES provides only a single clamping wrap mode: CLAMP_TO_EDGE. However, the ability to clamp to a constant border color can be useful to quickly
        detect texture coordinates that exceed their expected limits or to dummy out any such accesses with transparency or a neutral color in tiling or light
        maps.

        This extension defines an additional texture clamping algorithm. CLAMP_TO_BORDER_EXT clamps texture coordinates at all mipmap levels such that NEAREST
        and LINEAR filters of clamped coordinates return only the constant border color. This does not add the ability for textures to specify borders using
        glTexImage2D, but only to clamp to a constant border value set using glTexParameter and glSamplerParameter.

        Requires ${GLES20.core}.
        """

    IntConstant(
        """
        Accepted by the {@code pname} parameter of TexParameteriv, TexParameterfv, SamplerParameteriv, SamplerParameterfv, TexParameterIivEXT,
        TexParameterIuivEXT, SamplerParameterIivEXT, SamplerParameterIuivEXT, GetTexParameteriv, GetTexParameterfv, GetTexParameterIivEXT,
        GetTexParameterIuivEXT, GetSamplerParameteriv, GetSamplerParameterfv, GetSamplerParameterIivEXT, and GetSamplerParameterIuivEXT.
        """,

        "TEXTURE_BORDER_COLOR_EXT"..0x1004
    )

    IntConstant(
        """
        Accepted by the {@code param} parameter of TexParameteri, TexParameterf, SamplerParameteri and SamplerParameterf, and by the {@code params} parameter of
        TexParameteriv, TexParameterfv, TexParameterIivEXT, TexParameterIuivEXT, SamplerParameterIivEXT, SamplerParameterIuivEXT and returned by the
        {@code params} parameter of GetTexParameteriv, GetTexParameterfv, GetTexParameterIivEXT, GetTexParameterIuivEXT, GetSamplerParameteriv,
        GetSamplerParameterfv, GetSamplerParameterIivEXT, and GetSamplerParameterIuivEXT when their {@code pname} parameter is TEXTURE_WRAP_S, TEXTURE_WRAP_T,
        or TEXTURE_WRAP_R.
        """,

        "CLAMP_TO_BORDER_EXT"..0x812D
    )

    void(
        "TexParameterIivEXT",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        Check(1)..const..GLint_p.IN("params", "")
    )

    void(
        "TexParameterIuivEXT",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        Check(1)..const..GLuint_p.IN("params", "")
    )

    void(
        "GetTexParameterIivEXT",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLint_p.OUT("params", "")
    )

    void(
        "GetTexParameterIuivEXT",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLuint_p.OUT("params", "")
    )

    void(
        "SamplerParameterIivEXT",
        "",

        GLuint.IN("sampler", ""),
        GLenum.IN("pname", ""),
        Check(1)..const..GLint_p.IN("param", "")
    )

    void(
        "SamplerParameterIuivEXT",
        "",

        GLuint.IN("sampler", ""),
        GLenum.IN("pname", ""),
        Check(1)..const..GLuint_p.IN("param", "")
    )

    void(
        "GetSamplerParameterIivEXT",
        "",

        GLuint.IN("sampler", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLint_p.OUT("params", "")
    )

    void(
        "GetSamplerParameterIuivEXT",
        "",

        GLuint.IN("sampler", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLuint_p.OUT("params", "")
    )
}