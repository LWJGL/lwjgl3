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
		comparator: (NativeClass, NativeClass) -> Int = { o1, o2 -> o1.templateName.compareTo(o2.templateName) }
	): List<NativeClass> {
		val classes = ArrayList(_classes)
		Collections.sort(classes) { o1, o2 -> comparator(o1, o2) }
		return classes
	}

	fun addClass(clazz: NativeClass) {
		_classes.add(clazz)
	}

	override fun getLastModified(root: String): Long {
		return max(
			super.getLastModified(root),
			getDirectoryLastModified("$root/templates")
		)
	}

	/** If true, function pointers for this binding are retrieved from custom "capabilities" instances. */
	open val hasCapabilities: Boolean = false

	/** If true, "capabilities" instance are retrieved from function parameters. */
	open val hasParameterCapabilities: Boolean = false

	abstract fun generateFunctionAddress(writer: PrintWriter, function: NativeClassFunction)

	abstract fun PrintWriter.generateFunctionSetup(nativeClass: NativeClass)

	// OVERRIDES

	/** Can be overriden to generate binding-specific alternative methods. */
	open fun generateAlternativeMethods(
		writer: PrintWriter,
		function: NativeClassFunction,
		transforms: MutableMap<QualifiedType, FunctionTransform<out QualifiedType>>
	) = Unit

	/** Can be overriden to generate binding-specific javadoc. If this function returns false, the default javadoc will be generated. */
	open fun printCustomJavadoc(writer: PrintWriter, function: NativeClassFunction, documentation: String) = false

	open fun NativeClass.getCapabilityJavadoc(): String {
		val documentation = this.documentation
		return (if (documentation == null)
			"When true, {@code $templateName} is supported."
		else if (hasBody)
			"When true, {@link $className} is supported."
		else
			processDocumentation(documentation)).toJavaDoc()
	}

	/** Can be overriden to implement a custom condition for checking the function address. */
	open fun shouldCheckFunctionAddress(function: NativeClassFunction) = hasCapabilities

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
	val libraryExpression: String,
	callingConvention: CallingConvention
) : APIBinding("n/a", "n/a", callingConvention) {
	override fun PrintWriter.generateContent() = Unit
	override fun generateFunctionAddress(writer: PrintWriter, function: NativeClassFunction) {
		writer.println("\t\tlong ${if ( function.returns.has(Address) ) RESULT else FUNCTION_ADDRESS} = Functions.${function.simpleName};")
	}

	protected fun PrintWriter.generateFunctionsClass(nativeClass: NativeClass) {
		val bindingFunctions = nativeClass.functions.filter { !it.hasExplicitFunctionAddress }
		if ( bindingFunctions.isEmpty() )
			return

		val alignment = bindingFunctions.map { it.simpleName.length }.max()!!

		println("""
	public static final class Functions {

		private Functions() {}

		/** Function address. */
		public static final long
			${
		bindingFunctions
			.map { "${it.simpleName}${" ".repeat(alignment - it.simpleName.length)} = apiGetFunctionAddress($libraryExpression, ${it.nativeName})" }
			.joinToString(separator = ",\n\t\t\t", postfix = ";")
		}

	}""")
	}
}

/** Creates a simple APIBinding that stores the shared library and function pointers inside the binding class. The shared library is never unloaded. */
fun simpleBinding(
	libraryName: String,
	libraryExpression: String = "\"$libraryName\"",
	callingConvention: CallingConvention = CallingConvention.DEFAULT
) = object : SimpleBinding(libraryName.toUpperCase(), callingConvention) {
	override fun PrintWriter.generateFunctionSetup(nativeClass: NativeClass) {
		val libraryReference = libraryName.toUpperCase()

		println("\n\tprivate static final SharedLibrary $libraryReference = Library.loadNative($libraryExpression);\n");
		print("\t/** Contains the function pointers loaded from the $libraryName {@link SharedLibrary}. */")
		generateFunctionsClass(nativeClass)
		println("""
	/** Returns the $libraryName {@link SharedLibrary}. */
	public static SharedLibrary getLibrary() {
		return $libraryReference;
	}""")
	}
}

/** Creates a simple APIBinding that delegates function pointer loading to this APIBinding. */
fun APIBinding.delegate(
	libraryExpression: String
) = object : SimpleBinding(libraryExpression, callingConvention) {
	override fun PrintWriter.generateFunctionSetup(nativeClass: NativeClass) {
		print("\n\t/** Contains the function pointers loaded from {@code $libraryExpression}. */")
		generateFunctionsClass(nativeClass)
	}
}

