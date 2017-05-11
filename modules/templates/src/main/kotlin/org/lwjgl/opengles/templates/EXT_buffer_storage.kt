/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_buffer_storage = "EXTBufferStorage".nativeClassGLES("EXT_buffer_storage", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        OpenGL ES has long supported buffer objects as a means of storing data that may be used to source vertex attributes, pixel data for textures, uniforms
        and other elements. In un-extended ES, buffer data stores are mutable - that is, they may be de-allocated or resized while they are in use. The
        GL_EXT_texture_storage extension added immutable storage for texture objects (and was subsequently incorporated into OpenGL ES 3.0). This extension
        further applies the concept of immutable storage to buffer objects. If an implementation is aware of a buffer's immutability, it may be able to make
        certain assumptions or apply particular optimizations in order to increase performance or reliability.

        Furthermore, this extension allows applications to pass additional information about a requested allocation to the implementation which it may use to
        select memory heaps, caching behavior or allocation strategies.

        Finally, this extension introduces the concept of persistent client mappings of buffer objects, which allow clients to retain pointers to a buffer's
        data store returned as the result of a mapping, and to issue drawing commands while those mappings are in place.

        Requires ${GLES31.core}.
        """

    IntConstant(
        "Accepted in the {@code flags} parameter of BufferStorageEXT and NamedBufferStorageEXT.",

        "MAP_PERSISTENT_BIT_EXT"..0x0040,
        "MAP_COHERENT_BIT_EXT"..0x0080,
        "DYNAMIC_STORAGE_BIT_EXT"..0x0100,
        "CLIENT_STORAGE_BIT_EXT"..0x0200
    )

    IntConstant(
        """
        MAP_PERSISTENT_BIT_EXT 0x0040 (as above) MAP_COHERENT_BIT_EXT 0x0080 (as above) Accepted by the {@code pname} parameter of GetBufferParameter{i|i64}v.
        """,

        "BUFFER_IMMUTABLE_STORAGE_EXT"..0x821F,
        "BUFFER_STORAGE_FLAGS_EXT"..0x8220
    )

    IntConstant(
        "Accepted by the {@code barriers} parameter of MemoryBarrier.",

        "CLIENT_MAPPED_BUFFER_BARRIER_BIT_EXT"..0x00004000
    )

    void(
        "BufferStorageEXT",
        "",

        GLenum.IN("target", ""),
        AutoSize("data")..GLsizeiptr.IN("size", ""),
        optional..MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT
        )..const..void_p.IN("data", ""),
        GLbitfield.IN("flags", "")
    )
}