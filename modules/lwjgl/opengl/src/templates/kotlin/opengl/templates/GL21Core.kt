/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL21C = "GL21C".nativeClassGL("GL21C") {
    extends = GL20C

    IntConstant(
        "FLOAT_MAT2x3"..0x8B65,
        "FLOAT_MAT2x4"..0x8B66,
        "FLOAT_MAT3x2"..0x8B67,
        "FLOAT_MAT3x4"..0x8B68,
        "FLOAT_MAT4x2"..0x8B69,
        "FLOAT_MAT4x3"..0x8B6A
    )

    void(
        "UniformMatrix2x3fv",

        GLint("location"),
        AutoSize(2 x 3, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLfloat.const.p("value")
    )

    void(
        "UniformMatrix3x2fv",

        GLint("location"),
        AutoSize(3 x 2, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLfloat.const.p("value")
    )

    void(
        "UniformMatrix2x4fv",

        GLint("location"),
        AutoSize(2 x 4, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLfloat.const.p("value")
    )

    void(
        "UniformMatrix4x2fv",

        GLint("location"),
        AutoSize(4 x 2, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLfloat.const.p("value")
    )

    void(
        "UniformMatrix3x4fv",

        GLint("location"),
        AutoSize(3 x 4, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLfloat.const.p("value")
    )

    void(
        "UniformMatrix4x3fv",

        GLint("location"),
        AutoSize(4 x 3, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLfloat.const.p("value")
    )

    // ARB_pixel_buffer_object

    IntConstant(
        "PIXEL_PACK_BUFFER"..0x88EB,
        "PIXEL_UNPACK_BUFFER"..0x88EC
    )

    IntConstant(
        "PIXEL_PACK_BUFFER_BINDING"..0x88ED,
        "PIXEL_UNPACK_BUFFER_BINDING"..0x88EF
    )

    // EXT_texture_sRGB

    IntConstant(
        "SRGB"..0x8C40,
        "SRGB8"..0x8C41,
        "SRGB_ALPHA"..0x8C42,
        "SRGB8_ALPHA8"..0x8C43,
        "COMPRESSED_SRGB"..0x8C48,
        "COMPRESSED_SRGB_ALPHA"..0x8C49
    )
}