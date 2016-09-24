/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.bgfx.templates

import org.lwjgl.bgfx.*
import org.lwjgl.generator.*

val BGFX = "BGFX".nativeClass(packageName = BGFX_PACKAGE, prefixMethod = "bgfx_", binding = BGFX_BINDING) {
	documentation =
		"""
		Native bindings to the bgfx library.
		"""

	IntConstant(
		"API version",

		"BGFX_API_VERSION".."20"
	)

	LongConstant(
		"State",

		"BGFX_STATE_RGB_WRITE".."0x0000000000000001L",
		"BGFX_STATE_ALPHA_WRITE".."0x0000000000000002L",
		"BGFX_STATE_DEPTH_WRITE".."0x0000000000000004L",

		"BGFX_STATE_DEPTH_TEST_LESS".."0x0000000000000010L",
		"BGFX_STATE_DEPTH_TEST_LEQUAL".."0x0000000000000020L",
		"BGFX_STATE_DEPTH_TEST_EQUAL".."0x0000000000000030L",
		"BGFX_STATE_DEPTH_TEST_GEQUAL".."0x0000000000000040L",
		"BGFX_STATE_DEPTH_TEST_GREATER".."0x0000000000000050L",
		"BGFX_STATE_DEPTH_TEST_NOTEQUAL".."0x0000000000000060L",
		"BGFX_STATE_DEPTH_TEST_NEVER".."0x0000000000000070L",
		"BGFX_STATE_DEPTH_TEST_ALWAYS".."0x0000000000000080L",

		"BGFX_STATE_DEPTH_TEST_SHIFT".."4",
		"BGFX_STATE_DEPTH_TEST_MASK".."0x00000000000000f0L",

		"BGFX_STATE_BLEND_ZERO".."0x0000000000001000L",
		"BGFX_STATE_BLEND_ONE".."0x0000000000002000L",
		"BGFX_STATE_BLEND_SRC_COLOR".."0x0000000000003000L",
		"BGFX_STATE_BLEND_INV_SRC_COLOR".."0x0000000000004000L",
		"BGFX_STATE_BLEND_SRC_ALPHA".."0x0000000000005000L",
		"BGFX_STATE_BLEND_INV_SRC_ALPHA".."0x0000000000006000L",
		"BGFX_STATE_BLEND_DST_ALPHA".."0x0000000000007000L",
		"BGFX_STATE_BLEND_INV_DST_ALPHA".."0x0000000000008000L",
		"BGFX_STATE_BLEND_DST_COLOR".."0x0000000000009000L",
		"BGFX_STATE_BLEND_INV_DST_COLOR".."0x000000000000a000L",
		"BGFX_STATE_BLEND_SRC_ALPHA_SAT".."0x000000000000b000L",
		"BGFX_STATE_BLEND_FACTOR".."0x000000000000c000L",
		"BGFX_STATE_BLEND_INV_FACTOR".."0x000000000000d000L",
		"BGFX_STATE_BLEND_SHIFT".."12",
		"BGFX_STATE_BLEND_MASK".."0x000000000ffff000L",

		"BGFX_STATE_BLEND_EQUATION_ADD".."0x0000000000000000L",
		"BGFX_STATE_BLEND_EQUATION_SUB".."0x0000000010000000L",
		"BGFX_STATE_BLEND_EQUATION_REVSUB".."0x0000000020000000L",
		"BGFX_STATE_BLEND_EQUATION_MIN".."0x0000000030000000L",
		"BGFX_STATE_BLEND_EQUATION_MAX".."0x0000000040000000L",
		"BGFX_STATE_BLEND_EQUATION_SHIFT".."28",
		"BGFX_STATE_BLEND_EQUATION_MASK".."0x00000003f0000000L",

		"BGFX_STATE_BLEND_INDEPENDENT".."0x0000000400000000L",
		"BGFX_STATE_BLEND_ALPHA_TO_COVERAGE".."0x0000000800000000L",

		"BGFX_STATE_CULL_CW".."0x0000001000000000L",
		"BGFX_STATE_CULL_CCW".."0x0000002000000000L",
		"BGFX_STATE_CULL_SHIFT".."36",
		"BGFX_STATE_CULL_MASK".."0x0000003000000000L",

		"BGFX_STATE_ALPHA_REF_SHIFT".."40",
		"BGFX_STATE_ALPHA_REF_MASK".."0x0000ff0000000000L",

		"BGFX_STATE_PT_TRISTRIP".."0x0001000000000000L",
		"BGFX_STATE_PT_LINES".."0x0002000000000000L",
		"BGFX_STATE_PT_LINESTRIP".."0x0003000000000000L",
		"BGFX_STATE_PT_POINTS".."0x0004000000000000L",
		"BGFX_STATE_PT_SHIFT".."48",
		"BGFX_STATE_PT_MASK".."0x0007000000000000L",

		"BGFX_STATE_POINT_SIZE_SHIFT".."52",
		"BGFX_STATE_POINT_SIZE_MASK".."0x00f0000000000000L",

		"BGFX_STATE_MSAA".."0x0100000000000000L",
		"BGFX_STATE_LINEAA".."0x0200000000000000L",
		"BGFX_STATE_CONSERVATIVE_RASTER".."0x0400000000000000L",

		"BGFX_STATE_RESERVED_SHIFT".."61",
		"BGFX_STATE_RESERVED_MASK".."0xe000000000000000L",

		"BGFX_STATE_NONE".."0x0000000000000000L",
		"BGFX_STATE_MASK".."0xffffffffffffffffL",

		"BGFX_STATE_DEFAULT".."""(0
		| BGFX_STATE_RGB_WRITE
		| BGFX_STATE_ALPHA_WRITE
		| BGFX_STATE_DEPTH_TEST_LESS
		| BGFX_STATE_DEPTH_WRITE
		| BGFX_STATE_CULL_CW
		| BGFX_STATE_MSAA)
		"""
	)

	IntConstant(
		"Stencil",
		
		"BGFX_STENCIL_FUNC_REF_SHIFT".."0",
		"BGFX_STENCIL_FUNC_REF_MASK".."0x000000ff",
		"BGFX_STENCIL_FUNC_RMASK_SHIFT".."8",
		"BGFX_STENCIL_FUNC_RMASK_MASK".."0x0000ff00",

		"BGFX_STENCIL_TEST_LESS".."0x00010000",
		"BGFX_STENCIL_TEST_LEQUAL".."0x00020000",
		"BGFX_STENCIL_TEST_EQUAL".."0x00030000",
		"BGFX_STENCIL_TEST_GEQUAL".."0x00040000",
		"BGFX_STENCIL_TEST_GREATER".."0x00050000",
		"BGFX_STENCIL_TEST_NOTEQUAL".."0x00060000",
		"BGFX_STENCIL_TEST_NEVER".."0x00070000",
		"BGFX_STENCIL_TEST_ALWAYS".."0x00080000",
		"BGFX_STENCIL_TEST_SHIFT".."16",
		"BGFX_STENCIL_TEST_MASK".."0x000f0000",

		"BGFX_STENCIL_OP_FAIL_S_ZERO".."0x00000000",
		"BGFX_STENCIL_OP_FAIL_S_KEEP".."0x00100000",
		"BGFX_STENCIL_OP_FAIL_S_REPLACE".."0x00200000",
		"BGFX_STENCIL_OP_FAIL_S_INCR".."0x00300000",
		"BGFX_STENCIL_OP_FAIL_S_INCRSAT".."0x00400000",
		"BGFX_STENCIL_OP_FAIL_S_DECR".."0x00500000",
		"BGFX_STENCIL_OP_FAIL_S_DECRSAT".."0x00600000",
		"BGFX_STENCIL_OP_FAIL_S_INVERT".."0x00700000",
		"BGFX_STENCIL_OP_FAIL_S_SHIFT".."20",
		"BGFX_STENCIL_OP_FAIL_S_MASK".."0x00f00000",
	
		"BGFX_STENCIL_OP_FAIL_Z_ZERO".."0x00000000",
		"BGFX_STENCIL_OP_FAIL_Z_KEEP".."0x01000000",
		"BGFX_STENCIL_OP_FAIL_Z_REPLACE".."0x02000000",
		"BGFX_STENCIL_OP_FAIL_Z_INCR".."0x03000000",
		"BGFX_STENCIL_OP_FAIL_Z_INCRSAT".."0x04000000",
		"BGFX_STENCIL_OP_FAIL_Z_DECR".."0x05000000",
		"BGFX_STENCIL_OP_FAIL_Z_DECRSAT".."0x06000000",
		"BGFX_STENCIL_OP_FAIL_Z_INVERT".."0x07000000",
		"BGFX_STENCIL_OP_FAIL_Z_SHIFT".."24",
		"BGFX_STENCIL_OP_FAIL_Z_MASK".."0x0f000000",
	
		"BGFX_STENCIL_OP_PASS_Z_ZERO".."0x00000000",
		"BGFX_STENCIL_OP_PASS_Z_KEEP".."0x10000000",
		"BGFX_STENCIL_OP_PASS_Z_REPLACE".."0x20000000",
		"BGFX_STENCIL_OP_PASS_Z_INCR".."0x30000000",
		"BGFX_STENCIL_OP_PASS_Z_INCRSAT".."0x40000000",
		"BGFX_STENCIL_OP_PASS_Z_DECR".."0x50000000",
		"BGFX_STENCIL_OP_PASS_Z_DECRSAT".."0x60000000",
		"BGFX_STENCIL_OP_PASS_Z_INVERT".."0x70000000",
		"BGFX_STENCIL_OP_PASS_Z_SHIFT".."28",
		"BGFX_STENCIL_OP_PASS_Z_MASK".."0xf0000000",
	
		"BGFX_STENCIL_NONE".."0x00000000",
		"BGFX_STENCIL_MASK".."0xffffffff",
		"BGFX_STENCIL_DEFAULT".."0x00000000"

	)

	ShortConstant(
		"Clear",

		"BGFX_CLEAR_NONE".."0x0000",
		"BGFX_CLEAR_COLOR".."0x0001",
		"BGFX_CLEAR_DEPTH".."0x0002",
		"BGFX_CLEAR_STENCIL".."0x0004",
		"BGFX_CLEAR_DISCARD_COLOR_0".."0x0008",
		"BGFX_CLEAR_DISCARD_COLOR_1".."0x0010",
		"BGFX_CLEAR_DISCARD_COLOR_2".."0x0020",
		"BGFX_CLEAR_DISCARD_COLOR_3".."0x0040",
		"BGFX_CLEAR_DISCARD_COLOR_4".."0x0080",
		"BGFX_CLEAR_DISCARD_COLOR_5".."0x0100",
		"BGFX_CLEAR_DISCARD_COLOR_6".."0x0200",
		"BGFX_CLEAR_DISCARD_COLOR_7".."0x0400",
		"BGFX_CLEAR_DISCARD_DEPTH".."0x0800",
		"BGFX_CLEAR_DISCARD_STENCIL".."0x1000",

		"BGFX_CLEAR_DISCARD_COLOR_MASK".."""(0
		| BGFX_CLEAR_DISCARD_COLOR_0
		| BGFX_CLEAR_DISCARD_COLOR_1
		| BGFX_CLEAR_DISCARD_COLOR_2
		| BGFX_CLEAR_DISCARD_COLOR_3
		| BGFX_CLEAR_DISCARD_COLOR_4
		| BGFX_CLEAR_DISCARD_COLOR_5
		| BGFX_CLEAR_DISCARD_COLOR_6
		| BGFX_CLEAR_DISCARD_COLOR_7)
		""",
		
		"BGFX_CLEAR_DISCARD_MASK".."""(0
		| BGFX_CLEAR_DISCARD_COLOR_MASK
		| BGFX_CLEAR_DISCARD_DEPTH
		| BGFX_CLEAR_DISCARD_STENCIL)
		"""
	)

	IntConstant(
		"Debug",

		"BGFX_DEBUG_NONE".."0x00000000",
		"BGFX_DEBUG_WIREFRAME".."0x00000001",
		"BGFX_DEBUG_IFH".."0x00000002",
		"BGFX_DEBUG_STATS".."0x00000004",
		"BGFX_DEBUG_TEXT".."0x00000008"
	)

	ShortConstant(
		"Buffer",

		"BGFX_BUFFER_NONE".."0x0000",

		"BGFX_BUFFER_COMPUTE_FORMAT_8x1".."0x0001",
		"BGFX_BUFFER_COMPUTE_FORMAT_8x2".."0x0002",
		"BGFX_BUFFER_COMPUTE_FORMAT_8x4".."0x0003",
		"BGFX_BUFFER_COMPUTE_FORMAT_16x1".."0x0004",
		"BGFX_BUFFER_COMPUTE_FORMAT_16x2".."0x0005",
		"BGFX_BUFFER_COMPUTE_FORMAT_16x4".."0x0006",
		"BGFX_BUFFER_COMPUTE_FORMAT_32x1".."0x0007",
		"BGFX_BUFFER_COMPUTE_FORMAT_32x2".."0x0008",
		"BGFX_BUFFER_COMPUTE_FORMAT_32x4".."0x0009",
		"BGFX_BUFFER_COMPUTE_FORMAT_SHIFT".."0",
		"BGFX_BUFFER_COMPUTE_FORMAT_MASK".."0x000f",

		"BGFX_BUFFER_COMPUTE_TYPE_UINT".."0x0010",
		"BGFX_BUFFER_COMPUTE_TYPE_INT".."0x0020",
		"BGFX_BUFFER_COMPUTE_TYPE_FLOAT".."0x0030",
		"BGFX_BUFFER_COMPUTE_TYPE_SHIFT".."4",
		"BGFX_BUFFER_COMPUTE_TYPE_MASK".."0x0030",

		"BGFX_BUFFER_COMPUTE_READ".."0x0100",
		"BGFX_BUFFER_COMPUTE_WRITE".."0x0200",
		"BGFX_BUFFER_DRAW_INDIRECT".."0x0400",
		"BGFX_BUFFER_ALLOW_RESIZE".."0x0800",
		"BGFX_BUFFER_INDEX32".."0x1000",

		"BGFX_BUFFER_COMPUTE_READ_WRITE".."""(0
		| BGFX_BUFFER_COMPUTE_READ
		| BGFX_BUFFER_COMPUTE_WRITE)
		"""
	)

	IntConstant(
		"Texture",

		"BGFX_TEXTURE_NONE".."0x00000000",
		"BGFX_TEXTURE_U_MIRROR".."0x00000001",
		"BGFX_TEXTURE_U_CLAMP".."0x00000002",
		"BGFX_TEXTURE_U_BORDER".."0x00000003",
		"BGFX_TEXTURE_U_SHIFT".."0",
		"BGFX_TEXTURE_U_MASK".."0x00000003",
		"BGFX_TEXTURE_V_MIRROR".."0x00000004",
		"BGFX_TEXTURE_V_CLAMP".."0x00000008",
		"BGFX_TEXTURE_V_BORDER".."0x0000000c",
		"BGFX_TEXTURE_V_SHIFT".."2",
		"BGFX_TEXTURE_V_MASK".."0x0000000c",
		"BGFX_TEXTURE_W_MIRROR".."0x00000010",
		"BGFX_TEXTURE_W_CLAMP".."0x00000020",
		"BGFX_TEXTURE_W_BORDER".."0x00000030",
		"BGFX_TEXTURE_W_SHIFT".."4",
		"BGFX_TEXTURE_W_MASK".."0x00000030",
		"BGFX_TEXTURE_MIN_POINT".."0x00000040",
		"BGFX_TEXTURE_MIN_ANISOTROPIC".."0x00000080",
		"BGFX_TEXTURE_MIN_SHIFT".."6",
		"BGFX_TEXTURE_MIN_MASK".."0x000000c0",
		"BGFX_TEXTURE_MAG_POINT".."0x00000100",
		"BGFX_TEXTURE_MAG_ANISOTROPIC".."0x00000200",
		"BGFX_TEXTURE_MAG_SHIFT".."8",
		"BGFX_TEXTURE_MAG_MASK".."0x00000300",
		"BGFX_TEXTURE_MIP_POINT".."0x00000400",
		"BGFX_TEXTURE_MIP_SHIFT".."10",
		"BGFX_TEXTURE_MIP_MASK".."0x00000400",
		"BGFX_TEXTURE_MSAA_SAMPLE".."0x00000800",
		"BGFX_TEXTURE_RT".."0x00001000",
		"BGFX_TEXTURE_RT_MSAA_X2".."0x00002000",
		"BGFX_TEXTURE_RT_MSAA_X4".."0x00003000",
		"BGFX_TEXTURE_RT_MSAA_X8".."0x00004000",
		"BGFX_TEXTURE_RT_MSAA_X16".."0x00005000",
		"BGFX_TEXTURE_RT_MSAA_SHIFT".."12",
		"BGFX_TEXTURE_RT_MSAA_MASK".."0x00007000",
		"BGFX_TEXTURE_RT_WRITE_ONLY".."0x00008000",
		"BGFX_TEXTURE_RT_MASK".."0x0000f000",
		"BGFX_TEXTURE_COMPARE_LESS".."0x00010000",
		"BGFX_TEXTURE_COMPARE_LEQUAL".."0x00020000",
		"BGFX_TEXTURE_COMPARE_EQUAL".."0x00030000",
		"BGFX_TEXTURE_COMPARE_GEQUAL".."0x00040000",
		"BGFX_TEXTURE_COMPARE_GREATER".."0x00050000",
		"BGFX_TEXTURE_COMPARE_NOTEQUAL".."0x00060000",
		"BGFX_TEXTURE_COMPARE_NEVER".."0x00070000",
		"BGFX_TEXTURE_COMPARE_ALWAYS".."0x00080000",
		"BGFX_TEXTURE_COMPARE_SHIFT".."16",
		"BGFX_TEXTURE_COMPARE_MASK".."0x000f0000",
		"BGFX_TEXTURE_COMPUTE_WRITE".."0x00100000",
		"BGFX_TEXTURE_SRGB".."0x00200000",
		"BGFX_TEXTURE_BLIT_DST".."0x00400000",
		"BGFX_TEXTURE_READ_BACK".."0x00800000",
		"BGFX_TEXTURE_BORDER_COLOR_SHIFT".."24",
		"BGFX_TEXTURE_BORDER_COLOR_MASK".."0x0f000000",
		"BGFX_TEXTURE_RESERVED_SHIFT".."28",
		"BGFX_TEXTURE_RESERVED_MASK".."0xf0000000",

		"BGFX_TEXTURE_SAMPLER_BITS_MASK".."""(0
		| BGFX_TEXTURE_U_MASK
		| BGFX_TEXTURE_V_MASK
		| BGFX_TEXTURE_W_MASK
		| BGFX_TEXTURE_MIN_MASK
		| BGFX_TEXTURE_MAG_MASK
		| BGFX_TEXTURE_MIP_MASK
		| BGFX_TEXTURE_COMPARE_MASK)
		"""
	)

	IntConstant(
		"Reset",

		"BGFX_RESET_NONE".."0x00000000",
		"BGFX_RESET_FULLSCREEN".."0x00000001",
		"BGFX_RESET_FULLSCREEN_SHIFT".."0",
		"BGFX_RESET_FULLSCREEN_MASK".."0x00000001",
		"BGFX_RESET_MSAA_X2".."0x00000010",
		"BGFX_RESET_MSAA_X4".."0x00000020",
		"BGFX_RESET_MSAA_X8".."0x00000030",
		"BGFX_RESET_MSAA_X16".."0x00000040",
		"BGFX_RESET_MSAA_SHIFT".."4",
		"BGFX_RESET_MSAA_MASK".."0x00000070",
		"BGFX_RESET_VSYNC".."0x00000080",
		"BGFX_RESET_MAXANISOTROPY".."0x00000100",
		"BGFX_RESET_CAPTURE".."0x00000200",
		"BGFX_RESET_HMD".."0x00000400",
		"BGFX_RESET_HMD_DEBUG".."0x00000800",
		"BGFX_RESET_HMD_RECENTER".."0x00001000",
		"BGFX_RESET_FLUSH_AFTER_RENDER".."0x00002000",
		"BGFX_RESET_FLIP_AFTER_RENDER".."0x00004000",
		"BGFX_RESET_SRGB_BACKBUFFER".."0x00008000",
		"BGFX_RESET_HIDPI".."0x00010000",
		"BGFX_RESET_DEPTH_CLAMP".."0x00020000",
		"BGFX_RESET_SUSPEND".."0x00040000",

		"BGFX_RESET_RESERVED_SHIFT".."31",
		"BGFX_RESET_RESERVED_MASK".."0x80000000"
	)

	LongConstant(
		"Caps",

		"BGFX_CAPS_TEXTURE_COMPARE_LEQUAL".."0x0000000000000001L",
		"BGFX_CAPS_TEXTURE_COMPARE_ALL".."0x0000000000000003L",
		"BGFX_CAPS_TEXTURE_3D".."0x0000000000000004L",
		"BGFX_CAPS_VERTEX_ATTRIB_HALF".."0x0000000000000008L",
		"BGFX_CAPS_VERTEX_ATTRIB_UINT10".."0x0000000000000010L",
		"BGFX_CAPS_INSTANCING".."0x0000000000000020L",
		"BGFX_CAPS_RENDERER_MULTITHREADED".."0x0000000000000040L",
		"BGFX_CAPS_FRAGMENT_DEPTH".."0x0000000000000080L",
		"BGFX_CAPS_BLEND_INDEPENDENT".."0x0000000000000100L",
		"BGFX_CAPS_COMPUTE".."0x0000000000000200L",
		"BGFX_CAPS_FRAGMENT_ORDERING".."0x0000000000000400L",
		"BGFX_CAPS_SWAP_CHAIN".."0x0000000000000800L",
		"BGFX_CAPS_HMD".."0x0000000000001000L",
		"BGFX_CAPS_INDEX32".."0x0000000000002000L",
		"BGFX_CAPS_DRAW_INDIRECT".."0x0000000000004000L",
		"BGFX_CAPS_HIDPI".."0x0000000000008000L",
		"BGFX_CAPS_TEXTURE_BLIT".."0x0000000000010000L",
		"BGFX_CAPS_TEXTURE_READ_BACK".."0x0000000000020000L",
		"BGFX_CAPS_OCCLUSION_QUERY".."0x0000000000040000L",
		"BGFX_CAPS_ALPHA_TO_COVERAGE".."0x0000000000080000L",
		"BGFX_CAPS_CONSERVATIVE_RASTER".."0x0000000000100000L",
		"BGFX_CAPS_TEXTURE_2D_ARRAY".."0x0000000000200000L",
		"BGFX_CAPS_TEXTURE_CUBE_ARRAY".."0x0000000000400000L"
	)

	ShortConstant(
		"Format caps",

		"BGFX_CAPS_FORMAT_TEXTURE_NONE".."0x0000",
		"BGFX_CAPS_FORMAT_TEXTURE_2D".."0x0001",
		"BGFX_CAPS_FORMAT_TEXTURE_2D_SRGB".."0x0002",
		"BGFX_CAPS_FORMAT_TEXTURE_2D_EMULATED".."0x0004",
		"BGFX_CAPS_FORMAT_TEXTURE_3D".."0x0008",
		"BGFX_CAPS_FORMAT_TEXTURE_3D_SRGB".."0x0010",
		"BGFX_CAPS_FORMAT_TEXTURE_3D_EMULATED".."0x0020",
		"BGFX_CAPS_FORMAT_TEXTURE_CUBE".."0x0040",
		"BGFX_CAPS_FORMAT_TEXTURE_CUBE_SRGB".."0x0080",
		"BGFX_CAPS_FORMAT_TEXTURE_CUBE_EMULATED".."0x0100",
		"BGFX_CAPS_FORMAT_TEXTURE_VERTEX".."0x0200",
		"BGFX_CAPS_FORMAT_TEXTURE_IMAGE".."0x0400",
		"BGFX_CAPS_FORMAT_TEXTURE_FRAMEBUFFER".."0x0800",
		"BGFX_CAPS_FORMAT_TEXTURE_FRAMEBUFFER_MSAA".."0x1000",
		"BGFX_CAPS_FORMAT_TEXTURE_MSAA".."0x2000",
		"BGFX_CAPS_FORMAT_TEXTURE_MIP_AUTOGEN".."0x4000"
	)

	ByteConstant(
		"View",

		"BGFX_VIEW_NONE".."0x00",
		"BGFX_VIEW_STEREO".."0x01"
	)

	ByteConstant(
		"Submit",

		"BGFX_SUBMIT_EYE_LEFT".."0x01",
		"BGFX_SUBMIT_EYE_RIGHT".."0x02",
		"BGFX_SUBMIT_EYE_MASK".."0x03",
		"BGFX_SUBMIT_EYE_FIRST".."BGFX_SUBMIT_EYE_LEFT",

		"BGFX_SUBMIT_RESERVED_SHIFT".."7",
		"BGFX_SUBMIT_RESERVED_MASK".."(byte) 0x80"
	)

	ShortConstant(
		"PCI",

		"BGFX_PCI_ID_NONE".."0x0000",
		"BGFX_PCI_ID_SOFTWARE_RASTERIZER".."0x0001",
		"BGFX_PCI_ID_AMD".."0x1002",
		"BGFX_PCI_ID_INTEL".."(short) 0x8086",
		"BGFX_PCI_ID_NVIDIA".."0x10de"
	)

	ByteConstant(
		"HMD",

		"BGFX_HMD_NONE".."0x00",
		"BGFX_HMD_DEVICE_RESOLUTION".."0x01",
		"BGFX_HMD_RENDERING".."0x02"
	)

	ByteConstant(
		"Cubemap",

		"BGFX_CUBE_MAP_POSITIVE_X".."0x00",
		"BGFX_CUBE_MAP_NEGATIVE_X".."0x01",
		"BGFX_CUBE_MAP_POSITIVE_Y".."0x02",
		"BGFX_CUBE_MAP_NEGATIVE_Y".."0x03",
		"BGFX_CUBE_MAP_POSITIVE_Z".."0x04",
		"BGFX_CUBE_MAP_NEGATIVE_Z".."0x05"
	)

	val RendererType = EnumConstant(
		"Renderer type. ({@code bgfx_renderer_type_t})",

		"BGFX_RENDERER_TYPE_NULL".enum,
		"BGFX_RENDERER_TYPE_DIRECT3D9".enum,
		"BGFX_RENDERER_TYPE_DIRECT3D11".enum,
		"BGFX_RENDERER_TYPE_DIRECT3D12".enum,
		"BGFX_RENDERER_TYPE_METAL".enum,
		"BGFX_RENDERER_TYPE_OPENGLES".enum,
		"BGFX_RENDERER_TYPE_OPENGL".enum,
		"BGFX_RENDERER_TYPE_VULKAN".enum,

		"BGFX_RENDERER_TYPE_COUNT".enum
	).javaDocLinks

	val Access = EnumConstant(
		"bgfx_access_t",

		"BGFX_ACCESS_READ".enum,
		"BGFX_ACCESS_WRITE".enum,
		"BGFX_ACCESS_READWRITE".enum,

		"BGFX_ACCESS_COUNT".enum
	).javaDocLinks

	val Attrib = EnumConstant(
		"bgfx_attrib_t",

		"BGFX_ATTRIB_POSITION".enum,
		"BGFX_ATTRIB_NORMAL".enum,
		"BGFX_ATTRIB_TANGENT".enum,
		"BGFX_ATTRIB_BITANGENT".enum,
		"BGFX_ATTRIB_COLOR0".enum,
		"BGFX_ATTRIB_COLOR1".enum,
		"BGFX_ATTRIB_INDICES".enum,
		"BGFX_ATTRIB_WEIGHT".enum,
		"BGFX_ATTRIB_TEXCOORD0".enum,
		"BGFX_ATTRIB_TEXCOORD1".enum,
		"BGFX_ATTRIB_TEXCOORD2".enum,
		"BGFX_ATTRIB_TEXCOORD3".enum,
		"BGFX_ATTRIB_TEXCOORD4".enum,
		"BGFX_ATTRIB_TEXCOORD5".enum,
		"BGFX_ATTRIB_TEXCOORD6".enum,
		"BGFX_ATTRIB_TEXCOORD7".enum,

		"BGFX_ATTRIB_COUNT".enum
	).javaDocLinks

	val AttribType = EnumConstant(
		"bgfx_attrib_type_t",

		"BGFX_ATTRIB_TYPE_UINT8".enum,
		"BGFX_ATTRIB_TYPE_UINT10".enum,
		"BGFX_ATTRIB_TYPE_INT16".enum,
		"BGFX_ATTRIB_TYPE_HALF".enum,
		"BGFX_ATTRIB_TYPE_FLOAT".enum,

		"BGFX_ATTRIB_TYPE_COUNT".enum
	).javaDocLinks
	
	val TextureFormat = EnumConstant(
		"bgfx_texture_format_t",

		"BGFX_TEXTURE_FORMAT_BC1".enum,
		"BGFX_TEXTURE_FORMAT_BC2".enum,
		"BGFX_TEXTURE_FORMAT_BC3".enum,
		"BGFX_TEXTURE_FORMAT_BC4".enum,
		"BGFX_TEXTURE_FORMAT_BC5".enum,
		"BGFX_TEXTURE_FORMAT_BC6H".enum,
		"BGFX_TEXTURE_FORMAT_BC7".enum,
		"BGFX_TEXTURE_FORMAT_ETC1".enum,
		"BGFX_TEXTURE_FORMAT_ETC2".enum,
		"BGFX_TEXTURE_FORMAT_ETC2A".enum,
		"BGFX_TEXTURE_FORMAT_ETC2A1".enum,
		"BGFX_TEXTURE_FORMAT_PTC12".enum,
		"BGFX_TEXTURE_FORMAT_PTC14".enum,
		"BGFX_TEXTURE_FORMAT_PTC12A".enum,
		"BGFX_TEXTURE_FORMAT_PTC14A".enum,
		"BGFX_TEXTURE_FORMAT_PTC22".enum,
		"BGFX_TEXTURE_FORMAT_PTC24".enum,

		"BGFX_TEXTURE_FORMAT_UNKNOWN".enum,

		"BGFX_TEXTURE_FORMAT_R1".enum,
		"BGFX_TEXTURE_FORMAT_A8".enum,
		"BGFX_TEXTURE_FORMAT_R8".enum,
		"BGFX_TEXTURE_FORMAT_R8I".enum,
		"BGFX_TEXTURE_FORMAT_R8U".enum,
		"BGFX_TEXTURE_FORMAT_R8S".enum,
		"BGFX_TEXTURE_FORMAT_R16".enum,
		"BGFX_TEXTURE_FORMAT_R16I".enum,
		"BGFX_TEXTURE_FORMAT_R16U".enum,
		"BGFX_TEXTURE_FORMAT_R16F".enum,
		"BGFX_TEXTURE_FORMAT_R16S".enum,
		"BGFX_TEXTURE_FORMAT_R32I".enum,
		"BGFX_TEXTURE_FORMAT_R32U".enum,
		"BGFX_TEXTURE_FORMAT_R32F".enum,
		"BGFX_TEXTURE_FORMAT_RG8".enum,
		"BGFX_TEXTURE_FORMAT_RG8I".enum,
		"BGFX_TEXTURE_FORMAT_RG8U".enum,
		"BGFX_TEXTURE_FORMAT_RG8S".enum,
		"BGFX_TEXTURE_FORMAT_RG16".enum,
		"BGFX_TEXTURE_FORMAT_RG16I".enum,
		"BGFX_TEXTURE_FORMAT_RG16U".enum,
		"BGFX_TEXTURE_FORMAT_RG16F".enum,
		"BGFX_TEXTURE_FORMAT_RG16S".enum,
		"BGFX_TEXTURE_FORMAT_RG32I".enum,
		"BGFX_TEXTURE_FORMAT_RG32U".enum,
		"BGFX_TEXTURE_FORMAT_RG32F".enum,
		"BGFX_TEXTURE_FORMAT_RGB8".enum,
		"BGFX_TEXTURE_FORMAT_RGB8I".enum,
		"BGFX_TEXTURE_FORMAT_RGB8U".enum,
		"BGFX_TEXTURE_FORMAT_RGB8S".enum,
		"BGFX_TEXTURE_FORMAT_RGB9E5F".enum,
		"BGFX_TEXTURE_FORMAT_BGRA8".enum,
		"BGFX_TEXTURE_FORMAT_RGBA8".enum,
		"BGFX_TEXTURE_FORMAT_RGBA8I".enum,
		"BGFX_TEXTURE_FORMAT_RGBA8U".enum,
		"BGFX_TEXTURE_FORMAT_RGBA8S".enum,
		"BGFX_TEXTURE_FORMAT_RGBA16".enum,
		"BGFX_TEXTURE_FORMAT_RGBA16I".enum,
		"BGFX_TEXTURE_FORMAT_RGBA16U".enum,
		"BGFX_TEXTURE_FORMAT_RGBA16F".enum,
		"BGFX_TEXTURE_FORMAT_RGBA16S".enum,
		"BGFX_TEXTURE_FORMAT_RGBA32I".enum,
		"BGFX_TEXTURE_FORMAT_RGBA32U".enum,
		"BGFX_TEXTURE_FORMAT_RGBA32F".enum,
		"BGFX_TEXTURE_FORMAT_R5G6B5".enum,
		"BGFX_TEXTURE_FORMAT_RGBA4".enum,
		"BGFX_TEXTURE_FORMAT_RGB5A1".enum,
		"BGFX_TEXTURE_FORMAT_RGB10A2".enum,
		"BGFX_TEXTURE_FORMAT_R11G11B10F".enum,

		"BGFX_TEXTURE_FORMAT_UNKNOWN_DEPTH".enum,

		"BGFX_TEXTURE_FORMAT_D16".enum,
		"BGFX_TEXTURE_FORMAT_D24".enum,
		"BGFX_TEXTURE_FORMAT_D24S8".enum,
		"BGFX_TEXTURE_FORMAT_D32".enum,
		"BGFX_TEXTURE_FORMAT_D16F".enum,
		"BGFX_TEXTURE_FORMAT_D24F".enum,
		"BGFX_TEXTURE_FORMAT_D32F".enum,
		"BGFX_TEXTURE_FORMAT_D0S8".enum,

		"BGFX_TEXTURE_FORMAT_COUNT".enum // TODO: Update bgfx_caps_t.formats size if this changes
	).javaDocLinks

	val UniformType = EnumConstant(
		"bgfx_uniform_type_t",

		"BGFX_UNIFORM_TYPE_INT1".enum,
		"BGFX_UNIFORM_TYPE_END".enum,

		"BGFX_UNIFORM_TYPE_VEC4".enum,
		"BGFX_UNIFORM_TYPE_MAT3".enum,
		"BGFX_UNIFORM_TYPE_MAT4".enum,

		"BGFX_UNIFORM_TYPE_COUNT".enum
	).javaDocLinks

	val BackbufferRatio = EnumConstant(
		"bgfx_backbuffer_ratio_t",

		"BGFX_BACKBUFFER_RATIO_EQUAL".enum,
		"BGFX_BACKBUFFER_RATIO_HALF".enum,
		"BGFX_BACKBUFFER_RATIO_QUARTER".enum,
		"BGFX_BACKBUFFER_RATIO_EIGHTH".enum,
		"BGFX_BACKBUFFER_RATIO_SIXTEENTH".enum,
		"BGFX_BACKBUFFER_RATIO_DOUBLE".enum,

		"BGFX_BACKBUFFER_RATIO_COUNT".enum
	).javaDocLinks

	/*val OcclusionQueryResult =*/ EnumConstant(
		"bgfx_occlusion_query_result_t",
		
		"BGFX_OCCLUSION_QUERY_RESULT_INVISIBLE".enum,
		"BGFX_OCCLUSION_QUERY_RESULT_VISIBLE".enum,
		"BGFX_OCCLUSION_QUERY_RESULT_NORESULT".enum,

		"BGFX_OCCLUSION_QUERY_RESULT_COUNT".enum
	).javaDocLinks

	val TopologyConvert = EnumConstant(
		"bgfx_topology_convert_t",
	
		"BGFX_TOPOLOGY_CONVERT_TRI_LIST_FLIP_WINDING".enum,
		"BGFX_TOPOLOGY_CONVERT_TRI_LIST_TO_LINE_LIST".enum,
		"BGFX_TOPOLOGY_CONVERT_TRI_STRIP_TO_TRI_LIST".enum,
		"BGFX_TOPOLOGY_CONVERT_LINE_STRIP_TO_LINE_LIST".enum,

		"BGFX_TOPOLOGY_CONVERT_COUNT".enum
	).javaDocLinks

	val TopologySort = EnumConstant(
		"bgfx_topology_sort_t",

		"BGFX_TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_MIN".enum,
		"BGFX_TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_AVG".enum,
		"BGFX_TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_MAX".enum,
		"BGFX_TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_MIN".enum,
		"BGFX_TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_AVG".enum,
		"BGFX_TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_MAX".enum,
		"BGFX_TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_MIN".enum,
		"BGFX_TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_AVG".enum,
		"BGFX_TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_MAX".enum,
		"BGFX_TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_MIN".enum,
		"BGFX_TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_AVG".enum,
		"BGFX_TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_MAX".enum,

		"BGFX_TOPOLOGY_SORT_COUNT".enum
	).javaDocLinks

	/*val Fatal =*/ EnumConstant(
		"bgfx_fatal_t",

		"BGFX_FATAL_DEBUG_CHECK".enum,
		"BGFX_FATAL_MINIMUM_REQUIRED_SPECS".enum,
		"BGFX_FATAL_INVALID_SHADER".enum,
		"BGFX_FATAL_UNABLE_TO_INITIALIZE".enum,
		"BGFX_FATAL_UNABLE_TO_CREATE_TEXTURE".enum,
		"BGFX_FATAL_DEVICE_LOST".enum,

		"BGFX_FATAL_COUNT".enum
	).javaDocLinks

	void(
		"vertex_decl_begin",
		"""
		""",

		bgfx_vertex_decl_t.IN("_decl", ""),
		bgfx_renderer_type_t.IN("_renderer", "")
	)

	void(
		"vertex_decl_add",
		"""
		""",

		bgfx_vertex_decl_t.IN("_decl", ""),
		bgfx_attrib_t.IN("_attrib", "", Attrib),
		MapToInt..uint8_t.IN("_num", ""),
		bgfx_attrib_type_t.IN("_type", "", AttribType),
		bool.IN("_normalized", ""),
		bool.IN("_asInt", "")
	)

	void(
		"vertex_decl_skip",
		"""
		""",

		bgfx_vertex_decl_t.IN("_decl", ""),
		MapToInt..uint8_t.IN("_num", "")
	)

	void(
		"vertex_decl_end",
		"""
		""",

		bgfx_vertex_decl_t.IN("_decl", "")
	)

	void(
		"vertex_pack",
		"""
		""",

		Check(4)..float.const_p.IN("_input", ""),
		bool.IN("_inputNormalized", ""),
		bgfx_attrib_t.IN("_attr", "", Attrib),
		const..bgfx_vertex_decl_t.IN("_decl", ""),
		void_p.IN("_data", ""),
		uint32_t.IN("_index", "")
	)

	void(
		"vertex_unpack",
		"""
		""",

		Check(4)..float.p.OUT("_output", ""),
		bgfx_attrib_t.IN("_attr", "", Attrib),
		const..bgfx_vertex_decl_t.IN("_decl", ""),
		const..void_p.IN("_data", ""),
		uint32_t.IN("_index", "")
	)

	void(
		"vertex_convert",
		"""
		""",

		const..bgfx_vertex_decl_t.IN("_destDecl", ""),
		void_p.IN("_destData", ""),
		const..bgfx_vertex_decl_t.IN("_srcDecl", ""),
		const..void_p.IN("_srcData", ""),
		uint32_t.IN("_num", "")
	)

	uint16_t(
		"weld_vertices",
		"""
		""",

		uint16_t.p.OUT("_output", ""),
		const..bgfx_vertex_decl_t.IN("_decl", ""),
		const..void_p.IN("_data", ""),
		MapToInt..uint16_t.IN("_num", ""),
		float.IN("_epsilon", "")
	)

	uint32_t(
		"topology_convert",
		"""
		""",

		bgfx_topology_convert_t.IN("_conversion", "", TopologyConvert),
		void_p.IN("_dst", ""),
		uint32_t.IN("_dstSize", ""),
		const..void_p.IN("_indices", ""),
		uint32_t.IN("_numIndices", ""),
		bool.IN("_index32", "")
	)

	void(
		"topology_sort_tri_list",
		"""
		""",

		bgfx_topology_sort_t.IN("_sort", "", TopologySort),
		void_p.IN("_dst", ""),
		uint32_t.IN("_dstSize", ""),
		Check(3)..float.const_p.IN("_dir", ""),
		Check(3)..float.const_p.IN("_pos", ""),
		const..void_p.IN("_vertices", ""),
		uint32_t.IN("_stride", ""),
		const..void_p.IN("_indices", ""),
		uint32_t.IN("_numIndices", ""),
		bool.IN("_index32", "")
	)

	void(
		"image_swizzle_bgra8",
		"""
		""",

		uint32_t.IN("_width", ""),
		uint32_t.IN("_height", ""),
		uint32_t.IN("_pitch", ""),
		const..void_p.IN("_src", ""),
		void_p.IN("_dst", "")
	)

	void(
		"image_rgba8_downsample_2x2",
		"""
		""",

		uint32_t.IN("_width", ""),
		uint32_t.IN("_height", ""),
		uint32_t.IN("_pitch", ""),
		const..void_p.IN("_src", ""),
		void_p.IN("_dst", "")
	)

	uint8_t(
		"get_supported_renderers",
		"""
		""",

		Check(8)..bgfx_renderer_type_t.p.IN("_enum", "", RendererType)
	)

	(const..charUTF8.p)(
		"get_renderer_name",
		"""
		""",

		bgfx_renderer_type_t.IN("_type", "", RendererType)
	)

	bool(
		"init",
		"""
		""",

		bgfx_renderer_type_t.IN("_type", "", RendererType),
		MapToInt..uint16_t.IN("_vendorId", ""),
		MapToInt..uint16_t.IN("_deviceId", ""),
		nullable..bgfx_callback_interface_t.IN("_callback", ""),
		nullable..bgfx_allocator_interface_t.IN("_allocator", "")
	)

	void(
		"shutdown",
		"""
		"""
	)

	void(
		"reset",
		"""
		""",

		uint32_t.IN("_width", ""),
		uint32_t.IN("_height", ""),
		uint32_t.IN("_flags", "")
	)

	uint32_t(
		"frame",
		"""
		""",

		bool.IN("_capture", "")
	)

	bgfx_renderer_type_t(
		"get_renderer_type",
		"""
		"""
	)

	(const..bgfx_caps_t)(
		"get_caps",
		"""
		"""
	)

	(const..bgfx_hmd_t)(
		"get_hmd",
		"""
		"""
	)

	(const..bgfx_stats_t)(
		"get_stats",
		"""
		"""
	)

	(const..bgfx_memory_t)(
		"alloc",
		"""
		""",

		uint32_t.IN("_size", "")
	)

	(const..bgfx_memory_t)(
		"copy",
		"""
		""",

		const..void_p.IN("_data", ""),
		uint32_t.IN("_size", "")
	)

	(const..bgfx_memory_t)(
		"make_ref",
		"""
		""",

		const..void_p.IN("_data", ""),
		uint32_t.IN("_size", "")
	)

	(const..bgfx_memory_t)(
		"make_ref_release",
		"""
		""",

		const..void_p.IN("_data", ""),
		uint32_t.IN("_size", ""),
		bgfx_release_fn_t.IN("_releaseFn", ""),
		nullable..void_p.IN("_userData", "")
	)

	void(
		"set_debug",
		"""
		""",

		uint32_t.IN("_debug", "")
	)

	void(
		"dbg_text_clear",
		"""
		""",

		MapToInt..uint8_t.IN("_attr", ""),
		bool.IN("_small", "")
	)

	void(
		"dbg_text_printf",
		"""
		""",

		MapToInt..uint16_t.IN("_x", ""),
		MapToInt..uint16_t.IN("_y", ""),
		MapToInt..uint8_t.IN("_attr", ""),
		const..charUTF8.p.IN("_format", "")
	)

	void(
		"dbg_text_vprintf",
		"""
		""",

		MapToInt..uint16_t.IN("_x", ""),
		MapToInt..uint16_t.IN("_y", ""),
		MapToInt..uint8_t.IN("_attr", ""),
		const..charUTF8.p.IN("_format", ""),
		va_list.IN("_argList", "")
	)

	void(
		"dbg_text_image",
		"""
		""",

		MapToInt..uint16_t.IN("_x", ""),
		MapToInt..uint16_t.IN("_y", ""),
		MapToInt..uint16_t.IN("_width", ""),
		MapToInt..uint16_t.IN("_height", ""),
		const..void_p.IN("_data", ""),
		MapToInt..uint16_t.IN("_pitch", "")
	)

	bgfx_index_buffer_handle_t(
		"create_index_buffer",
		"""
		""",

		const..bgfx_memory_t.IN("_mem", ""),
		MapToInt..uint16_t.IN("_flags", "")
	)

	void(
		"destroy_index_buffer",
		"""
		""",

		bgfx_index_buffer_handle_t.IN("_handle", "")
	)

	bgfx_vertex_buffer_handle_t(
		"create_vertex_buffer",
		"""
		""",

		const..bgfx_memory_t.IN("_mem", ""),
		const..bgfx_vertex_decl_t.IN("_decl", ""),
		MapToInt..uint16_t.IN("_flags", "")
	)

	void(
		"destroy_vertex_buffer",
		"""
		""",

		bgfx_vertex_buffer_handle_t.IN("_handle", "")
	)

	bgfx_dynamic_index_buffer_handle_t(
		"create_dynamic_index_buffer",
		"""
		""",

		uint32_t.IN("_num", ""),
		MapToInt..uint16_t.IN("_flags", "")
	)

	bgfx_dynamic_index_buffer_handle_t(
		"create_dynamic_index_buffer_mem",
		"""
		""",

		const..bgfx_memory_t.IN("_mem", ""),
		MapToInt..uint16_t.IN("_flags", "")
	)

	void(
		"update_dynamic_index_buffer",
		"""
		""",

		bgfx_dynamic_index_buffer_handle_t.IN("_handle", ""),
		uint32_t.IN("_startIndex", ""),
		const..bgfx_memory_t.IN("_mem", "")
	)

	void(
		"destroy_dynamic_index_buffer",
		"""
		""",

		bgfx_dynamic_index_buffer_handle_t.IN("_handle", "")
	)

	bgfx_dynamic_vertex_buffer_handle_t(
		"create_dynamic_vertex_buffer",
		"""
		""",

		uint32_t.IN("_num", ""),
		const..bgfx_vertex_decl_t.IN("_decl", ""),
		MapToInt..uint16_t.IN("_flags", "")
	)

	bgfx_dynamic_vertex_buffer_handle_t(
		"create_dynamic_vertex_buffer_mem",
		"""
		""",

		const..bgfx_memory_t.IN("_mem", ""),
		const..bgfx_vertex_decl_t.IN("_decl", ""),
		MapToInt..uint16_t.IN("_flags", "")
	)

	void(
		"update_dynamic_vertex_buffer",
		"""
		""",

		bgfx_dynamic_vertex_buffer_handle_t.IN("_handle", ""),
		uint32_t.IN("_startVertex", ""),
		const..bgfx_memory_t.IN("_mem", "")
	)

	void(
		"destroy_dynamic_vertex_buffer",
		"""
		""",

		bgfx_dynamic_vertex_buffer_handle_t.IN("_handle", "")
	)

	bool(
		"check_avail_transient_index_buffer",
		"""
		""",

		uint32_t.IN("_num", "")
	)

	bool(
		"check_avail_transient_vertex_buffer",
		"""
		""",

		uint32_t.IN("_num", ""),
		const..bgfx_vertex_decl_t.IN("_decl", "")
	)

	bool(
		"check_avail_instance_data_buffer",
		"""
		""",

		uint32_t.IN("_num", ""),
		MapToInt..uint16_t.IN("_stride", "")
	)

	bool(
		"check_avail_transient_buffers",
		"""
		""",

		uint32_t.IN("_numVertices", ""),
		const..bgfx_vertex_decl_t.IN("_decl", ""),
		uint32_t.IN("_numIndices", "")
	)

	void(
		"alloc_transient_index_buffer",
		"""
		""",

		bgfx_transient_index_buffer_t.IN("_tib", ""),
		uint32_t.IN("_num", "")
	)

	void(
		"alloc_transient_vertex_buffer",
		"""
		""",

		bgfx_transient_vertex_buffer_t.IN("_tvb", ""),
		uint32_t.IN("_num", ""),
		const..bgfx_vertex_decl_t.IN("_decl", "")
	)

	bool(
		"alloc_transient_buffers",
		"""
		""",

		bgfx_transient_vertex_buffer_t.IN("_tvb", ""),
		const..bgfx_vertex_decl_t.IN("_decl", ""),
		uint32_t.IN("_numVertices", ""),
		bgfx_transient_index_buffer_t.IN("_tib", ""),
		uint32_t.IN("_numIndices", "")
	)

	(const..bgfx_instance_data_buffer_t)(
		"alloc_instance_data_buffer",
		"""
		""",

		uint32_t.IN("_num", ""),
		MapToInt..uint16_t.IN("_stride", "")
	)

	bgfx_indirect_buffer_handle_t(
		"create_indirect_buffer",
		"""
		""",

		uint32_t.IN("_num", "")
	)

	void(
		"destroy_indirect_buffer",
		"""
		""",

		bgfx_indirect_buffer_handle_t.IN("_handle", "")
	)

	bgfx_shader_handle_t(
		"create_shader",
		"""
		""",

		const..bgfx_memory_t.IN("_mem", "")
	)

	uint16_t(
		"get_shader_uniforms",
		"""
		""",

		bgfx_shader_handle_t.IN("_handle", ""),
		bgfx_uniform_handle_t.p.OUT("_uniforms", ""),
		AutoSize("_uniforms")..uint16_t.IN("_max", "")
	)

	void(
		"destroy_shader",
		"""
		""",

		bgfx_shader_handle_t.IN("_handle", "")
	)

	bgfx_program_handle_t(
		"create_program",
		"""
		""",

		bgfx_shader_handle_t.IN("_vsh", ""),
		bgfx_shader_handle_t.IN("_fsh", ""),
		bool.IN("_destroyShaders", "")
	)

	bgfx_program_handle_t(
		"create_compute_program",
		"""
		""",

		bgfx_shader_handle_t.IN("_csh", ""),
		bool.IN("_destroyShaders", "")
	)

	void(
		"destroy_program",
		"""
		""",

		bgfx_program_handle_t.IN("_handle", "")
	)

	void(
		"calc_texture_size",
		"""
		""",

		bgfx_texture_info_t.OUT("_info", ""),
		MapToInt..uint16_t.IN("_width", ""),
		MapToInt..uint16_t.IN("_height", ""),
		MapToInt..uint16_t.IN("_depth", ""),
		bool.IN("_cubeMap", ""),
		bool.IN("_hasMips", ""),
		MapToInt..uint16_t.IN("_numLayers", ""),
		bgfx_texture_format_t.IN("_format", "", TextureFormat)
	)

	bgfx_texture_handle_t(
		"create_texture",
		"""
		""",

		const..bgfx_memory_t.IN("_mem", ""),
		uint32_t.IN("_flags", ""),
		MapToInt..uint8_t.IN("_skip", ""),
		nullable..bgfx_texture_info_t.p.IN("_info", "")
	)

	bgfx_texture_handle_t(
		"create_texture_2d",
		"""
		""",

		MapToInt..uint16_t.IN("_width", ""),
		MapToInt..uint16_t.IN("_height", ""),
		bool.IN("_hasMips", ""),
		MapToInt..uint16_t.IN("_numLayers", ""),
		bgfx_texture_format_t.IN("_format", "", TextureFormat),
		uint32_t.IN("_flags", ""),
		const..bgfx_memory_t.IN("_mem", "")
	)

	bgfx_texture_handle_t(
		"create_texture_2d_scaled",
		"""
		""",

		bgfx_backbuffer_ratio_t.IN("_ratio", "", BackbufferRatio),
		bool.IN("_hasMips", ""),
		MapToInt..uint16_t.IN("_numLayers", ""),
		bgfx_texture_format_t.IN("_format", "", TextureFormat),
		uint32_t.IN("_flags", "")
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
		void_p.IN("_data", "") // TODO:
	)

	uint32_t(
		"read_frame_buffer",
		"""
		""",

		bgfx_frame_buffer_handle_t.IN("_handle", ""),
		MapToInt..uint8_t.IN("_attachment", ""),
		void_p.IN("_data", "") // TODO:
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

		const..charUTF8.p.IN("_name", ""),
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
		Check(4)..const..float.p.IN("_rgba", "")
	)

	void(
		"set_view_name",
		"""
		""",

		MapToInt..uint8_t.IN("_id", ""),
		const..charUTF8.p.IN("_name", "")
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

		const..charUTF8.p.IN("_marker", "")
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

		const..charUTF8.p.IN("_filePath", "")
	)

	void(
		"set_platform_data",
		"""
		""",

		const..bgfx_platform_data_t.IN("_data", "")
	)

}