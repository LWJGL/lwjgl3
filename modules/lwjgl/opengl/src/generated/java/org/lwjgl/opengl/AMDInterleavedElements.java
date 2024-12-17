/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class AMDInterleavedElements {

    static { GL.initialize(); }

    public static final int GL_VERTEX_ELEMENT_SWIZZLE_AMD = 0x91A4;

    public static final int GL_VERTEX_ID_SWIZZLE_AMD = 0x91A5;

    protected AMDInterleavedElements() {
        throw new UnsupportedOperationException();
    }

    // --- [ glVertexAttribParameteriAMD ] ---

    /** {@code void glVertexAttribParameteriAMD(GLuint index, GLenum pname, GLint param)} */
    public static native void glVertexAttribParameteriAMD(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint") int param);

}