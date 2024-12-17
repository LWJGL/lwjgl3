/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTFragmentShadingRate {

    static { GLES.initialize(); }

    public static final int GL_SHADING_RATE_ATTACHMENT_EXT = 0x96D1;

    public static final int
        GL_SHADING_RATE_1X1_PIXELS_EXT = 0x96A6,
        GL_SHADING_RATE_1X2_PIXELS_EXT = 0x96A7,
        GL_SHADING_RATE_1X4_PIXELS_EXT = 0x96AA,
        GL_SHADING_RATE_2X1_PIXELS_EXT = 0x96A8,
        GL_SHADING_RATE_2X2_PIXELS_EXT = 0x96A9,
        GL_SHADING_RATE_2X4_PIXELS_EXT = 0x96AD,
        GL_SHADING_RATE_4X1_PIXELS_EXT = 0x96AB,
        GL_SHADING_RATE_4X2_PIXELS_EXT = 0x96AC,
        GL_SHADING_RATE_4X4_PIXELS_EXT = 0x96AE;

    public static final int
        GL_FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_EXT    = 0x96D2,
        GL_FRAGMENT_SHADING_RATE_COMBINER_OP_REPLACE_EXT = 0x96D3,
        GL_FRAGMENT_SHADING_RATE_COMBINER_OP_MIN_EXT     = 0x96D4,
        GL_FRAGMENT_SHADING_RATE_COMBINER_OP_MAX_EXT     = 0x96D5,
        GL_FRAGMENT_SHADING_RATE_COMBINER_OP_MUL_EXT     = 0x96D6;

    public static final int
        GL_SHADING_RATE_EXT                                                        = 0x96D0,
        GL_MIN_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_WIDTH_EXT                    = 0x96D7,
        GL_MAX_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_WIDTH_EXT                    = 0x96D8,
        GL_MIN_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_HEIGHT_EXT                   = 0x96D9,
        GL_MAX_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_HEIGHT_EXT                   = 0x96DA,
        GL_MAX_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_ASPECT_RATIO_EXT             = 0x96DB,
        GL_MAX_FRAGMENT_SHADING_RATE_ATTACHMENT_LAYERS_EXT                         = 0x96DC,
        GL_FRAGMENT_SHADING_RATE_WITH_SHADER_DEPTH_STENCIL_WRITES_SUPPORTED_EXT    = 0x96DD,
        GL_FRAGMENT_SHADING_RATE_WITH_SAMPLE_MASK_SUPPORTED_EXT                    = 0x96DE,
        GL_FRAGMENT_SHADING_RATE_ATTACHMENT_WITH_DEFAULT_FRAMEBUFFER_SUPPORTED_EXT = 0x96DF,
        GL_FRAGMENT_SHADING_RATE_NON_TRIVIAL_COMBINERS_SUPPORTED_EXT               = 0x8F6F;

    protected EXTFragmentShadingRate() {
        throw new UnsupportedOperationException();
    }

    // --- [ glShadingRateEXT ] ---

    /** {@code void glShadingRateEXT(GLenum rate)} */
    public static native void glShadingRateEXT(@NativeType("GLenum") int rate);

    // --- [ glShadingRateCombinerOpsEXT ] ---

    /** {@code void glShadingRateCombinerOpsEXT(GLenum combinerOp0, GLenum combinerOp1)} */
    public static native void glShadingRateCombinerOpsEXT(@NativeType("GLenum") int combinerOp0, @NativeType("GLenum") int combinerOp1);

    // --- [ glFramebufferShadingRateEXT ] ---

    /** {@code void glFramebufferShadingRateEXT(GLenum target, GLenum attachment, GLuint texture, GLint baseLayer, GLsizei numLayers, GLsizei texelWidth, GLsizei texelHeight)} */
    public static native void glFramebufferShadingRateEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int baseLayer, @NativeType("GLsizei") int numLayers, @NativeType("GLsizei") int texelWidth, @NativeType("GLsizei") int texelHeight);

    // --- [ glGetFragmentShadingRatesEXT ] ---

    /** {@code void glGetFragmentShadingRatesEXT(GLsizei samples, GLsizei maxCount, GLsizei * count, GLenum * shadingRates)} */
    public static native void nglGetFragmentShadingRatesEXT(int samples, int maxCount, long count, long shadingRates);

    /** {@code void glGetFragmentShadingRatesEXT(GLsizei samples, GLsizei maxCount, GLsizei * count, GLenum * shadingRates)} */
    public static void glGetFragmentShadingRatesEXT(@NativeType("GLsizei") int samples, @NativeType("GLsizei *") IntBuffer count, @NativeType("GLenum *") IntBuffer shadingRates) {
        if (CHECKS) {
            check(count, 1);
        }
        nglGetFragmentShadingRatesEXT(samples, shadingRates.remaining(), memAddress(count), memAddress(shadingRates));
    }

    /** {@code void glGetFragmentShadingRatesEXT(GLsizei samples, GLsizei maxCount, GLsizei * count, GLenum * shadingRates)} */
    public static void glGetFragmentShadingRatesEXT(@NativeType("GLsizei") int samples, @NativeType("GLsizei *") int[] count, @NativeType("GLenum *") int[] shadingRates) {
        long __functionAddress = GLES.getICD().glGetFragmentShadingRatesEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(count, 1);
        }
        callPPV(samples, shadingRates.length, count, shadingRates, __functionAddress);
    }

}