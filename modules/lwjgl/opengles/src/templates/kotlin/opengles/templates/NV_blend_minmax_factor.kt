/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_blend_minmax_factor = "NVBlendMinmaxFactor".nativeClassGLES("NV_blend_minmax_factor", postfix = NV) {
    IntConstant(
        "FACTOR_MIN_AMD"..0x901C,
        "FACTOR_MAX_AMD"..0x901D
    )
}