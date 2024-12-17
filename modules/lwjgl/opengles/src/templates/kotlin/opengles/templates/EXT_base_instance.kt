/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*
import opengles.BufferType.*

val EXT_base_instance = "EXTBaseInstance".nativeClassGLES("EXT_base_instance", postfix = EXT) {
    void(
        "DrawArraysInstancedBaseInstanceEXT",

        GLenum("mode"),
        GLint("first"),
        GLsizei("count"),
        GLsizei("instancecount"),
        GLuint("baseinstance")
    )

    void(
        "DrawElementsInstancedBaseInstanceEXT",

        GLenum("mode"),
        AutoSizeShr("GLESChecks.typeToByteShift(type)", "indices")..GLsizei("count"),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum("type"),
        RawPointer..void.const.p("indices"),
        GLsizei("instancecount"),
        GLuint("baseinstance")
    )

    void(
        "DrawElementsInstancedBaseVertexBaseInstanceEXT",

        GLenum("mode"),
        AutoSizeShr("GLESChecks.typeToByteShift(type)", "indices")..GLsizei("count"),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum("type"),
        RawPointer..void.const.p("indices"),
        GLsizei("instancecount"),
        GLint("basevertex"),
        GLuint("baseinstance")
    )
}