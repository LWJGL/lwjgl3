/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import opengl.BufferType.*

const val CORE_PRIMITIVE_TYPES =
    """
    #POINTS #LINE_STRIP #LINE_LOOP #LINES #TRIANGLE_STRIP #TRIANGLE_FAN #TRIANGLES
    #LINES_ADJACENCY #LINE_STRIP_ADJACENCY #TRIANGLES_ADJACENCY #TRIANGLE_STRIP_ADJACENCY
    #PATCHES
    """

// Table 8.7
const val CORE_PIXEL_DATA_TYPES =
    """
    #UNSIGNED_BYTE #BYTE #UNSIGNED_SHORT #SHORT #UNSIGNED_INT #INT #HALF_FLOAT #FLOAT
    #UNSIGNED_BYTE_3_3_2 #UNSIGNED_BYTE_2_3_3_REV #UNSIGNED_SHORT_5_6_5 #UNSIGNED_SHORT_5_6_5_REV #UNSIGNED_SHORT_4_4_4_4
    #UNSIGNED_SHORT_4_4_4_4_REV #UNSIGNED_SHORT_5_5_5_1 #UNSIGNED_SHORT_1_5_5_5_REV
    #UNSIGNED_INT_8_8_8_8 #UNSIGNED_INT_8_8_8_8_REV #UNSIGNED_INT_10_10_10_2 #UNSIGNED_INT_2_10_10_10_REV #UNSIGNED_INT_24_8
    #UNSIGNED_INT_10F_11F_11F_REV #UNSIGNED_INT_5_9_9_9_REV
    #FLOAT_32_UNSIGNED_INT_24_8_REV
    """

// Table 8.8
const val CORE_PIXEL_DATA_FORMATS =
    """
    #RED #GREEN #BLUE #ALPHA #RG #RGB GL11C#GL_RGBA #BGR #BGRA
    #RED_INTEGER #GREEN_INTEGER #BLUE_INTEGER #ALPHA_INTEGER #RG_INTEGER #RGB_INTEGER #RGBA_INTEGER
    #BGR_INTEGER #BGRA_INTEGER
    #STENCIL_INDEX #DEPTH_COMPONENT #DEPTH_STENCIL
    """

// Tables 8.18, 8.19, 8.20, 8.21, 8.22
const val TEXTURE_INTERNAL_FORMATS =
    """
    #RED #RG #RGB GL11C#GL_RGBA #DEPTH_COMPONENT #DEPTH_STENCIL
    #R8 #R8_SNORM #R16 #R16_SNORM #RG8 #RG8_SNORM #RG16 #RG16_SNORM
    #R3_G3_B2 #RGB4 #RGB5 #RGB565 #RGB8

    #RGB8_SNORM #RGB10 #RGB12 #RGB16 #RGB16_SNORM #RGBA2 #RGBA4 #RGB5_A1 #RGBA8
    #RGBA8_SNORM #RGB10_A2 #RGB10_A2UI #RGBA12 #RGBA16 #RGBA16_SNORM #SRGB8 #SRGB8_ALPHA8 #R16F
    #RG16F #RGB16F #RGBA16F #R32F #RG32F #RGB32F #RGBA32F #R11F_G11F_B10F #RGB9_E5 #R8I
    #R8UI #R16I #R16UI #R32I #R32UI #RG8I #RG8UI #RG16I #RG16UI #RG32I #RG32UI
    #RGB8I #RGB8UI #RGB16I #RGB16UI #RGB32I #RGB32UI #RGBA8I #RGBA8UI #RGBA16I #RGBA16UI
    #RGBA32I #RGBA32UI

    #DEPTH_COMPONENT16 #DEPTH_COMPONENT24 #DEPTH_COMPONENT32 #DEPTH24_STENCIL8 #DEPTH_COMPONENT32F #DEPTH32F_STENCIL8

    $GENERIC_COMPRESSED_TEXTURE_INTERNAL_FORMATS $SPECIFIC_COMPRESSED_TEXTURE_INTERNAL_FORMATS
    """

