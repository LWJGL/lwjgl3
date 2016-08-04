/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator

import java.util.*

enum class ApplyTo {
	NORMAL,
	ALTERNATIVE,
	BOTH
}

abstract class TemplateElement {

	companion object {
		private val EMPTY_MODIFIERS: MutableMap<Class<out TemplateModifier>, TemplateModifier> = HashMap(0)
	}

	protected var modifiers = EMPTY_MODIFIERS

	internal fun setModifiers(vararg modifiers: TemplateModifier) {
		if ( this.modifiers === EMPTY_MODIFIERS )
			this.modifiers = HashMap(modifiers.size)

		modifiers.forEach {
			val old = this.modifiers.put(it.javaClass, it)
			if ( old != null )
				throw IllegalArgumentException("Template modifier ${it.javaClass.simpleName} specified more than once.")
		}

		modifiers.forEach {
			it.validate(this)
		}
	}

	internal fun replaceModifier(modifier: TemplateModifier) {
		modifiers[modifier.javaClass] = modifier
		modifier.validate(this)
	}

	infix fun has(modifier: TemplateModifier) = modifiers[modifier.javaClass] === modifier
	infix fun has(modKey: ModifierKey<*>) = modifiers.containsKey(modKey.javaClass.declaringClass as Any?)
	operator fun <T : TemplateModifier> get(modClass: Class<T>) = @Suppress("UNCHECKED_CAST")(modifiers[modClass] as T)
	operator fun <T : TemplateModifier> get(modKey: ModifierKey<T>) = @Suppress("UNCHECKED_CAST")(modifiers[modKey.javaClass.declaringClass] as T)

	/** Returns true if the element has a ReferenceModifier with the specified reference. */
	internal fun hasRef(modKey: ModifierKey<*>, reference: String): Boolean {
		val mod = modifiers[modKey.javaClass.declaringClass]
		return mod != null && (mod as ReferenceModifier).hasReference(reference)
	}

	open val isSpecial: Boolean
		get() = modifiers.values.any { it.isSpecial }

	protected fun <T : TemplateElement> T.copyModifiers(other: T): T {
		if ( other.modifiers != EMPTY_MODIFIERS )
			this.modifiers = HashMap(other.modifiers)
		return this
	}
}

/** A template modifier. Replaces the annotations in the pre-3.0 generator. */
interface TemplateModifier {
	/** When true, this modifier requires special Java-side handling. */
	val isSpecial: Boolean

	/** Implementations should check that the specified template type is valid for this modifier. */
	fun validate(element: TemplateElement)
}

interface ModifierKey<T : TemplateModifier>

/** A modifier that can be applied on functions */
abstract class FunctionModifier : TemplateModifier {
	override fun validate(element: TemplateElement) {
		if ( element is NativeClassFunction )
			validate(element)
		else
			throw IllegalArgumentException("The ${this.javaClass.simpleName} modifier can only be applied on functions.")
	}

	protected open fun validate(func: NativeClassFunction) {
	}
}

/** A modifier that can be applied on either ReturnValues or Parameters. */
abstract class QualifiedTypeModifier : TemplateModifier {
	override fun validate(element: TemplateElement) {
		if ( element is QualifiedType )
			validate(element)
		else
			throw IllegalArgumentException("The ${this.javaClass.simpleName} modifier can only be applied on parameters or return values.")
	}

	protected open fun validate(qtype: QualifiedType) {
	}
}

/** A modifier that can be applied on parameters. */
abstract class ParameterModifier : TemplateModifier {
	override fun validate(element: TemplateElement) {
		if ( element is Parameter )
			validate(element)
		else
			throw IllegalArgumentException("The ${this.javaClass.simpleName} modifier can only be applied on parameters.")
	}

	protected open fun validate(param: Parameter) {
	}
}

/** A modifier that can be applied on return values. */
abstract class ReturnValueModifier : TemplateModifier {
	override fun validate(element: TemplateElement) {
		if ( element is ReturnValue )
			validate(element)
		else
			throw IllegalArgumentException("The ${this.javaClass.simpleName} modifier can only be applied on return values.")
	}

	protected open fun validate(returns: ReturnValue) {
	}
}

/** A modifier that can be applied on struct members. */
abstract class StructMemberModifier : TemplateModifier {
	override fun validate(element: TemplateElement) {
		if ( element is StructMember )
			validate(element)
		else
			throw IllegalArgumentException("The ${this.javaClass.simpleName} modifier can only be applied on struct members.")
	}

	protected open fun validate(member: StructMember) {
	}
}

/** A TemplateModifier with a reference to another TemplateElement. */
interface ReferenceModifier : TemplateModifier {
	val reference: String

	fun hasReference(reference: String) = this.reference == reference
}

// DSL extensions (Per TemplateModifier sub-class to avoid IAEs. Too verbose but may catch more errors at compile time)

operator fun FunctionModifier.rangeTo(func: NativeClassFunction): NativeClassFunction {
	func.setModifiers(this)
	return func
}

// Used with multiple FunctionModifiers
operator fun FunctionModifier.rangeTo(other: FunctionModifier): Array<FunctionModifier> {
	return arrayOf(this, other)
}

operator fun Array<FunctionModifier>.rangeTo(other: FunctionModifier): Array<FunctionModifier> {
	return arrayOf(*this, other)
}

operator fun Array<FunctionModifier>.rangeTo(function: NativeClassFunction): NativeClassFunction {
	function.setModifiers(*this)
	return function
}

operator fun ParameterModifier.rangeTo(param: Parameter): Parameter {
	param.setModifiers(this)
	return param
}

operator fun ReturnValueModifier.rangeTo(retValue: ReturnValue): ReturnValue {
	retValue.setModifiers(this)
	return retValue
}

operator fun <T : QualifiedType> QualifiedTypeModifier.rangeTo(qtype: T): T {
	qtype.setModifiers(this)
	return qtype
}

operator fun StructMemberModifier.rangeTo(member: StructMember): StructMember {
	member.setModifiers(this)
	return member
}

// Used with multiple Parameter/ReturnValue/QualifiedType modifiers
class ModifierList<M : TemplateModifier, Q : QualifiedType>(
	modA: M,
	modB: TemplateModifier
) {
	val list = arrayListOf(modA, modB)

	operator fun rangeTo(other: QualifiedTypeModifier): ModifierList<M, Q> {
		list.add(other)
		return this
	}

	operator fun rangeTo(other: M): ModifierList<M, Q> {
		list.add(other)
		return this
	}

	operator fun rangeTo(qtype: Q): Q {
		qtype.setModifiers(*list.toTypedArray())
		return qtype
	}
}

operator fun ParameterModifier.rangeTo(other: ParameterModifier) = ModifierList<ParameterModifier, Parameter>(this, other)
operator fun ParameterModifier.rangeTo(other: QualifiedTypeModifier) = ModifierList<ParameterModifier, Parameter>(this, other)
operator fun QualifiedTypeModifier.rangeTo(other: ParameterModifier) = ModifierList<ParameterModifier, Parameter>(other, this)

operator fun ReturnValueModifier.rangeTo(other: ReturnValueModifier) = ModifierList<ReturnValueModifier, ReturnValue>(this, other)
operator fun ReturnValueModifier.rangeTo(other: QualifiedTypeModifier) = ModifierList<ReturnValueModifier, ReturnValue>(this, other)
operator fun QualifiedTypeModifier.rangeTo(other: ReturnValueModifier) = ModifierList<ReturnValueModifier, ReturnValue>(other, this)