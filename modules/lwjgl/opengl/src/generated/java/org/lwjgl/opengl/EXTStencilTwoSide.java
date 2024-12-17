/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class EXTStencilTwoSide {

    static { GL.initialize(); }

    public static final int GL_STENCIL_TEST_TWO_SIDE_EXT = 0x8910;

    public static final int GL_ACTIVE_STENCIL_FACE_EXT = 0x8911;

    protected EXTStencilTwoSide() {
        throw new UnsupportedOperationException();
    }

    // --- [ glActiveStencilFaceEXT ] ---

    /** {@code void glActiveStencilFaceEXT(GLenum face)} */
    public static native void glActiveStencilFaceEXT(@NativeType("GLenum") int face);

}