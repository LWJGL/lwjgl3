/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_memory_attachment = "NVMemoryAttachment".nativeClassGL("NV_memory_attachment", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension extends the memory objects introduced with ${EXT_memory_object.link} to allow existing textures and buffers to be migrated to an
        imported memory allocation. The primary use-case of this extension is plug-in development where resource management (creation, deletion, sizing etc.)
        is handled by inaccessible host application code.

        Requires ${EXT_memory_object.link} and ${ARB_texture_storage.link} or a version of OpenGL that incorporates it.
        """

    IntConstant(
        """
        Accepted by the {@code pname} parameter of TexParameter{ifx}{v}, TexParameterI{i ui}v, TextureParameter{if}{v}, TextureParameterI{i ui}v,
        GetTexParameter{if}v, GetTexParameterI{i ui}v, GetTextureParameter{if}v, GetTextureParameterI{i ui}v, GetBufferParameter{i|i64}v and
        GetNamedBufferParameter{i|i64}v.
        """,

        "ATTACHED_MEMORY_OBJECT_NV"..0x95A4,
        "ATTACHED_MEMORY_OFFSET_NV"..0x95A5,
        "MEMORY_ATTACHABLE_ALIGNMENT_NV"..0x95A6,
        "MEMORY_ATTACHABLE_SIZE_NV"..0x95A7,
        "MEMORY_ATTACHABLE_NV"..0x95A8
    )

    IntConstant(
        """
        Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, GetInteger64v, GetUnsignedBytevEXT,
        GetMemoryObjectParameterivEXT, and the {@code target} parameter of GetBooleani_v, GetIntegeri_v,GetFloati_v, GetDoublei_v, GetInteger64i_v and
        GetUnsignedBytei_vEXT.
        """,

        "DETACHED_MEMORY_INCARNATION_NV"..0x95A9
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetMemoryObjectParameterivEXT, GetMemoryObjectDetachedResourcesuivNV and ResetMemoryObjectParameterNV.",

        "DETACHED_TEXTURES_NV"..0x95AA,
        "DETACHED_BUFFERS_NV"..0x95AB
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of MemoryObjectParameterivEXT, GetMemoryObjectParameterivEXT.",

        "MAX_DETACHED_TEXTURES_NV"..0x95AC,
        "MAX_DETACHED_BUFFERS_NV"..0x95AD
    )


    void(
        "GetMemoryObjectDetachedResourcesuivNV",
        "",

        GLuint("memory", ""),
        GLenum("pname", ""),
        GLint("first", ""),
        AutoSize("params")..GLsizei("count", ""),
        GLuint.p("params", "")
    )

    void(
        "ResetMemoryObjectParameterNV",
        "",

        GLuint("memory", ""),
        GLenum("pname", "")
    )

    void(
        "TexAttachMemoryNV",
        "",

        GLenum("target", ""),
        GLuint("memory", ""),
        GLuint64("offset", "")
    )

    void(
        "BufferAttachMemoryNV",
        "",

        GLenum("target", ""),
        GLuint("memory", ""),
        GLuint64("offset", "")
    )

    DependsOn("hasDSA(ext)")..void(
        "TextureAttachMemoryNV",
        "",

        GLuint("texture", ""),
        GLuint("memory", ""),
        GLuint64("offset", "")
    )

    DependsOn("hasDSA(ext)")..void(
        "NamedBufferAttachMemoryNV",
        "",

        GLuint("buffer", ""),
        GLuint("memory", ""),
        GLuint64("offset", "")
    )
}