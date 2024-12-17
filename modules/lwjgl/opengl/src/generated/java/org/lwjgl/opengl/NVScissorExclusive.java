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

public class NVScissorExclusive {

    static { GL.initialize(); }

    public static final int GL_SCISSOR_TEST_EXCLUSIVE_NV = 0x9555;

    public static final int GL_SCISSOR_BOX_EXCLUSIVE_NV = 0x9556;

    protected NVScissorExclusive() {
        throw new UnsupportedOperationException();
    }

    // --- [ glScissorExclusiveArrayvNV ] ---

    /** {@code void glScissorExclusiveArrayvNV(GLuint first, GLsizei count, GLint const * v)} */
    public static native void nglScissorExclusiveArrayvNV(int first, int count, long v);

    /** {@code void glScissorExclusiveArrayvNV(GLuint first, GLsizei count, GLint const * v)} */
    public static void glScissorExclusiveArrayvNV(@NativeType("GLuint") int first, @NativeType("GLint const *") IntBuffer v) {
        nglScissorExclusiveArrayvNV(first, v.remaining() >> 2, memAddress(v));
    }

    // --- [ glScissorExclusiveNV ] ---

    /** {@code void glScissorExclusiveNV(GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static native void glScissorExclusiveNV(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    /** {@code void glScissorExclusiveArrayvNV(GLuint first, GLsizei count, GLint const * v)} */
    public static void glScissorExclusiveArrayvNV(@NativeType("GLuint") int first, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glScissorExclusiveArrayvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(first, v.length >> 2, v, __functionAddress);
    }

}