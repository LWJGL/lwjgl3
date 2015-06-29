/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_clear_buffer_object = "ARBClearBufferObject".nativeClassGL("ARB_clear_buffer_object") {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		Buffer objects are fundamental to the operation of OpenGL. Buffers are used as a source of data for vertices and indices, read through buffer textures
		in shaders, used to transfer texture and image data into and out of textures and framebuffers, and may be written to by operations such as transform
		feedback. OpenGL contains mechanisms to copy sections of buffers from one to another, but it has no mechanism to initialize the content of a buffer to a
		known value. In effect, it has {@code memcpy}, but not {@code memset}.

		This extension adds such a mechanism and has several use cases. Examples include clearing a pixel unpack buffer before transferring data to a texture or
		resetting buffer data to a known value before sparse updates through shader image stores or transform feedback.

		Requires ${GL15.core}. ${GL43.promoted}
		"""

	val ClearBufferData = GL43 reuse "ClearBufferData"
	val ClearBufferSubData = GL43 reuse "ClearBufferSubData"

	DependsOn("GL_EXT_direct_state_access") _ GLvoid(
		"ClearNamedBufferDataEXT",
		"DSA version of #ClearBufferData().",

		GLuint.IN("buffer", "the buffer object to clear"),
		ClearBufferData["internalformat"],
		ClearBufferData["format"],
		ClearBufferData["type"],
		ClearBufferData["data"]
	)

	DependsOn("GL_EXT_direct_state_access") _ GLvoid(
		"ClearNamedBufferSubDataEXT",
		"DSA version of #ClearBufferSubData().",

		GLuint.IN("buffer", "the buffer object to clear"),
		ClearBufferSubData["internalformat"],
		ClearBufferSubData["offset"],
		ClearBufferSubData["size"],
		ClearBufferSubData["format"],
		ClearBufferSubData["type"],
		ClearBufferSubData["data"]
	)
}