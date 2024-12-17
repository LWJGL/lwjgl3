/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class OESPrimitiveBoundingBox {

    static { GLES.initialize(); }

    public static final int GL_PRIMITIVE_BOUNDING_BOX_OES = 0x92BE;

    protected OESPrimitiveBoundingBox() {
        throw new UnsupportedOperationException();
    }

    // --- [ glPrimitiveBoundingBoxOES ] ---

    /** {@code void glPrimitiveBoundingBoxOES(GLfloat minX, GLfloat minY, GLfloat minZ, GLfloat minW, GLfloat maxX, GLfloat maxY, GLfloat maxZ, GLfloat maxW)} */
    public static native void glPrimitiveBoundingBoxOES(@NativeType("GLfloat") float minX, @NativeType("GLfloat") float minY, @NativeType("GLfloat") float minZ, @NativeType("GLfloat") float minW, @NativeType("GLfloat") float maxX, @NativeType("GLfloat") float maxY, @NativeType("GLfloat") float maxZ, @NativeType("GLfloat") float maxW);

}