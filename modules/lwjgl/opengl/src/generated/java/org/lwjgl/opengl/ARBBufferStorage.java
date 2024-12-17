/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class ARBBufferStorage {

    static { GL.initialize(); }

    public static final int
        GL_MAP_PERSISTENT_BIT  = 0x40,
        GL_MAP_COHERENT_BIT    = 0x80,
        GL_DYNAMIC_STORAGE_BIT = 0x100,
        GL_CLIENT_STORAGE_BIT  = 0x200;

    public static final int
        GL_BUFFER_IMMUTABLE_STORAGE = 0x821F,
        GL_BUFFER_STORAGE_FLAGS     = 0x8220;

    public static final int GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT = 0x4000;

    protected ARBBufferStorage() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBufferStorage ] ---

    /** {@code void glBufferStorage(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void nglBufferStorage(int target, long size, long data, int flags) {
        GL44C.nglBufferStorage(target, size, data, flags);
    }

    /** {@code void glBufferStorage(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("GLsizeiptr") long size, @NativeType("GLbitfield") int flags) {
        GL44C.glBufferStorage(target, size, flags);
    }

    /** {@code void glBufferStorage(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") ByteBuffer data, @NativeType("GLbitfield") int flags) {
        GL44C.glBufferStorage(target, data, flags);
    }

    /** {@code void glBufferStorage(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") ShortBuffer data, @NativeType("GLbitfield") int flags) {
        GL44C.glBufferStorage(target, data, flags);
    }

    /** {@code void glBufferStorage(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") IntBuffer data, @NativeType("GLbitfield") int flags) {
        GL44C.glBufferStorage(target, data, flags);
    }

    /** {@code void glBufferStorage(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") FloatBuffer data, @NativeType("GLbitfield") int flags) {
        GL44C.glBufferStorage(target, data, flags);
    }

    /** {@code void glBufferStorage(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") DoubleBuffer data, @NativeType("GLbitfield") int flags) {
        GL44C.glBufferStorage(target, data, flags);
    }

    // --- [ glNamedBufferStorageEXT ] ---

    /** {@code void glNamedBufferStorageEXT(GLuint buffer, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static native void nglNamedBufferStorageEXT(int buffer, long size, long data, int flags);

    /** {@code void glNamedBufferStorageEXT(GLuint buffer, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glNamedBufferStorageEXT(@NativeType("GLuint") int buffer, @NativeType("GLsizeiptr") long size, @NativeType("GLbitfield") int flags) {
        nglNamedBufferStorageEXT(buffer, size, NULL, flags);
    }

    /** {@code void glNamedBufferStorageEXT(GLuint buffer, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glNamedBufferStorageEXT(@NativeType("GLuint") int buffer, @NativeType("void const *") ByteBuffer data, @NativeType("GLbitfield") int flags) {
        nglNamedBufferStorageEXT(buffer, data.remaining(), memAddress(data), flags);
    }

    /** {@code void glNamedBufferStorageEXT(GLuint buffer, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glNamedBufferStorageEXT(@NativeType("GLuint") int buffer, @NativeType("void const *") ShortBuffer data, @NativeType("GLbitfield") int flags) {
        nglNamedBufferStorageEXT(buffer, Integer.toUnsignedLong(data.remaining()) << 1, memAddress(data), flags);
    }

    /** {@code void glNamedBufferStorageEXT(GLuint buffer, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glNamedBufferStorageEXT(@NativeType("GLuint") int buffer, @NativeType("void const *") IntBuffer data, @NativeType("GLbitfield") int flags) {
        nglNamedBufferStorageEXT(buffer, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data), flags);
    }

    /** {@code void glNamedBufferStorageEXT(GLuint buffer, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glNamedBufferStorageEXT(@NativeType("GLuint") int buffer, @NativeType("void const *") FloatBuffer data, @NativeType("GLbitfield") int flags) {
        nglNamedBufferStorageEXT(buffer, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data), flags);
    }

    /** {@code void glNamedBufferStorageEXT(GLuint buffer, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glNamedBufferStorageEXT(@NativeType("GLuint") int buffer, @NativeType("void const *") DoubleBuffer data, @NativeType("GLbitfield") int flags) {
        nglNamedBufferStorageEXT(buffer, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data), flags);
    }

    /** {@code void glBufferStorage(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") short[] data, @NativeType("GLbitfield") int flags) {
        GL44C.glBufferStorage(target, data, flags);
    }

    /** {@code void glBufferStorage(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") int[] data, @NativeType("GLbitfield") int flags) {
        GL44C.glBufferStorage(target, data, flags);
    }

    /** {@code void glBufferStorage(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") float[] data, @NativeType("GLbitfield") int flags) {
        GL44C.glBufferStorage(target, data, flags);
    }

    /** {@code void glBufferStorage(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") double[] data, @NativeType("GLbitfield") int flags) {
        GL44C.glBufferStorage(target, data, flags);
    }

    /** {@code void glNamedBufferStorageEXT(GLuint buffer, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glNamedBufferStorageEXT(@NativeType("GLuint") int buffer, @NativeType("void const *") short[] data, @NativeType("GLbitfield") int flags) {
        long __functionAddress = GL.getICD().glNamedBufferStorageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, Integer.toUnsignedLong(data.length) << 1, data, flags, __functionAddress);
    }

    /** {@code void glNamedBufferStorageEXT(GLuint buffer, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glNamedBufferStorageEXT(@NativeType("GLuint") int buffer, @NativeType("void const *") int[] data, @NativeType("GLbitfield") int flags) {
        long __functionAddress = GL.getICD().glNamedBufferStorageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, Integer.toUnsignedLong(data.length) << 2, data, flags, __functionAddress);
    }

    /** {@code void glNamedBufferStorageEXT(GLuint buffer, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glNamedBufferStorageEXT(@NativeType("GLuint") int buffer, @NativeType("void const *") float[] data, @NativeType("GLbitfield") int flags) {
        long __functionAddress = GL.getICD().glNamedBufferStorageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, Integer.toUnsignedLong(data.length) << 2, data, flags, __functionAddress);
    }

    /** {@code void glNamedBufferStorageEXT(GLuint buffer, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glNamedBufferStorageEXT(@NativeType("GLuint") int buffer, @NativeType("void const *") double[] data, @NativeType("GLbitfield") int flags) {
        long __functionAddress = GL.getICD().glNamedBufferStorageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, Integer.toUnsignedLong(data.length) << 3, data, flags, __functionAddress);
    }

}