package org.lwjgl.generator

import java.io.PrintWriter

interface FunctionTransform<T : QualifiedType> {
	fun transformDeclaration(param: T, original: String): String?
	fun transformCall(param: T, original: String): String
}

/** A function transform that must generate additional code. */
interface CodeFunctionTransform<T : QualifiedType> {
	fun generate(qtype: T, code: Code): Code
}

/** A function transform that makes use of the APIBuffer. */
interface APIBufferFunctionTransform<T : QualifiedType> {
	fun setupAPIBuffer(func: Function, qtype: T, writer: PrintWriter)
}

/** Marker trait to indicate that buffer checks should be skipped. */
interface SkipCheckFunctionTransform

fun <T : QualifiedType> T.transformDeclarationOrElse(transforms: Map<QualifiedType, FunctionTransform<out QualifiedType>>, original: String): String? {
	val transform = transforms[this]
	if ( transform == null )
		return original
	else
		@Suppress("UNCHECKED_CAST")
		return (transform as FunctionTransform<T>).transformDeclaration(this, original)
}

fun <T : QualifiedType> T.transformCallOrElse(transforms: Map<QualifiedType, FunctionTransform<out QualifiedType>>, original: String): String {
	val transform = transforms[this]
	if ( transform == null )
		return original
	else
		@Suppress("UNCHECKED_CAST")
		return (transform as FunctionTransform<T>).transformCall(this, original)
}

open class AutoSizeTransform(
	val bufferParam: Parameter,
	val applyTo: ApplyTo,
	val applyFactor: Boolean = true
) : FunctionTransform<Parameter> {
	override fun transformDeclaration(param: Parameter, original: String) = null // Remove the parameter
	override fun transformCall(param: Parameter, original: String): String {
		if ( applyTo === ApplyTo.NORMAL )
			return param.name

		var expression = "${bufferParam.name}.remaining()"
		val factor = param[AutoSize].factor
		if ( applyFactor && factor != null )
			expression += " ${factor.expression()}"

		if ( bufferParam.nativeType is StructType )
			expression += " / ${bufferParam.nativeType.definition.className}.SIZEOF"

		if ( bufferParam has nullable )
			expression = "${bufferParam.name} == null ? 0 : $expression"

		if ( (param.nativeType.mapping as PrimitiveMapping).bytes < 4 )
			expression = "(${param.nativeType.javaMethodType.simpleName})($expression)"

		return expression
	}
}

fun AutoSizeTransform(bufferParam: Parameter, applyTo: ApplyTo, byteShift: String) =
	if ( byteShift == "0" ) AutoSizeTransform(bufferParam, applyTo) else AutoSizeBytesTransform(bufferParam, applyTo, byteShift)

private class AutoSizeBytesTransform(bufferParam: Parameter, applyTo: ApplyTo, val byteShift: String) : AutoSizeTransform(bufferParam, applyTo) {
	override fun transformCall(param: Parameter, original: String): String {
		if ( applyTo === ApplyTo.NORMAL )
			return param.name

		var expression = "${bufferParam.name}.remaining()"
		val factor = param[AutoSize].factor
		if ( factor == null )
			expression = "$expression << $byteShift"
		else if ( applyTo !== ApplyTo.ALTERNATIVE ) // Hack to skip the expression with MultiType
			expression = "($expression ${factor.expression()}) << $byteShift"

		if ( bufferParam has nullable )
			expression = "(${bufferParam.name} == null ? 0 : $expression)"

		if ( (param.nativeType.mapping as PrimitiveMapping).bytes < 4 )
			expression = "(${param.nativeType.javaMethodType.simpleName})($expression)"

		return expression
	}
}

open class AutoSizeCharSequenceTransform(val bufferParam: Parameter) : FunctionTransform<Parameter> {
	override fun transformDeclaration(param: Parameter, original: String) = null // Remove the parameter
	override fun transformCall(param: Parameter, original: String): String {
		var expression = if ( bufferParam has nullable )
			"${bufferParam.name} == null ? 0 : ${bufferParam.name}Encoded.remaining()"
		else
			"${bufferParam.name}EncodedLen"

		if ( param[AutoSize].factor != null )
			expression = "$expression ${param[AutoSize].factor!!.expression()}"

		if ( (param.nativeType.mapping as PrimitiveMapping).bytes < 4 )
			expression = "(${param.nativeType.javaMethodType.simpleName})($expression)"

		return expression
	}
}

class AutoTypeParamTransform(val autoType: String) : FunctionTransform<Parameter> {
	override fun transformDeclaration(param: Parameter, original: String) = null // Remove the parameter
	override fun transformCall(param: Parameter, original: String) = autoType // Replace with hard-coded type
}

