/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_multi_draw_arrays = "EXTMultiDrawArrays".nativeClassGLES("EXT_multi_draw_arrays", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        These functions behave identically to the standard OpenGL 1.1 functions glDrawArrays() and glDrawElements() except they handle multiple lists of
        vertices in one call. Their main purpose is to allow one function call to render more than one primitive such as triangle strip, triangle fan, etc.
        """

    void(
        "MultiDrawArraysEXT",
        "",

        GLenum("mode", ""),
        GLint.const.p("first", ""),
        GLsizei.const.p("count", ""),
        AutoSize("first", "count")..GLsizei("drawcount", "")
    )

    void(
        "MultiDrawElementsEXT",
        "",

        GLenum("mode", ""),
        GLsizei.const.p("count", ""),
        GLenum("type", ""),
        void.const.p.const.p("indices", ""),
        AutoSize("count", "indices")..GLsizei("drawcount", "")
    )
}