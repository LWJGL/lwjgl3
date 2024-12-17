/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL33 = "GL33".nativeClassGL("GL33") {
    extends = GL32

    // ARB_blend_func_extended

    IntConstant(
        "SRC1_COLOR"..0x88F9,
        "ONE_MINUS_SRC1_COLOR"..0x88FA,
        "ONE_MINUS_SRC1_ALPHA"..0x88FB
    )

    IntConstant(
        "MAX_DUAL_SOURCE_DRAW_BUFFERS"..0x88FC
    )

    reuse(GL33C, "BindFragDataLocationIndexed")
    reuse(GL33C, "GetFragDataIndex")

    // ARB_occlusion_query2

    IntConstant(
        "ANY_SAMPLES_PASSED"..0x8C2F
    )

    // ARB_sampler_objects

    IntConstant(
        "SAMPLER_BINDING"..0x8919
    )

    reuse(GL33C, "GenSamplers")
    reuse(GL33C, "DeleteSamplers")
    reuse(GL33C, "IsSampler")
    reuse(GL33C, "BindSampler")
    reuse(GL33C, "SamplerParameteri")
    reuse(GL33C, "SamplerParameterf")
    reuse(GL33C, "SamplerParameteriv")
    reuse(GL33C, "SamplerParameterfv")
    reuse(GL33C, "SamplerParameterIiv")
    reuse(GL33C, "SamplerParameterIuiv")
    reuse(GL33C, "GetSamplerParameteriv")
    reuse(GL33C, "GetSamplerParameterfv")
    reuse(GL33C, "GetSamplerParameterIiv")
    reuse(GL33C, "GetSamplerParameterIuiv")

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

    reuse(GL33C, "QueryCounter")
    reuse(GL33C, "GetQueryObjecti64v")
    reuse(GL33C, "GetQueryObjectui64v")

    // ARB_instanced_arrays

    IntConstant(
        "VERTEX_ATTRIB_ARRAY_DIVISOR"..0x88FE
    )

    reuse(GL33C, "VertexAttribDivisor")

    // ARB_vertex_type_2_10_10_10_rev

    IntConstant(
        "INT_2_10_10_10_REV"..0x8D9F
    )

    DeprecatedGL..void("VertexP2ui", GLenum("type"), GLuint("value"))
    DeprecatedGL..void("VertexP3ui", GLenum("type"), GLuint("value"))
    DeprecatedGL..void("VertexP4ui", GLenum("type"), GLuint("value"))

    DeprecatedGL..void("VertexP2uiv", GLenum("type"), Check(1)..GLuint.const.p("value"))
    DeprecatedGL..void("VertexP3uiv", GLenum("type"), Check(1)..GLuint.const.p("value"))
    DeprecatedGL..void("VertexP4uiv", GLenum("type"), Check(1)..GLuint.const.p("value"))

    DeprecatedGL..void("TexCoordP1ui", GLenum("type"), GLuint("coords"))
    DeprecatedGL..void("TexCoordP2ui", GLenum("type"), GLuint("coords"))
    DeprecatedGL..void("TexCoordP3ui", GLenum("type"), GLuint("coords"))
    DeprecatedGL..void("TexCoordP4ui", GLenum("type"), GLuint("coords"))

    DeprecatedGL..void("TexCoordP1uiv", GLenum("type"), Check(1)..GLuint.const.p("coords"))
    DeprecatedGL..void("TexCoordP2uiv", GLenum("type"), Check(1)..GLuint.const.p("coords"))
    DeprecatedGL..void("TexCoordP3uiv", GLenum("type"), Check(1)..GLuint.const.p("coords"))
    DeprecatedGL..void("TexCoordP4uiv", GLenum("type"), Check(1)..GLuint.const.p("coords"))

    DeprecatedGL..void("MultiTexCoordP1ui", GLenum("texture"), GLenum("type"), GLuint("coords"))
    DeprecatedGL..void("MultiTexCoordP2ui", GLenum("texture"), GLenum("type"), GLuint("coords"))
    DeprecatedGL..void("MultiTexCoordP3ui", GLenum("texture"), GLenum("type"), GLuint("coords"))
    DeprecatedGL..void("MultiTexCoordP4ui", GLenum("texture"), GLenum("type"), GLuint("coords"))

    DeprecatedGL..void("MultiTexCoordP1uiv", GLenum("texture"), GLenum("type"), Check(1)..GLuint.const.p("coords"))
    DeprecatedGL..void("MultiTexCoordP2uiv", GLenum("texture"), GLenum("type"), Check(1)..GLuint.const.p("coords"))
    DeprecatedGL..void("MultiTexCoordP3uiv", GLenum("texture"), GLenum("type"), Check(1)..GLuint.const.p("coords"))
    DeprecatedGL..void("MultiTexCoordP4uiv", GLenum("texture"), GLenum("type"), Check(1)..GLuint.const.p("coords"))

    DeprecatedGL..void("NormalP3ui", GLenum("type"), GLuint("coords"))

    DeprecatedGL..void("NormalP3uiv", GLenum("type"), Check(1)..GLuint.const.p("coords"))

    DeprecatedGL..void("ColorP3ui", GLenum("type"), GLuint("color"))
    DeprecatedGL..void("ColorP4ui", GLenum("type"), GLuint("color"))

    DeprecatedGL..void("ColorP3uiv", GLenum("type"), Check(1)..GLuint.const.p("color"))
    DeprecatedGL..void("ColorP4uiv", GLenum("type"), Check(1)..GLuint.const.p("color"))

    DeprecatedGL..void("SecondaryColorP3ui", GLenum("type"), GLuint("color"))
    DeprecatedGL..void("SecondaryColorP3uiv", GLenum("type"), Check(1)..GLuint.const.p("color"))

    reuse(GL33C, "VertexAttribP1ui")
    reuse(GL33C, "VertexAttribP2ui")
    reuse(GL33C, "VertexAttribP3ui")
    reuse(GL33C, "VertexAttribP4ui")

    reuse(GL33C, "VertexAttribP1uiv")
    reuse(GL33C, "VertexAttribP2uiv")
    reuse(GL33C, "VertexAttribP3uiv")
    reuse(GL33C, "VertexAttribP4uiv")
}