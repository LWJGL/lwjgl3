/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class EXTTextureArray {

    static { GL.initialize(); }

    public static final int
        GL_TEXTURE_1D_ARRAY_EXT = 0x8C18,
        GL_TEXTURE_2D_ARRAY_EXT = 0x8C1A;

    public static final int GL_PROXY_TEXTURE_2D_ARRAY_EXT = 0x8C1B;

    public static final int GL_PROXY_TEXTURE_1D_ARRAY_EXT = 0x8C19;

    public static final int
        GL_TEXTURE_BINDING_1D_ARRAY_EXT = 0x8C1C,
        GL_TEXTURE_BINDING_2D_ARRAY_EXT = 0x8C1D,
        GL_MAX_ARRAY_TEXTURE_LAYERS_EXT = 0x88FF;

    public static final int GL_COMPARE_REF_DEPTH_TO_TEXTURE_EXT = 0x884E;

    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER_EXT = 0x8CD4;

    public static final int
        GL_SAMPLER_1D_ARRAY_EXT        = 0x8DC0,
        GL_SAMPLER_2D_ARRAY_EXT        = 0x8DC1,
        GL_SAMPLER_1D_ARRAY_SHADOW_EXT = 0x8DC3,
        GL_SAMPLER_2D_ARRAY_SHADOW_EXT = 0x8DC4;

    protected EXTTextureArray() {
        throw new UnsupportedOperationException();
    }

    // --- [ glFramebufferTextureLayerEXT ] ---

    /** {@code void glFramebufferTextureLayerEXT(GLenum target, GLenum attachment, GLuint texture, GLint level, GLint layer)} */
    public static native void glFramebufferTextureLayerEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int layer);

}