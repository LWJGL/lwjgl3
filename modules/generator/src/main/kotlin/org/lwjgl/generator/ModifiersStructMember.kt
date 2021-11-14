/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator

/*
    required AutoSize + non-null reference: ref must not be null and size must not be 0.
    optional AutoSize + non-null reference: ref may be null, if size is 0.

    required AutoSize + nullable reference: ref may be null, even if size is not 0. Size may be 0.
        - setting ref to null, does NOT change the size
    optional AutoSize + nullable reference: ref may be null, even if size is not 0. Size may be 0.
        - setting ref to null, sets the size to 0

    required atLeastOne AutoSize + nullable references: one of the references must not be null and size must not be 0.
    optional atLeastOne AutoSize + nullable references: one of the references must not be null if size is not 0.
 */
class AutoSizeMember(
    override val reference: String,
    vararg val dependent: String,
    /** If not null, the expression will be appended to the parameter. */
    val factor: AutoSizeFactor? = null,

    /** If true, the auto-size value may be zero and referenced members can be null. */
    val optional: Boolean = false,
    /** If true, at least one of the nullable referenced members must not be null. */
    val atLeastOne: Boolean = false
) : StructMemberModifier, ReferenceModifier {
    override val isSpecial = true

    internal val references: Sequence<String> = sequenceOf(reference) + dependent.asSequence()

    internal fun members(members: Sequence<StructMember>) = references.map { ref -> members.first { it.name == ref } }

    internal fun keepSetter(members: Sequence<StructMember>) = (dependent.isNotEmpty() || members(members).any { it.has<Nullable>() }) && !atLeastOne

    override fun hasReference(reference: String) = this.reference == reference || dependent.any { it == reference }

    override fun validate(member: StructMember) {
        require(
            when (member.nativeType.mapping) {
                PrimitiveMapping.BYTE,
                PrimitiveMapping.SHORT,
                PrimitiveMapping.INT,
                PrimitiveMapping.LONG,
                PrimitiveMapping.CLONG,
                PrimitiveMapping.POINTER -> true
                else                     -> false
            }
        ) {
            "Members with the AutoSizeMember modifier must be integer primitive types."
        }
    }
}

class AutoSizeIndirect(
    override val reference: String,
    vararg val dependent: String
) : StructMemberModifier, ReferenceModifier {
    override val isSpecial = true

    internal val references: Sequence<String> = sequenceOf(reference) + dependent.asSequence()

    internal fun members(members: Sequence<StructMember>) = references.map { ref -> members.first { it.name == ref } }

    override fun hasReference(reference: String) = this.reference == reference || dependent.any { it == reference }

    override fun validate(member: StructMember) {
        require(
            when (member.nativeType.mapping) {
                PrimitiveMapping.BYTE,
                PrimitiveMapping.SHORT,
                PrimitiveMapping.INT,
                PrimitiveMapping.LONG,
                PrimitiveMapping.CLONG,
                PrimitiveMapping.POINTER -> true
                else                     -> false
            }
        ) {
            "Members with the AutoSizeIndirect modifier must be integer primitive types."
        }
    }
}

/** Adds a capacity check to a buffer parameter. */
class Check(
    /** An integer expression to validate against the buffer capacity. */
    val expression: String,
    /** If true, the check will only be performed in debug mode. Useful for expensive checks. */
    val debug: Boolean = false
) : MemberParamModifier {
    override val isSpecial = expression != "0"
    override fun validate(param: Parameter) {
        require(param.nativeType is PointerType<*>) {
            "The Check modifier can only be applied to pointer types."
        }

        require(param.nativeType.mapping !== PointerMapping.OPAQUE_POINTER) {
            "The Check modifier cannot be applied to opaque pointer types."
        }
    }
}

/** Factory method for Check modifiers with integer expressions. */
fun Check(value: Int) = Check(value.toString())

/** Marks an array member as terminated by the specified value. */
class TerminatedMember(val value: String) : StructMemberModifier {
    override val isSpecial = true
    override fun validate(member: StructMember) {
        require(member is StructMemberArray) {
            "The NullTerminated modifier can only be applied to array members."
        }
    }
}
val NullTerminatedMember = TerminatedMember("")

/** Assigns pointer wrapper types to an opaque pointer member. A setter for each type will be generated that will write wrapper.address() to the member. */
class PointerSetter(
    /** An array of types that implement the Pointer interface */
    vararg val types: String,
    /** If true, treat as a Vulkan pNext-style member and prepend the pointer to the current pointer chain. */
    val prepend: Boolean = false,
    /** Overrides the target type's setter method. If null, defaults to the same name as the modified member. */
    val targetSetter: String? = null
): StructMemberModifier {
    override val isSpecial = true
    override fun validate(member: StructMember) {
        require(member.nativeType is PointerType<*> && member.nativeType.mapping === PointerMapping.OPAQUE_POINTER) {
            "The PointerSetter modifier can only be applied to opaque pointer members."
        }
    }
}