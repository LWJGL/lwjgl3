/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/**
 * The OpenGL functionality up to version 3.0. Includes the deprecated symbols of the Compatibility Profile.
 * 
 * <p>OpenGL 3.0 implementations are guaranteed to support at least versions 1.10, 1.20 and 1.30 of the shading language, although versions 1.10 and 1.20 are
 * deprecated in a forward-compatible context.</p>
 * 
 * <p>Extensions promoted to core in this release:</p>
 * 
 * <ul>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_gpu_shader4.txt">EXT_gpu_shader4</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_conditional_render.txt">NV_conditional_render</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/APPLE/APPLE_flush_buffer_range.txt">APPLE_flush_buffer_range</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_color_buffer_float.txt">ARB_color_buffer_float</a>, <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_depth_buffer_float.txt">NV_depth_buffer_float</a>, <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_float.txt">ARB_texture_float</a>,
 * <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_packed_float.txt">EXT_packed_float</a> and <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_texture_shared_exponent.txt">EXT_texture_shared_exponent</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_framebuffer_object.txt">EXT_framebuffer_object</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_half_float.txt">NV_half_float</a> and <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_half_FLOAT_pixel.txt">ARB_half_FLOAT_pixel</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_framebuffer_multisample.txt">EXT_framebuffer_multisample</a> and <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_framebuffer_blit.txt">EXT_framebuffer_blit</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_texture_integer.txt">EXT_texture_integer</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_texture_array.txt">EXT_texture_array</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_packed_depth_stencil.txt">EXT_packed_depth_stencil</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_draw_buffers2.txt">EXT_draw_buffers2</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_texture_compression_rgtc.txt">EXT_texture_compression_rgtc</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_transform_feedback.txt">EXT_transform_feedback</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/APPLE/APPLE_vertex_array_object.txt">APPLE_vertex_array_object</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_framebuffer_sRGB.txt">EXT_framebuffer_sRGB</a></li>
 * </ul>
 */
public class GL30 extends GL21 {

    /** GetTarget */
    public static final int
        GL_MAJOR_VERSION                       = 0x821B,
        GL_MINOR_VERSION                       = 0x821C,
        GL_NUM_EXTENSIONS                      = 0x821D,
        GL_CONTEXT_FLAGS                       = 0x821E,
        GL_CONTEXT_FLAG_FORWARD_COMPATIBLE_BIT = 0x1;

    /** Renamed tokens. */
    public static final int
        GL_COMPARE_REF_TO_TEXTURE = GL14.GL_COMPARE_R_TO_TEXTURE,
        GL_CLIP_DISTANCE0         = GL11.GL_CLIP_PLANE0,
        GL_CLIP_DISTANCE1         = GL11.GL_CLIP_PLANE1,
        GL_CLIP_DISTANCE2         = GL11.GL_CLIP_PLANE2,
        GL_CLIP_DISTANCE3         = GL11.GL_CLIP_PLANE3,
        GL_CLIP_DISTANCE4         = GL11.GL_CLIP_PLANE4,
        GL_CLIP_DISTANCE5         = GL11.GL_CLIP_PLANE5,
        GL_CLIP_DISTANCE6         = 0x3006,
        GL_CLIP_DISTANCE7         = 0x3007,
        GL_MAX_CLIP_DISTANCES     = GL11.GL_MAX_CLIP_PLANES,
        GL_MAX_VARYING_COMPONENTS = GL20.GL_MAX_VARYING_FLOATS;

    /** Accepted by the {@code pname} parameters of GetVertexAttribdv, GetVertexAttribfv, GetVertexAttribiv, GetVertexAttribIuiv and GetVertexAttribIiv. */
    public static final int GL_VERTEX_ATTRIB_ARRAY_INTEGER = 0x88FD;

    /** Returned by the {@code type} parameter of GetActiveUniform. */
    public static final int
        GL_SAMPLER_1D_ARRAY              = 0x8DC0,
        GL_SAMPLER_2D_ARRAY              = 0x8DC1,
        GL_SAMPLER_1D_ARRAY_SHADOW       = 0x8DC3,
        GL_SAMPLER_2D_ARRAY_SHADOW       = 0x8DC4,
        GL_SAMPLER_CUBE_SHADOW           = 0x8DC5,
        GL_UNSIGNED_INT_VEC2             = 0x8DC6,
        GL_UNSIGNED_INT_VEC3             = 0x8DC7,
        GL_UNSIGNED_INT_VEC4             = 0x8DC8,
        GL_INT_SAMPLER_1D                = 0x8DC9,
        GL_INT_SAMPLER_2D                = 0x8DCA,
        GL_INT_SAMPLER_3D                = 0x8DCB,
        GL_INT_SAMPLER_CUBE              = 0x8DCC,
        GL_INT_SAMPLER_1D_ARRAY          = 0x8DCE,
        GL_INT_SAMPLER_2D_ARRAY          = 0x8DCF,
        GL_UNSIGNED_INT_SAMPLER_1D       = 0x8DD1,
        GL_UNSIGNED_INT_SAMPLER_2D       = 0x8DD2,
        GL_UNSIGNED_INT_SAMPLER_3D       = 0x8DD3,
        GL_UNSIGNED_INT_SAMPLER_CUBE     = 0x8DD4,
        GL_UNSIGNED_INT_SAMPLER_1D_ARRAY = 0x8DD6,
        GL_UNSIGNED_INT_SAMPLER_2D_ARRAY = 0x8DD7;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_MIN_PROGRAM_TEXEL_OFFSET = 0x8904,
        GL_MAX_PROGRAM_TEXEL_OFFSET = 0x8905;

    /** Accepted by the {@code mode} parameter of BeginConditionalRender. */
    public static final int
        GL_QUERY_WAIT              = 0x8E13,
        GL_QUERY_NO_WAIT           = 0x8E14,
        GL_QUERY_BY_REGION_WAIT    = 0x8E15,
        GL_QUERY_BY_REGION_NO_WAIT = 0x8E16;

    /** Accepted by the {@code access} parameter of MapBufferRange. */
    public static final int
        GL_MAP_READ_BIT              = 0x1,
        GL_MAP_WRITE_BIT             = 0x2,
        GL_MAP_INVALIDATE_RANGE_BIT  = 0x4,
        GL_MAP_INVALIDATE_BUFFER_BIT = 0x8,
        GL_MAP_FLUSH_EXPLICIT_BIT    = 0x10,
        GL_MAP_UNSYNCHRONIZED_BIT    = 0x20;

    /** Accepted by the {@code pname} parameter of GetBufferParameteriv. */
    public static final int
        GL_BUFFER_ACCESS_FLAGS = 0x911F,
        GL_BUFFER_MAP_LENGTH   = 0x9120,
        GL_BUFFER_MAP_OFFSET   = 0x9121;

    /** Accepted by the {@code target} parameter of ClampColor and the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_CLAMP_VERTEX_COLOR   = 0x891A,
        GL_CLAMP_FRAGMENT_COLOR = 0x891B,
        GL_CLAMP_READ_COLOR     = 0x891C;

    /** Accepted by the {@code clamp} parameter of ClampColor. */
    public static final int GL_FIXED_ONLY = 0x891D;

    /**
     * Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage, and
     * returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameteriv.
     */
    public static final int
        GL_DEPTH_COMPONENT32F = 0x8CAC,
        GL_DEPTH32F_STENCIL8  = 0x8CAD;

    /**
     * Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and
     * GetTexImage.
     */
    public static final int GL_FLOAT_32_UNSIGNED_INT_24_8_REV = 0x8DAD;

    /** Accepted by the {@code value} parameter of GetTexLevelParameter. */
    public static final int
        GL_TEXTURE_RED_TYPE       = 0x8C10,
        GL_TEXTURE_GREEN_TYPE     = 0x8C11,
        GL_TEXTURE_BLUE_TYPE      = 0x8C12,
        GL_TEXTURE_ALPHA_TYPE     = 0x8C13,
        GL_TEXTURE_LUMINANCE_TYPE = 0x8C14,
        GL_TEXTURE_INTENSITY_TYPE = 0x8C15,
        GL_TEXTURE_DEPTH_TYPE     = 0x8C16;

    /** Returned by the {@code params} parameter of GetTexLevelParameter. */
    public static final int GL_UNSIGNED_NORMALIZED = 0x8C17;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D. */
    public static final int
        GL_RGBA32F = 0x8814,
        GL_RGB32F  = 0x8815,
        GL_RGBA16F = 0x881A,
        GL_RGB16F  = 0x881B;

    /** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage. */
    public static final int GL_R11F_G11F_B10F = 0x8C3A;

    /**
     * Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, GetTexImage, TexImage3D, TexSubImage1D, TexSubImage2D,
     * TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, ConvolutionFilter3D, GetConvolutionFilter, SeparableFilter2D,
     * GetSeparableFilter, ColorTable, ColorSubTable, and GetColorTable.
     */
    public static final int GL_UNSIGNED_INT_10F_11F_11F_REV = 0x8C3B;

    /** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage. */
    public static final int GL_RGB9_E5 = 0x8C3D;

    /**
     * Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, GetTexImage, TexImage3D, TexSubImage1D, TexSubImage2D,
     * TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, ConvolutionFilter3D, GetConvolutionFilter, SeparableFilter2D,
     * GetSeparableFilter, ColorTable, ColorSubTable, and GetColorTable.
     */
    public static final int GL_UNSIGNED_INT_5_9_9_9_REV = 0x8C3E;

    /** Accepted by the {@code pname} parameter of GetTexLevelParameterfv and GetTexLevelParameteriv. */
    public static final int GL_TEXTURE_SHARED_SIZE = 0x8C3F;

    /**
     * Accepted by the {@code target} parameter of BindFramebuffer, CheckFramebufferStatus, FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and
     * GetFramebufferAttachmentParameteriv.
     */
    public static final int
        GL_FRAMEBUFFER      = 0x8D40,
        GL_READ_FRAMEBUFFER = 0x8CA8,
        GL_DRAW_FRAMEBUFFER = 0x8CA9;

    /**
     * Accepted by the {@code target} parameter of BindRenderbuffer, RenderbufferStorage, and GetRenderbufferParameteriv, and returned by
     * GetFramebufferAttachmentParameteriv.
     */
    public static final int GL_RENDERBUFFER = 0x8D41;

    /** Accepted by the {@code internalformat} parameter of RenderbufferStorage. */
    public static final int
        GL_STENCIL_INDEX1  = 0x8D46,
        GL_STENCIL_INDEX4  = 0x8D47,
        GL_STENCIL_INDEX8  = 0x8D48,
        GL_STENCIL_INDEX16 = 0x8D49;

    /** Accepted by the {@code pname} parameter of GetRenderbufferParameteriv. */
    public static final int
        GL_RENDERBUFFER_WIDTH           = 0x8D42,
        GL_RENDERBUFFER_HEIGHT          = 0x8D43,
        GL_RENDERBUFFER_INTERNAL_FORMAT = 0x8D44,
        GL_RENDERBUFFER_RED_SIZE        = 0x8D50,
        GL_RENDERBUFFER_GREEN_SIZE      = 0x8D51,
        GL_RENDERBUFFER_BLUE_SIZE       = 0x8D52,
        GL_RENDERBUFFER_ALPHA_SIZE      = 0x8D53,
        GL_RENDERBUFFER_DEPTH_SIZE      = 0x8D54,
        GL_RENDERBUFFER_STENCIL_SIZE    = 0x8D55,
        GL_RENDERBUFFER_SAMPLES         = 0x8CAB;

    /** Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv. */
    public static final int
        GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE           = 0x8CD0,
        GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME           = 0x8CD1,
        GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL         = 0x8CD2,
        GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 0x8CD3,
        GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER         = 0x8CD4,
        GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING        = 0x8210,
        GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE        = 0x8211,
        GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE              = 0x8212,
        GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE            = 0x8213,
        GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE             = 0x8214,
        GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE            = 0x8215,
        GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE            = 0x8216,
        GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE          = 0x8217;

