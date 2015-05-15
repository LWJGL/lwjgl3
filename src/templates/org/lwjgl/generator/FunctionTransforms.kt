package org.lwjgl.generator

import java.io.PrintWriter

private trait FunctionTransform<T: QualifiedType> {
	fun transformDeclaration(param: T, original: String): String?
	fun transformCall(param: T, original: String): String
}

/** A function transform that must perform some pre-processing. */
private trait PreFunctionTransform<T: QualifiedType> {
	fun preprocess(qtype: T, writer: PrintWriter)
}

/** A function transform that makes use of the APIBuffer. */
private trait APIBufferFunctionTransform<T: QualifiedType> {
	fun setupAPIBuffer(func: Function, qtype: T, writer: PrintWriter)
}

/** Marker trait to indicate that buffer checks should be skipped. */
private trait SkipCheckFunctionTransform

private fun <T: QualifiedType> T.transformDeclarationOrElse(transforms: Map<QualifiedType, FunctionTransform<out QualifiedType>>, original: String): String? {
	val transform = transforms[this]
	if ( transform == null )
		return original
	else
		return [suppress("UNCHECKED_CAST")](transform as FunctionTransform<T>).transformDeclaration(this, original)
}

private fun <T: QualifiedType> T.transformCallOrElse(transforms: Map<QualifiedType, FunctionTransform<out QualifiedType>>, original: String): String {
	val transform = transforms[this]
	if ( transform == null )
		return original
	else
		return [suppress("UNCHECKED_CAST")](transform as FunctionTransform<T>).transformCall(this, original)
}

private open class AutoSizeTransform(val bufferParam: Parameter, val applyFactor: Boolean = true): FunctionTransform<Parameter> {
	override fun transformDeclaration(param: Parameter, original: String) = null // Remove the parameter
	override fun transformCall(param: Parameter, original: String): String {
		var expression = "${bufferParam.name}.remaining()"
		val factor = param[AutoSize].factor
		if ( applyFactor && factor != null )
			expression += " ${factor.expression()}"

		if ( bufferParam.nativeType is StructType )
			expression += " / ${bufferParam.nativeType.definition.className}.SIZEOF"

		if ( bufferParam has nullable )
			expression = "${bufferParam.name} == null ? 0 : $expression"

		if ( (param.nativeType.mapping as PrimitiveMapping).bytes < 4 )
			expression = "(${param.nativeType.javaMethodType})($expression)"

		return expression
	}
}

private fun AutoSizeTransform(bufferParam: Parameter, byteShift: String) =
	if ( byteShift == "0" ) AutoSizeTransform(bufferParam) else AutoSizeBytesTransform(bufferParam, byteShift)

private class AutoSizeBytesTransform(bufferParam: Parameter, val byteShift: String): AutoSizeTransform(bufferParam) {
	override fun transformCall(param: Parameter, original: String): String {
		var expression = "${bufferParam.name}.remaining()"
		val factor = param[AutoSize].factor
		if ( factor != null )
			expression = "($expression ${factor.expression()})"

		// Replace with expression
		expression = if ( bufferParam has nullable )
			"(${bufferParam.name} == null ? 0 : $expression) << $byteShift"
		else
			"$expression << $byteShift"

		if ( (param.nativeType.mapping as PrimitiveMapping).bytes < 4 )
			expression = "(${param.nativeType.javaMethodType})($expression)"

		return expression
	}
}

private open class AutoSizeCharSequenceTransform(val bufferParam: Parameter): FunctionTransform<Parameter> {
	override fun transformDeclaration(param: Parameter, original: String) = null // Remove the parameter
	override fun transformCall(param: Parameter, original: String): String {
		var expression = if ( bufferParam has nullable )
			"${bufferParam.name} == null ? 0 : ${bufferParam.name}Encoded.remaining()"
		else
			"${bufferParam.name}EncodedLen"

		if ( param[AutoSize].factor != null )
			expression = "$expression ${param[AutoSize].factor!!.expression()}"

		if ( (param.nativeType.mapping as PrimitiveMapping).bytes < 4 )
			expression = "(${param.nativeType.javaMethodType})($expression)"

		return expression
	}
}

private class AutoTypeParamTransform(val autoType: String): FunctionTransform<Parameter> {
	override fun transformDeclaration(param: Parameter, original: String) = null // Remove the parameter
	override fun transformCall(param: Parameter, original: String) = autoType // Replace with hard-coded type
}

private class AutoTypeParamWithSignTransform(val unsignedType: String, val signedType: String): FunctionTransform<Parameter> {
	override fun transformDeclaration(param: Parameter, original: String) = "boolean unsigned" // Replace with unsigned flag
	override fun transformCall(param: Parameter, original: String) = "unsigned ? $unsignedType : $signedType" // Replace with unsigned check
}

