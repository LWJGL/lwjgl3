/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class ARBTextureView {

    static { GL.initialize(); }

    public static final int
        GL_TEXTURE_VIEW_MIN_LEVEL   = 0x82DB,
        GL_TEXTURE_VIEW_NUM_LEVELS  = 0x82DC,
        GL_TEXTURE_VIEW_MIN_LAYER   = 0x82DD,
        GL_TEXTURE_VIEW_NUM_LAYERS  = 0x82DE,
        GL_TEXTURE_IMMUTABLE_LEVELS = 0x82DF;

    protected ARBTextureView() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTextureView ] ---

    /** {@code void glTextureView(GLuint texture, GLenum target, GLuint origtexture, GLenum internalformat, GLuint minlevel, GLuint numlevels, GLuint minlayer, GLuint numlayers)} */
    public static void glTextureView(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLuint") int origtexture, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int minlevel, @NativeType("GLuint") int numlevels, @NativeType("GLuint") int minlayer, @NativeType("GLuint") int numlayers) {
        GL43C.glTextureView(texture, target, origtexture, internalformat, minlevel, numlevels, minlayer, numlayers);
    }

}