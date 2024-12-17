/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.windows.*

val WGL_NV_DX_interop = "WGLNVDXInterop".nativeClassWGL("WGL_NV_DX_interop", NV) {
    IntConstant(
        "ACCESS_READ_ONLY_NV"..0x0000,
        "ACCESS_READ_WRITE_NV"..0x0001,
        "ACCESS_WRITE_DISCARD_NV"..0x0002
    )

    BOOL(
        "DXSetResourceShareHandleNV",

        opaque_p("dxObject"),
        HANDLE("shareHandle")
    )

    HANDLE(
        "DXOpenDeviceNV",

        opaque_p("dxDevice")
    )

    BOOL(
        "DXCloseDeviceNV",

        HANDLE("device")
    )

    HANDLE(
        "DXRegisterObjectNV",

        HANDLE("device"),
        opaque_p("dxResource"),
        GLuint("name"),
        GLenum("type"),
        GLenum("access")
    )


    BOOL(
        "DXUnregisterObjectNV",

        HANDLE("device"),
        HANDLE("object")
    )

    BOOL(
        "DXObjectAccessNV",

        HANDLE("object"),
        GLenum("access")
    )

    BOOL(
        "DXLockObjectsNV",

        HANDLE("device"),
        AutoSize("objects")..GLint("count"),
        HANDLE.p("objects")
    )

    BOOL(
        "DXUnlockObjectsNV",

        HANDLE("device"),
        AutoSize("objects")..GLint("count"),
        HANDLE.p("objects")
    )
}