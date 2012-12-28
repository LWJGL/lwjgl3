/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

import java.io.PrintWriter
import java.util.ArrayList
import java.util.HashMap
import java.util.LinkedHashMap
import org.lwjgl.generator.opengl.*
import java.nio.*

/*
	****
	The code below implements the more complex parts of LWJGL's code generation.
	Please only modify if you fully understand what's going on and you know
	what you're doing.
	****

	The basic generation is relatively straightforward. It's an almost 1-to-1 mapping
	of the native function signature to the proper Java -> JNI -> native function code.

	We then try to generate additional Java methods that make the user's life easier. We
	use the TemplateModifiers on the function signature parameters and return values to figure
	out what kind of FunctionTransforms we should apply. Depending on the modifiers, we
	may generate one or more additional methods.
*/

// Global definitions

val RESULT = "__result"
val API_BUFFER = "__buffer"
val POINTER_POSTFIX = "Address"

val FUNCTION_ADDRESS = "__functionAddress"
val JNIENV = "__env"

public abstract class Function(
	val returns: ReturnValue,
	val name: String,
    val documentation: String,
    vararg params: Parameter
): TemplateElement() {

	protected val parameters: MutableMap<String, Parameter> = LinkedHashMap<String, Parameter>(); // Maintain order

	{
		for ( param in params )
			parameters.put(param.name, param)
	}

}

// DSL extensions

public fun NativeType.IN(name: String, javadoc: String, links: String = ""): Parameter = Parameter(this, name, ParameterType.IN, javadoc, links)
public fun NativeType.OUT(name: String, javadoc: String, links: String = ""): Parameter = Parameter(this, name, ParameterType.OUT, javadoc, links)
public fun NativeType.INOUT(name: String, javadoc: String, links: String = ""): Parameter = Parameter(this, name, ParameterType.INOUT, javadoc, links)

private fun <T> PrintWriter.printList(items: Map<*, T>, itemPrint: (item: T) -> String?): Unit = printList(items.values(), itemPrint)
private fun <T> PrintWriter.printList(items: Iterable<T>, itemPrint: (item: T) -> String?) {
	val iter = items.iterator()

	var first = true
	while ( iter.hasNext() ) {
		val item = itemPrint(iter.next())
		if ( item != null ) {
			if ( !first )
				print(", ")
			else
				first = false

			print(item)
		}
	}
}

// --- [ Native class functions ] ---

