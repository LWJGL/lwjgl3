/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_blend_equation_advanced.txt">NV_blend_equation_advanced</a> extension.
 * 
 * <p>This extension adds a number of "advanced" blending equations that can be used to perform new color blending operations, many of which are more complex
 * than the standard blend modes provided by unextended OpenGL. This extension provides two different extension string entries:</p>
 * 
 * <ul>
 * <li>NV_blend_equation_advanced: Provides the new blending equations, but guarantees defined results only if each sample is touched no more than once in
 * any single rendering pass. The command BlendBarrierNV() is provided to indicate a boundary between passes.</li>
 * <li>NV_blend_equation_advanced_coherent: Provides the new blending equations, and guarantees that blending is done coherently and in API primitive
 * ordering. An enable is provided to allow implementations to opt out of fully coherent blending and instead behave as though only
 * NV_blend_equation_advanced were supported.</li>
 * </ul>
 * 
 * <p>Some implementations may support NV_blend_equation_advanced without supporting NV_blend_equation_advanced_coherent.</p>
 * 
 * <p>In unextended OpenGL, the set of blending equations is limited, and can be expressed very simply. The MIN and MAX blend equations simply compute
 * component-wise minimums or maximums of source and destination color components. The FUNC_ADD, FUNC_SUBTRACT, and FUNC_REVERSE_SUBTRACT multiply the
 * source and destination colors by source and destination factors and either add the two products together or subtract one from the other. This limited
 * set of operations supports many common blending operations but precludes the use of more sophisticated transparency and blending operations commonly
 * available in many dedicated imaging APIs.</p>
 * 
 * <p>This extension provides a number of new "advanced" blending equations. Unlike traditional blending operations using the FUNC_ADD equation, these
 * blending equations do not use source and destination factors specified by BlendFunc. Instead, each blend equation specifies a complete equation based
 * on the source and destination colors. These new blend equations are used for both RGB and alpha components; they may not be used to perform separate
 * RGB and alpha blending (via functions like BlendEquationSeparate).</p>
 * 
 * <p>These blending operations are performed using premultiplied colors, where RGB colors stored in the framebuffer are considered to be multiplied by alpha
 * (coverage). The fragment color may be considered premultiplied or non-premultiplied, according the BLEND_PREMULTIPLIED_SRC_NV blending parameter (as
 * specified by the new BlendParameteriNV function). If fragment color is considered non-premultiplied, the (R,G,B) color components are multiplied by the
 * alpha component prior to blending. For non-premultiplied color components in the range [0,1], the corresponding premultiplied color component would
 * have values in the range [0*A,1*A].</p>
 * 
 * <p>Many of these advanced blending equations are formulated where the result of blending source and destination colors with partial coverage have three
 * separate contributions: from the portions covered by both the source and the destination, from the portion covered only by the source, and from the
 * portion covered only by the destination. The blend parameter BLEND_OVERLAP_NV can be used to specify a correlation between source and destination pixel
 * coverage. If set to CONJOINT_NV, the source and destination are considered to have maximal overlap, as would be the case if drawing two objects on top
 * of each other. If set to DISJOINT_NV, the source and destination are considered to have minimal overlap, as would be the case when rendering a complex
 * polygon tessellated into individual non-intersecting triangles. If set to UNCORRELATED_NV (default), the source and destination coverage are assumed to
 * have no spatial correlation within the pixel.</p>
 * 
 * <p>In addition to the coherency issues on implementations not supporting NV_blend_equation_advanced_coherent, this extension has several limitations worth
 * noting. First, the new blend equations are not supported while rendering to more than one color buffer at once; an INVALID_OPERATION will be generated
 * if an application attempts to render any primitives in this unsupported configuration. Additionally, blending precision may be limited to 16-bit
 * floating-point, which could result in a loss of precision and dynamic range for framebuffer formats with 32-bit floating-point components, and in a
 * loss of precision for formats with 12- and 16-bit signed or unsigned normalized integer components.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public class NVBlendEquationAdvanced {

    static { GLES.initialize(); }

    /**
     * The BLEND_ADVANCED_COHERENT_NV enable is provided if and only if the NV_blend_equation_advanced_coherent extension is supported. On implementations
     * supporting only NV_blend_equation_advanced, this enable is considered not to exist. Accepted by the {@code pname} parameter of BlendParameteriNV,
     * GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.
     */
    public static final int
        GL_BLEND_PREMULTIPLIED_SRC_NV = 0x9280,
        GL_BLEND_OVERLAP_NV           = 0x9281;

    /** Accepted by the {@code value} parameter of BlendParameteriNV when {@code pname} is BLEND_OVERLAP_NV. */
    public static final int
        GL_UNCORRELATED_NV = 0x9282,
        GL_DISJOINT_NV     = 0x9283,
        GL_CONJOINT_NV     = 0x9284;

    /** Accepted by the {@code mode} parameter of BlendEquation and BlendEquationi. */
    public static final int
        GL_SRC_NV                = 0x9286,
        GL_DST_NV                = 0x9287,
        GL_SRC_OVER_NV           = 0x9288,
        GL_DST_OVER_NV           = 0x9289,
        GL_SRC_IN_NV             = 0x928A,
        GL_DST_IN_NV             = 0x928B,
        GL_SRC_OUT_NV            = 0x928C,
        GL_DST_OUT_NV            = 0x928D,
        GL_SRC_ATOP_NV           = 0x928E,
        GL_DST_ATOP_NV           = 0x928F,
        GL_XOR_NV                = 0x1506,
        GL_MULTIPLY_NV           = 0x9294,
        GL_SCREEN_NV             = 0x9295,
        GL_OVERLAY_NV            = 0x9296,
        GL_DARKEN_NV             = 0x9297,
        GL_LIGHTEN_NV            = 0x9298,
        GL_COLORDODGE_NV         = 0x9299,
        GL_COLORBURN_NV          = 0x929A,
        GL_HARDLIGHT_NV          = 0x929B,
        GL_SOFTLIGHT_NV          = 0x929C,
        GL_DIFFERENCE_NV         = 0x929E,
        GL_EXCLUSION_NV          = 0x92A0,
        GL_INVERT_RGB_NV         = 0x92A3,
        GL_LINEARDODGE_NV        = 0x92A4,
        GL_LINEARBURN_NV         = 0x92A5,
        GL_VIVIDLIGHT_NV         = 0x92A6,
        GL_LINEARLIGHT_NV        = 0x92A7,
        GL_PINLIGHT_NV           = 0x92A8,
        GL_HARDMIX_NV            = 0x92A9,
        GL_HSL_HUE_NV            = 0x92AD,
        GL_HSL_SATURATION_NV     = 0x92AE,
        GL_HSL_COLOR_NV          = 0x92AF,
        GL_HSL_LUMINOSITY_NV     = 0x92B0,
        GL_PLUS_NV               = 0x9291,
        GL_PLUS_CLAMPED_NV       = 0x92B1,
        GL_PLUS_CLAMPED_ALPHA_NV = 0x92B2,
        GL_PLUS_DARKER_NV        = 0x9292,
        GL_MINUS_NV              = 0x929F,
        GL_MINUS_CLAMPED_NV      = 0x92B3,
        GL_CONTRAST_NV           = 0x92A1,
        GL_INVERT_OVG_NV         = 0x92B4,
        GL_RED_NV                = 0x1903,
        GL_GREEN_NV              = 0x1904,
        GL_BLUE_NV               = 0x1905;

    protected NVBlendEquationAdvanced() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBlendParameteriNV ] ---

    public static native void glBlendParameteriNV(@NativeType("GLenum") int pname, @NativeType("GLint") int value);

    // --- [ glBlendBarrierNV ] ---

    public static native void glBlendBarrierNV();

}