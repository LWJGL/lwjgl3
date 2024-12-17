/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_texture_integer = "EXTTextureInteger".nativeClassGL("EXT_texture_integer", postfix = EXT) {
    IntConstant(
        "RGBA_INTEGER_MODE_EXT"..0x8D9E
    )

    IntConstant(
        "RGBA32UI_EXT"..0x8D70,
        "RGB32UI_EXT"..0x8D71,
        "ALPHA32UI_EXT"..0x8D72,
        "INTENSITY32UI_EXT"..0x8D73,
        "LUMINANCE32UI_EXT"..0x8D74,
        "LUMINANCE_ALPHA32UI_EXT"..0x8D75,
        "RGBA16UI_EXT"..0x8D76,
        "RGB16UI_EXT"..0x8D77,
        "ALPHA16UI_EXT"..0x8D78,
        "INTENSITY16UI_EXT"..0x8D79,
        "LUMINANCE16UI_EXT"..0x8D7A,
        "LUMINANCE_ALPHA16UI_EXT"..0x8D7B,
        "RGBA8UI_EXT"..0x8D7C,
        "RGB8UI_EXT"..0x8D7D,
        "ALPHA8UI_EXT"..0x8D7E,
        "INTENSITY8UI_EXT"..0x8D7F,
        "LUMINANCE8UI_EXT"..0x8D80,
        "LUMINANCE_ALPHA8UI_EXT"..0x8D81,
        "RGBA32I_EXT"..0x8D82,
        "RGB32I_EXT"..0x8D83,
        "ALPHA32I_EXT"..0x8D84,
        "INTENSITY32I_EXT"..0x8D85,
        "LUMINANCE32I_EXT"..0x8D86,
        "LUMINANCE_ALPHA32I_EXT"..0x8D87,
        "RGBA16I_EXT"..0x8D88,
        "RGB16I_EXT"..0x8D89,
        "ALPHA16I_EXT"..0x8D8A,
        "INTENSITY16I_EXT"..0x8D8B,
        "LUMINANCE16I_EXT"..0x8D8C,
        "LUMINANCE_ALPHA16I_EXT"..0x8D8D,
        "RGBA8I_EXT"..0x8D8E,
        "RGB8I_EXT"..0x8D8F,
        "ALPHA8I_EXT"..0x8D90,
        "INTENSITY8I_EXT"..0x8D91,
        "LUMINANCE8I_EXT"..0x8D92,
        "LUMINANCE_ALPHA8I_EXT"..0x8D93
    )

    IntConstant(
        "RED_INTEGER_EXT"..0x8D94,
        "GREEN_INTEGER_EXT"..0x8D95,
        "BLUE_INTEGER_EXT"..0x8D96,
        "ALPHA_INTEGER_EXT"..0x8D97,
        "RGB_INTEGER_EXT"..0x8D98,
        "RGBA_INTEGER_EXT"..0x8D99,
        "BGR_INTEGER_EXT"..0x8D9A,
        "BGRA_INTEGER_EXT"..0x8D9B,
        "LUMINANCE_INTEGER_EXT"..0x8D9C,
        "LUMINANCE_ALPHA_INTEGER_EXT"..0x8D9D
    )

    void(
        "ClearColorIiEXT",

        GLint("r"),
        GLint("g"),
        GLint("b"),
        GLint("a")
    )

    void(
        "ClearColorIuiEXT",

        GLuint("r"),
        GLuint("g"),
        GLuint("b"),
        GLuint("a")
    )

    void(
        "TexParameterIivEXT",

        GLenum("target"),
        GLenum("pname"),
        Check(1)..SingleValue("param")..GLint.p("params")
    )

    void(
        "TexParameterIuivEXT",

        GLenum("target"),
        GLenum("pname"),
        Check(1)..SingleValue("param")..GLuint.p("params")
    )

    void(
        "GetTexParameterIivEXT",

        GLenum("target"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLint.p("params")
    )

    void(
        "GetTexParameterIuivEXT",

        GLenum("target"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLuint.p("params")
    )
}