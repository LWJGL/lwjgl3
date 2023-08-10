/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_framebuffer_multisample.txt">NV_framebuffer_multisample</a> extension.
 * 
 * <p>This extension extends the framebuffer object framework to enable multisample rendering.</p>
 * 
 * <p>The new operation RenderbufferStorageMultisampleNV() allocates storage for a renderbuffer object that can be used as a multisample buffer. A
 * multisample render buffer image differs from a single-sample render buffer image in that a multisample image has a number of SAMPLES that is greater
 * than zero. No method is provided for creating multisample texture images.</p>
 * 
 * <p>All of the framebuffer-attachable images attached to a framebuffer object must have the same number of SAMPLES or else the framebuffer object is not
 * "framebuffer complete". If a framebuffer object with multisample attachments is "framebuffer complete", then the framebuffer object behaves as if
 * SAMPLE_BUFFERS is one.</p>
 * 
 * <p>A resolve operation is executed by calling BlitFramebufferNV (provided by the NV_framebuffer_blit extension) where the source is a multisample
 * framebuffer object and the destination is a single-sample framebuffer object. Source and destination framebuffer may be either application-created or
 * window-system provided.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0} and {@link NVFramebufferBlit NV_framebuffer_blit}.</p>
 */
public class NVFramebufferMultisample {

    static { GLES.initialize(); }

    /** Accepted by the {@code pname} parameter of GetRenderbufferParameteriv. */
    public static final int GL_RENDERBUFFER_SAMPLES_NV = 0x8CAB;

    /** Returned by CheckFramebufferStatus. */
    public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_NV = 0x8D56;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, and GetFloatv. */
    public static final int GL_MAX_SAMPLES_NV = 0x8D57;

    protected NVFramebufferMultisample() {
        throw new UnsupportedOperationException();
    }

    // --- [ glRenderbufferStorageMultisampleNV ] ---

    public static native void glRenderbufferStorageMultisampleNV(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

}