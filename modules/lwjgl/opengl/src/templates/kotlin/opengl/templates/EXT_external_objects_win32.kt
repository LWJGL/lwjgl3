/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_memory_object_win32 = "EXTMemoryObjectWin32".nativeClassGL("EXT_memory_object_win32", postfix = EXT) {
    IntConstant(
        "HANDLE_TYPE_OPAQUE_WIN32_EXT"..0x9587
    )

    IntConstant(
        "HANDLE_TYPE_OPAQUE_WIN32_KMT_EXT"..0x9588
    )

    IntConstant(
        "DEVICE_LUID_EXT"..0x9599,
        "DEVICE_NODE_MASK_EXT"..0x959A
    )

    IntConstant(
        "LUID_SIZE_EXT".."8"
    )

    IntConstant(
        "HANDLE_TYPE_D3D12_TILEPOOL_EXT"..0x9589,
        "HANDLE_TYPE_D3D12_RESOURCE_EXT"..0x958A,
        "HANDLE_TYPE_D3D11_IMAGE_EXT"..0x958B
    )

    IntConstant(
        "HANDLE_TYPE_D3D11_IMAGE_KMT_EXT"..0x958C
    )

    void(
        "ImportMemoryWin32HandleEXT",

        GLuint("memory"),
        GLuint64("size"),
        GLenum("handleType"),
        opaque_p("handle")
    )

    void(
        "ImportMemoryWin32NameEXT",

        GLuint("memory"),
        GLuint64("size"),
        GLenum("handleType"),
        opaque_const_p("name")
    )
}

val EXT_semaphore_win32 = "EXTSemaphoreWin32".nativeClassGL("EXT_semaphore_win32", postfix = EXT) {
    IntConstant(
        "HANDLE_TYPE_OPAQUE_WIN32_EXT"..0x9587
    )

    IntConstant(
        "HANDLE_TYPE_OPAQUE_WIN32_KMT_EXT"..0x9588
    )

    IntConstant(
        "DEVICE_LUID_EXT"..0x9599,
        "DEVICE_NODE_MASK_EXT"..0x959A
    )

    IntConstant(
        "LUID_SIZE_EXT".."8"
    )

    IntConstant(
        "HANDLE_TYPE_D3D12_FENCE_EXT"..0x9594
    )

    IntConstant(
        "D3D12_FENCE_VALUE_EXT"..0x9595
    )

    void(
        "ImportSemaphoreWin32HandleEXT",

        GLuint("semaphore"),
        GLenum("handleType"),
        opaque_p("handle")
    )

    void(
        "ImportSemaphoreWin32NameEXT",

        GLuint("semaphore"),
        GLenum("handleType"),
        opaque_const_p("name")
    )
}