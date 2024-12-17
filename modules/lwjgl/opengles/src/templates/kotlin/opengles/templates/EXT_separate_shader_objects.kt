/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_separate_shader_objects = "EXTSeparateShaderObjects".nativeClassGLES("EXT_separate_shader_objects", postfix = EXT) {
    IntConstant(
        "VERTEX_SHADER_BIT_EXT"..0x00000001,
        "FRAGMENT_SHADER_BIT_EXT"..0x00000002,
        "ALL_SHADER_BITS_EXT".."0xFFFFFFFF"
    )

    IntConstant(
        "PROGRAM_SEPARABLE_EXT"..0x8258
    )

    IntConstant(
        "ACTIVE_PROGRAM_EXT"..0x8259
    )

    IntConstant(
        "PROGRAM_PIPELINE_BINDING_EXT"..0x825A
    )

    void(
        "ActiveShaderProgramEXT",

        GLuint("pipeline"),
        GLuint("program")
    )

    void(
        "BindProgramPipelineEXT",

        GLuint("pipeline")
    )

    GLuint(
        "CreateShaderProgramvEXT",

        GLenum("type"),
        AutoSize("strings")..GLsizei("count"),
        PointerArray(GLcharUTF8.p, "string")..GLcharUTF8.const.p.const.p("strings")
    )

    void(
        "DeleteProgramPipelinesEXT",

        AutoSize("pipelines")..GLsizei("n"),
        SingleValue("pipeline")..GLuint.const.p("pipelines")
    )

    void(
        "GenProgramPipelinesEXT",

        AutoSize("pipelines")..GLsizei("n"),
        ReturnParam..GLuint.p("pipelines")
    )

    void(
        "GetProgramPipelineInfoLogEXT",

        GLuint("pipeline"),
        AutoSize("infoLog")..GLsizei("bufSize"),
        Check(1)..nullable..GLsizei.p("length"),
        Return(
            "length",
            "glGetProgramPipelineiEXT(pipeline, GLES20.GL_INFO_LOG_LENGTH)",
            heapAllocate = true
        )..GLcharUTF8.p("infoLog")
    )

    void(
        "GetProgramPipelineivEXT",

        GLuint("pipeline"),
        GLenum("pname"),
        ReturnParam..Check(1)..GLint.p("params")
    )

    GLboolean(
        "IsProgramPipelineEXT",

        GLuint("pipeline")
    )

    void(
        "ProgramParameteriEXT",

        GLuint("program"),
        GLenum("pname"),
        GLint("value")
    )

    void(
        "ProgramUniform1fEXT",

        GLuint("program"),
        GLint("location"),
        GLfloat("v0")
    )

    void(
        "ProgramUniform1fvEXT",

        GLuint("program"),
        GLint("location"),
        AutoSize("value")..GLsizei("count"),
        GLfloat.const.p("value")
    )

    void(
        "ProgramUniform1iEXT",

        GLuint("program"),
        GLint("location"),
        GLint("v0")
    )

    void(
        "ProgramUniform1ivEXT",

        GLuint("program"),
        GLint("location"),
        AutoSize("value")..GLsizei("count"),
        GLint.const.p("value")
    )

    void(
        "ProgramUniform2fEXT",

        GLuint("program"),
        GLint("location"),
        GLfloat("v0"),
        GLfloat("v1")
    )

    void(
        "ProgramUniform2fvEXT",

        GLuint("program"),
        GLint("location"),
        AutoSize(2, "value")..GLsizei("count"),
        GLfloat.const.p("value")
    )

    void(
        "ProgramUniform2iEXT",

        GLuint("program"),
        GLint("location"),
        GLint("v0"),
        GLint("v1")
    )

    void(
        "ProgramUniform2ivEXT",

        GLuint("program"),
        GLint("location"),
        AutoSize(2, "value")..GLsizei("count"),
        GLint.const.p("value")
    )

    void(
        "ProgramUniform3fEXT",

        GLuint("program"),
        GLint("location"),
        GLfloat("v0"),
        GLfloat("v1"),
        GLfloat("v2")
    )

    void(
        "ProgramUniform3fvEXT",

        GLuint("program"),
        GLint("location"),
        AutoSize(3, "value")..GLsizei("count"),
        GLfloat.const.p("value")
    )

    void(
        "ProgramUniform3iEXT",

        GLuint("program"),
        GLint("location"),
        GLint("v0"),
        GLint("v1"),
        GLint("v2")
    )

    void(
        "ProgramUniform3ivEXT",

        GLuint("program"),
        GLint("location"),
        AutoSize(3, "value")..GLsizei("count"),
        GLint.const.p("value")
    )

    void(
        "ProgramUniform4fEXT",

        GLuint("program"),
        GLint("location"),
        GLfloat("v0"),
        GLfloat("v1"),
        GLfloat("v2"),
        GLfloat("v3")
    )

    void(
        "ProgramUniform4fvEXT",

        GLuint("program"),
        GLint("location"),
        AutoSize(4, "value")..GLsizei("count"),
        GLfloat.const.p("value")
    )

    void(
        "ProgramUniform4iEXT",

        GLuint("program"),
        GLint("location"),
        GLint("v0"),
        GLint("v1"),
        GLint("v2"),
        GLint("v3")
    )

    void(
        "ProgramUniform4ivEXT",

        GLuint("program"),
        GLint("location"),
        AutoSize(4, "value")..GLsizei("count"),
        GLint.const.p("value")
    )

    void(
        "ProgramUniformMatrix2fvEXT",

        GLuint("program"),
        GLint("location"),
        AutoSize(2 x 2, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLfloat.const.p("value")
    )

    void(
        "ProgramUniformMatrix3fvEXT",

        GLuint("program"),
        GLint("location"),
        AutoSize(3 x 3, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLfloat.const.p("value")
    )

    void(
        "ProgramUniformMatrix4fvEXT",

        GLuint("program"),
        GLint("location"),
        AutoSize(4 x 4, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLfloat.const.p("value")
    )

    void(
        "UseProgramStagesEXT",

        GLuint("pipeline"),
        GLbitfield("stages"),
        GLuint("program")
    )

    void(
        "ValidateProgramPipelineEXT",

        GLuint("pipeline")
    )

    void(
        "ProgramUniform1uiEXT",

        GLuint("program"),
        GLint("location"),
        GLuint("v0")
    )

    void(
        "ProgramUniform2uiEXT",

        GLuint("program"),
        GLint("location"),
        GLuint("v0"),
        GLuint("v1")
    )

    void(
        "ProgramUniform3uiEXT",

        GLuint("program"),
        GLint("location"),
        GLuint("v0"),
        GLuint("v1"),
        GLuint("v2")
    )

    void(
        "ProgramUniform4uiEXT",

        GLuint("program"),
        GLint("location"),
        GLuint("v0"),
        GLuint("v1"),
        GLuint("v2"),
        GLuint("v3")
    )

    void(
        "ProgramUniform1uivEXT",

        GLuint("program"),
        GLint("location"),
        AutoSize("value")..GLsizei("count"),
        GLuint.const.p("value")
    )

    void(
        "ProgramUniform2uivEXT",

        GLuint("program"),
        GLint("location"),
        AutoSize(2, "value")..GLsizei("count"),
        GLuint.const.p("value")
    )

    void(
        "ProgramUniform3uivEXT",

        GLuint("program"),
        GLint("location"),
        AutoSize(3, "value")..GLsizei("count"),
        GLuint.const.p("value")
    )

    void(
        "ProgramUniform4uivEXT",

        GLuint("program"),
        GLint("location"),
        AutoSize(4, "value")..GLsizei("count"),
        GLuint.const.p("value")
    )

    void(
        "ProgramUniformMatrix2x3fvEXT",

        GLuint("program"),
        GLint("location"),
        AutoSize(2 x 3, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLfloat.const.p("value")
    )

    void(
        "ProgramUniformMatrix3x2fvEXT",

        GLuint("program"),
        GLint("location"),
        AutoSize(3 x 2, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLfloat.const.p("value")
    )

    void(
        "ProgramUniformMatrix2x4fvEXT",

        GLuint("program"),
        GLint("location"),
        AutoSize(2 x 4, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLfloat.const.p("value")
    )

    void(
        "ProgramUniformMatrix4x2fvEXT",

        GLuint("program"),
        GLint("location"),
        AutoSize(4 x 2, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLfloat.const.p("value")
    )

    void(
        "ProgramUniformMatrix3x4fvEXT",

        GLuint("program"),
        GLint("location"),
        AutoSize(3 x 4, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLfloat.const.p("value")
    )

    void(
        "ProgramUniformMatrix4x3fvEXT",

        GLuint("program"),
        GLint("location"),
        AutoSize(4 x 3, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLfloat.const.p("value")
    )
}