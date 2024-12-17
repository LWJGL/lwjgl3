/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_half_float_pixel = "ARBHalfFloatPixel".nativeClassGL("ARB_half_float_pixel", postfix = ARB) {
    IntConstant(
        "HALF_FLOAT_ARB"..0x140B
    )
}