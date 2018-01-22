/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.opengl.BufferType.*

val EXT_draw_instanced = "EXTDrawInstanced".nativeClassGL("EXT_draw_instanced", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides the means to render multiple instances of an object with a single draw call, and an "instance ID" variable which can be used by
        the vertex program to compute per-instance values, typically an object's transform.

        Requires ${GL20.core}.
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
        AutoSizeShr("GLChecks.typeToByteShift(type)", "indices")..GLsizei.IN("count", ""),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum.IN("type", ""),
        ELEMENT_ARRAY_BUFFER..const..void_p.IN("indices", ""),
        GLsizei.IN("primcount", "")
    )
}