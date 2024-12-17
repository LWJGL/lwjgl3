/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val ARM_shader_core_properties = "ARMShaderCoreProperties".nativeClassGLES("ARM_shader_core_properties", postfix = ARM) {
    IntConstant(
        "SHADER_CORE_COUNT_ARM"..0x96F0,
        "SHADER_CORE_ACTIVE_COUNT_ARM"..0x96F1,
        "SHADER_CORE_PRESENT_MASK_ARM"..0x96F2,
        "SHADER_CORE_MAX_WARP_COUNT_ARM"..0x96F3,
        "SHADER_CORE_PIXEL_RATE_ARM"..0x96F4,
        "SHADER_CORE_TEXEL_RATE_ARM"..0x96F5,
        "SHADER_CORE_FMA_RATE_ARM"..0x96F6
    )

    void(
        "MaxActiveShaderCoresARM",

        GLuint("count")
    )
}