/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_framebuffer_object = "ARBFramebufferObject".nativeClassGL("ARB_framebuffer_object") {
	javaImport (
		"org.lwjgl.system.windows.*",
		"org.lwjgl.system.linux.*"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		ARB_framebuffer_object is an extension intended to address the following goals:
		${ul(
			"Reflect FBO-related functionality found in the OpenGL 3.0 specification.",
		    """
		    Integrate multiple disjoint extensions into a single ARB extension. These extensions are:
		    ${ul(
			    registryLinkTo("EXT", "framebuffer_object"),
			    registryLinkTo("EXT", "framebuffer_blit"),
			    registryLinkTo("EXT", "framebuffer_multisample"),
			    registryLinkTo("EXT", "packed_depth_stencil")
		    )}
		    """,
		    """
		    Where appropriate, relax some of the constraints expressed by previous FBO-related extensions. In particular the requirement of matching attachment
		    dimensions and component sizes has been relaxed, to allow implementations the freedom to support more flexible usages where possible.
		    """
		)}
		ARB_framebuffer_object defines an interface for drawing to rendering destinations other than the buffers provided to the GL by the window-system.

		In this extension, these newly defined rendering destinations are known collectively as "framebuffer-attachable images". This extension provides a
		mechanism for attaching framebuffer-attachable images to the GL framebuffer as one of the standard GL logical buffers: color, depth, and stencil.
		(Attaching a framebuffer-attachable image to the accum logical buffer is left for a future extension to define). When a framebuffer-attachable image is
		attached to the framebuffer, it is used as the source and destination of fragment operations as described in Chapter 4.

		By allowing the use of a framebuffer-attachable image as a rendering destination, this extension enables a form of "offscreen" rendering. Furthermore,
		"render to texture" is supported by allowing the images of a texture to be used as framebuffer-attachable images. A particular image of a texture object
		is selected for use as a framebuffer-attachable image by specifying the mipmap level, cube map face (for a cube map texture), and layer (for a 3D
		texture) that identifies the image. The "render to texture" semantics of this extension are similar to performing traditional rendering to the
		framebuffer, followed immediately by a call to CopyTexSubImage. However, by using this extension instead, an application can achieve the same
		effect, but with the advantage that the GL can usually eliminate the data copy that would have been incurred by calling CopyTexSubImage.

		This extension also defines a new GL object type, called a "renderbuffer", which encapsulates a single 2D pixel image. The image of renderbuffer can be
		used as a framebuffer-attachable image for generalized offscreen rendering and it also provides a means to support rendering to GL logical buffer types
		which have no corresponding texture format (stencil, accum, etc). A renderbuffer is similar to a texture in that both renderbuffers and textures can be
		independently allocated and shared among multiple contexts. The framework defined by this extension is general enough that support for attaching images
		from GL objects other than textures and renderbuffers could be added by layered extensions.

		To facilitate efficient switching between collections of framebuffer-attachable images, this extension introduces another new GL object, called a
		framebuffer object. A framebuffer object contains the state that defines the traditional GL framebuffer, including its set of images. Prior to this
		extension, it was the window-system which defined and managed this collection of images, traditionally by grouping them into a "drawable". The
		window-system API's would also provide a function (i.e., WGL##wglMakeCurrent, GLX##glXMakeCurrent, aglSetDrawable, etc.) to bind a drawable with a GL
		context (as is done in the ${WGL_ARB_pbuffer.link} extension). In this extension however, this functionality is subsumed by the GL and the GL provides
		the function BindFramebuffer to bind a framebuffer object to the current context. Later, the context can bind back to the window-system-provided
		framebuffer in order to display rendered content.

		Previous extensions that enabled rendering to a texture have been much more complicated. One example is the combination of {@code ARB_pbuffer} and
		{@code ARB_render_texture}, both of which are window-system extensions. This combination requires calling {@code MakeCurrent}, an operation that may be
		expensive, to switch between the window and the pbuffer drawables. An application must create one pbuffer per renderable texture in order to portably
		use {@code ARB_render_texture}. An application must maintain at least one GL context per texture format, because each context can only operate on a
		single pixelformat or {@code FBConfig}. All of these characteristics make {@code ARB_render_texture} both inefficient and cumbersome to use.

		ARB_framebuffer_object, on the other hand, is both simpler to use and more efficient than ARB_render_texture. The ARB_framebuffer_object API is
		contained wholly within the GL API and has no (non-portable) window-system components. Under ARB_framebuffer_object, it is not necessary to create a
		second GL context when rendering to a texture image whose format differs from that of the window. Finally, unlike the pbuffers of
		{@code ARB_render_texture}, a single framebuffer object can facilitate rendering to an unlimited number of texture objects.

		This extension differs from EXT_framebuffer_object by splitting the framebuffer object binding point into separate DRAW and READ bindings (incorporating
		functionality introduced by EXT_framebuffer_blit). This allows copying directly from one framebuffer to another. In addition, a new high performance
		blit function is added to facilitate these blits and perform some data conversion where allowed.

		This extension also enables usage of multisampling in conjunction with renderbuffers (incorporating functionality from EXT_packed_depth_stencil), as
		follows:

		The new operation RenderbufferStorageMultisample() allocates storage for a renderbuffer object that can be used as a multisample buffer. A multisample
		render buffer image differs from a single-sample render buffer image in that a multisample image has a number of GL13#SAMPLES that is greater than zero.
		No method is provided for creating multisample texture images.

		All of the framebuffer-attachable images attached to a framebuffer object must have the same number of GL13#SAMPLES or else the framebuffer object is
		not "framebuffer complete". If a framebuffer object with multisample attachments is "framebuffer complete", then the framebuffer object behaves as if
		GL13#SAMPLE_BUFFERS is one.

		In traditional multisample rendering, where #DRAW_FRAMEBUFFER_BINDING is zero and GL13#SAMPLE_BUFFERS is one, the GL spec states that "the color sample
		values are resolved to a single, displayable color each time a pixel is updated." There are, however, several modern hardware implementations that do
		not actually resolve for each sample update, but instead postpones the resolve operation to a later time and resolve a batch of sample updates at a
		time. This is OK as long as the implementation behaves "as if" it had resolved a sample-at-a-time. Unfortunately, however, honoring the "as if" rule can
		sometimes degrade performance.

		In contrast, when #DRAW_FRAMEBUFFER_BINDING is an application-created framebuffer object, GL13#MULTISAMPLE is enabled, and GL13#SAMPLE_BUFFERS is one,
		there is no implicit per-sample-update resolve. Instead, the application explicitly controls when the resolve operation is performed. The resolve
		operation is affected by calling BlitFramebuffer where the source is a multisample application-created framebuffer object and the destination is a
		single-sample framebuffer object (either application-created or window-system provided).

		This design for multisample resolve more closely matches current hardware, but still permits implementations which choose to resolve a single sample at
		a time. If hardware that implements the multisample resolution "one sample at a time" exposes ARB_framebuffer_object, it could perform the implicit
		resolve to a driver-managed hidden surface, then read from that surface when the application calls BlitFramebuffer.

		Another motivation for granting the application explicit control over the multisample resolve operation has to do with the flexibility afforded by
		ARB_framebuffer_object. Previously, a drawable (window or pbuffer) had exclusive access to all of its buffers. There was no mechanism for sharing a
		buffer across multiple drawables. Under ARB_framebuffer_object, however, a mechanism exists for sharing a framebuffer-attachable image across several
		framebuffer objects, as well as sharing an image between a framebuffer object and a texture. If we had retained the "implicit" resolve from traditional
		multisampled rendering, and allowed the creation of "multisample" format renderbuffers, then this type of sharing would have lead to two problematic
		situations:
		${ul(
			"Two contexts, which shared renderbuffers, might perform competing resolve operations into the same single-sample buffer with ambiguous results.",
			"It would have introduced the unfortunate ability to use the single-sample buffer as a texture while GL13#MULTISAMPLE is enabled."
		)}

		Using #BlitFramebuffer() as an explicit resolve to serialize access to the multisampled contents and eliminate the implicit per-sample resolve operation, we avoid both of these problems.

		This extension also enables usage of packed depth-stencil formats in renderbuffers (incorporating functionality from EXT_packed_depth_stencil), as
		follows:

		Many OpenGL implementations have chosen to interleave the depth and stencil buffers into one buffer, often with 24 bits of depth precision and 8 bits of
		stencil data. 32 bits is more than is needed for the depth buffer much of the time; a 24-bit depth buffer, on the other hand, requires that reads and
		writes of depth data be unaligned with respect to power-of-two boundaries. On the other hand, 8 bits of stencil data is more than sufficient for most
		applications, so it is only natural to pack the two buffers into a single buffer with both depth and stencil data. OpenGL never provides direct access
		to the buffers, so the OpenGL implementation can provide an interface to applications where it appears the one merged buffer is composed of two logical buffers.

		One disadvantage of this scheme is that OpenGL lacks any means by which this packed data can be handled efficiently. For example, when an application
		reads from the 24-bit depth buffer, using the type GL11#UNSIGNED_SHORT will lose 8 bits of data, while GL11#UNSIGNED_INT has 8 too many. Both require
		expensive format conversion operations. A 24-bit format would be no more suitable, because it would also suffer from the unaligned memory accesses that
		made the standalone 24-bit depth buffer an unattractive proposition in the first place.

		Many applications, such as parallel rendering applications, may also wish to draw to or read back from both the depth and stencil buffers at the same
		time. Currently this requires two separate operations, reducing performance. Since the buffers are interleaved, drawing to or reading from both should
		be no more expensive than using just one; in some cases, it may even be cheaper.

		This extension provides a new data format, #DEPTH_STENCIL, that can be used with the GL11#DrawPixels(), GL11#ReadPixels(), and GL11#CopyPixels()
		commands, as well as a packed data type, #UNSIGNED_INT_24_8, that is meant to be used with #DEPTH_STENCIL. No other data types are supported with
		#DEPTH_STENCIL. If ${ARB_depth_texture.link} or SGIX_depth_texture is supported, #DEPTH_STENCIL/#UNSIGNED_INT_24_8 data can also be used for textures;
		this provides a more efficient way to supply data for a 24-bit depth texture.

		#DEPTH_STENCIL data, when passed through the pixel path, undergoes both depth and stencil operations. The depth data is scaled and biased by the current
		GL11#DEPTH_SCALE and GL11#DEPTH_BIAS, while the stencil data is shifted and offset by the current GL11#INDEX_SHIFT and GL11#INDEX_OFFSET. The stencil
		data is also put through the stencil-to-stencil pixel map.

		GL11#DrawPixels() of #DEPTH_STENCIL data operates similarly to that of GL11#STENCIL_INDEX data, bypassing the OpenGL fragment pipeline entirely, unlike
		the treatment of GL11#DEPTH_COMPONENT data. The stencil and depth masks are applied, as are the pixel ownership and scissor tests, but all other
		operations are skipped.

		GL11#ReadPixels() of #DEPTH_STENCIL data reads back a rectangle from both the depth and stencil buffers.

		GL11#CopyPixels() of #DEPTH_STENCIL data copies a rectangle from both the depth and stencil buffers. Like glDrawPixels, it applies both the stencil and
		depth masks but skips the remainder of the OpenGL fragment pipeline.

		glTex[Sub]Image[1,2,3]D of #DEPTH_STENCIL data loads depth and stencil data into a depth_stencil texture. GL11##GetTexImage() of #DEPTH_STENCIL data can
		be used to retrieve depth and stencil data from a depth/stencil texture.

		In addition, a new base internal format, #DEPTH_STENCIL, can be used by both texture images and renderbuffer storage. When an image with a
		#DEPTH_STENCIL internal format is attached to both the depth and stencil attachment points of a framebuffer object, then it becomes both the depth and
		stencil buffers of the framebuffer. This fits nicely with hardware that interleaves both depth and stencil data into a single buffer. When a texture
		with #DEPTH_STENCIL data is bound for texturing, only the depth component is accessible through the texture fetcher. The stencil data can be written
		with TexImage or CopyTexImage, and can be read with GL11#GetTexImage(). When a #DEPTH_STENCIL image is attached to the stencil attachment of the bound
		framebuffer object, the stencil data can be accessed through any operation that reads from or writes to the framebuffer's stencil buffer.

		Glossary of Helpful Terms
		${ul(
			"<b>logical buffer</b> &ndash; One of the color, depth, or stencil buffers of the framebuffer.",
		    "framebuffer: The collection of logical buffers and associated state defining where the output of GL rendering is directed.",
		    """
		    texture: an object which consists of one or more 2D arrays of pixel images and associated state that can be used as a source of data during the texture-mapping process.
		    """,
		    """
		    <b>texture image</b> &ndash; one of the 2D arrays of pixels that are part of a texture object. Texture images contain and define the texels of the
		    texture object.
		    """,
		    """
		    <b>renderbuffer</b> &ndash; A new type of storage object which contains a single 2D array of pixels and associated state that can be used as a
		    destination for pixel data written during the rendering process.
		    """,
		    """
		    <b>renderbuffer image</b> &ndash; The 2D array of pixels that is part of a renderbuffer object. A renderbuffer image contains and defines the pixels
		    of the renderbuffer object.
		    """,
		    """
		    <b>framebuffer-attachable image</b> &ndash; A 2D pixel image that can be attached to one of the logical buffer attachment points of a framebuffer
		    object. Texture images and renderbuffer images are two examples of framebuffer-attachable images.
		    """,
		    """
		    <b>attachment point</b> &ndash; The set of state which references a specific framebuffer-attachable image, and allows that framebuffer-attachable
		    image to be used to store the contents of a logical buffer of a framebuffer object. There is an attachment point state vector for each color, depth,
		    and stencil buffer of a framebuffer.
		    """,
		    """
		    <b>attach</b> &ndash; The act of connecting one object to another object.

            An "attach" operation is similar to a "bind" operation in that both represent a reference to the attached or bound object for the purpose of
            managing object lifetimes and both enable manipulation of the state of the attached or bound object.

			However, an "attach" is also different from a "bind" in that "binding" an unused object creates a new object, while "attaching" does not.
			Additionally, "bind" establishes a connection between a context and an object, while "attach" establishes a connection between two objects.

			Finally, if object "A" is attached to object "B" and object "B" is bound to context "C", then in most respects, we treat "A" as if it is
			<em>implicitly</em> bound to "C".
		    """,
		    """
		    <b>framebuffer attachment completeness</b> &ndash; Similar to texture "mipmap" or "cube" completeness, defines a minimum set of criteria for
		    framebuffer attachment points.
		    """,
		    """
		    <b>framebuffer completeness</b> &ndash; Similar to texture "mipmap cube completeness", defines a composite set of "completeness" requirements and
		    relationships among the attached framebuffer-attachable images.
		    """
		)}
		${GL30.promoted}
		"""

	IntConstant(
		"""
		Accepted by the {@code target} parameter of BindFramebuffer, CheckFramebufferStatus, FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and
		GetFramebufferAttachmentParameteriv.
		""",

		"FRAMEBUFFER" _ 0x8D40,
		"READ_FRAMEBUFFER" _ 0x8CA8,
		"DRAW_FRAMEBUFFER" _ 0x8CA9
	)

	IntConstant(
		"""
		Accepted by the {@code target} parameter of BindRenderbuffer, RenderbufferStorage, and GetRenderbufferParameteriv, and returned by
		GetFramebufferAttachmentParameteriv.
		""",

		"RENDERBUFFER" _ 0x8D41
	)

	IntConstant(
		"Accepted by the {@code internalformat} parameter of RenderbufferStorage.",

		"STENCIL_INDEX1" _ 0x8D46,
		"STENCIL_INDEX4" _ 0x8D47,
		"STENCIL_INDEX8" _ 0x8D48,
		"STENCIL_INDEX16" _ 0x8D49
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetRenderbufferParameteriv.",

		"RENDERBUFFER_WIDTH" _ 0x8D42,
		"RENDERBUFFER_HEIGHT" _ 0x8D43,
		"RENDERBUFFER_INTERNAL_FORMAT" _ 0x8D44,
		"RENDERBUFFER_RED_SIZE" _ 0x8D50,
		"RENDERBUFFER_GREEN_SIZE" _ 0x8D51,
		"RENDERBUFFER_BLUE_SIZE" _ 0x8D52,
		"RENDERBUFFER_ALPHA_SIZE" _ 0x8D53,
		"RENDERBUFFER_DEPTH_SIZE" _ 0x8D54,
		"RENDERBUFFER_STENCIL_SIZE" _ 0x8D55,
		"RENDERBUFFER_SAMPLES" _ 0x8CAB
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv.",

		"FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE" _ 0x8CD0,
		"FRAMEBUFFER_ATTACHMENT_OBJECT_NAME" _ 0x8CD1,
		"FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL" _ 0x8CD2,
		"FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE" _ 0x8CD3,
		"FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER" _ 0x8CD4,
		"FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING" _ 0x8210,
		"FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE" _ 0x8211,
		"FRAMEBUFFER_ATTACHMENT_RED_SIZE" _ 0x8212,
		"FRAMEBUFFER_ATTACHMENT_GREEN_SIZE" _ 0x8213,
		"FRAMEBUFFER_ATTACHMENT_BLUE_SIZE" _ 0x8214,
		"FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE" _ 0x8215,
		"FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE" _ 0x8216,
		"FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE" _ 0x8217
	)

	IntConstant(
		"Returned in {@code params} by GetFramebufferAttachmentParameteriv.",

		"FRAMEBUFFER_DEFAULT" _ 0x8218,
		"INDEX" _ 0x8222
	)

	IntConstant(
		"Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.",

		"COLOR_ATTACHMENT0" _ 0x8CE0,
		"COLOR_ATTACHMENT1" _ 0x8CE1,
		"COLOR_ATTACHMENT2" _ 0x8CE2,
		"COLOR_ATTACHMENT3" _ 0x8CE3,
		"COLOR_ATTACHMENT4" _ 0x8CE4,
		"COLOR_ATTACHMENT5" _ 0x8CE5,
		"COLOR_ATTACHMENT6" _ 0x8CE6,
		"COLOR_ATTACHMENT7" _ 0x8CE7,
		"COLOR_ATTACHMENT8" _ 0x8CE8,
		"COLOR_ATTACHMENT9" _ 0x8CE9,
		"COLOR_ATTACHMENT10" _ 0x8CEA,
		"COLOR_ATTACHMENT11" _ 0x8CEB,
		"COLOR_ATTACHMENT12" _ 0x8CEC,
		"COLOR_ATTACHMENT13" _ 0x8CED,
		"COLOR_ATTACHMENT14" _ 0x8CEE,
		"COLOR_ATTACHMENT15" _ 0x8CEF,
		"DEPTH_ATTACHMENT" _ 0x8D00,
		"STENCIL_ATTACHMENT" _ 0x8D20,
		"DEPTH_STENCIL_ATTACHMENT" _ 0x821A
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"MAX_SAMPLES" _ 0x8D57
	)

	IntConstant(
		"Returned by CheckFramebufferStatus().",

		"FRAMEBUFFER_COMPLETE" _ 0x8CD5,
		"FRAMEBUFFER_INCOMPLETE_ATTACHMENT" _ 0x8CD6,
		"FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT" _ 0x8CD7,
		"FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER" _ 0x8CDB,
		"FRAMEBUFFER_INCOMPLETE_READ_BUFFER" _ 0x8CDC,
		"FRAMEBUFFER_UNSUPPORTED" _ 0x8CDD,
		"FRAMEBUFFER_INCOMPLETE_MULTISAMPLE" _ 0x8D56,
		"FRAMEBUFFER_UNDEFINED" _ 0x8219
	)

	IntConstant(
		"Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv,  and GetDoublev.",

		"FRAMEBUFFER_BINDING" _ 0x8CA6,
		"DRAW_FRAMEBUFFER_BINDING" _ 0x8CA6,
		"READ_FRAMEBUFFER_BINDING" _ 0x8CAA,
		"RENDERBUFFER_BINDING" _ 0x8CA7,
		"MAX_COLOR_ATTACHMENTS" _ 0x8CDF,
		"MAX_RENDERBUFFER_SIZE" _ 0x84E8
	)

	IntConstant(
		"Returned by GetError().",

		"INVALID_FRAMEBUFFER_OPERATION" _ 0x0506
	)

	IntConstant(
		"""
		Accepted by the {@code format} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and
		GetTexImage, by the {@code type} parameter of CopyPixels, by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D,
		CopyTexImage2D, and RenderbufferStorage, and returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameteriv.
		""",

		"DEPTH_STENCIL" _ 0x84F9
	)

	IntConstant(
		"""
		Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and
		GetTexImage.
		""",

		"UNSIGNED_INT_24_8" _ 0x84FA
	)

	IntConstant(
		"""
		Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage, and
		returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameteriv.
		""",

		"DEPTH24_STENCIL8" _ 0x88F0
	)

	IntConstant(
		"Accepted by the {@code value} parameter of GetTexLevelParameter.",

		"TEXTURE_STENCIL_SIZE" _ 0x88F1
	)

	GL30 reuse "IsRenderbuffer"
	GL30 reuse "BindRenderbuffer"
	GL30 reuse "DeleteRenderbuffers"
	GL30 reuse "GenRenderbuffers"
	GL30 reuse "RenderbufferStorage"
	GL30 reuse "RenderbufferStorageMultisample"
	GL30 reuse "GetRenderbufferParameteriv"
	GL30 reuse "IsFramebuffer"
	GL30 reuse "BindFramebuffer"
	GL30 reuse "DeleteFramebuffers"
	GL30 reuse "GenFramebuffers"
	GL30 reuse "CheckFramebufferStatus"
	GL30 reuse "FramebufferTexture1D"
	GL30 reuse "FramebufferTexture2D"
	GL30 reuse "FramebufferTexture3D"
	GL30 reuse "FramebufferTextureLayer"
	GL30 reuse "FramebufferRenderbuffer"
	GL30 reuse "GetFramebufferAttachmentParameteriv"
	GL30 reuse "BlitFramebuffer"
	GL30 reuse "GenerateMipmap"
}