/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

import org.lwjgl.generator.GenerationMode.ALTERNATIVE
import org.lwjgl.generator.GenerationMode.NORMAL
import org.lwjgl.generator.ParameterType.IN
import org.lwjgl.generator.ParameterType.INOUT
import org.lwjgl.generator.ParameterType.OUT
import org.lwjgl.generator.opengl.*
import org.lwjgl.generator.opengl.BufferType.*
import java.io.PrintWriter
import java.util.ArrayList
import java.util.HashMap
import java.util.LinkedHashMap
import java.util.regex.Pattern

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

enum class GenerationMode {
	NORMAL
	ALTERNATIVE
}

abstract class Function(
	val returns: ReturnValue,
	val simpleName: String,
	val name: String = simpleName,
	val documentation: String,
	vararg val parameters: Parameter
): TemplateElement() {

	protected val paramMap: Map<String, Parameter> = {
		val map = HashMap<String, Parameter>()
		for ( param in parameters )
			map.put(param.name, param)
		map
	}();

	protected val hasNativeParams: Boolean = getNativeParams().any()

	fun getParam(paramName: String): Parameter {
		val param = paramMap[paramName]
		if ( param == null )
			throw IllegalArgumentException("Referenced parameter does not exist: ${simpleName}.$paramName")
		return param
	}

	fun getParams(predicate: (Parameter) -> Boolean) = parameters.sequence().filter(predicate)
	fun getParam(predicate: (Parameter) -> Boolean) = getParams(predicate).single()
	fun hasParam(predicate: (Parameter) -> Boolean) = getParams(predicate).any()

	fun getNativeParams() = getParams { !it.has(virtual) }

	/** Returns a parameter that has the specified ReferenceModifier with the specified reference. Returns null if no such parameter exists. */
	fun getReferenceParam(modifierObject: ModifierKey<*>, reference: String) = getParams {
		it.hasRef(modifierObject, reference)
	}.firstOrNull() // Assumes at most 1 parameter will be found that references the specified parameter

}

// DSL extensions

fun NativeType.IN(name: String, javadoc: String, links: String = "", linkMode: LinkMode = LinkMode.SINGLE) = Parameter(this, name, IN, javadoc, links, linkMode)
fun PointerType.OUT(name: String, javadoc: String, links: String = "", linkMode: LinkMode = LinkMode.SINGLE) = Parameter(this, name, OUT, javadoc, links, linkMode)
fun PointerType.INOUT(name: String, javadoc: String, links: String = "", linkMode: LinkMode = LinkMode.SINGLE) = Parameter(this, name, INOUT, javadoc, links, linkMode)

private fun <T> PrintWriter.printList(items: Sequence<T>, itemPrint: (item: T) -> String?) = print(items.map(itemPrint).filterNotNull().joinToString(", "))

// --- [ Native class functions ] ---