public class NativeClassFunction(
	returns: ReturnValue,
	name: String,
    documentation: String,
    val nativeClass: NativeClass,
    vararg parameters: Parameter
): Function(returns, name, documentation, *parameters) {

	{
		validate();
	}

	private val strippedName = stripPostfix()

	private fun stripPostfix(val stripType: Boolean = false): String {
		if ( parameters.isEmpty() )
			return name

		val param = parameters.values().last()
		if ( !param.isBufferPointer )
			return name

		var name = this.name
		if ( !nativeClass.postfix.isEmpty() && name.endsWith(nativeClass.postfix) )
			name = name.substring(0, name.size - nativeClass.postfix.size)

		var cutCount = if ( name.endsWith("v") ) 1 else 0

		if ( stripType ) {
			val pointerMapping = param.nativeType.mapping as PointerMapping
			val typeChar = when ( pointerMapping ) {
				PointerMapping.DATA_SHORT -> 's'
				PointerMapping.DATA_INT -> 'i'
				PointerMapping.DATA_LONG -> 'l'
				PointerMapping.DATA_FLOAT -> 'f'
				PointerMapping.DATA_DOUBLE -> 'd'
				else -> 0.toChar()
			}

			if ( typeChar != 0.toChar() && name.charAt(name.size - cutCount - 1) == typeChar )
				cutCount++
		}

		return name.substring(0, name.size - cutCount) + nativeClass.postfix
	}

	public val javaDocLink: String
		get() {
			val builder = StringBuilder()

			builder append "{@link #"
			builder append strippedName
			builder append '('

			var first = true
			parameters.values().filter { !it.has(CallbackData.CLASS) } forEach {
				if ( first )
					first = false
				else
					builder append ", "

				builder append if ( it.isBufferPointer )
					"ByteBuffer"
				else
					it.javaMethodType
			}
			builder append ")}"

			return builder.toString()
		}

	private fun getParams(predicate: (Parameter) -> Boolean): Iterator<Parameter> = parameters.values().iterator().filter(predicate)
	private fun getParam(predicate: (Parameter) -> Boolean): Parameter {
		val params = getParams(predicate)
		val param = params.next()
		if ( params.hasNext() )
			throw IllegalStateException("More than one parameter found.")
		return param
	}
	private fun hasParam(predicate: (Parameter) -> Boolean): Boolean = getParams(predicate).hasNext()

	/** Returns a parameter that has the specified ReferenceModifier with the specified reference. Returns null if no such parameter exists. */
	private fun getReferenceParam(modifier: Class<out ReferenceModifier>, reference: String): Parameter? {
		// Assumes at most 1 parameter will be found that references the specified parameter
		val iter = getParams {
			it.hasRef(modifier, reference)
		}
		return if ( iter.hasNext() )
			iter.next()
		else
			null
	}

	private fun hasSimpleParamsOnly(): Boolean {
		if ( returns.isBufferPointer || returns.hasSpecialModifier() )
			return false

		return parameters.values().find { it.isBufferPointer || it.hasSpecialModifier() } == null
	}

	val isSimpleFunction: Boolean
		get() = nativeClass.functionProvider == null && hasSimpleParamsOnly()

	private fun Parameter.error(msg: String) {
		throw IllegalArgumentException("$msg [${nativeClass.className}.${this@NativeClassFunction.name}, parameter: ${this.name}]")
	}

	/** Validates parameters with modifiers that reference other parameters. */
	private fun validate() {
		var returnCount = 0
		parameters.values().forEach {
			if ( it has AutoSize.CLASS ) {
				val bufferParamName = it[AutoSize.CLASS].reference
				val bufferParam = parameters[bufferParamName]
				when {
					bufferParam == null -> it.error("Buffer reference does not exist: AutoSize($bufferParamName)")
					!(bufferParam!!.nativeType is PointerType) -> it.error("Buffer reference must be a pointer type: AutoSize($bufferParamName)")
					!bufferParam!!.isBufferPointer -> it.error("Buffer reference must not be a naked pointer: AutoSize($bufferParamName)")
					else -> {
					}
				}
			}

			if ( it has AutoType.CLASS ) {
				val bufferParamName = it[AutoType.CLASS].reference
				val bufferParam = parameters[bufferParamName]
				when {
					bufferParam == null -> it.error("Buffer reference does not exist: AutoType($bufferParamName)")
					!(bufferParam!!.nativeType is PointerType) -> it.error("Buffer refence must be a pointer type: AutoType($bufferParamName)")
					bufferParam!!.nativeType.mapping != PointerMapping.DATA -> it.error("Pointer reference must have a DATA mapping: AutoType($bufferParamName)")
					else -> {
					}
				}
			}

			if ( it has CallbackData.CLASS ) {
				val functionParamName = it[CallbackData.CLASS].reference
				val functionParam = parameters[functionParamName]
				when {
					functionParam == null -> it.error("Function reference does not exist: CallbackParam($functionParamName)")
					!(functionParam!!.nativeType is CallbackType) -> it.error("Function reference must be a callback type: CallbackParam($functionParamName)")
					else -> {
					}
				}
			}

			if ( it has returnValue ) {
				if ( !returns.isVoid )
					it.error("A return value can only be specified for functions with void return type.")

				returnCount++
				if ( 1 < returnCount )
					it.error("More than one return value found.")
			}
		}
	}

	private fun PrintWriter.generateChecks(mode: GenerationMode, customChecks: List<String>? = null, transforms: Map<QualifiedType, FunctionTransform<out QualifiedType>>? = null) {
		val checks = ArrayList<String>()

		// Validate function address
		if ( nativeClass.functionProvider != null )
			checks add "checkFunctionAddress($FUNCTION_ADDRESS);"

		// We convert multi-byte-per-element buffers to ByteBuffer for NORMAL generation.
		// So we need to scale the length check by the number of bytes per element.
		fun bufferShift(expression: String, param: String, shift: String, transform: FunctionTransform<out QualifiedType>?): String {
			val mapping =
				if ( transform != null && javaClass<AutoTypeTargetTransform>().isAssignableFrom(transform.javaClass) ) {
					(transform as AutoTypeTargetTransform).autoType
				} else
					parameters[param]!!.nativeType.mapping as PointerMapping

			if ( mapping.byteShift == null )
				return expression

			val builder = StringBuilder(expression.size + 8)

			if ( expression.indexOf(' ') != -1 ) {
				builder append '('
				builder append expression
				builder append ')'
			} else
				builder append expression

			builder append ' '
			builder append shift
			builder append ' '
			builder append mapping.byteShift

			return builder.toString()
		}

		parameters.values().forEach {
			var prefix =
				if ( it has nullable )
					"if ( ${it.name} != null ) "
				else {
					if ( it.nativeType.mapping == PointerMapping.NAKED_POINTER && (!it.has(CallbackData.CLASS) && it.nativeType !is CallbackType) )
						checks add "checkPointer(${it.name});"
					""
				}

			if ( mode == GenerationMode.NORMAL && it.nativeType is CharSequenceType ) {
				val charSeqType = it.nativeType as CharSequenceType
				if ( charSeqType.nullTerminated )
					checks add "${prefix}checkNT${charSeqType.charMapping.bytes}(${it.name});"
			}

			if ( it has nullTerminated ) {
				if ( mode == GenerationMode.NORMAL ) {
					val ntBytes = when ( it.nativeType.mapping ) {
						PointerMapping.DATA_SHORT -> 2
						PointerMapping.DATA_INT -> 4
						PointerMapping.DATA_LONG -> 8
						PointerMapping.DATA_FLOAT -> 4
						PointerMapping.DATA_DOUBLE -> 8
						else -> 1
					}
					checks add "${prefix}checkNT$ntBytes(${it.name});"
				} else
					checks add "${prefix}checkNT(${it.name});"
			}

			if ( it.nativeType is StructType ) {
				val structType = it.nativeType as StructType
				checks add "${prefix}checkBuffer(${it.name}, ${structType.definition.className}.SIZEOF);"
			}

			if ( it has Check.CLASS ) {
				val transform = transforms?.get(it)
				if ( transform == null || (transform != BufferOffsetTransform && transform != BufferValueParameterTransform && transform != SingleValueTransform) ) {
					val check = it[Check.CLASS]

					if ( check.debug ) prefix = "if ( LWJGLUtil.DEBUG )\n\t\t\t\t$prefix"

					if ( check.bytes )
						checks add "${prefix}checkBuffer(${it.name}, ${bufferShift(check.expression, it.name, ">>", transform)});"
					else if ( mode == GenerationMode.NORMAL )
						checks add "${prefix}checkBuffer(${it.name}, ${bufferShift(check.expression, it.name, "<<", transform)});"
					else
						checks add "${prefix}checkBuffer(${it.name}, ${check.expression});"
				}
			}

			if ( mode == GenerationMode.NORMAL && it has BufferObject.CLASS ) {
				checks add "GLChecks.ensureBufferObject(${it[BufferObject.CLASS].binding}, false);"
			}

			if ( it has AutoSize.CLASS ) {
				val autoSize = it[AutoSize.CLASS]
				if ( mode == GenerationMode.NORMAL ) {
					var length = it.name
					if ( autoSize.expression != null )
						length += autoSize.expression

					checks add "${prefix}checkBuffer(${autoSize.reference}, ${bufferShift(length, autoSize.reference, "<<", null)});"
					for ( d in autoSize.dependent )
						checks add "${prefix}checkBuffer($d, ${bufferShift(length, d, "<<", null)});"
				} else {
					val expression = if ( transforms != null && transforms[parameters[autoSize.reference]] == SingleValueTransform )
						"1"
					else
						"${autoSize.reference}.remaining()"

					for ( d in autoSize.dependent )
						checks add "${prefix}checkBuffer($d, $expression);"
				}
			}
		}

		if ( customChecks != null )
			checks addAll customChecks

		if ( !checks.isEmpty() ) {
			print("\t\tif ( LWJGLUtil.CHECKS )")
			if ( checks.size == 1 )
				println()
			else
				println(" {")
			checks.forEach {
				print("\t\t\t")
				println(it)
			}
			if ( 1 < checks.size )
				println("\t\t}")
		}
	}

	/** This is where we start generating java code. */
	fun generateMethods(writer: PrintWriter) {
		val simpleFunction = isSimpleFunction

		writer.generateNativeMethod(simpleFunction)

		if ( !simpleFunction ) {
			// This the only special case where we don't generate a "normal" Java method. If we did,
			// we'd need to add a postfix to either this or the alternative method, since we're
			// changing the return type. It looks ugly and LWJGL didn't do it pre-3.0 either.
			if ( !(returns.nativeType is CharSequenceType) )
				writer.generateJavaMethod()

			writer.generateAlternativeMethods()
		}
	}

	// --[ JAVA METHODS ]--

	private fun PrintWriter.generateJavaDocLink(description: String, function: NativeClassFunction) {
		println("\t/** $description ${function.javaDocLink} */")
	}

	private fun PrintWriter.generateNativeMethod(nativeOnly: Boolean) {
		if ( nativeOnly )
			println(documentation)
		else
			generateJavaDocLink("JNI method for", this@NativeClassFunction)

		print("\tpublic static native ${returns.nativeMethodType} ")
		if ( !nativeOnly )
			print('n')
		print("$name(")
		printList(parameters) {
			it.asNativeMethodParam(parameters)
		}
		if ( nativeClass.functionProvider != null ) {
			if ( !parameters.isEmpty() )
				print(", ")
			print("long $FUNCTION_ADDRESS")
		}
		println(");\n")
	}

	private fun PrintWriter.generateJavaMethod() {
		// Step 0: JavaDoc

		if ( nativeClass.className.startsWith("GL") )
			printOpenGLJavaDoc(documentation, stripPostfix(true), this@NativeClassFunction has deprecatedGL)
		else
			println(documentation)

		// Step 1: Method signature

		print("\tpublic static ${returns.javaMethodType} $strippedName(")
		printList(parameters) {
			if ( it has CallbackData.CLASS )
				null
			else if ( it.isBufferPointer )
				"ByteBuffer ${it.name}" // Convert multi-byte-per-element buffers to ByteBuffer
			else
				it.asJavaMethodParam
		}
		println(") {")

		// Step 2: Get function address

		if ( nativeClass.functionProvider != null )
			nativeClass.functionProvider.generateFunctionAddress(this, this@NativeClassFunction)

		// Step 3: Generate checks
		generateChecks(GenerationMode.NORMAL);

		// Step 4: Call the native method

		print("\t\t")
		if ( !returns.isVoid ) {
			if ( returns.isBufferPointer )
				print("long $RESULT = ")
			else
				print("return ")
		}
		generateNativeMethodCall()
		println(";")

		if ( !returns.isVoid && returns.isBufferPointer ) {
			print("\t\treturn memByteBuffer")
			if ( returns.nativeType is CharSequenceType && returns.nativeType.nullTerminated )
				print("NT${returns.nativeType.charMapping.bytes}")
			print("($RESULT")
			// TODO: Add support for AutoSize
			println(");")
		}

		println("\t}\n")
	}

	private fun PrintWriter.generateNativeMethodCall() {
		print("n$name(")
		printList(parameters) {
			it.asNativeMethodCallParam
		}
		if ( nativeClass.functionProvider != null ) {
			if ( !parameters.isEmpty() )
				print(", ")
			print("$FUNCTION_ADDRESS")
		}
		print(")")
	}

	/** Alternative methods are generated by applying one or more transformations. */
	private fun PrintWriter.generateAlternativeMethods() {
		val transforms = HashMap<QualifiedType, FunctionTransform<out QualifiedType>>()
		val customChecks = ArrayList<String>()

		if ( returns.nativeType is CharSequenceType )
			transforms[returns] = StringReturnTransform

		getParams { it has BufferObject.CLASS } forEach {
			transforms[it] = BufferOffsetTransform
			customChecks add ("GLChecks.ensureBufferObject(${it[BufferObject.CLASS].binding}, true);")
			generateAlternativeMethod(strippedName, "Buffer object offset version of:", transforms, customChecks, "") // TODO: "" is there because of a Kotlin bug
			transforms.remove(it)
		}

		// Step 1: Apply basic transformations
		parameters.values() forEach {
			if ( it.nativeType is CharSequenceType )
				transforms[it] = CharSequenceTransform
			else if ( it has AutoSize.CLASS ) {
				val autoSize = it[AutoSize.CLASS]
				// Check if there's also an AutoType on the referenced parameter. Skip if so.
				if ( getReferenceParam(AutoType.CLASS, autoSize.reference) == null )
					transforms[it] = AutoSizeTransform(parameters[autoSize.reference]!!)
			} else if ( it has Expression.CLASS )
				transforms[it] = ExpressionTransform
		}

		// Step 2: Check if we have any basic transformation to apply or if we have a multi-byte-per-element buffer parameter
		if ( !transforms.isEmpty() || parameters.values().any { it.isBufferPointer && (it.nativeType.mapping as PointerMapping).isMultiByte } )
			generateAlternativeMethod(stripPostfix(true), "Alternative version of:", transforms, customChecks)

		// Step 3: Generate more complex alternatives if necessary
		parameters.values() forEach {
			val paramName = it.name

			if ( it has returnValue ) {
				// Generate Return alternative

				// Transform void to the proper type
				transforms[returns] = BufferValueReturnTransform(PointerMapping.primitiveMap[it.nativeType.mapping]!!, paramName)

				// Transform the AutoSize parameter, if there is one
				getParams { it has AutoSize.CLASS && it.get(AutoSize.CLASS).hasReference(paramName) }.forEach {
					transforms[it] = BufferValueSizeTransform
				}

				// Transform the returnValue parameter
				transforms[it] = BufferValueParameterTransform

				generateAlternativeMethod(strippedName, "Single return value version of:", transforms, customChecks, "") // TODO: "" is there because of a Kotlin bug
			} else if ( it has SingleValue.CLASS ) {
				// Generate SingleValue alternative

				// Transform the AutoSize parameter, if there is one
				getParams { it has AutoSize.CLASS && it.get(AutoSize.CLASS).hasReference(paramName) }.forEach {
					transforms[it] = BufferValueSizeTransform
				}
				transforms[it] = SingleValueTransform
				generateAlternativeMethod(strippedName, "Single value version of:", transforms, customChecks, "") // TODO: "" is there because of a Kotlin bug
			} else if ( it has MultiType.CLASS ) {
				// Generate MultiType alternatives
				customChecks.clear()

				val multiTypes = it[MultiType.CLASS]
				if ( it has BufferObject.CLASS )
					customChecks add ("GLChecks.ensureBufferObject(${it[BufferObject.CLASS].binding}, false);")

				for ( autoType in multiTypes.types ) {
					transforms[it] = AutoTypeTargetTransform(autoType)
					generateAlternativeMethod(strippedName, "${autoType.javaMethodType.getSimpleName()} version of:", transforms, customChecks, "") // TODO: "" is there because of a Kotlin bug
				}
			} else if ( it has AutoType.CLASS ) {
				// Generate AutoType alternatives
				customChecks.clear()

				// Add the AutoSize transformation if we skipped it above
				getParams { it has AutoSize.CLASS } forEach {
					transforms[it] = AutoSizeTransform(parameters[it[AutoSize.CLASS].reference]!!)
				}

				val autoTypes = it[AutoType.CLASS]
				val bufferParam = parameters[autoTypes.reference]!!
				if ( bufferParam has BufferObject.CLASS )
					customChecks add ("GLChecks.ensureBufferObject(${bufferParam[BufferObject.CLASS].binding}, false);")

				val types = ArrayList<BufferType>(autoTypes.types.size)
				autoTypes.types.forEach { types add it }

				for ( autoType in autoTypes.types ) {
					val unsignedType = when ( autoType ) {
						BufferType.GL_BYTE -> BufferType.GL_UNSIGNED_BYTE
						BufferType.GL_SHORT -> BufferType.GL_UNSIGNED_SHORT
						BufferType.GL_INT -> BufferType.GL_UNSIGNED_INT
						BufferType.GL_LONG -> BufferType.GL_UNSIGNED_LONG

						else -> null
					}

					if ( unsignedType == null || !types.contains(unsignedType) )
						continue

					transforms[it] = AutoTypeParamWithSignTransform("GL11.${unsignedType.name()}", "GL11.${autoType.name()}")
					transforms[bufferParam] = AutoTypeTargetTransform(autoType.mapping)
					generateAlternativeMethod(strippedName, "${unsignedType.name()} / ${autoType.name()} version of:", transforms, customChecks, "") // TODO: "" is there because of a Kotlin bug

					types.remove(autoType)
					types.remove(unsignedType)
				}

				for ( autoType in types ) {
					transforms[it] = AutoTypeParamTransform("GL11.${autoType.name()}")
					transforms[bufferParam] = AutoTypeTargetTransform(autoType.mapping)
					generateAlternativeMethod(strippedName, "${autoType.name()} version of:", transforms, customChecks, "") // TODO: "" is there because of a Kotlin bug
				}
			}
		}
	}

	private fun PrintWriter.generateAlternativeMethod(
		name: String,
		description: String,
		transforms: Map<QualifiedType, FunctionTransform<out QualifiedType>>,
		customChecks: List<String>,
		postFix: String = ""
	) {
		// Step 0: JavaDoc

		if ( transforms[returns] == StringReturnTransform ) // Special-case, we skipped the normal method
			println(documentation)
		else
			generateJavaDocLink(description, this@NativeClassFunction)

		// Step 1: Method signature

		val retType = returns.transformDeclarationOrElse(transforms, returns.javaMethodType)

		print("\tpublic static $retType $name$postFix(")
		printList(parameters) {
			if ( it has CallbackData.CLASS )
				null
			else
				it.transformDeclarationOrElse(transforms, it.asJavaMethodParam)
		}
		println(") {")

		// Step 2: Get function address

		if ( nativeClass.functionProvider != null )
			nativeClass.functionProvider.generateFunctionAddress(this, this@NativeClassFunction)

		// Step 3: Generate checks

		generateChecks(GenerationMode.ALTERNATIVE, customChecks, transforms);

		// Step 3.5: Prepare APIBuffer parameters if necessary.

		var apiBufferSet = false

		if ( returns.isVoid && transforms[returns] != null ) {
			if ( !apiBufferSet ) {
				println("\t\tAPIBuffer $API_BUFFER = apiBuffer();")
				apiBufferSet = true
			}

			val returnParam = getParam { it has returnValue }
			val returnType = PointerMapping.primitiveMap[returnParam.nativeType.mapping]!!

			println("\t\tint ${returnParam.name} = $API_BUFFER.${returnType}Param();")
		}

		parameters.values() forEach {
			if ( transforms[it] == SingleValueTransform ) {
				if ( !apiBufferSet ) {
					println("\t\tAPIBuffer $API_BUFFER = apiBuffer();")
					apiBufferSet = true
				}

				val primitiveType = PointerMapping.primitiveMap[it.nativeType.mapping]!!

				println("\t\tint ${it.name} = $API_BUFFER.${primitiveType}Param();")
				println("\t\t$API_BUFFER.${primitiveType}Value(${it.name}, ${it.get(SingleValue.CLASS).newName});")
			}
		}

		// Step 4: Call the native method

		print("\t\t")
		if ( !returns.isVoid ) {
			if ( returns.isBufferPointer )
				print("long $RESULT = ")
			else
				print("return ")
		}
		generateAlternativeNativeMethodCall(transforms)
		println(";")

		if ( returns.isVoid ) {
			val result = returns.transformCallOrElse(transforms, "")
			if ( !result.isEmpty() )
				println(result)
		} else {
			if ( returns.isBufferPointer ) {
				print("\t\treturn ")

				val builder = StringBuilder()
				builder append "memByteBuffer"
				if ( returns.nativeType is CharSequenceType && returns.nativeType.nullTerminated )
					builder append "NT${returns.nativeType.charMapping.bytes}"
				builder append "($RESULT)" // TODO: Add support for AutoSize

				print(returns.transformCallOrElse(transforms, builder.toString()))
				println(";")
			}
		}

		println("\t}\n")
	}

	private fun PrintWriter.generateAlternativeNativeMethodCall(transforms: Map<QualifiedType, FunctionTransform<out QualifiedType>>) {
		print("n$name(")
		printList(parameters) {
			it.transformCallOrElse(transforms, it.asNativeMethodCallParam)
		}
		if ( nativeClass.functionProvider != null ) {
			if ( !parameters.isEmpty() )
				print(", ")
			print("$FUNCTION_ADDRESS")
		}
		print(")")
	}

	// --[ JNI FUNCTIONS ]--

	fun generateFunctionDefinition(writer: PrintWriter): Unit = writer.generateFunctionDefinitionImpl()
	private fun PrintWriter.generateFunctionDefinitionImpl() {
		print("typedef ${returns.toNativeType} (APIENTRY *${name}PROC) (")
		printList(parameters) {
			it.toNativeType
		}
		println(");")
	}

	fun generateFunction(writer: PrintWriter): Unit = writer.generateFunctionImpl()
	private fun PrintWriter.generateFunctionImpl() {
		// Step 0: Function signature

		print("JNIEXPORT ${returns.jniFunctionType} JNICALL Java_${nativeClass.nativeFileName}_")
		if ( !isSimpleFunction )
			print('n')
		print("$name(")
		print("JNIEnv *$JNIENV, jclass clazz")
		parameters.values().forEach {
			print(", ${it.asJNIFunctionParam}")
		}
		if ( nativeClass.functionProvider != null )
			print(", jlong $FUNCTION_ADDRESS")
		println(") {")

		// Step 1: Cast addresses to pointers

		parameters.values().iterator().filter { it.nativeType is PointerType }.forEach {
			val pointerType = it.toNativeType
			val ws = if ( pointerType[pointerType.size - 1] == '*' ) "" else " "
			println("\t$pointerType$ws${it.name} = ($pointerType)(intptr_t)${it.name}$POINTER_POSTFIX;")
		}

		// Step 2: Cast function address to pointer

		if ( nativeClass.functionProvider != null )
			println("\t${name}PROC $name = (${name}PROC)(intptr_t)$FUNCTION_ADDRESS;")

		// Step 3: Call native function

		print('\t')
		if ( !returns.isVoid ) {
			print("return (${returns.jniFunctionType})")
			if ( returns.nativeType is PointerType )
				print("(intptr_t)")
		}
		print("$name(")
		printList(parameters) {
			it.name
		}
		println(");")

		print("}")
	}

}