class AutoTypeTargetTransform(val autoType: PointerMapping) : FunctionTransform<Parameter> {
	override fun transformDeclaration(param: Parameter, original: String) = "${autoType.javaMethodType.simpleName} ${param.name}"
	override fun transformCall(param: Parameter, original: String) = original
}

open class ExpressionTransform(
	val expression: String,
	val keepParam: Boolean = false,
	val paramTransform: FunctionTransform<Parameter>? = null
) : FunctionTransform<Parameter>, SkipCheckFunctionTransform {
	override fun transformDeclaration(param: Parameter, original: String) =
		if ( keepParam ) paramTransform?.transformDeclaration(param, original) ?: original else null

	override fun transformCall(param: Parameter, original: String) = expression
}

class ExpressionLocalTransform(
	expression: String,
	keepParam: Boolean = false
) : ExpressionTransform(expression, keepParam), CodeFunctionTransform<Parameter>, SkipCheckFunctionTransform {
	override fun transformCall(param: Parameter, original: String) = original
	override fun generate(qtype: Parameter, code: Code) = code.append(
		javaInit = statement("\t\t${qtype.asJavaMethodParam} = $expression;", ApplyTo.ALTERNATIVE)
	)
}

class CharSequenceTransform(
	val nullTerminated: Boolean
) : FunctionTransform<Parameter>, APIBufferFunctionTransform<Parameter> {
	override fun transformDeclaration(param: Parameter, original: String) = "CharSequence ${param.name}"
	override fun transformCall(param: Parameter, original: String) = if ( param has nullable )
		"$API_BUFFER.addressSafe(${param.name}, ${param.name}Encoded)"
	else
		"$API_BUFFER.address(${param.name}Encoded)"

	override fun setupAPIBuffer(func: Function, qtype: Parameter, writer: PrintWriter) {
		writer.println("\t\tint ${qtype.name}Encoded = $API_BUFFER.stringParam${(qtype.nativeType as CharSequenceType).charMapping.charset}(${qtype.name}, $nullTerminated);")
		if ( !nullTerminated )
			writer.println("\t\tint ${qtype.name}EncodedLen = $API_BUFFER.getOffset() - ${qtype.name}Encoded;")
	}
}

object StringReturnTransform : FunctionTransform<ReturnValue> {
	override fun transformDeclaration(param: ReturnValue, original: String) = "String"
	override fun transformCall(param: ReturnValue, original: String): String {
		val expression = if ( original.startsWith("memByteBufferNT") )
			original.substring(17, original.length() - 1);
		else
			original
		return "memDecode${(param.nativeType as CharSequenceType).charMapping.charset}($expression)";
	}
}

class BufferValueReturnTransform(
	val bufferType: String,
	val paramName: String
) : FunctionTransform<ReturnValue>, APIBufferFunctionTransform<ReturnValue> {
	override fun transformDeclaration(param: ReturnValue, original: String) = if ( bufferType == "pointer" ) "long" else bufferType // Replace void with the buffer value type
	override fun transformCall(param: ReturnValue, original: String) = "\t\treturn $API_BUFFER.${bufferType}Value($paramName);" // Replace with value from APIBuffer
	override fun setupAPIBuffer(func: Function, qtype: ReturnValue, writer: PrintWriter) = writer.println("\t\tint $paramName = $API_BUFFER.${bufferType}Param();")
}

object BufferValueParameterTransform : FunctionTransform<Parameter>, SkipCheckFunctionTransform {
	override fun transformDeclaration(param: Parameter, original: String) = null // Remove the parameter
	override fun transformCall(param: Parameter, original: String) = "$API_BUFFER.address(${param.name})" // Replace with APIBuffer address + offset
}

object BufferValueSizeTransform : FunctionTransform<Parameter> {
	override fun transformDeclaration(param: Parameter, original: String) = null // Remove the parameter
	override fun transformCall(param: Parameter, original: String) = "1" // Replace with 1
}

class SingleValueTransform(
	val paramType: String,
	val elementType: String,
	val newName: String
) : FunctionTransform<Parameter>, APIBufferFunctionTransform<Parameter>, SkipCheckFunctionTransform {
	override fun transformDeclaration(param: Parameter, original: String) = "$paramType $newName" // Replace with element type + new name
	override fun transformCall(param: Parameter, original: String) = "$API_BUFFER.address(${param.name})" // Replace with APIBuffer address + offset
	override fun setupAPIBuffer(func: Function, qtype: Parameter, writer: PrintWriter) {
		if ( "CharSequence" == paramType ) {
			writer.println("\t\tByteBuffer ${newName}Buffer = memEncodeASCII($newName);") // TODO: Support other than ASCCI
			writer.println("\t\tint ${qtype.name} = $API_BUFFER.${elementType}Param(memAddress(${newName}Buffer));")
		} else
			writer.println("\t\tint ${qtype.name} = $API_BUFFER.${elementType}Param($newName);")
	}
}

