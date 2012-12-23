/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

import java.util.HashMap
import org.lwjgl.generator.opengl.BufferObject
import java.util.regex.Pattern
import java.nio.Buffer

/** A qualified type modifier. Replaces the annotations in the pre-3.0 generator. */
public trait TypeModifier {
	/** When true, this modifier requires special Java-side handling. */
	val isSpecial: Boolean

	/** Implementations should check that the specified qualified type is valid for this modifier. */
	fun validate(qtype: QualifiedType)
}

/** A TypeModifier on a parameter that references another parameter. */
public abstract class ReferenceModifier : TypeModifier {
	override val isSpecial: Boolean = true

	abstract val reference: String
}

abstract class QualifiedType(
	val nativeType: NativeType
) {

	class object {
		private val EMPTY_MODIFIERS: MutableMap<Class<out TypeModifier>, TypeModifier> = HashMap(0)
	}

	private var modifiers = EMPTY_MODIFIERS

	fun setModifiers(vararg modifiers: TypeModifier) {
		modifiers forEach {
			it.validate(this)
		}

		this.modifiers = HashMap(modifiers.size)

		modifiers.forEach {
			val old = this.modifiers.put(it.javaClass, it)
			if ( old != null )
				throw IllegalArgumentException("Parameter modifier ${it.javaClass.getSimpleName()} specified more than once.")
		}
	}

	fun has(modifier: TypeModifier) = has(modifier.javaClass)
	fun has(modifier: Class<out TypeModifier>) = modifiers.containsKey(modifier)
	fun <T: TypeModifier> get(modifier: Class<T>): T = modifiers[modifier] as T

	/** Returns true if the parameter has a ReferenceModifier with the specified reference. */
	fun hasRef(modifier: Class<out ReferenceModifier>, reference: String): Boolean {
		val mod = modifiers[modifier]
		return mod != null && (mod as ReferenceModifier).reference equals reference
	}

	fun hasSpecialModifier() = modifiers.values().find { it.isSpecial } != null

	// --- [ Helper functions & properties ] ----

	val isBufferPointer: Boolean
		get() = nativeType is PointerType && (nativeType as PointerType).mapping != PointerMapping.NAKED_POINTER

	val javaMethodType: String
		get() = when {
			nativeType is CallbackType -> nativeType.callback.name
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
				builder.append("const ")
			builder.append(nativeType.name)
			if ( nativeType is PointerType && !nativeType.includesPointer )
				builder.append(" *")

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
		val builder = StringBuilder(description.size + 16 + links.size * 2) // Rough estimate to reduce mallocs.
		builder append description
		if ( links.indexOf(' ') == -1 )
			builder append ". Must be:"
		else
			builder append ". One of:"
		builder append "<p/>"

		val tokens = LINK_PATTERN.split(links.trim())
		for ( i in tokens.indices ) {
			if ( 0 < i ) builder append ", "

			if ( tokens[i].indexOf('#') == -1 ) {
				builder append tokens[i]
			} else {
				builder append "{@link "
				builder append tokens[i]
				builder append "}"
			}
		}

		return builder.toString()
	}

	// --- [ Helper functions & properties ] ----

	val asJavaMethodParam: String
		get() = "$javaMethodType $name"

	fun asNativeMethodParam(parameters: Map<String, Parameter>): String {
		val paramType = if ( has(CallbackData.CLASS) ) {
			val functionParam = parameters[this[CallbackData.CLASS].reference]!!
			functionParam.javaMethodType
		} else
			nativeMethodType

		return "$paramType $name"
	}

	val asNativeMethodCallParam: String
		get() {
			return when {
			// Data pointer
				nativeType is PointerType && (nativeType : PointerType).mapping != PointerMapping.NAKED_POINTER -> {
					if ( has (nullable) )
						"memAddressSafe($name)"
					else
						"memAddress($name)"
				}

			// Callback functions
				nativeType is CallbackType -> "${nativeType.callback.name}.CALLBACK" // The function itself
				has(CallbackData.CLASS) -> get(CallbackData.CLASS).reference // The callback parameter

			// Normal parameter
				else -> name
			}
		}

	val asNativeFunctionParam: String
		get() {
			return if ( nativeType is PointerType && !nativeType.includesPointer )
				"$toNativeType$name"
			else
				"$toNativeType $name"
		}

	val asJNIFunctionParam: String
		get() {
			val name = if ( nativeType.mapping is PointerMapping )
				"$name$POINTER_POSTFIX"
			else
				name

			return if ( has(CallbackData.CLASS) )
				"jobject $name"
			else
				"$jniFunctionType $name"
		}

}

