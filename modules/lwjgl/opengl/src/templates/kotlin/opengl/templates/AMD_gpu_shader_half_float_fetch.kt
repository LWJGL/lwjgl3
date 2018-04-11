/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val AMD_gpu_shader_half_float_fetch = "AMDGPUShaderHalfFloatFetch".nativeClassGL("AMD_gpu_shader_half_float_fetch", postfix = AMD) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension was developed based on the {@code AMD_gpu_shader_half_float} extension to allow implementations supporting half-precision floating-point
        both in shader texture functions and in shader image memory functions.

        Requires ${GL40.core}, GLSL 4.00 and ${AMD_gpu_shader_half_float.link}.
        """

    IntConstant(
        "Returned by the {@code type} parameter of #GetActiveUniform() and #GetProgramResourceiv().",

        "FLOAT16_SAMPLER_1D_AMD"..0x91CE,
        "FLOAT16_SAMPLER_2D_AMD"..0x91CF,
        "FLOAT16_SAMPLER_3D_AMD"..0x91D0,
        "FLOAT16_SAMPLER_CUBE_AMD"..0x91D1,
        "FLOAT16_SAMPLER_2D_RECT_AMD"..0x91D2,
        "FLOAT16_SAMPLER_1D_ARRAY_AMD"..0x91D3,
        "FLOAT16_SAMPLER_2D_ARRAY_AMD"..0x91D4,
        "FLOAT16_SAMPLER_CUBE_MAP_ARRAY_AMD"..0x91D5,
        "FLOAT16_SAMPLER_BUFFER_AMD"..0x91D6,
        "FLOAT16_SAMPLER_2D_MULTISAMPLE_AMD"..0x91D7,
        "FLOAT16_SAMPLER_2D_MULTISAMPLE_ARRAY_AMD"..0x91D8,
        "FLOAT16_SAMPLER_1D_SHADOW_AMD"..0x91D9,
        "FLOAT16_SAMPLER_2D_SHADOW_AMD"..0x91DA,
        "FLOAT16_SAMPLER_2D_RECT_SHADOW_AMD"..0x91DB,
        "FLOAT16_SAMPLER_1D_ARRAY_SHADOW_AMD"..0x91DC,
        "FLOAT16_SAMPLER_2D_ARRAY_SHADOW_AMD"..0x91DD,
        "FLOAT16_SAMPLER_CUBE_SHADOW_AMD"..0x91DE,
        "FLOAT16_SAMPLER_CUBE_MAP_ARRAY_SHADOW_AMD"..0x91DF,
        "FLOAT16_IMAGE_1D_AMD"..0x91E0,
        "FLOAT16_IMAGE_2D_AMD"..0x91E1,
        "FLOAT16_IMAGE_3D_AMD"..0x91E2,
        "FLOAT16_IMAGE_2D_RECT_AMD"..0x91E3,
        "FLOAT16_IMAGE_CUBE_AMD"..0x91E4,
        "FLOAT16_IMAGE_1D_ARRAY_AMD"..0x91E5,
        "FLOAT16_IMAGE_2D_ARRAY_AMD"..0x91E6,
        "FLOAT16_IMAGE_CUBE_MAP_ARRAY_AMD"..0x91E7,
        "FLOAT16_IMAGE_BUFFER_AMD"..0x91E8,
        "FLOAT16_IMAGE_2D_MULTISAMPLE_AMD"..0x91E9,
        "FLOAT16_IMAGE_2D_MULTISAMPLE_ARRAY_AMD"..0x91EA
    )
}