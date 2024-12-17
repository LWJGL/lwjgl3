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
import static org.lwjgl.system.MemoryUtil.*;

public class GL12C extends GL11C {

    static { GL.initialize(); }

    public static final int
        GL_ALIASED_LINE_WIDTH_RANGE      = 0x846E,
        GL_SMOOTH_POINT_SIZE_RANGE       = 0xB12,
        GL_SMOOTH_POINT_SIZE_GRANULARITY = 0xB13,
        GL_SMOOTH_LINE_WIDTH_RANGE       = 0xB22,
        GL_SMOOTH_LINE_WIDTH_GRANULARITY = 0xB23;

    public static final int GL_TEXTURE_BINDING_3D = 0x806A;

    public static final int
        GL_PACK_SKIP_IMAGES    = 0x806B,
        GL_PACK_IMAGE_HEIGHT   = 0x806C,
        GL_UNPACK_SKIP_IMAGES  = 0x806D,
        GL_UNPACK_IMAGE_HEIGHT = 0x806E;

    public static final int GL_TEXTURE_3D = 0x806F;

    public static final int GL_PROXY_TEXTURE_3D = 0x8070;

    public static final int GL_TEXTURE_DEPTH = 0x8071;

    public static final int GL_TEXTURE_WRAP_R = 0x8072;

    public static final int GL_MAX_3D_TEXTURE_SIZE = 0x8073;

    public static final int
        GL_BGR  = 0x80E0,
        GL_BGRA = 0x80E1;

    public static final int
        GL_UNSIGNED_BYTE_3_3_2         = 0x8032,
        GL_UNSIGNED_BYTE_2_3_3_REV     = 0x8362,
        GL_UNSIGNED_SHORT_5_6_5        = 0x8363,
        GL_UNSIGNED_SHORT_5_6_5_REV    = 0x8364,
        GL_UNSIGNED_SHORT_4_4_4_4      = 0x8033,
        GL_UNSIGNED_SHORT_4_4_4_4_REV  = 0x8365,
        GL_UNSIGNED_SHORT_5_5_5_1      = 0x8034,
        GL_UNSIGNED_SHORT_1_5_5_5_REV  = 0x8366,
        GL_UNSIGNED_INT_8_8_8_8        = 0x8035,
        GL_UNSIGNED_INT_8_8_8_8_REV    = 0x8367,
        GL_UNSIGNED_INT_10_10_10_2     = 0x8036,
        GL_UNSIGNED_INT_2_10_10_10_REV = 0x8368;

    public static final int GL_CLAMP_TO_EDGE = 0x812F;

    public static final int
        GL_TEXTURE_MIN_LOD    = 0x813A,
        GL_TEXTURE_MAX_LOD    = 0x813B,
        GL_TEXTURE_BASE_LEVEL = 0x813C,
        GL_TEXTURE_MAX_LEVEL  = 0x813D;

    public static final int
        GL_MAX_ELEMENTS_VERTICES = 0x80E8,
        GL_MAX_ELEMENTS_INDICES  = 0x80E9;

    protected GL12C() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTexImage3D ] ---

    /** {@code void glTexImage3D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static native void nglTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels);

    /** {@code void glTexImage3D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ByteBuffer pixels) {
        nglTexImage3D(target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glTexImage3D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    /** {@code void glTexImage3D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ShortBuffer pixels) {
        nglTexImage3D(target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glTexImage3D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable IntBuffer pixels) {
        nglTexImage3D(target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glTexImage3D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable FloatBuffer pixels) {
        nglTexImage3D(target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glTexImage3D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable DoubleBuffer pixels) {
        nglTexImage3D(target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    // --- [ glTexSubImage3D ] ---

    /** {@code void glTexSubImage3D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static native void nglTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels);

    /** {@code void glTexSubImage3D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    /** {@code void glTexSubImage3D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    /** {@code void glTexSubImage3D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    /** {@code void glTexSubImage3D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    /** {@code void glTexSubImage3D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    /** {@code void glTexSubImage3D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") DoubleBuffer pixels) {
        nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    // --- [ glCopyTexSubImage3D ] ---

    /** {@code void glCopyTexSubImage3D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static native void glCopyTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glDrawRangeElements ] ---

    /** {@code void glDrawRangeElements(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void const * indices)} */
    public static native void nglDrawRangeElements(int mode, int start, int end, int count, int type, long indices);

    /** {@code void glDrawRangeElements(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void const * indices)} */
    public static void glDrawRangeElements(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices) {
        nglDrawRangeElements(mode, start, end, count, type, indices);
    }

    /** {@code void glDrawRangeElements(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void const * indices)} */
    public static void glDrawRangeElements(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices) {
        nglDrawRangeElements(mode, start, end, indices.remaining() >> GLChecks.typeToByteShift(type), type, memAddress(indices));
    }

    /** {@code void glDrawRangeElements(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void const * indices)} */
    public static void glDrawRangeElements(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("void const *") ByteBuffer indices) {
        nglDrawRangeElements(mode, start, end, indices.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(indices));
    }

    /** {@code void glDrawRangeElements(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void const * indices)} */
    public static void glDrawRangeElements(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("void const *") ShortBuffer indices) {
        nglDrawRangeElements(mode, start, end, indices.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(indices));
    }

    /** {@code void glDrawRangeElements(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void const * indices)} */
    public static void glDrawRangeElements(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("void const *") IntBuffer indices) {
        nglDrawRangeElements(mode, start, end, indices.remaining(), GL11.GL_UNSIGNED_INT, memAddress(indices));
    }

    /** {@code void glTexImage3D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short @Nullable [] pixels) {
        long __functionAddress = GL.getICD().glTexImage3D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, internalformat, width, height, depth, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexImage3D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int @Nullable [] pixels) {
        long __functionAddress = GL.getICD().glTexImage3D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, internalformat, width, height, depth, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexImage3D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float @Nullable [] pixels) {
        long __functionAddress = GL.getICD().glTexImage3D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, internalformat, width, height, depth, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexImage3D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double @Nullable [] pixels) {
        long __functionAddress = GL.getICD().glTexImage3D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, internalformat, width, height, depth, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexSubImage3D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        long __functionAddress = GL.getICD().glTexSubImage3D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexSubImage3D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        long __functionAddress = GL.getICD().glTexSubImage3D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexSubImage3D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        long __functionAddress = GL.getICD().glTexSubImage3D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexSubImage3D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double[] pixels) {
        long __functionAddress = GL.getICD().glTexSubImage3D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

}