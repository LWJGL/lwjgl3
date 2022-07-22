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

    reuse(GL45C, "ClipControl")

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

    reuse(GL45C, "CreateTransformFeedbacks")
    reuse(GL45C, "TransformFeedbackBufferBase")
    reuse(GL45C, "TransformFeedbackBufferRange")
    reuse(GL45C, "GetTransformFeedbackiv")
    reuse(GL45C, "GetTransformFeedbacki_v")
    reuse(GL45C, "GetTransformFeedbacki64_v")
    reuse(GL45C, "CreateBuffers")
    reuse(GL45C, "NamedBufferStorage")
    reuse(GL45C, "NamedBufferData")
    reuse(GL45C, "NamedBufferSubData")
    reuse(GL45C, "CopyNamedBufferSubData")
    reuse(GL45C, "ClearNamedBufferData")
    reuse(GL45C, "ClearNamedBufferSubData")
    reuse(GL45C, "MapNamedBuffer")
    reuse(GL45C, "MapNamedBufferRange")
    reuse(GL45C, "UnmapNamedBuffer")
    reuse(GL45C, "FlushMappedNamedBufferRange")
    reuse(GL45C, "GetNamedBufferParameteriv")
    reuse(GL45C, "GetNamedBufferParameteri64v")
    reuse(GL45C, "GetNamedBufferPointerv")
    reuse(GL45C, "GetNamedBufferSubData")
    reuse(GL45C, "CreateFramebuffers")
    reuse(GL45C, "NamedFramebufferRenderbuffer")
    reuse(GL45C, "NamedFramebufferParameteri")
    reuse(GL45C, "NamedFramebufferTexture")
    reuse(GL45C, "NamedFramebufferTextureLayer")
    reuse(GL45C, "NamedFramebufferDrawBuffer")
    reuse(GL45C, "NamedFramebufferDrawBuffers")
    reuse(GL45C, "NamedFramebufferReadBuffer")
    reuse(GL45C, "InvalidateNamedFramebufferData")
    reuse(GL45C, "InvalidateNamedFramebufferSubData")
    reuse(GL45C, "ClearNamedFramebufferiv")
    reuse(GL45C, "ClearNamedFramebufferuiv")
    reuse(GL45C, "ClearNamedFramebufferfv")
    reuse(GL45C, "ClearNamedFramebufferfi")
    reuse(GL45C, "BlitNamedFramebuffer")
    reuse(GL45C, "CheckNamedFramebufferStatus")
    reuse(GL45C, "GetNamedFramebufferParameteriv")
    reuse(GL45C, "GetNamedFramebufferAttachmentParameteriv")
    reuse(GL45C, "CreateRenderbuffers")
    reuse(GL45C, "NamedRenderbufferStorage")
    reuse(GL45C, "NamedRenderbufferStorageMultisample")
    reuse(GL45C, "GetNamedRenderbufferParameteriv")
    reuse(GL45C, "CreateTextures")
    reuse(GL45C, "TextureBuffer")
    reuse(GL45C, "TextureBufferRange")
    reuse(GL45C, "TextureStorage1D")
    reuse(GL45C, "TextureStorage2D")
    reuse(GL45C, "TextureStorage3D")
    reuse(GL45C, "TextureStorage2DMultisample")
    reuse(GL45C, "TextureStorage3DMultisample")
    reuse(GL45C, "TextureSubImage1D")
    reuse(GL45C, "TextureSubImage2D")
    reuse(GL45C, "TextureSubImage3D")
    reuse(GL45C, "CompressedTextureSubImage1D")
    reuse(GL45C, "CompressedTextureSubImage2D")
    reuse(GL45C, "CompressedTextureSubImage3D")
    reuse(GL45C, "CopyTextureSubImage1D")
    reuse(GL45C, "CopyTextureSubImage2D")
    reuse(GL45C, "CopyTextureSubImage3D")
    reuse(GL45C, "TextureParameterf")
    reuse(GL45C, "TextureParameterfv")
    reuse(GL45C, "TextureParameteri")
    reuse(GL45C, "TextureParameterIiv")
    reuse(GL45C, "TextureParameterIuiv")
    reuse(GL45C, "TextureParameteriv")
    reuse(GL45C, "GenerateTextureMipmap")
    reuse(GL45C, "BindTextureUnit")
    reuse(GL45C, "GetTextureImage")
    reuse(GL45C, "GetCompressedTextureImage")
    reuse(GL45C, "GetTextureLevelParameterfv")
    reuse(GL45C, "GetTextureLevelParameteriv")
    reuse(GL45C, "GetTextureParameterfv")
    reuse(GL45C, "GetTextureParameterIiv")
    reuse(GL45C, "GetTextureParameterIuiv")
    reuse(GL45C, "GetTextureParameteriv")
    reuse(GL45C, "CreateVertexArrays")
    reuse(GL45C, "DisableVertexArrayAttrib")
    reuse(GL45C, "EnableVertexArrayAttrib")
    reuse(GL45C, "VertexArrayElementBuffer")
    reuse(GL45C, "VertexArrayVertexBuffer")
    reuse(GL45C, "VertexArrayVertexBuffers")
    reuse(GL45C, "VertexArrayAttribFormat")
    reuse(GL45C, "VertexArrayAttribIFormat")
    reuse(GL45C, "VertexArrayAttribLFormat")
    reuse(GL45C, "VertexArrayAttribBinding")
    reuse(GL45C, "VertexArrayBindingDivisor")
    reuse(GL45C, "GetVertexArrayiv")
    reuse(GL45C, "GetVertexArrayIndexediv")
    reuse(GL45C, "GetVertexArrayIndexed64iv")
    reuse(GL45C, "CreateSamplers")
    reuse(GL45C, "CreateProgramPipelines")
    reuse(GL45C, "CreateQueries")
    reuse(GL45C, "GetQueryBufferObjectiv")
    reuse(GL45C, "GetQueryBufferObjectuiv")
    reuse(GL45C, "GetQueryBufferObjecti64v")
    reuse(GL45C, "GetQueryBufferObjectui64v")

    // ARB_ES3_1_compatibility

    reuse(GL45C, "MemoryBarrierByRegion")

    // ARB_get_texture_sub_image

    reuse(GL45C, "GetTextureSubImage")
    reuse(GL45C, "GetCompressedTextureSubImage")

    // ARB_texture_barrier

    reuse(GL45C, "TextureBarrier")

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

    reuse(GL45C, "GetGraphicsResetStatus")

    var src = GL11["GetMapdv"]
    DependsOn("provider.getFunctionAddress(\"glGetMapdv\") != NULL")..IgnoreMissing..void(
        "GetnMapdv",
        "Robust version of ${src.javaDocLink}",

        src["target"],
        src["query"],
        AutoSize("data")..GLsizei("bufSize", "the maximum number of bytes to write into {@code data}"),
        ReturnParam..GLdouble.p("data", "a buffer in which to place the returned data")
    )

    src = GL11["GetMapfv"]
    DependsOn("provider.getFunctionAddress(\"glGetMapfv\") != NULL")..IgnoreMissing..void(
        "GetnMapfv",
        "Robust version of ${src.javaDocLink}",

        src["target"],
        src["query"],
        AutoSize("data")..GLsizei("bufSize", "the maximum number of bytes to write into {@code data}"),
        ReturnParam..GLfloat.p("data", "a buffer in which to place the returned data")
    )

    src = GL11["GetMapiv"]
    DependsOn("provider.getFunctionAddress(\"glGetMapiv\") != NULL")..IgnoreMissing..void(
        "GetnMapiv",
        "Robust version of ${src.javaDocLink}",

        src["target"],
        src["query"],
        AutoSize("data")..GLsizei("bufSize", "the maximum number of bytes to write into {@code data}"),
        ReturnParam..GLint.p("data", "a buffer in which to place the returned data")
    )

    src = GL11["GetPixelMapfv"]
    DependsOn("provider.getFunctionAddress(\"glGetPixelMapfv\") != NULL")..IgnoreMissing..void(
        "GetnPixelMapfv",
        "Robust version of ${src.javaDocLink}",

        src["map"],
        AutoSize("data")..GLsizei("bufSize", "the maximum number of bytes to write into {@code data}"),
        GLfloat.p("data", "a buffer in which to place the returned data")
    )

    src = GL11["GetPixelMapuiv"]
    DependsOn("provider.getFunctionAddress(\"glGetPixelMapuiv\") != NULL")..IgnoreMissing..void(
        "GetnPixelMapuiv",
        "Robust version of ${src.javaDocLink}",

        src["map"],
        AutoSize("data")..GLsizei("bufSize", "the maximum number of bytes to write into {@code data}"),
        GLuint.p("data", "a buffer in which to place the returned data")
    )

    src = GL11["GetPixelMapusv"]
    DependsOn("provider.getFunctionAddress(\"glGetPixelMapusv\") != NULL")..IgnoreMissing..void(
        "GetnPixelMapusv",
        "Robust version of ${src.javaDocLink}",

        src["map"],
        AutoSize("data")..GLsizei("bufSize", "the maximum number of bytes to write into {@code data}"),
        GLushort.p("data", "a buffer in which to place the returned data")
    )

    src = GL11["GetPolygonStipple"]
    DependsOn("provider.getFunctionAddress(\"glGetPolygonStipple\") != NULL")..IgnoreMissing..void(
        "GetnPolygonStipple",
        "Robust version of ${src.javaDocLink}",

        AutoSize("pattern")..GLsizei("bufSize", "the maximum number of bytes to write into {@code pattern}"),
        RawPointer..GLubyte.p("pattern", "a buffer in which to place the returned pattern")
    )

    reuse(GL45C, "GetnTexImage")
    reuse(GL45C, "ReadnPixels")

    src = ARB_imaging["GetColorTable"]
    DependsOn("ext.contains(\"GL_ARB_imaging\") && provider.getFunctionAddress(\"glGetColorTable\") != NULL")..IgnoreMissing..void(
        "GetnColorTable",
        "Robust version of ${src.javaDocLink}",

        src["target"],
        src["format"],
        src["type"],
        AutoSize("table")..GLsizei("bufSize", "the maximum number of bytes to write into {@code table}"),
        MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT)..RawPointer..void.p("table", "a buffer in which to place the returned data")
    )

    src = ARB_imaging["GetConvolutionFilter"]
    DependsOn("ext.contains(\"GL_ARB_imaging\") && provider.getFunctionAddress(\"glGetConvolutionFilter\") != NULL")..IgnoreMissing..void(
        "GetnConvolutionFilter",
        "Robust version of ${src.javaDocLink}",

        src["target"],
        src["format"],
        src["type"],
        AutoSize("image")..GLsizei("bufSize", "the maximum number of bytes to write into {@code image}"),
        RawPointer..void.p("image", "a buffer in which to place the returned data")
    )

    src = ARB_imaging["GetSeparableFilter"]
    DependsOn("ext.contains(\"GL_ARB_imaging\") && provider.getFunctionAddress(\"glGetSeparableFilter\") != NULL")..IgnoreMissing..void(
        "GetnSeparableFilter",
        "Robust version of ${src.javaDocLink}",

        src["target"],
        src["format"],
        src["type"],
        AutoSize("row")..GLsizei("rowBufSize", "the maximum number of bytes to write into {@code row}"),
        RawPointer..void.p("row", "a buffer in which to return the filter row"),
        AutoSize("column")..GLsizei("columnBufSize", "the maximum number of bytes to write into {@code column}"),
        RawPointer..void.p("column", "a buffer in which to return the filter column"),
        Unsafe..nullable..void.p("span", "")
    )

    src = ARB_imaging["GetHistogram"]
    DependsOn("ext.contains(\"GL_ARB_imaging\") && provider.getFunctionAddress(\"glGetHistogram\") != NULL")..IgnoreMissing..void(
        "GetnHistogram",
        "Robust version of ${src.javaDocLink}",

        src["target"],
        src["reset"],
        src["format"],
        src["type"],
        AutoSize("values")..GLsizei("bufSize", "the maximum number of bytes to write into {@code values}"),
        RawPointer..void.p("values", "a buffer in which to place the returned data")
    )

    src = ARB_imaging["GetMinmax"]
    DependsOn("ext.contains(\"GL_ARB_imaging\") && provider.getFunctionAddress(\"glGetMinmax\") != NULL")..IgnoreMissing..void(
        "GetnMinmax",
        "Robust version of ${src.javaDocLink}",

        src["target"],
        src["reset"],
        src["format"],
        src["type"],
        AutoSize("values")..GLsizei("bufSize", "the maximum number of bytes to write into {@code values}"),
        RawPointer..void.p("values", "a buffer in which to place the returned data")
    )

    reuse(GL45C, "GetnCompressedTexImage")
    reuse(GL45C, "GetnUniformfv")
    reuse(GL45C, "GetnUniformdv")
    reuse(GL45C, "GetnUniformiv")
    reuse(GL45C, "GetnUniformuiv")
}