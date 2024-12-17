/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class OESTextureView {

    static { GLES.initialize(); }

    public static final int
        GL_TEXTURE_VIEW_MIN_LEVEL_OES  = 0x82DB,
        GL_TEXTURE_VIEW_NUM_LEVELS_OES = 0x82DC,
        GL_TEXTURE_VIEW_MIN_LAYER_OES  = 0x82DD,
        GL_TEXTURE_VIEW_NUM_LAYERS_OES = 0x82DE,
        GL_TEXTURE_IMMUTABLE_LEVELS    = 0x82DF;

    protected OESTextureView() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTextureViewOES ] ---

    /** {@code void glTextureViewOES(GLuint texture, GLenum target, GLuint origtexture, GLenum internalformat, GLuint minlevel, GLuint numlevels, GLuint minlayer, GLuint numlayers)} */
    public static native void glTextureViewOES(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLuint") int origtexture, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int minlevel, @NativeType("GLuint") int numlevels, @NativeType("GLuint") int minlayer, @NativeType("GLuint") int numlayers);

}