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
import static org.lwjgl.system.MemoryUtil.*;

public class GL13C extends GL12C {

    static { GL.initialize(); }

    public static final int
        GL_COMPRESSED_RGB  = 0x84ED,
        GL_COMPRESSED_RGBA = 0x84EE;

    public static final int GL_TEXTURE_COMPRESSION_HINT = 0x84EF;

    public static final int
        GL_TEXTURE_COMPRESSED_IMAGE_SIZE = 0x86A0,
        GL_TEXTURE_COMPRESSED            = 0x86A1;

    public static final int
        GL_NUM_COMPRESSED_TEXTURE_FORMATS = 0x86A2,
        GL_COMPRESSED_TEXTURE_FORMATS     = 0x86A3;

    public static final int GL_TEXTURE_CUBE_MAP = 0x8513;

    public static final int GL_TEXTURE_BINDING_CUBE_MAP = 0x8514;

    public static final int
        GL_TEXTURE_CUBE_MAP_POSITIVE_X = 0x8515,
        GL_TEXTURE_CUBE_MAP_NEGATIVE_X = 0x8516,
        GL_TEXTURE_CUBE_MAP_POSITIVE_Y = 0x8517,
        GL_TEXTURE_CUBE_MAP_NEGATIVE_Y = 0x8518,
        GL_TEXTURE_CUBE_MAP_POSITIVE_Z = 0x8519,
        GL_TEXTURE_CUBE_MAP_NEGATIVE_Z = 0x851A;

    public static final int GL_PROXY_TEXTURE_CUBE_MAP = 0x851B;

    public static final int GL_MAX_CUBE_MAP_TEXTURE_SIZE = 0x851C;

    public static final int
        GL_MULTISAMPLE              = 0x809D,
        GL_SAMPLE_ALPHA_TO_COVERAGE = 0x809E,
        GL_SAMPLE_ALPHA_TO_ONE      = 0x809F,
        GL_SAMPLE_COVERAGE          = 0x80A0;

    public static final int
        GL_SAMPLE_BUFFERS         = 0x80A8,
        GL_SAMPLES                = 0x80A9,
        GL_SAMPLE_COVERAGE_VALUE  = 0x80AA,
        GL_SAMPLE_COVERAGE_INVERT = 0x80AB;

    public static final int
        GL_TEXTURE0  = 0x84C0,
        GL_TEXTURE1  = 0x84C1,
        GL_TEXTURE2  = 0x84C2,
        GL_TEXTURE3  = 0x84C3,
        GL_TEXTURE4  = 0x84C4,
        GL_TEXTURE5  = 0x84C5,
        GL_TEXTURE6  = 0x84C6,
        GL_TEXTURE7  = 0x84C7,
        GL_TEXTURE8  = 0x84C8,
        GL_TEXTURE9  = 0x84C9,
        GL_TEXTURE10 = 0x84CA,
        GL_TEXTURE11 = 0x84CB,
        GL_TEXTURE12 = 0x84CC,
        GL_TEXTURE13 = 0x84CD,
        GL_TEXTURE14 = 0x84CE,
        GL_TEXTURE15 = 0x84CF,
        GL_TEXTURE16 = 0x84D0,
        GL_TEXTURE17 = 0x84D1,
        GL_TEXTURE18 = 0x84D2,
        GL_TEXTURE19 = 0x84D3,
        GL_TEXTURE20 = 0x84D4,
        GL_TEXTURE21 = 0x84D5,
        GL_TEXTURE22 = 0x84D6,
        GL_TEXTURE23 = 0x84D7,
        GL_TEXTURE24 = 0x84D8,
        GL_TEXTURE25 = 0x84D9,
        GL_TEXTURE26 = 0x84DA,
        GL_TEXTURE27 = 0x84DB,
        GL_TEXTURE28 = 0x84DC,
        GL_TEXTURE29 = 0x84DD,
        GL_TEXTURE30 = 0x84DE,
        GL_TEXTURE31 = 0x84DF;

    public static final int GL_ACTIVE_TEXTURE = 0x84E0;

    public static final int GL_CLAMP_TO_BORDER = 0x812D;

    protected GL13C() {
        throw new UnsupportedOperationException();
    }

    // --- [ glCompressedTexImage3D ] ---

