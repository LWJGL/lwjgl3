/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

import java.io.PrintWriter
import java.lang.Math.*
import java.util.*
import java.util.regex.Pattern

val EXT_FLAG = ""

val NULL = "{@code NULL}"

enum class CallingConvention(val method: String) {
	DEFAULT("invoke"),
	STDCALL("call") // __stdcall on Windows, default on other systems
}

/**
 * The Generator can be customized with binding-specific overrides using this class. This class must implemented for bindings that are loaded dynamically. It
 * is not necessary for libraries that are static compiled/linked into the LWJGL natives.
 */
abstract class APIBinding(
	packageName: String,
	className: String,
	val callingConvention: CallingConvention = CallingConvention.STDCALL
) : CustomClass(packageName, className) {

	init {
		javaImport(
			"org.lwjgl.system.*",
			"java.util.Set"
		)
	}

	private val _classes: MutableList<NativeClass> = ArrayList()

	protected fun getClasses(
		comparator: (NativeClass, NativeClass) -> Int = { o1, o2 -> o1.templateName compareTo o2.templateName }
	): List<NativeClass> {
		val classes = ArrayList(_classes)
		Collections.sort(classes, object : Comparator<NativeClass> { // TODO: Kotlin bug: Can't use SAM conversion on JDK 8
			override fun compare(o1: NativeClass, o2: NativeClass) = comparator(o1, o2)
		})
		return classes
	}

	override fun getLastModified(root: String): Long {
		return max(
			super.getLastModified(root),
			getDirectoryLastModified("$root/templates")
		)
	}

	fun addCapabilities(clazz: NativeClass) {
		_classes add clazz
	}

	/** If true, different platforms/devices/contexts return different function addresses. */
	open val isLocal: Boolean = false // GL & CL are global, AL is local

	/** If false, a capabilities instance is not available in the current thread or process. A parameter must provide the instance. */
	open val hasCurrentCapabilities: Boolean = true // GL has thread-local capabilities, AL has process-wide capabilities (unless ALC_EXT_thread_local_context is used), CL has the ICD.

	open fun generateFunctionAddress(writer: PrintWriter, function: NativeClassFunction) {
		val instanceParameter = if ( hasCurrentCapabilities )
			""
		else if ( function has Capabilities ) {
			val caps = function[Capabilities]
			if ( caps.statement != null )
				writer.println("\t\t${caps.statement};")
			caps.expression
		} else {
			try {
				// Use the first ObjectType parameters
				function.getParams() { it.nativeType is ObjectType }.first().name
			} catch (e: Exception) {
				throw IllegalStateException("Neither a Capabilities modifier nor an object parameter were found on function ${function.name}")
			}
		}

		val variable = if ( function.returns.has(Address) ) RESULT else FUNCTION_ADDRESS

		if ( function has Capabilities && function[Capabilities].override ) {
			if ( !instanceParameter.equals(FUNCTION_ADDRESS) ) // Skip if we have an explicit FUNCTION_ADDRESS parameter.
				writer.println("\t\tlong $variable = $instanceParameter;")
		} else
			writer.println("\t\tlong $variable = getInstance($instanceParameter).${function.addressName};")
	}

	abstract fun PrintWriter.generateFunctionGetters(nativeClass: NativeClass)

	// OVERRIDES

	/** Can be overriden to generate additional parameters for the NativeClass constructor. */
	open fun printConstructorParams(writer: PrintWriter, nativeClass: NativeClass) = Unit

	/** Can be overriden to implement custom function address retrieval. */
	open fun getFunctionAddressCall(function: NativeClassFunction) = "provider.getFunctionAddress(\"${function.nativeName}\")"

	/** Can be overriden to generate binding-specific alternative methods. */
	open fun generateAlternativeMethods(
		writer: PrintWriter,
		function: NativeClassFunction,
		transforms: MutableMap<QualifiedType, FunctionTransform<out QualifiedType>>
	) = Unit

	/** Can be overriden to generate binding-specific javadoc. If this function returns false, the default javadoc will be generated. */
	open fun printCustomJavadoc(writer: PrintWriter, function: NativeClassFunction, documentation: String) = false

	/** Can be overriden to implement a custom condition for checking the function address. */
	open fun shouldCheckFunctionAddress(function: NativeClassFunction) = !hasCurrentCapabilities

	/** Can be overriden to add custom parameter checks. */
	open fun addParameterChecks(
		checks: MutableList<String>,
		mode: GenerationMode,
		parameter: Parameter,
		hasTransform: Parameter.(FunctionTransform<Parameter>) -> Boolean
	) = Unit

}

