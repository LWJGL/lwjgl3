/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal

import java.io.PrintWriter
import java.util.Comparator
import org.lwjgl.generator.*

fun NativeClass.capName(core: String): String =
	if ( templateName.startsWith(prefixTemplate) ) {
		if ( prefix == core )
			"Open$core${templateName.substring(core.size)}"
		else
			templateName
	} else {
		"${prefixTemplate}_$templateName"
	}

val List<NativeClassFunction>.hasDependencies: Boolean
	get() = this.any { it has DependsOn.CLASS }

public val FunctionProviderALC: FunctionProvider = object : FunctionProvider() {

	override fun generateFunctionGetters(writer: PrintWriter, nativeClass: NativeClass): Unit = writer.generateFunctionGettersImpl(nativeClass)
	private fun PrintWriter.generateFunctionGettersImpl(nativeClass: NativeClass) {
		println("\t// --- [ Function Addresses ] ---\n")

		println("\t/** Returns the {@link Functions} instance for the current context. */")
		println("\tpublic static Functions getInstance() {")
		println("\t\treturn ALC.getCapabilities().__${nativeClass.className};")
		println("\t}")

		val functions = nativeClass.functions
		val capName = nativeClass.capName("ALC")

		val hasDependencies = functions.hasDependencies

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
			if ( functions[i] has DependsOn.CLASS ) {
				if ( !isSpecial ) {
					isSpecial = true
					print("(")
				}
				print("!ext.contains(\"${functions[i].get(DependsOn.CLASS).reference}\") || ")
			}

			print("funcs.${functions[i].name} != 0L")

			if ( isSpecial ) print(')')
			println(if ( i == functions.lastIndex ) ";" else " &&")
		}

		print("\n\t\treturn ALC.checkExtension(\"")
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

		println("/** Defines the capabilities of the OpenAL Context API. */")
		println("public final class ALCCapabilities {\n")

		val classes = super.getClasses(object : Comparator<NativeClass> {
			// Core functionality first, extensions after
			public override fun compare(o1: NativeClass, o2: NativeClass): Int {
				val isALC1 = o1.templateName.startsWith("ALC")
				val isALC2 = o2.templateName.startsWith("ALC")

				return if ( isALC1 xor isALC2 )
					(if ( isALC1 ) -1 else 1)
				else
					o1.className.compareTo(o2.className)
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

		println("\n\t/** Indicates whether an ALC functionality is available or not. */")
		println("\tpublic final boolean")
		for ( i in classes.indices ) {
			print("\t\t${classes[i].capName("ALC")}")
			println(if ( i == classes.lastIndex ) ";" else ",")
		}

		println("\n\tALCCapabilities(final Set<String> ext) {")
		println("\t\tfinal FunctionProvider provider = ALC.getFunctionProvider();\n")
		for ( extension in classes ) {
			val capName = extension.capName("ALC")
			if ( extension.hasNativeFunctions ) {
				val provider = if ( extension.prefix == "AL" ) // see ALC_EXT_EFX
					"AL.getFunctionProvider()"
				else
					"provider"
				println("\t\t$capName = (__${extension.className} = ${extension.className}.create(ext, $provider)) != null;")
			} else
				println("\t\t$capName = ext.contains(\"$capName\");")
		}
		println("\t}")
		print("}")
	}

}

// DSL Extensions

public fun String.nativeClassALC(templateName: String, postfix: String = "", init: NativeClass.() -> Unit): NativeClass =
	nativeClass("org.lwjgl.openal", templateName, "", "ALC", "ALC", postfix, FunctionProviderALC, init)