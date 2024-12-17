/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*
import opengles.BufferType.*

val ANGLE_instanced_arrays = "ANGLEInstancedArrays".nativeClassGLES("ANGLE_instanced_arrays", postfix = ANGLE) {
    IntConstant(
        "VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE"..0x88FE
    )

    void(
        "DrawArraysInstancedANGLE",

        GLenum("mode"),
        GLint("first"),
        GLsizei("count"),
        GLsizei("primcount")
    )

    void(
        "DrawElementsInstancedANGLE",

        GLenum("mode"),
        AutoSizeShr("GLESChecks.typeToByteShift(type)", "indices")..GLsizei("count"),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum("type"),
        RawPointer..void.const.p("indices"),
        GLsizei("primcount")
    )

    void(
        "VertexAttribDivisorANGLE",

        GLuint("index"),
        GLuint("divisor")
    )
}