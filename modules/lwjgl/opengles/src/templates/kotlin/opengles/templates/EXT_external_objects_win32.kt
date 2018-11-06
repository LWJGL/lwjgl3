/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_memory_object_win32 = "EXTMemoryObjectWin32".nativeClassGLES("EXT_memory_object_win32", postfix = EXT) {
    documentation =
        """
        Native bindings to the ${registryLink("EXT_external_objects_win32")} extension.

        Building upon the OpenGL memory object and semaphore framework defined in ${registryLinkTo("EXT", "external_objects")}, this extension enables an
        OpenGL application to import a memory object or semaphore from a Win32 NT handle or a KMT share handle.
        """

    IntConstant(
        """
        Accepted by the {@code handleType} parameter of #ImportMemoryWin32HandleEXT(), #ImportMemoryWin32NameEXT(), #ImportSemaphoreWin32HandleEXT(), and
        #ImportSemaphoreWin32NameEXT().
        """,

        "HANDLE_TYPE_OPAQUE_WIN32_EXT"..0x9587
    )

    IntConstant(
        "Accepted by the {@code handleType} parameter of #ImportMemoryWin32HandleEXT() and #ImportSemaphoreWin32HandleEXT().",

        "HANDLE_TYPE_OPAQUE_WIN32_KMT_EXT"..0x9588
    )

    IntConstant(
        """
        Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, GetInteger64v, GetBooleani_v, GetIntegeri_v, GetFloati_v,
        GetDoublei_v, and GetInteger64i_v.
        """,

        "DEVICE_LUID_EXT"..0x9599,
        "DEVICE_NODE_MASK_EXT"..0x959A
    )

    IntConstant(
        "Constant values.",

        "LUID_SIZE_EXT".."8"
    )

    IntConstant(
        "Accepted by the {@code handleType} parameter of #ImportMemoryWin32HandleEXT() and #ImportMemoryWin32NameEXT().",

        "HANDLE_TYPE_D3D12_TILEPOOL_EXT"..0x9589,
        "HANDLE_TYPE_D3D12_RESOURCE_EXT"..0x958A,
        "HANDLE_TYPE_D3D11_IMAGE_EXT"..0x958B
    )

    IntConstant(
        "Accepted by the {@code handleType} parameter of #ImportMemoryWin32HandleEXT().",

        "HANDLE_TYPE_D3D11_IMAGE_KMT_EXT"..0x958C
    )

    void(
        "ImportMemoryWin32HandleEXT",
        "",

        GLuint("memory", ""),
        GLuint64("size", ""),
        GLenum("handleType", ""),
        opaque_p("handle", "")
    )

    void(
        "ImportMemoryWin32NameEXT",
        "",

        GLuint("memory", ""),
        GLuint64("size", ""),
        GLenum("handleType", ""),
        opaque_const_p("name", "")
    )
}

val EXT_semaphore_win32 = "EXTSemaphoreWin32".nativeClassGLES("EXT_semaphore_win32", postfix = EXT) {
    documentation =
        """
        Native bindings to the ${registryLink("EXT_external_objects_win32")} extension.

        Building upon the OpenGL memory object and semaphore framework defined in ${registryLinkTo("EXT", "external_objects")}, this extension enables an
        OpenGL application to import a memory object or semaphore from a Win32 NT handle or a KMT share handle.
        """

    IntConstant(
        """
        Accepted by the {@code handleType} parameter of #ImportMemoryWin32HandleEXT(), #ImportMemoryWin32NameEXT(), #ImportSemaphoreWin32HandleEXT(), and
        #ImportSemaphoreWin32NameEXT().
        """,

        "HANDLE_TYPE_OPAQUE_WIN32_EXT"..0x9587
    )

    IntConstant(
        "Accepted by the {@code handleType} parameter of #ImportMemoryWin32HandleEXT() and #ImportSemaphoreWin32HandleEXT().",

        "HANDLE_TYPE_OPAQUE_WIN32_KMT_EXT"..0x9588
    )

    IntConstant(
        """
        Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, GetInteger64v, GetBooleani_v, GetIntegeri_v, GetFloati_v,
        GetDoublei_v, and GetInteger64i_v.
        """,

        "DEVICE_LUID_EXT"..0x9599,
        "DEVICE_NODE_MASK_EXT"..0x959A
    )

    IntConstant(
        "Constant values.",

        "LUID_SIZE_EXT".."8"
    )

    IntConstant(
        "Accepted by the {@code handleType} parameter of #ImportSemaphoreWin32HandleEXT().",

        "HANDLE_TYPE_D3D12_FENCE_EXT"..0x9594
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of #SemaphoreParameterui64vEXT() and #GetSemaphoreParameterui64vEXT().",

        "D3D12_FENCE_VALUE_EXT"..0x9595
    )

    void(
        "ImportSemaphoreWin32HandleEXT",
        "",

        GLuint("semaphore", ""),
        GLenum("handleType", ""),
        opaque_p("handle", "")
    )

    void(
        "ImportSemaphoreWin32NameEXT",
        "",

        GLuint("semaphore", ""),
        GLenum("handleType", ""),
        opaque_const_p("name", "")
    )
}