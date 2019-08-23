/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator

import kotlin.reflect.*

/** A template modifier. Replaces the annotations in the pre-3.0 generator. */
interface TemplateModifier {
    /** When true, this modifier requires special Java-side handling. */
    val isSpecial: Boolean
}

/** A modifier that can be applied to functions */
interface FunctionModifier : TemplateModifier {
    /** Implementations should check that the specified function is valid for this modifier. */
    fun validate(func: Func) {
    }
}

/** A modifier that can be applied to parameters. */
interface ParameterModifier : TemplateModifier {
    /** Implementations should check that the specified parameter is valid for this modifier. */
    fun validate(param: Parameter) {
    }
}

/** A modifier that can be applied to struct members. */
interface StructMemberModifier : TemplateModifier {
    /** Implementations should check that the specified struct member is valid for this modifier. */
    fun validate(member: StructMember) {
    }
}

/** A modifier with a reference to another element. */
interface ReferenceModifier {
    val reference: String

    fun hasReference(reference: String) = this.reference == reference
}

abstract class ModifierTarget<T : TemplateModifier> {
    companion object {
        private val EMPTY_MODIFIERS: MutableMap<KClass<out TemplateModifier>, TemplateModifier> = HashMap(0)
    }

    @Suppress("UNCHECKED_CAST")
    protected var _modifiers: MutableMap<KClass<out T>, T> = EMPTY_MODIFIERS as MutableMap<KClass<out T>, T>

    val modifiers: Map<KClass<out T>, T>
        get() = _modifiers

    internal fun hasModifiers() = _modifiers !== EMPTY_MODIFIERS

    internal fun setModifiers(vararg modifiers: T) {
        if (!hasModifiers())
            this._modifiers = HashMap(modifiers.size)

        modifiers.forEach {
            val old = this._modifiers.put(it::class, it)
            require(old == null) {
                "Template modifier ${it::class.java.simpleName} specified more than once."
            }
        }

        modifiers.forEach {
            this.validate(it)
        }
    }

    internal abstract fun validate(modifier: T)

    internal inline fun <reified M : T> replaceModifier(modifier: M) {
        _modifiers[M::class] = modifier
        this.validate(modifier)
    }

    inline infix fun <reified M : T> has(modifier: M) = modifiers[M::class] === modifier

    inline fun <reified M : T> has() = modifiers.containsKey(M::class)
    inline fun <reified M : T> has(predicate: M.() -> Boolean) = (modifiers[M::class] as M?)?.predicate() ?: false
    inline fun <reified M : T> get() = modifiers[M::class] as M

}

// DSL extensions (Per TemplateModifier sub-class to avoid IAEs. Too verbose but may catch more errors at compile time)

// These 3 are here because Kotlin does not support: where M : T, T : ReferenceModifier

/** Returns true if the function has a ReferenceModifier with the specified reference. */
inline fun <reified T> Func.has(reference: String) where T : FunctionModifier, T : ReferenceModifier
    = (modifiers[T::class] as T?).let { it != null && it.hasReference(reference) }

/** Returns true if the parameter has a ReferenceModifier with the specified reference. */
inline fun <reified T> Parameter.has(reference: String) where T : ParameterModifier, T : ReferenceModifier
    = (modifiers[T::class] as T?).let { it != null && it.hasReference(reference) }

/** Returns true if the struct member has a ReferenceModifier with the specified reference. */
inline fun <reified T> StructMember.has(reference: String) where T : StructMemberModifier, T : ReferenceModifier
    = (modifiers[T::class] as T?).let { it != null && it.hasReference(reference) }

// Function modifiers

operator fun FunctionModifier.rangeTo(func: Func) = func.let { it.setModifiers(this); it }
operator fun Array<FunctionModifier>.rangeTo(function: Func) = function.let { it.setModifiers(*this); it }
operator fun FunctionModifier.rangeTo(other: FunctionModifier) = arrayOf(this, other)
operator fun Array<FunctionModifier>.rangeTo(other: FunctionModifier) = arrayOf(*this, other)

// Parameter modifiers

operator fun ParameterModifier.rangeTo(param: Parameter) = param.let { it.setModifiers(this); it }
operator fun Array<ParameterModifier>.rangeTo(param: Parameter) = param.let { it.setModifiers(*this); it }
operator fun ParameterModifier.rangeTo(other: ParameterModifier) = arrayOf(this, other)
operator fun Array<ParameterModifier>.rangeTo(other: ParameterModifier) = arrayOf(*this, other)

// Struct member modifiers

operator fun StructMemberModifier.rangeTo(member: StructMember) = member.let { it.setModifiers(this); it }
operator fun Array<StructMemberModifier>.rangeTo(member: StructMember) = member.let { it.setModifiers(*this); it }
operator fun StructMemberModifier.rangeTo(other: StructMemberModifier) = arrayOf(this, other)
operator fun Array<StructMemberModifier>.rangeTo(other: StructMemberModifier) = arrayOf(*this, other)