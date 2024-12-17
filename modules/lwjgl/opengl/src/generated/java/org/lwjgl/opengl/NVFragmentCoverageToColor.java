/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class NVFragmentCoverageToColor {

    static { GL.initialize(); }

    public static final int GL_FRAGMENT_COVERAGE_TO_COLOR_NV = 0x92DD;

    public static final int GL_FRAGMENT_COVERAGE_COLOR_NV = 0x92DE;

    protected NVFragmentCoverageToColor() {
        throw new UnsupportedOperationException();
    }

    // --- [ glFragmentCoverageColorNV ] ---

    /** {@code void glFragmentCoverageColorNV(GLuint color)} */
    public static native void glFragmentCoverageColorNV(@NativeType("GLuint") int color);

}