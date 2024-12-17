/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

public class ARBTextureMultisample {

    static { GL.initialize(); }

    public static final int GL_SAMPLE_POSITION = 0x8E50;

    public static final int GL_SAMPLE_MASK = 0x8E51;

    public static final int GL_SAMPLE_MASK_VALUE = 0x8E52;

    public static final int GL_TEXTURE_2D_MULTISAMPLE = 0x9100;

    public static final int GL_PROXY_TEXTURE_2D_MULTISAMPLE = 0x9101;

    public static final int GL_TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9102;

    public static final int GL_PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9103;

    public static final int
        GL_MAX_SAMPLE_MASK_WORDS                = 0x8E59,
        GL_MAX_COLOR_TEXTURE_SAMPLES            = 0x910E,
        GL_MAX_DEPTH_TEXTURE_SAMPLES            = 0x910F,
        GL_MAX_INTEGER_SAMPLES                  = 0x9110,
        GL_TEXTURE_BINDING_2D_MULTISAMPLE       = 0x9104,
        GL_TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY = 0x9105;

    public static final int
        GL_TEXTURE_SAMPLES                = 0x9106,
        GL_TEXTURE_FIXED_SAMPLE_LOCATIONS = 0x9107;

    public static final int
        GL_SAMPLER_2D_MULTISAMPLE                    = 0x9108,
        GL_INT_SAMPLER_2D_MULTISAMPLE                = 0x9109,
        GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE       = 0x910A,
        GL_SAMPLER_2D_MULTISAMPLE_ARRAY              = 0x910B,
        GL_INT_SAMPLER_2D_MULTISAMPLE_ARRAY          = 0x910C,
        GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910D;

    protected ARBTextureMultisample() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTexImage2DMultisample ] ---

    /** {@code void glTexImage2DMultisample(GLenum target, GLsizei samples, GLint internalformat, GLsizei width, GLsizei height, GLboolean fixedsamplelocations)} */
    public static void glTexImage2DMultisample(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLboolean") boolean fixedsamplelocations) {
        GL32C.glTexImage2DMultisample(target, samples, internalformat, width, height, fixedsamplelocations);
    }

    // --- [ glTexImage3DMultisample ] ---

    /** {@code void glTexImage3DMultisample(GLenum target, GLsizei samples, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLboolean fixedsamplelocations)} */
    public static void glTexImage3DMultisample(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean fixedsamplelocations) {
        GL32C.glTexImage3DMultisample(target, samples, internalformat, width, height, depth, fixedsamplelocations);
    }

    // --- [ glGetMultisamplefv ] ---

    /** {@code void glGetMultisamplefv(GLenum pname, GLuint index, GLfloat * val)} */
    public static void nglGetMultisamplefv(int pname, int index, long val) {
        GL32C.nglGetMultisamplefv(pname, index, val);
    }

    /** {@code void glGetMultisamplefv(GLenum pname, GLuint index, GLfloat * val)} */
    public static void glGetMultisamplefv(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLfloat *") FloatBuffer val) {
        GL32C.glGetMultisamplefv(pname, index, val);
    }

    /** {@code void glGetMultisamplefv(GLenum pname, GLuint index, GLfloat * val)} */
    @NativeType("void")
    public static float glGetMultisamplef(@NativeType("GLenum") int pname, @NativeType("GLuint") int index) {
        return GL32C.glGetMultisamplef(pname, index);
    }

    // --- [ glSampleMaski ] ---

    /** {@code void glSampleMaski(GLuint index, GLbitfield mask)} */
    public static void glSampleMaski(@NativeType("GLuint") int index, @NativeType("GLbitfield") int mask) {
        GL32C.glSampleMaski(index, mask);
    }

    /** {@code void glGetMultisamplefv(GLenum pname, GLuint index, GLfloat * val)} */
    public static void glGetMultisamplefv(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLfloat *") float[] val) {
        GL32C.glGetMultisamplefv(pname, index, val);
    }

}