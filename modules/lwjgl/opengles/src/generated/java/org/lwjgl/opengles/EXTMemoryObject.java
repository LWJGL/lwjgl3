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
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTMemoryObject {

    static { GLES.initialize(); }

    public static final int GL_TEXTURE_TILING_EXT = 0x9580;

    public static final int
        GL_DEDICATED_MEMORY_OBJECT_EXT = 0x9581,
        GL_PROTECTED_MEMORY_OBJECT_EXT = 0x959B;

    public static final int
        GL_NUM_TILING_TYPES_EXT = 0x9582,
        GL_TILING_TYPES_EXT     = 0x9583;

    public static final int
        GL_OPTIMAL_TILING_EXT = 0x9584,
        GL_LINEAR_TILING_EXT  = 0x9585;

    public static final int
        GL_NUM_DEVICE_UUIDS_EXT = 0x9596,
        GL_DEVICE_UUID_EXT      = 0x9597,
        GL_DRIVER_UUID_EXT      = 0x9598;

    public static final int GL_UUID_SIZE_EXT = 16;

    protected EXTMemoryObject() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetUnsignedBytevEXT ] ---

    /** {@code void glGetUnsignedBytevEXT(GLenum pname, GLubyte * data)} */
    public static native void nglGetUnsignedBytevEXT(int pname, long data);

    /** {@code void glGetUnsignedBytevEXT(GLenum pname, GLubyte * data)} */
    public static void glGetUnsignedBytevEXT(@NativeType("GLenum") int pname, @NativeType("GLubyte *") ByteBuffer data) {
        nglGetUnsignedBytevEXT(pname, memAddress(data));
    }

    // --- [ glGetUnsignedBytei_vEXT ] ---

    /** {@code void glGetUnsignedBytei_vEXT(GLenum target, GLuint index, GLubyte * data)} */
    public static native void nglGetUnsignedBytei_vEXT(int target, int index, long data);

    /** {@code void glGetUnsignedBytei_vEXT(GLenum target, GLuint index, GLubyte * data)} */
    public static void glGetUnsignedBytei_vEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLubyte *") ByteBuffer data) {
        nglGetUnsignedBytei_vEXT(target, index, memAddress(data));
    }

    // --- [ glDeleteMemoryObjectsEXT ] ---

    /** {@code void glDeleteMemoryObjectsEXT(GLsizei n, GLuint const * memoryObjects)} */
    public static native void nglDeleteMemoryObjectsEXT(int n, long memoryObjects);

    /** {@code void glDeleteMemoryObjectsEXT(GLsizei n, GLuint const * memoryObjects)} */
    public static void glDeleteMemoryObjectsEXT(@NativeType("GLuint const *") IntBuffer memoryObjects) {
        nglDeleteMemoryObjectsEXT(memoryObjects.remaining(), memAddress(memoryObjects));
    }

    /** {@code void glDeleteMemoryObjectsEXT(GLsizei n, GLuint const * memoryObjects)} */
    public static void glDeleteMemoryObjectsEXT(@NativeType("GLuint const *") int memoryObject) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer memoryObjects = stack.ints(memoryObject);
            nglDeleteMemoryObjectsEXT(1, memAddress(memoryObjects));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsMemoryObjectEXT ] ---

    /** {@code GLboolean glIsMemoryObjectEXT(GLuint memoryObject)} */
    @NativeType("GLboolean")
    public static native boolean glIsMemoryObjectEXT(@NativeType("GLuint") int memoryObject);

    // --- [ glCreateMemoryObjectsEXT ] ---

    /** {@code void glCreateMemoryObjectsEXT(GLsizei n, GLuint * memoryObjects)} */
    public static native void nglCreateMemoryObjectsEXT(int n, long memoryObjects);

    /** {@code void glCreateMemoryObjectsEXT(GLsizei n, GLuint * memoryObjects)} */
    public static void glCreateMemoryObjectsEXT(@NativeType("GLuint *") IntBuffer memoryObjects) {
        nglCreateMemoryObjectsEXT(memoryObjects.remaining(), memAddress(memoryObjects));
    }

    /** {@code void glCreateMemoryObjectsEXT(GLsizei n, GLuint * memoryObjects)} */
    @NativeType("void")
    public static int glCreateMemoryObjectsEXT() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer memoryObjects = stack.callocInt(1);
            nglCreateMemoryObjectsEXT(1, memAddress(memoryObjects));
            return memoryObjects.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glMemoryObjectParameterivEXT ] ---

    /** {@code void glMemoryObjectParameterivEXT(GLuint memoryObject, GLenum pname, GLint const * params)} */
    public static native void nglMemoryObjectParameterivEXT(int memoryObject, int pname, long params);

    /** {@code void glMemoryObjectParameterivEXT(GLuint memoryObject, GLenum pname, GLint const * params)} */
    public static void glMemoryObjectParameterivEXT(@NativeType("GLuint") int memoryObject, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglMemoryObjectParameterivEXT(memoryObject, pname, memAddress(params));
    }

    /** {@code void glMemoryObjectParameterivEXT(GLuint memoryObject, GLenum pname, GLint const * params)} */
    public static void glMemoryObjectParameteriEXT(@NativeType("GLuint") int memoryObject, @NativeType("GLenum") int pname, @NativeType("GLint const *") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.ints(param);
            nglMemoryObjectParameterivEXT(memoryObject, pname, memAddress(params));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetMemoryObjectParameterivEXT ] ---

    /** {@code void glGetMemoryObjectParameterivEXT(GLuint memoryObject, GLenum pname, GLint * params)} */
    public static native void nglGetMemoryObjectParameterivEXT(int memoryObject, int pname, long params);

    /** {@code void glGetMemoryObjectParameterivEXT(GLuint memoryObject, GLenum pname, GLint * params)} */
    public static void glGetMemoryObjectParameterivEXT(@NativeType("GLuint") int memoryObject, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMemoryObjectParameterivEXT(memoryObject, pname, memAddress(params));
    }

    /** {@code void glGetMemoryObjectParameterivEXT(GLuint memoryObject, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetMemoryObjectParameteriEXT(@NativeType("GLuint") int memoryObject, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetMemoryObjectParameterivEXT(memoryObject, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glTexStorageMem2DEXT ] ---

    /** {@code void glTexStorageMem2DEXT(GLenum target, GLsizei levels, GLenum internalFormat, GLsizei width, GLsizei height, GLuint memory, GLuint64 offset)} */
    public static native void glTexStorageMem2DEXT(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset);

    // --- [ glTexStorageMem2DMultisampleEXT ] ---

    /** {@code void glTexStorageMem2DMultisampleEXT(GLenum target, GLsizei samples, GLenum internalFormat, GLsizei width, GLsizei height, GLboolean fixedSampleLocations, GLuint memory, GLuint64 offset)} */
    public static native void glTexStorageMem2DMultisampleEXT(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLboolean") boolean fixedSampleLocations, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset);

    // --- [ glTexStorageMem3DEXT ] ---

    /** {@code void glTexStorageMem3DEXT(GLenum target, GLsizei levels, GLenum internalFormat, GLsizei width, GLsizei height, GLsizei depth, GLuint memory, GLuint64 offset)} */
    public static native void glTexStorageMem3DEXT(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset);

    // --- [ glTexStorageMem3DMultisampleEXT ] ---

    /** {@code void glTexStorageMem3DMultisampleEXT(GLenum target, GLsizei samples, GLenum internalFormat, GLsizei width, GLsizei height, GLsizei depth, GLboolean fixedSampleLocations, GLuint memory, GLuint64 offset)} */
    public static native void glTexStorageMem3DMultisampleEXT(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean fixedSampleLocations, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset);

    // --- [ glBufferStorageMemEXT ] ---

    /** {@code void glBufferStorageMemEXT(GLenum target, GLsizeiptr size, GLuint memory, GLuint64 offset)} */
    public static native void glBufferStorageMemEXT(@NativeType("GLenum") int target, @NativeType("GLsizeiptr") long size, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset);

    // --- [ glTextureStorageMem2DEXT ] ---

    /** {@code void glTextureStorageMem2DEXT(GLuint texture, GLsizei levels, GLenum internalFormat, GLsizei width, GLsizei height, GLuint memory, GLuint64 offset)} */
    public static native void glTextureStorageMem2DEXT(@NativeType("GLuint") int texture, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset);

    // --- [ glTextureStorageMem2DMultisampleEXT ] ---

    /** {@code void glTextureStorageMem2DMultisampleEXT(GLuint texture, GLsizei samples, GLenum internalFormat, GLsizei width, GLsizei height, GLboolean fixedSampleLocations, GLuint memory, GLuint64 offset)} */
    public static native void glTextureStorageMem2DMultisampleEXT(@NativeType("GLuint") int texture, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLboolean") boolean fixedSampleLocations, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset);

    // --- [ glTextureStorageMem3DEXT ] ---

    /** {@code void glTextureStorageMem3DEXT(GLuint texture, GLsizei levels, GLenum internalFormat, GLsizei width, GLsizei height, GLsizei depth, GLuint memory, GLuint64 offset)} */
    public static native void glTextureStorageMem3DEXT(@NativeType("GLuint") int texture, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset);

    // --- [ glTextureStorageMem3DMultisampleEXT ] ---

    /** {@code void glTextureStorageMem3DMultisampleEXT(GLuint texture, GLsizei samples, GLenum internalFormat, GLsizei width, GLsizei height, GLsizei depth, GLboolean fixedSampleLocations, GLuint memory, GLuint64 offset)} */
    public static native void glTextureStorageMem3DMultisampleEXT(@NativeType("GLuint") int texture, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean fixedSampleLocations, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset);

    // --- [ glNamedBufferStorageMemEXT ] ---

    /** {@code void glNamedBufferStorageMemEXT(GLuint buffer, GLsizeiptr size, GLuint memory, GLuint64 offset)} */
    public static native void glNamedBufferStorageMemEXT(@NativeType("GLuint") int buffer, @NativeType("GLsizeiptr") long size, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset);

    /** {@code void glDeleteMemoryObjectsEXT(GLsizei n, GLuint const * memoryObjects)} */
    public static void glDeleteMemoryObjectsEXT(@NativeType("GLuint const *") int[] memoryObjects) {
        long __functionAddress = GLES.getICD().glDeleteMemoryObjectsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(memoryObjects.length, memoryObjects, __functionAddress);
    }

    /** {@code void glCreateMemoryObjectsEXT(GLsizei n, GLuint * memoryObjects)} */
    public static void glCreateMemoryObjectsEXT(@NativeType("GLuint *") int[] memoryObjects) {
        long __functionAddress = GLES.getICD().glCreateMemoryObjectsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(memoryObjects.length, memoryObjects, __functionAddress);
    }

    /** {@code void glMemoryObjectParameterivEXT(GLuint memoryObject, GLenum pname, GLint const * params)} */
    public static void glMemoryObjectParameterivEXT(@NativeType("GLuint") int memoryObject, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GLES.getICD().glMemoryObjectParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(memoryObject, pname, params, __functionAddress);
    }

    /** {@code void glGetMemoryObjectParameterivEXT(GLuint memoryObject, GLenum pname, GLint * params)} */
    public static void glGetMemoryObjectParameterivEXT(@NativeType("GLuint") int memoryObject, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetMemoryObjectParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(memoryObject, pname, params, __functionAddress);
    }

}