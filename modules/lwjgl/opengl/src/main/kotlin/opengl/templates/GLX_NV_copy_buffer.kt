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
        GLXContext.IN("readCtx", ""),
        GLXContext.IN("writeCtx", ""),
        GLenum.IN("readTarget", ""),
        GLenum.IN("writeTarget", ""),
        GLintptr.IN("readOffset", ""),
        GLintptr.IN("writeOffset", ""),
        GLsizeiptr.IN("size", "")
    )

    void(
        "NamedCopyBufferSubDataNV",
        "",

        DISPLAY,
        GLXContext.IN("readCtx", ""),
        GLXContext.IN("writeCtx", ""),
        GLuint.IN("readBuffer", ""),
        GLuint.IN("writeBuffer", ""),
        GLintptr.IN("readOffset", ""),
        GLintptr.IN("writeOffset", ""),
        GLsizeiptr.IN("size", "")
    )
}