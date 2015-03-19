/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal

import java.io.PrintWriter
import java.util.Comparator
import org.lwjgl.generator.*

private val FunctionProviderAL = Generator.register(object : FunctionProvider(OPENAL_PACKAGE, "ALCapabilities") {

	override fun PrintWriter.generateFunctionGetters(nativeClass: NativeClass) {
		println("\t// --- [ Function Addresses ] ---\n")

		println("\t/** Returns the {@link ${nativeClass.className}} instance for the current context. */")
		println("\tpublic static ${nativeClass.className} getInstance() {")
		println("\t\treturn AL.getCapabilities().__${nativeClass.className};")
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
		println("public final class ALCapabilities {\n")

		val classes = super.getClasses { o1, o2 ->
			val isAL1 = o1.templateName.startsWith("AL")
			val isAL2 = o2.templateName.startsWith("AL")

			if ( isAL1 xor isAL2 )
				(if ( isAL1 ) -1 else 1)
			else
				o1.templateName compareToIgnoreCase o2.templateName
		}

		val classesWithFunctions = classes.filter { it.hasNativeFunctions }
		val alignment = classesWithFunctions.map { it.className.length() }.fold(0) { left, right -> Math.max(left, right) }
		for ( extension in classesWithFunctions ) {
			print("\tfinal ${extension.className}")
			for ( i in 0..(alignment - extension.className.length() - 1) )
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

		println("\n\tALCapabilities(FunctionProvider provider, Set<String> ext) {")
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

private fun String.nativeClassAL(templateName: String, prefixTemplate: String = "AL", postfix: String = "", init: (NativeClass.() -> Unit)? = null) =
	nativeClass(OPENAL_PACKAGE, templateName, prefix = "AL", prefixTemplate = prefixTemplate, postfix = postfix, functionProvider = FunctionProviderAL, init = init)

private val NativeClass.specLinkOpenALSoft: String get() = url("http://kcat.strangesoft.net/openal-extensions/$templateName.txt", templateName)