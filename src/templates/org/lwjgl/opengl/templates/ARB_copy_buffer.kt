/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

fun ARB_copy_buffer() = "ARBCopyBuffer".nativeClassGL("ARB_copy_buffer") {
	nativeImport (
		"OpenGL.h"
	)

	documentation = "Native bindings to the ${url("http://www.opengl.org/registry/specs/ARB/copy_buffer.txt", templateName)} extension."

	IntConstant.block(
		"""
		Accepted by the target parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv, MapBufferRange,
		FlushMappedBufferRange, GetBufferParameteriv, BindBufferRange, BindBufferBase, and CopyBufferSubData:
		""",
		"COPY_READ_BUFFER" _ 0x8F36,
		"COPY_WRITE_BUFFER" _ 0x8F37
	)

	GLvoid.func(
		"CopyBufferSubData",
		"""
		Copies all or part of one buffer object's data store to the data store of another buffer object.

		An INVALID_VALUE error is generated if any of readoffset, writeoffset, or size are negative, if readoffset+size exceeds the size of the buffer object
		bound to readtarget, or if writeoffset+size exceeds the size of the buffer object bound to writetarget.

		An INVALID_VALUE error is generated if the same buffer object is bound to both readtarget and writetarget, and the ranges [readoffset, readoffset+size)
		and [writeoffset, writeoffset+size) overlap.

		An INVALID_OPERATION error is generated if zero is bound to readtarget or writetarget.

		An INVALID_OPERATION error is generated if the buffer objects bound to either readtarget or writetarget are mapped.
		""",

		GLenum.IN(
			"readTarget",
			"the source buffer object target.",
			"""
			GL15#ARRAY_BUFFER #COPY_READ_BUFFER #COPY_WRITE_BUFFER GL15#ELEMENT_ARRAY_BUFFER GL21#PIXEL_PACK_BUFFER GL21#PIXEL_UNPACK_BUFFER
			GL30#TRANSFORM_FEEDBACK_BUFFER GL31#TEXTURE_BUFFER GL31#UNIFORM_BUFFER
			"""
		),
		GLenum.IN("writeTarget", "the destination buffer object target"),
		GLintptr.IN("readOffset", "the source buffer object offset, in bytes"),
		GLintptr.IN("writeOffset", "the destination buffer object offset, in bytes"),
		GLsizeiptr.IN("size", "the number of bytes to copy")
	)

}
