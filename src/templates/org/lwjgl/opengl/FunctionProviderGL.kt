/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl

import java.io.PrintWriter
import org.lwjgl.generator.*

private val NativeClass.capName: String
	get() = if ( templateName.startsWith(prefix) ) {
		if ( prefix == "GL" )
			"OpenGL${templateName.substring(2)}"
		else
			templateName
	} else {
		"${prefix}_$templateName"
	}

public val FunctionProviderGL: FunctionProvider = object : FunctionProvider() {

	override fun generateCapabilities(writer: PrintWriter): Unit = writer.generateCapabilitiesImpl()
	private fun PrintWriter.generateCapabilitiesImpl() {
		print(HEADER)
		println("package org.lwjgl.opengl;\n")

		println("import org.lwjgl.system.FunctionProvider;\n")

		println("/* Defines the capabilities of an OpenGL context. */")
		println("public final class ContextCapabilities {\n")

		val classes = super.classes

		for ( extension in classes ) {
			println("\tfinal ${extension.className}.Functions funcs${extension.className};")
		}

		println()
		for ( extension in classes ) {
			println("\tpublic final boolean ${extension.capName};")
		}

		println("\n\tpublic ContextCapabilities() {")
		println("\t\tfinal FunctionProvider provider = GLContext.getFunctionProvider();\n")

		for ( extension in classes ) {
			println("\t\tfuncs${extension.className} = new ${extension.className}.Functions(provider);")
		}

		println()
		for ( extension in classes ) {
			println("\t\t${extension.capName} = funcs${extension.className}.isSupported();")
		}
		println("\t}\n")

		print("}")
	}

}

// DSL Extensions

private fun String.addCapabilities(templateName: String, prefix: String, postfix: String, init: NativeClass.() -> Unit): NativeClass {
	val extension = nativeClass("org.lwjgl.opengl", templateName, prefix, postfix, FunctionProviderGL, init)
	FunctionProviderGL.addCapabilities(extension)
	return extension
}

public fun String.nativeClassGL(templateName: String, postfix: String = "", init: NativeClass.() -> Unit): NativeClass {
	return addCapabilities(templateName, "GL", postfix, init)
}

public fun String.nativeClassWGL(templateName: String, postfix: String = "", init: NativeClass.() -> Unit): NativeClass {
	return addCapabilities(templateName, "WGL", postfix, init)
}