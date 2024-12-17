/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

public class EXTDrawInstanced {

    static { GLES.initialize(); }

    protected EXTDrawInstanced() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDrawArraysInstancedEXT ] ---

    /** {@code void glDrawArraysInstancedEXT(GLenum mode, GLint start, GLsizei count, GLsizei primcount)} */
    public static void glDrawArraysInstancedEXT(@NativeType("GLenum") int mode, @NativeType("GLint") int start, @NativeType("GLsizei") int count, @NativeType("GLsizei") int primcount) {
        EXTInstancedArrays.glDrawArraysInstancedEXT(mode, start, count, primcount);
    }

    // --- [ glDrawElementsInstancedEXT ] ---

    /** {@code void glDrawElementsInstancedEXT(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void nglDrawElementsInstancedEXT(int mode, int count, int type, long indices, int primcount) {
        EXTInstancedArrays.nglDrawElementsInstancedEXT(mode, count, type, indices, primcount);
    }

    /** {@code void glDrawElementsInstancedEXT(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void glDrawElementsInstancedEXT(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int primcount) {
        EXTInstancedArrays.glDrawElementsInstancedEXT(mode, count, type, indices, primcount);
    }

    /** {@code void glDrawElementsInstancedEXT(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void glDrawElementsInstancedEXT(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount) {
        EXTInstancedArrays.glDrawElementsInstancedEXT(mode, type, indices, primcount);
    }

    /** {@code void glDrawElementsInstancedEXT(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void glDrawElementsInstancedEXT(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount) {
        EXTInstancedArrays.glDrawElementsInstancedEXT(mode, indices, primcount);
    }

    /** {@code void glDrawElementsInstancedEXT(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void glDrawElementsInstancedEXT(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int primcount) {
        EXTInstancedArrays.glDrawElementsInstancedEXT(mode, indices, primcount);
    }

    /** {@code void glDrawElementsInstancedEXT(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void glDrawElementsInstancedEXT(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int primcount) {
        EXTInstancedArrays.glDrawElementsInstancedEXT(mode, indices, primcount);
    }

}