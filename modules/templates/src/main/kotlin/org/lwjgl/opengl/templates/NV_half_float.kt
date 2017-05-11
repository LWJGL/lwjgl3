/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_half_float = "NVHalfFloat".nativeClassGL("NV_half_float", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension introduces a new storage format and data type for half-precision (16-bit) floating-point quantities. The floating-point format is very
        similar to the IEEE single-precision floating-point standard, except that it has only 5 exponent bits and 10 mantissa bits. Half-precision floats are
        smaller than full precision floats and provide a larger dynamic range than similarly-sized normalized scalar data types.

        This extension allows applications to use half-precision floating point data when specifying vertices or pixel data. It adds new commands to specify
        vertex attributes using the new data type, and extends the existing vertex array and image specification commands to accept the new data type.

        This storage format is also used to represent 16-bit components in the floating-point frame buffers, as defined in the NV_float_buffer extension.
        """

    IntConstant(
        """
        Accepted by the {@code type} argument of VertexPointer, NormalPointer, ColorPointer, TexCoordPointer, FogCoordPointerEXT, SecondaryColorPointerEXT,
        VertexWeightPointerEXT, VertexAttribPointerNV, DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D,
        and GetTexImage.
        """,

        "HALF_FLOAT_NV"..0x140B
    )

    void(
        "Vertex2hNV",
        "",

        GLhalfNV.IN("x", ""),
        GLhalfNV.IN("y", "")
    )

    void(
        "Vertex2hvNV",
        "",

        Check(2)..const..GLhalfNV_p.IN("v", "")
    )

    void(
        "Vertex3hNV",
        "",

        GLhalfNV.IN("x", ""),
        GLhalfNV.IN("y", ""),
        GLhalfNV.IN("z", "")
    )

    void(
        "Vertex3hvNV",
        "",

        Check(3)..const..GLhalfNV_p.IN("v", "")
    )

    void(
        "Vertex4hNV",
        "",

        GLhalfNV.IN("x", ""),
        GLhalfNV.IN("y", ""),
        GLhalfNV.IN("z", ""),
        GLhalfNV.IN("w", "")
    )

    void(
        "Vertex4hvNV",
        "",

        Check(4)..const..GLhalfNV_p.IN("v", "")
    )

    void(
        "Normal3hNV",
        "",

        GLhalfNV.IN("nx", ""),
        GLhalfNV.IN("ny", ""),
        GLhalfNV.IN("nz", "")
    )

    void(
        "Normal3hvNV",
        "",

        Check(3)..const..GLhalfNV_p.IN("v", "")
    )

    void(
        "Color3hNV",
        "",

        GLhalfNV.IN("red", ""),
        GLhalfNV.IN("green", ""),
        GLhalfNV.IN("blue", "")
    )

    void(
        "Color3hvNV",
        "",

        Check(3)..const..GLhalfNV_p.IN("v", "")
    )

    void(
        "Color4hNV",
        "",

        GLhalfNV.IN("red", ""),
        GLhalfNV.IN("green", ""),
        GLhalfNV.IN("blue", ""),
        GLhalfNV.IN("alpha", "")
    )

    void(
        "Color4hvNV",
        "",

        Check(4)..const..GLhalfNV_p.IN("v", "")
    )

    void(
        "TexCoord1hNV",
        "",

        GLhalfNV.IN("s", "")
    )

    void(
        "TexCoord1hvNV",
        "",

        Check(1)..const..GLhalfNV_p.IN("v", "")
    )

    void(
        "TexCoord2hNV",
        "",

        GLhalfNV.IN("s", ""),
        GLhalfNV.IN("t", "")
    )

    void(
        "TexCoord2hvNV",
        "",

        Check(2)..const..GLhalfNV_p.IN("v", "")
    )

    void(
        "TexCoord3hNV",
        "",

        GLhalfNV.IN("s", ""),
        GLhalfNV.IN("t", ""),
        GLhalfNV.IN("r", "")
    )

    void(
        "TexCoord3hvNV",
        "",

        Check(3)..const..GLhalfNV_p.IN("v", "")
    )

    void(
        "TexCoord4hNV",
        "",

        GLhalfNV.IN("s", ""),
        GLhalfNV.IN("t", ""),
        GLhalfNV.IN("r", ""),
        GLhalfNV.IN("q", "")
    )

    void(
        "TexCoord4hvNV",
        "",

        Check(4)..const..GLhalfNV_p.IN("v", "")
    )

    void(
        "MultiTexCoord1hNV",
        "",

        GLenum.IN("target", ""),
        GLhalfNV.IN("s", "")
    )

    void(
        "MultiTexCoord1hvNV",
        "",

        GLenum.IN("target", ""),
        Check(1)..const..GLhalfNV_p.IN("v", "")
    )

    void(
        "MultiTexCoord2hNV",
        "",

        GLenum.IN("target", ""),
        GLhalfNV.IN("s", ""),
        GLhalfNV.IN("t", "")
    )

    void(
        "MultiTexCoord2hvNV",
        "",

        GLenum.IN("target", ""),
        Check(2)..const..GLhalfNV_p.IN("v", "")
    )

    void(
        "MultiTexCoord3hNV",
        "",

        GLenum.IN("target", ""),
        GLhalfNV.IN("s", ""),
        GLhalfNV.IN("t", ""),
        GLhalfNV.IN("r", "")
    )

    void(
        "MultiTexCoord3hvNV",
        "",

        GLenum.IN("target", ""),
        Check(3)..const..GLhalfNV_p.IN("v", "")
    )

    void(
        "MultiTexCoord4hNV",
        "",

        GLenum.IN("target", ""),
        GLhalfNV.IN("s", ""),
        GLhalfNV.IN("t", ""),
        GLhalfNV.IN("r", ""),
        GLhalfNV.IN("q", "")
    )

    void(
        "MultiTexCoord4hvNV",
        "",

        GLenum.IN("target", ""),
        Check(4)..const..GLhalfNV_p.IN("v", "")
    )

    DependsOn("GL_EXT_fog_coord")..void(
        "FogCoordhNV",
        "",

        GLhalfNV.IN("fog", "")
    )

    DependsOn("GL_EXT_fog_coord")..void(
        "FogCoordhvNV",
        "",

        Check(1)..const..GLhalfNV_p.IN("fog", "")
    )

    DependsOn("GL_EXT_secondary_color")..void(
        "SecondaryColor3hNV",
        "",

        GLhalfNV.IN("red", ""),
        GLhalfNV.IN("green", ""),
        GLhalfNV.IN("blue", "")
    )

    DependsOn("GL_EXT_secondary_color")..void(
        "SecondaryColor3hvNV",
        "",

        Check(3)..const..GLhalfNV_p.IN("v", "")
    )

    DependsOn("GL_EXT_vertex_weighting")..void(
        "VertexWeighthNV",
        "",

        GLhalfNV.IN("weight", "")
    )

    DependsOn("GL_EXT_vertex_weighting")..void(
        "VertexWeighthvNV",
        "",

        Check(1)..const..GLhalfNV_p.IN("weight", "")
    )

    DependsOn("GL_NV_vertex_program")..void(
        "VertexAttrib1hNV",
        "",

        GLuint.IN("index", ""),
        GLhalfNV.IN("x", "")
    )

    DependsOn("GL_NV_vertex_program")..void(
        "VertexAttrib1hvNV",
        "",

        GLuint.IN("index", ""),
        Check(1)..const..GLhalfNV_p.IN("v", "")
    )

    DependsOn("GL_NV_vertex_program")..void(
        "VertexAttrib2hNV",
        "",

        GLuint.IN("index", ""),
        GLhalfNV.IN("x", ""),
        GLhalfNV.IN("y", "")
    )

    DependsOn("GL_NV_vertex_program")..void(
        "VertexAttrib2hvNV",
        "",

        GLuint.IN("index", ""),
        Check(2)..const..GLhalfNV_p.IN("v", "")
    )

    DependsOn("GL_NV_vertex_program")..void(
        "VertexAttrib3hNV",
        "",

        GLuint.IN("index", ""),
        GLhalfNV.IN("x", ""),
        GLhalfNV.IN("y", ""),
        GLhalfNV.IN("z", "")
    )

    DependsOn("GL_NV_vertex_program")..void(
        "VertexAttrib3hvNV",
        "",

        GLuint.IN("index", ""),
        Check(3)..const..GLhalfNV_p.IN("v", "")
    )

    DependsOn("GL_NV_vertex_program")..void(
        "VertexAttrib4hNV",
        "",

        GLuint.IN("index", ""),
        GLhalfNV.IN("x", ""),
        GLhalfNV.IN("y", ""),
        GLhalfNV.IN("z", ""),
        GLhalfNV.IN("w", "")
    )

    DependsOn("GL_NV_vertex_program")..void(
        "VertexAttrib4hvNV",
        "",

        GLuint.IN("index", ""),
        Check(4)..const..GLhalfNV_p.IN("v", "")
    )

    DependsOn("GL_NV_vertex_program")..void(
        "VertexAttribs1hvNV",
        "",

        GLuint.IN("index", ""),
        AutoSize("v")..GLsizei.IN("n", ""),
        const..GLhalfNV_p.IN("v", "")
    )

    DependsOn("GL_NV_vertex_program")..void(
        "VertexAttribs2hvNV",
        "",

        GLuint.IN("index", ""),
        AutoSize(2, "v")..GLsizei.IN("n", ""),
        const..GLhalfNV_p.IN("v", "")
    )

    DependsOn("GL_NV_vertex_program")..void(
        "VertexAttribs3hvNV",
        "",

        GLuint.IN("index", ""),
        AutoSize(3, "v")..GLsizei.IN("n", ""),
        const..GLhalfNV_p.IN("v", "")
    )

    DependsOn("GL_NV_vertex_program")..void(
        "VertexAttribs4hvNV",
        "",

        GLuint.IN("index", ""),
        AutoSize(4, "v")..GLsizei.IN("n", ""),
        const..GLhalfNV_p.IN("v", "")
    )
}