/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL12 = "GL12".nativeClassGL("GL12") {
    extends = GL11

    IntConstant(
        "ALIASED_POINT_SIZE_RANGE"..0x846D,
        "ALIASED_LINE_WIDTH_RANGE"..0x846E,

        "SMOOTH_POINT_SIZE_RANGE"..0x0B12,
        "SMOOTH_POINT_SIZE_GRANULARITY"..0x0B13,
        "SMOOTH_LINE_WIDTH_RANGE"..0x0B22,
        "SMOOTH_LINE_WIDTH_GRANULARITY"..0x0B23
    )

    // EXT_texture3D

    IntConstant(
        "TEXTURE_BINDING_3D"..0x806A
    )

    IntConstant(
        "PACK_SKIP_IMAGES"..0x806B,
        "PACK_IMAGE_HEIGHT"..0x806C,
        "UNPACK_SKIP_IMAGES"..0x806D,
        "UNPACK_IMAGE_HEIGHT"..0x806E
    )

    IntConstant(
        "TEXTURE_3D"..0x806F
    )

    IntConstant(
        "PROXY_TEXTURE_3D"..0x8070
    )

    IntConstant(
        "TEXTURE_DEPTH"..0x8071
    )

    IntConstant(
        "TEXTURE_WRAP_R"..0x8072
    )

    IntConstant(
        "MAX_3D_TEXTURE_SIZE"..0x8073
    )

    reuse(GL12C, "TexImage3D")
    reuse(GL12C, "TexSubImage3D")
    reuse(GL12C, "CopyTexSubImage3D")

    // EXT_bgra

    IntConstant(
        "BGR"..0x80E0,
        "BGRA"..0x80E1
    )

    // EXT_packed_pixels

    IntConstant(
        "UNSIGNED_BYTE_3_3_2"..0x8032,
        "UNSIGNED_BYTE_2_3_3_REV"..0x8362,
        "UNSIGNED_SHORT_5_6_5"..0x8363,
        "UNSIGNED_SHORT_5_6_5_REV"..0x8364,
        "UNSIGNED_SHORT_4_4_4_4"..0x8033,
        "UNSIGNED_SHORT_4_4_4_4_REV"..0x8365,
        "UNSIGNED_SHORT_5_5_5_1"..0x8034,
        "UNSIGNED_SHORT_1_5_5_5_REV"..0x8366,
        "UNSIGNED_INT_8_8_8_8"..0x8035,
        "UNSIGNED_INT_8_8_8_8_REV"..0x8367,
        "UNSIGNED_INT_10_10_10_2"..0x8036,
        "UNSIGNED_INT_2_10_10_10_REV"..0x8368
    )

    // EXT_rescale_normal

    IntConstant(
        "RESCALE_NORMAL"..0x803A
    )

    // EXT_separate_specular_color

    IntConstant(
        "LIGHT_MODEL_COLOR_CONTROL"..0x81F8
    )

    IntConstant(
        "SINGLE_COLOR"..0x81F9,
        "SEPARATE_SPECULAR_COLOR"..0x81FA
    )

    // SGIS_texture_edge_clamp

    IntConstant(
        "CLAMP_TO_EDGE"..0x812F
    )

    // SGIS_texture_lod

    IntConstant(
        "TEXTURE_MIN_LOD"..0x813A,
        "TEXTURE_MAX_LOD"..0x813B,
        "TEXTURE_BASE_LEVEL"..0x813C,
        "TEXTURE_MAX_LEVEL"..0x813D
    )

    // EXT_draw_range_elements

    IntConstant(
        "MAX_ELEMENTS_VERTICES"..0x80E8,
        "MAX_ELEMENTS_INDICES"..0x80E9
    )

    reuse(GL12C, "DrawRangeElements")
}