class VectorValueTransform(
	val paramType: String,
	val elementType: String,
	val newName: String,
	val size: Int
) : FunctionTransform<Parameter>, APIBufferFunctionTransform<Parameter>, SkipCheckFunctionTransform {
	override fun transformDeclaration(param: Parameter, original: String) = (0..size - 1).map { "$paramType $newName$it" }.reduce { a, b -> "$a, $b" } // Replace with vector elements
	override fun transformCall(param: Parameter, original: String) = "$API_BUFFER.address(${param.name})" // Replace with APIBuffer address + offset
	override fun setupAPIBuffer(func: Function, qtype: Parameter, writer: PrintWriter) {
		writer.println("\t\tint ${qtype.name} = $API_BUFFER.${elementType}Param(${newName}0);")
		for (i in 1..(size - 1))
			writer.println("\t\t$API_BUFFER.${elementType}Param($newName$i);")
	}
}

object MapPointerTransform : FunctionTransform<ReturnValue> {
	override fun transformDeclaration(param: ReturnValue, original: String) = "ByteBuffer" // Return a ByteBuffer
	override fun transformCall(param: ReturnValue, original: String) = """int $MAP_LENGTH = ${param[MapPointer].sizeExpression};
		return $MAP_OLD == null ? memByteBuffer($RESULT, $MAP_LENGTH) : memSetupBuffer($MAP_OLD, $RESULT, $MAP_LENGTH);"""
}

class MapPointerExplicitTransform(val lengthParam: String, val addParam: Boolean = true) : FunctionTransform<ReturnValue> {
	override fun transformDeclaration(param: ReturnValue, original: String) = "ByteBuffer" // Return a ByteBuffer
	override fun transformCall(param: ReturnValue, original: String) =
		"$MAP_OLD == null ? memByteBuffer($RESULT, (int)$lengthParam) : memSetupBuffer($MAP_OLD, $RESULT, (int)$lengthParam)"
}

val BufferReturnLengthTransform: FunctionTransform<Parameter> = object : FunctionTransform<Parameter>, APIBufferFunctionTransform<Parameter>, SkipCheckFunctionTransform {
	override fun transformDeclaration(param: Parameter, original: String) = null // Remove the parameter
	override fun transformCall(param: Parameter, original: String) = "$API_BUFFER.address(${param.name})" // Replace with APIBuffer address + offset
	override fun setupAPIBuffer(func: Function, qtype: Parameter, writer: PrintWriter) = writer.println("\t\tint ${qtype.name} = $API_BUFFER.intParam();")
}

val BufferReturnParamTransform: FunctionTransform<Parameter> = object : FunctionTransform<Parameter>, APIBufferFunctionTransform<Parameter>, SkipCheckFunctionTransform {
	override fun transformDeclaration(param: Parameter, original: String) = null // Remove the parameter
	override fun transformCall(param: Parameter, original: String) = if ( param.nativeType is CharSequenceType )
		"$API_BUFFER.address(${param.name})" // Replace with APIBuffer address + offset
	else
		"memAddress(${param.name})" // Replace with address of allocated buffer

	override fun setupAPIBuffer(func: Function, qtype: Parameter, writer: PrintWriter) {
		if ( qtype.nativeType is CharSequenceType ) {
			writer.print("\t\tint ${qtype.name} = $API_BUFFER.bufferParam(")
		} else {
			val bufferType = qtype.nativeType.mapping.javaMethodType.simpleName
			writer.print("\t\t$bufferType ${qtype.name} = BufferUtils.create$bufferType(")
		}

		val autoSizeParam = func.getParam { it has AutoSize && it[AutoSize].hasReference(qtype.name) }
		writer.println("${if ( 4 < (autoSizeParam.nativeType.mapping as PrimitiveMapping).bytes) "(int)" else ""}${autoSizeParam.name});")
	}
}

class BufferReturnTransform(
	val outParam: Parameter,
	val lengthParam: String,
	val encoding: String? = null
) : FunctionTransform<ReturnValue> {

	private val bufferType: String
		get() = (outParam.nativeType.mapping as PointerMapping).javaMethodType.simpleName

	override fun transformDeclaration(param: ReturnValue, original: String) = if ( encoding == null) bufferType else "String"
	override fun transformCall(param: ReturnValue, original: String): String {
		return if ( encoding != null )
			"\t\treturn memDecode$encoding($API_BUFFER.buffer(), $API_BUFFER.intValue($lengthParam), ${outParam.name});"
		else
			"\t\t${outParam.name}.limit($API_BUFFER.intValue($lengthParam));\n" +
			"\t\treturn ${outParam.name};"
	}
}

