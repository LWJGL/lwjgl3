/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.libc.templates

import org.lwjgl.generator.*
import org.lwjgl.system.libc.*

val string = "LibCString".nativeClass(packageName = LIBC_PACKAGE) {
	/*nativeDirective(
		"""#ifdef LWJGL_WINDOWS
	#define _CRT_SECURE_NO_WARNINGS
	__pragma(warning(disable : 4710))
#endif""", beforeIncludes = true)*/

	nativeImport(
		"<string.h>"
	)

	documentation = "Native bindings to string.h."

	voidptr(
		"memset",
		"Fills memory with a constant byte.",

		nullable..voidptr.IN("dest", "pointer to destination"),
		int.IN("c", "character to set"),
		size_t.IN("count", "number of characters"),

		returnDoc = "the value of {@code dest}"
	)

	voidptr(
		"memcpy",
		"Copies characters between buffers.",

		nullable..voidptr.IN("dest", "new buffer"),
		nullable..const..voidptr.IN("src", "buffer to copy from"),
		size_t.IN("count", "number of characters to copy"),

		returnDoc = "the value of {@code dest}"
	)
}