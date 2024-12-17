/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_memory_object_fd = "EXTMemoryObjectFD".nativeClassGLES("EXT_memory_object_fd", postfix = EXT) {
    IntConstant(
        "HANDLE_TYPE_OPAQUE_FD_EXT"..0x9586
    )

    void(
        "ImportMemoryFdEXT",

        GLuint("memory"),
        GLuint64("size"),
        GLenum("handleType"),
        GLint("fd")
    )
}

val EXT_semaphore_fd = "EXTSemaphoreFD".nativeClassGLES("EXT_semaphore_fd", postfix = EXT) {
    IntConstant(
        "HANDLE_TYPE_OPAQUE_FD_EXT"..0x9586
    )

    void(
        "ImportSemaphoreFdEXT",

        GLuint("semaphore"),
        GLenum("handleType"),
        GLint("fd")
    )
}