/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows.templates

import org.lwjgl.generator.*
import org.lwjgl.system.windows.*

fun Mmsystem() = "Mmsystem".nativeClass(WINDOWS_PACKAGE) {
	nativeImport (
		"WindowsLWJGL.h"
	)

	javaDoc("Native bindings to Mmsystem.h.")

	DWORD.func(
		"timeGetTime",
	    """
	    retrieves the system time, in milliseconds. The system time is the time elapsed since Windows was started.

	    Note that the value returned by the {@code timeGetTime} function is a {@code DWORD} value. The return value wraps around to 0 every 2^32 milliseconds,
	    which is about 49.71 days. This can cause problems in code that directly uses the {@code timeGetTime} return value in computations, particularly where
	    the value is used to control code execution. You should always use the difference between two {@code timeGetTime} return values in computations.
	    """
	)

}