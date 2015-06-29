/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux.templates

import org.lwjgl.generator.*
import org.lwjgl.system.linux.*

val fcntl = "Fcntl".nativeClass(LINUX_PACKAGE) {
	nativeImport (
		"LinuxLWJGL.h",
		"<fcntl.h>"
	)

	documentation = "Native bindings to <fcntl.h>."

	IntConstant(
		"#open() flags.",

		"O_ACCMODE" _ 0x00000003,
		"O_RDONLY" _ 0x00000000,
		"O_WRONLY" _ 0x00000001,
		"O_RDWR" _ 0x00000002,
		"O_CREAT" _ 0x00000100,
		"O_EXCL" _ 0x00000200,
		"O_NOCTTY" _ 0x00000400,
		"O_TRUNC" _ 0x00001000,
		"O_APPEND" _ 0x00002000,
		"O_NONBLOCK" _ 0x00004000,
		"O_DSYNC" _ 0x00010000,
		"FASYNC" _ 0x00020000,
		"O_DIRECT" _ 0x00040000,
		"O_LARGEFILE" _ 0x00100000,
		"O_DIRECTORY" _ 0x00200000,
		"O_NOFOLLOW" _ 0x00400000,
		"O_NOATIME" _ 0x01000000,
		"O_CLOEXEC" _ 0x02000000
	)

	int(
		"open",
		"""
		Given a pathname for a file, {@code open()} returns a file descriptor, a small, nonnegative integer for use in subsequent system calls. The file
		descriptor returned by a successful call will be the lowest-numbered file descriptor not currently open for the process.
		""",

		const _ charASCII_p.IN("pathname", "the file path"),
		int.IN("flags", "the flags bitfield")
	)

}