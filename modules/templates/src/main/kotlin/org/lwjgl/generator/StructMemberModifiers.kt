/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

class AutoSizeMember(
	override val reference: String,
	vararg val dependent: String,
	/** If not null, the expression will be appended to the parameter. */
	val factor: AutoSizeFactor?
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

	private val String.remaining: String get() =  "$this != null ? $this.remaining() : 0"

	fun getExpression(): String {
		if ( dependent.isEmpty() )
			return reference.remaining

		val builder = StringBuilder()
		(sequenceOf(reference) + dependent.asSequence()).toList().let { refs ->
			refs.asSequence().forEachIndexed { i, ref ->
				builder
					.append("$ref != null ? $ref.remaining() : ")
					.append(if ( i == refs.lastIndex ) "0" else "(")
			}
			for ( i in 2..refs.size )
				builder.append(")")
		}

		return builder.toString()
	}


}
fun Struct.AutoSize(
	reference: String,
	vararg dependent: String,
	factor: AutoSizeFactor? = null
) = AutoSizeMember(reference, *dependent, factor = factor)