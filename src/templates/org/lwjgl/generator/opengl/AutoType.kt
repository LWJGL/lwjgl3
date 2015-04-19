/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator.opengl

import org.lwjgl.generator.*

enum class BufferType(val mapping: PointerMapping, val className: String = "GL11") {

	GL_UNSIGNED_BYTE: BufferType(PointerMapping.DATA_BYTE)
	GL_UNSIGNED_SHORT: BufferType(PointerMapping.DATA_SHORT)
	GL_UNSIGNED_INT: BufferType(PointerMapping.DATA_INT)
	GL_UNSIGNED_LONG: BufferType(PointerMapping.DATA_LONG)

	GL_BYTE: BufferType(PointerMapping.DATA_BYTE)
	GL_SHORT: BufferType(PointerMapping.DATA_SHORT)
	GL_INT: BufferType(PointerMapping.DATA_INT)
	GL_LONG: BufferType(PointerMapping.DATA_LONG)

	GL_HALF_FLOAT: BufferType(PointerMapping.DATA_SHORT, "GL30")
	GL_FLOAT: BufferType(PointerMapping.DATA_FLOAT)
	GL_DOUBLE: BufferType(PointerMapping.DATA_DOUBLE)

	GL_2_BYTES: BufferType(PointerMapping.DATA_BYTE)
	GL_3_BYTES: BufferType(PointerMapping.DATA_BYTE)
	GL_4_BYTES: BufferType(PointerMapping.DATA_BYTE)

}

class AutoType(override val reference: String, vararg val types: BufferType): ParameterModifier(), ReferenceModifier {
	companion object: ModifierKey<AutoType>

	override val isSpecial = false

	init {
		if ( types.isEmpty() )
			throw IllegalArgumentException("No buffer types specified.")
	}

	override fun validate(param: Parameter) {
		if ( param.nativeType.name != "GLenum" )
			throw IllegalArgumentException("The AutoType modifier can only be applied on GLenum parameters.")
	}
}