/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal

import java.io.PrintWriter
import org.lwjgl.generator.*
import java.util.*

private val CAPABILITIES_CLASS = "ALCapabilities"

private val ALBinding = Generator.register(object : APIBinding(OPENAL_PACKAGE, CAPABILITIES_CLASS, callingConvention = CallingConvention.DEFAULT) {

	init {
		Generator.registerTLS(
			"org.lwjgl.openal.*",
			"public ALCapabilities capsAL;"
		)
	}

	override val hasCapabilities: Boolean get() = true

	override fun shouldCheckFunctionAddress(function: NativeClassFunction): Boolean = function.nativeClass.templateName != "AL10"

	override fun generateFunctionAddress(writer: PrintWriter, function: NativeClassFunction) {
		writer.println("\t\tlong $FUNCTION_ADDRESS = AL.getCapabilities().${function.name};")
	}

	override fun PrintWriter.generateFunctionSetup(nativeClass: NativeClass) {
		println("\n\tstatic boolean isAvailable($CAPABILITIES_CLASS caps) {")
		print("\t\treturn checkFunctions(")
		nativeClass.printPointers(this, { "caps.${it.name}" })
		println(");")
		println("\t}")
	}

	override fun PrintWriter.generateContent() {
		println("/** Defines the capabilities of an OpenAL context. */")
		println("public final class $CAPABILITIES_CLASS {\n")

		val classes = super.getClasses { o1, o2 ->
			val isAL1 = o1.templateName.startsWith("AL")
			val isAL2 = o2.templateName.startsWith("AL")

			if ( isAL1 xor isAL2 )
				(if ( isAL1 ) -1 else 1)
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
			println("\tpublic final boolean ${it.capName("AL")};")
		}

		println("\n\t$CAPABILITIES_CLASS(FunctionProvider provider, Set<String> ext) {")

		println(addresses.map { "${it.name} = provider.getFunctionAddress(${it.nativeName});" }.joinToString("\n\t\t", prefix = "\t\t", postfix = "\n"))

		for (extension in classes) {
			val capName = extension.capName("AL")
			print("\t\t$capName = ext.contains(\"$capName\")")
			if ( extension.hasNativeFunctions )
				print(" && AL.checkExtension(\"$capName\", ${if ( capName == extension.className ) "$OPENAL_PACKAGE.${extension.className}" else extension.className}.isAvailable(this))")
			println(";")
		}
		println("\t}")
		print("}")
	}

})

// DSL Extensions

fun String.nativeClassAL(templateName: String, prefixTemplate: String = "AL", postfix: String = "", init: (NativeClass.() -> Unit)? = null) =
	nativeClass(OPENAL_PACKAGE, templateName, prefix = "AL", prefixTemplate = prefixTemplate, postfix = postfix, binding = ALBinding, init = init)

val NativeClass.specLinkOpenALSoft: String get() = url("http://kcat.strangesoft.net/openal-extensions/$templateName.txt", templateName)
val NativeClass.extensionName: String get() = "{@code ${prefixTemplate}_$templateName}"