    /** Returned in {@code params} by GetFramebufferAttachmentParameteriv. */
    public static final int
        GL_FRAMEBUFFER_DEFAULT = 0x8218,
        GL_INDEX               = 0x8222;

    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv. */
    public static final int
        GL_COLOR_ATTACHMENT0        = 0x8CE0,
        GL_COLOR_ATTACHMENT1        = 0x8CE1,
        GL_COLOR_ATTACHMENT2        = 0x8CE2,
        GL_COLOR_ATTACHMENT3        = 0x8CE3,
        GL_COLOR_ATTACHMENT4        = 0x8CE4,
        GL_COLOR_ATTACHMENT5        = 0x8CE5,
        GL_COLOR_ATTACHMENT6        = 0x8CE6,
        GL_COLOR_ATTACHMENT7        = 0x8CE7,
        GL_COLOR_ATTACHMENT8        = 0x8CE8,
        GL_COLOR_ATTACHMENT9        = 0x8CE9,
        GL_COLOR_ATTACHMENT10       = 0x8CEA,
        GL_COLOR_ATTACHMENT11       = 0x8CEB,
        GL_COLOR_ATTACHMENT12       = 0x8CEC,
        GL_COLOR_ATTACHMENT13       = 0x8CED,
        GL_COLOR_ATTACHMENT14       = 0x8CEE,
        GL_COLOR_ATTACHMENT15       = 0x8CEF,
        GL_COLOR_ATTACHMENT16       = 0x8CF0,
        GL_COLOR_ATTACHMENT17       = 0x8CF1,
        GL_COLOR_ATTACHMENT18       = 0x8CF2,
        GL_COLOR_ATTACHMENT19       = 0x8CF3,
        GL_COLOR_ATTACHMENT20       = 0x8CF4,
        GL_COLOR_ATTACHMENT21       = 0x8CF5,
        GL_COLOR_ATTACHMENT22       = 0x8CF6,
        GL_COLOR_ATTACHMENT23       = 0x8CF7,
        GL_COLOR_ATTACHMENT24       = 0x8CF8,
        GL_COLOR_ATTACHMENT25       = 0x8CF9,
        GL_COLOR_ATTACHMENT26       = 0x8CFA,
        GL_COLOR_ATTACHMENT27       = 0x8CFB,
        GL_COLOR_ATTACHMENT28       = 0x8CFC,
        GL_COLOR_ATTACHMENT29       = 0x8CFD,
        GL_COLOR_ATTACHMENT30       = 0x8CFE,
        GL_COLOR_ATTACHMENT31       = 0x8CFF,
        GL_DEPTH_ATTACHMENT         = 0x8D00,
        GL_STENCIL_ATTACHMENT       = 0x8D20,
        GL_DEPTH_STENCIL_ATTACHMENT = 0x821A;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int GL_MAX_SAMPLES = 0x8D57;

    /** Returned by CheckFramebufferStatus(). */
    public static final int
        GL_FRAMEBUFFER_COMPLETE                      = 0x8CD5,
        GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT         = 0x8CD6,
        GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 0x8CD7,
        GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER        = 0x8CDB,
        GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER        = 0x8CDC,
        GL_FRAMEBUFFER_UNSUPPORTED                   = 0x8CDD,
        GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE        = 0x8D56,
        GL_FRAMEBUFFER_UNDEFINED                     = 0x8219;

    /** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv,  and GetDoublev. */
    public static final int
        GL_FRAMEBUFFER_BINDING      = 0x8CA6,
        GL_DRAW_FRAMEBUFFER_BINDING = 0x8CA6,
        GL_READ_FRAMEBUFFER_BINDING = 0x8CAA,
        GL_RENDERBUFFER_BINDING     = 0x8CA7,
        GL_MAX_COLOR_ATTACHMENTS    = 0x8CDF,
        GL_MAX_RENDERBUFFER_SIZE    = 0x84E8;

    /** Returned by GetError(). */
    public static final int GL_INVALID_FRAMEBUFFER_OPERATION = 0x506;

    /**
     * Accepted by the {@code format} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and
     * GetTexImage, by the {@code type} parameter of CopyPixels, by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D,
     * CopyTexImage2D, and RenderbufferStorage, and returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameteriv.
     */
    public static final int GL_DEPTH_STENCIL = 0x84F9;

    /**
     * Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and
     * GetTexImage.
     */
    public static final int GL_UNSIGNED_INT_24_8 = 0x84FA;

    /**
     * Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage, and
     * returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameteriv.
     */
    public static final int GL_DEPTH24_STENCIL8 = 0x88F0;

    /** Accepted by the {@code value} parameter of GetTexLevelParameter. */
    public static final int GL_TEXTURE_STENCIL_SIZE = 0x88F1;

    /**
     * Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, GetTexImage, TexSubImage1D, TexSubImage2D,
     * TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, GetConvolutionFilter, SeparableFilter2D, GetSeparableFilter,
     * ColorTable, ColorSubTable, and GetColorTable.
     * 
     * <p>Accepted by the {@code type} argument of VertexPointer, NormalPointer, ColorPointer, SecondaryColorPointer, FogCoordPointer, TexCoordPointer, and
     * VertexAttribPointer.</p>
     */
    public static final int GL_HALF_FLOAT = 0x140B;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D. */
    public static final int
        GL_RGBA32UI = 0x8D70,
        GL_RGB32UI  = 0x8D71,
        GL_RGBA16UI = 0x8D76,
        GL_RGB16UI  = 0x8D77,
        GL_RGBA8UI  = 0x8D7C,
        GL_RGB8UI   = 0x8D7D,
        GL_RGBA32I  = 0x8D82,
        GL_RGB32I   = 0x8D83,
        GL_RGBA16I  = 0x8D88,
        GL_RGB16I   = 0x8D89,
        GL_RGBA8I   = 0x8D8E,
        GL_RGB8I    = 0x8D8F;

    /** Accepted by the {@code format} parameter of TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, DrawPixels and ReadPixels. */
    public static final int
        GL_RED_INTEGER   = 0x8D94,
        GL_GREEN_INTEGER = 0x8D95,
        GL_BLUE_INTEGER  = 0x8D96,
        GL_ALPHA_INTEGER = 0x8D97,
        GL_RGB_INTEGER   = 0x8D98,
        GL_RGBA_INTEGER  = 0x8D99,
        GL_BGR_INTEGER   = 0x8D9A,
        GL_BGRA_INTEGER  = 0x8D9B;

    /** Accepted by the {@code target} parameter of TexParameteri, TexParameteriv, TexParameterf, TexParameterfv, GenerateMipmap, and BindTexture. */
    public static final int
        GL_TEXTURE_1D_ARRAY = 0x8C18,
        GL_TEXTURE_2D_ARRAY = 0x8C1A;

    /** Accepted by the {@code target} parameter of TexImage3D, TexSubImage3D, CopyTexSubImage3D, CompressedTexImage3D, and CompressedTexSubImage3D. */
    public static final int GL_PROXY_TEXTURE_2D_ARRAY = 0x8C1B;

    /**
     * Accepted by the {@code target} parameter of TexImage2D, TexSubImage2D, CopyTexImage2D, CopyTexSubImage2D, CompressedTexImage2D, and
     * CompressedTexSubImage2D.
     */
    public static final int GL_PROXY_TEXTURE_1D_ARRAY = 0x8C19;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv and GetFloatv. */
    public static final int
        GL_TEXTURE_BINDING_1D_ARRAY = 0x8C1C,
        GL_TEXTURE_BINDING_2D_ARRAY = 0x8C1D,
        GL_MAX_ARRAY_TEXTURE_LAYERS = 0x88FF;

    /**
     * Accepted by the {@code internalformat} parameter of TexImage2D, CopyTexImage2D, and CompressedTexImage2D and the {@code format} parameter of
     * CompressedTexSubImage2D.
     */
    public static final int
        GL_COMPRESSED_RED_RGTC1        = 0x8DBB,
        GL_COMPRESSED_SIGNED_RED_RGTC1 = 0x8DBC,
        GL_COMPRESSED_RG_RGTC2         = 0x8DBD,
        GL_COMPRESSED_SIGNED_RG_RGTC2  = 0x8DBE;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D. */
    public static final int
        GL_R8             = 0x8229,
        GL_R16            = 0x822A,
        GL_RG8            = 0x822B,
        GL_RG16           = 0x822C,
        GL_R16F           = 0x822D,
        GL_R32F           = 0x822E,
        GL_RG16F          = 0x822F,
        GL_RG32F          = 0x8230,
        GL_R8I            = 0x8231,
        GL_R8UI           = 0x8232,
        GL_R16I           = 0x8233,
        GL_R16UI          = 0x8234,
        GL_R32I           = 0x8235,
        GL_R32UI          = 0x8236,
        GL_RG8I           = 0x8237,
        GL_RG8UI          = 0x8238,
        GL_RG16I          = 0x8239,
        GL_RG16UI         = 0x823A,
        GL_RG32I          = 0x823B,
        GL_RG32UI         = 0x823C,
        GL_RG             = 0x8227,
        GL_COMPRESSED_RED = 0x8225,
        GL_COMPRESSED_RG  = 0x8226;

    /** Accepted by the {@code format} parameter of TexImage3D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and ReadPixels. */
    public static final int GL_RG_INTEGER = 0x8228;

    /**
     * Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv,
     * BindBufferRange, BindBufferOffset and BindBufferBase.
     */
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER = 0x8C8E;

    /** Accepted by the {@code param} parameter of GetIntegeri_v and GetBooleani_v. */
    public static final int
        GL_TRANSFORM_FEEDBACK_BUFFER_START = 0x8C84,
        GL_TRANSFORM_FEEDBACK_BUFFER_SIZE  = 0x8C85;

    /**
     * Accepted by the {@code param} parameter of GetIntegeri_v and GetBooleani_v, and by the {@code pname} parameter of GetBooleanv,
     * GetDoublev, GetIntegerv, and GetFloatv.
     */
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING = 0x8C8F;

    /** Accepted by the {@code bufferMode} parameter of TransformFeedbackVaryings. */
    public static final int
        GL_INTERLEAVED_ATTRIBS = 0x8C8C,
        GL_SEPARATE_ATTRIBS    = 0x8C8D;

    /** Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv. */
    public static final int
        GL_PRIMITIVES_GENERATED                  = 0x8C87,
        GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN = 0x8C88;

    /**
     * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
     * GetDoublev.
     */
    public static final int GL_RASTERIZER_DISCARD = 0x8C89;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
    public static final int
        GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS = 0x8C8A,
        GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS       = 0x8C8B,
        GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS    = 0x8C80;

    /** Accepted by the {@code pname} parameter of GetProgramiv. */
    public static final int
        GL_TRANSFORM_FEEDBACK_VARYINGS           = 0x8C83,
        GL_TRANSFORM_FEEDBACK_BUFFER_MODE        = 0x8C7F,
        GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH = 0x8C76;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int GL_VERTEX_ARRAY_BINDING = 0x85B5;

    /**
     * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
     * GetDoublev.
     */
    public static final int GL_FRAMEBUFFER_SRGB = 0x8DB9;

    static { GL.initialize(); }

    protected GL30() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(GLCapabilities caps) {
        return checkFunctions(
            caps.glGetStringi, caps.glClearBufferiv, caps.glClearBufferuiv, caps.glClearBufferfv, caps.glClearBufferfi, caps.glVertexAttribI1i, 
            caps.glVertexAttribI2i, caps.glVertexAttribI3i, caps.glVertexAttribI4i, caps.glVertexAttribI1ui, caps.glVertexAttribI2ui, caps.glVertexAttribI3ui, 
            caps.glVertexAttribI4ui, caps.glVertexAttribI1iv, caps.glVertexAttribI2iv, caps.glVertexAttribI3iv, caps.glVertexAttribI4iv, 
            caps.glVertexAttribI1uiv, caps.glVertexAttribI2uiv, caps.glVertexAttribI3uiv, caps.glVertexAttribI4uiv, caps.glVertexAttribI4bv, 
            caps.glVertexAttribI4sv, caps.glVertexAttribI4ubv, caps.glVertexAttribI4usv, caps.glVertexAttribIPointer, caps.glGetVertexAttribIiv, 
            caps.glGetVertexAttribIuiv, caps.glUniform1ui, caps.glUniform2ui, caps.glUniform3ui, caps.glUniform4ui, caps.glUniform1uiv, caps.glUniform2uiv, 
            caps.glUniform3uiv, caps.glUniform4uiv, caps.glGetUniformuiv, caps.glBindFragDataLocation, caps.glGetFragDataLocation, 
            caps.glBeginConditionalRender, caps.glEndConditionalRender, caps.glMapBufferRange, caps.glFlushMappedBufferRange, caps.glClampColor, 
            caps.glIsRenderbuffer, caps.glBindRenderbuffer, caps.glDeleteRenderbuffers, caps.glGenRenderbuffers, caps.glRenderbufferStorage, 
            caps.glRenderbufferStorageMultisample, caps.glGetRenderbufferParameteriv, caps.glIsFramebuffer, caps.glBindFramebuffer, caps.glDeleteFramebuffers, 
            caps.glGenFramebuffers, caps.glCheckFramebufferStatus, caps.glFramebufferTexture1D, caps.glFramebufferTexture2D, caps.glFramebufferTexture3D, 
            caps.glFramebufferTextureLayer, caps.glFramebufferRenderbuffer, caps.glGetFramebufferAttachmentParameteriv, caps.glBlitFramebuffer, 
            caps.glGenerateMipmap, caps.glTexParameterIiv, caps.glTexParameterIuiv, caps.glGetTexParameterIiv, caps.glGetTexParameterIuiv, caps.glColorMaski, 
            caps.glGetBooleani_v, caps.glGetIntegeri_v, caps.glEnablei, caps.glDisablei, caps.glIsEnabledi, caps.glBindBufferRange, caps.glBindBufferBase, 
            caps.glBeginTransformFeedback, caps.glEndTransformFeedback, caps.glTransformFeedbackVaryings, caps.glGetTransformFeedbackVarying, 
            caps.glBindVertexArray, caps.glDeleteVertexArrays, caps.glGenVertexArrays, caps.glIsVertexArray
        );
    }

