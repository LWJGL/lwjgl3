/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_conservative_raster = "NVConservativeRaster".nativeClassGLES("NV_conservative_raster", postfix = NV) {
    IntConstant(
        "CONSERVATIVE_RASTERIZATION_NV"..0x9346
    )

    IntConstant(
        "SUBPIXEL_PRECISION_BIAS_X_BITS_NV"..0x9347,
        "SUBPIXEL_PRECISION_BIAS_Y_BITS_NV"..0x9348,
        "MAX_SUBPIXEL_PRECISION_BIAS_BITS_NV"..0x9349
    )

    void(
        "SubpixelPrecisionBiasNV",

        GLuint("xbits"),
        GLuint("ybits")
    )
}