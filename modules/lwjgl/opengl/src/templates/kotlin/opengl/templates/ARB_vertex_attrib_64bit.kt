/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_vertex_attrib_64bit = "ARBVertexAttrib64Bit".nativeClassGL("ARB_vertex_attrib_64bit") {
    IntConstant(
        "DOUBLE_VEC2"..0x8FFC,
        "DOUBLE_VEC3"..0x8FFD,
        "DOUBLE_VEC4"..0x8FFE,
        "DOUBLE_MAT2"..0x8F46,
        "DOUBLE_MAT3"..0x8F47,
        "DOUBLE_MAT4"..0x8F48,
        "DOUBLE_MAT2x3"..0x8F49,
        "DOUBLE_MAT2x4"..0x8F4A,
        "DOUBLE_MAT3x2"..0x8F4B,
        "DOUBLE_MAT3x4"..0x8F4C,
        "DOUBLE_MAT4x2"..0x8F4D,
        "DOUBLE_MAT4x3"..0x8F4E
    )

    reuse(GL41C, "VertexAttribL1d")
    reuse(GL41C, "VertexAttribL2d")
    reuse(GL41C, "VertexAttribL3d")
    reuse(GL41C, "VertexAttribL4d")
    reuse(GL41C, "VertexAttribL1dv")
    reuse(GL41C, "VertexAttribL2dv")
    reuse(GL41C, "VertexAttribL3dv")
    reuse(GL41C, "VertexAttribL4dv")

    reuse(GL41C, "VertexAttribLPointer")

    reuse(GL41C, "GetVertexAttribLdv")

    DependsOn("GL_EXT_direct_state_access")..void(
        "VertexArrayVertexAttribLOffsetEXT",

        GLuint("vaobj"),
        GLuint("buffer"),
        GLuint("index"),
        GLint("size"),
        GLenum("type"),
        GLsizei("stride"),
        GLintptr("offset")
    )
}