/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_transpose_matrix = "ARBTransposeMatrix".nativeClassGL("ARB_transpose_matrix", postfix = ARB) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        New functions and tokens are added allowing application matrices stored in row major order rather than column major order to be transferred to the
        OpenGL implementation. This allows an application to use standard C-language 2-dimensional arrays ({@code m[row][col]}) and have the array indices match the
        expected matrix row and column indexes. These arrays are referred to as transpose matrices since they are the transpose of the standard matrices passed
        to OpenGL.

        This extension adds an interface for transfering data to and from the OpenGL pipeline, it does not change any OpenGL processing or imply any changes in
        state representation.

        ${GL13.promoted}
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "TRANSPOSE_MODELVIEW_MATRIX_ARB"..0x84E3,
        "TRANSPOSE_PROJECTION_MATRIX_ARB"..0x84E4,
        "TRANSPOSE_TEXTURE_MATRIX_ARB"..0x84E5,
        "TRANSPOSE_COLOR_MATRIX_ARB"..0x84E6
    )

    void(
        "LoadTransposeMatrixfARB",
        """
        Sets the current matrix to a 4 &times; 4 matrix in row-major order.

        The matrix is stored as 16 consecutive values, i.e. as:
        ${table(
            tr(td("a1"), td("a2"), td("a3"), td("a4")),
            tr(td("a5"), td("a6"), td("a7"), td("a8")),
            tr(td("a9"), td("a10"), td("a11"), td("a12")),
            tr(td("a13"), td("a14"), td("a15"), td("a16")),
            matrix = true
        )}
        """,

        Check(16)..GLfloat.const.p.IN("m", "the matrix data")
    )

    void(
        "LoadTransposeMatrixdARB",
        "Double version of #LoadTransposeMatrixfARB().",

        Check(16)..GLdouble.const.p.IN("m", "the matrix data")
    )

    void(
        "MultTransposeMatrixfARB",
        "Multiplies the current matrix with a 4 &times; 4 matrix in row-major order. See #LoadTransposeMatrixfARB() for details.",

        Check(16)..GLfloat.const.p.IN("m", "the matrix data")
    )

    void(
        "MultTransposeMatrixdARB",
        "Double version of #MultTransposeMatrixfARB().",

        Check(16)..GLdouble.const.p.IN("m", "the matrix data")
    )

}