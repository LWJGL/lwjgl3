/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl

import org.lwjgl.generator.*

class BufferObject(val binding: String) : ParameterModifier {
    override val isSpecial = true
    override fun validate(param: Parameter) {
        if (!((param.nativeType is PointerType && param.nativeType.mapping !== PointerMapping.OPAQUE_POINTER) || param.nativeType.mapping === PrimitiveMapping.POINTER))
            throw IllegalArgumentException("The BufferObject modifier can only be applied on data pointer types or long primitives.")

        when (this) {
            PIXEL_PACK_BUFFER, QUERY_BUFFER_AMD -> {
                if (param.paramType !== ParameterType.OUT)
                    throw IllegalArgumentException("The specified BufferObject modifier can only be applied on output parameters.")
            }
            else                                -> {
                if (param.paramType !== ParameterType.IN)
                    throw IllegalArgumentException("The specified BufferObject modifier can only be applied on input parameters.")
            }
        }
    }
}

val ARRAY_BUFFER = BufferObject("GL15.GL_ARRAY_BUFFER_BINDING")
val ELEMENT_ARRAY_BUFFER = BufferObject("GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING")
val PIXEL_PACK_BUFFER = BufferObject("GL21.GL_PIXEL_PACK_BUFFER_BINDING")
val PIXEL_UNPACK_BUFFER = BufferObject("GL21.GL_PIXEL_UNPACK_BUFFER_BINDING")
val DRAW_INDIRECT_BUFFER = BufferObject("GL40.GL_DRAW_INDIRECT_BUFFER_BINDING")
val DISPATCH_INDIRECT_BUFFER = BufferObject("GL43.GL_DISPATCH_INDIRECT_BUFFER_BINDING")

val QUERY_BUFFER_AMD = BufferObject("AMDQueryBufferObject.GL_QUERY_BUFFER_BINDING_AMD")