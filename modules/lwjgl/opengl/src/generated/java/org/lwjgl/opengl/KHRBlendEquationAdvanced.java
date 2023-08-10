/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/KHR/KHR_blend_equation_advanced.txt">KHR_blend_equation_advanced</a> extension.
 * 
 * <p>This extension adds a number of "advanced" blending equations that can be used to perform new color blending operations, many of which are more complex
 * than the standard blend modes provided by unextended OpenGL. This extension provides two different extension string entries:</p>
 * 
 * <ul>
 * <li><b>KHR_blend_equation_advanced</b>:Provides the new blending equations, but guarantees defined results only if each sample is touched no more than
 * once in any single rendering pass. The command {@link #glBlendBarrierKHR BlendBarrierKHR} is provided to indicate a boundary between passes.</li>
 * <li>{@link KHRBlendEquationAdvancedCoherent KHR_blend_equation_advanced_coherent}: Provides the new blending equations, and guarantees that blending is
 * done coherently and in API primitive order. An enable is provided to allow implementations to opt out of fully coherent blending and instead behave
 * as though only KHR_blend_equation_advanced were supported.</li>
 * </ul>
 * 
 * <p>Some implementations may support KHR_blend_equation_advanced without supporting KHR_blend_equation_advanced_coherent.</p>
 * 
 * <p>In unextended OpenGL, the set of blending equations is limited, and can be expressed very simply. The {@link GL14#GL_MIN MIN} and {@link GL14#GL_MAX MAX} blend equations
 * simply compute component-wise minimums or maximums of source and destination color components. The {@link GL14#GL_FUNC_ADD FUNC_ADD}, {@link GL14#GL_FUNC_SUBTRACT FUNC_SUBTRACT}, and
 * {@link GL14#GL_FUNC_REVERSE_SUBTRACT FUNC_REVERSE_SUBTRACT} multiply the source and destination colors by source and destination factors and either add the two products together
 * or subtract one from the other. This limited set of operations supports many common blending operations but precludes the use of more sophisticated
 * transparency and blending operations commonly available in many dedicated imaging APIs.</p>
 * 
 * <p>This extension provides a number of new "advanced" blending equations. Unlike traditional blending operations using the {@link GL14#GL_FUNC_ADD FUNC_ADD} equation,
 * these blending equations do not use source and destination factors specified by {@link GL11C#glBlendFunc BlendFunc}. Instead, each blend equation specifies a complete
 * equation based on the source and destination colors. These new blend equations are used for both RGB and alpha components; they may not be used to
 * perform separate RGB and alpha blending (via functions like {@link GL20C#glBlendEquationSeparate BlendEquationSeparate}).</p>
 * 
 * <p>These blending operations are performed using premultiplied source and destination colors, where RGB colors produced by the fragment shader and stored
 * in the framebuffer are considered to be multiplied by alpha (coverage). Many of these advanced blending equations are formulated where the result of
 * blending source and destination colors with partial coverage have three separate contributions: from the portions covered by both the source and the
 * destination, from the portion covered only by the source, and from the portion covered only by the destination. Such equations are defined assuming that
 * the source and destination coverage have no spatial correlation within the pixel.</p>
 * 
 * <p>In addition to the coherency issues on implementations not supporting KHR_blend_equation_advanced_coherent, this extension has several limitations worth
 * noting. First, the new blend equations are not supported while rendering to more than one color buffer at once; an {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} will be
 * generated if an application attempts to render any primitives in this unsupported configuration. Additionally, blending precision may be limited to
 * 16-bit floating-point, which could result in a loss of precision and dynamic range for framebuffer formats with 32-bit floating-point components, and in
 * a loss of precision for formats with 12- and 16-bit signed or unsigned normalized integer components.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0}.</p>
 */
public class KHRBlendEquationAdvanced {

    static { GL.initialize(); }

    /** Accepted by the {@code mode} parameter of BlendEquation and BlendEquationi. */
    public static final int
        GL_MULTIPLY_KHR       = 0x9294,
        GL_SCREEN_KHR         = 0x9295,
        GL_OVERLAY_KHR        = 0x9296,
        GL_DARKEN_KHR         = 0x9297,
        GL_LIGHTEN_KHR        = 0x9298,
        GL_COLORDODGE_KHR     = 0x9299,
        GL_COLORBURN_KHR      = 0x929A,
        GL_HARDLIGHT_KHR      = 0x929B,
        GL_SOFTLIGHT_KHR      = 0x929C,
        GL_DIFFERENCE_KHR     = 0x929E,
        GL_EXCLUSION_KHR      = 0x92A0,
        GL_HSL_HUE_KHR        = 0x92AD,
        GL_HSL_SATURATION_KHR = 0x92AE,
        GL_HSL_COLOR_KHR      = 0x92AF,
        GL_HSL_LUMINOSITY_KHR = 0x92B0;

    protected KHRBlendEquationAdvanced() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBlendBarrierKHR ] ---

    /**
     * Specifies a boundary between passes when using advanced blend equations.
     * 
     * <p>When using advanced blending equations, applications should split their rendering into a collection of blending passes, none of which touch an
     * individual sample in the framebuffer more than once. The results of blending are undefined if the sample being blended has been touched previously in
     * the same pass. Any command that causes the value of a sample to be modified using the framebuffer is considered to touch the sample, including clears,
     * blended or unblended primitives, and {@link GL30C#glBlitFramebuffer BlitFramebuffer} copies.</p>
     */
    public static native void glBlendBarrierKHR();

}