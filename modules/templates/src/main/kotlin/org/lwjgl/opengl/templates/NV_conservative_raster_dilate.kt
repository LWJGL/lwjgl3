/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_conservative_raster_dilate = "NVConservativeRasterDilate".nativeClassGL("NV_conservative_raster_dilate", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension extends the conservative rasterization funtionality provided by NV_conservative_raster. It provides a new control to generate an
        "over-conservative" rasterization by dilating primitives prior to rasterization.

        When using conservative raster to bin geometry, this extension provides a programmable overlap region between adjacent primitives. Regular
        rasterization bins triangles with a shared edge uniquely into pixels. Conservative raster has a one-pixel overlap along the shared edge. Using a
        half-pixel raster dilation, this overlap region increases to two pixels.

        Requires ${NV_conservative_raster.link}.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of ConservativeRasterParameterfNV, GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.",

        "CONSERVATIVE_RASTER_DILATE_NV"..0x9379,
        "CONSERVATIVE_RASTER_DILATE_RANGE_NV"..0x937A,
        "CONSERVATIVE_RASTER_DILATE_GRANULARITY_NV"..0x937B
    )

    void(
        "ConservativeRasterParameterfNV",
        "",

        GLenum.IN("pname", ""),
        GLfloat.IN("value", "")
    )
}