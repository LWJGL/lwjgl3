/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL46 = "GL46".nativeClassGL("GL46") {
    extends = GL45
    documentation =
        """
        The OpenGL functionality up to version 4.6. Includes the deprecated symbols of the Compatibility Profile.

        OpenGL 4.6 implementations support revision 4.60 of the OpenGL Shading Language.

        Extensions promoted to core in this release:
        ${ul(

            registryLinkTo("ARB", "indirect_parameters"),
            registryLinkTo("ARB", "pipeline_statistics_query"),
            registryLinkTo("ARB", "polygon_offset_clamp"),
            registryLinkTo("KHR", "no_error"),
            registryLinkTo("ARB", "shader_atomic_counter_ops"),
            registryLinkTo("ARB", "shader_draw_parameters"),
            registryLinkTo("ARB", "shader_group_vote"),
            registryLinkTo("ARB", "gl_spirv"),
            registryLinkTo("ARB", "spirv_extensions"),
            registryLinkTo("ARB", "texture_filter_anisotropic"),
            registryLinkTo("ARB", "transform_feedback_overflow_query")
        )}
        """

    // ARB_indirect_parameters

    IntConstant(
        """
        Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv,
        MapBufferRange, FlushMappedBufferRange, GetBufferParameteriv, and CopyBufferSubData.
        """,

        "PARAMETER_BUFFER"..0x80EE
    )

    IntConstant(
        "Accepted by the {@code value} parameter of GetIntegerv, GetBooleanv, GetFloatv, and GetDoublev.",

        "PARAMETER_BUFFER_BINDING"..0x80EF
    )

    GL46C reuse "MultiDrawArraysIndirectCount"
    GL46C reuse "MultiDrawElementsIndirectCount"

    // ARB_pipeline_statistics_query

    IntConstant(
        """
        Accepted by the {@code target} parameter of #BeginQuery(), #EndQuery(), #GetQueryiv(),
        #BeginQueryIndexed(), #EndQueryIndexed() and #GetQueryIndexediv().
        """,

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
        "Accepted by the {@code pname} parameters of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.",

        "POLYGON_OFFSET_CLAMP"..0x8E1B
    )

    GL46C reuse "PolygonOffsetClamp"

    // KHR_no_error

    IntConstant(
        "If set in #CONTEXT_FLAGS, then no error behavior is enabled for this context.",

        "CONTEXT_FLAG_NO_ERROR_BIT"..0x00000008
    )

    // ARB_gl_spirv

    IntConstant(
        "Accepted by the {@code binaryformat} parameter of #ShaderBinary().",

        "SHADER_BINARY_FORMAT_SPIR_V"..0x9551
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of #GetShaderiv().",

        "SPIR_V_BINARY"..0x9552
    )

    GL46C reuse "SpecializeShader"

    // ARB_spirv_extensions

    IntConstant(
        "Accepted by the {@code name} parameter of #GetStringi().",

        "SPIR_V_EXTENSIONS"..0x9553
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of #GetIntegerv().",

        "NUM_SPIR_V_EXTENSIONS"..0x9554
    )

    // ARB_texture_filter_anisotropic

    IntConstant(
        "Accepted by the {@code pname} parameters of GetTexParameterfv, GetTexParameteriv, TexParameterf, TexParameterfv, TexParameteri, and TexParameteriv.",

        "TEXTURE_MAX_ANISOTROPY"..0x84FE
    )

    IntConstant(
        "Accepted by the {@code pname} parameters of GetBooleanv, GetDoublev, GetFloatv, and GetIntegerv.",

        "MAX_TEXTURE_MAX_ANISOTROPY"..0x84FF
    )

    // ARB_transform_feedback_overflow_query

    IntConstant(
        """
        Accepted by the {@code target} parameter of #BeginQuery(), #EndQuery(), #GetQueryiv(),
        #BeginQueryIndexed(), #EndQueryIndexed() and #GetQueryIndexediv().
        """,

        "TRANSFORM_FEEDBACK_OVERFLOW"..0x82EC,
        "TRANSFORM_FEEDBACK_STREAM_OVERFLOW"..0x82ED
    )
}