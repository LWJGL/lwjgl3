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

public class GL13 extends GL12 {

    static { GL.initialize(); }

    public static final int
        GL_COMPRESSED_ALPHA           = 0x84E9,
        GL_COMPRESSED_LUMINANCE       = 0x84EA,
        GL_COMPRESSED_LUMINANCE_ALPHA = 0x84EB,
        GL_COMPRESSED_INTENSITY       = 0x84EC,
        GL_COMPRESSED_RGB             = 0x84ED,
        GL_COMPRESSED_RGBA            = 0x84EE;

    public static final int GL_TEXTURE_COMPRESSION_HINT = 0x84EF;

    public static final int
        GL_TEXTURE_COMPRESSED_IMAGE_SIZE = 0x86A0,
        GL_TEXTURE_COMPRESSED            = 0x86A1;

    public static final int
        GL_NUM_COMPRESSED_TEXTURE_FORMATS = 0x86A2,
        GL_COMPRESSED_TEXTURE_FORMATS     = 0x86A3;

    public static final int
        GL_NORMAL_MAP     = 0x8511,
        GL_REFLECTION_MAP = 0x8512;

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

    public static final int GL_MULTISAMPLE_BIT = 0x20000000;

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

    public static final int
        GL_ACTIVE_TEXTURE        = 0x84E0,
        GL_CLIENT_ACTIVE_TEXTURE = 0x84E1,
        GL_MAX_TEXTURE_UNITS     = 0x84E2;

    public static final int GL_COMBINE = 0x8570;

    public static final int
        GL_COMBINE_RGB    = 0x8571,
        GL_COMBINE_ALPHA  = 0x8572,
        GL_SOURCE0_RGB    = 0x8580,
        GL_SOURCE1_RGB    = 0x8581,
        GL_SOURCE2_RGB    = 0x8582,
        GL_SOURCE0_ALPHA  = 0x8588,
        GL_SOURCE1_ALPHA  = 0x8589,
        GL_SOURCE2_ALPHA  = 0x858A,
        GL_OPERAND0_RGB   = 0x8590,
        GL_OPERAND1_RGB   = 0x8591,
        GL_OPERAND2_RGB   = 0x8592,
        GL_OPERAND0_ALPHA = 0x8598,
        GL_OPERAND1_ALPHA = 0x8599,
        GL_OPERAND2_ALPHA = 0x859A,
        GL_RGB_SCALE      = 0x8573;

    public static final int
        GL_ADD_SIGNED  = 0x8574,
        GL_INTERPOLATE = 0x8575,
        GL_SUBTRACT    = 0x84E7;

    public static final int
        GL_CONSTANT      = 0x8576,
        GL_PRIMARY_COLOR = 0x8577,
        GL_PREVIOUS      = 0x8578;

    public static final int
        GL_DOT3_RGB  = 0x86AE,
        GL_DOT3_RGBA = 0x86AF;

    public static final int GL_CLAMP_TO_BORDER = 0x812D;

    public static final int
        GL_TRANSPOSE_MODELVIEW_MATRIX  = 0x84E3,
        GL_TRANSPOSE_PROJECTION_MATRIX = 0x84E4,
        GL_TRANSPOSE_TEXTURE_MATRIX    = 0x84E5,
        GL_TRANSPOSE_COLOR_MATRIX      = 0x84E6;

    protected GL13() {
        throw new UnsupportedOperationException();
    }

    // --- [ glCompressedTexImage3D ] ---

