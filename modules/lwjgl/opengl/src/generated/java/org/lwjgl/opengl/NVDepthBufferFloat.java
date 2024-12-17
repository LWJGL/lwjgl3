/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class NVDepthBufferFloat {

    static { GL.initialize(); }

    public static final int
        GL_DEPTH_COMPONENT32F_NV = 0x8DAB,
        GL_DEPTH32F_STENCIL8_NV  = 0x8DAC;

    public static final int GL_FLOAT_32_UNSIGNED_INT_24_8_REV_NV = 0x8DAD;

    public static final int GL_DEPTH_BUFFER_FLOAT_MODE_NV = 0x8DAF;

    protected NVDepthBufferFloat() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDepthRangedNV ] ---

    /** {@code void glDepthRangedNV(GLdouble zNear, GLdouble zFar)} */
    public static native void glDepthRangedNV(@NativeType("GLdouble") double zNear, @NativeType("GLdouble") double zFar);

    // --- [ glClearDepthdNV ] ---

    /** {@code void glClearDepthdNV(GLdouble depth)} */
    public static native void glClearDepthdNV(@NativeType("GLdouble") double depth);

    // --- [ glDepthBoundsdNV ] ---

    /** {@code void glDepthBoundsdNV(GLdouble zmin, GLdouble zmax)} */
    public static native void glDepthBoundsdNV(@NativeType("GLdouble") double zmin, @NativeType("GLdouble") double zmax);

}