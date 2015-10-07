/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows

import org.lwjgl.generator.*

// DSL Extensions

val DLL_WARNING =
	"""Features must be detected on a function-by-function basis. A function pointer will have a $NULL (0L) value when the corresponding
		function is not supported in the Windows version we're running."""

val DLL_FUNC = Capabilities(expression = FUNCTION_ADDRESS, override = true)
val DLL_ADDRESS = Virtual..nullable..voidptr.IN(FUNCTION_ADDRESS, "the DLL function address") // nullable: the generator emits checkFunctionAddress, no need to check again

val GetLastError = Code(nativeAfterCall = "\tsetLastError((jint)GetLastError());")