    /** {@code void glCompressedTexImage3D(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLsizei imageSize, void const * data)} */
    public static native void nglCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data);

    /** {@code void glCompressedTexImage3D(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTexImage3D(target, level, internalformat, width, height, depth, border, imageSize, data);
    }

    /** {@code void glCompressedTexImage3D(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("void const *") @Nullable ByteBuffer data) {
        nglCompressedTexImage3D(target, level, internalformat, width, height, depth, border, remainingSafe(data), memAddressSafe(data));
    }

    // --- [ glCompressedTexImage2D ] ---

    /** {@code void glCompressedTexImage2D(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLint border, GLsizei imageSize, void const * data)} */
    public static native void nglCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, long data);

    /** {@code void glCompressedTexImage2D(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLint border, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data);
    }

    /** {@code void glCompressedTexImage2D(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLint border, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("void const *") @Nullable ByteBuffer data) {
        nglCompressedTexImage2D(target, level, internalformat, width, height, border, remainingSafe(data), memAddressSafe(data));
    }

    // --- [ glCompressedTexImage1D ] ---

    /** {@code void glCompressedTexImage1D(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLint border, GLsizei imageSize, void const * data)} */
    public static native void nglCompressedTexImage1D(int target, int level, int internalformat, int width, int border, int imageSize, long data);

    /** {@code void glCompressedTexImage1D(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLint border, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTexImage1D(target, level, internalformat, width, border, imageSize, data);
    }

    /** {@code void glCompressedTexImage1D(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLint border, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("void const *") @Nullable ByteBuffer data) {
        nglCompressedTexImage1D(target, level, internalformat, width, border, remainingSafe(data), memAddressSafe(data));
    }

    // --- [ glCompressedTexSubImage3D ] ---

    /** {@code void glCompressedTexSubImage3D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLsizei imageSize, void const * data)} */
    public static native void nglCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data);

    /** {@code void glCompressedTexSubImage3D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
    }

    /** {@code void glCompressedTexSubImage3D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        nglCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, data.remaining(), memAddress(data));
    }

    // --- [ glCompressedTexSubImage2D ] ---

    /** {@code void glCompressedTexSubImage2D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLsizei imageSize, void const * data)} */
    public static native void nglCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data);

    /** {@code void glCompressedTexSubImage2D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data);
    }

    /** {@code void glCompressedTexSubImage2D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        nglCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, data.remaining(), memAddress(data));
    }

    // --- [ glCompressedTexSubImage1D ] ---

    /** {@code void glCompressedTexSubImage1D(GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLsizei imageSize, void const * data)} */
    public static native void nglCompressedTexSubImage1D(int target, int level, int xoffset, int width, int format, int imageSize, long data);

    /** {@code void glCompressedTexSubImage1D(GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTexSubImage1D(target, level, xoffset, width, format, imageSize, data);
    }

    /** {@code void glCompressedTexSubImage1D(GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        nglCompressedTexSubImage1D(target, level, xoffset, width, format, data.remaining(), memAddress(data));
    }

    // --- [ glGetCompressedTexImage ] ---

    /** {@code void glGetCompressedTexImage(GLenum target, GLint level, void * pixels)} */
    public static native void nglGetCompressedTexImage(int target, int level, long pixels);

    /** {@code void glGetCompressedTexImage(GLenum target, GLint level, void * pixels)} */
    public static void glGetCompressedTexImage(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("void *") ByteBuffer pixels) {
        if (CHECKS) {
            if (DEBUG) {
                check(pixels, GL11.glGetTexLevelParameteri(target, level, GL_TEXTURE_COMPRESSED_IMAGE_SIZE));
            }
        }
        nglGetCompressedTexImage(target, level, memAddress(pixels));
    }

    /** {@code void glGetCompressedTexImage(GLenum target, GLint level, void * pixels)} */
    public static void glGetCompressedTexImage(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("void *") long pixels) {
        nglGetCompressedTexImage(target, level, pixels);
    }

    // --- [ glSampleCoverage ] ---

    /** {@code void glSampleCoverage(GLfloat value, GLboolean invert)} */
    public static native void glSampleCoverage(@NativeType("GLfloat") float value, @NativeType("GLboolean") boolean invert);

    // --- [ glActiveTexture ] ---

    /** {@code void glActiveTexture(GLenum texture)} */
    public static native void glActiveTexture(@NativeType("GLenum") int texture);

}