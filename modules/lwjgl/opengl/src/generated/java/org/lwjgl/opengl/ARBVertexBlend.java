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

public class ARBVertexBlend {

    static { GL.initialize(); }

    public static final int
        GL_MAX_VERTEX_UNITS_ARB    = 0x86A4,
        GL_ACTIVE_VERTEX_UNITS_ARB = 0x86A5;

    public static final int
        GL_WEIGHT_SUM_UNITY_ARB = 0x86A6,
        GL_VERTEX_BLEND_ARB     = 0x86A7;

    public static final int
        GL_MODELVIEW0_ARB  = 0x1700,
        GL_MODELVIEW1_ARB  = 0x850A,
        GL_MODELVIEW2_ARB  = 0x8722,
        GL_MODELVIEW3_ARB  = 0x8723,
        GL_MODELVIEW4_ARB  = 0x8724,
        GL_MODELVIEW5_ARB  = 0x8725,
        GL_MODELVIEW6_ARB  = 0x8726,
        GL_MODELVIEW7_ARB  = 0x8727,
        GL_MODELVIEW8_ARB  = 0x8728,
        GL_MODELVIEW9_ARB  = 0x8729,
        GL_MODELVIEW10_ARB = 0x872A,
        GL_MODELVIEW11_ARB = 0x872B,
        GL_MODELVIEW12_ARB = 0x872C,
        GL_MODELVIEW13_ARB = 0x872D,
        GL_MODELVIEW14_ARB = 0x872E,
        GL_MODELVIEW15_ARB = 0x872F,
        GL_MODELVIEW16_ARB = 0x8730,
        GL_MODELVIEW17_ARB = 0x8731,
        GL_MODELVIEW18_ARB = 0x8732,
        GL_MODELVIEW19_ARB = 0x8733,
        GL_MODELVIEW20_ARB = 0x8734,
        GL_MODELVIEW21_ARB = 0x8735,
        GL_MODELVIEW22_ARB = 0x8736,
        GL_MODELVIEW23_ARB = 0x8737,
        GL_MODELVIEW24_ARB = 0x8738,
        GL_MODELVIEW25_ARB = 0x8739,
        GL_MODELVIEW26_ARB = 0x873A,
        GL_MODELVIEW27_ARB = 0x873B,
        GL_MODELVIEW28_ARB = 0x873C,
        GL_MODELVIEW29_ARB = 0x873D,
        GL_MODELVIEW30_ARB = 0x873E,
        GL_MODELVIEW31_ARB = 0x873F;

    public static final int GL_CURRENT_WEIGHT_ARB = 0x86A8;

    public static final int
        GL_WEIGHT_ARRAY_TYPE_ARB   = 0x86A9,
        GL_WEIGHT_ARRAY_STRIDE_ARB = 0x86AA,
        GL_WEIGHT_ARRAY_SIZE_ARB   = 0x86AB;

    public static final int GL_WEIGHT_ARRAY_POINTER_ARB = 0x86AC;

    public static final int GL_WEIGHT_ARRAY_ARB = 0x86AD;

    protected ARBVertexBlend() {
        throw new UnsupportedOperationException();
    }

    // --- [ glWeightfvARB ] ---

    /** {@code void glWeightfvARB(GLint size, GLfloat * weights)} */
    public static native void nglWeightfvARB(int size, long weights);

    /** {@code void glWeightfvARB(GLint size, GLfloat * weights)} */
    public static void glWeightfvARB(@NativeType("GLfloat *") FloatBuffer weights) {
        nglWeightfvARB(weights.remaining(), memAddress(weights));
    }

    // --- [ glWeightbvARB ] ---

    /** {@code void glWeightbvARB(GLint size, GLbyte * weights)} */
    public static native void nglWeightbvARB(int size, long weights);

    /** {@code void glWeightbvARB(GLint size, GLbyte * weights)} */
    public static void glWeightbvARB(@NativeType("GLbyte *") ByteBuffer weights) {
        nglWeightbvARB(weights.remaining(), memAddress(weights));
    }

    // --- [ glWeightubvARB ] ---

    /** {@code void glWeightubvARB(GLint size, GLubyte * weights)} */
    public static native void nglWeightubvARB(int size, long weights);

    /** {@code void glWeightubvARB(GLint size, GLubyte * weights)} */
    public static void glWeightubvARB(@NativeType("GLubyte *") ByteBuffer weights) {
        nglWeightubvARB(weights.remaining(), memAddress(weights));
    }

    // --- [ glWeightsvARB ] ---

    /** {@code void glWeightsvARB(GLint size, GLshort * weights)} */
    public static native void nglWeightsvARB(int size, long weights);

    /** {@code void glWeightsvARB(GLint size, GLshort * weights)} */
    public static void glWeightsvARB(@NativeType("GLshort *") ShortBuffer weights) {
        nglWeightsvARB(weights.remaining(), memAddress(weights));
    }

    // --- [ glWeightusvARB ] ---

    /** {@code void glWeightusvARB(GLint size, GLushort * weights)} */
    public static native void nglWeightusvARB(int size, long weights);

