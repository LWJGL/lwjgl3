/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl

import org.lwjgl.generator.*
import java.io.PrintWriter
import java.util.*
import java.util.regex.Pattern

val NativeClass.capName: String
	get() = if ( templateName.startsWith(prefixTemplate) ) {
		if ( prefix == "GL" )
			"OpenGL${templateName.substring(2)}"
		else
			templateName
	} else {
		"${prefixTemplate}_$templateName"
	}

private val CAPABILITIES_CLASS = "GLCapabilities"

private object BufferOffsetTransform : FunctionTransform<Parameter>, SkipCheckFunctionTransform {
	override fun transformDeclaration(param: Parameter, original: String) = "long ${param.name}"
	override fun transformCall(param: Parameter, original: String) = "${param.name}"
}

val GLBinding = Generator.register(object : APIBinding(OPENGL_PACKAGE, CAPABILITIES_CLASS) {

	init {
		Generator.registerTLS(
			"org.lwjgl.opengl.*",
			"public GLCapabilities capsGL;"
		)

		javaImport(
			"static org.lwjgl.system.APIUtil.*",
			"static org.lwjgl.system.MemoryUtil.*"
		)
	}

	private val GLCorePattern = Pattern.compile("GL[1-9][0-9]")

	override val hasCapabilities: Boolean get() = true

	override fun generateAlternativeMethods(writer: PrintWriter, function: NativeClassFunction, transforms: MutableMap<QualifiedType, FunctionTransform<out QualifiedType>>) {
		val boParams = function.getParams { it has BufferObject && it.nativeType.mapping != PrimitiveMapping.POINTER && it.nativeType !is ArrayType }
		if ( boParams.any() ) {
			boParams.forEach { transforms[it] = BufferOffsetTransform }
			function.generateAlternativeMethod(writer, function.name, transforms)
			boParams.forEach { transforms.remove(it) }
		}
	}

	override fun addParameterChecks(
		checks: MutableList<String>,
		mode: GenerationMode,
		parameter: Parameter,
		hasTransform: Parameter.(FunctionTransform<Parameter>) -> Boolean
	) {
		if ( !parameter.has(BufferObject) )
			return

		when {
			mode === GenerationMode.NORMAL
			     -> "GLChecks.ensureBufferObject(${parameter[BufferObject].binding}, ${parameter.nativeType.mapping === PrimitiveMapping.POINTER});"
			parameter.nativeType.mapping !== PrimitiveMapping.POINTER
			     -> "GLChecks.ensureBufferObject(${parameter[BufferObject].binding}, ${parameter.hasTransform(BufferOffsetTransform)});"
			else -> null
		}?.let {
			if ( !checks.contains(it) )
				checks.add(it)
		}
	}

	override fun printCustomJavadoc(writer: PrintWriter, function: NativeClassFunction, documentation: String): Boolean {
		if ( GLCorePattern.matcher(function.nativeClass.className).matches() ) {
			val xmlName = if ( function has ReferenceGL )
				function[ReferenceGL].function
			else
				function.stripPostfix(stripType = true)
			writer.printOpenGLJavaDoc(documentation, xmlName, function has DeprecatedGL)
			return true
		}
		return false
	}

	private val Iterable<NativeClassFunction>.hasDeprecated: Boolean
		get() = this.any { it has DeprecatedGL }

	override fun shouldCheckFunctionAddress(function: NativeClassFunction): Boolean = function.nativeClass.templateName != "GL11" || function has DeprecatedGL

	override fun generateFunctionAddress(writer: PrintWriter, function: NativeClassFunction) {
		writer.println("\t\tlong $FUNCTION_ADDRESS = GL.getCapabilities().${function.name};")
	}

	override fun PrintWriter.generateFunctionSetup(nativeClass: NativeClass) {
		val hasDeprecated = nativeClass.functions.hasDeprecated

		print("\n\tstatic boolean isAvailable($CAPABILITIES_CLASS caps")
		if ( nativeClass.functions.any { it has DependsOn } ) print(", java.util.Set<String> ext")
		if ( hasDeprecated ) print(", boolean fc")
		println(") {")
		print("\t\treturn ")

		val printPointer = { func: NativeClassFunction ->
			if ( func has DependsOn )
				"${func[DependsOn].reference.let { if ( it.indexOf(' ') == -1 ) "ext.contains(\"$it\")" else it }} ? caps.${func.name} : -1L"
			else
				"caps.${func.name}"
		}

		if ( hasDeprecated ) {
			print("(fc || checkFunctions(")
			nativeClass.printPointers(this, printPointer) { it has DeprecatedGL }
			print(")) && ")
		}

		print("checkFunctions(")
		if ( hasDeprecated )
			nativeClass.printPointers(this, printPointer) { !(it has DeprecatedGL || it has IgnoreMissing) }
		else
			nativeClass.printPointers(this, printPointer) { !(it has IgnoreMissing) }
		println(");")
		println("\t}")
	}

	override fun PrintWriter.generateContent() {
		println("/** Defines the capabilities of an OpenGL context. */")
		println("public final class $CAPABILITIES_CLASS {\n")

		val classes = super.getClasses { o1, o2 ->
			// Core functionality first, extensions after
			val isGL1 = o1.templateName.startsWith("GL")
			val isGL2 = o2.templateName.startsWith("GL")

			if ( isGL1 xor isGL2 )
				(if ( isGL1 ) -1 else 1)
			else
				o1.templateName.compareTo(o2.templateName, ignoreCase = true)
		}

		val classesWithFunctions = classes.filter { it.hasNativeFunctions }

		val functions = classesWithFunctions
			.map { it.functions }
			.flatten()
			.toSortedSet(Comparator<NativeClassFunction> { o1, o2 -> o1.name.compareTo(o2.name) })

		println("\tpublic final long")
		println(functions.map { it.name }.joinToString(",\n\t\t", prefix = "\t\t", postfix = ";\n")
		)

		classes.forEach {
			println(it.getCapabilityJavadoc())
			println("\tpublic final boolean ${it.capName};")
		}

		println("\n\t/** When true, deprecated functions are not available. */")
		println("\tpublic final boolean forwardCompatible;")

		println("""
	$CAPABILITIES_CLASS(FunctionProvider provider, Set<String> ext, boolean fc) {
		forwardCompatible = fc;
""")

		println(functions.map {
			if ( it has DeprecatedGL )
				"${it.name} = getFunctionAddress(fc, provider, ${it.nativeName});"
			else
				"${it.name} = provider.getFunctionAddress(${it.nativeName});"
		}.joinToString(prefix = "\t\t", separator = "\n\t\t", postfix = "\n"))

		for (extension in classes) {
			val capName = extension.capName
			if ( extension.hasNativeFunctions ) {
				print("\t\t$capName = ext.contains(\"$capName\") && checkExtension(\"$capName\", ${if ( capName == extension.className ) "$OPENGL_PACKAGE.${extension.className}" else extension.className}.isAvailable(this")
				if ( extension.functions.any { it has DependsOn } ) print(", ext")
				if ( extension.functions.hasDeprecated ) print(", fc")
				println("));")
			} else
				println("\t\t$capName = ext.contains(\"$capName\");")
		}
		println("\t}")
		println("""
	private static long getFunctionAddress(boolean fc, FunctionProvider provider, String functionName) {
		return fc ? NULL : provider.getFunctionAddress(functionName);
	}

	private static boolean checkExtension(String extension, boolean supported) {
		if ( supported )
			return true;

		apiLog("[GL] " + extension + " was reported as available but an entry point is missing.");
		return false;
	}""")
		print("\n}")
	}

})

