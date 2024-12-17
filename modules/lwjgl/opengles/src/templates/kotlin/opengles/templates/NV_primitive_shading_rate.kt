/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_primitive_shading_rate = "NVPrimitiveShadingRate".nativeClassGLES("NV_primitive_shading_rate", postfix = NV) {
    IntConstant(
        "SHADING_RATE_IMAGE_PER_PRIMITIVE_NV"..0x95B1
    )

    IntConstant(
        "SHADING_RATE_IMAGE_PALETTE_COUNT_NV"..0x95B2
    )
}