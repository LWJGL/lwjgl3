/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_map_buffer_range = "EXTMapBufferRange".nativeClassGLES("EXT_map_buffer_range", postfix = EXT) {
    IntConstant(
        "MAP_READ_BIT_EXT"..0x0001,
        "MAP_WRITE_BIT_EXT"..0x0002,
        "MAP_INVALIDATE_RANGE_BIT_EXT"..0x0004,
        "MAP_INVALIDATE_BUFFER_BIT_EXT"..0x0008,
        "MAP_FLUSH_EXPLICIT_BIT_EXT"..0x0010,
        "MAP_UNSYNCHRONIZED_BIT_EXT"..0x0020
    )

    MapPointer("length", oldBufferOverloads = true)..void.p(
        "MapBufferRangeEXT",

        GLenum("target"),
        GLintptr("offset"),
        GLsizeiptr("length"),
        GLbitfield("access")
    )

    void(
        "FlushMappedBufferRangeEXT",

        GLenum("target"),
        GLintptr("offset"),
        GLsizeiptr("length")
    )
}