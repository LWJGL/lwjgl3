/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val NV_blend_equation_advanced = "NVBlendEquationAdvanced".nativeClassGLES("NV_blend_equation_advanced", postfix = NV) {
    documentation =
        """
        Native bindings to the ${registryLink("NV", "blend_equation_advanced")} extension.

        This extension adds a number of "advanced" blending equations that can be used to perform new color blending operations, many of which are more complex
        than the standard blend modes provided by unextended OpenGL. This extension provides two different extension string entries:
        ${ul(
            """
            NV_blend_equation_advanced: Provides the new blending equations, but guarantees defined results only if each sample is touched no more than once in
            any single rendering pass. The command BlendBarrierNV() is provided to indicate a boundary between passes.
            """,
            """
            NV_blend_equation_advanced_coherent: Provides the new blending equations, and guarantees that blending is done coherently and in API primitive
            ordering. An enable is provided to allow implementations to opt out of fully coherent blending and instead behave as though only
            NV_blend_equation_advanced were supported.
            """
        )}
        Some implementations may support NV_blend_equation_advanced without supporting NV_blend_equation_advanced_coherent.

        In unextended OpenGL, the set of blending equations is limited, and can be expressed very simply. The MIN and MAX blend equations simply compute
        component-wise minimums or maximums of source and destination color components. The FUNC_ADD, FUNC_SUBTRACT, and FUNC_REVERSE_SUBTRACT multiply the
        source and destination colors by source and destination factors and either add the two products together or subtract one from the other. This limited
        set of operations supports many common blending operations but precludes the use of more sophisticated transparency and blending operations commonly
        available in many dedicated imaging APIs.

        This extension provides a number of new "advanced" blending equations. Unlike traditional blending operations using the FUNC_ADD equation, these
        blending equations do not use source and destination factors specified by BlendFunc. Instead, each blend equation specifies a complete equation based
        on the source and destination colors. These new blend equations are used for both RGB and alpha components; they may not be used to perform separate
        RGB and alpha blending (via functions like BlendEquationSeparate).

        These blending operations are performed using premultiplied colors, where RGB colors stored in the framebuffer are considered to be multiplied by alpha
        (coverage). The fragment color may be considered premultiplied or non-premultiplied, according the BLEND_PREMULTIPLIED_SRC_NV blending parameter (as
        specified by the new BlendParameteriNV function). If fragment color is considered non-premultiplied, the (R,G,B) color components are multiplied by the
        alpha component prior to blending. For non-premultiplied color components in the range [0,1], the corresponding premultiplied color component would
        have values in the range [0*A,1*A].

        Many of these advanced blending equations are formulated where the result of blending source and destination colors with partial coverage have three
        separate contributions: from the portions covered by both the source and the destination, from the portion covered only by the source, and from the
        portion covered only by the destination. The blend parameter BLEND_OVERLAP_NV can be used to specify a correlation between source and destination pixel
        coverage. If set to CONJOINT_NV, the source and destination are considered to have maximal overlap, as would be the case if drawing two objects on top
        of each other. If set to DISJOINT_NV, the source and destination are considered to have minimal overlap, as would be the case when rendering a complex
        polygon tessellated into individual non-intersecting triangles. If set to UNCORRELATED_NV (default), the source and destination coverage are assumed to
        have no spatial correlation within the pixel.

        In addition to the coherency issues on implementations not supporting NV_blend_equation_advanced_coherent, this extension has several limitations worth
        noting. First, the new blend equations are not supported while rendering to more than one color buffer at once; an INVALID_OPERATION will be generated
        if an application attempts to render any primitives in this unsupported configuration. Additionally, blending precision may be limited to 16-bit
        floating-point, which could result in a loss of precision and dynamic range for framebuffer formats with 32-bit floating-point components, and in a
        loss of precision for formats with 12- and 16-bit signed or unsigned normalized integer components.

        Requires ${GLES20.core}.
        """

    IntConstant(
        """
        The BLEND_ADVANCED_COHERENT_NV enable is provided if and only if the NV_blend_equation_advanced_coherent extension is supported. On implementations
        supporting only NV_blend_equation_advanced, this enable is considered not to exist. Accepted by the {@code pname} parameter of BlendParameteriNV,
        GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.
        """,

        "BLEND_PREMULTIPLIED_SRC_NV"..0x9280,
        "BLEND_OVERLAP_NV"..0x9281
    )

    IntConstant(
        "Accepted by the {@code value} parameter of BlendParameteriNV when {@code pname} is BLEND_OVERLAP_NV.",

        "UNCORRELATED_NV"..0x9282,
        "DISJOINT_NV"..0x9283,
        "CONJOINT_NV"..0x9284
    )

    IntConstant(
        "Accepted by the {@code mode} parameter of BlendEquation and BlendEquationi.",

        "SRC_NV"..0x9286,
        "DST_NV"..0x9287,
        "SRC_OVER_NV"..0x9288,
        "DST_OVER_NV"..0x9289,
        "SRC_IN_NV"..0x928A,
        "DST_IN_NV"..0x928B,
        "SRC_OUT_NV"..0x928C,
        "DST_OUT_NV"..0x928D,
        "SRC_ATOP_NV"..0x928E,
        "DST_ATOP_NV"..0x928F,
        "XOR_NV"..0x1506,
        "MULTIPLY_NV"..0x9294,
        "SCREEN_NV"..0x9295,
        "OVERLAY_NV"..0x9296,
        "DARKEN_NV"..0x9297,
        "LIGHTEN_NV"..0x9298,
        "COLORDODGE_NV"..0x9299,
        "COLORBURN_NV"..0x929A,
        "HARDLIGHT_NV"..0x929B,
        "SOFTLIGHT_NV"..0x929C,
        "DIFFERENCE_NV"..0x929E,
        "EXCLUSION_NV"..0x92A0,
        "INVERT_RGB_NV"..0x92A3,
        "LINEARDODGE_NV"..0x92A4,
        "LINEARBURN_NV"..0x92A5,
        "VIVIDLIGHT_NV"..0x92A6,
        "LINEARLIGHT_NV"..0x92A7,
        "PINLIGHT_NV"..0x92A8,
        "HARDMIX_NV"..0x92A9,
        "HSL_HUE_NV"..0x92AD,
        "HSL_SATURATION_NV"..0x92AE,
        "HSL_COLOR_NV"..0x92AF,
        "HSL_LUMINOSITY_NV"..0x92B0,
        "PLUS_NV"..0x9291,
        "PLUS_CLAMPED_NV"..0x92B1,
        "PLUS_CLAMPED_ALPHA_NV"..0x92B2,
        "PLUS_DARKER_NV"..0x9292,
        "MINUS_NV"..0x929F,
        "MINUS_CLAMPED_NV"..0x92B3,
        "CONTRAST_NV"..0x92A1,
        "INVERT_OVG_NV"..0x92B4,
        "RED_NV"..0x1903,
        "GREEN_NV"..0x1904,
        "BLUE_NV"..0x1905
    )

    void(
        "BlendParameteriNV",
        "",

        GLenum.IN("pname", ""),
        GLint.IN("value", "")
    )

    void(
        "BlendBarrierNV",
        ""
    )
}

val NV_blend_equation_advanced_coherent = "NVBlendEquationAdvancedCoherent".nativeClassGLES("NV_blend_equation_advanced_coherent", postfix = NV) {
    documentation =
        """
        Native bindings to the ${registryLink("NV", "blend_equation_advanced")} extension.

        Requires ${GLES20.core}.
        """

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Disable, Enable, and IsEnabled, and by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetFloatv,
        GetDoublev and GetInteger64v.
        """,

        "BLEND_ADVANCED_COHERENT_NV"..0x9285
    )
}