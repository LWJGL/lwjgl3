/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_external_buffer = "EXTExternalBuffer".nativeClassGL("EXT_external_buffer", postfix = EXT) {
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