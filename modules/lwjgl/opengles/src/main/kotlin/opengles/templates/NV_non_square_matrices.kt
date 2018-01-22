/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val NV_non_square_matrices = "NVNonSquareMatrices".nativeClassGLES("NV_non_square_matrices", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds support for non-square matrix variables in GLSL shaders.

        Requires ${GLES20.core}.
        """

    IntConstant(
        "Returned by GetActiveAttrib and GetActiveUniform.",

        "FLOAT_MAT2x3_NV"..0x8B65,
        "FLOAT_MAT2x4_NV"..0x8B66,
        "FLOAT_MAT3x2_NV"..0x8B67,
        "FLOAT_MAT3x4_NV"..0x8B68,
        "FLOAT_MAT4x2_NV"..0x8B69,
        "FLOAT_MAT4x3_NV"..0x8B6A
    )

    void(
        "UniformMatrix2x3fvNV",
        "",

        GLint.IN("location", ""),
        AutoSize(2 x 3, "value")..GLsizei.IN("count", ""),
        GLboolean.IN("transpose", ""),
        const..GLfloat_p.IN("value", "")
    )

    void(
        "UniformMatrix3x2fvNV",
        "",

        GLint.IN("location", ""),
        AutoSize(3 x 2, "value")..GLsizei.IN("count", ""),
        GLboolean.IN("transpose", ""),
        const..GLfloat_p.IN("value", "")
    )

    void(
        "UniformMatrix2x4fvNV",
        "",

        GLint.IN("location", ""),
        AutoSize(2 x 4, "value")..GLsizei.IN("count", ""),
        GLboolean.IN("transpose", ""),
        const..GLfloat_p.IN("value", "")
    )

    void(
        "UniformMatrix4x2fvNV",
        "",

        GLint.IN("location", ""),
        AutoSize(4 x 2, "value")..GLsizei.IN("count", ""),
        GLboolean.IN("transpose", ""),
        const..GLfloat_p.IN("value", "")
    )

    void(
        "UniformMatrix3x4fvNV",
        "",

        GLint.IN("location", ""),
        AutoSize(3 x 4, "value")..GLsizei.IN("count", ""),
        GLboolean.IN("transpose", ""),
        const..GLfloat_p.IN("value", "")
    )

    void(
        "UniformMatrix4x3fvNV",
        "",

        GLint.IN("location", ""),
        AutoSize(4 x 3, "value")..GLsizei.IN("count", ""),
        GLboolean.IN("transpose", ""),
        const..GLfloat_p.IN("value", "")
    )
}