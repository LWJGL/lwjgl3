/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import opengl.BufferType.*

val ARB_draw_instanced = "ARBDrawInstanced".nativeClassGL("ARB_draw_instanced", postfix = ARB) {
    void(
        "DrawArraysInstancedARB",

        GLenum("mode"),
        GLint("first"),
        GLsizei("count"),
        GLsizei("primcount")
    )

    void(
        "DrawElementsInstancedARB",

        GLenum("mode"),
        AutoSizeShr("GLChecks.typeToByteShift(type)", "indices")..GLsizei("count"),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum("type"),
        RawPointer..void.const.p("indices"),
        GLsizei("primcount")
    )
}