/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class EXTBlendColor {

    static { GL.initialize(); }

    public static final int
        GL_CONSTANT_COLOR_EXT           = 0x8001,
        GL_ONE_MINUS_CONSTANT_COLOR_EXT = 0x8002,
        GL_CONSTANT_ALPHA_EXT           = 0x8003,
        GL_ONE_MINUS_CONSTANT_ALPHA_EXT = 0x8004;

    public static final int GL_BLEND_COLOR_EXT = 0x8005;

    protected EXTBlendColor() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBlendColorEXT ] ---

    /** {@code void glBlendColorEXT(GLfloat red, GLfloat green, GLfloat blue, GLfloat alpha)} */
    public static native void glBlendColorEXT(@NativeType("GLfloat") float red, @NativeType("GLfloat") float green, @NativeType("GLfloat") float blue, @NativeType("GLfloat") float alpha);

}