class BufferReturnNTTransform(
	val outParam: Parameter,
	val maxLengthParam: String,
	val encoding: String
) : FunctionTransform<ReturnValue> {
	override fun transformDeclaration(param: ReturnValue, original: String) = "String"
	override fun transformCall(param: ReturnValue, original: String): String =
		"\t\treturn memDecode$encoding(memByteBufferNT${(outParam.nativeType as CharSequenceType).charMapping.bytes}($API_BUFFER.address(${outParam.name}), $maxLengthParam));"
}

open class PointerArrayTransform(val paramType: String) : FunctionTransform<Parameter>, APIBufferFunctionTransform<Parameter>, CodeFunctionTransform<Parameter> {
	override fun transformDeclaration(param: Parameter, original: String): String? {
		val name = if ( paramType.isEmpty() ) param[PointerArray].singleName else param.name
		val paramClass = param[PointerArray].elementType.let {
			if ( it.mapping === PointerMapping.OPAQUE_POINTER )
				"long"
			else if ( it is CharSequenceType )
				"CharSequence"
			else
				"ByteBuffer"
		}
		return "$paramClass$paramType $name"
	}

	override fun transformCall(param: Parameter, original: String) = "$API_BUFFER.address(${param.name}$POINTER_POSTFIX)" // Replace with APIBuffer address + offset
	override fun setupAPIBuffer(func: Function, qtype: Parameter, writer: PrintWriter) = writer.setupAPIBufferImpl(qtype)

	private fun PrintWriter.setupAPIBufferImpl(param: Parameter) {
		val pointerArray = param[PointerArray]
		if ( pointerArray.lengthsParam != null )
			return

		val paramName = (if ( paramType.isNotEmpty() ) param.name else pointerArray.singleName) let {
			if ( pointerArray.elementType is CharSequenceType )
				"APIBuffer.stringArray${pointerArray.elementType.charMapping.charset}(true, $it)"
			else
				it
		}

		println("\t\tint ${param.name}$POINTER_POSTFIX = $API_BUFFER.pointerArrayParam($paramName);")
	}

	override fun generate(qtype: Parameter, code: Code): Code {
		val pointerArray = qtype[PointerArray]
		val elementType = pointerArray.elementType

		if ( elementType is CharSequenceType ) {
			return code.append(javaFinally = statement(
				"\t\t\t$API_BUFFER.pointerArrayFree(${qtype.name}$POINTER_POSTFIX, ${if ( paramType.isEmpty() ) "1" else "${qtype.name}.length"});",
				ApplyTo.ALTERNATIVE
			))
		}

		return code
	}
}

object PointerArrayTransformSingle : PointerArrayTransform(""), SkipCheckFunctionTransform

val PointerArrayTransformArray = PointerArrayTransform("[]")
val PointerArrayTransformVararg = PointerArrayTransform("...")

class PointerArrayLengthsTransform(
	val arrayParam: Parameter,
	val multi: Boolean
) : FunctionTransform<Parameter>, APIBufferFunctionTransform<Parameter>, SkipCheckFunctionTransform {
	override fun transformDeclaration(param: Parameter, original: String) = null // Remove the parameter
	override fun transformCall(param: Parameter, original: String) = // Replace with APIBuffer address + offset
		if ( multi )
			"$API_BUFFER.address(${arrayParam.name}$POINTER_POSTFIX + (${arrayParam.name}.length << POINTER_SHIFT))"
		else
			"$API_BUFFER.address(${arrayParam.name}$POINTER_POSTFIX + POINTER_SIZE)"

	override fun setupAPIBuffer(func: Function, qtype: Parameter, writer: PrintWriter) = writer.setupAPIBufferImpl(qtype)

	private fun PrintWriter.setupAPIBufferImpl(param: Parameter) {
		val pointerArray = arrayParam[PointerArray]

		val lengthType = PointerMapping.primitiveMap[param.nativeType.mapping]!![0]
		val paramName = (if ( multi ) arrayParam.name else pointerArray.singleName) let {
			if ( pointerArray.elementType is CharSequenceType )
				"APIBuffer.stringArray${pointerArray.elementType.charMapping.charset}(false, $it)"
			else
				it
		}

		println("\t\tint ${arrayParam.name}$POINTER_POSTFIX = $API_BUFFER.pointerArrayParam$lengthType($paramName);")
	}
}