/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_raster_multisample = "EXTRasterMultisample".nativeClassGLES("EXT_raster_multisample", postfix = EXT) {
    documentation =
        """
        Native bindings to the ${registryLink("EXT", "raster_multisample")} extension.

        This extension allows rendering to a non-multisample color buffer while rasterizing with more than one sample. The result of rasterization (coverage)
        is available in the gl_SampleMaskIn[] fragment shader input, multisample rasterization is enabled for all primitives, and several per- fragment
        operations operate at the raster sample rate.

        When using the functionality provided by this extension, depth, stencil, and depth bounds tests must be disabled, and a multisample draw framebuffer
        must not be used.

        A fragment's "coverage", or "effective raster samples" is considered to have "N bits" (as opposed to "one bit" corresponding to the single color
        sample) through the fragment shader, in the sample mask output, through the multisample fragment operations and occlusion query, until the coverage is
        finally "reduced" to a single bit in a new "Coverage Reduction" stage that occurs before blending.

        Requires ${GLES30.core}.
        """

    IntConstant(
        "Accepted by the {@code cap} parameter of Enable, Disable, IsEnabled.",

        "RASTER_MULTISAMPLE_EXT"..0x9327
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.",

        "RASTER_SAMPLES_EXT"..0x9328,
        "MAX_RASTER_SAMPLES_EXT"..0x9329,
        "RASTER_FIXED_SAMPLE_LOCATIONS_EXT"..0x932A,
        "MULTISAMPLE_RASTERIZATION_ALLOWED_EXT"..0x932B,
        "EFFECTIVE_RASTER_SAMPLES_EXT"..0x932C
    )

    void(
        "RasterSamplesEXT",
        "",

        GLuint.IN("samples", ""),
        GLboolean.IN("fixedsamplelocations", "")
    )
}