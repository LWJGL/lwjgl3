/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator

import org.lwjgl.generator.ParameterType.*

/** A parameter or return value. */
interface QualifiedType {
    val nativeType: NativeType
}

internal val QualifiedType.hasUnsafe
    get() = (nativeType is PointerType && (nativeType.mapping !== PointerMapping.OPAQUE_POINTER || nativeType is CallbackType)) || nativeType is StructType

internal val QualifiedType.isBufferPointer
    get() = nativeType.let { it is PointerType && it.mapping !== PointerMapping.OPAQUE_POINTER && it.elementType !is StructType }

internal val QualifiedType.javaMethodType
    get() = nativeType.javaMethodType

class ReturnValue(override val nativeType: NativeType) : QualifiedType {

    override fun hashCode() = RESULT.hashCode()

    override fun equals(other: Any?) = other === this || (other is ReturnValue && other.nativeType == this.nativeType)

    // --- [ Helper functions & properties ] ---

    internal val isSpecial
        get() = (hasUnsafe && nativeType !is ArrayType)

    internal val isVoid
        get() = nativeType.mapping === TypeMapping.VOID

    internal val isStructValue
        get() = nativeType is StructType

    internal fun toNativeType(hasConst: Boolean, binding: APIBinding?) =
        if (binding == null || isStructValue) {
            nativeType.name.let {
                if (nativeType is PointerType && !nativeType.includesPointer) {
                    if (!it.endsWith('*')) "$it *" else "$it*"
                } else
                    it
            }
        } else {
            if (nativeType.mapping === PrimitiveMapping.POINTER || nativeType is PointerType)
                "intptr_t"
            else
                nativeType.jniFunctionType
        }.let {
            if (hasConst && binding == null) // const intptr is pointless and raises a warning on GCC/Clang
                "const $it"
            else
                it
        }

}

enum class ParameterType {
    IN,
    OUT,
    INOUT
}

class Parameter(
    override val nativeType: NativeType,
    val name: String,
    val paramType: ParameterType = IN,
    val documentation: (() -> String)?
) : ModifierTarget<ParameterModifier>(), QualifiedType {

    constructor(
        nativeType: NativeType,
        name: String,
        paramType: ParameterType,
        javadoc: String,
        links: String,
        linkMode: LinkMode
    ) : this(nativeType, name, paramType, if (javadoc.isNotEmpty() || links.isNotEmpty()) {
        val documentation: (() -> String)? = { if (links.isEmpty()) javadoc else linkMode.appendLinks(javadoc, links) }
        documentation
    } else
        null
    )

    override fun hashCode() = name.hashCode()

    override fun equals(other: Any?) = other === this || (other is Parameter && other.name == this.name)

    // --- [ Helper functions & properties ] ----

    internal val isSpecial
        get() = (hasUnsafe && nativeType !is ArrayType) || when (nativeType.mapping) {
            PointerMapping.OPAQUE_POINTER -> (nativeType is ObjectType || !has(nullable)) && this !== JNI_ENV
            PrimitiveMapping.BOOLEAN4     -> true
            else                          -> false
        } || modifiers.any { it.value.isSpecial }

    /** Returns true if this is an output parameter with the AutoSizeResult modifier. */
    internal val isAutoSizeResultOut
        get() = paramType === OUT && has<AutoSizeResultParam>()

    internal fun isArrayParameter(autoSizeResultOutParams: Int) = nativeType.mapping.isArray && (!isAutoSizeResultOut || autoSizeResultOutParams != 1)

    internal fun toNativeType(binding: APIBinding?, pointerMode: Boolean = false) =
        if (binding == null || this === JNI_ENV || nativeType is StructType) {
            nativeType.name.let {
                if ((nativeType is PointerType && !nativeType.includesPointer) || (pointerMode && nativeType is StructType)) {
                    if (!it.endsWith('*')) "$it *" else "$it*"
                } else
                    it
            }
        } else {
            if (nativeType.mapping === PrimitiveMapping.POINTER || nativeType is PointerType)
                "intptr_t"
            else
                nativeType.jniFunctionType
        }.let {
            if (has(const))
                "const $it"
            else
                it
        }

    override fun validate(modifier: ParameterModifier) = modifier.validate(this)

    internal fun copyModifiers(other: Parameter): Parameter {
        if (other.hasModifiers())
            this._modifiers = HashMap(other.modifiers)
        return this
    }

    internal fun removeArrayModifiers(): Parameter {
        if (has(optional) && has<MultiType>())
            _modifiers.remove(Nullable::class)

        _modifiers.remove(PointerArray::class)
        _modifiers.remove(Return::class)
        _modifiers.remove(SingleValue::class)
        _modifiers.remove(MultiType::class)

        return this
    }

    /**
     * If this parameter has a modifier of the specified type, it replaces it with the result of the specified function.
     *
     * @param replaceWith a function that takes the current modifier and returns the new one
     *
     * @return this parameter
     */
    internal inline fun <reified T : ParameterModifier> replaceModifier(replaceWith: (T) -> T): Parameter {
        if (this.has<T>())
            _modifiers[T::class] = replaceWith(this.get<T>())

        return this
    }

}