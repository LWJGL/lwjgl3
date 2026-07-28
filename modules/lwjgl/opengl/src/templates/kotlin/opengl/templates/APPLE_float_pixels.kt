/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val APPLE_float_pixels = "APPLEFloatPixels".nativeClassGL("APPLE_float_pixels") {
    IntConstant(
        "HALF_APPLE"..0x140B
    )

    IntConstant(
        "COLOR_FLOAT_APPLE"..0x8A0F
    )

    IntConstant(
        "RGBA_FLOAT32_APPLE"..0x8814,
        "RGB_FLOAT32_APPLE"..0x8815,
        "ALPHA_FLOAT32_APPLE"..0x8816,
        "INTENSITY_FLOAT32_APPLE"..0x8817,
        "LUMINANCE_FLOAT32_APPLE"..0x8818,
        "LUMINANCE_ALPHA_FLOAT32_APPLE"..0x8819,
        "RGBA_FLOAT16_APPLE"..0x881A,
        "RGB_FLOAT16_APPLE"..0x881B,
        "ALPHA_FLOAT16_APPLE"..0x881C,
        "INTENSITY_FLOAT16_APPLE"..0x881D,
        "LUMINANCE_FLOAT16_APPLE"..0x881E,
        "LUMINANCE_ALPHA_FLOAT16_APPLE"..0x881F
    )
}