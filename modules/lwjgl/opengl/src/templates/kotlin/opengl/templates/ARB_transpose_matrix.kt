/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_transpose_matrix = "ARBTransposeMatrix".nativeClassGL("ARB_transpose_matrix", postfix = ARB) {
    IntConstant(
        "TRANSPOSE_MODELVIEW_MATRIX_ARB"..0x84E3,
        "TRANSPOSE_PROJECTION_MATRIX_ARB"..0x84E4,
        "TRANSPOSE_TEXTURE_MATRIX_ARB"..0x84E5,
        "TRANSPOSE_COLOR_MATRIX_ARB"..0x84E6
    )

    void(
        "LoadTransposeMatrixfARB",

        Check(16)..GLfloat.const.p("m")
    )

    void(
        "LoadTransposeMatrixdARB",

        Check(16)..GLdouble.const.p("m")
    )

    void(
        "MultTransposeMatrixfARB",

        Check(16)..GLfloat.const.p("m")
    )

    void(
        "MultTransposeMatrixdARB",

        Check(16)..GLdouble.const.p("m")
    )

}