// TODO: Remove if KT-7859 is fixed.
private fun APIBinding.generateFunctionSetup(writer: PrintWriter, nativeClass: NativeClass) = writer.generateFunctionSetup(nativeClass)

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
		get() = _functions.values

	// same as above + array overloads
	private val genFunctions: List<NativeClassFunction> by lazy {
		val list = ArrayList<NativeClassFunction>(_functions.values)

		functions.forEach { func ->
			val hasArrayOverloads = func.hasArrayOverloads

			if (hasArrayOverloads) {
				// assumes only 1 exists per method
				val multiTypeParam = if (!hasArrayOverloads) null else func.parameters.firstOrNull { it has MultiType }

				if (multiTypeParam == null || func.parameters.any { it.nativeType.mapping.isArray }) {
					val overload = NativeClassFunction(
						returns = func.returns,
						simpleName = func.simpleName,
						name = func.name,
						//documentation = func.documentation,
						documentation = { processDocumentation("Array version of: ${func.methodLink}").toJavaDoc() },
						nativeClass = this@NativeClass,
						parameters = *(func.parameters.asSequence().map {
							if (it.nativeType.mapping.isArray)
								Parameter(
									ArrayType(it.nativeType as PointerType),
									it.name,
									it.paramType,
									it.documentation,
									"", LinkMode.SINGLE
								).copyModifiers(it).removeArrayModifiers()
							else
								func[it.name].removeArrayModifiers()
						}.toList().toTypedArray())
					).copyModifiers(func)

					if (!func.hasCustomJNI)
						JNI.registerArray(overload)

					list.add(overload)
				}

				if (multiTypeParam != null) {
					val multiType = multiTypeParam[MultiType]
					multiType.types.asSequence().filter { it !== PointerMapping.DATA_POINTER }.forEach { autoType ->
						val params = func.parameters.asSequence().map {
							if (it.nativeType.mapping.isArray)
								Parameter(
									ArrayType(it.nativeType as PointerType),
									it.name,
									it.paramType,
									it.documentation,
									"", LinkMode.SINGLE
								).copyModifiers(it).removeArrayModifiers()
							else if (it has MultiType)
								Parameter(
									ArrayType(it.nativeType as PointerType, autoType),
									it.name,
									it.paramType,
									it.documentation,
									"", LinkMode.SINGLE
								).copyModifiers(it).removeArrayModifiers()
							else
								func[it.name].removeArrayModifiers()
						}

						val overload = NativeClassFunction(
							returns = func.returns,
							simpleName = func.simpleName,
							name = func.name,
							documentation = { processDocumentation("${autoType.primitive}[] version of: ${func.methodLink}").toJavaDoc() },
							nativeClass = this@NativeClass,
							parameters = *params.toList().toTypedArray()
						).copyModifiers(func)
						overload.parameters.asSequence().firstOrNull {
							it has AutoSize && it[AutoSize].hasReference(multiTypeParam.name)
						}.let {
							if (it != null) {
								val autoSize = it[AutoSize]
								it.replaceModifier(AutoSizeShl(
									autoType.byteShift!!,
									autoSize.reference,
									*autoSize.dependent,
									applyTo = autoSize.applyTo
								))

							}
						}

						if (!func.hasCustomJNI)
							JNI.registerArray(overload)

						list.add(overload)
					}
				}
			}
		}

		list
	}

	private val customMethods = ArrayList<String>()

	val hasBody: Boolean
		get() = binding is SimpleBinding || !constantBlocks.isEmpty() || hasNativeFunctions || customMethods.isNotEmpty()

	val hasNativeFunctions: Boolean
		get() = _functions.isNotEmpty()

	val link: String get() = "{@link ${this.className} ${this.templateName}}"

	override fun processDocumentation(documentation: String): String = processDocumentation(documentation, prefixConstant, prefixMethod)

	override fun hasField(field: String): Boolean = constantBlocks.any { it.constants.any { it.name == field } }
	override fun hasMethod(method: String): Boolean = functions.any { it.simpleName == method }

	fun registerFunctions() {
		if ( binding != null ) {
			functions.asSequence()
				.filter { !it.hasCustomJNI }
				.forEach { JNI.register(it) }

			genFunctions // lazy init
		}
	}

	fun registerLinks(
		tokens: MutableMap<String, String>,
		duplicateTokens: MutableSet<String>,
	    functions: MutableMap<String, String>,
	    duplicateFunctions: MutableSet<String>
	) {
		if (!this.functions.any { it.has(Reuse) }) {
			constantBlocks.forEach {
				it.constants.forEach {
					if (tokens.put(it.name, "$className#$prefixConstant${it.name}") != null)
						duplicateTokens.add(it.name)
				}
			}
		}

		this.functions.asSequence().filter { !it.has(Reuse) }.forEach {
			if ( functions.put(it.simpleName, "$className#${it.name}()") != null )
				duplicateFunctions.add(it.simpleName)
		}
	}

	override fun PrintWriter.generateJava() {
		print(HEADER)
		println("package $packageName;\n")

		val hasFunctions = !_functions.isEmpty()
		if ( hasFunctions || binding is SimpleBinding ) {
			// TODO: This is horrible. Refactor so that we build imports after code generation.
			val hasBuffers = functions.any { it.returns.isBufferPointer || it.hasParam { it.isBufferPointer } }

			if ( hasBuffers ) {
				if ( functions.any {
					(it.returns.isBufferPointer && it.returns.nativeType.mapping !== PointerMapping.DATA_POINTER && it.returns.nativeType !is StructType)
					||
					it.hasParam { it.isBufferPointer && it.nativeType.mapping !== PointerMapping.DATA_POINTER && it.nativeType !is StructType }
				} )
					println("import java.nio.*;\n")

				val needsPointerBuffer: QualifiedType.() -> Boolean = {
					this.nativeType is PointerType &&
					(
						this.nativeType.elementType.let { it != null && (it !is StructType || it.includesPointer) && (it is PointerType || it.mapping == PrimitiveMapping.POINTER) } ||
						(this.has(Return) && this[Return] !== ReturnParam) ||
						(this.has(MultiType) && this[MultiType].types.contains(PointerMapping.DATA_POINTER))
					)
				}
				if ( functions.any { it.returns.needsPointerBuffer() || it.hasParam { it.needsPointerBuffer() } } )
					println("import org.lwjgl.*;\n")
			}

			val hasMemoryStack = hasBuffers && functions.any { func ->
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
			}

			if ( hasMemoryStack || (binding is SimpleBinding && !binding.libraryExpression.contains('.')) || functions.any { it.hasCustomJNI } )
				println("import org.lwjgl.system.*;\n")

			if ( hasFunctions && binding is SimpleBinding )
				println("import static org.lwjgl.system.APIUtil.*;")
			if ( hasFunctions )
				println("import static org.lwjgl.system.Checks.*;")
			if ( binding != null && functions.any { !it.hasCustomJNI } )
				println("import static org.lwjgl.system.JNI.*;")
			if ( hasMemoryStack )
				println("import static org.lwjgl.system.MemoryStack.*;")
			if ( hasBuffers ) {
				println("import static org.lwjgl.system.MemoryUtil.*;")
				if ( functions.any { it.hasParam { it.has(MultiType) && it[MultiType].types.contains(PointerMapping.DATA_POINTER) } } )
					println("import static org.lwjgl.system.Pointer.*;")
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

		if ( hasFunctions || binding is SimpleBinding ) {
			if ( binding != null ) {
				if ( functions.any { it.hasCustomJNI } )
					println("\n\tstatic { Library.initialize(); }")

				printCustomMethods(static = true)

				if ( binding is SimpleBinding || functions.any { !it.hasExplicitFunctionAddress } ) {
					println("""
	${if ( hasFunctions ) "protected" else "private"} $className() {
		throw new UnsupportedOperationException();
	}""")
					binding.generateFunctionSetup(this, this@NativeClass)
				}
			} else {
				println("\n\tstatic { Library.initialize(); }")

				printCustomMethods(static = true)

				// This allows binding classes to be "statically" extended. Not a good practice, but usable with static imports.
				println("""
	protected $className() {
		throw new UnsupportedOperationException();
	}""")
			}
		} else {
			println("\n\tprivate $className() {}")
		}

		genFunctions.forEach { func ->
			if ( !func.hasParam { it.nativeType is ArrayType } )
				println("\n\t// --- [ ${func.name} ] ---")
			try {
				func.generateMethods(this)
			} catch (e: Exception) {
				throw RuntimeException("Uncaught exception while generating method: $className.${func.name}", e)
			}
		}

		printCustomMethods(static = false)

		print("\n}")
	}

	override val skipNative: Boolean get() = functions.none() { it.hasCustomJNI }

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

		genFunctions.asSequence().filter { it.hasCustomJNI }.forEach {
			println()
			it.generateFunction(this)
		}

		println("\nEXTERN_C_EXIT")
	}

	fun nativeDirectivesWarning() {
		if ( preamble.hasNativeDirectives )
			println("\tUnnecessary native directives in: $packageName.$templateName")
	}

	fun printPointers(
		out: PrintWriter,
		printPointer: (func: NativeClassFunction) -> String = { it.name },
		filter: ((NativeClassFunction) -> Boolean)? = null
	) {
		out.print("\n\t\t\t")

		val functions = _functions.values.let { if ( filter == null ) it else it.filter(filter) }

		var lineSize = 12
		functions.forEachWithMore { func, more ->
			if ( more ) {
				out.print(", ")
				lineSize += 2
			}

			val pointer = printPointer(func)

			lineSize += pointer.length
			if ( 160 <= lineSize ) {
				out.print("\n\t\t\t")
				lineSize = 12 + pointer.length
			}

			out.print(pointer)
		}

		out.print("\n\t\t")
	}

	// DSL extensions

	operator fun <T : Any> ConstantType<T>.invoke(documentation: String, vararg constants: Constant<out T>, access: Access = Access.PUBLIC): ConstantBlock<T> {
		val block = ConstantBlock(this@NativeClass, access, this, { processDocumentation(documentation).toJavaDoc() }, *constants)
		constantBlocks.add(block)
		return block
	}

	/** Adds a new constant. */
	operator fun <T : Any> String.rangeTo(value: T) = Constant(this, value)

	/** Adds a new enum constant. */
	val String.enum: Constant<EnumValue> get() = Constant(this, EnumValue())

	infix fun String.enum(documentation: String) =
		Constant(this, EnumValue({ if ( documentation.isEmpty() ) null else processDocumentation(documentation).toJavaDoc() }))
	infix fun String.enum(value: Int) = Constant(this, EnumValue(value = value))
	fun String.enum(documentation: String, value: Int) =
		Constant(this, EnumValue({ if ( documentation.isEmpty() ) null else processDocumentation(documentation).toJavaDoc() }, value))

	fun String.enumExpr(documentation: String, expression: String) =
		Constant(this, EnumValueExpression({ if ( documentation.isEmpty() ) null else processDocumentation(documentation).toJavaDoc() }, expression))

	/** Adds a new constant whose value is an expression. */
	infix fun <T : Any> String.expr(expression: String) = ConstantExpression<T>(this, expression)

	operator fun NativeType.invoke(name: String, documentation: String, vararg parameters: Parameter, returnDoc: String = "", since: String = "", noPrefix: Boolean = false) =
		ReturnValue(this)(name, documentation, *parameters, returnDoc = returnDoc, since = since, noPrefix = noPrefix)

	operator fun ReturnValue.invoke(name: String, documentation: String, vararg parameters: Parameter, returnDoc: String = "", since: String = "", noPrefix: Boolean = false): NativeClassFunction {
		val func = NativeClassFunction(
			returns = this,
			simpleName = name,
			name = if ( noPrefix ) name else "$prefixMethod$name",
			documentation = { parameterFilter ->
				this@NativeClass.toJavaDoc(
					processDocumentation(documentation),
					parameters.asSequence().filter { it !== JNI_ENV && parameterFilter(it) },
					this.nativeType,
					returnDoc,
					since
				)
			},
			nativeClass = this@NativeClass,
			parameters = *parameters
		)

		_functions.put(name, func)
		return func
	}

	fun customMethod(method: String) {
		customMethods.add(method)
	}

	fun initializeAllocator() {
		customMethod("static { MemoryUtil.getAllocator(); }")
	}

	private fun PrintWriter.printCustomMethods(static: Boolean) {
		customMethods.filter { it.startsWith("static {") == static }.forEach {
			println("\n\t${it.trim()}")
		}
	}

	operator fun NativeClass.get(functionName: String) = _functions[functionName] ?: throw IllegalArgumentException("Referenced function does not exist: $templateName.$functionName")

	infix fun NativeClass.reuse(functionName: String): NativeClassFunction {
		val reference = this[functionName]

		val func = Reuse..NativeClassFunction(
			returns = reference.returns,
			simpleName = reference.simpleName,
			name = reference.name,
			documentation = { this@NativeClass.convertDocumentation(this, reference.name, reference.documentation(it)) },
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

	infix fun Int.x(other: Int) = this * other

	private fun convertDocumentation(referenceClass: NativeClass, referenceFunction: String, documentation: String): String {
		val matcher = JDOC_LINK_PATTERN.matcher(documentation)
		if ( !matcher.find() )
			return documentation

		val buffer = StringBuilder(documentation.length)
		var lastEnd = 0
		do {
			buffer.append(documentation, lastEnd, matcher.start())

			val element = matcher.group(1)

			if ( referenceClass.prefixConstant.isNotEmpty() && element.startsWith(referenceClass.prefixConstant) ) {
				if ( element.substring(referenceClass.prefixConstant.length).let { constant ->
					!this.constantBlocks.any { block -> block.constants.any { it -> it.name == constant } }
				} )
					buffer.append(referenceClass.className)
			} else if ( !this.functions.any { it -> it.name == element } && referenceFunction != element )
				buffer.append(referenceClass.className)

			buffer.append(matcher.group(0))

			lastEnd = matcher.end()
		} while ( matcher.find() )
		buffer.append(documentation, lastEnd, documentation.length)

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

	binding?.addClass(ext)

	return ext
}