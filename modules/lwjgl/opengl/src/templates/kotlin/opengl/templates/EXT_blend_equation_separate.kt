/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_blend_equation_separate = "EXTBlendEquationSeparate".nativeClassGL("EXT_blend_equation_separate", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        ${EXT_blend_func_separate.link} introduced separate RGB and alpha blend factors. ${EXT_blend_minmax.link} introduced a distinct blend equation for
        combining source and destination blend terms. (${EXT_blend_subtract.link} &amp; ${registryLinkTo("EXT", "blend_logic_op")} added other blend equation
        modes.) OpenGL 1.4 integrated both functionalities into the core standard.

        While there are separate blend functions for the RGB and alpha blend factors, OpenGL 1.4 provides a single blend equation that applies to both RGB and
        alpha portions of blending.

        This extension provides a separate blend equation for RGB and alpha to match the generality available for blend factors.

        Requires ${GL14.core} or ${ARB_imaging.link} or ${EXT_blend_minmax.link} and/or ${EXT_blend_subtract.link}. ${GL20.promoted}
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "BLEND_EQUATION_RGB_EXT"..0x8009,
        "BLEND_EQUATION_ALPHA_EXT"..0x883D
    )

    void(
        "BlendEquationSeparateEXT",
        "",

        GLenum("modeRGB", ""),
        GLenum("modeAlpha", "")
    )
}