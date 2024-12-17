/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class ARBColorBufferFloat {

    static { GL.initialize(); }

    public static final int GL_RGBA_FLOAT_MODE_ARB = 0x8820;

    public static final int
        GL_CLAMP_VERTEX_COLOR_ARB   = 0x891A,
        GL_CLAMP_FRAGMENT_COLOR_ARB = 0x891B,
        GL_CLAMP_READ_COLOR_ARB     = 0x891C;

    public static final int GL_FIXED_ONLY_ARB = 0x891D;

    protected ARBColorBufferFloat() {
        throw new UnsupportedOperationException();
    }

    // --- [ glClampColorARB ] ---

    /** {@code void glClampColorARB(GLenum target, GLenum clamp)} */
    public static native void glClampColorARB(@NativeType("GLenum") int target, @NativeType("GLenum") int clamp);

}