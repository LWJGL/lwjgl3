/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

const val CONDITIONAL_RENDER_MODES =
    """
    #QUERY_WAIT #QUERY_NO_WAIT #QUERY_BY_REGION_WAIT #QUERY_BY_REGION_NO_WAIT
    #QUERY_WAIT_INVERTED #QUERY_NO_WAIT_INVERTED #QUERY_BY_REGION_WAIT_INVERTED #QUERY_BY_REGION_NO_WAIT_INVERTED
    """

val GL30 = "GL30".nativeClassGL("GL30") {
    extends = GL21
    documentation =
        """
        The OpenGL functionality up to version 3.0. Includes the deprecated symbols of the Compatibility Profile.

        OpenGL 3.0 implementations are guaranteed to support at least versions 1.10, 1.20 and 1.30 of the shading language, although versions 1.10 and 1.20 are
        deprecated in a forward-compatible context.

        Extensions promoted to core in this release:
        ${ul(
            registryLinkTo("EXT", "gpu_shader4"),
            registryLinkTo("NV", "conditional_render"),
            registryLinkTo("APPLE", "flush_buffer_range"),
            """
            ${registryLinkTo("ARB", "color_buffer_float")}, ${registryLinkTo("NV", "depth_buffer_float")}, ${registryLinkTo("ARB", "texture_float")},
            ${registryLinkTo("EXT", "packed_float")} and ${registryLinkTo("EXT", "texture_shared_exponent")}
            """,
            registryLinkTo("EXT", "framebuffer_object"),
            "${registryLinkTo("NV", "half_float")} and ${registryLinkTo("ARB", "half_FLOAT_pixel")}",
            "${registryLinkTo("EXT", "framebuffer_multisample")} and ${registryLinkTo("EXT", "framebuffer_blit")}",
            registryLinkTo("EXT", "texture_integer"),
            registryLinkTo("EXT", "texture_array"),
            registryLinkTo("EXT", "packed_depth_stencil"),
            registryLinkTo("EXT", "draw_buffers2"),
            registryLinkTo("EXT", "texture_compression_rgtc"),
            registryLinkTo("EXT", "transform_feedback"),
            registryLinkTo("APPLE", "vertex_array_object"),
            registryLinkTo("EXT", "framebuffer_sRGB")
        )}
        """

    IntConstant(
        "GetTarget",

        "MAJOR_VERSION"..0x821B,
        "MINOR_VERSION"..0x821C,
        "NUM_EXTENSIONS"..0x821D,

        "CONTEXT_FLAGS"..0x821E,
        "CONTEXT_FLAG_FORWARD_COMPATIBLE_BIT"..0x0001
    )

    IntConstant(
        "Renamed tokens.",

        "COMPARE_REF_TO_TEXTURE".."GL14.GL_COMPARE_R_TO_TEXTURE",

        "CLIP_DISTANCE0".."GL11.GL_CLIP_PLANE0",
        "CLIP_DISTANCE1".."GL11.GL_CLIP_PLANE1",
        "CLIP_DISTANCE2".."GL11.GL_CLIP_PLANE2",
        "CLIP_DISTANCE3".."GL11.GL_CLIP_PLANE3",
        "CLIP_DISTANCE4".."GL11.GL_CLIP_PLANE4",
        "CLIP_DISTANCE5".."GL11.GL_CLIP_PLANE5",
        "CLIP_DISTANCE6"..0x3006,
        "CLIP_DISTANCE7"..0x3007,

        "MAX_CLIP_DISTANCES".."GL11.GL_MAX_CLIP_PLANES",

        "MAX_VARYING_COMPONENTS".."GL20.GL_MAX_VARYING_FLOATS"
    )

    GL30C reuse "GetStringi"
    GL30C reuse "ClearBufferiv"
    GL30C reuse "ClearBufferuiv"
    GL30C reuse "ClearBufferfv"
    GL30C reuse "ClearBufferfi"

    // EXT_gpu_shader4

    IntConstant(
        """
        Accepted by the {@code pname} parameters of GetVertexAttribdv, GetVertexAttribfv, GetVertexAttribiv, GetVertexAttribIuiv and GetVertexAttribIiv.
        """,

        "VERTEX_ATTRIB_ARRAY_INTEGER"..0x88FD
    )

    IntConstant(
        "Returned by the {@code type} parameter of GetActiveUniform.",

        "SAMPLER_1D_ARRAY"..0x8DC0,
        "SAMPLER_2D_ARRAY"..0x8DC1,
        "SAMPLER_1D_ARRAY_SHADOW"..0x8DC3,
        "SAMPLER_2D_ARRAY_SHADOW"..0x8DC4,
        "SAMPLER_CUBE_SHADOW"..0x8DC5,
        "UNSIGNED_INT_VEC2"..0x8DC6,
        "UNSIGNED_INT_VEC3"..0x8DC7,
        "UNSIGNED_INT_VEC4"..0x8DC8,
        "INT_SAMPLER_1D"..0x8DC9,
        "INT_SAMPLER_2D"..0x8DCA,
        "INT_SAMPLER_3D"..0x8DCB,
        "INT_SAMPLER_CUBE"..0x8DCC,
        "INT_SAMPLER_1D_ARRAY"..0x8DCE,
        "INT_SAMPLER_2D_ARRAY"..0x8DCF,
        "UNSIGNED_INT_SAMPLER_1D"..0x8DD1,
        "UNSIGNED_INT_SAMPLER_2D"..0x8DD2,
        "UNSIGNED_INT_SAMPLER_3D"..0x8DD3,
        "UNSIGNED_INT_SAMPLER_CUBE"..0x8DD4,
        "UNSIGNED_INT_SAMPLER_1D_ARRAY"..0x8DD6,
        "UNSIGNED_INT_SAMPLER_2D_ARRAY"..0x8DD7
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "MIN_PROGRAM_TEXEL_OFFSET"..0x8904,
        "MAX_PROGRAM_TEXEL_OFFSET"..0x8905
    )

    GL30C reuse "VertexAttribI1i"
    GL30C reuse "VertexAttribI2i"
    GL30C reuse "VertexAttribI3i"
    GL30C reuse "VertexAttribI4i"
    GL30C reuse "VertexAttribI1ui"
    GL30C reuse "VertexAttribI2ui"
    GL30C reuse "VertexAttribI3ui"
    GL30C reuse "VertexAttribI4ui"
    GL30C reuse "VertexAttribI1iv"
    GL30C reuse "VertexAttribI2iv"
    GL30C reuse "VertexAttribI3iv"
    GL30C reuse "VertexAttribI4iv"
    GL30C reuse "VertexAttribI1uiv"
    GL30C reuse "VertexAttribI2uiv"
    GL30C reuse "VertexAttribI3uiv"
    GL30C reuse "VertexAttribI4uiv"
    GL30C reuse "VertexAttribI4bv"
    GL30C reuse "VertexAttribI4sv"
    GL30C reuse "VertexAttribI4ubv"
    GL30C reuse "VertexAttribI4usv"
    GL30C reuse "VertexAttribIPointer"
    GL30C reuse "GetVertexAttribIiv"
    GL30C reuse "GetVertexAttribIuiv"
    GL30C reuse "Uniform1ui"
    GL30C reuse "Uniform2ui"
    GL30C reuse "Uniform3ui"
    GL30C reuse "Uniform4ui"
    GL30C reuse "Uniform1uiv"
    GL30C reuse "Uniform2uiv"
    GL30C reuse "Uniform3uiv"
    GL30C reuse "Uniform4uiv"
    GL30C reuse "GetUniformuiv"
    GL30C reuse "BindFragDataLocation"
    GL30C reuse "GetFragDataLocation"

    // NV_conditional_render

    IntConstant(
        "Accepted by the {@code mode} parameter of BeginConditionalRender.",

        "QUERY_WAIT"..0x8E13,
        "QUERY_NO_WAIT"..0x8E14,
        "QUERY_BY_REGION_WAIT"..0x8E15,
        "QUERY_BY_REGION_NO_WAIT"..0x8E16
    )

    GL30C reuse "BeginConditionalRender"
    GL30C reuse "EndConditionalRender"

    // ARB_map_buffer_range

    IntConstant(
        "Accepted by the {@code access} parameter of MapBufferRange.",

        "MAP_READ_BIT"..0x0001,
        "MAP_WRITE_BIT"..0x0002,
        "MAP_INVALIDATE_RANGE_BIT"..0x0004,
        "MAP_INVALIDATE_BUFFER_BIT"..0x0008,
        "MAP_FLUSH_EXPLICIT_BIT"..0x0010,
        "MAP_UNSYNCHRONIZED_BIT"..0x0020
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBufferParameteriv.",

        "BUFFER_ACCESS_FLAGS"..0x911F,
        "BUFFER_MAP_LENGTH"..0x9120,
        "BUFFER_MAP_OFFSET"..0x9121
    )

    GL30C reuse "MapBufferRange"
    GL30C reuse "FlushMappedBufferRange"

    // ARB_color_buffer_float

    IntConstant(
        "Accepted by the {@code target} parameter of ClampColor and the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "CLAMP_VERTEX_COLOR"..0x891A,
        "CLAMP_FRAGMENT_COLOR"..0x891B,
        "CLAMP_READ_COLOR"..0x891C
    )

    IntConstant(
        "Accepted by the {@code clamp} parameter of ClampColor.",

        "FIXED_ONLY"..0x891D
    )

    GL30C reuse "ClampColor"

    // ARB_depth_buffer_float

    IntConstant(
        """
        Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage, and
        returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameteriv.
        """,

        "DEPTH_COMPONENT32F"..0x8CAC,
        "DEPTH32F_STENCIL8"..0x8CAD
    )

    IntConstant(
        """
        Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and
        GetTexImage.
        """,

        "FLOAT_32_UNSIGNED_INT_24_8_REV"..0x8DAD
    )

    // ARB_texture_float

    IntConstant(
        "Accepted by the {@code value} parameter of GetTexLevelParameter.",

        "TEXTURE_RED_TYPE"..0x8C10,
        "TEXTURE_GREEN_TYPE"..0x8C11,
        "TEXTURE_BLUE_TYPE"..0x8C12,
        "TEXTURE_ALPHA_TYPE"..0x8C13,
        "TEXTURE_LUMINANCE_TYPE"..0x8C14,
        "TEXTURE_INTENSITY_TYPE"..0x8C15,
        "TEXTURE_DEPTH_TYPE"..0x8C16
    )

    IntConstant(
        "Returned by the {@code params} parameter of GetTexLevelParameter.",

        "UNSIGNED_NORMALIZED"..0x8C17
    )

    IntConstant(
        "Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D.",

        "RGBA32F"..0x8814,
        "RGB32F"..0x8815,
        "RGBA16F"..0x881A,
        "RGB16F"..0x881B
    )

    // EXT_packed_float

    IntConstant(
        "Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage.",

        "R11F_G11F_B10F"..0x8C3A
    )

    IntConstant(
        """
        Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, GetTexImage, TexImage3D, TexSubImage1D, TexSubImage2D,
        TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, ConvolutionFilter3D, GetConvolutionFilter, SeparableFilter2D,
        GetSeparableFilter, ColorTable, ColorSubTable, and GetColorTable.
        """,

        "UNSIGNED_INT_10F_11F_11F_REV"..0x8C3B
    )

    // EXT_texture_shared_exponent

    IntConstant(
        "Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage.",

        "RGB9_E5"..0x8C3D
    )

    IntConstant(
        """
        Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, GetTexImage, TexImage3D, TexSubImage1D, TexSubImage2D,
        TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, ConvolutionFilter3D, GetConvolutionFilter, SeparableFilter2D,
        GetSeparableFilter, ColorTable, ColorSubTable, and GetColorTable.
        """,

        "UNSIGNED_INT_5_9_9_9_REV"..0x8C3E
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetTexLevelParameterfv and GetTexLevelParameteriv.",

        "TEXTURE_SHARED_SIZE"..0x8C3F
    )

    // ARB_framebuffer_object

    IntConstant(
        """
        Accepted by the {@code target} parameter of BindFramebuffer, CheckFramebufferStatus, FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and
        GetFramebufferAttachmentParameteriv.
        """,

        "FRAMEBUFFER"..0x8D40,
        "READ_FRAMEBUFFER"..0x8CA8,
        "DRAW_FRAMEBUFFER"..0x8CA9
    )

    IntConstant(
        """
        Accepted by the {@code target} parameter of BindRenderbuffer, RenderbufferStorage, and GetRenderbufferParameteriv, and returned by
        GetFramebufferAttachmentParameteriv.
        """,

        "RENDERBUFFER"..0x8D41
    )

    IntConstant(
        "Accepted by the {@code internalformat} parameter of RenderbufferStorage.",

        "STENCIL_INDEX1"..0x8D46,
        "STENCIL_INDEX4"..0x8D47,
        "STENCIL_INDEX8"..0x8D48,
        "STENCIL_INDEX16"..0x8D49
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetRenderbufferParameteriv.",

        "RENDERBUFFER_WIDTH"..0x8D42,
        "RENDERBUFFER_HEIGHT"..0x8D43,
        "RENDERBUFFER_INTERNAL_FORMAT"..0x8D44,
        "RENDERBUFFER_RED_SIZE"..0x8D50,
        "RENDERBUFFER_GREEN_SIZE"..0x8D51,
        "RENDERBUFFER_BLUE_SIZE"..0x8D52,
        "RENDERBUFFER_ALPHA_SIZE"..0x8D53,
        "RENDERBUFFER_DEPTH_SIZE"..0x8D54,
        "RENDERBUFFER_STENCIL_SIZE"..0x8D55,
        "RENDERBUFFER_SAMPLES"..0x8CAB
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv.",

        "FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE"..0x8CD0,
        "FRAMEBUFFER_ATTACHMENT_OBJECT_NAME"..0x8CD1,
        "FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL"..0x8CD2,
        "FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE"..0x8CD3,
        "FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER"..0x8CD4,
        "FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING"..0x8210,
        "FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE"..0x8211,
        "FRAMEBUFFER_ATTACHMENT_RED_SIZE"..0x8212,
        "FRAMEBUFFER_ATTACHMENT_GREEN_SIZE"..0x8213,
        "FRAMEBUFFER_ATTACHMENT_BLUE_SIZE"..0x8214,
        "FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE"..0x8215,
        "FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE"..0x8216,
        "FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE"..0x8217
    )

    IntConstant(
        "Returned in {@code params} by GetFramebufferAttachmentParameteriv.",

        "FRAMEBUFFER_DEFAULT"..0x8218,
        "INDEX"..0x8222
    )

    IntConstant(
        "Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.",

        "COLOR_ATTACHMENT0"..0x8CE0,
        "COLOR_ATTACHMENT1"..0x8CE1,
        "COLOR_ATTACHMENT2"..0x8CE2,
        "COLOR_ATTACHMENT3"..0x8CE3,
        "COLOR_ATTACHMENT4"..0x8CE4,
        "COLOR_ATTACHMENT5"..0x8CE5,
        "COLOR_ATTACHMENT6"..0x8CE6,
        "COLOR_ATTACHMENT7"..0x8CE7,
        "COLOR_ATTACHMENT8"..0x8CE8,
        "COLOR_ATTACHMENT9"..0x8CE9,
        "COLOR_ATTACHMENT10"..0x8CEA,
        "COLOR_ATTACHMENT11"..0x8CEB,
        "COLOR_ATTACHMENT12"..0x8CEC,
        "COLOR_ATTACHMENT13"..0x8CED,
        "COLOR_ATTACHMENT14"..0x8CEE,
        "COLOR_ATTACHMENT15"..0x8CEF,
        "COLOR_ATTACHMENT16"..0x8CF0,
        "COLOR_ATTACHMENT17"..0x8CF1,
        "COLOR_ATTACHMENT18"..0x8CF2,
        "COLOR_ATTACHMENT19"..0x8CF3,
        "COLOR_ATTACHMENT20"..0x8CF4,
        "COLOR_ATTACHMENT21"..0x8CF5,
        "COLOR_ATTACHMENT22"..0x8CF6,
        "COLOR_ATTACHMENT23"..0x8CF7,
        "COLOR_ATTACHMENT24"..0x8CF8,
        "COLOR_ATTACHMENT25"..0x8CF9,
        "COLOR_ATTACHMENT26"..0x8CFA,
        "COLOR_ATTACHMENT27"..0x8CFB,
        "COLOR_ATTACHMENT28"..0x8CFC,
        "COLOR_ATTACHMENT29"..0x8CFD,
        "COLOR_ATTACHMENT30"..0x8CFE,
        "COLOR_ATTACHMENT31"..0x8CFF,
        "DEPTH_ATTACHMENT"..0x8D00,
        "STENCIL_ATTACHMENT"..0x8D20,
        "DEPTH_STENCIL_ATTACHMENT"..0x821A
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "MAX_SAMPLES"..0x8D57
    )

    IntConstant(
        "Returned by CheckFramebufferStatus().",

        "FRAMEBUFFER_COMPLETE"..0x8CD5,
        "FRAMEBUFFER_INCOMPLETE_ATTACHMENT"..0x8CD6,
        "FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT"..0x8CD7,
        "FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER"..0x8CDB,
        "FRAMEBUFFER_INCOMPLETE_READ_BUFFER"..0x8CDC,
        "FRAMEBUFFER_UNSUPPORTED"..0x8CDD,
        "FRAMEBUFFER_INCOMPLETE_MULTISAMPLE"..0x8D56,
        "FRAMEBUFFER_UNDEFINED"..0x8219
    )

    IntConstant(
        "Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv,  and GetDoublev.",

        "FRAMEBUFFER_BINDING"..0x8CA6,
        "DRAW_FRAMEBUFFER_BINDING"..0x8CA6,
        "READ_FRAMEBUFFER_BINDING"..0x8CAA,
        "RENDERBUFFER_BINDING"..0x8CA7,
        "MAX_COLOR_ATTACHMENTS"..0x8CDF,
        "MAX_RENDERBUFFER_SIZE"..0x84E8
    )

    IntConstant(
        "Returned by GetError().",

        "INVALID_FRAMEBUFFER_OPERATION"..0x0506
    )

    IntConstant(
        """
        Accepted by the {@code format} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and
        GetTexImage, by the {@code type} parameter of CopyPixels, by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D,
        CopyTexImage2D, and RenderbufferStorage, and returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameteriv.
        """,

        "DEPTH_STENCIL"..0x84F9
    )

    IntConstant(
        """
        Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and
        GetTexImage.
        """,

        "UNSIGNED_INT_24_8"..0x84FA
    )

    IntConstant(
        """
        Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage, and
        returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameteriv.
        """,

        "DEPTH24_STENCIL8"..0x88F0
    )

    IntConstant(
        "Accepted by the {@code value} parameter of GetTexLevelParameter.",

        "TEXTURE_STENCIL_SIZE"..0x88F1
    )

    GL30C reuse "IsRenderbuffer"
    GL30C reuse "BindRenderbuffer"
    GL30C reuse "DeleteRenderbuffers"
    GL30C reuse "GenRenderbuffers"
    GL30C reuse "RenderbufferStorage"
    GL30C reuse "RenderbufferStorageMultisample"
    GL30C reuse "GetRenderbufferParameteriv"
    GL30C reuse "IsFramebuffer"
    GL30C reuse "BindFramebuffer"
    GL30C reuse "DeleteFramebuffers"
    GL30C reuse "GenFramebuffers"
    GL30C reuse "CheckFramebufferStatus"
    GL30C reuse "FramebufferTexture1D"
    GL30C reuse "FramebufferTexture2D"
    GL30C reuse "FramebufferTexture3D"
    GL30C reuse "FramebufferTextureLayer"
    GL30C reuse "FramebufferRenderbuffer"
    GL30C reuse "GetFramebufferAttachmentParameteriv"
    GL30C reuse "BlitFramebuffer"
    GL30C reuse "GenerateMipmap"

    // ARB_half_float_pixel & ARB_half_float_vertex

    IntConstant(
        """
        Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, GetTexImage, TexSubImage1D, TexSubImage2D,
        TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, GetConvolutionFilter, SeparableFilter2D, GetSeparableFilter,
        ColorTable, ColorSubTable, and GetColorTable.

        Accepted by the {@code type} argument of VertexPointer, NormalPointer, ColorPointer, SecondaryColorPointer, FogCoordPointer, TexCoordPointer, and
        VertexAttribPointer.
        """,

        "HALF_FLOAT"..0x140B
    )

    // EXT_texture_integer

    IntConstant(
        "Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D.",

        "RGBA32UI"..0x8D70,
        "RGB32UI"..0x8D71,
        "RGBA16UI"..0x8D76,
        "RGB16UI"..0x8D77,
        "RGBA8UI"..0x8D7C,
        "RGB8UI"..0x8D7D,
        "RGBA32I"..0x8D82,
        "RGB32I"..0x8D83,
        "RGBA16I"..0x8D88,
        "RGB16I"..0x8D89,
        "RGBA8I"..0x8D8E,
        "RGB8I"..0x8D8F
    )

    IntConstant(
        """
        Accepted by the {@code format} parameter of TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, DrawPixels and ReadPixels.
        """,

        "RED_INTEGER"..0x8D94,
        "GREEN_INTEGER"..0x8D95,
        "BLUE_INTEGER"..0x8D96,
        "ALPHA_INTEGER"..0x8D97,
        "RGB_INTEGER"..0x8D98,
        "RGBA_INTEGER"..0x8D99,
        "BGR_INTEGER"..0x8D9A,
        "BGRA_INTEGER"..0x8D9B
    )

    GL30C reuse "TexParameterIiv"
    GL30C reuse "TexParameterIuiv"
    GL30C reuse "GetTexParameterIiv"
    GL30C reuse "GetTexParameterIuiv"

    // EXT_texture_array

    IntConstant(
        "Accepted by the {@code target} parameter of TexParameteri, TexParameteriv, TexParameterf, TexParameterfv, GenerateMipmap, and BindTexture.",

        "TEXTURE_1D_ARRAY"..0x8C18,
        "TEXTURE_2D_ARRAY"..0x8C1A
    )

    IntConstant(
        "Accepted by the {@code target} parameter of TexImage3D, TexSubImage3D, CopyTexSubImage3D, CompressedTexImage3D, and CompressedTexSubImage3D.",

        "PROXY_TEXTURE_2D_ARRAY"..0x8C1B
    )

    IntConstant(
        """
        Accepted by the {@code target} parameter of TexImage2D, TexSubImage2D, CopyTexImage2D, CopyTexSubImage2D, CompressedTexImage2D, and
        CompressedTexSubImage2D.
        """,

        "PROXY_TEXTURE_1D_ARRAY"..0x8C19
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv and GetFloatv.",

        "TEXTURE_BINDING_1D_ARRAY"..0x8C1C,
        "TEXTURE_BINDING_2D_ARRAY"..0x8C1D,
        "MAX_ARRAY_TEXTURE_LAYERS"..0x88FF
    )

    // EXT_draw_buffers2

    GL30C reuse "ColorMaski"
    GL30C reuse "GetBooleani_v"
    GL30C reuse "GetIntegeri_v"
    GL30C reuse "Enablei"
    GL30C reuse "Disablei"
    GL30C reuse "IsEnabledi"

    // EXT_texture_compression_rgtc

    IntConstant(
        """
        Accepted by the {@code internalformat} parameter of TexImage2D, CopyTexImage2D, and CompressedTexImage2D and the {@code format} parameter of
        CompressedTexSubImage2D.
        """,

        "COMPRESSED_RED_RGTC1"..0x8DBB,
        "COMPRESSED_SIGNED_RED_RGTC1"..0x8DBC,
        "COMPRESSED_RG_RGTC2"..0x8DBD,
        "COMPRESSED_SIGNED_RG_RGTC2"..0x8DBE
    )

    // ARB_texture_rg

    IntConstant(
        "Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D.",

        "R8"..0x8229,
        "R16"..0x822A,
        "RG8"..0x822B,
        "RG16"..0x822C,
        "R16F"..0x822D,
        "R32F"..0x822E,
        "RG16F"..0x822F,
        "RG32F"..0x8230,
        "R8I"..0x8231,
        "R8UI"..0x8232,
        "R16I"..0x8233,
        "R16UI"..0x8234,
        "R32I"..0x8235,
        "R32UI"..0x8236,
        "RG8I"..0x8237,
        "RG8UI"..0x8238,
        "RG16I"..0x8239,
        "RG16UI"..0x823A,
        "RG32I"..0x823B,
        "RG32UI"..0x823C,
        "RG"..0x8227,
        "COMPRESSED_RED"..0x8225,
        "COMPRESSED_RG"..0x8226
    )

    IntConstant(
        "Accepted by the {@code format} parameter of TexImage3D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and ReadPixels.",

        "RG_INTEGER"..0x8228
    )

    // EXT_transform_feedback

    IntConstant(
        """
        Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv,
        BindBufferRange, BindBufferOffset and BindBufferBase.
        """,

        "TRANSFORM_FEEDBACK_BUFFER"..0x8C8E
    )

    IntConstant(
        "Accepted by the {@code param} parameter of GetIntegeri_v and GetBooleani_v.",

        "TRANSFORM_FEEDBACK_BUFFER_START"..0x8C84,
        "TRANSFORM_FEEDBACK_BUFFER_SIZE"..0x8C85
    )

    IntConstant(
        """
        Accepted by the {@code param} parameter of GetIntegeri_v and GetBooleani_v, and by the {@code pname} parameter of GetBooleanv,
        GetDoublev, GetIntegerv, and GetFloatv.
        """,

        "TRANSFORM_FEEDBACK_BUFFER_BINDING"..0x8C8F
    )

    IntConstant(
        "Accepted by the {@code bufferMode} parameter of TransformFeedbackVaryings.",

        "INTERLEAVED_ATTRIBS"..0x8C8C,
        "SEPARATE_ATTRIBS"..0x8C8D
    )

    IntConstant(
        "Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv.",

        "PRIMITIVES_GENERATED"..0x8C87,
        "TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN"..0x8C88
    )

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
        GetDoublev.
        """,

        "RASTERIZER_DISCARD"..0x8C89
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.",

        "MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS"..0x8C8A,
        "MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS"..0x8C8B,
        "MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS"..0x8C80
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetProgramiv.",

        "TRANSFORM_FEEDBACK_VARYINGS"..0x8C83,
        "TRANSFORM_FEEDBACK_BUFFER_MODE"..0x8C7F,
        "TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH"..0x8C76
    )

    GL30C reuse "BindBufferRange"
    GL30C reuse "BindBufferBase"
    GL30C reuse "BeginTransformFeedback"
    GL30C reuse "EndTransformFeedback"
    GL30C reuse "TransformFeedbackVaryings"
    GL30C reuse "GetTransformFeedbackVarying"

    // ARB_vertex_array_object

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "VERTEX_ARRAY_BINDING"..0x85B5
    )

    GL30C reuse "BindVertexArray"
    GL30C reuse "DeleteVertexArrays"
    GL30C reuse "GenVertexArrays"
    GL30C reuse "IsVertexArray"

    // ARB_framebuffer_sRGB

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
        GetDoublev.
        """,

        "FRAMEBUFFER_SRGB"..0x8DB9
    )
}