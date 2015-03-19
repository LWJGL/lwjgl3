/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal

import java.io.PrintWriter
import java.util.Comparator
import org.lwjgl.generator.*

private fun NativeClass.capName(core: String) =
	if ( templateName.startsWith(prefixTemplate) ) {
		if ( prefix == core )
			"Open$core${templateName.substring(core.length())}"
		else
			templateName
	} else {
		"${prefixTemplate}_$templateName"
	}

private val FunctionProviderALC = Generator.register(object : FunctionProvider(OPENAL_PACKAGE, "ALCCapabilities") {

	override val isLocal = true

	override fun printFunctionsParams(writer: PrintWriter, nativeClass: NativeClass) {
		if ( !nativeClass.templateName.startsWith("ALC") )
			writer.print(", long device")
	}

	override fun getFunctionAddressCall(function: NativeClassFunction) =
		if ( function.nativeClass.templateName.startsWith("ALC") )
			"provider.getFunctionAddress(\"${function.name}\")"
		else
			"provider.getFunctionAddress(device, \"${function.name}\")"

	override fun PrintWriter.generateFunctionGetters(nativeClass: NativeClass) {
		println("\t// --- [ Function Addresses ] ---\n")

		println("\t/** Returns the {@link ${nativeClass.className}} instance for the current context. */")
		println("\tpublic static ${nativeClass.className} getInstance() {")
		println("\t\treturn ALC.getCapabilities().__${nativeClass.className};")
		println("\t}")

		val capName = nativeClass.capName("ALC")
		val isExtension = !nativeClass.templateName.startsWith("ALC")

		println("\n\tstatic ${nativeClass.className} create(java.util.Set<String> ext, FunctionProviderLocal provider${if ( isExtension ) ", long device" else ""}) {")
		println("\t\tif ( !ext.contains(\"$capName\") ) return null;")

		print("\n\t\t${nativeClass.className} funcs = new ${nativeClass.className}(provider")
		if ( isExtension ) print(", device")
		println(");")

		print("\n\t\tboolean supported = checkFunctions(")
		nativeClass.printPointers(this, printPointer = {
			if ( it has DependsOn )
				"ext.contains(\"${it[DependsOn].reference}\") ? funcs.${it.simpleName} : -1L"
			else
				"funcs.${it.simpleName}"
		})
		println(");")

		print("\n\t\treturn ALC.checkExtension(\"")
		print(capName);
		println("\", funcs, supported);")
		println("\t}\n")
	}

	override fun PrintWriter.generateContent() {
		println("/** Defines the capabilities of the OpenAL Context API. */")
		println("public final class ALCCapabilities {\n")

		val classes = super.getClasses { o1, o2 ->
			// Core functionality first, extensions after
			val isALC1 = o1.templateName.startsWith("ALC")
			val isALC2 = o2.templateName.startsWith("ALC")

			if ( isALC1 xor isALC2 )
				(if ( isALC1 ) -1 else 1)
			else
				o1.templateName compareToIgnoreCase o2.templateName
		}

		val classesWithFunctions = classes.filter { it.hasNativeFunctions && it.prefix == "ALC" }
		val alignment = classesWithFunctions.map { it.className.length() }.fold(0) { left, right -> Math.max(left, right) }
		for ( extension in classesWithFunctions ) {
			print("\tfinal ${extension.className}")
			for ( i in 0..(alignment - extension.className.length() - 1) )
				print(' ')
			println(" __${extension.className};")
		}

		println("\n\t/** Indicates whether an ALC functionality is available or not. */")
		println("\tpublic final boolean")
		for ( i in classes.indices ) {
			print("\t\t${classes[i].capName("ALC")}")
			println(if ( i == classes.lastIndex ) ";" else ",")
		}

		println("\n\tALCCapabilities(FunctionProviderLocal provider, long device, Set<String> ext) {")
		for ( extension in classes ) {
			val capName = extension.capName("ALC")
			if ( extension.hasNativeFunctions && extension.prefix == "ALC" ) {
				println("\t\t$capName = (__${extension.className} = ${extension.className}.create(ext, provider${if ( extension.templateName.startsWith("ALC") ) "" else ", device"})) != null;")
			} else
				println("\t\t$capName = ext.contains(\"$capName\");")
		}
		println("\t}")
		print("}")
	}

})

// DSL Extensions

private fun String.nativeClassALC(templateName: String, prefix: String = "ALC", postfix: String = "", init: (NativeClass.() -> Unit)? = null) =
	nativeClass(OPENAL_PACKAGE, templateName, prefix = prefix, prefixTemplate = "ALC", postfix = postfix, functionProvider = FunctionProviderALC, init = init)