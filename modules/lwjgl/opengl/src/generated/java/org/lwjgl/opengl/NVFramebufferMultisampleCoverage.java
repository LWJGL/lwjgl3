/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class NVFramebufferMultisampleCoverage {

    static { GL.initialize(); }

    public static final int
        GL_RENDERBUFFER_COVERAGE_SAMPLES_NV = 0x8CAB,
        GL_RENDERBUFFER_COLOR_SAMPLES_NV    = 0x8E10;

    public static final int
        GL_MAX_MULTISAMPLE_COVERAGE_MODES_NV = 0x8E11,
        GL_MULTISAMPLE_COVERAGE_MODES_NV     = 0x8E12;

    protected NVFramebufferMultisampleCoverage() {
        throw new UnsupportedOperationException();
    }

    // --- [ glRenderbufferStorageMultisampleCoverageNV ] ---

    /** {@code void glRenderbufferStorageMultisampleCoverageNV(GLenum target, GLsizei coverageSamples, GLsizei colorSamples, GLenum internalformat, GLsizei width, GLsizei height)} */
    public static native void glRenderbufferStorageMultisampleCoverageNV(@NativeType("GLenum") int target, @NativeType("GLsizei") int coverageSamples, @NativeType("GLsizei") int colorSamples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

}