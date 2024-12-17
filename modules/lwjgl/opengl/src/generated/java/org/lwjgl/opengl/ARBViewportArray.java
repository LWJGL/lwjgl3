/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

public class ARBViewportArray {

    static { GL.initialize(); }

    public static final int
        GL_MAX_VIEWPORTS                   = 0x825B,
        GL_VIEWPORT_SUBPIXEL_BITS          = 0x825C,
        GL_VIEWPORT_BOUNDS_RANGE           = 0x825D,
        GL_LAYER_PROVOKING_VERTEX          = 0x825E,
        GL_VIEWPORT_INDEX_PROVOKING_VERTEX = 0x825F;

    public static final int GL_UNDEFINED_VERTEX = 0x8260;

    protected ARBViewportArray() {
        throw new UnsupportedOperationException();
    }

    // --- [ glViewportArrayv ] ---

    /** {@code void glViewportArrayv(GLuint first, GLsizei count, GLfloat const * v)} */
    public static void nglViewportArrayv(int first, int count, long v) {
        GL41C.nglViewportArrayv(first, count, v);
    }

    /** {@code void glViewportArrayv(GLuint first, GLsizei count, GLfloat const * v)} */
    public static void glViewportArrayv(@NativeType("GLuint") int first, @NativeType("GLfloat const *") FloatBuffer v) {
        GL41C.glViewportArrayv(first, v);
    }

    // --- [ glViewportIndexedf ] ---

    /** {@code void glViewportIndexedf(GLuint index, GLfloat x, GLfloat y, GLfloat w, GLfloat h)} */
    public static void glViewportIndexedf(@NativeType("GLuint") int index, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float w, @NativeType("GLfloat") float h) {
        GL41C.glViewportIndexedf(index, x, y, w, h);
    }

    // --- [ glViewportIndexedfv ] ---

    /** {@code void glViewportIndexedfv(GLuint index, GLfloat const * v)} */
    public static void nglViewportIndexedfv(int index, long v) {
        GL41C.nglViewportIndexedfv(index, v);
    }

