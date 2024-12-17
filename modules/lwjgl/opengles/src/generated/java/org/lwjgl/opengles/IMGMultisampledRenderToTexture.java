/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class IMGMultisampledRenderToTexture {

    static { GLES.initialize(); }

    public static final int GL_RENDERBUFFER_SAMPLES_IMG = 0x9133;

    public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_IMG = 0x9134;

    public static final int GL_MAX_SAMPLES_IMG = 0x9135;

    public static final int GL_TEXTURE_SAMPLES_IMG = 0x9136;

    protected IMGMultisampledRenderToTexture() {
        throw new UnsupportedOperationException();
    }

    // --- [ glRenderbufferStorageMultisampleIMG ] ---

    /** {@code void glRenderbufferStorageMultisampleIMG(GLenum target, GLsizei samples, GLenum internalformat, GLsizei width, GLsizei height)} */
    public static native void glRenderbufferStorageMultisampleIMG(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glFramebufferTexture2DMultisampleIMG ] ---

    /** {@code void glFramebufferTexture2DMultisampleIMG(GLenum target, GLenum attachment, GLenum textarget, GLuint texture, GLint level, GLsizei samples)} */
    public static native void glFramebufferTexture2DMultisampleIMG(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLsizei") int samples);

}