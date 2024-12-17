/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_texture_border_clamp = "OESTextureBorderClamp".nativeClassGLES("OES_texture_border_clamp", postfix = OES) {
    IntConstant(
        "TEXTURE_BORDER_COLOR_OES"..0x1004
    )

    IntConstant(
        "CLAMP_TO_BORDER_OES"..0x812D
    )

    void(
        "TexParameterIivOES",

        GLenum("target"),
        GLenum("pname"),
        SingleValue("param")..Check(1)..GLint.const.p("params")
    )

    void(
        "TexParameterIuivOES",

        GLenum("target"),
        GLenum("pname"),
        SingleValue("param")..Check(1)..GLuint.const.p("params")
    )

    void(
        "GetTexParameterIivOES",

        GLenum("target"),
        GLenum("pname"),
        ReturnParam..Check(1)..GLint.p("params")
    )

    void(
        "GetTexParameterIuivOES",

        GLenum("target"),
        GLenum("pname"),
        ReturnParam..Check(1)..GLuint.p("params")
    )

    void(
        "SamplerParameterIivOES",

        GLuint("sampler"),
        GLenum("pname"),
        SingleValue("param")..Check(1)..GLint.const.p("params")
    )

    void(
        "SamplerParameterIuivOES",

        GLuint("sampler"),
        GLenum("pname"),
        SingleValue("param")..Check(1)..GLuint.const.p("params")
    )

    void(
        "GetSamplerParameterIivOES",

        GLuint("sampler"),
        GLenum("pname"),
        ReturnParam..Check(1)..GLint.p("params")
    )

    void(
        "GetSamplerParameterIuivOES",

        GLuint("sampler"),
        GLenum("pname"),
        ReturnParam..Check(1)..GLuint.p("params")
    )
}