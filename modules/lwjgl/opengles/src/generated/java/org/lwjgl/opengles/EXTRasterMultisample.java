/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class EXTRasterMultisample {

    static { GLES.initialize(); }

    public static final int GL_RASTER_MULTISAMPLE_EXT = 0x9327;

    public static final int
        GL_RASTER_SAMPLES_EXT                    = 0x9328,
        GL_MAX_RASTER_SAMPLES_EXT                = 0x9329,
        GL_RASTER_FIXED_SAMPLE_LOCATIONS_EXT     = 0x932A,
        GL_MULTISAMPLE_RASTERIZATION_ALLOWED_EXT = 0x932B,
        GL_EFFECTIVE_RASTER_SAMPLES_EXT          = 0x932C;

    protected EXTRasterMultisample() {
        throw new UnsupportedOperationException();
    }

    // --- [ glRasterSamplesEXT ] ---

    /** {@code void glRasterSamplesEXT(GLuint samples, GLboolean fixedsamplelocations)} */
    public static native void glRasterSamplesEXT(@NativeType("GLuint") int samples, @NativeType("GLboolean") boolean fixedsamplelocations);

}