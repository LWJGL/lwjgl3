/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux.templates

import org.lwjgl.generator.*
import org.lwjgl.system.linux.*

fun SysIOctl() = "SysIOctl".nativeClass(LINUX_PACKAGE) {
	nativeImport (
		"LinuxLWJGL.h",
	    "<sys/ioctl.h>"
	)

	javaDoc("Native bindings to <sys/ioctl.h>.")

	int.func(
		"ioctl",
	    """
		Manipulates the underlying device parameters of special files.  In particular, many operating characteristics of character special files (e.g.,
		terminals) may be controlled with {@code ioctl()} requests.
	    """,

	    int.IN("fd", "an open file descriptor"),
	    int.IN("request", "a device-dependent request code"),
	    voidptr.IN("arg", "")
	)

}