enum class GenerationMode {
	NORMAL
	ALTERNATIVE
}

// --- [ MODIFIERS ]---

public class DependsOn(reference: String): ReferenceModifier(reference) {
	class object {
		val CLASS = javaClass<DependsOn>()
	}

	override fun validate(ttype: TemplateElement) {
		if ( ttype !is NativeClassFunction )
			throw IllegalArgumentException("The DependsOn modifier can only be applied on functions.")
	}
}

// --- [ ALTERNATIVE FUNCTION TRANSFORMS ] ---

private trait FunctionTransform<T: QualifiedType> {
	fun transformDeclaration(param: T, original: String): String?
	fun transformCall(param: T, original: String): String
}

private fun <T: QualifiedType> T.transformDeclarationOrElse(transforms: Map<QualifiedType, FunctionTransform<out QualifiedType>>, original: String): String? {
	val transform = transforms[this]
	if ( transform == null )
		return original
	else
		return (transform as FunctionTransform<T>).transformDeclaration(this, original)
}

private fun <T: QualifiedType> T.transformCallOrElse(transforms: Map<QualifiedType, FunctionTransform<out QualifiedType>>, original: String): String {
	val transform = transforms[this]
	if ( transform == null )
		return original
	else
		return (transform as FunctionTransform<T>).transformCall(this, original)
}

