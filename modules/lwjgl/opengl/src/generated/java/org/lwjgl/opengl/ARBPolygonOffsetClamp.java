/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class ARBPolygonOffsetClamp {

    static { GL.initialize(); }

    public static final int GL_POLYGON_OFFSET_CLAMP = 0x8E1B;

    protected ARBPolygonOffsetClamp() {
        throw new UnsupportedOperationException();
    }

    // --- [ glPolygonOffsetClamp ] ---

    /** {@code void glPolygonOffsetClamp(GLfloat factor, GLfloat units, GLfloat clamp)} */
    public static void glPolygonOffsetClamp(@NativeType("GLfloat") float factor, @NativeType("GLfloat") float units, @NativeType("GLfloat") float clamp) {
        GL46C.glPolygonOffsetClamp(factor, units, clamp);
    }

}