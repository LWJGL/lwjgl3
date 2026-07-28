/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val APPLE_flush_buffer_range = "APPLEFlushBufferRange".nativeClassGL("APPLE_flush_buffer_range") {
    IntConstant(
        "BUFFER_SERIALIZED_MODIFY_APPLE"..0x8A12,
        "BUFFER_FLUSHING_UNMAP_APPLE"..0x8A13
    )

    void(
        "BufferParameteriAPPLE",

        GLenum("target"),
        GLenum("pname"),
        GLint("param")
    )

    void(
        "FlushMappedBufferRangeAPPLE",

        GLenum("target"),
        GLintptr("offset"),
        GLsizeiptr("size")
    )
}