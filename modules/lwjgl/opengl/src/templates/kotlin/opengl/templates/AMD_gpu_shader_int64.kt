/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val AMD_gpu_shader_int64 = "AMDGPUShaderInt64".nativeClassGL("AMD_gpu_shader_int64", postfix = NV) {
    IntConstant(
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

    reuse(NV_gpu_shader5, "Uniform1i64NV")
    reuse(NV_gpu_shader5, "Uniform2i64NV")
    reuse(NV_gpu_shader5, "Uniform3i64NV")
    reuse(NV_gpu_shader5, "Uniform4i64NV")
    reuse(NV_gpu_shader5, "Uniform1i64vNV")
    reuse(NV_gpu_shader5, "Uniform2i64vNV")
    reuse(NV_gpu_shader5, "Uniform3i64vNV")
    reuse(NV_gpu_shader5, "Uniform4i64vNV")

    reuse(NV_gpu_shader5, "Uniform1ui64NV")
    reuse(NV_gpu_shader5, "Uniform2ui64NV")
    reuse(NV_gpu_shader5, "Uniform3ui64NV")
    reuse(NV_gpu_shader5, "Uniform4ui64NV")
    reuse(NV_gpu_shader5, "Uniform1ui64vNV")
    reuse(NV_gpu_shader5, "Uniform2ui64vNV")
    reuse(NV_gpu_shader5, "Uniform3ui64vNV")
    reuse(NV_gpu_shader5, "Uniform4ui64vNV")

    reuse(NV_gpu_shader5, "GetUniformi64vNV")
    reuse(NV_shader_buffer_load, "GetUniformui64vNV")

    reuse(NV_gpu_shader5, "ProgramUniform1i64NV")
    reuse(NV_gpu_shader5, "ProgramUniform2i64NV")
    reuse(NV_gpu_shader5, "ProgramUniform3i64NV")
    reuse(NV_gpu_shader5, "ProgramUniform4i64NV")
    reuse(NV_gpu_shader5, "ProgramUniform1i64vNV")
    reuse(NV_gpu_shader5, "ProgramUniform2i64vNV")
    reuse(NV_gpu_shader5, "ProgramUniform3i64vNV")
    reuse(NV_gpu_shader5, "ProgramUniform4i64vNV")

    reuse(NV_gpu_shader5, "ProgramUniform1ui64NV")
    reuse(NV_gpu_shader5, "ProgramUniform2ui64NV")
    reuse(NV_gpu_shader5, "ProgramUniform3ui64NV")
    reuse(NV_gpu_shader5, "ProgramUniform4ui64NV")
    reuse(NV_gpu_shader5, "ProgramUniform1ui64vNV")
    reuse(NV_gpu_shader5, "ProgramUniform2ui64vNV")
    reuse(NV_gpu_shader5, "ProgramUniform3ui64vNV")
    reuse(NV_gpu_shader5, "ProgramUniform4ui64vNV")
}