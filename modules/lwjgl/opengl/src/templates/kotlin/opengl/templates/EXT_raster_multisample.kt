/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_raster_multisample = "EXTRasterMultisample".nativeClassGL("EXT_raster_multisample", postfix = EXT) {
    IntConstant(
        "RASTER_MULTISAMPLE_EXT"..0x9327
    )

    IntConstant(
        "RASTER_SAMPLES_EXT"..0x9328,
        "MAX_RASTER_SAMPLES_EXT"..0x9329,
        "RASTER_FIXED_SAMPLE_LOCATIONS_EXT"..0x932A,
        "MULTISAMPLE_RASTERIZATION_ALLOWED_EXT"..0x932B,
        "EFFECTIVE_RASTER_SAMPLES_EXT"..0x932C
    )

    void(
        "RasterSamplesEXT",

        GLuint("samples"),
        GLboolean("fixedsamplelocations")
    )
}