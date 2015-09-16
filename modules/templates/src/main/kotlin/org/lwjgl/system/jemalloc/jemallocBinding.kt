/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.jemalloc

import org.lwjgl.generator.*
import java.io.PrintWriter

val jemallocBinding = object : APIBinding(JEMALLOC_PACKAGE, "*DUMMY*", callingConvention = CallingConvention.DEFAULT) {
	override fun getFunctionAddressCall(function: NativeClassFunction) = "checkFunctionAddress(${super.getFunctionAddressCall(function)});"

	override fun PrintWriter.generateFunctionGetters(nativeClass: NativeClass) {
		println("\t// --- [ Function Addresses ] ---\n")

		println("\t/** Returns the {@link ${nativeClass.className}} instance. */")
		println("\tpublic static ${nativeClass.className} getInstance() {")
		println("\t\treturn LibJEmalloc.__${nativeClass.className};")
		println("\t}\n")
	}

	override fun PrintWriter.generateContent() = Unit
}