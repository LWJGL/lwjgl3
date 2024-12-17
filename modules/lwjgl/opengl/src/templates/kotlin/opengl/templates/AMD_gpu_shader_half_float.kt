/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val AMD_gpu_shader_half_float = "AMDGPUShaderHalfFloat".nativeClassGL("AMD_gpu_shader_half_float", postfix = AMD) {
    IntConstant(
        "FLOAT16_MAT2_AMD"..0x91C5,
        "FLOAT16_MAT3_AMD"..0x91C6,
        "FLOAT16_MAT4_AMD"..0x91C7,
        "FLOAT16_MAT2x3_AMD"..0x91C8,
        "FLOAT16_MAT2x4_AMD"..0x91C9,
        "FLOAT16_MAT3x2_AMD"..0x91CA,
        "FLOAT16_MAT3x4_AMD"..0x91CB,
        "FLOAT16_MAT4x2_AMD"..0x91CC,
        "FLOAT16_MAT4x3_AMD"..0x91CD
    )
}