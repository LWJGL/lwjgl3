/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

/** Super class of Parameter and ReturnValue with common helper properties. */
abstract class QualifiedType(
	val nativeType: NativeType
): TemplateElement() {

	override val isSpecial: Boolean
		get() = isBufferPointer || super.isSpecial

	val isBufferPointer: Boolean
		get() = nativeType is PointerType && nativeType.mapping != PointerMapping.OPAQUE_POINTER

	val javaMethodType: String
		get() = when {
			nativeType is ObjectType                  -> nativeType.className
			nativeType.mapping == PointerMapping.DATA -> "ByteBuffer"
			else                                      -> nativeType.javaMethodType.getSimpleName()
		}

	val nativeMethodType: String
		get() = nativeType.nativeMethodType.getSimpleName()

	val jniFunctionType: String
		get() = nativeType.jniFunctionType

	val toNativeType: String
		get() {
			val builder = StringBuilder()
			if ( has(const) )
				builder append "const "
			builder.append(nativeType.name)
			if ( nativeType is PointerType && !nativeType.includesPointer ) {
				if ( !nativeType.name.endsWith('*') )
					builder append ' '
				builder append '*'
			}

			return builder.toString()
		}

}

class ReturnValue(nativeType: NativeType): QualifiedType(nativeType) {

	override fun hashCode() = RESULT.hashCode()

	override fun equals(other: Any?) = other identityEquals this || (other is ReturnValue && other.nativeType == this.nativeType)

	// --- [ Helper functions & properties ] ---

	val isVoid: Boolean
		get() = nativeType.mapping == TypeMapping.VOID

}

enum class ParameterType {
	IN
	OUT
	INOUT
}

class Parameter(
	nativeType: NativeType,
	val name: String,
	val paramType: ParameterType = ParameterType.IN,
	documentation: String,
	links: String = ""
): QualifiedType(nativeType) {

	val documentation = if ( links.isEmpty() ) documentation else doc(documentation, links)

	override fun hashCode() = name.hashCode()

	override fun equals(other: Any?) = other identityEquals this || (other is Parameter && other.name equals this.name)

	private fun doc(description: String, links: String): String {
		val trimmed = description.trim()
		val builder = StringBuilder(trimmed.size + 16 + links.size) // Rough estimate to reduce mallocs. TODO: validate
		builder append trimmed
		if ( !trimmed.endsWith('.') )
			builder append '.'

		builder append if ( links.count { it == '@' } == 1 )
			" Must be:"
		else
			" One of:"
		builder append "<p/>"
		builder append links

		return builder.toString()
	}

	// --- [ Helper functions & properties ] ----

	override val isSpecial: Boolean
		get() = nativeType.mapping == PointerMapping.OPAQUE_POINTER || super.isSpecial

	/** Returns true if this is an output parameter with the autoSizeResult modifier. */
	val isAutoSizeResultOut: Boolean
		get() = paramType == ParameterType.OUT && has(autoSizeResult)

	val asJavaMethodParam: String
		get() = "$javaMethodType $name"

	val asNativeMethodParam: String
		get() = "$nativeMethodType $name"

	fun asNativeMethodCallParam(func: NativeClassFunction, mode: GenerationMode) = when {
	// Data pointer
		nativeType is PointerType && (nativeType : PointerType).mapping != PointerMapping.OPAQUE_POINTER
		                         -> {
			if ( isAutoSizeResultOut && (func.returns.nativeType !is StructType || func.returnsStructValue) )
				"$API_BUFFER.address() + $name"
			else if ( has(nullable) || (has(optional) && mode == GenerationMode.NORMAL) )
				"memAddressSafe($name)"
			else
				"memAddress($name)"
		}

	// Object parameter
		nativeType is ObjectType -> if ( has(nullable) ) "$name == null ? NULL : $name.getPointer()" else "$name.getPointer()"

	// Normal parameter
		else                     -> name
	}

	val asJNIFunctionParam: String
		get() {
			val name = if ( nativeType.mapping is PointerMapping )
				"$name$POINTER_POSTFIX"
			else
				name

			return "$jniFunctionType $name"
		}

}

// DSL extensions

fun ReturnValueModifier._(returnType: NativeType): ReturnValue {
	val returns = ReturnValue(returnType)
	returns.setModifiers(this)
	return returns
}

fun QualifiedTypeModifier._(returnType: NativeType): ReturnValue {
	val returns = ReturnValue(returnType)
	returns.setModifiers(this)
	return returns
}

fun Array<TemplateModifier>._(returnType: NativeType): ReturnValue {
	val returns = ReturnValue(returnType)
	returns.setModifiers(*this)
	return returns
}