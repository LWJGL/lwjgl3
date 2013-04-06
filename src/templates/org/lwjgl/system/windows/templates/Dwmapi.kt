/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows.templates

import org.lwjgl.generator.*
import org.lwjgl.system.windows.*

fun Dwmapi() = "Dwmapi".nativeClassWin {
	nativeImport(
		"WindowsLWJGL.h"
	)

	javaDoc(
		"""
		Optional functionality loaded dynamically from <strong>dwmapi.dll</strong>.

		$DLL_WARNING
		"""
	)

	DLL_FUNC _ HRESULT.func(
		"DwmIsCompositionEnabled",
	    "Sets the current process as dots per inch (dpi) aware.",

	    BOOL_p.OUT(
		    "enabled",
		    "a pointer to a value that, when this function returns successfully, receives {@code TRUE} if DWM composition is enabled; otherwise, {@code FALSE}."
	    ),
	    DLL_ADDRESS
	)

}