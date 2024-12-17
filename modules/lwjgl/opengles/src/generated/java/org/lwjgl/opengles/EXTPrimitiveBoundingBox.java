/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class EXTPrimitiveBoundingBox {

    static { GLES.initialize(); }

    public static final int GL_PRIMITIVE_BOUNDING_BOX_EXT = 0x92BE;

    protected EXTPrimitiveBoundingBox() {
        throw new UnsupportedOperationException();
    }

    // --- [ glPrimitiveBoundingBoxEXT ] ---

    /** {@code void glPrimitiveBoundingBoxEXT(GLfloat minX, GLfloat minY, GLfloat minZ, GLfloat minW, GLfloat maxX, GLfloat maxY, GLfloat maxZ, GLfloat maxW)} */
    public static native void glPrimitiveBoundingBoxEXT(@NativeType("GLfloat") float minX, @NativeType("GLfloat") float minY, @NativeType("GLfloat") float minZ, @NativeType("GLfloat") float minW, @NativeType("GLfloat") float maxX, @NativeType("GLfloat") float maxY, @NativeType("GLfloat") float maxZ, @NativeType("GLfloat") float maxW);

}