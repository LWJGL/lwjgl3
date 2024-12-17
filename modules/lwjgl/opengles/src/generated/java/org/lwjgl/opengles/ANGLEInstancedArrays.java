/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

public class ANGLEInstancedArrays {

    static { GLES.initialize(); }

    public static final int GL_VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE = 0x88FE;

    protected ANGLEInstancedArrays() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDrawArraysInstancedANGLE ] ---

    /** {@code void glDrawArraysInstancedANGLE(GLenum mode, GLint first, GLsizei count, GLsizei primcount)} */
    public static native void glDrawArraysInstancedANGLE(@NativeType("GLenum") int mode, @NativeType("GLint") int first, @NativeType("GLsizei") int count, @NativeType("GLsizei") int primcount);

    // --- [ glDrawElementsInstancedANGLE ] ---

    /** {@code void glDrawElementsInstancedANGLE(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static native void nglDrawElementsInstancedANGLE(int mode, int count, int type, long indices, int primcount);

    /** {@code void glDrawElementsInstancedANGLE(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void glDrawElementsInstancedANGLE(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedANGLE(mode, count, type, indices, primcount);
    }

    /** {@code void glDrawElementsInstancedANGLE(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void glDrawElementsInstancedANGLE(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedANGLE(mode, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), primcount);
    }

    /** {@code void glDrawElementsInstancedANGLE(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void glDrawElementsInstancedANGLE(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedANGLE(mode, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), primcount);
    }

    /** {@code void glDrawElementsInstancedANGLE(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void glDrawElementsInstancedANGLE(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedANGLE(mode, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), primcount);
    }

    /** {@code void glDrawElementsInstancedANGLE(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void glDrawElementsInstancedANGLE(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedANGLE(mode, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), primcount);
    }

    // --- [ glVertexAttribDivisorANGLE ] ---

    /** {@code void glVertexAttribDivisorANGLE(GLuint index, GLuint divisor)} */
    public static native void glVertexAttribDivisorANGLE(@NativeType("GLuint") int index, @NativeType("GLuint") int divisor);

}