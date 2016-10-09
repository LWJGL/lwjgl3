/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator

import org.lwjgl.generator.ParameterType.IN
import org.lwjgl.generator.ParameterType.OUT

/** Super class of Parameter and ReturnValue with common helper properties. */
abstract class QualifiedType(
	val nativeType: NativeType
) : TemplateElement() {

	override val isSpecial: Boolean
		get() = isBufferPointer || super.isSpecial

	internal val isBufferPointer: Boolean
		get() = nativeType.isPointerData

	internal val javaMethodType: String
		get() = nativeType.javaMethodType

	internal val isStructValue: Boolean
		get() = nativeType is StructType && !nativeType.includesPointer

	internal fun toNativeType(binding: APIBinding?, pointerMode: Boolean = false): String {
		val builder = StringBuilder()

		if ( has(const) )
			builder.append("const ")

		if ( binding == null || this === JNI_ENV || isStructValue ) {
			builder.append(nativeType.name)
			if ( nativeType is PointerType && !nativeType.includesPointer && (pointerMode || nativeType !is StructType) ) {
				if ( !nativeType.name.endsWith('*') )
					builder.append(' ')
				builder.append('*')
			}
		} else {
			// map everything to plain types, this avoids having to specify the native types explicitly or via #includes
			builder.append(
				if ( this.nativeType.let { it.mapping === PrimitiveMapping.POINTER || it is PointerType } )
					"intptr_t"
				else
					nativeType.jniFunctionType
			)
		}

		return builder.toString()
	}

}

class ReturnValue(nativeType: NativeType) : QualifiedType(nativeType) {

	override fun hashCode() = RESULT.hashCode()

	override fun equals(other: Any?) = other === this || (other is ReturnValue && other.nativeType == this.nativeType)

	// --- [ Helper functions & properties ] ---

	internal val isVoid: Boolean
		get() = nativeType.mapping === TypeMapping.VOID

}

enum class ParameterType {
	IN,
	OUT,
	INOUT
}

class Parameter(
	nativeType: NativeType,
	val name: String,
	val paramType: ParameterType = IN,
	documentation: String,
	links: String,
	linkMode: LinkMode
) : QualifiedType(nativeType) {

	internal val documentation = if ( links.isEmpty() ) documentation else linkMode.appendLinks(documentation, links)

	override fun hashCode() = name.hashCode()

	override fun equals(other: Any?) = other === this || (other is Parameter && other.name == this.name)

	// --- [ Helper functions & properties ] ----

	override val isSpecial: Boolean
		get() = super.isSpecial || when ( nativeType.mapping ) {
			PointerMapping.OPAQUE_POINTER -> (nativeType is ObjectType || !has(nullable)) && this !== JNI_ENV
			PrimitiveMapping.BOOLEAN4 -> true
			else -> false
		}

	/** Returns true if this is an output parameter with the AutoSizeResult modifier. */
	internal val isAutoSizeResultOut: Boolean
		get() = paramType === OUT && has(AutoSizeResultParam)

	internal fun isArrayParameter(autoSizeResultOutParams: Int) = nativeType.mapping.isArray && (!isAutoSizeResultOut || autoSizeResultOutParams != 1)

	internal fun removeArrayModifiers(): Parameter {
		if ( has(optional) && has(MultiType) )
			modifiers.remove(Nullable::class.java)

		modifiers.remove(PointerArray::class.java)
		modifiers.remove(Return::class.java)
		modifiers.remove(SingleValue::class.java)
		modifiers.remove(MultiType::class.java)

		return this
	}

	/**
	 * If this parameter has a modifier of the specified key, it replaces it with the result of the specified function.
	 *
	 * @param modKey the modifier key
	 * @param replaceWith a function that takes the current modifier and returns the new one
	 *
	 * @return this parameter
	 */
	internal fun <T : ParameterModifier> replaceModifier(modKey: ModifierKey<T>, replaceWith: (T) -> T): Parameter {
		if (this.has(modKey)) {
			val modifier = replaceWith(this[modKey])
			modifiers[modifier.javaClass] = modifier
		}
		return this
	}

}

// DSL extensions

operator fun ReturnValueModifier.rangeTo(returnType: NativeType): ReturnValue {
	val returns = ReturnValue(returnType)
	returns.setModifiers(this)
	return returns
}

operator fun QualifiedTypeModifier.rangeTo(returnType: NativeType): ReturnValue {
	val returns = ReturnValue(returnType)
	returns.setModifiers(this)
	return returns
}

operator fun Array<TemplateModifier>.rangeTo(returnType: NativeType): ReturnValue {
	val returns = ReturnValue(returnType)
	returns.setModifiers(*this)
	return returns
}