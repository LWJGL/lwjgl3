/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class NVPrimitiveRestart {

    static { GL.initialize(); }

    public static final int GL_PRIMITIVE_RESTART_NV = 0x8558;

    public static final int GL_PRIMITIVE_RESTART_INDEX_NV = 0x8559;

    protected NVPrimitiveRestart() {
        throw new UnsupportedOperationException();
    }

    // --- [ glPrimitiveRestartNV ] ---

    /** {@code void glPrimitiveRestartNV(void)} */
    public static native void glPrimitiveRestartNV();

    // --- [ glPrimitiveRestartIndexNV ] ---

    /** {@code void glPrimitiveRestartIndexNV(GLuint index)} */
    public static native void glPrimitiveRestartIndexNV(@NativeType("GLuint") int index);

}