    /** {@code void glWeightusvARB(GLint size, GLushort * weights)} */
    public static void glWeightusvARB(@NativeType("GLushort *") ShortBuffer weights) {
        nglWeightusvARB(weights.remaining(), memAddress(weights));
    }

    // --- [ glWeightivARB ] ---

    /** {@code void glWeightivARB(GLint size, GLint * weights)} */
    public static native void nglWeightivARB(int size, long weights);

    /** {@code void glWeightivARB(GLint size, GLint * weights)} */
    public static void glWeightivARB(@NativeType("GLint *") IntBuffer weights) {
        nglWeightivARB(weights.remaining(), memAddress(weights));
    }

    // --- [ glWeightuivARB ] ---

    /** {@code void glWeightuivARB(GLint size, GLuint * weights)} */
    public static native void nglWeightuivARB(int size, long weights);

    /** {@code void glWeightuivARB(GLint size, GLuint * weights)} */
    public static void glWeightuivARB(@NativeType("GLuint *") IntBuffer weights) {
        nglWeightuivARB(weights.remaining(), memAddress(weights));
    }

    // --- [ glWeightdvARB ] ---

    /** {@code void glWeightdvARB(GLint size, GLdouble * weights)} */
    public static native void nglWeightdvARB(int size, long weights);

    /** {@code void glWeightdvARB(GLint size, GLdouble * weights)} */
    public static void glWeightdvARB(@NativeType("GLdouble *") DoubleBuffer weights) {
        nglWeightdvARB(weights.remaining(), memAddress(weights));
    }

    // --- [ glWeightPointerARB ] ---

    /** {@code void glWeightPointerARB(GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static native void nglWeightPointerARB(int size, int type, int stride, long pointer);

    /** {@code void glWeightPointerARB(GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glWeightPointerARB(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        nglWeightPointerARB(size, type, stride, memAddress(pointer));
    }

    /** {@code void glWeightPointerARB(GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glWeightPointerARB(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        nglWeightPointerARB(size, type, stride, pointer);
    }

    /** {@code void glWeightPointerARB(GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glWeightPointerARB(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        nglWeightPointerARB(size, type, stride, memAddress(pointer));
    }

    /** {@code void glWeightPointerARB(GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glWeightPointerARB(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        nglWeightPointerARB(size, type, stride, memAddress(pointer));
    }

    /** {@code void glWeightPointerARB(GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glWeightPointerARB(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") FloatBuffer pointer) {
        nglWeightPointerARB(size, type, stride, memAddress(pointer));
    }

    // --- [ glVertexBlendARB ] ---

    /** {@code void glVertexBlendARB(GLint count)} */
    public static native void glVertexBlendARB(@NativeType("GLint") int count);

    /** {@code void glWeightfvARB(GLint size, GLfloat * weights)} */
    public static void glWeightfvARB(@NativeType("GLfloat *") float[] weights) {
        long __functionAddress = GL.getICD().glWeightfvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(weights.length, weights, __functionAddress);
    }

    /** {@code void glWeightsvARB(GLint size, GLshort * weights)} */
    public static void glWeightsvARB(@NativeType("GLshort *") short[] weights) {
        long __functionAddress = GL.getICD().glWeightsvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(weights.length, weights, __functionAddress);
    }

    /** {@code void glWeightusvARB(GLint size, GLushort * weights)} */
    public static void glWeightusvARB(@NativeType("GLushort *") short[] weights) {
        long __functionAddress = GL.getICD().glWeightusvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(weights.length, weights, __functionAddress);
    }

    /** {@code void glWeightivARB(GLint size, GLint * weights)} */
    public static void glWeightivARB(@NativeType("GLint *") int[] weights) {
        long __functionAddress = GL.getICD().glWeightivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(weights.length, weights, __functionAddress);
    }

    /** {@code void glWeightuivARB(GLint size, GLuint * weights)} */
    public static void glWeightuivARB(@NativeType("GLuint *") int[] weights) {
        long __functionAddress = GL.getICD().glWeightuivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(weights.length, weights, __functionAddress);
    }

    /** {@code void glWeightdvARB(GLint size, GLdouble * weights)} */
    public static void glWeightdvARB(@NativeType("GLdouble *") double[] weights) {
        long __functionAddress = GL.getICD().glWeightdvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(weights.length, weights, __functionAddress);
    }

    /** {@code void glWeightPointerARB(GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glWeightPointerARB(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") short[] pointer) {
        long __functionAddress = GL.getICD().glWeightPointerARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(size, type, stride, pointer, __functionAddress);
    }

    /** {@code void glWeightPointerARB(GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glWeightPointerARB(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") int[] pointer) {
        long __functionAddress = GL.getICD().glWeightPointerARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(size, type, stride, pointer, __functionAddress);
    }

    /** {@code void glWeightPointerARB(GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glWeightPointerARB(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") float[] pointer) {
        long __functionAddress = GL.getICD().glWeightPointerARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(size, type, stride, pointer, __functionAddress);
    }

}