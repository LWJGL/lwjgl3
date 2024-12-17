/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_conservative_raster_pre_snap = "NVConservativeRasterPreSnap".nativeClassGL("NV_conservative_raster_pre_snap", postfix = NV) {
    IntConstant(
        "CONSERVATIVE_RASTER_MODE_PRE_SNAP_NV"..0x9550
    )
}