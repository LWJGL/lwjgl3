/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_buffer_storage = "EXTBufferStorage".nativeClassGLES("EXT_buffer_storage", postfix = EXT) {
    IntConstant(
        "MAP_PERSISTENT_BIT_EXT"..0x0040,
        "MAP_COHERENT_BIT_EXT"..0x0080,
        "DYNAMIC_STORAGE_BIT_EXT"..0x0100,
        "CLIENT_STORAGE_BIT_EXT"..0x0200
    )

    IntConstant(
        "BUFFER_IMMUTABLE_STORAGE_EXT"..0x821F,
        "BUFFER_STORAGE_FLAGS_EXT"..0x8220
    )

    IntConstant(
        "CLIENT_MAPPED_BUFFER_BARRIER_BIT_EXT"..0x00004000
    )

    void(
        "BufferStorageEXT",

        GLenum("target"),
        AutoSize("data")..GLsizeiptr("size"),
        optional..MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT
        )..void.const.p("data"),
        GLbitfield("flags")
    )
}