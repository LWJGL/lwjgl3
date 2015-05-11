/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_framebuffer_no_attachments = "ARBFramebufferNoAttachments".nativeClassGL("ARB_framebuffer_no_attachments") {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		Framebuffer objects as introduced by ${ARB_framebuffer_object.link} and OpenGL 3.0 provide a generalized mechanism for rendering to off-screen surfaces.
		Each framebuffer object may have depth, stencil and zero or more color attachments that can be written to by the GL. The size of the framebuffer (width,
		height, layer count, sample count) is derived from the attachments of that framebuffer. In unextended OpenGL 4.2, it is not legal to render into a
		framebuffer object that has no attachments. Such a framebuffer would be considered incomplete with the GL30#FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT
		status.

		With OpenGL 4.2 and ${ARB_shader_image_load_store.link}, fragment shaders are capable of doing random access writes to buffer and texture memory via
		image loads, stores, and atomics. This ability enables algorithms using the conventional rasterizer to generate a collection of fragments, where each
		fragment shader invocation will write its outputs to buffer or texture memory using image stores or atomics. Such algorithms may have no need to write
		color or depth values to a conventional framebuffer. However, a framebuffer with no attachments will be considered incomplete and no rasterization or
		fragment shader exectuion will occur. To avoid such errors, an application may be required to create an otherwise unnecessary "dummy" texture and attach
		it to the framebuffer (possibly with color writes masked off). If the algorithm requires the rasterizer to operate over a large number of pixels, this
		dummy texture will needlessly consume a significant amount of memory.

		This extension enables the algorithms described above to work even with a framebuffer with no attachments. Applications can specify default width,
		height, layer count, and sample count parameters for a framebuffer object. When a framebuffer with no attachments is bound, it will be considered
		complete as long as the application has specified non-zero default width and height parameters. For the purposes of rasterization, the framebuffer will
		be considered to have a width, height, layer count, and sample count derived from its default parameters. Framebuffers with one or more attachments are
		not affected by these default parameters; the size of the framebuffer will still be derived from the sizes of the attachments in that case.

		Additionally, this extension provides queryable implementation-dependent maximums for framebuffer width, height, layer count, and sample count, which
		may differ from similar limits on textures and renderbuffers. These maximums will be used to error-check the default framebuffer parameters and also
		permit implementations to expose the ability to rasterize to an attachment-less framebuffer larger than the maximum supported texture size.

		Requires ${GL30.core} or ${ARB_framebuffer_object.link}. ${GL43.promoted}
		"""

	IntConstant(
		"""
		Accepted by the {@code pname} parameter of FramebufferParameteri, GetFramebufferParameteriv, NamedFramebufferParameteriEXT, and
		GetNamedFramebufferParameterivEXT.
		""",

		"FRAMEBUFFER_DEFAULT_WIDTH" _ 0x9310,
		"FRAMEBUFFER_DEFAULT_HEIGHT" _ 0x9311,
		"FRAMEBUFFER_DEFAULT_LAYERS" _ 0x9312,
		"FRAMEBUFFER_DEFAULT_SAMPLES" _ 0x9313,
		"FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS" _ 0x9314
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetInteger64v, GetFloatv, and GetDoublev.",

		"MAX_FRAMEBUFFER_WIDTH" _ 0x9315,
		"MAX_FRAMEBUFFER_HEIGHT" _ 0x9316,
		"MAX_FRAMEBUFFER_LAYERS" _ 0x9317,
		"MAX_FRAMEBUFFER_SAMPLES" _ 0x9318
	)

	GL43 reuse "FramebufferParameteri"
	GL43 reuse "GetFramebufferParameteriv"

	var src = GL43["FramebufferParameteri"]
	DependsOn("GL_EXT_direct_state_access") _ GLvoid(
		"NamedFramebufferParameteriEXT",
		"DSA version of #FramebufferParameteri().",

		GLuint.IN("framebuffer", "the framebuffer object"),
		src["pname"],
		src["param"]
	)

	src = GL43["GetFramebufferParameteriv"]
	DependsOn("GL_EXT_direct_state_access", postfix = "EXT") _ GLvoid(
		"GetNamedFramebufferParameterivEXT",
		"DSA version of #GetFramebufferParameteriv().",

		GLuint.IN("framebuffer", "the framebuffer object"),
		src["pname"],
		src["params"]
	)
}