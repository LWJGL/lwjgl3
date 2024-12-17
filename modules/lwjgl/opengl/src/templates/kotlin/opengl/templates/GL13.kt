/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL13 = "GL13".nativeClassGL("GL13") {
    extends = GL12

    // ARB_texture_compression

    IntConstant(
        "COMPRESSED_ALPHA"..0x84E9,
        "COMPRESSED_LUMINANCE"..0x84EA,
        "COMPRESSED_LUMINANCE_ALPHA"..0x84EB,
        "COMPRESSED_INTENSITY"..0x84EC,
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

    reuse(GL13C, "CompressedTexImage3D")
    reuse(GL13C, "CompressedTexImage2D")
    reuse(GL13C, "CompressedTexImage1D")
    reuse(GL13C, "CompressedTexSubImage3D")
    reuse(GL13C, "CompressedTexSubImage2D")
    reuse(GL13C, "CompressedTexSubImage1D")
    reuse(GL13C, "GetCompressedTexImage")

    // ARB_texture_cube_map

    IntConstant(
        "NORMAL_MAP"..0x8511,
        "REFLECTION_MAP"..0x8512
    )

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
        "MULTISAMPLE_BIT"..0x20000000
    )

    IntConstant(
        "SAMPLE_BUFFERS"..0x80A8,
        "SAMPLES"..0x80A9,
        "SAMPLE_COVERAGE_VALUE"..0x80AA,
        "SAMPLE_COVERAGE_INVERT"..0x80AB
    )

    reuse(GL13C, "SampleCoverage")

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
        "ACTIVE_TEXTURE"..0x84E0,
        "CLIENT_ACTIVE_TEXTURE"..0x84E1,
        "MAX_TEXTURE_UNITS"..0x84E2
    )

    reuse(GL13C, "ActiveTexture")

    DeprecatedGL..void(
        "ClientActiveTexture",

        GLenum("texture")
    )

    DeprecatedGL..void(
        "MultiTexCoord1f",

        GLenum("texture"),
        GLfloat("s")
    )

    DeprecatedGL..void("MultiTexCoord1s", GLenum("texture"), GLshort("s"))
    DeprecatedGL..void("MultiTexCoord1i", GLenum("texture"), GLint("s"))
    DeprecatedGL..void("MultiTexCoord1d", GLenum("texture"), GLdouble("s"))

    DeprecatedGL..void("MultiTexCoord1fv", GLenum("texture"), Check(1)..GLfloat.const.p("v"))
    DeprecatedGL..void("MultiTexCoord1sv", GLenum("texture"), Check(1)..GLshort.const.p("v"))
    DeprecatedGL..void("MultiTexCoord1iv", GLenum("texture"), Check(1)..GLint.const.p("v"))
    DeprecatedGL..void("MultiTexCoord1dv", GLenum("texture"), Check(1)..GLdouble.const.p("v"))

    DeprecatedGL..void(
        "MultiTexCoord2f",

        GLenum("texture"),
        GLfloat("s"),
        GLfloat("t")
    )

    DeprecatedGL..void("MultiTexCoord2s", GLenum("texture"), GLshort("s"), GLshort("t"))
    DeprecatedGL..void("MultiTexCoord2i", GLenum("texture"), GLint("s"), GLint("t"))
    DeprecatedGL..void("MultiTexCoord2d", GLenum("texture"), GLdouble("s"), GLdouble("t"))

    DeprecatedGL..void("MultiTexCoord2fv", GLenum("texture"), Check(2)..GLfloat.const.p("v"))
    DeprecatedGL..void("MultiTexCoord2sv", GLenum("texture"), Check(2)..GLshort.const.p("v"))
    DeprecatedGL..void("MultiTexCoord2iv", GLenum("texture"), Check(2)..GLint.const.p("v"))
    DeprecatedGL..void("MultiTexCoord2dv", GLenum("texture"), Check(2)..GLdouble.const.p("v"))

    DeprecatedGL..void(
        "MultiTexCoord3f",

        GLenum("texture"),
        GLfloat("s"),
        GLfloat("t"),
        GLfloat("r")
    )

    DeprecatedGL..void("MultiTexCoord3s", GLenum("texture"), GLshort("s"), GLshort("t"), GLshort("r"))
    DeprecatedGL..void("MultiTexCoord3i", GLenum("texture"), GLint("s"), GLint("t"), GLint("r"))
    DeprecatedGL..void("MultiTexCoord3d", GLenum("texture"), GLdouble("s"), GLdouble("t"), GLdouble("r"))

    DeprecatedGL..void("MultiTexCoord3fv", GLenum("texture"), Check(3)..GLfloat.const.p("v"))
    DeprecatedGL..void("MultiTexCoord3sv", GLenum("texture"), Check(3)..GLshort.const.p("v"))
    DeprecatedGL..void("MultiTexCoord3iv", GLenum("texture"), Check(3)..GLint.const.p("v"))
    DeprecatedGL..void("MultiTexCoord3dv", GLenum("texture"), Check(3)..GLdouble.const.p("v"))

    DeprecatedGL..void(
        "MultiTexCoord4f",

        GLenum("texture"),
        GLfloat("s"),
        GLfloat("t"),
        GLfloat("r"),
        GLfloat("q")
    )

    DeprecatedGL..void("MultiTexCoord4s", GLenum("texture"), GLshort("s"), GLshort("t"), GLshort("r"), GLshort("q"))
    DeprecatedGL..void("MultiTexCoord4i", GLenum("texture"), GLint("s"), GLint("t"), GLint("r"), GLint("q"))
    DeprecatedGL..void("MultiTexCoord4d", GLenum("texture"), GLdouble("s"), GLdouble("t"), GLdouble("r"), GLdouble("q"))

    DeprecatedGL..void("MultiTexCoord4fv", GLenum("texture"), Check(4)..GLfloat.const.p("v"))
    DeprecatedGL..void("MultiTexCoord4sv", GLenum("texture"), Check(4)..GLshort.const.p("v"))
    DeprecatedGL..void("MultiTexCoord4iv", GLenum("texture"), Check(4)..GLint.const.p("v"))
    DeprecatedGL..void("MultiTexCoord4dv", GLenum("texture"), Check(4)..GLdouble.const.p("v"))

    // ARB_texture_env_combine

    IntConstant(
        "COMBINE"..0x8570
    )

    IntConstant(
        "COMBINE_RGB"..0x8571,
        "COMBINE_ALPHA"..0x8572,
        "SOURCE0_RGB"..0x8580,
        "SOURCE1_RGB"..0x8581,
        "SOURCE2_RGB"..0x8582,
        "SOURCE0_ALPHA"..0x8588,
        "SOURCE1_ALPHA"..0x8589,
        "SOURCE2_ALPHA"..0x858A,
        "OPERAND0_RGB"..0x8590,
        "OPERAND1_RGB"..0x8591,
        "OPERAND2_RGB"..0x8592,
        "OPERAND0_ALPHA"..0x8598,
        "OPERAND1_ALPHA"..0x8599,
        "OPERAND2_ALPHA"..0x859A,
        "RGB_SCALE"..0x8573
    )

    IntConstant(
        "ADD_SIGNED"..0x8574,
        "INTERPOLATE"..0x8575,
        "SUBTRACT"..0x84E7
    )

    IntConstant(
        "CONSTANT"..0x8576,
        "PRIMARY_COLOR"..0x8577,
        "PREVIOUS"..0x8578
    )

    // ARB_texture_env_dot3

    IntConstant(
        "DOT3_RGB"..0x86AE,
        "DOT3_RGBA"..0x86AF
    )

    // ARB_texture_border_clamp

    IntConstant(
        "CLAMP_TO_BORDER"..0x812D
    )

    // ARB_transpose_matrix

    IntConstant(
        "TRANSPOSE_MODELVIEW_MATRIX"..0x84E3,
        "TRANSPOSE_PROJECTION_MATRIX"..0x84E4,
        "TRANSPOSE_TEXTURE_MATRIX"..0x84E5,
        "TRANSPOSE_COLOR_MATRIX"..0x84E6
    )

    DeprecatedGL..void(
        "LoadTransposeMatrixf",

        Check(16)..GLfloat.const.p("m")
    )

    DeprecatedGL..void(
        "LoadTransposeMatrixd",

        Check(16)..GLdouble.const.p("m")
    )

    DeprecatedGL..void(
        "MultTransposeMatrixf",

        Check(16)..GLfloat.const.p("m")
    )

    DeprecatedGL..void(
        "MultTransposeMatrixd",

        Check(16)..GLdouble.const.p("m")
    )
}