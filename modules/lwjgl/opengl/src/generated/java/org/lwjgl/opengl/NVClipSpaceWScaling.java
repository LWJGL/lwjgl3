/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class NVClipSpaceWScaling {

    static { GL.initialize(); }

    public static final int GL_VIEWPORT_POSITION_W_SCALE_NV = 0x937C;

    public static final int
        GL_VIEWPORT_POSITION_W_SCALE_X_COEFF = 0x937D,
        GL_VIEWPORT_POSITION_W_SCALE_Y_COEFF = 0x937E;

    protected NVClipSpaceWScaling() {
        throw new UnsupportedOperationException();
    }

    // --- [ glViewportPositionWScaleNV ] ---

    /** {@code void glViewportPositionWScaleNV(GLuint index, GLfloat xcoeff, GLfloat ycoeff)} */
    public static native void glViewportPositionWScaleNV(@NativeType("GLuint") int index, @NativeType("GLfloat") float xcoeff, @NativeType("GLfloat") float ycoeff);

}