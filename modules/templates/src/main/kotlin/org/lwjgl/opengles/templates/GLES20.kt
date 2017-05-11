/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*
import org.lwjgl.opengles.BufferType.*

val GLES20 = "GLES20".nativeClassGLES("GLES20", postfix = "") {
    documentation =
        "The core OpenGL ES 2.0 functionality."

    IntConstant(
        "",

        "DEPTH_BUFFER_BIT"..0x00000100,
        "STENCIL_BUFFER_BIT"..0x00000400,
        "COLOR_BUFFER_BIT"..0x00004000,
        "FALSE".."0",
        "TRUE".."1",
        "POINTS"..0x0000,
        "LINES"..0x0001,
        "LINE_LOOP"..0x0002,
        "LINE_STRIP"..0x0003,
        "TRIANGLES"..0x0004,
        "TRIANGLE_STRIP"..0x0005,
        "TRIANGLE_FAN"..0x0006,
        "ZERO".."0",
        "ONE".."1",
        "SRC_COLOR"..0x0300,
        "ONE_MINUS_SRC_COLOR"..0x0301,
        "SRC_ALPHA"..0x0302,
        "ONE_MINUS_SRC_ALPHA"..0x0303,
        "DST_ALPHA"..0x0304,
        "ONE_MINUS_DST_ALPHA"..0x0305,
        "DST_COLOR"..0x0306,
        "ONE_MINUS_DST_COLOR"..0x0307,
        "SRC_ALPHA_SATURATE"..0x0308,
        "FUNC_ADD"..0x8006,
        "BLEND_EQUATION"..0x8009,
        "BLEND_EQUATION_RGB"..0x8009,
        "BLEND_EQUATION_ALPHA"..0x883D,
        "FUNC_SUBTRACT"..0x800A,
        "FUNC_REVERSE_SUBTRACT"..0x800B,
        "BLEND_DST_RGB"..0x80C8,
        "BLEND_SRC_RGB"..0x80C9,
        "BLEND_DST_ALPHA"..0x80CA,
        "BLEND_SRC_ALPHA"..0x80CB,
        "CONSTANT_COLOR"..0x8001,
        "ONE_MINUS_CONSTANT_COLOR"..0x8002,
        "CONSTANT_ALPHA"..0x8003,
        "ONE_MINUS_CONSTANT_ALPHA"..0x8004,
        "BLEND_COLOR"..0x8005,
        "ARRAY_BUFFER"..0x8892,
        "ELEMENT_ARRAY_BUFFER"..0x8893,
        "ARRAY_BUFFER_BINDING"..0x8894,
        "ELEMENT_ARRAY_BUFFER_BINDING"..0x8895,
        "STREAM_DRAW"..0x88E0,
        "STATIC_DRAW"..0x88E4,
        "DYNAMIC_DRAW"..0x88E8,
        "BUFFER_SIZE"..0x8764,
        "BUFFER_USAGE"..0x8765,
        "CURRENT_VERTEX_ATTRIB"..0x8626,
        "FRONT"..0x0404,
        "BACK"..0x0405,
        "FRONT_AND_BACK"..0x0408,
        "TEXTURE_2D"..0x0DE1,
        "CULL_FACE"..0x0B44,
        "BLEND"..0x0BE2,
        "DITHER"..0x0BD0,
        "STENCIL_TEST"..0x0B90,
        "DEPTH_TEST"..0x0B71,
        "SCISSOR_TEST"..0x0C11,
        "POLYGON_OFFSET_FILL"..0x8037,
        "SAMPLE_ALPHA_TO_COVERAGE"..0x809E,
        "SAMPLE_COVERAGE"..0x80A0,
        "NO_ERROR".."0",
        "INVALID_ENUM"..0x0500,
        "INVALID_VALUE"..0x0501,
        "INVALID_OPERATION"..0x0502,
        "OUT_OF_MEMORY"..0x0505,
        "CW"..0x0900,
        "CCW"..0x0901,
        "LINE_WIDTH"..0x0B21,
        "ALIASED_POINT_SIZE_RANGE"..0x846D,
        "ALIASED_LINE_WIDTH_RANGE"..0x846E,
        "CULL_FACE_MODE"..0x0B45,
        "FRONT_FACE"..0x0B46,
        "DEPTH_RANGE"..0x0B70,
        "DEPTH_WRITEMASK"..0x0B72,
        "DEPTH_CLEAR_VALUE"..0x0B73,
        "DEPTH_FUNC"..0x0B74,
        "STENCIL_CLEAR_VALUE"..0x0B91,
        "STENCIL_FUNC"..0x0B92,
        "STENCIL_FAIL"..0x0B94,
        "STENCIL_PASS_DEPTH_FAIL"..0x0B95,
        "STENCIL_PASS_DEPTH_PASS"..0x0B96,
        "STENCIL_REF"..0x0B97,
        "STENCIL_VALUE_MASK"..0x0B93,
        "STENCIL_WRITEMASK"..0x0B98,
        "STENCIL_BACK_FUNC"..0x8800,
        "STENCIL_BACK_FAIL"..0x8801,
        "STENCIL_BACK_PASS_DEPTH_FAIL"..0x8802,
        "STENCIL_BACK_PASS_DEPTH_PASS"..0x8803,
        "STENCIL_BACK_REF"..0x8CA3,
        "STENCIL_BACK_VALUE_MASK"..0x8CA4,
        "STENCIL_BACK_WRITEMASK"..0x8CA5,
        "VIEWPORT"..0x0BA2,
        "SCISSOR_BOX"..0x0C10,
        "COLOR_CLEAR_VALUE"..0x0C22,
        "COLOR_WRITEMASK"..0x0C23,
        "UNPACK_ALIGNMENT"..0x0CF5,
        "PACK_ALIGNMENT"..0x0D05,
        "MAX_TEXTURE_SIZE"..0x0D33,
        "MAX_VIEWPORT_DIMS"..0x0D3A,
        "SUBPIXEL_BITS"..0x0D50,
        "RED_BITS"..0x0D52,
        "GREEN_BITS"..0x0D53,
        "BLUE_BITS"..0x0D54,
        "ALPHA_BITS"..0x0D55,
        "DEPTH_BITS"..0x0D56,
        "STENCIL_BITS"..0x0D57,
        "POLYGON_OFFSET_UNITS"..0x2A00,
        "POLYGON_OFFSET_FACTOR"..0x8038,
        "TEXTURE_BINDING_2D"..0x8069,
        "SAMPLE_BUFFERS"..0x80A8,
        "SAMPLES"..0x80A9,
        "SAMPLE_COVERAGE_VALUE"..0x80AA,
        "SAMPLE_COVERAGE_INVERT"..0x80AB,
        "NUM_COMPRESSED_TEXTURE_FORMATS"..0x86A2,
        "COMPRESSED_TEXTURE_FORMATS"..0x86A3,
        "DONT_CARE"..0x1100,
        "FASTEST"..0x1101,
        "NICEST"..0x1102,
        "GENERATE_MIPMAP_HINT"..0x8192,
        "BYTE"..0x1400,
        "UNSIGNED_BYTE"..0x1401,
        "SHORT"..0x1402,
        "UNSIGNED_SHORT"..0x1403,
        "INT"..0x1404,
        "UNSIGNED_INT"..0x1405,
        "FLOAT"..0x1406,
        "FIXED"..0x140C,
        "DEPTH_COMPONENT"..0x1902,
        "ALPHA"..0x1906,
        "RGB"..0x1907,
        "RGBA"..0x1908,
        "LUMINANCE"..0x1909,
        "LUMINANCE_ALPHA"..0x190A,
        "UNSIGNED_SHORT_4_4_4_4"..0x8033,
        "UNSIGNED_SHORT_5_5_5_1"..0x8034,
        "UNSIGNED_SHORT_5_6_5"..0x8363,
        "FRAGMENT_SHADER"..0x8B30,
        "VERTEX_SHADER"..0x8B31,
        "MAX_VERTEX_ATTRIBS"..0x8869,
        "MAX_VERTEX_UNIFORM_VECTORS"..0x8DFB,
        "MAX_VARYING_VECTORS"..0x8DFC,
        "MAX_COMBINED_TEXTURE_IMAGE_UNITS"..0x8B4D,
        "MAX_VERTEX_TEXTURE_IMAGE_UNITS"..0x8B4C,
        "MAX_TEXTURE_IMAGE_UNITS"..0x8872,
        "MAX_FRAGMENT_UNIFORM_VECTORS"..0x8DFD,
        "SHADER_TYPE"..0x8B4F,
        "DELETE_STATUS"..0x8B80,
        "LINK_STATUS"..0x8B82,
        "VALIDATE_STATUS"..0x8B83,
        "ATTACHED_SHADERS"..0x8B85,
        "ACTIVE_UNIFORMS"..0x8B86,
        "ACTIVE_UNIFORM_MAX_LENGTH"..0x8B87,
        "ACTIVE_ATTRIBUTES"..0x8B89,
        "ACTIVE_ATTRIBUTE_MAX_LENGTH"..0x8B8A,
        "SHADING_LANGUAGE_VERSION"..0x8B8C,
        "CURRENT_PROGRAM"..0x8B8D,
        "NEVER"..0x0200,
        "LESS"..0x0201,
        "EQUAL"..0x0202,
        "LEQUAL"..0x0203,
        "GREATER"..0x0204,
        "NOTEQUAL"..0x0205,
        "GEQUAL"..0x0206,
        "ALWAYS"..0x0207,
        "KEEP"..0x1E00,
        "REPLACE"..0x1E01,
        "INCR"..0x1E02,
        "DECR"..0x1E03,
        "INVERT"..0x150A,
        "INCR_WRAP"..0x8507,
        "DECR_WRAP"..0x8508,
        "VENDOR"..0x1F00,
        "RENDERER"..0x1F01,
        "VERSION"..0x1F02,
        "EXTENSIONS"..0x1F03,
        "NEAREST"..0x2600,
        "LINEAR"..0x2601,
        "NEAREST_MIPMAP_NEAREST"..0x2700,
        "LINEAR_MIPMAP_NEAREST"..0x2701,
        "NEAREST_MIPMAP_LINEAR"..0x2702,
        "LINEAR_MIPMAP_LINEAR"..0x2703,
        "TEXTURE_MAG_FILTER"..0x2800,
        "TEXTURE_MIN_FILTER"..0x2801,
        "TEXTURE_WRAP_S"..0x2802,
        "TEXTURE_WRAP_T"..0x2803,
        "TEXTURE"..0x1702,
        "TEXTURE_CUBE_MAP"..0x8513,
        "TEXTURE_BINDING_CUBE_MAP"..0x8514,
        "TEXTURE_CUBE_MAP_POSITIVE_X"..0x8515,
        "TEXTURE_CUBE_MAP_NEGATIVE_X"..0x8516,
        "TEXTURE_CUBE_MAP_POSITIVE_Y"..0x8517,
        "TEXTURE_CUBE_MAP_NEGATIVE_Y"..0x8518,
        "TEXTURE_CUBE_MAP_POSITIVE_Z"..0x8519,
        "TEXTURE_CUBE_MAP_NEGATIVE_Z"..0x851A,
        "MAX_CUBE_MAP_TEXTURE_SIZE"..0x851C,
        "TEXTURE0"..0x84C0,
        "TEXTURE1"..0x84C1,
        "TEXTURE2"..0x84C2,
        "TEXTURE3"..0x84C3,
        "TEXTURE4"..0x84C4,
        "TEXTURE5"..0x84C5,
        "TEXTURE6"..0x84C6,
        "TEXTURE7"..0x84C7,
        "TEXTURE8"..0x84C8,
        "TEXTURE9"..0x84C9,
        "TEXTURE10"..0x84CA,
        "TEXTURE11"..0x84CB,
        "TEXTURE12"..0x84CC,
        "TEXTURE13"..0x84CD,
        "TEXTURE14"..0x84CE,
        "TEXTURE15"..0x84CF,
        "TEXTURE16"..0x84D0,
        "TEXTURE17"..0x84D1,
        "TEXTURE18"..0x84D2,
        "TEXTURE19"..0x84D3,
        "TEXTURE20"..0x84D4,
        "TEXTURE21"..0x84D5,
        "TEXTURE22"..0x84D6,
        "TEXTURE23"..0x84D7,
        "TEXTURE24"..0x84D8,
        "TEXTURE25"..0x84D9,
        "TEXTURE26"..0x84DA,
        "TEXTURE27"..0x84DB,
        "TEXTURE28"..0x84DC,
        "TEXTURE29"..0x84DD,
        "TEXTURE30"..0x84DE,
        "TEXTURE31"..0x84DF,
        "ACTIVE_TEXTURE"..0x84E0,
        "REPEAT"..0x2901,
        "CLAMP_TO_EDGE"..0x812F,
        "MIRRORED_REPEAT"..0x8370,
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
        "SAMPLER_2D"..0x8B5E,
        "SAMPLER_CUBE"..0x8B60,
        "VERTEX_ATTRIB_ARRAY_ENABLED"..0x8622,
        "VERTEX_ATTRIB_ARRAY_SIZE"..0x8623,
        "VERTEX_ATTRIB_ARRAY_STRIDE"..0x8624,
        "VERTEX_ATTRIB_ARRAY_TYPE"..0x8625,
        "VERTEX_ATTRIB_ARRAY_NORMALIZED"..0x886A,
        "VERTEX_ATTRIB_ARRAY_POINTER"..0x8645,
        "VERTEX_ATTRIB_ARRAY_BUFFER_BINDING"..0x889F,
        "IMPLEMENTATION_COLOR_READ_TYPE"..0x8B9A,
        "IMPLEMENTATION_COLOR_READ_FORMAT"..0x8B9B,
        "COMPILE_STATUS"..0x8B81,
        "INFO_LOG_LENGTH"..0x8B84,
        "SHADER_SOURCE_LENGTH"..0x8B88,
        "SHADER_COMPILER"..0x8DFA,
        "SHADER_BINARY_FORMATS"..0x8DF8,
        "NUM_SHADER_BINARY_FORMATS"..0x8DF9,
        "LOW_FLOAT"..0x8DF0,
        "MEDIUM_FLOAT"..0x8DF1,
        "HIGH_FLOAT"..0x8DF2,
        "LOW_INT"..0x8DF3,
        "MEDIUM_INT"..0x8DF4,
        "HIGH_INT"..0x8DF5,
        "FRAMEBUFFER"..0x8D40,
        "RENDERBUFFER"..0x8D41,
        "RGBA4"..0x8056,
        "RGB5_A1"..0x8057,
        "RGB565"..0x8D62,
        "DEPTH_COMPONENT16"..0x81A5,
        "STENCIL_INDEX8"..0x8D48,
        "RENDERBUFFER_WIDTH"..0x8D42,
        "RENDERBUFFER_HEIGHT"..0x8D43,
        "RENDERBUFFER_INTERNAL_FORMAT"..0x8D44,
        "RENDERBUFFER_RED_SIZE"..0x8D50,
        "RENDERBUFFER_GREEN_SIZE"..0x8D51,
        "RENDERBUFFER_BLUE_SIZE"..0x8D52,
        "RENDERBUFFER_ALPHA_SIZE"..0x8D53,
        "RENDERBUFFER_DEPTH_SIZE"..0x8D54,
        "RENDERBUFFER_STENCIL_SIZE"..0x8D55,
        "FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE"..0x8CD0,
        "FRAMEBUFFER_ATTACHMENT_OBJECT_NAME"..0x8CD1,
        "FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL"..0x8CD2,
        "FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE"..0x8CD3,
        "COLOR_ATTACHMENT0"..0x8CE0,
        "DEPTH_ATTACHMENT"..0x8D00,
        "STENCIL_ATTACHMENT"..0x8D20,
        "NONE".."0",
        "FRAMEBUFFER_COMPLETE"..0x8CD5,
        "FRAMEBUFFER_INCOMPLETE_ATTACHMENT"..0x8CD6,
        "FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT"..0x8CD7,
        "FRAMEBUFFER_INCOMPLETE_DIMENSIONS"..0x8CD9,
        "FRAMEBUFFER_UNSUPPORTED"..0x8CDD,
        "FRAMEBUFFER_BINDING"..0x8CA6,
        "RENDERBUFFER_BINDING"..0x8CA7,
        "MAX_RENDERBUFFER_SIZE"..0x84E8,
        "INVALID_FRAMEBUFFER_OPERATION"..0x0506
    )

    void(
        "ActiveTexture",
        "",

        GLenum.IN("texture", "")
    )

    void(
        "AttachShader",
        "",

        GLuint.IN("program", ""),
        GLuint.IN("shader", "")
    )

    void(
        "BindAttribLocation",
        "",

        GLuint.IN("program", ""),
        GLuint.IN("index", ""),
        const..GLcharASCII_p.IN("name", "")
    )

    void(
        "BindBuffer",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("buffer", "")
    )

    void(
        "BindFramebuffer",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("framebuffer", "")
    )

    void(
        "BindRenderbuffer",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("renderbuffer", "")
    )

    void(
        "BindTexture",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("texture", "")
    )

    void(
        "BlendColor",
        "",

        GLfloat.IN("red", ""),
        GLfloat.IN("green", ""),
        GLfloat.IN("blue", ""),
        GLfloat.IN("alpha", "")
    )

    void(
        "BlendEquation",
        "",

        GLenum.IN("mode", "")
    )

    void(
        "BlendEquationSeparate",
        "",

        GLenum.IN("modeRGB", ""),
        GLenum.IN("modeAlpha", "")
    )

    void(
        "BlendFunc",
        "",

        GLenum.IN("sfactor", ""),
        GLenum.IN("dfactor", "")
    )

    void(
        "BlendFuncSeparate",
        "",

        GLenum.IN("sfactorRGB", ""),
        GLenum.IN("dfactorRGB", ""),
        GLenum.IN("sfactorAlpha", ""),
        GLenum.IN("dfactorAlpha", "")
    )

    void(
        "BufferData",
        "",

        GLenum.IN("target", ""),
        AutoSize("data")..GLsizeiptr.IN("size", ""),
        optional..MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT
        )..const..void_p.IN("data", ""),
        GLenum.IN("usage", "")
    )

    void(
        "BufferSubData",
        "",

        GLenum.IN("target", ""),
        GLintptr.IN("offset", ""),
        AutoSize("data")..GLsizeiptr.IN("size", ""),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT
        )..const..void_p.IN("data", "")
    )

    GLenum(
        "CheckFramebufferStatus",
        "",

        GLenum.IN("target", "")
    )

    void(
        "Clear",
        "",

        GLbitfield.IN("mask", "")
    )

    void(
        "ClearColor",
        "",

        GLfloat.IN("red", ""),
        GLfloat.IN("green", ""),
        GLfloat.IN("blue", ""),
        GLfloat.IN("alpha", "")
    )

    void(
        "ClearDepthf",
        "",

        GLfloat.IN("d", "")
    )

    void(
        "ClearStencil",
        "",

        GLint.IN("s", "")
    )

    void(
        "ColorMask",
        "",

        GLboolean.IN("red", ""),
        GLboolean.IN("green", ""),
        GLboolean.IN("blue", ""),
        GLboolean.IN("alpha", "")
    )

    void(
        "CompileShader",
        "",

        GLuint.IN("shader", "")
    )

    void(
        "CompressedTexImage2D",
        "",

        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        GLenum.IN("internalformat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLint.IN("border", ""),
        AutoSize("data")..GLsizei.IN("imageSize", ""),
        PIXEL_UNPACK_BUFFER..nullable..const..void_p.IN("data", "")
    )

    void(
        "CompressedTexSubImage2D",
        "",

        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        GLint.IN("xoffset", ""),
        GLint.IN("yoffset", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLenum.IN("format", ""),
        AutoSize("data")..GLsizei.IN("imageSize", ""),
        PIXEL_UNPACK_BUFFER..const..void_p.IN("data", "")
    )

    void(
        "CopyTexImage2D",
        "",

        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        GLenum.IN("internalformat", ""),
        GLint.IN("x", ""),
        GLint.IN("y", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLint.IN("border", "")
    )

    void(
        "CopyTexSubImage2D",
        "",

        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        GLint.IN("xoffset", ""),
        GLint.IN("yoffset", ""),
        GLint.IN("x", ""),
        GLint.IN("y", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", "")
    )

    GLuint(
        "CreateProgram",
        ""
    )

    GLuint(
        "CreateShader",
        "",

        GLenum.IN("type", "")
    )

    void(
        "CullFace",
        "",

        GLenum.IN("mode", "")
    )

    void(
        "DeleteBuffers",
        "",

        AutoSize("buffers")..GLsizei.IN("n", ""),
        SingleValue("buffer")..const..GLuint_p.IN("buffers", "")
    )

    void(
        "DeleteFramebuffers",
        "",

        AutoSize("framebuffers")..GLsizei.IN("n", ""),
        SingleValue("framebuffer")..const..GLuint_p.IN("framebuffers", "")
    )

    void(
        "DeleteProgram",
        "",

        GLuint.IN("program", "")
    )

    void(
        "DeleteRenderbuffers",
        "",

        AutoSize("renderbuffers")..GLsizei.IN("n", ""),
        SingleValue("renderbuffer")..const..GLuint_p.IN("renderbuffers", "")
    )

    void(
        "DeleteShader",
        "",

        GLuint.IN("shader", "")
    )

    void(
        "DeleteTextures",
        "",

        AutoSize("textures")..GLsizei.IN("n", ""),
        SingleValue("texture")..const..GLuint_p.IN("textures", "")
    )

    void(
        "DepthFunc",
        "",

        GLenum.IN("func", "")
    )

    void(
        "DepthMask",
        "",

        GLboolean.IN("flag", "")
    )

    void(
        "DepthRangef",
        "",

        GLfloat.IN("n", ""),
        GLfloat.IN("f", "")
    )

    void(
        "DetachShader",
        "",

        GLuint.IN("program", ""),
        GLuint.IN("shader", "")
    )

    void(
        "Disable",
        "",

        GLenum.IN("cap", "")
    )

    void(
        "DisableVertexAttribArray",
        "",

        GLuint.IN("index", "")
    )

    void(
        "DrawArrays",
        "",

        GLenum.IN("mode", ""),
        GLint.IN("first", ""),
        GLsizei.IN("count", "")
    )

    void(
        "DrawElements",
        "",

        GLenum.IN("mode", ""),
        AutoSizeShr("GLESChecks.typeToByteShift(type)", "indices")..GLsizei.IN("count", ""),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum.IN("type", ""),
        ELEMENT_ARRAY_BUFFER..const..void_p.IN("indices", "")
    )

    void(
        "Enable",
        "",

        GLenum.IN("cap", "")
    )

    void(
        "EnableVertexAttribArray",
        "",

        GLuint.IN("index", "")
    )

    void(
        "Finish",
        ""
    )

    void(
        "Flush",
        ""
    )

    void(
        "FramebufferRenderbuffer",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("attachment", ""),
        GLenum.IN("renderbuffertarget", ""),
        GLuint.IN("renderbuffer", "")
    )

    void(
        "FramebufferTexture2D",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("attachment", ""),
        GLenum.IN("textarget", ""),
        GLuint.IN("texture", ""),
        GLint.IN("level", "")
    )

    void(
        "FrontFace",
        "",

        GLenum.IN("mode", "")
    )

    void(
        "GenBuffers",
        "",

        AutoSize("buffers")..GLsizei.IN("n", ""),
        ReturnParam..GLuint_p.OUT("buffers", "")
    )

    void(
        "GenerateMipmap",
        "",

        GLenum.IN("target", "")
    )

    void(
        "GenFramebuffers",
        "",

        AutoSize("framebuffers")..GLsizei.IN("n", ""),
        ReturnParam..GLuint_p.OUT("framebuffers", "")
    )

    void(
        "GenRenderbuffers",
        "",

        AutoSize("renderbuffers")..GLsizei.IN("n", ""),
        ReturnParam..GLuint_p.OUT("renderbuffers", "")
    )

    void(
        "GenTextures",
        "",

        AutoSize("textures")..GLsizei.IN("n", ""),
        ReturnParam..GLuint_p.OUT("textures", "")
    )

    void(
        "GetActiveAttrib",
        "",

        GLuint.IN("program", ""),
        GLuint.IN("index", ""),
        AutoSize("name")..GLsizei.IN("bufSize", ""),
        Check(1)..nullable..GLsizei_p.OUT("length", ""),
        Check(1)..GLint_p.OUT("size", ""),
        Check(1)..GLenum_p.OUT("type", ""),
        Return(
            "length",
            "glGetProgrami(program, GL_ACTIVE_ATTRIBUTE_MAX_LENGTH)"
        )..GLcharASCII_p.OUT("name", "")
    )

    void(
        "GetActiveUniform",
        "",

        GLuint.IN("program", ""),
        GLuint.IN("index", ""),
        AutoSize("name")..GLsizei.IN("bufSize", ""),
        Check(1)..nullable..GLsizei_p.OUT("length", ""),
        Check(1)..GLint_p.OUT("size", ""),
        Check(1)..GLenum_p.OUT("type", ""),
        Return(
            "length",
            "glGetProgrami(program, GL_ACTIVE_UNIFORM_MAX_LENGTH)"
        )..GLcharASCII_p.OUT("name", "")
    )

    void(
        "GetAttachedShaders",
        "",

        GLuint.IN("program", ""),
        AutoSize("shaders")..GLsizei.IN("maxCount", ""),
        Check(1)..nullable..GLsizei_p.OUT("count", ""),
        GLuint_p.OUT("shaders", "")
    )

    GLint(
        "GetAttribLocation",
        "",

        GLuint.IN("program", ""),
        const..GLcharASCII_p.IN("name", "")
    )

    void(
        "GetBooleanv",
        "",

        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLboolean_p.OUT("data", "")
    )

    void(
        "GetBufferParameteriv",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLint_p.OUT("params", "")
    )

    GLenum(
        "GetError",
        ""
    )

    void(
        "GetFloatv",
        "",

        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLfloat_p.OUT("data", "")
    )

    void(
        "GetFramebufferAttachmentParameteriv",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("attachment", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLint_p.OUT("params", "")
    )

    void(
        "GetIntegerv",
        "",

        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLint_p.OUT("data", "")
    )

    void(
        "GetProgramiv",
        "",

        GLuint.IN("program", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLint_p.OUT("params", "")
    )

    void(
        "GetProgramInfoLog",
        "",

        GLuint.IN("program", ""),
        AutoSize("infoLog")..GLsizei.IN("bufSize", ""),
        Check(1)..nullable..GLsizei_p.OUT("length", ""),
        Return(
            "length",
            "glGetProgrami(program, GL_INFO_LOG_LENGTH)",
            heapAllocate = true
        )..GLcharUTF8_p.OUT("infoLog", "")
    )

    void(
        "GetRenderbufferParameteriv",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLint_p.OUT("params", "")
    )

    void(
        "GetShaderiv",
        "",

        GLuint.IN("shader", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLint_p.OUT("params", "")
    )

    void(
        "GetShaderInfoLog",
        "",

        GLuint.IN("shader", ""),
        AutoSize("infoLog")..GLsizei.IN("bufSize", ""),
        Check(1)..nullable..GLsizei_p.OUT("length", ""),
        Return(
            "length",
            "glGetShaderi(shader, GL_INFO_LOG_LENGTH)",
            heapAllocate = true
        )..GLcharUTF8_p.OUT("infoLog", "")
    )

    void(
        "GetShaderPrecisionFormat",
        "",

        GLenum.IN("shadertype", ""),
        GLenum.IN("precisiontype", ""),
        Check(2)..GLint_p.OUT("range", ""),
        Check(2)..GLint_p.OUT("precision", "")
    )

    void(
        "GetShaderSource",
        "",

        GLuint.IN("shader", ""),
        AutoSize("source")..GLsizei.IN("bufSize", ""),
        Check(1)..nullable..GLsizei_p.OUT("length", ""),
        Return("length", "glGetShaderi(shader, GL_SHADER_SOURCE_LENGTH)", heapAllocate = true)..GLcharUTF8_p.OUT("source", "")
    )

    GLubyteString(
        "GetString",
        "",

        GLenum.IN("name", "")
    )

    void(
        "GetTexParameterfv",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLfloat_p.OUT("params", "")
    )

    void(
        "GetTexParameteriv",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLint_p.OUT("params", "")
    )

    void(
        "GetUniformfv",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        ReturnParam..Check(1)..GLfloat_p.OUT("params", "")
    )

    void(
        "GetUniformiv",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        ReturnParam..Check(1)..GLint_p.OUT("params", "")
    )

    GLint(
        "GetUniformLocation",
        "",

        GLuint.IN("program", ""),
        const..GLcharASCII_p.IN("name", "")
    )

    void(
        "GetVertexAttribfv",
        "",

        GLuint.IN("index", ""),
        GLenum.IN("pname", ""),
        Check(4)..GLfloat_p.OUT("params", "")
    )

    void(
        "GetVertexAttribiv",
        "",

        GLuint.IN("index", ""),
        GLenum.IN("pname", ""),
        Check(4)..GLint_p.OUT("params", "")
    )

    void(
        "GetVertexAttribPointerv",
        "",

        GLuint.IN("index", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..void_pp.OUT("pointer", "")
    )

    void(
        "Hint",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("mode", "")
    )

    GLboolean(
        "IsBuffer",
        "",

        GLuint.IN("buffer", "")
    )

    GLboolean(
        "IsEnabled",
        "",

        GLenum.IN("cap", "")
    )

    GLboolean(
        "IsFramebuffer",
        "",

        GLuint.IN("framebuffer", "")
    )

    GLboolean(
        "IsProgram",
        "",

        GLuint.IN("program", "")
    )

    GLboolean(
        "IsRenderbuffer",
        "",

        GLuint.IN("renderbuffer", "")
    )

    GLboolean(
        "IsShader",
        "",

        GLuint.IN("shader", "")
    )

    GLboolean(
        "IsTexture",
        "",

        GLuint.IN("texture", "")
    )

    void(
        "LineWidth",
        "",

        GLfloat.IN("width", "")
    )

    void(
        "LinkProgram",
        "",

        GLuint.IN("program", "")
    )

    void(
        "PixelStorei",
        "",

        GLenum.IN("pname", ""),
        GLint.IN("param", "")
    )

    void(
        "PolygonOffset",
        "",

        GLfloat.IN("factor", ""),
        GLfloat.IN("units", "")
    )

    void(
        "ReadPixels",
        "",

        GLint.IN("x", ""),
        GLint.IN("y", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLenum.IN("format", ""),
        GLenum.IN("type", ""),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT
        )..Unsafe..PIXEL_PACK_BUFFER..void_p.OUT("pixels", "")
    )

    void(
        "ReleaseShaderCompiler",
        ""
    )

    void(
        "RenderbufferStorage",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("internalformat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", "")
    )

    void(
        "SampleCoverage",
        "",

        GLfloat.IN("value", ""),
        GLboolean.IN("invert", "")
    )

    void(
        "Scissor",
        "",

        GLint.IN("x", ""),
        GLint.IN("y", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", "")
    )

    void(
        "ShaderBinary",
        "",

        AutoSize("shaders")..GLsizei.IN("count", ""),
        const..GLuint_p.IN("shaders", ""),
        GLenum.IN("binaryformat", ""),
        const..void_p.IN("binary", ""),
        AutoSize("binary")..GLsizei.IN("length", "")
    )

    void(
        "ShaderSource",
        "",

        GLuint.IN("shader", ""),
        AutoSize("string", "length")..GLsizei.IN("count", ""),
        PointerArray(GLcharUTF8_p, "string", "length")..const..GLcharUTF8_p.const.p.IN("string", ""),
        nullable..const..GLint_p.IN("length", "")
    )

    void(
        "StencilFunc",
        "",

        GLenum.IN("func", ""),
        GLint.IN("ref", ""),
        GLuint.IN("mask", "")
    )

    void(
        "StencilFuncSeparate",
        "",

        GLenum.IN("face", ""),
        GLenum.IN("func", ""),
        GLint.IN("ref", ""),
        GLuint.IN("mask", "")
    )

    void(
        "StencilMask",
        "",

        GLuint.IN("mask", "")
    )

    void(
        "StencilMaskSeparate",
        "",

        GLenum.IN("face", ""),
        GLuint.IN("mask", "")
    )

    void(
        "StencilOp",
        "",

        GLenum.IN("fail", ""),
        GLenum.IN("zfail", ""),
        GLenum.IN("zpass", "")
    )

    void(
        "StencilOpSeparate",
        "",

        GLenum.IN("face", ""),
        GLenum.IN("sfail", ""),
        GLenum.IN("dpfail", ""),
        GLenum.IN("dppass", "")
    )

    void(
        "TexImage2D",
        "",

        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        GLint.IN("internalformat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLint.IN("border", ""),
        GLenum.IN("format", ""),
        GLenum.IN("type", ""),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..PIXEL_UNPACK_BUFFER..nullable..const..void_p.IN("pixels", "")
    )

    void(
        "TexParameterf",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        GLfloat.IN("param", "")
    )

    void(
        "TexParameterfv",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        Check(1)..const..GLfloat_p.IN("params", "")
    )

    void(
        "TexParameteri",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        GLint.IN("param", "")
    )

    void(
        "TexParameteriv",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        Check(1)..const..GLint_p.IN("params", "")
    )

    void(
        "TexSubImage2D",
        "",

        GLenum.IN("target", ""),
        GLint.IN("level", ""),
        GLint.IN("xoffset", ""),
        GLint.IN("yoffset", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLenum.IN("format", ""),
        GLenum.IN("type", ""),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..PIXEL_UNPACK_BUFFER..const..void_p.IN("pixels", "")
    )

    void(
        "Uniform1f",
        "",

        GLint.IN("location", ""),
        GLfloat.IN("v0", "")
    )

    void(
        "Uniform1fv",
        "",

        GLint.IN("location", ""),
        AutoSize("value")..GLsizei.IN("count", ""),
        const..GLfloat_p.IN("value", "")
    )

    void(
        "Uniform1i",
        "",

        GLint.IN("location", ""),
        GLint.IN("v0", "")
    )

    void(
        "Uniform1iv",
        "",

        GLint.IN("location", ""),
        AutoSize("value")..GLsizei.IN("count", ""),
        const..GLint_p.IN("value", "")
    )

    void(
        "Uniform2f",
        "",

        GLint.IN("location", ""),
        GLfloat.IN("v0", ""),
        GLfloat.IN("v1", "")
    )

    void(
        "Uniform2fv",
        "",

        GLint.IN("location", ""),
        AutoSize(2, "value")..GLsizei.IN("count", ""),
        const..GLfloat_p.IN("value", "")
    )

    void(
        "Uniform2i",
        "",

        GLint.IN("location", ""),
        GLint.IN("v0", ""),
        GLint.IN("v1", "")
    )

    void(
        "Uniform2iv",
        "",

        GLint.IN("location", ""),
        AutoSize(2, "value")..GLsizei.IN("count", ""),
        const..GLint_p.IN("value", "")
    )

    void(
        "Uniform3f",
        "",

        GLint.IN("location", ""),
        GLfloat.IN("v0", ""),
        GLfloat.IN("v1", ""),
        GLfloat.IN("v2", "")
    )

    void(
        "Uniform3fv",
        "",

        GLint.IN("location", ""),
        AutoSize(3, "value")..GLsizei.IN("count", ""),
        const..GLfloat_p.IN("value", "")
    )

    void(
        "Uniform3i",
        "",

        GLint.IN("location", ""),
        GLint.IN("v0", ""),
        GLint.IN("v1", ""),
        GLint.IN("v2", "")
    )

    void(
        "Uniform3iv",
        "",

        GLint.IN("location", ""),
        AutoSize(3, "value")..GLsizei.IN("count", ""),
        const..GLint_p.IN("value", "")
    )

    void(
        "Uniform4f",
        "",

        GLint.IN("location", ""),
        GLfloat.IN("v0", ""),
        GLfloat.IN("v1", ""),
        GLfloat.IN("v2", ""),
        GLfloat.IN("v3", "")
    )

    void(
        "Uniform4fv",
        "",

        GLint.IN("location", ""),
        AutoSize(4, "value")..GLsizei.IN("count", ""),
        const..GLfloat_p.IN("value", "")
    )

    void(
        "Uniform4i",
        "",

        GLint.IN("location", ""),
        GLint.IN("v0", ""),
        GLint.IN("v1", ""),
        GLint.IN("v2", ""),
        GLint.IN("v3", "")
    )

    void(
        "Uniform4iv",
        "",

        GLint.IN("location", ""),
        AutoSize(4, "value")..GLsizei.IN("count", ""),
        const..GLint_p.IN("value", "")
    )

    void(
        "UniformMatrix2fv",
        "",

        GLint.IN("location", ""),
        AutoSize(2 x 2, "value")..GLsizei.IN("count", ""),
        GLboolean.IN("transpose", ""),
        const..GLfloat_p.IN("value", "")
    )

    void(
        "UniformMatrix3fv",
        "",

        GLint.IN("location", ""),
        AutoSize(3 x 3, "value")..GLsizei.IN("count", ""),
        GLboolean.IN("transpose", ""),
        const..GLfloat_p.IN("value", "")
    )

    void(
        "UniformMatrix4fv",
        "",

        GLint.IN("location", ""),
        AutoSize(4 x 4, "value")..GLsizei.IN("count", ""),
        GLboolean.IN("transpose", ""),
        const..GLfloat_p.IN("value", "")
    )

    void(
        "UseProgram",
        "",

        GLuint.IN("program", "")
    )

    void(
        "ValidateProgram",
        "",

        GLuint.IN("program", "")
    )

    void(
        "VertexAttrib1f",
        "",

        GLuint.IN("index", ""),
        GLfloat.IN("x", "")
    )

    void(
        "VertexAttrib1fv",
        "",

        GLuint.IN("index", ""),
        Check(1)..const..GLfloat_p.IN("v", "")
    )

    void(
        "VertexAttrib2f",
        "",

        GLuint.IN("index", ""),
        GLfloat.IN("x", ""),
        GLfloat.IN("y", "")
    )

    void(
        "VertexAttrib2fv",
        "",

        GLuint.IN("index", ""),
        Check(2)..const..GLfloat_p.IN("v", "")
    )

    void(
        "VertexAttrib3f",
        "",

        GLuint.IN("index", ""),
        GLfloat.IN("x", ""),
        GLfloat.IN("y", ""),
        GLfloat.IN("z", "")
    )

    void(
        "VertexAttrib3fv",
        "",

        GLuint.IN("index", ""),
        Check(3)..const..GLfloat_p.IN("v", "")
    )

    void(
        "VertexAttrib4f",
        "",

        GLuint.IN("index", ""),
        GLfloat.IN("x", ""),
        GLfloat.IN("y", ""),
        GLfloat.IN("z", ""),
        GLfloat.IN("w", "")
    )

    void(
        "VertexAttrib4fv",
        "",

        GLuint.IN("index", ""),
        Check(4)..const..GLfloat_p.IN("v", "")
    )

    OffHeapOnly..void(
        "VertexAttribPointer",
        "",

        GLuint.IN("index", ""),
        GLint.IN("size", ""),
        GLenum.IN("type", ""),
        GLboolean.IN("normalized", ""),
        GLsizei.IN("stride", ""),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..ARRAY_BUFFER..const..void_p.IN("pointer", "")
    )

    void(
        "Viewport",
        "",

        GLint.IN("x", ""),
        GLint.IN("y", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", "")
    )
}