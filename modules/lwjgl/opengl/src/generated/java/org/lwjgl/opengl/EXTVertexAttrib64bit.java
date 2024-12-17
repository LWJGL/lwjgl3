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

public class EXTVertexAttrib64bit {

    static { GL.initialize(); }

    public static final int
        GL_DOUBLE_VEC2_EXT   = 0x8FFC,
        GL_DOUBLE_VEC3_EXT   = 0x8FFD,
        GL_DOUBLE_VEC4_EXT   = 0x8FFE,
        GL_DOUBLE_MAT2_EXT   = 0x8F46,
        GL_DOUBLE_MAT3_EXT   = 0x8F47,
        GL_DOUBLE_MAT4_EXT   = 0x8F48,
        GL_DOUBLE_MAT2x3_EXT = 0x8F49,
        GL_DOUBLE_MAT2x4_EXT = 0x8F4A,
        GL_DOUBLE_MAT3x2_EXT = 0x8F4B,
        GL_DOUBLE_MAT3x4_EXT = 0x8F4C,
        GL_DOUBLE_MAT4x2_EXT = 0x8F4D,
        GL_DOUBLE_MAT4x3_EXT = 0x8F4E;

    protected EXTVertexAttrib64bit() {
        throw new UnsupportedOperationException();
    }

    // --- [ glVertexAttribL1dEXT ] ---

    /** {@code void glVertexAttribL1dEXT(GLuint index, GLdouble x)} */
    public static native void glVertexAttribL1dEXT(@NativeType("GLuint") int index, @NativeType("GLdouble") double x);

    // --- [ glVertexAttribL2dEXT ] ---

    /** {@code void glVertexAttribL2dEXT(GLuint index, GLdouble x, GLdouble y)} */
    public static native void glVertexAttribL2dEXT(@NativeType("GLuint") int index, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y);

    // --- [ glVertexAttribL3dEXT ] ---

    /** {@code void glVertexAttribL3dEXT(GLuint index, GLdouble x, GLdouble y, GLdouble z)} */
    public static native void glVertexAttribL3dEXT(@NativeType("GLuint") int index, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z);

    // --- [ glVertexAttribL4dEXT ] ---

    /** {@code void glVertexAttribL4dEXT(GLuint index, GLdouble x, GLdouble y, GLdouble z, GLdouble w)} */
    public static native void glVertexAttribL4dEXT(@NativeType("GLuint") int index, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w);

    // --- [ glVertexAttribL1dvEXT ] ---

    /** {@code void glVertexAttribL1dvEXT(GLuint index, GLdouble const * v)} */
    public static native void nglVertexAttribL1dvEXT(int index, long v);

    /** {@code void glVertexAttribL1dvEXT(GLuint index, GLdouble const * v)} */
    public static void glVertexAttribL1dvEXT(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglVertexAttribL1dvEXT(index, memAddress(v));
    }

    // --- [ glVertexAttribL2dvEXT ] ---

    /** {@code void glVertexAttribL2dvEXT(GLuint index, GLdouble const * v)} */
    public static native void nglVertexAttribL2dvEXT(int index, long v);

    /** {@code void glVertexAttribL2dvEXT(GLuint index, GLdouble const * v)} */
    public static void glVertexAttribL2dvEXT(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglVertexAttribL2dvEXT(index, memAddress(v));
    }

    // --- [ glVertexAttribL3dvEXT ] ---

    /** {@code void glVertexAttribL3dvEXT(GLuint index, GLdouble const * v)} */
    public static native void nglVertexAttribL3dvEXT(int index, long v);

    /** {@code void glVertexAttribL3dvEXT(GLuint index, GLdouble const * v)} */
    public static void glVertexAttribL3dvEXT(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglVertexAttribL3dvEXT(index, memAddress(v));
    }

    // --- [ glVertexAttribL4dvEXT ] ---

    /** {@code void glVertexAttribL4dvEXT(GLuint index, GLdouble const * v)} */
    public static native void nglVertexAttribL4dvEXT(int index, long v);

    /** {@code void glVertexAttribL4dvEXT(GLuint index, GLdouble const * v)} */
    public static void glVertexAttribL4dvEXT(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttribL4dvEXT(index, memAddress(v));
    }

    // --- [ glVertexAttribLPointerEXT ] ---

    /** {@code void glVertexAttribLPointerEXT(GLuint index, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static native void nglVertexAttribLPointerEXT(int index, int size, int type, int stride, long pointer);

    /** {@code void glVertexAttribLPointerEXT(GLuint index, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribLPointerEXT(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        nglVertexAttribLPointerEXT(index, size, type, stride, memAddress(pointer));
    }

    /** {@code void glVertexAttribLPointerEXT(GLuint index, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribLPointerEXT(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        nglVertexAttribLPointerEXT(index, size, type, stride, pointer);
    }

    /** {@code void glVertexAttribLPointerEXT(GLuint index, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribLPointerEXT(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLsizei") int stride, @NativeType("void const *") DoubleBuffer pointer) {
        nglVertexAttribLPointerEXT(index, size, GL11.GL_DOUBLE, stride, memAddress(pointer));
    }

    // --- [ glGetVertexAttribLdvEXT ] ---

    /** {@code void glGetVertexAttribLdvEXT(GLuint index, GLenum pname, GLdouble * params)} */
    public static native void nglGetVertexAttribLdvEXT(int index, int pname, long params);

    /** {@code void glGetVertexAttribLdvEXT(GLuint index, GLenum pname, GLdouble * params)} */
    public static void glGetVertexAttribLdvEXT(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLdouble *") DoubleBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetVertexAttribLdvEXT(index, pname, memAddress(params));
    }

    // --- [ glVertexArrayVertexAttribLOffsetEXT ] ---

    /** {@code void glVertexArrayVertexAttribLOffsetEXT(GLuint vaobj, GLuint buffer, GLuint index, GLint size, GLenum type, GLsizei stride, GLintptr offset)} */
    public static void glVertexArrayVertexAttribLOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset) {
        ARBVertexAttrib64Bit.glVertexArrayVertexAttribLOffsetEXT(vaobj, buffer, index, size, type, stride, offset);
    }

    /** {@code void glVertexAttribL1dvEXT(GLuint index, GLdouble const * v)} */
    public static void glVertexAttribL1dvEXT(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glVertexAttribL1dvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttribL2dvEXT(GLuint index, GLdouble const * v)} */
    public static void glVertexAttribL2dvEXT(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glVertexAttribL2dvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttribL3dvEXT(GLuint index, GLdouble const * v)} */
    public static void glVertexAttribL3dvEXT(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glVertexAttribL3dvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttribL4dvEXT(GLuint index, GLdouble const * v)} */
    public static void glVertexAttribL4dvEXT(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glVertexAttribL4dvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glGetVertexAttribLdvEXT(GLuint index, GLenum pname, GLdouble * params)} */
    public static void glGetVertexAttribLdvEXT(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLdouble *") double[] params) {
        long __functionAddress = GL.getICD().glGetVertexAttribLdvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(index, pname, params, __functionAddress);
    }

}