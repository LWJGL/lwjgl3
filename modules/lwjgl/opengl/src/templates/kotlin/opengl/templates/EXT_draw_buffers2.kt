/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

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

        GLuint("index", ""),
        GLboolean("r", ""),
        GLboolean("g", ""),
        GLboolean("b", ""),
        GLboolean("a", "")
    )

    void(
        "GetBooleanIndexedvEXT",
        "",

        GLenum("target", ""),
        GLuint("index", ""),
        Check(1)..ReturnParam..GLboolean.p("data", "")
    )

    void(
        "GetIntegerIndexedvEXT",
        "",

        GLenum("target", ""),
        GLuint("index", ""),
        Check(1)..ReturnParam..GLint.p("data", "")
    )

    void(
        "EnableIndexedEXT",
        "",

        GLenum("target", ""),
        GLuint("index", "")
    )

    void(
        "DisableIndexedEXT",
        "",

        GLenum("target", ""),
        GLuint("index", "")
    )

    GLboolean(
        "IsEnabledIndexedEXT",
        "",

        GLenum("target", ""),
        GLuint("index", "")
    )
}