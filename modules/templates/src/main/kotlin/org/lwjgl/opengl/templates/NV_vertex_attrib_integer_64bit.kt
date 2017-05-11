/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_vertex_attrib_integer_64bit = "NVVertexAttribInteger64bit".nativeClassGL("NV_vertex_attrib_integer_64bit", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides support for specifying vertex attributes with 64-bit integer components, analagous to the 64-bit floating point support added
        in EXT_vertex_attrib_64bit.

        Additionally, it provides the VertexAttribLFormatNV entry point to specify bindless vertex attribute arrays with 64-bit integer or floating-point
        components in conjunction with the NV_vertex_buffer_unified_memory extension.

        Requires ${GL30.core}, GLSL 1.30, ${NV_gpu_shader5.link} or equivalent functionality and ${EXT_vertex_attrib_64bit.link}.
        """

    IntConstant(
        "Accepted by the {@code type} parameter of VertexAttribLPointerEXT, VertexArrayVertexAttribLOffsetEXT, and VertexAttribLFormatNV.",

        "INT64_NV"..0x140E,
        "UNSIGNED_INT64_NV"..0x140F
    )

    void(
        "VertexAttribL1i64NV",
        "",

        GLuint.IN("index", ""),
        GLint64EXT.IN("x", "")
    )

    void(
        "VertexAttribL2i64NV",
        "",

        GLuint.IN("index", ""),
        GLint64EXT.IN("x", ""),
        GLint64EXT.IN("y", "")
    )

    void(
        "VertexAttribL3i64NV",
        "",

        GLuint.IN("index", ""),
        GLint64EXT.IN("x", ""),
        GLint64EXT.IN("y", ""),
        GLint64EXT.IN("z", "")
    )

    void(
        "VertexAttribL4i64NV",
        "",

        GLuint.IN("index", ""),
        GLint64EXT.IN("x", ""),
        GLint64EXT.IN("y", ""),
        GLint64EXT.IN("z", ""),
        GLint64EXT.IN("w", "")
    )

    void(
        "VertexAttribL1i64vNV",
        "",

        GLuint.IN("index", ""),
        Check(1)..const..GLint64EXT_p.IN("v", "")
    )

    void(
        "VertexAttribL2i64vNV",
        "",

        GLuint.IN("index", ""),
        Check(2)..const..GLint64EXT_p.IN("v", "")
    )

    void(
        "VertexAttribL3i64vNV",
        "",

        GLuint.IN("index", ""),
        Check(3)..const..GLint64EXT_p.IN("v", "")
    )

    void(
        "VertexAttribL4i64vNV",
        "",

        GLuint.IN("index", ""),
        Check(4)..const..GLint64EXT_p.IN("v", "")
    )

    void(
        "VertexAttribL1ui64NV",
        "",

        GLuint.IN("index", ""),
        GLuint64EXT.IN("x", "")
    )

    void(
        "VertexAttribL2ui64NV",
        "",

        GLuint.IN("index", ""),
        GLuint64EXT.IN("x", ""),
        GLuint64EXT.IN("y", "")
    )

    void(
        "VertexAttribL3ui64NV",
        "",

        GLuint.IN("index", ""),
        GLuint64EXT.IN("x", ""),
        GLuint64EXT.IN("y", ""),
        GLuint64EXT.IN("z", "")
    )

    void(
        "VertexAttribL4ui64NV",
        "",

        GLuint.IN("index", ""),
        GLuint64EXT.IN("x", ""),
        GLuint64EXT.IN("y", ""),
        GLuint64EXT.IN("z", ""),
        GLuint64EXT.IN("w", "")
    )

    void(
        "VertexAttribL1ui64vNV",
        "",

        GLuint.IN("index", ""),
        Check(1)..const..GLuint64EXT_p.IN("v", "")
    )

    void(
        "VertexAttribL2ui64vNV",
        "",

        GLuint.IN("index", ""),
        Check(2)..const..GLuint64EXT_p.IN("v", "")
    )

    void(
        "VertexAttribL3ui64vNV",
        "",

        GLuint.IN("index", ""),
        Check(3)..const..GLuint64EXT_p.IN("v", "")
    )

    void(
        "VertexAttribL4ui64vNV",
        "",

        GLuint.IN("index", ""),
        Check(4)..const..GLuint64EXT_p.IN("v", "")
    )

    void(
        "GetVertexAttribLi64vNV",
        "",

        GLuint.IN("index", ""),
        GLenum.IN("pname", ""),
        Check(1)..ReturnParam..GLint64EXT_p.OUT("params", "")
    )

    void(
        "GetVertexAttribLui64vNV",
        "",

        GLuint.IN("index", ""),
        GLenum.IN("pname", ""),
        Check(1)..ReturnParam..GLuint64EXT_p.OUT("params", "")
    )

    DependsOn("GL_NV_vertex_buffer_unified_memory")..void(
        "VertexAttribLFormatNV",
        "",

        GLuint.IN("index", ""),
        GLint.IN("size", ""),
        GLenum.IN("type", ""),
        GLsizei.IN("stride", "")
    )
}