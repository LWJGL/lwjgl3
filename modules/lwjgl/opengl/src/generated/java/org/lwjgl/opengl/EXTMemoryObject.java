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
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_external_objects.txt">EXT_memory_object</a> extension.
 * 
 * <p>The Vulkan API introduces the concept of explicit memory objects and reusable synchronization objects. This extension brings those concepts to the
 * OpenGL API via two new object types:</p>
 * 
 * <ul>
 * <li>Memory objects</li>
 * <li>Semaphores</li>
 * </ul>
 * 
 * <p>Rather than allocating memory as a response to object allocation, memory allocation and binding are two separate operations in Vulkan. This extension
 * allows an OpenGL application to import a Vulkan memory object, and to bind textures and/or buffer objects to it.</p>
 * 
 * <p>No methods to import memory objects are defined here. Separate platform-specific extensions are defined for this purpose.</p>
 * 
 * <p>Semaphores are synchronization primitives that can be waited on and signaled only by the GPU, or in GL terms, in the GL server. They are similar in
 * concept to GL's "sync" objects and EGL's "EGLSync" objects, but different enough that compatibilities between the two are difficult to derive.</p>
 * 
 * <p>Rather than attempt to map Vulkan semaphores on to GL/EGL sync objects to achieve interoperability, this extension introduces a new object, GL
 * semaphores, that map directly to the semantics of Vulkan semaphores. To achieve full image and buffer memory coherence with a Vulkan driver, the
 * commands that manipulate semaphores also allow external usage information to be imported and exported.</p>
 * 
 * <p>Requires {@link GL42 OpenGL 4.2} or {@link ARBTextureStorage ARB_texture_storage}.</p>
 */
public class EXTMemoryObject {

    static { GL.initialize(); }

    /**
     * Accepted by the {@code pname} parameter of TexParameter{ifx}{v}, TexParameterI{i ui}v, TextureParameter{if}{v}, TextureParameterI{i ui}v,
     * GetTexParameter{if}v, GetTexParameterI{i ui}v, GetTextureParameter{if}v, and GetTextureParameterI{i ui}v.
     */
    public static final int GL_TEXTURE_TILING_EXT = 0x9580;

    /** Accepted by the {@code pname} parameter of {@link #glMemoryObjectParameterivEXT MemoryObjectParameterivEXT}, and {@link #glGetMemoryObjectParameterivEXT GetMemoryObjectParameterivEXT}. */
    public static final int GL_DEDICATED_MEMORY_OBJECT_EXT = 0x9581;

    /** Accepted by the {@code pname} parameter of GetInternalFormativ or GetInternalFormati64v. */
    public static final int
        GL_NUM_TILING_TYPES_EXT = 0x9582,
        GL_TILING_TYPES_EXT     = 0x9583;

    /**
     * Returned in the {@code params} parameter of GetInternalFormativ or GetInternalFormati64v when the {@code pname} parameter is {@link #GL_TILING_TYPES_EXT TILING_TYPES_EXT},
     * returned in the {@code params} parameter of GetTexParameter{if}v, GetTexParameterI{i ui}v, GetTextureParameter{if}v, and GetTextureParameterI{i ui}v
     * when the {@code pname} parameter is {@link #GL_TEXTURE_TILING_EXT TEXTURE_TILING_EXT}, and accepted by the {@code params} parameter of TexParameter{ifx}{v}, TexParameterI{i ui}v,
     * TextureParameter{if}{v}, TextureParameterI{i ui}v when the {@code pname} parameter is {@link #GL_TEXTURE_TILING_EXT TEXTURE_TILING_EXT}.
     */
    public static final int
        GL_OPTIMAL_TILING_EXT = 0x9584,
        GL_LINEAR_TILING_EXT  = 0x9585;

    /**
     * Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, GetInteger64v, {@link #glGetUnsignedBytevEXT GetUnsignedBytevEXT}, and the
     * {@code target} parameter of GetBooleani_v, GetIntegeri_v,GetFloati_v, GetDoublei_v, GetInteger64i_v, and {@link #glGetUnsignedBytei_vEXT GetUnsignedBytei_vEXT}.
     */
    public static final int
        GL_NUM_DEVICE_UUIDS_EXT = 0x9596,
        GL_DEVICE_UUID_EXT      = 0x9597,
        GL_DRIVER_UUID_EXT      = 0x9598;

    /** Constant values. */
    public static final int GL_UUID_SIZE_EXT = 16;

