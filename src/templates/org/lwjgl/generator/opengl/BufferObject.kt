/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator.opengl

import org.lwjgl.generator.*

public class BufferObject(public val binding: String) : ParameterModifier() {
	class object: ModifierObject<BufferObject> {
		override val key = javaClass<BufferObject>()
	}

	override val isSpecial: Boolean = true
	override protected fun validate(param: Parameter) {
		if (
			!(
				(param.nativeType is PointerType && param.nativeType.mapping != PointerMapping.NAKED_POINTER) ||
				param.nativeType.mapping == PrimitiveMapping.PTR
			)
		)
			throw IllegalArgumentException("The BufferObject modifier can only be applied on data pointer types or long primitives.")

		when ( this ) {
			PIXEL_PACK_BUFFER, QUERY_BUFFER_AMD -> {
				if ( param.paramType != ParameterType.OUT )
					throw IllegalArgumentException("The specified BufferObject modifier can only be applied on output parameters.")
			} else -> {
				if ( param.paramType != ParameterType.IN )
					throw IllegalArgumentException("The specified BufferObject modifier can only be applied on input parameters.")
			}
		}
	}
}

public val ARRAY_BUFFER: BufferObject = BufferObject("GL15.GL_ARRAY_BUFFER_BINDING")
public val ELEMENT_ARRAY_BUFFER: BufferObject = BufferObject("GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING")
public val PIXEL_PACK_BUFFER: BufferObject = BufferObject("GL21.GL_PIXEL_PACK_BUFFER_BINDING")
public val PIXEL_UNPACK_BUFFER: BufferObject = BufferObject("GL21.GL_PIXEL_UNPACK_BUFFER_BINDING")
public val DRAW_INDIRECT_BUFFER: BufferObject = BufferObject("GL40.GL_DRAW_INDIRECT_BUFFER_BINDING")
public val UNIFORM_BUFFER_BINDING: BufferObject = BufferObject("GL31.GL_UNIFORM_BUFFER_BINDING")
public val TRANSFORM_FEEDBACK_BUFFER: BufferObject = BufferObject("GL30.GL_TRANSFORM_FEEDBACK_BUFFER_BINDING")
public val SHADER_STORAGE_BUFFER: BufferObject = BufferObject("GL43.GL_SHADER_STORAGE_BUFFER_BINDING")
public val ATOMIC_COUNTER_BUFFER: BufferObject = BufferObject("GL42.GL_ATOMIC_COUNTER_BUFFER_BINDING")
public val DISPATCH_INDIRECT_BUFFER: BufferObject = BufferObject("GL43.GL_DISPATCH_INDIRECT_BUFFER_BINDING")

// TODO: Convert to tokens
public val QUERY_BUFFER_AMD: BufferObject = BufferObject("0x9193")
public val VIDEO_BUFFER_NV: BufferObject = BufferObject("0x9021")