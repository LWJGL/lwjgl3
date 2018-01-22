/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_conservative_raster_pre_snap = "NVConservativeRasterPreSnap".nativeClassGL("NV_conservative_raster_pre_snap", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        ${NV_conservative_raster_pre_snap_triangles.link} provides a new mode to achieve rasterization of triangles that is conservative w.r.t the triangle at
        infinite precision i.e. before it is snapped to the sub-pixel grid. This extension provides a new mode that expands this functionality to lines and
        points.

        Requires ${NV_conservative_raster_pre_snap_triangles.link}.
        """

    IntConstant(
        "Accepted by the {@code param} parameter of #ConservativeRasterParameteriNV()",

        "CONSERVATIVE_RASTER_MODE_PRE_SNAP_NV"..0x9550
    )
}