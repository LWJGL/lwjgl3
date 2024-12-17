/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class NVMemoryObjectSparse {

    static { GL.initialize(); }

    protected NVMemoryObjectSparse() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBufferPageCommitmentMemNV ] ---

    /** {@code void glBufferPageCommitmentMemNV(GLenum target, GLintptr offset, GLsizeiptr size, GLuint memory, GLuint64 memOffset, GLboolean commit)} */
    public static native void glBufferPageCommitmentMemNV(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLuint") int memory, @NativeType("GLuint64") long memOffset, @NativeType("GLboolean") boolean commit);

    // --- [ glNamedBufferPageCommitmentMemNV ] ---

    /** {@code void glNamedBufferPageCommitmentMemNV(GLuint buffer, GLintptr offset, GLsizeiptr size, GLuint memory, GLuint64 memOffset, GLboolean commit)} */
    public static native void glNamedBufferPageCommitmentMemNV(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLuint") int memory, @NativeType("GLuint64") long memOffset, @NativeType("GLboolean") boolean commit);

    // --- [ glTexPageCommitmentMemNV ] ---

    /** {@code void glTexPageCommitmentMemNV(GLenum target, GLint layer, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLuint memory, GLuint64 offset, GLboolean commit)} */
    public static native void glTexPageCommitmentMemNV(@NativeType("GLenum") int target, @NativeType("GLint") int layer, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset, @NativeType("GLboolean") boolean commit);

    // --- [ glTexturePageCommitmentMemNV ] ---

    /** {@code void glTexturePageCommitmentMemNV(GLuint texture, GLint layer, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLuint memory, GLuint64 offset, GLboolean commit)} */
    public static native void glTexturePageCommitmentMemNV(@NativeType("GLuint") int texture, @NativeType("GLint") int layer, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset, @NativeType("GLboolean") boolean commit);

}