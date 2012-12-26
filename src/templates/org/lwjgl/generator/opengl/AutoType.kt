/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator.opengl

import org.lwjgl.generator.*
import org.lwjgl.opengl.GLenum
import java.nio.*

public enum class BufferType(val mapping: PointerMapping) {

	GL_UNSIGNED_BYTE: BufferType(PointerMapping.DATA_BYTE)
	GL_UNSIGNED_SHORT: BufferType(PointerMapping.DATA_SHORT)
	GL_UNSIGNED_INT: BufferType(PointerMapping.DATA_INT)
	GL_UNSIGNED_LONG: BufferType(PointerMapping.DATA_LONG)

	GL_BYTE: BufferType(PointerMapping.DATA_BYTE)
	GL_SHORT: BufferType(PointerMapping.DATA_SHORT)
	GL_INT: BufferType(PointerMapping.DATA_INT)
	GL_LONG: BufferType(PointerMapping.DATA_LONG)

	GL_FLOAT: BufferType(PointerMapping.DATA_FLOAT)
	GL_DOUBLE: BufferType(PointerMapping.DATA_DOUBLE)

	GL_2_BYTES: BufferType(PointerMapping.DATA_BYTE)
	GL_3_BYTES: BufferType(PointerMapping.DATA_BYTE)
	GL_4_BYTES: BufferType(PointerMapping.DATA_BYTE)

}

public class AutoType(reference: String, vararg val types: BufferType) : ReferenceModifier(reference) {
	class object {
		val CLASS = javaClass<AutoType>()
	}

	{
		if ( types.isEmpty() )
			throw IllegalArgumentException("No buffer types specified.")
	}

	override fun validate(ttype: TemplateElement) {
		if ( ttype !is Parameter )
			throw IllegalArgumentException("The AutoType modifier can only be applied on parameters.")

		val param = ttype as Parameter
		if ( param.nativeType != GLenum )
			throw IllegalArgumentException("The AutoType modifier can only be applied on GLenum parameters.")
	}
}