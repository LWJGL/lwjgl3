/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator

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
		if (this.modifiers === EMPTY_MODIFIERS)
			this.modifiers = HashMap(modifiers.size)

		modifiers.forEach {
			val old = this.modifiers.put(it.javaClass, it)
			if (old != null)
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
	operator fun <T : TemplateModifier> get(modClass: Class<T>) = @Suppress("UNCHECKED_CAST") (modifiers[modClass] as T)
	operator fun <T : TemplateModifier> get(modKey: ModifierKey<T>) = @Suppress("UNCHECKED_CAST") (modifiers[modKey.javaClass.declaringClass] as T)

	/** Returns true if the element has a ReferenceModifier with the specified reference. */
	internal fun hasRef(modKey: ModifierKey<*>, reference: String): Boolean {
		val mod = modifiers[modKey.javaClass.declaringClass]
		return mod != null && (mod as ReferenceModifier).hasReference(reference)
	}

	open val isSpecial: Boolean
		get() = modifiers.any { it.value.isSpecial }

	protected fun <T : TemplateElement> T.copyModifiers(other: T): T {
		if (other.modifiers != EMPTY_MODIFIERS)
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

@Suppress("unused")
interface ModifierKey<T : TemplateModifier>

/** A modifier that can be applied on functions */
interface FunctionModifier : TemplateModifier {
	override fun validate(element: TemplateElement) {
		if (element is NativeClassFunction)
			validate(element)
		else
			throw IllegalArgumentException("The ${this.javaClass.simpleName} modifier can only be applied on functions.")
	}

	fun validate(func: NativeClassFunction) {
	}
}

/** A modifier that can be applied on parameters. */
interface ParameterModifier : TemplateModifier {
	override fun validate(element: TemplateElement) {
		if (element is Parameter)
			validate(element)
		else
			throw IllegalArgumentException("The ${this.javaClass.simpleName} modifier can only be applied on parameters.")
	}

	fun validate(param: Parameter) {
	}
}

/** A modifier that can be applied on struct members. */
interface StructMemberModifier : TemplateModifier {
	override fun validate(element: TemplateElement) {
		if (element is StructMember)
			validate(element)
		else
			throw IllegalArgumentException("The ${this.javaClass.simpleName} modifier can only be applied on struct members.")
	}

	fun validate(member: StructMember) {
	}
}

/** A modifier with a reference to another element. */
interface ReferenceModifier {
	val reference: String

	fun hasReference(reference: String) = this.reference == reference
}

// DSL extensions (Per TemplateModifier sub-class to avoid IAEs. Too verbose but may catch more errors at compile time)

// Function modifiers

operator fun FunctionModifier.rangeTo(func: NativeClassFunction) = func.let {
	it.setModifiers(this)
	it
}

operator fun Array<FunctionModifier>.rangeTo(function: NativeClassFunction) = function.let {
	it.setModifiers(*this)
	it
}

inline operator fun <reified T : FunctionModifier> T.rangeTo(other: T) = arrayOf(this, other)
inline operator fun <reified T : FunctionModifier> Array<T>.rangeTo(other: T) = arrayOf(*this, other)

// Parameter modifiers

operator fun ParameterModifier.rangeTo(param: Parameter) = param.let {
	it.setModifiers(this)
	it
}

operator fun Array<ParameterModifier>.rangeTo(param: Parameter) = param.let {
	it.setModifiers(*this)
	it
}

inline operator fun <reified T : ParameterModifier> T.rangeTo(other: T) = arrayOf(this, other)
inline operator fun <reified T : ParameterModifier> Array<T>.rangeTo(other: T) = arrayOf(*this, other)

// Struct member modifiers

operator fun StructMemberModifier.rangeTo(member: StructMember) = member.let {
	it.setModifiers(this)
	it
}

operator fun Array<StructMemberModifier>.rangeTo(member: StructMember) = member.let {
	it.setModifiers(*this)
	it
}

inline operator fun <reified T : StructMemberModifier> T.rangeTo(other: T) = arrayOf(this, other)
inline operator fun <reified T : StructMemberModifier> Array<T>.rangeTo(other: T) = arrayOf(*this, other)