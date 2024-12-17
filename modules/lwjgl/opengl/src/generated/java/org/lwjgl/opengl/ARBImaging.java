/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class ARBImaging {

    static { GL.initialize(); }

    public static final int
        GL_COLOR_TABLE                   = 0x80D0,
        GL_POST_CONVOLUTION_COLOR_TABLE  = 0x80D1,
        GL_POST_COLOR_MATRIX_COLOR_TABLE = 0x80D2;

    public static final int
        GL_PROXY_COLOR_TABLE                   = 0x80D3,
        GL_PROXY_POST_CONVOLUTION_COLOR_TABLE  = 0x80D4,
        GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE = 0x80D5;

    public static final int
        GL_COLOR_TABLE_SCALE = 0x80D6,
        GL_COLOR_TABLE_BIAS  = 0x80D7;

    public static final int
        GL_COLOR_TABLE_FORMAT         = 0x80D8,
        GL_COLOR_TABLE_WIDTH          = 0x80D9,
        GL_COLOR_TABLE_RED_SIZE       = 0x80DA,
        GL_COLOR_TABLE_GREEN_SIZE     = 0x80DB,
        GL_COLOR_TABLE_BLUE_SIZE      = 0x80DC,
        GL_COLOR_TABLE_ALPHA_SIZE     = 0x80DD,
        GL_COLOR_TABLE_LUMINANCE_SIZE = 0x80DE,
        GL_COLOR_TABLE_INTENSITY_SIZE = 0x80DF;

    public static final int GL_TABLE_TOO_LARGE = 0x8031;

    public static final int GL_CONVOLUTION_1D = 0x8010;

    public static final int GL_CONVOLUTION_2D = 0x8011;

    public static final int GL_SEPARABLE_2D = 0x8012;

    public static final int GL_CONVOLUTION_BORDER_MODE = 0x8013;

    public static final int
        GL_CONVOLUTION_FILTER_SCALE = 0x8014,
        GL_CONVOLUTION_FILTER_BIAS  = 0x8015;

    public static final int GL_REDUCE = 0x8016;

    public static final int
        GL_CONVOLUTION_FORMAT     = 0x8017,
        GL_CONVOLUTION_WIDTH      = 0x8018,
        GL_CONVOLUTION_HEIGHT     = 0x8019,
        GL_MAX_CONVOLUTION_WIDTH  = 0x801A,
        GL_MAX_CONVOLUTION_HEIGHT = 0x801B;

    public static final int
        GL_POST_CONVOLUTION_RED_SCALE   = 0x801C,
        GL_POST_CONVOLUTION_GREEN_SCALE = 0x801D,
        GL_POST_CONVOLUTION_BLUE_SCALE  = 0x801E,
        GL_POST_CONVOLUTION_ALPHA_SCALE = 0x801F,
        GL_POST_CONVOLUTION_RED_BIAS    = 0x8020,
        GL_POST_CONVOLUTION_GREEN_BIAS  = 0x8021,
        GL_POST_CONVOLUTION_BLUE_BIAS   = 0x8022,
        GL_POST_CONVOLUTION_ALPHA_BIAS  = 0x8023;

    public static final int
        GL_CONSTANT_BORDER  = 0x8151,
        GL_REPLICATE_BORDER = 0x8153;

    public static final int GL_CONVOLUTION_BORDER_COLOR = 0x8154;

    public static final int
        GL_COLOR_MATRIX                 = 0x80B1,
        GL_COLOR_MATRIX_STACK_DEPTH     = 0x80B2,
        GL_MAX_COLOR_MATRIX_STACK_DEPTH = 0x80B3;

    public static final int
        GL_POST_COLOR_MATRIX_RED_SCALE   = 0x80B4,
        GL_POST_COLOR_MATRIX_GREEN_SCALE = 0x80B5,
        GL_POST_COLOR_MATRIX_BLUE_SCALE  = 0x80B6,
        GL_POST_COLOR_MATRIX_ALPHA_SCALE = 0x80B7,
        GL_POST_COLOR_MATRIX_RED_BIAS    = 0x80B8,
        GL_POST_COLOR_MATRIX_GREEN_BIAS  = 0x80B9,
        GL_POST_COLOR_MATRIX_BLUE_BIAS   = 0x80BA,
        GL_POST_COLOR_MATRIX_ALPHA_BIAS  = 0x80BB;

    public static final int GL_HISTOGRAM = 0x8024;

    public static final int GL_PROXY_HISTOGRAM = 0x8025;

    public static final int
        GL_HISTOGRAM_WIDTH          = 0x8026,
        GL_HISTOGRAM_FORMAT         = 0x8027,
        GL_HISTOGRAM_RED_SIZE       = 0x8028,
        GL_HISTOGRAM_GREEN_SIZE     = 0x8029,
        GL_HISTOGRAM_BLUE_SIZE      = 0x802A,
        GL_HISTOGRAM_ALPHA_SIZE     = 0x802B,
        GL_HISTOGRAM_LUMINANCE_SIZE = 0x802C,
        GL_HISTOGRAM_SINK           = 0x802D;

    public static final int GL_MINMAX = 0x802E;

    public static final int
        GL_MINMAX_FORMAT = 0x802F,
        GL_MINMAX_SINK   = 0x8030;

    public static final int
        GL_CONSTANT_COLOR           = 0x8001,
        GL_ONE_MINUS_CONSTANT_COLOR = 0x8002,
        GL_CONSTANT_ALPHA           = 0x8003,
        GL_ONE_MINUS_CONSTANT_ALPHA = 0x8004;

    public static final int GL_BLEND_COLOR = 0x8005;

    public static final int
        GL_FUNC_ADD = 0x8006,
        GL_MIN      = 0x8007,
        GL_MAX      = 0x8008;

    public static final int GL_BLEND_EQUATION = 0x8009;

    public static final int
        GL_FUNC_SUBTRACT         = 0x800A,
        GL_FUNC_REVERSE_SUBTRACT = 0x800B;

    protected ARBImaging() {
        throw new UnsupportedOperationException();
    }

    // --- [ glColorTable ] ---

    /** {@code void glColorTable(GLenum target, GLenum internalformat, GLsizei width, GLenum format, GLenum type, void const * table)} */
    public static native void nglColorTable(int target, int internalformat, int width, int format, int type, long table);

    /** {@code void glColorTable(GLenum target, GLenum internalformat, GLsizei width, GLenum format, GLenum type, void const * table)} */
    public static void glColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer table) {
        nglColorTable(target, internalformat, width, format, type, memAddress(table));
    }

    /** {@code void glColorTable(GLenum target, GLenum internalformat, GLsizei width, GLenum format, GLenum type, void const * table)} */
    public static void glColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long table) {
        nglColorTable(target, internalformat, width, format, type, table);
    }

    /** {@code void glColorTable(GLenum target, GLenum internalformat, GLsizei width, GLenum format, GLenum type, void const * table)} */
    public static void glColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer table) {
        nglColorTable(target, internalformat, width, format, type, memAddress(table));
    }

    /** {@code void glColorTable(GLenum target, GLenum internalformat, GLsizei width, GLenum format, GLenum type, void const * table)} */
    public static void glColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer table) {
        nglColorTable(target, internalformat, width, format, type, memAddress(table));
    }

    /** {@code void glColorTable(GLenum target, GLenum internalformat, GLsizei width, GLenum format, GLenum type, void const * table)} */
    public static void glColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer table) {
        nglColorTable(target, internalformat, width, format, type, memAddress(table));
    }

    // --- [ glCopyColorTable ] ---

    /** {@code void glCopyColorTable(GLenum target, GLenum internalformat, GLint x, GLint y, GLsizei width)} */
    public static native void glCopyColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width);

    // --- [ glColorTableParameteriv ] ---

    /** {@code void glColorTableParameteriv(GLenum target, GLenum pname, GLint const * params)} */
    public static native void nglColorTableParameteriv(int target, int pname, long params);

    /** {@code void glColorTableParameteriv(GLenum target, GLenum pname, GLint const * params)} */
    public static void glColorTableParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglColorTableParameteriv(target, pname, memAddress(params));
    }

    // --- [ glColorTableParameterfv ] ---

    /** {@code void glColorTableParameterfv(GLenum target, GLenum pname, GLfloat const * params)} */
    public static native void nglColorTableParameterfv(int target, int pname, long params);

    /** {@code void glColorTableParameterfv(GLenum target, GLenum pname, GLfloat const * params)} */
    public static void glColorTableParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglColorTableParameterfv(target, pname, memAddress(params));
    }

    // --- [ glGetColorTable ] ---

    /** {@code void glGetColorTable(GLenum target, GLenum format, GLenum type, void * table)} */
    public static native void nglGetColorTable(int target, int format, int type, long table);

    /** {@code void glGetColorTable(GLenum target, GLenum format, GLenum type, void * table)} */
    public static void glGetColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer table) {
        nglGetColorTable(target, format, type, memAddress(table));
    }

    /** {@code void glGetColorTable(GLenum target, GLenum format, GLenum type, void * table)} */
    public static void glGetColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") long table) {
        nglGetColorTable(target, format, type, table);
    }

    /** {@code void glGetColorTable(GLenum target, GLenum format, GLenum type, void * table)} */
    public static void glGetColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer table) {
        nglGetColorTable(target, format, type, memAddress(table));
    }

    /** {@code void glGetColorTable(GLenum target, GLenum format, GLenum type, void * table)} */
    public static void glGetColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer table) {
        nglGetColorTable(target, format, type, memAddress(table));
    }

    /** {@code void glGetColorTable(GLenum target, GLenum format, GLenum type, void * table)} */
    public static void glGetColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer table) {
        nglGetColorTable(target, format, type, memAddress(table));
    }

    // --- [ glGetColorTableParameteriv ] ---

    /** {@code void glGetColorTableParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static native void nglGetColorTableParameteriv(int target, int pname, long params);

    /** {@code void glGetColorTableParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetColorTableParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetColorTableParameteriv(target, pname, memAddress(params));
    }

    /** {@code void glGetColorTableParameteriv(GLenum target, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetColorTableParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetColorTableParameteriv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetColorTableParameterfv ] ---

    /** {@code void glGetColorTableParameterfv(GLenum target, GLenum pname, GLfloat * params)} */
    public static native void nglGetColorTableParameterfv(int target, int pname, long params);

    /** {@code void glGetColorTableParameterfv(GLenum target, GLenum pname, GLfloat * params)} */
    public static void glGetColorTableParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetColorTableParameterfv(target, pname, memAddress(params));
    }

    /** {@code void glGetColorTableParameterfv(GLenum target, GLenum pname, GLfloat * params)} */
    @NativeType("void")
    public static float glGetColorTableParameterf(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetColorTableParameterfv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glColorSubTable ] ---

    /** {@code void glColorSubTable(GLenum target, GLsizei start, GLsizei count, GLenum format, GLenum type, void const * data)} */
    public static native void nglColorSubTable(int target, int start, int count, int format, int type, long data);

    /** {@code void glColorSubTable(GLenum target, GLsizei start, GLsizei count, GLenum format, GLenum type, void const * data)} */
    public static void glColorSubTable(@NativeType("GLenum") int target, @NativeType("GLsizei") int start, @NativeType("GLsizei") int count, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer data) {
        nglColorSubTable(target, start, count, format, type, memAddress(data));
    }

    /** {@code void glColorSubTable(GLenum target, GLsizei start, GLsizei count, GLenum format, GLenum type, void const * data)} */
    public static void glColorSubTable(@NativeType("GLenum") int target, @NativeType("GLsizei") int start, @NativeType("GLsizei") int count, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long data) {
        nglColorSubTable(target, start, count, format, type, data);
    }

    // --- [ glCopyColorSubTable ] ---

    /** {@code void glCopyColorSubTable(GLenum target, GLsizei start, GLint x, GLint y, GLsizei width)} */
    public static native void glCopyColorSubTable(@NativeType("GLenum") int target, @NativeType("GLsizei") int start, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width);

    // --- [ glConvolutionFilter1D ] ---

    /** {@code void glConvolutionFilter1D(GLenum target, GLenum internalformat, GLsizei width, GLenum format, GLenum type, void const * data)} */
    public static native void nglConvolutionFilter1D(int target, int internalformat, int width, int format, int type, long data);

    /** {@code void glConvolutionFilter1D(GLenum target, GLenum internalformat, GLsizei width, GLenum format, GLenum type, void const * data)} */
    public static void glConvolutionFilter1D(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer data) {
        nglConvolutionFilter1D(target, internalformat, width, format, type, memAddress(data));
    }

    /** {@code void glConvolutionFilter1D(GLenum target, GLenum internalformat, GLsizei width, GLenum format, GLenum type, void const * data)} */
    public static void glConvolutionFilter1D(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long data) {
        nglConvolutionFilter1D(target, internalformat, width, format, type, data);
    }

    // --- [ glConvolutionFilter2D ] ---

    /** {@code void glConvolutionFilter2D(GLenum target, GLenum internalformat, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * data)} */
    public static native void nglConvolutionFilter2D(int target, int internalformat, int width, int height, int format, int type, long data);

    /** {@code void glConvolutionFilter2D(GLenum target, GLenum internalformat, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * data)} */
    public static void glConvolutionFilter2D(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer data) {
        nglConvolutionFilter2D(target, internalformat, width, height, format, type, memAddress(data));
    }

    /** {@code void glConvolutionFilter2D(GLenum target, GLenum internalformat, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * data)} */
    public static void glConvolutionFilter2D(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long data) {
        nglConvolutionFilter2D(target, internalformat, width, height, format, type, data);
    }

    // --- [ glCopyConvolutionFilter1D ] ---

    /** {@code void glCopyConvolutionFilter1D(GLenum target, GLenum internalformat, GLint x, GLint y, GLsizei width)} */
    public static native void glCopyConvolutionFilter1D(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width);

    // --- [ glCopyConvolutionFilter2D ] ---

    /** {@code void glCopyConvolutionFilter2D(GLenum target, GLenum internalformat, GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static native void glCopyConvolutionFilter2D(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glGetConvolutionFilter ] ---

    /** {@code void glGetConvolutionFilter(GLenum target, GLenum format, GLenum type, void * image)} */
    public static native void nglGetConvolutionFilter(int target, int format, int type, long image);

    /** {@code void glGetConvolutionFilter(GLenum target, GLenum format, GLenum type, void * image)} */
    public static void glGetConvolutionFilter(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer image) {
        nglGetConvolutionFilter(target, format, type, memAddress(image));
    }

    /** {@code void glGetConvolutionFilter(GLenum target, GLenum format, GLenum type, void * image)} */
    public static void glGetConvolutionFilter(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") long image) {
        nglGetConvolutionFilter(target, format, type, image);
    }

    // --- [ glSeparableFilter2D ] ---

    /** {@code void glSeparableFilter2D(GLenum target, GLenum internalformat, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * row, void const * column)} */
    public static native void nglSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, long row, long column);

    /** {@code void glSeparableFilter2D(GLenum target, GLenum internalformat, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * row, void const * column)} */
    public static void glSeparableFilter2D(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer row, @NativeType("void const *") ByteBuffer column) {
        nglSeparableFilter2D(target, internalformat, width, height, format, type, memAddress(row), memAddress(column));
    }

    /** {@code void glSeparableFilter2D(GLenum target, GLenum internalformat, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * row, void const * column)} */
    public static void glSeparableFilter2D(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long row, @NativeType("void const *") long column) {
        nglSeparableFilter2D(target, internalformat, width, height, format, type, row, column);
    }

    // --- [ glGetSeparableFilter ] ---

    /** {@code void glGetSeparableFilter(GLenum target, GLenum format, GLenum type, void * row, void * column, void * span)} */
    public static native void nglGetSeparableFilter(int target, int format, int type, long row, long column, long span);

    /** {@code void glGetSeparableFilter(GLenum target, GLenum format, GLenum type, void * row, void * column, void * span)} */
    public static void glGetSeparableFilter(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer row, @NativeType("void *") ByteBuffer column, @NativeType("void *") @Nullable ByteBuffer span) {
        nglGetSeparableFilter(target, format, type, memAddress(row), memAddress(column), memAddressSafe(span));
    }

    /** {@code void glGetSeparableFilter(GLenum target, GLenum format, GLenum type, void * row, void * column, void * span)} */
    public static void glGetSeparableFilter(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") long row, @NativeType("void *") long column, @NativeType("void *") @Nullable ByteBuffer span) {
        nglGetSeparableFilter(target, format, type, row, column, memAddressSafe(span));
    }

    // --- [ glConvolutionParameteri ] ---

    /** {@code void glConvolutionParameteri(GLenum target, GLenum pname, GLint param)} */
    public static native void glConvolutionParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint") int param);

    // --- [ glConvolutionParameteriv ] ---

    /** {@code void glConvolutionParameteriv(GLenum target, GLenum pname, GLint const * params)} */
    public static native void nglConvolutionParameteriv(int target, int pname, long params);

    /** {@code void glConvolutionParameteriv(GLenum target, GLenum pname, GLint const * params)} */
    public static void glConvolutionParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglConvolutionParameteriv(target, pname, memAddress(params));
    }

    // --- [ glConvolutionParameterf ] ---

    /** {@code void glConvolutionParameterf(GLenum target, GLenum pname, GLfloat param)} */
    public static native void glConvolutionParameterf(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param);

    // --- [ glConvolutionParameterfv ] ---

    /** {@code void glConvolutionParameterfv(GLenum target, GLenum pname, GLfloat const * params)} */
    public static native void nglConvolutionParameterfv(int target, int pname, long params);

    /** {@code void glConvolutionParameterfv(GLenum target, GLenum pname, GLfloat const * params)} */
    public static void glConvolutionParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglConvolutionParameterfv(target, pname, memAddress(params));
    }

    // --- [ glGetConvolutionParameteriv ] ---

    /** {@code void glGetConvolutionParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static native void nglGetConvolutionParameteriv(int target, int pname, long params);

    /** {@code void glGetConvolutionParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetConvolutionParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetConvolutionParameteriv(target, pname, memAddress(params));
    }

    /** {@code void glGetConvolutionParameteriv(GLenum target, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetConvolutionParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetConvolutionParameteriv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetConvolutionParameterfv ] ---

    /** {@code void glGetConvolutionParameterfv(GLenum target, GLenum pname, GLfloat * params)} */
    public static native void nglGetConvolutionParameterfv(int target, int pname, long params);

    /** {@code void glGetConvolutionParameterfv(GLenum target, GLenum pname, GLfloat * params)} */
    public static void glGetConvolutionParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetConvolutionParameterfv(target, pname, memAddress(params));
    }

    /** {@code void glGetConvolutionParameterfv(GLenum target, GLenum pname, GLfloat * params)} */
    @NativeType("void")
    public static float glGetConvolutionParameterf(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetConvolutionParameterfv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glHistogram ] ---

    /** {@code void glHistogram(GLenum target, GLsizei width, GLenum internalformat, GLboolean sink)} */
    public static native void glHistogram(@NativeType("GLenum") int target, @NativeType("GLsizei") int width, @NativeType("GLenum") int internalformat, @NativeType("GLboolean") boolean sink);

    // --- [ glResetHistogram ] ---

    /** {@code void glResetHistogram(GLenum target)} */
    public static native void glResetHistogram(@NativeType("GLenum") int target);

    // --- [ glGetHistogram ] ---

    /** {@code void glGetHistogram(GLenum target, GLboolean reset, GLenum format, GLenum type, void * values)} */
    public static native void nglGetHistogram(int target, boolean reset, int format, int type, long values);

    /** {@code void glGetHistogram(GLenum target, GLboolean reset, GLenum format, GLenum type, void * values)} */
    public static void glGetHistogram(@NativeType("GLenum") int target, @NativeType("GLboolean") boolean reset, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer values) {
        nglGetHistogram(target, reset, format, type, memAddress(values));
    }

    /** {@code void glGetHistogram(GLenum target, GLboolean reset, GLenum format, GLenum type, void * values)} */
    public static void glGetHistogram(@NativeType("GLenum") int target, @NativeType("GLboolean") boolean reset, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") long values) {
        nglGetHistogram(target, reset, format, type, values);
    }

    // --- [ glGetHistogramParameteriv ] ---

    /** {@code void glGetHistogramParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static native void nglGetHistogramParameteriv(int target, int pname, long params);

    /** {@code void glGetHistogramParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetHistogramParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetHistogramParameteriv(target, pname, memAddress(params));
    }

    /** {@code void glGetHistogramParameteriv(GLenum target, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetHistogramParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetHistogramParameteriv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetHistogramParameterfv ] ---

    /** {@code void glGetHistogramParameterfv(GLenum target, GLenum pname, GLfloat * params)} */
    public static native void nglGetHistogramParameterfv(int target, int pname, long params);

    /** {@code void glGetHistogramParameterfv(GLenum target, GLenum pname, GLfloat * params)} */
    public static void glGetHistogramParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetHistogramParameterfv(target, pname, memAddress(params));
    }

    /** {@code void glGetHistogramParameterfv(GLenum target, GLenum pname, GLfloat * params)} */
    @NativeType("void")
    public static float glGetHistogramParameterf(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetHistogramParameterfv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glMinmax ] ---

    /** {@code void glMinmax(GLenum target, GLenum internalformat, GLboolean sink)} */
    public static native void glMinmax(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLboolean") boolean sink);

    // --- [ glResetMinmax ] ---

    /** {@code void glResetMinmax(GLenum target)} */
    public static native void glResetMinmax(@NativeType("GLenum") int target);

    // --- [ glGetMinmax ] ---

    /** {@code void glGetMinmax(GLenum target, GLboolean reset, GLenum format, GLenum type, void * values)} */
    public static native void nglGetMinmax(int target, boolean reset, int format, int type, long values);

    /** {@code void glGetMinmax(GLenum target, GLboolean reset, GLenum format, GLenum type, void * values)} */
    public static void glGetMinmax(@NativeType("GLenum") int target, @NativeType("GLboolean") boolean reset, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer values) {
        nglGetMinmax(target, reset, format, type, memAddress(values));
    }

    /** {@code void glGetMinmax(GLenum target, GLboolean reset, GLenum format, GLenum type, void * values)} */
    public static void glGetMinmax(@NativeType("GLenum") int target, @NativeType("GLboolean") boolean reset, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") long values) {
        nglGetMinmax(target, reset, format, type, values);
    }

    // --- [ glGetMinmaxParameteriv ] ---

    /** {@code void glGetMinmaxParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static native void nglGetMinmaxParameteriv(int target, int pname, long params);

    /** {@code void glGetMinmaxParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetMinmaxParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMinmaxParameteriv(target, pname, memAddress(params));
    }

    /** {@code void glGetMinmaxParameteriv(GLenum target, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetMinmaxParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetMinmaxParameteriv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetMinmaxParameterfv ] ---

    /** {@code void glGetMinmaxParameterfv(GLenum target, GLenum pname, GLfloat * params)} */
    public static native void nglGetMinmaxParameterfv(int target, int pname, long params);

    /** {@code void glGetMinmaxParameterfv(GLenum target, GLenum pname, GLfloat * params)} */
    public static void glGetMinmaxParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMinmaxParameterfv(target, pname, memAddress(params));
    }

    /** {@code void glGetMinmaxParameterfv(GLenum target, GLenum pname, GLfloat * params)} */
    @NativeType("void")
    public static float glGetMinmaxParameterf(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetMinmaxParameterfv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glBlendColor ] ---

    /** {@code void glBlendColor(GLfloat red, GLfloat green, GLfloat blue, GLfloat alpha)} */
    public static void glBlendColor(@NativeType("GLfloat") float red, @NativeType("GLfloat") float green, @NativeType("GLfloat") float blue, @NativeType("GLfloat") float alpha) {
        GL14C.glBlendColor(red, green, blue, alpha);
    }

    // --- [ glBlendEquation ] ---

    /** {@code void glBlendEquation(GLenum mode)} */
    public static void glBlendEquation(@NativeType("GLenum") int mode) {
        GL14C.glBlendEquation(mode);
    }

    /** {@code void glColorTable(GLenum target, GLenum internalformat, GLsizei width, GLenum format, GLenum type, void const * table)} */
    public static void glColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] table) {
        long __functionAddress = GL.getICD().glColorTable;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, internalformat, width, format, type, table, __functionAddress);
    }

    /** {@code void glColorTable(GLenum target, GLenum internalformat, GLsizei width, GLenum format, GLenum type, void const * table)} */
    public static void glColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] table) {
        long __functionAddress = GL.getICD().glColorTable;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, internalformat, width, format, type, table, __functionAddress);
    }

    /** {@code void glColorTable(GLenum target, GLenum internalformat, GLsizei width, GLenum format, GLenum type, void const * table)} */
    public static void glColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] table) {
        long __functionAddress = GL.getICD().glColorTable;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, internalformat, width, format, type, table, __functionAddress);
    }

    /** {@code void glColorTableParameteriv(GLenum target, GLenum pname, GLint const * params)} */
    public static void glColorTableParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glColorTableParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glColorTableParameterfv(GLenum target, GLenum pname, GLfloat const * params)} */
    public static void glColorTableParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glColorTableParameterfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glGetColorTable(GLenum target, GLenum format, GLenum type, void * table)} */
    public static void glGetColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] table) {
        long __functionAddress = GL.getICD().glGetColorTable;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, format, type, table, __functionAddress);
    }

    /** {@code void glGetColorTable(GLenum target, GLenum format, GLenum type, void * table)} */
    public static void glGetColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] table) {
        long __functionAddress = GL.getICD().glGetColorTable;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, format, type, table, __functionAddress);
    }

    /** {@code void glGetColorTable(GLenum target, GLenum format, GLenum type, void * table)} */
    public static void glGetColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] table) {
        long __functionAddress = GL.getICD().glGetColorTable;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, format, type, table, __functionAddress);
    }

    /** {@code void glGetColorTableParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetColorTableParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetColorTableParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glGetColorTableParameterfv(GLenum target, GLenum pname, GLfloat * params)} */
    public static void glGetColorTableParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetColorTableParameterfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glConvolutionParameteriv(GLenum target, GLenum pname, GLint const * params)} */
    public static void glConvolutionParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glConvolutionParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glConvolutionParameterfv(GLenum target, GLenum pname, GLfloat const * params)} */
    public static void glConvolutionParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glConvolutionParameterfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glGetConvolutionParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetConvolutionParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetConvolutionParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glGetConvolutionParameterfv(GLenum target, GLenum pname, GLfloat * params)} */
    public static void glGetConvolutionParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetConvolutionParameterfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glGetHistogramParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetHistogramParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetHistogramParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glGetHistogramParameterfv(GLenum target, GLenum pname, GLfloat * params)} */
    public static void glGetHistogramParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetHistogramParameterfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glGetMinmaxParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetMinmaxParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetMinmaxParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glGetMinmaxParameterfv(GLenum target, GLenum pname, GLfloat * params)} */
    public static void glGetMinmaxParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetMinmaxParameterfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

}