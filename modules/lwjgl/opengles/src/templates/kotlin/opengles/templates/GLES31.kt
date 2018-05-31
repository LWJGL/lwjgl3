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

        GLuint.IN("num_groups_x", ""),
        GLuint.IN("num_groups_y", ""),
        GLuint.IN("num_groups_z", "")
    )

    void(
        "DispatchComputeIndirect",
        "",

        GLintptr.IN("indirect", "")
    )

    void(
        "DrawArraysIndirect",
        "",

        GLenum.IN("mode", ""),
        DRAW_INDIRECT_BUFFER..Check("4 * 4")..MultiType(
            PointerMapping.DATA_INT
        )..void.const.p.IN("indirect", "")
    )

    void(
        "DrawElementsIndirect",
        "",

        GLenum.IN("mode", ""),
        GLenum.IN("type", ""),
        DRAW_INDIRECT_BUFFER..Check("5 * 4")..MultiType(
            PointerMapping.DATA_INT
        )..void.const.p.IN("indirect", "")
    )

    void(
        "FramebufferParameteri",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        GLint.IN("param", "")
    )

    void(
        "GetFramebufferParameteriv",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLint.p.OUT("params", "")
    )

    void(
        "GetProgramInterfaceiv",
        "",

        GLuint.IN("program", ""),
        GLenum.IN("programInterface", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLint.p.OUT("params", "")
    )

    GLuint(
        "GetProgramResourceIndex",
        "",

        GLuint.IN("program", ""),
        GLenum.IN("programInterface", ""),
        GLcharASCII.const.p.IN("name", "")
    )

    void(
        "GetProgramResourceName",
        "",

        GLuint.IN("program", ""),
        GLenum.IN("programInterface", ""),
        GLuint.IN("index", ""),
        AutoSize("name")..GLsizei.IN("bufSize", ""),
        Check(1)..nullable..GLsizei.p.OUT("length", ""),
        Return(
            "length",
            "glGetProgramInterfacei(program, programInterface, GL_MAX_NAME_LENGTH)"
        )..GLcharASCII.p.OUT("name", "")
    )

    void(
        "GetProgramResourceiv",
        "",

        GLuint.IN("program", ""),
        GLenum.IN("programInterface", ""),
        GLuint.IN("index", ""),
        AutoSize("props")..GLsizei.IN("propCount", ""),
        GLenum.const.p.IN("props", ""),
        AutoSize("params")..GLsizei.IN("bufSize", ""),
        Check(1)..nullable..GLsizei.p.OUT("length", ""),
        GLint.p.OUT("params", "")
    )

    GLint(
        "GetProgramResourceLocation",
        "",

        GLuint.IN("program", ""),
        GLenum.IN("programInterface", ""),
        GLcharASCII.const.p.IN("name", "")
    )

    void(
        "UseProgramStages",
        "",

        GLuint.IN("pipeline", ""),
        GLbitfield.IN("stages", ""),
        GLuint.IN("program", "")
    )

    void(
        "ActiveShaderProgram",
        "",

        GLuint.IN("pipeline", ""),
        GLuint.IN("program", "")
    )

    GLuint(
        "CreateShaderProgramv",
        "",

        GLenum.IN("type", ""),
        AutoSize("strings")..GLsizei.IN("count", ""),
        PointerArray(GLcharUTF8.p, "string")..GLcharUTF8.const.p.const.p.IN("strings", "")
    )

    void(
        "BindProgramPipeline",
        "",

        GLuint.IN("pipeline", "")
    )

    void(
        "DeleteProgramPipelines",
        "",

        AutoSize("pipelines")..GLsizei.IN("n", ""),
        SingleValue("pipeline")..GLuint.const.p.IN("pipelines", "")
    )

    void(
        "GenProgramPipelines",
        "",

        AutoSize("pipelines")..GLsizei.IN("n", ""),
        ReturnParam..GLuint.p.OUT("pipelines", "")
    )

    GLboolean(
        "IsProgramPipeline",
        "",

        GLuint.IN("pipeline", "")
    )

    void(
        "GetProgramPipelineiv",
        "",

        GLuint.IN("pipeline", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLint.p.OUT("params", "")
    )

    void(
        "ProgramUniform1i",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        GLint.IN("v0", "")
    )

    void(
        "ProgramUniform2i",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        GLint.IN("v0", ""),
        GLint.IN("v1", "")
    )

    void(
        "ProgramUniform3i",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        GLint.IN("v0", ""),
        GLint.IN("v1", ""),
        GLint.IN("v2", "")
    )

    void(
        "ProgramUniform4i",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        GLint.IN("v0", ""),
        GLint.IN("v1", ""),
        GLint.IN("v2", ""),
        GLint.IN("v3", "")
    )

    void(
        "ProgramUniform1ui",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        GLuint.IN("v0", "")
    )

    void(
        "ProgramUniform2ui",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        GLuint.IN("v0", ""),
        GLuint.IN("v1", "")
    )

    void(
        "ProgramUniform3ui",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        GLuint.IN("v0", ""),
        GLuint.IN("v1", ""),
        GLuint.IN("v2", "")
    )

    void(
        "ProgramUniform4ui",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        GLuint.IN("v0", ""),
        GLuint.IN("v1", ""),
        GLuint.IN("v2", ""),
        GLuint.IN("v3", "")
    )

    void(
        "ProgramUniform1f",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        GLfloat.IN("v0", "")
    )

    void(
        "ProgramUniform2f",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        GLfloat.IN("v0", ""),
        GLfloat.IN("v1", "")
    )

    void(
        "ProgramUniform3f",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        GLfloat.IN("v0", ""),
        GLfloat.IN("v1", ""),
        GLfloat.IN("v2", "")
    )

    void(
        "ProgramUniform4f",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        GLfloat.IN("v0", ""),
        GLfloat.IN("v1", ""),
        GLfloat.IN("v2", ""),
        GLfloat.IN("v3", "")
    )

    void(
        "ProgramUniform1iv",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize("value")..GLsizei.IN("count", ""),
        GLint.const.p.IN("value", "")
    )

    void(
        "ProgramUniform2iv",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize(2, "value")..GLsizei.IN("count", ""),
        GLint.const.p.IN("value", "")
    )

    void(
        "ProgramUniform3iv",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize(3, "value")..GLsizei.IN("count", ""),
        GLint.const.p.IN("value", "")
    )

    void(
        "ProgramUniform4iv",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize(4, "value")..GLsizei.IN("count", ""),
        GLint.const.p.IN("value", "")
    )

    void(
        "ProgramUniform1uiv",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize("value")..GLsizei.IN("count", ""),
        GLuint.const.p.IN("value", "")
    )

    void(
        "ProgramUniform2uiv",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize(2, "value")..GLsizei.IN("count", ""),
        GLuint.const.p.IN("value", "")
    )

    void(
        "ProgramUniform3uiv",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize(3, "value")..GLsizei.IN("count", ""),
        GLuint.const.p.IN("value", "")
    )

    void(
        "ProgramUniform4uiv",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize(4, "value")..GLsizei.IN("count", ""),
        GLuint.const.p.IN("value", "")
    )

    void(
        "ProgramUniform1fv",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize("value")..GLsizei.IN("count", ""),
        GLfloat.const.p.IN("value", "")
    )

    void(
        "ProgramUniform2fv",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize(2, "value")..GLsizei.IN("count", ""),
        GLfloat.const.p.IN("value", "")
    )

    void(
        "ProgramUniform3fv",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize(3, "value")..GLsizei.IN("count", ""),
        GLfloat.const.p.IN("value", "")
    )

    void(
        "ProgramUniform4fv",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize(4, "value")..GLsizei.IN("count", ""),
        GLfloat.const.p.IN("value", "")
    )

    void(
        "ProgramUniformMatrix2fv",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize(2 x 2, "value")..GLsizei.IN("count", ""),
        GLboolean.IN("transpose", ""),
        GLfloat.const.p.IN("value", "")
    )

    void(
        "ProgramUniformMatrix3fv",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize(3 x 3, "value")..GLsizei.IN("count", ""),
        GLboolean.IN("transpose", ""),
        GLfloat.const.p.IN("value", "")
    )

    void(
        "ProgramUniformMatrix4fv",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize(4 x 4, "value")..GLsizei.IN("count", ""),
        GLboolean.IN("transpose", ""),
        GLfloat.const.p.IN("value", "")
    )

    void(
        "ProgramUniformMatrix2x3fv",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize(2 x 3, "value")..GLsizei.IN("count", ""),
        GLboolean.IN("transpose", ""),
        GLfloat.const.p.IN("value", "")
    )

    void(
        "ProgramUniformMatrix3x2fv",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize(3 x 2, "value")..GLsizei.IN("count", ""),
        GLboolean.IN("transpose", ""),
        GLfloat.const.p.IN("value", "")
    )

    void(
        "ProgramUniformMatrix2x4fv",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize(2 x 4, "value")..GLsizei.IN("count", ""),
        GLboolean.IN("transpose", ""),
        GLfloat.const.p.IN("value", "")
    )

    void(
        "ProgramUniformMatrix4x2fv",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize(4 x 2, "value")..GLsizei.IN("count", ""),
        GLboolean.IN("transpose", ""),
        GLfloat.const.p.IN("value", "")
    )

    void(
        "ProgramUniformMatrix3x4fv",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize(3 x 4, "value")..GLsizei.IN("count", ""),
        GLboolean.IN("transpose", ""),
        GLfloat.const.p.IN("value", "")
    )

    void(
        "ProgramUniformMatrix4x3fv",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize(4 x 3, "value")..GLsizei.IN("count", ""),
        GLboolean.IN("transpose", ""),
        GLfloat.const.p.IN("value", "")
    )

    void(
        "ValidateProgramPipeline",
        "",

        GLuint.IN("pipeline", "")
    )

    void(
        "GetProgramPipelineInfoLog",
        "",

        GLuint.IN("pipeline", ""),
        AutoSize("infoLog")..GLsizei.IN("bufSize", ""),
        Check(1)..nullable..GLsizei.p.OUT("length", ""),
        Return(
            "length",
            "glGetProgramPipelinei(pipeline, GLES20.GL_INFO_LOG_LENGTH)",
            heapAllocate = true
        )..GLcharUTF8.p.OUT("infoLog", "")
    )

    void(
        "BindImageTexture",
        "",

        GLuint.IN("unit", ""),
        GLuint.IN("texture", ""),
        GLint.IN("level", ""),
        GLboolean.IN("layered", ""),
        GLint.IN("layer", ""),
        GLenum.IN("access", ""),
        GLenum.IN("format", "")
    )

    void(
        "GetBooleani_v",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", ""),
        ReturnParam..Check(1)..GLboolean.p.OUT("data", "")
    )

    void(
        "MemoryBarrier",
        "",

        GLbitfield.IN("barriers", "")
    )

    void(
        "MemoryBarrierByRegion",
        "",

        GLbitfield.IN("barriers", "")
    )

    void(
        "TexStorage2DMultisample",
        "",

        GLenum.IN("target", ""),
        GLsizei.IN("samples", ""),
        GLenum.IN("internalformat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLboolean.IN("fixedsamplelocations", "")
    )

    void(
        "GetMultisamplefv",
        "",

        GLenum.IN("pname", ""),
        GLuint.IN("index", ""),
        ReturnParam..Check(1)..GLfloat.p.OUT("val", "")
    )

    void(
        "SampleMaski",
        "",

        GLuint.IN("maskNumber", ""),
        GLbitfield.IN("mask", "")
    )

    void(
        "GetTexLevelParameteriv",
        "",

        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLint.p.OUT("params", "")
    )

    void(
        "GetTexLevelParameterfv",
        "",

        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLfloat.p.OUT("params", "")
    )

    void(
        "BindVertexBuffer",
        "",

        GLuint.IN("bindingindex", ""),
        GLuint.IN("buffer", ""),
        GLintptr.IN("offset", ""),
        GLsizei.IN("stride", "")
    )

    void(
        "VertexAttribFormat",
        "",

        GLuint.IN("attribindex", ""),
        GLint.IN("size", ""),
        GLenum.IN("type", ""),
        GLboolean.IN("normalized", ""),
        GLuint.IN("relativeoffset", "")
    )

    void(
        "VertexAttribIFormat",
        "",

        GLuint.IN("attribindex", ""),
        GLint.IN("size", ""),
        GLenum.IN("type", ""),
        GLuint.IN("relativeoffset", "")
    )

    void(
        "VertexAttribBinding",
        "",

        GLuint.IN("attribindex", ""),
        GLuint.IN("bindingindex", "")
    )

    void(
        "VertexBindingDivisor",
        "",

        GLuint.IN("bindingindex", ""),
        GLuint.IN("divisor", "")
    )
}