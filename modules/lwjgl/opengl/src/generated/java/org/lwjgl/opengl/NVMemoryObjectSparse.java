/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_memory_object_sparse.txt">NV_memory_object_sparse</a> extension.
 * 
 * <p>This extension adds sparse support to {@code EXT_memory_object} extension.</p>
 * 
 * <p>Requires {@link EXTMemoryObject EXT_memory_object}, {@link ARBSparseTexture ARB_sparse_texture} and/or {@link ARBSparseBuffer ARB_sparse_buffer} or a version of OpenGL that incorporates it.</p>
 */
public class NVMemoryObjectSparse {

    static { GL.initialize(); }

    protected NVMemoryObjectSparse() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBufferPageCommitmentMemNV ] ---

    public static native void glBufferPageCommitmentMemNV(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLuint") int memory, @NativeType("GLuint64") long memOffset, @NativeType("GLboolean") boolean commit);

    // --- [ glNamedBufferPageCommitmentMemNV ] ---

    public static native void glNamedBufferPageCommitmentMemNV(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLuint") int memory, @NativeType("GLuint64") long memOffset, @NativeType("GLboolean") boolean commit);

    // --- [ glTexPageCommitmentMemNV ] ---

    public static native void glTexPageCommitmentMemNV(@NativeType("GLenum") int target, @NativeType("GLint") int layer, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset, @NativeType("GLboolean") boolean commit);

    // --- [ glTexturePageCommitmentMemNV ] ---

    public static native void glTexturePageCommitmentMemNV(@NativeType("GLuint") int texture, @NativeType("GLint") int layer, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset, @NativeType("GLboolean") boolean commit);

}