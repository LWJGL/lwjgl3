/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.generator.opengl.*
import org.lwjgl.generator.opengl.BufferType.*
import org.lwjgl.opengl.*

val PRIMITIVE_TYPES =
	"""
	GL11#POINTS GL11#LINE_STRIP GL11#LINE_LOOP GL11#LINES GL11#POLYGON GL11#TRIANGLE_STRIP GL11#TRIANGLE_FAN GL11#TRIANGLES
	GL11#QUAD_STRIP GL11#QUADS GL32#LINES_ADJACENCY GL32#LINE_STRIP_ADJACENCY GL32#TRIANGLES_ADJACENCY GL32#TRIANGLE_STRIP_ADJACENCY
	GL40#PATCHES
	"""

// Table 8.26
val CUBE_MAP_FACES =
	"""
	GL13#TEXTURE_CUBE_MAP_POSITIVE_X GL13#TEXTURE_CUBE_MAP_NEGATIVE_X
	GL13#TEXTURE_CUBE_MAP_POSITIVE_Y GL13#TEXTURE_CUBE_MAP_NEGATIVE_Y
	GL13#TEXTURE_CUBE_MAP_POSITIVE_Z GL13#TEXTURE_CUBE_MAP_NEGATIVE_Z
	"""

val TEXTURE_2D_TARGETS = "GL11#TEXTURE_2D GL30#TEXTURE_1D_ARRAY GL31#TEXTURE_RECTANGLE GL13#TEXTURE_CUBE_MAP"
val TEXTURE_2D_FACE_TARGETS = "GL11#TEXTURE_2D GL30#TEXTURE_1D_ARRAY $CUBE_MAP_FACES"
val PROXY_TEXTURE_2D_TARGETS = "GL11#PROXY_TEXTURE_2D GL30#PROXY_TEXTURE_1D_ARRAY GL31#PROXY_TEXTURE_RECTANGLE GL13#PROXY_TEXTURE_CUBE_MAP"

val TEXTURE_3D_TARGETS = "GL12#TEXTURE_3D GL30#TEXTURE_2D_ARRAY GL40#TEXTURE_CUBE_MAP_ARRAY"
val PROXY_TEXTURE_3D_TARGETS = "GL12#PROXY_TEXTURE_3D GL30#PROXY_TEXTURE_2D_ARRAY GL40#PROXY_TEXTURE_CUBE_MAP_ARRAY"

// Table 8.7
val CORE_PIXEL_DATA_TYPES =
	"""
	GL11#UNSIGNED_BYTE GL11#BYTE GL11#UNSIGNED_SHORT GL11#SHORT GL11#UNSIGNED_INT GL11#INT GL30#HALF_FLOAT GL11#FLOAT
	GL12#UNSIGNED_BYTE_3_3_2 GL12#UNSIGNED_BYTE_2_3_3_REV GL12#UNSIGNED_SHORT_5_6_5 GL12#UNSIGNED_SHORT_5_6_5_REV GL12#UNSIGNED_SHORT_4_4_4_4
	GL12#UNSIGNED_SHORT_4_4_4_4_REV GL12#UNSIGNED_SHORT_5_5_5_1 GL12#UNSIGNED_SHORT_1_5_5_5_REV
	GL12#UNSIGNED_INT_8_8_8_8 GL12#UNSIGNED_INT_8_8_8_8_REV GL12#UNSIGNED_INT_10_10_10_2 GL12#UNSIGNED_INT_2_10_10_10_REV GL30#UNSIGNED_INT_24_8
	GL30#UNSIGNED_INT_10F_11F_11F_REV GL30#UNSIGNED_INT_5_9_9_9_REV
	GL30#FLOAT_32_UNSIGNED_INT_24_8_REV
	"""

val PIXEL_DATA_TYPES = "$CORE_PIXEL_DATA_TYPES GL11#BITMAP"

// Table 8.8
val COLOR_PIXEL_DATA_FORMATS =
	"""
	GL11#RED GL11#GREEN GL11#BLUE GL11#ALPHA GL30#RG GL11#RGB GL11#RGBA GL12#BGR GL12#BGRA
	GL11#LUMINANCE GL11#LUMINANCE_ALPHA
	GL30#RED_INTEGER GL30#GREEN_INTEGER GL30#BLUE_INTEGER GL30#ALPHA_INTEGER GL30#RG_INTEGER GL30#RGB_INTEGER GL30#RGBA_INTEGER
	GL30#BGR_INTEGER GL30#BGRA_INTEGER
	"""

val PIXEL_DATA_FORMATS = "GL11#STENCIL_INDEX GL11#DEPTH_COMPONENT GL30#DEPTH_STENCIL $COLOR_PIXEL_DATA_FORMATS"

// Table 8.22
val GENERIC_COMPRESSED_TEXTURE_INTERNAL_FORMATS =
	"GL30#COMPRESSED_RED GL30#COMPRESSED_RG GL13#COMPRESSED_RGB GL13#COMPRESSED_RGBA GL21#COMPRESSED_SRGB GL21#COMPRESSED_SRGB_ALPHA"

val SPECIFIC_COMPRESSED_TEXTURE_INTERNAL_FORMATS =
	"""
	GL30#COMPRESSED_RED_RGTC1 GL30#COMPRESSED_SIGNED_RED_RGTC1 GL30#COMPRESSED_RG_RGTC2 GL30#COMPRESSED_SIGNED_RG_RGTC2
	GL42#COMPRESSED_RGBA_BPTC_UNORM GL42#COMPRESSED_SRGB_ALPHA_BPTC_UNORM GL42#COMPRESSED_RGB_BPTC_SIGNED_FLOAT GL42#COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT

	GL43#COMPRESSED_RGB8_ETC2 GL43#COMPRESSED_SRGB8_ETC2 GL43#COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2
	GL43#COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 GL43#COMPRESSED_RGBA8_ETC2_EAC GL43#COMPRESSED_SRGB8_ALPHA8_ETC2_EAC GL43#COMPRESSED_R11_EAC
	GL43#COMPRESSED_SIGNED_R11_EAC GL43#COMPRESSED_RG11_EAC GL43#COMPRESSED_SIGNED_RG11_EAC

	@##EXTTextureCompressionS3TC @##EXTTextureCompressionLATC @##ATITextureCompression3DC
	"""

// Tables 8.18, 8.19, 8.20, 8.21, 8.22
val TEXTURE_INTERNAL_FORMATS =
	"""
	GL11#RED GL30#RG GL11#RGB GL11#RGBA GL11#DEPTH_COMPONENT GL30#DEPTH_STENCIL
	GL30#R8 GL31#R8_SNORM GL30#R16 GL31#R16_SNORM GL30#RG8 GL31#RG8_SNORM GL30#RG16 GL31#RG16_SNORM
	GL11#R3_G3_B2 GL11#RGB4 GL11#RGB5 GL41#RGB565 GL11#RGB8

	GL31#RGB8_SNORM GL11#RGB10 GL11#RGB12 GL11#RGB16 GL31#RGB16_SNORM GL11#RGBA2 GL11#RGBA4 GL11#RGB5_A1 GL11#RGBA8
	GL31#RGBA8_SNORM GL11#RGB10_A2 GL33#RGB10_A2UI GL11#RGBA12 GL11#RGBA16 GL31#RGBA16_SNORM GL21#SRGB8 GL21#SRGB8_ALPHA8 GL30#R16F
	GL30#RG16F GL30#RGB16F GL30#RGBA16F GL30#R32F GL30#RG32F GL30#RGB32F GL30#RGBA32F GL30#R11F_G11F_B10F GL30#RGB9_E5 GL30#R8I
	GL30#R8UI GL30#R16I GL30#R16UI GL30#R32I GL30#R32UI GL30#RG8I GL30#RG8UI GL30#RG16I GL30#RG16UI GL30#RG32I GL30#RG32UI
	GL30#RGB8I GL30#RGB8UI GL30#RGB16I GL30#RGB16UI GL30#RGB32I GL30#RGB32UI GL30#RGBA8I GL30#RGBA8UI GL30#RGBA16I GL30#RGBA16UI
	GL30#RGBA32I GL30#RGBA32UI

	GL14#DEPTH_COMPONENT16 GL14#DEPTH_COMPONENT24 GL14#DEPTH_COMPONENT32 GL30#DEPTH24_STENCIL8 GL30#DEPTH_COMPONENT32F GL30#DEPTH32F_STENCIL8

	$GENERIC_COMPRESSED_TEXTURE_INTERNAL_FORMATS $SPECIFIC_COMPRESSED_TEXTURE_INTERNAL_FORMATS
	"""

// Error codes
val INVALID_ENUM = "GL11#INVALID_ENUM"
val INVALID_VALUE = "GL11#INVALID_VALUE"
val INVALID_OPERATION = "GL11#INVALID_OPERATION"
val STACK_OVERFLOW = "GL11#STACK_OVERFLOW"
val STACK_UNDERFLOW = "GL11#STACK_UNDERFLOW"
val OUT_OF_MEMORY = "GL11#OUT_OF_MEMORY"
val INVALID_FRAMEBUFFER_OPERATION = "GL30#INVALID_FRAMEBUFFER_OPERATION"

