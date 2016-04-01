/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.egl

import org.lwjgl.generator.*
import java.io.PrintWriter
import java.util.*
import java.util.regex.Pattern

val NativeClass.capName: String
	get() = if ( templateName.startsWith(prefixTemplate) ) templateName else "${prefixTemplate}_$templateName"

private val CAPABILITIES_CLASS = "EGLCapabilities"

private val EGLBinding = Generator.register(object : APIBinding(EGL_PACKAGE, CAPABILITIES_CLASS) {

	override val hasCapabilities: Boolean get() = true

	override fun shouldCheckFunctionAddress(function: NativeClassFunction): Boolean = function.nativeClass.templateName != "CL10"

	override fun generateFunctionAddress(writer: PrintWriter, function: NativeClassFunction) {
		writer.println("\t\tlong $FUNCTION_ADDRESS = EGL.getCapabilities().${function.name};")
	}

	override fun PrintWriter.generateFunctionSetup(nativeClass: NativeClass) {
		println("\n\tstatic boolean isAvailable($CAPABILITIES_CLASS caps) {")
		print("\t\treturn checkFunctions(")
		nativeClass.printPointers(this, { "caps.${it.name}" })
		println(");")
		println("\t}")
	}

	override fun PrintWriter.generateContent() {
		println("""/** Defines the capabilities of an EGLDisplay or the EGL client library. */""")
		println("public class $CAPABILITIES_CLASS {\n")

		val classes = super.getClasses { o1, o2 ->
			// Core functionality first, extensions after
			val isEGL1 = o1.templateName.startsWith("EGL")
			val isEGL2 = o2.templateName.startsWith("EGL")

			if ( isEGL1 xor isEGL2 )
				(if ( isEGL1 ) -1 else 1)
			else
				o1.templateName.compareTo(o2.templateName, ignoreCase = true)
		}

		val classesWithFunctions = classes.filter { it.hasNativeFunctions }

		val addresses = classesWithFunctions
			.map { it.functions }
			.flatten()
			.toSortedSet(Comparator<NativeClassFunction> { o1, o2 -> o1.name.compareTo(o2.name) })

		println("\tpublic final long")
		println(addresses.map { it.name }.joinToString(",\n\t\t", prefix = "\t\t", postfix = ";\n"))

		classes.forEach {
			val documentation = it.documentation
			if ( documentation != null )
				println((if ( it.hasBody ) "When true, {@link ${it.className}} is supported." else documentation).toJavaDoc())
			println("\tpublic final boolean ${it.capName};")
		}

		// Client constructor
		println("\n\t$CAPABILITIES_CLASS(FunctionProvider provider, Set<String> ext) {")
		println(addresses.map { "provider.getFunctionAddress(${it.nativeName})" }.joinToString(",\n\t\t\t", prefix = "\t\tthis(ext,\n\t\t\t", postfix = "\n\t\t);\n\t}"))

		// Display constructor
		println("\n\t$CAPABILITIES_CLASS(EGLCapabilities caps, Set<String> ext) {")
		println(addresses.map { "caps.${it.name}" }.joinToString(",\n\t\t\t", prefix = "\t\tthis(ext,\n\t\t\t", postfix = "\n\t\t);\n\t}"))

		// Common constructor
		println("\n\tprivate $CAPABILITIES_CLASS(Set<String> ext, long... functions) {")
		println(addresses.mapIndexed { i, function -> "${function.name} = functions[$i];" }.joinToString("\n\t\t", prefix = "\t\t", postfix = "\n"))
		for (extension in classes) {
			val capName = extension.capName
			print("\t\t$capName = ext.contains(\"$capName\")")
			if ( extension.hasNativeFunctions )
				print(" && EGL.checkExtension(\"$capName\", ${if ( capName == extension.className ) "$EGL_PACKAGE.${extension.className}" else extension.className}.isAvailable(this))")
			println(";")
		}
		println("\t}")

		print("\n}")
	}

})

fun String.nativeClassEGL(
	templateName: String,
	nativeSubPath: String = "",
	prefix: String = "EGL",
	prefixMethod: String = prefix.toLowerCase(),
	postfix: String = "",
	init: (NativeClass.() -> Unit)? = null
) = nativeClass(
	EGL_PACKAGE,
	templateName,
	nativeSubPath = nativeSubPath,
	prefix = prefix,
	prefixMethod = prefixMethod,
	postfix = postfix,
	binding = EGLBinding,
	init = init
)

fun config() {
	packageInfo(
		EGL_PACKAGE,
		"""
		Contains bindings to the <a href="https://www.khronos.org/egl">EGL</a> API, an interface between Khronos rendering APIs such as OpenGL ES or OpenVG and
		the underlying native platform window system. It handles graphics context management, surface/buffer binding and rendering synchronization and enables
		high-performance, accelerated, mixed-mode 2D and 3D rendering using other Khronos APIs.

		The <a href="https://www.khronos.org/registry/egl/">Khronos EGL registry</a> is a useful online resource that contains the EGL specification, as well
		as specifications of EGL extensions.
		"""
	)
}

private val REGISTRY_PATTERN = Pattern.compile("([A-Z]+)_(\\w+)")
val NativeClass.registryLink: String get() {
	val matcher = REGISTRY_PATTERN.matcher(templateName)
	if ( !matcher.matches() )
		throw IllegalStateException("Non-standard extension name: $templateName")
	return url("https://www.khronos.org/registry/egl/extensions/${matcher.group(1)}/EGL_$templateName.txt", templateName)
}

fun NativeClass.registryLink(prefix: String, name: String): String = registryLinkTo(prefix, name, templateName)
private fun registryLinkTo(prefix: String, name: String, extensionName: String = "${prefix}_$name"): String =
	url("https://www.khronos.org/registry/egl/extensions/$prefix/$name.txt", extensionName)

val NativeClass.core: String get() = "{@link ${this.className} EGL ${this.className[2]}.${this.className[3]}}"
val NativeClass.promoted: String get() = "Promoted to core in ${this.core}."