/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class NVInstancedArrays {

    static { GLES.initialize(); }

    public static final int GL_VERTEX_ATTRIB_ARRAY_DIVISOR_NV = 0x88FE;

    protected NVInstancedArrays() {
        throw new UnsupportedOperationException();
    }

    // --- [ glVertexAttribDivisorNV ] ---

    /** {@code void glVertexAttribDivisorNV(GLuint index, GLuint divisor)} */
    public static native void glVertexAttribDivisorNV(@NativeType("GLuint") int index, @NativeType("GLuint") int divisor);

}