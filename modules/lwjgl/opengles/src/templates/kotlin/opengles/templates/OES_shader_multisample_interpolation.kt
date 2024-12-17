/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_shader_multisample_interpolation = "OESShaderMultisampleInterpolation".nativeClassGLES("OES_shader_multisample_interpolation", postfix = OES) {
    IntConstant(
        "MIN_FRAGMENT_INTERPOLATION_OFFSET_OES"..0x8E5B,
        "MAX_FRAGMENT_INTERPOLATION_OFFSET_OES"..0x8E5C,
        "FRAGMENT_INTERPOLATION_OFFSET_BITS_OES"..0x8E5D
    )
}