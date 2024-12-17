/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*
import opengles.BufferType.*

val OES_draw_elements_base_vertex = "OESDrawElementsBaseVertex".nativeClassGLES("OES_draw_elements_base_vertex", postfix = OES) {
    void(
        "DrawElementsBaseVertexOES",

        GLenum("mode"),
        AutoSizeShr("GLESChecks.typeToByteShift(type)", "indices")..GLsizei("count"),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum("type"),
        RawPointer..void.const.p("indices"),
        GLint("basevertex")
    )

    DependsOn("GLES30")..void(
        "DrawRangeElementsBaseVertexOES",

        GLenum("mode"),
        GLuint("start"),
        GLuint("end"),
        AutoSizeShr("GLESChecks.typeToByteShift(type)", "indices")..GLsizei("count"),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum("type"),
        RawPointer..void.const.p("indices"),
        GLint("basevertex")
    )

    DependsOn("GLES30")..void(
        "DrawElementsInstancedBaseVertexOES",

        GLenum("mode"),
        AutoSizeShr("GLESChecks.typeToByteShift(type)", "indices")..GLsizei("count"),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum("type"),
        RawPointer..void.const.p("indices"),
        GLsizei("instancecount"),
        GLint("basevertex")
    )

    DependsOn("EXT_multi_draw_arrays")..void(
        "MultiDrawElementsBaseVertexOES",

        GLenum("mode"),
        GLsizei.const.p("count"),
        GLenum("type"),
        void.const.p.const.p("indices"),
        AutoSize("count", "indices", "basevertex")..GLsizei("drawcount"),
        GLint.const.p("basevertex")
    )
}