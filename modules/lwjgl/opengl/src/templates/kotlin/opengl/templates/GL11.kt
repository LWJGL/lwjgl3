/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import opengl.BufferType.*

val GL11 = "GL11".nativeClassGL("GL11") {
    IntConstant(
        "ACCUM"..0x0100,
        "LOAD"..0x0101,
        "RETURN"..0x0102,
        "MULT"..0x0103,
        "ADD"..0x0104
    )

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
        "CLIP_PLANE0"..0x3000,
        "CLIP_PLANE1"..0x3001,
        "CLIP_PLANE2"..0x3002,
        "CLIP_PLANE3"..0x3003,
        "CLIP_PLANE4"..0x3004,
        "CLIP_PLANE5"..0x3005
    )

    IntConstant(
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
        "NO_ERROR".."0",
        "INVALID_ENUM"..0x0500,
        "INVALID_VALUE"..0x0501,
        "INVALID_OPERATION"..0x0502,
        "STACK_OVERFLOW"..0x0503,
        "STACK_UNDERFLOW"..0x0504,
        "OUT_OF_MEMORY"..0x0505
    )

    IntConstant(
        "2D"..0x0600,
        "3D"..0x0601,
        "3D_COLOR"..0x0602,
        "3D_COLOR_TEXTURE"..0x0603,
        "4D_COLOR_TEXTURE"..0x0604
    )

    IntConstant(
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
        /*      LINEAR */
        "EXP"..0x0800,
        "EXP2"..0x0801
    )

    IntConstant(
        "CW"..0x0900,
        "CCW"..0x0901
    )

    IntConstant(
        "COEFF"..0x0A00,
        "ORDER"..0x0A01,
        "DOMAIN"..0x0A02
    )

    IntConstant(
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
        "DONT_CARE"..0x1100,
        "FASTEST"..0x1101,
        "NICEST"..0x1102
    )

    IntConstant(
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
        "COMPILE"..0x1300,
        "COMPILE_AND_EXECUTE"..0x1301
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
        "EMISSION"..0x1600,
        "SHININESS"..0x1601,
        "AMBIENT_AND_DIFFUSE"..0x1602,
        "COLOR_INDEXES"..0x1603
        /*      AMBIENT */
        /*      DIFFUSE */
        /*      SPECULAR */
    )

    IntConstant(
        "MODELVIEW"..0x1700,
        "PROJECTION"..0x1701,
        "TEXTURE"..0x1702
    )

    IntConstant(
        "COLOR"..0x1800,
        "DEPTH"..0x1801,
        "STENCIL"..0x1802
    )

    IntConstant(
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
        "POINT"..0x1B00,
        "LINE"..0x1B01,
        "FILL"..0x1B02
    )

    IntConstant(
        "RENDER"..0x1C00,
        "FEEDBACK"..0x1C01,
        "SELECT"..0x1C02
    )

    IntConstant(
        "FLAT"..0x1D00,
        "SMOOTH"..0x1D01
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
        "MODULATE"..0x2100,
        "DECAL"..0x2101
        /*      BLEND */
        /*      REPLACE */
    )

    IntConstant(
        "TEXTURE_ENV_MODE"..0x2200,
        "TEXTURE_ENV_COLOR"..0x2201
    )

    IntConstant(
        "TEXTURE_ENV"..0x2300
    )

    IntConstant(
        "EYE_LINEAR"..0x2400,
        "OBJECT_LINEAR"..0x2401,
        "SPHERE_MAP"..0x2402
    )

    IntConstant(
        "TEXTURE_GEN_MODE"..0x2500,
        "OBJECT_PLANE"..0x2501,
        "EYE_PLANE"..0x2502
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
        "CLAMP"..0x2900,
        "REPEAT"..0x2901
    )

    IntConstant(
        "CLIENT_PIXEL_STORE_BIT"..0x00000001,
        "CLIENT_VERTEX_ARRAY_BIT"..0x00000002,
        "CLIENT_ALL_ATTRIB_BITS"..0xffffffff.i
    )

    IntConstant(
        "POLYGON_OFFSET_FACTOR"..0x8038,
        "POLYGON_OFFSET_UNITS"..0x2A00,
        "POLYGON_OFFSET_POINT"..0x2A01,
        "POLYGON_OFFSET_LINE"..0x2A02,
        "POLYGON_OFFSET_FILL"..0x8037
    )

    IntConstant(
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
        "TEXTURE_PRIORITY"..0x8066,
        "TEXTURE_RESIDENT"..0x8067,
        "TEXTURE_BINDING_1D"..0x8068,
        "TEXTURE_BINDING_2D"..0x8069
    )

    IntConstant(
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

    // Functions

    reuse(GL11C, "Enable")
    reuse(GL11C, "Disable")

    DeprecatedGL..void(
        "Accum",

        GLenum("op"),
        GLfloat("value")
    )

    DeprecatedGL..void(
        "AlphaFunc",

        GLenum("func"),
        GLfloat("ref")
    )

    DeprecatedGL..GLboolean(
        "AreTexturesResident",

        AutoSize("textures", "residences")..(GLsizei("n")),
        SingleValue("texture")..GLuint.const.p("textures"),
        GLboolean.p("residences")
    )

    DeprecatedGL..void(
        "ArrayElement",

        GLint("i")
    )

    DeprecatedGL..void(
        "Begin",

        GLenum("mode")
    )

    reuse(GL11C, "BindTexture")

    DeprecatedGL..void(
        "Bitmap",

        GLsizei("w"),
        GLsizei("h"),
        GLfloat("xOrig"),
        GLfloat("yOrig"),
        GLfloat("xInc"),
        GLfloat("yInc"),
        Check("((w + 7) >> 3) * h")..RawPointer..nullable..GLubyte.const.p("data")
    )

    reuse(GL11C, "BlendFunc")

    DeprecatedGL..void(
        "CallList",

        GLuint("list")
    )

    DeprecatedGL..void(
        "CallLists",
        
        AutoSizeDiv("GLChecks.typeToBytes(type)", "lists")..GLsizei("n"),
        AutoType("lists", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum("type"),
        void.const.p("lists")
    )

    reuse(GL11C, "Clear")

    DeprecatedGL..void(
        "ClearAccum",

        GLfloat("red"),
        GLfloat("green"),
        GLfloat("blue"),
        GLfloat("alpha")
    )

    reuse(GL11C, "ClearColor")
    reuse(GL11C, "ClearDepth")

    DeprecatedGL..void(
        "ClearIndex",

        GLfloat("index")
    )

    reuse(GL11C, "ClearStencil")

    DeprecatedGL..void(
        "ClipPlane",

        GLenum("plane"),
        Check(4)..GLdouble.const.p("equation")
    )

    DeprecatedGL..void(
        "Color3b",

        GLbyte("red"),
        GLbyte("green"),
        GLbyte("blue")
    )
    DeprecatedGL..void("Color3s", GLshort("red"), GLshort("green"), GLshort("blue"))
    DeprecatedGL..void("Color3i", GLint("red"), GLint("green"), GLint("blue"))
    DeprecatedGL..void("Color3f", GLfloat("red"), GLfloat("green"), GLfloat("blue"))
    DeprecatedGL..void("Color3d", GLdouble("red"), GLdouble("green"), GLdouble("blue"))
    DeprecatedGL..void("Color3ub", GLubyte("red"), GLubyte("green"), GLubyte("blue"))
    DeprecatedGL..void("Color3us", GLushort("red"), GLushort("green"), GLushort("blue"))
    DeprecatedGL..void("Color3ui", GLint("red"), GLint("green"), GLint("blue"))

    DeprecatedGL..void("Color3bv", Check(3)..GLbyte.const.p("v"))
    DeprecatedGL..void("Color3sv", Check(3)..GLshort.const.p("v"))
    DeprecatedGL..void("Color3iv", Check(3)..GLint.const.p("v"))
    DeprecatedGL..void("Color3fv", Check(3)..GLfloat.const.p("v"))
    DeprecatedGL..void("Color3dv", Check(3)..GLdouble.const.p("v"))
    DeprecatedGL..void("Color3ubv", Check(3)..GLubyte.const.p("v"))
    DeprecatedGL..void("Color3usv", Check(3)..GLushort.const.p("v"))
    DeprecatedGL..void("Color3uiv", Check(3)..GLuint.const.p("v"))

    DeprecatedGL..void(
        "Color4b",

        GLbyte("red"),
        GLbyte("green"),
        GLbyte("blue"),
        GLbyte("alpha")
    )

    DeprecatedGL..void("Color4s", GLshort("red"), GLshort("green"), GLshort("blue"), GLshort("alpha"))
    DeprecatedGL..void("Color4i", GLint("red"), GLint("green"), GLint("blue"), GLint("alpha"))
    DeprecatedGL..void("Color4f", GLfloat("red"), GLfloat("green"), GLfloat("blue"), GLfloat("alpha"))
    DeprecatedGL..void("Color4d", GLdouble("red"), GLdouble("green"), GLdouble("blue"), GLdouble("alpha"))
    DeprecatedGL..void("Color4ub", GLubyte("red"), GLubyte("green"), GLubyte("blue"), GLubyte("alpha"))
    DeprecatedGL..void("Color4us", GLushort("red"), GLushort("green"), GLushort("blue"), GLushort("alpha"))
    DeprecatedGL..void("Color4ui", GLint("red"), GLint("green"), GLint("blue"), GLint("alpha"))

    DeprecatedGL..void("Color4bv", Check(4)..GLbyte.const.p("v"))
    DeprecatedGL..void("Color4sv", Check(4)..GLshort.const.p("v"))
    DeprecatedGL..void("Color4iv", Check(4)..GLint.const.p("v"))
    DeprecatedGL..void("Color4fv", Check(4)..GLfloat.const.p("v"))
    DeprecatedGL..void("Color4dv", Check(4)..GLdouble.const.p("v"))
    DeprecatedGL..void("Color4ubv", Check(4)..GLubyte.const.p("v"))
    DeprecatedGL..void("Color4usv", Check(4)..GLushort.const.p("v"))
    DeprecatedGL..void("Color4uiv", Check(4)..GLuint.const.p("v"))

    reuse(GL11C, "ColorMask")

    DeprecatedGL..void(
        "ColorMaterial",

        GLenum("face"),
        GLenum("mode")
    )

    OffHeapOnly..DeprecatedGL..void(
        "ColorPointer",

        GLint("size"),
        GLenum("type"),
        GLsizei("stride"),
        RawPointer..MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..void.const.p("pointer")
    )

    DeprecatedGL..void(
        "CopyPixels",

        GLint("x"),
        GLint("y"),
        GLsizei("width"),
        GLsizei("height"),
        GLenum("type")
    )

    reuse(GL11C, "CullFace")

    DeprecatedGL..void(
        "DeleteLists",

        GLuint("list"),
        GLsizei("range")
    )

    reuse(GL11C, "DepthFunc")
    reuse(GL11C, "DepthMask")
    reuse(GL11C, "DepthRange")

    DeprecatedGL..DependsOn("GL_NV_vertex_buffer_unified_memory")..void(
        "DisableClientState",

        GLenum("cap")
    )

    reuse(GL11C, "DrawArrays")
    reuse(GL11C, "DrawBuffer")
    reuse(GL11C, "DrawElements")

    DeprecatedGL..void(
        "DrawPixels",

        GLsizei("width"),
        GLsizei("height"),
        GLenum("format"),
        GLenum("type"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..RawPointer..void.const.p("pixels")
    )

    DeprecatedGL..void(
        "EdgeFlag",

        GLboolean("flag")
    )

    DeprecatedGL..void(
        "EdgeFlagv",

        Check(1)..GLboolean.const.p("flag")
    )

    OffHeapOnly..DeprecatedGL..void(
        "EdgeFlagPointer",

        GLsizei("stride"),
        Unsafe..RawPointer..GLboolean.const.p("pointer")
    )

    DeprecatedGL..DependsOn("GL_NV_vertex_buffer_unified_memory")..void(
        "EnableClientState",

        GLenum("cap")
    )

    DeprecatedGL..void("End")

    DeprecatedGL..void(
        "EvalCoord1f",

        GLfloat("u")
    )

    DeprecatedGL..void(
        "EvalCoord1fv",

        Check(1)..GLfloat.const.p("u")
    )

    DeprecatedGL..void(
        "EvalCoord1d",

        GLdouble("u")
    )

    DeprecatedGL..void(
        "EvalCoord1dv",

        Check(1)..GLdouble.const.p("u")
    )

    DeprecatedGL..void(
        "EvalCoord2f",

        GLfloat("u"),
        GLfloat("v")
    )

    DeprecatedGL..void(
        "EvalCoord2fv",

        Check(2)..GLfloat.const.p("u")
    )

    DeprecatedGL..void(
        "EvalCoord2d",

        GLdouble("u"),
        GLdouble("v")
    )

    DeprecatedGL..void(
        "EvalCoord2dv",

        Check(2)..GLdouble.const.p("u")
    )

    DeprecatedGL..void(
        "EvalMesh1",

        GLenum("mode"),
        GLint("i1"),
        GLint("i2")
    )

    DeprecatedGL..void(
        "EvalMesh2",

        GLenum("mode"),
        GLint("i1"),
        GLint("i2"),
        GLint("j1"),
        GLint("j2")
    )

    DeprecatedGL..void(
        "EvalPoint1",

        GLint("i")
    )

    DeprecatedGL..void(
        "EvalPoint2",
        GLint("i"),
        GLint("j")
    )

    DeprecatedGL..void(
        "FeedbackBuffer",

        AutoSize("buffer")..GLsizei("size"),
        GLenum("type"),
        GLfloat.p("buffer")
    )

    reuse(GL11C, "Finish")
    reuse(GL11C, "Flush")

    DeprecatedGL..void(
        "Fogi",

        GLenum("pname"),
        GLint("param")
    )

    DeprecatedGL..void(
        "Fogiv",

        GLenum("pname"),
        Check(1)..GLint.const.p("params")
    )

    DeprecatedGL..void(
        "Fogf",

        GLenum("pname"),
        GLfloat("param")
    )

    DeprecatedGL..void(
        "Fogfv",

        GLenum("pname"),
        Check(1)..GLfloat.const.p("params")
    )

    reuse(GL11C, "FrontFace")

    DeprecatedGL..GLuint(
        "GenLists",

        GLsizei("s")
    )

    reuse(GL11C, "GenTextures")
    reuse(GL11C, "DeleteTextures")

    DeprecatedGL..void(
        "GetClipPlane",

        GLenum("plane"),
        Check(4)..GLdouble.p("equation")
    )

    reuse(GL11C, "GetBooleanv")
    reuse(GL11C, "GetFloatv")
    reuse(GL11C, "GetIntegerv")
    reuse(GL11C, "GetDoublev")
    reuse(GL11C, "GetError")

    DeprecatedGL..void(
        "GetLightiv",

        GLenum("light"),
        GLenum("pname"),
        Check(4)..ReturnParam..GLint.p("data")
    )

    DeprecatedGL..void(
        "GetLightfv",

        GLenum("light"),
        GLenum("pname"),
        Check(4)..ReturnParam..GLfloat.p("data")
    )

    DeprecatedGL..void(
        "GetMapiv",

        GLenum("target"),
        GLenum("query"),
        Check(4)..ReturnParam..GLint.p("data")
    )

    DeprecatedGL..void(
        "GetMapfv",

        GLenum("target"),
        GLenum("query"),
        Check(4)..ReturnParam..GLfloat.p("data")
    )

    DeprecatedGL..void(
        "GetMapdv",

        GLenum("target"),
        GLenum("query"),
        Check(4)..ReturnParam..GLdouble.p("data")
    )

    DeprecatedGL..void(
        "GetMaterialiv",

        GLenum("face"),
        GLenum("pname"),
        Check(1)..GLint.p("data")
    )

    DeprecatedGL..void(
        "GetMaterialfv",

        GLenum("face"),
        GLenum("pname"),
        Check(1)..GLfloat.p("data")
    )

    DeprecatedGL..void(
        "GetPixelMapfv",

        GLenum("map"),
        Check(32)..RawPointer..GLfloat.p("data")
    )

    DeprecatedGL..void(
        "GetPixelMapusv",

        GLenum("map"),
        Check(32)..RawPointer..GLushort.p("data")
    )

    DeprecatedGL..void(
        "GetPixelMapuiv",

        GLenum("map"),
        Check(32)..RawPointer..GLuint.p("data")
    )

    reuse(GL11C, "GetPointerv")

    DeprecatedGL..void(
        "GetPolygonStipple",

        Check(128)..RawPointer..void.p("pattern")
    )

    reuse(GL11C, "GetString")

    DeprecatedGL..void(
        "GetTexEnviv",

        GLenum("env"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLint.p("data")
    )

    DeprecatedGL..void(
        "GetTexEnvfv",

        GLenum("env"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLfloat.p("data")
    )

    DeprecatedGL..void(
        "GetTexGeniv",

        GLenum("coord"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLint.p("data")
    )

    DeprecatedGL..void(
        "GetTexGenfv",

        GLenum("coord"),
        GLenum("pname"),
        Check(4)..ReturnParam..GLfloat.p("data")
    )

    DeprecatedGL..void(
        "GetTexGendv",

        GLenum("coord"),
        GLenum("pname"),
        Check(4)..ReturnParam..GLdouble.p("data")
    )

    reuse(GL11C, "GetTexImage")
    reuse(GL11C, "GetTexLevelParameteriv")
    reuse(GL11C, "GetTexLevelParameterfv")
    reuse(GL11C, "GetTexParameteriv")
    reuse(GL11C, "GetTexParameterfv")
    reuse(GL11C, "Hint")

    DeprecatedGL..void(
        "Indexi",
        GLint("index")
    )
    DeprecatedGL..void("Indexub", GLubyte("index"))
    DeprecatedGL..void("Indexs", GLshort("index"))
    DeprecatedGL..void("Indexf", GLfloat("index"))
    DeprecatedGL..void("Indexd", GLdouble("index"))

    DeprecatedGL..void(
        "Indexiv",

        Check(1)..GLint.const.p("index")
    )

    DeprecatedGL..void("Indexubv", Check(1)..GLubyte.const.p("index"))
    DeprecatedGL..void("Indexsv", Check(1)..GLshort.const.p("index"))
    DeprecatedGL..void("Indexfv", Check(1)..GLfloat.const.p("index"))
    DeprecatedGL..void("Indexdv", Check(1)..GLdouble.const.p("index"))

    DeprecatedGL..void(
        "IndexMask",

        GLuint("mask")
    )

    OffHeapOnly..DeprecatedGL..void(
        "IndexPointer",

        AutoType("pointer", GL_UNSIGNED_BYTE, GL_SHORT, GL_INT)..GLenum("type"),
        GLsizei("stride"),
        Unsafe..RawPointer..void.const.p("pointer")
    )

    DeprecatedGL..void("InitNames")

    DeprecatedGL..void(
        "InterleavedArrays",

        GLenum("format"),
        GLsizei("stride"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..RawPointer..void.const.p("pointer")
    )

    reuse(GL11C, "IsEnabled")

    DeprecatedGL..GLboolean(
        "IsList",

        GLuint("list")
    )

    reuse(GL11C, "IsTexture")

    DeprecatedGL..void(
        "LightModeli",

        GLenum("pname"),
        GLint("param")
    )

    DeprecatedGL..void(
        "LightModelf",

        GLenum("pname"),
        GLfloat("param")
    )

    DeprecatedGL..void(
        "LightModeliv",

        GLenum("pname"),
        Check(4)..GLint.const.p("params")
    )

    DeprecatedGL..void(
        "LightModelfv",

        GLenum("pname"),
        Check(4)..GLfloat.const.p("params")
    )

    DeprecatedGL..void(
        "Lighti",

        GLenum("light"),
        GLenum("pname"),
        GLint("param")
    )

    DeprecatedGL..void(
        "Lightf",

        GLenum("light"),
        GLenum("pname"),
        GLfloat("param")
    )

    DeprecatedGL..void(
        "Lightiv",

        GLenum("light"),
        GLenum("pname"),
        Check(4)..GLint.const.p("params")
    )

    DeprecatedGL..void(
        "Lightfv",

        GLenum("light"),
        GLenum("pname"),
        Check(4)..GLfloat.const.p("params")
    )

    DeprecatedGL..void(
        "LineStipple",

        GLint("factor"),
        GLushort("pattern")
    )

    reuse(GL11C, "LineWidth")

    DeprecatedGL..void(
        "ListBase",

        GLuint("base")
    )

    DeprecatedGL..void(
        "LoadMatrixf",

        Check(16)..GLfloat.const.p("m")
    )

    DeprecatedGL..void(
        "LoadMatrixd",

        Check(16)..GLdouble.const.p("m")
    )

    DeprecatedGL..void(
        "LoadIdentity",
        void()
    )

    DeprecatedGL..void(
        "LoadName",

        GLuint("name")
    )

    reuse(GL11C, "LogicOp")

    DeprecatedGL..void(
        "Map1f",

        GLenum("target"),
        GLfloat("u1"),
        GLfloat("u2"),
        GLint("stride"),
        GLint("order"),
        Check("order * stride")..GLfloat.const.p("points")
    )

    DeprecatedGL..void(
        "Map1d",

        GLenum("target"),
        GLdouble("u1"),
        GLdouble("u2"),
        GLint("stride"),
        GLint("order"),
        Check("stride * order")..GLdouble.const.p("points")
    )

    DeprecatedGL..void(
        "Map2f",

        GLenum("target"),
        GLfloat("u1"),
        GLfloat("u2"),
        GLint("ustride"),
        GLint("uorder"),
        GLfloat("v1"),
        GLfloat("v2"),
        GLint("vstride"),
        GLint("vorder"),
        Check("ustride * uorder * vstride * vorder")..GLfloat.const.p("points")
    )

    DeprecatedGL..void(
        "Map2d",

        GLenum("target"),
        GLdouble("u1"),
        GLdouble("u2"),
        GLint("ustride"),
        GLint("uorder"),
        GLdouble("v1"),
        GLdouble("v2"),
        GLint("vstride"),
        GLint("vorder"),
        Check("ustride * uorder * vstride * vorder")..GLdouble.const.p("points")
    )

    DeprecatedGL..void(
        "MapGrid1f",

        GLint("n"),
        GLfloat("u1"),
        GLfloat("u2")
    )

    DeprecatedGL..void(
        "MapGrid1d",

        GLint("n"),
        GLdouble("u1"),
        GLdouble("u2")
    )

    DeprecatedGL..void(
        "MapGrid2f",

        GLint("un"),
        GLfloat("u1"),
        GLfloat("u2"),
        GLint("vn"),
        GLfloat("v1"),
        GLfloat("v2")
    )

    DeprecatedGL..void(
        "MapGrid2d",

        GLint("un"),
        GLdouble("u1"),
        GLdouble("u2"),
        GLint("vn"),
        GLdouble("v1"),
        GLdouble("v2")
    )

    DeprecatedGL..void(
        "Materiali",

        GLenum("face"),
        GLenum("pname"),
        GLint("param")
    )

    DeprecatedGL..void(
        "Materialf",

        GLenum("face"),
        GLenum("pname"),
        GLfloat("param")
    )

    DeprecatedGL..void(
        "Materialiv",

        GLenum("face"),
        GLenum("pname"),
        Check(4)..GLint.const.p("params")
    )

    DeprecatedGL..void(
        "Materialfv",

        GLenum("face"),
        GLenum("pname"),
        Check(4)..GLfloat.const.p("params")
    )

    DeprecatedGL..void(
        "MatrixMode",

        GLenum("mode")
    )

    DeprecatedGL..void(
        "MultMatrixf",

        Check(16)..GLfloat.const.p("m")
    )

    DeprecatedGL..void(
        "MultMatrixd",

        Check(16)..GLdouble.const.p("m")
    )

    DeprecatedGL..void(
        "Frustum",

        GLdouble("l"),
        GLdouble("r"),
        GLdouble("b"),
        GLdouble("t"),
        GLdouble("n"),
        GLdouble("f")
    )

    DeprecatedGL..void(
        "NewList",

        GLuint("n"),
        GLenum("mode")
    )

    DeprecatedGL..void("EndList")

    DeprecatedGL..void("Normal3f", GLfloat("nx"), GLfloat("ny"), GLfloat("nz"))
    DeprecatedGL..void("Normal3b", GLbyte("nx"), GLbyte("ny"), GLbyte("nz"))
    DeprecatedGL..void("Normal3s", GLshort("nx"), GLshort("ny"), GLshort("nz"))
    DeprecatedGL..void("Normal3i", GLint("nx"), GLint("ny"), GLint("nz"))
    DeprecatedGL..void("Normal3d", GLdouble("nx"), GLdouble("ny"), GLdouble("nz"))

    DeprecatedGL..void("Normal3fv", Check(3)..GLfloat.const.p("v"))
    DeprecatedGL..void("Normal3bv", Check(3)..GLbyte.const.p("v"))
    DeprecatedGL..void("Normal3sv", Check(3)..GLshort.const.p("v"))
    DeprecatedGL..void("Normal3iv", Check(3)..GLint.const.p("v"))
    DeprecatedGL..void("Normal3dv", Check(3)..GLdouble.const.p("v"))

    OffHeapOnly..DeprecatedGL..void(
        "NormalPointer",

        GLenum("type"),
        GLsizei("stride"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..RawPointer..void.const.p("pointer")
    )

    DeprecatedGL..void(
        "Ortho",

        GLdouble("l"),
        GLdouble("r"),
        GLdouble("b"),
        GLdouble("t"),
        GLdouble("n"),
        GLdouble("f")
    )

    DeprecatedGL..void(
        "PassThrough",

        GLfloat("token")
    )

    DeprecatedGL..void(
        "PixelMapfv",

        GLenum("map"),
        AutoSize("values")..GLsizei("size"),
        RawPointer..GLfloat.const.p("values")
    )

    DeprecatedGL..void(
        "PixelMapusv",

        GLenum("map"),
        AutoSize("values")..GLsizei("size"),
        RawPointer..GLushort.const.p("values")
    )

    DeprecatedGL..void(
        "PixelMapuiv",

        GLenum("map"),
        AutoSize("values")..GLsizei("size"),
        RawPointer..GLuint.const.p("values")
    )

    reuse(GL11C, "PixelStorei")
    reuse(GL11C, "PixelStoref")

    DeprecatedGL..void(
        "PixelTransferi",

        GLenum("pname"),
        GLint("param")
    )

    DeprecatedGL..void(
        "PixelTransferf",

        GLenum("pname"),
        GLfloat("param")
    )

    DeprecatedGL..void(
        "PixelZoom",

        GLfloat("xfactor"),
        GLfloat("yfactor")
    )

    reuse(GL11C, "PointSize")
    reuse(GL11C, "PolygonMode")
    reuse(GL11C, "PolygonOffset")

    DeprecatedGL..void(
        "PolygonStipple",

        Check(128)..RawPointer..GLubyte.const.p("pattern")
    )

    DeprecatedGL..void(
        "PushAttrib",

        GLbitfield("mask")
    )

    DeprecatedGL..void(
        "PushClientAttrib",

        GLbitfield("mask")
    )

    DeprecatedGL..void("PopAttrib")

    DeprecatedGL..void("PopClientAttrib")

    DeprecatedGL..void("PopMatrix")

    DeprecatedGL..void("PopName")

    DeprecatedGL..void(
        "PrioritizeTextures",

        AutoSize("textures", "priorities")..GLsizei("n"),
        GLuint.const.p("textures"),
        GLfloat.const.p("priorities")
    )


    DeprecatedGL..void("PushMatrix")

    DeprecatedGL..void(
        "PushName",

        GLuint("name")
    )

    DeprecatedGL..void(
        "RasterPos2i",

        GLint("x"),
        GLint("y")
    )

    DeprecatedGL..void("RasterPos2s", GLshort("x"), GLshort("y"))
    DeprecatedGL..void("RasterPos2f", GLfloat("x"), GLfloat("y"))
    DeprecatedGL..void("RasterPos2d", GLdouble("x"), GLdouble("y"))

    DeprecatedGL..void("RasterPos2iv", Check(2)..GLint.const.p("coords"))
    DeprecatedGL..void("RasterPos2sv", Check(2)..GLshort.const.p("coords"))
    DeprecatedGL..void("RasterPos2fv", Check(2)..GLfloat.const.p("coords"))
    DeprecatedGL..void("RasterPos2dv", Check(2)..GLdouble.const.p("coords"))

    DeprecatedGL..void(
        "RasterPos3i",

        GLint("x"),
        GLint("y"),
        GLint("z")
    )

    DeprecatedGL..void("RasterPos3s", GLshort("x"), GLshort("y"), GLshort("z"))
    DeprecatedGL..void("RasterPos3f", GLfloat("x"), GLfloat("y"), GLfloat("z"))
    DeprecatedGL..void("RasterPos3d", GLdouble("x"), GLdouble("y"), GLdouble("z"))

    DeprecatedGL..void("RasterPos3iv", Check(3)..GLint.const.p("coords"))
    DeprecatedGL..void("RasterPos3sv", Check(3)..GLshort.const.p("coords"))
    DeprecatedGL..void("RasterPos3fv", Check(3)..GLfloat.const.p("coords"))
    DeprecatedGL..void("RasterPos3dv", Check(3)..GLdouble.const.p("coords"))

    DeprecatedGL..void(
        "RasterPos4i",

        GLint("x"),
        GLint("y"),
        GLint("z"),
        GLint("w")
    )

    DeprecatedGL..void("RasterPos4s", GLshort("x"), GLshort("y"), GLshort("z"), GLshort("w"))
    DeprecatedGL..void("RasterPos4f", GLfloat("x"), GLfloat("y"), GLfloat("z"), GLfloat("w"))
    DeprecatedGL..void("RasterPos4d", GLdouble("x"), GLdouble("y"), GLdouble("z"), GLdouble("w"))

    DeprecatedGL..void("RasterPos4iv", Check(4)..GLint.const.p("coords"))
    DeprecatedGL..void("RasterPos4sv", Check(4)..GLshort.const.p("coords"))
    DeprecatedGL..void("RasterPos4fv", Check(4)..GLfloat.const.p("coords"))
    DeprecatedGL..void("RasterPos4dv", Check(4)..GLdouble.const.p("coords"))

    reuse(GL11C, "ReadBuffer")
    reuse(GL11C, "ReadPixels")

    DeprecatedGL..void(
        "Recti",

        GLint("x1"),
        GLint("y1"),
        GLint("x2"),
        GLint("y2")
    )

    DeprecatedGL..void("Rects", GLshort("x1"), GLshort("y1"), GLshort("x2"), GLshort("y2"))
    DeprecatedGL..void("Rectf", GLfloat("x1"), GLfloat("y1"), GLfloat("x2"), GLfloat("y2"))
    DeprecatedGL..void("Rectd", GLdouble("x1"), GLdouble("y1"), GLdouble("x2"), GLdouble("y2"))

    DeprecatedGL..void("Rectiv", Check(2)..GLint.const.p("v1"), Check(2)..GLint.const.p("v2"))
    DeprecatedGL..void("Rectsv", Check(2)..GLshort.const.p("v1"), Check(2)..GLshort.const.p("v2"))
    DeprecatedGL..void("Rectfv", Check(2)..GLfloat.const.p("v1"), Check(2)..GLfloat.const.p("v2"))
    DeprecatedGL..void("Rectdv", Check(2)..GLdouble.const.p("v1"), Check(2)..GLdouble.const.p("v2"))

    DeprecatedGL..GLint(
        "RenderMode",

        GLenum("mode")
    )

    DeprecatedGL..void(
        "Rotatef",

        GLfloat("angle"),
        GLfloat("x"),
        GLfloat("y"),
        GLfloat("z")
    )

    DeprecatedGL..void(
        "Rotated",

        GLdouble("angle"),
        GLdouble("x"),
        GLdouble("y"),
        GLdouble("z")
    )

    DeprecatedGL..void(
        "Scalef",

        GLfloat("x"),
        GLfloat("y"),
        GLfloat("z")
    )

    DeprecatedGL..void(
        "Scaled",

        GLdouble("x"),
        GLdouble("y"),
        GLdouble("z")
    )

    reuse(GL11C, "Scissor")

    DeprecatedGL..void(
        "SelectBuffer",

        AutoSize("buffer")..GLsizei("size"),
        GLuint.p("buffer")
    )

    DeprecatedGL..void(
        "ShadeModel",

        GLenum("mode")
    )

    reuse(GL11C, "StencilFunc")
    reuse(GL11C, "StencilMask")
    reuse(GL11C, "StencilOp")

    DeprecatedGL..void(
        "TexCoord1f",

        GLfloat("s")
    )

    DeprecatedGL..void("TexCoord1s", GLshort("s"))
    DeprecatedGL..void("TexCoord1i", GLint("s"))
    DeprecatedGL..void("TexCoord1d", GLdouble("s"))

    DeprecatedGL..void("TexCoord1fv", Check(1)..GLfloat.const.p("v"))
    DeprecatedGL..void("TexCoord1sv", Check(1)..GLshort.const.p("v"))
    DeprecatedGL..void("TexCoord1iv", Check(1)..GLint.const.p("v"))
    DeprecatedGL..void("TexCoord1dv", Check(1)..GLdouble.const.p("v"))

    DeprecatedGL..void(
        "TexCoord2f",

        GLfloat("s"),
        GLfloat("t")
    )

    DeprecatedGL..void("TexCoord2s", GLshort("s"), GLshort("t"))
    DeprecatedGL..void("TexCoord2i", GLint("s"), GLint("t"))
    DeprecatedGL..void("TexCoord2d", GLdouble("s"), GLdouble("t"))

    DeprecatedGL..void("TexCoord2fv", Check(2)..GLfloat.const.p("v"))
    DeprecatedGL..void("TexCoord2sv", Check(2)..GLshort.const.p("v"))
    DeprecatedGL..void("TexCoord2iv", Check(2)..GLint.const.p("v"))
    DeprecatedGL..void("TexCoord2dv", Check(2)..GLdouble.const.p("v"))

    DeprecatedGL..void(
        "TexCoord3f",

        GLfloat("s"),
        GLfloat("t"),
        GLfloat("r")
    )

    DeprecatedGL..void("TexCoord3s", GLshort("s"), GLshort("t"), GLshort("r"))
    DeprecatedGL..void("TexCoord3i", GLint("s"), GLint("t"), GLint("r"))
    DeprecatedGL..void("TexCoord3d", GLdouble("s"), GLdouble("t"), GLdouble("r"))

    DeprecatedGL..void("TexCoord3fv", Check(3)..GLfloat.const.p("v"))
    DeprecatedGL..void("TexCoord3sv", Check(3)..GLshort.const.p("v"))
    DeprecatedGL..void("TexCoord3iv", Check(3)..GLint.const.p("v"))
    DeprecatedGL..void("TexCoord3dv", Check(3)..GLdouble.const.p("v"))

    DeprecatedGL..void(
        "TexCoord4f",

        GLfloat("s"),
        GLfloat("t"),
        GLfloat("r"),
        GLfloat("q")
    )

    DeprecatedGL..void("TexCoord4s", GLshort("s"), GLshort("t"), GLshort("r"), GLshort("q"))
    DeprecatedGL..void("TexCoord4i", GLint("s"), GLint("t"), GLint("r"), GLint("q"))
    DeprecatedGL..void("TexCoord4d", GLdouble("s"), GLdouble("t"), GLdouble("r"), GLdouble("q"))

    DeprecatedGL..void("TexCoord4fv", Check(4)..GLfloat.const.p("v"))
    DeprecatedGL..void("TexCoord4sv", Check(4)..GLshort.const.p("v"))
    DeprecatedGL..void("TexCoord4iv", Check(4)..GLint.const.p("v"))
    DeprecatedGL..void("TexCoord4dv", Check(4)..GLdouble.const.p("v"))

    OffHeapOnly..DeprecatedGL..void(
        "TexCoordPointer",

        GLint("size"),
        GLenum("type"),
        GLsizei("stride"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..RawPointer..void.const.p("pointer")
    )

    DeprecatedGL..void(
        "TexEnvi",

        GLenum("target"),
        GLenum("pname"),
        GLint("param")
    )

    DeprecatedGL..void(
        "TexEnviv",

        GLenum("target"),
        GLenum("pname"),
        Check(4)..GLint.const.p("params")
    )


    DeprecatedGL..void(
        "TexEnvf",

        GLenum("target"),
        GLenum("pname"),
        GLfloat("param")
    )

    DeprecatedGL..void(
        "TexEnvfv",

        GLenum("target"),
        GLenum("pname"),
        Check(4)..GLfloat.const.p("params")
    )

    DeprecatedGL..void(
        "TexGeni",

        GLenum("coord"),
        GLenum("pname"),
        GLint("param")
    )

    DeprecatedGL..void(
        "TexGeniv",

        GLenum("coord"),
        GLenum("pname"),
        Check(4)..GLint.const.p("params")
    )

    DeprecatedGL..void(
        "TexGenf",

        GLenum("coord"),
        GLenum("pname"),
        GLfloat("param")
    )

    DeprecatedGL..void(
        "TexGenfv",

        GLenum("coord"),
        GLenum("pname"),
        Check(4)..GLfloat.const.p("params")
    )

    DeprecatedGL..void(
        "TexGend",

        GLenum("coord"),
        GLenum("pname"),
        GLdouble("param")
    )

    DeprecatedGL..void(
        "TexGendv",

        GLenum("coord"),
        GLenum("pname"),
        Check(4)..GLdouble.const.p("params")
    )

    reuse(GL11C, "TexImage1D")
    reuse(GL11C, "TexImage2D")
    reuse(GL11C, "CopyTexImage1D")
    reuse(GL11C, "CopyTexImage2D")
    reuse(GL11C, "CopyTexSubImage1D")
    reuse(GL11C, "CopyTexSubImage2D")
    reuse(GL11C, "TexParameteri")
    reuse(GL11C, "TexParameteriv")
    reuse(GL11C, "TexParameterf")
    reuse(GL11C, "TexParameterfv")
    reuse(GL11C, "TexSubImage1D")
    reuse(GL11C, "TexSubImage2D")

    DeprecatedGL..void(
        "Translatef",

        GLfloat("x"),
        GLfloat("y"),
        GLfloat("z")
    )

    DeprecatedGL..void(
        "Translated",

        GLdouble("x"),
        GLdouble("y"),
        GLdouble("z")
    )

    DeprecatedGL..void(
        "Vertex2f",

        GLfloat("x"),
        GLfloat("y")
    )

    DeprecatedGL..void("Vertex2s", GLshort("x"), GLshort("y"))
    DeprecatedGL..void("Vertex2i", GLint("x"), GLint("y"))
    DeprecatedGL..void("Vertex2d", GLdouble("x"), GLdouble("y"))

    DeprecatedGL..void("Vertex2fv", Check(2)..GLfloat.const.p("coords"))
    DeprecatedGL..void("Vertex2sv", Check(2)..GLshort.const.p("coords"))
    DeprecatedGL..void("Vertex2iv", Check(2)..GLint.const.p("coords"))
    DeprecatedGL..void("Vertex2dv", Check(2)..GLdouble.const.p("coords"))

    DeprecatedGL..void(
        "Vertex3f",

        GLfloat("x"),
        GLfloat("y"),
        GLfloat("z")
    )

    DeprecatedGL..void("Vertex3s", GLshort("x"), GLshort("y"), GLshort("z"))
    DeprecatedGL..void("Vertex3i", GLint("x"), GLint("y"), GLint("z"))
    DeprecatedGL..void("Vertex3d", GLdouble("x"), GLdouble("y"), GLdouble("z"))

    DeprecatedGL..void("Vertex3fv", Check(3)..GLfloat.const.p("coords"))
    DeprecatedGL..void("Vertex3sv", Check(3)..GLshort.const.p("coords"))
    DeprecatedGL..void("Vertex3iv", Check(3)..GLint.const.p("coords"))
    DeprecatedGL..void("Vertex3dv", Check(3)..GLdouble.const.p("coords"))

    DeprecatedGL..void(
        "Vertex4f",

        GLfloat("x"),
        GLfloat("y"),
        GLfloat("z"),
        GLfloat("w")
    )

    DeprecatedGL..void("Vertex4s", GLshort("x"), GLshort("y"), GLshort("z"), GLshort("w"))
    DeprecatedGL..void("Vertex4i", GLint("x"), GLint("y"), GLint("z"), GLint("w"))
    DeprecatedGL..void("Vertex4d", GLdouble("x"), GLdouble("y"), GLdouble("z"), GLdouble("w"))

    DeprecatedGL..void("Vertex4fv", Check(4)..GLfloat.const.p("coords"))
    DeprecatedGL..void("Vertex4sv", Check(4)..GLshort.const.p("coords"))
    DeprecatedGL..void("Vertex4iv", Check(4)..GLint.const.p("coords"))
    DeprecatedGL..void("Vertex4dv", Check(4)..GLdouble.const.p("coords"))

    OffHeapOnly..DeprecatedGL..void(
        "VertexPointer",

        GLint("size"),
        GLenum("type"),
        GLsizei("stride"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..RawPointer..void.const.p("pointer")
    )

    reuse(GL11C, "Viewport")
}