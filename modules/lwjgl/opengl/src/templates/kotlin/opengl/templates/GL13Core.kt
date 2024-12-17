/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL13C = "GL13C".nativeClassGL("GL13C") {
    extends = GL12C

    // ARB_texture_compression

    IntConstant(
        "COMPRESSED_RGB"..0x84ED,
        "COMPRESSED_RGBA"..0x84EE
    )

    IntConstant(
        "TEXTURE_COMPRESSION_HINT"..0x84EF
    )

    IntConstant(
        "TEXTURE_COMPRESSED_IMAGE_SIZE"..0x86A0,
        "TEXTURE_COMPRESSED"..0x86A1
    )

    IntConstant(
        "NUM_COMPRESSED_TEXTURE_FORMATS"..0x86A2,
        "COMPRESSED_TEXTURE_FORMATS"..0x86A3
    )

    void(
        "CompressedTexImage3D",

        GLenum("target"),
        GLint("level"),
        GLenum("internalformat"),
        GLsizei("width"),
        GLsizei("height"),
        GLsizei("depth"),
        GLint("border"),
        AutoSize("data")..GLsizei("imageSize"),
        RawPointer..nullable..void.const.p("data")
    )

    void(
        "CompressedTexImage2D",

        GLenum("target"),
        GLint("level"),
        GLenum("internalformat"),
        GLsizei("width"),
        GLsizei("height"),
        GLint("border"),
        AutoSize("data")..GLsizei("imageSize"),
        RawPointer..nullable..void.const.p("data")
    )

    void(
        "CompressedTexImage1D",

        GLenum("target"),
        GLint("level"),
        GLenum("internalformat"),
        GLsizei("width"),
        GLint("border"),
        AutoSize("data")..GLsizei("imageSize"),
        RawPointer..nullable..void.const.p("data")
    )

    void(
        "CompressedTexSubImage3D",

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
        "CompressedTexSubImage2D",

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
        "CompressedTexSubImage1D",

        GLenum("target"),
        GLint("level"),
        GLint("xoffset"),
        GLsizei("width"),
        GLenum("format"),
        AutoSize("data")..GLsizei("imageSize"),
        RawPointer..void.const.p("data")
    )

    void(
        "GetCompressedTexImage",

        GLenum("target"),
        GLint("level"),
        Check(
            expression = "GL11.glGetTexLevelParameteri(target, level, GL_TEXTURE_COMPRESSED_IMAGE_SIZE)", debug = true
        )..RawPointer..void.p("pixels")
    )

    // ARB_texture_cube_map

    IntConstant(
        "TEXTURE_CUBE_MAP"..0x8513
    )

    IntConstant(
        "TEXTURE_BINDING_CUBE_MAP"..0x8514
    )

    IntConstant(
        "TEXTURE_CUBE_MAP_POSITIVE_X"..0x8515,
        "TEXTURE_CUBE_MAP_NEGATIVE_X"..0x8516,
        "TEXTURE_CUBE_MAP_POSITIVE_Y"..0x8517,
        "TEXTURE_CUBE_MAP_NEGATIVE_Y"..0x8518,
        "TEXTURE_CUBE_MAP_POSITIVE_Z"..0x8519,
        "TEXTURE_CUBE_MAP_NEGATIVE_Z"..0x851A
    )

    IntConstant(
        "PROXY_TEXTURE_CUBE_MAP"..0x851B
    )

    IntConstant(
        "MAX_CUBE_MAP_TEXTURE_SIZE"..0x851C
    )

    // ARB_multisample

    IntConstant(
        "MULTISAMPLE"..0x809D,
        "SAMPLE_ALPHA_TO_COVERAGE"..0x809E,
        "SAMPLE_ALPHA_TO_ONE"..0x809F,
        "SAMPLE_COVERAGE"..0x80A0
    )

    IntConstant(
        "SAMPLE_BUFFERS"..0x80A8,
        "SAMPLES"..0x80A9,
        "SAMPLE_COVERAGE_VALUE"..0x80AA,
        "SAMPLE_COVERAGE_INVERT"..0x80AB
    )

    void(
        "SampleCoverage",

        GLfloat("value"),
        GLboolean("invert")
    )

    // ARB_multitexture

    IntConstant(
        "TEXTURE0"..0x84C0,
        "TEXTURE1"..0x84C1,
        "TEXTURE2"..0x84C2,
        "TEXTURE3"..0x84C3,
        "TEXTURE4"..0x84C4,
        "TEXTURE5"..0x84C5,
        "TEXTURE6"..0x84C6,
        "TEXTURE7"..0x84C7,
        "TEXTURE8"..0x84C8,
        "TEXTURE9"..0x84C9,
        "TEXTURE10"..0x84CA,
        "TEXTURE11"..0x84CB,
        "TEXTURE12"..0x84CC,
        "TEXTURE13"..0x84CD,
        "TEXTURE14"..0x84CE,
        "TEXTURE15"..0x84CF,
        "TEXTURE16"..0x84D0,
        "TEXTURE17"..0x84D1,
        "TEXTURE18"..0x84D2,
        "TEXTURE19"..0x84D3,
        "TEXTURE20"..0x84D4,
        "TEXTURE21"..0x84D5,
        "TEXTURE22"..0x84D6,
        "TEXTURE23"..0x84D7,
        "TEXTURE24"..0x84D8,
        "TEXTURE25"..0x84D9,
        "TEXTURE26"..0x84DA,
        "TEXTURE27"..0x84DB,
        "TEXTURE28"..0x84DC,
        "TEXTURE29"..0x84DD,
        "TEXTURE30"..0x84DE,
        "TEXTURE31"..0x84DF
    )

    IntConstant(
        "ACTIVE_TEXTURE"..0x84E0
    )

    void(
        "ActiveTexture",

        GLenum("texture")
    )

    // ARB_texture_border_clamp

    IntConstant(
        "CLAMP_TO_BORDER"..0x812D
    )
}