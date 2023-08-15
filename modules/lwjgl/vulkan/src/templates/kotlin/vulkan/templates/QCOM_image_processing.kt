/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val QCOM_image_processing = "QCOMImageProcessing".nativeClassVK("QCOM_image_processing", type = "device", postfix = "QCOM") {
    documentation =
        """
        GPUs are commonly used to process images for various applications from 3D graphics to UI and from composition to compute applications. Simple scaling and filtering can be done with bilinear filtering, which comes for free during texture sampling. However, as screen sizes get larger and more use cases rely on GPU such as camera and video post-processing needs, there is increasing demand for GPU to support higher order filtering and other advanced image processing.

        This extension introduces a new set of SPIR-V built-in functions for image processing. It exposes the following new imaging operations

        <ul>
            <li>The {@code OpImageSampleWeightedQCOM} instruction takes 3 operands: <em>sampled image</em>, <em>weight image</em>, and texture coordinates. The instruction computes a weighted average of an MxN region of texels in the <em>sampled image</em>, using a set of MxN weights in the <em>weight image</em>.</li>
            <li>The {@code OpImageBoxFilterQCOM} instruction takes 3 operands: <em>sampled image</em>, <em>box size</em>, and texture coordinates. Note that <em>box size</em> specifies a floating point width and height in texels. The instruction computes a weighted average of all texels in the <em>sampled image</em> that are covered (either partially or fully) by a box with the specified size and centered at the specified texture coordinates.</li>
            <li>The {@code OpImageBlockMatchSADQCOM} and {@code OpImageBlockMatchSSDQCOM} instructions each takes 5 operands: <em>target image</em>, <em>target coordinates</em>, <em>reference image</em>, <em>reference coordinates</em>, and <em>block size</em>. Each instruction computes an error metric, that describes whether a block of texels in the <em>target image</em> matches a corresponding block of texels in the <em>reference image</em>. The error metric is computed per-component. {@code OpImageBlockMatchSADQCOM} computes "Sum Of Absolute Difference" and {@code OpImageBlockMatchSSDQCOM} computes "Sum of Squared Difference".</li>
        </ul>

        Each of the image processing instructions operate only on 2D images. The instructions do not-support sampling of mipmap, multi-plane, multi-layer, multi-sampled, or depth/stencil images. The instructions can be used in any shader stage.

        Implementations of this this extension should support these operations natively at the HW instruction level, offering potential performance gains as well as ease of development.

        <h5>VK_QCOM_image_processing</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_QCOM_image_processing}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>441</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRFormatFeatureFlags2 VK_KHR_format_feature_flags2}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jeff Leger <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_QCOM_image_processing]%20@jackohound%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_QCOM_image_processing%20extension*">jackohound</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_QCOM_image_processing.adoc">VK_QCOM_image_processing</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2022-07-08</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires <a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/QCOM/SPV_QCOM_image_processing.html">{@code SPV_QCOM_image_processing}</a></li>
                <li>This extension provides API support for <a href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/qcom/GLSL_QCOM_image_processing.txt">{@code GL_QCOM_image_processing}</a></li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Leger, Qualcomm Technologies, Inc.</li>
                <li>Ruihao Zhang, Qualcomm Technologies, Inc.</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "QCOM_IMAGE_PROCESSING_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "QCOM_IMAGE_PROCESSING_EXTENSION_NAME".."VK_QCOM_image_processing"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_FEATURES_QCOM".."1000440000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_PROPERTIES_QCOM".."1000440001",
        "STRUCTURE_TYPE_IMAGE_VIEW_SAMPLE_WEIGHT_CREATE_INFO_QCOM".."1000440002"
    )

    EnumConstant(
        "Extends {@code VkSamplerCreateFlagBits}.",

        "SAMPLER_CREATE_IMAGE_PROCESSING_BIT_QCOM".enum(0x00000010)
    )

    EnumConstant(
        "Extends {@code VkImageUsageFlagBits}.",

        "IMAGE_USAGE_SAMPLE_WEIGHT_BIT_QCOM".enum(0x00100000),
        "IMAGE_USAGE_SAMPLE_BLOCK_MATCH_BIT_QCOM".enum(0x00200000)
    )

    EnumConstant(
        "Extends {@code VkDescriptorType}.",

        "DESCRIPTOR_TYPE_SAMPLE_WEIGHT_IMAGE_QCOM".."1000440000",
        "DESCRIPTOR_TYPE_BLOCK_MATCH_IMAGE_QCOM".."1000440001"
    )

    EnumConstantLong(
        "Extends {@code VkFormatFeatureFlagBits2}.",

        "FORMAT_FEATURE_2_WEIGHT_IMAGE_BIT_QCOM".enum(0x400000000L),
        "FORMAT_FEATURE_2_WEIGHT_SAMPLED_IMAGE_BIT_QCOM".enum(0x800000000L),
        "FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM".enum(0x1000000000L),
        "FORMAT_FEATURE_2_BOX_FILTER_SAMPLED_BIT_QCOM".enum(0x2000000000L)
    )
}