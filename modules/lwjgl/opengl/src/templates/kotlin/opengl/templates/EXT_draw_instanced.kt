/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import opengl.BufferType.*

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

        GLenum("mode", ""),
        GLint("start", ""),
        GLsizei("count", ""),
        GLsizei("primcount", "")
    )

    void(
        "DrawElementsInstancedEXT",
        "",

        GLenum("mode", ""),
        AutoSizeShr("GLChecks.typeToByteShift(type)", "indices")..GLsizei("count", ""),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum("type", ""),
        RawPointer..void.const.p("indices", ""),
        GLsizei("primcount", "")
    )
}