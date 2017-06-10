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
        Native bindings to the C API of the ${url("https://github.com/bkaradzic/bgfx", "bgfx")} library.
        """

    IntConstant(
        "API version",

        "API_VERSION".."42"
    )

    ShortConstant(
        "Invalid handle",

        "INVALID_HANDLE"..0xFFFF.s
    )

    val StateFlags = LongConstant(
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

        "STATE_BLEND_EQUATION_ADD"..0x0000000000000000L,
        "STATE_BLEND_EQUATION_SUB"..0x0000000010000000L,
        "STATE_BLEND_EQUATION_REVSUB"..0x0000000020000000L,
        "STATE_BLEND_EQUATION_MIN"..0x0000000030000000L,
        "STATE_BLEND_EQUATION_MAX"..0x0000000040000000L,

        "STATE_BLEND_INDEPENDENT"..0x0000000400000000L,
        "STATE_BLEND_ALPHA_TO_COVERAGE"..0x0000000800000000L,

        "STATE_CULL_CW"..0x0000001000000000L,
        "STATE_CULL_CCW"..0x0000002000000000L,

        "STATE_PT_TRISTRIP"..0x0001000000000000L,
        "STATE_PT_LINES"..0x0002000000000000L,
        "STATE_PT_LINESTRIP"..0x0003000000000000L,
        "STATE_PT_POINTS"..0x0004000000000000L,

        "STATE_MSAA"..0x0100000000000000L,
        "STATE_LINEAA"..0x0200000000000000L,
        "STATE_CONSERVATIVE_RASTER"..0x0400000000000000L,

        "STATE_NONE"..0x0000000000000000L,

        "STATE_DEFAULT".."""(0L
        | BGFX_STATE_RGB_WRITE
        | BGFX_STATE_ALPHA_WRITE
        | BGFX_STATE_DEPTH_TEST_LESS
        | BGFX_STATE_DEPTH_WRITE
        | BGFX_STATE_CULL_CW
        | BGFX_STATE_MSAA)
        """
    ).javaDocLinks

    LongConstant(
        "State",

        "STATE_DEPTH_TEST_MASK"..0x00000000000000f0L,
        "STATE_BLEND_MASK"..0x000000000ffff000L,
        "STATE_BLEND_EQUATION_MASK"..0x00000003f0000000L,
        "STATE_CULL_MASK"..0x0000003000000000L,
        "STATE_ALPHA_REF_MASK"..0x0000ff0000000000L,
        "STATE_PT_MASK"..0x0007000000000000L,
        "STATE_POINT_SIZE_MASK"..0x00f0000000000000L,
        "STATE_RESERVED_MASK".."0xe000000000000000L",
        "STATE_MASK".."0xffffffffffffffffL"
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

    val StencilFlags = IntConstant(
        "Stencil",

        "STENCIL_TEST_LESS"..0x00010000,
        "STENCIL_TEST_LEQUAL"..0x00020000,
        "STENCIL_TEST_EQUAL"..0x00030000,
        "STENCIL_TEST_GEQUAL"..0x00040000,
        "STENCIL_TEST_GREATER"..0x00050000,
        "STENCIL_TEST_NOTEQUAL"..0x00060000,
        "STENCIL_TEST_NEVER"..0x00070000,
        "STENCIL_TEST_ALWAYS"..0x00080000,

        "STENCIL_OP_FAIL_S_ZERO"..0x00000000,
        "STENCIL_OP_FAIL_S_KEEP"..0x00100000,
        "STENCIL_OP_FAIL_S_REPLACE"..0x00200000,
        "STENCIL_OP_FAIL_S_INCR"..0x00300000,
        "STENCIL_OP_FAIL_S_INCRSAT"..0x00400000,
        "STENCIL_OP_FAIL_S_DECR"..0x00500000,
        "STENCIL_OP_FAIL_S_DECRSAT"..0x00600000,
        "STENCIL_OP_FAIL_S_INVERT"..0x00700000,

        "STENCIL_OP_FAIL_Z_ZERO"..0x00000000,
        "STENCIL_OP_FAIL_Z_KEEP"..0x01000000,
        "STENCIL_OP_FAIL_Z_REPLACE"..0x02000000,
        "STENCIL_OP_FAIL_Z_INCR"..0x03000000,
        "STENCIL_OP_FAIL_Z_INCRSAT"..0x04000000,
        "STENCIL_OP_FAIL_Z_DECR"..0x05000000,
        "STENCIL_OP_FAIL_Z_DECRSAT"..0x06000000,
        "STENCIL_OP_FAIL_Z_INVERT"..0x07000000,

        "STENCIL_OP_PASS_Z_ZERO"..0x00000000,
        "STENCIL_OP_PASS_Z_KEEP"..0x10000000,
        "STENCIL_OP_PASS_Z_REPLACE"..0x20000000,
        "STENCIL_OP_PASS_Z_INCR"..0x30000000,
        "STENCIL_OP_PASS_Z_INCRSAT"..0x40000000,
        "STENCIL_OP_PASS_Z_DECR"..0x50000000,
        "STENCIL_OP_PASS_Z_DECRSAT"..0x60000000,
        "STENCIL_OP_PASS_Z_INVERT"..0x70000000,

        "STENCIL_NONE"..0x00000000,
        "STENCIL_DEFAULT"..0x00000000
    ).javaDocLinks

    IntConstant(
        "Stencil",

        "STENCIL_FUNC_REF_SHIFT".."0",
        "STENCIL_FUNC_REF_MASK"..0x000000ff,
        "STENCIL_FUNC_RMASK_SHIFT".."8",
        "STENCIL_FUNC_RMASK_MASK"..0x0000ff00,

        "STENCIL_TEST_SHIFT".."16",
        "STENCIL_TEST_MASK"..0x000f0000,

        "STENCIL_OP_FAIL_S_SHIFT".."20",
        "STENCIL_OP_FAIL_S_MASK"..0x00f00000,

        "STENCIL_OP_FAIL_Z_SHIFT".."24",
        "STENCIL_OP_FAIL_Z_MASK"..0x0f000000,

        "STENCIL_OP_PASS_Z_SHIFT".."28",
        "STENCIL_OP_PASS_Z_MASK".."0xf0000000",

        "STENCIL_MASK".."0xffffffff"
    )


    val ClearFlags = ShortConstant(
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
    ).javaDocLinks

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

        "CAPS_ALPHA_TO_COVERAGE"..0x0000000000000001L,
        "CAPS_BLEND_INDEPENDENT"..0x0000000000000002L,
        "CAPS_COMPUTE"..0x0000000000000004L,
        "CAPS_CONSERVATIVE_RASTER"..0x0000000000000008L,
        "CAPS_DRAW_INDIRECT"..0x0000000000000010L,
        "CAPS_FRAGMENT_DEPTH"..0x0000000000000020L,
        "CAPS_FRAGMENT_ORDERING"..0x0000000000000040L,
        "CAPS_GRAPHICS_DEBUGGER"..0x0000000000000080L,
        "CAPS_HIDPI"..0x0000000000000100L,
        "CAPS_HMD"..0x0000000000000200L,
        "CAPS_INDEX32"..0x0000000000000400L,
        "CAPS_INSTANCING"..0x0000000000000800L,
        "CAPS_OCCLUSION_QUERY"..0x0000000000001000L,
        "CAPS_RENDERER_MULTITHREADED"..0x0000000000002000L,
        "CAPS_SWAP_CHAIN"..0x0000000000004000L,
        "CAPS_TEXTURE_2D_ARRAY"..0x0000000000008000L,
        "CAPS_TEXTURE_3D"..0x0000000000010000L,
        "CAPS_TEXTURE_BLIT"..0x0000000000020000L,
        "CAPS_TEXTURE_COMPARE_ALL"..0x00000000000C0000L,
        "CAPS_TEXTURE_COMPARE_LEQUAL"..0x0000000000080000L,
        "CAPS_TEXTURE_CUBE_ARRAY"..0x0000000000100000L,
        "CAPS_TEXTURE_READ_BACK"..0x0000000000200000L,
        "CAPS_VERTEX_ATTRIB_HALF"..0x0000000000400000L,
        "CAPS_VERTEX_ATTRIB_UINT10"..0x0000000000800000L
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

    val ViewFlags = ByteConstant(
        "View",

        "VIEW_NONE"..0x00.b,
        "VIEW_STEREO"..0x01.b
    ).javaDocLinks

    val SubmitFlags = ByteConstant(
        "Submit",

        "SUBMIT_EYE_LEFT"..0x01.b,
        "SUBMIT_EYE_RIGHT"..0x02.b,
        "SUBMIT_EYE_FIRST".."BGFX_SUBMIT_EYE_LEFT"
    ).javaDocLinks

    ByteConstant(
        "Submit",

        "SUBMIT_EYE_MASK"..0x03.b,

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

    val CubeMapSides = ByteConstant(
        "Cubemap",

        "CUBE_MAP_POSITIVE_X"..0x00.b,
        "CUBE_MAP_NEGATIVE_X"..0x01.b,
        "CUBE_MAP_POSITIVE_Y"..0x02.b,
        "CUBE_MAP_NEGATIVE_Y"..0x03.b,
        "CUBE_MAP_POSITIVE_Z"..0x04.b,
        "CUBE_MAP_NEGATIVE_Z"..0x05.b
    ).javaDocLinks

    val RendererType = EnumConstant(
        "Renderer type. ({@code bgfx_renderer_type_t})",

        "RENDERER_TYPE_NOOP".enum,
        "RENDERER_TYPE_DIRECT3D9".enum,
        "RENDERER_TYPE_DIRECT3D11".enum,
        "RENDERER_TYPE_DIRECT3D12".enum,
        "RENDERER_TYPE_GNM".enum,
        "RENDERER_TYPE_METAL".enum,
        "RENDERER_TYPE_OPENGLES".enum,
        "RENDERER_TYPE_OPENGL".enum,
        "RENDERER_TYPE_VULKAN".enum,

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
        "ATTRIB_COLOR2".enum,
        "ATTRIB_COLOR3".enum,
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
        "TEXTURE_FORMAT_RG11B10F".enum,

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

    EnumConstant(
        "bgfx_fatal_t",

        "FATAL_DEBUG_CHECK".enum,
        "FATAL_INVALID_SHADER".enum,
        "FATAL_UNABLE_TO_INITIALIZE".enum,
        "FATAL_UNABLE_TO_CREATE_TEXTURE".enum,
        "FATAL_DEVICE_LOST".enum,

        "FATAL_COUNT".enum
    )

    void(
        "vertex_decl_begin",
        "Start a vertex declaration.",

        bgfx_vertex_decl_t_p.IN("_decl", "the vertex declaration"),
        bgfx_renderer_type_t.IN("_renderer", "the renderer type", RendererType)
    )

    void(
        "vertex_decl_add",
        """
        Adds attribute to a vertex declaration.

        Must be called between #vertex_decl_begin()/#vertex_decl_end().
        """,

        bgfx_vertex_decl_t_p.IN("_decl", "the vertex declaration"),
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

        bgfx_vertex_decl_t_p.IN("_decl", "the vertex declaration"),
        MapToInt..uint8_t.IN("_num", "the number of bytes to skip")
    )

    void(
        "vertex_decl_end",
        "Ends a vertex declaration.",

        bgfx_vertex_decl_t_p.IN("_decl", "the vertex declaration")
    )

    void(
        "vertex_pack",
        "Packs {@code vec4} into vertex stream format.",

        Check(4)..const..float_p.IN("_input", ""),
        bool.IN("_inputNormalized", ""),
        bgfx_attrib_t.IN("_attr", "", Attrib),
        const..bgfx_vertex_decl_t_p.IN("_decl", ""),
        Unsafe..void_p.IN("_data", ""),
        uint32_t.IN("_index", "")
    )

    void(
        "vertex_unpack",
        "Unpacks {@code vec4} from vertex stream format.",

        Check(4)..float_p.OUT("_output", ""),
        bgfx_attrib_t.IN("_attr", "", Attrib),
        const..bgfx_vertex_decl_t_p.IN("_decl", ""),
        Unsafe..const..void_p.IN("_data", ""),
        uint32_t.IN("_index", "")
    )

    void(
        "vertex_convert",
        "Converts vertex stream data from one vertex stream format to another.",

        const..bgfx_vertex_decl_t_p.IN("_destDecl", "destination vertex stream declaration"),
        Unsafe..void_p.IN("_destData", "destination vertex stream"),
        const..bgfx_vertex_decl_t_p.IN("_srcDecl", "source vertex stream declaration"),
        Unsafe..const..void_p.IN("_srcData", "source vertex stream data"),
        uint32_t.IN("_num", "number of vertices to convert from source to destination")
    )

    uint16_t(
        "weld_vertices",
        "Welds vertices.",

        uint16_t.p.OUT("_output", "welded vertices remapping table. The size of buffer be the same as number of vertices."),
        const..bgfx_vertex_decl_t_p.IN("_decl", "vertex stream declaration"),
        Unsafe..const..void_p.IN("_data", "vertex stream"),
        AutoSize("_output")..uint16_t.IN("_num", "number of vertices in vertex stream"),
        float.IN("_epsilon", "error tolerance for vertex position comparison"),

        returnDoc = "number of unique vertices after vertex welding"
    )

    uint32_t(
        "topology_convert",
        "Converts index buffer for use with different primitive topologies.",

        bgfx_topology_convert_t.IN("_conversion", "conversion type", TopologyConvert),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT
        )..nullable..void_p.IN("_dst", "destination index buffer. If this argument is #NULL function will return number of indices after conversion"),
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
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT
        )..void_p.IN("_dst", "destination index buffer"),
        AutoSize("_dst")..uint32_t.IN(
            "_dstSize",
            """
            destination index buffer in bytes. It must be large enough to contain output indices. If destination size is insufficient index buffer will be
            truncated.
            """
        ),
        Check(3)..const..float_p.IN("_dir", "direction (vector must be normalized)"),
        Check(3)..const..float_p.IN("_pos", "position"),
        Check("_numIndices * _stride")..const..void_p.IN(
            "_vertices",
            "pointer to first vertex represented as float x, y, z. Must contain at least number of vertices referenced by index buffer."
        ),
        uint32_t.IN("_stride", "vertex stride"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT
        )..const..void_p.IN("_indices", "source indices"),
        UseVariable..AutoSizeShr("(_index32 ? 2 : 1)", "_indices")..uint32_t.IN("_numIndices", "number of input indices"),
        bool.IN("_index32", "set to `true` if input indices are 32-bit")
    )

    uint8_t(
        "get_supported_renderers",
        "Returns supported backend API renderers.",

        AutoSize("_enum")..MapToInt..uint8_t.IN("_max", "maximum number of elements in {@code _enum} array"),
        bgfx_renderer_type_t.p.IN("_enum", "array where supported renderers will be written"),

        returnDoc = "the number of renderers written to {@code _enum}"
    )

    const..charASCII_p(
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
        nullable..bgfx_callback_interface_t_p.IN("_callback", "provide application specific callback interface"),
        nullable..bgfx_allocator_interface_t_p.IN("_allocator", "custom allocator. When custom allocator is not specified, library uses default CRT allocator. The library assumes custom allocator is thread safe."),

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

    const..bgfx_caps_t_p(
        "get_caps",
        "Returns renderer capabilities."
    )

    const..bgfx_hmd_t_p(
        "get_hmd",
        "Returns HMD info."
    )

    const..bgfx_stats_t_p(
        "get_stats",
        "Returns performance counters."
    )

    const..bgfx_memory_t_p(
        "alloc",
        "Allocates buffer to pass to bgfx calls. Data will be freed inside bgfx.",

        uint32_t.IN("_size", "the number of bytes to allocate")
    )

    const..bgfx_memory_t_p(
        "copy",
        "Allocates buffer and copies data into it. Data will be freed inside bgfx.",

        MultiTypeAll..const..void_p.IN("_data", "the source data"),
        AutoSize("_data")..uint32_t.IN("_size", "the number of bytes to copy")
    )

    OffHeapOnly..const..bgfx_memory_t_p(
        "make_ref",
        """
        Makes reference to data to pass to bgfx. Unlike #alloc() this call doesn't allocate memory for data. It just copies pointer to data.

        You must make sure data is available for at least 2 #frame() calls.
        """,

        MultiTypeAll..const..void_p.IN("_data", "the data to reference"),
        AutoSize("_data")..uint32_t.IN("_size", "the number of bytes to reference")
    )

    OffHeapOnly..const..bgfx_memory_t_p(
        "make_ref_release",
        """
        Makes reference to data to pass to bgfx. Unlike #alloc() this call doesn't allocate memory for data. It just copies pointer to data.

        The {@code bgfx_release_fn_t} function pointer will release this memory after it's consumed. The {@code bgfx_release_fn_t} function must be able to be
        called from any thread.
        """,

        MultiTypeAll..const..void_p.IN("_data", "the data to reference"),
        AutoSize("_data")..uint32_t.IN("_size", "the number of bytes to reference"),
        nullable..bgfx_release_fn_t.IN("_releaseFn", "the release function"),
        nullable..opaque_p.IN("_userData", "user data to pass to {@code _releaseFn}")
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
        const..charASCII_p.IN("_format", "`printf` style format")
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
        const..charASCII_p.IN("_format", "`printf` style format"),
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

        const..bgfx_memory_t_p.IN("_mem", "index buffer data"),
        MapToInt..uint16_t.IN("_flags", "buffer creation flags", BufferFlags, LinkMode.BITFIELD)
    )

    void(
        "destroy_index_buffer",
        "Destroys static index buffer.",

        bgfx_index_buffer_handle_t.IN("_handle", "the static index buffer to destroy")
    )

    bgfx_vertex_buffer_handle_t(
        "create_vertex_buffer",
        "Creates static vertex buffer.",

        const..bgfx_memory_t_p.IN("_mem", "vertex buffer data"),
        const..bgfx_vertex_decl_t_p.IN("_decl", "vertex declaration"),
        MapToInt..uint16_t.IN("_flags", "buffer creation flags", BufferFlags, LinkMode.BITFIELD)
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
        MapToInt..uint16_t.IN("_flags", "buffer creation flags", BufferFlags, LinkMode.BITFIELD)
    )

    bgfx_dynamic_index_buffer_handle_t(
        "create_dynamic_index_buffer_mem",
        "Creates dynamic index buffer and initializes it.",

        const..bgfx_memory_t_p.IN("_mem", "index buffer data"),
        MapToInt..uint16_t.IN("_flags", "buffer creation flags", BufferFlags, LinkMode.BITFIELD)
    )

    void(
        "update_dynamic_index_buffer",
        "Updates dynamic index buffer.",

        bgfx_dynamic_index_buffer_handle_t.IN("_handle", "dynamic index buffer handle"),
        uint32_t.IN("_startIndex", "start index"),
        const..bgfx_memory_t_p.IN("_mem", "index buffer data")
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
        const..bgfx_vertex_decl_t_p.IN("_decl", "vertex declaration"),
        MapToInt..uint16_t.IN("_flags", "buffer creation flags", BufferFlags, LinkMode.BITFIELD)
    )

    bgfx_dynamic_vertex_buffer_handle_t(
        "create_dynamic_vertex_buffer_mem",
        "Creates dynamic vertex buffer and initializes it.",

        const..bgfx_memory_t_p.IN("_mem", "vertex buffer data"),
        const..bgfx_vertex_decl_t_p.IN("_decl", "vertex declaration"),
        MapToInt..uint16_t.IN("_flags", "buffer creation flags", BufferFlags, LinkMode.BITFIELD)
    )

    void(
        "update_dynamic_vertex_buffer",
        "Updates dynamic vertex buffer.",

        bgfx_dynamic_vertex_buffer_handle_t.IN("_handle", "dynamic vertex buffer handle"),
        uint32_t.IN("_startVertex", "start vertex"),
        const..bgfx_memory_t_p.IN("_mem", "vertex buffer data")
    )

    void(
        "destroy_dynamic_vertex_buffer",
        "Destroys dynamic vertex buffer.",

        bgfx_dynamic_vertex_buffer_handle_t.IN("_handle", "the dynamic vertex buffer to destroy")
    )

    uint32_t(
        "get_avail_transient_index_buffer",
        "Returns number of available indices.",

        uint32_t.IN("_num", "number of required indices")
    )

    uint32_t(
        "get_avail_transient_vertex_buffer",
        "Returns number of available vertices.",

        uint32_t.IN("_num", "number of required vertices"),
        const..bgfx_vertex_decl_t_p.IN("_decl", "vertex declaration")
    )

    uint32_t(
        "get_avail_instance_data_buffer",
        "Returns number of available instance buffer slots.",

        uint32_t.IN("_num", "number of required instances"),
        MapToInt..uint16_t.IN("_stride", "stride per instance")
    )

    void(
        "alloc_transient_index_buffer",
        """
        Allocates transient index buffer.

        You must call #set_index_buffer() after alloc in order to avoid memory leak.

        Only 16-bit index buffer is supported.
        """,

        bgfx_transient_index_buffer_t_p.OUT(
            "_tib",
            "##BGFXTransientIndexBuffer structure is filled and is valid for the duration of frame, and it can be reused for multiple draw calls"
        ),
        uint32_t.IN("_num", "number of indices to allocate")
    )

    void(
        "alloc_transient_vertex_buffer",
        "Allocates transient vertex buffer.",

        bgfx_transient_vertex_buffer_t_p.OUT(
            "_tvb",
            "##BGFXTransientVertexBuffer structure is filled and is valid for the duration of frame, and it can be reused for multiple draw calls"
        ),
        uint32_t.IN("_num", "number of vertices to allocate"),
        const..bgfx_vertex_decl_t_p.IN("_decl", "vertex declaration")
    )

    bool(
        "alloc_transient_buffers",
        """
        Checks for required space and allocates transient vertex and index buffers. If both space requirements are satisfied function returns true.

        Only 16-bit index buffer is supported.
        """,

        bgfx_transient_vertex_buffer_t_p.OUT(
            "_tvb",
            "##BGFXTransientVertexBuffer structure is filled and is valid for the duration of frame, and it can be reused for multiple draw calls"
        ),
        const..bgfx_vertex_decl_t_p.IN("_decl", "vertex declaration"),
        uint32_t.IN("_numVertices", "number of vertices to allocate"),
        bgfx_transient_index_buffer_t_p.OUT(
            "_tib",
            "##BGFXTransientIndexBuffer structure is filled and is valid for the duration of frame, and it can be reused for multiple draw calls"
        ),
        uint32_t.IN("_numIndices", "number of indices to allocate")
    )

    const..bgfx_instance_data_buffer_t_p(
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

        const..bgfx_memory_t_p.IN("_mem", "")
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

    bool(
        "is_texture_valid",
        "Validate texture parameters.",

        MapToInt..uint16_t.IN("_depth", "depth dimension of volume texture"),
        bool.IN("_cubeMap", "indicates that texture contains cubemap"),
        MapToInt..uint16_t.IN("_numLayers", "number of layers in texture array"),
        bgfx_texture_format_t.IN("_format", "texture format", TextureFormat),
        uint32_t.IN("_flags", "texture flags", TextureFlags, LinkMode.BITFIELD)
    )

    void(
        "calc_texture_size",
        "Calculates amount of memory required for texture.",

        bgfx_texture_info_t_p.OUT("_info", "resulting texture info structure"),
        MapToInt..uint16_t.IN("_width", "width"),
        MapToInt..uint16_t.IN("_height", "height"),
        MapToInt..uint16_t.IN("_depth", "depth dimension of volume texture"),
        bool.IN("_cubeMap", "indicates that texture contains cubemap"),
        bool.IN("_hasMips", "indicates that texture contains full mip-map chain"),
        MapToInt..uint16_t.IN("_numLayers", "number of layers in texture array"),
        bgfx_texture_format_t.IN("_format", "texture format", TextureFormat)
    )

    bgfx_texture_handle_t(
        "create_texture",
        "Creates texture from memory buffer.",

        const..bgfx_memory_t_p.IN("_mem", "DDS, KTX or PVR texture data"),
        uint32_t.IN("_flags", "default texture sampling mode is linear, and wrap mode is repeat", TextureFlags, LinkMode.BITFIELD),
        MapToInt..uint8_t.IN("_skip", "skip top level mips when parsing texture"),
        nullable..bgfx_texture_info_t_p.OUT("_info", "when non-#NULL is specified it returns parsed texture information")
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
        nullable..const..bgfx_memory_t_p.IN(
            "_mem",
            """
            texture data. If {@code _mem} is non-#NULL, created texture will be immutable. When {@code _numLayers} is more than 1, expected memory layout is
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
        "Creates 3D texture.",

        MapToInt..uint16_t.IN("_width", "width"),
        MapToInt..uint16_t.IN("_height", "height"),
        MapToInt..uint16_t.IN("_depth", "depth"),
        bool.IN("_hasMips", "indicates that texture contains full mip-map chain"),
        bgfx_texture_format_t.IN("_format", "texture format", TextureFormat),
        uint32_t.IN("_flags", "default texture sampling mode is linear, and wrap mode is repeat", TextureFlags, LinkMode.BITFIELD),
        nullable..const..bgfx_memory_t_p.IN("_mem", "texture data. If {@code _mem} is non-#NULL, created texture will be immutable.")
    )

    bgfx_texture_handle_t(
        "create_texture_cube",
        "Creates Cube texture.",

        MapToInt..uint16_t.IN("_size", "cube side size"),
        bool.IN("_hasMips", "indicates that texture contains full mip-map chain"),
        MapToInt..uint16_t.IN("_numLayers", "number of layers in texture array. Must be 1 if caps #CAPS_TEXTURE_CUBE_ARRAY flag is not set."),
        bgfx_texture_format_t.IN("_format", "", TextureFormat),
        uint32_t.IN("_flags", "default texture sampling mode is linear, and wrap mode is repeat", TextureFlags, LinkMode.BITFIELD),
        nullable..const..bgfx_memory_t_p.IN(
            "_mem",
            """
            texture data. If {@code _mem} is non-#NULL, created texture will be immutable. When {@code _numLayers} is more than 1, expected memory layout is
            cubemap texture and all mips together for each array element.
            """
        )
    )

    void(
        "update_texture_2d",
        "Updates 2D texture.",

        bgfx_texture_handle_t.IN("_handle", "texture handle"),
        MapToInt..uint16_t.IN("_layer", "layers in texture array"),
        MapToInt..uint8_t.IN("_mip", "mip level"),
        MapToInt..uint16_t.IN("_x", "x offset in texture"),
        MapToInt..uint16_t.IN("_y", "y offset in texture"),
        MapToInt..uint16_t.IN("_width", "width of texture block"),
        MapToInt..uint16_t.IN("_height", "height of texture block"),
        const..bgfx_memory_t_p.IN("_mem", "texture update data"),
        MapToInt..uint16_t.IN(
            "_pitch",
            "pitch of input image (bytes). When {@code _pitch} is set to {@code UINT16_MAX}, it will be calculated internally based on {@code _width}."
        )
    )

    void(
        "update_texture_3d",
        "Updates 3D texture.",

        bgfx_texture_handle_t.IN("_handle", "texture handle"),
        MapToInt..uint8_t.IN("_mip", "mip level"),
        MapToInt..uint16_t.IN("_x", "x offset in texture"),
        MapToInt..uint16_t.IN("_y", "y offset in texture"),
        MapToInt..uint16_t.IN("_z", "z offset in texture"),
        MapToInt..uint16_t.IN("_width", "width of texture block"),
        MapToInt..uint16_t.IN("_height", "height of texture block"),
        MapToInt..uint16_t.IN("_depth", "depth of texture block"),
        const..bgfx_memory_t_p.IN("_mem", "texture update data")
    )

    void(
        "update_texture_cube",
        """
        Updates Cube texture.

        Cubemap sides: 0 is +X, 1 is -X, 2 is +Y, 3 is -Y, 4 is +Z, and 5 is -Z.
        ${codeBlock("""
           +----------+
           |-z       2|
           | ^  +y    |
           | |        |
           | +---->+x |
+----------+----------+----------+----------+
|+y       1|+y       4|+y       0|+y       5|
| ^  -x    | ^  +z    | ^  +x    | ^  -z    |
| |        | |        | |        | |        |
| +---->+z | +---->+x | +---->-z | +---->-x |
+----------+----------+----------+----------+
           |+z       3|
           | ^  -y    |
           | |        |
           | +---->+x |
           +----------+""")}
        """,

        bgfx_texture_handle_t.IN("_handle", "texture handle"),
        MapToInt..uint16_t.IN("_layer", "layers in texture array"),
        MapToInt..uint8_t.IN("_side", "cubemap side", CubeMapSides),
        MapToInt..uint8_t.IN("_mip", "mip level"),
        MapToInt..uint16_t.IN("_x", "x offset in texture"),
        MapToInt..uint16_t.IN("_y", "y offset in texture"),
        MapToInt..uint16_t.IN("_width", "width of texture block"),
        MapToInt..uint16_t.IN("_height", "height of texture block"),
        const..bgfx_memory_t_p.IN("_mem", "texture update data"),
        MapToInt..uint16_t.IN(
            "_pitch",
            "pitch of input image (bytes). When {@code _pitch} is set to {@code UINT16_MAX}, it will be calculated internally based on {@code _width}."
        )
    )

    uint32_t(
        "read_texture",
        """
        Reads back texture content.

        Texture must be created with #TEXTURE_READ_BACK flag. Availability depends on #CAPS_TEXTURE_READ_BACK.
        """,

        bgfx_texture_handle_t.IN("_handle", "texture handle"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT
        )..Unsafe..void_p.IN("_data", "destination buffer"),
        MapToInt..uint8_t.IN("_mip", "mip level"),

        returnDoc = "frame number when the result will be available"
    )

    void(
        "destroy_texture",
        "Destroys texture.",

        bgfx_texture_handle_t.IN("_handle", "texture handle")
    )

    bgfx_frame_buffer_handle_t(
        "create_frame_buffer",
        "Creates frame buffer (simple).",

        MapToInt..uint16_t.IN("_width", "texture width"),
        MapToInt..uint16_t.IN("_height", "texture height"),
        bgfx_texture_format_t.IN("_format", "texture format", TextureFormat),
        uint32_t.IN("_textureFlags", "default texture sampling mode is linear, and wrap mode is repeat", TextureFlags),

        returnDoc = "handle to frame buffer object"
    )

    bgfx_frame_buffer_handle_t(
        "create_frame_buffer_scaled",
        "Creates frame buffer with size based on backbuffer ratio. Frame buffer will maintain ratio if back buffer resolution changes.",

        bgfx_backbuffer_ratio_t.IN("_ratio", "frame buffer size in respect to back-buffer size", BackbufferRatio),
        bgfx_texture_format_t.IN("_format", "texture format", TextureFormat),
        uint32_t.IN("_textureFlags", "default texture sampling mode is linear, and wrap mode is repeat", TextureFlags),

        returnDoc = "handle to frame buffer object"
    )

    bgfx_frame_buffer_handle_t(
        "create_frame_buffer_from_handles",
        "Creates MRT frame buffer from texture handles (simple).",

        AutoSize("_handles")..uint8_t.IN("_num", "number of texture attachments"),
        const..bgfx_texture_handle_t.p.IN("_handles", "texture attachments"),
        bool.IN("_destroyTextures", "if true, textures will be destroyed when frame buffer is destroyed"),

        returnDoc = "handle to frame buffer object"
    )

    bgfx_frame_buffer_handle_t(
        "create_frame_buffer_from_attachment",
        "Create MRT frame buffer from texture handles with specific layer and mip level.",

        AutoSize("_attachment")..uint8_t.IN("_num", "number of texture attachments"),
        const..bgfx_attachment_t_p.IN("_attachment", "attachment texture info"),
        bool.IN("_destroyTextures", "if true, textures will be destroyed when frame buffer is destroyed"),

        returnDoc = "handle to frame buffer object"
    )

    bgfx_frame_buffer_handle_t(
        "create_frame_buffer_from_nwh",
        """
        Creates frame buffer for multiple window rendering.

        Frame buffer cannot be used for sampling.
        """,

        opaque_p.IN("_nwh", "OS' target native window handle"),
        MapToInt..uint16_t.IN("_width", "window back buffer width"),
        MapToInt..uint16_t.IN("_height", "window back buffer height"),
        bgfx_texture_format_t.IN("_depthFormat", "window back buffer depth format", TextureFormat),

        returnDoc = "handle to frame buffer object"
    )

    bgfx_texture_handle_t(
        "get_texture",
        "Obtains texture handle of frame buffer attachment.",

        bgfx_frame_buffer_handle_t.IN("_handle", "frame buffer handle"),
        MapToInt..uint8_t.IN("_attachment", "frame buffer attachment index"),

        returnDoc = "invalid texture handle if attachment index is not correct, or frame buffer is created with native window handle"
    )

    void(
        "destroy_frame_buffer",
        "Destroys frame buffer.",

        bgfx_frame_buffer_handle_t.IN("_handle", "the frame buffer to destroy")
    )

    bgfx_uniform_handle_t(
        "create_uniform",
        """
        Creates shader uniform parameter.

        Uniform names are unique. It's valid to call {@code bgfx_create_uniform} multiple times with the same uniform name. The library will always return the
        same handle, but the handle reference count will be incremented. This means that the same number of #destroy_uniform() must be called to properly
        destroy the uniform.

        Predefined uniforms (declared in `bgfx_shader.sh`):
        ${ul(
            "{@code u_viewRect vec4(x, y, width, height)} - view rectangle for current view.",
            "{@code u_viewTexel vec4(1.0/width, 1.0/height, undef, undef)} - inverse width and height",
            "{@code u_view mat4} - view matrix",
            "{@code u_invView mat4} - inverted view matrix",
            "{@code u_proj mat4} - projection matrix",
            "{@code u_invProj mat4} - inverted projection matrix",
            "{@code u_viewProj mat4} - concatenated view projection matrix",
            "{@code u_invViewProj mat4} - concatenated inverted view projection matrix",
            "{@code u_model mat4[BGFX_CONFIG_MAX_BONES]} - array of model matrices.",
            "{@code u_modelView mat4} - concatenated model view matrix, only first model matrix from array is used.",
            "{@code u_modelViewProj mat4} - concatenated model view projection matrix.",
            "{@code u_alphaRef float} - alpha reference value for alpha test."
        )}
        """,

        const..charASCII_p.IN("_name", "uniform name in shader"),
        bgfx_uniform_type_t.IN("_type", "type of uniform", UniformType),
        MapToInt..uint16_t.IN("_num", "number of elements in array"),

        returnDoc = "handle to uniform object"
    )

    void(
        "get_uniform_info",
        "Retrieves uniform info.",

        bgfx_uniform_handle_t.IN("_handle", "handle to uniform object"),
        bgfx_uniform_info_t_p.OUT("_info", "uniform info")
    )

    void(
        "destroy_uniform",
        "Destroys shader uniform parameter.",

        bgfx_uniform_handle_t.IN("_handle", "handle to uniform object")
    )

    bgfx_occlusion_query_handle_t(
        "create_occlusion_query",
        "Creates occlusion query.",

        returnDoc = "handle to occlusion query object"
    )

    bgfx_occlusion_query_result_t(
        "get_result",
        "Retrieves occlusion query result from previous frame.",

        bgfx_occlusion_query_handle_t.IN("_handle", "handle to occlusion query object"),
        Check(1)..nullable..int32_t_p.OUT(
            "_result",
            "number of pixels that passed test. This argument can be #NULL if result of occlusion query is not needed."
        ),

        returnDoc = "occlusion query result"
    )

    void(
        "destroy_occlusion_query",
        "Destroys occlusion query.",

        bgfx_occlusion_query_handle_t.IN("_handle", "handle to occlusion query object")
    )

    void(
        "set_palette_color",
        "Sets palette color value.",

        MapToInt..uint8_t.IN("_index", "index into palette"),
        Check(4)..const..float_p.IN("_rgba", "packed 32-bit RGBA value")
    )

    void(
        "set_view_name",
        """
        Sets view name.

        This is debug only feature. In graphics debugger view name will appear as:
        ${codeBlock("""
"nnnce <view name>"
 ^  ^^ ^
 |  |+-- eye (L/R)
 |  +--- compute (C)
 +------ view id""")}
        """,

        MapToInt..uint8_t.IN("_id", "view id"),
        const..charASCII_p.IN("_name", "view name")
    )

    void(
        "set_view_rect",
        "Sets view rectangle. Draw primitive outside view will be clipped.",

        MapToInt..uint8_t.IN("_id", "view id"),
        MapToInt..uint16_t.IN("_x", "position x from the left corner of the window"),
        MapToInt..uint16_t.IN("_y", "position y from the top corner of the window"),
        MapToInt..uint16_t.IN("_width", "width of view port region"),
        MapToInt..uint16_t.IN("_height", "height of view port region")
    )

    void(
        "set_view_rect_auto",
        "Sets view rectangle. Draw primitive outside view will be clipped.",

        MapToInt..uint8_t.IN("_id", "view id"),
        MapToInt..uint16_t.IN("_x", "position x from the left corner of the window"),
        MapToInt..uint16_t.IN("_y", "position y from the top corner of the window"),
        bgfx_backbuffer_ratio_t.IN("_ratio", "view rectangle ratio", BackbufferRatio)
    )

    void(
        "set_view_scissor",
        """
        Sets view scissor. Draw primitive outside view will be clipped. When {@code _x}, {@code _y}, {@code _width} and {@code _height} are set to 0, scissor
        will be disabled.
        """,

        MapToInt..uint8_t.IN("_id", "view id"),
        MapToInt..uint16_t.IN("_x", "position x from the left corner of the window"),
        MapToInt..uint16_t.IN("_y", "position y from the top corner of the window"),
        MapToInt..uint16_t.IN("_width", "width of scissor region"),
        MapToInt..uint16_t.IN("_height", "height of scissor region")
    )

    void(
        "set_view_clear",
        "Sets view clear flags.",

        MapToInt..uint8_t.IN("_id", "view id"),
        MapToInt..uint16_t.IN("_flags", "clear flags. Use #CLEAR_NONE to remove any clear operation.", ClearFlags, LinkMode.BITFIELD),
        uint32_t.IN("_rgba", "color clear value"),
        float.IN("_depth", "depth clear value"),
        MapToInt..uint8_t.IN("_stencil", "stencil clear value")
    )

    void(
        "set_view_clear_mrt",
        "Sets view clear flags with different clear color for each frame buffer texture. Must use {@code setClearColor} to setup clear color palette.",

        MapToInt..uint8_t.IN("_id", "view id"),
        MapToInt..uint16_t.IN("_flags", "clear flags. Use #CLEAR_NONE to remove any clear operation.", ClearFlags, LinkMode.BITFIELD),
        float.IN("_depth", "depth clear value"),
        MapToInt..uint8_t.IN("_stencil", "stencil clear value"),
        uint8_t.IN("_0", "palette index for frame buffer attachment 0"),
        uint8_t.IN("_1", "palette index for frame buffer attachment 1"),
        uint8_t.IN("_2", "palette index for frame buffer attachment 2"),
        uint8_t.IN("_3", "palette index for frame buffer attachment 3"),
        uint8_t.IN("_4", "palette index for frame buffer attachment 4"),
        uint8_t.IN("_5", "palette index for frame buffer attachment 5"),
        uint8_t.IN("_6", "palette index for frame buffer attachment 6"),
        uint8_t.IN("_7", "palette index for frame buffer attachment 7")
    )

    void(
        "set_view_seq",
        "Sets view into sequential mode. Draw calls will be sorted in the same order in which submit calls were called.",

        MapToInt..uint8_t.IN("_id", "view id"),
        bool.IN("_enabled", "if true, sequential mode is enabled")
    )

    void(
        "set_view_frame_buffer",
        """
        Sets view frame buffer.

        Not persistent after #reset() call.
        """,

        MapToInt..uint8_t.IN("_id", "view id"),
        bgfx_frame_buffer_handle_t.IN(
            "_handle",
            "frame buffer handle. Passing #INVALID_HANDLE as frame buffer handle will draw primitives from this view into default back buffer."
        )
    )

    void(
        "set_view_transform",
        "Sets view view and projection matrices, all draw primitives in this view will use these matrices.",

        MapToInt..uint8_t.IN("_id", "view id"),
        MultiType(
            PointerMapping.DATA_FLOAT
        )..Check(4 x 4 x 4)..nullable..const..void_p.IN("_view", "view matrix"),
        MultiType(
            PointerMapping.DATA_FLOAT
        )..Check(4 x 4 x 4)..nullable..const..void_p.IN("_proj", "projection matrix")
    )

    void(
        "set_view_transform_stereo",
        "Sets view view and projection matrices, all draw primitives in this view will use these matrices.",

        MapToInt..uint8_t.IN("_id", "view id"),
        MultiType(
            PointerMapping.DATA_FLOAT
        )..Check(4 x 4 x 4)..nullable..const..void_p.IN("_view", "project matrix"),
        MultiType(
            PointerMapping.DATA_FLOAT
        )..Check(4 x 4 x 4)..nullable..const..void_p.IN("_projL", "projection matrix for left eye in stereo mode"),
        MapToInt..uint8_t.IN("_flags", "view flags", ViewFlags),
        MultiType(
            PointerMapping.DATA_FLOAT
        )..Check(4 x 4 x 4)..nullable..const..void_p.IN("_projR", "projection matrix for right eye in stereo mode")
    )

    void(
        "set_view_order",
        "Post submit view reordering.",

        MapToInt..uint8_t.IN("_id", "view id"),
        MapToInt..uint8_t.IN("_num", "number of views to remap"),
        Check("_num")..nullable..const..void_p.IN("_order", "view remap id table. Passing #NULL will reset view ids to default state")
    )

    void(
        "reset_view",
        "Resets all view settings to default.",

        MapToInt..uint8_t.IN("_id", "view id")
    )

    void(
        "set_marker",
        "Sets debug marker.",

        const..charASCII_p.IN("_marker", "debug marker")
    )

    void(
        "set_state",
        """
        Sets render states for draw primitive.

        Remarks:
        ${ol(
            "Use #BGFX_STATE_ALPHA_REF(), #BGFX_STATE_POINT_SIZE() and #BGFX_STATE_BLEND_FUNC() macros to setup more complex states.",
            "#STATE_BLEND_EQUATION_ADD is set when no other blend equation is specified."
        )}
        """,

        uint64_t.IN("_state", "state flags", StateFlags, LinkMode.BITFIELD),
        uint32_t.IN("_rgba", "blend factor used by #STATE_BLEND_FACTOR and #STATE_BLEND_INV_FACTOR blend modes")
    )

    void(
        "set_condition",
        "Sets condition for rendering.",

        bgfx_occlusion_query_handle_t.IN("_handle", "occlusion query handle"),
        bool.IN("_visible", "render if occlusion query is visible")
    )

    void(
        "set_stencil",
        "Sets stencil test state.",

        uint32_t.IN("_fstencil", "front stencil state", StencilFlags, LinkMode.BITFIELD),
        uint32_t.IN(
            "_bstencil",
            "back stencil state. If back is set to #STENCIL_NONE {@code _fstencil} is applied to both front and back facing primitives.",
            StencilFlags, LinkMode.BITFIELD
        )
    )

    uint16_t(
        "set_scissor",
        "Sets scissor for draw primitive. For scissor for all primitives in view see #set_view_scissor().",

        MapToInt..uint16_t.IN("_x", "position x from the left corner of the window"),
        MapToInt..uint16_t.IN("_y", "position y from the top corner of the window"),
        MapToInt..uint16_t.IN("_width", "width of scissor region"),
        MapToInt..uint16_t.IN("_height", "height of scissor region"),

        returnDoc = "scissor cache index"
    )

    void(
        "set_scissor_cached",
        "Sets scissor from cache for draw primitive.",

        MapToInt..uint16_t.IN("_cache", "index in scissor cache. Passing {@code UINT16_MAX} unsets primitive scissor and primitive will use view scissor instead.")
    )

    uint32_t(
        "set_transform",
        "Sets model matrix for draw primitive. If it is not called model will be rendered with identity model matrix.",

        MultiType(
            PointerMapping.DATA_FLOAT
        )..const..void_p.IN("_mtx", "pointer to first matrix in array"),
        AutoSize(4 x 4 x 4, "_mtx")..uint16_t.IN("_num", "number of matrices in array"),

        returnDoc = "index into matrix cache in case the same model matrix has to be used for other draw primitive call"
    )

    uint32_t(
        "alloc_transform",
        "Reserves {@code _num} matrices in internal matrix cache. Pointer returned can be modifed until #frame()) is called.",

        bgfx_transform_t_p.IN("_transform", "pointer to ##BGFXTransform structure"),
        MapToInt..uint16_t.IN("_num", "number of matrices"),

        returnDoc = "index into matrix cache"
    )

    void(
        "set_transform_cached",
        "Sets model matrix from matrix cache for draw primitive.",

        uint32_t.IN("_cache", "index in matrix cache"),
        MapToInt..uint16_t.IN("_num", "number of matrices from cache")
    )

    void(
        "set_uniform",
        "Sets shader uniform parameter for draw primitive.",

        bgfx_uniform_handle_t.IN("_handle", "uniform"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_LONG,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..Unsafe..const..void_p.IN("_value", "pointer to uniform data"),
        MapToInt..uint16_t.IN("_num", "number of elements. Passing {@code UINT16_MAX} will use the {@code _num} passed on uniform creation.")
    )

    void(
        "set_index_buffer",
        "Sets index buffer for draw primitive.",

        bgfx_index_buffer_handle_t.IN("_handle", "index buffer"),
        uint32_t.IN("_firstIndex", "first index to render"),
        uint32_t.IN("_numIndices", "number of indices to render")
    )

    void(
        "set_dynamic_index_buffer",
        "Sets index buffer for draw primitive.",

        bgfx_dynamic_index_buffer_handle_t.IN("_handle", "dynamic index buffer"),
        uint32_t.IN("_firstIndex", "first index to render"),
        uint32_t.IN("_numIndices", "number of indices to render")
    )

    void(
        "set_transient_index_buffer",
        "Sets index buffer for draw primitive.",

        const..bgfx_transient_index_buffer_t_p.IN("_tib", "transient index buffer"),
        uint32_t.IN("_firstIndex", "first index to render"),
        uint32_t.IN("_numIndices", "number of indices to render")
    )

    void(
        "set_vertex_buffer",
        "Sets vertex buffer for draw primitive.",

        MapToInt..uint8_t.IN("_stream", "vertex stream"),
        bgfx_vertex_buffer_handle_t.IN("_handle", "vertex buffer"),
        uint32_t.IN("_startVertex", "first vertex to render"),
        uint32_t.IN("_numVertices", "number of vertices to render")
    )

    void(
        "set_dynamic_vertex_buffer",
        "Sets vertex buffer for draw primitive.",

        MapToInt..uint8_t.IN("_stream", "vertex stream"),
        bgfx_dynamic_vertex_buffer_handle_t.IN("_handle", "dynamic vertex buffer"),
        uint32_t.IN("_startVertex", "first vertex to render"),
        uint32_t.IN("_numVertices", "number of vertices to render")
    )

    void(
        "set_transient_vertex_buffer",
        "Sets vertex buffer for draw primitive.",

        MapToInt..uint8_t.IN("_stream", "vertex stream"),
        const..bgfx_transient_vertex_buffer_t_p.IN("_tvb", "transient vertex buffer"),
        uint32_t.IN("_startVertex", "first vertex to render"),
        uint32_t.IN("_numVertices", "number of vertices to render")
    )

    void(
        "set_instance_data_buffer",
        "Sets instance data buffer for draw primitive.",

        const..bgfx_instance_data_buffer_t_p.IN("_idb", "instance data buffer"),
        uint32_t.IN("_num", "number of instances to render")
    )

    void(
        "set_instance_data_from_vertex_buffer",
        "Set instance data buffer for draw primitive.",

        bgfx_vertex_buffer_handle_t.IN("_handle", "vertex buffer"),
        uint32_t.IN("_startVertex", "first vertex to render"),
        uint32_t.IN("_numVertices", "number of vertices to render")
    )

    void(
        "set_instance_data_from_dynamic_vertex_buffer",
        "Set instance data buffer for draw primitive.",

        bgfx_dynamic_vertex_buffer_handle_t.IN("_handle", "dynamic vertex buffer"),
        uint32_t.IN("_startVertex", "first vertex to render"),
        uint32_t.IN("_numVertices", "number of vertices to render")
    )

    void(
        "set_texture",
        "Sets texture stage for draw primitive.",

        MapToInt..uint8_t.IN("_stage", "texture unit"),
        bgfx_uniform_handle_t.IN("_sampler", "program sampler"),
        bgfx_texture_handle_t.IN("_handle", "texture handle"),
        uint32_t.IN("_flags", "texture sampling mode. {@code UINT32_MAX} uses texture sampling settings from the texture.", TextureFlags)
    )

    uint32_t(
        "touch",
        """
        Submits an empty primitive for rendering. Uniforms and draw state will be applied but no geometry will be submitted.

        These empty draw calls will sort before ordinary draw calls.
        """,

        MapToInt..uint8_t.IN("_id", "view id"),

        returnDoc = "number of draw calls"
    )

    uint32_t(
        "submit",
        "Submits primitive for rendering.",

        MapToInt..uint8_t.IN("_id", "view id"),
        bgfx_program_handle_t.IN("_handle", "program"),
        int32_t.IN("_depth", "depth for sorting"),
        bool.IN("_preserveState", "preserve internal draw state for next draw call submit"),

        returnDoc = "number of draw calls"
    )

    uint32_t(
        "submit_occlusion_query",
        "Submits primitive with occlusion query for rendering.",

        MapToInt..uint8_t.IN("_id", "view id"),
        bgfx_program_handle_t.IN("_program", "program"),
        bgfx_occlusion_query_handle_t.IN("_occlusionQuery", "occlusion query"),
        int32_t.IN("_depth", "depth for sorting"),
        bool.IN("_preserveState", "preserve internal draw state for next draw call submit"),

        returnDoc = "number of draw calls"
    )

    uint32_t(
        "submit_indirect",
        "Submits primitive for rendering with index and instance data info from indirect buffer.",

        MapToInt..uint8_t.IN("_id", "view id"),
        bgfx_program_handle_t.IN("_handle", "program"),
        bgfx_indirect_buffer_handle_t.IN("_indirectHandle", "indirect buffer"),
        MapToInt..uint16_t.IN("_start", "first element in indirect buffer"),
        MapToInt..uint16_t.IN("_num", "number of dispatches"),
        int32_t.IN("_depth", "depth for sorting"),
        bool.IN("_preserveState", "preserve internal draw state for next draw call submit"),

        returnDoc = "number of draw calls"
    )

    void(
        "set_image",
        "Sets compute image from texture.",

        MapToInt..uint8_t.IN("_stage", "texture unit"),
        bgfx_uniform_handle_t.IN("_sampler", "program sampler"),
        bgfx_texture_handle_t.IN("_handle", "texture handle"),
        MapToInt..uint8_t.IN("_mip", "mip level"),
        bgfx_access_t.IN("_access", "texture access", Access),
        bgfx_texture_format_t.IN("_format", "texture format", TextureFormat)
    )

    void(
        "set_compute_index_buffer",
        "Sets compute index buffer.",

        MapToInt..uint8_t.IN("_stage", "compute stage"),
        bgfx_index_buffer_handle_t.IN("_handle", "index buffer handle"),
        bgfx_access_t.IN("_access", "buffer access", Access)
    )

    void(
        "set_compute_vertex_buffer",
        "Sets compute vertex buffer.",

        MapToInt..uint8_t.IN("_stage", "compute stage"),
        bgfx_vertex_buffer_handle_t.IN("_handle", "vertex buffer handle"),
        bgfx_access_t.IN("_access", "buffer access", Access)
    )

    void(
        "set_compute_dynamic_index_buffer",
        "Sets compute dynamic index buffer.",

        MapToInt..uint8_t.IN("_stage", "compute stage"),
        bgfx_dynamic_index_buffer_handle_t.IN("_handle", "dynamic index buffer handle"),
        bgfx_access_t.IN("_access", "buffer access", Access)
    )

    void(
        "set_compute_dynamic_vertex_buffer",
        "Sets compute dynamic vertex buffer.",

        MapToInt..uint8_t.IN("_stage", "compute stage"),
        bgfx_dynamic_vertex_buffer_handle_t.IN("_handle", "dynamic vertex buffer handle"),
        bgfx_access_t.IN("_access", "buffer access", Access)
    )

    void(
        "set_compute_indirect_buffer",
        "Sets compute indirect buffer.",

        MapToInt..uint8_t.IN("_stage", "compute stage"),
        bgfx_indirect_buffer_handle_t.IN("_handle", "indirect buffer handle"),
        bgfx_access_t.IN("_access", "buffer access", Access)
    )

    uint32_t(
        "dispatch",
        "Dispatches compute.",

        MapToInt..uint8_t.IN("_id", "view id"),
        bgfx_program_handle_t.IN("_handle", "compute program"),
        MapToInt..uint16_t.IN("_numX", "number of groups X"),
        MapToInt..uint16_t.IN("_numY", "number of groups Y"),
        MapToInt..uint16_t.IN("_numZ", "number of groups Z"),
        MapToInt..uint8_t.IN("_flags", "view flags", SubmitFlags)
    )

    uint32_t(
        "dispatch_indirect",
        "Dispatches compute indirect.",

        MapToInt..uint8_t.IN("_id", "view id"),
        bgfx_program_handle_t.IN("_handle", "compute program"),
        bgfx_indirect_buffer_handle_t.IN("_indirectHandle", "indirect buffer"),
        MapToInt..uint16_t.IN("_start", "first element in indirect buffer"),
        MapToInt..uint16_t.IN("_num", "number of dispatches"),
        MapToInt..uint8_t.IN("_flags", "view flags", SubmitFlags)
    )

    void(
        "discard",
        "Discards all previously set state for draw or compute call."
    )

    void(
        "blit",
        """
        Blits texture region between two textures.

        Destination texture must be create with #TEXTURE_BLIT_DST flag. Availability depends on #CAPS_TEXTURE_BLIT.
        """,

        MapToInt..uint8_t.IN("_id", "view id"),
        bgfx_texture_handle_t.IN("_dst", "destination texture handle"),
        MapToInt..uint8_t.IN("_dstMip", "destination texture mip level"),
        MapToInt..uint16_t.IN("_dstX", "destination texture X position"),
        MapToInt..uint16_t.IN("_dstY", "destination texture Y position"),
        MapToInt..uint16_t.IN(
            "_dstZ",
            """
            if texture is 2D this argument should be 0. If destination texture is cube this argument represent destination texture cube face. For 3D texture
            this argument represent destination texture Z position.
            """
        ),
        bgfx_texture_handle_t.IN("_src", "source texture handle"),
        MapToInt..uint8_t.IN("_srcMip", "source texture mip level"),
        MapToInt..uint16_t.IN("_srcX", "source texture X position"),
        MapToInt..uint16_t.IN("_srcY", "source texture Y position"),
        MapToInt..uint16_t.IN(
            "_srcZ",
            """
            if texture is 2D this argument should be 0. If destination texture is cube this argument represent destination texture cube face. For 3D texture
            this argument represent destination texture Z position.
            """
        ),
        MapToInt..uint16_t.IN("_width", "width of region"),
        MapToInt..uint16_t.IN("_height", "height of region"),
        MapToInt..uint16_t.IN("_depth", "if texture is 3D this argument represent depth of region, otherwise is unused")
    )

    void(
        "request_screen_shot",
        "Requests screen shot.",

        bgfx_frame_buffer_handle_t.IN("_handle", "frame buffer handle"),
        const..charASCII_p.IN("_filePath", "will be passed to ##BGFXScreenShotCallback")
    )

    macro(expression = "(_ref << BGFX_STATE_ALPHA_REF_SHIFT) & BGFX_STATE_ALPHA_REF_MASK")..uint64_t(
        "BGFX_STATE_ALPHA_REF", "",
        uint64_t.IN("_ref", ""),
        noPrefix = true
    )

    macro(expression = "(_size << BGFX_STATE_POINT_SIZE_SHIFT) & BGFX_STATE_POINT_SIZE_MASK")..uint64_t(
        "BGFX_STATE_POINT_SIZE", "",
        uint64_t.IN("_size", ""),
        noPrefix = true
    )

    macro(expression = "((_srcRGB | (_dstRGB << 4))) | ((_srcA | (_dstA << 4)) << 8)")..uint64_t(
        "BGFX_STATE_BLEND_FUNC_SEPARATE", "",
        uint64_t.IN("_srcRGB", ""),
        uint64_t.IN("_dstRGB", ""),
        uint64_t.IN("_srcA", ""),
        uint64_t.IN("_dstA", ""),
        noPrefix = true
    )

    macro(expression = "_rgb | (_a << 3)")..uint64_t(
        "BGFX_STATE_BLEND_EQUATION_SEPARATE", "",
        uint64_t.IN("_rgb", ""),
        uint64_t.IN("_a", ""),
        noPrefix = true
    )

    macro(expression = "BGFX_STATE_BLEND_FUNC_SEPARATE(_src, _dst, _src, _dst)")..uint64_t(
        "BGFX_STATE_BLEND_FUNC", "",
        uint64_t.IN("_src", ""),
        uint64_t.IN("_dst", ""),
        noPrefix = true
    )

    macro(expression = "BGFX_STATE_BLEND_EQUATION_SEPARATE(_equation, _equation)")..uint64_t(
        "BGFX_STATE_BLEND_EQUATION", "",
        uint64_t.IN("_equation", ""),
        noPrefix = true
    )

    LongConstant(
        "Blend state macros",

        "STATE_BLEND_ADD".."BGFX_STATE_BLEND_FUNC(BGFX_STATE_BLEND_ONE, BGFX_STATE_BLEND_ONE)",
        "STATE_BLEND_ALPHA".."BGFX_STATE_BLEND_FUNC(BGFX_STATE_BLEND_SRC_ALPHA, BGFX_STATE_BLEND_INV_SRC_ALPHA)",
        "STATE_BLEND_DARKEN".."BGFX_STATE_BLEND_FUNC(BGFX_STATE_BLEND_ONE, BGFX_STATE_BLEND_ONE) | BGFX_STATE_BLEND_EQUATION(BGFX_STATE_BLEND_EQUATION_MIN)",
        "STATE_BLEND_LIGHTEN".."BGFX_STATE_BLEND_FUNC(BGFX_STATE_BLEND_ONE, BGFX_STATE_BLEND_ONE) | BGFX_STATE_BLEND_EQUATION(BGFX_STATE_BLEND_EQUATION_MAX)",
        "STATE_BLEND_MULTIPLY".."BGFX_STATE_BLEND_FUNC(BGFX_STATE_BLEND_DST_COLOR, BGFX_STATE_BLEND_ZERO)",
        "STATE_BLEND_NORMAL".."BGFX_STATE_BLEND_FUNC(BGFX_STATE_BLEND_ONE, BGFX_STATE_BLEND_INV_SRC_ALPHA)",
        "STATE_BLEND_SCREEN".."BGFX_STATE_BLEND_FUNC(BGFX_STATE_BLEND_ONE, BGFX_STATE_BLEND_INV_SRC_COLOR)",
        "STATE_BLEND_LINEAR_BURN".."BGFX_STATE_BLEND_FUNC(BGFX_STATE_BLEND_DST_COLOR, BGFX_STATE_BLEND_INV_DST_COLOR) | BGFX_STATE_BLEND_EQUATION(BGFX_STATE_BLEND_EQUATION_SUB)"
    )

    macro(expression = "(_src >> BGFX_STATE_BLEND_SHIFT) | ((_dst >> BGFX_STATE_BLEND_SHIFT) << 4)")..uint64_t(
        "BGFX_STATE_BLEND_FUNC_RT_x", "",
        uint64_t.IN("_src", ""),
        uint64_t.IN("_dst", ""),
        noPrefix = true
    )

    macro(expression = "BGFX_STATE_BLEND_FUNC_RT_x(_src, _dst) | ((_equation >> BGFX_STATE_BLEND_EQUATION_SHIFT) << 8)")..uint64_t(
        "BGFX_STATE_BLEND_FUNC_RT_xE", "",
        uint64_t.IN("_src", ""),
        uint64_t.IN("_dst", ""),
        uint64_t.IN("_equation", ""),
        noPrefix = true
    )

    macro(expression = "BGFX_STATE_BLEND_FUNC_RT_x(_src, _dst) << 0")..uint64_t(
        "BGFX_STATE_BLEND_FUNC_RT_1", "",
        uint64_t.IN("_src", ""),
        uint64_t.IN("_dst", ""),
        noPrefix = true
    )

    macro(expression = "BGFX_STATE_BLEND_FUNC_RT_x(_src, _dst) << 11")..uint64_t(
        "BGFX_STATE_BLEND_FUNC_RT_2", "",
        uint64_t.IN("_src", ""),
        uint64_t.IN("_dst", ""),
        noPrefix = true
    )

    macro(expression = "BGFX_STATE_BLEND_FUNC_RT_x(_src, _dst) << 22")..uint64_t(
        "BGFX_STATE_BLEND_FUNC_RT_3", "",
        uint64_t.IN("_src", ""),
        uint64_t.IN("_dst", ""),
        noPrefix = true
    )

    macro(expression = "BGFX_STATE_BLEND_FUNC_RT_xE(_src, _dst, _equation) << 0")..uint64_t(
        "BGFX_STATE_BLEND_FUNC_RT_1E", "",
        uint64_t.IN("_src", ""),
        uint64_t.IN("_dst", ""),
        uint64_t.IN("_equation", ""),
        noPrefix = true
    )

    macro(expression = "BGFX_STATE_BLEND_FUNC_RT_xE(_src, _dst, _equation) << 11")..uint64_t(
        "BGFX_STATE_BLEND_FUNC_RT_2E", "",
        uint64_t.IN("_src", ""),
        uint64_t.IN("_dst", ""),
        uint64_t.IN("_equation", ""),
        noPrefix = true
    )

    macro(expression = "BGFX_STATE_BLEND_FUNC_RT_xE(_src, _dst, _equation) << 22")..uint64_t(
        "BGFX_STATE_BLEND_FUNC_RT_3E", "",
        uint64_t.IN("_src", ""),
        uint64_t.IN("_dst", ""),
        uint64_t.IN("_equation", ""),
        noPrefix = true
    )

    macro(expression = "(_ref << BGFX_STENCIL_FUNC_REF_SHIFT) & BGFX_STENCIL_FUNC_REF_MASK")..uint32_t(
        "BGFX_STENCIL_FUNC_REF", "",
        uint32_t.IN("_ref", ""),
        noPrefix = true
    )

    macro(expression = "(_mask << BGFX_STENCIL_FUNC_RMASK_SHIFT) & BGFX_STENCIL_FUNC_RMASK_MASK")..uint32_t(
        "BGFX_STENCIL_FUNC_RMASK", "",
        uint32_t.IN("_mask", ""),
        noPrefix = true
    )

    macro(expression = "(_index << BGFX_TEXTURE_BORDER_COLOR_SHIFT) & BGFX_TEXTURE_BORDER_COLOR_MASK")..uint32_t(
        "BGFX_TEXTURE_BORDER_COLOR", "",
        uint32_t.IN("_index", ""),
        noPrefix = true
    )
}