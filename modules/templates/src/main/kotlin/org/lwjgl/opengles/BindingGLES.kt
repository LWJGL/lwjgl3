/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengles

import org.lwjgl.generator.*
import java.io.PrintWriter
import java.util.regex.Pattern

private val NativeClass.capName: String
	get() = if ( templateName.startsWith(prefixTemplate) ) templateName else "${prefixTemplate}_$templateName"

private val CAPABILITIES_CLASS = "GLESCapabilities"

private val BindingGLES = Generator.register(object: APIBinding(GLES_PACKAGE, "GLESCapabilities") {

	private val BufferOffsetTransform: FunctionTransform<Parameter> = object: FunctionTransform<Parameter>, SkipCheckFunctionTransform {
		override fun transformDeclaration(param: Parameter, original: String) = "long ${param.name}Offset"
		override fun transformCall(param: Parameter, original: String) = "${param.name}Offset"
	}

	override fun generateAlternativeMethods(writer: PrintWriter, function: NativeClassFunction, transforms: MutableMap<QualifiedType, FunctionTransform<out QualifiedType>>) {
		val boParams = function.getParams { it has BufferObject && it.nativeType.mapping != PrimitiveMapping.POINTER }
		if ( boParams.any() ) {
			boParams forEach { transforms[it] = BufferOffsetTransform }
			function.generateAlternativeMethod(writer, function.name, "Buffer object offset version of:", transforms)
			boParams forEach { transforms remove it }
		}
	}

	override fun PrintWriter.generateFunctionGetters(nativeClass: NativeClass) {
		println("\t// --- [ Function Addresses ] ---\n")

		println("\t/** Returns the {@link ${nativeClass.className}} instance for the current context. */")
		println("\tpublic static ${nativeClass.className} getInstance() {")
		println("\t\treturn checkFunctionality(GLES.getCapabilities().__${nativeClass.className});")
		println("\t}")

		println("\n\tstatic ${nativeClass.className} create(java.util.Set<String> ext, FunctionProvider provider) {")
		println("\t\tif ( !ext.contains(\"${nativeClass.capName}\") ) return null;")

		print("\n\t\t${nativeClass.className} funcs = new ${nativeClass.className}(provider);")

		print("\n\t\tboolean supported = ")

		val printPointer = { func: NativeClassFunction ->
			if ( func has DependsOn )
				"${func[DependsOn].reference let { if ( it.indexOf(' ') == -1 ) "ext.contains(\"$it\")" else it }} ? funcs.${func.simpleName} : -1L"
			else
				"funcs.${func.simpleName}"
		}

		print("checkFunctions(")
		nativeClass.printPointers(this, printPointer) { !(it has ignoreMissing) }
		println(");")

		print("\n\t\treturn GLES.checkExtension(\"")
		print(nativeClass.capName);
		println("\", funcs, supported);")
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
		val alignment = classesWithFunctions.map { it.className.length() }.fold(0) { left, right -> Math.max(left, right) }
		for ( extension in classesWithFunctions ) {
			print("\tfinal ${extension.className}")
			for ( i in 0..(alignment - extension.className.length() - 1) )
				print(' ')
			println(" __${extension.className};")
		}

		println()
		classes forEach {
			val documentation = it.documentation
			if ( documentation != null )
				println((if ( it.hasBody ) "When true, {@link ${it.className}} is supported." else documentation).toJavaDoc())
			println("\tpublic final boolean ${it.capName};")
		}

		println("\n\t$CAPABILITIES_CLASS(FunctionProvider provider, Set<String> ext) {")
		for ( extension in classes ) {
			val capName = extension.capName
			if ( extension.hasNativeFunctions ) {
				print("\t\t$capName = (__${extension.className} = ${if ( capName == extension.className ) "$GLES_PACKAGE.${extension.className}" else extension.className}.create(ext, provider")
				println(")) != null;")
			} else
				println("\t\t$capName = ext.contains(\"${extension.capName}\");")
		}
		println("\t}")
		print("}")
	}

})

private fun String.nativeClassGLES(
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
	binding = BindingGLES,
	init = init
)

private val REGISTRY_PATTERN = Pattern.compile("([A-Z]+)_(\\w+)")
private val NativeClass.registryLink: String get() {
	val matcher = REGISTRY_PATTERN.matcher(templateName)
	if ( !matcher.matches() )
		throw IllegalStateException("Non-standard extension name: $templateName")
	return url("https://www.khronos.org/registry/gles/extensions/${matcher.group(1)}/$templateName.txt", templateName)
}

private fun NativeClass.registryLink(prefix: String, name: String): String = registryLinkTo(prefix, name, templateName)
private fun registryLinkTo(prefix: String, name: String, extensionName: String = "${prefix}_${name}"): String =
	url("https://www.khronos.org/registry/gles/extensions/$prefix/$name.txt", extensionName)

private val NativeClass.core: String get() = "{@link ${this.className} GLES ${this.className[2]}.${this.className[3]}}"
private val NativeClass.promoted: String get() = "Promoted to core in ${this.core}."