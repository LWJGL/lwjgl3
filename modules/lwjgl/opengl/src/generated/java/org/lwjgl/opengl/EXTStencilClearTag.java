/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class EXTStencilClearTag {

    static { GL.initialize(); }

    public static final int
        GL_STENCIL_TAG_BITS_EXT        = 0x88F2,
        GL_STENCIL_CLEAR_TAG_VALUE_EXT = 0x88F3;

    protected EXTStencilClearTag() {
        throw new UnsupportedOperationException();
    }

    // --- [ glStencilClearTagEXT ] ---

    /** {@code void glStencilClearTagEXT(GLsizei stencilTagBits, GLuint stencilClearTag)} */
    public static native void glStencilClearTagEXT(@NativeType("GLsizei") int stencilTagBits, @NativeType("GLuint") int stencilClearTag);

}