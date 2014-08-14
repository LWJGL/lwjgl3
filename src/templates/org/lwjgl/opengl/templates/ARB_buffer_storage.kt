/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

fun ARB_buffer_storage() = "ARBBufferStorage".nativeClassGL("ARB_buffer_storage") {
	nativeImport (
		"OpenGL.h"
	)

	documentation = "Native bindings to the ${url("http://www.opengl.org/registry/specs/ARB/buffer_storage.txt", templateName)} extension."

	val BufferStorageFlags = IntConstant.block(
		"Accepted in the {@code flags} parameter of #BufferStorage() and EXTDirectStateAccess#NamedBufferStorageEXT().",

		"MAP_PERSISTENT_BIT" _ 0x0040,
		"MAP_COHERENT_BIT" _ 0x0080,
		"DYNAMIC_STORAGE_BIT" _ 0x0100,
		"CLIENT_STORAGE_BIT" _ 0x0200
	).toJavaDocLinks()

	IntConstant.block(
		"Accepted by the {@code pname} parameter of {@code GetBufferParameter&#123;i|i64&#125;v}.",

		"BUFFER_IMMUTABLE_STORAGE" _ 0x821F,
		"BUFFER_STORAGE_FLAGS" _ 0x8220
	)

	IntConstant.block(
		"Accepted by the {@code barriers} parameter of GL42#MemoryBarrier().",

		"CLIENT_MAPPED_BUFFER_BARRIER_BIT" _ 0x00004000
	)

	val BufferStorage = GL44 reuse "BufferStorage"

	DependsOn("GL_EXT_direct_state_access") _ GLvoid.func(
		"NamedBufferStorageEXT",
		"""
		Behaves similarly to #BufferStorage(), except that the buffer whose storage is to be defined is specified by {@code buffer} rather than by the current
		binding to @code target}.
		""",

		GLuint.IN("buffer", "the buffer object"),
		BufferStorage["size"],
		BufferStorage["data"],
		BufferStorage["flags"]
	)

}