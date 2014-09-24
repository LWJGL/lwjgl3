/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl

import java.io.PrintWriter
import org.lwjgl.generator.*
import org.lwjgl.generator.opengl.*
import java.util.regex.Pattern

private val NativeClass.capName: String
	get() = if ( templateName.startsWith(prefixTemplate) ) {
		if ( prefix == "GL" )
			"OpenGL${templateName.substring(2)}"
		else
			templateName
	} else {
		"${prefixTemplate}_$templateName"
	}

private val Iterable<NativeClassFunction>.hasDeprecated: Boolean
	get() = this.any { it has deprecatedGL }

private val FunctionProviderGL = Generator.register(object: FunctionProvider(OPENGL_PACKAGE, "ContextCapabilities") {

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
				"${func[DependsOn].reference let { if ( it.indexOf(' ') == -1 ) "ext.contains(\"$it\")" else it }} ? funcs.${func.simpleName} : -1L"
			else
				"funcs.${func.simpleName}"
		}

		if ( hasDeprecated ) {
			print("(fc || checkFunctions(")
			nativeClass.printPointers(this, printPointer) { it has deprecatedGL }
			print(")) && ")
		}

		print("checkFunctions(")
		if ( hasDeprecated )
			nativeClass.printPointers(this, printPointer) { !(it has deprecatedGL || it has ignoreMissing) }
		else
			nativeClass.printPointers(this, printPointer) { !(it has ignoreMissing) }

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

		println()
		classes forEach {
			val documentation = it.documentation
			if ( documentation != null )
				println((if ( it.hasBody ) "When true, {@link ${it.className}} is supported." else documentation).toJavaDoc())
			println("\tpublic final boolean ${it.capName};")
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

private val NativeClassFunction.dsaLink: String
	get() = "${this.nativeClass.className}${this.javaDocLink}"

private val REGISTRY_PATTERN = Pattern.compile("([A-Z]+)_(\\w+)")
private val NativeClass.registryLink: String get() {
	val matcher = REGISTRY_PATTERN.matcher(templateName)
	if ( !matcher.matches() )
		throw IllegalStateException("Non-standard extension name: $templateName")
	return url("http://www.opengl.org/registry/specs/${matcher.group(1)}/${matcher.group(2)}.txt", templateName)
}

private fun NativeClass.registryLink(prefix: String, name: String): String = registryLinkTo(prefix, name, templateName)
private fun registryLinkTo(prefix: String, name: String, extensionName: String = "${prefix}_${name}"): String =
	url("http://www.opengl.org/registry/specs/$prefix/$name.txt", extensionName)

private val NativeClass.capLink: String get() = "ContextCapabilities##${capName}"
private val NativeClass.core: String get() = "{@link ${this.className} OpenGL ${this.className[2]}.${this.className[3]}}"
private val NativeClass.glx: String get() = "{@link ${this.className} GLX ${this.className[3]}.${this.className[4]}}"
private val NativeClass.promoted: String get() = "Promoted to core in ${this.core}."