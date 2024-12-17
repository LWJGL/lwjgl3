/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class EXTCompiledVertexArray {

    static { GL.initialize(); }

    public static final int
        GL_ARRAY_ELEMENT_LOCK_FIRST_EXT = 0x81A8,
        GL_ARRAY_ELEMENT_LOCK_COUNT_EXT = 0x81A9;

    protected EXTCompiledVertexArray() {
        throw new UnsupportedOperationException();
    }

    // --- [ glLockArraysEXT ] ---

    /** {@code void glLockArraysEXT(GLint first, GLsizei count)} */
    public static native void glLockArraysEXT(@NativeType("GLint") int first, @NativeType("GLsizei") int count);

    // --- [ glUnlockArraysEXT ] ---

    /** {@code void glUnlockArraysEXT(void)} */
    public static native void glUnlockArraysEXT();

}