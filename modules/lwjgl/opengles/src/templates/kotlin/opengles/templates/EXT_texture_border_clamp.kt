/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_texture_border_clamp = "EXTTextureBorderClamp".nativeClassGLES("EXT_texture_border_clamp", postfix = EXT) {
    IntConstant(
        "TEXTURE_BORDER_COLOR_EXT"..0x1004
    )

    IntConstant(
        "CLAMP_TO_BORDER_EXT"..0x812D
    )

    void(
        "TexParameterIivEXT",

        GLenum("target"),
        GLenum("pname"),
        Check(1)..GLint.const.p("params")
    )

    void(
        "TexParameterIuivEXT",

        GLenum("target"),
        GLenum("pname"),
        Check(1)..GLuint.const.p("params")
    )

    void(
        "GetTexParameterIivEXT",

        GLenum("target"),
        GLenum("pname"),
        ReturnParam..Check(1)..GLint.p("params")
    )

    void(
        "GetTexParameterIuivEXT",

        GLenum("target"),
        GLenum("pname"),
        ReturnParam..Check(1)..GLuint.p("params")
    )

    void(
        "SamplerParameterIivEXT",

        GLuint("sampler"),
        GLenum("pname"),
        Check(1)..GLint.const.p("param")
    )

    void(
        "SamplerParameterIuivEXT",

        GLuint("sampler"),
        GLenum("pname"),
        Check(1)..GLuint.const.p("param")
    )

    void(
        "GetSamplerParameterIivEXT",

        GLuint("sampler"),
        GLenum("pname"),
        ReturnParam..Check(1)..GLint.p("params")
    )

    void(
        "GetSamplerParameterIuivEXT",

        GLuint("sampler"),
        GLenum("pname"),
        ReturnParam..Check(1)..GLuint.p("params")
    )
}