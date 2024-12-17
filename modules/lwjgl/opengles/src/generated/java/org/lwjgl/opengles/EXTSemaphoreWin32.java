/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

public class EXTSemaphoreWin32 {

    static { GLES.initialize(); }

    public static final int GL_HANDLE_TYPE_OPAQUE_WIN32_EXT = 0x9587;

    public static final int GL_HANDLE_TYPE_OPAQUE_WIN32_KMT_EXT = 0x9588;

    public static final int
        GL_DEVICE_LUID_EXT      = 0x9599,
        GL_DEVICE_NODE_MASK_EXT = 0x959A;

    public static final int GL_LUID_SIZE_EXT = 8;

    public static final int GL_HANDLE_TYPE_D3D12_FENCE_EXT = 0x9594;

    public static final int GL_D3D12_FENCE_VALUE_EXT = 0x9595;

    protected EXTSemaphoreWin32() {
        throw new UnsupportedOperationException();
    }

    // --- [ glImportSemaphoreWin32HandleEXT ] ---

    /** {@code void glImportSemaphoreWin32HandleEXT(GLuint semaphore, GLenum handleType, void * handle)} */
    public static native void nglImportSemaphoreWin32HandleEXT(int semaphore, int handleType, long handle);

    /** {@code void glImportSemaphoreWin32HandleEXT(GLuint semaphore, GLenum handleType, void * handle)} */
    public static void glImportSemaphoreWin32HandleEXT(@NativeType("GLuint") int semaphore, @NativeType("GLenum") int handleType, @NativeType("void *") long handle) {
        if (CHECKS) {
            check(handle);
        }
        nglImportSemaphoreWin32HandleEXT(semaphore, handleType, handle);
    }

    // --- [ glImportSemaphoreWin32NameEXT ] ---

    /** {@code void glImportSemaphoreWin32NameEXT(GLuint semaphore, GLenum handleType, void const * name)} */
    public static native void nglImportSemaphoreWin32NameEXT(int semaphore, int handleType, long name);

    /** {@code void glImportSemaphoreWin32NameEXT(GLuint semaphore, GLenum handleType, void const * name)} */
    public static void glImportSemaphoreWin32NameEXT(@NativeType("GLuint") int semaphore, @NativeType("GLenum") int handleType, @NativeType("void const *") long name) {
        if (CHECKS) {
            check(name);
        }
        nglImportSemaphoreWin32NameEXT(semaphore, handleType, name);
    }

}