/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

public class EXTInstancedArrays {

    static { GLES.initialize(); }

    public static final int GL_VERTEX_ATTRIB_ARRAY_DIVISOR_EXT = 0x88FE;

    protected EXTInstancedArrays() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDrawArraysInstancedEXT ] ---

    /** {@code void glDrawArraysInstancedEXT(GLenum mode, GLint start, GLsizei count, GLsizei primcount)} */
    public static native void glDrawArraysInstancedEXT(@NativeType("GLenum") int mode, @NativeType("GLint") int start, @NativeType("GLsizei") int count, @NativeType("GLsizei") int primcount);

    // --- [ glDrawElementsInstancedEXT ] ---

    /** {@code void glDrawElementsInstancedEXT(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static native void nglDrawElementsInstancedEXT(int mode, int count, int type, long indices, int primcount);

    /** {@code void glDrawElementsInstancedEXT(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void glDrawElementsInstancedEXT(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedEXT(mode, count, type, indices, primcount);
    }

    /** {@code void glDrawElementsInstancedEXT(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void glDrawElementsInstancedEXT(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedEXT(mode, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), primcount);
    }

    /** {@code void glDrawElementsInstancedEXT(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void glDrawElementsInstancedEXT(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), primcount);
    }

    /** {@code void glDrawElementsInstancedEXT(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void glDrawElementsInstancedEXT(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), primcount);
    }

    /** {@code void glDrawElementsInstancedEXT(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void glDrawElementsInstancedEXT(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), primcount);
    }

    // --- [ glVertexAttribDivisorEXT ] ---

    /** {@code void glVertexAttribDivisorEXT(GLuint index, GLuint divisor)} */
    public static native void glVertexAttribDivisorEXT(@NativeType("GLuint") int index, @NativeType("GLuint") int divisor);

}