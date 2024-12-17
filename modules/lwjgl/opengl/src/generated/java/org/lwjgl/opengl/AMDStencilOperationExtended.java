/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class AMDStencilOperationExtended {

    static { GL.initialize(); }

    public static final int
        GL_SET_AMD           = 0x874A,
        GL_REPLACE_VALUE_AMD = 0x874B;

    public static final int
        GL_STENCIL_OP_VALUE_AMD      = 0x874C,
        GL_STENCIL_BACK_OP_VALUE_AMD = 0x874D;

    protected AMDStencilOperationExtended() {
        throw new UnsupportedOperationException();
    }

    // --- [ glStencilOpValueAMD ] ---

    /** {@code void glStencilOpValueAMD(GLenum face, GLuint value)} */
    public static native void glStencilOpValueAMD(@NativeType("GLenum") int face, @NativeType("GLuint") int value);

}