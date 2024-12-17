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

public class NVBindlessMultiDrawIndirectCount {

    static { GL.initialize(); }

    protected NVBindlessMultiDrawIndirectCount() {
        throw new UnsupportedOperationException();
    }

    // --- [ glMultiDrawArraysIndirectBindlessCountNV ] ---

    /** {@code void glMultiDrawArraysIndirectBindlessCountNV(GLenum mode, void const * indirect, GLintptr drawCount, GLsizei maxDrawCount, GLsizei stride, GLint vertexBufferCount)} */
    public static native void nglMultiDrawArraysIndirectBindlessCountNV(int mode, long indirect, long drawCount, int maxDrawCount, int stride, int vertexBufferCount);

    /** {@code void glMultiDrawArraysIndirectBindlessCountNV(GLenum mode, void const * indirect, GLintptr drawCount, GLsizei maxDrawCount, GLsizei stride, GLint vertexBufferCount)} */
    public static void glMultiDrawArraysIndirectBindlessCountNV(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLintptr") long drawCount, @NativeType("GLsizei") int maxDrawCount, @NativeType("GLsizei") int stride, @NativeType("GLint") int vertexBufferCount) {
        if (CHECKS) {
            check(indirect, maxDrawCount * (stride == 0 ? (16 + vertexBufferCount * 24) : stride));
        }
        nglMultiDrawArraysIndirectBindlessCountNV(mode, memAddress(indirect), drawCount, maxDrawCount, stride, vertexBufferCount);
    }

    /** {@code void glMultiDrawArraysIndirectBindlessCountNV(GLenum mode, void const * indirect, GLintptr drawCount, GLsizei maxDrawCount, GLsizei stride, GLint vertexBufferCount)} */
    public static void glMultiDrawArraysIndirectBindlessCountNV(@NativeType("GLenum") int mode, @NativeType("void const *") long indirect, @NativeType("GLintptr") long drawCount, @NativeType("GLsizei") int maxDrawCount, @NativeType("GLsizei") int stride, @NativeType("GLint") int vertexBufferCount) {
        nglMultiDrawArraysIndirectBindlessCountNV(mode, indirect, drawCount, maxDrawCount, stride, vertexBufferCount);
    }

    // --- [ glMultiDrawElementsIndirectBindlessCountNV ] ---

    /** {@code void glMultiDrawElementsIndirectBindlessCountNV(GLenum mode, GLenum type, void const * indirect, GLintptr drawCount, GLsizei maxDrawCount, GLsizei stride, GLint vertexBufferCount)} */
    public static native void nglMultiDrawElementsIndirectBindlessCountNV(int mode, int type, long indirect, long drawCount, int maxDrawCount, int stride, int vertexBufferCount);

    /** {@code void glMultiDrawElementsIndirectBindlessCountNV(GLenum mode, GLenum type, void const * indirect, GLintptr drawCount, GLsizei maxDrawCount, GLsizei stride, GLint vertexBufferCount)} */
    public static void glMultiDrawElementsIndirectBindlessCountNV(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLintptr") long drawCount, @NativeType("GLsizei") int maxDrawCount, @NativeType("GLsizei") int stride, @NativeType("GLint") int vertexBufferCount) {
        if (CHECKS) {
            check(indirect, maxDrawCount * (stride == 0 ? ((vertexBufferCount + 2) * 24) : stride));
        }
        nglMultiDrawElementsIndirectBindlessCountNV(mode, type, memAddress(indirect), drawCount, maxDrawCount, stride, vertexBufferCount);
    }

    /** {@code void glMultiDrawElementsIndirectBindlessCountNV(GLenum mode, GLenum type, void const * indirect, GLintptr drawCount, GLsizei maxDrawCount, GLsizei stride, GLint vertexBufferCount)} */
    public static void glMultiDrawElementsIndirectBindlessCountNV(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") long indirect, @NativeType("GLintptr") long drawCount, @NativeType("GLsizei") int maxDrawCount, @NativeType("GLsizei") int stride, @NativeType("GLint") int vertexBufferCount) {
        nglMultiDrawElementsIndirectBindlessCountNV(mode, type, indirect, drawCount, maxDrawCount, stride, vertexBufferCount);
    }

}