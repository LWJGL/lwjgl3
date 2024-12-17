/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_shadow_samplers = "EXTShadowSamplers".nativeClassGLES("EXT_shadow_samplers", postfix = EXT) {
    IntConstant(
        "TEXTURE_COMPARE_MODE_EXT"..0x884C,
        "TEXTURE_COMPARE_FUNC_EXT"..0x884D
    )

    IntConstant(
        "COMPARE_REF_TO_TEXTURE_EXT"..0x884E
    )

    IntConstant(
        "SAMPLER_2D_SHADOW_EXT"..0x8B62
    )
}