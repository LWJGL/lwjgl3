/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * When {@link NVConservativeRaster#GL_CONSERVATIVE_RASTERIZATION_NV CONSERVATIVE_RASTERIZATION_NV} is enabled, the fragments generated for a primitive are conservative with respect to the primitive after snapping
 * to sub-pixel grid. This extension provides a new mode of rasterization for triangles where the fragments generated are conservative with respect to the
 * primitive at infinite precision before vertex snapping.
 * 
 * <p>When the conservative raster mode is set to {@link #GL_CONSERVATIVE_RASTER_MODE_PRE_SNAP_TRIANGLES_NV CONSERVATIVE_RASTER_MODE_PRE_SNAP_TRIANGLES_NV}, triangles are rasterized more conservatively, and may
 * generate fragments not generated when the mode is {@link #GL_CONSERVATIVE_RASTER_MODE_POST_SNAP_NV CONSERVATIVE_RASTER_MODE_POST_SNAP_NV} (default). In particular it may generate fragments for pixels
 * covered by triangles with zero area, or for pixels that are adjacent to but not covered by any triangle. This modified behavior may be useful in
 * compensating for rounding errors caused by snapping vertex positions to a sub-pixel grid during rasterization. It's possible that a non-degenerate
 * triangle becomes degenerate due to snapping. It's additionally possible that rounding errors in computing the position of a vertex or from snapping may
 * cause a primitive that would cover a pixel at infinite precision to fail to cover the pixel post-snap. Rasterizing such primitives more conservatively
 * may be useful for "binning" algorithms described in {@link NVConservativeRaster NV_conservative_raster}.</p>
 * 
 * <p>Requires {@link NVConservativeRaster NV_conservative_raster}.</p>
 */
public class NVConservativeRasterPreSnapTriangles {

    static { GL.initialize(); }

    /** Accepted by the {@code pname} parameter of ConservativeRasterParameteriNV. */
    public static final int GL_CONSERVATIVE_RASTER_MODE_NV = 0x954D;

    /** Accepted by the {@code param} parameter of ConservativeRasterParameteriNV. */
    public static final int
        GL_CONSERVATIVE_RASTER_MODE_POST_SNAP_NV          = 0x954E,
        GL_CONSERVATIVE_RASTER_MODE_PRE_SNAP_TRIANGLES_NV = 0x954F;

    protected NVConservativeRasterPreSnapTriangles() {
        throw new UnsupportedOperationException();
    }

    // --- [ glConservativeRasterParameteriNV ] ---

    /**
     * When {@link NVConservativeRaster#GL_CONSERVATIVE_RASTERIZATION_NV CONSERVATIVE_RASTERIZATION_NV} is enabled, the rasterization behavior may be controlled by calling the this command.
     * 
     * <p>If the mode is set to {@link #GL_CONSERVATIVE_RASTER_MODE_POST_SNAP_NV CONSERVATIVE_RASTER_MODE_POST_SNAP_NV}, the generated fragments are conservative w.r.t the primitive after it is snapped to
     * sub-pixel grid. If the mode is set to {@link #GL_CONSERVATIVE_RASTER_MODE_PRE_SNAP_TRIANGLES_NV CONSERVATIVE_RASTER_MODE_PRE_SNAP_TRIANGLES_NV} the fragments generated for triangles will be conservative w.r.t
     * the triangle at infinite precision. Since non-degenerate triangles may become degenerate due to vertex snapping, this mode will generate fragments for
     * zero area triangles that are otherwise culled when the mode is {@link #GL_CONSERVATIVE_RASTER_MODE_POST_SNAP_NV CONSERVATIVE_RASTER_MODE_POST_SNAP_NV}. This mode may also generate fragments for pixels
     * that are within half a sub-pixel distance away from a triangle's infinite precision boundary. The default mode is set to
     * {@link #GL_CONSERVATIVE_RASTER_MODE_POST_SNAP_NV CONSERVATIVE_RASTER_MODE_POST_SNAP_NV}.</p>
     *
     * @param pname the parameter to set. Must be:<br><table><tr><td>{@link #GL_CONSERVATIVE_RASTER_MODE_NV CONSERVATIVE_RASTER_MODE_NV}</td></tr></table>
     * @param param specifies the conservative raster mode to be used. One of:<br><table><tr><td>{@link #GL_CONSERVATIVE_RASTER_MODE_POST_SNAP_NV CONSERVATIVE_RASTER_MODE_POST_SNAP_NV}</td></tr><tr><td>{@link #GL_CONSERVATIVE_RASTER_MODE_PRE_SNAP_TRIANGLES_NV CONSERVATIVE_RASTER_MODE_PRE_SNAP_TRIANGLES_NV}</td></tr></table>
     */
    public static native void glConservativeRasterParameteriNV(@NativeType("GLenum") int pname, @NativeType("GLint") int param);

}