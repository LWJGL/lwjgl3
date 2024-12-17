/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_texture_compression = "ARBTextureCompression".nativeClassGL("ARB_texture_compression", postfix = ARB) {
    IntConstant(
        "COMPRESSED_ALPHA_ARB"..0x84E9,
        "COMPRESSED_LUMINANCE_ARB"..0x84EA,
        "COMPRESSED_LUMINANCE_ALPHA_ARB"..0x84EB,
        "COMPRESSED_INTENSITY_ARB"..0x84EC,
        "COMPRESSED_RGB_ARB"..0x84ED,
        "COMPRESSED_RGBA_ARB"..0x84EE
    )

    IntConstant(
        "TEXTURE_COMPRESSION_HINT_ARB"..0x84EF
    )

    IntConstant(
        "TEXTURE_COMPRESSED_IMAGE_SIZE_ARB"..0x86A0,
        "TEXTURE_COMPRESSED_ARB"..0x86A1
    )

    IntConstant(
        "NUM_COMPRESSED_TEXTURE_FORMATS_ARB"..0x86A2,
        "COMPRESSED_TEXTURE_FORMATS_ARB"..0x86A3
    )

    void(
        "CompressedTexImage3DARB",

        GLenum("target"),
        GLint("level"),
        GLenum("internalformat"),
        GLsizei("width"),
        GLsizei("height"),
        GLsizei("depth"),
        Expression("0")..GLint("border"),
        AutoSize("data")..GLsizei("imageSize"),
        RawPointer..void.const.p("data")
    )

    void(
        "CompressedTexImage2DARB",

        GLenum("target"),
        GLint("level"),
        GLenum("internalformat"),
        GLsizei("width"),
        GLsizei("height"),
        Expression("0")..GLint("border"),
        AutoSize("data")..GLsizei("imageSize"),
        RawPointer..void.const.p("data")
    )

    void(
        "CompressedTexImage1DARB",

        GLenum("target"),
        GLint("level"),
        GLenum("internalformat"),
        GLsizei("width"),
        Expression("0")..GLint("border"),
        AutoSize("data")..GLsizei("imageSize"),
        RawPointer..void.const.p("data")
    )

    void(
        "CompressedTexSubImage3DARB",

        GLenum("target"),
        GLint("level"),
        GLint("xoffset"),
        GLint("yoffset"),
        GLint("zoffset"),
        GLsizei("width"),
        GLsizei("height"),
        GLsizei("depth"),
        GLenum("format"),
        AutoSize("data")..GLsizei("imageSize"),
        RawPointer..void.const.p("data")
    )

    void(
        "CompressedTexSubImage2DARB",

        GLenum("target"),
        GLint("level"),
        GLint("xoffset"),
        GLint("yoffset"),
        GLsizei("width"),
        GLsizei("height"),
        GLenum("format"),
        AutoSize("data")..GLsizei("imageSize"),
        RawPointer..void.const.p("data")
    )

    void(
        "CompressedTexSubImage1DARB",

        GLenum("target"),
        GLint("level"),
        GLint("xoffset"),
        GLsizei("width"),
        GLenum("format"),
        AutoSize("data")..GLsizei("imageSize"),
        RawPointer..void.const.p("data")
    )

    void(
        "GetCompressedTexImageARB",

        GLenum("target"),
        GLint("level"),
        Check(
            expression = "GL11.glGetTexLevelParameteri(target, level, GL_TEXTURE_COMPRESSED_IMAGE_SIZE_ARB)", debug = true
        )..RawPointer..void.p("pixels")
    )

}