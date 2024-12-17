/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class NVTextureArray {

    static { GLES.initialize(); }

    public static final int GL_TEXTURE_2D_ARRAY_NV = 0x8C1A;

    public static final int
        GL_TEXTURE_BINDING_2D_ARRAY_NV = 0x8C1D,
        GL_MAX_ARRAY_TEXTURE_LAYERS_NV = 0x88FF;

    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER_NV = 0x8CD4;

    public static final int GL_SAMPLER_2D_ARRAY_NV = 0x8DC1;

    public static final int
        GL_UNPACK_SKIP_IMAGES_NV  = 0x806D,
        GL_UNPACK_IMAGE_HEIGHT_NV = 0x806E;

    protected NVTextureArray() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTexImage3DNV ] ---

    /** {@code void glTexImage3DNV(GLenum target, GLint level, GLenum internalFormat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static native void nglTexImage3DNV(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, long pixels);

    /** {@code void glTexImage3DNV(GLenum target, GLint level, GLenum internalFormat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage3DNV(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ByteBuffer pixels) {
        nglTexImage3DNV(target, level, internalFormat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glTexImage3DNV(GLenum target, GLint level, GLenum internalFormat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage3DNV(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglTexImage3DNV(target, level, internalFormat, width, height, depth, border, format, type, pixels);
    }

    /** {@code void glTexImage3DNV(GLenum target, GLint level, GLenum internalFormat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage3DNV(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ShortBuffer pixels) {
        nglTexImage3DNV(target, level, internalFormat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glTexImage3DNV(GLenum target, GLint level, GLenum internalFormat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage3DNV(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable IntBuffer pixels) {
        nglTexImage3DNV(target, level, internalFormat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glTexImage3DNV(GLenum target, GLint level, GLenum internalFormat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage3DNV(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable FloatBuffer pixels) {
        nglTexImage3DNV(target, level, internalFormat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    // --- [ glTexSubImage3DNV ] ---

    /** {@code void glTexSubImage3DNV(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static native void nglTexSubImage3DNV(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels);

    /** {@code void glTexSubImage3DNV(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage3DNV(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        nglTexSubImage3DNV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    /** {@code void glTexSubImage3DNV(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage3DNV(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglTexSubImage3DNV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    /** {@code void glTexSubImage3DNV(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage3DNV(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        nglTexSubImage3DNV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    /** {@code void glTexSubImage3DNV(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage3DNV(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        nglTexSubImage3DNV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    /** {@code void glTexSubImage3DNV(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage3DNV(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        nglTexSubImage3DNV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    // --- [ glCopyTexSubImage3DNV ] ---

    /** {@code void glCopyTexSubImage3DNV(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static native void glCopyTexSubImage3DNV(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glCompressedTexImage3DNV ] ---

    /** {@code void glCompressedTexImage3DNV(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLsizei imageSize, void const * data)} */
    public static native void nglCompressedTexImage3DNV(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data);

    /** {@code void glCompressedTexImage3DNV(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexImage3DNV(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTexImage3DNV(target, level, internalformat, width, height, depth, border, imageSize, data);
    }

    /** {@code void glCompressedTexImage3DNV(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexImage3DNV(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("void const *") @Nullable ByteBuffer data) {
        nglCompressedTexImage3DNV(target, level, internalformat, width, height, depth, border, remainingSafe(data), memAddressSafe(data));
    }

    // --- [ glCompressedTexSubImage3DNV ] ---

    /** {@code void glCompressedTexSubImage3DNV(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLsizei imageSize, void const * data)} */
    public static native void nglCompressedTexSubImage3DNV(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data);

    /** {@code void glCompressedTexSubImage3DNV(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexSubImage3DNV(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTexSubImage3DNV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
    }

    /** {@code void glCompressedTexSubImage3DNV(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexSubImage3DNV(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        nglCompressedTexSubImage3DNV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, data.remaining(), memAddress(data));
    }

    // --- [ glFramebufferTextureLayerNV ] ---

    /** {@code void glFramebufferTextureLayerNV(GLenum target, GLenum attachment, GLuint texture, GLint level, GLint layer)} */
    public static native void glFramebufferTextureLayerNV(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int layer);

    /** {@code void glTexImage3DNV(GLenum target, GLint level, GLenum internalFormat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage3DNV(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short @Nullable [] pixels) {
        long __functionAddress = GLES.getICD().glTexImage3DNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, internalFormat, width, height, depth, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexImage3DNV(GLenum target, GLint level, GLenum internalFormat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage3DNV(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int @Nullable [] pixels) {
        long __functionAddress = GLES.getICD().glTexImage3DNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, internalFormat, width, height, depth, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexImage3DNV(GLenum target, GLint level, GLenum internalFormat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage3DNV(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float @Nullable [] pixels) {
        long __functionAddress = GLES.getICD().glTexImage3DNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, internalFormat, width, height, depth, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexSubImage3DNV(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage3DNV(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        long __functionAddress = GLES.getICD().glTexSubImage3DNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexSubImage3DNV(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage3DNV(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        long __functionAddress = GLES.getICD().glTexSubImage3DNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexSubImage3DNV(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage3DNV(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        long __functionAddress = GLES.getICD().glTexSubImage3DNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

}