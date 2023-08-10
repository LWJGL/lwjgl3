/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/WGL_NV_DX_interop.txt">WGL_NV_DX_interop</a> extension.
 * 
 * <p>This extension allows OpenGL to directly access DirectX buffers and surfaces. A DirectX vertex buffer may be shared as an OpenGL buffer object and a
 * DirectX surface may be shared as an OpenGL texture or renderbuffer object.</p>
 * 
 * <p>Requires {@link GL21 OpenGL 2.1}.</p>
 */
public class WGLNVDXInterop {

    /** Accepted by the {@code access} parameters of {@link #wglDXRegisterObjectNV DXRegisterObjectNV} and {@link #wglDXObjectAccessNV DXObjectAccessNV}. */
    public static final int
        WGL_ACCESS_READ_ONLY_NV     = 0x0,
        WGL_ACCESS_READ_WRITE_NV    = 0x1,
        WGL_ACCESS_WRITE_DISCARD_NV = 0x2;

    protected WGLNVDXInterop() {
        throw new UnsupportedOperationException();
    }

    // --- [ wglDXSetResourceShareHandleNV ] ---

    /**
     * @param dxObject    a pointer to the DirectX resource that will be shared
     * @param shareHandle the share handle that the OS generated for the resource
     */
    @NativeType("BOOL")
    public static boolean wglDXSetResourceShareHandleNV(@NativeType("void *") long dxObject, @NativeType("HANDLE") long shareHandle) {
        long __functionAddress = GL.getCapabilitiesWGL().wglDXSetResourceShareHandleNV;
        if (CHECKS) {
            check(__functionAddress);
            check(dxObject);
            check(shareHandle);
        }
        return callPPI(dxObject, shareHandle, __functionAddress) != 0;
    }

    // --- [ wglDXOpenDeviceNV ] ---

    /**
     * Prepares a DirectX device for interoperability and returns a handle to a GL/DirectX interop device.
     *
     * @param dxDevice a pointer to a supported Direct3D device object
     */
    @NativeType("HANDLE")
    public static long wglDXOpenDeviceNV(@NativeType("void *") long dxDevice) {
        long __functionAddress = GL.getCapabilitiesWGL().wglDXOpenDeviceNV;
        if (CHECKS) {
            check(__functionAddress);
            check(dxDevice);
        }
        return callPP(dxDevice, __functionAddress);
    }

    // --- [ wglDXCloseDeviceNV ] ---

    @NativeType("BOOL")
    public static boolean wglDXCloseDeviceNV(@NativeType("HANDLE") long device) {
        long __functionAddress = GL.getCapabilitiesWGL().wglDXCloseDeviceNV;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        return callPI(device, __functionAddress) != 0;
    }

    // --- [ wglDXRegisterObjectNV ] ---

