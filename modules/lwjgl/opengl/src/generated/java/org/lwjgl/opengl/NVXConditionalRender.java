/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class NVXConditionalRender {

    static { GL.initialize(); }

    protected NVXConditionalRender() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBeginConditionalRenderNVX ] ---

    /** {@code void glBeginConditionalRenderNVX(GLuint id)} */
    public static native void glBeginConditionalRenderNVX(@NativeType("GLuint") int id);

    // --- [ glEndConditionalRenderNVX ] ---

    /** {@code void glEndConditionalRenderNVX(void)} */
    public static native void glEndConditionalRenderNVX();

}