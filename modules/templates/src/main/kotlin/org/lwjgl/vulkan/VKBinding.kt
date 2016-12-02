/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.vulkan

import org.lwjgl.generator.*
import java.io.*

private val NativeClass.capName: String
	get() = if (templateName.startsWith(prefix)) {
		if (prefix == "VK")
			"Vulkan${templateName.substring(2)}"
		else
			templateName
	} else {
		"${prefixTemplate}_$templateName"
	}

private val CAPABILITIES_CLASS = "VKCapabilities"

val VK_BINDING = Generator.register(object : APIBinding(VULKAN_PACKAGE, CAPABILITIES_CLASS) {

	override val hasCapabilities: Boolean get() = true
	override val hasParameterCapabilities: Boolean = true

	override fun shouldCheckFunctionAddress(function: NativeClassFunction): Boolean = function.nativeClass.templateName != "VK10"

	override fun generateFunctionAddress(writer: PrintWriter, function: NativeClassFunction) {
		writer.print("\t\tlong $FUNCTION_ADDRESS = ")
		writer.println(if (function has Capabilities)
			"${function[Capabilities].expression}.${function.name};"
		else
			"${function.getParams { it.nativeType is ObjectType }.first().name}.getCapabilities().${function.name};")
	}

	override fun PrintWriter.generateFunctionSetup(nativeClass: NativeClass) {
		println("\n\tstatic boolean isAvailable($CAPABILITIES_CLASS caps) {")
		print("\t\treturn checkFunctions(")
		nativeClass.printPointers(this, { "caps.${it.name}" }) {
			!it.has(Macro)
		}
		println(");")
		println("\t}")
	}

	init {
		javaImport("static org.lwjgl.system.MemoryUtil.*")

		documentation = "Defines the capabilities of a Vulkan {@code VkInstance} or {@code VkDevice}."
	}

	override fun PrintWriter.generateJava() {
		generateJavaPreamble()
		println("public class $CAPABILITIES_CLASS {")

		val classes = super.getClasses { o1, o2 ->
			// Core functionality first, extensions after
			val isVK1 = o1.templateName.startsWith("VK")
			val isVK2 = o2.templateName.startsWith("VK")

			if (isVK1 xor isVK2)
				(if (isVK1) -1 else 1)
			else
				o1.templateName.compareTo(o2.templateName, ignoreCase = true)
		}

		classes.asSequence()
			.filter { it.hasNativeFunctions }
			.forEach {
				println("\n\t// ${it.templateName}")
				println("\tpublic final long")
				println(it.functions.asSequence()
					.filter { !it.has(Macro) }
					.map { it.name }
					.joinToString(",\n\t\t", prefix = "\t\t", postfix = ";")
				)
			}

		println("""
	/** The Vulkan API version number. */
	public final int apiVersion;
""")

		classes.forEach {
			println(it.getCapabilityJavadoc())
			println("\tpublic final boolean ${it.capName};")
		}

		println("""
	$CAPABILITIES_CLASS(FunctionProvider provider, int apiVersion, Set<String> ext) {
		this.apiVersion = apiVersion;

		boolean supported;""")
		classes.forEach {
			val capName = it.capName
			if (it.hasNativeFunctions) {
				println("\n\t\t{")
				if (it.templateName == "VK10") {
					println(it.functions.asSequence()
						.filter { !it.has(Macro) }
						.map { "${it.name} = provider.getFunctionAddress(${it.functionAddress});" }.joinToString("\n\t\t\t", prefix = "\t\t\t"))
					println("\t\t\t$capName = VK.checkExtension(\"$capName\", ${if (capName == it.className) "$VULKAN_PACKAGE.${it.className}" else it.className}.isAvailable(this));")
				} else {
					println("\t\t\tsupported = ext.contains(\"$capName\");")
					println(it.functions.asSequence()
						.filter { !it.has(Macro) }
						.map { "${it.name} = isSupported(provider, ${it.functionAddress}, supported);" }.joinToString("\n\t\t\t", prefix = "\t\t\t"))
					println("\t\t\t$capName = supported && VK.checkExtension(\"$capName\", ${if (capName == it.className) "$VULKAN_PACKAGE.${it.className}" else it.className}.isAvailable(this));")
				}
				print("\t\t}")
			} else {
				print("\n\t\t$capName = ext.contains(\"$capName\");")
			}
		}
		println("""
	}

	private static long isSupported(FunctionProvider provider, String functionName, boolean extensionSupported) {
		return extensionSupported ? provider.getFunctionAddress(functionName) : NULL;
	}

}""")
	}

})

// DSL Extensions

val GlobalCommand = Capabilities("VK.getGlobalCommands()")

fun String.nativeClassVK(
	templateName: String,
	nativeSubPath: String = "",
	prefix: String = "VK",
	prefixMethod: String = prefix.toLowerCase(),
	postfix: String = "",
	init: (NativeClass.() -> Unit)? = null
) = nativeClass(
	VULKAN_PACKAGE,
	templateName,
	nativeSubPath = nativeSubPath,
	prefix = prefix,
	prefixMethod = prefixMethod,
	postfix = postfix,
	binding = VK_BINDING,
	init = init
)