private class AutoTypeTargetTransform(val autoType: PointerMapping): FunctionTransform<Parameter> {
	override fun transformDeclaration(param: Parameter, original: String) = "${autoType.javaMethodType.getSimpleName()} ${param.name}"
	override fun transformCall(param: Parameter, original: String) = original
}

private val BufferOffsetTransform: FunctionTransform<Parameter> = object: FunctionTransform<Parameter>, SkipCheckFunctionTransform {
	override fun transformDeclaration(param: Parameter, original: String) = "long ${param.name}Offset"
	override fun transformCall(param: Parameter, original: String) = "${param.name}Offset"
}

private open class ExpressionTransform(
	val expression: String,
	val keepParam: Boolean = false,
	val paramTransform: FunctionTransform<Parameter>? = null
): FunctionTransform<Parameter>, SkipCheckFunctionTransform {
	override fun transformDeclaration(param: Parameter, original: String) =
		if ( keepParam ) paramTransform?.transformDeclaration(param, original) ?: original else null
	override fun transformCall(param: Parameter, original: String) = expression
}

private class ExpressionLocalTransform(
	expression: String,
	keepParam: Boolean = false
): ExpressionTransform(expression, keepParam), PreFunctionTransform<Parameter>, SkipCheckFunctionTransform {
	override fun transformCall(param: Parameter, original: String) = original
	override fun preprocess(qtype: Parameter, writer: PrintWriter) = writer.println("\t\t${qtype.asJavaMethodParam} = $expression;")
}

