/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class KHRBlendEquationAdvanced {

    static { GL.initialize(); }

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

    /** {@code void glBlendBarrierKHR(void)} */
    public static native void glBlendBarrierKHR();

}