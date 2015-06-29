/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_framebuffer_object = "EXTFramebufferObject".nativeClassGL("EXT_framebuffer_object", postfix = EXT) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension defines a simple interface for drawing to rendering destinations other than the buffers provided to the GL by the window-system.

		In this extension, these newly defined rendering destinations are known collectively as "framebuffer-attachable images". This extension provides a
		mechanism for attaching framebuffer-attachable images to the GL framebuffer as one of the standard GL logical buffers: color, depth, and stencil.
		(Attaching a framebuffer-attachable image to the accum logical buffer is left for a future extension to define). When a framebuffer-attachable image is
		attached to the framebuffer, it is used as the source and destination of fragment operations.

		By allowing the use of a framebuffer-attachable image as a rendering destination, this extension enables a form of "offscreen" rendering. Furthermore,
		"render to texture" is supported by allowing the images of a texture to be used as framebuffer-attachable images. A particular image of a texture object
		is selected for use as a framebuffer-attachable image by specifying the mipmap level, cube map face (for a cube map texture), and z-offset (for a 3D
		texture) that identifies the image. The "render to texture" semantics of this extension are similar to performing traditional rendering to the
		framebuffer, followed immediately by a call to CopyTexSubImage. However, by using this extension instead, an application can achieve the same effect,
		but with the advantage that the GL can usually eliminate the data copy that would have been incurred by calling CopyTexSubImage.

		This extension also defines a new GL object type, called a "renderbuffer", which encapsulates a single 2D pixel image. The image of renderbuffer can be
		used as a framebuffer-attachable image for generalized offscreen rendering and it also provides a means to support rendering to GL logical buffer types
		which have no corresponding texture format (stencil, accum, etc). A renderbuffer is similar to a texture in that both renderbuffers and textures can be
		independently allocated and shared among multiple contexts. The framework defined by this extension is general enough that support for attaching images
		from GL objects other than textures and renderbuffers could be added by layered extensions.

		To facilitate efficient switching between collections of framebuffer-attachable images, this extension introduces another new GL object, called a
		framebuffer object. A framebuffer object contains the state that defines the traditional GL framebuffer, including its set of images. Prior to this
		extension, it was the window-system which defined and managed this collection of images, traditionally by grouping them into a "drawable". The
		window-system API's would also provide a function (i.e., wglMakeCurrent, glXMakeCurrent, aglSetDrawable, etc.) to bind a drawable with a GL context (as
		is done in the WGL_ARB_pbuffer extension). In this extension however, this functionality is subsumed by the GL and the GL provides the function
		BindFramebufferEXT to bind a framebuffer object to the current context. Later, the context can bind back to the window-system-provided framebuffer in
		order to display rendered content.

		Previous extensions that enabled rendering to a texture have been much more complicated. One example is the combination of ARB_pbuffer and
		ARB_render_texture, both of which are window-system extensions. This combination requires calling MakeCurrent, an operation that may be expensive, to
		switch between the window and the pbuffer drawables. An application must create one pbuffer per renderable texture in order to portably use
		ARB_render_texture. An application must maintain at least one GL context per texture format, because each context can only operate on a single
		pixelformat or FBConfig. All of these characteristics make ARB_render_texture both inefficient and cumbersome to use.

		EXT_framebuffer_object, on the other hand, is both simpler to use and more efficient than ARB_render_texture. The EXT_framebuffer_object API is
		contained wholly within the GL API and has no (non-portable) window-system components. Under EXT_framebuffer_object, it is not necessary to create a
		second GL context when rendering to a texture image whose format differs from that of the window. Finally, unlike the pbuffers of ARB_render_texture, a
		single framebuffer object can facilitate rendering to an unlimited number of texture objects.

		${GL30.promoted}
		"""

	IntConstant(
		"""
		Accepted by the {@code target} parameter of BindFramebufferEXT, CheckFramebufferStatusEXT, FramebufferTexture{1D|2D|3D}EXT, FramebufferRenderbufferEXT,
		and GetFramebufferAttachmentParameterivEXT.
		""",

		"FRAMEBUFFER_EXT" _ 0x8D40
	)

	IntConstant(
		"""
		Accepted by the {@code target} parameter of BindRenderbufferEXT, RenderbufferStorageEXT, and GetRenderbufferParameterivEXT, and returned by
		GetFramebufferAttachmentParameterivEXT.
		""",

		"RENDERBUFFER_EXT" _ 0x8D41
	)

	IntConstant(
		"Accepted by the {@code internalformat} parameter of RenderbufferStorageEXT.",

		"STENCIL_INDEX1_EXT" _ 0x8D46,
		"STENCIL_INDEX4_EXT" _ 0x8D47,
		"STENCIL_INDEX8_EXT" _ 0x8D48,
		"STENCIL_INDEX16_EXT" _ 0x8D49
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetRenderbufferParameterivEXT.",

		"RENDERBUFFER_WIDTH_EXT" _ 0x8D42,
		"RENDERBUFFER_HEIGHT_EXT" _ 0x8D43,
		"RENDERBUFFER_INTERNAL_FORMAT_EXT" _ 0x8D44,
		"RENDERBUFFER_RED_SIZE_EXT" _ 0x8D50,
		"RENDERBUFFER_GREEN_SIZE_EXT" _ 0x8D51,
		"RENDERBUFFER_BLUE_SIZE_EXT" _ 0x8D52,
		"RENDERBUFFER_ALPHA_SIZE_EXT" _ 0x8D53,
		"RENDERBUFFER_DEPTH_SIZE_EXT" _ 0x8D54,
		"RENDERBUFFER_STENCIL_SIZE_EXT" _ 0x8D55
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameterivEXT.",

		"FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE_EXT" _ 0x8CD0,
		"FRAMEBUFFER_ATTACHMENT_OBJECT_NAME_EXT" _ 0x8CD1,
		"FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL_EXT" _ 0x8CD2,
		"FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE_EXT" _ 0x8CD3,
		"FRAMEBUFFER_ATTACHMENT_TEXTURE_3D_ZOFFSET_EXT" _ 0x8CD4
	)

	IntConstant(
		"""
		Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}EXT, FramebufferRenderbufferEXT, and GetFramebufferAttachmentParameterivEXT.
		""",

		"COLOR_ATTACHMENT0_EXT" _ 0x8CE0,
		"COLOR_ATTACHMENT1_EXT" _ 0x8CE1,
		"COLOR_ATTACHMENT2_EXT" _ 0x8CE2,
		"COLOR_ATTACHMENT3_EXT" _ 0x8CE3,
		"COLOR_ATTACHMENT4_EXT" _ 0x8CE4,
		"COLOR_ATTACHMENT5_EXT" _ 0x8CE5,
		"COLOR_ATTACHMENT6_EXT" _ 0x8CE6,
		"COLOR_ATTACHMENT7_EXT" _ 0x8CE7,
		"COLOR_ATTACHMENT8_EXT" _ 0x8CE8,
		"COLOR_ATTACHMENT9_EXT" _ 0x8CE9,
		"COLOR_ATTACHMENT10_EXT" _ 0x8CEA,
		"COLOR_ATTACHMENT11_EXT" _ 0x8CEB,
		"COLOR_ATTACHMENT12_EXT" _ 0x8CEC,
		"COLOR_ATTACHMENT13_EXT" _ 0x8CED,
		"COLOR_ATTACHMENT14_EXT" _ 0x8CEE,
		"COLOR_ATTACHMENT15_EXT" _ 0x8CEF,
		"DEPTH_ATTACHMENT_EXT" _ 0x8D00,
		"STENCIL_ATTACHMENT_EXT" _ 0x8D20
	)

	IntConstant(
		"Returned by CheckFramebufferStatusEXT().",

		"FRAMEBUFFER_COMPLETE_EXT" _ 0x8CD5,
		"FRAMEBUFFER_INCOMPLETE_ATTACHMENT_EXT" _ 0x8CD6,
		"FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT_EXT" _ 0x8CD7,
		"FRAMEBUFFER_INCOMPLETE_DIMENSIONS_EXT" _ 0x8CD9,
		"FRAMEBUFFER_INCOMPLETE_FORMATS_EXT" _ 0x8CDA,
		"FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER_EXT" _ 0x8CDB,
		"FRAMEBUFFER_INCOMPLETE_READ_BUFFER_EXT" _ 0x8CDC,
		"FRAMEBUFFER_UNSUPPORTED_EXT" _ 0x8CDD
	)

	IntConstant(
		"Accepted by GetIntegerv().",

		"FRAMEBUFFER_BINDING_EXT" _ 0x8CA6,
		"RENDERBUFFER_BINDING_EXT" _ 0x8CA7,
		"MAX_COLOR_ATTACHMENTS_EXT" _ 0x8CDF,
		"MAX_RENDERBUFFER_SIZE_EXT" _ 0x84E8
	)

	IntConstant(
		"Returned by GetError().",

		"INVALID_FRAMEBUFFER_OPERATION_EXT" _ 0x0506
	)

	GLboolean(
		"IsRenderbufferEXT",
		"",

		GLuint.IN("renderbuffer", "")
	)

	GLvoid(
		"BindRenderbufferEXT",
		"",

		GLenum.IN("target", ""),
		GLuint.IN("renderbuffer", "")
	)

	GLvoid(
		"DeleteRenderbuffersEXT",
		"",

		AutoSize("renderbuffers") _ GLsizei.IN("n", ""),
		const _ SingleValue("renderbuffer") _ GLuint_p.IN("renderbuffers", "")
	)

	GLvoid(
		"GenRenderbuffersEXT",
		"",

		AutoSize("renderbuffers") _ GLsizei.IN("n", ""),
		returnValue _ GLuint_p.OUT("renderbuffers", "")
	)

	GLvoid(
		"RenderbufferStorageEXT",
		"",

		GLenum.IN("target", ""),
		GLenum.IN("internalformat", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", "")
	)

	GLvoid(
		"GetRenderbufferParameterivEXT",
		"",

		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		Check(1) _ returnValue _ GLint_p.OUT("params", "")
	)

	GLboolean(
		"IsFramebufferEXT",
		"",

		GLuint.IN("framebuffer", "")
	)

	GLvoid(
		"BindFramebufferEXT",
		"",

		GLenum.IN("target", ""),
		GLuint.IN("framebuffer", "")
	)

	GLvoid(
		"DeleteFramebuffersEXT",
		"",

		AutoSize("framebuffers") _ GLsizei.IN("n", ""),
		const _ SingleValue("framebuffer") _ GLuint_p.IN("framebuffers", "")
	)

	GLvoid(
		"GenFramebuffersEXT",
		"",

		AutoSize("framebuffers") _ GLsizei.IN("n", ""),
		returnValue _ GLuint_p.OUT("framebuffers", "")
	)

	GLenum(
		"CheckFramebufferStatusEXT",
		"",

		GLenum.IN("target", "")
	)

	GLvoid(
		"FramebufferTexture1DEXT",
		"",

		GLenum.IN("target", ""),
		GLenum.IN("attachment", ""),
		GLenum.IN("textarget", ""),
		GLuint.IN("texture", ""),
		GLint.IN("level", "")
	)

	GLvoid(
		"FramebufferTexture2DEXT",
		"",

		GLenum.IN("target", ""),
		GLenum.IN("attachment", ""),
		GLenum.IN("textarget", ""),
		GLuint.IN("texture", ""),
		GLint.IN("level", "")
	)

	GLvoid(
		"FramebufferTexture3DEXT",
		"",

		GLenum.IN("target", ""),
		GLenum.IN("attachment", ""),
		GLenum.IN("textarget", ""),
		GLuint.IN("texture", ""),
		GLint.IN("level", ""),
		GLint.IN("zoffset", "")
	)

	GLvoid(
		"FramebufferRenderbufferEXT",
		"",

		GLenum.IN("target", ""),
		GLenum.IN("attachment", ""),
		GLenum.IN("renderbuffertarget", ""),
		GLuint.IN("renderbuffer", "")
	)

	GLvoid(
		"GetFramebufferAttachmentParameterivEXT",
		"",

		GLenum.IN("target", ""),
		GLenum.IN("attachment", ""),
		GLenum.IN("pname", ""),
		Check(1) _ returnValue _ GLint_p.OUT("params", "")
	)

	GLvoid(
		"GenerateMipmapEXT",
		"",

		GLenum.IN("target", "")
	)
}