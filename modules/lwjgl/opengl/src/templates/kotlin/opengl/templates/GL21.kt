/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL21 = "GL21".nativeClassGL("GL21") {
    extends = GL20

    IntConstant(
        "CURRENT_RASTER_SECONDARY_COLOR"..0x845F
    )

    IntConstant(
        "FLOAT_MAT2x3"..0x8B65,
        "FLOAT_MAT2x4"..0x8B66,
        "FLOAT_MAT3x2"..0x8B67,
        "FLOAT_MAT3x4"..0x8B68,
        "FLOAT_MAT4x2"..0x8B69,
        "FLOAT_MAT4x3"..0x8B6A
    )

    reuse(GL21C, "UniformMatrix2x3fv")
    reuse(GL21C, "UniformMatrix3x2fv")
    reuse(GL21C, "UniformMatrix2x4fv")
    reuse(GL21C, "UniformMatrix4x2fv")
    reuse(GL21C, "UniformMatrix3x4fv")
    reuse(GL21C, "UniformMatrix4x3fv")

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
        "SLUMINANCE_ALPHA"..0x8C44,
        "SLUMINANCE8_ALPHA8"..0x8C45,
        "SLUMINANCE"..0x8C46,
        "SLUMINANCE8"..0x8C47,
        "COMPRESSED_SRGB"..0x8C48,
        "COMPRESSED_SRGB_ALPHA"..0x8C49,
        "COMPRESSED_SLUMINANCE"..0x8C4A,
        "COMPRESSED_SLUMINANCE_ALPHA"..0x8C4B
    )
}