    // --- [ glGetStringi ] ---

    /** Unsafe version of: {@link #glGetStringi GetStringi} */
    public static long nglGetStringi(int name, int index) {
        return GL30C.nglGetStringi(name, index);
    }

    /**
     * Queries indexed string state.
     *
     * @param name  the indexed state to query. One of:<br><table><tr><td>{@link GL11#GL_EXTENSIONS EXTENSIONS}</td><td>{@link GL20#GL_SHADING_LANGUAGE_VERSION SHADING_LANGUAGE_VERSION}</td></tr></table>
     * @param index the index of the particular element being queried
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetStringi">Reference Page</a>
     */
    @Nullable
    @NativeType("GLubyte const *")
    public static String glGetStringi(@NativeType("GLenum") int name, @NativeType("GLuint") int index) {
        return GL30C.glGetStringi(name, index);
    }

    // --- [ glClearBufferiv ] ---

    /** Unsafe version of: {@link #glClearBufferiv ClearBufferiv} */
    public static void nglClearBufferiv(int buffer, int drawbuffer, long value) {
        GL30C.nglClearBufferiv(buffer, drawbuffer, value);
    }

    /**
     * Clears an individual buffer of the currently bound framebuffer object to the {@link GL30C#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER} binding.
     *
     * @param buffer     the buffer to clear. One of:<br><table><tr><td>{@link GL11#GL_COLOR COLOR}</td><td>{@link GL11#GL_STENCIL STENCIL}</td></tr></table>
     * @param drawbuffer the draw buffer to clear
     * @param value      for color buffers, a pointer to a four-element vector specifying R, G, B and A values to clear the buffer to. For stencil buffers, a pointer to a
     *                   single stencil value to clear the buffer to.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glClearBuffer">Reference Page</a>
     */
    public static void glClearBufferiv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint *") IntBuffer value) {
        GL30C.glClearBufferiv(buffer, drawbuffer, value);
    }

    // --- [ glClearBufferuiv ] ---

    /** Unsafe version of: {@link #glClearBufferuiv ClearBufferuiv} */
    public static void nglClearBufferuiv(int buffer, int drawbuffer, long value) {
        GL30C.nglClearBufferuiv(buffer, drawbuffer, value);
    }

    /**
     * Clears an individual buffer of the currently bound framebuffer object to the {@link GL30C#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER} binding.
     *
     * @param buffer     the buffer to clear. Must be:<br><table><tr><td>{@link GL11#GL_COLOR COLOR}</td></tr></table>
     * @param drawbuffer the draw buffer to clear
     * @param value      a pointer to a four-element vector specifying R, G, B and A values to clear the buffer to
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glClearBuffer">Reference Page</a>
     */
    public static void glClearBufferuiv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint *") IntBuffer value) {
        GL30C.glClearBufferuiv(buffer, drawbuffer, value);
    }

    // --- [ glClearBufferfv ] ---

    /** Unsafe version of: {@link #glClearBufferfv ClearBufferfv} */
    public static void nglClearBufferfv(int buffer, int drawbuffer, long value) {
        GL30C.nglClearBufferfv(buffer, drawbuffer, value);
    }

    /**
     * Clears an individual buffer of the currently bound framebuffer object to the {@link GL30C#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER} binding.
     *
     * @param buffer     the buffer to clear. One of:<br><table><tr><td>{@link GL11#GL_COLOR COLOR}</td><td>{@link GL11#GL_DEPTH DEPTH}</td></tr></table>
     * @param drawbuffer the draw buffer to clear
     * @param value      for color buffers, a pointer to a four-element vector specifying R, G, B and A values to clear the buffer to. For depth buffers, a pointer to a
     *                   single depth value to clear the buffer to.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glClearBuffer">Reference Page</a>
     */
    public static void glClearBufferfv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLfloat *") FloatBuffer value) {
        GL30C.glClearBufferfv(buffer, drawbuffer, value);
    }

    // --- [ glClearBufferfi ] ---

    /**
     * Clears an individual buffer of the currently bound framebuffer object to the {@link GL30C#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER} binding.
     *
     * @param buffer     the buffer to clear. Must be:<br><table><tr><td>{@link GL30C#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param drawbuffer the draw buffer to clear
     * @param depth      the depth value to clear the buffer to
     * @param stencil    the stencil value to clear the buffer to
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glClearBufferfi">Reference Page</a>
     */
    public static void glClearBufferfi(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLfloat") float depth, @NativeType("GLint") int stencil) {
        GL30C.glClearBufferfi(buffer, drawbuffer, depth, stencil);
    }

    // --- [ glVertexAttribI1i ] ---

    /**
     * Specifies the value of a pure integer generic vertex attribute. The y and z components are implicitly set to 0 and w to 1.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param x     the vertex attribute x component
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI1i(@NativeType("GLuint") int index, @NativeType("GLint") int x) {
        GL30C.glVertexAttribI1i(index, x);
    }

    // --- [ glVertexAttribI2i ] ---

    /**
     * Specifies the value of a pure integer generic vertex attribute. The z component is implicitly set to 0 and w to 1.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param x     the vertex attribute x component
     * @param y     the vertex attribute y component
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI2i(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y) {
        GL30C.glVertexAttribI2i(index, x, y);
    }

    // --- [ glVertexAttribI3i ] ---

    /**
     * Specifies the value of a pure integer generic vertex attribute. The w component is implicitly set to 1.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param x     the vertex attribute x component
     * @param y     the vertex attribute y component
     * @param z     the vertex attribute z component
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI3i(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z) {
        GL30C.glVertexAttribI3i(index, x, y, z);
    }

    // --- [ glVertexAttribI4i ] ---

    /**
     * Specifies the value of a pure integer generic vertex attribute.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param x     the vertex attribute x component
     * @param y     the vertex attribute y component
     * @param z     the vertex attribute z component
     * @param w     the vertex attribute w component
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI4i(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z, @NativeType("GLint") int w) {
        GL30C.glVertexAttribI4i(index, x, y, z, w);
    }

    // --- [ glVertexAttribI1ui ] ---

    /**
     * Specifies the value of an unsigned pure integer generic vertex attribute. The y and z components are implicitly set to 0 and w to 1.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param x     the vertex attribute x component
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI1ui(@NativeType("GLuint") int index, @NativeType("GLuint") int x) {
        GL30C.glVertexAttribI1ui(index, x);
    }

    // --- [ glVertexAttribI2ui ] ---

    /**
     * Specifies the value of an unsigned pure integer generic vertex attribute. The z component is implicitly set to 0 and w to 1.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param x     the vertex attribute x component
     * @param y     the vertex attribute y component
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI2ui(@NativeType("GLuint") int index, @NativeType("GLuint") int x, @NativeType("GLuint") int y) {
        GL30C.glVertexAttribI2ui(index, x, y);
    }

    // --- [ glVertexAttribI3ui ] ---

    /**
     * Specifies the value of an unsigned pure integer generic vertex attribute. The w component is implicitly set to 1.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param x     the vertex attribute x component
     * @param y     the vertex attribute y component
     * @param z     the vertex attribute z component
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI3ui(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z) {
        GL30C.glVertexAttribI3ui(index, x, y, z);
    }

    // --- [ glVertexAttribI4ui ] ---

    /**
     * Specifies the value of an unsigned pure integer generic vertex attribute.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param x     the vertex attribute x component
     * @param y     the vertex attribute y component
     * @param z     the vertex attribute z component
     * @param w     the vertex attribute w component
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI4ui(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z, @NativeType("GLint") int w) {
        GL30C.glVertexAttribI4ui(index, x, y, z, w);
    }

    // --- [ glVertexAttribI1iv ] ---

    /** Unsafe version of: {@link #glVertexAttribI1iv VertexAttribI1iv} */
    public static void nglVertexAttribI1iv(int index, long v) {
        GL30C.nglVertexAttribI1iv(index, v);
    }

    /**
     * Pointer version of {@link #glVertexAttribI1i VertexAttribI1i}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param v     the pure integer vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI1iv(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        GL30C.glVertexAttribI1iv(index, v);
    }

    // --- [ glVertexAttribI2iv ] ---

    /** Unsafe version of: {@link #glVertexAttribI2iv VertexAttribI2iv} */
    public static void nglVertexAttribI2iv(int index, long v) {
        GL30C.nglVertexAttribI2iv(index, v);
    }

    /**
     * Pointer version of {@link #glVertexAttribI2i VertexAttribI2i}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param v     the pure integer vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI2iv(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        GL30C.glVertexAttribI2iv(index, v);
    }

    // --- [ glVertexAttribI3iv ] ---

    /** Unsafe version of: {@link #glVertexAttribI3iv VertexAttribI3iv} */
    public static void nglVertexAttribI3iv(int index, long v) {
        GL30C.nglVertexAttribI3iv(index, v);
    }

    /**
     * Pointer version of {@link #glVertexAttribI3i VertexAttribI3i}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param v     the pure integer vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI3iv(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        GL30C.glVertexAttribI3iv(index, v);
    }

    // --- [ glVertexAttribI4iv ] ---

    /** Unsafe version of: {@link #glVertexAttribI4iv VertexAttribI4iv} */
    public static void nglVertexAttribI4iv(int index, long v) {
        GL30C.nglVertexAttribI4iv(index, v);
    }

    /**
     * Pointer version of {@link #glVertexAttribI4i VertexAttribI4i}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param v     the pure integer vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI4iv(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        GL30C.glVertexAttribI4iv(index, v);
    }

    // --- [ glVertexAttribI1uiv ] ---

    /** Unsafe version of: {@link #glVertexAttribI1uiv VertexAttribI1uiv} */
    public static void nglVertexAttribI1uiv(int index, long v) {
        GL30C.nglVertexAttribI1uiv(index, v);
    }

    /**
     * Pointer version of {@link #glVertexAttribI1ui VertexAttribI1ui}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param v     the pure integer vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI1uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        GL30C.glVertexAttribI1uiv(index, v);
    }

    // --- [ glVertexAttribI2uiv ] ---

    /** Unsafe version of: {@link #glVertexAttribI2uiv VertexAttribI2uiv} */
    public static void nglVertexAttribI2uiv(int index, long v) {
        GL30C.nglVertexAttribI2uiv(index, v);
    }

    /**
     * Pointer version of {@link #glVertexAttribI2ui VertexAttribI2ui}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param v     the pure integer vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI2uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        GL30C.glVertexAttribI2uiv(index, v);
    }

    // --- [ glVertexAttribI3uiv ] ---

    /** Unsafe version of: {@link #glVertexAttribI3uiv VertexAttribI3uiv} */
    public static void nglVertexAttribI3uiv(int index, long v) {
        GL30C.nglVertexAttribI3uiv(index, v);
    }

    /**
     * Pointer version of {@link #glVertexAttribI3ui VertexAttribI3ui}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param v     the pure integer vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI3uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        GL30C.glVertexAttribI3uiv(index, v);
    }

    // --- [ glVertexAttribI4uiv ] ---

    /** Unsafe version of: {@link #glVertexAttribI4uiv VertexAttribI4uiv} */
    public static void nglVertexAttribI4uiv(int index, long v) {
        GL30C.nglVertexAttribI4uiv(index, v);
    }

    /**
     * Pointer version of {@link #glVertexAttribI4ui VertexAttribI4ui}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param v     the pure integer vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI4uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        GL30C.glVertexAttribI4uiv(index, v);
    }

    // --- [ glVertexAttribI4bv ] ---

    /** Unsafe version of: {@link #glVertexAttribI4bv VertexAttribI4bv} */
    public static void nglVertexAttribI4bv(int index, long v) {
        GL30C.nglVertexAttribI4bv(index, v);
    }

    /**
     * Byte version of {@link #glVertexAttribI4iv VertexAttribI4iv}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param v     the pure integer vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI4bv(@NativeType("GLuint") int index, @NativeType("GLbyte const *") ByteBuffer v) {
        GL30C.glVertexAttribI4bv(index, v);
    }

    // --- [ glVertexAttribI4sv ] ---

    /** Unsafe version of: {@link #glVertexAttribI4sv VertexAttribI4sv} */
    public static void nglVertexAttribI4sv(int index, long v) {
        GL30C.nglVertexAttribI4sv(index, v);
    }

    /**
     * Short version of {@link #glVertexAttribI4iv VertexAttribI4iv}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param v     the pure integer vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI4sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        GL30C.glVertexAttribI4sv(index, v);
    }

    // --- [ glVertexAttribI4ubv ] ---

    /** Unsafe version of: {@link #glVertexAttribI4ubv VertexAttribI4ubv} */
    public static void nglVertexAttribI4ubv(int index, long v) {
        GL30C.nglVertexAttribI4ubv(index, v);
    }

    /**
     * Byte version of {@link #glVertexAttribI4uiv VertexAttribI4uiv}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param v     the pure integer vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI4ubv(@NativeType("GLuint") int index, @NativeType("GLbyte const *") ByteBuffer v) {
        GL30C.glVertexAttribI4ubv(index, v);
    }

    // --- [ glVertexAttribI4usv ] ---

    /** Unsafe version of: {@link #glVertexAttribI4usv VertexAttribI4usv} */
    public static void nglVertexAttribI4usv(int index, long v) {
        GL30C.nglVertexAttribI4usv(index, v);
    }

    /**
     * Short version of {@link #glVertexAttribI4uiv VertexAttribI4uiv}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param v     the pure integer vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI4usv(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        GL30C.glVertexAttribI4usv(index, v);
    }

    // --- [ glVertexAttribIPointer ] ---

    /** Unsafe version of: {@link #glVertexAttribIPointer VertexAttribIPointer} */
    public static void nglVertexAttribIPointer(int index, int size, int type, int stride, long pointer) {
        GL30C.nglVertexAttribIPointer(index, size, type, stride, pointer);
    }

    /**
     * Specifies the location and organization of a pure integer vertex attribute array.
     *
     * @param index   the index of the pure integer generic vertex attribute to be modified
     * @param size    the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
     * @param type    the data type of each component in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param stride  the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
     *                the array. The initial value is 0.
     * @param pointer the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
     *                currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttribIPointer">Reference Page</a>
     */
    public static void glVertexAttribIPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        GL30C.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    /**
     * Specifies the location and organization of a pure integer vertex attribute array.
     *
     * @param index   the index of the pure integer generic vertex attribute to be modified
     * @param size    the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
     * @param type    the data type of each component in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param stride  the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
     *                the array. The initial value is 0.
     * @param pointer the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
     *                currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttribIPointer">Reference Page</a>
     */
    public static void glVertexAttribIPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        GL30C.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    /**
     * Specifies the location and organization of a pure integer vertex attribute array.
     *
     * @param index   the index of the pure integer generic vertex attribute to be modified
     * @param size    the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
     * @param type    the data type of each component in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param stride  the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
     *                the array. The initial value is 0.
     * @param pointer the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
     *                currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttribIPointer">Reference Page</a>
     */
    public static void glVertexAttribIPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        GL30C.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    /**
     * Specifies the location and organization of a pure integer vertex attribute array.
     *
     * @param index   the index of the pure integer generic vertex attribute to be modified
     * @param size    the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
     * @param type    the data type of each component in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param stride  the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
     *                the array. The initial value is 0.
     * @param pointer the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
     *                currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttribIPointer">Reference Page</a>
     */
    public static void glVertexAttribIPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        GL30C.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    // --- [ glGetVertexAttribIiv ] ---

    /** Unsafe version of: {@link #glGetVertexAttribIiv GetVertexAttribIiv} */
    public static void nglGetVertexAttribIiv(int index, int pname, long params) {
        GL30C.nglGetVertexAttribIiv(index, pname, params);
    }

    /**
     * Returns the value of a pure integer generic vertex attribute parameter.
     *
     * @param index  the index of the pure integer generic vertex attribute to be modified
     * @param pname  the symbolic name of the vertex attribute parameter to be queried. Must be:<br><table><tr><td>{@link GL20#GL_CURRENT_VERTEX_ATTRIB CURRENT_VERTEX_ATTRIB}</td></tr></table>
     * @param params returns the requested data
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>
     */
    public static void glGetVertexAttribIiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL30C.glGetVertexAttribIiv(index, pname, params);
    }

    /**
     * Returns the value of a pure integer generic vertex attribute parameter.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param pname the symbolic name of the vertex attribute parameter to be queried. Must be:<br><table><tr><td>{@link GL20#GL_CURRENT_VERTEX_ATTRIB CURRENT_VERTEX_ATTRIB}</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetVertexAttribIi(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        return GL30C.glGetVertexAttribIi(index, pname);
    }

    // --- [ glGetVertexAttribIuiv ] ---

    /** Unsafe version of: {@link #glGetVertexAttribIuiv GetVertexAttribIuiv} */
    public static void nglGetVertexAttribIuiv(int index, int pname, long params) {
        GL30C.nglGetVertexAttribIuiv(index, pname, params);
    }

    /**
     * Unsigned version of {@link #glGetVertexAttribIiv GetVertexAttribIiv}.
     *
     * @param index  the index of the pure integer generic vertex attribute to be modified
     * @param pname  the symbolic name of the vertex attribute parameter to be queried. Must be:<br><table><tr><td>{@link GL20#GL_CURRENT_VERTEX_ATTRIB CURRENT_VERTEX_ATTRIB}</td></tr></table>
     * @param params returns the requested data
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>
     */
    public static void glGetVertexAttribIuiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        GL30C.glGetVertexAttribIuiv(index, pname, params);
    }

    /**
     * Unsigned version of {@link #glGetVertexAttribIiv GetVertexAttribIiv}.
     *
     * @param index the index of the pure integer generic vertex attribute to be modified
     * @param pname the symbolic name of the vertex attribute parameter to be queried. Must be:<br><table><tr><td>{@link GL20#GL_CURRENT_VERTEX_ATTRIB CURRENT_VERTEX_ATTRIB}</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetVertexAttribIui(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        return GL30C.glGetVertexAttribIui(index, pname);
    }

    // --- [ glUniform1ui ] ---

    /**
     * Specifies the value of a uint uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param v0       the uniform value
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform1ui(@NativeType("GLint") int location, @NativeType("GLuint") int v0) {
        GL30C.glUniform1ui(location, v0);
    }

    // --- [ glUniform2ui ] ---

    /**
     * Specifies the value of a uvec2 uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param v0       the uniform x value
     * @param v1       the uniform y value
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform2ui(@NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1) {
        GL30C.glUniform2ui(location, v0, v1);
    }

    // --- [ glUniform3ui ] ---

    /**
     * Specifies the value of a uvec3 uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param v0       the uniform x value
     * @param v1       the uniform y value
     * @param v2       the uniform z value
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform3ui(@NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1, @NativeType("GLuint") int v2) {
        GL30C.glUniform3ui(location, v0, v1, v2);
    }

    // --- [ glUniform4ui ] ---

    /**
     * Specifies the value of a uvec4 uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param v0       the uniform x value
     * @param v1       the uniform y value
     * @param v2       the uniform z value
     * @param v3       the uniform w value
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform4ui(@NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1, @NativeType("GLuint") int v2, @NativeType("GLuint") int v3) {
        GL30C.glUniform4ui(location, v0, v1, v2, v3);
    }

    // --- [ glUniform1uiv ] ---

    /**
     * Unsafe version of: {@link #glUniform1uiv Uniform1uiv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static void nglUniform1uiv(int location, int count, long value) {
        GL30C.nglUniform1uiv(location, count, value);
    }

    /**
     * Specifies the value of a single uint uniform variable or a uint uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform1uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        GL30C.glUniform1uiv(location, value);
    }

    // --- [ glUniform2uiv ] ---

    /**
     * Unsafe version of: {@link #glUniform2uiv Uniform2uiv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static void nglUniform2uiv(int location, int count, long value) {
        GL30C.nglUniform2uiv(location, count, value);
    }

    /**
     * Specifies the value of a single uvec2 uniform variable or a uvec2 uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform2uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        GL30C.glUniform2uiv(location, value);
    }

    // --- [ glUniform3uiv ] ---

    /**
     * Unsafe version of: {@link #glUniform3uiv Uniform3uiv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static void nglUniform3uiv(int location, int count, long value) {
        GL30C.nglUniform3uiv(location, count, value);
    }

    /**
     * Specifies the value of a single uvec3 uniform variable or a uvec3 uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform3uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        GL30C.glUniform3uiv(location, value);
    }

    // --- [ glUniform4uiv ] ---

    /**
     * Unsafe version of: {@link #glUniform4uiv Uniform4uiv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static void nglUniform4uiv(int location, int count, long value) {
        GL30C.nglUniform4uiv(location, count, value);
    }

    /**
     * Specifies the value of a single uvec4 uniform variable or a uvec4 uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform4uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        GL30C.glUniform4uiv(location, value);
    }

    // --- [ glGetUniformuiv ] ---

    /** Unsafe version of: {@link #glGetUniformuiv GetUniformuiv} */
    public static void nglGetUniformuiv(int program, int location, long params) {
        GL30C.nglGetUniformuiv(program, location, params);
    }

    /**
     * Returns the uint value(s) of a uniform variable.
     *
     * @param program  the program object to be queried
     * @param location the location of the uniform variable to be queried
     * @param params   the value of the specified uniform variable
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetUniform">Reference Page</a>
     */
    public static void glGetUniformuiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint *") IntBuffer params) {
        GL30C.glGetUniformuiv(program, location, params);
    }

    /**
     * Returns the uint value(s) of a uniform variable.
     *
     * @param program  the program object to be queried
     * @param location the location of the uniform variable to be queried
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetUniform">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetUniformui(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        return GL30C.glGetUniformui(program, location);
    }

    // --- [ glBindFragDataLocation ] ---

    /** Unsafe version of: {@link #glBindFragDataLocation BindFragDataLocation} */
    public static void nglBindFragDataLocation(int program, int colorNumber, long name) {
        GL30C.nglBindFragDataLocation(program, colorNumber, name);
    }

    /**
     * Binds a user-defined varying out variable to a fragment shader color number.
     *
     * @param program     the name of the program containing varying out variable whose binding to modify
     * @param colorNumber the color number to bind the user-defined varying out variable to
     * @param name        the name of the user-defined varying out variable whose binding to modify
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glBindFragDataLocation">Reference Page</a>
     */
    public static void glBindFragDataLocation(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLchar const *") ByteBuffer name) {
        GL30C.glBindFragDataLocation(program, colorNumber, name);
    }

    /**
     * Binds a user-defined varying out variable to a fragment shader color number.
     *
     * @param program     the name of the program containing varying out variable whose binding to modify
     * @param colorNumber the color number to bind the user-defined varying out variable to
     * @param name        the name of the user-defined varying out variable whose binding to modify
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glBindFragDataLocation">Reference Page</a>
     */
    public static void glBindFragDataLocation(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLchar const *") CharSequence name) {
        GL30C.glBindFragDataLocation(program, colorNumber, name);
    }

    // --- [ glGetFragDataLocation ] ---

    /** Unsafe version of: {@link #glGetFragDataLocation GetFragDataLocation} */
    public static int nglGetFragDataLocation(int program, long name) {
        return GL30C.nglGetFragDataLocation(program, name);
    }

    /**
     * Queries the bindings of color numbers to user-defined varying out variables.
     *
     * @param program the name of the program containing varying out variable whose binding to query
     * @param name    the name of the user-defined varying out variable whose binding to query
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetFragDataLocation">Reference Page</a>
     */
    @NativeType("GLint")
    public static int glGetFragDataLocation(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer name) {
        return GL30C.glGetFragDataLocation(program, name);
    }

    /**
     * Queries the bindings of color numbers to user-defined varying out variables.
     *
     * @param program the name of the program containing varying out variable whose binding to query
     * @param name    the name of the user-defined varying out variable whose binding to query
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetFragDataLocation">Reference Page</a>
     */
    @NativeType("GLint")
    public static int glGetFragDataLocation(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence name) {
        return GL30C.glGetFragDataLocation(program, name);
    }

    // --- [ glBeginConditionalRender ] ---

    /**
     * Starts conditional rendering.
     *
     * @param id   the name of an occlusion query object whose results are used to determine if the rendering commands are discarded
     * @param mode how {@code glBeginConditionalRender} interprets the results of the occlusion query. One of:<br><table><tr><td>{@link GL30C#GL_QUERY_WAIT QUERY_WAIT}</td><td>{@link GL30C#GL_QUERY_NO_WAIT QUERY_NO_WAIT}</td><td>{@link GL30C#GL_QUERY_BY_REGION_WAIT QUERY_BY_REGION_WAIT}</td></tr><tr><td>{@link GL30C#GL_QUERY_BY_REGION_NO_WAIT QUERY_BY_REGION_NO_WAIT}</td><td>{@link GL45#GL_QUERY_WAIT_INVERTED QUERY_WAIT_INVERTED}</td><td>{@link GL45#GL_QUERY_NO_WAIT_INVERTED QUERY_NO_WAIT_INVERTED}</td></tr><tr><td>{@link GL45#GL_QUERY_BY_REGION_WAIT_INVERTED QUERY_BY_REGION_WAIT_INVERTED}</td><td>{@link GL45#GL_QUERY_BY_REGION_NO_WAIT_INVERTED QUERY_BY_REGION_NO_WAIT_INVERTED}</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glBeginConditionalRender">Reference Page</a>
     */
    public static void glBeginConditionalRender(@NativeType("GLuint") int id, @NativeType("GLenum") int mode) {
        GL30C.glBeginConditionalRender(id, mode);
    }

    // --- [ glEndConditionalRender ] ---

    /**
     * Ends conditional rendering.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glEndConditionalRender">Reference Page</a>
     */
    public static void glEndConditionalRender() {
        GL30C.glEndConditionalRender();
    }

    // --- [ glMapBufferRange ] ---

    /** Unsafe version of: {@link #glMapBufferRange MapBufferRange} */
    public static long nglMapBufferRange(int target, long offset, long length, int access) {
        return GL30C.nglMapBufferRange(target, offset, length, access);
    }

    /**
     * Maps a section of a buffer object's data store.
     * 
     * <p><b>LWJGL note</b>: This method comes in 2 flavors:</p>
     * 
     * <ol>
     * <li>{@link #glMapBufferRange(int, long, long, int)} - Always returns a new ByteBuffer instance.</li>
     * <li>{@link #glMapBufferRange(int, long, long, int, ByteBuffer)} - The {@code old_buffer} parameter is reused if not null.</li>
     * </ol>
     *
     * @param target a binding to which the target buffer is bound. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30C#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param offset the starting offset within the buffer of the range to be mapped
     * @param length the length of the range to be mapped
     * @param access a combination of access flags indicating the desired access to the range. One or more of:<br><table><tr><td>{@link GL30C#GL_MAP_READ_BIT MAP_READ_BIT}</td><td>{@link GL30C#GL_MAP_WRITE_BIT MAP_WRITE_BIT}</td><td>{@link GL30C#GL_MAP_INVALIDATE_RANGE_BIT MAP_INVALIDATE_RANGE_BIT}</td><td>{@link GL30C#GL_MAP_INVALIDATE_BUFFER_BIT MAP_INVALIDATE_BUFFER_BIT}</td></tr><tr><td>{@link GL30C#GL_MAP_FLUSH_EXPLICIT_BIT MAP_FLUSH_EXPLICIT_BIT}</td><td>{@link GL30C#GL_MAP_UNSYNCHRONIZED_BIT MAP_UNSYNCHRONIZED_BIT}</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glMapBufferRange">Reference Page</a>
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer glMapBufferRange(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length, @NativeType("GLbitfield") int access) {
        return GL30C.glMapBufferRange(target, offset, length, access);
    }

    /**
     * Maps a section of a buffer object's data store.
     * 
     * <p><b>LWJGL note</b>: This method comes in 2 flavors:</p>
     * 
     * <ol>
     * <li>{@link #glMapBufferRange(int, long, long, int)} - Always returns a new ByteBuffer instance.</li>
     * <li>{@link #glMapBufferRange(int, long, long, int, ByteBuffer)} - The {@code old_buffer} parameter is reused if not null.</li>
     * </ol>
     *
     * @param target a binding to which the target buffer is bound. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30C#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param offset the starting offset within the buffer of the range to be mapped
     * @param length the length of the range to be mapped
     * @param access a combination of access flags indicating the desired access to the range. One or more of:<br><table><tr><td>{@link GL30C#GL_MAP_READ_BIT MAP_READ_BIT}</td><td>{@link GL30C#GL_MAP_WRITE_BIT MAP_WRITE_BIT}</td><td>{@link GL30C#GL_MAP_INVALIDATE_RANGE_BIT MAP_INVALIDATE_RANGE_BIT}</td><td>{@link GL30C#GL_MAP_INVALIDATE_BUFFER_BIT MAP_INVALIDATE_BUFFER_BIT}</td></tr><tr><td>{@link GL30C#GL_MAP_FLUSH_EXPLICIT_BIT MAP_FLUSH_EXPLICIT_BIT}</td><td>{@link GL30C#GL_MAP_UNSYNCHRONIZED_BIT MAP_UNSYNCHRONIZED_BIT}</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glMapBufferRange">Reference Page</a>
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer glMapBufferRange(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length, @NativeType("GLbitfield") int access, @Nullable ByteBuffer old_buffer) {
        return GL30C.glMapBufferRange(target, offset, length, access, old_buffer);
    }

    // --- [ glFlushMappedBufferRange ] ---

    /**
     * Indicates modifications to a range of a mapped buffer.
     *
     * @param target the target of the flush operation. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30C#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param offset the start of the buffer subrange, in basic machine units
     * @param length the length of the buffer subrange, in basic machine units
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glFlushMappedBufferRange">Reference Page</a>
     */
    public static void glFlushMappedBufferRange(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length) {
        GL30C.glFlushMappedBufferRange(target, offset, length);
    }

    // --- [ glClampColor ] ---

    /**
     * Controls color clamping.
     *
     * @param target target for color clamping. Must be:<br><table><tr><td>{@link GL30C#GL_CLAMP_READ_COLOR CLAMP_READ_COLOR}</td></tr></table>
     * @param clamp  whether to apply color clamping. One of:<br><table><tr><td>{@link GL11#GL_TRUE TRUE}</td><td>{@link GL11#GL_FALSE FALSE}</td><td>{@link GL30C#GL_FIXED_ONLY FIXED_ONLY}</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glClampColor">Reference Page</a>
     */
    public static void glClampColor(@NativeType("GLenum") int target, @NativeType("GLenum") int clamp) {
        GL30C.glClampColor(target, clamp);
    }

    // --- [ glIsRenderbuffer ] ---

    /**
     * Determines if a name corresponds to a renderbuffer object.
     *
     * @param renderbuffer a value that may be the name of a renderbuffer object
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glIsRenderbuffer">Reference Page</a>
     */
    @NativeType("GLboolean")
    public static boolean glIsRenderbuffer(@NativeType("GLuint") int renderbuffer) {
        return GL30C.glIsRenderbuffer(renderbuffer);
    }

    // --- [ glBindRenderbuffer ] ---

    /**
     * Binds a renderbuffer to a renderbuffer target.
     *
     * @param target       the renderbuffer target of the binding operation. Must be:<br><table><tr><td>{@link GL30C#GL_RENDERBUFFER RENDERBUFFER}</td></tr></table>
     * @param renderbuffer the name of the renderbuffer object to bind
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glBindRenderbuffer">Reference Page</a>
     */
    public static void glBindRenderbuffer(@NativeType("GLenum") int target, @NativeType("GLuint") int renderbuffer) {
        GL30C.glBindRenderbuffer(target, renderbuffer);
    }

    // --- [ glDeleteRenderbuffers ] ---

    /**
     * Unsafe version of: {@link #glDeleteRenderbuffers DeleteRenderbuffers}
     *
     * @param n the number of renderbuffer objects to be deleted
     */
    public static void nglDeleteRenderbuffers(int n, long renderbuffers) {
        GL30C.nglDeleteRenderbuffers(n, renderbuffers);
    }

    /**
     * Deletes renderbuffer objects.
     *
     * @param renderbuffers an array containing {@code n} renderbuffer objects to be deleted
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glDeleteRenderbuffers">Reference Page</a>
     */
    public static void glDeleteRenderbuffers(@NativeType("GLuint const *") IntBuffer renderbuffers) {
        GL30C.glDeleteRenderbuffers(renderbuffers);
    }

    /**
     * Deletes renderbuffer objects.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glDeleteRenderbuffers">Reference Page</a>
     */
    public static void glDeleteRenderbuffers(@NativeType("GLuint const *") int renderbuffer) {
        GL30C.glDeleteRenderbuffers(renderbuffer);
    }

    // --- [ glGenRenderbuffers ] ---

    /**
     * Unsafe version of: {@link #glGenRenderbuffers GenRenderbuffers}
     *
     * @param n the number of renderbuffer object names to generate
     */
    public static void nglGenRenderbuffers(int n, long renderbuffers) {
        GL30C.nglGenRenderbuffers(n, renderbuffers);
    }

    /**
     * Generates renderbuffer object names.
     *
     * @param renderbuffers a buffer in which the generated renderbuffer object names are stored
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGenRenderbuffers">Reference Page</a>
     */
    public static void glGenRenderbuffers(@NativeType("GLuint *") IntBuffer renderbuffers) {
        GL30C.glGenRenderbuffers(renderbuffers);
    }

    /**
     * Generates renderbuffer object names.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGenRenderbuffers">Reference Page</a>
     */
    @NativeType("void")
    public static int glGenRenderbuffers() {
        return GL30C.glGenRenderbuffers();
    }

    // --- [ glRenderbufferStorage ] ---

    /**
     * Establishes data storage, format and dimensions of a renderbuffer object's image.
     *
     * @param target         the target of the allocation. Must be:<br><table><tr><td>{@link GL30C#GL_RENDERBUFFER RENDERBUFFER}</td></tr></table>
     * @param internalformat the internal format to use for the renderbuffer object's image. Must be a color-renderable, depth-renderable, or stencil-renderable format.
     * @param width          the width of the renderbuffer, in pixels
     * @param height         the height of the renderbuffer, in pixels
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glRenderbufferStorage">Reference Page</a>
     */
    public static void glRenderbufferStorage(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        GL30C.glRenderbufferStorage(target, internalformat, width, height);
    }

    // --- [ glRenderbufferStorageMultisample ] ---

    /**
     * Establishes data storage, format, dimensions and sample count of a renderbuffer object's image.
     * 
     * <p>{@link #glRenderbufferStorage RenderbufferStorage} is equivalent to calling this method with the samples set to zero.</p>
     *
     * @param target         the target of the allocation. Must be:<br><table><tr><td>{@link GL30C#GL_RENDERBUFFER RENDERBUFFER}</td></tr></table>
     * @param samples        the number of samples to be used for the renderbuffer object's storage
     * @param internalformat the internal format to use for the renderbuffer object's image. Must be a color-renderable, depth-renderable, or stencil-renderable format.
     * @param width          the width of the renderbuffer, in pixels
     * @param height         the height of the renderbuffer, in pixels
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glRenderbufferStorageMultisample">Reference Page</a>
     */
    public static void glRenderbufferStorageMultisample(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        GL30C.glRenderbufferStorageMultisample(target, samples, internalformat, width, height);
    }

    // --- [ glGetRenderbufferParameteriv ] ---

    /** Unsafe version of: {@link #glGetRenderbufferParameteriv GetRenderbufferParameteriv} */
    public static void nglGetRenderbufferParameteriv(int target, int pname, long params) {
        GL30C.nglGetRenderbufferParameteriv(target, pname, params);
    }

    /**
     * Retrieves information about a bound renderbuffer object.
     *
     * @param target the target of the query operation. Must be:<br><table><tr><td>{@link GL30C#GL_RENDERBUFFER RENDERBUFFER}</td></tr></table>
     * @param pname  the parameter whose value to retrieve from the renderbuffer bound to {@code target}. One of:<br><table><tr><td>{@link GL30C#GL_RENDERBUFFER_WIDTH RENDERBUFFER_WIDTH}</td><td>{@link GL30C#GL_RENDERBUFFER_HEIGHT RENDERBUFFER_HEIGHT}</td><td>{@link GL30C#GL_RENDERBUFFER_INTERNAL_FORMAT RENDERBUFFER_INTERNAL_FORMAT}</td></tr><tr><td>{@link GL30C#GL_RENDERBUFFER_RED_SIZE RENDERBUFFER_RED_SIZE}</td><td>{@link GL30C#GL_RENDERBUFFER_GREEN_SIZE RENDERBUFFER_GREEN_SIZE}</td><td>{@link GL30C#GL_RENDERBUFFER_BLUE_SIZE RENDERBUFFER_BLUE_SIZE}</td></tr><tr><td>{@link GL30C#GL_RENDERBUFFER_ALPHA_SIZE RENDERBUFFER_ALPHA_SIZE}</td><td>{@link GL30C#GL_RENDERBUFFER_DEPTH_SIZE RENDERBUFFER_DEPTH_SIZE}</td><td>{@link GL30C#GL_RENDERBUFFER_STENCIL_SIZE RENDERBUFFER_STENCIL_SIZE}</td></tr><tr><td>{@link GL30C#GL_RENDERBUFFER_SAMPLES RENDERBUFFER_SAMPLES}</td></tr></table>
     * @param params an array to receive the value of the queried parameter
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetRenderbufferParameter">Reference Page</a>
     */
    public static void glGetRenderbufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL30C.glGetRenderbufferParameteriv(target, pname, params);
    }

    /**
     * Retrieves information about a bound renderbuffer object.
     *
     * @param target the target of the query operation. Must be:<br><table><tr><td>{@link GL30C#GL_RENDERBUFFER RENDERBUFFER}</td></tr></table>
     * @param pname  the parameter whose value to retrieve from the renderbuffer bound to {@code target}. One of:<br><table><tr><td>{@link GL30C#GL_RENDERBUFFER_WIDTH RENDERBUFFER_WIDTH}</td><td>{@link GL30C#GL_RENDERBUFFER_HEIGHT RENDERBUFFER_HEIGHT}</td><td>{@link GL30C#GL_RENDERBUFFER_INTERNAL_FORMAT RENDERBUFFER_INTERNAL_FORMAT}</td></tr><tr><td>{@link GL30C#GL_RENDERBUFFER_RED_SIZE RENDERBUFFER_RED_SIZE}</td><td>{@link GL30C#GL_RENDERBUFFER_GREEN_SIZE RENDERBUFFER_GREEN_SIZE}</td><td>{@link GL30C#GL_RENDERBUFFER_BLUE_SIZE RENDERBUFFER_BLUE_SIZE}</td></tr><tr><td>{@link GL30C#GL_RENDERBUFFER_ALPHA_SIZE RENDERBUFFER_ALPHA_SIZE}</td><td>{@link GL30C#GL_RENDERBUFFER_DEPTH_SIZE RENDERBUFFER_DEPTH_SIZE}</td><td>{@link GL30C#GL_RENDERBUFFER_STENCIL_SIZE RENDERBUFFER_STENCIL_SIZE}</td></tr><tr><td>{@link GL30C#GL_RENDERBUFFER_SAMPLES RENDERBUFFER_SAMPLES}</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetRenderbufferParameter">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetRenderbufferParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return GL30C.glGetRenderbufferParameteri(target, pname);
    }

    // --- [ glIsFramebuffer ] ---

    /**
     * Determines if a name corresponds to a framebuffer object.
     *
     * @param framebuffer a value that may be the name of a framebuffer object
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glIsFramebuffer">Reference Page</a>
     */
    @NativeType("GLboolean")
    public static boolean glIsFramebuffer(@NativeType("GLuint") int framebuffer) {
        return GL30C.glIsFramebuffer(framebuffer);
    }

    // --- [ glBindFramebuffer ] ---

    /**
     * Binds a framebuffer to a framebuffer target.
     *
     * @param target      the framebuffer target of the binding operation. One of:<br><table><tr><td>{@link GL30C#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30C#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30C#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>
     * @param framebuffer the name of the framebuffer object to bind
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glBindFramebuffer">Reference Page</a>
     */
    public static void glBindFramebuffer(@NativeType("GLenum") int target, @NativeType("GLuint") int framebuffer) {
        GL30C.glBindFramebuffer(target, framebuffer);
    }

    // --- [ glDeleteFramebuffers ] ---

    /**
     * Unsafe version of: {@link #glDeleteFramebuffers DeleteFramebuffers}
     *
     * @param n the number of framebuffer objects to be deleted
     */
    public static void nglDeleteFramebuffers(int n, long framebuffers) {
        GL30C.nglDeleteFramebuffers(n, framebuffers);
    }

    /**
     * Deletes framebuffer objects.
     *
     * @param framebuffers an array containing {@code n} framebuffer objects to be deleted
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glDeleteFramebuffers">Reference Page</a>
     */
    public static void glDeleteFramebuffers(@NativeType("GLuint const *") IntBuffer framebuffers) {
        GL30C.glDeleteFramebuffers(framebuffers);
    }

    /**
     * Deletes framebuffer objects.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glDeleteFramebuffers">Reference Page</a>
     */
    public static void glDeleteFramebuffers(@NativeType("GLuint const *") int framebuffer) {
        GL30C.glDeleteFramebuffers(framebuffer);
    }

    // --- [ glGenFramebuffers ] ---

    /**
     * Unsafe version of: {@link #glGenFramebuffers GenFramebuffers}
     *
     * @param n the number of framebuffer object names to generate
     */
    public static void nglGenFramebuffers(int n, long framebuffers) {
        GL30C.nglGenFramebuffers(n, framebuffers);
    }

    /**
     * Generates framebuffer object names.
     *
     * @param framebuffers a buffer in which the generated framebuffer object names are stored
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGenFramebuffers">Reference Page</a>
     */
    public static void glGenFramebuffers(@NativeType("GLuint *") IntBuffer framebuffers) {
        GL30C.glGenFramebuffers(framebuffers);
    }

    /**
     * Generates framebuffer object names.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGenFramebuffers">Reference Page</a>
     */
    @NativeType("void")
    public static int glGenFramebuffers() {
        return GL30C.glGenFramebuffers();
    }

    // --- [ glCheckFramebufferStatus ] ---

    /**
     * Checks the completeness status of a framebuffer.
     *
     * @param target the target of the framebuffer completeness check. One of:<br><table><tr><td>{@link GL30C#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30C#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30C#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glCheckFramebufferStatus">Reference Page</a>
     */
    @NativeType("GLenum")
    public static int glCheckFramebufferStatus(@NativeType("GLenum") int target) {
        return GL30C.glCheckFramebufferStatus(target);
    }

    // --- [ glFramebufferTexture1D ] ---

    /**
     * Attaches a level of a 1D texture object as a logical buffer to the currently bound framebuffer object.
     *
     * @param target     the framebuffer target. One of:<br><table><tr><td>{@link GL30C#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30C#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30C#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>
     * @param attachment the attachment point of the framebuffer. One of:<br><table><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link GL30C#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link GL30C#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link GL30C#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>
     * @param textarget  the type of texture
     * @param texture    the texture object to attach to the framebuffer attachment point named by {@code attachment}
     * @param level      the mipmap level of {@code texture} to attach
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glFramebufferTexture1D">Reference Page</a>
     */
    public static void glFramebufferTexture1D(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level) {
        GL30C.glFramebufferTexture1D(target, attachment, textarget, texture, level);
    }

    // --- [ glFramebufferTexture2D ] ---

    /**
     * Attaches a level of a 2D texture object as a logical buffer to the currently bound framebuffer object.
     *
     * @param target     the framebuffer target. One of:<br><table><tr><td>{@link GL30C#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30C#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30C#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>
     * @param attachment the attachment point of the framebuffer. One of:<br><table><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link GL30C#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link GL30C#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link GL30C#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>
     * @param textarget  the type of texture
     * @param texture    the texture object to attach to the framebuffer attachment point named by {@code attachment}
     * @param level      the mipmap level of {@code texture} to attach
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glFramebufferTexture2D">Reference Page</a>
     */
    public static void glFramebufferTexture2D(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level) {
        GL30C.glFramebufferTexture2D(target, attachment, textarget, texture, level);
    }

    // --- [ glFramebufferTexture3D ] ---

    /**
     * Attaches a layer of a 3D texture object as a logical buffer to the currently bound framebuffer object.
     *
     * @param target     the framebuffer target. One of:<br><table><tr><td>{@link GL30C#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30C#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30C#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>
     * @param attachment the attachment point of the framebuffer. One of:<br><table><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link GL30C#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link GL30C#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link GL30C#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>
     * @param textarget  the type of texture
     * @param texture    the texture object to attach to the framebuffer attachment point named by {@code attachment}
     * @param level      the mipmap level of {@code texture} to attach
     * @param layer      the layer of a 2-dimensional image within the 3-dimensional texture.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glFramebufferTexture3D">Reference Page</a>
     */
    public static void glFramebufferTexture3D(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int layer) {
        GL30C.glFramebufferTexture3D(target, attachment, textarget, texture, level, layer);
    }

    // --- [ glFramebufferTextureLayer ] ---

    /**
     * Attaches a single layer of a texture to a framebuffer
     *
     * @param target     the framebuffer target. One of:<br><table><tr><td>{@link GL30C#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30C#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30C#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>
     * @param attachment the attachment point of the framebuffer. One of:<br><table><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link GL30C#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link GL30C#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link GL30C#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>
     * @param texture    the texture object to attach to the framebuffer attachment point named by {@code attachment}
     * @param level      the mipmap level of {@code texture} to attach
     * @param layer      the layer of {@code texture} to attach.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glFramebufferTextureLayer">Reference Page</a>
     */
    public static void glFramebufferTextureLayer(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int layer) {
        GL30C.glFramebufferTextureLayer(target, attachment, texture, level, layer);
    }

    // --- [ glFramebufferRenderbuffer ] ---

    /**
     * Attaches a renderbuffer as a logical buffer to the currently bound framebuffer object.
     *
     * @param target             the framebuffer target. One of:<br><table><tr><td>{@link GL30C#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30C#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30C#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>
     * @param attachment         the attachment point of the framebuffer. One of:<br><table><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link GL30C#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link GL30C#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link GL30C#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>
     * @param renderbuffertarget the renderbuffer target. Must be:<br><table><tr><td>{@link GL30C#GL_RENDERBUFFER RENDERBUFFER}</td></tr></table>
     * @param renderbuffer       the name of an existing renderbuffer object of type {@code renderbuffertarget} to attach
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glFramebufferRenderbuffer">Reference Page</a>
     */
    public static void glFramebufferRenderbuffer(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int renderbuffertarget, @NativeType("GLuint") int renderbuffer) {
        GL30C.glFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer);
    }

    // --- [ glGetFramebufferAttachmentParameteriv ] ---

    /** Unsafe version of: {@link #glGetFramebufferAttachmentParameteriv GetFramebufferAttachmentParameteriv} */
    public static void nglGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, long params) {
        GL30C.nglGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
    }

    /**
     * Retrievees information about attachments of a bound framebuffer object.
     *
     * @param target     the target of the query operation. One of:<br><table><tr><td>{@link GL30C#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30C#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30C#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>
     * @param attachment the attachment within {@code target}. One of:<br><table><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link GL30C#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link GL30C#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link GL30C#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>
     * @param pname      the parameter of {@code attachment} to query. One of:<br><table><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE}</td><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME FRAMEBUFFER_ATTACHMENT_OBJECT_NAME}</td></tr><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL}</td><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE}</td></tr><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER}</td><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING}</td></tr><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE}</td><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE FRAMEBUFFER_ATTACHMENT_RED_SIZE}</td></tr><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE FRAMEBUFFER_ATTACHMENT_GREEN_SIZE}</td><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE FRAMEBUFFER_ATTACHMENT_BLUE_SIZE}</td></tr><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE}</td><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE}</td></tr><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE}</td></tr></table>
     * @param params     an array to receive the value of the queried parameter
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetFramebufferAttachmentParameter">Reference Page</a>
     */
    public static void glGetFramebufferAttachmentParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL30C.glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
    }

    /**
     * Retrievees information about attachments of a bound framebuffer object.
     *
     * @param target     the target of the query operation. One of:<br><table><tr><td>{@link GL30C#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30C#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30C#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>
     * @param attachment the attachment within {@code target}. One of:<br><table><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link GL30C#GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link GL30C#GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link GL30C#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link GL30C#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link GL30C#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>
     * @param pname      the parameter of {@code attachment} to query. One of:<br><table><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE}</td><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME FRAMEBUFFER_ATTACHMENT_OBJECT_NAME}</td></tr><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL}</td><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE}</td></tr><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER}</td><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING}</td></tr><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE}</td><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE FRAMEBUFFER_ATTACHMENT_RED_SIZE}</td></tr><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE FRAMEBUFFER_ATTACHMENT_GREEN_SIZE}</td><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE FRAMEBUFFER_ATTACHMENT_BLUE_SIZE}</td></tr><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE}</td><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE}</td></tr><tr><td>{@link GL30C#GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE}</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetFramebufferAttachmentParameter">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetFramebufferAttachmentParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname) {
        return GL30C.glGetFramebufferAttachmentParameteri(target, attachment, pname);
    }

    // --- [ glBlitFramebuffer ] ---

    /**
     * Copies a block of pixels from the read framebuffer to the draw framebuffer.
     *
     * @param srcX0  the lower-left coordinate of the source rectangle within the read buffer
     * @param srcY0  the upper-left coordinate of the source rectangle within the read buffer
     * @param srcX1  the lower-right coordinate of the source rectangle within the read buffer
     * @param srcY1  the upper-right coordinate of the source rectangle within the read buffer
     * @param dstX0  the lower-left coordinate of the destination rectangle within the write buffer
     * @param dstY0  the upper-left coordinate of the destination rectangle within the write buffer
     * @param dstX1  the lower-right coordinate of the destination rectangle within the write buffer
     * @param dstY1  the upper-right coordinate of the destination rectangle within the write buffer
     * @param mask   the bitwise OR of the flags indicating which buffers are to be copied. One of:<br><table><tr><td>{@link GL11#GL_COLOR_BUFFER_BIT COLOR_BUFFER_BIT}</td><td>{@link GL11#GL_DEPTH_BUFFER_BIT DEPTH_BUFFER_BIT}</td><td>{@link GL11#GL_STENCIL_BUFFER_BIT STENCIL_BUFFER_BIT}</td></tr></table>
     * @param filter the interpolation to be applied if the image is stretched. One of:<br><table><tr><td>{@link GL11#GL_NEAREST NEAREST}</td><td>{@link GL11#GL_LINEAR LINEAR}</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glBlitFramebuffer">Reference Page</a>
     */
    public static void glBlitFramebuffer(@NativeType("GLint") int srcX0, @NativeType("GLint") int srcY0, @NativeType("GLint") int srcX1, @NativeType("GLint") int srcY1, @NativeType("GLint") int dstX0, @NativeType("GLint") int dstY0, @NativeType("GLint") int dstX1, @NativeType("GLint") int dstY1, @NativeType("GLbitfield") int mask, @NativeType("GLenum") int filter) {
        GL30C.glBlitFramebuffer(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
    }

    // --- [ glGenerateMipmap ] ---

    /**
     * Generate mipmaps for a specified texture target.
     *
     * @param target the target to which the texture whose mimaps to generate is bound. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30C#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL30C#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGenerateMipmap">Reference Page</a>
     */
    public static void glGenerateMipmap(@NativeType("GLenum") int target) {
        GL30C.glGenerateMipmap(target);
    }

    // --- [ glTexParameterIiv ] ---

    /** Unsafe version of: {@link #glTexParameterIiv TexParameterIiv} */
    public static void nglTexParameterIiv(int target, int pname, long params) {
        GL30C.nglTexParameterIiv(target, pname, params);
    }

    /**
     * Sets the integer value of a texture parameter.
     *
     * @param target the texture target
     * @param pname  the symbolic name of a single-valued texture parameter
     * @param params the value of {@code pname}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glTexParameter">Reference Page</a>
     */
    public static void glTexParameterIiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        GL30C.glTexParameterIiv(target, pname, params);
    }

    /**
     * Sets the integer value of a texture parameter.
     *
     * @param target the texture target
     * @param pname  the symbolic name of a single-valued texture parameter
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glTexParameter">Reference Page</a>
     */
    public static void glTexParameterIi(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int param) {
        GL30C.glTexParameterIi(target, pname, param);
    }

    // --- [ glTexParameterIuiv ] ---

    /** Unsafe version of: {@link #glTexParameterIuiv TexParameterIuiv} */
    public static void nglTexParameterIuiv(int target, int pname, long params) {
        GL30C.nglTexParameterIuiv(target, pname, params);
    }

    /**
     * Sets the unsigned integer value of a texture parameter.
     *
     * @param target the texture target
     * @param pname  the symbolic name of a single-valued texture parameter
     * @param params the value of {@code pname}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glTexParameter">Reference Page</a>
     */
    public static void glTexParameterIuiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint const *") IntBuffer params) {
        GL30C.glTexParameterIuiv(target, pname, params);
    }

    /**
     * Sets the unsigned integer value of a texture parameter.
     *
     * @param target the texture target
     * @param pname  the symbolic name of a single-valued texture parameter
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glTexParameter">Reference Page</a>
     */
    public static void glTexParameterIui(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int param) {
        GL30C.glTexParameterIui(target, pname, param);
    }

    // --- [ glGetTexParameterIiv ] ---

    /** Unsafe version of: {@link #glGetTexParameterIiv GetTexParameterIiv} */
    public static void nglGetTexParameterIiv(int target, int pname, long params) {
        GL30C.nglGetTexParameterIiv(target, pname, params);
    }

    /**
     * Returns the integer value of a texture parameter.
     *
     * @param target the texture target
     * @param pname  the symbolic name of a texture parameter
     * @param params returns the texture parameter value
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetTexParameter">Reference Page</a>
     */
    public static void glGetTexParameterIiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL30C.glGetTexParameterIiv(target, pname, params);
    }

    /**
     * Returns the integer value of a texture parameter.
     *
     * @param target the texture target
     * @param pname  the symbolic name of a texture parameter
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetTexParameter">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetTexParameterIi(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return GL30C.glGetTexParameterIi(target, pname);
    }

    // --- [ glGetTexParameterIuiv ] ---

    /** Unsafe version of: {@link #glGetTexParameterIuiv GetTexParameterIuiv} */
    public static void nglGetTexParameterIuiv(int target, int pname, long params) {
        GL30C.nglGetTexParameterIuiv(target, pname, params);
    }

    /**
     * Returns the unsigned integer value of a texture parameter.
     *
     * @param target the texture target
     * @param pname  the symbolic name of a texture parameter
     * @param params returns the texture parameter value
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetTexParameter">Reference Page</a>
     */
    public static void glGetTexParameterIuiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        GL30C.glGetTexParameterIuiv(target, pname, params);
    }

    /**
     * Returns the unsigned integer value of a texture parameter.
     *
     * @param target the texture target
     * @param pname  the symbolic name of a texture parameter
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetTexParameter">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetTexParameterIui(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return GL30C.glGetTexParameterIui(target, pname);
    }

    // --- [ glColorMaski ] ---

    /**
     * Enables and disables writing of frame buffer color components.
     *
     * @param buf the index of the draw buffer whose color mask to set
     * @param r   whether R values are written or not
     * @param g   whether G values are written or not
     * @param b   whether B values are written or not
     * @param a   whether A values are written or not
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glColorMaski">Reference Page</a>
     */
    public static void glColorMaski(@NativeType("GLuint") int buf, @NativeType("GLboolean") boolean r, @NativeType("GLboolean") boolean g, @NativeType("GLboolean") boolean b, @NativeType("GLboolean") boolean a) {
        GL30C.glColorMaski(buf, r, g, b, a);
    }

    // --- [ glGetBooleani_v ] ---

    /** Unsafe version of: {@link #glGetBooleani_v GetBooleani_v} */
    public static void nglGetBooleani_v(int target, int index, long data) {
        GL30C.nglGetBooleani_v(target, index, data);
    }

    /**
     * Queries the boolean value of an indexed state variable.
     *
     * @param target the indexed state to query
     * @param index  the index of the element being queried
     * @param data   a scalar or buffer in which to place the returned data
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetBooleani_v">Reference Page</a>
     */
    public static void glGetBooleani_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLboolean *") ByteBuffer data) {
        GL30C.glGetBooleani_v(target, index, data);
    }

    /**
     * Queries the boolean value of an indexed state variable.
     *
     * @param target the indexed state to query
     * @param index  the index of the element being queried
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetBooleani_v">Reference Page</a>
     */
    @NativeType("void")
    public static boolean glGetBooleani(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        return GL30C.glGetBooleani(target, index);
    }

    // --- [ glGetIntegeri_v ] ---

    /** Unsafe version of: {@link #glGetIntegeri_v GetIntegeri_v} */
    public static void nglGetIntegeri_v(int target, int index, long data) {
        GL30C.nglGetIntegeri_v(target, index, data);
    }

    /**
     * Queries the integer value of an indexed state variable.
     *
     * @param target the indexed state to query
     * @param index  the index of the element being queried
     * @param data   a scalar or buffer in which to place the returned data
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetIntegeri_v">Reference Page</a>
     */
    public static void glGetIntegeri_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer data) {
        GL30C.glGetIntegeri_v(target, index, data);
    }

    /**
     * Queries the integer value of an indexed state variable.
     *
     * @param target the indexed state to query
     * @param index  the index of the element being queried
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetIntegeri_v">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetIntegeri(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        return GL30C.glGetIntegeri(target, index);
    }

    // --- [ glEnablei ] ---

    /**
     * Enables an indexed capability.
     *
     * @param cap   the indexed capability to enable
     * @param index the index to enable
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glEnablei">Reference Page</a>
     */
    public static void glEnablei(@NativeType("GLenum") int cap, @NativeType("GLuint") int index) {
        GL30C.glEnablei(cap, index);
    }

    // --- [ glDisablei ] ---

    /**
     * Disables an indexed capability.
     *
     * @param target the indexed capability to disable
     * @param index  the index to disable
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glDisablei">Reference Page</a>
     */
    public static void glDisablei(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        GL30C.glDisablei(target, index);
    }

    // --- [ glIsEnabledi ] ---

    /**
     * Tests whether an indexed capability is enabled.
     *
     * @param target the indexed capability to query
     * @param index  the index to query
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glIsEnabledi">Reference Page</a>
     */
    @NativeType("GLboolean")
    public static boolean glIsEnabledi(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        return GL30C.glIsEnabledi(target, index);
    }

    // --- [ glBindBufferRange ] ---

    /**
     * Binds a range within a buffer object to an indexed buffer target.
     *
     * @param target the target of the bind operation. One of:<br><table><tr><td>{@link GL30C#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td></tr></table>
     * @param index  the index of the binding point within the array specified by {@code target}
     * @param buffer a buffer object to bind to the specified binding point
     * @param offset the starting offset in basic machine units into the buffer object {@code buffer}
     * @param size   the amount of data in machine units that can be read from the buffer object while used as an indexed target
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glBindBufferRange">Reference Page</a>
     */
    public static void glBindBufferRange(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size) {
        GL30C.glBindBufferRange(target, index, buffer, offset, size);
    }

    // --- [ glBindBufferBase ] ---

    /**
     * Binds a buffer object to an indexed buffer target.
     *
     * @param target the target of the bind operation. One of:<br><table><tr><td>{@link GL30C#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td></tr></table>
     * @param index  the index of the binding point within the array specified by {@code target}
     * @param buffer a buffer object to bind to the specified binding point
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glBindBufferBase">Reference Page</a>
     */
    public static void glBindBufferBase(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer) {
        GL30C.glBindBufferBase(target, index, buffer);
    }

    // --- [ glBeginTransformFeedback ] ---

    /**
     * Starts transform feedback operation.
     *
     * @param primitiveMode the output type of the primitives that will be recorded into the buffer objects that are bound for transform feedback. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glBeginTransformFeedback">Reference Page</a>
     */
    public static void glBeginTransformFeedback(@NativeType("GLenum") int primitiveMode) {
        GL30C.glBeginTransformFeedback(primitiveMode);
    }

    // --- [ glEndTransformFeedback ] ---

    /**
     * Ends transform feedback operation.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glEndTransformFeedback">Reference Page</a>
     */
    public static void glEndTransformFeedback() {
        GL30C.glEndTransformFeedback();
    }

    // --- [ glTransformFeedbackVaryings ] ---

    /**
     * Unsafe version of: {@link #glTransformFeedbackVaryings TransformFeedbackVaryings}
     *
     * @param count the number of varying variables used for transform feedback
     */
    public static void nglTransformFeedbackVaryings(int program, int count, long varyings, int bufferMode) {
        GL30C.nglTransformFeedbackVaryings(program, count, varyings, bufferMode);
    }

    /**
     * Specifies values to record in transform feedback buffers.
     *
     * @param program    the target program object
     * @param varyings   an array of {@code count} zero-terminated strings specifying the names of the varying variables to use for transform feedback
     * @param bufferMode the mode used to capture the varying variables when transform feedback is active. One of:<br><table><tr><td>{@link GL30C#GL_INTERLEAVED_ATTRIBS INTERLEAVED_ATTRIBS}</td><td>{@link GL30C#GL_SEPARATE_ATTRIBS SEPARATE_ATTRIBS}</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glTransformFeedbackVaryings">Reference Page</a>
     */
    public static void glTransformFeedbackVaryings(@NativeType("GLuint") int program, @NativeType("GLchar const **") PointerBuffer varyings, @NativeType("GLenum") int bufferMode) {
        GL30C.glTransformFeedbackVaryings(program, varyings, bufferMode);
    }

    /**
     * Specifies values to record in transform feedback buffers.
     *
     * @param program    the target program object
     * @param varyings   an array of {@code count} zero-terminated strings specifying the names of the varying variables to use for transform feedback
     * @param bufferMode the mode used to capture the varying variables when transform feedback is active. One of:<br><table><tr><td>{@link GL30C#GL_INTERLEAVED_ATTRIBS INTERLEAVED_ATTRIBS}</td><td>{@link GL30C#GL_SEPARATE_ATTRIBS SEPARATE_ATTRIBS}</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glTransformFeedbackVaryings">Reference Page</a>
     */
    public static void glTransformFeedbackVaryings(@NativeType("GLuint") int program, @NativeType("GLchar const **") CharSequence[] varyings, @NativeType("GLenum") int bufferMode) {
        GL30C.glTransformFeedbackVaryings(program, varyings, bufferMode);
    }

    /**
     * Specifies values to record in transform feedback buffers.
     *
     * @param program    the target program object
     * @param bufferMode the mode used to capture the varying variables when transform feedback is active. One of:<br><table><tr><td>{@link GL30C#GL_INTERLEAVED_ATTRIBS INTERLEAVED_ATTRIBS}</td><td>{@link GL30C#GL_SEPARATE_ATTRIBS SEPARATE_ATTRIBS}</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glTransformFeedbackVaryings">Reference Page</a>
     */
    public static void glTransformFeedbackVaryings(@NativeType("GLuint") int program, @NativeType("GLchar const **") CharSequence varying, @NativeType("GLenum") int bufferMode) {
        GL30C.glTransformFeedbackVaryings(program, varying, bufferMode);
    }

    // --- [ glGetTransformFeedbackVarying ] ---

    /**
     * Unsafe version of: {@link #glGetTransformFeedbackVarying GetTransformFeedbackVarying}
     *
     * @param bufSize the maximum number of characters, including the null terminator, that may be written into {@code name}
     */
    public static void nglGetTransformFeedbackVarying(int program, int index, int bufSize, long length, long size, long type, long name) {
        GL30C.nglGetTransformFeedbackVarying(program, index, bufSize, length, size, type, name);
    }

    /**
     * Retrieves information about varying variables selected for transform feedback.
     *
     * @param program the target program object
     * @param index   the index of the varying variable whose information to retrieve
     * @param length  a variable which will receive the number of characters written into {@code name}, excluding the null-terminator. If {@code length} is NULL no length is returned.
     * @param size    a variable that will receive the size of the varying
     * @param type    a variable that will receive the type of the varying
     * @param name    a buffer into which will be written the name of the varying
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetTransformFeedbackVarying">Reference Page</a>
     */
    public static void glGetTransformFeedbackVarying(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLsizei *") IntBuffer size, @NativeType("GLenum *") IntBuffer type, @NativeType("GLchar *") ByteBuffer name) {
        GL30C.glGetTransformFeedbackVarying(program, index, length, size, type, name);
    }

    /**
     * Retrieves information about varying variables selected for transform feedback.
     *
     * @param program the target program object
     * @param index   the index of the varying variable whose information to retrieve
     * @param bufSize the maximum number of characters, including the null terminator, that may be written into {@code name}
     * @param size    a variable that will receive the size of the varying
     * @param type    a variable that will receive the type of the varying
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetTransformFeedbackVarying">Reference Page</a>
     */
    @NativeType("void")
    public static String glGetTransformFeedbackVarying(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei") int bufSize, @NativeType("GLsizei *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        return GL30C.glGetTransformFeedbackVarying(program, index, bufSize, size, type);
    }

    /**
     * Retrieves information about varying variables selected for transform feedback.
     *
     * @param program the target program object
     * @param index   the index of the varying variable whose information to retrieve
     * @param size    a variable that will receive the size of the varying
     * @param type    a variable that will receive the type of the varying
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetTransformFeedbackVarying">Reference Page</a>
     */
    @NativeType("void")
    public static String glGetTransformFeedbackVarying(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        return glGetTransformFeedbackVarying(program, index, GL20.glGetProgrami(program, GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH), size, type);
    }

    // --- [ glBindVertexArray ] ---

    /**
     * Binds a vertex array object
     *
     * @param array the name of the vertex array to bind
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glBindVertexArray">Reference Page</a>
     */
    public static void glBindVertexArray(@NativeType("GLuint") int array) {
        GL30C.glBindVertexArray(array);
    }

    // --- [ glDeleteVertexArrays ] ---

    /**
     * Unsafe version of: {@link #glDeleteVertexArrays DeleteVertexArrays}
     *
     * @param n the number of vertex array objects to be deleted
     */
    public static void nglDeleteVertexArrays(int n, long arrays) {
        GL30C.nglDeleteVertexArrays(n, arrays);
    }

    /**
     * Deletes vertex array objects.
     *
     * @param arrays an array containing the n names of the objects to be deleted
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glDeleteVertexArrays">Reference Page</a>
     */
    public static void glDeleteVertexArrays(@NativeType("GLuint const *") IntBuffer arrays) {
        GL30C.glDeleteVertexArrays(arrays);
    }

    /**
     * Deletes vertex array objects.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glDeleteVertexArrays">Reference Page</a>
     */
    public static void glDeleteVertexArrays(@NativeType("GLuint const *") int array) {
        GL30C.glDeleteVertexArrays(array);
    }

    // --- [ glGenVertexArrays ] ---

    /**
     * Unsafe version of: {@link #glGenVertexArrays GenVertexArrays}
     *
     * @param n the number of vertex array object names to generate
     */
    public static void nglGenVertexArrays(int n, long arrays) {
        GL30C.nglGenVertexArrays(n, arrays);
    }

    /**
     * Generates vertex array object names.
     *
     * @param arrays a buffer in which the generated vertex array object names are stored
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGenVertexArrays">Reference Page</a>
     */
    public static void glGenVertexArrays(@NativeType("GLuint *") IntBuffer arrays) {
        GL30C.glGenVertexArrays(arrays);
    }

    /**
     * Generates vertex array object names.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGenVertexArrays">Reference Page</a>
     */
    @NativeType("void")
    public static int glGenVertexArrays() {
        return GL30C.glGenVertexArrays();
    }

    // --- [ glIsVertexArray ] ---

    /**
     * Determines if a name corresponds to a vertex array object.
     *
     * @param array a value that may be the name of a vertex array object
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glIsVertexArray">Reference Page</a>
     */
    @NativeType("GLboolean")
    public static boolean glIsVertexArray(@NativeType("GLuint") int array) {
        return GL30C.glIsVertexArray(array);
    }

    /**
     * Array version of: {@link #glClearBufferiv ClearBufferiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glClearBuffer">Reference Page</a>
     */
    public static void glClearBufferiv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint *") int[] value) {
        GL30C.glClearBufferiv(buffer, drawbuffer, value);
    }

    /**
     * Array version of: {@link #glClearBufferuiv ClearBufferuiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glClearBuffer">Reference Page</a>
     */
    public static void glClearBufferuiv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint *") int[] value) {
        GL30C.glClearBufferuiv(buffer, drawbuffer, value);
    }

    /**
     * Array version of: {@link #glClearBufferfv ClearBufferfv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glClearBuffer">Reference Page</a>
     */
    public static void glClearBufferfv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLfloat *") float[] value) {
        GL30C.glClearBufferfv(buffer, drawbuffer, value);
    }

    /**
     * Array version of: {@link #glVertexAttribI1iv VertexAttribI1iv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI1iv(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        GL30C.glVertexAttribI1iv(index, v);
    }

    /**
     * Array version of: {@link #glVertexAttribI2iv VertexAttribI2iv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI2iv(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        GL30C.glVertexAttribI2iv(index, v);
    }

    /**
     * Array version of: {@link #glVertexAttribI3iv VertexAttribI3iv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI3iv(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        GL30C.glVertexAttribI3iv(index, v);
    }

    /**
     * Array version of: {@link #glVertexAttribI4iv VertexAttribI4iv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI4iv(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        GL30C.glVertexAttribI4iv(index, v);
    }

    /**
     * Array version of: {@link #glVertexAttribI1uiv VertexAttribI1uiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI1uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        GL30C.glVertexAttribI1uiv(index, v);
    }

    /**
     * Array version of: {@link #glVertexAttribI2uiv VertexAttribI2uiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI2uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        GL30C.glVertexAttribI2uiv(index, v);
    }

    /**
     * Array version of: {@link #glVertexAttribI3uiv VertexAttribI3uiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI3uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        GL30C.glVertexAttribI3uiv(index, v);
    }

    /**
     * Array version of: {@link #glVertexAttribI4uiv VertexAttribI4uiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI4uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        GL30C.glVertexAttribI4uiv(index, v);
    }

    /**
     * Array version of: {@link #glVertexAttribI4sv VertexAttribI4sv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI4sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        GL30C.glVertexAttribI4sv(index, v);
    }

    /**
     * Array version of: {@link #glVertexAttribI4usv VertexAttribI4usv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribI4usv(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        GL30C.glVertexAttribI4usv(index, v);
    }

    /**
     * Array version of: {@link #glGetVertexAttribIiv GetVertexAttribIiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>
     */
    public static void glGetVertexAttribIiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL30C.glGetVertexAttribIiv(index, pname, params);
    }

    /**
     * Array version of: {@link #glGetVertexAttribIuiv GetVertexAttribIuiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>
     */
    public static void glGetVertexAttribIuiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        GL30C.glGetVertexAttribIuiv(index, pname, params);
    }

    /**
     * Array version of: {@link #glUniform1uiv Uniform1uiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform1uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        GL30C.glUniform1uiv(location, value);
    }

    /**
     * Array version of: {@link #glUniform2uiv Uniform2uiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform2uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        GL30C.glUniform2uiv(location, value);
    }

    /**
     * Array version of: {@link #glUniform3uiv Uniform3uiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform3uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        GL30C.glUniform3uiv(location, value);
    }

    /**
     * Array version of: {@link #glUniform4uiv Uniform4uiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform4uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        GL30C.glUniform4uiv(location, value);
    }

    /**
     * Array version of: {@link #glGetUniformuiv GetUniformuiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetUniform">Reference Page</a>
     */
    public static void glGetUniformuiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint *") int[] params) {
        GL30C.glGetUniformuiv(program, location, params);
    }

    /**
     * Array version of: {@link #glDeleteRenderbuffers DeleteRenderbuffers}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glDeleteRenderbuffers">Reference Page</a>
     */
    public static void glDeleteRenderbuffers(@NativeType("GLuint const *") int[] renderbuffers) {
        GL30C.glDeleteRenderbuffers(renderbuffers);
    }

    /**
     * Array version of: {@link #glGenRenderbuffers GenRenderbuffers}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGenRenderbuffers">Reference Page</a>
     */
    public static void glGenRenderbuffers(@NativeType("GLuint *") int[] renderbuffers) {
        GL30C.glGenRenderbuffers(renderbuffers);
    }

    /**
     * Array version of: {@link #glGetRenderbufferParameteriv GetRenderbufferParameteriv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetRenderbufferParameter">Reference Page</a>
     */
    public static void glGetRenderbufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL30C.glGetRenderbufferParameteriv(target, pname, params);
    }

    /**
     * Array version of: {@link #glDeleteFramebuffers DeleteFramebuffers}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glDeleteFramebuffers">Reference Page</a>
     */
    public static void glDeleteFramebuffers(@NativeType("GLuint const *") int[] framebuffers) {
        GL30C.glDeleteFramebuffers(framebuffers);
    }

    /**
     * Array version of: {@link #glGenFramebuffers GenFramebuffers}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGenFramebuffers">Reference Page</a>
     */
    public static void glGenFramebuffers(@NativeType("GLuint *") int[] framebuffers) {
        GL30C.glGenFramebuffers(framebuffers);
    }

    /**
     * Array version of: {@link #glGetFramebufferAttachmentParameteriv GetFramebufferAttachmentParameteriv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetFramebufferAttachmentParameter">Reference Page</a>
     */
    public static void glGetFramebufferAttachmentParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL30C.glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
    }

    /**
     * Array version of: {@link #glTexParameterIiv TexParameterIiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glTexParameter">Reference Page</a>
     */
    public static void glTexParameterIiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        GL30C.glTexParameterIiv(target, pname, params);
    }

    /**
     * Array version of: {@link #glTexParameterIuiv TexParameterIuiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glTexParameter">Reference Page</a>
     */
    public static void glTexParameterIuiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int[] params) {
        GL30C.glTexParameterIuiv(target, pname, params);
    }

    /**
     * Array version of: {@link #glGetTexParameterIiv GetTexParameterIiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetTexParameter">Reference Page</a>
     */
    public static void glGetTexParameterIiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL30C.glGetTexParameterIiv(target, pname, params);
    }

    /**
     * Array version of: {@link #glGetTexParameterIuiv GetTexParameterIuiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetTexParameter">Reference Page</a>
     */
    public static void glGetTexParameterIuiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        GL30C.glGetTexParameterIuiv(target, pname, params);
    }

    /**
     * Array version of: {@link #glGetIntegeri_v GetIntegeri_v}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetIntegeri_v">Reference Page</a>
     */
    public static void glGetIntegeri_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint *") int[] data) {
        GL30C.glGetIntegeri_v(target, index, data);
    }

    /**
     * Array version of: {@link #glGetTransformFeedbackVarying GetTransformFeedbackVarying}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetTransformFeedbackVarying">Reference Page</a>
     */
    public static void glGetTransformFeedbackVarying(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLsizei *") int[] size, @NativeType("GLenum *") int[] type, @NativeType("GLchar *") ByteBuffer name) {
        GL30C.glGetTransformFeedbackVarying(program, index, length, size, type, name);
    }

    /**
     * Array version of: {@link #glDeleteVertexArrays DeleteVertexArrays}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glDeleteVertexArrays">Reference Page</a>
     */
    public static void glDeleteVertexArrays(@NativeType("GLuint const *") int[] arrays) {
        GL30C.glDeleteVertexArrays(arrays);
    }

    /**
     * Array version of: {@link #glGenVertexArrays GenVertexArrays}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGenVertexArrays">Reference Page</a>
     */
    public static void glGenVertexArrays(@NativeType("GLuint *") int[] arrays) {
        GL30C.glGenVertexArrays(arrays);
    }

}