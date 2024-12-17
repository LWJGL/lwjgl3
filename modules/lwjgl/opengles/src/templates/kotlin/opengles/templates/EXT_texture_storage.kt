/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_texture_storage = "EXTTextureStorage".nativeClassGLES("EXT_texture_storage", postfix = EXT) {
    IntConstant(
        "TEXTURE_IMMUTABLE_FORMAT_EXT"..0x912F
    )

    IntConstant(
        "ALPHA8_EXT"..0x803C,
        "LUMINANCE8_EXT"..0x8040,
        "LUMINANCE8_ALPHA8_EXT"..0x8045,
        "RGBA32F_EXT"..0x8814,
        "RGB32F_EXT"..0x8815,
        "ALPHA32F_EXT"..0x8816,
        "LUMINANCE32F_EXT"..0x8818,
        "LUMINANCE_ALPHA32F_EXT"..0x8819,
        "RGBA16F_EXT"..0x881A,
        "RGB16F_EXT"..0x881B,
        "ALPHA16F_EXT"..0x881C,
        "LUMINANCE16F_EXT"..0x881E,
        "LUMINANCE_ALPHA16F_EXT"..0x881F,
        "RGB10_A2_EXT"..0x8059,
        "RGB10_EXT"..0x8052,
        "BGRA8_EXT"..0x93A1,
        "R8_EXT"..0x8229,
        "RG8_EXT"..0x822B,
        "R32F_EXT"..0x822E,
        "RG32F_EXT"..0x8230,
        "R16F_EXT"..0x822D,
        "RG16F_EXT"..0x822F,
        "RGB_RAW_422_APPLE"..0x8A51
    )

    void(
        "TexStorage1DEXT",

        GLenum("target"),
        GLsizei("levels"),
        GLenum("internalformat"),
        GLsizei("width")
    )

    void(
        "TexStorage2DEXT",

        GLenum("target"),
        GLsizei("levels"),
        GLenum("internalformat"),
        GLsizei("width"),
        GLsizei("height")
    )

    void(
        "TexStorage3DEXT",

        GLenum("target"),
        GLsizei("levels"),
        GLenum("internalformat"),
        GLsizei("width"),
        GLsizei("height"),
        GLsizei("depth")
    )

    DependsOn("hasDSA(ext)")..void(
        "TextureStorage1DEXT",

        GLuint("texture"),
        GLenum("target"),
        GLsizei("levels"),
        GLenum("internalformat"),
        GLsizei("width")
    )

    DependsOn("hasDSA(ext)")..void(
        "TextureStorage2DEXT",

        GLuint("texture"),
        GLenum("target"),
        GLsizei("levels"),
        GLenum("internalformat"),
        GLsizei("width"),
        GLsizei("height")
    )

    DependsOn("hasDSA(ext)")..void(
        "TextureStorage3DEXT",

        GLuint("texture"),
        GLenum("target"),
        GLsizei("levels"),
        GLenum("internalformat"),
        GLsizei("width"),
        GLsizei("height"),
        GLsizei("depth")
    )
}