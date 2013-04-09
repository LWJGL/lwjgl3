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
	get() = if ( templateName.startsWith(prefixTemplate) ) {
		if ( prefix == "GL" )
			"OpenGL${templateName.substring(2)}"
		else
			templateName
	} else {
		"${prefixTemplate}_$templateName"
	}

private val List<NativeClassFunction>.hasDependencies: Boolean
	get() = this.any { it has DependsOn }
private val List<NativeClassFunction>.hasDeprecated: Boolean
	get() = this.any { it has deprecatedGL }

public val FunctionProviderGL: FunctionProvider = object : FunctionProvider() {

	override fun printFunctionsParams(writer: PrintWriter, nativeClass: NativeClass) {
		if ( nativeClass.functions.hasDeprecated )
			writer.print(", boolean fc")
	}

	override fun getFunctionAddressCall(function: NativeClassFunction): String =
		// Do the fc check here, because getFunctionAddress will return an address
		// even if the current context is forward compatible. We don't want that because
		// we prefer to throw an exception instead of letting GL raise an error and it's
		// also the only way to support the pseudo-fc mode.
		if ( function has deprecatedGL )
			"GL.getFunctionAddress(provider, \"${function.name}\", fc)"
		else
			"provider.getFunctionAddress(\"${function.name}\")"

	override fun generateFunctionGetters(writer: PrintWriter, nativeClass: NativeClass): Unit = writer.generateFunctionGettersImpl(nativeClass)
	private fun PrintWriter.generateFunctionGettersImpl(nativeClass: NativeClass) {
		println("\t// --- [ Function Addresses ] ---\n")

		println("\t/** Returns the {@link Functions} instance for the current context. */")
		println("\tpublic static Functions getInstance() {")
		println("\t\treturn GL.getCapabilities().__${nativeClass.className};")
		println("\t}")

		val functions = nativeClass.functions

		val hasDependencies = functions.hasDependencies
		val hasDeprecated = functions.hasDeprecated

		print("\n\tstatic Functions create(java.util.Set<String> ext, FunctionProvider provider")
		if ( hasDeprecated ) print(", boolean fc")
		println(") {")
		println("\t\tif ( !ext.contains(\"${nativeClass.capName}\") ) return null;")

		print("\n\t\tFunctions funcs = new Functions(provider")
		if ( hasDeprecated ) print(", fc")
		println(");")

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

			if ( functions[i] has DependsOn )
				print("(!ext.contains(\"${functions[i][DependsOn].reference}\") || ")

			print("GL.isFunctionSupported(funcs.${functions[i].name}")
			if ( functions[i] has deprecatedGL )
				print(", fc")
			print(")")

			if ( functions[i] has DependsOn ) print(')')
			println(if ( i == functions.lastIndex ) ";" else " &&")
		}

		print("\n\t\treturn GL.checkExtension(\"")
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
				val isGL1 = o1.templateName.startsWith("GL")
				val isGL2 = o2.templateName.startsWith("GL")

				return if ( isGL1 xor isGL2 )
					(if ( isGL1 ) -1 else 1)
				else
					o1.templateName.compareTo(o2.templateName)
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

		println("\n\tContextCapabilities(Set<String> ext, boolean fc) {")
		println("\t\tFunctionProvider provider = GL.getFunctionProvider();\n")
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

public fun String.nativeClassGL(
	templateName: String,
	nativeSubPath: String = "",
	prefix: String = "GL",
	prefixMethod: String = prefix.toLowerCase(),
	postfix: String = "",
	init: (NativeClass.() -> Unit)? = null
): NativeClass =
	nativeClass(
		"org.lwjgl.opengl",
		templateName,
		nativeSubPath = nativeSubPath,
		prefix = prefix,
		prefixMethod = prefixMethod,
		postfix = postfix,
		functionProvider = FunctionProviderGL,
		init = init
	)

public fun String.nativeClassWGL(templateName: String, postfix: String = "", init: (NativeClass.() -> Unit)? = null): NativeClass =
	nativeClassGL(templateName, "wgl", "WGL", postfix = postfix, init = init)

public fun String.nativeClassGLX(templateName: String, postfix: String = "", init: (NativeClass.() -> Unit)? = null): NativeClass =
	nativeClassGL(templateName, "glx", "GLX", "glX", postfix, init)