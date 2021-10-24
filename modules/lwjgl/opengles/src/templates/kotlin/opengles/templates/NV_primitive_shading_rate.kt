/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_primitive_shading_rate = "NVPrimitiveShadingRate".nativeClassGLES("NV_primitive_shading_rate", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension builds on top of the {@code NV_shading_rate_image} extension to provide OpenGL API support for using a per-primitive shading rate value
        to control the computation of the rate used to process each fragment.

        In the {@code NV_shading_rate_image} extension, the shading rate for each fragment produced by a primitive is determined by looking up a texel in the
        bound shading rate image and using that value as an index into a shading rate palette. That extension provides a separate shading rate image lookup
        enable and palette for each viewport. When a primitive is rasterized, the implementation uses the enable and palette associated with the primitive's
        viewport to determine the shading rate.

        This extension decouples the shading rate image enables and palettes from viewports. The number of enables/palettes now comes from the
        implementation-dependent constant #SHADING_RATE_IMAGE_PALETTE_COUNT_NV. When {@code SHADING_RATE_IMAGE_PER_PRIMITIVE_NV} (added here) is enabled, the
        value of the new {@code gl_ShadingRateNV} built-in output is used to select an enable and palette to determine the shading rate. Otherwise, the
        viewport number for the primitive is used, as in {@code NV_shading_rate_image}.
        
        Requires ${GLES32.core}.
        """

    IntConstant(
        """
        Accepted by the {@code cap} parameter of #Enable(), #Disable(), and #IsEnabled() and by the {@code pname} parameter of #GetBooleanv(), #GetIntegerv(),
        #GetInteger64v(), #GetFloatv().
        """,

        "SHADING_RATE_IMAGE_PER_PRIMITIVE_NV"..0x95B1
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of #GetBooleanv(), #GetIntegerv(), and #GetFloatv().",

        "SHADING_RATE_IMAGE_PALETTE_COUNT_NV"..0x95B2
    )
}