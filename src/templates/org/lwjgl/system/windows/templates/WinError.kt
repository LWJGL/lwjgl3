/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows.templates

import org.lwjgl.generator.*
import org.lwjgl.system.windows.*

fun WinError() = "WinError".nativeClass(WINDOWS_PACKAGE) {

	javaDoc("Native bindings to WinError.h.")

	IntConstant.block(
		"Success codes.",

		"S_OK" _ 0,
		"S_FALSE" _ 1
	)

}