/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*
import opengles.BufferType.*

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

        GLenum("mode", ""),
        GLint("first", ""),
        GLsizei("count", ""),
        GLsizei("primcount", "")
    )

    void(
        "DrawElementsInstancedNV",
        "",

        GLenum("mode", ""),
        AutoSizeShr("GLESChecks.typeToByteShift(type)", "indices")..GLsizei("count", ""),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum(
            "type",
            "#UNSIGNED_BYTE #UNSIGNED_SHORT #UNSIGNED_INT"
        ),
        RawPointer..void.const.p("indices", ""),
        GLsizei("primcount", "")
    )
}