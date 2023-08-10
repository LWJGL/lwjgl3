/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_external_objects_win32.txt">EXT_memory_object_win32</a> extension.
 * 
 * <p>Building upon the OpenGL memory object and semaphore framework defined in <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_external_objects.txt">EXT_external_objects</a>, this extension enables an
 * OpenGL application to import a memory object or semaphore from a Win32 NT handle or a KMT share handle.</p>
 */
public class EXTMemoryObjectWin32 {

    static { GL.initialize(); }

    /**
     * Accepted by the {@code handleType} parameter of {@link #glImportMemoryWin32HandleEXT ImportMemoryWin32HandleEXT}, {@link #glImportMemoryWin32NameEXT ImportMemoryWin32NameEXT}, {@link EXTSemaphoreWin32#glImportSemaphoreWin32HandleEXT ImportSemaphoreWin32HandleEXT}, and
     * {@link EXTSemaphoreWin32#glImportSemaphoreWin32NameEXT ImportSemaphoreWin32NameEXT}.
     */
    public static final int GL_HANDLE_TYPE_OPAQUE_WIN32_EXT = 0x9587;

    /** Accepted by the {@code handleType} parameter of {@link #glImportMemoryWin32HandleEXT ImportMemoryWin32HandleEXT} and {@link EXTSemaphoreWin32#glImportSemaphoreWin32HandleEXT ImportSemaphoreWin32HandleEXT}. */
    public static final int GL_HANDLE_TYPE_OPAQUE_WIN32_KMT_EXT = 0x9588;

    /**
     * Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, GetInteger64v, GetBooleani_v, GetIntegeri_v, GetFloati_v,
     * GetDoublei_v, and GetInteger64i_v.
     */
    public static final int
        GL_DEVICE_LUID_EXT      = 0x9599,
        GL_DEVICE_NODE_MASK_EXT = 0x959A;

    /** Constant values. */
    public static final int GL_LUID_SIZE_EXT = 8;

    /** Accepted by the {@code handleType} parameter of {@link #glImportMemoryWin32HandleEXT ImportMemoryWin32HandleEXT} and {@link #glImportMemoryWin32NameEXT ImportMemoryWin32NameEXT}. */
    public static final int
        GL_HANDLE_TYPE_D3D12_TILEPOOL_EXT = 0x9589,
        GL_HANDLE_TYPE_D3D12_RESOURCE_EXT = 0x958A,
        GL_HANDLE_TYPE_D3D11_IMAGE_EXT    = 0x958B;

    /** Accepted by the {@code handleType} parameter of {@link #glImportMemoryWin32HandleEXT ImportMemoryWin32HandleEXT}. */
    public static final int GL_HANDLE_TYPE_D3D11_IMAGE_KMT_EXT = 0x958C;

    protected EXTMemoryObjectWin32() {
        throw new UnsupportedOperationException();
    }

    // --- [ glImportMemoryWin32HandleEXT ] ---

    public static native void nglImportMemoryWin32HandleEXT(int memory, long size, int handleType, long handle);

    public static void glImportMemoryWin32HandleEXT(@NativeType("GLuint") int memory, @NativeType("GLuint64") long size, @NativeType("GLenum") int handleType, @NativeType("void *") long handle) {
        if (CHECKS) {
            check(handle);
        }
        nglImportMemoryWin32HandleEXT(memory, size, handleType, handle);
    }

    // --- [ glImportMemoryWin32NameEXT ] ---

    public static native void nglImportMemoryWin32NameEXT(int memory, long size, int handleType, long name);

    public static void glImportMemoryWin32NameEXT(@NativeType("GLuint") int memory, @NativeType("GLuint64") long size, @NativeType("GLenum") int handleType, @NativeType("void const *") long name) {
        if (CHECKS) {
            check(name);
        }
        nglImportMemoryWin32NameEXT(memory, size, handleType, name);
    }

}