/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_copy_buffer = "ARBCopyBuffer".nativeClassGL("ARB_copy_buffer") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension provides a mechanism to do an accelerated copy from one buffer object to another. This may be useful to load buffer objects in a "loading
		thread" while minimizing cost and synchronization effort in the "rendering thread."

		${GL31.promoted}
		"""

	IntConstant(
		"""
		Accepted by the target parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv, MapBufferRange,
		FlushMappedBufferRange, GetBufferParameteriv, BindBufferRange, BindBufferBase, and CopyBufferSubData.
		""",
		"COPY_READ_BUFFER" _ 0x8F36,
		"COPY_WRITE_BUFFER" _ 0x8F37
	)

	GL31 reuse "CopyBufferSubData"
}