/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_blend_minmax_factor.txt">NV_blend_minmax_factor</a> extension.
 * 
 * <p>The {@link EXTBlendMinmax EXT_blend_minmax} extension extended the GL's blending functionality to allow the blending equation to be specified by the application. That
 * extension introduced the {@link EXTBlendMinmax#GL_MIN_EXT MIN_EXT} and {@link EXTBlendMinmax#GL_MAX_EXT MAX_EXT} blend equations, which caused the result of the blend equation to become the minimum or maximum of the
 * source color and destination color, respectively.</p>
 * 
 * <p>The {@code MIN_EXT} and {@code MAX_EXT} blend equations, however, do not include the source or destination blend factors in the arguments to the min
 * and max functions. This extension provides two new blend equations that produce the minimum or maximum of the products of the source color and source
 * factor, and the destination color and destination factor.</p>
 */
public final class NVBlendMinmaxFactor {

    /**
     * Accepted by the {@code mode} parameter of BlendEquation and BlendEquationi, and by the {@code modeRGB} and {@code modeAlpha} parameters of
     * BlendEquationSeparate and BlendEquationSeparatei.
     */
    public static final int
        GL_FACTOR_MIN_AMD = 0x901C,
        GL_FACTOR_MAX_AMD = 0x901D;

    private NVBlendMinmaxFactor() {}

}