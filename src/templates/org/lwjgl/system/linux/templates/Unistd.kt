/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux.templates

import org.lwjgl.generator.*
import org.lwjgl.system.linux.*

val unistd = "Unistd".nativeClass(LINUX_PACKAGE) {
	nativeImport (
		"LinuxLWJGL.h",
		"<unistd.h>"
	)

	documentation = "Native bindings to <unistd.h>."

	int(
		"close",
		"""
		Closes a file descriptor, so that it no longer refers to any file and may be reused.  Any record locks held on the file it was associated with, and
		owned by the process, are removed (regardless of the file descriptor that was used to obtain the lock).
		""",

		int.IN("fd", "the file descriptor to close")
	)

	ssize_t(
		"read",
		"Attempts to read up to {@code count} bytes from file descriptor {@code fd} into the buffer starting at {@code buf}.",

		int.IN("fd", "the file descriptor to read"),
		void_p.IN("buf", "the buffer"),
		AutoSize("buf") _ size_t.IN("count", "the number of bytes to read")
	)

}