/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class ARBClipControl {

    static { GL.initialize(); }

    public static final int
        GL_LOWER_LEFT = 0x8CA1,
        GL_UPPER_LEFT = 0x8CA2;

    public static final int
        GL_NEGATIVE_ONE_TO_ONE = 0x935E,
        GL_ZERO_TO_ONE         = 0x935F;

    public static final int
        GL_CLIP_ORIGIN     = 0x935C,
        GL_CLIP_DEPTH_MODE = 0x935D;

    protected ARBClipControl() {
        throw new UnsupportedOperationException();
    }

    // --- [ glClipControl ] ---

    /** {@code void glClipControl(GLenum origin, GLenum depth)} */
    public static void glClipControl(@NativeType("GLenum") int origin, @NativeType("GLenum") int depth) {
        GL45C.glClipControl(origin, depth);
    }

}