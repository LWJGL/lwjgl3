/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengles

import org.lwjgl.generator.*
import java.io.PrintWriter
import java.util.*
import java.util.regex.Pattern

val NativeClass.capName: String
	get() = if ( templateName.startsWith(prefixTemplate) ) templateName else "${prefixTemplate}_$templateName"

private val CAPABILITIES_CLASS = "GLESCapabilities"

private val GLESBinding = Generator.register(object : APIBinding(GLES_PACKAGE, CAPABILITIES_CLASS) {

	init {
		javaImport("static org.lwjgl.system.MemoryUtil.*")
	}

	private val BufferOffsetTransform: FunctionTransform<Parameter> = object : FunctionTransform<Parameter>, SkipCheckFunctionTransform {
		override fun transformDeclaration(param: Parameter, original: String) = "long ${param.name}Offset"
		override fun transformCall(param: Parameter, original: String) = "${param.name}Offset"
	}

	override val hasCapabilities: Boolean get() = true

	override fun generateAlternativeMethods(writer: PrintWriter, function: NativeClassFunction, transforms: MutableMap<QualifiedType, FunctionTransform<out QualifiedType>>) {
		val boParams = function.getParams { it has BufferObject && it.nativeType.mapping != PrimitiveMapping.POINTER }
		if ( boParams.any() ) {
			boParams.forEach { transforms[it] = BufferOffsetTransform }
			function.generateAlternativeMethod(writer, function.name, "Buffer object offset version of:", transforms)
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
			     -> "GLESChecks.ensureBufferObject(${parameter[BufferObject].binding}, ${parameter.nativeType.mapping === PrimitiveMapping.POINTER});"
			parameter.nativeType.mapping !== PrimitiveMapping.POINTER
			     -> "GLESChecks.ensureBufferObject(${parameter[BufferObject].binding}, ${parameter.hasTransform(BufferOffsetTransform)});"
			else -> null
		}?.let {
			if ( !checks.contains(it) )
				checks.add(it)
		}
	}

	override fun shouldCheckFunctionAddress(function: NativeClassFunction): Boolean = function.nativeClass.templateName != "GLES20"

	override fun generateFunctionAddress(writer: PrintWriter, function: NativeClassFunction) {
		writer.println("\t\tlong $FUNCTION_ADDRESS = GLES.getCapabilities().${function.name};")
	}

	override fun PrintWriter.generateFunctionSetup(nativeClass: NativeClass) {
		print("\tstatic boolean isAvailable($CAPABILITIES_CLASS caps")
		if ( nativeClass.functions.any { it has DependsOn } ) print(", java.util.Set<String> ext")
		println(") {")

		val printPointer = { func: NativeClassFunction ->
			if ( func has DependsOn )
				"${func[DependsOn].reference.let { if ( it.indexOf(' ') == -1 ) "ext.contains(\"$it\")" else it }} ? caps.${func.name} : -1L"
			else
				"caps.${func.name}"
		}

		print("\t\treturn checkFunctions(")
		nativeClass.printPointers(this, printPointer) { !it.has(IgnoreMissing) }
		println(");")
		println("\t}\n")
	}

	override fun PrintWriter.generateContent() {
		println("/** Defines the capabilities of an OpenGL ES context. */")
		println("public final class $CAPABILITIES_CLASS {\n")

		val classes = super.getClasses { o1, o2 ->
			// Core functionality first, extensions after
			val isGLES1 = o1.templateName.startsWith("GLES")
			val isGLES2 = o2.templateName.startsWith("GLES")

			if ( isGLES1 xor isGLES2 )
				(if ( isGLES1 ) -1 else 1)
			else
				o1.templateName.compareTo(o2.templateName, ignoreCase = true)
		}

		val classesWithFunctions = classes.filter { it.hasNativeFunctions }

		val addresses = classesWithFunctions
			.map { it.functions }
			.flatten()
			.toSortedSet(Comparator<NativeClassFunction> { o1, o2 -> o1.name.compareTo(o2.name) })

		println("\tpublic final long")
		println(addresses.map { it.name }.joinToString(",\n\t\t", prefix = "\t\t", postfix = ";\n"))

		classes.forEach {
			val documentation = it.documentation
			if ( documentation != null )
				println((if ( it.hasBody ) "When true, {@link ${it.className}} is supported." else documentation).toJavaDoc())
			println("\tpublic final boolean ${it.capName};")
		}

		println("\n\t$CAPABILITIES_CLASS(FunctionProvider provider, Set<String> ext) {")

		println(addresses.map { "${it.name} = provider.getFunctionAddress(${it.nativeName});" }.joinToString("\n\t\t", prefix = "\t\t", postfix = "\n"))

		for (extension in classes) {
			val capName = extension.capName
			if ( extension.hasNativeFunctions ) {
				print("\t\t$capName = ext.contains(\"$capName\") && GLES.checkExtension(\"$capName\", ${if ( capName == extension.className ) "$GLES_PACKAGE.${extension.className}" else extension.className}.isAvailable(this")
				if ( extension.functions.any { it has DependsOn } ) print(", ext")
				println("));")
			} else
				println("\t\t$capName = ext.contains(\"$capName\");")
		}
		println("\t}")
		print("}")
	}

})

fun String.nativeClassGLES(
	templateName: String,
	nativeSubPath: String = "",
	prefix: String = "GL",
	prefixMethod: String = prefix.toLowerCase(),
	postfix: String = "",
	init: (NativeClass.() -> Unit)? = null
) = nativeClass(
	GLES_PACKAGE,
	templateName,
	nativeSubPath = nativeSubPath,
	prefix = prefix,
	prefixMethod = prefixMethod,
	postfix = postfix,
	binding = GLESBinding,
	init = init
)

val NativeClass.capLink: String get() = "{@link $CAPABILITIES_CLASS\\#$capName $templateName}"

private val REGISTRY_PATTERN = Pattern.compile("([A-Z]+)_(\\w+)")
val NativeClass.registryLink: String get() {
	val matcher = REGISTRY_PATTERN.matcher(templateName)
	if ( !matcher.matches() )
		throw IllegalStateException("Non-standard extension name: $templateName")
	return url("https://www.khronos.org/registry/gles/extensions/${matcher.group(1)}/$templateName.txt", templateName)
}

fun NativeClass.registryLink(prefix: String, name: String): String =
	url("https://www.khronos.org/registry/gles/extensions/$prefix/$name.txt", templateName)

val NativeClass.core: String get() = "{@link ${this.className} GLES ${this.className[4]}.${this.className[5]}}"
val NativeClass.promoted: String get() = "Promoted to core in ${this.core}."