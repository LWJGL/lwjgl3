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

private val List<NativeClassFunction>.hasDeprecated: Boolean
	get() = this.any { it has deprecatedGL }

private val FunctionProviderGL = Generator.register(object : FunctionProvider(OPENGL_PACKAGE, "ContextCapabilities") {

	override fun printFunctionsParams(writer: PrintWriter, nativeClass: NativeClass) {
		if ( nativeClass.functions.hasDeprecated )
			writer.print(", boolean fc")
	}

	override fun getFunctionAddressCall(function: NativeClassFunction) =
		// Do the fc check here, because getFunctionAddress will return an address
		// even if the current context is forward compatible. We don't want that because
		// we prefer to throw an exception instead of letting GL raise an error and it's
		// also the only way to support the pseudo-fc mode.
		if ( function has deprecatedGL )
			"GL.getFunctionAddress(provider, \"${function.name}\", fc)"
		else
			"provider.getFunctionAddress(\"${function.name}\")"

	override fun PrintWriter.generateFunctionGetters(nativeClass: NativeClass) {
		println("\t// --- [ Function Addresses ] ---\n")

		println("\t/** Returns the {@link ${nativeClass.className}} instance for the current context. */")
		println("\tpublic static ${nativeClass.className} getInstance() {")
		println("\t\treturn GL.getCapabilities().__${nativeClass.className};")
		println("\t}")

		val functions = nativeClass.functions

		val hasDeprecated = functions.hasDeprecated

		print("\n\tstatic ${nativeClass.className} create(java.util.Set<String> ext, FunctionProvider provider")
		if ( hasDeprecated ) print(", boolean fc")
		println(") {")
		println("\t\tif ( !ext.contains(\"${nativeClass.capName}\") ) return null;")

		print("\n\t\t${nativeClass.className} funcs = new ${nativeClass.className}(provider")
		if ( hasDeprecated ) print(", fc")
		println(");")

		print("\n\t\tboolean supported = ")

		val printPointer = {(func: NativeClassFunction) ->
			if ( func has DependsOn )
				"ext.contains(\"${func[DependsOn].reference}\") ? funcs.${func.simpleName} : -1L"
			else
				"funcs.${func.simpleName}"
		}

		if ( hasDeprecated ) {
			print("(fc || checkFunctions(")
			printPointers(functions.filter { it has deprecatedGL }, printPointer)
			print(")) && ")
		}

		print("checkFunctions(")
		printPointers(if ( hasDeprecated ) functions.filterNot { it has deprecatedGL } else functions, printPointer)
		println(");")

		print("\n\t\treturn GL.checkExtension(\"")
		print(nativeClass.capName);
		println("\", funcs, supported);")
		println("\t}\n")
	}

	override fun PrintWriter.generateContent() {
		println("/** Defines the capabilities of an OpenGL context. */")
		println("public final class ContextCapabilities {\n")

		val classes = super.getClasses {(o1, o2) ->
			// Core functionality first, extensions after
			val isGL1 = o1.templateName.startsWith("GL")
			val isGL2 = o2.templateName.startsWith("GL")

			if ( isGL1 xor isGL2 )
				(if ( isGL1 ) -1 else 1)
			else
				o1.templateName compareToIgnoreCase o2.templateName
		}

		val classesWithFunctions = classes.filter { it.hasNativeFunctions }
		val alignment = classesWithFunctions.map { it.className.size }.fold(0) {(left, right) -> Math.max(left, right) }
		for ( extension in classesWithFunctions ) {
			print("\tfinal ${extension.className}")
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

		println("\n\tContextCapabilities(FunctionProvider provider, Set<String> ext, boolean fc) {")
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

})

// DSL Extensions

private fun String.nativeClassGL(
	templateName: String,
	nativeSubPath: String = "",
	prefix: String = "GL",
	prefixMethod: String = prefix.toLowerCase(),
	postfix: String = "",
	init: (NativeClass.() -> Unit)? = null
) = nativeClass(
	OPENGL_PACKAGE,
	templateName,
	nativeSubPath = nativeSubPath,
	prefix = prefix,
	prefixMethod = prefixMethod,
	postfix = postfix,
	functionProvider = FunctionProviderGL,
	init = init
)

private fun String.nativeClassWGL(templateName: String, postfix: String = "", init: (NativeClass.() -> Unit)? = null) =
	nativeClassGL(templateName, "wgl", "WGL", postfix = postfix, init = init)

private fun String.nativeClassGLX(templateName: String, postfix: String = "", init: (NativeClass.() -> Unit)? = null) =
	nativeClassGL(templateName, "glx", "GLX", "glX", postfix, init)