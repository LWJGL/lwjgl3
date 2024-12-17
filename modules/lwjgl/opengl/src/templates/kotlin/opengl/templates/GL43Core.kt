/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL43C = "GL43C".nativeClassGL("GL43C") {
    extends = GL42C

    IntConstant(
        "NUM_SHADING_LANGUAGE_VERSIONS"..0x82E9
    )

    IntConstant(
        "VERTEX_ATTRIB_ARRAY_LONG"..0x874E
    )

    // ARB_ES3_compatibility

    IntConstant(
        "COMPRESSED_RGB8_ETC2"..0x9274,
        "COMPRESSED_SRGB8_ETC2"..0x9275,
        "COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2"..0x9276,
        "COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2"..0x9277,
        "COMPRESSED_RGBA8_ETC2_EAC"..0x9278,
        "COMPRESSED_SRGB8_ALPHA8_ETC2_EAC"..0x9279,
        "COMPRESSED_R11_EAC"..0x9270,
        "COMPRESSED_SIGNED_R11_EAC"..0x9271,
        "COMPRESSED_RG11_EAC"..0x9272,
        "COMPRESSED_SIGNED_RG11_EAC"..0x9273
    )

    IntConstant(
        "PRIMITIVE_RESTART_FIXED_INDEX"..0x8D69
    )

    IntConstant(
        "ANY_SAMPLES_PASSED_CONSERVATIVE"..0x8D6A
    )

    IntConstant(
        "MAX_ELEMENT_INDEX"..0x8D6B
    )

    IntConstant(
        "TEXTURE_IMMUTABLE_LEVELS"..0x82DF
    )

    // ARB_clear_buffer_object

    void(
        "ClearBufferData",

        GLenum("target"),
        GLenum("internalformat"),
        GLenum("format"),
        GLenum("type"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..nullable..void.const.p("data")
    )

    void(
        "ClearBufferSubData",

        GLenum("target"),
        GLenum("internalformat"),
        GLintptr("offset"),
        GLsizeiptr("size"),
        GLenum("format"),
        GLenum("type"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..nullable..void.const.p("data")
    )

    // ARB_compute_shader

    IntConstant(
        "COMPUTE_SHADER"..0x91B9
    )

    IntConstant(
        "MAX_COMPUTE_UNIFORM_BLOCKS"..0x91BB,
        "MAX_COMPUTE_TEXTURE_IMAGE_UNITS"..0x91BC,
        "MAX_COMPUTE_IMAGE_UNIFORMS"..0x91BD,
        "MAX_COMPUTE_SHARED_MEMORY_SIZE"..0x8262,
        "MAX_COMPUTE_UNIFORM_COMPONENTS"..0x8263,
        "MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS"..0x8264,
        "MAX_COMPUTE_ATOMIC_COUNTERS"..0x8265,
        "MAX_COMBINED_COMPUTE_UNIFORM_COMPONENTS"..0x8266,
        "MAX_COMPUTE_WORK_GROUP_INVOCATIONS"..0x90EB
    )

    IntConstant(
        "MAX_COMPUTE_WORK_GROUP_COUNT"..0x91BE,
        "MAX_COMPUTE_WORK_GROUP_SIZE"..0x91BF
    )

    IntConstant(
        "COMPUTE_WORK_GROUP_SIZE"..0x8267
    )

    IntConstant(
        "UNIFORM_BLOCK_REFERENCED_BY_COMPUTE_SHADER"..0x90EC
    )

    IntConstant(
        "ATOMIC_COUNTER_BUFFER_REFERENCED_BY_COMPUTE_SHADER"..0x90ED
    )

    IntConstant(
        "DISPATCH_INDIRECT_BUFFER"..0x90EE
    )

    IntConstant(
        "DISPATCH_INDIRECT_BUFFER_BINDING"..0x90EF
    )

    IntConstant(
        "COMPUTE_SHADER_BIT"..0x00000020
    )

    void(
        "DispatchCompute",

        GLuint("num_groups_x"),
        GLuint("num_groups_y"),
        GLuint("num_groups_z")
    )

    void(
        "DispatchComputeIndirect",

        GLintptr("indirect")
    )

    // ARB_copy_image

    void(
        "CopyImageSubData",

        GLuint("srcName"),
        GLenum("srcTarget"),
        GLint("srcLevel"),
        GLint("srcX"),
        GLint("srcY"),
        GLint("srcZ"),
        GLuint("dstName"),
        GLenum("dstTarget"),
        GLint("dstLevel"),
        GLint("dstX"),
        GLint("dstY"),
        GLint("dstZ"),
        GLsizei("srcWidth"),
        GLsizei("srcHeight"),
        GLsizei("srcDepth")
    )

    // KHR_debug

    IntConstant(
        "DEBUG_OUTPUT"..0x92E0,
        "DEBUG_OUTPUT_SYNCHRONOUS"..0x8242
    )

    IntConstant(
        "CONTEXT_FLAG_DEBUG_BIT"..0x00000002
    )

    IntConstant(
        "MAX_DEBUG_MESSAGE_LENGTH"..0x9143,
        "MAX_DEBUG_LOGGED_MESSAGES"..0x9144,
        "DEBUG_LOGGED_MESSAGES"..0x9145,
        "DEBUG_NEXT_LOGGED_MESSAGE_LENGTH"..0x8243,
        "MAX_DEBUG_GROUP_STACK_DEPTH"..0x826C,
        "DEBUG_GROUP_STACK_DEPTH"..0x826D,
        "MAX_LABEL_LENGTH"..0x82E8
    )

    IntConstant(
        "DEBUG_CALLBACK_FUNCTION"..0x8244,
        "DEBUG_CALLBACK_USER_PARAM"..0x8245
    )

    IntConstant(
        "DEBUG_SOURCE_API"..0x8246,
        "DEBUG_SOURCE_WINDOW_SYSTEM"..0x8247,
        "DEBUG_SOURCE_SHADER_COMPILER"..0x8248,
        "DEBUG_SOURCE_THIRD_PARTY"..0x8249,
        "DEBUG_SOURCE_APPLICATION"..0x824A,
        "DEBUG_SOURCE_OTHER"..0x824B
    )

    IntConstant(
        "DEBUG_TYPE_ERROR"..0x824C,
        "DEBUG_TYPE_DEPRECATED_BEHAVIOR"..0x824D,
        "DEBUG_TYPE_UNDEFINED_BEHAVIOR"..0x824E,
        "DEBUG_TYPE_PORTABILITY"..0x824F,
        "DEBUG_TYPE_PERFORMANCE"..0x8250,
        "DEBUG_TYPE_OTHER"..0x8251,
        "DEBUG_TYPE_MARKER"..0x8268
    )

    IntConstant(
        "DEBUG_TYPE_PUSH_GROUP"..0x8269,
        "DEBUG_TYPE_POP_GROUP"..0x826A
    )

    IntConstant(
        "DEBUG_SEVERITY_HIGH"..0x9146,
        "DEBUG_SEVERITY_MEDIUM"..0x9147,
        "DEBUG_SEVERITY_LOW"..0x9148,
        "DEBUG_SEVERITY_NOTIFICATION"..0x826B
    )

    IntConstant(
        "BUFFER"..0x82E0,
        "SHADER"..0x82E1,
        "PROGRAM"..0x82E2,
        "QUERY"..0x82E3,
        "PROGRAM_PIPELINE"..0x82E4,
        "SAMPLER"..0x82E6
    )

    void(
        "DebugMessageControl",

        GLenum("source"),
        GLenum("type"),
        GLenum("severity"),
        AutoSize("ids")..GLsizei("count"),
        SingleValue("id")..nullable..GLuint.const.p("ids"),
        GLboolean("enabled")
    )

    void(
        "DebugMessageInsert",

        GLenum("source"),
        GLenum("type"),
        GLuint("id"),
        GLenum("severity"),
        AutoSize("message")..GLsizei("length"),
        GLcharUTF8.const.p("message")
    )

    void(
        "DebugMessageCallback",

        nullable..GLDEBUGPROC("callback"),
        nullable..opaque_const_p("userParam")
    )

    GLuint(
        "GetDebugMessageLog",

        GLuint("count"),
        AutoSize("messageLog")..GLsizei("bufsize"),
        Check("count")..nullable..GLenum.p("sources"),
        Check("count")..nullable..GLenum.p("types"),
        Check("count")..nullable..GLuint.p("ids"),
        Check("count")..nullable..GLenum.p("severities"),
        Check("count")..nullable..GLsizei.p("lengths"),
        nullable..GLcharUTF8.p("messageLog")
    )

    void(
        "PushDebugGroup",

        GLenum("source"),
        GLuint("id"),
        AutoSize("message")..GLsizei("length"),
        GLcharUTF8.const.p("message")
    )

    void("PopDebugGroup")

    void(
        "ObjectLabel",

        GLenum("identifier"),
        GLuint("name"),
        AutoSize("label")..GLsizei("length"),
        GLcharUTF8.const.p("label")
    )

    void(
        "GetObjectLabel",

        GLenum("identifier"),
        GLuint("name"),
        AutoSize("label")..GLsizei("bufSize"),
        Check(1)..nullable..GLsizei.p("length"),
        Return("length", "GL11.glGetInteger(GL_MAX_LABEL_LENGTH)")..GLcharUTF8.p("label")
    )

    void(
        "ObjectPtrLabel",

        opaque_p("ptr"),
        AutoSize("label")..GLsizei("length"),
        GLcharUTF8.const.p("label")
    )

    void(
        "GetObjectPtrLabel",

        opaque_p("ptr"),
        AutoSize("label")..GLsizei("bufSize"),
        Check(1)..nullable..GLsizei.p("length"),
        Return("length", "GL11.glGetInteger(GL_MAX_LABEL_LENGTH)")..GLcharUTF8.p("label")
    )

    // ARB_explicit_uniform_location

    IntConstant(
        "MAX_UNIFORM_LOCATIONS"..0x826E
    )

    // ARB_framebuffer_no_attachments

    IntConstant(
        "FRAMEBUFFER_DEFAULT_WIDTH"..0x9310,
        "FRAMEBUFFER_DEFAULT_HEIGHT"..0x9311,
        "FRAMEBUFFER_DEFAULT_LAYERS"..0x9312,
        "FRAMEBUFFER_DEFAULT_SAMPLES"..0x9313,
        "FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS"..0x9314
    )

    IntConstant(
        "MAX_FRAMEBUFFER_WIDTH"..0x9315,
        "MAX_FRAMEBUFFER_HEIGHT"..0x9316,
        "MAX_FRAMEBUFFER_LAYERS"..0x9317,
        "MAX_FRAMEBUFFER_SAMPLES"..0x9318
    )

    void(
        "FramebufferParameteri",

        GLenum("target"),
        GLenum("pname"),
        GLint("param")
    )

    void(
        "GetFramebufferParameteriv",

        GLenum("target"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLint.p("params")
    )

    // ARB_internalformat_query2

    IntConstant(
        "INTERNALFORMAT_SUPPORTED"..0x826F,
        "INTERNALFORMAT_PREFERRED"..0x8270,
        "INTERNALFORMAT_RED_SIZE"..0x8271,
        "INTERNALFORMAT_GREEN_SIZE"..0x8272,
        "INTERNALFORMAT_BLUE_SIZE"..0x8273,
        "INTERNALFORMAT_ALPHA_SIZE"..0x8274,
        "INTERNALFORMAT_DEPTH_SIZE"..0x8275,
        "INTERNALFORMAT_STENCIL_SIZE"..0x8276,
        "INTERNALFORMAT_SHARED_SIZE"..0x8277,
        "INTERNALFORMAT_RED_TYPE"..0x8278,
        "INTERNALFORMAT_GREEN_TYPE"..0x8279,
        "INTERNALFORMAT_BLUE_TYPE"..0x827A,
        "INTERNALFORMAT_ALPHA_TYPE"..0x827B,
        "INTERNALFORMAT_DEPTH_TYPE"..0x827C,
        "INTERNALFORMAT_STENCIL_TYPE"..0x827D,
        "MAX_WIDTH"..0x827E,
        "MAX_HEIGHT"..0x827F,
        "MAX_DEPTH"..0x8280,
        "MAX_LAYERS"..0x8281,
        "MAX_COMBINED_DIMENSIONS"..0x8282,
        "COLOR_COMPONENTS"..0x8283,
        "DEPTH_COMPONENTS"..0x8284,
        "STENCIL_COMPONENTS"..0x8285,
        "COLOR_RENDERABLE"..0x8286,
        "DEPTH_RENDERABLE"..0x8287,
        "STENCIL_RENDERABLE"..0x8288,
        "FRAMEBUFFER_RENDERABLE"..0x8289,
        "FRAMEBUFFER_RENDERABLE_LAYERED"..0x828A,
        "FRAMEBUFFER_BLEND"..0x828B,
        "READ_PIXELS"..0x828C,
        "READ_PIXELS_FORMAT"..0x828D,
        "READ_PIXELS_TYPE"..0x828E,
        "TEXTURE_IMAGE_FORMAT"..0x828F,
        "TEXTURE_IMAGE_TYPE"..0x8290,
        "GET_TEXTURE_IMAGE_FORMAT"..0x8291,
        "GET_TEXTURE_IMAGE_TYPE"..0x8292,
        "MIPMAP"..0x8293,
        "MANUAL_GENERATE_MIPMAP"..0x8294,
        "AUTO_GENERATE_MIPMAP"..0x8295,
        "COLOR_ENCODING"..0x8296,
        "SRGB_READ"..0x8297,
        "SRGB_WRITE"..0x8298,
        "FILTER"..0x829A,
        "VERTEX_TEXTURE"..0x829B,
        "TESS_CONTROL_TEXTURE"..0x829C,
        "TESS_EVALUATION_TEXTURE"..0x829D,
        "GEOMETRY_TEXTURE"..0x829E,
        "FRAGMENT_TEXTURE"..0x829F,
        "COMPUTE_TEXTURE"..0x82A0,
        "TEXTURE_SHADOW"..0x82A1,
        "TEXTURE_GATHER"..0x82A2,
        "TEXTURE_GATHER_SHADOW"..0x82A3,
        "SHADER_IMAGE_LOAD"..0x82A4,
        "SHADER_IMAGE_STORE"..0x82A5,
        "SHADER_IMAGE_ATOMIC"..0x82A6,
        "IMAGE_TEXEL_SIZE"..0x82A7,
        "IMAGE_COMPATIBILITY_CLASS"..0x82A8,
        "IMAGE_PIXEL_FORMAT"..0x82A9,
        "IMAGE_PIXEL_TYPE"..0x82AA,
        "SIMULTANEOUS_TEXTURE_AND_DEPTH_TEST"..0x82AC,
        "SIMULTANEOUS_TEXTURE_AND_STENCIL_TEST"..0x82AD,
        "SIMULTANEOUS_TEXTURE_AND_DEPTH_WRITE"..0x82AE,
        "SIMULTANEOUS_TEXTURE_AND_STENCIL_WRITE"..0x82AF,
        "TEXTURE_COMPRESSED_BLOCK_WIDTH"..0x82B1,
        "TEXTURE_COMPRESSED_BLOCK_HEIGHT"..0x82B2,
        "TEXTURE_COMPRESSED_BLOCK_SIZE"..0x82B3,
        "CLEAR_BUFFER"..0x82B4,
        "TEXTURE_VIEW"..0x82B5,
        "VIEW_COMPATIBILITY_CLASS"..0x82B6
    )

    IntConstant(
        "FULL_SUPPORT"..0x82B7,
        "CAVEAT_SUPPORT"..0x82B8,
        "IMAGE_CLASS_4_X_32"..0x82B9,
        "IMAGE_CLASS_2_X_32"..0x82BA,
        "IMAGE_CLASS_1_X_32"..0x82BB,
        "IMAGE_CLASS_4_X_16"..0x82BC,
        "IMAGE_CLASS_2_X_16"..0x82BD,
        "IMAGE_CLASS_1_X_16"..0x82BE,
        "IMAGE_CLASS_4_X_8"..0x82BF,
        "IMAGE_CLASS_2_X_8"..0x82C0,
        "IMAGE_CLASS_1_X_8"..0x82C1,
        "IMAGE_CLASS_11_11_10"..0x82C2,
        "IMAGE_CLASS_10_10_10_2"..0x82C3,
        "VIEW_CLASS_128_BITS"..0x82C4,
        "VIEW_CLASS_96_BITS"..0x82C5,
        "VIEW_CLASS_64_BITS"..0x82C6,
        "VIEW_CLASS_48_BITS"..0x82C7,
        "VIEW_CLASS_32_BITS"..0x82C8,
        "VIEW_CLASS_24_BITS"..0x82C9,
        "VIEW_CLASS_16_BITS"..0x82CA,
        "VIEW_CLASS_8_BITS"..0x82CB,
        "VIEW_CLASS_S3TC_DXT1_RGB"..0x82CC,
        "VIEW_CLASS_S3TC_DXT1_RGBA"..0x82CD,
        "VIEW_CLASS_S3TC_DXT3_RGBA"..0x82CE,
        "VIEW_CLASS_S3TC_DXT5_RGBA"..0x82CF,
        "VIEW_CLASS_RGTC1_RED"..0x82D0,
        "VIEW_CLASS_RGTC2_RG"..0x82D1,
        "VIEW_CLASS_BPTC_UNORM"..0x82D2,
        "VIEW_CLASS_BPTC_FLOAT"..0x82D3
    )

    void(
        "GetInternalformati64v",

        GLenum("target"),
        GLenum("internalformat"),
        GLenum("pname"),
        AutoSize("params")..GLsizei("bufSize"),
        ReturnParam..GLint64.p("params")
    )

    // ARB_invalidate_subdata

    void(
        "InvalidateTexSubImage",

        GLuint("texture"),
        GLint("level"),
        GLint("xoffset"),
        GLint("yoffset"),
        GLint("zoffset"),
        GLsizei("width"),
        GLsizei("height"),
        GLsizei("depth")
    )

    void(
        "InvalidateTexImage",

        GLuint("texture"),
        GLint("level")
    )

    void(
        "InvalidateBufferSubData",

        GLuint("buffer"),
        GLintptr("offset"),
        GLsizeiptr("length")
    )

    void(
        "InvalidateBufferData",

        GLuint("buffer")
    )

    void(
        "InvalidateFramebuffer",

        GLenum("target"),
        AutoSize("attachments")..GLsizei("numAttachments"),
        SingleValue("attachment")..GLenum.const.p("attachments")
    )

    void(
        "InvalidateSubFramebuffer",

        GLenum("target"),
        AutoSize("attachments")..GLsizei("numAttachments"),
        SingleValue("attachment")..GLenum.const.p("attachments"),
        GLint("x"),
        GLint("y"),
        GLsizei("width"),
        GLsizei("height")
    )

    // ARB_multi_draw_indirect

    void(
        "MultiDrawArraysIndirect",

        GLenum("mode"),
        Check("drawcount * (stride == 0 ? (4 * 4) : stride)")..MultiType(
            PointerMapping.DATA_INT
        )..RawPointer..void.const.p("indirect"),
        GLsizei("drawcount"),
        GLsizei("stride")
    )

    void(
        "MultiDrawElementsIndirect",

        GLenum("mode"),
        GLenum("type"),
        Check("drawcount * (stride == 0 ? (5 * 4) : stride)")..MultiType(
            PointerMapping.DATA_INT
        )..RawPointer..void.const.p("indirect"),
        GLsizei("drawcount"),
        GLsizei("stride")
    )

    // ARB_program_interface_query

    IntConstant(
        "UNIFORM"..0x92E1,
        "UNIFORM_BLOCK"..0x92E2,
        "PROGRAM_INPUT"..0x92E3,
        "PROGRAM_OUTPUT"..0x92E4,
        "BUFFER_VARIABLE"..0x92E5,
        "SHADER_STORAGE_BLOCK"..0x92E6,
        "VERTEX_SUBROUTINE"..0x92E8,
        "TESS_CONTROL_SUBROUTINE"..0x92E9,
        "TESS_EVALUATION_SUBROUTINE"..0x92EA,
        "GEOMETRY_SUBROUTINE"..0x92EB,
        "FRAGMENT_SUBROUTINE"..0x92EC,
        "COMPUTE_SUBROUTINE"..0x92ED,
        "VERTEX_SUBROUTINE_UNIFORM"..0x92EE,
        "TESS_CONTROL_SUBROUTINE_UNIFORM"..0x92EF,
        "TESS_EVALUATION_SUBROUTINE_UNIFORM"..0x92F0,
        "GEOMETRY_SUBROUTINE_UNIFORM"..0x92F1,
        "FRAGMENT_SUBROUTINE_UNIFORM"..0x92F2,
        "COMPUTE_SUBROUTINE_UNIFORM"..0x92F3,
        "TRANSFORM_FEEDBACK_VARYING"..0x92F4
    )

    IntConstant(
        "ACTIVE_RESOURCES"..0x92F5,
        "MAX_NAME_LENGTH"..0x92F6,
        "MAX_NUM_ACTIVE_VARIABLES"..0x92F7,
        "MAX_NUM_COMPATIBLE_SUBROUTINES"..0x92F8
    )

    IntConstant(
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
        "REFERENCED_BY_TESS_CONTROL_SHADER"..0x9307,
        "REFERENCED_BY_TESS_EVALUATION_SHADER"..0x9308,
        "REFERENCED_BY_GEOMETRY_SHADER"..0x9309,
        "REFERENCED_BY_FRAGMENT_SHADER"..0x930A,
        "REFERENCED_BY_COMPUTE_SHADER"..0x930B,
        "TOP_LEVEL_ARRAY_SIZE"..0x930C,
        "TOP_LEVEL_ARRAY_STRIDE"..0x930D,
        "LOCATION"..0x930E,
        "LOCATION_INDEX"..0x930F,
        "IS_PER_PATCH"..0x92E7
    )

    void(
        "GetProgramInterfaceiv",

        GLuint("program"),
        GLenum("programInterface"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLint.p("params")
    )

    GLuint(
        "GetProgramResourceIndex",

        GLuint("program"),
        GLenum("programInterface"),
        GLcharUTF8.const.p("name")
    )

    void(
        "GetProgramResourceName",

        GLuint("program"),
        GLenum("programInterface"),
        GLuint("index"),
        AutoSize("name")..GLsizei("bufSize"),
        Check(1)..nullable..GLsizei.p("length"),
        Return("length", "glGetProgramInterfacei(program, programInterface, GL_MAX_NAME_LENGTH)")..GLcharASCII.p("name")
    )

    void(
        "GetProgramResourceiv",

        GLuint("program"),
        GLenum("programInterface"),
        GLuint("index"),
        AutoSize("props")..GLsizei("propCount"),
        GLenum.const.p("props"),
        AutoSize("params")..GLsizei("bufSize"),
        Check(1)..nullable..GLsizei.p("length"),
        GLint.p("params")
    )

    GLint(
        "GetProgramResourceLocation",

        GLuint("program"),
        GLenum("programInterface"),
        GLcharASCII.const.p("name")
    )

    GLint(
        "GetProgramResourceLocationIndex",

        GLuint("program"),
        GLenum("programInterface"),
        GLcharASCII.const.p("name")
    )

    // ARB_shader_storage_buffer_object

    IntConstant(
        "SHADER_STORAGE_BUFFER"..0x90D2
    )

    IntConstant(
        "SHADER_STORAGE_BUFFER_BINDING"..0x90D3
    )

    IntConstant(
        "SHADER_STORAGE_BUFFER_START"..0x90D4,
        "SHADER_STORAGE_BUFFER_SIZE"..0x90D5
    )

    IntConstant(
        "MAX_VERTEX_SHADER_STORAGE_BLOCKS"..0x90D6,
        "MAX_GEOMETRY_SHADER_STORAGE_BLOCKS"..0x90D7,
        "MAX_TESS_CONTROL_SHADER_STORAGE_BLOCKS"..0x90D8,
        "MAX_TESS_EVALUATION_SHADER_STORAGE_BLOCKS"..0x90D9,
        "MAX_FRAGMENT_SHADER_STORAGE_BLOCKS"..0x90DA,
        "MAX_COMPUTE_SHADER_STORAGE_BLOCKS"..0x90DB,
        "MAX_COMBINED_SHADER_STORAGE_BLOCKS"..0x90DC,
        "MAX_SHADER_STORAGE_BUFFER_BINDINGS"..0x90DD,
        "MAX_SHADER_STORAGE_BLOCK_SIZE"..0x90DE,
        "SHADER_STORAGE_BUFFER_OFFSET_ALIGNMENT"..0x90DF
    )

    IntConstant(
        "SHADER_STORAGE_BARRIER_BIT"..0x2000
    )

    IntConstant(
        "MAX_COMBINED_SHADER_OUTPUT_RESOURCES"..0x8F39
    )

    void(
        "ShaderStorageBlockBinding",

        GLuint("program"),
        GLuint("storageBlockIndex"),
        GLuint("storageBlockBinding")
    )

    // ARB_stencil_texturing

    IntConstant(
        "DEPTH_STENCIL_TEXTURE_MODE"..0x90EA
    )

    // ARB_texture_buffer_range

    IntConstant(
        "TEXTURE_BUFFER_OFFSET"..0x919D,
        "TEXTURE_BUFFER_SIZE"..0x919E
    )

    IntConstant(
        "TEXTURE_BUFFER_OFFSET_ALIGNMENT"..0x919F
    )

    void(
        "TexBufferRange",

        GLenum("target"),
        GLenum("internalformat"),
        GLuint("buffer"),
        GLintptr("offset"),
        GLsizeiptr("size")
    )

    // ARB_texture_storage_multisample

    void(
        "TexStorage2DMultisample",

        GLenum("target"),
        GLsizei("samples"),
        GLenum("internalformat"),
        GLsizei("width"),
        GLsizei("height"),
        GLboolean("fixedsamplelocations")
    )

    void(
        "TexStorage3DMultisample",

        GLenum("target"),
        GLsizei("samples"),
        GLenum("internalformat"),
        GLsizei("width"),
        GLsizei("height"),
        GLsizei("depth"),
        GLboolean("fixedsamplelocations")
    )

    // ARB_texture_view

    IntConstant(
        "TEXTURE_VIEW_MIN_LEVEL"..0x82DB,
        "TEXTURE_VIEW_NUM_LEVELS"..0x82DC,
        "TEXTURE_VIEW_MIN_LAYER"..0x82DD,
        "TEXTURE_VIEW_NUM_LAYERS"..0x82DE
    )

    void(
        "TextureView",

        GLuint("texture"),
        GLenum("target"),
        GLuint("origtexture"),
        GLenum("internalformat"),
        GLuint("minlevel"),
        GLuint("numlevels"),
        GLuint("minlayer"),
        GLuint("numlayers")
    )

    // ARB_vertex_attrib_binding

    IntConstant(
        "VERTEX_ATTRIB_BINDING"..0x82D4,
        "VERTEX_ATTRIB_RELATIVE_OFFSET"..0x82D5
    )

    IntConstant(
        "VERTEX_BINDING_DIVISOR"..0x82D6,
        "VERTEX_BINDING_OFFSET"..0x82D7,
        "VERTEX_BINDING_STRIDE"..0x82D8,
        "VERTEX_BINDING_BUFFER"..0x8F4F
    )

    IntConstant(
        "MAX_VERTEX_ATTRIB_RELATIVE_OFFSET"..0x82D9,
        "MAX_VERTEX_ATTRIB_BINDINGS"..0x82DA
    )

    void(
        "BindVertexBuffer",

        GLuint("bindingindex"),
        GLuint("buffer"),
        GLintptr("offset"),
        GLsizei("stride")
    )

    void(
        "VertexAttribFormat",

        GLuint("attribindex"),
        GLint("size"),
        GLenum("type"),
        GLboolean("normalized"),
        GLuint("relativeoffset")
    )

    void(
        "VertexAttribIFormat",

        GLuint("attribindex"),
        GLint("size"),
        GLenum("type"),
        GLuint("relativeoffset")
    )

    void(
        "VertexAttribLFormat",

        GLuint("attribindex"),
        GLint("size"),
        GLenum("type"),
        GLuint("relativeoffset")
    )

    void(
        "VertexAttribBinding",

        GLuint("attribindex"),
        GLuint("bindingindex")
    )

    void(
        "VertexBindingDivisor",

        GLuint("bindingindex"),
        GLuint("divisor")
    )
}