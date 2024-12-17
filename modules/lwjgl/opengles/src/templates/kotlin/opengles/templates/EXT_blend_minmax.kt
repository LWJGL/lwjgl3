/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_blend_minmax = "EXTBlendMinmax".nativeClassGLES("EXT_blend_minmax", postfix = EXT) {
    IntConstant(
        "FUNC_ADD_EXT"..0x8006,
        "MIN_EXT"..0x8007,
        "MAX_EXT"..0x8008
    )

    IntConstant(
        "BLEND_EQUATION_EXT"..0x8009
    )
}