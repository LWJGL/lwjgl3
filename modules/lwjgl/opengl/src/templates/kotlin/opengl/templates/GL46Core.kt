/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL46C = "GL46C".nativeClassGL("GL46C") {
    extends = GL45C

    // ARB_indirect_parameters

    IntConstant(
        "PARAMETER_BUFFER"..0x80EE
    )

    IntConstant(
        "PARAMETER_BUFFER_BINDING"..0x80EF
    )

    var src = GL43["MultiDrawArraysIndirect"]
    void(
        "MultiDrawArraysIndirectCount",

        src["mode"],
        Check("maxdrawcount * (stride == 0 ? (4 * 4) : stride)")..MultiType(
            PointerMapping.DATA_INT
        )..RawPointer..void.const.p("indirect"),
        GLintptr("drawcount"),
        GLsizei("maxdrawcount"),
        src["stride"]
    )

    src = GL43["MultiDrawElementsIndirect"]
    void(
        "MultiDrawElementsIndirectCount",

        src["mode"],
        src["type"],
        Check("maxdrawcount * (stride == 0 ? (5 * 4) : stride)")..MultiType(
            PointerMapping.DATA_INT
        )..RawPointer..void.const.p("indirect"),
        GLintptr("drawcount"),
        GLsizei("maxdrawcount"),
        src["stride"]
    )

    // ARB_pipeline_statistics_query

    IntConstant(
        "VERTICES_SUBMITTED"..0x82EE,
        "PRIMITIVES_SUBMITTED"..0x82EF,
        "VERTEX_SHADER_INVOCATIONS"..0x82F0,
        "TESS_CONTROL_SHADER_PATCHES"..0x82F1,
        "TESS_EVALUATION_SHADER_INVOCATIONS"..0x82F2,
        "GEOMETRY_SHADER_PRIMITIVES_EMITTED"..0x82F3,
        "FRAGMENT_SHADER_INVOCATIONS"..0x82F4,
        "COMPUTE_SHADER_INVOCATIONS"..0x82F5,
        "CLIPPING_INPUT_PRIMITIVES"..0x82F6,
        "CLIPPING_OUTPUT_PRIMITIVES"..0x82F7
    )

    // ARB_polygon_offset_clamp

    IntConstant(
        "POLYGON_OFFSET_CLAMP"..0x8E1B
    )

    void(
        "PolygonOffsetClamp",

        GLfloat("factor"),
        GLfloat("units"),
        GLfloat("clamp")
    )

    // KHR_no_error

    IntConstant(
        "CONTEXT_FLAG_NO_ERROR_BIT"..0x00000008
    )

    // ARB_gl_spirv

    IntConstant(
        "SHADER_BINARY_FORMAT_SPIR_V"..0x9551
    )

    IntConstant(
        "SPIR_V_BINARY"..0x9552
    )

    void(
        "SpecializeShader",

        GLuint("shader"),
        GLcharUTF8.const.p("pEntryPoint"),
        AutoSize("pConstantIndex", "pConstantValue")..GLuint("numSpecializationConstants"),
        nullable..GLuint.const.p("pConstantIndex"),
        nullable..GLuint.const.p("pConstantValue")
    )

    // ARB_spirv_extensions

    IntConstant(
        "SPIR_V_EXTENSIONS"..0x9553
    )

    IntConstant(
        "NUM_SPIR_V_EXTENSIONS"..0x9554
    )

    // ARB_texture_filter_anisotropic

    IntConstant(
        "TEXTURE_MAX_ANISOTROPY"..0x84FE
    )

    IntConstant(
        "MAX_TEXTURE_MAX_ANISOTROPY"..0x84FF
    )

    // ARB_transform_feedback_overflow_query

    IntConstant(
        "TRANSFORM_FEEDBACK_OVERFLOW"..0x82EC,
        "TRANSFORM_FEEDBACK_STREAM_OVERFLOW"..0x82ED
    )
}