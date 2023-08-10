/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/IMG/IMG_framebuffer_downsample.txt">IMG_framebuffer_downsample</a> extension.
 * 
 * <p>This extension introduces the ability to attach color buffers to a framebuffer that are at a lower resolution than the framebuffer itself, with the GPU
 * automatically downsampling the color attachment to fit.</p>
 * 
 * <p>This can be useful for various post-process rendering techniques where it is desirable to generate downsampled images in an efficient manner, or for a
 * lower resolution post-process technique.</p>
 * 
 * <p>This extension exposes at least a 2 x 2 downscale. Other downsampling modes may be exposed on the system and this can be queried.</p>
 */
public class IMGFramebufferDownsample {

    static { GLES.initialize(); }

    /** Returned by CheckFramebufferStatus. */
    public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_AND_DOWNSAMPLE_IMG = 0x913C;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetInteger64v, and GetInternalFormativ. */
    public static final int GL_NUM_DOWNSAMPLE_SCALES_IMG = 0x913D;

    /** Accepted by the {@code target} parameter of GetIntegerv, GetInteger64v, GetIntegeri_v, GetInteger64i_v and GetInternalFormativ. */
    public static final int GL_DOWNSAMPLE_SCALES_IMG = 0x913E;

    /** Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv. */
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_SCALE_IMG = 0x913F;

    protected IMGFramebufferDownsample() {
        throw new UnsupportedOperationException();
    }

    // --- [ glFramebufferTexture2DDownsampleIMG ] ---

    public static native void glFramebufferTexture2DDownsampleIMG(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xscale, @NativeType("GLint") int yscale);

    // --- [ glFramebufferTextureLayerDownsampleIMG ] ---

    public static native void glFramebufferTextureLayerDownsampleIMG(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int layer, @NativeType("GLint") int xscale, @NativeType("GLint") int yscale);

}