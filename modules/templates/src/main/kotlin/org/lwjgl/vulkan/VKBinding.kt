/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.vulkan

import org.lwjgl.generator.*
import java.io.PrintWriter

private val NativeClass.capName: String
	get() = if ( templateName.startsWith(prefix) ) {
		if ( prefix == "VK" )
			"Vulkan${templateName.substring(2)}"
		else
			templateName
	} else {
		"${prefixTemplate}_$templateName"
	}

private val CAPABILITIES_CLASS = "VKCapabilities"

val VK_BINDING = Generator.register(object : APIBinding(VULKAN_PACKAGE, CAPABILITIES_CLASS) {

	override val hasCurrentCapabilities: Boolean get() = false

	override fun PrintWriter.generateFunctionGetters(nativeClass: NativeClass) {
		println("\t// --- [ Function Addresses ] ---")
		println("""
	/** Returns the {@link ${nativeClass.className}} instance from the specified dispatchable handle. */
	public static ${nativeClass.className} getInstance(DispatchableHandle handle) {
		return getInstance(handle.getCapabilities());
	}

	/** Returns the {@link ${nativeClass.className}} instance of the specified {@link $CAPABILITIES_CLASS}. */
	public static ${nativeClass.className} getInstance($CAPABILITIES_CLASS caps) {
		return checkFunctionality(caps.__${nativeClass.className});
	}""")

		print("""
	static ${nativeClass.className} create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("${nativeClass.capName}") )
			return null;

		return VK.checkExtension("${nativeClass.capName}", create(provider));
	}

	static ${nativeClass.className} create(FunctionProvider provider) {
		${nativeClass.className} funcs = new ${nativeClass.className}(provider);

		boolean supported = checkFunctions(""")
		nativeClass.printPointers(this)
		println(""");

		return supported ? funcs : null;
	}
""")
	}

	override fun PrintWriter.generateContent() {
		println("/** Defines the capabilities of a Vulkan {@code VkInstance} or {@code VkDevice}. */")
		println("public class $CAPABILITIES_CLASS {\n")

		val classes = super.getClasses { o1, o2 ->
			// Core functionality first, extensions after
			val isVK1 = o1.templateName.startsWith("VK")
			val isVK2 = o2.templateName.startsWith("VK")

			if ( isVK1 xor isVK2 )
				(if ( isVK1 ) -1 else 1)
			else
				o1.templateName.compareTo(o2.templateName, ignoreCase = true)
		}

		val classesWithFunctions = classes.filter { it.hasNativeFunctions }
		val alignment = classesWithFunctions.map { it.className.length }.fold(0) { left, right -> Math.max(left, right) }
		for (extension in classesWithFunctions) {
			print("\tfinal ${extension.className}")
			for (i in 0..(alignment - extension.className.length - 1))
				print(' ')
			println(" __${extension.className};")
		}

		println("""
	/** The Vulkan API version number. */
	public final int apiVersion;
""")

		classes.forEach {
			val documentation = it.documentation
			if ( documentation != null )
				println((if ( it.hasBody ) "When true, {@link ${it.className}} is supported." else documentation).toJavaDoc())
			println("\tpublic final boolean ${it.capName};")
		}

		println("""
	$CAPABILITIES_CLASS(FunctionProvider provider) {
		this.apiVersion = 0;
""")
		for (extension in classes) {
			val capName = extension.capName
			if ( extension.hasNativeFunctions ) {
				println("\t\t$capName = (__${extension.className} = ${extension.className}.create(provider)) != null;")
			} else
				println("\t\t$capName = false;")
		}
		println("\t}")

		println("""
	$CAPABILITIES_CLASS(int apiVersion, Set<String> ext, FunctionProvider provider) {
		this.apiVersion = apiVersion;
""")
		for (extension in classes) {
			val capName = extension.capName
			if ( extension.hasNativeFunctions ) {
				println("\t\t$capName = (__${extension.className} = ${if ( capName == extension.className ) "$VULKAN_PACKAGE.${extension.className}" else extension.className}.create(ext, provider)) != null;")
			} else
				println("\t\t$capName = ext.contains(\"${extension.capName}\");")
		}
		println("\t}")
		print("\n}")
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

val must = "<b>must</b>"
val must_not = "<b>must not</b>"
val should = "<b>should</b>"
val should_not = "<b>should not</b>"
val may = "<b>may</b>"
val can = "<b>can</b>"
val cannot = "<b>cannot</b>"