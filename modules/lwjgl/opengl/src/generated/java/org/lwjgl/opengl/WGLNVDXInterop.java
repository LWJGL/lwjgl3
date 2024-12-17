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

public class WGLNVDXInterop {

    public static final int
        WGL_ACCESS_READ_ONLY_NV     = 0x0,
        WGL_ACCESS_READ_WRITE_NV    = 0x1,
        WGL_ACCESS_WRITE_DISCARD_NV = 0x2;

    protected WGLNVDXInterop() {
        throw new UnsupportedOperationException();
    }

    // --- [ wglDXSetResourceShareHandleNV ] ---

    /** {@code BOOL wglDXSetResourceShareHandleNV(void * dxObject, HANDLE shareHandle)} */
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

    /** {@code HANDLE wglDXOpenDeviceNV(void * dxDevice)} */
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

    /** {@code BOOL wglDXCloseDeviceNV(HANDLE device)} */
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

    /** {@code HANDLE wglDXRegisterObjectNV(HANDLE device, void * dxResource, GLuint name, GLenum type, GLenum access)} */
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

    /** {@code BOOL wglDXUnregisterObjectNV(HANDLE device, HANDLE object)} */
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

    /** {@code BOOL wglDXObjectAccessNV(HANDLE object, GLenum access)} */
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

    /** {@code BOOL wglDXLockObjectsNV(HANDLE device, GLint count, HANDLE * objects)} */
    public static int nwglDXLockObjectsNV(long device, int count, long objects) {
        long __functionAddress = GL.getCapabilitiesWGL().wglDXLockObjectsNV;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        return callPPI(device, count, objects, __functionAddress);
    }

    /** {@code BOOL wglDXLockObjectsNV(HANDLE device, GLint count, HANDLE * objects)} */
    @NativeType("BOOL")
    public static boolean wglDXLockObjectsNV(@NativeType("HANDLE") long device, @NativeType("HANDLE *") PointerBuffer objects) {
        return nwglDXLockObjectsNV(device, objects.remaining(), memAddress(objects)) != 0;
    }

    // --- [ wglDXUnlockObjectsNV ] ---

    /** {@code BOOL wglDXUnlockObjectsNV(HANDLE device, GLint count, HANDLE * objects)} */
    public static int nwglDXUnlockObjectsNV(long device, int count, long objects) {
        long __functionAddress = GL.getCapabilitiesWGL().wglDXUnlockObjectsNV;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        return callPPI(device, count, objects, __functionAddress);
    }

    /** {@code BOOL wglDXUnlockObjectsNV(HANDLE device, GLint count, HANDLE * objects)} */
    @NativeType("BOOL")
    public static boolean wglDXUnlockObjectsNV(@NativeType("HANDLE") long device, @NativeType("HANDLE *") PointerBuffer objects) {
        return nwglDXUnlockObjectsNV(device, objects.remaining(), memAddress(objects)) != 0;
    }

}