val GL11C = "GL11C".nativeClassGL("GL11C") {
    documentation =
        """
        The OpenGL functionality of a forward compatible context, up to version 1.1.

        Extensions promoted to core in this release:
        ${ul(
            registryLinkTo("EXT", "vertex_array"),
            registryLinkTo("EXT", "polygon_offset"),
            registryLinkTo("EXT", "blend_logic_op"),
            registryLinkTo("EXT", "texture"),
            registryLinkTo("EXT", "copy_texture"),
            registryLinkTo("EXT", "subtexture"),
            registryLinkTo("EXT", "texture_object")
        )}
        """

    IntConstant(
        "AlphaFunction",
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
        "AttribMask",
        "DEPTH_BUFFER_BIT"..0x00000100,
        "STENCIL_BUFFER_BIT"..0x00000400,
        "COLOR_BUFFER_BIT"..0x00004000
    )

    IntConstant(
        "BeginMode",
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
        "BlendingFactorDest",
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
        "BlendingFactorSrc",
        /*      ZERO */
        /*      ONE */
        "DST_COLOR"..0x0306,
        "ONE_MINUS_DST_COLOR"..0x0307,
        "SRC_ALPHA_SATURATE"..0x0308
    )

    IntConstant(
        "Boolean",
        "TRUE".."1",
        "FALSE".."0"
    )

    IntConstant(
        "DataType",
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
        "DrawBufferMode",
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
        "ErrorCode",
        "NO_ERROR".."0",
        "INVALID_ENUM"..0x0500,
        "INVALID_VALUE"..0x0501,
        "INVALID_OPERATION"..0x0502,
        "STACK_OVERFLOW"..0x0503,
        "STACK_UNDERFLOW"..0x0504,
        "OUT_OF_MEMORY"..0x0505
    )

    IntConstant(
        "FrontFaceDirection",
        "CW"..0x0900,
        "CCW"..0x0901
    )

    IntConstant(
        "GetTarget",
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
        "GetTextureParameter",
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
        "HintMode",
        "DONT_CARE"..0x1100,
        "FASTEST"..0x1101,
        "NICEST"..0x1102
    )

    IntConstant(
        "LogicOp",
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
        "PixelCopyType",
        "COLOR"..0x1800,
        "DEPTH"..0x1801,
        "STENCIL"..0x1802
    )

    IntConstant(
        "PixelFormat",
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
        "PolygonMode",
        "POINT"..0x1B00,
        "LINE"..0x1B01,
        "FILL"..0x1B02
    )

    IntConstant(
        "StencilOp",
        /*      ZERO */
        "KEEP"..0x1E00,
        "REPLACE"..0x1E01,
        "INCR"..0x1E02,
        "DECR"..0x1E03
        /*      INVERT */
    )

    IntConstant(
        "StringName",
        "VENDOR"..0x1F00,
        "RENDERER"..0x1F01,
        "VERSION"..0x1F02,
        "EXTENSIONS"..0x1F03
    )

    IntConstant(
        "TextureMagFilter",
        "NEAREST"..0x2600,
        "LINEAR"..0x2601
    )

    IntConstant(
        "TextureMinFilter",
        /*      NEAREST */
        /*      LINEAR */
        "NEAREST_MIPMAP_NEAREST"..0x2700,
        "LINEAR_MIPMAP_NEAREST"..0x2701,
        "NEAREST_MIPMAP_LINEAR"..0x2702,
        "LINEAR_MIPMAP_LINEAR"..0x2703
    )

    IntConstant(
        "TextureParameterName",
        "TEXTURE_MAG_FILTER"..0x2800,
        "TEXTURE_MIN_FILTER"..0x2801,
        "TEXTURE_WRAP_S"..0x2802,
        "TEXTURE_WRAP_T"..0x2803
        /*      TEXTURE_BORDER_COLOR */
        /*      TEXTURE_PRIORITY */
    )

    IntConstant(
        "TextureWrapMode",
        "REPEAT"..0x2901
    )

    IntConstant(
        "polygon_offset",
        "POLYGON_OFFSET_FACTOR"..0x8038,
        "POLYGON_OFFSET_UNITS"..0x2A00,
        "POLYGON_OFFSET_POINT"..0x2A01,
        "POLYGON_OFFSET_LINE"..0x2A02,
        "POLYGON_OFFSET_FILL"..0x8037
    )

    IntConstant(
        "texture",
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
        "texture_object",
        "TEXTURE_BINDING_1D"..0x8068,
        "TEXTURE_BINDING_2D"..0x8069
    )

    IntConstant(
        "vertex_array",
        "VERTEX_ARRAY"..0x8074
    )

    // Some definitions to be used in the javadocs below

    val COMPARISON_FUNCTIONS = "#NEVER #ALWAYS #LESS #LEQUAL #EQUAL #GEQUAL #GREATER #NOTEQUAL"

    val TEXTURE_PARAMETERS =
        """
        #TEXTURE_BASE_LEVEL #TEXTURE_BORDER_COLOR #TEXTURE_COMPARE_MODE #TEXTURE_COMPARE_FUNC #TEXTURE_LOD_BIAS #TEXTURE_MAG_FILTER
        #TEXTURE_MAX_LEVEL #TEXTURE_MAX_LOD #TEXTURE_MIN_FILTER #TEXTURE_MIN_LOD #TEXTURE_SWIZZLE_R
        #TEXTURE_SWIZZLE_G #TEXTURE_SWIZZLE_B #TEXTURE_SWIZZLE_A #TEXTURE_SWIZZLE_RGBA #TEXTURE_WRAP_S #TEXTURE_WRAP_T
        #TEXTURE_WRAP_R #DEPTH_TEXTURE_MODE #GENERATE_MIPMAP
        """

    // Table 17.2
    val BLENDING_FUNCTIONS =
        """
        #ZERO #ONE #SRC_COLOR #ONE_MINUS_SRC_COLOR #DST_COLOR #ONE_MINUS_DST_COLOR #SRC_ALPHA #ONE_MINUS_SRC_ALPHA #DST_ALPHA
        #ONE_MINUS_DST_ALPHA #CONSTANT_COLOR #ONE_MINUS_CONSTANT_COLOR #CONSTANT_ALPHA #ONE_MINUS_CONSTANT_ALPHA #SRC_ALPHA_SATURATE
        #SRC1_COLOR #ONE_MINUS_SRC1_COLOR #SRC1_ALPHA #ONE_MINUS_SRC1_ALPHA
        """

    // Table 17.4 and 17.5
    val FRAMEBUFFERS =
        "#NONE #FRONT_LEFT #FRONT_RIGHT #BACK_LEFT #BACK_RIGHT #FRONT #BACK #LEFT #RIGHT #FRONT_AND_BACK #COLOR_ATTACHMENT0 GL30.GL_COLOR_ATTACHMENT[1-15]"

    // Functions

    void(
        "Enable",
        "Enables the specified OpenGL state.",

        GLenum.IN("target", "the OpenGL state to enable")
    )

    void(
        "Disable",
        "Disables the specified OpenGL state.",

        GLenum.IN("target", "the OpenGL state to disable")
    )

    void(
        "BindTexture",
        """
        Binds the a texture to a texture target.

        While a texture object is bound, GL operations on the target to which it is bound affect the bound object, and queries of the target to which it is
        bound return state from the bound object. If texture mapping of the dimensionality of the target to which a texture object is bound is enabled, the
        state of the bound texture object directs the texturing operation.
        """,

        GLenum.IN(
            "target",
            "the texture target",
            "#TEXTURE_1D $TEXTURE_2D_TARGETS $TEXTURE_3D_TARGETS #TEXTURE_BUFFER #TEXTURE_2D_MULTISAMPLE #TEXTURE_2D_MULTISAMPLE_ARRAY"
        ),
        GLuint.IN("texture", "the texture object to bind")
    )

    void(
        "BlendFunc",
        "Specifies the weighting factors used by the blend equation, for both RGB and alpha functions and for all draw buffers.",

        GLenum.IN("sfactor", "the source weighting factor", BLENDING_FUNCTIONS),
        GLenum.IN("dfactor", "the destination weighting factor")
    )

    void(
        "Clear",
        """
        Sets portions of every pixel in a particular buffer to the same value. The value to which each buffer is cleared depends on the setting of the clear
        value for that buffer.
        """,

        GLbitfield.IN(
            "mask",
            "Zero or the bitwise OR of one or more values indicating which buffers are to be cleared.",
            "#COLOR_BUFFER_BIT #DEPTH_BUFFER_BIT #STENCIL_BUFFER_BIT", LinkMode.BITFIELD
        )
    )

    void(
        "ClearColor",
        "Sets the clear value for fixed-point and floating-point color buffers in RGBA mode. The specified components are stored as floating-point values.",

        GLfloat.IN("red", "the value to which to clear the R channel of the color buffer"),
        GLfloat.IN("green", "the value to which to clear the G channel of the color buffer"),
        GLfloat.IN("blue", "the value to which to clear the B channel of the color buffer"),
        GLfloat.IN("alpha", "the value to which to clear the A channel of the color buffer")
    )

    void(
        "ClearDepth",
        """
        Sets the depth value used when clearing the depth buffer. When clearing a fixedpoint depth buffer, {@code depth} is clamped to the range [0,1] and
        converted to fixed-point. No conversion is applied when clearing a floating-point depth buffer.
        """,

        GLdouble.IN("depth", "the value to which to clear the depth buffer")
    )

    void(
        "ClearStencil",
        "Sets the value to which to clear the stencil buffer. {@code s} is masked to the number of bitplanes in the stencil buffer.",

        GLint.IN("s", "the value to which to clear the stencil buffer")
    )

    void(
        "ColorMask",
        "Masks the writing of R, G, B and A values to all draw buffers. In the initial state, all color values are enabled for writing for all draw buffers.",

        GLboolean.IN("red", "whether R values are written or not"),
        GLboolean.IN("green", "whether G values are written or not"),
        GLboolean.IN("blue", "whether B values are written or not"),
        GLboolean.IN("alpha", "whether A values are written or not")
    )

    void(
        "CullFace",
        """
        Specifies which polygon faces are culled if #CULL_FACE is enabled. Front-facing polygons are rasterized if either culling is disabled or the
        CullFace mode is #BACK while back-facing polygons are rasterized only if either culling is disabled or the CullFace mode is
        #FRONT. The initial setting of the CullFace mode is #BACK. Initially, culling is disabled.
        """,

        GLenum.IN("mode", "the CullFace mode", "#FRONT #BACK #FRONT_AND_BACK")
    )

    void(
        "DepthFunc",
        "Specifies the comparison that takes place during the depth buffer test (when #DEPTH_TEST is enabled).",

        GLenum.IN("func", "the depth test comparison", "#NEVER #ALWAYS #LESS #LEQUAL #EQUAL #GREATER #GEQUAL #NOTEQUAL")
    )

    void(
        "DepthMask",
        "Masks the writing of depth values to the depth buffer. In the initial state, the depth buffer is enabled for writing.",

        GLboolean.IN("flag", "whether depth values are written or not.")
    )

    void(
        "DepthRange",
        "Sets the depth range for all viewports to the same values.",

        GLdouble.IN("zNear", "the near depth range"),
        GLdouble.IN("zFar", "the far depth range")
    )

    void(
        "DrawArrays",
        """
        Constructs a sequence of geometric primitives by successively transferring elements for {@code count} vertices. Elements {@code first} through
        ${code("first + count &ndash; 1")} of each enabled non-instanced array are transferred to the GL.

        If an array corresponding to an attribute required by a vertex shader is not enabled, then the corresponding element is taken from the current attribute
        state. If an array is enabled, the corresponding current vertex attribute value is unaffected by the execution of this function.
        """,

        GLenum.IN("mode", "the kind of primitives being constructed"),
        GLint.IN("first", "the first vertex to transfer to the GL"),
        GLsizei.IN("count", "the number of vertices after {@code first} to transfer to the GL")
    )

    void(
        "DrawBuffer",
        """
        Defines the color buffer to which fragment color zero is written.

        Acceptable values for {@code buf} depend on whether the GL is using the default framebuffer (i.e., #DRAW_FRAMEBUFFER_BINDING is zero), or
        a framebuffer object (i.e., #DRAW_FRAMEBUFFER_BINDING is non-zero). In the initial state, the GL is bound to the default framebuffer.
        """,

        GLenum.IN("buf", "the color buffer to draw to", FRAMEBUFFERS)
    )

    void(
        "DrawElements",
        """
        Constructs a sequence of geometric primitives by successively transferring elements for {@code count} vertices to the GL.
        The i<sup>th</sup> element transferred by {@code DrawElements} will be taken from element {@code indices[i]} (if no element array buffer is bound), or
        from the element whose index is stored in the currently bound element array buffer at offset {@code indices + i}.
        """,

        GLenum.IN(
            "mode",
            "the kind of primitives being constructed",
            """
            #POINTS #LINE_STRIP #LINE_LOOP #LINES #TRIANGLE_STRIP #TRIANGLE_FAN #TRIANGLES
            #LINES_ADJACENCY #LINE_STRIP_ADJACENCY #TRIANGLES_ADJACENCY #TRIANGLE_STRIP_ADJACENCY #PATCHES
            """
        ),
        AutoSizeShr("GLChecks.typeToByteShift(type)", "indices")..GLsizei.IN("count", "the number of vertices to transfer to the GL"),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum.IN(
            "type",
            "indicates the type of index values in {@code indices}",
            "#UNSIGNED_BYTE #UNSIGNED_SHORT #UNSIGNED_INT"
        ),
        ELEMENT_ARRAY_BUFFER..void.const.p.IN("indices", "the index values")
    )

    void(
        "Finish",
        """
        Forces all previously issued GL commands to complete. {@code Finish} does not return until all effects from such commands on GL client and server
        state and the framebuffer are fully realized.
        """
    )

    void(
        "Flush",
        "Causes all previously issued GL commands to complete in finite time (although such commands may still be executing when {@code Flush} returns)."
    )

    void(
        "FrontFace",
        """
        The first step of polygon rasterization is to determine if the polygon is back-facing or front-facing. This determination is made based on the sign of
        the (clipped or unclipped) polygon's area computed in window coordinates. The interpretation of the sign of this value is controlled with this function.
        In the initial state, the front face direction is set to #CCW.
        """,

        GLenum.IN("dir", "the front face direction", "#CCW #CW")
    )

    void(
        "GenTextures",
        """
        Returns n previously unused texture names in textures. These names are marked as used, for the purposes of GenTextures only, but they acquire texture
        state and a dimensionality only when they are first bound, just as if they were unused.
        """,

        AutoSize("textures")..GLsizei.IN("n", "the number of textures to create"),
        ReturnParam..GLuint.p.OUT("textures", "a scalar or buffer in which to place the returned texture names")
    )

    void(
        "DeleteTextures",
        """
        Deletes texture objects. After a texture object is deleted, it has no contents or dimensionality, and its name is again unused. If a texture that is
        currently bound to any of the target bindings of #BindTexture() is deleted, it is as though #BindTexture() had been executed with the
        same target and texture zero. Additionally, special care must be taken when deleting a texture if any of the images of the texture are attached to a
        framebuffer object.

        Unused names in textures that have been marked as used for the purposes of #GenTextures() are marked as unused again. Unused names in textures are
        silently ignored, as is the name zero.
        """,

        AutoSize("textures")..GLsizei.IN("n", "the number of texture names in the {@code textures} parameter"),
        SingleValue("texture")..GLuint.const.p.IN("textures", "contains {@code n} names of texture objects to be deleted")
    )

    void(
        "GetBooleanv",
        """
        Returns the current boolean value of the specified state variable.

        <b>LWJGL note</b>: The state that corresponds to the state variable may be a single value or an array of values. In the case of an array of values,
        LWJGL will <b>not</b> validate if {@code params} has enough space to store that array. Doing so would introduce significant overhead, as the
        OpenGL state variables are too many. It is the user's responsibility to avoid JVM crashes by ensuring enough space for the returned values.
        """,

        GLenum.IN("pname", "the state variable"),
        Check(1)..ReturnParam..GLboolean.p.OUT("params", "a scalar or buffer in which to place the returned data")
    )

    void(
        "GetFloatv",
        """
        Returns the current float value of the specified state variable.

        <b>LWJGL note</b>: The state that corresponds to the state variable may be a single value or an array of values. In the case of an array of values,
        LWJGL will <b>not</b> validate if {@code params} has enough space to store that array. Doing so would introduce significant overhead, as the
        OpenGL state variables are too many. It is the user's responsibility to avoid JVM crashes by ensuring enough space for the returned values.
        """,

        GLenum.IN("pname", "the state variable"),
        Check(1)..ReturnParam..GLfloat.p.OUT("params", "a scalar or buffer in which to place the returned data")
    )

    void(
        "GetIntegerv",
        """
        Returns the current integer value of the specified state variable.

        <b>LWJGL note</b>: The state that corresponds to the state variable may be a single value or an array of values. In the case of an array of values,
        LWJGL will <b>not</b> validate if {@code params} has enough space to store that array. Doing so would introduce significant overhead, as the
        OpenGL state variables are too many. It is the user's responsibility to avoid JVM crashes by ensuring enough space for the returned values.
        """,

        GLenum.IN("pname", "the state variable"),
        Check(1)..ReturnParam..GLint.p.OUT("params", "a scalar or buffer in which to place the returned data")
    )

    void(
        "GetDoublev",
        """
        Returns the current double value of the specified state variable.

        <b>LWJGL note</b>: The state that corresponds to the state variable may be a single value or an array of values. In the case of an array of values,
        LWJGL will <b>not</b> validate if {@code params} has enough space to store that array. Doing so would introduce significant overhead, as the
        OpenGL state variables are too many. It is the user's responsibility to avoid JVM crashes by ensuring enough space for the returned values.
        """,

        GLenum.IN("pname", "the state variable"),
        Check(1)..ReturnParam..GLdouble.p.OUT("params", "a scalar or buffer in which to place the returned data")
    )

    GLenum(
        "GetError",
        """
        Returns error information. Each detectable error is assigned a numeric code. When an error is detected, a flag is set and the code is recorded. Further
        errors, if they occur, do not affect this recorded code. When {@code GetError} is called, the code is returned and the flag is cleared, so that a
        further error will again record its code. If a call to {@code GetError} returns #NO_ERROR, then there has been no detectable error since
        the last call to {@code GetError} (or since the GL was initialized).
        """
    )

    void(
        "GetPointerv",
        "Returns a pointer in the current GL context.",

        GLenum.IN("pname", "the pointer to return", "#DEBUG_CALLBACK_FUNCTION #DEBUG_CALLBACK_USER_PARAM"),
        Check(1)..ReturnParam..void.p.p.OUT("params", "a buffer in which to place the returned pointer")
    )

    GLubyteUTF8.const.p(
        "GetString",
        "Return strings describing properties of the current GL context.",

        GLenum.IN("name", "the property to query", "#RENDERER #VENDOR #EXTENSIONS #VERSION #SHADING_LANGUAGE_VERSION")
    )

    void(
        "GetTexImage",
        "Obtains texture images.",

        GLenum.IN(
            "tex",
            "the texture (or texture face) to be obtained",
            "#TEXTURE_1D #TEXTURE_2D #TEXTURE_3D #TEXTURE_1D_ARRAY #TEXTURE_2D_ARRAY #TEXTURE_RECTANGLE $CUBE_MAP_FACES"
        ),
        GLint.IN("level", "the level-of-detail number"),
        GLenum.IN("format", "the pixel format", CORE_PIXEL_DATA_FORMATS),
        GLenum.IN("type", "the pixel type", CORE_PIXEL_DATA_TYPES),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..Unsafe..PIXEL_PACK_BUFFER..void.p.OUT("pixels", "the buffer in which to place the returned data")
    )

    void(
        "GetTexLevelParameteriv",
        "Places integer information about texture image parameter {@code pname} for level-of-detail {@code level} of the specified {@code target} into {@code params}.",

        GLenum.IN(
            "target",
            "the texture image target",
            """
            $TEXTURE_2D_TARGETS $PROXY_TEXTURE_2D_TARGETS
            #TEXTURE_1D #TEXTURE_3D #TEXTURE_2D_ARRAY #TEXTURE_CUBE_MAP_ARRAY #TEXTURE_2D_MULTISAMPLE
            #TEXTURE_2D_MULTISAMPLE_ARRAY #PROXY_TEXTURE_1D #PROXY_TEXTURE_3D #PROXY_TEXTURE_2D_ARRAY #PROXY_TEXTURE_CUBE_MAP_ARRAY
            #PROXY_TEXTURE_2D_MULTISAMPLE #PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY
            """
        ),
        GLint.IN("level", "the level-of-detail number"),
        GLenum.IN(
            "pname",
            "the parameter to query",
            """
            #TEXTURE_WIDTH #TEXTURE_HEIGHT #TEXTURE_DEPTH #TEXTURE_SAMPLES #TEXTURE_FIXED_SAMPLE_LOCATIONS
            #TEXTURE_INTERNAL_FORMAT #TEXTURE_RED_SIZE #TEXTURE_GREEN_SIZE #TEXTURE_BLUE_SIZE #TEXTURE_ALPHA_SIZE
            #TEXTURE_DEPTH_SIZE #TEXTURE_STENCIL_SIZE #TEXTURE_SHARED_SIZE
            #TEXTURE_ALPHA_TYPE
            #TEXTURE_DEPTH_TYPE #TEXTURE_COMPRESSED #TEXTURE_COMPRESSED_IMAGE_SIZE
            #TEXTURE_BUFFER_DATA_STORE_BINDING #TEXTURE_BUFFER_OFFSET #TEXTURE_BUFFER_SIZE
            """
        ),
        Check(1)..ReturnParam..GLint.p.OUT("params", "a scalar or buffer in which to place the returned data")
    )

    void(
        "GetTexLevelParameterfv",
        "Float version of #GetTexLevelParameteriv().",

        GLenum.IN("target", "the texture image target"),
        GLint.IN("level", "the level-of-detail number"),
        GLenum.IN("pname", "the parameter to query"),
        Check(1)..ReturnParam..GLfloat.p.OUT("params", "a scalar or buffer in which to place the returned data")
    )

    void(
        "GetTexParameteriv",
        "Place integer information about texture parameter {@code pname} for the specified {@code target} into {@code params}.",

        GLenum.IN(
            "target",
            "the texture target",
            """
            #TEXTURE_1D #TEXTURE_2D #TEXTURE_3D #TEXTURE_1D_ARRAY #TEXTURE_2D_ARRAY #TEXTURE_RECTANGLE #TEXTURE_CUBE_MAP
            #TEXTURE_CUBE_MAP_ARRAY #TEXTURE_2D_MULTISAMPLE #TEXTURE_2D_MULTISAMPLE_ARRAY
            """
        ),
        GLenum.IN(
            "pname",
            "the parameter to query",
            """
            $TEXTURE_PARAMETERS #IMAGE_FORMAT_COMPATIBILITY_TYPE #TEXTURE_IMMUTABLE_FORMAT #TEXTURE_IMMUTABLE_LEVELS #TEXTURE_VIEW_MIN_LEVEL
            #TEXTURE_VIEW_NUM_LEVELS #TEXTURE_VIEW_MIN_LAYER #TEXTURE_VIEW_NUM_LAYERS
            """
        ),
        Check(1)..ReturnParam..GLint.p.OUT("params", "a scalar or buffer in which to place the returned data")
    )

    void(
        "GetTexParameterfv",
        "Float version of #GetTexParameteriv().",

        GLenum.IN("target", "the texture target"),
        GLenum.IN("pname", "the parameter to query"),
        Check(1)..ReturnParam..GLfloat.p.OUT("params", "a scalar or buffer in which to place the returned data")
    )

    void(
        "Hint",
        """
        Certain aspects of GL behavior, when there is room for variation, may be controlled with this function. The initial value for all hints is
        #DONT_CARE.
        """,

        GLenum.IN(
            "target",
            "the behavior to control",
            "#LINE_SMOOTH_HINT #POLYGON_SMOOTH_HINT #TEXTURE_COMPRESSION_HINT #FRAGMENT_SHADER_DERIVATIVE_HINT"
        ),
        GLenum.IN("hint", "the behavior hint", "#FASTEST #NICEST #DONT_CARE")
    )

    GLboolean(
        "IsEnabled",
        "Determines if {@code cap} is currently enabled (as with #Enable()) or disabled.",

        GLenum.IN("cap", "the enable state to query")
    )

    GLboolean(
        "IsTexture",
        "Returns true if {@code texture} is the name of a texture object.",

        GLuint.IN("texture", "the texture name to query")
    )

    void(
        "LineWidth",
        "Sets the width of rasterized line segments. The default width is 1.0.",

        GLfloat.IN("width", "the line width")
    )

    void(
        "LogicOp",
        "Sets the logical framebuffer operation.",

        GLenum.IN(
            "op",
            "the operation to set",
            """
            #CLEAR #AND #AND_REVERSE #COPY #AND_INVERTED #NOOP #XOR #OR #NOR #EQUIV #INVERT #OR_REVERSE #COPY_INVERTED
            #OR_INVERTED #NAND #SET
            """
        )
    )

    void(
        "PixelStorei",
        "Sets the integer value of a pixel store parameter.",

        GLenum.IN(
            "pname",
            "the pixel store parameter to set",
            """
            #UNPACK_SWAP_BYTES #UNPACK_LSB_FIRST #UNPACK_ROW_LENGTH #UNPACK_SKIP_ROWS #UNPACK_SKIP_PIXELS #UNPACK_ALIGNMENT
            #UNPACK_IMAGE_HEIGHT #UNPACK_SKIP_IMAGES #UNPACK_COMPRESSED_BLOCK_WIDTH #UNPACK_COMPRESSED_BLOCK_HEIGHT
            #UNPACK_COMPRESSED_BLOCK_DEPTH #UNPACK_COMPRESSED_BLOCK_SIZE
            """
        ),
        GLint.IN("param", "the parameter value")
    )

    void(
        "PixelStoref",
        "Float version of #PixelStorei().",

        GLenum.IN("pname", "the pixel store parameter to set"),
        GLfloat.IN("param", "the parameter value")
    )

    void(
        "PointSize",
        "Controls the rasterization of points if no vertex, tessellation control, tessellation evaluation, or geometry shader is active. The default point size is 1.0.",

        GLfloat.IN("size", "the request size of a point")
    )

    void(
        "PolygonMode",
        """
        Controls the interpretation of polygons for rasterization.

        #FILL is the default mode of polygon rasterization. Note that these modes affect only the final rasterization of polygons: in particular, a
        polygon's vertices are lit, and the polygon is clipped and possibly culled before these modes are applied. Polygon antialiasing applies only to the
        #FILL state of PolygonMode. For #POINT or #LINE, point antialiasing or line segment antialiasing, respectively, apply.
        """,

        GLenum.IN("face", "the face for which to set the rasterizing method", "#FRONT #BACK #FRONT_AND_BACK"),
        GLenum.IN("mode", "the rasterization mode", "#POINT #LINE #FILL")
    )

    void(
        "PolygonOffset",
        """
        The depth values of all fragments generated by the rasterization of a polygon may be offset by a single value that is computed for that polygon. This
        function determines that value.

        {@code factor} scales the maximum depth slope of the polygon, and {@code units} scales an implementation-dependent constant that relates to the usable
        resolution of the depth buffer. The resulting values are summed to produce the polygon offset value.
        """,

        GLfloat.IN("factor", "the maximum depth slope factor"),
        GLfloat.IN("units", "the constant scale")
    )

    void(
        "ReadBuffer",
        """
        Defines the color buffer from which values are obtained.

        Acceptable values for {@code src} depend on whether the GL is using the default framebuffer (i.e., #DRAW_FRAMEBUFFER_BINDING is zero), or
        a framebuffer object (i.e., #DRAW_FRAMEBUFFER_BINDING is non-zero). In the initial state, the GL is bound to the default framebuffer.
        """,

        GLenum.IN("src", "the color buffer to read from", FRAMEBUFFERS)
    )

    void(
        "ReadPixels",
        """
        ReadPixels obtains values from the selected read buffer from each pixel with lower left hand corner at {@code (x + i, y + j)} for {@code 0 <= i < width}
        and {@code 0 <= j < height}; this pixel is said to be the i<sup>th</sup> pixel in the j<sup>th</sup> row. If any of these pixels lies outside of the
        window allocated to the current GL context, or outside of the image attached to the currently bound read framebuffer object, then the values obtained
        for those pixels are undefined. When #READ_FRAMEBUFFER_BINDING is zero, values are also undefined for individual pixels that are not owned by
        the current context. Otherwise, {@code ReadPixels} obtains values from the selected buffer, regardless of how those values were placed there.
        """,

        GLint.IN("x", "the left pixel coordinate"),
        GLint.IN("y", "the lower pixel coordinate"),
        GLsizei.IN("width", "the number of pixels to read in the x-dimension"),
        GLsizei.IN("height", "the number of pixels to read in the y-dimension"),
        GLenum.IN("format", "the pixel format", CORE_PIXEL_DATA_FORMATS),
        GLenum.IN("type", "the pixel type", CORE_PIXEL_DATA_TYPES),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT
        )..Unsafe..PIXEL_PACK_BUFFER..void.p.OUT("pixels", "a buffer in which to place the returned pixel data")
    )

    void(
        "Scissor",
        """
        Defines the scissor rectangle for all viewports. The scissor test is enabled or disabled for all viewports using #Enable() or #Disable()
        with the symbolic constant #SCISSOR_TEST. When disabled, it is as if the scissor test always passes. When enabled, if
        ${code("left &le; x<sub>w</sub> &lt; left + width")} and ${code("bottom &le; y<sub>w</sub> &lt; bottom + height")} for the scissor rectangle, then the scissor
        test passes. Otherwise, the test fails and the fragment is discarded.
        """,

        GLint.IN("x", "the left scissor rectangle coordinate"),
        GLint.IN("y", "the bottom scissor rectangle coordinate"),
        GLsizei.IN("width", "the scissor rectangle width"),
        GLsizei.IN("height", "the scissor rectangle height")
    )

    void(
        "StencilFunc",
        """
        Controls the stencil test.

        {@code ref} is an integer reference value that is used in the unsigned stencil comparison. Stencil comparison operations and queries of {@code ref}
        clamp its value to the range [0, 2<sup>s</sup> &ndash; 1], where s is the number of bits in the stencil buffer attached to the draw framebuffer. The s
        least significant bits of {@code mask} are bitwise ANDed with both the reference and the stored stencil value, and the resulting masked values are those that
        participate in the comparison controlled by {@code func}.
        """,

        GLenum.IN("func", "the stencil comparison function", COMPARISON_FUNCTIONS),
        GLint.IN("ref", "the reference value"),
        GLuint.IN("mask", "the stencil comparison mask")
    )

    void(
        "StencilMask",
        """
        Masks the writing of particular bits into the stencil plans.

        The least significant s bits of {@code mask}, where s is the number of bits in the stencil buffer, specify an integer mask. Where a 1 appears in this
        mask, the corresponding bit in the stencil buffer is written; where a 0 appears, the bit is not written.
        """,

        GLuint.IN("mask", "the stencil mask")
    )

    void(
        "StencilOp",
        """
        Indicates what happens to the stored stencil value if this or certain subsequent tests fail or pass.

        The supported actions are #KEEP, #ZERO, #REPLACE, #INCR, #DECR, #INVERT,
        #INCR_WRAP and #DECR_WRAP. These correspond to keeping the current value, setting to zero, replacing with the reference value,
        incrementing with saturation, decrementing with saturation, bitwise inverting it, incrementing without saturation, and decrementing without saturation.

        For purposes of increment and decrement, the stencil bits are considered as an unsigned integer. Incrementing or decrementing with saturation clamps
        the stencil value at 0 and the maximum representable value. Incrementing or decrementing without saturation will wrap such that incrementing the maximum
        representable value results in 0, and decrementing 0 results in the maximum representable value.
        """,

        GLenum.IN("sfail", "the action to take if the stencil test fails"),
        GLenum.IN("dpfail", "the action to take if the depth buffer test fails"),
        GLenum.IN("dppass", "the action to take if the depth buffer test passes")
    )

    void(
        "TexImage1D",
        "One-dimensional version of #TexImage2D()}.",

        GLenum.IN("target", "the texture target", "#TEXTURE_1D #PROXY_TEXTURE_1D"),
        GLint.IN("level", "the level-of-detail number"),
        GLint.IN("internalformat", "the texture internal format"),
        GLsizei.IN("width", "the texture width"),
        GLint.IN("border", "the texture border width"),
        GLenum.IN("format", "the texel data format"),
        GLenum.IN("type", "the texel data type"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..PIXEL_UNPACK_BUFFER..nullable..void.const.p.IN("pixels", "the texel data")
    )
    void(
        "TexImage2D",
        "Specifies a two-dimensional texture image.",

        GLenum.IN("target", "the texture target", "$TEXTURE_2D_TARGETS $PROXY_TEXTURE_2D_TARGETS"),
        GLint.IN("level", "the level-of-detail number"),
        GLint.IN("internalformat", "the texture internal format", TEXTURE_INTERNAL_FORMATS),
        GLsizei.IN("width", "the texture width"),
        GLsizei.IN("height", "the texture height"),
        GLint.IN("border", "the texture border width"),
        GLenum.IN("format", "the texel data format", CORE_PIXEL_DATA_FORMATS),
        GLenum.IN("type", "the texel data type", CORE_PIXEL_DATA_TYPES),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..PIXEL_UNPACK_BUFFER..nullable..void.const.p.IN("pixels", "the texel data")
    )

    void(
        "CopyTexImage1D",
        """
        Defines a one-dimensional texel array in exactly the manner of #TexImage1D(), except that the image data are taken from the framebuffer rather
        than from client memory. For the purposes of decoding the texture image, {@code CopyTexImage1D} is equivalent to calling #CopyTexImage2D()
        with corresponding arguments and height of 1, except that the height of the image is always 1, regardless of the value of border. level, internalformat,
        and border are specified using the same values, with the same meanings, as the corresponding arguments of #TexImage1D(). The constraints on
        width and border are exactly those of the corresponding arguments of #TexImage1D().
        """,

        GLenum.IN("target", "the texture target", "#TEXTURE_1D"),
        GLint.IN("level", "the level-of-detail number"),
        GLenum.IN("internalFormat", "the texture internal format. See #TexImage2D() for a list of supported formats."),
        GLint.IN("x", "the left framebuffer pixel coordinate"),
        GLint.IN("y", "the lower framebuffer pixel coordinate"),
        GLsizei.IN("width", "the texture width"),
        GLint.IN("border", "the texture border width")
    )

    void(
        "CopyTexImage2D",
        """
        Defines a two-dimensional texel array in exactly the manner of #TexImage2D(), except that the image data are taken from the framebuffer rather
        than from client memory.

        {@code x}, {@code y}, {@code width}, and {@code height} correspond precisely to the corresponding arguments to #ReadPixels(); they specify the
        image's width and height, and the lower left (x, y) coordinates of the framebuffer region to be copied.

        The image is taken from the framebuffer exactly as if these arguments were passed to #CopyPixels() with argument type set to #COLOR,
        #DEPTH, or #DEPTH_STENCIL, depending on {@code internalformat}. RGBA data is taken from the current color buffer, while depth
        component and stencil index data are taken from the depth and stencil buffers, respectively.

        Subsequent processing is identical to that described for #TexImage2D(), beginning with clamping of the R, G, B, A, or depth values, and masking
        of the stencil index values from the resulting pixel groups. Parameters {@code level}, {@code internalformat}, and {@code border} are specified using
        the same values, with the same meanings, as the corresponding arguments of #TexImage2D().

        The constraints on width, height, and border are exactly those for the corresponding arguments of #TexImage2D().
        """,

        GLenum.IN("target", "the texture target", TEXTURE_2D_TARGETS),
        GLint.IN("level", "the level-of-detail number"),
        GLenum.IN("internalFormat", "the texture internal format. See #TexImage2D() for a list of supported formats."),
        GLint.IN("x", "the left framebuffer pixel coordinate"),
        GLint.IN("y", "the lower framebuffer pixel coordinate"),
        GLsizei.IN("width", "the texture width"),
        GLsizei.IN("height", "the texture height"),
        GLint.IN("border", "the texture border width")
    )

    void(
        "CopyTexSubImage1D",
        """
        Respecifies a rectangular subregion of an existing texel array. No change is made to the {@code internalformat}, {@code width} or {@code border}
        parameters of the specified texel array, nor is any change made to texel values outside the specified subregion. See #CopyTexImage1D() for more
        details.
        """,

        GLenum.IN("target", "the texture target", "#TEXTURE_1D"),
        GLint.IN("level", "the level-of-detail number"),
        GLint.IN("xoffset", "the left texel coordinate of the texture subregion to update"),
        GLint.IN("x", "the left framebuffer pixel coordinate"),
        GLint.IN("y", "the lower framebuffer pixel coordinate"),
        GLsizei.IN("width", "the texture subregion width")
    )

    void(
        "CopyTexSubImage2D",
        """
        Respecifies a rectangular subregion of an existing texel array. No change is made to the {@code internalformat}, {@code width}, {@code height},
        or {@code border} parameters of the specified texel array, nor is any change made to texel values outside the specified subregion. See
        #CopyTexImage2D() for more details.
        """,
        GLenum.IN("target", "the texture target", TEXTURE_2D_TARGETS),
        GLint.IN("level", "the level-of-detail number"),
        GLint.IN("xoffset", "the left texel coordinate of the texture subregion to update"),
        GLint.IN("yoffset", "the lower texel coordinate of the texture subregion to update"),
        GLint.IN("x", "the left framebuffer pixel coordinate"),
        GLint.IN("y", "the lower framebuffer pixel coordinate"),
        GLsizei.IN("width", "the texture subregion width"),
        GLsizei.IN("height", "the texture subregion height")
    )

    void(
        "TexParameteri",
        "Sets the integer value of a texture parameter, which controls how the texel array is treated when specified or changed, and when applied to a fragment.",

        GLenum.IN(
            "target",
            "the texture target",
            """
            #TEXTURE_1D #TEXTURE_2D #TEXTURE_3D #TEXTURE_1D_ARRAY #TEXTURE_2D_ARRAY #TEXTURE_RECTANGLE #TEXTURE_CUBE_MAP
            #TEXTURE_CUBE_MAP_ARRAY #TEXTURE_2D_MULTISAMPLE #TEXTURE_2D_MULTISAMPLE_ARRAY
            """
        ),
        GLenum.IN("pname", "the parameter to set", TEXTURE_PARAMETERS),
        GLint.IN("param", "the parameter value")
    )

    void(
        "TexParameteriv",
        "Pointer version of #TexParameteri().",

        GLenum.IN("target", "the texture target"),
        GLenum.IN("pname", "the parameter to set"),
        Check(4)..GLint.const.p.IN("params", "the parameter value")
    )

    void(
        "TexParameterf",
        "Float version of #TexParameteri().",

        GLenum.IN("target", "the texture target"),
        GLenum.IN("pname", "the parameter to set"),
        GLfloat.IN("param", "the parameter value")
    )

    void(
        "TexParameterfv",
        "Pointer version of #TexParameterf().",

        GLenum.IN("target", "the texture target"),
        GLenum.IN("pname", "the parameter to set"),
        Check(4)..GLfloat.const.p.IN("params", "the parameter value")
    )

    void(
        "TexSubImage1D",
        "One-dimensional version of #TexSubImage2D().",

        GLenum.IN("target", "the texture target", "#TEXTURE_1D"),
        GLint.IN("level", "the level-of-detail-number"),
        GLint.IN("xoffset", "the left coordinate of the texel subregion"),
        GLsizei.IN("width", "the subregion width"),
        GLenum.IN("format", "the pixel data format", CORE_PIXEL_DATA_FORMATS),
        GLenum.IN("type", "the pixel data type", CORE_PIXEL_DATA_TYPES),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..PIXEL_UNPACK_BUFFER..void.const.p.IN("pixels", "the pixel data")
    )

    void(
        "TexSubImage2D",
        """
        Respecifies a rectangular subregion of an existing texel array. No change is made to the internalformat, width, height, depth, or border parameters of
        the specified texel array, nor is any change made to texel values outside the specified subregion.
        """,

        GLenum.IN("target", "the texture target", TEXTURE_2D_TARGETS),
        GLint.IN("level", "the level-of-detail-number"),
        GLint.IN("xoffset", "the left coordinate of the texel subregion"),
        GLint.IN("yoffset", "the bottom coordinate of the texel subregion"),
        GLsizei.IN("width", "the subregion width"),
        GLsizei.IN("height", "the subregion height"),
        GLenum.IN("format", "the pixel data format", CORE_PIXEL_DATA_FORMATS),
        GLenum.IN("type", "the pixel data type", CORE_PIXEL_DATA_TYPES),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..PIXEL_UNPACK_BUFFER..void.const.p.IN("pixels", "the pixel data")
    )

    void(
        "Viewport",
        """
        Specifies the viewport transformation parameters for all viewports.

        The location of the viewport's bottom-left corner, given by {@code (x, y)}, are clamped to be within the implementation-dependent viewport bounds range.
        The viewport bounds range {@code [min, max]} tuple may be determined by calling #GetFloatv() with the symbolic
        constant #VIEWPORT_BOUNDS_RANGE. Viewport width and height are clamped to implementation-dependent maximums when specified. The maximum
        width and height may be found by calling #GetFloatv() with the symbolic constant #MAX_VIEWPORT_DIMS. The
        maximum viewport dimensions must be greater than or equal to the larger of the visible dimensions of the display being rendered to (if a display
        exists), and the largest renderbuffer image which can be successfully created and attached to a framebuffer object.

        In the initial state, {@code w} and {@code h} for each viewport are set to the width and height, respectively, of the window into which the GL is to do
        its rendering. If the default framebuffer is bound but no default framebuffer is associated with the GL context, then {@code w} and {@code h} are
        initially set to zero.
        """,

        GLint.IN("x", "the left viewport coordinate"),
        GLint.IN("y", "the bottom viewport coordinate"),
        GLsizei.IN("w", "the viewport width"),
        GLsizei.IN("h", "the viewport height")
    )
}