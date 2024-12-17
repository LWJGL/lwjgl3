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

public class ARBRobustness {

    static { GL.initialize(); }

    public static final int
        GL_GUILTY_CONTEXT_RESET_ARB   = 0x8253,
        GL_INNOCENT_CONTEXT_RESET_ARB = 0x8254,
        GL_UNKNOWN_CONTEXT_RESET_ARB  = 0x8255;

    public static final int GL_RESET_NOTIFICATION_STRATEGY_ARB = 0x8256;

    public static final int
        GL_LOSE_CONTEXT_ON_RESET_ARB = 0x8252,
        GL_NO_RESET_NOTIFICATION_ARB = 0x8261;

    public static final int GL_CONTEXT_FLAG_ROBUST_ACCESS_BIT_ARB = 0x4;

    protected ARBRobustness() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetGraphicsResetStatusARB ] ---

    /** {@code GLenum glGetGraphicsResetStatusARB(void)} */
    @NativeType("GLenum")
    public static native int glGetGraphicsResetStatusARB();

    // --- [ glGetnMapdvARB ] ---

    /** {@code void glGetnMapdvARB(GLenum target, GLenum query, GLsizei bufSize, GLdouble * data)} */
    public static native void nglGetnMapdvARB(int target, int query, int bufSize, long data);

    /** {@code void glGetnMapdvARB(GLenum target, GLenum query, GLsizei bufSize, GLdouble * data)} */
    public static void glGetnMapdvARB(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLdouble *") DoubleBuffer data) {
        nglGetnMapdvARB(target, query, data.remaining(), memAddress(data));
    }

    /** {@code void glGetnMapdvARB(GLenum target, GLenum query, GLsizei bufSize, GLdouble * data)} */
    @NativeType("void")
    public static double glGetnMapdARB(@NativeType("GLenum") int target, @NativeType("GLenum") int query) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            DoubleBuffer data = stack.callocDouble(1);
            nglGetnMapdvARB(target, query, 1, memAddress(data));
            return data.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetnMapfvARB ] ---

    /** {@code void glGetnMapfvARB(GLenum target, GLenum query, GLsizei bufSize, GLfloat * data)} */
    public static native void nglGetnMapfvARB(int target, int query, int bufSize, long data);

    /** {@code void glGetnMapfvARB(GLenum target, GLenum query, GLsizei bufSize, GLfloat * data)} */
    public static void glGetnMapfvARB(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLfloat *") FloatBuffer data) {
        nglGetnMapfvARB(target, query, data.remaining(), memAddress(data));
    }

    /** {@code void glGetnMapfvARB(GLenum target, GLenum query, GLsizei bufSize, GLfloat * data)} */
    @NativeType("void")
    public static float glGetnMapfARB(@NativeType("GLenum") int target, @NativeType("GLenum") int query) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer data = stack.callocFloat(1);
            nglGetnMapfvARB(target, query, 1, memAddress(data));
            return data.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetnMapivARB ] ---

    /** {@code void glGetnMapivARB(GLenum target, GLenum query, GLsizei bufSize, GLint * data)} */
    public static native void nglGetnMapivARB(int target, int query, int bufSize, long data);

    /** {@code void glGetnMapivARB(GLenum target, GLenum query, GLsizei bufSize, GLint * data)} */
    public static void glGetnMapivARB(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLint *") IntBuffer data) {
        nglGetnMapivARB(target, query, data.remaining(), memAddress(data));
    }

    /** {@code void glGetnMapivARB(GLenum target, GLenum query, GLsizei bufSize, GLint * data)} */
    @NativeType("void")
    public static int glGetnMapiARB(@NativeType("GLenum") int target, @NativeType("GLenum") int query) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer data = stack.callocInt(1);
            nglGetnMapivARB(target, query, 1, memAddress(data));
            return data.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetnPixelMapfvARB ] ---

    /** {@code void glGetnPixelMapfvARB(GLenum map, GLsizei bufSize, GLfloat * data)} */
    public static native void nglGetnPixelMapfvARB(int map, int bufSize, long data);

    /** {@code void glGetnPixelMapfvARB(GLenum map, GLsizei bufSize, GLfloat * data)} */
    public static void glGetnPixelMapfvARB(@NativeType("GLenum") int map, @NativeType("GLfloat *") FloatBuffer data) {
        nglGetnPixelMapfvARB(map, data.remaining(), memAddress(data));
    }

    // --- [ glGetnPixelMapuivARB ] ---

    /** {@code void glGetnPixelMapuivARB(GLenum map, GLsizei bufSize, GLuint * data)} */
    public static native void nglGetnPixelMapuivARB(int map, int bufSize, long data);

    /** {@code void glGetnPixelMapuivARB(GLenum map, GLsizei bufSize, GLuint * data)} */
    public static void glGetnPixelMapuivARB(@NativeType("GLenum") int map, @NativeType("GLuint *") IntBuffer data) {
        nglGetnPixelMapuivARB(map, data.remaining(), memAddress(data));
    }

    // --- [ glGetnPixelMapusvARB ] ---

    /** {@code void glGetnPixelMapusvARB(GLenum map, GLsizei bufSize, GLushort * data)} */
    public static native void nglGetnPixelMapusvARB(int map, int bufSize, long data);

    /** {@code void glGetnPixelMapusvARB(GLenum map, GLsizei bufSize, GLushort * data)} */
    public static void glGetnPixelMapusvARB(@NativeType("GLenum") int map, @NativeType("GLushort *") ShortBuffer data) {
        nglGetnPixelMapusvARB(map, data.remaining(), memAddress(data));
    }

    // --- [ glGetnPolygonStippleARB ] ---

    /** {@code void glGetnPolygonStippleARB(GLsizei bufSize, GLubyte * pattern)} */
    public static native void nglGetnPolygonStippleARB(int bufSize, long pattern);

    /** {@code void glGetnPolygonStippleARB(GLsizei bufSize, GLubyte * pattern)} */
    public static void glGetnPolygonStippleARB(@NativeType("GLsizei") int bufSize, @NativeType("GLubyte *") long pattern) {
        nglGetnPolygonStippleARB(bufSize, pattern);
    }

    /** {@code void glGetnPolygonStippleARB(GLsizei bufSize, GLubyte * pattern)} */
    public static void glGetnPolygonStippleARB(@NativeType("GLubyte *") ByteBuffer pattern) {
        nglGetnPolygonStippleARB(pattern.remaining(), memAddress(pattern));
    }

    // --- [ glGetnTexImageARB ] ---

    /** {@code void glGetnTexImageARB(GLenum tex, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * img)} */
    public static native void nglGetnTexImageARB(int tex, int level, int format, int type, int bufSize, long img);

    /** {@code void glGetnTexImageARB(GLenum tex, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * img)} */
    public static void glGetnTexImageARB(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long img) {
        nglGetnTexImageARB(tex, level, format, type, bufSize, img);
    }

    /** {@code void glGetnTexImageARB(GLenum tex, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * img)} */
    public static void glGetnTexImageARB(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer img) {
        nglGetnTexImageARB(tex, level, format, type, img.remaining(), memAddress(img));
    }

    /** {@code void glGetnTexImageARB(GLenum tex, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * img)} */
    public static void glGetnTexImageARB(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer img) {
        nglGetnTexImageARB(tex, level, format, type, img.remaining() << 1, memAddress(img));
    }

    /** {@code void glGetnTexImageARB(GLenum tex, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * img)} */
    public static void glGetnTexImageARB(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer img) {
        nglGetnTexImageARB(tex, level, format, type, img.remaining() << 2, memAddress(img));
    }

    /** {@code void glGetnTexImageARB(GLenum tex, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * img)} */
    public static void glGetnTexImageARB(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer img) {
        nglGetnTexImageARB(tex, level, format, type, img.remaining() << 2, memAddress(img));
    }

    /** {@code void glGetnTexImageARB(GLenum tex, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * img)} */
    public static void glGetnTexImageARB(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") DoubleBuffer img) {
        nglGetnTexImageARB(tex, level, format, type, img.remaining() << 3, memAddress(img));
    }

    // --- [ glReadnPixelsARB ] ---

    /** {@code void glReadnPixelsARB(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * data)} */
    public static native void nglReadnPixelsARB(int x, int y, int width, int height, int format, int type, int bufSize, long data);

    /** {@code void glReadnPixelsARB(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * data)} */
    public static void glReadnPixelsARB(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long data) {
        nglReadnPixelsARB(x, y, width, height, format, type, bufSize, data);
    }

    /** {@code void glReadnPixelsARB(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * data)} */
    public static void glReadnPixelsARB(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer data) {
        nglReadnPixelsARB(x, y, width, height, format, type, data.remaining(), memAddress(data));
    }

    /** {@code void glReadnPixelsARB(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * data)} */
    public static void glReadnPixelsARB(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer data) {
        nglReadnPixelsARB(x, y, width, height, format, type, data.remaining() << 1, memAddress(data));
    }

    /** {@code void glReadnPixelsARB(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * data)} */
    public static void glReadnPixelsARB(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer data) {
        nglReadnPixelsARB(x, y, width, height, format, type, data.remaining() << 2, memAddress(data));
    }

    /** {@code void glReadnPixelsARB(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * data)} */
    public static void glReadnPixelsARB(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer data) {
        nglReadnPixelsARB(x, y, width, height, format, type, data.remaining() << 2, memAddress(data));
    }

    // --- [ glGetnColorTableARB ] ---

    /** {@code void glGetnColorTableARB(GLenum target, GLenum format, GLenum type, GLsizei bufSize, void * table)} */
    public static native void nglGetnColorTableARB(int target, int format, int type, int bufSize, long table);

    /** {@code void glGetnColorTableARB(GLenum target, GLenum format, GLenum type, GLsizei bufSize, void * table)} */
    public static void glGetnColorTableARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long table) {
        nglGetnColorTableARB(target, format, type, bufSize, table);
    }

    /** {@code void glGetnColorTableARB(GLenum target, GLenum format, GLenum type, GLsizei bufSize, void * table)} */
    public static void glGetnColorTableARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer table) {
        nglGetnColorTableARB(target, format, type, table.remaining(), memAddress(table));
    }

    /** {@code void glGetnColorTableARB(GLenum target, GLenum format, GLenum type, GLsizei bufSize, void * table)} */
    public static void glGetnColorTableARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer table) {
        nglGetnColorTableARB(target, format, type, table.remaining() << 1, memAddress(table));
    }

    /** {@code void glGetnColorTableARB(GLenum target, GLenum format, GLenum type, GLsizei bufSize, void * table)} */
    public static void glGetnColorTableARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer table) {
        nglGetnColorTableARB(target, format, type, table.remaining() << 2, memAddress(table));
    }

    /** {@code void glGetnColorTableARB(GLenum target, GLenum format, GLenum type, GLsizei bufSize, void * table)} */
    public static void glGetnColorTableARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer table) {
        nglGetnColorTableARB(target, format, type, table.remaining() << 2, memAddress(table));
    }

    // --- [ glGetnConvolutionFilterARB ] ---

    /** {@code void glGetnConvolutionFilterARB(GLenum target, GLenum format, GLenum type, GLsizei bufSize, void * image)} */
    public static native void nglGetnConvolutionFilterARB(int target, int format, int type, int bufSize, long image);

    /** {@code void glGetnConvolutionFilterARB(GLenum target, GLenum format, GLenum type, GLsizei bufSize, void * image)} */
    public static void glGetnConvolutionFilterARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long image) {
        nglGetnConvolutionFilterARB(target, format, type, bufSize, image);
    }

    /** {@code void glGetnConvolutionFilterARB(GLenum target, GLenum format, GLenum type, GLsizei bufSize, void * image)} */
    public static void glGetnConvolutionFilterARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer image) {
        nglGetnConvolutionFilterARB(target, format, type, image.remaining(), memAddress(image));
    }

    // --- [ glGetnSeparableFilterARB ] ---

    /** {@code void glGetnSeparableFilterARB(GLenum target, GLenum format, GLenum type, GLsizei rowBufSize, void * row, GLsizei columnBufSize, void * column, void * span)} */
    public static native void nglGetnSeparableFilterARB(int target, int format, int type, int rowBufSize, long row, int columnBufSize, long column, long span);

    /** {@code void glGetnSeparableFilterARB(GLenum target, GLenum format, GLenum type, GLsizei rowBufSize, void * row, GLsizei columnBufSize, void * column, void * span)} */
    public static void glGetnSeparableFilterARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int rowBufSize, @NativeType("void *") long row, @NativeType("GLsizei") int columnBufSize, @NativeType("void *") long column, @NativeType("void *") @Nullable ByteBuffer span) {
        nglGetnSeparableFilterARB(target, format, type, rowBufSize, row, columnBufSize, column, memAddressSafe(span));
    }

    /** {@code void glGetnSeparableFilterARB(GLenum target, GLenum format, GLenum type, GLsizei rowBufSize, void * row, GLsizei columnBufSize, void * column, void * span)} */
    public static void glGetnSeparableFilterARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer row, @NativeType("void *") ByteBuffer column, @NativeType("void *") @Nullable ByteBuffer span) {
        nglGetnSeparableFilterARB(target, format, type, row.remaining(), memAddress(row), column.remaining(), memAddress(column), memAddressSafe(span));
    }

    // --- [ glGetnHistogramARB ] ---

    /** {@code void glGetnHistogramARB(GLenum target, GLboolean reset, GLenum format, GLenum type, GLsizei bufSize, void * values)} */
    public static native void nglGetnHistogramARB(int target, boolean reset, int format, int type, int bufSize, long values);

    /** {@code void glGetnHistogramARB(GLenum target, GLboolean reset, GLenum format, GLenum type, GLsizei bufSize, void * values)} */
    public static void glGetnHistogramARB(@NativeType("GLenum") int target, @NativeType("GLboolean") boolean reset, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long values) {
        nglGetnHistogramARB(target, reset, format, type, bufSize, values);
    }

    /** {@code void glGetnHistogramARB(GLenum target, GLboolean reset, GLenum format, GLenum type, GLsizei bufSize, void * values)} */
    public static void glGetnHistogramARB(@NativeType("GLenum") int target, @NativeType("GLboolean") boolean reset, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer values) {
        nglGetnHistogramARB(target, reset, format, type, values.remaining(), memAddress(values));
    }

    // --- [ glGetnMinmaxARB ] ---

    /** {@code void glGetnMinmaxARB(GLenum target, GLboolean reset, GLenum format, GLenum type, GLsizei bufSize, void * values)} */
    public static native void nglGetnMinmaxARB(int target, boolean reset, int format, int type, int bufSize, long values);

    /** {@code void glGetnMinmaxARB(GLenum target, GLboolean reset, GLenum format, GLenum type, GLsizei bufSize, void * values)} */
    public static void glGetnMinmaxARB(@NativeType("GLenum") int target, @NativeType("GLboolean") boolean reset, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long values) {
        nglGetnMinmaxARB(target, reset, format, type, bufSize, values);
    }

    /** {@code void glGetnMinmaxARB(GLenum target, GLboolean reset, GLenum format, GLenum type, GLsizei bufSize, void * values)} */
    public static void glGetnMinmaxARB(@NativeType("GLenum") int target, @NativeType("GLboolean") boolean reset, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer values) {
        nglGetnMinmaxARB(target, reset, format, type, values.remaining(), memAddress(values));
    }

    // --- [ glGetnCompressedTexImageARB ] ---

    /** {@code void glGetnCompressedTexImageARB(GLenum target, GLint level, GLsizei bufSize, void * img)} */
    public static native void nglGetnCompressedTexImageARB(int target, int level, int bufSize, long img);

    /** {@code void glGetnCompressedTexImageARB(GLenum target, GLint level, GLsizei bufSize, void * img)} */
    public static void glGetnCompressedTexImageARB(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLsizei") int bufSize, @NativeType("void *") long img) {
        nglGetnCompressedTexImageARB(target, level, bufSize, img);
    }

    /** {@code void glGetnCompressedTexImageARB(GLenum target, GLint level, GLsizei bufSize, void * img)} */
    public static void glGetnCompressedTexImageARB(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("void *") ByteBuffer img) {
        if (CHECKS) {
            if (DEBUG) {
                check(img, GL11.glGetTexLevelParameteri(target, level, GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE));
            }
        }
        nglGetnCompressedTexImageARB(target, level, img.remaining(), memAddress(img));
    }

    // --- [ glGetnUniformfvARB ] ---

    /** {@code void glGetnUniformfvARB(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    public static native void nglGetnUniformfvARB(int program, int location, int bufSize, long params);

    /** {@code void glGetnUniformfvARB(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    public static void glGetnUniformfvARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") FloatBuffer params) {
        nglGetnUniformfvARB(program, location, params.remaining(), memAddress(params));
    }

    /** {@code void glGetnUniformfvARB(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    @NativeType("void")
    public static float glGetnUniformfARB(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetnUniformfvARB(program, location, 1, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetnUniformivARB ] ---

    /** {@code void glGetnUniformivARB(GLuint program, GLint location, GLsizei bufSize, GLint * params)} */
    public static native void nglGetnUniformivARB(int program, int location, int bufSize, long params);

    /** {@code void glGetnUniformivARB(GLuint program, GLint location, GLsizei bufSize, GLint * params)} */
    public static void glGetnUniformivARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint *") IntBuffer params) {
        nglGetnUniformivARB(program, location, params.remaining(), memAddress(params));
    }

    /** {@code void glGetnUniformivARB(GLuint program, GLint location, GLsizei bufSize, GLint * params)} */
    @NativeType("void")
    public static int glGetnUniformiARB(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetnUniformivARB(program, location, 1, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetnUniformuivARB ] ---

    /** {@code void glGetnUniformuivARB(GLuint program, GLint location, GLsizei bufSize, GLuint * params)} */
    public static native void nglGetnUniformuivARB(int program, int location, int bufSize, long params);

    /** {@code void glGetnUniformuivARB(GLuint program, GLint location, GLsizei bufSize, GLuint * params)} */
    public static void glGetnUniformuivARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint *") IntBuffer params) {
        nglGetnUniformuivARB(program, location, params.remaining(), memAddress(params));
    }

    /** {@code void glGetnUniformuivARB(GLuint program, GLint location, GLsizei bufSize, GLuint * params)} */
    @NativeType("void")
    public static int glGetnUniformuiARB(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetnUniformuivARB(program, location, 1, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetnUniformdvARB ] ---

    /** {@code void glGetnUniformdvARB(GLuint program, GLint location, GLsizei bufSize, GLdouble * params)} */
    public static native void nglGetnUniformdvARB(int program, int location, int bufSize, long params);

    /** {@code void glGetnUniformdvARB(GLuint program, GLint location, GLsizei bufSize, GLdouble * params)} */
    public static void glGetnUniformdvARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble *") DoubleBuffer params) {
        nglGetnUniformdvARB(program, location, params.remaining(), memAddress(params));
    }

    /** {@code void glGetnUniformdvARB(GLuint program, GLint location, GLsizei bufSize, GLdouble * params)} */
    @NativeType("void")
    public static double glGetnUniformdARB(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            DoubleBuffer params = stack.callocDouble(1);
            nglGetnUniformdvARB(program, location, 1, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetnMapdvARB(GLenum target, GLenum query, GLsizei bufSize, GLdouble * data)} */
    public static void glGetnMapdvARB(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLdouble *") double[] data) {
        long __functionAddress = GL.getICD().glGetnMapdvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, query, data.length, data, __functionAddress);
    }

    /** {@code void glGetnMapfvARB(GLenum target, GLenum query, GLsizei bufSize, GLfloat * data)} */
    public static void glGetnMapfvARB(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLfloat *") float[] data) {
        long __functionAddress = GL.getICD().glGetnMapfvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, query, data.length, data, __functionAddress);
    }

    /** {@code void glGetnMapivARB(GLenum target, GLenum query, GLsizei bufSize, GLint * data)} */
    public static void glGetnMapivARB(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLint *") int[] data) {
        long __functionAddress = GL.getICD().glGetnMapivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, query, data.length, data, __functionAddress);
    }

    /** {@code void glGetnPixelMapfvARB(GLenum map, GLsizei bufSize, GLfloat * data)} */
    public static void glGetnPixelMapfvARB(@NativeType("GLenum") int map, @NativeType("GLfloat *") float[] data) {
        long __functionAddress = GL.getICD().glGetnPixelMapfvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(map, data.length, data, __functionAddress);
    }

    /** {@code void glGetnPixelMapuivARB(GLenum map, GLsizei bufSize, GLuint * data)} */
    public static void glGetnPixelMapuivARB(@NativeType("GLenum") int map, @NativeType("GLuint *") int[] data) {
        long __functionAddress = GL.getICD().glGetnPixelMapuivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(map, data.length, data, __functionAddress);
    }

    /** {@code void glGetnPixelMapusvARB(GLenum map, GLsizei bufSize, GLushort * data)} */
    public static void glGetnPixelMapusvARB(@NativeType("GLenum") int map, @NativeType("GLushort *") short[] data) {
        long __functionAddress = GL.getICD().glGetnPixelMapusvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(map, data.length, data, __functionAddress);
    }

    /** {@code void glGetnTexImageARB(GLenum tex, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * img)} */
    public static void glGetnTexImageARB(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] img) {
        long __functionAddress = GL.getICD().glGetnTexImageARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(tex, level, format, type, img.length << 1, img, __functionAddress);
    }

    /** {@code void glGetnTexImageARB(GLenum tex, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * img)} */
    public static void glGetnTexImageARB(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] img) {
        long __functionAddress = GL.getICD().glGetnTexImageARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(tex, level, format, type, img.length << 2, img, __functionAddress);
    }

    /** {@code void glGetnTexImageARB(GLenum tex, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * img)} */
    public static void glGetnTexImageARB(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] img) {
        long __functionAddress = GL.getICD().glGetnTexImageARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(tex, level, format, type, img.length << 2, img, __functionAddress);
    }

    /** {@code void glGetnTexImageARB(GLenum tex, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * img)} */
    public static void glGetnTexImageARB(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") double[] img) {
        long __functionAddress = GL.getICD().glGetnTexImageARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(tex, level, format, type, img.length << 3, img, __functionAddress);
    }

    /** {@code void glReadnPixelsARB(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * data)} */
    public static void glReadnPixelsARB(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] data) {
        long __functionAddress = GL.getICD().glReadnPixelsARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(x, y, width, height, format, type, data.length << 1, data, __functionAddress);
    }

    /** {@code void glReadnPixelsARB(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * data)} */
    public static void glReadnPixelsARB(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] data) {
        long __functionAddress = GL.getICD().glReadnPixelsARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(x, y, width, height, format, type, data.length << 2, data, __functionAddress);
    }

    /** {@code void glReadnPixelsARB(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * data)} */
    public static void glReadnPixelsARB(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] data) {
        long __functionAddress = GL.getICD().glReadnPixelsARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(x, y, width, height, format, type, data.length << 2, data, __functionAddress);
    }

    /** {@code void glGetnColorTableARB(GLenum target, GLenum format, GLenum type, GLsizei bufSize, void * table)} */
    public static void glGetnColorTableARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] table) {
        long __functionAddress = GL.getICD().glGetnColorTableARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, format, type, table.length << 1, table, __functionAddress);
    }

    /** {@code void glGetnColorTableARB(GLenum target, GLenum format, GLenum type, GLsizei bufSize, void * table)} */
    public static void glGetnColorTableARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] table) {
        long __functionAddress = GL.getICD().glGetnColorTableARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, format, type, table.length << 2, table, __functionAddress);
    }

    /** {@code void glGetnColorTableARB(GLenum target, GLenum format, GLenum type, GLsizei bufSize, void * table)} */
    public static void glGetnColorTableARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] table) {
        long __functionAddress = GL.getICD().glGetnColorTableARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, format, type, table.length << 2, table, __functionAddress);
    }

    /** {@code void glGetnUniformfvARB(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    public static void glGetnUniformfvARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetnUniformfvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params.length, params, __functionAddress);
    }

    /** {@code void glGetnUniformivARB(GLuint program, GLint location, GLsizei bufSize, GLint * params)} */
    public static void glGetnUniformivARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetnUniformivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params.length, params, __functionAddress);
    }

    /** {@code void glGetnUniformuivARB(GLuint program, GLint location, GLsizei bufSize, GLuint * params)} */
    public static void glGetnUniformuivARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glGetnUniformuivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params.length, params, __functionAddress);
    }

    /** {@code void glGetnUniformdvARB(GLuint program, GLint location, GLsizei bufSize, GLdouble * params)} */
    public static void glGetnUniformdvARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble *") double[] params) {
        long __functionAddress = GL.getICD().glGetnUniformdvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params.length, params, __functionAddress);
    }

}