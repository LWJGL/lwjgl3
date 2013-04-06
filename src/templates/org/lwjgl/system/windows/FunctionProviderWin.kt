/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows

import java.io.PrintWriter
import org.lwjgl.generator.*

/** Dummy FunctionProvider for dynamically loaded Windows functions. Nothing to do here, we use Functions instances directly. */
public val FunctionProviderWin: FunctionProvider = object : FunctionProvider() {

	override val hasCurrentCapabilities: Boolean = false

	override fun generateFunctionGetters(writer: PrintWriter, nativeClass: NativeClass): Unit {}
	override fun generateCapabilities(writer: PrintWriter): Unit {}

}

// DSL Extensions

public fun String.nativeClassWin(init: (NativeClass.() -> Unit)? = null): NativeClass =
	nativeClass(WINDOWS_PACKAGE, this, functionProvider = FunctionProviderWin, init = init)

val DLL_WARNING =
	"""Features must be detected on a function-by-function basis. The pointers in the {@link Functions} instance will have a zero (0L) value when a particular
		function is not supported in the Windows version we're running."""

val DLL_FUNC = Capabilities(expression = FUNCTION_ADDRESS, override = true)
val DLL_ADDRESS = mods(
	virtual,
	nullable // the generator emits checkFunctionAddress, no need to check again
) _ voidptr.IN(FUNCTION_ADDRESS, "the DLL function address")