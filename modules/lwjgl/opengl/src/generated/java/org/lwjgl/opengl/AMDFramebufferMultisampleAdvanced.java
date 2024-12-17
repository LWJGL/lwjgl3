/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class AMDFramebufferMultisampleAdvanced {

    static { GL.initialize(); }

    public static final int GL_RENDERBUFFER_STORAGE_SAMPLES_AMD = 0x91B2;

    public static final int
        GL_MAX_COLOR_FRAMEBUFFER_SAMPLES_AMD         = 0x91B3,
        GL_MAX_COLOR_FRAMEBUFFER_STORAGE_SAMPLES_AMD = 0x91B4,
        GL_MAX_DEPTH_STENCIL_FRAMEBUFFER_SAMPLES_AMD = 0x91B5,
        GL_NUM_SUPPORTED_MULTISAMPLE_MODES_AMD       = 0x91B6,
        GL_SUPPORTED_MULTISAMPLE_MODES_AMD           = 0x91B7;

    protected AMDFramebufferMultisampleAdvanced() {
        throw new UnsupportedOperationException();
    }

    // --- [ glRenderbufferStorageMultisampleAdvancedAMD ] ---

    /** {@code void glRenderbufferStorageMultisampleAdvancedAMD(GLenum target, GLsizei samples, GLsizei storageSamples, GLenum internalformat, GLsizei width, GLsizei height)} */
    public static native void glRenderbufferStorageMultisampleAdvancedAMD(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLsizei") int storageSamples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glNamedRenderbufferStorageMultisampleAdvancedAMD ] ---

    /** {@code void glNamedRenderbufferStorageMultisampleAdvancedAMD(GLuint renderbuffer, GLsizei samples, GLsizei storageSamples, GLenum internalformat, GLsizei width, GLsizei height)} */
    public static native void glNamedRenderbufferStorageMultisampleAdvancedAMD(@NativeType("GLuint") int renderbuffer, @NativeType("GLsizei") int samples, @NativeType("GLsizei") int storageSamples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

}