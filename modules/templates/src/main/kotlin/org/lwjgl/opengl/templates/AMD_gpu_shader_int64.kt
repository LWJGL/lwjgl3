/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val AMD_gpu_shader_int64 = "AMDGPUShaderInt64".nativeClassGL("AMD_gpu_shader_int64", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension was developed based on the NV_gpu_shader5 extension to allow implementations supporting 64-bit integers to expose the feature without
        the additional requirements that are present in NV_gpu_shader5.

        The extension introduces the following features for all shader types:
        ${ul(
            """
            support for 64-bit scalar and vector integer data types, including uniform API, uniform buffer object, transform feedback, and shader input and
            output support;
            """,
            "new built-in functions to pack and unpack 64-bit integer types into a two-component 32-bit integer vector;",
            "new built-in functions to convert double-precision floating-point values to or from their 64-bit integer bit encodings;",
            "vector relational functions supporting comparisons of vectors of 64-bit integer types; and",
            "common functions abs, sign, min, max, clamp, and mix supporting arguments of 64-bit integer types."
        )}
        This extension is designed to be a functional superset of the 64-bit integer support introduced by NV_gpu_shader5 and to be source code compatible with
        that, thus the new procedures, functions, and tokens are identical to those found in that extension.

        Requires ${GL40.core} and GLSL 4.00.
        """

    IntConstant(
        "Returned by the {@code type} parameter of GetActiveAttrib, GetActiveUniform, and GetTransformFeedbackVarying.",

        "INT64_NV"..0x140E,
        "UNSIGNED_INT64_NV"..0x140F,
        "INT8_NV"..0x8FE0,
        "INT8_VEC2_NV"..0x8FE1,
        "INT8_VEC3_NV"..0x8FE2,
        "INT8_VEC4_NV"..0x8FE3,
        "INT16_NV"..0x8FE4,
        "INT16_VEC2_NV"..0x8FE5,
        "INT16_VEC3_NV"..0x8FE6,
        "INT16_VEC4_NV"..0x8FE7,
        "INT64_VEC2_NV"..0x8FE9,
        "INT64_VEC3_NV"..0x8FEA,
        "INT64_VEC4_NV"..0x8FEB,
        "UNSIGNED_INT8_NV"..0x8FEC,
        "UNSIGNED_INT8_VEC2_NV"..0x8FED,
        "UNSIGNED_INT8_VEC3_NV"..0x8FEE,
        "UNSIGNED_INT8_VEC4_NV"..0x8FEF,
        "UNSIGNED_INT16_NV"..0x8FF0,
        "UNSIGNED_INT16_VEC2_NV"..0x8FF1,
        "UNSIGNED_INT16_VEC3_NV"..0x8FF2,
        "UNSIGNED_INT16_VEC4_NV"..0x8FF3,
        "UNSIGNED_INT64_VEC2_NV"..0x8FF5,
        "UNSIGNED_INT64_VEC3_NV"..0x8FF6,
        "UNSIGNED_INT64_VEC4_NV"..0x8FF7,
        "FLOAT16_NV"..0x8FF8,
        "FLOAT16_VEC2_NV"..0x8FF9,
        "FLOAT16_VEC3_NV"..0x8FFA,
        "FLOAT16_VEC4_NV"..0x8FFB
    )

    NV_gpu_shader5 reuse "Uniform1i64NV"
    NV_gpu_shader5 reuse "Uniform2i64NV"
    NV_gpu_shader5 reuse "Uniform3i64NV"
    NV_gpu_shader5 reuse "Uniform4i64NV"
    NV_gpu_shader5 reuse "Uniform1i64vNV"
    NV_gpu_shader5 reuse "Uniform2i64vNV"
    NV_gpu_shader5 reuse "Uniform3i64vNV"
    NV_gpu_shader5 reuse "Uniform4i64vNV"

    NV_gpu_shader5 reuse "Uniform1ui64NV"
    NV_gpu_shader5 reuse "Uniform2ui64NV"
    NV_gpu_shader5 reuse "Uniform3ui64NV"
    NV_gpu_shader5 reuse "Uniform4ui64NV"
    NV_gpu_shader5 reuse "Uniform1ui64vNV"
    NV_gpu_shader5 reuse "Uniform2ui64vNV"
    NV_gpu_shader5 reuse "Uniform3ui64vNV"
    NV_gpu_shader5 reuse "Uniform4ui64vNV"

    NV_gpu_shader5 reuse "GetUniformi64vNV"
    NV_gpu_shader5 reuse "GetUniformui64vNV"

    NV_gpu_shader5 reuse "ProgramUniform1i64NV"
    NV_gpu_shader5 reuse "ProgramUniform2i64NV"
    NV_gpu_shader5 reuse "ProgramUniform3i64NV"
    NV_gpu_shader5 reuse "ProgramUniform4i64NV"
    NV_gpu_shader5 reuse "ProgramUniform1i64vNV"
    NV_gpu_shader5 reuse "ProgramUniform2i64vNV"
    NV_gpu_shader5 reuse "ProgramUniform3i64vNV"
    NV_gpu_shader5 reuse "ProgramUniform4i64vNV"

    NV_gpu_shader5 reuse "ProgramUniform1ui64NV"
    NV_gpu_shader5 reuse "ProgramUniform2ui64NV"
    NV_gpu_shader5 reuse "ProgramUniform3ui64NV"
    NV_gpu_shader5 reuse "ProgramUniform4ui64NV"
    NV_gpu_shader5 reuse "ProgramUniform1ui64vNV"
    NV_gpu_shader5 reuse "ProgramUniform2ui64vNV"
    NV_gpu_shader5 reuse "ProgramUniform3ui64vNV"
    NV_gpu_shader5 reuse "ProgramUniform4ui64vNV"
}