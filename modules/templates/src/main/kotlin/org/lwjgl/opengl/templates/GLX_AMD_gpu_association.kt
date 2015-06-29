/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.linux.*

val GLX_AMD_gpu_association = "GLXAMDGPUAssociation".nativeClassGLX("GLX_AMD_gpu_association", AMD) {
	javaImport(
		"org.lwjgl.system.linux.*"
	)

	nativeImport (
		"<GL/glx.h>"
	)

	documentation =
		"""
		Native bindings to the ${registryLink("AMD", "glx_gpu_association")} extension.

		There currently is no way for applications to efficiently use GPU resources in systems that contain more than one GPU. Vendors have provided methods
		that attempt to split the workload for an application among the available GPU resources. This has proven to be very inefficient because most
		applications were never written with these sorts of optimizations in mind.

		This extension provides a mechanism for applications to explicitly use the GPU resources on a given system individually. By providing this
		functionality, a driver allows applications to make appropriate decisions regarding where and when to distribute rendering tasks.

		Requires ${GL15.core}, ${GLX13.glx}, ${registryLinkTo("EXT", "framebuffer_object")} and ${GLX_ARB_get_proc_address.link}.
		"""

	val properties = IntConstant(
		"Accepted by the {@code property} parameter of #GetGPUInfoAMD().",

		"GPU_VENDOR_AMD" _ 0x1F00,
		"GPU_RENDERER_STRING_AMD" _ 0x1F01,
		"GPU_OPENGL_VERSION_STRING_AMD" _ 0x1F02,
		"GPU_FASTEST_TARGET_GPUS_AMD" _ 0x21A2,
		"GPU_RAM_AMD" _ 0x21A3,
		"GPU_CLOCK_AMD" _ 0x21A4,
		"GPU_NUM_PIPES_AMD" _ 0x21A5,
		"GPU_NUM_SIMD_AMD" _ 0x21A6,
		"GPU_NUM_RB_AMD" _ 0x21A7,
		"GPU_NUM_SPI_AMD" _ 0x21A8
	).javaDocLinks

	void(
		"BlitContextFramebufferAMD",
		"",

		GLXContext.IN("dstCtx", ""),
		GLint.IN("srcX0", ""),
		GLint.IN("srcY0", ""),
		GLint.IN("srcX1", ""),
		GLint.IN("srcY1", ""),
		GLint.IN("dstX0", ""),
		GLint.IN("dstY0", ""),
		GLint.IN("dstX1", ""),
		GLint.IN("dstY1", ""),
		GLbitfield.IN("mask", ""),
		GLenum.IN("filter", "")
	)

	GLXContext(
		"CreateAssociatedContextAMD",
		"Creates an associated context.",

		unsigned_int.IN("id", ""),
		GLXContext.IN("share_list", "")
	)

	GLXContext(
		"CreateAssociatedContextAttribsAMD",
		"Creates an associated context and requests a specific GL version.",

		unsigned_int.IN("id", ""),
		GLXContext.IN("share_context", ""),
		const _ int_p.IN("attribList", "")
	)

	Bool(
		"DeleteAssociatedContextAMD",
		"Deletes an associated context.",

		GLXContext.IN("ctx", "the GLXContext")
	)

	unsigned_int(
		"GetContextGPUIDAMD",
		"Determines which GPU a context is attached to.",

		GLXContext.IN("ctx", "the GLXContext")
	)

	GLXContext(
		"GetCurrentAssociatedContextAMD",
		"Queries the crrent associated context."
	)

	unsigned_int(
		"GetGPUIDsAMD",
		"Queries the IDs for available GPUs.",

		unsigned_int.IN("maxCount", ""),
		unsigned_int.IN("ids", "")
	)

	int(
		"GetGPUInfoAMD",
		"Queries GPU properties.",

		unsigned_int.IN("id", ""),
		int.IN("property", "", properties),
		GLenum.IN("dataType", ""),
		unsigned_int.IN("size", ""),
		void_p.IN("data", "")
	)

	Bool(
		"MakeAssociatedContextCurrentAMD",
		"Makes an associated context current in the current thread.",

		GLXContext.IN("ctx", "the GLXContext")
	)

}