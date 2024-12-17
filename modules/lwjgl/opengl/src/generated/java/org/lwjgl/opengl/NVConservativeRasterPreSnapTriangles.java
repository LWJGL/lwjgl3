/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class NVConservativeRasterPreSnapTriangles {

    static { GL.initialize(); }

    public static final int GL_CONSERVATIVE_RASTER_MODE_NV = 0x954D;

    public static final int
        GL_CONSERVATIVE_RASTER_MODE_POST_SNAP_NV          = 0x954E,
        GL_CONSERVATIVE_RASTER_MODE_PRE_SNAP_TRIANGLES_NV = 0x954F;

    protected NVConservativeRasterPreSnapTriangles() {
        throw new UnsupportedOperationException();
    }

    // --- [ glConservativeRasterParameteriNV ] ---

    /** {@code void glConservativeRasterParameteriNV(GLenum pname, GLint param)} */
    public static native void glConservativeRasterParameteriNV(@NativeType("GLenum") int pname, @NativeType("GLint") int param);

}