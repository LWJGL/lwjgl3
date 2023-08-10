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

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_fragment_shading_rate.txt">EXT_fragment_shading_rate</a> extension.
 * 
 * <p>By default, OpenGL runs a fragment shader once for each pixel covered by a primitive being rasterized. When using multisampling, the outputs of that
 * fragment shader are broadcast to each covered sample of the fragment's pixel. When using multisampling, applications can optionally request that the
 * fragment shader be run once per color sample (e.g., by using the "sample" qualifier on one or more active fragment shader inputs), or run a minimum
 * number of times per pixel using {@link GLES32#GL_SAMPLE_SHADING SAMPLE_SHADING} enable and the {@link GLES32#glMinSampleShading MinSampleShading} frequency value.</p>
 * 
 * <p>This extension allows applications to specify fragment shading rates of less than 1 invocation per pixel. Instead of invoking the fragment shader once
 * for each covered pixel, the fragment shader can be run once for a group of adjacent pixels in the framebuffer. The outputs of that fragment shader
 * invocation are broadcast to each covered sample for all of the pixels in the group. The initial version of this extension allows for groups of 1, 2, 4,
 * 8, and 16 pixels.</p>
 * 
 * <p>This can be useful for effects like motion volumetric rendering where a portion of scene is processed at full shading rate and a portion can be
 * processed at a reduced shading rate, saving power and processing resources. The requested rate can vary from (finest and default) 1 fragment shader
 * invocation per pixel to (coarsest) one fragment shader invocation for each 4x4 block of pixels.</p>
 */
public class EXTFragmentShadingRate {

    static { GLES.initialize(); }

    /** Accepted by the {@code attachment} parameter of {@link #glFramebufferShadingRateEXT FramebufferShadingRateEXT} and {@link GLES20#glGetFramebufferAttachmentParameteriv GetFramebufferAttachmentParameteriv}. */
    public static final int GL_SHADING_RATE_ATTACHMENT_EXT = 0x96D1;

    /** Allowed in the {@code rate} parameter in {@link #glShadingRateEXT ShadingRateEXT}. */
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

    /** Accepted by the {@code combinerOp0} and {@code combinerOp1} parameters of {@link #glShadingRateCombinerOpsEXT ShadingRateCombinerOpsEXT}. */
    public static final int
        GL_FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_EXT    = 0x96D2,
        GL_FRAGMENT_SHADING_RATE_COMBINER_OP_REPLACE_EXT = 0x96D3,
        GL_FRAGMENT_SHADING_RATE_COMBINER_OP_MIN_EXT     = 0x96D4,
        GL_FRAGMENT_SHADING_RATE_COMBINER_OP_MAX_EXT     = 0x96D5,
        GL_FRAGMENT_SHADING_RATE_COMBINER_OP_MUL_EXT     = 0x96D6;

    /** Accepted by the {@code pname} parameter of {@link GLES20#glGetIntegerv GetIntegerv}, {@link GLES20#glGetBooleanv GetBooleanv}, {@link GLES20#glGetFloatv GetFloatv}, and {@link GLES30#glGetInteger64v GetInteger64v}. */
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

    public static native void glShadingRateEXT(@NativeType("GLenum") int rate);

    // --- [ glShadingRateCombinerOpsEXT ] ---

    public static native void glShadingRateCombinerOpsEXT(@NativeType("GLenum") int combinerOp0, @NativeType("GLenum") int combinerOp1);

    // --- [ glFramebufferShadingRateEXT ] ---

    public static native void glFramebufferShadingRateEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int baseLayer, @NativeType("GLsizei") int numLayers, @NativeType("GLsizei") int texelWidth, @NativeType("GLsizei") int texelHeight);

    // --- [ glGetFragmentShadingRatesEXT ] ---

    public static native void nglGetFragmentShadingRatesEXT(int samples, int maxCount, long count, long shadingRates);

    public static void glGetFragmentShadingRatesEXT(@NativeType("GLsizei") int samples, @NativeType("GLsizei *") IntBuffer count, @NativeType("GLenum *") IntBuffer shadingRates) {
        if (CHECKS) {
            check(count, 1);
        }
        nglGetFragmentShadingRatesEXT(samples, shadingRates.remaining(), memAddress(count), memAddress(shadingRates));
    }

    /** Array version of: {@link #glGetFragmentShadingRatesEXT GetFragmentShadingRatesEXT} */
    public static void glGetFragmentShadingRatesEXT(@NativeType("GLsizei") int samples, @NativeType("GLsizei *") int[] count, @NativeType("GLenum *") int[] shadingRates) {
        long __functionAddress = GLES.getICD().glGetFragmentShadingRatesEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(count, 1);
        }
        callPPV(samples, shadingRates.length, count, shadingRates, __functionAddress);
    }

}