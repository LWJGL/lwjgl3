/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_multisampled_render_to_texture.txt">EXT_multisampled_render_to_texture</a> extension.
 * 
 * <p>This extension introduces functionality to perform multisampled rendering to a color renderable texture, without requiring an explicit resolve of
 * multisample data.</p>
 * 
 * <p>Some GPU architectures - such as tile-based renderers - are capable of performing multisampled rendering by storing multisample data in internal
 * high-speed memory and downsampling the data when writing out to external memory after rendering has finished. Since per-sample data is never written
 * out to external memory, this approach saves bandwidth and storage space. In this case multisample data gets discarded, however this is acceptable in
 * most cases.</p>
 * 
 * <p>The extension provides a new command, FramebufferTexture2DMultisampleEXT, which attaches a texture level to a framebuffer and enables multisampled
 * rendering to that texture level.</p>
 * 
 * <p>When the texture level is flushed or used as a source or destination for any operation other than drawing to it, an implicit resolve of multisampled
 * color data may be performed. After such a resolve, the multisampled color data is discarded.</p>
 * 
 * <p>In order to allow the use of multisampled depth and stencil buffers when performing multisampled rendering to a texture, the extension also adds the
 * command RenderbufferStorageMultisampleEXT.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public class EXTMultisampledRenderToTexture {

    static { GLES.initialize(); }

    /** Accepted by the {@code pname} parameter of GetRenderbufferParameteriv. */
    public static final int GL_RENDERBUFFER_SAMPLES_EXT = 0x8CAB;

    /** Returned by CheckFramebufferStatus. */
    public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_EXT = 0x8D56;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, and GetFloatv. */
    public static final int GL_MAX_SAMPLES_EXT = 0x8D57;

    /** Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv. */
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_SAMPLES_EXT = 0x8D6C;

    protected EXTMultisampledRenderToTexture() {
        throw new UnsupportedOperationException();
    }

    // --- [ glRenderbufferStorageMultisampleEXT ] ---

    public static native void glRenderbufferStorageMultisampleEXT(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glFramebufferTexture2DMultisampleEXT ] ---

    public static native void glFramebufferTexture2DMultisampleEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLsizei") int samples);

}