// DSL extensions

fun <T: QualifiedType> TypeModifier._(qtype: T): T {
	qtype.setModifiers(this)
	return qtype
}

fun TypeModifier._(nativeType: NativeType): ReturnValue {
	val returns = ReturnValue(nativeType)
	returns.setModifiers(this)
	return returns
}

fun mods(vararg modifiers: TypeModifier): Array<TypeModifier> = modifiers

fun <T: QualifiedType> Array<TypeModifier>._(qtype: T): T {
	qtype.setModifiers(*this)
	return qtype
}

fun Array<TypeModifier>._(nativeType: NativeType): ReturnValue {
	val returns = ReturnValue(nativeType)
	returns.setModifiers(*this)
	return returns
}

// --- [ MODIFIERS ]---

/** Marks the function parameter as const. */
public class Const internal(): TypeModifier {
	override val isSpecial: Boolean = false
	override fun validate(qtype: QualifiedType) {
		if ( !(qtype.nativeType is PointerType) )
			throw IllegalArgumentException("The Const modifier can only be applied on pointer types.")

		if ( qtype is Parameter && qtype.paramType != ParameterType.IN )
			throw IllegalArgumentException("The Const modifier can only be applied on input parameters.")
	}
}
public val const: Const = Const()

/** Marks the function parameter as a function callback user data parameter. */
public class CallbackData(override val reference: String): ReferenceModifier() {
	class object {
		val CLASS = javaClass<CallbackData>()
	}

	override fun validate(qtype: QualifiedType) {
		if ( !(qtype.nativeType is PointerType) || (qtype.nativeType : PointerType).mapping != PointerMapping.NAKED_POINTER )
			throw IllegalArgumentException("The CallbackData modifier can only be applied on naked pointer types.")
	}
}
/** This should only be used on the user data parameter of the CallbackFunction definition. */
public val CALLBACK_DATA: CallbackData = CallbackData("")

public class AutoSize(override val reference: String, vararg val dependent: String): ReferenceModifier() {
	class object {
		val CLASS = javaClass<AutoSize>()
	}

	var expression: String? = null

	public fun expression(expression: String): AutoSize {
		this.expression = expression
		return this
	}

	public fun hasReference(reference: String): Boolean = this.reference == reference || dependent.any { it == reference }

	override fun validate(qtype: QualifiedType) {
		when ( qtype.nativeType.mapping ) {
			PrimitiveMapping.INT,
			PrimitiveMapping.LONG -> {
			}
			else -> {
				throw IllegalArgumentException("The AutoSize modifier can only be applied on integer primitive types.")
			}
		}
	}
}

public fun Check(value: Int): Check = Check(Integer.toString(value))
public class Check(val expression: String, val canBeNull: Boolean = false, val bytes: Boolean = false): TypeModifier {
	class object {
		val CLASS = javaClass<Check>()
	}

	override val isSpecial: Boolean = true
	override fun validate(qtype: QualifiedType) {
		if ( !(qtype.nativeType is PointerType) )
			throw IllegalArgumentException("The Check modifier can only be applied on pointer types.")

		if ( (qtype.nativeType : PointerType).mapping == PointerMapping.NAKED_POINTER )
			throw IllegalArgumentException("The Check modifier cannot be applied on naked pointer types.")
	}
}

public class Nullable internal(): TypeModifier {
	class object {
		val CLASS = javaClass<Nullable>()
	}

