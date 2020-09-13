/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_memory_object_sparse = "NVMemoryObjectSparse".nativeClassGL("NV_memory_object_sparse", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds sparse support to {@code EXT_memory_object} extension.

        Requires ${EXT_memory_object.link}, ${ARB_sparse_texture.link} and/or ${ARB_sparse_buffer.link} or a version of OpenGL that incorporates it.
        """

    void(
        "BufferPageCommitmentMemNV",
        "",

        GLenum("target", ""),
        GLintptr("offset", ""),
        GLsizeiptr("size", ""),
        GLuint("memory", ""),
        GLuint64("memOffset", ""),
        GLboolean("commit", "")
    )

    void(
        "NamedBufferPageCommitmentMemNV",
        "",

        GLuint("buffer", ""),
        GLintptr("offset", ""),
        GLsizeiptr("size", ""),
        GLuint("memory", ""),
        GLuint64("memOffset", ""),
        GLboolean("commit", "")
    )

    void(
        "TexPageCommitmentMemNV",
        "",

        GLenum("target", ""),
        GLint("layer", ""),
        GLint("level", ""),
        GLint("xoffset", ""),
        GLint("yoffset", ""),
        GLint("zoffset", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLsizei("depth", ""),
        GLuint("memory", ""),
        GLuint64("offset", ""),
        GLboolean("commit", "")
    )

    void(
        "TexturePageCommitmentMemNV",
        "",

        GLuint("texture", ""),
        GLint("layer", ""),
        GLint("level", ""),
        GLint("xoffset", ""),
        GLint("yoffset", ""),
        GLint("zoffset", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLsizei("depth", ""),
        GLuint("memory", ""),
        GLuint64("offset", ""),
        GLboolean("commit", "")
    )
}
