/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_map_buffer_range = "ARBMapBufferRange".nativeClassGL("ARB_map_buffer_range", postfix = ARB) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		ARB_map_buffer_range expands the buffer object API to allow greater performance when a client application only needs to write to a sub-range of a buffer
		object. To that end, this extension introduces two new buffer object features: non-serialized buffer modification and explicit sub-range flushing for
		mapped buffer objects.

		OpenGL requires that commands occur in a FIFO manner meaning that any changes to buffer objects either block until the data has been processed by the
		OpenGL pipeline or else create extra copies to avoid such a block. By providing a method to asynchronously modify buffer object data, an application is
		then able to manage the synchronization points themselves and modify ranges of data contained by a buffer object even though OpenGL might still be using
		other parts of it.

		This extension also provides a method for explicitly flushing ranges of a mapped buffer object so OpenGL does not have to assume that the entire range
		may have been modified. Further, it allows the application to more precisely specify its intent with respect to reading, writing, and whether the
		previous contents of a mapped range of interest need be preserved prior to modification.

		Requires ${GL21.core}. ${GL30.promoted}
		"""

	IntConstant(
		"Accepted by the {@code access} parameter of MapBufferRange.",

		"MAP_READ_BIT" _ 0x0001,
		"MAP_WRITE_BIT" _ 0x0002,
		"MAP_INVALIDATE_RANGE_BIT" _ 0x0004,
		"MAP_INVALIDATE_BUFFER_BIT" _ 0x0008,
		"MAP_FLUSH_EXPLICIT_BIT" _ 0x0010,
		"MAP_UNSYNCHRONIZED_BIT" _ 0x0020
	)

	GL30 reuse "MapBufferRange"
	GL30 reuse "FlushMappedBufferRange"
}