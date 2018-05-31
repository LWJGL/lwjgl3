/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL31 = "GL31".nativeClassGL("GL31") {
    extends = GL30
    documentation =
        """
        The OpenGL functionality up to version 3.1. Includes the deprecated symbols of the Compatibility Profile.

        OpenGL 3.1 implementations support revision 1.40 of the OpenGL Shading Language.

        Extensions promoted to core in this release:
        ${ul(
            registryLinkTo("ARB", "draw_instanced"),
            registryLinkTo("ARB", "copy_buffer"),
            registryLinkTo("NV", "primitive_restart"),
            registryLinkTo("ARB", "texture_buffer_object"),
            registryLinkTo("ARB", "texture_rectangle"),
            registryLinkTo("ARB", "uniform_buffer_object")
        )}
        """

    IntConstant(
        "Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D.",

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
        "Returned by GetTexLevelParameter and GetFramebufferAttachmentParameter.",

        "SIGNED_NORMALIZED"..0x8F9C
    )

    IntConstant(
        "Returned by the {@code type} parameter of GetActiveUniform.",

        "SAMPLER_BUFFER"..0x8DC2,
        "INT_SAMPLER_2D_RECT"..0x8DCD,
        "INT_SAMPLER_BUFFER"..0x8DD0,
        "UNSIGNED_INT_SAMPLER_2D_RECT"..0x8DD5,
        "UNSIGNED_INT_SAMPLER_BUFFER"..0x8DD8
    )

    // ARB_draw_instanced

    GL31C reuse "DrawArraysInstanced"
    GL31C reuse "DrawElementsInstanced"

    // ARB_copy_buffer

    IntConstant(
        """
        Accepted by the target parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv, MapBufferRange,
        FlushMappedBufferRange, GetBufferParameteriv, BindBufferRange, BindBufferBase, and CopyBufferSubData.
        """,

        "COPY_READ_BUFFER"..0x8F36,
        "COPY_WRITE_BUFFER"..0x8F37
    )

    GL31C reuse "CopyBufferSubData"

    // NV_primitive_restart

    IntConstant(
        "Accepted by the {@code cap} parameter of Enable, Disable and IsEnabled.",

        "PRIMITIVE_RESTART"..0x8F9D
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "PRIMITIVE_RESTART_INDEX"..0x8F9E
    )

    GL31C reuse "PrimitiveRestartIndex"

    // ARB_texture_buffer_object

    IntConstant(
        """
        Accepted by the {@code target} parameter of BindBuffer, BufferData, BufferSubData, MapBuffer, MapBufferRange, BindTexture, UnmapBuffer,
        GetBufferSubData, GetBufferParameteriv, GetBufferPointerv, and TexBuffer, and the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, and
        GetIntegerv.
        """,

        "TEXTURE_BUFFER"..0x8C2A
    )

    IntConstant(
        "Accepted by the {@code pname} parameters of GetBooleanv, GetDoublev, GetFloatv, and GetIntegerv.",

        "MAX_TEXTURE_BUFFER_SIZE"..0x8C2B,
        "TEXTURE_BINDING_BUFFER"..0x8C2C,
        "TEXTURE_BUFFER_DATA_STORE_BINDING"..0x8C2D
    )

    GL31C reuse "TexBuffer"

    // ARB_texture_rectangle

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Enable, Disable and IsEnabled; by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv and
        GetDoublev; and by the {@code target} parameter of BindTexture, GetTexParameterfv, GetTexParameteriv, TexParameterf, TexParameteri, TexParameterfv and
        TexParameteriv.
        """,

        "TEXTURE_RECTANGLE"..0x84F5
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv and GetDoublev.",

        "TEXTURE_BINDING_RECTANGLE"..0x84F6
    )

    IntConstant(
        "Accepted by the {@code target} parameter of GetTexLevelParameteriv, GetTexLevelParameterfv, GetTexParameteriv and TexImage2D.",

        "PROXY_TEXTURE_RECTANGLE"..0x84F7
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv and GetFloatv.",

        "MAX_RECTANGLE_TEXTURE_SIZE"..0x84F8
    )

    IntConstant(
        "Returned by {@code type} parameter of GetActiveUniform when the location {@code index} for program object {@code program} is of type sampler2DRect.",

        "SAMPLER_2D_RECT"..0x8B63
    )

    IntConstant(
        """
        Returned by {@code type} parameter of GetActiveUniform when the location {@code index} for program object {@code program} is of type
        sampler2DRectShadow.
        """,

        "SAMPLER_2D_RECT_SHADOW"..0x8B64
    )

    // ARB_uniform_buffer_object

    IntConstant(
        "Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, and GetBufferPointerv.",

        "UNIFORM_BUFFER"..0x8A11
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetIntegeri_v, GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "UNIFORM_BUFFER_BINDING"..0x8A28
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetIntegeri_v.",

        "UNIFORM_BUFFER_START"..0x8A29,
        "UNIFORM_BUFFER_SIZE"..0x8A2A
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

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
        "Accepted by the {@code pname} parameter of GetProgramiv.",

        "ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH"..0x8A35,
        "ACTIVE_UNIFORM_BLOCKS"..0x8A36
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetActiveUniformsiv.",

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
        "Accepted by the {@code pname} parameter of GetActiveUniformBlockiv.",

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
        "Returned by GetActiveUniformsiv and GetUniformBlockIndex.",

        "INVALID_INDEX"..0xFFFFFFFF.i
    )

    GL31C reuse "GetUniformIndices"
    GL31C reuse "GetActiveUniformsiv"
    GL31C reuse "GetActiveUniformName"
    GL31C reuse "GetUniformBlockIndex"
    GL31C reuse "GetActiveUniformBlockiv"
    GL31C reuse "GetActiveUniformBlockName"
    GL31C reuse "UniformBlockBinding"
}