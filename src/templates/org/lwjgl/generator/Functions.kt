/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

import java.io.PrintWriter
import java.util.ArrayList
import java.util.HashMap
import java.util.LinkedHashMap
import java.util.regex.Pattern
import org.lwjgl.generator.opengl.*

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
val POINTER_POSTFIX = "Address"
val BUFFERS_POSTFIX = "Buffers"
val LENGTHS_POSTFIX = "Lengths"
val MAP_LENGTH = "length"
val FUNCTION_ADDRESS = "__functionAddress"

private val API_BUFFER = "__buffer"
private val JNIENV = "__env"

private val GLCore_PATTERN = Pattern.compile("GL[1-9][0-9]")

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

	protected val hasNativeParams: Boolean = getNativeParams().hasNext()

	fun getParams(predicate: (Parameter) -> Boolean): Iterator<Parameter> = parameters.values().iterator().filter(predicate)
	fun getParam(predicate: (Parameter) -> Boolean): Parameter {
		val params = getParams(predicate)
		if ( !params.hasNext() )
			throw IllegalStateException("Could not find any parameter that satisfies the given predicate.")
		val param = params.next()
		if ( params.hasNext() )
			throw IllegalStateException("More than one parameter found.")
		return param
	}
	fun hasParam(predicate: (Parameter) -> Boolean): Boolean = getParams(predicate).hasNext()

	fun getNativeParams(): Iterator<Parameter> = getParams { !it.has(virtual) }

	/** Returns a parameter that has the specified ReferenceModifier with the specified reference. Returns null if no such parameter exists. */
	fun getReferenceParam(modifier: Class<out ReferenceModifier>, reference: String): Parameter? {
		// Assumes at most 1 parameter will be found that references the specified parameter
		val iter = getParams {
			it.hasRef(modifier, reference)
		}
		return if ( iter.hasNext() )
			iter.next()
		else
			null
	}

}

// DSL extensions

public fun NativeType.IN(name: String, javadoc: String, links: String = ""): Parameter = Parameter(this, name, ParameterType.IN, javadoc, links)
public fun PointerType.OUT(name: String, javadoc: String, links: String = ""): Parameter = Parameter(this, name, ParameterType.OUT, javadoc, links)
public fun PointerType.INOUT(name: String, javadoc: String, links: String = ""): Parameter = Parameter(this, name, ParameterType.INOUT, javadoc, links)

