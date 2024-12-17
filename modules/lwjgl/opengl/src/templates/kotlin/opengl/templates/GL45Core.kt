/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL45C = "GL45C".nativeClassGL("GL45C") {
    extends = GL44C

    // ARB_clip_control

    IntConstant(
        "NEGATIVE_ONE_TO_ONE"..0x935E,
        "ZERO_TO_ONE"..0x935F
    )

    IntConstant(
        "CLIP_ORIGIN"..0x935C,
        "CLIP_DEPTH_MODE"..0x935D
    )

    void(
        "ClipControl",

        GLenum("origin"),
        GLenum("depth")
    )

    // ARB_conditional_render_inverted

    IntConstant(
        "QUERY_WAIT_INVERTED"..0x8E17,
        "QUERY_NO_WAIT_INVERTED"..0x8E18,
        "QUERY_BY_REGION_WAIT_INVERTED"..0x8E19,
        "QUERY_BY_REGION_NO_WAIT_INVERTED"..0x8E1A
    )

    // ARB_cull_distance

    IntConstant(
        "MAX_CULL_DISTANCES"..0x82F9,
        "MAX_COMBINED_CLIP_AND_CULL_DISTANCES"..0x82FA
    )

    // ARB_direct_state_access

    IntConstant(
        "TEXTURE_TARGET"..0x1006
    )

    IntConstant(
        "QUERY_TARGET"..0x82EA
    )

    void(
        "CreateTransformFeedbacks",

        AutoSize("ids")..GLsizei("n"),
        ReturnParam..GLuint.p("ids")
    )

    void(
        "TransformFeedbackBufferBase",

        GLuint("xfb"),
        GLuint("index"),
        GLuint("buffer")
    )

    void(
        "TransformFeedbackBufferRange",

        GLuint("xfb"),
        GLuint("index"),
        GLuint("buffer"),
        GLintptr("offset"),
        GLsizeiptr("size")
    )

    void(
        "GetTransformFeedbackiv",

        GLuint("xfb"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLint.p("param")
    )

    void(
        "GetTransformFeedbacki_v",

        GLuint("xfb"),
        GLenum("pname"),
        GLuint("index"),
        Check(1)..ReturnParam..GLint.p("param")
    )

    void(
        "GetTransformFeedbacki64_v",

        GLuint("xfb"),
        GLenum("pname"),
        GLuint("index"),
        Check(1)..ReturnParam..GLint64.p("param")
    )

    void(
        "CreateBuffers",

        AutoSize("buffers")..GLsizei("n"),
        ReturnParam..GLuint.p("buffers")
    )

    var src = GL44["BufferStorage"]
    void(
        "NamedBufferStorage",

        GLuint("buffer"),
        src["size"],
        src["data"],
        src["flags"]
    )

    src = GL15["BufferData"]
    void(
        "NamedBufferData",

        GLuint("buffer"),
        src["size"],
        src["data"],
        src["usage"]
    )

    src = GL15["BufferSubData"]
    void(
        "NamedBufferSubData",

        GLuint("buffer"),
        src["offset"],
        src["size"],
        src["data"]
    )

    src = GL31["CopyBufferSubData"]
    void(
        "CopyNamedBufferSubData",

        GLuint("readBuffer"),
        GLuint("writeBuffer"),
        src["readOffset"],
        src["writeOffset"],
        src["size"]
    )

    src = GL43["ClearBufferData"]
    void(
        "ClearNamedBufferData",

        GLuint("buffer"),
        src["internalformat"],
        src["format"],
        src["type"],
        src["data"]
    )

    src = GL43["ClearBufferSubData"]
    void(
        "ClearNamedBufferSubData",

        GLuint("buffer"),
        src["internalformat"],
        src["offset"],
        src["size"],
        src["format"],
        src["type"],
        src["data"]
    )

    src = GL15["MapBuffer"]
    MapPointer("glGetNamedBufferParameteri(buffer, GL15.GL_BUFFER_SIZE)", oldBufferOverloads = true)..void.p(
        "MapNamedBuffer",

        GLuint("buffer"),
        src["access"]
    )

    src = GL30["MapBufferRange"]
    MapPointer("length", oldBufferOverloads = true)..void.p(
        "MapNamedBufferRange",

        GLuint("buffer"),
        src["offset"],
        src["length"],
        src["access"]
    )

    src = GL15["UnmapBuffer"]
    GLboolean(
        "UnmapNamedBuffer",

        GLuint("buffer")
    )

    src = GL30["FlushMappedBufferRange"]
    void(
        "FlushMappedNamedBufferRange",

        GLuint("buffer"),
        src["offset"],
        src["length"]
    )

    src = GL15["GetBufferParameteriv"]
    void(
        "GetNamedBufferParameteriv",

        GLuint("buffer"),
        src["pname"],
        src["params"]
    )

    src = GL32["GetBufferParameteri64v"]
    void(
        "GetNamedBufferParameteri64v",

        GLuint("buffer"),
        src["pname"],
        src["params"]
    )

    src = GL15["GetBufferPointerv"]
    void(
        "GetNamedBufferPointerv",

        GLuint("buffer"),
        src["pname"],
        src["params"]

    )

    src = GL15["GetBufferSubData"]
    void(
        "GetNamedBufferSubData",

        GLuint("buffer"),
        src["offset"],
        src["size"],
        src["data"]
    )

    void(
        "CreateFramebuffers",

        AutoSize("framebuffers")..GLsizei("n"),
        ReturnParam..GLuint.p("framebuffers")
    )

    val FRAMEBUFFER = GLuint("framebuffer")

    src = GL30["FramebufferRenderbuffer"]
    void(
        "NamedFramebufferRenderbuffer",

        FRAMEBUFFER,
        src["attachment"],
        src["renderbuffertarget"],
        src["renderbuffer"]
    )

    src = GL43["FramebufferParameteri"]
    void(
        "NamedFramebufferParameteri",

        FRAMEBUFFER,
        src["pname"],
        src["param"]
    )

    src = GL32["FramebufferTexture"]
    void(
        "NamedFramebufferTexture",

        FRAMEBUFFER,
        src["attachment"],
        src["texture"],
        src["level"]
    )

    src = GL30["FramebufferTextureLayer"]
    void(
        "NamedFramebufferTextureLayer",

        FRAMEBUFFER,
        src["attachment"],
        src["texture"],
        src["level"],
        src["layer"]
    )

    src = GL11C["DrawBuffer"]
    void(
        "NamedFramebufferDrawBuffer",

        FRAMEBUFFER,
        src["buf"]
    )

    src = GL20["DrawBuffers"]
    void(
        "NamedFramebufferDrawBuffers",

        FRAMEBUFFER,
        src["n"],
        src["bufs"]
    )

    src = GL11C["ReadBuffer"]
    void(
        "NamedFramebufferReadBuffer",

        FRAMEBUFFER,
        src["src"]
    )

    src = GL43["InvalidateFramebuffer"]
    void(
        "InvalidateNamedFramebufferData",

        FRAMEBUFFER,
        src["numAttachments"],
        src["attachments"]
    )

    src = GL43["InvalidateSubFramebuffer"]
    void(
        "InvalidateNamedFramebufferSubData",

        FRAMEBUFFER,
        src["numAttachments"],
        src["attachments"],
        src["x"],
        src["y"],
        src["width"],
        src["height"]
    )

    src = GL30["ClearBufferiv"]
    void(
        "ClearNamedFramebufferiv",

        FRAMEBUFFER,
        src["buffer"],
        src["drawbuffer"],
        src["value"]
    )

    src = GL30["ClearBufferuiv"]
    void(
        "ClearNamedFramebufferuiv",

        FRAMEBUFFER,
        src["buffer"],
        src["drawbuffer"],
        src["value"]
    )

    src = GL30["ClearBufferfv"]
    void(
        "ClearNamedFramebufferfv",

        FRAMEBUFFER,
        src["buffer"],
        src["drawbuffer"],
        src["value"]
    )

    src = GL30["ClearBufferfi"]
    void(
        "ClearNamedFramebufferfi",

        FRAMEBUFFER,
        src["buffer"],
        src["drawbuffer"],
        src["depth"],
        src["stencil"]
    )

    src = GL30["BlitFramebuffer"]
    void(
        "BlitNamedFramebuffer",

        GLuint("readFramebuffer"),
        GLuint("drawFramebuffer"),
        src["srcX0"],
        src["srcY0"],
        src["srcX1"],
        src["srcY1"],
        src["dstX0"],
        src["dstY0"],
        src["dstX1"],
        src["dstY1"],
        src["mask"],
        src["filter"]
    )

    src = GL30["CheckFramebufferStatus"]
    GLenum(
        "CheckNamedFramebufferStatus",

        FRAMEBUFFER,
        src["target"]
    )

    src = GL43["GetFramebufferParameteriv"]
    void(
        "GetNamedFramebufferParameteriv",

        FRAMEBUFFER,
        src["pname"],
        src["params"]
    )

    src = GL30["GetFramebufferAttachmentParameteriv"]
    void(
        "GetNamedFramebufferAttachmentParameteriv",

        FRAMEBUFFER,
        src["attachment"],
        src["pname"],
        src["params"]
    )

    void(
        "CreateRenderbuffers",

        AutoSize("renderbuffers")..GLsizei("n"),
        ReturnParam..GLuint.p("renderbuffers")
    )

    src = GL30["RenderbufferStorage"]
    void(
        "NamedRenderbufferStorage",

        GLuint("renderbuffer"),
        src["internalformat"],
        src["width"],
        src["height"]
    )

    src = GL30["RenderbufferStorageMultisample"]
    void(
        "NamedRenderbufferStorageMultisample",

        GLuint("renderbuffer"),
        src["samples"],
        src["internalformat"],
        src["width"],
        src["height"]
    )

    src = GL30["GetRenderbufferParameteriv"]
    void(
        "GetNamedRenderbufferParameteriv",

        GLuint("renderbuffer"),
        src["pname"],
        src["params"]
    )

    void(
        "CreateTextures",

        GLenum("target"),
        AutoSize("textures")..GLsizei("n"),
        ReturnParam..GLuint.p("textures")
    )

    val TEXTURE = GLuint("texture")

    src = GL31["TexBuffer"]
    void(
        "TextureBuffer",

        TEXTURE,
        src["internalformat"],
        src["buffer"]
    )

    src = GL43["TexBufferRange"]
    void(
        "TextureBufferRange",

        TEXTURE,
        src["internalformat"],
        src["buffer"],
        src["offset"],
        src["size"]
    )

    src = GL42["TexStorage1D"]
    void(
        "TextureStorage1D",

        TEXTURE,
        src["levels"],
        src["internalformat"],
        src["width"]
    )

    src = GL42["TexStorage2D"]
    void(
        "TextureStorage2D",

        TEXTURE,
        src["levels"],
        src["internalformat"],
        src["width"],
        src["height"]
    )

    src = GL42["TexStorage3D"]
    void(
        "TextureStorage3D",

        TEXTURE,
        src["levels"],
        src["internalformat"],
        src["width"],
        src["height"],
        src["depth"]
    )

    src = GL43["TexStorage2DMultisample"]
    void(
        "TextureStorage2DMultisample",

        TEXTURE,
        src["samples"],
        src["internalformat"],
        src["width"],
        src["height"],
        src["fixedsamplelocations"]
    )

    src = GL43["TexStorage3DMultisample"]
    void(
        "TextureStorage3DMultisample",

        TEXTURE,
        src["samples"],
        src["internalformat"],
        src["width"],
        src["height"],
        src["depth"],
        src["fixedsamplelocations"]
    )

    src = GL11C["TexSubImage1D"]
    void(
        "TextureSubImage1D",

        TEXTURE,
        src["level"],
        src["xoffset"],
        src["width"],
        src["format"],
        src["type"],
        src["pixels"]
    )

    src = GL11C["TexSubImage2D"]
    void(
        "TextureSubImage2D",

        TEXTURE,
        src["level"],
        src["xoffset"],
        src["yoffset"],
        src["width"],
        src["height"],
        src["format"],
        src["type"],
        src["pixels"]
    )

    src = GL12C["TexSubImage3D"]
    void(
        "TextureSubImage3D",

        TEXTURE,
        src["level"],
        src["xoffset"],
        src["yoffset"],
        src["zoffset"],
        src["width"],
        src["height"],
        src["depth"],
        src["format"],
        src["type"],
        src["pixels"]
    )

    src = GL13C["CompressedTexSubImage1D"]
    void(
        "CompressedTextureSubImage1D",

        TEXTURE,
        src["level"],
        src["xoffset"],
        src["width"],
        src["format"],
        src["imageSize"],
        src["data"]
    )

    src = GL13C["CompressedTexSubImage2D"]
    void(
        "CompressedTextureSubImage2D",

        TEXTURE,
        src["level"],
        src["xoffset"],
        src["yoffset"],
        src["width"],
        src["height"],
        src["format"],
        src["imageSize"],
        src["data"]
    )

    src = GL13C["CompressedTexSubImage3D"]
    void(
        "CompressedTextureSubImage3D",

        TEXTURE,
        src["level"],
        src["xoffset"],
        src["yoffset"],
        src["zoffset"],
        src["width"],
        src["height"],
        src["depth"],
        src["format"],
        src["imageSize"],
        src["data"]
    )

    src = GL11C["CopyTexSubImage1D"]
    void(
        "CopyTextureSubImage1D",

        TEXTURE,
        src["level"],
        src["xoffset"],
        src["x"],
        src["y"],
        src["width"]
    )

    src = GL11C["CopyTexSubImage2D"]
    void(
        "CopyTextureSubImage2D",

        TEXTURE,
        src["level"],
        src["xoffset"],
        src["yoffset"],
        src["x"],
        src["y"],
        src["width"],
        src["height"]
    )

    src = GL12C["CopyTexSubImage3D"]
    void(
        "CopyTextureSubImage3D",

        TEXTURE,
        src["level"],
        src["xoffset"],
        src["yoffset"],
        src["zoffset"],
        src["x"],
        src["y"],
        src["width"],
        src["height"]
    )

    src = GL11C["TexParameterf"]
    void(
        "TextureParameterf",

        TEXTURE,
        src["pname"],
        src["param"]
    )

    src = GL11C["TexParameterfv"]
    void(
        "TextureParameterfv",

        TEXTURE,
        src["pname"],
        src["params"]
    )

    src = GL11C["TexParameteri"]
    void(
        "TextureParameteri",

        TEXTURE,
        src["pname"],
        src["param"]
    )

    src = GL30["TexParameterIiv"]
    void(
        "TextureParameterIiv",

        TEXTURE,
        src["pname"],
        src["params"]
    )

    src = GL30["TexParameterIuiv"]
    void(
        "TextureParameterIuiv",

        TEXTURE,
        src["pname"],
        src["params"]
    )

    src = GL11C["TexParameteriv"]
    void(
        "TextureParameteriv",

        TEXTURE,
        src["pname"],
        src["params"]
    )

    src = GL30["GenerateMipmap"]
    void(
        "GenerateTextureMipmap",

        TEXTURE
    )

    void(
        "BindTextureUnit",

        GLuint("unit"),
        TEXTURE
    )

    src = GL11C["GetTexImage"]
    void(
        "GetTextureImage",

        TEXTURE,
        src["level"],
        src["format"],
        src["type"],
        AutoSize("pixels")..GLsizei("bufSize"),
        src["pixels"]
    )

    src = GL13C["GetCompressedTexImage"]
    void(
        "GetCompressedTextureImage",

        TEXTURE,
        src["level"],
        AutoSize("pixels")..GLsizei("bufSize"),
        Check(
            expression = "glGetTextureLevelParameteri(texture, level, GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE)", debug = true
        )..RawPointer..void.p("pixels")
    )

    src = GL11C["GetTexLevelParameterfv"]
    void(
        "GetTextureLevelParameterfv",

        TEXTURE,
        src["level"],
        src["pname"],
        src["params"]
    )

    src = GL11C["GetTexLevelParameteriv"]
    void(
        "GetTextureLevelParameteriv",

        TEXTURE,
        src["level"],
        src["pname"],
        src["params"]
    )

    src = GL11C["GetTexParameterfv"]
    void(
        "GetTextureParameterfv",

        TEXTURE,
        src["pname"],
        src["params"]
    )

    src = GL30["GetTexParameterIiv"]
    void(
        "GetTextureParameterIiv",

        TEXTURE,
        src["pname"],
        src["params"]
    )

    src = GL30["GetTexParameterIuiv"]
    void(
        "GetTextureParameterIuiv",

        TEXTURE,
        src["pname"],
        src["params"]
    )

    src = GL11C["GetTexParameteriv"]
    void(
        "GetTextureParameteriv",

        TEXTURE,
        src["pname"],
        src["params"]
    )

    void(
        "CreateVertexArrays",

        AutoSize("arrays")..GLsizei("n"),
        ReturnParam..GLuint.p("arrays")
    )

    src = GL20["DisableVertexAttribArray"]
    void(
        "DisableVertexArrayAttrib",

        GLuint("vaobj"),
        src["index"]
    )

    src = GL20["EnableVertexAttribArray"]
    void(
        "EnableVertexArrayAttrib",

        GLuint("vaobj"),
        src["index"]
    )

    void(
        "VertexArrayElementBuffer",

        GLuint("vaobj"),
        GLuint("buffer")
    )

    src = GL43["BindVertexBuffer"]
    void(
        "VertexArrayVertexBuffer",

        GLuint("vaobj"),
        src["bindingindex"],
        src["buffer"],
        src["offset"],
        src["stride"]
    )

    src = GL44["BindVertexBuffers"]
    void(
        "VertexArrayVertexBuffers",

        GLuint("vaobj"),
        src["first"],
        src["count"],
        src["buffers"],
        src["offsets"],
        src["strides"]
    )

    src = GL43["VertexAttribFormat"]
    void(
        "VertexArrayAttribFormat",

        GLuint("vaobj"),
        src["attribindex"],
        src["size"],
        src["type"],
        src["normalized"],
        src["relativeoffset"]
    )

    src = GL43["VertexAttribIFormat"]
    void(
        "VertexArrayAttribIFormat",

        GLuint("vaobj"),
        src["attribindex"],
        src["size"],
        src["type"],
        src["relativeoffset"]
    )

    src = GL43["VertexAttribLFormat"]
    void(
        "VertexArrayAttribLFormat",

        GLuint("vaobj"),
        src["attribindex"],
        src["size"],
        src["type"],
        src["relativeoffset"]
    )

    src = GL43["VertexAttribBinding"]
    void(
        "VertexArrayAttribBinding",

        GLuint("vaobj"),
        src["attribindex"],
        src["bindingindex"]
    )

    src = GL43["VertexBindingDivisor"]
    void(
        "VertexArrayBindingDivisor",

        GLuint("vaobj"),
        src["bindingindex"],
        src["divisor"]
    )

    void(
        "GetVertexArrayiv",

        GLuint("vaobj"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLint.p("param")
    )

    void(
        "GetVertexArrayIndexediv",

        GLuint("vaobj"),
        GLuint("index"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLint.p("param")
    )

    void(
        "GetVertexArrayIndexed64iv",

        GLuint("vaobj"),
        GLuint("index"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLint64.p("param")
    )

    void(
        "CreateSamplers",

        AutoSize("samplers")..GLsizei("n"),
        ReturnParam..GLuint.p("samplers")
    )

    void(
        "CreateProgramPipelines",

        AutoSize("pipelines")..GLsizei("n"),
        ReturnParam..GLuint.p("pipelines")
    )

    void(
        "CreateQueries",

        GLenum("target"),
        AutoSize("ids")..GLsizei("n"),
        ReturnParam..GLuint.p("ids")
    )

    void(
        "GetQueryBufferObjectiv",

        GLuint("id"),
        GLuint("buffer"),
        GLenum("pname"),
        GLintptr("offset")
    )

    void(
        "GetQueryBufferObjectuiv",

        this["GetQueryBufferObjectiv"]["id"],
        this["GetQueryBufferObjectiv"]["buffer"],
        this["GetQueryBufferObjectiv"]["pname"],
        this["GetQueryBufferObjectiv"]["offset"]
    )

    void(
        "GetQueryBufferObjecti64v",

        this["GetQueryBufferObjectiv"]["id"],
        this["GetQueryBufferObjectiv"]["buffer"],
        this["GetQueryBufferObjectiv"]["pname"],
        this["GetQueryBufferObjectiv"]["offset"]
    )

    void(
        "GetQueryBufferObjectui64v",

        this["GetQueryBufferObjectiv"]["id"],
        this["GetQueryBufferObjectiv"]["buffer"],
        this["GetQueryBufferObjectiv"]["pname"],
        this["GetQueryBufferObjectiv"]["offset"]
    )

    // ARB_ES3_1_compatibility

    void(
        "MemoryBarrierByRegion",

        GLbitfield("barriers")
    )

    // ARB_get_texture_sub_image

    void(
        "GetTextureSubImage",

        GLuint("texture"),
        GLint("level"),
        GLint("xoffset"),
        GLint("yoffset"),
        GLint("zoffset"),
        GLsizei("width"),
        GLsizei("height"),
        GLsizei("depth"),
        GLenum("format"),
        GLenum("type"),
        AutoSize("pixels")..GLsizei("bufSize"),
        MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE)..RawPointer..void.p("pixels")
    )

    void(
        "GetCompressedTextureSubImage",

        GLuint("texture"),
        GLint("level"),
        GLint("xoffset"),
        GLint("yoffset"),
        GLint("zoffset"),
        GLsizei("width"),
        GLsizei("height"),
        GLsizei("depth"),
        AutoSize("pixels")..GLsizei("bufSize"),
        MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE)..RawPointer..void.p("pixels")
    )

    // ARB_texture_barrier

    void("TextureBarrier")

    // KHR_context_flush_control

    IntConstant(
        "CONTEXT_RELEASE_BEHAVIOR"..0x82FB
    )

    IntConstant(
        "CONTEXT_RELEASE_BEHAVIOR_FLUSH"..0x82FC
    )

    // KHR_robustness

    IntConstant(
        "GUILTY_CONTEXT_RESET"..0x8253,
        "INNOCENT_CONTEXT_RESET"..0x8254,
        "UNKNOWN_CONTEXT_RESET"..0x8255
    )

    IntConstant(
        "RESET_NOTIFICATION_STRATEGY"..0x8256
    )

    IntConstant(
        "LOSE_CONTEXT_ON_RESET"..0x8252,
        "NO_RESET_NOTIFICATION"..0x8261
    )

    IntConstant(
        "CONTEXT_FLAG_ROBUST_ACCESS_BIT"..0x00000004
    )

    IntConstant(
        "CONTEXT_LOST"..0x0507
    )

    GLenum(
        "GetGraphicsResetStatus",
        void()
    )

    src = GL11C["GetTexImage"]
    IgnoreMissing..void(
        "GetnTexImage",

        src["tex"],
        src["level"],
        src["format"],
        src["type"],
        AutoSize("img")..GLsizei("bufSize"),
        MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE)..RawPointer..void.p("img")
    )

    void(
        "ReadnPixels",

        GLint("x"),
        GLint("y"),
        GLsizei("width"),
        GLsizei("height"),
        GLenum("format"),
        GLenum("type"),
        AutoSize("pixels")..GLsizei("bufSize"),
        MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT)..RawPointer..void.p("pixels")
    )

    src = GL13C["GetCompressedTexImage"]
    IgnoreMissing..void(
        "GetnCompressedTexImage",

        src["target"],
        src["level"],
        AutoSize("img")..GLsizei("bufSize"),
        Check(
            expression = "GL11.glGetTexLevelParameteri(target, level, GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE)", debug = true
        )..RawPointer..void.p("img")
    )

    void(
        "GetnUniformfv",

        GLuint("program"),
        GLint("location"),
        AutoSize("params")..GLsizei("bufSize"),
        ReturnParam..GLfloat.p("params")
    )

    IgnoreMissing..void(
        "GetnUniformdv",

        GLuint("program"),
        GLint("location"),
        AutoSize("params")..GLsizei("bufSize"),
        ReturnParam..GLdouble.p("params")
    )

    void(
        "GetnUniformiv",

        GLuint("program"),
        GLint("location"),
        AutoSize("params")..GLsizei("bufSize"),
        ReturnParam..GLint.p("params")
    )

    void(
        "GetnUniformuiv",

        GLuint("program"),
        GLint("location"),
        AutoSize("params")..GLsizei("bufSize"),
        ReturnParam..GLuint.p("params")
    )
}