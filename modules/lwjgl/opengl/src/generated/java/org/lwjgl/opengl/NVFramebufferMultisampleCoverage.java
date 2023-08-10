/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_framebuffer_multisample_coverage.txt">NV_framebuffer_multisample_coverage</a> extension.
 * 
 * <p>This extension extends the EXT_framebuffer_multisample specification by providing a new function, RenderBufferStorageMultisampleCoverageNV, that
 * distinguishes between color samples and coverage samples.</p>
 * 
 * <p>EXT_framebuffer_multisample introduced the function RenderbufferStorageMultisampleEXT as a method of defining the storage parameters for a multisample
 * render buffer. This function takes a {@code samples} parameter. Using rules provided by the specification, the {@code samples} parameter is resolved to
 * an actual number of samples that is supported by the underlying hardware. EXT_framebuffer_multisample does not specify whether {@code samples} refers
 * to coverage samples or color samples.</p>
 * 
 * <p>This extension adds the function RenderbufferStorageMultisamplCoverageNV, which takes a {@code coverageSamples} parameter as well as a
 * {@code colorSamples} parameter. These two parameters give developers more fine grained control over the quality of multisampled images.</p>
 * 
 * <p>Requires {@link EXTFramebufferObject EXT_framebuffer_object}, {@link EXTFramebufferBlit EXT_framebuffer_blit} and {@link EXTFramebufferMultisample EXT_framebuffer_multisample}.</p>
 */
public class NVFramebufferMultisampleCoverage {

    static { GL.initialize(); }

    /** Accepted by the {@code pname} parameter of GetRenderbufferParameterivEXT. */
    public static final int
        GL_RENDERBUFFER_COVERAGE_SAMPLES_NV = 0x8CAB,
        GL_RENDERBUFFER_COLOR_SAMPLES_NV    = 0x8E10;

    /** Accepted by the {@code pname} parameter of GetIntegerv. */
    public static final int
        GL_MAX_MULTISAMPLE_COVERAGE_MODES_NV = 0x8E11,
        GL_MULTISAMPLE_COVERAGE_MODES_NV     = 0x8E12;

    protected NVFramebufferMultisampleCoverage() {
        throw new UnsupportedOperationException();
    }

    // --- [ glRenderbufferStorageMultisampleCoverageNV ] ---

    public static native void glRenderbufferStorageMultisampleCoverageNV(@NativeType("GLenum") int target, @NativeType("GLsizei") int coverageSamples, @NativeType("GLsizei") int colorSamples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

}