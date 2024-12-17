/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import opengl.BufferType.*

val ARB_matrix_palette = "ARBMatrixPalette".nativeClassGL("ARB_matrix_palette", postfix = ARB) {
    IntConstant(
        "MATRIX_PALETTE_ARB"..0x8840
    )

    IntConstant(
        "MAX_MATRIX_PALETTE_STACK_DEPTH_ARB"..0x8841,
        "MAX_PALETTE_MATRICES_ARB"..0x8842,
        "CURRENT_PALETTE_MATRIX_ARB"..0x8843
    )

    IntConstant(
        "MATRIX_INDEX_ARRAY_ARB"..0x8844
    )

    IntConstant(
        "CURRENT_MATRIX_INDEX_ARB"..0x8845
    )

    IntConstant(
        "MATRIX_INDEX_ARRAY_SIZE_ARB"..0x8846,
        "MATRIX_INDEX_ARRAY_TYPE_ARB"..0x8847,
        "MATRIX_INDEX_ARRAY_STRIDE_ARB"..0x8848
    )

    IntConstant(
        "MATRIX_INDEX_ARRAY_POINTER_ARB"..0x8849
    )

    void(
        "CurrentPaletteMatrixARB",

        GLint("index")
    )

    val size = AutoSize("indices")..GLint("size")

    void("MatrixIndexuivARB", size, GLuint.p("indices"))
    void("MatrixIndexubvARB", size, GLubyte.p("indices"))
    void("MatrixIndexusvARB", size, GLushort.p("indices"))

    void(
        "MatrixIndexPointerARB",

        GLint("size"),
        AutoType("pointer", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum("type"),
        GLsizei("stride"),
        Unsafe..RawPointer..void.const.p("pointer")
    )

}