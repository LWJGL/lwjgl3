/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.glfw

import org.lwjgl.generator.*
import org.lwjgl.glfw.templates.GLFW
import java.io.PrintWriter

object GLFWBinding : APIBinding(GLFW_PACKAGE, "*DUMMY*", callingConvention = CallingConvention.DEFAULT) {
	override fun getFunctionAddressCall(function: NativeClassFunction) = "checkFunctionAddress(${super.getFunctionAddressCall(function)})"

	override fun PrintWriter.generateFunctionGetters(nativeClass: NativeClass) {
		println("\t// --- [ Function Addresses ] ---\n")

		println("\t/** Returns the {@link ${nativeClass.className}} instance. */")
		println("\tpublic static ${nativeClass.className} getInstance() {")
		if ( nativeClass === GLFW )
			println("\t\treturn LibGLFW.__${nativeClass.className};")
		else
			println("\t\treturn checkFunctionality(LibGLFW.__${nativeClass.className});")
		println("\t}\n")
	}

	override fun PrintWriter.generateContent() = Unit
}