    /**
     * Prepares a DirectX object for use by the GL and returns a handle to a GL/DirectX interop object.
     *
     * @param device     a GL/DirectX interop device handle, as returned by {@link #wglDXOpenDeviceNV DXOpenDeviceNV}
     * @param dxResource a pointer to a DirectX resource to be registered with the GL
     * @param name       the GL object name to be assigned to the DirectX resource in the namespace of the objects identified by {@code type} in the current GL context
     * @param type       the GL object type that will map to the DirectX resource being shared
     * @param access     indicates the intended usage of the resource in GL. One of:<br><table><tr><td>{@link #WGL_ACCESS_READ_ONLY_NV ACCESS_READ_ONLY_NV}</td><td>{@link #WGL_ACCESS_READ_WRITE_NV ACCESS_READ_WRITE_NV}</td><td>{@link #WGL_ACCESS_WRITE_DISCARD_NV ACCESS_WRITE_DISCARD_NV}</td></tr></table>
     */
    @NativeType("HANDLE")
    public static long wglDXRegisterObjectNV(@NativeType("HANDLE") long device, @NativeType("void *") long dxResource, @NativeType("GLuint") int name, @NativeType("GLenum") int type, @NativeType("GLenum") int access) {
        long __functionAddress = GL.getCapabilitiesWGL().wglDXRegisterObjectNV;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
            check(dxResource);
        }
        return callPPP(device, dxResource, name, type, access, __functionAddress);
    }

    // --- [ wglDXUnregisterObjectNV ] ---

    @NativeType("BOOL")
    public static boolean wglDXUnregisterObjectNV(@NativeType("HANDLE") long device, @NativeType("HANDLE") long object) {
        long __functionAddress = GL.getCapabilitiesWGL().wglDXUnregisterObjectNV;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
            check(object);
        }
        return callPPI(device, object, __functionAddress) != 0;
    }

    // --- [ wglDXObjectAccessNV ] ---

    /**
     * Modifies the access mode of an interop object, if a different access mode is required after the object has been registered.
     *
     * @param object the GL/DirectX interop object
     * @param access the new access mode. One of:<br><table><tr><td>{@link #WGL_ACCESS_READ_ONLY_NV ACCESS_READ_ONLY_NV}</td><td>{@link #WGL_ACCESS_READ_WRITE_NV ACCESS_READ_WRITE_NV}</td><td>{@link #WGL_ACCESS_WRITE_DISCARD_NV ACCESS_WRITE_DISCARD_NV}</td></tr></table>
     */
    @NativeType("BOOL")
    public static boolean wglDXObjectAccessNV(@NativeType("HANDLE") long object, @NativeType("GLenum") int access) {
        long __functionAddress = GL.getCapabilitiesWGL().wglDXObjectAccessNV;
        if (CHECKS) {
            check(__functionAddress);
            check(object);
        }
        return callPI(object, access, __functionAddress) != 0;
    }

    // --- [ wglDXLockObjectsNV ] ---

    /**
     * Unsafe version of: {@link #wglDXLockObjectsNV DXLockObjectsNV}
     *
     * @param count the number of objects to lock
     */
    public static int nwglDXLockObjectsNV(long device, int count, long objects) {
        long __functionAddress = GL.getCapabilitiesWGL().wglDXLockObjectsNV;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        return callPPI(device, count, objects, __functionAddress);
    }

    /**
     * Before a GL object which is associated with a DirectX resource may be used, it must be locked with this function.
     * 
     * <p>A return value of TRUE indicates that all objects were successfully locked.  A return value of FALSE indicates an error. If the function returns FALSE,
     * none of the objects will be locked.</p>
     * 
     * <p>Attempting to access an interop object via GL when the object is not locked, or attempting to access the DirectX resource through the DirectX API when
     * it is locked by GL, will result in undefined behavior and may result in data corruption or program termination. Likewise, passing invalid interop device
     * or object handles to this function has undefined results, including program termination.</p>
     *
     * @param device  the GL/DirectX interop device handle
     * @param objects an array of {@code count} interop objects
     */
    @NativeType("BOOL")
    public static boolean wglDXLockObjectsNV(@NativeType("HANDLE") long device, @NativeType("HANDLE *") PointerBuffer objects) {
        return nwglDXLockObjectsNV(device, objects.remaining(), memAddress(objects)) != 0;
    }

    // --- [ wglDXUnlockObjectsNV ] ---

    /**
     * Unsafe version of: {@link #wglDXUnlockObjectsNV DXUnlockObjectsNV}
     *
     * @param count the number of objects to unlock
     */
    public static int nwglDXUnlockObjectsNV(long device, int count, long objects) {
        long __functionAddress = GL.getCapabilitiesWGL().wglDXUnlockObjectsNV;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        return callPPI(device, count, objects, __functionAddress);
    }

    /**
     * Return control of an object to DirectX.
     *
     * @param device  the GL/DirectX interop device handle
     * @param objects an array of {@code count} interop objects
     */
    @NativeType("BOOL")
    public static boolean wglDXUnlockObjectsNV(@NativeType("HANDLE") long device, @NativeType("HANDLE *") PointerBuffer objects) {
        return nwglDXUnlockObjectsNV(device, objects.remaining(), memAddress(objects)) != 0;
    }

}