    /** {@code void glCompressedTexImage3D(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLsizei imageSize, void const * data)} */
    public static void nglCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data) {
        GL13C.nglCompressedTexImage3D(target, level, internalformat, width, height, depth, border, imageSize, data);
    }

    /** {@code void glCompressedTexImage3D(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        GL13C.glCompressedTexImage3D(target, level, internalformat, width, height, depth, border, imageSize, data);
    }

    /** {@code void glCompressedTexImage3D(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("void const *") @Nullable ByteBuffer data) {
        GL13C.glCompressedTexImage3D(target, level, internalformat, width, height, depth, border, data);
    }

    // --- [ glCompressedTexImage2D ] ---

    /** {@code void glCompressedTexImage2D(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLint border, GLsizei imageSize, void const * data)} */
    public static void nglCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, long data) {
        GL13C.nglCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data);
    }

    /** {@code void glCompressedTexImage2D(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLint border, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        GL13C.glCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data);
    }

    /** {@code void glCompressedTexImage2D(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLint border, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("void const *") @Nullable ByteBuffer data) {
        GL13C.glCompressedTexImage2D(target, level, internalformat, width, height, border, data);
    }

    // --- [ glCompressedTexImage1D ] ---

    /** {@code void glCompressedTexImage1D(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLint border, GLsizei imageSize, void const * data)} */
    public static void nglCompressedTexImage1D(int target, int level, int internalformat, int width, int border, int imageSize, long data) {
        GL13C.nglCompressedTexImage1D(target, level, internalformat, width, border, imageSize, data);
    }

    /** {@code void glCompressedTexImage1D(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLint border, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        GL13C.glCompressedTexImage1D(target, level, internalformat, width, border, imageSize, data);
    }

    /** {@code void glCompressedTexImage1D(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLint border, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("void const *") @Nullable ByteBuffer data) {
        GL13C.glCompressedTexImage1D(target, level, internalformat, width, border, data);
    }

    // --- [ glCompressedTexSubImage3D ] ---

    /** {@code void glCompressedTexSubImage3D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLsizei imageSize, void const * data)} */
    public static void nglCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
        GL13C.nglCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
    }

    /** {@code void glCompressedTexSubImage3D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        GL13C.glCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
    }

    /** {@code void glCompressedTexSubImage3D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        GL13C.glCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, data);
    }

    // --- [ glCompressedTexSubImage2D ] ---

    /** {@code void glCompressedTexSubImage2D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLsizei imageSize, void const * data)} */
    public static void nglCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data) {
        GL13C.nglCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data);
    }

    /** {@code void glCompressedTexSubImage2D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        GL13C.glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data);
    }

    /** {@code void glCompressedTexSubImage2D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        GL13C.glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, data);
    }

    // --- [ glCompressedTexSubImage1D ] ---

    /** {@code void glCompressedTexSubImage1D(GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLsizei imageSize, void const * data)} */
    public static void nglCompressedTexSubImage1D(int target, int level, int xoffset, int width, int format, int imageSize, long data) {
        GL13C.nglCompressedTexSubImage1D(target, level, xoffset, width, format, imageSize, data);
    }

    /** {@code void glCompressedTexSubImage1D(GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        GL13C.glCompressedTexSubImage1D(target, level, xoffset, width, format, imageSize, data);
    }

    /** {@code void glCompressedTexSubImage1D(GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        GL13C.glCompressedTexSubImage1D(target, level, xoffset, width, format, data);
    }

    // --- [ glGetCompressedTexImage ] ---

    /** {@code void glGetCompressedTexImage(GLenum target, GLint level, void * pixels)} */
    public static void nglGetCompressedTexImage(int target, int level, long pixels) {
        GL13C.nglGetCompressedTexImage(target, level, pixels);
    }

    /** {@code void glGetCompressedTexImage(GLenum target, GLint level, void * pixels)} */
    public static void glGetCompressedTexImage(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("void *") ByteBuffer pixels) {
        GL13C.glGetCompressedTexImage(target, level, pixels);
    }

    /** {@code void glGetCompressedTexImage(GLenum target, GLint level, void * pixels)} */
    public static void glGetCompressedTexImage(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("void *") long pixels) {
        GL13C.glGetCompressedTexImage(target, level, pixels);
    }

    // --- [ glSampleCoverage ] ---

    /** {@code void glSampleCoverage(GLfloat value, GLboolean invert)} */
    public static void glSampleCoverage(@NativeType("GLfloat") float value, @NativeType("GLboolean") boolean invert) {
        GL13C.glSampleCoverage(value, invert);
    }

    // --- [ glActiveTexture ] ---

    /** {@code void glActiveTexture(GLenum texture)} */
    public static void glActiveTexture(@NativeType("GLenum") int texture) {
        GL13C.glActiveTexture(texture);
    }

    // --- [ glClientActiveTexture ] ---

    /** {@code void glClientActiveTexture(GLenum texture)} */
    public static native void glClientActiveTexture(@NativeType("GLenum") int texture);

    // --- [ glMultiTexCoord1f ] ---

    /** {@code void glMultiTexCoord1f(GLenum texture, GLfloat s)} */
    public static native void glMultiTexCoord1f(@NativeType("GLenum") int texture, @NativeType("GLfloat") float s);

    // --- [ glMultiTexCoord1s ] ---

    /** {@code void glMultiTexCoord1s(GLenum texture, GLshort s)} */
    public static native void glMultiTexCoord1s(@NativeType("GLenum") int texture, @NativeType("GLshort") short s);

    // --- [ glMultiTexCoord1i ] ---

    /** {@code void glMultiTexCoord1i(GLenum texture, GLint s)} */
    public static native void glMultiTexCoord1i(@NativeType("GLenum") int texture, @NativeType("GLint") int s);

    // --- [ glMultiTexCoord1d ] ---

    /** {@code void glMultiTexCoord1d(GLenum texture, GLdouble s)} */
    public static native void glMultiTexCoord1d(@NativeType("GLenum") int texture, @NativeType("GLdouble") double s);

    // --- [ glMultiTexCoord1fv ] ---

    /** {@code void glMultiTexCoord1fv(GLenum texture, GLfloat const * v)} */
    public static native void nglMultiTexCoord1fv(int texture, long v);

    /** {@code void glMultiTexCoord1fv(GLenum texture, GLfloat const * v)} */
    public static void glMultiTexCoord1fv(@NativeType("GLenum") int texture, @NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglMultiTexCoord1fv(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord1sv ] ---

    /** {@code void glMultiTexCoord1sv(GLenum texture, GLshort const * v)} */
    public static native void nglMultiTexCoord1sv(int texture, long v);

    /** {@code void glMultiTexCoord1sv(GLenum texture, GLshort const * v)} */
    public static void glMultiTexCoord1sv(@NativeType("GLenum") int texture, @NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglMultiTexCoord1sv(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord1iv ] ---

    /** {@code void glMultiTexCoord1iv(GLenum texture, GLint const * v)} */
    public static native void nglMultiTexCoord1iv(int texture, long v);

    /** {@code void glMultiTexCoord1iv(GLenum texture, GLint const * v)} */
    public static void glMultiTexCoord1iv(@NativeType("GLenum") int texture, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglMultiTexCoord1iv(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord1dv ] ---

    /** {@code void glMultiTexCoord1dv(GLenum texture, GLdouble const * v)} */
    public static native void nglMultiTexCoord1dv(int texture, long v);

    /** {@code void glMultiTexCoord1dv(GLenum texture, GLdouble const * v)} */
    public static void glMultiTexCoord1dv(@NativeType("GLenum") int texture, @NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglMultiTexCoord1dv(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord2f ] ---

    /** {@code void glMultiTexCoord2f(GLenum texture, GLfloat s, GLfloat t)} */
    public static native void glMultiTexCoord2f(@NativeType("GLenum") int texture, @NativeType("GLfloat") float s, @NativeType("GLfloat") float t);

    // --- [ glMultiTexCoord2s ] ---

    /** {@code void glMultiTexCoord2s(GLenum texture, GLshort s, GLshort t)} */
    public static native void glMultiTexCoord2s(@NativeType("GLenum") int texture, @NativeType("GLshort") short s, @NativeType("GLshort") short t);

    // --- [ glMultiTexCoord2i ] ---

    /** {@code void glMultiTexCoord2i(GLenum texture, GLint s, GLint t)} */
    public static native void glMultiTexCoord2i(@NativeType("GLenum") int texture, @NativeType("GLint") int s, @NativeType("GLint") int t);

    // --- [ glMultiTexCoord2d ] ---

    /** {@code void glMultiTexCoord2d(GLenum texture, GLdouble s, GLdouble t)} */
    public static native void glMultiTexCoord2d(@NativeType("GLenum") int texture, @NativeType("GLdouble") double s, @NativeType("GLdouble") double t);

    // --- [ glMultiTexCoord2fv ] ---

    /** {@code void glMultiTexCoord2fv(GLenum texture, GLfloat const * v)} */
    public static native void nglMultiTexCoord2fv(int texture, long v);

    /** {@code void glMultiTexCoord2fv(GLenum texture, GLfloat const * v)} */
    public static void glMultiTexCoord2fv(@NativeType("GLenum") int texture, @NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglMultiTexCoord2fv(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord2sv ] ---

    /** {@code void glMultiTexCoord2sv(GLenum texture, GLshort const * v)} */
    public static native void nglMultiTexCoord2sv(int texture, long v);

    /** {@code void glMultiTexCoord2sv(GLenum texture, GLshort const * v)} */
    public static void glMultiTexCoord2sv(@NativeType("GLenum") int texture, @NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglMultiTexCoord2sv(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord2iv ] ---

    /** {@code void glMultiTexCoord2iv(GLenum texture, GLint const * v)} */
    public static native void nglMultiTexCoord2iv(int texture, long v);

    /** {@code void glMultiTexCoord2iv(GLenum texture, GLint const * v)} */
    public static void glMultiTexCoord2iv(@NativeType("GLenum") int texture, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglMultiTexCoord2iv(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord2dv ] ---

    /** {@code void glMultiTexCoord2dv(GLenum texture, GLdouble const * v)} */
    public static native void nglMultiTexCoord2dv(int texture, long v);

    /** {@code void glMultiTexCoord2dv(GLenum texture, GLdouble const * v)} */
    public static void glMultiTexCoord2dv(@NativeType("GLenum") int texture, @NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglMultiTexCoord2dv(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord3f ] ---

    /** {@code void glMultiTexCoord3f(GLenum texture, GLfloat s, GLfloat t, GLfloat r)} */
    public static native void glMultiTexCoord3f(@NativeType("GLenum") int texture, @NativeType("GLfloat") float s, @NativeType("GLfloat") float t, @NativeType("GLfloat") float r);

    // --- [ glMultiTexCoord3s ] ---

    /** {@code void glMultiTexCoord3s(GLenum texture, GLshort s, GLshort t, GLshort r)} */
    public static native void glMultiTexCoord3s(@NativeType("GLenum") int texture, @NativeType("GLshort") short s, @NativeType("GLshort") short t, @NativeType("GLshort") short r);

    // --- [ glMultiTexCoord3i ] ---

    /** {@code void glMultiTexCoord3i(GLenum texture, GLint s, GLint t, GLint r)} */
    public static native void glMultiTexCoord3i(@NativeType("GLenum") int texture, @NativeType("GLint") int s, @NativeType("GLint") int t, @NativeType("GLint") int r);

    // --- [ glMultiTexCoord3d ] ---

    /** {@code void glMultiTexCoord3d(GLenum texture, GLdouble s, GLdouble t, GLdouble r)} */
    public static native void glMultiTexCoord3d(@NativeType("GLenum") int texture, @NativeType("GLdouble") double s, @NativeType("GLdouble") double t, @NativeType("GLdouble") double r);

    // --- [ glMultiTexCoord3fv ] ---

    /** {@code void glMultiTexCoord3fv(GLenum texture, GLfloat const * v)} */
    public static native void nglMultiTexCoord3fv(int texture, long v);

    /** {@code void glMultiTexCoord3fv(GLenum texture, GLfloat const * v)} */
    public static void glMultiTexCoord3fv(@NativeType("GLenum") int texture, @NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglMultiTexCoord3fv(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord3sv ] ---

    /** {@code void glMultiTexCoord3sv(GLenum texture, GLshort const * v)} */
    public static native void nglMultiTexCoord3sv(int texture, long v);

    /** {@code void glMultiTexCoord3sv(GLenum texture, GLshort const * v)} */
    public static void glMultiTexCoord3sv(@NativeType("GLenum") int texture, @NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglMultiTexCoord3sv(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord3iv ] ---

    /** {@code void glMultiTexCoord3iv(GLenum texture, GLint const * v)} */
    public static native void nglMultiTexCoord3iv(int texture, long v);

    /** {@code void glMultiTexCoord3iv(GLenum texture, GLint const * v)} */
    public static void glMultiTexCoord3iv(@NativeType("GLenum") int texture, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglMultiTexCoord3iv(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord3dv ] ---

    /** {@code void glMultiTexCoord3dv(GLenum texture, GLdouble const * v)} */
    public static native void nglMultiTexCoord3dv(int texture, long v);

    /** {@code void glMultiTexCoord3dv(GLenum texture, GLdouble const * v)} */
    public static void glMultiTexCoord3dv(@NativeType("GLenum") int texture, @NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglMultiTexCoord3dv(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord4f ] ---

    /** {@code void glMultiTexCoord4f(GLenum texture, GLfloat s, GLfloat t, GLfloat r, GLfloat q)} */
    public static native void glMultiTexCoord4f(@NativeType("GLenum") int texture, @NativeType("GLfloat") float s, @NativeType("GLfloat") float t, @NativeType("GLfloat") float r, @NativeType("GLfloat") float q);

    // --- [ glMultiTexCoord4s ] ---

    /** {@code void glMultiTexCoord4s(GLenum texture, GLshort s, GLshort t, GLshort r, GLshort q)} */
    public static native void glMultiTexCoord4s(@NativeType("GLenum") int texture, @NativeType("GLshort") short s, @NativeType("GLshort") short t, @NativeType("GLshort") short r, @NativeType("GLshort") short q);

    // --- [ glMultiTexCoord4i ] ---

    /** {@code void glMultiTexCoord4i(GLenum texture, GLint s, GLint t, GLint r, GLint q)} */
    public static native void glMultiTexCoord4i(@NativeType("GLenum") int texture, @NativeType("GLint") int s, @NativeType("GLint") int t, @NativeType("GLint") int r, @NativeType("GLint") int q);

    // --- [ glMultiTexCoord4d ] ---

    /** {@code void glMultiTexCoord4d(GLenum texture, GLdouble s, GLdouble t, GLdouble r, GLdouble q)} */
    public static native void glMultiTexCoord4d(@NativeType("GLenum") int texture, @NativeType("GLdouble") double s, @NativeType("GLdouble") double t, @NativeType("GLdouble") double r, @NativeType("GLdouble") double q);

    // --- [ glMultiTexCoord4fv ] ---

    /** {@code void glMultiTexCoord4fv(GLenum texture, GLfloat const * v)} */
    public static native void nglMultiTexCoord4fv(int texture, long v);

    /** {@code void glMultiTexCoord4fv(GLenum texture, GLfloat const * v)} */
    public static void glMultiTexCoord4fv(@NativeType("GLenum") int texture, @NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglMultiTexCoord4fv(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord4sv ] ---

    /** {@code void glMultiTexCoord4sv(GLenum texture, GLshort const * v)} */
    public static native void nglMultiTexCoord4sv(int texture, long v);

    /** {@code void glMultiTexCoord4sv(GLenum texture, GLshort const * v)} */
    public static void glMultiTexCoord4sv(@NativeType("GLenum") int texture, @NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglMultiTexCoord4sv(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord4iv ] ---

    /** {@code void glMultiTexCoord4iv(GLenum texture, GLint const * v)} */
    public static native void nglMultiTexCoord4iv(int texture, long v);

    /** {@code void glMultiTexCoord4iv(GLenum texture, GLint const * v)} */
    public static void glMultiTexCoord4iv(@NativeType("GLenum") int texture, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglMultiTexCoord4iv(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord4dv ] ---

    /** {@code void glMultiTexCoord4dv(GLenum texture, GLdouble const * v)} */
    public static native void nglMultiTexCoord4dv(int texture, long v);

    /** {@code void glMultiTexCoord4dv(GLenum texture, GLdouble const * v)} */
    public static void glMultiTexCoord4dv(@NativeType("GLenum") int texture, @NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglMultiTexCoord4dv(texture, memAddress(v));
    }

    // --- [ glLoadTransposeMatrixf ] ---

    /** {@code void glLoadTransposeMatrixf(GLfloat const * m)} */
    public static native void nglLoadTransposeMatrixf(long m);

    /** {@code void glLoadTransposeMatrixf(GLfloat const * m)} */
    public static void glLoadTransposeMatrixf(@NativeType("GLfloat const *") FloatBuffer m) {
        if (CHECKS) {
            check(m, 16);
        }
        nglLoadTransposeMatrixf(memAddress(m));
    }

    // --- [ glLoadTransposeMatrixd ] ---

    /** {@code void glLoadTransposeMatrixd(GLdouble const * m)} */
    public static native void nglLoadTransposeMatrixd(long m);

    /** {@code void glLoadTransposeMatrixd(GLdouble const * m)} */
    public static void glLoadTransposeMatrixd(@NativeType("GLdouble const *") DoubleBuffer m) {
        if (CHECKS) {
            check(m, 16);
        }
        nglLoadTransposeMatrixd(memAddress(m));
    }

    // --- [ glMultTransposeMatrixf ] ---

    /** {@code void glMultTransposeMatrixf(GLfloat const * m)} */
    public static native void nglMultTransposeMatrixf(long m);

    /** {@code void glMultTransposeMatrixf(GLfloat const * m)} */
    public static void glMultTransposeMatrixf(@NativeType("GLfloat const *") FloatBuffer m) {
        if (CHECKS) {
            check(m, 16);
        }
        nglMultTransposeMatrixf(memAddress(m));
    }

    // --- [ glMultTransposeMatrixd ] ---

    /** {@code void glMultTransposeMatrixd(GLdouble const * m)} */
    public static native void nglMultTransposeMatrixd(long m);

    /** {@code void glMultTransposeMatrixd(GLdouble const * m)} */
    public static void glMultTransposeMatrixd(@NativeType("GLdouble const *") DoubleBuffer m) {
        if (CHECKS) {
            check(m, 16);
        }
        nglMultTransposeMatrixd(memAddress(m));
    }

    /** {@code void glMultiTexCoord1fv(GLenum texture, GLfloat const * v)} */
    public static void glMultiTexCoord1fv(@NativeType("GLenum") int texture, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord1fv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(texture, v, __functionAddress);
    }

    /** {@code void glMultiTexCoord1sv(GLenum texture, GLshort const * v)} */
    public static void glMultiTexCoord1sv(@NativeType("GLenum") int texture, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord1sv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(texture, v, __functionAddress);
    }

    /** {@code void glMultiTexCoord1iv(GLenum texture, GLint const * v)} */
    public static void glMultiTexCoord1iv(@NativeType("GLenum") int texture, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord1iv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(texture, v, __functionAddress);
    }

    /** {@code void glMultiTexCoord1dv(GLenum texture, GLdouble const * v)} */
    public static void glMultiTexCoord1dv(@NativeType("GLenum") int texture, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord1dv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(texture, v, __functionAddress);
    }

    /** {@code void glMultiTexCoord2fv(GLenum texture, GLfloat const * v)} */
    public static void glMultiTexCoord2fv(@NativeType("GLenum") int texture, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord2fv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(texture, v, __functionAddress);
    }

    /** {@code void glMultiTexCoord2sv(GLenum texture, GLshort const * v)} */
    public static void glMultiTexCoord2sv(@NativeType("GLenum") int texture, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord2sv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(texture, v, __functionAddress);
    }

    /** {@code void glMultiTexCoord2iv(GLenum texture, GLint const * v)} */
    public static void glMultiTexCoord2iv(@NativeType("GLenum") int texture, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord2iv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(texture, v, __functionAddress);
    }

    /** {@code void glMultiTexCoord2dv(GLenum texture, GLdouble const * v)} */
    public static void glMultiTexCoord2dv(@NativeType("GLenum") int texture, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord2dv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(texture, v, __functionAddress);
    }

    /** {@code void glMultiTexCoord3fv(GLenum texture, GLfloat const * v)} */
    public static void glMultiTexCoord3fv(@NativeType("GLenum") int texture, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord3fv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(texture, v, __functionAddress);
    }

    /** {@code void glMultiTexCoord3sv(GLenum texture, GLshort const * v)} */
    public static void glMultiTexCoord3sv(@NativeType("GLenum") int texture, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord3sv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(texture, v, __functionAddress);
    }

    /** {@code void glMultiTexCoord3iv(GLenum texture, GLint const * v)} */
    public static void glMultiTexCoord3iv(@NativeType("GLenum") int texture, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord3iv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(texture, v, __functionAddress);
    }

    /** {@code void glMultiTexCoord3dv(GLenum texture, GLdouble const * v)} */
    public static void glMultiTexCoord3dv(@NativeType("GLenum") int texture, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord3dv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(texture, v, __functionAddress);
    }

    /** {@code void glMultiTexCoord4fv(GLenum texture, GLfloat const * v)} */
    public static void glMultiTexCoord4fv(@NativeType("GLenum") int texture, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord4fv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(texture, v, __functionAddress);
    }

    /** {@code void glMultiTexCoord4sv(GLenum texture, GLshort const * v)} */
    public static void glMultiTexCoord4sv(@NativeType("GLenum") int texture, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord4sv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(texture, v, __functionAddress);
    }

    /** {@code void glMultiTexCoord4iv(GLenum texture, GLint const * v)} */
    public static void glMultiTexCoord4iv(@NativeType("GLenum") int texture, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord4iv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(texture, v, __functionAddress);
    }

    /** {@code void glMultiTexCoord4dv(GLenum texture, GLdouble const * v)} */
    public static void glMultiTexCoord4dv(@NativeType("GLenum") int texture, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord4dv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(texture, v, __functionAddress);
    }

    /** {@code void glLoadTransposeMatrixf(GLfloat const * m)} */
    public static void glLoadTransposeMatrixf(@NativeType("GLfloat const *") float[] m) {
        long __functionAddress = GL.getICD().glLoadTransposeMatrixf;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 16);
        }
        callPV(m, __functionAddress);
    }

    /** {@code void glLoadTransposeMatrixd(GLdouble const * m)} */
    public static void glLoadTransposeMatrixd(@NativeType("GLdouble const *") double[] m) {
        long __functionAddress = GL.getICD().glLoadTransposeMatrixd;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 16);
        }
        callPV(m, __functionAddress);
    }

    /** {@code void glMultTransposeMatrixf(GLfloat const * m)} */
    public static void glMultTransposeMatrixf(@NativeType("GLfloat const *") float[] m) {
        long __functionAddress = GL.getICD().glMultTransposeMatrixf;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 16);
        }
        callPV(m, __functionAddress);
    }

    /** {@code void glMultTransposeMatrixd(GLdouble const * m)} */
    public static void glMultTransposeMatrixd(@NativeType("GLdouble const *") double[] m) {
        long __functionAddress = GL.getICD().glMultTransposeMatrixd;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 16);
        }
        callPV(m, __functionAddress);
    }

}