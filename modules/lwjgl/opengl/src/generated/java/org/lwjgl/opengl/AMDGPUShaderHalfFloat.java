/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_gpu_shader_half_float.txt">AMD_gpu_shader_half_float</a> extension.
 * 
 * <p>This extension was developed based on the {@link NVGPUShader5 NV_gpu_shader5} extension to allow implementations supporting half float in shader and expose the
 * feature without the additional requirements that are present in {@code NV_gpu_shader5}.</p>
 * 
 * <p>The extension introduces the following features for all shader types:</p>
 * 
 * <ul>
 * <li>support for half float scalar, vector and matrix data types in shader;</li>
 * <li>new built-in functions to pack and unpack half float types into a 32-bit integer vector;</li>
 * <li>half float support for all existing single float built-in functions, including angle functions, exponential functions, common functions, geometric
 * functions, matrix functions and etc.;</li>
 * </ul>
 * 
 * <p>This extension is designed to be a functional superset of the half-precision floating-point support from NV_gpu_shader5 and to keep source code
 * compatible with that, thus the new procedures, functions, and tokens are identical to those found in that extension.</p>
 * 
 * <p>Requires {@link GL40 OpenGL 4.0} and GLSL 4.00.</p>
 */
public final class AMDGPUShaderHalfFloat {

    /** Returned by the {@code type} parameter of GetActiveAttrib, GetActiveUniform, and GetTransformFeedbackVarying. */
    public static final int
        GL_FLOAT16_MAT2_AMD   = 0x91C5,
        GL_FLOAT16_MAT3_AMD   = 0x91C6,
        GL_FLOAT16_MAT4_AMD   = 0x91C7,
        GL_FLOAT16_MAT2x3_AMD = 0x91C8,
        GL_FLOAT16_MAT2x4_AMD = 0x91C9,
        GL_FLOAT16_MAT3x2_AMD = 0x91CA,
        GL_FLOAT16_MAT3x4_AMD = 0x91CB,
        GL_FLOAT16_MAT4x2_AMD = 0x91CC,
        GL_FLOAT16_MAT4x3_AMD = 0x91CD;

    private AMDGPUShaderHalfFloat() {}

}