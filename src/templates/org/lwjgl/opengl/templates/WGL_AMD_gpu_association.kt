/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.generator.opengl.*
import org.lwjgl.generator.opengl.BufferType.*
import org.lwjgl.opengl.*
import org.lwjgl.system.windows.*

val WGL_AMD_gpu_association = "WGLAMDGPUAssociation".nativeClassWGL("WGL_AMD_gpu_association", AMD) {
	nativeImport (
		"OpenGL.h",
		"WGL.h"
	)

	documentation =
		"""
		Native bindings to the ${registryLink("AMD", "wgl_gpu_association")} extension.

		There currently is no way for applications to efficiently use GPU resources in systems that contain more than one GPU. Vendors have provided methods
		that attempt to split the workload for an application among the available GPU resources. This has proven to be very inefficient because most
		applications were never written with these sorts of optimizations in mind.

		This extension provides a mechanism for applications to explicitly use the GPU resources on a given system individually. By providing this
		functionality, a driver allows applications to make appropriate decisions regarding where and when to distribute rendering tasks.

		Requires ${WGL_ARB_extensions_string.link} and ${registryLinkTo("EXT", "framebuffer_object")}.
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

	UINT(
		"GetGPUIDsAMD",
		"""
		Returns the IDs for available GPUs.

		If the function succeeds, the return value is the number of total GPUs available. The value 0 is returned if no GPUs are available or if the call has
		failed. The ID 0 is reserved and will not be retuned as a valid GPU ID. If the array {@code ids} is NULL, the function will only return the total number
		of GPUs. {@code ids} will be tightly packed with no 0 values between valid ids.
		""",

		AutoSize("ids") _ UINT.IN("maxCount", "the max number of IDs that can be returned"),
		nullable _ UINT_p.IN("ids", "the array of returned IDs")
	)

	int(
		"GetGPUInfoAMD",
		"""
		Each GPU in a system may have different properties, performance characteristics and different supported OpenGL versions. Use this function to determine
		which GPU is best suited for a specific task.

		For a string, {@code size} will be the number of characters allocated and will include NULL termination. For arrays of type GL_UNSIGNED_INT, GL_INT, and
		GL_FLOAT {@code size} will be the array depth. If the function succeeds, the number of values written will be returned. If the number of values written
		is equal to {@code size}, the query should be repeated with a larger {@code data} buffer. Strings should be queried using the GL_UNSIGNED_BYTE type,
		are UTF-8 encoded and will be NULL terminated. If the function fails, -1 will be returned.
		""",

		UINT.IN("id", "a GPU id obtained from calling #GetGPUIDsAMD()"),
		int.IN("property", "the information being queried", properties),
		AutoType("data", GL_UNSIGNED_BYTE, GL_UNSIGNED_INT) _ GLenum.IN(
			"dataType",
			"the data type to be returned",
			"GL11##GL_UNSIGNED_INT GL11##GL_INT GL11##GL_FLOAT GL11##GL_UNSIGNED_BYTE"
		),
		(AutoSize("data") * "GLChecks.typeToBytes(dataType)") _ UINT.IN("size", "the size of the {@code data} buffer"),
		GLvoid_p.IN("data", "the buffer which will be filled with the requested information")
	)

	UINT(
		"GetContextGPUIDAMD",
		"""
		Determine which GPU a context is attached to.

		Unassociated contexts are created by calling org.lwjgl.system.windows.WGL#CreateContext(). Although these contexts are unassociated, their use
		will still be tied to a single GPU in most cases. For this reason it is advantageous to be able to query the GPU an existing unassociated context
		resides on. If multiple GPUs are available, it would be undesirable to use one for rendering to visible surfaces and then chose the same one for
		off-screen rendering.
		""",

		HGLRC.IN("hglrc", "the context for which the GPU id will be returned")
	)

	HGLRC(
		"CreateAssociatedContextAMD",
		"Creates an associated context. Upon successful creation, no pixel format is tied to an associated context.",

		UINT.IN("id", "a valid GPU id")
	)

	HGLRC(
		"CreateAssociatedContextAttribsAMD",
		"""
		Create an associated context with a specific GL version.

		All capabilities and limitations of WGLARBCreateContext#CreateContextAttribsARB() apply to {@code CreateAssociatedContextAttribsAMD}.
		""",

		UINT.IN("id", "a valid GPU id"),
		nullable _ HGLRC.IN("shareContext", "must either be NULL or that of an associated context created with the the same GPU ID as {@code id}"),
		const _ nullTerminated _ nullable _ int_p.IN("attribList", "a 0-terminated list of attributes for the context")
	)

	BOOL(
		"DeleteAssociatedContextAMD",
		"Deletes an associated context. An associated context cannot be deleted by calling org.lwjgl.system.windows.WGL#DeleteContext().",

		HGLRC.IN("hglrc", "a valid associated context created by calling #CreateAssociatedContextAMD()")
	)

	BOOL(
		"MakeAssociatedContextCurrentAMD",
		"Makes an associated context current in the current thread.",

		HGLRC.IN("hglrc", "a context handle created by calling #CreateAssociatedContextAMD()")
	)

	HGLRC("GetCurrentAssociatedContextAMD", "Returns the current associated context in the current thread.")

	DependsOn("GL_EXT_framebuffer_blit") _ VOID(
		"BlitContextFramebufferAMD",
		"""
		Blits data from one context to another. This facilitates high performance data communication between multiple contexts.
		""",

		HGLRC.IN("dstCtx", "the context handle for the write context"),
		GLint.IN("srcX0", "the source x<sub>0</sub> coordinate"),
		GLint.IN("srcY0", "the source Y<sub>0</sub> coordinate"),
		GLint.IN("srcX1", "the source X<sub>1</sub> coordinate"),
		GLint.IN("srcY1", "the source Y<sub>1</sub> coordinate"),
		GLint.IN("dstX0", "the destination X<sub>0</sub> coordinate"),
		GLint.IN("dstY0", "the destination Y<sub>0</sub> coordinate"),
		GLint.IN("dstX1", "the destination X<sub>1</sub> coordinate"),
		GLint.IN("dstY1", "the destination Y<sub>1</sub> coordinate"),
		GLbitfield.IN(
			"mask",
			"the bitwise OR of a number of values indicating which buffers are to be copied",
			"GL11##GL_COLOR_BUFFER_BIT GL11##GL_DEPTH_BUFFER_BIT GL11##GL_STENCIL_BUFFER_BIT", LinkMode.BITFIELD
		),
		GLenum.IN("filter", "the interpolation method to apply if the image is stretched", "GL11##GL_LINEAR GL11##GL_NEAREST")
	)
}