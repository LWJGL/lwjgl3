/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_shadow_samplers_array = "NVShadowSamplersArray".nativeClassGLES("NV_shadow_samplers_array", postfix = NV) {
    IntConstant(
        "SAMPLER_2D_ARRAY_SHADOW_NV"..0x8DC4
    )
}