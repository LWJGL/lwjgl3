/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator.opengl

import org.lwjgl.generator.*

public class BufferObject(public val binding: String) : TemplateModifier {
	class object {
		val CLASS = javaClass<BufferObject>()
	}

	override val isSpecial: Boolean = true
	override fun validate(ttype: TemplateElement) {
		if ( ttype !is Parameter )
			throw IllegalArgumentException("The returnValue modifier can only be applied on parameters.")

		val param = ttype as Parameter
		if ( param.nativeType !is PointerType )
			throw IllegalArgumentException("The BufferObject modifier can only be applied on pointer types.")

		if ( (param.nativeType : PointerType).mapping == PointerMapping.NAKED_POINTER )
			throw IllegalArgumentException("The BufferObject modifier cannot be applied on naked pointer types.")

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

public val ARRAY_BUFFER: BufferObject = BufferObject("0x8894")
public val ELEMENT_ARRAY_BUFFER: BufferObject = BufferObject("0x8895")
public val PIXEL_PACK_BUFFER: BufferObject = BufferObject("0x88ED")
public val PIXEL_UNPACK_BUFFER: BufferObject = BufferObject("0x88EF")
public val DRAW_INDIRECT_BUFFER: BufferObject = BufferObject("0x8F43")
public val UNIFORM_BUFFER_BINDING: BufferObject = BufferObject("0x8A28")
public val TRANSFORM_FEEDBACK_BUFFER: BufferObject = BufferObject("0x8C8F")
public val SHADER_STORAGE_BUFFER: BufferObject = BufferObject("0x90D3")
public val ATOMIC_COUNTER_BUFFER: BufferObject = BufferObject("0x92C1")
public val DISPATCH_INDIRECT_BUFFER: BufferObject = BufferObject("0x90EF")

public val QUERY_BUFFER_AMD: BufferObject = BufferObject("0x9193")
public val VIDEO_BUFFER_NV: BufferObject = BufferObject("0x9021")