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
	val factor: AutoSizeFactor?,

	/** If true, the auto-size value may be zero and referenced members can be null. */
	val optional: Boolean,
	/** If true, at least one of the nullable referenced members must not be null. */
	val atLeastOne: Boolean
) : StructMemberModifier(), ReferenceModifier {
	companion object : ModifierKey<AutoSizeMember>

	override val isSpecial = true

	internal val references: Sequence<String> = sequenceOf(reference) + dependent.asSequence()

	internal fun members(members: Sequence<StructMember>) = references.map { ref -> members.first { it.name == ref } }

	internal fun keepSetter(members: Sequence<StructMember>) = (dependent.isNotEmpty() || members(members).any { it has NullableMember }) && !atLeastOne

	override fun hasReference(reference: String) = this.reference == reference || dependent.any { it == reference }

	override fun validate(member: StructMember) {
		if ( when ( member.nativeType.mapping ) {
			PrimitiveMapping.BYTE,
			PrimitiveMapping.SHORT,
			PrimitiveMapping.INT,
			PrimitiveMapping.LONG,
			PrimitiveMapping.POINTER -> false
			else                     -> true
		} )
			throw IllegalArgumentException("Members with the AutoSizeMember modifier must be integer primitive types.")
	}
}
fun Struct.AutoSize(
	reference: String,
	vararg dependent: String,
	factor: AutoSizeFactor? = null,
	optional: Boolean = false,
	atLeastOne: Boolean = false
) = AutoSizeMember(
	reference, *dependent,
	factor = factor,
	optional = optional,
	atLeastOne = atLeastOne
)

object NullableMember : StructMemberModifier() {
	override val isSpecial = true
	override fun validate(member: StructMember) {
		if ( member.nativeType !is PointerType || (member.nativeType is StructType && !member.nativeType.includesPointer) )
			throw IllegalArgumentException("The nullable modifier can only be applied on pointer types.")
	}
}
/** Marks a pointer member as nullable. */
val Struct.nullable: NullableMember get() = NullableMember