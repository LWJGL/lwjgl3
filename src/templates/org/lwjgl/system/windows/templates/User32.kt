/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows.templates

import org.lwjgl.generator.*
import org.lwjgl.system.windows.*

val User32 = "User32".nativeClassWin {
	nativeImport(
		"WindowsLWJGL.h"
	)

	documentation =
		"""
		Optional functionality loaded dynamically from <strong>user32.dll</strong>.

		$DLL_WARNING
		"""

	DLL_FUNC _ BOOL(
		"SetProcessDPIAware",
		"Sets the current process as dots per inch (dpi) aware.",

		DLL_ADDRESS
	)

}