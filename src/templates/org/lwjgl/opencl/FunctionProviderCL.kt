/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl

import java.io.PrintWriter
import java.util.Comparator
import org.lwjgl.generator.*
import org.lwjgl.generator.opengl.*

private val NativeClass.capName: String
	get() = if ( templateName.startsWith(prefixTemplate) ) {
		if ( prefix == "CL" )
			"OpenCL${templateName.substring(2)}"
		else
			templateName.toLowerCase()
	} else {
		"${prefixTemplate}_$templateName".toLowerCase()
	}

public val FunctionProviderCL: FunctionProvider = object : FunctionProvider() {

	override val isLocal: Boolean = true
	override val hasCurrentCapabilities: Boolean = false

	override fun printFunctionsParams(writer: PrintWriter, nativeClass: NativeClass) {
		if ( !nativeClass.templateName.startsWith("CL") )
			writer.print(", long platform")
	}

	override fun getFunctionAddressCall(function: NativeClassFunction): String =
		if ( function.nativeClass.templateName.startsWith("CL") )
			"provider.getFunctionAddress(\"${function.name}\")"
		else
			"provider.getFunctionAddress(platform, \"${function.name}\")"

	override fun generateFunctionGetters(writer: PrintWriter, nativeClass: NativeClass): Unit = writer.generateFunctionGettersImpl(nativeClass)
	private fun PrintWriter.generateFunctionGettersImpl(nativeClass: NativeClass) {
		println("\t// --- [ Function Addresses ] ---\n")

		println("\t/** Returns the {@link Functions} instance for the CL platform or device that corresponds to the given {@link CLObject}. */")
		println("\tpublic static Functions getInstance(CLObject object) {")
		println("\t\treturn object.getCapabilities().__${nativeClass.className};")
		println("\t}")

		val functions = nativeClass.functions
		val capName = nativeClass.capName
		val isExtension = !nativeClass.templateName.startsWith("CL")

		println("\n\tstatic Functions create(java.util.Set<String> ext, FunctionProviderLocal provider${if ( isExtension ) ", long platform" else ""}) {")
		println("\t\tif ( !ext.contains(\"$capName\") ) return null;")

		print("\n\t\tFunctions funcs = new Functions(provider")
		if ( isExtension ) print(", platform")
		println(");")

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

			print("funcs.${functions[i].name} != 0L")
			println(if ( i == functions.lastIndex ) ";" else " &&")
		}

		print("\n\t\treturn CL.checkExtension(\"")
		print(capName);
		println("\", funcs, supported);")
		println("\t}\n")
	}

	override fun generateCapabilities(writer: PrintWriter): Unit = writer.generateCapabilitiesImpl()
	private fun PrintWriter.generateCapabilitiesImpl() {
		print(HEADER)
		println("package org.lwjgl.opencl;\n")

		println("import org.lwjgl.system.*;\n")

		println("import java.util.Set;\n")

		println("/** Defines the capabilities of an OpenCL platform. */")
		println("""/**
 * Defines the capabilities of an OpenCL platform or device.
 * <p/>
 * The instance returned by {@link CLPlatform#getCapabilities()} )} exposes the functionality present on either the platform or any of its devices. This is
 * unlike the {@link CL10#CL_PLATFORM_EXTENSIONS} string, which returns only platform functionality, supported across all platform devices.
 * <p/>
 * The instance returned by {@link CLDevice#getCapabilities()} exposes only the functionality available on that particular device.
 * <p/>
 * The instance returned by any other OpenCL object will be the instance of its parent object.
 */""")
		println("public class CLCapabilities {\n")

		val classes = super.getClasses(object : Comparator<NativeClass> {
			// Core functionality first, extensions after
			public override fun compare(o1: NativeClass, o2: NativeClass): Int {
				val isCL1 = o1.templateName.startsWith("CL")
				val isCL2 = o2.templateName.startsWith("CL")

				return if ( isCL1 xor isCL2 )
					(if ( isCL1 ) -1 else 1)
				else
					o1.templateName.compareTo(o2.templateName)
			}
		})

		val classesWithFunctions = classes.filter { it.hasNativeFunctions }
		val alignment = classesWithFunctions.map { it.className.size }.fold(0) { (left, right) -> Math.max(left, right) }
		for ( extension in classesWithFunctions ) {
			print("\tfinal ${extension.className}.Functions")
			for ( i in 0..(alignment - extension.className.size - 1) )
				print(' ')
			println(" __${extension.className};")
		}

		println("""
	/** The OpenCL major version. */
	public final int majorVersion;

	/** The OpenCL minor version. */
	public final int minorVersion;
""")

		println("\t/** Indicates whether an OpenCL functionality is available or not. */")
		println("\tpublic final boolean")
		for ( i in classes.indices ) {
			print("\t\t${classes[i].capName}")
			println(if ( i == classes.lastIndex ) ";" else ",")
		}

		println("""
	CLCapabilities(long platform, int majorVersion, int minorVersion, Set<String> ext) {
		this.majorVersion = majorVersion;
		this.minorVersion = minorVersion;

		FunctionProviderLocal provider = CL.getFunctionProvider();
""")
		for ( extension in classes ) {
			val capName = extension.capName
			if ( extension.hasNativeFunctions ) {
				println("\t\t$capName = (__${extension.className} = ${extension.className}.create(ext, provider${if ( extension.templateName.startsWith("CL") ) "" else ", platform"})) != null;")
			} else
				println("\t\t$capName = ext.contains(\"$capName\");")
		}
		println("\t}")

		println("""
	CLCapabilities(int majorVersion, int minorVersion, Set<String> ext, CLPlatform platform) {
		this.majorVersion = majorVersion;
		this.minorVersion = minorVersion;
		CLCapabilities caps = platform.getCapabilities();
""")
		for ( extension in classes ) {
			val capName = extension.capName
			if ( extension.hasNativeFunctions ) {
				println("\t\t$capName = (__${extension.className} = ext.contains(\"$capName\") ? caps.__${extension.className} : null) != null;")
			} else
				println("\t\t$capName = ext.contains(\"$capName\");")
		}
		println("\t}")

		println("""
	public String toString() {
		StringBuilder buf = new StringBuilder(512);

		buf.append("OpenCL ").append(majorVersion).append('.').append(minorVersion);
		buf.append(" - Extensions: ");
""")
		for ( extension in classes ) {
			if ( extension.templateName.startsWith("CL") )
				continue

			val capName = extension.capName
			println("\t\tif ( $capName ) buf.append(\"$capName \");")
		}
		println("""
		return buf.toString();
	}

""")

		print("}")
	}

}

// DSL Extensions

public fun String.nativeClassCL(templateName: String, postfix: String = "", init: (NativeClass.() -> Unit)? = null): NativeClass =
	nativeClass("org.lwjgl.opencl", templateName, prefix = "CL", postfix = postfix, functionProvider = FunctionProviderCL, init = init)

public val NativeClass.extensionLink: String
	get() = link("http://www.khronos.org/registry/cl/extensions/khr/cl_$templateName.txt", templateName)

public val NativeClass.extensionName: String
	get() = "<strong>$templateName</strong>"