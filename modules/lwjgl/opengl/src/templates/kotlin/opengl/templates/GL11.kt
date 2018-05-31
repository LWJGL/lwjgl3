/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import opengl.BufferType.*

const val PRIMITIVE_TYPES = "$CORE_PRIMITIVE_TYPES #POLYGON #QUADS #QUAD_STRIP"

// Table 8.26
const val CUBE_MAP_FACES =
    """
    #TEXTURE_CUBE_MAP_POSITIVE_X #TEXTURE_CUBE_MAP_NEGATIVE_X
    #TEXTURE_CUBE_MAP_POSITIVE_Y #TEXTURE_CUBE_MAP_NEGATIVE_Y
    #TEXTURE_CUBE_MAP_POSITIVE_Z #TEXTURE_CUBE_MAP_NEGATIVE_Z
    """

const val TEXTURE_2D_TARGETS = "#TEXTURE_2D #TEXTURE_1D_ARRAY #TEXTURE_RECTANGLE #TEXTURE_CUBE_MAP"
const val TEXTURE_2D_FACE_TARGETS = "#TEXTURE_2D #TEXTURE_1D_ARRAY $CUBE_MAP_FACES"
const val PROXY_TEXTURE_2D_TARGETS = "#PROXY_TEXTURE_2D #PROXY_TEXTURE_1D_ARRAY #PROXY_TEXTURE_RECTANGLE #PROXY_TEXTURE_CUBE_MAP"

const val TEXTURE_3D_TARGETS = "#TEXTURE_3D #TEXTURE_2D_ARRAY #TEXTURE_CUBE_MAP_ARRAY"
const val PROXY_TEXTURE_3D_TARGETS = "#PROXY_TEXTURE_3D #PROXY_TEXTURE_2D_ARRAY #PROXY_TEXTURE_CUBE_MAP_ARRAY"

const val PIXEL_DATA_TYPES = "$CORE_PIXEL_DATA_TYPES #BITMAP"
const val PIXEL_DATA_FORMATS = "$CORE_PIXEL_DATA_FORMATS #LUMINANCE #LUMINANCE_ALPHA"

// Table 8.22
const val GENERIC_COMPRESSED_TEXTURE_INTERNAL_FORMATS =
    "#COMPRESSED_RED #COMPRESSED_RG #COMPRESSED_RGB #COMPRESSED_RGBA #COMPRESSED_SRGB #COMPRESSED_SRGB_ALPHA"

const val SPECIFIC_COMPRESSED_TEXTURE_INTERNAL_FORMATS =
    """
    #COMPRESSED_RED_RGTC1 #COMPRESSED_SIGNED_RED_RGTC1 #COMPRESSED_RG_RGTC2 #COMPRESSED_SIGNED_RG_RGTC2
    #COMPRESSED_RGBA_BPTC_UNORM #COMPRESSED_SRGB_ALPHA_BPTC_UNORM #COMPRESSED_RGB_BPTC_SIGNED_FLOAT #COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT

    #COMPRESSED_RGB8_ETC2 #COMPRESSED_SRGB8_ETC2 #COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2
    #COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 #COMPRESSED_RGBA8_ETC2_EAC #COMPRESSED_SRGB8_ALPHA8_ETC2_EAC #COMPRESSED_R11_EAC
    #COMPRESSED_SIGNED_R11_EAC #COMPRESSED_RG11_EAC #COMPRESSED_SIGNED_RG11_EAC

    @##EXTTextureCompressionS3TC @##EXTTextureCompressionLATC @##ATITextureCompression3DC
    """

// Error codes
const val INVALID_ENUM = "#INVALID_ENUM"
const val INVALID_VALUE = "#INVALID_VALUE"
const val INVALID_OPERATION = "#INVALID_OPERATION"
const val STACK_OVERFLOW = "#STACK_OVERFLOW"
const val STACK_UNDERFLOW = "#STACK_UNDERFLOW"
const val OUT_OF_MEMORY = "#OUT_OF_MEMORY"
const val INVALID_FRAMEBUFFER_OPERATION = "#INVALID_FRAMEBUFFER_OPERATION"

