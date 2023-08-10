/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_env_combine.txt">ARB_texture_env_combine</a> extension.
 * 
 * <p>New texture environment function COMBINE_ARB allows programmable texture combiner operations.</p>
 * 
 * <p>Requires {@link ARBMultitexture ARB_multitexture}. Promoted to core in {@link GL13 OpenGL 1.3}.</p>
 */
public final class ARBTextureEnvCombine {

    /** Accepted by the {@code params} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code pname} parameter value is TEXTURE_ENV_MODE. */
    public static final int GL_COMBINE_ARB = 0x8570;

    /** Accepted by the {@code pname} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code target} parameter value is TEXTURE_ENV. */
    public static final int
        GL_COMBINE_RGB_ARB    = 0x8571,
        GL_COMBINE_ALPHA_ARB  = 0x8572,
        GL_SOURCE0_RGB_ARB    = 0x8580,
        GL_SOURCE1_RGB_ARB    = 0x8581,
        GL_SOURCE2_RGB_ARB    = 0x8582,
        GL_SOURCE0_ALPHA_ARB  = 0x8588,
        GL_SOURCE1_ALPHA_ARB  = 0x8589,
        GL_SOURCE2_ALPHA_ARB  = 0x858A,
        GL_OPERAND0_RGB_ARB   = 0x8590,
        GL_OPERAND1_RGB_ARB   = 0x8591,
        GL_OPERAND2_RGB_ARB   = 0x8592,
        GL_OPERAND0_ALPHA_ARB = 0x8598,
        GL_OPERAND1_ALPHA_ARB = 0x8599,
        GL_OPERAND2_ALPHA_ARB = 0x859A,
        GL_RGB_SCALE_ARB      = 0x8573;

    /**
     * Accepted by the {@code params} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code pname} parameter value is COMBINE_RGB_ARB or
     * COMBINE_ALPHA_ARB.
     */
    public static final int
        GL_ADD_SIGNED_ARB  = 0x8574,
        GL_INTERPOLATE_ARB = 0x8575,
        GL_SUBTRACT_ARB    = 0x84E7;

    /**
     * Accepted by the {@code params} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code pname} parameter value is SOURCE0_RGB_ARB,
     * SOURCE1_RGB_ARB, SOURCE2_RGB_ARB, SOURCE0_ALPHA_ARB, SOURCE1_ALPHA_ARB, or SOURCE2_ALPHA_ARB.
     */
    public static final int
        GL_CONSTANT_ARB      = 0x8576,
        GL_PRIMARY_COLOR_ARB = 0x8577,
        GL_PREVIOUS_ARB      = 0x8578;

    private ARBTextureEnvCombine() {}

}