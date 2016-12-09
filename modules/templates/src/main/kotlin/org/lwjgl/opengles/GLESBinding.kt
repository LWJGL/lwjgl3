/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles

import org.lwjgl.generator.*
import java.io.*

val NativeClass.capName: String
	get() = if (templateName.startsWith(prefixTemplate)) templateName else "${prefixTemplate}_$templateName"

private val CAPABILITIES_CLASS = "GLESCapabilities"

private object BufferOffsetTransform : FunctionTransform<Parameter>, SkipCheckFunctionTransform {
	override fun transformDeclaration(param: Parameter, original: String) = "long ${param.name}"
	override fun transformCall(param: Parameter, original: String) = param.name
}

private val GLESBinding = Generator.register(object : APIBinding(
	GLES_PACKAGE,
	CAPABILITIES_CLASS,
	APICapabilities.JNI_CAPABILITIES
) {

	private val classes: List<NativeClass> by lazy {
		super.getClasses { o1, o2 ->
			// Core functionality first, extensions after
			val isGLES1 = o1.templateName.startsWith("GLES")
			val isGLES2 = o2.templateName.startsWith("GLES")

			if (isGLES1 xor isGLES2)
				(if (isGLES1) -1 else 1)
			else
				o1.templateName.compareTo(o2.templateName, ignoreCase = true)
		}
	}

	private val functions: java.util.SortedSet<NativeClassFunction> by lazy {
		classes
			.filter { it.hasNativeFunctions }
			.map { it.functions }
			.flatten()
			.toSortedSet(Comparator<NativeClassFunction> { o1, o2 -> o1.name.compareTo(o2.name) })
	}

	private val functionOrdinals: Map<String, Int> by lazy {
		val ordinals = HashMap<String, Int>(512)
		var i = 0
		functions.asSequence()
			.forEach {
				ordinals[it.name] = i++
			}
		ordinals
	}

	override fun getFunctionOrdinal(function: NativeClassFunction) = functionOrdinals[function.name]!!

	override fun generateAlternativeMethods(writer: PrintWriter, function: NativeClassFunction, transforms: MutableMap<QualifiedType, Transform>) {
		val boParams = function.getParams { it has BufferObject && it.nativeType.mapping != PrimitiveMapping.POINTER && it.nativeType !is ArrayType }
		if (boParams.any()) {
			boParams.forEach { transforms[it] = BufferOffsetTransform }
			function.generateAlternativeMethod(writer, function.name, transforms)
			boParams.forEach { transforms.remove(it) }
		}
	}

	override fun shouldCheckFunctionAddress(function: NativeClassFunction): Boolean = function.nativeClass.templateName != "GLES20"

	override fun generateFunctionAddress(writer: PrintWriter, function: NativeClassFunction) {
		writer.println("\t\tlong $FUNCTION_ADDRESS = GLES.getICD().${function.name};")
	}

	override fun PrintWriter.generateFunctionSetup(nativeClass: NativeClass) {
		print("\n\tstatic boolean isAvailable($CAPABILITIES_CLASS caps")
		if (nativeClass.functions.any { it has DependsOn }) print(", java.util.Set<String> ext")
		println(") {")

		val printPointer = { func: NativeClassFunction ->
			if (func has DependsOn)
				"${func[DependsOn].reference.let { if (it.indexOf(' ') == -1) "ext.contains(\"$it\")" else it }} ? caps.${func.name} : -1L"
			else
				"caps.${func.name}"
		}

		print("\t\treturn checkFunctions(")
		nativeClass.printPointers(this, printPointer) { !it.has(IgnoreMissing) }
		println(");")
		println("\t}")
	}

	init {
		javaImport(
			"org.lwjgl.*",
			"static org.lwjgl.system.APIUtil.*",
			"static org.lwjgl.system.MemoryUtil.*"
		)

		documentation = "Defines the capabilities of an OpenGL ES context."
	}

	override fun PrintWriter.generateJava() {
		generateJavaPreamble()
		println("public final class $CAPABILITIES_CLASS {\n")

		println("\tpublic final long")
		println(functions
			.map { it.name }
			.joinToString(",\n\t\t", prefix = "\t\t", postfix = ";\n"))

		classes.forEach {
			println(it.getCapabilityJavadoc())
			println("\tpublic final boolean ${it.capName};")
		}

		println("""
	/** Off-heap array of the above function addresses. */
	final PointerBuffer addresses;

	$CAPABILITIES_CLASS(FunctionProvider provider, Set<String> ext) {
""")

		println(functions.map { "${it.name} = provider.getFunctionAddress(${it.functionAddress});" }.joinToString(prefix = "\t\t", separator = "\n\t\t"))

		for (extension in classes) {
			val capName = extension.capName
			if (extension.hasNativeFunctions) {
				print("\n\t\t$capName = ext.contains(\"$capName\") && checkExtension(\"$capName\", ${if (capName == extension.className) "$GLES_PACKAGE.${extension.className}" else extension.className}.isAvailable(this")
				if (extension.functions.any { it has DependsOn }) print(", ext")
				print("));")
			} else
				print("\n\t\t$capName = ext.contains(\"$capName\");")
		}
		print("""

		addresses = ThreadLocalUtil.getAddressesFromCapabilities(this);
	}

	private static boolean checkExtension(String extension, boolean supported) {
		if ( supported )
			return true;

		apiLog("[GLES] " + extension + " was reported as available but an entry point is missing.");
		return false;
	}

}""")
	}

})

fun String.nativeClassGLES(
	templateName: String,
	nativeSubPath: String = "",
	prefix: String = "GL",
	prefixMethod: String = prefix.toLowerCase(),
	postfix: String = "",
	init: NativeClass.() -> Unit
) = nativeClass(
	GLES_PACKAGE,
	templateName,
	nativeSubPath = nativeSubPath,
	prefix = prefix,
	prefixMethod = prefixMethod,
	postfix = postfix,
	binding = GLESBinding,
	library = "GLES.initialize();",
	init = {
		init()
		if (functions.any())
			nativeImport("opengles.h")
	}
)

val NativeClass.capLink: String get() = "{@link $CAPABILITIES_CLASS\\#$capName $templateName}"

private val REGISTRY_PATTERN = "([A-Z]+)_(\\w+)".toRegex()
val NativeClass.registryLink: String get() = (REGISTRY_PATTERN.matchEntire(templateName) ?: throw IllegalStateException("Non-standard extension name: $templateName"))
	.let {
		url("https://www.khronos.org/registry/gles/extensions/${it.groupValues[1]}/$templateName.txt", templateName)
	}

fun NativeClass.registryLink(prefix: String, name: String): String =
	url("https://www.khronos.org/registry/gles/extensions/$prefix/$name.txt", templateName)

val NativeClass.core: String get() = "{@link ${this.className} GLES ${this.className[4]}.${this.className[5]}}"
val NativeClass.promoted: String get() = "Promoted to core in ${this.core}."