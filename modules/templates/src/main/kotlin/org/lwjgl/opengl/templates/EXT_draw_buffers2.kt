/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_draw_buffers2 = "EXTDrawBuffers2".nativeClassGL("EXT_draw_buffers2", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension builds upon the ARB_draw_buffers extension and provides separate blend enables and color write masks for each color output. In
        ARB_draw_buffers (part of OpenGL 2.0), separate values can be written to each color buffer, but the blend enable and color write mask are global and
        apply to all color outputs.

        While this extension does provide separate blend enables, it does not provide separate blend functions or blend equations per color output.

        Requires ${GL20.core}.
        """

    void(
        "ColorMaskIndexedEXT",
        "",

        GLuint.IN("index", ""),
        GLboolean.IN("r", ""),
        GLboolean.IN("g", ""),
        GLboolean.IN("b", ""),
        GLboolean.IN("a", "")
    )

    void(
        "GetBooleanIndexedvEXT",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", ""),
        Check(1)..ReturnParam..GLboolean_p.OUT("data", "")
    )

    void(
        "GetIntegerIndexedvEXT",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", ""),
        Check(1)..ReturnParam..GLint_p.OUT("data", "")
    )

    void(
        "EnableIndexedEXT",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", "")
    )

    void(
        "DisableIndexedEXT",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", "")
    )

    GLboolean(
        "IsEnabledIndexedEXT",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", "")
    )
}