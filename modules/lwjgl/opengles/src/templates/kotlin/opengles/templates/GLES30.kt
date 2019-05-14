/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*
import opengles.BufferType.*

val GLES30 = "GLES30".nativeClassGLES("GLES30", postfix = "") {
    extends = GLES20
    documentation =
        "The core OpenGL ES 3.0 functionality."

    IntConstant(
        "",

        "READ_BUFFER"..0x0C02,
        "UNPACK_ROW_LENGTH"..0x0CF2,
        "UNPACK_SKIP_ROWS"..0x0CF3,
        "UNPACK_SKIP_PIXELS"..0x0CF4,
        "PACK_ROW_LENGTH"..0x0D02,
        "PACK_SKIP_ROWS"..0x0D03,
        "PACK_SKIP_PIXELS"..0x0D04,
        "COLOR"..0x1800,
        "DEPTH"..0x1801,
        "STENCIL"..0x1802,
        "RED"..0x1903,
        "RGB8"..0x8051,
        "RGBA8"..0x8058,
        "RGB10_A2"..0x8059,
        "TEXTURE_BINDING_3D"..0x806A,
        "UNPACK_SKIP_IMAGES"..0x806D,
        "UNPACK_IMAGE_HEIGHT"..0x806E,
        "TEXTURE_3D"..0x806F,
        "TEXTURE_WRAP_R"..0x8072,
        "MAX_3D_TEXTURE_SIZE"..0x8073,
        "UNSIGNED_INT_2_10_10_10_REV"..0x8368,
        "MAX_ELEMENTS_VERTICES"..0x80E8,
        "MAX_ELEMENTS_INDICES"..0x80E9,
        "TEXTURE_MIN_LOD"..0x813A,
        "TEXTURE_MAX_LOD"..0x813B,
        "TEXTURE_BASE_LEVEL"..0x813C,
        "TEXTURE_MAX_LEVEL"..0x813D,
        "MIN"..0x8007,
        "MAX"..0x8008,
        "DEPTH_COMPONENT24"..0x81A6,
        "MAX_TEXTURE_LOD_BIAS"..0x84FD,
        "TEXTURE_COMPARE_MODE"..0x884C,
        "TEXTURE_COMPARE_FUNC"..0x884D,
        "CURRENT_QUERY"..0x8865,
        "QUERY_RESULT"..0x8866,
        "QUERY_RESULT_AVAILABLE"..0x8867,
        "BUFFER_MAPPED"..0x88BC,
        "BUFFER_MAP_POINTER"..0x88BD,
        "STREAM_READ"..0x88E1,
        "STREAM_COPY"..0x88E2,
        "STATIC_READ"..0x88E5,
        "STATIC_COPY"..0x88E6,
        "DYNAMIC_READ"..0x88E9,
        "DYNAMIC_COPY"..0x88EA,
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
        "DRAW_BUFFER15"..0x8834,
        "MAX_FRAGMENT_UNIFORM_COMPONENTS"..0x8B49,
        "MAX_VERTEX_UNIFORM_COMPONENTS"..0x8B4A,
        "SAMPLER_3D"..0x8B5F,
        "SAMPLER_2D_SHADOW"..0x8B62,
        "FRAGMENT_SHADER_DERIVATIVE_HINT"..0x8B8B,
        "PIXEL_PACK_BUFFER"..0x88EB,
        "PIXEL_UNPACK_BUFFER"..0x88EC,
        "PIXEL_PACK_BUFFER_BINDING"..0x88ED,
        "PIXEL_UNPACK_BUFFER_BINDING"..0x88EF,
        "FLOAT_MAT2x3"..0x8B65,
        "FLOAT_MAT2x4"..0x8B66,
        "FLOAT_MAT3x2"..0x8B67,
        "FLOAT_MAT3x4"..0x8B68,
        "FLOAT_MAT4x2"..0x8B69,
        "FLOAT_MAT4x3"..0x8B6A,
        "SRGB"..0x8C40,
        "SRGB8"..0x8C41,
        "SRGB8_ALPHA8"..0x8C43,
        "COMPARE_REF_TO_TEXTURE"..0x884E,
        "MAJOR_VERSION"..0x821B,
        "MINOR_VERSION"..0x821C,
        "NUM_EXTENSIONS"..0x821D,
        "RGBA32F"..0x8814,
        "RGB32F"..0x8815,
        "RGBA16F"..0x881A,
        "RGB16F"..0x881B,
        "VERTEX_ATTRIB_ARRAY_INTEGER"..0x88FD,
        "MAX_ARRAY_TEXTURE_LAYERS"..0x88FF,
        "MIN_PROGRAM_TEXEL_OFFSET"..0x8904,
        "MAX_PROGRAM_TEXEL_OFFSET"..0x8905,
        "MAX_VARYING_COMPONENTS"..0x8B4B,
        "TEXTURE_2D_ARRAY"..0x8C1A,
        "TEXTURE_BINDING_2D_ARRAY"..0x8C1D,
        "R11F_G11F_B10F"..0x8C3A,
        "UNSIGNED_INT_10F_11F_11F_REV"..0x8C3B,
        "RGB9_E5"..0x8C3D,
        "UNSIGNED_INT_5_9_9_9_REV"..0x8C3E,
        "TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH"..0x8C76,
        "TRANSFORM_FEEDBACK_BUFFER_MODE"..0x8C7F,
        "MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS"..0x8C80,
        "TRANSFORM_FEEDBACK_VARYINGS"..0x8C83,
        "TRANSFORM_FEEDBACK_BUFFER_START"..0x8C84,
        "TRANSFORM_FEEDBACK_BUFFER_SIZE"..0x8C85,
        "TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN"..0x8C88,
        "RASTERIZER_DISCARD"..0x8C89,
        "MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS"..0x8C8A,
        "MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS"..0x8C8B,
        "INTERLEAVED_ATTRIBS"..0x8C8C,
        "SEPARATE_ATTRIBS"..0x8C8D,
        "TRANSFORM_FEEDBACK_BUFFER"..0x8C8E,
        "TRANSFORM_FEEDBACK_BUFFER_BINDING"..0x8C8F,
        "RGBA32UI"..0x8D70,
        "RGB32UI"..0x8D71,
        "RGBA16UI"..0x8D76,
        "RGB16UI"..0x8D77,
        "RGBA8UI"..0x8D7C,
        "RGB8UI"..0x8D7D,
        "RGBA32I"..0x8D82,
        "RGB32I"..0x8D83,
        "RGBA16I"..0x8D88,
        "RGB16I"..0x8D89,
        "RGBA8I"..0x8D8E,
        "RGB8I"..0x8D8F,
        "RED_INTEGER"..0x8D94,
        "RGB_INTEGER"..0x8D98,
        "RGBA_INTEGER"..0x8D99,
        "SAMPLER_2D_ARRAY"..0x8DC1,
        "SAMPLER_2D_ARRAY_SHADOW"..0x8DC4,
        "SAMPLER_CUBE_SHADOW"..0x8DC5,
        "UNSIGNED_INT_VEC2"..0x8DC6,
        "UNSIGNED_INT_VEC3"..0x8DC7,
        "UNSIGNED_INT_VEC4"..0x8DC8,
        "INT_SAMPLER_2D"..0x8DCA,
        "INT_SAMPLER_3D"..0x8DCB,
        "INT_SAMPLER_CUBE"..0x8DCC,
        "INT_SAMPLER_2D_ARRAY"..0x8DCF,
        "UNSIGNED_INT_SAMPLER_2D"..0x8DD2,
        "UNSIGNED_INT_SAMPLER_3D"..0x8DD3,
        "UNSIGNED_INT_SAMPLER_CUBE"..0x8DD4,
        "UNSIGNED_INT_SAMPLER_2D_ARRAY"..0x8DD7,
        "BUFFER_ACCESS_FLAGS"..0x911F,
        "BUFFER_MAP_LENGTH"..0x9120,
        "BUFFER_MAP_OFFSET"..0x9121,
        "DEPTH_COMPONENT32F"..0x8CAC,
        "DEPTH32F_STENCIL8"..0x8CAD,
        "FLOAT_32_UNSIGNED_INT_24_8_REV"..0x8DAD,
        "FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING"..0x8210,
        "FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE"..0x8211,
        "FRAMEBUFFER_ATTACHMENT_RED_SIZE"..0x8212,
        "FRAMEBUFFER_ATTACHMENT_GREEN_SIZE"..0x8213,
        "FRAMEBUFFER_ATTACHMENT_BLUE_SIZE"..0x8214,
        "FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE"..0x8215,
        "FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE"..0x8216,
        "FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE"..0x8217,
        "FRAMEBUFFER_DEFAULT"..0x8218,
        "FRAMEBUFFER_UNDEFINED"..0x8219,
        "DEPTH_STENCIL_ATTACHMENT"..0x821A,
        "DEPTH_STENCIL"..0x84F9,
        "UNSIGNED_INT_24_8"..0x84FA,
        "DEPTH24_STENCIL8"..0x88F0,
        "UNSIGNED_NORMALIZED"..0x8C17,
        "DRAW_FRAMEBUFFER_BINDING"..0x8CA6,
        "READ_FRAMEBUFFER"..0x8CA8,
        "DRAW_FRAMEBUFFER"..0x8CA9,
        "READ_FRAMEBUFFER_BINDING"..0x8CAA,
        "RENDERBUFFER_SAMPLES"..0x8CAB,
        "FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER"..0x8CD4,
        "MAX_COLOR_ATTACHMENTS"..0x8CDF,
        "COLOR_ATTACHMENT1"..0x8CE1,
        "COLOR_ATTACHMENT2"..0x8CE2,
        "COLOR_ATTACHMENT3"..0x8CE3,
        "COLOR_ATTACHMENT4"..0x8CE4,
        "COLOR_ATTACHMENT5"..0x8CE5,
        "COLOR_ATTACHMENT6"..0x8CE6,
        "COLOR_ATTACHMENT7"..0x8CE7,
        "COLOR_ATTACHMENT8"..0x8CE8,
        "COLOR_ATTACHMENT9"..0x8CE9,
        "COLOR_ATTACHMENT10"..0x8CEA,
        "COLOR_ATTACHMENT11"..0x8CEB,
        "COLOR_ATTACHMENT12"..0x8CEC,
        "COLOR_ATTACHMENT13"..0x8CED,
        "COLOR_ATTACHMENT14"..0x8CEE,
        "COLOR_ATTACHMENT15"..0x8CEF,
        "COLOR_ATTACHMENT16"..0x8CF0,
        "COLOR_ATTACHMENT17"..0x8CF1,
        "COLOR_ATTACHMENT18"..0x8CF2,
        "COLOR_ATTACHMENT19"..0x8CF3,
        "COLOR_ATTACHMENT20"..0x8CF4,
        "COLOR_ATTACHMENT21"..0x8CF5,
        "COLOR_ATTACHMENT22"..0x8CF6,
        "COLOR_ATTACHMENT23"..0x8CF7,
        "COLOR_ATTACHMENT24"..0x8CF8,
        "COLOR_ATTACHMENT25"..0x8CF9,
        "COLOR_ATTACHMENT26"..0x8CFA,
        "COLOR_ATTACHMENT27"..0x8CFB,
        "COLOR_ATTACHMENT28"..0x8CFC,
        "COLOR_ATTACHMENT29"..0x8CFD,
        "COLOR_ATTACHMENT30"..0x8CFE,
        "COLOR_ATTACHMENT31"..0x8CFF,
        "FRAMEBUFFER_INCOMPLETE_MULTISAMPLE"..0x8D56,
        "MAX_SAMPLES"..0x8D57,
        "HALF_FLOAT"..0x140B,
        "MAP_READ_BIT"..0x0001,
        "MAP_WRITE_BIT"..0x0002,
        "MAP_INVALIDATE_RANGE_BIT"..0x0004,
        "MAP_INVALIDATE_BUFFER_BIT"..0x0008,
        "MAP_FLUSH_EXPLICIT_BIT"..0x0010,
        "MAP_UNSYNCHRONIZED_BIT"..0x0020,
        "RG"..0x8227,
        "RG_INTEGER"..0x8228,
        "R8"..0x8229,
        "RG8"..0x822B,
        "R16F"..0x822D,
        "R32F"..0x822E,
        "RG16F"..0x822F,
        "RG32F"..0x8230,
        "R8I"..0x8231,
        "R8UI"..0x8232,
        "R16I"..0x8233,
        "R16UI"..0x8234,
        "R32I"..0x8235,
        "R32UI"..0x8236,
        "RG8I"..0x8237,
        "RG8UI"..0x8238,
        "RG16I"..0x8239,
        "RG16UI"..0x823A,
        "RG32I"..0x823B,
        "RG32UI"..0x823C,
        "VERTEX_ARRAY_BINDING"..0x85B5,
        "R8_SNORM"..0x8F94,
        "RG8_SNORM"..0x8F95,
        "RGB8_SNORM"..0x8F96,
        "RGBA8_SNORM"..0x8F97,
        "SIGNED_NORMALIZED"..0x8F9C,
        "PRIMITIVE_RESTART_FIXED_INDEX"..0x8D69,
        "COPY_READ_BUFFER"..0x8F36,
        "COPY_WRITE_BUFFER"..0x8F37,
        "COPY_READ_BUFFER_BINDING"..0x8F36,
        "COPY_WRITE_BUFFER_BINDING"..0x8F37,
        "UNIFORM_BUFFER"..0x8A11,
        "UNIFORM_BUFFER_BINDING"..0x8A28,
        "UNIFORM_BUFFER_START"..0x8A29,
        "UNIFORM_BUFFER_SIZE"..0x8A2A,
        "MAX_VERTEX_UNIFORM_BLOCKS"..0x8A2B,
        "MAX_FRAGMENT_UNIFORM_BLOCKS"..0x8A2D,
        "MAX_COMBINED_UNIFORM_BLOCKS"..0x8A2E,
        "MAX_UNIFORM_BUFFER_BINDINGS"..0x8A2F,
        "MAX_UNIFORM_BLOCK_SIZE"..0x8A30,
        "MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS"..0x8A31,
        "MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS"..0x8A33,
        "UNIFORM_BUFFER_OFFSET_ALIGNMENT"..0x8A34,
        "ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH"..0x8A35,
        "ACTIVE_UNIFORM_BLOCKS"..0x8A36,
        "UNIFORM_TYPE"..0x8A37,
        "UNIFORM_SIZE"..0x8A38,
        "UNIFORM_NAME_LENGTH"..0x8A39,
        "UNIFORM_BLOCK_INDEX"..0x8A3A,
        "UNIFORM_OFFSET"..0x8A3B,
        "UNIFORM_ARRAY_STRIDE"..0x8A3C,
        "UNIFORM_MATRIX_STRIDE"..0x8A3D,
        "UNIFORM_IS_ROW_MAJOR"..0x8A3E,
        "UNIFORM_BLOCK_BINDING"..0x8A3F,
        "UNIFORM_BLOCK_DATA_SIZE"..0x8A40,
        "UNIFORM_BLOCK_NAME_LENGTH"..0x8A41,
        "UNIFORM_BLOCK_ACTIVE_UNIFORMS"..0x8A42,
        "UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES"..0x8A43,
        "UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER"..0x8A44,
        "UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER"..0x8A46,
        "INVALID_INDEX".."0xFFFFFFFF",
        "MAX_VERTEX_OUTPUT_COMPONENTS"..0x9122,
        "MAX_FRAGMENT_INPUT_COMPONENTS"..0x9125,
        "MAX_SERVER_WAIT_TIMEOUT"..0x9111,
        "OBJECT_TYPE"..0x9112,
        "SYNC_CONDITION"..0x9113,
        "SYNC_STATUS"..0x9114,
        "SYNC_FLAGS"..0x9115,
        "SYNC_FENCE"..0x9116,
        "SYNC_GPU_COMMANDS_COMPLETE"..0x9117,
        "UNSIGNALED"..0x9118,
        "SIGNALED"..0x9119,
        "ALREADY_SIGNALED"..0x911A,
        "TIMEOUT_EXPIRED"..0x911B,
        "CONDITION_SATISFIED"..0x911C,
        "WAIT_FAILED"..0x911D,
        "SYNC_FLUSH_COMMANDS_BIT"..0x00000001,
        "VERTEX_ATTRIB_ARRAY_DIVISOR"..0x88FE,
        "ANY_SAMPLES_PASSED"..0x8C2F,
        "ANY_SAMPLES_PASSED_CONSERVATIVE"..0x8D6A,
        "SAMPLER_BINDING"..0x8919,
        "RGB10_A2UI"..0x906F,
        "TEXTURE_SWIZZLE_R"..0x8E42,
        "TEXTURE_SWIZZLE_G"..0x8E43,
        "TEXTURE_SWIZZLE_B"..0x8E44,
        "TEXTURE_SWIZZLE_A"..0x8E45,
        "GREEN"..0x1904,
        "BLUE"..0x1905,
        "INT_2_10_10_10_REV"..0x8D9F,
        "TRANSFORM_FEEDBACK"..0x8E22,
        "TRANSFORM_FEEDBACK_PAUSED"..0x8E23,
        "TRANSFORM_FEEDBACK_ACTIVE"..0x8E24,
        "TRANSFORM_FEEDBACK_BINDING"..0x8E25,
        "PROGRAM_BINARY_RETRIEVABLE_HINT"..0x8257,
        "PROGRAM_BINARY_LENGTH"..0x8741,
        "NUM_PROGRAM_BINARY_FORMATS"..0x87FE,
        "PROGRAM_BINARY_FORMATS"..0x87FF,
        "COMPRESSED_R11_EAC"..0x9270,
        "COMPRESSED_SIGNED_R11_EAC"..0x9271,
        "COMPRESSED_RG11_EAC"..0x9272,
        "COMPRESSED_SIGNED_RG11_EAC"..0x9273,
        "COMPRESSED_RGB8_ETC2"..0x9274,
        "COMPRESSED_SRGB8_ETC2"..0x9275,
        "COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2"..0x9276,
        "COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2"..0x9277,
        "COMPRESSED_RGBA8_ETC2_EAC"..0x9278,
        "COMPRESSED_SRGB8_ALPHA8_ETC2_EAC"..0x9279,
        "TEXTURE_IMMUTABLE_FORMAT"..0x912F,
        "MAX_ELEMENT_INDEX"..0x8D6B,
        "NUM_SAMPLE_COUNTS"..0x9380,
        "TEXTURE_IMMUTABLE_LEVELS"..0x82DF
    )

    LongConstant(
        "",

        "TIMEOUT_IGNORED".."0xFFFFFFFFFFFFFFFFL"
    )

    void(
        "ReadBuffer",
        "",

        GLenum("src", "")
    )

    void(
        "DrawRangeElements",
        "",

        GLenum("mode", ""),
        GLuint("start", ""),
        GLuint("end", ""),
        AutoSizeShr("GLESChecks.typeToByteShift(type)", "indices")..GLsizei("count", ""),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum("type", ""),
        RawPointer..void.const.p("indices", "")
    )

    void(
        "TexImage3D",
        "",

        GLenum("target", ""),
        GLint("level", ""),
        GLint("internalformat", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLsizei("depth", ""),
        GLint("border", ""),
        GLenum("format", ""),
        GLenum("type", ""),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..RawPointer..nullable..void.const.p("pixels", "")
    )

    void(
        "TexSubImage3D",
        "",

        GLenum("target", ""),
        GLint("level", ""),
        GLint("xoffset", ""),
        GLint("yoffset", ""),
        GLint("zoffset", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLsizei("depth", ""),
        GLenum("format", ""),
        GLenum("type", ""),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..RawPointer..void.const.p("pixels", "")
    )

    void(
        "CopyTexSubImage3D",
        "",

        GLenum("target", ""),
        GLint("level", ""),
        GLint("xoffset", ""),
        GLint("yoffset", ""),
        GLint("zoffset", ""),
        GLint("x", ""),
        GLint("y", ""),
        GLsizei("width", ""),
        GLsizei("height", "")
    )

    void(
        "CompressedTexImage3D",
        "",

        GLenum("target", ""),
        GLint("level", ""),
        GLenum("internalformat", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLsizei("depth", ""),
        GLint("border", ""),
        AutoSize("data")..GLsizei("imageSize", ""),
        RawPointer..nullable..void.const.p("data", "")
    )

    void(
        "CompressedTexSubImage3D",
        "",

        GLenum("target", ""),
        GLint("level", ""),
        GLint("xoffset", ""),
        GLint("yoffset", ""),
        GLint("zoffset", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLsizei("depth", ""),
        GLenum("format", ""),
        AutoSize("data")..GLsizei("imageSize", ""),
        RawPointer..void.const.p("data", "")
    )

    void(
        "GenQueries",
        "",

        AutoSize("ids")..GLsizei("n", ""),
        ReturnParam..GLuint.p("ids", "")
    )

    void(
        "DeleteQueries",
        "",

        AutoSize("ids")..GLsizei("n", ""),
        SingleValue("id")..GLuint.const.p("ids", "")
    )

    GLboolean(
        "IsQuery",
        "",

        GLuint("id", "")
    )

    void(
        "BeginQuery",
        "",

        GLenum("target", ""),
        GLuint("id", "")
    )

    void(
        "EndQuery",
        "",

        GLenum("target", "")
    )

    void(
        "GetQueryiv",
        "",

        GLenum("target", ""),
        GLenum("pname", ""),
        ReturnParam..Check(1)..GLint.p("params", "")
    )

    void(
        "GetQueryObjectuiv",
        "",

        GLuint("id", ""),
        GLenum("pname", ""),
        ReturnParam..Check(1)..GLuint.p("params", "")
    )

    GLboolean(
        "UnmapBuffer",
        "",

        GLenum("target", "")
    )

    void(
        "GetBufferPointerv",
        "",

        GLenum("target", ""),
        GLenum("pname", ""),
        ReturnParam..Check(1)..void.p.p("params", "")
    )

    void(
        "DrawBuffers",
        "",

        AutoSize("bufs")..GLsizei("n", ""),
        SingleValue("buf")..GLenum.const.p("bufs", "")
    )

    void(
        "UniformMatrix2x3fv",
        "",

        GLint("location", ""),
        AutoSize(2 x 3, "value")..GLsizei("count", ""),
        GLboolean("transpose", ""),
        GLfloat.const.p("value", "")
    )

    void(
        "UniformMatrix3x2fv",
        "",

        GLint("location", ""),
        AutoSize(3 x 2, "value")..GLsizei("count", ""),
        GLboolean("transpose", ""),
        GLfloat.const.p("value", "")
    )

    void(
        "UniformMatrix2x4fv",
        "",

        GLint("location", ""),
        AutoSize(2 x 4, "value")..GLsizei("count", ""),
        GLboolean("transpose", ""),
        GLfloat.const.p("value", "")
    )

    void(
        "UniformMatrix4x2fv",
        "",

        GLint("location", ""),
        AutoSize(4 x 2, "value")..GLsizei("count", ""),
        GLboolean("transpose", ""),
        GLfloat.const.p("value", "")
    )

    void(
        "UniformMatrix3x4fv",
        "",

        GLint("location", ""),
        AutoSize(3 x 4, "value")..GLsizei("count", ""),
        GLboolean("transpose", ""),
        GLfloat.const.p("value", "")
    )

    void(
        "UniformMatrix4x3fv",
        "",

        GLint("location", ""),
        AutoSize(4 x 3, "value")..GLsizei("count", ""),
        GLboolean("transpose", ""),
        GLfloat.const.p("value", "")
    )

    void(
        "BlitFramebuffer",
        "",

        GLint("srcX0", ""),
        GLint("srcY0", ""),
        GLint("srcX1", ""),
        GLint("srcY1", ""),
        GLint("dstX0", ""),
        GLint("dstY0", ""),
        GLint("dstX1", ""),
        GLint("dstY1", ""),
        GLbitfield("mask", ""),
        GLenum("filter", "")
    )

    void(
        "RenderbufferStorageMultisample",
        "",

        GLenum("target", ""),
        GLsizei("samples", ""),
        GLenum("internalformat", ""),
        GLsizei("width", ""),
        GLsizei("height", "")
    )

    void(
        "FramebufferTextureLayer",
        "",

        GLenum("target", ""),
        GLenum("attachment", ""),
        GLuint("texture", ""),
        GLint("level", ""),
        GLint("layer", "")
    )

    MapPointer("length", oldBufferOverloads = true)..void.p(
        "MapBufferRange",
        "",

        GLenum("target", ""),
        GLintptr("offset", ""),
        GLsizeiptr("length", ""),
        GLbitfield("access", "")
    )

    void(
        "FlushMappedBufferRange",
        "",

        GLenum("target", ""),
        GLintptr("offset", ""),
        GLsizeiptr("length", "")
    )

    void(
        "BindVertexArray",
        "",

        GLuint("array", "")
    )

    void(
        "DeleteVertexArrays",
        "",

        AutoSize("arrays")..GLsizei("n", ""),
        SingleValue("array")..GLuint.const.p("arrays", "")
    )

    void(
        "GenVertexArrays",
        "",

        AutoSize("arrays")..GLsizei("n", ""),
        ReturnParam..GLuint.p("arrays", "")
    )

    GLboolean(
        "IsVertexArray",
        "",

        GLuint("array", "")
    )

    void(
        "GetIntegeri_v",
        "",

        GLenum("target", ""),
        GLuint("index", ""),
        ReturnParam..Check(1)..GLint.p("data", "")
    )

    void(
        "BeginTransformFeedback",
        "",

        GLenum("primitiveMode", "")
    )

    void(
        "EndTransformFeedback",
        ""
    )

    void(
        "BindBufferRange",
        "",

        GLenum("target", ""),
        GLuint("index", ""),
        GLuint("buffer", ""),
        GLintptr("offset", ""),
        GLsizeiptr("size", "")
    )

    void(
        "BindBufferBase",
        "",

        GLenum("target", ""),
        GLuint("index", ""),
        GLuint("buffer", "")
    )

    void(
        "TransformFeedbackVaryings",
        "",

        GLuint("program", ""),
        AutoSize("varyings")..GLsizei("count", ""),
        PointerArray(GLcharASCII.p, "varying")..GLcharASCII.const.p.const.p("varyings", ""),
        GLenum("bufferMode", "")
    )

    void(
        "GetTransformFeedbackVarying",
        "",

        GLuint("program", ""),
        GLuint("index", ""),
        AutoSize("name")..GLsizei("bufSize", ""),
        Check(1)..nullable..GLsizei.p("length", ""),
        Check(1)..GLsizei.p("size", ""),
        Check(1)..GLenum.p("type", ""),
        Return(
            "length",
            "GLES20.glGetProgrami(program, GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH)"
        )..GLcharASCII.p("name", "")
    )

    OffHeapOnly..void(
        "VertexAttribIPointer",
        "",

        GLuint("index", ""),
        GLint("size", ""),
        GLenum("type", ""),
        GLsizei("stride", ""),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT
        )..Unsafe..RawPointer..void.const.p("pointer", "")
    )

    void(
        "GetVertexAttribIiv",
        "",

        GLuint("index", ""),
        GLenum("pname", ""),
        ReturnParam..Check(1)..GLint.p("params", "")
    )

    void(
        "GetVertexAttribIuiv",
        "",

        GLuint("index", ""),
        GLenum("pname", ""),
        ReturnParam..Check(1)..GLuint.p("params", "")
    )

    void(
        "VertexAttribI4i",
        "",

        GLuint("index", ""),
        GLint("x", ""),
        GLint("y", ""),
        GLint("z", ""),
        GLint("w", "")
    )

    void(
        "VertexAttribI4ui",
        "",

        GLuint("index", ""),
        GLuint("x", ""),
        GLuint("y", ""),
        GLuint("z", ""),
        GLuint("w", "")
    )

    void(
        "VertexAttribI4iv",
        "",

        GLuint("index", ""),
        Check(4)..GLint.const.p("v", "")
    )

    void(
        "VertexAttribI4uiv",
        "",

        GLuint("index", ""),
        Check(4)..GLuint.const.p("v", "")
    )

    void(
        "GetUniformuiv",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        ReturnParam..Check(1)..GLuint.p("params", "")
    )

    GLint(
        "GetFragDataLocation",
        "",

        GLuint("program", ""),
        GLcharASCII.const.p("name", "")
    )

    void(
        "Uniform1ui",
        "",

        GLint("location", ""),
        GLuint("v0", "")
    )

    void(
        "Uniform2ui",
        "",

        GLint("location", ""),
        GLuint("v0", ""),
        GLuint("v1", "")
    )

    void(
        "Uniform3ui",
        "",

        GLint("location", ""),
        GLuint("v0", ""),
        GLuint("v1", ""),
        GLuint("v2", "")
    )

    void(
        "Uniform4ui",
        "",

        GLint("location", ""),
        GLuint("v0", ""),
        GLuint("v1", ""),
        GLuint("v2", ""),
        GLuint("v3", "")
    )

    void(
        "Uniform1uiv",
        "",

        GLint("location", ""),
        AutoSize("value")..GLsizei("count", ""),
        GLuint.const.p("value", "")
    )

    void(
        "Uniform2uiv",
        "",

        GLint("location", ""),
        AutoSize(2, "value")..GLsizei("count", ""),
        GLuint.const.p("value", "")
    )

    void(
        "Uniform3uiv",
        "",

        GLint("location", ""),
        AutoSize(3, "value")..GLsizei("count", ""),
        GLuint.const.p("value", "")
    )

    void(
        "Uniform4uiv",
        "",

        GLint("location", ""),
        AutoSize(4, "value")..GLsizei("count", ""),
        GLuint.const.p("value", "")
    )

    void(
        "ClearBufferiv",
        "",

        GLenum("buffer", ""),
        GLint("drawbuffer", ""),
        Check(1)..GLint.const.p("value", "")
    )

    void(
        "ClearBufferuiv",
        "",

        GLenum("buffer", ""),
        GLint("drawbuffer", ""),
        Check(1)..GLuint.const.p("value", "")
    )

    void(
        "ClearBufferfv",
        "",

        GLenum("buffer", ""),
        GLint("drawbuffer", ""),
        Check(1)..GLfloat.const.p("value", "")
    )

    void(
        "ClearBufferfi",
        "",

        GLenum("buffer", ""),
        GLint("drawbuffer", ""),
        GLfloat("depth", ""),
        GLint("stencil", "")
    )

    GLubyteUTF8.const.p(
        "GetStringi",
        "",

        GLenum("name", ""),
        GLuint("index", "")
    )

    void(
        "CopyBufferSubData",
        "",

        GLenum("readTarget", ""),
        GLenum("writeTarget", ""),
        GLintptr("readOffset", ""),
        GLintptr("writeOffset", ""),
        GLsizeiptr("size", "")
    )

    void(
        "GetUniformIndices",
        "",

        GLuint("program", ""),
        AutoSize("uniformNames", "uniformIndices")..GLsizei("uniformCount", ""),
        GLcharASCII.const.p.const.p("uniformNames", ""),
        GLuint.p("uniformIndices", "")
    )

    void(
        "GetActiveUniformsiv",
        "",

        GLuint("program", ""),
        AutoSize("uniformIndices", "params")..GLsizei("uniformCount", ""),
        GLuint.const.p("uniformIndices", ""),
        GLenum("pname", ""),
        GLint.p("params", "")
    )

    GLuint(
        "GetUniformBlockIndex",
        "",

        GLuint("program", ""),
        GLcharASCII.const.p("uniformBlockName", "")
    )

    void(
        "GetActiveUniformBlockiv",
        "",

        GLuint("program", ""),
        GLuint("uniformBlockIndex", ""),
        GLenum("pname", ""),
        ReturnParam..Check(1)..GLint.p("params", "")
    )

    void(
        "GetActiveUniformBlockName",
        "",

        GLuint("program", ""),
        GLuint("uniformBlockIndex", ""),
        AutoSize("uniformBlockName")..GLsizei("bufSize", ""),
        Check(1)..nullable..GLsizei.p("length", ""),
        Return(
            "length",
            "glGetActiveUniformBlocki(program, uniformBlockIndex, GL_UNIFORM_BLOCK_NAME_LENGTH)"
        )..GLcharASCII.p("uniformBlockName", "")
    )

    void(
        "UniformBlockBinding",
        "",

        GLuint("program", ""),
        GLuint("uniformBlockIndex", ""),
        GLuint("uniformBlockBinding", "")
    )

    void(
        "DrawArraysInstanced",
        "",

        GLenum("mode", ""),
        GLint("first", ""),
        GLsizei("count", ""),
        GLsizei("instancecount", "")
    )

    void(
        "DrawElementsInstanced",
        "",

        GLenum("mode", ""),
        AutoSizeShr("GLESChecks.typeToByteShift(type)", "indices")..GLsizei("count", ""),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum("type", ""),
        RawPointer..void.const.p("indices", ""),
        GLsizei("instancecount", "")
    )

    GLsync(
        "FenceSync",
        "",

        GLenum("condition", ""),
        GLbitfield("flags", "")
    )

    GLboolean(
        "IsSync",
        "",

        GLsync("sync", "")
    )

    void(
        "DeleteSync",
        "",

        GLsync("sync", "")
    )

    GLenum(
        "ClientWaitSync",
        "",

        GLsync("sync", ""),
        GLbitfield("flags", ""),
        GLuint64("timeout", "")
    )

    void(
        "WaitSync",
        "",

        GLsync("sync", ""),
        GLbitfield("flags", ""),
        GLuint64("timeout", "")
    )

    void(
        "GetInteger64v",
        "",

        GLenum("pname", ""),
        ReturnParam..Check(1)..GLint64.p("data", "")
    )

    void(
        "GetSynciv",
        "",

        GLsync("sync", ""),
        GLenum("pname", ""),
        AutoSize("values")..GLsizei("bufSize", ""),
        Check(1)..nullable..GLsizei.p("length", ""),
        ReturnParam..GLint.p("values", "")
    )

    void(
        "GetInteger64i_v",
        "",

        GLenum("target", ""),
        GLuint("index", ""),
        ReturnParam..Check(1)..GLint64.p("data", "")
    )

    void(
        "GetBufferParameteri64v",
        "",

        GLenum("target", ""),
        GLenum("pname", ""),
        ReturnParam..Check(1)..GLint64.p("params", "")
    )

    void(
        "GenSamplers",
        "",

        AutoSize("samplers")..GLsizei("count", ""),
        ReturnParam..GLuint.p("samplers", "")
    )

    void(
        "DeleteSamplers",
        "",

        AutoSize("samplers")..GLsizei("count", ""),
        SingleValue("sampler")..GLuint.const.p("samplers", "")
    )

    GLboolean(
        "IsSampler",
        "",

        GLuint("sampler", "")
    )

    void(
        "BindSampler",
        "",

        GLuint("unit", ""),
        GLuint("sampler", "")
    )

    void(
        "SamplerParameteri",
        "",

        GLuint("sampler", ""),
        GLenum("pname", ""),
        GLint("param", "")
    )

    void(
        "SamplerParameteriv",
        "",

        GLuint("sampler", ""),
        GLenum("pname", ""),
        Check(1)..GLint.const.p("param", "")
    )

    void(
        "SamplerParameterf",
        "",

        GLuint("sampler", ""),
        GLenum("pname", ""),
        GLfloat("param", "")
    )

    void(
        "SamplerParameterfv",
        "",

        GLuint("sampler", ""),
        GLenum("pname", ""),
        Check(1)..GLfloat.const.p("param", "")
    )

    void(
        "GetSamplerParameteriv",
        "",

        GLuint("sampler", ""),
        GLenum("pname", ""),
        ReturnParam..Check(1)..GLint.p("params", "")
    )

    void(
        "GetSamplerParameterfv",
        "",

        GLuint("sampler", ""),
        GLenum("pname", ""),
        ReturnParam..Check(1)..GLfloat.p("params", "")
    )

    void(
        "VertexAttribDivisor",
        "",

        GLuint("index", ""),
        GLuint("divisor", "")
    )

    void(
        "BindTransformFeedback",
        "",

        GLenum("target", ""),
        GLuint("id", "")
    )

    void(
        "DeleteTransformFeedbacks",
        "",

        AutoSize("ids")..GLsizei("n", ""),
        SingleValue("id")..GLuint.const.p("ids", "")
    )

    void(
        "GenTransformFeedbacks",
        "",

        AutoSize("ids")..GLsizei("n", ""),
        ReturnParam..GLuint.p("ids", "")
    )

    GLboolean(
        "IsTransformFeedback",
        "",

        GLuint("id", "")
    )

    void(
        "PauseTransformFeedback",
        ""
    )

    void(
        "ResumeTransformFeedback",
        ""
    )

    void(
        "GetProgramBinary",
        "",

        GLuint("program", ""),
        AutoSize("binary")..GLsizei("bufSize", ""),
        Check(1)..nullable..GLsizei.p("length", ""),
        Check(1)..GLenum.p("binaryFormat", ""),
        void.p("binary", "")
    )

    void(
        "ProgramBinary",
        "",

        GLuint("program", ""),
        GLenum("binaryFormat", ""),
        void.const.p("binary", ""),
        AutoSize("binary")..GLsizei("length", "")
    )

    void(
        "ProgramParameteri",
        "",

        GLuint("program", ""),
        GLenum("pname", ""),
        GLint("value", "")
    )

    void(
        "InvalidateFramebuffer",
        "",

        GLenum("target", ""),
        AutoSize("attachments")..GLsizei("numAttachments", ""),
        SingleValue("attachment")..GLenum.const.p("attachments", "")
    )

    void(
        "InvalidateSubFramebuffer",
        "",

        GLenum("target", ""),
        AutoSize("attachments")..GLsizei("numAttachments", ""),
        SingleValue("attachment")..GLenum.const.p("attachments", ""),
        GLint("x", ""),
        GLint("y", ""),
        GLsizei("width", ""),
        GLsizei("height", "")
    )

    void(
        "TexStorage2D",
        "",

        GLenum("target", ""),
        GLsizei("levels", ""),
        GLenum("internalformat", ""),
        GLsizei("width", ""),
        GLsizei("height", "")
    )

    void(
        "TexStorage3D",
        "",

        GLenum("target", ""),
        GLsizei("levels", ""),
        GLenum("internalformat", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLsizei("depth", "")
    )

    void(
        "GetInternalformativ",
        "",

        GLenum("target", ""),
        GLenum("internalformat", ""),
        GLenum("pname", ""),
        AutoSize("params")..GLsizei("bufSize", ""),
        ReturnParam..GLint.p("params", "")
    )
}