private fun <T> PrintWriter.printList(items: Map<*, T>, itemPrint: (item: T) -> String?): Unit = printList(items.values().iterator(), itemPrint)
private fun <T> PrintWriter.printList(items: Iterator<T>, itemPrint: (item: T) -> String?) {
	var first = true
	while ( items.hasNext() ) {
		val item = itemPrint(items.next())
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

fun <T: Any> Collection<T>.last(): T {
	var last: T? = null
	for ( t in this )
		last = t

	return last!!
}

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

	// Can't eval once, stripPostfix has modifier dependencies that may be added after the constructor has run.
	val strippedName: String
		get() = stripPostfix()

	private fun stripPostfix(stripType: Boolean = false, stripUnsigned: Boolean = false): String {
		if ( !hasNativeParams || has(keepPostfix) )
			return name

		val param = parameters.values().last()
		if ( !param.isBufferPointer )
			return name

		var name = this.name
		if ( !nativeClass.postfix.isEmpty() && name.endsWith(nativeClass.postfix) )
			name = name.substring(0, name.size - nativeClass.postfix.size)

		var cutCount = if ( name.endsWith("v") ) {
			if ( name.endsWith("_v") ) 2 else 1
		} else
			0

		if ( stripType ) {
			val pointerMapping = param.nativeType.mapping as PointerMapping
			val typeChar = when ( pointerMapping ) {
				PointerMapping.DATA_SHORT -> "s"
				PointerMapping.DATA_INT -> "i"
				PointerMapping.DATA_LONG -> "i64"
				PointerMapping.DATA_FLOAT -> "f"
				PointerMapping.DATA_DOUBLE -> "d"
				else -> ""
			}

			if ( typeChar != "" ) {
				val offset = name.size - cutCount
				if ( typeChar equals name.substring(offset - typeChar.size, offset) )
					cutCount += typeChar.size

				if ( stripUnsigned && name.charAt(name.size - cutCount - 1) == 'u' )
					cutCount++
			}
		}

		return name.substring(0, name.size - cutCount) + nativeClass.postfix
	}

	public val javaDocLink: String
		get() = if ( strippedName != name ) this.javaDocLinkWithParams else "{@link #$strippedName}"

	public val javaDocLinkWithParams: String
		get() {
			val builder = StringBuilder()

			builder append "{@link #"
			builder append strippedName
			builder append '('

			var first = true
			getParams { !(it has autoSizeResult) } forEach {
				if ( first )
					first = false
				else
					builder append ", "

				builder append if ( it.isBufferPointer )
					"ByteBuffer"
				else
					it.javaMethodType
			}
			if ( returnsStructValue ) {
				if ( !first ) builder append ", "
				builder append "ByteBuffer"
			}
			builder append ")}"

			return builder.toString()
		}

	val isSimpleFunction: Boolean
		get() = nativeClass.functionProvider == null && !(isSpecial || returns.isSpecial || hasParam { it.isSpecial })

	val ReturnValue.isStructValue: Boolean
		get() = nativeType is StructType && !(nativeType as StructType).includesPointer

	val returnsStructValue: Boolean
		get() = returns.isStructValue && !hasParam { it has autoSizeResult }

	val returnsJavaMethodType: String
		get() = if ( returnsStructValue ) "void" else returns.javaMethodType

	val returnsNativeMethodType: String
		get() = if ( returnsStructValue ) "void" else returns.nativeMethodType

	val returnsJniFunctionType: String
		get() = if ( returnsStructValue ) "void" else returns.jniFunctionType

	private fun Parameter.error(msg: String) {
		throw IllegalArgumentException("$msg [${nativeClass.className}.${this@NativeClassFunction.name}, parameter: ${this.name}]")
	}

	/** Validates parameters with modifiers that reference other parameters. */
	private fun validate() {
		var returnCount = 0
		parameters.values().forEach {
			if ( it has AutoSize ) {
				val bufferParamName = it[AutoSize].reference
				val bufferParam = parameters[bufferParamName]
				when {
					bufferParam == null -> it.error("Buffer reference does not exist: AutoSize($bufferParamName)")
					!(bufferParam!!.nativeType is PointerType) -> it.error("Buffer reference must be a pointer type: AutoSize($bufferParamName)")
					!bufferParam!!.isBufferPointer -> it.error("Buffer reference must not be a naked pointer: AutoSize($bufferParamName)")
					else -> {
					}
				}
			}

			if ( it has autoSizeResult ) {
				if ( returns.nativeType !is PointerType || (returns.nativeType as PointerType).mapping == PointerMapping.NAKED_POINTER )
					it.error("Return type is not an array: autoSizeResult(${it.name})")
			}

			if ( it has AutoType ) {
				val bufferParamName = it[AutoType].reference
				val bufferParam = parameters[bufferParamName]
				when {
					bufferParam == null -> it.error("Buffer reference does not exist: AutoType($bufferParamName)")
					!(bufferParam!!.nativeType is PointerType) -> it.error("Buffer reference must be a pointer type: AutoType($bufferParamName)")
					bufferParam!!.nativeType.mapping != PointerMapping.DATA -> it.error("Pointer reference must have a DATA mapping: AutoType($bufferParamName)")
					else -> {
					}
				}
			}

			if ( it has Return ) {
				if ( !returns.isVoid )
					it.error("A return value can only be specified for functions with void return type.")

				returnCount++
				if ( 1 < returnCount )
					it.error("More than one return value found.")

				val returnMod = it[Return]
				if ( returnMod != returnValue ) {
					val maxLengthParam = parameters[returnMod.maxLengthParam]
					val lengthParam = parameters[returnMod.lengthParam]
					when {
						maxLengthParam == null -> it.error("The maxLength parameter does not exist: Return(${returnMod.maxLengthParam})")
						!maxLengthParam!!.nativeType.mapping.isSizeType -> it.error("The maxLength parameter must be an integer type: Return(${returnMod.maxLengthParam})")
						lengthParam == null -> it.error("The length parameter does not exist: Return(${returnMod.lengthParam})")
						!lengthParam!!.nativeType.mapping.isSizePointer -> it.error("The length parameter must be an integer pointer type: Return(${returnMod.lengthParam})")
						else -> {
						}
					}
				}
			}

			if ( it has PointerArray ) {
				val countParamName = it[PointerArray].countParam
				val countParam = parameters[countParamName]
				val lengthsParamName = it[PointerArray].lengthsParam
				val lengthsParam = parameters[lengthsParamName]
				when {
					countParam == null -> it.error("Count reference does not exist: PointerArray($countParamName)")
					!countParam!!.nativeType.mapping.isSizeType -> it.error("Count reference must be an integer type: PointerArray($countParamName)")
					lengthsParam != null && !lengthsParam.nativeType.mapping.isSizePointer -> it.error("Lengths reference must be an integer pointer type: PointerArray($lengthsParamName)")
					else -> {
					}
				}
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

			if ( mapping.byteShift == null || mapping.byteShift == "0" )
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
			var prefix = if ( it has Nullable && it.nativeType.mapping != PointerMapping.NAKED_POINTER ) "if ( ${it.name} != null ) " else ""

			if ( it.nativeType.mapping == PointerMapping.NAKED_POINTER && !it.has(nullable) && it.nativeType !is ObjectType && !it.has(Callback) )
				checks add "checkPointer(${it.name});"

			if ( mode == GenerationMode.NORMAL && it.paramType == ParameterType.IN && it.nativeType is CharSequenceType ) {
				val charSeqType = it.nativeType as CharSequenceType
				if ( charSeqType.nullTerminated )
					checks add "${prefix}checkNT${charSeqType.charMapping.bytes}(${it.name});"
			}

			if ( it.paramType == ParameterType.IN && it has nullTerminated ) {
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

			if ( it has Check ) {
				val transform = transforms?.get(it)
				if ( transform !is SkipCheckFunctionTransform ) {
					val check = it[Check]

					if ( check.debug ) prefix = "if ( LWJGLUtil.DEBUG )\n\t\t\t\t$prefix"

					if ( check.bytes )
						checks add "${prefix}checkBuffer(${it.name}, ${bufferShift(check.expression, it.name, ">>", transform)});"
					else if ( mode == GenerationMode.NORMAL )
						checks add "${prefix}checkBuffer(${it.name}, ${bufferShift(check.expression, it.name, "<<", transform)});"
					else
						checks add "${prefix}checkBuffer(${it.name}, ${check.expression});"
				}
			} else if ( it.nativeType is StructType ) {
				val structType = it.nativeType as StructType
				checks add "${prefix}checkBuffer(${it.name}, ${structType.definition.className}.SIZEOF);"
			}

			if ( mode == GenerationMode.NORMAL && it has BufferObject ) {
				checks add "GLChecks.ensureBufferObject(${it[BufferObject].binding}, ${it.nativeType.mapping == PrimitiveMapping.PTR});"
			}

			if ( it has AutoSize ) {
				val autoSize = it[AutoSize]
				if ( mode == GenerationMode.NORMAL ) {
					var length = it.name
					if ( autoSize.expression != null )
						length += autoSize.expression

					prefix = if ( parameters[autoSize.reference]!! has Nullable ) "if ( ${autoSize.reference} != null ) " else ""
					checks add "${prefix}checkBuffer(${autoSize.reference}, ${bufferShift(length, autoSize.reference, "<<", null)});"
					for ( d in autoSize.dependent ) {
						prefix = if ( parameters[d]!! has Nullable ) "if ( $d != null ) " else ""
						checks add "${prefix}checkBuffer($d, ${bufferShift(length, d, "<<", null)});"
					}
				} else {
					val referenceTransform = transforms!![parameters[autoSize.reference]!!]
					val expression =
						if ( referenceTransform != null && (referenceTransform.javaClass == javaClass<SingleValueTransform>() || referenceTransform == PointerArrayTransformSingle) )
							"1"
						else if ( referenceTransform != null && referenceTransform == PointerArrayTransformMulti )
							"${autoSize.reference}.length"
						else
							"${autoSize.reference}.remaining()"

					for ( d in autoSize.dependent ) {
						val param = parameters[d]!!
						val transform = transforms.get(param)
						if ( transform !is SkipCheckFunctionTransform ) {
							prefix = if ( param has Nullable ) "if ( $d != null ) " else ""
							checks add "${prefix}checkBuffer($d, $expression);"
						}
					}
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

		if ( !has(Reuse) )
			writer.generateNativeMethod(simpleFunction)

		if ( !simpleFunction ) {
			// This the only special case where we don't generate a "normal" Java method. If we did,
			// we'd need to add a postfix to either this or the alternative method, since we're
			// changing the return type. It looks ugly and LWJGL didn't do it pre-3.0 either.
			if ( returns.nativeType !is CharSequenceType )
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

		print("\tpublic static native ${returnsNativeMethodType} ")
		if ( !nativeOnly ) print('n')
		print(name)
		print("(")
		printList(getNativeParams()) {
			it.asNativeMethodParam
		}

		var hasNativeParams = this@NativeClassFunction.hasNativeParams
		if ( returnsStructValue ) {
			if ( hasNativeParams ) print(", ") else hasNativeParams = true
			print("long $RESULT")
		}
		if ( nativeClass.functionProvider != null ) {
			if ( hasNativeParams ) print(", ")
			print("long $FUNCTION_ADDRESS")
		}
		println(");\n")
	}

	private fun PrintWriter.generateJavaMethod() {
		// Step 0: JavaDoc

		if ( GLCore_PATTERN.matcher(nativeClass.className).matches() ) {
			val xmlName = if ( this@NativeClassFunction has ReferenceGL )
				this@NativeClassFunction[ReferenceGL].function
			else
				stripPostfix(stripType = true, stripUnsigned = true)
			printOpenGLJavaDoc(documentation, xmlName, this@NativeClassFunction has deprecatedGL)
		} else
			println(documentation)

		// Step 1: Method signature

		print("\tpublic static ${returnsJavaMethodType} $strippedName(")
		printList(parameters) {
			if ( it has autoSizeResult && returns.nativeType !is StructType )
				null
			else if ( it.isBufferPointer )
				"ByteBuffer ${it.name}" // Convert multi-byte-per-element buffers to ByteBuffer
			else
				it.asJavaMethodParam
		}

		if ( returnsStructValue ) {
			if ( !parameters.isEmpty() ) print(", ")
			print("ByteBuffer $RESULT")
		}

		println(") {")

		val code = getCode(Code.ApplyTo.NORMAL)

		// Step 2: Get function address

		if ( nativeClass.functionProvider != null )
			nativeClass.functionProvider.generateFunctionAddress(this, this@NativeClassFunction)

		// Step 3.a: Generate checks
		printCode(code?.javaInit)
		generateChecks(GenerationMode.NORMAL);

		// Step 3.b: Prepare APIBuffer parameters.

		var apiBufferSet = hasParam { it has autoSizeResult && returns.nativeType !is StructType }
		if ( apiBufferSet ) {
			println("\t\tAPIBuffer $API_BUFFER = apiBuffer();")

			val autoSizeParam = getParam { it has autoSizeResult }
			val autoSizeType = if ( autoSizeParam.nativeType.mapping == PointerMapping.DATA_INT ) "int" else "long"
			println("\t\tint ${autoSizeParam.name} = $API_BUFFER.${autoSizeType}Param();")
		}

		// Step 4: Call the native method
		generateCodeBeforeNative(code)

		generateNativeMethodCall(code?.javaAfterNative != null) {
			printList(getNativeParams()) {
				it.asNativeMethodCallParam(this@NativeClassFunction, GenerationMode.NORMAL)
			}

			if ( returnsStructValue ) {
				if ( hasNativeParams ) print(", ")
				print("memAddress($RESULT)")
			}
		}

		generateCodeAfterNative(code)

		if ( !(returns.isVoid || returnsStructValue) ) { // TODO: optimize condition?
			if ( returns.isBufferPointer ) {
				val isNullTerminated = returns.nativeType is CharSequenceType && returns.nativeType.nullTerminated
				val bufferType = if ( isNullTerminated || returns.nativeType.mapping == PointerMapping.DATA )
					"ByteBuffer"
				else
					returns.nativeType.mapping.javaMethodType.getSimpleName()

				print("\t\treturn mem${bufferType}")
				if ( isNullTerminated )
					print("NT${(returns.nativeType as CharSequenceType).charMapping.bytes}")
				print("($RESULT")
				if ( returns has MapPointer )
					print(", ${returns[MapPointer].sizeExpression}")
				else if ( !isNullTerminated ) {
					if ( returns.nativeType is StructType ) {
						print(
							if ( hasParam { it has autoSizeResult } ) {
								val param = getParam { it has autoSizeResult }
								", ${param.name}.getInt(${param.name}.position()) * ${(returns.nativeType as StructType).definition.className}.SIZEOF"
							} else
								", ${(returns.nativeType as StructType).definition.className}.SIZEOF"
						)
					} else if ( hasParam { it has autoSizeResult } ) {
						val param = getParam { it has autoSizeResult }
						print(
							if ( param.nativeType.mapping == PointerMapping.DATA_INT )
								", $API_BUFFER.intValue(${param.name})"
							else
								", (int)$API_BUFFER.longValue(${param.name})"
						)
					} else
						throw IllegalStateException("No autosizeResult parameter could be found.")
				}
				println(");")
			} else if ( code?.javaAfterNative != null )
				println("\t\treturn $RESULT;")
		}

		println("\t}\n")
	}

	private fun getCode(applyTo: Code.ApplyTo): Code? {
		if ( !has(Code) )
			return null

		val code = this[Code]
		return when ( code.applyTo ) {
			Code.ApplyTo.BOTH, applyTo -> code
			else -> null
		}
	}

	private fun PrintWriter.printCode(fragment: String?) {
		if ( fragment != null )
			println(fragment)
	}

	private fun PrintWriter.generateCodeBeforeNative(code: Code?) {
		printCode(code?.javaBeforeNative)

		if ( code?.javaFinally != null ) {
			println("\t\ttry {")
			print('\t')
		}
	}

	private fun PrintWriter.generateCodeAfterNative(code: Code?) {
		if ( code?.javaFinally != null )
			print('\t')
		printCode(code?.javaAfterNative)

		if ( code?.javaFinally != null ) {
			println("\t} finally {")
			printCode(code?.javaFinally)
			println("\t\t}")
		}
	}

	private fun PrintWriter.generateNativeMethodCall(returnLater: Boolean = false, printParams: PrintWriter.() -> Unit) {
		print("\t\t")
		if ( !(returns.isVoid || returnsStructValue) ) {
			if ( returns.isBufferPointer || returnLater ) {
				print(
					if ( returns.nativeType is ObjectType )
						"${returns.nativeType.className} $RESULT = ${returns.nativeType.className}.create("
					else
						"${returnsNativeMethodType} $RESULT = "
				)
			} else {
				print("return ")
				if ( returns.nativeType is ObjectType )
					print("${returns.nativeType.className}.create(")
			}
		}

		if ( has(Reuse) ) print("${get(Reuse).reference}.")
		print("n$name(")
		printParams()
		if ( nativeClass.functionProvider != null ) {
			if ( hasNativeParams ) print(", ")
			print("$FUNCTION_ADDRESS")
		}
		print(")")

		if ( returns.nativeType is ObjectType ) {
			if ( returns has Construct ) {
				val construct = returns[Construct]
				print(", ${construct.firstArg}")
				for ( arg in construct.otherArgs )
					print(", $arg")
			}
			print(")")
		}
		println(";")
	}

	/** Alternative methods are generated by applying one or more transformations. */
	private fun PrintWriter.generateAlternativeMethods() {
		val transforms = HashMap<QualifiedType, FunctionTransform<out QualifiedType>>()
		val customChecks = ArrayList<String>()

		if ( returns.nativeType is CharSequenceType )
			transforms[returns] = StringReturnTransform
		else if ( returns has MapPointer ) {
			val mapPointer = returns[MapPointer]

			transforms[returns] = if ( parameters.containsKey(mapPointer.sizeExpression) )
				MapPointerExplicitTransform(lengthParam = mapPointer.sizeExpression, addParam = false)
			else
				MapPointerTransform
		}

		getParams { it has BufferObject && it.nativeType.mapping != PrimitiveMapping.PTR } forEach {
			transforms[it] = BufferOffsetTransform
			customChecks add ("GLChecks.ensureBufferObject(${it[BufferObject].binding}, true);")
			generateAlternativeMethod(strippedName, "Buffer object offset version of:", transforms, customChecks)
			transforms.remove(it)
		}

		// Step 1: Apply basic transformations
		parameters.values() forEach {
			if ( it.paramType == ParameterType.IN ) {
				if ( it has AutoSize ) {
					val autoSize = it[AutoSize]
					val param = parameters[autoSize.reference]!!
					// Check if there's also an AutoType or MultiType on the referenced parameter. Skip if so.
					if ( !(param has AutoSize || param has MultiType) )
						transforms[it] = AutoSizeTransform(param)
				} else if ( it has optional )
					transforms[it] = ExpressionTransform("0L")
				else if ( it has Callback )
					transforms[it] = CallbackTransform

				if ( it has Expression ) {
					// We do this here in case another transform applies too.
					// We overwrite the value with the expression but use the type of the other transform.
					val expression = it[Expression]
					transforms[it] = ExpressionTransform(expression.value, expression.keepParam, transforms[it] as FunctionTransform<Parameter>?)
				}
			}
		}

		// Step 2: Check if we have any basic transformation to apply or if we have a multi-byte-per-element buffer parameter
		if ( !transforms.isEmpty() || parameters.values().any { it.isBufferPointer && (it.nativeType.mapping as PointerMapping).isMultiByte && !(it.has(autoSizeResult) && returns.nativeType !is StructType) } )
			generateAlternativeMethod(stripPostfix(true), "Alternative version of:", transforms, customChecks)

		// Step 3: Generate more complex alternatives if necessary
		if ( returns has MapPointer ) {
			// The size expression may be an existing parameter, in which case we don't need an explicit size alternative.
			if ( !parameters.containsKey(returns[MapPointer].sizeExpression) ) {
				transforms[returns] = MapPointerExplicitTransform("length")
				generateAlternativeMethod(stripPostfix(true), "Explicit size alternative version of:", transforms, customChecks)
			}
		}

		// Apply any CharSequenceTransforms. These can be combined with any of the other transformations.
		if ( parameters.values() count {
			if ( it.nativeType !is CharSequenceType || it.has(Return) )
				false
			else {
				val param = it
				getParams { it has AutoSize && it.get(AutoSize).hasReference(param.name) }.forEach {
					transforms[it] = AutoSizeCharSequenceTransform(param)
				}

				transforms[it] = CharSequenceTransform
				true
			}
		} != 0 )
			generateAlternativeMethod(strippedName, "CharSequence version of:", transforms, customChecks)

		fun applyReturnValueTransforms(param: Parameter) {
			// Transform void to the proper type
			transforms[returns] = BufferValueReturnTransform(PointerMapping.primitiveMap[param.nativeType.mapping]!!, param.name)

			// Transform the AutoSize parameter, if there is one
			getParams { it has AutoSize && it.get(AutoSize).hasReference(param.name) }.forEach {
				transforms[it] = BufferValueSizeTransform
			}

			// Transform the returnValue parameter
			transforms[param] = BufferValueParameterTransform
		}

		// Apply any complex transformations.
		parameters.values() forEach {
			val param = it

			if ( it has Return && !hasParam { it has PointerArray } ) {
				val returnMod = it[Return]

				if ( returnMod == returnValue ) {
					// Generate Return alternative

					if ( !hasParam { it has SingleValue || it has PointerArray } ) { // Skip, we inject the Return alternative in these transforms
						applyReturnValueTransforms(it)
						generateAlternativeMethod(strippedName, "Single return value version of:", transforms, customChecks)
					}
				} else {
					// Generate String return alternative

					// Remove any transform from the maxLength parameter (e.g. AutoSize)
					transforms.remove(parameters[returnMod.maxLengthParam])

					// Hide length parameter and use APIBuffer
					transforms[parameters[returnMod.lengthParam]!!] = BufferReturnLengthTransform

					// Hide target parameter and use APIBuffer
					transforms[it] = BufferReturnParamTransform

					// Transform void to the buffer type
					val returnType: String
					if ( it.nativeType is CharSequenceType ) {
						transforms[returns] = BufferReturnTransform(param.name, returnMod.lengthParam, (it.nativeType as CharSequenceType).charMapping.charset)
						returnType = "String"
					} else {
						transforms[returns] = BufferReturnTransform(param.name, returnMod.lengthParam)
						returnType = "Buffer"
					}

					generateAlternativeMethod(strippedName, "$returnType return version of:", transforms, customChecks)

					if ( returnMod.maxLengthExpression != null ) {
						// Transform maxLength parameter and generate an additional alternative
						transforms[parameters[returnMod.maxLengthParam]!!] = ExpressionLocalTransform(returnMod.maxLengthExpression)
						generateAlternativeMethod(strippedName, "$returnType return (w/ implicit max length) version of:", transforms, customChecks)
					}
				}
			} else if ( it has MultiType ) {
				// Generate MultiType alternatives
				customChecks.clear()

				// Add the AutoSize transformation if we skipped it above
				getParams { it has AutoSize } forEach {
					transforms[it] = AutoSizeTransform(parameters[it[AutoSize].reference]!!)
				}

				val multiTypes = it[MultiType]
				if ( it has BufferObject )
					customChecks add ("GLChecks.ensureBufferObject(${it[BufferObject].binding}, false);")

				for ( autoType in multiTypes.types ) {
					// Transform the AutoSize parameter, if there is one and it's expressed in bytes
					getParams {
						if ( it has AutoSize ) {
							val autoSize = it.get(AutoSize)
							autoSize.hasReference(param.name) && autoSize.toBytes
						} else
							false
					}.forEach {
						transforms[it] = AutoSizeTransform(param, autoType.byteShift!!)
					}

					transforms[it] = AutoTypeTargetTransform(autoType)
					generateAlternativeMethod(strippedName, "${autoType.javaMethodType.getSimpleName()} version of:", transforms, customChecks)
				}
			} else if ( it has AutoType ) {
				// Generate AutoType alternatives
				customChecks.clear()

				// Add the AutoSize transformation if we skipped it above
				getParams { it has AutoSize } forEach {
					transforms[it] = AutoSizeTransform(parameters[it[AutoSize].reference]!!)
				}

				val autoTypes = it[AutoType]
				val bufferParam = parameters[autoTypes.reference]!!
				if ( bufferParam has BufferObject )
					customChecks add ("GLChecks.ensureBufferObject(${bufferParam[BufferObject].binding}, false);")

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
					generateAlternativeMethod(strippedName, "${unsignedType.name()} / ${autoType.name()} version of:", transforms, customChecks)

					types.remove(autoType)
					types.remove(unsignedType)
				}

				for ( autoType in types ) {
					transforms[it] = AutoTypeParamTransform("GL11.${autoType.name()}")
					transforms[bufferParam] = AutoTypeTargetTransform(autoType.mapping)
					generateAlternativeMethod(strippedName, "${autoType.name()} version of:", transforms, customChecks)
				}
			} else if ( it has PointerArray ) {
				val pointerArray = it[PointerArray]

				val lengthsParam = parameters[pointerArray.lengthsParam]

				val countParam = parameters[pointerArray.countParam]!!

				transforms[countParam] = ExpressionTransform("${it.name}.length")
				if ( lengthsParam != null )
					transforms[lengthsParam!!] = PointerArrayLengthsTransformMulti(it) // TODO: !! -> Kotlin bug
				transforms[it] = PointerArrayTransformMulti
				generateAlternativeMethod(strippedName, "Array version of:", transforms, customChecks)

				// Combine PointerArrayTransformSingle with BufferValueReturnTransform
				getParams { it has returnValue } forEach { applyReturnValueTransforms(it) }

				transforms[countParam] = ExpressionTransform("1")
				if ( lengthsParam != null )
					transforms[lengthsParam!!] = PointerArrayLengthsTransformSingle(it) // TODO: !! -> Kotlin bug
				transforms[it] = PointerArrayTransformSingle
				generateAlternativeMethod(strippedName, "Single ${pointerArray.singleName} version of:", transforms, customChecks)
			}
		}

		// Apply any SingleValue transformations.
		if ( parameters.values() count {
			if ( !(it has SingleValue) ) {
				false
			} else {
				val param = it

				// Compine SingleValueTransform with BufferValueReturnTransform
				getParams { it has returnValue } forEach { applyReturnValueTransforms(it) }

				// Transform the AutoSize parameter, if there is one
				getParams { it has AutoSize && it.get(AutoSize).hasReference(param.name) }.forEach {
					transforms[it] = BufferValueSizeTransform
				}

				val singleValue = param[SingleValue]
				val pointerType = param.nativeType as PointerType
				val primitiveType = PointerMapping.primitiveMap[pointerType.mapping]!!
				transforms[it] = SingleValueTransform(
					when ( pointerType.elementType ) {
						null -> primitiveType
						is CharSequenceType -> "CharSequence"
						is ObjectType -> pointerType.elementType.className
						is PointerType -> "long"
						else -> pointerType.elementType.javaMethodType.toString()
					},
					primitiveType,
					param.name,
					singleValue.newName
				)

				true
			}
		} != 0 )
			generateAlternativeMethod(strippedName, "Single value version of:", transforms, customChecks)
	}

	private fun PrintWriter.generateAlternativeMethod(
		name: String,
		description: String,
		transforms: Map<QualifiedType, FunctionTransform<out QualifiedType>>,
		customChecks: List<String>
	) {
		val returnTransform = transforms[returns]

		// Step 0: JavaDoc

		if ( returnTransform == StringReturnTransform ) // Special-case, we skipped the normal method
			println(documentation)
		else
			generateJavaDocLink(description, this@NativeClassFunction)

		// Step 1: Method signature

		val retType = returns.transformDeclarationOrElse(transforms, returnsJavaMethodType)

		print("\tpublic static $retType $name(")
		printList(parameters) {
			if ( it has autoSizeResult && returns.nativeType !is StructType )
				null
			else
				it.transformDeclarationOrElse(transforms, it.asJavaMethodParam)
		}
		if ( returnTransform == MapPointerTransform ) {
			if ( !parameters.isEmpty() )
				print(", ")
			print("ByteBuffer old_buffer")
		} else if ( returnTransform != null && returnTransform.javaClass == javaClass<MapPointerExplicitTransform>() ) {
			if ( !parameters.isEmpty() )
				print(", ")
			val mapPointerExplicit = returnTransform as MapPointerExplicitTransform
			if ( mapPointerExplicit.addParam )
				print("int ${mapPointerExplicit.lengthParam}, ")
			print("ByteBuffer old_buffer")
		}
		println(") {")

		val code = getCode(Code.ApplyTo.ALTERNATIVE)

		// Step 2: Get function address

		if ( nativeClass.functionProvider != null )
			nativeClass.functionProvider.generateFunctionAddress(this, this@NativeClassFunction)

		// Step 3.A: Generate checks
		printCode(code?.javaInit)
		generateChecks(GenerationMode.ALTERNATIVE, customChecks, transforms);

		// Step 3.B: Transform pre-processing.

		for ( (qualifiedType, transform) in transforms ) {
			if ( transform is PreFunctionTransform )
				transform.preprocess(qualifiedType, this)
		}

		// Step 3.C: Prepare APIBuffer parameters.

		var apiBufferSet = hasParam { it has autoSizeResult && !hasParam { it has autoSizeResult } }
		if ( apiBufferSet ) {
			println("\t\tAPIBuffer $API_BUFFER = apiBuffer();")

			val autoSizeParam = getParam { it has autoSizeResult }
			val autoSizeType = if ( autoSizeParam.nativeType.mapping == PointerMapping.DATA_INT ) "int" else "long"
			println("\t\tint ${autoSizeParam.name} = $API_BUFFER.${autoSizeType}Param();")
		}
		for ( (qualifiedType, transform) in transforms ) {
			if ( transform is APIBufferFunctionTransform ) {
				if ( !apiBufferSet ) {
					println("\t\tAPIBuffer $API_BUFFER = apiBuffer();")
					apiBufferSet = true
				}
				transform.setupAPIBuffer(qualifiedType, this)
			}
		}

		// Step 4: Call the native method
		generateCodeBeforeNative(code)

		generateNativeMethodCall(code?.javaAfterNative != null) {
			printList(getNativeParams()) {
				it.transformCallOrElse(transforms, it.asNativeMethodCallParam(this@NativeClassFunction, GenerationMode.ALTERNATIVE))
			}
		}

		generateCodeAfterNative(code)

		if ( returns.isVoid || returnsStructValue ) {
			val result = returns.transformCallOrElse(transforms, "")
			if ( !result.isEmpty() )
				println(result)
		} else {
			if ( returns.isBufferPointer ) {
				print("\t\t")

				val isNullTerminated = returns.nativeType is CharSequenceType && returns.nativeType.nullTerminated
				val bufferType = if ( isNullTerminated || returns.nativeType.mapping == PointerMapping.DATA )
					"ByteBuffer"
				else
					returns.nativeType.mapping.javaMethodType.getSimpleName()

				val builder = StringBuilder()
				builder append "mem${bufferType}"
				if ( isNullTerminated )
					builder append "NT${(returns.nativeType as CharSequenceType).charMapping.bytes}"
                builder append "($RESULT"
                if ( returns has MapPointer )
                    builder append ", ${returns[MapPointer].sizeExpression}"
                else if ( !isNullTerminated ) {
                    val param = getParam { it has autoSizeResult }
	                if ( returns.isStructValue ) {
		                builder append ", ${param.name}.get(${param.name}.position()) * ${(returns.nativeType as StructType).definition.className}.SIZEOF"
	                } else {
		                builder append if ( param.nativeType.mapping == PointerMapping.DATA_INT )
							", $API_BUFFER.intValue(${param.name})"
						else
				            ", (int)$API_BUFFER.longValue(${param.name})"
	                }
                }
                builder append ")"

				val returnExpression = returns.transformCallOrElse(transforms, builder.toString())
				if ( returnExpression.indexOf('\n') == -1 )
					println("return $returnExpression;")
				else // Multiple statements, assumes the transformation includes the return statement.
					println(returnExpression)
			} else if ( code?.javaAfterNative != null )
				println("\t\treturn $RESULT;")
		}

		println("\t}\n")
	}

	// --[ JNI FUNCTIONS ]--

	fun generateFunctionDefinition(writer: PrintWriter): Unit = writer.generateFunctionDefinitionImpl()
	private fun PrintWriter.generateFunctionDefinitionImpl() {
		print("typedef ${returns.toNativeType} (APIENTRY *${name}PROC) (")
		printList(getNativeParams()) {
			it.toNativeType
		}
		println(");")
	}

	fun generateFunction(writer: PrintWriter): Unit = writer.generateFunctionImpl()
	private fun PrintWriter.generateFunctionImpl() {
		// Step 0: Function signature

		print("JNIEXPORT ${returnsJniFunctionType} JNICALL Java_${nativeClass.nativeFileNameJNI}_")
		if ( !isSimpleFunction )
			print('n')
		print(name.asJNIName)
		print("(")
		print("JNIEnv *$JNIENV, jclass clazz")
		getNativeParams() forEach {
			print(", ${it.asJNIFunctionParam}")
		}
		if ( nativeClass.functionProvider != null )
			print(", jlong $FUNCTION_ADDRESS")
		if ( returnsStructValue )
			print(", jlong $RESULT")
		println(") {")

		// Step 1: Cast addresses to pointers

		getNativeParams().filter { it.nativeType is PointerType }.forEach {
			val pointerType = it.toNativeType
			print("\t$pointerType")
			if ( !pointerType.endsWith('*') ) print(' ')
			println("${it.name} = ($pointerType)(intptr_t)${it.name}$POINTER_POSTFIX;")
		}

		// Step 2: Cast function address to pointer

		if ( nativeClass.functionProvider != null )
			println("\t${name}PROC $name = (${name}PROC)(intptr_t)$FUNCTION_ADDRESS;")

		// Step 3: Call native function

		print('\t')
		if ( returnsStructValue ) {
			print("*((${returns.nativeType.name}*)(intptr_t)$RESULT) = ")
		} else if ( !returns.isVoid ) {
			print("return (${returnsJniFunctionType})")
			if ( returns.nativeType is PointerType )
				print("(intptr_t)")
		}
		print("$name(")
		printList(getNativeParams()) {
			// Avoids warning when implicitly casting from jlong to 32-bit pointer.
			if ( it.nativeType.mapping == PrimitiveMapping.PTR )
				"(${it.nativeType.name})${it.name}"
			else if ( it.nativeType is StructType && !(it.nativeType as StructType).includesPointer )
				"*${it.name}"
			else
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

public class DependsOn(override val reference: String): FunctionModifier(), ReferenceModifier {
	class object: ModifierObject<DependsOn> {
		override val key = javaClass<DependsOn>()
	}

	override val isSpecial: Boolean = false
}

public class Reuse(override val reference: String): FunctionModifier(), ReferenceModifier {
	class object: ModifierObject<Reuse> {
		override val key = javaClass<Reuse>()
	}

	override val isSpecial: Boolean = true
}

public val keepPostfix: FunctionModifier = object : FunctionModifier() {
	override val isSpecial: Boolean = false
}

/** Defines an expression that should be passed to the getInstance() method. */
public class Capabilities(
	/** The expression to pass to the getInstance() method. */
	val expression: String,
	/** If defined, is a statement that will be printed before the getInstance() call. */
	val statement: String? = null,
	/** If true, getInstance() will not be called and the expression will be assigned to the FUNCTION_ADDRESS variables. */
    val override: Boolean = false
): FunctionModifier() {
	class object: ModifierObject<Capabilities> {
		override val key = javaClass<Capabilities>()
	}

	override val isSpecial: Boolean = true
}

public class Code(
	val javaInit: String? = null,

	val javaBeforeNative: String? = null,
	val javaAfterNative: String? = null,
	val javaFinally: String? = null,

	val nativeBeforeCall: String? = null,
	val nativeAfterCall: String? = null,

    val applyTo: Code.ApplyTo = Code.ApplyTo.BOTH
): FunctionModifier() {
	class object: ModifierObject<Code> {
		override val key = javaClass<Code>()

		enum class ApplyTo {
			NORMAL
			ALTERNATIVE
			BOTH
		}
	}

	override val isSpecial: Boolean = true
}
// --- [ ALTERNATIVE FUNCTION TRANSFORMS ] ---

private trait FunctionTransform<T: QualifiedType> {
	fun transformDeclaration(param: T, original: String): String?
	fun transformCall(param: T, original: String): String
}

/** A function transform that must perform some pre-processing. */
private trait PreFunctionTransform {
	fun preprocess(qualifiedType: QualifiedType, writer: PrintWriter)
}

/** A function transform that makes use of the APIBuffer. */
private trait APIBufferFunctionTransform {
	fun setupAPIBuffer(qualifiedType: QualifiedType, writer: PrintWriter)
}

/** Marker trait to indicate that buffer checks should be skipped. */
private trait SkipCheckFunctionTransform

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

private open class AutoSizeTransform(val bufferParam: Parameter): FunctionTransform<Parameter> {
	override fun transformDeclaration(param: Parameter, original: String): String? = null // Remove the parameter
	override fun transformCall(param: Parameter, original: String): String {
		// Replace with expression
		return if ( bufferParam has nullable )
			"${bufferParam.name} == null ? 0 : ${bufferParam.name}.remaining()"
		else
			"${bufferParam.name}.remaining()"
	}
}

private fun AutoSizeTransform(bufferParam: Parameter, byteShift: String) =
	if ( byteShift == "0" ) AutoSizeTransform(bufferParam) else AutoSizeBytesTransform(bufferParam, byteShift)

private class AutoSizeBytesTransform(bufferParam: Parameter, val byteShift: String): AutoSizeTransform(bufferParam) {
	override fun transformCall(param: Parameter, original: String): String {
		// Replace with expression
		return if ( bufferParam has nullable )
			"(${bufferParam.name} == null ? 0 : ${bufferParam.name}.remaining()) << $byteShift"
		else
			"${bufferParam.name}.remaining() << $byteShift"
	}
}

private open class AutoSizeCharSequenceTransform(val bufferParam: Parameter): FunctionTransform<Parameter> {
	override fun transformDeclaration(param: Parameter, original: String): String? = null // Remove the parameter
	override fun transformCall(param: Parameter, original: String): String {
		// Replace with expression
		return if ( bufferParam has nullable )
			"${bufferParam.name} == null ? 0 : ${bufferParam.name}.length()"
		else
			"${bufferParam.name}.length()"
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

private val BufferOffsetTransform: FunctionTransform<Parameter> = object : FunctionTransform<Parameter>, SkipCheckFunctionTransform {
	override fun transformDeclaration(param: Parameter, original: String): String? = "long ${param.name}Offset"
	override fun transformCall(param: Parameter, original: String): String = "${param.name}Offset"
}

private open class ExpressionTransform(
	val expression: String,
	val keepParam: Boolean = false,
	val paramTransform: FunctionTransform<Parameter>? = null
): FunctionTransform<Parameter>, SkipCheckFunctionTransform {
	override fun transformDeclaration(param: Parameter, original: String): String? =
		if ( keepParam ) paramTransform?.transformDeclaration(param, original) ?: original else null
	override fun transformCall(param: Parameter, original: String): String = expression
}

private class ExpressionLocalTransform(expression: String, keepParam: Boolean = false): ExpressionTransform(expression, keepParam), PreFunctionTransform, SkipCheckFunctionTransform {
	override fun transformCall(param: Parameter, original: String): String = original
	override fun preprocess(qualifiedType: QualifiedType, writer: PrintWriter): Unit = writer.println("\t\t${(qualifiedType as Parameter).asJavaMethodParam} = $expression;")
}

private val CharSequenceTransform = object : FunctionTransform<Parameter> {
	override fun transformDeclaration(param: Parameter, original: String): String? = "CharSequence ${param.name}"
	override fun transformCall(param: Parameter, original: String): String = "memAddress${if ( param has nullable ) "Safe" else ""}(memEncode${(param.nativeType as CharSequenceType).charMapping.charset}(${param.name}))"
}

private val StringReturnTransform = object : FunctionTransform<ReturnValue> {
	override fun transformDeclaration(param: ReturnValue, original: String): String? = "String"
	override fun transformCall(param: ReturnValue, original: String): String = "memDecode${(param.nativeType as CharSequenceType).charMapping.charset}($original)";
}

private class BufferValueReturnTransform(val bufferType: String, val paramName: String): FunctionTransform<ReturnValue>, APIBufferFunctionTransform {
	override fun transformDeclaration(param: ReturnValue, original: String): String? = if ( bufferType == "pointer" ) "long" else bufferType // Replace void with the buffer value type
	override fun transformCall(param: ReturnValue, original: String): String = "\t\treturn $API_BUFFER.${bufferType}Value($paramName);" // Replace with value from APIBuffer
	override fun setupAPIBuffer(qualifiedType: QualifiedType, writer: PrintWriter) : Unit = writer.println("\t\tint $paramName = $API_BUFFER.${bufferType}Param();")
}

private val BufferValueParameterTransform: FunctionTransform<Parameter> = object : FunctionTransform<Parameter>, SkipCheckFunctionTransform {
	override fun transformDeclaration(param: Parameter, original: String): String? = null // Remove the parameter
	override fun transformCall(param: Parameter, original: String): String = "$API_BUFFER.address() + ${param.name}" // Replace with APIBuffer address + offset
}

private val BufferValueSizeTransform = object : FunctionTransform<Parameter> {
	override fun transformDeclaration(param: Parameter, original: String): String? = null // Remove the parameter
	override fun transformCall(param: Parameter, original: String): String = "1" // Replace with 1
}

private class SingleValueTransform(
	val paramType: String,
	val elementType: String,
	val paramName: String,
	val newName: String
) : FunctionTransform<Parameter>, APIBufferFunctionTransform, SkipCheckFunctionTransform {
	override fun transformDeclaration(param: Parameter, original: String): String? = "$paramType $newName" // Replace with element type + new name
	override fun transformCall(param: Parameter, original: String): String = "$API_BUFFER.address() + $paramName" // Replace with APIBuffer address + offset
	override fun setupAPIBuffer(qualifiedType: QualifiedType, writer: PrintWriter) {
		writer.println("\t\tint $paramName = $API_BUFFER.${elementType}Param();")
		if ( "CharSequence" == paramType ) {
			writer.println("\t\tByteBuffer ${newName}Buffer = memEncodeASCII($newName);") // TODO: Support other than ASCCI
			writer.println("\t\t$API_BUFFER.${elementType}Value($paramName, memAddress(${newName}Buffer));")
		} else
			writer.println("\t\t$API_BUFFER.${elementType}Value($paramName, $newName);")
	}
}

private val MapPointerTransform = object : FunctionTransform<ReturnValue> {
	override fun transformDeclaration(param: ReturnValue, original: String): String? = "ByteBuffer" // Return a ByteBuffer
	override fun transformCall(param: ReturnValue, original: String): String = """int $MAP_LENGTH = ${param.get(MapPointer).sizeExpression};
		return old_buffer != null && __result == memAddress0(old_buffer) && old_buffer.capacity() == $MAP_LENGTH ? old_buffer : memByteBuffer(__result, $MAP_LENGTH);"""
}

private class MapPointerExplicitTransform(val lengthParam: String, val addParam: Boolean = true): FunctionTransform<ReturnValue> {
	override fun transformDeclaration(param: ReturnValue, original: String): String? = "ByteBuffer" // Return a ByteBuffer
	override fun transformCall(param: ReturnValue, original: String): String =
		"old_buffer != null && __result == memAddress0(old_buffer) && old_buffer.capacity() == $lengthParam ? old_buffer : memByteBuffer(__result, $lengthParam)"
}

private val BufferReturnLengthTransform: FunctionTransform<Parameter> = object : FunctionTransform<Parameter>, APIBufferFunctionTransform, SkipCheckFunctionTransform {
	override fun transformDeclaration(param: Parameter, original: String): String? = null // Remove the parameter
	override fun transformCall(param: Parameter, original: String): String = "$API_BUFFER.address() + ${param.name}" // Replace with APIBuffer address + offset
	override fun setupAPIBuffer(qualifiedType: QualifiedType, writer: PrintWriter): Unit = writer.println("\t\tint ${(qualifiedType as Parameter).name} = $API_BUFFER.intParam();")
}

private val BufferReturnParamTransform: FunctionTransform<Parameter> = object : FunctionTransform<Parameter>, APIBufferFunctionTransform, SkipCheckFunctionTransform {
	override fun transformDeclaration(param: Parameter, original: String): String? = null // Remove the parameter
	override fun transformCall(param: Parameter, original: String): String = "$API_BUFFER.address() + ${param.name}" // Replace with APIBuffer address + offset
	override fun setupAPIBuffer(qualifiedType: QualifiedType, writer: PrintWriter): Unit =
		writer.println("\t\tint ${(qualifiedType as Parameter).name} = $API_BUFFER.bufferParam(${qualifiedType[Return].maxLengthParam});")
}

private class BufferReturnTransform(
	val paramName: String,
    val lengthParam: String,
    val encoding: String? = null
): FunctionTransform<ReturnValue> {
	override fun transformDeclaration(param: ReturnValue, original: String): String? = if ( encoding == null) "ByteBuffer" else "String" // Replace void with String
	override fun transformCall(param: ReturnValue, original: String): String {
		val builder = StringBuilder(64)

		builder append "\t\treturn "
		if ( encoding != null ) builder append "memDecode$encoding("
		builder append "memByteBuffer($API_BUFFER.address() + $paramName, $API_BUFFER.intValue($lengthParam))"
		if ( encoding != null ) builder append ")"
		builder append ";"

		return builder.toString()
	}
}

private class PointerArrayTransform(val multi: Boolean): FunctionTransform<Parameter>, APIBufferFunctionTransform {
	override fun transformDeclaration(param: Parameter, original: String): String? {
		return if ( param[PointerArray].elementType is CharSequenceType ) {
			if ( multi ) "CharSequence[] ${param.name}" else "CharSequence ${param[PointerArray].singleName}" // Replace with CharSequence
		} else {
			if ( multi ) "ByteBuffer[] ${param.name}" else "ByteBuffer ${param[PointerArray].singleName}" // Replace with ByteBuffer
		}
	}
	override fun transformCall(param: Parameter, original: String): String = "$API_BUFFER.address() + ${param.name}$POINTER_POSTFIX" // Replace with APIBuffer address + offset
	override fun setupAPIBuffer(qualifiedType: QualifiedType, writer: PrintWriter): Unit = writer.setupAPIBufferImpl(qualifiedType as Parameter)

	private fun PrintWriter.setupAPIBufferImpl(param: Parameter) {
		val pointerArray = param[PointerArray]
		val elementType = pointerArray.elementType
		val nullTerminate = pointerArray.lengthsParam == null

		if ( multi ) {
			println("\t\tint ${param.name}$POINTER_POSTFIX = $API_BUFFER.bufferParam(${param.name}.length << POINTER_SHIFT);")

			// Create a local array that will hold the encoded CharSequences. We need this to avoid premature GC of the passed buffers.
			if ( elementType is CharSequenceType )
				println("\t\tByteBuffer[] ${param.name}$BUFFERS_POSTFIX = new ByteBuffer[${param.name}.length];")

			println("\t\tfor ( int i = 0; i < ${param.name}.length; i++ )")
			print("\t\t\t$API_BUFFER.pointerValue(${param.name}$POINTER_POSTFIX + (i << POINTER_SHIFT), memAddress(")
			if ( elementType is CharSequenceType )
				print("${param.name}$BUFFERS_POSTFIX[i] = memEncode${elementType.charMapping.charset}(") // Encode and store
			print("${param.name}[i]")
			if ( elementType is CharSequenceType )
				print(", $nullTerminate)")
			println("));")
		} else {
			println("\t\tint ${param.name}$POINTER_POSTFIX = $API_BUFFER.pointerParam();")

			// Store the encoded CharSequence buffer in a local var to avoid premature GC.
			if ( elementType is CharSequenceType )
				println("\t\tByteBuffer ${pointerArray.singleName}$BUFFERS_POSTFIX = memEncode${elementType.charMapping.charset}(${param[PointerArray].singleName}, $nullTerminate);") // Encode and store

			print("\t\t$API_BUFFER.pointerValue(${param.name}$POINTER_POSTFIX, memAddress(${pointerArray.singleName}")
			if ( elementType is CharSequenceType )
				print(BUFFERS_POSTFIX)
			println("));")
		}
	}
}
private val PointerArrayTransformSingle = PointerArrayTransform(false)
private val PointerArrayTransformMulti = PointerArrayTransform(true)

private class PointerArrayLengthsTransform(val arrayParam: Parameter, val multi: Boolean): FunctionTransform<Parameter>, APIBufferFunctionTransform, SkipCheckFunctionTransform {
	override fun transformDeclaration(param: Parameter, original: String): String? = null // Remove the parameter
	override fun transformCall(param: Parameter, original: String): String = "$API_BUFFER.address() + ${arrayParam.name}$LENGTHS_POSTFIX" // Replace with APIBuffer address + offset
	override fun setupAPIBuffer(qualifiedType: QualifiedType, writer: PrintWriter): Unit = writer.setupAPIBufferImpl(qualifiedType as Parameter)

	private fun PrintWriter.setupAPIBufferImpl(param: Parameter) {
		val pointerArray = arrayParam[PointerArray]
		val elementType = pointerArray.elementType

		val lengthType = PointerMapping.primitiveMap[param.nativeType.mapping]

		if ( multi ) {
			val byteShift = (param.nativeType.mapping as PointerMapping).byteShift
			println("\t\tint ${arrayParam.name}$LENGTHS_POSTFIX = $API_BUFFER.bufferParam(${arrayParam.name}.length << $byteShift);")

			println("\t\tfor ( int i = 0; i < ${arrayParam.name}.length; i++ )")
			print("\t\t\t$API_BUFFER.${lengthType}Value(${arrayParam.name}$LENGTHS_POSTFIX + (i << $byteShift), ${arrayParam.name}[i]")
			print(
				if ( elementType is CharSequenceType )
					".length()"
				else
					".remaining()"
			)
			println(");")
		} else {
			println("\t\tint ${arrayParam.name}$LENGTHS_POSTFIX = $API_BUFFER.${lengthType}Param();")

			print("\t\t$API_BUFFER.${lengthType}Value(${arrayParam.name}$LENGTHS_POSTFIX, ${pointerArray.singleName}")
			print(
				if ( elementType is CharSequenceType )
					".length()"
				else
					".remaining()"
			)
			println(");")
		}
	}
}
private fun PointerArrayLengthsTransformSingle(arrayParam: Parameter) = PointerArrayLengthsTransform(arrayParam, false)
private fun PointerArrayLengthsTransformMulti(arrayParam: Parameter) = PointerArrayLengthsTransform(arrayParam, true)

private val CallbackTransform = object : FunctionTransform<Parameter> {
	override fun transformDeclaration(param: Parameter, original: String): String? = "${param[Callback].procClass} ${param.name}" // Replace type with the callback class
	override fun transformCall(param: Parameter, original: String): String {
		// Replace with callback function address
		val procClass = param[Callback].procClass;

		if ( param has nullable )
			"${param.name} == null ? 0L : $procClass.CALLBACK"
		else
			"$procClass.CALLBACK"
	}
}