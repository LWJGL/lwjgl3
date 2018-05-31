/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

const val SHADER_TYPES = "#VERTEX_SHADER #FRAGMENT_SHADER #GEOMETRY_SHADER #TESS_CONTROL_SHADER #TESS_EVALUATION_SHADER"

val GL20 = "GL20".nativeClassGL("GL20") {
    extends = GL15
    documentation =
        """
        The OpenGL functionality up to version 2.0. Includes the deprecated symbols of the Compatibility Profile.

        Extensions promoted to core in this release:
        ${ul(
            registryLinkTo("ARB", "shader_objects"),
            "${registryLinkTo("ARB", "vertex_shader")} and ${registryLinkTo("ARB", "fragment_shader")}",
            registryLinkTo("ARB", "shading_language_100"),
            registryLinkTo("ARB", "draw_buffers"),
            registryLinkTo("ARB", "texture_non_power_of_two"),
            registryLinkTo("ARB", "point_sprite"),
            "${registryLinkTo("ATI", "separate_stencil")} and ${registryLinkTo("EXT", "stencil_two_side")}"
        )}
        """

    // ARB_shading_language_100

    IntConstant(
        "Accepted by the {@code name} parameter of GetString.",

        "SHADING_LANGUAGE_VERSION"..0x8B8C
    )

    // ARB_shader_objects

    IntConstant(
        "Accepted by the {@code pname} parameter of GetInteger.",

        "CURRENT_PROGRAM"..0x8B8D
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetShaderiv.",

        "SHADER_TYPE"..0x8B4F,
        "DELETE_STATUS"..0x8B80,
        "COMPILE_STATUS"..0x8B81,
        "LINK_STATUS"..0x8B82,
        "VALIDATE_STATUS"..0x8B83,
        "INFO_LOG_LENGTH"..0x8B84,
        "ATTACHED_SHADERS"..0x8B85,
        "ACTIVE_UNIFORMS"..0x8B86,
        "ACTIVE_UNIFORM_MAX_LENGTH"..0x8B87,
        "ACTIVE_ATTRIBUTES"..0x8B89,
        "ACTIVE_ATTRIBUTE_MAX_LENGTH"..0x8B8A,
        "SHADER_SOURCE_LENGTH"..0x8B88
    )

    IntConstant(
        "Returned by the {@code type} parameter of GetActiveUniform.",

        "FLOAT_VEC2"..0x8B50,
        "FLOAT_VEC3"..0x8B51,
        "FLOAT_VEC4"..0x8B52,
        "INT_VEC2"..0x8B53,
        "INT_VEC3"..0x8B54,
        "INT_VEC4"..0x8B55,
        "BOOL"..0x8B56,
        "BOOL_VEC2"..0x8B57,
        "BOOL_VEC3"..0x8B58,
        "BOOL_VEC4"..0x8B59,
        "FLOAT_MAT2"..0x8B5A,
        "FLOAT_MAT3"..0x8B5B,
        "FLOAT_MAT4"..0x8B5C,
        "SAMPLER_1D"..0x8B5D,
        "SAMPLER_2D"..0x8B5E,
        "SAMPLER_3D"..0x8B5F,
        "SAMPLER_CUBE"..0x8B60,
        "SAMPLER_1D_SHADOW"..0x8B61,
        "SAMPLER_2D_SHADOW"..0x8B62
    )

    GL20C reuse "CreateProgram"
    GL20C reuse "DeleteProgram"
    GL20C reuse "IsProgram"
    GL20C reuse "CreateShader"
    GL20C reuse "DeleteShader"
    GL20C reuse "IsShader"
    GL20C reuse "AttachShader"
    GL20C reuse "DetachShader"
    GL20C reuse "ShaderSource"
    GL20C reuse "CompileShader"
    GL20C reuse "LinkProgram"
    GL20C reuse "UseProgram"
    GL20C reuse "ValidateProgram"
    GL20C reuse "Uniform1f"
    GL20C reuse "Uniform2f"
    GL20C reuse "Uniform3f"
    GL20C reuse "Uniform4f"
    GL20C reuse "Uniform1i"
    GL20C reuse "Uniform2i"
    GL20C reuse "Uniform3i"
    GL20C reuse "Uniform4i"
    GL20C reuse "Uniform1fv"
    GL20C reuse "Uniform2fv"
    GL20C reuse "Uniform3fv"
    GL20C reuse "Uniform4fv"
    GL20C reuse "Uniform1iv"
    GL20C reuse "Uniform2iv"
    GL20C reuse "Uniform3iv"
    GL20C reuse "Uniform4iv"
    GL20C reuse "UniformMatrix2fv"
    GL20C reuse "UniformMatrix3fv"
    GL20C reuse "UniformMatrix4fv"
    GL20C reuse "GetShaderiv"
    GL20C reuse "GetProgramiv"
    GL20C reuse "GetShaderInfoLog"
    GL20C reuse "GetProgramInfoLog"
    GL20C reuse "GetAttachedShaders"
    GL20C reuse "GetUniformLocation"
    GL20C reuse "GetActiveUniform"
    GL20C reuse "GetUniformfv"
    GL20C reuse "GetUniformiv"
    GL20C reuse "GetShaderSource"

    // ARB_vertex_shader

    IntConstant(
        "Accepted by the {@code type} argument of CreateShader and returned by the {@code params} parameter of GetShaderiv.",

        "VERTEX_SHADER"..0x8B31
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "MAX_VERTEX_UNIFORM_COMPONENTS"..0x8B4A,
        "MAX_VARYING_FLOATS"..0x8B4B,
        "MAX_VERTEX_ATTRIBS"..0x8869,
        "MAX_TEXTURE_IMAGE_UNITS"..0x8872,
        "MAX_VERTEX_TEXTURE_IMAGE_UNITS"..0x8B4C,
        "MAX_COMBINED_TEXTURE_IMAGE_UNITS"..0x8B4D,
        "MAX_TEXTURE_COORDS"..0x8871
    )

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Disable, Enable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
        GetDoublev.
        """,

        "VERTEX_PROGRAM_POINT_SIZE"..0x8642,
        "VERTEX_PROGRAM_TWO_SIDE"..0x8643
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetVertexAttrib{dfi}v.",

        "VERTEX_ATTRIB_ARRAY_ENABLED"..0x8622,
        "VERTEX_ATTRIB_ARRAY_SIZE"..0x8623,
        "VERTEX_ATTRIB_ARRAY_STRIDE"..0x8624,
        "VERTEX_ATTRIB_ARRAY_TYPE"..0x8625,
        "VERTEX_ATTRIB_ARRAY_NORMALIZED"..0x886A,
        "CURRENT_VERTEX_ATTRIB"..0x8626
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetVertexAttribPointerv.",

        "VERTEX_ATTRIB_ARRAY_POINTER"..0x8645
    )

    GL20C reuse "VertexAttrib1f"
    GL20C reuse "VertexAttrib1s"
    GL20C reuse "VertexAttrib1d"
    GL20C reuse "VertexAttrib2f"
    GL20C reuse "VertexAttrib2s"
    GL20C reuse "VertexAttrib2d"
    GL20C reuse "VertexAttrib3f"
    GL20C reuse "VertexAttrib3s"
    GL20C reuse "VertexAttrib3d"
    GL20C reuse "VertexAttrib4f"
    GL20C reuse "VertexAttrib4s"
    GL20C reuse "VertexAttrib4d"
    GL20C reuse "VertexAttrib4Nub"
    GL20C reuse "VertexAttrib1fv"
    GL20C reuse "VertexAttrib1sv"
    GL20C reuse "VertexAttrib1dv"
    GL20C reuse "VertexAttrib2fv"
    GL20C reuse "VertexAttrib2sv"
    GL20C reuse "VertexAttrib2dv"
    GL20C reuse "VertexAttrib3fv"
    GL20C reuse "VertexAttrib3sv"
    GL20C reuse "VertexAttrib3dv"
    GL20C reuse "VertexAttrib4fv"
    GL20C reuse "VertexAttrib4sv"
    GL20C reuse "VertexAttrib4dv"
    GL20C reuse "VertexAttrib4iv"
    GL20C reuse "VertexAttrib4bv"
    GL20C reuse "VertexAttrib4ubv"
    GL20C reuse "VertexAttrib4usv"
    GL20C reuse "VertexAttrib4uiv"
    GL20C reuse "VertexAttrib4Nbv"
    GL20C reuse "VertexAttrib4Nsv"
    GL20C reuse "VertexAttrib4Niv"
    GL20C reuse "VertexAttrib4Nubv"
    GL20C reuse "VertexAttrib4Nusv"
    GL20C reuse "VertexAttrib4Nuiv"
    GL20C reuse "VertexAttribPointer"
    GL20C reuse "EnableVertexAttribArray"
    GL20C reuse "DisableVertexAttribArray"
    GL20C reuse "BindAttribLocation"
    GL20C reuse "GetActiveAttrib"
    GL20C reuse "GetAttribLocation"
    GL20C reuse "GetVertexAttribiv"
    GL20C reuse "GetVertexAttribfv"
    GL20C reuse "GetVertexAttribdv"
    GL20C reuse "GetVertexAttribPointerv"

    // ARB_fragment_shader

    IntConstant(
        "Accepted by the {@code type} argument of CreateShader and returned by the {@code params} parameter of GetShaderiv.",

        "FRAGMENT_SHADER"..0x8B30
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "MAX_FRAGMENT_UNIFORM_COMPONENTS"..0x8B49
    )

    IntConstant(
        "Accepted by the {@code target} parameter of Hint and the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "FRAGMENT_SHADER_DERIVATIVE_HINT"..0x8B8B
    )

    // ARB_draw_buffers

    IntConstant(
        "Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv, and GetDoublev.",

        "MAX_DRAW_BUFFERS"..0x8824,
        "DRAW_BUFFER0"..0x8825,
        "DRAW_BUFFER1"..0x8826,
        "DRAW_BUFFER2"..0x8827,
        "DRAW_BUFFER3"..0x8828,
        "DRAW_BUFFER4"..0x8829,
        "DRAW_BUFFER5"..0x882A,
        "DRAW_BUFFER6"..0x882B,
        "DRAW_BUFFER7"..0x882C,
        "DRAW_BUFFER8"..0x882D,
        "DRAW_BUFFER9"..0x882E,
        "DRAW_BUFFER10"..0x882F,
        "DRAW_BUFFER11"..0x8830,
        "DRAW_BUFFER12"..0x8831,
        "DRAW_BUFFER13"..0x8832,
        "DRAW_BUFFER14"..0x8833,
        "DRAW_BUFFER15"..0x8834
    )

    GL20C reuse "DrawBuffers"

    // ARB_point_sprite

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
        GetDoublev, and by the {@code target} parameter of TexEnvi, TexEnviv, TexEnvf, TexEnvfv, GetTexEnviv, and GetTexEnvfv.
        """,

        "POINT_SPRITE"..0x8861
    )

    IntConstant(
        """
        When the {@code target} parameter of TexEnvf, TexEnvfv, TexEnvi, TexEnviv, GetTexEnvfv, or GetTexEnviv is POINT_SPRITE, then the value of
        {@code pname} may be.
        """,

        "COORD_REPLACE"..0x8862
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of PointParameter{if}v.",

        "POINT_SPRITE_COORD_ORIGIN"..0x8CA0
    )

    IntConstant(
        "Accepted by the {@code param} parameter of PointParameter{if}v.",

        "LOWER_LEFT"..0x8CA1,
        "UPPER_LEFT"..0x8CA2
    )

    // EXT_blend_equation_separate

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "BLEND_EQUATION_RGB"..0x8009,
        "BLEND_EQUATION_ALPHA"..0x883D
    )

    GL20C reuse "BlendEquationSeparate"

    // ATI_separate_stencil

    IntConstant(
        "Accepted by the {@code pname} parameter of GetIntegerv.",

        "STENCIL_BACK_FUNC"..0x8800,
        "STENCIL_BACK_FAIL"..0x8801,
        "STENCIL_BACK_PASS_DEPTH_FAIL"..0x8802,
        "STENCIL_BACK_PASS_DEPTH_PASS"..0x8803,
        "STENCIL_BACK_REF"..0x8CA3,
        "STENCIL_BACK_VALUE_MASK"..0x8CA4,
        "STENCIL_BACK_WRITEMASK"..0x8CA5
    )

    GL20C reuse "StencilOpSeparate"
    GL20C reuse "StencilFuncSeparate"
    GL20C reuse "StencilMaskSeparate"
}