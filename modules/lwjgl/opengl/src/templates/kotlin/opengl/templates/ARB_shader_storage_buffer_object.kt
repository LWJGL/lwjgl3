/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_shader_storage_buffer_object = "ARBShaderStorageBufferObject".nativeClassGL("ARB_shader_storage_buffer_object") {
    IntConstant(
        "SHADER_STORAGE_BUFFER"..0x90D2
    )

    IntConstant(
        "SHADER_STORAGE_BUFFER_BINDING"..0x90D3
    )

    IntConstant(
        "SHADER_STORAGE_BUFFER_START"..0x90D4,
        "SHADER_STORAGE_BUFFER_SIZE"..0x90D5
    )

    IntConstant(
        "MAX_VERTEX_SHADER_STORAGE_BLOCKS"..0x90D6,
        "MAX_GEOMETRY_SHADER_STORAGE_BLOCKS"..0x90D7,
        "MAX_TESS_CONTROL_SHADER_STORAGE_BLOCKS"..0x90D8,
        "MAX_TESS_EVALUATION_SHADER_STORAGE_BLOCKS"..0x90D9,
        "MAX_FRAGMENT_SHADER_STORAGE_BLOCKS"..0x90DA,
        "MAX_COMPUTE_SHADER_STORAGE_BLOCKS"..0x90DB,
        "MAX_COMBINED_SHADER_STORAGE_BLOCKS"..0x90DC,
        "MAX_SHADER_STORAGE_BUFFER_BINDINGS"..0x90DD,
        "MAX_SHADER_STORAGE_BLOCK_SIZE"..0x90DE,
        "SHADER_STORAGE_BUFFER_OFFSET_ALIGNMENT"..0x90DF
    )

    IntConstant(
        "SHADER_STORAGE_BARRIER_BIT"..0x2000
    )

    IntConstant(
        "MAX_COMBINED_SHADER_OUTPUT_RESOURCES"..0x8F39
    )

    reuse(GL43C, "ShaderStorageBlockBinding")
}