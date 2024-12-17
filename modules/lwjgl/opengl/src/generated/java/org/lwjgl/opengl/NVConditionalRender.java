/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class NVConditionalRender {

    static { GL.initialize(); }

    public static final int
        GL_QUERY_WAIT_NV              = 0x8E13,
        GL_QUERY_NO_WAIT_NV           = 0x8E14,
        GL_QUERY_BY_REGION_WAIT_NV    = 0x8E15,
        GL_QUERY_BY_REGION_NO_WAIT_NV = 0x8E16;

    protected NVConditionalRender() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBeginConditionalRenderNV ] ---

    /** {@code void glBeginConditionalRenderNV(GLuint id, GLenum mode)} */
    public static native void glBeginConditionalRenderNV(@NativeType("GLuint") int id, @NativeType("GLenum") int mode);

    // --- [ glEndConditionalRenderNV ] ---

    /** {@code void glEndConditionalRenderNV(void)} */
    public static native void glEndConditionalRenderNV();

}