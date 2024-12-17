/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class EXTTextureStorage {

    static { GL.initialize(); }

    public static final int GL_TEXTURE_IMMUTABLE_FORMAT_EXT = 0x912F;

    public static final int
        GL_ALPHA8_EXT             = 0x803C,
        GL_LUMINANCE8_EXT         = 0x8040,
        GL_LUMINANCE8_ALPHA8_EXT  = 0x8045,
        GL_RGBA32F_EXT            = 0x8814,
        GL_RGB32F_EXT             = 0x8815,
        GL_ALPHA32F_EXT           = 0x8816,
        GL_LUMINANCE32F_EXT       = 0x8818,
        GL_LUMINANCE_ALPHA32F_EXT = 0x8819,
        GL_RGBA16F_EXT            = 0x881A,
        GL_RGB16F_EXT             = 0x881B,
        GL_ALPHA16F_EXT           = 0x881C,
        GL_LUMINANCE16F_EXT       = 0x881E,
        GL_LUMINANCE_ALPHA16F_EXT = 0x881F,
        GL_RGB10_A2_EXT           = 0x8059,
        GL_RGB10_EXT              = 0x8052,
        GL_BGRA8_EXT              = 0x93A1,
        GL_R8_EXT                 = 0x8229,
        GL_RG8_EXT                = 0x822B,
        GL_R32F_EXT               = 0x822E,
        GL_RG32F_EXT              = 0x8230,
        GL_R16F_EXT               = 0x822D,
        GL_RG16F_EXT              = 0x822F,
        GL_RGB_RAW_422_APPLE      = 0x8A51;

    protected EXTTextureStorage() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTexStorage1DEXT ] ---

    /** {@code void glTexStorage1DEXT(GLenum target, GLsizei levels, GLenum internalformat, GLsizei width)} */
    public static native void glTexStorage1DEXT(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width);

    // --- [ glTexStorage2DEXT ] ---

    /** {@code void glTexStorage2DEXT(GLenum target, GLsizei levels, GLenum internalformat, GLsizei width, GLsizei height)} */
    public static native void glTexStorage2DEXT(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glTexStorage3DEXT ] ---

    /** {@code void glTexStorage3DEXT(GLenum target, GLsizei levels, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth)} */
    public static native void glTexStorage3DEXT(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth);

    // --- [ glTextureStorage1DEXT ] ---

    /** {@code void glTextureStorage1DEXT(GLuint texture, GLenum target, GLsizei levels, GLenum internalformat, GLsizei width)} */
    public static native void glTextureStorage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width);

    // --- [ glTextureStorage2DEXT ] ---

    /** {@code void glTextureStorage2DEXT(GLuint texture, GLenum target, GLsizei levels, GLenum internalformat, GLsizei width, GLsizei height)} */
    public static native void glTextureStorage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glTextureStorage3DEXT ] ---

    /** {@code void glTextureStorage3DEXT(GLuint texture, GLenum target, GLsizei levels, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth)} */
    public static native void glTextureStorage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth);

}