val GL11 = "GL11".nativeClassGL("GL11") {
    documentation =
        """
        The OpenGL functionality up to version 1.1. Includes the deprecated symbols of the Compatibility Profile.

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
        "AccumOp",
        "ACCUM"..0x0100,
        "LOAD"..0x0101,
        "RETURN"..0x0102,
        "MULT"..0x0103,
        "ADD"..0x0104
    )

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
        "CURRENT_BIT"..0x00000001,
        "POINT_BIT"..0x00000002,
        "LINE_BIT"..0x00000004,
        "POLYGON_BIT"..0x00000008,
        "POLYGON_STIPPLE_BIT"..0x00000010,
        "PIXEL_MODE_BIT"..0x00000020,
        "LIGHTING_BIT"..0x00000040,
        "FOG_BIT"..0x00000080,
        "DEPTH_BUFFER_BIT"..0x00000100,
        "ACCUM_BUFFER_BIT"..0x00000200,
        "STENCIL_BUFFER_BIT"..0x00000400,
        "VIEWPORT_BIT"..0x00000800,
        "TRANSFORM_BIT"..0x00001000,
        "ENABLE_BIT"..0x00002000,
        "COLOR_BUFFER_BIT"..0x00004000,
        "HINT_BIT"..0x00008000,
        "EVAL_BIT"..0x00010000,
        "LIST_BIT"..0x00020000,
        "TEXTURE_BIT"..0x00040000,
        "SCISSOR_BIT"..0x00080000,
        "ALL_ATTRIB_BITS"..0x000fffff
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
        "QUADS"..0x0007,
        "QUAD_STRIP"..0x0008,
        "POLYGON"..0x0009
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
        "ClipPlaneName",
        "CLIP_PLANE0"..0x3000,
        "CLIP_PLANE1"..0x3001,
        "CLIP_PLANE2"..0x3002,
        "CLIP_PLANE3"..0x3003,
        "CLIP_PLANE4"..0x3004,
        "CLIP_PLANE5"..0x3005
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
        "2_BYTES"..0x1407,
        "3_BYTES"..0x1408,
        "4_BYTES"..0x1409,
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
        "FRONT_AND_BACK"..0x0408,
        "AUX0"..0x0409,
        "AUX1"..0x040A,
        "AUX2"..0x040B,
        "AUX3"..0x040C
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
        "FeedBackMode",
        "2D"..0x0600,
        "3D"..0x0601,
        "3D_COLOR"..0x0602,
        "3D_COLOR_TEXTURE"..0x0603,
        "4D_COLOR_TEXTURE"..0x0604
    )

    IntConstant(
        "FeedBackToken",
        "PASS_THROUGH_TOKEN"..0x0700,
        "POINT_TOKEN"..0x0701,
        "LINE_TOKEN"..0x0702,
        "POLYGON_TOKEN"..0x0703,
        "BITMAP_TOKEN"..0x0704,
        "DRAW_PIXEL_TOKEN"..0x0705,
        "COPY_PIXEL_TOKEN"..0x0706,
        "LINE_RESET_TOKEN"..0x0707
    )

    IntConstant(
        "FogMode",
        /*      LINEAR */
        "EXP"..0x0800,
        "EXP2"..0x0801
    )

    IntConstant(
        "FrontFaceDirection",
        "CW"..0x0900,
        "CCW"..0x0901
    )

    IntConstant(
        "GetMapTarget",
        "COEFF"..0x0A00,
        "ORDER"..0x0A01,
        "DOMAIN"..0x0A02
    )

    IntConstant(
        "GetTarget",
        "CURRENT_COLOR"..0x0B00,
        "CURRENT_INDEX"..0x0B01,
        "CURRENT_NORMAL"..0x0B02,
        "CURRENT_TEXTURE_COORDS"..0x0B03,
        "CURRENT_RASTER_COLOR"..0x0B04,
        "CURRENT_RASTER_INDEX"..0x0B05,
        "CURRENT_RASTER_TEXTURE_COORDS"..0x0B06,
        "CURRENT_RASTER_POSITION"..0x0B07,
        "CURRENT_RASTER_POSITION_VALID"..0x0B08,
        "CURRENT_RASTER_DISTANCE"..0x0B09,
        "POINT_SMOOTH"..0x0B10,
        "POINT_SIZE"..0x0B11,
        "POINT_SIZE_RANGE"..0x0B12,
        "POINT_SIZE_GRANULARITY"..0x0B13,
        "LINE_SMOOTH"..0x0B20,
        "LINE_WIDTH"..0x0B21,
        "LINE_WIDTH_RANGE"..0x0B22,
        "LINE_WIDTH_GRANULARITY"..0x0B23,
        "LINE_STIPPLE"..0x0B24,
        "LINE_STIPPLE_PATTERN"..0x0B25,
        "LINE_STIPPLE_REPEAT"..0x0B26,
        "LIST_MODE"..0x0B30,
        "MAX_LIST_NESTING"..0x0B31,
        "LIST_BASE"..0x0B32,
        "LIST_INDEX"..0x0B33,
        "POLYGON_MODE"..0x0B40,
        "POLYGON_SMOOTH"..0x0B41,
        "POLYGON_STIPPLE"..0x0B42,
        "EDGE_FLAG"..0x0B43,
        "CULL_FACE"..0x0B44,
        "CULL_FACE_MODE"..0x0B45,
        "FRONT_FACE"..0x0B46,
        "LIGHTING"..0x0B50,
        "LIGHT_MODEL_LOCAL_VIEWER"..0x0B51,
        "LIGHT_MODEL_TWO_SIDE"..0x0B52,
        "LIGHT_MODEL_AMBIENT"..0x0B53,
        "SHADE_MODEL"..0x0B54,
        "COLOR_MATERIAL_FACE"..0x0B55,
        "COLOR_MATERIAL_PARAMETER"..0x0B56,
        "COLOR_MATERIAL"..0x0B57,
        "FOG"..0x0B60,
        "FOG_INDEX"..0x0B61,
        "FOG_DENSITY"..0x0B62,
        "FOG_START"..0x0B63,
        "FOG_END"..0x0B64,
        "FOG_MODE"..0x0B65,
        "FOG_COLOR"..0x0B66,
        "DEPTH_RANGE"..0x0B70,
        "DEPTH_TEST"..0x0B71,
        "DEPTH_WRITEMASK"..0x0B72,
        "DEPTH_CLEAR_VALUE"..0x0B73,
        "DEPTH_FUNC"..0x0B74,
        "ACCUM_CLEAR_VALUE"..0x0B80,
        "STENCIL_TEST"..0x0B90,
        "STENCIL_CLEAR_VALUE"..0x0B91,
        "STENCIL_FUNC"..0x0B92,
        "STENCIL_VALUE_MASK"..0x0B93,
        "STENCIL_FAIL"..0x0B94,
        "STENCIL_PASS_DEPTH_FAIL"..0x0B95,
        "STENCIL_PASS_DEPTH_PASS"..0x0B96,
        "STENCIL_REF"..0x0B97,
        "STENCIL_WRITEMASK"..0x0B98,
        "MATRIX_MODE"..0x0BA0,
        "NORMALIZE"..0x0BA1,
        "VIEWPORT"..0x0BA2,
        "MODELVIEW_STACK_DEPTH"..0x0BA3,
        "PROJECTION_STACK_DEPTH"..0x0BA4,
        "TEXTURE_STACK_DEPTH"..0x0BA5,
        "MODELVIEW_MATRIX"..0x0BA6,
        "PROJECTION_MATRIX"..0x0BA7,
        "TEXTURE_MATRIX"..0x0BA8,
        "ATTRIB_STACK_DEPTH"..0x0BB0,
        "CLIENT_ATTRIB_STACK_DEPTH"..0x0BB1,
        "ALPHA_TEST"..0x0BC0,
        "ALPHA_TEST_FUNC"..0x0BC1,
        "ALPHA_TEST_REF"..0x0BC2,
        "DITHER"..0x0BD0,
        "BLEND_DST"..0x0BE0,
        "BLEND_SRC"..0x0BE1,
        "BLEND"..0x0BE2,
        "LOGIC_OP_MODE"..0x0BF0,
        "INDEX_LOGIC_OP"..0x0BF1,
        "LOGIC_OP"..0x0BF1,
        "COLOR_LOGIC_OP"..0x0BF2,
        "AUX_BUFFERS"..0x0C00,
        "DRAW_BUFFER"..0x0C01,
        "READ_BUFFER"..0x0C02,
        "SCISSOR_BOX"..0x0C10,
        "SCISSOR_TEST"..0x0C11,
        "INDEX_CLEAR_VALUE"..0x0C20,
        "INDEX_WRITEMASK"..0x0C21,
        "COLOR_CLEAR_VALUE"..0x0C22,
        "COLOR_WRITEMASK"..0x0C23,
        "INDEX_MODE"..0x0C30,
        "RGBA_MODE"..0x0C31,
        "DOUBLEBUFFER"..0x0C32,
        "STEREO"..0x0C33,
        "RENDER_MODE"..0x0C40,
        "PERSPECTIVE_CORRECTION_HINT"..0x0C50,
        "POINT_SMOOTH_HINT"..0x0C51,
        "LINE_SMOOTH_HINT"..0x0C52,
        "POLYGON_SMOOTH_HINT"..0x0C53,
        "FOG_HINT"..0x0C54,
        "TEXTURE_GEN_S"..0x0C60,
        "TEXTURE_GEN_T"..0x0C61,
        "TEXTURE_GEN_R"..0x0C62,
        "TEXTURE_GEN_Q"..0x0C63,
        "PIXEL_MAP_I_TO_I"..0x0C70,
        "PIXEL_MAP_S_TO_S"..0x0C71,
        "PIXEL_MAP_I_TO_R"..0x0C72,
        "PIXEL_MAP_I_TO_G"..0x0C73,
        "PIXEL_MAP_I_TO_B"..0x0C74,
        "PIXEL_MAP_I_TO_A"..0x0C75,
        "PIXEL_MAP_R_TO_R"..0x0C76,
        "PIXEL_MAP_G_TO_G"..0x0C77,
        "PIXEL_MAP_B_TO_B"..0x0C78,
        "PIXEL_MAP_A_TO_A"..0x0C79,
        "PIXEL_MAP_I_TO_I_SIZE"..0x0CB0,
        "PIXEL_MAP_S_TO_S_SIZE"..0x0CB1,
        "PIXEL_MAP_I_TO_R_SIZE"..0x0CB2,
        "PIXEL_MAP_I_TO_G_SIZE"..0x0CB3,
        "PIXEL_MAP_I_TO_B_SIZE"..0x0CB4,
        "PIXEL_MAP_I_TO_A_SIZE"..0x0CB5,
        "PIXEL_MAP_R_TO_R_SIZE"..0x0CB6,
        "PIXEL_MAP_G_TO_G_SIZE"..0x0CB7,
        "PIXEL_MAP_B_TO_B_SIZE"..0x0CB8,
        "PIXEL_MAP_A_TO_A_SIZE"..0x0CB9,
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
        "MAP_COLOR"..0x0D10,
        "MAP_STENCIL"..0x0D11,
        "INDEX_SHIFT"..0x0D12,
        "INDEX_OFFSET"..0x0D13,
        "RED_SCALE"..0x0D14,
        "RED_BIAS"..0x0D15,
        "ZOOM_X"..0x0D16,
        "ZOOM_Y"..0x0D17,
        "GREEN_SCALE"..0x0D18,
        "GREEN_BIAS"..0x0D19,
        "BLUE_SCALE"..0x0D1A,
        "BLUE_BIAS"..0x0D1B,
        "ALPHA_SCALE"..0x0D1C,
        "ALPHA_BIAS"..0x0D1D,
        "DEPTH_SCALE"..0x0D1E,
        "DEPTH_BIAS"..0x0D1F,
        "MAX_EVAL_ORDER"..0x0D30,
        "MAX_LIGHTS"..0x0D31,
        "MAX_CLIP_PLANES"..0x0D32,
        "MAX_TEXTURE_SIZE"..0x0D33,
        "MAX_PIXEL_MAP_TABLE"..0x0D34,
        "MAX_ATTRIB_STACK_DEPTH"..0x0D35,
        "MAX_MODELVIEW_STACK_DEPTH"..0x0D36,
        "MAX_NAME_STACK_DEPTH"..0x0D37,
        "MAX_PROJECTION_STACK_DEPTH"..0x0D38,
        "MAX_TEXTURE_STACK_DEPTH"..0x0D39,
        "MAX_VIEWPORT_DIMS"..0x0D3A,
        "MAX_CLIENT_ATTRIB_STACK_DEPTH"..0x0D3B,
        "SUBPIXEL_BITS"..0x0D50,
        "INDEX_BITS"..0x0D51,
        "RED_BITS"..0x0D52,
        "GREEN_BITS"..0x0D53,
        "BLUE_BITS"..0x0D54,
        "ALPHA_BITS"..0x0D55,
        "DEPTH_BITS"..0x0D56,
        "STENCIL_BITS"..0x0D57,
        "ACCUM_RED_BITS"..0x0D58,
        "ACCUM_GREEN_BITS"..0x0D59,
        "ACCUM_BLUE_BITS"..0x0D5A,
        "ACCUM_ALPHA_BITS"..0x0D5B,
        "NAME_STACK_DEPTH"..0x0D70,
        "AUTO_NORMAL"..0x0D80,
        "MAP1_COLOR_4"..0x0D90,
        "MAP1_INDEX"..0x0D91,
        "MAP1_NORMAL"..0x0D92,
        "MAP1_TEXTURE_COORD_1"..0x0D93,
        "MAP1_TEXTURE_COORD_2"..0x0D94,
        "MAP1_TEXTURE_COORD_3"..0x0D95,
        "MAP1_TEXTURE_COORD_4"..0x0D96,
        "MAP1_VERTEX_3"..0x0D97,
        "MAP1_VERTEX_4"..0x0D98,
        "MAP2_COLOR_4"..0x0DB0,
        "MAP2_INDEX"..0x0DB1,
        "MAP2_NORMAL"..0x0DB2,
        "MAP2_TEXTURE_COORD_1"..0x0DB3,
        "MAP2_TEXTURE_COORD_2"..0x0DB4,
        "MAP2_TEXTURE_COORD_3"..0x0DB5,
        "MAP2_TEXTURE_COORD_4"..0x0DB6,
        "MAP2_VERTEX_3"..0x0DB7,
        "MAP2_VERTEX_4"..0x0DB8,
        "MAP1_GRID_DOMAIN"..0x0DD0,
        "MAP1_GRID_SEGMENTS"..0x0DD1,
        "MAP2_GRID_DOMAIN"..0x0DD2,
        "MAP2_GRID_SEGMENTS"..0x0DD3,
        "TEXTURE_1D"..0x0DE0,
        "TEXTURE_2D"..0x0DE1,
        "FEEDBACK_BUFFER_POINTER"..0x0DF0,
        "FEEDBACK_BUFFER_SIZE"..0x0DF1,
        "FEEDBACK_BUFFER_TYPE"..0x0DF2,
        "SELECTION_BUFFER_POINTER"..0x0DF3,
        "SELECTION_BUFFER_SIZE"..0x0DF4
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
        "TEXTURE_COMPONENTS"..0x1003,
        "TEXTURE_BORDER_COLOR"..0x1004,
        "TEXTURE_BORDER"..0x1005
        /*      TEXTURE_RED_SIZE */
        /*      TEXTURE_GREEN_SIZE */
        /*      TEXTURE_BLUE_SIZE */
        /*      TEXTURE_ALPHA_SIZE */
        /*      TEXTURE_LUMINANCE_SIZE */
        /*      TEXTURE_INTENSITY_SIZE */
        /*      TEXTURE_PRIORITY */
        /*      TEXTURE_RESIDENT */
    )

    IntConstant(
        "HintMode",
        "DONT_CARE"..0x1100,
        "FASTEST"..0x1101,
        "NICEST"..0x1102
    )

    IntConstant(
        "LightName",
        "LIGHT0"..0x4000,
        "LIGHT1"..0x4001,
        "LIGHT2"..0x4002,
        "LIGHT3"..0x4003,
        "LIGHT4"..0x4004,
        "LIGHT5"..0x4005,
        "LIGHT6"..0x4006,
        "LIGHT7"..0x4007
    )

    IntConstant(
        "LightParameter",
        "AMBIENT"..0x1200,
        "DIFFUSE"..0x1201,
        "SPECULAR"..0x1202,
        "POSITION"..0x1203,
        "SPOT_DIRECTION"..0x1204,
        "SPOT_EXPONENT"..0x1205,
        "SPOT_CUTOFF"..0x1206,
        "CONSTANT_ATTENUATION"..0x1207,
        "LINEAR_ATTENUATION"..0x1208,
        "QUADRATIC_ATTENUATION"..0x1209
    )

    IntConstant(
        "ListMode",
        "COMPILE"..0x1300,
        "COMPILE_AND_EXECUTE"..0x1301
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
        "MaterialParameter",
        "EMISSION"..0x1600,
        "SHININESS"..0x1601,
        "AMBIENT_AND_DIFFUSE"..0x1602,
        "COLOR_INDEXES"..0x1603
        /*      AMBIENT */
        /*      DIFFUSE */
        /*      SPECULAR */
    )

    IntConstant(
        "MatrixMode",
        "MODELVIEW"..0x1700,
        "PROJECTION"..0x1701,
        "TEXTURE"..0x1702
    )

    IntConstant(
        "PixelCopyType",
        "COLOR"..0x1800,
        "DEPTH"..0x1801,
        "STENCIL"..0x1802
    )

    IntConstant(
        "PixelFormat",
        "COLOR_INDEX"..0x1900,
        "STENCIL_INDEX"..0x1901,
        "DEPTH_COMPONENT"..0x1902,
        "RED"..0x1903,
        "GREEN"..0x1904,
        "BLUE"..0x1905,
        "ALPHA"..0x1906,
        "RGB"..0x1907,
        "RGBA"..0x1908,
        "LUMINANCE"..0x1909,
        "LUMINANCE_ALPHA"..0x190A
    )

    IntConstant(
        "PixelType",
        "BITMAP"..0x1A00
        /*      BYTE */
        /*      UNSIGNED_BYTE */
        /*      SHORT */
        /*      UNSIGNED_SHORT */
        /*      INT */
        /*      UNSIGNED_INT */
        /*      FLOAT */
    )

    IntConstant(
        "PolygonMode",
        "POINT"..0x1B00,
        "LINE"..0x1B01,
        "FILL"..0x1B02
    )

    IntConstant(
        "RenderingMode",
        "RENDER"..0x1C00,
        "FEEDBACK"..0x1C01,
        "SELECT"..0x1C02
    )

    IntConstant(
        "ShadingModel",
        "FLAT"..0x1D00,
        "SMOOTH"..0x1D01
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
        "TextureCoordName",
        "S"..0x2000,
        "T"..0x2001,
        "R"..0x2002,
        "Q"..0x2003
    )

    /* TexCoordPointerType */
    /*      SHORT */
    /*      INT */
    /*      FLOAT */
    /*      DOUBLE */

    IntConstant(
        "TextureEnvMode",
        "MODULATE"..0x2100,
        "DECAL"..0x2101
        /*      BLEND */
        /*      REPLACE */
    )

    IntConstant(
        "TextureEnvParameter",
        "TEXTURE_ENV_MODE"..0x2200,
        "TEXTURE_ENV_COLOR"..0x2201
    )

    IntConstant(
        "TextureEnvTarget",
        "TEXTURE_ENV"..0x2300
    )

    IntConstant(
        "TextureGenMode",
        "EYE_LINEAR"..0x2400,
        "OBJECT_LINEAR"..0x2401,
        "SPHERE_MAP"..0x2402
    )

    IntConstant(
        "TextureGenParameter",
        "TEXTURE_GEN_MODE"..0x2500,
        "OBJECT_PLANE"..0x2501,
        "EYE_PLANE"..0x2502
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
        "CLAMP"..0x2900,
        "REPEAT"..0x2901
    )

    IntConstant(
        "ClientAttribMask",
        "CLIENT_PIXEL_STORE_BIT"..0x00000001,
        "CLIENT_VERTEX_ARRAY_BIT"..0x00000002,
        "CLIENT_ALL_ATTRIB_BITS"..0xffffffff.i
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
        "ALPHA4"..0x803B,
        "ALPHA8"..0x803C,
        "ALPHA12"..0x803D,
        "ALPHA16"..0x803E,
        "LUMINANCE4"..0x803F,
        "LUMINANCE8"..0x8040,
        "LUMINANCE12"..0x8041,
        "LUMINANCE16"..0x8042,
        "LUMINANCE4_ALPHA4"..0x8043,
        "LUMINANCE6_ALPHA2"..0x8044,
        "LUMINANCE8_ALPHA8"..0x8045,
        "LUMINANCE12_ALPHA4"..0x8046,
        "LUMINANCE12_ALPHA12"..0x8047,
        "LUMINANCE16_ALPHA16"..0x8048,
        "INTENSITY"..0x8049,
        "INTENSITY4"..0x804A,
        "INTENSITY8"..0x804B,
        "INTENSITY12"..0x804C,
        "INTENSITY16"..0x804D,
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
        "TEXTURE_LUMINANCE_SIZE"..0x8060,
        "TEXTURE_INTENSITY_SIZE"..0x8061,
        "PROXY_TEXTURE_1D"..0x8063,
        "PROXY_TEXTURE_2D"..0x8064
    )

    IntConstant(
        "texture_object",
        "TEXTURE_PRIORITY"..0x8066,
        "TEXTURE_RESIDENT"..0x8067,
        "TEXTURE_BINDING_1D"..0x8068,
        "TEXTURE_BINDING_2D"..0x8069
    )

    IntConstant(
        "vertex_array",
        "VERTEX_ARRAY"..0x8074,
        "NORMAL_ARRAY"..0x8075,
        "COLOR_ARRAY"..0x8076,
        "INDEX_ARRAY"..0x8077,
        "TEXTURE_COORD_ARRAY"..0x8078,
        "EDGE_FLAG_ARRAY"..0x8079,
        "VERTEX_ARRAY_SIZE"..0x807A,
        "VERTEX_ARRAY_TYPE"..0x807B,
        "VERTEX_ARRAY_STRIDE"..0x807C,
        "NORMAL_ARRAY_TYPE"..0x807E,
        "NORMAL_ARRAY_STRIDE"..0x807F,
        "COLOR_ARRAY_SIZE"..0x8081,
        "COLOR_ARRAY_TYPE"..0x8082,
        "COLOR_ARRAY_STRIDE"..0x8083,
        "INDEX_ARRAY_TYPE"..0x8085,
        "INDEX_ARRAY_STRIDE"..0x8086,
        "TEXTURE_COORD_ARRAY_SIZE"..0x8088,
        "TEXTURE_COORD_ARRAY_TYPE"..0x8089,
        "TEXTURE_COORD_ARRAY_STRIDE"..0x808A,
        "EDGE_FLAG_ARRAY_STRIDE"..0x808C,
        "VERTEX_ARRAY_POINTER"..0x808E,
        "NORMAL_ARRAY_POINTER"..0x808F,
        "COLOR_ARRAY_POINTER"..0x8090,
        "INDEX_ARRAY_POINTER"..0x8091,
        "TEXTURE_COORD_ARRAY_POINTER"..0x8092,
        "EDGE_FLAG_ARRAY_POINTER"..0x8093,
        "V2F"..0x2A20,
        "V3F"..0x2A21,
        "C4UB_V2F"..0x2A22,
        "C4UB_V3F"..0x2A23,
        "C3F_V3F"..0x2A24,
        "N3F_V3F"..0x2A25,
        "C4F_N3F_V3F"..0x2A26,
        "T2F_V3F"..0x2A27,
        "T4F_V4F"..0x2A28,
        "T2F_C4UB_V3F"..0x2A29,
        "T2F_C3F_V3F"..0x2A2A,
        "T2F_N3F_V3F"..0x2A2B,
        "T2F_C4F_N3F_V3F"..0x2A2C,
        "T4F_C4F_N3F_V4F"..0x2A2D
    )

    // Some definitions to be used in the javadocs below

    val COMPARISON_FUNCTIONS = "#NEVER #ALWAYS #LESS #LEQUAL #EQUAL #GEQUAL #GREATER #NOTEQUAL"

    val TEX_COORDS = "#S #T #R #Q"

    // Table 8.3
    val PIXEL_MAP_NAMES =
        """
        #PIXEL_MAP_I_TO_I #PIXEL_MAP_S_TO_S #PIXEL_MAP_I_TO_R #PIXEL_MAP_I_TO_G #PIXEL_MAP_I_TO_B #PIXEL_MAP_I_TO_A
        #PIXEL_MAP_R_TO_R #PIXEL_MAP_G_TO_G #PIXEL_MAP_B_TO_B #PIXEL_MAP_A_TO_A
        """

    // Table 21.1
    val MAP1_TARGETS =
        """
        #MAP1_VERTEX_3 #MAP1_VERTEX_4 #MAP1_COLOR_4 #MAP1_NORMAL
        #MAP1_TEXTURE_COORD_1 #MAP1_TEXTURE_COORD_2 #MAP1_TEXTURE_COORD_3 #MAP1_TEXTURE_COORD_4
        """

    val MAP2_TARGETS =
        """
        #MAP2_VERTEX_3 #MAP2_VERTEX_4 #MAP2_COLOR_4 #MAP2_NORMAL
        #MAP2_TEXTURE_COORD_1 #MAP2_TEXTURE_COORD_2 #MAP2_TEXTURE_COORD_3 #MAP2_TEXTURE_COORD_4
        """

    // Functions

    GL11C reuse "Enable"
    GL11C reuse "Disable"

    DeprecatedGL..void(
        "Accum",
        """
        Each portion of a pixel in the accumulation buffer consists of four values: one for each of R, G, B, and A. The accumulation buffer is controlled
        exclusively through the use of this method (except for clearing it).
        """,

        GLenum.IN("op", "a symbolic constant indicating an accumulation buffer operation"),
        GLfloat.IN("value", "a floating-point value to be used in that operation", "#ACCUM #LOAD #RETURN #MULT #ADD")
    )

    DeprecatedGL..void(
        "AlphaFunc",
        """
        The alpha test discards a fragment conditionally based on the outcome of a comparison between the incoming fragment’s alpha value and a constant value.
        The comparison is enabled or disabled with the generic #Enable() and #Disable() commands using the symbolic constant #ALPHA_TEST.
        When disabled, it is as if the comparison always passes. The test is controlled with this method.
        """,

        GLenum.IN("func", "a symbolic constant indicating the alpha test function", COMPARISON_FUNCTIONS),
        GLfloat.IN("ref", "a reference value clamped to the range [0, 1]. When performing the alpha test, the GL will convert the reference value to the same representation as the fragment's alpha value (floating-point or fixed-point).")
    )

    DeprecatedGL..GLboolean(
        "AreTexturesResident",
        """
        Returns #TRUE if all of the texture objects named in textures are resident, or if the implementation does not distinguish a working set. If
        at least one of the texture objects named in textures is not resident, then #FALSE is returned, and the residence of each texture object is
        returned in residences. Otherwise the contents of residences are not changed.
        """,

        AutoSize("textures", "residences")..(GLsizei.IN("n", "the number of texture objects in {@code textures}")),
        SingleValue("texture")..GLuint.const.p.IN("textures", "an array of texture objects"),
        GLboolean.p.OUT("residences", "returns the residences of each texture object")
    )

    DeprecatedGL..void(
        "ArrayElement",
        "Transfers the ith element of every enabled, non-instanced array, and the first element of every enabled, instanced array to the GL.",

        GLint.IN("i", "the element to transfer")
    )

    DeprecatedGL..void(
        "Begin",
        "Begins the definition of vertex attributes of a sequence of primitives to be transferred to the GL.",

        GLenum.IN("mode", "the primitive type being defined", PRIMITIVE_TYPES)
    )

    GL11C reuse "BindTexture"

    DeprecatedGL..void(
        "Bitmap",
        """
        Sents a bitmap to the GL. Bitmaps are rectangles of zeros and ones specifying a particular pattern of fragments to be produced. Each of these fragments
        has the same associated data. These data are those associated with the current raster position.
        """,

        GLsizei.IN("w", "the bitmap width"),
        GLsizei.IN("h", "the bitmap width"),
        GLfloat.IN("xOrig", "the bitmap origin x coordinate"),
        GLfloat.IN("yOrig", "the bitmap origin y coordinate"),
        GLfloat.IN("xInc", "the x increment added to the raster position"),
        GLfloat.IN("yInc", "the y increment added to the raster position"),
        Check("((w + 7) >> 3) * h")..PIXEL_UNPACK_BUFFER..nullable..GLubyte.const.p.IN("data", "the buffer containing the bitmap data.")
    )

    GL11C reuse "BlendFunc"

    DeprecatedGL..void(
        "CallList",
        "Executes a display list. Causes the commands saved in the display list to be executed, in order, just as if they were issued without using a display list.",

        GLuint.IN("list", "the index of the display list to be called")
    )

    DeprecatedGL..void(
        "CallLists",
        "Provides an efficient means for executing a number of display lists.",

        AutoSizeDiv("GLChecks.typeToBytes(type)", "lists")..GLsizei.IN("n", "the number of display lists to be called"),
        AutoType("lists", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum.IN(
            "type",
            "the data type of each element in {@code lists}",
            "#BYTE #UNSIGNED_BYTE #SHORT #UNSIGNED_SHORT #INT #UNSIGNED_INT #FLOAT #2_BYTES #3_BYTES #4_BYTES"
        ),
        void.const.p.IN("lists", "an array of offsets. Each offset is added to the display list base to obtain the display list number.")
    )

    GL11C reuse "Clear"

    DeprecatedGL..void(
        "ClearAccum",
        "Sets the clear values for the accumulation buffer. These values are clamped to the range [-1,1] when they are specified.",

        GLfloat.IN("red", "the value to which to clear the R values of the accumulation buffer"),
        GLfloat.IN("green", "the value to which to clear the G values of the accumulation buffer"),
        GLfloat.IN("blue", "the value to which to clear the B values of the accumulation buffer"),
        GLfloat.IN("alpha", "the value to which to clear the A values of the accumulation buffer")
    )

    GL11C reuse "ClearColor"
    GL11C reuse "ClearDepth"

    DeprecatedGL..void(
        "ClearIndex",
        """
        sets the clear color index. index is converted to a fixed-point value with unspecified precision to the left of the binary point; the integer part of
        this value is then masked with ${code("2<sup>m</sup> &ndash; 1")}, where {@code m} is the number of bits in a color index value stored in the
        framebuffer.
        """,

        GLfloat.IN("index", "the value to which to clear the color buffer in color index mode")
    )

    GL11C reuse "ClearStencil"

    DeprecatedGL..void(
        "ClipPlane",
        """
        Specifies a client-defined clip plane.

        The value of the first argument, {@code plane}, is a symbolic constant, CLIP_PLANEi, where i is an integer between 0 and n &ndash; 1, indicating one of
        n client-defined clip planes. {@code equation} is an array of four double-precision floating-point values. These are the coefficients of a plane
        equation in object coordinates: p1, p2, p3, and p4 (in that order).
        """,

        GLenum.IN("plane", "the clip plane to define"),
        Check(4)..GLdouble.const.p.IN("equation", "the clip plane coefficients")
    )

    // Color functions javadoc
    val colorRed = "the red component of the current color"
    val colorGreen = "the green component of the current color"
    val colorBlue = "the blue component of the current color"
    val colorAlpha = "the alpha component of the current color"
    val colorBuffer = "the color buffer"

    DeprecatedGL..void(
        "Color3b",
        "Sets the R, G, and B components of the current color. The alpha component is set to 1.0.",

        GLbyte.IN("red", colorRed),
        GLbyte.IN("green", colorGreen),
        GLbyte.IN("blue", colorBlue)
    )
    DeprecatedGL..void("Color3s", "Short version of #Color3b()", GLshort.IN("red", colorRed), GLshort.IN("green", colorGreen), GLshort.IN("blue", colorBlue))
    DeprecatedGL..void("Color3i", "Integer version of #Color3b()", GLint.IN("red", colorRed), GLint.IN("green", colorGreen), GLint.IN("blue", colorBlue))
    DeprecatedGL..void("Color3f", "Float version of #Color3b()", GLfloat.IN("red", colorRed), GLfloat.IN("green", colorGreen), GLfloat.IN("blue", colorBlue))
    DeprecatedGL..void("Color3d", "Double version of #Color3b()", GLdouble.IN("red", colorRed), GLdouble.IN("green", colorGreen), GLdouble.IN("blue", colorBlue))
    DeprecatedGL..void("Color3ub", "Unsigned version of #Color3b()", GLubyte.IN("red", colorRed), GLubyte.IN("green", colorGreen), GLubyte.IN("blue", colorBlue))
    DeprecatedGL..void("Color3us", "Unsigned short version of #Color3b()", GLushort.IN("red", colorRed), GLushort.IN("green", colorGreen), GLushort.IN("blue", colorBlue))
    DeprecatedGL..void("Color3ui", "Unsigned int version of #Color3b()", GLint.IN("red", colorRed), GLint.IN("green", colorGreen), GLint.IN("blue", colorBlue))

    DeprecatedGL..void("Color3bv", "Byte pointer version of #Color3b().", Check(3)..GLbyte.const.p.IN("v", colorBuffer))
    DeprecatedGL..void("Color3sv", "Pointer version of #Color3s().", Check(3)..GLshort.const.p.IN("v", colorBuffer))
    DeprecatedGL..void("Color3iv", "Pointer version of #Color3i().", Check(3)..GLint.const.p.IN("v", colorBuffer))
    DeprecatedGL..void("Color3fv", "Pointer version of #Color3f().", Check(3)..GLfloat.const.p.IN("v", colorBuffer))
    DeprecatedGL..void("Color3dv", "Pointer version of #Color3d().", Check(3)..GLdouble.const.p.IN("v", colorBuffer))
    DeprecatedGL..void("Color3ubv", "Pointer version of #Color3ub().", Check(3)..GLubyte.const.p.IN("v", colorBuffer))
    DeprecatedGL..void("Color3usv", "Pointer version of #Color3us().", Check(3)..GLushort.const.p.IN("v", colorBuffer))
    DeprecatedGL..void("Color3uiv", "Pointer version of #Color3ui().", Check(3)..GLuint.const.p.IN("v", colorBuffer))

    DeprecatedGL..void(
        "Color4b",
        "Sets the current color.",

        GLbyte.IN("red", colorRed),
        GLbyte.IN("green", colorGreen),
        GLbyte.IN("blue", colorBlue),
        GLbyte.IN("alpha", colorAlpha)
    )

    DeprecatedGL..void("Color4s", "Short version of #Color4b()", GLshort.IN("red", colorRed), GLshort.IN("green", colorGreen), GLshort.IN("blue", colorBlue), GLshort.IN("alpha", colorAlpha))
    DeprecatedGL..void("Color4i", "Integer version of #Color4b()", GLint.IN("red", colorRed), GLint.IN("green", colorGreen), GLint.IN("blue", colorBlue), GLint.IN("alpha", colorAlpha))
    DeprecatedGL..void("Color4f", "Float version of #Color4b()", GLfloat.IN("red", colorRed), GLfloat.IN("green", colorGreen), GLfloat.IN("blue", colorBlue), GLfloat.IN("alpha", colorAlpha))
    DeprecatedGL..void("Color4d", "Double version of #Color4b()", GLdouble.IN("red", colorRed), GLdouble.IN("green", colorGreen), GLdouble.IN("blue", colorBlue), GLdouble.IN("alpha", colorAlpha))
    DeprecatedGL..void("Color4ub", "Unsigned version of #Color4b()", GLubyte.IN("red", colorRed), GLubyte.IN("green", colorGreen), GLubyte.IN("blue", colorBlue), GLubyte.IN("alpha", colorAlpha))
    DeprecatedGL..void("Color4us", "Unsigned short version of #Color4b()", GLushort.IN("red", colorRed), GLushort.IN("green", colorGreen), GLushort.IN("blue", colorBlue), GLushort.IN("alpha", colorAlpha))
    DeprecatedGL..void("Color4ui", "Unsigned int version of #Color4b()", GLint.IN("red", colorRed), GLint.IN("green", colorGreen), GLint.IN("blue", colorBlue), GLint.IN("alpha", colorAlpha))

    DeprecatedGL..void("Color4bv", "Pointer version of #Color4b().", Check(4)..GLbyte.const.p.IN("v", colorBuffer))
    DeprecatedGL..void("Color4sv", "Pointer version of #Color4s().", Check(4)..GLshort.const.p.IN("v", colorBuffer))
    DeprecatedGL..void("Color4iv", "Pointer version of #Color4i().", Check(4)..GLint.const.p.IN("v", colorBuffer))
    DeprecatedGL..void("Color4fv", "Pointer version of #Color4f().", Check(4)..GLfloat.const.p.IN("v", colorBuffer))
    DeprecatedGL..void("Color4dv", "Pointer version of #Color4d().", Check(4)..GLdouble.const.p.IN("v", colorBuffer))
    DeprecatedGL..void("Color4ubv", "Pointer version of #Color4ub().", Check(4)..GLubyte.const.p.IN("v", colorBuffer))
    DeprecatedGL..void("Color4usv", "Pointer version of #Color4us().", Check(4)..GLushort.const.p.IN("v", colorBuffer))
    DeprecatedGL..void("Color4uiv", "Pointer version of #Color4ui().", Check(4)..GLuint.const.p.IN("v", colorBuffer))

    GL11C reuse "ColorMask"

    DeprecatedGL..void(
        "ColorMaterial",
        """
        It is possible to attach one or more material properties to the current color, so that they continuously track its component values. This behavior is
        enabled and disabled by calling #Enable() or #Disable() with the symbolic value #COLOR_MATERIAL. This function controls which
        of these modes is selected.
        """,

        GLenum.IN("face", "specifies which material face is affected by the current color", "#FRONT #BACK #FRONT_AND_BACK"),
        GLenum.IN("mode", "specifies which material property or properties track the current color", "#EMISSION #AMBIENT #DIFFUSE #SPECULAR #AMBIENT_AND_DIFFUSE")
    )

    OffHeapOnly..DeprecatedGL..void(
        "ColorPointer",
        "Specifies the location and organization of a color array.",

        GLint.IN("size", "the number of values per vertex that are stored in the array, as well as their component ordering", "3 4 #BGRA"),
        GLenum.IN(
            "type",
            "the data type of the values stored in the array",
            "#BYTE #UNSIGNED_BYTE #SHORT #UNSIGNED_SHORT #INT #UNSIGNED_INT #HALF_FLOAT #FLOAT #DOUBLE #UNSIGNED_INT_2_10_10_10_REV #INT_2_10_10_10_REV"
        ),
        GLsizei.IN("stride", "the vertex stride in bytes. If specified as zero, then array elements are stored sequentially"),
        ARRAY_BUFFER..MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..void.const.p.IN("pointer", "the color array data")
    )

    DeprecatedGL..void(
        "CopyPixels",
        "Transfers a rectangle of pixel values from one region of the read framebuffer to another in the draw framebuffer",

        GLint.IN("x", "the left framebuffer pixel coordinate"),
        GLint.IN("y", "the lower framebuffer pixel coordinate"),
        GLsizei.IN("width", "the rectangle width"),
        GLsizei.IN("height", "the rectangle height"),
        GLenum.IN("type", "Indicates the type of values to be transfered", "#COLOR #STENCIL #DEPTH #DEPTH_STENCIL")
    )

    GL11C reuse "CullFace"

    DeprecatedGL..void(
        "DeleteLists",
        """
        Deletes a contiguous group of display lists. All information about the display lists is lost, and the indices become unused. Indices to which no display
        list corresponds are ignored. If {@code range} is zero, nothing happens.
        """,

        GLuint.IN("list", "the index of the first display list to be deleted"),
        GLsizei.IN("range", "the number of display lists to be deleted")
    )

    GL11C reuse "DepthFunc"
    GL11C reuse "DepthMask"
    GL11C reuse "DepthRange"

    DeprecatedGL..DependsOn("GL_NV_vertex_buffer_unified_memory")..void(
        "DisableClientState",
        """
        Disables a client-side capability.

        If the ##NVVertexBufferUnifiedMemory extension is supported, this function is available even in a core profile context.
        """,

        GLenum.IN(
            "cap",
            "the capability to disable",
            """
            #COLOR_ARRAY #EDGE_FLAG_ARRAY #FOG_COORD_ARRAY #INDEX_ARRAY #NORMAL_ARRAY #SECONDARY_COLOR_ARRAY #TEXTURE_COORD_ARRAY #VERTEX_ARRAY
            #VERTEX_ATTRIB_ARRAY_UNIFIED_NV #ELEMENT_ARRAY_UNIFIED_NV
            """
        )
    )

    GL11C reuse "DrawArrays"
    GL11C reuse "DrawBuffer"
    GL11C reuse "DrawElements"

    DeprecatedGL..void(
        "DrawPixels",
        "Draws a pixel rectangle to the active draw buffers.",

        GLsizei.IN("width", "the pixel rectangle width"),
        GLsizei.IN("height", "the pixel rectangle height"),
        GLenum.IN("format", "the pixel data format", PIXEL_DATA_FORMATS),
        GLenum.IN("type", "the pixel data type", PIXEL_DATA_TYPES),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..PIXEL_UNPACK_BUFFER..void.const.p.IN("pixels", "the pixel data")
    )

    DeprecatedGL..void(
        "EdgeFlag",
        """
        Each edge of each polygon primitive generated is flagged as either boundary or non-boundary. These classifications are used during polygon
        rasterization; some modes affect the interpretation of polygon boundary edges. By default, all edges are boundary edges, but the flagging of polygons,
        separate triangles, or separate quadrilaterals may be altered by calling this function.

        When a primitive of type #POLYGON, #TRIANGLES, or #QUADS is drawn, each vertex transferred begins an edge. If the edge
        flag bit is TRUE, then each specified vertex begins an edge that is flagged as boundary. If the bit is FALSE, then induced edges are flagged as
        non-boundary.
        """,

        GLboolean.IN("flag", "the edge flag bit")
    )

    DeprecatedGL..void(
        "EdgeFlagv",
        "Pointer version of #EdgeFlag().",

        Check(1)..GLboolean.const.p.IN("flag", "the edge flag buffer")
    )

    OffHeapOnly..DeprecatedGL..void(
        "EdgeFlagPointer",
        "Specifies the location and organization of an edge flag array.",

        GLsizei.IN("stride", "the vertex stride in bytes. If specified as zero, then array elements are stored sequentially"),
        Unsafe..ARRAY_BUFFER..GLboolean.const.p.IN("pointer", "the edge flag array data")
    )

    DeprecatedGL..DependsOn("GL_NV_vertex_buffer_unified_memory")..void(
        "EnableClientState",
        """
        Enables a client-side capability.

        If the ##NVVertexBufferUnifiedMemory extension is supported, this function is available even in a core profile context.
        """,

        GLenum.IN(
            "cap",
            "the capability to enable",
            """
            #COLOR_ARRAY #EDGE_FLAG_ARRAY #FOG_COORD_ARRAY #INDEX_ARRAY #NORMAL_ARRAY #SECONDARY_COLOR_ARRAY #TEXTURE_COORD_ARRAY #VERTEX_ARRAY
            #VERTEX_ATTRIB_ARRAY_UNIFIED_NV #ELEMENT_ARRAY_UNIFIED_NV
            """
        )
    )

    DeprecatedGL..void("End", "Ends the definition of vertex attributes of a sequence of primitives to be transferred to the GL.")

    DeprecatedGL..void(
        "EvalCoord1f",
        "Causes evaluation of the enabled one-dimensional evaluator maps.",

        GLfloat.IN("u", "the domain coordinate u")
    )

    DeprecatedGL..void(
        "EvalCoord1fv",
        "Pointer version of #EvalCoord1f().",

        Check(1)..GLfloat.const.p.IN("u", "the domain coordinate buffer")
    )

    DeprecatedGL..void(
        "EvalCoord1d",
        "Double version of #EvalCoord1f().",

        GLdouble.IN("u", "the domain coordinate u")
    )

    DeprecatedGL..void(
        "EvalCoord1dv",
        "Pointer version of #EvalCoord1d().",

        Check(1)..GLdouble.const.p.IN("u", "the domain coordinate buffer")
    )

    DeprecatedGL..void(
        "EvalCoord2f",
        "Causes evaluation of the enabled two-dimensional evaluator maps.",

        GLfloat.IN("u", "the domain coordinate u"),
        GLfloat.IN("v", "the domain coordinate v")
    )

    DeprecatedGL..void(
        "EvalCoord2fv",
        "Pointer version of #EvalCoord2f().",

        Check(2)..GLfloat.const.p.IN("u", "the domain coordinate buffer")
    )

    DeprecatedGL..void(
        "EvalCoord2d",
        "Double version of #EvalCoord2f().",

        GLdouble.IN("u", "the domain coordinate u"),
        GLdouble.IN("v", "the domain coordinate v")
    )

    DeprecatedGL..void(
        "EvalCoord2dv",
        "Pointer version of #EvalCoord2d().",

        Check(2)..GLdouble.const.p.IN("u", "the domain coordinate buffer")
    )

    DeprecatedGL..void(
        "EvalMesh1",
        "Carries out an evaluation on a subset of the one-dimensional map grid.",

        GLenum.IN("mode", "the mesh type", "#POINT #LINE"),
        GLint.IN("i1", "the start index"),
        GLint.IN("i2", "the end index")
    )

    DeprecatedGL..void(
        "EvalMesh2",
        "Carries out an evaluation on a rectangular subset of the two-dimensional map grid.",

        GLenum.IN("mode", "the mesh type", "#FILL #LINE #POINT"),
        GLint.IN("i1", "the u-dimension start index"),
        GLint.IN("i2", "the u-dimension end index"),
        GLint.IN("j1", "the v-dimension start index"),
        GLint.IN("j2", "the v-dimension end index")
    )

    DeprecatedGL..void(
        "EvalPoint1",
        "Carries out an evalutation of a single point on the one-dimensional map grid.",

        GLint.IN("i", "the grid index")
    )

    DeprecatedGL..void(
        "EvalPoint2",
        "Carries out an evalutation of a single point on the two-dimensional map grid.",
        GLint.IN("i", "the u-dimension grid index"),
        GLint.IN("j", "the v-dimension grid index")
    )

    DeprecatedGL..void(
        "FeedbackBuffer",
        "Returns information about primitives when the GL is in feedback mode.",

        AutoSize("buffer")..GLsizei.IN("size", "the maximum number of values that can be written to {@code buffer}"),
        GLenum.IN("type", "the type of information to feed back for each vertex", "#2D #3D #3D_COLOR #3D_COLOR_TEXTURE #4D_COLOR_TEXTURE"),
        GLfloat.p.OUT("buffer", "an array of floating-point values into which feedback information will be placed")
    )

    GL11C reuse "Finish"
    GL11C reuse "Flush"

    DeprecatedGL..void(
        "Fogi",
        "Sets the integer value of a fog parameter.",

        GLenum.IN("pname", "the fog parameter", "#FOG_MODE #FOG_COORD_SRC"),
        GLint.IN("param", "the fog parameter value", "#EXP #EXP2 #LINEAR #FRAGMENT_DEPTH #FOG_COORD")
    )

    DeprecatedGL..void(
        "Fogiv",
        "Pointer version of #Fogi().",

        GLenum.IN("pname", "the fog parameter", "#FOG_MODE #FOG_COORD_SRC"),
        Check(1)..GLint.const.p.IN("params", "the fog parameter buffer")
    )

    DeprecatedGL..void(
        "Fogf",
        "Sets the float value of a fog parameter.",

        GLenum.IN("pname", "the fog parameter", "#FOG_DENSITY #FOG_START #FOG_END"),
        GLfloat.IN("param", "the fog parameter value")
    )

    DeprecatedGL..void(
        "Fogfv",
        "Pointer version of #Fogf().",

        GLenum.IN("pname", "the fog parameter", "#FOG_DENSITY #FOG_START #FOG_END"),
        Check(1)..GLfloat.const.p.IN("params", "the fog parameter buffer")
    )

    GL11C reuse "FrontFace"

    DeprecatedGL..GLuint(
        "GenLists",
        """
        Returns an integer n such that the indices {@code n,..., n + s - 1} are previously unused (i.e. there are {@code s} previously unused display list
        indices starting at n). {@code GenLists} also has the effect of creating an empty display list for each of the indices {@code n,..., n + s - 1}, so
        that these indices all become used. {@code GenLists} returns zero if there is no group of {@code s} contiguous previously unused display list indices,
        or if {@code s = 0}.
        """,

        GLsizei.IN("s", "the number of display lists to create")
    )

    GL11C reuse "GenTextures"
    GL11C reuse "DeleteTextures"

    DeprecatedGL..void(
        "GetClipPlane",
        """
        Returns four double-precision values in {@code equation}; these are the coefficients of the plane equation of plane in eye coordinates (these
        coordinates are those that were computed when the plane was specified).
        """,

        GLenum.IN("plane", "the clip plane"),
        Check(4)..GLdouble.p.OUT("equation", "a buffer in which to place the returned values")
    )

    GL11C reuse "GetBooleanv"
    GL11C reuse "GetFloatv"
    GL11C reuse "GetIntegerv"
    GL11C reuse "GetDoublev"
    GL11C reuse "GetError"

    DeprecatedGL..void(
        "GetLightiv",
        "Returns integer information about light parameter {@code pname} for {@code light} in {@code data}.",

        GLenum.IN("light", "the light for which to return information", "#LIGHT0 GL_LIGHT[1-7]"),
        GLenum.IN(
            "pname",
            "the light parameter to query",
            """
            #AMBIENT #DIFFUSE #SPECULAR #POSITION #CONSTANT_ATTENUATION #LINEAR_ATTENUATION #QUADRATIC_ATTENUATION
            #SPOT_DIRECTION #SPOT_EXPONENT #SPOT_CUTOFF
            """
        ),
        Check(4)..ReturnParam..GLint.p.OUT("data", "a scalar or buffer in which to place the returned data")
    )

    DeprecatedGL..void(
        "GetLightfv",
        "Float version of #GetLightiv().",

        GLenum.IN("light", "the light for which to return information"),
        GLenum.IN("pname", "the light parameter to query"),
        Check(4)..ReturnParam..GLfloat.p.OUT("data", "a scalar or buffer in which to place the returned data")
    )

    DeprecatedGL..void(
        "GetMapiv",
        "Returns integer information about {@code query} for evaluator map {@code target} in {@code data}.",

        GLenum.IN("target", "the evaluator target", "$MAP1_TARGETS $MAP2_TARGETS"),
        GLenum.IN("query", "the information to query", "#ORDER #COEFF #DOMAIN"),
        Check(4)..ReturnParam..GLint.p.OUT("data", "a scalar or buffer in which to place the returned data")
    )

    DeprecatedGL..void(
        "GetMapfv",
        "Float version of #GetMapiv().",

        GLenum.IN("target", "the evaluator map"),
        GLenum.IN("query", "the information to query"),
        Check(4)..ReturnParam..GLfloat.p.OUT("data", "a scalar or buffer in which to place the returned data")
    )

    DeprecatedGL..void(
        "GetMapdv",
        "Double version of #GetMapiv().",

        GLenum.IN("target", "the evaluator map"),
        GLenum.IN("query", "the information to query"),
        Check(4)..ReturnParam..GLdouble.p.OUT("data", "a scalar or buffer in which to place the returned data")
    )

    DeprecatedGL..void(
        "GetMaterialiv",
        "Returns integer information about material property {@code pname} for {@code face} in {@code data}.",

        GLenum.IN("face", "the material face for which to return information", "#FRONT #BACK"),
        GLenum.IN("pname", "the information to query", "#AMBIENT #DIFFUSE #SPECULAR #EMISSION #SHININESS"),
        Check(1)..GLint.p.OUT("data", "a scalar or buffer in which to place the returned data")
    )

    DeprecatedGL..void(
        "GetMaterialfv",
        "Float version of #GetMaterialiv().",

        GLenum.IN("face", "the material face for which to return information"),
        GLenum.IN("pname", "the information to query"),
        Check(1)..GLfloat.p.OUT("data", "a scalar or buffer in which to place the returned data")
    )

    DeprecatedGL..void(
        "GetPixelMapfv",
        "Returns all float values in the pixel map {@code map} in {@code data}.",

        GLenum.IN("map", "the pixel map parameter to query", PIXEL_MAP_NAMES),
        Check(32)..PIXEL_PACK_BUFFER..GLfloat.p.OUT("data", "a buffer in which to place the returned data")
    )

    DeprecatedGL..void(
        "GetPixelMapusv",
        "Unsigned short version of #GetPixelMapfv().",

        GLenum.IN("map", "the pixel map parameter to query"),
        Check(32)..PIXEL_PACK_BUFFER..GLushort.p.OUT("data", "a buffer in which to place the returned data")
    )

    DeprecatedGL..void(
        "GetPixelMapuiv",
        "Unsigned integer version of #GetPixelMapfv().",

        GLenum.IN("map", "the pixel map parameter to query"),
        Check(32)..PIXEL_PACK_BUFFER..GLuint.p.OUT("data", "a buffer in which to place the returned data")
    )

    GL11C reuse "GetPointerv"

    DeprecatedGL..void(
        "GetPolygonStipple",
        "Obtains the polygon stipple.",

        Check(128)..PIXEL_PACK_BUFFER..void.p.OUT("pattern", "a buffer in which to place the returned data")
    )

    GL11C reuse "GetString"

    DeprecatedGL..void(
        "GetTexEnviv",
        "Returns integer information about {@code pname} for {@code env} in {@code data}.",

        GLenum.IN("env", "the texture environment to query", "#POINT_SPRITE #TEXTURE_ENV #TEXTURE_FILTER_CONTROL"),
        GLenum.IN(
            "pname",
            "the parameter to query",
            """
            #COORD_REPLACE #TEXTURE_ENV_MODE #TEXTURE_ENV_COLOR #TEXTURE_LOD_BIAS #COMBINE_RGB #COMBINE_ALPHA #SRC0_RGB
            #SRC1_RGB #SRC2_RGB #SRC0_ALPHA #SRC1_ALPHA #SRC2_ALPHA #OPERAND0_RGB #OPERAND1_RGB
            #OPERAND2_RGB #OPERAND0_ALPHA #OPERAND1_ALPHA #OPERAND2_ALPHA #RGB_SCALE #ALPHA_SCALE
            """
        ),
        Check(1)..ReturnParam..GLint.p.OUT("data", "a scalar or buffer in which to place the returned data")
    )

    DeprecatedGL..void(
        "GetTexEnvfv",
        "Float version of #GetTexEnviv().",

        GLenum.IN("env", "the texture environment to query"),
        GLenum.IN("pname", "the parameter to query"),
        Check(1)..ReturnParam..GLfloat.p.OUT("data", "a scalar or buffer in which to place the returned data")
    )

    DeprecatedGL..void(
        "GetTexGeniv",
        "Returns integer information about {@code pname} for {@code coord} in {@code data}.",

        GLenum.IN("coord", "the coord to query", TEX_COORDS),
        GLenum.IN("pname", "the parameter to query", "#EYE_PLANE #OBJECT_PLANE #TEXTURE_GEN_MODE"),
        Check(1)..ReturnParam..GLint.p.OUT("data", "a scalar or buffer in which to place the returned data")
    )

    DeprecatedGL..void(
        "GetTexGenfv",
        "Float version of #GetTexGeniv().",

        GLenum.IN("coord", "the coord to query"),
        GLenum.IN("pname", "the parameter to query"),
        Check(4)..ReturnParam..GLfloat.p.OUT("data", "a scalar or buffer in which to place the returned data")
    )

    DeprecatedGL..void(
        "GetTexGendv",
        "Double version of #GetTexGeniv().",

        GLenum.IN("coord", "the coord to query"),
        GLenum.IN("pname", "the parameter to query"),
        Check(4)..ReturnParam..GLdouble.p.OUT("data", "a scalar or buffer in which to place the returned data")
    )

    GL11C reuse "GetTexImage"
    GL11C reuse "GetTexLevelParameteriv"
    GL11C reuse "GetTexLevelParameterfv"
    GL11C reuse "GetTexParameteriv"
    GL11C reuse "GetTexParameterfv"
    GL11C reuse "Hint"

    val index = "the value to which the current color index should be set"

    DeprecatedGL..void(
        "Indexi",
        "Updates the current (single-valued) color index.",
        GLint.IN("index", index)
    )
    DeprecatedGL..void("Indexub", "Unsigned byte version of #Indexi().", GLubyte.IN("index", index))
    DeprecatedGL..void("Indexs", "Short version of #Indexi().", GLshort.IN("index", index))
    DeprecatedGL..void("Indexf", "Float version of #Indexi().", GLfloat.IN("index", index))
    DeprecatedGL..void("Indexd", "Double version of #Indexi().", GLdouble.IN("index", index))

    DeprecatedGL..void(
        "Indexiv",
        "Pointer version of #Indexi()",

        Check(1)..GLint.const.p.IN("index", index)
    )

    DeprecatedGL..void("Indexubv", "Pointer version of #Indexub().", Check(1)..GLubyte.const.p.IN("index", index))
    DeprecatedGL..void("Indexsv", "Pointer version of #Indexs().", Check(1)..GLshort.const.p.IN("index", index))
    DeprecatedGL..void("Indexfv", "Pointer version of #Indexf().", Check(1)..GLfloat.const.p.IN("index", index))
    DeprecatedGL..void("Indexdv", "Pointer version of #Indexd().", Check(1)..GLdouble.const.p.IN("index", index))

    DeprecatedGL..void(
        "IndexMask",
        """
        The least significant n bits of mask, where n is the number of bits in a color index buffer, specify a mask. Where a 1 appears in this mask, the
        corresponding bit in the color index buffer (or buffers) is written; where a 0 appears, the bit is not written. This mask applies only in color index
        mode.
        """,

        GLuint.IN("mask", "the color index mask value")
    )

    OffHeapOnly..DeprecatedGL..void(
        "IndexPointer",
        "Specifies the location and organization of a color index array.",

        AutoType("pointer", GL_UNSIGNED_BYTE, GL_SHORT, GL_INT)..GLenum.IN(
            "type",
            "the data type of the values stored in the array",
            "#UNSIGNED_BYTE #SHORT #INT #FLOAT #DOUBLE"
        ),
        GLsizei.IN("stride", "the vertex stride in bytes. If specified as zero, then array elements are stored sequentially"),
        Unsafe..ARRAY_BUFFER..void.const.p.IN("pointer", "the color index array data")
    )

    DeprecatedGL..void("InitNames", "Clears the selection name stack.")

    DeprecatedGL..void(
        "InterleavedArrays",
        "Efficiently initializes the six vertex arrays and their enables to one of 14 configurations.",

        GLenum.IN(
            "format",
            "the interleaved array format",
            """
            #V2F #V3F #C4UB_V2F #C4UB_V3F #C3F_V3F #N3F_V3F #C4F_N3F_V3F #T2F_V3F #T4F_V4F #T2F_C4UB_V3F #T2F_C3F_V3F
            #T2F_N3F_V3F #T2F_C4F_N3F_V3F #T4F_C4F_N3F_V4F
            """
        ),
        GLsizei.IN("stride", "the vertex stride in bytes. If specified as zero, then array elements are stored sequentially"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..ARRAY_BUFFER..void.const.p.IN("pointer", "the vertex array data")
    )

    GL11C reuse "IsEnabled"

    DeprecatedGL..GLboolean(
        "IsList",
        "Returns true if the {@code list} is the index of some display list.",

        GLuint.IN("list", "the list index to query")
    )

    GL11C reuse "IsTexture"

    DeprecatedGL..void(
        "LightModeli",
        "Set the integer value of a lighting model parameter.",

        GLenum.IN(
            "pname",
            "the lighting model parameter to set",
            "#LIGHT_MODEL_AMBIENT #LIGHT_MODEL_LOCAL_VIEWER #LIGHT_MODEL_TWO_SIDE #LIGHT_MODEL_COLOR_CONTROL"
        ),
        GLint.IN("param", "the parameter value")
    )

    DeprecatedGL..void(
        "LightModelf",
        "Float version of #LightModeli().",

        GLenum.IN("pname", "the lighting model parameter to set"),
        GLfloat.IN("param", "the parameter value")
    )

    DeprecatedGL..void(
        "LightModeliv",
        "Pointer version of #LightModeli().",

        GLenum.IN("pname", "the lighting model parameter to set"),
        Check(4)..GLint.const.p.IN("params", "the parameter value")
    )

    DeprecatedGL..void(
        "LightModelfv",
        "Pointer version of #LightModelf().",

        GLenum.IN("pname", "the lighting model parameter to set"),
        Check(4)..GLfloat.const.p.IN("params", "the parameter value")
    )

    DeprecatedGL..void(
        "Lighti",
        "Sets the integer value of a light parameter.",

        GLenum.IN("light", "the light for which to set the parameter", "#LIGHT0 GL_LIGHT[1-7]"),
        GLenum.IN(
            "pname",
            "the parameter to set",
            """
            #AMBIENT #DIFFUSE #SPECULAR #POSITION #CONSTANT_ATTENUATION #LINEAR_ATTENUATION #QUADRATIC_ATTENUATION
            #SPOT_DIRECTION #SPOT_EXPONENT #SPOT_CUTOFF
            """
        ),
        GLint.IN("param", "the parameter value")
    )

    DeprecatedGL..void(
        "Lightf",
        "Float version of #Lighti().",

        GLenum.IN("light", "the light for which to set the parameter"),
        GLenum.IN("pname", "the parameter to set"),
        GLfloat.IN("param", "the parameter value")
    )

    DeprecatedGL..void(
        "Lightiv",
        "Pointer version of #Lighti().",

        GLenum.IN("light", "the light for which to set the parameter"),
        GLenum.IN("pname", "the parameter to set"),
        Check(4)..GLint.const.p.IN("params", "the parameter value")
    )

    DeprecatedGL..void(
        "Lightfv",
        "Pointer version of #Lightf().",

        GLenum.IN("light", "the light for which to set the parameter"),
        GLenum.IN("pname", "the parameter to set"),
        Check(4)..GLfloat.const.p.IN("params", "the parameter value")
    )

    DeprecatedGL..void(
        "LineStipple",
        """
        Defines a line stipple. It determines those fragments that are to be drawn when the line is rasterized. Line stippling may be enabled or disabled using
        #Enable() or #Disable() with the constant #LINE_STIPPLE. When disabled, it is as if the line stipple has its default value.
        """,

        GLint.IN(
            "factor",
            """
            a count that is used to modify the effective line stipple by causing each bit in pattern to be used {@code factor} times. {@code factor} is clamped
            to the range [1, 256].
            """
        ),
        GLushort.IN("pattern", "an unsigned short integer whose 16 bits define the stipple pattern")
    )

    GL11C reuse "LineWidth"

    DeprecatedGL..void(
        "ListBase",
        "Sets the display list base.",

        GLuint.IN("base", "the display list base offset")
    )

    DeprecatedGL..void(
        "LoadMatrixf",
        """
        Sets the current matrix to a 4 &times; 4 matrix in column-major order.

        The matrix is stored as 16 consecutive values, i.e. as:
        ${table(
            tr(td("a1"), td("a5"), td("a9"), td("a13")),
            tr(td("a2"), td("a6"), td("a10"), td("a14")),
            tr(td("a3"), td("a7"), td("a11"), td("a15")),
            tr(td("a4"), td("a8"), td("a12"), td("a16"))
        )}

        This differs from the standard row-major ordering for matrix elements. If the standard ordering is used, all of the subsequent transformation equations
        are transposed, and the columns representing vectors become rows.
        """,

        Check(16)..GLfloat.const.p.IN("m", "the matrix data")
    )

    DeprecatedGL..void(
        "LoadMatrixd",
        "Double version of #LoadMatrixf().",

        Check(16)..GLdouble.const.p.IN("m", "the matrix data")
    )

    DeprecatedGL..void(
        "LoadIdentity",
        """
        Sets the current matrix to the identity matrix.

        Calling this function is equivalent to calling #LoadMatrixf() with the following matrix:
        ${table(
            tr(td("1"), td("0"), td("0"), td("0")),
            tr(td("0"), td("1"), td("0"), td("0")),
            tr(td("0"), td("0"), td("1"), td("0")),
            tr(td("0"), td("0"), td("0"), td("1"))
        )}
        """
    )

    DeprecatedGL..void(
        "LoadName",
        "Replaces the value on the top of the selection stack with {@code name}.",

        GLuint.IN("name", "the name to load")
    )

    GL11C reuse "LogicOp"

    DeprecatedGL..void(
        "Map1f",
        """
        Defines a polynomial or rational polynomial mapping to produce vertex, normal, texture coordinates and colors. The values so produced are sent on to
        further stages of the GL as if they had been provided directly by the client.
        """,

        GLenum.IN("target", "the evaluator target", MAP1_TARGETS),
        GLfloat.IN("u1", "the first endpoint of the pre-image of the map"),
        GLfloat.IN("u2", "the second endpoint of the pre-image of the map"),
        GLint.IN("stride", "the number of values in each block of storage"),
        GLint.IN("order", "the polynomial order"),
        Check("order * stride")..GLfloat.const.p.IN("points", "a set of {@code order} blocks of storage containing control points")
    )

    DeprecatedGL..void(
        "Map1d",
        "Double version of #Map1f().",

        GLenum.IN("target", "the evaluator target"),
        GLdouble.IN("u1", "the first endpoint of the pre-image of the map"),
        GLdouble.IN("u2", "the second endpoint of the pre-image of the map"),
        GLint.IN("stride", "the number of values in each block of storage"),
        GLint.IN("order", "the polynomial order"),
        Check("stride * order")..GLdouble.const.p.IN("points", "a set of {@code order} blocks of storage containing control points")
    )

    DeprecatedGL..void(
        "Map2f",
        "Bivariate version of #Map1f().",

        GLenum.IN("target", "the evaluator target"),
        GLfloat.IN("u1", "the first u-dimension endpoint of the pre-image rectangle of the map"),
        GLfloat.IN("u2", "the second u-dimension endpoint of the pre-image rectangle of the map"),
        GLint.IN("ustride", "the number of values in the u-dimension in each block of storage"),
        GLint.IN("uorder", "the polynomial order in the u-dimension"),
        GLfloat.IN("v1", "the first v-dimension endpoint of the pre-image rectangle of the map"),
        GLfloat.IN("v2", "the second v-dimension endpoint of the pre-image rectangle of the map"),
        GLint.IN("vstride", "the number of values in the v-dimension in each block of storage"),
        GLint.IN("vorder", "the polynomial order in the v-dimension"),
        Check("ustride * uorder * vstride * vorder")..GLfloat.const.p.IN("points", "a set of ${code("uorder &times; vorder")} blocks of storage containing control points")
    )

    DeprecatedGL..void(
        "Map2d",
        "Double version of #Map2f().",

        GLenum.IN("target", "the evaluator target"),
        GLdouble.IN("u1", "the first u-dimension endpoint of the pre-image rectangle of the map"),
        GLdouble.IN("u2", "the second u-dimension endpoint of the pre-image rectangle of the map"),
        GLint.IN("ustride", "the number of values in the u-dimension in each block of storage"),
        GLint.IN("uorder", "the polynomial order in the u-dimension"),
        GLdouble.IN("v1", "the first v-dimension endpoint of the pre-image rectangle of the map"),
        GLdouble.IN("v2", "the second v-dimension endpoint of the pre-image rectangle of the map"),
        GLint.IN("vstride", "the number of values in the v-dimension in each block of storage"),
        GLint.IN("vorder", "the polynomial order in the v-dimension"),
        Check("ustride * uorder * vstride * vorder")..GLdouble.const.p.IN("points", "a set of ${code("uorder &times; vorder")} blocks of storage containing control points")
    )

    DeprecatedGL..void(
        "MapGrid1f",
        "Defines a one-dimensional grid in the map evaluator domain.",

        GLint.IN("n", "the number of partitions of the interval"),
        GLfloat.IN("u1", "the first interval endpoint"),
        GLfloat.IN("u2", "the second interval endpoint")
    )

    DeprecatedGL..void(
        "MapGrid1d",
        "Double version of #MapGrid1f().",

        GLint.IN("n", "the number of partitions of the interval"),
        GLdouble.IN("u1", "the first interval endpoint"),
        GLdouble.IN("u2", "the second interval endpoint")
    )

    DeprecatedGL..void(
        "MapGrid2f",
        "Defines a two-dimensional grid in the map evaluator domain.",

        GLint.IN("un", "the number of partitions of the interval in the u-dimension"),
        GLfloat.IN("u1", "the first u-dimension interval endpoint"),
        GLfloat.IN("u2", "the second u-dimension interval endpoint"),
        GLint.IN("vn", "the number of partitions of the interval in the v-dimension"),
        GLfloat.IN("v1", "the first v-dimension interval endpoint"),
        GLfloat.IN("v2", "the second v-dimension interval endpoint")
    )

    DeprecatedGL..void(
        "MapGrid2d",
        "Double version of #MapGrid2f().",

        GLint.IN("un", "the number of partitions of the interval in the u-dimension"),
        GLdouble.IN("u1", "the first u-dimension interval endpoint"),
        GLdouble.IN("u2", "the second u-dimension interval endpoint"),
        GLint.IN("vn", "the number of partitions of the interval in the v-dimension"),
        GLdouble.IN("v1", "the first v-dimension interval endpoint"),
        GLdouble.IN("v2", "the second v-dimension interval endpoint")
    )

    DeprecatedGL..void(
        "Materiali",
        "Sets the integer value of a material parameter.",

        GLenum.IN("face", "the material face for which to set the parameter", "#FRONT #BACK #FRONT_AND_BACK"),
        GLenum.IN("pname", "the parameter to set", "#SHININESS"),
        GLint.IN("param", "the parameter value")
    )

    DeprecatedGL..void(
        "Materialf",
        "Float version of #Materiali().",

        GLenum.IN("face", "the material face for which to set the parameter"),
        GLenum.IN("pname", "the parameter to set"),
        GLfloat.IN("param", "the parameter value")
    )

    DeprecatedGL..void(
        "Materialiv",
        "Pointer version of #Materiali().",

        GLenum.IN("face", "the material face for which to set the parameter"),
        GLenum.IN("pname", "the parameter to set", "#AMBIENT #DIFFUSE #AMBIENT_AND_DIFFUSE #SPECULAR #EMISSION"),
        Check(4)..GLint.const.p.IN("params", "the parameter value")
    )

    DeprecatedGL..void(
        "Materialfv",
        "Pointer version of #Materialf().",

        GLenum.IN("face", "the material face for which to set the parameter"),
        GLenum.IN("pname", "the parameter to set"),
        Check(4)..GLfloat.const.p.IN("params", "the parameter value")
    )

    DeprecatedGL..void(
        "MatrixMode",
        "Set the current matrix mode.",

        GLenum.IN("mode", "the matrix mode", "#MODELVIEW #PROJECTION #TEXTURE #COLOR")
    )

    DeprecatedGL..void(
        "MultMatrixf",
        "Multiplies the current matrix with a 4 &times; 4 matrix in column-major order. See #LoadMatrixf() for details.",

        Check(16)..GLfloat.const.p.IN("m", "the matrix data")
    )

    DeprecatedGL..void(
        "MultMatrixd",
        "Double version of #MultMatrixf().",

        Check(16)..GLdouble.const.p.IN("m", "the matrix data")
    )

    DeprecatedGL..void(
        "Frustum",
        """
        Manipulates the current matrix with a matrix that produces perspective projection, in such a way that the coordinates ${code("(lb &ndash; n)<sup>T</sup>")}
        and ${code("(rt &ndash; n)<sup>T</sup>")} specify the points on the near clipping plane that are mapped to the lower left and upper right corners of the
        window, respectively (assuming that the eye is located at ${code("(0 0 0)<sup>T</sup>")}). {@code f} gives the distance from the eye to the far clipping
        plane.

        Calling this function is equivalent to calling #MultMatrixf() with the following matrix:
        ${table(
            tr(td("2n / (r - l)"), td("0"), td("(r + l) / (r - l)"), td("0")),
            tr(td("0"), td("2n / (t - b)"), td("(t + b) / (t - b)"), td("0")),
            tr(td("0"), td("0"), td("- (f + n) / (f - n)"), td("- (2fn) / (f - n)")),
            tr(td("0"), td("0"), td("-1"), td("0"))
        )}
        """,

        GLdouble.IN("l", "the left frustum plane"),
        GLdouble.IN("r", "the right frustum plane"),
        GLdouble.IN("b", "the bottom frustum plane"),
        GLdouble.IN("t", "the top frustum plane"),
        GLdouble.IN("n", "the near frustum plane"),
        GLdouble.IN("f", "the far frustum plane")
    )

    DeprecatedGL..void(
        "NewList",
        "Begins the definition of a display list.",

        GLuint.IN("n", "a positive integer to which the display list that follows is assigned"),
        GLenum.IN("mode", "a symbolic constant that controls the behavior of the GL during display list creation", "#COMPILE #COMPILE_AND_EXECUTE")
    )

    DeprecatedGL..void(
        "EndList",
        """
        Ends the definition of GL commands to be placed in a display list. It is only when {@code EndList} occurs that the specified display list is actually
        associated with the index indicated with #NewList().
        """
    )

    // Normal functions javadoc
    val normalX = "the x coordinate of the current normal"
    val normalY = "the y coordinate of the current normal"
    val normalZ = "the z coordinate of the current normal"
    val normalBuffer = "the normal buffer"

    DeprecatedGL..void("Normal3f", "Sets the current normal.", GLfloat.IN("nx", normalX), GLfloat.IN("ny", normalY), GLfloat.IN("nz", normalZ))
    DeprecatedGL..void("Normal3b", "Byte version of #Normal3f().", GLbyte.IN("nx", normalX), GLbyte.IN("ny", normalY), GLbyte.IN("nz", normalZ))
    DeprecatedGL..void("Normal3s", "Short version of #Normal3f().", GLshort.IN("nx", normalX), GLshort.IN("ny", normalY), GLshort.IN("nz", normalZ))
    DeprecatedGL..void("Normal3i", "Integer version of #Normal3f().", GLint.IN("nx", normalX), GLint.IN("ny", normalY), GLint.IN("nz", normalZ))
    DeprecatedGL..void("Normal3d", "Double version of #Normal3f().", GLdouble.IN("nx", normalX), GLdouble.IN("ny", normalY), GLdouble.IN("nz", normalZ))

    DeprecatedGL..void("Normal3fv", "Pointer version of #Normal3f().", Check(3)..GLfloat.const.p.IN("v", normalBuffer))
    DeprecatedGL..void("Normal3bv", "Pointer version of #Normal3b().", Check(3)..GLbyte.const.p.IN("v", normalBuffer))
    DeprecatedGL..void("Normal3sv", "Pointer version of #Normal3s().", Check(3)..GLshort.const.p.IN("v", normalBuffer))
    DeprecatedGL..void("Normal3iv", "Pointer version of #Normal3i().", Check(3)..GLint.const.p.IN("v", normalBuffer))
    DeprecatedGL..void("Normal3dv", "Pointer version of #Normal3d().", Check(3)..GLdouble.const.p.IN("v", normalBuffer))

    OffHeapOnly..DeprecatedGL..void(
        "NormalPointer",
        "Specifies the location and organization of a normal array.",

        GLenum.IN(
            "type",
            "the data type of the values stored in the array",
            "#BYTE #SHORT #INT #HALF_FLOAT #FLOAT #DOUBLE #UNSIGNED_INT_2_10_10_10_REV #INT_2_10_10_10_REV"
        ),
        GLsizei.IN("stride", "the vertex stride in bytes. If specified as zero, then array elements are stored sequentially"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..ARRAY_BUFFER..void.const.p.IN("pointer", "the normal array data")
    )

    DeprecatedGL..void(
        "Ortho",
        """
        Manipulates the current matrix with a matrix that produces parallel projection, in such a way that the coordinates ${code("(lb &ndash; n)<sup>T</sup>")}
        and ${code("(rt &ndash; n)<sup>T</sup>")} specify the points on the near clipping plane that are mapped to the lower left and upper right corners of the
        window, respectively (assuming that the eye is located at ${code("(0 0 0)<sup>T</sup>")}). {@code f} gives the distance from the eye to the far clipping
        plane.

        Calling this function is equivalent to calling #MultMatrixf() with the following matrix:
        ${table(
            tr(td("2 / (r - l)"), td("0"), td("0"), td("- (r + l) / (r - l)")),
            tr(td("0"), td("2 / (t - b)"), td("0"), td("- (t + b) / (t - b)")),
            tr(td("0"), td("0"), td("- 2 / (f - n)"), td("- (f + n) / (f - n)")),
            tr(td("0"), td("0"), td("0"), td("1"))
        )}
        """,

        GLdouble.IN("l", "the left frustum plane"),
        GLdouble.IN("r", "the right frustum plane"),
        GLdouble.IN("b", "the bottom frustum plane"),
        GLdouble.IN("t", "the top frustum plane"),
        GLdouble.IN("n", "the near frustum plane"),
        GLdouble.IN("f", "the far frustum plane")
    )

    DeprecatedGL..void(
        "PassThrough",
        """
        Inserts a marker when the GL is in feeback mode. {@code token} is returned as if it were a primitive; it is indicated with its own unique identifying
        value. The ordering of any {@code PassThrough} commands with respect to primitive specification is maintained by feedback. {@code PassThrough} may
        not occur between #Begin() and #End().
        """,

        GLfloat.IN("token", "the marker value to insert")
    )

    DeprecatedGL..void(
        "PixelMapfv",
        "Sets a pixel map lookup table.",

        GLenum.IN("map", "the map to set", PIXEL_MAP_NAMES),
        AutoSize("values")..GLsizei.IN("size", "the map size"),
        PIXEL_UNPACK_BUFFER..GLfloat.const.p.IN("values", "the map values")
    )

    DeprecatedGL..void(
        "PixelMapusv",
        "Unsigned short version of #PixelMapfv().",

        GLenum.IN("map", "the map to set"),
        AutoSize("values")..GLsizei.IN("size", "the map size"),
        PIXEL_UNPACK_BUFFER..GLushort.const.p.IN("values", "the map values")
    )

    DeprecatedGL..void(
        "PixelMapuiv",
        "Unsigned integer version of #PixelMapfv().",

        GLenum.IN("map", "the map to set"),
        AutoSize("values")..GLsizei.IN("size", "the map size"),
        PIXEL_UNPACK_BUFFER..GLuint.const.p.IN("values", "the map values")
    )

    GL11C reuse "PixelStorei"
    GL11C reuse "PixelStoref"

    DeprecatedGL..void(
        "PixelTransferi",
        "Sets the integer value of a pixel transfer parameter.",

        GLenum.IN(
            "pname",
            "the pixel transfer parameter to set",
            """
            #MAP_COLOR #MAP_STENCIL #INDEX_SHIFT #INDEX_OFFSET #RED_SCALE #GREEN_SCALE #BLUE_SCALE #ALPHA_SCALE #DEPTH_SCALE
            #RED_BIAS #GREEN_BIAS #BLUE_BIAS #ALPHA_BIAS #DEPTH_BIAS
            #POST_CONVOLUTION_RED_SCALE #POST_CONVOLUTION_RED_BIAS #POST_COLOR_MATRIX_RED_SCALE
            #POST_COLOR_MATRIX_RED_BIAS #POST_CONVOLUTION_GREEN_SCALE #POST_CONVOLUTION_GREEN_BIAS
            #POST_COLOR_MATRIX_GREEN_SCALE #POST_COLOR_MATRIX_GREEN_BIAS #POST_CONVOLUTION_BLUE_SCALE
            #POST_CONVOLUTION_BLUE_BIAS #POST_COLOR_MATRIX_BLUE_SCALE #POST_COLOR_MATRIX_BLUE_BIAS
            #POST_CONVOLUTION_ALPHA_SCALE #POST_CONVOLUTION_ALPHA_BIAS #POST_COLOR_MATRIX_ALPHA_SCALE
            #POST_COLOR_MATRIX_ALPHA_BIAS
            """
        ),
        GLint.IN("param", "the parameter value")
    )

    DeprecatedGL..void(
        "PixelTransferf",
        "Float version of #PixelTransferi().",

        GLenum.IN("pname", "the pixel transfer parameter to set"),
        GLfloat.IN("param", "the parameter value")
    )

    DeprecatedGL..void(
        "PixelZoom",
        """
        Controls the conversion of a group of fragments.

        Let (x<sub>rp</sub>, y<sub>rp</sub>) be the current raster position. If a particular group is the n<sup>th</sup> in a row and belongs to the
        m<sup>th</sup> row, consider the region in window coordinates bounded by the rectangle with corners

        (x<sub>rp</sub> + z<sub>x</sub>n, y<sub>rp</sub> + z<sub>y</sub>m) and (x<sub>rp</sub> + z<sub>x</sub>(n + 1), y<sub>rp</sub> + z<sub>y</sub>(m + 1))

        (either z<sub>x</sub> or z<sub>y</sub> may be negative). A fragment representing group {@code (n, m)} is produced for each framebuffer pixel inside, or
        on the bottom or left boundary, of this rectangle.
        """,

        GLfloat.IN("xfactor", "the z<sub>x</sub> factor"),
        GLfloat.IN("yfactor", "the z<sub>y</sub> factor")
    )

    GL11C reuse "PointSize"
    GL11C reuse "PolygonMode"
    GL11C reuse "PolygonOffset"

    DeprecatedGL..void(
        "PolygonStipple",
        """
        Defines a polygon stipple. It works much the same way as #LineStipple(), masking out certain fragments produced by rasterization so that they
        are not sent to the next stage of the GL. This is the case regardless of the state of polygon antialiasing.

        If x<sub>w</sub> and y<sub>w</sub> are the window coordinates of a rasterized polygon fragment, then that fragment is sent to the next stage of the GL
        if and only if the bit of the pattern (x<sub>w</sub> mod 32, y<sub>w</sub> mod 32) is 1.

        Polygon stippling may be enabled or disabled with #Enable() or #Disable() using the constant #POLYGON_STIPPLE. When disabled,
        it is as if the stipple pattern were all ones.
        """,

        Check(128)..PIXEL_UNPACK_BUFFER..GLubyte.const.p.IN("pattern", "a pointer to memory into which a 32 &times; 32 pattern is packed")
    )

    DeprecatedGL..void(
        "PushAttrib",
        """
        Takes a bitwise OR of symbolic constants indicating which groups of state variables to push onto the server attribute stack. Each constant refers to a
        group of state variables.

        Bits set in mask that do not correspond to an attribute group are ignored. The special mask value #ALL_ATTRIB_BITS may be used to push all
        stackable server state.

        A #STACK_OVERFLOW error is generated if {@code PushAttrib} is called and the attribute stack depth is equal to the value of
        #MAX_ATTRIB_STACK_DEPTH.
        """,

        GLbitfield.IN(
            "mask",
            "the state variables to push",
            """
            #ACCUM_BUFFER_BIT #COLOR_BUFFER_BIT #CURRENT_BIT #DEPTH_BUFFER_BIT #ENABLE_BIT #EVAL_BIT #FOG_BIT #HINT_BIT #LIGHTING_BIT
            #LINE_BIT #LIST_BIT #MULTISAMPLE_BIT #PIXEL_MODE_BIT #POINT_BIT #POLYGON_BIT #POLYGON_STIPPLE_BIT #SCISSOR_BIT
            #STENCIL_BUFFER_BIT #TEXTURE_BIT #TRANSFORM_BIT #VIEWPORT_BIT #ALL_ATTRIB_BITS
            """, LinkMode.BITFIELD
        )
    )

    DeprecatedGL..void(
        "PushClientAttrib",
        """
        Takes a bitwise OR of symbolic constants indicating which groups of state variables to push onto the client attribute stack. Each constant refers to a
        group of state variables.

        Bits set in mask that do not correspond to an attribute group are ignored. The special mask value #CLIENT_ALL_ATTRIB_BITS may be used to push
        all stackable client state.

        A #STACK_OVERFLOW error is generated if {@code PushAttrib} is called and the client attribute stack depth is equal to the value of
        #MAX_CLIENT_ATTRIB_STACK_DEPTH.
        """,

        GLbitfield.IN("mask", "the state variables to push", "#CLIENT_VERTEX_ARRAY_BIT #CLIENT_PIXEL_STORE_BIT #CLIENT_ALL_ATTRIB_BITS", LinkMode.BITFIELD)
    )

    DeprecatedGL..void(
        "PopAttrib",
        "Resets the values of those state variables that were saved with the last #PushAttrib(). Those not saved remain unchanged."
    )

    DeprecatedGL..void(
        "PopClientAttrib",
        "Resets the values of those state variables that were saved with the last #PushClientAttrib(). Those not saved remain unchanged."
    )

    DeprecatedGL..void(
        "PopMatrix",
        "Pops the top entry off the current matrix stack, replacing the current matrix with the matrix that was the second entry in the stack."
    )

    DeprecatedGL..void("PopName", "Pops one name off the top of the selection name stack.")

    DeprecatedGL..void(
        "PrioritizeTextures",
        """
        Sets the priority of texture objects. Each priority value is clamped to the range [0, 1] before it is assigned. Zero indicates the lowest priority, with
        the least likelihood of being resident. One indicates the highest priority, with the greatest likelihood of being resident.
        """,

        AutoSize("textures", "priorities")..GLsizei.IN("n", "the number of texture object priorities to set"),
        GLuint.const.p.IN("textures", "an array of texture object names"),
        GLfloat.const.p.IN("priorities", "an array of texture object priorities")
    )


    DeprecatedGL..void("PushMatrix", "Pushes the current matrix stack down by one, duplicating the current matrix in both the top of the stack and the entry below it.")

    DeprecatedGL..void(
        "PushName",
        "Causes {@code name} to be pushed onto the selection name stack.",

        GLuint.IN("name", "the name to push")
    )

    // RasterPos functions javadoc
    val rasterX = "the {@code x} raster coordinate"
    val rasterY = "the {@code y} raster coordinate"
    val rasterZ = "the {@code z} raster coordinate"
    val rasterW = "the {@code w} raster coordinate"
    val rasterBuffer = "the raster position buffer"

    DeprecatedGL..void(
        "RasterPos2i",
        """
        Sets the two-dimensional current raster position. {@code z} is implicitly set to 0 and {@code w} implicitly set to 1.

        The coordinates are treated as if they were specified in a Vertex command. If a vertex shader is active, this vertex shader is executed using the x, y,
        z, and w coordinates as the object coordinates of the vertex. Otherwise, the x, y, z, and w coordinates are transformed by the current model-view and
        projection matrices. These coordinates, along with current values, are used to generate primary and secondary colors and texture coordinates just as is
        done for a vertex. The colors and texture coordinates so produced replace the colors and texture coordinates stored in the current raster position's
        associated data.
        """,

        GLint.IN("x", rasterX),
        GLint.IN("y", rasterY)
    )

    DeprecatedGL..void("RasterPos2s", "Short version of #RasterPos2i().", GLshort.IN("x", rasterX), GLshort.IN("y", rasterY))
    DeprecatedGL..void("RasterPos2f", "Float version of #RasterPos2i().", GLfloat.IN("x", rasterX), GLfloat.IN("y", rasterY))
    DeprecatedGL..void("RasterPos2d", "Double version of #RasterPos2i().", GLdouble.IN("x", rasterX), GLdouble.IN("y", rasterY))

    DeprecatedGL..void("RasterPos2iv", "Pointer version of #RasterPos2i().", Check(2)..GLint.const.p.IN("coords", rasterBuffer))
    DeprecatedGL..void("RasterPos2sv", "Pointer version of #RasterPos2s().", Check(2)..GLshort.const.p.IN("coords", rasterBuffer))
    DeprecatedGL..void("RasterPos2fv", "Pointer version of #RasterPos2f().", Check(2)..GLfloat.const.p.IN("coords", rasterBuffer))
    DeprecatedGL..void("RasterPos2dv", "Pointer version of #RasterPos2d().", Check(2)..GLdouble.const.p.IN("coords", rasterBuffer))

    DeprecatedGL..void(
        "RasterPos3i",
        "Sets the three-dimensional current raster position. {@code w} is implicitly set to 1. See #RasterPos2i() for more details.",

        GLint.IN("x", rasterX),
        GLint.IN("y", rasterY),
        GLint.IN("z", rasterZ)
    )

    DeprecatedGL..void("RasterPos3s", "Short version of #RasterPos3i().", GLshort.IN("x", rasterX), GLshort.IN("y", rasterY), GLshort.IN("z", rasterZ))
    DeprecatedGL..void("RasterPos3f", "Float version of #RasterPos3i().", GLfloat.IN("x", rasterX), GLfloat.IN("y", rasterY), GLfloat.IN("z", rasterZ))
    DeprecatedGL..void("RasterPos3d", "Double version of #RasterPos3i().", GLdouble.IN("x", rasterX), GLdouble.IN("y", rasterY), GLdouble.IN("z", rasterZ))

    DeprecatedGL..void("RasterPos3iv", "Pointer version of #RasterPos3i().", Check(3)..GLint.const.p.IN("coords", rasterBuffer))
    DeprecatedGL..void("RasterPos3sv", "Pointer version of #RasterPos3s().", Check(3)..GLshort.const.p.IN("coords", rasterBuffer))
    DeprecatedGL..void("RasterPos3fv", "Pointer version of #RasterPos3f().", Check(3)..GLfloat.const.p.IN("coords", rasterBuffer))
    DeprecatedGL..void("RasterPos3dv", "Pointer version of #RasterPos3d().", Check(3)..GLdouble.const.p.IN("coords", rasterBuffer))

    DeprecatedGL..void(
        "RasterPos4i",
        "Sets the four-dimensional current raster position. See #RasterPos2i() for more details.",

        GLint.IN("x", rasterX),
        GLint.IN("y", rasterY),
        GLint.IN("z", rasterZ),
        GLint.IN("w", rasterW)
    )

    DeprecatedGL..void("RasterPos4s", "Short version of #RasterPos4i().", GLshort.IN("x", rasterX), GLshort.IN("y", rasterY), GLshort.IN("z", rasterZ), GLshort.IN("w", rasterW))
    DeprecatedGL..void("RasterPos4f", "Float version of RasterPos4i.", GLfloat.IN("x", rasterX), GLfloat.IN("y", rasterY), GLfloat.IN("z", rasterZ), GLfloat.IN("w", rasterW))
    DeprecatedGL..void("RasterPos4d", "Double version of #RasterPos4i().", GLdouble.IN("x", rasterX), GLdouble.IN("y", rasterY), GLdouble.IN("z", rasterZ), GLdouble.IN("w", rasterW))

    DeprecatedGL..void("RasterPos4iv", "Pointer version of #RasterPos4i().", Check(4)..GLint.const.p.IN("coords", rasterBuffer))
    DeprecatedGL..void("RasterPos4sv", "Pointer version of #RasterPos4s().", Check(4)..GLshort.const.p.IN("coords", rasterBuffer))
    DeprecatedGL..void("RasterPos4fv", "Pointer version of #RasterPos4f().", Check(4)..GLfloat.const.p.IN("coords", rasterBuffer))
    DeprecatedGL..void("RasterPos4dv", "Pointer version of #RasterPos4d().", Check(4)..GLdouble.const.p.IN("coords", rasterBuffer))

    GL11C reuse "ReadBuffer"
    GL11C reuse "ReadPixels"

    // Rect functions javadoc
    val rectX1 = "the x coordinate of the first corner vertex"
    val rectY1 = "the y coordinate of the first corner vertex"
    val rectX2 = "the x coordinate of the second corner vertex"
    val rectY2 = "the y coordinate of the second corner vertex"
    val rectBuffer1 = "the first vertex buffer"
    val rectBuffer2 = "the second vertex buffer"

    DeprecatedGL..void(
        "Recti",
        """
        Specifies a rectangle as two corner vertices. The effect of the Rect command

        {@code Rect(x1, y1, x2, y2);}

        is exactly the same as the following sequence of commands:
        {@code
        Begin(POLYGON);
            Vertex2(x1, y1);
            Vertex2(x2, y1);
            Vertex2(x2, y2);
            Vertex2(x1, y2);
        End();}

        The appropriate Vertex2 command would be invoked depending on which of the Rect commands is issued.
        """,

        GLint.IN("x1", rectX1),
        GLint.IN("y1", rectY1),
        GLint.IN("x2", rectX2),
        GLint.IN("y2", rectY2)
    )

    DeprecatedGL..void("Rects", "Short version of #Recti().", GLshort.IN("x1", rectX1), GLshort.IN("y1", rectY1), GLshort.IN("x2", rectX2), GLshort.IN("y2", rectY2))
    DeprecatedGL..void("Rectf", "Float version of #Recti().", GLfloat.IN("x1", rectX1), GLfloat.IN("y1", rectY1), GLfloat.IN("x2", rectX2), GLfloat.IN("y2", rectY2))
    DeprecatedGL..void("Rectd", "Double version of #Recti().", GLdouble.IN("x1", rectX1), GLdouble.IN("y1", rectY1), GLdouble.IN("x2", rectX2), GLdouble.IN("y2", rectY2))

    DeprecatedGL..void("Rectiv", "Pointer version of #Recti().", Check(2)..GLint.const.p.IN("v1", rectBuffer1), Check(2)..GLint.const.p.IN("v2", rectBuffer2))
    DeprecatedGL..void("Rectsv", "Pointer version of #Rects().", Check(2)..GLshort.const.p.IN("v1", rectBuffer1), Check(2)..GLshort.const.p.IN("v2", rectBuffer2))
    DeprecatedGL..void("Rectfv", "Pointer version of #Rectf().", Check(2)..GLfloat.const.p.IN("v1", rectBuffer1), Check(2)..GLfloat.const.p.IN("v2", rectBuffer2))
    DeprecatedGL..void("Rectdv", "Pointer version of #Rectd().", Check(2)..GLdouble.const.p.IN("v1", rectBuffer1), Check(2)..GLdouble.const.p.IN("v2", rectBuffer2))

    DeprecatedGL..GLint(
        "RenderMode",
        "Sets the current render mode. The default is #RENDER.",

        GLenum.IN("mode", "the render mode", "#RENDER #SELECT #FEEDBACK")
    )

    DeprecatedGL..void(
        "Rotatef",
        """
        Manipulates the current matrix with a rotation matrix.

        {@code angle} gives an angle of rotation in degrees; the coordinates of a vector v are given by ${code("v = (x y z)<sup>T</sup>")}. The computed matrix
        is a counter-clockwise rotation about the line through the origin with the specified axis when that axis is pointing up (i.e. the right-hand rule
        determines the sense of the rotation angle). The matrix is thus
        ${table(
            tr(td("<b>R</b>", 3, 3), td("0")),
            tr(td("0")),
            tr(td("0")),
            tr(td("0"), td("0"), td("0"), td("1"))
        )}

        Let <code>u = v / ||v|| = (x' y' z')<sup>T</sup></code>. If <b>S</b> =
        ${table(
            tr(td("0"), td("-z'"), td("y'")),
            tr(td("z'"), td("0"), td("-x'")),
            tr(td("-y'"), td("x'"), td("0"))
        )}

        then ${code("<b>R</b> = uu<sup>T</sup> + cos(angle)(I - uu<sup>T</sup>) + sin(angle)<b>S</b>")}
        """,

        GLfloat.IN("angle", "the angle of rotation in degrees"),
        GLfloat.IN("x", "the x coordinate of the rotation vector"),
        GLfloat.IN("y", "the y coordinate of the rotation vector"),
        GLfloat.IN("z", "the z coordinate of the rotation vector")
    )

    DeprecatedGL..void(
        "Rotated",
        "Double version of #Rotatef().",

        GLdouble.IN("angle", "the angle of rotation in degrees"),
        GLdouble.IN("x", "the x coordinate of the rotation vector"),
        GLdouble.IN("y", "the y coordinate of the rotation vector"),
        GLdouble.IN("z", "the z coordinate of the rotation vector")
    )

    DeprecatedGL..void(
        "Scalef",
        """
        Manipulates the current matrix with a general scaling matrix along the x-, y- and z- axes.

        Calling this function is equivalent to calling #MultMatrixf() with the following matrix:
        ${table(
            tr(td("x"), td("0"), td("0"), td("0")),
            tr(td("0"), td("y"), td("0"), td("0")),
            tr(td("0"), td("0"), td("z"), td("0")),
            tr(td("0"), td("0"), td("0"), td("1"))
        )}
        """,

        GLfloat.IN("x", "the x-axis scaling factor"),
        GLfloat.IN("y", "the y-axis scaling factor"),
        GLfloat.IN("z", "the z-axis scaling factor")
    )

    DeprecatedGL..void(
        "Scaled",
        "Double version of #Scalef().",

        GLdouble.IN("x", "the x-axis scaling factor"),
        GLdouble.IN("y", "the y-axis scaling factor"),
        GLdouble.IN("z", "the z-axis scaling factor")
    )

    GL11C reuse "Scissor"

    DeprecatedGL..void(
        "SelectBuffer",
        "Sets the selection array.",

        AutoSize("buffer")..GLsizei.IN("size", "the maximum number of values that can be stored in {@code buffer}"),
        GLuint.p.OUT("buffer", "an array of unsigned integers to be potentially filled names")
    )

    DeprecatedGL..void(
        "ShadeModel",
        """
        Sets the current shade mode. The initial value of the shade mode is #SMOOTH.

        If mode is #SMOOTH, vertex colors are treated individually. If mode is #FLAT, flatshading is enabled and colors are taken from the
        provoking vertex of the primitive. The colors selected are those derived from current values, generated by lighting, or generated by vertex shading, if
        lighting is disabled, enabled, or a vertex shader is in use, respectively.
        """,

        GLenum.IN("mode", "the shade mode", "#SMOOTH #FLAT")
    )

    GL11C reuse "StencilFunc"
    GL11C reuse "StencilMask"
    GL11C reuse "StencilOp"

    // TexCoord functions javadoc
    val texCoordS = "the s component of the current texture coordinates"
    val texCoordT = "the t component of the current texture coordinates"
    val texCoordR = "the r component of the current texture coordinates"
    val texCoordQ = "the q component of the current texture coordinates"
    val texCoordBuffer = "the texture coordinate buffer"

    DeprecatedGL..void(
        "TexCoord1f",
        "Sets the current one-dimensional texture coordinate. {@code t} and {@code r} are implicitly set to 0 and {@code q} to 1.",

        GLfloat.IN("s", texCoordS)
    )

    DeprecatedGL..void("TexCoord1s", "Short version of #TexCoord1f().", GLshort.IN("s", texCoordS))
    DeprecatedGL..void("TexCoord1i", "Integer version of #TexCoord1f().", GLint.IN("s", texCoordS))
    DeprecatedGL..void("TexCoord1d", "Double version of #TexCoord1f().", GLdouble.IN("s", texCoordS))

    DeprecatedGL..void("TexCoord1fv", "Pointer version of #TexCoord1f().", Check(1)..GLfloat.const.p.IN("v", texCoordBuffer))
    DeprecatedGL..void("TexCoord1sv", "Pointer version of #TexCoord1s().", Check(1)..GLshort.const.p.IN("v", texCoordBuffer))
    DeprecatedGL..void("TexCoord1iv", "Pointer version of #TexCoord1i().", Check(1)..GLint.const.p.IN("v", texCoordBuffer))
    DeprecatedGL..void("TexCoord1dv", "Pointer version of #TexCoord1d().", Check(1)..GLdouble.const.p.IN("v", texCoordBuffer))

    DeprecatedGL..void(
        "TexCoord2f",
        "Sets the current two-dimensional texture coordinate. {@code r} is implicitly set to 0 and {@code q} to 1.",

        GLfloat.IN("s", texCoordS),
        GLfloat.IN("t", texCoordT)
    )

    DeprecatedGL..void("TexCoord2s", "Short version of #TexCoord2f().", GLshort.IN("s", texCoordS), GLshort.IN("t", texCoordT))
    DeprecatedGL..void("TexCoord2i", "Integer version of #TexCoord2f().", GLint.IN("s", texCoordS), GLint.IN("t", texCoordT))
    DeprecatedGL..void("TexCoord2d", "Double version of #TexCoord2f().", GLdouble.IN("s", texCoordS), GLdouble.IN("t", texCoordT))

    DeprecatedGL..void("TexCoord2fv", "Pointer version of #TexCoord2f().", Check(2)..GLfloat.const.p.IN("v", texCoordBuffer))
    DeprecatedGL..void("TexCoord2sv", "Pointer version of #TexCoord2s().", Check(2)..GLshort.const.p.IN("v", texCoordBuffer))
    DeprecatedGL..void("TexCoord2iv", "Pointer version of #TexCoord2i().", Check(2)..GLint.const.p.IN("v", texCoordBuffer))
    DeprecatedGL..void("TexCoord2dv", "Pointer version of #TexCoord2d().", Check(2)..GLdouble.const.p.IN("v", texCoordBuffer))

    DeprecatedGL..void(
        "TexCoord3f",
        "Sets the current three-dimensional texture coordinate. {@code q} is implicitly set to 1.",

        GLfloat.IN("s", texCoordS),
        GLfloat.IN("t", texCoordT),
        GLfloat.IN("r", texCoordR)
    )

    DeprecatedGL..void("TexCoord3s", "Short version of #TexCoord3f().", GLshort.IN("s", texCoordS), GLshort.IN("t", texCoordT), GLshort.IN("r", texCoordR))
    DeprecatedGL..void("TexCoord3i", "Integer version of #TexCoord3f().", GLint.IN("s", texCoordS), GLint.IN("t", texCoordT), GLint.IN("r", texCoordR))
    DeprecatedGL..void("TexCoord3d", "Double version of #TexCoord3f().", GLdouble.IN("s", texCoordS), GLdouble.IN("t", texCoordT), GLdouble.IN("r", texCoordR))

    DeprecatedGL..void("TexCoord3fv", "Pointer version of #TexCoord3f().", Check(3)..GLfloat.const.p.IN("v", texCoordBuffer))
    DeprecatedGL..void("TexCoord3sv", "Pointer version of #TexCoord3s().", Check(3)..GLshort.const.p.IN("v", texCoordBuffer))
    DeprecatedGL..void("TexCoord3iv", "Pointer version of #TexCoord3i().", Check(3)..GLint.const.p.IN("v", texCoordBuffer))
    DeprecatedGL..void("TexCoord3dv", "Pointer version of #TexCoord3d().", Check(3)..GLdouble.const.p.IN("v", texCoordBuffer))

    DeprecatedGL..void(
        "TexCoord4f",
        "Sets the current four-dimensional texture coordinate.",

        GLfloat.IN("s", texCoordS),
        GLfloat.IN("t", texCoordT),
        GLfloat.IN("r", texCoordR),
        GLfloat.IN("q", texCoordQ)
    )

    DeprecatedGL..void("TexCoord4s", "Short version of #TexCoord4f().", GLshort.IN("s", texCoordS), GLshort.IN("t", texCoordT), GLshort.IN("r", texCoordR), GLshort.IN("q", texCoordQ))
    DeprecatedGL..void("TexCoord4i", "Integer version of #TexCoord4f().", GLint.IN("s", texCoordS), GLint.IN("t", texCoordT), GLint.IN("r", texCoordR), GLint.IN("q", texCoordQ))
    DeprecatedGL..void("TexCoord4d", "Double version of #TexCoord4f().", GLdouble.IN("s", texCoordS), GLdouble.IN("t", texCoordT), GLdouble.IN("r", texCoordR), GLdouble.IN("q", texCoordQ))

    DeprecatedGL..void("TexCoord4fv", "Pointer version of #TexCoord4f().", Check(4)..GLfloat.const.p.IN("v", texCoordBuffer))
    DeprecatedGL..void("TexCoord4sv", "Pointer version of #TexCoord4s().", Check(4)..GLshort.const.p.IN("v", texCoordBuffer))
    DeprecatedGL..void("TexCoord4iv", "Pointer version of #TexCoord4i().", Check(4)..GLint.const.p.IN("v", texCoordBuffer))
    DeprecatedGL..void("TexCoord4dv", "Pointer version of #TexCoord4d().", Check(4)..GLdouble.const.p.IN("v", texCoordBuffer))

    OffHeapOnly..DeprecatedGL..void(
        "TexCoordPointer",
        "Specifies the location and organization of a texture coordinate array.",

        GLint.IN("size", "the number of values per vertex that are stored in the array", "1 2 3 4"),
        GLenum.IN(
            "type",
            "the data type of the values stored in the array",
            "#SHORT #INT #HALF_FLOAT #FLOAT #DOUBLE #UNSIGNED_INT_2_10_10_10_REV #INT_2_10_10_10_REV"
        ),
        GLsizei.IN("stride", "the vertex stride in bytes. If specified as zero, then array elements are stored sequentially"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..ARRAY_BUFFER..void.const.p.IN("pointer", "the texture coordinate array data")
    )

    DeprecatedGL..void(
        "TexEnvi",
        """
        Sets parameters of the texture environment that specifies how texture values are interpreted when texturing a fragment, or sets per-texture-unit
        filtering parameters.
        """,

        GLenum.IN("target", "the texture environment target", "#TEXTURE_ENV #TEXTURE_FILTER_CONTROL #POINT_SPRITE"),
        GLenum.IN(
            "pname",
            "the parameter to set",
            """
            #COORD_REPLACE #TEXTURE_ENV_MODE #TEXTURE_LOD_BIAS #COMBINE_RGB #COMBINE_ALPHA #SRC0_RGB #SRC1_RGB
            #SRC2_RGB #SRC0_ALPHA #SRC1_ALPHA #SRC2_ALPHA #OPERAND0_RGB #OPERAND1_RGB #OPERAND2_RGB
            #OPERAND0_ALPHA #OPERAND1_ALPHA #OPERAND2_ALPHA #RGB_SCALE #ALPHA_SCALE
            """
        ),
        GLint.IN(
            "param",
            "the parameter value. Scalar value or",
            """
            #REPLACE #MODULATE #DECAL #BLEND #ADD #COMBINE
            #ADD_SIGNED #INTERPOLATE #SUBTRACT #DOT3_RGB #DOT3_RGBA
            #TEXTURE #TEXTURE0 GL13.GL_TEXTURE[1-31] #CONSTANT #PRIMARY_COLOR #PREVIOUS
            """, LinkMode.SINGLE_CNT
        )
    )

    DeprecatedGL..void(
        "TexEnviv",
        "Pointer version of #TexEnvi().",

        GLenum.IN("target", "the texture environment target", "#TEXTURE_ENV"),
        GLenum.IN("pname", "the parameter to set", "#TEXTURE_ENV_COLOR"),
        Check(4)..GLint.const.p.IN("params", "the parameter value")
    )


    DeprecatedGL..void(
        "TexEnvf",
        "Float version of #TexEnvi().",

        GLenum.IN("target", "the texture environment target"),
        GLenum.IN("pname", "the parameter to set"),
        GLfloat.IN("param", "the parameter value")
    )

    DeprecatedGL..void(
        "TexEnvfv",
        "Pointer version of #TexEnvf().",

        GLenum.IN("target", "the texture environment target", "#TEXTURE_ENV"),
        GLenum.IN("pname", "the parameter to set", "#TEXTURE_ENV_COLOR"),
        Check(4)..GLfloat.const.p.IN("params", "the parameter value")
    )

    DeprecatedGL..void(
        "TexGeni",
        """
        Sets an integer texture coordinate generation parameter.

        A texture coordinate generation function is enabled or disabled using #Enable() and #Disable() with an argument of
        #TEXTURE_GEN_S, #TEXTURE_GEN_T, #TEXTURE_GEN_R, or #TEXTURE_GEN_Q (each indicates the corresponding texture
        coordinate). When enabled, the specified texture coordinate is computed according to the current #EYE_LINEAR, #OBJECT_LINEAR or
        #SPHERE_MAP specification, depending on the current setting of #TEXTURE_GEN_MODE for that coordinate. When disabled, subsequent
        vertices will take the indicated texture coordinate from the current texture coordinates.

        The initial state has the texture generation function disabled for all texture coordinates. Initially all texture generation modes are EYE_LINEAR.
        """,

        GLenum.IN("coord", "the coordinate for which to set the parameter", TEX_COORDS),
        GLenum.IN("pname", "the parameter to set", "#TEXTURE_GEN_MODE"),
        GLint.IN("param", "the parameter value", "#OBJECT_LINEAR #EYE_LINEAR #SPHERE_MAP #REFLECTION_MAP #NORMAL_MAP")
    )

    DeprecatedGL..void(
        "TexGeniv",
        "Pointer version of #TexGeni().",

        GLenum.IN("coord", "the coordinate for which to set the parameter"),
        GLenum.IN("pname", "the parameter to set", "#OBJECT_PLANE #EYE_PLANE"),
        Check(4)..GLint.const.p.IN("params", "the parameter value")
    )

    DeprecatedGL..void(
        "TexGenf",
        "Float version of #TexGeni().",

        GLenum.IN("coord", "the coordinate for which to set the parameter"),
        GLenum.IN("pname", "the parameter to set"),
        GLfloat.IN("param", "the parameter value")
    )

    DeprecatedGL..void(
        "TexGenfv",
        "Pointer version of #TexGenf().",

        GLenum.IN("coord", "the coordinate for which to set the parameter"),
        GLenum.IN("pname", "the parameter to set", "#OBJECT_PLANE #EYE_PLANE"),
        Check(4)..GLfloat.const.p.IN("params", "the parameter value")
    )

    DeprecatedGL..void(
        "TexGend",
        "Double version of #TexGeni().",

        GLenum.IN("coord", "the coordinate for which to set the parameter"),
        GLenum.IN("pname", "the parameter to set"),
        GLdouble.IN("param", "the parameter value")
    )

    DeprecatedGL..void(
        "TexGendv",
        "Pointer version of #TexGend().",

        GLenum.IN("coord", "the coordinate for which to set the parameter"),
        GLenum.IN("pname", "the parameter to set"),
        Check(4)..GLdouble.const.p.IN("params", "the parameter value")
    )

    GL11C reuse "TexImage1D"
    GL11C reuse "TexImage2D"
    GL11C reuse "CopyTexImage1D"
    GL11C reuse "CopyTexImage2D"
    GL11C reuse "CopyTexSubImage1D"
    GL11C reuse "CopyTexSubImage2D"
    GL11C reuse "TexParameteri"
    GL11C reuse "TexParameteriv"
    GL11C reuse "TexParameterf"
    GL11C reuse "TexParameterfv"
    GL11C reuse "TexSubImage1D"
    GL11C reuse "TexSubImage2D"

    DeprecatedGL..void(
        "Translatef",
        """
        Manipulates the current matrix with a translation matrix along the x-, y- and z- axes.

        Calling this function is equivalent to calling #MultMatrixf() with the following matrix:
        ${table(
            tr(td("1"), td("0"), td("0"), td("x")),
            tr(td("0"), td("1"), td("0"), td("y")),
            tr(td("0"), td("0"), td("1"), td("z")),
            tr(td("0"), td("0"), td("0"), td("1"))
        )}
        """,

        GLfloat.IN("x", "the x-axis translation"),
        GLfloat.IN("y", "the y-axis translation"),
        GLfloat.IN("z", "the z-axis translation")
    )

    DeprecatedGL..void(
        "Translated",
        "Double version of #Translatef().",

        GLdouble.IN("x", "the x-axis translation"),
        GLdouble.IN("y", "the y-axis translation"),
        GLdouble.IN("z", "the z-axis translation")
    )

    // Vertex functions javadoc
    val vertexX = "the vertex x coordinate"
    val vertexY = "the vertex y coordinate"
    val vertexZ = "the vertex z coordinate"
    val vertexW = "the vertex w coordinate"
    val vertexBuffer = "the vertex buffer"

    DeprecatedGL..void(
        "Vertex2f",
        """
        Specifies a single vertex between #Begin() and #End() by giving its coordinates in two dimensions. The z coordinate is implicitly set
        to zero and the w coordinate to one.
        """,

        GLfloat.IN("x", vertexX),
        GLfloat.IN("y", vertexY)
    )

    DeprecatedGL..void("Vertex2s", "Short version of #Vertex2f().", GLshort.IN("x", vertexX), GLshort.IN("y", vertexY))
    DeprecatedGL..void("Vertex2i", "Integer version of #Vertex2f().", GLint.IN("x", vertexX), GLint.IN("y", vertexY))
    DeprecatedGL..void("Vertex2d", "Double version of #Vertex2f().", GLdouble.IN("x", vertexX), GLdouble.IN("y", vertexY))

    DeprecatedGL..void("Vertex2fv", "Pointer version of #Vertex2f().", Check(2)..GLfloat.const.p.IN("coords", vertexBuffer))
    DeprecatedGL..void("Vertex2sv", "Pointer version of #Vertex2s().", Check(2)..GLshort.const.p.IN("coords", vertexBuffer))
    DeprecatedGL..void("Vertex2iv", "Pointer version of #Vertex2i().", Check(2)..GLint.const.p.IN("coords", vertexBuffer))
    DeprecatedGL..void("Vertex2dv", "Pointer version of #Vertex2d().", Check(2)..GLdouble.const.p.IN("coords", vertexBuffer))

    DeprecatedGL..void(
        "Vertex3f",
        """
        Specifies a single vertex between #Begin() and #End() by giving its coordinates in three dimensions. The w coordinate is implicitly set
        to one.
        """,

        GLfloat.IN("x", vertexX),
        GLfloat.IN("y", vertexY),
        GLfloat.IN("z", vertexZ)
    )

    DeprecatedGL..void("Vertex3s", "Short version of #Vertex3f().", GLshort.IN("x", vertexX), GLshort.IN("y", vertexY), GLshort.IN("z", vertexZ))
    DeprecatedGL..void("Vertex3i", "Integer version of #Vertex3f().", GLint.IN("x", vertexX), GLint.IN("y", vertexY), GLint.IN("z", vertexZ))
    DeprecatedGL..void("Vertex3d", "Double version of #Vertex3f().", GLdouble.IN("x", vertexX), GLdouble.IN("y", vertexY), GLdouble.IN("z", vertexZ))

    DeprecatedGL..void("Vertex3fv", "Pointer version of #Vertex3f().", Check(3)..GLfloat.const.p.IN("coords", vertexBuffer))
    DeprecatedGL..void("Vertex3sv", "Pointer version of #Vertex3s().", Check(3)..GLshort.const.p.IN("coords", vertexBuffer))
    DeprecatedGL..void("Vertex3iv", "Pointer version of #Vertex3i().", Check(3)..GLint.const.p.IN("coords", vertexBuffer))
    DeprecatedGL..void("Vertex3dv", "Pointer version of #Vertex3d().", Check(3)..GLdouble.const.p.IN("coords", vertexBuffer))

    DeprecatedGL..void(
        "Vertex4f",
        "Specifies a single vertex between #Begin() and #End() by giving its coordinates in four dimensions.",

        GLfloat.IN("x", vertexX),
        GLfloat.IN("y", vertexY),
        GLfloat.IN("z", vertexZ),
        GLfloat.IN("w", vertexW)
    )

    DeprecatedGL..void("Vertex4s", "Short version of #Vertex4f().", GLshort.IN("x", vertexX), GLshort.IN("y", vertexY), GLshort.IN("z", vertexZ), GLshort.IN("w", vertexW))
    DeprecatedGL..void("Vertex4i", "Integer version of #Vertex4f().", GLint.IN("x", vertexX), GLint.IN("y", vertexY), GLint.IN("z", vertexZ), GLint.IN("w", vertexW))
    DeprecatedGL..void("Vertex4d", "Double version of #Vertex4f().", GLdouble.IN("x", vertexX), GLdouble.IN("y", vertexY), GLdouble.IN("z", vertexZ), GLdouble.IN("w", vertexW))

    DeprecatedGL..void("Vertex4fv", "Pointer version of #Vertex4f().", Check(4)..GLfloat.const.p.IN("coords", vertexBuffer))
    DeprecatedGL..void("Vertex4sv", "Pointer version of #Vertex4s().", Check(4)..GLshort.const.p.IN("coords", vertexBuffer))
    DeprecatedGL..void("Vertex4iv", "Pointer version of #Vertex4i().", Check(4)..GLint.const.p.IN("coords", vertexBuffer))
    DeprecatedGL..void("Vertex4dv", "Pointer version of #Vertex4d().", Check(4)..GLdouble.const.p.IN("coords", vertexBuffer))

    OffHeapOnly..DeprecatedGL..void(
        "VertexPointer",
        "Specifies the location and organization of a vertex array.",

        GLint.IN("size", "the number of values per vertex that are stored in the array", "2 3 4"),
        GLenum.IN(
            "type",
            "the data type of the values stored in the array",
            "#SHORT #INT #HALF_FLOAT #FLOAT #DOUBLE #UNSIGNED_INT_2_10_10_10_REV #INT_2_10_10_10_REV"
        ),
        GLsizei.IN("stride", "the vertex stride in bytes. If specified as zero, then array elements are stored sequentially"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..ARRAY_BUFFER..void.const.p.IN("pointer", "the vertex array data")
    )

    GL11C reuse "Viewport"
}