/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val APPLE_biased_fixed_point_image_formats = "APPLEBiasedFixedPointImageFormats".nativeClassCL("APPLE_biased_fixed_point_image_formats", APPLE) {
    IntConstant(
        "SFIXED14_APPLE"..0x10000008,
        "BIASED_HALF_APPLE"..0x10000009
    )
}