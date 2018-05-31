/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_internalformat_query2 = "ARBInternalformatQuery2".nativeClassGL("ARB_internalformat_query2") {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension extends the ARBInternalformatQuery#glGetInternalformativ() query that was added in the ${ARB_internalformat_query.link} extension to
        provide applications with more granular per-format capability information.

        This extension allows the remainder of the texture-style targets to be specified along with any possible internal format. We add queries for additional
        properties supported for an internal format in addition to the multisample-related information that was added in ARB_internalformat_query.

        The goals of this extension are to:
        ${ol(
            "provide a mechanism for implementations to declare support *above* the minimum required by the specification",
            "provide API to allow universally constant information to be queried",
            "provide a user-friendly way of finding out about version- or implementation-specific limitations.",
            marker = 'a'
        )}
        While much of this information can be determined for a single GL version by careful examination of the specification, support for many of these
        properties has been gradually introduced over a number of API revisions. This can observed when considering the range in functionality between the
        various versions of GL 2, 3, and 4, as well as GL ES 2 and 3.

        In the case of an application which wishes to be scalable and able to run on a variety of possible GL or GL ES versions without being specifically
        tailored for each version, it must either have knowledge of the specifications built up into either the code or tables, or it must do a number of tests
        on startup to determine which capabilities are present.

        In OpenGL, other than the course-grained extension mechanism, many limitations of, or limited support for, an internalformat can only be signaled by
        failing an operation or by operating at reduced performance. Thus, such tests often involve attempts to create resources, using them in specific ways
        and benchmarking the operations to find out if it is supported in the desired form, and at a required performance level. The extension provides a way
        for these properties and caveats to be directly queried from the implementation.

        This extension is NOT intended to allow implementations to only support a subset of features that are required by a specific GL version, nor is it
        intended to replace the proper use of extension checks for optional functionality.

        Requires ${GL20.core} and ${ARB_internalformat_query.link}. ${GL43.promoted}
        """

    IntConstant(
        "Accepted by the {@code target} parameter of GetInternalformativ and GetInternalformati64v.",

        "TEXTURE_1D"..0x0DE0,
        "TEXTURE_1D_ARRAY"..0x8C18,
        "TEXTURE_2D"..0x0DE1,
        "TEXTURE_2D_ARRAY"..0x8C1A,
        "TEXTURE_3D"..0x806F,
        "TEXTURE_CUBE_MAP"..0x8513,
        "TEXTURE_CUBE_MAP_ARRAY"..0x9009,
        "TEXTURE_RECTANGLE"..0x84F5,
        "TEXTURE_BUFFER"..0x8C2A,
        "RENDERBUFFER"..0x8D41,
        "TEXTURE_2D_MULTISAMPLE"..0x9100,
        "TEXTURE_2D_MULTISAMPLE_ARRAY"..0x9102
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetInternalformativ and GetInternalformati64v.",

        "SAMPLES"..0x80A9,
        "NUM_SAMPLE_COUNTS"..0x9380,
        "INTERNALFORMAT_SUPPORTED"..0x826F,
        "INTERNALFORMAT_PREFERRED"..0x8270,
        "INTERNALFORMAT_RED_SIZE"..0x8271,
        "INTERNALFORMAT_GREEN_SIZE"..0x8272,
        "INTERNALFORMAT_BLUE_SIZE"..0x8273,
        "INTERNALFORMAT_ALPHA_SIZE"..0x8274,
        "INTERNALFORMAT_DEPTH_SIZE"..0x8275,
        "INTERNALFORMAT_STENCIL_SIZE"..0x8276,
        "INTERNALFORMAT_SHARED_SIZE"..0x8277,
        "INTERNALFORMAT_RED_TYPE"..0x8278,
        "INTERNALFORMAT_GREEN_TYPE"..0x8279,
        "INTERNALFORMAT_BLUE_TYPE"..0x827A,
        "INTERNALFORMAT_ALPHA_TYPE"..0x827B,
        "INTERNALFORMAT_DEPTH_TYPE"..0x827C,
        "INTERNALFORMAT_STENCIL_TYPE"..0x827D,
        "MAX_WIDTH"..0x827E,
        "MAX_HEIGHT"..0x827F,
        "MAX_DEPTH"..0x8280,
        "MAX_LAYERS"..0x8281,
        "MAX_COMBINED_DIMENSIONS"..0x8282,
        "COLOR_COMPONENTS"..0x8283,
        "DEPTH_COMPONENTS"..0x8284,
        "STENCIL_COMPONENTS"..0x8285,
        "COLOR_RENDERABLE"..0x8286,
        "DEPTH_RENDERABLE"..0x8287,
        "STENCIL_RENDERABLE"..0x8288,
        "FRAMEBUFFER_RENDERABLE"..0x8289,
        "FRAMEBUFFER_RENDERABLE_LAYERED"..0x828A,
        "FRAMEBUFFER_BLEND"..0x828B,
        "READ_PIXELS"..0x828C,
        "READ_PIXELS_FORMAT"..0x828D,
        "READ_PIXELS_TYPE"..0x828E,
        "TEXTURE_IMAGE_FORMAT"..0x828F,
        "TEXTURE_IMAGE_TYPE"..0x8290,
        "GET_TEXTURE_IMAGE_FORMAT"..0x8291,
        "GET_TEXTURE_IMAGE_TYPE"..0x8292,
        "MIPMAP"..0x8293,
        "MANUAL_GENERATE_MIPMAP"..0x8294,
        "AUTO_GENERATE_MIPMAP"..0x8295,
        "COLOR_ENCODING"..0x8296,
        "SRGB_READ"..0x8297,
        "SRGB_WRITE"..0x8298,
        "SRGB_DECODE_ARB"..0x8299,
        "FILTER"..0x829A,
        "VERTEX_TEXTURE"..0x829B,
        "TESS_CONTROL_TEXTURE"..0x829C,
        "TESS_EVALUATION_TEXTURE"..0x829D,
        "GEOMETRY_TEXTURE"..0x829E,
        "FRAGMENT_TEXTURE"..0x829F,
        "COMPUTE_TEXTURE"..0x82A0,
        "TEXTURE_SHADOW"..0x82A1,
        "TEXTURE_GATHER"..0x82A2,
        "TEXTURE_GATHER_SHADOW"..0x82A3,
        "SHADER_IMAGE_LOAD"..0x82A4,
        "SHADER_IMAGE_STORE"..0x82A5,
        "SHADER_IMAGE_ATOMIC"..0x82A6,
        "IMAGE_TEXEL_SIZE"..0x82A7,
        "IMAGE_COMPATIBILITY_CLASS"..0x82A8,
        "IMAGE_PIXEL_FORMAT"..0x82A9,
        "IMAGE_PIXEL_TYPE"..0x82AA,
        "IMAGE_FORMAT_COMPATIBILITY_TYPE"..0x90C7,
        "SIMULTANEOUS_TEXTURE_AND_DEPTH_TEST"..0x82AC,
        "SIMULTANEOUS_TEXTURE_AND_STENCIL_TEST"..0x82AD,
        "SIMULTANEOUS_TEXTURE_AND_DEPTH_WRITE"..0x82AE,
        "SIMULTANEOUS_TEXTURE_AND_STENCIL_WRITE"..0x82AF,
        "TEXTURE_COMPRESSED"..0x86A1,
        "TEXTURE_COMPRESSED_BLOCK_WIDTH"..0x82B1,
        "TEXTURE_COMPRESSED_BLOCK_HEIGHT"..0x82B2,
        "TEXTURE_COMPRESSED_BLOCK_SIZE"..0x82B3,
        "CLEAR_BUFFER"..0x82B4,
        "TEXTURE_VIEW"..0x82B5,
        "VIEW_COMPATIBILITY_CLASS"..0x82B6
    )

    IntConstant(
        "Returned as possible responses for various {@code pname} queries to GetInternalformativ and GetInternalformati64v.",

        "FULL_SUPPORT"..0x82B7,
        "CAVEAT_SUPPORT"..0x82B8,
        "IMAGE_CLASS_4_X_32"..0x82B9,
        "IMAGE_CLASS_2_X_32"..0x82BA,
        "IMAGE_CLASS_1_X_32"..0x82BB,
        "IMAGE_CLASS_4_X_16"..0x82BC,
        "IMAGE_CLASS_2_X_16"..0x82BD,
        "IMAGE_CLASS_1_X_16"..0x82BE,
        "IMAGE_CLASS_4_X_8"..0x82BF,
        "IMAGE_CLASS_2_X_8"..0x82C0,
        "IMAGE_CLASS_1_X_8"..0x82C1,
        "IMAGE_CLASS_11_11_10"..0x82C2,
        "IMAGE_CLASS_10_10_10_2"..0x82C3,
        "VIEW_CLASS_128_BITS"..0x82C4,
        "VIEW_CLASS_96_BITS"..0x82C5,
        "VIEW_CLASS_64_BITS"..0x82C6,
        "VIEW_CLASS_48_BITS"..0x82C7,
        "VIEW_CLASS_32_BITS"..0x82C8,
        "VIEW_CLASS_24_BITS"..0x82C9,
        "VIEW_CLASS_16_BITS"..0x82CA,
        "VIEW_CLASS_8_BITS"..0x82CB,
        "VIEW_CLASS_S3TC_DXT1_RGB"..0x82CC,
        "VIEW_CLASS_S3TC_DXT1_RGBA"..0x82CD,
        "VIEW_CLASS_S3TC_DXT3_RGBA"..0x82CE,
        "VIEW_CLASS_S3TC_DXT5_RGBA"..0x82CF,
        "VIEW_CLASS_RGTC1_RED"..0x82D0,
        "VIEW_CLASS_RGTC2_RG"..0x82D1,
        "VIEW_CLASS_BPTC_UNORM"..0x82D2,
        "VIEW_CLASS_BPTC_FLOAT"..0x82D3
    )

    GL43C reuse "GetInternalformati64v"
}