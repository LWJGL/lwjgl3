/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

public class ARBVertexAttrib64Bit {

    static { GL.initialize(); }

    public static final int
        GL_DOUBLE_VEC2   = 0x8FFC,
        GL_DOUBLE_VEC3   = 0x8FFD,
        GL_DOUBLE_VEC4   = 0x8FFE,
        GL_DOUBLE_MAT2   = 0x8F46,
        GL_DOUBLE_MAT3   = 0x8F47,
        GL_DOUBLE_MAT4   = 0x8F48,
        GL_DOUBLE_MAT2x3 = 0x8F49,
        GL_DOUBLE_MAT2x4 = 0x8F4A,
        GL_DOUBLE_MAT3x2 = 0x8F4B,
        GL_DOUBLE_MAT3x4 = 0x8F4C,
        GL_DOUBLE_MAT4x2 = 0x8F4D,
        GL_DOUBLE_MAT4x3 = 0x8F4E;

    protected ARBVertexAttrib64Bit() {
        throw new UnsupportedOperationException();
    }

    // --- [ glVertexAttribL1d ] ---

    /** {@code void glVertexAttribL1d(GLuint index, GLdouble x)} */
    public static void glVertexAttribL1d(@NativeType("GLuint") int index, @NativeType("GLdouble") double x) {
        GL41C.glVertexAttribL1d(index, x);
    }

    // --- [ glVertexAttribL2d ] ---

    /** {@code void glVertexAttribL2d(GLuint index, GLdouble x, GLdouble y)} */
    public static void glVertexAttribL2d(@NativeType("GLuint") int index, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y) {
        GL41C.glVertexAttribL2d(index, x, y);
    }

    // --- [ glVertexAttribL3d ] ---

    /** {@code void glVertexAttribL3d(GLuint index, GLdouble x, GLdouble y, GLdouble z)} */
    public static void glVertexAttribL3d(@NativeType("GLuint") int index, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z) {
        GL41C.glVertexAttribL3d(index, x, y, z);
    }

    // --- [ glVertexAttribL4d ] ---

    /** {@code void glVertexAttribL4d(GLuint index, GLdouble x, GLdouble y, GLdouble z, GLdouble w)} */
    public static void glVertexAttribL4d(@NativeType("GLuint") int index, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w) {
        GL41C.glVertexAttribL4d(index, x, y, z, w);
    }

    // --- [ glVertexAttribL1dv ] ---

    /** {@code void glVertexAttribL1dv(GLuint index, GLdouble const * v)} */
    public static void nglVertexAttribL1dv(int index, long v) {
        GL41C.nglVertexAttribL1dv(index, v);
    }

    /** {@code void glVertexAttribL1dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttribL1dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        GL41C.glVertexAttribL1dv(index, v);
    }

    // --- [ glVertexAttribL2dv ] ---

    /** {@code void glVertexAttribL2dv(GLuint index, GLdouble const * v)} */
    public static void nglVertexAttribL2dv(int index, long v) {
        GL41C.nglVertexAttribL2dv(index, v);
    }

    /** {@code void glVertexAttribL2dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttribL2dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        GL41C.glVertexAttribL2dv(index, v);
    }

    // --- [ glVertexAttribL3dv ] ---

    /** {@code void glVertexAttribL3dv(GLuint index, GLdouble const * v)} */
    public static void nglVertexAttribL3dv(int index, long v) {
        GL41C.nglVertexAttribL3dv(index, v);
    }

    /** {@code void glVertexAttribL3dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttribL3dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        GL41C.glVertexAttribL3dv(index, v);
    }

    // --- [ glVertexAttribL4dv ] ---

    /** {@code void glVertexAttribL4dv(GLuint index, GLdouble const * v)} */
    public static void nglVertexAttribL4dv(int index, long v) {
        GL41C.nglVertexAttribL4dv(index, v);
    }

    /** {@code void glVertexAttribL4dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttribL4dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        GL41C.glVertexAttribL4dv(index, v);
    }

    // --- [ glVertexAttribLPointer ] ---

    /** {@code void glVertexAttribLPointer(GLuint index, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void nglVertexAttribLPointer(int index, int size, int type, int stride, long pointer) {
        GL41C.nglVertexAttribLPointer(index, size, type, stride, pointer);
    }

    /** {@code void glVertexAttribLPointer(GLuint index, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribLPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        GL41C.glVertexAttribLPointer(index, size, type, stride, pointer);
    }

    /** {@code void glVertexAttribLPointer(GLuint index, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribLPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        GL41C.glVertexAttribLPointer(index, size, type, stride, pointer);
    }

    /** {@code void glVertexAttribLPointer(GLuint index, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribLPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLsizei") int stride, @NativeType("void const *") DoubleBuffer pointer) {
        GL41C.glVertexAttribLPointer(index, size, stride, pointer);
    }

    // --- [ glGetVertexAttribLdv ] ---

    /** {@code void glGetVertexAttribLdv(GLuint index, GLenum pname, GLdouble * params)} */
    public static void nglGetVertexAttribLdv(int index, int pname, long params) {
        GL41C.nglGetVertexAttribLdv(index, pname, params);
    }

    /** {@code void glGetVertexAttribLdv(GLuint index, GLenum pname, GLdouble * params)} */
    public static void glGetVertexAttribLdv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLdouble *") DoubleBuffer params) {
        GL41C.glGetVertexAttribLdv(index, pname, params);
    }

    // --- [ glVertexArrayVertexAttribLOffsetEXT ] ---

    /** {@code void glVertexArrayVertexAttribLOffsetEXT(GLuint vaobj, GLuint buffer, GLuint index, GLint size, GLenum type, GLsizei stride, GLintptr offset)} */
    public static native void glVertexArrayVertexAttribLOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset);

    /** {@code void glVertexAttribL1dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttribL1dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        GL41C.glVertexAttribL1dv(index, v);
    }

    /** {@code void glVertexAttribL2dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttribL2dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        GL41C.glVertexAttribL2dv(index, v);
    }

    /** {@code void glVertexAttribL3dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttribL3dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        GL41C.glVertexAttribL3dv(index, v);
    }

    /** {@code void glVertexAttribL4dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttribL4dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        GL41C.glVertexAttribL4dv(index, v);
    }

    /** {@code void glGetVertexAttribLdv(GLuint index, GLenum pname, GLdouble * params)} */
    public static void glGetVertexAttribLdv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLdouble *") double[] params) {
        GL41C.glGetVertexAttribLdv(index, pname, params);
    }

}