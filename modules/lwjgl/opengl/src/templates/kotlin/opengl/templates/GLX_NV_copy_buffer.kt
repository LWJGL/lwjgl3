/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.linux.*

val GLX_NV_copy_buffer = "GLXNVCopyBuffer".nativeClassGLX("GLX_NV_copy_buffer", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Extends ${ARB_copy_buffer.link} to have GLX bindings.
        """

    void(
        "CopyBufferSubDataNV",
        "",

        DISPLAY,
        GLXContext("readCtx", ""),
        GLXContext("writeCtx", ""),
        GLenum("readTarget", ""),
        GLenum("writeTarget", ""),
        GLintptr("readOffset", ""),
        GLintptr("writeOffset", ""),
        GLsizeiptr("size", "")
    )

    void(
        "NamedCopyBufferSubDataNV",
        "",

        DISPLAY,
        GLXContext("readCtx", ""),
        GLXContext("writeCtx", ""),
        GLuint("readBuffer", ""),
        GLuint("writeBuffer", ""),
        GLintptr("readOffset", ""),
        GLintptr("writeOffset", ""),
        GLsizeiptr("size", "")
    )
}