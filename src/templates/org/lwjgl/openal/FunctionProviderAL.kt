/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal

import java.io.PrintWriter
import java.util.Comparator
import org.lwjgl.generator.*

public val FunctionProviderAL: FunctionProvider = object : FunctionProvider() {

	override fun generateFunctionGetters(writer: PrintWriter, nativeClass: NativeClass): Unit = writer.generateFunctionGettersImpl(nativeClass)
	private fun PrintWriter.generateFunctionGettersImpl(nativeClass: NativeClass) {
		println("\t// --- [ Function Addresses ] ---\n")

		println("\t/** Returns the {@link Functions} instance for the current context. */")
		println("\tpublic static Functions getInstance() {")
		println("\t\treturn AL.getCapabilities().__${nativeClass.className};")
		println("\t}")

		val functions = nativeClass.functions
		val capName = nativeClass.capName("AL")

		print("\n\tstatic Functions create(java.util.Set<String> ext, FunctionProvider provider")
		println(") {")
		println("\t\tif ( !ext.contains(\"$capName\") ) return null;")

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
			if ( functions[i] has DependsOn ) {
				if ( !isSpecial ) {
					isSpecial = true
					print("(")
				}
				print("!ext.contains(\"${functions[i][DependsOn].reference}\") || ")
			}

			print("funcs.${functions[i].name} != 0L")

			if ( isSpecial ) print(')')
			println(if ( i == functions.lastIndex ) ";" else " &&")
		}

		print("\n\t\treturn AL.checkExtension(\"")
		print(capName);
		println("\", funcs, supported);")
		println("\t}\n")
	}

	override fun generateCapabilities(writer: PrintWriter): Unit = writer.generateCapabilitiesImpl()
	private fun PrintWriter.generateCapabilitiesImpl() {
		print(HEADER)
		println("package org.lwjgl.openal;\n")

		println("import org.lwjgl.system.*;\n")

		println("import java.util.Set;\n")

		println("/** Defines the capabilities of an OpenAL context. */")
		println("public final class ALCapabilities {\n")

		val classes = super.getClasses(object : Comparator<NativeClass> {
			// Core functionality first, extensions after
			public override fun compare(o1: NativeClass, o2: NativeClass): Int {
				val isAL1 = o1.templateName.startsWith("AL")
				val isAL2 = o2.templateName.startsWith("AL")

				return if ( isAL1 xor isAL2 )
					(if ( isAL1 ) -1 else 1)
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

		println("\n\t/** Indicates whether an OpenAL functionality is available or not. */")
		println("\tpublic final boolean")
		val capClasses = classes.filter { it.prefixTemplate == "AL" }
		for ( i in capClasses.indices ) {
			print("\t\t${capClasses[i].capName("AL")}")
			println(if ( i == capClasses.lastIndex ) ";" else ",")
		}

		println("\n\tALCapabilities(Set<String> ext) {")
		println("\t\tFunctionProvider provider = AL.getFunctionProvider();\n")
		for ( extension in classes ) {
			val hasCap = extension.prefixTemplate == "AL"
			val capName = extension.capName(extension.prefixTemplate)

			if ( !hasCap ) {
				println("\t\tif ( ${extension.prefixTemplate}.getCapabilities().$capName )")
				println("\t\t\text.add(\"$capName\");")
			}

			if ( extension.hasNativeFunctions ) {
				print("\t\t")
				if ( hasCap )
					print("$capName = (")
				print("__${extension.className} = ${extension.className}.create(ext, provider)")
				if ( hasCap )
					print(") != null")
				println(";")
			} else if ( hasCap )
				println("\t\t$capName = ext.contains(\"$capName\");")
		}
		println("\t}")
		print("}")
	}

}

// DSL Extensions

public fun String.nativeClassAL(templateName: String, prefixTemplate: String = "AL", postfix: String = "", init: (NativeClass.() -> Unit)? = null): NativeClass =
	nativeClass("org.lwjgl.openal", templateName, prefix = "AL", prefixTemplate = prefixTemplate, postfix = postfix, functionProvider = FunctionProviderAL, init = init)