    protected EXTMemoryObject() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetUnsignedBytevEXT ] ---

    public static native void nglGetUnsignedBytevEXT(int pname, long data);

    public static void glGetUnsignedBytevEXT(@NativeType("GLenum") int pname, @NativeType("GLubyte *") ByteBuffer data) {
        nglGetUnsignedBytevEXT(pname, memAddress(data));
    }

    // --- [ glGetUnsignedBytei_vEXT ] ---

    public static native void nglGetUnsignedBytei_vEXT(int target, int index, long data);

    public static void glGetUnsignedBytei_vEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLubyte *") ByteBuffer data) {
        nglGetUnsignedBytei_vEXT(target, index, memAddress(data));
    }

    // --- [ glDeleteMemoryObjectsEXT ] ---

    public static native void nglDeleteMemoryObjectsEXT(int n, long memoryObjects);

    public static void glDeleteMemoryObjectsEXT(@NativeType("GLuint const *") IntBuffer memoryObjects) {
        nglDeleteMemoryObjectsEXT(memoryObjects.remaining(), memAddress(memoryObjects));
    }

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

    @NativeType("GLboolean")
    public static native boolean glIsMemoryObjectEXT(@NativeType("GLuint") int memoryObject);

    // --- [ glCreateMemoryObjectsEXT ] ---

    public static native void nglCreateMemoryObjectsEXT(int n, long memoryObjects);

    public static void glCreateMemoryObjectsEXT(@NativeType("GLuint *") IntBuffer memoryObjects) {
        nglCreateMemoryObjectsEXT(memoryObjects.remaining(), memAddress(memoryObjects));
    }

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

    public static native void nglMemoryObjectParameterivEXT(int memoryObject, int pname, long params);

    public static void glMemoryObjectParameterivEXT(@NativeType("GLuint") int memoryObject, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglMemoryObjectParameterivEXT(memoryObject, pname, memAddress(params));
    }

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

    public static native void nglGetMemoryObjectParameterivEXT(int memoryObject, int pname, long params);

    public static void glGetMemoryObjectParameterivEXT(@NativeType("GLuint") int memoryObject, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMemoryObjectParameterivEXT(memoryObject, pname, memAddress(params));
    }

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

    public static native void glTexStorageMem2DEXT(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset);

    // --- [ glTexStorageMem2DMultisampleEXT ] ---

    public static native void glTexStorageMem2DMultisampleEXT(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLboolean") boolean fixedSampleLocations, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset);

    // --- [ glTexStorageMem3DEXT ] ---

    public static native void glTexStorageMem3DEXT(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset);

    // --- [ glTexStorageMem3DMultisampleEXT ] ---

    public static native void glTexStorageMem3DMultisampleEXT(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean fixedSampleLocations, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset);

    // --- [ glBufferStorageMemEXT ] ---

    public static native void glBufferStorageMemEXT(@NativeType("GLenum") int target, @NativeType("GLsizeiptr") long size, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset);

    // --- [ glTextureStorageMem2DEXT ] ---

    public static native void glTextureStorageMem2DEXT(@NativeType("GLuint") int texture, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset);

    // --- [ glTextureStorageMem2DMultisampleEXT ] ---

    public static native void glTextureStorageMem2DMultisampleEXT(@NativeType("GLuint") int texture, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLboolean") boolean fixedSampleLocations, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset);

    // --- [ glTextureStorageMem3DEXT ] ---

    public static native void glTextureStorageMem3DEXT(@NativeType("GLuint") int texture, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset);

    // --- [ glTextureStorageMem3DMultisampleEXT ] ---

    public static native void glTextureStorageMem3DMultisampleEXT(@NativeType("GLuint") int texture, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean fixedSampleLocations, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset);

    // --- [ glNamedBufferStorageMemEXT ] ---

    public static native void glNamedBufferStorageMemEXT(@NativeType("GLuint") int buffer, @NativeType("GLsizeiptr") long size, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset);

    // --- [ glTexStorageMem1DEXT ] ---

    public static native void glTexStorageMem1DEXT(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset);

    // --- [ glTextureStorageMem1DEXT ] ---

    public static native void glTextureStorageMem1DEXT(@NativeType("GLuint") int texture, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset);

    /** Array version of: {@link #glDeleteMemoryObjectsEXT DeleteMemoryObjectsEXT} */
    public static void glDeleteMemoryObjectsEXT(@NativeType("GLuint const *") int[] memoryObjects) {
        long __functionAddress = GL.getICD().glDeleteMemoryObjectsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(memoryObjects.length, memoryObjects, __functionAddress);
    }

    /** Array version of: {@link #glCreateMemoryObjectsEXT CreateMemoryObjectsEXT} */
    public static void glCreateMemoryObjectsEXT(@NativeType("GLuint *") int[] memoryObjects) {
        long __functionAddress = GL.getICD().glCreateMemoryObjectsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(memoryObjects.length, memoryObjects, __functionAddress);
    }

    /** Array version of: {@link #glMemoryObjectParameterivEXT MemoryObjectParameterivEXT} */
    public static void glMemoryObjectParameterivEXT(@NativeType("GLuint") int memoryObject, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glMemoryObjectParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(memoryObject, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetMemoryObjectParameterivEXT GetMemoryObjectParameterivEXT} */
    public static void glGetMemoryObjectParameterivEXT(@NativeType("GLuint") int memoryObject, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetMemoryObjectParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(memoryObject, pname, params, __functionAddress);
    }

}