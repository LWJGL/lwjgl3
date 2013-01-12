/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl

import java.io.PrintWriter
import java.util.Comparator
import org.lwjgl.generator.*
import org.lwjgl.generator.opengl.*

private val NativeClass.capName: String
	get() = if ( templateName.startsWith(prefix) ) {
		if ( prefix == "GL" )
			"OpenGL${templateName.substring(2)}"
		else
			templateName
	} else {
		"${prefix}_$templateName"
	}

private val List<NativeClassFunction>.hasDependencies: Boolean
	get() = this.any { it has DependsOn.CLASS }
private val List<NativeClassFunction>.hasDeprecated: Boolean
	get() = this.any { it has deprecatedGL }

public val FunctionProviderGL: FunctionProvider = object : FunctionProvider() {

	override fun generateFunctionGetters(writer: PrintWriter, nativeClass: NativeClass): Unit = writer.generateFunctionGettersImpl(nativeClass)
	private fun PrintWriter.generateFunctionGettersImpl(nativeClass: NativeClass) {
		println("\t// --- [ Function Addresses ] ---\n")

		println("\t/** Returns the {@link Functions} instance for the current context. */")
		println("\tpublic static Functions getInstance() {")
		println("\t\treturn GLContext.getCapabilities().__${nativeClass.className};")
		println("\t}")

		val functions = nativeClass.functions

		val hasDependencies = functions.hasDependencies
		val hasDeprecated = functions.hasDeprecated

		print("\n\tstatic Functions create(java.util.Set<String> ext, FunctionProvider provider")
		if ( hasDeprecated ) print(", boolean fc")
		println(") {")
		println("\t\tif ( !ext.contains(\"${nativeClass.capName}\") ) return null;")

		println("\n\t\tFunctions funcs = new Functions(provider);")

		print("\n\t\tboolean supported = ")
		val funcIndent: String
		if ( functions.size == 1 )
			funcIndent = " "
		else {
			println()
			funcIndent = "\t\t\t"
		}

		for ( i in functions.indices ) {
			print(funcIndent)

			var isSpecial = false

			if ( functions[i] has deprecatedGL ) {
				isSpecial = true
				print("(fc || ")
			}

			if ( functions[i] has DependsOn.CLASS ) {
				if ( !isSpecial ) {
					isSpecial = true
					print("(")
				}
				print("!ext.contains(\"${functions[i].get(DependsOn.CLASS).reference}\") || ")
			}

			print("funcs.${functions[i].name} != 0L")

			if ( isSpecial ) print(')')
			println(if ( i == functions.lastIndex ) ";" else " &&")
		}

		print("\n\t\treturn GLContext.checkExtension(\"")
		print(nativeClass.capName);
		println("\", funcs, supported);")
		println("\t}\n")
	}

	override fun generateCapabilities(writer: PrintWriter): Unit = writer.generateCapabilitiesImpl()
	private fun PrintWriter.generateCapabilitiesImpl() {
		print(HEADER)
		println("package org.lwjgl.opengl;\n")

		println("import org.lwjgl.system.*;\n")

		println("import java.util.Set;\n")

		println("/** Defines the capabilities of an OpenGL context. */")
		println("public final class ContextCapabilities {\n")

		val classes = super.getClasses(object : Comparator<NativeClass> {
			// Core functionality first, extensions after
			public override fun compare(o1: NativeClass, o2: NativeClass): Int {
				val isGL1 = o1.capName.startsWith("OpenGL")
				val isGL2 = o2.capName.startsWith("OpenGL")

				return if ( isGL1 xor isGL2 )
					(if ( isGL1 ) -1 else 1)
				else
					o1.className.compareTo(o2.className)
			}
			public override fun equals(obj: Any?): Boolean = false
		})

		val classesWithFunctions = classes.filter { it.hasNativeFunctions }
		val alignment = classesWithFunctions.map { it.className.size }.fold(0) { (left, right) -> Math.max(left, right) }
		for ( extension in classesWithFunctions ) {
			print("\tfinal ${extension.className}.Functions")
			for ( i in 0..(alignment - extension.className.size - 1) )
				print(' ')
			println(" __${extension.className};")
		}

		println("\n\t/** Indicates whether an OpenGL functionality is available or not. */")
		println("\tpublic final boolean")
		for ( i in classes.indices ) {
			print("\t\t${classes[i].capName}")
			println(if ( i == classes.lastIndex ) ";" else ",")
		}

		println("\n\tContextCapabilities(final Set<String> ext, final boolean fc) {")
		println("\t\tfinal FunctionProvider provider = GLContext.getFunctionProvider();\n")
		for ( extension in classes ) {
			if ( extension.hasNativeFunctions ) {
				print("\t\t${extension.capName} = (__${extension.className} = ${extension.className}.create(ext, provider")
				if ( extension.functions.hasDeprecated ) print(", fc")
				println(")) != null;")
			} else
				println("\t\t${extension.capName} = ext.contains(\"${extension.capName}\");")
		}
		println("\t}")
		print("}")
	}

}

// DSL Extensions

private fun String.addCapabilities(templateName: String, nativeSubPath: String, prefix: String, postfix: String, init: NativeClass.() -> Unit): NativeClass {
	val extension = nativeClass("org.lwjgl.opengl", templateName, nativeSubPath, prefix, postfix, FunctionProviderGL, init)
	FunctionProviderGL.addCapabilities(extension)
	return extension
}

public fun String.nativeClassGL(templateName: String, postfix: String = "", init: NativeClass.() -> Unit): NativeClass {
	return addCapabilities(templateName, "", "GL", postfix, init)
}

public fun String.nativeClassWGL(templateName: String, postfix: String = "", init: NativeClass.() -> Unit): NativeClass {
	return addCapabilities(templateName, "wgl", "WGL", postfix, init)
}