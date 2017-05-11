/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_pixel_buffer_object = "EXTPixelBufferObject".nativeClassGL("EXT_pixel_buffer_object", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension expands on the interface provided by buffer objects. It is intended to permit buffer objects to be used not only with vertex array data,
        but also with pixel data. Buffer objects were promoted from the ARB_vertex_buffer_object extension in OpenGL 1.5.
        """

    IntConstant(
        """
        Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferParameteriv, and
        GetBufferPointerv.
        """,

        "PIXEL_PACK_BUFFER_EXT"..0x88EB,
        "PIXEL_UNPACK_BUFFER_EXT"..0x88EC
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "PIXEL_PACK_BUFFER_BINDING_EXT"..0x88ED,
        "PIXEL_UNPACK_BUFFER_BINDING_EXT"..0x88EF
    )
}