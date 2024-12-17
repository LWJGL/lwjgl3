/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_shadow_samplers_cube = "NVShadowSamplersCube".nativeClassGLES("NV_shadow_samplers_cube", postfix = NV) {
    IntConstant(
        "SAMPLER_CUBE_SHADOW_NV"..0x8DC5
    )
}