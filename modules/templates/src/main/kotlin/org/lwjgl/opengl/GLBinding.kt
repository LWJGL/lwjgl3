/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl

import org.lwjgl.generator.*
import java.io.*

val NativeClass.capName: String
	get() = if (templateName.startsWith(prefixTemplate)) {
		if (prefix == "GL")
			"OpenGL${templateName.substring(2)}"
		else
			templateName
	} else {
		"${prefixTemplate}_$templateName"
	}

private val CAPABILITIES_CLASS = "GLCapabilities"

private object BufferOffsetTransform : FunctionTransform<Parameter>, SkipCheckFunctionTransform {
	override fun transformDeclaration(param: Parameter, original: String) = "long ${param.name}"
	override fun transformCall(param: Parameter, original: String) = param.name
}

val GLBinding = Generator.register(object : APIBinding(
	OPENGL_PACKAGE,
	CAPABILITIES_CLASS,
	APICapabilities.JNI_CAPABILITIES
) {

	private val GLCorePattern = "GL[1-9][0-9]".toRegex()

	private val classes: List<NativeClass> by lazy {
		super.getClasses { o1, o2 ->
			// Core functionality first, extensions after
			val isGL1 = o1.templateName.startsWith("GL")
			val isGL2 = o2.templateName.startsWith("GL")

			if (isGL1 xor isGL2)
				(if (isGL1) -1 else 1)
			else
				o1.templateName.compareTo(o2.templateName, ignoreCase = true)
		}
	}

	private val functions: java.util.SortedSet<Func> by lazy {
		classes
			.filter { it.hasNativeFunctions }
			.map { it.functions }
			.flatten()
			.toSortedSet(Comparator<Func> { o1, o2 -> o1.name.compareTo(o2.name) })
	}

	private val functionOrdinals: Map<String, Int> by lazy {
		val ordinals = HashMap<String, Int>(1024)
		var i = 0
		functions.asSequence()
			.forEach {
				ordinals[it.name] = i++
			}
		ordinals
	}

	override fun getFunctionOrdinal(function: Func) = functionOrdinals[function.name]!!

	override fun generateAlternativeMethods(writer: PrintWriter, function: Func, transforms: MutableMap<QualifiedType, Transform>) {
		val boParams = function.getParams { it.has<BufferObject>() && it.nativeType.mapping != PrimitiveMapping.POINTER && it.nativeType !is ArrayType }
		if (boParams.any()) {
			boParams.forEach { transforms[it] = BufferOffsetTransform }
			function.generateAlternativeMethod(writer, function.name, transforms)
			boParams.forEach { transforms.remove(it) }
		}
	}

	override fun printCustomJavadoc(writer: PrintWriter, function: Func, documentation: String): Boolean {
		if (GLCorePattern.matches(function.nativeClass.className)) {
			val xmlName = if (function.has<ReferenceGL>())
				function.get<ReferenceGL>().function
			else
				function.stripPostfix(stripType = true)
			writer.printOpenGLJavaDoc(documentation, xmlName, function has DeprecatedGL)
			return true
		}
		return false
	}

	private val Iterable<Func>.hasDeprecated: Boolean
		get() = this.any { it has DeprecatedGL }

	override fun shouldCheckFunctionAddress(function: Func): Boolean = function.nativeClass.templateName != "GL11" || function has DeprecatedGL

	override fun generateFunctionAddress(writer: PrintWriter, function: Func) {
		writer.println("\t\tlong $FUNCTION_ADDRESS = GL.getICD().${function.name};")
	}

	override fun PrintWriter.generateFunctionSetup(nativeClass: NativeClass) {
		val hasDeprecated = nativeClass.functions.hasDeprecated

		print("\n\tstatic boolean isAvailable($CAPABILITIES_CLASS caps")
		if (nativeClass.functions.any { it.has<DependsOn>() }) print(", java.util.Set<String> ext")
		if (hasDeprecated) print(", boolean fc")
		println(") {")
		print("\t\treturn ")

		val printPointer = { func: Func ->
			if (func.has<DependsOn>())
				"${func.get<DependsOn>().reference.let { if (it.indexOf(' ') == -1) "ext.contains(\"$it\")" else it }} ? caps.${func.name} : -1L"
			else
				"caps.${func.name}"
		}

		if (hasDeprecated) {
			print("(fc || checkFunctions(")
			nativeClass.printPointers(this, printPointer) { it has DeprecatedGL }
			print(")) && ")
		}

		print("checkFunctions(")
		if (hasDeprecated)
			nativeClass.printPointers(this, printPointer) { !(it has DeprecatedGL || it has IgnoreMissing) }
		else
			nativeClass.printPointers(this, printPointer) { !(it has IgnoreMissing) }
		println(");")
		println("\t}")
	}

	init {
		javaImport(
			"org.lwjgl.*",
			"static org.lwjgl.system.APIUtil.*",
			"static org.lwjgl.system.MemoryUtil.*"
		)

		documentation = "Defines the capabilities of an OpenGL context."
	}

	override fun PrintWriter.generateJava() {
		generateJavaPreamble()
		println("public final class $CAPABILITIES_CLASS {\n")

		println("\tpublic final long")
		println(functions
			.map(Func::name)
			.joinToString(",\n\t\t", prefix = "\t\t", postfix = ";\n"))

		classes.forEach {
			println(it.getCapabilityJavadoc())
			println("\tpublic final boolean ${it.capName};")
		}

		println("""
	/** When true, deprecated functions are not available. */
	public final boolean forwardCompatible;

	/** Off-heap array of the above function addresses. */
	final PointerBuffer addresses;

	$CAPABILITIES_CLASS(FunctionProvider provider, Set<String> ext, boolean fc) {
		forwardCompatible = fc;
""")

		println(functions.map {
			if (it has DeprecatedGL)
				"${it.name} = getFunctionAddress(fc, provider, ${it.functionAddress});"
			else
				"${it.name} = provider.getFunctionAddress(${it.functionAddress});"
		}.joinToString(prefix = "\t\t", separator = "\n\t\t"))

		for (extension in classes) {
			val capName = extension.capName
			if (extension.hasNativeFunctions) {
				print("\n\t\t$capName = ext.contains(\"$capName\") && checkExtension(\"$capName\", ${if (capName == extension.className) "$OPENGL_PACKAGE.${extension.className}" else extension.className}.isAvailable(this")
				if (extension.functions.any { it.has<DependsOn>() }) print(", ext")
				if (extension.functions.hasDeprecated) print(", fc")
				print("));")
			} else
				print("\n\t\t$capName = ext.contains(\"$capName\");")
		}
		print("""

		addresses = ThreadLocalUtil.getAddressesFromCapabilities(this);
	}

	private static long getFunctionAddress(boolean fc, FunctionProvider provider, String functionName) {
		return fc ? NULL : provider.getFunctionAddress(functionName);
	}

	private static boolean checkExtension(String extension, boolean supported) {
		if ( supported )
			return true;

		apiLog("[GL] " + extension + " was reported as available but an entry point is missing.");
		return false;
	}

}""")
	}

})

