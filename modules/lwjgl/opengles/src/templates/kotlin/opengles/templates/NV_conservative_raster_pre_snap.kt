/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_conservative_raster_pre_snap = "NVConservativeRasterPreSnap".nativeClassGLES("NV_conservative_raster_pre_snap", postfix = NV) {
    IntConstant(
        "CONSERVATIVE_RASTER_MODE_PRE_SNAP_NV"..0x9550
    )
}