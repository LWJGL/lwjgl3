/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

fun ARB_query_buffer_object() = "ARBQueryBufferObject".nativeClassGL("ARB_query_buffer_object") {
	nativeImport (
		"OpenGL.h"
	)

	documentation = "Native bindings to the ${url("http://www.opengl.org/registry/specs/ARB/query_buffer_object.txt", templateName)} extension."

	IntConstant.block(
		"""
		Accepted by the {@code pname} parameter of ${"GL15#GetQueryObjecti()".link}, ${"GL15#GetQueryObjectui()".link}, ${"GL33#GetQueryObjecti64()".link} and
		GetQueryObjectui64()".link}.
		""",

		"QUERY_RESULT_NO_WAIT" _ 0x9194
	)

	IntConstant.block(
		"""
		Accepted by the {@code target} parameter of ${"GL15#BindBuffer()".link}, ${"GL15#BufferData()".link}, ${"GL15#BufferSubData()".link},
		${"GL15#MapBuffer()".link}, ${"GL15#UnmapBuffer()".link}, ${"GL30#MapBufferRange()".link}, ${"GL15#GetBufferSubData()".link},
		${"GL15#GetBufferParameteri()".link}, ${"GL32#GetBufferParameteri64()".link}, ${"GL15#GetBufferPointer()".link},
		${"GL43#ClearBufferSubData()".link}, and the {@code readtarget} and {@code writetarget} parameters of ${"GL31#CopyBufferSubData()".link}.
		""",

		"QUERY_BUFFER" _ 0x9192
	)

	IntConstant.block(
		"""
		Accepted by the {@code pname} parameter of ${"GL11#GetBoolean()".link}, ${"GL11#GetInteger()".link}, ${"GL11#GetFloat()".link},
		and ${"GL11#GetDouble()".link}.
		""",

		"QUERY_BUFFER_BINDING" _ 0x9193
	)

	IntConstant.block(
		"Accepted in the {@code barriers} bitfield in ${"GL42#MemoryBarrier()".link}.",

		"QUERY_BUFFER_BARRIER_BIT" _ 0x00008000
	)

}