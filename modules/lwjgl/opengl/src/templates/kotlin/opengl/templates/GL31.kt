/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL31 = "GL31".nativeClassGL("GL31") {
    extends = GL30

    IntConstant(
        "R8_SNORM"..0x8F94,
        "RG8_SNORM"..0x8F95,
        "RGB8_SNORM"..0x8F96,
        "RGBA8_SNORM"..0x8F97,
        "R16_SNORM"..0x8F98,
        "RG16_SNORM"..0x8F99,
        "RGB16_SNORM"..0x8F9A,
        "RGBA16_SNORM"..0x8F9B
    )

    IntConstant(
        "SIGNED_NORMALIZED"..0x8F9C
    )

    IntConstant(
        "SAMPLER_BUFFER"..0x8DC2,
        "INT_SAMPLER_2D_RECT"..0x8DCD,
        "INT_SAMPLER_BUFFER"..0x8DD0,
        "UNSIGNED_INT_SAMPLER_2D_RECT"..0x8DD5,
        "UNSIGNED_INT_SAMPLER_BUFFER"..0x8DD8
    )

    // ARB_draw_instanced

    reuse(GL31C, "DrawArraysInstanced")
    reuse(GL31C, "DrawElementsInstanced")

    // ARB_copy_buffer

    IntConstant(
        "COPY_READ_BUFFER"..0x8F36,
        "COPY_WRITE_BUFFER"..0x8F37
    )

    reuse(GL31C, "CopyBufferSubData")

    // NV_primitive_restart

    IntConstant(
        "PRIMITIVE_RESTART"..0x8F9D
    )

    IntConstant(
        "PRIMITIVE_RESTART_INDEX"..0x8F9E
    )

    reuse(GL31C, "PrimitiveRestartIndex")

    // ARB_texture_buffer_object

    IntConstant(
        "TEXTURE_BUFFER"..0x8C2A
    )

    IntConstant(
        "MAX_TEXTURE_BUFFER_SIZE"..0x8C2B,
        "TEXTURE_BINDING_BUFFER"..0x8C2C,
        "TEXTURE_BUFFER_DATA_STORE_BINDING"..0x8C2D
    )

    reuse(GL31C, "TexBuffer")

    // ARB_texture_rectangle

    IntConstant(
        "TEXTURE_RECTANGLE"..0x84F5
    )

    IntConstant(
        "TEXTURE_BINDING_RECTANGLE"..0x84F6
    )

    IntConstant(
        "PROXY_TEXTURE_RECTANGLE"..0x84F7
    )

    IntConstant(
        "MAX_RECTANGLE_TEXTURE_SIZE"..0x84F8
    )

    IntConstant(
        "SAMPLER_2D_RECT"..0x8B63
    )

    IntConstant(
        "SAMPLER_2D_RECT_SHADOW"..0x8B64
    )

    // ARB_uniform_buffer_object

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
    reuse(GL31C, "UniformBlockBinding")
}