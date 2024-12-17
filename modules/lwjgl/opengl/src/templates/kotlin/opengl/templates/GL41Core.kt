/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import opengl.BufferType.*

val GL41C = "GL41C".nativeClassGL("GL41C") {
    extends = GL40C

    // ARB_ES2_compatibility

    IntConstant(
        "SHADER_COMPILER"..0x8DFA,
        "SHADER_BINARY_FORMATS"..0x8DF8,
        "NUM_SHADER_BINARY_FORMATS"..0x8DF9,
        "MAX_VERTEX_UNIFORM_VECTORS"..0x8DFB,
        "MAX_VARYING_VECTORS"..0x8DFC,
        "MAX_FRAGMENT_UNIFORM_VECTORS"..0x8DFD,
        "IMPLEMENTATION_COLOR_READ_TYPE"..0x8B9A,
        "IMPLEMENTATION_COLOR_READ_FORMAT"..0x8B9B
    )

    IntConstant(
        "FIXED"..0x140C
    )

    IntConstant(
        "LOW_FLOAT"..0x8DF0,
        "MEDIUM_FLOAT"..0x8DF1,
        "HIGH_FLOAT"..0x8DF2,
        "LOW_INT"..0x8DF3,
        "MEDIUM_INT"..0x8DF4,
        "HIGH_INT"..0x8DF5
    )

    IntConstant(
        "RGB565"..0x8D62
    )

    void("ReleaseShaderCompiler")

    void(
        "ShaderBinary",

        AutoSize("shaders")..GLsizei("count"),
        GLuint.const.p("shaders"),
        GLenum("binaryformat"),
        void.const.p("binary"),
        AutoSize("binary")..GLsizei("length")
    )

    void(
        "GetShaderPrecisionFormat",

        GLenum("shadertype"),
        GLenum("precisiontype"),
        Check(2)..GLint.p("range"),
        Check(1)..ReturnParam..GLint.p("precision")
    )

    void(
        "DepthRangef",

        GLfloat("zNear"),
        GLfloat("zFar")
    )

    void(
        "ClearDepthf",

        GLfloat("depth")
    )

    // ARB_get_program_binary

    IntConstant(
        "PROGRAM_BINARY_RETRIEVABLE_HINT"..0x8257
    )

    IntConstant(
        "PROGRAM_BINARY_LENGTH"..0x8741
    )

    IntConstant(
        "NUM_PROGRAM_BINARY_FORMATS"..0x87FE,
        "PROGRAM_BINARY_FORMATS"..0x87FF
    )

    void(
        "GetProgramBinary",

        GLuint("program"),
        AutoSize("binary")..GLsizei("bufSize"),
        Check(1)..nullable..GLsizei.p("length"),
        Check(1)..GLenum.p("binaryFormat"),
        void.p("binary")
    )

    void(
        "ProgramBinary",

        GLuint("program"),
        GLenum("binaryFormat"),
        void.const.p("binary"),
        AutoSize("binary")..GLsizei("length")
    )

    void(
        "ProgramParameteri",

        GLuint("program"),
        GLenum("pname"),
        GLint("value")
    )

    // ARB_separate_shader_objects

    IntConstant(
        "VERTEX_SHADER_BIT"..0x00000001,
        "FRAGMENT_SHADER_BIT"..0x00000002,
        "GEOMETRY_SHADER_BIT"..0x00000004,
        "TESS_CONTROL_SHADER_BIT"..0x00000008,
        "TESS_EVALUATION_SHADER_BIT"..0x00000010,
        "ALL_SHADER_BITS"..0xFFFFFFFF.i
    )

    IntConstant(
        "PROGRAM_SEPARABLE"..0x8258
    )

    IntConstant(
        "ACTIVE_PROGRAM"..0x8259
    )

    IntConstant(
        "PROGRAM_PIPELINE_BINDING"..0x825A
    )

    void(
        "UseProgramStages",

        GLuint("pipeline"),
        GLbitfield("stages"),
        GLuint("program")
    )

    void(
        "ActiveShaderProgram",

        GLuint("pipeline"),
        GLuint("program")
    )

    GLuint(
        "CreateShaderProgramv",

        GLenum("type"),
        AutoSize("strings")..GLsizei("count"),
        PointerArray(GLcharUTF8.p, "string")..GLcharUTF8.const.p.const.p("strings")
    )

    void(
        "BindProgramPipeline",

        GLuint("pipeline")
    )

    void(
        "DeleteProgramPipelines",

        AutoSize("pipelines")..GLsizei("n"),
        SingleValue("pipeline")..GLuint.const.p("pipelines")
    )

    void(
        "GenProgramPipelines",

        AutoSize("pipelines")..GLsizei("n"),
        ReturnParam..GLuint.p("pipelines")
    )

    GLboolean(
        "IsProgramPipeline",

        GLuint("pipeline")
    )

    void(
        "GetProgramPipelineiv",

        GLuint("pipeline"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLint.p("params")
    )

    void(
        "ProgramUniform1i",

        GLuint("program"),
        GLint("location"),
        GLint("x")
    )

    void(
        "ProgramUniform2i",

        GLuint("program"),
        GLint("location"),
        GLint("x"),
        GLint("y")
    )

    void(
        "ProgramUniform3i",

        GLuint("program"),
        GLint("location"),
        GLint("x"),
        GLint("y"),
        GLint("z")
    )

    void(
        "ProgramUniform4i",

        GLuint("program"),
        GLint("location"),
        GLint("x"),
        GLint("y"),
        GLint("z"),
        GLint("w")
    )

    void(
        "ProgramUniform1ui",

        GLuint("program"),
        GLint("location"),
        GLuint("x")
    )

    void(
        "ProgramUniform2ui",

        GLuint("program"),
        GLint("location"),
        GLuint("x"),
        GLuint("y")
    )

    void(
        "ProgramUniform3ui",

        GLuint("program"),
        GLint("location"),
        GLuint("x"),
        GLuint("y"),
        GLuint("z")
    )

    void(
        "ProgramUniform4ui",

        GLuint("program"),
        GLint("location"),
        GLuint("x"),
        GLuint("y"),
        GLuint("z"),
        GLuint("w")
    )

    void(
        "ProgramUniform1f",

        GLuint("program"),
        GLint("location"),
        GLfloat("x")
    )

    void(
        "ProgramUniform2f",

        GLuint("program"),
        GLint("location"),
        GLfloat("x"),
        GLfloat("y")
    )

    void(
        "ProgramUniform3f",

        GLuint("program"),
        GLint("location"),
        GLfloat("x"),
        GLfloat("y"),
        GLfloat("z")
    )

    void(
        "ProgramUniform4f",

        GLuint("program"),
        GLint("location"),
        GLfloat("x"),
        GLfloat("y"),
        GLfloat("z"),
        GLfloat("w")
    )

    void(
        "ProgramUniform1d",

        GLuint("program"),
        GLint("location"),
        GLdouble("x")
    )

    void(
        "ProgramUniform2d",

        GLuint("program"),
        GLint("location"),
        GLdouble("x"),
        GLdouble("y")
    )

    void(
        "ProgramUniform3d",

        GLuint("program"),
        GLint("location"),
        GLdouble("x"),
        GLdouble("y"),
        GLdouble("z")
    )

    void(
        "ProgramUniform4d",

        GLuint("program"),
        GLint("location"),
        GLdouble("x"),
        GLdouble("y"),
        GLdouble("z"),
        GLdouble("w")
    )

    void(
        "ProgramUniform1iv",

        GLuint("program"),
        GLint("location"),
        AutoSize("value")..GLsizei("count"),
        GLint.const.p("value")
    )

    void(
        "ProgramUniform2iv",

        GLuint("program"),
        GLint("location"),
        AutoSize(2, "value")..GLsizei("count"),
        GLint.const.p("value")
    )

    void(
        "ProgramUniform3iv",

        GLuint("program"),
        GLint("location"),
        AutoSize(3, "value")..GLsizei("count"),
        GLint.const.p("value")
    )

    void(
        "ProgramUniform4iv",

        GLuint("program"),
        GLint("location"),
        AutoSize(4, "value")..GLsizei("count"),
        GLint.const.p("value")
    )

    void(
        "ProgramUniform1uiv",

        GLuint("program"),
        GLint("location"),
        AutoSize("value")..GLsizei("count"),
        GLuint.const.p("value")
    )

    void(
        "ProgramUniform2uiv",

        GLuint("program"),
        GLint("location"),
        AutoSize(2, "value")..GLsizei("count"),
        GLuint.const.p("value")
    )

    void(
        "ProgramUniform3uiv",

        GLuint("program"),
        GLint("location"),
        AutoSize(3, "value")..GLsizei("count"),
        GLuint.const.p("value")
    )

    void(
        "ProgramUniform4uiv",

        GLuint("program"),
        GLint("location"),
        AutoSize(4, "value")..GLsizei("count"),
        GLuint.const.p("value")
    )

    void(
        "ProgramUniform1fv",

        GLuint("program"),
        GLint("location"),
        AutoSize("value")..GLsizei("count"),
        GLfloat.const.p("value")
    )

    void(
        "ProgramUniform2fv",

        GLuint("program"),
        GLint("location"),
        AutoSize(2, "value")..GLsizei("count"),
        GLfloat.const.p("value")
    )

    void(
        "ProgramUniform3fv",

        GLuint("program"),
        GLint("location"),
        AutoSize(3, "value")..GLsizei("count"),
        GLfloat.const.p("value")
    )

    void(
        "ProgramUniform4fv",

        GLuint("program"),
        GLint("location"),
        AutoSize(4, "value")..GLsizei("count"),
        GLfloat.const.p("value")
    )

    void(
        "ProgramUniform1dv",

        GLuint("program"),
        GLint("location"),
        AutoSize("value")..GLsizei("count"),
        GLdouble.const.p("value")
    )

    void(
        "ProgramUniform2dv",

        GLuint("program"),
        GLint("location"),
        AutoSize(2, "value")..GLsizei("count"),
        GLdouble.const.p("value")
    )

    void(
        "ProgramUniform3dv",

        GLuint("program"),
        GLint("location"),
        AutoSize(3, "value")..GLsizei("count"),
        GLdouble.const.p("value")
    )

    void(
        "ProgramUniform4dv",

        GLuint("program"),
        GLint("location"),
        AutoSize(4, "value")..GLsizei("count"),
        GLdouble.const.p("value")
    )

    void(
        "ProgramUniformMatrix2fv",

        GLuint("program"),
        GLint("location"),
        AutoSize(2 x 2, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLfloat.const.p("value")
    )

    void(
        "ProgramUniformMatrix3fv",

        GLuint("program"),
        GLint("location"),
        AutoSize(3 x 3, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLfloat.const.p("value")
    )

    void(
        "ProgramUniformMatrix4fv",

        GLuint("program"),
        GLint("location"),
        AutoSize(4 x 4, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLfloat.const.p("value")
    )

    void(
        "ProgramUniformMatrix2dv",

        GLuint("program"),
        GLint("location"),
        AutoSize(2 x 2, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLdouble.const.p("value")
    )

    void(
        "ProgramUniformMatrix3dv",

        GLuint("program"),
        GLint("location"),
        AutoSize(3 x 3, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLdouble.const.p("value")
    )

    void(
        "ProgramUniformMatrix4dv",

        GLuint("program"),
        GLint("location"),
        AutoSize(4 x 4, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLdouble.const.p("value")
    )

    void(
        "ProgramUniformMatrix2x3fv",

        GLuint("program"),
        GLint("location"),
        AutoSize(2 x 3, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLfloat.const.p("value")
    )

    void(
        "ProgramUniformMatrix3x2fv",

        GLuint("program"),
        GLint("location"),
        AutoSize(3 x 2, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLfloat.const.p("value")
    )

    void(
        "ProgramUniformMatrix2x4fv",

        GLuint("program"),
        GLint("location"),
        AutoSize(2 x 4, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLfloat.const.p("value")
    )

    void(
        "ProgramUniformMatrix4x2fv",

        GLuint("program"),
        GLint("location"),
        AutoSize(4 x 2, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLfloat.const.p("value")
    )

    void(
        "ProgramUniformMatrix3x4fv",

        GLuint("program"),
        GLint("location"),
        AutoSize(3 x 4, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLfloat.const.p("value")
    )

    void(
        "ProgramUniformMatrix4x3fv",

        GLuint("program"),
        GLint("location"),
        AutoSize(4 x 3, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLfloat.const.p("value")
    )

    void(
        "ProgramUniformMatrix2x3dv",

        GLuint("program"),
        GLint("location"),
        AutoSize(2 x 3, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLdouble.const.p("value")
    )

    void(
        "ProgramUniformMatrix3x2dv",

        GLuint("program"),
        GLint("location"),
        AutoSize(3 x 2, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLdouble.const.p("value")
    )

    void(
        "ProgramUniformMatrix2x4dv",

        GLuint("program"),
        GLint("location"),
        AutoSize(2 x 4, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLdouble.const.p("value")
    )

    void(
        "ProgramUniformMatrix4x2dv",

        GLuint("program"),
        GLint("location"),
        AutoSize(4 x 2, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLdouble.const.p("value")
    )

    void(
        "ProgramUniformMatrix3x4dv",

        GLuint("program"),
        GLint("location"),
        AutoSize(3 x 4, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLdouble.const.p("value")
    )

    void(
        "ProgramUniformMatrix4x3dv",

        GLuint("program"),
        GLint("location"),
        AutoSize(4 x 3, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLdouble.const.p("value")
    )

    void(
        "ValidateProgramPipeline",

        GLuint("pipeline")
    )

    void(
        "GetProgramPipelineInfoLog",

        GLuint("pipeline"),
        AutoSize("infoLog")..GLsizei("bufSize"),
        Check(1)..nullable..GLsizei.p("length"),
        Return(
            "length",
            "glGetProgramPipelinei(pipeline, GL20.GL_INFO_LOG_LENGTH)",
            heapAllocate = true
        )..GLcharUTF8.p("infoLog")
    )

    // ARB_vertex_attrib_64bit

    void(
        "VertexAttribL1d",

        GLuint("index"),
        GLdouble("x")
    )

    void(
        "VertexAttribL2d",

        GLuint("index"),
        GLdouble("x"),
        GLdouble("y")
    )

    void(
        "VertexAttribL3d",

        GLuint("index"),
        GLdouble("x"),
        GLdouble("y"),
        GLdouble("z")
    )

    void(
        "VertexAttribL4d",

        GLuint("index"),
        GLdouble("x"),
        GLdouble("y"),
        GLdouble("z"),
        GLdouble("w")
    )

    void("VertexAttribL1dv", GLuint("index"), Check(1)..GLdouble.const.p("v"))
    void("VertexAttribL2dv", GLuint("index"), Check(2)..GLdouble.const.p("v"))
    void("VertexAttribL3dv", GLuint("index"), Check(3)..GLdouble.const.p("v"))
    void("VertexAttribL4dv", GLuint("index"), Check(4)..GLdouble.const.p("v"))

    OffHeapOnly..void(
        "VertexAttribLPointer",

        GLuint("index"),
        GLint("size"),
        AutoType("pointer", GL_DOUBLE)..GLenum("type"),
        GLsizei("stride"),
        Unsafe..RawPointer..void.const.p("pointer")
    )

    void(
        "GetVertexAttribLdv",

        GLuint("index"),
        GLenum("pname"),
        Check(1)..GLdouble.p("params")
    )

    // ARB_viewport_array

    IntConstant(
        "MAX_VIEWPORTS"..0x825B,
        "VIEWPORT_SUBPIXEL_BITS"..0x825C,
        "VIEWPORT_BOUNDS_RANGE"..0x825D,
        "LAYER_PROVOKING_VERTEX"..0x825E,
        "VIEWPORT_INDEX_PROVOKING_VERTEX"..0x825F
    )

    IntConstant(
        "UNDEFINED_VERTEX"..0x8260
    )

    void(
        "ViewportArrayv",

        GLuint("first"),
        AutoSize(4, "v")..GLsizei("count"),
        GLfloat.const.p("v")
    )

    void(
        "ViewportIndexedf",

        GLuint("index"),
        GLfloat("x"),
        GLfloat("y"),
        GLfloat("w"),
        GLfloat("h")
    )

    void(
        "ViewportIndexedfv",

        GLuint("index"),
        Check(4)..GLfloat.const.p("v")
    )

    void(
        "ScissorArrayv",

        GLuint("first"),
        AutoSize(4, "v")..GLsizei("count"),
        GLint.const.p("v")
    )

    void(
        "ScissorIndexed",

        GLuint("index"),
        GLint("left"),
        GLint("bottom"),
        GLsizei("width"),
        GLsizei("height")
    )

    void(
        "ScissorIndexedv",

        GLuint("index"),
        Check(4)..GLint.const.p("v")
    )

    void(
        "DepthRangeArrayv",

        GLuint("first"),
        AutoSize(2, "v")..GLsizei("count"),
        GLdouble.const.p("v")
    )

    void(
        "DepthRangeIndexed",

        GLuint("index"),
        GLdouble("zNear"),
        GLdouble("zFar")
    )

    void(
        "GetFloati_v",

        GLenum("target"),
        GLuint("index"),
        Check(1)..ReturnParam..GLfloat.p("data")
    )

    void(
        "GetDoublei_v",

        GLenum("target"),
        GLuint("index"),
        Check(1)..ReturnParam..GLdouble.p("data")
    )
}