/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

public class NVDrawInstanced {

    static { GLES.initialize(); }

    protected NVDrawInstanced() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDrawArraysInstancedNV ] ---

    /** {@code void glDrawArraysInstancedNV(GLenum mode, GLint first, GLsizei count, GLsizei primcount)} */
    public static native void glDrawArraysInstancedNV(@NativeType("GLenum") int mode, @NativeType("GLint") int first, @NativeType("GLsizei") int count, @NativeType("GLsizei") int primcount);

    // --- [ glDrawElementsInstancedNV ] ---

    /** {@code void glDrawElementsInstancedNV(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static native void nglDrawElementsInstancedNV(int mode, int count, int type, long indices, int primcount);

    /** {@code void glDrawElementsInstancedNV(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void glDrawElementsInstancedNV(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedNV(mode, count, type, indices, primcount);
    }

    /** {@code void glDrawElementsInstancedNV(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void glDrawElementsInstancedNV(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedNV(mode, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), primcount);
    }

    /** {@code void glDrawElementsInstancedNV(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void glDrawElementsInstancedNV(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedNV(mode, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), primcount);
    }

    /** {@code void glDrawElementsInstancedNV(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void glDrawElementsInstancedNV(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedNV(mode, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), primcount);
    }

    /** {@code void glDrawElementsInstancedNV(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void glDrawElementsInstancedNV(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedNV(mode, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), primcount);
    }

}