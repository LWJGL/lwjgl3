/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val QCOM_image_processing2 = "QCOMImageProcessing2".nativeClassVK("QCOM_image_processing2", type = "device", postfix = "QCOM") {
    documentation =
        """
        This extension enables support for the SPIR-V {@code TextureBlockMatch2QCOM} capability. It builds on the functionality of QCOM_image_processing with the addition of 4 new image processing operations.

        <ul>
            <li>The {@code opImageBlockMatchWindowSADQCOM}` SPIR-V instruction builds upon the functionality of {@code opImageBlockMatchSADQCOM}` by repeatedly performing block match operations across a 2D window. The “2D windowExtent” and “compareMode” are are specified by ##VkSamplerBlockMatchWindowCreateInfoQCOM in the sampler used to create the <em>target image</em>. Like {@code OpImageBlockMatchSADQCOM}, {@code opImageBlockMatchWindowSADQCOM} computes an error metric, that describes whether a block of texels in the <em>target image</em> matches a corresponding block of texels in the <em>reference image</em>. Unlike {@code OpImageBlockMatchSADQCOM}, this instruction computes an error metric at each (X,Y) location within the 2D window and returns either the minimum or maximum error. The instruction only supports single-component formats. Refer to the pseudocode below for details.</li>
            <li>The {@code opImageBlockMatchWindowSSDQCOM} follows the same pattern, computing the SSD error metric at each location within the 2D window.</li>
            <li>The {@code opImageBlockMatchGatherSADQCOM} builds upon {@code OpImageBlockMatchSADQCOM}. This instruction computes an error metric, that describes whether a block of texels in the <em>target image</em> matches a corresponding block of texels in the <em>reference image</em>. The instruction computes the SAD error metric at 4 texel offsets and returns the error metric for each offset in the X,Y,Z,and W components. The instruction only supports single-component texture formats. Refer to the pseudocode below for details.</li>
            <li>The {@code opImageBlockMatchGatherSSDQCOM} follows the same pattern, computing the SSD error metric for 4 offsets.</li>
        </ul>

        Each of the above 4 image processing instructions are limited to single-component formats.

        Below is the pseudocode for GLSL built-in function {@code textureWindowBlockMatchSADQCOM}. The pseudocode for {@code textureWindowBlockMatchSSD} is identical other than replacing all instances of {@code "SAD"} with {@code "SSD"}.

        <pre><code>
￿vec4 textureBlockMatchWindowSAD( sampler2D target,
￿                                 uvec2 targetCoord,
￿                                 samler2D reference,
￿                                 uvec2 refCoord,
￿                                 uvec2 blocksize) {
￿    // compareMode (MIN or MAX) comes from the vkSampler associated with `target`
￿    // uvec2 window  comes from the vkSampler associated with `target`
￿    minSAD = INF;
￿    maxSAD = -INF;
￿    uvec2 minCoord;
￿    uvec2 maxCoord;
￿
￿    for (uint x=0, x &lt; window.width; x++) {
￿        for (uint y=0; y &lt; window.height; y++) {
￿            float SAD = textureBlockMatchSAD(target,
￿                                            targetCoord + uvec2(x, y),
￿                                            reference,
￿                                            refCoord,
￿                                            blocksize).x;
￿            // Note: the below comparison operator will produce undefined results
￿            // if SAD is a denorm value.
￿            if (SAD &lt; minSAD) {
￿                minSAD = SAD;
￿                minCoord = uvec2(x,y);
￿            }
￿            if (SAD &gt; maxSAD) {
￿                maxSAD = SAD;
￿                maxCoord = uvec2(x,y);
￿            }
￿        }
￿    }
￿    if (compareMode=MIN) {
￿        return vec4(minSAD, minCoord.x, minCoord.y, 0.0);
￿    } else {
￿        return vec4(maxSAD, maxCoord.x, maxCoord.y, 0.0);
￿    }
￿}</code></pre>

        Below is the pseudocode for {@code textureBlockMatchGatherSADQCOM}. The pseudocode for {@code textureBlockMatchGatherSSD} follows an identical pattern.

        <pre><code>
￿vec4 textureBlockMatchGatherSAD( sampler2D target,
￿                                 uvec2 targetCoord,
￿                                 samler2D reference,
￿                                 uvec2 refCoord,
￿                                 uvec2 blocksize) {
￿    vec4 out;
￿    for (uint x=0, x&lt;4; x++) {
￿            float SAD = textureBlockMatchSAD(target,
￿                                            targetCoord + uvec2(x, 0),
￿                                            reference,
￿                                            refCoord,
￿                                            blocksize).x;
￿            out[x] = SAD;
￿    }
￿    return out;
￿}</code></pre>

        <h5>VK_QCOM_image_processing2</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_QCOM_image_processing2}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>519</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link QCOMImageProcessing VK_QCOM_image_processing}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jeff Leger <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_QCOM_image_processing2]%20@jackohound%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_QCOM_image_processing2%20extension*">jackohound</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-03-10</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires <a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/QCOM/SPV_QCOM_image_processing.html">{@code SPV_QCOM_image_processing2}</a></li>
                <li>This extension provides API support for <a href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/qcom/GLSL_QCOM_image_processing2.txt">{@code GL_QCOM_image_processing2}</a></li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Leger, Qualcomm Technologies, Inc.</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "QCOM_IMAGE_PROCESSING_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "QCOM_IMAGE_PROCESSING_2_EXTENSION_NAME".."VK_QCOM_image_processing2"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_2_FEATURES_QCOM".."1000518000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_2_PROPERTIES_QCOM".."1000518001",
        "STRUCTURE_TYPE_SAMPLER_BLOCK_MATCH_WINDOW_CREATE_INFO_QCOM".."1000518002"
    )

    EnumConstant(
        """
        VkBlockMatchWindowCompareModeQCOM - Block match window compare modes

        <h5>Description</h5>
        <ul>
            <li>#BLOCK_MATCH_WINDOW_COMPARE_MODE_MIN_QCOM specifies that windowed block match operations return the minimum error within the window.</li>
            <li>#BLOCK_MATCH_WINDOW_COMPARE_MODE_MAX_QCOM specifies that windowed block match operations return the maximum error within the window.</li>
        </ul>

        <h5>See Also</h5>
        ##VkSamplerBlockMatchWindowCreateInfoQCOM
        """,

        "BLOCK_MATCH_WINDOW_COMPARE_MODE_MIN_QCOM".."0",
        "BLOCK_MATCH_WINDOW_COMPARE_MODE_MAX_QCOM".."1"
    )
}