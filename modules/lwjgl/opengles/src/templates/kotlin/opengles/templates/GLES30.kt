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

        GLenum.IN("src", "")
    )

    void(
        "DrawRangeElements",
        "",

        GLenum.IN("mode", ""),
        GLuint.IN("start", ""),
        GLuint.IN("end", ""),
        AutoSizeShr("GLESChecks.typeToByteShift(type)", "indices")..GLsizei.IN("count", ""),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum.IN("type", ""),
        ELEMENT_ARRAY_BUFFER..void.const.p.IN("indices", "")
    )

    void(
        "TexImage3D",
        "",

        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        GLint.IN("internalformat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLsizei.IN("depth", ""),
        GLint.IN("border", ""),
        GLenum.IN("format", ""),
        GLenum.IN("type", ""),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..PIXEL_UNPACK_BUFFER..nullable..void.const.p.IN("pixels", "")
    )

    void(
        "TexSubImage3D",
        "",

        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        GLint.IN("xoffset", ""),
        GLint.IN("yoffset", ""),
        GLint.IN("zoffset", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLsizei.IN("depth", ""),
        GLenum.IN("format", ""),
        GLenum.IN("type", ""),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..PIXEL_UNPACK_BUFFER..void.const.p.IN("pixels", "")
    )

    void(
        "CopyTexSubImage3D",
        "",

        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        GLint.IN("xoffset", ""),
        GLint.IN("yoffset", ""),
        GLint.IN("zoffset", ""),
        GLint.IN("x", ""),
        GLint.IN("y", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", "")
    )

    void(
        "CompressedTexImage3D",
        "",

        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        GLenum.IN("internalformat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLsizei.IN("depth", ""),
        GLint.IN("border", ""),
        AutoSize("data")..GLsizei.IN("imageSize", ""),
        PIXEL_UNPACK_BUFFER..nullable..void.const.p.IN("data", "")
    )

    void(
        "CompressedTexSubImage3D",
        "",

        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        GLint.IN("xoffset", ""),
        GLint.IN("yoffset", ""),
        GLint.IN("zoffset", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLsizei.IN("depth", ""),
        GLenum.IN("format", ""),
        AutoSize("data")..GLsizei.IN("imageSize", ""),
        PIXEL_UNPACK_BUFFER..void.const.p.IN("data", "")
    )

    void(
        "GenQueries",
        "",

        AutoSize("ids")..GLsizei.IN("n", ""),
        ReturnParam..GLuint.p.OUT("ids", "")
    )

    void(
        "DeleteQueries",
        "",

        AutoSize("ids")..GLsizei.IN("n", ""),
        SingleValue("id")..GLuint.const.p.IN("ids", "")
    )

    GLboolean(
        "IsQuery",
        "",

        GLuint.IN("id", "")
    )

    void(
        "BeginQuery",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("id", "")
    )

    void(
        "EndQuery",
        "",

        GLenum.IN("target", "")
    )

    void(
        "GetQueryiv",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLint.p.OUT("params", "")
    )

    void(
        "GetQueryObjectuiv",
        "",

        GLuint.IN("id", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLuint.p.OUT("params", "")
    )

    GLboolean(
        "UnmapBuffer",
        "",

        GLenum.IN("target", "")
    )

    void(
        "GetBufferPointerv",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..void.p.p.OUT("params", "")
    )

    void(
        "DrawBuffers",
        "",

        AutoSize("bufs")..GLsizei.IN("n", ""),
        SingleValue("buf")..GLenum.const.p.IN("bufs", "")
    )

    void(
        "UniformMatrix2x3fv",
        "",

        GLint.IN("location", ""),
        AutoSize(2 x 3, "value")..GLsizei.IN("count", ""),
        GLboolean.IN("transpose", ""),
        GLfloat.const.p.IN("value", "")
    )

    void(
        "UniformMatrix3x2fv",
        "",

        GLint.IN("location", ""),
        AutoSize(3 x 2, "value")..GLsizei.IN("count", ""),
        GLboolean.IN("transpose", ""),
        GLfloat.const.p.IN("value", "")
    )

    void(
        "UniformMatrix2x4fv",
        "",

        GLint.IN("location", ""),
        AutoSize(2 x 4, "value")..GLsizei.IN("count", ""),
        GLboolean.IN("transpose", ""),
        GLfloat.const.p.IN("value", "")
    )

    void(
        "UniformMatrix4x2fv",
        "",

        GLint.IN("location", ""),
        AutoSize(4 x 2, "value")..GLsizei.IN("count", ""),
        GLboolean.IN("transpose", ""),
        GLfloat.const.p.IN("value", "")
    )

    void(
        "UniformMatrix3x4fv",
        "",

        GLint.IN("location", ""),
        AutoSize(3 x 4, "value")..GLsizei.IN("count", ""),
        GLboolean.IN("transpose", ""),
        GLfloat.const.p.IN("value", "")
    )

    void(
        "UniformMatrix4x3fv",
        "",

        GLint.IN("location", ""),
        AutoSize(4 x 3, "value")..GLsizei.IN("count", ""),
        GLboolean.IN("transpose", ""),
        GLfloat.const.p.IN("value", "")
    )

    void(
        "BlitFramebuffer",
        "",

        GLint.IN("srcX0", ""),
        GLint.IN("srcY0", ""),
        GLint.IN("srcX1", ""),
        GLint.IN("srcY1", ""),
        GLint.IN("dstX0", ""),
        GLint.IN("dstY0", ""),
        GLint.IN("dstX1", ""),
        GLint.IN("dstY1", ""),
        GLbitfield.IN("mask", ""),
        GLenum.IN("filter", "")
    )

    void(
        "RenderbufferStorageMultisample",
        "",

        GLenum.IN("target", ""),
        GLsizei.IN("samples", ""),
        GLenum.IN("internalformat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", "")
    )

    void(
        "FramebufferTextureLayer",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("attachment", ""),
        GLuint.IN("texture", ""),
        GLint.IN("level", ""),
        GLint.IN("layer", "")
    )

    MapPointer("length")..void.p(
        "MapBufferRange",
        "",

        GLenum.IN("target", ""),
        GLintptr.IN("offset", ""),
        GLsizeiptr.IN("length", ""),
        GLbitfield.IN("access", "")
    )

    void(
        "FlushMappedBufferRange",
        "",

        GLenum.IN("target", ""),
        GLintptr.IN("offset", ""),
        GLsizeiptr.IN("length", "")
    )

    void(
        "BindVertexArray",
        "",

        GLuint.IN("array", "")
    )

    void(
        "DeleteVertexArrays",
        "",

        AutoSize("arrays")..GLsizei.IN("n", ""),
        SingleValue("array")..GLuint.const.p.IN("arrays", "")
    )

    void(
        "GenVertexArrays",
        "",

        AutoSize("arrays")..GLsizei.IN("n", ""),
        ReturnParam..GLuint.p.OUT("arrays", "")
    )

    GLboolean(
        "IsVertexArray",
        "",

        GLuint.IN("array", "")
    )

    void(
        "GetIntegeri_v",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", ""),
        ReturnParam..Check(1)..GLint.p.OUT("data", "")
    )

    void(
        "BeginTransformFeedback",
        "",

        GLenum.IN("primitiveMode", "")
    )

    void(
        "EndTransformFeedback",
        ""
    )

    void(
        "BindBufferRange",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", ""),
        GLuint.IN("buffer", ""),
        GLintptr.IN("offset", ""),
        GLsizeiptr.IN("size", "")
    )

    void(
        "BindBufferBase",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", ""),
        GLuint.IN("buffer", "")
    )

    void(
        "TransformFeedbackVaryings",
        "",

        GLuint.IN("program", ""),
        AutoSize("varyings")..GLsizei.IN("count", ""),
        PointerArray(GLcharASCII.p, "varying")..GLcharASCII.const.p.const.p.IN("varyings", ""),
        GLenum.IN("bufferMode", "")
    )

    void(
        "GetTransformFeedbackVarying",
        "",

        GLuint.IN("program", ""),
        GLuint.IN("index", ""),
        AutoSize("name")..GLsizei.IN("bufSize", ""),
        Check(1)..nullable..GLsizei.p.OUT("length", ""),
        Check(1)..GLsizei.p.OUT("size", ""),
        Check(1)..GLenum.p.OUT("type", ""),
        Return(
            "length",
            "GLES20.glGetProgrami(program, GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH)"
        )..GLcharASCII.p.OUT("name", "")
    )

    OffHeapOnly..void(
        "VertexAttribIPointer",
        "",

        GLuint.IN("index", ""),
        GLint.IN("size", ""),
        GLenum.IN("type", ""),
        GLsizei.IN("stride", ""),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT
        )..Unsafe..ARRAY_BUFFER..void.const.p.IN("pointer", "")
    )

    void(
        "GetVertexAttribIiv",
        "",

        GLuint.IN("index", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLint.p.OUT("params", "")
    )

    void(
        "GetVertexAttribIuiv",
        "",

        GLuint.IN("index", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLuint.p.OUT("params", "")
    )

    void(
        "VertexAttribI4i",
        "",

        GLuint.IN("index", ""),
        GLint.IN("x", ""),
        GLint.IN("y", ""),
        GLint.IN("z", ""),
        GLint.IN("w", "")
    )

    void(
        "VertexAttribI4ui",
        "",

        GLuint.IN("index", ""),
        GLuint.IN("x", ""),
        GLuint.IN("y", ""),
        GLuint.IN("z", ""),
        GLuint.IN("w", "")
    )

    void(
        "VertexAttribI4iv",
        "",

        GLuint.IN("index", ""),
        Check(4)..GLint.const.p.IN("v", "")
    )

    void(
        "VertexAttribI4uiv",
        "",

        GLuint.IN("index", ""),
        Check(4)..GLuint.const.p.IN("v", "")
    )

    void(
        "GetUniformuiv",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        ReturnParam..Check(1)..GLuint.p.OUT("params", "")
    )

    GLint(
        "GetFragDataLocation",
        "",

        GLuint.IN("program", ""),
        GLcharASCII.const.p.IN("name", "")
    )

    void(
        "Uniform1ui",
        "",

        GLint.IN("location", ""),
        GLuint.IN("v0", "")
    )

    void(
        "Uniform2ui",
        "",

        GLint.IN("location", ""),
        GLuint.IN("v0", ""),
        GLuint.IN("v1", "")
    )

    void(
        "Uniform3ui",
        "",

        GLint.IN("location", ""),
        GLuint.IN("v0", ""),
        GLuint.IN("v1", ""),
        GLuint.IN("v2", "")
    )

    void(
        "Uniform4ui",
        "",

        GLint.IN("location", ""),
        GLuint.IN("v0", ""),
        GLuint.IN("v1", ""),
        GLuint.IN("v2", ""),
        GLuint.IN("v3", "")
    )

    void(
        "Uniform1uiv",
        "",

        GLint.IN("location", ""),
        AutoSize("value")..GLsizei.IN("count", ""),
        GLuint.const.p.IN("value", "")
    )

    void(
        "Uniform2uiv",
        "",

        GLint.IN("location", ""),
        AutoSize(2, "value")..GLsizei.IN("count", ""),
        GLuint.const.p.IN("value", "")
    )

    void(
        "Uniform3uiv",
        "",

        GLint.IN("location", ""),
        AutoSize(3, "value")..GLsizei.IN("count", ""),
        GLuint.const.p.IN("value", "")
    )

    void(
        "Uniform4uiv",
        "",

        GLint.IN("location", ""),
        AutoSize(4, "value")..GLsizei.IN("count", ""),
        GLuint.const.p.IN("value", "")
    )

    void(
        "ClearBufferiv",
        "",

        GLenum.IN("buffer", ""),
        GLint.IN("drawbuffer", ""),
        Check(1)..GLint.const.p.IN("value", "")
    )

    void(
        "ClearBufferuiv",
        "",

        GLenum.IN("buffer", ""),
        GLint.IN("drawbuffer", ""),
        Check(1)..GLuint.const.p.IN("value", "")
    )

    void(
        "ClearBufferfv",
        "",

        GLenum.IN("buffer", ""),
        GLint.IN("drawbuffer", ""),
        Check(1)..GLfloat.const.p.IN("value", "")
    )

    void(
        "ClearBufferfi",
        "",

        GLenum.IN("buffer", ""),
        GLint.IN("drawbuffer", ""),
        GLfloat.IN("depth", ""),
        GLint.IN("stencil", "")
    )

    GLubyteUTF8.const.p(
        "GetStringi",
        "",

        GLenum.IN("name", ""),
        GLuint.IN("index", "")
    )

    void(
        "CopyBufferSubData",
        "",

        GLenum.IN("readTarget", ""),
        GLenum.IN("writeTarget", ""),
        GLintptr.IN("readOffset", ""),
        GLintptr.IN("writeOffset", ""),
        GLsizeiptr.IN("size", "")
    )

    void(
        "GetUniformIndices",
        "",

        GLuint.IN("program", ""),
        AutoSize("uniformNames", "uniformIndices")..GLsizei.IN("uniformCount", ""),
        GLcharASCII.const.p.const.p.IN("uniformNames", ""),
        GLuint.p.OUT("uniformIndices", "")
    )

    void(
        "GetActiveUniformsiv",
        "",

        GLuint.IN("program", ""),
        AutoSize("uniformIndices", "params")..GLsizei.IN("uniformCount", ""),
        GLuint.const.p.IN("uniformIndices", ""),
        GLenum.IN("pname", ""),
        GLint.p.OUT("params", "")
    )

    GLuint(
        "GetUniformBlockIndex",
        "",

        GLuint.IN("program", ""),
        GLcharASCII.const.p.IN("uniformBlockName", "")
    )

    void(
        "GetActiveUniformBlockiv",
        "",

        GLuint.IN("program", ""),
        GLuint.IN("uniformBlockIndex", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLint.p.OUT("params", "")
    )

    void(
        "GetActiveUniformBlockName",
        "",

        GLuint.IN("program", ""),
        GLuint.IN("uniformBlockIndex", ""),
        AutoSize("uniformBlockName")..GLsizei.IN("bufSize", ""),
        Check(1)..nullable..GLsizei.p.OUT("length", ""),
        Return(
            "length",
            "glGetActiveUniformBlocki(program, uniformBlockIndex, GL_UNIFORM_BLOCK_NAME_LENGTH)"
        )..GLcharASCII.p.OUT("uniformBlockName", "")
    )

    void(
        "UniformBlockBinding",
        "",

        GLuint.IN("program", ""),
        GLuint.IN("uniformBlockIndex", ""),
        GLuint.IN("uniformBlockBinding", "")
    )

    void(
        "DrawArraysInstanced",
        "",

        GLenum.IN("mode", ""),
        GLint.IN("first", ""),
        GLsizei.IN("count", ""),
        GLsizei.IN("instancecount", "")
    )

    void(
        "DrawElementsInstanced",
        "",

        GLenum.IN("mode", ""),
        AutoSizeShr("GLESChecks.typeToByteShift(type)", "indices")..GLsizei.IN("count", ""),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum.IN("type", ""),
        ELEMENT_ARRAY_BUFFER..void.const.p.IN("indices", ""),
        GLsizei.IN("instancecount", "")
    )

    GLsync(
        "FenceSync",
        "",

        GLenum.IN("condition", ""),
        GLbitfield.IN("flags", "")
    )

    GLboolean(
        "IsSync",
        "",

        GLsync.IN("sync", "")
    )

    void(
        "DeleteSync",
        "",

        GLsync.IN("sync", "")
    )

    GLenum(
        "ClientWaitSync",
        "",

        GLsync.IN("sync", ""),
        GLbitfield.IN("flags", ""),
        GLuint64.IN("timeout", "")
    )

    void(
        "WaitSync",
        "",

        GLsync.IN("sync", ""),
        GLbitfield.IN("flags", ""),
        GLuint64.IN("timeout", "")
    )

    void(
        "GetInteger64v",
        "",

        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLint64.p.OUT("data", "")
    )

    void(
        "GetSynciv",
        "",

        GLsync.IN("sync", ""),
        GLenum.IN("pname", ""),
        AutoSize("values")..GLsizei.IN("bufSize", ""),
        Check(1)..nullable..GLsizei.p.OUT("length", ""),
        ReturnParam..GLint.p.OUT("values", "")
    )

    void(
        "GetInteger64i_v",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", ""),
        ReturnParam..Check(1)..GLint64.p.OUT("data", "")
    )

    void(
        "GetBufferParameteri64v",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLint64.p.OUT("params", "")
    )

    void(
        "GenSamplers",
        "",

        AutoSize("samplers")..GLsizei.IN("count", ""),
        ReturnParam..GLuint.p.OUT("samplers", "")
    )

    void(
        "DeleteSamplers",
        "",

        AutoSize("samplers")..GLsizei.IN("count", ""),
        SingleValue("sampler")..GLuint.const.p.IN("samplers", "")
    )

    GLboolean(
        "IsSampler",
        "",

        GLuint.IN("sampler", "")
    )

    void(
        "BindSampler",
        "",

        GLuint.IN("unit", ""),
        GLuint.IN("sampler", "")
    )

    void(
        "SamplerParameteri",
        "",

        GLuint.IN("sampler", ""),
        GLenum.IN("pname", ""),
        GLint.IN("param", "")
    )

    void(
        "SamplerParameteriv",
        "",

        GLuint.IN("sampler", ""),
        GLenum.IN("pname", ""),
        Check(1)..GLint.const.p.IN("param", "")
    )

    void(
        "SamplerParameterf",
        "",

        GLuint.IN("sampler", ""),
        GLenum.IN("pname", ""),
        GLfloat.IN("param", "")
    )

    void(
        "SamplerParameterfv",
        "",

        GLuint.IN("sampler", ""),
        GLenum.IN("pname", ""),
        Check(1)..GLfloat.const.p.IN("param", "")
    )

    void(
        "GetSamplerParameteriv",
        "",

        GLuint.IN("sampler", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLint.p.OUT("params", "")
    )

    void(
        "GetSamplerParameterfv",
        "",

        GLuint.IN("sampler", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLfloat.p.OUT("params", "")
    )

    void(
        "VertexAttribDivisor",
        "",

        GLuint.IN("index", ""),
        GLuint.IN("divisor", "")
    )

    void(
        "BindTransformFeedback",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("id", "")
    )

    void(
        "DeleteTransformFeedbacks",
        "",

        AutoSize("ids")..GLsizei.IN("n", ""),
        SingleValue("id")..GLuint.const.p.IN("ids", "")
    )

    void(
        "GenTransformFeedbacks",
        "",

        AutoSize("ids")..GLsizei.IN("n", ""),
        ReturnParam..GLuint.p.OUT("ids", "")
    )

    GLboolean(
        "IsTransformFeedback",
        "",

        GLuint.IN("id", "")
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

        GLuint.IN("program", ""),
        AutoSize("binary")..GLsizei.IN("bufSize", ""),
        Check(1)..nullable..GLsizei.p.OUT("length", ""),
        Check(1)..GLenum.p.OUT("binaryFormat", ""),
        void.p.OUT("binary", "")
    )

    void(
        "ProgramBinary",
        "",

        GLuint.IN("program", ""),
        GLenum.IN("binaryFormat", ""),
        void.const.p.IN("binary", ""),
        AutoSize("binary")..GLsizei.IN("length", "")
    )

    void(
        "ProgramParameteri",
        "",

        GLuint.IN("program", ""),
        GLenum.IN("pname", ""),
        GLint.IN("value", "")
    )

    void(
        "InvalidateFramebuffer",
        "",

        GLenum.IN("target", ""),
        AutoSize("attachments")..GLsizei.IN("numAttachments", ""),
        SingleValue("attachment")..GLenum.const.p.IN("attachments", "")
    )

    void(
        "InvalidateSubFramebuffer",
        "",

        GLenum.IN("target", ""),
        AutoSize("attachments")..GLsizei.IN("numAttachments", ""),
        SingleValue("attachment")..GLenum.const.p.IN("attachments", ""),
        GLint.IN("x", ""),
        GLint.IN("y", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", "")
    )

    void(
        "TexStorage2D",
        "",

        GLenum.IN("target", ""),
        GLsizei.IN("levels", ""),
        GLenum.IN("internalformat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", "")
    )

    void(
        "TexStorage3D",
        "",

        GLenum.IN("target", ""),
        GLsizei.IN("levels", ""),
        GLenum.IN("internalformat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLsizei.IN("depth", "")
    )

    void(
        "GetInternalformativ",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("internalformat", ""),
        GLenum.IN("pname", ""),
        AutoSize("params")..GLsizei.IN("bufSize", ""),
        ReturnParam..GLint.p.OUT("params", "")
    )
}