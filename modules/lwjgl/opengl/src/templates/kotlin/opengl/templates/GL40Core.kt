/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL40C = "GL40C".nativeClassGL("GL40C") {
    extends = GL33C

    // ARB_draw_buffers_blend

    void(
        "BlendEquationi",

        GLuint("buf"),
        GLenum("mode")
    )

    void(
        "BlendEquationSeparatei",

        GLuint("buf"),
        GLenum("modeRGB"),
        GLenum("modeAlpha")
    )

    void(
        "BlendFunci",

        GLuint("buf"),
        GLenum("sfactor"),
        GLenum("dfactor")
    )

    void(
        "BlendFuncSeparatei",

        GLuint("buf"),
        GLenum("srcRGB"),
        GLenum("dstRGB"),
        GLenum("srcAlpha"),
        GLenum("dstAlpha")
    )

    // ARB_draw_indirect

    IntConstant(
        "DRAW_INDIRECT_BUFFER"..0x8F3F
    )

    IntConstant(
        "DRAW_INDIRECT_BUFFER_BINDING"..0x8F43
    )

    void(
        "DrawArraysIndirect",

        GLenum("mode"),
        Check("4 * 4")..MultiType(
            PointerMapping.DATA_INT
        )..RawPointer..void.const.p("indirect")
    )

    void(
        "DrawElementsIndirect",

        GLenum("mode"),
        GLenum("type"),
        Check("5 * 4")..MultiType(
            PointerMapping.DATA_INT
        )..RawPointer..void.const.p("indirect")
    )

    // ARB_gpu_shader5

    IntConstant(
        "GEOMETRY_SHADER_INVOCATIONS"..0x887F
    )

    IntConstant(
        "MAX_GEOMETRY_SHADER_INVOCATIONS"..0x8E5A,
        "MIN_FRAGMENT_INTERPOLATION_OFFSET"..0x8E5B,
        "MAX_FRAGMENT_INTERPOLATION_OFFSET"..0x8E5C,
        "FRAGMENT_INTERPOLATION_OFFSET_BITS"..0x8E5D
    )

    // ARB_gpu_shader_fp64

    IntConstant(
        "DOUBLE_VEC2"..0x8FFC,
        "DOUBLE_VEC3"..0x8FFD,
        "DOUBLE_VEC4"..0x8FFE,
        "DOUBLE_MAT2"..0x8F46,
        "DOUBLE_MAT3"..0x8F47,
        "DOUBLE_MAT4"..0x8F48,
        "DOUBLE_MAT2x3"..0x8F49,
        "DOUBLE_MAT2x4"..0x8F4A,
        "DOUBLE_MAT3x2"..0x8F4B,
        "DOUBLE_MAT3x4"..0x8F4C,
        "DOUBLE_MAT4x2"..0x8F4D,
        "DOUBLE_MAT4x3"..0x8F4E
    )

    void(
        "Uniform1d",

        GLint("location"),
        GLdouble("x")
    )

    void(
        "Uniform2d",

        GLint("location"),
        GLdouble("x"),
        GLdouble("y")
    )

    void(
        "Uniform3d",

        GLint("location"),
        GLdouble("x"),
        GLdouble("y"),
        GLdouble("z")
    )

    void(
        "Uniform4d",

        GLint("location"),
        GLdouble("x"),
        GLdouble("y"),
        GLdouble("z"),
        GLdouble("w")
    )

    void(
        "Uniform1dv",

        GLint("location"),
        AutoSize("value")..GLsizei("count"),
        GLdouble.const.p("value")
    )

    void(
        "Uniform2dv",

        GLint("location"),
        AutoSize(2, "value")..GLsizei("count"),
        GLdouble.const.p("value")
    )

    void(
        "Uniform3dv",

        GLint("location"),
        AutoSize(3, "value")..GLsizei("count"),
        GLdouble.const.p("value")
    )

    void(
        "Uniform4dv",

        GLint("location"),
        AutoSize(4, "value")..GLsizei("count"),
        GLdouble.const.p("value")
    )

    void(
        "UniformMatrix2dv",

        GLint("location"),
        AutoSize(2 x 2, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLdouble.const.p("value")
    )

    void(
        "UniformMatrix3dv",

        GLint("location"),
        AutoSize(3 x 3, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLdouble.const.p("value")
    )

    void(
        "UniformMatrix4dv",

        GLint("location"),
        AutoSize(4 x 4, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLdouble.const.p("value")
    )

    void(
        "UniformMatrix2x3dv",

        GLint("location"),
        AutoSize(2 x 3, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLdouble.const.p("value")
    )

    void(
        "UniformMatrix2x4dv",

        GLint("location"),
        AutoSize(2 x 4, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLdouble.const.p("value")
    )

    void(
        "UniformMatrix3x2dv",

        GLint("location"),
        AutoSize(3 x 2, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLdouble.const.p("value")

    )

    void(
        "UniformMatrix3x4dv",

        GLint("location"),
        AutoSize(3 x 4, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLdouble.const.p("value")

    )

    void(
        "UniformMatrix4x2dv",

        GLint("location"),
        AutoSize(4 x 2, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLdouble.const.p("value")

    )

    void(
        "UniformMatrix4x3dv",

        GLint("location"),
        AutoSize(4 x 3, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLdouble.const.p("value")

    )

    void(
        "GetUniformdv",

        GLuint("program"),
        GLint("location"),
        Check(1)..ReturnParam..GLdouble.p("params")
    )

    // ARB_sample_shading

    IntConstant(
        "SAMPLE_SHADING"..0x8C36
    )

    IntConstant(
        "MIN_SAMPLE_SHADING_VALUE"..0x8C37
    )

    void(
        "MinSampleShading",

        GLfloat("value")
    )

    // ARB_shader_subroutine

    IntConstant(
        "ACTIVE_SUBROUTINES"..0x8DE5,
        "ACTIVE_SUBROUTINE_UNIFORMS"..0x8DE6,
        "ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS"..0x8E47,
        "ACTIVE_SUBROUTINE_MAX_LENGTH"..0x8E48,
        "ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH"..0x8E49
    )

    IntConstant(
        "MAX_SUBROUTINES"..0x8DE7,
        "MAX_SUBROUTINE_UNIFORM_LOCATIONS"..0x8DE8
    )

    IntConstant(
        "NUM_COMPATIBLE_SUBROUTINES"..0x8E4A,
        "COMPATIBLE_SUBROUTINES"..0x8E4B
    )

    GLint(
        "GetSubroutineUniformLocation",

        GLuint("program"),
        GLenum("shadertype"),
        GLcharASCII.const.p("name")
    )

    GLuint(
        "GetSubroutineIndex",

        GLuint("program"),
        GLenum("shadertype"),
        GLcharASCII.const.p("name")
    )

    void(
        "GetActiveSubroutineUniformiv",

        GLuint("program"),
        GLenum("shadertype"),
        GLuint("index"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLint.p("values")
    )

    void(
        "GetActiveSubroutineUniformName",

        GLuint("program"),
        GLenum("shadertype"),
        GLuint("index"),
        AutoSize("name")..GLsizei("bufsize"),
        Check(1)..nullable..GLsizei.p("length"),
        Return(
            "length", "glGetActiveSubroutineUniformi(program, shadertype, index, GL31.GL_UNIFORM_NAME_LENGTH)"
        )..GLcharASCII.p("name")
    )

    void(
        "GetActiveSubroutineName",

        GLuint("program"),
        GLenum("shadertype"),
        GLuint("index"),
        AutoSize("name")..GLsizei("bufsize"),
        Check(1)..nullable..GLsizei.p("length"),
        Return(
            "length", "glGetProgramStagei(program, shadertype, GL_ACTIVE_SUBROUTINE_MAX_LENGTH)"
        )..GLcharASCII.p("name")
    )

    void(
        "UniformSubroutinesuiv",

        GLenum("shadertype"),
        AutoSize("indices")..GLsizei("count"),
        SingleValue("index")..GLuint.const.p("indices")
    )

    void(
        "GetUniformSubroutineuiv",

        GLenum("shadertype"),
        GLint("location"),
        Check(1)..ReturnParam..GLuint.p("params")
    )

    void(
        "GetProgramStageiv",

        GLuint("program"),
        GLenum("shadertype"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLint.p("values")
    )

    // ARB_tesselation_shader

    IntConstant(
        "PATCHES"..0xE
    )

    IntConstant(
        "PATCH_VERTICES"..0x8E72
    )

    IntConstant(
        "PATCH_DEFAULT_INNER_LEVEL"..0x8E73,
        "PATCH_DEFAULT_OUTER_LEVEL"..0x8E74
    )

    IntConstant(
        "TESS_CONTROL_OUTPUT_VERTICES"..0x8E75,
        "TESS_GEN_MODE"..0x8E76,
        "TESS_GEN_SPACING"..0x8E77,
        "TESS_GEN_VERTEX_ORDER"..0x8E78,
        "TESS_GEN_POINT_MODE"..0x8E79
    )

    IntConstant(
        "ISOLINES"..0x8E7A
    )

    IntConstant(
        "FRACTIONAL_ODD"..0x8E7B,
        "FRACTIONAL_EVEN"..0x8E7C
    )

    IntConstant(
        "MAX_PATCH_VERTICES"..0x8E7D,
        "MAX_TESS_GEN_LEVEL"..0x8E7E,
        "MAX_TESS_CONTROL_UNIFORM_COMPONENTS"..0x8E7F,
        "MAX_TESS_EVALUATION_UNIFORM_COMPONENTS"..0x8E80,
        "MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS"..0x8E81,
        "MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS"..0x8E82,
        "MAX_TESS_CONTROL_OUTPUT_COMPONENTS"..0x8E83,
        "MAX_TESS_PATCH_COMPONENTS"..0x8E84,
        "MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS"..0x8E85,
        "MAX_TESS_EVALUATION_OUTPUT_COMPONENTS"..0x8E86,
        "MAX_TESS_CONTROL_UNIFORM_BLOCKS"..0x8E89,
        "MAX_TESS_EVALUATION_UNIFORM_BLOCKS"..0x8E8A,
        "MAX_TESS_CONTROL_INPUT_COMPONENTS"..0x886C,
        "MAX_TESS_EVALUATION_INPUT_COMPONENTS"..0x886D,
        "MAX_COMBINED_TESS_CONTROL_UNIFORM_COMPONENTS"..0x8E1E,
        "MAX_COMBINED_TESS_EVALUATION_UNIFORM_COMPONENTS"..0x8E1F
    )

    IntConstant(
        "UNIFORM_BLOCK_REFERENCED_BY_TESS_CONTROL_SHADER"..0x84F0,
        "UNIFORM_BLOCK_REFERENCED_BY_TESS_EVALUATION_SHADER"..0x84F1
    )

    IntConstant(
        "TESS_EVALUATION_SHADER"..0x8E87,
        "TESS_CONTROL_SHADER"..0x8E88
    )

    void(
        "PatchParameteri",

        GLenum("pname"),
        GLint("value")
    )

    void(
        "PatchParameterfv",

        GLenum("pname"),
        Check(
            expression = "GL11.glGetInteger(GL_PATCH_VERTICES)", debug = true
        )..GLfloat.const.p("values")
    )

    // ARB_texture_cube_map_array

    IntConstant(
        "TEXTURE_CUBE_MAP_ARRAY"..0x9009
    )

    IntConstant(
        "TEXTURE_BINDING_CUBE_MAP_ARRAY"..0x900A
    )

    IntConstant(
        "PROXY_TEXTURE_CUBE_MAP_ARRAY"..0x900B
    )

    IntConstant(
        "SAMPLER_CUBE_MAP_ARRAY"..0x900C,
        "SAMPLER_CUBE_MAP_ARRAY_SHADOW"..0x900D,
        "INT_SAMPLER_CUBE_MAP_ARRAY"..0x900E,
        "UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY"..0x900F
    )

    // ARB_texture_gather

    IntConstant(
        "MIN_PROGRAM_TEXTURE_GATHER_OFFSET"..0x8E5E,
        "MAX_PROGRAM_TEXTURE_GATHER_OFFSET"..0x8E5F
    )

    // ARB_transform_feedback2

    IntConstant(
        "TRANSFORM_FEEDBACK"..0x8E22
    )

    IntConstant(
        "TRANSFORM_FEEDBACK_BUFFER_PAUSED"..0x8E23,
        "TRANSFORM_FEEDBACK_BUFFER_ACTIVE"..0x8E24,
        "TRANSFORM_FEEDBACK_BINDING"..0x8E25
    )

    void(
        "BindTransformFeedback",

        GLenum("target"),
        GLuint("id")
    )

    void(
        "DeleteTransformFeedbacks",

        AutoSize("ids")..GLsizei("n"),
        SingleValue("id")..GLuint.const.p("ids")
    )

    void(
        "GenTransformFeedbacks",

        AutoSize("ids")..GLsizei("n"),
        ReturnParam..GLuint.p("ids")
    )

    GLboolean(
        "IsTransformFeedback",

        GLuint("id")
    )

    void("PauseTransformFeedback")

    void("ResumeTransformFeedback")

    void(
        "DrawTransformFeedback",

        GLenum("mode"),
        GLuint("id")
    )

    // ARB_transform_feedback3

    IntConstant(
        "MAX_TRANSFORM_FEEDBACK_BUFFERS"..0x8E70,
        "MAX_VERTEX_STREAMS"..0x8E71
    )

    void(
        "DrawTransformFeedbackStream",

        GLenum("mode"),
        GLuint("id"),
        GLuint("stream")
    )

    void(
        "BeginQueryIndexed",

        GLenum("target"),
        GLuint("index"),
        GLuint("id")
    )

    void(
        "EndQueryIndexed",

        GLenum("target"),
        GLuint("index")
    )

    void(
        "GetQueryIndexediv",

        GLenum("target"),
        GLuint("index"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLint.p("params")
    )
}