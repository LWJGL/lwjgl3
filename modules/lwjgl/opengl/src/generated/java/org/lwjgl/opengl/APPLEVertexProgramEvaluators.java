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

public class APPLEVertexProgramEvaluators {

    static { GL.initialize(); }

    public static final int
        GL_VERTEX_ATTRIB_MAP1_APPLE = 0x8A00,
        GL_VERTEX_ATTRIB_MAP2_APPLE = 0x8A01;

    public static final int
        GL_VERTEX_ATTRIB_MAP1_SIZE_APPLE   = 0x8A02,
        GL_VERTEX_ATTRIB_MAP1_COEFF_APPLE  = 0x8A03,
        GL_VERTEX_ATTRIB_MAP1_ORDER_APPLE  = 0x8A04,
        GL_VERTEX_ATTRIB_MAP1_DOMAIN_APPLE = 0x8A05,
        GL_VERTEX_ATTRIB_MAP2_SIZE_APPLE   = 0x8A06,
        GL_VERTEX_ATTRIB_MAP2_COEFF_APPLE  = 0x8A07,
        GL_VERTEX_ATTRIB_MAP2_ORDER_APPLE  = 0x8A08,
        GL_VERTEX_ATTRIB_MAP2_DOMAIN_APPLE = 0x8A09;

    protected APPLEVertexProgramEvaluators() {
        throw new UnsupportedOperationException();
    }

    // --- [ glEnableVertexAttribAPPLE ] ---

    /** {@code void glEnableVertexAttribAPPLE(GLuint index, GLenum pname)} */
    public static native void glEnableVertexAttribAPPLE(@NativeType("GLuint") int index, @NativeType("GLenum") int pname);

    // --- [ glDisableVertexAttribAPPLE ] ---

    /** {@code void glDisableVertexAttribAPPLE(GLuint index, GLenum pname)} */
    public static native void glDisableVertexAttribAPPLE(@NativeType("GLuint") int index, @NativeType("GLenum") int pname);

    // --- [ glIsVertexAttribEnabledAPPLE ] ---

    /** {@code GLboolean glIsVertexAttribEnabledAPPLE(GLuint index, GLenum pname)} */
    @NativeType("GLboolean")
    public static native boolean glIsVertexAttribEnabledAPPLE(@NativeType("GLuint") int index, @NativeType("GLenum") int pname);

    // --- [ glMapVertexAttrib1dAPPLE ] ---

    /** {@code void glMapVertexAttrib1dAPPLE(GLuint index, GLuint size, GLdouble u1, GLdouble u2, GLint stride, GLint order, GLdouble const * points)} */
    public static native void nglMapVertexAttrib1dAPPLE(int index, int size, double u1, double u2, int stride, int order, long points);

    /** {@code void glMapVertexAttrib1dAPPLE(GLuint index, GLuint size, GLdouble u1, GLdouble u2, GLint stride, GLint order, GLdouble const * points)} */
    public static void glMapVertexAttrib1dAPPLE(@NativeType("GLuint") int index, @NativeType("GLuint") int size, @NativeType("GLdouble") double u1, @NativeType("GLdouble") double u2, @NativeType("GLint") int stride, @NativeType("GLint") int order, @NativeType("GLdouble const *") DoubleBuffer points) {
        if (CHECKS) {
            check(points, stride * order);
        }
        nglMapVertexAttrib1dAPPLE(index, size, u1, u2, stride, order, memAddress(points));
    }

    // --- [ glMapVertexAttrib1fAPPLE ] ---

    /** {@code void glMapVertexAttrib1fAPPLE(GLuint index, GLuint size, GLfloat u1, GLfloat u2, GLint stride, GLint order, GLfloat const * points)} */
    public static native void nglMapVertexAttrib1fAPPLE(int index, int size, float u1, float u2, int stride, int order, long points);

    /** {@code void glMapVertexAttrib1fAPPLE(GLuint index, GLuint size, GLfloat u1, GLfloat u2, GLint stride, GLint order, GLfloat const * points)} */
    public static void glMapVertexAttrib1fAPPLE(@NativeType("GLuint") int index, @NativeType("GLuint") int size, @NativeType("GLfloat") float u1, @NativeType("GLfloat") float u2, @NativeType("GLint") int stride, @NativeType("GLint") int order, @NativeType("GLfloat const *") FloatBuffer points) {
        if (CHECKS) {
            check(points, stride * order);
        }
        nglMapVertexAttrib1fAPPLE(index, size, u1, u2, stride, order, memAddress(points));
    }

    // --- [ glMapVertexAttrib2dAPPLE ] ---

    /** {@code void glMapVertexAttrib2dAPPLE(GLuint index, GLuint size, GLdouble u1, GLdouble u2, GLint ustride, GLint uorder, GLdouble v1, GLdouble v2, GLint vstride, GLint vorder, GLdouble const * points)} */
    public static native void nglMapVertexAttrib2dAPPLE(int index, int size, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, long points);

