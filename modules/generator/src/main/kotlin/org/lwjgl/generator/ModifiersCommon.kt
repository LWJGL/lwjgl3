/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator

/** A modifier that can be applied to either functions or parameters. */
interface FuncParamModifier : FunctionModifier, ParameterModifier

/** A modifier that can be applied to either struct members or parameters. */
interface MemberParamModifier : StructMemberModifier, ParameterModifier

/** Should be used on pointer parameters or pointer-to-struct members whose size cannot be validated and may be unsafe. */
object Unsafe : MemberParamModifier {
    override val isSpecial = true
    override fun validate(param: Parameter) {
        require(param.nativeType is PointerType<*>) {
            "The Unsafe modifier can only be applied to pointer types."
        }

        require(param.nativeType.mapping !== PointerMapping.OPAQUE_POINTER) {
            "The Unsafe modifier cannot be applied to opaque pointer types."
        }
    }
    override fun validate(member: StructMember) {
        require(member.nativeType is PointerType<*> && member.nativeType.elementType is StructType) {
            "The Unsafe modifier can only be applied to pointer to struct members."
        }
    }
}

class Nullable internal constructor(val optional: Boolean) : MemberParamModifier {
    override val isSpecial = optional
    override fun validate(param: Parameter) {
        require(param.nativeType is PointerType<*>) {
            "The nullable modifier can only be applied to pointer types."
        }
    }
    override fun validate(member: StructMember) {
        require(member.nativeType is PointerType<*> || (member.nativeType is CArrayType<*> && member.nativeType.elementType is PointerType<*>)) {
            "The nullable modifier can only be applied to pointer or pointer array members."
        }
    }
}

/** Marks a pointer parameter or struct member as nullable. */
val nullable = Nullable(false)
/** Marks a pointer parameter as optional. Similar to nullable, but the parameter either doesn't exist or it exists and is not null. */
val optional = Nullable(true)

// DSL Extensions

// Function/Parameter modifiers

operator fun FuncParamModifier.rangeTo(other: FuncParamModifier) = arrayOf(this, other)
operator fun FuncParamModifier.rangeTo(other: FunctionModifier) = arrayOf(this, other)
operator fun FuncParamModifier.rangeTo(other: ParameterModifier) = arrayOf(this, other)
operator fun Array<FuncParamModifier>.rangeTo(function: Func) = function.let { it.setModifiers(*this); it }
operator fun Array<FuncParamModifier>.rangeTo(param: Parameter) = param.let { it.setModifiers(*this); it }

// Member/Parameter modifiers

operator fun MemberParamModifier.rangeTo(other: MemberParamModifier) = arrayOf(this, other)
operator fun MemberParamModifier.rangeTo(other: StructMemberModifier) = arrayOf(this, other)
operator fun MemberParamModifier.rangeTo(other: ParameterModifier) = arrayOf(this, other)
operator fun Array<MemberParamModifier>.rangeTo(member: StructMember) = member.let { it.setModifiers(*this); it }
operator fun Array<MemberParamModifier>.rangeTo(param: Parameter) = param.let { it.setModifiers(*this); it }