/** An APIBinding without an associated capabilities class.  */
abstract class SimpleBinding(
	callingConvention: CallingConvention = CallingConvention.STDCALL
): APIBinding("n/a", "n/a", callingConvention) {
	override fun getFunctionAddressCall(function: NativeClassFunction) = "checkFunctionAddress(${super.getFunctionAddressCall(function)})"
	override fun PrintWriter.generateContent() = Unit
}

/** Creates a simple APIBinding that stores the shared library and function pointers inside the binding class. The shared library is never unloaded. */
fun simpleBinding(
	libraryName: String,
	libraryExpression: String = "\"$libraryName\"",
	callingConvention: CallingConvention = CallingConvention.STDCALL
) = object : SimpleBinding(callingConvention) {
	override fun PrintWriter.generateFunctionGetters(nativeClass: NativeClass) {
		val libraryReference = libraryName.toUpperCase()

		println("""	// --- [ Function Addresses ] ---

	private static final DynamicLinkLibrary $libraryReference;

	private static final ${nativeClass.className} instance;

	static {
		$libraryReference = LWJGLUtil.loadLibraryNative($libraryExpression);
		instance = new ${nativeClass.className}($libraryReference);
	}

	/** Returns the {@link ${nativeClass.className}} instance. */
	public static ${nativeClass.className} getInstance() {
		return instance;
	}
""")
	}
}

// TODO: Remove if KT-457 or KT-1183 are fixed.
private fun APIBinding.generateFunctionGetters(writer: PrintWriter, nativeClass: NativeClass) = writer.generateFunctionGetters(nativeClass)

