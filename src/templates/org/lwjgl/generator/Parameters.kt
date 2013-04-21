/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

import java.util.regex.Pattern

/** Super class of Parameter and ReturnValue with common helper properties. */
abstract class QualifiedType(
	val nativeType: NativeType
): TemplateElement() {

	override val isSpecial: Boolean
		get() = isBufferPointer || super.isSpecial

	val isBufferPointer: Boolean
		get() = nativeType is PointerType && nativeType.mapping != PointerMapping.NAKED_POINTER

	val javaMethodType: String
		get() = when {
			nativeType is ObjectType -> nativeType.className
			nativeType.mapping == PointerMapping.DATA -> "ByteBuffer"
			else -> nativeType.javaMethodType.getSimpleName()
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

public class ReturnValue(nativeType: NativeType): QualifiedType(nativeType) {

	public fun hashCode(): Int = RESULT.hashCode()

	public fun equals(obj: Any?): Boolean {
		if ( obj == this ) return true
		return obj is ReturnValue && obj.nativeType == this.nativeType
	}

	// --- [ Helper functions & properties ] ---

	val isVoid: Boolean
		get() = nativeType.mapping == TypeMapping.VOID

}

public enum class ParameterType {
	IN
	OUT
	INOUT
}

private val LINK_PATTERN = Pattern.compile("\\s+", Pattern.MULTILINE)

public class Parameter(
	nativeType: NativeType,
	val name: String,
	val paramType: ParameterType = ParameterType.IN,
	documentation: String,
	links: String = ""
): QualifiedType(nativeType) {

	val documentation: String = if ( links.isEmpty() ) documentation else doc(documentation, links)

	public fun hashCode(): Int = name.hashCode()

	public fun equals(obj: Any?): Boolean {
		if ( obj == this ) return true
		return obj is Parameter && obj.name equals this.name
	}

	private fun doc(description: String, links: String): String {
		val trimmed = description.trim()
		val builder = StringBuilder(trimmed.size + 16 + links.size * 2) // Rough estimate to reduce mallocs.
		builder append trimmed
		if ( !trimmed.endsWith('.') )
			builder append '.'

		builder append if ( links.indexOf(' ') == -1 )
			" Must be:"
		else
			" One of:"
		builder append "<p/>"

		val tokens = LINK_PATTERN.split(links.trim())
		for ( i in tokens.indices ) {
			if ( 0 < i ) builder append ", "

			if ( tokens[i].indexOf('#') == -1 ) {
				builder append tokens[i]
			} else {
				val classLink = tokens[i].startsWith("##")
				if ( classLink ) builder append "see "

				builder append "{@link "
				if ( classLink )
					builder append tokens[i].substring(2)
				else
					builder append tokens[i]
				builder append "}"
			}
		}

		return builder.toString()
	}

	// --- [ Helper functions & properties ] ----

	override val isSpecial: Boolean
		get() = nativeType.mapping == PointerMapping.NAKED_POINTER || super.isSpecial

	val asJavaMethodParam: String
		get() = "$javaMethodType $name"

	val asNativeMethodParam: String
		get() = "$nativeMethodType $name"

	fun asNativeMethodCallParam(func: NativeClassFunction, mode: GenerationMode) = when {
	// Data pointer
		nativeType is PointerType && (nativeType : PointerType).mapping != PointerMapping.NAKED_POINTER -> {
			if ( has(autoSizeResult) && (func.returns.nativeType !is StructType || func.returnsStructValue) )
				"$API_BUFFER.address() + $name"
			else if ( has(nullable) || (has(optional) && mode == GenerationMode.NORMAL) )
				"memAddressSafe($name)"
			else
				"memAddress($name)"
		}

	// Object parameter
		nativeType is ObjectType -> if ( has(nullable) ) "$name == null ? 0L : $name.getPointer()" else "$name.getPointer()"

	// Normal parameter
		else -> name
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

public fun ReturnValueModifier._(returnType: NativeType): ReturnValue {
	val returns = ReturnValue(returnType)
	returns.setModifiers(this)
	return returns
}

public fun QualifiedTypeModifier._(returnType: NativeType): ReturnValue {
	val returns = ReturnValue(returnType)
	returns.setModifiers(this)
	return returns
}

public fun Array<TemplateModifier>._(returnType: NativeType): ReturnValue {
	val returns = ReturnValue(returnType)
	returns.setModifiers(*this)
	return returns
}

// --- [ MODIFIERS ]---

// General

/** Marks the function parameter or return value as const. */
public val const: QualifiedTypeModifier = object : QualifiedTypeModifier() {
	override val isSpecial: Boolean = false
	override fun validate(qtype: QualifiedType) {
		if ( qtype.nativeType !is PointerType )
			throw IllegalArgumentException("The const modifier can only be applied on pointer types.")

		if ( qtype is Parameter && qtype.paramType != ParameterType.IN )
			throw IllegalArgumentException("The const modifier can only be applied on input parameters.")
	}
}

// Parameter

public val virtual: ParameterModifier = object : ParameterModifier() {
	override val isSpecial: Boolean = false
}

/** Marks the parameter to be replaced with .remaining() on the buffer parameter specified by reference. */
public class AutoSize(override val reference: String, vararg val dependent: String): ParameterModifier(), ReferenceModifier {
	class object: ModifierObject<AutoSize> {
		override val key = javaClass<AutoSize>()
	}

	override val isSpecial: Boolean = true

	/** If not null, the expression will be appended to the parameter. */
	var expression: String? = null
	/** If true, the parameter expects a size in bytes, so proper scaling will be applied based on the referenced buffer type. */
	var toBytes: Boolean = false

	public fun expression(expression: String): AutoSize {
		this.expression = expression
		return this
	}

	public fun toBytes(): AutoSize {
		this.toBytes = true
		return this
	}

	public fun hasReference(reference: String): Boolean = this.reference == reference || dependent.any { it == reference }

	override fun validate(param: Parameter) {
		if ( param.paramType == ParameterType.OUT )
			throw IllegalArgumentException("The AutoSize modifier can only be applied on input parameters.")

		when ( param.nativeType.mapping ) {
			PrimitiveMapping.INT,
			PrimitiveMapping.PTR -> {
			}
			else -> {
				throw IllegalArgumentException("The AutoSize modifier can only be applied on integer primitive types.")
			}
		}
	}
}

public val autoSizeResult: ParameterModifier = object : ParameterModifier() {
	override val isSpecial: Boolean = true
	override protected fun validate(param: Parameter) {
		if ( param.paramType == ParameterType.IN )
			throw IllegalArgumentException("The autoSizeResult modifier can only be applied on output parameters.")

		when ( param.nativeType.mapping ) {
			PointerMapping.DATA_INT,
			PointerMapping.DATA_POINTER -> {
			}
			else -> {
				throw IllegalArgumentException("The autoSizeResult modifier can only be applied on integer pointer types.")
			}
		}
	}
}

/** Adds a capacity check to a buffer parameter. */
public class Check(
	/** An integer expression to validate against the buffer capacity. */
	val expression: String,
	/** If the expression value is in bytes rather in elements (of the buffer type). */
	val bytes: Boolean = false,
	/** If true, the check will only be performed in debug mode. Useful for expensive checks. */
	val debug: Boolean = false
): ParameterModifier() {
	class object: ModifierObject<Check> {
		override val key = javaClass<Check>()
	}

	override val isSpecial: Boolean = true
	override protected fun validate(param: Parameter) {
		if ( param.nativeType !is PointerType )
			throw IllegalArgumentException("The Check modifier can only be applied on pointer types.")

		if ( param.nativeType.mapping == PointerMapping.NAKED_POINTER )
			throw IllegalArgumentException("The Check modifier cannot be applied on naked pointer types.")
	}
}
public fun Check(value: Int): Check = Check(Integer.toString(value))

class Nullable internal(val optional: Boolean): ParameterModifier() {
	class object: ModifierObject<Nullable> {
		override val key = javaClass<Nullable>()
	}

	override val isSpecial: Boolean = true
	override protected fun validate(param: Parameter) {
		if ( param.nativeType !is PointerType )
			throw IllegalArgumentException("The nullable modifier can only be applied on pointer types.")
	}
}
/** Marks a pointer parameter as nullable. */
public val nullable: Nullable = Nullable(false)
/** Marks a pointer parameter as optional. Similar to nullable, but the parameter either doesn't exist or it exists and is not null. */
public val optional: Nullable = Nullable(true)

/** Marks a buffer parameter as null-terminated. */
public val nullTerminated: TemplateModifier = object : ParameterModifier() {
	override val isSpecial: Boolean = true
	override protected fun validate(param: Parameter) {
		if ( param.nativeType !is PointerType )
			throw IllegalArgumentException("The NullTerminated modifier can only be applied on pointer types.")

		if ( param.nativeType.mapping == PointerMapping.NAKED_POINTER )
			throw IllegalArgumentException("The NullTerminated modifier cannot be applied on naked pointer types.")
	}
}

/** Marks a parameter to be replaced with an expression. */
public class Expression(
	/** The expression to use instead of the parameter name. */
	val value: String,
	/** If true, the parameter will not be removed from the method signature. */
	val keepParam: Boolean = false
): ParameterModifier() {
	class object: ModifierObject<Expression> {
		override val key = javaClass<Expression>()
	}

	override val isSpecial: Boolean = true
}

/** Like AutoType, but with a hard-coded list of types. See glTexImage2D for an example. */
public class MultiType(vararg val types: PointerMapping): ParameterModifier() {
	class object: ModifierObject<MultiType> {
		override val key = javaClass<MultiType>()
	}

	{
		if ( types.isEmpty() )
			throw IllegalArgumentException("No buffer types specified.")

		if ( types.any { it.byteShift == null } )
			throw IllegalArgumentException("The MultiType modifier can only be applied with concrete PointerMappings.")
	}

	override val isSpecial: Boolean = true
	override protected fun validate(param: Parameter) {
		if ( param.nativeType !is PointerType )
			throw IllegalArgumentException("The MultiType modifier can only be applied on pointer types.")

		if ( param.nativeType.mapping == PointerMapping.NAKED_POINTER )
			throw IllegalArgumentException("The MultiType modifier cannot be applied on naked pointer types.")
	}

}

/** Marks a char pointer parameter to become the return value of an alternative method. */
public class Return(
	/** The parameter that defines the maximum string size. */
	val maxLengthParam: String,
	/** The parameter that returns the actual string size */
	val lengthParam: String,
	/** An expression that defines the maxLength value. If defined an additional alternative method will be generated. */
	val maxLengthExpression: String? = null
): ParameterModifier() {
	class object: ModifierObject<Return> {
		override val key = javaClass<Return>()
	}

	override val isSpecial: Boolean = true
	override protected fun validate(param: Parameter) {
		if ( param.nativeType !is PointerType )
			throw IllegalArgumentException("The returnValue modifier can only be applied on pointer types.")

		if ( param.nativeType.mapping == PointerMapping.NAKED_POINTER )
			throw IllegalArgumentException("The returnValue modifier cannot be applied on naked pointer types.")

		if ( param.paramType != ParameterType.OUT )
			throw IllegalArgumentException("The returnValue modifier can only be applied on output parameters.")
	}
}
/** Used for simple return values. */
public val returnValue: Return = Return("", "")

/** Marks a buffer parameter to transform to a single element value in an alternative method. */
public class SingleValue(val newName: String): ParameterModifier() {
	class object: ModifierObject<SingleValue> {
		override val key = javaClass<SingleValue>()
	}

	override val isSpecial: Boolean = true
	override protected fun validate(param: Parameter) {
		if ( param.nativeType !is PointerType )
			throw IllegalArgumentException("The SingleValue modifier can only be applied on pointer types.")

		if ( param.nativeType.mapping == PointerMapping.NAKED_POINTER )
			throw IllegalArgumentException("The SingleValue modifier cannot be applied on naked pointer types.")

		if ( param.paramType != ParameterType.IN )
			throw IllegalArgumentException("The SingleValue modifier can only be applied on input parameters.")
	}
}

/** Marks a pointer parameter as an array of pointers. */
public class PointerArray(
	/** The array element type. */
	val elementType: PointerType,
	/** The single version parameter name. */
	val singleName: String,
	/** The parameter that defines that number of pointers in the array */
	val countParam: String,
	/** The parameter that defines the data legth of each element in the array. If null, the elements are assumed to be null-terminated. */
	val lengthsParam: String? = null
): ParameterModifier() {
	class object: ModifierObject<PointerArray> {
		override val key = javaClass<PointerArray>()
	}

	override val isSpecial: Boolean = true
	override protected fun validate(param: Parameter) {
		if ( param.nativeType !is PointerType )
			throw IllegalArgumentException("The PointerArray modifier can only be applied on pointer types.")

		if ( param.nativeType.mapping != PointerMapping.DATA_POINTER )
			throw IllegalArgumentException("The PointerArray modifier can only be applied on pointer-to-pointer types.")

		if ( param.paramType != ParameterType.IN )
			throw IllegalArgumentException("The PointerArray modifier can only be applied on input parameters.")
	}
}

public class Callback(val procClass: String, val storeInFunctions: Boolean = false): ParameterModifier() {
	class object: ModifierObject<Callback> {
		override val key = javaClass<Callback>()
	}

	override val isSpecial: Boolean = true
	override protected fun validate(param: Parameter) {
		if ( param.nativeType !is PointerType || param.nativeType.mapping != PointerMapping.NAKED_POINTER )
			throw IllegalArgumentException("The Callback modifier can only be applied on naked pointer types.")

		if ( param.paramType != ParameterType.IN )
			throw IllegalArgumentException("The Callback modifier can only be applied on input parameters.")
	}
}

// ReturnValue

/** Marks a return value as a pointer that should be mapped (wrapped in a ByteBuffer of some capacity). */
public class MapPointer(
	/** An expression that defines the ByteBuffer capacity. */
	val sizeExpression: String
): ReturnValueModifier() {
	class object: ModifierObject<MapPointer> {
		override val key = javaClass<MapPointer>()
	}

	override val isSpecial: Boolean = true
	override protected fun validate(returns: ReturnValue) {
		if ( returns.nativeType !is PointerType )
			throw IllegalArgumentException("The MapPointer modifier can only be applied on pointer types.")

		if ( returns.nativeType.mapping != PointerMapping.DATA )
			throw IllegalArgumentException("The MapPointer modifier can only be applied on void pointer types.")
	}
}

public class Construct(
	val firstArg: String, // Makes the user specify at least one, else the modifier is pointless
	vararg val otherArgs: String
): ReturnValueModifier() {
	class object: ModifierObject<Construct> {
		override val key = javaClass<Construct>()
	}

	override val isSpecial: Boolean = true
	override protected fun validate(returns: ReturnValue) {
		if ( returns.nativeType !is ObjectType )
			throw IllegalArgumentException("The Construct modifier can only be applied on object types.")
	}
}