val GL11 = "GL11".nativeClassGL("GL11") {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		The core OpenGL 1.1 functionality.

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

	IntConstant.block(
		"AccumOp",
		"ACCUM" _ 0x0100,
		"LOAD" _ 0x0101,
		"RETURN" _ 0x0102,
		"MULT" _ 0x0103,
		"ADD" _ 0x0104
	)

	IntConstant.block(
		"AlphaFunction",
		"NEVER" _ 0x0200,
		"LESS" _ 0x0201,
		"EQUAL" _ 0x0202,
		"LEQUAL" _ 0x0203,
		"GREATER" _ 0x0204,
		"NOTEQUAL" _ 0x0205,
		"GEQUAL" _ 0x0206,
		"ALWAYS" _ 0x0207
	)

	IntConstant.block(
		"AttribMask",
		"CURRENT_BIT" _ 0x00000001,
		"POINT_BIT" _ 0x00000002,
		"LINE_BIT" _ 0x00000004,
		"POLYGON_BIT" _ 0x00000008,
		"POLYGON_STIPPLE_BIT" _ 0x00000010,
		"PIXEL_MODE_BIT" _ 0x00000020,
		"LIGHTING_BIT" _ 0x00000040,
		"FOG_BIT" _ 0x00000080,
		"DEPTH_BUFFER_BIT" _ 0x00000100,
		"ACCUM_BUFFER_BIT" _ 0x00000200,
		"STENCIL_BUFFER_BIT" _ 0x00000400,
		"VIEWPORT_BIT" _ 0x00000800,
		"TRANSFORM_BIT" _ 0x00001000,
		"ENABLE_BIT" _ 0x00002000,
		"COLOR_BUFFER_BIT" _ 0x00004000,
		"HINT_BIT" _ 0x00008000,
		"EVAL_BIT" _ 0x00010000,
		"LIST_BIT" _ 0x00020000,
		"TEXTURE_BIT" _ 0x00040000,
		"SCISSOR_BIT" _ 0x00080000,
		"ALL_ATTRIB_BITS" _ 0x000fffff
	)

	IntConstant.block(
		"BeginMode",
		"POINTS" _ 0x0000,
		"LINES" _ 0x0001,
		"LINE_LOOP" _ 0x0002,
		"LINE_STRIP" _ 0x0003,
		"TRIANGLES" _ 0x0004,
		"TRIANGLE_STRIP" _ 0x0005,
		"TRIANGLE_FAN" _ 0x0006,
		"QUADS" _ 0x0007,
		"QUAD_STRIP" _ 0x0008,
		"POLYGON" _ 0x0009
	)

	IntConstant.block(
		"BlendingFactorDest",
		"ZERO" _ 0,
		"ONE" _ 1,
		"SRC_COLOR" _ 0x0300,
		"ONE_MINUS_SRC_COLOR" _ 0x0301,
		"SRC_ALPHA" _ 0x0302,
		"ONE_MINUS_SRC_ALPHA" _ 0x0303,
		"DST_ALPHA" _ 0x0304,
		"ONE_MINUS_DST_ALPHA" _ 0x0305
	)

	IntConstant.block(
		"BlendingFactorSrc",
		/*	  ZERO */
		/*	  ONE */
		"DST_COLOR" _ 0x0306,
		"ONE_MINUS_DST_COLOR" _ 0x0307,
		"SRC_ALPHA_SATURATE" _ 0x0308,
		"CONSTANT_COLOR" _ 0x8001,
		"ONE_MINUS_CONSTANT_COLOR" _ 0x8002,
		"CONSTANT_ALPHA" _ 0x8003,
		"ONE_MINUS_CONSTANT_ALPHA" _ 0x8004
	)

	IntConstant.block(
		"Boolean",
		"TRUE" _ 1,
		"FALSE" _ 0
	)

	IntConstant.block(
		"ClipPlaneName",
		"CLIP_PLANE0" _ 0x3000,
		"CLIP_PLANE1" _ 0x3001,
		"CLIP_PLANE2" _ 0x3002,
		"CLIP_PLANE3" _ 0x3003,
		"CLIP_PLANE4" _ 0x3004,
		"CLIP_PLANE5" _ 0x3005
	)

	IntConstant.block(
		"DataType",
		"BYTE" _ 0x1400,
		"UNSIGNED_BYTE" _ 0x1401,
		"SHORT" _ 0x1402,
		"UNSIGNED_SHORT" _ 0x1403,
		"INT" _ 0x1404,
		"UNSIGNED_INT" _ 0x1405,
		"FLOAT" _ 0x1406,
		"2_BYTES" _ 0x1407,
		"3_BYTES" _ 0x1408,
		"4_BYTES" _ 0x1409,
		"DOUBLE" _ 0x140A
	)

	IntConstant.block(
		"DrawBufferMode",
		"NONE" _ 0,
		"FRONT_LEFT" _ 0x0400,
		"FRONT_RIGHT" _ 0x0401,
		"BACK_LEFT" _ 0x0402,
		"BACK_RIGHT" _ 0x0403,
		"FRONT" _ 0x0404,
		"BACK" _ 0x0405,
		"LEFT" _ 0x0406,
		"RIGHT" _ 0x0407,
		"FRONT_AND_BACK" _ 0x0408,
		"AUX0" _ 0x0409,
		"AUX1" _ 0x040A,
		"AUX2" _ 0x040B,
		"AUX3" _ 0x040C
	)

	IntConstant.block(
		"ErrorCode",
		"NO_ERROR" _ 0,
		"INVALID_ENUM" _ 0x0500,
		"INVALID_VALUE" _ 0x0501,
		"INVALID_OPERATION" _ 0x0502,
		"STACK_OVERFLOW" _ 0x0503,
		"STACK_UNDERFLOW" _ 0x0504,
		"OUT_OF_MEMORY" _ 0x0505
	)

	IntConstant.block(
		"FeedBackMode",
		"2D" _ 0x0600,
		"3D" _ 0x0601,
		"3D_COLOR" _ 0x0602,
		"3D_COLOR_TEXTURE" _ 0x0603,
		"4D_COLOR_TEXTURE" _ 0x0604
	)

	IntConstant.block(
		"FeedBackToken",
		"PASS_THROUGH_TOKEN" _ 0x0700,
		"POINT_TOKEN" _ 0x0701,
		"LINE_TOKEN" _ 0x0702,
		"POLYGON_TOKEN" _ 0x0703,
		"BITMAP_TOKEN" _ 0x0704,
		"DRAW_PIXEL_TOKEN" _ 0x0705,
		"COPY_PIXEL_TOKEN" _ 0x0706,
		"LINE_RESET_TOKEN" _ 0x0707
	)

	IntConstant.block(
		"FogMode",
		/*	  LINEAR */
		"EXP" _ 0x0800,
		"EXP2" _ 0x0801
	)

	IntConstant.block(
		"FrontFaceDirection",
		"CW" _ 0x0900,
		"CCW" _ 0x0901
	)

	IntConstant.block(
		"GetMapTarget",
		"COEFF" _ 0x0A00,
		"ORDER" _ 0x0A01,
		"DOMAIN" _ 0x0A02
	)

	IntConstant.block(
		"GetTarget",
		"CURRENT_COLOR" _ 0x0B00,
		"CURRENT_INDEX" _ 0x0B01,
		"CURRENT_NORMAL" _ 0x0B02,
		"CURRENT_TEXTURE_COORDS" _ 0x0B03,
		"CURRENT_RASTER_COLOR" _ 0x0B04,
		"CURRENT_RASTER_INDEX" _ 0x0B05,
		"CURRENT_RASTER_TEXTURE_COORDS" _ 0x0B06,
		"CURRENT_RASTER_POSITION" _ 0x0B07,
		"CURRENT_RASTER_POSITION_VALID" _ 0x0B08,
		"CURRENT_RASTER_DISTANCE" _ 0x0B09,
		"POINT_SMOOTH" _ 0x0B10,
		"POINT_SIZE" _ 0x0B11,
		"POINT_SIZE_RANGE" _ 0x0B12,
		"POINT_SIZE_GRANULARITY" _ 0x0B13,
		"LINE_SMOOTH" _ 0x0B20,
		"LINE_WIDTH" _ 0x0B21,
		"LINE_WIDTH_RANGE" _ 0x0B22,
		"LINE_WIDTH_GRANULARITY" _ 0x0B23,
		"LINE_STIPPLE" _ 0x0B24,
		"LINE_STIPPLE_PATTERN" _ 0x0B25,
		"LINE_STIPPLE_REPEAT" _ 0x0B26,
		"LIST_MODE" _ 0x0B30,
		"MAX_LIST_NESTING" _ 0x0B31,
		"LIST_BASE" _ 0x0B32,
		"LIST_INDEX" _ 0x0B33,
		"POLYGON_MODE" _ 0x0B40,
		"POLYGON_SMOOTH" _ 0x0B41,
		"POLYGON_STIPPLE" _ 0x0B42,
		"EDGE_FLAG" _ 0x0B43,
		"CULL_FACE" _ 0x0B44,
		"CULL_FACE_MODE" _ 0x0B45,
		"FRONT_FACE" _ 0x0B46,
		"LIGHTING" _ 0x0B50,
		"LIGHT_MODEL_LOCAL_VIEWER" _ 0x0B51,
		"LIGHT_MODEL_TWO_SIDE" _ 0x0B52,
		"LIGHT_MODEL_AMBIENT" _ 0x0B53,
		"SHADE_MODEL" _ 0x0B54,
		"COLOR_MATERIAL_FACE" _ 0x0B55,
		"COLOR_MATERIAL_PARAMETER" _ 0x0B56,
		"COLOR_MATERIAL" _ 0x0B57,
		"FOG" _ 0x0B60,
		"FOG_INDEX" _ 0x0B61,
		"FOG_DENSITY" _ 0x0B62,
		"FOG_START" _ 0x0B63,
		"FOG_END" _ 0x0B64,
		"FOG_MODE" _ 0x0B65,
		"FOG_COLOR" _ 0x0B66,
		"DEPTH_RANGE" _ 0x0B70,
		"DEPTH_TEST" _ 0x0B71,
		"DEPTH_WRITEMASK" _ 0x0B72,
		"DEPTH_CLEAR_VALUE" _ 0x0B73,
		"DEPTH_FUNC" _ 0x0B74,
		"ACCUM_CLEAR_VALUE" _ 0x0B80,
		"STENCIL_TEST" _ 0x0B90,
		"STENCIL_CLEAR_VALUE" _ 0x0B91,
		"STENCIL_FUNC" _ 0x0B92,
		"STENCIL_VALUE_MASK" _ 0x0B93,
		"STENCIL_FAIL" _ 0x0B94,
		"STENCIL_PASS_DEPTH_FAIL" _ 0x0B95,
		"STENCIL_PASS_DEPTH_PASS" _ 0x0B96,
		"STENCIL_REF" _ 0x0B97,
		"STENCIL_WRITEMASK" _ 0x0B98,
		"MATRIX_MODE" _ 0x0BA0,
		"NORMALIZE" _ 0x0BA1,
		"VIEWPORT" _ 0x0BA2,
		"MODELVIEW_STACK_DEPTH" _ 0x0BA3,
		"PROJECTION_STACK_DEPTH" _ 0x0BA4,
		"TEXTURE_STACK_DEPTH" _ 0x0BA5,
		"MODELVIEW_MATRIX" _ 0x0BA6,
		"PROJECTION_MATRIX" _ 0x0BA7,
		"TEXTURE_MATRIX" _ 0x0BA8,
		"ATTRIB_STACK_DEPTH" _ 0x0BB0,
		"CLIENT_ATTRIB_STACK_DEPTH" _ 0x0BB1,
		"ALPHA_TEST" _ 0x0BC0,
		"ALPHA_TEST_FUNC" _ 0x0BC1,
		"ALPHA_TEST_REF" _ 0x0BC2,
		"DITHER" _ 0x0BD0,
		"BLEND_DST" _ 0x0BE0,
		"BLEND_SRC" _ 0x0BE1,
		"BLEND" _ 0x0BE2,
		"LOGIC_OP_MODE" _ 0x0BF0,
		"INDEX_LOGIC_OP" _ 0x0BF1,
		"COLOR_LOGIC_OP" _ 0x0BF2,
		"AUX_BUFFERS" _ 0x0C00,
		"DRAW_BUFFER" _ 0x0C01,
		"READ_BUFFER" _ 0x0C02,
		"SCISSOR_BOX" _ 0x0C10,
		"SCISSOR_TEST" _ 0x0C11,
		"INDEX_CLEAR_VALUE" _ 0x0C20,
		"INDEX_WRITEMASK" _ 0x0C21,
		"COLOR_CLEAR_VALUE" _ 0x0C22,
		"COLOR_WRITEMASK" _ 0x0C23,
		"INDEX_MODE" _ 0x0C30,
		"RGBA_MODE" _ 0x0C31,
		"DOUBLEBUFFER" _ 0x0C32,
		"STEREO" _ 0x0C33,
		"RENDER_MODE" _ 0x0C40,
		"PERSPECTIVE_CORRECTION_HINT" _ 0x0C50,
		"POINT_SMOOTH_HINT" _ 0x0C51,
		"LINE_SMOOTH_HINT" _ 0x0C52,
		"POLYGON_SMOOTH_HINT" _ 0x0C53,
		"FOG_HINT" _ 0x0C54,
		"TEXTURE_GEN_S" _ 0x0C60,
		"TEXTURE_GEN_T" _ 0x0C61,
		"TEXTURE_GEN_R" _ 0x0C62,
		"TEXTURE_GEN_Q" _ 0x0C63,
		"PIXEL_MAP_I_TO_I" _ 0x0C70,
		"PIXEL_MAP_S_TO_S" _ 0x0C71,
		"PIXEL_MAP_I_TO_R" _ 0x0C72,
		"PIXEL_MAP_I_TO_G" _ 0x0C73,
		"PIXEL_MAP_I_TO_B" _ 0x0C74,
		"PIXEL_MAP_I_TO_A" _ 0x0C75,
		"PIXEL_MAP_R_TO_R" _ 0x0C76,
		"PIXEL_MAP_G_TO_G" _ 0x0C77,
		"PIXEL_MAP_B_TO_B" _ 0x0C78,
		"PIXEL_MAP_A_TO_A" _ 0x0C79,
		"PIXEL_MAP_I_TO_I_SIZE" _ 0x0CB0,
		"PIXEL_MAP_S_TO_S_SIZE" _ 0x0CB1,
		"PIXEL_MAP_I_TO_R_SIZE" _ 0x0CB2,
		"PIXEL_MAP_I_TO_G_SIZE" _ 0x0CB3,
		"PIXEL_MAP_I_TO_B_SIZE" _ 0x0CB4,
		"PIXEL_MAP_I_TO_A_SIZE" _ 0x0CB5,
		"PIXEL_MAP_R_TO_R_SIZE" _ 0x0CB6,
		"PIXEL_MAP_G_TO_G_SIZE" _ 0x0CB7,
		"PIXEL_MAP_B_TO_B_SIZE" _ 0x0CB8,
		"PIXEL_MAP_A_TO_A_SIZE" _ 0x0CB9,
		"UNPACK_SWAP_BYTES" _ 0x0CF0,
		"UNPACK_LSB_FIRST" _ 0x0CF1,
		"UNPACK_ROW_LENGTH" _ 0x0CF2,
		"UNPACK_SKIP_ROWS" _ 0x0CF3,
		"UNPACK_SKIP_PIXELS" _ 0x0CF4,
		"UNPACK_ALIGNMENT" _ 0x0CF5,
		"PACK_SWAP_BYTES" _ 0x0D00,
		"PACK_LSB_FIRST" _ 0x0D01,
		"PACK_ROW_LENGTH" _ 0x0D02,
		"PACK_SKIP_ROWS" _ 0x0D03,
		"PACK_SKIP_PIXELS" _ 0x0D04,
		"PACK_ALIGNMENT" _ 0x0D05,
		"MAP_COLOR" _ 0x0D10,
		"MAP_STENCIL" _ 0x0D11,
		"INDEX_SHIFT" _ 0x0D12,
		"INDEX_OFFSET" _ 0x0D13,
		"RED_SCALE" _ 0x0D14,
		"RED_BIAS" _ 0x0D15,
		"ZOOM_X" _ 0x0D16,
		"ZOOM_Y" _ 0x0D17,
		"GREEN_SCALE" _ 0x0D18,
		"GREEN_BIAS" _ 0x0D19,
		"BLUE_SCALE" _ 0x0D1A,
		"BLUE_BIAS" _ 0x0D1B,
		"ALPHA_SCALE" _ 0x0D1C,
		"ALPHA_BIAS" _ 0x0D1D,
		"DEPTH_SCALE" _ 0x0D1E,
		"DEPTH_BIAS" _ 0x0D1F,
		"MAX_EVAL_ORDER" _ 0x0D30,
		"MAX_LIGHTS" _ 0x0D31,
		"MAX_CLIP_PLANES" _ 0x0D32,
		"MAX_TEXTURE_SIZE" _ 0x0D33,
		"MAX_PIXEL_MAP_TABLE" _ 0x0D34,
		"MAX_ATTRIB_STACK_DEPTH" _ 0x0D35,
		"MAX_MODELVIEW_STACK_DEPTH" _ 0x0D36,
		"MAX_NAME_STACK_DEPTH" _ 0x0D37,
		"MAX_PROJECTION_STACK_DEPTH" _ 0x0D38,
		"MAX_TEXTURE_STACK_DEPTH" _ 0x0D39,
		"MAX_VIEWPORT_DIMS" _ 0x0D3A,
		"MAX_CLIENT_ATTRIB_STACK_DEPTH" _ 0x0D3B,
		"SUBPIXEL_BITS" _ 0x0D50,
		"INDEX_BITS" _ 0x0D51,
		"RED_BITS" _ 0x0D52,
		"GREEN_BITS" _ 0x0D53,
		"BLUE_BITS" _ 0x0D54,
		"ALPHA_BITS" _ 0x0D55,
		"DEPTH_BITS" _ 0x0D56,
		"STENCIL_BITS" _ 0x0D57,
		"ACCUM_RED_BITS" _ 0x0D58,
		"ACCUM_GREEN_BITS" _ 0x0D59,
		"ACCUM_BLUE_BITS" _ 0x0D5A,
		"ACCUM_ALPHA_BITS" _ 0x0D5B,
		"NAME_STACK_DEPTH" _ 0x0D70,
		"AUTO_NORMAL" _ 0x0D80,
		"MAP1_COLOR_4" _ 0x0D90,
		"MAP1_INDEX" _ 0x0D91,
		"MAP1_NORMAL" _ 0x0D92,
		"MAP1_TEXTURE_COORD_1" _ 0x0D93,
		"MAP1_TEXTURE_COORD_2" _ 0x0D94,
		"MAP1_TEXTURE_COORD_3" _ 0x0D95,
		"MAP1_TEXTURE_COORD_4" _ 0x0D96,
		"MAP1_VERTEX_3" _ 0x0D97,
		"MAP1_VERTEX_4" _ 0x0D98,
		"MAP2_COLOR_4" _ 0x0DB0,
		"MAP2_INDEX" _ 0x0DB1,
		"MAP2_NORMAL" _ 0x0DB2,
		"MAP2_TEXTURE_COORD_1" _ 0x0DB3,
		"MAP2_TEXTURE_COORD_2" _ 0x0DB4,
		"MAP2_TEXTURE_COORD_3" _ 0x0DB5,
		"MAP2_TEXTURE_COORD_4" _ 0x0DB6,
		"MAP2_VERTEX_3" _ 0x0DB7,
		"MAP2_VERTEX_4" _ 0x0DB8,
		"MAP1_GRID_DOMAIN" _ 0x0DD0,
		"MAP1_GRID_SEGMENTS" _ 0x0DD1,
		"MAP2_GRID_DOMAIN" _ 0x0DD2,
		"MAP2_GRID_SEGMENTS" _ 0x0DD3,
		"TEXTURE_1D" _ 0x0DE0,
		"TEXTURE_2D" _ 0x0DE1,
		"FEEDBACK_BUFFER_POINTER" _ 0x0DF0,
		"FEEDBACK_BUFFER_SIZE" _ 0x0DF1,
		"FEEDBACK_BUFFER_TYPE" _ 0x0DF2,
		"SELECTION_BUFFER_POINTER" _ 0x0DF3,
		"SELECTION_BUFFER_SIZE" _ 0x0DF4
	)

	IntConstant.block(
		"GetTextureParameter",
		/*	  TEXTURE_MAG_FILTER */
		/*	  TEXTURE_MIN_FILTER */
		/*	  TEXTURE_WRAP_S */
		/*	  TEXTURE_WRAP_T */
		"TEXTURE_WIDTH" _ 0x1000,
		"TEXTURE_HEIGHT" _ 0x1001,
		"TEXTURE_INTERNAL_FORMAT" _ 0x1003,
		"TEXTURE_BORDER_COLOR" _ 0x1004,
		"TEXTURE_BORDER" _ 0x1005
		/*	  TEXTURE_RED_SIZE */
		/*	  TEXTURE_GREEN_SIZE */
		/*	  TEXTURE_BLUE_SIZE */
		/*	  TEXTURE_ALPHA_SIZE */
		/*	  TEXTURE_LUMINANCE_SIZE */
		/*	  TEXTURE_INTENSITY_SIZE */
		/*	  TEXTURE_PRIORITY */
		/*	  TEXTURE_RESIDENT */
	)

	IntConstant.block(
		"HintMode",
		"DONT_CARE" _ 0x1100,
		"FASTEST" _ 0x1101,
		"NICEST" _ 0x1102
	)

	IntConstant.block(
		"LightName",
		"LIGHT0" _ 0x4000,
		"LIGHT1" _ 0x4001,
		"LIGHT2" _ 0x4002,
		"LIGHT3" _ 0x4003,
		"LIGHT4" _ 0x4004,
		"LIGHT5" _ 0x4005,
		"LIGHT6" _ 0x4006,
		"LIGHT7" _ 0x4007
	)

	IntConstant.block(
		"LightParameter",
		"AMBIENT" _ 0x1200,
		"DIFFUSE" _ 0x1201,
		"SPECULAR" _ 0x1202,
		"POSITION" _ 0x1203,
		"SPOT_DIRECTION" _ 0x1204,
		"SPOT_EXPONENT" _ 0x1205,
		"SPOT_CUTOFF" _ 0x1206,
		"CONSTANT_ATTENUATION" _ 0x1207,
		"LINEAR_ATTENUATION" _ 0x1208,
		"QUADRATIC_ATTENUATION" _ 0x1209
	)

	IntConstant.block(
		"ListMode",
		"COMPILE" _ 0x1300,
		"COMPILE_AND_EXECUTE" _ 0x1301
	)

	IntConstant.block(
		"LogicOp",
		"CLEAR" _ 0x1500,
		"AND" _ 0x1501,
		"AND_REVERSE" _ 0x1502,
		"COPY" _ 0x1503,
		"AND_INVERTED" _ 0x1504,
		"NOOP" _ 0x1505,
		"XOR" _ 0x1506,
		"OR" _ 0x1507,
		"NOR" _ 0x1508,
		"EQUIV" _ 0x1509,
		"INVERT" _ 0x150A,
		"OR_REVERSE" _ 0x150B,
		"COPY_INVERTED" _ 0x150C,
		"OR_INVERTED" _ 0x150D,
		"NAND" _ 0x150E,
		"SET" _ 0x150F
	)

	IntConstant.block(
		"MaterialParameter",
		"EMISSION" _ 0x1600,
		"SHININESS" _ 0x1601,
		"AMBIENT_AND_DIFFUSE" _ 0x1602,
		"COLOR_INDEXES" _ 0x1603
		/*	  AMBIENT */
		/*	  DIFFUSE */
		/*	  SPECULAR */
	)

	IntConstant.block(
		"MatrixMode",
		"MODELVIEW" _ 0x1700,
		"PROJECTION" _ 0x1701,
		"TEXTURE" _ 0x1702
	)

	IntConstant.block(
		"PixelCopyType",
		"COLOR" _ 0x1800,
		"DEPTH" _ 0x1801,
		"STENCIL" _ 0x1802
	)

	IntConstant.block(
		"PixelFormat",
		"COLOR_INDEX" _ 0x1900,
		"STENCIL_INDEX" _ 0x1901,
		"DEPTH_COMPONENT" _ 0x1902,
		"RED" _ 0x1903,
		"GREEN" _ 0x1904,
		"BLUE" _ 0x1905,
		"ALPHA" _ 0x1906,
		"RGB" _ 0x1907,
		"RGBA" _ 0x1908,
		"LUMINANCE" _ 0x1909,
		"LUMINANCE_ALPHA" _ 0x190A
	)

	IntConstant.block(
		"PixelType",
		"BITMAP" _ 0x1A00
		/*	  BYTE */
		/*	  UNSIGNED_BYTE */
		/*	  SHORT */
		/*	  UNSIGNED_SHORT */
		/*	  INT */
		/*	  UNSIGNED_INT */
		/*	  FLOAT */
	)

	IntConstant.block(
		"PolygonMode",
		"POINT" _ 0x1B00,
		"LINE" _ 0x1B01,
		"FILL" _ 0x1B02
	)

	IntConstant.block(
		"RenderingMode",
		"RENDER" _ 0x1C00,
		"FEEDBACK" _ 0x1C01,
		"SELECT" _ 0x1C02
	)

	IntConstant.block(
		"ShadingModel",
		"FLAT" _ 0x1D00,
		"SMOOTH" _ 0x1D01
	)

	IntConstant.block(
		"StencilOp",
		/*	  ZERO */
		"KEEP" _ 0x1E00,
		"REPLACE" _ 0x1E01,
		"INCR" _ 0x1E02,
		"DECR" _ 0x1E03
		/*	  INVERT */
	)

	IntConstant.block(
		"StringName",
		"VENDOR" _ 0x1F00,
		"RENDERER" _ 0x1F01,
		"VERSION" _ 0x1F02,
		"EXTENSIONS" _ 0x1F03
	)

	IntConstant.block(
		"TextureCoordName",
		"S" _ 0x2000,
		"T" _ 0x2001,
		"R" _ 0x2002,
		"Q" _ 0x2003
	)

	/* TexCoordPointerType */
	/*	  SHORT */
	/*	  INT */
	/*	  FLOAT */
	/*	  DOUBLE */

	IntConstant.block(
		"TextureEnvMode",
		"MODULATE" _ 0x2100,
		"DECAL" _ 0x2101
		/*	  BLEND */
		/*	  REPLACE */
	)

	IntConstant.block(
		"TextureEnvParameter",
		"TEXTURE_ENV_MODE" _ 0x2200,
		"TEXTURE_ENV_COLOR" _ 0x2201
	)

	IntConstant.block(
		"TextureEnvTarget",
		"TEXTURE_ENV" _ 0x2300
	)

	IntConstant.block(
		"TextureGenMode",
		"EYE_LINEAR" _ 0x2400,
		"OBJECT_LINEAR" _ 0x2401,
		"SPHERE_MAP" _ 0x2402
	)

	IntConstant.block(
		"TextureGenParameter",
		"TEXTURE_GEN_MODE" _ 0x2500,
		"OBJECT_PLANE" _ 0x2501,
		"EYE_PLANE" _ 0x2502
	)

	IntConstant.block(
		"TextureMagFilter",
		"NEAREST" _ 0x2600,
		"LINEAR" _ 0x2601
	)

	IntConstant.block(
		"TextureMinFilter",
		/*	  NEAREST */
		/*	  LINEAR */
		"NEAREST_MIPMAP_NEAREST" _ 0x2700,
		"LINEAR_MIPMAP_NEAREST" _ 0x2701,
		"NEAREST_MIPMAP_LINEAR" _ 0x2702,
		"LINEAR_MIPMAP_LINEAR" _ 0x2703
	)

	IntConstant.block(
		"TextureParameterName",
		"TEXTURE_MAG_FILTER" _ 0x2800,
		"TEXTURE_MIN_FILTER" _ 0x2801,
		"TEXTURE_WRAP_S" _ 0x2802,
		"TEXTURE_WRAP_T" _ 0x2803
		/*	  TEXTURE_BORDER_COLOR */
		/*	  TEXTURE_PRIORITY */
	)

	IntConstant.block(
		"TextureWrapMode",
		"CLAMP" _ 0x2900,
		"REPEAT" _ 0x2901
	)

	IntConstant.block(
		"ClientAttribMask",
		"CLIENT_PIXEL_STORE_BIT" _ 0x00000001,
		"CLIENT_VERTEX_ARRAY_BIT" _ 0x00000002,
		"CLIENT_ALL_ATTRIB_BITS" _ 0xffffffff.i
	)

	IntConstant.block(
		"polygon_offset",
		"POLYGON_OFFSET_FACTOR" _ 0x8038,
		"POLYGON_OFFSET_UNITS" _ 0x2A00,
		"POLYGON_OFFSET_POINT" _ 0x2A01,
		"POLYGON_OFFSET_LINE" _ 0x2A02,
		"POLYGON_OFFSET_FILL" _ 0x8037
	)

	IntConstant.block(
		"texture",
		"ALPHA4" _ 0x803B,
		"ALPHA8" _ 0x803C,
		"ALPHA12" _ 0x803D,
		"ALPHA16" _ 0x803E,
		"LUMINANCE4" _ 0x803F,
		"LUMINANCE8" _ 0x8040,
		"LUMINANCE12" _ 0x8041,
		"LUMINANCE16" _ 0x8042,
		"LUMINANCE4_ALPHA4" _ 0x8043,
		"LUMINANCE6_ALPHA2" _ 0x8044,
		"LUMINANCE8_ALPHA8" _ 0x8045,
		"LUMINANCE12_ALPHA4" _ 0x8046,
		"LUMINANCE12_ALPHA12" _ 0x8047,
		"LUMINANCE16_ALPHA16" _ 0x8048,
		"INTENSITY" _ 0x8049,
		"INTENSITY4" _ 0x804A,
		"INTENSITY8" _ 0x804B,
		"INTENSITY12" _ 0x804C,
		"INTENSITY16" _ 0x804D,
		"R3_G3_B2" _ 0x2A10,
		"RGB4" _ 0x804F,
		"RGB5" _ 0x8050,
		"RGB8" _ 0x8051,
		"RGB10" _ 0x8052,
		"RGB12" _ 0x8053,
		"RGB16" _ 0x8054,
		"RGBA2" _ 0x8055,
		"RGBA4" _ 0x8056,
		"RGB5_A1" _ 0x8057,
		"RGBA8" _ 0x8058,
		"RGB10_A2" _ 0x8059,
		"RGBA12" _ 0x805A,
		"RGBA16" _ 0x805B,
		"TEXTURE_RED_SIZE" _ 0x805C,
		"TEXTURE_GREEN_SIZE" _ 0x805D,
		"TEXTURE_BLUE_SIZE" _ 0x805E,
		"TEXTURE_ALPHA_SIZE" _ 0x805F,
		"TEXTURE_LUMINANCE_SIZE" _ 0x8060,
		"TEXTURE_INTENSITY_SIZE" _ 0x8061,
		"PROXY_TEXTURE_1D" _ 0x8063,
		"PROXY_TEXTURE_2D" _ 0x8064
	)

	IntConstant.block(
		"texture_object",
		"TEXTURE_PRIORITY" _ 0x8066,
		"TEXTURE_RESIDENT" _ 0x8067,
		"TEXTURE_BINDING_1D" _ 0x8068,
		"TEXTURE_BINDING_2D" _ 0x8069
	)

	IntConstant.block(
		"vertex_array",
		"VERTEX_ARRAY" _ 0x8074,
		"NORMAL_ARRAY" _ 0x8075,
		"COLOR_ARRAY" _ 0x8076,
		"INDEX_ARRAY" _ 0x8077,
		"TEXTURE_COORD_ARRAY" _ 0x8078,
		"EDGE_FLAG_ARRAY" _ 0x8079,
		"VERTEX_ARRAY_SIZE" _ 0x807A,
		"VERTEX_ARRAY_TYPE" _ 0x807B,
		"VERTEX_ARRAY_STRIDE" _ 0x807C,
		"NORMAL_ARRAY_TYPE" _ 0x807E,
		"NORMAL_ARRAY_STRIDE" _ 0x807F,
		"COLOR_ARRAY_SIZE" _ 0x8081,
		"COLOR_ARRAY_TYPE" _ 0x8082,
		"COLOR_ARRAY_STRIDE" _ 0x8083,
		"INDEX_ARRAY_TYPE" _ 0x8085,
		"INDEX_ARRAY_STRIDE" _ 0x8086,
		"TEXTURE_COORD_ARRAY_SIZE" _ 0x8088,
		"TEXTURE_COORD_ARRAY_TYPE" _ 0x8089,
		"TEXTURE_COORD_ARRAY_STRIDE" _ 0x808A,
		"EDGE_FLAG_ARRAY_STRIDE" _ 0x808C,
		"VERTEX_ARRAY_POINTER" _ 0x808E,
		"NORMAL_ARRAY_POINTER" _ 0x808F,
		"COLOR_ARRAY_POINTER" _ 0x8090,
		"INDEX_ARRAY_POINTER" _ 0x8091,
		"TEXTURE_COORD_ARRAY_POINTER" _ 0x8092,
		"EDGE_FLAG_ARRAY_POINTER" _ 0x8093,
		"V2F" _ 0x2A20,
		"V3F" _ 0x2A21,
		"C4UB_V2F" _ 0x2A22,
		"C4UB_V3F" _ 0x2A23,
		"C3F_V3F" _ 0x2A24,
		"N3F_V3F" _ 0x2A25,
		"C4F_N3F_V3F" _ 0x2A26,
		"T2F_V3F" _ 0x2A27,
		"T4F_V4F" _ 0x2A28,
		"T2F_C4UB_V3F" _ 0x2A29,
		"T2F_C3F_V3F" _ 0x2A2A,
		"T2F_N3F_V3F" _ 0x2A2B,
		"T2F_C4F_N3F_V3F" _ 0x2A2C,
		"T4F_C4F_N3F_V4F" _ 0x2A2D
	)

	// Some definitions to be used in the javadocs below

	val COMPARISON_FUNCTIONS = "#NEVER #ALWAYS #LESS #LEQUAL #EQUAL #GEQUAL #GREATER #NOTEQUAL"

	val TEX_COORDS = "#S #T #R #Q"

	// Table 8.3
	val PIXEL_MAP_NAMES =
		"""
		GL11#PIXEL_MAP_I_TO_I GL11#PIXEL_MAP_S_TO_S GL11#PIXEL_MAP_I_TO_R GL11#PIXEL_MAP_I_TO_G GL11#PIXEL_MAP_I_TO_B GL11#PIXEL_MAP_I_TO_A
		GL11#PIXEL_MAP_R_TO_R GL11#PIXEL_MAP_G_TO_G GL11#PIXEL_MAP_B_TO_B GL11#PIXEL_MAP_A_TO_A
		"""

	val TEXTURE_PARAMETERS =
		"""
		GL12#TEXTURE_BASE_LEVEL GL11#TEXTURE_BORDER_COLOR GL14#TEXTURE_COMPARE_MODE GL14#TEXTURE_COMPARE_FUNC GL14#TEXTURE_LOD_BIAS GL11#TEXTURE_MAG_FILTER
		GL12#TEXTURE_MAX_LEVEL GL12#TEXTURE_MAX_LOD GL11#TEXTURE_MIN_FILTER GL12#TEXTURE_MIN_LOD GL11#TEXTURE_PRIORITY GL33#TEXTURE_SWIZZLE_R
		GL33#TEXTURE_SWIZZLE_G GL33#TEXTURE_SWIZZLE_B GL33#TEXTURE_SWIZZLE_A GL33#TEXTURE_SWIZZLE_RGBA GL11#TEXTURE_WRAP_S GL11#TEXTURE_WRAP_T
		GL12#TEXTURE_WRAP_R GL14#DEPTH_TEXTURE_MODE GL14#GENERATE_MIPMAP
		"""

	// Table 17.2
	val BLENDING_FUNCTIONS =
		"""
		#ZERO #ONE #SRC_COLOR #ONE_MINUS_SRC_COLOR #DST_COLOR #ONE_MINUS_DST_COLOR #SRC_ALPHA #ONE_MINUS_SRC_ALPHA #DST_ALPHA
		#ONE_MINUS_DST_ALPHA #CONSTANT_COLOR #ONE_MINUS_CONSTANT_COLOR #CONSTANT_ALPHA #ONE_MINUS_CONSTANT_ALPHA #SRC_ALPHA_SATURATE
		GL33#SRC1_COLOR GL33#ONE_MINUS_SRC1_COLOR GL15#SRC1_ALPHA GL33#ONE_MINUS_SRC1_ALPHA
		"""

	// Table 17.4 and 17.5
	val FRAMEBUFFERS =
		"""
		GL11#NONE GL11#FRONT_LEFT GL11#FRONT_RIGHT GL11#BACK_LEFT GL11#BACK_RIGHT GL11#FRONT GL11#BACK GL11#LEFT GL11#RIGHT GL11#FRONT_AND_BACK GL11#AUX0
		GL11#AUX1 GL11#AUX2 GL11#AUX3 GL30#COLOR_ATTACHMENT0 GL30.GL_COLOR_ATTACHMENT[1-15]
		"""

	// Table 21.1
	val MAP1_TARGETS =
		"""
		GL11#MAP1_VERTEX_3 GL11#MAP1_VERTEX_4 GL11#MAP1_COLOR_4 GL11#MAP1_NORMAL
		GL11#MAP1_TEXTURE_COORD_1 GL11#MAP1_TEXTURE_COORD_2 GL11#MAP1_TEXTURE_COORD_3 GL11#MAP1_TEXTURE_COORD_4
		"""

	val MAP2_TARGETS =
		"""
		GL11#MAP2_VERTEX_3 GL11#MAP2_VERTEX_4 GL11#MAP2_COLOR_4 GL11#MAP2_NORMAL
		GL11#MAP2_TEXTURE_COORD_1 GL11#MAP2_TEXTURE_COORD_2 GL11#MAP2_TEXTURE_COORD_3 GL11#MAP2_TEXTURE_COORD_4
		"""

	// Functions

	val Enable = GLvoid.func(
		"Enable",
		"Enables the specified OpenGL state.",

		GLenum.IN("target", "the OpenGL state to enable")
	).javaDocLink

	val Disable = (ReferenceGL("glEnable") _ GLvoid.func(
		"Disable",
		"Disables the specified OpenGL state.",

		GLenum.IN("target", "the OpenGL state to disable")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"Accum",
		"""
		Each portion of a pixel in the accumulation buffer consists of four values: one for each of R, G, B, and A. The accumulation buffer is controlled
		exclusively through the use of this method (except for clearing it).
		""",

		GLenum.IN("op", "a symbolic constant indicating an accumulation buffer operation"),
		GLfloat.IN("value", "a floating-point value to be used in that operation", "#ACCUM #LOAD #RETURN #MULT #ADD")
	)

	deprecatedGL _ GLvoid.func(
		"AlphaFunc",
		"""
		The alpha test discards a fragment conditionally based on the outcome of a comparison between the incoming fragment’s alpha value and a constant value.
		The comparison is enabled or disabled with the generic $Enable and $Disable commands using the symbolic constant #ALPHA_TEST.
		When disabled, it is as if the comparison always passes. The test is controlled with this method.
		""",

		GLenum.IN("func", "a symbolic constant indicating the alpha test function", COMPARISON_FUNCTIONS),
		GLfloat.IN("ref", "a reference value clamped to the range [0, 1]. When performing the alpha test, the GL will convert the reference value to the same representation as the fragment's alpha value (floating-point or fixed-point).")
	)

	deprecatedGL _ GLboolean.func(
		"AreTexturesResident",
		"""
		Returns #TRUE if all of the texture objects named in textures are resident, or if the implementation does not distinguish a working set. If
		at least one of the texture objects named in textures is not resident, then #FALSE is returned, and the residence of each texture object is
		returned in residences. Otherwise the contents of residences are not changed.
		""",

		AutoSize("textures", "residences") _ (GLsizei.IN("n", "the number of texture objects in {@code textures}")),
		mods(const, SingleValue("texture")) _ GLuint_p.IN("textures", "an array of texture objects"),
		GLboolean_p.OUT("residences", "returns the residences of each texture object")
	)

	GLvoid.func(
		"ArrayElement",
		"Transfers the ith element of every enabled, non-instanced array, and the first element of every enabled, instanced array to the GL.",

		GLint.IN("i", "the element to transfer")
	)

	val Begin = (deprecatedGL _ GLvoid.func(
		"Begin",
		"Begins the definition of vertex attributes of a sequence of primitives to be transferred to the GL.",

		GLenum.IN("mode", "the primitive type being defined", PRIMITIVE_TYPES)
	)).javaDocLink

	val BindTexture = GLvoid.func(
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
			"#TEXTURE_1D $TEXTURE_2D_TARGETS $TEXTURE_3D_TARGETS GL31#TEXTURE_BUFFER GL32#TEXTURE_2D_MULTISAMPLE GL32#TEXTURE_2D_MULTISAMPLE_ARRAY"
		),
		GLuint.IN("texture", "the texture object to bind")
	).javaDocLink

	deprecatedGL _ GLvoid.func(
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
		mods(const, PIXEL_UNPACK_BUFFER, nullable) _ GLubyte_p.IN("data", "the buffer containing the bitmap data.")
	)

	GLvoid.func(
		"BlendFunc",
		"Specifies the weighting factors used by the blend equation, for both RGB and alpha functions and for all draw buffers.",

		GLenum.IN("sfactor", "the source weighting factor", BLENDING_FUNCTIONS),
		GLenum.IN("dfactor", "the destination weighting factor")
	)

	deprecatedGL _ GLvoid.func(
		"CallList",
		"Executes a display list. Causes the commands saved in the display list to be executed, in order, just as if they were issued without using a display list.",

		GLuint.IN("list", "the index of the display list to be called")
	)

	deprecatedGL _ GLvoid.func(
		"CallLists",
		"Provides an efficient means for executing a number of display lists.",

		(AutoSize("lists") / "GLChecks.typeToBytes(type)") _ GLsizei.IN("n", "the number of display lists to be called"),
		AutoType("lists", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT) _ GLenum.IN(
			"type",
			"the data type of each element in {@code lists}",
			"#BYTE #UNSIGNED_BYTE #SHORT #UNSIGNED_SHORT #INT #UNSIGNED_INT #FLOAT #2_BYTES #3_BYTES #4_BYTES"
		),
		const _ GLvoid_p.IN("lists", "an array of offsets. Each offset is added to the display list base to obtain the display list number.")
	)

	GLvoid.func(
		"Clear",
		"""
		Sets portions of every pixel in a particular buffer to the same value. The value to which each buffer is cleared depends on the setting of the clear
		value for that buffer.
		""",

		GLbitfield.IN(
			"mask",
			"Zero or the bitwise OR of one or more values indicating which buffers are to be cleared.",
			"#ACCUM_BUFFER_BIT #COLOR_BUFFER_BIT #DEPTH_BUFFER_BIT #STENCIL_BUFFER_BIT", LinkMode.BITFIELD
		)
	)

	deprecatedGL _ GLvoid.func(
		"ClearAccum",
		"Sets the clear values for the accumulation buffer. These values are clamped to the range [-1,1] when they are specified.",

		GLfloat.IN("red", "the value to which to clear the R values of the accumulation buffer"),
		GLfloat.IN("green", "the value to which to clear the G values of the accumulation buffer"),
		GLfloat.IN("blue", "the value to which to clear the B values of the accumulation buffer"),
		GLfloat.IN("alpha", "the value to which to clear the A values of the accumulation buffer")
	)

	GLvoid.func(
		"ClearColor",
		"Sets the clear value for fixed-point and floating-point color buffers in RGBA mode. The specified components are stored as floating-point values.",

		GLfloat.IN("red", "the value to which to clear the R channel of the color buffer"),
		GLfloat.IN("green", "the value to which to clear the G channel of the color buffer"),
		GLfloat.IN("blue", "the value to which to clear the B channel of the color buffer"),
		GLfloat.IN("alpha", "the value to which to clear the A channel of the color buffer")
	)

	GLvoid.func(
		"ClearDepth",
		"""
		Sets the depth value used when clearing the depth buffer. When clearing a fixedpoint depth buffer, {@code depth} is clamped to the range [0,1] and
		converted to fixed-point. No conversion is applied when clearing a floating-point depth buffer.
		""",

		GLdouble.IN("depth", "the value to which to clear the depth buffer")
	)

	deprecatedGL _ GLvoid.func(
		"ClearIndex",
		"""
		sets the clear color index. index is converted to a fixed-point value with unspecified precision to the left of the binary point; the integer part of
		this value is then masked with ${code("2<sup>m</sup> &ndash; 1")}, where {@code m} is the number of bits in a color index value stored in the
		framebuffer.
		""",

		GLfloat.IN("index", "the value to which to clear the color buffer in color index mode")
	)

	GLvoid.func(
		"ClearStencil",
		"Sets the value to which to clear the stencil buffer. {@code s} is masked to the number of bitplanes in the stencil buffer.",

		GLint.IN("s", "the value to which to clear the stencil buffer")
	)

	GLvoid.func(
		"ClipPlane",
		"""
		Specifies a client-defined clip plane.

		The value of the first argument, {@code plane}, is a symbolic constant, CLIP_PLANEi, where i is an integer between 0 and n &ndash; 1, indicating one of
		n client-defined clip planes. {@code equation} is an array of four double-precision floating-point values. These are the coefficients of a plane
		equation in object coordinates: p1, p2, p3, and p4 (in that order).
		""",

		GLenum.IN("plane", "the clip plane to define"),
		const _ GLdouble_p.IN("equation", "the clip plane coefficients")
	)

	// Color functions javadoc
	val colorRed = "the red component of the current color"
	val colorGreen = "the green component of the current color"
	val colorBlue = "the blue component of the current color"
	val colorAlpha = "the alpha component of the current color"
	val colorBuffer = "the color buffer"

	val Color3b = (deprecatedGL _ GLvoid.func(
		"Color3b",
		"Sets the R, G, and B components of the current color. The alpha component is set to 1.0.",

		GLbyte.IN("red", colorRed),
		GLbyte.IN("green", colorGreen),
		GLbyte.IN("blue", colorBlue)
	)).javaDocLink
	val Color3s = (deprecatedGL _ GLvoid.func("Color3s", "Short version of $Color3b", GLshort.IN("red", colorRed), GLshort.IN("green", colorGreen), GLshort.IN("blue", colorBlue))).javaDocLink
	val Color3i = (deprecatedGL _ GLvoid.func("Color3i", "Integer version of $Color3b", GLint.IN("red", colorRed), GLint.IN("green", colorGreen), GLint.IN("blue", colorBlue))).javaDocLink
	val Color3f = (deprecatedGL _ GLvoid.func("Color3f", "Float version of $Color3b", GLfloat.IN("red", colorRed), GLfloat.IN("green", colorGreen), GLfloat.IN("blue", colorBlue))).javaDocLink
	val Color3d = (deprecatedGL _ GLvoid.func("Color3d", "Double version of $Color3b", GLdouble.IN("red", colorRed), GLdouble.IN("green", colorGreen), GLdouble.IN("blue", colorBlue))).javaDocLink
	val Color3ub = (deprecatedGL _ GLvoid.func("Color3ub", "Unsigned version of $Color3b", GLubyte.IN("red", colorRed), GLubyte.IN("green", colorGreen), GLubyte.IN("blue", colorBlue))).javaDocLink
	val Color3us = (deprecatedGL _ GLvoid.func("Color3us", "Unsigned short version of $Color3b", GLushort.IN("red", colorRed), GLushort.IN("green", colorGreen), GLushort.IN("blue", colorBlue))).javaDocLink
	val Color3ui = (deprecatedGL _ GLvoid.func("Color3ui", "Unsigned int version of $Color3b", GLint.IN("red", colorRed), GLint.IN("green", colorGreen), GLint.IN("blue", colorBlue))).javaDocLink

	deprecatedGL _ GLvoid.func("Color3bv", "Byte pointer version of $Color3b.", mods(const, Check(3)) _ GLbyte_p.IN("v", colorBuffer))
	deprecatedGL _ GLvoid.func("Color3sv", "Pointer version of $Color3s.", mods(const, Check(3)) _ GLshort_p.IN("v", colorBuffer))
	deprecatedGL _ GLvoid.func("Color3iv", "Pointer version of $Color3i.", mods(const, Check(3)) _ GLint_p.IN("v", colorBuffer))
	deprecatedGL _ GLvoid.func("Color3fv", "Pointer version of $Color3f.", mods(const, Check(3)) _ GLfloat_p.IN("v", colorBuffer))
	deprecatedGL _ GLvoid.func("Color3dv", "Pointer version of $Color3d.", mods(const, Check(3)) _ GLdouble_p.IN("v", colorBuffer))
	deprecatedGL _ GLvoid.func("Color3ubv", "Pointer version of $Color3ub.", mods(const, Check(3)) _ GLubyte_p.IN("v", colorBuffer))
	deprecatedGL _ GLvoid.func("Color3usv", "Pointer version of $Color3us.", mods(const, Check(3)) _ GLushort_p.IN("v", colorBuffer))
	deprecatedGL _ GLvoid.func("Color3uiv", "Pointer version of $Color3ui.", mods(const, Check(3)) _ GLuint_p.IN("v", colorBuffer))

	val Color4b = (deprecatedGL _ GLvoid.func(
		"Color4b",
		"Sets the current color.",

		GLbyte.IN("red", colorRed),
		GLbyte.IN("green", colorGreen),
		GLbyte.IN("blue", colorBlue),
		GLbyte.IN("alpha", colorAlpha)
	)).javaDocLink

	val Color4s = (deprecatedGL _ GLvoid.func("Color4s", "Short version of $Color4b", GLshort.IN("red", colorRed), GLshort.IN("green", colorGreen), GLshort.IN("blue", colorBlue), GLshort.IN("alpha", colorAlpha))).javaDocLink
	val Color4i = (deprecatedGL _ GLvoid.func("Color4i", "Integer version of $Color4b", GLint.IN("red", colorRed), GLint.IN("green", colorGreen), GLint.IN("blue", colorBlue), GLint.IN("alpha", colorAlpha))).javaDocLink
	val Color4f = (deprecatedGL _ GLvoid.func("Color4f", "Float version of $Color4b", GLfloat.IN("red", colorRed), GLfloat.IN("green", colorGreen), GLfloat.IN("blue", colorBlue), GLfloat.IN("alpha", colorAlpha))).javaDocLink
	val Color4d = (deprecatedGL _ GLvoid.func("Color4d", "Double version of $Color4b", GLdouble.IN("red", colorRed), GLdouble.IN("green", colorGreen), GLdouble.IN("blue", colorBlue), GLdouble.IN("alpha", colorAlpha))).javaDocLink
	val Color4ub = (deprecatedGL _ GLvoid.func("Color4ub", "Unsigned version of $Color4b", GLubyte.IN("red", colorRed), GLubyte.IN("green", colorGreen), GLubyte.IN("blue", colorBlue), GLubyte.IN("alpha", colorAlpha))).javaDocLink
	val Color4us = (deprecatedGL _ GLvoid.func("Color4us", "Unsigned short version of $Color4b", GLushort.IN("red", colorRed), GLushort.IN("green", colorGreen), GLushort.IN("blue", colorBlue), GLushort.IN("alpha", colorAlpha))).javaDocLink
	val Color4ui = (deprecatedGL _ GLvoid.func("Color4ui", "Unsigned int version of $Color4b", GLint.IN("red", colorRed), GLint.IN("green", colorGreen), GLint.IN("blue", colorBlue), GLint.IN("alpha", colorAlpha))).javaDocLink

	deprecatedGL _ GLvoid.func("Color4bv", "Pointer version of $Color4b.", mods(const, Check(4)) _ GLbyte_p.IN("v", colorBuffer))
	deprecatedGL _ GLvoid.func("Color4sv", "Pointer version of $Color4s.", mods(const, Check(4)) _ GLshort_p.IN("v", colorBuffer))
	deprecatedGL _ GLvoid.func("Color4iv", "Pointer version of $Color4i.", mods(const, Check(4)) _ GLint_p.IN("v", colorBuffer))
	deprecatedGL _ GLvoid.func("Color4fv", "Pointer version of $Color4f.", mods(const, Check(4)) _ GLfloat_p.IN("v", colorBuffer))
	deprecatedGL _ GLvoid.func("Color4dv", "Pointer version of $Color4d.", mods(const, Check(4)) _ GLdouble_p.IN("v", colorBuffer))
	deprecatedGL _ GLvoid.func("Color4ubv", "Pointer version of $Color4ub.", mods(const, Check(4)) _ GLubyte_p.IN("v", colorBuffer))
	deprecatedGL _ GLvoid.func("Color4usv", "Pointer version of $Color4us.", mods(const, Check(4)) _ GLushort_p.IN("v", colorBuffer))
	deprecatedGL _ GLvoid.func("Color4uiv", "Pointer version of $Color4ui.", mods(const, Check(4)) _ GLuint_p.IN("v", colorBuffer))

	GLvoid.func(
		"ColorMask",
		"Masks the writing of R, G, B and A values to all draw buffers. In the initial state, all color values are enabled for writing for all draw buffers.",

		GLboolean.IN("red", "whether R values are written or not"),
		GLboolean.IN("green", "whether G values are written or not"),
		GLboolean.IN("blue", "whether B values are written or not"),
		GLboolean.IN("alpha", "whether A values are written or not")
	)

	deprecatedGL _ GLvoid.func(
		"ColorMaterial",
		"""
		It is possible to attach one or more material properties to the current color, so that they continuously track its component values. This behavior is
		enabled and disabled by calling $Enable or $Disable with the symbolic value #COLOR_MATERIAL. This function controls which
		of these modes is selected.
		""",

		GLenum.IN("face", "specifies which material face is affected by the current color", "#FRONT #BACK #FRONT_AND_BACK"),
		GLenum.IN("mode", "specifies which material property or properties track the current color", "#EMISSION #AMBIENT #DIFFUSE #SPECULAR #AMBIENT_AND_DIFFUSE")
	)

	deprecatedGL _ GLvoid.func(
		"ColorPointer",
		"Specifies the location and organization of a color array.",

		GLint.IN("size", "the number of values per vertex that are stored in the array, as well as their component ordering", "3 4 GL12#BGRA"),
		// Removed GL_DOUBLE
		AutoType("pointer", GL_BYTE, GL_UNSIGNED_BYTE, GL_FLOAT) _ GLenum.IN(
			"type",
			"the data type of the values stored in the array",
			"#BYTE #UNSIGNED_BYTE #SHORT #UNSIGNED_SHORT #INT #UNSIGNED_INT GL30#HALF_FLOAT #FLOAT #DOUBLE GL12#UNSIGNED_INT_2_10_10_10_REV GL33#INT_2_10_10_10_REV"
		),
		GLsizei.IN("stride", "the vertex stride in bytes. If specified as zero, then array elements are stored sequentially"),
		mods(const, ARRAY_BUFFER) _ GLvoid_p.IN("pointer", "the color array data")
	)

	val CopyPixels = GLvoid.func(
		"CopyPixels",
		"Transfers a rectangle of pixel values from one region of the read framebuffer to another in the draw framebuffer",

		GLint.IN("x", "the left framebuffer pixel coordinate"),
		GLint.IN("y", "the lower framebuffer pixel coordinate"),
		GLsizei.IN("width", "the rectangle width"),
		GLsizei.IN("height", "the rectangle height"),
		GLenum.IN("type", "Indicates the type of values to be transfered", "#COLOR #STENCIL #DEPTH GL30#DEPTH_STENCIL")
	).javaDocLink

	GLvoid.func(
		"CullFace",
		"""
		Specifies which polygon faces are culled if #CULL_FACE is enabled. Front-facing polygons are rasterized if either culling is disabled or the
		CullFace mode is #BACK while back-facing polygons are rasterized only if either culling is disabled or the CullFace mode is
		#FRONT. The initial setting of the CullFace mode is #BACK. Initially, culling is disabled.
		""",

		GLenum.IN("mode", "the CullFace mode", "#FRONT #BACK #FRONT_AND_BACK")
	)

	deprecatedGL _ GLvoid.func(
		"DeleteLists",
		"""
		Deletes a contiguous group of display lists. All information about the display lists is lost, and the indices become unused. Indices to which no display
		list corresponds are ignored. If {@code range} is zero, nothing happens.
		""",

		GLuint.IN("list", "the index of the first display list to be deleted"),
		GLsizei.IN("range", "the number of display lists to be deleted")
	)

	GLvoid.func(
		"DepthFunc",
		"Specifies the comparison that takes place during the depth buffer test (when #DEPTH_TEST is enabled).",

		GLenum.IN("func", "the depth test comparison", "#NEVER #ALWAYS #LESS #LEQUAL #EQUAL #GREATER #GEQUAL #NOTEQUAL")
	)

	GLvoid.func(
		"DepthMask",
		"Masks the writing of depth values to the depth buffer. In the initial state, the depth buffer is enabled for writing.",

		GLboolean.IN("flag", "whether depth values are written or not.")
	)

	GLvoid.func(
		"DepthRange",
		"Sets the depth range for all viewports to the same values.",

		GLdouble.IN("zNear", "the near depth range"),
		GLdouble.IN("zFar", "the far depth range")
	)

	deprecatedGL _ GLvoid.func(
		"DisableClientState",
		"Disables the specified fixed-function attribute array.",

		GLenum.IN(
			"array",
			"the attribute array to disable",
			"#VERTEX_ARRAY #NORMAL_ARRAY #COLOR_ARRAY GL14#SECONDARY_COLOR_ARRAY #EDGE_FLAG_ARRAY GL15#FOG_COORD_ARRAY #TEXTURE_COORD_ARRAY"
		)
	)

	GLvoid.func(
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

	GLvoid.func(
		"DrawBuffer",
		"""
		Defines the color buffer to which fragment color zero is written.

		Acceptable values for {@code buf} depend on whether the GL is using the default framebuffer (i.e., GL30#DRAW_FRAMEBUFFER_BINDING is zero), or
		a framebuffer object (i.e., GL30#DRAW_FRAMEBUFFER_BINDING is non-zero). In the initial state, the GL is bound to the default framebuffer.
		""",

		GLenum.IN("buf", "the color buffer to draw to", FRAMEBUFFERS)
	)

	GLvoid.func(
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
			#POINTS #LINE_STRIP #LINE_LOOP #LINES #POLYGON #TRIANGLE_STRIP #TRIANGLE_FAN #TRIANGLES #QUAD_STRIP #QUADS
			GL32#LINES_ADJACENCY GL32#LINE_STRIP_ADJACENCY GL32#TRIANGLES_ADJACENCY GL32#TRIANGLE_STRIP_ADJACENCY GL40#PATCHES
			"""
		),
		(AutoSize("indices") shr "GLChecks.typeToByteShift(type)") _ GLsizei.IN("count", "the number of vertices to transfer to the GL"),
		AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT) _ GLenum.IN(
			"type",
			"indicates the type of index values in {@code indices}",
			"#UNSIGNED_BYTE #UNSIGNED_SHORT #UNSIGNED_INT"
		),
		mods(const, ELEMENT_ARRAY_BUFFER) _ GLvoid_p.IN("indices", "the index values")
	)

	deprecatedGL _ GLvoid.func(
		"DrawPixels",
		"Draws a pixel rectangle to the active draw buffers.",

		GLsizei.IN("width", "the pixel rectangle width"),
		GLsizei.IN("height", "the pixel rectangle height"),
		GLenum.IN("format", "the pixel data format", PIXEL_DATA_FORMATS),
		GLenum.IN("type", "the pixel data type", PIXEL_DATA_TYPES),
		mods(
			const,
			MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT),
			PIXEL_UNPACK_BUFFER
		) _ GLvoid_p.IN("pixels", "the pixel data")
	)

	val EdgeFlag = (deprecatedGL _ GLvoid.func(
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
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"EdgeFlagv",
		"Pointer version of $EdgeFlag.",

		mods(const, Check(1)) _ GLboolean_p.IN("flag", "the edge flag buffer")
	)

	deprecatedGL _ GLvoid.func(
		"EdgeFlagPointer",
		"Specifies the location and organization of an edge flag array.",

		GLsizei.IN("stride", "the vertex stride in bytes. If specified as zero, then array elements are stored sequentially"),
		mods(const, ARRAY_BUFFER) _ GLboolean_p.IN("pointer", "the edge flag array data")
	)

	deprecatedGL _ GLvoid.func(
		"EnableClientState",
		"Enables the specified fixed-function attribute array.",

		GLenum.IN(
			"array",
			"the attribute array to enable",
			"#VERTEX_ARRAY #NORMAL_ARRAY #COLOR_ARRAY GL14#SECONDARY_COLOR_ARRAY #EDGE_FLAG_ARRAY GL15#FOG_COORD_ARRAY #TEXTURE_COORD_ARRAY"
		)
	)

	val End = (deprecatedGL _ GLvoid.func("End", "Ends the definition of vertex attributes of a sequence of primitives to be transferred to the GL.")).javaDocLink

	val EvalCoord1f = (deprecatedGL _ GLvoid.func(
		"EvalCoord1f",
		"Causes evaluation of the enabled one-dimensional evaluator maps.",

		GLfloat.IN("u", "the domain coordinate u")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"EvalCoord1fv",
		"Pointer version of $EvalCoord1f.",

		const _ (GLfloat_p.IN("u", "the domain coordinate buffer"))
	)

	val EvalCoord1d = (deprecatedGL _ GLvoid.func(
		"EvalCoord1d",
		"Double version of $EvalCoord1f.",

		GLdouble.IN("u", "the domain coordinate u")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"EvalCoord1dv",
		"Pointer version of $EvalCoord1d.",

		const _ (GLdouble_p.IN("u", "the domain coordinate buffer"))
	)

	val EvalCoord2f = (deprecatedGL _ GLvoid.func(
		"EvalCoord2f",
		"Causes evaluation of the enabled two-dimensional evaluator maps.",

		GLfloat.IN("u", "the domain coordinate u"),
		GLfloat.IN("v", "the domain coordinate v")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"EvalCoord2fv",
		"Pointer version of $EvalCoord2f.",

		const _ (GLfloat_p.IN("u", "the domain coordinate buffer"))
	)

	val EvalCoord2d = (deprecatedGL _ GLvoid.func(
		"EvalCoord2d",
		"Double version of $EvalCoord2f.",

		GLdouble.IN("u", "the domain coordinate u"),
		GLdouble.IN("v", "the domain coordinate v")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"EvalCoord2dv",
		"Pointer version of $EvalCoord2d.",

		const _ (GLdouble_p.IN("u", "the domain coordinate buffer"))
	)

	deprecatedGL _ GLvoid.func(
		"EvalMesh1",
		"Carries out an evaluation on a subset of the one-dimensional map grid.",

		GLenum.IN("mode", "the mesh type", "#POINT #LINE"),
		GLint.IN("i1", "the start index"),
		GLint.IN("i2", "the end index")
	)

	deprecatedGL _ GLvoid.func(
		"EvalMesh2",
		"Carries out an evaluation on a rectangular subset of the two-dimensional map grid.",

		GLenum.IN("mode", "the mesh type", "#FILL #LINE #POINT"),
		GLint.IN("i1", "the u-dimension start index"),
		GLint.IN("i2", "the u-dimension end index"),
		GLint.IN("j1", "the v-dimension start index"),
		GLint.IN("j2", "the v-dimension end index")
	)

	deprecatedGL _ GLvoid.func(
		"EvalPoint1",
		"Carries out an evalutation of a single point on the one-dimensional map grid.",

		GLint.IN("i", "the grid index")
	)

	deprecatedGL _ GLvoid.func(
		"EvalPoint2",
		"Carries out an evalutation of a single point on the two-dimensional map grid.",
		GLint.IN("i", "the u-dimension grid index"),
		GLint.IN("j", "the v-dimension grid index")
	)

	deprecatedGL _ GLvoid.func(
		"FeedbackBuffer",
		"Returns information about primitives when the GL is in feedback mode.",

		AutoSize("buffer") _ GLsizei.IN("size", "the maximum number of values that can be written to {@code buffer}"),
		GLenum.IN("type", "the type of information to feed back for each vertex", "#2D #3D #3D_COLOR #3D_COLOR_TEXTURE #4D_COLOR_TEXTURE"),
		GLfloat_p.OUT("buffer", "an array of floating-point values into which feedback information will be placed")
	)

	GLvoid.func(
		"Finish",
		"""
		Forces all previously issued GL commands to complete. {@code Finish} does not return until all effects from such commands on GL client and server
		state and the framebuffer are fully realized.
		"""
	)

	GLvoid.func(
		"Flush",
		"Causes all previously issued GL commands to complete in finite time (although such commands may still be executing when {@code Flush} returns)."
	)

	val Fogi = (deprecatedGL _ GLvoid.func(
		"Fogi",
		"Sets the integer value of a fog parameter.",

		GLenum.IN("pname", "the fog parameter", "#FOG_MODE GL15#FOG_COORD_SRC"),
		GLint.IN("param", "the fog parameter value", "#EXP #EXP2 #LINEAR GL14#FRAGMENT_DEPTH GL15#FOG_COORD")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"Fogiv",
		"Pointer version of $Fogi.",

		GLenum.IN("pname", "the fog parameter", "#FOG_MODE GL15#FOG_COORD_SRC"),
		mods (const, Check(1)) _ GLint_p.IN("params", "the fog parameter buffer")
	)

	val Fogf = (deprecatedGL _ GLvoid.func(
		"Fogf",
		"Sets the float value of a fog parameter.",

		GLenum.IN("pname", "the fog parameter", "#FOG_DENSITY #FOG_START #FOG_END"),
		GLfloat.IN("param", "the fog parameter value")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"Fogfv",
		"Pointer version of $Fogf.",

		GLenum.IN("pname", "the fog parameter", "#FOG_DENSITY #FOG_START #FOG_END"),
		mods (const, Check(1)) _ GLfloat_p.IN("params", "the fog parameter buffer")
	)

	GLvoid.func(
		"FrontFace",
		"""
		The first step of polygon rasterization is to determine if the polygon is back-facing or front-facing. This determination is made based on the sign of
		the (clipped or unclipped) polygon's area computed in window coordinates. The interpretation of the sign of this value is controlled with this function.
		In the initial state, the front face direction is set to #CCW.
		""",

		GLenum.IN("dir", "the front face direction", "#CCW #CW")
	)

	deprecatedGL _ GLuint.func(
		"GenLists",
		"""
		Returns an integer n such that the indices {@code n,..., n + s - 1} are previously unused (i.e. there are {@code s} previously unused display list
		indices starting at n). {@code GenLists} also has the effect of creating an empty display list for each of the indices {@code n,..., n + s - 1}, so
		that these indices all become used. {@code GenLists} returns zero if there is no group of {@code s} contiguous previously unused display list indices,
		or if {@code s = 0}.
		""",

		GLsizei.IN("s", "the number of display lists to create")
	)

	val GenTextures = GLvoid.func(
		"GenTextures",
		"""
		Returns n previously unused texture names in textures. These names are marked as used, for the purposes of GenTextures only, but they acquire texture
		state and a dimensionality only when they are first bound, just as if they were unused.
		""",

		AutoSize("textures") _ GLsizei.IN("n", "the number of textures to create"),
		returnValue _ GLuint_p.OUT("textures", "a scalar or buffer in which to place the returned texture names")
	).javaDocLink

	GLvoid.func(
		"DeleteTextures",
		"""
		Deletes texture objects. After a texture object is deleted, it has no contents or dimensionality, and its name is again unused. If a texture that is
		currently bound to any of the target bindings of $BindTexture is deleted, it is as though $BindTexture had been executed with the
		same target and texture zero. Additionally, special care must be taken when deleting a texture if any of the images of the texture are attached to a
		framebuffer object.

		Unused names in textures that have been marked as used for the purposes of $GenTextures are marked as unused again. Unused names in textures are
		silently ignored, as is the name zero.
		""",

		AutoSize("textures") _ GLsizei.IN("n", "the number of texture names in the {@code textures} parameter"),
		mods(const, SingleValue("texture")) _  GLuint_p.IN("textures", "contains {@code n} names of texture objects to be deleted")
	)

	GLvoid.func(
		"GetClipPlane",
		"""
		Returns four double-precision values in {@code equation}; these are the coefficients of the plane equation of plane in eye coordinates (these
		coordinates are those that were computed when the plane was specified).
		""",

		GLenum.IN("plane", "the clip plane"),
		Check(4) _ GLdouble_p.OUT("equation", "a buffer in which to place the returned values")
	)

	ReferenceGL("glGet") _ GLvoid.func(
		"GetBooleanv",
		"""
		Returns the current boolean value of the specified state variable.

		<b>LWJGL note</b>: The state that corresponds to the state variable may be a single value or an array of values. In the case of an array of values,
		LWJGL will <b>not</b> validate if {@code params} has enough space to store that array. Doing so would introduce significant overhead, as the
		OpenGL state variables are too many. It is the user's responsibility to avoid JVM crashes by ensuring enough space for the returned values.
		""",

		GLenum.IN("pname", "the state variable"),
		mods(Check(1), returnValue) _ GLboolean_p.OUT("params", "a scalar or buffer in which to place the returned data")
	)

	ReferenceGL("glGet") _ GLvoid.func(
		"GetFloatv",
		"""
		Returns the current float value of the specified state variable.

		<b>LWJGL note</b>: The state that corresponds to the state variable may be a single value or an array of values. In the case of an array of values,
		LWJGL will <b>not</b> validate if {@code params} has enough space to store that array. Doing so would introduce significant overhead, as the
		OpenGL state variables are too many. It is the user's responsibility to avoid JVM crashes by ensuring enough space for the returned values.
		""",

		GLenum.IN("pname", "the state variable"),
		mods(Check(1), returnValue) _ GLfloat_p.OUT("params", "a scalar or buffer in which to place the returned data")
	)

	ReferenceGL("glGet") _ GLvoid.func(
		"GetIntegerv",
		"""
		Returns the current integer value of the specified state variable.

		<b>LWJGL note</b>: The state that corresponds to the state variable may be a single value or an array of values. In the case of an array of values,
		LWJGL will <b>not</b> validate if {@code params} has enough space to store that array. Doing so would introduce significant overhead, as the
		OpenGL state variables are too many. It is the user's responsibility to avoid JVM crashes by ensuring enough space for the returned values.
		""",

		GLenum.IN("pname", "the state variable"),
		mods(Check(1), returnValue) _ GLint_p.OUT("params", "a scalar or buffer in which to place the returned data")
	)

	ReferenceGL("glGet") _ GLvoid.func(
		"GetDoublev",
		"""
		Returns the current double value of the specified state variable.

		<b>LWJGL note</b>: The state that corresponds to the state variable may be a single value or an array of values. In the case of an array of values,
		LWJGL will <b>not</b> validate if {@code params} has enough space to store that array. Doing so would introduce significant overhead, as the
		OpenGL state variables are too many. It is the user's responsibility to avoid JVM crashes by ensuring enough space for the returned values.
		""",

		GLenum.IN("pname", "the state variable"),
		mods(Check(1), returnValue) _ GLdouble_p.OUT("params", "a scalar or buffer in which to place the returned data")
	)

	GLenum.func(
		"GetError",
		"""
		Returns error information. Each detectable error is assigned a numeric code. When an error is detected, a flag is set and the code is recorded. Further
		errors, if they occur, do not affect this recorded code. When {@code GetError} is called, the code is returned and the flag is cleared, so that a
		further error will again record its code. If a call to {@code GetError} returns #NO_ERROR, then there has been no detectable error since
		the last call to {@code GetError} (or since the GL was initialized).
		"""
	)

	val GetLightiv = (deprecatedGL _ GLvoid.func(
		"GetLightiv",
		"Returns integer information about light parameter {@code value} for {@code light} in {@code data}.",

		GLenum.IN("light", "the light for which to return information", "#LIGHT0 GL_LIGHT[1-7]"),
		GLenum.IN(
			"pname",
			"the light parameter to query",
			"""
			#AMBIENT #DIFFUSE #SPECULAR #POSITION #CONSTANT_ATTENUATION #LINEAR_ATTENUATION #QUADRATIC_ATTENUATION
			#SPOT_DIRECTION #SPOT_EXPONENT #SPOT_CUTOFF
			"""
		),
		mods(Check(4), returnValue) _ GLint_p.OUT("data", "a scalar or buffer in which to place the returned data")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"GetLightfv",
		"Float version of $GetLightiv.",

		GLenum.IN("light", "the light for which to return information"),
		GLenum.IN("pname", "the light parameter to query"),
		mods(Check(4), returnValue) _ GLfloat_p.OUT("data", "a scalar or buffer in which to place the returned data")
	)


	val GetMapiv = (deprecatedGL _ GLvoid.func(
		"GetMapiv",
		"Returns integer information about {@code query} for evaluator map {@code target} in {@code data}.",

		GLenum.IN("target", "the evaluator target", "$MAP1_TARGETS $MAP2_TARGETS"),
		GLenum.IN("query", "the information to query", "GL11#ORDER GL11#COEFF GL11#DOMAIN"),
		mods(Check(4), returnValue) _ GLint_p.OUT("data", "a scalar or buffer in which to place the returned data")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"GetMapfv",
		"Float version of $GetMapiv.",

		GLenum.IN("target", "the evaluator map"),
		GLenum.IN("query", "the information to query"),
		mods(Check(4), returnValue) _ GLfloat_p.OUT("data", "a scalar or buffer in which to place the returned data")
	)

	deprecatedGL _ GLvoid.func(
		"GetMapdv",
		"Double version of $GetMapiv.",

		GLenum.IN("target", "the evaluator map"),
		GLenum.IN("query", "the information to query"),
		mods(Check(4), returnValue) _ GLdouble_p.OUT("data", "a scalar or buffer in which to place the returned data")
	)

	val GetMaterialiv = (deprecatedGL _ GLvoid.func(
		"GetMaterialiv",
		"Returns integer information about material property {@code value} for {@code face} in {@code data}.",

		GLenum.IN("face", "the material face for which to return information", "#FRONT #BACK"),
		GLenum.IN("pname", "the information to query", "#AMBIENT #DIFFUSE #SPECULAR #EMISSION #SHININESS"),
		GLint_p.OUT("data", "a scalar or buffer in which to place the returned data")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"GetMaterialfv",
		"Float version of $GetMaterialiv.",

		GLenum.IN("face", "the material face for which to return information"),
		GLenum.IN("pname", "the information to query"),
		GLfloat_p.OUT("data", "a scalar or buffer in which to place the returned data")
	)

	val GetPixelMapfv = (deprecatedGL _ GLvoid.func(
		"GetPixelMapfv",
		"Returns all float values in the pixel map {@code map} in {@code data}.",

		GLenum.IN("map", "the pixel map parameter to query", PIXEL_MAP_NAMES),
		mods(Check(32), PIXEL_PACK_BUFFER) _ GLfloat_p.OUT("data", "a buffer in which to place the returned data")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"GetPixelMapusv",
		"Unsigned short version of $GetPixelMapfv.",

		GLenum.IN("map", "the pixel map parameter to query"),
		mods(Check(32), PIXEL_PACK_BUFFER) _ GLushort_p.OUT("data", "a buffer in which to place the returned data")
	)

	deprecatedGL _ GLvoid.func(
		"GetPixelMapuiv",
		"Unsigned integer version of $GetPixelMapfv.",

		GLenum.IN("map", "the pixel map parameter to query"),
		mods(Check(32), PIXEL_PACK_BUFFER) _ GLuint_p.OUT("data", "a buffer in which to place the returned data")
	)

	GLvoid.func(
		"GetPointerv",
		"Returns a pointer in the current GL context.",

		GLenum.IN(
			"pname",
			"the pointer to return",
			"""
			#FEEDBACK_BUFFER_POINTER #SELECTION_BUFFER_POINTER
			#VERTEX_ARRAY_POINTER #NORMAL_ARRAY_POINTER #COLOR_ARRAY_POINTER #INDEX_ARRAY_POINTER #TEXTURE_COORD_ARRAY_POINTER #EDGE_FLAG_ARRAY_POINTER
			GL14#SECONDARY_COLOR_ARRAY_POINTER GL15#FOG_COORD_ARRAY_POINTER
			GL43#DEBUG_CALLBACK_FUNCTION GL43#DEBUG_CALLBACK_USER_PARAM
			"""
		),
		mods(Check(1), returnValue) _ GLvoid_pp.OUT("params", "a buffer in which to place the returned pointer")
	)

	deprecatedGL _ GLvoid.func(
		"GetPolygonStipple",
		"Obtains the polygon stipple.",

		mods(Check(128), PIXEL_PACK_BUFFER) _ GLvoid_p.OUT("pattern", "a buffer in which to place the returned data")
	)

	(const _ GLubyteString).func(
		"GetString",
		"Return strings describing properties of the current GL context.",

		GLenum.IN("name", "the property to query", "#RENDERER #VENDOR #EXTENSIONS #VERSION GL20#SHADING_LANGUAGE_VERSION")
	)

	val GetTexEnviv = GLvoid.func(
		"GetTexEnviv",
		"Returns integer information about {@code value} for {@code env} in {@code data}.",

		GLenum.IN("env", "the texture environment to query", "GL20#POINT_SPRITE #TEXTURE_ENV GL14#TEXTURE_FILTER_CONTROL"),
		GLenum.IN(
			"pname",
			"the parameter to query",
			"""
			GL20#COORD_REPLACE #TEXTURE_ENV_MODE #TEXTURE_ENV_COLOR GL14#TEXTURE_LOD_BIAS GL13#COMBINE_RGB GL13#COMBINE_ALPHA GL15#SRC0_RGB
			GL15#SRC1_RGB GL15#SRC2_RGB GL15#SRC0_ALPHA GL15#SRC1_ALPHA GL15#SRC2_ALPHA GL13#OPERAND0_RGB GL13#OPERAND1_RGB
			GL13#OPERAND2_RGB GL13#OPERAND0_ALPHA GL13#OPERAND1_ALPHA GL13#OPERAND2_ALPHA GL13#RGB_SCALE #ALPHA_SCALE
			"""
		),
		mods(Check(1), returnValue) _ GLint_p.OUT("data", "a scalar or buffer in which to place the returned data")
	).javaDocLink

	GLvoid.func(
		"GetTexEnvfv",
		"Float version of $GetTexEnviv.",

		GLenum.IN("env", "the texture environment to query"),
		GLenum.IN("pname", "the parameter to query"),
		mods(Check(1), returnValue) _ GLfloat_p.OUT("data", "a scalar or buffer in which to place the returned data")
	)

	val GetTexGeniv = (deprecatedGL _ GLvoid.func(
		"GetTexGeniv",
		"Returns integer information about {@code value} for {@code coord} in {@code data}.",

		GLenum.IN("coord", "the coord to query", TEX_COORDS),
		GLenum.IN("pname", "the parameter to query", "#EYE_PLANE #OBJECT_PLANE #TEXTURE_GEN_MODE"),
		mods(Check(1), returnValue) _ GLint_p.OUT("data", "a scalar or buffer in which to place the returned data")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"GetTexGenfv",
		"Float version of $GetTexGeniv.",

		GLenum.IN("coord", "the coord to query"),
		GLenum.IN("pname", "the parameter to query"),
		mods(Check(4), returnValue) _ GLfloat_p.OUT("data", "a scalar or buffer in which to place the returned data")
	)

	deprecatedGL _ GLvoid.func(
		"GetTexGendv",
		"Double version of $GetTexGeniv.",

		GLenum.IN("coord", "the coord to query"),
		GLenum.IN("pname", "the parameter to query"),
		mods(Check(4), returnValue) _ GLdouble_p.OUT("data", "a scalar or buffer in which to place the returned data")
	)

	GLvoid.func(
		"GetTexImage",
		"Obtains texture images.",

		GLenum.IN(
			"tex",
			"the texture (or texture face) to be obtained",
			"GL11#TEXTURE_1D GL11#TEXTURE_2D GL12#TEXTURE_3D GL30#TEXTURE_1D_ARRAY GL30#TEXTURE_2D_ARRAY GL31#TEXTURE_RECTANGLE $CUBE_MAP_FACES"
		),
		GLint.IN("level", "the level-of-detail number"),
		GLenum.IN("format", "the pixel format", PIXEL_DATA_FORMATS),
		GLenum.IN("type", "the pixel type", PIXEL_DATA_TYPES),
		mods(
			MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE),
			PIXEL_PACK_BUFFER
		) _ GLvoid_p.OUT("pixels", "the buffer in which to place the returned data")
	)

	val GetTexLevelParameteriv = GLvoid.func(
		"GetTexLevelParameteriv",
		"Places integer information about texture image parameter {@code value} for level-of-detail {@code lod} of the specified {@code target} into {@code data}.",

		GLenum.IN(
			"target",
			"the texture image target",
			"""
			$TEXTURE_2D_TARGETS $PROXY_TEXTURE_2D_TARGETS
			#TEXTURE_1D GL12#TEXTURE_3D GL30#TEXTURE_2D_ARRAY GL40#TEXTURE_CUBE_MAP_ARRAY GL32#TEXTURE_2D_MULTISAMPLE
			GL32#TEXTURE_2D_MULTISAMPLE_ARRAY #PROXY_TEXTURE_1D GL12#PROXY_TEXTURE_3D GL30#PROXY_TEXTURE_2D_ARRAY GL40#PROXY_TEXTURE_CUBE_MAP_ARRAY
			GL32#PROXY_TEXTURE_2D_MULTISAMPLE GL32#PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY
			"""
		),
		GLint.IN("level", "the level-of-detail number"),
		GLenum.IN(
			"pname",
			"the parameter to query",
			"""
			GL11#TEXTURE_WIDTH GL11#TEXTURE_HEIGHT GL12#TEXTURE_DEPTH GL11#TEXTURE_BORDER GL32#TEXTURE_SAMPLES GL32#TEXTURE_FIXED_SAMPLE_LOCATIONS
			GL11#TEXTURE_INTERNAL_FORMAT GL11#TEXTURE_RED_SIZE GL11#TEXTURE_GREEN_SIZE GL11#TEXTURE_BLUE_SIZE GL11#TEXTURE_ALPHA_SIZE
			GL11#TEXTURE_LUMINANCE_SIZE GL11#TEXTURE_INTENSITY_SIZE GL14#TEXTURE_DEPTH_SIZE GL30#TEXTURE_STENCIL_SIZE GL30#TEXTURE_SHARED_SIZE
			GL30#TEXTURE_RED_TYPE GL30#TEXTURE_GREEN_TYPE GL30#TEXTURE_BLUE_TYPE GL30#TEXTURE_ALPHA_TYPE GL30#TEXTURE_LUMINANCE_TYPE
			GL30#TEXTURE_INTENSITY_TYPE GL30#TEXTURE_DEPTH_TYPE GL13#TEXTURE_COMPRESSED GL13#TEXTURE_COMPRESSED_IMAGE_SIZE
			GL31#TEXTURE_BUFFER_DATA_STORE_BINDING GL43#TEXTURE_BUFFER_OFFSET GL43#TEXTURE_BUFFER_SIZE
			"""
		),
		mods(Check(1), returnValue) _ GLint_p.OUT("params", "a scalar or buffer in which to place the returned data")
	).javaDocLink

	GLvoid.func(
		"GetTexLevelParameterfv",
		"Float version of $GetTexLevelParameteriv.",

		GLenum.IN("target", "the texture image target"),
		GLint.IN("level", "the level-of-detail number"),
		GLenum.IN("pname", "the parameter to query"),
		mods(Check(1), returnValue) _ GLfloat_p.OUT("params", "a scalar or buffer in which to place the returned data")
	)

	val GetTexParameteriv = GLvoid.func(
		"GetTexParameteriv",
		"Place integer information about texture parameter {@code value} for the specified {@code target} into {@code data}.",

		GLenum.IN(
			"target",
			"the texture target",
			"""
			#TEXTURE_1D #TEXTURE_2D GL12#TEXTURE_3D GL30#TEXTURE_1D_ARRAY GL30#TEXTURE_2D_ARRAY GL31#TEXTURE_RECTANGLE GL13#TEXTURE_CUBE_MAP
			GL40#TEXTURE_CUBE_MAP_ARRAY GL32#TEXTURE_2D_MULTISAMPLE GL32#TEXTURE_2D_MULTISAMPLE_ARRAY
			"""
		),
		GLenum.IN(
			"pname",
			"the parameter to query",
			"""
			$TEXTURE_PARAMETERS GL42#IMAGE_FORMAT_COMPATIBILITY_TYPE GL42#TEXTURE_IMMUTABLE_FORMAT GL43#TEXTURE_IMMUTABLE_LEVELS GL43#TEXTURE_VIEW_MIN_LEVEL
			GL43#TEXTURE_VIEW_NUM_LEVELS GL43#TEXTURE_VIEW_MIN_LAYER GL43#TEXTURE_VIEW_NUM_LAYERS GL11#TEXTURE_RESIDENT
			"""
		),
		mods(Check(1), returnValue) _ GLint_p.OUT("params", "a scalar or buffer in which to place the returned data")
	).javaDocLink

	GLvoid.func(
		"GetTexParameterfv",
		"Float version of $GetTexParameteriv.",

		GLenum.IN("target", "the texture target"),
		GLenum.IN("pname", "the parameter to query"),
		mods(Check(1), returnValue) _ GLfloat_p.OUT("params", "a scalar or buffer in which to place the returned data")
	)

	GLvoid.func(
		"Hint",
		"""
		Certain aspects of GL behavior, when there is room for variation, may be controlled with this function. The initial value for all hints is
		#DONT_CARE.
		""",

		GLenum.IN(
			"target",
			"the behavior to control",
			// Table 21.3
			"""
			#PERSPECTIVE_CORRECTION_HINT #POINT_SMOOTH_HINT #LINE_SMOOTH_HINT #POLYGON_SMOOTH_HINT #FOG_HINT GL14#GENERATE_MIPMAP_HINT
			GL13#TEXTURE_COMPRESSION_HINT GL20#FRAGMENT_SHADER_DERIVATIVE_HINT
			"""
		),
		GLenum.IN("hint", "the behavior hint", "#FASTEST #NICEST #DONT_CARE")
	)

	val index = "the value to which the current color index should be set"

	deprecatedGL _ GLvoid.func(
		"Indexi",
		"Updates the current (single-valued) color index.",
		GLint.IN("index", index)
	)
	deprecatedGL _ GLvoid.func("Indexub", "Unsigned byte version of #Indexi().", GLubyte.IN("index", index))
	deprecatedGL _ GLvoid.func("Indexs", "Short version of #Indexi().", GLshort.IN("index", index))
	deprecatedGL _ GLvoid.func("Indexf", "Float version of #Indexi().", GLfloat.IN("index", index))
	deprecatedGL _ GLvoid.func("Indexd", "Double version of #Indexi().", GLdouble.IN("index", index))

	deprecatedGL _ GLvoid.func(
		"Indexiv",
		"Pointer version of #Indexi()",

		mods(const, Check(1)) _ GLint_p.IN("index", index)
	)

	deprecatedGL _ GLvoid.func("Indexubv", "Pointer version of #Indexub().", mods(const, Check(1)) _ GLubyte_p.IN("index", index))
	deprecatedGL _ GLvoid.func("Indexsv", "Pointer version of #Indexs().", mods(const, Check(1)) _ GLshort_p.IN("index", index))
	deprecatedGL _ GLvoid.func("Indexfv", "Pointer version of #Indexf().", mods(const, Check(1)) _ GLfloat_p.IN("index", index))
	deprecatedGL _ GLvoid.func("Indexdv", "Pointer version of #Indexd().", mods(const, Check(1)) _ GLdouble_p.IN("index", index))

	deprecatedGL _ GLvoid.func(
		"IndexMask",
	    """
	    The least significant n bits of mask, where n is the number of bits in a color index buffer, specify a mask. Where a 1 appears in this mask, the
	    corresponding bit in the color index buffer (or buffers) is written; where a 0 appears, the bit is not written. This mask applies only in color index
	    mode.
	    """,

	    GLuint.IN("mask", "the color index mask value")
	)

	deprecatedGL _ GLvoid.func(
		"IndexPointer",
	    "Specifies the location and organization of a color index array.",

	    AutoType("pointer", GL_UNSIGNED_BYTE, GL_SHORT, GL_INT, GL_FLOAT, GL_DOUBLE) _ GLenum.IN(
		    "type",
		    "the data type of the values stored in the array",
		    "#UNSIGNED_BYTE #SHORT #INT #FLOAT #DOUBLE"
	     ),
		GLsizei.IN("stride", "the vertex stride in bytes. If specified as zero, then array elements are stored sequentially"),
		mods(const, ARRAY_BUFFER) _ GLvoid_p.IN("pointer", "the color index array data")
	)

	deprecatedGL _ GLvoid.func("InitNames", "Clears the selection name stack.")

	GLvoid.func(
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
		mods(
			const,
			MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE),
			ARRAY_BUFFER
		) _ GLvoid_p.IN("pointer", "the vertex array data")
	)

	GLboolean.func(
		"IsEnabled",
		"Determines if {@code cap} is currently enabled (as with $Enable) or disabled.",

		GLenum.IN("cap", "the enable state to query")
	)

	deprecatedGL _ GLboolean.func(
		"IsList",
		"Returns true if the {@code list} is the index of some display list.",

		GLuint.IN("list", "the list index to query")
	)

	GLboolean.func(
		"IsTexture",
		"Returns true if {@code texture} is the name of a texture object.",

		GLuint.IN("texture", "the texture name to query")
	)

	val LightModeli = (deprecatedGL _ GLvoid.func(
		"LightModeli",
		"Set the integer value of a lighting model parameter.",

		GLenum.IN(
			"pname",
			"the lighting model parameter to set",
			"#LIGHT_MODEL_AMBIENT #LIGHT_MODEL_LOCAL_VIEWER #LIGHT_MODEL_TWO_SIDE GL12#LIGHT_MODEL_COLOR_CONTROL"
		),
		GLint.IN("param", "the parameter value")
	)).javaDocLink

	val LightModelf = (deprecatedGL _ GLvoid.func(
		"LightModelf",
		"Float version of $LightModeli.",

		GLenum.IN("pname", "the lighting model parameter to set"),
		GLfloat.IN("param", "the parameter value")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"LightModeliv",
		"Pointer version of $LightModeli.",

		GLenum.IN("pname", "the lighting model parameter to set"),
		mods(const, Check(4)) _ GLint_p.IN("params", "the parameter value")
	)

	deprecatedGL _ GLvoid.func(
		"LightModelfv",
		"Pointer version of $LightModelf.",

		GLenum.IN("pname", "the lighting model parameter to set"),
		mods(const, Check(4)) _ GLfloat_p.IN("params", "the parameter value")
	)

	val Lighti = (deprecatedGL _ GLvoid.func(
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
	)).javaDocLink

	val Lightf = (deprecatedGL _ GLvoid.func(
		"Lightf",
		"Float version of $Lighti.",

		GLenum.IN("light", "the light for which to set the parameter"),
		GLenum.IN("pname", "the parameter to set"),
		GLfloat.IN("param", "the parameter value")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"Lightiv",
		"Pointer version of $Lighti.",

		GLenum.IN("light", "the light for which to set the parameter"),
		GLenum.IN("pname", "the parameter to set"),
		mods(const, Check(4)) _ GLint_p.IN("params", "the parameter value")
	)

	deprecatedGL _ GLvoid.func(
		"Lightfv",
		"Pointer version of $Lightf.",

		GLenum.IN("light", "the light for which to set the parameter"),
		GLenum.IN("pname", "the parameter to set"),
		mods(const, Check(4)) _ GLfloat_p.IN("params", "the parameter value")
	)

	val LineStipple = (deprecatedGL _ GLvoid.func(
		"LineStipple",
		"""
		Defines a line stipple. It determines those fragments that are to be drawn when the line is rasterized. Line stippling may be enabled or disabled using
		$Enable or $Disable with the constant #LINE_STIPPLE. When disabled, it is as if the line stipple has its default value.
		""",

		GLint.IN(
			"factor",
			"""
			a count that is used to modify the effective line stipple by causing each bit in pattern to be used {@code factor} times. {@code factor} is clamped
			to the range [1, 256].
			"""
		),
		GLushort.IN("pattern", "an unsigned short integer whose 16 bits define the stipple pattern")
	)).javaDocLink

	GLvoid.func(
		"LineWidth",
		"Sets the width of rasterized line segments. The default width is 1.0.",

		GLfloat.IN("width", "the line width")
	)

	deprecatedGL _ GLvoid.func(
		"ListBase",
		"Sets the display list base.",

		GLuint.IN("base", "the display list base offset")
	)

	val LoadMatrixf = (deprecatedGL _ GLvoid.func(
		"LoadMatrixf",
		"""
		Sets the current matrix to a 4 &times; 4 matrix in column-major order.

		The matrix is stored as 16 consecutive values, i.e. as:
		${table(
			tr(td("a1"), td("a5"), td("a9"), td("a13")),
			tr(td("a2"), td("a6"), td("a10"), td("a14")),
			tr(td("a3"), td("a7"), td("a11"), td("a15")),
			tr(td("a4"), td("a8"), td("a12"), td("a16")),
			matrix = true
		)}

		This differs from the standard row-major ordering for matrix elements. If the standard ordering is used, all of the subsequent transformation equations
		are transposed, and the columns representing vectors become rows.
		""",

		mods(const, Check(16)) _ GLfloat_p.IN("m", "the matrix data")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"LoadMatrixd",
		"Double version of $LoadMatrixf.",

		mods(const, Check(16)) _ GLdouble_p.IN("m", "the matrix data")
	)

	deprecatedGL _ GLvoid.func(
		"LoadIdentity",
		"""
		Sets the current matrix to the identity matrix.

		Calling this function is equivalent to calling $LoadMatrixf with the following matrix:
		${table(
			tr(td("1"), td("0"), td("0"), td("0")),
			tr(td("0"), td("1"), td("0"), td("0")),
			tr(td("0"), td("0"), td("1"), td("0")),
			tr(td("0"), td("0"), td("0"), td("1")),
			matrix = true
		)}
		"""
	)

	deprecatedGL _ GLvoid.func(
		"LoadName",
		"Replaces the value on the top of the selection stack with {@code name}.",

		GLuint.IN("name", "the name to load")
	)

	GLvoid.func(
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

	val Map1f = (deprecatedGL _ GLvoid.func(
		"Map1f",
		"""
		Defines a polynomial or rational polynomial mapping to produce vertex, normal, texture coordinates and colors. The values so produced are sent on to
		further stages of the GL as if they had been provided directly by the client.
		""",

		GLenum.IN("target", "the evaluator target", "$MAP1_TARGETS"),
		GLfloat.IN("u1", "the first endpoint of the pre-image of the map"),
		GLfloat.IN("u2", "the second endpoint of the pre-image of the map"),
		GLint.IN("stride", "the number of values in each block of storage"),
		GLint.IN("order", "the polynomial order"),
		mods (const, Check("order * stride")) _ GLfloat_p.IN("points", "a set of {@code order} blocks of storage containing control points")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"Map1d",
		"Double version of $Map1f.",

		GLenum.IN("target", "the evaluator target"),
		GLdouble.IN("u1", "the first endpoint of the pre-image of the map"),
		GLdouble.IN("u2", "the second endpoint of the pre-image of the map"),
		GLint.IN("stride", "the number of values in each block of storage"),
		GLint.IN("order", "the polynomial order"),
		mods (const, Check("stride * order")) _ GLdouble_p.IN("points", "a set of {@code order} blocks of storage containing control points")
	)

	val Map2f = (deprecatedGL _ GLvoid.func(
		"Map2f",
		"Bivariate version of $Map1f.",

		GLenum.IN("target", "the evaluator target"),
		GLfloat.IN("u1", "the first u-dimension endpoint of the pre-image rectangle of the map"),
		GLfloat.IN("u2", "the second u-dimension endpoint of the pre-image rectangle of the map"),
		GLint.IN("ustride", "the number of values in the u-dimension in each block of storage"),
		GLint.IN("uorder", "the polynomial order in the u-dimension"),
		GLfloat.IN("v1", "the first v-dimension endpoint of the pre-image rectangle of the map"),
		GLfloat.IN("v2", "the second v-dimension endpoint of the pre-image rectangle of the map"),
		GLint.IN("vstride", "the number of values in the v-dimension in each block of storage"),
		GLint.IN("vorder", "the polynomial order in the v-dimension"),
		mods(const, Check("ustride * uorder * vstride * vorder")) _ GLfloat_p.IN("points", "a set of ${code("uorder &times; vorder")} blocks of storage containing control points")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"Map2d",
		"Double version of $Map2f.",

		GLenum.IN("target", "the evaluator target"),
		GLdouble.IN("u1", "the first u-dimension endpoint of the pre-image rectangle of the map"),
		GLdouble.IN("u2", "the second u-dimension endpoint of the pre-image rectangle of the map"),
		GLint.IN("ustride", "the number of values in the u-dimension in each block of storage"),
		GLint.IN("uorder", "the polynomial order in the u-dimension"),
		GLdouble.IN("v1", "the first v-dimension endpoint of the pre-image rectangle of the map"),
		GLdouble.IN("v2", "the second v-dimension endpoint of the pre-image rectangle of the map"),
		GLint.IN("vstride", "the number of values in the v-dimension in each block of storage"),
		GLint.IN("vorder", "the polynomial order in the v-dimension"),
		mods(const, Check("ustride * uorder * vstride * vorder")) _ GLdouble_p.IN("points", "a set of ${code("uorder &times; vorder")} blocks of storage containing control points")
	)

	val MapGrid1f = (deprecatedGL _ GLvoid.func(
		"MapGrid1f",
		"Defines a one-dimensional grid in the map evaluator domain.",

		GLint.IN("n", "the number of partitions of the interval"),
		GLfloat.IN("u1", "the first interval endpoint"),
		GLfloat.IN("u2", "the second interval endpoint")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"MapGrid1d",
		"Double version of $MapGrid1f.",

		GLint.IN("n", "the number of partitions of the interval"),
		GLdouble.IN("u1", "the first interval endpoint"),
		GLdouble.IN("u2", "the second interval endpoint")
	)

	val MapGrid2f = (deprecatedGL _ GLvoid.func(
		"MapGrid2f",
		"Defines a two-dimensional grid in the map evaluator domain.",

		GLint.IN("un", "the number of partitions of the interval in the u-dimension"),
		GLfloat.IN("u1", "the first u-dimension interval endpoint"),
		GLfloat.IN("u2", "the second u-dimension interval endpoint"),
		GLint.IN("vn", "the number of partitions of the interval in the v-dimension"),
		GLfloat.IN("v1", "the first v-dimension interval endpoint"),
		GLfloat.IN("v2", "the second v-dimension interval endpoint")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"MapGrid2d",
		"Double version of $MapGrid2f.",

		GLint.IN("un", "the number of partitions of the interval in the u-dimension"),
		GLdouble.IN("u1", "the first u-dimension interval endpoint"),
		GLdouble.IN("u2", "the second u-dimension interval endpoint"),
		GLint.IN("vn", "the number of partitions of the interval in the v-dimension"),
		GLdouble.IN("v1", "the first v-dimension interval endpoint"),
		GLdouble.IN("v2", "the second v-dimension interval endpoint")
	)

	val Materiali = (deprecatedGL _ GLvoid.func(
		"Materiali",
		"Sets the integer value of a material parameter.",

		GLenum.IN("face", "the material face for which to set the parameter", "#FRONT #BACK #FRONT_AND_BACK"),
		GLenum.IN("pname", "the parameter to set", "#SHININESS"),
		GLint.IN("param", "the parameter value")
	)).javaDocLink

	val Materialf = (deprecatedGL _ GLvoid.func(
		"Materialf",
		"Float version of $Materiali.",

		GLenum.IN("face", "the material face for which to set the parameter"),
		GLenum.IN("pname", "the parameter to set"),
		GLfloat.IN("param", "the parameter value")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"Materialiv",
		"Pointer version of $Materiali.",

		GLenum.IN("face", "the material face for which to set the parameter"),
		GLenum.IN("pname", "the parameter to set", "#AMBIENT #DIFFUSE #AMBIENT_AND_DIFFUSE #SPECULAR #EMISSION"),
		mods(const, Check(4)) _ GLint_p.IN("params", "the parameter value")
	)

	deprecatedGL _ GLvoid.func(
		"Materialfv",
		"Pointer version of $Materialf.",

		GLenum.IN("face", "the material face for which to set the parameter"),
		GLenum.IN("pname", "the parameter to set"),
		mods(const, Check(4)) _ GLfloat_p.IN("params", "the parameter value")
	)

	deprecatedGL _ GLvoid.func(
		"MatrixMode",
		"Set the current matrix mode.",

		GLenum.IN("mode", "the matrix mode", "#MODELVIEW #PROJECTION #TEXTURE #COLOR")
	)

	val MultMatrixf = (deprecatedGL _ GLvoid.func(
		"MultMatrixf",
		"Multiplies the current matrix with a 4 &times; 4 matrix in column-major order. See $LoadMatrixf for details.",

		mods(const, Check(16)) _ GLfloat_p.IN("m", "the matrix data")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"MultMatrixd",
		"Double version of $MultMatrixf.",

		mods(const, Check(16)) _ GLdouble_p.IN("m", "the matrix data")
	)

	deprecatedGL _ GLvoid.func(
		"Frustum",
		"""
		Manipulates the current matrix with a matrix that produces perspective projection, in such a way that the coordinates ${code("(lb &ndash; n)<sup>T</sup>")}
		and ${code("(rt &ndash; n)<sup>T</sup>")} specify the points on the near clipping plane that are mapped to the lower left and upper right corners of the
		window, respectively (assuming that the eye is located at ${code("(0 0 0)<sup>T</sup>")}). {@code f} gives the distance from the eye to the far clipping
		plane.

		Calling this function is equivalent to calling $MultMatrixf with the following matrix:
		${table(
			tr(td("2n / (r - l)"), td("0"), td("(r + l) / (r - l)"), td("0")),
			tr(td("0"), td("2n / (t - b)"), td("(t + b) / (t - b)"), td("0")),
			tr(td("0"), td("0"), td("- (f + n) / (f - n)"), td("- (2fn) / (f - n)")),
			tr(td("0"), td("0"), td("-1"), td("0")),
			matrix = true
		)}
		""",

		GLdouble.IN("l", "the left frustum plane"),
		GLdouble.IN("r", "the right frustum plane"),
		GLdouble.IN("b", "the bottom frustum plane"),
		GLdouble.IN("t", "the top frustum plane"),
		GLdouble.IN("n", "the near frustum plane"),
		GLdouble.IN("f", "the far frustum plane")
	)

	val NewList = (deprecatedGL _ GLvoid.func(
		"NewList",
		"Begins the definition of a display list.",

		GLuint.IN("n", "a positive integer to which the display list that follows is assigned"),
		GLenum.IN("mode", "a symbolic constant that controls the behavior of the GL during display list creation", "#COMPILE #COMPILE_AND_EXECUTE")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"EndList",
		"""
		Ends the definition of GL commands to be placed in a display list. It is only when {@code EndList} occurs that the specified display list is actually
		associated with the index indicated with $NewList.
		"""
	)

	// Normal functions javadoc
	val normalX = "the x coordinate of the current normal"
	val normalY = "the y coordinate of the current normal"
	val normalZ = "the z coordinate of the current normal"
	val normalBuffer = "the normal buffer"

	val Normal3f = (deprecatedGL _ GLvoid.func("Normal3f", "Sets the current normal.", GLfloat.IN("nx", normalX), GLfloat.IN("ny", normalY), GLfloat.IN("nz", normalZ))).javaDocLink
	val Normal3b = (deprecatedGL _ GLvoid.func("Normal3b", "Byte version of $Normal3f.", GLbyte.IN("nx", normalX), GLbyte.IN("ny", normalY), GLbyte.IN("nz", normalZ))).javaDocLink
	val Normal3s = (deprecatedGL _ GLvoid.func("Normal3s", "Short version of $Normal3f.", GLshort.IN("nx", normalX), GLshort.IN("ny", normalY), GLshort.IN("nz", normalZ))).javaDocLink
	val Normal3i = (deprecatedGL _ GLvoid.func("Normal3i", "Integer version of $Normal3f.", GLint.IN("nx", normalX), GLint.IN("ny", normalY), GLint.IN("nz", normalZ))).javaDocLink
	val Normal3d = (deprecatedGL _ GLvoid.func("Normal3d", "Double version of $Normal3f.", GLdouble.IN("nx", normalX), GLdouble.IN("ny", normalY), GLdouble.IN("nz", normalZ))).javaDocLink

	deprecatedGL _ GLvoid.func("Normal3fv", "Pointer version of $Normal3f.", mods(const, Check(3)) _ GLfloat_p.IN("v", normalBuffer))
	deprecatedGL _ GLvoid.func("Normal3bv", "Pointer version of $Normal3b.", mods(const, Check(3)) _ GLbyte_p.IN("v", normalBuffer))
	deprecatedGL _ GLvoid.func("Normal3sv", "Pointer version of $Normal3s.", mods(const, Check(3)) _ GLshort_p.IN("v", normalBuffer))
	deprecatedGL _ GLvoid.func("Normal3iv", "Pointer version of $Normal3i.", mods(const, Check(3)) _ GLint_p.IN("v", normalBuffer))
	deprecatedGL _ GLvoid.func("Normal3dv", "Pointer version of $Normal3d.", mods(const, Check(3)) _ GLdouble_p.IN("v", normalBuffer))

	deprecatedGL _ GLvoid.func(
		"NormalPointer",
		"Specifies the location and organization of a normal array.",

		// Remove GL_INT and GL_DOUBLE, added SHORT. TODO: Replace SHORT with GL_HALF?
		AutoType("pointer", GL_BYTE, GL_SHORT, GL_FLOAT) _ GLenum.IN(
			"type",
			"the data type of the values stored in the array",
			"#BYTE #SHORT #INT GL30#HALF_FLOAT #FLOAT #DOUBLE GL12#UNSIGNED_INT_2_10_10_10_REV GL33#INT_2_10_10_10_REV"
		),
		GLsizei.IN("stride", "the vertex stride in bytes. If specified as zero, then array elements are stored sequentially"),
		mods(const, ARRAY_BUFFER) _ GLvoid_p.IN("pointer", "the normal array data")
	)

	deprecatedGL _ GLvoid.func(
		"Ortho",
		"""
		Manipulates the current matrix with a matrix that produces parallel projection, in such a way that the coordinates ${code("(lb &ndash; n)<sup>T</sup>")}
		and ${code("(rt &ndash; n)<sup>T</sup>")} specify the points on the near clipping plane that are mapped to the lower left and upper right corners of the
		window, respectively (assuming that the eye is located at ${code("(0 0 0)<sup>T</sup>")}). {@code f} gives the distance from the eye to the far clipping
		plane.

		Calling this function is equivalent to calling $MultMatrixf with the following matrix:
		${table(
			tr(td("2 / (r - l)"), td("0"), td("0"), td("- (r + l) / (r - l)")),
			tr(td("0"), td("2 / (t - b)"), td("0"), td("- (t + b) / (t - b)")),
			tr(td("0"), td("0"), td("- 2 / (f - n)"), td("- (f + n) / (f - n)")),
			tr(td("0"), td("0"), td("0"), td("1")),
			matrix = true
		)}
		""",

		GLdouble.IN("l", "the left frustum plane"),
		GLdouble.IN("r", "the right frustum plane"),
		GLdouble.IN("b", "the bottom frustum plane"),
		GLdouble.IN("t", "the top frustum plane"),
		GLdouble.IN("n", "the near frustum plane"),
		GLdouble.IN("f", "the far frustum plane")
	)

	deprecatedGL _ GLvoid.func(
		"PassThrough",
		"""
		Inserts a marker when the GL is in feeback mode. {@code token} is returned as if it were a primitive; it is indicated with its own unique identifying
		value. The ordering of any {@code PassThrough} commands with respect to primitive specification is maintained by feedback. {@code PassThrough} may
		not occur between $Begin and $End.
		""",

		GLfloat.IN("token", "the marker value to insert")
	)

	val PixelMapfv = (deprecatedGL _ GLvoid.func(
		"PixelMapfv",
		"Sets a pixel map lookup table.",

		GLenum.IN("map", "the map to set", PIXEL_MAP_NAMES),
		AutoSize("values") _ GLsizei.IN("size", "the map size"),
		mods(const, PIXEL_UNPACK_BUFFER) _ GLfloat_p.IN("values", "the map values")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"PixelMapusv",
		"Unsigned short version of $PixelMapfv.",

		GLenum.IN("map", "the map to set"),
		AutoSize("values") _ GLsizei.IN("size", "the map size"),
		mods(const, PIXEL_UNPACK_BUFFER) _ GLushort_p.IN("values", "the map values")
	)

	deprecatedGL _ GLvoid.func(
		"PixelMapuiv",
		"Unsigned integer version of $PixelMapfv.",

		GLenum.IN("map", "the map to set"),
		AutoSize("values") _ GLsizei.IN("size", "the map size"),
		mods(const, PIXEL_UNPACK_BUFFER) _ GLuint_p.IN("values", "the map values")
	)

	val PixelStorei = GLvoid.func(
		"PixelStorei",
		"Sets the integer value of a pixel store parameter.",

		GLenum.IN(
			"pname",
			"the pixel store parameter to set",
			"""
			#UNPACK_SWAP_BYTES #UNPACK_LSB_FIRST #UNPACK_ROW_LENGTH #UNPACK_SKIP_ROWS #UNPACK_SKIP_PIXELS #UNPACK_ALIGNMENT
			GL12#UNPACK_IMAGE_HEIGHT GL12#UNPACK_SKIP_IMAGES GL42#UNPACK_COMPRESSED_BLOCK_WIDTH GL42#UNPACK_COMPRESSED_BLOCK_HEIGHT
			GL42#UNPACK_COMPRESSED_BLOCK_DEPTH GL42#UNPACK_COMPRESSED_BLOCK_SIZE
			"""
		),
		GLint.IN("param", "the parameter value")
	).javaDocLink

	GLvoid.func(
		"PixelStoref",
		"Float version of $PixelStorei.",

		GLenum.IN("pname", "the pixel store parameter to set"),
		GLint.IN("param", "the parameter value")
	)

	val PixelTransferi = (deprecatedGL _ GLvoid.func(
		"PixelTransferi",
		"Sets the integer value of a pixel transfer parameter.",

		GLenum.IN(
			"pname",
			"the pixel transfer parameter to set",
			"""
			#MAP_COLOR #MAP_STENCIL #INDEX_SHIFT #INDEX_OFFSET #RED_SCALE #GREEN_SCALE #BLUE_SCALE #ALPHA_SCALE #DEPTH_SCALE
			#RED_BIAS #GREEN_BIAS #BLUE_BIAS #ALPHA_BIAS #DEPTH_BIAS
			ARBImaging#POST_CONVOLUTION_RED_SCALE ARBImaging#POST_CONVOLUTION_RED_BIAS ARBImaging#POST_COLOR_MATRIX_RED_SCALE
			ARBImaging#POST_COLOR_MATRIX_RED_BIAS ARBImaging#POST_CONVOLUTION_GREEN_SCALE ARBImaging#POST_CONVOLUTION_GREEN_BIAS
			ARBImaging#POST_COLOR_MATRIX_GREEN_SCALE ARBImaging#POST_COLOR_MATRIX_GREEN_BIAS ARBImaging#POST_CONVOLUTION_BLUE_SCALE
			ARBImaging#POST_CONVOLUTION_BLUE_BIAS ARBImaging#POST_COLOR_MATRIX_BLUE_SCALE ARBImaging#POST_COLOR_MATRIX_BLUE_BIAS
			ARBImaging#POST_CONVOLUTION_ALPHA_SCALE ARBImaging#POST_CONVOLUTION_ALPHA_BIAS ARBImaging#POST_COLOR_MATRIX_ALPHA_SCALE
			ARBImaging#POST_COLOR_MATRIX_ALPHA_BIAS
			"""
		),
		GLint.IN("param", "the parameter value")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"PixelTransferf",
		"Float version of $PixelTransferi.",

		GLenum.IN("pname", "the pixel transfer parameter to set"),
		GLfloat.IN("param", "the parameter value")
	)

	deprecatedGL _ GLvoid.func(
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

	GLvoid.func(
		"PointSize",
		"Controls the rasterization of points if no vertex, tessellation control, tessellation evaluation, or geometry shader is active. The default point size is 1.0.",

		GLfloat.IN("size", "the request size of a point")
	)

	GLvoid.func(
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

	GLvoid.func(
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

	deprecatedGL _ GLvoid.func(
		"PolygonStipple",
		"""
		Defines a polygon stipple. It works much the same way as $LineStipple, masking out certain fragments produced by rasterization so that they
		are not sent to the next stage of the GL. This is the case regardless of the state of polygon antialiasing.

		If x<sub>w</sub> and y<sub>w</sub> are the window coordinates of a rasterized polygon fragment, then that fragment is sent to the next stage of the GL
		if and only if the bit of the pattern (x<sub>w</sub> mod 32, y<sub>w</sub> mod 32) is 1.

		Polygon stippling may be enabled or disabled with $Enable or $Disable using the constant #POLYGON_STIPPLE. When disabled,
		it is as if the stipple pattern were all ones.
		""",

		mods(const, PIXEL_UNPACK_BUFFER) _ GLubyte_p.IN("pattern", "a pointer to memory into which a 32 &times; 32 pattern is packed")
	)

	val PushAttrib = (deprecatedGL _ GLvoid.func(
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
			#LINE_BIT #LIST_BIT GL13#MULTISAMPLE_BIT #PIXEL_MODE_BIT #POINT_BIT #POLYGON_BIT #POLYGON_STIPPLE_BIT #SCISSOR_BIT
			#STENCIL_BUFFER_BIT #TEXTURE_BIT #TRANSFORM_BIT #VIEWPORT_BIT #ALL_ATTRIB_BITS
			""", LinkMode.BITFIELD
		)
	)).javaDocLink

	val PushClientAttrib = (deprecatedGL _ GLvoid.func(
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
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"PopAttrib",
		"Resets the values of those state variables that were saved with the last $PushAttrib. Those not saved remain unchanged."
	)

	deprecatedGL _ GLvoid.func(
		"PopClientAttrib",
		"Resets the values of those state variables that were saved with the last $PushClientAttrib. Those not saved remain unchanged."
	)

	deprecatedGL _ GLvoid.func(
		"PopMatrix",
		"Pops the top entry off the current matrix stack, replacing the current matrix with the matrix that was the second entry in the stack."
	)

	deprecatedGL _ GLvoid.func("PopName", "Pops one name off the top of the selection name stack.")

	deprecatedGL _ GLvoid.func(
		"PrioritizeTextures",
		"""
		Sets the priority of texture objects. Each priority value is clamped to the range [0, 1] before it is assigned. Zero indicates the lowest priority, with
		the least likelihood of being resident. One indicates the highest priority, with the greatest likelihood of being resident.
		""",

		AutoSize("textures", "priorities") _ GLsizei.IN("n", "the number of texture object priorities to set"),
		const _ GLuint_p.IN("textures", "an array of texture object names"),
		const _ GLfloat_p.IN("priorities", "an array of texture object priorities")
	)


	deprecatedGL _ GLvoid.func("PushMatrix", "Pushes the current matrix stack down by one, duplicating the current matrix in both the top of the stack and the entry below it.")

	deprecatedGL _ GLvoid.func(
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

	val RasterPos2i = (deprecatedGL _ GLvoid.func(
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
	)).javaDocLink

	val RasterPos2s = (deprecatedGL _ GLvoid.func("RasterPos2s", "Short version of $RasterPos2i.", GLshort.IN("x", rasterX), GLshort.IN("y", rasterY))).javaDocLink
	val RasterPos2f = (deprecatedGL _ GLvoid.func("RasterPos2f", "Float version of $RasterPos2i.", GLfloat.IN("x", rasterX), GLfloat.IN("y", rasterY))).javaDocLink
	val RasterPos2d = (deprecatedGL _ GLvoid.func("RasterPos2d", "Double version of $RasterPos2i.", GLdouble.IN("x", rasterX), GLdouble.IN("y", rasterY))).javaDocLink

	deprecatedGL _ GLvoid.func("RasterPos2iv", "Pointer version of $RasterPos2i.", mods(const, Check(2)) _ GLint_p.IN("coords", rasterBuffer))
	deprecatedGL _ GLvoid.func("RasterPos2sv", "Pointer version of $RasterPos2s.", mods(const, Check(2)) _ GLshort_p.IN("coords", rasterBuffer))
	deprecatedGL _ GLvoid.func("RasterPos2fv", "Pointer version of $RasterPos2f.", mods(const, Check(2)) _ GLfloat_p.IN("coords", rasterBuffer))
	deprecatedGL _ GLvoid.func("RasterPos2dv", "Pointer version of $RasterPos2d.", mods(const, Check(2)) _ GLdouble_p.IN("coords", rasterBuffer))

	val RasterPos3i = (deprecatedGL _ GLvoid.func(
		"RasterPos3i",
		"Sets the three-dimensional current raster position. {@code w} is implicitly set to 1. See $RasterPos2i for more details.",

		GLint.IN("x", rasterX),
		GLint.IN("y", rasterY),
		GLint.IN("z", rasterZ)
	)).javaDocLink

	val RasterPos3s = (deprecatedGL _ GLvoid.func("RasterPos3s", "Short version of $RasterPos3i.", GLshort.IN("x", rasterX), GLshort.IN("y", rasterY), GLshort.IN("z", rasterZ))).javaDocLink
	val RasterPos3f = (deprecatedGL _ GLvoid.func("RasterPos3f", "Float version of $RasterPos3i.", GLfloat.IN("x", rasterX), GLfloat.IN("y", rasterY), GLfloat.IN("z", rasterZ))).javaDocLink
	val RasterPos3d = (deprecatedGL _ GLvoid.func("RasterPos3d", "Double version of $RasterPos3i.", GLdouble.IN("x", rasterX), GLdouble.IN("y", rasterY), GLdouble.IN("z", rasterZ))).javaDocLink

	deprecatedGL _ GLvoid.func("RasterPos3iv", "Pointer version of $RasterPos3i.", mods(const, Check(3)) _ GLint_p.IN("coords", rasterBuffer))
	deprecatedGL _ GLvoid.func("RasterPos3sv", "Pointer version of $RasterPos3s.", mods(const, Check(3)) _ GLshort_p.IN("coords", rasterBuffer))
	deprecatedGL _ GLvoid.func("RasterPos3fv", "Pointer version of $RasterPos3f.", mods(const, Check(3)) _ GLfloat_p.IN("coords", rasterBuffer))
	deprecatedGL _ GLvoid.func("RasterPos3dv", "Pointer version of $RasterPos3d.", mods(const, Check(3)) _ GLdouble_p.IN("coords", rasterBuffer))

	val RasterPos4i = (deprecatedGL _ GLvoid.func(
		"RasterPos4i",
		"Sets the four-dimensional current raster position. See $RasterPos2i for more details.",

		GLint.IN("x", rasterX),
		GLint.IN("y", rasterY),
		GLint.IN("z", rasterZ),
		GLint.IN("w", rasterW)
	)).javaDocLink

	val RasterPos4s = (deprecatedGL _ GLvoid.func("RasterPos4s", "Short version of $RasterPos4i.", GLshort.IN("x", rasterX), GLshort.IN("y", rasterY), GLshort.IN("z", rasterZ), GLshort.IN("w", rasterW))).javaDocLink
	val RasterPos4f = (deprecatedGL _ GLvoid.func("RasterPos4f", "Float version of RasterPos4i.", GLfloat.IN("x", rasterX), GLfloat.IN("y", rasterY), GLfloat.IN("z", rasterZ), GLfloat.IN("w", rasterW))).javaDocLink
	val RasterPos4d = (deprecatedGL _ GLvoid.func("RasterPos4d", "Double version of $RasterPos4i.", GLdouble.IN("x", rasterX), GLdouble.IN("y", rasterY), GLdouble.IN("z", rasterZ), GLdouble.IN("w", rasterW))).javaDocLink

	deprecatedGL _ GLvoid.func("RasterPos4iv", "Pointer version of $RasterPos4i.", mods(const, Check(4)) _ GLint_p.IN("coords", rasterBuffer))
	deprecatedGL _ GLvoid.func("RasterPos4sv", "Pointer version of $RasterPos4s.", mods(const, Check(4)) _ GLshort_p.IN("coords", rasterBuffer))
	deprecatedGL _ GLvoid.func("RasterPos4fv", "Pointer version of $RasterPos4f.", mods(const, Check(4)) _ GLfloat_p.IN("coords", rasterBuffer))
	deprecatedGL _ GLvoid.func("RasterPos4dv", "Pointer version of $RasterPos4d.", mods(const, Check(4)) _ GLdouble_p.IN("coords", rasterBuffer))

	GLvoid.func(
		"ReadBuffer",
		"""
		Defines the color buffer from which values are obtained.

		Acceptable values for {@code src} depend on whether the GL is using the default framebuffer (i.e., GL30#DRAW_FRAMEBUFFER_BINDING is zero), or
		a framebuffer object (i.e., GL30#DRAW_FRAMEBUFFER_BINDING is non-zero). In the initial state, the GL is bound to the default framebuffer.
		""",

		GLenum.IN("src", "the color buffer to read from", FRAMEBUFFERS)
	)

	val ReadPixels = GLvoid.func(
		"ReadPixels",
		"""
		ReadPixels obtains values from the selected read buffer from each pixel with lower left hand corner at {@code (x + i, y + j)} for {@code 0 <= i < width}
		and {@code 0 <= j < height}; this pixel is said to be the i<sup>th</sup> pixel in the j<sup>th</sup> row. If any of these pixels lies outside of the
		window allocated to the current GL context, or outside of the image attached to the currently bound read framebuffer object, then the values obtained
		for those pixels are undefined. When GL30#READ_FRAMEBUFFER_BINDING is zero, values are also undefined for individual pixels that are not owned by
		the current context. Otherwise, {@code ReadPixels} obtains values from the selected buffer, regardless of how those values were placed there.
		""",

		GLint.IN("x", "the left pixel coordinate"),
		GLint.IN("y", "the lower pixel coordinate"),
		GLsizei.IN("width", "the number of pixels to read in the x-dimension"),
		GLsizei.IN("height", "the number of pixels to read in the y-dimension"),
		GLenum.IN("format", "the pixel format", PIXEL_DATA_FORMATS),
		GLenum.IN("type", "the pixel type", PIXEL_DATA_TYPES),
		mods(
			MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT),
			PIXEL_PACK_BUFFER
		) _ GLvoid_p.OUT("pixels", "a buffer in which to place the returned pixel data")
	).javaDocLink

	// Rect functions javadoc
	val rectX1 = "the x coordinate of the first corner vertex"
	val rectY1 = "the y coordinate of the first corner vertex"
	val rectX2 = "the x coordinate of the second corner vertex"
	val rectY2 = "the y coordinate of the second corner vertex"
	val rectBuffer1 = "the first vertex buffer"
	val rectBuffer2 = "the second vertex buffer"

	val Recti = (deprecatedGL _ GLvoid.func(
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
	)).javaDocLink

	val Rects = (deprecatedGL _ GLvoid.func("Rects", "Short version of $Recti.", GLshort.IN("x1", rectX1), GLshort.IN("y1", rectY1), GLshort.IN("x2", rectX2), GLshort.IN("y2", rectY2))).javaDocLink
	val Rectf = (deprecatedGL _ GLvoid.func("Rectf", "Float version of $Recti.", GLfloat.IN("x1", rectX1), GLfloat.IN("y1", rectY1), GLfloat.IN("x2", rectX2), GLfloat.IN("y2", rectY2))).javaDocLink
	val Rectd = (deprecatedGL _ GLvoid.func("Rectd", "Double version of $Recti.", GLdouble.IN("x1", rectX1), GLdouble.IN("y1", rectY1), GLdouble.IN("x2", rectX2), GLdouble.IN("y2", rectY2))).javaDocLink

	deprecatedGL _ GLvoid.func("Rectiv", "Pointer version of $Recti.", mods(const, Check(2)) _ GLint_p.IN("v1", rectBuffer1), mods(const, Check(2)) _ GLint_p.IN("v2", rectBuffer2))
	deprecatedGL _ GLvoid.func("Rectsv", "Pointer version of $Rects.", mods(const, Check(2)) _ GLshort_p.IN("v1", rectBuffer1), mods(const, Check(2)) _ GLshort_p.IN("v2", rectBuffer2))
	deprecatedGL _ GLvoid.func("Rectfv", "Pointer version of $Rectf.", mods(const, Check(2)) _ GLfloat_p.IN("v1", rectBuffer1), mods(const, Check(2)) _ GLfloat_p.IN("v2", rectBuffer2))
	deprecatedGL _ GLvoid.func("Rectdv", "Pointer version of $Rectd.", mods(const, Check(2)) _ GLdouble_p.IN("v1", rectBuffer1), mods(const, Check(2)) _ GLdouble_p.IN("v2", rectBuffer2))

	deprecatedGL _ GLint.func(
		"RenderMode",
		"Sets the current render mode. The default is #RENDER.",

		GLenum.IN("mode", "the render mode", "#RENDER #SELECT #FEEDBACK")
	)

	val Rotatef = (deprecatedGL _ GLvoid.func(
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
			tr(td("0"), td("0"), td("0"), td("1")),
			matrix = true
		)}

		Let <code>u = v / ||v|| = (x' y' z')<sup>T</sup></code>. If <b>S</b> =
		${table(
			tr(td("0"), td("-z'"), td("y'")),
			tr(td("z'"), td("0"), td("-x'")),
			tr(td("-y'"), td("x'"), td("0")),
			matrix = true
		)}

		then ${code("<b>R</b> = uu<sup>T</sup> + cos(angle)(I - uu<sup>T</sup>) + sin(angle)<b>S</b>")}
		""",

		GLfloat.IN("angle", "the angle of rotation in degrees"),
		GLfloat.IN("x", "the x coordinate of the rotation vector"),
		GLfloat.IN("y", "the y coordinate of the rotation vector"),
		GLfloat.IN("z", "the z coordinate of the rotation vector")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"Rotated",
		"Double version of $Rotatef.",

		GLdouble.IN("angle", "the angle of rotation in degrees"),
		GLdouble.IN("x", "the x coordinate of the rotation vector"),
		GLdouble.IN("y", "the y coordinate of the rotation vector"),
		GLdouble.IN("z", "the z coordinate of the rotation vector")
	)

	val Scalef = (deprecatedGL _ GLvoid.func(
		"Scalef",
		"""
		Manipulates the current matrix with a general scaling matrix along the x-, y- and z- axes.

		Calling this function is equivalent to calling $MultMatrixf with the following matrix:
		${table(
			tr(td("x"), td("0"), td("0"), td("0")),
			tr(td("0"), td("y"), td("0"), td("0")),
			tr(td("0"), td("0"), td("z"), td("0")),
			tr(td("0"), td("0"), td("0"), td("1")),
			matrix = true
		)}
		""",

		GLfloat.IN("x", "the x-axis scaling factor"),
		GLfloat.IN("y", "the y-axis scaling factor"),
		GLfloat.IN("z", "the z-axis scaling factor")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"Scaled",
		"Double version of $Scalef.",

		GLdouble.IN("x", "the x-axis scaling factor"),
		GLdouble.IN("y", "the y-axis scaling factor"),
		GLdouble.IN("z", "the z-axis scaling factor")
	)

	GLvoid.func(
		"Scissor",
		"""
		Defines the scissor rectangle for all viewports. The scissor test is enabled or disabled for all viewports using $Enable or $Disable
		with the symbolic constant #SCISSOR_TEST. When disabled, it is as if the scissor test always passes. When enabled, if
		${code("left <= x<sub>w</sub> < left + width")} and ${code("bottom <= y<sub>w</sub> < bottom + height")} for the scissor rectangle, then the scissor
		test passes. Otherwise, the test fails and the fragment is discarded.
		""",

		GLint.IN("x", "the left scissor rectangle coordinate"),
		GLint.IN("y", "the bottom scissor rectangle coordinate"),
		GLsizei.IN("width", "the scissor rectangle width"),
		GLsizei.IN("height", "the scissor rectangle height")
	)

	deprecatedGL _ GLvoid.func(
		"SelectBuffer",
		"Sets the selection array.",

		AutoSize("buffer") _ GLsizei.IN("size", "the maximum number of values that can be stored in {@code buffer}"),
		GLuint_p.OUT("buffer", "an array of unsigned integers to be potentially filled names")
	)

	deprecatedGL _ GLvoid.func(
		"ShadeModel",
		"""
		Sets the current shade mode. The initial value of the shade mode is #SMOOTH.

		If mode is #SMOOTH, vertex colors are treated individually. If mode is #FLAT, flatshading is enabled and colors are taken from the
		provoking vertex of the primitive. The colors selected are those derived from current values, generated by lighting, or generated by vertex shading, if
		lighting is disabled, enabled, or a vertex shader is in use, respectively.
		""",

		GLenum.IN("mode", "the shade mode", "#SMOOTH #FLAT")
	)

	GLvoid.func(
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

	GLvoid.func(
		"StencilMask",
		"""
		Masks the writing of particular bits into the stencil plans.

		The least significant s bits of {@code mask}, where s is the number of bits in the stencil buffer, specify an integer mask. Where a 1 appears in this
		mask, the corresponding bit in the stencil buffer is written; where a 0 appears, the bit is not written.
		""",

		GLuint.IN("mask", "the stencil mask")
	)

	GLvoid.func(
		"StencilOp",
		"""
		Indicates what happens to the stored stencil value if this or certain subsequent tests fail or pass.

		The supported actions are #KEEP, #ZERO, #REPLACE, #INCR, #DECR, #INVERT,
		GL14#INCR_WRAP and GL14#DECR_WRAP. These correspond to keeping the current value, setting to zero, replacing with the reference value,
		incrementing with saturation, decrementing with saturation, bitwise inverting it, incrementing without saturation, and decrementing without saturation.

		For purposes of increment and decrement, the stencil bits are considered as an unsigned integer. Incrementing or decrementing with saturation clamps
		the stencil value at 0 and the maximum representable value. Incrementing or decrementing without saturation will wrap such that incrementing the maximum
		representable value results in 0, and decrementing 0 results in the maximum representable value.
		""",

		GLenum.IN("sfail", "the action to take if the stencil test fails"),
		GLenum.IN("dpfail", "the action to take if the depth buffer test fails"),
		GLenum.IN("dppass", "the action to take if the depth buffer test passes")
	)

	// TexCoord functions javadoc
	val texCoordS = "the s component of the current texture coordinates"
	val texCoordT = "the t component of the current texture coordinates"
	val texCoordR = "the r component of the current texture coordinates"
	val texCoordQ = "the q component of the current texture coordinates"
	val texCoordBuffer = "the texture coordinate buffer"

	val TexCoord1f = (deprecatedGL _ GLvoid.func(
		"TexCoord1f",
		"Sets the current one-dimensional texture coordinate. {@code t} and {@code r} are implicitly set to 0 and {@code q} to 1.",

		GLfloat.IN("s", texCoordS)
	)).javaDocLink

	val TexCoord1s = (deprecatedGL _ GLvoid.func("TexCoord1s", "Short version of $TexCoord1f.", GLshort.IN("s", texCoordS))).javaDocLink
	val TexCoord1i = (deprecatedGL _ GLvoid.func("TexCoord1i", "Integer version of $TexCoord1f.", GLint.IN("s", texCoordS))).javaDocLink
	val TexCoord1d = (deprecatedGL _ GLvoid.func("TexCoord1d", "Double version of $TexCoord1f.", GLdouble.IN("s", texCoordS))).javaDocLink

	deprecatedGL _ GLvoid.func("TexCoord1fv", "Pointer version of $TexCoord1f.", mods(const, Check(1)) _ GLfloat_p.IN("v", texCoordBuffer))
	deprecatedGL _ GLvoid.func("TexCoord1sv", "Pointer version of $TexCoord1s.", mods(const, Check(1)) _ GLshort_p.IN("v", texCoordBuffer))
	deprecatedGL _ GLvoid.func("TexCoord1iv", "Pointer version of $TexCoord1i.", mods(const, Check(1)) _ GLint_p.IN("v", texCoordBuffer))
	deprecatedGL _ GLvoid.func("TexCoord1dv", "Pointer version of $TexCoord1d.", mods(const, Check(1)) _ GLdouble_p.IN("v", texCoordBuffer))

	val TexCoord2f = (deprecatedGL _ GLvoid.func(
		"TexCoord2f",
		"Sets the current two-dimensional texture coordinate. {@code r} is implicitly set to 0 and {@code q} to 1.",

		GLfloat.IN("s", texCoordS),
		GLfloat.IN("t", texCoordT)
	)).javaDocLink

	val TexCoord2s = (deprecatedGL _ GLvoid.func("TexCoord2s", "Short version of $TexCoord2f.", GLshort.IN("s", texCoordS), GLshort.IN("t", texCoordT))).javaDocLink
	val TexCoord2i = (deprecatedGL _ GLvoid.func("TexCoord2i", "Integer version of $TexCoord2f.", GLint.IN("s", texCoordS), GLint.IN("t", texCoordT))).javaDocLink
	val TexCoord2d = (deprecatedGL _ GLvoid.func("TexCoord2d", "Double version of $TexCoord2f.", GLdouble.IN("s", texCoordS), GLdouble.IN("t", texCoordT))).javaDocLink

	deprecatedGL _ GLvoid.func("TexCoord2fv", "Pointer version of $TexCoord2f.", mods(const, Check(2)) _ GLfloat_p.IN("v", texCoordBuffer))
	deprecatedGL _ GLvoid.func("TexCoord2sv", "Pointer version of $TexCoord2s.", mods(const, Check(2)) _ GLshort_p.IN("v", texCoordBuffer))
	deprecatedGL _ GLvoid.func("TexCoord2iv", "Pointer version of $TexCoord2i.", mods(const, Check(2)) _ GLint_p.IN("v", texCoordBuffer))
	deprecatedGL _ GLvoid.func("TexCoord2dv", "Pointer version of $TexCoord2d.", mods(const, Check(2)) _ GLdouble_p.IN("v", texCoordBuffer))

	val TexCoord3f = (deprecatedGL _ GLvoid.func(
		"TexCoord3f",
		"Sets the current three-dimensional texture coordinate. {@code q} is implicitly set to 1.",

		GLfloat.IN("s", texCoordS),
		GLfloat.IN("t", texCoordT),
		GLfloat.IN("r", texCoordR)
	)).javaDocLink

	val TexCoord3s = (deprecatedGL _ GLvoid.func("TexCoord3s", "Short version of $TexCoord3f.", GLshort.IN("s", texCoordS), GLshort.IN("t", texCoordT), GLshort.IN("r", texCoordR))).javaDocLink
	val TexCoord3i = (deprecatedGL _ GLvoid.func("TexCoord3i", "Integer version of $TexCoord3f.", GLint.IN("s", texCoordS), GLint.IN("t", texCoordT), GLint.IN("r", texCoordR))).javaDocLink
	val TexCoord3d = (deprecatedGL _ GLvoid.func("TexCoord3d", "Double version of $TexCoord3f.", GLdouble.IN("s", texCoordS), GLdouble.IN("t", texCoordT), GLdouble.IN("r", texCoordR))).javaDocLink

	deprecatedGL _ GLvoid.func("TexCoord3fv", "Pointer version of $TexCoord3f.", mods(const, Check(3)) _ GLfloat_p.IN("v", texCoordBuffer))
	deprecatedGL _ GLvoid.func("TexCoord3sv", "Pointer version of $TexCoord3s.", mods(const, Check(3)) _ GLshort_p.IN("v", texCoordBuffer))
	deprecatedGL _ GLvoid.func("TexCoord3iv", "Pointer version of $TexCoord3i.", mods(const, Check(3)) _ GLint_p.IN("v", texCoordBuffer))
	deprecatedGL _ GLvoid.func("TexCoord3dv", "Pointer version of $TexCoord3d.", mods(const, Check(3)) _ GLdouble_p.IN("v", texCoordBuffer))

	val TexCoord4f = (deprecatedGL _ GLvoid.func(
		"TexCoord4f",
		"Sets the current four-dimensional texture coordinate.",

		GLfloat.IN("s", texCoordS),
		GLfloat.IN("t", texCoordT),
		GLfloat.IN("r", texCoordR),
		GLfloat.IN("q", texCoordQ)
	)).javaDocLink

	val TexCoord4s = (deprecatedGL _ GLvoid.func("TexCoord4s", "Short version of $TexCoord4f.", GLshort.IN("s", texCoordS), GLshort.IN("t", texCoordT), GLshort.IN("r", texCoordR), GLshort.IN("q", texCoordQ))).javaDocLink
	val TexCoord4i = (deprecatedGL _ GLvoid.func("TexCoord4i", "Integer version of $TexCoord4f.", GLint.IN("s", texCoordS), GLint.IN("t", texCoordT), GLint.IN("r", texCoordR), GLint.IN("q", texCoordQ))).javaDocLink
	val TexCoord4d = (deprecatedGL _ GLvoid.func("TexCoord4d", "Double version of $TexCoord4f.", GLdouble.IN("s", texCoordS), GLdouble.IN("t", texCoordT), GLdouble.IN("r", texCoordR), GLdouble.IN("q", texCoordQ))).javaDocLink

	deprecatedGL _ GLvoid.func("TexCoord4fv", "Pointer version of $TexCoord4f.", mods(const, Check(4)) _ GLfloat_p.IN("v", texCoordBuffer))
	deprecatedGL _ GLvoid.func("TexCoord4sv", "Pointer version of $TexCoord4s.", mods(const, Check(4)) _ GLshort_p.IN("v", texCoordBuffer))
	deprecatedGL _ GLvoid.func("TexCoord4iv", "Pointer version of $TexCoord4i.", mods(const, Check(4)) _ GLint_p.IN("v", texCoordBuffer))
	deprecatedGL _ GLvoid.func("TexCoord4dv", "Pointer version of $TexCoord4d.", mods(const, Check(4)) _ GLdouble_p.IN("v", texCoordBuffer))

	deprecatedGL _ GLvoid.func(
		"TexCoordPointer",
		"Specifies the location and organization of a texture coordinate array.",

		GLint.IN("size", "the number of values per vertex that are stored in the array", "1 2 3 4"),
		AutoType("pointer", GL_HALF_FLOAT, GL_FLOAT) _ GLenum.IN(
			"type",
			"the data type of the values stored in the array",
			"#SHORT #INT GL30#HALF_FLOAT #FLOAT #DOUBLE GL12#UNSIGNED_INT_2_10_10_10_REV GL33#INT_2_10_10_10_REV"
		),
		GLsizei.IN("stride", "the vertex stride in bytes. If specified as zero, then array elements are stored sequentially"),
		mods(const, ARRAY_BUFFER) _ GLvoid_p.IN("pointer", "the texture coordinate array data")
	)

	val TexEnvi = GLvoid.func(
		"TexEnvi",
		"""
		Sets parameters of the texture environment that specifies how texture values are interpreted when texturing a fragment, or sets per-texture-unit
		filtering parameters.
		""",

		GLenum.IN("target", "the texture environment target", "#TEXTURE_ENV GL14#TEXTURE_FILTER_CONTROL GL20#POINT_SPRITE"),
		GLenum.IN(
			"pname",
			"the parameter to set",
			"""
			GL20#COORD_REPLACE #TEXTURE_ENV_MODE GL14#TEXTURE_LOD_BIAS GL13#COMBINE_RGB GL13#COMBINE_ALPHA GL15#SRC0_RGB GL15#SRC1_RGB
			GL15#SRC2_RGB GL15#SRC0_ALPHA GL15#SRC1_ALPHA GL15#SRC2_ALPHA GL13#OPERAND0_RGB GL13#OPERAND1_RGB GL13#OPERAND2_RGB
			GL13#OPERAND0_ALPHA GL13#OPERAND1_ALPHA GL13#OPERAND2_ALPHA GL13#RGB_SCALE #ALPHA_SCALE
			"""
		),
		GLint.IN(
			"param",
			"the parameter value. Scalar value or",
			"""
			#REPLACE #MODULATE #DECAL #BLEND #ADD GL13#COMBINE
			GL13#ADD_SIGNED GL13#INTERPOLATE GL13#SUBTRACT GL13#DOT3_RGB GL13#DOT3_RGBA
			#TEXTURE GL13#TEXTURE0 GL13.GL_TEXTURE[1-31] GL13#CONSTANT GL13#PRIMARY_COLOR GL13#PREVIOUS
			""", LinkMode.SINGLE_CNT
		)
	).javaDocLink

	GLvoid.func(
		"TexEnviv",
		"Pointer version of $TexEnvi.",

		GLenum.IN("target", "the texture environment target", "#TEXTURE_ENV"),
		GLenum.IN("pname", "the parameter to set", "#TEXTURE_ENV_COLOR"),
		mods(const, Check(4)) _ GLint_p.IN("params", "the parameter value")
	)


	val TexEnvf = GLvoid.func(
		"TexEnvf",
		"Float version of $TexEnvi.",

		GLenum.IN("target", "the texture environment target"),
		GLenum.IN("pname", "the parameter to set"),
		GLfloat.IN("param", "the parameter value")
	).javaDocLink

	GLvoid.func(
		"TexEnvfv",
		"Pointer version of $TexEnvf.",

		GLenum.IN("target", "the texture environment target", "#TEXTURE_ENV"),
		GLenum.IN("pname", "the parameter to set", "#TEXTURE_ENV_COLOR"),
		mods(const, Check(4)) _ GLfloat_p.IN("params", "the parameter value")
	)

	val TexGeni = (deprecatedGL _ GLvoid.func(
		"TexGeni",
		"""
		Sets an integer texture coordinate generation parameter.

		A texture coordinate generation function is enabled or disabled using $Enable and $Disable with an argument of
		#TEXTURE_GEN_S, #TEXTURE_GEN_T, #TEXTURE_GEN_R, or #TEXTURE_GEN_Q (each indicates the corresponding texture
		coordinate). When enabled, the specified texture coordinate is computed according to the current #EYE_LINEAR, #OBJECT_LINEAR or
		#SPHERE_MAP specification, depending on the current setting of #TEXTURE_GEN_MODE for that coordinate. When disabled, subsequent
		vertices will take the indicated texture coordinate from the current texture coordinates.

		The initial state has the texture generation function disabled for all texture coordinates. Initially all texture generation modes are EYE_LINEAR.
		""",

		GLenum.IN("coord", "the coordinate for which to set the parameter", TEX_COORDS),
		GLenum.IN("pname", "the parameter to set", "#TEXTURE_GEN_MODE"),
		GLint.IN("param", "the parameter value", "#OBJECT_LINEAR #EYE_LINEAR #SPHERE_MAP GL13#REFLECTION_MAP GL13#NORMAL_MAP")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"TexGeniv",
		"Pointer version of $TexGeni.",

		GLenum.IN("coord", "the coordinate for which to set the parameter"),
		GLenum.IN("pname", "the parameter to set", "#OBJECT_PLANE #EYE_PLANE"),
		mods(const, Check(4)) _ GLint_p.IN("params", "the parameter value")
	)

	val TexGenf = (deprecatedGL _ GLvoid.func(
		"TexGenf",
		"Float version of $TexGeni.",

		GLenum.IN("coord", "the coordinate for which to set the parameter"),
		GLenum.IN("pname", "the parameter to set"),
		GLfloat.IN("param", "the parameter value")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"TexGenfv",
		"Pointer version of $TexGenf.",

		GLenum.IN("coord", "the coordinate for which to set the parameter"),
		GLenum.IN("pname", "the parameter to set", "#OBJECT_PLANE #EYE_PLANE"),
		mods(const, Check(4)) _ GLfloat_p.IN("params", "the parameter value")
	)

	val TexGend = (deprecatedGL _ GLvoid.func(
		"TexGend",
		"Double version of $TexGeni.",

		GLenum.IN("coord", "the coordinate for which to set the parameter"),
		GLenum.IN("pname", "the parameter to set"),
		GLdouble.IN("param", "the parameter value")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"TexGendv",
		"Pointer version of $TexGend.",

		GLenum.IN("coord", "the coordinate for which to set the parameter"),
		GLenum.IN("pname", "the parameter to set"),
		mods(const, Check(4)) _ GLdouble_p.IN("params", "the parameter value")
	)

	val TexImage2D = GLvoid.func(
		"TexImage2D",
		"Specifies a two-dimensional texture image.",

		GLenum.IN("target", "the texture target", "$TEXTURE_2D_TARGETS $PROXY_TEXTURE_2D_TARGETS"),
		GLint.IN("level", "the level-of-detail number"),
		GLint.IN("internalformat", "the texture internal format", TEXTURE_INTERNAL_FORMATS),
		GLsizei.IN("width", "the texture width"),
		GLsizei.IN("height", "the texture height"),
		GLint.IN("border", "the texture border width"),
		GLenum.IN("format", "the texel data format", PIXEL_DATA_FORMATS),
		GLenum.IN("type", "the texel data type", PIXEL_DATA_TYPES),
		mods(
			const,
			MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE),
			PIXEL_UNPACK_BUFFER,
			nullable
		) _ GLvoid_p.IN("pixels", "the texel data")
	).javaDocLink

	val TexImage1D = GLvoid.func(
		"TexImage1D",
		"One-dimensional version of $TexImage2D}.",

		GLenum.IN("target", "the texture target", "#TEXTURE_1D #PROXY_TEXTURE_1D"),
		GLint.IN("level", "the level-of-detail number"),
		GLint.IN("internalformat", "the texture internal format"),
		GLsizei.IN("width", "the texture width"),
		GLint.IN("border", "the texture border width"),
		GLenum.IN("format", "the texel data format"),
		GLenum.IN("type", "the texel data type"),
		mods(
			const,
			MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE),
			PIXEL_UNPACK_BUFFER,
			nullable
		) _ GLvoid_p.IN("pixels", "the texel data")
	).javaDocLink

	val CopyTexImage2D = GLvoid.func(
		"CopyTexImage2D",
		"""
		Defines a two-dimensional texel array in exactly the manner of $TexImage2D, except that the image data are taken from the framebuffer rather
		than from client memory.

		{@code x}, {@code y}, {@code width}, and {@code height} correspond precisely to the corresponding arguments to $ReadPixels; they specify the
		image's width and height, and the lower left (x, y) coordinates of the framebuffer region to be copied.

		The image is taken from the framebuffer exactly as if these arguments were passed to $CopyPixels with argument type set to #COLOR,
		#DEPTH, or GL30#DEPTH_STENCIL, depending on {@code internalformat}. RGBA data is taken from the current color buffer, while depth
		component and stencil index data are taken from the depth and stencil buffers, respectively.

		Subsequent processing is identical to that described for $TexImage2D, beginning with clamping of the R, G, B, A, or depth values, and masking
		of the stencil index values from the resulting pixel groups. Parameters {@code level}, {@code internalformat}, and {@code border} are specified using
		the same values, with the same meanings, as the corresponding arguments of $TexImage2D.

		The constraints on width, height, and border are exactly those for the corresponding arguments of $TexImage2D.
		""",

		GLenum.IN("target", "the texture target", TEXTURE_2D_TARGETS),
		GLint.IN("level", "the level-of-detail number"),
		GLenum.IN("internalFormat", "the texture internal format. See $TexImage2D for a list of supported formats."),
		GLint.IN("x", "the left framebuffer pixel coordinate"),
		GLint.IN("y", "the lower framebuffer pixel coordinate"),
		GLsizei.IN("width", "the texture width"),
		GLsizei.IN("height", "the texture height"),
		GLint.IN("border", "the texture border width")
	).javaDocLink

	val CopyTexImage1D = GLvoid.func(
		"CopyTexImage1D",
		"""
		Defines a one-dimensional texel array in exactly the manner of $TexImage1D, except that the image data are taken from the framebuffer rather
		than from client memory. For the purposes of decoding the texture image, {@code CopyTexImage1D} is equivalent to calling $CopyTexImage2D
		with corresponding arguments and height of 1, except that the height of the image is always 1, regardless of the value of border. level, internalformat,
		and border are specified using the same values, with the same meanings, as the corresponding arguments of $TexImage1D. The constraints on
		width and border are exactly those of the corresponding arguments of $TexImage1D.
		""",

		GLenum.IN("target", "the texture target", "#TEXTURE_1D"),
		GLint.IN("level", "the level-of-detail number"),
		GLenum.IN("internalFormat", "the texture internal format. See $TexImage2D for a list of supported formats."),
		GLint.IN("x", "the left framebuffer pixel coordinate"),
		GLint.IN("y", "the lower framebuffer pixel coordinate"),
		GLsizei.IN("width", "the texture width"),
		GLint.IN("border", "the texture border width")
	).javaDocLink

	GLvoid.func(
		"CopyTexSubImage1D",
		"""
		Respecifies a rectangular subregion of an existing texel array. No change is made to the {@code internalformat}, {@code width} or {@code border}
		parameters of the specified texel array, nor is any change made to texel values outside the specified subregion. See $CopyTexImage1D for more
		details.
		""",

		GLenum.IN("target", "the texture target", "#TEXTURE_1D"),
		GLint.IN("level", "the level-of-detail number"),
		GLint.IN("xoffset", "the left texel coordinate of the texture subregion to update"),
		GLint.IN("x", "the left framebuffer pixel coordinate"),
		GLint.IN("y", "the lower framebuffer pixel coordinate"),
		GLsizei.IN("width", "the texture subregion width")
	)

	GLvoid.func(
		"CopyTexSubImage2D",
		"""
		Respecifies a rectangular subregion of an existing texel array. No change is made to the {@code internalformat}, {@code width}, {@code height},
		or {@code border} parameters of the specified texel array, nor is any change made to texel values outside the specified subregion. See
		$CopyTexImage2D for more details.
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

	val TexParameteri = GLvoid.func(
		"TexParameteri",
		"Sets the integer value of a texture parameter, which controls how the texel array is treated when specified or changed, and when applied to a fragment.",

		GLenum.IN(
			"target",
			"the texture target",
			"""
			#TEXTURE_1D #TEXTURE_2D GL12#TEXTURE_3D GL30#TEXTURE_1D_ARRAY GL30#TEXTURE_2D_ARRAY GL31#TEXTURE_RECTANGLE GL13#TEXTURE_CUBE_MAP
			GL40#TEXTURE_CUBE_MAP_ARRAY GL32#TEXTURE_2D_MULTISAMPLE GL32#TEXTURE_2D_MULTISAMPLE_ARRAY
			"""
		),
		GLenum.IN("pname", "the parameter to set", TEXTURE_PARAMETERS),
		GLint.IN("param", "the parameter value")
	).javaDocLink

	GLvoid.func(
		"TexParameteriv",
		"Pointer version of $TexParameteri.",

		GLenum.IN("target", "the texture target"),
		GLenum.IN("pname", "the parameter to set"),
		mods(const, Check(4)) _ GLint_p.IN("params", "the parameter value")
	)

	val TexParameterf = GLvoid.func(
		"TexParameterf",
		"Float version of $TexParameteri.",

		GLenum.IN("target", "the texture target"),
		GLenum.IN("pname", "the parameter to set"),
		GLfloat.IN("param", "the parameter value")
	).javaDocLink

	GLvoid.func(
		"TexParameterfv",
		"Pointer version of $TexParameterf.",

		GLenum.IN("target", "the texture target"),
		GLenum.IN("pname", "the parameter to set"),
		mods(const, Check(4)) _ GLfloat_p.IN("params", "the parameter value")
	)

	GLvoid.func(
		"TexSubImage1D",
		"One-dimensional version of #TexSubImage2D().",

		GLenum.IN("target", "the texture target", "#TEXTURE_1D"),
		GLint.IN("level", "the level-of-detail-number"),
		GLint.IN("xoffset", "the left coordinate of the texel subregion"),
		GLsizei.IN("width", "the subregion width"),
		GLenum.IN("format", "the pixel data format", PIXEL_DATA_FORMATS),
		GLenum.IN("type", "the pixel data type", PIXEL_DATA_TYPES),
		mods(
			const,
			MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE),
			PIXEL_UNPACK_BUFFER
		) _ GLvoid_p.IN("pixels", "the pixel data")
	)

	GLvoid.func(
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
		GLenum.IN("format", "the pixel data format", PIXEL_DATA_FORMATS),
		GLenum.IN("type", "the pixel data type", PIXEL_DATA_TYPES),
		mods(
			const,
			MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE),
			PIXEL_UNPACK_BUFFER
		) _ GLvoid_p.IN("pixels", "the pixel data")
	)

	val Translatef = (deprecatedGL _ GLvoid.func(
		"Translatef",
		"""
		Manipulates the current matrix with a translation matrix along the x-, y- and z- axes.

		Calling this function is equivalent to calling $MultMatrixf with the following matrix:
		${table(
			tr(td("1"), td("0"), td("0"), td("x")),
			tr(td("0"), td("1"), td("0"), td("y")),
			tr(td("0"), td("0"), td("1"), td("z")),
			tr(td("0"), td("0"), td("0"), td("1")),
			matrix = true
		)}
		""",

		GLfloat.IN("x", "the x-axis translation"),
		GLfloat.IN("y", "the y-axis translation"),
		GLfloat.IN("z", "the z-axis translation")
	)).javaDocLink

	deprecatedGL _ GLvoid.func(
		"Translated",
		"Double version of $Translatef.",

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

	val Vertex2f = (deprecatedGL _ GLvoid.func(
		"Vertex2f",
		"""
		Specifies a single vertex between $Begin and $End by giving its coordinates in two dimensions. The z coordinate is implicitly set
		to zero and the w coordinate to one.
		""",

		GLfloat.IN("x", vertexX),
		GLfloat.IN("y", vertexY)
	)).javaDocLink

	val Vertex2s = (deprecatedGL _ GLvoid.func("Vertex2s", "Short version of $Vertex2f.", GLshort.IN("x", vertexX), GLshort.IN("y", vertexY))).javaDocLink
	val Vertex2i = (deprecatedGL _ GLvoid.func("Vertex2i", "Integer version of $Vertex2f.", GLint.IN("x", vertexX), GLint.IN("y", vertexY))).javaDocLink
	val Vertex2d = (deprecatedGL _ GLvoid.func("Vertex2d", "Double version of $Vertex2f.", GLdouble.IN("x", vertexX), GLdouble.IN("y", vertexY))).javaDocLink

	deprecatedGL _ GLvoid.func("Vertex2fv", "Pointer version of $Vertex2f.", mods(const, Check(2)) _ GLfloat_p.IN("coords", vertexBuffer))
	deprecatedGL _ GLvoid.func("Vertex2sv", "Pointer version of $Vertex2s.", mods(const, Check(2)) _ GLshort_p.IN("coords", vertexBuffer))
	deprecatedGL _ GLvoid.func("Vertex2iv", "Pointer version of $Vertex2i.", mods(const, Check(2)) _ GLint_p.IN("coords", vertexBuffer))
	deprecatedGL _ GLvoid.func("Vertex2dv", "Pointer version of $Vertex2d.", mods(const, Check(2)) _ GLdouble_p.IN("coords", vertexBuffer))

	val Vertex3f = (deprecatedGL _ GLvoid.func(
		"Vertex3f",
		"""
		Specifies a single vertex between $Begin and $End by giving its coordinates in three dimensions. The w coordinate is implicitly set
		to one.
		""",

		GLfloat.IN("x", vertexX),
		GLfloat.IN("y", vertexY),
		GLfloat.IN("z", vertexZ)
	)).javaDocLink

	val Vertex3s = (deprecatedGL _ GLvoid.func("Vertex3s", "Short version of $Vertex3f.", GLshort.IN("x", vertexX), GLshort.IN("y", vertexY), GLshort.IN("z", vertexZ))).javaDocLink
	val Vertex3i = (deprecatedGL _ GLvoid.func("Vertex3i", "Integer version of $Vertex3f.", GLint.IN("x", vertexX), GLint.IN("y", vertexY), GLint.IN("z", vertexZ))).javaDocLink
	val Vertex3d = (deprecatedGL _ GLvoid.func("Vertex3d", "Double version of $Vertex3f.", GLdouble.IN("x", vertexX), GLdouble.IN("y", vertexY), GLdouble.IN("z", vertexZ))).javaDocLink

	deprecatedGL _ GLvoid.func("Vertex3fv", "Pointer version of $Vertex3f.", mods(const, Check(3)) _ GLfloat_p.IN("coords", vertexBuffer))
	deprecatedGL _ GLvoid.func("Vertex3sv", "Pointer version of $Vertex3s.", mods(const, Check(3)) _ GLshort_p.IN("coords", vertexBuffer))
	deprecatedGL _ GLvoid.func("Vertex3iv", "Pointer version of $Vertex3i.", mods(const, Check(3)) _ GLint_p.IN("coords", vertexBuffer))
	deprecatedGL _ GLvoid.func("Vertex3dv", "Pointer version of $Vertex3d.", mods(const, Check(3)) _ GLdouble_p.IN("coords", vertexBuffer))

	val Vertex4f = (deprecatedGL _ GLvoid.func(
		"Vertex4f",
		"Specifies a single vertex between $Begin and $End by giving its coordinates in four dimensions.",

		GLfloat.IN("x", vertexX),
		GLfloat.IN("y", vertexY),
		GLfloat.IN("z", vertexZ),
		GLfloat.IN("w", vertexW)
	)).javaDocLink

	val Vertex4s = (deprecatedGL _ GLvoid.func("Vertex4s", "Short version of $Vertex4f.", GLshort.IN("x", vertexX), GLshort.IN("y", vertexY), GLshort.IN("z", vertexZ), GLshort.IN("w", vertexW))).javaDocLink
	val Vertex4i = (deprecatedGL _ GLvoid.func("Vertex4i", "Integer version of $Vertex4f.", GLint.IN("x", vertexX), GLint.IN("y", vertexY), GLint.IN("z", vertexZ), GLint.IN("w", vertexW))).javaDocLink
	val Vertex4d = (deprecatedGL _ GLvoid.func("Vertex4d", "Double version of $Vertex4f.", GLdouble.IN("x", vertexX), GLdouble.IN("y", vertexY), GLdouble.IN("z", vertexZ), GLdouble.IN("w", vertexW))).javaDocLink

	deprecatedGL _ GLvoid.func("Vertex4fv", "Pointer version of $Vertex4f.", mods(const, Check(4)) _ GLfloat_p.IN("coords", vertexBuffer))
	deprecatedGL _ GLvoid.func("Vertex4sv", "Pointer version of $Vertex4s.", mods(const, Check(4)) _ GLshort_p.IN("coords", vertexBuffer))
	deprecatedGL _ GLvoid.func("Vertex4iv", "Pointer version of $Vertex4i.", mods(const, Check(4)) _ GLint_p.IN("coords", vertexBuffer))
	deprecatedGL _ GLvoid.func("Vertex4dv", "Pointer version of $Vertex4d.", mods(const, Check(4)) _ GLdouble_p.IN("coords", vertexBuffer))

	deprecatedGL _ GLvoid.func(
		"VertexPointer",
		"Specifies the location and organization of a vertex array.",

		GLint.IN("size", "the number of values per vertex that are stored in the array", "2 3 4"),
		AutoType("pointer", GL_SHORT, GL_INT, GL_FLOAT, GL_DOUBLE) _ GLenum.IN(
			"type",
			"the data type of the values stored in the array",
			"#SHORT #INT GL30#HALF_FLOAT #FLOAT #DOUBLE GL12#UNSIGNED_INT_2_10_10_10_REV GL33#INT_2_10_10_10_REV"
		),
		GLsizei.IN("stride", "the vertex stride in bytes. If specified as zero, then array elements are stored sequentially"),
		mods(const, ARRAY_BUFFER) _ GLvoid_p.IN("pointer", "the vertex array data")
	)

	GLvoid.func(
		"Viewport",
		"""
		Specifies the viewport transformation parameters for all viewports.

		The location of the viewport's bottom-left corner, given by {@code (x, y)}, are clamped to be within the implementation-dependent viewport bounds range.
		The viewport bounds range {@code [min, max]} tuple may be determined by calling #GetFloat() with the symbolic
		constant GL41#VIEWPORT_BOUNDS_RANGE. Viewport width and height are clamped to implementation-dependent maximums when specified. The maximum
		width and height may be found by calling #GetFloat() with the symbolic constant #MAX_VIEWPORT_DIMS. The
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