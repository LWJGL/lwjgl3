/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class NVConservativeRaster {

    static { GLES.initialize(); }

    public static final int GL_CONSERVATIVE_RASTERIZATION_NV = 0x9346;

    public static final int
        GL_SUBPIXEL_PRECISION_BIAS_X_BITS_NV   = 0x9347,
        GL_SUBPIXEL_PRECISION_BIAS_Y_BITS_NV   = 0x9348,
        GL_MAX_SUBPIXEL_PRECISION_BIAS_BITS_NV = 0x9349;

    protected NVConservativeRaster() {
        throw new UnsupportedOperationException();
    }

    // --- [ glSubpixelPrecisionBiasNV ] ---

    /** {@code void glSubpixelPrecisionBiasNV(GLuint xbits, GLuint ybits)} */
    public static native void glSubpixelPrecisionBiasNV(@NativeType("GLuint") int xbits, @NativeType("GLuint") int ybits);

}