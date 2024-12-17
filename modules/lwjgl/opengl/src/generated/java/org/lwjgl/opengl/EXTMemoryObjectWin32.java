/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

public class EXTMemoryObjectWin32 {

    static { GL.initialize(); }

    public static final int GL_HANDLE_TYPE_OPAQUE_WIN32_EXT = 0x9587;

    public static final int GL_HANDLE_TYPE_OPAQUE_WIN32_KMT_EXT = 0x9588;

    public static final int
        GL_DEVICE_LUID_EXT      = 0x9599,
        GL_DEVICE_NODE_MASK_EXT = 0x959A;

    public static final int GL_LUID_SIZE_EXT = 8;

    public static final int
        GL_HANDLE_TYPE_D3D12_TILEPOOL_EXT = 0x9589,
        GL_HANDLE_TYPE_D3D12_RESOURCE_EXT = 0x958A,
        GL_HANDLE_TYPE_D3D11_IMAGE_EXT    = 0x958B;

    public static final int GL_HANDLE_TYPE_D3D11_IMAGE_KMT_EXT = 0x958C;

    protected EXTMemoryObjectWin32() {
        throw new UnsupportedOperationException();
    }

    // --- [ glImportMemoryWin32HandleEXT ] ---

    /** {@code void glImportMemoryWin32HandleEXT(GLuint memory, GLuint64 size, GLenum handleType, void * handle)} */
    public static native void nglImportMemoryWin32HandleEXT(int memory, long size, int handleType, long handle);

    /** {@code void glImportMemoryWin32HandleEXT(GLuint memory, GLuint64 size, GLenum handleType, void * handle)} */
    public static void glImportMemoryWin32HandleEXT(@NativeType("GLuint") int memory, @NativeType("GLuint64") long size, @NativeType("GLenum") int handleType, @NativeType("void *") long handle) {
        if (CHECKS) {
            check(handle);
        }
        nglImportMemoryWin32HandleEXT(memory, size, handleType, handle);
    }

    // --- [ glImportMemoryWin32NameEXT ] ---

    /** {@code void glImportMemoryWin32NameEXT(GLuint memory, GLuint64 size, GLenum handleType, void const * name)} */
    public static native void nglImportMemoryWin32NameEXT(int memory, long size, int handleType, long name);

    /** {@code void glImportMemoryWin32NameEXT(GLuint memory, GLuint64 size, GLenum handleType, void const * name)} */
    public static void glImportMemoryWin32NameEXT(@NativeType("GLuint") int memory, @NativeType("GLuint64") long size, @NativeType("GLenum") int handleType, @NativeType("void const *") long name) {
        if (CHECKS) {
            check(name);
        }
        nglImportMemoryWin32NameEXT(memory, size, handleType, name);
    }

}