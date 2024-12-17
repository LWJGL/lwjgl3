/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_external_buffer = "EXTExternalBuffer".nativeClassGLES("EXT_external_buffer", postfix = EXT) {
    void(
        "BufferStorageExternalEXT",

        GLenum("target"),
        GLintptr("offset"),
        GLsizeiptr("size"),
        GLeglClientBufferEXT("clientBuffer"),
        GLbitfield("flags")
    )

    DependsOn("hasDSA(ext)")..void(
        "NamedBufferStorageExternalEXT",

        GLuint("buffer"),
        GLintptr("offset"),
        GLsizeiptr("size"),
        GLeglClientBufferEXT("clientBuffer"),
        GLbitfield("flags")
    )
}