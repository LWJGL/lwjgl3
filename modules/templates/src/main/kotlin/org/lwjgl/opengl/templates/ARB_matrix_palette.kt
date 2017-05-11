/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.opengl.BufferType.*

val ARB_matrix_palette = "ARBMatrixPalette".nativeClassGL("ARB_matrix_palette", postfix = ARB) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension extends the abilities of ##ARBVertexBlend to include a palette of modelview matrices. The n vertex units use a palette of m modelview
        matrices. (Where n and m are constrained to implementation defined maxima.) Each vertex has a set of n indices into the palette, and a corresponding set
        of n weights. Matrix indices can be changed for each vertex (between #Begin() and #End()).

        When this extension is utilized, the enabled units transform each vertex by the modelview matrices specified by the vertices' respective indices. These
        results are subsequently scaled by the weights of the respective units and then summed to create the eyespace vertex.

        A similar procedure is followed for normals. Normals, however, are transformed by the inverse transpose of the modelview matrix.
        """

    IntConstant(
        """
        Accepted by the {@code pname} parameters of GetFloatv, GetDoublev, and IsEnabled, by the {@code mode} parameter of MatrixMode, and by the {@code cap}
        parameters of Enable and Disable.
        """,

        "MATRIX_PALETTE_ARB"..0x8840
    )

    IntConstant(
        "Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv, and GetDoublev.",

        "MAX_MATRIX_PALETTE_STACK_DEPTH_ARB"..0x8841,
        "MAX_PALETTE_MATRICES_ARB"..0x8842,
        "CURRENT_PALETTE_MATRIX_ARB"..0x8843
    )

    IntConstant(
        "Accepted by the {@code cap} parameters of EnableClientState and DisableClientState and by the {@code pname} parameter of IsEnabled.",

        "MATRIX_INDEX_ARRAY_ARB"..0x8844
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetFloatv.",

        "CURRENT_MATRIX_INDEX_ARB"..0x8845
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetIntegerv.",

        "MATRIX_INDEX_ARRAY_SIZE_ARB"..0x8846,
        "MATRIX_INDEX_ARRAY_TYPE_ARB"..0x8847,
        "MATRIX_INDEX_ARRAY_STRIDE_ARB"..0x8848
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetPointerv.",

        "MATRIX_INDEX_ARRAY_POINTER_ARB"..0x8849
    )

    void(
        "CurrentPaletteMatrixARB",
        "Defines which of the palette's matrices is affected by subsequent matrix operations when the current matrix mode is #MATRIX_PALETTE_ARB,",

        GLint.IN("index", "the current matrix index. Must be a value between 0 and #MAX_PALETTE_MATRICES_ARB.")
    )

    val size = AutoSize("indices")..GLint.IN("size", "the number of index values to set. Must be a value between 1 and #MAX_VERTEX_UNITS_ARB.")

    void("MatrixIndexuivARB", "Sets the current matrix indices.", size, GLuint_p.IN("indices", "the matrix index values"))
    void("MatrixIndexubvARB", "Byte version of #MatrixIndexuivARB().", size, GLubyte_p.IN("indices", "the matrix index values"))
    void("MatrixIndexusvARB", "Short version of #MatrixIndexuivARB().", size, GLushort_p.IN("indices", "the matrix index values"))

    void(
        "MatrixIndexPointerARB",
        "",

        GLint.IN("size", "the number of index values per vertex that are stored in the array. Must be a value between 1 and #MAX_VERTEX_UNITS_ARB."),
        AutoType("pointer", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum.IN(
            "type",
            "the data type of the values stored in the array",
            "#UNSIGNED_BYTE #UNSIGNED_SHORT #UNSIGNED_INT"
        ),
        GLsizei.IN("stride", "the vertex stride in bytes. If specified as zero, then array elements are stored sequentially"),
        Unsafe..ARRAY_BUFFER..void_p.IN("pointer", "the matrix index data")
    )

}