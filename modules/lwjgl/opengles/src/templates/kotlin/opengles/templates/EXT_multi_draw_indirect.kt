/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_multi_draw_indirect = "EXTMultiDrawIndirect".nativeClassGLES("EXT_multi_draw_indirect", postfix = EXT) {
    void(
        "MultiDrawArraysIndirectEXT",

        GLenum("mode"),
        RawPointer..MultiType(
            PointerMapping.DATA_INT
        )..Check("drawcount * (stride == 0 ? (4 * 4) : stride)")..void.const.p("indirect"),
        GLsizei("drawcount"),
        GLsizei("stride")
    )

    void(
        "MultiDrawElementsIndirectEXT",

        GLenum("mode"),
        GLenum("type"),
        RawPointer..MultiType(
            PointerMapping.DATA_INT
        )..Check("drawcount * (stride == 0 ? (5 * 4) : stride)")..void.const.p("indirect"),
        GLsizei("drawcount"),
        GLsizei("stride")
    )
}