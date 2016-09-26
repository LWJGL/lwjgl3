/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.bgfx.templates

import org.lwjgl.bgfx.*
import org.lwjgl.generator.*

val BGFX = "BGFX".nativeClass(packageName = BGFX_PACKAGE, prefix = "BGFX", prefixMethod = "bgfx_", binding = BGFX_BINDING) {
	documentation =
		"""
		Native bindings to the <a href="https://github.com/bkaradzic/bgfx">bgfx</a> library.
		"""

	IntConstant(
		"API version",

		"API_VERSION".."22"
	)

	LongConstant(
		"State",

		"STATE_RGB_WRITE"..0x0000000000000001L,
		"STATE_ALPHA_WRITE"..0x0000000000000002L,
		"STATE_DEPTH_WRITE"..0x0000000000000004L,

		"STATE_DEPTH_TEST_LESS"..0x0000000000000010L,
		"STATE_DEPTH_TEST_LEQUAL"..0x0000000000000020L,
		"STATE_DEPTH_TEST_EQUAL"..0x0000000000000030L,
		"STATE_DEPTH_TEST_GEQUAL"..0x0000000000000040L,
		"STATE_DEPTH_TEST_GREATER"..0x0000000000000050L,
		"STATE_DEPTH_TEST_NOTEQUAL"..0x0000000000000060L,
		"STATE_DEPTH_TEST_NEVER"..0x0000000000000070L,
		"STATE_DEPTH_TEST_ALWAYS"..0x0000000000000080L,

		"STATE_DEPTH_TEST_MASK"..0x00000000000000f0L,

		"STATE_BLEND_ZERO"..0x0000000000001000L,
		"STATE_BLEND_ONE"..0x0000000000002000L,
		"STATE_BLEND_SRC_COLOR"..0x0000000000003000L,
		"STATE_BLEND_INV_SRC_COLOR"..0x0000000000004000L,
		"STATE_BLEND_SRC_ALPHA"..0x0000000000005000L,
		"STATE_BLEND_INV_SRC_ALPHA"..0x0000000000006000L,
		"STATE_BLEND_DST_ALPHA"..0x0000000000007000L,
		"STATE_BLEND_INV_DST_ALPHA"..0x0000000000008000L,
		"STATE_BLEND_DST_COLOR"..0x0000000000009000L,
		"STATE_BLEND_INV_DST_COLOR"..0x000000000000a000L,
		"STATE_BLEND_SRC_ALPHA_SAT"..0x000000000000b000L,
		"STATE_BLEND_FACTOR"..0x000000000000c000L,
		"STATE_BLEND_INV_FACTOR"..0x000000000000d000L,
		"STATE_BLEND_MASK"..0x000000000ffff000L,

		"STATE_BLEND_EQUATION_ADD"..0x0000000000000000L,
		"STATE_BLEND_EQUATION_SUB"..0x0000000010000000L,
		"STATE_BLEND_EQUATION_REVSUB"..0x0000000020000000L,
		"STATE_BLEND_EQUATION_MIN"..0x0000000030000000L,
		"STATE_BLEND_EQUATION_MAX"..0x0000000040000000L,
		"STATE_BLEND_EQUATION_MASK"..0x00000003f0000000L,

		"STATE_BLEND_INDEPENDENT"..0x0000000400000000L,
		"STATE_BLEND_ALPHA_TO_COVERAGE"..0x0000000800000000L,

		"STATE_CULL_CW"..0x0000001000000000L,
		"STATE_CULL_CCW"..0x0000002000000000L,
		"STATE_CULL_MASK"..0x0000003000000000L,

		"STATE_ALPHA_REF_MASK"..0x0000ff0000000000L,

		"STATE_PT_TRISTRIP"..0x0001000000000000L,
		"STATE_PT_LINES"..0x0002000000000000L,
		"STATE_PT_LINESTRIP"..0x0003000000000000L,
		"STATE_PT_POINTS"..0x0004000000000000L,
		"STATE_PT_MASK"..0x0007000000000000L,

		"STATE_POINT_SIZE_MASK"..0x00f0000000000000L,

		"STATE_MSAA"..0x0100000000000000L,
		"STATE_LINEAA"..0x0200000000000000L,
		"STATE_CONSERVATIVE_RASTER"..0x0400000000000000L,

		"STATE_RESERVED_MASK".."0xe000000000000000L",

		"STATE_NONE"..0x0000000000000000L,
		"STATE_MASK".."0xffffffffffffffffL",

		"STATE_DEFAULT".."""(0L
		| BGFX_STATE_RGB_WRITE
		| BGFX_STATE_ALPHA_WRITE
		| BGFX_STATE_DEPTH_TEST_LESS
		| BGFX_STATE_DEPTH_WRITE
		| BGFX_STATE_CULL_CW
		| BGFX_STATE_MSAA)
		"""
	)

	IntConstant(
		"State",

		"STATE_DEPTH_TEST_SHIFT".."4",
		"STATE_BLEND_SHIFT".."12",
		"STATE_BLEND_EQUATION_SHIFT".."28",
		"STATE_CULL_SHIFT".."36",
		"STATE_ALPHA_REF_SHIFT".."40",
		"STATE_PT_SHIFT".."48",
		"STATE_POINT_SIZE_SHIFT".."52",
		"STATE_RESERVED_SHIFT".."61"
	)

	IntConstant(
		"Stencil",
		
		"STENCIL_FUNC_REF_SHIFT".."0",
		"STENCIL_FUNC_REF_MASK"..0x000000ff,
		"STENCIL_FUNC_RMASK_SHIFT".."8",
		"STENCIL_FUNC_RMASK_MASK"..0x0000ff00,

		"STENCIL_TEST_LESS"..0x00010000,
		"STENCIL_TEST_LEQUAL"..0x00020000,
		"STENCIL_TEST_EQUAL"..0x00030000,
		"STENCIL_TEST_GEQUAL"..0x00040000,
		"STENCIL_TEST_GREATER"..0x00050000,
		"STENCIL_TEST_NOTEQUAL"..0x00060000,
		"STENCIL_TEST_NEVER"..0x00070000,
		"STENCIL_TEST_ALWAYS"..0x00080000,
		"STENCIL_TEST_SHIFT".."16",
		"STENCIL_TEST_MASK"..0x000f0000,

		"STENCIL_OP_FAIL_S_ZERO"..0x00000000,
		"STENCIL_OP_FAIL_S_KEEP"..0x00100000,
		"STENCIL_OP_FAIL_S_REPLACE"..0x00200000,
		"STENCIL_OP_FAIL_S_INCR"..0x00300000,
		"STENCIL_OP_FAIL_S_INCRSAT"..0x00400000,
		"STENCIL_OP_FAIL_S_DECR"..0x00500000,
		"STENCIL_OP_FAIL_S_DECRSAT"..0x00600000,
		"STENCIL_OP_FAIL_S_INVERT"..0x00700000,
		"STENCIL_OP_FAIL_S_SHIFT".."20",
		"STENCIL_OP_FAIL_S_MASK"..0x00f00000,
	
		"STENCIL_OP_FAIL_Z_ZERO"..0x00000000,
		"STENCIL_OP_FAIL_Z_KEEP"..0x01000000,
		"STENCIL_OP_FAIL_Z_REPLACE"..0x02000000,
		"STENCIL_OP_FAIL_Z_INCR"..0x03000000,
		"STENCIL_OP_FAIL_Z_INCRSAT"..0x04000000,
		"STENCIL_OP_FAIL_Z_DECR"..0x05000000,
		"STENCIL_OP_FAIL_Z_DECRSAT"..0x06000000,
		"STENCIL_OP_FAIL_Z_INVERT"..0x07000000,
		"STENCIL_OP_FAIL_Z_SHIFT".."24",
		"STENCIL_OP_FAIL_Z_MASK"..0x0f000000,
	
		"STENCIL_OP_PASS_Z_ZERO"..0x00000000,
		"STENCIL_OP_PASS_Z_KEEP"..0x10000000,
		"STENCIL_OP_PASS_Z_REPLACE"..0x20000000,
		"STENCIL_OP_PASS_Z_INCR"..0x30000000,
		"STENCIL_OP_PASS_Z_INCRSAT"..0x40000000,
		"STENCIL_OP_PASS_Z_DECR"..0x50000000,
		"STENCIL_OP_PASS_Z_DECRSAT"..0x60000000,
		"STENCIL_OP_PASS_Z_INVERT"..0x70000000,
		"STENCIL_OP_PASS_Z_SHIFT".."28",
		"STENCIL_OP_PASS_Z_MASK".."0xf0000000",
	
		"STENCIL_NONE"..0x00000000,
		"STENCIL_MASK".."0xffffffff",
		"STENCIL_DEFAULT"..0x00000000
	)

	ShortConstant(
		"Clear",

		"CLEAR_NONE"..0x0000.s,
		"CLEAR_COLOR"..0x0001.s,
		"CLEAR_DEPTH"..0x0002.s,
		"CLEAR_STENCIL"..0x0004.s,
		"CLEAR_DISCARD_COLOR_0"..0x0008.s,
		"CLEAR_DISCARD_COLOR_1"..0x0010.s,
		"CLEAR_DISCARD_COLOR_2"..0x0020.s,
		"CLEAR_DISCARD_COLOR_3"..0x0040.s,
		"CLEAR_DISCARD_COLOR_4"..0x0080.s,
		"CLEAR_DISCARD_COLOR_5"..0x0100.s,
		"CLEAR_DISCARD_COLOR_6"..0x0200.s,
		"CLEAR_DISCARD_COLOR_7"..0x0400.s,
		"CLEAR_DISCARD_DEPTH"..0x0800.s,
		"CLEAR_DISCARD_STENCIL"..0x1000.s,

		"CLEAR_DISCARD_COLOR_MASK".."""(0
		| BGFX_CLEAR_DISCARD_COLOR_0
		| BGFX_CLEAR_DISCARD_COLOR_1
		| BGFX_CLEAR_DISCARD_COLOR_2
		| BGFX_CLEAR_DISCARD_COLOR_3
		| BGFX_CLEAR_DISCARD_COLOR_4
		| BGFX_CLEAR_DISCARD_COLOR_5
		| BGFX_CLEAR_DISCARD_COLOR_6
		| BGFX_CLEAR_DISCARD_COLOR_7)
		""",
		
		"CLEAR_DISCARD_MASK".."""(0
		| BGFX_CLEAR_DISCARD_COLOR_MASK
		| BGFX_CLEAR_DISCARD_DEPTH
		| BGFX_CLEAR_DISCARD_STENCIL)
		"""
	)

	val DebugFlags = IntConstant(
		"Debug",

		"DEBUG_NONE"..0x00000000,
		"DEBUG_WIREFRAME"..0x00000001,
		"DEBUG_IFH"..0x00000002,
		"DEBUG_STATS"..0x00000004,
		"DEBUG_TEXT"..0x00000008
	).javaDocLinks

	val BufferFlags = ShortConstant(
		"Buffer creation flags",

		"BUFFER_NONE"..0x0000.s,
		"BUFFER_COMPUTE_READ"..0x0100.s,
		"BUFFER_COMPUTE_WRITE"..0x0200.s,
		"BUFFER_DRAW_INDIRECT"..0x0400.s,
		"BUFFER_ALLOW_RESIZE"..0x0800.s,
		"BUFFER_INDEX32"..0x1000.s,

		"BUFFER_COMPUTE_READ_WRITE".."""(0
		| BGFX_BUFFER_COMPUTE_READ
		| BGFX_BUFFER_COMPUTE_WRITE)
		"""
	).javaDocLinks

	ShortConstant(
		"Buffer",

		"BUFFER_COMPUTE_FORMAT_8x1"..0x0001.s,
		"BUFFER_COMPUTE_FORMAT_8x2"..0x0002.s,
		"BUFFER_COMPUTE_FORMAT_8x4"..0x0003.s,
		"BUFFER_COMPUTE_FORMAT_16x1"..0x0004.s,
		"BUFFER_COMPUTE_FORMAT_16x2"..0x0005.s,
		"BUFFER_COMPUTE_FORMAT_16x4"..0x0006.s,
		"BUFFER_COMPUTE_FORMAT_32x1"..0x0007.s,
		"BUFFER_COMPUTE_FORMAT_32x2"..0x0008.s,
		"BUFFER_COMPUTE_FORMAT_32x4"..0x0009.s,
		"BUFFER_COMPUTE_FORMAT_SHIFT".."0",
		"BUFFER_COMPUTE_FORMAT_MASK"..0x000f.s,

		"BUFFER_COMPUTE_TYPE_UINT"..0x0010.s,
		"BUFFER_COMPUTE_TYPE_INT"..0x0020.s,
		"BUFFER_COMPUTE_TYPE_FLOAT"..0x0030.s,
		"BUFFER_COMPUTE_TYPE_SHIFT".."4",
		"BUFFER_COMPUTE_TYPE_MASK"..0x0030.s
	)

	val TextureFlags = IntConstant(
		"Texture",

		"TEXTURE_NONE"..0x00000000,

		"TEXTURE_U_MIRROR"..0x00000001,
		"TEXTURE_U_CLAMP"..0x00000002,
		"TEXTURE_U_BORDER"..0x00000003,

		"TEXTURE_V_MIRROR"..0x00000004,
		"TEXTURE_V_CLAMP"..0x00000008,
		"TEXTURE_V_BORDER"..0x0000000c,

		"TEXTURE_W_MIRROR"..0x00000010,
		"TEXTURE_W_CLAMP"..0x00000020,
		"TEXTURE_W_BORDER"..0x00000030,

		"TEXTURE_MIN_POINT"..0x00000040,
		"TEXTURE_MIN_ANISOTROPIC"..0x00000080,

		"TEXTURE_MAG_POINT"..0x00000100,
		"TEXTURE_MAG_ANISOTROPIC"..0x00000200,

		"TEXTURE_MIP_POINT"..0x00000400,

		"TEXTURE_MSAA_SAMPLE"..0x00000800,
		"TEXTURE_RT"..0x00001000,
		"TEXTURE_RT_MSAA_X2"..0x00002000,
		"TEXTURE_RT_MSAA_X4"..0x00003000,
		"TEXTURE_RT_MSAA_X8"..0x00004000,
		"TEXTURE_RT_MSAA_X16"..0x00005000,

		"TEXTURE_RT_WRITE_ONLY"..0x00008000,

		"TEXTURE_COMPARE_LESS"..0x00010000,
		"TEXTURE_COMPARE_LEQUAL"..0x00020000,
		"TEXTURE_COMPARE_EQUAL"..0x00030000,
		"TEXTURE_COMPARE_GEQUAL"..0x00040000,
		"TEXTURE_COMPARE_GREATER"..0x00050000,
		"TEXTURE_COMPARE_NOTEQUAL"..0x00060000,
		"TEXTURE_COMPARE_NEVER"..0x00070000,
		"TEXTURE_COMPARE_ALWAYS"..0x00080000,

		"TEXTURE_COMPUTE_WRITE"..0x00100000,
		"TEXTURE_SRGB"..0x00200000,
		"TEXTURE_BLIT_DST"..0x00400000,
		"TEXTURE_READ_BACK"..0x00800000
	).javaDocLinks

	IntConstant(
		"Texture shifts/masks",

		"TEXTURE_U_SHIFT".."0",
		"TEXTURE_U_MASK"..0x00000003,

		"TEXTURE_V_SHIFT".."2",
		"TEXTURE_V_MASK"..0x0000000c,

		"TEXTURE_W_SHIFT".."4",
		"TEXTURE_W_MASK"..0x00000030,

		"TEXTURE_MIN_SHIFT".."6",
		"TEXTURE_MIN_MASK"..0x000000c0,

		"TEXTURE_MAG_SHIFT".."8",
		"TEXTURE_MAG_MASK"..0x00000300,

		"TEXTURE_MIP_SHIFT".."10",
		"TEXTURE_MIP_MASK"..0x00000400,

		"TEXTURE_RT_MSAA_SHIFT".."12",
		"TEXTURE_RT_MSAA_MASK"..0x00007000,

		"TEXTURE_RT_MASK"..0x0000f000,

		"TEXTURE_COMPARE_SHIFT".."16",
		"TEXTURE_COMPARE_MASK"..0x000f0000,

		"TEXTURE_BORDER_COLOR_SHIFT".."24",
		"TEXTURE_BORDER_COLOR_MASK"..0x0f000000,

		"TEXTURE_RESERVED_SHIFT".."28",
		"TEXTURE_RESERVED_MASK".."0xf0000000",

		"TEXTURE_SAMPLER_BITS_MASK".."""(0
		| BGFX_TEXTURE_U_MASK
		| BGFX_TEXTURE_V_MASK
		| BGFX_TEXTURE_W_MASK
		| BGFX_TEXTURE_MIN_MASK
		| BGFX_TEXTURE_MAG_MASK
		| BGFX_TEXTURE_MIP_MASK
		| BGFX_TEXTURE_COMPARE_MASK)
		"""
	)

	val ResetFlags = IntConstant(
		"Reset",

		"RESET_NONE"..0x00000000,
		"RESET_FULLSCREEN"..0x00000001,
		"RESET_FULLSCREEN_SHIFT".."0",
		"RESET_FULLSCREEN_MASK"..0x00000001,
		"RESET_MSAA_X2"..0x00000010,
		"RESET_MSAA_X4"..0x00000020,
		"RESET_MSAA_X8"..0x00000030,
		"RESET_MSAA_X16"..0x00000040,
		"RESET_MSAA_SHIFT".."4",
		"RESET_MSAA_MASK"..0x00000070,
		"RESET_VSYNC"..0x00000080,
		"RESET_MAXANISOTROPY"..0x00000100,
		"RESET_CAPTURE"..0x00000200,
		"RESET_HMD"..0x00000400,
		"RESET_HMD_DEBUG"..0x00000800,
		"RESET_HMD_RECENTER"..0x00001000,
		"RESET_FLUSH_AFTER_RENDER"..0x00002000,
		"RESET_FLIP_AFTER_RENDER"..0x00004000,
		"RESET_SRGB_BACKBUFFER"..0x00008000,
		"RESET_HIDPI"..0x00010000,
		"RESET_DEPTH_CLAMP"..0x00020000,
		"RESET_SUSPEND"..0x00040000
	).javaDocLinks

	IntConstant(
		"Reset",

		"RESET_RESERVED_SHIFT".."31",
		"RESET_RESERVED_MASK".."0x80000000"
	)

	LongConstant(
		"Caps",

		"CAPS_TEXTURE_COMPARE_LEQUAL"..0x0000000000000001L,
		"CAPS_TEXTURE_COMPARE_ALL"..0x0000000000000003L,
		"CAPS_TEXTURE_3D"..0x0000000000000004L,
		"CAPS_VERTEX_ATTRIB_HALF"..0x0000000000000008L,
		"CAPS_VERTEX_ATTRIB_UINT10"..0x0000000000000010L,
		"CAPS_INSTANCING"..0x0000000000000020L,
		"CAPS_RENDERER_MULTITHREADED"..0x0000000000000040L,
		"CAPS_FRAGMENT_DEPTH"..0x0000000000000080L,
		"CAPS_BLEND_INDEPENDENT"..0x0000000000000100L,
		"CAPS_COMPUTE"..0x0000000000000200L,
		"CAPS_FRAGMENT_ORDERING"..0x0000000000000400L,
		"CAPS_SWAP_CHAIN"..0x0000000000000800L,
		"CAPS_HMD"..0x0000000000001000L,
		"CAPS_INDEX32"..0x0000000000002000L,
		"CAPS_DRAW_INDIRECT"..0x0000000000004000L,
		"CAPS_HIDPI"..0x0000000000008000L,
		"CAPS_TEXTURE_BLIT"..0x0000000000010000L,
		"CAPS_TEXTURE_READ_BACK"..0x0000000000020000L,
		"CAPS_OCCLUSION_QUERY"..0x0000000000040000L,
		"CAPS_ALPHA_TO_COVERAGE"..0x0000000000080000L,
		"CAPS_CONSERVATIVE_RASTER"..0x0000000000100000L,
		"CAPS_TEXTURE_2D_ARRAY"..0x0000000000200000L,
		"CAPS_TEXTURE_CUBE_ARRAY"..0x0000000000400000L,
		"CAPS_GRAPHICS_DEBUGGER"..0x0000000000800000L
	)

	ShortConstant(
		"Format caps",

		"CAPS_FORMAT_TEXTURE_NONE"..0x0000.s,
		"CAPS_FORMAT_TEXTURE_2D"..0x0001.s,
		"CAPS_FORMAT_TEXTURE_2D_SRGB"..0x0002.s,
		"CAPS_FORMAT_TEXTURE_2D_EMULATED"..0x0004.s,
		"CAPS_FORMAT_TEXTURE_3D"..0x0008.s,
		"CAPS_FORMAT_TEXTURE_3D_SRGB"..0x0010.s,
		"CAPS_FORMAT_TEXTURE_3D_EMULATED"..0x0020.s,
		"CAPS_FORMAT_TEXTURE_CUBE"..0x0040.s,
		"CAPS_FORMAT_TEXTURE_CUBE_SRGB"..0x0080.s,
		"CAPS_FORMAT_TEXTURE_CUBE_EMULATED"..0x0100.s,
		"CAPS_FORMAT_TEXTURE_VERTEX"..0x0200.s,
		"CAPS_FORMAT_TEXTURE_IMAGE"..0x0400.s,
		"CAPS_FORMAT_TEXTURE_FRAMEBUFFER"..0x0800.s,
		"CAPS_FORMAT_TEXTURE_FRAMEBUFFER_MSAA"..0x1000.s,
		"CAPS_FORMAT_TEXTURE_MSAA"..0x2000.s,
		"CAPS_FORMAT_TEXTURE_MIP_AUTOGEN"..0x4000.s
	)

	ByteConstant(
		"View",

		"VIEW_NONE"..0x00.b,
		"VIEW_STEREO"..0x01.b
	)

	ByteConstant(
		"Submit",

		"SUBMIT_EYE_LEFT"..0x01.b,
		"SUBMIT_EYE_RIGHT"..0x02.b,
		"SUBMIT_EYE_MASK"..0x03.b,
		"SUBMIT_EYE_FIRST".."BGFX_SUBMIT_EYE_LEFT",

		"SUBMIT_RESERVED_SHIFT".."7",
		"SUBMIT_RESERVED_MASK".."(byte)0x80"
	)

	ShortConstant(
		"PCI",

		"PCI_ID_NONE"..0x0000.s,
		"PCI_ID_SOFTWARE_RASTERIZER"..0x0001.s,
		"PCI_ID_AMD"..0x1002.s,
		"PCI_ID_INTEL".."(short)0x8086",
		"PCI_ID_NVIDIA"..0x10de.s
	)

	ByteConstant(
		"HMD",

		"HMD_NONE"..0x00.b,
		"HMD_DEVICE_RESOLUTION"..0x01.b,
		"HMD_RENDERING"..0x02.b
	)

	ByteConstant(
		"Cubemap",

		"CUBE_MAP_POSITIVE_X"..0x00.b,
		"CUBE_MAP_NEGATIVE_X"..0x01.b,
		"CUBE_MAP_POSITIVE_Y"..0x02.b,
		"CUBE_MAP_NEGATIVE_Y"..0x03.b,
		"CUBE_MAP_POSITIVE_Z"..0x04.b,
		"CUBE_MAP_NEGATIVE_Z"..0x05.b
	)

	val RendererType = EnumConstant(
		"Renderer type. ({@code bgfx_renderer_type_t})",

		"RENDERER_TYPE_NULL".enum,
		"RENDERER_TYPE_DIRECT3D9".enum,
		"RENDERER_TYPE_DIRECT3D11".enum,
		"RENDERER_TYPE_DIRECT3D12".enum,
		"RENDERER_TYPE_METAL".enum,
		"RENDERER_TYPE_OPENGLES".enum,
		"RENDERER_TYPE_OPENGL".enum,
		"RENDERER_TYPE_VULKAN".enum,
		"RENDERER_TYPE_GNM".enum,

		"RENDERER_TYPE_COUNT".enum
	).javaDocLinks

	val Access = EnumConstant(
		"bgfx_access_t",

		"ACCESS_READ".enum,
		"ACCESS_WRITE".enum,
		"ACCESS_READWRITE".enum,

		"ACCESS_COUNT".enum
	).javaDocLinksSkipCount

	val Attrib = EnumConstant(
		"bgfx_attrib_t",

		"ATTRIB_POSITION".enum,
		"ATTRIB_NORMAL".enum,
		"ATTRIB_TANGENT".enum,
		"ATTRIB_BITANGENT".enum,
		"ATTRIB_COLOR0".enum,
		"ATTRIB_COLOR1".enum,
		"ATTRIB_INDICES".enum,
		"ATTRIB_WEIGHT".enum,
		"ATTRIB_TEXCOORD0".enum,
		"ATTRIB_TEXCOORD1".enum,
		"ATTRIB_TEXCOORD2".enum,
		"ATTRIB_TEXCOORD3".enum,
		"ATTRIB_TEXCOORD4".enum,
		"ATTRIB_TEXCOORD5".enum,
		"ATTRIB_TEXCOORD6".enum,
		"ATTRIB_TEXCOORD7".enum,

		"ATTRIB_COUNT".enum("", "BGFX_ATTRIB_TEXCOORD7 + 1")
	).javaDocLinksSkipCount

	val AttribType = EnumConstant(
		"bgfx_attrib_type_t",

		"ATTRIB_TYPE_UINT8".enum,
		"ATTRIB_TYPE_UINT10".enum,
		"ATTRIB_TYPE_INT16".enum,
		"ATTRIB_TYPE_HALF".enum,
		"ATTRIB_TYPE_FLOAT".enum,

		"ATTRIB_TYPE_COUNT".enum("", "BGFX_ATTRIB_TYPE_FLOAT + 1")
	).javaDocLinks

	val TextureFormat = EnumConstant(
		"bgfx_texture_format_t",

		"TEXTURE_FORMAT_BC1".enum,
		"TEXTURE_FORMAT_BC2".enum,
		"TEXTURE_FORMAT_BC3".enum,
		"TEXTURE_FORMAT_BC4".enum,
		"TEXTURE_FORMAT_BC5".enum,
		"TEXTURE_FORMAT_BC6H".enum,
		"TEXTURE_FORMAT_BC7".enum,
		"TEXTURE_FORMAT_ETC1".enum,
		"TEXTURE_FORMAT_ETC2".enum,
		"TEXTURE_FORMAT_ETC2A".enum,
		"TEXTURE_FORMAT_ETC2A1".enum,
		"TEXTURE_FORMAT_PTC12".enum,
		"TEXTURE_FORMAT_PTC14".enum,
		"TEXTURE_FORMAT_PTC12A".enum,
		"TEXTURE_FORMAT_PTC14A".enum,
		"TEXTURE_FORMAT_PTC22".enum,
		"TEXTURE_FORMAT_PTC24".enum,

		"TEXTURE_FORMAT_UNKNOWN".enum,

		"TEXTURE_FORMAT_R1".enum,
		"TEXTURE_FORMAT_A8".enum,
		"TEXTURE_FORMAT_R8".enum,
		"TEXTURE_FORMAT_R8I".enum,
		"TEXTURE_FORMAT_R8U".enum,
		"TEXTURE_FORMAT_R8S".enum,
		"TEXTURE_FORMAT_R16".enum,
		"TEXTURE_FORMAT_R16I".enum,
		"TEXTURE_FORMAT_R16U".enum,
		"TEXTURE_FORMAT_R16F".enum,
		"TEXTURE_FORMAT_R16S".enum,
		"TEXTURE_FORMAT_R32I".enum,
		"TEXTURE_FORMAT_R32U".enum,
		"TEXTURE_FORMAT_R32F".enum,
		"TEXTURE_FORMAT_RG8".enum,
		"TEXTURE_FORMAT_RG8I".enum,
		"TEXTURE_FORMAT_RG8U".enum,
		"TEXTURE_FORMAT_RG8S".enum,
		"TEXTURE_FORMAT_RG16".enum,
		"TEXTURE_FORMAT_RG16I".enum,
		"TEXTURE_FORMAT_RG16U".enum,
		"TEXTURE_FORMAT_RG16F".enum,
		"TEXTURE_FORMAT_RG16S".enum,
		"TEXTURE_FORMAT_RG32I".enum,
		"TEXTURE_FORMAT_RG32U".enum,
		"TEXTURE_FORMAT_RG32F".enum,
		"TEXTURE_FORMAT_RGB8".enum,
		"TEXTURE_FORMAT_RGB8I".enum,
		"TEXTURE_FORMAT_RGB8U".enum,
		"TEXTURE_FORMAT_RGB8S".enum,
		"TEXTURE_FORMAT_RGB9E5F".enum,
		"TEXTURE_FORMAT_BGRA8".enum,
		"TEXTURE_FORMAT_RGBA8".enum,
		"TEXTURE_FORMAT_RGBA8I".enum,
		"TEXTURE_FORMAT_RGBA8U".enum,
		"TEXTURE_FORMAT_RGBA8S".enum,
		"TEXTURE_FORMAT_RGBA16".enum,
		"TEXTURE_FORMAT_RGBA16I".enum,
		"TEXTURE_FORMAT_RGBA16U".enum,
		"TEXTURE_FORMAT_RGBA16F".enum,
		"TEXTURE_FORMAT_RGBA16S".enum,
		"TEXTURE_FORMAT_RGBA32I".enum,
		"TEXTURE_FORMAT_RGBA32U".enum,
		"TEXTURE_FORMAT_RGBA32F".enum,
		"TEXTURE_FORMAT_R5G6B5".enum,
		"TEXTURE_FORMAT_RGBA4".enum,
		"TEXTURE_FORMAT_RGB5A1".enum,
		"TEXTURE_FORMAT_RGB10A2".enum,
		"TEXTURE_FORMAT_R11G11B10F".enum,

		"TEXTURE_FORMAT_UNKNOWN_DEPTH".enum,

		"TEXTURE_FORMAT_D16".enum,
		"TEXTURE_FORMAT_D24".enum,
		"TEXTURE_FORMAT_D24S8".enum,
		"TEXTURE_FORMAT_D32".enum,
		"TEXTURE_FORMAT_D16F".enum,
		"TEXTURE_FORMAT_D24F".enum,
		"TEXTURE_FORMAT_D32F".enum,
		"TEXTURE_FORMAT_D0S8".enum,

		"TEXTURE_FORMAT_COUNT".enum("", "BGFX_TEXTURE_FORMAT_D0S8 + 1")
	).javaDocLinksSkipCount

	val UniformType = EnumConstant(
		"bgfx_uniform_type_t",

		"UNIFORM_TYPE_INT1".enum,
		"UNIFORM_TYPE_END".enum,

		"UNIFORM_TYPE_VEC4".enum,
		"UNIFORM_TYPE_MAT3".enum,
		"UNIFORM_TYPE_MAT4".enum,

		"UNIFORM_TYPE_COUNT".enum
	).javaDocLinksSkipCount

	val BackbufferRatio = EnumConstant(
		"bgfx_backbuffer_ratio_t",

		"BACKBUFFER_RATIO_EQUAL".enum,
		"BACKBUFFER_RATIO_HALF".enum,
		"BACKBUFFER_RATIO_QUARTER".enum,
		"BACKBUFFER_RATIO_EIGHTH".enum,
		"BACKBUFFER_RATIO_SIXTEENTH".enum,
		"BACKBUFFER_RATIO_DOUBLE".enum,

		"BACKBUFFER_RATIO_COUNT".enum
	).javaDocLinksSkipCount

	EnumConstant(
		"bgfx_occlusion_query_result_t",
		
		"OCCLUSION_QUERY_RESULT_INVISIBLE".enum,
		"OCCLUSION_QUERY_RESULT_VISIBLE".enum,
		"OCCLUSION_QUERY_RESULT_NORESULT".enum,

		"OCCLUSION_QUERY_RESULT_COUNT".enum
	)

	val TopologyConvert = EnumConstant(
		"bgfx_topology_convert_t",
	
		"TOPOLOGY_CONVERT_TRI_LIST_FLIP_WINDING".enum,
		"TOPOLOGY_CONVERT_TRI_LIST_TO_LINE_LIST".enum,
		"TOPOLOGY_CONVERT_TRI_STRIP_TO_TRI_LIST".enum,
		"TOPOLOGY_CONVERT_LINE_STRIP_TO_LINE_LIST".enum,

		"TOPOLOGY_CONVERT_COUNT".enum
	).javaDocLinksSkipCount

	val TopologySort = EnumConstant(
		"bgfx_topology_sort_t",

		"TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_MIN".enum,
		"TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_AVG".enum,
		"TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_MAX".enum,
		"TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_MIN".enum,
		"TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_AVG".enum,
		"TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_MAX".enum,
		"TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_MIN".enum,
		"TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_AVG".enum,
		"TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_MAX".enum,
		"TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_MIN".enum,
		"TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_AVG".enum,
		"TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_MAX".enum,

		"TOPOLOGY_SORT_COUNT".enum
	).javaDocLinksSkipCount

	/*val Fatal =*/ EnumConstant(
		"bgfx_fatal_t",

		"FATAL_DEBUG_CHECK".enum,
		"FATAL_MINIMUM_REQUIRED_SPECS".enum,
		"FATAL_INVALID_SHADER".enum,
		"FATAL_UNABLE_TO_INITIALIZE".enum,
		"FATAL_UNABLE_TO_CREATE_TEXTURE".enum,
		"FATAL_DEVICE_LOST".enum,

		"FATAL_COUNT".enum
	).javaDocLinksSkipCount

	void(
		"vertex_decl_begin",
		"Start a vertex declaration.",

		bgfx_vertex_decl_t.IN("_decl", "the vertex declaration"),
		bgfx_renderer_type_t.IN("_renderer", "the renderer type", RendererType)
	)

	void(
		"vertex_decl_add",
		"""
		Adds attribute to a vertex declaration.

		Must be called between #vertex_decl_begin()/#vertex_decl_end().
		""",

		bgfx_vertex_decl_t.IN("_decl", "the vertex declaration"),
		bgfx_attrib_t.IN("_attrib", "attribute semantics", Attrib),
		MapToInt..uint8_t.IN("_num", "number of elements", "1 2 3 4"),
		bgfx_attrib_type_t.IN("_type", "element type", AttribType),
		bool.IN(
			"_normalized",
			"""
			when using fixed point attribute type (f.e. #ATTRIB_TYPE_UINT8) value will be normalized for vertex shader usage. When {@code normalized} is set to
			true, #ATTRIB_TYPE_UINT8 value in range 0-255 will be in range 0.0-1.0 in vertex shader.
			"""
		),
		bool.IN(
			"_asInt",
			"""
			packaging rule for {@code vertexPack}, {@code vertexUnpack}, and {@code vertexConvert} for #ATTRIB_TYPE_UINT8 and #ATTRIB_TYPE_INT16. Unpacking
			code must be implemented inside vertex shader.
			"""
		)
	)

	void(
		"vertex_decl_skip",
		"Skips {@code _num} bytes in vertex stream.",

		bgfx_vertex_decl_t.IN("_decl", "the vertex declaration"),
		MapToInt..uint8_t.IN("_num", "the number of bytes to skip")
	)

	void(
		"vertex_decl_end",
		"Ends a vertex declaration.",

		bgfx_vertex_decl_t.IN("_decl", "the vertex declaration")
	)

	void(
		"vertex_pack",
		"Packs {@code vec4} into vertex stream format.",

		Check(4)..const..float_p.IN("_input", ""),
		bool.IN("_inputNormalized", ""),
		bgfx_attrib_t.IN("_attr", "", Attrib),
		const..bgfx_vertex_decl_t.IN("_decl", ""),
		void_p.IN("_data", ""),
		uint32_t.IN("_index", "")
	)

	void(
		"vertex_unpack",
		"Unpacks {@code vec4} from vertex stream format.",

		Check(4)..float_p.OUT("_output", ""),
		bgfx_attrib_t.IN("_attr", "", Attrib),
		const..bgfx_vertex_decl_t.IN("_decl", ""),
		const..void_p.IN("_data", ""),
		uint32_t.IN("_index", "")
	)

	void(
		"vertex_convert",
		"Converts vertex stream data from one vertex stream format to another.",

		const..bgfx_vertex_decl_t.IN("_destDecl", "destination vertex stream declaration"),
		void_p.IN("_destData", "destination vertex stream"),
		const..bgfx_vertex_decl_t.IN("_srcDecl", "source vertex stream declaration"),
		const..void_p.IN("_srcData", "source vertex stream data"),
		uint32_t.IN("_num", "number of vertices to convert from source to destination")
	)

	uint16_t(
		"weld_vertices",
		"Welds vertices.",

		uint16_t.p.OUT("_output", "welded vertices remapping table. The size of buffer be the same as number of vertices."),
		const..bgfx_vertex_decl_t.IN("_decl", "vertex stream declaration"),
		const..void_p.IN("_data", "vertex stream"),
		AutoSize("_output")..MapToInt..uint16_t.IN("_num", "number of vertices in vertex stream"),
		float.IN("_epsilon", "error tolerance for vertex position comparison"),

		returnDoc = "number of unique vertices after vertex welding"
	)

	uint32_t(
		"topology_convert",
		"Converts index buffer for use with different primitive topologies.",

		bgfx_topology_convert_t.IN("_conversion", "conversion type", TopologyConvert),
		nullable..void_p.IN("_dst", "destination index buffer. If this argument it $NULL function will return number of indices after conversion"),
		AutoSize("_dst")..uint32_t.IN(
			"_dstSize",
			"""
			destination index buffer in bytes. It must be large enough to contain output indices. If destination size is insufficient index buffer will be
			truncated.
			"""
		),
		MultiType(
			PointerMapping.DATA_SHORT,
			PointerMapping.DATA_INT
		)..const..void_p.IN("_indices", "source indices"),
		AutoSizeShr("(_index32 ? 2 : 1)", "_indices")..uint32_t.IN("_numIndices", "number of input indices"),
		bool.IN("_index32", "set to `true` if input indices are 32-bit"),

		returnDoc = "number of output indices after conversion"
	)

	void(
		"topology_sort_tri_list",
		"Sorts indices.",

		bgfx_topology_sort_t.IN("_sort", "sort order", TopologySort),
		void_p.IN("_dst", "destination index buffer"),
		AutoSize("_dst")..uint32_t.IN(
			"_dstSize",
			"""
			destination index buffer in bytes. It must be large enough to contain output indices. If destination size is insufficient index buffer will be
			truncated.
			"""
		),
		Check(3)..const..float_p.IN("_dir", "direction (vector must be normalized)"),
		Check(3)..const..float_p.IN("_pos", "position"),
		const..void_p.IN("_vertices", "pointer to first vertex represented as float x, y, z. Must contain at least number of vertices referenced by index buffer."),
		uint32_t.IN("_stride", "vertex stride"),
		MultiType(
			PointerMapping.DATA_SHORT,
			PointerMapping.DATA_INT
		)..const..void_p.IN("_indices", "source indices"),
		AutoSizeShr("(_index32 ? 2 : 1)", "_indices")..uint32_t.IN("_numIndices", "number of input indices"),
		bool.IN("_index32", "set to `true` if input indices are 32-bit")
	)

	Code(
		javaInit = statement("\t\tint bytes = _height * _pitch * 4;")
	)..void(
		"image_swizzle_bgra8",
		"Swizzles RGBA8 image to BGRA8.",

		uint32_t.IN("_width", "width of input image (pixels)"),
		uint32_t.IN("_height", "height of input image (pixels)"),
		uint32_t.IN("_pitch", "pitch of input image (bytes)"),
		Check("bytes")..const..void_p.IN("_src", "source image"),
		Check("bytes")..void_p.IN("_dst", "destination image. Must be the same size as input image. {@code _dst} might be pointer to the same memory as {@code _src}.")
	)

	Code(
		javaInit = statement("\t\tint bytes = _height * _pitch * 4;")
	)..void(
		"image_rgba8_downsample_2x2",
		"Downsamples RGBA8 image with 2x2 pixel average filter.",

		uint32_t.IN("_width", "width of input image (pixels)"),
		uint32_t.IN("_height", "height of input image (pixels)"),
		uint32_t.IN("_pitch", "pitch of input image (bytes)"),
		Check("bytes")..const..void_p.IN("_src", "source image"),
		Check("bytes >> 2")..void_p.IN("_dst", "destination image. Must be at least quarter size of input image. {@code _dst} might be pointer to the same memory as {@code _src}.")
	)

	uint8_t(
		"get_supported_renderers",
		"Returns supported backend API renderers.",

		Check("BGFX_RENDERER_TYPE_COUNT")..bgfx_renderer_type_t.p.IN("_enum", "pointer to an array of #RENDERER_TYPE_COUNT renderer types"),

		returnDoc = "the number of renderers written to {@code _enum}"
	)

	(const..charASCII_p)(
		"get_renderer_name",
		"Returns name of renderer.",

		bgfx_renderer_type_t.IN("_type", "the renderer type", RendererType)
	)

	bool(
		"init",
		"Initializes bgfx library.",

		bgfx_renderer_type_t.IN("_type", "select rendering backend. When set to #RENDERER_TYPE_COUNT, default rendering backend will be selected.", RendererType),
		MapToInt..uint16_t.IN("_vendorId", "vendor PCI id. If set to #PCI_ID_NONE it will select the first device."),
		MapToInt..uint16_t.IN("_deviceId", "device id. If set to 0 it will select first device, or device with matching id."),
		nullable..bgfx_callback_interface_t.IN("_callback", "provide application specific callback interface"),
		nullable..bgfx_allocator_interface_t.IN("_allocator", "custom allocator. When custom allocator is not specified, library uses default CRT allocator. The library assumes custom allocator is thread safe."),

		returnDoc = "`true` if initialization was successful"
	)

	void(
		"shutdown",
		"Shuts down bgfx library."
	)

	void(
		"reset",
		"""
		Resets graphic settings and back-buffer size.

		This call doesn't actually change window size, it just resizes back-buffer. Windowing code has to change window size.
		""",

		uint32_t.IN("_width", "back-buffer width"),
		uint32_t.IN("_height", "back-buffer height"),
		uint32_t.IN("_flags", "reset flags", ResetFlags, LinkMode.BITFIELD)
	)

	uint32_t(
		"frame",
		"""
		Advances to next frame. When using multithreaded renderer, this call just swaps internal buffers, kicks render thread, and returns. In singlethreaded
		renderer this call does frame rendering.
		""",

		bool.IN("_capture", "capture frame with graphics debugger"),

		returnDoc =
		"""
		current frame number. This might be used in conjunction with double/multi buffering data outside the library and passing it to library #make_ref()
		calls.
		"""
	)

	bgfx_renderer_type_t(
		"get_renderer_type",
		"Returns current renderer backend API type."
	)

	(const..bgfx_caps_t)(
		"get_caps",
		"Returns renderer capabilities."
	)

	(const..bgfx_hmd_t)(
		"get_hmd",
		"Returns HMD info."
	)

	(const..bgfx_stats_t)(
		"get_stats",
		"Returns performance counters."
	)

	(const..bgfx_memory_t)(
		"alloc",
		"Allocates buffer to pass to bgfx calls. Data will be freed inside bgfx.",

		uint32_t.IN("_size", "the number of bytes to allocate")
	)

	(const..bgfx_memory_t)(
		"copy",
		"Allocates buffer and copies data into it. Data will be freed inside bgfx.",

		const..void_p.IN("_data", "the source data"),
		AutoSize("_data")..uint32_t.IN("_size", "the number of bytes to copy")
	)

	(const..bgfx_memory_t)(
		"make_ref",
		"""
		Makes reference to data to pass to bgfx. Unlike #alloc() this call doesn't allocate memory for data. It just copies pointer to data.
		
		You must make sure data is available for at least 2 #frame() calls.
		""",

		const..void_p.IN("_data", "the data to reference"),
		AutoSize("_data")..uint32_t.IN("_size", "the number of bytes to reference")
	)

	(const..bgfx_memory_t)(
		"make_ref_release",
		"""
		Makes reference to data to pass to bgfx. Unlike #alloc() this call doesn't allocate memory for data. It just copies pointer to data.
		
		The {@code bgfx_release_fn_t} function pointer will release this memory after it's consumed. The {@code bgfx_release_fn_t} function must be able to be
		called called from any thread.
		""",

		const..void_p.IN("_data", "the data to reference"),
		AutoSize("_data")..uint32_t.IN("_size", "the number of bytes to reference"),
		nullable..bgfx_release_fn_t.IN("_releaseFn", "the release function"),
		nullable..voidptr.IN("_userData", "user data to pass to {@code _releaseFn}")
	)

	void(
		"set_debug",
		"Sets debug flags.",

		uint32_t.IN("_debug", "the debug flags", DebugFlags, LinkMode.BITFIELD)
	)

	void(
		"dbg_text_clear",
		"Clears internal debug text buffer.",

		MapToInt..uint8_t.IN(
			"_attr",
			"color palette. Where top 4-bits represent index of background, and bottom 4-bits represent foreground color from standard VGA text palette."
		),
		bool.IN("_small", "")
	)

	void(
		"dbg_text_printf",
		"Prints into internal debug text character-buffer (VGA-compatible text mode).",

		MapToInt..uint16_t.IN("_x", "x coordinate"),
		MapToInt..uint16_t.IN("_y", "y coordinate"),
		MapToInt..uint8_t.IN(
			"_attr",
			"color palette. Where top 4-bits represent index of background, and bottom 4-bits represent foreground color from standard VGA text palette."
		),
		const..charUTF8_p.IN("_format", "`printf` style format")
	)

	void(
		"dbg_text_vprintf",
		"Print into internal debug text character-buffer (VGA-compatible text mode).",

		MapToInt..uint16_t.IN("_x", "x coordinate"),
		MapToInt..uint16_t.IN("_y", "y coordinate"),
		MapToInt..uint8_t.IN(
			"_attr",
			"color palette. Where top 4-bits represent index of background, and bottom 4-bits represent foreground color from standard VGA text palette."
		),
		const..charUTF8_p.IN("_format", "`printf` style format"),
		va_list.IN("_argList", "additional arguments for format string")
	)

	void(
		"dbg_text_image",
		"Draws image into internal debug text buffer.",

		MapToInt..uint16_t.IN("_x", "x coordinate"),
		MapToInt..uint16_t.IN("_y", "y coordinate"),
		MapToInt..uint16_t.IN("_width", "image width"),
		MapToInt..uint16_t.IN("_height", "image height"),
		Check("_height * _pitch")..const..void_p.IN("_data", "raw image data (character/attribute raw encoding)"),
		MapToInt..uint16_t.IN("_pitch", "image pitch in bytes")
	)

	bgfx_index_buffer_handle_t(
		"create_index_buffer",
		"Creates static index buffer.",

		const..bgfx_memory_t.IN("_mem", "index buffer data"),
		MapToInt..uint16_t.IN("_flags", "buffer creation flags", BufferFlags)
	)

	void(
		"destroy_index_buffer",
		"Destroys static index buffer.",

		bgfx_index_buffer_handle_t.IN("_handle", "the static index buffer to destroy")
	)

	bgfx_vertex_buffer_handle_t(
		"create_vertex_buffer",
		"Creates static vertex buffer.",

		const..bgfx_memory_t.IN("_mem", "vertex buffer data"),
		const..bgfx_vertex_decl_t.IN("_decl", "vertex declaration"),
		MapToInt..uint16_t.IN("_flags", "buffer creation flags", BufferFlags)
	)

	void(
		"destroy_vertex_buffer",
		"Destroys static vertex buffer.",

		bgfx_vertex_buffer_handle_t.IN("_handle", "the static vertex buffer to destroy")
	)

	bgfx_dynamic_index_buffer_handle_t(
		"create_dynamic_index_buffer",
		"Creates empty dynamic index buffer.",

		uint32_t.IN("_num", "number of indices"),
		MapToInt..uint16_t.IN("_flags", "buffer creation flags", BufferFlags)
	)

	bgfx_dynamic_index_buffer_handle_t(
		"create_dynamic_index_buffer_mem",
		"Creates dynamic index buffer and initializes it.",

		const..bgfx_memory_t.IN("_mem", "index buffer data"),
		MapToInt..uint16_t.IN("_flags", "buffer creation flags", BufferFlags)
	)

	void(
		"update_dynamic_index_buffer",
		"Updates dynamic index buffer.",

		bgfx_dynamic_index_buffer_handle_t.IN("_handle", "dynamic index buffer handle"),
		uint32_t.IN("_startIndex", "start index"),
		const..bgfx_memory_t.IN("_mem", "index buffer data")
	)

	void(
		"destroy_dynamic_index_buffer",
		"Destroys dynamic index buffer.",

		bgfx_dynamic_index_buffer_handle_t.IN("_handle", "the dynamic index buffer to destroy")
	)

	bgfx_dynamic_vertex_buffer_handle_t(
		"create_dynamic_vertex_buffer",
		"Creates empty dynamic vertex buffer.",

		uint32_t.IN("_num", "number of vertices"),
		const..bgfx_vertex_decl_t.IN("_decl", "vertex declaration"),
		MapToInt..uint16_t.IN("_flags", "buffer creation flags", BufferFlags)
	)

	bgfx_dynamic_vertex_buffer_handle_t(
		"create_dynamic_vertex_buffer_mem",
		"Creates dynamic vertex buffer and initializes it.",

		const..bgfx_memory_t.IN("_mem", "vertex buffer data"),
		const..bgfx_vertex_decl_t.IN("_decl", "vertex declaration"),
		MapToInt..uint16_t.IN("_flags", "buffer creation flags", BufferFlags)
	)

	void(
		"update_dynamic_vertex_buffer",
		"Updates dynamic vertex buffer.",

		bgfx_dynamic_vertex_buffer_handle_t.IN("_handle", "dynamic vertex buffer handle"),
		uint32_t.IN("_startVertex", "start vertex"),
		const..bgfx_memory_t.IN("_mem", "vertex buffer data")
	)

	void(
		"destroy_dynamic_vertex_buffer",
		"Destroys dynamic vertex buffer.",

		bgfx_dynamic_vertex_buffer_handle_t.IN("_handle", "the dynamic vertex buffer to destroy")
	)

	bool(
		"check_avail_transient_index_buffer",
		"Returns true if internal transient index buffer has enough space.",

		uint32_t.IN("_num", "number of indices")
	)

	bool(
		"check_avail_transient_vertex_buffer",
		"Returns true if internal transient vertex buffer has enough space.",

		uint32_t.IN("_num", "number of vertices"),
		const..bgfx_vertex_decl_t.IN("_decl", "vertex declaration")
	)

	bool(
		"check_avail_instance_data_buffer",
		"Returns true if internal instance data buffer has enough space.",

		uint32_t.IN("_num", "number of instances"),
		MapToInt..uint16_t.IN("_stride", "stride per instance")
	)

	bool(
		"check_avail_transient_buffers",
		"Returns true if both internal transient index and vertex buffer have enough space.",

		uint32_t.IN("_numVertices", "number of vertices"),
		const..bgfx_vertex_decl_t.IN("_decl", "vertex declaration"),
		uint32_t.IN("_numIndices", "number of indices")
	)

	void(
		"alloc_transient_index_buffer",
		"""
		Allocates transient index buffer.

		You must call #set_index_buffer() after alloc in order to avoid memory leak.

		Only 16-bit index buffer is supported.
		""",

		bgfx_transient_index_buffer_t.OUT(
			"_tib",
			"##BGFXTransientIndexBuffer structure is filled and is valid for the duration of frame, and it can be reused for multiple draw calls"
		),
		uint32_t.IN("_num", "number of indices to allocate")
	)

	void(
		"alloc_transient_vertex_buffer",
		"Allocates transient vertex buffer.",

		bgfx_transient_vertex_buffer_t.OUT(
			"_tvb",
			"##BGFXTransientVertexBuffer structure is filled and is valid for the duration of frame, and it can be reused for multiple draw calls"
		),
		uint32_t.IN("_num", "number of vertices to allocate"),
		const..bgfx_vertex_decl_t.IN("_decl", "vertex declaration")
	)

	bool(
		"alloc_transient_buffers",
		"""
		Checks for required space and allocates transient vertex and index buffers. If both space requirements are satisfied function returns true.

		Only 16-bit index buffer is supported.
		""",

		bgfx_transient_vertex_buffer_t.OUT(
			"_tvb",
			"##BGFXTransientVertexBuffer structure is filled and is valid for the duration of frame, and it can be reused for multiple draw calls"
		),
		const..bgfx_vertex_decl_t.IN("_decl", "vertex declaration"),
		uint32_t.IN("_numVertices", "number of vertices to allocate"),
		bgfx_transient_index_buffer_t.OUT(
			"_tib",
			"##BGFXTransientIndexBuffer structure is filled and is valid for the duration of frame, and it can be reused for multiple draw calls"
		),
		uint32_t.IN("_numIndices", "number of indices to allocate")
	)

	(const..bgfx_instance_data_buffer_t)(
		"alloc_instance_data_buffer",
		"""
		Allocates instance data buffer.

		You must call #set_instance_data_buffer() after alloc in order to avoid memory leak.
		""",

		uint32_t.IN("_num", "number of instances to allocate"),
		MapToInt..uint16_t.IN("_stride", "stride per instance")
	)

	bgfx_indirect_buffer_handle_t(
		"create_indirect_buffer",
		"Creates draw indirect buffer.",

		uint32_t.IN("_num", "")
	)

	void(
		"destroy_indirect_buffer",
		"Destroys draw indirect buffer.",

		bgfx_indirect_buffer_handle_t.IN("_handle", "the draw indirect buffer to destroy")
	)

	bgfx_shader_handle_t(
		"create_shader",
		"Creates shader from memory buffer.",

		const..bgfx_memory_t.IN("_mem", "")
	)

	uint16_t(
		"get_shader_uniforms",
		"""
		Returns num of uniforms, and uniform handles used inside shader.
		
		Only non-predefined uniforms are returned.
		""",

		bgfx_shader_handle_t.IN("_handle", "shader handle"),
		bgfx_uniform_handle_t.p.OUT("_uniforms", "{@code bgfx_uniform_handle_t} array where data will be stored"),
		AutoSize("_uniforms")..uint16_t.IN("_max", "maximum capacity of {@code _uniforms}"),

		returnDoc = "number of uniforms used by shader"
	)

	void(
		"destroy_shader",
		"Destroys shader. Once program is created with shader it is safe to destroy shader.",

		bgfx_shader_handle_t.IN("_handle", "the shader  to destroy")
	)

	bgfx_program_handle_t(
		"create_program",
		"Creates program with vertex and fragment shaders.",

		bgfx_shader_handle_t.IN("_vsh", "vertex shader"),
		bgfx_shader_handle_t.IN("_fsh", "fragment shader"),
		bool.IN("_destroyShaders", "if true, shaders will be destroyed when program is destroyed"),

		returnDoc = "program handle if vertex shader output and fragment shader input are matching, otherwise returns invalid program handle."
	)

	bgfx_program_handle_t(
		"create_compute_program",
		"Creates program with compute shader.",

		bgfx_shader_handle_t.IN("_csh", "compute shader"),
		bool.IN("_destroyShaders", "if true, shader will be destroyed when program is destroyed")
	)

	void(
		"destroy_program",
		"Destroy program.",

		bgfx_program_handle_t.IN("_handle", "the program to destroy")
	)

	void(
		"calc_texture_size",
		"Calculates amount of memory required for texture.",

		bgfx_texture_info_t.OUT("_info", "resulting texture info structure"),
		MapToInt..uint16_t.IN("_width", "width"),
		MapToInt..uint16_t.IN("_height", "height"),
		MapToInt..uint16_t.IN("_depth", "depth"),
		bool.IN("_cubeMap", "indicates that texture contains cubemap"),
		bool.IN("_hasMips", "indicates that texture contains full mip-map chain"),
		MapToInt..uint16_t.IN("_numLayers", "number of layers in texture array"),
		bgfx_texture_format_t.IN("_format", "texture format", TextureFormat)
	)

	bgfx_texture_handle_t(
		"create_texture",
		"Creates texture from memory buffer.",

		const..bgfx_memory_t.IN("_mem", "DDS, KTX or PVR texture data"),
		uint32_t.IN("_flags", "default texture sampling mode is linear, and wrap mode is repeat", TextureFlags, LinkMode.BITFIELD),
		MapToInt..uint8_t.IN("_skip", "skip top level mips when parsing texture"),
		nullable..bgfx_texture_info_t.p.OUT("_info", "when non-$NULL is specified it returns parsed texture information")
	)

	bgfx_texture_handle_t(
		"create_texture_2d",
		"Creates 2D texture.",

		MapToInt..uint16_t.IN("_width", "width"),
		MapToInt..uint16_t.IN("_height", "height"),
		bool.IN("_hasMips", "indicates that texture contains full mip-map chain"),
		MapToInt..uint16_t.IN("_numLayers", "number of layers in texture array. Must be 1 if caps #CAPS_TEXTURE_2D_ARRAY flag is not set."),
		bgfx_texture_format_t.IN("_format", "texture format", TextureFormat),
		uint32_t.IN("_flags", "default texture sampling mode is linear, and wrap mode is repeat", TextureFlags, LinkMode.BITFIELD),
		const..bgfx_memory_t.IN(
			"_mem",
			"""
			texture data. If {@code _mem} is non-$NULL, created texture will be immutable. When {@code _numLayers} is more than 1, expected memory layout is
			texture and all mips together for each array element.
			"""
		)
	)

	bgfx_texture_handle_t(
		"create_texture_2d_scaled",
		"Creates frame buffer with size based on backbuffer ratio. Frame buffer will maintain ratio if back buffer resolution changes.",

		bgfx_backbuffer_ratio_t.IN("_ratio", "frame buffer size in respect to back-buffer size", BackbufferRatio),
		bool.IN("_hasMips", "indicates that texture contains full mip-map chain"),
		MapToInt..uint16_t.IN("_numLayers", "number of layers in texture array. Must be 1 if caps #CAPS_TEXTURE_2D_ARRAY flag is not set."),
		bgfx_texture_format_t.IN("_format", "texture format", TextureFormat),
		uint32_t.IN("_flags", "default texture sampling mode is linear, and wrap mode is repeat", TextureFlags, LinkMode.BITFIELD)
	)

	bgfx_texture_handle_t(
		"create_texture_3d",
		"""
		""",

		MapToInt..uint16_t.IN("_width", ""),
		MapToInt..uint16_t.IN("_height", ""),
		MapToInt..uint16_t.IN("_depth", ""),
		bool.IN("_hasMips", ""),
		bgfx_texture_format_t.IN("_format", "", TextureFormat),
		uint32_t.IN("_flags", ""),
		const..bgfx_memory_t.IN("_mem", "")
	)

	bgfx_texture_handle_t(
		"create_texture_cube",
		"""
		""",

		MapToInt..uint16_t.IN("_size", ""),
		bool.IN("_hasMips", ""),
		MapToInt..uint16_t.IN("_numLayers", ""),
		bgfx_texture_format_t.IN("_format", "", TextureFormat),
		uint32_t.IN("_flags", ""),
		const..bgfx_memory_t.IN("_mem", "")
	)

	void(
		"update_texture_2d",
		"""
		""",

		bgfx_texture_handle_t.IN("_handle", ""),
		MapToInt..uint16_t.IN("_layer", ""),
		MapToInt..uint8_t.IN("_mip", ""),
		MapToInt..uint16_t.IN("_x", ""),
		MapToInt..uint16_t.IN("_y", ""),
		MapToInt..uint16_t.IN("_width", ""),
		MapToInt..uint16_t.IN("_height", ""),
		const..bgfx_memory_t.IN("_mem", ""),
		MapToInt..uint16_t.IN("_pitch", "")
	)

	void(
		"update_texture_3d",
		"""
		""",

		bgfx_texture_handle_t.IN("_handle", ""),
		MapToInt..uint8_t.IN("_mip", ""),
		MapToInt..uint16_t.IN("_x", ""),
		MapToInt..uint16_t.IN("_y", ""),
		MapToInt..uint16_t.IN("_z", ""),
		MapToInt..uint16_t.IN("_width", ""),
		MapToInt..uint16_t.IN("_height", ""),
		MapToInt..uint16_t.IN("_depth", ""),
		const..bgfx_memory_t.IN("_mem", "")
	)

	void(
		"update_texture_cube",
		"""
		""",

		bgfx_texture_handle_t.IN("_handle", ""),
		MapToInt..uint16_t.IN("_layer", ""),
		MapToInt..uint8_t.IN("_side", ""),
		MapToInt..uint8_t.IN("_mip", ""),
		MapToInt..uint16_t.IN("_x", ""),
		MapToInt..uint16_t.IN("_y", ""),
		MapToInt..uint16_t.IN("_width", ""),
		MapToInt..uint16_t.IN("_height", ""),
		const..bgfx_memory_t.IN("_mem", ""),
		MapToInt..uint16_t.IN("_pitch", "")
	)

	uint32_t(
		"read_texture",
		"""
		""",

		bgfx_texture_handle_t.IN("_handle", ""),
		void_p.IN("_data", "")
	)

	uint32_t(
		"read_frame_buffer",
		"""
		""",

		bgfx_frame_buffer_handle_t.IN("_handle", ""),
		MapToInt..uint8_t.IN("_attachment", ""),
		void_p.IN("_data", "")
	)

	void(
		"destroy_texture",
		"""
		""",

		bgfx_texture_handle_t.IN("_handle", "")
	)

	bgfx_frame_buffer_handle_t(
		"create_frame_buffer",
		"""
		""",

		MapToInt..uint16_t.IN("_width", ""),
		MapToInt..uint16_t.IN("_height", ""),
		bgfx_texture_format_t.IN("_format", "", TextureFormat),
		uint32_t.IN("_textureFlags", "")
	)

	bgfx_frame_buffer_handle_t(
		"create_frame_buffer_scaled",
		"""
		""",

		bgfx_backbuffer_ratio_t.IN("_ratio", "", BackbufferRatio),
		bgfx_texture_format_t.IN("_format", "", TextureFormat),
		uint32_t.IN("_textureFlags", "")
	)

	bgfx_frame_buffer_handle_t(
		"create_frame_buffer_from_handles",
		"""
		""",

		MapToInt..uint8_t.IN("_num", ""),
		Check("_num")..const..bgfx_texture_handle_t.p.IN("_handles", ""),
		bool.IN("_destroyTextures", "")
	)

	bgfx_frame_buffer_handle_t(
		"create_frame_buffer_from_attachment",
		"""
		""",

		MapToInt..uint8_t.IN("_num", ""),
		const..bgfx_attachment_t.IN("_attachment", ""),
		bool.IN("_destroyTextures", "")
	)

	bgfx_frame_buffer_handle_t(
		"create_frame_buffer_from_nwh",
		"""
		""",

		void_p.IN("_nwh", ""),
		MapToInt..uint16_t.IN("_width", ""),
		MapToInt..uint16_t.IN("_height", ""),
		bgfx_texture_format_t.IN("_depthFormat", "", TextureFormat)
	)

	void(
		"destroy_frame_buffer",
		"""
		""",

		bgfx_frame_buffer_handle_t.IN("_handle", "")
	)

	bgfx_uniform_handle_t(
		"create_uniform",
		"""
		""",

		const..charUTF8_p.IN("_name", ""),
		bgfx_uniform_type_t.IN("_type", "", UniformType),
		MapToInt..uint16_t.IN("_num", "")
	)

	void(
		"destroy_uniform",
		"""
		""",

		bgfx_uniform_handle_t.IN("_handle", "")
	)

	bgfx_occlusion_query_handle_t(
		"create_occlusion_query",
		"""
		"""
	)

	bgfx_occlusion_query_result_t(
		"get_result",
		"""
		""",

		bgfx_occlusion_query_handle_t.IN("_handle", "")
	)

	void(
		"destroy_occlusion_query",
		"""
		""",

		bgfx_occlusion_query_handle_t.IN("_handle", "")
	)

	void(
		"set_palette_color",
		"""
		""",

		MapToInt..uint8_t.IN("_index", ""),
		Check(4)..const..float_p.IN("_rgba", "")
	)

	void(
		"set_view_name",
		"""
		""",

		MapToInt..uint8_t.IN("_id", ""),
		const..charUTF8_p.IN("_name", "")
	)

	void(
		"set_view_rect",
		"""
		""",

		MapToInt..uint8_t.IN("_id", ""),
		MapToInt..uint16_t.IN("_x", ""),
		MapToInt..uint16_t.IN("_y", ""),
		MapToInt..uint16_t.IN("_width", ""),
		MapToInt..uint16_t.IN("_height", "")
	)

	void(
		"set_view_rect_auto",
		"""
		""",

		MapToInt..uint8_t.IN("_id", ""),
		MapToInt..uint16_t.IN("_x", ""),
		MapToInt..uint16_t.IN("_y", ""),
		bgfx_backbuffer_ratio_t.IN("_ratio", "", BackbufferRatio)
	)

	void(
		"set_view_scissor",
		"""
		""",

		MapToInt..uint8_t.IN("_id", ""),
		MapToInt..uint16_t.IN("_x", ""),
		MapToInt..uint16_t.IN("_y", ""),
		MapToInt..uint16_t.IN("_width", ""),
		MapToInt..uint16_t.IN("_height", "")
	)

	void(
		"set_view_clear",
		"""
		""",

		MapToInt..uint8_t.IN("_id", ""),
		MapToInt..uint16_t.IN("_flags", ""),
		uint32_t.IN("_rgba", ""),
		float.IN("_depth", ""),
		MapToInt..uint8_t.IN("_stencil", "")
	)

	void(
		"set_view_clear_mrt",
		"""
		""",

		MapToInt..uint8_t.IN("_id", ""),
		MapToInt..uint16_t.IN("_flags", ""),
		float.IN("_depth", ""),
		MapToInt..uint8_t.IN("_stencil", ""),
		uint8_t.IN("_0", ""),
		uint8_t.IN("_1", ""),
		uint8_t.IN("_2", ""),
		uint8_t.IN("_3", ""),
		uint8_t.IN("_4", ""),
		uint8_t.IN("_5", ""),
		uint8_t.IN("_6", ""),
		uint8_t.IN("_7", "")
	)

	void(
		"set_view_seq",
		"""
		""",

		MapToInt..uint8_t.IN("_id", ""),
		bool.IN("_enabled", "")
	)

	void(
		"set_view_frame_buffer",
		"""
		""",

		MapToInt..uint8_t.IN("_id", ""),
		bgfx_frame_buffer_handle_t.IN("_handle", "")
	)

	void(
		"set_view_transform",
		"""
		""",

		MapToInt..uint8_t.IN("_id", ""),
		nullable..const..float_p.IN("_view", ""),
		nullable..const..float_p.IN("_proj", "")
	)

	void(
		"set_view_transform_stereo",
		"""
		""",

		MapToInt..uint8_t.IN("_id", ""),
		nullable..const..float_p.IN("_view", ""),
		nullable..const..float_p.IN("_projL", ""),
		MapToInt..uint8_t.IN("_flags", ""),
		nullable..const..float_p.IN("_projR", "")
	)

	void(
		"set_view_remap",
		"""
		""",

		MapToInt..uint8_t.IN("_id", ""),
		MapToInt..uint8_t.IN("_num", ""),
		const..void_p.IN("_remap", "")
	)

	void(
		"reset_view",
		"""
		""",

		MapToInt..uint8_t.IN("_id", "")
	)

	void(
		"set_marker",
		"""
		""",

		const..charUTF8_p.IN("_marker", "")
	)

	void(
		"set_state",
		"""
		""",

		uint64_t.IN("_state", ""),
		uint32_t.IN("_rgba", "")
	)

	void(
		"set_condition",
		"""
		""",

		bgfx_occlusion_query_handle_t.IN("_handle", ""),
		bool.IN("_visible", "")
	)

	void(
		"set_stencil",
		"""
		""",

		uint32_t.IN("_fstencil", ""),
		uint32_t.IN("_bstencil", "")
	)

	uint16_t(
		"set_scissor",
		"""
		""",

		MapToInt..uint16_t.IN("_x", ""),
		MapToInt..uint16_t.IN("_y", ""),
		MapToInt..uint16_t.IN("_width", ""),
		MapToInt..uint16_t.IN("_height", "")
	)

	void(
		"set_scissor_cached",
		"""
		""",

		MapToInt..uint16_t.IN("_cache", "")
	)

	uint32_t(
		"set_transform",
		"""
		""",

		const..float_p.IN("_mtx", ""),
		MapToInt..uint16_t.IN("_num", "")
	)

	uint32_t(
		"alloc_transform",
		"""
		""",

		bgfx_transform_t.IN("_transform", ""),
		MapToInt..uint16_t.IN("_num", "")
	)

	void(
		"set_transform_cached",
		"""
		""",

		uint32_t.IN("_cache", ""),
		MapToInt..uint16_t.IN("_num", "")
	)

	void(
		"set_uniform",
		"""
		""",

		bgfx_uniform_handle_t.IN("_handle", ""),
		const..void_p.IN("_value", ""),
		MapToInt..uint16_t.IN("_num", "")
	)

	void(
		"set_index_buffer",
		"""
		""",

		bgfx_index_buffer_handle_t.IN("_handle", ""),
		uint32_t.IN("_firstIndex", ""),
		uint32_t.IN("_numIndices", "")
	)

	void(
		"set_dynamic_index_buffer",
		"""
		""",

		bgfx_dynamic_index_buffer_handle_t.IN("_handle", ""),
		uint32_t.IN("_firstIndex", ""),
		uint32_t.IN("_numIndices", "")
	)

	void(
		"set_transient_index_buffer",
		"""
		""",

		const..bgfx_transient_index_buffer_t.IN("_tib", ""),
		uint32_t.IN("_firstIndex", ""),
		uint32_t.IN("_numIndices", "")
	)

	void(
		"set_vertex_buffer",
		"""
		""",

		bgfx_vertex_buffer_handle_t.IN("_handle", ""),
		uint32_t.IN("_startVertex", ""),
		uint32_t.IN("_numVertices", "")
	)

	void(
		"set_dynamic_vertex_buffer",
		"""
		""",

		bgfx_dynamic_vertex_buffer_handle_t.IN("_handle", ""),
		uint32_t.IN("_startVertex", ""),
		uint32_t.IN("_numVertices", "")
	)

	void(
		"set_transient_vertex_buffer",
		"""
		""",

		const..bgfx_transient_vertex_buffer_t.IN("_tvb", ""),
		uint32_t.IN("_startVertex", ""),
		uint32_t.IN("_numVertices", "")
	)

	void(
		"set_instance_data_buffer",
		"""
		""",

		const..bgfx_instance_data_buffer_t.IN("_idb", ""),
		uint32_t.IN("_num", "")
	)

	void(
		"set_instance_data_from_vertex_buffer",
		"""
		""",

		bgfx_vertex_buffer_handle_t.IN("_handle", ""),
		uint32_t.IN("_startVertex", ""),
		uint32_t.IN("_num", "")
	)

	void(
		"set_instance_data_from_dynamic_vertex_buffer",
		"""
		""",

		bgfx_dynamic_vertex_buffer_handle_t.IN("_handle", ""),
		uint32_t.IN("_startVertex", ""),
		uint32_t.IN("_num", "")
	)

	void(
		"set_texture",
		"""
		""",

		MapToInt..uint8_t.IN("_stage", ""),
		bgfx_uniform_handle_t.IN("_sampler", ""),
		bgfx_texture_handle_t.IN("_handle", ""),
		uint32_t.IN("_flags", "")
	)

	void(
		"set_texture_from_frame_buffer",
		"""
		""",

		MapToInt..uint8_t.IN("_stage", ""),
		bgfx_uniform_handle_t.IN("_sampler", ""),
		bgfx_frame_buffer_handle_t.IN("_handle", ""),
		MapToInt..uint8_t.IN("_attachment", ""),
		uint32_t.IN("_flags", "")
	)

	uint32_t(
		"touch",
		"""
		""",

		MapToInt..uint8_t.IN("_id", "")
	)

	uint32_t(
		"submit",
		"""
		""",

		MapToInt..uint8_t.IN("_id", ""),
		bgfx_program_handle_t.IN("_handle", ""),
		int32_t.IN("_depth", ""),
		bool.IN("_preserveState", "")
	)

	uint32_t(
		"submit_occlusion_query",
		"""
		""",

		MapToInt..uint8_t.IN("_id", ""),
		bgfx_program_handle_t.IN("_program", ""),
		bgfx_occlusion_query_handle_t.IN("_occlusionQuery", ""),
		int32_t.IN("_depth", ""),
		bool.IN("_preserveState", "")
	)

	uint32_t(
		"submit_indirect",
		"""
		""",

		MapToInt..uint8_t.IN("_id", ""),
		bgfx_program_handle_t.IN("_handle", ""),
		bgfx_indirect_buffer_handle_t.IN("_indirectHandle", ""),
		MapToInt..uint16_t.IN("_start", ""),
		MapToInt..uint16_t.IN("_num", ""),
		int32_t.IN("_depth", ""),
		bool.IN("_preserveState", "")
	)

	void(
		"set_image",
		"""
		""",

		MapToInt..uint8_t.IN("_stage", ""),
		bgfx_uniform_handle_t.IN("_sampler", ""),
		bgfx_texture_handle_t.IN("_handle", ""),
		MapToInt..uint8_t.IN("_mip", ""),
		bgfx_access_t.IN("_access", "", Access),
		bgfx_texture_format_t.IN("_format", "", TextureFormat)
	)

	void(
		"set_image_from_frame_buffer",
		"""
		""",

		MapToInt..uint8_t.IN("_stage", ""),
		bgfx_uniform_handle_t.IN("_sampler", ""),
		bgfx_frame_buffer_handle_t.IN("_handle", ""),
		MapToInt..uint8_t.IN("_attachment", ""),
		bgfx_access_t.IN("_access", "", Access),
		bgfx_texture_format_t.IN("_format", "", TextureFormat)
	)

	void(
		"set_compute_index_buffer",
		"""
		""",

		MapToInt..uint8_t.IN("_stage", ""),
		bgfx_index_buffer_handle_t.IN("_handle", ""),
		bgfx_access_t.IN("_access", "", Access)
	)

	void(
		"set_compute_vertex_buffer",
		"""
		""",

		MapToInt..uint8_t.IN("_stage", ""),
		bgfx_vertex_buffer_handle_t.IN("_handle", ""),
		bgfx_access_t.IN("_access", "", Access)
	)

	void(
		"set_compute_dynamic_index_buffer",
		"""
		""",

		MapToInt..uint8_t.IN("_stage", ""),
		bgfx_dynamic_index_buffer_handle_t.IN("_handle", ""),
		bgfx_access_t.IN("_access", "", Access)
	)

	void(
		"set_compute_dynamic_vertex_buffer",
		"""
		""",

		MapToInt..uint8_t.IN("_stage", ""),
		bgfx_dynamic_vertex_buffer_handle_t.IN("_handle", ""),
		bgfx_access_t.IN("_access", "", Access)
	)

	void(
		"set_compute_indirect_buffer",
		"""
		""",

		MapToInt..uint8_t.IN("_stage", ""),
		bgfx_indirect_buffer_handle_t.IN("_handle", ""),
		bgfx_access_t.IN("_access", "", Access)
	)

	uint32_t(
		"dispatch",
		"""
		""",

		MapToInt..uint8_t.IN("_id", ""),
		bgfx_program_handle_t.IN("_handle", ""),
		MapToInt..uint16_t.IN("_numX", ""),
		MapToInt..uint16_t.IN("_numY", ""),
		MapToInt..uint16_t.IN("_numZ", ""),
		MapToInt..uint8_t.IN("_flags", "")
	)

	uint32_t(
		"dispatch_indirect",
		"""
		""",

		MapToInt..uint8_t.IN("_id", ""),
		bgfx_program_handle_t.IN("_handle", ""),
		bgfx_indirect_buffer_handle_t.IN("_indirectHandle", ""),
		MapToInt..uint16_t.IN("_start", ""),
		MapToInt..uint16_t.IN("_num", ""),
		MapToInt..uint8_t.IN("_flags", "")
	)

	void(
		"discard",
		"""
		"""
	)

	void(
		"blit",
		"""
		""",

		MapToInt..uint8_t.IN("_id", ""),
		bgfx_texture_handle_t.IN("_dst", ""),
		MapToInt..uint8_t.IN("_dstMip", ""),
		MapToInt..uint16_t.IN("_dstX", ""),
		MapToInt..uint16_t.IN("_dstY", ""),
		MapToInt..uint16_t.IN("_dstZ", ""),
		bgfx_texture_handle_t.IN("_src", ""),
		MapToInt..uint8_t.IN("_srcMip", ""),
		MapToInt..uint16_t.IN("_srcX", ""),
		MapToInt..uint16_t.IN("_srcY", ""),
		MapToInt..uint16_t.IN("_srcZ", ""),
		MapToInt..uint16_t.IN("_width", ""),
		MapToInt..uint16_t.IN("_height", ""),
		MapToInt..uint16_t.IN("_depth", "")
	)

	void(
		"blit_frame_buffer",
		"""
		""",

		MapToInt..uint8_t.IN("_id", ""),
		bgfx_texture_handle_t.IN("_dst", ""),
		MapToInt..uint8_t.IN("_dstMip", ""),
		MapToInt..uint16_t.IN("_dstX", ""),
		MapToInt..uint16_t.IN("_dstY", ""),
		MapToInt..uint16_t.IN("_dstZ", ""),
		bgfx_frame_buffer_handle_t.IN("_src", ""),
		MapToInt..uint8_t.IN("_attachment", ""),
		MapToInt..uint8_t.IN("_srcMip", ""),
		MapToInt..uint16_t.IN("_srcX", ""),
		MapToInt..uint16_t.IN("_srcY", ""),
		MapToInt..uint16_t.IN("_srcZ", ""),
		MapToInt..uint16_t.IN("_width", ""),
		MapToInt..uint16_t.IN("_height", ""),
		MapToInt..uint16_t.IN("_depth", "")
	)

	void(
		"save_screen_shot",
		"""
		""",

		const..charUTF8_p.IN("_filePath", "")
	)

	void(
		"set_platform_data",
		"""
		""",

		const..bgfx_platform_data_t.IN("_data", "")
	)
}