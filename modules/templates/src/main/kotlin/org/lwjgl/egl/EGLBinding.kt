/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.egl

import org.lwjgl.generator.*
import java.io.PrintWriter
import java.util.regex.Pattern

val NativeClass.capName: String
	get() = if ( templateName.startsWith(prefixTemplate) ) templateName else "${prefixTemplate}_$templateName"

private val CAPABILITIES_CLASS = "EGLCapabilities"

private val EGLBinding = Generator.register(object : APIBinding(EGL_PACKAGE, CAPABILITIES_CLASS) {

	override fun PrintWriter.generateFunctionGetters(nativeClass: NativeClass) {
		println("\t// --- [ Function Addresses ] ---\n")

		println("\t/** Returns the {@link ${nativeClass.className}} instance. */")
		println("\tpublic static ${nativeClass.className} getInstance() {")
		println("\t\treturn checkFunctionality(EGL.getCapabilities().__${nativeClass.className});")
		println("\t}\n")
	}

	override fun PrintWriter.generateContent() {
		println("""/** Defines the capabilities of an EGLDisplay or the EGL client library. */""")
		println("public class $CAPABILITIES_CLASS {\n")

		val classes = super.getClasses { o1, o2 ->
			// Core functionality first, extensions after
			val isEGL1 = o1.templateName.startsWith("EGL")
			val isEGL2 = o2.templateName.startsWith("EGL")

			if ( isEGL1 xor isEGL2 )
				(if ( isEGL1 ) -1 else 1)
			else
				o1.templateName.compareTo(o2.templateName, ignoreCase = true)
		}

		val classesWithFunctions = classes.filter { it.hasNativeFunctions }
		val alignment = classesWithFunctions.map { it.className.length() }.fold(0) { left, right -> Math.max(left, right) }
		for ( extension in classesWithFunctions ) {
			print("\tfinal ${extension.className}")
			for ( i in 0..(alignment - extension.className.length() - 1) )
				print(' ')
			println(" __${extension.className};")
		}

		println("""
	/** The EGL major version. */
	public final int majorVersion;

	/** The EGL minor version. */
	public final int minorVersion;
""")

		classes forEach {
			val documentation = it.documentation
			if ( documentation != null )
				println((if ( it.hasBody ) "When true, {@link ${it.className}} is supported." else documentation).toJavaDoc())
			println("\tpublic final boolean ${it.capName};")
		}

		println("""
	/**
	 * Creates an $CAPABILITIES_CLASS instance for the EGL client.
	 *
	 * <p>The function instances created here will be reused by $CAPABILITIES_CLASS instances for EGLDisplays.</p>
	 *
	 * <p>Querying EGL client library extensions depends on EGL 1.5 or the {@link #EGL_EXT_client_extensions} extension. If neither is supported, all flags
	 * will be false and the version fields zero.</p>
	 *
	 * @param majorVersion the EGL client major version
	 * @param minorVersion the EGL client minor version
	 * @param ext          the available EGL client extensions
	 * @param provider     the EGL client function provider
	 */
	$CAPABILITIES_CLASS(int majorVersion, int minorVersion, Set<String> ext, FunctionProvider provider) {
		this.majorVersion = majorVersion;
		this.minorVersion = minorVersion;
""")
		for ( capability in classes.asSequence().filter { it.hasNativeFunctions } ) {
			val className = if ( capability.capName == capability.className )
				"$EGL_PACKAGE.${capability.className}"
			else
				capability.className
			println("\t\t__${capability.className} = new $className(provider);")
		}

		println()

		for ( capability in classes ) {
			val capName = capability.capName
			println(
				if ( capability.hasNativeFunctions ) {
					"\t\t$capName = EGL.checkCapability(ext, \"$capName\", __${capability.className}) != null;"
				} else
					"\t\t$capName = ext.contains(\"$capName\");"
			)
		}
		println("\t}")

		// Display constructor
		println("""
	/**
	 * Creates an $CAPABILITIES_CLASS instance for an EGLDisplay.
	 *
	 * @param majorVersion the EGL major version
	 * @param minorVersion the EGL minor version
	 * @param ext          the extensions string
	 * @param caps         an EGL client capabilities instance
	 */
	$CAPABILITIES_CLASS(int majorVersion, int minorVersion, Set<String> ext, $CAPABILITIES_CLASS caps) {
		this.majorVersion = majorVersion;
		this.minorVersion = minorVersion;
""")
		for ( capability in classes ) {
			val capName = capability.capName
			println(
				if ( capability.hasNativeFunctions )
					"\t\t$capName = (__${capability.className} = EGL.checkCapability(ext, \"$capName\", caps.__${capability.className})) != null;"
				else
					"\t\t$capName = ext.contains(\"$capName\");"
			)
		}
		println("\t}")
		print("\n}")
	}

})

fun String.nativeClassEGL(
	templateName: String,
	nativeSubPath: String = "",
	prefix: String = "EGL",
	prefixMethod: String = prefix.toLowerCase(),
	postfix: String = "",
	init: (NativeClass.() -> Unit)? = null
) = nativeClass(
	EGL_PACKAGE,
	templateName,
	nativeSubPath = nativeSubPath,
	prefix = prefix,
	prefixMethod = prefixMethod,
	postfix = postfix,
	binding = EGLBinding,
	init = init
)

private val REGISTRY_PATTERN = Pattern.compile("([A-Z]+)_(\\w+)")
val NativeClass.registryLink: String get() {
	val matcher = REGISTRY_PATTERN.matcher(templateName)
	if ( !matcher.matches() )
		throw IllegalStateException("Non-standard extension name: $templateName")
	return url("https://www.khronos.org/registry/egl/extensions/${matcher.group(1)}/EGL_$templateName.txt", templateName)
}

fun NativeClass.registryLink(prefix: String, name: String): String = registryLinkTo(prefix, name, templateName)
private fun registryLinkTo(prefix: String, name: String, extensionName: String = "${prefix}_$name"): String =
	url("https://www.khronos.org/registry/egl/extensions/$prefix/$name.txt", extensionName)

val NativeClass.core: String get() = "{@link ${this.className} EGL ${this.className[2]}.${this.className[3]}}"
val NativeClass.promoted: String get() = "Promoted to core in ${this.core}."