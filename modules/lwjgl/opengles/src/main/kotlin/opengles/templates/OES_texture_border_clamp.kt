/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val OES_texture_border_clamp = "OESTextureBorderClamp".nativeClassGLES("OES_texture_border_clamp", postfix = OES) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        OpenGL ES provides only a single clamping wrap mode: CLAMP_TO_EDGE. However, the ability to clamp to a constant border color can be useful to quickly
        detect texture coordinates that exceed their expected limits or to dummy out any such accesses with transparency or a neutral color in tiling or light
        maps.

        This extension defines an additional texture clamping algorithm. CLAMP_TO_BORDER_OES clamps texture coordinates at all mipmap levels such that NEAREST
        and LINEAR filters of clamped coordinates return only the constant border color. This does not add the ability for textures to specify borders using
        glTexImage2D, but only to clamp to a constant border value set using glTexParameter and glSamplerParameter.

        Requires ${GLES20.core}.
        """

    IntConstant(
        """
        Accepted by the {@code pname} parameter of TexParameteriv, TexParameterfv, SamplerParameteriv, SamplerParameterfv, TexParameterIivOES,
        TexParameterIuivOES, SamplerParameterIivOES, SamplerParameterIuivOES, GetTexParameteriv, GetTexParameterfv, GetTexParameterIivOES,
        GetTexParameterIuivOES, GetSamplerParameteriv, GetSamplerParameterfv, GetSamplerParameterIivOES, and GetSamplerParameterIuivOES.
        """,

        "TEXTURE_BORDER_COLOR_OES"..0x1004
    )

    IntConstant(
        """
        Accepted by the {@code param} parameter of TexParameteri, TexParameterf, SamplerParameteri and SamplerParameterf, and by the {@code params} parameter of
        TexParameteriv, TexParameterfv, TexParameterIivOES, TexParameterIuivOES, SamplerParameterIivOES, SamplerParameterIuivOES and returned by the
        {@code params} parameter of GetTexParameteriv, GetTexParameterfv, GetTexParameterIivOES, GetTexParameterIuivOES, GetSamplerParameteriv,
        GetSamplerParameterfv, GetSamplerParameterIivOES, and GetSamplerParameterIuivOES when their {@code pname} parameter is TEXTURE_WRAP_S, TEXTURE_WRAP_T,
        or TEXTURE_WRAP_R.
        """,

        "CLAMP_TO_BORDER_OES"..0x812D
    )

    void(
        "TexParameterIivOES",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        SingleValue("param")..Check(1)..const..GLint_p.IN("params", "")
    )

    void(
        "TexParameterIuivOES",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        SingleValue("param")..Check(1)..const..GLuint_p.IN("params", "")
    )

    void(
        "GetTexParameterIivOES",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLint_p.OUT("params", "")
    )

    void(
        "GetTexParameterIuivOES",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLuint_p.OUT("params", "")
    )

    void(
        "SamplerParameterIivOES",
        "",

        GLuint.IN("sampler", ""),
        GLenum.IN("pname", ""),
        SingleValue("param")..Check(1)..const..GLint_p.IN("params", "")
    )

    void(
        "SamplerParameterIuivOES",
        "",

        GLuint.IN("sampler", ""),
        GLenum.IN("pname", ""),
        SingleValue("param")..Check(1)..const..GLuint_p.IN("params", "")
    )

    void(
        "GetSamplerParameterIivOES",
        "",

        GLuint.IN("sampler", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLint_p.OUT("params", "")
    )

    void(
        "GetSamplerParameterIuivOES",
        "",

        GLuint.IN("sampler", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLuint_p.OUT("params", "")
    )
}