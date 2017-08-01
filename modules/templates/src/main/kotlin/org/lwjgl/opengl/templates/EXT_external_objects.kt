/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_memory_object = "EXTMemoryObject".nativeClassGL("EXT_memory_object", postfix = EXT) {
    documentation =
        """
        Native bindings to the ${registryLink("EXT", "external_objects")} extension.

        The Vulkan API introduces the concept of explicit memory objects and reusable synchronization objects. This extension brings those concepts to the
        OpenGL API via two new object types:
        ${ul(
            "Memory objects",
            "Semaphores"
        )}

        Rather than allocating memory as a response to object allocation, memory allocation and binding are two separate operations in Vulkan. This extension
        allows an OpenGL application to import a Vulkan memory object, and to bind textures and/or buffer objects to it.

        No methods to import memory objects are defined here. Separate platform-specific extensions are defined for this purpose.

        Semaphores are synchronization primitives that can be waited on and signaled only by the GPU, or in GL terms, in the GL server. They are similar in
        concept to GL's "sync" objects and EGL's "EGLSync" objects, but different enough that compatibilities between the two are difficult to derive.

        Rather than attempt to map Vulkan semaphores on to GL/EGL sync objects to achieve interoperability, this extension introduces a new object, GL
        semaphores, that map directly to the semantics of Vulkan semaphores. To achieve full image and buffer memory coherence with a Vulkan driver, the
        commands that manipulate semaphores also allow external usage information to be imported and exported.

        Requires ${GL42.core} or ${ARB_texture_storage.link}.
        """

    IntConstant(
        """
        Accepted by the {@code pname} parameter of TexParameter{ifx}{v}, TexParameterI{i ui}v, TextureParameter{if}{v}, TextureParameterI{i ui}v,
        GetTexParameter{if}v, GetTexParameterI{i ui}v, GetTextureParameter{if}v, and GetTextureParameterI{i ui}v.
        """,

        "TEXTURE_TILING_EXT"..0x9580
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of #MemoryObjectParameterivEXT(), and #GetMemoryObjectParameterivEXT().",

        "DEDICATED_MEMORY_OBJECT_EXT"..0x9581
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetInternalFormativ or GetInternalFormati64v.",

        "NUM_TILING_TYPES_EXT"..0x9582,
        "TILING_TYPES_EXT"..0x9583
    )

    IntConstant(
        """
        Returned in the {@code params} parameter of GetInternalFormativ or GetInternalFormati64v when the {@code pname} parameter is #TILING_TYPES_EXT,
        returned in the {@code params} parameter of GetTexParameter{if}v, GetTexParameterI{i ui}v, GetTextureParameter{if}v, and GetTextureParameterI{i ui}v
        when the {@code pname} parameter is #TEXTURE_TILING_EXT, and accepted by the {@code params} parameter of TexParameter{ifx}{v}, TexParameterI{i ui}v,
        TextureParameter{if}{v}, TextureParameterI{i ui}v when the {@code pname} parameter is #TEXTURE_TILING_EXT.
        """,

        "OPTIMAL_TILING_EXT"..0x9584,
        "LINEAR_TILING_EXT"..0x9585
    )

    IntConstant(
        """
        Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, GetInteger64v, #GetUnsignedBytevEXT(), and the
        {@code target} parameter of GetBooleani_v, GetIntegeri_v,GetFloati_v, GetDoublei_v, GetInteger64i_v, and #GetUnsignedBytei_vEXT().
        """,

        "NUM_DEVICE_UUIDS_EXT"..0x9596,
        "DEVICE_UUID_EXT"..0x9597,
        "DRIVER_UUID_EXT"..0x9598
    )

    IntConstant(
        "Constant values.",

        "UUID_SIZE_EXT".."16"
    )

    void(
        "GetUnsignedBytevEXT",
        "",

        GLenum.IN("pname", ""),
        Unsafe..GLubyte_p.OUT("data", "")
    )

    void(
        "GetUnsignedBytei_vEXT",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", ""),
        Unsafe..GLubyte_p.OUT("data", "")
    )

    void(
        "DeleteMemoryObjectsEXT",
        "",

        AutoSize("memoryObjects")..GLsizei.IN("n", ""),
        SingleValue("memoryObject")..const..GLuint_p.IN("memoryObjects", "")
    )

    GLboolean(
        "IsMemoryObjectEXT",
        "",

        GLuint.IN("memoryObject", "")
    )

    void(
        "CreateMemoryObjectsEXT",
        "",

        AutoSize("memoryObjects")..GLsizei.IN("n", ""),
        ReturnParam..GLuint_p.OUT("memoryObjects", "")
    )

    void(
        "MemoryObjectParameterivEXT",
        "",

        GLuint.IN("memoryObject", ""),
        GLenum.IN("pname", ""),
        SingleValue("param")..Check(1)..const..GLint_p.IN("params", "")
    )

    void(
        "GetMemoryObjectParameterivEXT",
        "",

        GLuint.IN("memoryObject", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLint_p.OUT("params", "")
    )

    void(
        "TexStorageMem2DEXT",
        "",

        GLenum.IN("target", ""),
        GLsizei.IN("levels", ""),
        GLenum.IN("internalFormat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLuint.IN("memory", ""),
        GLuint64.IN("offset", "")
    )

    void(
        "TexStorageMem2DMultisampleEXT",
        "",

        GLenum.IN("target", ""),
        GLsizei.IN("samples", ""),
        GLenum.IN("internalFormat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLboolean.IN("fixedSampleLocations", ""),
        GLuint.IN("memory", ""),
        GLuint64.IN("offset", "")
    )

    void(
        "TexStorageMem3DEXT",
        "",

        GLenum.IN("target", ""),
        GLsizei.IN("levels", ""),
        GLenum.IN("internalFormat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLsizei.IN("depth", ""),
        GLuint.IN("memory", ""),
        GLuint64.IN("offset", "")
    )

    void(
        "TexStorageMem3DMultisampleEXT",
        "",

        GLenum.IN("target", ""),
        GLsizei.IN("samples", ""),
        GLenum.IN("internalFormat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLsizei.IN("depth", ""),
        GLboolean.IN("fixedSampleLocations", ""),
        GLuint.IN("memory", ""),
        GLuint64.IN("offset", "")
    )

    void(
        "BufferStorageMemEXT",
        "",

        GLenum.IN("target", ""),
        GLsizeiptr.IN("size", ""),
        GLuint.IN("memory", ""),
        GLuint64.IN("offset", "")
    )

    DependsOn("caps.hasDSA(ext)")..void(
        "TextureStorageMem2DEXT",
        "",

        GLuint.IN("texture", ""),
        GLsizei.IN("levels", ""),
        GLenum.IN("internalFormat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLuint.IN("memory", ""),
        GLuint64.IN("offset", "")
    )

    DependsOn("caps.hasDSA(ext)")..void(
        "TextureStorageMem2DMultisampleEXT",
        "",

        GLuint.IN("texture", ""),
        GLsizei.IN("samples", ""),
        GLenum.IN("internalFormat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLboolean.IN("fixedSampleLocations", ""),
        GLuint.IN("memory", ""),
        GLuint64.IN("offset", "")
    )

    DependsOn("caps.hasDSA(ext)")..void(
        "TextureStorageMem3DEXT",
        "",

        GLuint.IN("texture", ""),
        GLsizei.IN("levels", ""),
        GLenum.IN("internalFormat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLsizei.IN("depth", ""),
        GLuint.IN("memory", ""),
        GLuint64.IN("offset", "")
    )

    DependsOn("caps.hasDSA(ext)")..void(
        "TextureStorageMem3DMultisampleEXT",
        "",

        GLuint.IN("texture", ""),
        GLsizei.IN("samples", ""),
        GLenum.IN("internalFormat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLsizei.IN("depth", ""),
        GLboolean.IN("fixedSampleLocations", ""),
        GLuint.IN("memory", ""),
        GLuint64.IN("offset", "")
    )

    DependsOn("caps.hasDSA(ext)")..void(
        "NamedBufferStorageMemEXT",
        "",

        GLuint.IN("buffer", ""),
        GLsizeiptr.IN("size", ""),
        GLuint.IN("memory", ""),
        GLuint64.IN("offset", "")
    )

    void(
        "TexStorageMem1DEXT",
        "",

        GLenum.IN("target", ""),
        GLsizei.IN("levels", ""),
        GLenum.IN("internalFormat", ""),
        GLsizei.IN("width", ""),
        GLuint.IN("memory", ""),
        GLuint64.IN("offset", "")
    )

    DependsOn("caps.hasDSA(ext)")..void(
        "TextureStorageMem1DEXT",
        "",

        GLuint.IN("texture", ""),
        GLsizei.IN("levels", ""),
        GLenum.IN("internalFormat", ""),
        GLsizei.IN("width", ""),
        GLuint.IN("memory", ""),
        GLuint64.IN("offset", "")
    )
}

val EXT_semaphore = "EXTSemaphore".nativeClassGL("EXT_semaphore", postfix = EXT) {
    documentation =
        """
        Native bindings to the ${registryLink("EXT", "external_objects")} extension.

        The Vulkan API introduces the concept of explicit memory objects and reusable synchronization objects. This extension brings those concepts to the
        OpenGL API via two new object types:
        ${ul(
            "Memory objects",
            "Semaphores"
        )}

        Rather than allocating memory as a response to object allocation, memory allocation and binding are two separate operations in Vulkan. This extension
        allows an OpenGL application to import a Vulkan memory object, and to bind textures and/or buffer objects to it.

        No methods to import memory objects are defined here. Separate platform-specific extensions are defined for this purpose.

        Semaphores are synchronization primitives that can be waited on and signaled only by the GPU, or in GL terms, in the GL server. They are similar in
        concept to GL's "sync" objects and EGL's "EGLSync" objects, but different enough that compatibilities between the two are difficult to derive.

        Rather than attempt to map Vulkan semaphores on to GL/EGL sync objects to achieve interoperability, this extension introduces a new object, GL
        semaphores, that map directly to the semantics of Vulkan semaphores. To achieve full image and buffer memory coherence with a Vulkan driver, the
        commands that manipulate semaphores also allow external usage information to be imported and exported.
        """

    IntConstant(
        """
        Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, GetInteger64v, #GetUnsignedBytevEXT(), and the
        {@code target} parameter of GetBooleani_v, GetIntegeri_v,GetFloati_v, GetDoublei_v, GetInteger64i_v, and #GetUnsignedBytei_vEXT().
        """,

        "NUM_DEVICE_UUIDS_EXT"..0x9596,
        "DEVICE_UUID_EXT"..0x9597,
        "DRIVER_UUID_EXT"..0x9598
    )

    IntConstant(
        "Constant values.",

        "UUID_SIZE_EXT".."16"
    )

    IntConstant(
        "Accepted by the {@code dstLayouts} parameter of #SignalSemaphoreEXT() and the {@code srcLayouts} parameter of #WaitSemaphoreEXT().",

        "LAYOUT_GENERAL_EXT"..0x958D,
        "LAYOUT_COLOR_ATTACHMENT_EXT"..0x958E,
        "LAYOUT_DEPTH_STENCIL_ATTACHMENT_EXT"..0x958F,
        "LAYOUT_DEPTH_STENCIL_READ_ONLY_EXT"..0x9590,
        "LAYOUT_SHADER_READ_ONLY_EXT"..0x9591,
        "LAYOUT_TRANSFER_SRC_EXT"..0x9592,
        "LAYOUT_TRANSFER_DST_EXT"..0x9593
    )

    void(
        "GetUnsignedBytevEXT",
        "",

        GLenum.IN("pname", ""),
        Unsafe..GLubyte_p.OUT("data", "")
    )

    void(
        "GetUnsignedBytei_vEXT",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", ""),
        Unsafe..GLubyte_p.OUT("data", "")
    )

    void(
        "GenSemaphoresEXT",
        "",

        AutoSize("semaphores")..GLsizei.IN("n", ""),
        ReturnParam..GLuint_p.OUT("semaphores", "")
    )

    void(
        "DeleteSemaphoresEXT",
        "",

        AutoSize("semaphores")..GLsizei.IN("n", ""),
        SingleValue("semaphore")..const..GLuint_p.IN("semaphores", "")
    )

    GLboolean(
        "IsSemaphoreEXT",
        "",

        GLuint.IN("semaphore", "")
    )

    void(
        "SemaphoreParameterui64vEXT",
        "",

        GLuint.IN("semaphore", ""),
        GLenum.IN("pname", ""),
        SingleValue("param")..Check(1)..const..GLuint64_p.IN("params", "")
    )

    void(
        "GetSemaphoreParameterui64vEXT",
        "",

        GLuint.IN("semaphore", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLuint64_p.OUT("params", "")
    )

    void(
        "WaitSemaphoreEXT",
        "",

        GLuint.IN("semaphore", ""),
        AutoSize("buffers")..GLuint.IN("numBufferBarriers", ""),
        const..GLuint_p.IN("buffers", ""),
        AutoSize("textures", "srcLayouts")..GLuint.IN("numTextureBarriers", ""),
        const..GLuint_p.IN("textures", ""),
        const..GLenum_p.IN("srcLayouts", "")
    )

    void(
        "SignalSemaphoreEXT",
        "",

        GLuint.IN("semaphore", ""),
        AutoSize("buffers")..GLuint.IN("numBufferBarriers", ""),
        const..GLuint_p.IN("buffers", ""),
        AutoSize("textures", "dstLayouts")..GLuint.IN("numTextureBarriers", ""),
        const..GLuint_p.IN("textures", ""),
        const..GLenum_p.IN("dstLayouts", "")
    )
}