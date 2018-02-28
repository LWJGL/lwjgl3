/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*
import opengles.BufferType.*

val EXT_draw_instanced = "EXTDrawInstanced".nativeClassGLES("EXT_draw_instanced", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides the means to render multiple instances of an object with a single draw call, and an "instance ID" variable which can be used by
        the vertex program to compute per-instance values, typically an object's transform.
        """

    void(
        "DrawArraysInstancedEXT",
        "",

        GLenum.IN("mode", ""),
        GLint.IN("start", ""),
        GLsizei.IN("count", ""),
        GLsizei.IN("primcount", "")
    )

    void(
        "DrawElementsInstancedEXT",
        "",

        GLenum.IN("mode", ""),
        AutoSizeShr("GLESChecks.typeToByteShift(type)", "indices")..GLsizei.IN("count", ""),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum.IN("type", ""),
        ELEMENT_ARRAY_BUFFER..void.const.p.IN("indices", ""),
        GLsizei.IN("primcount", "")
    )
}