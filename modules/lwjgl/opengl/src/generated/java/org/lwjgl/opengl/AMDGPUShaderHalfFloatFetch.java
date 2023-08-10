/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_gpu_shader_half_float_fetch.txt">AMD_gpu_shader_half_float_fetch</a> extension.
 * 
 * <p>This extension was developed based on the {@code AMD_gpu_shader_half_float} extension to allow implementations supporting half-precision floating-point
 * both in shader texture functions and in shader image memory functions.</p>
 * 
 * <p>Requires {@link GL40 OpenGL 4.0}, GLSL 4.00 and {@link AMDGPUShaderHalfFloat AMD_gpu_shader_half_float}.</p>
 */
public final class AMDGPUShaderHalfFloatFetch {

    /** Returned by the {@code type} parameter of {@link GL20C#glGetActiveUniform GetActiveUniform} and {@link GL43C#glGetProgramResourceiv GetProgramResourceiv}. */
    public static final int
        GL_FLOAT16_SAMPLER_1D_AMD                    = 0x91CE,
        GL_FLOAT16_SAMPLER_2D_AMD                    = 0x91CF,
        GL_FLOAT16_SAMPLER_3D_AMD                    = 0x91D0,
        GL_FLOAT16_SAMPLER_CUBE_AMD                  = 0x91D1,
        GL_FLOAT16_SAMPLER_2D_RECT_AMD               = 0x91D2,
        GL_FLOAT16_SAMPLER_1D_ARRAY_AMD              = 0x91D3,
        GL_FLOAT16_SAMPLER_2D_ARRAY_AMD              = 0x91D4,
        GL_FLOAT16_SAMPLER_CUBE_MAP_ARRAY_AMD        = 0x91D5,
        GL_FLOAT16_SAMPLER_BUFFER_AMD                = 0x91D6,
        GL_FLOAT16_SAMPLER_2D_MULTISAMPLE_AMD        = 0x91D7,
        GL_FLOAT16_SAMPLER_2D_MULTISAMPLE_ARRAY_AMD  = 0x91D8,
        GL_FLOAT16_SAMPLER_1D_SHADOW_AMD             = 0x91D9,
        GL_FLOAT16_SAMPLER_2D_SHADOW_AMD             = 0x91DA,
        GL_FLOAT16_SAMPLER_2D_RECT_SHADOW_AMD        = 0x91DB,
        GL_FLOAT16_SAMPLER_1D_ARRAY_SHADOW_AMD       = 0x91DC,
        GL_FLOAT16_SAMPLER_2D_ARRAY_SHADOW_AMD       = 0x91DD,
        GL_FLOAT16_SAMPLER_CUBE_SHADOW_AMD           = 0x91DE,
        GL_FLOAT16_SAMPLER_CUBE_MAP_ARRAY_SHADOW_AMD = 0x91DF,
        GL_FLOAT16_IMAGE_1D_AMD                      = 0x91E0,
        GL_FLOAT16_IMAGE_2D_AMD                      = 0x91E1,
        GL_FLOAT16_IMAGE_3D_AMD                      = 0x91E2,
        GL_FLOAT16_IMAGE_2D_RECT_AMD                 = 0x91E3,
        GL_FLOAT16_IMAGE_CUBE_AMD                    = 0x91E4,
        GL_FLOAT16_IMAGE_1D_ARRAY_AMD                = 0x91E5,
        GL_FLOAT16_IMAGE_2D_ARRAY_AMD                = 0x91E6,
        GL_FLOAT16_IMAGE_CUBE_MAP_ARRAY_AMD          = 0x91E7,
        GL_FLOAT16_IMAGE_BUFFER_AMD                  = 0x91E8,
        GL_FLOAT16_IMAGE_2D_MULTISAMPLE_AMD          = 0x91E9,
        GL_FLOAT16_IMAGE_2D_MULTISAMPLE_ARRAY_AMD    = 0x91EA;

    private AMDGPUShaderHalfFloatFetch() {}

}