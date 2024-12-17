/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_bindless_multi_draw_indirect_count = "NVBindlessMultiDrawIndirectCount".nativeClassGL("NV_bindless_multi_draw_indirect_count", postfix = NV) {
    void(
        "MultiDrawArraysIndirectBindlessCountNV",

        GLenum("mode"),
        Check("maxDrawCount * (stride == 0 ? (16 + vertexBufferCount * 24) : stride)")..RawPointer..void.const.p("indirect"),
        GLintptr("drawCount"),
        GLsizei("maxDrawCount"),
        GLsizei("stride"),
        GLint("vertexBufferCount")
    )

    void(
        "MultiDrawElementsIndirectBindlessCountNV",

        GLenum("mode"),
        GLenum("type"),
        Check("maxDrawCount * (stride == 0 ? ((vertexBufferCount + 2) * 24) : stride)")..RawPointer..void.const.p("indirect"),
        GLintptr("drawCount"),
        GLsizei("maxDrawCount"),
        GLsizei("stride"),
        GLint("vertexBufferCount")
    )
}