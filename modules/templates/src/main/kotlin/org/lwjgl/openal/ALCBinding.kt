/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal

import java.io.PrintWriter
import org.lwjgl.generator.*

fun NativeClass.capName(core: String) =
	if ( templateName.startsWith(prefixTemplate) ) {
		if ( prefix == core )
			"Open$core${templateName.substring(core.length)}"
		else
			templateName
	} else {
		"${prefixTemplate}_$templateName"
	}

private val NativeClass.isCore: Boolean get()= templateName.startsWith("ALC")

private val ALC_CAP_CLASS = "ALCCapabilities"

val ALCBinding = Generator.register(object : APIBinding(OPENAL_PACKAGE, ALC_CAP_CLASS, callingConvention = CallingConvention.DEFAULT) {

	override fun isLocal(nativeClass: NativeClass) = !nativeClass.isCore

	override fun printConstructorParams(writer: PrintWriter, nativeClass: NativeClass) {
		if ( !nativeClass.isCore )
			writer.print(", long device")
	}

	override fun getFunctionAddressCall(function: NativeClassFunction) =
		if ( function.nativeClass.isCore )
			super.getFunctionAddressCall(function);
		else
			"provider.getFunctionAddress(device, ${function.nativeName})"

	override fun PrintWriter.generateFunctionGetters(nativeClass: NativeClass) {
		println("\t// --- [ Function Addresses ] ---")
		println("""
	/** Returns the {@link ${nativeClass.className}} instance of the current context. */
	public static ${nativeClass.className} getInstance() {
		return getInstance(ALC.getCapabilities());
	}

	/** Returns the {@link ${nativeClass.className}} instance of the specified {@link $ALC_CAP_CLASS}. */
	public static ${nativeClass.className} getInstance($ALC_CAP_CLASS caps) {
		return checkFunctionality(caps.__${nativeClass.className});
	}""")

		val capName = nativeClass.capName("ALC")

		println("\n\tstatic ${nativeClass.className} create(java.util.Set<String> ext, FunctionProviderLocal provider, long device) {")
		println("\t\tif ( device != 0L && !ext.contains(\"$capName\") ) return null;")

		print("\n\t\t${nativeClass.className} funcs = new ${nativeClass.className}(provider")
		if ( !nativeClass.isCore ) print(", device")
		println(");")

		print("\n\t\tboolean supported = checkFunctions(")
		nativeClass.printPointers(this, printPointer = {
			if ( it has DependsOn )
				"ext.contains(\"${it[DependsOn].reference}\") ? funcs.${it.simpleName} : -1L"
			else
				"funcs.${it.simpleName}"
		})
		println(");")

		print("\n\t\treturn device == 0L && !supported ? null : ALC.checkExtension(\"")
		print(capName);
		println("\", funcs, supported);")
		println("\t}\n")
	}

	override fun PrintWriter.generateContent() {
		println("/** Defines the capabilities of the OpenAL Context API. */")
		println("public final class $ALC_CAP_CLASS {\n")

		val classes = super.getClasses { o1, o2 ->
			// Core functionality first, extensions after
			val isALC1 = o1.isCore
			val isALC2 = o2.isCore

			if ( isALC1 xor isALC2 )
				(if ( isALC1 ) -1 else 1)
			else
				o1.templateName.compareTo(o2.templateName, ignoreCase = true)
		}

		val classesWithFunctions = classes.filter { it.hasNativeFunctions && it.prefix == "ALC" }
		val alignment = classesWithFunctions.map { it.className.length }.fold(0) { left, right -> Math.max(left, right) }
		for ( extension in classesWithFunctions ) {
			print("\tfinal ${extension.className}")
			for ( i in 0..(alignment - extension.className.length - 1) )
				print(' ')
			println(" __${extension.className};")
		}

		println("\n\t/** Indicates whether an ALC functionality is available or not. */")
		println("\tpublic final boolean")
		for ( i in classes.indices ) {
			print("\t\t${classes[i].capName("ALC")}")
			println(if ( i == classes.lastIndex ) ";" else ",")
		}

		println("\n\t$ALC_CAP_CLASS(FunctionProviderLocal provider, long device, Set<String> ext) {")
		for ( extension in classes ) {
			val capName = extension.capName("ALC")
			if ( extension.hasNativeFunctions && extension.prefix == "ALC" ) {
				println("\t\t$capName = (__${extension.className} = ${extension.className}.create(ext, provider, device)) != null;")
			} else
				println("\t\t$capName = ext.contains(\"$capName\");")
		}
		println("\t}")
		print("}")
	}

})

// DSL Extensions

fun String.nativeClassALC(templateName: String, prefix: String = "ALC", postfix: String = "", init: (NativeClass.() -> Unit)? = null) =
	nativeClass(OPENAL_PACKAGE, templateName, prefix = prefix, prefixTemplate = "ALC", postfix = postfix, binding = ALCBinding, init = init)