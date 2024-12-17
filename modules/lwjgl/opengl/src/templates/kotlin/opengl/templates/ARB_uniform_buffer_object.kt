/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_uniform_buffer_object = "ARBUniformBufferObject".nativeClassGL("ARB_uniform_buffer_object") {
    IntConstant(
        "UNIFORM_BUFFER"..0x8A11
    )

    IntConstant(
        "UNIFORM_BUFFER_BINDING"..0x8A28
    )

    IntConstant(
        "UNIFORM_BUFFER_START"..0x8A29,
        "UNIFORM_BUFFER_SIZE"..0x8A2A
    )

    IntConstant(
        "MAX_VERTEX_UNIFORM_BLOCKS"..0x8A2B,
        "MAX_GEOMETRY_UNIFORM_BLOCKS"..0x8A2C,
        "MAX_FRAGMENT_UNIFORM_BLOCKS"..0x8A2D,
        "MAX_COMBINED_UNIFORM_BLOCKS"..0x8A2E,
        "MAX_UNIFORM_BUFFER_BINDINGS"..0x8A2F,
        "MAX_UNIFORM_BLOCK_SIZE"..0x8A30,
        "MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS"..0x8A31,
        "MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS"..0x8A32,
        "MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS"..0x8A33,
        "UNIFORM_BUFFER_OFFSET_ALIGNMENT"..0x8A34
    )

    IntConstant(
        "ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH"..0x8A35,
        "ACTIVE_UNIFORM_BLOCKS"..0x8A36
    )

    IntConstant(
        "UNIFORM_TYPE"..0x8A37,
        "UNIFORM_SIZE"..0x8A38,
        "UNIFORM_NAME_LENGTH"..0x8A39,
        "UNIFORM_BLOCK_INDEX"..0x8A3A,
        "UNIFORM_OFFSET"..0x8A3B,
        "UNIFORM_ARRAY_STRIDE"..0x8A3C,
        "UNIFORM_MATRIX_STRIDE"..0x8A3D,
        "UNIFORM_IS_ROW_MAJOR"..0x8A3E
    )

    IntConstant(
        "UNIFORM_BLOCK_BINDING"..0x8A3F,
        "UNIFORM_BLOCK_DATA_SIZE"..0x8A40,
        "UNIFORM_BLOCK_NAME_LENGTH"..0x8A41,
        "UNIFORM_BLOCK_ACTIVE_UNIFORMS"..0x8A42,
        "UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES"..0x8A43,
        "UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER"..0x8A44,
        "UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER"..0x8A45,
        "UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER"..0x8A46
    )

    IntConstant(
        "INVALID_INDEX"..0xFFFFFFFF.i
    )

    reuse(GL31C, "GetUniformIndices")
    reuse(GL31C, "GetActiveUniformsiv")
    reuse(GL31C, "GetActiveUniformName")
    reuse(GL31C, "GetUniformBlockIndex")
    reuse(GL31C, "GetActiveUniformBlockiv")
    reuse(GL31C, "GetActiveUniformBlockName")
    reuse(GL30C, "BindBufferRange")
    reuse(GL30C, "BindBufferBase")
    reuse(GL30C, "GetIntegeri_v")
    reuse(GL31C, "UniformBlockBinding")
}