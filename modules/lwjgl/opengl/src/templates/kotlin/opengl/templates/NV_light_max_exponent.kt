/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_light_max_exponent = "NVLightMaxExponent".nativeClassGL("NV_light_max_exponent", postfix = NV) {
    IntConstant(
        "MAX_SHININESS_NV"..0x8504,
        "MAX_SPOT_EXPONENT_NV"..0x8505
    )
}