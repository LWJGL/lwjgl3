/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_conservative_raster_dilate = "NVConservativeRasterDilate".nativeClassGL("NV_conservative_raster_dilate", postfix = NV) {
    IntConstant(
        "CONSERVATIVE_RASTER_DILATE_NV"..0x9379,
        "CONSERVATIVE_RASTER_DILATE_RANGE_NV"..0x937A,
        "CONSERVATIVE_RASTER_DILATE_GRANULARITY_NV"..0x937B
    )

    void(
        "ConservativeRasterParameterfNV",

        GLenum("pname"),
        GLfloat("value")
    )
}