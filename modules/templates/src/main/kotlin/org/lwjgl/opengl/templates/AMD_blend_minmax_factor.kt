/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val AMD_blend_minmax_factor = "AMDBlendMinmaxFactor".nativeClassGL("AMD_blend_minmax_factor", postfix = AMD) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The EXT_blend_minmax extension extended the GL's blending functionality to allow the blending equation to be specified by the application. That
        extension introduced the MIN_EXT and MAX_EXT blend equations, which caused the result of the blend equation to become the minimum or maximum of the
        source color and destination color, respectively.

        The MIN_EXT and MAX_EXT blend equations, however, do not include the source or destination blend factors in the arguments to the min and max functions.
        This extension provides two new blend equations that produce the minimum or maximum of the products of the source color and source factor, and the
        destination color and destination factor.
        """

    IntConstant(
        """
        Accepted by the {@code mode} parameter of BlendEquation and BlendEquationi, and by the {@code modeRGB} and {@code modeAlpha} parameters of
        BlendEquationSeparate and BlendEquationSeparatei.
        """,

        "FACTOR_MIN_AMD"..0x901C,
        "FACTOR_MAX_AMD"..0x901D
    )
}