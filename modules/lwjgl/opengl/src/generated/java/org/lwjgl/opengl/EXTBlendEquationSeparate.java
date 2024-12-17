/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class EXTBlendEquationSeparate {

    static { GL.initialize(); }

    public static final int
        GL_BLEND_EQUATION_RGB_EXT   = 0x8009,
        GL_BLEND_EQUATION_ALPHA_EXT = 0x883D;

    protected EXTBlendEquationSeparate() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBlendEquationSeparateEXT ] ---

    /** {@code void glBlendEquationSeparateEXT(GLenum modeRGB, GLenum modeAlpha)} */
    public static native void glBlendEquationSeparateEXT(@NativeType("GLenum") int modeRGB, @NativeType("GLenum") int modeAlpha);

}