// DSL Extensions

fun String.nativeClassGL(
	templateName: String,
	prefix: String = "GL",
	prefixMethod: String = prefix.toLowerCase(),
	postfix: String = "",
	init: (NativeClass.() -> Unit)? = null
) = nativeClass(
	OPENGL_PACKAGE,
	templateName,
	prefix = prefix,
	prefixMethod = prefixMethod,
	postfix = postfix,
	binding = GLBinding,
	init = init
)

private val REGISTRY_PATTERN = Pattern.compile("([A-Z]+)_(\\w+)")
val NativeClass.registryLink: String get() {
	val matcher = REGISTRY_PATTERN.matcher(templateName)
	if ( !matcher.matches() )
		throw IllegalStateException("Non-standard extension name: $templateName")
	return url("http://www.opengl.org/registry/specs/${matcher.group(1)}/${matcher.group(2)}.txt", templateName)
}

fun NativeClass.registryLink(prefix: String, name: String): String = registryLinkTo(prefix, name, templateName)
fun registryLinkTo(prefix: String, name: String, extensionName: String = "${prefix}_$name"): String =
	url("http://www.opengl.org/registry/specs/$prefix/$name.txt", extensionName)

val NativeClass.core: String get() = "{@link ${this.className} OpenGL ${this.className[2]}.${this.className[3]}}"
val NativeClass.glx: String get() = "{@link ${this.className} GLX ${this.className[3]}.${this.className[4]}}"
val NativeClass.promoted: String get() = "Promoted to core in ${this.core}."