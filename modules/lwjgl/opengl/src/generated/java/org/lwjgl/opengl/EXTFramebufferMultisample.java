/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_framebuffer_multisample.txt">EXT_framebuffer_multisample</a> extension.
 * 
 * <p>This extension extends the EXT_framebuffer_object framework to enable multisample rendering.</p>
 * 
 * <p>The new operation RenderbufferStorageMultisampleEXT() allocates storage for a renderbuffer object that can be used as a multisample buffer. A
 * multisample render buffer image differs from a single-sample render buffer image in that a multisample image has a number of SAMPLES that is greater
 * than zero. No method is provided for creating multisample texture images.</p>
 * 
 * <p>All of the framebuffer-attachable images attached to a framebuffer object must have the same number of SAMPLES or else the framebuffer object is not
 * "framebuffer complete". If a framebuffer object with multisample attachments is "framebuffer complete", then the framebuffer object behaves as if
 * SAMPLE_BUFFERS is one.</p>
 * 
 * <p>In traditional multisample rendering, where DRAW_FRAMEBUFFER_BINDING_EXT is zero and SAMPLE_BUFFERS is one, the GL spec states that "the color sample
 * values are resolved to a single, displayable color each time a pixel is updated." There are, however, several modern hardware implementations that do
 * not actually resolve for each sample update, but instead postpones the resolve operation to a later time and resolve a batch of sample updates at a
 * time. This is OK as long as the implementation behaves "as if" it had resolved a sample-at-a-time. Unfortunately, however, honoring the "as if" rule can
 * sometimes degrade performance.</p>
 * 
 * <p>In contrast, when DRAW_FRAMEBUFFER_BINDING_EXT is an application-created framebuffer object, MULTISAMPLE is enabled, and SAMPLE_BUFFERS is one, there is
 * no implicit per-sample-update resolve. Instead, the application explicitly controls when the resolve operation is performed. The resolve operation is
 * affected by calling BlitFramebufferEXT (provided by the EXT_framebuffer_blit extension) where the source is a multisample application-created
 * framebuffer object and the destination is a single-sample framebuffer object (either application-created or window-system provided).</p>
 * 
 * <p>This design for multisample resolve more closely matches current hardware, but still permits implementations which choose to resolve a single sample at
 * a time. If hardware that implementes the multisample resolution "one sample at a time" exposes EXT_framebuffer_multisample, it could perform the
 * implicit resolve to a driver-managed hidden surface, then read from that surface when the application calls BlitFramebufferEXT.</p>
 * 
 * <p>Another motivation for granting the application explicit control over the multisample resolve operation has to do with the flexibility afforded by
 * EXT_framebuffer_object. Previously, a drawable (window or pbuffer) had exclusive access to all of its buffers. There was no mechanism for sharing a
 * buffer across multiple drawables. Under EXT_framebuffer_object, however, a mechanism exists for sharing a framebuffer-attachable image across several
 * framebuffer objects, as well as sharing an image between a framebuffer object and a texture. If we had retained the "implicit"
 * resolve from traditional multisampled rendering, and allowed the creation of "multisample" format renderbuffers, then this type of sharing would have
 * lead to two problematic situations:</p>
 * 
 * <ul>
 * <li>Two contexts, which shared renderbuffers, might perform competing resolve operations into the same single-sample buffer with ambiguous results.</li>
 * <li>It would have introduced the unfortunate ability to use the single-sample buffer as a texture while MULTISAMPLE is ENABLED.</li>
 * </ul>
 * 
 * <p>By using the BlitFramebufferEXT from EXT_framebuffer_blit as an explicit resolve to serialize access to the multisampled contents and eliminate the
 * implicit per-sample resolve operation, we avoid both of these problems.</p>
 * 
 * <p>Promoted to core in {@link GL30 OpenGL 3.0}.</p>
 */
public class EXTFramebufferMultisample {

    static { GL.initialize(); }

    /** Accepted by the {@code pname} parameter of GetRenderbufferParameterivEXT. */
    public static final int GL_RENDERBUFFER_SAMPLES_EXT = 0x8CAB;

    /** Returned by CheckFramebufferStatusEXT. */
    public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_EXT = 0x8D56;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int GL_MAX_SAMPLES_EXT = 0x8D57;

    protected EXTFramebufferMultisample() {
        throw new UnsupportedOperationException();
    }

    // --- [ glRenderbufferStorageMultisampleEXT ] ---

    public static native void glRenderbufferStorageMultisampleEXT(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

}