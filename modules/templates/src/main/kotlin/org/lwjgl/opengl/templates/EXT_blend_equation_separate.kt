/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_blend_equation_separate = "EXTBlendEquationSeparate".nativeClassGL("EXT_blend_equation_separate", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        ${registryLinkTo("EXT", "blend_func_separate")} introduced separate RGB and alpha blend factors. ${registryLinkTo("EXT", "blend_minmax")} introduced a
        distinct blend equation for combining source and destination blend terms. (${registryLinkTo("EXT_blend_subtract", "blend_subtract")} &
        ${registryLinkTo("EXT", "blend_logic_op")} added other blend equation modes.) OpenGL 1.4 integrated both functionalities into the core standard.

        While there are separate blend functions for the RGB and alpha blend factors, OpenGL 1.4 provides a single blend equation that applies to both RGB and
        alpha portions of blending.

        This extension provides a separate blend equation for RGB and alpha to match the generality available for blend factors.

        Requires ${GL14.core} or ${ARB_imaging.link} or ${registryLinkTo("EXT", "blend_minmax")} and/or
        ${registryLinkTo("EXT_blend_subtract", "blend_subtract")}. ${GL20.promoted}
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "BLEND_EQUATION_RGB_EXT"..0x8009,
        "BLEND_EQUATION_ALPHA_EXT"..0x883D
    )

    void(
        "BlendEquationSeparateEXT",
        "",

        GLenum.IN("modeRGB", ""),
        GLenum.IN("modeAlpha", "")
    )
}