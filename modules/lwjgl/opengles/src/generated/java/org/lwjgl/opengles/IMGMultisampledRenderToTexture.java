/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/IMG/IMG_multisampled_render_to_texture.txt">IMG_multisampled_render_to_texture</a> extension.
 * 
 * <p>This extension introduces functionality to perform multisampled rendering to a color renderable texture, without requiring an explicit resolve of
 * multisample data.</p>
 * 
 * <p>Some GPU architectures - such as tile-based renderers - are capable of performing multisampled rendering by storing multisample data in internal
 * high-speed memory and downsampling the data when writing out to external memory after rendering has finished. Since per-sample data is never written
 * out to external memory, this approach saves bandwidth and storage space. In this case multisample data gets discarded, however this is acceptable in
 * most cases.</p>
 * 
 * <p>The extension provides a new command, FramebufferTexture2DMultisampleIMG, which attaches a texture level to a framebuffer and enables multisampled
 * rendering to that texture level.</p>
 * 
 * <p>When the texture level is used as a source or destination for any operation other than drawing to it, an implicit resolve of multisampled color data is
 * performed. After such a resolve, the multisampled color data is discarded.</p>
 * 
 * <p>In order to allow the use of multisampled depth and stencil buffers when performing multisampled rendering to a texture, the extension also adds the
 * command RenderbufferStorageMultisampleIMG.</p>
 */
public class IMGMultisampledRenderToTexture {

    static { GLES.initialize(); }

    /** Accepted by the {@code pname} parameter of GetRenderbufferParameteriv. */
    public static final int GL_RENDERBUFFER_SAMPLES_IMG = 0x9133;

    /** Returned by CheckFramebufferStatus. */
    public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_IMG = 0x9134;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int GL_MAX_SAMPLES_IMG = 0x9135;

    /** Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv. */
    public static final int GL_TEXTURE_SAMPLES_IMG = 0x9136;

    protected IMGMultisampledRenderToTexture() {
        throw new UnsupportedOperationException();
    }

    // --- [ glRenderbufferStorageMultisampleIMG ] ---

    public static native void glRenderbufferStorageMultisampleIMG(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glFramebufferTexture2DMultisampleIMG ] ---

    public static native void glFramebufferTexture2DMultisampleIMG(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLsizei") int samples);

}