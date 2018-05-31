/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL46C = "GL46C".nativeClassGL("GL46C") {
    extends = GL45C
    documentation =
        """
        The OpenGL functionality up to version 4.6. Includes only Core Profile symbols.

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

    var src = GL43["MultiDrawArraysIndirect"]
    void(
        "MultiDrawArraysIndirectCount",
        """
        Behaves similarly to #MultiDrawArraysIndirect(), except that {@code drawcount} defines an offset (in bytes) into the buffer object bound to the
        #PARAMETER_BUFFER binding point at which a single {@code sizei} typed value is stored, which contains the draw count. {@code maxdrawcount} specifies
        the maximum number of draws that are expected to be stored in the buffer. If the value stored at {@code drawcount} into the buffer is greater than
        {@code maxdrawcount}, the implementation stops processing draws after {@code maxdrawcount} parameter sets. {@code drawcount} must be a multiple of
        four.
        """,

        src["mode"],
        Check("maxdrawcount * (stride == 0 ? (4 * 4) : stride)")..MultiType(
            PointerMapping.DATA_INT
        )..DRAW_INDIRECT_BUFFER..void.const.p.IN("indirect", "an array of structures containing the draw parameters"),
        GLintptr.IN("drawcount", "the offset into the parameter buffer object"),
        GLsizei.IN("maxdrawcount", "the maximum number of draws"),
        src["stride"]
    )

    src = GL43["MultiDrawElementsIndirect"]
    void(
        "MultiDrawElementsIndirectCount",
        """
        Behaves similarly to #MultiDrawElementsIndirect(), except that {@code drawcount} defines an offset (in bytes) into the buffer object bound to the
        #PARAMETER_BUFFER binding point at which a single {@code sizei} typed value is stored, which contains the draw count. {@code maxdrawcount} specifies
        the maximum number of draws that are expected to be stored in the buffer. If the value stored at {@code drawcount} into the buffer is greater than
        {@code maxdrawcount}, the implementation stops processing draws after {@code maxdrawcount} parameter sets. {@code drawcount} must be a multiple of
        four.
        """,

        src["mode"],
        src["type"],
        Check("maxdrawcount * (stride == 0 ? (5 * 4) : stride)")..MultiType(
            PointerMapping.DATA_INT
        )..DRAW_INDIRECT_BUFFER..void.const.p.IN("indirect", "a structure containing an array of draw parameters"),
        GLintptr.IN("drawcount", "the offset into the parameter buffer object"),
        GLsizei.IN("maxdrawcount", "the maximum number of draws"),
        src["stride"]
    )

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

    void(
        "PolygonOffsetClamp",
        """
        The depth values of all fragments generated by the rasterization of a polygon may be offset by a single value that is computed for that polygon. This
        function determines this value.

        {@code factor} scales the maximum depth slope of the polygon, and {@code units} scales an implementation-dependent constant that relates to the usable
        resolution of the depth buffer. The resulting values are summed to produce the polygon offset value, which may then be clamped to a minimum or maximum
        value specified by {@code clamp}.

        The values {@code factor}, {@code units}, and {@code clamp} may each be positive, negative, or zero. Calling the command #PolygonOffset() is equivalent
        to calling the command {@code PolygonOffsetClamp} with clamp equal to zero.
        """,

        GLfloat.IN("factor", "scales the maximum depth slope of the polygon"),
        GLfloat.IN("units", "scales an implementation-dependent constant that relates to the usable resolution of the depth buffer"),
        GLfloat.IN("clamp", "the minimum or maximum polygon offset value")
    )

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

    void(
        "SpecializeShader",
        """
        Specializes a shader created from a SPIR-V module.

        Shaders associated with SPIR-V modules must be specialized before they can be linked into a program object. It is not necessary to specialize the
        shader before it is attached to a program object. Once specialized, a shader may not be specialized again without first re-associating the original
        SPIR-V module with it, through #ShaderBinary().

        Specialization does two things:
        ${ul(
            "Selects the name of the entry point, for that shader’s stage, from the SPIR-V module.",
            "Sets the values of all, or a subset of, the specialization constants in the SPIRV module."
        )}

        On successful shader specialization, the compile status for shader is set to #TRUE. On failure, the compile status for shader is set to #FALSE and
        additional information about the cause of the failure may be available in the shader compilation log.
        """,

        GLuint.IN(
            "shader",
            """
            the name of a shader object containing unspecialized SPIR-V as created from a successful call to #ShaderBinary() to which a SPIR-V module was
            passed
            """
        ),
        GLcharUTF8.const.p.IN(
            "pEntryPoint",
            "a pointer to a null-terminated UTF-8 string specifying the name of the entry point in the SPIR-V module to use for this shader"
        ),
        AutoSize("pConstantIndex", "pConstantValue")..GLuint.IN(
            "numSpecializationConstants",
            "the number of specialization constants whose values to set in this call"
        ),
        GLuint.const.p.IN(
            "pConstantIndex",
            """
            is a pointer to an array of {@code numSpecializationConstants} unsigned integers, each holding the index of a specialization constant in the SPIR-V
            module whose value to set.

            Specialization constants not referenced by {@code pConstantIndex} retain their default values as specified in the SPIR-V module.
            """
        ),
        GLuint.const.p.IN(
            "pConstantValue",
            """
            an entry in {@code pConstantValue} is used to set the value of the specialization constant indexed by the corresponding entry in
            {@code pConstantIndex}.

            Although this array is of unsigned integer, each entry is bitcast to the appropriate type for the module, and therefore, floating-point constants
            may be set by including their IEEE-754 bit representation in the {@code pConstantValue} array.
            """
        )
    )

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