    /** {@code void glViewportIndexedfv(GLuint index, GLfloat const * v)} */
    public static void glViewportIndexedfv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        GL41C.glViewportIndexedfv(index, v);
    }

    // --- [ glScissorArrayv ] ---

    /** {@code void glScissorArrayv(GLuint first, GLsizei count, GLint const * v)} */
    public static void nglScissorArrayv(int first, int count, long v) {
        GL41C.nglScissorArrayv(first, count, v);
    }

    /** {@code void glScissorArrayv(GLuint first, GLsizei count, GLint const * v)} */
    public static void glScissorArrayv(@NativeType("GLuint") int first, @NativeType("GLint const *") IntBuffer v) {
        GL41C.glScissorArrayv(first, v);
    }

    // --- [ glScissorIndexed ] ---

    /** {@code void glScissorIndexed(GLuint index, GLint left, GLint bottom, GLsizei width, GLsizei height)} */
    public static void glScissorIndexed(@NativeType("GLuint") int index, @NativeType("GLint") int left, @NativeType("GLint") int bottom, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        GL41C.glScissorIndexed(index, left, bottom, width, height);
    }

    // --- [ glScissorIndexedv ] ---

    /** {@code void glScissorIndexedv(GLuint index, GLint const * v)} */
    public static void nglScissorIndexedv(int index, long v) {
        GL41C.nglScissorIndexedv(index, v);
    }

    /** {@code void glScissorIndexedv(GLuint index, GLint const * v)} */
    public static void glScissorIndexedv(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        GL41C.glScissorIndexedv(index, v);
    }

    // --- [ glDepthRangeArrayv ] ---

    /** {@code void glDepthRangeArrayv(GLuint first, GLsizei count, GLdouble const * v)} */
    public static void nglDepthRangeArrayv(int first, int count, long v) {
        GL41C.nglDepthRangeArrayv(first, count, v);
    }

    /** {@code void glDepthRangeArrayv(GLuint first, GLsizei count, GLdouble const * v)} */
    public static void glDepthRangeArrayv(@NativeType("GLuint") int first, @NativeType("GLdouble const *") DoubleBuffer v) {
        GL41C.glDepthRangeArrayv(first, v);
    }

    // --- [ glDepthRangeIndexed ] ---

    /** {@code void glDepthRangeIndexed(GLuint index, GLdouble zNear, GLdouble zFar)} */
    public static void glDepthRangeIndexed(@NativeType("GLuint") int index, @NativeType("GLdouble") double zNear, @NativeType("GLdouble") double zFar) {
        GL41C.glDepthRangeIndexed(index, zNear, zFar);
    }

    // --- [ glGetFloati_v ] ---

    /** {@code void glGetFloati_v(GLenum target, GLuint index, GLfloat * data)} */
    public static void nglGetFloati_v(int target, int index, long data) {
        GL41C.nglGetFloati_v(target, index, data);
    }

    /** {@code void glGetFloati_v(GLenum target, GLuint index, GLfloat * data)} */
    public static void glGetFloati_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat *") FloatBuffer data) {
        GL41C.glGetFloati_v(target, index, data);
    }

    /** {@code void glGetFloati_v(GLenum target, GLuint index, GLfloat * data)} */
    @NativeType("void")
    public static float glGetFloati(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        return GL41C.glGetFloati(target, index);
    }

    // --- [ glGetDoublei_v ] ---

    /** {@code void glGetDoublei_v(GLenum target, GLuint index, GLdouble * data)} */
    public static void nglGetDoublei_v(int target, int index, long data) {
        GL41C.nglGetDoublei_v(target, index, data);
    }

    /** {@code void glGetDoublei_v(GLenum target, GLuint index, GLdouble * data)} */
    public static void glGetDoublei_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble *") DoubleBuffer data) {
        GL41C.glGetDoublei_v(target, index, data);
    }

    /** {@code void glGetDoublei_v(GLenum target, GLuint index, GLdouble * data)} */
    @NativeType("void")
    public static double glGetDoublei(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        return GL41C.glGetDoublei(target, index);
    }

    /** {@code void glViewportArrayv(GLuint first, GLsizei count, GLfloat const * v)} */
    public static void glViewportArrayv(@NativeType("GLuint") int first, @NativeType("GLfloat const *") float[] v) {
        GL41C.glViewportArrayv(first, v);
    }

    /** {@code void glViewportIndexedfv(GLuint index, GLfloat const * v)} */
    public static void glViewportIndexedfv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        GL41C.glViewportIndexedfv(index, v);
    }

    /** {@code void glScissorArrayv(GLuint first, GLsizei count, GLint const * v)} */
    public static void glScissorArrayv(@NativeType("GLuint") int first, @NativeType("GLint const *") int[] v) {
        GL41C.glScissorArrayv(first, v);
    }

    /** {@code void glScissorIndexedv(GLuint index, GLint const * v)} */
    public static void glScissorIndexedv(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        GL41C.glScissorIndexedv(index, v);
    }

    /** {@code void glDepthRangeArrayv(GLuint first, GLsizei count, GLdouble const * v)} */
    public static void glDepthRangeArrayv(@NativeType("GLuint") int first, @NativeType("GLdouble const *") double[] v) {
        GL41C.glDepthRangeArrayv(first, v);
    }

    /** {@code void glGetFloati_v(GLenum target, GLuint index, GLfloat * data)} */
    public static void glGetFloati_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat *") float[] data) {
        GL41C.glGetFloati_v(target, index, data);
    }

    /** {@code void glGetDoublei_v(GLenum target, GLuint index, GLdouble * data)} */
    public static void glGetDoublei_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble *") double[] data) {
        GL41C.glGetDoublei_v(target, index, data);
    }

}