/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_texture_multisample.txt">NV_texture_multisample</a> extension.
 * 
 * <p>This specification extends <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_gpu_program4.txt">NV_gpu_program4</a> to support per-sample fetching from multisample textures described in
 * {@link ARBTextureMultisample ARB_texture_multisample}.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0}, {@link ARBTextureMultisample ARB_texture_multisample}.</p>
 */
public class NVTextureMultisample {

    static { GL.initialize(); }

    /** Accepted by the {@code pname} parameter of GetTexLevelParameter. */
    public static final int
        GL_TEXTURE_COVERAGE_SAMPLES_NV = 0x9045,
        GL_TEXTURE_COLOR_SAMPLES_NV    = 0x9046;

    protected NVTextureMultisample() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTexImage2DMultisampleCoverageNV ] ---

    public static native void glTexImage2DMultisampleCoverageNV(@NativeType("GLenum") int target, @NativeType("GLsizei") int coverageSamples, @NativeType("GLsizei") int colorSamples, @NativeType("GLint") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLboolean") boolean fixedSampleLocations);

    // --- [ glTexImage3DMultisampleCoverageNV ] ---

    public static native void glTexImage3DMultisampleCoverageNV(@NativeType("GLenum") int target, @NativeType("GLsizei") int coverageSamples, @NativeType("GLsizei") int colorSamples, @NativeType("GLint") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean fixedSampleLocations);

    // --- [ glTextureImage2DMultisampleNV ] ---

    public static native void glTextureImage2DMultisampleNV(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLint") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLboolean") boolean fixedSampleLocations);

    // --- [ glTextureImage3DMultisampleNV ] ---

    public static native void glTextureImage3DMultisampleNV(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLint") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean fixedSampleLocations);

    // --- [ glTextureImage2DMultisampleCoverageNV ] ---

    public static native void glTextureImage2DMultisampleCoverageNV(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLsizei") int coverageSamples, @NativeType("GLsizei") int colorSamples, @NativeType("GLint") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLboolean") boolean fixedSampleLocations);

    // --- [ glTextureImage3DMultisampleCoverageNV ] ---

    public static native void glTextureImage3DMultisampleCoverageNV(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLsizei") int coverageSamples, @NativeType("GLsizei") int colorSamples, @NativeType("GLint") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean fixedSampleLocations);

}