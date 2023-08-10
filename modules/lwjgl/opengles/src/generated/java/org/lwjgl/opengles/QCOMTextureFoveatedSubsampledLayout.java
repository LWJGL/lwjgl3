/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/QCOM/QCOM_texture_foveated_subsampled_layout.txt">QCOM_texture_foveated_subsampled_layout</a> extension.
 * 
 * <p>This extension builds on {@link QCOMTextureFoveated QCOM_texture_foveated} by introducing a new foveation method bit that aims to reduce memory bandwidth by avoiding the
 * upscaling that occurred as part of the original extension.</p>
 * 
 * <p>With the original {@link QCOMTextureFoveated#GL_FOVEATION_SCALED_BIN_METHOD_BIT_QCOM FOVEATION_SCALED_BIN_METHOD_BIT_QCOM} foveation method, the render target in system memory is entirely populated. The lower
 * resolution framebuffer data is upscaled to fill the entire render target. The subsampled layout method introduced in this extension leaves the
 * framebuffer data at the calculated lower density and instead samples directly from the the lower resolution texels.</p>
 * 
 * <p>The primary usecase this is targeting is traditional VR pipeline. The application eye buffers would be rendered as textures with a subsampled layout
 * and then sampled by the warp process. Sampling from a texture with a subsampled layout requires a new sampler layout qualifier.</p>
 * 
 * <p>Requires {@link QCOMTextureFoveated QCOM_texture_foveated}.</p>
 */
public final class QCOMTextureFoveatedSubsampledLayout {

    /**
     * Accepted as a value to {@code param} for the {@code TexParameter{if}} and to {@code params} for the {@code TexParameter{if}v} commands with a
     * {@code pname} of {@link QCOMTextureFoveated#GL_TEXTURE_FOVEATED_FEATURE_BITS_QCOM TEXTURE_FOVEATED_FEATURE_BITS_QCOM} returned as possible values for {@code params} when {@code GetTexParameter{if}v} is queried with
     * a {@code pname} of {@link QCOMTextureFoveated#GL_TEXTURE_FOVEATED_FEATURE_BITS_QCOM TEXTURE_FOVEATED_FEATURE_BITS_QCOM}.
     */
    public static final int GL_FOVEATION_SUBSAMPLED_LAYOUT_METHOD_BIT_QCOM = 0x4;

    /** Accepted by the {@code value} parameter of {@link GLES20#glGetBooleanv GetBooleanv}, {@link GLES20#glGetIntegerv GetIntegerv}, {@link GLES30#glGetInteger64v GetInteger64v}, and {@link GLES20#glGetFloatv GetFloatv}. */
    public static final int GL_MAX_SHADER_SUBSAMPLED_IMAGE_UNITS_QCOM = 0x8FA1;

    private QCOMTextureFoveatedSubsampledLayout() {}

}