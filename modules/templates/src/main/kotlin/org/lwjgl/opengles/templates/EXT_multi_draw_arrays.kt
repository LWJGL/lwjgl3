/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_multi_draw_arrays = "EXTMultiDrawArrays".nativeClassGLES("EXT_multi_draw_arrays", postfix = EXT) {
    documentation =
        """
        Native bindings to the ${registryLink("EXT", "multi_draw_arrays")} extension.

        These functions behave identically to the standard OpenGL 1.1 functions glDrawArrays() and glDrawElements() except they handle multiple lists of
        vertices in one call. Their main purpose is to allow one function call to render more than one primitive such as triangle strip, triangle fan, etc.
        """

    void(
        "MultiDrawArraysEXT",
        "",

        GLenum.IN("mode", ""),
        const..GLint_p.IN("first", ""),
        const..GLsizei_p.IN("count", ""),
        AutoSize("first", "count")..GLsizei.IN("primcount", "")
    )

    void(
        "MultiDrawElementsEXT",
        "",

        GLenum.IN("mode", ""),
        const..GLsizei_p.IN("count", ""),
        GLenum.IN("type", ""),
        const..void_p.const.p.IN("indices", ""),
        AutoSize("count", "indices")..GLsizei.IN("primcount", "")
    )
}