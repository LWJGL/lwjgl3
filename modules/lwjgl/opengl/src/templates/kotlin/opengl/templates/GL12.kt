/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL12 = "GL12".nativeClassGL("GL12") {
    extends = GL11
    documentation =
        """
        The OpenGL functionality up to version 1.2. Includes the deprecated symbols of the Compatibility Profile.

        Extensions promoted to core in this release:
        ${ul(
            registryLinkTo("EXT", "texture3D"),
            registryLinkTo("EXT", "bgra"),
            registryLinkTo("EXT", "packed_pixels"),
            registryLinkTo("EXT", "rescale_normal"),
            registryLinkTo("EXT", "separate_specular_color"),
            registryLinkTo("SGIS", "texture_edge_clamp"),
            registryLinkTo("SGIS", "texture_lod"),
            registryLinkTo("EXT", "draw_range_elements")
        )}

        Extensions part of the <em>imaging subset</em>:
        ${ul(
            "${registryLinkTo("EXT", "color_table")} and ${registryLinkTo("EXT", "color_subtable")}",
            "${registryLinkTo("EXT", "convolution")} and ${registryLinkTo("HP", "convolution_border_modes")}",
            registryLinkTo("SGI", "color_matrix"),
            registryLinkTo("EXT", "histogram"),
            registryLinkTo("EXT", "blend_color"),
            "${registryLinkTo("EXT", "blend_minmax")} and ${registryLinkTo("EXT", "blend_subtract")}"
        )}
        """

    IntConstant(
        "Aliases for smooth points and lines.",

        "ALIASED_POINT_SIZE_RANGE"..0x846D,
        "ALIASED_LINE_WIDTH_RANGE"..0x846E,

        "SMOOTH_POINT_SIZE_RANGE"..0x0B12,
        "SMOOTH_POINT_SIZE_GRANULARITY"..0x0B13,
        "SMOOTH_LINE_WIDTH_RANGE"..0x0B22,
        "SMOOTH_LINE_WIDTH_GRANULARITY"..0x0B23
    )

    // EXT_texture3D

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "TEXTURE_BINDING_3D"..0x806A
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev, and by the {@code pname} parameter of PixelStore.",

        "PACK_SKIP_IMAGES"..0x806B,
        "PACK_IMAGE_HEIGHT"..0x806C,
        "UNPACK_SKIP_IMAGES"..0x806D,
        "UNPACK_IMAGE_HEIGHT"..0x806E
    )

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
        GetDoublev, and by the {@code target} parameter of TexImage3D, GetTexImage, GetTexLevelParameteriv, GetTexLevelParameterfv, GetTexParameteriv, and
        GetTexParameterfv.
        """,

        "TEXTURE_3D"..0x806F
    )

    IntConstant(
        "Accepted by the {@code target} parameter of TexImage3D, GetTexLevelParameteriv, and GetTexLevelParameterfv.",

        "PROXY_TEXTURE_3D"..0x8070
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetTexLevelParameteriv and GetTexLevelParameterfv.",

        "TEXTURE_DEPTH"..0x8071
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of TexParameteriv, TexParameterfv, GetTexParameteriv, and GetTexParameterfv.",

        "TEXTURE_WRAP_R"..0x8072
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "MAX_3D_TEXTURE_SIZE"..0x8073
    )

    GL12C reuse "TexImage3D"
    GL12C reuse "TexSubImage3D"
    GL12C reuse "CopyTexSubImage3D"

    // EXT_bgra

    IntConstant(
        "Accepted by the {@code format} parameter of DrawPixels, GetTexImage, ReadPixels, TexImage1D, and TexImage2D.",

        "BGR"..0x80E0,
        "BGRA"..0x80E1
    )

    // EXT_packed_pixels

    IntConstant(
        """
        Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, GetTexImage, TexImage3D, TexSubImage1D, TexSubImage2D,
        TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, ConvolutionFilter3D, GetConvolutionFilter, SeparableFilter2D,
        SeparableFilter3D, GetSeparableFilter, ColorTable, GetColorTable, TexImage4D, and TexSubImage4D.
        """,

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
        """
        Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
        GetDoublev.
        """,

        "RESCALE_NORMAL"..0x803A
    )

    // EXT_separate_specular_color

    IntConstant(
        """
        Accepted by the {@code pname} parameter of LightModel*, and also by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.
        """,

        "LIGHT_MODEL_COLOR_CONTROL"..0x81F8
    )

    IntConstant(
        "Accepted by the {@code param} parameter of LightModel* when {@code pname} is  LIGHT_MODEL_COLOR_CONTROL.",

        "SINGLE_COLOR"..0x81F9,
        "SEPARATE_SPECULAR_COLOR"..0x81FA
    )

    // SGIS_texture_edge_clamp

    IntConstant(
        """
        Accepted by the {@code param} parameter of TexParameteri and TexParameterf, and by the {@code params} parameter of TexParameteriv and TexParameterfv,
        when their {@code pname} parameter is TEXTURE_WRAP_S, TEXTURE_WRAP_T, or TEXTURE_WRAP_R.
        """,

        "CLAMP_TO_EDGE"..0x812F
    )

    // SGIS_texture_lod

    IntConstant(
        "Accepted by the {@code pname} parameter of TexParameteri, TexParameterf, TexParameteriv, TexParameterfv, GetTexParameteriv, and GetTexParameterfv.",

        "TEXTURE_MIN_LOD"..0x813A,
        "TEXTURE_MAX_LOD"..0x813B,
        "TEXTURE_BASE_LEVEL"..0x813C,
        "TEXTURE_MAX_LEVEL"..0x813D
    )

    // EXT_draw_range_elements

    IntConstant(
        "Recommended maximum amounts of vertex and index data.",

        "MAX_ELEMENTS_VERTICES"..0x80E8,
        "MAX_ELEMENTS_INDICES"..0x80E9
    )

    GL12C reuse "DrawRangeElements"
}