/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*
import opengles.BufferType.*

val GLES32 = "GLES32".nativeClassGLES("GLES32", postfix = "") {
    extends = GLES31
    IntConstant(
        "MULTISAMPLE_LINE_WIDTH_RANGE_ARB"..0x9381,
        "MULTISAMPLE_LINE_WIDTH_GRANULARITY_ARB"..0x9382
    )

    // KHR_blend_equation_advanced


    IntConstant(
        "MULTIPLY"..0x9294,
        "SCREEN"..0x9295,
        "OVERLAY"..0x9296,
        "DARKEN"..0x9297,
        "LIGHTEN"..0x9298,
        "COLORDODGE"..0x9299,
        "COLORBURN"..0x929A,
        "HARDLIGHT"..0x929B,
        "SOFTLIGHT"..0x929C,
        "DIFFERENCE"..0x929E,
        "EXCLUSION"..0x92A0,
        "HSL_HUE"..0x92AD,
        "HSL_SATURATION"..0x92AE,
        "HSL_COLOR"..0x92AF,
        "HSL_LUMINOSITY"..0x92B0
    )

    void("BlendBarrier")

    // OES_copy_image

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
        "STACK_UNDERFLOW"..0x0504,
        "STACK_OVERFLOW"..0x0503
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
        SingleValue("id")..GLuint.const.p("ids"),
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
        "GetPointerv",

        GLenum("pname"),
        ReturnParam..Check(1)..void.p.p("params")
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
        Return("length", "GLES20.glGetInteger(GL_MAX_LABEL_LENGTH)")..GLcharUTF8.p("label")
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
        Return("length", "GLES20.glGetInteger(GL_MAX_LABEL_LENGTH)")..GLcharUTF8.p("label")
    )

    // OES_draw_buffers_indexed

    void(
        "Enablei",

        GLenum("target"),
        GLuint("index")
    )

    void(
        "Disablei",

        GLenum("target"),
        GLuint("index")
    )

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
        GLenum("src"),
        GLenum("dst")
    )

    void(
        "BlendFuncSeparatei",

        GLuint("buf"),
        GLenum("srcRGB"),
        GLenum("dstRGB"),
        GLenum("srcAlpha"),
        GLenum("dstAlpha")
    )

    void(
        "ColorMaski",

        GLuint("index"),
        GLboolean("r"),
        GLboolean("g"),
        GLboolean("b"),
        GLboolean("a")
    )

    GLboolean(
        "IsEnabledi",

        GLenum("target"),
        GLuint("index")
    )

    // OES_draw_elements_base_vertex

    void(
        "DrawElementsBaseVertex",

        GLenum("mode"),
        AutoSizeShr("GLESChecks.typeToByteShift(type)", "indices")..GLsizei("count"),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum("type"),
        RawPointer..void.const.p("indices"),
        GLint("basevertex")
    )

    void(
        "DrawRangeElementsBaseVertex",

        GLenum("mode"),
        GLuint("start"),
        GLuint("end"),
        AutoSizeShr("GLESChecks.typeToByteShift(type)", "indices")..GLsizei("count"),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum("type"),
        RawPointer..void.const.p("indices"),
        GLint("basevertex")
    )

    void(
        "DrawElementsInstancedBaseVertex",

        GLenum("mode"),
        AutoSizeShr("GLESChecks.typeToByteShift(type)", "indices")..GLsizei("count"),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum("type"),
        RawPointer..void.const.p("indices"),
        GLsizei("instancecount"),
        GLint("basevertex")
    )

    // OES_geometry_shader

    IntConstant(
        "GEOMETRY_SHADER"..0x8DD9
    )

    IntConstant(
        "GEOMETRY_SHADER_BIT"..0x00000004
    )

    IntConstant(
        "GEOMETRY_LINKED_VERTICES_OUT"..0x8916,
        "GEOMETRY_LINKED_INPUT_TYPE"..0x8917,
        "GEOMETRY_LINKED_OUTPUT_TYPE"..0x8918,
        "GEOMETRY_SHADER_INVOCATIONS"..0x887F
    )

    IntConstant(
        "LAYER_PROVOKING_VERTEX"..0x825E,
        "MAX_GEOMETRY_UNIFORM_COMPONENTS"..0x8DDF,
        "MAX_GEOMETRY_UNIFORM_BLOCKS"..0x8A2C,
        "MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS"..0x8A32,
        "MAX_GEOMETRY_INPUT_COMPONENTS"..0x9123,
        "MAX_GEOMETRY_OUTPUT_COMPONENTS"..0x9124,
        "MAX_GEOMETRY_OUTPUT_VERTICES"..0x8DE0,
        "MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS"..0x8DE1,
        "MAX_GEOMETRY_SHADER_INVOCATIONS"..0x8E5A,
        "MAX_GEOMETRY_TEXTURE_IMAGE_UNITS"..0x8C29,
        "MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS"..0x92CF,
        "MAX_GEOMETRY_ATOMIC_COUNTERS"..0x92D5,
        "MAX_GEOMETRY_IMAGE_UNIFORMS"..0x90CD,
        "MAX_GEOMETRY_SHADER_STORAGE_BLOCKS"..0x90D7
    )

    IntConstant(
        "FIRST_VERTEX_CONVENTION"..0x8E4D,
        "LAST_VERTEX_CONVENTION"..0x8E4E,
        "UNDEFINED_VERTEX"..0x8260
    )

    IntConstant(
        "PRIMITIVES_GENERATED"..0x8C87
    )

    IntConstant(
        "LINES_ADJACENCY"..0xA,
        "LINE_STRIP_ADJACENCY"..0xB,
        "TRIANGLES_ADJACENCY"..0xC,
        "TRIANGLE_STRIP_ADJACENCY"..0xD
    )

    IntConstant(
        "FRAMEBUFFER_DEFAULT_LAYERS"..0x9312
    )

    IntConstant(
        "MAX_FRAMEBUFFER_LAYERS"..0x9317
    )

    IntConstant(
        "FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS"..0x8DA8
    )

    IntConstant(
        "FRAMEBUFFER_ATTACHMENT_LAYERED"..0x8DA7
    )

    IntConstant(
        "REFERENCED_BY_GEOMETRY_SHADER"..0x9309
    )

    void(
        "FramebufferTexture",

        GLenum("target"),
        GLenum("attachment"),
        GLuint("texture"),
        GLint("level")
    )

    // OES_primitive_bounding_box

    IntConstant(
        "PRIMITIVE_BOUNDING_BOX_ARB"..0x92BE
    )

    void(
        "PrimitiveBoundingBox",

        GLfloat("minX"),
        GLfloat("minY"),
        GLfloat("minZ"),
        GLfloat("minW"),
        GLfloat("maxX"),
        GLfloat("maxY"),
        GLfloat("maxZ"),
        GLfloat("maxW")
    )

    // KHR_robustness

    IntConstant(
        "GUILTY_CONTEXT_RESET"..0x8253,
        "INNOCENT_CONTEXT_RESET"..0x8254,
        "UNKNOWN_CONTEXT_RESET"..0x8255
    )

    IntConstant(
        "CONTEXT_ROBUST_ACCESS"..0x90F3,
        "RESET_NOTIFICATION_STRATEGY"..0x8256
    )

    IntConstant(
        "LOSE_CONTEXT_ON_RESET"..0x8252,
        "NO_RESET_NOTIFICATION"..0x8261
    )

    IntConstant(
        "CONTEXT_LOST"..0x0507
    )

    GLenum(
        "GetGraphicsResetStatus",
        void()
    )

    void(
        "ReadnPixels",

        GLint("x"),
        GLint("y"),
        GLsizei("width"),
        GLsizei("height"),
        GLenum("format"),
        GLenum("type"),
        AutoSize("pixels")..GLsizei("bufSize"),
        RawPointer..MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT
        )..void.p("pixels")
    )

    void(
        "GetnUniformfv",

        GLuint("program"),
        GLint("location"),
        AutoSize("params")..GLsizei("bufSize"),
        ReturnParam..GLfloat.p("params")
    )

    void(
        "GetnUniformiv",

        GLuint("program"),
        GLint("location"),
        AutoSize("params")..GLsizei("bufSize"),
        ReturnParam..GLfloat.p("params")
    )

    void(
        "GetnUniformuiv",

        GLuint("program"),
        GLint("location"),
        AutoSize("params")..GLsizei("bufSize"),
        ReturnParam..GLfloat.p("params")
    )

    // OES_sample_shading

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

    // OES_multisample_interpolation_features

    IntConstant(
        "MIN_FRAGMENT_INTERPOLATION_OFFSET"..0x8E5B,
        "MAX_FRAGMENT_INTERPOLATION_OFFSET"..0x8E5C,
        "FRAGMENT_INTERPOLATION_OFFSET_BITS"..0x8E5D
    )

    // OES_tessellation_shader

    IntConstant(
        "PATCHES"..0xE
    )

    IntConstant(
        "PATCH_VERTICES"..0x8E72
    )

    IntConstant(
        "TESS_CONTROL_OUTPUT_VERTICES"..0x8E75,
        "TESS_GEN_MODE"..0x8E76,
        "TESS_GEN_SPACING"..0x8E77,
        "TESS_GEN_VERTEX_ORDER"..0x8E78,
        "TESS_GEN_POINT_MODE"..0x8E79
    )

    IntConstant(
        "ISOLINES"..0x8E7A,
        "QUADS"..0x0007
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
        "MAX_COMBINED_TESS_EVALUATION_UNIFORM_COMPONENTS"..0x8E1F,
        "MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS"..0x92CD,
        "MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS"..0x92CE,
        "MAX_TESS_CONTROL_ATOMIC_COUNTERS"..0x92D3,
        "MAX_TESS_EVALUATION_ATOMIC_COUNTERS"..0x92D4,
        "MAX_TESS_CONTROL_IMAGE_UNIFORMS"..0x90CB,
        "MAX_TESS_EVALUATION_IMAGE_UNIFORMS"..0x90CC,
        "MAX_TESS_CONTROL_SHADER_STORAGE_BLOCKS"..0x90D8,
        "MAX_TESS_EVALUATION_SHADER_STORAGE_BLOCKS"..0x90D9,
        "PRIMITIVE_RESTART_FOR_PATCHES_SUPPORTED"..0x8221
    )

    IntConstant(
        "IS_PER_PATCH"..0x92E7,
        "REFERENCED_BY_TESS_CONTROL_SHADER"..0x9307,
        "REFERENCED_BY_TESS_EVALUATION_SHADER"..0x9308
    )

    IntConstant(
        "TESS_EVALUATION_SHADER"..0x8E87,
        "TESS_CONTROL_SHADER"..0x8E88
    )

    IntConstant(
        "TESS_CONTROL_SHADER_BIT"..0x00000008,
        "TESS_EVALUATION_SHADER_BIT"..0x00000010
    )

    void(
        "PatchParameteri",

        GLenum("pname"),
        GLint("value")
    )

    // OES_texture_border_clamp

    IntConstant(
        "TEXTURE_BORDER_COLOR"..0x1004
    )

    IntConstant(
        "CLAMP_TO_BORDER"..0x812D
    )

    void(
        "TexParameterIiv",

        GLenum("target"),
        GLenum("pname"),
        SingleValue("param")..Check(1)..GLint.const.p("params")
    )

    void(
        "TexParameterIuiv",

        GLenum("target"),
        GLenum("pname"),
        SingleValue("param")..Check(1)..GLuint.const.p("params")
    )

    void(
        "GetTexParameterIiv",

        GLenum("target"),
        GLenum("pname"),
        ReturnParam..Check(1)..GLint.p("params")
    )

    void(
        "GetTexParameterIuiv",

        GLenum("target"),
        GLenum("pname"),
        ReturnParam..Check(1)..GLuint.p("params")
    )

    void(
        "SamplerParameterIiv",

        GLuint("sampler"),
        GLenum("pname"),
        SingleValue("param")..Check(1)..GLint.const.p("params")
    )

    void(
        "SamplerParameterIuiv",

        GLuint("sampler"),
        GLenum("pname"),
        SingleValue("param")..Check(1)..GLuint.const.p("params")
    )

    void(
        "GetSamplerParameterIiv",

        GLuint("sampler"),
        GLenum("pname"),
        ReturnParam..Check(1)..GLint.p("params")
    )

    void(
        "GetSamplerParameterIuiv",

        GLuint("sampler"),
        GLenum("pname"),
        ReturnParam..Check(1)..GLuint.p("params")
    )

    // OES_texture_buffer

    IntConstant(
        "TEXTURE_BUFFER"..0x8C2A
    )

    IntConstant(
        "TEXTURE_BUFFER_BINDING"..0x8C2A
    )

    IntConstant(
        "SAMPLER_BUFFER"..0x8DC2,
        "INT_SAMPLER_BUFFER"..0x8DD0,
        "UNSIGNED_INT_SAMPLER_BUFFER"..0x8DD8,
        "IMAGE_BUFFER"..0x9051,
        "INT_IMAGE_BUFFER"..0x905C,
        "UNSIGNED_INT_IMAGE_BUFFER"..0x9067
    )

    IntConstant(
        "TEXTURE_BUFFER_DATA_STORE_BINDING"..0x8C2D,
        "TEXTURE_BUFFER_OFFSET"..0x919D,
        "TEXTURE_BUFFER_SIZE"..0x919E
    )

    void(
        "TexBuffer",

        GLenum("target"),
        GLenum("internalformat"),
        GLuint("buffer")
    )

    void(
        "TexBufferRange",

        GLenum("target"),
        GLenum("internalformat"),
        GLuint("buffer"),
        GLintptr("offset"),
        GLsizeiptr("size")
    )

    // KHR_texture_compression_astc_ldr

    IntConstant(
        "COMPRESSED_RGBA_ASTC_4x4"..0x93B0,
        "COMPRESSED_RGBA_ASTC_5x4"..0x93B1,
        "COMPRESSED_RGBA_ASTC_5x5"..0x93B2,
        "COMPRESSED_RGBA_ASTC_6x5"..0x93B3,
        "COMPRESSED_RGBA_ASTC_6x6"..0x93B4,
        "COMPRESSED_RGBA_ASTC_8x5"..0x93B5,
        "COMPRESSED_RGBA_ASTC_8x6"..0x93B6,
        "COMPRESSED_RGBA_ASTC_8x8"..0x93B7,
        "COMPRESSED_RGBA_ASTC_10x5"..0x93B8,
        "COMPRESSED_RGBA_ASTC_10x6"..0x93B9,
        "COMPRESSED_RGBA_ASTC_10x8"..0x93BA,
        "COMPRESSED_RGBA_ASTC_10x10"..0x93BB,
        "COMPRESSED_RGBA_ASTC_12x10"..0x93BC,
        "COMPRESSED_RGBA_ASTC_12x12"..0x93BD,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_4x4"..0x93D0,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_5x4"..0x93D1,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_5x5"..0x93D2,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_6x5"..0x93D3,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_6x6"..0x93D4,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_8x5"..0x93D5,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_8x6"..0x93D6,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_8x8"..0x93D7,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_10x5"..0x93D8,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_10x6"..0x93D9,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_10x8"..0x93DA,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_10x10"..0x93DB,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_12x10"..0x93DC,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_12x12"..0x93DD
    )

    // OES_texture_cube_map_array

    IntConstant(
        "TEXTURE_CUBE_MAP_ARRAY"..0x9009
    )

    IntConstant(
        "TEXTURE_BINDING_CUBE_MAP_ARRAY"..0x900A
    )

    IntConstant(
        "SAMPLER_CUBE_MAP_ARRAY"..0x900C,
        "SAMPLER_CUBE_MAP_ARRAY_SHADOW"..0x900D,
        "INT_SAMPLER_CUBE_MAP_ARRAY"..0x900E,
        "UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY"..0x900F,
        "IMAGE_CUBE_MAP_ARRAY"..0x9054,
        "INT_IMAGE_CUBE_MAP_ARRAY"..0x905F,
        "UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY"..0x906A
    )

    // OES_texture_storage_multisample_2d_array

    IntConstant(
        "TEXTURE_2D_MULTISAMPLE_ARRAY"..0x9102
    )

    IntConstant(
        "TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY"..0x9105
    )

    IntConstant(
        "SAMPLER_2D_MULTISAMPLE_ARRAY"..0x910B,
        "INT_SAMPLER_2D_MULTISAMPLE_ARRAY"..0x910C,
        "UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY"..0x910D
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
}