private class CharSequenceTransform(
	val nullTerminated: Boolean
): FunctionTransform<Parameter>, APIBufferFunctionTransform<Parameter> {
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

private val StringReturnTransform = object: FunctionTransform<ReturnValue> {
	override fun transformDeclaration(param: ReturnValue, original: String) = "String"
	override fun transformCall(param: ReturnValue, original: String): String {
		val expression = if ( original.startsWith("memByteBufferNT") )
			original.substring(17, original.length() - 1);
		else
			original
		return "memDecode${(param.nativeType as CharSequenceType).charMapping.charset}($expression)";
	}
}

private class BufferValueReturnTransform(
	val bufferType: String,
	val paramName: String
): FunctionTransform<ReturnValue>, APIBufferFunctionTransform<ReturnValue> {
	override fun transformDeclaration(param: ReturnValue, original: String) = if ( bufferType == "pointer" ) "long" else bufferType // Replace void with the buffer value type
	override fun transformCall(param: ReturnValue, original: String) = "\t\treturn $API_BUFFER.${bufferType}Value($paramName);" // Replace with value from APIBuffer
	override fun setupAPIBuffer(func: Function, qtype: ReturnValue, writer: PrintWriter) = writer.println("\t\tint $paramName = $API_BUFFER.${bufferType}Param();")
}

private val BufferValueParameterTransform: FunctionTransform<Parameter> = object: FunctionTransform<Parameter>, SkipCheckFunctionTransform {
	override fun transformDeclaration(param: Parameter, original: String) = null // Remove the parameter
	override fun transformCall(param: Parameter, original: String) = "$API_BUFFER.address(${param.name})" // Replace with APIBuffer address + offset
}

private val BufferValueSizeTransform = object: FunctionTransform<Parameter> {
	override fun transformDeclaration(param: Parameter, original: String) = null // Remove the parameter
	override fun transformCall(param: Parameter, original: String) = "1" // Replace with 1
}

private class SingleValueTransform(
	val paramType: String,
	val elementType: String,
	val newName: String
): FunctionTransform<Parameter>, APIBufferFunctionTransform<Parameter>, SkipCheckFunctionTransform {
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

private class VectorValueTransform(
	val paramType: String,
	val elementType: String,
	val newName: String,
	val size: Int
): FunctionTransform<Parameter>, APIBufferFunctionTransform<Parameter>, SkipCheckFunctionTransform {
	override fun transformDeclaration(param: Parameter, original: String) = size.indices.map { "$paramType ${newName}$it" }.reduce { a, b -> "$a, $b" } // Replace with vector elements
	override fun transformCall(param: Parameter, original: String) = "$API_BUFFER.address(${param.name})" // Replace with APIBuffer address + offset
	override fun setupAPIBuffer(func: Function, qtype: Parameter, writer: PrintWriter) {
		writer.println("\t\tint ${qtype.name} = $API_BUFFER.${elementType}Param(${newName}0);")
		for ( i in 1..(size - 1) )
			writer.println("\t\t$API_BUFFER.${elementType}Param(${newName}$i);")
	}
}

private val MapPointerTransform = object: FunctionTransform<ReturnValue> {
	override fun transformDeclaration(param: ReturnValue, original: String) = "ByteBuffer" // Return a ByteBuffer
	override fun transformCall(param: ReturnValue, original: String) = """int $MAP_LENGTH = ${param[MapPointer].sizeExpression};
		return old_buffer != null && $RESULT == memAddress0(old_buffer) && old_buffer.capacity() == $MAP_LENGTH ? old_buffer : memByteBuffer($RESULT, $MAP_LENGTH);"""
}

private class MapPointerExplicitTransform(val lengthParam: String, val addParam: Boolean = true): FunctionTransform<ReturnValue> {
	override fun transformDeclaration(param: ReturnValue, original: String) = "ByteBuffer" // Return a ByteBuffer
	override fun transformCall(param: ReturnValue, original: String) =
		"old_buffer != null && $RESULT == memAddress0(old_buffer) && old_buffer.capacity() == $lengthParam ? old_buffer : memByteBuffer($RESULT, (int)$lengthParam)"
}

private val BufferReturnLengthTransform: FunctionTransform<Parameter> = object: FunctionTransform<Parameter>, APIBufferFunctionTransform<Parameter>, SkipCheckFunctionTransform {
	override fun transformDeclaration(param: Parameter, original: String) = null // Remove the parameter
	override fun transformCall(param: Parameter, original: String) = "$API_BUFFER.address(${param.name})" // Replace with APIBuffer address + offset
	override fun setupAPIBuffer(func: Function, qtype: Parameter, writer: PrintWriter) = writer.println("\t\tint ${qtype.name} = $API_BUFFER.intParam();")
}

private val BufferReturnParamTransform: FunctionTransform<Parameter> = object: FunctionTransform<Parameter>, APIBufferFunctionTransform<Parameter>, SkipCheckFunctionTransform {
	override fun transformDeclaration(param: Parameter, original: String) = null // Remove the parameter
	override fun transformCall(param: Parameter, original: String) = "$API_BUFFER.address(${param.name})" // Replace with APIBuffer address + offset
	override fun setupAPIBuffer(func: Function, qtype: Parameter, writer: PrintWriter) {
		val mapping = qtype.nativeType.mapping as PointerMapping

		val autoSizeParam = func.getParam { it has AutoSize && it[AutoSize].hasReference(qtype.name) }
		writer.print("\t\tint ${qtype.name} = $API_BUFFER.bufferParam(${if ( 4 < (autoSizeParam.nativeType.mapping as PrimitiveMapping).bytes) "(int)" else ""}${autoSizeParam.name}")
		if ( mapping.isMultiByte )
			writer.print(" << ${mapping.byteShift}")
		writer.println(");")
	}
}

private class BufferReturnTransform(
	val outParam: Parameter,
	val lengthParam: String,
	val encoding: String? = null
): FunctionTransform<ReturnValue> {

	private val bufferType: String
		get() = (outParam.nativeType.mapping as PointerMapping).javaMethodType.getSimpleName()

	override fun transformDeclaration(param: ReturnValue, original: String) = if ( encoding == null) bufferType else "String"
	override fun transformCall(param: ReturnValue, original: String): String {
		val builder = StringBuilder(64)

		builder append "\t\treturn "
		if ( encoding != null ) builder append "memDecode$encoding("
		builder append "mem${bufferType}($API_BUFFER.address(${outParam.name}), $API_BUFFER.intValue($lengthParam))"
		if ( encoding != null ) builder append ")"
		builder append ";"

		return builder.toString()
	}
}

private class BufferReturnNTTransform(
	val outParam: Parameter,
	val maxLengthParam: String,
	val encoding: String
): FunctionTransform<ReturnValue> {
	override fun transformDeclaration(param: ReturnValue, original: String) = "String"
	override fun transformCall(param: ReturnValue, original: String): String =
		"\t\treturn memDecode$encoding(memByteBufferNT${(outParam.nativeType as CharSequenceType).charMapping.bytes}($API_BUFFER.address(${outParam.name}), $maxLengthParam));"
}

private class PointerArrayTransform(val paramType: String): FunctionTransform<Parameter>, APIBufferFunctionTransform<Parameter> {
	override fun transformDeclaration(param: Parameter, original: String): String? {
		val name = if ( paramType.isEmpty() ) param[PointerArray].singleName else param.name
		val paramClass = if ( param[PointerArray].elementType is CharSequenceType ) "CharSequence" else "ByteBuffer"
		return "$paramClass$paramType $name"
	}
	override fun transformCall(param: Parameter, original: String) = "$API_BUFFER.address(${param.name}$POINTER_POSTFIX)" // Replace with APIBuffer address + offset
	override fun setupAPIBuffer(func: Function, qtype: Parameter, writer: PrintWriter) = writer.setupAPIBufferImpl(qtype)

	private fun PrintWriter.setupAPIBufferImpl(param: Parameter) {
		val pointerArray = param[PointerArray]
		val elementType = pointerArray.elementType
		val nullTerminate = pointerArray.lengthsParam == null

		if ( !paramType.isEmpty() ) {
			println("\t\tint ${param.name}$POINTER_POSTFIX = $API_BUFFER.bufferParam(${param.name}.length << POINTER_SHIFT);")

			// Create a local array that will hold the encoded CharSequences. We need this to avoid premature GC of the passed buffers.
			if ( elementType is CharSequenceType )
				println("\t\tByteBuffer[] ${param.name}$BUFFERS_POSTFIX = new ByteBuffer[${param.name}.length];")

			println("\t\tfor ( int i = 0; i < ${param.name}.length; i++ )")
			print("\t\t\t$API_BUFFER.pointerParam(${param.name}$POINTER_POSTFIX, i, memAddress(")
			if ( elementType is CharSequenceType )
				print("${param.name}$BUFFERS_POSTFIX[i] = memEncode${elementType.charMapping.charset}(") // Encode and store
			print("${param.name}[i]")
			if ( elementType is CharSequenceType )
				print(", $nullTerminate)")
			println("));")
		} else {
			// Store the encoded CharSequence buffer in a local var to avoid premature GC.
			if ( elementType is CharSequenceType )
				println("\t\tByteBuffer ${pointerArray.singleName}$BUFFERS_POSTFIX = memEncode${elementType.charMapping.charset}(${param[PointerArray].singleName}, $nullTerminate);") // Encode and store

			print("\t\tint ${param.name}$POINTER_POSTFIX = $API_BUFFER.pointerParam(memAddress(${pointerArray.singleName}")
			if ( elementType is CharSequenceType )
				print(BUFFERS_POSTFIX)
			println("));")
		}
	}
}
private val PointerArrayTransformSingle = PointerArrayTransform("")
private val PointerArrayTransformArray = PointerArrayTransform("[]")
private val PointerArrayTransformVararg = PointerArrayTransform("...")

private class PointerArrayLengthsTransform(
	val arrayParam: Parameter,
	val multi: Boolean
): FunctionTransform<Parameter>, APIBufferFunctionTransform<Parameter>, SkipCheckFunctionTransform {
	override fun transformDeclaration(param: Parameter, original: String) = null // Remove the parameter
	override fun transformCall(param: Parameter, original: String) = "$API_BUFFER.address(${arrayParam.name}$LENGTHS_POSTFIX)" // Replace with APIBuffer address + offset
	override fun setupAPIBuffer(func: Function, qtype: Parameter, writer: PrintWriter) = writer.setupAPIBufferImpl(qtype)

	private fun PrintWriter.setupAPIBufferImpl(param: Parameter) {
		val pointerArray = arrayParam[PointerArray]
		val elementType = pointerArray.elementType

		val lengthType = PointerMapping.primitiveMap[param.nativeType.mapping]

		if ( multi ) {
			val byteShift = (param.nativeType.mapping as PointerMapping).byteShift
			println("\t\tint ${arrayParam.name}$LENGTHS_POSTFIX = $API_BUFFER.bufferParam(${arrayParam.name}.length << $byteShift);")

			println("\t\tfor ( int i = 0; i < ${arrayParam.name}.length; i++ )")
			print("\t\t\t$API_BUFFER.${lengthType}Param(${arrayParam.name}$LENGTHS_POSTFIX, i, ${arrayParam.name}[i]")
			print(
				if ( elementType is CharSequenceType )
					".length()"
				else
					".remaining()"
			)
			println(");")
		} else {
			print("\t\tint ${arrayParam.name}$LENGTHS_POSTFIX = $API_BUFFER.${lengthType}Param(${pointerArray.singleName}")
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

private val CallbackTransform = object: FunctionTransform<Parameter> {
	override fun transformDeclaration(param: Parameter, original: String) = "${param[Callback].procClass} ${param.name}" // Replace type with the callback class
	override fun transformCall(param: Parameter, original: String): String {
		// Replace with callback function address
		val procClass = param[Callback].procClass;

		return if ( param has nullable )
			"${param.name} == null ? NULL : $procClass.Util.CALLBACK"
		else
			"$procClass.Util.CALLBACK"
	}
}