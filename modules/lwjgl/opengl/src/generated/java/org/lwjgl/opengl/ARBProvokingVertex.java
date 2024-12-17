/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class ARBProvokingVertex {

    static { GL.initialize(); }

    public static final int
        GL_FIRST_VERTEX_CONVENTION = 0x8E4D,
        GL_LAST_VERTEX_CONVENTION  = 0x8E4E;

    public static final int
        GL_PROVOKING_VERTEX                         = 0x8E4F,
        GL_QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION = 0x8E4C;

    protected ARBProvokingVertex() {
        throw new UnsupportedOperationException();
    }

    // --- [ glProvokingVertex ] ---

    /** {@code void glProvokingVertex(GLenum mode)} */
    public static void glProvokingVertex(@NativeType("GLenum") int mode) {
        GL32C.glProvokingVertex(mode);
    }

}