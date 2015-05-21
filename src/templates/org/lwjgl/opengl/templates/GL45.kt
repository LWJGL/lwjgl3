/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.generator.opengl.*
import org.lwjgl.opengl.*

val GL45 = "GL45".nativeClassGL("GL45") {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		The core OpenGL 4.5 functionality. OpenGL 4.5 implementations support revision 4.50 of the OpenGL Shading Language.

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

	val origins = IntConstant(
		"Accepted by the {@code origin} parameter of #ClipControl().",

		"LOWER_LEFT" _ 0x8CA1,
		"UPPER_LEFT" _ 0x8CA2
	).javaDocLinks

	val depths = IntConstant(
		"Accepted by the {@code depth} parameter of #ClipControl().",

		"NEGATIVE_ONE_TO_ONE" _ 0x935E,
		"ZERO_TO_ONE" _ 0x935F
	).javaDocLinks

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"CLIP_ORIGIN" _ 0x935C,
		"CLIP_DEPTH_MODE" _ 0x935D
	)

	GLvoid(
		"ClipControl",
		"""
		Controls the clipping volume behavior.

		These parameters update the clip control origin and depth mode respectively. The initial value of the clip control origin is #LOWER_LEFT and
		the initial value of the depth mode is #NEGATIVE_ONE_TO_ONE.

		The error GL11#INVALID_OPERATION is generated if ClipControl is executed between the execution of GL11#Begin() and the corresponding
		execution of GL11#End().
		""",

		GLenum.IN("origin", "the clip origin", origins),
		GLenum.IN("depth", "the clip depth mode", depths)
	)

	// ARB_conditional_render_inverted

	IntConstant(
		"Accepted by the {@code mode} parameter of GL30#BeginConditionalRender().",

		"QUERY_WAIT_INVERTED" _ 0x8E17,
		"QUERY_NO_WAIT_INVERTED" _ 0x8E18,
		"QUERY_BY_REGION_WAIT_INVERTED" _ 0x8E19,
		"QUERY_BY_REGION_NO_WAIT_INVERTED" _ 0x8E1A
	)

	// ARB_cull_distance

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v.",

		"MAX_CULL_DISTANCES" _ 0x82F9,
		"MAX_COMBINED_CLIP_AND_CULL_DISTANCES" _ 0x82FA
	)

	// ARB_direct_state_access

	IntConstant(
		"Accepted by the {@code pname} parameter of GetTextureParameter{if}v and GetTextureParameterI{i ui}v.",

		"TEXTURE_TARGET" _ 0x1006
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetQueryObjectiv.",

		"QUERY_TARGET" _ 0x82EA
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetIntegeri_v.",

		"TEXTURE_BINDING" _ 0x82EB
	)

	GLvoid(
		"CreateTransformFeedbacks",
		"Returns {@code n} previously unused transform feedback object names in {@code ids}, each representing a new state vector.",

		AutoSize("ids") _ GLsizei.IN("n", "the number of transform feedback object names to create"),
		returnValue _ GLuint_p.OUT("ids", "the buffer in which to return the names")
	)

	GLvoid(
		"TransformFeedbackBufferBase",
		"Binds a buffer object to a transform feedback object.",

		GLuint.IN("xfb", "zero or the name of an existing transform feedback object"),
		GLuint.IN("index", "the transform feedback stream index"),
		GLuint.IN("buffer", "the name of an existing buffer object")
	)

	GLvoid(
		"TransformFeedbackBufferRange",
		"Binds a region of a buffer object to a transform feedback object.",

		GLuint.IN("xfb", "zero or the name of an existing transform feedback object"),
		GLuint.IN("index", "the transform feedback stream index"),
		GLuint.IN("buffer", "the name of an existing buffer object"),
		GLintptr.IN("offset", "the starting offset in basic machine units into the buffer object"),
		GLsizeiptr.IN("size", "the amount of data in machine units")
	)

	GLvoid(
		"GetTransformFeedbackiv",
		"Returns information about a transform feedback object.",

		GLuint.IN("xfb", "zero or the name of an existing transform feedback object"),
		GLenum.IN("pname", "the parameter to query", "GL42#TRANSFORM_FEEDBACK_PAUSED GL42#TRANSFORM_FEEDBACK_ACTIVE"),
		Check(1) _ returnValue _ GLint_p.OUT("param", "the buffer in which to return the parameter value")
	)

	GLvoid(
		"GetTransformFeedbacki_v",
		"Returns information about a transform feedback object.",

		GLuint.IN("xfb", "zero or the name of an existing transform feedback object"),
		GLenum.IN("pname", "the parameter to query", "GL30#TRANSFORM_FEEDBACK_BUFFER_BINDING"),
		GLuint.IN("index", "the transform feedback stream index"),
		Check(1) _ returnValue _ GLint_p.OUT("param", "the buffer in which to return the parameter value")
	)

	GLvoid(
		"GetTransformFeedbacki64_v",
		"Returns information about a transform feedback object.",

		GLuint.IN("xfb", "zero or the name of an existing transform feedback object"),
		GLenum.IN("pname", "the parameter to query", "GL30#TRANSFORM_FEEDBACK_BUFFER_START GL30#TRANSFORM_FEEDBACK_BUFFER_SIZE"),
		GLuint.IN("index", "the transform feedback stream index"),
		Check(1) _ returnValue _ GLint64_p.OUT("param", "the buffer in which to return the parameter value")
	)

	GLvoid(
		"CreateBuffers",
		"""
		Returns {@code n} previously unused buffer names in {@code buffers}, each representing a new buffer object initialized as if it had been bound to an
		unspecified target.
		""",

		AutoSize("buffers") _ GLsizei.IN("n", "the number of buffer names to create"),
		returnValue _ GLuint_p.OUT("buffers", "the buffer in which to return the names")
	)

	var src = GL44["BufferStorage"]
	GLvoid(
		"NamedBufferStorage",
		"DSA version of ${src.javaDocLink}.",

		GLuint.IN("buffer", "the buffer object name"),
		src["size"],
		src["data"],
		src["flags"]
	)

	src = GL15["BufferData"]
	GLvoid(
		"NamedBufferData",
		"DSA version of ${src.javaDocLink}.",

		GLuint.IN("buffer", ""),
		src["size"],
		src["data"],
		src["usage"]
	)

	src = GL15["BufferSubData"]
	GLvoid(
		"NamedBufferSubData",
		"DSA version of ${src.javaDocLink}.",

		GLuint.IN("buffer", ""),
		src["offset"],
		src["size"],
		src["data"]
	)

	src = GL31["CopyBufferSubData"]
	GLvoid(
		"CopyNamedBufferSubData",
		"DSA version of ${src.javaDocLink}.",

		GLuint.IN("readBuffer", "the source buffer object name"),
		GLuint.IN("writeBuffer", "the destination buffer object name"),
		src["readOffset"],
		src["writeOffset"],
		src["size"]
	)

	src = GL43["ClearBufferData"]
	GLvoid(
		"ClearNamedBufferData",
		"DSA version of ${src.javaDocLink}.",

		GLuint.IN("buffer", "the buffer object name"),
		src["internalformat"],
		src["format"],
		src["type"],
		src["data"]
	)

	src = GL43["ClearBufferSubData"]
	GLvoid(
		"ClearNamedBufferSubData",
		"DSA version of ${src.javaDocLink}.",

		GLuint.IN("buffer", "the buffer object name"),
		src["internalformat"],
		src["offset"],
		src["size"],
		src["format"],
		src["type"],
		src["data"]
	)

	src = GL15["MapBuffer"]
	(MapPointer("glGetNamedBufferParameteri(buffer, GL15.GL_BUFFER_SIZE)") _ GLvoid_p)(
		"MapNamedBuffer",
		"DSA version of ${src.javaDocLink}.",

		GLuint.IN("buffer", "the buffer object name"),
		src["access"]
	)

	src = GL30["MapBufferRange"]
	(MapPointer("length") _ GLvoid_p)(
		"MapNamedBufferRange",
		"DSA version of ${src.javaDocLink}.",

		GLuint.IN("buffer", "the buffer object name"),
		src["offset"],
		src["length"],
		src["access"]
	)

	src = GL15["UnmapBuffer"]
	GLboolean(
		"UnmapNamedBuffer",
		"DSA version of ${src.javaDocLink}.",

		GLuint.IN("buffer", "the buffer object name")
	)

	src = GL30["FlushMappedBufferRange"]
	GLvoid(
		"FlushMappedNamedBufferRange",
		"DSA version of ${src.javaDocLink}.",

		GLuint.IN("buffer", "the buffer object name"),
		src["offset"],
		src["length"]
	)

	src = GL15["GetBufferParameteriv"]
	GLvoid(
		"GetNamedBufferParameteriv",
		"DSA version of ${src.javaDocLink}.",

		GLuint.IN("buffer", "the buffer object name"),
		src["pname"],
		src["params"]
	)

	src = GL32["GetBufferParameteri64v"]
	GLvoid(
		"GetNamedBufferParameteri64v",
		"DSA version of ${src.javaDocLink}.",

		GLuint.IN("buffer", "the buffer object name"),
		src["pname"],
		src["params"]
	)

	src = GL15["GetBufferPointerv"]
	GLvoid(
		"GetNamedBufferPointerv",
		"DSA version of ${src.javaDocLink}.",

		GLuint.IN("buffer", "the buffer object name"),
		src["pname"],
		src["params"]

	)

	src = GL15["GetBufferSubData"]
	GLvoid(
		"GetNamedBufferSubData",
		"DSA version of ${src.javaDocLink}.",

		GLuint.IN("buffer", "the buffer object name"),
		src["offset"],
		src["size"],
		src["data"]
	)

	GLvoid(
		"CreateFramebuffers",
		"Returns {@code n} previously unused framebuffer names in {@code framebuffers}, each representing a new framebuffer object.",

		AutoSize("framebuffers") _ GLsizei.IN("n", "the number of framebuffer names to create"),
		returnValue _ GLuint_p.OUT("framebuffers", "the buffer in which to store the framebuffer names")
	)
	
	val FRAMEBUFFER = GLuint.IN("framebuffer", "the framebuffer name")

	src = GL30["FramebufferRenderbuffer"]
	GLvoid(
		"NamedFramebufferRenderbuffer",
		"DSA version of ${src.javaDocLink}.",

		FRAMEBUFFER,
		src["attachment"],
		src["renderbuffertarget"],
		src["renderbuffer"]
	)

	src = GL43["FramebufferParameteri"]
	GLvoid(
		"NamedFramebufferParameteri",
		"DSA version of ${src.javaDocLink}.",

		FRAMEBUFFER,
		src["pname"],
		src["param"]
	)

	src = GL32["FramebufferTexture"]
	GLvoid(
		"NamedFramebufferTexture",
		"DSA version of ${src.javaDocLink}.",

		FRAMEBUFFER,
		src["attachment"],
		src["texture"],
		src["level"]
	)

	src = GL30["FramebufferTextureLayer"]
	GLvoid(
		"NamedFramebufferTextureLayer",
		"DSA version of ${src.javaDocLink}.",

		FRAMEBUFFER,
		src["attachment"],
		src["texture"],
		src["level"],
		src["layer"]
	)

	src = GL11["DrawBuffer"]
	GLvoid(
		"NamedFramebufferDrawBuffer",
		"DSA version of ${src.javaDocLink}.",

		FRAMEBUFFER,
		src["buf"]
	)

	src = GL20["DrawBuffers"]
	GLvoid(
		"NamedFramebufferDrawBuffers",
		"DSA version of ${src.javaDocLink}.",

		FRAMEBUFFER,
		src["n"],
		src["bufs"]
	)

	src = GL11["ReadBuffer"]
	GLvoid(
		"NamedFramebufferReadBuffer",
		"DSA version of ${src.javaDocLink}.",

		FRAMEBUFFER,
		src["src"]
	)

	src = GL43["InvalidateFramebuffer"]
	GLvoid(
		"InvalidateNamedFramebufferData",
		"DSA version of ${src.javaDocLink}.",

		FRAMEBUFFER,
		src["numAttachments"],
		src["attachments"]
	)

	src = GL43["InvalidateSubFramebuffer"]
	GLvoid(
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
	GLvoid(
		"ClearNamedFramebufferiv",
		"DSA version of ${src.javaDocLink}.",

		FRAMEBUFFER,
		src["buffer"],
		src["drawbuffer"],
		src["value"]
	)

	src = GL30["ClearBufferuiv"]
	GLvoid(
		"ClearNamedFramebufferuiv",
		"DSA version of ${src.javaDocLink}.",

		FRAMEBUFFER,
		src["buffer"],
		src["drawbuffer"],
		src["value"]
	)

	src = GL30["ClearBufferfv"]
	GLvoid(
		"ClearNamedFramebufferfv",
		"DSA version of ${src.javaDocLink}.",

		FRAMEBUFFER,
		src["buffer"],
		src["drawbuffer"],
		src["value"]
	)

	src = GL30["ClearBufferfi"]
	GLvoid(
		"ClearNamedFramebufferfi",
		"DSA version of ${src.javaDocLink}.",

		FRAMEBUFFER,
		src["buffer"],
		src["depth"],
		src["stencil"]
	)

	src = GL30["BlitFramebuffer"]
	GLvoid(
		"BlitNamedFramebuffer",
		"DSA version of ${src.javaDocLink}.",

		GLuint.IN("readFramebuffer", "the source framebuffer name"),
		GLuint.IN("drawFramebuffer", "the destination framebuffer name"),
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
	GLvoid(
		"GetNamedFramebufferParameteriv",
		"DSA version of ${src.javaDocLink}.",

		FRAMEBUFFER,
		src["pname"],
		src["params"]
	)

	src = GL30["GetFramebufferAttachmentParameteriv"]
	GLvoid(
		"GetNamedFramebufferAttachmentParameteriv",
		"DSA version of ${src.javaDocLink}.",

		FRAMEBUFFER,
		src["attachment"],
		src["pname"],
		src["params"]
	)

	GLvoid(
		"CreateRenderbuffers",
		"Returns {@code n} previously unused renderbuffer names in {@code renderbuffers}, each representing a new renderbuffer object.",

		AutoSize("renderbuffers") _ GLsizei.IN("n", "the number of renderbuffer names to create"),
		returnValue _ GLuint_p.OUT("renderbuffers", "the buffer in which to store the created renderbuffer names")
	)

	src = GL30["RenderbufferStorage"]
	GLvoid(
		"NamedRenderbufferStorage",
		"DSA version of ${src.javaDocLink}.",

		GLuint.IN("renderbuffer", ""),
		src["internalformat"],
		src["width"],
		src["height"]
	)

	src = GL30["RenderbufferStorageMultisample"]
	GLvoid(
		"NamedRenderbufferStorageMultisample",
		"DSA version of ${src.javaDocLink}.",

		GLuint.IN("renderbuffer", ""),
		src["samples"],
		src["internalformat"],
		src["width"],
		src["height"]
	)

	src = GL30["GetRenderbufferParameteriv"]
	GLvoid(
		"GetNamedRenderbufferParameteriv",
		"DSA version of ${src.javaDocLink}.",

		GLuint.IN("renderbuffer", ""),
		src["pname"],
		src["params"]
	)

	GLvoid(
		"CreateTextures",
		"Returns {@code n} previously unused texture names in {@code textures}, each representing a new texture object.",

		GLenum.IN(
			"target",
			"the texture target",
			"GL11#TEXTURE_1D $TEXTURE_2D_TARGETS $TEXTURE_3D_TARGETS GL31#TEXTURE_BUFFER GL32#TEXTURE_2D_MULTISAMPLE GL32#TEXTURE_2D_MULTISAMPLE_ARRAY"
		),
		AutoSize("textures") _ GLsizei.IN("n", "the number of texture names to create"),
		returnValue _ GLuint_p.OUT("textures", "the buffer in which to store the created texture names")
	)

	val TEXTURE = GLuint.IN("texture", "the texture name")

	src = GL31["TexBuffer"]
	GLvoid(
		"TextureBuffer",
		"DSA version of ${src.javaDocLink}.",

		TEXTURE,
		src["internalformat"],
		src["buffer"]
	)

	src = GL43["TexBufferRange"]
	GLvoid(
		"TextureBufferRange",
		"DSA version of ${src.javaDocLink}.",

		TEXTURE,
		src["internalformat"],
		src["buffer"],
		src["offset"],
		src["size"]
	)

	src = GL42["TexStorage1D"]
	GLvoid(
		"TextureStorage1D",
		"DSA version of ${src.javaDocLink}.",

		TEXTURE,
		src["levels"],
		src["internalformat"],
		src["width"]
	)

	src = GL42["TexStorage2D"]
	GLvoid(
		"TextureStorage2D",
		"DSA version of ${src.javaDocLink}.",

		TEXTURE,
		src["levels"],
		src["internalformat"],
		src["width"],
		src["height"]
	)

	src = GL42["TexStorage3D"]
	GLvoid(
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
	GLvoid(
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
	GLvoid(
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

	src = GL11["TexSubImage1D"]
	GLvoid(
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

	src = GL11["TexSubImage2D"]
	GLvoid(
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

	src = GL12["TexSubImage3D"]
	GLvoid(
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

	src = GL13["CompressedTexSubImage1D"]
	GLvoid(
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

	src = GL13["CompressedTexSubImage2D"]
	GLvoid(
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

	src = GL13["CompressedTexSubImage3D"]
	GLvoid(
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

	src = GL11["CopyTexSubImage1D"]
	GLvoid(
		"CopyTextureSubImage1D",
		"DSA version of ${src.javaDocLink}.",

		TEXTURE,
		src["level"],
		src["xoffset"],
		src["x"],
		src["y"],
		src["width"]
	)

	src = GL11["CopyTexSubImage2D"]
	GLvoid(
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

	src = GL12["CopyTexSubImage3D"]
	GLvoid(
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

	src = GL11["TexParameterf"]
	GLvoid(
		"TextureParameterf",
		"DSA version of ${src.javaDocLink}.",

		TEXTURE,
		src["pname"],
		src["param"]
	)

	src = GL11["TexParameterfv"]
	GLvoid(
		"TextureParameterfv",
		"DSA version of ${src.javaDocLink}.",

		TEXTURE,
		src["pname"],
		src["params"]
	)

	src = GL11["TexParameteri"]
	GLvoid(
		"TextureParameteri",
		"DSA version of ${src.javaDocLink}.",

		TEXTURE,
		src["pname"],
		src["param"]
	)

	src = GL30["TexParameterIiv"]
	GLvoid(
		"TextureParameterIiv",
		"DSA version of ${src.javaDocLink}.",

		TEXTURE,
		src["pname"],
		src["params"]
	)

	src = GL30["TexParameterIuiv"]
	GLvoid(
		"TextureParameterIuiv",
		"DSA version of ${src.javaDocLink}.",

		TEXTURE,
		src["pname"],
		src["params"]
	)

	src = GL11["TexParameteriv"]
	GLvoid(
		"TextureParameteriv",
		"DSA version of ${src.javaDocLink}.",

		TEXTURE,
		src["pname"],
		src["params"]
	)

	src = GL30["GenerateMipmap"]
	GLvoid(
		"GenerateTextureMipmap",
		"DSA version of ${src.javaDocLink}.",

		TEXTURE
	)

	GLvoid(
		"BindTextureUnit",
		"""
		Binds an existing texture object to the texture unit numbered {@code unit}.

		{@code texture} must be zero or the name of an existing texture object. When {@code texture} is the name of an existing texture object, that object is
		bound to the target, in the corresponding texture unit, that was specified when the object was created. When {@code texture} is zero, each of the targets
		enumerated at the beginning of this section is reset to its default texture for the corresponding texture image unit.
		""",

		GLuint.IN("unit", "the texture unit number"),
		TEXTURE
	)

	src = GL11["GetTexImage"]
	GLvoid(
		"GetTextureImage",
		"DSA version of ${src.javaDocLink}.",

		TEXTURE,
		src["level"],
		src["format"],
		src["type"],
		AutoSize("pixels") _ GLsizei.IN("bufSize", "the size of the buffer to receive the retrieved pixel data"),
		src["pixels"]
	)

	src = GL13["GetCompressedTexImage"]
	GLvoid(
		"GetCompressedTextureImage",
		"DSA version of ${src.javaDocLink}.",

		TEXTURE,
		src["level"],
		AutoSize("pixels") _ GLsizei.IN("bufSize", "the size of the buffer to receive the retrieved pixel data"),
		Check(
			expression = "glGetTextureLevelParameteri(texture, level, GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE)", debug = true
		) _ PIXEL_PACK_BUFFER _ GLvoid_p.OUT("pixels", "a buffer in which to return the compressed texture image")
	)

	src = GL11["GetTexLevelParameterfv"]
	GLvoid(
		"GetTextureLevelParameterfv",
		"DSA version of ${src.javaDocLink}.",

		TEXTURE,
		src["level"],
		src["pname"],
		src["params"]
	)

	src = GL11["GetTexLevelParameteriv"]
	GLvoid(
		"GetTextureLevelParameteriv",
		"DSA version of ${src.javaDocLink}.",

		TEXTURE,
		src["level"],
		src["pname"],
		src["params"]
	)

	src = GL11["GetTexParameterfv"]
	GLvoid(
		"GetTextureParameterfv",
		"DSA version of ${src.javaDocLink}.",

		TEXTURE,
		src["pname"],
		src["params"]
	)

	src = GL30["GetTexParameterIiv"]
	GLvoid(
		"GetTextureParameterIiv",
		"DSA version of ${src.javaDocLink}.",

		TEXTURE,
		src["pname"],
		src["params"]
	)

	src = GL30["GetTexParameterIuiv"]
	GLvoid(
		"GetTextureParameterIuiv",
		"DSA version of ${src.javaDocLink}.",

		TEXTURE,
		src["pname"],
		src["params"]
	)

	src = GL11["GetTexParameteriv"]
	GLvoid(
		"GetTextureParameteriv",
		"DSA version of ${src.javaDocLink}.",

		TEXTURE,
		src["pname"],
		src["params"]
	)

	GLvoid(
		"CreateVertexArrays",
		"Returns {@code n} previously unused vertex array object names in {@code arrays}.",

		AutoSize("arrays") _ GLsizei.IN("n", "the number of vertex array object names to create"),
		returnValue _ GLuint_p.OUT("arrays", "the buffer in which to return the created vertex array object names")
	)

	src = GL20["DisableVertexAttribArray"]
	GLvoid(
		"DisableVertexArrayAttrib",
		"DSA version of ${src.javaDocLink}.",

		GLuint.IN("vaobj", "the vertex array object name"),
		src["index"]
	)

	src = GL20["EnableVertexAttribArray"]
	GLvoid(
		"EnableVertexArrayAttrib",
		"DSA version of ${src.javaDocLink}.",

		GLuint.IN("vaobj", "the vertex array object name"),
		src["index"]
	)

	GLvoid(
		"VertexArrayElementBuffer",
		"Binds a buffer object to the element array buffer bind point of a vertex array object.",

		GLuint.IN("vaobj", "the vertex array object name"),
		GLuint.IN("buffer", "the buffer object name. If {@code buffer} is zero, any existing element array buffer binding to {@code vaobj} is removed.")
	)

	src = GL43["BindVertexBuffer"]
	GLvoid(
		"VertexArrayVertexBuffer",
		"DSA version of ${src.javaDocLink}.",

		GLuint.IN("vaobj", "the vertex array object name"),
		src["bindingindex"],
		src["buffer"],
		src["offset"],
		src["stride"]
	)

	src = GL44["BindVertexBuffers"]
	GLvoid(
		"VertexArrayVertexBuffers",
		"DSA version of ${src.javaDocLink}.",

		GLuint.IN("vaobj", "the vertex array object name"),
		src["first"],
		src["count"],
		src["buffers"],
		src["offsets"],
		src["strides"]
	)

	src = GL43["VertexAttribFormat"]
	GLvoid(
		"VertexArrayAttribFormat",
		"DSA version of ${src.javaDocLink}.",

		GLuint.IN("vaobj", "the vertex array object name"),
		src["attribindex"],
		src["size"],
		src["type"],
		src["normalized"],
		src["relativeoffset"]
	)

	src = GL43["VertexAttribIFormat"]
	GLvoid(
		"VertexArrayAttribIFormat",
		"DSA version of ${src.javaDocLink}.",

		GLuint.IN("vaobj", "the vertex array object name"),
		src["attribindex"],
		src["size"],
		src["type"],
		src["relativeoffset"]
	)

	src = GL43["VertexAttribLFormat"]
	GLvoid(
		"VertexArrayAttribLFormat",
		"DSA version of ${src.javaDocLink}.",

		GLuint.IN("vaobj", "the vertex array object name"),
		src["attribindex"],
		src["size"],
		src["type"],
		src["relativeoffset"]
	)

	src = GL43["VertexAttribBinding"]
	GLvoid(
		"VertexArrayAttribBinding",
		"DSA version of ${src.javaDocLink}.",

		GLuint.IN("vaobj", "the vertex array object name"),
		src["attribindex"],
		src["bindingindex"]
	)

	src = GL43["VertexBindingDivisor"]
	GLvoid(
		"VertexArrayBindingDivisor",
		"DSA version of ${src.javaDocLink}.",

		GLuint.IN("vaobj", "the vertex array object name"),
		src["bindingindex"],
		src["divisor"]
	)

	GLvoid(
		"GetVertexArrayiv",
		"Queries parameters of a vertex array object.",

		GLuint.IN("vaobj", "the vertex array object name"),
		GLenum.IN("pname", "the parameter to query", "GL15#ELEMENT_ARRAY_BUFFER_BINDING"),
		Check(1) _ returnValue _ GLint_p.OUT("param", "the buffer in which to return the parameter values")
	)

	GLvoid(
		"GetVertexArrayIndexediv",
		"Queries parameters of an attribute of a vertex array object.",

		GLuint.IN("vaobj", "the vertex array object name"),
		GLuint.IN("index", "the attribute to query"),
		GLenum.IN(
			"pname",
			"the parameter to query",
		    """
		    GL20#VERTEX_ATTRIB_ARRAY_ENABLED GL20#VERTEX_ATTRIB_ARRAY_SIZE, GL20#VERTEX_ATTRIB_ARRAY_STRIDE GL20#VERTEX_ATTRIB_ARRAY_TYPE
		    GL20#VERTEX_ATTRIB_ARRAY_NORMALIZED GL30#VERTEX_ATTRIB_ARRAY_INTEGER GL33#VERTEX_ATTRIB_ARRAY_DIVISOR GL43#VERTEX_ATTRIB_ARRAY_LONG
		    GL43#VERTEX_ATTRIB_RELATIVE_OFFSET
		    """
		),
		Check(1) _ returnValue _ GLint_p.OUT("param", "the buffer in which to return the parameter values")
	)

	GLvoid(
		"GetVertexArrayIndexed64iv",
		"Queries parameters of an attribute of a vertex array object.",

		GLuint.IN("vaobj", "the vertex array object name"),
		GLuint.IN("index", "the attribute to query"),
		GLenum.IN("pname", "the parameter to query", "GL43#VERTEX_BINDING_OFFSET"),
		Check(1) _ returnValue _ GLint64_p.OUT("param", "the buffer in which to return the parameter values")
	)

	GLvoid(
		"CreateSamplers",
		"Returns {@code n} previously unused sampler names in {@code samplers}, each representing a new sampler object.",

		AutoSize("samplers") _ GLsizei.IN("n", "the number of sampler object names to create"),
		returnValue _ GLuint_p.OUT("samplers", "the buffer in which to return the created sampler object names")
	)

	GLvoid(
		"CreateProgramPipelines",
		"Returns {@code n} previously unused program pipeline names in {@code pipelines}, each representing a new program pipeline object.",

		AutoSize("pipelines") _ GLsizei.IN("n", "the number of program pipeline names to create"),
		returnValue _ GLuint_p.OUT("pipelines", "the buffer in which to return the created program pipeline names")
	)

	GLvoid(
		"CreateQueries",
		"Returns {@code n} previously unused query object names in {@code ids}, each representing a new query object with the specified {@code target}.",

		GLenum.IN("target", "the query target", QUERY_TARGETS),
		AutoSize("ids") _ GLsizei.IN("n", "the number of query object names to create"),
		returnValue _ GLuint_p.OUT("ids", "the buffer in which to return the created query object names")
	)

	// ARB_ES3_1_compatibility

	GLvoid(
		"MemoryBarrierByRegion",
		"""
		Behaves like GL42#MemoryBarrier(), with two differences:

		First, it narrows the region under consideration so that only reads/writes of prior fragment shaders that are invoked for a smaller region of the
		framebuffer will be completed/reflected prior to subsequent reads/write of following fragment shaders. The size of the region is implementation
		dependent and may be as small as one framebuffer pixel.

		Second, it only applies to memory transactions that may be read by or written by a fragment shader.

		When barriers is GL42#ALL_BARRIER_BITS, shader memory accesses will be synchronized relative to all these barrier bits, but not to other
		barrier bits specific to GL42#MemoryBarrier(). This implies that reads/writes for scatter/gather-like algorithms may or may not be
		completed/reflected after a MemoryBarrierByRegion command. However, for uses such as deferred shading, where a linked list of visible
		surfaces with the head at a framebuffer address may be constructed, and the entirety of the list is only dependent on previous executions at that
		framebuffer address, MemoryBarrierByRegion may be significantly more efficient than GL42#MemoryBarrier().
		""",

		GLbitfield.IN(
			"barriers",
			"the barriers to insert",
			"""
			GL42#ATOMIC_COUNTER_BARRIER_BIT GL42#FRAMEBUFFER_BARRIER_BIT GL42#SHADER_IMAGE_ACCESS_BARRIER_BIT GL43#SHADER_STORAGE_BARRIER_BIT
			GL42#TEXTURE_FETCH_BARRIER_BIT GL42#UNIFORM_BARRIER_BIT
			""",
			LinkMode.BITFIELD
		)
	)

	// ARB_get_texture_sub_image

	GLvoid(
		"GetTextureSubImage",
		"Obtains sub-regions of a texture image from a texture object.",

		GLuint.IN("texture", "the source texture object name"),
		GLint.IN("level", "the level-of-detail number"),
		GLint.IN("xoffset", "the x-position of the subregion"),
		GLint.IN("yoffset", "the y-position of the subregion"),
		GLint.IN("zoffset", "the z-position of the subregion"),
		GLsizei.IN("width", "the subregion width"),
		GLsizei.IN("height", "the subregion height"),
		GLsizei.IN("depth", "the subregion depth"),
		GLenum.IN("format", "the pixel format", PIXEL_DATA_FORMATS),
		GLenum.IN("type", "the pixel type", PIXEL_DATA_TYPES),
		AutoSize("pixels") _ GLsizei.IN("bufSize", "the size of the buffer to receive the retrieved pixel data"),
		MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE) _ PIXEL_PACK_BUFFER _ GLvoid_p.OUT("pixels", "the buffer in which to place the returned data")
	)

	GLvoid(
		"GetCompressedTextureSubImage",
		"Obtains a sub-region of a compressed texture image.",

		GLuint.IN("texture", "the source texture object name"),
		GLint.IN("level", "the level-of-detail number"),
		GLint.IN("xoffset", "the x-position of the subregion"),
		GLint.IN("yoffset", "the y-position of the subregion"),
		GLint.IN("zoffset", "the z-position of the subregion"),
		GLsizei.IN("width", "the subregion width"),
		GLsizei.IN("height", "the subregion height"),
		GLsizei.IN("depth", "the subregion depth"),
		AutoSize("pixels") _ GLsizei.IN("bufSize", "the size of the buffer to receive the retrieved pixel data"),
		MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE) _ PIXEL_PACK_BUFFER _ GLvoid_p.OUT("pixels", "the buffer in which to place the returned data")
	)

	// ARB_texture_barrier

	GLvoid(
		"TextureBarrier",
		"Guarantees that writes have completed and caches have been invalidated before subsequent Draws are executed."
	)

	// KHR_context_flush_control

	IntConstant(
		"Accepted by the {@code pname} parameter of GetIntegerv, GetFloatv, GetBooleanv GetDoublev and GetInteger64v.",

		"CONTEXT_RELEASE_BEHAVIOR" _ 0x82FB
	)

	IntConstant(
		"Returned in {@code data} by GetIntegerv, GetFloatv, GetBooleanv GetDoublev and GetInteger64v when {@code pname} is #CONTEXT_RELEASE_BEHAVIOR.",

		"CONTEXT_RELEASE_BEHAVIOR_FLUSH" _ 0x82FC
	)

	// KHR_robustness

	IntConstant(
		"Returned by #GetGraphicsResetStatus().",

		"NO_ERROR" _ 0x0000,
		"GUILTY_CONTEXT_RESET" _ 0x8253,
		"INNOCENT_CONTEXT_RESET" _ 0x8254,
		"UNKNOWN_CONTEXT_RESET" _ 0x8255
	)

	IntConstant(
		"Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, and GetFloatv.",

		"CONTEXT_ROBUST_ACCESS" _ 0x90F3,
		"RESET_NOTIFICATION_STRATEGY" _ 0x8256
	)

	IntConstant(
		"Returned by GetIntegerv and related simple queries when {@code value} is #RESET_NOTIFICATION_STRATEGY.",

		"LOSE_CONTEXT_ON_RESET" _ 0x8252,
		"NO_RESET_NOTIFICATION" _ 0x8261
	)

	IntConstant(
		"Returned by GL11#GetError().",

		"CONTEXT_LOST" _ 0x0507
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
			GL11#GetError() and GetGraphicsResetStatus behave normally following a graphics reset, so that the application can determine a reset has
			occurred, and when it is safe to destroy and recreate the context.
			""",
			"""
		    Any commands which might cause a polling application to block indefinitely will generate a CONTEXT_LOST error, but will also return a value
		    indicating completion to the application.
		    """
		)}
		"""
	)

	GLvoid(
		"ReadnPixels",
		"Behaves identically to GL11#ReadPixels() except that it does not write more than {@code bufSize} bytes into {@code data}",

		GLint.IN("x", "the left pixel coordinate"),
		GLint.IN("y", "the lower pixel coordinate"),
		GLsizei.IN("width", "the number of pixels to read in the x-dimension"),
		GLsizei.IN("height", "the number of pixels to read in the y-dimension"),
		GLenum.IN("format", "the pixel format", PIXEL_DATA_FORMATS),
		GLenum.IN("type", "the pixel type", PIXEL_DATA_TYPES),
		AutoSize("pixels") _ GLsizei.IN("bufSize", "the maximum number of bytes to write into {@code data}"),
		MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT) _ PIXEL_PACK_BUFFER _ GLvoid_p.OUT("pixels", "a buffer in which to place the returned pixel data")
	)

	GLvoid(
		"GetnUniformfv",
		"Returns the value or values of a uniform of the default uniform block.",

		GLuint.IN("program", "the program object"),
		GLint.IN("location", "the uniform location"),
		AutoSize("params") _ GLsizei.IN("bufSize", "the maximum number of bytes to write to {@code params}"),
		GLfloat_p.OUT("params", "the buffer in which to place the returned data")
	)

	GLvoid(
		"GetnUniformiv",
		"Integer version of #GetnUniformfv().",

		GLuint.IN("program", "the program object"),
		GLint.IN("location", "the uniform location"),
		AutoSize("params") _ GLsizei.IN("bufSize", "the maximum number of bytes to write to {@code params}"),
		GLfloat_p.OUT("params", "the buffer in which to place the returned data")
	)

	GLvoid(
		"GetnUniformuiv",
		"Unsigned version of #GetnUniformiv().",

		GLuint.IN("program", "the program object"),
		GLint.IN("location", "the uniform location"),
		AutoSize("params") _ GLsizei.IN("bufSize", "the maximum number of bytes to write to {@code params}"),
		GLfloat_p.OUT("params", "the buffer in which to place the returned data")
	)
}