/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL33C = "GL33C".nativeClassGL("GL33C") {
    extends = GL32C

    // ARB_blend_func_extended

    IntConstant(
        "SRC1_COLOR"..0x88F9,
        "ONE_MINUS_SRC1_COLOR"..0x88FA,
        "ONE_MINUS_SRC1_ALPHA"..0x88FB
    )

    IntConstant(
        "MAX_DUAL_SOURCE_DRAW_BUFFERS"..0x88FC
    )

    void(
        "BindFragDataLocationIndexed",

        GLuint("program"),
        GLuint("colorNumber"),
        GLuint("index"),
        GLcharASCII.const.p("name")
    )

    GLint(
        "GetFragDataIndex",

        GLuint("program"),
        GLcharASCII.const.p("name")
    )

    // ARB_occlusion_query2

    IntConstant(
        "ANY_SAMPLES_PASSED"..0x8C2F
    )

    // ARB_sampler_objects

    IntConstant(
        "SAMPLER_BINDING"..0x8919
    )

    void(
        "GenSamplers",

        AutoSize("samplers")..GLsizei("count"),
        ReturnParam..GLuint.p("samplers")
    )

    void(
        "DeleteSamplers",

        AutoSize("samplers")..GLsizei("count"),
        SingleValue("sampler")..GLuint.const.p("samplers")
    )

    GLboolean(
        "IsSampler",

        GLuint("sampler")
    )

    void(
        "BindSampler",

        GLuint("unit"),
        GLuint("sampler")
    )

    val SamplerParameters =
        """
        #TEXTURE_WRAP_S #TEXTURE_WRAP_T #TEXTURE_WRAP_R #TEXTURE_MIN_FILTER #TEXTURE_MAG_FILTER #TEXTURE_MIN_LOD
        #TEXTURE_MAX_LOD #TEXTURE_LOD_BIAS #TEXTURE_COMPARE_MODE #TEXTURE_COMPARE_FUNC
        """

    void(
        "SamplerParameteri",

        GLuint("sampler"),
        GLenum("pname"),
        GLint("param")
    )

    void(
        "SamplerParameterf",

        GLuint("sampler"),
        GLenum("pname"),
        GLfloat("param")
    )

    void(
        "SamplerParameteriv",

        GLuint("sampler"),
        GLenum("pname"),
        Check(1)..GLint.const.p("params")
    )

    void(
        "SamplerParameterfv",

        GLuint("sampler"),
        GLenum("pname"),
        Check(1)..GLfloat.const.p("params")
    )

    void(
        "SamplerParameterIiv",

        GLuint("sampler"),
        GLenum("pname"),
        Check(1)..GLint.const.p("params")
    )

    void(
        "SamplerParameterIuiv",

        GLuint("sampler"),
        GLenum("pname"),
        Check(1)..GLuint.const.p("params")
    )

    void(
        "GetSamplerParameteriv",

        GLuint("sampler"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLint.p("params")
    )

    void(
        "GetSamplerParameterfv",

        GLuint("sampler"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLfloat.p("params")
    )

    void(
        "GetSamplerParameterIiv",

        GLuint("sampler"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLint.p("params")
    )

    void(
        "GetSamplerParameterIuiv",

        GLuint("sampler"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLuint.p("params")
    )

    // ARB_texture_rgb10_a2ui

    IntConstant(
        "RGB10_A2UI"..0x906F
    )

    // ARB_texture_swizzle

    IntConstant(
        "TEXTURE_SWIZZLE_R"..0x8E42,
        "TEXTURE_SWIZZLE_G"..0x8E43,
        "TEXTURE_SWIZZLE_B"..0x8E44,
        "TEXTURE_SWIZZLE_A"..0x8E45
    )

    IntConstant(
        "TEXTURE_SWIZZLE_RGBA"..0x8E46
    )

    // ARB_timer_query

    IntConstant(
        "TIME_ELAPSED"..0x88BF
    )

    IntConstant(
        "TIMESTAMP"..0x8E28
    )

    void(
        "QueryCounter",

        GLuint("id"),
        GLenum("target")
    )

    void(
        "GetQueryObjecti64v",

        GLuint("id"),
        GLenum("pname"),
        RawPointer..Check(1)..ReturnParam..GLint64.p("params")
    )

    void(
        "GetQueryObjectui64v",

        GLuint("id"),
        GLenum("pname"),
        RawPointer..Check(1)..ReturnParam..GLuint64.p("params")
    )

    // ARB_instanced_arrays

    IntConstant(
        "VERTEX_ATTRIB_ARRAY_DIVISOR"..0x88FE
    )

    void(
        "VertexAttribDivisor",

        GLuint("index"),
        GLuint("divisor")
    )

    // ARB_vertex_type_2_10_10_10_rev

    IntConstant(
        "INT_2_10_10_10_REV"..0x8D9F
    )

    void("VertexAttribP1ui", GLuint("index"), GLenum("type"), GLboolean("normalized"), GLuint("value"))
    void("VertexAttribP2ui", GLuint("index"), GLenum("type"), GLboolean("normalized"), GLuint("value"))
    void("VertexAttribP3ui", GLuint("index"), GLenum("type"), GLboolean("normalized"), GLuint("value"))
    void("VertexAttribP4ui", GLuint("index"), GLenum("type"), GLboolean("normalized"), GLuint("value"))

    void("VertexAttribP1uiv", GLuint("index"), GLenum("type"), GLboolean("normalized"), Check(1)..GLuint.const.p("value"))
    void("VertexAttribP2uiv", GLuint("index"), GLenum("type"), GLboolean("normalized"), Check(1)..GLuint.const.p("value"))
    void("VertexAttribP3uiv", GLuint("index"), GLenum("type"), GLboolean("normalized"), Check(1)..GLuint.const.p("value"))
    void("VertexAttribP4uiv", GLuint("index"), GLenum("type"), GLboolean("normalized"), Check(1)..GLuint.const.p("value"))
}