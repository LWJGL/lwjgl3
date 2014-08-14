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
		"Accepted by the {@code pname} parameter of GL15#GetQueryObjecti(), GL15#GetQueryObjectui(), GL33#GetQueryObjecti64() and GL33#GetQueryObjectui64().",

		"QUERY_RESULT_NO_WAIT" _ 0x9194
	)

	IntConstant.block(
		"""
		Accepted by the {@code target} parameter of GL15#BindBuffer(), GL15#BufferData(), GL15#BufferSubData(),
		GL15#MapBuffer(), GL15#UnmapBuffer(), GL30#MapBufferRange(), GL15#GetBufferSubData(),
		GL15#GetBufferParameteri(), GL32#GetBufferParameteri64(), GL15#GetBufferPointer(),
		GL43#ClearBufferSubData(), and the {@code readtarget} and {@code writetarget} parameters of GL31#CopyBufferSubData().
		""",

		"QUERY_BUFFER" _ 0x9192
	)

	IntConstant.block(
		"""
		Accepted by the {@code pname} parameter of GL11#GetBoolean(), GL11#GetInteger(), GL11#GetFloat(),
		and GL11#GetDouble().
		""",

		"QUERY_BUFFER_BINDING" _ 0x9193
	)

	IntConstant.block(
		"Accepted in the {@code barriers} bitfield in GL42#MemoryBarrier().",

		"QUERY_BUFFER_BARRIER_BIT" _ 0x00008000
	)

}