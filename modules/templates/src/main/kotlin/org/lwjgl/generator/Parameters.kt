/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

import org.lwjgl.generator.LinkMode.*
import org.lwjgl.generator.ParameterType.IN
import org.lwjgl.generator.ParameterType.OUT
import java.util.regex.Pattern

/** Super class of Parameter and ReturnValue with common helper properties. */
abstract class QualifiedType(
	val nativeType: NativeType
) : TemplateElement() {

	override val isSpecial: Boolean
		get() = isBufferPointer || super.isSpecial

	val isBufferPointer: Boolean
		get() = nativeType.isPointerData

	val javaMethodType: String
		get() = when {
			nativeType is ObjectType -> nativeType.className
			nativeType is StructType -> nativeType.definition.className
			nativeType.mapping === PointerMapping.DATA
			                         -> "ByteBuffer"
			else                     -> nativeType.javaMethodType.simpleName
		}

	val nativeMethodType: String
		get() = nativeType.nativeMethodType.simpleName

	val jniFunctionType: String
		get() = nativeType.jniFunctionType

	fun toNativeType(binding: APIBinding?, pointerMode: Boolean = false): String {
		val builder = StringBuilder()

		if ( has(const) )
			builder.append("const ")

		if ( binding == null || this === JNI_ENV || (nativeType is StructType && !nativeType.includesPointer) ) {
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
					jniFunctionType
			)
		}

		return builder.toString()
	}

}

class ReturnValue(nativeType: NativeType) : QualifiedType(nativeType) {

	override fun hashCode() = RESULT.hashCode()

	override fun equals(other: Any?) = other === this || (other is ReturnValue && other.nativeType == this.nativeType)

	// --- [ Helper functions & properties ] ---

	val isVoid: Boolean
		get() = nativeType.mapping === TypeMapping.VOID

}

enum class ParameterType {
	IN,
	OUT,
	INOUT
}

enum class LinkMode {
	SINGLE {
		override fun print(multi: Boolean): String = if ( multi ) " One of:" else " Must be:"
	},

	SINGLE_CNT {
		override fun print(multi: Boolean): String = if ( multi ) " one of:" else " must be:"
	},

	BITFIELD {
		override fun print(multi: Boolean): String = " One or more of:"
	},

	BITFIELD_CNT {
		override fun print(multi: Boolean): String = " one or more of:"
	};

	abstract fun print(multi: Boolean): String
}

class Parameter(
	nativeType: NativeType,
	val name: String,
	val paramType: ParameterType = IN,
	documentation: String,
	links: String,
	linkMode: LinkMode
) : QualifiedType(nativeType) {

	companion object {
		val LINK_SPLIT = Pattern.compile("\\s+")
	}

	val documentation = if ( links.isEmpty() ) documentation else doc(documentation, links, linkMode)

	override fun hashCode() = name.hashCode()

	override fun equals(other: Any?) = other === this || (other is Parameter && other.name.equals(this.name))

	private fun doc(description: String, links: String, linkMode: LinkMode): String {
		val trimmed = description.trim()
		val builder = StringBuilder(trimmed.length + 16 + links.length) // Rough estimate to reduce mallocs. TODO: validate

		val effectiveLinkMode: LinkMode
		if ( trimmed.isEmpty() ) {
			effectiveLinkMode = when ( linkMode ) {
				SINGLE   -> SINGLE_CNT
				BITFIELD -> BITFIELD_CNT
				else     -> linkMode
			}
		} else {
			effectiveLinkMode = linkMode
			builder.append(trimmed)
			if ( linkMode == SINGLE || linkMode == BITFIELD ) {
				if ( !trimmed.endsWith('.') )
					builder.append('.')
			}
		}

		builder.append(effectiveLinkMode.print(links.any { Character.isWhitespace(it) }))
		builder.append("<br>")
		builder.append(LINK_SPLIT.matcher(links.trim()).replaceAll(", "))

		return builder.toString()
	}

	// --- [ Helper functions & properties ] ----

	override val isSpecial: Boolean
		get() = (nativeType.mapping === PointerMapping.OPAQUE_POINTER && (nativeType is ObjectType || !has(nullable)) && this !== JNI_ENV) || super.isSpecial

	/** Returns true if this is an output parameter with the AutoSizeResult modifier. */
	val isAutoSizeResultOut: Boolean
		get() = paramType === OUT && has(AutoSizeResult)

	val asNativeMethodParam: String
		get() = "$nativeMethodType $name"

	fun asNativeMethodCallParam(func: NativeClassFunction, mode: GenerationMode) = when {
	// Object parameter
		nativeType is StructType || nativeType is ObjectType
		                         ->
			if ( has(nullable) )
				"$name == null ? NULL : $name.$ADDRESS"
			else if ( nativeType is ObjectType && func.hasUnsafeMethod && func.nativeClass.binding!!.hasParameterCapabilities )
				name
			else
				"$name.$ADDRESS"

	// Data pointer
		nativeType.isPointerData -> {
			if ( !isAutoSizeResultOut && (has(nullable) || (has(optional) && mode === GenerationMode.NORMAL)) )
				"memAddressSafe($name)"
			else
				"memAddress($name)"
		}

	// Normal parameter
		else                     -> name
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