/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_vertex_buffer_unified_memory = "NVVertexBufferUnifiedMemory".nativeClassGL("NV_vertex_buffer_unified_memory", postfix = NV) {
    IntConstant(
        "VERTEX_ATTRIB_ARRAY_UNIFIED_NV"..0x8F1E,
        "ELEMENT_ARRAY_UNIFIED_NV"..0x8F1F
    )

    IntConstant(
        "VERTEX_ATTRIB_ARRAY_ADDRESS_NV"..0x8F20,
        "TEXTURE_COORD_ARRAY_ADDRESS_NV"..0x8F25
    )

    IntConstant(
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
        "VERTEX_ATTRIB_ARRAY_LENGTH_NV"..0x8F2A,
        "TEXTURE_COORD_ARRAY_LENGTH_NV"..0x8F2F
    )

    IntConstant(
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

        GLenum("pname"),
        GLuint("index"),
        GLuint64EXT("address"),
        GLsizeiptr("length")
    )

    void(
        "VertexFormatNV",

        GLint("size"),
        GLenum("type"),
        GLsizei("stride")
    )

    void(
        "NormalFormatNV",

        GLenum("type"),
        GLsizei("stride")
    )

    void(
        "ColorFormatNV",

        GLint("size"),
        GLenum("type"),
        GLsizei("stride")
    )

    void(
        "IndexFormatNV",

        GLenum("type"),
        GLsizei("stride")
    )

    void(
        "TexCoordFormatNV",

        GLint("size"),
        GLenum("type"),
        GLsizei("stride")
    )

    void(
        "EdgeFlagFormatNV",

        GLsizei("stride")
    )

    void(
        "SecondaryColorFormatNV",

        GLint("size"),
        GLenum("type"),
        GLsizei("stride")
    )

    void(
        "FogCoordFormatNV",

        GLenum("type"),
        GLsizei("stride")
    )

    void(
        "VertexAttribFormatNV",

        GLuint("index"),
        GLint("size"),
        GLenum("type"),
        GLboolean("normalized"),
        GLsizei("stride")
    )

    void(
        "VertexAttribIFormatNV",

        GLuint("index"),
        GLint("size"),
        GLenum("type"),
        GLsizei("stride")
    )

    void(
        "GetIntegerui64i_vNV",

        GLenum("value"),
        GLuint("index"),
        Check(1)..ReturnParam..GLuint64EXT.p("result")
    )
}