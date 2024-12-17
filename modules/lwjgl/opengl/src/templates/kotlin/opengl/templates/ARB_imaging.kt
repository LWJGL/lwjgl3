/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_imaging = "ARBImaging".nativeClassGL("ARB_imaging") {
    // SGI_color_table

    IntConstant(
        "COLOR_TABLE"..0x80D0,
        "POST_CONVOLUTION_COLOR_TABLE"..0x80D1,
        "POST_COLOR_MATRIX_COLOR_TABLE"..0x80D2
    )

    IntConstant(
        "PROXY_COLOR_TABLE"..0x80D3,
        "PROXY_POST_CONVOLUTION_COLOR_TABLE"..0x80D4,
        "PROXY_POST_COLOR_MATRIX_COLOR_TABLE"..0x80D5
    )

    IntConstant(
        "COLOR_TABLE_SCALE"..0x80D6,
        "COLOR_TABLE_BIAS"..0x80D7
    )

    IntConstant(
        "COLOR_TABLE_FORMAT"..0x80D8,
        "COLOR_TABLE_WIDTH"..0x80D9,
        "COLOR_TABLE_RED_SIZE"..0x80DA,
        "COLOR_TABLE_GREEN_SIZE"..0x80DB,
        "COLOR_TABLE_BLUE_SIZE"..0x80DC,
        "COLOR_TABLE_ALPHA_SIZE"..0x80DD,
        "COLOR_TABLE_LUMINANCE_SIZE"..0x80DE,
        "COLOR_TABLE_INTENSITY_SIZE"..0x80DF
    )

    IntConstant(
        "TABLE_TOO_LARGE"..0x8031
    )

    DeprecatedGL..void(
        "ColorTable",

        GLenum("target"),
        GLenum("internalformat"),
        GLsizei("width"),
        GLenum("format"),
        GLenum("type"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..RawPointer..void.const.p("table")
    )

    DeprecatedGL..void(
        "CopyColorTable",

        GLenum("target"),
        GLenum("internalformat"),
        GLint("x"),
        GLint("y"),
        GLsizei("width")
    )

    DeprecatedGL..void(
        "ColorTableParameteriv",

        GLenum("target"),
        GLenum("pname"),
        Check(4)..GLint.const.p("params")
    )

    DeprecatedGL..void(
        "ColorTableParameterfv",

        GLenum("target"),
        GLenum("pname"),
        Check(4)..GLfloat.const.p("params")
    )

    DeprecatedGL..void(
        "GetColorTable",

        GLenum("target"),
        GLenum("format"),
        GLenum("type"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT
        )..Unsafe..RawPointer..void.p("table")
    )

    DeprecatedGL..void(
        "GetColorTableParameteriv",

        GLenum("target"),
        GLenum("pname"),
        Check(4)..ReturnParam..GLint.p("params")
    )

    DeprecatedGL..void(
        "GetColorTableParameterfv",

        GLenum("target"),
        GLenum("pname"),
        Check(4)..ReturnParam..GLfloat.p("params")
    )

    // EXT_color_subtable

    DeprecatedGL..void(
        "ColorSubTable",

        GLenum("target"),
        GLsizei("start"),
        GLsizei("count"),
        GLenum("format"),
        GLenum("type"),
        Unsafe..RawPointer..void.const.p("data")
    )

    DeprecatedGL..void(
        "CopyColorSubTable",

        GLenum("target"),
        GLsizei("start"),
        GLint("x"),
        GLint("y"),
        GLsizei("width")
    )

    // EXT_convolution

    IntConstant(
        "CONVOLUTION_1D"..0x8010
    )

    IntConstant(
        "CONVOLUTION_2D"..0x8011
    )

    IntConstant(
        "SEPARABLE_2D"..0x8012
    )

    IntConstant(
        "CONVOLUTION_BORDER_MODE"..0x8013
    )

    IntConstant(
        "CONVOLUTION_FILTER_SCALE"..0x8014,
        "CONVOLUTION_FILTER_BIAS"..0x8015
    )

    IntConstant(
        "REDUCE"..0x8016
    )

    IntConstant(
        "CONVOLUTION_FORMAT"..0x8017,
        "CONVOLUTION_WIDTH"..0x8018,
        "CONVOLUTION_HEIGHT"..0x8019,
        "MAX_CONVOLUTION_WIDTH"..0x801A,
        "MAX_CONVOLUTION_HEIGHT"..0x801B
    )

    IntConstant(
        "POST_CONVOLUTION_RED_SCALE"..0x801C,
        "POST_CONVOLUTION_GREEN_SCALE"..0x801D,
        "POST_CONVOLUTION_BLUE_SCALE"..0x801E,
        "POST_CONVOLUTION_ALPHA_SCALE"..0x801F,
        "POST_CONVOLUTION_RED_BIAS"..0x8020,
        "POST_CONVOLUTION_GREEN_BIAS"..0x8021,
        "POST_CONVOLUTION_BLUE_BIAS"..0x8022,
        "POST_CONVOLUTION_ALPHA_BIAS"..0x8023
    )

    DeprecatedGL..void(
        "ConvolutionFilter1D",

        GLenum("target"),
        GLenum("internalformat"),
        GLsizei("width"),
        GLenum("format"),
        GLenum("type"),
        Unsafe..RawPointer..void.const.p("data")
    )

    DeprecatedGL..void(
        "ConvolutionFilter2D",

        GLenum("target"),
        GLenum("internalformat"),
        GLsizei("width"),
        GLsizei("height"),
        GLenum("format"),
        GLenum("type"),
        Unsafe..RawPointer..void.const.p("data")
    )

    DeprecatedGL..void(
        "CopyConvolutionFilter1D",

        GLenum("target"),
        GLenum("internalformat"),
        GLint("x"),
        GLint("y"),
        GLsizei("width")
    )

    DeprecatedGL..void(
        "CopyConvolutionFilter2D",

        GLenum("target"),
        GLenum("internalformat"),
        GLint("x"),
        GLint("y"),
        GLsizei("width"),
        GLsizei("height")
    )

    DeprecatedGL..void(
        "GetConvolutionFilter",

        GLenum("target"),
        GLenum("format"),
        GLenum("type"),
        Unsafe..RawPointer..void.p("image")
    )

    DeprecatedGL..void(
        "SeparableFilter2D",

        GLenum("target"),
        GLenum("internalformat"),
        GLsizei("width"),
        GLsizei("height"),
        GLenum("format"),
        GLenum("type"),
        Unsafe..RawPointer..void.const.p("row"),
        Unsafe..RawPointer..void.const.p("column")
    )

    DeprecatedGL..void(
        "GetSeparableFilter",

        GLenum("target"),
        GLenum("format"),
        GLenum("type"),
        Unsafe..RawPointer..void.p("row"),
        Unsafe..RawPointer..void.p("column"),
        Unsafe..nullable..void.p("span")
    )

    DeprecatedGL..void(
        "ConvolutionParameteri",

        GLenum("target"),
        GLenum("pname"),
        GLint("param")
    )

    DeprecatedGL..void(
        "ConvolutionParameteriv",

        GLenum("target"),
        GLenum("pname"),
        Check(4)..GLint.const.p("params")
    )

    DeprecatedGL..void(
        "ConvolutionParameterf",

        GLenum("target"),
        GLenum("pname"),
        GLfloat("param")
    )

    DeprecatedGL..void(
        "ConvolutionParameterfv",

        GLenum("target"),
        GLenum("pname"),
        Check(4)..GLfloat.const.p("params")
    )

    DeprecatedGL..void(
        "GetConvolutionParameteriv",

        GLenum("target"),
        GLenum("pname"),
        ReturnParam..Check(4)..GLint.p("params")
    )

    DeprecatedGL..void(
        "GetConvolutionParameterfv",

        GLenum("target"),
        GLenum("pname"),
        ReturnParam..Check(4)..GLfloat.p("params")
    )

    // HP_convolution_border_modes

    IntConstant(
        //"IGNORE_BORDER"..0x8150,
        "CONSTANT_BORDER"..0x8151,
        "REPLICATE_BORDER"..0x8153
    )

    IntConstant(
        "CONVOLUTION_BORDER_COLOR"..0x8154
    )

    // SGI_color_matrix

    IntConstant(
        "COLOR_MATRIX"..0x80B1,
        "COLOR_MATRIX_STACK_DEPTH"..0x80B2,
        "MAX_COLOR_MATRIX_STACK_DEPTH"..0x80B3
    )

    IntConstant(
        "POST_COLOR_MATRIX_RED_SCALE"..0x80B4,
        "POST_COLOR_MATRIX_GREEN_SCALE"..0x80B5,
        "POST_COLOR_MATRIX_BLUE_SCALE"..0x80B6,
        "POST_COLOR_MATRIX_ALPHA_SCALE"..0x80B7,
        "POST_COLOR_MATRIX_RED_BIAS"..0x80B8,
        "POST_COLOR_MATRIX_GREEN_BIAS"..0x80B9,
        "POST_COLOR_MATRIX_BLUE_BIAS"..0x80BA,
        "POST_COLOR_MATRIX_ALPHA_BIAS"..0x80BB
    )

    // EXT_histogram

    IntConstant(
        "HISTOGRAM"..0x8024
    )

    IntConstant(
        "PROXY_HISTOGRAM"..0x8025
    )

    IntConstant(
        "HISTOGRAM_WIDTH"..0x8026,
        "HISTOGRAM_FORMAT"..0x8027,
        "HISTOGRAM_RED_SIZE"..0x8028,
        "HISTOGRAM_GREEN_SIZE"..0x8029,
        "HISTOGRAM_BLUE_SIZE"..0x802A,
        "HISTOGRAM_ALPHA_SIZE"..0x802B,
        "HISTOGRAM_LUMINANCE_SIZE"..0x802C,
        "HISTOGRAM_SINK"..0x802D
    )

    IntConstant(
        "MINMAX"..0x802E
    )

    IntConstant(
        "MINMAX_FORMAT"..0x802F,
        "MINMAX_SINK"..0x8030
    )

    DeprecatedGL..void(
        "Histogram",

        GLenum("target"),
        GLsizei("width"),
        GLenum("internalformat"),
        GLboolean("sink")
    )

    DeprecatedGL..void(
        "ResetHistogram",

        GLenum("target")
    )

    DeprecatedGL..void(
        "GetHistogram",

        GLenum("target"),
        GLboolean("reset"),
        GLenum("format"),
        GLenum("type"),
        Unsafe..RawPointer..void.p("values")
    )

    DeprecatedGL..void(
        "GetHistogramParameteriv",

        GLenum("target"),
        GLenum("pname"),
        ReturnParam..Check(1)..GLint.p("params")
    )

    DeprecatedGL..void(
        "GetHistogramParameterfv",

        GLenum("target"),
        GLenum("pname"),
        ReturnParam..Check(1)..GLfloat.p("params")
    )

    DeprecatedGL..void(
        "Minmax",

        GLenum("target"),
        GLenum("internalformat"),
        GLboolean("sink")
    )

    DeprecatedGL..void(
        "ResetMinmax",

        GLenum("target")
    )

    DeprecatedGL..void(
        "GetMinmax",

        GLenum("target"),
        GLboolean("reset"),
        GLenum("format"),
        GLenum("type"),
        Unsafe..RawPointer..void.p("values")
    )

    DeprecatedGL..void(
        "GetMinmaxParameteriv",

        GLenum("target"),
        GLenum("pname"),
        ReturnParam..Check(1)..GLint.p("params")
    )

    DeprecatedGL..void(
        "GetMinmaxParameterfv",

        GLenum("target"),
        GLenum("pname"),
        ReturnParam..Check(1)..GLfloat.p("params")
    )

    // EXT_blend_color

    IntConstant(
        "CONSTANT_COLOR"..0x8001,
        "ONE_MINUS_CONSTANT_COLOR"..0x8002,
        "CONSTANT_ALPHA"..0x8003,
        "ONE_MINUS_CONSTANT_ALPHA"..0x8004
    )

    IntConstant(
        "BLEND_COLOR"..0x8005
    )

    reuse(GL14C, "BlendColor")

    // EXT_blend_minmax

    IntConstant(
        "FUNC_ADD"..0x8006,
        "MIN"..0x8007,
        "MAX"..0x8008
    )

    IntConstant(
        "BLEND_EQUATION"..0x8009
    )

    // EXT_blend_subtract

    IntConstant(
        "FUNC_SUBTRACT"..0x800A,
        "FUNC_REVERSE_SUBTRACT"..0x800B
    )

    reuse(GL14C, "BlendEquation")
}