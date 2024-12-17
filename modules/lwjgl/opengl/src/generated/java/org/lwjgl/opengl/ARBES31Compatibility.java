/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class ARBES31Compatibility {

    static { GL.initialize(); }

    protected ARBES31Compatibility() {
        throw new UnsupportedOperationException();
    }

    // --- [ glMemoryBarrierByRegion ] ---

    /** {@code void glMemoryBarrierByRegion(GLbitfield barriers)} */
    public static void glMemoryBarrierByRegion(@NativeType("GLbitfield") int barriers) {
        GL45C.glMemoryBarrierByRegion(barriers);
    }

}