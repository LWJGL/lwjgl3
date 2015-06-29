/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux.templates

import org.lwjgl.generator.*
import org.lwjgl.system.linux.*

val sys_select = "SysSelect".nativeClass(LINUX_PACKAGE) {
	nativeImport (
		"LinuxLWJGL.h",
		"<sys/select.h>"
	)

	documentation = "Native bindings to <sys/select.h>."

	void(
		"FD_CLR",
		"Removes a file descriptor from the set.",

		int.IN("fd", "the file descriptor to remove"),
		fd_set_p.IN("set", "the file descriptor set from which to remvoe")
	)

	int(
		"FD_ISSET",
		"Tests to see if a file descriptor is part of the set.",

		int.IN("fd", "the file descriptor to test"),
		fd_set_p.IN("set", "the file descriptor set to test")
	)

	void(
		"FD_SET",
		"Adds a file descriptor to the set.",

		int.IN("fd", "the file descriptor to add"),
		fd_set_p.IN("set", "the file descriptor set to which to add")
	)

	void(
		"FD_ZERO",
		"Clears a file descriptor set.",

		fd_set_p.IN("set", "the file descriptor set to clear")
	)

	int(
		"select",
		"""
		Allows a program to monitor multiple file descriptors, waiting until one or more of the file descriptors become "ready" for some class of I/O operation
		(e.g., input possible). A file descriptor is considered ready if it is possible to perform the corresponding I/O operation (e.g., read(2)) without
		blocking.
		""",

		int.IN("nfds", "the highest-numbered file descriptor in any of the three sets, plus 1"),
		fd_set_p.IN("readfds", "the set of file descriptors to watch for reads"),
		fd_set_p.IN("writefds", "the set of file descriptors to watch for writes"),
		fd_set_p.IN("exceptfds", "the set of file descriptors to watch for exceptions"),
		nullable _ timeval_p.IN(
			"timeout",
			"""
			an upper bound on the amount of time elapsed before {@code select()} returns. If both fields of the ##timeval structure are zero, then
			{@code select()} returns immediately. (This is useful for polling.) If {@code timeout} is $NULL (no timeout), {@code select()} can block
			indefinitely.
			"""
		)
	)

}