class NativeClass(
	packageName: String,
	className: String,
	nativeSubPath: String,
	val templateName: String = className,
	val prefix: String,
	val prefixMethod: String,
	val prefixConstant: String,
	val prefixTemplate: String,
	val postfix: String,
	val binding: APIBinding?
) : GeneratorTargetNative(packageName, className, nativeSubPath) {
	companion object {
		private val JDOC_LINK_PATTERN = Pattern.compile("""(?<!\p{javaJavaIdentifierPart}|[@#])#(\p{javaJavaIdentifierStart}\p{javaJavaIdentifierPart}*)""")
	}

	private val constantBlocks = ArrayList<ConstantBlock<*>>()

	private val _functions = LinkedHashMap<String, NativeClassFunction>()
	val functions: Iterable<NativeClassFunction>
		get() = _functions.values()

	private val customMethods = ArrayList<String>()

	val hasBody: Boolean
		get() = !constantBlocks.isEmpty() || hasNativeFunctions || customMethods.isNotEmpty()

	val hasNativeFunctions: Boolean
		get() = _functions.isNotEmpty()

	public val link: String get() = "{@link ${this.className} ${this.templateName}}"

	override fun processDocumentation(documentation: String): String = processDocumentation(documentation, prefixConstant, prefixMethod)

	override fun PrintWriter.generateJava() {
		print(HEADER)
		println("package $packageName;\n")

		val hasFunctions = !_functions.isEmpty()
		if ( hasFunctions ) {
			println("import org.lwjgl.*;")
			println("import org.lwjgl.system.*;\n")

			// TODO: This is horrible. Refactor so that we build imports after code generation.

			val hasNIO = functions.any { it.returns.isBufferPointer || it.hasParam { it.isBufferPointer } }

			if ( hasNIO )
				println("import java.nio.*;\n")

			println("import static org.lwjgl.system.Checks.*;")
			if ( binding != null )
				println("import static org.lwjgl.system.JNI.*;")
			if ( hasNIO ) {
				if ( functions.any { it.hasParam { it.nativeType.mapping === PointerMapping.DATA_POINTER } } )
					println("import static org.lwjgl.Pointer.*;")
				println("import static org.lwjgl.system.MemoryUtil.*;")
				if ( functions.any {
					val func = it
					func.hasParam {
						it.nativeType is PointerType &&
						(
							it has Return ||
							it has SingleValue ||
							(it.isAutoSizeResultOut && func.hideAutoSizeResultParam) ||
							it has PointerArray ||
							it.nativeType is CharSequenceType
						)
					}
				} )
					println("import static org.lwjgl.system.APIUtil.*;")
			}
			println()
		}

		preamble.printJava(this)

		val documentation = super.documentation
		if ( documentation != null )
			println(processDocumentation(documentation).toJavaDoc(indentation = ""))
		println("${access.modifier}${if ( hasFunctions ) "" else "final "}class $className {")

		constantBlocks.forEach {
			it.generate(this)
		}

		if ( hasFunctions ) {
			if ( binding != null ) {
				if ( functions.any { it.hasCustomJNI } )
					println("\n\tstatic { LWJGLUtil.initialize(); }")

				generateFunctionAddresses(binding)
				binding.generateFunctionGetters(this, this@NativeClass)
			} else {
				println("\n\tstatic { LWJGLUtil.initialize(); }")

				println("""
	@JavadocExclude
	protected $className() {
		throw new UnsupportedOperationException();
	}
""")
			}
		} else {
			println("\n\tprivate $className() {}\n")
		}

		functions.forEach {
			println("\t// --- [ ${it.name} ] ---\n")
			try {
				it.generateMethods(this)
			} catch (e: Exception) {
				throw RuntimeException("Uncaught exception while generating method: $className.${it.name}", e)
			}
		}

		customMethods forEach {
			println("\t${it.trim()}\n")
		}

		print("}")
	}

	private fun PrintWriter.generateFunctionAddresses(binding: APIBinding) {
		println("\n\t/** Function address. */")
		println("\t@JavadocExclude")
		print("\tpublic final long")
		if ( _functions.size() == 1 ) {
			println(" ${_functions.values().first().addressName};")
		} else {
			println()
			_functions.values().forEachWithMore { func, more ->
				if ( more )
					println(",")
				print("\t\t${func.addressName}")
			}
			println(";")
		}
		println("""
	@JavadocExclude
	protected $className() {
		throw new UnsupportedOperationException();
	}
""")
		println("\t@JavadocExclude")
		print("\t${access.modifier}$className(FunctionProvider${if ( binding.isLocal ) "Local" else ""} provider")
		binding.printConstructorParams(this, this@NativeClass)
		println(") {")
		functions.forEach {
			println("\t\t${it.addressName} = ${binding.getFunctionAddressCall(it)};")
		}
		println("\t}\n")
	}

	override fun PrintWriter.generateNative() {
		print(HEADER)
		preamble.printNative(this)

		if ( binding != null ) {
			// Generate typedefs for casting the function pointers
			println()
			functions.asSequence().filter { it.hasCustomJNI }.forEach {
				it.generateFunctionDefinition(this)
			}
		}

		println("\nEXTERN_C_ENTER")

		functions.asSequence().filter { it.hasCustomJNI }.forEach {
			println()
			it.generateFunction(this)
		}

		println("\nEXTERN_C_EXIT")
	}

	fun nativeImportsWarning() {
		if ( preamble.hasNativeImports )
			println("\tUnnecessary native imports in: $packageName.$templateName")
	}

	fun printPointers(
		out: PrintWriter,
		printPointer: (func: NativeClassFunction) -> String = { "funcs.${it.simpleName}" },
		filter: ((NativeClassFunction) -> Boolean)? = null
	) {
		out.print("\n\t\t\t")


		val functions = if ( filter == null )
			_functions.values()
		else
			_functions.values().filter(filter)

		var lineSize = 12
		functions.forEachWithMore { func, more ->
			if ( more ) {
				out.print(", ")
				lineSize += 2
			}

			val pointer = printPointer(func)

			lineSize += pointer.length()
			if ( 160 <= lineSize ) {
				out.print("\n\t\t\t")
				lineSize = 12 + pointer.length()
			}

			out.print(pointer)
		}

		out.print("\n\t\t")
	}

	// DSL extensions

	operator fun <T : Any> ConstantType<T>.invoke(documentation: String, vararg constants: Constant<out T>): ConstantBlock<T> {
		val block = ConstantBlock(this@NativeClass, this, processDocumentation(documentation).toJavaDoc(), *constants)
		constantBlocks add block
		return block
	}

	/** Adds a new constant. */
	operator fun <T : Any> String.rangeTo(value: T) = Constant(this, value)

	/** Adds a new enum constant. */
	val String.enum: Constant<EnumValue> get() = Constant(this, EnumValue())
	fun String.enum(documentation: String) = Constant(this, EnumValue(processDocumentation(documentation).toJavaDoc()))
	fun String.enum(value: Int) = Constant(this, EnumValue(value = value))
	fun String.enum(documentation: String, value: Int) = Constant(this, EnumValue(processDocumentation(documentation).toJavaDoc(), value))

	fun String.enumExpr(expression: String) = Constant(this, EnumValueExpression(expression = expression))
	fun String.enumExpr(documentation: String, expression: String) = Constant(this, EnumValueExpression(processDocumentation(documentation).toJavaDoc(), expression))

	/** Adds a new constant whose value is an expression. */
	fun <T : Any> String.expr(expression: String) = ConstantExpression<T>(this, expression)

	operator fun NativeType.invoke(name: String, documentation: String, vararg parameters: Parameter, returnDoc: String = "", since: String = "", noPrefix: Boolean = false) =
		ReturnValue(this)(name, documentation, *parameters, returnDoc = returnDoc, since = since, noPrefix = noPrefix)

	operator fun ReturnValue.invoke(name: String, documentation: String, vararg parameters: Parameter, returnDoc: String = "", since: String = "", noPrefix: Boolean = false): NativeClassFunction {
		val func = NativeClassFunction(
			returns = this,
			simpleName = name,
			name = if ( noPrefix ) name else "$prefixMethod$name",
			documentation = this@NativeClass.toJavaDoc(processDocumentation(documentation), parameters.asSequence(), this.nativeType, returnDoc, since),
			nativeClass = this@NativeClass,
			parameters = *parameters
		)

		_functions.put(name, func)
		return func
	}

	fun customMethod(method: String) {
		customMethods add method
	}

	operator fun NativeClass.get(functionName: String) = _functions[functionName] ?: throw IllegalArgumentException("Referenced function does not exist: $templateName.$functionName")

	fun NativeClass.reuse(functionName: String): NativeClassFunction {
		val reference = this[functionName]

		val func = NativeClassFunction(
			returns = reference.returns,
			simpleName = reference.simpleName,
			name = reference.name,
			documentation = this@NativeClass.convertDocumentation(this, reference.name, reference.documentation),
			nativeClass = this@NativeClass,
			parameters = *reference.parameters
		).copyModifiers(reference)

		this@NativeClass._functions.put(functionName, func)
		return func
	}

	operator fun NativeClassFunction.get(paramName: String): Parameter {
		val param = getParam(paramName)

		return Parameter(
			param.nativeType,
			param.name,
			param.paramType,
			this@NativeClass.convertDocumentation(this.nativeClass, this.name, param.documentation),
			"",
			LinkMode.SINGLE
		).copyModifiers(param)
	}

	fun Int.x(other: Int) = this * other

	private fun convertDocumentation(referenceClass: NativeClass, referenceFunction: String, documentation: String): String {
		val matcher = JDOC_LINK_PATTERN.matcher(documentation)
		if ( !matcher.find() )
			return documentation

		val buffer = StringBuilder(documentation.length())
		var lastEnd = 0
		do {
			buffer.append(documentation, lastEnd, matcher.start())

			val element = matcher.group(1)

			if ( referenceClass.prefixConstant.isNotEmpty() && element startsWith referenceClass.prefixConstant ) {
				if ( element.substring(referenceClass.prefixConstant.length()).let { constant ->
					!this.constantBlocks.any { block -> block.constants.any { it -> it.name == constant } }
				} )
					buffer.append(referenceClass.className)
			} else if ( !this.functions.any { it -> it.name == element } && referenceFunction != element )
				buffer.append(referenceClass.className)

			buffer.append(matcher.group(0))

			lastEnd = matcher.end()
		} while ( matcher.find() )
		buffer.append(documentation, lastEnd, documentation.length())

		return buffer.toString()
	}

}

// DSL extensions

fun String.nativeClass(
	packageName: String,
	templateName: String = this,
	nativeSubPath: String = "",
	prefix: String = "",
	prefixMethod: String = prefix.toLowerCase(),
	prefixConstant: String = if ( prefix.isEmpty() || prefix.endsWith('_') ) prefix else "${prefix}_",
	prefixTemplate: String = prefix,
	postfix: String = "",
	binding: APIBinding? = null,
	init: (NativeClass.() -> Unit)? = null
): NativeClass {
	val ext = NativeClass(packageName, this, nativeSubPath, templateName, prefix, prefixMethod, prefixConstant, prefixTemplate, postfix, binding)
	if ( init != null )
		ext.init()

	binding?.addCapabilities(ext)

	return ext
}