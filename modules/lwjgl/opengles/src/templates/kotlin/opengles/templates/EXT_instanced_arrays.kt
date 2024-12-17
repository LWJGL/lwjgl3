/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*
import opengles.BufferType.*

val EXT_instanced_arrays = "EXTInstancedArrays".nativeClassGLES("EXT_instanced_arrays", postfix = EXT) {
    IntConstant(
        "VERTEX_ATTRIB_ARRAY_DIVISOR_EXT"..0x88FE
    )

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
        AutoSizeShr("GLESChecks.typeToByteShift(type)", "indices")..GLsizei("count"),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum("type"),
        RawPointer..void.const.p("indices"),
        GLsizei("primcount")
    )

    void(
        "VertexAttribDivisorEXT",

        GLuint("index"),
        GLuint("divisor")
    )
}