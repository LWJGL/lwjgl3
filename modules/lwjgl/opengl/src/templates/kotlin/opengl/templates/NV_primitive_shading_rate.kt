/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_primitive_shading_rate = "NVPrimitiveShadingRate".nativeClassGL("NV_primitive_shading_rate", postfix = NV) {
    IntConstant(
        "SHADING_RATE_IMAGE_PER_PRIMITIVE_NV"..0x95B1
    )

    IntConstant(
        "SHADING_RATE_IMAGE_PALETTE_COUNT_NV"..0x95B2
    )
}