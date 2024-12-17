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

public class ARBMatrixPalette {

    static { GL.initialize(); }

    public static final int GL_MATRIX_PALETTE_ARB = 0x8840;

    public static final int
        GL_MAX_MATRIX_PALETTE_STACK_DEPTH_ARB = 0x8841,
        GL_MAX_PALETTE_MATRICES_ARB           = 0x8842,
        GL_CURRENT_PALETTE_MATRIX_ARB         = 0x8843;

    public static final int GL_MATRIX_INDEX_ARRAY_ARB = 0x8844;

    public static final int GL_CURRENT_MATRIX_INDEX_ARB = 0x8845;

    public static final int
        GL_MATRIX_INDEX_ARRAY_SIZE_ARB   = 0x8846,
        GL_MATRIX_INDEX_ARRAY_TYPE_ARB   = 0x8847,
        GL_MATRIX_INDEX_ARRAY_STRIDE_ARB = 0x8848;

    public static final int GL_MATRIX_INDEX_ARRAY_POINTER_ARB = 0x8849;

    protected ARBMatrixPalette() {
        throw new UnsupportedOperationException();
    }

    // --- [ glCurrentPaletteMatrixARB ] ---

    /** {@code void glCurrentPaletteMatrixARB(GLint index)} */
    public static native void glCurrentPaletteMatrixARB(@NativeType("GLint") int index);

    // --- [ glMatrixIndexuivARB ] ---

    /** {@code void glMatrixIndexuivARB(GLint size, GLuint * indices)} */
    public static native void nglMatrixIndexuivARB(int size, long indices);

    /** {@code void glMatrixIndexuivARB(GLint size, GLuint * indices)} */
    public static void glMatrixIndexuivARB(@NativeType("GLuint *") IntBuffer indices) {
        nglMatrixIndexuivARB(indices.remaining(), memAddress(indices));
    }

    // --- [ glMatrixIndexubvARB ] ---

    /** {@code void glMatrixIndexubvARB(GLint size, GLubyte * indices)} */
    public static native void nglMatrixIndexubvARB(int size, long indices);

    /** {@code void glMatrixIndexubvARB(GLint size, GLubyte * indices)} */
    public static void glMatrixIndexubvARB(@NativeType("GLubyte *") ByteBuffer indices) {
        nglMatrixIndexubvARB(indices.remaining(), memAddress(indices));
    }

    // --- [ glMatrixIndexusvARB ] ---

    /** {@code void glMatrixIndexusvARB(GLint size, GLushort * indices)} */
    public static native void nglMatrixIndexusvARB(int size, long indices);

    /** {@code void glMatrixIndexusvARB(GLint size, GLushort * indices)} */
    public static void glMatrixIndexusvARB(@NativeType("GLushort *") ShortBuffer indices) {
        nglMatrixIndexusvARB(indices.remaining(), memAddress(indices));
    }

    // --- [ glMatrixIndexPointerARB ] ---

    /** {@code void glMatrixIndexPointerARB(GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static native void nglMatrixIndexPointerARB(int size, int type, int stride, long pointer);

    /** {@code void glMatrixIndexPointerARB(GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glMatrixIndexPointerARB(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        nglMatrixIndexPointerARB(size, type, stride, memAddress(pointer));
    }

    /** {@code void glMatrixIndexPointerARB(GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glMatrixIndexPointerARB(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        nglMatrixIndexPointerARB(size, type, stride, pointer);
    }

    /** {@code void glMatrixIndexPointerARB(GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glMatrixIndexPointerARB(@NativeType("GLint") int size, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        nglMatrixIndexPointerARB(size, GL11.GL_UNSIGNED_BYTE, stride, memAddress(pointer));
    }

    /** {@code void glMatrixIndexPointerARB(GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glMatrixIndexPointerARB(@NativeType("GLint") int size, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        nglMatrixIndexPointerARB(size, GL11.GL_UNSIGNED_SHORT, stride, memAddress(pointer));
    }

    /** {@code void glMatrixIndexPointerARB(GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glMatrixIndexPointerARB(@NativeType("GLint") int size, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        nglMatrixIndexPointerARB(size, GL11.GL_UNSIGNED_INT, stride, memAddress(pointer));
    }

    /** {@code void glMatrixIndexuivARB(GLint size, GLuint * indices)} */
    public static void glMatrixIndexuivARB(@NativeType("GLuint *") int[] indices) {
        long __functionAddress = GL.getICD().glMatrixIndexuivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(indices.length, indices, __functionAddress);
    }

    /** {@code void glMatrixIndexusvARB(GLint size, GLushort * indices)} */
    public static void glMatrixIndexusvARB(@NativeType("GLushort *") short[] indices) {
        long __functionAddress = GL.getICD().glMatrixIndexusvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(indices.length, indices, __functionAddress);
    }

}