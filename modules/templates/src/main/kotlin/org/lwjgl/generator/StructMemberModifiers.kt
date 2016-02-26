/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

class AutoSizeMember(
	override val reference: String,
	vararg val dependent: String,
	/** If not null, the expression will be appended to the parameter. */
	val factor: AutoSizeFactor?,
	/** If true, only one of the references is valid, the rest will be null. */
    val exclusive: Boolean,
	/** If true, the instance setter for modified member will not be removed. */
    val keepSetter: Boolean
) : StructMemberModifier(), ReferenceModifier {
	companion object : ModifierKey<AutoSizeMember>

	override val isSpecial = true

	override fun hasReference(reference: String) = this.reference == reference || dependent.any { it == reference }

	override fun validate(member: StructMember) {
		if ( when ( member.nativeType.mapping ) {
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
    exclusive: Boolean = false,
	keepSetter: Boolean = dependent.isNotEmpty() && !exclusive
) = AutoSizeMember(reference, *dependent, factor = factor, exclusive = exclusive, keepSetter = keepSetter)

object NullableMember : StructMemberModifier() {
	override val isSpecial = true
	override fun validate(member: StructMember) {
		if ( member.nativeType !is PointerType )
			throw IllegalArgumentException("The nullable modifier can only be applied on pointer types.")
	}
}
/** Marks a pointer member as nullable. */
val Struct.nullable: NullableMember get() = NullableMember