	override val isSpecial: Boolean = true
	override fun validate(qtype: QualifiedType) {
		if ( !(qtype.nativeType is PointerType) )
			throw IllegalArgumentException("The Nullable modifier can only be applied on pointer types.")
	}
}
public val nullable: Nullable = Nullable()

public class NullTerminated internal(): TypeModifier {
	class object {
		val CLASS = javaClass<NullTerminated>()
	}

	override val isSpecial: Boolean = true
	override fun validate(qtype: QualifiedType) {
		if ( !(qtype.nativeType is PointerType) )
			throw IllegalArgumentException("The NullTerminated modifier can only be applied on pointer types.")

		if ( (qtype.nativeType : PointerType).mapping == PointerMapping.NAKED_POINTER )
			throw IllegalArgumentException("The NullTerminated modifier cannot be applied on naked pointer types.")
	}
}
public val nullTerminated: NullTerminated = NullTerminated()

public class Expression(
	/** The expression to use instead of the parameter name. */
	val value: String,
	/** If true, the parameter will not be removed from the method signature. */
	val keepParam: Boolean = false
): TypeModifier {
	class object {
		val CLASS = javaClass<Expression>()
	}

	override val isSpecial: Boolean = true
	override fun validate(qtype: QualifiedType) {
	}
}

/** Like AutoType, but with a hard-coded list of types. See glTexImage2D for an example. */
public class MultiType(vararg val types: PointerMapping): TypeModifier {
	class object {
		val CLASS = javaClass<MultiType>()
	}

	{
		if ( types.isEmpty() )
			throw IllegalArgumentException("No buffer types specified.")

		if ( types.any { it.byteShift == null } )
			throw IllegalArgumentException("The MultiType modifier can only be applied with concrete PointerMappings.")
	}

	override val isSpecial: Boolean = true
	override fun validate(qtype: QualifiedType) {
		if ( !(qtype.nativeType is PointerType) )
			throw IllegalArgumentException("The MultiType modifier can only be applied on pointer types.")

		if ( (qtype.nativeType : PointerType).mapping == PointerMapping.NAKED_POINTER )
			throw IllegalArgumentException("The MultiType modifier cannot be applied on naked pointer types.")
	}

}

public class Return internal(): TypeModifier {
	class object {
		val CLASS = javaClass<Return>()
	}

	override val isSpecial: Boolean = true
	override fun validate(qtype: QualifiedType) {
		if ( qtype !is Parameter )
			throw IllegalArgumentException("The Return modifier can only be applied on function parameters.")

		val ptype = qtype as Parameter

		if ( !(ptype.nativeType is PointerType) )
			throw IllegalArgumentException("The Return modifier can only be applied on pointer types.")

		if ( (ptype.nativeType : PointerType).mapping == PointerMapping.NAKED_POINTER )
			throw IllegalArgumentException("The Return modifier cannot be applied on naked pointer types.")

		if ( ptype.paramType != ParameterType.OUT )
			throw IllegalArgumentException("The Return modifier can only be applied on output parameters.")
	}
}
public val returnValue: Return = Return()

public class SingleValue(val newName: String): TypeModifier {
	class object {
		val CLASS = javaClass<SingleValue>()
	}

	override val isSpecial: Boolean = true
	override fun validate(qtype: QualifiedType) {
		if ( qtype !is Parameter )
			throw IllegalArgumentException("The SingleValue modifier can only be applied on function parameters.")

		val ptype = qtype as Parameter

		if ( !(ptype.nativeType is PointerType) )
			throw IllegalArgumentException("The SingleValue modifier can only be applied on pointer types.")

		if ( (ptype.nativeType : PointerType).mapping == PointerMapping.NAKED_POINTER )
			throw IllegalArgumentException("The SingleValue modifier cannot be applied on naked pointer types.")

		if ( ptype.paramType != ParameterType.IN )
			throw IllegalArgumentException("The SingleValue modifier can only be applied on input parameters.")
	}
}