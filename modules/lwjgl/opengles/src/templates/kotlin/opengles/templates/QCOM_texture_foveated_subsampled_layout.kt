/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val QCOM_texture_foveated_subsampled_layout = "QCOMTextureFoveatedSubsampledLayout".nativeClassGLES("QCOM_texture_foveated_subsampled_layout", postfix = QCOM) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension builds on ${QCOM_texture_foveated.link} by introducing a new foveation method bit that aims to reduce memory bandwidth by avoiding the
        upscaling that occurred as part of the original extension.

        With the original #FOVEATION_SCALED_BIN_METHOD_BIT_QCOM foveation method, the render target in system memory is entirely populated. The lower
        resolution framebuffer data is upscaled to fill the entire render target. The subsampled layout method introduced in this extension leaves the
        framebuffer data at the calculated lower density and instead samples directly from the the lower resolution texels.

        The primary usecase this is targeting is traditional VR pipeline. The application eye buffers would be rendered as textures with a subsampled layout
        and then sampled by the warp process. Sampling from a texture with a subsampled layout requires a new sampler layout qualifier.

        Requires ${QCOM_texture_foveated.link}.
        """

    IntConstant(
        """
        Accepted as a value to {@code param} for the {@code TexParameter{if}} and to {@code params} for the {@code TexParameter{if}v} commands with a
        {@code pname} of #TEXTURE_FOVEATED_FEATURE_BITS_QCOM returned as possible values for {@code params} when {@code GetTexParameter{if}v} is queried with
        a {@code pname} of #TEXTURE_FOVEATED_FEATURE_BITS_QCOM.
        """,

        "FOVEATION_SUBSAMPLED_LAYOUT_METHOD_BIT_QCOM"..0x4
    )

    IntConstant(
        "Accepted by the {@code value} parameter of #GetBooleanv(), #GetIntegerv(), #GetInteger64v(), and #GetFloatv().",

        "MAX_SHADER_SUBSAMPLED_IMAGE_UNITS_QCOM"..0x8FA1
    )

}