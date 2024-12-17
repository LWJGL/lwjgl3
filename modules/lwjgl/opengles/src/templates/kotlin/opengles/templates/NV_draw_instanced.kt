/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*
import opengles.BufferType.*

val NV_draw_instanced = "NVDrawInstanced".nativeClassGLES("NV_draw_instanced", postfix = NV) {
    void(
        "DrawArraysInstancedNV",

        GLenum("mode"),
        GLint("first"),
        GLsizei("count"),
        GLsizei("primcount")
    )

    void(
        "DrawElementsInstancedNV",

        GLenum("mode"),
        AutoSizeShr("GLESChecks.typeToByteShift(type)", "indices")..GLsizei("count"),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum("type"),
        RawPointer..void.const.p("indices"),
        GLsizei("primcount")
    )
}