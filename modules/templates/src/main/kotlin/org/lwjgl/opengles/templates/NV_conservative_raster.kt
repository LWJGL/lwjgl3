/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val NV_conservative_raster = "NVConservativeRaster".nativeClassGLES("NV_conservative_raster", postfix = NV) {
    documentation =
        """
        Native bindings to the ${registryLink("NV", "conservative_raster")} extension.

        This extension adds a "conservative" rasterization mode where any pixel that is partially covered, even if no sample location is covered, is treated as
        fully covered and a corresponding fragment will be shaded.

        A new control is also added to modify window coordinate snapping precision.

        These controls can be used to implement "binning" to a low-resolution render target, for example to determine which tiles of a sparse texture need to
        be populated. An app can construct a framebuffer where there is one pixel per tile in the sparse texture, and adjust the number of subpixel bits such
        that snapping occurs to the same effective grid as when rendering to the sparse texture. Then triangles should cover (at least) the same pixels in the
        low-res framebuffer as they do tiles in the sparse texture.

        Requires ${GLES20.core}.
        """

    IntConstant(
        "Accepted by the {@code cap} parameter of Enable, Disable, IsEnabled.",

        "CONSERVATIVE_RASTERIZATION_NV"..0x9346
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.",

        "SUBPIXEL_PRECISION_BIAS_X_BITS_NV"..0x9347,
        "SUBPIXEL_PRECISION_BIAS_Y_BITS_NV"..0x9348,
        "MAX_SUBPIXEL_PRECISION_BIAS_BITS_NV"..0x9349
    )

    void(
        "SubpixelPrecisionBiasNV",
        "",

        GLuint.IN("xbits", ""),
        GLuint.IN("ybits", "")
    )
}