class NativeClassFunction(
	returns: ReturnValue,
	simpleName: String,
	name: String,
	documentation: String,
	val nativeClass: NativeClass,
	vararg parameters: Parameter
): Function(returns, simpleName, name, documentation, *parameters) {

	init {
		validate();
	}

	val addressName: String
		get() = if ( nativeClass.prefixMethod.isEmpty() )
			"${simpleName}Address"
		else
			simpleName

	val accessModifier: String
		get() = (if ( has(AccessModifier) ) this[AccessModifier].access else nativeClass.access).modifier

	private fun stripPostfix(functionName: String = name, stripType: Boolean): String {
		if ( !hasNativeParams )
			return functionName

		val param = parameters[parameters.lastIndex]
		if ( !param.isBufferPointer )
			return functionName

		var name = functionName
		var postfix = if ( has(DependsOn) && this[DependsOn].postfix != null ) this[DependsOn].postfix else nativeClass.postfix
		if ( name.endsWith(postfix) )
			name = name.substring(0, name.length() - postfix.length())
		else
			postfix = ""

		var cutCount = if ( name.endsWith("v") ) {
			if ( name.endsWith("_v") ) 2 else 1
		} else
			0

		if ( stripType ) {
			val pointerMapping = param.nativeType.mapping as PointerMapping
			val typeChar = when ( pointerMapping ) {
				PointerMapping.DATA_SHORT  -> "s"
				PointerMapping.DATA_INT    -> "i"
				PointerMapping.DATA_LONG   -> "i64"
				PointerMapping.DATA_FLOAT  -> "f"
				PointerMapping.DATA_DOUBLE -> "d"
				else                       -> ""
			}

			if ( typeChar != "" ) {
				val offset = name.length() - cutCount
				if ( typeChar equals name.substring(offset - typeChar.length(), offset) )
					cutCount += typeChar.length()

				if ( name.charAt(name.length() - cutCount - 1) == 'u' )
					cutCount++
			}
		}

		return name.substring(0, name.length() - cutCount) + postfix
	}

	val javaDocLink: String
		get() = "${nativeClass.className}$methodLink"

	private val methodLink: String get() = "#$simpleName()"

	private val isSimpleFunction: Boolean
		get() = nativeClass.functionProvider == null && !(isSpecial || returns.isSpecial || hasParam { it.isSpecial })

	private val hasUnsafeMethod: Boolean
		get() = nativeClass.functionProvider != null && (returns.isBufferPointer || hasParam { it.isBufferPointer }) && !has(Capabilities)

	private val ReturnValue.isStructValue: Boolean
		get() = nativeType is StructType && !nativeType.includesPointer

	internal val returnsStructValue: Boolean
		get() = returns.isStructValue && !hasParam { it has autoSizeResult }

	private val returnsJavaMethodType: String
		get() = if ( returnsStructValue ) "void" else returns.javaMethodType

	private val returnsNativeMethodType: String
		get() = if ( returnsStructValue ) "void" else returns.nativeMethodType

	private val returnsJniFunctionType: String
		get() = if ( returnsStructValue ) "void" else returns.jniFunctionType

	val hideAutoSizeResultParam: Boolean
		get() = returns.nativeType is PointerType && returns.nativeType !is StructType && getParams { it.isAutoSizeResultOut }.count() == 1

	private fun Parameter.error(msg: String) {
		throw IllegalArgumentException("$msg [${nativeClass.className}.${this@NativeClassFunction.name}, parameter: ${this.name}]")
	}

	/** Validates parameters with modifiers that reference other parameters. */
	private fun validate() {
		var returnCount = 0
		parameters.forEach { param ->
			if ( param has AutoSize ) {
				val autoSize = param[AutoSize]
				val bufferParam = paramMap[autoSize.reference]
				if ( bufferParam == null )
					param.error("Buffer reference does not exist: AutoSize(${autoSize.reference})")
				else {
					when {
						bufferParam.nativeType !is PointerType -> param.error("Buffer reference must be a pointer type: AutoSize(${autoSize.reference})")
						!bufferParam.isBufferPointer           -> param.error("Buffer reference must not be a opaque pointer: AutoSize(${autoSize.reference})")
					}
					if ( bufferParam has MultiType )
						autoSize.toBytes = true
					else if ( bufferParam.nativeType is CharSequenceType && bufferParam.nativeType.charMapping == CharMapping.UTF16 )
						autoSize shr 1
				}
			}

			if ( param has autoSizeResult ) {
				if ( returns.nativeType !is PointerType || returns.nativeType.mapping === PointerMapping.OPAQUE_POINTER )
					param.error("Return type is not an array: autoSizeResult")
			}

			if ( param has AutoType ) {
				val bufferParamName = param[AutoType].reference
				val bufferParam = paramMap[bufferParamName]
				if ( bufferParam == null )
					param.error("Buffer reference does not exist: AutoType($bufferParamName)")
				else when {
					bufferParam.nativeType !is PointerType                -> param.error("Buffer reference must be a pointer type: AutoType($bufferParamName)")
					bufferParam.nativeType.mapping != PointerMapping.DATA -> param.error("Pointer reference must have a DATA mapping: AutoType($bufferParamName)")
				}
			}

			if ( param has Return ) {
				if ( !returns.isVoid )
					param.error("A return value can only be specified for functions with void return type.")

				returnCount++
				if ( 1 < returnCount )
					param.error("More than one return value found.")

				val returnMod = param[Return]
				if ( returnMod != returnValue ) {
					if ( !hasParam { it has AutoSize && it[AutoSize].hasReference(param.name) } )
						param.error("An AutoSize for Return parameter does not exist")

					val lengthParamName = returnMod.lengthParam
					if ( lengthParamName == null ) {
						if ( param.nativeType !is CharSequenceType )
							param.error("Null-terminated Return parameter must be a CharSequenceType")
					} else {
						val lengthParam = paramMap[returnMod.lengthParam]
						if ( lengthParam == null )
							param.error("The length parameter does not exist: Return(${returnMod.lengthParam})")
						else if ( !lengthParam.nativeType.mapping.isSizePointer )
							param.error("The length parameter must be an integer pointer type: Return(${returnMod.lengthParam})")
					}
				}
			}

			if ( param has PointerArray ) {
				if ( !hasParam { it has AutoSize && it[AutoSize].hasReference(param.name) } )
					param.error("An AutoSize for PointerArray parameter does not exist")

				val lengthsParamName = param[PointerArray].lengthsParam
				val lengthsParam = paramMap[lengthsParamName]
				if ( lengthsParam != null && !lengthsParam.nativeType.mapping.isSizePointer )
					param.error("Lengths reference must be an integer pointer type: PointerArray($lengthsParamName)")
			}
		}
	}

	private fun PrintWriter.generateChecks(mode: GenerationMode, customChecks: List<String>? = null, transforms: Map<QualifiedType, FunctionTransform<out QualifiedType>>? = null) {
		val checks = ArrayList<String>()

		// Validate function address
		if ( nativeClass.functionProvider != null && !hasUnsafeMethod )
			checks add "checkFunctionAddress($FUNCTION_ADDRESS);"

		// We convert multi-byte-per-element buffers to ByteBuffer for NORMAL generation.
		// So we need to scale the length check by the number of bytes per element.
		fun bufferShift(expression: String, param: String, shift: String, transform: FunctionTransform<out QualifiedType>?): String {
			val nativeType = paramMap[param]!!.nativeType
			val mapping =
				if ( transform != null && transform is AutoTypeTargetTransform ) {
					transform.autoType
				} else
					nativeType.mapping as PointerMapping

			if ( !mapping.isMultiByte ) {
				return if ( nativeType is StructType )
					"${expression} * ${nativeType.definition.className}.SIZEOF"
				else
					expression
			}

			val builder = StringBuilder(expression.length() + 8)

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

		parameters.forEach {
			var prefix = if ( it has Nullable && it.nativeType.mapping != PointerMapping.OPAQUE_POINTER ) "if ( ${it.name} != null ) " else ""

			if ( it.nativeType.mapping === PointerMapping.OPAQUE_POINTER && !it.has(nullable) && !hasUnsafeMethod && it.nativeType !is ObjectType && !it.has(Callback) )
				checks add "checkPointer(${it.name});"

			if ( mode === NORMAL && it.paramType === IN && it.nativeType is CharSequenceType ) {
				if ( it.nativeType.nullTerminated && getReferenceParam(AutoSize, it.name) == null )
					checks add "${prefix}checkNT${it.nativeType.charMapping.bytes}(${it.name});"
			}

			if ( it.paramType === IN && it has nullTerminated ) {
				if ( mode === NORMAL ) {
					val ntBytes = when ( it.nativeType.mapping ) {
						PointerMapping.DATA_SHORT  -> 2
						PointerMapping.DATA_INT    -> 4
						PointerMapping.DATA_LONG   -> 8
						PointerMapping.DATA_FLOAT  -> 4
						PointerMapping.DATA_DOUBLE -> 8
						else                       -> 1
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
					else if ( mode === NORMAL || it.nativeType is StructType )
						checks add "${prefix}checkBuffer(${it.name}, ${bufferShift(check.expression, it.name, "<<", transform)});"
					else
						checks add "${prefix}checkBuffer(${it.name}, ${check.expression});"
				}
			} else if ( it.nativeType is StructType ) {
				val param = it
				if ( !hasParam { it has AutoSize && it[AutoSize].hasReference(param.name) } )
					checks add "${prefix}checkBuffer(${it.name}, ${it.nativeType.definition.className}.SIZEOF);"
			}

			if ( mode === NORMAL && it has BufferObject ) {
				checks add "GLChecks.ensureBufferObject(${it[BufferObject].binding}, ${it.nativeType.mapping === PrimitiveMapping.PTR});"
			}

			if ( it has AutoSize ) {
				val autoSize = it[AutoSize]
				if ( mode === NORMAL || it.nativeType is PointerType ) {
					var length = it.name
					if ( it.nativeType is PointerType ) {
						if ( mode !== NORMAL )
							length += ".get($length.position())"
						else if ( it.nativeType.mapping === PointerMapping.DATA_INT )
							length += ".getInt($length.position())"
						else
							length = "PointerBuffer.get($length, $length.position())"
					}
					if ( autoSize.factor != null )
						length += " ${autoSize.factor!!.expressionInv()}"

					sequenceOf(autoSize.reference, *autoSize.dependent).forEach {
						prefix = if ( paramMap[it]!! has Nullable ) "if ( $it != null ) " else ""
						checks add "${prefix}checkBuffer($it, ${bufferShift(length, it, "<<", null)});"
					}
				}

				if ( mode !== NORMAL ) {
					val referenceTransform = transforms!![paramMap[autoSize.reference]!!]
					val expression =
						if ( referenceTransform != null && (referenceTransform.javaClass === javaClass<SingleValueTransform>() || referenceTransform === PointerArrayTransformSingle) )
							"1"
						else if ( referenceTransform != null && referenceTransform != PointerArrayTransformSingle )
							"${autoSize.reference}.length"
						else
							"${autoSize.reference}.remaining()"

					autoSize.dependent forEach {
						val param = paramMap[it]!!
						if ( transforms[param] !is SkipCheckFunctionTransform ) {
							prefix = if ( param has Nullable ) "if ( $it != null ) " else ""
							checks add if ( param.nativeType is StructType )
								"${prefix}checkBuffer($it, $expression * ${param.nativeType.definition.className}.SIZEOF);"
							else
								"${prefix}checkBuffer($it, $expression);"
						}
					}
				}
			}
		}

		if ( customChecks != null )
			checks addAll customChecks

		if ( checks.isEmpty() )
			return

		println("\t\tif ( LWJGLUtil.CHECKS )${if ( checks.size() == 1) "" else " {" }")
		checks.forEach {
			print("\t\t\t")
			println(it)
		}
		if ( 1 < checks.size() )
			println("\t\t}")
	}

	/** This is where we start generating java code. */
	fun generateMethods(writer: PrintWriter) {
		val simpleFunction = isSimpleFunction

		if ( !has(Reuse) )
			writer.generateNativeMethod(simpleFunction)

		if ( !simpleFunction ) {
			if ( hasUnsafeMethod )
				writer.generateUnsafeMethod()

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
		println("\t/** $description ${function.nativeClass.processDocumentation(function.methodLink)} */")
	}

	private fun PrintWriter.generateNativeMethod(nativeOnly: Boolean) {
		if ( nativeOnly )
			println(documentation)
		else {
			generateJavaDocLink("JNI method for", this@NativeClassFunction)
			println("\t@JavadocExclude")
		}
		print("\t${accessModifier}static native ${returnsNativeMethodType} ")
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

	private fun PrintWriter.generateUnsafeMethod() {
		generateJavaDocLink("Unsafe version of", this@NativeClassFunction)
		println("\t@JavadocExclude")
		print("\t${accessModifier}static ${returnsNativeMethodType} n$name(")
		printList(getNativeParams()) {
			it.asNativeMethodParam
		}

		if ( returnsStructValue ) {
			if ( this@NativeClassFunction.hasNativeParams ) print(", ")
			print("long $RESULT")
		}
		println(") {")

		// Get function address
		nativeClass.functionProvider!!.generateFunctionAddress(this, this@NativeClassFunction)

		// Basic checks
		val checks = ArrayList<String>(4)
		checks add "checkFunctionAddress($FUNCTION_ADDRESS);"
		parameters forEach {
			if ( it.nativeType.mapping === PointerMapping.OPAQUE_POINTER && !it.has(nullable) && it.nativeType !is ObjectType && !it.has(Callback) )
				checks add "checkPointer(${it.name});"
		}

		println("\t\tif ( LWJGLUtil.CHECKS )${if ( checks.size() == 1) "" else " {" }")
		checks.forEach {
			print("\t\t\t")
			println(it)
		}
		if ( 1 < checks.size() )
			println("\t\t}")

		// Native method call
		print("\t\t")
		if ( !returns.isVoid )
			print("return ")

		if ( has(Reuse) )
			print("${get(Reuse).reference}.")
		print("n$name(")
		printList(getNativeParams()) {
			it.name
		}

		if ( hasNativeParams ) print(", ")
		print("$FUNCTION_ADDRESS")
		println(");")

		println("\t}\n")
	}

	private fun PrintWriter.generateJavaMethod() {
		// Step 0: JavaDoc

		if ( GLCore_PATTERN.matcher(nativeClass.className).matches() ) {
			val xmlName = if ( this@NativeClassFunction has ReferenceGL )
				this@NativeClassFunction[ReferenceGL].function
			else
				stripPostfix(stripType = true)
			printOpenGLJavaDoc(documentation, xmlName, this@NativeClassFunction has deprecatedGL)
		} else
			println(documentation)

		// Step 1: Method signature

		print("\t${accessModifier}static ${returnsJavaMethodType} $name(")
		printList(parameters.sequence()) {
			if ( it.isAutoSizeResultOut && hideAutoSizeResultParam )
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

		val code = if ( this@NativeClassFunction.has(Code) ) this@NativeClassFunction[Code] else Code.NO_CODE

		// Step 2: Get function address

		if ( nativeClass.functionProvider != null && !hasUnsafeMethod )
			nativeClass.functionProvider.generateFunctionAddress(this, this@NativeClassFunction)

		// Step 3.a: Generate checks
		printCode(code.javaInit, Code.ApplyTo.NORMAL)
		generateChecks(NORMAL);

		// Step 3.b: Prepare APIBuffer parameters.

		if ( hideAutoSizeResultParam ) {
			println("\t\tAPIBuffer $API_BUFFER = apiBuffer();")

			val autoSizeParam = getParam { it has autoSizeResult }
			val autoSizeType = if ( autoSizeParam.nativeType.mapping === PointerMapping.DATA_INT ) "int" else "long"
			println("\t\tint ${autoSizeParam.name} = $API_BUFFER.${autoSizeType}Param();")
		}

		// Step 4: Call the native method
		generateCodeBeforeNative(code, Code.ApplyTo.NORMAL)

		generateNativeMethodCall(code.hasStatements(code.javaAfterNative, Code.ApplyTo.NORMAL)) {
			printList(getNativeParams()) {
				it.asNativeMethodCallParam(this@NativeClassFunction, NORMAL)
			}

			if ( returnsStructValue ) {
				if ( hasNativeParams ) print(", ")
				print("memAddress($RESULT)")
			}
		}

		generateCodeAfterNative(code, Code.ApplyTo.NORMAL)

		if ( !(returns.isVoid || returnsStructValue) ) {
			// TODO: optimize condition?
			if ( returns.isBufferPointer ) {
				val isNullTerminated = returns.nativeType is CharSequenceType && returns.nativeType.nullTerminated
				val bufferType = if ( isNullTerminated || returns.nativeType.mapping === PointerMapping.DATA )
					"ByteBuffer"
				else
					returns.nativeType.mapping.javaMethodType.getSimpleName()

				print("\t\treturn mem${bufferType}")
				if ( isNullTerminated )
					print("NT${(returns.nativeType as CharSequenceType).charMapping.bytes}")
				print("($RESULT")
				if ( returns has MapPointer )
					print(", (int)${returns[MapPointer].sizeExpression}")
				else if ( !isNullTerminated ) {
					if ( returns.nativeType is StructType ) {
						print(
							if ( hasParam { it has autoSizeResult } ) {
								val param = getParam { it has autoSizeResult }
								", ${param.name}.getInt(${param.name}.position()) * ${returns.nativeType.definition.className}.SIZEOF"
							} else
								", ${returns.nativeType.definition.className}.SIZEOF"
						)
					} else if ( hasParam { it has autoSizeResult } ) {
						val params = getParams { it has autoSizeResult }
						val single = params.count() == 1
						print(", ${params.map {
							if ( it.paramType === IN )
								"(int)${it.name}"
							else if ( it.nativeType.mapping === PointerMapping.DATA_INT ) {
								if ( single )
									"$API_BUFFER.intValue(${it.name})"
								else
									"${it.name}.getInt(${it.name}.position())"
							} else {
								if ( single )
									"(int)$API_BUFFER.longValue(${it.name})"
								else
									"(int)${it.name}.getLong(${it.name}.position())"
							}
						}.join(" * ")}")
					} else
						throw IllegalStateException("No autoSizeResult parameter could be found.")
				}
				println(");")
			} else if ( code.hasStatements(code.javaAfterNative, Code.ApplyTo.NORMAL) )
				println("\t\treturn $RESULT;")
		}

		println("\t}\n")
	}

	private fun PrintWriter.printCode(statements: List<Code.Statement>, applyTo: Code.ApplyTo) {
		if ( statements.isEmpty() )
			return

		statements.filter { it.applyTo === Code.ApplyTo.BOTH || it.applyTo === applyTo }.forEach {
			println(it.code)
		}
	}

	private fun PrintWriter.generateCodeBeforeNative(code: Code, applyTo: Code.ApplyTo) {
		printCode(code.javaBeforeNative, applyTo)

		if ( code.hasStatements(code.javaFinally, applyTo) ) {
			println("\t\ttry {")
			print('\t')
		}
	}

	private fun PrintWriter.generateCodeAfterNative(code: Code, applyTo: Code.ApplyTo) {
		val finally = code.getStatements(code.javaFinally, applyTo)
		if ( finally.isNotEmpty() )
			print('\t')
		printCode(code.javaAfterNative, applyTo)

		if ( finally.isNotEmpty() ) {
			println("\t} finally {")
			finally.forEach {
				println(it.code)
			}
			println("\t\t}")
		}
	}

	private fun PrintWriter.generateNativeMethodCall(
		returnLater: Boolean,
		printParams: PrintWriter.() -> Unit
	) {
		val hasConstructor = returns.nativeType is ObjectType
		val returnType = if ( hasConstructor ) (returns.nativeType as ObjectType).className else returnsNativeMethodType

		print("\t\t")
		if ( !(returns.isVoid || returnsStructValue) ) {
			if ( returnLater || returns.isBufferPointer ) {
				print("$returnType $RESULT = ")
				if ( hasConstructor )
					print("$returnType.create(")
			} else {
				print("return ")
				if ( hasConstructor )
					print("$returnType.create(")
			}
		}

		if ( has(Reuse) && !hasUnsafeMethod )
			print("${get(Reuse).reference}.")
		print("n$name(")
		printParams()
		if ( nativeClass.functionProvider != null && !hasUnsafeMethod ) {
			if ( hasNativeParams ) print(", ")
			print("$FUNCTION_ADDRESS")
		}
		print(")")

		if ( hasConstructor ) {
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
		val transforms = LinkedHashMap<QualifiedType, FunctionTransform<out QualifiedType>>()
		val customChecks = ArrayList<String>()

		if ( returns.nativeType is CharSequenceType )
			transforms[returns] = StringReturnTransform
		else if ( returns has MapPointer ) {
			val mapPointer = returns[MapPointer]

			transforms[returns] = if ( paramMap.containsKey(mapPointer.sizeExpression) )
				MapPointerExplicitTransform(lengthParam = mapPointer.sizeExpression, addParam = false)
			else
				MapPointerTransform
		}

		getParams { it has BufferObject && it.nativeType.mapping != PrimitiveMapping.PTR } forEach {
			transforms[it] = BufferOffsetTransform
			customChecks add "GLChecks.ensureBufferObject(${it[BufferObject].binding}, true);"
			generateAlternativeMethod(name, "Buffer object offset version of:", transforms, customChecks)
			customChecks.clear()
			transforms remove it
		}

		// Step 1: Apply basic transformations
		parameters forEach {
			if ( it.paramType === IN ) {
				if ( it has AutoSize ) {
					val autoSize = it[AutoSize]
					val param = paramMap[autoSize.reference]!! // TODO: Check dependent too?
					// Check if there's also a MultiType on the referenced parameter. Skip if so.
					if ( !(param has MultiType) )
						transforms[it] = AutoSizeTransform(param)
				} else if ( it has optional )
					transforms[it] = ExpressionTransform("0L")
				else if ( it has Callback )
					transforms[it] = CallbackTransform

				if ( it has Expression ) {
					// We do this here in case another transform applies too.
					// We overwrite the value with the expression but use the type of the other transform.
					val expression = it[Expression]
					transforms[it] = ExpressionTransform(expression.value, expression.keepParam, [suppress("UNCHECKED_CAST")](transforms[it] as FunctionTransform<Parameter>?))
				}
			}
		}

		getParams { it has BufferObject && it.nativeType.mapping != PrimitiveMapping.PTR }.map { it[BufferObject].binding } forEach {
			val c = "GLChecks.ensureBufferObject($it, false);"
			if ( !customChecks.contains(c) )
				customChecks add c
		}

		// Step 2: Check if we have any basic transformation to apply or if we have a multi-byte-per-element buffer parameter
		if ( !transforms.isEmpty() || parameters any { it.isBufferPointer && (it.nativeType.mapping as PointerMapping).isMultiByte && !(it.isAutoSizeResultOut && hideAutoSizeResultParam) } )
			generateAlternativeMethod(name, "Alternative version of:", transforms, customChecks)

		// Step 3: Generate more complex alternatives if necessary
		if ( returns has MapPointer ) {
			// The size expression may be an existing parameter, in which case we don't need an explicit size alternative.
			if ( !paramMap.containsKey(returns[MapPointer].sizeExpression) ) {
				transforms[returns] = MapPointerExplicitTransform("length")
				generateAlternativeMethod(name, "Explicit size alternative version of:", transforms, customChecks)
			}
		}

		// Apply any CharSequenceTransforms. These can be combined with any of the other transformations.
		if ( parameters count {
			if ( it.paramType === OUT || it.nativeType !is CharSequenceType )
				false
			else {
				val param = it
				getParams { it has AutoSize && it[AutoSize].hasReference(param.name) }.forEach {
					transforms[it] = AutoSizeCharSequenceTransform(param)
				}

				transforms[it] = CharSequenceTransform(!hasParam { it has AutoSize && it[AutoSize].hasReference(param.name) })
				true
			}
		} != 0 )
			generateAlternativeMethod(name, "CharSequence version of:", transforms, customChecks)

		fun applyReturnValueTransforms(param: Parameter) {
			// Transform void to the proper type
			transforms[returns] = BufferValueReturnTransform(PointerMapping.primitiveMap[param.nativeType.mapping]!!, param.name)

			// Transform the AutoSize parameter, if there is one
			getParams { it has AutoSize && it[AutoSize].hasReference(param.name) }.forEach {
				transforms[it] = BufferValueSizeTransform
			}

			// Transform the returnValue parameter
			transforms[param] = BufferValueParameterTransform
		}

		// Apply any complex transformations.
		parameters forEach {
			val param = it

			if ( it has Return && !hasParam { it has PointerArray } ) {
				val returnMod = it[Return]

				if ( returnMod === returnValue ) {
					// Generate Return alternative

					if ( !hasParam { it has SingleValue || it has PointerArray } ) {
						// Skip, we inject the Return alternative in these transforms
						applyReturnValueTransforms(it)
						generateAlternativeMethod(stripPostfix(name, stripType = false), "Single return value version of:", transforms, customChecks)
					}
				} else {
					// Generate String return alternative

					// Remove any transform from the maxLength parameter
					val maxLengthParam = getParam { it has AutoSize && it[AutoSize].hasReference(param.name) }
					transforms.remove(maxLengthParam)

					// Hide length parameter and use APIBuffer
					val lengthParam = returnMod.lengthParam
					if ( lengthParam != null )
						transforms[paramMap[lengthParam]] = BufferReturnLengthTransform

					// Hide target parameter and use APIBuffer
					transforms[it] = BufferReturnParamTransform

					// Transform void to the buffer type
					val returnType: String
					if ( it.nativeType is CharSequenceType ) {
						transforms[returns] = if ( lengthParam != null )
							BufferReturnTransform(it, lengthParam, it.nativeType.charMapping.charset)
						else
							BufferReturnNTTransform(it,
								if ( 4 < (maxLengthParam.nativeType.mapping as PrimitiveMapping).bytes ) "(int)${maxLengthParam.name}" else maxLengthParam.name,
								it.nativeType.charMapping.charset
							)
						returnType = "String"
					} else {
						transforms[returns] = BufferReturnTransform(it, lengthParam!!)
						returnType = "Buffer"
					}

					generateAlternativeMethod(name, "$returnType return version of:", transforms, customChecks)

					if ( returnMod.maxLengthExpression != null ) {
						// Transform maxLength parameter and generate an additional alternative
						transforms[maxLengthParam] = ExpressionLocalTransform(returnMod.maxLengthExpression)
						generateAlternativeMethod(name, "$returnType return (w/ implicit max length) version of:", transforms, customChecks)
					}
				}
			} else if ( it has MultiType ) {
				// Generate MultiType alternatives

				// Add the AutoSize transformation if we skipped it above
				getParams { it has AutoSize } forEach {
					transforms[it] = AutoSizeTransform(paramMap[it[AutoSize].reference]!!)
				}

				val multiTypes = it[MultiType]
				for ( autoType in multiTypes.types ) {
					// Transform the AutoSize parameter, if there is one and it's expressed in bytes
					getParams {
						if ( it has AutoSize ) {
							val autoSize = it[AutoSize]
							autoSize.hasReference(param.name) && autoSize.toBytes
						} else
							false
					}.forEach {
						transforms[it] = AutoSizeTransform(param, autoType.byteShift!!)
					}

					transforms[it] = AutoTypeTargetTransform(autoType)
					generateAlternativeMethod(name, "${autoType.javaMethodType.getSimpleName()} version of:", transforms, customChecks)
				}

				// Generate a SingleValue alternative for each type
				if ( it has SingleValue ) {
					val autoSizeParam = getParam { it has AutoSize && it[AutoSize].hasReference(param.name) } // required

					val singleValue = param[SingleValue]
					for ( autoType in multiTypes.types ) {
						// Generate type1, type2, type3, type4 versions
						// TODO: Make customizable? New modifier?
						for ( i in 1..4 ) {
							// Transform the AutoSize parameter
							transforms[autoSizeParam] = ExpressionTransform("(1 << ${autoType.byteShift}) * $i")

							val primitiveType = PointerMapping.primitiveMap[autoType]!!
							transforms[it] = VectorValueTransform(if ( primitiveType == "pointer" ) "long" else primitiveType, primitiveType, singleValue.newName, i)
							generateAlternativeMethod("$name$i${primitiveType[0]}", "${if ( i == 1 ) "Single $primitiveType" else "${primitiveType}$i" } value version of:", transforms, customChecks)
						}
					}
				}
			} else if ( it has AutoType ) {
				// Generate AutoType alternatives

				val autoTypes = it[AutoType]
				val bufferParam = paramMap[autoTypes.reference]!!

				// Disable AutoSize factor
				val autoSizeParam = getReferenceParam(AutoSize, bufferParam.name)
				if ( autoSizeParam != null )
					transforms[autoSizeParam] = AutoSizeTransform(bufferParam, false)

				val types = ArrayList<BufferType>(autoTypes.types.size())
				autoTypes.types.forEach { types add it }

				for ( autoType in autoTypes.types ) {
					val unsignedType = when ( autoType ) {
						GL_BYTE  -> GL_UNSIGNED_BYTE
						GL_SHORT -> GL_UNSIGNED_SHORT
						GL_INT   -> GL_UNSIGNED_INT
						GL_LONG  -> GL_UNSIGNED_LONG
						else     -> null
					}

					if ( unsignedType == null || !types.contains(unsignedType) )
						continue

					transforms[it] = AutoTypeParamWithSignTransform("${unsignedType.className}.${unsignedType.name()}", "${autoType.className}.${autoType.name()}")
					transforms[bufferParam] = AutoTypeTargetTransform(autoType.mapping)
					generateAlternativeMethod(name, "${unsignedType.name()} / ${autoType.name()} version of:", transforms, customChecks)

					types.remove(autoType)
					types.remove(unsignedType)
				}

				for ( autoType in types ) {
					transforms[it] = AutoTypeParamTransform("${autoType.className}.${autoType.name()}")
					transforms[bufferParam] = AutoTypeTargetTransform(autoType.mapping)
					generateAlternativeMethod(name, "${autoType.name()} version of:", transforms, customChecks)
				}
			} else if ( it has PointerArray ) {
				val pointerArray = it[PointerArray]

				val lengthsParam = paramMap[pointerArray.lengthsParam]
				if ( lengthsParam != null )
					transforms[lengthsParam] = PointerArrayLengthsTransform(it, true)

				val countParam = getParam { it has AutoSize && it[AutoSize].hasReference(param.name) }
				transforms[countParam] = ExpressionTransform("${it.name}.length")

				val vararg = {
					var isLast = true;
					for ( i in parameters.indices.reversed() ) {
						val p = parameters[i]
						if ( p === lengthsParam || p === countParam ) // these will be hidden, ignore
							continue;

						isLast = p === it
						break;
					}
					isLast
				}()
				transforms[it] = if ( vararg ) PointerArrayTransformVararg else PointerArrayTransformArray

				generateAlternativeMethod(name, "Array version of:", transforms, customChecks)

				// Combine PointerArrayTransformSingle with BufferValueReturnTransform
				getParams { it has returnValue } forEach { applyReturnValueTransforms(it) }

				transforms[countParam] = ExpressionTransform("1")
				if ( lengthsParam != null )
					transforms[lengthsParam] = PointerArrayLengthsTransform(it, false)
				transforms[it] = PointerArrayTransformSingle
				generateAlternativeMethod(name, "Single ${pointerArray.singleName} version of:", transforms, customChecks)
			}
		}

		// Apply any SingleValue transformations.
		if ( parameters count {
			if ( !it.has(SingleValue) || it.has(MultiType) ) {
				false
			} else {
				val param = it

				// Compine SingleValueTransform with BufferValueReturnTransform
				getParams { it has returnValue } forEach { applyReturnValueTransforms(it) }

				// Transform the AutoSize parameter, if there is one
				getParams { it has AutoSize && it[AutoSize].hasReference(param.name) }.forEach {
					transforms[it] = BufferValueSizeTransform
				}

				val singleValue = param[SingleValue]
				val pointerType = param.nativeType as PointerType
				val primitiveType = PointerMapping.primitiveMap[pointerType.mapping]!!
				transforms[it] = SingleValueTransform(
					when ( pointerType.elementType ) {
						null                -> primitiveType
						is CharSequenceType -> "CharSequence"
						is ObjectType       -> pointerType.elementType.className
						is PointerType      -> "long"
						else                -> pointerType.elementType.javaMethodType.toString()
					},
					primitiveType,
					singleValue.newName
				)

				true
			}
		} != 0 )
			generateAlternativeMethod(stripPostfix(name, stripType = false), "Single value version of:", transforms, customChecks)
	}

	private fun PrintWriter.generateAlternativeMethod(
		name: String,
		description: String,
		transforms: Map<QualifiedType, FunctionTransform<out QualifiedType>>,
		customChecks: List<String>
	) {
		val returnTransform = transforms[returns]

		// Step 0: JavaDoc

		if ( returnTransform === StringReturnTransform ) // Special-case, we skipped the normal method
			println(documentation)
		else
			generateJavaDocLink(description, this@NativeClassFunction)

		// Step 1: Method signature

		val retType = returns.transformDeclarationOrElse(transforms, returnsJavaMethodType)

		print("\t${accessModifier}static $retType $name(")
		printList(parameters.sequence()) {
			if ( it.isAutoSizeResultOut && hideAutoSizeResultParam )
				null
			else
				it.transformDeclarationOrElse(transforms, it.asJavaMethodParam)
		}
		if ( returnTransform === MapPointerTransform ) {
			if ( !parameters.isEmpty() )
				print(", ")
			print("ByteBuffer old_buffer")
		} else if ( returnTransform != null && returnTransform.javaClass === javaClass<MapPointerExplicitTransform>() ) {
			if ( !parameters.isEmpty() )
				print(", ")
			val mapPointerExplicit = returnTransform as MapPointerExplicitTransform
			if ( mapPointerExplicit.addParam )
				print("long ${mapPointerExplicit.lengthParam}, ")
			print("ByteBuffer old_buffer")
		}
		println(") {")

		val code = if ( this@NativeClassFunction.has(Code) ) this@NativeClassFunction[Code] else Code.NO_CODE

		// Step 2: Get function address

		if ( nativeClass.functionProvider != null && !hasUnsafeMethod )
			nativeClass.functionProvider.generateFunctionAddress(this, this@NativeClassFunction)

		// Step 3.A: Generate checks
		printCode(code.javaInit, Code.ApplyTo.ALTERNATIVE)
		generateChecks(ALTERNATIVE, customChecks, transforms);

		// Step 3.B: Transform pre-processing.

		for ( (qtype, transform) in transforms ) {
			if ( transform is PreFunctionTransform<*> ) {
				[suppress("UNCHECKED_CAST")]
				when ( qtype ) {
					is Parameter   -> (transform as PreFunctionTransform<Parameter>).preprocess(qtype, this)
					is ReturnValue -> (transform as PreFunctionTransform<ReturnValue>).preprocess(qtype, this)
				}
			}
		}

		// Step 3.C: Prepare APIBuffer parameters.

		var apiBufferSet = hideAutoSizeResultParam
		if ( apiBufferSet ) {
			println("\t\tAPIBuffer $API_BUFFER = apiBuffer();")

			val autoSizeParam = getParam { it has autoSizeResult }
			val autoSizeType = if ( autoSizeParam.nativeType.mapping === PointerMapping.DATA_INT ) "int" else "long"
			println("\t\tint ${autoSizeParam.name} = $API_BUFFER.${autoSizeType}Param();")
		}
		for ( (qtype, transform) in transforms ) {
			if ( transform is APIBufferFunctionTransform<*> ) {
				if ( !apiBufferSet ) {
					println("\t\tAPIBuffer $API_BUFFER = apiBuffer();")
					apiBufferSet = true
				}

				[suppress("UNCHECKED_CAST")]
				when ( qtype ) {
					is Parameter   -> (transform as APIBufferFunctionTransform<Parameter>).setupAPIBuffer(this@NativeClassFunction, qtype, this)
					is ReturnValue -> (transform as APIBufferFunctionTransform<ReturnValue>).setupAPIBuffer(this@NativeClassFunction, qtype, this)
				}
			}
		}

		// Step 4: Call the native method
		generateCodeBeforeNative(code, Code.ApplyTo.ALTERNATIVE)

		generateNativeMethodCall(code.hasStatements(code.javaAfterNative, Code.ApplyTo.ALTERNATIVE)) {
			printList(getNativeParams()) {
				it.transformCallOrElse(transforms, it.asNativeMethodCallParam(this@NativeClassFunction, ALTERNATIVE))
			}
		}

		generateCodeAfterNative(code, Code.ApplyTo.ALTERNATIVE)

		if ( returns.isVoid || returnsStructValue ) {
			val result = returns.transformCallOrElse(transforms, "")
			if ( !result.isEmpty() )
				println(result)
		} else {
			if ( returns.isBufferPointer ) {
				print("\t\t")

				val isNullTerminated = returns.nativeType is CharSequenceType && returns.nativeType.nullTerminated
				val bufferType = if ( isNullTerminated || returns.nativeType.mapping === PointerMapping.DATA )
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
					if ( returns.nativeType is StructType ) {
						builder append
							if ( hasParam { it has autoSizeResult } ) {
								val param = getParam { it has autoSizeResult }
								", ${param.name}.get(${param.name}.position()) * ${returns.nativeType.definition.className}.SIZEOF"
							} else
								", ${returns.nativeType.definition.className}.SIZEOF"
					} else if ( hasParam { it has autoSizeResult } ) {
						val params = getParams { it has autoSizeResult }
						val single = params.count() == 1
						builder append ", ${params.map {
							if ( it.paramType === IN )
								"(int)${it.name}"
							else if ( it.nativeType.mapping === PointerMapping.DATA_INT ) {
								if ( single )
									"$API_BUFFER.intValue(${it.name})"
								else
									"${it.name}.get(${it.name}.position())"
							} else {
								if ( single )
									"(int)$API_BUFFER.longValue(${it.name})"
								else
									"(int)${it.name}.get(${it.name}.position())"
							}
						}.join(" * ")}"
					} else
						throw IllegalStateException("No autoSizeResult parameter could be found.")
				}
				builder append ")"

				val returnExpression = returns.transformCallOrElse(transforms, builder.toString())
				if ( returnExpression.indexOf('\n') == -1 )
					println("return $returnExpression;")
				else // Multiple statements, assumes the transformation includes the return statement.
					println(returnExpression)
			} else if ( code.hasStatements(code.javaAfterNative, Code.ApplyTo.ALTERNATIVE) )
				println("\t\treturn $RESULT;")
		}

		println("\t}\n")
	}

	// --[ JNI FUNCTIONS ]--

	fun generateFunctionDefinition(writer: PrintWriter) = writer.generateFunctionDefinitionImpl()
	private fun PrintWriter.generateFunctionDefinitionImpl() {
		print("typedef ${returns.toNativeType} (APIENTRY *${name}PROC) (")
		val nativeParams = getNativeParams()
		if ( nativeParams.any() ) {
			printList(nativeParams) {
				it.toNativeType
			}
		} else
			print("void")
		println(");")
	}

	fun generateFunction(writer: PrintWriter) = writer.generateFunctionImpl()
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

		// Step 3: Unused parameter macro

		println("\tUNUSED_PARAMS($JNIENV, clazz)")

		// Step 4: Call native function

		print('\t')
		if ( returnsStructValue ) {
			print("*((${returns.nativeType.name}*)(intptr_t)$RESULT) = ")
		} else if ( !returns.isVoid ) {
			print("return (${returnsJniFunctionType})")
			if ( returns.nativeType is PointerType )
				print("(intptr_t)")
			if ( returns.has(address) )
				print('&')
		}
		print("$name")
		if ( !has(macro) ) print('(')
		printList(getNativeParams()) {
			// Avoids warning when implicitly casting from jlong to 32-bit pointer.
			if ( it.nativeType.mapping === PrimitiveMapping.PTR )
				"(${it.nativeType.name})${it.name}"
			else if ( it.nativeType is StructType && !it.nativeType.includesPointer )
				"*${it.name}"
			else
				it.name
		}
		if ( !has(macro) ) print(')')
		println(';')

		println("}")
	}

}