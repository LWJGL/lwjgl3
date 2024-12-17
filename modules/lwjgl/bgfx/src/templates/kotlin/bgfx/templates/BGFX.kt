/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bgfx.templates

import bgfx.*
import org.lwjgl.generator.*

val BGFX = "BGFX".nativeClass(Module.BGFX, prefix = "BGFX", prefixMethod = "bgfx_", binding = BGFX_BINDING) {
    IntConstant(
        "API_VERSION".."129"
    )

    ShortConstant(
        "INVALID_HANDLE"..0xFFFF.s
    )

    LongConstant(
        "STATE_WRITE_R"..0x0000000000000001L,
        "STATE_WRITE_G"..0x0000000000000002L,
        "STATE_WRITE_B"..0x0000000000000004L,
        "STATE_WRITE_A"..0x0000000000000008L,
        "STATE_WRITE_Z"..0x0000004000000000L,
        "STATE_WRITE_RGB".."BGFX_STATE_WRITE_R | BGFX_STATE_WRITE_G | BGFX_STATE_WRITE_B",
        "STATE_WRITE_MASK".."BGFX_STATE_WRITE_RGB | BGFX_STATE_WRITE_A | BGFX_STATE_WRITE_Z",

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

        "STATE_FRONT_CCW"..0x0000008000000000L,

        "STATE_BLEND_INDEPENDENT"..0x0000000400000000L,
        "STATE_BLEND_ALPHA_TO_COVERAGE"..0x0000000800000000L,

        "STATE_DEFAULT".."""(0L
        | BGFX_STATE_WRITE_RGB
        | BGFX_STATE_WRITE_A
        | BGFX_STATE_WRITE_Z
        | BGFX_STATE_DEPTH_TEST_LESS
        | BGFX_STATE_CULL_CW
        | BGFX_STATE_MSAA)
        """
    )

    LongConstant(
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
    )

    IntConstant(
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

    IntConstant(
        "CLEAR_NONE"..0x0000,
        "CLEAR_COLOR"..0x0001,
        "CLEAR_DEPTH"..0x0002,
        "CLEAR_STENCIL"..0x0004,
        "CLEAR_DISCARD_COLOR_0"..0x0008,
        "CLEAR_DISCARD_COLOR_1"..0x0010,
        "CLEAR_DISCARD_COLOR_2"..0x0020,
        "CLEAR_DISCARD_COLOR_3"..0x0040,
        "CLEAR_DISCARD_COLOR_4"..0x0080,
        "CLEAR_DISCARD_COLOR_5"..0x0100,
        "CLEAR_DISCARD_COLOR_6"..0x0200,
        "CLEAR_DISCARD_COLOR_7"..0x0400,
        "CLEAR_DISCARD_DEPTH"..0x0800,
        "CLEAR_DISCARD_STENCIL"..0x1000,

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

    ByteConstant(
        "DISCARD_NONE"..0x00.b,
        "DISCARD_BINDINGS"..0x01.b,
        "DISCARD_INDEX_BUFFER"..0x02.b,
        "DISCARD_INSTANCE_DATA"..0x04.b,
        "DISCARD_STATE"..0x08.b,
        "DISCARD_TRANSFORM"..0x10.b,
        "DISCARD_VERTEX_STREAMS"..0x20.b,
        "DISCARD_ALL"..0xff.b
    )

    EnumConstant(
        "DEBUG_NONE".enum(0x00000000),
        "DEBUG_WIREFRAME".enum(0x00000001),
        "DEBUG_IFH".enum(
            0x00000002
        ),
        "DEBUG_STATS".enum(0x00000004),
        "DEBUG_TEXT".enum(0x00000008),
        "DEBUG_PROFILER".enum(
            0x00000010
        )
    )

    IntConstant(
        "BUFFER_NONE"..0x0000,
        "BUFFER_COMPUTE_READ"..0x0100,
        "BUFFER_COMPUTE_WRITE"..0x0200,
        "BUFFER_DRAW_INDIRECT"..0x0400,
        "BUFFER_ALLOW_RESIZE"..0x0800,
        "BUFFER_INDEX32"..0x1000,

        "BUFFER_COMPUTE_READ_WRITE".."""(0
        | BGFX_BUFFER_COMPUTE_READ
        | BGFX_BUFFER_COMPUTE_WRITE)
        """
    )

    ShortConstant(
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

        "BUFFER_COMPUTE_TYPE_INT"..0x0010.s,
        "BUFFER_COMPUTE_TYPE_UINT"..0x0020.s,
        "BUFFER_COMPUTE_TYPE_FLOAT"..0x0030.s,
        "BUFFER_COMPUTE_TYPE_SHIFT".."4",
        "BUFFER_COMPUTE_TYPE_MASK"..0x0030.s
    )

    LongConstant(
        "TEXTURE_NONE"..0x0000000000000000L,
        "TEXTURE_MSAA_SAMPLE"..0x0000000800000000L,
        "TEXTURE_RT"..0x0000001000000000L,
        "TEXTURE_RT_MSAA_X2"..0x0000002000000000L,
        "TEXTURE_RT_MSAA_X4"..0x0000003000000000L,
        "TEXTURE_RT_MSAA_X8"..0x0000004000000000L,
        "TEXTURE_RT_MSAA_X16"..0x0000005000000000L,
        "TEXTURE_RT_WRITE_ONLY"..0x0000008000000000L,
        "TEXTURE_COMPUTE_WRITE"..0x0000100000000000L,
        "TEXTURE_SRGB"..0x0000200000000000L,
        "TEXTURE_BLIT_DST"..0x0000400000000000L,
        "TEXTURE_READ_BACK"..0x0000800000000000L
    )

    IntConstant(
        "TEXTURE_RT_MSAA_SHIFT".."36"
    )

    LongConstant(
        "TEXTURE_RT_MSAA_MASK"..0x0000007000000000L,
        "TEXTURE_RT_MASK"..0x000000f000000000L
    )

    IntConstant(
        "SAMPLER_NONE"..0x00000000,

        "SAMPLER_U_MIRROR"..0x00000001,
        "SAMPLER_U_CLAMP"..0x00000002,
        "SAMPLER_U_BORDER"..0x00000003,

        "SAMPLER_V_MIRROR"..0x00000004,
        "SAMPLER_V_CLAMP"..0x00000008,
        "SAMPLER_V_BORDER"..0x0000000c,

        "SAMPLER_W_MIRROR"..0x00000010,
        "SAMPLER_W_CLAMP"..0x00000020,
        "SAMPLER_W_BORDER"..0x00000030,

        "SAMPLER_UVW_MIRROR".."(0 | BGFX_SAMPLER_U_MIRROR | BGFX_SAMPLER_V_MIRROR | BGFX_SAMPLER_W_MIRROR)",
        "SAMPLER_UVW_CLAMP".."(0 | BGFX_SAMPLER_U_CLAMP | BGFX_SAMPLER_V_CLAMP | BGFX_SAMPLER_W_CLAMP)",
        "SAMPLER_UVW_BORDER".."(0 | BGFX_SAMPLER_U_BORDER | BGFX_SAMPLER_V_BORDER | BGFX_SAMPLER_W_BORDER)",

        "SAMPLER_MIN_POINT"..0x00000040,
        "SAMPLER_MIN_ANISOTROPIC"..0x00000080,

        "SAMPLER_MAG_POINT"..0x00000100,
        "SAMPLER_MAG_ANISOTROPIC"..0x00000200,

        "SAMPLER_MIP_POINT"..0x00000400,

        "SAMPLER_POINT".."(0 | BGFX_SAMPLER_MIN_POINT | BGFX_SAMPLER_MAG_POINT | BGFX_SAMPLER_MIP_POINT)",

        "SAMPLER_COMPARE_LESS"..0x00010000,
        "SAMPLER_COMPARE_LEQUAL"..0x00020000,
        "SAMPLER_COMPARE_EQUAL"..0x00030000,
        "SAMPLER_COMPARE_GEQUAL"..0x00040000,
        "SAMPLER_COMPARE_GREATER"..0x00050000,
        "SAMPLER_COMPARE_NOTEQUAL"..0x00060000,
        "SAMPLER_COMPARE_NEVER"..0x00070000,
        "SAMPLER_COMPARE_ALWAYS"..0x00080000,

        "SAMPLER_SAMPLE_STENCIL"..0x00100000
    )

    IntConstant(
        "SAMPLER_U_SHIFT".."0",
        "SAMPLER_U_MASK"..0x00000003,

        "SAMPLER_V_SHIFT".."2",
        "SAMPLER_V_MASK"..0x0000000c,

        "SAMPLER_W_SHIFT".."4",
        "SAMPLER_W_MASK"..0x00000030,

        "SAMPLER_MIN_SHIFT".."6",
        "SAMPLER_MIN_MASK"..0x000000c0,

        "SAMPLER_MAG_SHIFT".."8",
        "SAMPLER_MAG_MASK"..0x00000300,

        "SAMPLER_MIP_SHIFT".."10",
        "SAMPLER_MIP_MASK"..0x00000400,

        "SAMPLER_COMPARE_SHIFT".."16",
        "SAMPLER_COMPARE_MASK"..0x000f0000,

        "SAMPLER_BORDER_COLOR_SHIFT".."24",
        "SAMPLER_BORDER_COLOR_MASK"..0x0f000000,

        "SAMPLER_RESERVED_SHIFT".."28",
        "SAMPLER_RESERVED_MASK".."0xF0000000",

        "SAMPLER_SAMPLER_BITS_MASK".."""(0
        | BGFX_SAMPLER_U_MASK
        | BGFX_SAMPLER_V_MASK
        | BGFX_SAMPLER_W_MASK
        | BGFX_SAMPLER_MIN_MASK
        | BGFX_SAMPLER_MAG_MASK
        | BGFX_SAMPLER_MIP_MASK
        | BGFX_SAMPLER_COMPARE_MASK)
        """
    )

    IntConstant(
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
        "RESET_FLUSH_AFTER_RENDER"..0x00002000,
        "RESET_FLIP_AFTER_RENDER"..0x00004000,
        "RESET_SRGB_BACKBUFFER"..0x00008000,
        "RESET_HDR10"..0x00010000,
        "RESET_HIDPI"..0x00020000,
        "RESET_DEPTH_CLAMP"..0x00040000,
        "RESET_SUSPEND"..0x00080000,
        "RESET_TRANSPARENT_BACKBUFFER"..0x00100000
    )

    IntConstant(
        "RESET_RESERVED_SHIFT".."31",
        "RESET_RESERVED_MASK".."0x80000000"
    )

    LongConstant(
        "CAPS_ALPHA_TO_COVERAGE"..0x0000000000000001L,
        "CAPS_BLEND_INDEPENDENT"..0x0000000000000002L,
        "CAPS_COMPUTE"..0x0000000000000004L,
        "CAPS_CONSERVATIVE_RASTER"..0x0000000000000008L,
        "CAPS_DRAW_INDIRECT"..0x0000000000000010L,
        "CAPS_DRAW_INDIRECT_COUNT"..0x0000000000000020L,
        "CAPS_FRAGMENT_DEPTH"..0x0000000000000040L,
        "CAPS_FRAGMENT_ORDERING"..0x0000000000000080L,
        "CAPS_GRAPHICS_DEBUGGER"..0x0000000000000100L,
        "CAPS_HDR10"..0x0000000000000200L,
        "CAPS_HIDPI"..0x0000000000000400L,
        "CAPS_IMAGE_RW"..0x0000000000000800L,
        "CAPS_INDEX32"..0x0000000000001000L,
        "CAPS_INSTANCING"..0x0000000000002000L,
        "CAPS_OCCLUSION_QUERY"..0x0000000000004000L,
        "CAPS_PRIMITIVE_ID"..0x0000000000008000L,
        "CAPS_RENDERER_MULTITHREADED"..0x0000000000010000L,
        "CAPS_SWAP_CHAIN"..0x0000000000020000L,
        "CAPS_TEXTURE_BLIT"..0x0000000000040000L,
        "CAPS_TEXTURE_COMPARE_LEQUAL"..0x0000000000080000L,
        "CAPS_TEXTURE_COMPARE_RESERVED"..0x0000000000100000L,
        "CAPS_TEXTURE_CUBE_ARRAY"..0x0000000000200000L,
        "CAPS_TEXTURE_DIRECT_ACCESS"..0x0000000000400000L,
        "CAPS_TEXTURE_READ_BACK"..0x0000000000800000L,
        "CAPS_TEXTURE_2D_ARRAY"..0x0000000001000000L,
        "CAPS_TEXTURE_3D"..0x0000000002000000L,
        "CAPS_TRANSPARENT_BACKBUFFER"..0x0000000004000000L,
        "CAPS_VERTEX_ATTRIB_HALF"..0x0000000008000000L,
        "CAPS_VERTEX_ATTRIB_UINT10"..0x0000000010000000L,
        "CAPS_VERTEX_ID"..0x0000000020000000L,
        "CAPS_VIEWPORT_LAYER_ARRAY"..0x0000000040000000L,
        "CAPS_TEXTURE_COMPARE_ALL".."BGFX_CAPS_TEXTURE_COMPARE_RESERVED | BGFX_CAPS_TEXTURE_COMPARE_LEQUAL"
    )

    IntConstant(
        "CAPS_FORMAT_TEXTURE_NONE"..0x00000000,
        "CAPS_FORMAT_TEXTURE_2D"..0x00000001,
        "CAPS_FORMAT_TEXTURE_2D_SRGB"..0x00000002,
        "CAPS_FORMAT_TEXTURE_2D_EMULATED"..0x00000004,
        "CAPS_FORMAT_TEXTURE_3D"..0x00000008,
        "CAPS_FORMAT_TEXTURE_3D_SRGB"..0x00000010,
        "CAPS_FORMAT_TEXTURE_3D_EMULATED"..0x00000020,
        "CAPS_FORMAT_TEXTURE_CUBE"..0x00000040,
        "CAPS_FORMAT_TEXTURE_CUBE_SRGB"..0x00000080,
        "CAPS_FORMAT_TEXTURE_CUBE_EMULATED"..0x00000100,
        "CAPS_FORMAT_TEXTURE_VERTEX"..0x00000200,
        "CAPS_FORMAT_TEXTURE_IMAGE_READ"..0x00000400,
        "CAPS_FORMAT_TEXTURE_IMAGE_WRITE"..0x00000800,
        "CAPS_FORMAT_TEXTURE_FRAMEBUFFER"..0x00001000,
        "CAPS_FORMAT_TEXTURE_FRAMEBUFFER_MSAA"..0x00002000,
        "CAPS_FORMAT_TEXTURE_MSAA"..0x00004000,
        "CAPS_FORMAT_TEXTURE_MIP_AUTOGEN"..0x00008000
    )

    ByteConstant(
        "RESOLVE_NONE"..0x00.b,
        "RESOLVE_AUTO_GEN_MIPS"..0x01.b
    )

    ShortConstant(
        "PCI_ID_NONE"..0x0000.s,
        "PCI_ID_SOFTWARE_RASTERIZER"..0x0001.s,
        "PCI_ID_AMD"..0x1002.s,
        "PCI_ID_APPLE"..0x106b.s,
        "PCI_ID_INTEL".."(short)0x8086",
        "PCI_ID_NVIDIA"..0x10de.s,
        "PCI_ID_MICROSOFT"..0x1414.s,
        "PCI_ID_ARM"..0x13b5.s
    )

    ByteConstant(
        "CUBE_MAP_POSITIVE_X"..0x00.b,
        "CUBE_MAP_NEGATIVE_X"..0x01.b,
        "CUBE_MAP_POSITIVE_Y"..0x02.b,
        "CUBE_MAP_NEGATIVE_Y"..0x03.b,
        "CUBE_MAP_POSITIVE_Z"..0x04.b,
        "CUBE_MAP_NEGATIVE_Z"..0x05.b
    )

    EnumConstant(
        "FATAL_DEBUG_CHECK".enum,
        "FATAL_INVALID_SHADER".enum,
        "FATAL_UNABLE_TO_INITIALIZE".enum,
        "FATAL_UNABLE_TO_CREATE_TEXTURE".enum,
        "FATAL_DEVICE_LOST".enum,

        "FATAL_COUNT".enum
    )

    EnumConstant(
        "RENDERER_TYPE_NOOP".enum,
        "RENDERER_TYPE_AGC".enum,
        "RENDERER_TYPE_DIRECT3D11".enum,
        "RENDERER_TYPE_DIRECT3D12".enum,
        "RENDERER_TYPE_GNM".enum,
        "RENDERER_TYPE_METAL".enum,
        "RENDERER_TYPE_NVN".enum,
        "RENDERER_TYPE_OPENGLES".enum,
        "RENDERER_TYPE_OPENGL".enum,
        "RENDERER_TYPE_VULKAN".enum,

        "RENDERER_TYPE_COUNT".enum
    )

    EnumConstant(
        "ACCESS_READ".enum,
        "ACCESS_WRITE".enum,
        "ACCESS_READWRITE".enum,

        "ACCESS_COUNT".enum
    )

    EnumConstant(
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

        "ATTRIB_COUNT".enum("BGFX_ATTRIB_TEXCOORD7 + 1")
    )

    EnumConstant(
        "ATTRIB_TYPE_UINT8".enum,
        "ATTRIB_TYPE_UINT10".enum,
        "ATTRIB_TYPE_INT16".enum,
        "ATTRIB_TYPE_HALF".enum,
        "ATTRIB_TYPE_FLOAT".enum,

        "ATTRIB_TYPE_COUNT".enum("BGFX_ATTRIB_TYPE_FLOAT + 1")
    )

    EnumConstant(
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
        "TEXTURE_FORMAT_ATC".enum,
        "TEXTURE_FORMAT_ATCE".enum,
        "TEXTURE_FORMAT_ATCI".enum,
        "TEXTURE_FORMAT_ASTC4x4".enum,
        "TEXTURE_FORMAT_ASTC5X4".enum,
        "TEXTURE_FORMAT_ASTC5x5".enum,
        "TEXTURE_FORMAT_ASTC6X5".enum,
        "TEXTURE_FORMAT_ASTC6x6".enum,
        "TEXTURE_FORMAT_ASTC8x5".enum,
        "TEXTURE_FORMAT_ASTC8x6".enum,
        "TEXTURE_FORMAT_ASTC8X8".enum,
        "TEXTURE_FORMAT_ASTC10x5".enum,
        "TEXTURE_FORMAT_ASTC10X6".enum,
        "TEXTURE_FORMAT_ASTC10X8".enum,
        "TEXTURE_FORMAT_ASTC10X10".enum,
        "TEXTURE_FORMAT_ASTC12X10".enum,
        "TEXTURE_FORMAT_ASTC12X12".enum,

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
        "TEXTURE_FORMAT_B5G6R5".enum,
        "TEXTURE_FORMAT_R5G6B5".enum,
        "TEXTURE_FORMAT_BGRA4".enum,
        "TEXTURE_FORMAT_RGBA4".enum,
        "TEXTURE_FORMAT_BGR5A1".enum,
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

        "TEXTURE_FORMAT_COUNT".enum("BGFX_TEXTURE_FORMAT_D0S8 + 1")
    )

    EnumConstant(
        "UNIFORM_TYPE_SAMPLER".enum,
        "UNIFORM_TYPE_END".enum,

        "UNIFORM_TYPE_VEC4".enum,
        "UNIFORM_TYPE_MAT3".enum,
        "UNIFORM_TYPE_MAT4".enum,

        "UNIFORM_TYPE_COUNT".enum
    )

    EnumConstant(
        "BACKBUFFER_RATIO_EQUAL".enum,
        "BACKBUFFER_RATIO_HALF".enum,
        "BACKBUFFER_RATIO_QUARTER".enum,
        "BACKBUFFER_RATIO_EIGHTH".enum,
        "BACKBUFFER_RATIO_SIXTEENTH".enum,
        "BACKBUFFER_RATIO_DOUBLE".enum,

        "BACKBUFFER_RATIO_COUNT".enum
    )

    EnumConstant(
        "OCCLUSION_QUERY_RESULT_INVISIBLE".enum,
        "OCCLUSION_QUERY_RESULT_VISIBLE".enum,
        "OCCLUSION_QUERY_RESULT_NORESULT".enum,

        "OCCLUSION_QUERY_RESULT_COUNT".enum
    )

    EnumConstant(
        "TOPOLOGY_TRI_LIST".enum,
        "TOPOLOGY_TRI_STRIP".enum,
        "TOPOLOGY_LINE_LIST".enum,
        "TOPOLOGY_LINE_STRIP".enum,
        "TOPOLOGY_POINT_LIST".enum,

        "TOPOLOGY_COUNT".enum
    )

    EnumConstant(
        "TOPOLOGY_CONVERT_TRI_LIST_FLIP_WINDING".enum,
        "TOPOLOGY_CONVERT_TRI_STRIP_FLIP_WINDING".enum,
        "TOPOLOGY_CONVERT_TRI_LIST_TO_LINE_LIST".enum,
        "TOPOLOGY_CONVERT_TRI_STRIP_TO_TRI_LIST".enum,
        "TOPOLOGY_CONVERT_LINE_STRIP_TO_LINE_LIST".enum,

        "TOPOLOGY_CONVERT_COUNT".enum
    )

    EnumConstant(
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
    )

    EnumConstant(
        "VIEW_MODE_DEFAULT".enum,
        "VIEW_MODE_SEQUENTIAL".enum,
        "VIEW_MODE_DEPTH_ASCENDING".enum,
        "VIEW_MODE_DEPTH_DESCENDING".enum,

        "VIEW_MODE_COUNT".enum
    )

    EnumConstant(
        "NATIVE_WINDOW_HANDLE_TYPE_DEFAULT".enum,
        "NATIVE_WINDOW_HANDLE_TYPE_WAYLAND".enum,

        "NATIVE_WINDOW_HANDLE_TYPE_COUNT".enum
    )

    void(
        "attachment_init",

        bgfx_attachment_t.p("_this"),
        bgfx_texture_handle_t("_handle"),
        bgfx_access_t("_access"),
        MapToInt..uint16_t("_layer"),
        MapToInt..uint16_t("_numLayers"),
        MapToInt..uint16_t("_mip"),
        MapToInt..uint8_t("_resolve")
    )

    bgfx_vertex_layout_t.p(
        "vertex_layout_begin",

        bgfx_vertex_layout_t.p("_this"),
        bgfx_renderer_type_t("_renderer")
    )

    bgfx_vertex_layout_t.p(
        "vertex_layout_add",

        bgfx_vertex_layout_t.p("_this"),
        bgfx_attrib_t("_attrib"),
        MapToInt..uint8_t("_num"),
        bgfx_attrib_type_t("_type"),
        bool("_normalized"),
        bool("_asInt")
    )

    void(
        "vertex_layout_decode",

        bgfx_vertex_layout_t.const.p("_this"),
        bgfx_attrib_t("_attrib"),
        Check(1)..uint8_t.p("_num"),
        Check(1)..bgfx_attrib_type_t.p("_type"),
        Check(1)..bool.p("_normalized"),
        Check(1)..bool.p("_asInt")
    )

    bool(
        "vertex_layout_has",

        bgfx_vertex_layout_t.const.p("_this"),
        bgfx_attrib_t("_attr")
    )

    bgfx_vertex_layout_t.p(
        "vertex_layout_skip",

        bgfx_vertex_layout_t.p("_this"),
        MapToInt..uint8_t("_num")
    )

    void(
        "vertex_layout_end",

        bgfx_vertex_layout_t.p("_this")
    )

    uint16_t(
        "vertex_layout_get_offset",

        bgfx_vertex_layout_t.const.p("_this"),
        bgfx_attrib_t("_attrib")
    )

    uint16_t(
        "vertex_layout_get_stride",

        bgfx_vertex_layout_t.const.p("_this")
    )

    uint32_t(
        "vertex_layout_get_size",

        bgfx_vertex_layout_t.const.p("_this"),
        uint32_t("_num")
    )

    void(
        "vertex_pack",

        Check(4)..float.const.p("_input"),
        bool("_inputNormalized"),
        bgfx_attrib_t("_attr"),
        bgfx_vertex_layout_t.const.p("_layout"),
        Unsafe..void.p("_data"),
        uint32_t("_index")
    )

    void(
        "vertex_unpack",

        Check(4)..float.p("_output"),
        bgfx_attrib_t("_attr"),
        bgfx_vertex_layout_t.const.p("_layout"),
        Unsafe..void.const.p("_data"),
        uint32_t("_index")
    )

    void(
        "vertex_convert",

        bgfx_vertex_layout_t.const.p("_dstLayout"),
        Unsafe..void.p("_dstData"),
        bgfx_vertex_layout_t.const.p("_srcLayout"),
        Unsafe..void.const.p("_srcData"),
        uint32_t("_num")
    )

    uint32_t(
        "weld_vertices",

        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT
        )..void.p("_output"),
        bgfx_vertex_layout_t.const.p("_layout"),
        Unsafe..void.const.p("_data"),
        AutoSizeShr("_index32 ? 2 : 1", "_output")..uint32_t("_num"),
        bool("_index32"),
        float("_epsilon")
    )

    uint32_t(
        "topology_convert",

        bgfx_topology_convert_t("_conversion"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT
        )..nullable..void.p("_dst"),
        AutoSize("_dst")..uint32_t("_dstSize"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT
        )..void.const.p("_indices"),
        AutoSizeShr("_index32 ? 2 : 1", "_indices")..uint32_t("_numIndices"),
        bool("_index32")
    )

    void(
        "topology_sort_tri_list",

        bgfx_topology_sort_t("_sort"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT
        )..void.p("_dst"),
        AutoSize("_dst")..uint32_t("_dstSize"),
        Check(3)..float.const.p("_dir"),
        Check(3)..float.const.p("_pos"),
        Unsafe..void.const.p("_vertices"),
        uint32_t("_stride"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT
        )..void.const.p("_indices"),
        AutoSizeShr("_index32 ? 2 : 1", "_indices")..uint32_t("_numIndices"),
        bool("_index32")
    )

    uint8_t(
        "get_supported_renderers",

        AutoSize("_enum")..MapToInt..uint8_t("_max"),
        bgfx_renderer_type_t.p("_enum")
    )

    charASCII.const.p(
        "get_renderer_name",

        bgfx_renderer_type_t("_type")
    )

    void(
        "init_ctor",

        bgfx_init_t.p("_init")
    )

    bool(
        "init",

        bgfx_init_t.const.p("_init")
    )

    void("shutdown", void())

    void(
        "reset",

        uint32_t("_width"),
        uint32_t("_height"),
        uint32_t("_flags"),
        bgfx_texture_format_t("_format")
    )

    uint32_t(
        "frame",

        bool("_capture")
    )

    bgfx_renderer_type_t(
        "get_renderer_type",
        void()
    )

    bgfx_caps_t.const.p(
        "get_caps",
        void()
    )

    bgfx_stats_t.const.p(
        "get_stats",
        void()
    )

    bgfx_memory_t.const.p(
        "alloc",

        uint32_t("_size")
    )

    bgfx_memory_t.const.p(
        "copy",

        MultiTypeAll..void.const.p("_data"),
        AutoSize("_data")..uint32_t("_size")
    )

    OffHeapOnly..bgfx_memory_t.const.p(
        "make_ref",

        MultiTypeAll..void.const.p("_data"),
        AutoSize("_data")..uint32_t("_size")
    )

    OffHeapOnly..bgfx_memory_t.const.p(
        "make_ref_release",

        MultiTypeAll..void.const.p("_data"),
        AutoSize("_data")..uint32_t("_size"),
        bgfx_release_fn_t("_releaseFn"),
        nullable..opaque_p("_userData")
    )

    void(
        "set_debug",

        uint32_t("_debug")
    )

    void(
        "dbg_text_clear",

        MapToInt..uint8_t("_attr"),
        bool("_small")
    )

    void(
        "dbg_text_printf",

        MapToInt..uint16_t("_x"),
        MapToInt..uint16_t("_y"),
        MapToInt..uint8_t("_attr"),
        charASCII.const.p("_format")
    )

    void(
        "dbg_text_vprintf",

        MapToInt..uint16_t("_x"),
        MapToInt..uint16_t("_y"),
        MapToInt..uint8_t("_attr"),
        charASCII.const.p("_format"),
        va_list("_argList")
    )

    void(
        "dbg_text_image",

        MapToInt..uint16_t("_x"),
        MapToInt..uint16_t("_y"),
        MapToInt..uint16_t("_width"),
        MapToInt..uint16_t("_height"),
        Check("_height * _pitch")..void.const.p("_data"),
        MapToInt..uint16_t("_pitch")
    )

    bgfx_index_buffer_handle_t(
        "create_index_buffer",

        bgfx_memory_t.const.p("_mem"),
        MapToInt..uint16_t("_flags")
    )

    void(
        "set_index_buffer_name",

        bgfx_index_buffer_handle_t("_handle"),
        charASCII.const.p("_name"),
        AutoSize("_name")..int32_t("_len")
    )

    void(
        "destroy_index_buffer",

        bgfx_index_buffer_handle_t("_handle")
    )

    bgfx_vertex_layout_handle_t(
        "create_vertex_layout",

        bgfx_vertex_layout_t.const.p("_layout")
    )

    void(
        "destroy_vertex_layout",

        bgfx_vertex_layout_handle_t("_handle")
    )

    bgfx_vertex_buffer_handle_t(
        "create_vertex_buffer",

        bgfx_memory_t.const.p("_mem"),
        bgfx_vertex_layout_t.const.p("_layout"),
        MapToInt..uint16_t("_flags")
    )

    void(
        "set_vertex_buffer_name",

        bgfx_vertex_buffer_handle_t("_handle"),
        charASCII.const.p("_name"),
        AutoSize("_name")..int32_t("_len")
    )

    void(
        "destroy_vertex_buffer",

        bgfx_vertex_buffer_handle_t("_handle")
    )

    bgfx_dynamic_index_buffer_handle_t(
        "create_dynamic_index_buffer",

        uint32_t("_num"),
        MapToInt..uint16_t("_flags")
    )

    bgfx_dynamic_index_buffer_handle_t(
        "create_dynamic_index_buffer_mem",

        bgfx_memory_t.const.p("_mem"),
        MapToInt..uint16_t("_flags")
    )

    void(
        "update_dynamic_index_buffer",

        bgfx_dynamic_index_buffer_handle_t("_handle"),
        uint32_t("_startIndex"),
        bgfx_memory_t.const.p("_mem")
    )

    void(
        "destroy_dynamic_index_buffer",

        bgfx_dynamic_index_buffer_handle_t("_handle")
    )

    bgfx_dynamic_vertex_buffer_handle_t(
        "create_dynamic_vertex_buffer",

        uint32_t("_num"),
        bgfx_vertex_layout_t.const.p("_layout"),
        MapToInt..uint16_t("_flags")
    )

    bgfx_dynamic_vertex_buffer_handle_t(
        "create_dynamic_vertex_buffer_mem",

        bgfx_memory_t.const.p("_mem"),
        bgfx_vertex_layout_t.const.p("_layout"),
        MapToInt..uint16_t("_flags")
    )

    void(
        "update_dynamic_vertex_buffer",

        bgfx_dynamic_vertex_buffer_handle_t("_handle"),
        uint32_t("_startVertex"),
        bgfx_memory_t.const.p("_mem")
    )

    void(
        "destroy_dynamic_vertex_buffer",

        bgfx_dynamic_vertex_buffer_handle_t("_handle")
    )

    uint32_t(
        "get_avail_transient_index_buffer",

        uint32_t("_num"),
        bool("_index32")
    )

    uint32_t(
        "get_avail_transient_vertex_buffer",

        uint32_t("_num"),
        bgfx_vertex_layout_t.const.p("_layout")
    )

    uint32_t(
        "get_avail_instance_data_buffer",

        uint32_t("_num"),
        MapToInt..uint16_t("_stride")
    )

    void(
        "alloc_transient_index_buffer",

        bgfx_transient_index_buffer_t.p("_tib"),
        uint32_t("_num"),
        bool("_index32")
    )

    void(
        "alloc_transient_vertex_buffer",

        bgfx_transient_vertex_buffer_t.p("_tvb"),
        uint32_t("_num"),
        bgfx_vertex_layout_t.const.p("_layout")
    )

    bool(
        "alloc_transient_buffers",

        bgfx_transient_vertex_buffer_t.p("_tvb"),
        bgfx_vertex_layout_t.const.p("_layout"),
        uint32_t("_numVertices"),
        bgfx_transient_index_buffer_t.p("_tib"),
        uint32_t("_numIndices"),
        bool("_index32")
    )

    void(
        "alloc_instance_data_buffer",

        bgfx_instance_data_buffer_t.p("_idb"),
        uint32_t("_num"),
        MapToInt..uint16_t("_stride")
    )

    bgfx_indirect_buffer_handle_t(
        "create_indirect_buffer",

        uint32_t("_num")
    )

    void(
        "destroy_indirect_buffer",

        bgfx_indirect_buffer_handle_t("_handle")
    )

    bgfx_shader_handle_t(
        "create_shader",

        bgfx_memory_t.const.p("_mem")
    )

    uint16_t(
        "get_shader_uniforms",

        bgfx_shader_handle_t("_handle"),
        bgfx_uniform_handle_t.p("_uniforms"),
        AutoSize("_uniforms")..uint16_t("_max")
    )

    void(
        "set_shader_name",

        bgfx_shader_handle_t("_handle"),
        charUTF8.const.p("_name"),
        AutoSize("_name")..int32_t("_len")
    )

    void(
        "destroy_shader",

        bgfx_shader_handle_t("_handle")
    )

    bgfx_program_handle_t(
        "create_program",

        bgfx_shader_handle_t("_vsh"),
        bgfx_shader_handle_t("_fsh"),
        bool("_destroyShaders")
    )

    bgfx_program_handle_t(
        "create_compute_program",

        bgfx_shader_handle_t("_csh"),
        bool("_destroyShaders")
    )

    void(
        "destroy_program",

        bgfx_program_handle_t("_handle")
    )

    bool(
        "is_texture_valid",

        MapToInt..uint16_t("_depth"),
        bool("_cubeMap"),
        MapToInt..uint16_t("_numLayers"),
        bgfx_texture_format_t("_format"),
        uint64_t("_flags")
    )

    bool(
        "is_frame_buffer_valid",

        AutoSize("_attachment")..uint8_t("_num"),
        bgfx_attachment_t.const.p("_attachment")
    )

    void(
        "calc_texture_size",

        bgfx_texture_info_t_p("_info"),
        MapToInt..uint16_t("_width"),
        MapToInt..uint16_t("_height"),
        MapToInt..uint16_t("_depth"),
        bool("_cubeMap"),
        bool("_hasMips"),
        MapToInt..uint16_t("_numLayers"),
        bgfx_texture_format_t("_format")
    )

    bgfx_texture_handle_t(
        "create_texture",

        bgfx_memory_t.const.p("_mem"),
        uint64_t("_flags"),
        MapToInt..uint8_t("_skip"),
        nullable..bgfx_texture_info_t_p("_info")
    )

    bgfx_texture_handle_t(
        "create_texture_2d",

        MapToInt..uint16_t("_width"),
        MapToInt..uint16_t("_height"),
        bool("_hasMips"),
        MapToInt..uint16_t("_numLayers"),
        bgfx_texture_format_t("_format"),
        uint64_t("_flags"),
        nullable..bgfx_memory_t.const.p("_mem")
    )

    bgfx_texture_handle_t(
        "create_texture_2d_scaled",

        bgfx_backbuffer_ratio_t("_ratio"),
        bool("_hasMips"),
        MapToInt..uint16_t("_numLayers"),
        bgfx_texture_format_t("_format"),
        uint64_t("_flags")
    )

    bgfx_texture_handle_t(
        "create_texture_3d",

        MapToInt..uint16_t("_width"),
        MapToInt..uint16_t("_height"),
        MapToInt..uint16_t("_depth"),
        bool("_hasMips"),
        bgfx_texture_format_t("_format"),
        uint64_t("_flags"),
        nullable..bgfx_memory_t.const.p("_mem")
    )

    bgfx_texture_handle_t(
        "create_texture_cube",

        MapToInt..uint16_t("_size"),
        bool("_hasMips"),
        MapToInt..uint16_t("_numLayers"),
        bgfx_texture_format_t("_format"),
        uint64_t("_flags"),
        nullable..bgfx_memory_t.const.p("_mem")
    )

    void(
        "update_texture_2d",

        bgfx_texture_handle_t("_handle"),
        MapToInt..uint16_t("_layer"),
        MapToInt..uint8_t("_mip"),
        MapToInt..uint16_t("_x"),
        MapToInt..uint16_t("_y"),
        MapToInt..uint16_t("_width"),
        MapToInt..uint16_t("_height"),
        bgfx_memory_t.const.p("_mem"),
        MapToInt..uint16_t("_pitch")
    )

    void(
        "update_texture_3d",

        bgfx_texture_handle_t("_handle"),
        MapToInt..uint8_t("_mip"),
        MapToInt..uint16_t("_x"),
        MapToInt..uint16_t("_y"),
        MapToInt..uint16_t("_z"),
        MapToInt..uint16_t("_width"),
        MapToInt..uint16_t("_height"),
        MapToInt..uint16_t("_depth"),
        bgfx_memory_t.const.p("_mem")
    )

    void(
        "update_texture_cube",

        bgfx_texture_handle_t("_handle"),
        MapToInt..uint16_t("_layer"),
        uint8_t("_side"),
        MapToInt..uint8_t("_mip"),
        MapToInt..uint16_t("_x"),
        MapToInt..uint16_t("_y"),
        MapToInt..uint16_t("_width"),
        MapToInt..uint16_t("_height"),
        bgfx_memory_t.const.p("_mem"),
        MapToInt..uint16_t("_pitch")
    )

    uint32_t(
        "read_texture",

        bgfx_texture_handle_t("_handle"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT
        )..Unsafe..void.p("_data"),
        MapToInt..uint8_t("_mip")
    )

    void(
        "set_texture_name",

        bgfx_texture_handle_t("_handle"),
        charUTF8.const.p("_name"),
        AutoSize("_name")..int32_t("_len")
    )

    opaque_p(
        "get_direct_access_ptr",

        bgfx_texture_handle_t("_handle")
    )

    void(
        "destroy_texture",

        bgfx_texture_handle_t("_handle")
    )

    bgfx_frame_buffer_handle_t(
        "create_frame_buffer",

        MapToInt..uint16_t("_width"),
        MapToInt..uint16_t("_height"),
        bgfx_texture_format_t("_format"),
        uint64_t("_textureFlags")
    )

    bgfx_frame_buffer_handle_t(
        "create_frame_buffer_scaled",

        bgfx_backbuffer_ratio_t("_ratio"),
        bgfx_texture_format_t("_format"),
        uint64_t("_textureFlags")
    )

    bgfx_frame_buffer_handle_t(
        "create_frame_buffer_from_handles",

        AutoSize("_handles")..uint8_t("_num"),
        bgfx_texture_handle_t.const.p("_handles"),
        bool("_destroyTextures")
    )

    bgfx_frame_buffer_handle_t(
        "create_frame_buffer_from_attachment",

        AutoSize("_attachment")..uint8_t("_num"),
        bgfx_attachment_t.const.p("_attachment"),
        bool("_destroyTextures")
    )

    bgfx_frame_buffer_handle_t(
        "create_frame_buffer_from_nwh",

        opaque_p("_nwh"),
        MapToInt..uint16_t("_width"),
        MapToInt..uint16_t("_height"),
        bgfx_texture_format_t("_format"),
        bgfx_texture_format_t("_depthFormat")
    )

    void(
        "set_frame_buffer_name",

        bgfx_frame_buffer_handle_t("_handle"),
        charASCII.const.p("_name"),
        AutoSize("_name")..int32_t("_len")
    )

    bgfx_texture_handle_t(
        "get_texture",

        bgfx_frame_buffer_handle_t("_handle"),
        MapToInt..uint8_t("_attachment")
    )

    void(
        "destroy_frame_buffer",

        bgfx_frame_buffer_handle_t("_handle")
    )

    bgfx_uniform_handle_t(
        "create_uniform",

        charASCII.const.p("_name"),
        bgfx_uniform_type_t("_type"),
        MapToInt..uint16_t("_num")
    )

    void(
        "get_uniform_info",

        bgfx_uniform_handle_t("_handle"),
        bgfx_uniform_info_t_p("_info")
    )

    void(
        "destroy_uniform",

        bgfx_uniform_handle_t("_handle")
    )

    bgfx_occlusion_query_handle_t(
        "create_occlusion_query",

        void()
    )

    bgfx_occlusion_query_result_t(
        "get_result",

        bgfx_occlusion_query_handle_t("_handle"),
        Check(1)..nullable..int32_t.p("_result")
    )

    void(
        "destroy_occlusion_query",

        bgfx_occlusion_query_handle_t("_handle")
    )

    void(
        "set_palette_color",

        MapToInt..uint8_t("_index"),
        Check(4)..float.const.p("_rgba")
    )

    void(
        "set_palette_color_rgba32f",

        MapToInt..uint8_t("_index"),
        float("_r"),
        float("_g"),
        float("_b"),
        float("_a")
    )

    void(
        "set_palette_color_rgba8",

        MapToInt..uint8_t("_index"),
        uint32_t("_rgba")
    )

    void(
        "set_view_name",

        MapToInt..bgfx_view_id_t("_id"),
        charASCII.const.p("_name"),
        AutoSize("_name")..int32_t("_len")
    )

    void(
        "set_view_rect",

        MapToInt..bgfx_view_id_t("_id"),
        MapToInt..uint16_t("_x"),
        MapToInt..uint16_t("_y"),
        MapToInt..uint16_t("_width"),
        MapToInt..uint16_t("_height")
    )

    void(
        "set_view_rect_ratio",

        MapToInt..bgfx_view_id_t("_id"),
        MapToInt..uint16_t("_x"),
        MapToInt..uint16_t("_y"),
        bgfx_backbuffer_ratio_t("_ratio")
    )

    void(
        "set_view_scissor",

        MapToInt..bgfx_view_id_t("_id"),
        MapToInt..uint16_t("_x"),
        MapToInt..uint16_t("_y"),
        MapToInt..uint16_t("_width"),
        MapToInt..uint16_t("_height")
    )

    void(
        "set_view_clear",

        MapToInt..bgfx_view_id_t("_id"),
        MapToInt..uint16_t("_flags"),
        uint32_t("_rgba"),
        float("_depth"),
        MapToInt..uint8_t("_stencil")
    )

    void(
        "set_view_clear_mrt",

        MapToInt..bgfx_view_id_t("_id"),
        MapToInt..uint16_t("_flags"),
        float("_depth"),
        MapToInt..uint8_t("_stencil"),
        uint8_t("_0"),
        uint8_t("_1"),
        uint8_t("_2"),
        uint8_t("_3"),
        uint8_t("_4"),
        uint8_t("_5"),
        uint8_t("_6"),
        uint8_t("_7")
    )

    void(
        "set_view_mode",

        MapToInt..bgfx_view_id_t("_id"),
        bgfx_view_mode_t("_mode")
    )

    void(
        "set_view_frame_buffer",

        MapToInt..bgfx_view_id_t("_id"),
        bgfx_frame_buffer_handle_t("_handle")
    )

    void(
        "set_view_transform",

        MapToInt..bgfx_view_id_t("_id"),
        MultiType(
            PointerMapping.DATA_FLOAT
        )..Check(4 x 4 x 4)..nullable..void.const.p("_view"),
        MultiType(
            PointerMapping.DATA_FLOAT
        )..Check(4 x 4 x 4)..nullable..void.const.p("_proj")
    )

    void(
        "set_view_order",

        MapToInt..bgfx_view_id_t("_id"),
        MapToInt..uint16_t("_num"),
        Check("_num")..nullable..bgfx_view_id_t.const.p("_order")
    )

    void(
        "reset_view",

        MapToInt..bgfx_view_id_t("_id")
    )

    bgfx_encoder_t.p(
        "encoder_begin",

        bool("_forThread")
    )

    void(
        "encoder_end",

        bgfx_encoder_t.p("_encoder")
    )

    void(
        "encoder_set_marker",

        bgfx_encoder_t.p("_this"),
        charASCII.const.p("_name"),
        AutoSize("_name")..int32_t("_len")
    )

    void(
        "encoder_set_state",

        bgfx_encoder_t.p("_this"),
        uint64_t("_state"),
        uint32_t("_rgba")
    )

    void(
        "encoder_set_condition",

        bgfx_encoder_t.p("_this"),
        bgfx_occlusion_query_handle_t("_handle"),
        bool("_visible")
    )

    void(
        "encoder_set_stencil",

        bgfx_encoder_t.p("_this"),
        uint32_t("_fstencil"),
        uint32_t("_bstencil")
    )

    uint16_t(
        "encoder_set_scissor",

        bgfx_encoder_t.p("_this"),
        MapToInt..uint16_t("_x"),
        MapToInt..uint16_t("_y"),
        MapToInt..uint16_t("_width"),
        MapToInt..uint16_t("_height")
    )

    void(
        "encoder_set_scissor_cached",

        bgfx_encoder_t.p("_this"),
        MapToInt..uint16_t("_cache")
    )

    uint32_t(
        "encoder_set_transform",

        bgfx_encoder_t.p("_this"),
        MultiType(
            PointerMapping.DATA_FLOAT
        )..void.const.p("_mtx"),
        AutoSize(4 x 4 x 4, "_mtx")..uint16_t("_num")
    )

    void(
        "encoder_set_transform_cached",

        bgfx_encoder_t.p("_this"),
        uint32_t("_cache"),
        MapToInt..uint16_t("_num")
    )

    uint32_t(
        "encoder_alloc_transform",

        bgfx_encoder_t.p("_this"),
        bgfx_transform_t.p("_transform"),
        MapToInt..uint16_t("_num")
    )

    void(
        "encoder_set_uniform",

        bgfx_encoder_t.p("_this"),
        bgfx_uniform_handle_t("_handle"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_LONG,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..Unsafe..void.const.p("_value"),
        MapToInt..uint16_t("_num")
    )

    void(
        "encoder_set_index_buffer",

        bgfx_encoder_t.p("_this"),
        bgfx_index_buffer_handle_t("_handle"),
        uint32_t("_firstIndex"),
        uint32_t("_numIndices")
    )

    void(
        "encoder_set_dynamic_index_buffer",

        bgfx_encoder_t.p("_this"),
        bgfx_dynamic_index_buffer_handle_t("_handle"),
        uint32_t("_firstIndex"),
        uint32_t("_numIndices")
    )

    void(
        "encoder_set_transient_index_buffer",

        bgfx_encoder_t.p("_this"),
        bgfx_transient_index_buffer_t.const.p("_tib"),
        uint32_t("_firstIndex"),
        uint32_t("_numIndices")
    )

    void(
        "encoder_set_vertex_buffer",

        bgfx_encoder_t.p("_this"),
        MapToInt..uint8_t("_stream"),
        bgfx_vertex_buffer_handle_t("_handle"),
        uint32_t("_startVertex"),
        uint32_t("_numVertices")
    )

    void(
        "encoder_set_vertex_buffer_with_layout",

        bgfx_encoder_t.p("_this"),
        MapToInt..uint8_t("_stream"),
        bgfx_vertex_buffer_handle_t("_handle"),
        uint32_t("_startVertex"),
        uint32_t("_numVertices"),
        bgfx_vertex_layout_handle_t("_layoutHandle")
    )

    void(
        "encoder_set_dynamic_vertex_buffer",

        bgfx_encoder_t.p("_this"),
        MapToInt..uint8_t("_stream"),
        bgfx_dynamic_vertex_buffer_handle_t("_handle"),
        uint32_t("_startVertex"),
        uint32_t("_numVertices")
    )

    void(
        "encoder_set_dynamic_vertex_buffer_with_layout",

        bgfx_encoder_t.p("_this"),
        MapToInt..uint8_t("_stream"),
        bgfx_dynamic_vertex_buffer_handle_t("_handle"),
        uint32_t("_startVertex"),
        uint32_t("_numVertices"),
        bgfx_vertex_layout_handle_t("_layoutHandle")
    )

    void(
        "encoder_set_transient_vertex_buffer",

        bgfx_encoder_t.p("_this"),
        MapToInt..uint8_t("_stream"),
        bgfx_transient_vertex_buffer_t.const.p("_tvb"),
        uint32_t("_startVertex"),
        uint32_t("_numVertices")
    )

    void(
        "encoder_set_transient_vertex_buffer_with_layout",

        bgfx_encoder_t.p("_this"),
        MapToInt..uint8_t("_stream"),
        bgfx_transient_vertex_buffer_t.const.p("_tvb"),
        uint32_t("_startVertex"),
        uint32_t("_numVertices"),
        bgfx_vertex_layout_handle_t("_layoutHandle")
    )

    void(
        "encoder_set_vertex_count",

        bgfx_encoder_t.p("_this"),
        uint32_t("_numVertices")
    )

    void(
        "encoder_set_instance_data_buffer",

        bgfx_encoder_t.p("_this"),
        bgfx_instance_data_buffer_t.const.p("_idb"),
        uint32_t("_start"),
        uint32_t("_num")
    )

    void(
        "encoder_set_instance_data_from_vertex_buffer",

        bgfx_encoder_t.p("_this"),
        bgfx_vertex_buffer_handle_t("_handle"),
        uint32_t("_start"),
        uint32_t("_num")
    )

    void(
        "encoder_set_instance_data_from_dynamic_vertex_buffer",

        bgfx_encoder_t.p("_this"),
        bgfx_dynamic_vertex_buffer_handle_t("_handle"),
        uint32_t("_start"),
        uint32_t("_num")
    )

    void(
        "encoder_set_instance_count",

        bgfx_encoder_t.p("_this"),
        uint32_t("_numInstances")
    )

    void(
        "encoder_set_texture",

        bgfx_encoder_t.p("_this"),
        MapToInt..uint8_t("_stage"),
        bgfx_uniform_handle_t("_sampler"),
        bgfx_texture_handle_t("_handle"),
        uint32_t("_flags")
    )

    void(
        "encoder_touch",

        bgfx_encoder_t.p("_this"),
        MapToInt..bgfx_view_id_t("_id")
    )

    void(
        "encoder_submit",

        bgfx_encoder_t.p("_this"),
        MapToInt..bgfx_view_id_t("_id"),
        bgfx_program_handle_t("_handle"),
        uint32_t("_depth"),
        MapToInt..uint8_t("_flags")
    )

    void(
        "encoder_submit_occlusion_query",

        bgfx_encoder_t.p("_this"),
        MapToInt..bgfx_view_id_t("_id"),
        bgfx_program_handle_t("_program"),
        bgfx_occlusion_query_handle_t("_occlusionQuery"),
        uint32_t("_depth"),
        MapToInt..uint8_t("_flags")
    )

    void(
        "encoder_submit_indirect",

        bgfx_encoder_t.p("_this"),
        MapToInt..bgfx_view_id_t("_id"),
        bgfx_program_handle_t("_handle"),
        bgfx_indirect_buffer_handle_t("_indirectHandle"),
        uint32_t("_start"),
        uint32_t("_num"),
        uint32_t("_depth"),
        MapToInt..uint8_t("_flags")
    )

    void(
        "encoder_submit_indirect_count",

        bgfx_encoder_t.p("_this"),
        MapToInt..bgfx_view_id_t("_id"),
        bgfx_program_handle_t("_program"),
        bgfx_indirect_buffer_handle_t("_indirectHandle"),
        uint32_t("_start"),
        bgfx_index_buffer_handle_t("_numHandle"),
        uint32_t("_numIndex"),
        uint32_t("_numMax"),
        uint32_t("_depth"),
        MapToInt..uint8_t("_flags")
    )

    void(
        "encoder_set_compute_index_buffer",

        bgfx_encoder_t.p("_this"),
        MapToInt..uint8_t("_stage"),
        bgfx_index_buffer_handle_t("_handle"),
        bgfx_access_t("_access")
    )

    void(
        "encoder_set_compute_vertex_buffer",

        bgfx_encoder_t.p("_this"),
        MapToInt..uint8_t("_stage"),
        bgfx_vertex_buffer_handle_t("_handle"),
        bgfx_access_t("_access")
    )

    void(
        "encoder_set_compute_dynamic_index_buffer",

        bgfx_encoder_t.p("_this"),
        MapToInt..uint8_t("_stage"),
        bgfx_dynamic_index_buffer_handle_t("_handle"),
        bgfx_access_t("_access")
    )

    void(
        "encoder_set_compute_dynamic_vertex_buffer",

        bgfx_encoder_t.p("_this"),
        MapToInt..uint8_t("_stage"),
        bgfx_dynamic_vertex_buffer_handle_t("_handle"),
        bgfx_access_t("_access")
    )

    void(
        "encoder_set_compute_indirect_buffer",

        bgfx_encoder_t.p("_this"),
        MapToInt..uint8_t("_stage"),
        bgfx_indirect_buffer_handle_t("_handle"),
        bgfx_access_t("_access")
    )

    void(
        "encoder_set_image",

        bgfx_encoder_t.p("_this"),
        MapToInt..uint8_t("_stage"),
        bgfx_texture_handle_t("_handle"),
        MapToInt..uint8_t("_mip"),
        bgfx_access_t("_access"),
        bgfx_texture_format_t("_format")
    )

    void(
        "encoder_dispatch",

        bgfx_encoder_t.p("_this"),
        MapToInt..bgfx_view_id_t("_id"),
        bgfx_program_handle_t("_handle"),
        uint32_t("_numX"),
        uint32_t("_numY"),
        uint32_t("_numZ"),
        MapToInt..uint8_t("_flags")
    )

    void(
        "encoder_dispatch_indirect",

        bgfx_encoder_t.p("_this"),
        MapToInt..bgfx_view_id_t("_id"),
        bgfx_program_handle_t("_handle"),
        bgfx_indirect_buffer_handle_t("_indirectHandle"),
        uint32_t("_start"),
        uint32_t("_num"),
        MapToInt..uint8_t("_flags")
    )

    void(
        "encoder_discard",

        bgfx_encoder_t.p("_this"),
        MapToInt..uint8_t("_flags")
    )

    void(
        "encoder_blit",

        bgfx_encoder_t.p("_this"),
        MapToInt..bgfx_view_id_t("_id"),
        bgfx_texture_handle_t("_dst"),
        MapToInt..uint8_t("_dstMip"),
        MapToInt..uint16_t("_dstX"),
        MapToInt..uint16_t("_dstY"),
        MapToInt..uint16_t("_dstZ"),
        bgfx_texture_handle_t("_src"),
        MapToInt..uint8_t("_srcMip"),
        MapToInt..uint16_t("_srcX"),
        MapToInt..uint16_t("_srcY"),
        MapToInt..uint16_t("_srcZ"),
        MapToInt..uint16_t("_width"),
        MapToInt..uint16_t("_height"),
        MapToInt..uint16_t("_depth")
    )

    void(
        "request_screen_shot",

        bgfx_frame_buffer_handle_t("_handle"),
        charASCII.const.p("_filePath")
    )

    void(
        "set_marker",

        charASCII.const.p("_name"),
        AutoSize("_name")..int32_t("_len")
    )

    void(
        "set_state",

        uint64_t("_state"),
        uint32_t("_rgba")
    )

    void(
        "set_condition",

        bgfx_occlusion_query_handle_t("_handle"),
        bool("_visible")
    )

    void(
        "set_stencil",

        uint32_t("_fstencil"),
        uint32_t("_bstencil")
    )

    uint16_t(
        "set_scissor",

        MapToInt..uint16_t("_x"),
        MapToInt..uint16_t("_y"),
        MapToInt..uint16_t("_width"),
        MapToInt..uint16_t("_height")
    )

    void(
        "set_scissor_cached",

        MapToInt..uint16_t("_cache")
    )

    uint32_t(
        "set_transform",

        MultiType(
            PointerMapping.DATA_FLOAT
        )..void.const.p("_mtx"),
        AutoSize(4 x 4 x 4, "_mtx")..uint16_t("_num")
    )

    void(
        "set_transform_cached",

        uint32_t("_cache"),
        MapToInt..uint16_t("_num")
    )

    uint32_t(
        "alloc_transform",

        bgfx_transform_t.p("_transform"),
        MapToInt..uint16_t("_num")
    )

    void(
        "set_uniform",

        bgfx_uniform_handle_t("_handle"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_LONG,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..Unsafe..void.const.p("_value"),
        MapToInt..uint16_t("_num")
    )

    void(
        "set_index_buffer",

        bgfx_index_buffer_handle_t("_handle"),
        uint32_t("_firstIndex"),
        uint32_t("_numIndices")
    )

    void(
        "set_dynamic_index_buffer",

        bgfx_dynamic_index_buffer_handle_t("_handle"),
        uint32_t("_firstIndex"),
        uint32_t("_numIndices")
    )

    void(
        "set_transient_index_buffer",

        bgfx_transient_index_buffer_t.const.p("_tib"),
        uint32_t("_firstIndex"),
        uint32_t("_numIndices")
    )

    void(
        "set_vertex_buffer",

        MapToInt..uint8_t("_stream"),
        bgfx_vertex_buffer_handle_t("_handle"),
        uint32_t("_startVertex"),
        uint32_t("_numVertices")
    )

    void(
        "set_vertex_buffer_with_layout",

        MapToInt..uint8_t("_stream"),
        bgfx_vertex_buffer_handle_t("_handle"),
        uint32_t("_startVertex"),
        uint32_t("_numVertices"),
        bgfx_vertex_layout_handle_t("_layoutHandle")
    )

    void(
        "set_dynamic_vertex_buffer",

        MapToInt..uint8_t("_stream"),
        bgfx_dynamic_vertex_buffer_handle_t("_handle"),
        uint32_t("_startVertex"),
        uint32_t("_numVertices")
    )

    void(
        "set_dynamic_vertex_buffer_with_layout",

        MapToInt..uint8_t("_stream"),
        bgfx_dynamic_vertex_buffer_handle_t("_handle"),
        uint32_t("_startVertex"),
        uint32_t("_numVertices"),
        bgfx_vertex_layout_handle_t("_layoutHandle")
    )

    void(
        "set_transient_vertex_buffer",

        MapToInt..uint8_t("_stream"),
        bgfx_transient_vertex_buffer_t.const.p("_tvb"),
        uint32_t("_startVertex"),
        uint32_t("_numVertices")
    )

    void(
        "set_transient_vertex_buffer_with_layout",

        MapToInt..uint8_t("_stream"),
        bgfx_transient_vertex_buffer_t.const.p("_tvb"),
        uint32_t("_startVertex"),
        uint32_t("_numVertices"),
        bgfx_vertex_layout_handle_t("_layoutHandle")
    )

    void(
        "set_vertex_count",

        uint32_t("_numVertices")
    )

    void(
        "set_instance_data_buffer",

        bgfx_instance_data_buffer_t.const.p("_idb"),
        uint32_t("_start"),
        uint32_t("_num")
    )

    void(
        "set_instance_data_from_vertex_buffer",

        bgfx_vertex_buffer_handle_t("_handle"),
        uint32_t("_start"),
        uint32_t("_num")
    )

    void(
        "set_instance_data_from_dynamic_vertex_buffer",

        bgfx_dynamic_vertex_buffer_handle_t("_handle"),
        uint32_t("_start"),
        uint32_t("_num")
    )

    void(
        "set_instance_count",

        uint32_t("_numInstances")
    )

    void(
        "set_texture",

        MapToInt..uint8_t("_stage"),
        bgfx_uniform_handle_t("_sampler"),
        bgfx_texture_handle_t("_handle"),
        uint32_t("_flags")
    )

    void(
        "touch",

        MapToInt..bgfx_view_id_t("_id")
    )

    void(
        "submit",

        MapToInt..bgfx_view_id_t("_id"),
        bgfx_program_handle_t("_program"),
        uint32_t("_depth"),
        MapToInt..uint8_t("_flags")
    )

    void(
        "submit_occlusion_query",

        MapToInt..bgfx_view_id_t("_id"),
        bgfx_program_handle_t("_program"),
        bgfx_occlusion_query_handle_t("_occlusionQuery"),
        uint32_t("_depth"),
        MapToInt..uint8_t("_flags")
    )

    void(
        "submit_indirect",

        MapToInt..bgfx_view_id_t("_id"),
        bgfx_program_handle_t("_program"),
        bgfx_indirect_buffer_handle_t("_indirectHandle"),
        uint32_t("_start"),
        uint32_t("_num"),
        uint32_t("_depth"),
        MapToInt..uint8_t("_flags")
    )

    void(
        "submit_indirect_count",

        MapToInt..bgfx_view_id_t("_id"),
        bgfx_program_handle_t("_program"),
        bgfx_indirect_buffer_handle_t("_indirectHandle"),
        uint32_t("_start"),
        bgfx_index_buffer_handle_t("_numHandle"),
        uint32_t("_numIndex"),
        uint32_t("_numMax"),
        uint32_t("_depth"),
        MapToInt..uint8_t("_flags")
    )

    void(
        "set_compute_index_buffer",

        MapToInt..uint8_t("_stage"),
        bgfx_index_buffer_handle_t("_handle"),
        bgfx_access_t("_access")
    )

    void(
        "set_compute_vertex_buffer",

        MapToInt..uint8_t("_stage"),
        bgfx_vertex_buffer_handle_t("_handle"),
        bgfx_access_t("_access")
    )

    void(
        "set_compute_dynamic_index_buffer",

        MapToInt..uint8_t("_stage"),
        bgfx_dynamic_index_buffer_handle_t("_handle"),
        bgfx_access_t("_access")
    )

    void(
        "set_compute_dynamic_vertex_buffer",

        MapToInt..uint8_t("_stage"),
        bgfx_dynamic_vertex_buffer_handle_t("_handle"),
        bgfx_access_t("_access")
    )

    void(
        "set_compute_indirect_buffer",

        MapToInt..uint8_t("_stage"),
        bgfx_indirect_buffer_handle_t("_handle"),
        bgfx_access_t("_access")
    )

    void(
        "set_image",

        MapToInt..uint8_t("_stage"),
        bgfx_texture_handle_t("_handle"),
        MapToInt..uint8_t("_mip"),
        bgfx_access_t("_access"),
        bgfx_texture_format_t("_format")
    )

    void(
        "dispatch",

        MapToInt..bgfx_view_id_t("_id"),
        bgfx_program_handle_t("_program"),
        uint32_t("_numX"),
        uint32_t("_numY"),
        uint32_t("_numZ"),
        MapToInt..uint8_t("_flags")
    )

    void(
        "dispatch_indirect",

        MapToInt..bgfx_view_id_t("_id"),
        bgfx_program_handle_t("_program"),
        bgfx_indirect_buffer_handle_t("_indirectHandle"),
        uint32_t("_start"),
        uint32_t("_num"),
        MapToInt..uint8_t("_flags")
    )

    void(
        "discard",

        MapToInt..uint8_t("_flags")
    )

    void(
        "blit",

        MapToInt..bgfx_view_id_t("_id"),
        bgfx_texture_handle_t("_dst"),
        MapToInt..uint8_t("_dstMip"),
        MapToInt..uint16_t("_dstX"),
        MapToInt..uint16_t("_dstY"),
        MapToInt..uint16_t("_dstZ"),
        bgfx_texture_handle_t("_src"),
        MapToInt..uint8_t("_srcMip"),
        MapToInt..uint16_t("_srcX"),
        MapToInt..uint16_t("_srcY"),
        MapToInt..uint16_t("_srcZ"),
        MapToInt..uint16_t("_width"),
        MapToInt..uint16_t("_height"),
        MapToInt..uint16_t("_depth")
    )

    macro(expression = "(_ref << BGFX_STATE_ALPHA_REF_SHIFT) & BGFX_STATE_ALPHA_REF_MASK")..uint64_t(
        "BGFX_STATE_ALPHA_REF",
        uint64_t("_ref"),
        noPrefix = true
    )

    macro(expression = "(_size << BGFX_STATE_POINT_SIZE_SHIFT) & BGFX_STATE_POINT_SIZE_MASK")..uint64_t(
        "BGFX_STATE_POINT_SIZE",
        uint64_t("_size"),
        noPrefix = true
    )

    macro(expression = "((_srcRGB | (_dstRGB << 4))) | ((_srcA | (_dstA << 4)) << 8)")..uint64_t(
        "BGFX_STATE_BLEND_FUNC_SEPARATE",
        uint64_t("_srcRGB"),
        uint64_t("_dstRGB"),
        uint64_t("_srcA"),
        uint64_t("_dstA"),
        noPrefix = true
    )

    macro(expression = "_rgb | (_a << 3)")..uint64_t(
        "BGFX_STATE_BLEND_EQUATION_SEPARATE",
        uint64_t("_rgb"),
        uint64_t("_a"),
        noPrefix = true
    )

    macro(expression = "BGFX_STATE_BLEND_FUNC_SEPARATE(_src, _dst, _src, _dst)")..uint64_t(
        "BGFX_STATE_BLEND_FUNC",
        uint64_t("_src"),
        uint64_t("_dst"),
        noPrefix = true
    )

    macro(expression = "BGFX_STATE_BLEND_EQUATION_SEPARATE(_equation, _equation)")..uint64_t(
        "BGFX_STATE_BLEND_EQUATION",
        uint64_t("_equation"),
        noPrefix = true
    )

    LongConstant(
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
        "BGFX_STATE_BLEND_FUNC_RT_x",
        uint64_t("_src"),
        uint64_t("_dst"),
        noPrefix = true
    )

    macro(expression = "BGFX_STATE_BLEND_FUNC_RT_x(_src, _dst) | ((_equation >> BGFX_STATE_BLEND_EQUATION_SHIFT) << 8)")..uint64_t(
        "BGFX_STATE_BLEND_FUNC_RT_xE",
        uint64_t("_src"),
        uint64_t("_dst"),
        uint64_t("_equation"),
        noPrefix = true
    )

    macro(expression = "BGFX_STATE_BLEND_FUNC_RT_x(_src, _dst) << 0")..uint64_t(
        "BGFX_STATE_BLEND_FUNC_RT_1",
        uint64_t("_src"),
        uint64_t("_dst"),
        noPrefix = true
    )

    macro(expression = "BGFX_STATE_BLEND_FUNC_RT_x(_src, _dst) << 11")..uint64_t(
        "BGFX_STATE_BLEND_FUNC_RT_2",
        uint64_t("_src"),
        uint64_t("_dst"),
        noPrefix = true
    )

    macro(expression = "BGFX_STATE_BLEND_FUNC_RT_x(_src, _dst) << 22")..uint64_t(
        "BGFX_STATE_BLEND_FUNC_RT_3",
        uint64_t("_src"),
        uint64_t("_dst"),
        noPrefix = true
    )

    macro(expression = "BGFX_STATE_BLEND_FUNC_RT_xE(_src, _dst, _equation) << 0")..uint64_t(
        "BGFX_STATE_BLEND_FUNC_RT_1E",
        uint64_t("_src"),
        uint64_t("_dst"),
        uint64_t("_equation"),
        noPrefix = true
    )

    macro(expression = "BGFX_STATE_BLEND_FUNC_RT_xE(_src, _dst, _equation) << 11")..uint64_t(
        "BGFX_STATE_BLEND_FUNC_RT_2E",
        uint64_t("_src"),
        uint64_t("_dst"),
        uint64_t("_equation"),
        noPrefix = true
    )

    macro(expression = "BGFX_STATE_BLEND_FUNC_RT_xE(_src, _dst, _equation) << 22")..uint64_t(
        "BGFX_STATE_BLEND_FUNC_RT_3E",
        uint64_t("_src"),
        uint64_t("_dst"),
        uint64_t("_equation"),
        noPrefix = true
    )

    macro(expression = "(_ref << BGFX_STENCIL_FUNC_REF_SHIFT) & BGFX_STENCIL_FUNC_REF_MASK")..uint32_t(
        "BGFX_STENCIL_FUNC_REF",
        uint32_t("_ref"),
        noPrefix = true
    )

    macro(expression = "(_mask << BGFX_STENCIL_FUNC_RMASK_SHIFT) & BGFX_STENCIL_FUNC_RMASK_MASK")..uint32_t(
        "BGFX_STENCIL_FUNC_RMASK",
        uint32_t("_mask"),
        noPrefix = true
    )

    macro(expression = "(_index << BGFX_SAMPLER_BORDER_COLOR_SHIFT) & BGFX_SAMPLER_BORDER_COLOR_MASK")..uint32_t(
        "BGFX_SAMPLER_BORDER_COLOR",
        uint32_t("_index"),
        noPrefix = true
    )

    macro(expression = "Short.toUnsignedInt(h) != 0xFFFF")..bool(
        "BGFX_HANDLE_IS_VALID",
        uint16_t("h"),
        noPrefix = true
    )
}