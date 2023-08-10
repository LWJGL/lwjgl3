/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_conservative_raster_pre_snap.txt">NV_conservative_raster_pre_snap</a> extension.
 * 
 * <p>{@link NVConservativeRasterPreSnapTriangles NV_conservative_raster_pre_snap_triangles} provides a new mode to achieve rasterization of triangles that is conservative w.r.t the triangle at
 * infinite precision i.e. before it is snapped to the sub-pixel grid. This extension provides a new mode that expands this functionality to lines and
 * points.</p>
 * 
 * <p>Requires {@link NVConservativeRasterPreSnapTriangles NV_conservative_raster_pre_snap_triangles}.</p>
 */
public final class NVConservativeRasterPreSnap {

    /** Accepted by the {@code param} parameter of {@link NVConservativeRasterPreSnapTriangles#glConservativeRasterParameteriNV ConservativeRasterParameteriNV} */
    public static final int GL_CONSERVATIVE_RASTER_MODE_PRE_SNAP_NV = 0x9550;

    private NVConservativeRasterPreSnap() {}

}