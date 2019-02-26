/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val GLES31 = "GLES31".nativeClassGLES("GLES31", postfix = "") {
    extends = GLES30
    documentation =
        "The core OpenGL ES 3.1 functionality."

    IntConstant(
        "",

        "COMPUTE_SHADER"..0x91B9,
        "MAX_COMPUTE_UNIFORM_BLOCKS"..0x91BB,
        "MAX_COMPUTE_TEXTURE_IMAGE_UNITS"..0x91BC,
        "MAX_COMPUTE_IMAGE_UNIFORMS"..0x91BD,
        "MAX_COMPUTE_SHARED_MEMORY_SIZE"..0x8262,
        "MAX_COMPUTE_UNIFORM_COMPONENTS"..0x8263,
        "MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS"..0x8264,
        "MAX_COMPUTE_ATOMIC_COUNTERS"..0x8265,
        "MAX_COMBINED_COMPUTE_UNIFORM_COMPONENTS"..0x8266,
        "MAX_COMPUTE_WORK_GROUP_INVOCATIONS"..0x90EB,
        "MAX_COMPUTE_WORK_GROUP_COUNT"..0x91BE,
        "MAX_COMPUTE_WORK_GROUP_SIZE"..0x91BF,
        "COMPUTE_WORK_GROUP_SIZE"..0x8267,
        "DISPATCH_INDIRECT_BUFFER"..0x90EE,
        "DISPATCH_INDIRECT_BUFFER_BINDING"..0x90EF,
        "COMPUTE_SHADER_BIT"..0x00000020,
        "DRAW_INDIRECT_BUFFER"..0x8F3F,
        "DRAW_INDIRECT_BUFFER_BINDING"..0x8F43,
        "MAX_UNIFORM_LOCATIONS"..0x826E,
        "FRAMEBUFFER_DEFAULT_WIDTH"..0x9310,
        "FRAMEBUFFER_DEFAULT_HEIGHT"..0x9311,
        "FRAMEBUFFER_DEFAULT_SAMPLES"..0x9313,
        "FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS"..0x9314,
        "MAX_FRAMEBUFFER_WIDTH"..0x9315,
        "MAX_FRAMEBUFFER_HEIGHT"..0x9316,
        "MAX_FRAMEBUFFER_SAMPLES"..0x9318,
        "UNIFORM"..0x92E1,
        "UNIFORM_BLOCK"..0x92E2,
        "PROGRAM_INPUT"..0x92E3,
        "PROGRAM_OUTPUT"..0x92E4,
        "BUFFER_VARIABLE"..0x92E5,
        "SHADER_STORAGE_BLOCK"..0x92E6,
        "ATOMIC_COUNTER_BUFFER"..0x92C0,
        "TRANSFORM_FEEDBACK_VARYING"..0x92F4,
        "ACTIVE_RESOURCES"..0x92F5,
        "MAX_NAME_LENGTH"..0x92F6,
        "MAX_NUM_ACTIVE_VARIABLES"..0x92F7,
        "NAME_LENGTH"..0x92F9,
        "TYPE"..0x92FA,
        "ARRAY_SIZE"..0x92FB,
        "OFFSET"..0x92FC,
        "BLOCK_INDEX"..0x92FD,
        "ARRAY_STRIDE"..0x92FE,
        "MATRIX_STRIDE"..0x92FF,
        "IS_ROW_MAJOR"..0x9300,
        "ATOMIC_COUNTER_BUFFER_INDEX"..0x9301,
        "BUFFER_BINDING"..0x9302,
        "BUFFER_DATA_SIZE"..0x9303,
        "NUM_ACTIVE_VARIABLES"..0x9304,
        "ACTIVE_VARIABLES"..0x9305,
        "REFERENCED_BY_VERTEX_SHADER"..0x9306,
        "REFERENCED_BY_FRAGMENT_SHADER"..0x930A,
        "REFERENCED_BY_COMPUTE_SHADER"..0x930B,
        "TOP_LEVEL_ARRAY_SIZE"..0x930C,
        "TOP_LEVEL_ARRAY_STRIDE"..0x930D,
        "LOCATION"..0x930E,
        "VERTEX_SHADER_BIT"..0x00000001,
        "FRAGMENT_SHADER_BIT"..0x00000002,
        "ALL_SHADER_BITS".."0xFFFFFFFF",
        "PROGRAM_SEPARABLE"..0x8258,
        "ACTIVE_PROGRAM"..0x8259,
        "PROGRAM_PIPELINE_BINDING"..0x825A,
        "ATOMIC_COUNTER_BUFFER_BINDING"..0x92C1,
        "ATOMIC_COUNTER_BUFFER_START"..0x92C2,
        "ATOMIC_COUNTER_BUFFER_SIZE"..0x92C3,
        "MAX_VERTEX_ATOMIC_COUNTER_BUFFERS"..0x92CC,
        "MAX_FRAGMENT_ATOMIC_COUNTER_BUFFERS"..0x92D0,
        "MAX_COMBINED_ATOMIC_COUNTER_BUFFERS"..0x92D1,
        "MAX_VERTEX_ATOMIC_COUNTERS"..0x92D2,
        "MAX_FRAGMENT_ATOMIC_COUNTERS"..0x92D6,
        "MAX_COMBINED_ATOMIC_COUNTERS"..0x92D7,
        "MAX_ATOMIC_COUNTER_BUFFER_SIZE"..0x92D8,
        "MAX_ATOMIC_COUNTER_BUFFER_BINDINGS"..0x92DC,
        "ACTIVE_ATOMIC_COUNTER_BUFFERS"..0x92D9,
        "UNSIGNED_INT_ATOMIC_COUNTER"..0x92DB,
        "MAX_IMAGE_UNITS"..0x8F38,
        "MAX_VERTEX_IMAGE_UNIFORMS"..0x90CA,
        "MAX_FRAGMENT_IMAGE_UNIFORMS"..0x90CE,
        "MAX_COMBINED_IMAGE_UNIFORMS"..0x90CF,
        "IMAGE_BINDING_NAME"..0x8F3A,
        "IMAGE_BINDING_LEVEL"..0x8F3B,
        "IMAGE_BINDING_LAYERED"..0x8F3C,
        "IMAGE_BINDING_LAYER"..0x8F3D,
        "IMAGE_BINDING_ACCESS"..0x8F3E,
        "IMAGE_BINDING_FORMAT"..0x906E,
        "VERTEX_ATTRIB_ARRAY_BARRIER_BIT"..0x00000001,
        "ELEMENT_ARRAY_BARRIER_BIT"..0x00000002,
        "UNIFORM_BARRIER_BIT"..0x00000004,
        "TEXTURE_FETCH_BARRIER_BIT"..0x00000008,
        "SHADER_IMAGE_ACCESS_BARRIER_BIT"..0x00000020,
        "COMMAND_BARRIER_BIT"..0x00000040,
        "PIXEL_BUFFER_BARRIER_BIT"..0x00000080,
        "TEXTURE_UPDATE_BARRIER_BIT"..0x00000100,
        "BUFFER_UPDATE_BARRIER_BIT"..0x00000200,
        "FRAMEBUFFER_BARRIER_BIT"..0x00000400,
        "TRANSFORM_FEEDBACK_BARRIER_BIT"..0x00000800,
        "ATOMIC_COUNTER_BARRIER_BIT"..0x00001000,
        "ALL_BARRIER_BITS".."0xFFFFFFFF",
        "IMAGE_2D"..0x904D,
        "IMAGE_3D"..0x904E,
        "IMAGE_CUBE"..0x9050,
        "IMAGE_2D_ARRAY"..0x9053,
        "INT_IMAGE_2D"..0x9058,
        "INT_IMAGE_3D"..0x9059,
        "INT_IMAGE_CUBE"..0x905B,
        "INT_IMAGE_2D_ARRAY"..0x905E,
        "UNSIGNED_INT_IMAGE_2D"..0x9063,
        "UNSIGNED_INT_IMAGE_3D"..0x9064,
        "UNSIGNED_INT_IMAGE_CUBE"..0x9066,
        "UNSIGNED_INT_IMAGE_2D_ARRAY"..0x9069,
        "IMAGE_FORMAT_COMPATIBILITY_TYPE"..0x90C7,
        "IMAGE_FORMAT_COMPATIBILITY_BY_SIZE"..0x90C8,
        "IMAGE_FORMAT_COMPATIBILITY_BY_CLASS"..0x90C9,
        "READ_ONLY"..0x88B8,
        "WRITE_ONLY"..0x88B9,
        "READ_WRITE"..0x88BA,
        "SHADER_STORAGE_BUFFER"..0x90D2,
        "SHADER_STORAGE_BUFFER_BINDING"..0x90D3,
        "SHADER_STORAGE_BUFFER_START"..0x90D4,
        "SHADER_STORAGE_BUFFER_SIZE"..0x90D5,
        "MAX_VERTEX_SHADER_STORAGE_BLOCKS"..0x90D6,
        "MAX_FRAGMENT_SHADER_STORAGE_BLOCKS"..0x90DA,
        "MAX_COMPUTE_SHADER_STORAGE_BLOCKS"..0x90DB,
        "MAX_COMBINED_SHADER_STORAGE_BLOCKS"..0x90DC,
        "MAX_SHADER_STORAGE_BUFFER_BINDINGS"..0x90DD,
        "MAX_SHADER_STORAGE_BLOCK_SIZE"..0x90DE,
        "SHADER_STORAGE_BUFFER_OFFSET_ALIGNMENT"..0x90DF,
        "SHADER_STORAGE_BARRIER_BIT"..0x00002000,
        "MAX_COMBINED_SHADER_OUTPUT_RESOURCES"..0x8F39,
        "DEPTH_STENCIL_TEXTURE_MODE"..0x90EA,
        "STENCIL_INDEX"..0x1901,
        "MIN_PROGRAM_TEXTURE_GATHER_OFFSET"..0x8E5E,
        "MAX_PROGRAM_TEXTURE_GATHER_OFFSET"..0x8E5F,
        "SAMPLE_POSITION"..0x8E50,
        "SAMPLE_MASK"..0x8E51,
        "SAMPLE_MASK_VALUE"..0x8E52,
        "TEXTURE_2D_MULTISAMPLE"..0x9100,
        "MAX_SAMPLE_MASK_WORDS"..0x8E59,
        "MAX_COLOR_TEXTURE_SAMPLES"..0x910E,
        "MAX_DEPTH_TEXTURE_SAMPLES"..0x910F,
        "MAX_INTEGER_SAMPLES"..0x9110,
        "TEXTURE_BINDING_2D_MULTISAMPLE"..0x9104,
        "TEXTURE_SAMPLES"..0x9106,
        "TEXTURE_FIXED_SAMPLE_LOCATIONS"..0x9107,
        "TEXTURE_WIDTH"..0x1000,
        "TEXTURE_HEIGHT"..0x1001,
        "TEXTURE_DEPTH"..0x8071,
        "TEXTURE_INTERNAL_FORMAT"..0x1003,
        "TEXTURE_RED_SIZE"..0x805C,
        "TEXTURE_GREEN_SIZE"..0x805D,
        "TEXTURE_BLUE_SIZE"..0x805E,
        "TEXTURE_ALPHA_SIZE"..0x805F,
        "TEXTURE_DEPTH_SIZE"..0x884A,
        "TEXTURE_STENCIL_SIZE"..0x88F1,
        "TEXTURE_SHARED_SIZE"..0x8C3F,
        "TEXTURE_RED_TYPE"..0x8C10,
        "TEXTURE_GREEN_TYPE"..0x8C11,
        "TEXTURE_BLUE_TYPE"..0x8C12,
        "TEXTURE_ALPHA_TYPE"..0x8C13,
        "TEXTURE_DEPTH_TYPE"..0x8C16,
        "TEXTURE_COMPRESSED"..0x86A1,
        "SAMPLER_2D_MULTISAMPLE"..0x9108,
        "INT_SAMPLER_2D_MULTISAMPLE"..0x9109,
        "UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE"..0x910A,
        "VERTEX_ATTRIB_BINDING"..0x82D4,
        "VERTEX_ATTRIB_RELATIVE_OFFSET"..0x82D5,
        "VERTEX_BINDING_DIVISOR"..0x82D6,
        "VERTEX_BINDING_OFFSET"..0x82D7,
        "VERTEX_BINDING_STRIDE"..0x82D8,
        "VERTEX_BINDING_BUFFER"..0x8F4F,
        "MAX_VERTEX_ATTRIB_RELATIVE_OFFSET"..0x82D9,
        "MAX_VERTEX_ATTRIB_BINDINGS"..0x82DA,
        "MAX_VERTEX_ATTRIB_STRIDE"..0x82E5
    )

    void(
        "DispatchCompute",
        "",

        GLuint("num_groups_x", ""),
        GLuint("num_groups_y", ""),
        GLuint("num_groups_z", "")
    )

    void(
        "DispatchComputeIndirect",
        "",

        GLintptr("indirect", "")
    )

    void(
        "DrawArraysIndirect",
        "",

        GLenum("mode", ""),
        RawPointer..Check("4 * 4")..MultiType(
            PointerMapping.DATA_INT
        )..void.const.p("indirect", "")
    )

    void(
        "DrawElementsIndirect",
        "",

        GLenum("mode", ""),
        GLenum("type", ""),
        RawPointer..Check("5 * 4")..MultiType(
            PointerMapping.DATA_INT
        )..void.const.p("indirect", "")
    )

    void(
        "FramebufferParameteri",
        "",

        GLenum("target", ""),
        GLenum("pname", ""),
        GLint("param", "")
    )

    void(
        "GetFramebufferParameteriv",
        "",

        GLenum("target", ""),
        GLenum("pname", ""),
        ReturnParam..Check(1)..GLint.p("params", "")
    )

    void(
        "GetProgramInterfaceiv",
        "",

        GLuint("program", ""),
        GLenum("programInterface", ""),
        GLenum("pname", ""),
        ReturnParam..Check(1)..GLint.p("params", "")
    )

    GLuint(
        "GetProgramResourceIndex",
        "",

        GLuint("program", ""),
        GLenum("programInterface", ""),
        GLcharASCII.const.p("name", "")
    )

    void(
        "GetProgramResourceName",
        "",

        GLuint("program", ""),
        GLenum("programInterface", ""),
        GLuint("index", ""),
        AutoSize("name")..GLsizei("bufSize", ""),
        Check(1)..nullable..GLsizei.p("length", ""),
        Return(
            "length",
            "glGetProgramInterfacei(program, programInterface, GL_MAX_NAME_LENGTH)"
        )..GLcharASCII.p("name", "")
    )

    void(
        "GetProgramResourceiv",
        "",

        GLuint("program", ""),
        GLenum("programInterface", ""),
        GLuint("index", ""),
        AutoSize("props")..GLsizei("propCount", ""),
        GLenum.const.p("props", ""),
        AutoSize("params")..GLsizei("bufSize", ""),
        Check(1)..nullable..GLsizei.p("length", ""),
        GLint.p("params", "")
    )

    GLint(
        "GetProgramResourceLocation",
        "",

        GLuint("program", ""),
        GLenum("programInterface", ""),
        GLcharASCII.const.p("name", "")
    )

    void(
        "UseProgramStages",
        "",

        GLuint("pipeline", ""),
        GLbitfield("stages", ""),
        GLuint("program", "")
    )

    void(
        "ActiveShaderProgram",
        "",

        GLuint("pipeline", ""),
        GLuint("program", "")
    )

    GLuint(
        "CreateShaderProgramv",
        "",

        GLenum("type", ""),
        AutoSize("strings")..GLsizei("count", ""),
        PointerArray(GLcharUTF8.p, "string")..GLcharUTF8.const.p.const.p("strings", "")
    )

    void(
        "BindProgramPipeline",
        "",

        GLuint("pipeline", "")
    )

    void(
        "DeleteProgramPipelines",
        "",

        AutoSize("pipelines")..GLsizei("n", ""),
        SingleValue("pipeline")..GLuint.const.p("pipelines", "")
    )

    void(
        "GenProgramPipelines",
        "",

        AutoSize("pipelines")..GLsizei("n", ""),
        ReturnParam..GLuint.p("pipelines", "")
    )

    GLboolean(
        "IsProgramPipeline",
        "",

        GLuint("pipeline", "")
    )

    void(
        "GetProgramPipelineiv",
        "",

        GLuint("pipeline", ""),
        GLenum("pname", ""),
        ReturnParam..Check(1)..GLint.p("params", "")
    )

    void(
        "ProgramUniform1i",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        GLint("v0", "")
    )

    void(
        "ProgramUniform2i",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        GLint("v0", ""),
        GLint("v1", "")
    )

    void(
        "ProgramUniform3i",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        GLint("v0", ""),
        GLint("v1", ""),
        GLint("v2", "")
    )

    void(
        "ProgramUniform4i",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        GLint("v0", ""),
        GLint("v1", ""),
        GLint("v2", ""),
        GLint("v3", "")
    )

    void(
        "ProgramUniform1ui",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        GLuint("v0", "")
    )

    void(
        "ProgramUniform2ui",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        GLuint("v0", ""),
        GLuint("v1", "")
    )

    void(
        "ProgramUniform3ui",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        GLuint("v0", ""),
        GLuint("v1", ""),
        GLuint("v2", "")
    )

    void(
        "ProgramUniform4ui",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        GLuint("v0", ""),
        GLuint("v1", ""),
        GLuint("v2", ""),
        GLuint("v3", "")
    )

    void(
        "ProgramUniform1f",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        GLfloat("v0", "")
    )

    void(
        "ProgramUniform2f",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        GLfloat("v0", ""),
        GLfloat("v1", "")
    )

    void(
        "ProgramUniform3f",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        GLfloat("v0", ""),
        GLfloat("v1", ""),
        GLfloat("v2", "")
    )

    void(
        "ProgramUniform4f",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        GLfloat("v0", ""),
        GLfloat("v1", ""),
        GLfloat("v2", ""),
        GLfloat("v3", "")
    )

    void(
        "ProgramUniform1iv",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize("value")..GLsizei("count", ""),
        GLint.const.p("value", "")
    )

    void(
        "ProgramUniform2iv",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(2, "value")..GLsizei("count", ""),
        GLint.const.p("value", "")
    )

    void(
        "ProgramUniform3iv",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(3, "value")..GLsizei("count", ""),
        GLint.const.p("value", "")
    )

    void(
        "ProgramUniform4iv",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(4, "value")..GLsizei("count", ""),
        GLint.const.p("value", "")
    )

    void(
        "ProgramUniform1uiv",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize("value")..GLsizei("count", ""),
        GLuint.const.p("value", "")
    )

    void(
        "ProgramUniform2uiv",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(2, "value")..GLsizei("count", ""),
        GLuint.const.p("value", "")
    )

    void(
        "ProgramUniform3uiv",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(3, "value")..GLsizei("count", ""),
        GLuint.const.p("value", "")
    )

    void(
        "ProgramUniform4uiv",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(4, "value")..GLsizei("count", ""),
        GLuint.const.p("value", "")
    )

    void(
        "ProgramUniform1fv",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize("value")..GLsizei("count", ""),
        GLfloat.const.p("value", "")
    )

    void(
        "ProgramUniform2fv",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(2, "value")..GLsizei("count", ""),
        GLfloat.const.p("value", "")
    )

    void(
        "ProgramUniform3fv",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(3, "value")..GLsizei("count", ""),
        GLfloat.const.p("value", "")
    )

    void(
        "ProgramUniform4fv",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(4, "value")..GLsizei("count", ""),
        GLfloat.const.p("value", "")
    )

    void(
        "ProgramUniformMatrix2fv",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(2 x 2, "value")..GLsizei("count", ""),
        GLboolean("transpose", ""),
        GLfloat.const.p("value", "")
    )

    void(
        "ProgramUniformMatrix3fv",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(3 x 3, "value")..GLsizei("count", ""),
        GLboolean("transpose", ""),
        GLfloat.const.p("value", "")
    )

    void(
        "ProgramUniformMatrix4fv",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(4 x 4, "value")..GLsizei("count", ""),
        GLboolean("transpose", ""),
        GLfloat.const.p("value", "")
    )

    void(
        "ProgramUniformMatrix2x3fv",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(2 x 3, "value")..GLsizei("count", ""),
        GLboolean("transpose", ""),
        GLfloat.const.p("value", "")
    )

    void(
        "ProgramUniformMatrix3x2fv",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(3 x 2, "value")..GLsizei("count", ""),
        GLboolean("transpose", ""),
        GLfloat.const.p("value", "")
    )

    void(
        "ProgramUniformMatrix2x4fv",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(2 x 4, "value")..GLsizei("count", ""),
        GLboolean("transpose", ""),
        GLfloat.const.p("value", "")
    )

    void(
        "ProgramUniformMatrix4x2fv",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(4 x 2, "value")..GLsizei("count", ""),
        GLboolean("transpose", ""),
        GLfloat.const.p("value", "")
    )

    void(
        "ProgramUniformMatrix3x4fv",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(3 x 4, "value")..GLsizei("count", ""),
        GLboolean("transpose", ""),
        GLfloat.const.p("value", "")
    )

    void(
        "ProgramUniformMatrix4x3fv",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(4 x 3, "value")..GLsizei("count", ""),
        GLboolean("transpose", ""),
        GLfloat.const.p("value", "")
    )

    void(
        "ValidateProgramPipeline",
        "",

        GLuint("pipeline", "")
    )

    void(
        "GetProgramPipelineInfoLog",
        "",

        GLuint("pipeline", ""),
        AutoSize("infoLog")..GLsizei("bufSize", ""),
        Check(1)..nullable..GLsizei.p("length", ""),
        Return(
            "length",
            "glGetProgramPipelinei(pipeline, GLES20.GL_INFO_LOG_LENGTH)",
            heapAllocate = true
        )..GLcharUTF8.p("infoLog", "")
    )

    void(
        "BindImageTexture",
        "",

        GLuint("unit", ""),
        GLuint("texture", ""),
        GLint("level", ""),
        GLboolean("layered", ""),
        GLint("layer", ""),
        GLenum("access", ""),
        GLenum("format", "")
    )

    void(
        "GetBooleani_v",
        "",

        GLenum("target", ""),
        GLuint("index", ""),
        ReturnParam..Check(1)..GLboolean.p("data", "")
    )

    void(
        "MemoryBarrier",
        "",

        GLbitfield("barriers", "")
    )

    void(
        "MemoryBarrierByRegion",
        "",

        GLbitfield("barriers", "")
    )

    void(
        "TexStorage2DMultisample",
        "",

        GLenum("target", ""),
        GLsizei("samples", ""),
        GLenum("internalformat", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLboolean("fixedsamplelocations", "")
    )

    void(
        "GetMultisamplefv",
        "",

        GLenum("pname", ""),
        GLuint("index", ""),
        ReturnParam..Check(1)..GLfloat.p("val", "")
    )

    void(
        "SampleMaski",
        "",

        GLuint("maskNumber", ""),
        GLbitfield("mask", "")
    )

    void(
        "GetTexLevelParameteriv",
        "",

        GLenum("target", ""),
        GLint("level", ""),
        GLenum("pname", ""),
        ReturnParam..Check(1)..GLint.p("params", "")
    )

    void(
        "GetTexLevelParameterfv",
        "",

        GLenum("target", ""),
        GLint("level", ""),
        GLenum("pname", ""),
        ReturnParam..Check(1)..GLfloat.p("params", "")
    )

    void(
        "BindVertexBuffer",
        "",

        GLuint("bindingindex", ""),
        GLuint("buffer", ""),
        GLintptr("offset", ""),
        GLsizei("stride", "")
    )

    void(
        "VertexAttribFormat",
        "",

        GLuint("attribindex", ""),
        GLint("size", ""),
        GLenum("type", ""),
        GLboolean("normalized", ""),
        GLuint("relativeoffset", "")
    )

    void(
        "VertexAttribIFormat",
        "",

        GLuint("attribindex", ""),
        GLint("size", ""),
        GLenum("type", ""),
        GLuint("relativeoffset", "")
    )

    void(
        "VertexAttribBinding",
        "",

        GLuint("attribindex", ""),
        GLuint("bindingindex", "")
    )

    void(
        "VertexBindingDivisor",
        "",

        GLuint("bindingindex", ""),
        GLuint("divisor", "")
    )
}