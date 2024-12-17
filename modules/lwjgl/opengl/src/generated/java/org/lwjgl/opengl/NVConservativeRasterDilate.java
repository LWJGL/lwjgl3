/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class NVConservativeRasterDilate {

    static { GL.initialize(); }

    public static final int
        GL_CONSERVATIVE_RASTER_DILATE_NV             = 0x9379,
        GL_CONSERVATIVE_RASTER_DILATE_RANGE_NV       = 0x937A,
        GL_CONSERVATIVE_RASTER_DILATE_GRANULARITY_NV = 0x937B;

    protected NVConservativeRasterDilate() {
        throw new UnsupportedOperationException();
    }

    // --- [ glConservativeRasterParameterfNV ] ---

    /** {@code void glConservativeRasterParameterfNV(GLenum pname, GLfloat value)} */
    public static native void glConservativeRasterParameterfNV(@NativeType("GLenum") int pname, @NativeType("GLfloat") float value);

}