/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_memory_attachment = "NVMemoryAttachment".nativeClassGL("NV_memory_attachment", postfix = NV) {
    IntConstant(
        "ATTACHED_MEMORY_OBJECT_NV"..0x95A4,
        "ATTACHED_MEMORY_OFFSET_NV"..0x95A5,
        "MEMORY_ATTACHABLE_ALIGNMENT_NV"..0x95A6,
        "MEMORY_ATTACHABLE_SIZE_NV"..0x95A7,
        "MEMORY_ATTACHABLE_NV"..0x95A8
    )

    IntConstant(
        "DETACHED_MEMORY_INCARNATION_NV"..0x95A9
    )

    IntConstant(
        "DETACHED_TEXTURES_NV"..0x95AA,
        "DETACHED_BUFFERS_NV"..0x95AB
    )

    IntConstant(
        "MAX_DETACHED_TEXTURES_NV"..0x95AC,
        "MAX_DETACHED_BUFFERS_NV"..0x95AD
    )


    void(
        "GetMemoryObjectDetachedResourcesuivNV",

        GLuint("memory"),
        GLenum("pname"),
        GLint("first"),
        AutoSize("params")..GLsizei("count"),
        GLuint.p("params")
    )

    void(
        "ResetMemoryObjectParameterNV",

        GLuint("memory"),
        GLenum("pname")
    )

    void(
        "TexAttachMemoryNV",

        GLenum("target"),
        GLuint("memory"),
        GLuint64("offset")
    )

    void(
        "BufferAttachMemoryNV",

        GLenum("target"),
        GLuint("memory"),
        GLuint64("offset")
    )

    DependsOn("hasDSA(ext)")..void(
        "TextureAttachMemoryNV",

        GLuint("texture"),
        GLuint("memory"),
        GLuint64("offset")
    )

    DependsOn("hasDSA(ext)")..void(
        "NamedBufferAttachMemoryNV",

        GLuint("buffer"),
        GLuint("memory"),
        GLuint64("offset")
    )
}