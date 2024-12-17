/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import opengl.BufferType.*

val GL11C = "GL11C".nativeClassGL("GL11C") {
    IntConstant(
        "NEVER"..0x0200,
        "LESS"..0x0201,
        "EQUAL"..0x0202,
        "LEQUAL"..0x0203,
        "GREATER"..0x0204,
        "NOTEQUAL"..0x0205,
        "GEQUAL"..0x0206,
        "ALWAYS"..0x0207
    )

    IntConstant(
        "DEPTH_BUFFER_BIT"..0x00000100,
        "STENCIL_BUFFER_BIT"..0x00000400,
        "COLOR_BUFFER_BIT"..0x00004000
    )

    IntConstant(
        "POINTS"..0x0000,
        "LINES"..0x0001,
        "LINE_LOOP"..0x0002,
        "LINE_STRIP"..0x0003,
        "TRIANGLES"..0x0004,
        "TRIANGLE_STRIP"..0x0005,
        "TRIANGLE_FAN"..0x0006,
        "QUADS"..0x0007
    )

    IntConstant(
        "ZERO".."0",
        "ONE".."1",
        "SRC_COLOR"..0x0300,
        "ONE_MINUS_SRC_COLOR"..0x0301,
        "SRC_ALPHA"..0x0302,
        "ONE_MINUS_SRC_ALPHA"..0x0303,
        "DST_ALPHA"..0x0304,
        "ONE_MINUS_DST_ALPHA"..0x0305
    )

    IntConstant(
        /*      ZERO */
        /*      ONE */
        "DST_COLOR"..0x0306,
        "ONE_MINUS_DST_COLOR"..0x0307,
        "SRC_ALPHA_SATURATE"..0x0308
    )

    IntConstant(
        "TRUE".."1",
        "FALSE".."0"
    )

    IntConstant(
        "BYTE"..0x1400,
        "UNSIGNED_BYTE"..0x1401,
        "SHORT"..0x1402,
        "UNSIGNED_SHORT"..0x1403,
        "INT"..0x1404,
        "UNSIGNED_INT"..0x1405,
        "FLOAT"..0x1406,
        "DOUBLE"..0x140A
    )

    IntConstant(
        "NONE".."0",
        "FRONT_LEFT"..0x0400,
        "FRONT_RIGHT"..0x0401,
        "BACK_LEFT"..0x0402,
        "BACK_RIGHT"..0x0403,
        "FRONT"..0x0404,
        "BACK"..0x0405,
        "LEFT"..0x0406,
        "RIGHT"..0x0407,
        "FRONT_AND_BACK"..0x0408
    )

    IntConstant(
        "NO_ERROR".."0",
        "INVALID_ENUM"..0x0500,
        "INVALID_VALUE"..0x0501,
        "INVALID_OPERATION"..0x0502,
        "STACK_OVERFLOW"..0x0503,
        "STACK_UNDERFLOW"..0x0504,
        "OUT_OF_MEMORY"..0x0505
    )

    IntConstant(
        "CW"..0x0900,
        "CCW"..0x0901
    )

    IntConstant(
        "POINT_SIZE"..0x0B11,
        "POINT_SIZE_RANGE"..0x0B12,
        "POINT_SIZE_GRANULARITY"..0x0B13,
        "LINE_SMOOTH"..0x0B20,
        "LINE_WIDTH"..0x0B21,
        "LINE_WIDTH_RANGE"..0x0B22,
        "LINE_WIDTH_GRANULARITY"..0x0B23,
        "POLYGON_MODE"..0x0B40,
        "POLYGON_SMOOTH"..0x0B41,
        "CULL_FACE"..0x0B44,
        "CULL_FACE_MODE"..0x0B45,
        "FRONT_FACE"..0x0B46,
        "DEPTH_RANGE"..0x0B70,
        "DEPTH_TEST"..0x0B71,
        "DEPTH_WRITEMASK"..0x0B72,
        "DEPTH_CLEAR_VALUE"..0x0B73,
        "DEPTH_FUNC"..0x0B74,
        "STENCIL_TEST"..0x0B90,
        "STENCIL_CLEAR_VALUE"..0x0B91,
        "STENCIL_FUNC"..0x0B92,
        "STENCIL_VALUE_MASK"..0x0B93,
        "STENCIL_FAIL"..0x0B94,
        "STENCIL_PASS_DEPTH_FAIL"..0x0B95,
        "STENCIL_PASS_DEPTH_PASS"..0x0B96,
        "STENCIL_REF"..0x0B97,
        "STENCIL_WRITEMASK"..0x0B98,
        "VIEWPORT"..0x0BA2,
        "DITHER"..0x0BD0,
        "BLEND_DST"..0x0BE0,
        "BLEND_SRC"..0x0BE1,
        "BLEND"..0x0BE2,
        "LOGIC_OP_MODE"..0x0BF0,
        "COLOR_LOGIC_OP"..0x0BF2,
        "DRAW_BUFFER"..0x0C01,
        "READ_BUFFER"..0x0C02,
        "SCISSOR_BOX"..0x0C10,
        "SCISSOR_TEST"..0x0C11,
        "COLOR_CLEAR_VALUE"..0x0C22,
        "COLOR_WRITEMASK"..0x0C23,
        "DOUBLEBUFFER"..0x0C32,
        "STEREO"..0x0C33,
        "LINE_SMOOTH_HINT"..0x0C52,
        "POLYGON_SMOOTH_HINT"..0x0C53,
        "UNPACK_SWAP_BYTES"..0x0CF0,
        "UNPACK_LSB_FIRST"..0x0CF1,
        "UNPACK_ROW_LENGTH"..0x0CF2,
        "UNPACK_SKIP_ROWS"..0x0CF3,
        "UNPACK_SKIP_PIXELS"..0x0CF4,
        "UNPACK_ALIGNMENT"..0x0CF5,
        "PACK_SWAP_BYTES"..0x0D00,
        "PACK_LSB_FIRST"..0x0D01,
        "PACK_ROW_LENGTH"..0x0D02,
        "PACK_SKIP_ROWS"..0x0D03,
        "PACK_SKIP_PIXELS"..0x0D04,
        "PACK_ALIGNMENT"..0x0D05,
        "MAX_TEXTURE_SIZE"..0x0D33,
        "MAX_VIEWPORT_DIMS"..0x0D3A,
        "SUBPIXEL_BITS"..0x0D50,
        "TEXTURE_1D"..0x0DE0,
        "TEXTURE_2D"..0x0DE1
    )

    IntConstant(
        /*      TEXTURE_MAG_FILTER */
        /*      TEXTURE_MIN_FILTER */
        /*      TEXTURE_WRAP_S */
        /*      TEXTURE_WRAP_T */
        "TEXTURE_WIDTH"..0x1000,
        "TEXTURE_HEIGHT"..0x1001,
        "TEXTURE_INTERNAL_FORMAT"..0x1003,
        "TEXTURE_BORDER_COLOR"..0x1004
        /*      TEXTURE_RED_SIZE */
        /*      TEXTURE_GREEN_SIZE */
        /*      TEXTURE_BLUE_SIZE */
        /*      TEXTURE_ALPHA_SIZE */
    )

    IntConstant(
        "DONT_CARE"..0x1100,
        "FASTEST"..0x1101,
        "NICEST"..0x1102
    )

    IntConstant(
        "CLEAR"..0x1500,
        "AND"..0x1501,
        "AND_REVERSE"..0x1502,
        "COPY"..0x1503,
        "AND_INVERTED"..0x1504,
        "NOOP"..0x1505,
        "XOR"..0x1506,
        "OR"..0x1507,
        "NOR"..0x1508,
        "EQUIV"..0x1509,
        "INVERT"..0x150A,
        "OR_REVERSE"..0x150B,
        "COPY_INVERTED"..0x150C,
        "OR_INVERTED"..0x150D,
        "NAND"..0x150E,
        "SET"..0x150F
    )

    IntConstant(
        "TEXTURE"..0x1702
    )

    IntConstant(
        "COLOR"..0x1800,
        "DEPTH"..0x1801,
        "STENCIL"..0x1802
    )

    IntConstant(
        "STENCIL_INDEX"..0x1901,
        "DEPTH_COMPONENT"..0x1902,
        "RED"..0x1903,
        "GREEN"..0x1904,
        "BLUE"..0x1905,
        "ALPHA"..0x1906,
        "RGB"..0x1907,
        "RGBA"..0x1908
    )

    IntConstant(
        "POINT"..0x1B00,
        "LINE"..0x1B01,
        "FILL"..0x1B02
    )

    IntConstant(
        /*      ZERO */
        "KEEP"..0x1E00,
        "REPLACE"..0x1E01,
        "INCR"..0x1E02,
        "DECR"..0x1E03
        /*      INVERT */
    )

    IntConstant(
        "VENDOR"..0x1F00,
        "RENDERER"..0x1F01,
        "VERSION"..0x1F02,
        "EXTENSIONS"..0x1F03
    )

    IntConstant(
        "NEAREST"..0x2600,
        "LINEAR"..0x2601
    )

    IntConstant(
        /*      NEAREST */
        /*      LINEAR */
        "NEAREST_MIPMAP_NEAREST"..0x2700,
        "LINEAR_MIPMAP_NEAREST"..0x2701,
        "NEAREST_MIPMAP_LINEAR"..0x2702,
        "LINEAR_MIPMAP_LINEAR"..0x2703
    )

    IntConstant(
        "TEXTURE_MAG_FILTER"..0x2800,
        "TEXTURE_MIN_FILTER"..0x2801,
        "TEXTURE_WRAP_S"..0x2802,
        "TEXTURE_WRAP_T"..0x2803
        /*      TEXTURE_BORDER_COLOR */
        /*      TEXTURE_PRIORITY */
    )

    IntConstant(
        "REPEAT"..0x2901
    )

    IntConstant(
        "POLYGON_OFFSET_FACTOR"..0x8038,
        "POLYGON_OFFSET_UNITS"..0x2A00,
        "POLYGON_OFFSET_POINT"..0x2A01,
        "POLYGON_OFFSET_LINE"..0x2A02,
        "POLYGON_OFFSET_FILL"..0x8037
    )

    IntConstant(
        "R3_G3_B2"..0x2A10,
        "RGB4"..0x804F,
        "RGB5"..0x8050,
        "RGB8"..0x8051,
        "RGB10"..0x8052,
        "RGB12"..0x8053,
        "RGB16"..0x8054,
        "RGBA2"..0x8055,
        "RGBA4"..0x8056,
        "RGB5_A1"..0x8057,
        "RGBA8"..0x8058,
        "RGB10_A2"..0x8059,
        "RGBA12"..0x805A,
        "RGBA16"..0x805B,
        "TEXTURE_RED_SIZE"..0x805C,
        "TEXTURE_GREEN_SIZE"..0x805D,
        "TEXTURE_BLUE_SIZE"..0x805E,
        "TEXTURE_ALPHA_SIZE"..0x805F,
        "PROXY_TEXTURE_1D"..0x8063,
        "PROXY_TEXTURE_2D"..0x8064
    )

    IntConstant(
        "TEXTURE_BINDING_1D"..0x8068,
        "TEXTURE_BINDING_2D"..0x8069
    )

    IntConstant(
        "VERTEX_ARRAY"..0x8074
    )

    // Functions

    void(
        "Enable",

        GLenum("target")
    )

    void(
        "Disable",

        GLenum("target")
    )

    void(
        "BindTexture",

        GLenum("target"),
        GLuint("texture")
    )

    void(
        "BlendFunc",

        GLenum("sfactor"),
        GLenum("dfactor")
    )

    void(
        "Clear",

        GLbitfield("mask")
    )

    void(
        "ClearColor",

        GLfloat("red"),
        GLfloat("green"),
        GLfloat("blue"),
        GLfloat("alpha")
    )

    void(
        "ClearDepth",

        GLdouble("depth")
    )

    void(
        "ClearStencil",

        GLint("s")
    )

    void(
        "ColorMask",

        GLboolean("red"),
        GLboolean("green"),
        GLboolean("blue"),
        GLboolean("alpha")
    )

    void(
        "CullFace",

        GLenum("mode")
    )

    void(
        "DepthFunc",

        GLenum("func")
    )

    void(
        "DepthMask",

        GLboolean("flag")
    )

    void(
        "DepthRange",

        GLdouble("zNear"),
        GLdouble("zFar")
    )

    void(
        "DrawArrays",

        GLenum("mode"),
        GLint("first"),
        GLsizei("count")
    )

    void(
        "DrawBuffer",

        GLenum("buf")
    )

    void(
        "DrawElements",

        GLenum("mode"),
        AutoSizeShr("GLChecks.typeToByteShift(type)", "indices")..GLsizei("count"),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum("type"),
        RawPointer..void.const.p("indices")
    )

    void("Finish")

    void("Flush")

    void(
        "FrontFace",

        GLenum("dir")
    )

    void(
        "GenTextures",

        AutoSize("textures")..GLsizei("n"),
        ReturnParam..GLuint.p("textures")
    )

    void(
        "DeleteTextures",

        AutoSize("textures")..GLsizei("n"),
        SingleValue("texture")..GLuint.const.p("textures")
    )

    void(
        "GetBooleanv",

        GLenum("pname"),
        Check(1)..ReturnParam..GLboolean.p("params")
    )

    void(
        "GetFloatv",

        GLenum("pname"),
        Check(1)..ReturnParam..GLfloat.p("params")
    )

    void(
        "GetIntegerv",

        GLenum("pname"),
        Check(1)..ReturnParam..GLint.p("params")
    )

    void(
        "GetDoublev",

        GLenum("pname"),
        Check(1)..ReturnParam..GLdouble.p("params")
    )

    GLenum(
        "GetError",
        void()
    )

    void(
        "GetPointerv",

        GLenum("pname"),
        Check(1)..ReturnParam..void.p.p("params")
    )

    GLubyteUTF8.const.p(
        "GetString",

        GLenum("name")
    )

    void(
        "GetTexImage",

        GLenum("tex"),
        GLint("level"),
        GLenum("format"),
        GLenum("type"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..Unsafe..RawPointer..void.p("pixels")
    )

    void(
        "GetTexLevelParameteriv",

        GLenum("target"),
        GLint("level"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLint.p("params")
    )

    void(
        "GetTexLevelParameterfv",

        GLenum("target"),
        GLint("level"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLfloat.p("params")
    )

    void(
        "GetTexParameteriv",

        GLenum("target"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLint.p("params")
    )

    void(
        "GetTexParameterfv",

        GLenum("target"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLfloat.p("params")
    )

    void(
        "Hint",

        GLenum("target"),
        GLenum("hint")
    )

    GLboolean(
        "IsEnabled",

        GLenum("cap")
    )

    GLboolean(
        "IsTexture",

        GLuint("texture")
    )

    void(
        "LineWidth",

        GLfloat("width")
    )

    void(
        "LogicOp",

        GLenum("op")
    )

    void(
        "PixelStorei",

        GLenum("pname"),
        GLint("param")
    )

    void(
        "PixelStoref",

        GLenum("pname"),
        GLfloat("param")
    )

    void(
        "PointSize",

        GLfloat("size")
    )

    void(
        "PolygonMode",

        GLenum("face"),
        GLenum("mode")
    )

    void(
        "PolygonOffset",

        GLfloat("factor"),
        GLfloat("units")
    )

    void(
        "ReadBuffer",

        GLenum("src")
    )

    void(
        "ReadPixels",

        GLint("x"),
        GLint("y"),
        GLsizei("width"),
        GLsizei("height"),
        GLenum("format"),
        GLenum("type"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT
        )..Unsafe..RawPointer..void.p("pixels")
    )

    void(
        "Scissor",

        GLint("x"),
        GLint("y"),
        GLsizei("width"),
        GLsizei("height")
    )

    void(
        "StencilFunc",

        GLenum("func"),
        GLint("ref"),
        GLuint("mask")
    )

    void(
        "StencilMask",

        GLuint("mask")
    )

    void(
        "StencilOp",

        GLenum("sfail"),
        GLenum("dpfail"),
        GLenum("dppass")
    )

    void(
        "TexImage1D",

        GLenum("target"),
        GLint("level"),
        GLint("internalformat"),
        GLsizei("width"),
        GLint("border"),
        GLenum("format"),
        GLenum("type"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..RawPointer..nullable..void.const.p("pixels")
    )
    void(
        "TexImage2D",

        GLenum("target"),
        GLint("level"),
        GLint("internalformat"),
        GLsizei("width"),
        GLsizei("height"),
        GLint("border"),
        GLenum("format"),
        GLenum("type"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..RawPointer..nullable..void.const.p("pixels")
    )

    void(
        "CopyTexImage1D",

        GLenum("target"),
        GLint("level"),
        GLenum("internalFormat"),
        GLint("x"),
        GLint("y"),
        GLsizei("width"),
        GLint("border")
    )

    void(
        "CopyTexImage2D",

        GLenum("target"),
        GLint("level"),
        GLenum("internalFormat"),
        GLint("x"),
        GLint("y"),
        GLsizei("width"),
        GLsizei("height"),
        GLint("border")
    )

    void(
        "CopyTexSubImage1D",

        GLenum("target"),
        GLint("level"),
        GLint("xoffset"),
        GLint("x"),
        GLint("y"),
        GLsizei("width")
    )

    void(
        "CopyTexSubImage2D",
        GLenum("target"),
        GLint("level"),
        GLint("xoffset"),
        GLint("yoffset"),
        GLint("x"),
        GLint("y"),
        GLsizei("width"),
        GLsizei("height")
    )

    void(
        "TexParameteri",

        GLenum("target"),
        GLenum("pname"),
        GLint("param")
    )

    void(
        "TexParameteriv",

        GLenum("target"),
        GLenum("pname"),
        Check(4)..GLint.const.p("params")
    )

    void(
        "TexParameterf",

        GLenum("target"),
        GLenum("pname"),
        GLfloat("param")
    )

    void(
        "TexParameterfv",

        GLenum("target"),
        GLenum("pname"),
        Check(4)..GLfloat.const.p("params")
    )

    void(
        "TexSubImage1D",

        GLenum("target"),
        GLint("level"),
        GLint("xoffset"),
        GLsizei("width"),
        GLenum("format"),
        GLenum("type"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..RawPointer..void.const.p("pixels")
    )

    void(
        "TexSubImage2D",

        GLenum("target"),
        GLint("level"),
        GLint("xoffset"),
        GLint("yoffset"),
        GLsizei("width"),
        GLsizei("height"),
        GLenum("format"),
        GLenum("type"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..RawPointer..void.const.p("pixels")
    )

    void(
        "Viewport",

        GLint("x"),
        GLint("y"),
        GLsizei("w"),
        GLsizei("h")
    )
}