    /** {@code void glMapVertexAttrib2dAPPLE(GLuint index, GLuint size, GLdouble u1, GLdouble u2, GLint ustride, GLint uorder, GLdouble v1, GLdouble v2, GLint vstride, GLint vorder, GLdouble const * points)} */
    public static void glMapVertexAttrib2dAPPLE(@NativeType("GLuint") int index, @NativeType("GLuint") int size, @NativeType("GLdouble") double u1, @NativeType("GLdouble") double u2, @NativeType("GLint") int ustride, @NativeType("GLint") int uorder, @NativeType("GLdouble") double v1, @NativeType("GLdouble") double v2, @NativeType("GLint") int vstride, @NativeType("GLint") int vorder, @NativeType("GLdouble const *") DoubleBuffer points) {
        if (CHECKS) {
            check(points, ustride * uorder * vstride * vorder);
        }
        nglMapVertexAttrib2dAPPLE(index, size, u1, u2, ustride, uorder, v1, v2, vstride, vorder, memAddress(points));
    }

    // --- [ glMapVertexAttrib2fAPPLE ] ---

    /** {@code void glMapVertexAttrib2fAPPLE(GLuint index, GLuint size, GLfloat u1, GLfloat u2, GLint ustride, GLint uorder, GLfloat v1, GLfloat v2, GLint vstride, GLint vorder, GLfloat const * points)} */
    public static native void nglMapVertexAttrib2fAPPLE(int index, int size, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, long points);

    /** {@code void glMapVertexAttrib2fAPPLE(GLuint index, GLuint size, GLfloat u1, GLfloat u2, GLint ustride, GLint uorder, GLfloat v1, GLfloat v2, GLint vstride, GLint vorder, GLfloat const * points)} */
    public static void glMapVertexAttrib2fAPPLE(@NativeType("GLuint") int index, @NativeType("GLuint") int size, @NativeType("GLfloat") float u1, @NativeType("GLfloat") float u2, @NativeType("GLint") int ustride, @NativeType("GLint") int uorder, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2, @NativeType("GLint") int vstride, @NativeType("GLint") int vorder, @NativeType("GLfloat const *") FloatBuffer points) {
        if (CHECKS) {
            check(points, ustride * uorder * vstride * vorder);
        }
        nglMapVertexAttrib2fAPPLE(index, size, u1, u2, ustride, uorder, v1, v2, vstride, vorder, memAddress(points));
    }

    /** {@code void glMapVertexAttrib1dAPPLE(GLuint index, GLuint size, GLdouble u1, GLdouble u2, GLint stride, GLint order, GLdouble const * points)} */
    public static void glMapVertexAttrib1dAPPLE(@NativeType("GLuint") int index, @NativeType("GLuint") int size, @NativeType("GLdouble") double u1, @NativeType("GLdouble") double u2, @NativeType("GLint") int stride, @NativeType("GLint") int order, @NativeType("GLdouble const *") double[] points) {
        long __functionAddress = GL.getICD().glMapVertexAttrib1dAPPLE;
        if (CHECKS) {
            check(__functionAddress);
            check(points, stride * order);
        }
        callPV(index, size, u1, u2, stride, order, points, __functionAddress);
    }

    /** {@code void glMapVertexAttrib1fAPPLE(GLuint index, GLuint size, GLfloat u1, GLfloat u2, GLint stride, GLint order, GLfloat const * points)} */
    public static void glMapVertexAttrib1fAPPLE(@NativeType("GLuint") int index, @NativeType("GLuint") int size, @NativeType("GLfloat") float u1, @NativeType("GLfloat") float u2, @NativeType("GLint") int stride, @NativeType("GLint") int order, @NativeType("GLfloat const *") float[] points) {
        long __functionAddress = GL.getICD().glMapVertexAttrib1fAPPLE;
        if (CHECKS) {
            check(__functionAddress);
            check(points, stride * order);
        }
        callPV(index, size, u1, u2, stride, order, points, __functionAddress);
    }

    /** {@code void glMapVertexAttrib2dAPPLE(GLuint index, GLuint size, GLdouble u1, GLdouble u2, GLint ustride, GLint uorder, GLdouble v1, GLdouble v2, GLint vstride, GLint vorder, GLdouble const * points)} */
    public static void glMapVertexAttrib2dAPPLE(@NativeType("GLuint") int index, @NativeType("GLuint") int size, @NativeType("GLdouble") double u1, @NativeType("GLdouble") double u2, @NativeType("GLint") int ustride, @NativeType("GLint") int uorder, @NativeType("GLdouble") double v1, @NativeType("GLdouble") double v2, @NativeType("GLint") int vstride, @NativeType("GLint") int vorder, @NativeType("GLdouble const *") double[] points) {
        long __functionAddress = GL.getICD().glMapVertexAttrib2dAPPLE;
        if (CHECKS) {
            check(__functionAddress);
            check(points, ustride * uorder * vstride * vorder);
        }
        callPV(index, size, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points, __functionAddress);
    }

    /** {@code void glMapVertexAttrib2fAPPLE(GLuint index, GLuint size, GLfloat u1, GLfloat u2, GLint ustride, GLint uorder, GLfloat v1, GLfloat v2, GLint vstride, GLint vorder, GLfloat const * points)} */
    public static void glMapVertexAttrib2fAPPLE(@NativeType("GLuint") int index, @NativeType("GLuint") int size, @NativeType("GLfloat") float u1, @NativeType("GLfloat") float u2, @NativeType("GLint") int ustride, @NativeType("GLint") int uorder, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2, @NativeType("GLint") int vstride, @NativeType("GLint") int vorder, @NativeType("GLfloat const *") float[] points) {
        long __functionAddress = GL.getICD().glMapVertexAttrib2fAPPLE;
        if (CHECKS) {
            check(__functionAddress);
            check(points, ustride * uorder * vstride * vorder);
        }
        callPV(index, size, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points, __functionAddress);
    }

}