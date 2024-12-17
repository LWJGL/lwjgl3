/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class EXTPolygonOffsetClamp {

    static { GL.initialize(); }

    public static final int GL_POLYGON_OFFSET_CLAMP_EXT = 0x8E1B;

    protected EXTPolygonOffsetClamp() {
        throw new UnsupportedOperationException();
    }

    // --- [ glPolygonOffsetClampEXT ] ---

    /** {@code void glPolygonOffsetClampEXT(GLfloat factor, GLfloat units, GLfloat clamp)} */
    public static native void glPolygonOffsetClampEXT(@NativeType("GLfloat") float factor, @NativeType("GLfloat") float units, @NativeType("GLfloat") float clamp);

}