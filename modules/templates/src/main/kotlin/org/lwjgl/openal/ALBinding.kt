/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal

import java.io.PrintWriter
import org.lwjgl.generator.*

private val CAPABILITIES_CLASS = "ALCapabilities"

private val ALBinding = Generator.register(object : APIBinding(OPENAL_PACKAGE, CAPABILITIES_CLASS, callingConvention = CallingConvention.DEFAULT) {

	override fun PrintWriter.generateFunctionGetters(nativeClass: NativeClass) {
		println("\t// --- [ Function Addresses ] ---\n")

		println("\t/** Returns the {@link ${nativeClass.className}} instance of the current context. */")
		println("\tpublic static ${nativeClass.className} getInstance() {")
		println("\t\treturn checkFunctionality(AL.getCapabilities().__${nativeClass.className});")
		println("\t}")

		val capName = nativeClass.capName("AL")

		println("\n\tstatic ${nativeClass.className} create(java.util.Set<String> ext, FunctionProvider provider) {")
		println("\t\tif ( !ext.contains(\"$capName\") ) return null;")

		println("\n\t\t${nativeClass.className} funcs = new ${nativeClass.className}(provider);")

		print("\n\t\tboolean supported = checkFunctions(")
		nativeClass.printPointers(this, printPointer = {
			if ( it has DependsOn )
				"ext.contains(\"${it[DependsOn].reference}\") ? funcs.${it.simpleName} : -1L"
			else
				"funcs.${it.simpleName}"
		})
		println(");")

		print("\n\t\treturn AL.checkExtension(\"")
		print(capName);
		println("\", funcs, supported);")
		println("\t}\n")
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
		val alignment = classesWithFunctions.map { it.className.length }.fold(0) { left, right -> Math.max(left, right) }
		for ( extension in classesWithFunctions ) {
			print("\tfinal ${extension.className}")
			for ( i in 0..(alignment - extension.className.length - 1) )
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

		println("\n\t$CAPABILITIES_CLASS(FunctionProvider provider, Set<String> ext) {")
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

})

// DSL Extensions

fun String.nativeClassAL(templateName: String, prefixTemplate: String = "AL", postfix: String = "", init: (NativeClass.() -> Unit)? = null) =
	nativeClass(OPENAL_PACKAGE, templateName, prefix = "AL", prefixTemplate = prefixTemplate, postfix = postfix, binding = ALBinding, init = init)

val NativeClass.specLinkOpenALSoft: String get() = url("http://kcat.strangesoft.net/openal-extensions/$templateName.txt", templateName)