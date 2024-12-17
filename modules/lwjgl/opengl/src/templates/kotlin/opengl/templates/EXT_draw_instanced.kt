/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import opengl.BufferType.*

val EXT_draw_instanced = "EXTDrawInstanced".nativeClassGL("EXT_draw_instanced", postfix = EXT) {
    void(
        "DrawArraysInstancedEXT",

        GLenum("mode"),
        GLint("start"),
        GLsizei("count"),
        GLsizei("primcount")
    )

    void(
        "DrawElementsInstancedEXT",

        GLenum("mode"),
        AutoSizeShr("GLChecks.typeToByteShift(type)", "indices")..GLsizei("count"),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum("type"),
        RawPointer..void.const.p("indices"),
        GLsizei("primcount")
    )
}