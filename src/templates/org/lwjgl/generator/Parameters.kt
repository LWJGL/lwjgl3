/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

import java.util.HashMap
import org.lwjgl.generator.opengl.BufferObject
import java.util.regex.Pattern
import java.nio.Buffer

/** Super class of Parameter and ReturnValue with common helper properties. */
abstract class QualifiedType(
	val nativeType: NativeType
): TemplateElement() {

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

public fun TemplateModifier._(returnType: NativeType): ReturnValue {
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

/** Marks the function parameter or return value as const. */
public class Const internal(): TemplateModifier {
	override val isSpecial: Boolean = false
	override fun validate(ttype: TemplateElement) {
		if ( ttype !is QualifiedType )
			throw IllegalArgumentException("The const modifier can only be applied on parameters or return values.")

		val qtype = ttype as QualifiedType
		if ( qtype.nativeType !is PointerType )
			throw IllegalArgumentException("The const modifier can only be applied on pointer types.")

		if ( qtype is Parameter && qtype.paramType != ParameterType.IN )
			throw IllegalArgumentException("The const modifier can only be applied on input parameters.")
	}
}
public val const: Const = Const()

/** Marks the function parameter as a function callback user data parameter. */
public class CallbackData(reference: String): ReferenceModifier(reference) {
	class object {
		val CLASS = javaClass<CallbackData>()
	}

	override fun validate(ttype: TemplateElement) {
		if ( ttype !is Parameter )
			throw IllegalArgumentException("The CallbackData modifier can only be applied on parameters.")

		val param = ttype as Parameter
		if ( param.nativeType !is PointerType || (param.nativeType : PointerType).mapping != PointerMapping.NAKED_POINTER )
			throw IllegalArgumentException("The CallbackData modifier can only be applied on naked pointer types.")
	}
}
/** This should only be used on the user data parameter of the CallbackFunction definition. */
public val CALLBACK_DATA: CallbackData = CallbackData("")

/** Marks the parameter to be replaced with .remaining() on the buffer parameter specified by reference. */
public class AutoSize(reference: String, vararg val dependent: String): ReferenceModifier(reference) {
	class object {
		val CLASS = javaClass<AutoSize>()
	}

	var expression: String? = null

	public fun expression(expression: String): AutoSize {
		this.expression = expression
		return this
	}

	public fun hasReference(reference: String): Boolean = this.reference == reference || dependent.any { it == reference }

	override fun validate(ttype: TemplateElement) {
		if ( ttype !is Parameter )
			throw IllegalArgumentException("The AutoSize modifier can only be applied on parameters.")

		val param = ttype as Parameter
		when ( param.nativeType.mapping ) {
			PrimitiveMapping.INT,
			PrimitiveMapping.LONG -> {
			}
			else -> {
				throw IllegalArgumentException("The AutoSize modifier can only be applied on integer primitive types.")
			}
		}
	}
}

/** Adds a capacity check to a buffer parameter. */
public class Check(
	/** An integer expression to validate against the buffer capacity. */
	val expression: String,
	/** If true, the target buffer may be null, in which case the check is skipped. */
	val canBeNull: Boolean = false,
	/** If the expression value is in bytes rather in elements (of the buffer type). */
	val bytes: Boolean = false,
	/** If true, the check will only be performed in debug mode. Useful for expensive checks. */
	val debug: Boolean = false
): TemplateModifier {
	class object {
		val CLASS = javaClass<Check>()
	}

	override val isSpecial: Boolean = true
	override fun validate(ttype: TemplateElement) {
		if ( ttype !is Parameter )
			throw IllegalArgumentException("The Check modifier can only be applied on parameters.")

		val param = ttype as Parameter
		if ( param.nativeType !is PointerType )
			throw IllegalArgumentException("The Check modifier can only be applied on pointer types.")

		if ( (param.nativeType : PointerType).mapping == PointerMapping.NAKED_POINTER )
			throw IllegalArgumentException("The Check modifier cannot be applied on naked pointer types.")
	}
}
public fun Check(value: Int): Check = Check(Integer.toString(value))

/** Marks a pointer parameter as nullable. */
public class Nullable internal(): TemplateModifier {
	class object {
		val CLASS = javaClass<Nullable>()
	}

	override val isSpecial: Boolean = true
	override fun validate(ttype: TemplateElement) {
		if ( ttype !is Parameter )
			throw IllegalArgumentException("The nullable modifier can only be applied on parameters.")

		val param = ttype as Parameter
		if ( param.nativeType !is PointerType )
			throw IllegalArgumentException("The nullable modifier can only be applied on pointer types.")
	}
}
public val nullable: Nullable = Nullable()

/** Marks a buffer parameter as null-terminated. */
public class NullTerminated internal(): TemplateModifier {
	class object {
		val CLASS = javaClass<NullTerminated>()
	}

	override val isSpecial: Boolean = true
	override fun validate(ttype: TemplateElement) {
		if ( ttype !is Parameter )
			throw IllegalArgumentException("The nullTerminated modifier can only be applied on parameters.")

		val param = ttype as Parameter
		if ( param.nativeType !is PointerType )
			throw IllegalArgumentException("The NullTerminated modifier can only be applied on pointer types.")

		if ( (param.nativeType : PointerType).mapping == PointerMapping.NAKED_POINTER )
			throw IllegalArgumentException("The NullTerminated modifier cannot be applied on naked pointer types.")
	}
}
public val nullTerminated: NullTerminated = NullTerminated()

/** Marks a parameter to be replaced with an expression. */
public class Expression(
	/** The expression to use instead of the parameter name. */
	val value: String,
	/** If true, the parameter will not be removed from the method signature. */
	val keepParam: Boolean = false
): TemplateModifier {
	class object {
		val CLASS = javaClass<Expression>()
	}

	override val isSpecial: Boolean = true
	override fun validate(ttype: TemplateElement) {
		if ( ttype !is Parameter )
			throw IllegalArgumentException("The Expression modifier can only be applied on parameters.")
	}
}

/** Like AutoType, but with a hard-coded list of types. See glTexImage2D for an example. */
public class MultiType(vararg val types: PointerMapping): TemplateModifier {
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
	override fun validate(ttype: TemplateElement) {
		if ( ttype !is Parameter )
			throw IllegalArgumentException("The nullTerminated modifier can only be applied on parameters.")

		val param = ttype as Parameter
		if ( param.nativeType !is PointerType )
			throw IllegalArgumentException("The MultiType modifier can only be applied on pointer types.")

		if ( (param.nativeType : PointerType).mapping == PointerMapping.NAKED_POINTER )
			throw IllegalArgumentException("The MultiType modifier cannot be applied on naked pointer types.")
	}

}

/** Marks a parameter to become the return value of an alternative method. */
public class Return internal(): TemplateModifier {
	class object {
		val CLASS = javaClass<Return>()
	}

	override val isSpecial: Boolean = true
	override fun validate(ttype: TemplateElement) {
		if ( ttype !is Parameter )
			throw IllegalArgumentException("The returnValue modifier can only be applied on parameters.")

		val param = ttype as Parameter
		if ( param.nativeType !is PointerType )
			throw IllegalArgumentException("The returnValue modifier can only be applied on pointer types.")

		if ( (param.nativeType : PointerType).mapping == PointerMapping.NAKED_POINTER )
			throw IllegalArgumentException("The returnValue modifier cannot be applied on naked pointer types.")

		if ( param.paramType != ParameterType.OUT )
			throw IllegalArgumentException("The returnValue modifier can only be applied on output parameters.")
	}
}
public val returnValue: Return = Return()

/** Marks a buffer parameter to transform to a single primitive value in an alternative method. */
public class SingleValue(val newName: String): TemplateModifier {
	class object {
		val CLASS = javaClass<SingleValue>()
	}

	override val isSpecial: Boolean = true
	override fun validate(ttype: TemplateElement) {
		if ( ttype !is Parameter )
			throw IllegalArgumentException("The SingleValue modifier can only be applied on parameters.")

		val param = ttype as Parameter
		if ( param.nativeType !is PointerType )
			throw IllegalArgumentException("The SingleValue modifier can only be applied on pointer types.")

		if ( (param.nativeType : PointerType).mapping == PointerMapping.NAKED_POINTER )
			throw IllegalArgumentException("The SingleValue modifier cannot be applied on naked pointer types.")

		if ( param.paramType != ParameterType.IN )
			throw IllegalArgumentException("The SingleValue modifier can only be applied on input parameters.")
	}
}