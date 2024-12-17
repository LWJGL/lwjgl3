/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

public class ARBTextureCompression {

    static { GL.initialize(); }

    public static final int
        GL_COMPRESSED_ALPHA_ARB           = 0x84E9,
        GL_COMPRESSED_LUMINANCE_ARB       = 0x84EA,
        GL_COMPRESSED_LUMINANCE_ALPHA_ARB = 0x84EB,
        GL_COMPRESSED_INTENSITY_ARB       = 0x84EC,
        GL_COMPRESSED_RGB_ARB             = 0x84ED,
        GL_COMPRESSED_RGBA_ARB            = 0x84EE;

    public static final int GL_TEXTURE_COMPRESSION_HINT_ARB = 0x84EF;

    public static final int
        GL_TEXTURE_COMPRESSED_IMAGE_SIZE_ARB = 0x86A0,
        GL_TEXTURE_COMPRESSED_ARB            = 0x86A1;

    public static final int
        GL_NUM_COMPRESSED_TEXTURE_FORMATS_ARB = 0x86A2,
        GL_COMPRESSED_TEXTURE_FORMATS_ARB     = 0x86A3;

    protected ARBTextureCompression() {
        throw new UnsupportedOperationException();
    }

    // --- [ glCompressedTexImage3DARB ] ---

    /** {@code void glCompressedTexImage3DARB(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLsizei imageSize, void const * data)} */
    public static native void nglCompressedTexImage3DARB(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data);

    /** {@code void glCompressedTexImage3DARB(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexImage3DARB(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTexImage3DARB(target, level, internalformat, width, height, depth, border, imageSize, data);
    }

    /** {@code void glCompressedTexImage3DARB(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexImage3DARB(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void const *") ByteBuffer data) {
        nglCompressedTexImage3DARB(target, level, internalformat, width, height, depth, 0, data.remaining(), memAddress(data));
    }

    // --- [ glCompressedTexImage2DARB ] ---

    /** {@code void glCompressedTexImage2DARB(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLint border, GLsizei imageSize, void const * data)} */
    public static native void nglCompressedTexImage2DARB(int target, int level, int internalformat, int width, int height, int border, int imageSize, long data);

    /** {@code void glCompressedTexImage2DARB(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLint border, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexImage2DARB(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTexImage2DARB(target, level, internalformat, width, height, border, imageSize, data);
    }

    /** {@code void glCompressedTexImage2DARB(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLint border, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexImage2DARB(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("void const *") ByteBuffer data) {
        nglCompressedTexImage2DARB(target, level, internalformat, width, height, 0, data.remaining(), memAddress(data));
    }

    // --- [ glCompressedTexImage1DARB ] ---

    /** {@code void glCompressedTexImage1DARB(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLint border, GLsizei imageSize, void const * data)} */
    public static native void nglCompressedTexImage1DARB(int target, int level, int internalformat, int width, int border, int imageSize, long data);

    /** {@code void glCompressedTexImage1DARB(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLint border, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexImage1DARB(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTexImage1DARB(target, level, internalformat, width, border, imageSize, data);
    }

    /** {@code void glCompressedTexImage1DARB(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLint border, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexImage1DARB(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("void const *") ByteBuffer data) {
        nglCompressedTexImage1DARB(target, level, internalformat, width, 0, data.remaining(), memAddress(data));
    }

    // --- [ glCompressedTexSubImage3DARB ] ---

    /** {@code void glCompressedTexSubImage3DARB(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLsizei imageSize, void const * data)} */
    public static native void nglCompressedTexSubImage3DARB(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data);

    /** {@code void glCompressedTexSubImage3DARB(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexSubImage3DARB(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTexSubImage3DARB(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
    }

    /** {@code void glCompressedTexSubImage3DARB(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexSubImage3DARB(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        nglCompressedTexSubImage3DARB(target, level, xoffset, yoffset, zoffset, width, height, depth, format, data.remaining(), memAddress(data));
    }

    // --- [ glCompressedTexSubImage2DARB ] ---

    /** {@code void glCompressedTexSubImage2DARB(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLsizei imageSize, void const * data)} */
    public static native void nglCompressedTexSubImage2DARB(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data);

    /** {@code void glCompressedTexSubImage2DARB(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexSubImage2DARB(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTexSubImage2DARB(target, level, xoffset, yoffset, width, height, format, imageSize, data);
    }

    /** {@code void glCompressedTexSubImage2DARB(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexSubImage2DARB(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        nglCompressedTexSubImage2DARB(target, level, xoffset, yoffset, width, height, format, data.remaining(), memAddress(data));
    }

    // --- [ glCompressedTexSubImage1DARB ] ---

    /** {@code void glCompressedTexSubImage1DARB(GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLsizei imageSize, void const * data)} */
    public static native void nglCompressedTexSubImage1DARB(int target, int level, int xoffset, int width, int format, int imageSize, long data);

    /** {@code void glCompressedTexSubImage1DARB(GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexSubImage1DARB(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTexSubImage1DARB(target, level, xoffset, width, format, imageSize, data);
    }

    /** {@code void glCompressedTexSubImage1DARB(GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexSubImage1DARB(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        nglCompressedTexSubImage1DARB(target, level, xoffset, width, format, data.remaining(), memAddress(data));
    }

    // --- [ glGetCompressedTexImageARB ] ---

    /** {@code void glGetCompressedTexImageARB(GLenum target, GLint level, void * pixels)} */
    public static native void nglGetCompressedTexImageARB(int target, int level, long pixels);

    /** {@code void glGetCompressedTexImageARB(GLenum target, GLint level, void * pixels)} */
    public static void glGetCompressedTexImageARB(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("void *") ByteBuffer pixels) {
        if (CHECKS) {
            if (DEBUG) {
                check(pixels, GL11.glGetTexLevelParameteri(target, level, GL_TEXTURE_COMPRESSED_IMAGE_SIZE_ARB));
            }
        }
        nglGetCompressedTexImageARB(target, level, memAddress(pixels));
    }

    /** {@code void glGetCompressedTexImageARB(GLenum target, GLint level, void * pixels)} */
    public static void glGetCompressedTexImageARB(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("void *") long pixels) {
        nglGetCompressedTexImageARB(target, level, pixels);
    }

}