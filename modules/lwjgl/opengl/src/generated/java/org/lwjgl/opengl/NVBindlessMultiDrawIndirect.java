/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

public class NVBindlessMultiDrawIndirect {

    static { GL.initialize(); }

    protected NVBindlessMultiDrawIndirect() {
        throw new UnsupportedOperationException();
    }

    // --- [ glMultiDrawArraysIndirectBindlessNV ] ---

    /** {@code void glMultiDrawArraysIndirectBindlessNV(GLenum mode, void const * indirect, GLsizei drawCount, GLsizei stride, GLint vertexBufferCount)} */
    public static native void nglMultiDrawArraysIndirectBindlessNV(int mode, long indirect, int drawCount, int stride, int vertexBufferCount);

    /** {@code void glMultiDrawArraysIndirectBindlessNV(GLenum mode, void const * indirect, GLsizei drawCount, GLsizei stride, GLint vertexBufferCount)} */
    public static void glMultiDrawArraysIndirectBindlessNV(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLsizei") int drawCount, @NativeType("GLsizei") int stride, @NativeType("GLint") int vertexBufferCount) {
        if (CHECKS) {
            check(indirect, drawCount * (stride == 0 ? (16 + vertexBufferCount * 24) : stride));
        }
        nglMultiDrawArraysIndirectBindlessNV(mode, memAddress(indirect), drawCount, stride, vertexBufferCount);
    }

    /** {@code void glMultiDrawArraysIndirectBindlessNV(GLenum mode, void const * indirect, GLsizei drawCount, GLsizei stride, GLint vertexBufferCount)} */
    public static void glMultiDrawArraysIndirectBindlessNV(@NativeType("GLenum") int mode, @NativeType("void const *") long indirect, @NativeType("GLsizei") int drawCount, @NativeType("GLsizei") int stride, @NativeType("GLint") int vertexBufferCount) {
        nglMultiDrawArraysIndirectBindlessNV(mode, indirect, drawCount, stride, vertexBufferCount);
    }

    // --- [ glMultiDrawElementsIndirectBindlessNV ] ---

    /** {@code void glMultiDrawElementsIndirectBindlessNV(GLenum mode, GLenum type, void const * indirect, GLsizei drawCount, GLsizei stride, GLint vertexBufferCount)} */
    public static native void nglMultiDrawElementsIndirectBindlessNV(int mode, int type, long indirect, int drawCount, int stride, int vertexBufferCount);

    /** {@code void glMultiDrawElementsIndirectBindlessNV(GLenum mode, GLenum type, void const * indirect, GLsizei drawCount, GLsizei stride, GLint vertexBufferCount)} */
    public static void glMultiDrawElementsIndirectBindlessNV(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLsizei") int drawCount, @NativeType("GLsizei") int stride, @NativeType("GLint") int vertexBufferCount) {
        if (CHECKS) {
            check(indirect, drawCount * (stride == 0 ? ((vertexBufferCount + 2) * 24) : stride));
        }
        nglMultiDrawElementsIndirectBindlessNV(mode, type, memAddress(indirect), drawCount, stride, vertexBufferCount);
    }

    /** {@code void glMultiDrawElementsIndirectBindlessNV(GLenum mode, GLenum type, void const * indirect, GLsizei drawCount, GLsizei stride, GLint vertexBufferCount)} */
    public static void glMultiDrawElementsIndirectBindlessNV(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") long indirect, @NativeType("GLsizei") int drawCount, @NativeType("GLsizei") int stride, @NativeType("GLint") int vertexBufferCount) {
        nglMultiDrawElementsIndirectBindlessNV(mode, type, indirect, drawCount, stride, vertexBufferCount);
    }

}