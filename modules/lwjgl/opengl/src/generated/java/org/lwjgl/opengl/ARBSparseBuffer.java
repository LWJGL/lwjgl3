/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class ARBSparseBuffer {

    static { GL.initialize(); }

    public static final int GL_SPARSE_STORAGE_BIT_ARB = 0x400;

    public static final int GL_SPARSE_BUFFER_PAGE_SIZE_ARB = 0x82F8;

    protected ARBSparseBuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBufferPageCommitmentARB ] ---

    /** {@code void glBufferPageCommitmentARB(GLenum target, GLintptr offset, GLsizeiptr size, GLboolean commit)} */
    public static native void glBufferPageCommitmentARB(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLboolean") boolean commit);

    // --- [ glNamedBufferPageCommitmentEXT ] ---

    /** {@code void glNamedBufferPageCommitmentEXT(GLuint buffer, GLintptr offset, GLsizeiptr size, GLboolean commit)} */
    public static native void glNamedBufferPageCommitmentEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLboolean") boolean commit);

    // --- [ glNamedBufferPageCommitmentARB ] ---

    /** {@code void glNamedBufferPageCommitmentARB(GLuint buffer, GLintptr offset, GLsizeiptr size, GLboolean commit)} */
    public static native void glNamedBufferPageCommitmentARB(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLboolean") boolean commit);

}