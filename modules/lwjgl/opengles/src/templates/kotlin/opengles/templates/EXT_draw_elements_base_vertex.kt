/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*
import opengles.BufferType.*

val EXT_draw_elements_base_vertex = "EXTDrawElementsBaseVertex".nativeClassGLES("EXT_draw_elements_base_vertex", postfix = EXT) {
    void(
        "DrawElementsBaseVertexEXT",

        GLenum("mode"),
        AutoSizeShr("GLESChecks.typeToByteShift(type)", "indices")..GLsizei("count"),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum("type"),
        RawPointer..void.const.p("indices"),
        GLint("basevertex")
    )

    DependsOn("GLES30")..void(
        "DrawRangeElementsBaseVertexEXT",

        GLenum("mode"),
        GLuint("start"),
        GLuint("end"),
        AutoSizeShr("GLESChecks.typeToByteShift(type)", "indices")..GLsizei("count"),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum("type"),
        RawPointer..void.const.p("indices"),
        GLint("basevertex")
    )

    DependsOn("GLES30")..void(
        "DrawElementsInstancedBaseVertexEXT",

        GLenum("mode"),
        AutoSizeShr("GLESChecks.typeToByteShift(type)", "indices")..GLsizei("count"),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum("type"),
        RawPointer..void.const.p("indices"),
        GLsizei("instancecount"),
        GLint("basevertex")
    )

    DependsOn("GL_EXT_multi_draw_arrays")..void(
        "MultiDrawElementsBaseVertexEXT",

        GLenum("mode"),
        GLsizei.const.p("count"),
        GLenum("type"),
        void.const.p.const.p("indices"),
        AutoSize("count", "indices", "basevertex")..GLsizei("drawcount"),
        GLint.const.p("basevertex")
    )
}