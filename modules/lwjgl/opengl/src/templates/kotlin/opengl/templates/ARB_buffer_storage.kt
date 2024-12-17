/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_buffer_storage = "ARBBufferStorage".nativeClassGL("ARB_buffer_storage") {
    IntConstant(
        "MAP_PERSISTENT_BIT"..0x0040,
        "MAP_COHERENT_BIT"..0x0080,
        "DYNAMIC_STORAGE_BIT"..0x0100,
        "CLIENT_STORAGE_BIT"..0x0200
    )

    IntConstant(
        "BUFFER_IMMUTABLE_STORAGE"..0x821F,
        "BUFFER_STORAGE_FLAGS"..0x8220
    )

    IntConstant(
        "CLIENT_MAPPED_BUFFER_BARRIER_BIT"..0x00004000
    )

    val BufferStorage = reuse(GL44C, "BufferStorage")

    DependsOn("GL_EXT_direct_state_access")..void(
        "NamedBufferStorageEXT",

        GLuint("buffer"),
        BufferStorage["size"],
        BufferStorage["data"],
        BufferStorage["flags"]
    )

}