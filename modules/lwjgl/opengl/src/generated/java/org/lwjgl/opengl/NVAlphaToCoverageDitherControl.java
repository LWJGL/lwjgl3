/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class NVAlphaToCoverageDitherControl {

    static { GL.initialize(); }

    public static final int
        GL_ALPHA_TO_COVERAGE_DITHER_DEFAULT_NV = 0x934D,
        GL_ALPHA_TO_COVERAGE_DITHER_ENABLE_NV  = 0x934E,
        GL_ALPHA_TO_COVERAGE_DITHER_DISABLE_NV = 0x934F;

    public static final int GL_ALPHA_TO_COVERAGE_DITHER_MODE_NV = 0x92BF;

    protected NVAlphaToCoverageDitherControl() {
        throw new UnsupportedOperationException();
    }

    // --- [ glAlphaToCoverageDitherControlNV ] ---

    /** {@code void glAlphaToCoverageDitherControlNV(GLenum mode)} */
    public static native void glAlphaToCoverageDitherControlNV(@NativeType("GLenum") int mode);

}