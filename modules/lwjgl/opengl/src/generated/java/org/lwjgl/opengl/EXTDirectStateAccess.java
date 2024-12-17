/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTDirectStateAccess {

    static { GL.initialize(); }

    public static final int
        GL_PROGRAM_MATRIX_EXT             = 0x8E2D,
        GL_TRANSPOSE_PROGRAM_MATRIX_EXT   = 0x8E2E,
        GL_PROGRAM_MATRIX_STACK_DEPTH_EXT = 0x8E2F;

    protected EXTDirectStateAccess() {
        throw new UnsupportedOperationException();
    }

    // --- [ glClientAttribDefaultEXT ] ---

    /** {@code void glClientAttribDefaultEXT(GLbitfield mask)} */
    public static native void glClientAttribDefaultEXT(@NativeType("GLbitfield") int mask);

    // --- [ glPushClientAttribDefaultEXT ] ---

    /** {@code void glPushClientAttribDefaultEXT(GLbitfield mask)} */
    public static native void glPushClientAttribDefaultEXT(@NativeType("GLbitfield") int mask);

    // --- [ glMatrixLoadfEXT ] ---

    /** {@code void glMatrixLoadfEXT(GLenum matrixMode, GLfloat const * m)} */
    public static native void nglMatrixLoadfEXT(int matrixMode, long m);

    /** {@code void glMatrixLoadfEXT(GLenum matrixMode, GLfloat const * m)} */
    public static void glMatrixLoadfEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") FloatBuffer m) {
        if (CHECKS) {
            check(m, 16);
        }
        nglMatrixLoadfEXT(matrixMode, memAddress(m));
    }

    // --- [ glMatrixLoaddEXT ] ---

    /** {@code void glMatrixLoaddEXT(GLenum matrixMode, GLdouble const * m)} */
    public static native void nglMatrixLoaddEXT(int matrixMode, long m);

    /** {@code void glMatrixLoaddEXT(GLenum matrixMode, GLdouble const * m)} */
    public static void glMatrixLoaddEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLdouble const *") DoubleBuffer m) {
        if (CHECKS) {
            check(m, 16);
        }
        nglMatrixLoaddEXT(matrixMode, memAddress(m));
    }

    // --- [ glMatrixMultfEXT ] ---

    /** {@code void glMatrixMultfEXT(GLenum matrixMode, GLfloat const * m)} */
    public static native void nglMatrixMultfEXT(int matrixMode, long m);

    /** {@code void glMatrixMultfEXT(GLenum matrixMode, GLfloat const * m)} */
    public static void glMatrixMultfEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") FloatBuffer m) {
        if (CHECKS) {
            check(m, 16);
        }
        nglMatrixMultfEXT(matrixMode, memAddress(m));
    }

    // --- [ glMatrixMultdEXT ] ---

    /** {@code void glMatrixMultdEXT(GLenum matrixMode, GLdouble const * m)} */
    public static native void nglMatrixMultdEXT(int matrixMode, long m);

    /** {@code void glMatrixMultdEXT(GLenum matrixMode, GLdouble const * m)} */
    public static void glMatrixMultdEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLdouble const *") DoubleBuffer m) {
        if (CHECKS) {
            check(m, 16);
        }
        nglMatrixMultdEXT(matrixMode, memAddress(m));
    }

    // --- [ glMatrixLoadIdentityEXT ] ---

    /** {@code void glMatrixLoadIdentityEXT(GLenum matrixMode)} */
    public static native void glMatrixLoadIdentityEXT(@NativeType("GLenum") int matrixMode);

    // --- [ glMatrixRotatefEXT ] ---

    /** {@code void glMatrixRotatefEXT(GLenum matrixMode, GLfloat angle, GLfloat x, GLfloat y, GLfloat z)} */
    public static native void glMatrixRotatefEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat") float angle, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z);

    // --- [ glMatrixRotatedEXT ] ---

    /** {@code void glMatrixRotatedEXT(GLenum matrixMode, GLdouble angle, GLdouble x, GLdouble y, GLdouble z)} */
    public static native void glMatrixRotatedEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLdouble") double angle, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z);

    // --- [ glMatrixScalefEXT ] ---

    /** {@code void glMatrixScalefEXT(GLenum matrixMode, GLfloat x, GLfloat y, GLfloat z)} */
    public static native void glMatrixScalefEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z);

    // --- [ glMatrixScaledEXT ] ---

    /** {@code void glMatrixScaledEXT(GLenum matrixMode, GLdouble x, GLdouble y, GLdouble z)} */
    public static native void glMatrixScaledEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z);

    // --- [ glMatrixTranslatefEXT ] ---

    /** {@code void glMatrixTranslatefEXT(GLenum matrixMode, GLfloat x, GLfloat y, GLfloat z)} */
    public static native void glMatrixTranslatefEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z);

    // --- [ glMatrixTranslatedEXT ] ---

    /** {@code void glMatrixTranslatedEXT(GLenum matrixMode, GLdouble x, GLdouble y, GLdouble z)} */
    public static native void glMatrixTranslatedEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z);

    // --- [ glMatrixOrthoEXT ] ---

    /** {@code void glMatrixOrthoEXT(GLenum matrixMode, GLdouble l, GLdouble r, GLdouble b, GLdouble t, GLdouble n, GLdouble f)} */
    public static native void glMatrixOrthoEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLdouble") double l, @NativeType("GLdouble") double r, @NativeType("GLdouble") double b, @NativeType("GLdouble") double t, @NativeType("GLdouble") double n, @NativeType("GLdouble") double f);

    // --- [ glMatrixFrustumEXT ] ---

    /** {@code void glMatrixFrustumEXT(GLenum matrixMode, GLdouble l, GLdouble r, GLdouble b, GLdouble t, GLdouble n, GLdouble f)} */
    public static native void glMatrixFrustumEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLdouble") double l, @NativeType("GLdouble") double r, @NativeType("GLdouble") double b, @NativeType("GLdouble") double t, @NativeType("GLdouble") double n, @NativeType("GLdouble") double f);

    // --- [ glMatrixPushEXT ] ---

    /** {@code void glMatrixPushEXT(GLenum matrixMode)} */
    public static native void glMatrixPushEXT(@NativeType("GLenum") int matrixMode);

    // --- [ glMatrixPopEXT ] ---

    /** {@code void glMatrixPopEXT(GLenum matrixMode)} */
    public static native void glMatrixPopEXT(@NativeType("GLenum") int matrixMode);

    // --- [ glTextureParameteriEXT ] ---

    /** {@code void glTextureParameteriEXT(GLuint texture, GLenum target, GLenum pname, GLint param)} */
    public static native void glTextureParameteriEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint") int param);

    // --- [ glTextureParameterivEXT ] ---

    /** {@code void glTextureParameterivEXT(GLuint texture, GLenum target, GLenum pname, GLint const * param)} */
    public static native void nglTextureParameterivEXT(int texture, int target, int pname, long param);

    /** {@code void glTextureParameterivEXT(GLuint texture, GLenum target, GLenum pname, GLint const * param)} */
    public static void glTextureParameterivEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer param) {
        if (CHECKS) {
            check(param, 4);
        }
        nglTextureParameterivEXT(texture, target, pname, memAddress(param));
    }

    // --- [ glTextureParameterfEXT ] ---

    /** {@code void glTextureParameterfEXT(GLuint texture, GLenum target, GLenum pname, GLfloat param)} */
    public static native void glTextureParameterfEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param);

    // --- [ glTextureParameterfvEXT ] ---

    /** {@code void glTextureParameterfvEXT(GLuint texture, GLenum target, GLenum pname, GLfloat const * param)} */
    public static native void nglTextureParameterfvEXT(int texture, int target, int pname, long param);

    /** {@code void glTextureParameterfvEXT(GLuint texture, GLenum target, GLenum pname, GLfloat const * param)} */
    public static void glTextureParameterfvEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer param) {
        if (CHECKS) {
            check(param, 4);
        }
        nglTextureParameterfvEXT(texture, target, pname, memAddress(param));
    }

    // --- [ glTextureImage1DEXT ] ---

    /** {@code void glTextureImage1DEXT(GLuint texture, GLenum target, GLint level, GLint internalformat, GLsizei width, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static native void nglTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, long pixels);

    /** {@code void glTextureImage1DEXT(GLuint texture, GLenum target, GLint level, GLint internalformat, GLsizei width, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ByteBuffer pixels) {
        nglTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glTextureImage1DEXT(GLuint texture, GLenum target, GLint level, GLint internalformat, GLsizei width, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, pixels);
    }

    /** {@code void glTextureImage1DEXT(GLuint texture, GLenum target, GLint level, GLint internalformat, GLsizei width, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ShortBuffer pixels) {
        nglTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glTextureImage1DEXT(GLuint texture, GLenum target, GLint level, GLint internalformat, GLsizei width, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable IntBuffer pixels) {
        nglTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glTextureImage1DEXT(GLuint texture, GLenum target, GLint level, GLint internalformat, GLsizei width, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable FloatBuffer pixels) {
        nglTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glTextureImage1DEXT(GLuint texture, GLenum target, GLint level, GLint internalformat, GLsizei width, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable DoubleBuffer pixels) {
        nglTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
    }

    // --- [ glTextureImage2DEXT ] ---

    /** {@code void glTextureImage2DEXT(GLuint texture, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static native void nglTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels);

    /** {@code void glTextureImage2DEXT(GLuint texture, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ByteBuffer pixels) {
        nglTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glTextureImage2DEXT(GLuint texture, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, pixels);
    }

    /** {@code void glTextureImage2DEXT(GLuint texture, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ShortBuffer pixels) {
        nglTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glTextureImage2DEXT(GLuint texture, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable IntBuffer pixels) {
        nglTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glTextureImage2DEXT(GLuint texture, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable FloatBuffer pixels) {
        nglTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glTextureImage2DEXT(GLuint texture, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable DoubleBuffer pixels) {
        nglTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    // --- [ glTextureSubImage1DEXT ] ---

    /** {@code void glTextureSubImage1DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static native void nglTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, long pixels);

    /** {@code void glTextureSubImage1DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        nglTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, memAddress(pixels));
    }

    /** {@code void glTextureSubImage1DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, pixels);
    }

    /** {@code void glTextureSubImage1DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        nglTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, memAddress(pixels));
    }

    /** {@code void glTextureSubImage1DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        nglTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, memAddress(pixels));
    }

    /** {@code void glTextureSubImage1DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        nglTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, memAddress(pixels));
    }

    /** {@code void glTextureSubImage1DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") DoubleBuffer pixels) {
        nglTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, memAddress(pixels));
    }

    // --- [ glTextureSubImage2DEXT ] ---

    /** {@code void glTextureSubImage2DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static native void nglTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels);

    /** {@code void glTextureSubImage2DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        nglTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    /** {@code void glTextureSubImage2DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /** {@code void glTextureSubImage2DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        nglTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    /** {@code void glTextureSubImage2DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        nglTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    /** {@code void glTextureSubImage2DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        nglTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    /** {@code void glTextureSubImage2DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") DoubleBuffer pixels) {
        nglTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    // --- [ glCopyTextureImage1DEXT ] ---

    /** {@code void glCopyTextureImage1DEXT(GLuint texture, GLenum target, GLint level, GLenum internalformat, GLint x, GLint y, GLsizei width, GLint border)} */
    public static native void glCopyTextureImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLint") int border);

    // --- [ glCopyTextureImage2DEXT ] ---

    /** {@code void glCopyTextureImage2DEXT(GLuint texture, GLenum target, GLint level, GLenum internalformat, GLint x, GLint y, GLsizei width, GLsizei height, GLint border)} */
    public static native void glCopyTextureImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border);

    // --- [ glCopyTextureSubImage1DEXT ] ---

    /** {@code void glCopyTextureSubImage1DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLint x, GLint y, GLsizei width)} */
    public static native void glCopyTextureSubImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width);

    // --- [ glCopyTextureSubImage2DEXT ] ---

    /** {@code void glCopyTextureSubImage2DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static native void glCopyTextureSubImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glGetTextureImageEXT ] ---

    /** {@code void glGetTextureImageEXT(GLuint texture, GLenum target, GLint level, GLenum format, GLenum type, void * pixels)} */
    public static native void nglGetTextureImageEXT(int texture, int target, int level, int format, int type, long pixels);

    /** {@code void glGetTextureImageEXT(GLuint texture, GLenum target, GLint level, GLenum format, GLenum type, void * pixels)} */
    public static void glGetTextureImageEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer pixels) {
        nglGetTextureImageEXT(texture, target, level, format, type, memAddress(pixels));
    }

    /** {@code void glGetTextureImageEXT(GLuint texture, GLenum target, GLint level, GLenum format, GLenum type, void * pixels)} */
    public static void glGetTextureImageEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") long pixels) {
        nglGetTextureImageEXT(texture, target, level, format, type, pixels);
    }

    /** {@code void glGetTextureImageEXT(GLuint texture, GLenum target, GLint level, GLenum format, GLenum type, void * pixels)} */
    public static void glGetTextureImageEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer pixels) {
        nglGetTextureImageEXT(texture, target, level, format, type, memAddress(pixels));
    }

    /** {@code void glGetTextureImageEXT(GLuint texture, GLenum target, GLint level, GLenum format, GLenum type, void * pixels)} */
    public static void glGetTextureImageEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer pixels) {
        nglGetTextureImageEXT(texture, target, level, format, type, memAddress(pixels));
    }

    /** {@code void glGetTextureImageEXT(GLuint texture, GLenum target, GLint level, GLenum format, GLenum type, void * pixels)} */
    public static void glGetTextureImageEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer pixels) {
        nglGetTextureImageEXT(texture, target, level, format, type, memAddress(pixels));
    }

    /** {@code void glGetTextureImageEXT(GLuint texture, GLenum target, GLint level, GLenum format, GLenum type, void * pixels)} */
    public static void glGetTextureImageEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") DoubleBuffer pixels) {
        nglGetTextureImageEXT(texture, target, level, format, type, memAddress(pixels));
    }

    // --- [ glGetTextureParameterfvEXT ] ---

    /** {@code void glGetTextureParameterfvEXT(GLuint texture, GLenum target, GLenum pname, GLfloat * params)} */
    public static native void nglGetTextureParameterfvEXT(int texture, int target, int pname, long params);

    /** {@code void glGetTextureParameterfvEXT(GLuint texture, GLenum target, GLenum pname, GLfloat * params)} */
    public static void glGetTextureParameterfvEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTextureParameterfvEXT(texture, target, pname, memAddress(params));
    }

    /** {@code void glGetTextureParameterfvEXT(GLuint texture, GLenum target, GLenum pname, GLfloat * params)} */
    @NativeType("void")
    public static float glGetTextureParameterfEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetTextureParameterfvEXT(texture, target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTextureParameterivEXT ] ---

    /** {@code void glGetTextureParameterivEXT(GLuint texture, GLenum target, GLenum pname, GLint * params)} */
    public static native void nglGetTextureParameterivEXT(int texture, int target, int pname, long params);

    /** {@code void glGetTextureParameterivEXT(GLuint texture, GLenum target, GLenum pname, GLint * params)} */
    public static void glGetTextureParameterivEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTextureParameterivEXT(texture, target, pname, memAddress(params));
    }

    /** {@code void glGetTextureParameterivEXT(GLuint texture, GLenum target, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetTextureParameteriEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTextureParameterivEXT(texture, target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTextureLevelParameterfvEXT ] ---

    /** {@code void glGetTextureLevelParameterfvEXT(GLuint texture, GLenum target, GLint level, GLenum pname, GLfloat * params)} */
    public static native void nglGetTextureLevelParameterfvEXT(int texture, int target, int level, int pname, long params);

    /** {@code void glGetTextureLevelParameterfvEXT(GLuint texture, GLenum target, GLint level, GLenum pname, GLfloat * params)} */
    public static void glGetTextureLevelParameterfvEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTextureLevelParameterfvEXT(texture, target, level, pname, memAddress(params));
    }

    /** {@code void glGetTextureLevelParameterfvEXT(GLuint texture, GLenum target, GLint level, GLenum pname, GLfloat * params)} */
    @NativeType("void")
    public static float glGetTextureLevelParameterfEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetTextureLevelParameterfvEXT(texture, target, level, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTextureLevelParameterivEXT ] ---

    /** {@code void glGetTextureLevelParameterivEXT(GLuint texture, GLenum target, GLint level, GLenum pname, GLint * params)} */
    public static native void nglGetTextureLevelParameterivEXT(int texture, int target, int level, int pname, long params);

    /** {@code void glGetTextureLevelParameterivEXT(GLuint texture, GLenum target, GLint level, GLenum pname, GLint * params)} */
    public static void glGetTextureLevelParameterivEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTextureLevelParameterivEXT(texture, target, level, pname, memAddress(params));
    }

    /** {@code void glGetTextureLevelParameterivEXT(GLuint texture, GLenum target, GLint level, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetTextureLevelParameteriEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTextureLevelParameterivEXT(texture, target, level, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glTextureImage3DEXT ] ---

    /** {@code void glTextureImage3DEXT(GLuint texture, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static native void nglTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels);

    /** {@code void glTextureImage3DEXT(GLuint texture, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ByteBuffer pixels) {
        nglTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glTextureImage3DEXT(GLuint texture, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    /** {@code void glTextureImage3DEXT(GLuint texture, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ShortBuffer pixels) {
        nglTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glTextureImage3DEXT(GLuint texture, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable IntBuffer pixels) {
        nglTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glTextureImage3DEXT(GLuint texture, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable FloatBuffer pixels) {
        nglTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glTextureImage3DEXT(GLuint texture, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable DoubleBuffer pixels) {
        nglTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    // --- [ glTextureSubImage3DEXT ] ---

    /** {@code void glTextureSubImage3DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static native void nglTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels);

    /** {@code void glTextureSubImage3DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        nglTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    /** {@code void glTextureSubImage3DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    /** {@code void glTextureSubImage3DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        nglTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    /** {@code void glTextureSubImage3DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        nglTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    /** {@code void glTextureSubImage3DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        nglTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    /** {@code void glTextureSubImage3DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") DoubleBuffer pixels) {
        nglTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    // --- [ glCopyTextureSubImage3DEXT ] ---

    /** {@code void glCopyTextureSubImage3DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static native void glCopyTextureSubImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glBindMultiTextureEXT ] ---

    /** {@code void glBindMultiTextureEXT(GLenum texunit, GLenum target, GLuint texture)} */
    public static native void glBindMultiTextureEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLuint") int texture);

    // --- [ glMultiTexCoordPointerEXT ] ---

    /** {@code void glMultiTexCoordPointerEXT(GLenum texunit, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static native void nglMultiTexCoordPointerEXT(int texunit, int size, int type, int stride, long pointer);

    /** {@code void glMultiTexCoordPointerEXT(GLenum texunit, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glMultiTexCoordPointerEXT(@NativeType("GLenum") int texunit, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        nglMultiTexCoordPointerEXT(texunit, size, type, stride, memAddress(pointer));
    }

    /** {@code void glMultiTexCoordPointerEXT(GLenum texunit, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glMultiTexCoordPointerEXT(@NativeType("GLenum") int texunit, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        nglMultiTexCoordPointerEXT(texunit, size, type, stride, pointer);
    }

    /** {@code void glMultiTexCoordPointerEXT(GLenum texunit, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glMultiTexCoordPointerEXT(@NativeType("GLenum") int texunit, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        nglMultiTexCoordPointerEXT(texunit, size, type, stride, memAddress(pointer));
    }

    /** {@code void glMultiTexCoordPointerEXT(GLenum texunit, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glMultiTexCoordPointerEXT(@NativeType("GLenum") int texunit, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        nglMultiTexCoordPointerEXT(texunit, size, type, stride, memAddress(pointer));
    }

    /** {@code void glMultiTexCoordPointerEXT(GLenum texunit, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glMultiTexCoordPointerEXT(@NativeType("GLenum") int texunit, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") FloatBuffer pointer) {
        nglMultiTexCoordPointerEXT(texunit, size, type, stride, memAddress(pointer));
    }

    // --- [ glMultiTexEnvfEXT ] ---

    /** {@code void glMultiTexEnvfEXT(GLenum texunit, GLenum target, GLenum pname, GLfloat param)} */
    public static native void glMultiTexEnvfEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param);

    // --- [ glMultiTexEnvfvEXT ] ---

    /** {@code void glMultiTexEnvfvEXT(GLenum texunit, GLenum target, GLenum pname, GLfloat const * params)} */
    public static native void nglMultiTexEnvfvEXT(int texunit, int target, int pname, long params);

    /** {@code void glMultiTexEnvfvEXT(GLenum texunit, GLenum target, GLenum pname, GLfloat const * params)} */
    public static void glMultiTexEnvfvEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglMultiTexEnvfvEXT(texunit, target, pname, memAddress(params));
    }

    // --- [ glMultiTexEnviEXT ] ---

    /** {@code void glMultiTexEnviEXT(GLenum texunit, GLenum target, GLenum pname, GLint param)} */
    public static native void glMultiTexEnviEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint") int param);

    // --- [ glMultiTexEnvivEXT ] ---

    /** {@code void glMultiTexEnvivEXT(GLenum texunit, GLenum target, GLenum pname, GLint const * params)} */
    public static native void nglMultiTexEnvivEXT(int texunit, int target, int pname, long params);

    /** {@code void glMultiTexEnvivEXT(GLenum texunit, GLenum target, GLenum pname, GLint const * params)} */
    public static void glMultiTexEnvivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglMultiTexEnvivEXT(texunit, target, pname, memAddress(params));
    }

    // --- [ glMultiTexGendEXT ] ---

    /** {@code void glMultiTexGendEXT(GLenum texunit, GLenum coord, GLenum pname, GLdouble param)} */
    public static native void glMultiTexGendEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLdouble") double param);

    // --- [ glMultiTexGendvEXT ] ---

    /** {@code void glMultiTexGendvEXT(GLenum texunit, GLenum coord, GLenum pname, GLdouble const * params)} */
    public static native void nglMultiTexGendvEXT(int texunit, int coord, int pname, long params);

    /** {@code void glMultiTexGendvEXT(GLenum texunit, GLenum coord, GLenum pname, GLdouble const * params)} */
    public static void glMultiTexGendvEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLdouble const *") DoubleBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglMultiTexGendvEXT(texunit, coord, pname, memAddress(params));
    }

    // --- [ glMultiTexGenfEXT ] ---

    /** {@code void glMultiTexGenfEXT(GLenum texunit, GLenum coord, GLenum pname, GLfloat param)} */
    public static native void glMultiTexGenfEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param);

    // --- [ glMultiTexGenfvEXT ] ---

    /** {@code void glMultiTexGenfvEXT(GLenum texunit, GLenum coord, GLenum pname, GLfloat const * params)} */
    public static native void nglMultiTexGenfvEXT(int texunit, int coord, int pname, long params);

    /** {@code void glMultiTexGenfvEXT(GLenum texunit, GLenum coord, GLenum pname, GLfloat const * params)} */
    public static void glMultiTexGenfvEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglMultiTexGenfvEXT(texunit, coord, pname, memAddress(params));
    }

    // --- [ glMultiTexGeniEXT ] ---

    /** {@code void glMultiTexGeniEXT(GLenum texunit, GLenum coord, GLenum pname, GLint param)} */
    public static native void glMultiTexGeniEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLint") int param);

    // --- [ glMultiTexGenivEXT ] ---

    /** {@code void glMultiTexGenivEXT(GLenum texunit, GLenum coord, GLenum pname, GLint const * params)} */
    public static native void nglMultiTexGenivEXT(int texunit, int coord, int pname, long params);

    /** {@code void glMultiTexGenivEXT(GLenum texunit, GLenum coord, GLenum pname, GLint const * params)} */
    public static void glMultiTexGenivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglMultiTexGenivEXT(texunit, coord, pname, memAddress(params));
    }

    // --- [ glGetMultiTexEnvfvEXT ] ---

    /** {@code void glGetMultiTexEnvfvEXT(GLenum texunit, GLenum target, GLenum pname, GLfloat * params)} */
    public static native void nglGetMultiTexEnvfvEXT(int texunit, int target, int pname, long params);

    /** {@code void glGetMultiTexEnvfvEXT(GLenum texunit, GLenum target, GLenum pname, GLfloat * params)} */
    public static void glGetMultiTexEnvfvEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMultiTexEnvfvEXT(texunit, target, pname, memAddress(params));
    }

    /** {@code void glGetMultiTexEnvfvEXT(GLenum texunit, GLenum target, GLenum pname, GLfloat * params)} */
    @NativeType("void")
    public static float glGetMultiTexEnvfEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetMultiTexEnvfvEXT(texunit, target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetMultiTexEnvivEXT ] ---

    /** {@code void glGetMultiTexEnvivEXT(GLenum texunit, GLenum target, GLenum pname, GLint * params)} */
    public static native void nglGetMultiTexEnvivEXT(int texunit, int target, int pname, long params);

    /** {@code void glGetMultiTexEnvivEXT(GLenum texunit, GLenum target, GLenum pname, GLint * params)} */
    public static void glGetMultiTexEnvivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMultiTexEnvivEXT(texunit, target, pname, memAddress(params));
    }

    /** {@code void glGetMultiTexEnvivEXT(GLenum texunit, GLenum target, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetMultiTexEnviEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetMultiTexEnvivEXT(texunit, target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetMultiTexGendvEXT ] ---

    /** {@code void glGetMultiTexGendvEXT(GLenum texunit, GLenum coord, GLenum pname, GLdouble * params)} */
    public static native void nglGetMultiTexGendvEXT(int texunit, int coord, int pname, long params);

    /** {@code void glGetMultiTexGendvEXT(GLenum texunit, GLenum coord, GLenum pname, GLdouble * params)} */
    public static void glGetMultiTexGendvEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLdouble *") DoubleBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMultiTexGendvEXT(texunit, coord, pname, memAddress(params));
    }

    /** {@code void glGetMultiTexGendvEXT(GLenum texunit, GLenum coord, GLenum pname, GLdouble * params)} */
    @NativeType("void")
    public static double glGetMultiTexGendEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            DoubleBuffer params = stack.callocDouble(1);
            nglGetMultiTexGendvEXT(texunit, coord, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetMultiTexGenfvEXT ] ---

    /** {@code void glGetMultiTexGenfvEXT(GLenum texunit, GLenum coord, GLenum pname, GLfloat * params)} */
    public static native void nglGetMultiTexGenfvEXT(int texunit, int coord, int pname, long params);

    /** {@code void glGetMultiTexGenfvEXT(GLenum texunit, GLenum coord, GLenum pname, GLfloat * params)} */
    public static void glGetMultiTexGenfvEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMultiTexGenfvEXT(texunit, coord, pname, memAddress(params));
    }

    /** {@code void glGetMultiTexGenfvEXT(GLenum texunit, GLenum coord, GLenum pname, GLfloat * params)} */
    @NativeType("void")
    public static float glGetMultiTexGenfEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetMultiTexGenfvEXT(texunit, coord, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetMultiTexGenivEXT ] ---

    /** {@code void glGetMultiTexGenivEXT(GLenum texunit, GLenum coord, GLenum pname, GLint * params)} */
    public static native void nglGetMultiTexGenivEXT(int texunit, int coord, int pname, long params);

    /** {@code void glGetMultiTexGenivEXT(GLenum texunit, GLenum coord, GLenum pname, GLint * params)} */
    public static void glGetMultiTexGenivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMultiTexGenivEXT(texunit, coord, pname, memAddress(params));
    }

    /** {@code void glGetMultiTexGenivEXT(GLenum texunit, GLenum coord, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetMultiTexGeniEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetMultiTexGenivEXT(texunit, coord, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glMultiTexParameteriEXT ] ---

    /** {@code void glMultiTexParameteriEXT(GLenum texunit, GLenum target, GLenum pname, GLint param)} */
    public static native void glMultiTexParameteriEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint") int param);

    // --- [ glMultiTexParameterivEXT ] ---

    /** {@code void glMultiTexParameterivEXT(GLenum texunit, GLenum target, GLenum pname, GLint const * param)} */
    public static native void nglMultiTexParameterivEXT(int texunit, int target, int pname, long param);

    /** {@code void glMultiTexParameterivEXT(GLenum texunit, GLenum target, GLenum pname, GLint const * param)} */
    public static void glMultiTexParameterivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer param) {
        if (CHECKS) {
            check(param, 4);
        }
        nglMultiTexParameterivEXT(texunit, target, pname, memAddress(param));
    }

    // --- [ glMultiTexParameterfEXT ] ---

    /** {@code void glMultiTexParameterfEXT(GLenum texunit, GLenum target, GLenum pname, GLfloat param)} */
    public static native void glMultiTexParameterfEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param);

    // --- [ glMultiTexParameterfvEXT ] ---

    /** {@code void glMultiTexParameterfvEXT(GLenum texunit, GLenum target, GLenum pname, GLfloat const * param)} */
    public static native void nglMultiTexParameterfvEXT(int texunit, int target, int pname, long param);

    /** {@code void glMultiTexParameterfvEXT(GLenum texunit, GLenum target, GLenum pname, GLfloat const * param)} */
    public static void glMultiTexParameterfvEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer param) {
        if (CHECKS) {
            check(param, 4);
        }
        nglMultiTexParameterfvEXT(texunit, target, pname, memAddress(param));
    }

    // --- [ glMultiTexImage1DEXT ] ---

    /** {@code void glMultiTexImage1DEXT(GLenum texunit, GLenum target, GLint level, GLint internalformat, GLsizei width, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static native void nglMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, long pixels);

    /** {@code void glMultiTexImage1DEXT(GLenum texunit, GLenum target, GLint level, GLint internalformat, GLsizei width, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ByteBuffer pixels) {
        nglMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glMultiTexImage1DEXT(GLenum texunit, GLenum target, GLint level, GLint internalformat, GLsizei width, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, pixels);
    }

    /** {@code void glMultiTexImage1DEXT(GLenum texunit, GLenum target, GLint level, GLint internalformat, GLsizei width, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ShortBuffer pixels) {
        nglMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glMultiTexImage1DEXT(GLenum texunit, GLenum target, GLint level, GLint internalformat, GLsizei width, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable IntBuffer pixels) {
        nglMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glMultiTexImage1DEXT(GLenum texunit, GLenum target, GLint level, GLint internalformat, GLsizei width, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable FloatBuffer pixels) {
        nglMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glMultiTexImage1DEXT(GLenum texunit, GLenum target, GLint level, GLint internalformat, GLsizei width, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable DoubleBuffer pixels) {
        nglMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
    }

    // --- [ glMultiTexImage2DEXT ] ---

    /** {@code void glMultiTexImage2DEXT(GLenum texunit, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static native void nglMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels);

    /** {@code void glMultiTexImage2DEXT(GLenum texunit, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ByteBuffer pixels) {
        nglMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glMultiTexImage2DEXT(GLenum texunit, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, pixels);
    }

    /** {@code void glMultiTexImage2DEXT(GLenum texunit, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ShortBuffer pixels) {
        nglMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glMultiTexImage2DEXT(GLenum texunit, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable IntBuffer pixels) {
        nglMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glMultiTexImage2DEXT(GLenum texunit, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable FloatBuffer pixels) {
        nglMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glMultiTexImage2DEXT(GLenum texunit, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable DoubleBuffer pixels) {
        nglMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    // --- [ glMultiTexSubImage1DEXT ] ---

    /** {@code void glMultiTexSubImage1DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static native void nglMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, long pixels);

    /** {@code void glMultiTexSubImage1DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexSubImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        nglMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, memAddress(pixels));
    }

    /** {@code void glMultiTexSubImage1DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexSubImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, pixels);
    }

    /** {@code void glMultiTexSubImage1DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexSubImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        nglMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, memAddress(pixels));
    }

    /** {@code void glMultiTexSubImage1DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexSubImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        nglMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, memAddress(pixels));
    }

    /** {@code void glMultiTexSubImage1DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexSubImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        nglMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, memAddress(pixels));
    }

    /** {@code void glMultiTexSubImage1DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexSubImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") DoubleBuffer pixels) {
        nglMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, memAddress(pixels));
    }

    // --- [ glMultiTexSubImage2DEXT ] ---

    /** {@code void glMultiTexSubImage2DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static native void nglMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels);

    /** {@code void glMultiTexSubImage2DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexSubImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        nglMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    /** {@code void glMultiTexSubImage2DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexSubImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /** {@code void glMultiTexSubImage2DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexSubImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        nglMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    /** {@code void glMultiTexSubImage2DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexSubImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        nglMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    /** {@code void glMultiTexSubImage2DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexSubImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        nglMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    /** {@code void glMultiTexSubImage2DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexSubImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") DoubleBuffer pixels) {
        nglMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    // --- [ glCopyMultiTexImage1DEXT ] ---

    /** {@code void glCopyMultiTexImage1DEXT(GLenum texunit, GLenum target, GLint level, GLenum internalformat, GLint x, GLint y, GLsizei width, GLint border)} */
    public static native void glCopyMultiTexImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLint") int border);

    // --- [ glCopyMultiTexImage2DEXT ] ---

    /** {@code void glCopyMultiTexImage2DEXT(GLenum texunit, GLenum target, GLint level, GLenum internalformat, GLint x, GLint y, GLsizei width, GLsizei height, GLint border)} */
    public static native void glCopyMultiTexImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border);

    // --- [ glCopyMultiTexSubImage1DEXT ] ---

    /** {@code void glCopyMultiTexSubImage1DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLint x, GLint y, GLsizei width)} */
    public static native void glCopyMultiTexSubImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width);

    // --- [ glCopyMultiTexSubImage2DEXT ] ---

    /** {@code void glCopyMultiTexSubImage2DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static native void glCopyMultiTexSubImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glGetMultiTexImageEXT ] ---

    /** {@code void glGetMultiTexImageEXT(GLenum texunit, GLenum target, GLint level, GLenum format, GLenum type, void * pixels)} */
    public static native void nglGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, long pixels);

    /** {@code void glGetMultiTexImageEXT(GLenum texunit, GLenum target, GLint level, GLenum format, GLenum type, void * pixels)} */
    public static void glGetMultiTexImageEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer pixels) {
        nglGetMultiTexImageEXT(texunit, target, level, format, type, memAddress(pixels));
    }

    /** {@code void glGetMultiTexImageEXT(GLenum texunit, GLenum target, GLint level, GLenum format, GLenum type, void * pixels)} */
    public static void glGetMultiTexImageEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") long pixels) {
        nglGetMultiTexImageEXT(texunit, target, level, format, type, pixels);
    }

    /** {@code void glGetMultiTexImageEXT(GLenum texunit, GLenum target, GLint level, GLenum format, GLenum type, void * pixels)} */
    public static void glGetMultiTexImageEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer pixels) {
        nglGetMultiTexImageEXT(texunit, target, level, format, type, memAddress(pixels));
    }

    /** {@code void glGetMultiTexImageEXT(GLenum texunit, GLenum target, GLint level, GLenum format, GLenum type, void * pixels)} */
    public static void glGetMultiTexImageEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer pixels) {
        nglGetMultiTexImageEXT(texunit, target, level, format, type, memAddress(pixels));
    }

    /** {@code void glGetMultiTexImageEXT(GLenum texunit, GLenum target, GLint level, GLenum format, GLenum type, void * pixels)} */
    public static void glGetMultiTexImageEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer pixels) {
        nglGetMultiTexImageEXT(texunit, target, level, format, type, memAddress(pixels));
    }

    /** {@code void glGetMultiTexImageEXT(GLenum texunit, GLenum target, GLint level, GLenum format, GLenum type, void * pixels)} */
    public static void glGetMultiTexImageEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") DoubleBuffer pixels) {
        nglGetMultiTexImageEXT(texunit, target, level, format, type, memAddress(pixels));
    }

    // --- [ glGetMultiTexParameterfvEXT ] ---

    /** {@code void glGetMultiTexParameterfvEXT(GLenum texunit, GLenum target, GLenum pname, GLfloat * params)} */
    public static native void nglGetMultiTexParameterfvEXT(int texunit, int target, int pname, long params);

    /** {@code void glGetMultiTexParameterfvEXT(GLenum texunit, GLenum target, GLenum pname, GLfloat * params)} */
    public static void glGetMultiTexParameterfvEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMultiTexParameterfvEXT(texunit, target, pname, memAddress(params));
    }

    /** {@code void glGetMultiTexParameterfvEXT(GLenum texunit, GLenum target, GLenum pname, GLfloat * params)} */
    @NativeType("void")
    public static float glGetMultiTexParameterfEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetMultiTexParameterfvEXT(texunit, target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetMultiTexParameterivEXT ] ---

    /** {@code void glGetMultiTexParameterivEXT(GLenum texunit, GLenum target, GLenum pname, GLint * params)} */
    public static native void nglGetMultiTexParameterivEXT(int texunit, int target, int pname, long params);

    /** {@code void glGetMultiTexParameterivEXT(GLenum texunit, GLenum target, GLenum pname, GLint * params)} */
    public static void glGetMultiTexParameterivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMultiTexParameterivEXT(texunit, target, pname, memAddress(params));
    }

    /** {@code void glGetMultiTexParameterivEXT(GLenum texunit, GLenum target, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetMultiTexParameteriEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetMultiTexParameterivEXT(texunit, target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetMultiTexLevelParameterfvEXT ] ---

    /** {@code void glGetMultiTexLevelParameterfvEXT(GLenum texunit, GLenum target, GLint level, GLenum pname, GLfloat * params)} */
    public static native void nglGetMultiTexLevelParameterfvEXT(int texunit, int target, int level, int pname, long params);

    /** {@code void glGetMultiTexLevelParameterfvEXT(GLenum texunit, GLenum target, GLint level, GLenum pname, GLfloat * params)} */
    public static void glGetMultiTexLevelParameterfvEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMultiTexLevelParameterfvEXT(texunit, target, level, pname, memAddress(params));
    }

    /** {@code void glGetMultiTexLevelParameterfvEXT(GLenum texunit, GLenum target, GLint level, GLenum pname, GLfloat * params)} */
    @NativeType("void")
    public static float glGetMultiTexLevelParameterfEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetMultiTexLevelParameterfvEXT(texunit, target, level, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetMultiTexLevelParameterivEXT ] ---

    /** {@code void glGetMultiTexLevelParameterivEXT(GLenum texunit, GLenum target, GLint level, GLenum pname, GLint * params)} */
    public static native void nglGetMultiTexLevelParameterivEXT(int texunit, int target, int level, int pname, long params);

    /** {@code void glGetMultiTexLevelParameterivEXT(GLenum texunit, GLenum target, GLint level, GLenum pname, GLint * params)} */
    public static void glGetMultiTexLevelParameterivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMultiTexLevelParameterivEXT(texunit, target, level, pname, memAddress(params));
    }

    /** {@code void glGetMultiTexLevelParameterivEXT(GLenum texunit, GLenum target, GLint level, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetMultiTexLevelParameteriEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetMultiTexLevelParameterivEXT(texunit, target, level, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glMultiTexImage3DEXT ] ---

    /** {@code void glMultiTexImage3DEXT(GLenum texunit, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static native void nglMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels);

    /** {@code void glMultiTexImage3DEXT(GLenum texunit, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ByteBuffer pixels) {
        nglMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glMultiTexImage3DEXT(GLenum texunit, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    /** {@code void glMultiTexImage3DEXT(GLenum texunit, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ShortBuffer pixels) {
        nglMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glMultiTexImage3DEXT(GLenum texunit, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable IntBuffer pixels) {
        nglMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glMultiTexImage3DEXT(GLenum texunit, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable FloatBuffer pixels) {
        nglMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glMultiTexImage3DEXT(GLenum texunit, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable DoubleBuffer pixels) {
        nglMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    // --- [ glMultiTexSubImage3DEXT ] ---

    /** {@code void glMultiTexSubImage3DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static native void nglMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels);

    /** {@code void glMultiTexSubImage3DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexSubImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        nglMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    /** {@code void glMultiTexSubImage3DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexSubImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    /** {@code void glMultiTexSubImage3DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexSubImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        nglMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    /** {@code void glMultiTexSubImage3DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexSubImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        nglMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    /** {@code void glMultiTexSubImage3DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexSubImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        nglMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    /** {@code void glMultiTexSubImage3DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexSubImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") DoubleBuffer pixels) {
        nglMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    // --- [ glCopyMultiTexSubImage3DEXT ] ---

    /** {@code void glCopyMultiTexSubImage3DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static native void glCopyMultiTexSubImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glEnableClientStateIndexedEXT ] ---

    /** {@code void glEnableClientStateIndexedEXT(GLenum array, GLuint index)} */
    public static native void glEnableClientStateIndexedEXT(@NativeType("GLenum") int array, @NativeType("GLuint") int index);

    // --- [ glDisableClientStateIndexedEXT ] ---

    /** {@code void glDisableClientStateIndexedEXT(GLenum array, GLuint index)} */
    public static native void glDisableClientStateIndexedEXT(@NativeType("GLenum") int array, @NativeType("GLuint") int index);

    // --- [ glEnableClientStateiEXT ] ---

    /** {@code void glEnableClientStateiEXT(GLenum array, GLuint index)} */
    public static native void glEnableClientStateiEXT(@NativeType("GLenum") int array, @NativeType("GLuint") int index);

    // --- [ glDisableClientStateiEXT ] ---

    /** {@code void glDisableClientStateiEXT(GLenum array, GLuint index)} */
    public static native void glDisableClientStateiEXT(@NativeType("GLenum") int array, @NativeType("GLuint") int index);

    // --- [ glGetFloatIndexedvEXT ] ---

    /** {@code void glGetFloatIndexedvEXT(GLenum target, GLuint index, GLfloat * params)} */
    public static native void nglGetFloatIndexedvEXT(int target, int index, long params);

    /** {@code void glGetFloatIndexedvEXT(GLenum target, GLuint index, GLfloat * params)} */
    public static void glGetFloatIndexedvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetFloatIndexedvEXT(target, index, memAddress(params));
    }

    /** {@code void glGetFloatIndexedvEXT(GLenum target, GLuint index, GLfloat * params)} */
    @NativeType("void")
    public static float glGetFloatIndexedEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetFloatIndexedvEXT(target, index, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetDoubleIndexedvEXT ] ---

    /** {@code void glGetDoubleIndexedvEXT(GLenum target, GLuint index, GLdouble * params)} */
    public static native void nglGetDoubleIndexedvEXT(int target, int index, long params);

    /** {@code void glGetDoubleIndexedvEXT(GLenum target, GLuint index, GLdouble * params)} */
    public static void glGetDoubleIndexedvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble *") DoubleBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetDoubleIndexedvEXT(target, index, memAddress(params));
    }

    /** {@code void glGetDoubleIndexedvEXT(GLenum target, GLuint index, GLdouble * params)} */
    @NativeType("void")
    public static double glGetDoubleIndexedEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            DoubleBuffer params = stack.callocDouble(1);
            nglGetDoubleIndexedvEXT(target, index, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetPointerIndexedvEXT ] ---

    /** {@code void glGetPointerIndexedvEXT(GLenum target, GLuint index, void ** params)} */
    public static native void nglGetPointerIndexedvEXT(int target, int index, long params);

    /** {@code void glGetPointerIndexedvEXT(GLenum target, GLuint index, void ** params)} */
    public static void glGetPointerIndexedvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("void **") PointerBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetPointerIndexedvEXT(target, index, memAddress(params));
    }

    /** {@code void glGetPointerIndexedvEXT(GLenum target, GLuint index, void ** params)} */
    @NativeType("void")
    public static long glGetPointerIndexedEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer params = stack.callocPointer(1);
            nglGetPointerIndexedvEXT(target, index, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetFloati_vEXT ] ---

    /** {@code void glGetFloati_vEXT(GLenum pname, GLuint index, GLfloat * params)} */
    public static native void nglGetFloati_vEXT(int pname, int index, long params);

    /** {@code void glGetFloati_vEXT(GLenum pname, GLuint index, GLfloat * params)} */
    public static void glGetFloati_vEXT(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetFloati_vEXT(pname, index, memAddress(params));
    }

    /** {@code void glGetFloati_vEXT(GLenum pname, GLuint index, GLfloat * params)} */
    @NativeType("void")
    public static float glGetFloatiEXT(@NativeType("GLenum") int pname, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetFloati_vEXT(pname, index, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetDoublei_vEXT ] ---

    /** {@code void glGetDoublei_vEXT(GLenum pname, GLuint index, GLdouble * params)} */
    public static native void nglGetDoublei_vEXT(int pname, int index, long params);

    /** {@code void glGetDoublei_vEXT(GLenum pname, GLuint index, GLdouble * params)} */
    public static void glGetDoublei_vEXT(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLdouble *") DoubleBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetDoublei_vEXT(pname, index, memAddress(params));
    }

    /** {@code void glGetDoublei_vEXT(GLenum pname, GLuint index, GLdouble * params)} */
    @NativeType("void")
    public static double glGetDoubleiEXT(@NativeType("GLenum") int pname, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            DoubleBuffer params = stack.callocDouble(1);
            nglGetDoublei_vEXT(pname, index, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetPointeri_vEXT ] ---

    /** {@code void glGetPointeri_vEXT(GLenum pname, GLuint index, void ** params)} */
    public static native void nglGetPointeri_vEXT(int pname, int index, long params);

    /** {@code void glGetPointeri_vEXT(GLenum pname, GLuint index, void ** params)} */
    public static void glGetPointeri_vEXT(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("void **") PointerBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetPointeri_vEXT(pname, index, memAddress(params));
    }

    /** {@code void glGetPointeri_vEXT(GLenum pname, GLuint index, void ** params)} */
    @NativeType("void")
    public static long glGetPointeriEXT(@NativeType("GLenum") int pname, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer params = stack.callocPointer(1);
            nglGetPointeri_vEXT(pname, index, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glEnableIndexedEXT ] ---

    /** {@code void glEnableIndexedEXT(GLenum target, GLuint index)} */
    public static void glEnableIndexedEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        EXTDrawBuffers2.glEnableIndexedEXT(target, index);
    }

    // --- [ glDisableIndexedEXT ] ---

    /** {@code void glDisableIndexedEXT(GLenum target, GLuint index)} */
    public static void glDisableIndexedEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        EXTDrawBuffers2.glDisableIndexedEXT(target, index);
    }

    // --- [ glIsEnabledIndexedEXT ] ---

    /** {@code GLboolean glIsEnabledIndexedEXT(GLenum target, GLuint index)} */
    @NativeType("GLboolean")
    public static boolean glIsEnabledIndexedEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        return EXTDrawBuffers2.glIsEnabledIndexedEXT(target, index);
    }

    // --- [ glGetIntegerIndexedvEXT ] ---

    /** {@code void glGetIntegerIndexedvEXT(GLenum target, GLuint index, GLint * data)} */
    public static void nglGetIntegerIndexedvEXT(int target, int index, long data) {
        EXTDrawBuffers2.nglGetIntegerIndexedvEXT(target, index, data);
    }

    /** {@code void glGetIntegerIndexedvEXT(GLenum target, GLuint index, GLint * data)} */
    public static void glGetIntegerIndexedvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer data) {
        EXTDrawBuffers2.glGetIntegerIndexedvEXT(target, index, data);
    }

    /** {@code void glGetIntegerIndexedvEXT(GLenum target, GLuint index, GLint * data)} */
    @NativeType("void")
    public static int glGetIntegerIndexedEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        return EXTDrawBuffers2.glGetIntegerIndexedEXT(target, index);
    }

    // --- [ glGetBooleanIndexedvEXT ] ---

    /** {@code void glGetBooleanIndexedvEXT(GLenum target, GLuint index, GLboolean * data)} */
    public static void nglGetBooleanIndexedvEXT(int target, int index, long data) {
        EXTDrawBuffers2.nglGetBooleanIndexedvEXT(target, index, data);
    }

    /** {@code void glGetBooleanIndexedvEXT(GLenum target, GLuint index, GLboolean * data)} */
    public static void glGetBooleanIndexedvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLboolean *") ByteBuffer data) {
        EXTDrawBuffers2.glGetBooleanIndexedvEXT(target, index, data);
    }

    /** {@code void glGetBooleanIndexedvEXT(GLenum target, GLuint index, GLboolean * data)} */
    @NativeType("void")
    public static boolean glGetBooleanIndexedEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        return EXTDrawBuffers2.glGetBooleanIndexedEXT(target, index);
    }

    // --- [ glNamedProgramStringEXT ] ---

    /** {@code void glNamedProgramStringEXT(GLuint program, GLenum target, GLenum format, GLsizei len, void const * string)} */
    public static native void nglNamedProgramStringEXT(int program, int target, int format, int len, long string);

    /** {@code void glNamedProgramStringEXT(GLuint program, GLenum target, GLenum format, GLsizei len, void const * string)} */
    public static void glNamedProgramStringEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer string) {
        nglNamedProgramStringEXT(program, target, format, string.remaining(), memAddress(string));
    }

    // --- [ glNamedProgramLocalParameter4dEXT ] ---

    /** {@code void glNamedProgramLocalParameter4dEXT(GLuint program, GLenum target, GLuint index, GLdouble x, GLdouble y, GLdouble z, GLdouble w)} */
    public static native void glNamedProgramLocalParameter4dEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w);

    // --- [ glNamedProgramLocalParameter4dvEXT ] ---

    /** {@code void glNamedProgramLocalParameter4dvEXT(GLuint program, GLenum target, GLuint index, GLdouble const * params)} */
    public static native void nglNamedProgramLocalParameter4dvEXT(int program, int target, int index, long params);

    /** {@code void glNamedProgramLocalParameter4dvEXT(GLuint program, GLenum target, GLuint index, GLdouble const * params)} */
    public static void glNamedProgramLocalParameter4dvEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglNamedProgramLocalParameter4dvEXT(program, target, index, memAddress(params));
    }

    // --- [ glNamedProgramLocalParameter4fEXT ] ---

    /** {@code void glNamedProgramLocalParameter4fEXT(GLuint program, GLenum target, GLuint index, GLfloat x, GLfloat y, GLfloat z, GLfloat w)} */
    public static native void glNamedProgramLocalParameter4fEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z, @NativeType("GLfloat") float w);

    // --- [ glNamedProgramLocalParameter4fvEXT ] ---

    /** {@code void glNamedProgramLocalParameter4fvEXT(GLuint program, GLenum target, GLuint index, GLfloat const * params)} */
    public static native void nglNamedProgramLocalParameter4fvEXT(int program, int target, int index, long params);

    /** {@code void glNamedProgramLocalParameter4fvEXT(GLuint program, GLenum target, GLuint index, GLfloat const * params)} */
    public static void glNamedProgramLocalParameter4fvEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglNamedProgramLocalParameter4fvEXT(program, target, index, memAddress(params));
    }

    // --- [ glGetNamedProgramLocalParameterdvEXT ] ---

    /** {@code void glGetNamedProgramLocalParameterdvEXT(GLuint program, GLenum target, GLuint index, GLdouble * params)} */
    public static native void nglGetNamedProgramLocalParameterdvEXT(int program, int target, int index, long params);

    /** {@code void glGetNamedProgramLocalParameterdvEXT(GLuint program, GLenum target, GLuint index, GLdouble * params)} */
    public static void glGetNamedProgramLocalParameterdvEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble *") DoubleBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetNamedProgramLocalParameterdvEXT(program, target, index, memAddress(params));
    }

    // --- [ glGetNamedProgramLocalParameterfvEXT ] ---

    /** {@code void glGetNamedProgramLocalParameterfvEXT(GLuint program, GLenum target, GLuint index, GLfloat * params)} */
    public static native void nglGetNamedProgramLocalParameterfvEXT(int program, int target, int index, long params);

    /** {@code void glGetNamedProgramLocalParameterfvEXT(GLuint program, GLenum target, GLuint index, GLfloat * params)} */
    public static void glGetNamedProgramLocalParameterfvEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetNamedProgramLocalParameterfvEXT(program, target, index, memAddress(params));
    }

    // --- [ glGetNamedProgramivEXT ] ---

    /** {@code void glGetNamedProgramivEXT(GLuint program, GLenum target, GLenum pname, GLint * params)} */
    public static native void nglGetNamedProgramivEXT(int program, int target, int pname, long params);

    /** {@code void glGetNamedProgramivEXT(GLuint program, GLenum target, GLenum pname, GLint * params)} */
    public static void glGetNamedProgramivEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetNamedProgramivEXT(program, target, pname, memAddress(params));
    }

    /** {@code void glGetNamedProgramivEXT(GLuint program, GLenum target, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetNamedProgramiEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetNamedProgramivEXT(program, target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetNamedProgramStringEXT ] ---

    /** {@code void glGetNamedProgramStringEXT(GLuint program, GLenum target, GLenum pname, void * string)} */
    public static native void nglGetNamedProgramStringEXT(int program, int target, int pname, long string);

    /** {@code void glGetNamedProgramStringEXT(GLuint program, GLenum target, GLenum pname, void * string)} */
    public static void glGetNamedProgramStringEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("void *") ByteBuffer string) {
        if (CHECKS) {
            if (DEBUG) {
                check(string, glGetNamedProgramiEXT(program, target, ARBVertexProgram.GL_PROGRAM_LENGTH_ARB));
            }
        }
        nglGetNamedProgramStringEXT(program, target, pname, memAddress(string));
    }

    // --- [ glCompressedTextureImage3DEXT ] ---

    /** {@code void glCompressedTextureImage3DEXT(GLuint texture, GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLsizei imageSize, void const * data)} */
    public static native void nglCompressedTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data);

    /** {@code void glCompressedTextureImage3DEXT(GLuint texture, GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLsizei imageSize, void const * data)} */
    public static void glCompressedTextureImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, imageSize, data);
    }

    /** {@code void glCompressedTextureImage3DEXT(GLuint texture, GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLsizei imageSize, void const * data)} */
    public static void glCompressedTextureImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("void const *") @Nullable ByteBuffer data) {
        nglCompressedTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, remainingSafe(data), memAddressSafe(data));
    }

    // --- [ glCompressedTextureImage2DEXT ] ---

    /** {@code void glCompressedTextureImage2DEXT(GLuint texture, GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLint border, GLsizei imageSize, void const * data)} */
    public static native void nglCompressedTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int imageSize, long data);

    /** {@code void glCompressedTextureImage2DEXT(GLuint texture, GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLint border, GLsizei imageSize, void const * data)} */
    public static void glCompressedTextureImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTextureImage2DEXT(texture, target, level, internalformat, width, height, border, imageSize, data);
    }

    /** {@code void glCompressedTextureImage2DEXT(GLuint texture, GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLint border, GLsizei imageSize, void const * data)} */
    public static void glCompressedTextureImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("void const *") @Nullable ByteBuffer data) {
        nglCompressedTextureImage2DEXT(texture, target, level, internalformat, width, height, border, remainingSafe(data), memAddressSafe(data));
    }

    // --- [ glCompressedTextureImage1DEXT ] ---

    /** {@code void glCompressedTextureImage1DEXT(GLuint texture, GLenum target, GLint level, GLenum internalformat, GLsizei width, GLint border, GLsizei imageSize, void const * data)} */
    public static native void nglCompressedTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int imageSize, long data);

    /** {@code void glCompressedTextureImage1DEXT(GLuint texture, GLenum target, GLint level, GLenum internalformat, GLsizei width, GLint border, GLsizei imageSize, void const * data)} */
    public static void glCompressedTextureImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTextureImage1DEXT(texture, target, level, internalformat, width, border, imageSize, data);
    }

    /** {@code void glCompressedTextureImage1DEXT(GLuint texture, GLenum target, GLint level, GLenum internalformat, GLsizei width, GLint border, GLsizei imageSize, void const * data)} */
    public static void glCompressedTextureImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("void const *") @Nullable ByteBuffer data) {
        nglCompressedTextureImage1DEXT(texture, target, level, internalformat, width, border, remainingSafe(data), memAddressSafe(data));
    }

    // --- [ glCompressedTextureSubImage3DEXT ] ---

    /** {@code void glCompressedTextureSubImage3DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLsizei imageSize, void const * data)} */
    public static native void nglCompressedTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data);

    /** {@code void glCompressedTextureSubImage3DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTextureSubImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
    }

    /** {@code void glCompressedTextureSubImage3DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTextureSubImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        nglCompressedTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, data.remaining(), memAddress(data));
    }

    // --- [ glCompressedTextureSubImage2DEXT ] ---

    /** {@code void glCompressedTextureSubImage2DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLsizei imageSize, void const * data)} */
    public static native void nglCompressedTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data);

    /** {@code void glCompressedTextureSubImage2DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTextureSubImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, imageSize, data);
    }

    /** {@code void glCompressedTextureSubImage2DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTextureSubImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        nglCompressedTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, data.remaining(), memAddress(data));
    }

    // --- [ glCompressedTextureSubImage1DEXT ] ---

    /** {@code void glCompressedTextureSubImage1DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLsizei imageSize, void const * data)} */
    public static native void nglCompressedTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int imageSize, long data);

    /** {@code void glCompressedTextureSubImage1DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTextureSubImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTextureSubImage1DEXT(texture, target, level, xoffset, width, format, imageSize, data);
    }

    /** {@code void glCompressedTextureSubImage1DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTextureSubImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        nglCompressedTextureSubImage1DEXT(texture, target, level, xoffset, width, format, data.remaining(), memAddress(data));
    }

    // --- [ glGetCompressedTextureImageEXT ] ---

    /** {@code void glGetCompressedTextureImageEXT(GLuint texture, GLenum target, GLint level, void * img)} */
    public static native void nglGetCompressedTextureImageEXT(int texture, int target, int level, long img);

    /** {@code void glGetCompressedTextureImageEXT(GLuint texture, GLenum target, GLint level, void * img)} */
    public static void glGetCompressedTextureImageEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("void *") ByteBuffer img) {
        if (CHECKS) {
            if (DEBUG) {
                check(img, glGetTextureLevelParameteriEXT(texture, target, level, GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE));
            }
        }
        nglGetCompressedTextureImageEXT(texture, target, level, memAddress(img));
    }

    /** {@code void glGetCompressedTextureImageEXT(GLuint texture, GLenum target, GLint level, void * img)} */
    public static void glGetCompressedTextureImageEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("void *") long img) {
        nglGetCompressedTextureImageEXT(texture, target, level, img);
    }

    // --- [ glCompressedMultiTexImage3DEXT ] ---

    /** {@code void glCompressedMultiTexImage3DEXT(GLenum texunit, GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLsizei imageSize, void const * data)} */
    public static native void nglCompressedMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data);

    /** {@code void glCompressedMultiTexImage3DEXT(GLenum texunit, GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLsizei imageSize, void const * data)} */
    public static void glCompressedMultiTexImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, imageSize, data);
    }

    /** {@code void glCompressedMultiTexImage3DEXT(GLenum texunit, GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLsizei imageSize, void const * data)} */
    public static void glCompressedMultiTexImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("void const *") @Nullable ByteBuffer data) {
        nglCompressedMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, remainingSafe(data), memAddressSafe(data));
    }

    // --- [ glCompressedMultiTexImage2DEXT ] ---

    /** {@code void glCompressedMultiTexImage2DEXT(GLenum texunit, GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLint border, GLsizei imageSize, void const * data)} */
    public static native void nglCompressedMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int imageSize, long data);

    /** {@code void glCompressedMultiTexImage2DEXT(GLenum texunit, GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLint border, GLsizei imageSize, void const * data)} */
    public static void glCompressedMultiTexImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, imageSize, data);
    }

    /** {@code void glCompressedMultiTexImage2DEXT(GLenum texunit, GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLint border, GLsizei imageSize, void const * data)} */
    public static void glCompressedMultiTexImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("void const *") @Nullable ByteBuffer data) {
        nglCompressedMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, remainingSafe(data), memAddressSafe(data));
    }

    // --- [ glCompressedMultiTexImage1DEXT ] ---

    /** {@code void glCompressedMultiTexImage1DEXT(GLenum texunit, GLenum target, GLint level, GLenum internalformat, GLsizei width, GLint border, GLsizei imageSize, void const * data)} */
    public static native void nglCompressedMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int imageSize, long data);

    /** {@code void glCompressedMultiTexImage1DEXT(GLenum texunit, GLenum target, GLint level, GLenum internalformat, GLsizei width, GLint border, GLsizei imageSize, void const * data)} */
    public static void glCompressedMultiTexImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, imageSize, data);
    }

    /** {@code void glCompressedMultiTexImage1DEXT(GLenum texunit, GLenum target, GLint level, GLenum internalformat, GLsizei width, GLint border, GLsizei imageSize, void const * data)} */
    public static void glCompressedMultiTexImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("void const *") @Nullable ByteBuffer data) {
        nglCompressedMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, remainingSafe(data), memAddressSafe(data));
    }

    // --- [ glCompressedMultiTexSubImage3DEXT ] ---

    /** {@code void glCompressedMultiTexSubImage3DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLsizei imageSize, void const * data)} */
    public static native void nglCompressedMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data);

    /** {@code void glCompressedMultiTexSubImage3DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedMultiTexSubImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
    }

    /** {@code void glCompressedMultiTexSubImage3DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedMultiTexSubImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        nglCompressedMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, data.remaining(), memAddress(data));
    }

    // --- [ glCompressedMultiTexSubImage2DEXT ] ---

    /** {@code void glCompressedMultiTexSubImage2DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLsizei imageSize, void const * data)} */
    public static native void nglCompressedMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data);

    /** {@code void glCompressedMultiTexSubImage2DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedMultiTexSubImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, imageSize, data);
    }

    /** {@code void glCompressedMultiTexSubImage2DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedMultiTexSubImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        nglCompressedMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, data.remaining(), memAddress(data));
    }

    // --- [ glCompressedMultiTexSubImage1DEXT ] ---

    /** {@code void glCompressedMultiTexSubImage1DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLsizei imageSize, void const * data)} */
    public static native void nglCompressedMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int imageSize, long data);

    /** {@code void glCompressedMultiTexSubImage1DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedMultiTexSubImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, imageSize, data);
    }

    /** {@code void glCompressedMultiTexSubImage1DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedMultiTexSubImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        nglCompressedMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, data.remaining(), memAddress(data));
    }

    // --- [ glGetCompressedMultiTexImageEXT ] ---

    /** {@code void glGetCompressedMultiTexImageEXT(GLenum texunit, GLenum target, GLint level, void * img)} */
    public static native void nglGetCompressedMultiTexImageEXT(int texunit, int target, int level, long img);

    /** {@code void glGetCompressedMultiTexImageEXT(GLenum texunit, GLenum target, GLint level, void * img)} */
    public static void glGetCompressedMultiTexImageEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("void *") ByteBuffer img) {
        if (CHECKS) {
            if (DEBUG) {
                check(img, glGetMultiTexLevelParameteriEXT(texunit, target, level, GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE));
            }
        }
        nglGetCompressedMultiTexImageEXT(texunit, target, level, memAddress(img));
    }

    /** {@code void glGetCompressedMultiTexImageEXT(GLenum texunit, GLenum target, GLint level, void * img)} */
    public static void glGetCompressedMultiTexImageEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("void *") long img) {
        nglGetCompressedMultiTexImageEXT(texunit, target, level, img);
    }

    // --- [ glMatrixLoadTransposefEXT ] ---

    /** {@code void glMatrixLoadTransposefEXT(GLenum matrixMode, GLfloat const * m)} */
    public static native void nglMatrixLoadTransposefEXT(int matrixMode, long m);

    /** {@code void glMatrixLoadTransposefEXT(GLenum matrixMode, GLfloat const * m)} */
    public static void glMatrixLoadTransposefEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") FloatBuffer m) {
        if (CHECKS) {
            check(m, 16);
        }
        nglMatrixLoadTransposefEXT(matrixMode, memAddress(m));
    }

    // --- [ glMatrixLoadTransposedEXT ] ---

    /** {@code void glMatrixLoadTransposedEXT(GLenum matrixMode, GLdouble const * m)} */
    public static native void nglMatrixLoadTransposedEXT(int matrixMode, long m);

    /** {@code void glMatrixLoadTransposedEXT(GLenum matrixMode, GLdouble const * m)} */
    public static void glMatrixLoadTransposedEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLdouble const *") DoubleBuffer m) {
        if (CHECKS) {
            check(m, 16);
        }
        nglMatrixLoadTransposedEXT(matrixMode, memAddress(m));
    }

    // --- [ glMatrixMultTransposefEXT ] ---

    /** {@code void glMatrixMultTransposefEXT(GLenum matrixMode, GLfloat const * m)} */
    public static native void nglMatrixMultTransposefEXT(int matrixMode, long m);

    /** {@code void glMatrixMultTransposefEXT(GLenum matrixMode, GLfloat const * m)} */
    public static void glMatrixMultTransposefEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") FloatBuffer m) {
        if (CHECKS) {
            check(m, 16);
        }
        nglMatrixMultTransposefEXT(matrixMode, memAddress(m));
    }

    // --- [ glMatrixMultTransposedEXT ] ---

    /** {@code void glMatrixMultTransposedEXT(GLenum matrixMode, GLdouble const * m)} */
    public static native void nglMatrixMultTransposedEXT(int matrixMode, long m);

    /** {@code void glMatrixMultTransposedEXT(GLenum matrixMode, GLdouble const * m)} */
    public static void glMatrixMultTransposedEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLdouble const *") DoubleBuffer m) {
        if (CHECKS) {
            check(m, 16);
        }
        nglMatrixMultTransposedEXT(matrixMode, memAddress(m));
    }

    // --- [ glNamedBufferDataEXT ] ---

    /** {@code void glNamedBufferDataEXT(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static native void nglNamedBufferDataEXT(int buffer, long size, long data, int usage);

    /** {@code void glNamedBufferDataEXT(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glNamedBufferDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int usage) {
        nglNamedBufferDataEXT(buffer, size, NULL, usage);
    }

    /** {@code void glNamedBufferDataEXT(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glNamedBufferDataEXT(@NativeType("GLuint") int buffer, @NativeType("void const *") ByteBuffer data, @NativeType("GLenum") int usage) {
        nglNamedBufferDataEXT(buffer, data.remaining(), memAddress(data), usage);
    }

    /** {@code void glNamedBufferDataEXT(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glNamedBufferDataEXT(@NativeType("GLuint") int buffer, @NativeType("void const *") ShortBuffer data, @NativeType("GLenum") int usage) {
        nglNamedBufferDataEXT(buffer, Integer.toUnsignedLong(data.remaining()) << 1, memAddress(data), usage);
    }

    /** {@code void glNamedBufferDataEXT(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glNamedBufferDataEXT(@NativeType("GLuint") int buffer, @NativeType("void const *") IntBuffer data, @NativeType("GLenum") int usage) {
        nglNamedBufferDataEXT(buffer, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data), usage);
    }

    /** {@code void glNamedBufferDataEXT(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glNamedBufferDataEXT(@NativeType("GLuint") int buffer, @NativeType("void const *") FloatBuffer data, @NativeType("GLenum") int usage) {
        nglNamedBufferDataEXT(buffer, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data), usage);
    }

    /** {@code void glNamedBufferDataEXT(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glNamedBufferDataEXT(@NativeType("GLuint") int buffer, @NativeType("void const *") DoubleBuffer data, @NativeType("GLenum") int usage) {
        nglNamedBufferDataEXT(buffer, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data), usage);
    }

    // --- [ glNamedBufferSubDataEXT ] ---

    /** {@code void glNamedBufferSubDataEXT(GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static native void nglNamedBufferSubDataEXT(int buffer, long offset, long size, long data);

    /** {@code void glNamedBufferSubDataEXT(GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") ByteBuffer data) {
        nglNamedBufferSubDataEXT(buffer, offset, data.remaining(), memAddress(data));
    }

    /** {@code void glNamedBufferSubDataEXT(GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") ShortBuffer data) {
        nglNamedBufferSubDataEXT(buffer, offset, Integer.toUnsignedLong(data.remaining()) << 1, memAddress(data));
    }

    /** {@code void glNamedBufferSubDataEXT(GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") IntBuffer data) {
        nglNamedBufferSubDataEXT(buffer, offset, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data));
    }

    /** {@code void glNamedBufferSubDataEXT(GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") FloatBuffer data) {
        nglNamedBufferSubDataEXT(buffer, offset, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data));
    }

    /** {@code void glNamedBufferSubDataEXT(GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") DoubleBuffer data) {
        nglNamedBufferSubDataEXT(buffer, offset, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data));
    }

    // --- [ glMapNamedBufferEXT ] ---

    /** {@code void * glMapNamedBufferEXT(GLuint buffer, GLenum access)} */
    public static native long nglMapNamedBufferEXT(int buffer, int access);

    /** {@code void * glMapNamedBufferEXT(GLuint buffer, GLenum access)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapNamedBufferEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int access) {
        long __result = nglMapNamedBufferEXT(buffer, access);
        return memByteBufferSafe(__result, glGetNamedBufferParameteriEXT(buffer, GL15.GL_BUFFER_SIZE));
    }

    /** {@code void * glMapNamedBufferEXT(GLuint buffer, GLenum access)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapNamedBufferEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int access, @Nullable ByteBuffer old_buffer) {
        long __result = nglMapNamedBufferEXT(buffer, access);
        int length = glGetNamedBufferParameteriEXT(buffer, GL15.GL_BUFFER_SIZE);
        return apiGetMappedBuffer(old_buffer, __result, length);
    }

    /** {@code void * glMapNamedBufferEXT(GLuint buffer, GLenum access)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapNamedBufferEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int access, long length, @Nullable ByteBuffer old_buffer) {
        long __result = nglMapNamedBufferEXT(buffer, access);
        return apiGetMappedBuffer(old_buffer, __result, (int)length);
    }

    // --- [ glUnmapNamedBufferEXT ] ---

    /** {@code GLboolean glUnmapNamedBufferEXT(GLuint buffer)} */
    @NativeType("GLboolean")
    public static native boolean glUnmapNamedBufferEXT(@NativeType("GLuint") int buffer);

    // --- [ glGetNamedBufferParameterivEXT ] ---

    /** {@code void glGetNamedBufferParameterivEXT(GLuint buffer, GLenum pname, GLint * params)} */
    public static native void nglGetNamedBufferParameterivEXT(int buffer, int pname, long params);

    /** {@code void glGetNamedBufferParameterivEXT(GLuint buffer, GLenum pname, GLint * params)} */
    public static void glGetNamedBufferParameterivEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetNamedBufferParameterivEXT(buffer, pname, memAddress(params));
    }

    /** {@code void glGetNamedBufferParameterivEXT(GLuint buffer, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetNamedBufferParameteriEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetNamedBufferParameterivEXT(buffer, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetNamedBufferSubDataEXT ] ---

    /** {@code void glGetNamedBufferSubDataEXT(GLuint buffer, GLintptr offset, GLsizeiptr size, void * data)} */
    public static native void nglGetNamedBufferSubDataEXT(int buffer, long offset, long size, long data);

    /** {@code void glGetNamedBufferSubDataEXT(GLuint buffer, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") ByteBuffer data) {
        nglGetNamedBufferSubDataEXT(buffer, offset, data.remaining(), memAddress(data));
    }

    /** {@code void glGetNamedBufferSubDataEXT(GLuint buffer, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") ShortBuffer data) {
        nglGetNamedBufferSubDataEXT(buffer, offset, Integer.toUnsignedLong(data.remaining()) << 1, memAddress(data));
    }

    /** {@code void glGetNamedBufferSubDataEXT(GLuint buffer, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") IntBuffer data) {
        nglGetNamedBufferSubDataEXT(buffer, offset, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data));
    }

    /** {@code void glGetNamedBufferSubDataEXT(GLuint buffer, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") FloatBuffer data) {
        nglGetNamedBufferSubDataEXT(buffer, offset, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data));
    }

    /** {@code void glGetNamedBufferSubDataEXT(GLuint buffer, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") DoubleBuffer data) {
        nglGetNamedBufferSubDataEXT(buffer, offset, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data));
    }

    // --- [ glProgramUniform1fEXT ] ---

    /** {@code void glProgramUniform1fEXT(GLuint program, GLint location, GLfloat v0)} */
    public static native void glProgramUniform1fEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float v0);

    // --- [ glProgramUniform2fEXT ] ---

    /** {@code void glProgramUniform2fEXT(GLuint program, GLint location, GLfloat v0, GLfloat v1)} */
    public static native void glProgramUniform2fEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1);

    // --- [ glProgramUniform3fEXT ] ---

    /** {@code void glProgramUniform3fEXT(GLuint program, GLint location, GLfloat v0, GLfloat v1, GLfloat v2)} */
    public static native void glProgramUniform3fEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2);

    // --- [ glProgramUniform4fEXT ] ---

    /** {@code void glProgramUniform4fEXT(GLuint program, GLint location, GLfloat v0, GLfloat v1, GLfloat v2, GLfloat v3)} */
    public static native void glProgramUniform4fEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2, @NativeType("GLfloat") float v3);

    // --- [ glProgramUniform1iEXT ] ---

    /** {@code void glProgramUniform1iEXT(GLuint program, GLint location, GLint v0)} */
    public static native void glProgramUniform1iEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int v0);

    // --- [ glProgramUniform2iEXT ] ---

    /** {@code void glProgramUniform2iEXT(GLuint program, GLint location, GLint v0, GLint v1)} */
    public static native void glProgramUniform2iEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1);

    // --- [ glProgramUniform3iEXT ] ---

    /** {@code void glProgramUniform3iEXT(GLuint program, GLint location, GLint v0, GLint v1, GLint v2)} */
    public static native void glProgramUniform3iEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1, @NativeType("GLint") int v2);

    // --- [ glProgramUniform4iEXT ] ---

    /** {@code void glProgramUniform4iEXT(GLuint program, GLint location, GLint v0, GLint v1, GLint v2, GLint v3)} */
    public static native void glProgramUniform4iEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1, @NativeType("GLint") int v2, @NativeType("GLint") int v3);

    // --- [ glProgramUniform1fvEXT ] ---

    /** {@code void glProgramUniform1fvEXT(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static native void nglProgramUniform1fvEXT(int program, int location, int count, long value);

    /** {@code void glProgramUniform1fvEXT(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform1fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniform1fvEXT(program, location, value.remaining(), memAddress(value));
    }

    // --- [ glProgramUniform2fvEXT ] ---

    /** {@code void glProgramUniform2fvEXT(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static native void nglProgramUniform2fvEXT(int program, int location, int count, long value);

    /** {@code void glProgramUniform2fvEXT(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform2fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniform2fvEXT(program, location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glProgramUniform3fvEXT ] ---

    /** {@code void glProgramUniform3fvEXT(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static native void nglProgramUniform3fvEXT(int program, int location, int count, long value);

    /** {@code void glProgramUniform3fvEXT(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform3fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniform3fvEXT(program, location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glProgramUniform4fvEXT ] ---

    /** {@code void glProgramUniform4fvEXT(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static native void nglProgramUniform4fvEXT(int program, int location, int count, long value);

    /** {@code void glProgramUniform4fvEXT(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform4fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniform4fvEXT(program, location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glProgramUniform1ivEXT ] ---

    /** {@code void glProgramUniform1ivEXT(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static native void nglProgramUniform1ivEXT(int program, int location, int count, long value);

    /** {@code void glProgramUniform1ivEXT(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform1ivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglProgramUniform1ivEXT(program, location, value.remaining(), memAddress(value));
    }

    // --- [ glProgramUniform2ivEXT ] ---

    /** {@code void glProgramUniform2ivEXT(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static native void nglProgramUniform2ivEXT(int program, int location, int count, long value);

    /** {@code void glProgramUniform2ivEXT(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform2ivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglProgramUniform2ivEXT(program, location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glProgramUniform3ivEXT ] ---

    /** {@code void glProgramUniform3ivEXT(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static native void nglProgramUniform3ivEXT(int program, int location, int count, long value);

    /** {@code void glProgramUniform3ivEXT(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform3ivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglProgramUniform3ivEXT(program, location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glProgramUniform4ivEXT ] ---

    /** {@code void glProgramUniform4ivEXT(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static native void nglProgramUniform4ivEXT(int program, int location, int count, long value);

    /** {@code void glProgramUniform4ivEXT(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform4ivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglProgramUniform4ivEXT(program, location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glProgramUniformMatrix2fvEXT ] ---

    /** {@code void glProgramUniformMatrix2fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglProgramUniformMatrix2fvEXT(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix2fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix2fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix2fvEXT(program, location, value.remaining() >> 2, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix3fvEXT ] ---

    /** {@code void glProgramUniformMatrix3fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglProgramUniformMatrix3fvEXT(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix3fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix3fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix3fvEXT(program, location, value.remaining() / 9, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix4fvEXT ] ---

    /** {@code void glProgramUniformMatrix4fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglProgramUniformMatrix4fvEXT(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix4fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix4fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix4fvEXT(program, location, value.remaining() >> 4, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix2x3fvEXT ] ---

    /** {@code void glProgramUniformMatrix2x3fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglProgramUniformMatrix2x3fvEXT(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix2x3fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix2x3fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix2x3fvEXT(program, location, value.remaining() / 6, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix3x2fvEXT ] ---

    /** {@code void glProgramUniformMatrix3x2fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglProgramUniformMatrix3x2fvEXT(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix3x2fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix3x2fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix3x2fvEXT(program, location, value.remaining() / 6, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix2x4fvEXT ] ---

    /** {@code void glProgramUniformMatrix2x4fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglProgramUniformMatrix2x4fvEXT(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix2x4fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix2x4fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix2x4fvEXT(program, location, value.remaining() >> 3, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix4x2fvEXT ] ---

    /** {@code void glProgramUniformMatrix4x2fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglProgramUniformMatrix4x2fvEXT(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix4x2fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix4x2fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix4x2fvEXT(program, location, value.remaining() >> 3, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix3x4fvEXT ] ---

    /** {@code void glProgramUniformMatrix3x4fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglProgramUniformMatrix3x4fvEXT(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix3x4fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix3x4fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix3x4fvEXT(program, location, value.remaining() / 12, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix4x3fvEXT ] ---

    /** {@code void glProgramUniformMatrix4x3fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglProgramUniformMatrix4x3fvEXT(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix4x3fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix4x3fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix4x3fvEXT(program, location, value.remaining() / 12, transpose, memAddress(value));
    }

    // --- [ glTextureBufferEXT ] ---

    /** {@code void glTextureBufferEXT(GLuint texture, GLenum target, GLenum internalformat, GLuint buffer)} */
    public static native void glTextureBufferEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer);

    // --- [ glMultiTexBufferEXT ] ---

    /** {@code void glMultiTexBufferEXT(GLenum texunit, GLenum target, GLenum internalformat, GLuint buffer)} */
    public static native void glMultiTexBufferEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer);

    // --- [ glTextureParameterIivEXT ] ---

    /** {@code void glTextureParameterIivEXT(GLuint texture, GLenum target, GLenum pname, GLint const * params)} */
    public static native void nglTextureParameterIivEXT(int texture, int target, int pname, long params);

    /** {@code void glTextureParameterIivEXT(GLuint texture, GLenum target, GLenum pname, GLint const * params)} */
    public static void glTextureParameterIivEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglTextureParameterIivEXT(texture, target, pname, memAddress(params));
    }

    // --- [ glTextureParameterIuivEXT ] ---

    /** {@code void glTextureParameterIuivEXT(GLuint texture, GLenum target, GLenum pname, GLuint const * params)} */
    public static native void nglTextureParameterIuivEXT(int texture, int target, int pname, long params);

    /** {@code void glTextureParameterIuivEXT(GLuint texture, GLenum target, GLenum pname, GLuint const * params)} */
    public static void glTextureParameterIuivEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglTextureParameterIuivEXT(texture, target, pname, memAddress(params));
    }

    // --- [ glGetTextureParameterIivEXT ] ---

    /** {@code void glGetTextureParameterIivEXT(GLuint texture, GLenum target, GLenum pname, GLint * params)} */
    public static native void nglGetTextureParameterIivEXT(int texture, int target, int pname, long params);

    /** {@code void glGetTextureParameterIivEXT(GLuint texture, GLenum target, GLenum pname, GLint * params)} */
    public static void glGetTextureParameterIivEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTextureParameterIivEXT(texture, target, pname, memAddress(params));
    }

    /** {@code void glGetTextureParameterIivEXT(GLuint texture, GLenum target, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetTextureParameterIiEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTextureParameterIivEXT(texture, target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTextureParameterIuivEXT ] ---

    /** {@code void glGetTextureParameterIuivEXT(GLuint texture, GLenum target, GLenum pname, GLuint * params)} */
    public static native void nglGetTextureParameterIuivEXT(int texture, int target, int pname, long params);

    /** {@code void glGetTextureParameterIuivEXT(GLuint texture, GLenum target, GLenum pname, GLuint * params)} */
    public static void glGetTextureParameterIuivEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTextureParameterIuivEXT(texture, target, pname, memAddress(params));
    }

    /** {@code void glGetTextureParameterIuivEXT(GLuint texture, GLenum target, GLenum pname, GLuint * params)} */
    @NativeType("void")
    public static int glGetTextureParameterIuiEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTextureParameterIuivEXT(texture, target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glMultiTexParameterIivEXT ] ---

    /** {@code void glMultiTexParameterIivEXT(GLenum texunit, GLenum target, GLenum pname, GLint const * params)} */
    public static native void nglMultiTexParameterIivEXT(int texunit, int target, int pname, long params);

    /** {@code void glMultiTexParameterIivEXT(GLenum texunit, GLenum target, GLenum pname, GLint const * params)} */
    public static void glMultiTexParameterIivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglMultiTexParameterIivEXT(texunit, target, pname, memAddress(params));
    }

    // --- [ glMultiTexParameterIuivEXT ] ---

    /** {@code void glMultiTexParameterIuivEXT(GLenum texunit, GLenum target, GLenum pname, GLuint const * params)} */
    public static native void nglMultiTexParameterIuivEXT(int texunit, int target, int pname, long params);

    /** {@code void glMultiTexParameterIuivEXT(GLenum texunit, GLenum target, GLenum pname, GLuint const * params)} */
    public static void glMultiTexParameterIuivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglMultiTexParameterIuivEXT(texunit, target, pname, memAddress(params));
    }

    // --- [ glGetMultiTexParameterIivEXT ] ---

    /** {@code void glGetMultiTexParameterIivEXT(GLenum texunit, GLenum target, GLenum pname, GLint * params)} */
    public static native void nglGetMultiTexParameterIivEXT(int texunit, int target, int pname, long params);

    /** {@code void glGetMultiTexParameterIivEXT(GLenum texunit, GLenum target, GLenum pname, GLint * params)} */
    public static void glGetMultiTexParameterIivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMultiTexParameterIivEXT(texunit, target, pname, memAddress(params));
    }

    /** {@code void glGetMultiTexParameterIivEXT(GLenum texunit, GLenum target, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetMultiTexParameterIiEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetMultiTexParameterIivEXT(texunit, target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetMultiTexParameterIuivEXT ] ---

    /** {@code void glGetMultiTexParameterIuivEXT(GLenum texunit, GLenum target, GLenum pname, GLuint * params)} */
    public static native void nglGetMultiTexParameterIuivEXT(int texunit, int target, int pname, long params);

    /** {@code void glGetMultiTexParameterIuivEXT(GLenum texunit, GLenum target, GLenum pname, GLuint * params)} */
    public static void glGetMultiTexParameterIuivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetMultiTexParameterIuivEXT(texunit, target, pname, memAddress(params));
    }

    /** {@code void glGetMultiTexParameterIuivEXT(GLenum texunit, GLenum target, GLenum pname, GLuint * params)} */
    @NativeType("void")
    public static int glGetMultiTexParameterIuiEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetMultiTexParameterIuivEXT(texunit, target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glProgramUniform1uiEXT ] ---

    /** {@code void glProgramUniform1uiEXT(GLuint program, GLint location, GLuint v0)} */
    public static native void glProgramUniform1uiEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int v0);

    // --- [ glProgramUniform2uiEXT ] ---

    /** {@code void glProgramUniform2uiEXT(GLuint program, GLint location, GLuint v0, GLuint v1)} */
    public static native void glProgramUniform2uiEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1);

    // --- [ glProgramUniform3uiEXT ] ---

    /** {@code void glProgramUniform3uiEXT(GLuint program, GLint location, GLuint v0, GLuint v1, GLuint v2)} */
    public static native void glProgramUniform3uiEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1, @NativeType("GLuint") int v2);

    // --- [ glProgramUniform4uiEXT ] ---

    /** {@code void glProgramUniform4uiEXT(GLuint program, GLint location, GLuint v0, GLuint v1, GLuint v2, GLuint v3)} */
    public static native void glProgramUniform4uiEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1, @NativeType("GLuint") int v2, @NativeType("GLuint") int v3);

    // --- [ glProgramUniform1uivEXT ] ---

    /** {@code void glProgramUniform1uivEXT(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static native void nglProgramUniform1uivEXT(int program, int location, int count, long value);

    /** {@code void glProgramUniform1uivEXT(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform1uivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglProgramUniform1uivEXT(program, location, value.remaining(), memAddress(value));
    }

    // --- [ glProgramUniform2uivEXT ] ---

    /** {@code void glProgramUniform2uivEXT(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static native void nglProgramUniform2uivEXT(int program, int location, int count, long value);

    /** {@code void glProgramUniform2uivEXT(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform2uivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglProgramUniform2uivEXT(program, location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glProgramUniform3uivEXT ] ---

    /** {@code void glProgramUniform3uivEXT(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static native void nglProgramUniform3uivEXT(int program, int location, int count, long value);

    /** {@code void glProgramUniform3uivEXT(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform3uivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglProgramUniform3uivEXT(program, location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glProgramUniform4uivEXT ] ---

    /** {@code void glProgramUniform4uivEXT(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static native void nglProgramUniform4uivEXT(int program, int location, int count, long value);

    /** {@code void glProgramUniform4uivEXT(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform4uivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglProgramUniform4uivEXT(program, location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glNamedProgramLocalParameters4fvEXT ] ---

    /** {@code void glNamedProgramLocalParameters4fvEXT(GLuint program, GLenum target, GLuint index, GLsizei count, GLfloat const * params)} */
    public static native void nglNamedProgramLocalParameters4fvEXT(int program, int target, int index, int count, long params);

    /** {@code void glNamedProgramLocalParameters4fvEXT(GLuint program, GLenum target, GLuint index, GLsizei count, GLfloat const * params)} */
    public static void glNamedProgramLocalParameters4fvEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer params) {
        nglNamedProgramLocalParameters4fvEXT(program, target, index, params.remaining() >> 2, memAddress(params));
    }

    // --- [ glNamedProgramLocalParameterI4iEXT ] ---

    /** {@code void glNamedProgramLocalParameterI4iEXT(GLuint program, GLenum target, GLuint index, GLint x, GLint y, GLint z, GLint w)} */
    public static native void glNamedProgramLocalParameterI4iEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z, @NativeType("GLint") int w);

    // --- [ glNamedProgramLocalParameterI4ivEXT ] ---

    /** {@code void glNamedProgramLocalParameterI4ivEXT(GLuint program, GLenum target, GLuint index, GLint const * params)} */
    public static native void nglNamedProgramLocalParameterI4ivEXT(int program, int target, int index, long params);

    /** {@code void glNamedProgramLocalParameterI4ivEXT(GLuint program, GLenum target, GLuint index, GLint const * params)} */
    public static void glNamedProgramLocalParameterI4ivEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglNamedProgramLocalParameterI4ivEXT(program, target, index, memAddress(params));
    }

    // --- [ glNamedProgramLocalParametersI4ivEXT ] ---

    /** {@code void glNamedProgramLocalParametersI4ivEXT(GLuint program, GLenum target, GLuint index, GLsizei count, GLint const * params)} */
    public static native void nglNamedProgramLocalParametersI4ivEXT(int program, int target, int index, int count, long params);

    /** {@code void glNamedProgramLocalParametersI4ivEXT(GLuint program, GLenum target, GLuint index, GLsizei count, GLint const * params)} */
    public static void glNamedProgramLocalParametersI4ivEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer params) {
        nglNamedProgramLocalParametersI4ivEXT(program, target, index, params.remaining() >> 2, memAddress(params));
    }

    // --- [ glNamedProgramLocalParameterI4uiEXT ] ---

    /** {@code void glNamedProgramLocalParameterI4uiEXT(GLuint program, GLenum target, GLuint index, GLuint x, GLuint y, GLuint z, GLuint w)} */
    public static native void glNamedProgramLocalParameterI4uiEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int x, @NativeType("GLuint") int y, @NativeType("GLuint") int z, @NativeType("GLuint") int w);

    // --- [ glNamedProgramLocalParameterI4uivEXT ] ---

    /** {@code void glNamedProgramLocalParameterI4uivEXT(GLuint program, GLenum target, GLuint index, GLuint const * params)} */
    public static native void nglNamedProgramLocalParameterI4uivEXT(int program, int target, int index, long params);

    /** {@code void glNamedProgramLocalParameterI4uivEXT(GLuint program, GLenum target, GLuint index, GLuint const * params)} */
    public static void glNamedProgramLocalParameterI4uivEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglNamedProgramLocalParameterI4uivEXT(program, target, index, memAddress(params));
    }

    // --- [ glNamedProgramLocalParametersI4uivEXT ] ---

    /** {@code void glNamedProgramLocalParametersI4uivEXT(GLuint program, GLenum target, GLuint index, GLsizei count, GLuint const * params)} */
    public static native void nglNamedProgramLocalParametersI4uivEXT(int program, int target, int index, int count, long params);

    /** {@code void glNamedProgramLocalParametersI4uivEXT(GLuint program, GLenum target, GLuint index, GLsizei count, GLuint const * params)} */
    public static void glNamedProgramLocalParametersI4uivEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer params) {
        nglNamedProgramLocalParametersI4uivEXT(program, target, index, params.remaining() >> 2, memAddress(params));
    }

    // --- [ glGetNamedProgramLocalParameterIivEXT ] ---

    /** {@code void glGetNamedProgramLocalParameterIivEXT(GLuint program, GLenum target, GLuint index, GLint * params)} */
    public static native void nglGetNamedProgramLocalParameterIivEXT(int program, int target, int index, long params);

    /** {@code void glGetNamedProgramLocalParameterIivEXT(GLuint program, GLenum target, GLuint index, GLint * params)} */
    public static void glGetNamedProgramLocalParameterIivEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetNamedProgramLocalParameterIivEXT(program, target, index, memAddress(params));
    }

    // --- [ glGetNamedProgramLocalParameterIuivEXT ] ---

    /** {@code void glGetNamedProgramLocalParameterIuivEXT(GLuint program, GLenum target, GLuint index, GLuint * params)} */
    public static native void nglGetNamedProgramLocalParameterIuivEXT(int program, int target, int index, long params);

    /** {@code void glGetNamedProgramLocalParameterIuivEXT(GLuint program, GLenum target, GLuint index, GLuint * params)} */
    public static void glGetNamedProgramLocalParameterIuivEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetNamedProgramLocalParameterIuivEXT(program, target, index, memAddress(params));
    }

    // --- [ glNamedRenderbufferStorageEXT ] ---

    /** {@code void glNamedRenderbufferStorageEXT(GLuint renderbuffer, GLenum internalformat, GLsizei width, GLsizei height)} */
    public static native void glNamedRenderbufferStorageEXT(@NativeType("GLuint") int renderbuffer, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glGetNamedRenderbufferParameterivEXT ] ---

    /** {@code void glGetNamedRenderbufferParameterivEXT(GLuint renderbuffer, GLenum pname, GLint * params)} */
    public static native void nglGetNamedRenderbufferParameterivEXT(int renderbuffer, int pname, long params);

    /** {@code void glGetNamedRenderbufferParameterivEXT(GLuint renderbuffer, GLenum pname, GLint * params)} */
    public static void glGetNamedRenderbufferParameterivEXT(@NativeType("GLuint") int renderbuffer, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetNamedRenderbufferParameterivEXT(renderbuffer, pname, memAddress(params));
    }

    /** {@code void glGetNamedRenderbufferParameterivEXT(GLuint renderbuffer, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetNamedRenderbufferParameteriEXT(@NativeType("GLuint") int renderbuffer, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetNamedRenderbufferParameterivEXT(renderbuffer, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glNamedRenderbufferStorageMultisampleEXT ] ---

    /** {@code void glNamedRenderbufferStorageMultisampleEXT(GLuint renderbuffer, GLsizei samples, GLenum internalformat, GLsizei width, GLsizei height)} */
    public static native void glNamedRenderbufferStorageMultisampleEXT(@NativeType("GLuint") int renderbuffer, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glNamedRenderbufferStorageMultisampleCoverageEXT ] ---

    /** {@code void glNamedRenderbufferStorageMultisampleCoverageEXT(GLuint renderbuffer, GLsizei coverageSamples, GLsizei colorSamples, GLenum internalformat, GLsizei width, GLsizei height)} */
    public static native void glNamedRenderbufferStorageMultisampleCoverageEXT(@NativeType("GLuint") int renderbuffer, @NativeType("GLsizei") int coverageSamples, @NativeType("GLsizei") int colorSamples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glCheckNamedFramebufferStatusEXT ] ---

    /** {@code GLenum glCheckNamedFramebufferStatusEXT(GLuint framebuffer, GLenum target)} */
    @NativeType("GLenum")
    public static native int glCheckNamedFramebufferStatusEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int target);

    // --- [ glNamedFramebufferTexture1DEXT ] ---

    /** {@code void glNamedFramebufferTexture1DEXT(GLuint framebuffer, GLenum attachment, GLenum textarget, GLuint texture, GLint level)} */
    public static native void glNamedFramebufferTexture1DEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level);

    // --- [ glNamedFramebufferTexture2DEXT ] ---

    /** {@code void glNamedFramebufferTexture2DEXT(GLuint framebuffer, GLenum attachment, GLenum textarget, GLuint texture, GLint level)} */
    public static native void glNamedFramebufferTexture2DEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level);

    // --- [ glNamedFramebufferTexture3DEXT ] ---

    /** {@code void glNamedFramebufferTexture3DEXT(GLuint framebuffer, GLenum attachment, GLenum textarget, GLuint texture, GLint level, GLint zoffset)} */
    public static native void glNamedFramebufferTexture3DEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int zoffset);

    // --- [ glNamedFramebufferRenderbufferEXT ] ---

    /** {@code void glNamedFramebufferRenderbufferEXT(GLuint framebuffer, GLenum attachment, GLenum renderbuffertarget, GLuint renderbuffer)} */
    public static native void glNamedFramebufferRenderbufferEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int renderbuffertarget, @NativeType("GLuint") int renderbuffer);

    // --- [ glGetNamedFramebufferAttachmentParameterivEXT ] ---

    /** {@code void glGetNamedFramebufferAttachmentParameterivEXT(GLuint framebuffer, GLenum attachment, GLenum pname, GLint * params)} */
    public static native void nglGetNamedFramebufferAttachmentParameterivEXT(int framebuffer, int attachment, int pname, long params);

    /** {@code void glGetNamedFramebufferAttachmentParameterivEXT(GLuint framebuffer, GLenum attachment, GLenum pname, GLint * params)} */
    public static void glGetNamedFramebufferAttachmentParameterivEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetNamedFramebufferAttachmentParameterivEXT(framebuffer, attachment, pname, memAddress(params));
    }

    /** {@code void glGetNamedFramebufferAttachmentParameterivEXT(GLuint framebuffer, GLenum attachment, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetNamedFramebufferAttachmentParameteriEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetNamedFramebufferAttachmentParameterivEXT(framebuffer, attachment, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGenerateTextureMipmapEXT ] ---

    /** {@code void glGenerateTextureMipmapEXT(GLuint texture, GLenum target)} */
    public static native void glGenerateTextureMipmapEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target);

    // --- [ glGenerateMultiTexMipmapEXT ] ---

    /** {@code void glGenerateMultiTexMipmapEXT(GLenum texunit, GLenum target)} */
    public static native void glGenerateMultiTexMipmapEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target);

    // --- [ glFramebufferDrawBufferEXT ] ---

    /** {@code void glFramebufferDrawBufferEXT(GLuint framebuffer, GLenum mode)} */
    public static native void glFramebufferDrawBufferEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int mode);

    // --- [ glFramebufferDrawBuffersEXT ] ---

    /** {@code void glFramebufferDrawBuffersEXT(GLuint framebuffer, GLsizei n, GLenum const * bufs)} */
    public static native void nglFramebufferDrawBuffersEXT(int framebuffer, int n, long bufs);

    /** {@code void glFramebufferDrawBuffersEXT(GLuint framebuffer, GLsizei n, GLenum const * bufs)} */
    public static void glFramebufferDrawBuffersEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") IntBuffer bufs) {
        nglFramebufferDrawBuffersEXT(framebuffer, bufs.remaining(), memAddress(bufs));
    }

    // --- [ glFramebufferReadBufferEXT ] ---

    /** {@code void glFramebufferReadBufferEXT(GLuint framebuffer, GLenum mode)} */
    public static native void glFramebufferReadBufferEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int mode);

    // --- [ glGetFramebufferParameterivEXT ] ---

    /** {@code void glGetFramebufferParameterivEXT(GLuint framebuffer, GLenum pname, GLint * param)} */
    public static native void nglGetFramebufferParameterivEXT(int framebuffer, int pname, long param);

    /** {@code void glGetFramebufferParameterivEXT(GLuint framebuffer, GLenum pname, GLint * param)} */
    public static void glGetFramebufferParameterivEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer param) {
        if (CHECKS) {
            check(param, 1);
        }
        nglGetFramebufferParameterivEXT(framebuffer, pname, memAddress(param));
    }

    /** {@code void glGetFramebufferParameterivEXT(GLuint framebuffer, GLenum pname, GLint * param)} */
    @NativeType("void")
    public static int glGetFramebufferParameteriEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer param = stack.callocInt(1);
            nglGetFramebufferParameterivEXT(framebuffer, pname, memAddress(param));
            return param.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glNamedCopyBufferSubDataEXT ] ---

    /** {@code void glNamedCopyBufferSubDataEXT(GLuint readBuffer, GLuint writeBuffer, GLintptr readOffset, GLintptr writeOffset, GLsizeiptr size)} */
    public static native void glNamedCopyBufferSubDataEXT(@NativeType("GLuint") int readBuffer, @NativeType("GLuint") int writeBuffer, @NativeType("GLintptr") long readOffset, @NativeType("GLintptr") long writeOffset, @NativeType("GLsizeiptr") long size);

    // --- [ glNamedFramebufferTextureEXT ] ---

    /** {@code void glNamedFramebufferTextureEXT(GLuint framebuffer, GLenum attachment, GLuint texture, GLint level)} */
    public static native void glNamedFramebufferTextureEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level);

    // --- [ glNamedFramebufferTextureLayerEXT ] ---

    /** {@code void glNamedFramebufferTextureLayerEXT(GLuint framebuffer, GLenum attachment, GLuint texture, GLint level, GLint layer)} */
    public static native void glNamedFramebufferTextureLayerEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int layer);

    // --- [ glNamedFramebufferTextureFaceEXT ] ---

    /** {@code void glNamedFramebufferTextureFaceEXT(GLuint framebuffer, GLenum attachment, GLuint texture, GLint level, GLenum face)} */
    public static native void glNamedFramebufferTextureFaceEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int face);

    // --- [ glTextureRenderbufferEXT ] ---

    /** {@code void glTextureRenderbufferEXT(GLuint texture, GLenum target, GLuint renderbuffer)} */
    public static native void glTextureRenderbufferEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLuint") int renderbuffer);

    // --- [ glMultiTexRenderbufferEXT ] ---

    /** {@code void glMultiTexRenderbufferEXT(GLenum texunit, GLenum target, GLuint renderbuffer)} */
    public static native void glMultiTexRenderbufferEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLuint") int renderbuffer);

    // --- [ glVertexArrayVertexOffsetEXT ] ---

    /** {@code void glVertexArrayVertexOffsetEXT(GLuint vaobj, GLuint buffer, GLint size, GLenum type, GLsizei stride, GLintptr offset)} */
    public static native void glVertexArrayVertexOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset);

    // --- [ glVertexArrayColorOffsetEXT ] ---

    /** {@code void glVertexArrayColorOffsetEXT(GLuint vaobj, GLuint buffer, GLint size, GLenum type, GLsizei stride, GLintptr offset)} */
    public static native void glVertexArrayColorOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset);

    // --- [ glVertexArrayEdgeFlagOffsetEXT ] ---

    /** {@code void glVertexArrayEdgeFlagOffsetEXT(GLuint vaobj, GLuint buffer, GLsizei stride, GLintptr offset)} */
    public static native void glVertexArrayEdgeFlagOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset);

    // --- [ glVertexArrayIndexOffsetEXT ] ---

    /** {@code void glVertexArrayIndexOffsetEXT(GLuint vaobj, GLuint buffer, GLenum type, GLsizei stride, GLintptr offset)} */
    public static native void glVertexArrayIndexOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset);

    // --- [ glVertexArrayNormalOffsetEXT ] ---

    /** {@code void glVertexArrayNormalOffsetEXT(GLuint vaobj, GLuint buffer, GLenum type, GLsizei stride, GLintptr offset)} */
    public static native void glVertexArrayNormalOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset);

    // --- [ glVertexArrayTexCoordOffsetEXT ] ---

    /** {@code void glVertexArrayTexCoordOffsetEXT(GLuint vaobj, GLuint buffer, GLint size, GLenum type, GLsizei stride, GLintptr offset)} */
    public static native void glVertexArrayTexCoordOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset);

    // --- [ glVertexArrayMultiTexCoordOffsetEXT ] ---

    /** {@code void glVertexArrayMultiTexCoordOffsetEXT(GLuint vaobj, GLuint buffer, GLenum texunit, GLint size, GLenum type, GLsizei stride, GLintptr offset)} */
    public static native void glVertexArrayMultiTexCoordOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLenum") int texunit, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset);

    // --- [ glVertexArrayFogCoordOffsetEXT ] ---

    /** {@code void glVertexArrayFogCoordOffsetEXT(GLuint vaobj, GLuint buffer, GLenum type, GLsizei stride, GLintptr offset)} */
    public static native void glVertexArrayFogCoordOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset);

    // --- [ glVertexArraySecondaryColorOffsetEXT ] ---

    /** {@code void glVertexArraySecondaryColorOffsetEXT(GLuint vaobj, GLuint buffer, GLint size, GLenum type, GLsizei stride, GLintptr offset)} */
    public static native void glVertexArraySecondaryColorOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset);

    // --- [ glVertexArrayVertexAttribOffsetEXT ] ---

    /** {@code void glVertexArrayVertexAttribOffsetEXT(GLuint vaobj, GLuint buffer, GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, GLintptr offset)} */
    public static native void glVertexArrayVertexAttribOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset);

    // --- [ glVertexArrayVertexAttribIOffsetEXT ] ---

    /** {@code void glVertexArrayVertexAttribIOffsetEXT(GLuint vaobj, GLuint buffer, GLuint index, GLint size, GLenum type, GLsizei stride, GLintptr offset)} */
    public static native void glVertexArrayVertexAttribIOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset);

    // --- [ glEnableVertexArrayEXT ] ---

    /** {@code void glEnableVertexArrayEXT(GLuint vaobj, GLenum array)} */
    public static native void glEnableVertexArrayEXT(@NativeType("GLuint") int vaobj, @NativeType("GLenum") int array);

    // --- [ glDisableVertexArrayEXT ] ---

    /** {@code void glDisableVertexArrayEXT(GLuint vaobj, GLenum array)} */
    public static native void glDisableVertexArrayEXT(@NativeType("GLuint") int vaobj, @NativeType("GLenum") int array);

    // --- [ glEnableVertexArrayAttribEXT ] ---

    /** {@code void glEnableVertexArrayAttribEXT(GLuint vaobj, GLuint index)} */
    public static native void glEnableVertexArrayAttribEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index);

    // --- [ glDisableVertexArrayAttribEXT ] ---

    /** {@code void glDisableVertexArrayAttribEXT(GLuint vaobj, GLuint index)} */
    public static native void glDisableVertexArrayAttribEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index);

    // --- [ glGetVertexArrayIntegervEXT ] ---

    /** {@code void glGetVertexArrayIntegervEXT(GLuint vaobj, GLenum pname, GLint * param)} */
    public static native void nglGetVertexArrayIntegervEXT(int vaobj, int pname, long param);

    /** {@code void glGetVertexArrayIntegervEXT(GLuint vaobj, GLenum pname, GLint * param)} */
    public static void glGetVertexArrayIntegervEXT(@NativeType("GLuint") int vaobj, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer param) {
        if (CHECKS) {
            check(param, 1);
        }
        nglGetVertexArrayIntegervEXT(vaobj, pname, memAddress(param));
    }

    /** {@code void glGetVertexArrayIntegervEXT(GLuint vaobj, GLenum pname, GLint * param)} */
    @NativeType("void")
    public static int glGetVertexArrayIntegerEXT(@NativeType("GLuint") int vaobj, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer param = stack.callocInt(1);
            nglGetVertexArrayIntegervEXT(vaobj, pname, memAddress(param));
            return param.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetVertexArrayPointervEXT ] ---

    /** {@code void glGetVertexArrayPointervEXT(GLuint vaobj, GLenum pname, void ** param)} */
    public static native void nglGetVertexArrayPointervEXT(int vaobj, int pname, long param);

    /** {@code void glGetVertexArrayPointervEXT(GLuint vaobj, GLenum pname, void ** param)} */
    public static void glGetVertexArrayPointervEXT(@NativeType("GLuint") int vaobj, @NativeType("GLenum") int pname, @NativeType("void **") PointerBuffer param) {
        if (CHECKS) {
            check(param, 1);
        }
        nglGetVertexArrayPointervEXT(vaobj, pname, memAddress(param));
    }

    /** {@code void glGetVertexArrayPointervEXT(GLuint vaobj, GLenum pname, void ** param)} */
    @NativeType("void")
    public static long glGetVertexArrayPointerEXT(@NativeType("GLuint") int vaobj, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer param = stack.callocPointer(1);
            nglGetVertexArrayPointervEXT(vaobj, pname, memAddress(param));
            return param.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetVertexArrayIntegeri_vEXT ] ---

    /** {@code void glGetVertexArrayIntegeri_vEXT(GLuint vaobj, GLuint index, GLenum pname, GLint * param)} */
    public static native void nglGetVertexArrayIntegeri_vEXT(int vaobj, int index, int pname, long param);

    /** {@code void glGetVertexArrayIntegeri_vEXT(GLuint vaobj, GLuint index, GLenum pname, GLint * param)} */
    public static void glGetVertexArrayIntegeri_vEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer param) {
        if (CHECKS) {
            check(param, 1);
        }
        nglGetVertexArrayIntegeri_vEXT(vaobj, index, pname, memAddress(param));
    }

    /** {@code void glGetVertexArrayIntegeri_vEXT(GLuint vaobj, GLuint index, GLenum pname, GLint * param)} */
    @NativeType("void")
    public static int glGetVertexArrayIntegeriEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer param = stack.callocInt(1);
            nglGetVertexArrayIntegeri_vEXT(vaobj, index, pname, memAddress(param));
            return param.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetVertexArrayPointeri_vEXT ] ---

    /** {@code void glGetVertexArrayPointeri_vEXT(GLuint vaobj, GLuint index, GLenum pname, void ** param)} */
    public static native void nglGetVertexArrayPointeri_vEXT(int vaobj, int index, int pname, long param);

    /** {@code void glGetVertexArrayPointeri_vEXT(GLuint vaobj, GLuint index, GLenum pname, void ** param)} */
    public static void glGetVertexArrayPointeri_vEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("void **") PointerBuffer param) {
        if (CHECKS) {
            check(param, 1);
        }
        nglGetVertexArrayPointeri_vEXT(vaobj, index, pname, memAddress(param));
    }

    /** {@code void glGetVertexArrayPointeri_vEXT(GLuint vaobj, GLuint index, GLenum pname, void ** param)} */
    @NativeType("void")
    public static long glGetVertexArrayPointeriEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer param = stack.callocPointer(1);
            nglGetVertexArrayPointeri_vEXT(vaobj, index, pname, memAddress(param));
            return param.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glMapNamedBufferRangeEXT ] ---

    /** {@code void * glMapNamedBufferRangeEXT(GLuint buffer, GLintptr offset, GLsizeiptr length, GLbitfield access)} */
    public static native long nglMapNamedBufferRangeEXT(int buffer, long offset, long length, int access);

    /** {@code void * glMapNamedBufferRangeEXT(GLuint buffer, GLintptr offset, GLsizeiptr length, GLbitfield access)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapNamedBufferRangeEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length, @NativeType("GLbitfield") int access) {
        long __result = nglMapNamedBufferRangeEXT(buffer, offset, length, access);
        return memByteBufferSafe(__result, (int)length);
    }

    /** {@code void * glMapNamedBufferRangeEXT(GLuint buffer, GLintptr offset, GLsizeiptr length, GLbitfield access)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapNamedBufferRangeEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length, @NativeType("GLbitfield") int access, @Nullable ByteBuffer old_buffer) {
        long __result = nglMapNamedBufferRangeEXT(buffer, offset, length, access);
        return apiGetMappedBuffer(old_buffer, __result, (int)length);
    }

    // --- [ glFlushMappedNamedBufferRangeEXT ] ---

    /** {@code void glFlushMappedNamedBufferRangeEXT(GLuint buffer, GLintptr offset, GLsizeiptr length)} */
    public static native void glFlushMappedNamedBufferRangeEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length);

    /** {@code void glMatrixLoadfEXT(GLenum matrixMode, GLfloat const * m)} */
    public static void glMatrixLoadfEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") float[] m) {
        long __functionAddress = GL.getICD().glMatrixLoadfEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 16);
        }
        callPV(matrixMode, m, __functionAddress);
    }

    /** {@code void glMatrixLoaddEXT(GLenum matrixMode, GLdouble const * m)} */
    public static void glMatrixLoaddEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLdouble const *") double[] m) {
        long __functionAddress = GL.getICD().glMatrixLoaddEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 16);
        }
        callPV(matrixMode, m, __functionAddress);
    }

    /** {@code void glMatrixMultfEXT(GLenum matrixMode, GLfloat const * m)} */
    public static void glMatrixMultfEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") float[] m) {
        long __functionAddress = GL.getICD().glMatrixMultfEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 16);
        }
        callPV(matrixMode, m, __functionAddress);
    }

    /** {@code void glMatrixMultdEXT(GLenum matrixMode, GLdouble const * m)} */
    public static void glMatrixMultdEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLdouble const *") double[] m) {
        long __functionAddress = GL.getICD().glMatrixMultdEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 16);
        }
        callPV(matrixMode, m, __functionAddress);
    }

    /** {@code void glTextureParameterivEXT(GLuint texture, GLenum target, GLenum pname, GLint const * param)} */
    public static void glTextureParameterivEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] param) {
        long __functionAddress = GL.getICD().glTextureParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 4);
        }
        callPV(texture, target, pname, param, __functionAddress);
    }

    /** {@code void glTextureParameterfvEXT(GLuint texture, GLenum target, GLenum pname, GLfloat const * param)} */
    public static void glTextureParameterfvEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] param) {
        long __functionAddress = GL.getICD().glTextureParameterfvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 4);
        }
        callPV(texture, target, pname, param, __functionAddress);
    }

    /** {@code void glTextureImage1DEXT(GLuint texture, GLenum target, GLint level, GLint internalformat, GLsizei width, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short @Nullable [] pixels) {
        long __functionAddress = GL.getICD().glTextureImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, internalformat, width, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glTextureImage1DEXT(GLuint texture, GLenum target, GLint level, GLint internalformat, GLsizei width, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int @Nullable [] pixels) {
        long __functionAddress = GL.getICD().glTextureImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, internalformat, width, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glTextureImage1DEXT(GLuint texture, GLenum target, GLint level, GLint internalformat, GLsizei width, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float @Nullable [] pixels) {
        long __functionAddress = GL.getICD().glTextureImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, internalformat, width, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glTextureImage1DEXT(GLuint texture, GLenum target, GLint level, GLint internalformat, GLsizei width, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double @Nullable [] pixels) {
        long __functionAddress = GL.getICD().glTextureImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, internalformat, width, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glTextureImage2DEXT(GLuint texture, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short @Nullable [] pixels) {
        long __functionAddress = GL.getICD().glTextureImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, internalformat, width, height, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glTextureImage2DEXT(GLuint texture, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int @Nullable [] pixels) {
        long __functionAddress = GL.getICD().glTextureImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, internalformat, width, height, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glTextureImage2DEXT(GLuint texture, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float @Nullable [] pixels) {
        long __functionAddress = GL.getICD().glTextureImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, internalformat, width, height, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glTextureImage2DEXT(GLuint texture, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double @Nullable [] pixels) {
        long __functionAddress = GL.getICD().glTextureImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, internalformat, width, height, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glTextureSubImage1DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, xoffset, width, format, type, pixels, __functionAddress);
    }

    /** {@code void glTextureSubImage1DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, xoffset, width, format, type, pixels, __functionAddress);
    }

    /** {@code void glTextureSubImage1DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, xoffset, width, format, type, pixels, __functionAddress);
    }

    /** {@code void glTextureSubImage1DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, xoffset, width, format, type, pixels, __functionAddress);
    }

    /** {@code void glTextureSubImage2DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
    }

    /** {@code void glTextureSubImage2DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
    }

    /** {@code void glTextureSubImage2DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
    }

    /** {@code void glTextureSubImage2DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
    }

    /** {@code void glGetTextureImageEXT(GLuint texture, GLenum target, GLint level, GLenum format, GLenum type, void * pixels)} */
    public static void glGetTextureImageEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] pixels) {
        long __functionAddress = GL.getICD().glGetTextureImageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, format, type, pixels, __functionAddress);
    }

    /** {@code void glGetTextureImageEXT(GLuint texture, GLenum target, GLint level, GLenum format, GLenum type, void * pixels)} */
    public static void glGetTextureImageEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] pixels) {
        long __functionAddress = GL.getICD().glGetTextureImageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, format, type, pixels, __functionAddress);
    }

    /** {@code void glGetTextureImageEXT(GLuint texture, GLenum target, GLint level, GLenum format, GLenum type, void * pixels)} */
    public static void glGetTextureImageEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] pixels) {
        long __functionAddress = GL.getICD().glGetTextureImageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, format, type, pixels, __functionAddress);
    }

    /** {@code void glGetTextureImageEXT(GLuint texture, GLenum target, GLint level, GLenum format, GLenum type, void * pixels)} */
    public static void glGetTextureImageEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") double[] pixels) {
        long __functionAddress = GL.getICD().glGetTextureImageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, format, type, pixels, __functionAddress);
    }

    /** {@code void glGetTextureParameterfvEXT(GLuint texture, GLenum target, GLenum pname, GLfloat * params)} */
    public static void glGetTextureParameterfvEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetTextureParameterfvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texture, target, pname, params, __functionAddress);
    }

    /** {@code void glGetTextureParameterivEXT(GLuint texture, GLenum target, GLenum pname, GLint * params)} */
    public static void glGetTextureParameterivEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetTextureParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texture, target, pname, params, __functionAddress);
    }

    /** {@code void glGetTextureLevelParameterfvEXT(GLuint texture, GLenum target, GLint level, GLenum pname, GLfloat * params)} */
    public static void glGetTextureLevelParameterfvEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetTextureLevelParameterfvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texture, target, level, pname, params, __functionAddress);
    }

    /** {@code void glGetTextureLevelParameterivEXT(GLuint texture, GLenum target, GLint level, GLenum pname, GLint * params)} */
    public static void glGetTextureLevelParameterivEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetTextureLevelParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texture, target, level, pname, params, __functionAddress);
    }

    /** {@code void glTextureImage3DEXT(GLuint texture, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short @Nullable [] pixels) {
        long __functionAddress = GL.getICD().glTextureImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, internalformat, width, height, depth, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glTextureImage3DEXT(GLuint texture, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int @Nullable [] pixels) {
        long __functionAddress = GL.getICD().glTextureImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, internalformat, width, height, depth, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glTextureImage3DEXT(GLuint texture, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float @Nullable [] pixels) {
        long __functionAddress = GL.getICD().glTextureImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, internalformat, width, height, depth, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glTextureImage3DEXT(GLuint texture, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double @Nullable [] pixels) {
        long __functionAddress = GL.getICD().glTextureImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, internalformat, width, height, depth, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glTextureSubImage3DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

    /** {@code void glTextureSubImage3DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

    /** {@code void glTextureSubImage3DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

    /** {@code void glTextureSubImage3DEXT(GLuint texture, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

    /** {@code void glMultiTexCoordPointerEXT(GLenum texunit, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glMultiTexCoordPointerEXT(@NativeType("GLenum") int texunit, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") short[] pointer) {
        long __functionAddress = GL.getICD().glMultiTexCoordPointerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, size, type, stride, pointer, __functionAddress);
    }

    /** {@code void glMultiTexCoordPointerEXT(GLenum texunit, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glMultiTexCoordPointerEXT(@NativeType("GLenum") int texunit, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") int[] pointer) {
        long __functionAddress = GL.getICD().glMultiTexCoordPointerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, size, type, stride, pointer, __functionAddress);
    }

    /** {@code void glMultiTexCoordPointerEXT(GLenum texunit, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glMultiTexCoordPointerEXT(@NativeType("GLenum") int texunit, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") float[] pointer) {
        long __functionAddress = GL.getICD().glMultiTexCoordPointerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, size, type, stride, pointer, __functionAddress);
    }

    /** {@code void glMultiTexEnvfvEXT(GLenum texunit, GLenum target, GLenum pname, GLfloat const * params)} */
    public static void glMultiTexEnvfvEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glMultiTexEnvfvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(texunit, target, pname, params, __functionAddress);
    }

    /** {@code void glMultiTexEnvivEXT(GLenum texunit, GLenum target, GLenum pname, GLint const * params)} */
    public static void glMultiTexEnvivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glMultiTexEnvivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(texunit, target, pname, params, __functionAddress);
    }

    /** {@code void glMultiTexGendvEXT(GLenum texunit, GLenum coord, GLenum pname, GLdouble const * params)} */
    public static void glMultiTexGendvEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLdouble const *") double[] params) {
        long __functionAddress = GL.getICD().glMultiTexGendvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(texunit, coord, pname, params, __functionAddress);
    }

    /** {@code void glMultiTexGenfvEXT(GLenum texunit, GLenum coord, GLenum pname, GLfloat const * params)} */
    public static void glMultiTexGenfvEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glMultiTexGenfvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(texunit, coord, pname, params, __functionAddress);
    }

    /** {@code void glMultiTexGenivEXT(GLenum texunit, GLenum coord, GLenum pname, GLint const * params)} */
    public static void glMultiTexGenivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glMultiTexGenivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(texunit, coord, pname, params, __functionAddress);
    }

    /** {@code void glGetMultiTexEnvfvEXT(GLenum texunit, GLenum target, GLenum pname, GLfloat * params)} */
    public static void glGetMultiTexEnvfvEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetMultiTexEnvfvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texunit, target, pname, params, __functionAddress);
    }

    /** {@code void glGetMultiTexEnvivEXT(GLenum texunit, GLenum target, GLenum pname, GLint * params)} */
    public static void glGetMultiTexEnvivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetMultiTexEnvivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texunit, target, pname, params, __functionAddress);
    }

    /** {@code void glGetMultiTexGendvEXT(GLenum texunit, GLenum coord, GLenum pname, GLdouble * params)} */
    public static void glGetMultiTexGendvEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLdouble *") double[] params) {
        long __functionAddress = GL.getICD().glGetMultiTexGendvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texunit, coord, pname, params, __functionAddress);
    }

    /** {@code void glGetMultiTexGenfvEXT(GLenum texunit, GLenum coord, GLenum pname, GLfloat * params)} */
    public static void glGetMultiTexGenfvEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetMultiTexGenfvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texunit, coord, pname, params, __functionAddress);
    }

    /** {@code void glGetMultiTexGenivEXT(GLenum texunit, GLenum coord, GLenum pname, GLint * params)} */
    public static void glGetMultiTexGenivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetMultiTexGenivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texunit, coord, pname, params, __functionAddress);
    }

    /** {@code void glMultiTexParameterivEXT(GLenum texunit, GLenum target, GLenum pname, GLint const * param)} */
    public static void glMultiTexParameterivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] param) {
        long __functionAddress = GL.getICD().glMultiTexParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 4);
        }
        callPV(texunit, target, pname, param, __functionAddress);
    }

    /** {@code void glMultiTexParameterfvEXT(GLenum texunit, GLenum target, GLenum pname, GLfloat const * param)} */
    public static void glMultiTexParameterfvEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] param) {
        long __functionAddress = GL.getICD().glMultiTexParameterfvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 4);
        }
        callPV(texunit, target, pname, param, __functionAddress);
    }

    /** {@code void glMultiTexImage1DEXT(GLenum texunit, GLenum target, GLint level, GLint internalformat, GLsizei width, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short @Nullable [] pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, internalformat, width, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glMultiTexImage1DEXT(GLenum texunit, GLenum target, GLint level, GLint internalformat, GLsizei width, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int @Nullable [] pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, internalformat, width, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glMultiTexImage1DEXT(GLenum texunit, GLenum target, GLint level, GLint internalformat, GLsizei width, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float @Nullable [] pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, internalformat, width, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glMultiTexImage1DEXT(GLenum texunit, GLenum target, GLint level, GLint internalformat, GLsizei width, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double @Nullable [] pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, internalformat, width, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glMultiTexImage2DEXT(GLenum texunit, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short @Nullable [] pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, internalformat, width, height, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glMultiTexImage2DEXT(GLenum texunit, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int @Nullable [] pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, internalformat, width, height, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glMultiTexImage2DEXT(GLenum texunit, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float @Nullable [] pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, internalformat, width, height, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glMultiTexImage2DEXT(GLenum texunit, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double @Nullable [] pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, internalformat, width, height, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glMultiTexSubImage1DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexSubImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, xoffset, width, format, type, pixels, __functionAddress);
    }

    /** {@code void glMultiTexSubImage1DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexSubImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, xoffset, width, format, type, pixels, __functionAddress);
    }

    /** {@code void glMultiTexSubImage1DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexSubImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, xoffset, width, format, type, pixels, __functionAddress);
    }

    /** {@code void glMultiTexSubImage1DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexSubImage1DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage1DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, xoffset, width, format, type, pixels, __functionAddress);
    }

    /** {@code void glMultiTexSubImage2DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexSubImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
    }

    /** {@code void glMultiTexSubImage2DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexSubImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
    }

    /** {@code void glMultiTexSubImage2DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexSubImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
    }

    /** {@code void glMultiTexSubImage2DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexSubImage2DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage2DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
    }

    /** {@code void glGetMultiTexImageEXT(GLenum texunit, GLenum target, GLint level, GLenum format, GLenum type, void * pixels)} */
    public static void glGetMultiTexImageEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] pixels) {
        long __functionAddress = GL.getICD().glGetMultiTexImageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, format, type, pixels, __functionAddress);
    }

    /** {@code void glGetMultiTexImageEXT(GLenum texunit, GLenum target, GLint level, GLenum format, GLenum type, void * pixels)} */
    public static void glGetMultiTexImageEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] pixels) {
        long __functionAddress = GL.getICD().glGetMultiTexImageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, format, type, pixels, __functionAddress);
    }

    /** {@code void glGetMultiTexImageEXT(GLenum texunit, GLenum target, GLint level, GLenum format, GLenum type, void * pixels)} */
    public static void glGetMultiTexImageEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] pixels) {
        long __functionAddress = GL.getICD().glGetMultiTexImageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, format, type, pixels, __functionAddress);
    }

    /** {@code void glGetMultiTexImageEXT(GLenum texunit, GLenum target, GLint level, GLenum format, GLenum type, void * pixels)} */
    public static void glGetMultiTexImageEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") double[] pixels) {
        long __functionAddress = GL.getICD().glGetMultiTexImageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, format, type, pixels, __functionAddress);
    }

    /** {@code void glGetMultiTexParameterfvEXT(GLenum texunit, GLenum target, GLenum pname, GLfloat * params)} */
    public static void glGetMultiTexParameterfvEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetMultiTexParameterfvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texunit, target, pname, params, __functionAddress);
    }

    /** {@code void glGetMultiTexParameterivEXT(GLenum texunit, GLenum target, GLenum pname, GLint * params)} */
    public static void glGetMultiTexParameterivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetMultiTexParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texunit, target, pname, params, __functionAddress);
    }

    /** {@code void glGetMultiTexLevelParameterfvEXT(GLenum texunit, GLenum target, GLint level, GLenum pname, GLfloat * params)} */
    public static void glGetMultiTexLevelParameterfvEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetMultiTexLevelParameterfvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texunit, target, level, pname, params, __functionAddress);
    }

    /** {@code void glGetMultiTexLevelParameterivEXT(GLenum texunit, GLenum target, GLint level, GLenum pname, GLint * params)} */
    public static void glGetMultiTexLevelParameterivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetMultiTexLevelParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texunit, target, level, pname, params, __functionAddress);
    }

    /** {@code void glMultiTexImage3DEXT(GLenum texunit, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short @Nullable [] pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, internalformat, width, height, depth, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glMultiTexImage3DEXT(GLenum texunit, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int @Nullable [] pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, internalformat, width, height, depth, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glMultiTexImage3DEXT(GLenum texunit, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float @Nullable [] pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, internalformat, width, height, depth, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glMultiTexImage3DEXT(GLenum texunit, GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double @Nullable [] pixels) {
        long __functionAddress = GL.getICD().glMultiTexImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, internalformat, width, height, depth, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glMultiTexSubImage3DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexSubImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

    /** {@code void glMultiTexSubImage3DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexSubImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

    /** {@code void glMultiTexSubImage3DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexSubImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

    /** {@code void glMultiTexSubImage3DEXT(GLenum texunit, GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glMultiTexSubImage3DEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double[] pixels) {
        long __functionAddress = GL.getICD().glMultiTexSubImage3DEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

    /** {@code void glGetFloatIndexedvEXT(GLenum target, GLuint index, GLfloat * params)} */
    public static void glGetFloatIndexedvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetFloatIndexedvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, index, params, __functionAddress);
    }

    /** {@code void glGetDoubleIndexedvEXT(GLenum target, GLuint index, GLdouble * params)} */
    public static void glGetDoubleIndexedvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble *") double[] params) {
        long __functionAddress = GL.getICD().glGetDoubleIndexedvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, index, params, __functionAddress);
    }

    /** {@code void glGetFloati_vEXT(GLenum pname, GLuint index, GLfloat * params)} */
    public static void glGetFloati_vEXT(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetFloati_vEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(pname, index, params, __functionAddress);
    }

    /** {@code void glGetDoublei_vEXT(GLenum pname, GLuint index, GLdouble * params)} */
    public static void glGetDoublei_vEXT(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLdouble *") double[] params) {
        long __functionAddress = GL.getICD().glGetDoublei_vEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(pname, index, params, __functionAddress);
    }

    /** {@code void glGetIntegerIndexedvEXT(GLenum target, GLuint index, GLint * data)} */
    public static void glGetIntegerIndexedvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint *") int[] data) {
        EXTDrawBuffers2.glGetIntegerIndexedvEXT(target, index, data);
    }

    /** {@code void glNamedProgramLocalParameter4dvEXT(GLuint program, GLenum target, GLuint index, GLdouble const * params)} */
    public static void glNamedProgramLocalParameter4dvEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] params) {
        long __functionAddress = GL.getICD().glNamedProgramLocalParameter4dvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(program, target, index, params, __functionAddress);
    }

    /** {@code void glNamedProgramLocalParameter4fvEXT(GLuint program, GLenum target, GLuint index, GLfloat const * params)} */
    public static void glNamedProgramLocalParameter4fvEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glNamedProgramLocalParameter4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(program, target, index, params, __functionAddress);
    }

    /** {@code void glGetNamedProgramLocalParameterdvEXT(GLuint program, GLenum target, GLuint index, GLdouble * params)} */
    public static void glGetNamedProgramLocalParameterdvEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble *") double[] params) {
        long __functionAddress = GL.getICD().glGetNamedProgramLocalParameterdvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(program, target, index, params, __functionAddress);
    }

    /** {@code void glGetNamedProgramLocalParameterfvEXT(GLuint program, GLenum target, GLuint index, GLfloat * params)} */
    public static void glGetNamedProgramLocalParameterfvEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetNamedProgramLocalParameterfvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(program, target, index, params, __functionAddress);
    }

    /** {@code void glGetNamedProgramivEXT(GLuint program, GLenum target, GLenum pname, GLint * params)} */
    public static void glGetNamedProgramivEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetNamedProgramivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(program, target, pname, params, __functionAddress);
    }

    /** {@code void glMatrixLoadTransposefEXT(GLenum matrixMode, GLfloat const * m)} */
    public static void glMatrixLoadTransposefEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") float[] m) {
        long __functionAddress = GL.getICD().glMatrixLoadTransposefEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 16);
        }
        callPV(matrixMode, m, __functionAddress);
    }

    /** {@code void glMatrixLoadTransposedEXT(GLenum matrixMode, GLdouble const * m)} */
    public static void glMatrixLoadTransposedEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLdouble const *") double[] m) {
        long __functionAddress = GL.getICD().glMatrixLoadTransposedEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 16);
        }
        callPV(matrixMode, m, __functionAddress);
    }

    /** {@code void glMatrixMultTransposefEXT(GLenum matrixMode, GLfloat const * m)} */
    public static void glMatrixMultTransposefEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") float[] m) {
        long __functionAddress = GL.getICD().glMatrixMultTransposefEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 16);
        }
        callPV(matrixMode, m, __functionAddress);
    }

    /** {@code void glMatrixMultTransposedEXT(GLenum matrixMode, GLdouble const * m)} */
    public static void glMatrixMultTransposedEXT(@NativeType("GLenum") int matrixMode, @NativeType("GLdouble const *") double[] m) {
        long __functionAddress = GL.getICD().glMatrixMultTransposedEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 16);
        }
        callPV(matrixMode, m, __functionAddress);
    }

    /** {@code void glNamedBufferDataEXT(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glNamedBufferDataEXT(@NativeType("GLuint") int buffer, @NativeType("void const *") short[] data, @NativeType("GLenum") int usage) {
        long __functionAddress = GL.getICD().glNamedBufferDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, Integer.toUnsignedLong(data.length) << 1, data, usage, __functionAddress);
    }

    /** {@code void glNamedBufferDataEXT(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glNamedBufferDataEXT(@NativeType("GLuint") int buffer, @NativeType("void const *") int[] data, @NativeType("GLenum") int usage) {
        long __functionAddress = GL.getICD().glNamedBufferDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, Integer.toUnsignedLong(data.length) << 2, data, usage, __functionAddress);
    }

    /** {@code void glNamedBufferDataEXT(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glNamedBufferDataEXT(@NativeType("GLuint") int buffer, @NativeType("void const *") float[] data, @NativeType("GLenum") int usage) {
        long __functionAddress = GL.getICD().glNamedBufferDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, Integer.toUnsignedLong(data.length) << 2, data, usage, __functionAddress);
    }

    /** {@code void glNamedBufferDataEXT(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glNamedBufferDataEXT(@NativeType("GLuint") int buffer, @NativeType("void const *") double[] data, @NativeType("GLenum") int usage) {
        long __functionAddress = GL.getICD().glNamedBufferDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, Integer.toUnsignedLong(data.length) << 3, data, usage, __functionAddress);
    }

    /** {@code void glNamedBufferSubDataEXT(GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") short[] data) {
        long __functionAddress = GL.getICD().glNamedBufferSubDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, Integer.toUnsignedLong(data.length) << 1, data, __functionAddress);
    }

    /** {@code void glNamedBufferSubDataEXT(GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") int[] data) {
        long __functionAddress = GL.getICD().glNamedBufferSubDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, Integer.toUnsignedLong(data.length) << 2, data, __functionAddress);
    }

    /** {@code void glNamedBufferSubDataEXT(GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") float[] data) {
        long __functionAddress = GL.getICD().glNamedBufferSubDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, Integer.toUnsignedLong(data.length) << 2, data, __functionAddress);
    }

    /** {@code void glNamedBufferSubDataEXT(GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") double[] data) {
        long __functionAddress = GL.getICD().glNamedBufferSubDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, Integer.toUnsignedLong(data.length) << 3, data, __functionAddress);
    }

    /** {@code void glGetNamedBufferParameterivEXT(GLuint buffer, GLenum pname, GLint * params)} */
    public static void glGetNamedBufferParameterivEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetNamedBufferParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(buffer, pname, params, __functionAddress);
    }

    /** {@code void glGetNamedBufferSubDataEXT(GLuint buffer, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") short[] data) {
        long __functionAddress = GL.getICD().glGetNamedBufferSubDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, Integer.toUnsignedLong(data.length) << 1, data, __functionAddress);
    }

    /** {@code void glGetNamedBufferSubDataEXT(GLuint buffer, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") int[] data) {
        long __functionAddress = GL.getICD().glGetNamedBufferSubDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, Integer.toUnsignedLong(data.length) << 2, data, __functionAddress);
    }

    /** {@code void glGetNamedBufferSubDataEXT(GLuint buffer, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") float[] data) {
        long __functionAddress = GL.getICD().glGetNamedBufferSubDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, Integer.toUnsignedLong(data.length) << 2, data, __functionAddress);
    }

    /** {@code void glGetNamedBufferSubDataEXT(GLuint buffer, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") double[] data) {
        long __functionAddress = GL.getICD().glGetNamedBufferSubDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, Integer.toUnsignedLong(data.length) << 3, data, __functionAddress);
    }

    /** {@code void glProgramUniform1fvEXT(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform1fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniform1fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length, value, __functionAddress);
    }

    /** {@code void glProgramUniform2fvEXT(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform2fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniform2fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 1, value, __functionAddress);
    }

    /** {@code void glProgramUniform3fvEXT(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform3fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniform3fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 3, value, __functionAddress);
    }

    /** {@code void glProgramUniform4fvEXT(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform4fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniform4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 2, value, __functionAddress);
    }

    /** {@code void glProgramUniform1ivEXT(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform1ivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glProgramUniform1ivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length, value, __functionAddress);
    }

    /** {@code void glProgramUniform2ivEXT(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform2ivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glProgramUniform2ivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 1, value, __functionAddress);
    }

    /** {@code void glProgramUniform3ivEXT(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform3ivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glProgramUniform3ivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 3, value, __functionAddress);
    }

    /** {@code void glProgramUniform4ivEXT(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform4ivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glProgramUniform4ivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 2, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix2fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix2fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix2fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 2, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix3fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix3fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix3fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 9, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix4fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix4fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 4, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix2x3fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix2x3fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix2x3fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 6, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix3x2fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix3x2fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix3x2fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 6, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix2x4fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix2x4fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix2x4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 3, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix4x2fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix4x2fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix4x2fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 3, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix3x4fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix3x4fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix3x4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 12, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix4x3fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix4x3fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix4x3fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 12, transpose, value, __functionAddress);
    }

    /** {@code void glTextureParameterIivEXT(GLuint texture, GLenum target, GLenum pname, GLint const * params)} */
    public static void glTextureParameterIivEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glTextureParameterIivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(texture, target, pname, params, __functionAddress);
    }

    /** {@code void glTextureParameterIuivEXT(GLuint texture, GLenum target, GLenum pname, GLuint const * params)} */
    public static void glTextureParameterIuivEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int[] params) {
        long __functionAddress = GL.getICD().glTextureParameterIuivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(texture, target, pname, params, __functionAddress);
    }

    /** {@code void glGetTextureParameterIivEXT(GLuint texture, GLenum target, GLenum pname, GLint * params)} */
    public static void glGetTextureParameterIivEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetTextureParameterIivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texture, target, pname, params, __functionAddress);
    }

    /** {@code void glGetTextureParameterIuivEXT(GLuint texture, GLenum target, GLenum pname, GLuint * params)} */
    public static void glGetTextureParameterIuivEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glGetTextureParameterIuivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texture, target, pname, params, __functionAddress);
    }

    /** {@code void glMultiTexParameterIivEXT(GLenum texunit, GLenum target, GLenum pname, GLint const * params)} */
    public static void glMultiTexParameterIivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glMultiTexParameterIivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(texunit, target, pname, params, __functionAddress);
    }

    /** {@code void glMultiTexParameterIuivEXT(GLenum texunit, GLenum target, GLenum pname, GLuint const * params)} */
    public static void glMultiTexParameterIuivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int[] params) {
        long __functionAddress = GL.getICD().glMultiTexParameterIuivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(texunit, target, pname, params, __functionAddress);
    }

    /** {@code void glGetMultiTexParameterIivEXT(GLenum texunit, GLenum target, GLenum pname, GLint * params)} */
    public static void glGetMultiTexParameterIivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetMultiTexParameterIivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texunit, target, pname, params, __functionAddress);
    }

    /** {@code void glGetMultiTexParameterIuivEXT(GLenum texunit, GLenum target, GLenum pname, GLuint * params)} */
    public static void glGetMultiTexParameterIuivEXT(@NativeType("GLenum") int texunit, @NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glGetMultiTexParameterIuivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texunit, target, pname, params, __functionAddress);
    }

    /** {@code void glProgramUniform1uivEXT(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform1uivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glProgramUniform1uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length, value, __functionAddress);
    }

    /** {@code void glProgramUniform2uivEXT(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform2uivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glProgramUniform2uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 1, value, __functionAddress);
    }

    /** {@code void glProgramUniform3uivEXT(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform3uivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glProgramUniform3uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 3, value, __functionAddress);
    }

    /** {@code void glProgramUniform4uivEXT(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform4uivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glProgramUniform4uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 2, value, __functionAddress);
    }

    /** {@code void glNamedProgramLocalParameters4fvEXT(GLuint program, GLenum target, GLuint index, GLsizei count, GLfloat const * params)} */
    public static void glNamedProgramLocalParameters4fvEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glNamedProgramLocalParameters4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, target, index, params.length >> 2, params, __functionAddress);
    }

    /** {@code void glNamedProgramLocalParameterI4ivEXT(GLuint program, GLenum target, GLuint index, GLint const * params)} */
    public static void glNamedProgramLocalParameterI4ivEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glNamedProgramLocalParameterI4ivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(program, target, index, params, __functionAddress);
    }

    /** {@code void glNamedProgramLocalParametersI4ivEXT(GLuint program, GLenum target, GLuint index, GLsizei count, GLint const * params)} */
    public static void glNamedProgramLocalParametersI4ivEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glNamedProgramLocalParametersI4ivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, target, index, params.length >> 2, params, __functionAddress);
    }

    /** {@code void glNamedProgramLocalParameterI4uivEXT(GLuint program, GLenum target, GLuint index, GLuint const * params)} */
    public static void glNamedProgramLocalParameterI4uivEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint const *") int[] params) {
        long __functionAddress = GL.getICD().glNamedProgramLocalParameterI4uivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(program, target, index, params, __functionAddress);
    }

    /** {@code void glNamedProgramLocalParametersI4uivEXT(GLuint program, GLenum target, GLuint index, GLsizei count, GLuint const * params)} */
    public static void glNamedProgramLocalParametersI4uivEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint const *") int[] params) {
        long __functionAddress = GL.getICD().glNamedProgramLocalParametersI4uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, target, index, params.length >> 2, params, __functionAddress);
    }

    /** {@code void glGetNamedProgramLocalParameterIivEXT(GLuint program, GLenum target, GLuint index, GLint * params)} */
    public static void glGetNamedProgramLocalParameterIivEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetNamedProgramLocalParameterIivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(program, target, index, params, __functionAddress);
    }

    /** {@code void glGetNamedProgramLocalParameterIuivEXT(GLuint program, GLenum target, GLuint index, GLuint * params)} */
    public static void glGetNamedProgramLocalParameterIuivEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glGetNamedProgramLocalParameterIuivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(program, target, index, params, __functionAddress);
    }

    /** {@code void glGetNamedRenderbufferParameterivEXT(GLuint renderbuffer, GLenum pname, GLint * params)} */
    public static void glGetNamedRenderbufferParameterivEXT(@NativeType("GLuint") int renderbuffer, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetNamedRenderbufferParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(renderbuffer, pname, params, __functionAddress);
    }

    /** {@code void glGetNamedFramebufferAttachmentParameterivEXT(GLuint framebuffer, GLenum attachment, GLenum pname, GLint * params)} */
    public static void glGetNamedFramebufferAttachmentParameterivEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetNamedFramebufferAttachmentParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(framebuffer, attachment, pname, params, __functionAddress);
    }

    /** {@code void glFramebufferDrawBuffersEXT(GLuint framebuffer, GLsizei n, GLenum const * bufs)} */
    public static void glFramebufferDrawBuffersEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") int[] bufs) {
        long __functionAddress = GL.getICD().glFramebufferDrawBuffersEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(framebuffer, bufs.length, bufs, __functionAddress);
    }

    /** {@code void glGetFramebufferParameterivEXT(GLuint framebuffer, GLenum pname, GLint * param)} */
    public static void glGetFramebufferParameterivEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] param) {
        long __functionAddress = GL.getICD().glGetFramebufferParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 1);
        }
        callPV(framebuffer, pname, param, __functionAddress);
    }

    /** {@code void glGetVertexArrayIntegervEXT(GLuint vaobj, GLenum pname, GLint * param)} */
    public static void glGetVertexArrayIntegervEXT(@NativeType("GLuint") int vaobj, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] param) {
        long __functionAddress = GL.getICD().glGetVertexArrayIntegervEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 1);
        }
        callPV(vaobj, pname, param, __functionAddress);
    }

    /** {@code void glGetVertexArrayIntegeri_vEXT(GLuint vaobj, GLuint index, GLenum pname, GLint * param)} */
    public static void glGetVertexArrayIntegeri_vEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] param) {
        long __functionAddress = GL.getICD().glGetVertexArrayIntegeri_vEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 1);
        }
        callPV(vaobj, index, pname, param, __functionAddress);
    }

}