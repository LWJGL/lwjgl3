/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*
import org.lwjgl.opengles.BufferType.*

val NV_draw_instanced = "NVDrawInstanced".nativeClassGLES("NV_draw_instanced", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        A common use case in GL for some applications is to be able to draw the same object, or groups of similar objects that share vertex data, primitive
        count and type, multiple times. This extension provides a means of accelerating such use cases while limiting the number of required API calls, and
        keeping the amount of duplicate data to a minimum.

        This extension introduces two draw calls which are conceptually equivalent to a series of draw calls. Each conceptual call in this series is considered
        an "instance" of the actual draw call.

        This extension also introduces a read-only built-in variable to GLSL which contains the "instance ID." This variable initially contains 0, but
        increases by one after each conceptual draw call.

        By using the instance ID or multiples thereof as an index into a uniform array containing transform data, vertex shaders can draw multiple instances of
        an object with a single draw call.

        Requires ${GLES20.core}.
        """

    void(
        "DrawArraysInstancedNV",
        "",

        GLenum.IN("mode", ""),
        GLint.IN("first", ""),
        GLsizei.IN("count", ""),
        GLsizei.IN("primcount", "")
    )

    void(
        "DrawElementsInstancedNV",
        "",

        GLenum.IN("mode", ""),
        AutoSizeShr("GLESChecks.typeToByteShift(type)", "indices")..GLsizei.IN("count", ""),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum.IN(
            "type",
            "#UNSIGNED_BYTE #UNSIGNED_SHORT #UNSIGNED_INT"
        ),
        ELEMENT_ARRAY_BUFFER..const..void_p.IN("indices", ""),
        GLsizei.IN("primcount", "")
    )
}