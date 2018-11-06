/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.windows.*

val WGL_NV_DX_interop = "WGLNVDXInterop".nativeClassWGL("WGL_NV_DX_interop", NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows OpenGL to directly access DirectX buffers and surfaces. A DirectX vertex buffer may be shared as an OpenGL buffer object and a
        DirectX surface may be shared as an OpenGL texture or renderbuffer object.

        Requires ${GL21.core}.
        """

    val accessModes = IntConstant(
        "Accepted by the {@code access} parameters of #DXRegisterObjectNV() and #DXObjectAccessNV().",

        "ACCESS_READ_ONLY_NV"..0x0000,
        "ACCESS_READ_WRITE_NV"..0x0001,
        "ACCESS_WRITE_DISCARD_NV"..0x0002
    ).javaDocLinks

    BOOL(
        "DXSetResourceShareHandleNV",
        "",

        opaque_p("dxObject", "a pointer to the DirectX resource that will be shared"),
        HANDLE("shareHandle", "the share handle that the OS generated for the resource")
    )

    HANDLE(
        "DXOpenDeviceNV",
        "Prepares a DirectX device for interoperability and returns a handle to a GL/DirectX interop device.",

        opaque_p("dxDevice", "a pointer to a supported Direct3D device object")
    )

    BOOL(
        "DXCloseDeviceNV",
        "",

        HANDLE("device", "")
    )

    HANDLE(
        "DXRegisterObjectNV",
        "Prepares a DirectX object for use by the GL and returns a handle to a GL/DirectX interop object.",

        HANDLE("device", "a GL/DirectX interop device handle, as returned by #DXOpenDeviceNV()"),
        opaque_p("dxResource", "a pointer to a DirectX resource to be registered with the GL"),
        GLuint(
            "name",
            "the GL object name to be assigned to the DirectX resource in the namespace of the objects identified by {@code type} in the current GL context"
        ),
        GLenum("type", "the GL object type that will map to the DirectX resource being shared"),
        GLenum("access", "indicates the intended usage of the resource in GL", accessModes)
    )


    BOOL(
        "DXUnregisterObjectNV",
        "",

        HANDLE("device", ""),
        HANDLE("object", "")
    )

    BOOL(
        "DXObjectAccessNV",
        "Modifies the access mode of an interop object, if a different access mode is required after the object has been registered.",

        HANDLE("object", "the GL/DirectX interop object"),
        GLenum("access", "the new access mode", accessModes)
    )

    BOOL(
        "DXLockObjectsNV",
        """
        Before a GL object which is associated with a DirectX resource may be used, it must be locked with this function.

        A return value of TRUE indicates that all objects were successfully locked.  A return value of FALSE indicates an error. If the function returns FALSE,
        none of the objects will be locked.

        Attempting to access an interop object via GL when the object is not locked, or attempting to access the DirectX resource through the DirectX API when
        it is locked by GL, will result in undefined behavior and may result in data corruption or program termination. Likewise, passing invalid interop device
        or object handles to this function has undefined results, including program termination.
        """,

        HANDLE("device", "the GL/DirectX interop device handle"),
        AutoSize("objects")..GLint("count", "the number of objects to lock"),
        HANDLE.p("objects", "an array of {@code count} interop objects")
    )

    BOOL(
        "DXUnlockObjectsNV",
        "Return control of an object to DirectX.",

        HANDLE("device", "the GL/DirectX interop device handle"),
        AutoSize("objects")..GLint("count", "the number of objects to unlock"),
        HANDLE.p("objects", "an array of {@code count} interop objects")
    )
}