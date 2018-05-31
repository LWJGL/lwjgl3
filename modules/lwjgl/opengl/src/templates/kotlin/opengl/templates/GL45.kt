/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL45 = "GL45".nativeClassGL("GL45") {
    extends = GL44
    documentation =
        """
        The OpenGL functionality up to version 4.5. Includes the deprecated symbols of the Compatibility Profile.

        OpenGL 4.5 implementations support revision 4.50 of the OpenGL Shading Language.

        Extensions promoted to core in this release:
        ${ul(
            registryLinkTo("ARB", "clip_control"),
            registryLinkTo("ARB", "cull_distance"),
            registryLinkTo("ARB", "ES3_1_compatibility"),
            registryLinkTo("ARB", "conditional_render_inverted"),
            registryLinkTo("KHR", "context_flush_control"),
            registryLinkTo("ARB", "derivative_control"),
            registryLinkTo("ARB", "direct_state_access"),
            registryLinkTo("ARB", "get_texture_sub_image"),
            registryLinkTo("KHR", "robustness"),
            registryLinkTo("ARB", "shader_texture_image_samples"),
            registryLinkTo("ARB", "texture_barrier")
        )}
        """

    // ARB_clip_control

    IntConstant(
        "Accepted by the {@code depth} parameter of #ClipControl().",

        "NEGATIVE_ONE_TO_ONE"..0x935E,
        "ZERO_TO_ONE"..0x935F
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "CLIP_ORIGIN"..0x935C,
        "CLIP_DEPTH_MODE"..0x935D
    )

    GL45C reuse "ClipControl"

    // ARB_conditional_render_inverted

    IntConstant(
        "Accepted by the {@code mode} parameter of #BeginConditionalRender().",

        "QUERY_WAIT_INVERTED"..0x8E17,
        "QUERY_NO_WAIT_INVERTED"..0x8E18,
        "QUERY_BY_REGION_WAIT_INVERTED"..0x8E19,
        "QUERY_BY_REGION_NO_WAIT_INVERTED"..0x8E1A
    )

    // ARB_cull_distance

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v.",

        "MAX_CULL_DISTANCES"..0x82F9,
        "MAX_COMBINED_CLIP_AND_CULL_DISTANCES"..0x82FA
    )

    // ARB_direct_state_access

    IntConstant(
        "Accepted by the {@code pname} parameter of GetTextureParameter{if}v and GetTextureParameterI{i ui}v.",

        "TEXTURE_TARGET"..0x1006
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetQueryObjectiv.",

        "QUERY_TARGET"..0x82EA
    )

    GL45C reuse "CreateTransformFeedbacks"
    GL45C reuse "TransformFeedbackBufferBase"
    GL45C reuse "TransformFeedbackBufferRange"
    GL45C reuse "GetTransformFeedbackiv"
    GL45C reuse "GetTransformFeedbacki_v"
    GL45C reuse "GetTransformFeedbacki64_v"
    GL45C reuse "CreateBuffers"
    GL45C reuse "NamedBufferStorage"
    GL45C reuse "NamedBufferData"
    GL45C reuse "NamedBufferSubData"
    GL45C reuse "CopyNamedBufferSubData"
    GL45C reuse "ClearNamedBufferData"
    GL45C reuse "ClearNamedBufferSubData"
    GL45C reuse "MapNamedBuffer"
    GL45C reuse "MapNamedBufferRange"
    GL45C reuse "UnmapNamedBuffer"
    GL45C reuse "FlushMappedNamedBufferRange"
    GL45C reuse "GetNamedBufferParameteriv"
    GL45C reuse "GetNamedBufferParameteri64v"
    GL45C reuse "GetNamedBufferPointerv"
    GL45C reuse "GetNamedBufferSubData"
    GL45C reuse "CreateFramebuffers"
    GL45C reuse "NamedFramebufferRenderbuffer"
    GL45C reuse "NamedFramebufferParameteri"
    GL45C reuse "NamedFramebufferTexture"
    GL45C reuse "NamedFramebufferTextureLayer"
    GL45C reuse "NamedFramebufferDrawBuffer"
    GL45C reuse "NamedFramebufferDrawBuffers"
    GL45C reuse "NamedFramebufferReadBuffer"
    GL45C reuse "InvalidateNamedFramebufferData"
    GL45C reuse "InvalidateNamedFramebufferSubData"
    GL45C reuse "ClearNamedFramebufferiv"
    GL45C reuse "ClearNamedFramebufferuiv"
    GL45C reuse "ClearNamedFramebufferfv"
    GL45C reuse "ClearNamedFramebufferfi"
    GL45C reuse "BlitNamedFramebuffer"
    GL45C reuse "CheckNamedFramebufferStatus"
    GL45C reuse "GetNamedFramebufferParameteriv"
    GL45C reuse "GetNamedFramebufferAttachmentParameteriv"
    GL45C reuse "CreateRenderbuffers"
    GL45C reuse "NamedRenderbufferStorage"
    GL45C reuse "NamedRenderbufferStorageMultisample"
    GL45C reuse "GetNamedRenderbufferParameteriv"
    GL45C reuse "CreateTextures"
    GL45C reuse "TextureBuffer"
    GL45C reuse "TextureBufferRange"
    GL45C reuse "TextureStorage1D"
    GL45C reuse "TextureStorage2D"
    GL45C reuse "TextureStorage3D"
    GL45C reuse "TextureStorage2DMultisample"
    GL45C reuse "TextureStorage3DMultisample"
    GL45C reuse "TextureSubImage1D"
    GL45C reuse "TextureSubImage2D"
    GL45C reuse "TextureSubImage3D"
    GL45C reuse "CompressedTextureSubImage1D"
    GL45C reuse "CompressedTextureSubImage2D"
    GL45C reuse "CompressedTextureSubImage3D"
    GL45C reuse "CopyTextureSubImage1D"
    GL45C reuse "CopyTextureSubImage2D"
    GL45C reuse "CopyTextureSubImage3D"
    GL45C reuse "TextureParameterf"
    GL45C reuse "TextureParameterfv"
    GL45C reuse "TextureParameteri"
    GL45C reuse "TextureParameterIiv"
    GL45C reuse "TextureParameterIuiv"
    GL45C reuse "TextureParameteriv"
    GL45C reuse "GenerateTextureMipmap"
    GL45C reuse "BindTextureUnit"
    GL45C reuse "GetTextureImage"
    GL45C reuse "GetCompressedTextureImage"
    GL45C reuse "GetTextureLevelParameterfv"
    GL45C reuse "GetTextureLevelParameteriv"
    GL45C reuse "GetTextureParameterfv"
    GL45C reuse "GetTextureParameterIiv"
    GL45C reuse "GetTextureParameterIuiv"
    GL45C reuse "GetTextureParameteriv"
    GL45C reuse "CreateVertexArrays"
    GL45C reuse "DisableVertexArrayAttrib"
    GL45C reuse "EnableVertexArrayAttrib"
    GL45C reuse "VertexArrayElementBuffer"
    GL45C reuse "VertexArrayVertexBuffer"
    GL45C reuse "VertexArrayVertexBuffers"
    GL45C reuse "VertexArrayAttribFormat"
    GL45C reuse "VertexArrayAttribIFormat"
    GL45C reuse "VertexArrayAttribLFormat"
    GL45C reuse "VertexArrayAttribBinding"
    GL45C reuse "VertexArrayBindingDivisor"
    GL45C reuse "GetVertexArrayiv"
    GL45C reuse "GetVertexArrayIndexediv"
    GL45C reuse "GetVertexArrayIndexed64iv"
    GL45C reuse "CreateSamplers"
    GL45C reuse "CreateProgramPipelines"
    GL45C reuse "CreateQueries"
    GL45C reuse "GetQueryBufferObjectiv"
    GL45C reuse "GetQueryBufferObjectuiv"
    GL45C reuse "GetQueryBufferObjecti64v"
    GL45C reuse "GetQueryBufferObjectui64v"

    // ARB_ES3_1_compatibility

    GL45C reuse "MemoryBarrierByRegion"

    // ARB_get_texture_sub_image

    GL45C reuse "GetTextureSubImage"
    GL45C reuse "GetCompressedTextureSubImage"

    // ARB_texture_barrier

    GL45C reuse "TextureBarrier"

    // KHR_context_flush_control

    IntConstant(
        "Accepted by the {@code pname} parameter of GetIntegerv, GetFloatv, GetBooleanv GetDoublev and GetInteger64v.",

        "CONTEXT_RELEASE_BEHAVIOR"..0x82FB
    )

    IntConstant(
        "Returned in {@code data} by GetIntegerv, GetFloatv, GetBooleanv GetDoublev and GetInteger64v when {@code pname} is #CONTEXT_RELEASE_BEHAVIOR.",

        "CONTEXT_RELEASE_BEHAVIOR_FLUSH"..0x82FC
    )

    // KHR_robustness

    IntConstant(
        "Returned by #GetGraphicsResetStatus().",

        "GUILTY_CONTEXT_RESET"..0x8253,
        "INNOCENT_CONTEXT_RESET"..0x8254,
        "UNKNOWN_CONTEXT_RESET"..0x8255
    )

    IntConstant(
        "Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, and GetFloatv.",

        "RESET_NOTIFICATION_STRATEGY"..0x8256
    )

    IntConstant(
        "Returned by GetIntegerv and related simple queries when {@code value} is #RESET_NOTIFICATION_STRATEGY.",

        "LOSE_CONTEXT_ON_RESET"..0x8252,
        "NO_RESET_NOTIFICATION"..0x8261
    )

    IntConstant(
        "Returned by GetIntegerv when {@code pname} is CONTEXT_FLAGS.",

        "CONTEXT_FLAG_ROBUST_ACCESS_BIT"..0x00000004
    )

    IntConstant(
        "Returned by #GetError().",

        "CONTEXT_LOST"..0x0507
    )

    GL45C reuse "GetGraphicsResetStatus"

    var src = GL11["GetMapdv"]
    DependsOn("caps.glGetMapdv != NULL")..IgnoreMissing..void(
        "GetnMapdv",
        "Robust version of ${src.javaDocLink}",

        src["target"],
        src["query"],
        AutoSize("data")..GLsizei.IN("bufSize", "the maximum number of bytes to write into {@code data}"),
        ReturnParam..GLdouble.p.OUT("data", "a buffer in which to place the returned data")
    )

    src = GL11["GetMapfv"]
    DependsOn("caps.glGetMapfv != NULL")..IgnoreMissing..void(
        "GetnMapfv",
        "Robust version of ${src.javaDocLink}",

        src["target"],
        src["query"],
        AutoSize("data")..GLsizei.IN("bufSize", "the maximum number of bytes to write into {@code data}"),
        ReturnParam..GLfloat.p.OUT("data", "a buffer in which to place the returned data")
    )

    src = GL11["GetMapiv"]
    DependsOn("caps.glGetMapiv != NULL")..IgnoreMissing..void(
        "GetnMapiv",
        "Robust version of ${src.javaDocLink}",

        src["target"],
        src["query"],
        AutoSize("data")..GLsizei.IN("bufSize", "the maximum number of bytes to write into {@code data}"),
        ReturnParam..GLint.p.OUT("data", "a buffer in which to place the returned data")
    )

    src = GL11["GetPixelMapfv"]
    DependsOn("caps.glGetPixelMapfv != NULL")..IgnoreMissing..void(
        "GetnPixelMapfv",
        "Robust version of ${src.javaDocLink}",

        src["map"],
        AutoSize("data")..GLsizei.IN("bufSize", "the maximum number of bytes to write into {@code data}"),
        GLfloat.p.OUT("data", "a buffer in which to place the returned data")
    )

    src = GL11["GetPixelMapuiv"]
    DependsOn("caps.glGetPixelMapuiv != NULL")..IgnoreMissing..void(
        "GetnPixelMapuiv",
        "Robust version of ${src.javaDocLink}",

        src["map"],
        AutoSize("data")..GLsizei.IN("bufSize", "the maximum number of bytes to write into {@code data}"),
        GLuint.p.OUT("data", "a buffer in which to place the returned data")
    )

    src = GL11["GetPixelMapusv"]
    DependsOn("caps.glGetPixelMapusv != NULL")..IgnoreMissing..void(
        "GetnPixelMapusv",
        "Robust version of ${src.javaDocLink}",

        src["map"],
        AutoSize("data")..GLsizei.IN("bufSize", "the maximum number of bytes to write into {@code data}"),
        GLushort.p.OUT("data", "a buffer in which to place the returned data")
    )

    src = GL11["GetPolygonStipple"]
    DependsOn("caps.glGetPolygonStipple != NULL")..IgnoreMissing..void(
        "GetnPolygonStipple",
        "Robust version of ${src.javaDocLink}",

        AutoSize("pattern")..GLsizei.IN("bufSize", "the maximum number of bytes to write into {@code pattern}"),
        PIXEL_PACK_BUFFER..GLubyte.p.OUT("pattern", "a buffer in which to place the returned pattern")
    )

    GL45C reuse "GetnTexImage"
    GL45C reuse "ReadnPixels"

    src = ARB_imaging["GetColorTable"]
    DependsOn("ext.contains(\"GL_ARB_imaging\") && caps.glGetColorTable != NULL")..IgnoreMissing..void(
        "GetnColorTable",
        "Robust version of ${src.javaDocLink}",

        src["target"],
        src["format"],
        src["type"],
        AutoSize("table")..GLsizei.IN("bufSize", "the maximum number of bytes to write into {@code table}"),
        MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT)..PIXEL_PACK_BUFFER..void.p.OUT("table", "a buffer in which to place the returned data")
    )

    src = ARB_imaging["GetConvolutionFilter"]
    DependsOn("ext.contains(\"GL_ARB_imaging\") && caps.glGetConvolutionFilter != NULL")..IgnoreMissing..void(
        "GetnConvolutionFilter",
        "Robust version of ${src.javaDocLink}",

        src["target"],
        src["format"],
        src["type"],
        AutoSize("image")..GLsizei.IN("bufSize", "the maximum number of bytes to write into {@code image}"),
        PIXEL_PACK_BUFFER..void.p.OUT("image", "a buffer in which to place the returned data")
    )

    src = ARB_imaging["GetSeparableFilter"]
    DependsOn("ext.contains(\"GL_ARB_imaging\") && caps.glGetSeparableFilter != NULL")..IgnoreMissing..void(
        "GetnSeparableFilter",
        "Robust version of ${src.javaDocLink}",

        src["target"],
        src["format"],
        src["type"],
        AutoSize("row")..GLsizei.IN("rowBufSize", "the maximum number of bytes to write into {@code row}"),
        PIXEL_PACK_BUFFER..void.p.OUT("row", "a buffer in which to return the filter row"),
        AutoSize("column")..GLsizei.IN("columnBufSize", "the maximum number of bytes to write into {@code column}"),
        PIXEL_PACK_BUFFER..void.p.OUT("column", "a buffer in which to return the filter column"),
        Unsafe..nullable..void.p.IN("span", "")
    )

    src = ARB_imaging["GetHistogram"]
    DependsOn("ext.contains(\"GL_ARB_imaging\") && caps.glGetHistogram != NULL")..IgnoreMissing..void(
        "GetnHistogram",
        "Robust version of ${src.javaDocLink}",

        src["target"],
        src["reset"],
        src["format"],
        src["type"],
        AutoSize("values")..GLsizei.IN("bufSize", "the maximum number of bytes to write into {@code values}"),
        PIXEL_PACK_BUFFER..void.p.OUT("values", "a buffer in which to place the returned data")
    )

    src = ARB_imaging["GetMinmax"]
    DependsOn("ext.contains(\"GL_ARB_imaging\") && caps.glGetMinmax != NULL")..IgnoreMissing..void(
        "GetnMinmax",
        "Robust version of ${src.javaDocLink}",

        src["target"],
        src["reset"],
        src["format"],
        src["type"],
        AutoSize("values")..GLsizei.IN("bufSize", "the maximum number of bytes to write into {@code values}"),
        PIXEL_PACK_BUFFER..void.p.OUT("values", "a buffer in which to place the returned data")
    )

    GL45C reuse "GetnCompressedTexImage"
    GL45C reuse "GetnUniformfv"
    GL45C reuse "GetnUniformdv"
    GL45C reuse "GetnUniformiv"
    GL45C reuse "GetnUniformuiv"
}