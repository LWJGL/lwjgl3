/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.macosx.templates

import org.lwjgl.generator.*
import org.lwjgl.system.macosx.*

val unistd = "Unistd".nativeClass(MACOSX_PACKAGE) {
	nativeImport (
		"MacOSXLWJGL.h",
		"<unistd.h>"
	)

	documentation = "Native bindings to <unistd.h>."

	pid_t(
		"getpid",
		"Returns the process ID of the calling process."
	);
}