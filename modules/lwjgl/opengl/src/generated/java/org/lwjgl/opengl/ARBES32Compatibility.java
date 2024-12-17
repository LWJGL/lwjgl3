/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class ARBES32Compatibility {

    static { GL.initialize(); }

    public static final int
        GL_PRIMITIVE_BOUNDING_BOX_ARB             = 0x92BE,
        GL_MULTISAMPLE_LINE_WIDTH_RANGE_ARB       = 0x9381,
        GL_MULTISAMPLE_LINE_WIDTH_GRANULARITY_ARB = 0x9382;

    protected ARBES32Compatibility() {
        throw new UnsupportedOperationException();
    }

    // --- [ glPrimitiveBoundingBoxARB ] ---

    /** {@code void glPrimitiveBoundingBoxARB(GLfloat minX, GLfloat minY, GLfloat minZ, GLfloat minW, GLfloat maxX, GLfloat maxY, GLfloat maxZ, GLfloat maxW)} */
    public static native void glPrimitiveBoundingBoxARB(@NativeType("GLfloat") float minX, @NativeType("GLfloat") float minY, @NativeType("GLfloat") float minZ, @NativeType("GLfloat") float minW, @NativeType("GLfloat") float maxX, @NativeType("GLfloat") float maxY, @NativeType("GLfloat") float maxZ, @NativeType("GLfloat") float maxW);

}