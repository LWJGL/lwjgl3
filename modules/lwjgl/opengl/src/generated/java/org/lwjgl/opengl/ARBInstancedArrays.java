/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class ARBInstancedArrays {

    static { GL.initialize(); }

    public static final int GL_VERTEX_ATTRIB_ARRAY_DIVISOR_ARB = 0x88FE;

    protected ARBInstancedArrays() {
        throw new UnsupportedOperationException();
    }

    // --- [ glVertexAttribDivisorARB ] ---

    /** {@code void glVertexAttribDivisorARB(GLuint index, GLuint divisor)} */
    public static native void glVertexAttribDivisorARB(@NativeType("GLuint") int index, @NativeType("GLuint") int divisor);

    // --- [ glVertexArrayVertexAttribDivisorEXT ] ---

    /** {@code void glVertexArrayVertexAttribDivisorEXT(GLuint vaobj, GLuint index, GLuint divisor)} */
    public static native void glVertexArrayVertexAttribDivisorEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLuint") int divisor);

}