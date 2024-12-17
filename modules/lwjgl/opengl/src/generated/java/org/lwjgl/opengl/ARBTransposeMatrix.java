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

public class ARBTransposeMatrix {

    static { GL.initialize(); }

    public static final int
        GL_TRANSPOSE_MODELVIEW_MATRIX_ARB  = 0x84E3,
        GL_TRANSPOSE_PROJECTION_MATRIX_ARB = 0x84E4,
        GL_TRANSPOSE_TEXTURE_MATRIX_ARB    = 0x84E5,
        GL_TRANSPOSE_COLOR_MATRIX_ARB      = 0x84E6;

    protected ARBTransposeMatrix() {
        throw new UnsupportedOperationException();
    }

    // --- [ glLoadTransposeMatrixfARB ] ---

    /** {@code void glLoadTransposeMatrixfARB(GLfloat const * m)} */
    public static native void nglLoadTransposeMatrixfARB(long m);

    /** {@code void glLoadTransposeMatrixfARB(GLfloat const * m)} */
    public static void glLoadTransposeMatrixfARB(@NativeType("GLfloat const *") FloatBuffer m) {
        if (CHECKS) {
            check(m, 16);
        }
        nglLoadTransposeMatrixfARB(memAddress(m));
    }

    // --- [ glLoadTransposeMatrixdARB ] ---

    /** {@code void glLoadTransposeMatrixdARB(GLdouble const * m)} */
    public static native void nglLoadTransposeMatrixdARB(long m);

    /** {@code void glLoadTransposeMatrixdARB(GLdouble const * m)} */
    public static void glLoadTransposeMatrixdARB(@NativeType("GLdouble const *") DoubleBuffer m) {
        if (CHECKS) {
            check(m, 16);
        }
        nglLoadTransposeMatrixdARB(memAddress(m));
    }

    // --- [ glMultTransposeMatrixfARB ] ---

    /** {@code void glMultTransposeMatrixfARB(GLfloat const * m)} */
    public static native void nglMultTransposeMatrixfARB(long m);

    /** {@code void glMultTransposeMatrixfARB(GLfloat const * m)} */
    public static void glMultTransposeMatrixfARB(@NativeType("GLfloat const *") FloatBuffer m) {
        if (CHECKS) {
            check(m, 16);
        }
        nglMultTransposeMatrixfARB(memAddress(m));
    }

    // --- [ glMultTransposeMatrixdARB ] ---

    /** {@code void glMultTransposeMatrixdARB(GLdouble const * m)} */
    public static native void nglMultTransposeMatrixdARB(long m);

    /** {@code void glMultTransposeMatrixdARB(GLdouble const * m)} */
    public static void glMultTransposeMatrixdARB(@NativeType("GLdouble const *") DoubleBuffer m) {
        if (CHECKS) {
            check(m, 16);
        }
        nglMultTransposeMatrixdARB(memAddress(m));
    }

    /** {@code void glLoadTransposeMatrixfARB(GLfloat const * m)} */
    public static void glLoadTransposeMatrixfARB(@NativeType("GLfloat const *") float[] m) {
        long __functionAddress = GL.getICD().glLoadTransposeMatrixfARB;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 16);
        }
        callPV(m, __functionAddress);
    }

    /** {@code void glLoadTransposeMatrixdARB(GLdouble const * m)} */
    public static void glLoadTransposeMatrixdARB(@NativeType("GLdouble const *") double[] m) {
        long __functionAddress = GL.getICD().glLoadTransposeMatrixdARB;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 16);
        }
        callPV(m, __functionAddress);
    }

    /** {@code void glMultTransposeMatrixfARB(GLfloat const * m)} */
    public static void glMultTransposeMatrixfARB(@NativeType("GLfloat const *") float[] m) {
        long __functionAddress = GL.getICD().glMultTransposeMatrixfARB;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 16);
        }
        callPV(m, __functionAddress);
    }

    /** {@code void glMultTransposeMatrixdARB(GLdouble const * m)} */
    public static void glMultTransposeMatrixdARB(@NativeType("GLdouble const *") double[] m) {
        long __functionAddress = GL.getICD().glMultTransposeMatrixdARB;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 16);
        }
        callPV(m, __functionAddress);
    }

}