private class AutoSizeTransform(val bufferParam: Parameter): FunctionTransform<Parameter> {
	override fun transformDeclaration(param: Parameter, original: String): String? = null // Remove the parameter
	override fun transformCall(param: Parameter, original: String): String { // Replace with expression
		return if ( bufferParam has nullable )
			"${bufferParam.name} == null ? 0 : ${bufferParam.name}.remaining()"
		else
			"${bufferParam.name}.remaining()"
	}
}

private class AutoTypeParamTransform(val autoType: String): FunctionTransform<Parameter> {
	override fun transformDeclaration(param: Parameter, original: String): String? = null // Remove the parameter
	override fun transformCall(param: Parameter, original: String): String = autoType // Replace with hard-coded type
}

private class AutoTypeParamWithSignTransform(val unsignedType: String, val signedType: String): FunctionTransform<Parameter> {
	override fun transformDeclaration(param: Parameter, original: String): String? = "boolean unsigned" // Replace with unsigned flag
	override fun transformCall(param: Parameter, original: String): String = "unsigned ? $unsignedType : $signedType" // Replace with unsigned check
}

private class AutoTypeTargetTransform(val autoType: PointerMapping): FunctionTransform<Parameter> {
	override fun transformDeclaration(param: Parameter, original: String): String? = "${autoType.javaMethodType.getSimpleName()} ${param.name}"
	override fun transformCall(param: Parameter, original: String): String = original
}

