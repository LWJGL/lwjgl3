/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class EXTBlendMinmax {

    static { GL.initialize(); }

    public static final int
        GL_FUNC_ADD_EXT = 0x8006,
        GL_MIN_EXT      = 0x8007,
        GL_MAX_EXT      = 0x8008;

    public static final int GL_BLEND_EQUATION_EXT = 0x8009;

    protected EXTBlendMinmax() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBlendEquationEXT ] ---

    /** {@code void glBlendEquationEXT(GLenum mode)} */
    public static native void glBlendEquationEXT(@NativeType("GLenum") int mode);

}