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

    // ARB_shading_language_100

    IntConstant(
        "SHADING_LANGUAGE_VERSION"..0x8B8C
    )

    // ARB_shader_objects

    IntConstant(
        "CURRENT_PROGRAM"..0x8B8D
    )

    IntConstant(
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

    reuse(GL20C, "CreateProgram")
    reuse(GL20C, "DeleteProgram")
    reuse(GL20C, "IsProgram")
    reuse(GL20C, "CreateShader")
    reuse(GL20C, "DeleteShader")
    reuse(GL20C, "IsShader")
    reuse(GL20C, "AttachShader")
    reuse(GL20C, "DetachShader")
    reuse(GL20C, "ShaderSource")
    reuse(GL20C, "CompileShader")
    reuse(GL20C, "LinkProgram")
    reuse(GL20C, "UseProgram")
    reuse(GL20C, "ValidateProgram")
    reuse(GL20C, "Uniform1f")
    reuse(GL20C, "Uniform2f")
    reuse(GL20C, "Uniform3f")
    reuse(GL20C, "Uniform4f")
    reuse(GL20C, "Uniform1i")
    reuse(GL20C, "Uniform2i")
    reuse(GL20C, "Uniform3i")
    reuse(GL20C, "Uniform4i")
    reuse(GL20C, "Uniform1fv")
    reuse(GL20C, "Uniform2fv")
    reuse(GL20C, "Uniform3fv")
    reuse(GL20C, "Uniform4fv")
    reuse(GL20C, "Uniform1iv")
    reuse(GL20C, "Uniform2iv")
    reuse(GL20C, "Uniform3iv")
    reuse(GL20C, "Uniform4iv")
    reuse(GL20C, "UniformMatrix2fv")
    reuse(GL20C, "UniformMatrix3fv")
    reuse(GL20C, "UniformMatrix4fv")
    reuse(GL20C, "GetShaderiv")
    reuse(GL20C, "GetProgramiv")
    reuse(GL20C, "GetShaderInfoLog")
    reuse(GL20C, "GetProgramInfoLog")
    reuse(GL20C, "GetAttachedShaders")
    reuse(GL20C, "GetUniformLocation")
    reuse(GL20C, "GetActiveUniform")
    reuse(GL20C, "GetUniformfv")
    reuse(GL20C, "GetUniformiv")
    reuse(GL20C, "GetShaderSource")

    // ARB_vertex_shader

    IntConstant(
        "VERTEX_SHADER"..0x8B31
    )

    IntConstant(
        "MAX_VERTEX_UNIFORM_COMPONENTS"..0x8B4A,
        "MAX_VARYING_FLOATS"..0x8B4B,
        "MAX_VERTEX_ATTRIBS"..0x8869,
        "MAX_TEXTURE_IMAGE_UNITS"..0x8872,
        "MAX_VERTEX_TEXTURE_IMAGE_UNITS"..0x8B4C,
        "MAX_COMBINED_TEXTURE_IMAGE_UNITS"..0x8B4D,
        "MAX_TEXTURE_COORDS"..0x8871
    )

    IntConstant(
        "VERTEX_PROGRAM_POINT_SIZE"..0x8642,
        "VERTEX_PROGRAM_TWO_SIDE"..0x8643
    )

    IntConstant(
        "VERTEX_ATTRIB_ARRAY_ENABLED"..0x8622,
        "VERTEX_ATTRIB_ARRAY_SIZE"..0x8623,
        "VERTEX_ATTRIB_ARRAY_STRIDE"..0x8624,
        "VERTEX_ATTRIB_ARRAY_TYPE"..0x8625,
        "VERTEX_ATTRIB_ARRAY_NORMALIZED"..0x886A,
        "CURRENT_VERTEX_ATTRIB"..0x8626
    )

    IntConstant(
        "VERTEX_ATTRIB_ARRAY_POINTER"..0x8645
    )

    reuse(GL20C, "VertexAttrib1f")
    reuse(GL20C, "VertexAttrib1s")
    reuse(GL20C, "VertexAttrib1d")
    reuse(GL20C, "VertexAttrib2f")
    reuse(GL20C, "VertexAttrib2s")
    reuse(GL20C, "VertexAttrib2d")
    reuse(GL20C, "VertexAttrib3f")
    reuse(GL20C, "VertexAttrib3s")
    reuse(GL20C, "VertexAttrib3d")
    reuse(GL20C, "VertexAttrib4f")
    reuse(GL20C, "VertexAttrib4s")
    reuse(GL20C, "VertexAttrib4d")
    reuse(GL20C, "VertexAttrib4Nub")
    reuse(GL20C, "VertexAttrib1fv")
    reuse(GL20C, "VertexAttrib1sv")
    reuse(GL20C, "VertexAttrib1dv")
    reuse(GL20C, "VertexAttrib2fv")
    reuse(GL20C, "VertexAttrib2sv")
    reuse(GL20C, "VertexAttrib2dv")
    reuse(GL20C, "VertexAttrib3fv")
    reuse(GL20C, "VertexAttrib3sv")
    reuse(GL20C, "VertexAttrib3dv")
    reuse(GL20C, "VertexAttrib4fv")
    reuse(GL20C, "VertexAttrib4sv")
    reuse(GL20C, "VertexAttrib4dv")
    reuse(GL20C, "VertexAttrib4iv")
    reuse(GL20C, "VertexAttrib4bv")
    reuse(GL20C, "VertexAttrib4ubv")
    reuse(GL20C, "VertexAttrib4usv")
    reuse(GL20C, "VertexAttrib4uiv")
    reuse(GL20C, "VertexAttrib4Nbv")
    reuse(GL20C, "VertexAttrib4Nsv")
    reuse(GL20C, "VertexAttrib4Niv")
    reuse(GL20C, "VertexAttrib4Nubv")
    reuse(GL20C, "VertexAttrib4Nusv")
    reuse(GL20C, "VertexAttrib4Nuiv")
    reuse(GL20C, "VertexAttribPointer")
    reuse(GL20C, "EnableVertexAttribArray")
    reuse(GL20C, "DisableVertexAttribArray")
    reuse(GL20C, "BindAttribLocation")
    reuse(GL20C, "GetActiveAttrib")
    reuse(GL20C, "GetAttribLocation")
    reuse(GL20C, "GetVertexAttribiv")
    reuse(GL20C, "GetVertexAttribfv")
    reuse(GL20C, "GetVertexAttribdv")
    reuse(GL20C, "GetVertexAttribPointerv")

    // ARB_fragment_shader

    IntConstant(
        "FRAGMENT_SHADER"..0x8B30
    )

    IntConstant(
        "MAX_FRAGMENT_UNIFORM_COMPONENTS"..0x8B49
    )

    IntConstant(
        "FRAGMENT_SHADER_DERIVATIVE_HINT"..0x8B8B
    )

    // ARB_draw_buffers

    IntConstant(
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

    reuse(GL20C, "DrawBuffers")

    // ARB_point_sprite

    IntConstant(
        "POINT_SPRITE"..0x8861
    )

    IntConstant(
        "COORD_REPLACE"..0x8862
    )

    IntConstant(
        "POINT_SPRITE_COORD_ORIGIN"..0x8CA0
    )

    IntConstant(
        "LOWER_LEFT"..0x8CA1,
        "UPPER_LEFT"..0x8CA2
    )

    // EXT_blend_equation_separate

    IntConstant(
        "BLEND_EQUATION_RGB"..0x8009,
        "BLEND_EQUATION_ALPHA"..0x883D
    )

    reuse(GL20C, "BlendEquationSeparate")

    // ATI_separate_stencil

    IntConstant(
        "STENCIL_BACK_FUNC"..0x8800,
        "STENCIL_BACK_FAIL"..0x8801,
        "STENCIL_BACK_PASS_DEPTH_FAIL"..0x8802,
        "STENCIL_BACK_PASS_DEPTH_PASS"..0x8803,
        "STENCIL_BACK_REF"..0x8CA3,
        "STENCIL_BACK_VALUE_MASK"..0x8CA4,
        "STENCIL_BACK_WRITEMASK"..0x8CA5
    )

    reuse(GL20C, "StencilOpSeparate")
    reuse(GL20C, "StencilFuncSeparate")
    reuse(GL20C, "StencilMaskSeparate")
}