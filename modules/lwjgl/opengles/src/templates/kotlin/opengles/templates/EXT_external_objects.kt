/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_memory_object = "EXTMemoryObject".nativeClassGLES("EXT_memory_object", postfix = EXT) {
    IntConstant(
        "TEXTURE_TILING_EXT"..0x9580
    )

    IntConstant(
        "DEDICATED_MEMORY_OBJECT_EXT"..0x9581,
        "PROTECTED_MEMORY_OBJECT_EXT"..0x959B
    )

    IntConstant(
        "NUM_TILING_TYPES_EXT"..0x9582,
        "TILING_TYPES_EXT"..0x9583
    )

    IntConstant(
        "OPTIMAL_TILING_EXT"..0x9584,
        "LINEAR_TILING_EXT"..0x9585
    )

    IntConstant(
        "NUM_DEVICE_UUIDS_EXT"..0x9596,
        "DEVICE_UUID_EXT"..0x9597,
        "DRIVER_UUID_EXT"..0x9598
    )

    IntConstant(
        "UUID_SIZE_EXT".."16"
    )

    void(
        "GetUnsignedBytevEXT",

        GLenum("pname"),
        Unsafe..GLubyte.p("data")
    )

    void(
        "GetUnsignedBytei_vEXT",

        GLenum("target"),
        GLuint("index"),
        Unsafe..GLubyte.p("data")
    )

    void(
        "DeleteMemoryObjectsEXT",

        AutoSize("memoryObjects")..GLsizei("n"),
        SingleValue("memoryObject")..GLuint.const.p("memoryObjects")
    )

    GLboolean(
        "IsMemoryObjectEXT",

        GLuint("memoryObject")
    )

    void(
        "CreateMemoryObjectsEXT",

        AutoSize("memoryObjects")..GLsizei("n"),
        ReturnParam..GLuint.p("memoryObjects")
    )

    void(
        "MemoryObjectParameterivEXT",

        GLuint("memoryObject"),
        GLenum("pname"),
        SingleValue("param")..Check(1)..GLint.const.p("params")
    )

    void(
        "GetMemoryObjectParameterivEXT",

        GLuint("memoryObject"),
        GLenum("pname"),
        ReturnParam..Check(1)..GLint.p("params")
    )

    void(
        "TexStorageMem2DEXT",

        GLenum("target"),
        GLsizei("levels"),
        GLenum("internalFormat"),
        GLsizei("width"),
        GLsizei("height"),
        GLuint("memory"),
        GLuint64("offset")
    )

    void(
        "TexStorageMem2DMultisampleEXT",

        GLenum("target"),
        GLsizei("samples"),
        GLenum("internalFormat"),
        GLsizei("width"),
        GLsizei("height"),
        GLboolean("fixedSampleLocations"),
        GLuint("memory"),
        GLuint64("offset")
    )

    void(
        "TexStorageMem3DEXT",

        GLenum("target"),
        GLsizei("levels"),
        GLenum("internalFormat"),
        GLsizei("width"),
        GLsizei("height"),
        GLsizei("depth"),
        GLuint("memory"),
        GLuint64("offset")
    )

    void(
        "TexStorageMem3DMultisampleEXT",

        GLenum("target"),
        GLsizei("samples"),
        GLenum("internalFormat"),
        GLsizei("width"),
        GLsizei("height"),
        GLsizei("depth"),
        GLboolean("fixedSampleLocations"),
        GLuint("memory"),
        GLuint64("offset")
    )

    void(
        "BufferStorageMemEXT",

        GLenum("target"),
        GLsizeiptr("size"),
        GLuint("memory"),
        GLuint64("offset")
    )

    DependsOn("hasDSA(ext)")..void(
        "TextureStorageMem2DEXT",

        GLuint("texture"),
        GLsizei("levels"),
        GLenum("internalFormat"),
        GLsizei("width"),
        GLsizei("height"),
        GLuint("memory"),
        GLuint64("offset")
    )

    DependsOn("hasDSA(ext)")..void(
        "TextureStorageMem2DMultisampleEXT",

        GLuint("texture"),
        GLsizei("samples"),
        GLenum("internalFormat"),
        GLsizei("width"),
        GLsizei("height"),
        GLboolean("fixedSampleLocations"),
        GLuint("memory"),
        GLuint64("offset")
    )

    DependsOn("hasDSA(ext)")..void(
        "TextureStorageMem3DEXT",

        GLuint("texture"),
        GLsizei("levels"),
        GLenum("internalFormat"),
        GLsizei("width"),
        GLsizei("height"),
        GLsizei("depth"),
        GLuint("memory"),
        GLuint64("offset")
    )

    DependsOn("hasDSA(ext)")..void(
        "TextureStorageMem3DMultisampleEXT",

        GLuint("texture"),
        GLsizei("samples"),
        GLenum("internalFormat"),
        GLsizei("width"),
        GLsizei("height"),
        GLsizei("depth"),
        GLboolean("fixedSampleLocations"),
        GLuint("memory"),
        GLuint64("offset")
    )

    DependsOn("hasDSA(ext)")..void(
        "NamedBufferStorageMemEXT",

        GLuint("buffer"),
        GLsizeiptr("size"),
        GLuint("memory"),
        GLuint64("offset")
    )
}

