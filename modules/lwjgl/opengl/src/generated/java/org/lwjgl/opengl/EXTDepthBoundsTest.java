/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class EXTDepthBoundsTest {

    static { GL.initialize(); }

    public static final int GL_DEPTH_BOUNDS_TEST_EXT = 0x8890;

    public static final int GL_DEPTH_BOUNDS_EXT = 0x8891;

    protected EXTDepthBoundsTest() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDepthBoundsEXT ] ---

    /** {@code void glDepthBoundsEXT(double zmin, double zmax)} */
    public static native void glDepthBoundsEXT(double zmin, double zmax);

}