// DSL Extensions

fun String.nativeClassGL(
	templateName: String,
	prefix: String = "GL",
	prefixMethod: String = prefix.toLowerCase(),
	postfix: String = "",
	init: NativeClass.() -> Unit
) = nativeClass(
	OPENGL_PACKAGE,
	templateName,
	prefix = prefix,
	prefixMethod = prefixMethod,
	postfix = postfix,
	binding = GLBinding,
	library = "GL.initialize();",
	init = {
		init()
		if (functions.any())
			nativeImport("opengl.h")
	}
)

private val REGISTRY_PATTERN = "([A-Z]+)_(\\w+)".toRegex()
val NativeClass.registryLink: String get() = (REGISTRY_PATTERN.matchEntire(templateName) ?: throw IllegalStateException("Non-standard extension name: $templateName"))
	.destructured
	.let { (group, extension) ->
		url("http://www.opengl.org/registry/specs/$group/$extension.txt", templateName)
	}

fun NativeClass.registryLink(prefix: String, name: String): String = registryLinkTo(prefix, name, templateName)
fun registryLinkTo(prefix: String, name: String, extensionName: String = "${prefix}_$name"): String =
	url("http://www.opengl.org/registry/specs/$prefix/$name.txt", extensionName)

val NativeClass.core: String get() = "{@link ${this.className} OpenGL ${this.className[2]}.${this.className[3]}}"
val NativeClass.glx: String get() = "{@link ${this.className} GLX ${this.className[3]}.${this.className[4]}}"
val NativeClass.promoted: String get() = "Promoted to core in ${this.core}."