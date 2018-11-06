/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_memory_object_fd = "EXTMemoryObjectFD".nativeClassGL("EXT_memory_object_fd", postfix = EXT) {
    documentation =
        """
        Native bindings to the ${registryLink("EXT_external_objects_fd")} extension.

        Building upon the OpenGL memory object and semaphore framework defined in ${registryLinkTo("EXT", "external_objects")} this extension enables an OpenGL
        application to import a memory object or semaphore from POSIX file descriptor external handles.

        Requires ${EXT_memory_object.link} and ${ARB_texture_storage.link} or a version of OpenGL that incorporates it.
        """

    IntConstant(
        "Accepted by the {@code handleType} parameter of #ImportMemoryFdEXT()",

        "HANDLE_TYPE_OPAQUE_FD_EXT"..0x9586
    )

    void(
        "ImportMemoryFdEXT",
        "",

        GLuint("memory", ""),
        GLuint64("size", ""),
        GLenum("handleType", ""),
        GLint("fd", "")
    )
}

val EXT_semaphore_fd = "EXTSemaphoreFD".nativeClassGL("EXT_semaphore_fd", postfix = EXT) {
    documentation =
        """
        Native bindings to the ${registryLink("EXT_external_objects_fd")} extension.

        Building upon the OpenGL memory object and semaphore framework defined in ${registryLinkTo("EXT", "external_objects")} this extension enables an OpenGL
        application to import a memory object or semaphore from POSIX file descriptor external handles.

        Requires ${EXT_semaphore.link} and ${ARB_texture_storage.link} or a version of OpenGL that incorporates it.
        """

    IntConstant(
        "Accepted by the {@code handleType} parameter of #ImportSemaphoreFdEXT().",

        "HANDLE_TYPE_OPAQUE_FD_EXT"..0x9586
    )

    void(
        "ImportSemaphoreFdEXT",
        "",

        GLuint("semaphore", ""),
        GLenum("handleType", ""),
        GLint("fd", "")
    )
}