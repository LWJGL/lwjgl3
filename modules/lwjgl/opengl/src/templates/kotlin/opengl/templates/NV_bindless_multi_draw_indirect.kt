/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_bindless_multi_draw_indirect = "NVBindlessMultiDrawIndirect".nativeClassGL("NV_bindless_multi_draw_indirect", postfix = NV) {
    void(
        "MultiDrawArraysIndirectBindlessNV",

        GLenum("mode"),
        Check("drawCount * (stride == 0 ? (16 + vertexBufferCount * 24) : stride)")..RawPointer..void.const.p("indirect"),
        GLsizei("drawCount"),
        GLsizei("stride"),
        GLint("vertexBufferCount")
    )

    void(
        "MultiDrawElementsIndirectBindlessNV",

        GLenum("mode"),
        GLenum("type"),
        Check("drawCount * (stride == 0 ? ((vertexBufferCount + 2) * 24) : stride)")..RawPointer..void.const.p("indirect"),
        GLsizei("drawCount"),
        GLsizei("stride"),
        GLint("vertexBufferCount")
    )
}