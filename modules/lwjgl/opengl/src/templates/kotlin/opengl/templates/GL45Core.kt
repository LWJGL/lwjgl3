/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL45C = "GL45C".nativeClassGL("GL45C") {
    extends = GL44C
    documentation =
        """
        The OpenGL functionality up to version 4.5. Includes only Core Profile symbols.

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

    val depths = IntConstant(
        "Accepted by the {@code depth} parameter of #ClipControl().",

        "NEGATIVE_ONE_TO_ONE"..0x935E,
        "ZERO_TO_ONE"..0x935F
    ).javaDocLinks

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "CLIP_ORIGIN"..0x935C,
        "CLIP_DEPTH_MODE"..0x935D
    )

    void(
        "ClipControl",
        """
        Controls the clipping volume behavior.

        These parameters update the clip control origin and depth mode respectively. The initial value of the clip control origin is #LOWER_LEFT and the
        initial value of the depth mode is #NEGATIVE_ONE_TO_ONE.

        The error #INVALID_OPERATION is generated if ClipControl is executed between the execution of #Begin() and the corresponding
        execution of #End().
        """,

        GLenum("origin", "the clip origin", "#LOWER_LEFT #UPPER_LEFT"),
        GLenum("depth", "the clip depth mode", depths)
    )

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

    void(
        "CreateTransformFeedbacks",
        "Returns {@code n} previously unused transform feedback object names in {@code ids}, each representing a new state vector.",

        AutoSize("ids")..GLsizei("n", "the number of transform feedback object names to create"),
        ReturnParam..GLuint.p("ids", "the buffer in which to return the names")
    )

    void(
        "TransformFeedbackBufferBase",
        "Binds a buffer object to a transform feedback object.",

        GLuint("xfb", "zero or the name of an existing transform feedback object"),
        GLuint("index", "the transform feedback stream index"),
        GLuint("buffer", "the name of an existing buffer object")
    )

    void(
        "TransformFeedbackBufferRange",
        "Binds a region of a buffer object to a transform feedback object.",

        GLuint("xfb", "zero or the name of an existing transform feedback object"),
        GLuint("index", "the transform feedback stream index"),
        GLuint("buffer", "the name of an existing buffer object"),
        GLintptr("offset", "the starting offset in basic machine units into the buffer object"),
        GLsizeiptr("size", "the amount of data in machine units")
    )

    void(
        "GetTransformFeedbackiv",
        "Returns information about a transform feedback object.",

        GLuint("xfb", "zero or the name of an existing transform feedback object"),
        GLenum("pname", "the parameter to query", "#TRANSFORM_FEEDBACK_PAUSED #TRANSFORM_FEEDBACK_ACTIVE"),
        Check(1)..ReturnParam..GLint.p("param", "the buffer in which to return the parameter value")
    )

    void(
        "GetTransformFeedbacki_v",
        "Returns information about a transform feedback object.",

        GLuint("xfb", "zero or the name of an existing transform feedback object"),
        GLenum("pname", "the parameter to query", "#TRANSFORM_FEEDBACK_BUFFER_BINDING"),
        GLuint("index", "the transform feedback stream index"),
        Check(1)..ReturnParam..GLint.p("param", "the buffer in which to return the parameter value")
    )

    void(
        "GetTransformFeedbacki64_v",
        "Returns information about a transform feedback object.",

        GLuint("xfb", "zero or the name of an existing transform feedback object"),
        GLenum("pname", "the parameter to query", "#TRANSFORM_FEEDBACK_BUFFER_START #TRANSFORM_FEEDBACK_BUFFER_SIZE"),
        GLuint("index", "the transform feedback stream index"),
        Check(1)..ReturnParam..GLint64.p("param", "the buffer in which to return the parameter value")
    )

    void(
        "CreateBuffers",
        """
        Returns {@code n} previously unused buffer names in {@code buffers}, each representing a new buffer object initialized as if it had been bound to an
        unspecified target.
        """,

        AutoSize("buffers")..GLsizei("n", "the number of buffer names to create"),
        ReturnParam..GLuint.p("buffers", "the buffer in which to return the names")
    )

    var src = GL44["BufferStorage"]
    void(
        "NamedBufferStorage",
        "DSA version of ${src.javaDocLink}.",

        GLuint("buffer", "the buffer object name"),
        src["size"],
        src["data"],
        src["flags"]
    )

    src = GL15["BufferData"]
    void(
        "NamedBufferData",
        "DSA version of ${src.javaDocLink}.",

        GLuint("buffer", ""),
        src["size"],
        src["data"],
        src["usage"]
    )

    src = GL15["BufferSubData"]
    void(
        "NamedBufferSubData",
        "DSA version of ${src.javaDocLink}.",

        GLuint("buffer", ""),
        src["offset"],
        src["size"],
        src["data"]
    )

    src = GL31["CopyBufferSubData"]
    void(
        "CopyNamedBufferSubData",
        "DSA version of ${src.javaDocLink}.",

        GLuint("readBuffer", "the source buffer object name"),
        GLuint("writeBuffer", "the destination buffer object name"),
        src["readOffset"],
        src["writeOffset"],
        src["size"]
    )

    src = GL43["ClearBufferData"]
    void(
        "ClearNamedBufferData",
        "DSA version of ${src.javaDocLink}.",

        GLuint("buffer", "the buffer object name"),
        src["internalformat"],
        src["format"],
        src["type"],
        src["data"]
    )

    src = GL43["ClearBufferSubData"]
    void(
        "ClearNamedBufferSubData",
        "DSA version of ${src.javaDocLink}.",

        GLuint("buffer", "the buffer object name"),
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
        "DSA version of ${src.javaDocLink}.",

        GLuint("buffer", "the buffer object name"),
        src["access"]
    )

    src = GL30["MapBufferRange"]
    MapPointer("length", oldBufferOverloads = true)..void.p(
        "MapNamedBufferRange",
        "DSA version of ${src.javaDocLink}.",

        GLuint("buffer", "the buffer object name"),
        src["offset"],
        src["length"],
        src["access"]
    )

    src = GL15["UnmapBuffer"]
    GLboolean(
        "UnmapNamedBuffer",
        "DSA version of ${src.javaDocLink}.",

        GLuint("buffer", "the buffer object name")
    )

    src = GL30["FlushMappedBufferRange"]
    void(
        "FlushMappedNamedBufferRange",
        "DSA version of ${src.javaDocLink}.",

        GLuint("buffer", "the buffer object name"),
        src["offset"],
        src["length"]
    )

    src = GL15["GetBufferParameteriv"]
    void(
        "GetNamedBufferParameteriv",
        "DSA version of ${src.javaDocLink}.",

        GLuint("buffer", "the buffer object name"),
        src["pname"],
        src["params"]
    )

    src = GL32["GetBufferParameteri64v"]
    void(
        "GetNamedBufferParameteri64v",
        "DSA version of ${src.javaDocLink}.",

        GLuint("buffer", "the buffer object name"),
        src["pname"],
        src["params"]
    )

    src = GL15["GetBufferPointerv"]
    void(
        "GetNamedBufferPointerv",
        "DSA version of ${src.javaDocLink}.",

        GLuint("buffer", "the buffer object name"),
        src["pname"],
        src["params"]

    )

    src = GL15["GetBufferSubData"]
    void(
        "GetNamedBufferSubData",
        "DSA version of ${src.javaDocLink}.",

        GLuint("buffer", "the buffer object name"),
        src["offset"],
        src["size"],
        src["data"]
    )

    void(
        "CreateFramebuffers",
        "Returns {@code n} previously unused framebuffer names in {@code framebuffers}, each representing a new framebuffer object.",

        AutoSize("framebuffers")..GLsizei("n", "the number of framebuffer names to create"),
        ReturnParam..GLuint.p("framebuffers", "the buffer in which to store the framebuffer names")
    )

    val FRAMEBUFFER = GLuint("framebuffer", "the framebuffer name")

    src = GL30["FramebufferRenderbuffer"]
    void(
        "NamedFramebufferRenderbuffer",
        "DSA version of ${src.javaDocLink}.",

        FRAMEBUFFER,
        src["attachment"],
        src["renderbuffertarget"],
        src["renderbuffer"]
    )

    src = GL43["FramebufferParameteri"]
    void(
        "NamedFramebufferParameteri",
        "DSA version of ${src.javaDocLink}.",

        FRAMEBUFFER,
        src["pname"],
        src["param"]
    )

    src = GL32["FramebufferTexture"]
    void(
        "NamedFramebufferTexture",
        "DSA version of ${src.javaDocLink}.",

        FRAMEBUFFER,
        src["attachment"],
        src["texture"],
        src["level"]
    )

    src = GL30["FramebufferTextureLayer"]
    void(
        "NamedFramebufferTextureLayer",
        "DSA version of ${src.javaDocLink}.",

        FRAMEBUFFER,
        src["attachment"],
        src["texture"],
        src["level"],
        src["layer"]
    )

    src = GL11C["DrawBuffer"]
    void(
        "NamedFramebufferDrawBuffer",
        "DSA version of ${src.javaDocLink}.",

        FRAMEBUFFER,
        src["buf"]
    )

    src = GL20["DrawBuffers"]
    void(
        "NamedFramebufferDrawBuffers",
        "DSA version of ${src.javaDocLink}.",

        FRAMEBUFFER,
        src["n"],
        src["bufs"]
    )

    src = GL11C["ReadBuffer"]
    void(
        "NamedFramebufferReadBuffer",
        "DSA version of ${src.javaDocLink}.",

        FRAMEBUFFER,
        src["src"]
    )

    src = GL43["InvalidateFramebuffer"]
    void(
        "InvalidateNamedFramebufferData",
        "DSA version of ${src.javaDocLink}.",

        FRAMEBUFFER,
        src["numAttachments"],
        src["attachments"]
    )

    src = GL43["InvalidateSubFramebuffer"]
    void(
        "InvalidateNamedFramebufferSubData",
        "DSA version of ${src.javaDocLink}.",

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
        "DSA version of ${src.javaDocLink}.",

        FRAMEBUFFER,
        src["buffer"],
        src["drawbuffer"],
        src["value"]
    )

    src = GL30["ClearBufferuiv"]
    void(
        "ClearNamedFramebufferuiv",
        "DSA version of ${src.javaDocLink}.",

        FRAMEBUFFER,
        src["buffer"],
        src["drawbuffer"],
        src["value"]
    )

    src = GL30["ClearBufferfv"]
    void(
        "ClearNamedFramebufferfv",
        "DSA version of ${src.javaDocLink}.",

        FRAMEBUFFER,
        src["buffer"],
        src["drawbuffer"],
        src["value"]
    )

    src = GL30["ClearBufferfi"]
    void(
        "ClearNamedFramebufferfi",
        "DSA version of ${src.javaDocLink}.",

        FRAMEBUFFER,
        src["buffer"],
        src["drawbuffer"],
        src["depth"],
        src["stencil"]
    )

    src = GL30["BlitFramebuffer"]
    void(
        "BlitNamedFramebuffer",
        "DSA version of ${src.javaDocLink}.",

        GLuint("readFramebuffer", "the source framebuffer name"),
        GLuint("drawFramebuffer", "the destination framebuffer name"),
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
        "DSA version of ${src.javaDocLink}.",

        FRAMEBUFFER,
        src["target"]
    )

    src = GL43["GetFramebufferParameteriv"]
    void(
        "GetNamedFramebufferParameteriv",
        "DSA version of ${src.javaDocLink}.",

        FRAMEBUFFER,
        src["pname"],
        src["params"]
    )

    src = GL30["GetFramebufferAttachmentParameteriv"]
    void(
        "GetNamedFramebufferAttachmentParameteriv",
        "DSA version of ${src.javaDocLink}.",

        FRAMEBUFFER,
        src["attachment"],
        src["pname"],
        src["params"]
    )

    void(
        "CreateRenderbuffers",
        "Returns {@code n} previously unused renderbuffer names in {@code renderbuffers}, each representing a new renderbuffer object.",

        AutoSize("renderbuffers")..GLsizei("n", "the number of renderbuffer names to create"),
        ReturnParam..GLuint.p("renderbuffers", "the buffer in which to store the created renderbuffer names")
    )

    src = GL30["RenderbufferStorage"]
    void(
        "NamedRenderbufferStorage",
        "DSA version of ${src.javaDocLink}.",

        GLuint("renderbuffer", ""),
        src["internalformat"],
        src["width"],
        src["height"]
    )

    src = GL30["RenderbufferStorageMultisample"]
    void(
        "NamedRenderbufferStorageMultisample",
        "DSA version of ${src.javaDocLink}.",

        GLuint("renderbuffer", ""),
        src["samples"],
        src["internalformat"],
        src["width"],
        src["height"]
    )

    src = GL30["GetRenderbufferParameteriv"]
    void(
        "GetNamedRenderbufferParameteriv",
        "DSA version of ${src.javaDocLink}.",

        GLuint("renderbuffer", ""),
        src["pname"],
        src["params"]
    )

    void(
        "CreateTextures",
        "Returns {@code n} previously unused texture names in {@code textures}, each representing a new texture object.",

        GLenum(
            "target",
            "the texture target",
            "#TEXTURE_1D $TEXTURE_2D_TARGETS $TEXTURE_3D_TARGETS #TEXTURE_BUFFER #TEXTURE_2D_MULTISAMPLE #TEXTURE_2D_MULTISAMPLE_ARRAY"
        ),
        AutoSize("textures")..GLsizei("n", "the number of texture names to create"),
        ReturnParam..GLuint.p("textures", "the buffer in which to store the created texture names")
    )

    val TEXTURE = GLuint("texture", "the texture name")

    src = GL31["TexBuffer"]
    void(
        "TextureBuffer",
        "DSA version of ${src.javaDocLink}.",

        TEXTURE,
        src["internalformat"],
        src["buffer"]
    )

    src = GL43["TexBufferRange"]
    void(
        "TextureBufferRange",
        "DSA version of ${src.javaDocLink}.",

        TEXTURE,
        src["internalformat"],
        src["buffer"],
        src["offset"],
        src["size"]
    )

    src = GL42["TexStorage1D"]
    void(
        "TextureStorage1D",
        "DSA version of ${src.javaDocLink}.",

        TEXTURE,
        src["levels"],
        src["internalformat"],
        src["width"]
    )

    src = GL42["TexStorage2D"]
    void(
        "TextureStorage2D",
        "DSA version of ${src.javaDocLink}.",

        TEXTURE,
        src["levels"],
        src["internalformat"],
        src["width"],
        src["height"]
    )

    src = GL42["TexStorage3D"]
    void(
        "TextureStorage3D",
        "DSA version of ${src.javaDocLink}.",

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
        "DSA version of ${src.javaDocLink}.",

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
        "DSA version of ${src.javaDocLink}.",

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
        "DSA version of ${src.javaDocLink}.",

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
        "DSA version of ${src.javaDocLink}.",

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
        "DSA version of ${src.javaDocLink}.",

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
        "DSA version of ${src.javaDocLink}.",

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
        "DSA version of ${src.javaDocLink}.",

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
        "DSA version of ${src.javaDocLink}.",

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
        "DSA version of ${src.javaDocLink}.",

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
        "DSA version of ${src.javaDocLink}.",

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
        "DSA version of ${src.javaDocLink}.",

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
        "DSA version of ${src.javaDocLink}.",

        TEXTURE,
        src["pname"],
        src["param"]
    )

    src = GL11C["TexParameterfv"]
    void(
        "TextureParameterfv",
        "DSA version of ${src.javaDocLink}.",

        TEXTURE,
        src["pname"],
        src["params"]
    )

    src = GL11C["TexParameteri"]
    void(
        "TextureParameteri",
        "DSA version of ${src.javaDocLink}.",

        TEXTURE,
        src["pname"],
        src["param"]
    )

    src = GL30["TexParameterIiv"]
    void(
        "TextureParameterIiv",
        "DSA version of ${src.javaDocLink}.",

        TEXTURE,
        src["pname"],
        src["params"]
    )

    src = GL30["TexParameterIuiv"]
    void(
        "TextureParameterIuiv",
        "DSA version of ${src.javaDocLink}.",

        TEXTURE,
        src["pname"],
        src["params"]
    )

    src = GL11C["TexParameteriv"]
    void(
        "TextureParameteriv",
        "DSA version of ${src.javaDocLink}.",

        TEXTURE,
        src["pname"],
        src["params"]
    )

    src = GL30["GenerateMipmap"]
    void(
        "GenerateTextureMipmap",
        "DSA version of ${src.javaDocLink}.",

        TEXTURE
    )

    void(
        "BindTextureUnit",
        """
        Binds an existing texture object to the texture unit numbered {@code unit}.

        {@code texture} must be zero or the name of an existing texture object. When {@code texture} is the name of an existing texture object, that object is
        bound to the target, in the corresponding texture unit, that was specified when the object was created. When {@code texture} is zero, each of the targets
        enumerated at the beginning of this section is reset to its default texture for the corresponding texture image unit.
        """,

        GLuint("unit", "the texture unit number"),
        TEXTURE
    )

    src = GL11C["GetTexImage"]
    void(
        "GetTextureImage",
        "DSA version of ${src.javaDocLink}.",

        TEXTURE,
        src["level"],
        src["format"],
        src["type"],
        AutoSize("pixels")..GLsizei("bufSize", "the size of the buffer to receive the retrieved pixel data"),
        src["pixels"]
    )

    src = GL13C["GetCompressedTexImage"]
    void(
        "GetCompressedTextureImage",
        "DSA version of ${src.javaDocLink}.",

        TEXTURE,
        src["level"],
        AutoSize("pixels")..GLsizei("bufSize", "the size of the buffer to receive the retrieved pixel data"),
        Check(
            expression = "glGetTextureLevelParameteri(texture, level, GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE)", debug = true
        )..RawPointer..void.p("pixels", "a buffer in which to return the compressed texture image")
    )

    src = GL11C["GetTexLevelParameterfv"]
    void(
        "GetTextureLevelParameterfv",
        "DSA version of ${src.javaDocLink}.",

        TEXTURE,
        src["level"],
        src["pname"],
        src["params"]
    )

    src = GL11C["GetTexLevelParameteriv"]
    void(
        "GetTextureLevelParameteriv",
        "DSA version of ${src.javaDocLink}.",

        TEXTURE,
        src["level"],
        src["pname"],
        src["params"]
    )

    src = GL11C["GetTexParameterfv"]
    void(
        "GetTextureParameterfv",
        "DSA version of ${src.javaDocLink}.",

        TEXTURE,
        src["pname"],
        src["params"]
    )

    src = GL30["GetTexParameterIiv"]
    void(
        "GetTextureParameterIiv",
        "DSA version of ${src.javaDocLink}.",

        TEXTURE,
        src["pname"],
        src["params"]
    )

    src = GL30["GetTexParameterIuiv"]
    void(
        "GetTextureParameterIuiv",
        "DSA version of ${src.javaDocLink}.",

        TEXTURE,
        src["pname"],
        src["params"]
    )

    src = GL11C["GetTexParameteriv"]
    void(
        "GetTextureParameteriv",
        "DSA version of ${src.javaDocLink}.",

        TEXTURE,
        src["pname"],
        src["params"]
    )

    void(
        "CreateVertexArrays",
        "Returns {@code n} previously unused vertex array object names in {@code arrays}.",

        AutoSize("arrays")..GLsizei("n", "the number of vertex array object names to create"),
        ReturnParam..GLuint.p("arrays", "the buffer in which to return the created vertex array object names")
    )

    src = GL20["DisableVertexAttribArray"]
    void(
        "DisableVertexArrayAttrib",
        "DSA version of ${src.javaDocLink}.",

        GLuint("vaobj", "the vertex array object name"),
        src["index"]
    )

    src = GL20["EnableVertexAttribArray"]
    void(
        "EnableVertexArrayAttrib",
        "DSA version of ${src.javaDocLink}.",

        GLuint("vaobj", "the vertex array object name"),
        src["index"]
    )

    void(
        "VertexArrayElementBuffer",
        "Binds a buffer object to the element array buffer bind point of a vertex array object.",

        GLuint("vaobj", "the vertex array object name"),
        GLuint("buffer", "the buffer object name. If {@code buffer} is zero, any existing element array buffer binding to {@code vaobj} is removed.")
    )

    src = GL43["BindVertexBuffer"]
    void(
        "VertexArrayVertexBuffer",
        "DSA version of ${src.javaDocLink}.",

        GLuint("vaobj", "the vertex array object name"),
        src["bindingindex"],
        src["buffer"],
        src["offset"],
        src["stride"]
    )

    src = GL44["BindVertexBuffers"]
    void(
        "VertexArrayVertexBuffers",
        "DSA version of ${src.javaDocLink}.",

        GLuint("vaobj", "the vertex array object name"),
        src["first"],
        src["count"],
        src["buffers"],
        src["offsets"],
        src["strides"]
    )

    src = GL43["VertexAttribFormat"]
    void(
        "VertexArrayAttribFormat",
        "DSA version of ${src.javaDocLink}.",

        GLuint("vaobj", "the vertex array object name"),
        src["attribindex"],
        src["size"],
        src["type"],
        src["normalized"],
        src["relativeoffset"]
    )

    src = GL43["VertexAttribIFormat"]
    void(
        "VertexArrayAttribIFormat",
        "DSA version of ${src.javaDocLink}.",

        GLuint("vaobj", "the vertex array object name"),
        src["attribindex"],
        src["size"],
        src["type"],
        src["relativeoffset"]
    )

    src = GL43["VertexAttribLFormat"]
    void(
        "VertexArrayAttribLFormat",
        "DSA version of ${src.javaDocLink}.",

        GLuint("vaobj", "the vertex array object name"),
        src["attribindex"],
        src["size"],
        src["type"],
        src["relativeoffset"]
    )

    src = GL43["VertexAttribBinding"]
    void(
        "VertexArrayAttribBinding",
        "DSA version of ${src.javaDocLink}.",

        GLuint("vaobj", "the vertex array object name"),
        src["attribindex"],
        src["bindingindex"]
    )

    src = GL43["VertexBindingDivisor"]
    void(
        "VertexArrayBindingDivisor",
        "DSA version of ${src.javaDocLink}.",

        GLuint("vaobj", "the vertex array object name"),
        src["bindingindex"],
        src["divisor"]
    )

    void(
        "GetVertexArrayiv",
        "Queries parameters of a vertex array object.",

        GLuint("vaobj", "the vertex array object name"),
        GLenum("pname", "the parameter to query", "#ELEMENT_ARRAY_BUFFER_BINDING"),
        Check(1)..ReturnParam..GLint.p("param", "the buffer in which to return the parameter values")
    )

    void(
        "GetVertexArrayIndexediv",
        "Queries parameters of an attribute of a vertex array object.",

        GLuint("vaobj", "the vertex array object name"),
        GLuint("index", "the attribute to query"),
        GLenum(
            "pname",
            "the parameter to query",
            """
            #VERTEX_ATTRIB_ARRAY_ENABLED #VERTEX_ATTRIB_ARRAY_SIZE, #VERTEX_ATTRIB_ARRAY_STRIDE #VERTEX_ATTRIB_ARRAY_TYPE
            #VERTEX_ATTRIB_ARRAY_NORMALIZED #VERTEX_ATTRIB_ARRAY_INTEGER #VERTEX_ATTRIB_ARRAY_DIVISOR #VERTEX_ATTRIB_ARRAY_LONG
            #VERTEX_ATTRIB_RELATIVE_OFFSET
            """
        ),
        Check(1)..ReturnParam..GLint.p("param", "the buffer in which to return the parameter values")
    )

    void(
        "GetVertexArrayIndexed64iv",
        "Queries parameters of an attribute of a vertex array object.",

        GLuint("vaobj", "the vertex array object name"),
        GLuint("index", "the attribute to query"),
        GLenum("pname", "the parameter to query", "#VERTEX_BINDING_OFFSET"),
        Check(1)..ReturnParam..GLint64.p("param", "the buffer in which to return the parameter values")
    )

    void(
        "CreateSamplers",
        "Returns {@code n} previously unused sampler names in {@code samplers}, each representing a new sampler object.",

        AutoSize("samplers")..GLsizei("n", "the number of sampler object names to create"),
        ReturnParam..GLuint.p("samplers", "the buffer in which to return the created sampler object names")
    )

    void(
        "CreateProgramPipelines",
        "Returns {@code n} previously unused program pipeline names in {@code pipelines}, each representing a new program pipeline object.",

        AutoSize("pipelines")..GLsizei("n", "the number of program pipeline names to create"),
        ReturnParam..GLuint.p("pipelines", "the buffer in which to return the created program pipeline names")
    )

    void(
        "CreateQueries",
        "Returns {@code n} previously unused query object names in {@code ids}, each representing a new query object with the specified {@code target}.",

        GLenum("target", "the query target", QUERY_TARGETS),
        AutoSize("ids")..GLsizei("n", "the number of query object names to create"),
        ReturnParam..GLuint.p("ids", "the buffer in which to return the created query object names")
    )

    void(
        "GetQueryBufferObjectiv",
        "Queries the state of a query object.",

        GLuint("id", "the name of a query object"),
        GLuint("buffer", "the name of a buffer object"),
        GLenum("pname", "the state to query"),
        GLintptr("offset", "the offset into {@code buffer} at which the queried value is written")
    )

    void(
        "GetQueryBufferObjectuiv",
        "Unsigned version of #GetQueryBufferObjectiv().",

        this["GetQueryBufferObjectiv"]["id"],
        this["GetQueryBufferObjectiv"]["buffer"],
        this["GetQueryBufferObjectiv"]["pname"],
        this["GetQueryBufferObjectiv"]["offset"]
    )

    void(
        "GetQueryBufferObjecti64v",
        "64bit version of #GetQueryBufferObjectiv().",

        this["GetQueryBufferObjectiv"]["id"],
        this["GetQueryBufferObjectiv"]["buffer"],
        this["GetQueryBufferObjectiv"]["pname"],
        this["GetQueryBufferObjectiv"]["offset"]
    )

    void(
        "GetQueryBufferObjectui64v",
        "64bit version of #GetQueryBufferObjectuiv().",

        this["GetQueryBufferObjectiv"]["id"],
        this["GetQueryBufferObjectiv"]["buffer"],
        this["GetQueryBufferObjectiv"]["pname"],
        this["GetQueryBufferObjectiv"]["offset"]
    )

    // ARB_ES3_1_compatibility

    void(
        "MemoryBarrierByRegion",
        """
        Behaves like #MemoryBarrier(), with two differences:

        First, it narrows the region under consideration so that only reads/writes of prior fragment shaders that are invoked for a smaller region of the
        framebuffer will be completed/reflected prior to subsequent reads/write of following fragment shaders. The size of the region is implementation
        dependent and may be as small as one framebuffer pixel.

        Second, it only applies to memory transactions that may be read by or written by a fragment shader.

        When barriers is #ALL_BARRIER_BITS, shader memory accesses will be synchronized relative to all these barrier bits, but not to other
        barrier bits specific to #MemoryBarrier(). This implies that reads/writes for scatter/gather-like algorithms may or may not be
        completed/reflected after a MemoryBarrierByRegion command. However, for uses such as deferred shading, where a linked list of visible
        surfaces with the head at a framebuffer address may be constructed, and the entirety of the list is only dependent on previous executions at that
        framebuffer address, MemoryBarrierByRegion may be significantly more efficient than #MemoryBarrier().
        """,

        GLbitfield(
            "barriers",
            "the barriers to insert",
            """
            #ATOMIC_COUNTER_BARRIER_BIT #FRAMEBUFFER_BARRIER_BIT #SHADER_IMAGE_ACCESS_BARRIER_BIT #SHADER_STORAGE_BARRIER_BIT
            #TEXTURE_FETCH_BARRIER_BIT #UNIFORM_BARRIER_BIT
            """,
            LinkMode.BITFIELD
        )
    )

    // ARB_get_texture_sub_image

    void(
        "GetTextureSubImage",
        "Obtains sub-regions of a texture image from a texture object.",

        GLuint("texture", "the source texture object name"),
        GLint("level", "the level-of-detail number"),
        GLint("xoffset", "the x-position of the subregion"),
        GLint("yoffset", "the y-position of the subregion"),
        GLint("zoffset", "the z-position of the subregion"),
        GLsizei("width", "the subregion width"),
        GLsizei("height", "the subregion height"),
        GLsizei("depth", "the subregion depth"),
        GLenum("format", "the pixel format", PIXEL_DATA_FORMATS),
        GLenum("type", "the pixel type", PIXEL_DATA_TYPES),
        AutoSize("pixels")..GLsizei("bufSize", "the size of the buffer to receive the retrieved pixel data"),
        MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE)..RawPointer..void.p("pixels", "the buffer in which to place the returned data")
    )

    void(
        "GetCompressedTextureSubImage",
        "Obtains a sub-region of a compressed texture image.",

        GLuint("texture", "the source texture object name"),
        GLint("level", "the level-of-detail number"),
        GLint("xoffset", "the x-position of the subregion"),
        GLint("yoffset", "the y-position of the subregion"),
        GLint("zoffset", "the z-position of the subregion"),
        GLsizei("width", "the subregion width"),
        GLsizei("height", "the subregion height"),
        GLsizei("depth", "the subregion depth"),
        AutoSize("pixels")..GLsizei("bufSize", "the size of the buffer to receive the retrieved pixel data"),
        MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE)..RawPointer..void.p("pixels", "the buffer in which to place the returned data")
    )

    // ARB_texture_barrier

    void(
        "TextureBarrier",
        "Guarantees that writes have completed and caches have been invalidated before subsequent Draws are executed."
    )

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

    GLenum(
        "GetGraphicsResetStatus",
        """
        Indicates if the GL context has been in a reset state at any point since the last call to GetGraphicsResetStatus:
        ${ul(
            "#NO_ERROR indicates that the GL context has not been in a reset state since the last call.",
            "#GUILTY_CONTEXT_RESET indicates that a reset has been detected that is attributable to the current GL context.",
            "#INNOCENT_CONTEXT_RESET indicates a reset has been detected that is not attributable to the current GL context.",
            "#UNKNOWN_CONTEXT_RESET indicates a detected graphics reset whose cause is unknown."
        )}
        If a reset status other than NO_ERROR is returned and subsequent calls return NO_ERROR, the context reset was encountered and completed. If a reset
        status is repeatedly returned, the context may be in the process of resetting.

        Reset notification behavior is determined at context creation time, and may be queried by calling GetIntegerv with the symbolic constant
        #RESET_NOTIFICATION_STRATEGY.

        If the reset notification behavior is #NO_RESET_NOTIFICATION, then the implementation will never deliver notification of reset events, and
        GetGraphicsResetStatus will always return NO_ERROR.

        If the behavior is #LOSE_CONTEXT_ON_RESET, a graphics reset will result in a lost context and require creating a new context as described
        above. In this case GetGraphicsResetStatus will return an appropriate value from those described above.

        If a graphics reset notification occurs in a context, a notification must also occur in all other contexts which share objects with that context.

        After a graphics reset has occurred on a context, subsequent GL commands on that context (or any context which shares with that context) will generate a
        #CONTEXT_LOST error. Such commands will not have side effects (in particular, they will not modify memory passed by pointer for query results,
        and may not block indefinitely or cause termination of the application. Exceptions to this behavior include:
        ${ul(
            """
            #GetError() and GetGraphicsResetStatus behave normally following a graphics reset, so that the application can determine a reset has
            occurred, and when it is safe to destroy and recreate the context.
            """,
            """
            Any commands which might cause a polling application to block indefinitely will generate a CONTEXT_LOST error, but will also return a value
            indicating completion to the application.
            """
        )}
        """,
        void()
    )

    src = GL11C["GetTexImage"]
    IgnoreMissing..void(
        "GetnTexImage",
        "Robust version of ${src.javaDocLink}",

        src["tex"],
        src["level"],
        src["format"],
        src["type"],
        AutoSize("img")..GLsizei("bufSize", "the maximum number of bytes to write into {@code img}"),
        MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE)..RawPointer..void.p("img", "a buffer in which to place the returned data")
    )

    void(
        "ReadnPixels",
        "Behaves identically to #ReadPixels() except that it does not write more than {@code bufSize} bytes into {@code data}",

        GLint("x", "the left pixel coordinate"),
        GLint("y", "the lower pixel coordinate"),
        GLsizei("width", "the number of pixels to read in the x-dimension"),
        GLsizei("height", "the number of pixels to read in the y-dimension"),
        GLenum("format", "the pixel format", PIXEL_DATA_FORMATS),
        GLenum("type", "the pixel type", PIXEL_DATA_TYPES),
        AutoSize("pixels")..GLsizei("bufSize", "the maximum number of bytes to write into {@code data}"),
        MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT)..RawPointer..void.p("pixels", "a buffer in which to place the returned pixel data")
    )

    src = GL13C["GetCompressedTexImage"]
    IgnoreMissing..void(
        "GetnCompressedTexImage",
        "Robust version of ${src.javaDocLink}",

        src["target"],
        src["level"],
        AutoSize("img")..GLsizei("bufSize", "the maximum number of bytes to write into {@code img}"),
        Check(
            expression = "GL11.glGetTexLevelParameteri(target, level, GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE)", debug = true
        )..RawPointer..void.p("img", "a buffer in which to place the returned data")
    )

    void(
        "GetnUniformfv",
        "Returns the value or values of a uniform of the default uniform block.",

        GLuint("program", "the program object"),
        GLint("location", "the uniform location"),
        AutoSize("params")..GLsizei("bufSize", "the maximum number of bytes to write to {@code params}"),
        ReturnParam..GLfloat.p("params", "the buffer in which to place the returned data")
    )

    IgnoreMissing..void(
        "GetnUniformdv",
        "Double version of #GetnUniformfv().",

        GLuint("program", "the program object"),
        GLint("location", "the uniform location"),
        AutoSize("params")..GLsizei("bufSize", "the maximum number of bytes to write to {@code params}"),
        ReturnParam..GLdouble.p("params", "the buffer in which to place the returned data")
    )

    void(
        "GetnUniformiv",
        "Integer version of #GetnUniformfv().",

        GLuint("program", "the program object"),
        GLint("location", "the uniform location"),
        AutoSize("params")..GLsizei("bufSize", "the maximum number of bytes to write to {@code params}"),
        ReturnParam..GLfloat.p("params", "the buffer in which to place the returned data")
    )

    void(
        "GetnUniformuiv",
        "Unsigned version of #GetnUniformiv().",

        GLuint("program", "the program object"),
        GLint("location", "the uniform location"),
        AutoSize("params")..GLsizei("bufSize", "the maximum number of bytes to write to {@code params}"),
        ReturnParam..GLfloat.p("params", "the buffer in which to place the returned data")
    )
}