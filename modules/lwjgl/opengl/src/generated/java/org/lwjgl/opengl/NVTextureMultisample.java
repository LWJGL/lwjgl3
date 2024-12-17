/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class NVTextureMultisample {

    static { GL.initialize(); }

    public static final int
        GL_TEXTURE_COVERAGE_SAMPLES_NV = 0x9045,
        GL_TEXTURE_COLOR_SAMPLES_NV    = 0x9046;

    protected NVTextureMultisample() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTexImage2DMultisampleCoverageNV ] ---

    /** {@code void glTexImage2DMultisampleCoverageNV(GLenum target, GLsizei coverageSamples, GLsizei colorSamples, GLint internalFormat, GLsizei width, GLsizei height, GLboolean fixedSampleLocations)} */
    public static native void glTexImage2DMultisampleCoverageNV(@NativeType("GLenum") int target, @NativeType("GLsizei") int coverageSamples, @NativeType("GLsizei") int colorSamples, @NativeType("GLint") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLboolean") boolean fixedSampleLocations);

    // --- [ glTexImage3DMultisampleCoverageNV ] ---

    /** {@code void glTexImage3DMultisampleCoverageNV(GLenum target, GLsizei coverageSamples, GLsizei colorSamples, GLint internalFormat, GLsizei width, GLsizei height, GLsizei depth, GLboolean fixedSampleLocations)} */
    public static native void glTexImage3DMultisampleCoverageNV(@NativeType("GLenum") int target, @NativeType("GLsizei") int coverageSamples, @NativeType("GLsizei") int colorSamples, @NativeType("GLint") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean fixedSampleLocations);

    // --- [ glTextureImage2DMultisampleNV ] ---

    /** {@code void glTextureImage2DMultisampleNV(GLuint texture, GLenum target, GLsizei samples, GLint internalFormat, GLsizei width, GLsizei height, GLboolean fixedSampleLocations)} */
    public static native void glTextureImage2DMultisampleNV(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLint") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLboolean") boolean fixedSampleLocations);

    // --- [ glTextureImage3DMultisampleNV ] ---

    /** {@code void glTextureImage3DMultisampleNV(GLuint texture, GLenum target, GLsizei samples, GLint internalFormat, GLsizei width, GLsizei height, GLsizei depth, GLboolean fixedSampleLocations)} */
    public static native void glTextureImage3DMultisampleNV(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLint") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean fixedSampleLocations);

    // --- [ glTextureImage2DMultisampleCoverageNV ] ---

    /** {@code void glTextureImage2DMultisampleCoverageNV(GLuint texture, GLenum target, GLsizei coverageSamples, GLsizei colorSamples, GLint internalFormat, GLsizei width, GLsizei height, GLboolean fixedSampleLocations)} */
    public static native void glTextureImage2DMultisampleCoverageNV(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLsizei") int coverageSamples, @NativeType("GLsizei") int colorSamples, @NativeType("GLint") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLboolean") boolean fixedSampleLocations);

    // --- [ glTextureImage3DMultisampleCoverageNV ] ---

    /** {@code void glTextureImage3DMultisampleCoverageNV(GLuint texture, GLenum target, GLsizei coverageSamples, GLsizei colorSamples, GLint internalFormat, GLsizei width, GLsizei height, GLsizei depth, GLboolean fixedSampleLocations)} */
    public static native void glTextureImage3DMultisampleCoverageNV(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLsizei") int coverageSamples, @NativeType("GLsizei") int colorSamples, @NativeType("GLint") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean fixedSampleLocations);

}