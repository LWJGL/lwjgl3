/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.libc.templates

import org.lwjgl.generator.*

val string = "StringH".nativeClass(packageName = "org.lwjgl.system.libc") {
	nativeDirective(
		"""#ifdef LWJGL_WINDOWS
	#define _CRT_SECURE_NO_WARNINGS
#endif""", beforeIncludes = true)

	nativeImport (
	    "<string.h>"
	)

	documentation = "Native bindings to string.h."

	charASCII_p(
		"strerror",
	    "Maps the error number in {@code errnum} to a locale-dependent error message string and returns a pointer to it.",

	    int.IN("errnum", "the error number")
	)
}