/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_conservative_raster_pre_snap_triangles = "NVConservativeRasterPreSnapTriangles".nativeClassGL("NV_conservative_raster_pre_snap_triangles", postfix = NV) {
    IntConstant(
        "CONSERVATIVE_RASTER_MODE_NV"..0x954D
    )

    IntConstant(
        "CONSERVATIVE_RASTER_MODE_POST_SNAP_NV"..0x954E,
        "CONSERVATIVE_RASTER_MODE_PRE_SNAP_TRIANGLES_NV"..0x954F
    )

    void(
        "ConservativeRasterParameteriNV",

        GLenum("pname"),
        GLint("param")
    )
}