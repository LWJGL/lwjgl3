/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class NVCopyBuffer {

    static { GLES.initialize(); }

    public static final int
        GL_COPY_READ_BUFFER_NV  = 0x8F36,
        GL_COPY_WRITE_BUFFER_NV = 0x8F37;

    protected NVCopyBuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ glCopyBufferSubDataNV ] ---

    /** {@code void glCopyBufferSubDataNV(GLenum readTarget, GLenum writeTarget, GLintptr readOffset, GLintptr writeOffset, GLsizeiptr size)} */
    public static native void glCopyBufferSubDataNV(@NativeType("GLenum") int readTarget, @NativeType("GLenum") int writeTarget, @NativeType("GLintptr") long readOffset, @NativeType("GLintptr") long writeOffset, @NativeType("GLsizeiptr") long size);

}