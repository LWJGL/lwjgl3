/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_vertex_buffer_unified_memory = "NVVertexBufferUnifiedMemory".nativeClassGL("NV_vertex_buffer_unified_memory", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides a mechanism to specify vertex attrib and element array locations using GPU addresses.

        Binding vertex buffers is one of the most frequent and expensive operations in many GL applications, due to the cost of chasing pointers and binding
        objects described in the Overview of ${NV_shader_buffer_load.link}. The intent of this extension is to enable a way for the application to specify
        vertex attrib state that alleviates the overhead of object binds and driver memory management.
        """

    IntConstant(
        "Accepted by the {@code cap} parameter of DisableClientState, EnableClientState, IsEnabled.",

        "VERTEX_ATTRIB_ARRAY_UNIFIED_NV"..0x8F1E,
        "ELEMENT_ARRAY_UNIFIED_NV"..0x8F1F
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of BufferAddressRangeNV and the {@code value} parameter of GetIntegerui64i_vNV.",

        "VERTEX_ATTRIB_ARRAY_ADDRESS_NV"..0x8F20,
        "TEXTURE_COORD_ARRAY_ADDRESS_NV"..0x8F25
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of BufferAddressRangeNV and the {@code value} parameter of GetIntegerui64vNV.",

        "VERTEX_ARRAY_ADDRESS_NV"..0x8F21,
        "NORMAL_ARRAY_ADDRESS_NV"..0x8F22,
        "COLOR_ARRAY_ADDRESS_NV"..0x8F23,
        "INDEX_ARRAY_ADDRESS_NV"..0x8F24,
        "EDGE_FLAG_ARRAY_ADDRESS_NV"..0x8F26,
        "SECONDARY_COLOR_ARRAY_ADDRESS_NV"..0x8F27,
        "FOG_COORD_ARRAY_ADDRESS_NV"..0x8F28,
        "ELEMENT_ARRAY_ADDRESS_NV"..0x8F29
    )

    IntConstant(
        "Accepted by the {@code target} parameter of GetIntegeri_vNV.",

        "VERTEX_ATTRIB_ARRAY_LENGTH_NV"..0x8F2A,
        "TEXTURE_COORD_ARRAY_LENGTH_NV"..0x8F2F
    )

    IntConstant(
        "Accepted by the {@code value} parameter of GetIntegerv.",

        "VERTEX_ARRAY_LENGTH_NV"..0x8F2B,
        "NORMAL_ARRAY_LENGTH_NV"..0x8F2C,
        "COLOR_ARRAY_LENGTH_NV"..0x8F2D,
        "INDEX_ARRAY_LENGTH_NV"..0x8F2E,
        "EDGE_FLAG_ARRAY_LENGTH_NV"..0x8F30,
        "SECONDARY_COLOR_ARRAY_LENGTH_NV"..0x8F31,
        "FOG_COORD_ARRAY_LENGTH_NV"..0x8F32,
        "ELEMENT_ARRAY_LENGTH_NV"..0x8F33
    )

    void(
        "BufferAddressRangeNV",
        "",

        GLenum("pname", ""),
        GLuint("index", ""),
        GLuint64EXT("address", ""),
        GLsizeiptr("length", "")
    )

    void(
        "VertexFormatNV",
        "",

        GLint("size", ""),
        GLenum("type", ""),
        GLsizei("stride", "")
    )

    void(
        "NormalFormatNV",
        "",

        GLenum("type", ""),
        GLsizei("stride", "")
    )

    void(
        "ColorFormatNV",
        "",

        GLint("size", ""),
        GLenum("type", ""),
        GLsizei("stride", "")
    )

    void(
        "IndexFormatNV",
        "",

        GLenum("type", ""),
        GLsizei("stride", "")
    )

    void(
        "TexCoordFormatNV",
        "",

        GLint("size", ""),
        GLenum("type", ""),
        GLsizei("stride", "")
    )

    void(
        "EdgeFlagFormatNV",
        "",

        GLsizei("stride", "")
    )

    void(
        "SecondaryColorFormatNV",
        "",

        GLint("size", ""),
        GLenum("type", ""),
        GLsizei("stride", "")
    )

    void(
        "FogCoordFormatNV",
        "",

        GLenum("type", ""),
        GLsizei("stride", "")
    )

    void(
        "VertexAttribFormatNV",
        "",

        GLuint("index", ""),
        GLint("size", ""),
        GLenum("type", ""),
        GLboolean("normalized", ""),
        GLsizei("stride", "")
    )

    void(
        "VertexAttribIFormatNV",
        "",

        GLuint("index", ""),
        GLint("size", ""),
        GLenum("type", ""),
        GLsizei("stride", "")
    )

    void(
        "GetIntegerui64i_vNV",
        "",

        GLenum("value", ""),
        GLuint("index", ""),
        Check(1)..ReturnParam..GLuint64EXT.p("result", "")
    )
}