private val BufferOffsetTransform = object : FunctionTransform<Parameter> {
	override fun transformDeclaration(param: Parameter, original: String): String? = "long ${param.name}Offset"
	override fun transformCall(param: Parameter, original: String): String = "${param.name}Offset"
}

private val ExpressionTransform = object : FunctionTransform<Parameter> {
	override fun transformDeclaration(param: Parameter, original: String): String? = if ( param[Expression.CLASS].keepParam ) original else null
	override fun transformCall(param: Parameter, original: String): String = param[Expression.CLASS].value
}

private val CharSequenceTransform = object : FunctionTransform<Parameter> {
	override fun transformDeclaration(param: Parameter, original: String): String? = "CharSequence ${param.name}"
	override fun transformCall(param: Parameter, original: String): String = "memAddress(memEncode${(param.nativeType as CharSequenceType).charMapping.charset}(${param.name}))"
}

private val StringReturnTransform = object : FunctionTransform<ReturnValue> {
	override fun transformDeclaration(param: ReturnValue, original: String): String? = "String"
	override fun transformCall(param: ReturnValue, original: String): String = "memDecode${(param.nativeType as CharSequenceType).charMapping.charset}($original)";
}

private class BufferValueReturnTransform(val bufferType: String, val paramName: String): FunctionTransform<ReturnValue> {
	override fun transformDeclaration(param: ReturnValue, original: String): String? = if ( bufferType == "pointer" ) "long" else bufferType // Replace void with the buffer value type
	override fun transformCall(param: ReturnValue, original: String): String = "\t\treturn $API_BUFFER.${bufferType}Value($paramName);" // Replace with value from APIBuffer
}

private val BufferValueParameterTransform = object : FunctionTransform<Parameter> {
	override fun transformDeclaration(param: Parameter, original: String): String? = null // Remove the parameter
	override fun transformCall(param: Parameter, original: String): String = "$API_BUFFER.address() + ${param.name}" // Replace with APIBuffer address + offset
}

private val BufferValueSizeTransform = object : FunctionTransform<Parameter> {
	override fun transformDeclaration(param: Parameter, original: String): String? = null // Remove the parameter
	override fun transformCall(param: Parameter, original: String): String = "1" // Replace with 1
}

private val SingleValueTransform = object : FunctionTransform<Parameter> {
	override fun transformDeclaration(param: Parameter, original: String): String? = "${PointerMapping.primitiveMap[param.nativeType.mapping]!!} ${param.get(SingleValue.CLASS).newName}" // Replace with primitive type + new name
	override fun transformCall(param: Parameter, original: String): String = "$API_BUFFER.address() + ${param.name}" // Replace with APIBuffer address + offset
}