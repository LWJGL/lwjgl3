/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class EXTProvokingVertex {

    static { GL.initialize(); }

    public static final int
        GL_FIRST_VERTEX_CONVENTION_EXT = 0x8E4D,
        GL_LAST_VERTEX_CONVENTION_EXT  = 0x8E4E;

    public static final int
        GL_PROVOKING_VERTEX_EXT                         = 0x8E4F,
        GL_QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION_EXT = 0x8E4C;

    protected EXTProvokingVertex() {
        throw new UnsupportedOperationException();
    }

    // --- [ glProvokingVertexEXT ] ---

    /** {@code void glProvokingVertexEXT(GLenum mode)} */
    public static native void glProvokingVertexEXT(@NativeType("GLenum") int mode);

}