val EXT_semaphore = "EXTSemaphore".nativeClassGLES("EXT_semaphore", postfix = EXT) {
    IntConstant(
        "NUM_DEVICE_UUIDS_EXT"..0x9596,
        "DEVICE_UUID_EXT"..0x9597,
        "DRIVER_UUID_EXT"..0x9598
    )

    IntConstant(
        "UUID_SIZE_EXT".."16"
    )

    IntConstant(
        "LAYOUT_GENERAL_EXT"..0x958D,
        "LAYOUT_COLOR_ATTACHMENT_EXT"..0x958E,
        "LAYOUT_DEPTH_STENCIL_ATTACHMENT_EXT"..0x958F,
        "LAYOUT_DEPTH_STENCIL_READ_ONLY_EXT"..0x9590,
        "LAYOUT_SHADER_READ_ONLY_EXT"..0x9591,
        "LAYOUT_TRANSFER_SRC_EXT"..0x9592,
        "LAYOUT_TRANSFER_DST_EXT"..0x9593,
        "LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_EXT"..0x9530,
        "LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_EXT"..0x9531
    )

    reuse(EXT_memory_object, "GetUnsignedBytevEXT")
    reuse(EXT_memory_object, "GetUnsignedBytei_vEXT")

    void(
        "GenSemaphoresEXT",

        AutoSize("semaphores")..GLsizei("n"),
        ReturnParam..GLuint.p("semaphores")
    )

    void(
        "DeleteSemaphoresEXT",

        AutoSize("semaphores")..GLsizei("n"),
        SingleValue("semaphore")..GLuint.const.p("semaphores")
    )

    GLboolean(
        "IsSemaphoreEXT",

        GLuint("semaphore")
    )

    void(
        "SemaphoreParameterui64vEXT",

        GLuint("semaphore"),
        GLenum("pname"),
        SingleValue("param")..Check(1)..GLuint64.const.p("params")
    )

    void(
        "GetSemaphoreParameterui64vEXT",

        GLuint("semaphore"),
        GLenum("pname"),
        ReturnParam..Check(1)..GLuint64.p("params")
    )

    void(
        "WaitSemaphoreEXT",

        GLuint("semaphore"),
        AutoSize("buffers")..GLuint("numBufferBarriers"),
        GLuint.const.p("buffers"),
        AutoSize("textures", "srcLayouts")..GLuint("numTextureBarriers"),
        GLuint.const.p("textures"),
        GLenum.const.p("srcLayouts")
    )

    void(
        "SignalSemaphoreEXT",

        GLuint("semaphore"),
        AutoSize("buffers")..GLuint("numBufferBarriers"),
        GLuint.const.p("buffers"),
        AutoSize("textures", "dstLayouts")..GLuint("numTextureBarriers"),
        GLuint.const.p("textures"),
        GLenum.const.p("dstLayouts")
    )
}