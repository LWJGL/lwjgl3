/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL14C = "GL14C".nativeClassGL("GL14C") {
    extends = GL13C

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

    void(
        "BlendColor",

        GLfloat("red"),
        GLfloat("green"),
        GLfloat("blue"),
        GLfloat("alpha")
    )

    // EXT_blend_minmax

    IntConstant(
        "FUNC_ADD"..0x8006,
        "MIN"..0x8007,
        "MAX"..0x8008
    )

    IntConstant(
        "BLEND_EQUATION"..0x8009
    )

    void(
        "BlendEquation",

        GLenum("mode")
    )

    // EXT_blend_subtract

    IntConstant(
        "FUNC_SUBTRACT"..0x800A,
        "FUNC_REVERSE_SUBTRACT"..0x800B
    )

    // ARB_depth_texture

    IntConstant(
        "DEPTH_COMPONENT16"..0x81A5,
        "DEPTH_COMPONENT24"..0x81A6,
        "DEPTH_COMPONENT32"..0x81A7
    )

    IntConstant(
        "TEXTURE_DEPTH_SIZE"..0x884A
    )

    // ARB_shadow

    IntConstant(
        "TEXTURE_COMPARE_MODE"..0x884C,
        "TEXTURE_COMPARE_FUNC"..0x884D
    )

    // EXT_multi_draw_arrays

    void(
        "MultiDrawArrays",

        GLenum("mode"),
        GLint.const.p("first"),
        GLsizei.const.p("count"),
        AutoSize("first", "count")..GLsizei("drawcount")
    )

    void(
        "MultiDrawElements",

        GLenum("mode"),
        GLsizei.p("count"),
        GLenum("type"),
        void.const.p.p("indices"),
        AutoSize("count", "indices")..GLsizei("drawcount")
    )

    // ARB_point_parameters

    IntConstant(
        "POINT_FADE_THRESHOLD_SIZE"..0x8128
    )

    void(
        "PointParameterf",

        GLenum("pname"),
        GLfloat("param")
    )

    void(
        "PointParameteri",

        GLenum("pname"),
        GLint("param")
    )

    void(
        "PointParameterfv",

        GLenum("pname"),
        Check(3)..GLfloat.const.p("params")
    )

    void(
        "PointParameteriv",

        GLenum("pname"),
        Check(3)..GLint.const.p("params")
    )

    // EXT_blend_func_separate

    IntConstant(
        "BLEND_DST_RGB"..0x80C8,
        "BLEND_SRC_RGB"..0x80C9,
        "BLEND_DST_ALPHA"..0x80CA,
        "BLEND_SRC_ALPHA"..0x80CB
    )

    void(
        "BlendFuncSeparate",

        GLenum("sfactorRGB"),
        GLenum("dfactorRGB"),
        GLenum("sfactorAlpha"),
        GLenum("dfactorAlpha")
    )

    // EXT_stencil_wrap

    IntConstant(
        "INCR_WRAP"..0x8507,
        "DECR_WRAP"..0x8508
    )

    // EXT_texture_lod_bias

    IntConstant(
        "TEXTURE_LOD_BIAS"..0x8501
    )

    IntConstant(
        "MAX_TEXTURE_LOD_BIAS"..0x84FD
    )

    // ARB_texture_mirrored_repeat

    IntConstant(
        "MIRRORED_REPEAT"..0x8370
    )

}