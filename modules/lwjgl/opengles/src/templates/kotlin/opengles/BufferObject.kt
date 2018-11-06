/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles

import org.lwjgl.generator.*

class BufferObject(val binding: String) : ParameterModifier {
    override val isSpecial = true
    override fun validate(param: Parameter) {
        if (!param.nativeType.isPointer || param.nativeType.isPointerHandle)
            throw IllegalArgumentException("The BufferObject modifier can only be applied to data pointer types or long primitives.")

        when (this) {
            PIXEL_PACK_BUFFER -> {
                if (param.isInput)
                    throw IllegalArgumentException("The specified BufferObject modifier can only be applied to output parameters.")
            }
            else              -> {
                if (!param.isInput)
                    throw IllegalArgumentException("The specified BufferObject modifier can only be applied to input parameters.")
            }
        }
    }
}

val ARRAY_BUFFER = BufferObject("GLES20.GL_ARRAY_BUFFER_BINDING")
val ELEMENT_ARRAY_BUFFER = BufferObject("GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING")
val PIXEL_PACK_BUFFER = BufferObject("GLES30.GL_PIXEL_PACK_BUFFER_BINDING")
val PIXEL_UNPACK_BUFFER = BufferObject("GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING")
val DRAW_INDIRECT_BUFFER = BufferObject("GLES31.GL_DRAW_INDIRECT_BUFFER_BINDING")