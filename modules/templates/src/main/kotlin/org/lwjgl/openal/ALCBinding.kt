/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openal

import org.lwjgl.generator.*
import java.io.*

fun NativeClass.capName(core: String) =
	if (templateName.startsWith(prefixTemplate)) {
		if (prefix == core)
			"Open$core${templateName.substring(core.length)}"
		else
			templateName
	} else {
		"${prefixTemplate}_$templateName"
	}

private val NativeClass.isCore: Boolean get() = templateName.startsWith("ALC")

private val ALC_CAP_CLASS = "ALCCapabilities"

val ALCBinding = Generator.register(object : APIBinding(OPENAL_PACKAGE, ALC_CAP_CLASS, callingConvention = CallingConvention.DEFAULT) {

	override val hasCapabilities: Boolean get() = true

	override fun shouldCheckFunctionAddress(function: NativeClassFunction): Boolean = function.nativeClass.templateName != "ALC10"

	override fun generateFunctionAddress(writer: PrintWriter, function: NativeClassFunction) {
		writer.println("\t\tlong $FUNCTION_ADDRESS = ALC.getICD().${function.name};")
	}

	override fun PrintWriter.generateFunctionSetup(nativeClass: NativeClass) {
		println("\n\tstatic boolean isAvailable($ALC_CAP_CLASS caps) {")
		print("\t\treturn checkFunctions(")
		nativeClass.printPointers(this, { "caps.${it.name}" })
		println(");")
		println("\t}")
	}

	init {
		documentation = "Defines the capabilities of the OpenAL Context API."
	}

	override fun PrintWriter.generateJava() {
		generateJavaPreamble()
		println("public final class $ALC_CAP_CLASS {\n")

		val classes = super.getClasses { o1, o2 ->
			// Core functionality first, extensions after
			val isALC1 = o1.isCore
			val isALC2 = o2.isCore

			if (isALC1 xor isALC2)
				(if (isALC1) -1 else 1)
			else
				o1.templateName.compareTo(o2.templateName, ignoreCase = true)
		}

		val classesWithFunctions = classes.filter { it.hasNativeFunctions && it.prefix == "ALC" }

		val addresses = classesWithFunctions
			.map { it.functions }
			.flatten()
			.toSortedSet(Comparator<NativeClassFunction> { o1, o2 -> o1.name.compareTo(o2.name) })

		println("\tpublic final long")
		println(addresses.map { it.name }.joinToString(",\n\t\t", prefix = "\t\t", postfix = ";\n"))

		classes.forEach {
			println(it.getCapabilityJavadoc())
			println("\tpublic final boolean ${it.capName("ALC")};")
		}

		println("\n\t$ALC_CAP_CLASS(FunctionProviderLocal provider, long device, Set<String> ext) {")

		println(addresses.map { "${it.name} = provider.getFunctionAddress(${if (it.nativeClass.isCore) "" else "device, "}${it.functionAddress});" }.joinToString("\n\t\t", prefix = "\t\t", postfix = "\n"))

		for (extension in classes) {
			val capName = extension.capName("ALC")
			print("\t\t$capName = ext.contains(\"$capName\")")
			if (extension.hasNativeFunctions && extension.prefix == "ALC")
				print(" && ALC.checkExtension(\"$capName\", ${if (capName == extension.className) "$OPENAL_PACKAGE.${extension.className}" else extension.className}.isAvailable(this))")
			println(";")
		}
		println("\t}")
		print("}")
	}

})

// DSL Extensions

fun String.nativeClassALC(templateName: String, prefix: String = "ALC", postfix: String = "", init: (NativeClass.() -> Unit)? = null) =
	nativeClass(OPENAL_PACKAGE, templateName, prefix = prefix, prefixTemplate = "ALC", postfix = postfix, binding = ALCBinding, init = init)