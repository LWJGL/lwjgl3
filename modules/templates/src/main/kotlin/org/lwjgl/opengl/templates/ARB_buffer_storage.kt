/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_buffer_storage = "ARBBufferStorage".nativeClassGL("ARB_buffer_storage") {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		OpenGL has long supported buffer objects as a means of storing data that may be used to source vertex attributes, pixel data for textures, uniforms and
		other elements. In un-extended GL, buffer data stores are mutable - that is, they may be de-allocated or resized while they are in use. The
		${registryLinkTo("ARB", "texture_storage")} extension added immutable storage for texture object (and was subsequently incorporated into OpenGL 4.2).
		This extension further applies the concept of immutable storage to buffer objects. If an implementation is aware of a buffer's immutability, it may be
		able to make certain assumptions or apply particular optimizations in order to increase performance or reliability.

		Furthermore, this extension allows applications to pass additional information about a requested allocation to the implementation which it may use to
		select memory heaps, caching behavior or allocation strategies.

		Finally, this extension introduces the concept of persistent client mappings of buffer objects, which allow clients to retain pointers to a buffer's
		data store returned as the result of a mapping, and to issue drawing commands while those mappings are in place.

		${GL44.promoted}
		"""

	IntConstant(
		"Accepted in the {@code flags} parameter of #BufferStorage() and #NamedBufferStorageEXT().",

		"MAP_PERSISTENT_BIT" _ 0x0040,
		"MAP_COHERENT_BIT" _ 0x0080,
		"DYNAMIC_STORAGE_BIT" _ 0x0100,
		"CLIENT_STORAGE_BIT" _ 0x0200
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of {@code GetBufferParameter&#123;i|i64&#125;v}.",

		"BUFFER_IMMUTABLE_STORAGE" _ 0x821F,
		"BUFFER_STORAGE_FLAGS" _ 0x8220
	)

	IntConstant(
		"Accepted by the {@code barriers} parameter of GL42#MemoryBarrier().",

		"CLIENT_MAPPED_BUFFER_BARRIER_BIT" _ 0x00004000
	)

	val BufferStorage = GL44 reuse "BufferStorage"

	DependsOn("GL_EXT_direct_state_access") _ GLvoid(
		"NamedBufferStorageEXT",
		"""
		Behaves similarly to #BufferStorage(), except that the buffer whose storage is to be defined is specified by {@code buffer} rather than by the current
		binding to {@code target}.
		""",

		GLuint.IN("buffer", "the buffer object"),
		BufferStorage["size"],
		BufferStorage["data"],
		BufferStorage["flags"]
	)

}