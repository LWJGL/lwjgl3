/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

import java.util.HashMap

abstract class TemplateElement {

	companion object {
		private val EMPTY_MODIFIERS: MutableMap<Class<out TemplateModifier>, TemplateModifier> = HashMap(0)
	}

	private var modifiers = EMPTY_MODIFIERS

	fun setModifiers(vararg modifiers: TemplateModifier) {
		modifiers forEach {
			it.validate(this)
		}

		if ( this.modifiers === EMPTY_MODIFIERS )
			this.modifiers = HashMap(modifiers.size())

		modifiers.forEach {
			val old = this.modifiers.put(it.javaClass, it)
			if ( old != null )
				throw IllegalArgumentException("Template modifier ${it.javaClass.getSimpleName()} specified more than once.")
		}
	}

	fun has(modifier: TemplateModifier) = modifiers[modifier.javaClass] === modifier
	fun has(modKey: ModifierKey<*>) = modifiers.containsKey(modKey.javaClass.getDeclaringClass())
	fun <T : TemplateModifier> get(modClass: Class<T>) = [suppress("UNCHECKED_CAST")](modifiers[modClass] as T)
	fun <T : TemplateModifier> get(modKey: ModifierKey<T>) = [suppress("UNCHECKED_CAST")](modifiers[modKey.javaClass.getDeclaringClass()] as T)

	/** Returns true if the parameter has a ReferenceModifier with the specified reference. */
	fun hasRef(modKey: ModifierKey<*>, reference: String): Boolean {
		val mod = modifiers[modKey.javaClass.getDeclaringClass()]
		return mod != null && (mod as ReferenceModifier).reference equals reference
	}

	open val isSpecial: Boolean
		get() = modifiers.values().any { it.isSpecial }

	protected fun <T : TemplateElement> T.copyModifiers(other: T): T {
		if ( other.modifiers != EMPTY_MODIFIERS )
			this.modifiers = HashMap(other.modifiers)
		return this
	}
}

/** A template modifier. Replaces the annotations in the pre-3.0 generator. */
trait TemplateModifier {
	/** When true, this modifier requires special Java-side handling. */
	val isSpecial: Boolean

	/** Implementations should check that the specified template type is valid for this modifier. */
	fun validate(element: TemplateElement)
}

trait ModifierKey<T : TemplateModifier>

/** A modifier that can be applied on functions */
abstract class FunctionModifier : TemplateModifier {
	override fun validate(element: TemplateElement) {
		if ( element is NativeClassFunction )
			validate(element)
		else
			throw IllegalArgumentException("The ${this.javaClass.getSimpleName()} modifier can only be applied on functions.")
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
			throw IllegalArgumentException("The ${this.javaClass.getSimpleName()} modifier can only be applied on parameters or return values.")
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
			throw IllegalArgumentException("The ${this.javaClass.getSimpleName()} modifier can only be applied on parameters.")
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
			throw IllegalArgumentException("The ${this.javaClass.getSimpleName()} modifier can only be applied on return values.")
	}

	protected open fun validate(returns: ReturnValue) {
	}
}

/** A TemplateModifier with a reference to another TemplateElement. */
trait ReferenceModifier {
	val reference: String
}

// DSL extensions (Per TemplateModifier sub-class to avoid IAEs. Too verbose but may catch more errors at compile time)

fun FunctionModifier._(func: NativeClassFunction): NativeClassFunction {
	func.setModifiers(this)
	return func
}

// Used with multiple FunctionModifiers
fun FunctionModifier._(other: FunctionModifier): Array<FunctionModifier> {
	return array(this, other)
}

fun Array<FunctionModifier>._(other: FunctionModifier): Array<FunctionModifier> {
	return array(*this, other)
}

fun Array<FunctionModifier>._(function: NativeClassFunction): NativeClassFunction {
	function.setModifiers(*this)
	return function
}

fun ParameterModifier._(param: Parameter): Parameter {
	param.setModifiers(this)
	return param
}

fun ReturnValueModifier._(retValue: ReturnValue): ReturnValue {
	retValue.setModifiers(this)
	return retValue
}

fun <T : QualifiedType> QualifiedTypeModifier._(qtype: T): T {
	qtype.setModifiers(this)
	return qtype
}

// Used with multiple Parameter/ReturnValue/QualifiedType modifiers
class ModifierList<M : TemplateModifier, Q : QualifiedType>(
	modA: M,
	modB: TemplateModifier
) {
	val list = arrayListOf(modA, modB)

	fun _(other: QualifiedTypeModifier): ModifierList<M, Q> {
		list add other
		return this
	}

	fun _(other: M): ModifierList<M, Q> {
		list add other
		return this
	}

	fun _(qtype: Q): Q {
		qtype.setModifiers(*list.copyToArray())
		return qtype
	}
}

fun ParameterModifier._(other: ParameterModifier) = ModifierList<ParameterModifier, Parameter>(this, other)
fun ParameterModifier._(other: QualifiedTypeModifier) = ModifierList<ParameterModifier, Parameter>(this, other)
fun QualifiedTypeModifier._(other: ParameterModifier) = ModifierList<ParameterModifier, Parameter>(other, this)

fun ReturnValueModifier._(other: ReturnValueModifier) = ModifierList<ReturnValueModifier, ReturnValue>(this, other)
fun ReturnValueModifier._(other: QualifiedTypeModifier) = ModifierList<ReturnValueModifier, ReturnValue>(this, other)
fun QualifiedTypeModifier._(other: ReturnValueModifier) = ModifierList<ReturnValueModifier, ReturnValue>(other, this)