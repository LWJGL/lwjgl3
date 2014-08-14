/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

import java.util.HashMap

abstract class TemplateElement {

	class object {
		private val EMPTY_MODIFIERS: MutableMap<Class<out TemplateModifier>, TemplateModifier> = HashMap(0)
	}

	private var modifiers = EMPTY_MODIFIERS

	fun setModifiers(vararg modifiers: TemplateModifier) {
		modifiers forEach {
			it.validate(this)
		}

		if ( this.modifiers identityEquals EMPTY_MODIFIERS )
			this.modifiers = HashMap(modifiers.size)

		modifiers.forEach {
			val old = this.modifiers.put(it.javaClass, it)
			if ( old != null )
				throw IllegalArgumentException("Template modifier ${it.javaClass.getSimpleName()} specified more than once.")
		}
	}

	fun has(modifier: TemplateModifier) = modifiers[modifier.javaClass] == modifier
	fun has(modifierObject: ModifierObject<*>) = modifiers.containsKey(modifierObject.key)
	fun <T: TemplateModifier> get(modifier: Class<T>) = [suppress("UNCHECKED_CAST")](modifiers[modifier] as T)
	fun <T: TemplateModifier> get(modifierObject: ModifierObject<T>) = [suppress("UNCHECKED_CAST")](modifiers[modifierObject.key] as T)

	/** Returns true if the parameter has a ReferenceModifier with the specified reference. */
	fun hasRef(modifierObject: ModifierObject<*>, reference: String): Boolean {
		val mod = modifiers[modifierObject.key]
		return mod != null && (mod as ReferenceModifier).reference equals reference
	}

	open val isSpecial: Boolean
		get() = modifiers.values().any { it.isSpecial }

	protected fun <T: TemplateElement> T.copyModifiers(other: T): T {
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

trait ModifierObject<T: TemplateModifier> {
	val key: Class<T>
}

abstract class FunctionModifier: TemplateModifier {
	override fun validate(element: TemplateElement) {
		if ( element is NativeClassFunction )
			validate(element)
		else
			throw IllegalArgumentException("The ${this.javaClass.getSimpleName()} modifier can only be applied on functions.")
	}

	protected open fun validate(func: NativeClassFunction) {
	}
}

abstract class ParameterModifier: TemplateModifier {
	override fun validate(element: TemplateElement) {
		if ( element is Parameter )
			validate(element)
		else
			throw IllegalArgumentException("The ${this.javaClass.getSimpleName()} modifier can only be applied on parameters.")
	}

	protected open fun validate(param: Parameter) {
	}
}

abstract class ReturnValueModifier: TemplateModifier {
	override fun validate(element: TemplateElement) {
		if ( element is ReturnValue )
			validate(element)
		else
			throw IllegalArgumentException("The ${this.javaClass.getSimpleName()} modifier can only be applied on return values.")
	}

	protected open fun validate(returns: ReturnValue) {
	}
}

abstract class QualifiedTypeModifier: TemplateModifier {
	override fun validate(element: TemplateElement) {
		if ( element is QualifiedType )
			validate(element)
		else
			throw IllegalArgumentException("The ${this.javaClass.getSimpleName()} modifier can only be applied on parameters or return values.")
	}

	protected open fun validate(qtype: QualifiedType) {
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

fun ParameterModifier._(param: Parameter): Parameter {
	param.setModifiers(this)
	return param
}

fun ReturnValueModifier._(retValue: ReturnValue): ReturnValue {
	retValue.setModifiers(this)
	return retValue
}

fun <T: QualifiedType> QualifiedTypeModifier._(qtype: T): T {
	qtype.setModifiers(this)
	return qtype
}

fun mods(vararg modifiers: TemplateModifier): Array<TemplateModifier> = modifiers
fun <T: TemplateElement> Array<TemplateModifier>._(element: T): T {
	element.setModifiers(*this)
	return element
}