/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val AMD_gpu_shader_half_float = "AMDGPUShaderHalfFloat".nativeClassGL("AMD_gpu_shader_half_float", postfix = AMD) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension was developed based on the ${NV_gpu_shader5.link} extension to allow implementations supporting half float in shader and expose the
        feature without the additional requirements that are present in {@code NV_gpu_shader5}.

        The extension introduces the following features for all shader types:
        ${ul(
            "support for half float scalar, vector and matrix data types in shader;",
            "new built-in functions to pack and unpack half float types into a 32-bit integer vector;",
            """
            half float support for all existing single float built-in functions, including angle functions, exponential functions, common functions, geometric
            functions, matrix functions and etc.;
            """
        )}

        This extension is designed to be a functional superset of the half-precision floating-point support from NV_gpu_shader5 and to keep source code
        compatible with that, thus the new procedures, functions, and tokens are identical to those found in that extension.

        Requires ${GL40.core} and GLSL 4.00.
        """

    IntConstant(
        "Returned by the {@code type} parameter of GetActiveAttrib, GetActiveUniform, and GetTransformFeedbackVarying.",

        "FLOAT16_MAT2_AMD"..0x91C5,
        "FLOAT16_MAT3_AMD"..0x91C6,
        "FLOAT16_MAT4_AMD"..0x91C7,
        "FLOAT16_MAT2x3_AMD"..0x91C8,
        "FLOAT16_MAT2x4_AMD"..0x91C9,
        "FLOAT16_MAT3x2_AMD"..0x91CA,
        "FLOAT16_MAT3x4_AMD"..0x91CB,
        "FLOAT16_MAT4x2_AMD"..0x91CC,
        "FLOAT16_MAT4x3_AMD"..0x91CD
    )
}