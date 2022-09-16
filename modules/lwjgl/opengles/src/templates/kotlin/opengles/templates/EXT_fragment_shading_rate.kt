/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_fragment_shading_rate = "EXTFragmentShadingRate".nativeClassGLES("EXT_fragment_shading_rate", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        By default, OpenGL runs a fragment shader once for each pixel covered by a primitive being rasterized. When using multisampling, the outputs of that
        fragment shader are broadcast to each covered sample of the fragment's pixel. When using multisampling, applications can optionally request that the
        fragment shader be run once per color sample (e.g., by using the "sample" qualifier on one or more active fragment shader inputs), or run a minimum
        number of times per pixel using #SAMPLE_SHADING enable and the #MinSampleShading() frequency value.

        This extension allows applications to specify fragment shading rates of less than 1 invocation per pixel. Instead of invoking the fragment shader once
        for each covered pixel, the fragment shader can be run once for a group of adjacent pixels in the framebuffer. The outputs of that fragment shader
        invocation are broadcast to each covered sample for all of the pixels in the group. The initial version of this extension allows for groups of 1, 2, 4,
        8, and 16 pixels.

        This can be useful for effects like motion volumetric rendering where a portion of scene is processed at full shading rate and a portion can be
        processed at a reduced shading rate, saving power and processing resources. The requested rate can vary from (finest and default) 1 fragment shader
        invocation per pixel to (coarsest) one fragment shader invocation for each 4x4 block of pixels.
        """

    IntConstant(
        "Accepted by the {@code attachment} parameter of #FramebufferShadingRateEXT() and #GetFramebufferAttachmentParameteriv().",

        "SHADING_RATE_ATTACHMENT_EXT"..0x96D1
    )

    IntConstant(
        "Allowed in the {@code rate} parameter in #ShadingRateEXT().",

        "SHADING_RATE_1X1_PIXELS_EXT"..0x96A6,
        "SHADING_RATE_1X2_PIXELS_EXT"..0x96A7,
        "SHADING_RATE_1X4_PIXELS_EXT"..0x96AA,
        "SHADING_RATE_2X1_PIXELS_EXT"..0x96A8,
        "SHADING_RATE_2X2_PIXELS_EXT"..0x96A9,
        "SHADING_RATE_2X4_PIXELS_EXT"..0x96AD,
        "SHADING_RATE_4X1_PIXELS_EXT"..0x96AB,
        "SHADING_RATE_4X2_PIXELS_EXT"..0x96AC,
        "SHADING_RATE_4X4_PIXELS_EXT"..0x96AE
    )

    IntConstant(
        "Accepted by the {@code combinerOp0} and {@code combinerOp1} parameters of #ShadingRateCombinerOpsEXT().",

        "FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_EXT"..0x96D2,
        "FRAGMENT_SHADING_RATE_COMBINER_OP_REPLACE_EXT"..0x96D3,
        "FRAGMENT_SHADING_RATE_COMBINER_OP_MIN_EXT"..0x96D4,
        "FRAGMENT_SHADING_RATE_COMBINER_OP_MAX_EXT"..0x96D5,
        "FRAGMENT_SHADING_RATE_COMBINER_OP_MUL_EXT"..0x96D6
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of #GetIntegerv(), #GetBooleanv(), #GetFloatv(), and #GetInteger64v().",

        "SHADING_RATE_EXT"..0x96D0,
        "MIN_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_WIDTH_EXT"..0x96D7,
        "MAX_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_WIDTH_EXT"..0x96D8,
        "MIN_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_HEIGHT_EXT"..0x96D9,
        "MAX_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_HEIGHT_EXT"..0x96DA,
        "MAX_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_ASPECT_RATIO_EXT"..0x96DB,
        "MAX_FRAGMENT_SHADING_RATE_ATTACHMENT_LAYERS_EXT"..0x96DC,
        "FRAGMENT_SHADING_RATE_WITH_SHADER_DEPTH_STENCIL_WRITES_SUPPORTED_EXT"..0x96DD,
        "FRAGMENT_SHADING_RATE_WITH_SAMPLE_MASK_SUPPORTED_EXT"..0x96DE,
        "FRAGMENT_SHADING_RATE_ATTACHMENT_WITH_DEFAULT_FRAMEBUFFER_SUPPORTED_EXT"..0x96DF,
        "FRAGMENT_SHADING_RATE_NON_TRIVIAL_COMBINERS_SUPPORTED_EXT"..0x8F6F
    )

    void(
        "ShadingRateEXT",
        "",

        GLenum("rate", "")
    )

    void(
        "ShadingRateCombinerOpsEXT",
        "",

        GLenum("combinerOp0", ""),
        GLenum("combinerOp1", "")
    )

    void(
        "FramebufferShadingRateEXT",
        "",

        GLenum("target", ""),
        GLenum("attachment", ""),
        GLuint("texture", ""),
        GLint("baseLayer", ""),
        GLsizei("numLayers", ""),
        GLsizei("texelWidth", ""),
        GLsizei("texelHeight", "")
    )

    void(
        "GetFragmentShadingRatesEXT",
        "",

        GLsizei("samples", ""),
        AutoSize("shadingRates")..GLsizei("maxCount", ""),
        Check(1)..GLsizei.p("count", ""),
        GLenum.p("shadingRates", "")
    )
}