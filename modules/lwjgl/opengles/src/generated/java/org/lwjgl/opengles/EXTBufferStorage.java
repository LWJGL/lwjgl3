/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTBufferStorage {

    static { GLES.initialize(); }

    public static final int
        GL_MAP_PERSISTENT_BIT_EXT  = 0x40,
        GL_MAP_COHERENT_BIT_EXT    = 0x80,
        GL_DYNAMIC_STORAGE_BIT_EXT = 0x100,
        GL_CLIENT_STORAGE_BIT_EXT  = 0x200;

    public static final int
        GL_BUFFER_IMMUTABLE_STORAGE_EXT = 0x821F,
        GL_BUFFER_STORAGE_FLAGS_EXT     = 0x8220;

    public static final int GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT_EXT = 0x4000;

    protected EXTBufferStorage() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBufferStorageEXT ] ---

    /** {@code void glBufferStorageEXT(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static native void nglBufferStorageEXT(int target, long size, long data, int flags);

    /** {@code void glBufferStorageEXT(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorageEXT(@NativeType("GLenum") int target, @NativeType("GLsizeiptr") long size, @NativeType("GLbitfield") int flags) {
        nglBufferStorageEXT(target, size, NULL, flags);
    }

    /** {@code void glBufferStorageEXT(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorageEXT(@NativeType("GLenum") int target, @NativeType("void const *") ByteBuffer data, @NativeType("GLbitfield") int flags) {
        nglBufferStorageEXT(target, data.remaining(), memAddress(data), flags);
    }

    /** {@code void glBufferStorageEXT(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorageEXT(@NativeType("GLenum") int target, @NativeType("void const *") ShortBuffer data, @NativeType("GLbitfield") int flags) {
        nglBufferStorageEXT(target, Integer.toUnsignedLong(data.remaining()) << 1, memAddress(data), flags);
    }

    /** {@code void glBufferStorageEXT(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorageEXT(@NativeType("GLenum") int target, @NativeType("void const *") IntBuffer data, @NativeType("GLbitfield") int flags) {
        nglBufferStorageEXT(target, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data), flags);
    }

    /** {@code void glBufferStorageEXT(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorageEXT(@NativeType("GLenum") int target, @NativeType("void const *") FloatBuffer data, @NativeType("GLbitfield") int flags) {
        nglBufferStorageEXT(target, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data), flags);
    }

    /** {@code void glBufferStorageEXT(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorageEXT(@NativeType("GLenum") int target, @NativeType("void const *") short[] data, @NativeType("GLbitfield") int flags) {
        long __functionAddress = GLES.getICD().glBufferStorageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, Integer.toUnsignedLong(data.length) << 1, data, flags, __functionAddress);
    }

    /** {@code void glBufferStorageEXT(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorageEXT(@NativeType("GLenum") int target, @NativeType("void const *") int[] data, @NativeType("GLbitfield") int flags) {
        long __functionAddress = GLES.getICD().glBufferStorageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, Integer.toUnsignedLong(data.length) << 2, data, flags, __functionAddress);
    }

    /** {@code void glBufferStorageEXT(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorageEXT(@NativeType("GLenum") int target, @NativeType("void const *") float[] data, @NativeType("GLbitfield") int flags) {
        long __functionAddress = GLES.getICD().glBufferStorageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, Integer.toUnsignedLong(data.length) << 2, data, flags, __functionAddress);
    }

}