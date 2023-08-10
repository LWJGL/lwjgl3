/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_framebuffer_multisample_advanced.txt">AMD_framebuffer_multisample_advanced</a> extension.
 * 
 * <p>This extension extends {@link ARBFramebufferObject ARB_framebuffer_object} by allowing compromises between image quality and memory footprint of multisample antialiasing.</p>
 * 
 * <p>{@code ARB_framebuffer_object} introduced {@link GL30C#glRenderbufferStorageMultisample RenderbufferStorageMultisample} as a method of defining the parameters for a multisample render buffer.
 * This function takes a {@code samples} parameter that has strict requirements on behavior such that no compromises in the final image quality are
 * allowed. Additionally, {@code ARB_framebuffer_object} requires that all framebuffer attachments have the same number of samples.</p>
 * 
 * <p>This extension extends {@code ARB_framebuffer_object} by providing a new function, {@link #glRenderbufferStorageMultisampleAdvancedAMD RenderbufferStorageMultisampleAdvancedAMD}, that distinguishes
 * between samples and storage samples for color renderbuffers where the number of storage samples can be less than the number of samples. This extension
 * also allows non-matching sample counts between color and depth/stencil renderbuffers.</p>
 * 
 * <p>This extension does not require any specific combination of sample counts to be supported.</p>
 * 
 * <p>Requires {@link ARBFramebufferObject ARB_framebuffer_object}.</p>
 */
public class AMDFramebufferMultisampleAdvanced {

    static { GL.initialize(); }

    /** Accepted by the {@code pname} parameter of {@link GL30C#glGetRenderbufferParameteriv GetRenderbufferParameteriv}. */
    public static final int GL_RENDERBUFFER_STORAGE_SAMPLES_AMD = 0x91B2;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, GetDoublev. */
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

    public static native void glRenderbufferStorageMultisampleAdvancedAMD(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLsizei") int storageSamples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glNamedRenderbufferStorageMultisampleAdvancedAMD ] ---

    public static native void glNamedRenderbufferStorageMultisampleAdvancedAMD(@NativeType("GLuint") int renderbuffer, @NativeType("GLsizei") int samples, @NativeType("GLsizei") int storageSamples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

}