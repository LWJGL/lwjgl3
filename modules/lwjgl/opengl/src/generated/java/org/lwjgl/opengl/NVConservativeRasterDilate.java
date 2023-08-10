/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_conservative_raster_dilate.txt">NV_conservative_raster_dilate</a> extension.
 * 
 * <p>This extension extends the conservative rasterization funtionality provided by NV_conservative_raster. It provides a new control to generate an
 * "over-conservative" rasterization by dilating primitives prior to rasterization.</p>
 * 
 * <p>When using conservative raster to bin geometry, this extension provides a programmable overlap region between adjacent primitives. Regular
 * rasterization bins triangles with a shared edge uniquely into pixels. Conservative raster has a one-pixel overlap along the shared edge. Using a
 * half-pixel raster dilation, this overlap region increases to two pixels.</p>
 * 
 * <p>Requires {@link NVConservativeRaster NV_conservative_raster}.</p>
 */
public class NVConservativeRasterDilate {

    static { GL.initialize(); }

    /** Accepted by the {@code pname} parameter of ConservativeRasterParameterfNV, GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev. */
    public static final int
        GL_CONSERVATIVE_RASTER_DILATE_NV             = 0x9379,
        GL_CONSERVATIVE_RASTER_DILATE_RANGE_NV       = 0x937A,
        GL_CONSERVATIVE_RASTER_DILATE_GRANULARITY_NV = 0x937B;

    protected NVConservativeRasterDilate() {
        throw new UnsupportedOperationException();
    }

    // --- [ glConservativeRasterParameterfNV ] ---

    public static native void glConservativeRasterParameterfNV(@NativeType("GLenum") int pname, @NativeType("GLfloat") float value);

}