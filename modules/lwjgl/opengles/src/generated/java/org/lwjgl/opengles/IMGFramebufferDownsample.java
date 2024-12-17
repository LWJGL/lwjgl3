/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class IMGFramebufferDownsample {

    static { GLES.initialize(); }

    public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_AND_DOWNSAMPLE_IMG = 0x913C;

    public static final int GL_NUM_DOWNSAMPLE_SCALES_IMG = 0x913D;

    public static final int GL_DOWNSAMPLE_SCALES_IMG = 0x913E;

    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_SCALE_IMG = 0x913F;

    protected IMGFramebufferDownsample() {
        throw new UnsupportedOperationException();
    }

    // --- [ glFramebufferTexture2DDownsampleIMG ] ---

    /** {@code void glFramebufferTexture2DDownsampleIMG(GLenum target, GLenum attachment, GLenum textarget, GLuint texture, GLint level, GLint xscale, GLint yscale)} */
    public static native void glFramebufferTexture2DDownsampleIMG(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xscale, @NativeType("GLint") int yscale);

    // --- [ glFramebufferTextureLayerDownsampleIMG ] ---

    /** {@code void glFramebufferTextureLayerDownsampleIMG(GLenum target, GLenum attachment, GLuint texture, GLint level, GLint layer, GLint xscale, GLint yscale)} */
    public static native void glFramebufferTextureLayerDownsampleIMG(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int layer, @NativeType("GLint") int xscale, @NativeType("GLint") int yscale);

}