/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class ARBCopyBuffer {

    static { GL.initialize(); }

    public static final int
        GL_COPY_READ_BUFFER  = 0x8F36,
        GL_COPY_WRITE_BUFFER = 0x8F37;

    protected ARBCopyBuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ glCopyBufferSubData ] ---

    /** {@code void glCopyBufferSubData(GLenum readTarget, GLenum writeTarget, GLintptr readOffset, GLintptr writeOffset, GLsizeiptr size)} */
    public static void glCopyBufferSubData(@NativeType("GLenum") int readTarget, @NativeType("GLenum") int writeTarget, @NativeType("GLintptr") long readOffset, @NativeType("GLintptr") long writeOffset, @NativeType("GLsizeiptr") long size) {
        GL31C.glCopyBufferSubData(readTarget, writeTarget, readOffset, writeOffset, size);
    }

}